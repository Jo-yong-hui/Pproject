package ybc.spring.mvc.service;

import ybc.spring.mvc.vo.Board;
import ybc.spring.mvc.vo.Reple;

import java.util.List;

public interface BoardService {

    boolean newBoard(Board b);
    boolean modifyBoard(Board b);
    boolean removeBoard(String bdno);

    List<Board> readBoard(String cp);
    List<Board> readBoard(String cp, String ftype, String fkey);
    Board readOneBoard(String bdno);

    int countBoard();
    int countBoard(String ftype, String fkey);
    boolean viewCountBoard(String bdno);

    void thumbsBoard(String bdno);

    List<Board> readThumbsBoard(String cp);
    List<Board> readViewBoard(String cp);
}
