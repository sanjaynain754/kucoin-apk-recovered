package com.chad.library.adapter.base.dragswipe;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.dragswipe.listener.OnItemDragListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DragSwipeExt.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, m90084d2 = {"com/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemDragListener$4$listener$1", "Lcom/chad/library/adapter/base/dragswipe/listener/OnItemDragListener;", "onItemDragEnd", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "pos", "", "onItemDragMoving", "source", "from", "target", TypedValues.TransitionType.S_TO, "onItemDragStart", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 176)
@SourceDebugExtension({"SMAP\nDragSwipeExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragSwipeExt.kt\ncom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemDragListener$4$listener$1\n*L\n1#1,85:1\n*E\n"})
public final class DragSwipeExtKt$setItemDragListener$4$listener$1 implements OnItemDragListener {
    final /* synthetic */ Function2<RecyclerView.ViewHolder, Integer, Unit> $onItemDragEnd;
    final /* synthetic */ Function4<RecyclerView.ViewHolder, Integer, RecyclerView.ViewHolder, Integer, Unit> $onItemDragMoving;
    final /* synthetic */ Function2<RecyclerView.ViewHolder, Integer, Unit> $onItemDragStart;

    /* JADX WARN: Multi-variable type inference failed */
    public DragSwipeExtKt$setItemDragListener$4$listener$1(Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> function2, Function4<? super RecyclerView.ViewHolder, ? super Integer, ? super RecyclerView.ViewHolder, ? super Integer, Unit> function4, Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> function3) {
        this.$onItemDragStart = function2;
        this.$onItemDragMoving = function4;
        this.$onItemDragEnd = function3;
    }

    @Override // com.chad.library.adapter.base.dragswipe.listener.OnItemDragListener
    public void onItemDragStart(@Nullable RecyclerView.ViewHolder viewHolder, int pos) {
        this.$onItemDragStart.invoke(viewHolder, Integer.valueOf(pos));
    }

    @Override // com.chad.library.adapter.base.dragswipe.listener.OnItemDragListener
    public void onItemDragEnd(@NotNull RecyclerView.ViewHolder viewHolder, int pos) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.$onItemDragEnd.invoke(viewHolder, Integer.valueOf(pos));
    }

    @Override // com.chad.library.adapter.base.dragswipe.listener.OnItemDragListener
    public void onItemDragMoving(@NotNull RecyclerView.ViewHolder source, int from, @NotNull RecyclerView.ViewHolder target, int to2) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.$onItemDragMoving.invoke(source, Integer.valueOf(from), target, Integer.valueOf(to2));
    }
}
