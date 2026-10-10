.class public final Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;
.super Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.source "MarketCoinInfoAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
        "Lcom/kubi/spot/quote/market/info/MarketInfoEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0003J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;",
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;",
        "Lcom/kubi/spot/quote/market/info/MarketInfoEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "symbol",
        "",
        "data",
        "",
        "<init>",
        "(Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;Ljava/util/List;)V",
        "getFragment",
        "()Lcom/kubi/sdk/BaseFragment;",
        "getSymbol",
        "()Ljava/lang/String;",
        "convert",
        "",
        "helper",
        "item",
        "convertIntro",
        "convertFAQ",
        "convertMore",
        "SpotLib_googleRelease"
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
        "SMAP\nMarketCoinInfoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketCoinInfoAdapter.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfoAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,249:1\n1869#2,2:250\n827#2:257\n855#2,2:258\n827#2:260\n855#2,2:261\n827#2:263\n855#2,2:264\n827#2:266\n855#2,2:267\n774#2:269\n865#2,2:270\n1#3:252\n172#4,2:253\n172#4,2:255\n25#5,3:272\n*S KotlinDebug\n*F\n+ 1 MarketCoinInfoAdapter.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfoAdapter\n*L\n101#1:250,2\n199#1:257\n199#1:258,2\n205#1:260\n205#1:261,2\n211#1:263\n211#1:264,2\n217#1:266\n217#1:267,2\n223#1:269\n223#1:270,2\n173#1:253,2\n178#1:255,2\n109#1:272,3\n*E\n"
    }
.end annotation


# instance fields
.field public final i:Lcom/kubi/sdk/BaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/BaseFragment;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/kubi/spot/quote/market/info/MarketInfoEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "fragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "symbol"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p3}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 14
    .line 15
    iput-object p1, p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->i:Lcom/kubi/sdk/BaseFragment;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->j:Ljava/lang/String;

    .line 18
    const/4 p1, 0x0

    .line 19
    .line 20
    sget p2, Lcom/kubi/spot/R$layout;->bkucoin_item_coin_info_intro:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 24
    const/4 p1, 0x1

    .line 25
    .line 26
    sget p2, Lcom/kubi/spot/R$layout;->bkucoin_item_coin_info_faq:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 30
    const/4 p1, 0x3

    .line 31
    .line 32
    sget p2, Lcom/kubi/spot/R$layout;->bkucoin_item_coin_info_more:I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 36
    return-void
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public static synthetic g(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;Lcom/kubi/spot/entity/Tag;I)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->m(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;Lcom/kubi/spot/entity/Tag;I)Lkotlin/Unit;

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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public static synthetic h(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->n(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;Landroid/view/View;)V

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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public static synthetic i(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;Ljava/lang/String;I)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->p(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;Ljava/lang/String;I)Lkotlin/Unit;

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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public static final m(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;Lcom/kubi/spot/entity/Tag;I)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    const-string v0, "tag"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 9
    move-result-object p2

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/spot/entity/Tag;->getTitle()Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-string v1, "LabelContent"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const-string v1, "B5candle"

    .line 30
    .line 31
    const-string v2, "Label"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2, p2, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 35
    .line 36
    sget-object p2, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 37
    .line 38
    sget-object v0, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    const-class v1, Lzf/y;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v1, v0}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    move-result-object p2

    .line 49
    .line 50
    const-string v0, "coin_info_tag"

    .line 51
    .line 52
    const-string v1, "getChildFragmentManager(...)"

    .line 53
    .line 54
    if-eqz p2, :cond_0

    .line 55
    .line 56
    check-cast p2, Lzf/y;

    .line 57
    .line 58
    iget-object p0, p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->i:Lcom/kubi/sdk/BaseFragment;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 62
    move-result-object p0

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p2, p1, p0, v0}, Lzf/y;->a(Lcom/kubi/spot/entity/Tag;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 69
    goto :goto_0

    .line 70
    .line 71
    :cond_0
    sget-object p2, Lcom/kubi/spot/quote/market/info/MarketCoinInfoTagDialog;->b0:Lcom/kubi/spot/quote/market/info/MarketCoinInfoTagDialog$Companion;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p1}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoTagDialog$Companion;->newInstance(Lcom/kubi/spot/entity/Tag;)Lcom/kubi/spot/quote/market/info/MarketCoinInfoTagDialog;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    iget-object p0, p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->i:Lcom/kubi/sdk/BaseFragment;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 81
    move-result-object p0

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p0, v0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 88
    .line 89
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 90
    return-object p0
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public static final n(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;Landroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0xc

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B5candle"

    .line 6
    .line 7
    const-string v1, "MoreArticles"

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 13
    .line 14
    sget-object p2, Lcom/kubi/sdk/BaseActivity;->Companion:Lcom/kubi/sdk/BaseActivity$Companion;

    .line 15
    .line 16
    iget-object p0, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 17
    .line 18
    const-string v0, "mContext"

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/utils/h;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/kubi/utils/h;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/kubi/spot/quote/market/info/MarketInfoEntity;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    const-string v2, "coin"

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2, v1}, Lcom/kubi/utils/h;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/utils/h;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    const-string v1, "data"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/kubi/spot/quote/market/info/MarketInfoEntity;->getInfo()Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1, p1}, Lcom/kubi/utils/h;->e(Ljava/lang/String;Landroid/os/Parcelable;)Lcom/kubi/utils/h;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/kubi/utils/h;->a()Landroid/os/Bundle;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    const-class v0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, p0, v0, p1}, Lcom/kubi/sdk/BaseActivity$Companion;->launch(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 64
    return-void
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public static final p(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;Ljava/lang/String;I)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    const-string p2, "url"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p2, Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 11
    .line 12
    const-string v0, "symbol"

    .line 13
    .line 14
    iget-object p0, p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->j:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    .line 21
    const-string p0, "B5candle"

    .line 22
    .line 23
    const-string v0, "MoreInformation"

    .line 24
    .line 25
    const-string v1, "5"

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0, v1, p2}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    move-result p0

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    return-object p0

    .line 38
    :cond_0
    const/4 p0, 0x2

    .line 39
    const/4 p2, 0x0

    .line 40
    .line 41
    const-string v0, "http"

    .line 42
    const/4 v1, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v0, v1, p0, p2}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 46
    move-result p0

    .line 47
    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    new-instance p0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    const-string p2, "https://"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    :cond_1
    sget-object p0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 79
    move-result-object p0

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lay/a;->k()Z

    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 85
    return-object p0
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/spot/quote/market/info/MarketInfoEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;)V

    .line 6
    return-void
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
.end method

