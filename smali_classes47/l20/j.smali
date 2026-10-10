.class public final Ll20/j;
.super Ll20/h;
.source "DetailOCOHeaderView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/spot/business/delegation/delegateDetail/DetailOCOHeaderView;",
        "Lcom/kubi/spot/business/delegation/delegateDetail/DetailBaseHeaderView;",
        "<init>",
        "()V",
        "getHeaderLayout",
        "",
        "item",
        "Lcom/kubi/spot/entity/DelegationEntity;",
        "bindData",
        "",
        "view",
        "Landroid/view/View;",
        "entity",
        "delegationDetailFragment",
        "Lcom/kubi/sdk/BaseFragment;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ll20/h;-><init>()V

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
.end method


# virtual methods
.method public a(Landroid/view/View;Lcom/kubi/spot/entity/DelegationEntity;Lcom/kubi/sdk/BaseFragment;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/spot/entity/DelegationEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "entity"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "delegationDetailFragment"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-super {p0, p1, p2, p3}, Ll20/h;->a(Landroid/view/View;Lcom/kubi/spot/entity/DelegationEntity;Lcom/kubi/sdk/BaseFragment;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ll20/h;->e()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    sget v0, Lcom/kubi/spot/R$id;->tv_do_price:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ll20/h;->f()Z

    .line 28
    move-result v1

    .line 29
    .line 30
    const-string v2, "e_l_o"

    .line 31
    .line 32
    const-string v3, "e_s_o"

    .line 33
    .line 34
    const-string v4, "l_l_o"

    .line 35
    .line 36
    const-string v5, "l_s_o"

    .line 37
    .line 38
    const-string v6, "--"

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStop()Ljava/lang/String;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 50
    move-result v7

    .line 51
    .line 52
    .line 53
    sparse-switch v7, :sswitch_data_0

    .line 54
    goto :goto_0

    .line 55
    .line 56
    .line 57
    :sswitch_0
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    move-result v1

    .line 59
    .line 60
    if-nez v1, :cond_0

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :sswitch_1
    const-string v7, "l_oco"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    move-result v1

    .line 68
    .line 69
    if-nez v1, :cond_0

    .line 70
    goto :goto_0

    .line 71
    .line 72
    .line 73
    :sswitch_2
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-nez v1, :cond_0

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    const/16 v7, 0x2264

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStopPrice()Ljava/math/BigDecimal;

    .line 91
    move-result-object v7

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v7}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 95
    move-result-object v7

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    goto :goto_1

    .line 104
    .line 105
    .line 106
    :sswitch_3
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    move-result v1

    .line 108
    .line 109
    if-nez v1, :cond_1

    .line 110
    goto :goto_0

    .line 111
    .line 112
    :sswitch_4
    const-string v7, "e_oco"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    move-result v1

    .line 117
    .line 118
    if-nez v1, :cond_1

    .line 119
    goto :goto_0

    .line 120
    .line 121
    .line 122
    :sswitch_5
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    move-result v1

    .line 124
    .line 125
    if-nez v1, :cond_1

    .line 126
    goto :goto_0

    .line 127
    .line 128
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    const/16 v7, 0x2265

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStopPrice()Ljava/math/BigDecimal;

    .line 140
    move-result-object v7

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2, v7}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 144
    move-result-object v7

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    move-result-object v1

    .line 152
    goto :goto_1

    .line 153
    .line 154
    .line 155
    :cond_2
    :goto_0
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStopPrice()Ljava/math/BigDecimal;

    .line 156
    move-result-object v1

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2, v1}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 160
    move-result-object v1

    .line 161
    goto :goto_1

    .line 162
    :cond_3
    move-object v1, v6

    .line 163
    .line 164
    .line 165
    :goto_1
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStopTriggered()Ljava/lang/Boolean;

    .line 169
    move-result-object p1

    .line 170
    .line 171
    .line 172
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 173
    move-result p1

    .line 174
    .line 175
    if-nez p1, :cond_4

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Ll20/h;->e()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 179
    move-result-object p1

    .line 180
    .line 181
    sget p3, Lcom/kubi/spot/R$id;->tv_limit_price:I

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getLimitPrice()Ljava/math/BigDecimal;

    .line 185
    move-result-object v0

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2, v0}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 189
    move-result-object p2

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, p3, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0}, Ll20/h;->e()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 196
    move-result-object p1

    .line 197
    .line 198
    sget p2, Lcom/kubi/spot/R$id;->tv_do_condition:I

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, p2, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 202
    return-void

    .line 203
    .line 204
    .line 205
    :cond_4
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStop()Ljava/lang/String;

    .line 206
    move-result-object p1

    .line 207
    .line 208
    .line 209
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    move-result p1

    .line 211
    const/4 v0, 0x0

    .line 212
    .line 213
    if-nez p1, :cond_8

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStop()Ljava/lang/String;

    .line 217
    move-result-object p1

    .line 218
    .line 219
    .line 220
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    move-result p1

    .line 222
    .line 223
    if-eqz p1, :cond_5

    .line 224
    goto :goto_3

    .line 225
    .line 226
    .line 227
    :cond_5
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStop()Ljava/lang/String;

    .line 228
    move-result-object p1

    .line 229
    .line 230
    .line 231
    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    move-result p1

    .line 233
    .line 234
    if-nez p1, :cond_7

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStop()Ljava/lang/String;

    .line 238
    move-result-object p1

    .line 239
    .line 240
    .line 241
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    move-result p1

    .line 243
    .line 244
    if-eqz p1, :cond_6

    .line 245
    goto :goto_2

    .line 246
    .line 247
    .line 248
    :cond_6
    invoke-virtual {p0}, Ll20/h;->e()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 249
    move-result-object p1

    .line 250
    .line 251
    sget p2, Lcom/kubi/spot/R$id;->tv_do_condition:I

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, p2, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, Ll20/h;->e()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 258
    move-result-object p1

    .line 259
    .line 260
    sget p2, Lcom/kubi/spot/R$id;->tv_limit_price:I

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, p2, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 264
    return-void

    .line 265
    .line 266
    .line 267
    :cond_7
    :goto_2
    invoke-virtual {p0}, Ll20/h;->e()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 268
    move-result-object p1

    .line 269
    .line 270
    sget v1, Lcom/kubi/spot/R$id;->layoutPrice:I

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p0}, Ll20/h;->e()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 277
    move-result-object p1

    .line 278
    .line 279
    sget v1, Lcom/kubi/spot/R$id;->tv_do_condition:I

    .line 280
    .line 281
    sget v2, Lcom/kubi/spot/R$string;->oco_stop_limit:I

    .line 282
    .line 283
    new-array v0, v0, [Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    invoke-virtual {p3, v2, v0}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 287
    move-result-object p3

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1, v1, p3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0}, Ll20/h;->e()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 294
    move-result-object p1

    .line 295
    .line 296
    sget p3, Lcom/kubi/spot/R$id;->tv_limit_price:I

    .line 297
    .line 298
    .line 299
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getPrice()Ljava/math/BigDecimal;

    .line 300
    move-result-object v0

    .line 301
    .line 302
    .line 303
    invoke-virtual {p2, v0}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 304
    move-result-object p2

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, p3, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 308
    return-void

    .line 309
    .line 310
    .line 311
    :cond_8
    :goto_3
    invoke-virtual {p0}, Ll20/h;->e()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 312
    move-result-object p1

    .line 313
    .line 314
    sget p2, Lcom/kubi/spot/R$id;->layoutDoPrice:I

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0}, Ll20/h;->e()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 321
    move-result-object p1

    .line 322
    .line 323
    sget p2, Lcom/kubi/spot/R$id;->rlLimitPrice:I

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, Ll20/h;->e()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 330
    move-result-object p1

    .line 331
    .line 332
    sget p2, Lcom/kubi/spot/R$id;->tv_do_condition:I

    .line 333
    .line 334
    sget v1, Lcom/kubi/spot/R$string;->oco_limit:I

    .line 335
    .line 336
    new-array v0, v0, [Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    invoke-virtual {p3, v1, v0}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 340
    move-result-object p3

    .line 341
    .line 342
    .line 343
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 344
    return-void

    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    :sswitch_data_0
    .sparse-switch
        0x5bc1682 -> :sswitch_5
        0x5bc2241 -> :sswitch_4
        0x5bc30c9 -> :sswitch_3
        0x61ebb09 -> :sswitch_2
        0x61ec6c8 -> :sswitch_1
        0x61ed550 -> :sswitch_0
    .end sparse-switch
.end method

.method public b(Lcom/kubi/spot/entity/DelegationEntity;)I
    .locals 1
    .param p1    # Lcom/kubi/spot/entity/DelegationEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "item"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget p1, Lcom/kubi/spot/R$layout;->kucoin_delegation_detail_oco_header:I

    .line 8
    return p1
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
.end method
