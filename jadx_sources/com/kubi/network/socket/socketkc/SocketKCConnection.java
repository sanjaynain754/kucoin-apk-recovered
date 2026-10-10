package com.kubi.network.socket.socketkc;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.api.model.NetworkResponse;
import com.kubi.network.socket.WebSocketClient;
import com.kubi.network.socket.connect.RealConnection;
import com.kubi.network.socket.exception.ConnectPingException;
import com.kubi.network.socket.exception.ConnectSendException;
import com.kubi.network.socket.exception.ConnectTokenException;
import com.kubi.network.socket.model.TokenEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import fr.InterfaceC37582c;
import fr.InterfaceC37583d;
import java.io.IOException;
import java.net.ProtocolException;
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
import org.json.JSONObject;
import p570qr.AbstractC43863i;
import p570qr.C43859e;
import p570qr.C43865k;
import p570qr.InterfaceC43861g;
import p605rr.C44170a;
import p672ur.C45298h;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: SocketKCConnection.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001?\b\u0000\u0018\u0000 C2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0002#DB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J!\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J'\u0010+\u001a\u00020\u000e2\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u000e0*H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\b\u0018\u00010-R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00103R\u001e\u00107\u001a\f\u0012\b\u0012\u00060-R\u00020\u0000058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, m90084d2 = {"Lcom/kubi/network/socket/socketkc/SocketKCConnection;", "Lqr/g;", "Lcom/kubi/network/api/model/NetworkRequest;", "Lcom/kubi/network/api/model/NetworkMessage;", "Lcom/kubi/network/socket/WebSocketClient;", "client", "Lcom/kubi/network/socket/WebSocketClient$a;", "config", "<init>", "(Lcom/kubi/network/socket/WebSocketClient;Lcom/kubi/network/socket/WebSocketClient$a;)V", "", "id", "Lcom/kubi/network/api/model/NetworkResponse;", "response", "", "o", "(ILcom/kubi/network/api/model/NetworkResponse;)V", "", "throwable", "p", "(ILjava/lang/Throwable;)V", "", "text", "n", "(Ljava/lang/Object;)V", "connect", "()V", "d", "(Ljava/lang/Throwable;)V", "disconnect", "", "c", "()Ljava/lang/String;", "Lfr/d;", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lfr/d;)V", "b", "request", "Lfr/c;", "q", "(Lcom/kubi/network/api/model/NetworkRequest;Lfr/c;)V", "Lkotlin/Function1;", "f", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;", "m", "(I)Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;", "Lcom/kubi/network/socket/WebSocketClient;", "Lcom/kubi/network/socket/WebSocketClient$a;", "Lcom/kubi/network/socket/socketkc/c;", "Lcom/kubi/network/socket/socketkc/c;", "heartbeat", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "asyncCalls", "Lqr/e;", "e", "Lqr/e;", "connectionStatus", "Lcom/kubi/network/socket/connect/RealConnection;", "Lcom/kubi/network/socket/connect/RealConnection;", "connection", "com/kubi/network/socket/socketkc/SocketKCConnection$d", "g", "Lcom/kubi/network/socket/socketkc/SocketKCConnection$d;", "requestStatus", CmcdData.Factory.STREAMING_FORMAT_HLS, "Companion", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketKCConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketKCConnection.kt\ncom/kubi/network/socket/socketkc/SocketKCConnection\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n+ 3 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,270:1\n52#2,33:271\n52#2,33:308\n71#3,4:304\n*S KotlinDebug\n*F\n+ 1 SocketKCConnection.kt\ncom/kubi/network/socket/socketkc/SocketKCConnection\n*L\n167#1:271,33\n206#1:308,33\n195#1:304,4\n*E\n"})
public final class SocketKCConnection implements InterfaceC43861g<NetworkRequest, NetworkMessage<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient.C19339a config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C19383c heartbeat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayDeque<C19377a> asyncCalls;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C43859e connectionStatus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final RealConnection connection;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C19380d requestStatus;

    /* JADX INFO: renamed from: com.kubi.network.socket.socketkc.SocketKCConnection$a */
    /* JADX INFO: compiled from: SocketKCConnection.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/network/socket/socketkc/SocketKCConnection$a;", "", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "Lfr/c;", TUIConstants.TUIChat.CALL_BACK, "<init>", "(Lcom/kubi/network/socket/socketkc/SocketKCConnection;Lcom/kubi/network/api/model/NetworkRequest;Lfr/c;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/network/api/model/NetworkRequest;", "b", "()Lcom/kubi/network/api/model/NetworkRequest;", "Lfr/c;", "()Lfr/c;", "Lur/h;", "c", "Lur/h;", "d", "()Lur/h;", "track", "Lokio/AsyncTimeout;", "Lokio/AsyncTimeout;", "()Lokio/AsyncTimeout;", "timeout", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class C19377a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final NetworkRequest request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final InterfaceC37582c callback;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final C45298h track;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final AsyncTimeout timeout;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ SocketKCConnection f36129e;

        /* JADX INFO: renamed from: com.kubi.network.socket.socketkc.SocketKCConnection$a$a */
        /* JADX INFO: compiled from: SocketKCConnection.kt */
        @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"com/kubi/network/socket/socketkc/SocketKCConnection$a$a", "Lokio/AsyncTimeout;", "", "timedOut", "()V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class a extends AsyncTimeout {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ SocketKCConnection f36130a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C19377a f36131b;

            public a(SocketKCConnection socketKCConnection, C19377a c19377a) {
                this.f36130a = socketKCConnection;
                this.f36131b = c19377a;
            }

            @Override // okio.AsyncTimeout
            public void timedOut() {
                this.f36130a.m43024p(this.f36131b.getRequest().getId(), new TimeoutException("request is timeout"));
            }
        }

        public C19377a(@NotNull SocketKCConnection socketKCConnection, @Nullable NetworkRequest request, InterfaceC37582c interfaceC37582c) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f36129e = socketKCConnection;
            this.request = request;
            this.callback = interfaceC37582c;
            C45298h requestTrack = interfaceC37582c == null ? null : socketKCConnection.config.getRequestTrack();
            this.track = requestTrack;
            a aVar = new a(socketKCConnection, this);
            if (requestTrack != null) {
                requestTrack.m100147f(request.getId());
            }
            aVar.timeout(socketKCConnection.config.getRequestTimeout(), TimeUnit.MILLISECONDS);
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

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final C45298h getTrack() {
            return this.track;
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.socketkc.SocketKCConnection$b */
    /* JADX INFO: compiled from: SocketKCConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m90084d2 = {"com/kubi/network/socket/socketkc/SocketKCConnection$b", "Lfr/d;", "", "onConnecting", "()V", "onDisconnect", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19378b implements InterfaceC37583d {
        public C19378b() {
        }

        @Override // fr.InterfaceC37583d
        public void onConnecting() {
            SocketKCConnection.this.connectionStatus.m96626h();
        }

        @Override // fr.InterfaceC37583d
        public void onDisconnect() {
            SocketKCConnection.this.connectionStatus.m96627i();
        }

        @Override // fr.InterfaceC37583d
        public void onConnected() {
            InterfaceC37583d.a.m84720a(this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.socketkc.SocketKCConnection$c */
    /* JADX INFO: compiled from: SocketKCConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m90084d2 = {"com/kubi/network/socket/socketkc/SocketKCConnection$c", "Lfr/d;", "", "onConnected", "()V", "onDisconnect", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSocketKCConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketKCConnection.kt\ncom/kubi/network/socket/socketkc/SocketKCConnection$connectionStatus$1$1\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,270:1\n52#2,33:271\n*S KotlinDebug\n*F\n+ 1 SocketKCConnection.kt\ncom/kubi/network/socket/socketkc/SocketKCConnection$connectionStatus$1$1\n*L\n55#1:271,33\n*E\n"})
    public static final class C19379c implements InterfaceC37583d {
        /* JADX WARN: Code duplicated, block: B:32:0x0071  */
        @Override // fr.InterfaceC37583d
        public void onConnected() {
            String message;
            boolean zStartsWith$default = true;
            try {
                TokenEntity token = SocketKCConnection.this.config.getTokenProvider().getToken(true);
                SocketKCConnection.this.heartbeat.m43039h(token.getPingInterval());
                SocketKCConnection.this.heartbeat.m43040i(token.getPingTimeout());
                SocketKCConnection.this.heartbeat.m43038g();
            } catch (Throwable th2) {
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
                    C44128b.m97263g("SocketKCConnection", th2);
                } else {
                    C44170a.m97380b(th2, "SocketKCConnection");
                }
                SocketKCConnection.this.mo42926d(new ConnectPingException());
            }
        }

        public C19379c() {
        }

        @Override // fr.InterfaceC37583d
        public void onDisconnect() {
            SocketKCConnection.this.heartbeat.m43036c();
        }

        @Override // fr.InterfaceC37583d
        public void onConnecting() {
            InterfaceC37583d.a.m84721b(this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.socketkc.SocketKCConnection$d */
    /* JADX INFO: compiled from: SocketKCConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/network/socket/socketkc/SocketKCConnection$d", "Lqr/i;", "Lcom/kubi/network/api/model/NetworkRequest;", "Lcom/kubi/network/api/model/NetworkMessage;", "msg", "", "g", "(Lcom/kubi/network/api/model/NetworkRequest;)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSocketKCConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketKCConnection.kt\ncom/kubi/network/socket/socketkc/SocketKCConnection$requestStatus$1\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,270:1\n52#2,33:271\n*S KotlinDebug\n*F\n+ 1 SocketKCConnection.kt\ncom/kubi/network/socket/socketkc/SocketKCConnection$requestStatus$1\n*L\n92#1:271,33\n*E\n"})
    public static final class C19380d extends AbstractC43863i<NetworkRequest, NetworkMessage<?>> {
        public C19380d(C43859e c43859e) {
            super(c43859e);
        }

        @Override // p570qr.AbstractC43863i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo42935e(@NotNull NetworkRequest msg) {
            String message;
            Intrinsics.checkNotNullParameter(msg, "msg");
            try {
                InterfaceC43861g.a.m96632a(SocketKCConnection.this.connection, SocketKCConnection.this.config.getChannelCodec().mo42991b(msg), null, 2, null);
            } catch (ProtocolException e11) {
                SocketKCConnection.this.m43024p(msg.getId(), e11);
            } catch (IOException e12) {
                SocketKCConnection.this.m43024p(msg.getId(), e12);
                boolean z11 = true;
                if (!(e12 instanceof UnknownHostException) && !(e12 instanceof SocketException) && !(e12 instanceof SocketTimeoutException) && !(e12 instanceof SSLException) && !(e12 instanceof SSLProtocolException) && !(e12 instanceof SSLPeerUnverifiedException) && !(e12 instanceof ConnectionShutdownException) && ((message = e12.getMessage()) == null || (!StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) && !message.equals("closed")))) {
                    z11 = false;
                }
                if (z11) {
                    C44128b.m97263g("SocketKCConnection", e12);
                } else {
                    C44170a.m97380b(e12, "SocketKCConnection");
                }
            }
        }
    }

    public SocketKCConnection(@NotNull WebSocketClient client, @NotNull WebSocketClient.C19339a config) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(config, "config");
        this.client = client;
        this.config = config;
        this.heartbeat = new C19383c(0, 0, this, 3, null);
        this.asyncCalls = new ArrayDeque<>();
        C43859e c43859e = new C43859e(null, 1, null);
        c43859e.m96624f(new C19379c());
        this.connectionStatus = c43859e;
        RealConnection realConnection = new RealConnection(client, config);
        realConnection.mo42923a(new C19378b());
        realConnection.mo42928f(new Function1<Object, Unit>() { // from class: com.kubi.network.socket.socketkc.SocketKCConnection$connection$1$2
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.m43022n(it);
            }
        });
        this.connection = realConnection;
        this.requestStatus = new C19380d(c43859e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:117:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: n */
    public final void m43022n(Object text) {
        String message;
        String message2;
        Object objM103844constructorimpl;
        boolean zStartsWith$default = false;
        try {
            C43865k<?> c43865kMo42990a = this.config.getChannelCodec().mo42990a(text);
            String type = c43865kMo42990a.getType();
            switch (type.hashCode()) {
                case 96393:
                    if (type.equals("ack")) {
                        try {
                            Integer numM66544n = DowngradeExKt.m66544n(c43865kMo42990a.getId());
                            if (numM66544n == null) {
                                throw new NullPointerException("id is null");
                            }
                            m43023o(numM66544n.intValue(), NetworkResponse.INSTANCE.success("request success"));
                            return;
                        } catch (Throwable th2) {
                            if ((th2 instanceof UnknownHostException) || (th2 instanceof SocketException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SSLException) || (th2 instanceof SSLProtocolException) || (th2 instanceof SSLPeerUnverifiedException) || (th2 instanceof ConnectionShutdownException)) {
                                zStartsWith$default = true;
                            } else if (th2 instanceof SecurityException) {
                                String message3 = th2.getMessage();
                                if (message3 != null) {
                                    zStartsWith$default = StringsKt.startsWith$default(message3, "Package android does not belong to", false, 2, (Object) null);
                                }
                            } else if ((th2 instanceof IOException) && (message2 = th2.getMessage()) != null && (StringsKt.startsWith$default(message2, "Required SETTINGS preface not received", false, 2, (Object) null) || StringsKt.startsWith$default(message2, "Unexpected response code for CONNECT", false, 2, (Object) null) || StringsKt.startsWith$default(message2, "exhausted all routes", false, 2, (Object) null) || StringsKt.startsWith$default(message2, "unexpected end of stream", false, 2, (Object) null) || StringsKt.startsWith$default(message2, "stream was reset: CANCEL", false, 2, (Object) null) || StringsKt.startsWith$default(message2, "Software caused connection abort", false, 2, (Object) null) || message2.equals("closed"))) {
                                zStartsWith$default = true;
                            }
                            if (zStartsWith$default) {
                                C44128b.m97263g("SocketKCConnection", th2);
                                return;
                            } else {
                                C44170a.m97380b(th2, "SocketKCConnection");
                                return;
                            }
                        }
                    }
                    break;
                case 3446776:
                    if (type.equals("pong")) {
                        this.heartbeat.m43037f();
                        return;
                    }
                    break;
                case 96784904:
                    if (type.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                        Object objM96638a = c43865kMo42990a.m96638a();
                        JSONObject jSONObject = objM96638a instanceof JSONObject ? (JSONObject) objM96638a : null;
                        Integer numValueOf = jSONObject != null ? Integer.valueOf(jSONObject.optInt("code")) : null;
                        if ((numValueOf != null && numValueOf.intValue() == 401) || (numValueOf != null && numValueOf.intValue() == 403)) {
                            this.config.getTokenProvider().mo43098b();
                            mo42926d(new ConnectTokenException());
                        }
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM103844constructorimpl = Result.m103844constructorimpl(StringsKt.toIntOrNull(c43865kMo42990a.getId()));
                            break;
                        } catch (Throwable th3) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
                        }
                        Integer num = (Integer) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
                        if (num != null) {
                            m43024p(num.intValue(), new RuntimeException("error: code = " + numValueOf));
                        }
                        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
                        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                        eventParametersBuilderAcquire.m42391b("code", C27039d.m66651k(numValueOf, 0));
                        eventParametersBuilderAcquire.m42393d(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, text.toString());
                        TechnologyEvent.m42388d("socket_kc_error", eventParametersBuilderAcquire);
                        return;
                    }
                    break;
                case 1233099618:
                    if (type.equals("welcome")) {
                        this.connectionStatus.m96625g();
                        this.config.getTokenProvider().mo43100d();
                        return;
                    }
                    break;
            }
            this.requestStatus.m96634b(new NetworkMessage(c43865kMo42990a.getId(), c43865kMo42990a.m96638a()));
        } catch (Exception e11) {
            if ((e11 instanceof UnknownHostException) || (e11 instanceof SocketException) || (e11 instanceof SocketTimeoutException) || (e11 instanceof SSLException) || (e11 instanceof SSLProtocolException) || (e11 instanceof SSLPeerUnverifiedException) || (e11 instanceof ConnectionShutdownException)) {
                zStartsWith$default = true;
            } else if (e11 instanceof SecurityException) {
                String message4 = e11.getMessage();
                if (message4 != null) {
                    zStartsWith$default = StringsKt.startsWith$default(message4, "Package android does not belong to", false, 2, (Object) null);
                }
            } else if ((e11 instanceof IOException) && (message = e11.getMessage()) != null && (StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) || StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) || StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) || StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) || message.equals("closed"))) {
                zStartsWith$default = true;
            }
            if (zStartsWith$default) {
                C44128b.m97263g("SocketKCConnection", e11);
            } else {
                C44170a.m97380b(e11, "SocketKCConnection");
            }
        }
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
        this.connection.disconnect();
    }

    @Override // p570qr.InterfaceC43861g
    /* JADX INFO: renamed from: f */
    public void mo42928f(@NotNull Function1<? super NetworkMessage<?>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.requestStatus.m96636d(callback);
    }

    /* JADX INFO: renamed from: m */
    public final C19377a m43025m(int id2) {
        synchronized (this.asyncCalls) {
            Iterator<C19377a> it = this.asyncCalls.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "asyncCalls.iterator()");
            while (it.hasNext()) {
                C19377a next = it.next();
                if (next.getRequest().getId() == id2) {
                    it.remove();
                    return next;
                }
            }
            Unit unit = Unit.INSTANCE;
            return null;
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
            this.asyncCalls.add(new C19377a(this, request, callback));
        }
        this.requestStatus.m96637f(request);
    }

    /* JADX INFO: renamed from: o */
    private final void m43023o(int id2, NetworkResponse<?> response) {
        InterfaceC37582c callback;
        C45298h track;
        AsyncTimeout timeout;
        C19377a c19377aM43025m = m43025m(id2);
        if (c19377aM43025m != null && (timeout = c19377aM43025m.getTimeout()) != null) {
            timeout.exit();
        }
        if (c19377aM43025m != null && (track = c19377aM43025m.getTrack()) != null) {
            track.m100145d(id2);
        }
        if (c19377aM43025m != null && (callback = c19377aM43025m.getCallback()) != null) {
            callback.mo23836a(response);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m43024p(int id2, Throwable throwable) {
        InterfaceC37582c callback;
        C45298h track;
        AsyncTimeout timeout;
        C19377a c19377aM43025m = m43025m(id2);
        if (c19377aM43025m != null && (timeout = c19377aM43025m.getTimeout()) != null) {
            timeout.exit();
        }
        if (c19377aM43025m != null && (track = c19377aM43025m.getTrack()) != null) {
            track.m100146e(id2, throwable);
        }
        if (c19377aM43025m != null && (callback = c19377aM43025m.getCallback()) != null) {
            callback.onFailure(throwable);
        }
    }
}
