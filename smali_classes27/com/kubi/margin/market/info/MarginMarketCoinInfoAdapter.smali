.class public final Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;
.super Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.source "MarginMarketCoinInfoAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
        "Lcom/kubi/margin/market/info/MarketInfoEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001c\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0003J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;",
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;",
        "Lcom/kubi/margin/market/info/MarketInfoEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "data",
        "",
        "<init>",
        "(Lcom/kubi/sdk/BaseFragment;Ljava/util/List;)V",
        "getFragment",
        "()Lcom/kubi/sdk/BaseFragment;",
        "convert",
        "",
        "helper",
        "item",
        "convertIntro",
        "convertFAQ",
        "convertMore",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMarginMarketCoinInfoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketCoinInfoAdapter.kt\ncom/kubi/margin/market/info/MarginMarketCoinInfoAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,228:1\n1869#2,2:229\n827#2:236\n855#2,2:237\n827#2:239\n855#2,2:240\n827#2:242\n855#2,2:243\n827#2:245\n855#2,2:246\n774#2:248\n865#2,2:249\n1#3:231\n172#4,2:232\n172#4,2:234\n*S KotlinDebug\n*F\n+ 1 MarginMarketCoinInfoAdapter.kt\ncom/kubi/margin/market/info/MarginMarketCoinInfoAdapter\n*L\n88#1:229,2\n185#1:236\n185#1:237,2\n191#1:239\n191#1:240,2\n197#1:242\n197#1:243,2\n203#1:245\n203#1:246,2\n209#1:248\n209#1:249,2\n159#1:232,2\n164#1:234,2\n*E\n"
    }
.end annotation


# instance fields
.field public final i:Lcom/kubi/sdk/BaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/sdk/BaseFragment;Ljava/util/List;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/BaseFragment;",
            "Ljava/util/List<",
            "Lcom/kubi/margin/market/info/MarketInfoEntity;",
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
    .line 8
    invoke-direct {p0, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;->i:Lcom/kubi/sdk/BaseFragment;

    .line 11
    const/4 p1, 0x0

    .line 12
    .line 13
    sget p2, Lcom/kubi/margin/R$layout;->bmargin_item_coin_info_intro:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 17
    const/4 p1, 0x1

    .line 18
    .line 19
    sget p2, Lcom/kubi/margin/R$layout;->bmargin_item_coin_info_faq:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 23
    const/4 p1, 0x3

    .line 24
    .line 25
    sget p2, Lcom/kubi/margin/R$layout;->bmargin_item_coin_info_more:I

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 29
    return-void
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
.end method

.method public static synthetic g(Lcom/kubi/resources/widget/SuffixTextView;Lcom/kubi/margin/market/info/MarketInfoEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;->n(Lcom/kubi/resources/widget/SuffixTextView;Lcom/kubi/margin/market/info/MarketInfoEntity;Landroid/view/View;)V

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
.end method

.method public static synthetic h(Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;Lcom/kubi/margin/entity/Tag;I)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;->m(Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;Lcom/kubi/margin/entity/Tag;I)Lkotlin/Unit;

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
.end method

.method public static synthetic i(Ljava/lang/String;I)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;->p(Ljava/lang/String;I)Lkotlin/Unit;

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
.end method

.method public static final m(Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;Lcom/kubi/margin/entity/Tag;I)Lkotlin/Unit;
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
    invoke-virtual {p1}, Lcom/kubi/margin/entity/Tag;->getTitle()Ljava/lang/String;

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
    const-string v1, "B4candle"

    .line 30
    .line 31
    const-string v2, "Label"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2, p2, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 35
    .line 36
    sget-object p2, Lcom/kubi/margin/market/info/MarginMarketCoinInfoTagDialog;->b0:Lcom/kubi/margin/market/info/MarginMarketCoinInfoTagDialog$Companion;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p1}, Lcom/kubi/margin/market/info/MarginMarketCoinInfoTagDialog$Companion;->newInstance(Lcom/kubi/margin/entity/Tag;)Lcom/kubi/margin/market/info/MarginMarketCoinInfoTagDialog;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    iget-object p0, p0, Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;->i:Lcom/kubi/sdk/BaseFragment;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 46
    move-result-object p0

    .line 47
    .line 48
    const-string p2, "getChildFragmentManager(...)"

    .line 49
    .line 50
    .line 51
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    const-string p2, "coin_info_tag"

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p0, p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    return-object p0
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
.end method

.method public static final n(Lcom/kubi/resources/widget/SuffixTextView;Lcom/kubi/margin/market/info/MarketInfoEntity;Landroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0xc

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4candle"

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
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    const-string v0, "getContext(...)"

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/utils/h;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Lcom/kubi/utils/h;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/kubi/margin/market/info/MarketInfoEntity;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    const-string v2, "coin"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Lcom/kubi/utils/h;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/utils/h;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    const-string v1, "data"

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/kubi/margin/market/info/MarketInfoEntity;->getInfo()Lcom/kubi/margin/market/info/MarketCoinInfo;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, p1}, Lcom/kubi/utils/h;->e(Ljava/lang/String;Landroid/os/Parcelable;)Lcom/kubi/utils/h;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/kubi/utils/h;->a()Landroid/os/Bundle;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    const-class v0, Lcom/kubi/margin/market/info/MarginMarketCoinInfoDetailFragment;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p0, v0, p1}, Lcom/kubi/sdk/BaseActivity$Companion;->launch(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 66
    return-void
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
.end method

.method public static final p(Ljava/lang/String;I)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const-string p1, "url"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v4, 0x8

    .line 8
    const/4 v5, 0x0

    .line 9
    .line 10
    const-string v0, "B4candle"

    .line 11
    .line 12
    const-string v1, "MoreInformation"

    .line 13
    .line 14
    const-string v2, "5"

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 19
    .line 20
    sget-object p1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p0}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lay/a;->k()Z

    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    return-object p0
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
.end method


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/margin/market/info/MarketInfoEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;->j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/market/info/MarketInfoEntity;)V

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
.end method

