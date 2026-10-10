.class public final Lyu/x;
.super Lyu/b0;
.source "FavListItemView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/quotefacade/adapter/HomeRankFavListItemView;",
        "Lcom/kubi/quotefacade/adapter/NormalFavListItemView;",
        "<init>",
        "()V",
        "bindItemView",
        "",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "Lcom/kubi/data/entity/TradeItemBean;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lyu/b0;-><init>()V

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
.end method


# virtual methods
.method public a(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V
    .locals 7
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "helper"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "item"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1, p2}, Lyu/b0;->a(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V

    .line 14
    .line 15
    sget p2, Lcom/kubi/quotefacade/R$id;->root_view:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    check-cast p2, Landroid/view/ViewGroup;

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    const-string v2, "getContext(...)"

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    sget v2, Lcom/kubi/quotefacade/R$dimen;->trade_cell_height:I

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lcom/kubi/utils/extensions/core/h;->d(Landroid/content/Context;I)I

    .line 45
    move-result v1

    .line 46
    .line 47
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    .line 52
    :cond_1
    :goto_0
    sget p2, Lcom/kubi/quotefacade/R$id;->tv_trade_pair_box:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    const/16 p2, 0xc

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    .line 63
    invoke-static {p2}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 64
    move-result v1

    .line 65
    .line 66
    const/16 v5, 0xe

    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v2, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v4, 0x0

    .line 71
    .line 72
    .line 73
    invoke-static/range {v0 .. v6}, Lcom/kubi/utils/extensions/core/ViewExtKt;->p(Landroid/view/View;IIIIILjava/lang/Object;)Landroid/view/View;

    .line 74
    .line 75
    :cond_2
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_change_rate:I

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 79
    move-result-object p1

    .line 80
    move-object v0, p1

    .line 81
    .line 82
    check-cast v0, Landroid/widget/TextView;

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    .line 87
    invoke-static {p2}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 88
    move-result v3

    .line 89
    .line 90
    const/16 v5, 0xb

    .line 91
    const/4 v6, 0x0

    .line 92
    const/4 v1, 0x0

    .line 93
    const/4 v2, 0x0

    .line 94
    const/4 v4, 0x0

    .line 95
    .line 96
    .line 97
    invoke-static/range {v0 .. v6}, Lcom/kubi/utils/extensions/core/ViewExtKt;->p(Landroid/view/View;IIIIILjava/lang/Object;)Landroid/view/View;

    .line 98
    :cond_3
    return-void
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
