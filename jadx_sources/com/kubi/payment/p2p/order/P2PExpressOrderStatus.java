package com.kubi.payment.p2p.order;

import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.p2p.order.n1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OrderStatus.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/P2PExpressOrderStatus;", "", "<init>", "()V", "UNCONFIRMED", "", "PROCESSING", "SUCCEEDED", "FAILED", OrderDetailInfo.ORDER_STATUS_CANCELED, "isFinalStatus", "", "expressOrderStatus", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PExpressOrderStatus {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final P2PExpressOrderStatus f39866a = new P2PExpressOrderStatus();

    /* JADX INFO: renamed from: a */
    public final boolean m48913a(@Nullable String str) {
        return Intrinsics.areEqual(str, "SUCCEEDED") || Intrinsics.areEqual(str, "FAILED") || Intrinsics.areEqual(str, OrderDetailInfo.ORDER_STATUS_CANCELED);
    }
}
