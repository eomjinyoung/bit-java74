package examapp.control;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import examapp.dao.BoardDao;
import examapp.domain.Board;

@Controller
@RequestMapping("/board")
public class PageController01 {
	@Autowired BoardDao boardDao;
	
	
	@RequestMapping(value="/list1")
	public String list1(Model model) {
		List<Board> list = boardDao.selectList();
		model.addAttribute("list", list);
		
		return "board/list1";
	}
	
	@RequestMapping(value="/json/list2")
	public Object list2() {
		HashMap<String,Object> map = new HashMap<>();
		map.put("v1", "test..ok");
		map.put("v2", "한글 깨짐..");
		
		List<Board> list = boardDao.selectList();
		map.put("list",  list);
		
		return map;
	}
	
}







