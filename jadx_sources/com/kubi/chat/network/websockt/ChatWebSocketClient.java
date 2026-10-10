package com.kubi.chat.network.websockt;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.NetworkUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.chat.entity.ChatMessage;
import com.kubi.chat.entity.MsgStatusEnum;
import com.kubi.chat.network.websockt.ChatWebSocketClient;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p591rb.InterfaceC43966b;
import p638tb.InterfaceC44916c;
import p658ub.C45148b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatWebSocketClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R'\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R'\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b.\u0010,R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00101¨\u00064"}, m90084d2 = {"Lcom/kubi/chat/network/websockt/ChatWebSocketClient;", "", "Lrb/b;", "config", "<init>", "(Lrb/b;)V", "", "d", "()V", "e", "", "id", "Ltb/c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "o", "(Ljava/lang/String;Ltb/c;)V", "r", "(Ljava/lang/String;)V", "Lcom/kubi/chat/entity/ChatMessage;", "message", "q", "(Lcom/kubi/chat/entity/ChatMessage;)V", "n", "j", "m", CmcdData.Factory.STREAM_TYPE_LIVE, "k", "Lcom/kubi/chat/network/websockt/MessageEvent;", "messageEvent", "i", "(Lcom/kubi/chat/network/websockt/MessageEvent;)V", "Landroid/os/Message;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/os/Message;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lrb/b;", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor;", "b", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor;", "socketExecutor", "", "c", "Lkotlin/Lazy;", "f", "()Ljava/util/Map;", "listenerMap", "g", "sendMessageMap", "Landroid/os/Handler;", "Landroid/os/Handler;", "uiHandler", "Companion", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ChatWebSocketClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43966b config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ChatSocketExecutor socketExecutor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy listenerMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy sendMessageMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Handler uiHandler;

    /* JADX INFO: renamed from: com.kubi.chat.network.websockt.ChatWebSocketClient$a */
    /* JADX INFO: compiled from: ChatWebSocketClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m90084d2 = {"com/kubi/chat/network/websockt/ChatWebSocketClient$a", "Lcom/kubi/chat/network/websockt/IStatusCallback;", "", "onConnected", "()V", "onDisconnect", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class C11382a implements IStatusCallback {
        public C11382a() {
        }

        @Override // com.kubi.chat.network.websockt.IStatusCallback
        public void onConnected() {
            ChatWebSocketClient.this.m20335i(new MessageEvent(MessageEvent.MESSAGE_NOTIFY_ALL, null, 2, null));
        }

        @Override // com.kubi.chat.network.websockt.IStatusCallback
        public void onDisconnect() {
            for (ChatMessage chatMessage : ChatWebSocketClient.this.m20333g().values()) {
                chatMessage.setStatus(MsgStatusEnum.FAIL);
                ChatWebSocketClient.this.m20335i(new MessageEvent(MessageEvent.MESSAGE_FAILD, chatMessage));
            }
            ChatWebSocketClient.this.m20333g().clear();
        }
    }

    public ChatWebSocketClient(@NotNull InterfaceC43966b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.listenerMap = LazyKt.lazy(new Function0<Map<String, InterfaceC44916c>>() { // from class: com.kubi.chat.network.websockt.ChatWebSocketClient$listenerMap$2
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Map<String, InterfaceC44916c> invoke() {
                return new LinkedHashMap();
            }
        });
        this.sendMessageMap = LazyKt.lazy(new Function0<Map<String, ChatMessage>>() { // from class: com.kubi.chat.network.websockt.ChatWebSocketClient$sendMessageMap$2
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Map<String, ChatMessage> invoke() {
                return new LinkedHashMap();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m20329p(ChatWebSocketClient this$0, Message msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.m20334h(msg);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m20330d() {
        if (IStatusCallback.INSTANCE.isConnected()) {
            return;
        }
        ChatSocketExecutor chatSocketExecutor = new ChatSocketExecutor(this.config, this);
        this.socketExecutor = chatSocketExecutor;
        chatSocketExecutor.m20320X(new C11382a());
        ChatSocketExecutor chatSocketExecutor2 = this.socketExecutor;
        if (chatSocketExecutor2 == null) {
            return;
        }
        chatSocketExecutor2.m20321Y();
    }

    /* JADX INFO: renamed from: e */
    public final void m20331e() {
        ChatSocketExecutor chatSocketExecutor = this.socketExecutor;
        if (chatSocketExecutor == null) {
            return;
        }
        ChatSocketExecutor.m20314U(chatSocketExecutor, 0, 1, null);
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, InterfaceC44916c> m20332f() {
        return (Map) this.listenerMap.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, ChatMessage> m20333g() {
        return (Map) this.sendMessageMap.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    public final void m20334h(Message message) {
        ChatMessage message2;
        if (message.what != 1) {
            return;
        }
        Object obj = message.obj;
        MessageEvent messageEvent = obj instanceof MessageEvent ? (MessageEvent) obj : null;
        if (messageEvent == null || (message2 = messageEvent.getMessage()) == null) {
            return;
        }
        for (InterfaceC44916c interfaceC44916c : m20332f().values()) {
            String action = messageEvent.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -1489552754:
                        if (action.equals(MessageEvent.MESSAGE_FAILD)) {
                            interfaceC44916c.mo46175V2(message2);
                        }
                        break;
                    case -1148062919:
                        if (action.equals(MessageEvent.MESSAGE_RECEIVED)) {
                            interfaceC44916c.mo46076f2(message2);
                        }
                        break;
                    case -854782237:
                        if (action.equals(MessageEvent.MESSAGE_NOTIFY_ALL)) {
                            interfaceC44916c.mo46185e2();
                        }
                        break;
                    case 1060719856:
                        if (action.equals(MessageEvent.MESSAGE_SENT)) {
                            interfaceC44916c.mo46195p(message2);
                        }
                        break;
                    case 1415502861:
                        if (action.equals(MessageEvent.MESSAGE_READED)) {
                            interfaceC44916c.mo46192l(message2);
                        }
                        break;
                    case 2122940940:
                        if (action.equals(MessageEvent.MESSAGE_DELIVERED)) {
                            interfaceC44916c.mo46179Z2(message2);
                        }
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m20335i(MessageEvent messageEvent) {
        if (this.uiHandler == null) {
            return;
        }
        Message message = new Message();
        message.what = 1;
        message.obj = messageEvent;
        Handler handler = this.uiHandler;
        if (handler == null) {
            return;
        }
        handler.sendMessage(message);
    }

    /* JADX INFO: renamed from: j */
    public final void m20336j(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m20333g().remove(message.getUniqueId());
        message.setStatus(MsgStatusEnum.DELIVERED);
        m20335i(new MessageEvent(MessageEvent.MESSAGE_DELIVERED, message));
    }

    /* JADX INFO: renamed from: k */
    public final void m20337k(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m20333g().remove(message.getUniqueId());
        message.setStatus(MsgStatusEnum.FAIL);
        m20335i(new MessageEvent(MessageEvent.MESSAGE_FAILD, message));
    }

    /* JADX INFO: renamed from: l */
    public final void m20338l(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        message.setStatus(MsgStatusEnum.READED);
        m20335i(new MessageEvent(MessageEvent.MESSAGE_READED, message));
    }

    /* JADX INFO: renamed from: m */
    public final void m20339m(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        message.setStatus(MsgStatusEnum.DELIVERED);
        m20335i(new MessageEvent(MessageEvent.MESSAGE_RECEIVED, message));
    }

    /* JADX INFO: renamed from: n */
    public final void m20340n(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!C45148b.m99792b(Boolean.valueOf(m20333g().containsKey(message.getUniqueId())))) {
            m20333g().put(message.getUniqueId(), message);
        }
        message.setStatus(MsgStatusEnum.SENDING);
        m20335i(new MessageEvent(MessageEvent.MESSAGE_SENT, message));
    }

    /* JADX INFO: renamed from: o */
    public final void m20341o(@NotNull String id2, @NotNull InterfaceC44916c listener) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.uiHandler == null) {
            this.uiHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: rb.a
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return ChatWebSocketClient.m20329p(this.f97176b, message);
                }
            });
        }
        if (C45148b.m99792b(Boolean.valueOf(m20332f().containsKey(id2)))) {
            return;
        }
        m20332f().put(id2, listener);
    }

    /* JADX INFO: renamed from: q */
    public final void m20342q(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!NetworkUtils.m6063k()) {
            message.setFailedInfo("Network error please check the connection.");
            m20337k(message);
            return;
        }
        ChatSocketExecutor chatSocketExecutor = this.socketExecutor;
        if (C45148b.m99792b(chatSocketExecutor == null ? null : Boolean.valueOf(chatSocketExecutor.m20319W(message.getDataByte())))) {
            return;
        }
        message.setFailedInfo("webSocket un connect.");
        m20337k(message);
    }

    /* JADX INFO: renamed from: r */
    public final void m20343r(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        m20332f().remove(id2);
    }
}
