package com.kubi.network.socket.engineio;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.socket.exception.ConnectPingException;
import org.jetbrains.annotations.NotNull;
import p570qr.InterfaceC43861g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.network.socket.engineio.e */
/* JADX INFO: compiled from: EngineIOConnection.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R$\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/network/socket/engineio/e;", "", "", "pingInterval", "pingTimeOut", "Lqr/g;", "Lcom/kubi/network/socket/engineio/b;", "socket", "<init>", "(JJLqr/g;)V", "", "e", "()V", "d", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "getPingInterval", "()J", "f", "(J)V", "getPingTimeOut", "g", "c", "Lqr/g;", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "disconnectRunnable", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19365e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long pingInterval;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long pingTimeOut;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43861g<C19362b<?>, Object> socket;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Runnable disconnectRunnable;

    public C19365e(long j11, long j12, @NotNull InterfaceC43861g<C19362b<?>, Object> socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.pingInterval = j11;
        this.pingTimeOut = j12;
        this.socket = socket;
        this.handler = new Handler(Looper.getMainLooper());
        this.disconnectRunnable = new Runnable() { // from class: com.kubi.network.socket.engineio.d
            @Override // java.lang.Runnable
            public final void run() {
                C19365e.m42968c(this.f36082b);
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public static final void m42968c(C19365e this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.socket.mo42926d(new ConnectPingException());
    }

    /* JADX INFO: renamed from: b */
    public final void m42969b() {
        this.handler.removeCallbacks(this.disconnectRunnable);
    }

    /* JADX INFO: renamed from: d */
    public final void m42970d() {
        C44128b.m97268l("category_socket", "ServerHeartbeat receive ping");
        m42969b();
    }

    /* JADX INFO: renamed from: e */
    public final void m42971e() {
        C44128b.m97268l("category_socket", "ServerHeartbeat send pong");
        InterfaceC43861g.a.m96632a(this.socket, new C19362b("pong", null, 2, null), null, 2, null);
        m42969b();
        this.handler.postDelayed(this.disconnectRunnable, this.pingInterval + this.pingTimeOut);
    }

    /* JADX INFO: renamed from: f */
    public final void m42972f(long j11) {
        this.pingInterval = j11;
    }

    /* JADX INFO: renamed from: g */
    public final void m42973g(long j11) {
        this.pingTimeOut = j11;
    }

    public /* synthetic */ C19365e(long j11, long j12, InterfaceC43861g interfaceC43861g, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 50000L : j11, (i11 & 2) != 0 ? 10000L : j12, interfaceC43861g);
    }
}
