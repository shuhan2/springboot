package com.example.demo.Web;

import com.example.demo.domain.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/employees")     // 通过这里配置使下面的映射都在/employees，可去除
public class employeeControl {
  static Map<Integer, Employee> employeers = Collections.synchronizedMap(new HashMap<Integer, Employee>());

  @RequestMapping(value="/employees", method=RequestMethod.GET)
  public List<Employee> getUserList() {
    // 处理"/users/"的GET请求，用来获取用户列表
    // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
    List<Employee> r = new ArrayList<Employee>(employeers.values());
    Employee user1 = new Employee((long)0,"小明",20,"男");
    Employee user2 = new Employee((long)1,"小红",19,"女");
    Employee user3 = new Employee((long)2,"小智",15,"男");
    Employee user4 = new Employee((long)3,"小刚",16,"男");
    Employee user5 = new Employee((long)4,"小霞",15,"女");
    r.add(user1);
    employeers.put(0,user1);
    r.add(user2);
    employeers.put(1,user2);
    r.add(user3);
    employeers.put(2,user3);
    r.add(user4);
    employeers.put(3,user4);
    r.add(user5);
    employeers.put(4,user5);
    return r;
  }
//  @RequestMapping(value="/postemployees", method=RequestMethod.POST)
//  public List<Employee> postUserList(){
//
//  }

}
