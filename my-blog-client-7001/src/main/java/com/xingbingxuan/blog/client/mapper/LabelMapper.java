package com.xingbingxuan.blog.client.mapper;

import com.xingbingxuan.blog.client.entity.LabelEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author : xbx
 * @date : 2022/4/21 20:34
 */
@Mapper
public interface LabelMapper {

    public List<LabelEntity> selectAll();

    public List<LabelEntity> selectAllByBlogId(Integer blogId);
}
