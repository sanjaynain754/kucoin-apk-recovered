.class public final Lcom/sumsub/sns/internal/features/data/model/common/T;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/sumsub/sns/internal/features/data/model/common/T;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Ljava/io/File;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

.field public final f:Z

.field public final g:Ljava/lang/Boolean;

.field public final h:Lcom/sumsub/sns/internal/features/data/model/common/S;

.field public final i:Z

.field public final j:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/P;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/P;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/T;->CREATOR:Landroid/os/Parcelable$Creator;

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
.end method

.method public synthetic constructor <init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/S;I)V
    .locals 14

    move/from16 v0, p8

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v10, v2

    goto :goto_2

    :cond_2
    move-object/from16 v10, p6

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p7

    :goto_3
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    :goto_4
    move v12, v0

    goto :goto_5

    :cond_4
    const/4 v0, 0x1

    goto :goto_4

    :goto_5
    const/4 v9, 0x0

    const/4 v13, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object/from16 v5, p2

    move-object/from16 v8, p5

    .line 1
    invoke-direct/range {v3 .. v13}, Lcom/sumsub/sns/internal/features/data/model/common/T;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;ZLjava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/S;ZLjava/lang/Boolean;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;ZLjava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/S;ZLjava/lang/Boolean;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 5
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 8
    iput-boolean p6, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->f:Z

    .line 9
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->g:Ljava/lang/Boolean;

    .line 10
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->h:Lcom/sumsub/sns/internal/features/data/model/common/S;

    .line 11
    iput-boolean p9, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->i:Z

    .line 12
    iput-object p10, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->j:Ljava/lang/Boolean;

    return-void
.end method

