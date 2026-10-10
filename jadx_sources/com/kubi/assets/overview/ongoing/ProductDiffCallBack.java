package com.kubi.assets.overview.ongoing;

import androidx.recyclerview.widget.DiffUtil;
import com.kubi.assets.overview.ongoing.mapper.ProductItem;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.f0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ProductDiffCallBack.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/ProductDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProductDiffCallBack extends DiffUtil.ItemCallback<ProductItem> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull ProductItem oldItem, @NotNull ProductItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull ProductItem oldItem, @NotNull ProductItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof ProductItem.IsolatedItem) && (newItem instanceof ProductItem.IsolatedItem)) {
            return Intrinsics.areEqual(((ProductItem.IsolatedItem) oldItem).getName(), ((ProductItem.IsolatedItem) newItem).getName());
        }
        if ((oldItem instanceof ProductItem.RobotItem) && (newItem instanceof ProductItem.RobotItem)) {
            return Intrinsics.areEqual(((ProductItem.RobotItem) oldItem).getId(), ((ProductItem.RobotItem) newItem).getId());
        }
        if ((oldItem instanceof ProductItem.FinancialItem) && (newItem instanceof ProductItem.FinancialItem)) {
            return Intrinsics.areEqual(((ProductItem.FinancialItem) oldItem).getCurrency(), ((ProductItem.FinancialItem) newItem).getCurrency());
        }
        if ((oldItem instanceof ProductItem.CopyTradingItem) && (newItem instanceof ProductItem.CopyTradingItem)) {
            return Intrinsics.areEqual(((ProductItem.CopyTradingItem) oldItem).getLeadConfigId(), ((ProductItem.CopyTradingItem) newItem).getLeadConfigId());
        }
        if ((oldItem instanceof ProductItem.LeadTradingItem) && (newItem instanceof ProductItem.LeadTradingItem)) {
            return Intrinsics.areEqual(((ProductItem.LeadTradingItem) oldItem).getSymbol(), ((ProductItem.LeadTradingItem) newItem).getSymbol());
        }
        return ((oldItem instanceof ProductItem.ContractItem) && (newItem instanceof ProductItem.ContractItem)) ? Intrinsics.areEqual(((ProductItem.ContractItem) oldItem).getFormatSymbol(), ((ProductItem.ContractItem) newItem).getFormatSymbol()) : Intrinsics.areEqual(oldItem, newItem);
    }
}
