.class public Lcom/tencent/rmonitor/fd/cluser/FdCluster;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:[Lcom/tencent/bugly/proguard/z8;


# direct methods
.method public static constructor <clinit>()V
    .locals 19

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/he;

    .line 3
    .line 4
    const-string v1, "socket:["

    .line 5
    .line 6
    .line 7
    filled-new-array {v1}, [Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v2, v1}, Lcom/tencent/bugly/proguard/he;-><init>(I[Ljava/lang/String;)V

    .line 13
    .line 14
    new-instance v1, Lcom/tencent/bugly/proguard/he;

    .line 15
    .line 16
    const-string v3, "pipe:["

    .line 17
    .line 18
    .line 19
    filled-new-array {v3}, [Ljava/lang/String;

    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x6

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v4, v3}, Lcom/tencent/bugly/proguard/he;-><init>(I[Ljava/lang/String;)V

    .line 25
    .line 26
    new-instance v3, Lcom/tencent/bugly/proguard/e5;

    .line 27
    .line 28
    const-string v5, "anon_inode:[eventpoll]"

    .line 29
    .line 30
    const-string v6, "anon_inode:[eventfd]"

    .line 31
    .line 32
    .line 33
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 34
    move-result-object v5

    .line 35
    const/4 v6, 0x2

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v6, v5}, Lcom/tencent/bugly/proguard/e5;-><init>(I[Ljava/lang/String;)V

    .line 39
    .line 40
    new-instance v5, Lcom/tencent/bugly/proguard/he;

    .line 41
    .line 42
    const-string v7, "/dev/ashmem"

    .line 43
    .line 44
    .line 45
    filled-new-array {v7}, [Ljava/lang/String;

    .line 46
    move-result-object v7

    .line 47
    const/4 v8, 0x3

    .line 48
    .line 49
    .line 50
    invoke-direct {v5, v8, v7}, Lcom/tencent/bugly/proguard/he;-><init>(I[Ljava/lang/String;)V

    .line 51
    .line 52
    new-instance v7, Lcom/tencent/bugly/proguard/he;

    .line 53
    .line 54
    const-string v9, "anon_inode:dmabuf"

    .line 55
    .line 56
    const-string v10, "/dev/ion"

    .line 57
    .line 58
    const-string v11, "/dmabuf"

    .line 59
    .line 60
    .line 61
    filled-new-array {v11, v9, v10}, [Ljava/lang/String;

    .line 62
    move-result-object v9

    .line 63
    const/4 v10, 0x4

    .line 64
    .line 65
    .line 66
    invoke-direct {v7, v10, v9}, Lcom/tencent/bugly/proguard/he;-><init>(I[Ljava/lang/String;)V

    .line 67
    .line 68
    new-instance v9, Lcom/tencent/bugly/proguard/he;

    .line 69
    .line 70
    const-string v11, "/storage/"

    .line 71
    .line 72
    const-string v12, "/sdcard/"

    .line 73
    .line 74
    const-string v13, "/data/"

    .line 75
    .line 76
    .line 77
    filled-new-array {v13, v11, v12}, [Ljava/lang/String;

    .line 78
    move-result-object v11

    .line 79
    const/4 v12, 0x5

    .line 80
    .line 81
    .line 82
    invoke-direct {v9, v12, v11}, Lcom/tencent/bugly/proguard/he;-><init>(I[Ljava/lang/String;)V

    .line 83
    .line 84
    new-instance v11, Lcom/tencent/bugly/proguard/he;

    .line 85
    .line 86
    const-string v13, "/sys/"

    .line 87
    .line 88
    const-string v14, "/proc/"

    .line 89
    .line 90
    const-string v15, "/system/"

    .line 91
    .line 92
    move/from16 v16, v2

    .line 93
    .line 94
    const-string v2, "/vendor/"

    .line 95
    .line 96
    move/from16 v17, v4

    .line 97
    .line 98
    const-string v4, "/apex/"

    .line 99
    .line 100
    .line 101
    filled-new-array {v15, v2, v4, v13, v14}, [Ljava/lang/String;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    const/16 v4, 0x9

    .line 105
    .line 106
    .line 107
    invoke-direct {v11, v4, v2}, Lcom/tencent/bugly/proguard/he;-><init>(I[Ljava/lang/String;)V

    .line 108
    .line 109
    new-instance v2, Lcom/tencent/bugly/proguard/he;

    .line 110
    .line 111
    const-string v13, "/dev/kgsl-3d"

    .line 112
    .line 113
    const-string v14, "/dev/pvrsrvkm"

    .line 114
    .line 115
    const-string v15, "/dev/mali"

    .line 116
    .line 117
    .line 118
    filled-new-array {v15, v13, v14}, [Ljava/lang/String;

    .line 119
    move-result-object v13

    .line 120
    const/4 v14, 0x7

    .line 121
    .line 122
    .line 123
    invoke-direct {v2, v14, v13}, Lcom/tencent/bugly/proguard/he;-><init>(I[Ljava/lang/String;)V

    .line 124
    .line 125
    new-instance v13, Lcom/tencent/bugly/proguard/he;

    .line 126
    .line 127
    const-string v15, "/dev/"

    .line 128
    .line 129
    .line 130
    filled-new-array {v15}, [Ljava/lang/String;

    .line 131
    move-result-object v15

    .line 132
    .line 133
    move/from16 v18, v6

    .line 134
    .line 135
    const/16 v6, 0x8

    .line 136
    .line 137
    .line 138
    invoke-direct {v13, v6, v15}, Lcom/tencent/bugly/proguard/he;-><init>(I[Ljava/lang/String;)V

    .line 139
    .line 140
    new-array v4, v4, [Lcom/tencent/bugly/proguard/z8;

    .line 141
    const/4 v15, 0x0

    .line 142
    .line 143
    aput-object v0, v4, v15

    .line 144
    .line 145
    aput-object v1, v4, v16

    .line 146
    .line 147
    aput-object v3, v4, v18

    .line 148
    .line 149
    aput-object v5, v4, v8

    .line 150
    .line 151
    aput-object v7, v4, v10

    .line 152
    .line 153
    aput-object v9, v4, v12

    .line 154
    .line 155
    aput-object v11, v4, v17

    .line 156
    .line 157
    aput-object v2, v4, v14

    .line 158
    .line 159
    aput-object v13, v4, v6

    .line 160
    .line 161
    sput-object v4, Lcom/tencent/rmonitor/fd/cluser/FdCluster;->a:[Lcom/tencent/bugly/proguard/z8;

    .line 162
    return-void
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
.end method

.method public static a(Ljava/util/Map;)Lcom/tencent/bugly/proguard/t5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/bugly/proguard/t5;",
            ">;)",
            "Lcom/tencent/bugly/proguard/t5;"
        }
    .end annotation

    if-eqz p0, :cond_1

    .line 6
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const/4 p0, 0x0

    .line 9
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/tencent/bugly/proguard/t5;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/z8;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 10
    sget-object v0, Lcom/tencent/rmonitor/fd/cluser/FdCluster;->a:[Lcom/tencent/bugly/proguard/z8;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 11
    invoke-interface {v3, p0}, Lcom/tencent/bugly/proguard/z8;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static matchFdType(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/rmonitor/fd/cluser/FdCluster;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/z8;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Lcom/tencent/bugly/proguard/z8;->a()I

    .line 10
    move-result p0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/tencent/bugly/proguard/s6;->b(I)Ljava/lang/String;

    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    .line 17
    :cond_0
    const-string p0, "others"

    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public a(Ljava/util/List;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/bugly/proguard/t5;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 3
    invoke-static {v1}, Lcom/tencent/rmonitor/fd/cluser/FdCluster;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/z8;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 4
    invoke-interface {v2}, Lcom/tencent/bugly/proguard/z8;->a()I

    move-result v2

    invoke-virtual {p0, v2, v1, v0}, Lcom/tencent/rmonitor/fd/cluser/FdCluster;->a(ILjava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    const/16 v2, 0xa

    .line 5
    invoke-virtual {p0, v2, v1, v0}, Lcom/tencent/rmonitor/fd/cluser/FdCluster;->a(ILjava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final a(ILjava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/bugly/proguard/t5;",
            ">;)V"
        }
    .end annotation

    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/t5;

    if-nez v0, :cond_0

    .line 13
    new-instance v0, Lcom/tencent/bugly/proguard/t5;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/t5;-><init>(I)V

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    :cond_0
    invoke-virtual {v0, p2}, Lcom/tencent/bugly/proguard/t5;->a(Ljava/lang/String;)V

    return-void
.end method
