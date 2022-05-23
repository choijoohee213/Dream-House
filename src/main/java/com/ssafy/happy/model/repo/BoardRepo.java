package com.ssafy.happy.model.repo;

import com.ssafy.happy.dto.Board;
import com.ssafy.happy.dto.SearchCondition;

import java.util.List;

public interface BoardRepo {
    boolean insert(Board boardNo);
    boolean update(Board boardNo);
    boolean delete(int articleNo);
    Board select(int articleNo);
    List<Board> search(SearchCondition condition);
    void increaseHit(int articleNo);
    int getTotalSearchCount(SearchCondition condition);
}
