.class public final Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$c;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "ChainFavoriteFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;->j4()V
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
        "com/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$initRecyclerView$4",
        "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;",
        "onScrollStateChanged",
        "",
        "recyclerView",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "newState",
        "",
        "QuoteFacadeLib_googleRelease"
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
.field public final synthetic a:Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$c;->a:Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;

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
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2

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
    const/4 p1, 0x1

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    if-eq p2, p1, :cond_0

    .line 14
    const/4 v0, 0x2

    .line 15
    .line 16
    if-eq p2, v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$c;->a:Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;->J3(Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;)Landroid/content/Context;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lxy/a;->a(Landroid/content/Context;)Lxy/d;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/bumptech/glide/h;->y()V

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$c;->a:Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;->J3(Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;)Landroid/content/Context;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lxy/a;->a(Landroid/content/Context;)Lxy/d;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/bumptech/glide/h;->z()V

    .line 45
    .line 46
    :goto_0
    iget-object v0, p0, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$c;->a:Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;

    .line 47
    const/4 v1, 0x0

    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    move p2, p1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move p2, v1

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-static {v0, p2}, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;->Q3(Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;Z)V

    .line 56
    .line 57
    iget-object p2, p0, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$c;->a:Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;

    .line 58
    .line 59
    .line 60
    invoke-static {p2}, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;->L3(Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;)Z

    .line 61
    move-result p2

    .line 62
    .line 63
    if-nez p2, :cond_3

    .line 64
    .line 65
    iget-object p2, p0, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$c;->a:Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;

    .line 66
    .line 67
    .line 68
    invoke-static {p2}, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;->I3(Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;)Z

    .line 69
    move-result p2

    .line 70
    .line 71
    if-eqz p2, :cond_3

    .line 72
    .line 73
    iget-object p2, p0, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$c;->a:Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;

    .line 74
    .line 75
    .line 76
    invoke-static {p2}, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;->H3(Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;)Lcom/kubi/quotefacade/adapter/ChainFavItemListAdapter;

    .line 77
    move-result-object p2

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 81
    .line 82
    iget-object p2, p0, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$c;->a:Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;

    .line 83
    .line 84
    .line 85
    invoke-static {p2, v1}, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;->P3(Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;Z)V

    .line 86
    .line 87
    :cond_3
    iget-object p2, p0, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$c;->a:Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;

    .line 88
    .line 89
    .line 90
    invoke-static {p2}, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;->O3(Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;)Lqe0/b;

    .line 91
    move-result-object p2

    .line 92
    .line 93
    if-eqz p2, :cond_4

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Lqe0/a;->I()Z

    .line 97
    move-result p2

    .line 98
    .line 99
    if-ne p2, p1, :cond_4

    .line 100
    .line 101
    iget-object p1, p0, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$c;->a:Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;->O3(Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;)Lqe0/b;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lqe0/a;->y()V

    .line 111
    :cond_4
    return-void
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
.end method
