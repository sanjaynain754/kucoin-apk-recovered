package com.chad.library.adapter.base.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.fullspan.FullSpanAdapterType;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QuickGridLayoutManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001bB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ$\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00112\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "spanCount", "(Landroid/content/Context;I)V", "orientation", "reverseLayout", "", "(Landroid/content/Context;IIZ)V", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "fullSpanSizeLookup", "Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;", "onAdapterChanged", "", "oldAdapter", "newAdapter", "setSpanSizeLookup", "spanSizeLookup", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "FullSpanSizeLookup", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class QuickGridLayoutManager extends GridLayoutManager {

    @Nullable
    private RecyclerView.Adapter<?> adapter;

    @NotNull
    private final FullSpanSizeLookup fullSpanSizeLookup;

    /* JADX INFO: compiled from: QuickGridLayoutManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$FullSpanSizeLookup;", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "(Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;)V", "originalSpanSizeLookup", "getOriginalSpanSizeLookup", "()Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "setOriginalSpanSizeLookup", "(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V", "getSpanSize", "", ViewProps.POSITION, "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class FullSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {

        @Nullable
        private GridLayoutManager.SpanSizeLookup originalSpanSizeLookup;

        public FullSpanSizeLookup() {
        }

        @Nullable
        public final GridLayoutManager.SpanSizeLookup getOriginalSpanSizeLookup() {
            return this.originalSpanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int position) {
            RecyclerView.Adapter adapter = QuickGridLayoutManager.this.adapter;
            if (adapter == null) {
                return 1;
            }
            if (!(adapter instanceof ConcatAdapter)) {
                if (adapter instanceof FullSpanAdapterType) {
                    return QuickGridLayoutManager.this.getSpanCount();
                }
                if (!(adapter instanceof BaseQuickAdapter)) {
                    GridLayoutManager.SpanSizeLookup spanSizeLookup = this.originalSpanSizeLookup;
                    if (spanSizeLookup != null) {
                        return spanSizeLookup.getSpanSize(position);
                    }
                    return 1;
                }
                if (((BaseQuickAdapter) adapter).isFullSpanItem(adapter.getItemViewType(position))) {
                    return QuickGridLayoutManager.this.getSpanCount();
                }
                GridLayoutManager.SpanSizeLookup spanSizeLookup2 = this.originalSpanSizeLookup;
                if (spanSizeLookup2 != null) {
                    return spanSizeLookup2.getSpanSize(position);
                }
                return 1;
            }
            Pair<RecyclerView.Adapter<? extends RecyclerView.ViewHolder>, Integer> wrappedAdapterAndPosition = ((ConcatAdapter) adapter).getWrappedAdapterAndPosition(position);
            Intrinsics.checkNotNullExpressionValue(wrappedAdapterAndPosition, "adapter.getWrappedAdapterAndPosition(position)");
            RecyclerView.Adapter adapter2 = (RecyclerView.Adapter) wrappedAdapterAndPosition.first;
            if (adapter2 instanceof FullSpanAdapterType) {
                return QuickGridLayoutManager.this.getSpanCount();
            }
            if (!(adapter2 instanceof BaseQuickAdapter)) {
                GridLayoutManager.SpanSizeLookup spanSizeLookup3 = this.originalSpanSizeLookup;
                if (spanSizeLookup3 == null) {
                    return 1;
                }
                Object obj = wrappedAdapterAndPosition.second;
                Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                return spanSizeLookup3.getSpanSize(((Number) obj).intValue());
            }
            Object obj2 = wrappedAdapterAndPosition.second;
            Intrinsics.checkNotNullExpressionValue(obj2, "pair.second");
            if (((BaseQuickAdapter) adapter2).isFullSpanItem(adapter2.getItemViewType(((Number) obj2).intValue()))) {
                return QuickGridLayoutManager.this.getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup4 = this.originalSpanSizeLookup;
            if (spanSizeLookup4 == null) {
                return 1;
            }
            Object obj3 = wrappedAdapterAndPosition.second;
            Intrinsics.checkNotNullExpressionValue(obj3, "pair.second");
            return spanSizeLookup4.getSpanSize(((Number) obj3).intValue());
        }

        public final void setOriginalSpanSizeLookup(@Nullable GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.originalSpanSizeLookup = spanSizeLookup;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickGridLayoutManager(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        FullSpanSizeLookup fullSpanSizeLookup = new FullSpanSizeLookup();
        this.fullSpanSizeLookup = fullSpanSizeLookup;
        fullSpanSizeLookup.setOriginalSpanSizeLookup(getSpanSizeLookup());
        super.setSpanSizeLookup(fullSpanSizeLookup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(@Nullable RecyclerView.Adapter<?> oldAdapter, @Nullable RecyclerView.Adapter<?> newAdapter) {
        this.adapter = newAdapter;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager
    public void setSpanSizeLookup(@Nullable GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.fullSpanSizeLookup.setOriginalSpanSizeLookup(spanSizeLookup);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickGridLayoutManager(@NotNull Context context, int i11) {
        super(context, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        FullSpanSizeLookup fullSpanSizeLookup = new FullSpanSizeLookup();
        this.fullSpanSizeLookup = fullSpanSizeLookup;
        fullSpanSizeLookup.setOriginalSpanSizeLookup(getSpanSizeLookup());
        super.setSpanSizeLookup(fullSpanSizeLookup);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickGridLayoutManager(@NotNull Context context, int i11, int i12, boolean z11) {
        super(context, i11, i12, z11);
        Intrinsics.checkNotNullParameter(context, "context");
        FullSpanSizeLookup fullSpanSizeLookup = new FullSpanSizeLookup();
        this.fullSpanSizeLookup = fullSpanSizeLookup;
        fullSpanSizeLookup.setOriginalSpanSizeLookup(getSpanSizeLookup());
        super.setSpanSizeLookup(fullSpanSizeLookup);
    }
}
