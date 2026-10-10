package com.kubi.core.biz.bottomtab.order.child;

import android.content.Context;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.child.o, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BottomOrderListListFragmentFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/BottomOrderListListFragmentFactory;", "Lcom/kubi/core/biz/bottomtab/order/child/AbsBottomOrderListFragmentFactory;", "context", "Landroid/content/Context;", "titleRes", "", "orderLevelType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "<init>", "(Landroid/content/Context;ILcom/kubi/core/base/order/data/OrderLevelType;)V", "delegationTitle", "", "delegationCount", "(Ljava/lang/Integer;)Ljava/lang/String;", "getDelegateType", "getBaseFragment", "Lcom/kubi/core/biz/bottomtab/order/child/BottomOrderListFragment;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BottomOrderListListFragmentFactory extends AbsBottomOrderListFragmentFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f20254a;

    /* JADX INFO: renamed from: b */
    public final int f20255b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final OrderLevelType f20256c;

    public BottomOrderListListFragmentFactory(@NotNull Context context, int i11, @NotNull OrderLevelType orderLevelType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orderLevelType, "orderLevelType");
        this.f20254a = context;
        this.f20255b = i11;
        this.f20256c = orderLevelType;
    }

    @Override // com.kubi.core.biz.bottomtab.order.child.AbsBottomOrderListFragmentFactory
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo21487a(@Nullable Integer num) {
        String str;
        if (!IUserService.a.get().c() || num == null) {
            String string = this.f20254a.getString(this.f20255b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20254a.getString(this.f20255b));
        if (num.intValue() > 99) {
            str = " (99+) ";
        } else {
            str = " (" + num + ") ";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // com.kubi.core.biz.bottomtab.order.child.AbsBottomOrderListFragmentFactory
    @NotNull
    /* JADX INFO: renamed from: b */
    public BottomOrderListFragment mo21488b() {
        return BottomOrderListFragment.f20227i0.newInstance(this.f20256c);
    }

    @Override // com.kubi.core.biz.bottomtab.order.child.AbsBottomOrderListFragmentFactory
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public OrderLevelType getF20256c() {
        return this.f20256c;
    }
}
