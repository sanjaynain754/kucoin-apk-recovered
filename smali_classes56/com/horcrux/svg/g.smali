.class public Lcom/horcrux/svg/g;
.super Ljava/lang/Object;
.source "PathParser.java"


# static fields
.field public static a:F

.field public static b:I

.field public static c:I

.field public static d:Ljava/lang/String;

.field public static e:Landroid/graphics/Path;

.field public static f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/horcrux/svg/f;",
            ">;"
        }
    .end annotation
.end field

.field public static g:F

.field public static h:F

.field public static i:F

.field public static j:F

.field public static k:F

.field public static l:F

.field public static m:Z


# direct methods
.method public static A(FFFF)V
    .locals 9

    .line 1
    .line 2
    sget v0, Lcom/horcrux/svg/g;->g:F

    .line 3
    .line 4
    const/high16 v1, 0x40000000    # 2.0f

    .line 5
    mul-float/2addr v0, v1

    .line 6
    .line 7
    sget v2, Lcom/horcrux/svg/g;->i:F

    .line 8
    .line 9
    sub-float v3, v0, v2

    .line 10
    .line 11
    sget v0, Lcom/horcrux/svg/g;->h:F

    .line 12
    mul-float/2addr v0, v1

    .line 13
    .line 14
    sget v1, Lcom/horcrux/svg/g;->j:F

    .line 15
    .line 16
    sub-float v4, v0, v1

    .line 17
    .line 18
    sput p0, Lcom/horcrux/svg/g;->i:F

    .line 19
    .line 20
    sput p1, Lcom/horcrux/svg/g;->j:F

    .line 21
    move v5, p0

    .line 22
    move v6, p1

    .line 23
    move v7, p2

    .line 24
    move v8, p3

    .line 25
    .line 26
    .line 27
    invoke-static/range {v3 .. v8}, Lcom/horcrux/svg/g;->e(FFFFFF)V

    .line 28
    return-void
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

.method public static B(FF)V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/horcrux/svg/g;->g:F

    .line 3
    add-float/2addr p0, v0

    .line 4
    .line 5
    sget v0, Lcom/horcrux/svg/g;->h:F

    .line 6
    add-float/2addr p1, v0

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Lcom/horcrux/svg/g;->C(FF)V

    .line 10
    return-void
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
.end method

.method public static C(FF)V
    .locals 3

    .line 1
    .line 2
    sget v0, Lcom/horcrux/svg/g;->g:F

    .line 3
    .line 4
    const/high16 v1, 0x40000000    # 2.0f

    .line 5
    mul-float/2addr v0, v1

    .line 6
    .line 7
    sget v2, Lcom/horcrux/svg/g;->i:F

    .line 8
    sub-float/2addr v0, v2

    .line 9
    .line 10
    sget v2, Lcom/horcrux/svg/g;->h:F

    .line 11
    mul-float/2addr v2, v1

    .line 12
    .line 13
    sget v1, Lcom/horcrux/svg/g;->j:F

    .line 14
    sub-float/2addr v2, v1

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v2, p0, p1}, Lcom/horcrux/svg/g;->u(FFFF)V

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
.end method

.method public static a(FFFZZFF)V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/horcrux/svg/g;->g:F

    .line 3
    add-float/2addr p5, v0

    .line 4
    .line 5
    sget v0, Lcom/horcrux/svg/g;->h:F

    .line 6
    add-float/2addr p6, v0

    .line 7
    .line 8
    .line 9
    invoke-static/range {p0 .. p6}, Lcom/horcrux/svg/g;->b(FFFZZFF)V

    .line 10
    return-void
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

