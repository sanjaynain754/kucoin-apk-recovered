package com.kubi.payment.channel.paymentmethod.withdraw;

import androidx.recyclerview.widget.DiffUtil;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.channel.paymentmethod.withdraw.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WithdrawPaymentMethodAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/withdraw/WithDrawPaymentMethodItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WithDrawPaymentMethodItemCallback extends DiffUtil.ItemCallback<PaymentMethod> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull PaymentMethod oldItem, @NotNull PaymentMethod newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull PaymentMethod oldItem, @NotNull PaymentMethod newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.getPaymentMethodCode(), newItem.getPaymentMethodCode()) && Intrinsics.areEqual(oldItem.getChannelId(), newItem.getChannelId());
    }
}
