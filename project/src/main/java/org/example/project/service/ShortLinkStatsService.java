package org.example.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.example.project.dto.req.ShortLinkGroupStatsAccessRecordReqDTO;
import org.example.project.dto.req.ShortLinkGroupStatsReqDTO;
import org.example.project.dto.req.ShortLinkStatsAccessRecordReqDTO;
import org.example.project.dto.req.ShortLinkStatsReqDTO;
import org.example.project.dto.resp.ShortLinkStatsAccessRecordRespDTO;
import org.example.project.dto.resp.ShortLinkStatsRespDTO;

/**
 * 短链接监控接口层
 */
public interface ShortLinkStatsService {
    /**
     * 获取单个短链接监控数据
     *
     * @param requestParam 获取短链接监控数据入参
     * @return 短链接监控数据
     */
    ShortLinkStatsRespDTO oneShortLinkStats(ShortLinkStatsReqDTO requestParam);

    /**
     *
     * @param requestParam
     * @return
     */
    IPage<ShortLinkStatsAccessRecordRespDTO> shortLinkStatsAccessRecord(ShortLinkStatsAccessRecordReqDTO requestParam);

    /**
     *访问分组短链接指定时间内监控数据
     * @param requestParam
     * @return
     */
    ShortLinkStatsRespDTO groupShortLinkStats(ShortLinkGroupStatsReqDTO requestParam);

    /**
     *访问分组短链接指定时间内访客记录监控数据
     * @param requestParam
     * @return
     */
    IPage<ShortLinkStatsAccessRecordRespDTO> groupShortLinkStatsAccessRecord(ShortLinkGroupStatsAccessRecordReqDTO requestParam);
}
