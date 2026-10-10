package com.kubi.kumex.record;

import androidx.recyclerview.widget.DiffUtil;
import com.kubi.utils.C27022e0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.record.i1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeRecordFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/record/TradeItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeItemCallback extends DiffUtil.ItemCallback<Object> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull Object oldItem, @NotNull Object newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!(oldItem instanceof TradeRecordObject)) {
            return true;
        }
        C27022e0 c27022e0 = C27022e0.f54314a;
        TradeRecordObject tradeRecordObject = (TradeRecordObject) oldItem;
        TradeRecordObject tradeRecordObject2 = (TradeRecordObject) newItem;
        return c27022e0.m66528a(tradeRecordObject.getF30344a().getSymbol(), tradeRecordObject2.getF30344a().getSymbol()) && c27022e0.m66528a(tradeRecordObject.getF30344a().getType(), tradeRecordObject2.getF30344a().getType()) && c27022e0.m66528a(tradeRecordObject.getF30344a().getSide(), tradeRecordObject2.getF30344a().getSide()) && c27022e0.m66528a(tradeRecordObject.getF30344a().getFillType(), tradeRecordObject2.getF30344a().getFillType()) && c27022e0.m66528a(tradeRecordObject.getF30344a().getDisplayType(), tradeRecordObject2.getF30344a().getDisplayType()) && c27022e0.m66528a(tradeRecordObject.getF30344a().getCreatedAt(), tradeRecordObject2.getF30344a().getCreatedAt()) && c27022e0.m66528a(tradeRecordObject.getF30344a().getLiquidationPrice(), tradeRecordObject2.getF30344a().getLiquidationPrice()) && c27022e0.m66528a(tradeRecordObject.getF30344a().getPrice(), tradeRecordObject2.getF30344a().getPrice()) && c27022e0.m66528a(tradeRecordObject.getF30344a().getSize(), tradeRecordObject2.getF30344a().getSize());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull Object oldItem, @NotNull Object newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!Intrinsics.areEqual(oldItem.getClass(), newItem.getClass())) {
            return false;
        }
        if (oldItem instanceof TradeRecordObject) {
            return Intrinsics.areEqual(((TradeRecordObject) oldItem).getF30344a().getTradeId(), ((TradeRecordObject) newItem).getF30344a().getTradeId());
        }
        return true;
    }
}
