package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.d1 */
/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/b1;", "handle", "<init>", "(Lkotlinx/coroutines/b1;)V", "", "cause", "", "v", "(Ljava/lang/Throwable;)V", "f", "Lkotlinx/coroutines/b1;", "", "u", "()Z", "onCancelling", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41581d1 extends AbstractC41542a2 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41550b1 handle;

    @Override // kotlinx.coroutines.AbstractC41542a2
    /* JADX INFO: renamed from: u */
    public boolean mo90449u() {
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC41542a2
    /* JADX INFO: renamed from: v */
    public void mo90450v(@Nullable Throwable cause) {
        this.handle.dispose();
    }

    public C41581d1(@NotNull InterfaceC41550b1 interfaceC41550b1) {
        this.handle = interfaceC41550b1;
    }
}
