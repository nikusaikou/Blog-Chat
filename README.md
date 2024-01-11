# Spring Boot + web socket IM 实时聊天

本示例是整合的 Tomcat WebSocket （Tomcat7 以后开始支持 websocket 协议）


## 版本依赖

|技术栈|版本|
| --------------- | -------------------------- |
|Spring Boot | 2.7.0 |
|Fastjson | 1.2.62 |
|NES.css |2.3.0|
|Maven|3.8.3|

## 项目结构
```bash
.
├── SocketApplication.java
├── config
│   └── WebSocketConfiguration.java
├── context
│   └── WebSocketContext.java
├── controller
│   └── WebSocketTestController.java
├── enums
│   └── MsgTypeEnum.java
├── message
│   ├── ChatCountMessage.java
│   ├── ChatMsgMessage.java
│   └── Message.java
└── server
    └── WebSocketServer.java

```
首先要明白，实现一个聊天功能，是要有一个客户端和一个服务端的，

客户端对应的就是页面，每个客户都会在页面上聊天

服务端对应的就是后台，接收到客户端发来的消息后，进行转发（这里可以进行其他的业务逻辑），发送给其他的客户端，这样就可以实现聊天的功能。

流程可以简单描述如下

![](_doc/img.png)

## 项目启动 & 效果展示
运行启动类即可 `SocketApplication` 

启动后访问 <http://127.0.0.1:8080/> 即可体验

可以开多个窗口，互相聊天

![](_doc/xgt.png)