.method public static a(Lcom/sumsub/sns/internal/features/data/model/common/T;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;I)Lcom/sumsub/sns/internal/features/data/model/common/T;
    .locals 13

    .line 1
    .line 2
    move/from16 v0, p4

    .line 3
    .line 4
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 5
    .line 6
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    .line 7
    .line 8
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 9
    .line 10
    and-int/lit8 v2, v0, 0x4

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->c:Ljava/lang/String;

    .line 15
    :cond_0
    move-object v5, p1

    .line 16
    .line 17
    and-int/lit8 p1, v0, 0x8

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 22
    :cond_1
    move-object v6, p2

    .line 23
    .line 24
    and-int/lit8 p1, v0, 0x10

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 29
    move-object v7, p1

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_2
    move-object/from16 v7, p3

    .line 33
    .line 34
    :goto_0
    and-int/lit8 p1, v0, 0x20

    .line 35
    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->f:Z

    .line 39
    :goto_1
    move v8, p1

    .line 40
    goto :goto_2

    .line 41
    :cond_3
    const/4 p1, 0x0

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :goto_2
    iget-object v9, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->g:Ljava/lang/Boolean;

    .line 45
    .line 46
    iget-object v10, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->h:Lcom/sumsub/sns/internal/features/data/model/common/S;

    .line 47
    .line 48
    iget-boolean v11, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->i:Z

    .line 49
    .line 50
    and-int/lit16 p1, v0, 0x200

    .line 51
    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->j:Ljava/lang/Boolean;

    .line 55
    :cond_4
    move-object v12, v1

    .line 56
    .line 57
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 58
    .line 59
    .line 60
    invoke-direct/range {v2 .. v12}, Lcom/sumsub/sns/internal/features/data/model/common/T;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;ZLjava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/S;ZLjava/lang/Boolean;)V

    .line 61
    return-object v2
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
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    return v2

    .line 35
    .line 36
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->c:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->c:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-nez v1, :cond_4

    .line 45
    return v2

    .line 46
    .line 47
    :cond_4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-nez v1, :cond_5

    .line 56
    return v2

    .line 57
    .line 58
    :cond_5
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 59
    .line 60
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 61
    .line 62
    if-eq v1, v3, :cond_6

    .line 63
    return v2

    .line 64
    .line 65
    :cond_6
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->f:Z

    .line 66
    .line 67
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->f:Z

    .line 68
    .line 69
    if-eq v1, v3, :cond_7

    .line 70
    return v2

    .line 71
    .line 72
    :cond_7
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->g:Ljava/lang/Boolean;

    .line 73
    .line 74
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->g:Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    move-result v1

    .line 79
    .line 80
    if-nez v1, :cond_8

    .line 81
    return v2

    .line 82
    .line 83
    :cond_8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->h:Lcom/sumsub/sns/internal/features/data/model/common/S;

    .line 84
    .line 85
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->h:Lcom/sumsub/sns/internal/features/data/model/common/S;

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    move-result v1

    .line 90
    .line 91
    if-nez v1, :cond_9

    .line 92
    return v2

    .line 93
    .line 94
    :cond_9
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->i:Z

    .line 95
    .line 96
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->i:Z

    .line 97
    .line 98
    if-eq v1, v3, :cond_a

    .line 99
    return v2

    .line 100
    .line 101
    :cond_a
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->j:Ljava/lang/Boolean;

    .line 102
    .line 103
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->j:Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    move-result p1

    .line 108
    .line 109
    if-nez p1, :cond_b

    .line 110
    return v2

    .line 111
    :cond_b
    return v0
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
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->hashCode()I

    .line 11
    move-result v0

    .line 12
    .line 13
    :goto_0
    const/16 v2, 0x1f

    .line 14
    mul-int/2addr v0, v2

    .line 15
    .line 16
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    move v3, v1

    .line 20
    goto :goto_1

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->hashCode()I

    .line 24
    move-result v3

    .line 25
    :goto_1
    add-int/2addr v0, v3

    .line 26
    mul-int/2addr v0, v2

    .line 27
    .line 28
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->c:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v3, :cond_2

    .line 31
    move v3, v1

    .line 32
    goto :goto_2

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 36
    move-result v3

    .line 37
    :goto_2
    add-int/2addr v0, v3

    .line 38
    mul-int/2addr v0, v2

    .line 39
    .line 40
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 41
    .line 42
    if-nez v3, :cond_3

    .line 43
    move v3, v1

    .line 44
    goto :goto_3

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 48
    move-result v3

    .line 49
    :goto_3
    add-int/2addr v0, v3

    .line 50
    mul-int/2addr v0, v2

    .line 51
    .line 52
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 53
    .line 54
    if-nez v3, :cond_4

    .line 55
    move v3, v1

    .line 56
    goto :goto_4

    .line 57
    .line 58
    .line 59
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 60
    move-result v3

    .line 61
    :goto_4
    add-int/2addr v0, v3

    .line 62
    mul-int/2addr v0, v2

    .line 63
    .line 64
    iget-boolean v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->f:Z

    .line 65
    .line 66
    .line 67
    invoke-static {v3, v0, v2}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 68
    move-result v0

    .line 69
    .line 70
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->g:Ljava/lang/Boolean;

    .line 71
    .line 72
    if-nez v3, :cond_5

    .line 73
    move v3, v1

    .line 74
    goto :goto_5

    .line 75
    .line 76
    .line 77
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 78
    move-result v3

    .line 79
    :goto_5
    add-int/2addr v0, v3

    .line 80
    mul-int/2addr v0, v2

    .line 81
    .line 82
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->h:Lcom/sumsub/sns/internal/features/data/model/common/S;

    .line 83
    .line 84
    if-nez v3, :cond_6

    .line 85
    move v3, v1

    .line 86
    goto :goto_6

    .line 87
    .line 88
    .line 89
    :cond_6
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/S;->hashCode()I

    .line 90
    move-result v3

    .line 91
    :goto_6
    add-int/2addr v0, v3

    .line 92
    mul-int/2addr v0, v2

    .line 93
    .line 94
    iget-boolean v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->i:Z

    .line 95
    .line 96
    .line 97
    invoke-static {v3, v0, v2}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 98
    move-result v0

    .line 99
    .line 100
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->j:Ljava/lang/Boolean;

    .line 101
    .line 102
    if-nez v2, :cond_7

    .line 103
    goto :goto_7

    .line 104
    .line 105
    .line 106
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 107
    move-result v1

    .line 108
    :goto_7
    add-int/2addr v0, v1

    .line 109
    return v0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v2

    .line 14
    .line 15
    :goto_0
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->c:Ljava/lang/String;

    .line 16
    .line 17
    iget-boolean v4, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->f:Z

    .line 18
    .line 19
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 20
    .line 21
    if-eqz v5, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 25
    move-result-object v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v5, v2

    .line 28
    .line 29
    :goto_1
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 30
    .line 31
    if-eqz v6, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->getValue()Ljava/lang/String;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    :cond_2
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->j:Ljava/lang/Boolean;

    .line 38
    .line 39
    new-instance v7, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string/jumbo v8, "type="

    .line 46
    .line 47
    .line 48
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v0, ", document="

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v0, ", country="

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v0, ", sent="

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v0, ", raw="

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v0, ", side="

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v0, ", confirmedSingleSided="

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    move-result-object v0

    .line 104
    return-object v0
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
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    .line 2
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 6
    .line 7
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 11
    .line 12
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->c:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 21
    .line 22
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 23
    const/4 v0, 0x1

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 37
    move-result-object p2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 41
    .line 42
    :goto_0
    iget-boolean p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->f:Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 46
    .line 47
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->g:Ljava/lang/Boolean;

    .line 48
    .line 49
    if-nez p2, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    goto :goto_1

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    move-result p2

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    .line 65
    :goto_1
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->h:Lcom/sumsub/sns/internal/features/data/model/common/S;

    .line 66
    .line 67
    if-nez p2, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 71
    goto :goto_2

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 75
    .line 76
    iget v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/S;->a:I

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    .line 81
    iget-wide v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/S;->b:J

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 85
    .line 86
    :goto_2
    iget-boolean p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->i:Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    .line 91
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->j:Ljava/lang/Boolean;

    .line 92
    .line 93
    if-nez p2, :cond_3

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    return-void

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    move-result p2

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 108
    return-void
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
.end method
