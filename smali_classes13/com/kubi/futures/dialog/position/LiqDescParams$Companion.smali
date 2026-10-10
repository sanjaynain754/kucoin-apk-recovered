.class public final Lcom/kubi/futures/dialog/position/LiqDescParams$Companion;
.super Ljava/lang/Object;
.source "LiqDescDialog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/futures/dialog/position/LiqDescParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0008\u001a\u00020\t*\u0004\u0018\u00010\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/futures/dialog/position/LiqDescParams$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Lcom/kubi/futures/dialog/position/LiqDescParams;",
        "position",
        "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "appendPriceCurrency",
        "",
        "contract",
        "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
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
    invoke-direct {p0}, Lcom/kubi/futures/dialog/position/LiqDescParams$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/String;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 3
    .line 4
    sget v1, Lcom/kubi/kumex/R$string;->stub:I

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    new-array v2, v2, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result p1

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    return-object v1

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {p2}, Lfm/b;->i(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    const/4 v5, 0x4

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v3, 0x1

    .line 30
    const/4 v4, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static/range {v1 .. v6}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    return-object p1
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
.end method

.method public final from(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lcom/kubi/futures/dialog/position/LiqDescParams;
    .locals 10
    .param p1    # Lcom/kubi/kumex/data/trade/model/PositionEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "position"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lfm/d;->b(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Lcom/kubi/futures/dialog/position/LiqDescParams;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lfm/d;->A(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Z

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getId()Ljava/lang/String;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 23
    move-result-object v4

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 27
    move-result-object v5

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 31
    move-result v6

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0}, Lfm/d;->j(Lcom/kubi/kumex/data/trade/model/PositionEntity;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/String;

    .line 35
    move-result-object v7

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v7, v0}, Lcom/kubi/futures/dialog/position/LiqDescParams$Companion;->a(Ljava/lang/String;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/String;

    .line 39
    move-result-object v7

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, Lfm/d;->e(Lcom/kubi/kumex/data/trade/model/PositionEntity;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1, v0}, Lcom/kubi/futures/dialog/position/LiqDescParams$Companion;->a(Ljava/lang/String;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/String;

    .line 47
    move-result-object v8

    .line 48
    const/4 v9, 0x1

    .line 49
    .line 50
    .line 51
    invoke-direct/range {v1 .. v9}, Lcom/kubi/futures/dialog/position/LiqDescParams;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 52
    return-object v1
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
