package com.example.MyBlog.service;

import com.example.MyBlog.domain.Vote;

public interface VoteService {

    Vote getVoteById(Long id);
    void removeVote(Long id);
}
