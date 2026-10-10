package com.kubi.network.socket.connect;

import android.os.Message;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.socket.WebSocketClient;
import com.kubi.network.socket.connect.RealConnection;
import com.kubi.network.socket.exception.ChannelCloseException;
import com.kubi.network.socket.exception.ConnectCloseException;
import com.kubi.network.socket.exception.ConnectFailException;
import com.kubi.network.socket.exception.ConnectNetworkException;
import com.kubi.network.socket.exception.ConnectPingException;
import com.kubi.network.socket.exception.ConnectSendException;
import com.kubi.network.socket.exception.ConnectTimeoutException;
import com.kubi.network.socket.exception.ConnectTokenException;
import com.kubi.network.socket.exception.ConnectUnknownException;
import com.kubi.network.socket.exception.ConnectUserException;
import com.kubi.network.socket.exception.FlowTimeoutException;
import com.kubi.network.socket.exception.TokenFailException;
import com.kubi.network.socket.exception.TokenTimeoutException;
import com.kubi.network.socket.model.TokenEntity;
import com.kubi.network.socket.utils.C19391g;
import com.tencent.qcloud.tuicore.TUIConstants;
import fr.InterfaceC37582c;
import fr.InterfaceC37583d;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import o00.C42917g;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p570qr.AbstractC43863i;
import p570qr.C43859e;
import p570qr.InterfaceC43861g;
import p605rr.C44170a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import sr.C44539b;
import sr.C44540c;
import tr.InterfaceC45068c;

