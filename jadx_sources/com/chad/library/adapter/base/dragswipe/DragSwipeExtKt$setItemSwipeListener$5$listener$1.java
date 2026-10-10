package com.chad.library.adapter.base.dragswipe;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.dragswipe.listener.OnItemSwipeListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DragSwipeExt.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J0\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¨\u0006\u0014"}, m90084d2 = {"com/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemSwipeListener$5$listener$1", "Lcom/chad/library/adapter/base/dragswipe/listener/OnItemSwipeListener;", "onItemSwipeEnd", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "pos", "", "onItemSwipeMoving", "canvas", "Landroid/graphics/Canvas;", "dX", "", "dY", "isCurrentlyActive", "", "onItemSwipeStart", "onItemSwiped", "direction", "bindingAdapterPosition", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 176)
@SourceDebugExtension({"SMAP\nDragSwipeExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragSwipeExt.kt\ncom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemSwipeListener$5$listener$1\n*L\n1#1,85:1\n*E\n"})
public final class DragSwipeExtKt$setItemSwipeListener$5$listener$1 implements OnItemSwipeListener {
    final /* synthetic */ Function2<RecyclerView.ViewHolder, Integer, Unit> $onItemSwipeEnd;
    final /* synthetic */ Function5<Canvas, RecyclerView.ViewHolder, Float, Float, Boolean, Unit> $onItemSwipeMoving;
    final /* synthetic */ Function2<RecyclerView.ViewHolder, Integer, Unit> $onItemSwipeStart;
    final /* synthetic */ Function3<RecyclerView.ViewHolder, Integer, Integer, Unit> $onItemSwiped;

    /* JADX WARN: Multi-variable type inference failed */
    public DragSwipeExtKt$setItemSwipeListener$5$listener$1(Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> function2, Function5<? super Canvas, ? super RecyclerView.ViewHolder, ? super Float, ? super Float, ? super Boolean, Unit> function5, Function3<? super RecyclerView.ViewHolder, ? super Integer, ? super Integer, Unit> function3, Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> function4) {
        this.$onItemSwipeStart = function2;
        this.$onItemSwipeMoving = function5;
        this.$onItemSwiped = function3;
        this.$onItemSwipeEnd = function4;
    }

    @Override // com.chad.library.adapter.base.dragswipe.listener.OnItemSwipeListener
    public void onItemSwipeMoving(@NotNull Canvas canvas, @NotNull RecyclerView.ViewHolder viewHolder, float dX, float dY, boolean isCurrentlyActive) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.$onItemSwipeMoving.invoke(canvas, viewHolder, Float.valueOf(dX), Float.valueOf(dY), Boolean.valueOf(isCurrentlyActive));
    }

    @Override // com.chad.library.adapter.base.dragswipe.listener.OnItemSwipeListener
    public void onItemSwipeStart(@Nullable RecyclerView.ViewHolder viewHolder, int pos) {
        this.$onItemSwipeStart.invoke(viewHolder, Integer.valueOf(pos));
    }

    @Override // com.chad.library.adapter.base.dragswipe.listener.OnItemSwipeListener
    public void onItemSwipeEnd(@NotNull RecyclerView.ViewHolder viewHolder, int pos) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.$onItemSwipeEnd.invoke(viewHolder, Integer.valueOf(pos));
    }

    @Override // com.chad.library.adapter.base.dragswipe.listener.OnItemSwipeListener
    public void onItemSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int direction, int bindingAdapterPosition) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.$onItemSwiped.invoke(viewHolder, Integer.valueOf(direction), Integer.valueOf(bindingAdapterPosition));
    }
}
