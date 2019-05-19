package com.example.blogs.domain;

import java.util.List;

public interface ReplyDao {

    List<Reply> queryUserid(String userid);

    int addReply(Reply reply);

    int deleteReply(Reply reply);

    int updateReply(Reply reply);
}
