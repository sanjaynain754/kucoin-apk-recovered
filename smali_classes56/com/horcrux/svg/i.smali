.class public Lcom/horcrux/svg/i;
.super Ljava/lang/Object;
.source "PropHelper.java"


# direct methods
.method public static a(Lcom/horcrux/svg/SVGLength;DDDD)D
    .locals 3

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    return-wide p3

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/SVGLength;->b:Lcom/horcrux/svg/SVGLength$UnitType;

    .line 6
    .line 7
    iget-wide v1, p0, Lcom/horcrux/svg/SVGLength;->a:D

    .line 8
    .line 9
    sget-object p0, Lcom/horcrux/svg/i$a;->a:[I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    move-result v0

    .line 14
    .line 15
    aget p0, p0, v0

    .line 16
    .line 17
    .line 18
    packed-switch p0, :pswitch_data_0

    .line 19
    :goto_0
    mul-double/2addr v1, p5

    .line 20
    :goto_1
    add-double/2addr v1, p3

    .line 21
    return-wide v1

    .line 22
    .line 23
    :pswitch_0
    const-wide/high16 p7, 0x402e000000000000L    # 15.0

    .line 24
    goto :goto_2

    .line 25
    .line 26
    :pswitch_1
    const-wide/high16 p7, 0x3ff4000000000000L    # 1.25

    .line 27
    goto :goto_2

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    :pswitch_2
    const-wide p7, 0x4056800000000000L    # 90.0

    .line 33
    goto :goto_2

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    :pswitch_3
    const-wide p7, 0x400c58b1572580c3L    # 3.543307

    .line 39
    goto :goto_2

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    :pswitch_4
    const-wide p7, 0x4041b76ed677707aL    # 35.43307

    .line 45
    goto :goto_2

    .line 46
    .line 47
    :pswitch_5
    const-wide/high16 p0, 0x4000000000000000L    # 2.0

    .line 48
    div-double/2addr p7, p0

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :pswitch_6
    const-wide/high16 p5, 0x4059000000000000L    # 100.0

    .line 52
    div-double/2addr v1, p5

    .line 53
    mul-double/2addr v1, p1

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :pswitch_7
    const-wide/high16 p7, 0x3ff0000000000000L    # 1.0

    .line 57
    :goto_2
    :pswitch_8
    mul-double/2addr v1, p7

    .line 58
    goto :goto_0

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public static b(Ljava/lang/String;DDD)D
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    .line 13
    add-int/lit8 v4, v2, -0x1

    .line 14
    .line 15
    if-eqz v2, :cond_a

    .line 16
    .line 17
    const-string v5, "normal"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result v5

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    goto/16 :goto_6

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0, v4}, Ljava/lang/String;->codePointAt(I)I

    .line 29
    move-result v5

    .line 30
    .line 31
    const/16 v6, 0x25

    .line 32
    .line 33
    if-ne v5, v6, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 37
    move-result-object p0

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 45
    move-result-wide p3

    .line 46
    .line 47
    const-wide/high16 p5, 0x4059000000000000L    # 100.0

    .line 48
    div-double/2addr p3, p5

    .line 49
    mul-double/2addr p3, p1

    .line 50
    return-wide p3

    .line 51
    .line 52
    :cond_1
    add-int/lit8 p1, v2, -0x2

    .line 53
    .line 54
    if-lez p1, :cond_9

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 58
    move-result-object p2

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 64
    const/4 v6, -0x1

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 68
    move-result v7

    .line 69
    .line 70
    .line 71
    sparse-switch v7, :sswitch_data_0

    .line 72
    :goto_0
    move v0, v6

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :sswitch_0
    const-string v0, "px"

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    move-result p2

    .line 80
    .line 81
    if-nez p2, :cond_2

    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const/4 v0, 0x6

    .line 84
    goto :goto_1

    .line 85
    .line 86
    :sswitch_1
    const-string v0, "pt"

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    move-result p2

    .line 91
    .line 92
    if-nez p2, :cond_3

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    const/4 v0, 0x5

    .line 95
    goto :goto_1

    .line 96
    .line 97
    :sswitch_2
    const-string v0, "pc"

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    move-result p2

    .line 102
    .line 103
    if-nez p2, :cond_4

    .line 104
    goto :goto_0

    .line 105
    :cond_4
    const/4 v0, 0x4

    .line 106
    goto :goto_1

    .line 107
    .line 108
    :sswitch_3
    const-string v0, "mm"

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    move-result p2

    .line 113
    .line 114
    if-nez p2, :cond_5

    .line 115
    goto :goto_0

    .line 116
    :cond_5
    const/4 v0, 0x3

    .line 117
    goto :goto_1

    .line 118
    .line 119
    :sswitch_4
    const-string v3, "in"

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    move-result p2

    .line 124
    .line 125
    if-nez p2, :cond_8

    .line 126
    goto :goto_0

    .line 127
    .line 128
    :sswitch_5
    const-string v0, "em"

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    move-result p2

    .line 133
    .line 134
    if-nez p2, :cond_6

    .line 135
    goto :goto_0

    .line 136
    :cond_6
    move v0, v3

    .line 137
    goto :goto_1

    .line 138
    .line 139
    :sswitch_6
    const-string v0, "cm"

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    move-result p2

    .line 144
    .line 145
    if-nez p2, :cond_7

    .line 146
    goto :goto_0

    .line 147
    :cond_7
    move v0, v1

    .line 148
    .line 149
    .line 150
    :cond_8
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 151
    :goto_2
    move-wide p5, v4

    .line 152
    goto :goto_4

    .line 153
    :pswitch_0
    move v2, p1

    .line 154
    goto :goto_2

    .line 155
    .line 156
    :pswitch_1
    const-wide/high16 p5, 0x3ff4000000000000L    # 1.25

    .line 157
    :goto_3
    :pswitch_2
    move v2, p1

    .line 158
    goto :goto_4

    .line 159
    .line 160
    :pswitch_3
    const-wide/high16 p5, 0x402e000000000000L    # 15.0

    .line 161
    goto :goto_3

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    :pswitch_4
    const-wide p5, 0x400c58b1572580c3L    # 3.543307

    .line 167
    goto :goto_3

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    :pswitch_5
    const-wide p5, 0x4056800000000000L    # 90.0

    .line 173
    goto :goto_3

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    :pswitch_6
    const-wide p5, 0x4041b76ed677707aL    # 35.43307

    .line 179
    goto :goto_3

    .line 180
    .line 181
    .line 182
    :goto_4
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 183
    move-result-object p0

    .line 184
    .line 185
    .line 186
    invoke-static {p0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 187
    move-result-object p0

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 191
    move-result-wide p0

    .line 192
    mul-double/2addr p0, p5

    .line 193
    :goto_5
    mul-double/2addr p0, p3

    .line 194
    return-wide p0

    .line 195
    .line 196
    .line 197
    :cond_9
    invoke-static {p0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 198
    move-result-object p0

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 202
    move-result-wide p0

    .line 203
    goto :goto_5

    .line 204
    .line 205
    :cond_a
    :goto_6
    const-wide/16 p0, 0x0

    .line 206
    return-wide p0

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
    :sswitch_data_0
    .sparse-switch
        0xc6a -> :sswitch_6
        0xca8 -> :sswitch_5
        0xd25 -> :sswitch_4
        0xda0 -> :sswitch_3
        0xdf3 -> :sswitch_2
        0xe04 -> :sswitch_1
        0xe08 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public static c(Lcom/facebook/react/bridge/ReadableArray;[FF)I
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x6

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 13
    move-result-wide v2

    .line 14
    double-to-float v2, v2

    .line 15
    .line 16
    aput v2, p1, v0

    .line 17
    const/4 v0, 0x2

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 21
    move-result-wide v2

    .line 22
    double-to-float v2, v2

    .line 23
    const/4 v3, 0x1

    .line 24
    .line 25
    aput v2, p1, v3

    .line 26
    const/4 v2, 0x4

    .line 27
    .line 28
    .line 29
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 30
    move-result-wide v4

    .line 31
    double-to-float v4, v4

    .line 32
    mul-float/2addr v4, p2

    .line 33
    .line 34
    aput v4, p1, v0

    .line 35
    .line 36
    .line 37
    invoke-interface {p0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 38
    move-result-wide v3

    .line 39
    double-to-float v0, v3

    .line 40
    const/4 v3, 0x3

    .line 41
    .line 42
    aput v0, p1, v3

    .line 43
    .line 44
    .line 45
    invoke-interface {p0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 46
    move-result-wide v3

    .line 47
    double-to-float v0, v3

    .line 48
    .line 49
    aput v0, p1, v2

    .line 50
    const/4 v0, 0x5

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 54
    move-result-wide v2

    .line 55
    double-to-float p0, v2

    .line 56
    mul-float/2addr p0, p2

    .line 57
    .line 58
    aput p0, p1, v0

    .line 59
    return v1
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
.end method
