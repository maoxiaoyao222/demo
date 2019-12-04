package com.wirk.demo.hello.design.proxy.dynamic;

import com.wirk.demo.hello.design.proxy.Landord;
import com.wirk.demo.hello.design.proxy.Person;
import com.wirk.demo.hello.design.proxy.staticProxy.Agent;

/**
 * 测试动态代理类
 * @author : Mao LuDong
 * @date : Created in 22:28 2019/12/3
 */
public class TestDynamicProxy {

  public static void main(String[] args) {
    //测试静态代理
    Person person = new DynamicAgent().bind(new Landord());
    person.rent();
  }
}
