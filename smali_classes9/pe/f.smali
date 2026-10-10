.class public final Lpe/f;
.super Ljava/lang/Object;
.source "SpotLimitTradeInputIntercept.kt"

# interfaces
.implements Lpe/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JH\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/kubi/core/spot/business/holder/intercept/input/SpotLimitTradeInputIntercept;",
        "Lcom/kubi/core/spot/business/holder/intercept/input/ILimitTradeInputIntercept;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "getContext",
        "()Landroid/content/Context;",
        "checkInterceptFailed",
        "",
        "parentBehavior",
        "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;",
        "inputLimitPrice",
        "Ljava/math/BigDecimal;",
        "inputTriggerPrice",
        "inputNumber",
        "volumeErrorCallBack",
        "Lio/reactivex/functions/Consumer;",
        "balanceNotEnough",
        "Lkotlin/Function0;",
        "TradeCoreBizLib_googleRelease"
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
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lpe/f;->a:Landroid/content/Context;

    .line 11
    return-void
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
.end method


# virtual methods
.method public a(Lcom/kubi/core/spot/business/holder/f0;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lio/reactivex/functions/Consumer;Lkotlin/jvm/functions/Function0;)Z
    .locals 20
    .param p1    # Lcom/kubi/core/spot/business/holder/f0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lio/reactivex/functions/Consumer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/core/spot/business/holder/f0;",
            "Ljava/math/BigDecimal;",
            "Ljava/math/BigDecimal;",
            "Ljava/math/BigDecimal;",
            "Lio/reactivex/functions/Consumer<",
            "Ljava/math/BigDecimal;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    move-object/from16 v2, p4

    .line 7
    .line 8
    move-object/from16 v3, p5

    .line 9
    .line 10
    const-string v4, "parentBehavior"

    .line 11
    .line 12
    move-object/from16 v5, p1

    .line 13
    .line 14
    .line 15
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v4, "inputLimitPrice"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    const-string v4, "inputNumber"

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    const-string v4, "balanceNotEnough"

    .line 28
    .line 29
    move-object/from16 v6, p6

    .line 30
    .line 31
    .line 32
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    sget-object v4, Lxe/b;->a:Lxe/b;

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x1

    .line 38
    .line 39
    .line 40
    invoke-static {v4, v8, v9, v7}, Lxe/b;->b(Lxe/b;ZILjava/lang/Object;)Lye/a;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    .line 44
    invoke-interface {v4, v1}, Lye/a;->a(Ljava/math/BigDecimal;)Z

    .line 45
    move-result v4

    .line 46
    .line 47
    if-nez v4, :cond_0

    .line 48
    return v9

    .line 49
    .line 50
    :cond_0
    const-string v4, "LimitOrderHolder"

    .line 51
    .line 52
    if-eqz p3, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-static/range {p3 .. p3}, Lkf/a;->D(Ljava/math/BigDecimal;)Z

    .line 56
    move-result v7

    .line 57
    .line 58
    if-eqz v7, :cond_1

    .line 59
    .line 60
    const-string v1, "\u5f53\u524d\u8ba2\u5355-\u6b62\u635f\u4ef7\u4e3a0"

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v4}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    iget-object v1, v0, Lpe/f;->a:Landroid/content/Context;

    .line 66
    .line 67
    sget v2, Lcom/kubi/tradecorebiz/R$string;->trigger_price_not_zero:I

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    new-array v2, v8, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v2}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    .line 78
    sget-object v1, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker;->a:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$Companion;

    .line 79
    .line 80
    sget-object v2, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;->CHECK_LIMIT_PRICE:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;

    .line 81
    .line 82
    sget-object v3, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->LIMIT_PRICE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2, v3}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$Companion;->trackSpotOrderFail(Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;)V

    .line 86
    return v9

    .line 87
    .line 88
    :cond_1
    new-instance v7, Ljava/math/BigDecimal;

    .line 89
    .line 90
    .line 91
    invoke-interface {v5}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 92
    move-result-object v10

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMinSize()D

    .line 96
    move-result-wide v10

    .line 97
    .line 98
    .line 99
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 100
    move-result-object v10

    .line 101
    .line 102
    .line 103
    invoke-direct {v7, v10}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    new-instance v10, Ljava/math/BigDecimal;

    .line 106
    .line 107
    .line 108
    invoke-interface {v5}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 109
    move-result-object v11

    .line 110
    .line 111
    .line 112
    invoke-virtual {v11}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMaxSize()D

    .line 113
    move-result-wide v11

    .line 114
    .line 115
    .line 116
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 117
    move-result-object v11

    .line 118
    .line 119
    .line 120
    invoke-direct {v10, v11}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v2, v7, v10}, Lh30/b;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Z

    .line 124
    move-result v7

    .line 125
    .line 126
    const-string v10, " \u6700\u5c0f\u503c:"

    .line 127
    .line 128
    if-nez v7, :cond_2

    .line 129
    .line 130
    new-instance v1, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    const-string v3, "\u5f53\u524d\u8ba2\u5355-\u6570\u91cf\u6700\u5927\u6700\u5c0f\u503c\u6821\u9a8c\u5931\u8d25:\u5f53\u524d\u6570\u91cf:"

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-static {v2}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 142
    move-result-object v2

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 146
    move-result-object v2

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    new-instance v2, Ljava/math/BigDecimal;

    .line 155
    .line 156
    .line 157
    invoke-interface {v5}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 158
    move-result-object v3

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMinSize()D

    .line 162
    move-result-wide v6

    .line 163
    .line 164
    .line 165
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 166
    move-result-object v3

    .line 167
    .line 168
    .line 169
    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v2}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 173
    move-result-object v2

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 177
    move-result-object v2

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v2, " \u6700\u5927\u503c:"

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    new-instance v2, Ljava/math/BigDecimal;

    .line 188
    .line 189
    .line 190
    invoke-interface {v5}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 191
    move-result-object v3

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMaxSize()D

    .line 195
    move-result-wide v6

    .line 196
    .line 197
    .line 198
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 199
    move-result-object v3

    .line 200
    .line 201
    .line 202
    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v2}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 206
    move-result-object v2

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 210
    move-result-object v2

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const/16 v2, 0x20

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    move-result-object v1

    .line 223
    .line 224
    .line 225
    invoke-static {v1, v4}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    iget-object v1, v0, Lpe/f;->a:Landroid/content/Context;

    .line 228
    .line 229
    sget v2, Lcom/kubi/tradecorebiz/R$string;->quantity_must_range:I

    .line 230
    .line 231
    new-instance v10, Ljava/math/BigDecimal;

    .line 232
    .line 233
    .line 234
    invoke-interface {v5}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 235
    move-result-object v3

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMinSize()D

    .line 239
    move-result-wide v3

    .line 240
    .line 241
    .line 242
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 243
    move-result-object v3

    .line 244
    .line 245
    .line 246
    invoke-direct {v10, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    const/16 v18, 0x7d

    .line 249
    .line 250
    const/16 v19, 0x0

    .line 251
    const/4 v11, 0x0

    .line 252
    .line 253
    const/16 v12, 0x14

    .line 254
    const/4 v13, 0x0

    .line 255
    const/4 v14, 0x0

    .line 256
    const/4 v15, 0x0

    .line 257
    .line 258
    const/16 v16, 0x0

    .line 259
    .line 260
    const/16 v17, 0x0

    .line 261
    .line 262
    .line 263
    invoke-static/range {v10 .. v19}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 264
    move-result-object v3

    .line 265
    .line 266
    new-instance v10, Ljava/math/BigDecimal;

    .line 267
    .line 268
    .line 269
    invoke-interface {v5}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 270
    move-result-object v4

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMaxSize()D

    .line 274
    move-result-wide v4

    .line 275
    .line 276
    .line 277
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 278
    move-result-object v4

    .line 279
    .line 280
    .line 281
    invoke-direct {v10, v4}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-static/range {v10 .. v19}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 285
    move-result-object v4

    .line 286
    .line 287
    .line 288
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 289
    move-result-object v3

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 293
    move-result-object v1

    .line 294
    .line 295
    new-array v2, v8, [Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    invoke-static {v1, v2}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    .line 300
    sget-object v1, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker;->a:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$Companion;

    .line 301
    .line 302
    sget-object v2, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;->CHECK_NUM_RANGE:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;

    .line 303
    .line 304
    sget-object v3, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->NUM_RANGE_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v2, v3}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$Companion;->trackSpotOrderFail(Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;)V

    .line 308
    return v9

    .line 309
    .line 310
    :cond_2
    new-instance v7, Ljava/math/BigDecimal;

    .line 311
    .line 312
    sget-object v11, Lgf/n;->a:Lgf/n;

    .line 313
    .line 314
    .line 315
    invoke-interface {v5}, Lcom/kubi/core/spot/business/holder/f0;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 316
    move-result-object v5

    .line 317
    .line 318
    .line 319
    invoke-virtual {v5}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 320
    move-result-object v5

    .line 321
    .line 322
    .line 323
    invoke-virtual {v11, v5}, Lgf/n;->z(Ljava/lang/String;)D

    .line 324
    move-result-wide v11

    .line 325
    .line 326
    .line 327
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 328
    move-result-object v5

    .line 329
    .line 330
    .line 331
    invoke-direct {v7, v5}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 335
    move-result-object v1

    .line 336
    .line 337
    const-string v2, "multiply(...)"

    .line 338
    .line 339
    .line 340
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1, v7}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 344
    move-result v2

    .line 345
    .line 346
    if-gez v2, :cond_4

    .line 347
    .line 348
    new-instance v2, Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 352
    .line 353
    const-string v5, "\u5f53\u524d\u8ba2\u5355-\u6210\u4ea4\u989d\u6700\u5c0f\u503c\u6821\u9a8c\u5931\u8d25:\u5f53\u524d\u6210\u4ea4\u989d:"

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-static {v7}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 366
    move-result-object v1

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 370
    move-result-object v1

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    move-result-object v1

    .line 378
    .line 379
    .line 380
    invoke-static {v1, v4}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    .line 382
    if-eqz v3, :cond_3

    .line 383
    .line 384
    .line 385
    invoke-interface {v3, v7}, Lio/reactivex/functions/Consumer;->accept(Ljava/lang/Object;)V

    .line 386
    .line 387
    :cond_3
    sget-object v1, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker;->a:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$Companion;

    .line 388
    .line 389
    sget-object v2, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;->CHECK_TURNOVER:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;

    .line 390
    .line 391
    sget-object v3, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;->TURNOVER_ILLEGAL:Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, v2, v3}, Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$Companion;->trackSpotOrderFail(Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;)V

    .line 395
    return v9

    .line 396
    .line 397
    .line 398
    :cond_4
    invoke-interface {v6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 399
    move-result-object v1

    .line 400
    .line 401
    check-cast v1, Ljava/lang/Boolean;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 405
    move-result v1

    .line 406
    .line 407
    if-eqz v1, :cond_5

    .line 408
    .line 409
    const-string v1, "\u5f53\u524d\u8ba2\u5355-\u9650\u4ef7\u5355\u4f59\u989d\u4e0d\u8db3"

    .line 410
    .line 411
    .line 412
    invoke-static {v1, v4}, Lve/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    return v9

    .line 414
    :cond_5
    return v8
.end method
