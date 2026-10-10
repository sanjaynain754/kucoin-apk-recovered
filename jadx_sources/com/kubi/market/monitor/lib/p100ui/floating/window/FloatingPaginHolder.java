package com.kubi.market.monitor.lib.p100ui.floating.window;

import androidx.recyclerview.widget.RecyclerView;
import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.w1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FloatingPaginHolder.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingPaginHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroidx/recyclerview/widget/RecyclerView;", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mAdapter", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingItemAdapter;", "getMAdapter", "()Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingItemAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "bindDdata", "", "data", "", "Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FloatingPaginHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f34551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingPaginHolder(@NotNull RecyclerView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f34551g = LazyKt.lazy(new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.v1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatingPaginHolder.m41397e();
            }
        });
        itemView.setAdapter(m41399d());
    }

    /* JADX INFO: renamed from: e */
    public static final FloatingPagingItemAdapter m41397e() {
        return new FloatingPagingItemAdapter();
    }

    /* JADX INFO: renamed from: c */
    public final void m41398c(@NotNull List<StateTradeItemBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        m41399d().m41406m(data);
    }

    /* JADX INFO: renamed from: d */
    public final FloatingPagingItemAdapter m41399d() {
        return (FloatingPagingItemAdapter) this.f34551g.getValue();
    }
}
