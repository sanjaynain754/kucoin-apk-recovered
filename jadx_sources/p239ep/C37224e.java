package p239ep;

import org.jetbrains.annotations.NotNull;
import p838zo.InterfaceC46898b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ep.e */
/* JADX INFO: compiled from: CrossPosition.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/margin/entity/MarginCrossPositionOfHeader;", "Lcom/kubi/margin/entity/MarginCrossPosition;", "onlyShowDebt", "", "closeStatus", "Lcom/kubi/margin/api/entity/ILiquidationStatus;", "<init>", "(ZLcom/kubi/margin/api/entity/ILiquidationStatus;)V", "getOnlyShowDebt", "()Z", "setOnlyShowDebt", "(Z)V", "getCloseStatus", "()Lcom/kubi/margin/api/entity/ILiquidationStatus;", "setCloseStatus", "(Lcom/kubi/margin/api/entity/ILiquidationStatus;)V", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37224e implements InterfaceC37221b {

    /* JADX INFO: renamed from: a */
    public boolean f82544a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public InterfaceC46898b f82545b;

    public C37224e(boolean z11, @NotNull InterfaceC46898b closeStatus) {
        Intrinsics.checkNotNullParameter(closeStatus, "closeStatus");
        this.f82544a = z11;
        this.f82545b = closeStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC46898b getF82545b() {
        return this.f82545b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF82544a() {
        return this.f82544a;
    }

    /* JADX INFO: renamed from: c */
    public final void m83274c(boolean z11) {
        this.f82544a = z11;
    }
}
