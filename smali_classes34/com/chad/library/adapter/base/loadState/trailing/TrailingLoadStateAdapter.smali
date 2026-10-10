.class public abstract Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
.super Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;
.source "TrailingLoadStateAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VH:",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">",
        "Lcom/chad/library/adapter/base/loadState/LoadStateAdapter<",
        "TVH;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001.B\u000f\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\u0008\u001cJ\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00122\u0008\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0006\u0010#\u001a\u00020\u0018J\u0006\u0010$\u001a\u00020\u0018J\u0008\u0010%\u001a\u00020\u0005H\u0002J\u0008\u0010&\u001a\u00020\u0018H\u0002J\u0015\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00028\u0000H\u0017\u00a2\u0006\u0002\u0010)J\u0016\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0008\u0010+\u001a\u0004\u0018\u00010\rJ\u0008\u0010,\u001a\u00020-H\u0016R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0008R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016\u00a8\u0006/"
    }
    d2 = {
        "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;",
        "VH",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;",
        "isLoadEndDisplay",
        "",
        "(Z)V",
        "isAutoLoadMore",
        "()Z",
        "setAutoLoadMore",
        "mDelayNextLoadFlag",
        "mNotFullPageNextLoadFlag",
        "<set-?>",
        "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;",
        "onTrailingListener",
        "getOnTrailingListener",
        "()Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;",
        "preloadSize",
        "",
        "getPreloadSize",
        "()I",
        "setPreloadSize",
        "(I)V",
        "checkDisableLoadMoreIfNotFullPage",
        "",
        "checkPreload",
        "itemCount",
        "currentPosition",
        "checkPreload$com_github_CymChad_brvah",
        "displayLoadStateAsItem",
        "loadState",
        "Lcom/chad/library/adapter/base/loadState/LoadState;",
        "getTheBiggestNumber",
        "numbers",
        "",
        "invokeFailRetry",
        "invokeLoadMore",
        "isFullScreen",
        "loadAction",
        "onViewAttachedToWindow",
        "holder",
        "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V",
        "setOnLoadMoreListener",
        "listener",
        "toString",
        "",
        "OnTrailingListener",
        "com.github.CymChad.brvah"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private isAutoLoadMore:Z

.field private final isLoadEndDisplay:Z

.field private mDelayNextLoadFlag:Z

.field private mNotFullPageNextLoadFlag:Z

.field private onTrailingListener:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private preloadSize:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;-><init>()V

    .line 4
    iput-boolean p1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->isLoadEndDisplay:Z

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->isAutoLoadMore:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;-><init>(Z)V

    return-void
.end method

.method private static final checkDisableLoadMoreIfNotFullPage$lambda$1(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->isFullScreen()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->mNotFullPageNextLoadFlag:Z

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
.end method

.method private static final checkDisableLoadMoreIfNotFullPage$lambda$2(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "$manager"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "this$0"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v0, "$recyclerView"

    .line 14
    .line 15
    .line 16
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    check-cast p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    .line 22
    move-result v0

    .line 23
    .line 24
    new-array v0, v0, [I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findLastCompletelyVisibleItemPositions([I)[I

    .line 28
    .line 29
    .line 30
    invoke-direct {p1, v0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->getTheBiggestNumber([I)I

    .line 31
    move-result p0

    .line 32
    .line 33
    add-int/lit8 p0, p0, 0x1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 37
    move-result-object p2

    .line 38
    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    .line 43
    move-result p2

    .line 44
    .line 45
    if-ne p0, p2, :cond_0

    .line 46
    return-void

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    .line 49
    iput-boolean p0, p1, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->mNotFullPageNextLoadFlag:Z

    .line 50
    return-void
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

.method public static synthetic g(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->checkDisableLoadMoreIfNotFullPage$lambda$1(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V

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
.end method

.method private final getTheBiggestNumber([I)I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    array-length v1, p1

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    return v0

    .line 8
    :cond_0
    array-length v1, p1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    :goto_0
    if-ge v2, v1, :cond_2

    .line 12
    .line 13
    aget v3, p1, v2

    .line 14
    .line 15
    if-le v3, v0, :cond_1

    .line 16
    move v0, v3

    .line 17
    .line 18
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    return v0
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic h(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->checkDisableLoadMoreIfNotFullPage$lambda$2(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/RecyclerView;)V

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

.method public static synthetic i(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->loadAction$lambda$0(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V

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
.end method

.method private final isFullScreen()Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    goto :goto_1

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 25
    move-result-object v2

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v2, v3

    .line 28
    .line 29
    :goto_0
    instance-of v4, v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    move-object v3, v2

    .line 33
    .line 34
    check-cast v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 35
    .line 36
    :cond_2
    if-nez v3, :cond_3

    .line 37
    return v1

    .line 38
    .line 39
    .line 40
    :cond_3
    invoke-virtual {v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    .line 41
    move-result v2

    .line 42
    add-int/2addr v2, v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    .line 46
    move-result v0

    .line 47
    .line 48
    if-ne v2, v0, :cond_5

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    .line 52
    move-result v0

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    goto :goto_1

    .line 56
    :cond_4
    const/4 v0, 0x0

    .line 57
    return v0

    .line 58
    :cond_5
    :goto_1
    return v1
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
.end method

.method private final loadAction()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->isAutoLoadMore:Z

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->onTrailingListener:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;->isAllowLoading()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->mNotFullPageNextLoadFlag:Z

    .line 18
    .line 19
    if-nez v0, :cond_4

    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->mDelayNextLoadFlag:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    goto :goto_0

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getLoadState()Lcom/chad/library/adapter/base/loadState/LoadState;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    instance-of v0, v0, Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getLoadState()Lcom/chad/library/adapter/base/loadState/LoadState;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/loadState/LoadState;->getEndOfPaginationReached()Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->isComputingLayout()Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    const/4 v1, 0x1

    .line 57
    .line 58
    iput-boolean v1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->mDelayNextLoadFlag:Z

    .line 59
    .line 60
    new-instance v1, Ls2/c;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, p0}, Ls2/c;-><init>(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 67
    return-void

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->invokeLoadMore()V

    .line 71
    :cond_4
    :goto_0
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method private static final loadAction$lambda$0(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->mDelayNextLoadFlag:Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->invokeLoadMore()V

    .line 13
    return-void
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
.method public final checkDisableLoadMoreIfNotFullPage()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->mNotFullPageNextLoadFlag:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_1
    instance-of v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 20
    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    new-instance v1, Ls2/d;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, p0}, Ls2/d;-><init>(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 30
    return-void

    .line 31
    .line 32
    :cond_2
    instance-of v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 33
    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    new-instance v2, Ls2/e;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, v1, p0, v0}, Ls2/e;-><init>(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 43
    :cond_3
    :goto_0
    return-void
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
.end method

.method public final checkPreload$com_github_CymChad_brvah(II)V
    .locals 1

    .line 1
    .line 2
    add-int/lit8 v0, p1, -0x1

    .line 3
    .line 4
    if-le p2, v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sub-int/2addr p1, p2

    .line 7
    .line 8
    add-int/lit8 p1, p1, -0x1

    .line 9
    .line 10
    iget p2, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->preloadSize:I

    .line 11
    .line 12
    if-gt p1, p2, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->loadAction()V

    .line 16
    :cond_1
    :goto_0
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
    .line 40
    .line 41
    .line 42
.end method

.method public displayLoadStateAsItem(Lcom/chad/library/adapter/base/loadState/LoadState;)Z
    .locals 2
    .param p1    # Lcom/chad/library/adapter/base/loadState/LoadState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "loadState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->displayLoadStateAsItem(Lcom/chad/library/adapter/base/loadState/LoadState;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    instance-of v0, p1, Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/LoadState;->getEndOfPaginationReached()Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    :cond_0
    iget-boolean v1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->isLoadEndDisplay:Z

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/LoadState;->getEndOfPaginationReached()Z

    .line 31
    move-result p1

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    return p1

    .line 37
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 38
    return p1
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
.end method

.method public final getOnTrailingListener()Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->onTrailingListener:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;

    .line 3
    return-object v0
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
.end method

.method public final getPreloadSize()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->preloadSize:I

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
.end method

.method public final invokeFailRetry()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/chad/library/adapter/base/loadState/LoadState$Loading;->INSTANCE:Lcom/chad/library/adapter/base/loadState/LoadState$Loading;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->setLoadState(Lcom/chad/library/adapter/base/loadState/LoadState;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->onTrailingListener:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;->onFailRetry()V

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final invokeLoadMore()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/chad/library/adapter/base/loadState/LoadState$Loading;->INSTANCE:Lcom/chad/library/adapter/base/loadState/LoadState$Loading;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->setLoadState(Lcom/chad/library/adapter/base/loadState/LoadState;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->onTrailingListener:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;->onLoad()V

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final isAutoLoadMore()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->isAutoLoadMore:Z

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
.end method

.method public final isLoadEndDisplay()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->isLoadEndDisplay:Z

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
.end method

.method public onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "holder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->loadAction()V

    .line 9
    return-void
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

.method public final setAutoLoadMore(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->isAutoLoadMore:Z

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
.end method

.method public final setOnLoadMoreListener(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;)Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;",
            ")",
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
            "TVH;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->onTrailingListener:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;

    .line 3
    return-object p0
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
.end method

.method public final setPreloadSize(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->preloadSize:I

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
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "\n            TrailingLoadStateAdapter ->\n            [isLoadEndDisplay: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-boolean v1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->isLoadEndDisplay:Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "],\n            [isAutoLoadMore: "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget-boolean v1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->isAutoLoadMore:Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "],\n            [preloadSize: "

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget v1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->preloadSize:I

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "],\n            [loadState: "

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getLoadState()Lcom/chad/library/adapter/base/loadState/LoadState;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v1, "]\n        "

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object v0

    .line 61
    return-object v0
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
