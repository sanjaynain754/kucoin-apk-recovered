.class public final Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter;
.super Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;
.source "DefaultLeadingLoadStateAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter<",
        "Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter;",
        "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;",
        "Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;",
        "()V",
        "getStateViewType",
        "",
        "loadState",
        "Lcom/chad/library/adapter/base/loadState/LoadState;",
        "onBindViewHolder",
        "",
        "holder",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "LeadingLoadStateVH",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;-><init>()V

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
.end method


# virtual methods
.method public getStateViewType(Lcom/chad/library/adapter/base/loadState/LoadState;)I
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
    sget p1, Lcom/chad/library/R$layout;->brvah_leading_load_more:I

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

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/chad/library/adapter/base/loadState/LoadState;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;

    invoke-virtual {p0, p1, p2}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter;->onBindViewHolder(Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;Lcom/chad/library/adapter/base/loadState/LoadState;)V

    return-void
.end method

.method public onBindViewHolder(Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;Lcom/chad/library/adapter/base/loadState/LoadState;)V
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/chad/library/adapter/base/loadState/LoadState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of p2, p2, Lcom/chad/library/adapter/base/loadState/LoadState$Loading;

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;->getLoadingProgress()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;->getLoadingProgress()Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;Lcom/chad/library/adapter/base/loadState/LoadState;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;Lcom/chad/library/adapter/base/loadState/LoadState;)Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;Lcom/chad/library/adapter/base/loadState/LoadState;)Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/chad/library/adapter/base/loadState/LoadState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p2, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p2, p1, v0, v1, v0}, Lcom/chad/library/adapter/base/loadState/leading/DefaultLeadingLoadStateAdapter$LeadingLoadStateVH;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2
.end method
