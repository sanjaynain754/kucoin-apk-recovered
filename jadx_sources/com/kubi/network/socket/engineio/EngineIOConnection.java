package com.kubi.network.socket.engineio;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.kubi.network.socket.WebSocketClient;
import com.kubi.network.socket.connect.RealConnection;
import com.kubi.network.socket.exception.ChannelCloseException;
import com.kubi.network.socket.exception.ConnectCloseException;
import com.tencent.qcloud.tuicore.TUIConstants;
import fr.InterfaceC37582c;
import fr.InterfaceC37583d;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;
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

/* JADX INFO: compiled from: EngineIOConnection.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u00010\b\u0000\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J%\u0010\u001c\u001a\u00020\n2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\u00020\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00101¨\u00063"}, m90084d2 = {"Lcom/kubi/network/socket/engineio/EngineIOConnection;", "Lqr/g;", "Lcom/kubi/network/socket/engineio/b;", "", "Lcom/kubi/network/socket/WebSocketClient;", "client", "Lcom/kubi/network/socket/WebSocketClient$a;", "config", "<init>", "(Lcom/kubi/network/socket/WebSocketClient;Lcom/kubi/network/socket/WebSocketClient$a;)V", "", "connect", "()V", "", "throwable", "d", "(Ljava/lang/Throwable;)V", "disconnect", "", "c", "()Ljava/lang/String;", "Lfr/d;", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lfr/d;)V", "b", "request", "Lfr/c;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/kubi/network/socket/engineio/b;Lfr/c;)V", "Lkotlin/Function1;", "f", "(Lkotlin/jvm/functions/Function1;)V", "text", "k", "(Ljava/lang/Object;)V", "Lcom/kubi/network/socket/WebSocketClient;", "Lcom/kubi/network/socket/WebSocketClient$a;", "Lcom/kubi/network/socket/engineio/e;", "Lcom/kubi/network/socket/engineio/e;", "heartbeat", "Lqr/e;", "Lqr/e;", "connectionStatus", "Lcom/kubi/network/socket/connect/RealConnection;", "e", "Lcom/kubi/network/socket/connect/RealConnection;", "connection", "com/kubi/network/socket/engineio/EngineIOConnection$c", "Lcom/kubi/network/socket/engineio/EngineIOConnection$c;", "requestStatus", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEngineIOConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineIOConnection.kt\ncom/kubi/network/socket/engineio/EngineIOConnection\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,148:1\n52#2,33:149\n*S KotlinDebug\n*F\n+ 1 EngineIOConnection.kt\ncom/kubi/network/socket/engineio/EngineIOConnection\n*L\n95#1:149,33\n*E\n"})
public final class EngineIOConnection implements InterfaceC43861g<C19362b<?>, Object> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient.C19339a config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C19365e heartbeat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C43859e connectionStatus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final RealConnection connection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C19360c requestStatus;

    /* JADX INFO: renamed from: com.kubi.network.socket.engineio.EngineIOConnection$a */
    /* JADX INFO: compiled from: EngineIOConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m90084d2 = {"com/kubi/network/socket/engineio/EngineIOConnection$a", "Lfr/d;", "", "onConnecting", "()V", "onDisconnect", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19358a implements InterfaceC37583d {
        public C19358a() {
        }

        @Override // fr.InterfaceC37583d
        public void onConnecting() {
            EngineIOConnection.this.connectionStatus.m96626h();
        }

        @Override // fr.InterfaceC37583d
        public void onDisconnect() {
            EngineIOConnection.this.connectionStatus.m96627i();
        }

        @Override // fr.InterfaceC37583d
        public void onConnected() {
            InterfaceC37583d.a.m84720a(this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.engineio.EngineIOConnection$b */
    /* JADX INFO: compiled from: EngineIOConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"com/kubi/network/socket/engineio/EngineIOConnection$b", "Lfr/d;", "", "onDisconnect", "()V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19359b implements InterfaceC37583d {
        public C19359b() {
        }

        @Override // fr.InterfaceC37583d
        public void onDisconnect() {
            EngineIOConnection.this.heartbeat.m42969b();
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

    /* JADX INFO: renamed from: com.kubi.network.socket.engineio.EngineIOConnection$c */
    /* JADX INFO: compiled from: EngineIOConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/network/socket/engineio/EngineIOConnection$c", "Lqr/i;", "Lcom/kubi/network/socket/engineio/b;", "", "msg", "", "g", "(Lcom/kubi/network/socket/engineio/b;)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19360c extends AbstractC43863i<C19362b<?>, Object> {
        public C19360c(C43859e c43859e) {
            super(c43859e);
        }

        @Override // p570qr.AbstractC43863i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo42935e(@NotNull C19362b<?> msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            InterfaceC43861g.a.m96632a(EngineIOConnection.this.connection, C19363c.b.m42966a(msg), null, 2, null);
        }
    }

    public EngineIOConnection(@NotNull WebSocketClient client, @NotNull WebSocketClient.C19339a config) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(config, "config");
        this.client = client;
        this.config = config;
        this.heartbeat = new C19365e(0L, 0L, this, 3, null);
        C43859e c43859e = new C43859e(null, 1, null);
        c43859e.m96624f(new C19359b());
        this.connectionStatus = c43859e;
        RealConnection realConnection = new RealConnection(client, config);
        realConnection.mo42923a(new C19358a());
        realConnection.mo42928f(new Function1<Object, Unit>() { // from class: com.kubi.network.socket.engineio.EngineIOConnection$connection$1$2
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
                this.this$0.m42953k(it);
            }
        });
        this.connection = realConnection;
        this.requestStatus = new C19360c(c43859e);
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
    public void mo42928f(@NotNull Function1<? super Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.requestStatus.m96636d(callback);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: k */
    public final void m42953k(Object text) {
        String message;
        C44128b.m97268l("category_socket", "socket.resp = " + text);
        try {
            C19362b<?> c19362bM42963a = C19363c.a.m42963a(text);
            String type = c19362bM42963a.getType();
            switch (type.hashCode()) {
                case 3417674:
                    if (type.equals(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) {
                        Object objM42958a = c19362bM42963a.m42958a();
                        Intrinsics.checkNotNull(objM42958a, "null cannot be cast to non-null type kotlin.String");
                        C19361a c19361a = new C19361a((String) objM42958a);
                        this.heartbeat.m42972f(c19361a.getPingInterval());
                        this.heartbeat.m42973g(c19361a.getPingTimeout());
                        this.connectionStatus.m96625g();
                    }
                    break;
                case 3441010:
                    if (type.equals("ping")) {
                        this.heartbeat.m42970d();
                        this.heartbeat.m42971e();
                        break;
                    }
                    break;
                case 94756344:
                    if (type.equals("close")) {
                        mo42926d(new ConnectCloseException(new ChannelCloseException(), null, 2, null));
                        break;
                    }
                    break;
                case 96784904:
                    if (type.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                        mo42926d(new ConnectCloseException(new ChannelCloseException(), null, 2, null));
                        break;
                    }
                    break;
                case 954925063:
                    if (type.equals("message")) {
                        C19360c c19360c = this.requestStatus;
                        Object objM42958a2 = c19362bM42963a.m42958a();
                        Intrinsics.checkNotNull(objM42958a2, "null cannot be cast to non-null type kotlin.Any");
                        c19360c.m96634b(objM42958a2);
                        break;
                    }
                    break;
            }
        } catch (Exception e11) {
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
                C44128b.m97263g("category_socket", e11);
            } else {
                C44170a.m97380b(e11, "category_socket");
            }
        }
    }

    @Override // p570qr.InterfaceC43861g
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo42927e(@NotNull C19362b<?> request, @Nullable InterfaceC37582c callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.requestStatus.m96637f(request);
    }
}
