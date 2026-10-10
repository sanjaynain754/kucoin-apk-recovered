package com.kubi.quotefacade.market.holdings;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AlphaHoldingsFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/AlphaHoldingsFragment;", "Lcom/kubi/quotefacade/market/holdings/HoldingsCommonFragment;", "<init>", "()V", "getReportType", "", "getHoldingType", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaHoldingsFragment extends HoldingsCommonFragment {

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final Companion f42269k0 = new Companion(null);

    /* JADX INFO: compiled from: AlphaHoldingsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/AlphaHoldingsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/quotefacade/market/holdings/AlphaHoldingsFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final AlphaHoldingsFragment newInstance() {
            return new AlphaHoldingsFragment();
        }
    }

    @Override // com.kubi.quotefacade.market.holdings.HoldingsCommonFragment
    @NotNull
    /* JADX INFO: renamed from: j4 */
    public String mo52435j4() {
        return "ALPHA";
    }

    @Override // com.kubi.quotefacade.market.holdings.HoldingsCommonFragment
    @NotNull
    /* JADX INFO: renamed from: l4 */
    public String mo52436l4() {
        return "5";
    }
}
