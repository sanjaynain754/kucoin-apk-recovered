package com.kubi.chat.network.websockt;

import androidx.annotation.Keep;
import com.kubi.chat.entity.ChatMessage;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatWebSocketClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/chat/network/websockt/MessageEvent;", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "", "message", "Lcom/kubi/chat/entity/ChatMessage;", "(Ljava/lang/String;Lcom/kubi/chat/entity/ChatMessage;)V", "getAction", "()Ljava/lang/String;", "getMessage", "()Lcom/kubi/chat/entity/ChatMessage;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class MessageEvent {

    @NotNull
    public static final String MESSAGE_DELIVERED = "MESSAGE_DELIVERED";

    @NotNull
    public static final String MESSAGE_FAILD = "MESSAGE_FAILD";

    @NotNull
    public static final String MESSAGE_NOTIFY_ALL = "MESSAGE_NOTIFY_ALL";

    @NotNull
    public static final String MESSAGE_READED = "MESSAGE_READED";

    @NotNull
    public static final String MESSAGE_RECEIVED = "MESSAGE_RECEIVED";

    @NotNull
    public static final String MESSAGE_SENT = "MESSAGE_SENT";

    @Nullable
    private final String action;

    @Nullable
    private final ChatMessage message;

    public MessageEvent(@Nullable String str, @Nullable ChatMessage chatMessage) {
        this.action = str;
        this.message = chatMessage;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageEvent)) {
            return false;
        }
        MessageEvent messageEvent = (MessageEvent) other;
        return Intrinsics.areEqual(this.action, messageEvent.action) && Intrinsics.areEqual(this.message, messageEvent.message);
    }

    public static /* synthetic */ MessageEvent copy$default(MessageEvent messageEvent, String str, ChatMessage chatMessage, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageEvent.action;
        }
        if ((i11 & 2) != 0) {
            chatMessage = messageEvent.message;
        }
        return messageEvent.copy(str, chatMessage);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChatMessage getMessage() {
        return this.message;
    }

    @NotNull
    public final MessageEvent copy(@Nullable String action, @Nullable ChatMessage message) {
        return new MessageEvent(action, message);
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final ChatMessage getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.action;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ChatMessage chatMessage = this.message;
        return iHashCode + (chatMessage != null ? chatMessage.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessageEvent(action=" + ((Object) this.action) + ", message=" + this.message + ')';
    }

    public /* synthetic */ MessageEvent(String str, ChatMessage chatMessage, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : chatMessage);
    }
}
