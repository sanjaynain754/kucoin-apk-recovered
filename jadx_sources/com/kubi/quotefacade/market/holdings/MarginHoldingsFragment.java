package com.kubi.quotefacade.market.holdings;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: MarginHoldingsFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/MarginHoldingsFragment;", "Lcom/kubi/quotefacade/market/holdings/HoldingsCommonFragment;", "<init>", "()V", "getHoldingType", "", "getReportType", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginHoldingsFragment extends HoldingsCommonFragment {

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final Companion f42294k0 = new Companion(null);

    /* JADX INFO: compiled from: MarginHoldingsFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J!\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/MarginHoldingsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/quotefacade/market/holdings/MarginHoldingsFragment;", "subTabCount", "", "positionType", "", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/quotefacade/market/holdings/MarginHoldingsFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final MarginHoldingsFragment newInstance() {
            MarginHoldingsFragment marginHoldingsFragment = new MarginHoldingsFragment();
            marginHoldingsFragment.setArguments(new Bundle());
            return marginHoldingsFragment;
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final MarginHoldingsFragment newInstance(@Nullable Integer subTabCount, @Nullable String positionType) {
            MarginHoldingsFragment marginHoldingsFragment = new MarginHoldingsFragment();
            Bundle bundle = new Bundle();
            if (subTabCount != null) {
                bundle.putInt("holdingSubTabCount", subTabCount.intValue());
            }
            if (positionType != null) {
                bundle.putString("positionType", positionType);
            }
            marginHoldingsFragment.setArguments(bundle);
            return marginHoldingsFragment;
        }
    }

    @Override // com.kubi.quotefacade.market.holdings.HoldingsCommonFragment
    @NotNull
    /* JADX INFO: renamed from: j4 */
    public String mo52435j4() {
        return "MARGIN";
    }

    @Override // com.kubi.quotefacade.market.holdings.HoldingsCommonFragment
    @NotNull
    /* JADX INFO: renamed from: l4 */
    public String mo52436l4() {
        return "3";
    }
}