/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0002EM\b\u0000\u0018\u0000 P2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002:\u0006Q\u0010\u0012\u000b\u001e\u0015B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u001bJ5\u0010&\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010\u00032\u001a\u0010$\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030#0\"\"\u0006\u0012\u0002\b\u00030#H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u0010,\u001a\u00060*R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0018\u00100\u001a\u00060-R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u000601R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u000605R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u000609R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u000e\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006R"}, m90084d2 = {"Lcom/kubi/network/socket/connect/RealConnection;", "Lsr/c;", "Lqr/g;", "", "Lcom/kubi/network/socket/WebSocketClient;", "client", "Lcom/kubi/network/socket/WebSocketClient$a;", "config", "<init>", "(Lcom/kubi/network/socket/WebSocketClient;Lcom/kubi/network/socket/WebSocketClient$a;)V", "", "c", "()Ljava/lang/String;", "Lfr/d;", TUIConstants.TUIChat.CALL_BACK, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lfr/d;)V", "b", "request", "Lfr/c;", "e", "(Ljava/lang/Object;Lfr/c;)V", "Lkotlin/Function1;", "f", "(Lkotlin/jvm/functions/Function1;)V", "connect", "()V", "", "throwable", "d", "(Ljava/lang/Throwable;)V", "disconnect", "obj", "", "Ljava/lang/Class;", "expects", "", "Z", "(Ljava/lang/Object;[Ljava/lang/Class;)Z", "Lcom/kubi/network/socket/WebSocketClient;", "Lcom/kubi/network/socket/WebSocketClient$a;", "Lcom/kubi/network/socket/connect/RealConnection$c;", "Lcom/kubi/network/socket/connect/RealConnection$c;", "defaultState", "Lcom/kubi/network/socket/connect/RealConnection$d;", "g", "Lcom/kubi/network/socket/connect/RealConnection$d;", "idleState", "Lcom/kubi/network/socket/connect/RealConnection$e;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/kubi/network/socket/connect/RealConnection$e;", "paramState", "Lcom/kubi/network/socket/connect/RealConnection$b;", "i", "Lcom/kubi/network/socket/connect/RealConnection$b;", "connectingState", "Lcom/kubi/network/socket/connect/RealConnection$a;", "j", "Lcom/kubi/network/socket/connect/RealConnection$a;", "connectedState", "", "k", "I", "retryTimes", "Lqr/e;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lqr/e;", "connectionStatus", "com/kubi/network/socket/connect/RealConnection$g", "m", "Lcom/kubi/network/socket/connect/RealConnection$g;", "requestStatus", "Lokhttp3/WebSocket;", "n", "Lokhttp3/WebSocket;", "socket", "com/kubi/network/socket/connect/RealConnection$f", "o", "Lcom/kubi/network/socket/connect/RealConnection$f;", "p", "Companion", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\ncom/kubi/network/socket/connect/RealConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,431:1\n1#2:432\n*E\n"})
public final class RealConnection extends C44540c implements InterfaceC43861g<Object, Object> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient client;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient.C19339a config;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C19348c defaultState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C19349d idleState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C19350e paramState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C19347b connectingState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C19346a connectedState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public volatile int retryTimes;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C43859e connectionStatus;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final C19352g requestStatus;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public volatile WebSocket socket;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final C19351f callback;

    /* JADX INFO: renamed from: com.kubi.network.socket.connect.RealConnection$a */
    /* JADX INFO: compiled from: RealConnection.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/network/socket/connect/RealConnection$a;", "Lsr/b;", "<init>", "(Lcom/kubi/network/socket/connect/RealConnection;)V", "Landroid/os/Message;", "msg", "", "c", "(Landroid/os/Message;)Z", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "", "d", "(Ljava/lang/Object;)Z", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\ncom/kubi/network/socket/connect/RealConnection$ConnectedState\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,431:1\n52#2,33:432\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\ncom/kubi/network/socket/connect/RealConnection$ConnectedState\n*L\n414#1:432,33\n*E\n"})
    public final class C19346a extends C44539b {
        /* JADX WARN: Code duplicated, block: B:26:0x003d  */
        /* JADX INFO: renamed from: d */
        public final boolean m42931d(Object msg) {
            String message;
            boolean zStartsWith$default = false;
            try {
                if (msg instanceof String) {
                    WebSocket webSocket = RealConnection.this.socket;
                    return webSocket != null && webSocket.send((String) msg);
                }
                if (!(msg instanceof ByteString)) {
                    throw new IllegalStateException("Only String and ByteString data sending is supported");
                }
                WebSocket webSocket2 = RealConnection.this.socket;
                return webSocket2 != null && webSocket2.send((ByteString) msg);
            } catch (Throwable th2) {
                if ((th2 instanceof UnknownHostException) || (th2 instanceof SocketException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SSLException) || (th2 instanceof SSLProtocolException) || (th2 instanceof SSLPeerUnverifiedException) || (th2 instanceof ConnectionShutdownException)) {
                    zStartsWith$default = true;
                } else if (th2 instanceof SecurityException) {
                    String message2 = th2.getMessage();
                    if (message2 != null) {
                        zStartsWith$default = StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
                    }
                } else if ((th2 instanceof IOException) && (message = th2.getMessage()) != null && (StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) || StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) || StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) || StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) || message.equals("closed"))) {
                    zStartsWith$default = true;
                }
                if (zStartsWith$default) {
                    C44128b.m97263g("RealConnection", th2);
                } else {
                    C44170a.m97380b(th2, "RealConnection");
                }
                return true;
            }
        }

        public C19346a() {
        }

        @Override // sr.C44539b
        /* JADX INFO: renamed from: c */
        public boolean mo42930c(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i11 = msg.what;
            if (i11 == 3) {
                RealConnection.this.retryTimes = 0;
                RealConnection.this.config.getConnectTrack().mo100121i();
                RealConnection.this.config.getConnectTrack().mo100123k();
                RealConnection.this.config.getConnectTrack().mo100115c();
                RealConnection.this.connectionStatus.m96625g();
                return true;
            }
            if (i11 != 4) {
                if (i11 == 5) {
                    Object obj = msg.obj;
                    Intrinsics.checkNotNullExpressionValue(obj, "msg.obj");
                    if (m42931d(obj)) {
                        return true;
                    }
                    RealConnection.this.mo42926d(new ConnectSendException());
                    C44128b.m97259c("category_socket", "Socket发送失败");
                    return true;
                }
                if (i11 == 6) {
                    RealConnection.this.config.getActiveTrack().mo100107a();
                    C19352g c19352g = RealConnection.this.requestStatus;
                    Object obj2 = msg.obj;
                    Intrinsics.checkNotNullExpressionValue(obj2, "msg.obj");
                    c19352g.m96634b(obj2);
                    return true;
                }
                if (i11 != 7) {
                    return true;
                }
            }
            if (!RealConnection.this.m42922Z(msg.obj, ConnectSendException.class, ConnectCloseException.class, ConnectPingException.class, ConnectTokenException.class, ConnectUserException.class)) {
                return true;
            }
            WebSocket webSocket = RealConnection.this.socket;
            if (webSocket != null) {
                Object obj3 = msg.obj;
                Throwable th2 = obj3 instanceof Throwable ? (Throwable) obj3 : null;
                webSocket.close(1000, th2 != null ? th2.getMessage() : null);
            }
            RealConnection.this.socket = null;
            RealConnection realConnection = RealConnection.this;
            realConnection.m98561G(realConnection.idleState);
            RealConnection.this.m98555A(0);
            return true;
        }

        @Override // sr.C44539b
        /* JADX INFO: renamed from: a */
        public void mo42929a() {
            super.mo42929a();
            RealConnection.this.m98578y(0);
            RealConnection.this.m98578y(1);
            RealConnection.this.m98578y(2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.connect.RealConnection$b */
    /* JADX INFO: compiled from: RealConnection.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/network/socket/connect/RealConnection$b;", "Lsr/b;", "<init>", "(Lcom/kubi/network/socket/connect/RealConnection;)V", "Landroid/os/Message;", "msg", "", "c", "(Landroid/os/Message;)Z", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "b", "Lcom/kubi/network/socket/exception/ConnectTimeoutException;", "Lcom/kubi/network/socket/exception/ConnectTimeoutException;", "timeout", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class C19347b extends C44539b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ConnectTimeoutException timeout = new ConnectTimeoutException();

        public C19347b() {
        }

        @Override // sr.C44539b
        /* JADX INFO: renamed from: c */
        public boolean mo42930c(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i11 = msg.what;
            if (i11 == 2) {
                try {
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.network.socket.model.TokenEntity");
                    TokenEntity tokenEntity = (TokenEntity) obj;
                    RealConnection.this.config.getConnectTrack().mo100118f(tokenEntity);
                    RealConnection realConnection = RealConnection.this;
                    realConnection.socket = realConnection.config.getOkHttpClient().newWebSocket(new Request.Builder().url(tokenEntity.getWsUrl()).build(), RealConnection.this.callback);
                    RealConnection realConnection2 = RealConnection.this;
                    realConnection2.m98558D(7, this.timeout, realConnection2.config.getConnectTimeout());
                    return true;
                } catch (Throwable th2) {
                    RealConnection.this.mo42926d(new ConnectFailException(th2));
                    return true;
                }
            }
            if (i11 == 3) {
                RealConnection realConnection3 = RealConnection.this;
                realConnection3.m98561G(realConnection3.connectedState);
                RealConnection.this.m98555A(3);
                return true;
            }
            if ((i11 != 4 && i11 != 7) || !RealConnection.this.m42922Z(msg.obj, ConnectCloseException.class, ConnectUserException.class, FlowTimeoutException.class, ConnectTimeoutException.class, ConnectFailException.class)) {
                return true;
            }
            Object obj2 = msg.obj;
            Throwable connectUnknownException = obj2 instanceof Throwable ? (Throwable) obj2 : null;
            if (connectUnknownException == null) {
                connectUnknownException = new ConnectUnknownException();
            }
            ConnectFailException connectFailException = new ConnectFailException(connectUnknownException);
            RealConnection.this.config.getConnectTrack().mo100117e(connectFailException);
            RealConnection.this.config.getConnectTrack().mo100124l(connectFailException);
            WebSocket webSocket = RealConnection.this.socket;
            if (webSocket != null) {
                webSocket.close(1000, "timeout close");
            }
            RealConnection.this.socket = null;
            RealConnection realConnection4 = RealConnection.this;
            realConnection4.m98561G(realConnection4.idleState);
            RealConnection.this.m98555A(0);
            return true;
        }

        @Override // sr.C44539b
        /* JADX INFO: renamed from: a */
        public void mo42929a() {
            super.mo42929a();
            RealConnection.this.m98578y(0);
            RealConnection.this.m98578y(1);
            RealConnection.this.m98578y(5);
            RealConnection.this.m98578y(6);
            RealConnection.this.m98579z(7, this.timeout);
        }

        @Override // sr.C44539b
        /* JADX INFO: renamed from: b */
        public void mo42932b() {
            super.mo42932b();
            RealConnection.this.m98579z(7, this.timeout);
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.connect.RealConnection$c */
    /* JADX INFO: compiled from: RealConnection.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/network/socket/connect/RealConnection$c;", "Lsr/b;", "<init>", "(Lcom/kubi/network/socket/connect/RealConnection;)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class C19348c extends C44539b {
        public C19348c() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.connect.RealConnection$d */
    /* JADX INFO: compiled from: RealConnection.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/network/socket/connect/RealConnection$d;", "Lsr/b;", "<init>", "(Lcom/kubi/network/socket/connect/RealConnection;)V", "Landroid/os/Message;", "msg", "", "c", "(Landroid/os/Message;)Z", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "Lcom/kubi/network/socket/exception/FlowTimeoutException;", "Lcom/kubi/network/socket/exception/FlowTimeoutException;", "timeout", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class C19349d extends C44539b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final FlowTimeoutException timeout = new FlowTimeoutException();

        public C19349d() {
        }

        @Override // sr.C44539b
        /* JADX INFO: renamed from: c */
        public boolean mo42930c(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i11 = msg.what;
            if (i11 == 0) {
                if (RealConnection.this.retryTimes == 0) {
                    RealConnection.this.connectionStatus.m96627i();
                    RealConnection.this.connectionStatus.m96626h();
                    RealConnection.this.config.getConnectTrack().mo100114b();
                }
                if (RealConnection.this.retryTimes > RealConnection.this.config.getConnectRetryCount()) {
                    RealConnection.this.m98571r("channel[" + RealConnection.this.config.getTokenProvider().hashCode() + "] wait reconnect");
                } else if (RealConnection.this.retryTimes == RealConnection.this.config.getConnectRetryCount()) {
                    RealConnection.this.retryTimes++;
                    RealConnection.this.connectionStatus.m96627i();
                    RealConnection.this.config.getConnectTrack().mo100119g();
                } else {
                    RealConnection.this.retryTimes++;
                    if (C19391g.f36153a.m43065h()) {
                        RealConnection realConnection = RealConnection.this;
                        realConnection.m98558D(7, this.timeout, realConnection.config.getFlowTimeout());
                        RealConnection.this.config.getConnectTrack().mo100113a();
                        RealConnection realConnection2 = RealConnection.this;
                        realConnection2.m98561G(realConnection2.paramState);
                        RealConnection.this.m98555A(1);
                    } else {
                        RealConnection realConnection3 = RealConnection.this;
                        realConnection3.retryTimes = realConnection3.config.getConnectRetryCount();
                        RealConnection realConnection4 = RealConnection.this;
                        realConnection4.m98557C(0, realConnection4.config.getConnectRetryInterval());
                    }
                }
            } else if (i11 == 7 && RealConnection.this.m42922Z(msg.obj, ConnectUserException.class, ConnectSendException.class, ConnectNetworkException.class) && RealConnection.this.retryTimes > RealConnection.this.config.getConnectRetryCount()) {
                RealConnection.this.m98555A(0);
                RealConnection.this.retryTimes = 0;
            }
            return true;
        }

        @Override // sr.C44539b
        /* JADX INFO: renamed from: a */
        public void mo42929a() {
            super.mo42929a();
            RealConnection.this.m98578y(1);
            RealConnection.this.m98578y(2);
            RealConnection.this.m98578y(3);
            RealConnection.this.m98578y(4);
            RealConnection.this.m98578y(5);
            RealConnection.this.m98578y(6);
            RealConnection.this.m98579z(7, this.timeout);
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.connect.RealConnection$e */
    /* JADX INFO: compiled from: RealConnection.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/network/socket/connect/RealConnection$e;", "Lsr/b;", "<init>", "(Lcom/kubi/network/socket/connect/RealConnection;)V", "Landroid/os/Message;", "msg", "", "c", "(Landroid/os/Message;)Z", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "b", "", "I", "counter", "Lcom/kubi/network/socket/exception/TokenTimeoutException;", "Lcom/kubi/network/socket/exception/TokenTimeoutException;", "timeout", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class C19350e extends C44539b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public volatile int counter;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final TokenTimeoutException timeout = new TokenTimeoutException();

        public C19350e() {
        }

        /* JADX INFO: renamed from: e */
        public static final void m42934e(RealConnection this$0, int i11, C19350e this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            try {
                TokenEntity tokenEntityM99662a = InterfaceC45068c.a.m99662a(this$0.config.getTokenProvider(), false, 1, null);
                if (i11 == this$1.counter) {
                    this$0.m98556B(1, tokenEntityM99662a);
                }
            } catch (Throwable th2) {
                if (i11 == this$1.counter) {
                    this$0.mo42926d(new TokenFailException(th2));
                }
            }
        }

        @Override // sr.C44539b
        /* JADX INFO: renamed from: c */
        public boolean mo42930c(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i11 = msg.what;
            if (i11 != 1) {
                if ((i11 == 4 || i11 == 7) && RealConnection.this.m42922Z(msg.obj, ConnectUserException.class, FlowTimeoutException.class, TokenTimeoutException.class, TokenFailException.class)) {
                    Object obj = msg.obj;
                    Throwable connectUnknownException = obj instanceof Throwable ? (Throwable) obj : null;
                    if (connectUnknownException == null) {
                        connectUnknownException = new ConnectUnknownException();
                    }
                    TokenFailException tokenFailException = new TokenFailException(connectUnknownException);
                    RealConnection.this.config.getConnectTrack().mo100122j(tokenFailException);
                    RealConnection.this.config.getConnectTrack().mo100124l(tokenFailException);
                    RealConnection realConnection = RealConnection.this;
                    realConnection.m98561G(realConnection.idleState);
                    RealConnection.this.m98555A(0);
                }
            } else if (msg.obj == null) {
                final int i12 = this.counter;
                RealConnection.this.config.getConnectTrack().mo100116d();
                Executor executorM94137c = C42917g.m94137c();
                final RealConnection realConnection2 = RealConnection.this;
                executorM94137c.execute(new Runnable() { // from class: qr.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        RealConnection.C19350e.m42934e(realConnection2, i12, this);
                    }
                });
                RealConnection realConnection3 = RealConnection.this;
                realConnection3.m98558D(7, this.timeout, realConnection3.config.getTokenTimeout());
            } else {
                RealConnection.this.config.getConnectTrack().mo100120h();
                RealConnection realConnection4 = RealConnection.this;
                realConnection4.m98561G(realConnection4.connectingState);
                RealConnection.this.m98556B(2, msg.obj);
            }
            return true;
        }

        @Override // sr.C44539b
        /* JADX INFO: renamed from: a */
        public void mo42929a() {
            super.mo42929a();
            this.counter++;
            RealConnection.this.m98578y(0);
            RealConnection.this.m98578y(2);
            RealConnection.this.m98578y(3);
            RealConnection.this.m98578y(5);
            RealConnection.this.m98578y(6);
            RealConnection.this.m98579z(7, this.timeout);
        }

        @Override // sr.C44539b
        /* JADX INFO: renamed from: b */
        public void mo42932b() {
            super.mo42932b();
            this.counter++;
            RealConnection.this.m98579z(7, this.timeout);
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.connect.RealConnection$f */
    /* JADX INFO: compiled from: RealConnection.kt */
    @Metadata(m90083d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ)\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"com/kubi/network/socket/connect/RealConnection$f", "Lokhttp3/WebSocketListener;", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", "", "text", "onMessage", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "Lokio/ByteString;", "bytes", "(Lokhttp3/WebSocket;Lokio/ByteString;)V", "", "t", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "", "code", "reason", "onClosed", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19351f extends WebSocketListener {
        @Override // okhttp3.WebSocketListener
        public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(text, "text");
            C44128b.m97268l("category_socket", "text.resp= " + text);
            if (Intrinsics.areEqual(webSocket, RealConnection.this.socket)) {
                RealConnection.this.m98556B(6, text);
            }
        }

        public C19351f() {
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(reason, "reason");
            if (Intrinsics.areEqual(webSocket, RealConnection.this.socket)) {
                RealConnection.this.mo42926d(new ConnectCloseException(new ChannelCloseException(), null, 2, null));
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t11, @Nullable Response response) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(t11, "t");
            if (Intrinsics.areEqual(webSocket, RealConnection.this.socket)) {
                RealConnection.this.mo42926d(new ConnectCloseException(t11, response));
                RealConnection.this.config.getTokenProvider().mo43097a();
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(response, "response");
            if (Intrinsics.areEqual(webSocket, RealConnection.this.socket)) {
                RealConnection.this.m98555A(3);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString bytes) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            if (Intrinsics.areEqual(webSocket, RealConnection.this.socket)) {
                RealConnection.this.m98556B(6, bytes);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.connect.RealConnection$g */
    /* JADX INFO: compiled from: RealConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"com/kubi/network/socket/connect/RealConnection$g", "Lqr/i;", "", "msg", "", "e", "(Ljava/lang/Object;)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19352g extends AbstractC43863i<Object, Object> {
        public C19352g(C43859e c43859e) {
            super(c43859e);
        }

        @Override // p570qr.AbstractC43863i
        /* JADX INFO: renamed from: e */
        public void mo42935e(@NotNull Object msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            RealConnection.this.m98556B(5, msg);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
    /* JADX INFO: renamed from: Z */
    public final boolean m42922Z(Object obj, Class<?>... expects) {
        if (obj != null) {
            for (Class<?> cls : expects) {
                if (Intrinsics.areEqual(obj.getClass(), cls)) {
                    if (cls != null) {
                        return true;
                    }
                }
            }
            cls = null;
            if (cls != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection(@NotNull WebSocketClient client, @NotNull WebSocketClient.C19339a config) {
        super("RealConnection");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(config, "config");
        this.client = client;
        this.config = config;
        C19348c c19348c = new C19348c();
        this.defaultState = c19348c;
        C19349d c19349d = new C19349d();
        this.idleState = c19349d;
        C19350e c19350e = new C19350e();
        this.paramState = c19350e;
        C19347b c19347b = new C19347b();
        this.connectingState = c19347b;
        C19346a c19346a = new C19346a();
        this.connectedState = c19346a;
        C43859e c43859e = new C43859e(null, 1, null);
        this.connectionStatus = c43859e;
        this.requestStatus = new C19352g(c43859e);
        this.callback = new C19351f();
        m98563j(c19348c);
        m98564k(c19349d, c19348c);
        m98564k(c19350e, c19348c);
        m98564k(c19347b, c19348c);
        m98564k(c19346a, c19348c);
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
        this.config.getActiveTrack().start();
        m98559E(this.defaultState);
        m98560F();
        m98561G(this.idleState);
        m98555A(0);
    }

    @Override // p570qr.InterfaceC43861g
    /* JADX INFO: renamed from: d */
    public void mo42926d(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m98556B(7, throwable);
    }

    @Override // p570qr.InterfaceC43861g
    public void disconnect() {
        this.config.getActiveTrack().stop();
        m98556B(4, new ConnectUserException());
        m98576w();
    }

    @Override // p570qr.InterfaceC43861g
    /* JADX INFO: renamed from: e */
    public void mo42927e(@NotNull Object request, @Nullable InterfaceC37582c callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.requestStatus.m96637f(request);
    }

    @Override // p570qr.InterfaceC43861g
    /* JADX INFO: renamed from: f */
    public void mo42928f(@NotNull Function1<? super Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.requestStatus.m96636d(callback);
    }
}
