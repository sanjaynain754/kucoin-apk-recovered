package com.kubi.market.monitor.lib.p100ui.floating.window;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.market.monitor.lib.entity.FloatingItemMeasureInfo;
import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.x1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FloatingPagingItemAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\u0013\u001a\u00020\u000bJ(\u0010\u0014\u001a\u00020\u000b2 \u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tJ\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\nJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\nJ\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016J\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingViewHolder;", "<init>", "()V", "listData", "", "Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;", "onBindViewHolderCallBack", "Lkotlin/Function3;", "", "", "measuredMap", "Ljava/util/HashMap;", "Lcom/kubi/market/monitor/lib/entity/FloatingItemMeasureInfo;", "Lkotlin/collections/HashMap;", "updateListData", "newData", "updateData", "clearData", "setCallBack", "callBack", "notifyPositionItemView", ViewProps.POSITION, "getPositionMeasureInfo", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", C33954u6.f72238i, "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFloatingPagingItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingPagingItemAdapter.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingItemAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1563#2:137\n1634#2,2:138\n1636#2:141\n1#3:140\n*S KotlinDebug\n*F\n+ 1 FloatingPagingItemAdapter.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingItemAdapter\n*L\n35#1:137\n35#1:138,2\n35#1:141\n*E\n"})
public final class FloatingPagingItemAdapter extends RecyclerView.Adapter<FloatingViewHolder> {

    /* JADX INFO: renamed from: j */
    @Nullable
    public Function3<? super Integer, ? super Integer, ? super Integer, Unit> f34554j;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<StateTradeItemBean> f34553i = new ArrayList();

    /* JADX INFO: renamed from: k */
    @NotNull
    public final HashMap<Integer, FloatingItemMeasureInfo> f34555k = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public final void m41400g() {
        this.f34553i.clear();
        this.f34555k.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f34553i.size();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final FloatingItemMeasureInfo m41401h(int i11) {
        if (i11 < 0 || i11 >= getItemCount()) {
            return null;
        }
        return this.f34555k.get(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: i */
    public final void m41402i(int i11) {
        if (i11 < 0 || i11 >= getItemCount()) {
            return;
        }
        notifyItemChanged(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull FloatingViewHolder holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        holder.m41102c(i11, this.f34553i.get(i11));
        Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3 = this.f34554j;
        if (function3 != null) {
            holder.itemView.measure(0, 0);
            int measuredWidth = holder.itemView.getMeasuredWidth();
            FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
            int iM41313u0 = FloatingActionManager.m41313u0(floatingActionManager, false, !floatingActionManager.m41356Z(), false, 5, null);
            int iM41385s0 = floatingActionManager.m41385s0();
            ViewGroup.LayoutParams layoutParams = null;
            if (measuredWidth < iM41313u0) {
                View view = holder.itemView;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = iM41313u0;
                    layoutParams = layoutParams2;
                }
                view.setLayoutParams(layoutParams);
                measuredWidth = iM41313u0;
            } else if (measuredWidth > iM41385s0) {
                View view2 = holder.itemView;
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = iM41385s0;
                    layoutParams = layoutParams3;
                }
                view2.setLayoutParams(layoutParams);
                measuredWidth = iM41385s0;
            }
            int measuredHeight = holder.itemView.getMeasuredHeight();
            this.f34555k.put(Integer.valueOf(i11), new FloatingItemMeasureInfo(measuredWidth, measuredHeight));
            function3.invoke(Integer.valueOf(i11), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public FloatingViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.view_floatingwindow_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new FloatingViewHolder(viewInflate);
    }

    /* JADX INFO: renamed from: l */
    public final void m41405l(@Nullable Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        this.f34554j = function3;
    }

    /* JADX INFO: renamed from: m */
    public final void m41406m(@NotNull List<StateTradeItemBean> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        m41400g();
        this.f34553i.addAll(newData);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n */
    public final void m41407n(@NotNull List<StateTradeItemBean> newData) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(newData, "newData");
        ArrayList<StateTradeItemBean> arrayList = new ArrayList();
        arrayList.addAll(newData);
        ArrayList arrayList2 = new ArrayList();
        if (this.f34553i.size() > 0) {
            arrayList2.addAll(this.f34553i);
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
        m41400g();
        this.f34553i.addAll(arrayList);
        notifyDataSetChanged();
    }
}