.method public static b(FFFZZFF)V
    .locals 21

    .line 1
    .line 2
    move/from16 v0, p3

    .line 3
    .line 4
    move/from16 v6, p4

    .line 5
    .line 6
    sget v1, Lcom/horcrux/svg/g;->g:F

    .line 7
    .line 8
    sget v2, Lcom/horcrux/svg/g;->h:F

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    cmpl-float v4, p1, v3

    .line 12
    .line 13
    if-nez v4, :cond_1

    .line 14
    .line 15
    cmpl-float v4, p0, v3

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    sub-float v4, p6, v2

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    move/from16 v4, p0

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    move/from16 v4, p1

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 29
    move-result v4

    .line 30
    .line 31
    cmpl-float v5, p0, v3

    .line 32
    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    sub-float v5, p5, v1

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_2
    move/from16 v5, p0

    .line 39
    .line 40
    .line 41
    :goto_1
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 42
    move-result v5

    .line 43
    .line 44
    cmpl-float v7, v5, v3

    .line 45
    .line 46
    if-eqz v7, :cond_b

    .line 47
    .line 48
    cmpl-float v7, v4, v3

    .line 49
    .line 50
    if-eqz v7, :cond_b

    .line 51
    .line 52
    cmpl-float v7, p5, v1

    .line 53
    .line 54
    if-nez v7, :cond_3

    .line 55
    .line 56
    cmpl-float v7, p6, v2

    .line 57
    .line 58
    if-nez v7, :cond_3

    .line 59
    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :cond_3
    move/from16 v7, p2

    .line 63
    float-to-double v7, v7

    .line 64
    .line 65
    .line 66
    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    .line 67
    move-result-wide v7

    .line 68
    double-to-float v7, v7

    .line 69
    float-to-double v8, v7

    .line 70
    .line 71
    .line 72
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 73
    move-result-wide v10

    .line 74
    double-to-float v10, v10

    .line 75
    .line 76
    .line 77
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 78
    move-result-wide v8

    .line 79
    double-to-float v8, v8

    .line 80
    .line 81
    sub-float v9, p5, v1

    .line 82
    .line 83
    sub-float v11, p6, v2

    .line 84
    .line 85
    mul-float v12, v10, v9

    .line 86
    .line 87
    const/high16 v13, 0x40000000    # 2.0f

    .line 88
    div-float/2addr v12, v13

    .line 89
    .line 90
    mul-float v14, v8, v11

    .line 91
    div-float/2addr v14, v13

    .line 92
    add-float/2addr v12, v14

    .line 93
    neg-float v14, v8

    .line 94
    .line 95
    mul-float v15, v14, v9

    .line 96
    div-float/2addr v15, v13

    .line 97
    .line 98
    mul-float v16, v10, v11

    .line 99
    .line 100
    div-float v16, v16, v13

    .line 101
    .line 102
    add-float v15, v15, v16

    .line 103
    .line 104
    mul-float v16, v5, v5

    .line 105
    .line 106
    mul-float v17, v16, v4

    .line 107
    .line 108
    mul-float v17, v17, v4

    .line 109
    .line 110
    mul-float v18, v4, v4

    .line 111
    .line 112
    mul-float v18, v18, v12

    .line 113
    .line 114
    mul-float v18, v18, v12

    .line 115
    .line 116
    mul-float v16, v16, v15

    .line 117
    .line 118
    mul-float v16, v16, v15

    .line 119
    .line 120
    sub-float v19, v17, v16

    .line 121
    .line 122
    sub-float v19, v19, v18

    .line 123
    .line 124
    cmpg-float v20, v19, v3

    .line 125
    .line 126
    if-gez v20, :cond_4

    .line 127
    .line 128
    const/high16 v12, 0x3f800000    # 1.0f

    .line 129
    .line 130
    div-float v19, v19, v17

    .line 131
    .line 132
    sub-float v12, v12, v19

    .line 133
    .line 134
    move/from16 v17, v3

    .line 135
    .line 136
    move/from16 p1, v4

    .line 137
    float-to-double v3, v12

    .line 138
    .line 139
    .line 140
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 141
    move-result-wide v3

    .line 142
    double-to-float v3, v3

    .line 143
    mul-float/2addr v5, v3

    .line 144
    .line 145
    mul-float v4, p1, v3

    .line 146
    .line 147
    div-float v3, v9, v13

    .line 148
    .line 149
    div-float v12, v11, v13

    .line 150
    goto :goto_2

    .line 151
    .line 152
    :cond_4
    move/from16 v17, v3

    .line 153
    .line 154
    move/from16 p1, v4

    .line 155
    .line 156
    add-float v16, v16, v18

    .line 157
    .line 158
    div-float v3, v19, v16

    .line 159
    float-to-double v3, v3

    .line 160
    .line 161
    .line 162
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 163
    move-result-wide v3

    .line 164
    double-to-float v3, v3

    .line 165
    .line 166
    if-ne v0, v6, :cond_5

    .line 167
    neg-float v3, v3

    .line 168
    :cond_5
    neg-float v4, v3

    .line 169
    mul-float/2addr v4, v15

    .line 170
    mul-float/2addr v4, v5

    .line 171
    .line 172
    div-float v4, v4, p1

    .line 173
    mul-float/2addr v3, v12

    .line 174
    .line 175
    mul-float v3, v3, p1

    .line 176
    div-float/2addr v3, v5

    .line 177
    .line 178
    mul-float v12, v10, v4

    .line 179
    .line 180
    mul-float v15, v8, v3

    .line 181
    sub-float/2addr v12, v15

    .line 182
    .line 183
    div-float v15, v9, v13

    .line 184
    add-float/2addr v12, v15

    .line 185
    mul-float/2addr v4, v8

    .line 186
    mul-float/2addr v3, v10

    .line 187
    add-float/2addr v4, v3

    .line 188
    .line 189
    div-float v3, v11, v13

    .line 190
    add-float/2addr v3, v4

    .line 191
    move v4, v12

    .line 192
    move v12, v3

    .line 193
    move v3, v4

    .line 194
    .line 195
    move/from16 v4, p1

    .line 196
    .line 197
    :goto_2
    div-float v13, v10, v5

    .line 198
    div-float/2addr v8, v5

    .line 199
    div-float/2addr v14, v4

    .line 200
    div-float/2addr v10, v4

    .line 201
    neg-float v15, v3

    .line 202
    .line 203
    mul-float v16, v14, v15

    .line 204
    neg-float v0, v12

    .line 205
    .line 206
    mul-float v18, v10, v0

    .line 207
    .line 208
    move/from16 v19, v0

    .line 209
    .line 210
    add-float v0, v16, v18

    .line 211
    .line 212
    move/from16 v16, v1

    .line 213
    float-to-double v0, v0

    .line 214
    mul-float/2addr v15, v13

    .line 215
    .line 216
    mul-float v18, v8, v19

    .line 217
    .line 218
    add-float v15, v15, v18

    .line 219
    .line 220
    move/from16 v18, v2

    .line 221
    .line 222
    move/from16 v19, v3

    .line 223
    float-to-double v2, v15

    .line 224
    .line 225
    .line 226
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 227
    move-result-wide v0

    .line 228
    double-to-float v0, v0

    .line 229
    .line 230
    sub-float v1, v9, v19

    .line 231
    mul-float/2addr v14, v1

    .line 232
    .line 233
    sub-float v2, v11, v12

    .line 234
    mul-float/2addr v10, v2

    .line 235
    add-float/2addr v14, v10

    .line 236
    float-to-double v14, v14

    .line 237
    mul-float/2addr v13, v1

    .line 238
    mul-float/2addr v8, v2

    .line 239
    add-float/2addr v13, v8

    .line 240
    float-to-double v1, v13

    .line 241
    .line 242
    .line 243
    invoke-static {v14, v15, v1, v2}, Ljava/lang/Math;->atan2(DD)D

    .line 244
    move-result-wide v1

    .line 245
    double-to-float v1, v1

    .line 246
    .line 247
    add-float v3, v19, v16

    .line 248
    .line 249
    add-float v12, v12, v18

    .line 250
    .line 251
    add-float v9, v9, v16

    .line 252
    .line 253
    add-float v11, v11, v18

    .line 254
    .line 255
    .line 256
    invoke-static {}, Lcom/horcrux/svg/g;->w()V

    .line 257
    .line 258
    sput v9, Lcom/horcrux/svg/g;->i:F

    .line 259
    .line 260
    sput v9, Lcom/horcrux/svg/g;->g:F

    .line 261
    .line 262
    sput v11, Lcom/horcrux/svg/g;->j:F

    .line 263
    .line 264
    sput v11, Lcom/horcrux/svg/g;->h:F

    .line 265
    .line 266
    cmpl-float v2, v5, v4

    .line 267
    .line 268
    if-nez v2, :cond_6

    .line 269
    .line 270
    cmpl-float v2, v7, v17

    .line 271
    .line 272
    if-eqz v2, :cond_7

    .line 273
    :cond_6
    move v2, v4

    .line 274
    move v4, v0

    .line 275
    move v0, v3

    .line 276
    move v3, v2

    .line 277
    move v2, v5

    .line 278
    move v5, v1

    .line 279
    move v1, v12

    .line 280
    goto :goto_5

    .line 281
    :cond_7
    float-to-double v7, v0

    .line 282
    .line 283
    .line 284
    invoke-static {v7, v8}, Ljava/lang/Math;->toDegrees(D)D

    .line 285
    move-result-wide v7

    .line 286
    double-to-float v0, v7

    .line 287
    float-to-double v1, v1

    .line 288
    .line 289
    .line 290
    invoke-static {v1, v2}, Ljava/lang/Math;->toDegrees(D)D

    .line 291
    move-result-wide v1

    .line 292
    double-to-float v1, v1

    .line 293
    .line 294
    sub-float v1, v0, v1

    .line 295
    .line 296
    const/high16 v2, 0x43b40000    # 360.0f

    .line 297
    rem-float/2addr v1, v2

    .line 298
    .line 299
    .line 300
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 301
    move-result v1

    .line 302
    .line 303
    const/high16 v4, 0x43340000    # 180.0f

    .line 304
    .line 305
    if-eqz p3, :cond_8

    .line 306
    .line 307
    cmpg-float v4, v1, v4

    .line 308
    .line 309
    if-gez v4, :cond_9

    .line 310
    .line 311
    :goto_3
    sub-float v1, v2, v1

    .line 312
    goto :goto_4

    .line 313
    .line 314
    :cond_8
    cmpl-float v4, v1, v4

    .line 315
    .line 316
    if-lez v4, :cond_9

    .line 317
    goto :goto_3

    .line 318
    .line 319
    :cond_9
    :goto_4
    if-nez v6, :cond_a

    .line 320
    neg-float v1, v1

    .line 321
    .line 322
    :cond_a
    new-instance v2, Landroid/graphics/RectF;

    .line 323
    .line 324
    sub-float v4, v3, v5

    .line 325
    .line 326
    sget v6, Lcom/horcrux/svg/g;->a:F

    .line 327
    mul-float/2addr v4, v6

    .line 328
    .line 329
    sub-float v7, v12, v5

    .line 330
    mul-float/2addr v7, v6

    .line 331
    add-float/2addr v3, v5

    .line 332
    mul-float/2addr v3, v6

    .line 333
    add-float/2addr v12, v5

    .line 334
    mul-float/2addr v12, v6

    .line 335
    .line 336
    .line 337
    invoke-direct {v2, v4, v7, v3, v12}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 338
    .line 339
    sget-object v3, Lcom/horcrux/svg/g;->e:Landroid/graphics/Path;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v3, v2, v0, v1}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 343
    .line 344
    sget-object v0, Lcom/horcrux/svg/g;->f:Ljava/util/ArrayList;

    .line 345
    .line 346
    new-instance v1, Lcom/horcrux/svg/f;

    .line 347
    .line 348
    sget-object v2, Lcom/horcrux/svg/ElementType;->kCGPathElementAddCurveToPoint:Lcom/horcrux/svg/ElementType;

    .line 349
    .line 350
    new-instance v3, Lcom/horcrux/svg/h;

    .line 351
    float-to-double v4, v9

    .line 352
    float-to-double v6, v11

    .line 353
    .line 354
    .line 355
    invoke-direct {v3, v4, v5, v6, v7}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 356
    .line 357
    .line 358
    filled-new-array {v3}, [Lcom/horcrux/svg/h;

    .line 359
    move-result-object v3

    .line 360
    .line 361
    .line 362
    invoke-direct {v1, v2, v3}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    return-void

    .line 367
    .line 368
    .line 369
    :goto_5
    invoke-static/range {v0 .. v7}, Lcom/horcrux/svg/g;->c(FFFFFFZF)V

    .line 370
    return-void

    .line 371
    .line 372
    .line 373
    :cond_b
    :goto_6
    invoke-static/range {p5 .. p6}, Lcom/horcrux/svg/g;->l(FF)V

    .line 374
    return-void
.end method

.method public static c(FFFFFFZF)V
    .locals 23

    .line 1
    .line 2
    move/from16 v0, p4

    .line 3
    .line 4
    move/from16 v1, p7

    .line 5
    float-to-double v1, v1

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 9
    move-result-wide v3

    .line 10
    double-to-float v3, v3

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 14
    move-result-wide v1

    .line 15
    double-to-float v1, v1

    .line 16
    .line 17
    mul-float v2, v3, p2

    .line 18
    neg-float v4, v1

    .line 19
    .line 20
    mul-float v4, v4, p3

    .line 21
    .line 22
    mul-float v1, v1, p2

    .line 23
    .line 24
    mul-float v3, v3, p3

    .line 25
    .line 26
    sub-float v5, p5, v0

    .line 27
    const/4 v6, 0x0

    .line 28
    .line 29
    cmpg-float v7, v5, v6

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const-wide v8, 0x401921fb54442d18L    # 6.283185307179586

    .line 35
    .line 36
    if-gez v7, :cond_0

    .line 37
    .line 38
    if-eqz p6, :cond_0

    .line 39
    float-to-double v5, v5

    .line 40
    add-double/2addr v5, v8

    .line 41
    :goto_0
    double-to-float v5, v5

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :cond_0
    cmpl-float v6, v5, v6

    .line 45
    .line 46
    if-lez v6, :cond_1

    .line 47
    .line 48
    if-nez p6, :cond_1

    .line 49
    float-to-double v5, v5

    .line 50
    sub-double/2addr v5, v8

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    float-to-double v6, v5

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    const-wide v8, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 58
    div-double/2addr v6, v8

    .line 59
    .line 60
    .line 61
    invoke-static {v6, v7}, Lcom/horcrux/svg/g;->v(D)D

    .line 62
    move-result-wide v6

    .line 63
    .line 64
    .line 65
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    .line 66
    move-result-wide v6

    .line 67
    .line 68
    .line 69
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 70
    move-result-wide v6

    .line 71
    double-to-int v6, v6

    .line 72
    int-to-float v7, v6

    .line 73
    div-float/2addr v5, v7

    .line 74
    .line 75
    const/high16 v7, 0x40800000    # 4.0f

    .line 76
    .line 77
    div-float v7, v5, v7

    .line 78
    float-to-double v7, v7

    .line 79
    .line 80
    .line 81
    invoke-static {v7, v8}, Ljava/lang/Math;->tan(D)D

    .line 82
    move-result-wide v7

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    const-wide v9, 0x3ff5555555555555L    # 1.3333333333333333

    .line 88
    mul-double/2addr v7, v9

    .line 89
    double-to-float v7, v7

    .line 90
    float-to-double v8, v0

    .line 91
    .line 92
    .line 93
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 94
    move-result-wide v10

    .line 95
    double-to-float v10, v10

    .line 96
    .line 97
    .line 98
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 99
    move-result-wide v8

    .line 100
    double-to-float v8, v8

    .line 101
    const/4 v9, 0x0

    .line 102
    .line 103
    :goto_2
    if-ge v9, v6, :cond_2

    .line 104
    .line 105
    mul-float v11, v7, v8

    .line 106
    .line 107
    sub-float v11, v10, v11

    .line 108
    mul-float/2addr v10, v7

    .line 109
    add-float/2addr v8, v10

    .line 110
    add-float/2addr v0, v5

    .line 111
    float-to-double v12, v0

    .line 112
    .line 113
    .line 114
    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    .line 115
    move-result-wide v14

    .line 116
    double-to-float v10, v14

    .line 117
    .line 118
    .line 119
    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    .line 120
    move-result-wide v12

    .line 121
    double-to-float v12, v12

    .line 122
    .line 123
    mul-float v13, v7, v12

    .line 124
    add-float/2addr v13, v10

    .line 125
    .line 126
    mul-float v14, v7, v10

    .line 127
    .line 128
    sub-float v14, v12, v14

    .line 129
    .line 130
    mul-float v15, v2, v11

    .line 131
    .line 132
    add-float v15, p0, v15

    .line 133
    .line 134
    mul-float v16, v4, v8

    .line 135
    .line 136
    add-float v15, v15, v16

    .line 137
    mul-float/2addr v11, v1

    .line 138
    .line 139
    add-float v11, p1, v11

    .line 140
    mul-float/2addr v8, v3

    .line 141
    add-float/2addr v11, v8

    .line 142
    .line 143
    mul-float v8, v2, v13

    .line 144
    .line 145
    add-float v8, p0, v8

    .line 146
    .line 147
    mul-float v16, v4, v14

    .line 148
    .line 149
    add-float v8, v8, v16

    .line 150
    mul-float/2addr v13, v1

    .line 151
    .line 152
    add-float v13, p1, v13

    .line 153
    mul-float/2addr v14, v3

    .line 154
    add-float/2addr v13, v14

    .line 155
    .line 156
    mul-float v14, v2, v10

    .line 157
    .line 158
    add-float v14, p0, v14

    .line 159
    .line 160
    mul-float v16, v4, v12

    .line 161
    .line 162
    add-float v14, v14, v16

    .line 163
    .line 164
    mul-float v16, v1, v10

    .line 165
    .line 166
    add-float v16, p1, v16

    .line 167
    .line 168
    mul-float v17, v3, v12

    .line 169
    .line 170
    move/from16 p2, v0

    .line 171
    .line 172
    add-float v0, v16, v17

    .line 173
    .line 174
    sget-object v16, Lcom/horcrux/svg/g;->e:Landroid/graphics/Path;

    .line 175
    .line 176
    sget v17, Lcom/horcrux/svg/g;->a:F

    .line 177
    .line 178
    move/from16 v18, v17

    .line 179
    .line 180
    mul-float v17, v15, v18

    .line 181
    .line 182
    move/from16 v19, v18

    .line 183
    .line 184
    mul-float v18, v11, v19

    .line 185
    .line 186
    move/from16 v20, v19

    .line 187
    .line 188
    mul-float v19, v8, v20

    .line 189
    .line 190
    move/from16 v21, v20

    .line 191
    .line 192
    mul-float v20, v13, v21

    .line 193
    .line 194
    move/from16 v22, v21

    .line 195
    .line 196
    mul-float v21, v14, v22

    .line 197
    .line 198
    mul-float v22, v22, v0

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v16 .. v22}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 202
    .line 203
    move/from16 p7, v1

    .line 204
    .line 205
    sget-object v1, Lcom/horcrux/svg/g;->f:Ljava/util/ArrayList;

    .line 206
    .line 207
    move/from16 v16, v2

    .line 208
    .line 209
    new-instance v2, Lcom/horcrux/svg/f;

    .line 210
    .line 211
    move/from16 p3, v3

    .line 212
    .line 213
    sget-object v3, Lcom/horcrux/svg/ElementType;->kCGPathElementAddCurveToPoint:Lcom/horcrux/svg/ElementType;

    .line 214
    .line 215
    move/from16 v17, v4

    .line 216
    .line 217
    new-instance v4, Lcom/horcrux/svg/h;

    .line 218
    .line 219
    move/from16 p5, v5

    .line 220
    .line 221
    move/from16 v18, v6

    .line 222
    float-to-double v5, v15

    .line 223
    move v15, v9

    .line 224
    .line 225
    move/from16 v19, v10

    .line 226
    float-to-double v9, v11

    .line 227
    .line 228
    .line 229
    invoke-direct {v4, v5, v6, v9, v10}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 230
    .line 231
    new-instance v5, Lcom/horcrux/svg/h;

    .line 232
    float-to-double v8, v8

    .line 233
    float-to-double v10, v13

    .line 234
    .line 235
    .line 236
    invoke-direct {v5, v8, v9, v10, v11}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 237
    .line 238
    new-instance v6, Lcom/horcrux/svg/h;

    .line 239
    float-to-double v8, v14

    .line 240
    float-to-double v10, v0

    .line 241
    .line 242
    .line 243
    invoke-direct {v6, v8, v9, v10, v11}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 244
    .line 245
    .line 246
    filled-new-array {v4, v5, v6}, [Lcom/horcrux/svg/h;

    .line 247
    move-result-object v0

    .line 248
    .line 249
    .line 250
    invoke-direct {v2, v3, v0}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    add-int/lit8 v9, v15, 0x1

    .line 256
    .line 257
    move/from16 v0, p2

    .line 258
    .line 259
    move/from16 v3, p3

    .line 260
    .line 261
    move/from16 v5, p5

    .line 262
    .line 263
    move/from16 v1, p7

    .line 264
    move v8, v12

    .line 265
    .line 266
    move/from16 v2, v16

    .line 267
    .line 268
    move/from16 v4, v17

    .line 269
    .line 270
    move/from16 v6, v18

    .line 271
    .line 272
    move/from16 v10, v19

    .line 273
    .line 274
    goto/16 :goto_2

    .line 275
    :cond_2
    return-void
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
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
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
.end method

.method public static d()V
    .locals 8

    .line 1
    .line 2
    sget-boolean v0, Lcom/horcrux/svg/g;->m:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget v0, Lcom/horcrux/svg/g;->k:F

    .line 7
    .line 8
    sput v0, Lcom/horcrux/svg/g;->g:F

    .line 9
    .line 10
    sget v0, Lcom/horcrux/svg/g;->l:F

    .line 11
    .line 12
    sput v0, Lcom/horcrux/svg/g;->h:F

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    sput-boolean v0, Lcom/horcrux/svg/g;->m:Z

    .line 16
    .line 17
    sget-object v0, Lcom/horcrux/svg/g;->e:Landroid/graphics/Path;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 21
    .line 22
    sget-object v0, Lcom/horcrux/svg/g;->f:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v1, Lcom/horcrux/svg/f;

    .line 25
    .line 26
    sget-object v2, Lcom/horcrux/svg/ElementType;->kCGPathElementCloseSubpath:Lcom/horcrux/svg/ElementType;

    .line 27
    .line 28
    new-instance v3, Lcom/horcrux/svg/h;

    .line 29
    .line 30
    sget v4, Lcom/horcrux/svg/g;->g:F

    .line 31
    float-to-double v4, v4

    .line 32
    .line 33
    sget v6, Lcom/horcrux/svg/g;->h:F

    .line 34
    float-to-double v6, v6

    .line 35
    .line 36
    .line 37
    invoke-direct {v3, v4, v5, v6, v7}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 38
    .line 39
    .line 40
    filled-new-array {v3}, [Lcom/horcrux/svg/h;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, v2, v3}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    :cond_0
    return-void
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
.end method

.method public static e(FFFFFF)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/horcrux/svg/g;->w()V

    .line 4
    .line 5
    sput p4, Lcom/horcrux/svg/g;->g:F

    .line 6
    .line 7
    sput p5, Lcom/horcrux/svg/g;->h:F

    .line 8
    .line 9
    sget-object v0, Lcom/horcrux/svg/g;->e:Landroid/graphics/Path;

    .line 10
    .line 11
    sget v1, Lcom/horcrux/svg/g;->a:F

    .line 12
    move v2, v1

    .line 13
    .line 14
    mul-float v1, p0, v2

    .line 15
    move v3, v2

    .line 16
    .line 17
    mul-float v2, p1, v3

    .line 18
    move v4, v3

    .line 19
    .line 20
    mul-float v3, p2, v4

    .line 21
    move v5, v4

    .line 22
    .line 23
    mul-float v4, p3, v5

    .line 24
    move v6, v5

    .line 25
    .line 26
    mul-float v5, p4, v6

    .line 27
    mul-float/2addr v6, p5

    .line 28
    .line 29
    .line 30
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 31
    .line 32
    sget-object v0, Lcom/horcrux/svg/g;->f:Ljava/util/ArrayList;

    .line 33
    .line 34
    new-instance v1, Lcom/horcrux/svg/f;

    .line 35
    .line 36
    sget-object v2, Lcom/horcrux/svg/ElementType;->kCGPathElementAddCurveToPoint:Lcom/horcrux/svg/ElementType;

    .line 37
    .line 38
    new-instance v3, Lcom/horcrux/svg/h;

    .line 39
    float-to-double v4, p0

    .line 40
    float-to-double p0, p1

    .line 41
    .line 42
    .line 43
    invoke-direct {v3, v4, v5, p0, p1}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 44
    .line 45
    new-instance p0, Lcom/horcrux/svg/h;

    .line 46
    float-to-double p1, p2

    .line 47
    float-to-double v4, p3

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, p1, p2, v4, v5}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 51
    .line 52
    new-instance p1, Lcom/horcrux/svg/h;

    .line 53
    float-to-double p2, p4

    .line 54
    float-to-double p4, p5

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, p2, p3, p4, p5}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 58
    .line 59
    .line 60
    filled-new-array {v3, p0, p1}, [Lcom/horcrux/svg/h;

    .line 61
    move-result-object p0

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, v2, p0}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    return-void
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
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
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
.end method

