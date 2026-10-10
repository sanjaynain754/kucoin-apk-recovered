package com.kubi.payment.p2p.order;

import androidx.lifecycle.LiveData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.payment.p2p.order.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OrderCountdownOwner.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/OrderCountdownOwner;", "", "autoCancelOrderTime", "Landroidx/lifecycle/LiveData;", "", "getAutoCancelOrderTime", "()Landroidx/lifecycle/LiveData;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface OrderCountdownOwner {
    @NotNull
    /* JADX INFO: renamed from: f1 */
    LiveData<Long> mo48711f1();
}
