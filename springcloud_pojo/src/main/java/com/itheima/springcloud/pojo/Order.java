package com.itheima.springcloud.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: phx
 * @date: 2020/7/4
 * @time: 19:46
 */
@Data
@Table(name="tb_order")
public class Order implements Serializable {
    @Id
    private String id;
    private Integer totalNum;
    private Integer payMoney;
    private Integer payType;
    private Date createTime;
    private String username;
    private String receiverContact;
    private String receiverMobile;
    private String receiverAddress;
    private Integer sourceType;
    private Integer orderStatus;
    private Integer payStatus;
    private Integer isDelete;

}
