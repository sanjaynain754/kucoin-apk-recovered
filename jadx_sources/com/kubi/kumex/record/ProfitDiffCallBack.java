package com.kubi.kumex.record;

import androidx.recyclerview.widget.DiffUtil;
import com.kubi.utils.C27022e0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.record.q0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ProfitRecordFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/record/ProfitDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProfitDiffCallBack extends DiffUtil.ItemCallback<Object> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull Object oldItem, @NotNull Object newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!(oldItem instanceof ProfitRecordObject)) {
            return true;
        }
        ProfitRecordObject profitRecordObject = (ProfitRecordObject) newItem;
        C27022e0 c27022e0 = C27022e0.f54314a;
        ProfitRecordObject profitRecordObject2 = (ProfitRecordObject) oldItem;
        return c27022e0.m66528a(profitRecordObject2.getF29936a().getSymbol(), profitRecordObject.getF29936a().getSymbol()) && c27022e0.m66528a(profitRecordObject2.getF29936a().getCloseDate(), profitRecordObject.getF29936a().getCloseDate()) && c27022e0.m66528a(profitRecordObject2.getF29936a().getRealisedPnl(), profitRecordObject.getF29936a().getRealisedPnl());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull Object oldItem, @NotNull Object newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!Intrinsics.areEqual(oldItem.getClass(), newItem.getClass())) {
            return false;
        }
        if (oldItem instanceof ProfitRecordObject) {
            return Intrinsics.areEqual(((ProfitRecordObject) oldItem).getF29936a().getOffset(), ((ProfitRecordObject) newItem).getF29936a().getOffset());
        }
        return true;
    }
}
