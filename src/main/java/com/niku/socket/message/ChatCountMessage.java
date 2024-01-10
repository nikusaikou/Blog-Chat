package com.niku.socket.message;

import lombok.Data;
import lombok.experimental.Accessors;
import com.niku.socket.enums.MsgTypeEnum;

/**
 * 聊天室人数
 *
 * @author Niku
 */
@Data
@Accessors(chain = true)
public class ChatCountMessage implements Message {

    public static final String TYPE = MsgTypeEnum.CHAT_COUNT.getCode();

    /**
     * 消息编号
     */
    private String msgId;
    /**
     * 内容
     */
    private Integer count;

}
