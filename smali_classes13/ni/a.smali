.class public final Lni/a;
.super Ljava/lang/Object;
.source "QuoteEntity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "illegal",
        "",
        "Lcom/kubi/kumex/data/trade/model/QuoteEntity;",
        "toQuoteModel",
        "Lcom/kubi/futures/trade/marginMode/perpetualSwap/data/QuoteModel;",
        "KumexLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/kubi/kumex/data/trade/model/QuoteEntity;)Z
    .locals 1
    .param p0    # Lcom/kubi/kumex/data/trade/model/QuoteEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/QuoteEntity;->getSymbol()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/QuoteEntity;->getMarginMode()Ljava/lang/String;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 25
    move-result p0

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 32
    return p0
.end method

.method public static final b(Lcom/kubi/kumex/data/trade/model/QuoteEntity;)Lcom/kubi/futures/trade/marginMode/perpetualSwap/data/QuoteModel;
    .locals 8
    .param p0    # Lcom/kubi/kumex/data/trade/model/QuoteEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/QuoteEntity;->getSwitchable()Ljava/lang/Boolean;

    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    move-result v0

    .line 17
    move v3, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v3, v1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/QuoteEntity;->getMarginMode()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v2, ""

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    move-object v4, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v4, v0

    .line 31
    .line 32
    .line 33
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/QuoteEntity;->getSymbol()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    move-object v5, v2

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move-object v5, v0

    .line 40
    .line 41
    :goto_2
    sget-object v0, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/QuoteEntity;->getSymbol()Ljava/lang/String;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    if-nez p0, :cond_3

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    move-object v2, p0

    .line 54
    .line 55
    .line 56
    :goto_3
    invoke-interface {v0, v2, v1}, Lth/d;->D(Ljava/lang/String;Z)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 57
    move-result-object v6

    .line 58
    .line 59
    new-instance v2, Lcom/kubi/futures/trade/marginMode/perpetualSwap/data/QuoteModel;

    .line 60
    const/4 v7, 0x0

    .line 61
    .line 62
    .line 63
    invoke-direct/range {v2 .. v7}, Lcom/kubi/futures/trade/marginMode/perpetualSwap/data/QuoteModel;-><init>(ZLjava/lang/String;Ljava/lang/String;Lcom/kubi/kumex/data/platform/model/ContractEntity;Z)V

    .line 64
    return-object v2
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
