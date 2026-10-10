package com.kubi.kumex.market.p091v2.drawer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.market.ContractObject;
import com.kubi.kumex.market.tradingArea.child.FavoriteDrawerFragment;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.utils.extensions.C27041f;
import dm.C36789k1;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC41072a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p473nm.C42853b;
import p473nm.InterfaceC42854c;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarketFavoriteDrawerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/drawer/MarketFavoriteDrawerFragment;", "Lcom/kubi/kumex/market/tradingArea/child/FavoriteDrawerFragment;", "<init>", "()V", "toDisplayList", "", "Lcom/kubi/kumex/market/ContractObject;", "lists", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "onItemClick", "", "data", "updateSelectedSymbolOnClick", "selectedSymbol", "", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketFavoriteDrawerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketFavoriteDrawerFragment.kt\ncom/kubi/kumex/market/v2/drawer/MarketFavoriteDrawerFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n2756#2:69\n1869#2,2:71\n1#3:70\n*S KotlinDebug\n*F\n+ 1 MarketFavoriteDrawerFragment.kt\ncom/kubi/kumex/market/v2/drawer/MarketFavoriteDrawerFragment\n*L\n24#1:69\n48#1:71,2\n24#1:70\n*E\n"})
public final class MarketFavoriteDrawerFragment extends FavoriteDrawerFragment {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f29774j0 = new Companion(null);

    /* JADX INFO: compiled from: MarketFavoriteDrawerFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/drawer/MarketFavoriteDrawerFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/market/v2/drawer/MarketFavoriteDrawerFragment;", "type", "", "tradingAreaName", "", "sortName", "sortType", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ MarketFavoriteDrawerFragment newInstance$default(Companion companion, int i11, String str, String str2, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = 0;
            }
            return companion.newInstance(i11, str, str2, i12);
        }

        @NotNull
        public final MarketFavoriteDrawerFragment newInstance(int type, @NotNull String tradingAreaName, @Nullable String sortName, int sortType) {
            Intrinsics.checkNotNullParameter(tradingAreaName, "tradingAreaName");
            MarketFavoriteDrawerFragment marketFavoriteDrawerFragment = new MarketFavoriteDrawerFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("type", type);
            bundle.putString("data", tradingAreaName);
            bundle.putString("data_2", sortName);
            bundle.putInt("data_3", sortType);
            marketFavoriteDrawerFragment.setArguments(bundle);
            return marketFavoriteDrawerFragment;
        }
    }

    @Override // com.kubi.kumex.market.tradingArea.child.FavoriteDrawerFragment, com.kubi.kumex.market.tradingArea.child.DrawerListFragment, com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    @NotNull
    /* JADX INFO: renamed from: E4 */
    public List<? extends ContractObject> mo33759E4(@NotNull List<QuotesEntity> lists) {
        Intrinsics.checkNotNullParameter(lists, "lists");
        List<? extends ContractObject> listMo33759E4 = super.mo33759E4(lists);
        for (ContractObject contractObject : listMo33759E4) {
            InterfaceC42854c interfaceC42854cM93997a = C42853b.m93997a(this);
            if (interfaceC42854cM93997a != null) {
                contractObject.m34389j(interfaceC42854cM93997a.mo35112R2());
            }
        }
        return listMo33759E4;
    }

    @Override // com.kubi.kumex.market.tradingArea.child.DrawerListFragment
    /* JADX INFO: renamed from: b5 */
    public void mo33761b5(@NotNull ContractObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String strM66668h = C27041f.m66668h(data.getF29417b().getSymbol());
        if (strM66668h.length() == 0) {
            C17058m0.m36548c(this, R$string.payment_verify_failure);
        } else {
            m35115C5(strM66668h);
            setFragmentResult("key_kumex_market_info_symbol_changed", BundleKt.bundleOf(TuplesKt.m90091to("symbol", strM66668h)));
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: C5 */
    private final void m35115C5(String str) {
        C36789k1 c36789k1M34590S4 = m34590S4();
        if (c36789k1M34590S4 != null && (c36789k1M34590S4.f80387d.getAdapter() instanceof InterfaceC41072a)) {
            Object adapter = c36789k1M34590S4.f80387d.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.kumex.market.tradingArea.adapter.AdapterData");
            Iterator<T> it = ((InterfaceC41072a) adapter).mo90050a().iterator();
            while (it.hasNext()) {
                ((ContractObject) it.next()).m34389j(str);
            }
            RecyclerView.Adapter adapter2 = c36789k1M34590S4.f80387d.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
        }
    }
}
