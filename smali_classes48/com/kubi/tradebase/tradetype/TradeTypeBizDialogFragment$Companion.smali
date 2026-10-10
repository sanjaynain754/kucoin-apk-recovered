.class public final Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$Companion;
.super Ljava/lang/Object;
.source "TradeTypeBizDialogFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$Companion;",
        "",
        "<init>",
        "()V",
        "newInstance",
        "Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;",
        "supTradeTypeList",
        "",
        "",
        "initType",
        "Lcom/kubi/tradebase/tradetype/TradeType;",
        "pageId",
        "isFutures",
        "",
        "isConditionalMarket",
        "quoteCurrency",
        "([Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;Ljava/lang/String;ZZLjava/lang/String;)Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;",
        "TradeBaseLib_googleRelease"
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

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$Companion;-><init>()V

    return-void
.end method

.method public static synthetic newInstance$default(Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$Companion;[Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;Ljava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;
    .locals 1

    .line 1
    .line 2
    and-int/lit8 p8, p7, 0x8

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p8, :cond_0

    .line 6
    move p4, v0

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p8, p7, 0x10

    .line 9
    .line 10
    if-eqz p8, :cond_1

    .line 11
    move p5, v0

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p7, p7, 0x20

    .line 14
    .line 15
    if-eqz p7, :cond_2

    .line 16
    const/4 p6, 0x0

    .line 17
    .line 18
    .line 19
    :cond_2
    invoke-virtual/range {p0 .. p6}, Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$Companion;->newInstance([Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;Ljava/lang/String;ZZLjava/lang/String;)Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;

    .line 20
    move-result-object p0

    .line 21
    return-object p0
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
.end method


# virtual methods
.method public final newInstance([Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;Ljava/lang/String;ZZLjava/lang/String;)Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;
    .locals 3
    .param p1    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/tradebase/tradetype/TradeType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "supTradeTypeList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "initType"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v2, "pageId"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    new-instance v2, Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v0, p1}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 27
    .line 28
    const-string p1, "parentPageId"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, p1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    const-string p1, "isFutures"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, p1, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 37
    .line 38
    const-string p1, "isConditionalMarket"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p1, p5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 42
    .line 43
    if-eqz p6, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-interface {p6}, Ljava/lang/CharSequence;->length()I

    .line 47
    move-result p1

    .line 48
    .line 49
    if-nez p1, :cond_0

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :cond_0
    const-string p1, "quoteCurrency"

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, p1, p6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    :cond_1
    :goto_0
    new-instance p1, Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;

    .line 58
    .line 59
    .line 60
    invoke-direct {p1}, Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 64
    return-object p1
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
.end method
