package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: kotlinx.coroutines.u */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lkotlinx/coroutines/u;", "Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/t;", "Lkotlinx/coroutines/v;", "childJob", "<init>", "(Lkotlinx/coroutines/v;)V", "", "cause", "", "v", "(Ljava/lang/Throwable;)V", "", "b", "(Ljava/lang/Throwable;)Z", "f", "Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/x1;", "getParent", "()Lkotlinx/coroutines/x1;", "parent", "u", "()Z", "onCancelling", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41761u extends AbstractC41542a2 implements InterfaceC41757t {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final InterfaceC41765v childJob;

    @Override // kotlinx.coroutines.AbstractC41542a2
    /* JADX INFO: renamed from: u */
    public boolean mo90449u() {
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC41542a2
    /* JADX INFO: renamed from: v */
    public void mo90450v(@Nullable Throwable cause) {
        this.childJob.mo90424i(m90479t());
    }

    public C41761u(@NotNull InterfaceC41765v interfaceC41765v) {
        this.childJob = interfaceC41765v;
    }

    @Override // kotlinx.coroutines.InterfaceC41757t
    /* JADX INFO: renamed from: b */
    public boolean mo91065b(@NotNull Throwable cause) {
        return m90479t().mo90411W(cause);
    }

    @Override // kotlinx.coroutines.InterfaceC41757t
    @NotNull
    public InterfaceC41775x1 getParent() {
        return m90479t();
    }
}
