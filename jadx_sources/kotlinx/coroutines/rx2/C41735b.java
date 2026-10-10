package kotlinx.coroutines.rx2;

import io.reactivex.functions.Cancellable;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.rx2.b */
/* JADX INFO: compiled from: RxCancellable.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlinx/coroutines/rx2/b;", "Lio/reactivex/functions/Cancellable;", "Lkotlinx/coroutines/x1;", "job", "<init>", "(Lkotlinx/coroutines/x1;)V", "", "cancel", "()V", "b", "Lkotlinx/coroutines/x1;", "kotlinx-coroutines-rx2"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41735b implements Cancellable {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41775x1 job;

    @Override // io.reactivex.functions.Cancellable
    public void cancel() {
        InterfaceC41775x1.a.m91377a(this.job, null, 1, null);
    }

    public C41735b(@NotNull InterfaceC41775x1 interfaceC41775x1) {
        this.job = interfaceC41775x1;
    }
}
