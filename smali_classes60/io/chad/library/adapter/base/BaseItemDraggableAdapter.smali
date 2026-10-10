.class public abstract Lio/chad/library/adapter/base/BaseItemDraggableAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "BaseItemDraggableAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "K:",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">",
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "TT;TK;>;"
    }
.end annotation


# static fields
.field private static final ERROR_NOT_SAME_ITEMTOUCHHELPER:Ljava/lang/String; = "Item drag and item swipe should pass the same ItemTouchHelper"

.field private static final NO_TOGGLE_VIEW:I


# instance fields
.field protected itemDragEnabled:Z

.field protected itemSwipeEnabled:Z

.field protected mDragOnLongPress:Z

.field protected mItemTouchHelper:Landroidx/recyclerview/widget/ItemTouchHelper;

.field protected mOnItemDragListener:Lio/chad/library/adapter/base/listener/OnItemDragListener;

.field protected mOnItemSwipeListener:Lio/chad/library/adapter/base/listener/OnItemSwipeListener;

.field protected mOnToggleViewLongClickListener:Landroid/view/View$OnLongClickListener;

.field protected mOnToggleViewTouchListener:Landroid/view/View$OnTouchListener;

.field protected mToggleViewId:I


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mToggleViewId:I

    .line 8
    iput-boolean p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemDragEnabled:Z

    .line 9
    iput-boolean p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemSwipeEnabled:Z

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mDragOnLongPress:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(Ljava/util/List;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mToggleViewId:I

    .line 3
    iput-boolean p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemDragEnabled:Z

    .line 4
    iput-boolean p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemSwipeEnabled:Z

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mDragOnLongPress:Z

    return-void
.end method

.method private inRange(I)Z
    .locals 1

    .line 1
    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mData:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-ge p1, v0, :cond_0

    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method


# virtual methods
.method public disableDragItem()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemDragEnabled:Z

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mItemTouchHelper:Landroidx/recyclerview/widget/ItemTouchHelper;

    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public disableSwipeItem()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemSwipeEnabled:Z

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public enableDragItem(Landroidx/recyclerview/widget/ItemTouchHelper;)V
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/ItemTouchHelper;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->enableDragItem(Landroidx/recyclerview/widget/ItemTouchHelper;IZ)V

    return-void
.end method

.method public enableDragItem(Landroidx/recyclerview/widget/ItemTouchHelper;IZ)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/ItemTouchHelper;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemDragEnabled:Z

    .line 3
    iput-object p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mItemTouchHelper:Landroidx/recyclerview/widget/ItemTouchHelper;

    .line 4
    invoke-virtual {p0, p2}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->setToggleViewId(I)V

    .line 5
    invoke-virtual {p0, p3}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->setToggleDragOnLongPress(Z)V

    return-void
.end method

.method public enableSwipeItem()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemSwipeEnabled:Z

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public getViewHolderPosition(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 4
    move-result p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 8
    move-result v0

    .line 9
    sub-int/2addr p1, v0

    .line 10
    return p1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public isItemDraggable()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemDragEnabled:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public isItemSwipeEnable()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemSwipeEnabled:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/chad/library/adapter/base/BaseViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->onBindViewHolder(Lio/chad/library/adapter/base/BaseViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lio/chad/library/adapter/base/BaseViewHolder;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I)V"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1, p2}, Lio/chad/library/adapter/base/BaseQuickAdapter;->onBindViewHolder(Lio/chad/library/adapter/base/BaseViewHolder;I)V

    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result p2

    .line 4
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mItemTouchHelper:Landroidx/recyclerview/widget/ItemTouchHelper;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemDragEnabled:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x222

    if-eq p2, v0, :cond_2

    const/16 v0, 0x111

    if-eq p2, v0, :cond_2

    const/16 v0, 0x555

    if-eq p2, v0, :cond_2

    const/16 v0, 0x333

    if-eq p2, v0, :cond_2

    .line 5
    iget p2, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mToggleViewId:I

    if-eqz p2, :cond_1

    .line 6
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 7
    sget v0, Lio/chad/library/R$id;->BaseQuickAdapter_viewholder_support:I

    invoke-virtual {p2, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 8
    iget-boolean p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mDragOnLongPress:Z

    if-eqz p1, :cond_0

    .line 9
    iget-object p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnToggleViewLongClickListener:Landroid/view/View$OnLongClickListener;

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnToggleViewTouchListener:Landroid/view/View$OnTouchListener;

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void

    .line 11
    :cond_1
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    sget v0, Lio/chad/library/R$id;->BaseQuickAdapter_viewholder_support:I

    invoke-virtual {p2, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 12
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object p2, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnToggleViewLongClickListener:Landroid/view/View$OnLongClickListener;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_2
    return-void
.end method

.method public onItemDragEnd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnItemDragListener:Lio/chad/library/adapter/base/listener/OnItemDragListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemDragEnabled:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->getViewHolderPosition(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, Lio/chad/library/adapter/base/listener/OnItemDragListener;->onItemDragEnd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public onItemDragMoving(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->getViewHolderPosition(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->getViewHolderPosition(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->inRange(I)Z

    .line 12
    move-result v2

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->inRange(I)Z

    .line 18
    move-result v2

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    if-ge v0, v1, :cond_0

    .line 23
    move v2, v0

    .line 24
    .line 25
    :goto_0
    if-ge v2, v1, :cond_1

    .line 26
    .line 27
    iget-object v3, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mData:Ljava/util/List;

    .line 28
    .line 29
    add-int/lit8 v4, v2, 0x1

    .line 30
    .line 31
    .line 32
    invoke-static {v3, v2, v4}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 33
    move v2, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v2, v0

    .line 36
    .line 37
    :goto_1
    if-le v2, v1, :cond_1

    .line 38
    .line 39
    iget-object v3, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mData:Ljava/util/List;

    .line 40
    .line 41
    add-int/lit8 v4, v2, -0x1

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v2, v4}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 45
    .line 46
    add-int/lit8 v2, v2, -0x1

    .line 47
    goto :goto_1

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 51
    move-result v2

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 55
    move-result v3

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemMoved(II)V

    .line 59
    .line 60
    :cond_2
    iget-object v2, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnItemDragListener:Lio/chad/library/adapter/base/listener/OnItemDragListener;

    .line 61
    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    iget-boolean v3, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemDragEnabled:Z

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-interface {v2, p1, v0, p2, v1}, Lio/chad/library/adapter/base/listener/OnItemDragListener;->onItemDragMoving(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 70
    :cond_3
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public onItemDragStart(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnItemDragListener:Lio/chad/library/adapter/base/listener/OnItemDragListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemDragEnabled:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->getViewHolderPosition(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, Lio/chad/library/adapter/base/listener/OnItemDragListener;->onItemDragStart(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public onItemSwipeClear(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnItemSwipeListener:Lio/chad/library/adapter/base/listener/OnItemSwipeListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemSwipeEnabled:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->getViewHolderPosition(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, Lio/chad/library/adapter/base/listener/OnItemSwipeListener;->clearView(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public onItemSwipeStart(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnItemSwipeListener:Lio/chad/library/adapter/base/listener/OnItemSwipeListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemSwipeEnabled:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->getViewHolderPosition(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, Lio/chad/library/adapter/base/listener/OnItemSwipeListener;->onItemSwipeStart(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public onItemSwiped(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->getViewHolderPosition(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->inRange(I)Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mData:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 19
    move-result v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnItemSwipeListener:Lio/chad/library/adapter/base/listener/OnItemSwipeListener;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-boolean v1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemSwipeEnabled:Z

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->getViewHolderPosition(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I

    .line 34
    move-result v1

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, p1, v1}, Lio/chad/library/adapter/base/listener/OnItemSwipeListener;->onItemSwiped(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 38
    :cond_1
    return-void
    .line 39
.end method

.method public onItemSwiping(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;FFZ)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnItemSwipeListener:Lio/chad/library/adapter/base/listener/OnItemSwipeListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->itemSwipeEnabled:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    move-object v1, p1

    .line 10
    move-object v2, p2

    .line 11
    move v3, p3

    .line 12
    move v4, p4

    .line 13
    move v5, p5

    .line 14
    .line 15
    .line 16
    invoke-interface/range {v0 .. v5}, Lio/chad/library/adapter/base/listener/OnItemSwipeListener;->onItemSwipeMoving(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;FFZ)V

    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public setOnItemDragListener(Lio/chad/library/adapter/base/listener/OnItemDragListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnItemDragListener:Lio/chad/library/adapter/base/listener/OnItemDragListener;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public setOnItemSwipeListener(Lio/chad/library/adapter/base/listener/OnItemSwipeListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnItemSwipeListener:Lio/chad/library/adapter/base/listener/OnItemSwipeListener;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public setToggleDragOnLongPress(Z)V
    .locals 1

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mDragOnLongPress:Z

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iput-object v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnToggleViewTouchListener:Landroid/view/View$OnTouchListener;

    .line 8
    .line 9
    new-instance p1, Lio/chad/library/adapter/base/BaseItemDraggableAdapter$1;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, p0}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter$1;-><init>(Lio/chad/library/adapter/base/BaseItemDraggableAdapter;)V

    .line 13
    .line 14
    iput-object p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnToggleViewLongClickListener:Landroid/view/View$OnLongClickListener;

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    new-instance p1, Lio/chad/library/adapter/base/BaseItemDraggableAdapter$2;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p0}, Lio/chad/library/adapter/base/BaseItemDraggableAdapter$2;-><init>(Lio/chad/library/adapter/base/BaseItemDraggableAdapter;)V

    .line 21
    .line 22
    iput-object p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnToggleViewTouchListener:Landroid/view/View$OnTouchListener;

    .line 23
    .line 24
    iput-object v0, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mOnToggleViewLongClickListener:Landroid/view/View$OnLongClickListener;

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public setToggleViewId(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/chad/library/adapter/base/BaseItemDraggableAdapter;->mToggleViewId:I

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method
