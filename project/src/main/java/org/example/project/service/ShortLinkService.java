package org.example.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import org.example.project.dao.entity.ShortLinkDO;
import org.example.project.dto.biz.ShortLinkStatsRecordDTO;
import org.example.project.dto.req.ShortLinkBatchCreateReqDTO;
import org.example.project.dto.req.ShortLinkCreateReqDTO;
import org.example.project.dto.req.ShortLinkPageReqDTO;
import org.example.project.dto.req.ShortLinkUpdateReqDTO;
import org.example.project.dto.resp.ShortLinkBatchCreateRespDTO;
import org.example.project.dto.resp.ShortLinkCreateRespDTO;
import org.example.project.dto.resp.ShortLinkGroupCountQueryRespDTO;
import org.example.project.dto.resp.ShortLinkPageRespDTO;

import java.io.IOException;
import java.util.List;

/**
 * 短链接接口层
 */
public interface ShortLinkService extends IService<ShortLinkDO> {
    /**
     * 创建短链接
     */
    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam);

    /**
     * 批量创建短链接
     * @param requestParam
     * @return
     */
    ShortLinkBatchCreateRespDTO batchCreateShortLink(ShortLinkBatchCreateReqDTO requestParam);

    /**
     * 修改短链接
     * @param requestParam 修改短链接请求参数
     */
    void updateShortLink(ShortLinkUpdateReqDTO requestParam);

    /**
     * 分页查询
     */
    IPage<ShortLinkPageRespDTO> pageShortLink(ShortLinkPageReqDTO requestParam);

    /**
     *查询短链接分组内数量
     */
    List<ShortLinkGroupCountQueryRespDTO> listGroupShortCount(List<String> requestParam);

    /**
     * 跳转短链接
     * @param shortUri
     * @param request
     * @param response
     */
    void restoreUrl(String shortUri, ServletRequest request, ServletResponse response) throws IOException;

    /**
     * 短链接统计
     * @param shortLinkStatsRecord 短链接统计实体参数
     */
    void shortLinkStats(ShortLinkStatsRecordDTO shortLinkStatsRecord);

}
