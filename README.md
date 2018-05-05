# Spring Boot基础

## 练习描述
本题要求使用Spring boot来完成对Employee CURD(增删改查) API接口的实现。<br>
要求每一个Employee包含 id、name、age、gender四个字段。<br>
至少需要完成查询所有 Employee 的API接口，并返回一个包含所有Employee的JSON，要求接口路径：http://localhost:8080/employees<br>
要求使用Postman来向目标接口路径发送请求，获取Response，Response JSON格式如下:<br>

  [
    {
      "id": 0,

      "name": "小明",
      "age": 20,
      "gender": "男"
    },
    {
      "id": 1,
      "name": "小红",
      "age": 19,
      "gender": "女"  
    },
    {
      "id": 2,
      "name": "小智",
      "age": 15,
      "gender": "男"
    },
    {
      "id": 3,
      "name": "小刚",
      "age": 16,
      "gender": "男"
    },
    {
      "id": 4,
      "name": "小霞",
      "age": 15,
      "gender": "女"
    }
  ]
