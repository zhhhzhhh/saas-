package org.example.project.dto.req;

import lombok.Data;

/**
 * 回收站管理恢复实体类
 */
@Data
public class RecycleBinRecoverReqDTO {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 完整短链接
     */
    private String fullShortUrl;
}
