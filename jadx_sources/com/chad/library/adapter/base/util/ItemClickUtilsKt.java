package com.chad.library.adapter.base.util;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemClickUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aT\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\u001aJ\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\f¨\u0006\r"}, m90084d2 = {"addOnDebouncedChildClick", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "id", "", "time", "", "block", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemChildClickListener;", "setOnDebouncedItemClick", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;", "com.github.CymChad.brvah"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ItemClickUtilsKt {
    @NotNull
    public static final <T, VH extends RecyclerView.ViewHolder> BaseQuickAdapter<T, VH> addOnDebouncedChildClick(@NotNull BaseQuickAdapter<T, VH> baseQuickAdapter, @IdRes int i11, long j11, @NotNull final BaseQuickAdapter.OnItemChildClickListener<T> block) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return baseQuickAdapter.addOnItemChildClickListener(i11, new DebouncedClickListener<T>(j11) { // from class: com.chad.library.adapter.base.util.ItemClickUtilsKt.addOnDebouncedChildClick.1
            @Override // com.chad.library.adapter.base.util.DebouncedClickListener
            public void onSingleClick(@NotNull BaseQuickAdapter<T, ?> adapter, @NotNull View view, int position) {
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                block.onItemClick(adapter, view, position);
            }
        });
    }

    public static /* synthetic */ BaseQuickAdapter addOnDebouncedChildClick$default(BaseQuickAdapter baseQuickAdapter, int i11, long j11, BaseQuickAdapter.OnItemChildClickListener onItemChildClickListener, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = 500;
        }
        return addOnDebouncedChildClick(baseQuickAdapter, i11, j11, onItemChildClickListener);
    }

    @NotNull
    public static final <T, VH extends RecyclerView.ViewHolder> BaseQuickAdapter<T, VH> setOnDebouncedItemClick(@NotNull BaseQuickAdapter<T, VH> baseQuickAdapter, long j11, @NotNull final BaseQuickAdapter.OnItemClickListener<T> block) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return baseQuickAdapter.setOnItemClickListener(new DebouncedClickListener<T>(j11) { // from class: com.chad.library.adapter.base.util.ItemClickUtilsKt.setOnDebouncedItemClick.1
            @Override // com.chad.library.adapter.base.util.DebouncedClickListener
            public void onSingleClick(@NotNull BaseQuickAdapter<T, ?> adapter, @NotNull View view, int position) {
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                block.onClick(adapter, view, position);
            }
        });
    }

    public static /* synthetic */ BaseQuickAdapter setOnDebouncedItemClick$default(BaseQuickAdapter baseQuickAdapter, long j11, BaseQuickAdapter.OnItemClickListener onItemClickListener, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 500;
        }
        return setOnDebouncedItemClick(baseQuickAdapter, j11, onItemClickListener);
    }
}
