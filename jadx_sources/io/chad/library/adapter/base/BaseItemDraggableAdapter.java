package io.chad.library.adapter.base;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import io.chad.library.R$id;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.listener.OnItemDragListener;
import io.chad.library.adapter.base.listener.OnItemSwipeListener;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public abstract class BaseItemDraggableAdapter<T, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    private static final String ERROR_NOT_SAME_ITEMTOUCHHELPER = "Item drag and item swipe should pass the same ItemTouchHelper";
    private static final int NO_TOGGLE_VIEW = 0;
    protected boolean itemDragEnabled;
    protected boolean itemSwipeEnabled;
    protected boolean mDragOnLongPress;
    protected ItemTouchHelper mItemTouchHelper;
    protected OnItemDragListener mOnItemDragListener;
    protected OnItemSwipeListener mOnItemSwipeListener;
    protected View.OnLongClickListener mOnToggleViewLongClickListener;
    protected View.OnTouchListener mOnToggleViewTouchListener;
    protected int mToggleViewId;

    public BaseItemDraggableAdapter(List<T> list) {
        super(list);
        this.mToggleViewId = 0;
        this.itemDragEnabled = false;
        this.itemSwipeEnabled = false;
        this.mDragOnLongPress = true;
    }

    public void disableDragItem() {
        this.itemDragEnabled = false;
        this.mItemTouchHelper = null;
    }

    public void disableSwipeItem() {
        this.itemSwipeEnabled = false;
    }

    public void enableDragItem(@NonNull ItemTouchHelper itemTouchHelper) {
        enableDragItem(itemTouchHelper, 0, true);
    }

    public void enableSwipeItem() {
        this.itemSwipeEnabled = true;
    }

    private boolean inRange(int i11) {
        return i11 >= 0 && i11 < this.mData.size();
    }

    public void enableDragItem(@NonNull ItemTouchHelper itemTouchHelper, int i11, boolean z11) {
        this.itemDragEnabled = true;
        this.mItemTouchHelper = itemTouchHelper;
        setToggleViewId(i11);
        setToggleDragOnLongPress(z11);
    }

    public boolean isItemDraggable() {
        return this.itemDragEnabled;
    }

    public boolean isItemSwipeEnable() {
        return this.itemSwipeEnabled;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(K k11, int i11) {
        super.onBindViewHolder((BaseViewHolder) k11, i11);
        int itemViewType = k11.getItemViewType();
        if (this.mItemTouchHelper == null || !this.itemDragEnabled || itemViewType == 546 || itemViewType == 273 || itemViewType == 1365 || itemViewType == 819) {
            return;
        }
        int i12 = this.mToggleViewId;
        if (i12 == 0) {
            k11.itemView.setTag(R$id.BaseQuickAdapter_viewholder_support, k11);
            k11.itemView.setOnLongClickListener(this.mOnToggleViewLongClickListener);
            return;
        }
        View view = k11.getView(i12);
        if (view != null) {
            view.setTag(R$id.BaseQuickAdapter_viewholder_support, k11);
            if (this.mDragOnLongPress) {
                view.setOnLongClickListener(this.mOnToggleViewLongClickListener);
            } else {
                view.setOnTouchListener(this.mOnToggleViewTouchListener);
            }
        }
    }

    public void onItemDragEnd(RecyclerView.ViewHolder viewHolder) {
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener == null || !this.itemDragEnabled) {
            return;
        }
        onItemDragListener.onItemDragEnd(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void onItemDragStart(RecyclerView.ViewHolder viewHolder) {
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener == null || !this.itemDragEnabled) {
            return;
        }
        onItemDragListener.onItemDragStart(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void onItemSwipeClear(RecyclerView.ViewHolder viewHolder) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener == null || !this.itemSwipeEnabled) {
            return;
        }
        onItemSwipeListener.clearView(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void onItemSwipeStart(RecyclerView.ViewHolder viewHolder) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener == null || !this.itemSwipeEnabled) {
            return;
        }
        onItemSwipeListener.onItemSwipeStart(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void onItemSwiping(Canvas canvas, RecyclerView.ViewHolder viewHolder, float f11, float f12, boolean z11) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener == null || !this.itemSwipeEnabled) {
            return;
        }
        onItemSwipeListener.onItemSwipeMoving(canvas, viewHolder, f11, f12, z11);
    }

    public void setOnItemDragListener(OnItemDragListener onItemDragListener) {
        this.mOnItemDragListener = onItemDragListener;
    }

    public void setOnItemSwipeListener(OnItemSwipeListener onItemSwipeListener) {
        this.mOnItemSwipeListener = onItemSwipeListener;
    }

    public void setToggleDragOnLongPress(boolean z11) {
        this.mDragOnLongPress = z11;
        if (z11) {
            this.mOnToggleViewTouchListener = null;
            this.mOnToggleViewLongClickListener = new View.OnLongClickListener() { // from class: io.chad.library.adapter.base.BaseItemDraggableAdapter.1
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    BaseItemDraggableAdapter baseItemDraggableAdapter = BaseItemDraggableAdapter.this;
                    ItemTouchHelper itemTouchHelper = baseItemDraggableAdapter.mItemTouchHelper;
                    if (itemTouchHelper == null || !baseItemDraggableAdapter.itemDragEnabled) {
                        return true;
                    }
                    itemTouchHelper.startDrag((RecyclerView.ViewHolder) view.getTag(R$id.BaseQuickAdapter_viewholder_support));
                    return true;
                }
            };
        } else {
            this.mOnToggleViewTouchListener = new View.OnTouchListener() { // from class: io.chad.library.adapter.base.BaseItemDraggableAdapter.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (MotionEventCompat.getActionMasked(motionEvent) == 0) {
                        BaseItemDraggableAdapter baseItemDraggableAdapter = BaseItemDraggableAdapter.this;
                        if (!baseItemDraggableAdapter.mDragOnLongPress) {
                            ItemTouchHelper itemTouchHelper = baseItemDraggableAdapter.mItemTouchHelper;
                            if (itemTouchHelper != null && baseItemDraggableAdapter.itemDragEnabled) {
                                itemTouchHelper.startDrag((RecyclerView.ViewHolder) view.getTag(R$id.BaseQuickAdapter_viewholder_support));
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
            };
            this.mOnToggleViewLongClickListener = null;
        }
    }

    public void setToggleViewId(int i11) {
        this.mToggleViewId = i11;
    }

    public int getViewHolderPosition(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getAdapterPosition() - getHeaderLayoutCount();
    }

    public void onItemDragMoving(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int viewHolderPosition = getViewHolderPosition(viewHolder);
        int viewHolderPosition2 = getViewHolderPosition(viewHolder2);
        if (inRange(viewHolderPosition) && inRange(viewHolderPosition2)) {
            if (viewHolderPosition < viewHolderPosition2) {
                int i11 = viewHolderPosition;
                while (i11 < viewHolderPosition2) {
                    int i12 = i11 + 1;
                    Collections.swap(this.mData, i11, i12);
                    i11 = i12;
                }
            } else {
                for (int i13 = viewHolderPosition; i13 > viewHolderPosition2; i13--) {
                    Collections.swap(this.mData, i13, i13 - 1);
                }
            }
            notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        }
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null && this.itemDragEnabled) {
            onItemDragListener.onItemDragMoving(viewHolder, viewHolderPosition, viewHolder2, viewHolderPosition2);
        }
    }

    public void onItemSwiped(RecyclerView.ViewHolder viewHolder) {
        int viewHolderPosition = getViewHolderPosition(viewHolder);
        if (inRange(viewHolderPosition)) {
            this.mData.remove(viewHolderPosition);
            notifyItemRemoved(viewHolder.getAdapterPosition());
        }
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener != null && this.itemSwipeEnabled) {
            onItemSwipeListener.onItemSwiped(viewHolder, getViewHolderPosition(viewHolder));
        }
    }

    public BaseItemDraggableAdapter(int i11, List<T> list) {
        super(i11, list);
        this.mToggleViewId = 0;
        this.itemDragEnabled = false;
        this.itemSwipeEnabled = false;
        this.mDragOnLongPress = true;
    }
}
