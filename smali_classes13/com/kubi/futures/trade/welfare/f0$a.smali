.class public final Lcom/kubi/futures/trade/welfare/f0$a;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "FuturesWelfareAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/futures/trade/welfare/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0019\u0010\u000b\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0019\u0010\r\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\nR\u0019\u0010\u000f\u001a\n \u0008*\u0004\u0018\u00010\u00100\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\nR\u0019\u0010\u0015\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\nR\u0019\u0010\u0017\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\nR\u0019\u0010\u0019\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\n\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$AssetsViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "view",
        "Landroid/view/View;",
        "<init>",
        "(Landroid/view/View;)V",
        "withdrawLabel",
        "Landroidx/appcompat/widget/AppCompatTextView;",
        "kotlin.jvm.PlatformType",
        "getWithdrawLabel",
        "()Landroidx/appcompat/widget/AppCompatTextView;",
        "withdrawAmount",
        "getWithdrawAmount",
        "withdrawLegal",
        "getWithdrawLegal",
        "withdraw",
        "Lcom/kubi/resources/widget/button/KcPrimaryButton;",
        "getWithdraw",
        "()Lcom/kubi/resources/widget/button/KcPrimaryButton;",
        "balanceLabel",
        "getBalanceLabel",
        "balanceValue",
        "getBalanceValue",
        "pnlLabel",
        "getPnlLabel",
        "pnlValue",
        "getPnlValue",
        "KumexLib_googleRelease"
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
.field public final g:Landroidx/appcompat/widget/AppCompatTextView;

.field public final h:Landroidx/appcompat/widget/AppCompatTextView;

.field public final i:Landroidx/appcompat/widget/AppCompatTextView;

.field public final j:Lcom/kubi/resources/widget/button/KcPrimaryButton;

.field public final k:Landroidx/appcompat/widget/AppCompatTextView;

.field public final l:Landroidx/appcompat/widget/AppCompatTextView;

.field public final m:Landroidx/appcompat/widget/AppCompatTextView;

.field public final n:Landroidx/appcompat/widget/AppCompatTextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 11
    .line 12
    sget v0, Lcom/kubi/kumex/R$id;->withdrawLabel:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/kubi/futures/trade/welfare/f0$a;->g:Landroidx/appcompat/widget/AppCompatTextView;

    .line 21
    .line 22
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 23
    .line 24
    sget v0, Lcom/kubi/kumex/R$id;->withdrawAmount:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    check-cast p1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 31
    .line 32
    iput-object p1, p0, Lcom/kubi/futures/trade/welfare/f0$a;->h:Landroidx/appcompat/widget/AppCompatTextView;

    .line 33
    .line 34
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 35
    .line 36
    sget v0, Lcom/kubi/kumex/R$id;->withdrawLegal:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    check-cast p1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 43
    .line 44
    iput-object p1, p0, Lcom/kubi/futures/trade/welfare/f0$a;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 45
    .line 46
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 47
    .line 48
    sget v0, Lcom/kubi/kumex/R$id;->withdraw:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    check-cast p1, Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 55
    .line 56
    iput-object p1, p0, Lcom/kubi/futures/trade/welfare/f0$a;->j:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 57
    .line 58
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 59
    .line 60
    sget v0, Lcom/kubi/kumex/R$id;->balanceLabel:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    check-cast p1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 67
    .line 68
    iput-object p1, p0, Lcom/kubi/futures/trade/welfare/f0$a;->k:Landroidx/appcompat/widget/AppCompatTextView;

    .line 69
    .line 70
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 71
    .line 72
    sget v0, Lcom/kubi/kumex/R$id;->balanceValue:I

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    check-cast p1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 79
    .line 80
    iput-object p1, p0, Lcom/kubi/futures/trade/welfare/f0$a;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 81
    .line 82
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 83
    .line 84
    sget v0, Lcom/kubi/kumex/R$id;->pnlLabel:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    check-cast p1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 91
    .line 92
    iput-object p1, p0, Lcom/kubi/futures/trade/welfare/f0$a;->m:Landroidx/appcompat/widget/AppCompatTextView;

    .line 93
    .line 94
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 95
    .line 96
    sget v0, Lcom/kubi/kumex/R$id;->pnlValue:I

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    check-cast p1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 103
    .line 104
    iput-object p1, p0, Lcom/kubi/futures/trade/welfare/f0$a;->n:Landroidx/appcompat/widget/AppCompatTextView;

    .line 105
    return-void
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
.end method


# virtual methods
.method public final b()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0$a;->k:Landroidx/appcompat/widget/AppCompatTextView;

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
.end method

.method public final c()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0$a;->l:Landroidx/appcompat/widget/AppCompatTextView;

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
.end method

.method public final d()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0$a;->m:Landroidx/appcompat/widget/AppCompatTextView;

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
.end method

.method public final e()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0$a;->n:Landroidx/appcompat/widget/AppCompatTextView;

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
.end method

.method public final f()Lcom/kubi/resources/widget/button/KcPrimaryButton;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0$a;->j:Lcom/kubi/resources/widget/button/KcPrimaryButton;

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
.end method

.method public final g()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0$a;->h:Landroidx/appcompat/widget/AppCompatTextView;

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
.end method

.method public final h()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0$a;->g:Landroidx/appcompat/widget/AppCompatTextView;

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
.end method

.method public final i()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0$a;->i:Landroidx/appcompat/widget/AppCompatTextView;

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
.end method
