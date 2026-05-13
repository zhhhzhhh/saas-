package org.example.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.admin.dao.entity.GroupDO;
import org.example.admin.dto.req.ShortLinkGroupSortReqDTO;
import org.example.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import org.example.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * 短链接分组接口层
 */
public interface GroupService extends IService<GroupDO> {
    /**
     * 新增短链接分组
     */
    void saveGroup(String groupName);


    void saveGroup(String username, String groupName);

    /**
     * 查询分组集合
     *
     * @return
     */
    List<ShortLinkGroupRespDTO> listGroup();

    /**
     * 修改分组名
     *
     * @param requestParam
     */
    void updateGroup(ShortLinkGroupUpdateReqDTO requestParam);

    /**
     * 删除分组功能
     */
    void deleteGroup(String gid);

    /**
     * 排序短链接分组
     *
     * @param requestParam
     */
    void sortGroup(List<ShortLinkGroupSortReqDTO> requestParam);
}
