package cn.ming.springframework.po;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {

    private Long id;
    private String userId;          // 用户ID
    private String userHead;        // 头像
    private LocalDateTime createTime;        // 创建时间
    private LocalDateTime updateTime;        // 更新时间
}