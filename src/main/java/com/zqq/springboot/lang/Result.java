package com.zqq.springboot.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author CheunChinChin
 * @Description  返回结果的封装类
 * @Date 2021/4/1 14:37
 **/
@Data
public class Result implements Serializable {

    private String code;

    private String msg;

    private Object data;

    public static Result succ(Object data) {
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
     }

     public static Result succ(String mess,Object data){
        Result m = new Result();
        m.setCode("0");
        m.setMsg(mess);
        m.setData(data);
        return m;
     }

     public static Result fail(String mess){
         Result m = new Result();
         m.setCode("-1");
         m.setMsg(mess);
         m.setData(null);
         return m;
     }

     public static Result fail(String mess,Object data){
         Result m = new Result();
         m.setCode("-1");
         m.setMsg(mess);
         m.setData(data);
         return m;
     }

}
