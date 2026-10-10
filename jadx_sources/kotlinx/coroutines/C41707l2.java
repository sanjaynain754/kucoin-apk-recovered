package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.l2 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lkotlinx/coroutines/l2;", "Lkotlinx/coroutines/a2;", "Lkotlin/coroutines/Continuation;", "", "continuation", "<init>", "(Lkotlin/coroutines/Continuation;)V", "", "cause", "v", "(Ljava/lang/Throwable;)V", "f", "Lkotlin/coroutines/Continuation;", "", "u", "()Z", "onCancelling", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41707l2 extends AbstractC41542a2 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Continuation<Unit> continuation;

    @Override // kotlinx.coroutines.AbstractC41542a2
    /* JADX INFO: renamed from: u */
    public boolean mo90449u() {
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC41542a2
    /* JADX INFO: renamed from: v */
    public void mo90450v(@Nullable Throwable cause) {
        Continuation<Unit> continuation = this.continuation;
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41707l2(@NotNull Continuation<? super Unit> continuation) {
        this.continuation = continuation;
    }
}
