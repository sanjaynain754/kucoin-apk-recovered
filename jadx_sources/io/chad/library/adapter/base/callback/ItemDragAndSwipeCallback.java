package io.chad.library.adapter.base.callback;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import io.chad.library.R$id;
import io.chad.library.adapter.base.BaseItemDraggableAdapter;

/* JADX INFO: loaded from: classes60.dex */
public class ItemDragAndSwipeCallback extends ItemTouchHelper.Callback {
    private BaseItemDraggableAdapter mAdapter;
    private float mMoveThreshold = 0.1f;
    private float mSwipeThreshold = 0.7f;
    private int mDragMoveFlags = 15;
    private int mSwipeMoveFlags = 32;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i11) {
        if (i11 == 2 && !isViewCreateByAdapter(viewHolder)) {
            this.mAdapter.onItemDragStart(viewHolder);
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.TRUE);
        } else if (i11 == 1 && !isViewCreateByAdapter(viewHolder)) {
            this.mAdapter.onItemSwipeStart(viewHolder);
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.TRUE);
        }
        super.onSelectedChanged(viewHolder, i11);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
        return this.mMoveThreshold;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
        return this.mSwipeThreshold;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return this.mAdapter.isItemSwipeEnable();
    }

    public void setDragMoveFlags(int i11) {
        this.mDragMoveFlags = i11;
    }

    public void setMoveThreshold(float f11) {
        this.mMoveThreshold = f11;
    }

    public void setSwipeMoveFlags(int i11) {
        this.mSwipeMoveFlags = i11;
    }

    public void setSwipeThreshold(float f11) {
        this.mSwipeThreshold = f11;
    }

    public ItemDragAndSwipeCallback(BaseItemDraggableAdapter baseItemDraggableAdapter) {
        this.mAdapter = baseItemDraggableAdapter;
    }

    private boolean isViewCreateByAdapter(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType != 273 && itemViewType != 546 && itemViewType != 819 && itemViewType != 1365) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        if (!isViewCreateByAdapter(viewHolder)) {
            View view = viewHolder.itemView;
            int i11 = R$id.BaseQuickAdapter_dragging_support;
            if (view.getTag(i11) != null && ((Boolean) viewHolder.itemView.getTag(i11)).booleanValue()) {
                this.mAdapter.onItemDragEnd(viewHolder);
                viewHolder.itemView.setTag(i11, Boolean.FALSE);
            }
            View view2 = viewHolder.itemView;
            int i12 = R$id.BaseQuickAdapter_swiping_support;
            if (view2.getTag(i12) != null && ((Boolean) viewHolder.itemView.getTag(i12)).booleanValue()) {
                this.mAdapter.onItemSwipeClear(viewHolder);
                viewHolder.itemView.setTag(i12, Boolean.FALSE);
            }
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (isViewCreateByAdapter(viewHolder)) {
            return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
        }
        return ItemTouchHelper.Callback.makeMovementFlags(this.mDragMoveFlags, this.mSwipeMoveFlags);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f11, float f12, int i11, boolean z11) {
        super.onChildDrawOver(canvas, recyclerView, viewHolder, f11, f12, i11, z11);
        if (i11 == 1 && !isViewCreateByAdapter(viewHolder)) {
            View view = viewHolder.itemView;
            canvas.save();
            if (f11 > 0.0f) {
                canvas.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f11, view.getBottom());
                canvas.translate(view.getLeft(), view.getTop());
            } else {
                canvas.clipRect(view.getRight() + f11, view.getTop(), view.getRight(), view.getBottom());
                canvas.translate(view.getRight() + f11, view.getTop());
            }
            this.mAdapter.onItemSwiping(canvas, viewHolder, f11, f12, z11);
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder.getItemViewType() == viewHolder2.getItemViewType()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i11, RecyclerView.ViewHolder viewHolder2, int i12, int i13, int i14) {
        super.onMoved(recyclerView, viewHolder, i11, viewHolder2, i12, i13, i14);
        this.mAdapter.onItemDragMoving(viewHolder, viewHolder2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i11) {
        if (!isViewCreateByAdapter(viewHolder)) {
            this.mAdapter.onItemSwiped(viewHolder);
        }
    }
}
