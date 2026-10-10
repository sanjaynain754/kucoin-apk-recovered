package com.kubi.futures.trade.welfare.history;

import android.view.View;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import bm.FuturesWelfareFooter;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.futures.trade.welfare.FuturesWelfareAdapter;
import com.kubi.futures.trade.welfare.vm.FuturesCouponHistoryViewModel;
import com.kubi.kumex.data.platform.model.FuturesWelfareCouponEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareCouponItemEntity;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FuturesCouponHistoryFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0014J\b\u0010\u0018\u001a\u00020\u0011H\u0014J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000eH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/history/FuturesCouponHistoryFragment;", "Lcom/kubi/futures/trade/welfare/history/WelfareHistoryListFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesCouponHistoryViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesCouponHistoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "couponStatus", "", "", "currentPage", "", "status", "initView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "bindData", FirebaseAnalytics.Param.COUPON, "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponEntity;", "refresh", "loadMore", "handleSectionItemClick", ViewProps.POSITION, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesCouponHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesCouponHistoryFragment.kt\ncom/kubi/futures/trade/welfare/history/FuturesCouponHistoryFragment\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,92:1\n220#2,5:93\n*S KotlinDebug\n*F\n+ 1 FuturesCouponHistoryFragment.kt\ncom/kubi/futures/trade/welfare/history/FuturesCouponHistoryFragment\n*L\n21#1:93,5\n*E\n"})
public final class FuturesCouponHistoryFragment extends WelfareHistoryListFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f24836Y = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.history.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesCouponHistoryFragment.m28705K3(this.f24854b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final List<String> f24837Z;

    /* JADX INFO: renamed from: a0 */
    public int f24838a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f24839b0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.history.FuturesCouponHistoryFragment$a */
    /* JADX INFO: compiled from: FuturesCouponHistoryFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14351a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24840b;

        public C14351a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24840b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24840b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24840b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.futures.trade.welfare.history.WelfareHistoryListFragment
    /* JADX INFO: renamed from: B0 */
    public void mo28695B0() {
        this.f24838a0 = 1;
        m28707I3().m28741e(this.f24839b0, this.f24838a0, 10);
    }

    /* JADX INFO: renamed from: K3 */
    public static final FuturesCouponHistoryViewModel m28705K3(FuturesCouponHistoryFragment futuresCouponHistoryFragment) {
        return (FuturesCouponHistoryViewModel) new ViewModelProvider(futuresCouponHistoryFragment).get(FuturesCouponHistoryViewModel.class);
    }

    /* JADX INFO: renamed from: I3 */
    public final FuturesCouponHistoryViewModel m28707I3() {
        return (FuturesCouponHistoryViewModel) this.f24836Y.getValue();
    }

    @Override // com.kubi.futures.trade.welfare.history.WelfareHistoryListFragment
    /* JADX INFO: renamed from: r3 */
    public void mo28698r3(int i11) {
        this.f24839b0 = this.f24837Z.get(i11);
        mo28695B0();
    }

    @Override // com.kubi.futures.trade.welfare.history.WelfareHistoryListFragment
    /* JADX INFO: renamed from: u3 */
    public void mo28699u3(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m28707I3().m28742n().observe(getViewLifecycleOwner(), new C14351a(new Function1() { // from class: com.kubi.futures.trade.welfare.history.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesCouponHistoryFragment.m28704J3(this.f24855b, (Pair) obj);
            }
        }));
        mo28695B0();
    }

    public FuturesCouponHistoryFragment() {
        List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{"USED", "EXPIRED"});
        this.f24837Z = listListOf;
        this.f24838a0 = 1;
        this.f24839b0 = listListOf.get(0);
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m28704J3(FuturesCouponHistoryFragment futuresCouponHistoryFragment, Pair pair) {
        if (((Boolean) pair.getFirst()).booleanValue()) {
            futuresCouponHistoryFragment.showLoading();
        } else {
            FuturesWelfareCouponEntity futuresWelfareCouponEntity = (FuturesWelfareCouponEntity) pair.getSecond();
            if (futuresWelfareCouponEntity == null) {
                futuresCouponHistoryFragment.m28731D3();
            } else {
                futuresCouponHistoryFragment.showContent();
                futuresCouponHistoryFragment.m28706H3(futuresWelfareCouponEntity);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public final void m28706H3(FuturesWelfareCouponEntity futuresWelfareCouponEntity) {
        boolean z11;
        List<FuturesWelfareCouponItemEntity> items;
        if (futuresWelfareCouponEntity.getCurrentPage() < futuresWelfareCouponEntity.getTotalPage()) {
            z11 = true;
        } else {
            z11 = false;
        }
        KuCoinRefreshLayout kuCoinRefreshLayoutM28730C3 = m28730C3();
        if (kuCoinRefreshLayoutM28730C3 != null) {
            kuCoinRefreshLayoutM28730C3.finishLoadMore();
            kuCoinRefreshLayoutM28730C3.setRefreshing(false);
            kuCoinRefreshLayoutM28730C3.setEnableLoadMore(z11);
        }
        if (this.f24838a0 <= 1 && ((items = futuresWelfareCouponEntity.getItems()) == null || items.isEmpty())) {
            showEmpty();
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<FuturesWelfareCouponItemEntity> items2 = futuresWelfareCouponEntity.getItems();
        if (items2 != null) {
            arrayList.addAll(items2);
        }
        RecyclerView.Adapter adapter = null;
        if (!z11) {
            arrayList.add(new FuturesWelfareFooter(null, 1, null));
        }
        if (this.f24838a0 <= 1) {
            RecyclerView recyclerViewM28729B3 = m28729B3();
            if (recyclerViewM28729B3 != null) {
                adapter = recyclerViewM28729B3.getAdapter();
            }
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.futures.trade.welfare.FuturesWelfareAdapter");
            ((FuturesWelfareAdapter) adapter).m28634J(arrayList);
        } else {
            RecyclerView recyclerViewM28729B4 = m28729B3();
            if (recyclerViewM28729B4 != null) {
                adapter = recyclerViewM28729B4.getAdapter();
            }
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.futures.trade.welfare.FuturesWelfareAdapter");
            ((FuturesWelfareAdapter) adapter).m28651m(arrayList);
        }
        if (futuresWelfareCouponEntity.getCurrentPage() < futuresWelfareCouponEntity.getTotalPage()) {
            this.f24838a0++;
        }
    }

    @Override // com.kubi.futures.trade.welfare.history.WelfareHistoryListFragment
    /* JADX INFO: renamed from: v3 */
    public void mo28700v3() {
        m28707I3().m28741e(this.f24839b0, this.f24838a0, 10);
    }
}
