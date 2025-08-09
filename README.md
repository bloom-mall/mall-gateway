# Mall Gateway

Mall Gateway 是一个基于 Spring Boot 的网关服务，主要用于处理用户请求的路由、负载均衡、流量治理和安全认证等功能。

## 技术架构

## 技术组件

| 技术组件        | 版本     | 说明 |
|-------------|--------|------|
| Spring Boot | 3.5.4  | 基础框架 |
| MySQL       | 8.0    | 数据存储 |

## 关键设计

- 数据模型
- 开发评审
- 安全方案

## 开发环境

### 环境要求

- JDK 17+
- Docker

### 本地启动

MacOS/Linux:

```bash
./gradlew bootRun
```

Windows:

```bash
gradlew.bat bootRun
```

### 本地check

```bash
./gradlew check
```

### 本地单测和集成测试

```bash
./gradlew test
```
