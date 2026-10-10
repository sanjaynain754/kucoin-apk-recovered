package com.kubi.core.biz.bottomtab.order.child;

import android.content.Context;
import com.kubi.core.base.order.data.OrderItem;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p401kd.InterfaceC41007k;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.child.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AbsBottomOrderListFragmentFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JV\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/DelegationCustomItemBind;", "", "bindDataToItemView", "", "context", "Landroid/content/Context;", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "curSymbol", "", "needJumpGuideIcon", "", "isMargin", "cancelOrder", "Lkotlin/Function1;", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface DelegationCustomItemBind {
    /* JADX INFO: renamed from: b */
    void mo21491b(@NotNull Context context, @Nullable BaseViewHolder baseViewHolder, @Nullable OrderItem orderItem, @Nullable String str, boolean z11, boolean z12, @NotNull Function1<? super InterfaceC41007k, Unit> function1);

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m21490a(DelegationCustomItemBind delegationCustomItemBind, Context context, BaseViewHolder baseViewHolder, OrderItem orderItem, String str, boolean z11, boolean z12, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindDataToItemView");
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        if ((i11 & 32) != 0) {
            z12 = false;
        }
        delegationCustomItemBind.mo21491b(context, baseViewHolder, orderItem, str, z11, z12, function1);
    }
}