.method public j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;)V
    .locals 2
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/spot/quote/market/info/MarketInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/spot/quote/market/info/MarketInfoEntity;->getItemType()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    const/4 v1, 0x1

    .line 13
    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    const/4 v1, 0x3

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->o(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;)V

    .line 22
    return-void

    .line 23
    .line 24
    .line 25
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;->l(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;)V

    .line 30
    :cond_4
    :goto_0
    return-void
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
.end method

.method public final k(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;)V
    .locals 4

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$id;->cl_root:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    sget v1, Lcom/kubi/spot/R$id;->tv_title:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Landroid/widget/TextView;

    .line 17
    .line 18
    sget v2, Lcom/kubi/spot/R$id;->rv:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/kubi/spot/quote/market/info/MarketInfoEntity;->getInfo()Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

    .line 28
    move-result-object p2

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getFaqs()Ljava/util/List;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    move-result v3

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 63
    .line 64
    const/high16 v1, 0x41800000    # 16.0f

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 68
    move-result v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-nez v0, :cond_1

    .line 78
    const/4 v0, 0x1

    .line 79
    const/4 v1, 0x0

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v2, v0, v1}, Lcom/kubi/resources/t;->h(Landroidx/recyclerview/widget/RecyclerView;ZILjava/lang/Object;)V

    .line 83
    .line 84
    new-instance v0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoFAQAdapter;

    .line 85
    .line 86
    .line 87
    invoke-direct {v0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoFAQAdapter;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getFaqs()Ljava/util/List;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, Lcom/kubi/utils/extensions/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 102
    :cond_1
    return-void

    .line 103
    .line 104
    .line 105
    :cond_2
    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 109
    .line 110
    .line 111
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 124
    return-void
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
.end method

.method public final l(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;)V
    .locals 24
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/quote/market/info/MarketInfoEntity;->getInfo()Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    return-void

    .line 12
    .line 13
    :cond_0
    sget v3, Lcom/kubi/spot/R$id;->iv_icon:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    check-cast v3, Landroid/widget/ImageView;

    .line 20
    .line 21
    sget v4, Lcom/kubi/spot/R$id;->tv_name:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    check-cast v4, Landroid/widget/TextView;

    .line 28
    .line 29
    sget v5, Lcom/kubi/spot/R$id;->tv_rank:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 33
    move-result-object v5

    .line 34
    .line 35
    check-cast v5, Landroid/widget/TextView;

    .line 36
    .line 37
    sget v6, Lcom/kubi/spot/R$id;->tv_market_value:I

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 41
    move-result-object v6

    .line 42
    .line 43
    check-cast v6, Landroid/widget/TextView;

    .line 44
    .line 45
    sget v7, Lcom/kubi/spot/R$id;->tv_max_supply:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 49
    move-result-object v7

    .line 50
    .line 51
    check-cast v7, Landroid/widget/TextView;

    .line 52
    .line 53
    sget v8, Lcom/kubi/spot/R$id;->tv_circulating:I

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 57
    move-result-object v8

    .line 58
    .line 59
    check-cast v8, Landroid/widget/TextView;

    .line 60
    .line 61
    sget v9, Lcom/kubi/spot/R$id;->tv_ath:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 65
    move-result-object v9

    .line 66
    .line 67
    check-cast v9, Landroid/widget/TextView;

    .line 68
    .line 69
    sget v10, Lcom/kubi/spot/R$id;->ll_expand:I

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 73
    move-result-object v10

    .line 74
    .line 75
    check-cast v10, Landroid/widget/HorizontalScrollView;

    .line 76
    .line 77
    sget v11, Lcom/kubi/spot/R$id;->ll_tag:I

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 81
    move-result-object v11

    .line 82
    .line 83
    check-cast v11, Landroid/widget/LinearLayout;

    .line 84
    .line 85
    sget v12, Lcom/kubi/spot/R$id;->tv_title:I

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v12}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 89
    move-result-object v12

    .line 90
    .line 91
    check-cast v12, Landroid/widget/TextView;

    .line 92
    .line 93
    sget v13, Lcom/kubi/spot/R$id;->tv_content:I

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v13}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    check-cast v1, Lcom/kubi/resources/widget/SuffixTextView;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getLogo()Ljava/lang/String;

    .line 103
    move-result-object v13

    .line 104
    .line 105
    if-eqz v13, :cond_2

    .line 106
    .line 107
    .line 108
    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    .line 109
    move-result v13

    .line 110
    .line 111
    if-nez v13, :cond_1

    .line 112
    goto :goto_0

    .line 113
    .line 114
    .line 115
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    move-result-object v13

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getLogo()Ljava/lang/String;

    .line 120
    move-result-object v14

    .line 121
    .line 122
    .line 123
    invoke-static {v13, v14, v3}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 124
    .line 125
    :cond_2
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getCoinName()Ljava/lang/String;

    .line 132
    move-result-object v13

    .line 133
    .line 134
    .line 135
    invoke-static {v13}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    move-result-object v13

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const/16 v13, 0x28

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/quote/market/info/MarketInfoEntity;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 148
    move-result-object v13

    .line 149
    .line 150
    .line 151
    invoke-virtual {v13}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 152
    move-result-object v13

    .line 153
    .line 154
    .line 155
    invoke-virtual {v13}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 156
    move-result-object v13

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const/16 v13, 0x29

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    move-result-object v3

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/quote/market/info/MarketInfoEntity;->getTags()Lcom/kubi/spot/entity/TagEntity;

    .line 175
    move-result-object v3

    .line 176
    const/4 v4, 0x1

    .line 177
    .line 178
    if-eqz v3, :cond_4

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3}, Lcom/kubi/spot/entity/TagEntity;->getPlates()Ljava/util/List;

    .line 182
    move-result-object v3

    .line 183
    .line 184
    if-eqz v3, :cond_4

    .line 185
    .line 186
    .line 187
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    move-result-object v13

    .line 189
    .line 190
    .line 191
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    move-result v14

    .line 193
    .line 194
    if-eqz v14, :cond_3

    .line 195
    .line 196
    .line 197
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    move-result-object v14

    .line 199
    .line 200
    check-cast v14, Lcom/kubi/spot/entity/Tag;

    .line 201
    .line 202
    .line 203
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    move-result-object v15

    .line 205
    .line 206
    .line 207
    invoke-virtual {v14, v15}, Lcom/kubi/spot/entity/Tag;->setDisplayType(Ljava/lang/Integer;)V

    .line 208
    goto :goto_1

    .line 209
    .line 210
    .line 211
    :cond_3
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 212
    .line 213
    iget-object v13, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 214
    .line 215
    const-string v14, "mContext"

    .line 216
    .line 217
    .line 218
    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    new-instance v14, Lcom/kubi/spot/quote/market/info/i;

    .line 221
    .line 222
    .line 223
    invoke-direct {v14, v0}, Lcom/kubi/spot/quote/market/info/i;-><init>(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v11, v13, v3, v14}, Lf30/q;->f(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v10}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 233
    .line 234
    .line 235
    :cond_4
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getRank()Ljava/lang/String;

    .line 236
    move-result-object v3

    .line 237
    .line 238
    const-string v10, "--"

    .line 239
    .line 240
    if-eqz v3, :cond_5

    .line 241
    .line 242
    new-instance v11, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    .line 247
    const/16 v13, 0x23

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    move-result-object v3

    .line 258
    .line 259
    if-eqz v3, :cond_5

    .line 260
    goto :goto_2

    .line 261
    :cond_5
    move-object v3, v10

    .line 262
    .line 263
    .line 264
    :goto_2
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getMarketCap()Ljava/lang/String;

    .line 268
    move-result-object v3

    .line 269
    .line 270
    .line 271
    invoke-static {v3}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 272
    move-result-object v3

    .line 273
    .line 274
    const-string v5, "USD"

    .line 275
    const/4 v11, 0x0

    .line 276
    .line 277
    if-eqz v3, :cond_6

    .line 278
    .line 279
    .line 280
    invoke-static {v3, v5}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 281
    move-result-wide v13

    .line 282
    .line 283
    new-instance v3, Ljava/math/BigDecimal;

    .line 284
    .line 285
    .line 286
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 287
    move-result-object v13

    .line 288
    .line 289
    .line 290
    invoke-direct {v3, v13}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 291
    goto :goto_3

    .line 292
    :cond_6
    move-object v3, v11

    .line 293
    .line 294
    .line 295
    :goto_3
    invoke-static {v3, v4}, Lkf/a;->d(Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 296
    move-result-object v3

    .line 297
    .line 298
    .line 299
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getMaxSupply()Ljava/lang/String;

    .line 303
    move-result-object v3

    .line 304
    .line 305
    .line 306
    invoke-static {v3}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 307
    move-result-object v3

    .line 308
    const/4 v6, 0x0

    .line 309
    .line 310
    .line 311
    invoke-static {v3, v6, v4, v11}, Lkf/a;->e(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 312
    move-result-object v3

    .line 313
    .line 314
    .line 315
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getCirculatingSupply()Ljava/lang/String;

    .line 319
    move-result-object v3

    .line 320
    .line 321
    .line 322
    invoke-static {v3}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 323
    move-result-object v3

    .line 324
    .line 325
    .line 326
    invoke-static {v3, v6, v4, v11}, Lkf/a;->e(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 327
    move-result-object v3

    .line 328
    .line 329
    .line 330
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getAth()Ljava/lang/String;

    .line 334
    move-result-object v3

    .line 335
    .line 336
    .line 337
    invoke-static {v3}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 338
    move-result-object v3

    .line 339
    .line 340
    if-eqz v3, :cond_7

    .line 341
    .line 342
    .line 343
    invoke-static {v3, v5}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 344
    move-result-wide v13

    .line 345
    .line 346
    const/16 v22, 0x5f

    .line 347
    .line 348
    const/16 v23, 0x0

    .line 349
    const/4 v15, 0x0

    .line 350
    .line 351
    const/16 v16, 0x0

    .line 352
    .line 353
    const/16 v17, 0x0

    .line 354
    .line 355
    const/16 v18, 0x0

    .line 356
    .line 357
    const/16 v19, 0x0

    .line 358
    .line 359
    const/16 v20, 0x1

    .line 360
    .line 361
    const/16 v21, 0x0

    .line 362
    .line 363
    .line 364
    invoke-static/range {v13 .. v23}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 365
    move-result-object v3

    .line 366
    goto :goto_4

    .line 367
    :cond_7
    move-object v3, v11

    .line 368
    .line 369
    .line 370
    :goto_4
    invoke-static {v3, v10}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 371
    move-result-object v3

    .line 372
    .line 373
    .line 374
    invoke-virtual {v9, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getCurrencyIntroduction()Ljava/util/List;

    .line 378
    move-result-object v3

    .line 379
    .line 380
    if-eqz v3, :cond_d

    .line 381
    .line 382
    .line 383
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 384
    move-result v3

    .line 385
    .line 386
    if-eqz v3, :cond_8

    .line 387
    goto :goto_7

    .line 388
    .line 389
    .line 390
    :cond_8
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getIntroFirstTitleIndex()I

    .line 391
    move-result v3

    .line 392
    const/4 v5, -0x1

    .line 393
    .line 394
    if-ne v3, v5, :cond_9

    .line 395
    .line 396
    .line 397
    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    invoke-static {v12}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 401
    goto :goto_5

    .line 402
    .line 403
    .line 404
    :cond_9
    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    invoke-static {v12}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getCurrencyIntroduction()Ljava/util/List;

    .line 411
    move-result-object v5

    .line 412
    .line 413
    .line 414
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 415
    move-result-object v5

    .line 416
    .line 417
    check-cast v5, Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;

    .line 418
    .line 419
    if-eqz v5, :cond_a

    .line 420
    .line 421
    .line 422
    invoke-virtual {v5}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;->getText()Ljava/lang/String;

    .line 423
    move-result-object v11

    .line 424
    .line 425
    .line 426
    :cond_a
    invoke-virtual {v12, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 427
    .line 428
    :goto_5
    sget-object v5, Lcom/kubi/spot/quote/market/info/e;->a:Lcom/kubi/spot/quote/market/info/e;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getCurrencyIntroduction()Ljava/util/List;

    .line 432
    move-result-object v7

    .line 433
    .line 434
    .line 435
    invoke-virtual {v5, v7, v3}, Lcom/kubi/spot/quote/market/info/e;->o(Ljava/util/List;I)Landroid/text/SpannableStringBuilder;

    .line 436
    move-result-object v3

    .line 437
    .line 438
    .line 439
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 440
    move-result v5

    .line 441
    .line 442
    if-nez v5, :cond_b

    .line 443
    .line 444
    .line 445
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 449
    return-void

    .line 450
    .line 451
    .line 452
    :cond_b
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 456
    .line 457
    .line 458
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 459
    move-result-object v5

    .line 460
    .line 461
    .line 462
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getIntroTitleNum()I

    .line 469
    move-result v2

    .line 470
    .line 471
    if-le v2, v4, :cond_c

    .line 472
    goto :goto_6

    .line 473
    :cond_c
    move v4, v6

    .line 474
    .line 475
    .line 476
    :goto_6
    invoke-virtual {v1, v4}, Lcom/kubi/resources/widget/SuffixTextView;->k(Z)V

    .line 477
    .line 478
    new-instance v2, Lcom/kubi/spot/quote/market/info/j;

    .line 479
    .line 480
    move-object/from16 v3, p2

    .line 481
    .line 482
    .line 483
    invoke-direct {v2, v0, v3}, Lcom/kubi/spot/quote/market/info/j;-><init>(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/SuffixTextView;->onMoreClick(Landroid/view/View$OnClickListener;)V

    .line 487
    return-void

    .line 488
    .line 489
    .line 490
    :cond_d
    :goto_7
    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    invoke-static {v12}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 494
    .line 495
    .line 496
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 500
    return-void
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
.end method

.method public final o(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/quote/market/info/MarketInfoEntity;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/spot/quote/market/info/MarketInfoEntity;->getInfo()Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    sget v3, Lcom/kubi/spot/R$id;->layout_website:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 14
    move-result-object v3

    .line 15
    move-object v6, v3

    .line 16
    .line 17
    check-cast v6, Landroid/widget/LinearLayout;

    .line 18
    .line 19
    sget v3, Lcom/kubi/spot/R$id;->layout_doc:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    check-cast v3, Landroid/widget/LinearLayout;

    .line 26
    .line 27
    sget v4, Lcom/kubi/spot/R$id;->layout_explorer:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 31
    move-result-object v4

    .line 32
    move-object v15, v4

    .line 33
    .line 34
    check-cast v15, Landroid/widget/LinearLayout;

    .line 35
    .line 36
    sget v4, Lcom/kubi/spot/R$id;->layout_contract:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    move-object/from16 v16, v4

    .line 43
    .line 44
    check-cast v16, Landroid/widget/LinearLayout;

    .line 45
    .line 46
    sget v4, Lcom/kubi/spot/R$id;->layout_community:I

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    check-cast v1, Lcom/google/android/flexbox/FlexboxLayout;

    .line 53
    .line 54
    const/16 v17, 0x0

    .line 55
    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getWebsite()Ljava/util/List;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    new-instance v5, Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    move-result-object v4

    .line 72
    .line 73
    .line 74
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    move-result v7

    .line 76
    .line 77
    if-eqz v7, :cond_2

    .line 78
    .line 79
    .line 80
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    move-result-object v7

    .line 82
    move-object v8, v7

    .line 83
    .line 84
    check-cast v8, Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v8, :cond_0

    .line 87
    .line 88
    .line 89
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 90
    move-result v8

    .line 91
    .line 92
    if-nez v8, :cond_1

    .line 93
    goto :goto_0

    .line 94
    .line 95
    .line 96
    :cond_1
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    move-object v7, v5

    .line 99
    goto :goto_1

    .line 100
    .line 101
    :cond_3
    move-object/from16 v7, v17

    .line 102
    .line 103
    :goto_1
    const-string v12, "mContext"

    .line 104
    .line 105
    if-eqz v7, :cond_5

    .line 106
    .line 107
    .line 108
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 109
    move-result v4

    .line 110
    .line 111
    if-eqz v4, :cond_4

    .line 112
    goto :goto_2

    .line 113
    .line 114
    :cond_4
    sget-object v4, Lcom/kubi/spot/quote/market/info/e;->a:Lcom/kubi/spot/quote/market/info/e;

    .line 115
    .line 116
    iget-object v5, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 123
    const/4 v8, 0x0

    .line 124
    .line 125
    .line 126
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    move-result-object v8

    .line 128
    .line 129
    const/16 v10, 0x10

    .line 130
    const/4 v11, 0x0

    .line 131
    const/4 v9, 0x0

    .line 132
    .line 133
    .line 134
    invoke-static/range {v4 .. v11}, Lcom/kubi/spot/quote/market/info/e;->m(Lcom/kubi/spot/quote/market/info/e;Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;Ljava/lang/Integer;ZILjava/lang/Object;)V

    .line 135
    goto :goto_3

    .line 136
    .line 137
    :cond_5
    :goto_2
    sget-object v4, Lcom/kubi/spot/quote/market/info/e;->a:Lcom/kubi/spot/quote/market/info/e;

    .line 138
    .line 139
    iget-object v5, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4, v5, v6}, Lcom/kubi/spot/quote/market/info/e;->k(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 149
    .line 150
    :goto_3
    if-eqz v2, :cond_9

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getDoc()Ljava/util/List;

    .line 154
    move-result-object v4

    .line 155
    .line 156
    if-eqz v4, :cond_9

    .line 157
    .line 158
    new-instance v5, Ljava/util/ArrayList;

    .line 159
    .line 160
    .line 161
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    move-result-object v4

    .line 166
    .line 167
    .line 168
    :cond_6
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    move-result v6

    .line 170
    .line 171
    if-eqz v6, :cond_8

    .line 172
    .line 173
    .line 174
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    move-result-object v6

    .line 176
    move-object v7, v6

    .line 177
    .line 178
    check-cast v7, Ljava/lang/String;

    .line 179
    .line 180
    if-eqz v7, :cond_6

    .line 181
    .line 182
    .line 183
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 184
    move-result v7

    .line 185
    .line 186
    if-nez v7, :cond_7

    .line 187
    goto :goto_4

    .line 188
    .line 189
    .line 190
    :cond_7
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 191
    goto :goto_4

    .line 192
    :cond_8
    move-object v10, v5

    .line 193
    goto :goto_5

    .line 194
    .line 195
    :cond_9
    move-object/from16 v10, v17

    .line 196
    :goto_5
    const/4 v4, 0x1

    .line 197
    .line 198
    if-eqz v10, :cond_a

    .line 199
    .line 200
    .line 201
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 202
    move-result v5

    .line 203
    .line 204
    if-eqz v5, :cond_b

    .line 205
    :cond_a
    move-object v9, v3

    .line 206
    move-object v5, v12

    .line 207
    goto :goto_6

    .line 208
    .line 209
    :cond_b
    sget-object v7, Lcom/kubi/spot/quote/market/info/e;->a:Lcom/kubi/spot/quote/market/info/e;

    .line 210
    .line 211
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 212
    .line 213
    .line 214
    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 221
    move-result-object v11

    .line 222
    .line 223
    const/16 v13, 0x10

    .line 224
    const/4 v14, 0x0

    .line 225
    move-object v5, v12

    .line 226
    const/4 v12, 0x0

    .line 227
    move-object v9, v3

    .line 228
    .line 229
    .line 230
    invoke-static/range {v7 .. v14}, Lcom/kubi/spot/quote/market/info/e;->m(Lcom/kubi/spot/quote/market/info/e;Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;Ljava/lang/Integer;ZILjava/lang/Object;)V

    .line 231
    goto :goto_7

    .line 232
    .line 233
    :goto_6
    sget-object v3, Lcom/kubi/spot/quote/market/info/e;->a:Lcom/kubi/spot/quote/market/info/e;

    .line 234
    .line 235
    iget-object v6, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 236
    .line 237
    .line 238
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3, v6, v9}, Lcom/kubi/spot/quote/market/info/e;->k(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 245
    .line 246
    :goto_7
    if-eqz v2, :cond_f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getExplorer()Ljava/util/List;

    .line 250
    move-result-object v3

    .line 251
    .line 252
    if-eqz v3, :cond_f

    .line 253
    .line 254
    new-instance v6, Ljava/util/ArrayList;

    .line 255
    .line 256
    .line 257
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    move-result-object v3

    .line 262
    .line 263
    .line 264
    :cond_c
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    move-result v7

    .line 266
    .line 267
    if-eqz v7, :cond_e

    .line 268
    .line 269
    .line 270
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    move-result-object v7

    .line 272
    move-object v8, v7

    .line 273
    .line 274
    check-cast v8, Ljava/lang/String;

    .line 275
    .line 276
    if-eqz v8, :cond_c

    .line 277
    .line 278
    .line 279
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 280
    move-result v8

    .line 281
    .line 282
    if-nez v8, :cond_d

    .line 283
    goto :goto_8

    .line 284
    .line 285
    .line 286
    :cond_d
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 287
    goto :goto_8

    .line 288
    :cond_e
    move-object v10, v6

    .line 289
    goto :goto_9

    .line 290
    .line 291
    :cond_f
    move-object/from16 v10, v17

    .line 292
    .line 293
    :goto_9
    if-eqz v10, :cond_10

    .line 294
    .line 295
    .line 296
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 297
    move-result v3

    .line 298
    .line 299
    if-eqz v3, :cond_11

    .line 300
    :cond_10
    move-object v9, v15

    .line 301
    goto :goto_a

    .line 302
    .line 303
    :cond_11
    sget-object v7, Lcom/kubi/spot/quote/market/info/e;->a:Lcom/kubi/spot/quote/market/info/e;

    .line 304
    .line 305
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 306
    .line 307
    .line 308
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 312
    const/4 v3, 0x2

    .line 313
    .line 314
    .line 315
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    move-result-object v11

    .line 317
    .line 318
    const/16 v13, 0x10

    .line 319
    const/4 v14, 0x0

    .line 320
    const/4 v12, 0x0

    .line 321
    move-object v9, v15

    .line 322
    .line 323
    .line 324
    invoke-static/range {v7 .. v14}, Lcom/kubi/spot/quote/market/info/e;->m(Lcom/kubi/spot/quote/market/info/e;Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;Ljava/lang/Integer;ZILjava/lang/Object;)V

    .line 325
    goto :goto_b

    .line 326
    .line 327
    :goto_a
    sget-object v3, Lcom/kubi/spot/quote/market/info/e;->a:Lcom/kubi/spot/quote/market/info/e;

    .line 328
    .line 329
    iget-object v6, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 330
    .line 331
    .line 332
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3, v6, v9}, Lcom/kubi/spot/quote/market/info/e;->k(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 339
    .line 340
    :goto_b
    if-eqz v2, :cond_15

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getContract()Ljava/util/List;

    .line 344
    move-result-object v3

    .line 345
    .line 346
    if-eqz v3, :cond_15

    .line 347
    .line 348
    new-instance v6, Ljava/util/ArrayList;

    .line 349
    .line 350
    .line 351
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 355
    move-result-object v3

    .line 356
    .line 357
    .line 358
    :cond_12
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    move-result v7

    .line 360
    .line 361
    if-eqz v7, :cond_14

    .line 362
    .line 363
    .line 364
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    move-result-object v7

    .line 366
    move-object v8, v7

    .line 367
    .line 368
    check-cast v8, Ljava/lang/String;

    .line 369
    .line 370
    if-eqz v8, :cond_12

    .line 371
    .line 372
    .line 373
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 374
    move-result v8

    .line 375
    .line 376
    if-nez v8, :cond_13

    .line 377
    goto :goto_c

    .line 378
    .line 379
    .line 380
    :cond_13
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 381
    goto :goto_c

    .line 382
    :cond_14
    move-object v10, v6

    .line 383
    goto :goto_d

    .line 384
    .line 385
    :cond_15
    move-object/from16 v10, v17

    .line 386
    .line 387
    :goto_d
    if-eqz v10, :cond_16

    .line 388
    .line 389
    .line 390
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 391
    move-result v3

    .line 392
    .line 393
    if-eqz v3, :cond_17

    .line 394
    .line 395
    :cond_16
    move-object/from16 v9, v16

    .line 396
    goto :goto_e

    .line 397
    .line 398
    :cond_17
    sget-object v7, Lcom/kubi/spot/quote/market/info/e;->a:Lcom/kubi/spot/quote/market/info/e;

    .line 399
    .line 400
    iget-object v8, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 401
    .line 402
    .line 403
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 407
    .line 408
    const/16 v12, 0x8

    .line 409
    const/4 v13, 0x0

    .line 410
    const/4 v11, 0x0

    .line 411
    .line 412
    move-object/from16 v9, v16

    .line 413
    .line 414
    .line 415
    invoke-static/range {v7 .. v13}, Lcom/kubi/spot/quote/market/info/e;->i(Lcom/kubi/spot/quote/market/info/e;Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;ZILjava/lang/Object;)V

    .line 416
    goto :goto_f

    .line 417
    .line 418
    :goto_e
    sget-object v3, Lcom/kubi/spot/quote/market/info/e;->a:Lcom/kubi/spot/quote/market/info/e;

    .line 419
    .line 420
    iget-object v6, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 421
    .line 422
    .line 423
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3, v6, v9}, Lcom/kubi/spot/quote/market/info/e;->k(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 430
    .line 431
    :goto_f
    if-eqz v2, :cond_21

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getCodeAndCommunity()Ljava/util/List;

    .line 435
    move-result-object v2

    .line 436
    .line 437
    if-eqz v2, :cond_21

    .line 438
    .line 439
    new-instance v3, Ljava/util/ArrayList;

    .line 440
    .line 441
    .line 442
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 443
    .line 444
    .line 445
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 446
    move-result-object v2

    .line 447
    .line 448
    .line 449
    :cond_18
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 450
    move-result v6

    .line 451
    .line 452
    if-eqz v6, :cond_22

    .line 453
    .line 454
    .line 455
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 456
    move-result-object v6

    .line 457
    move-object v7, v6

    .line 458
    .line 459
    check-cast v7, Ljava/lang/String;

    .line 460
    .line 461
    if-eqz v7, :cond_19

    .line 462
    .line 463
    const-string v8, "facebook"

    .line 464
    .line 465
    .line 466
    invoke-static {v7, v8, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 467
    move-result v8

    .line 468
    .line 469
    .line 470
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 471
    move-result-object v8

    .line 472
    goto :goto_11

    .line 473
    .line 474
    :cond_19
    move-object/from16 v8, v17

    .line 475
    .line 476
    .line 477
    :goto_11
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 478
    move-result v8

    .line 479
    .line 480
    if-nez v8, :cond_20

    .line 481
    .line 482
    if-eqz v7, :cond_1a

    .line 483
    .line 484
    const-string v8, "twitter"

    .line 485
    .line 486
    .line 487
    invoke-static {v7, v8, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 488
    move-result v8

    .line 489
    .line 490
    .line 491
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 492
    move-result-object v8

    .line 493
    goto :goto_12

    .line 494
    .line 495
    :cond_1a
    move-object/from16 v8, v17

    .line 496
    .line 497
    .line 498
    :goto_12
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 499
    move-result v8

    .line 500
    .line 501
    if-nez v8, :cond_20

    .line 502
    .line 503
    if-eqz v7, :cond_1b

    .line 504
    .line 505
    const-string v8, "t.me"

    .line 506
    .line 507
    .line 508
    invoke-static {v7, v8, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 509
    move-result v8

    .line 510
    .line 511
    .line 512
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 513
    move-result-object v8

    .line 514
    goto :goto_13

    .line 515
    .line 516
    :cond_1b
    move-object/from16 v8, v17

    .line 517
    .line 518
    .line 519
    :goto_13
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 520
    move-result v8

    .line 521
    .line 522
    if-nez v8, :cond_20

    .line 523
    .line 524
    if-eqz v7, :cond_1c

    .line 525
    .line 526
    const-string v8, "telegram.me"

    .line 527
    .line 528
    .line 529
    invoke-static {v7, v8, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 530
    move-result v8

    .line 531
    .line 532
    .line 533
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 534
    move-result-object v8

    .line 535
    goto :goto_14

    .line 536
    .line 537
    :cond_1c
    move-object/from16 v8, v17

    .line 538
    .line 539
    .line 540
    :goto_14
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 541
    move-result v8

    .line 542
    .line 543
    if-nez v8, :cond_20

    .line 544
    .line 545
    if-eqz v7, :cond_1d

    .line 546
    .line 547
    const-string v8, "medium"

    .line 548
    .line 549
    .line 550
    invoke-static {v7, v8, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 551
    move-result v8

    .line 552
    .line 553
    .line 554
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 555
    move-result-object v8

    .line 556
    goto :goto_15

    .line 557
    .line 558
    :cond_1d
    move-object/from16 v8, v17

    .line 559
    .line 560
    .line 561
    :goto_15
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 562
    move-result v8

    .line 563
    .line 564
    if-nez v8, :cond_20

    .line 565
    .line 566
    if-eqz v7, :cond_1e

    .line 567
    .line 568
    const-string v8, "reddit"

    .line 569
    .line 570
    .line 571
    invoke-static {v7, v8, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 572
    move-result v8

    .line 573
    .line 574
    .line 575
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 576
    move-result-object v8

    .line 577
    goto :goto_16

    .line 578
    .line 579
    :cond_1e
    move-object/from16 v8, v17

    .line 580
    .line 581
    .line 582
    :goto_16
    invoke-static {v8}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 583
    move-result v8

    .line 584
    .line 585
    if-nez v8, :cond_20

    .line 586
    .line 587
    if-eqz v7, :cond_1f

    .line 588
    .line 589
    const-string v8, "github"

    .line 590
    .line 591
    .line 592
    invoke-static {v7, v8, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 593
    move-result v7

    .line 594
    .line 595
    .line 596
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 597
    move-result-object v7

    .line 598
    goto :goto_17

    .line 599
    .line 600
    :cond_1f
    move-object/from16 v7, v17

    .line 601
    .line 602
    .line 603
    :goto_17
    invoke-static {v7}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 604
    move-result v7

    .line 605
    .line 606
    if-eqz v7, :cond_18

    .line 607
    .line 608
    .line 609
    :cond_20
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 610
    .line 611
    goto/16 :goto_10

    .line 612
    .line 613
    :cond_21
    move-object/from16 v3, v17

    .line 614
    .line 615
    :cond_22
    if-eqz v3, :cond_24

    .line 616
    .line 617
    .line 618
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 619
    move-result v2

    .line 620
    .line 621
    if-eqz v2, :cond_23

    .line 622
    goto :goto_18

    .line 623
    .line 624
    .line 625
    :cond_23
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 626
    .line 627
    iget-object v2, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 628
    .line 629
    .line 630
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 631
    .line 632
    new-instance v4, Lcom/kubi/spot/quote/market/info/h;

    .line 633
    .line 634
    .line 635
    invoke-direct {v4, v0}, Lcom/kubi/spot/quote/market/info/h;-><init>(Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;)V

    .line 636
    .line 637
    .line 638
    invoke-static {v1, v2, v3, v4}, Lf30/q;->d(Lcom/google/android/flexbox/FlexboxLayout;Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V

    .line 639
    return-void

    .line 640
    .line 641
    :cond_24
    :goto_18
    sget-object v2, Lcom/kubi/spot/quote/market/info/e;->a:Lcom/kubi/spot/quote/market/info/e;

    .line 642
    .line 643
    iget-object v3, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 644
    .line 645
    .line 646
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v2, v3, v1}, Lcom/kubi/spot/quote/market/info/e;->k(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 653
    return-void
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
.end method
