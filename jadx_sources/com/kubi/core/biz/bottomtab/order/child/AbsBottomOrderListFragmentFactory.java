package com.kubi.core.biz.bottomtab.order.child;

import com.kubi.core.base.order.data.OrderLevelType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.child.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AbsBottomOrderListFragmentFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u0017\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/AbsBottomOrderListFragmentFactory;", "", "<init>", "()V", "getDelegateType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "delegationTitle", "", "delegationCount", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "getBaseFragment", "Lcom/kubi/core/biz/bottomtab/order/child/BottomOrderListFragment;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbsBottomOrderListFragmentFactory {
    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract String mo21487a(@Nullable Integer num);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract BottomOrderListFragment mo21488b();

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract OrderLevelType mo21489c();
}
