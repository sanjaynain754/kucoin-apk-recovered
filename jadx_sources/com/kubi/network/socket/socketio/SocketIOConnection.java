package com.kubi.network.socket.socketio;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.api.model.NetworkResponse;
import com.kubi.network.socket.WebSocketClient;
import com.kubi.network.socket.engineio.C19362b;
import com.kubi.network.socket.engineio.EngineIOConnection;
import com.kubi.network.socket.exception.ConnectSendException;
import com.kubi.network.socket.exception.ConnectServerException;
import com.tencent.qcloud.tuicore.TUIConstants;
import fr.InterfaceC37582c;
import fr.InterfaceC37583d;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.AsyncTimeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p570qr.AbstractC43863i;
import p570qr.C43859e;
import p570qr.C43865k;
import p570qr.InterfaceC43861g;
import p605rr.C44170a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: SocketIOConnection.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001=\b\u0000\u0018\u0000 D2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0002\u0017EB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\n2\u0016\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\n0\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u00020\n2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030!H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\b\u0018\u00010'R\u00020\u00002\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J#\u0010,\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030*H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u00020\n2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030!H\u0002¢\u0006\u0004\b0\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R\u001e\u00105\u001a\f\u0012\b\u0012\u00060'R\u00020\u0000038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, m90084d2 = {"Lcom/kubi/network/socket/socketio/SocketIOConnection;", "Lqr/g;", "Lcom/kubi/network/api/model/NetworkRequest;", "Lcom/kubi/network/api/model/NetworkMessage;", "Lcom/kubi/network/socket/WebSocketClient;", "client", "Lcom/kubi/network/socket/WebSocketClient$a;", "config", "<init>", "(Lcom/kubi/network/socket/WebSocketClient;Lcom/kubi/network/socket/WebSocketClient$a;)V", "", "connect", "()V", "", "throwable", "d", "(Ljava/lang/Throwable;)V", "disconnect", "", "c", "()Ljava/lang/String;", "Lfr/d;", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lfr/d;)V", "b", "request", "Lfr/c;", "q", "(Lcom/kubi/network/api/model/NetworkRequest;Lfr/c;)V", "Lkotlin/Function1;", "f", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/kubi/network/socket/socketio/d;", "packet", "r", "(Lcom/kubi/network/socket/socketio/d;)V", "", "id", "Lcom/kubi/network/socket/socketio/SocketIOConnection$a;", "m", "(I)Lcom/kubi/network/socket/socketio/SocketIOConnection$a;", "Lcom/kubi/network/api/model/NetworkResponse;", "response", "o", "(ILcom/kubi/network/api/model/NetworkResponse;)V", "p", "(ILjava/lang/Throwable;)V", "n", "Lcom/kubi/network/socket/WebSocketClient;", "Lcom/kubi/network/socket/WebSocketClient$a;", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "asyncCalls", "Lqr/e;", "Lqr/e;", "connectionStatus", "Lcom/kubi/network/socket/engineio/EngineIOConnection;", "e", "Lcom/kubi/network/socket/engineio/EngineIOConnection;", "connection", "com/kubi/network/socket/socketio/SocketIOConnection$d", "Lcom/kubi/network/socket/socketio/SocketIOConnection$d;", "requestStatus", "Lcom/kubi/network/socket/socketio/f;", "g", "Lcom/kubi/network/socket/socketio/f;", "messageDecoder", CmcdData.Factory.STREAMING_FORMAT_HLS, "Companion", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketIOConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketIOConnection.kt\ncom/kubi/network/socket/socketio/SocketIOConnection\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,208:1\n52#2,33:209\n52#2,33:242\n*S KotlinDebug\n*F\n+ 1 SocketIOConnection.kt\ncom/kubi/network/socket/socketio/SocketIOConnection\n*L\n173#1:209,33\n181#1:242,33\n*E\n"})
public final class SocketIOConnection implements InterfaceC43861g<NetworkRequest, NetworkMessage<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient.C19339a config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ArrayDeque<C19366a> asyncCalls;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C43859e connectionStatus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final EngineIOConnection connection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C19369d requestStatus;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C19375f messageDecoder;

    /* JADX INFO: renamed from: com.kubi.network.socket.socketio.SocketIOConnection$a */
    /* JADX INFO: compiled from: SocketIOConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/network/socket/socketio/SocketIOConnection$a;", "", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "Lfr/c;", TUIConstants.TUIChat.CALL_BACK, "<init>", "(Lcom/kubi/network/socket/socketio/SocketIOConnection;Lcom/kubi/network/api/model/NetworkRequest;Lfr/c;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/network/api/model/NetworkRequest;", "b", "()Lcom/kubi/network/api/model/NetworkRequest;", "Lfr/c;", "()Lfr/c;", "Lokio/AsyncTimeout;", "c", "Lokio/AsyncTimeout;", "()Lokio/AsyncTimeout;", "timeout", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class C19366a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final NetworkRequest request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final InterfaceC37582c callback;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final AsyncTimeout timeout;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SocketIOConnection f36099d;

        /* JADX INFO: renamed from: com.kubi.network.socket.socketio.SocketIOConnection$a$a */
        /* JADX INFO: compiled from: SocketIOConnection.kt */
        @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"com/kubi/network/socket/socketio/SocketIOConnection$a$a", "Lokio/AsyncTimeout;", "", "timedOut", "()V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class a extends AsyncTimeout {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ SocketIOConnection f36100a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C19366a f36101b;

            public a(SocketIOConnection socketIOConnection, C19366a c19366a) {
                this.f36100a = socketIOConnection;
                this.f36101b = c19366a;
            }

            @Override // okio.AsyncTimeout
            public void timedOut() {
                this.f36100a.m42983p(this.f36101b.getRequest().getId(), new TimeoutException("request timeout"));
            }
        }

        public C19366a(@NotNull SocketIOConnection socketIOConnection, @Nullable NetworkRequest request, InterfaceC37582c interfaceC37582c) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f36099d = socketIOConnection;
            this.request = request;
            this.callback = interfaceC37582c;
            a aVar = new a(socketIOConnection, this);
            socketIOConnection.config.getRequestTrack().m100147f(request.getId());
            aVar.timeout(socketIOConnection.config.getRequestTimeout(), TimeUnit.MILLISECONDS);
            this.timeout = aVar;
            aVar.enter();
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC37582c getCallback() {
            return this.callback;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final NetworkRequest getRequest() {
            return this.request;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final AsyncTimeout getTimeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.socketio.SocketIOConnection$b */
    /* JADX INFO: compiled from: SocketIOConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m90084d2 = {"com/kubi/network/socket/socketio/SocketIOConnection$b", "Lfr/d;", "", "onConnected", "()V", "onConnecting", "onDisconnect", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19367b implements InterfaceC37583d {
        public C19367b() {
        }

        @Override // fr.InterfaceC37583d
        public void onConnected() {
            SocketIOConnection.this.m42985r(new C19373d(null, null, 0, null, null, 27, null));
        }

        @Override // fr.InterfaceC37583d
        public void onConnecting() {
            SocketIOConnection.this.connectionStatus.m96626h();
        }

        @Override // fr.InterfaceC37583d
        public void onDisconnect() {
            SocketIOConnection.this.connectionStatus.m96627i();
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.socketio.SocketIOConnection$c */
    /* JADX INFO: compiled from: SocketIOConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"com/kubi/network/socket/socketio/SocketIOConnection$c", "Lfr/d;", "", "onDisconnect", "()V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19368c implements InterfaceC37583d {
        public C19368c() {
        }

        @Override // fr.InterfaceC37583d
        public void onDisconnect() {
            SocketIOConnection.this.messageDecoder.m43011d();
        }

        @Override // fr.InterfaceC37583d
        public void onConnected() {
            InterfaceC37583d.a.m84720a(this);
        }

        @Override // fr.InterfaceC37583d
        public void onConnecting() {
            InterfaceC37583d.a.m84721b(this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.socketio.SocketIOConnection$d */
    /* JADX INFO: compiled from: SocketIOConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/network/socket/socketio/SocketIOConnection$d", "Lqr/i;", "Lcom/kubi/network/api/model/NetworkRequest;", "Lcom/kubi/network/api/model/NetworkMessage;", "msg", "", "g", "(Lcom/kubi/network/api/model/NetworkRequest;)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSocketIOConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketIOConnection.kt\ncom/kubi/network/socket/socketio/SocketIOConnection$requestStatus$1\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,208:1\n52#2,33:209\n*S KotlinDebug\n*F\n+ 1 SocketIOConnection.kt\ncom/kubi/network/socket/socketio/SocketIOConnection$requestStatus$1\n*L\n77#1:209,33\n*E\n"})
    public static final class C19369d extends AbstractC43863i<NetworkRequest, NetworkMessage<?>> {
        public C19369d(C43859e c43859e) {
            super(c43859e);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0068  */
        @Override // p570qr.AbstractC43863i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo42935e(@NotNull NetworkRequest msg) {
            String message;
            Intrinsics.checkNotNullParameter(msg, "msg");
            try {
                Object objMo42991b = SocketIOConnection.this.config.getChannelCodec().mo42991b(msg);
                Intrinsics.checkNotNull(objMo42991b, "null cannot be cast to non-null type com.kubi.network.socket.socketio.SocketIOPacket<*>");
                SocketIOConnection.this.m42985r((C19373d) objMo42991b);
            } catch (Exception e11) {
                SocketIOConnection.this.m42983p(msg.getId(), e11);
                boolean zStartsWith$default = true;
                if (!(e11 instanceof UnknownHostException) && !(e11 instanceof SocketException) && !(e11 instanceof SocketTimeoutException) && !(e11 instanceof SSLException) && !(e11 instanceof SSLProtocolException) && !(e11 instanceof SSLPeerUnverifiedException) && !(e11 instanceof ConnectionShutdownException)) {
                    if (e11 instanceof SecurityException) {
                        String message2 = e11.getMessage();
                        if (message2 != null) {
                            zStartsWith$default = StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
                        } else {
                            zStartsWith$default = false;
                        }
                    } else if (!(e11 instanceof IOException) || (message = e11.getMessage()) == null || (!StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) && !message.equals("closed"))) {
                        zStartsWith$default = false;
                    }
                }
                if (zStartsWith$default) {
                    C44128b.m97263g("SocketIOConnection", e11);
                } else {
                    C44170a.m97380b(e11, "SocketIOConnection");
                }
            }
        }
    }

    public SocketIOConnection(@NotNull WebSocketClient client, @NotNull WebSocketClient.C19339a config) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(config, "config");
        this.client = client;
        this.config = config;
        this.asyncCalls = new ArrayDeque<>();
        C43859e c43859e = new C43859e(null, 1, null);
        c43859e.m96624f(new C19368c());
        this.connectionStatus = c43859e;
        EngineIOConnection engineIOConnection = new EngineIOConnection(client, config);
        engineIOConnection.mo42923a(new C19367b());
        engineIOConnection.mo42928f(new Function1<Object, Unit>() { // from class: com.kubi.network.socket.socketio.SocketIOConnection$connection$1$2
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:32:0x004e  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object it) {
                String message;
                Intrinsics.checkNotNullParameter(it, "it");
                try {
                    this.this$0.messageDecoder.m43008a(it);
                } catch (Throwable th2) {
                    boolean zStartsWith$default = true;
                    if (!(th2 instanceof UnknownHostException) && !(th2 instanceof SocketException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof SSLException) && !(th2 instanceof SSLProtocolException) && !(th2 instanceof SSLPeerUnverifiedException) && !(th2 instanceof ConnectionShutdownException)) {
                        if (th2 instanceof SecurityException) {
                            String message2 = th2.getMessage();
                            if (message2 != null) {
                                zStartsWith$default = StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
                            } else {
                                zStartsWith$default = false;
                            }
                        } else if (!(th2 instanceof IOException) || (message = th2.getMessage()) == null || (!StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) && !message.equals("closed"))) {
                            zStartsWith$default = false;
                        }
                    }
                    if (zStartsWith$default) {
                        C44128b.m97263g("SocketIOConnection", th2);
                    } else {
                        C44170a.m97380b(th2, "SocketIOConnection");
                    }
                }
            }
        });
        this.connection = engineIOConnection;
        this.requestStatus = new C19369d(c43859e);
        this.messageDecoder = new C19375f().m43012e(new Function1<C19373d<?>, Unit>() { // from class: com.kubi.network.socket.socketio.SocketIOConnection$messageDecoder$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C19373d<?> c19373d) {
                invoke2(c19373d);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C19373d<?> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.m42981n(it);
            }
        });
    }

    @Override // p570qr.InterfaceC43861g
    /* JADX INFO: renamed from: a */
    public void mo42923a(@NotNull InterfaceC37583d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.connectionStatus.m96624f(callback);
    }

    @Override // p570qr.InterfaceC43861g
    /* JADX INFO: renamed from: b */
    public void mo42924b(@NotNull InterfaceC37583d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.connectionStatus.m96630o(callback);
    }

    @Override // p570qr.InterfaceC43861g
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo42925c() {
        return this.connectionStatus.getConnectStatus();
    }

    @Override // p570qr.InterfaceC43861g
    public void connect() {
        this.connection.connect();
    }

    @Override // p570qr.InterfaceC43861g
    /* JADX INFO: renamed from: d */
    public void mo42926d(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.connection.mo42926d(throwable);
    }

    @Override // p570qr.InterfaceC43861g
    public void disconnect() {
        m42985r(new C19373d<>(null, null, 1, null, null, 27, null));
        this.connection.disconnect();
    }

    @Override // p570qr.InterfaceC43861g
    /* JADX INFO: renamed from: f */
    public void mo42928f(@NotNull Function1<? super NetworkMessage<?>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.requestStatus.m96636d(callback);
    }

    /* JADX INFO: renamed from: m */
    public final C19366a m42980m(int id2) {
        synchronized (this.asyncCalls) {
            Iterator<C19366a> it = this.asyncCalls.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "asyncCalls.iterator()");
            while (it.hasNext()) {
                C19366a next = it.next();
                if (next.getRequest().getId() == id2) {
                    it.remove();
                    return next;
                }
            }
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1  */
    /* JADX INFO: renamed from: n */
    public final void m42981n(C19373d<?> packet) {
        String message;
        String message2;
        boolean zStartsWith$default = false;
        switch (packet.getType()) {
            case 0:
                this.connectionStatus.m96625g();
                this.config.getTokenProvider().mo43100d();
                return;
            case 1:
            case 4:
                mo42926d(new ConnectServerException());
                return;
            case 2:
            case 5:
                try {
                    C43865k<?> c43865kMo42990a = this.config.getChannelCodec().mo42990a(packet);
                    this.requestStatus.m96634b(new NetworkMessage(c43865kMo42990a.getId(), c43865kMo42990a.m96638a()));
                    return;
                } catch (Throwable th2) {
                    if ((th2 instanceof UnknownHostException) || (th2 instanceof SocketException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SSLException) || (th2 instanceof SSLProtocolException) || (th2 instanceof SSLPeerUnverifiedException) || (th2 instanceof ConnectionShutdownException)) {
                        zStartsWith$default = true;
                    } else if (th2 instanceof SecurityException) {
                        String message3 = th2.getMessage();
                        if (message3 != null) {
                            zStartsWith$default = StringsKt.startsWith$default(message3, "Package android does not belong to", false, 2, (Object) null);
                        }
                    } else if ((th2 instanceof IOException) && (message = th2.getMessage()) != null && (StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) || StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) || StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) || StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) || message.equals("closed"))) {
                        zStartsWith$default = true;
                    }
                    if (zStartsWith$default) {
                        C44128b.m97263g("SocketIOConnection", th2);
                        return;
                    } else {
                        C44170a.m97380b(th2, "SocketIOConnection");
                        return;
                    }
                }
            case 3:
            case 6:
                try {
                    Integer id2 = packet.getId();
                    if (id2 == null) {
                        throw new RuntimeException("ack id is null");
                    }
                    m42982o(id2.intValue(), NetworkResponse.INSTANCE.success(packet.m42997b()));
                    return;
                } catch (Throwable th3) {
                    if ((th3 instanceof UnknownHostException) || (th3 instanceof SocketException) || (th3 instanceof SocketTimeoutException) || (th3 instanceof SSLException) || (th3 instanceof SSLProtocolException) || (th3 instanceof SSLPeerUnverifiedException) || (th3 instanceof ConnectionShutdownException)) {
                        zStartsWith$default = true;
                    } else if (th3 instanceof SecurityException) {
                        String message4 = th3.getMessage();
                        if (message4 != null) {
                            zStartsWith$default = StringsKt.startsWith$default(message4, "Package android does not belong to", false, 2, (Object) null);
                        }
                    } else if ((th3 instanceof IOException) && (message2 = th3.getMessage()) != null && (StringsKt.startsWith$default(message2, "Required SETTINGS preface not received", false, 2, (Object) null) || StringsKt.startsWith$default(message2, "Unexpected response code for CONNECT", false, 2, (Object) null) || StringsKt.startsWith$default(message2, "exhausted all routes", false, 2, (Object) null) || StringsKt.startsWith$default(message2, "unexpected end of stream", false, 2, (Object) null) || StringsKt.startsWith$default(message2, "stream was reset: CANCEL", false, 2, (Object) null) || StringsKt.startsWith$default(message2, "Software caused connection abort", false, 2, (Object) null) || message2.equals("closed"))) {
                        zStartsWith$default = true;
                    }
                    if (zStartsWith$default) {
                        C44128b.m97263g("SocketIOConnection", th3);
                        return;
                    } else {
                        C44170a.m97380b(th3, "SocketIOConnection");
                        return;
                    }
                }
            default:
                return;
        }
    }

    @Override // p570qr.InterfaceC43861g
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo42927e(@NotNull NetworkRequest request, @Nullable InterfaceC37582c callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!Intrinsics.areEqual(mo42925c(), "connected")) {
            mo42926d(new ConnectSendException());
        }
        synchronized (this.asyncCalls) {
            this.asyncCalls.add(new C19366a(this, request, callback));
        }
        this.requestStatus.m96637f(request);
    }

    /* JADX INFO: renamed from: r */
    public final void m42985r(C19373d<?> packet) {
        for (Object obj : C19376g.f36116a.m43013a(packet)) {
            InterfaceC43861g.a.m96632a(this.connection, new C19362b("message", obj), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m42982o(int id2, NetworkResponse<?> response) {
        InterfaceC37582c callback;
        AsyncTimeout timeout;
        C19366a c19366aM42980m = m42980m(id2);
        if (c19366aM42980m != null && (timeout = c19366aM42980m.getTimeout()) != null) {
            timeout.exit();
        }
        this.config.getRequestTrack().m100145d(id2);
        if (c19366aM42980m != null && (callback = c19366aM42980m.getCallback()) != null) {
            callback.mo23836a(response);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m42983p(int id2, Throwable throwable) {
        InterfaceC37582c callback;
        AsyncTimeout timeout;
        C19366a c19366aM42980m = m42980m(id2);
        if (c19366aM42980m != null && (timeout = c19366aM42980m.getTimeout()) != null) {
            timeout.exit();
        }
        this.config.getRequestTrack().m100146e(id2, throwable);
        if (c19366aM42980m != null && (callback = c19366aM42980m.getCallback()) != null) {
            callback.onFailure(throwable);
        }
    }
}