.method public static f(FFFFFF)V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/horcrux/svg/g;->g:F

    .line 3
    add-float/2addr p0, v0

    .line 4
    .line 5
    sget v1, Lcom/horcrux/svg/g;->h:F

    .line 6
    add-float/2addr p1, v1

    .line 7
    add-float/2addr p2, v0

    .line 8
    add-float/2addr p3, v1

    .line 9
    add-float/2addr p4, v0

    .line 10
    add-float/2addr p5, v1

    .line 11
    .line 12
    .line 13
    invoke-static/range {p0 .. p5}, Lcom/horcrux/svg/g;->g(FFFFFF)V

    .line 14
    return-void
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
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
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
.end method

.method public static g(FFFFFF)V
    .locals 0

    .line 1
    .line 2
    sput p2, Lcom/horcrux/svg/g;->i:F

    .line 3
    .line 4
    sput p3, Lcom/horcrux/svg/g;->j:F

    .line 5
    .line 6
    .line 7
    invoke-static/range {p0 .. p5}, Lcom/horcrux/svg/g;->e(FFFFFF)V

    .line 8
    return-void
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
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
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
.end method

.method public static h(C)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Character;->isUpperCase(C)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static i(C)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    sparse-switch p0, :sswitch_data_0

    .line 4
    const/4 p0, 0x0

    .line 5
    return p0

    .line 6
    :sswitch_0
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    nop

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
    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_0
        0x43 -> :sswitch_0
        0x48 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4d -> :sswitch_0
        0x51 -> :sswitch_0
        0x53 -> :sswitch_0
        0x54 -> :sswitch_0
        0x56 -> :sswitch_0
        0x5a -> :sswitch_0
        0x61 -> :sswitch_0
        0x63 -> :sswitch_0
        0x68 -> :sswitch_0
        0x6c -> :sswitch_0
        0x6d -> :sswitch_0
        0x71 -> :sswitch_0
        0x73 -> :sswitch_0
        0x74 -> :sswitch_0
        0x76 -> :sswitch_0
        0x7a -> :sswitch_0
    .end sparse-switch
