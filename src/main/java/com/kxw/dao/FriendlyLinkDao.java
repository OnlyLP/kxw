package com.kxw.dao;

import com.kxw.pojo.FriendlyLink;
import com.kxw.pojo.FriendlyLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendlyLinkDao {
    int countByExample(FriendlyLinkExample example);

    int deleteByExample(FriendlyLinkExample example);

    int deleteByPrimaryKey(Short linkId);

    int insert(FriendlyLink record);

    int insertSelective(FriendlyLink record);

    List<FriendlyLink> selectByExample(FriendlyLinkExample example);

    FriendlyLink selectByPrimaryKey(Short linkId);

    int updateByExampleSelective(@Param("record") FriendlyLink record, @Param("example") FriendlyLinkExample example);

    int updateByExample(@Param("record") FriendlyLink record, @Param("example") FriendlyLinkExample example);

    int updateByPrimaryKeySelective(FriendlyLink record);

    int updateByPrimaryKey(FriendlyLink record);
}