package io.cooper.seckill.domain.model;

import lombok.Data;

@Data
public class SeckillUser {
    private static final long serialVersionUID = -3004624289691589697L;

    //用户id
//    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    //用户名
    private String userName;
    //密码
    private String password;
    //1：正常；2：冻结
    private Integer status;

}
