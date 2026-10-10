package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.c1 */
/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lkotlinx/coroutines/c1;", "Lkotlinx/coroutines/l;", "Lkotlinx/coroutines/b1;", "handle", "<init>", "(Lkotlinx/coroutines/b1;)V", "", "cause", "", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/b1;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41555c1 implements InterfaceC41704l {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41550b1 handle;

    @Override // kotlinx.coroutines.InterfaceC41704l
    /* JADX INFO: renamed from: b */
    public void mo90501b(@Nullable Throwable cause) {
        this.handle.dispose();
    }

    @NotNull
    public String toString() {
        return "DisposeOnCancel[" + this.handle + ']';
    }

    public C41555c1(@NotNull InterfaceC41550b1 interfaceC41550b1) {
        this.handle = interfaceC41550b1;
    }
}
