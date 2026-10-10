.class public final Lcom/kubi/assets/overview/coin/AssetCoinFragment$a;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "AssetCoinFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/overview/coin/AssetCoinFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/kubi/assets/overview/coin/AssetCoinFragment$initView$1",
        "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;",
        "onScrollStateChanged",
        "",
        "recyclerView",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "newState",
        "",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/assets/overview/coin/AssetCoinFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/assets/overview/coin/AssetCoinFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/overview/coin/AssetCoinFragment$a;->a:Lcom/kubi/assets/overview/coin/AssetCoinFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

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
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "recyclerView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 9
    .line 10
    iget-object p1, p0, Lcom/kubi/assets/overview/coin/AssetCoinFragment$a;->a:Lcom/kubi/assets/overview/coin/AssetCoinFragment;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    const/4 p2, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-static {p1, p2}, Lcom/kubi/assets/overview/coin/AssetCoinFragment;->w3(Lcom/kubi/assets/overview/coin/AssetCoinFragment;Z)V

    .line 19
    .line 20
    iget-object p1, p0, Lcom/kubi/assets/overview/coin/AssetCoinFragment$a;->a:Lcom/kubi/assets/overview/coin/AssetCoinFragment;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/kubi/assets/overview/coin/AssetCoinFragment;->t3(Lcom/kubi/assets/overview/coin/AssetCoinFragment;)Z

    .line 24
    move-result p1

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lcom/kubi/assets/overview/coin/AssetCoinFragment$a;->a:Lcom/kubi/assets/overview/coin/AssetCoinFragment;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/kubi/sdk/BaseFragment;->isShowing()Z

    .line 32
    move-result p1

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lcom/kubi/assets/overview/coin/AssetCoinFragment$a;->a:Lcom/kubi/assets/overview/coin/AssetCoinFragment;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lcom/kubi/assets/overview/coin/AssetCoinFragment;->r3(Lcom/kubi/assets/overview/coin/AssetCoinFragment;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 44
    move-result p1

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    iget-object p1, p0, Lcom/kubi/assets/overview/coin/AssetCoinFragment$a;->a:Lcom/kubi/assets/overview/coin/AssetCoinFragment;

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lcom/kubi/assets/overview/coin/AssetCoinFragment;->y3(Lcom/kubi/assets/overview/coin/AssetCoinFragment;)V

    .line 52
    :cond_1
    return-void
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
.end method
