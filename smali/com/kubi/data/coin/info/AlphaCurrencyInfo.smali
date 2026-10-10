.class public final Lcom/kubi/data/coin/info/AlphaCurrencyInfo;
.super Ljava/lang/Object;
.source "AlphaCurrencyInfo.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0014\u001a\u00020\u00152\u001e\u0008\u0002\u0010\u0016\u001a\u0018\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0017J\u0018\u0010\u001a\u001a\u00020\u00152\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0019H\u0002J!\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0008\u0010 \u001a\u0004\u0018\u00010\u00132\u0008\u0010!\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0002\u0010#J\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020\u0005H\u0002J!\u0010\'\u001a\u00020\u00052\u0008\u0010 \u001a\u0004\u0018\u00010\u00132\u0008\u0010!\u001a\u0004\u0018\u00010\"H\u0002\u00a2\u0006\u0002\u0010(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/kubi/data/coin/info/AlphaCurrencyInfo;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "tradeApi",
        "Lcom/kubi/data/coin/CoinApi;",
        "kotlin.jvm.PlatformType",
        "getTradeApi",
        "()Lcom/kubi/data/coin/CoinApi;",
        "tradeApi$delegate",
        "Lkotlin/Lazy;",
        "ALPHA_CURRENCY_INFO_KEY",
        "getALPHA_CURRENCY_INFO_KEY",
        "()Ljava/lang/String;",
        "ALPHA_CURRENCY_INFO_KEY$delegate",
        "CURRENCY_INFO_TIME_LINE",
        "Lcom/kubi/utils/storage/StorageId;",
        "",
        "fetchAlphaCurrencyInfoList",
        "",
        "callback",
        "Lkotlin/Function1;",
        "Ljava/util/ArrayList;",
        "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;",
        "batchSave",
        "it",
        "",
        "saveEntity",
        "entity",
        "getAlphaCurrencyEntity",
        "currencySeq",
        "isQuoteCurrency",
        "",
        "(Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;",
        "getAlphaCurrencyInfoListSync",
        "getEntity",
        "key",
        "getKey",
        "(Ljava/lang/Long;Ljava/lang/Boolean;)Ljava/lang/String;",
        "LDataProvider_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAlphaCurrencyInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaCurrencyInfo.kt\ncom/kubi/data/coin/info/AlphaCurrencyInfo\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 8 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,157:1\n15#2:158\n84#2:159\n1869#3,2:160\n241#4,2:162\n281#4,4:177\n11546#5,9:164\n13472#5:173\n13473#5:175\n11555#5:176\n1#6:174\n139#7:181\n17#7:182\n178#8:183\n*S KotlinDebug\n*F\n+ 1 AlphaCurrencyInfo.kt\ncom/kubi/data/coin/info/AlphaCurrencyInfo\n*L\n57#1:158\n60#1:159\n88#1:160,2\n98#1:162,2\n143#1:177,4\n128#1:164,9\n128#1:173\n128#1:175\n128#1:176\n128#1:174\n143#1:181\n143#1:182\n143#1:183\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/data/coin/info/AlphaCurrencyInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Ly70/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly70/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->a:Lcom/kubi/data/coin/info/AlphaCurrencyInfo;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/data/coin/info/a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/data/coin/info/a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->b:Lkotlin/Lazy;

    .line 19
    .line 20
    new-instance v0, Lcom/kubi/data/coin/info/b;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Lcom/kubi/data/coin/info/b;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    sput-object v0, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->c:Lkotlin/Lazy;

    .line 30
    .line 31
    new-instance v1, Ly70/g;

    .line 32
    .line 33
    const/16 v6, 0xc

    .line 34
    const/4 v7, 0x0

    .line 35
    .line 36
    const-string v2, "alpha"

    .line 37
    .line 38
    const-string v3, "alpha_currency_info_time_line"

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v1 .. v7}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    .line 45
    sput-object v1, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->d:Ly70/g;

    .line 46
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static synthetic a()Lgf/h;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->q()Lgf/h;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->c()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final c()Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/f;->a:Lcom/kubi/sdk/site/f;

    .line 3
    const/4 v4, 0x6

    .line 4
    const/4 v5, 0x0

    .line 5
    .line 6
    const-string v1, "alpha_currency_info_key"

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, Lcom/kubi/sdk/site/f;->c(Lcom/kubi/sdk/site/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static final synthetic d(Lcom/kubi/data/coin/info/AlphaCurrencyInfo;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->g(Ljava/util/List;)V

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
    .line 57
    .line 58
    .line 59
.end method

.method public static final synthetic e()Ly70/g;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->d:Ly70/g;

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
.end method

.method public static final synthetic f(Lcom/kubi/data/coin/info/AlphaCurrencyInfo;)Lgf/h;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->o()Lgf/h;

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
.end method

.method public static synthetic i(Lcom/kubi/data/coin/info/AlphaCurrencyInfo;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p2, p2, 0x1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->h(Lkotlin/jvm/functions/Function1;)V

    .line 9
    return-void
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
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public static final q()Lgf/h;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->d()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lgf/h;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lgf/h;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public final g(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;

    .line 19
    .line 20
    sget-object v1, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->a:Lcom/kubi/data/coin/info/AlphaCurrencyInfo;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->p(Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public final h(Lkotlin/jvm/functions/Function1;)V
    .locals 11
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "fetchAlphaCurrencyInfoList start"

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v2, v1}, Lqq/a;->e(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 8
    .line 9
    sget-object v0, Lvk/s;->a:Lvk/s;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lvk/s;->d0()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->d:Ly70/g;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Ly70/a;->r(Ly70/g;)Ly70/a;

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    sget-object v0, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->d:Ly70/g;

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v3, v4}, Ly70/a;->f(Ly70/g;J)J

    .line 29
    move-result-wide v3

    .line 30
    .line 31
    :goto_0
    const-string v0, "fetchAlphaCurrencyInfoList section2"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2, v1}, Lqq/a;->e(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 35
    .line 36
    sget-object v5, Lgf/a;->c:Lgf/a;

    .line 37
    .line 38
    new-instance v8, Lcom/kubi/data/coin/info/AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1;

    .line 39
    .line 40
    .line 41
    invoke-direct {v8, v3, v4, p1, v1}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1;-><init>(JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 42
    const/4 v9, 0x3

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    .line 47
    .line 48
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 49
    .line 50
    const-string p1, "fetchAlphaCurrencyInfoList section4"

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v1, v2, v1}, Lqq/a;->e(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 54
    return-void
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
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->c:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    return-object v0
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
.end method

.method public final k(Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;
    .locals 1
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->n(Ljava/lang/Long;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->m(Ljava/lang/String;)Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    sget-object p2, Lcom/kubi/data/coin/BizType;->AlphaEntityQuery:Lcom/kubi/data/coin/BizType;

    .line 18
    .line 19
    sget-object v0, Lcom/kubi/data/coin/QueryRet;->FAILED:Lcom/kubi/data/coin/QueryRet;

    .line 20
    .line 21
    .line 22
    invoke-static {p2, v0}, Lgf/y;->a(Lcom/kubi/data/coin/BizType;Lcom/kubi/data/coin/QueryRet;)V

    .line 23
    return-object p1

    .line 24
    .line 25
    :cond_1
    sget-object p2, Lcom/kubi/data/coin/BizType;->AlphaEntityQuery:Lcom/kubi/data/coin/BizType;

    .line 26
    .line 27
    sget-object v0, Lcom/kubi/data/coin/QueryRet;->SUCCESS:Lcom/kubi/data/coin/QueryRet;

    .line 28
    .line 29
    .line 30
    invoke-static {p2, v0}, Lgf/y;->a(Lcom/kubi/data/coin/BizType;Lcom/kubi/data/coin/QueryRet;)V

    .line 31
    return-object p1

    .line 32
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 33
    return-object p1
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
.end method

.method public final l()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->j()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ly70/e;->c(Ljava/lang/String;)[Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_4

    .line 13
    array-length v3, v0

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    goto :goto_1

    .line 17
    .line 18
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 22
    array-length v4, v0

    .line 23
    const/4 v5, 0x0

    .line 24
    .line 25
    :goto_0
    if-ge v5, v4, :cond_2

    .line 26
    .line 27
    aget-object v6, v0, v5

    .line 28
    .line 29
    sget-object v7, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->a:Lcom/kubi/data/coin/info/AlphaCurrencyInfo;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v7, v6}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->m(Ljava/lang/String;)Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;

    .line 33
    move-result-object v6

    .line 34
    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_2
    new-instance v0, Lcom/kubi/data/coin/info/AlphaCurrencyInfo$a;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo$a;-><init>()V

    .line 47
    .line 48
    new-instance v4, Lcom/kubi/data/coin/info/AlphaCurrencyInfo$b;

    .line 49
    .line 50
    .line 51
    invoke-direct {v4, v0}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo$b;-><init>(Ljava/util/Comparator;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 59
    move-result v3

    .line 60
    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v2, v1, v2}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->i(Lcom/kubi/data/coin/info/AlphaCurrencyInfo;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 65
    :cond_3
    return-object v0

    .line 66
    .line 67
    .line 68
    :cond_4
    :goto_1
    invoke-static {p0, v2, v1, v2}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->i(Lcom/kubi/data/coin/info/AlphaCurrencyInfo;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 72
    move-result-object v0

    .line 73
    return-object v0
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
.end method

.method public final m(Ljava/lang/String;)Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->j()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Ly70/e;->a:Ly70/e;

    .line 7
    .line 8
    new-instance v1, Ly70/g;

    .line 9
    .line 10
    sget-object v2, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 11
    const/4 v3, 0x1

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v0, p1, v2, v3}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 15
    .line 16
    sget-object p1, Ly70/a;->a:Ly70/a;

    .line 17
    .line 18
    const-class v0, Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1, v0, v2}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    check-cast p1, Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;

    .line 26
    return-object p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public final n(Ljava/lang/Long;Ljava/lang/Boolean;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result p2

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    const-string p2, "quote"

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    const-string p2, "base"

    .line 14
    .line 15
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const/16 p2, 0x5f

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object p1

    .line 34
    return-object p1
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
.end method

.method public final o()Lgf/h;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lgf/h;

    .line 9
    return-object v0
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
.end method

.method public final p(Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;->getCurrencySeq()Ljava/lang/Long;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;->isQuoteCurrency()Ljava/lang/Boolean;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->j()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;->getCurrencySeq()Ljava/lang/Long;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;->isQuoteCurrency()Ljava/lang/Boolean;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1, v2}, Lcom/kubi/data/coin/info/AlphaCurrencyInfo;->n(Ljava/lang/Long;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1, p1}, Ly70/e;->n(Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;)Ly70/e;

    .line 32
    :cond_0
    return-void
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
.end method
