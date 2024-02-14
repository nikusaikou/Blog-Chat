package com.niku.socket.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 消息类型枚举
 *
 * @author Niku
 * @date 2022-12-27
 */
@Getter
@AllArgsConstructor
public enum MsgTypeEnum {
    /**
     * 同于标识 当前消息是 聊天消息
     */
    CHAT_MSG("1", "聊天消息"),
    /**
     * 用于标识 当前消息是 人数消息
     */
    CHAT_COUNT("2", "聊天室人数");

    private final String code;
    private final String desc;
}
