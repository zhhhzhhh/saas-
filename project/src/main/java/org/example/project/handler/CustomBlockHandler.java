package org.example.project.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.project.common.convention.result.Result;
import org.example.project.dto.req.ShortLinkCreateReqDTO;
import org.example.project.dto.resp.ShortLinkCreateRespDTO;

public class CustomBlockHandler {
    public static Result<ShortLinkCreateRespDTO> createShortLinkBlockHandlerMethod(ShortLinkCreateReqDTO requestParam, BlockException exception) {
        return new Result<ShortLinkCreateRespDTO>().setCode("B100000").setMessage("当前访问网站人数过多，请稍后再试...");
    }
}
