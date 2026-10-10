.class public final Lcom/kubi/quotefacade/rank/list/RankListFragment$b;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "RankListFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/rank/list/RankListFragment;->y4()V
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
        "com/kubi/quotefacade/rank/list/RankListFragment$initRecycleViewAdapter$1$2",
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
.field public final synthetic a:Lcom/kubi/quotefacade/rank/list/RankListFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/quotefacade/rank/list/RankListFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/quotefacade/rank/list/RankListFragment$b;->a:Lcom/kubi/quotefacade/rank/list/RankListFragment;

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
    .locals 4

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
    iget-object v0, p0, Lcom/kubi/quotefacade/rank/list/RankListFragment$b;->a:Lcom/kubi/quotefacade/rank/list/RankListFragment;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    const-string v2, "onScrollStateChanged="

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    iget-object v0, p0, Lcom/kubi/quotefacade/rank/list/RankListFragment$b;->a:Lcom/kubi/quotefacade/rank/list/RankListFragment;

    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v2, 0x1

    .line 39
    .line 40
    if-eqz p2, :cond_0

    .line 41
    move v3, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v3, v1

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-static {v0, v3}, Lcom/kubi/quotefacade/rank/list/RankListFragment;->f4(Lcom/kubi/quotefacade/rank/list/RankListFragment;Z)V

    .line 47
    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    if-eq p2, v2, :cond_1

    .line 51
    const/4 v0, 0x2

    .line 52
    .line 53
    if-eq p2, v0, :cond_1

    .line 54
    goto :goto_1

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lxy/a;->a(Landroid/content/Context;)Lxy/d;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/bumptech/glide/h;->y()V

    .line 66
    goto :goto_1

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Lxy/a;->a(Landroid/content/Context;)Lxy/d;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/bumptech/glide/h;->z()V

    .line 78
    .line 79
    :goto_1
    iget-object p1, p0, Lcom/kubi/quotefacade/rank/list/RankListFragment$b;->a:Lcom/kubi/quotefacade/rank/list/RankListFragment;

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lcom/kubi/quotefacade/rank/list/RankListFragment;->b4(Lcom/kubi/quotefacade/rank/list/RankListFragment;)Z

    .line 83
    move-result p1

    .line 84
    .line 85
    if-nez p1, :cond_3

    .line 86
    .line 87
    iget-object p1, p0, Lcom/kubi/quotefacade/rank/list/RankListFragment$b;->a:Lcom/kubi/quotefacade/rank/list/RankListFragment;

    .line 88
    .line 89
    .line 90
    invoke-static {p1}, Lcom/kubi/quotefacade/rank/list/RankListFragment;->V3(Lcom/kubi/quotefacade/rank/list/RankListFragment;)Z

    .line 91
    move-result p1

    .line 92
    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    iget-object p1, p0, Lcom/kubi/quotefacade/rank/list/RankListFragment$b;->a:Lcom/kubi/quotefacade/rank/list/RankListFragment;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    const-string p2, "onScrollStateChanged not scrolling and notifyDataSetChanged"

    .line 102
    .line 103
    .line 104
    invoke-static {p1, p2}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    iget-object p1, p0, Lcom/kubi/quotefacade/rank/list/RankListFragment$b;->a:Lcom/kubi/quotefacade/rank/list/RankListFragment;

    .line 107
    .line 108
    .line 109
    invoke-static {p1}, Lcom/kubi/quotefacade/rank/list/RankListFragment;->T3(Lcom/kubi/quotefacade/rank/list/RankListFragment;)Lcom/kubi/quotefacade/rank/list/RankListAdapter;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 114
    .line 115
    iget-object p1, p0, Lcom/kubi/quotefacade/rank/list/RankListFragment$b;->a:Lcom/kubi/quotefacade/rank/list/RankListFragment;

    .line 116
    .line 117
    .line 118
    invoke-static {p1, v1}, Lcom/kubi/quotefacade/rank/list/RankListFragment;->d4(Lcom/kubi/quotefacade/rank/list/RankListFragment;Z)V

    .line 119
    :cond_3
    return-void
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
