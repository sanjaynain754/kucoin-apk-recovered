package p570qr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import fr.InterfaceC37583d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qr.e */
/* JADX INFO: compiled from: IConnection.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lqr/e;", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "", "j", "()Ljava/lang/String;", "Lfr/d;", TUIConstants.TUIChat.CALL_BACK, "", "f", "(Lfr/d;)V", "o", "g", "()V", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "k", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/concurrent/Executor;", "b", "Ljava/lang/String;", "connectStatus", "", "c", "Ljava/util/List;", "statusCalls", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C43859e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile String connectStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public List<InterfaceC37583d> statusCalls;

    public C43859e(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.connectStatus = "disconnect";
        this.statusCalls = new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public static final void m96620e(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m96621l(InterfaceC37583d callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onDisconnect();
    }

    /* JADX INFO: renamed from: m */
    public static final void m96622m(InterfaceC37583d callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onConnecting();
    }

    /* JADX INFO: renamed from: n */
    public static final void m96623n(InterfaceC37583d callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onConnected();
    }

    /* JADX INFO: renamed from: f */
    public final void m96624f(@NotNull InterfaceC37583d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.statusCalls) {
            this.statusCalls.add(callback);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m96625g() {
        if (Intrinsics.areEqual(this.connectStatus, "connected")) {
            return;
        }
        this.connectStatus = "connected";
        m96629k();
    }

    /* JADX INFO: renamed from: h */
    public final void m96626h() {
        if (Intrinsics.areEqual(this.connectStatus, "connecting")) {
            return;
        }
        this.connectStatus = "connecting";
        m96629k();
    }

    /* JADX INFO: renamed from: i */
    public final void m96627i() {
        if (Intrinsics.areEqual(this.connectStatus, "disconnect")) {
            return;
        }
        this.connectStatus = "disconnect";
        m96629k();
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getConnectStatus() {
        return this.connectStatus;
    }

    /* JADX INFO: renamed from: k */
    public final void m96629k() {
        ArrayList<InterfaceC37583d> arrayList = new ArrayList();
        synchronized (this.statusCalls) {
            arrayList.addAll(this.statusCalls);
        }
        for (final InterfaceC37583d interfaceC37583d : arrayList) {
            String str = this.connectStatus;
            int iHashCode = str.hashCode();
            if (iHashCode != -775651656) {
                if (iHashCode != -579210487) {
                    if (iHashCode == 530405532 && str.equals("disconnect")) {
                        this.executor.execute(new Runnable() { // from class: qr.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                C43859e.m96621l(interfaceC37583d);
                            }
                        });
                    }
                } else if (str.equals("connected")) {
                    this.executor.execute(new Runnable() { // from class: qr.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C43859e.m96623n(interfaceC37583d);
                        }
                    });
                }
            } else if (str.equals("connecting")) {
                this.executor.execute(new Runnable() { // from class: qr.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C43859e.m96622m(interfaceC37583d);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m96630o(@NotNull InterfaceC37583d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.statusCalls) {
            this.statusCalls.remove(callback);
        }
    }

    public /* synthetic */ C43859e(Executor executor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Executor() { // from class: qr.d
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C43859e.m96620e(runnable);
            }
        } : executor);
    }
}
