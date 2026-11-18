# studentmanagement

按参考 https://github.com/RameshMF/spring-boot2-jpa-crud-example 的结构和写法改为学生管理。

## 环境与启动

Spring Boot 3.0.4、Java 17、Spring Data JPA、MySQL。JDK 17+、Maven 和 MySQL。

1. 在 MySQL 中创建数据库：

```sql
CREATE DATABASE students_database;
```

2. 修改 `src/main/resources/application.properties` 中的 MySQL 用户名和密码（默认 root/root）。
3. 在本项目目录运行：

```sh
mvn spring-boot:run
```

Hibernate 自动创建 `students` 表。应用默认端口为 8080。


| GET | /api/v1/students | 查询所有学生 |
| GET | /api/v1/students/{id} | 按 ID 查询学生 |
| POST | /api/v1/students | 新增学生 |
| PUT | /api/v1/students/{id} | 修改学生 |
| DELETE | /api/v1/students/{id} | 删除学生 |

新增和修改请求 JSON：

```json
{
  "firstName": "San",
  "lastName": "Zhang",
  "emailId": "zhangsan@example.com"
}
```

保留参考项目的 `id`、`firstName`、`lastName`、`emailId` 字段、Controller 直接调用 Repository 的结构，以及三个异常处理类。

## Test

```sh
mvn test
mvn package
```
