.class public abstract Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
.super Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;
.source "LeadingLoadStateAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;
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
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0000\u00a2\u0006\u0002\u0008\u0019J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u0017J\u0008\u0010\u001e\u001a\u00020\u0017H\u0002J\u0015\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00028\u0000H\u0017\u00a2\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0008\u0010#\u001a\u0004\u0018\u00010\u000cJ\u0008\u0010$\u001a\u00020%H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;",
        "VH",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;",
        "()V",
        "isLoadEnable",
        "",
        "()Z",
        "setLoadEnable",
        "(Z)V",
        "mDelayNextLoadFlag",
        "<set-?>",
        "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;",
        "onLeadingListener",
        "getOnLeadingListener",
        "()Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;",
        "preloadSize",
        "",
        "getPreloadSize",
        "()I",
        "setPreloadSize",
        "(I)V",
        "checkPreload",
        "",
        "currentPosition",
        "checkPreload$com_github_CymChad_brvah",
        "displayLoadStateAsItem",
        "loadState",
        "Lcom/chad/library/adapter/base/loadState/LoadState;",
        "invokeLoad",
        "loadAction",
        "onViewAttachedToWindow",
        "holder",
        "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V",
        "setOnLeadingListener",
        "listener",
        "toString",
        "",
        "OnLeadingListener",
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
.field private isLoadEnable:Z

.field private mDelayNextLoadFlag:Z

.field private onLeadingListener:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private preloadSize:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->isLoadEnable:Z

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
.end method

.method public static synthetic g(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->loadAction$lambda$0(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)V

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

.method private final loadAction()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->isLoadEnable:Z

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->onLeadingListener:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;->isAllowLoading()Z

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
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->mDelayNextLoadFlag:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    goto :goto_0

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getLoadState()Lcom/chad/library/adapter/base/loadState/LoadState;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    instance-of v0, v0, Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;

    .line 27
    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getLoadState()Lcom/chad/library/adapter/base/loadState/LoadState;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/loadState/LoadState;->getEndOfPaginationReached()Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    goto :goto_0

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->isComputingLayout()Z

    .line 49
    move-result v1

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    const/4 v1, 0x1

    .line 53
    .line 54
    iput-boolean v1, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->mDelayNextLoadFlag:Z

    .line 55
    .line 56
    new-instance v1, Lr2/a;

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, p0}, Lr2/a;-><init>(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 63
    return-void

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->invokeLoad()V

    .line 67
    :cond_4
    :goto_0
    return-void
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

.method private static final loadAction$lambda$0(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)V
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
    iput-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->mDelayNextLoadFlag:Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->invokeLoad()V

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
.method public final checkPreload$com_github_CymChad_brvah(I)V
    .locals 1

    .line 1
    .line 2
    if-gez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    :cond_0
    iget v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->preloadSize:I

    .line 6
    .line 7
    if-gt p1, v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->loadAction()V

    .line 11
    :cond_1
    :goto_0
    return-void
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

.method public displayLoadStateAsItem(Lcom/chad/library/adapter/base/loadState/LoadState;)Z
    .locals 1
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
    instance-of p1, p1, Lcom/chad/library/adapter/base/loadState/LoadState$Loading;

    .line 8
    return p1
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

.method public final getOnLeadingListener()Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->onLeadingListener:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;

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
    iget v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->preloadSize:I

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

.method public final invokeLoad()V
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
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->onLeadingListener:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;->onLoad()V

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final isLoadEnable()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->isLoadEnable:Z

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
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->loadAction()V

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

.method public final setLoadEnable(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->isLoadEnable:Z

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

.method public final setOnLeadingListener(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;)Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;",
            ")",
            "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
            "TVH;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->onLeadingListener:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;

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
    iput p1, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->preloadSize:I

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
    const-string v1, "\n            LeadingLoadStateAdapter ->\n            [isLoadEnable: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-boolean v1, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->isLoadEnable:Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "],\n            [preloadSize: "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget v1, p0, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->preloadSize:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "],\n            [loadState: "

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getLoadState()Lcom/chad/library/adapter/base/loadState/LoadState;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "]\n        "

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v0

    .line 51
    return-object v0
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
