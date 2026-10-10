.class Landroidx/paging/TiledPagedList$2;
.super Ljava/lang/Object;
.source "TiledPagedList.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/TiledPagedList;->onPagePlaceholderInserted(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/paging/TiledPagedList;

.field final synthetic val$pageIndex:I


# direct methods
.method public constructor <init>(Landroidx/paging/TiledPagedList;I)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/paging/TiledPagedList$2;->this$0:Landroidx/paging/TiledPagedList;

    .line 3
    .line 4
    iput p2, p0, Landroidx/paging/TiledPagedList$2;->val$pageIndex:I

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public run()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/paging/TiledPagedList$2;->this$0:Landroidx/paging/TiledPagedList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/paging/PagedList;->isDetached()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/paging/TiledPagedList$2;->this$0:Landroidx/paging/TiledPagedList;

    .line 12
    .line 13
    iget-object v1, v0, Landroidx/paging/PagedList;->mConfig:Landroidx/paging/PagedList$Config;

    .line 14
    .line 15
    iget v1, v1, Landroidx/paging/PagedList$Config;->pageSize:I

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/paging/TiledPagedList;->mDataSource:Landroidx/paging/PositionalDataSource;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/paging/DataSource;->isInvalid()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/paging/TiledPagedList$2;->this$0:Landroidx/paging/TiledPagedList;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/paging/PagedList;->detach()V

    .line 29
    return-void

    .line 30
    .line 31
    :cond_1
    iget v0, p0, Landroidx/paging/TiledPagedList$2;->val$pageIndex:I

    .line 32
    .line 33
    mul-int v4, v0, v1

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/paging/TiledPagedList$2;->this$0:Landroidx/paging/TiledPagedList;

    .line 36
    .line 37
    iget-object v0, v0, Landroidx/paging/PagedList;->mStorage:Landroidx/paging/PagedStorage;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroidx/paging/PagedStorage;->size()I

    .line 41
    move-result v0

    .line 42
    sub-int/2addr v0, v4

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 46
    move-result v5

    .line 47
    .line 48
    iget-object v0, p0, Landroidx/paging/TiledPagedList$2;->this$0:Landroidx/paging/TiledPagedList;

    .line 49
    .line 50
    iget-object v2, v0, Landroidx/paging/TiledPagedList;->mDataSource:Landroidx/paging/PositionalDataSource;

    .line 51
    .line 52
    iget-object v6, v0, Landroidx/paging/PagedList;->mMainThreadExecutor:Ljava/util/concurrent/Executor;

    .line 53
    .line 54
    iget-object v7, v0, Landroidx/paging/TiledPagedList;->mReceiver:Landroidx/paging/PageResult$Receiver;

    .line 55
    const/4 v3, 0x3

    .line 56
    .line 57
    .line 58
    invoke-virtual/range {v2 .. v7}, Landroidx/paging/PositionalDataSource;->dispatchLoadRange(IIILjava/util/concurrent/Executor;Landroidx/paging/PageResult$Receiver;)V

    .line 59
    return-void
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
.end method
