package examapp.dao;

import java.util.List;

import examapp.domain.Board;

public interface BoardDao {
	List<Board> selectList();
	int insert(Board board);
	Board selectOne(int no);
}
