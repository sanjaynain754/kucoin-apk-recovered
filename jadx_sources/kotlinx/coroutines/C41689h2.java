package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.h2 */
/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lkotlinx/coroutines/h2;", "Lkotlinx/coroutines/b1;", "Lkotlinx/coroutines/t;", "<init>", "()V", "", "dispose", "", "cause", "", "b", "(Ljava/lang/Throwable;)Z", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/x1;", "getParent", "()Lkotlinx/coroutines/x1;", "parent", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41689h2 implements InterfaceC41550b1, InterfaceC41757t {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C41689h2 f91736b = new C41689h2();

    @Override // kotlinx.coroutines.InterfaceC41757t
    /* JADX INFO: renamed from: b */
    public boolean mo91065b(@NotNull Throwable cause) {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC41757t
    @Nullable
    public InterfaceC41775x1 getParent() {
        return null;
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }

    @Override // kotlinx.coroutines.InterfaceC41550b1
    public void dispose() {
    }
}
