package com.kubi.market.monitor.lib.p100ui.floating.window;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aq.C4373b;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.market.monitor.lib.entity.FloatingItemMeasureInfo;
import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import com.kubi.market.monitor.lib.exeption.MarketMonitorException;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.y1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FloatingPagingPageAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\u0012\u001a\u00020\u000fJ\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J(\u0010\u0014\u001a\u00020\u000f2 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eJ\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\nJ\b\u0010\u0018\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\nH\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingPageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingPaginHolder;", "<init>", "()V", "listData", "", "Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;", "measuredMap", "Ljava/util/HashMap;", "", "Lcom/kubi/market/monitor/lib/entity/FloatingItemMeasureInfo;", "Lkotlin/collections/HashMap;", "onBindViewHolderCallBack", "Lkotlin/Function3;", "", "updateData", "newData", "clearData", "dataConversion", "setCallBack", "notifyPositionItemView", ViewProps.POSITION, "getPositionMeasuredInfo", "getItemCount", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFloatingPagingPageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingPagingPageAdapter.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingPageAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt\n+ 5 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n*L\n1#1,155:1\n1563#2:156\n1634#2,2:157\n1636#2:160\n1#3:159\n63#4,14:161\n78#4:179\n63#4,14:180\n78#4:198\n45#5,4:175\n45#5,4:194\n*S KotlinDebug\n*F\n+ 1 FloatingPagingPageAdapter.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingPageAdapter\n*L\n35#1:156\n35#1:157,2\n35#1:160\n85#1:161,14\n85#1:179\n112#1:180,14\n112#1:198\n85#1:175,4\n112#1:194,4\n*E\n"})
public final class FloatingPagingPageAdapter extends RecyclerView.Adapter<FloatingPaginHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<List<StateTradeItemBean>> f34556i = new ArrayList();

    /* JADX INFO: renamed from: j */
    @NotNull
    public final HashMap<Integer, FloatingItemMeasureInfo> f34557j = new HashMap<>();

    /* JADX INFO: renamed from: k */
    @Nullable
    public Function3<? super Integer, ? super Integer, ? super Integer, Unit> f34558k;

    @Nullable
    /* JADX INFO: renamed from: k */
    public final FloatingItemMeasureInfo m41412k(int i11) throws Throwable {
        Object obj;
        Object objM103844constructorimpl;
        if (i11 < 0 || i11 >= this.f34556i.size()) {
            return null;
        }
        boolean zM3900b = C4373b.m3900b();
        try {
            Result.Companion companion = Result.INSTANCE;
            obj = this.f34557j.get(Integer.valueOf(i11));
            try {
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (!zM3900b || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            if (!C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                C43846g.m96568c(new MarketMonitorException(thM103847exceptionOrNullimpl, "MarketMonitor", false, null, 8, null), null, 2, null);
            }
        }
        FloatingItemMeasureInfo floatingItemMeasureInfo = (FloatingItemMeasureInfo) obj;
        if (floatingItemMeasureInfo != null && floatingItemMeasureInfo.getMeasuredWidth() > 0 && floatingItemMeasureInfo.getMeasuredHeight() > 0) {
            return floatingItemMeasureInfo;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f34556i.size();
    }

    /* JADX INFO: renamed from: i */
    public final void m41410i() {
        this.f34556i.clear();
        this.f34557j.clear();
    }

    /* JADX INFO: renamed from: j */
    public final List<List<StateTradeItemBean>> m41411j(List<StateTradeItemBean> list) {
        ArrayList arrayList = new ArrayList();
        int iM41325B0 = FloatingActionManager.f34540a.m41325B0();
        int size = list.size();
        int i11 = ((size + iM41325B0) - 1) / iM41325B0;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 * iM41325B0;
            i12++;
            int i14 = i12 * iM41325B0;
            if (i14 >= size) {
                i14 = size;
            }
            arrayList.add(list.subList(i13, i14));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m41413l(int i11) {
        if (i11 < 0 || i11 >= getItemCount()) {
            return;
        }
        notifyItemChanged(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull FloatingPaginHolder holder, int i11) throws Throwable {
        Object objM103844constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        holder.m41398c(this.f34556i.get(i11));
        boolean zM3900b = C4373b.m3900b();
        try {
            Result.Companion companion = Result.INSTANCE;
            FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
            int iM41313u0 = FloatingActionManager.m41313u0(floatingActionManager, false, !floatingActionManager.m41356Z(), getItemCount() <= 1 || !floatingActionManager.m41350V0(), 1, null);
            int iM41385s0 = floatingActionManager.m41385s0();
            holder.itemView.measure(0, 0);
            int measuredWidth = holder.itemView.getMeasuredWidth();
            if (measuredWidth >= iM41313u0 || iM41313u0 <= 0) {
                iM41313u0 = measuredWidth > iM41385s0 ? iM41385s0 : measuredWidth;
            }
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            layoutParams.width = iM41313u0;
            holder.itemView.setLayoutParams(layoutParams);
            this.f34557j.put(Integer.valueOf(i11), new FloatingItemMeasureInfo(iM41313u0, holder.itemView.getMeasuredHeight()));
            Function3 function3 = this.f34558k;
            if (function3 != null) {
                function3.invoke(Integer.valueOf(i11), Integer.valueOf(iM41313u0), Integer.valueOf(holder.itemView.getMeasuredHeight()));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (!zM3900b || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            if (C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                return;
            }
            C43846g.m96568c(new MarketMonitorException(thM103847exceptionOrNullimpl, "MarketMonitor", false, null, 8, null), null, 2, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public FloatingPaginHolder onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.kucoin_floating_paging_item_layout, parent, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewInflate;
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new FloatingPaginHolder(recyclerView);
    }

    /* JADX INFO: renamed from: o */
    public final void m41416o(@Nullable Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        this.f34558k = function3;
    }

    /* JADX INFO: renamed from: p */
    public final void m41417p(@NotNull List<StateTradeItemBean> newData) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(newData, "newData");
        ArrayList<StateTradeItemBean> arrayList = new ArrayList();
        arrayList.addAll(newData);
        ArrayList arrayList2 = new ArrayList();
        if (this.f34556i.size() > 0) {
            int size = this.f34556i.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList2.addAll(this.f34556i.get(i11));
            }
        }
        if (arrayList2.size() > 0) {
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (StateTradeItemBean stateTradeItemBean : arrayList) {
                ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!Intrinsics.areEqual(stateTradeItemBean.getSymbol(), ((StateTradeItemBean) objPrevious).getSymbol()));
                FloatingActionManager.f34540a.m41362d1((StateTradeItemBean) objPrevious, stateTradeItemBean);
                arrayList3.add(Unit.INSTANCE);
            }
        }
        List<List<StateTradeItemBean>> listM41411j = m41411j(arrayList);
        m41410i();
        this.f34556i.addAll(listM41411j);
        notifyDataSetChanged();
    }
}