.end method

.method public static j(C)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x30

    .line 3
    .line 4
    if-lt p0, v0, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x39

    .line 7
    .line 8
    if-le p0, v0, :cond_2

    .line 9
    .line 10
    :cond_0
    const/16 v0, 0x2e

    .line 11
    .line 12
    if-eq p0, v0, :cond_2

    .line 13
    .line 14
    const/16 v0, 0x2d

    .line 15
    .line 16
    if-eq p0, v0, :cond_2

    .line 17
    .line 18
    const/16 v0, 0x2b

    .line 19
    .line 20
    if-ne p0, v0, :cond_1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
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
.end method

.method public static k(FF)V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/horcrux/svg/g;->g:F

    .line 3
    add-float/2addr p0, v0

    .line 4
    .line 5
    sget v0, Lcom/horcrux/svg/g;->h:F

    .line 6
    add-float/2addr p1, v0

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Lcom/horcrux/svg/g;->l(FF)V

    .line 10
    return-void
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
.end method

.method public static l(FF)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/horcrux/svg/g;->w()V

    .line 4
    .line 5
    sput p0, Lcom/horcrux/svg/g;->g:F

    .line 6
    .line 7
    sput p0, Lcom/horcrux/svg/g;->i:F

    .line 8
    .line 9
    sput p1, Lcom/horcrux/svg/g;->h:F

    .line 10
    .line 11
    sput p1, Lcom/horcrux/svg/g;->j:F

    .line 12
    .line 13
    sget-object v0, Lcom/horcrux/svg/g;->e:Landroid/graphics/Path;

    .line 14
    .line 15
    sget v1, Lcom/horcrux/svg/g;->a:F

    .line 16
    .line 17
    mul-float v2, p0, v1

    .line 18
    mul-float/2addr v1, p1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 22
    .line 23
    sget-object v0, Lcom/horcrux/svg/g;->f:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v1, Lcom/horcrux/svg/f;

    .line 26
    .line 27
    sget-object v2, Lcom/horcrux/svg/ElementType;->kCGPathElementAddLineToPoint:Lcom/horcrux/svg/ElementType;

    .line 28
    .line 29
    new-instance v3, Lcom/horcrux/svg/h;

    .line 30
    float-to-double v4, p0

    .line 31
    float-to-double p0, p1

    .line 32
    .line 33
    .line 34
    invoke-direct {v3, v4, v5, p0, p1}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 35
    .line 36
    .line 37
    filled-new-array {v3}, [Lcom/horcrux/svg/h;

    .line 38
    move-result-object p0

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, v2, p0}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    return-void
    .line 46
    .line 47
