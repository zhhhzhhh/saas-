package org.example.admin.dto.resp;

import lombok.Data;

/**
 * 短链接数量返回参数
 */
@Data
public class ShortLinkGroupCountRespDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 短链接数量
     */
    private Integer shortLinkCount;
}
