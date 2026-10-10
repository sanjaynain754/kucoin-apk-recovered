.class public interface abstract Lcom/kubi/home/rank/impl/cache/b;
.super Ljava/lang/Object;
.source "IRankCoinMemory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0001\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0003\u0010\t\u001a\u00020\nH\'J$\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0003\u0010\t\u001a\u00020\nH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000c\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/home/rank/impl/cache/IRankCoinMemory;",
        "",
        "insertCoinList",
        "",
        "value",
        "",
        "Lcom/kubi/kucoin/home/cards_2/rank/impl/cache/RankCoinEntity;",
        "proxy",
        "Lcom/kubi/restful/BaseProxy;",
        "type",
        "Ljava/lang/reflect/Type;",
        "getCoinList",
        "HomeLib_googleRelease"
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
.method public static synthetic c(Lcom/kubi/home/rank/impl/cache/b;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    if-nez p4, :cond_2

    .line 3
    .line 4
    and-int/lit8 p4, p3, 0x1

    .line 5
    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/kubi/home/rank/impl/cache/RankMemoryProxy;->d:Lcom/kubi/home/rank/impl/cache/RankMemoryProxy$Companion;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankMemoryProxy$Companion;->getInstance()Lcom/kubi/home/rank/impl/cache/RankMemoryProxy;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 15
    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    new-instance p2, Lcom/kubi/home/rank/impl/cache/b$a;

    .line 19
    .line 20
    .line 21
    invoke-direct {p2}, Lcom/kubi/home/rank/impl/cache/b$a;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    const-string p3, "getType(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-interface {p0, p1, p2}, Lcom/kubi/home/rank/impl/cache/b;->a(Lcom/kubi/restful/a;Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 38
    .line 39
    const-string p1, "Super calls with default arguments not supported in this target, function: getCoinList"

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 43
    throw p0
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
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
.end method

.method public static synthetic d(Lcom/kubi/home/rank/impl/cache/b;Ljava/util/List;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    if-nez p5, :cond_2

    .line 3
    .line 4
    and-int/lit8 p5, p4, 0x2

    .line 5
    .line 6
    if-eqz p5, :cond_0

    .line 7
    .line 8
    sget-object p2, Lcom/kubi/home/rank/impl/cache/RankMemoryProxy;->d:Lcom/kubi/home/rank/impl/cache/RankMemoryProxy$Companion;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankMemoryProxy$Companion;->getInstance()Lcom/kubi/home/rank/impl/cache/RankMemoryProxy;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 15
    .line 16
    if-eqz p4, :cond_1

    .line 17
    .line 18
    sget-object p3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lcom/kubi/home/rank/impl/cache/b;->b(Ljava/util/List;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;)Z

    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    .line 25
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    const-string p1, "Super calls with default arguments not supported in this target, function: insertCoinList"

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 31
    throw p0
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
.end method


# virtual methods
.method public abstract a(Lcom/kubi/restful/a;Ljava/lang/reflect/Type;)Ljava/util/List;
    .param p1    # Lcom/kubi/restful/a;
        .annotation runtime Lcom/kubi/restful/i;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/reflect/Type;
        .annotation runtime Lcom/kubi/restful/k;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/kubi/restful/j;
        default = "[]"
        key = "coin"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/restful/a;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/util/List<",
            "Lcom/kubi/kucoin/home/cards_2/rank/impl/cache/RankCoinEntity;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b(Ljava/util/List;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;)Z
    .param p1    # Ljava/util/List;
        .annotation runtime Lcom/kubi/restful/l;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/restful/a;
        .annotation runtime Lcom/kubi/restful/i;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/reflect/Type;
        .annotation runtime Lcom/kubi/restful/k;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/kubi/restful/h;
        key = "coin"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/kucoin/home/cards_2/rank/impl/cache/RankCoinEntity;",
            ">;",
            "Lcom/kubi/restful/a;",
            "Ljava/lang/reflect/Type;",
            ")Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation
.end method