.end method

.method public static m(FF)V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/horcrux/svg/g;->g:F

    .line 3
    add-float/2addr p0, v0

    .line 4
    .line 5
    sget v0, Lcom/horcrux/svg/g;->h:F

    .line 6
    add-float/2addr p1, v0

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Lcom/horcrux/svg/g;->n(FF)V

    .line 10
    return-void
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
.end method

.method public static n(FF)V
    .locals 6

    .line 1
    .line 2
    sput p0, Lcom/horcrux/svg/g;->g:F

    .line 3
    .line 4
    sput p0, Lcom/horcrux/svg/g;->i:F

    .line 5
    .line 6
    sput p0, Lcom/horcrux/svg/g;->k:F

    .line 7
    .line 8
    sput p1, Lcom/horcrux/svg/g;->h:F

    .line 9
    .line 10
    sput p1, Lcom/horcrux/svg/g;->j:F

    .line 11
    .line 12
    sput p1, Lcom/horcrux/svg/g;->l:F

    .line 13
    .line 14
    sget-object v0, Lcom/horcrux/svg/g;->e:Landroid/graphics/Path;

    .line 15
    .line 16
    sget v1, Lcom/horcrux/svg/g;->a:F

    .line 17
    .line 18
    mul-float v2, p0, v1

    .line 19
    mul-float/2addr v1, p1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 23
    .line 24
    sget-object v0, Lcom/horcrux/svg/g;->f:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v1, Lcom/horcrux/svg/f;

    .line 27
    .line 28
    sget-object v2, Lcom/horcrux/svg/ElementType;->kCGPathElementMoveToPoint:Lcom/horcrux/svg/ElementType;

    .line 29
    .line 30
    new-instance v3, Lcom/horcrux/svg/h;

    .line 31
    float-to-double v4, p0

    .line 32
    float-to-double p0, p1

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v4, v5, p0, p1}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 36
    .line 37
    .line 38
    filled-new-array {v3}, [Lcom/horcrux/svg/h;

    .line 39
    move-result-object p0

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v2, p0}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    return-void
    .line 47
.end method

