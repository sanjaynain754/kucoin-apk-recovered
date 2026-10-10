.class public final Lcom/kubi/margin/market/d4;
.super Ljava/lang/Object;
.source "MarginTradeListModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J@\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00082\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000c2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00082\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u000cR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/margin/market/MarginTradeListModel;",
        "",
        "<init>",
        "()V",
        "mApi",
        "Lcom/kubi/margin/api/MarketApi;",
        "kotlin.jvm.PlatformType",
        "getMarketList",
        "Lio/reactivex/Observable;",
        "",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "market",
        "",
        "isMarket",
        "",
        "from",
        "currency",
        "tradeType",
        "",
        "addCoinFavorite",
        "symbol",
        "MarginLib_googleRelease"
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
.field public final a:Lxo/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    const-class v1, Lxo/h;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lxo/h;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/kubi/margin/market/d4;->a:Lxo/h;

    .line 18
    return-void
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
.end method

.method public static synthetic a(Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/market/d4;->e(Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/lang/CharSequence;

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
.end method

.method public static synthetic d(Lcom/kubi/margin/market/d4;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 6

    .line 1
    .line 2
    and-int/lit8 p7, p6, 0x8

    .line 3
    .line 4
    if-eqz p7, :cond_0

    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    move-object v4, p4

    .line 7
    .line 8
    and-int/lit8 p4, p6, 0x10

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    const/4 p5, 0x0

    .line 12
    :cond_1
    move-object v0, p0

    .line 13
    move-object v1, p1

    .line 14
    move v2, p2

    .line 15
    move-object v3, p3

    .line 16
    move v5, p5

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/margin/market/d4;->c(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)Lio/reactivex/Observable;

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

.method public static final e(Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    const-string v0, "getCode(...)"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    return-object p0
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
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/market/d4;->a:Lxo/h;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lxo/h;->addFavorSymbol(Ljava/lang/String;)Lio/reactivex/Observable;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final c(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)Lio/reactivex/Observable;
    .locals 18
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lcom/kubi/data/entity/TradeItemBean;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p3

    .line 7
    .line 8
    move/from16 v3, p5

    .line 9
    .line 10
    const-string v4, "market"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    const-string v4, "from"

    .line 16
    .line 17
    .line 18
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    const-string v4, "relation"

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    move-result v4

    .line 25
    .line 26
    const-string v5, "mApi"

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x1

    .line 29
    .line 30
    if-eqz v4, :cond_3

    .line 31
    .line 32
    sget-object v1, Lgf/n;->a:Lgf/n;

    .line 33
    .line 34
    .line 35
    invoke-static/range {p4 .. p4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    if-ne v3, v7, :cond_0

    .line 39
    move v8, v7

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v8, v6

    .line 42
    :goto_0
    const/4 v9, 0x2

    .line 43
    .line 44
    if-ne v3, v9, :cond_1

    .line 45
    move v6, v7

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {v1, v4, v8, v6}, Lgf/n;->c(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 49
    move-result-object v9

    .line 50
    .line 51
    new-instance v15, Lcom/kubi/margin/market/c4;

    .line 52
    .line 53
    .line 54
    invoke-direct {v15}, Lcom/kubi/margin/market/c4;-><init>()V

    .line 55
    .line 56
    const/16 v16, 0x1f

    .line 57
    .line 58
    const/16 v17, 0x0

    .line 59
    const/4 v10, 0x0

    .line 60
    const/4 v11, 0x0

    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x0

    .line 64
    .line 65
    .line 66
    invoke-static/range {v9 .. v17}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 71
    move-result v3

    .line 72
    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    .line 84
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 85
    return-object v1

    .line 86
    .line 87
    :cond_2
    iget-object v3, v0, Lcom/kubi/margin/market/d4;->a:Lxo/h;

    .line 88
    .line 89
    .line 90
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v3, v1, v2}, Lcom/kubi/margin/market/i4;->e(Lxo/h;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;

    .line 94
    move-result-object v1

    .line 95
    return-object v1

    .line 96
    .line 97
    :cond_3
    const-string v3, "favor"

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    move-result v3

    .line 102
    .line 103
    if-eqz v3, :cond_8

    .line 104
    .line 105
    sget-object v3, Lmp/a;->a:Lmp/a;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Lmp/a;->g()Lcom/kubi/user/api/IUserService;

    .line 109
    move-result-object v4

    .line 110
    .line 111
    .line 112
    invoke-interface {v4}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 113
    move-result v4

    .line 114
    .line 115
    if-eqz v4, :cond_4

    .line 116
    .line 117
    iget-object v3, v0, Lcom/kubi/margin/market/d4;->a:Lxo/h;

    .line 118
    .line 119
    .line 120
    invoke-interface {v3, v1, v2}, Lxo/h;->getMarketSymbol(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;

    .line 121
    move-result-object v1

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 125
    move-result-object v2

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 129
    move-result-object v1

    .line 130
    .line 131
    .line 132
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 133
    return-object v1

    .line 134
    .line 135
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3}, Lmp/a;->e()Lcom/kubi/quotefacade/api/IQuoteFacadeService;

    .line 142
    move-result-object v3

    .line 143
    .line 144
    .line 145
    invoke-interface {v3}, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->j()Ljava/util/List;

    .line 146
    move-result-object v3

    .line 147
    .line 148
    .line 149
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 150
    move-result v3

    .line 151
    .line 152
    :goto_1
    if-ge v6, v3, :cond_6

    .line 153
    .line 154
    sget-object v4, Lmp/a;->a:Lmp/a;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Lmp/a;->e()Lcom/kubi/quotefacade/api/IQuoteFacadeService;

    .line 158
    move-result-object v8

    .line 159
    .line 160
    .line 161
    invoke-interface {v8}, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->j()Ljava/util/List;

    .line 162
    move-result-object v8

    .line 163
    .line 164
    .line 165
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 166
    move-result-object v8

    .line 167
    .line 168
    check-cast v8, Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4}, Lmp/a;->e()Lcom/kubi/quotefacade/api/IQuoteFacadeService;

    .line 175
    move-result-object v4

    .line 176
    .line 177
    .line 178
    invoke-interface {v4}, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->j()Ljava/util/List;

    .line 179
    move-result-object v4

    .line 180
    .line 181
    .line 182
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 183
    move-result v4

    .line 184
    sub-int/2addr v4, v7

    .line 185
    .line 186
    if-eq v6, v4, :cond_5

    .line 187
    .line 188
    const-string v4, ","

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 194
    goto :goto_1

    .line 195
    .line 196
    .line 197
    :cond_6
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 198
    move-result v3

    .line 199
    .line 200
    if-eqz v3, :cond_7

    .line 201
    .line 202
    .line 203
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 204
    move-result-object v1

    .line 205
    .line 206
    .line 207
    invoke-static {v1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    .line 208
    move-result-object v1

    .line 209
    .line 210
    .line 211
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 212
    return-object v1

    .line 213
    .line 214
    :cond_7
    iget-object v3, v0, Lcom/kubi/margin/market/d4;->a:Lxo/h;

    .line 215
    .line 216
    .line 217
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    move-result-object v1

    .line 222
    .line 223
    const-string v4, "toString(...)"

    .line 224
    .line 225
    .line 226
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v3, v1, v2}, Lcom/kubi/margin/market/i4;->e(Lxo/h;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;

    .line 230
    move-result-object v1

    .line 231
    return-object v1

    .line 232
    .line 233
    :cond_8
    if-eqz p2, :cond_9

    .line 234
    .line 235
    iget-object v3, v0, Lcom/kubi/margin/market/d4;->a:Lxo/h;

    .line 236
    .line 237
    .line 238
    invoke-interface {v3, v1, v2}, Lxo/h;->getMarketSymbol(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;

    .line 239
    move-result-object v1

    .line 240
    .line 241
    .line 242
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 243
    move-result-object v2

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 247
    move-result-object v1

    .line 248
    .line 249
    .line 250
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 251
    return-object v1

    .line 252
    .line 253
    :cond_9
    iget-object v3, v0, Lcom/kubi/margin/market/d4;->a:Lxo/h;

    .line 254
    .line 255
    .line 256
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v3, v1, v2}, Lcom/kubi/margin/market/i4;->e(Lxo/h;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;

    .line 260
    move-result-object v1

    .line 261
    return-object v1
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
.end method
