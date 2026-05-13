package org.example.admin.dto.req;

import lombok.Data;

@Data
public class ShortLinkGroupSortReqDTO {

    /**
     * 短链接标识
     */
    private String gid;

    /**
     * 排序
     */
    private Integer sortOrder;
}
