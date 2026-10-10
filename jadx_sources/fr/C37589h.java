package fr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkResponse;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fr.h */
/* JADX INFO: compiled from: ICall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lfr/h;", "Lfr/c;", TUIConstants.TUIChat.CALL_BACK, "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Lfr/c;Ljava/util/concurrent/Executor;)V", "", "exception", "", "onFailure", "(Ljava/lang/Throwable;)V", "Lcom/kubi/network/api/model/NetworkResponse;", "response", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/model/NetworkResponse;)V", "Lfr/c;", "b", "Ljava/util/concurrent/Executor;", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37589h implements InterfaceC37582c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37582c callback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    public C37589h(@NotNull InterfaceC37582c callback, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.callback = callback;
        this.executor = executor;
    }

    /* JADX INFO: renamed from: e */
    public static final void m84763e(C37589h this$0, Throwable exception) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        this$0.callback.onFailure(exception);
    }

    /* JADX INFO: renamed from: f */
    public static final void m84764f(C37589h this$0, NetworkResponse response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "$response");
        this$0.callback.mo23836a(response);
    }

    @Override // fr.InterfaceC37582c
    /* JADX INFO: renamed from: a */
    public void mo23836a(@NotNull final NetworkResponse<?> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.executor.execute(new Runnable() { // from class: fr.f
            @Override // java.lang.Runnable
            public final void run() {
                C37589h.m84764f(this.f83546b, response);
            }
        });
    }

    @Override // fr.InterfaceC37582c
    public void onFailure(@NotNull final Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.executor.execute(new Runnable() { // from class: fr.g
            @Override // java.lang.Runnable
            public final void run() {
                C37589h.m84763e(this.f83548b, exception);
            }
        });
    }

    @Override // fr.InterfaceC37582c
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC37582c mo23837b(@NotNull Executor executor) {
        return InterfaceC37582c.a.m84719c(this, executor);
    }
}
