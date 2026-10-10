.class public final Lcom/kubi/quotefacade/favorites/all/FavAllFragment$a;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "FavAllFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/favorites/all/FavAllFragment;->I4()V
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
        "com/kubi/quotefacade/favorites/all/FavAllFragment$initRecyclerView$4",
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
.field public final synthetic a:Lcom/kubi/quotefacade/favorites/all/FavAllFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/quotefacade/favorites/all/FavAllFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllFragment$a;->a:Lcom/kubi/quotefacade/favorites/all/FavAllFragment;

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
    .line 10
    iget-object p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllFragment$a;->a:Lcom/kubi/quotefacade/favorites/all/FavAllFragment;

    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    move p2, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move p2, v0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-static {p1, p2}, Lcom/kubi/quotefacade/favorites/all/FavAllFragment;->g4(Lcom/kubi/quotefacade/favorites/all/FavAllFragment;Z)V

    .line 21
    .line 22
    iget-object p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllFragment$a;->a:Lcom/kubi/quotefacade/favorites/all/FavAllFragment;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lcom/kubi/quotefacade/favorites/all/FavAllFragment;->a4(Lcom/kubi/quotefacade/favorites/all/FavAllFragment;)Z

    .line 26
    move-result p1

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllFragment$a;->a:Lcom/kubi/quotefacade/favorites/all/FavAllFragment;

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lcom/kubi/quotefacade/favorites/all/FavAllFragment;->U3(Lcom/kubi/quotefacade/favorites/all/FavAllFragment;)Z

    .line 34
    move-result p1

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllFragment$a;->a:Lcom/kubi/quotefacade/favorites/all/FavAllFragment;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lcom/kubi/quotefacade/favorites/all/FavAllFragment;->T3(Lcom/kubi/quotefacade/favorites/all/FavAllFragment;)Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 46
    .line 47
    iget-object p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllFragment$a;->a:Lcom/kubi/quotefacade/favorites/all/FavAllFragment;

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v0}, Lcom/kubi/quotefacade/favorites/all/FavAllFragment;->e4(Lcom/kubi/quotefacade/favorites/all/FavAllFragment;Z)V

    .line 51
    .line 52
    :cond_1
    iget-object p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllFragment$a;->a:Lcom/kubi/quotefacade/favorites/all/FavAllFragment;

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lcom/kubi/quotefacade/favorites/all/FavAllFragment;->Z3(Lcom/kubi/quotefacade/favorites/all/FavAllFragment;)Lqe0/b;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lqe0/a;->I()Z

    .line 62
    move-result p1

    .line 63
    .line 64
    if-ne p1, v1, :cond_2

    .line 65
    .line 66
    iget-object p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllFragment$a;->a:Lcom/kubi/quotefacade/favorites/all/FavAllFragment;

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lcom/kubi/quotefacade/favorites/all/FavAllFragment;->Z3(Lcom/kubi/quotefacade/favorites/all/FavAllFragment;)Lqe0/b;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lqe0/a;->y()V

    .line 76
    :cond_2
    return-void
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
.end method
