package com.kubi.quotefacade.market.holdings;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AllHoldingsFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/AllHoldingsFragment;", "Lcom/kubi/quotefacade/market/holdings/HoldingsCommonFragment;", "<init>", "()V", "getHoldingType", "", "getReportType", "useDepositEmptyStyle", "", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AllHoldingsFragment extends HoldingsCommonFragment {

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final Companion f42268k0 = new Companion(null);

    /* JADX INFO: compiled from: AllHoldingsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/AllHoldingsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/quotefacade/market/holdings/AllHoldingsFragment;", "positionType", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ AllHoldingsFragment newInstance$default(Companion companion, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return companion.newInstance(str);
        }

        @JvmStatic
        @NotNull
        public final AllHoldingsFragment newInstance(@Nullable String positionType) {
            AllHoldingsFragment allHoldingsFragment = new AllHoldingsFragment();
            Bundle bundle = new Bundle();
            if (positionType != null) {
                bundle.putString("positionType", positionType);
            }
            allHoldingsFragment.setArguments(bundle);
            return allHoldingsFragment;
        }
    }

    @Override // com.kubi.quotefacade.market.holdings.HoldingsCommonFragment
    /* JADX INFO: renamed from: Q4 */
    public boolean mo52434Q4() {
        return true;
    }

    @Override // com.kubi.quotefacade.market.holdings.HoldingsCommonFragment
    @NotNull
    /* JADX INFO: renamed from: j4 */
    public String mo52435j4() {
        return "ALL";
    }

    @Override // com.kubi.quotefacade.market.holdings.HoldingsCommonFragment
    @NotNull
    /* JADX INFO: renamed from: l4 */
    public String mo52436l4() {
        return "2";
    }
}
