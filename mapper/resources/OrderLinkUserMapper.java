package cn.auth.dao;

public interface OrderLinkUserMapper {





    //以下是自动生成CURD
    int deleteByPrimaryKey(Long id);

    int insert(OrderLinkUser record);

    int insertSelective(OrderLinkUser record);

    OrderLinkUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderLinkUser record);

    int updateByPrimaryKey(OrderLinkUser record);
}