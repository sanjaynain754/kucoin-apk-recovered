package com.kubi.kumex.market.p091v2.drawer;

import android.annotation.SuppressLint;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.market.ContractObject;
import com.kubi.kumex.market.tradingArea.SearchDrawerFragment;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.utils.extensions.C27041f;
import dm.C36826q2;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC41072a;
import org.jetbrains.annotations.NotNull;
import p473nm.C42853b;
import p473nm.InterfaceC42854c;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarketSearchDrawerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0003¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/drawer/MarketSearchDrawerFragment;", "Lcom/kubi/kumex/market/tradingArea/SearchDrawerFragment;", "<init>", "()V", "toDisplayList", "", "Lcom/kubi/kumex/market/ContractObject;", "searchText", "", "t2", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "onItemClick", "", "data", "updateSelectedSymbolOnClick", "selectedSymbol", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketSearchDrawerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketSearchDrawerFragment.kt\ncom/kubi/kumex/market/v2/drawer/MarketSearchDrawerFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n2756#2:52\n1869#2,2:54\n1#3:53\n*S KotlinDebug\n*F\n+ 1 MarketSearchDrawerFragment.kt\ncom/kubi/kumex/market/v2/drawer/MarketSearchDrawerFragment\n*L\n24#1:52\n48#1:54,2\n24#1:53\n*E\n"})
public final class MarketSearchDrawerFragment extends SearchDrawerFragment {
    @Override // com.kubi.kumex.market.tradingArea.SearchDrawerFragment
    /* JADX INFO: renamed from: N3 */
    public void mo33767N3(@NotNull ContractObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String strM66668h = C27041f.m66668h(data.getF29417b().getSymbol());
        if (strM66668h.length() == 0) {
            C17058m0.m36548c(this, R$string.payment_verify_failure);
        } else {
            m35116S3(strM66668h);
            setFragmentResult("key_kumex_market_info_symbol_changed", BundleKt.bundleOf(TuplesKt.m90091to("symbol", strM66668h)));
        }
    }

    @Override // com.kubi.kumex.market.tradingArea.SearchDrawerFragment
    @NotNull
    /* JADX INFO: renamed from: R3 */
    public List<ContractObject> mo33768R3(@NotNull String searchText, @NotNull List<QuotesEntity> t11) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(t11, "t2");
        List<ContractObject> listMo33768R3 = super.mo33768R3(searchText, t11);
        for (ContractObject contractObject : listMo33768R3) {
            InterfaceC42854c interfaceC42854cM93997a = C42853b.m93997a(this);
            if (interfaceC42854cM93997a != null) {
                contractObject.m34389j(interfaceC42854cM93997a.mo35112R2());
            }
        }
        return listMo33768R3;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: S3 */
    public final void m35116S3(String str) {
        C36826q2 c36826q2M34494w3 = m34494w3();
        if (c36826q2M34494w3 != null && (c36826q2M34494w3.f80903c.getAdapter() instanceof InterfaceC41072a)) {
            Object adapter = c36826q2M34494w3.f80903c.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.kumex.market.tradingArea.adapter.AdapterData");
            Iterator<T> it = ((InterfaceC41072a) adapter).mo90050a().iterator();
            while (it.hasNext()) {
                ((ContractObject) it.next()).m34389j(str);
            }
            RecyclerView.Adapter adapter2 = c36826q2M34494w3.f80903c.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
        }
    }
}
