package cn.itrip.service.hotelcomment;

import cn.itrip.beans.pojo.Comment;
import cn.itrip.dao.comment.CommentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HotelCommentServiceImpl implements HotelCommentService {
    @Resource
    private CommentMapper commentMapper;

    @Override
    public boolean addHotelComment(Comment comment)throws Exception {
        return commentMapper.insertSelective(comment)>0;
    }
}