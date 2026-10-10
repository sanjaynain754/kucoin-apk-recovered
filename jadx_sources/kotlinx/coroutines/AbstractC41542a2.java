package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.coroutines.a2 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/b1;", "Lkotlinx/coroutines/s1;", "<init>", "()V", "", "dispose", "", "toString", "()Ljava/lang/String;", "", "cause", "v", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/JobSupport;", "e", "Lkotlinx/coroutines/JobSupport;", "t", "()Lkotlinx/coroutines/JobSupport;", "w", "(Lkotlinx/coroutines/JobSupport;)V", "job", "", "u", "()Z", "onCancelling", "isActive", "Lkotlinx/coroutines/f2;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/coroutines/f2;", "list", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC41542a2 extends LockFreeLinkedListNode implements InterfaceC41550b1, InterfaceC41741s1 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public JobSupport job;

    @Override // kotlinx.coroutines.InterfaceC41741s1
    @Nullable
    /* JADX INFO: renamed from: a */
    public C41590f2 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC41741s1
    /* JADX INFO: renamed from: isActive */
    public boolean getIsActive() {
        return true;
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo90449u();

    /* JADX INFO: renamed from: v */
    public abstract void mo90450v(@Nullable Throwable cause);

    @NotNull
    /* JADX INFO: renamed from: t */
    public final JobSupport m90479t() {
        JobSupport jobSupport = this.job;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return C41717o0.m91174a(this) + '@' + C41717o0.m91175b(this) + "[job@" + C41717o0.m91175b(m90479t()) + ']';
    }

    /* JADX INFO: renamed from: w */
    public final void m90480w(@NotNull JobSupport jobSupport) {
        this.job = jobSupport;
    }

    @Override // kotlinx.coroutines.InterfaceC41550b1
    public void dispose() {
        m90479t().m90390I0(this);
    }
}
