package hnu.mapper;

import hnu.entity.BuildInfo;
import hnu.mapper.provider.BuildInfoProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * Created by zhangcanhui on 2018/5/23.
 */
@Mapper
public interface BuildInfoMapper {
    @SelectProvider(type = BuildInfoProvider.class,method ="selectBuildInfo" )
    List<BuildInfo> selectBuildInfo(Integer buildno, Integer buildcount, Integer familynum, Integer floornum, String buildname);

    @Insert("insert into buildinfo(buildname,floornum,familynumeachfloor) values(#{buildname},#{floornum},#{familynumeachfloor})")
    Integer insertBuildInfo(BuildInfo buildInfo);
}
