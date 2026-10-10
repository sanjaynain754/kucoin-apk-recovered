.class public final Lcom/kubi/redpackage/view/RedpacketHeaderView;
.super Landroid/widget/FrameLayout;
.source "RedpacketHeaderView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J$\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000cH\u0002J$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000cH\u0002J$\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000cH\u0002J$\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000cH\u0002J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/kubi/redpackage/view/RedpacketHeaderView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "binding",
        "Lcom/kubi/redpackage/databinding/BredpackageViewDetailHeaderBinding;",
        "coinInfo",
        "Lcom/kubi/data/entity/CoinInfoEntity;",
        "getCoinInfo",
        "code",
        "",
        "setData",
        "",
        "info",
        "Lcom/kubi/redpackage/entity/RedpacketDetailEntity;",
        "fillWelfareStatus",
        "largeText",
        "smallText",
        "recievingStatus",
        "overStatus",
        "expireStatus",
        "showRetry",
        "retryClick",
        "Landroid/view/View$OnClickListener;",
        "RedpackageLib_googleRelease"
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
.field public b:Luv/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:Lcom/kubi/data/entity/CoinInfoEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
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
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    sget v0, Lcom/kubi/redpackage/R$layout;->bredpackage_view_detail_header:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 18
    .line 19
    sget p1, Lcom/kubi/redpackage/R$id;->layoutRoot:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Luv/c;->a(Landroid/view/View;)Luv/c;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    iput-object p1, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 30
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public static synthetic a(Lcom/kubi/redpackage/view/RedpacketHeaderView;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->g(Lcom/kubi/redpackage/view/RedpacketHeaderView;Z)Lkotlin/Unit;

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
.end method

.method public static final g(Lcom/kubi/redpackage/view/RedpacketHeaderView;Z)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Luv/c;->f:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget v2, Lcom/kubi/redpackage/R$drawable;->shape_redpackage_text_bg_cover:I

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v1

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    iget-object v0, v0, Luv/c;->m:Landroid/widget/TextView;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    sget v2, Lcom/kubi/redpackage/R$drawable;->shape_redpackage_text_bg_cover:I

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    move v2, v1

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 36
    .line 37
    :cond_3
    iget-object v0, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 38
    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    iget-object v0, v0, Luv/c;->h:Landroid/widget/TextView;

    .line 42
    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    sget v2, Lcom/kubi/redpackage/R$drawable;->shape_redpackage_text_bg_cover:I

    .line 48
    goto :goto_2

    .line 49
    :cond_4
    move v2, v1

    .line 50
    .line 51
    .line 52
    :goto_2
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 53
    .line 54
    :cond_5
    iget-object v0, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 55
    .line 56
    if-eqz v0, :cond_7

    .line 57
    .line 58
    iget-object v0, v0, Luv/c;->l:Landroid/widget/TextView;

    .line 59
    .line 60
    if-eqz v0, :cond_7

    .line 61
    .line 62
    if-eqz p1, :cond_6

    .line 63
    .line 64
    sget v2, Lcom/kubi/redpackage/R$drawable;->shape_redpackage_text_bg_cover:I

    .line 65
    goto :goto_3

    .line 66
    :cond_6
    move v2, v1

    .line 67
    .line 68
    .line 69
    :goto_3
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 70
    .line 71
    :cond_7
    iget-object p0, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 72
    .line 73
    if-eqz p0, :cond_9

    .line 74
    .line 75
    iget-object p0, p0, Luv/c;->b:Lcom/kubi/redpackage/view/RedPacketCoverBgMaskView;

    .line 76
    .line 77
    if-eqz p0, :cond_9

    .line 78
    .line 79
    if-eqz p1, :cond_8

    .line 80
    goto :goto_4

    .line 81
    .line 82
    :cond_8
    const/16 v1, 0x8

    .line 83
    .line 84
    .line 85
    :goto_4
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 86
    .line 87
    :cond_9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 88
    return-object p0
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
.end method


# virtual methods
.method public final b(Lcom/kubi/redpackage/entity/RedpacketDetailEntity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->isReceive()Ljava/lang/Boolean;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 15
    move-result v2

    .line 16
    .line 17
    const-string v3, "tvTip"

    .line 18
    .line 19
    const-string v4, "layoutAmount"

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, v1, Luv/c;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 30
    .line 31
    iget-object v2, v1, Luv/c;->m:Landroid/widget/TextView;

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->r(Landroid/view/View;)V

    .line 38
    .line 39
    iget-object v2, v1, Luv/c;->h:Landroid/widget/TextView;

    .line 40
    .line 41
    move-object/from16 v3, p2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    iget-object v2, v1, Luv/c;->l:Landroid/widget/TextView;

    .line 47
    .line 48
    move-object/from16 v3, p3

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_1
    iget-object v2, v1, Luv/c;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->r(Landroid/view/View;)V

    .line 61
    .line 62
    iget-object v2, v1, Luv/c;->m:Landroid/widget/TextView;

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 69
    .line 70
    iget-object v2, v1, Luv/c;->m:Landroid/widget/TextView;

    .line 71
    .line 72
    sget v3, Lcom/kubi/redpackage/R$string;->redpacket_expired:I

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 76
    .line 77
    .line 78
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getReceiveNum()Ljava/lang/Integer;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    .line 82
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendNum()Ljava/lang/Integer;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    .line 86
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    move-result v2

    .line 88
    .line 89
    const/16 v3, 0x20

    .line 90
    const/4 v4, 0x0

    .line 91
    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendNum()Ljava/lang/Integer;

    .line 96
    move-result-object v2

    .line 97
    .line 98
    if-nez v2, :cond_2

    .line 99
    goto :goto_1

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 103
    move-result v2

    .line 104
    const/4 v5, 0x1

    .line 105
    .line 106
    if-ne v2, v5, :cond_3

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getLastAt()Ljava/lang/Long;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    .line 113
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 114
    move-result-wide v5

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendAt()Ljava/lang/Long;

    .line 118
    move-result-object v2

    .line 119
    .line 120
    .line 121
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 122
    move-result-wide v7

    .line 123
    sub-long/2addr v5, v7

    .line 124
    .line 125
    .line 126
    invoke-static {v5, v6}, Lcom/kubi/utils/TimeUtils;->m(J)Ljava/lang/String;

    .line 127
    move-result-object v2

    .line 128
    goto :goto_2

    .line 129
    .line 130
    .line 131
    :cond_3
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getLastAt()Ljava/lang/Long;

    .line 132
    move-result-object v2

    .line 133
    .line 134
    .line 135
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 136
    move-result-wide v5

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getFirstAt()Ljava/lang/Long;

    .line 140
    move-result-object v2

    .line 141
    .line 142
    .line 143
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 144
    move-result-wide v7

    .line 145
    sub-long/2addr v5, v7

    .line 146
    .line 147
    .line 148
    invoke-static {v5, v6}, Lcom/kubi/utils/TimeUtils;->m(J)Ljava/lang/String;

    .line 149
    move-result-object v2

    .line 150
    .line 151
    :goto_2
    iget-object v1, v1, Luv/c;->j:Landroid/widget/TextView;

    .line 152
    .line 153
    sget-object v5, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 154
    .line 155
    sget v6, Lcom/kubi/redpackage/R$string;->redpacket_received:I

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendNum()Ljava/lang/Integer;

    .line 159
    move-result-object v7

    .line 160
    .line 161
    new-instance v8, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendAmount()Ljava/math/BigDecimal;

    .line 168
    move-result-object v9

    .line 169
    .line 170
    if-eqz v9, :cond_4

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 174
    move-result-object v10

    .line 175
    .line 176
    const/16 v18, 0xfe

    .line 177
    .line 178
    const/16 v19, 0x0

    .line 179
    const/4 v11, 0x0

    .line 180
    const/4 v12, 0x0

    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    .line 185
    const/16 v16, 0x0

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    .line 190
    invoke-static/range {v9 .. v19}, Lgf/i;->l(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 191
    move-result-object v9

    .line 192
    goto :goto_3

    .line 193
    :cond_4
    move-object v9, v4

    .line 194
    .line 195
    .line 196
    :goto_3
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 203
    move-result-object v3

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v3}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->d(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 207
    move-result-object v3

    .line 208
    .line 209
    if-eqz v3, :cond_5

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 213
    move-result-object v4

    .line 214
    .line 215
    .line 216
    :cond_5
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    move-result-object v3

    .line 221
    .line 222
    .line 223
    filled-new-array {v7, v3, v2}, [Ljava/lang/Object;

    .line 224
    move-result-object v2

    .line 225
    .line 226
    .line 227
    invoke-virtual {v5, v6, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 228
    move-result-object v2

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    return-void

    .line 233
    .line 234
    :cond_6
    iget-object v1, v1, Luv/c;->j:Landroid/widget/TextView;

    .line 235
    .line 236
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 237
    .line 238
    sget v5, Lcom/kubi/redpackage/R$string;->redpacket_receiving_new:I

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getReceiveNum()Ljava/lang/Integer;

    .line 242
    move-result-object v6

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendNum()Ljava/lang/Integer;

    .line 246
    move-result-object v7

    .line 247
    .line 248
    new-instance v8, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendAmount()Ljava/math/BigDecimal;

    .line 255
    move-result-object v9

    .line 256
    .line 257
    if-eqz v9, :cond_7

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 261
    move-result-object v10

    .line 262
    .line 263
    const/16 v18, 0xfe

    .line 264
    .line 265
    const/16 v19, 0x0

    .line 266
    const/4 v11, 0x0

    .line 267
    const/4 v12, 0x0

    .line 268
    const/4 v13, 0x0

    .line 269
    const/4 v14, 0x0

    .line 270
    const/4 v15, 0x0

    .line 271
    .line 272
    const/16 v16, 0x0

    .line 273
    .line 274
    const/16 v17, 0x0

    .line 275
    .line 276
    .line 277
    invoke-static/range {v9 .. v19}, Lgf/i;->l(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 278
    move-result-object v9

    .line 279
    goto :goto_4

    .line 280
    :cond_7
    move-object v9, v4

    .line 281
    .line 282
    .line 283
    :goto_4
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 290
    move-result-object v9

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v9}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->d(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 294
    move-result-object v9

    .line 295
    .line 296
    if-eqz v9, :cond_8

    .line 297
    .line 298
    .line 299
    invoke-virtual {v9}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 300
    move-result-object v9

    .line 301
    goto :goto_5

    .line 302
    :cond_8
    move-object v9, v4

    .line 303
    .line 304
    .line 305
    :goto_5
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    move-result-object v8

    .line 310
    .line 311
    new-instance v9, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->remainAmount()Ljava/math/BigDecimal;

    .line 318
    move-result-object v10

    .line 319
    .line 320
    if-eqz v10, :cond_9

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 324
    move-result-object v11

    .line 325
    .line 326
    const/16 v19, 0xfe

    .line 327
    .line 328
    const/16 v20, 0x0

    .line 329
    const/4 v12, 0x0

    .line 330
    const/4 v13, 0x0

    .line 331
    const/4 v14, 0x0

    .line 332
    const/4 v15, 0x0

    .line 333
    .line 334
    const/16 v16, 0x0

    .line 335
    .line 336
    const/16 v17, 0x0

    .line 337
    .line 338
    const/16 v18, 0x0

    .line 339
    .line 340
    .line 341
    invoke-static/range {v10 .. v20}, Lgf/i;->l(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 342
    move-result-object v10

    .line 343
    goto :goto_6

    .line 344
    :cond_9
    move-object v10, v4

    .line 345
    .line 346
    .line 347
    :goto_6
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 354
    move-result-object v3

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v3}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->d(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 358
    move-result-object v3

    .line 359
    .line 360
    if-eqz v3, :cond_a

    .line 361
    .line 362
    .line 363
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 364
    move-result-object v4

    .line 365
    .line 366
    .line 367
    :cond_a
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    move-result-object v3

    .line 372
    .line 373
    .line 374
    filled-new-array {v6, v7, v8, v3}, [Ljava/lang/Object;

    .line 375
    move-result-object v3

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2, v5, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 379
    move-result-object v2

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 383
    return-void
.end method

.method public final c(Lcom/kubi/redpackage/entity/RedpacketDetailEntity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getWelfareStatus()Ljava/lang/Integer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x3

    .line 13
    .line 14
    if-ne v1, v2, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b(Lcom/kubi/redpackage/entity/RedpacketDetailEntity;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    return-void

    .line 19
    .line 20
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 21
    goto :goto_1

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x2

    .line 27
    .line 28
    if-ne v1, v2, :cond_3

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->e(Lcom/kubi/redpackage/entity/RedpacketDetailEntity;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_3
    :goto_1
    if-nez v0, :cond_4

    .line 35
    goto :goto_2

    .line 36
    .line 37
    .line 38
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 39
    move-result v0

    .line 40
    const/4 v1, 0x1

    .line 41
    .line 42
    if-ne v0, v1, :cond_5

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->f(Lcom/kubi/redpackage/entity/RedpacketDetailEntity;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    :cond_5
    :goto_2
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
.end method

.method public final d(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->c:Lcom/kubi/data/entity/CoinInfoEntity;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lgf/n;->a:Lgf/n;

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iput-object p1, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->c:Lcom/kubi/data/entity/CoinInfoEntity;

    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->c:Lcom/kubi/data/entity/CoinInfoEntity;

    .line 19
    return-object p1
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final e(Lcom/kubi/redpackage/entity/RedpacketDetailEntity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 19

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->isReceive()Ljava/lang/Boolean;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 15
    move-result v2

    .line 16
    .line 17
    const-string v3, "tvTip"

    .line 18
    .line 19
    const-string v4, "layoutAmount"

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, v1, Luv/c;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 30
    .line 31
    iget-object v2, v1, Luv/c;->m:Landroid/widget/TextView;

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->r(Landroid/view/View;)V

    .line 38
    .line 39
    iget-object v2, v1, Luv/c;->h:Landroid/widget/TextView;

    .line 40
    .line 41
    move-object/from16 v3, p2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    iget-object v2, v1, Luv/c;->l:Landroid/widget/TextView;

    .line 47
    .line 48
    move-object/from16 v3, p3

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_1
    iget-object v2, v1, Luv/c;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->r(Landroid/view/View;)V

    .line 61
    .line 62
    iget-object v2, v1, Luv/c;->m:Landroid/widget/TextView;

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 69
    .line 70
    iget-object v2, v1, Luv/c;->m:Landroid/widget/TextView;

    .line 71
    .line 72
    sget v3, Lcom/kubi/redpackage/R$string;->redpacket_run_out:I

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 76
    .line 77
    .line 78
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendNum()Ljava/lang/Integer;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    if-nez v2, :cond_2

    .line 82
    goto :goto_1

    .line 83
    .line 84
    .line 85
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 86
    move-result v2

    .line 87
    const/4 v3, 0x1

    .line 88
    .line 89
    if-ne v2, v3, :cond_3

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getLastAt()Ljava/lang/Long;

    .line 93
    move-result-object v2

    .line 94
    .line 95
    .line 96
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 97
    move-result-wide v2

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendAt()Ljava/lang/Long;

    .line 101
    move-result-object v4

    .line 102
    .line 103
    .line 104
    invoke-static {v4}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 105
    move-result-wide v4

    .line 106
    sub-long/2addr v2, v4

    .line 107
    .line 108
    .line 109
    invoke-static {v2, v3}, Lcom/kubi/utils/TimeUtils;->m(J)Ljava/lang/String;

    .line 110
    move-result-object v2

    .line 111
    goto :goto_2

    .line 112
    .line 113
    .line 114
    :cond_3
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getLastAt()Ljava/lang/Long;

    .line 115
    move-result-object v2

    .line 116
    .line 117
    .line 118
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 119
    move-result-wide v2

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getFirstAt()Ljava/lang/Long;

    .line 123
    move-result-object v4

    .line 124
    .line 125
    .line 126
    invoke-static {v4}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 127
    move-result-wide v4

    .line 128
    sub-long/2addr v2, v4

    .line 129
    .line 130
    .line 131
    invoke-static {v2, v3}, Lcom/kubi/utils/TimeUtils;->m(J)Ljava/lang/String;

    .line 132
    move-result-object v2

    .line 133
    .line 134
    :goto_2
    iget-object v1, v1, Luv/c;->j:Landroid/widget/TextView;

    .line 135
    .line 136
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 137
    .line 138
    sget v4, Lcom/kubi/redpackage/R$string;->redpacket_received:I

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendNum()Ljava/lang/Integer;

    .line 142
    move-result-object v5

    .line 143
    .line 144
    new-instance v6, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendAmount()Ljava/math/BigDecimal;

    .line 151
    move-result-object v7

    .line 152
    .line 153
    const/16 v18, 0x0

    .line 154
    .line 155
    if-eqz v7, :cond_4

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 159
    move-result-object v8

    .line 160
    .line 161
    const/16 v16, 0xfe

    .line 162
    .line 163
    const/16 v17, 0x0

    .line 164
    const/4 v9, 0x0

    .line 165
    const/4 v10, 0x0

    .line 166
    const/4 v11, 0x0

    .line 167
    const/4 v12, 0x0

    .line 168
    const/4 v13, 0x0

    .line 169
    const/4 v14, 0x0

    .line 170
    const/4 v15, 0x0

    .line 171
    .line 172
    .line 173
    invoke-static/range {v7 .. v17}, Lgf/i;->l(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 174
    move-result-object v7

    .line 175
    goto :goto_3

    .line 176
    .line 177
    :cond_4
    move-object/from16 v7, v18

    .line 178
    .line 179
    .line 180
    :goto_3
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const/16 v7, 0x20

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 189
    move-result-object v7

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v7}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->d(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 193
    move-result-object v7

    .line 194
    .line 195
    if-eqz v7, :cond_5

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 199
    move-result-object v18

    .line 200
    .line 201
    :cond_5
    move-object/from16 v7, v18

    .line 202
    .line 203
    .line 204
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    move-result-object v6

    .line 209
    .line 210
    .line 211
    filled-new-array {v5, v6, v2}, [Ljava/lang/Object;

    .line 212
    move-result-object v2

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v4, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 216
    move-result-object v2

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    return-void
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
.end method

.method public final f(Lcom/kubi/redpackage/entity/RedpacketDetailEntity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 30

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_4

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->isReceive()Ljava/lang/Boolean;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 16
    move-result v2

    .line 17
    .line 18
    const-string v3, "tvTip"

    .line 19
    .line 20
    const-string v4, "layoutAmount"

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget-object v2, v1, Luv/c;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 31
    .line 32
    iget-object v2, v1, Luv/c;->m:Landroid/widget/TextView;

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->r(Landroid/view/View;)V

    .line 39
    .line 40
    iget-object v2, v1, Luv/c;->h:Landroid/widget/TextView;

    .line 41
    .line 42
    move-object/from16 v3, p2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    iget-object v1, v1, Luv/c;->l:Landroid/widget/TextView;

    .line 48
    .line 49
    move-object/from16 v2, p3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    goto :goto_0

    .line 54
    .line 55
    :cond_1
    iget-object v2, v1, Luv/c;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->r(Landroid/view/View;)V

    .line 62
    .line 63
    iget-object v2, v1, Luv/c;->m:Landroid/widget/TextView;

    .line 64
    .line 65
    .line 66
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 70
    .line 71
    iget-object v1, v1, Luv/c;->m:Landroid/widget/TextView;

    .line 72
    .line 73
    .line 74
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getBestWishes()Ljava/lang/String;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    .line 78
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    :goto_0
    iget-object v1, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 85
    .line 86
    if-eqz v1, :cond_6

    .line 87
    .line 88
    iget-object v1, v1, Luv/c;->j:Landroid/widget/TextView;

    .line 89
    .line 90
    if-eqz v1, :cond_6

    .line 91
    .line 92
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 93
    .line 94
    sget v3, Lcom/kubi/redpackage/R$string;->redpacket_receiving_new:I

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getReceiveNum()Ljava/lang/Integer;

    .line 98
    move-result-object v4

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendNum()Ljava/lang/Integer;

    .line 102
    move-result-object v5

    .line 103
    .line 104
    new-instance v6, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getSendAmount()Ljava/math/BigDecimal;

    .line 111
    move-result-object v7

    .line 112
    .line 113
    const/16 v18, 0x0

    .line 114
    .line 115
    if-eqz v7, :cond_2

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 119
    move-result-object v8

    .line 120
    .line 121
    const/16 v16, 0xfe

    .line 122
    .line 123
    const/16 v17, 0x0

    .line 124
    const/4 v9, 0x0

    .line 125
    const/4 v10, 0x0

    .line 126
    const/4 v11, 0x0

    .line 127
    const/4 v12, 0x0

    .line 128
    const/4 v13, 0x0

    .line 129
    const/4 v14, 0x0

    .line 130
    const/4 v15, 0x0

    .line 131
    .line 132
    .line 133
    invoke-static/range {v7 .. v17}, Lgf/i;->l(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 134
    move-result-object v7

    .line 135
    goto :goto_1

    .line 136
    .line 137
    :cond_2
    move-object/from16 v7, v18

    .line 138
    .line 139
    .line 140
    :goto_1
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const/16 v7, 0x20

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 149
    move-result-object v8

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v8}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->d(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 153
    move-result-object v8

    .line 154
    .line 155
    if-eqz v8, :cond_3

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 159
    move-result-object v8

    .line 160
    goto :goto_2

    .line 161
    .line 162
    :cond_3
    move-object/from16 v8, v18

    .line 163
    .line 164
    .line 165
    :goto_2
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    move-result-object v6

    .line 170
    .line 171
    new-instance v8, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->remainAmount()Ljava/math/BigDecimal;

    .line 178
    move-result-object v19

    .line 179
    .line 180
    if-eqz v19, :cond_4

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 184
    move-result-object v20

    .line 185
    .line 186
    const/16 v28, 0xfe

    .line 187
    .line 188
    const/16 v29, 0x0

    .line 189
    .line 190
    const/16 v21, 0x0

    .line 191
    .line 192
    const/16 v22, 0x0

    .line 193
    .line 194
    const/16 v23, 0x0

    .line 195
    .line 196
    const/16 v24, 0x0

    .line 197
    .line 198
    const/16 v25, 0x0

    .line 199
    .line 200
    const/16 v26, 0x0

    .line 201
    .line 202
    const/16 v27, 0x0

    .line 203
    .line 204
    .line 205
    invoke-static/range {v19 .. v29}, Lgf/i;->l(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 206
    move-result-object v9

    .line 207
    goto :goto_3

    .line 208
    .line 209
    :cond_4
    move-object/from16 v9, v18

    .line 210
    .line 211
    .line 212
    :goto_3
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 219
    move-result-object v7

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v7}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->d(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 223
    move-result-object v7

    .line 224
    .line 225
    if-eqz v7, :cond_5

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 229
    move-result-object v18

    .line 230
    .line 231
    :cond_5
    move-object/from16 v7, v18

    .line 232
    .line 233
    .line 234
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    move-result-object v7

    .line 239
    .line 240
    .line 241
    filled-new-array {v4, v5, v6, v7}, [Ljava/lang/Object;

    .line 242
    move-result-object v4

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v3, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 246
    move-result-object v2

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    :cond_6
    :goto_4
    return-void
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
.end method

.method public final setData(Lcom/kubi/redpackage/entity/RedpacketDetailEntity;)V
    .locals 20
    .param p1    # Lcom/kubi/redpackage/entity/RedpacketDetailEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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
    const-string v2, "info"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, v2, Luv/c;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    :cond_0
    iget-object v2, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iget-object v2, v2, Luv/c;->k:Landroid/widget/TextView;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    const/4 v4, 0x4

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    :cond_1
    iget-object v2, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    iget-object v2, v2, Luv/c;->i:Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getNickName()Ljava/lang/String;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    :cond_2
    iget-object v2, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 51
    .line 52
    if-eqz v2, :cond_5

    .line 53
    .line 54
    iget-object v2, v2, Luv/c;->n:Landroid/widget/TextView;

    .line 55
    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getWelfareType()Ljava/lang/Integer;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    if-nez v4, :cond_3

    .line 63
    goto :goto_0

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 67
    move-result v4

    .line 68
    .line 69
    if-nez v4, :cond_4

    .line 70
    goto :goto_1

    .line 71
    .line 72
    :cond_4
    :goto_0
    const/16 v3, 0x8

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    :cond_5
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getReceive()Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;

    .line 79
    move-result-object v2

    .line 80
    const/4 v3, 0x0

    .line 81
    .line 82
    if-eqz v2, :cond_6

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;->getReceiveAmount()Ljava/math/BigDecimal;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    if-eqz v2, :cond_6

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/math/BigDecimal;->doubleValue()D

    .line 92
    move-result-wide v4

    .line 93
    .line 94
    .line 95
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 96
    move-result-object v2

    .line 97
    goto :goto_2

    .line 98
    :cond_6
    move-object v2, v3

    .line 99
    .line 100
    .line 101
    :goto_2
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 102
    move-result-wide v4

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getReceive()Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;

    .line 106
    move-result-object v2

    .line 107
    .line 108
    if-eqz v2, :cond_7

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;->getReceiveAmount()Ljava/math/BigDecimal;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    if-eqz v2, :cond_7

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 118
    move-result-object v6

    .line 119
    .line 120
    .line 121
    invoke-static {v2, v6}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 122
    move-result-wide v6

    .line 123
    .line 124
    .line 125
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 126
    move-result-object v2

    .line 127
    goto :goto_3

    .line 128
    :cond_7
    move-object v2, v3

    .line 129
    .line 130
    .line 131
    :goto_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 132
    move-result-wide v6

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getReceive()Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    if-eqz v2, :cond_8

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;->getReceiveAmount()Ljava/math/BigDecimal;

    .line 142
    move-result-object v8

    .line 143
    .line 144
    if-eqz v8, :cond_8

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 148
    move-result-object v9

    .line 149
    .line 150
    const/16 v17, 0xfe

    .line 151
    .line 152
    const/16 v18, 0x0

    .line 153
    const/4 v10, 0x0

    .line 154
    const/4 v11, 0x0

    .line 155
    const/4 v12, 0x0

    .line 156
    const/4 v13, 0x0

    .line 157
    const/4 v14, 0x0

    .line 158
    const/4 v15, 0x0

    .line 159
    .line 160
    const/16 v16, 0x0

    .line 161
    .line 162
    .line 163
    invoke-static/range {v8 .. v18}, Lgf/i;->l(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 164
    move-result-object v2

    .line 165
    goto :goto_4

    .line 166
    :cond_8
    move-object v2, v3

    .line 167
    .line 168
    .line 169
    :goto_4
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getReceive()Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;

    .line 170
    move-result-object v8

    .line 171
    .line 172
    if-eqz v8, :cond_9

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;->getReceiveAmount()Ljava/math/BigDecimal;

    .line 176
    move-result-object v8

    .line 177
    .line 178
    if-eqz v8, :cond_9

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 182
    move-result-object v9

    .line 183
    .line 184
    .line 185
    invoke-static {v8, v9}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 186
    move-result-wide v10

    .line 187
    .line 188
    const/16 v18, 0x2f

    .line 189
    .line 190
    const/16 v19, 0x0

    .line 191
    const/4 v12, 0x0

    .line 192
    const/4 v13, 0x0

    .line 193
    const/4 v14, 0x0

    .line 194
    const/4 v15, 0x0

    .line 195
    .line 196
    const/16 v16, 0x1

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    .line 201
    invoke-static/range {v10 .. v19}, Lkf/a;->v(DLjava/lang/String;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 202
    move-result-object v8

    .line 203
    goto :goto_5

    .line 204
    :cond_9
    move-object v8, v3

    .line 205
    .line 206
    :goto_5
    cmpl-double v4, v4, v6

    .line 207
    .line 208
    const/16 v5, 0x20

    .line 209
    .line 210
    if-lez v4, :cond_b

    .line 211
    .line 212
    new-instance v6, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 225
    move-result-object v7

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v7}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->d(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 229
    move-result-object v7

    .line 230
    .line 231
    if-eqz v7, :cond_a

    .line 232
    .line 233
    .line 234
    invoke-virtual {v7}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 235
    move-result-object v7

    .line 236
    goto :goto_6

    .line 237
    :cond_a
    move-object v7, v3

    .line 238
    .line 239
    .line 240
    :goto_6
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    move-result-object v6

    .line 245
    goto :goto_7

    .line 246
    :cond_b
    move-object v6, v8

    .line 247
    .line 248
    :goto_7
    if-lez v4, :cond_c

    .line 249
    goto :goto_8

    .line 250
    .line 251
    :cond_c
    new-instance v4, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getCurrency()Ljava/lang/String;

    .line 264
    move-result-object v2

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v2}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->d(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 268
    move-result-object v2

    .line 269
    .line 270
    if-eqz v2, :cond_d

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 274
    move-result-object v3

    .line 275
    .line 276
    .line 277
    :cond_d
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    move-result-object v8

    .line 282
    .line 283
    .line 284
    :goto_8
    invoke-virtual {v0, v1, v6, v8}, Lcom/kubi/redpackage/view/RedpacketHeaderView;->c(Lcom/kubi/redpackage/entity/RedpacketDetailEntity;Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getReceive()Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;

    .line 288
    move-result-object v2

    .line 289
    .line 290
    if-eqz v2, :cond_12

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;->getReceiveStatus()Ljava/lang/Integer;

    .line 294
    move-result-object v2

    .line 295
    .line 296
    if-nez v2, :cond_e

    .line 297
    goto :goto_9

    .line 298
    .line 299
    .line 300
    :cond_e
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 301
    move-result v2

    .line 302
    .line 303
    const/16 v3, 0xc

    .line 304
    .line 305
    if-ne v2, v3, :cond_12

    .line 306
    .line 307
    iget-object v2, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 308
    .line 309
    if-eqz v2, :cond_f

    .line 310
    .line 311
    iget-object v2, v2, Luv/c;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 312
    .line 313
    if-eqz v2, :cond_f

    .line 314
    .line 315
    .line 316
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 317
    .line 318
    :cond_f
    iget-object v2, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 319
    .line 320
    if-eqz v2, :cond_10

    .line 321
    .line 322
    iget-object v2, v2, Luv/c;->m:Landroid/widget/TextView;

    .line 323
    .line 324
    if-eqz v2, :cond_10

    .line 325
    .line 326
    .line 327
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->r(Landroid/view/View;)V

    .line 328
    .line 329
    :cond_10
    iget-object v2, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 330
    .line 331
    if-eqz v2, :cond_11

    .line 332
    .line 333
    iget-object v2, v2, Luv/c;->h:Landroid/widget/TextView;

    .line 334
    .line 335
    if-eqz v2, :cond_11

    .line 336
    .line 337
    sget v3, Lcom/kubi/redpackage/R$string;->redpacket_return:I

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 341
    .line 342
    :cond_11
    iget-object v2, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 343
    .line 344
    if-eqz v2, :cond_12

    .line 345
    .line 346
    iget-object v2, v2, Luv/c;->l:Landroid/widget/TextView;

    .line 347
    .line 348
    if-eqz v2, :cond_12

    .line 349
    .line 350
    sget v3, Lcom/kubi/redpackage/R$string;->redpacket_return_tip:I

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 354
    .line 355
    :cond_12
    :goto_9
    iget-object v2, v0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 356
    .line 357
    if-eqz v2, :cond_13

    .line 358
    .line 359
    iget-object v2, v2, Luv/c;->c:Lcom/kubi/redpackage/view/RedPacketCoverBgView;

    .line 360
    .line 361
    if-eqz v2, :cond_13

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1}, Lcom/kubi/redpackage/entity/RedpacketDetailEntity;->getExtendUrl()Ljava/lang/String;

    .line 365
    move-result-object v1

    .line 366
    .line 367
    new-instance v3, Law/a;

    .line 368
    .line 369
    .line 370
    invoke-direct {v3, v0}, Law/a;-><init>(Lcom/kubi/redpackage/view/RedpacketHeaderView;)V

    .line 371
    .line 372
    .line 373
    invoke-static {v2, v1, v3}, Lcom/kubi/redpackage/utils/StringsExtKt;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 374
    :cond_13
    return-void
.end method

.method public final showRetry(Landroid/view/View$OnClickListener;)V
    .locals 2
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "retryClick"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Luv/c;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    const/4 v1, 0x4

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, v0, Luv/c;->k:Landroid/widget/TextView;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lcom/kubi/redpackage/view/RedpacketHeaderView;->b:Luv/c;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Luv/c;->k:Landroid/widget/TextView;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    :cond_2
    return-void
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method
