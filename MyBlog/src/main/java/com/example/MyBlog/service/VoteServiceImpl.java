package com.example.MyBlog.service;

import com.example.MyBlog.domain.Vote;
import com.example.MyBlog.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class VoteServiceImpl implements VoteService{

    @Autowired
    private VoteRepository voteRepository;

    @Override
    @Transactional
    public void removeVote(Long id) {
        voteRepository.deleteById(id);
    }

    @Override
    public Vote getVoteById(Long id) {
        return voteRepository.findById(id).orElse(null);
    }
}
