package com.kubi.kumex.grid.tradingArea;

import android.os.Bundle;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.kumex.grid.tradingArea.GridDrawerListFragment;
import com.kubi.kumex.market.ContractObject;
import com.kubi.kumex.market.tradingArea.child.DrawerListFragment;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37570e;
import gm.C37973a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridDrawerListFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Deprecated(message = "废弃代码，4.0开始，机器人使用h5界面")
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0014J\u001e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kumex/grid/tradingArea/GridDrawerListFragment;", "Lcom/kubi/kumex/market/tradingArea/child/DrawerListFragment;", "<init>", "()V", "updateEmptyFavorite", "", DbParams.KEY_CHANNEL_RESULT, "", "Lcom/kubi/kumex/market/ContractObject;", "toDisplayList", "lists", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "onItemClick", "data", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridDrawerListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridDrawerListFragment.kt\ncom/kubi/kumex/grid/tradingArea/GridDrawerListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1563#2:94\n1634#2,3:95\n774#2:98\n865#2,2:99\n774#2:101\n865#2,2:102\n1869#2,2:104\n1869#2,2:106\n2756#2:108\n1#3:109\n*S KotlinDebug\n*F\n+ 1 GridDrawerListFragment.kt\ncom/kubi/kumex/grid/tradingArea/GridDrawerListFragment\n*L\n57#1:94\n57#1:95,3\n60#1:98\n60#1:99,2\n66#1:101\n66#1:102,2\n69#1:104,2\n75#1:106,2\n81#1:108\n81#1:109\n*E\n"})
public final class GridDrawerListFragment extends DrawerListFragment {

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f29102f0 = new Companion(null);

    /* JADX INFO: compiled from: GridDrawerListFragment.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kumex/grid/tradingArea/GridDrawerListFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/grid/tradingArea/GridDrawerListFragment;", "type", "", "tradingAreaName", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "sortName", "sortType", "sectionPosition", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final GridDrawerListFragment newInstance(int type, @NotNull String tradingAreaName, @NotNull AvailableTradeAreaEntity entity, @Nullable String sortName, int sortType, int sectionPosition) {
            Intrinsics.checkNotNullParameter(tradingAreaName, "tradingAreaName");
            Intrinsics.checkNotNullParameter(entity, "entity");
            GridDrawerListFragment gridDrawerListFragment = new GridDrawerListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("type", type);
            bundle.putString("data", tradingAreaName);
            bundle.putParcelable("data_1", entity);
            bundle.putString("data_2", sortName);
            bundle.putInt("data_3", sortType);
            bundle.putInt("data_4", sectionPosition);
            gridDrawerListFragment.setArguments(bundle);
            return gridDrawerListFragment;
        }
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m33758k5(String str) {
        C37973a.f85398a.m85820c(str);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kumex.market.tradingArea.child.DrawerListFragment, com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    @NotNull
    /* JADX INFO: renamed from: E4 */
    public List<? extends ContractObject> mo33759E4(@NotNull List<QuotesEntity> lists) {
        ContractEntity contractEntity;
        Intrinsics.checkNotNullParameter(lists, "lists");
        HashMap map = new HashMap();
        List<ContractEntity> listM85818a = C37973a.f85398a.m85818a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM85818a, 10));
        for (ContractEntity contractEntity2 : listM85818a) {
            arrayList.add((ContractEntity) map.put(C27041f.m66668h(contractEntity2.getSymbol()), contractEntity2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : lists) {
            QuotesEntity quotesEntity = (QuotesEntity) obj;
            ContractEntity contractEntity3 = (ContractEntity) map.get(quotesEntity.getSymbol());
            if (contractEntity3 != null && contractEntity3.getSupportGridTrading() && (contractEntity = (ContractEntity) map.get(quotesEntity.getSymbol())) != null && !contractEntity.isInverse()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (KuMexDepend.f30378a.m35905g().c() || !m34556e4()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ContractObject contractObject = new ContractObject(m34553b4(), (QuotesEntity) it.next());
                contractObject.m34389j(C37973a.f85398a.m85819b());
                arrayList3.add(contractObject);
            }
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList2) {
                QuotesEntity quotesEntity2 = (QuotesEntity) obj2;
                SymbolConfig symbolConfigMo24996X = RepositoryServiceLocator.f19236a.m20288g().mo24996X(C27041f.m66668h(quotesEntity2.getSymbol()));
                if (C27025c.m66566d(symbolConfigMo24996X != null ? C37570e.m84689d(symbolConfigMo24996X, C27041f.m66668h(quotesEntity2.getSymbol())) : null)) {
                    arrayList4.add(obj2);
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                ContractObject contractObject2 = new ContractObject(m34553b4(), (QuotesEntity) it2.next());
                contractObject2.m34389j(C37973a.f85398a.m85819b());
                arrayList3.add(contractObject2);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            ((ContractObject) it3.next()).m34388i(getF29503V());
        }
        return arrayList3;
    }

    @Override // com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    /* JADX INFO: renamed from: G4 */
    public void mo33760G4(@NotNull List<? extends ContractObject> result) {
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // com.kubi.kumex.market.tradingArea.child.DrawerListFragment
    /* JADX INFO: renamed from: b5 */
    public void mo33761b5(@NotNull ContractObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final String strM66668h = C27041f.m66668h(data.getF29417b().getSymbol());
        if (strM66668h.length() == 0) {
            C17058m0.m36548c(this, R$string.payment_verify_failure);
            return;
        }
        BaseFragment.runOnUiThread$default(this, new Function0() { // from class: hm.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridDrawerListFragment.m33758k5(strM66668h);
            }
        }, 400L, null, 4, null);
        String name = GridContractDrawerFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        BaseFragment.setFragmentResult$default(this, name, null, 2, null);
    }
}
