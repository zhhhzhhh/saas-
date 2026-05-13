package org.example.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.admin.common.convention.result.Result;
import org.example.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import org.example.admin.remote.dto.resp.ShortLinkPageRespDTO;

/**
 * URL 回收站接口层
 */
public interface RecycleBinService {
    /**
     * 分页查询回收站短链接
     *
     * @param requestParam
     * @return
     */
    Result<Page<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam);
}
