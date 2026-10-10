package p495oc;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oc.a, reason: from toString */
/* JADX INFO: compiled from: CopyTradingUiState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/copytrading/data/CopyTradingUiState;", "", "isMasterAccount", "", "isNeedShowLeaderTips", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "CopyTradingApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CopyTradingUiState {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean isMasterAccount;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final boolean isNeedShowLeaderTips;

    public CopyTradingUiState(boolean z11, boolean z12) {
        this.isMasterAccount = z11;
        this.isNeedShowLeaderTips = z12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyTradingUiState)) {
            return false;
        }
        CopyTradingUiState copyTradingUiState = (CopyTradingUiState) other;
        return this.isMasterAccount == copyTradingUiState.isMasterAccount && this.isNeedShowLeaderTips == copyTradingUiState.isNeedShowLeaderTips;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsMasterAccount() {
        return this.isMasterAccount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsNeedShowLeaderTips() {
        return this.isNeedShowLeaderTips;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isMasterAccount) * 31) + Boolean.hashCode(this.isNeedShowLeaderTips);
    }

    @NotNull
    public String toString() {
        return "CopyTradingUiState(isMasterAccount=" + this.isMasterAccount + ", isNeedShowLeaderTips=" + this.isNeedShowLeaderTips + ')';
    }

    public /* synthetic */ CopyTradingUiState(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? false : z12);
    }
}
