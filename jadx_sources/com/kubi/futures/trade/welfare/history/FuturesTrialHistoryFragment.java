package com.kubi.futures.trade.welfare.history;

import android.content.Context;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import bm.FuturesWelfareFooter;
import bm.InterfaceC4633f;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.futures.trade.welfare.FuturesWelfareAdapter;
import com.kubi.futures.trade.welfare.vm.FuturesTrialHistoryViewModel;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.record.ContractRecordFragment;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.extensions.C27039d;
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
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FuturesTrialHistoryFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/history/FuturesTrialHistoryFragment;", "Lcom/kubi/futures/trade/welfare/history/WelfareHistoryListFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialHistoryViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialHistoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "trialStatus", "", "", "currentPage", "", "status", "initView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "refresh", "loadMore", "handleSectionItemClick", ViewProps.POSITION, "onActionClick", "futuresWelfareType", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;", "bindData", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTrialHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTrialHistoryFragment.kt\ncom/kubi/futures/trade/welfare/history/FuturesTrialHistoryFragment\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,116:1\n220#2,5:117\n*S KotlinDebug\n*F\n+ 1 FuturesTrialHistoryFragment.kt\ncom/kubi/futures/trade/welfare/history/FuturesTrialHistoryFragment\n*L\n26#1:117,5\n*E\n"})
public final class FuturesTrialHistoryFragment extends WelfareHistoryListFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f24841Y = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.history.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesTrialHistoryFragment.m28712K3(this.f24856b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final List<String> f24842Z;

    /* JADX INFO: renamed from: a0 */
    public int f24843a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f24844b0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.history.FuturesTrialHistoryFragment$a */
    /* JADX INFO: compiled from: FuturesTrialHistoryFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14352a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24845b;

        public C14352a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24845b = function;
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
            return this.f24845b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24845b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.futures.trade.welfare.history.WelfareHistoryListFragment
    /* JADX INFO: renamed from: B0 */
    public void mo28695B0() {
        this.f24843a0 = 1;
        m28713I3().m28745e(this.f24844b0, this.f24843a0, 10);
    }

    /* JADX INFO: renamed from: K3 */
    public static final FuturesTrialHistoryViewModel m28712K3(FuturesTrialHistoryFragment futuresTrialHistoryFragment) {
        return (FuturesTrialHistoryViewModel) new ViewModelProvider(futuresTrialHistoryFragment).get(FuturesTrialHistoryViewModel.class);
    }

    /* JADX INFO: renamed from: I3 */
    public final FuturesTrialHistoryViewModel m28713I3() {
        return (FuturesTrialHistoryViewModel) this.f24841Y.getValue();
    }

    @Override // com.kubi.futures.trade.welfare.history.WelfareHistoryListFragment
    /* JADX INFO: renamed from: r3 */
    public void mo28698r3(int i11) {
        this.f24844b0 = this.f24842Z.get(i11);
        mo28695B0();
    }

    @Override // com.kubi.futures.trade.welfare.history.WelfareHistoryListFragment
    /* JADX INFO: renamed from: u3 */
    public void mo28699u3(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m28713I3().m28746n().observe(getViewLifecycleOwner(), new C14352a(new Function1() { // from class: com.kubi.futures.trade.welfare.history.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTrialHistoryFragment.m28711J3(this.f24857b, (Pair) obj);
            }
        }));
        mo28695B0();
    }

    @Override // com.kubi.futures.trade.welfare.history.WelfareHistoryListFragment
    /* JADX INFO: renamed from: x3 */
    public void mo28701x3(@NotNull View view, @NotNull InterfaceC4633f futuresWelfareType) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(futuresWelfareType, "futuresWelfareType");
        super.mo28701x3(view, futuresWelfareType);
        if (futuresWelfareType instanceof FuturesWelfareTrialItemEntity) {
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) futuresWelfareType;
            if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "USE_FINISHED")) {
                long jM66652l = C27039d.m66652l(futuresWelfareTrialItemEntity.getRecycleAt());
                long j11 = jM66652l - ((long) 1296000000);
                if (j11 <= 0) {
                    return;
                }
                BaseActivity.Companion companion = BaseActivity.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                companion.launch(contextRequireContext, ContractRecordFragment.class, BundleKt.bundleOf(TuplesKt.m90091to("startTime", Long.valueOf(j11)), TuplesKt.m90091to("endTime", Long.valueOf(jM66652l))));
            }
        }
    }

    public FuturesTrialHistoryFragment() {
        List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{"USE_FINISHED", "RECYCLE_FINISHED"});
        this.f24842Z = listListOf;
        this.f24843a0 = 1;
        this.f24844b0 = listListOf.get(0);
    }

    /* JADX INFO: renamed from: H3 */
    private final void m28710H3(FuturesWelfareTrialEntity futuresWelfareTrialEntity) {
        boolean z11;
        List<FuturesWelfareTrialItemEntity> items;
        if (futuresWelfareTrialEntity.getCurrentPage() < futuresWelfareTrialEntity.getTotalPage()) {
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
        if (this.f24843a0 <= 1 && ((items = futuresWelfareTrialEntity.getItems()) == null || items.isEmpty())) {
            showEmpty();
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<FuturesWelfareTrialItemEntity> items2 = futuresWelfareTrialEntity.getItems();
        if (items2 != null) {
            arrayList.addAll(items2);
        }
        RecyclerView.Adapter adapter = null;
        if (!z11) {
            arrayList.add(new FuturesWelfareFooter(null, 1, null));
        }
        if (this.f24843a0 <= 1) {
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
        if (futuresWelfareTrialEntity.getCurrentPage() < futuresWelfareTrialEntity.getTotalPage()) {
            this.f24843a0++;
        }
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m28711J3(FuturesTrialHistoryFragment futuresTrialHistoryFragment, Pair pair) {
        if (((Boolean) pair.getFirst()).booleanValue()) {
            futuresTrialHistoryFragment.showLoading();
        } else {
            FuturesWelfareTrialEntity futuresWelfareTrialEntity = (FuturesWelfareTrialEntity) pair.getSecond();
            if (futuresWelfareTrialEntity == null) {
                futuresTrialHistoryFragment.m28731D3();
            } else {
                futuresTrialHistoryFragment.showContent();
                futuresTrialHistoryFragment.m28710H3(futuresWelfareTrialEntity);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.futures.trade.welfare.history.WelfareHistoryListFragment
    /* JADX INFO: renamed from: v3 */
    public void mo28700v3() {
        m28713I3().m28745e(this.f24844b0, this.f24843a0, 10);
    }
}
