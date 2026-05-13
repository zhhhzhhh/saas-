package org.example.admin.remote.dto.req;

import lombok.Data;

/**
 * 回收站管理删除实体类
 */
@Data
public class RecycleBinRemoveReqDTO {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 完整短链接
     */
    private String fullShortUrl;
}
