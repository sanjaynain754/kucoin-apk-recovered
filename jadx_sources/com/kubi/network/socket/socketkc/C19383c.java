package com.kubi.network.socket.socketkc;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.socket.exception.ConnectPingException;
import org.jetbrains.annotations.NotNull;
import p570qr.InterfaceC43861g;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.network.socket.socketkc.c */
/* JADX INFO: compiled from: SocketKCConnection.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 ¨\u0006#"}, m90084d2 = {"Lcom/kubi/network/socket/socketkc/c;", "", "", "pingInterval", "pingTimeOut", "Lqr/g;", "Lcom/kubi/network/api/model/NetworkRequest;", "Lcom/kubi/network/api/model/NetworkMessage;", "socket", "<init>", "(IILqr/g;)V", "", "g", "()V", "f", "c", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "getPingInterval", "()I", CmcdData.Factory.STREAMING_FORMAT_HLS, "(I)V", "b", "getPingTimeOut", "i", "Lqr/g;", "Landroid/os/Handler;", "d", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "e", "Ljava/lang/Runnable;", "disconnectRunnable", "pingRunnable", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19383c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int pingInterval;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int pingTimeOut;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43861g<NetworkRequest, NetworkMessage<?>> socket;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Runnable disconnectRunnable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Runnable pingRunnable;

    public C19383c(int i11, int i12, @NotNull InterfaceC43861g<NetworkRequest, NetworkMessage<?>> socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.pingInterval = i11;
        this.pingTimeOut = i12;
        this.socket = socket;
        this.handler = new Handler(Looper.getMainLooper());
        this.disconnectRunnable = new Runnable() { // from class: com.kubi.network.socket.socketkc.a
            @Override // java.lang.Runnable
            public final void run() {
                C19383c.m43034d(this.f36135b);
            }
        };
        this.pingRunnable = new Runnable() { // from class: com.kubi.network.socket.socketkc.b
            @Override // java.lang.Runnable
            public final void run() {
                C19383c.m43035e(this.f36136b);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public static final void m43034d(C19383c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.socket.mo42926d(new ConnectPingException());
    }

    /* JADX INFO: renamed from: e */
    public static final void m43035e(C19383c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m43038g();
    }

    /* JADX INFO: renamed from: c */
    public final void m43036c() {
        this.handler.removeCallbacks(this.pingRunnable);
        this.handler.removeCallbacks(this.disconnectRunnable);
    }

    /* JADX INFO: renamed from: f */
    public final void m43037f() {
        C44128b.m97268l("category_socket", "ClientHeartbeat receive pong");
        m43036c();
        this.handler.postDelayed(this.pingRunnable, this.pingInterval);
    }

    /* JADX INFO: renamed from: g */
    public final void m43038g() {
        C44128b.m97268l("category_socket", "ClientHeartbeat send ping");
        InterfaceC43861g.a.m96632a(this.socket, new NetworkRequest(0, null, MapsKt.mapOf(TuplesKt.m90091to("type", "ping")), 3, null), null, 2, null);
        m43036c();
        this.handler.postDelayed(this.disconnectRunnable, this.pingTimeOut);
    }

    /* JADX INFO: renamed from: h */
    public final void m43039h(int i11) {
        this.pingInterval = i11;
    }

    /* JADX INFO: renamed from: i */
    public final void m43040i(int i11) {
        this.pingTimeOut = i11;
    }

    public /* synthetic */ C19383c(int i11, int i12, InterfaceC43861g interfaceC43861g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 50000 : i11, (i13 & 2) != 0 ? 10000 : i12, interfaceC43861g);
    }
}
