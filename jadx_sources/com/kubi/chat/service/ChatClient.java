package com.kubi.chat.service;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.chat.conversation.ChatConversations;
import com.kubi.chat.entity.ChatMessage;
import com.kubi.chat.network.websockt.ChatWebSocketClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p468nb.C42792a;
import p531pb.C43430b;
import p591rb.InterfaceC43966b;
import p638tb.InterfaceC44915b;
import p638tb.InterfaceC44916c;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m90084d2 = {"Lcom/kubi/chat/service/ChatClient;", "", "Ltb/b;", "config", "<init>", "(Ltb/b;)V", "", "id", "Ltb/c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "j", "(Ljava/lang/String;Ltb/c;)V", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;)V", "toUserId", "Lnb/a;", "e", "(Ljava/lang/String;)Lnb/a;", "Lcom/kubi/chat/entity/ChatMessage;", "message", "k", "(Lcom/kubi/chat/entity/ChatMessage;)V", "i", CmcdData.Factory.STREAMING_FORMAT_HLS, "g", "()V", "f", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ltb/b;", "Lcom/kubi/chat/network/websockt/ChatWebSocketClient;", "b", "Lcom/kubi/chat/network/websockt/ChatWebSocketClient;", "chatWsClient", "Lcom/kubi/chat/conversation/ChatConversations;", "c", "Lcom/kubi/chat/conversation/ChatConversations;", "conversations", "d", "Companion", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ChatClient {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @Nullable
    public static ChatClient f19396e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44915b config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ChatWebSocketClient chatWsClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ChatConversations conversations;

    /* JADX INFO: compiled from: ChatClient.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/chat/service/ChatClient$Companion;", "", "<init>", "()V", "Ltb/b;", "config", "", "init", "(Ltb/b;)V", "Lcom/kubi/chat/service/ChatClient;", "get", "()Lcom/kubi/chat/service/ChatClient;", "instance", "Lcom/kubi/chat/service/ChatClient;", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void init(@NotNull InterfaceC44915b config) {
            Intrinsics.checkNotNullParameter(config, "config");
            if (ChatClient.f19396e != null) {
                return;
            }
            ChatClient.f19396e = new ChatClient(config);
            ChatClient chatClient = ChatClient.f19396e;
            if (chatClient == null) {
                return;
            }
            chatClient.m20391f();
        }

        @JvmStatic
        @Nullable
        public final ChatClient get() {
            return ChatClient.f19396e;
        }
    }

    /* JADX INFO: renamed from: com.kubi.chat.service.ChatClient$a */
    /* JADX INFO: compiled from: ChatClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"com/kubi/chat/service/ChatClient$a", "Lrb/b;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class C11395a implements InterfaceC43966b {
        public C11395a() {
        }

        @Override // p591rb.InterfaceC43966b
        @NotNull
        /* JADX INFO: renamed from: a */
        public String mo20398a() {
            return ChatClient.this.config.getF38410a();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final C42792a m20390e(@Nullable String toUserId) {
        ChatConversations chatConversations;
        if (toUserId == null || toUserId.length() == 0 || (chatConversations = this.conversations) == null) {
            return null;
        }
        return chatConversations.m20296a(toUserId);
    }

    public ChatClient(@NotNull InterfaceC44915b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    /* JADX INFO: renamed from: f */
    public final void m20391f() {
        this.conversations = new ChatConversations(this.config.getF38410a());
        this.chatWsClient = new ChatWebSocketClient(new C11395a());
    }

    /* JADX INFO: renamed from: g */
    public final void m20392g() {
        C43430b.f95881a.m95622b();
        ChatWebSocketClient chatWebSocketClient = this.chatWsClient;
        if (chatWebSocketClient != null) {
            chatWebSocketClient.m20331e();
        }
        f19396e = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m20393h(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ChatWebSocketClient chatWebSocketClient = this.chatWsClient;
        if (chatWebSocketClient == null) {
            return;
        }
        chatWebSocketClient.m20337k(message);
    }

    /* JADX INFO: renamed from: i */
    public final void m20394i(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ChatWebSocketClient chatWebSocketClient = this.chatWsClient;
        if (chatWebSocketClient == null) {
            return;
        }
        chatWebSocketClient.m20340n(message);
    }

    /* JADX INFO: renamed from: j */
    public final void m20395j(@NotNull String id2, @NotNull InterfaceC44916c listener) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ChatWebSocketClient chatWebSocketClient = this.chatWsClient;
        if (chatWebSocketClient != null) {
            chatWebSocketClient.m20341o(id2, listener);
        }
        ChatWebSocketClient chatWebSocketClient2 = this.chatWsClient;
        if (chatWebSocketClient2 == null) {
            return;
        }
        chatWebSocketClient2.m20330d();
    }

    /* JADX INFO: renamed from: k */
    public final void m20396k(@NotNull ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ChatWebSocketClient chatWebSocketClient = this.chatWsClient;
        if (chatWebSocketClient == null) {
            return;
        }
        chatWebSocketClient.m20342q(message);
    }

    /* JADX INFO: renamed from: l */
    public final void m20397l(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ChatWebSocketClient chatWebSocketClient = this.chatWsClient;
        if (chatWebSocketClient == null) {
            return;
        }
        chatWebSocketClient.m20343r(id2);
    }
}
