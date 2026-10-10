package com.kubi.kumex.grid.tradingArea;

import android.os.Bundle;
import android.view.View;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.kumex.grid.tradingArea.GridFavoriteDrawerFragment;
import com.kubi.kumex.market.ContractObject;
import com.kubi.kumex.market.tradingArea.child.FavoriteDrawerFragment;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
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

/* JADX INFO: compiled from: GridFavoriteDrawerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Deprecated(message = "废弃代码，4.0开始，机器人使用h5界面")
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kumex/grid/tradingArea/GridFavoriteDrawerFragment;", "Lcom/kubi/kumex/market/tradingArea/child/FavoriteDrawerFragment;", "<init>", "()V", "showEmptyView", "", "onItemClick", "data", "Lcom/kubi/kumex/market/ContractObject;", "toDisplayList", "", "lists", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridFavoriteDrawerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridFavoriteDrawerFragment.kt\ncom/kubi/kumex/grid/tradingArea/GridFavoriteDrawerFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1563#2:101\n1634#2,3:102\n774#2:105\n865#2,2:106\n774#2:108\n865#2,2:109\n1869#2,2:111\n1869#2,2:113\n2756#2:115\n1#3:116\n*S KotlinDebug\n*F\n+ 1 GridFavoriteDrawerFragment.kt\ncom/kubi/kumex/grid/tradingArea/GridFavoriteDrawerFragment\n*L\n58#1:101\n58#1:102,3\n61#1:105\n61#1:106,2\n67#1:108\n67#1:109,2\n69#1:111,2\n75#1:113,2\n81#1:115\n81#1:116\n*E\n"})
public final class GridFavoriteDrawerFragment extends FavoriteDrawerFragment {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f29103j0 = new Companion(null);

    /* JADX INFO: compiled from: GridFavoriteDrawerFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/grid/tradingArea/GridFavoriteDrawerFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/grid/tradingArea/GridFavoriteDrawerFragment;", "type", "", "tradingAreaName", "", "sortName", "sortType", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ GridFavoriteDrawerFragment newInstance$default(Companion companion, int i11, String str, String str2, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = 0;
            }
            return companion.newInstance(i11, str, str2, i12);
        }

        @NotNull
        public final GridFavoriteDrawerFragment newInstance(int type, @NotNull String tradingAreaName, @Nullable String sortName, int sortType) {
            Intrinsics.checkNotNullParameter(tradingAreaName, "tradingAreaName");
            GridFavoriteDrawerFragment gridFavoriteDrawerFragment = new GridFavoriteDrawerFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("type", type);
            bundle.putString("data", tradingAreaName);
            bundle.putString("data_2", sortName);
            bundle.putInt("data_3", sortType);
            gridFavoriteDrawerFragment.setArguments(bundle);
            return gridFavoriteDrawerFragment;
        }
    }

    /* JADX INFO: renamed from: D5 */
    public static final Unit m33763D5(String str) {
        C37973a.f85398a.m85820c(str);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kumex.market.tradingArea.child.FavoriteDrawerFragment, com.kubi.kumex.market.tradingArea.child.DrawerListFragment, com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
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

    @Override // com.kubi.kumex.market.tradingArea.child.DrawerListFragment
    /* JADX INFO: renamed from: b5 */
    public void mo33761b5(@NotNull ContractObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final String strM66668h = C27041f.m66668h(data.getF29417b().getSymbol());
        if (strM66668h.length() == 0) {
            C17058m0.m36548c(this, R$string.payment_verify_failure);
            return;
        }
        BaseFragment.runOnUiThread$default(this, new Function0() { // from class: hm.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridFavoriteDrawerFragment.m33763D5(strM66668h);
            }
        }, 400L, null, 4, null);
        String name = GridContractDrawerFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        BaseFragment.setFragmentResult$default(this, name, null, 2, null);
    }

    @Override // com.kubi.kumex.market.tradingArea.child.FavoriteDrawerFragment, com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    /* JADX INFO: renamed from: A4 */
    public void mo33764A4() {
        getVisibleDisposable().clear();
        WrapperLoadingView wrapperLoadingViewM34555d4 = m34555d4();
        if (wrapperLoadingViewM34555d4 != null) {
            wrapperLoadingViewM34555d4.showContent();
        }
        if (!KuMexDepend.f30378a.m35905g().c()) {
            m34614z5();
            return;
        }
        WrapperLoadingView wrapperLoadingViewM34555d5 = m34555d4();
        if (wrapperLoadingViewM34555d5 != null) {
            wrapperLoadingViewM34555d5.showEmpty(R$string.fav_empty, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        }
    }
}
