.class public interface abstract Lhi/f;
.super Ljava/lang/Object;
.source "IFuturesPriceConfig.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008f\u0018\u00002\u00020\u0001J\\\u0010\u001a\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0004\u0010\u0005\"\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0008\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\t\u0010\u0005\"\u0004\u0008\n\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000c\u0010\u0005\"\u0004\u0008\r\u0010\u0007R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000f\u0010\u0005\"\u0004\u0008\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0012\u0010\u0005\"\u0004\u0008\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0015\u0010\u0005\"\u0004\u0008\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0018\u0010\u0005\"\u0004\u0008\u0019\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001b\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/futures/trade/config/IFuturesPriceConfig;",
        "",
        "bestBid",
        "Ljava/math/BigDecimal;",
        "getBestBid",
        "()Ljava/math/BigDecimal;",
        "setBestBid",
        "(Ljava/math/BigDecimal;)V",
        "bestAsk",
        "getBestAsk",
        "setBestAsk",
        "bestBid5",
        "getBestBid5",
        "setBestBid5",
        "bestAsk5",
        "getBestAsk5",
        "setBestAsk5",
        "markPrice",
        "getMarkPrice",
        "setMarkPrice",
        "latestPrice",
        "getLatestPrice",
        "setLatestPrice",
        "indexPrice",
        "getIndexPrice",
        "setIndexPrice",
        "copy",
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
.method public static synthetic f(Lhi/f;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/lang/Object;)Lhi/f;
    .locals 0

    .line 1
    .line 2
    if-nez p9, :cond_7

    .line 3
    .line 4
    and-int/lit8 p9, p8, 0x1

    .line 5
    .line 6
    if-eqz p9, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Lhi/f;->b()Ljava/math/BigDecimal;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    :cond_0
    and-int/lit8 p9, p8, 0x2

    .line 13
    .line 14
    if-eqz p9, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Lhi/f;->d0()Ljava/math/BigDecimal;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    :cond_1
    and-int/lit8 p9, p8, 0x4

    .line 21
    .line 22
    if-eqz p9, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Lhi/f;->c()Ljava/math/BigDecimal;

    .line 26
    move-result-object p3

    .line 27
    .line 28
    :cond_2
    and-int/lit8 p9, p8, 0x8

    .line 29
    .line 30
    if-eqz p9, :cond_3

    .line 31
    .line 32
    .line 33
    invoke-interface {p0}, Lhi/f;->e()Ljava/math/BigDecimal;

    .line 34
    move-result-object p4

    .line 35
    .line 36
    :cond_3
    and-int/lit8 p9, p8, 0x10

    .line 37
    .line 38
    if-eqz p9, :cond_4

    .line 39
    .line 40
    .line 41
    invoke-interface {p0}, Lhi/f;->n()Ljava/math/BigDecimal;

    .line 42
    move-result-object p5

    .line 43
    .line 44
    :cond_4
    and-int/lit8 p9, p8, 0x20

    .line 45
    .line 46
    if-eqz p9, :cond_5

    .line 47
    .line 48
    .line 49
    invoke-interface {p0}, Lhi/f;->o()Ljava/math/BigDecimal;

    .line 50
    move-result-object p6

    .line 51
    .line 52
    :cond_5
    and-int/lit8 p8, p8, 0x40

    .line 53
    .line 54
    if-eqz p8, :cond_6

    .line 55
    .line 56
    .line 57
    invoke-interface {p0}, Lhi/f;->d()Ljava/math/BigDecimal;

    .line 58
    move-result-object p7

    .line 59
    :cond_6
    move-object p8, p6

    .line 60
    move-object p9, p7

    .line 61
    move-object p6, p4

    .line 62
    move-object p7, p5

    .line 63
    move-object p4, p2

    .line 64
    move-object p5, p3

    .line 65
    move-object p2, p0

    .line 66
    move-object p3, p1

    .line 67
    .line 68
    .line 69
    invoke-interface/range {p2 .. p9}, Lhi/f;->a(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lhi/f;

    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    .line 73
    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 74
    .line 75
    const-string p1, "Super calls with default arguments not supported in this target, function: copy"

    .line 76
    .line 77
    .line 78
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 79
    throw p0
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
.end method


# virtual methods
.method public abstract a(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lhi/f;
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract c()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract d()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract d0()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract e()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract n()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract o()Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
