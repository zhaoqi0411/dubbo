package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.PapaXiongService;

/**
 * @author zhaoqi
 * @since 2021-08-25
 */
public class PapaXiongServiceImpl implements PapaXiongService {
    @Override
    public String hiPapaXiong(String name) {
        System.out.println("Hi papaxiong");
        return "hi papaxiong";
    }
}
