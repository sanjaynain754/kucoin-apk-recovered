package com.kubi.core.biz.bottomtab.order.child;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.child.r */
/* JADX INFO: compiled from: OrderListOperatorContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$BizEvent;", "", "CancelOrderResult", "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$BizEvent$CancelOrderResult;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC11768r {

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.child.r$a */
    /* JADX INFO: compiled from: OrderListOperatorContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$BizEvent$CancelOrderResult;", "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$BizEvent;", "isSuccess", "", "isNeedRefresh", "toastResId", "", "<init>", "(ZZLjava/lang/Integer;)V", "()Z", "getToastResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC11768r {

        /* JADX INFO: renamed from: a */
        public final boolean f20257a;

        /* JADX INFO: renamed from: b */
        public final boolean f20258b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Integer f20259c;

        public a(boolean z11, boolean z12, @Nullable Integer num) {
            this.f20257a = z11;
            this.f20258b = z12;
            this.f20259c = num;
        }

        public /* synthetic */ a(boolean z11, boolean z12, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, z12, (i11 & 4) != 0 ? null : num);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getF20259c() {
            return this.f20259c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF20258b() {
            return this.f20258b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF20257a() {
            return this.f20257a;
        }
    }
}
