package com.kubi.kumex.grid.tradingArea;

import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.grid.tradingArea.GridSearchDrawerFragment;
import com.kubi.kumex.market.ContractObject;
import com.kubi.kumex.market.tradingArea.SearchDrawerFragment;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27041f;
import gm.C37973a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridSearchDrawerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Deprecated(message = "废弃代码，4.0开始，机器人使用h5界面")
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/kumex/grid/tradingArea/GridSearchDrawerFragment;", "Lcom/kubi/kumex/market/tradingArea/SearchDrawerFragment;", "<init>", "()V", "toDisplayList", "", "Lcom/kubi/kumex/market/ContractObject;", "searchText", "", "t2", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "onItemClick", "", "data", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridSearchDrawerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridSearchDrawerFragment.kt\ncom/kubi/kumex/grid/tradingArea/GridSearchDrawerFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1563#2:44\n1634#2,3:45\n774#2:48\n865#2,2:49\n*S KotlinDebug\n*F\n+ 1 GridSearchDrawerFragment.kt\ncom/kubi/kumex/grid/tradingArea/GridSearchDrawerFragment\n*L\n24#1:44\n24#1:45,3\n27#1:48\n27#1:49,2\n*E\n"})
public final class GridSearchDrawerFragment extends SearchDrawerFragment {
    /* JADX INFO: renamed from: T3 */
    public static final Unit m33766T3(String str) {
        C37973a.f85398a.m85820c(str);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kumex.market.tradingArea.SearchDrawerFragment
    /* JADX INFO: renamed from: N3 */
    public void mo33767N3(@NotNull ContractObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final String strM66668h = C27041f.m66668h(data.getF29417b().getSymbol());
        if (strM66668h.length() == 0) {
            C17058m0.m36548c(this, R$string.payment_verify_failure);
            return;
        }
        BaseFragment.runOnUiThread$default(this, new Function0() { // from class: hm.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridSearchDrawerFragment.m33766T3(strM66668h);
            }
        }, 400L, null, 4, null);
        String name = GridContractDrawerFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        BaseFragment.setFragmentResult$default(this, name, null, 2, null);
    }

    @Override // com.kubi.kumex.market.tradingArea.SearchDrawerFragment
    @NotNull
    /* JADX INFO: renamed from: R3 */
    public List<ContractObject> mo33768R3(@NotNull String searchText, @NotNull List<QuotesEntity> t11) {
        ContractEntity contractEntity;
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(t11, "t2");
        HashMap map = new HashMap();
        List<ContractEntity> listM85818a = C37973a.f85398a.m85818a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM85818a, 10));
        for (ContractEntity contractEntity2 : listM85818a) {
            arrayList.add((ContractEntity) map.put(C27041f.m66668h(contractEntity2.getSymbol()), contractEntity2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : t11) {
            QuotesEntity quotesEntity = (QuotesEntity) obj;
            ContractEntity contractEntity3 = (ContractEntity) map.get(quotesEntity.getSymbol());
            if (contractEntity3 != null && contractEntity3.getSupportGridTrading() && (contractEntity = (ContractEntity) map.get(quotesEntity.getSymbol())) != null && !contractEntity.isInverse()) {
                arrayList2.add(obj);
            }
        }
        return super.mo33768R3(searchText, arrayList2);
    }
}