.method public j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/market/info/MarketInfoEntity;)V
    .locals 2
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/margin/market/info/MarketInfoEntity;
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
    invoke-virtual {p2}, Lcom/kubi/margin/market/info/MarketInfoEntity;->getItemType()I

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;->o(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/market/info/MarketInfoEntity;)V

    .line 22
    return-void

    .line 23
    .line 24
    .line 25
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/market/info/MarketInfoEntity;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;->l(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/market/info/MarketInfoEntity;)V

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
.end method

.method public final k(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/market/info/MarketInfoEntity;)V
    .locals 4

    .line 1
    .line 2
    sget v0, Lcom/kubi/margin/R$id;->cl_root:I

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
    sget v1, Lcom/kubi/margin/R$id;->tv_title:I

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
    sget v2, Lcom/kubi/margin/R$id;->rv:I

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
    invoke-virtual {p2}, Lcom/kubi/margin/market/info/MarketInfoEntity;->getInfo()Lcom/kubi/margin/market/info/MarketCoinInfo;

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
    invoke-virtual {p2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getFaqs()Ljava/util/List;

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
    new-instance v0, Lcom/kubi/margin/market/info/MarginMarketCoinInfoFAQAdapter;

    .line 85
    .line 86
    .line 87
    invoke-direct {v0}, Lcom/kubi/margin/market/info/MarginMarketCoinInfoFAQAdapter;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getFaqs()Ljava/util/List;

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
.end method

.method public final l(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/market/info/MarketInfoEntity;)V
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
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/margin/market/info/MarketInfoEntity;->getInfo()Lcom/kubi/margin/market/info/MarketCoinInfo;

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
    sget v3, Lcom/kubi/margin/R$id;->iv_icon:I

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
    sget v4, Lcom/kubi/margin/R$id;->tv_name:I

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
    sget v5, Lcom/kubi/margin/R$id;->tv_rank:I

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
    sget v6, Lcom/kubi/margin/R$id;->tv_market_value:I

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
    sget v7, Lcom/kubi/margin/R$id;->tv_max_supply:I

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
    sget v8, Lcom/kubi/margin/R$id;->tv_circulating:I

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
    sget v9, Lcom/kubi/margin/R$id;->tv_ath:I

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
    sget v10, Lcom/kubi/margin/R$id;->ll_expand:I

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
    sget v11, Lcom/kubi/margin/R$id;->ll_tag:I

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
    sget v12, Lcom/kubi/margin/R$id;->tv_title:I

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
    sget v13, Lcom/kubi/margin/R$id;->tv_content:I

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getLogo()Ljava/lang/String;

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getLogo()Ljava/lang/String;

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getCoinName()Ljava/lang/String;

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
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/margin/market/info/MarketInfoEntity;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

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
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/margin/market/info/MarketInfoEntity;->getTags()Lcom/kubi/margin/entity/TagEntity;

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
    invoke-virtual {v3}, Lcom/kubi/margin/entity/TagEntity;->getPlates()Ljava/util/List;

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
    check-cast v14, Lcom/kubi/margin/entity/Tag;

    .line 201
    .line 202
    .line 203
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    move-result-object v15

    .line 205
    .line 206
    .line 207
    invoke-virtual {v14, v15}, Lcom/kubi/margin/entity/Tag;->setDisplayType(Ljava/lang/Integer;)V

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
    new-instance v14, Lcom/kubi/margin/market/info/f;

    .line 221
    .line 222
    .line 223
    invoke-direct {v14, v0}, Lcom/kubi/margin/market/info/f;-><init>(Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v11, v13, v3, v14}, Lvp/e;->e(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getRank()Ljava/lang/String;

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getMarketCap()Ljava/lang/String;

    .line 268
    move-result-object v3

    .line 269
    .line 270
    .line 271
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getMaxSupply()Ljava/lang/String;

    .line 303
    move-result-object v3

    .line 304
    .line 305
    .line 306
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getCirculatingSupply()Ljava/lang/String;

    .line 319
    move-result-object v3

    .line 320
    .line 321
    .line 322
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getAth()Ljava/lang/String;

    .line 334
    move-result-object v3

    .line 335
    .line 336
    .line 337
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->k(Ljava/lang/String;)Ljava/math/BigDecimal;

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getCurrencyIntroduction()Ljava/util/List;

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getIntroFirstTitleIndex()I

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getCurrencyIntroduction()Ljava/util/List;

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
    check-cast v5, Lcom/kubi/margin/market/info/MarketCoinInfoParagraph;

    .line 418
    .line 419
    if-eqz v5, :cond_a

    .line 420
    .line 421
    .line 422
    invoke-virtual {v5}, Lcom/kubi/margin/market/info/MarketCoinInfoParagraph;->getText()Ljava/lang/String;

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
    sget-object v5, Lcom/kubi/margin/market/info/e;->a:Lcom/kubi/margin/market/info/e;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getCurrencyIntroduction()Ljava/util/List;

    .line 432
    move-result-object v7

    .line 433
    .line 434
    .line 435
    invoke-virtual {v5, v7, v3}, Lcom/kubi/margin/market/info/e;->m(Ljava/util/List;I)Landroid/text/SpannableStringBuilder;

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
    invoke-virtual {v2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getIntroTitleNum()I

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
    new-instance v2, Lcom/kubi/margin/market/info/g;

    .line 479
    .line 480
    move-object/from16 v3, p2

    .line 481
    .line 482
    .line 483
    invoke-direct {v2, v1, v3}, Lcom/kubi/margin/market/info/g;-><init>(Lcom/kubi/resources/widget/SuffixTextView;Lcom/kubi/margin/market/info/MarketInfoEntity;)V

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
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
.end method

.method public final o(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/market/info/MarketInfoEntity;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/kubi/margin/market/info/MarketInfoEntity;->getInfo()Lcom/kubi/margin/market/info/MarketCoinInfo;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    sget v0, Lcom/kubi/margin/R$id;->layout_website:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Landroid/widget/LinearLayout;

    .line 13
    .line 14
    sget v1, Lcom/kubi/margin/R$id;->layout_doc:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Landroid/widget/LinearLayout;

    .line 21
    .line 22
    sget v2, Lcom/kubi/margin/R$id;->layout_explorer:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    check-cast v2, Landroid/widget/LinearLayout;

    .line 29
    .line 30
    sget v3, Lcom/kubi/margin/R$id;->layout_contract:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    check-cast v3, Landroid/widget/LinearLayout;

    .line 37
    .line 38
    sget v4, Lcom/kubi/margin/R$id;->layout_community:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    check-cast p1, Lcom/google/android/flexbox/FlexboxLayout;

    .line 45
    const/4 v4, 0x0

    .line 46
    .line 47
    if-eqz p2, :cond_2

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getWebsite()Ljava/util/List;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    new-instance v6, Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    move-result-object v5

    .line 63
    .line 64
    .line 65
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    move-result v7

    .line 67
    .line 68
    if-eqz v7, :cond_3

    .line 69
    .line 70
    .line 71
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    move-result-object v7

    .line 73
    move-object v8, v7

    .line 74
    .line 75
    check-cast v8, Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v8, :cond_0

    .line 78
    .line 79
    .line 80
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 81
    move-result v8

    .line 82
    .line 83
    if-nez v8, :cond_1

    .line 84
    goto :goto_0

    .line 85
    .line 86
    .line 87
    :cond_1
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    move-object v6, v4

    .line 90
    .line 91
    :cond_3
    const-string v5, "mContext"

    .line 92
    .line 93
    if-eqz v6, :cond_5

    .line 94
    .line 95
    .line 96
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 97
    move-result v7

    .line 98
    .line 99
    if-eqz v7, :cond_4

    .line 100
    goto :goto_1

    .line 101
    .line 102
    :cond_4
    sget-object v7, Lcom/kubi/margin/market/info/e;->a:Lcom/kubi/margin/market/info/e;

    .line 103
    .line 104
    iget-object v8, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 111
    const/4 v9, 0x0

    .line 112
    .line 113
    .line 114
    invoke-virtual {v7, v8, v0, v6, v9}, Lcom/kubi/margin/market/info/e;->k(Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;I)V

    .line 115
    goto :goto_2

    .line 116
    .line 117
    :cond_5
    :goto_1
    sget-object v6, Lcom/kubi/margin/market/info/e;->a:Lcom/kubi/margin/market/info/e;

    .line 118
    .line 119
    iget-object v7, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v7, v0}, Lcom/kubi/margin/market/info/e;->j(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 129
    .line 130
    :goto_2
    if-eqz p2, :cond_8

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getDoc()Ljava/util/List;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    new-instance v6, Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    move-result v7

    .line 150
    .line 151
    if-eqz v7, :cond_9

    .line 152
    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    move-result-object v7

    .line 156
    move-object v8, v7

    .line 157
    .line 158
    check-cast v8, Ljava/lang/String;

    .line 159
    .line 160
    if-eqz v8, :cond_6

    .line 161
    .line 162
    .line 163
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 164
    move-result v8

    .line 165
    .line 166
    if-nez v8, :cond_7

    .line 167
    goto :goto_3

    .line 168
    .line 169
    .line 170
    :cond_7
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 171
    goto :goto_3

    .line 172
    :cond_8
    move-object v6, v4

    .line 173
    :cond_9
    const/4 v0, 0x1

    .line 174
    .line 175
    if-eqz v6, :cond_b

    .line 176
    .line 177
    .line 178
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 179
    move-result v7

    .line 180
    .line 181
    if-eqz v7, :cond_a

    .line 182
    goto :goto_4

    .line 183
    .line 184
    :cond_a
    sget-object v7, Lcom/kubi/margin/market/info/e;->a:Lcom/kubi/margin/market/info/e;

    .line 185
    .line 186
    iget-object v8, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 187
    .line 188
    .line 189
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7, v8, v1, v6, v0}, Lcom/kubi/margin/market/info/e;->k(Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;I)V

    .line 196
    goto :goto_5

    .line 197
    .line 198
    :cond_b
    :goto_4
    sget-object v6, Lcom/kubi/margin/market/info/e;->a:Lcom/kubi/margin/market/info/e;

    .line 199
    .line 200
    iget-object v7, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 201
    .line 202
    .line 203
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v6, v7, v1}, Lcom/kubi/margin/market/info/e;->j(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 210
    .line 211
    :goto_5
    if-eqz p2, :cond_e

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getExplorer()Ljava/util/List;

    .line 215
    move-result-object v1

    .line 216
    .line 217
    if-eqz v1, :cond_e

    .line 218
    .line 219
    new-instance v6, Ljava/util/ArrayList;

    .line 220
    .line 221
    .line 222
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 226
    move-result-object v1

    .line 227
    .line 228
    .line 229
    :cond_c
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    move-result v7

    .line 231
    .line 232
    if-eqz v7, :cond_f

    .line 233
    .line 234
    .line 235
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    move-result-object v7

    .line 237
    move-object v8, v7

    .line 238
    .line 239
    check-cast v8, Ljava/lang/String;

    .line 240
    .line 241
    if-eqz v8, :cond_c

    .line 242
    .line 243
    .line 244
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 245
    move-result v8

    .line 246
    .line 247
    if-nez v8, :cond_d

    .line 248
    goto :goto_6

    .line 249
    .line 250
    .line 251
    :cond_d
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 252
    goto :goto_6

    .line 253
    :cond_e
    move-object v6, v4

    .line 254
    .line 255
    :cond_f
    if-eqz v6, :cond_11

    .line 256
    .line 257
    .line 258
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 259
    move-result v1

    .line 260
    .line 261
    if-eqz v1, :cond_10

    .line 262
    goto :goto_7

    .line 263
    .line 264
    :cond_10
    sget-object v1, Lcom/kubi/margin/market/info/e;->a:Lcom/kubi/margin/market/info/e;

    .line 265
    .line 266
    iget-object v7, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 267
    .line 268
    .line 269
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 273
    const/4 v8, 0x2

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v7, v2, v6, v8}, Lcom/kubi/margin/market/info/e;->k(Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;I)V

    .line 277
    goto :goto_8

    .line 278
    .line 279
    :cond_11
    :goto_7
    sget-object v1, Lcom/kubi/margin/market/info/e;->a:Lcom/kubi/margin/market/info/e;

    .line 280
    .line 281
    iget-object v6, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 282
    .line 283
    .line 284
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, v6, v2}, Lcom/kubi/margin/market/info/e;->j(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 291
    .line 292
    :goto_8
    if-eqz p2, :cond_14

    .line 293
    .line 294
    .line 295
    invoke-virtual {p2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getContract()Ljava/util/List;

    .line 296
    move-result-object v1

    .line 297
    .line 298
    if-eqz v1, :cond_14

    .line 299
    .line 300
    new-instance v2, Ljava/util/ArrayList;

    .line 301
    .line 302
    .line 303
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 307
    move-result-object v1

    .line 308
    .line 309
    .line 310
    :cond_12
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    move-result v6

    .line 312
    .line 313
    if-eqz v6, :cond_15

    .line 314
    .line 315
    .line 316
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    move-result-object v6

    .line 318
    move-object v7, v6

    .line 319
    .line 320
    check-cast v7, Ljava/lang/String;

    .line 321
    .line 322
    if-eqz v7, :cond_12

    .line 323
    .line 324
    .line 325
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 326
    move-result v7

    .line 327
    .line 328
    if-nez v7, :cond_13

    .line 329
    goto :goto_9

    .line 330
    .line 331
    .line 332
    :cond_13
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 333
    goto :goto_9

    .line 334
    :cond_14
    move-object v2, v4

    .line 335
    .line 336
    :cond_15
    if-eqz v2, :cond_17

    .line 337
    .line 338
    .line 339
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 340
    move-result v1

    .line 341
    .line 342
    if-eqz v1, :cond_16

    .line 343
    goto :goto_a

    .line 344
    .line 345
    :cond_16
    sget-object v1, Lcom/kubi/margin/market/info/e;->a:Lcom/kubi/margin/market/info/e;

    .line 346
    .line 347
    iget-object v6, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 348
    .line 349
    .line 350
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1, v6, v3, v2}, Lcom/kubi/margin/market/info/e;->h(Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;)V

    .line 357
    goto :goto_b

    .line 358
    .line 359
    :cond_17
    :goto_a
    sget-object v1, Lcom/kubi/margin/market/info/e;->a:Lcom/kubi/margin/market/info/e;

    .line 360
    .line 361
    iget-object v2, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 362
    .line 363
    .line 364
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1, v2, v3}, Lcom/kubi/margin/market/info/e;->j(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 371
    .line 372
    :goto_b
    if-eqz p2, :cond_22

    .line 373
    .line 374
    .line 375
    invoke-virtual {p2}, Lcom/kubi/margin/market/info/MarketCoinInfo;->getCodeAndCommunity()Ljava/util/List;

    .line 376
    move-result-object p2

    .line 377
    .line 378
    if-eqz p2, :cond_22

    .line 379
    .line 380
    new-instance v1, Ljava/util/ArrayList;

    .line 381
    .line 382
    .line 383
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 384
    .line 385
    .line 386
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 387
    move-result-object p2

    .line 388
    .line 389
    .line 390
    :cond_18
    :goto_c
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    move-result v2

    .line 392
    .line 393
    if-eqz v2, :cond_21

    .line 394
    .line 395
    .line 396
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 397
    move-result-object v2

    .line 398
    move-object v3, v2

    .line 399
    .line 400
    check-cast v3, Ljava/lang/String;

    .line 401
    .line 402
    if-eqz v3, :cond_19

    .line 403
    .line 404
    const-string v6, "facebook"

    .line 405
    .line 406
    .line 407
    invoke-static {v3, v6, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 408
    move-result v6

    .line 409
    .line 410
    .line 411
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 412
    move-result-object v6

    .line 413
    goto :goto_d

    .line 414
    :cond_19
    move-object v6, v4

    .line 415
    .line 416
    .line 417
    :goto_d
    invoke-static {v6}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 418
    move-result v6

    .line 419
    .line 420
    if-nez v6, :cond_20

    .line 421
    .line 422
    if-eqz v3, :cond_1a

    .line 423
    .line 424
    const-string v6, "twitter"

    .line 425
    .line 426
    .line 427
    invoke-static {v3, v6, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 428
    move-result v6

    .line 429
    .line 430
    .line 431
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 432
    move-result-object v6

    .line 433
    goto :goto_e

    .line 434
    :cond_1a
    move-object v6, v4

    .line 435
    .line 436
    .line 437
    :goto_e
    invoke-static {v6}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 438
    move-result v6

    .line 439
    .line 440
    if-nez v6, :cond_20

    .line 441
    .line 442
    if-eqz v3, :cond_1b

    .line 443
    .line 444
    const-string v6, "t.me"

    .line 445
    .line 446
    .line 447
    invoke-static {v3, v6, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 448
    move-result v6

    .line 449
    .line 450
    .line 451
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 452
    move-result-object v6

    .line 453
    goto :goto_f

    .line 454
    :cond_1b
    move-object v6, v4

    .line 455
    .line 456
    .line 457
    :goto_f
    invoke-static {v6}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 458
    move-result v6

    .line 459
    .line 460
    if-nez v6, :cond_20

    .line 461
    .line 462
    if-eqz v3, :cond_1c

    .line 463
    .line 464
    const-string v6, "telegram.me"

    .line 465
    .line 466
    .line 467
    invoke-static {v3, v6, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 468
    move-result v6

    .line 469
    .line 470
    .line 471
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 472
    move-result-object v6

    .line 473
    goto :goto_10

    .line 474
    :cond_1c
    move-object v6, v4

    .line 475
    .line 476
    .line 477
    :goto_10
    invoke-static {v6}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 478
    move-result v6

    .line 479
    .line 480
    if-nez v6, :cond_20

    .line 481
    .line 482
    if-eqz v3, :cond_1d

    .line 483
    .line 484
    const-string v6, "medium"

    .line 485
    .line 486
    .line 487
    invoke-static {v3, v6, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 488
    move-result v6

    .line 489
    .line 490
    .line 491
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 492
    move-result-object v6

    .line 493
    goto :goto_11

    .line 494
    :cond_1d
    move-object v6, v4

    .line 495
    .line 496
    .line 497
    :goto_11
    invoke-static {v6}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 498
    move-result v6

    .line 499
    .line 500
    if-nez v6, :cond_20

    .line 501
    .line 502
    if-eqz v3, :cond_1e

    .line 503
    .line 504
    const-string v6, "reddit"

    .line 505
    .line 506
    .line 507
    invoke-static {v3, v6, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 508
    move-result v6

    .line 509
    .line 510
    .line 511
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 512
    move-result-object v6

    .line 513
    goto :goto_12

    .line 514
    :cond_1e
    move-object v6, v4

    .line 515
    .line 516
    .line 517
    :goto_12
    invoke-static {v6}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 518
    move-result v6

    .line 519
    .line 520
    if-nez v6, :cond_20

    .line 521
    .line 522
    if-eqz v3, :cond_1f

    .line 523
    .line 524
    const-string v6, "github"

    .line 525
    .line 526
    .line 527
    invoke-static {v3, v6, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 528
    move-result v3

    .line 529
    .line 530
    .line 531
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 532
    move-result-object v3

    .line 533
    goto :goto_13

    .line 534
    :cond_1f
    move-object v3, v4

    .line 535
    .line 536
    .line 537
    :goto_13
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 538
    move-result v3

    .line 539
    .line 540
    if-eqz v3, :cond_18

    .line 541
    .line 542
    .line 543
    :cond_20
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    goto/16 :goto_c

    .line 546
    :cond_21
    move-object v4, v1

    .line 547
    .line 548
    :cond_22
    if-eqz v4, :cond_24

    .line 549
    .line 550
    .line 551
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 552
    move-result p2

    .line 553
    .line 554
    if-eqz p2, :cond_23

    .line 555
    goto :goto_14

    .line 556
    .line 557
    .line 558
    :cond_23
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 559
    .line 560
    iget-object p2, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 561
    .line 562
    .line 563
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 564
    .line 565
    new-instance v0, Lcom/kubi/margin/market/info/h;

    .line 566
    .line 567
    .line 568
    invoke-direct {v0}, Lcom/kubi/margin/market/info/h;-><init>()V

    .line 569
    .line 570
    .line 571
    invoke-static {p1, p2, v4, v0}, Lvp/e;->c(Lcom/google/android/flexbox/FlexboxLayout;Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V

    .line 572
    return-void

    .line 573
    .line 574
    :cond_24
    :goto_14
    sget-object p2, Lcom/kubi/margin/market/info/e;->a:Lcom/kubi/margin/market/info/e;

    .line 575
    .line 576
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 577
    .line 578
    .line 579
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {p2, v0, p1}, Lcom/kubi/margin/market/info/e;->j(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 586
    return-void
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
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
.end method
