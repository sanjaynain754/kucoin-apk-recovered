package com.kubi.payment.fasttradev2.buy.paymentmethod;

import androidx.recyclerview.widget.DiffUtil;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.paymentmethod.u, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BuyPaymentMethodAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyItemPaymentMethod;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BuyPaymentMethodDiffCallBack extends DiffUtil.ItemCallback<BuyItemPaymentMethod> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull BuyItemPaymentMethod oldItem, @NotNull BuyItemPaymentMethod newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull BuyItemPaymentMethod oldItem, @NotNull BuyItemPaymentMethod newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof BuyItemPaymentMethod.ItemCategory) && (newItem instanceof BuyItemPaymentMethod.ItemCategory)) {
            BuyItemPaymentMethod.ItemCategory itemCategory = (BuyItemPaymentMethod.ItemCategory) oldItem;
            BuyItemPaymentMethod.ItemCategory itemCategory2 = (BuyItemPaymentMethod.ItemCategory) newItem;
            return Intrinsics.areEqual(itemCategory.getTitle(), itemCategory2.getTitle()) && itemCategory.getCanEdit() == itemCategory2.getCanEdit();
        }
        if (!(oldItem instanceof BuyItemPaymentMethod.ItemNormalPaymentMethod) || !(newItem instanceof BuyItemPaymentMethod.ItemNormalPaymentMethod)) {
            return (oldItem instanceof BuyItemPaymentMethod.ItemGuideP2P) && (newItem instanceof BuyItemPaymentMethod.ItemGuideP2P);
        }
        BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (BuyItemPaymentMethod.ItemNormalPaymentMethod) oldItem;
        BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod2 = (BuyItemPaymentMethod.ItemNormalPaymentMethod) newItem;
        return itemNormalPaymentMethod.isSelected() == itemNormalPaymentMethod2.isSelected() && Intrinsics.areEqual(itemNormalPaymentMethod.getValue(), itemNormalPaymentMethod2.getValue()) && Intrinsics.areEqual(itemNormalPaymentMethod.getCurrency(), itemNormalPaymentMethod2.getCurrency()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodCode(), itemNormalPaymentMethod2.getPaymentMethod().getPaymentMethodCode()) && Intrinsics.areEqual(itemNormalPaymentMethod.getPaymentMethod().getChannelId(), itemNormalPaymentMethod2.getPaymentMethod().getChannelId());
    }
}
