package org.example.admin.controller;

import lombok.RequiredArgsConstructor;
import org.example.admin.common.convention.result.Result;
import org.example.admin.common.convention.result.Results;
import org.example.admin.dto.req.ShortLinkGroupSaveReqDTO;
import org.example.admin.dto.req.ShortLinkGroupSortReqDTO;
import org.example.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import org.example.admin.dto.resp.ShortLinkGroupRespDTO;
import org.example.admin.service.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/short-link/admin/v1")
public class GroupController {

    private final GroupService groupService;
    /**
     * 新增短链接分组
     *
     * @param requestParam
     * @return
     */
    @PostMapping("/group")
    public Result<Void> save(@RequestBody ShortLinkGroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }

    /**
     * 查询分组集合
     */
    @GetMapping("/group")
    public Result<List<ShortLinkGroupRespDTO>> listGroup() {
        return Results.success(groupService.listGroup());
    }

    /**
     * 修改分组名
     */
    @PutMapping("/group")
    public Result<Void> updateGroup(@RequestBody ShortLinkGroupUpdateReqDTO requestParam) {
        groupService.updateGroup(requestParam);
        return Results.success();
    }

    /**
     * 删除短链接分组
     */
    @DeleteMapping("/group")
    public Result<Void> deleteGroup(@RequestParam String gid) {
        groupService.deleteGroup(gid);
        return Results.success();
    }

    /**
     * 排序短链接分组
     *
     * @param requestParam
     * @return
     */
    @PostMapping("/group/sort")
    public Result<Void> sortGroup(@RequestBody List<ShortLinkGroupSortReqDTO> requestParam) {
        groupService.sortGroup(requestParam);
        return Results.success();
    }
}
