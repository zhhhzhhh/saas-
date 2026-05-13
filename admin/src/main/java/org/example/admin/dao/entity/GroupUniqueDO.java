package org.example.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 短链接分组唯一标识实体类
 */
@Data
@TableName("t_group_unique")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupUniqueDO {
    /**
     * id
     */
    private Long id;

    /**
     * 分组标识
     */
    private String gid;
}
