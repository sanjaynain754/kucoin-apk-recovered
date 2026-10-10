.class Landroidx/recyclerview/widget/NestedAdapterWrapper$1;
.super Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;
.source "NestedAdapterWrapper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/NestedAdapterWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/NestedAdapterWrapper;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;-><init>()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public onChanged()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    .line 3
    .line 4
    iget-object v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->adapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    .line 8
    move-result v1

    .line 9
    .line 10
    iput v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCachedItemCount:I

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    .line 13
    .line 14
    iget-object v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCallback:Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v0}, Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;->onChanged(Landroidx/recyclerview/widget/NestedAdapterWrapper;)V

    .line 18
    return-void
.end method

.method public onItemRangeChanged(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    iget-object v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCallback:Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;

    const/4 v2, 0x0

    invoke-interface {v1, v0, p1, p2, v2}, Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;->onItemRangeChanged(Landroidx/recyclerview/widget/NestedAdapterWrapper;IILjava/lang/Object;)V

    return-void
.end method

.method public onItemRangeChanged(IILjava/lang/Object;)V
    .locals 2
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    iget-object v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCallback:Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;

    invoke-interface {v1, v0, p1, p2, p3}, Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;->onItemRangeChanged(Landroidx/recyclerview/widget/NestedAdapterWrapper;IILjava/lang/Object;)V

    return-void
.end method

.method public onItemRangeInserted(II)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    .line 3
    .line 4
    iget v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCachedItemCount:I

    .line 5
    add-int/2addr v1, p2

    .line 6
    .line 7
    iput v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCachedItemCount:I

    .line 8
    .line 9
    iget-object v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCallback:Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;

    .line 10
    .line 11
    .line 12
    invoke-interface {v1, v0, p1, p2}, Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;->onItemRangeInserted(Landroidx/recyclerview/widget/NestedAdapterWrapper;II)V

    .line 13
    .line 14
    iget-object p1, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    .line 15
    .line 16
    iget p2, p1, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCachedItemCount:I

    .line 17
    .line 18
    if-lez p2, :cond_0

    .line 19
    .line 20
    iget-object p1, p1, Landroidx/recyclerview/widget/NestedAdapterWrapper;->adapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getStateRestorationPolicy()Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    sget-object p2, Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;->PREVENT_WHEN_EMPTY:Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;

    .line 27
    .line 28
    if-ne p1, p2, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    .line 31
    .line 32
    iget-object p2, p1, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCallback:Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;

    .line 33
    .line 34
    .line 35
    invoke-interface {p2, p1}, Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;->onStateRestorationPolicyChanged(Landroidx/recyclerview/widget/NestedAdapterWrapper;)V

    .line 36
    :cond_0
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public onItemRangeMoved(III)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p3, v0, :cond_0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    .line 7
    :goto_0
    const-string p3, "moving more than 1 item is not supported in RecyclerView"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p3}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 11
    .line 12
    iget-object p3, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    .line 13
    .line 14
    iget-object v0, p3, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCallback:Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p3, p1, p2}, Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;->onItemRangeMoved(Landroidx/recyclerview/widget/NestedAdapterWrapper;II)V

    .line 18
    return-void
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
.end method

.method public onItemRangeRemoved(II)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    .line 3
    .line 4
    iget v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCachedItemCount:I

    .line 5
    sub-int/2addr v1, p2

    .line 6
    .line 7
    iput v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCachedItemCount:I

    .line 8
    .line 9
    iget-object v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCallback:Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;

    .line 10
    .line 11
    .line 12
    invoke-interface {v1, v0, p1, p2}, Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;->onItemRangeRemoved(Landroidx/recyclerview/widget/NestedAdapterWrapper;II)V

    .line 13
    .line 14
    iget-object p1, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    .line 15
    .line 16
    iget p2, p1, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCachedItemCount:I

    .line 17
    const/4 v0, 0x1

    .line 18
    .line 19
    if-ge p2, v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p1, Landroidx/recyclerview/widget/NestedAdapterWrapper;->adapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getStateRestorationPolicy()Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    sget-object p2, Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;->PREVENT_WHEN_EMPTY:Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;

    .line 28
    .line 29
    if-ne p1, p2, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    .line 32
    .line 33
    iget-object p2, p1, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCallback:Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;

    .line 34
    .line 35
    .line 36
    invoke-interface {p2, p1}, Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;->onStateRestorationPolicyChanged(Landroidx/recyclerview/widget/NestedAdapterWrapper;)V

    .line 37
    :cond_0
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public onStateRestorationPolicyChanged()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/NestedAdapterWrapper$1;->this$0:Landroidx/recyclerview/widget/NestedAdapterWrapper;

    .line 3
    .line 4
    iget-object v1, v0, Landroidx/recyclerview/widget/NestedAdapterWrapper;->mCallback:Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1, v0}, Landroidx/recyclerview/widget/NestedAdapterWrapper$Callback;->onStateRestorationPolicyChanged(Landroidx/recyclerview/widget/NestedAdapterWrapper;)V

    .line 8
    return-void
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
.end method
