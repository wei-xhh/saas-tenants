package com.xhh.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description
 * 分页
 *     {
 *         “success”:"成功",
 *         "code":10000
 *         "message":"ok"
 *         "data" {
 *             total: //总条数
 *             rows: // 数据列表
 *         }
 *     }
 * @author: weiXhh
 * @create: 2020-04-15 12:49
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {
    private Long total;
    private List<T> rows;
}