package com.niku.socket.message;

import lombok.Data;
import lombok.experimental.Accessors;
import com.niku.socket.enums.MsgTypeEnum;

/**
 * 发送给所有人的群聊消息的 Message
 *
 * @author Niku
 */
@Data
@Accessors(chain = true)
public class ChatMsgMessage implements Message {

    public static final String TYPE = MsgTypeEnum.CHAT_MSG.getCode();

    /**
     * 消息编号
     */
    private String msgId;
    /**
     * 内容
     */
    private String msg;

}