.method public static o(Ljava/lang/String;)Landroid/graphics/Path;
    .locals 23

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/horcrux/svg/g;->f:Ljava/util/ArrayList;

    .line 8
    .line 9
    new-instance v0, Landroid/graphics/Path;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/horcrux/svg/g;->e:Landroid/graphics/Path;

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    return-object v0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    .line 21
    move-result v0

    .line 22
    .line 23
    sput v0, Lcom/horcrux/svg/g;->c:I

    .line 24
    .line 25
    sput-object p0, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 26
    const/4 v0, 0x0

    .line 27
    .line 28
    sput v0, Lcom/horcrux/svg/g;->b:I

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    sput v1, Lcom/horcrux/svg/g;->g:F

    .line 32
    .line 33
    sput v1, Lcom/horcrux/svg/g;->h:F

    .line 34
    .line 35
    sput v1, Lcom/horcrux/svg/g;->i:F

    .line 36
    .line 37
    sput v1, Lcom/horcrux/svg/g;->j:F

    .line 38
    .line 39
    sput v1, Lcom/horcrux/svg/g;->k:F

    .line 40
    .line 41
    sput v1, Lcom/horcrux/svg/g;->l:F

    .line 42
    .line 43
    sput-boolean v0, Lcom/horcrux/svg/g;->m:Z

    .line 44
    .line 45
    const/16 v2, 0x20

    .line 46
    move v3, v2

    .line 47
    .line 48
    :cond_1
    :goto_0
    sget v4, Lcom/horcrux/svg/g;->b:I

    .line 49
    .line 50
    sget v5, Lcom/horcrux/svg/g;->c:I

    .line 51
    .line 52
    if-ge v4, v5, :cond_d

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lcom/horcrux/svg/g;->y()V

    .line 56
    .line 57
    sget v4, Lcom/horcrux/svg/g;->b:I

    .line 58
    .line 59
    sget v5, Lcom/horcrux/svg/g;->c:I

    .line 60
    .line 61
    if-lt v4, v5, :cond_2

    .line 62
    .line 63
    goto/16 :goto_6

    .line 64
    :cond_2
    const/4 v5, 0x1

    .line 65
    .line 66
    if-eq v3, v2, :cond_3

    .line 67
    move v6, v5

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move v6, v0

    .line 70
    .line 71
    :goto_1
    sget-object v7, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v4}, Ljava/lang/String;->charAt(I)C

    .line 75
    move-result v4

    .line 76
    .line 77
    const-string v7, "Unexpected character \'%c\' (i=%d, s=%s)"

    .line 78
    .line 79
    const/16 v8, 0x6d

    .line 80
    .line 81
    const/16 v9, 0x4d

    .line 82
    .line 83
    if-nez v6, :cond_5

    .line 84
    .line 85
    if-eq v4, v9, :cond_5

    .line 86
    .line 87
    if-ne v4, v8, :cond_4

    .line 88
    goto :goto_2

    .line 89
    .line 90
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 91
    .line 92
    .line 93
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    sget v2, Lcom/horcrux/svg/g;->b:I

    .line 97
    .line 98
    .line 99
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    sget-object v3, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    .line 109
    invoke-static {v7, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 114
    throw v0

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_2
    invoke-static {v4}, Lcom/horcrux/svg/g;->i(C)Z

    .line 118
    move-result v10

    .line 119
    .line 120
    if-eqz v10, :cond_6

    .line 121
    .line 122
    sget v3, Lcom/horcrux/svg/g;->b:I

    .line 123
    add-int/2addr v3, v5

    .line 124
    .line 125
    sput v3, Lcom/horcrux/svg/g;->b:I

    .line 126
    move v5, v0

    .line 127
    move v3, v4

    .line 128
    goto :goto_4

    .line 129
    .line 130
    .line 131
    :cond_6
    invoke-static {v4}, Lcom/horcrux/svg/g;->j(C)Z

    .line 132
    move-result v10

    .line 133
    .line 134
    if-eqz v10, :cond_c

    .line 135
    .line 136
    if-eqz v6, :cond_c

    .line 137
    .line 138
    const/16 v4, 0x5a

    .line 139
    .line 140
    if-eq v3, v4, :cond_b

    .line 141
    .line 142
    const/16 v4, 0x7a

    .line 143
    .line 144
    if-eq v3, v4, :cond_b

    .line 145
    .line 146
    if-eq v3, v9, :cond_8

    .line 147
    .line 148
    if-ne v3, v8, :cond_7

    .line 149
    goto :goto_3

    .line 150
    :cond_7
    move v5, v0

    .line 151
    goto :goto_4

    .line 152
    .line 153
    .line 154
    :cond_8
    :goto_3
    invoke-static {v3}, Lcom/horcrux/svg/g;->h(C)Z

    .line 155
    move-result v3

    .line 156
    .line 157
    if-eqz v3, :cond_9

    .line 158
    .line 159
    const/16 v3, 0x4c

    .line 160
    goto :goto_4

    .line 161
    .line 162
    :cond_9
    const/16 v3, 0x6c

    .line 163
    .line 164
    .line 165
    :goto_4
    invoke-static {v3}, Lcom/horcrux/svg/g;->h(C)Z

    .line 166
    move-result v4

    .line 167
    .line 168
    .line 169
    sparse-switch v3, :sswitch_data_0

    .line 170
    .line 171
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 172
    .line 173
    .line 174
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 175
    move-result-object v1

    .line 176
    .line 177
    sget-object v2, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 181
    move-result-object v1

    .line 182
    .line 183
    const-string v2, "Unexpected comand \'%c\' (s=%s)"

    .line 184
    .line 185
    .line 186
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    move-result-object v1

    .line 188
    .line 189
    .line 190
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 191
    throw v0

    .line 192
    .line 193
    .line 194
    :sswitch_0
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 195
    move-result v6

    .line 196
    .line 197
    .line 198
    invoke-static {v1, v6}, Lcom/horcrux/svg/g;->k(FF)V

    .line 199
    .line 200
    goto/16 :goto_5

    .line 201
    .line 202
    .line 203
    :sswitch_1
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 204
    move-result v6

    .line 205
    .line 206
    .line 207
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 208
    move-result v7

    .line 209
    .line 210
    .line 211
    invoke-static {v6, v7}, Lcom/horcrux/svg/g;->B(FF)V

    .line 212
    .line 213
    goto/16 :goto_5

    .line 214
    .line 215
    .line 216
    :sswitch_2
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 217
    move-result v6

    .line 218
    .line 219
    .line 220
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 221
    move-result v7

    .line 222
    .line 223
    .line 224
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 225
    move-result v10

    .line 226
    .line 227
    .line 228
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 229
    move-result v11

    .line 230
    .line 231
    .line 232
    invoke-static {v6, v7, v10, v11}, Lcom/horcrux/svg/g;->z(FFFF)V

    .line 233
    .line 234
    goto/16 :goto_5

    .line 235
    .line 236
    .line 237
    :sswitch_3
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 238
    move-result v6

    .line 239
    .line 240
    .line 241
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 242
    move-result v7

    .line 243
    .line 244
    .line 245
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 246
    move-result v10

    .line 247
    .line 248
    .line 249
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 250
    move-result v11

    .line 251
    .line 252
    .line 253
    invoke-static {v6, v7, v10, v11}, Lcom/horcrux/svg/g;->t(FFFF)V

    .line 254
    .line 255
    goto/16 :goto_5

    .line 256
    .line 257
    .line 258
    :sswitch_4
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 259
    move-result v6

    .line 260
    .line 261
    .line 262
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 263
    move-result v7

    .line 264
    .line 265
    .line 266
    invoke-static {v6, v7}, Lcom/horcrux/svg/g;->m(FF)V

    .line 267
    .line 268
    goto/16 :goto_5

    .line 269
    .line 270
    .line 271
    :sswitch_5
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 272
    move-result v6

    .line 273
    .line 274
    .line 275
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 276
    move-result v7

    .line 277
    .line 278
    .line 279
    invoke-static {v6, v7}, Lcom/horcrux/svg/g;->k(FF)V

    .line 280
    .line 281
    goto/16 :goto_5

    .line 282
    .line 283
    .line 284
    :sswitch_6
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 285
    move-result v6

    .line 286
    .line 287
    .line 288
    invoke-static {v6, v1}, Lcom/horcrux/svg/g;->k(FF)V

    .line 289
    .line 290
    goto/16 :goto_5

    .line 291
    .line 292
    .line 293
    :sswitch_7
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 294
    move-result v10

    .line 295
    .line 296
    .line 297
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 298
    move-result v11

    .line 299
    .line 300
    .line 301
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 302
    move-result v12

    .line 303
    .line 304
    .line 305
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 306
    move-result v13

    .line 307
    .line 308
    .line 309
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 310
    move-result v14

    .line 311
    .line 312
    .line 313
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 314
    move-result v15

    .line 315
    .line 316
    .line 317
    invoke-static/range {v10 .. v15}, Lcom/horcrux/svg/g;->f(FFFFFF)V

    .line 318
    .line 319
    goto/16 :goto_5

    .line 320
    .line 321
    .line 322
    :sswitch_8
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 323
    move-result v16

    .line 324
    .line 325
    .line 326
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 327
    move-result v17

    .line 328
    .line 329
    .line 330
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 331
    move-result v18

    .line 332
    .line 333
    .line 334
    invoke-static {}, Lcom/horcrux/svg/g;->p()Z

    .line 335
    move-result v19

    .line 336
    .line 337
    .line 338
    invoke-static {}, Lcom/horcrux/svg/g;->p()Z

    .line 339
    move-result v20

    .line 340
    .line 341
    .line 342
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 343
    move-result v21

    .line 344
    .line 345
    .line 346
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 347
    move-result v22

    .line 348
    .line 349
    .line 350
    invoke-static/range {v16 .. v22}, Lcom/horcrux/svg/g;->a(FFFZZFF)V

    .line 351
    .line 352
    goto/16 :goto_5

    .line 353
    .line 354
    .line 355
    :sswitch_9
    invoke-static {}, Lcom/horcrux/svg/g;->d()V

    .line 356
    .line 357
    goto/16 :goto_5

    .line 358
    .line 359
    :sswitch_a
    sget v6, Lcom/horcrux/svg/g;->g:F

    .line 360
    .line 361
    .line 362
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 363
    move-result v7

    .line 364
    .line 365
    .line 366
    invoke-static {v6, v7}, Lcom/horcrux/svg/g;->l(FF)V

    .line 367
    .line 368
    goto/16 :goto_5

    .line 369
    .line 370
    .line 371
    :sswitch_b
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 372
    move-result v6

    .line 373
    .line 374
    .line 375
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 376
    move-result v7

    .line 377
    .line 378
    .line 379
    invoke-static {v6, v7}, Lcom/horcrux/svg/g;->C(FF)V

    .line 380
    .line 381
    goto/16 :goto_5

    .line 382
    .line 383
    .line 384
    :sswitch_c
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 385
    move-result v6

    .line 386
    .line 387
    .line 388
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 389
    move-result v7

    .line 390
    .line 391
    .line 392
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 393
    move-result v10

    .line 394
    .line 395
    .line 396
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 397
    move-result v11

    .line 398
    .line 399
    .line 400
    invoke-static {v6, v7, v10, v11}, Lcom/horcrux/svg/g;->A(FFFF)V

    .line 401
    goto :goto_5

    .line 402
    .line 403
    .line 404
    :sswitch_d
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 405
    move-result v6

    .line 406
    .line 407
    .line 408
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 409
    move-result v7

    .line 410
    .line 411
    .line 412
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 413
    move-result v10

    .line 414
    .line 415
    .line 416
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 417
    move-result v11

    .line 418
    .line 419
    .line 420
    invoke-static {v6, v7, v10, v11}, Lcom/horcrux/svg/g;->u(FFFF)V

    .line 421
    goto :goto_5

    .line 422
    .line 423
    .line 424
    :sswitch_e
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 425
    move-result v6

    .line 426
    .line 427
    .line 428
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 429
    move-result v7

    .line 430
    .line 431
    .line 432
    invoke-static {v6, v7}, Lcom/horcrux/svg/g;->n(FF)V

    .line 433
    goto :goto_5

    .line 434
    .line 435
    .line 436
    :sswitch_f
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 437
    move-result v6

    .line 438
    .line 439
    .line 440
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 441
    move-result v7

    .line 442
    .line 443
    .line 444
    invoke-static {v6, v7}, Lcom/horcrux/svg/g;->l(FF)V

    .line 445
    goto :goto_5

    .line 446
    .line 447
    .line 448
    :sswitch_10
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 449
    move-result v6

    .line 450
    .line 451
    sget v7, Lcom/horcrux/svg/g;->h:F

    .line 452
    .line 453
    .line 454
    invoke-static {v6, v7}, Lcom/horcrux/svg/g;->l(FF)V

    .line 455
    goto :goto_5

    .line 456
    .line 457
    .line 458
    :sswitch_11
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 459
    move-result v10

    .line 460
    .line 461
    .line 462
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 463
    move-result v11

    .line 464
    .line 465
    .line 466
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 467
    move-result v12

    .line 468
    .line 469
    .line 470
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 471
    move-result v13

    .line 472
    .line 473
    .line 474
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 475
    move-result v14

    .line 476
    .line 477
    .line 478
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 479
    move-result v15

    .line 480
    .line 481
    .line 482
    invoke-static/range {v10 .. v15}, Lcom/horcrux/svg/g;->g(FFFFFF)V

    .line 483
    goto :goto_5

    .line 484
    .line 485
    .line 486
    :sswitch_12
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 487
    move-result v16

    .line 488
    .line 489
    .line 490
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 491
    move-result v17

    .line 492
    .line 493
    .line 494
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 495
    move-result v18

    .line 496
    .line 497
    .line 498
    invoke-static {}, Lcom/horcrux/svg/g;->p()Z

    .line 499
    move-result v19

    .line 500
    .line 501
    .line 502
    invoke-static {}, Lcom/horcrux/svg/g;->p()Z

    .line 503
    move-result v20

    .line 504
    .line 505
    .line 506
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 507
    move-result v21

    .line 508
    .line 509
    .line 510
    invoke-static {}, Lcom/horcrux/svg/g;->q()F

    .line 511
    move-result v22

    .line 512
    .line 513
    .line 514
    invoke-static/range {v16 .. v22}, Lcom/horcrux/svg/g;->b(FFFZZFF)V

    .line 515
    .line 516
    :goto_5
    if-eqz v5, :cond_1

    .line 517
    .line 518
    if-eqz v4, :cond_a

    .line 519
    move v3, v9

    .line 520
    .line 521
    goto/16 :goto_0

    .line 522
    :cond_a
    move v3, v8

    .line 523
    .line 524
    goto/16 :goto_0

    .line 525
    .line 526
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 527
    .line 528
    sget-object v1, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 532
    move-result-object v1

    .line 533
    .line 534
    const-string v2, "Unexpected number after \'z\' (s=%s)"

    .line 535
    .line 536
    .line 537
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 538
    move-result-object v1

    .line 539
    .line 540
    .line 541
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 542
    throw v0

    .line 543
    .line 544
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 545
    .line 546
    .line 547
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 548
    move-result-object v1

    .line 549
    .line 550
    sget v2, Lcom/horcrux/svg/g;->b:I

    .line 551
    .line 552
    .line 553
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 554
    move-result-object v2

    .line 555
    .line 556
    sget-object v3, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 560
    move-result-object v1

    .line 561
    .line 562
    .line 563
    invoke-static {v7, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 564
    move-result-object v1

    .line 565
    .line 566
    .line 567
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 568
    throw v0

    .line 569
    .line 570
    :cond_d
    :goto_6
    sget-object v0, Lcom/horcrux/svg/g;->e:Landroid/graphics/Path;

    .line 571
    return-object v0

    .line 572
    nop

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_12
        0x43 -> :sswitch_11
        0x48 -> :sswitch_10
        0x4c -> :sswitch_f
        0x4d -> :sswitch_e
        0x51 -> :sswitch_d
        0x53 -> :sswitch_c
        0x54 -> :sswitch_b
        0x56 -> :sswitch_a
        0x5a -> :sswitch_9
        0x61 -> :sswitch_8
        0x63 -> :sswitch_7
        0x68 -> :sswitch_6
        0x6c -> :sswitch_5
        0x6d -> :sswitch_4
        0x71 -> :sswitch_3
        0x73 -> :sswitch_2
        0x74 -> :sswitch_1
        0x76 -> :sswitch_0
        0x7a -> :sswitch_9
    .end sparse-switch
.end method

.method public static p()Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/horcrux/svg/g;->y()V

    .line 4
    .line 5
    sget-object v0, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 6
    .line 7
    sget v1, Lcom/horcrux/svg/g;->b:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 11
    move-result v0

    .line 12
    .line 13
    const/16 v1, 0x30

    .line 14
    .line 15
    const/16 v2, 0x31

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    new-instance v1, Ljava/lang/Error;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    sget v2, Lcom/horcrux/svg/g;->b:I

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    sget-object v3, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    filled-new-array {v0, v2, v3}, [Ljava/lang/Object;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    const-string v2, "Unexpected flag \'%c\' (i=%d, s=%s)"

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 48
    throw v1

    .line 49
    .line 50
    :cond_1
    :goto_0
    sget v1, Lcom/horcrux/svg/g;->b:I

    .line 51
    const/4 v3, 0x1

    .line 52
    add-int/2addr v1, v3

    .line 53
    .line 54
    sput v1, Lcom/horcrux/svg/g;->b:I

    .line 55
    .line 56
    sget v4, Lcom/horcrux/svg/g;->c:I

    .line 57
    .line 58
    if-ge v1, v4, :cond_2

    .line 59
    .line 60
    sget-object v4, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    .line 64
    move-result v1

    .line 65
    .line 66
    const/16 v4, 0x2c

    .line 67
    .line 68
    if-ne v1, v4, :cond_2

    .line 69
    .line 70
    sget v1, Lcom/horcrux/svg/g;->b:I

    .line 71
    add-int/2addr v1, v3

    .line 72
    .line 73
    sput v1, Lcom/horcrux/svg/g;->b:I

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-static {}, Lcom/horcrux/svg/g;->y()V

    .line 77
    .line 78
    if-ne v0, v2, :cond_3

    .line 79
    return v3

    .line 80
    :cond_3
    const/4 v0, 0x0

    .line 81
    return v0
    .line 82
    .line 83
    .line 84
.end method

.method public static q()F
    .locals 3

    .line 1
    .line 2
    sget v0, Lcom/horcrux/svg/g;->b:I

    .line 3
    .line 4
    sget v1, Lcom/horcrux/svg/g;->c:I

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/horcrux/svg/g;->s()F

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/horcrux/svg/g;->y()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/horcrux/svg/g;->r()V

    .line 17
    return v0

    .line 18
    .line 19
    :cond_0
    new-instance v0, Ljava/lang/Error;

    .line 20
    .line 21
    sget-object v1, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    const-string v2, "Unexpected end (s=%s)"

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 35
    throw v0
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
.end method

.method public static r()V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/horcrux/svg/g;->b:I

    .line 3
    .line 4
    sget v1, Lcom/horcrux/svg/g;->c:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 12
    move-result v0

    .line 13
    .line 14
    const/16 v1, 0x2c

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    sget v0, Lcom/horcrux/svg/g;->b:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    sput v0, Lcom/horcrux/svg/g;->b:I

    .line 23
    :cond_0
    return-void
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
.end method

.method public static s()F
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/horcrux/svg/g;->y()V

    .line 4
    .line 5
    sget v0, Lcom/horcrux/svg/g;->b:I

    .line 6
    .line 7
    sget v1, Lcom/horcrux/svg/g;->c:I

    .line 8
    .line 9
    if-eq v0, v1, :cond_c

    .line 10
    .line 11
    sget-object v1, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 15
    move-result v1

    .line 16
    .line 17
    const/16 v2, 0x2b

    .line 18
    .line 19
    const/16 v3, 0x2d

    .line 20
    .line 21
    if-eq v1, v3, :cond_0

    .line 22
    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    :cond_0
    sget v1, Lcom/horcrux/svg/g;->b:I

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    sput v1, Lcom/horcrux/svg/g;->b:I

    .line 30
    .line 31
    sget-object v4, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    .line 35
    move-result v1

    .line 36
    .line 37
    :cond_1
    const-string v4, "Invalid number formating character \'%c\' (i=%d, s=%s)"

    .line 38
    .line 39
    const/16 v5, 0x2e

    .line 40
    .line 41
    const/16 v6, 0x39

    .line 42
    .line 43
    const/16 v7, 0x30

    .line 44
    .line 45
    if-lt v1, v7, :cond_2

    .line 46
    .line 47
    if-gt v1, v6, :cond_2

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lcom/horcrux/svg/g;->x()V

    .line 51
    .line 52
    sget v8, Lcom/horcrux/svg/g;->b:I

    .line 53
    .line 54
    sget v9, Lcom/horcrux/svg/g;->c:I

    .line 55
    .line 56
    if-ge v8, v9, :cond_3

    .line 57
    .line 58
    sget-object v1, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 62
    move-result v1

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_2
    if-ne v1, v5, :cond_b

    .line 66
    .line 67
    :cond_3
    :goto_0
    if-ne v1, v5, :cond_4

    .line 68
    .line 69
    sget v5, Lcom/horcrux/svg/g;->b:I

    .line 70
    .line 71
    add-int/lit8 v5, v5, 0x1

    .line 72
    .line 73
    sput v5, Lcom/horcrux/svg/g;->b:I

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lcom/horcrux/svg/g;->x()V

    .line 77
    .line 78
    sget v5, Lcom/horcrux/svg/g;->b:I

    .line 79
    .line 80
    sget v8, Lcom/horcrux/svg/g;->c:I

    .line 81
    .line 82
    if-ge v5, v8, :cond_4

    .line 83
    .line 84
    sget-object v1, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 88
    move-result v1

    .line 89
    .line 90
    :cond_4
    const/16 v5, 0x65

    .line 91
    .line 92
    if-eq v1, v5, :cond_5

    .line 93
    .line 94
    const/16 v5, 0x45

    .line 95
    .line 96
    if-ne v1, v5, :cond_9

    .line 97
    .line 98
    :cond_5
    sget v1, Lcom/horcrux/svg/g;->b:I

    .line 99
    .line 100
    add-int/lit8 v5, v1, 0x1

    .line 101
    .line 102
    sget v8, Lcom/horcrux/svg/g;->c:I

    .line 103
    .line 104
    if-ge v5, v8, :cond_9

    .line 105
    .line 106
    sget-object v5, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 107
    .line 108
    add-int/lit8 v1, v1, 0x1

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    .line 112
    move-result v1

    .line 113
    .line 114
    const/16 v5, 0x6d

    .line 115
    .line 116
    if-eq v1, v5, :cond_9

    .line 117
    .line 118
    const/16 v5, 0x78

    .line 119
    .line 120
    if-eq v1, v5, :cond_9

    .line 121
    .line 122
    sget v1, Lcom/horcrux/svg/g;->b:I

    .line 123
    .line 124
    add-int/lit8 v1, v1, 0x1

    .line 125
    .line 126
    sput v1, Lcom/horcrux/svg/g;->b:I

    .line 127
    .line 128
    sget-object v5, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    .line 132
    move-result v1

    .line 133
    .line 134
    if-eq v1, v2, :cond_8

    .line 135
    .line 136
    if-ne v1, v3, :cond_6

    .line 137
    goto :goto_1

    .line 138
    .line 139
    :cond_6
    if-lt v1, v7, :cond_7

    .line 140
    .line 141
    if-gt v1, v6, :cond_7

    .line 142
    .line 143
    .line 144
    invoke-static {}, Lcom/horcrux/svg/g;->x()V

    .line 145
    goto :goto_2

    .line 146
    .line 147
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 148
    .line 149
    .line 150
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 151
    move-result-object v1

    .line 152
    .line 153
    sget v2, Lcom/horcrux/svg/g;->b:I

    .line 154
    .line 155
    .line 156
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    move-result-object v2

    .line 158
    .line 159
    sget-object v3, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 163
    move-result-object v1

    .line 164
    .line 165
    .line 166
    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    move-result-object v1

    .line 168
    .line 169
    .line 170
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 171
    throw v0

    .line 172
    .line 173
    :cond_8
    :goto_1
    sget v1, Lcom/horcrux/svg/g;->b:I

    .line 174
    .line 175
    add-int/lit8 v1, v1, 0x1

    .line 176
    .line 177
    sput v1, Lcom/horcrux/svg/g;->b:I

    .line 178
    .line 179
    .line 180
    invoke-static {}, Lcom/horcrux/svg/g;->x()V

    .line 181
    .line 182
    :cond_9
    :goto_2
    sget-object v1, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 183
    .line 184
    sget v2, Lcom/horcrux/svg/g;->b:I

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 188
    move-result-object v1

    .line 189
    .line 190
    .line 191
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 192
    move-result v2

    .line 193
    .line 194
    .line 195
    invoke-static {v2}, Ljava/lang/Float;->isInfinite(F)Z

    .line 196
    move-result v3

    .line 197
    .line 198
    if-nez v3, :cond_a

    .line 199
    .line 200
    .line 201
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 202
    move-result v3

    .line 203
    .line 204
    if-nez v3, :cond_a

    .line 205
    return v2

    .line 206
    .line 207
    :cond_a
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 208
    .line 209
    .line 210
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    move-result-object v0

    .line 212
    .line 213
    sget v3, Lcom/horcrux/svg/g;->b:I

    .line 214
    .line 215
    .line 216
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    move-result-object v3

    .line 218
    .line 219
    sget-object v4, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    filled-new-array {v1, v0, v3, v4}, [Ljava/lang/Object;

    .line 223
    move-result-object v0

    .line 224
    .line 225
    const-string v1, "Invalid number \'%s\' (start=%d, i=%d, s=%s)"

    .line 226
    .line 227
    .line 228
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    move-result-object v0

    .line 230
    .line 231
    .line 232
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 233
    throw v2

    .line 234
    .line 235
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 236
    .line 237
    .line 238
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 239
    move-result-object v1

    .line 240
    .line 241
    sget v2, Lcom/horcrux/svg/g;->b:I

    .line 242
    .line 243
    .line 244
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    move-result-object v2

    .line 246
    .line 247
    sget-object v3, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 251
    move-result-object v1

    .line 252
    .line 253
    .line 254
    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 255
    move-result-object v1

    .line 256
    .line 257
    .line 258
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 259
    throw v0

    .line 260
    .line 261
    :cond_c
    new-instance v0, Ljava/lang/Error;

    .line 262
    .line 263
    sget-object v1, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 267
    move-result-object v1

    .line 268
    .line 269
    const-string v2, "Unexpected end (s=%s)"

    .line 270
    .line 271
    .line 272
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 273
    move-result-object v1

    .line 274
    .line 275
    .line 276
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 277
    throw v0
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
.end method

.method public static t(FFFF)V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/horcrux/svg/g;->g:F

    .line 3
    add-float/2addr p0, v0

    .line 4
    .line 5
    sget v1, Lcom/horcrux/svg/g;->h:F

    .line 6
    add-float/2addr p1, v1

    .line 7
    add-float/2addr p2, v0

    .line 8
    add-float/2addr p3, v1

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, p2, p3}, Lcom/horcrux/svg/g;->u(FFFF)V

    .line 12
    return-void
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

.method public static u(FFFF)V
    .locals 9

    .line 1
    .line 2
    sput p0, Lcom/horcrux/svg/g;->i:F

    .line 3
    .line 4
    sput p1, Lcom/horcrux/svg/g;->j:F

    .line 5
    .line 6
    const/high16 v0, 0x40000000    # 2.0f

    .line 7
    mul-float/2addr p0, v0

    .line 8
    .line 9
    add-float v1, p2, p0

    .line 10
    .line 11
    const/high16 v2, 0x40400000    # 3.0f

    .line 12
    .line 13
    div-float v5, v1, v2

    .line 14
    mul-float/2addr p1, v0

    .line 15
    .line 16
    add-float v0, p3, p1

    .line 17
    .line 18
    div-float v6, v0, v2

    .line 19
    .line 20
    sget v0, Lcom/horcrux/svg/g;->g:F

    .line 21
    add-float/2addr v0, p0

    .line 22
    .line 23
    div-float v3, v0, v2

    .line 24
    .line 25
    sget p0, Lcom/horcrux/svg/g;->h:F

    .line 26
    add-float/2addr p0, p1

    .line 27
    .line 28
    div-float v4, p0, v2

    .line 29
    move v7, p2

    .line 30
    move v8, p3

    .line 31
    .line 32
    .line 33
    invoke-static/range {v3 .. v8}, Lcom/horcrux/svg/g;->e(FFFFFF)V

    .line 34
    return-void
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

.method public static v(D)D
    .locals 4

    .line 1
    .line 2
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 3
    .line 4
    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 8
    move-result-wide v0

    .line 9
    mul-double/2addr p0, v0

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 13
    move-result-wide p0

    .line 14
    long-to-double p0, p0

    .line 15
    div-double/2addr p0, v0

    .line 16
    return-wide p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static w()V
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/horcrux/svg/g;->m:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget v0, Lcom/horcrux/svg/g;->g:F

    .line 7
    .line 8
    sput v0, Lcom/horcrux/svg/g;->k:F

    .line 9
    .line 10
    sget v0, Lcom/horcrux/svg/g;->h:F

    .line 11
    .line 12
    sput v0, Lcom/horcrux/svg/g;->l:F

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    sput-boolean v0, Lcom/horcrux/svg/g;->m:Z

    .line 16
    :cond_0
    return-void
.end method

.method public static x()V
    .locals 2

    .line 1
    .line 2
    :goto_0
    sget v0, Lcom/horcrux/svg/g;->b:I

    .line 3
    .line 4
    sget v1, Lcom/horcrux/svg/g;->c:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 12
    move-result v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget v0, Lcom/horcrux/svg/g;->b:I

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    sput v0, Lcom/horcrux/svg/g;->b:I

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
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
.end method

.method public static y()V
    .locals 2

    .line 1
    .line 2
    :goto_0
    sget v0, Lcom/horcrux/svg/g;->b:I

    .line 3
    .line 4
    sget v1, Lcom/horcrux/svg/g;->c:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lcom/horcrux/svg/g;->d:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 12
    move-result v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget v0, Lcom/horcrux/svg/g;->b:I

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    sput v0, Lcom/horcrux/svg/g;->b:I

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
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
.end method

.method public static z(FFFF)V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/horcrux/svg/g;->g:F

    .line 3
    add-float/2addr p0, v0

    .line 4
    .line 5
    sget v1, Lcom/horcrux/svg/g;->h:F

    .line 6
    add-float/2addr p1, v1

    .line 7
    add-float/2addr p2, v0

    .line 8
    add-float/2addr p3, v1

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, p2, p3}, Lcom/horcrux/svg/g;->A(FFFF)V

    .line 12
    return-void
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
