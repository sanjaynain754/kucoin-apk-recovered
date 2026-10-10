.class public final Lcom/kubi/flutter/widget/kline/interactor/i;
.super Ljava/lang/Object;
.source "KLineCommonDataInteractors.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "convertToCandleItem",
        "Lcom/kubi/flutter/proto/kline/CandleItem;",
        "",
        "",
        "([Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;",
        "LKLineWidget_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKLineCommonDataInteractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineCommonDataInteractorsKt\n+ 2 CandleItemKt.kt\ncom/kubi/flutter/proto/kline/CandleItemKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n8#2:346\n1#3:347\n*S KotlinDebug\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineCommonDataInteractorsKt\n*L\n115#1:346\n115#1:347\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a([Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/flutter/widget/kline/interactor/i;->b([Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final b([Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl$Companion;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/kubi/flutter/proto/kline/CandleItem;->newBuilder()Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "newBuilder(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/CandleItem$b;)Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;

    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    aget-object v1, p0, v1

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2, v3, v4, v5}, Lcom/kubi/utils/extensions/DowngradeExKt;->p(Ljava/lang/String;JILjava/lang/Object;)J

    .line 26
    move-result-wide v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->f(J)V

    .line 30
    .line 31
    aget-object v1, p0, v4

    .line 32
    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2, v3, v4, v5}, Lcom/kubi/utils/extensions/DowngradeExKt;->h(Ljava/lang/String;DILjava/lang/Object;)D

    .line 37
    move-result-wide v6

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v6, v7}, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->e(D)V

    .line 41
    const/4 v1, 0x2

    .line 42
    .line 43
    aget-object v1, p0, v1

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2, v3, v4, v5}, Lcom/kubi/utils/extensions/DowngradeExKt;->h(Ljava/lang/String;DILjava/lang/Object;)D

    .line 47
    move-result-wide v6

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v6, v7}, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->b(D)V

    .line 51
    const/4 v1, 0x3

    .line 52
    .line 53
    aget-object v1, p0, v1

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v2, v3, v4, v5}, Lcom/kubi/utils/extensions/DowngradeExKt;->h(Ljava/lang/String;DILjava/lang/Object;)D

    .line 57
    move-result-wide v6

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v6, v7}, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->c(D)V

    .line 61
    const/4 v1, 0x4

    .line 62
    .line 63
    aget-object v1, p0, v1

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v2, v3, v4, v5}, Lcom/kubi/utils/extensions/DowngradeExKt;->h(Ljava/lang/String;DILjava/lang/Object;)D

    .line 67
    move-result-wide v6

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v6, v7}, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->d(D)V

    .line 71
    array-length v1, p0

    .line 72
    const/4 v6, 0x7

    .line 73
    .line 74
    if-lt v1, v6, :cond_0

    .line 75
    const/4 v1, 0x6

    .line 76
    .line 77
    aget-object p0, p0, v1

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v2, v3, v4, v5}, Lcom/kubi/utils/extensions/DowngradeExKt;->h(Ljava/lang/String;DILjava/lang/Object;)D

    .line 81
    move-result-wide v1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1, v2}, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->g(D)V

    .line 85
    .line 86
    .line 87
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 88
    move-result-object p0

    .line 89
    return-object p0
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
