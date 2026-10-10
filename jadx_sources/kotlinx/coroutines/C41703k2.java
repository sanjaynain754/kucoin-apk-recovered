package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.k2 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lkotlinx/coroutines/k2;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/o;", "continuation", "<init>", "(Lkotlinx/coroutines/o;)V", "", "cause", "", "v", "(Ljava/lang/Throwable;)V", "f", "Lkotlinx/coroutines/o;", "", "u", "()Z", "onCancelling", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
public final class C41703k2<T> extends AbstractC41542a2 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C41716o<T> continuation;

    @Override // kotlinx.coroutines.AbstractC41542a2
    /* JADX INFO: renamed from: u */
    public boolean mo90449u() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41703k2(@NotNull C41716o<? super T> c41716o) {
        this.continuation = c41716o;
    }

    @Override // kotlinx.coroutines.AbstractC41542a2
    /* JADX INFO: renamed from: v */
    public void mo90450v(@Nullable Throwable cause) {
        Object objM90428k0 = m90479t().m90428k0();
        if (objM90428k0 instanceof C41549b0) {
            C41716o<T> c41716o = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(((C41549b0) objM90428k0).cause)));
        } else {
            C41716o<T> c41716o2 = this.continuation;
            Result.Companion companion2 = Result.INSTANCE;
            c41716o2.resumeWith(Result.m103844constructorimpl(C41551b2.m90495h(objM90428k0)));
        }
    }
}
