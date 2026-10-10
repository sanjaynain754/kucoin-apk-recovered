.class public final Lcom/facebook/imageformat/DefaultImageFormatChecker;
.super Ljava/lang/Object;
.source "DefaultImageFormatChecker.kt"

# interfaces
.implements Lcom/facebook/imageformat/ImageFormat$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/facebook/imageformat/DefaultImageFormatChecker;",
        "Lcom/facebook/imageformat/ImageFormat$a;",
        "<init>",
        "()V",
        "",
        "headerBytes",
        "",
        "headerSize",
        "Lcom/facebook/imageformat/ImageFormat;",
        "determineFormat",
        "([BI)Lcom/facebook/imageformat/ImageFormat;",
        "a",
        "I",
        "getHeaderSize",
        "()I",
        "b",
        "Companion",
        "imagepipeline-base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:I

.field public static final e:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:I

.field public static final g:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final h:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final i:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final j:I

.field public static final k:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final l:I

.field public static final m:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final n:[[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final o:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final p:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final q:I


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->b:Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;

    .line 9
    const/4 v0, 0x3

    .line 10
    .line 11
    new-array v0, v0, [B

    .line 12
    .line 13
    .line 14
    fill-array-data v0, :array_0

    .line 15
    .line 16
    sput-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->c:[B

    .line 17
    array-length v0, v0

    .line 18
    .line 19
    sput v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->d:I

    .line 20
    .line 21
    const/16 v0, 0x8

    .line 22
    .line 23
    new-array v0, v0, [B

    .line 24
    .line 25
    .line 26
    fill-array-data v0, :array_1

    .line 27
    .line 28
    sput-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->e:[B

    .line 29
    array-length v0, v0

    .line 30
    .line 31
    sput v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->f:I

    .line 32
    .line 33
    const-string v0, "GIF87a"

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)[B

    .line 37
    move-result-object v0

    .line 38
    .line 39
    sput-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->g:[B

    .line 40
    .line 41
    const-string v0, "GIF89a"

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)[B

    .line 45
    move-result-object v0

    .line 46
    .line 47
    sput-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->h:[B

    .line 48
    .line 49
    const-string v0, "BM"

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)[B

    .line 53
    move-result-object v0

    .line 54
    .line 55
    sput-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->i:[B

    .line 56
    array-length v0, v0

    .line 57
    .line 58
    sput v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->j:I

    .line 59
    const/4 v0, 0x4

    .line 60
    .line 61
    new-array v1, v0, [B

    .line 62
    .line 63
    .line 64
    fill-array-data v1, :array_2

    .line 65
    .line 66
    sput-object v1, Lcom/facebook/imageformat/DefaultImageFormatChecker;->k:[B

    .line 67
    array-length v1, v1

    .line 68
    .line 69
    sput v1, Lcom/facebook/imageformat/DefaultImageFormatChecker;->l:I

    .line 70
    .line 71
    const-string v1, "ftyp"

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Ll5/c;->a(Ljava/lang/String;)[B

    .line 75
    move-result-object v1

    .line 76
    .line 77
    sput-object v1, Lcom/facebook/imageformat/DefaultImageFormatChecker;->m:[B

    .line 78
    .line 79
    const-string v1, "heic"

    .line 80
    .line 81
    .line 82
    invoke-static {v1}, Ll5/c;->a(Ljava/lang/String;)[B

    .line 83
    move-result-object v2

    .line 84
    .line 85
    const-string v1, "heix"

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Ll5/c;->a(Ljava/lang/String;)[B

    .line 89
    move-result-object v3

    .line 90
    .line 91
    const-string v1, "hevc"

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Ll5/c;->a(Ljava/lang/String;)[B

    .line 95
    move-result-object v4

    .line 96
    .line 97
    const-string v1, "hevx"

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Ll5/c;->a(Ljava/lang/String;)[B

    .line 101
    move-result-object v5

    .line 102
    .line 103
    const-string v1, "mif1"

    .line 104
    .line 105
    .line 106
    invoke-static {v1}, Ll5/c;->a(Ljava/lang/String;)[B

    .line 107
    move-result-object v6

    .line 108
    .line 109
    const-string v1, "msf1"

    .line 110
    .line 111
    .line 112
    invoke-static {v1}, Ll5/c;->a(Ljava/lang/String;)[B

    .line 113
    move-result-object v7

    .line 114
    .line 115
    .line 116
    filled-new-array/range {v2 .. v7}, [[B

    .line 117
    move-result-object v1

    .line 118
    .line 119
    sput-object v1, Lcom/facebook/imageformat/DefaultImageFormatChecker;->n:[[B

    .line 120
    .line 121
    new-array v1, v0, [B

    .line 122
    .line 123
    .line 124
    fill-array-data v1, :array_3

    .line 125
    .line 126
    sput-object v1, Lcom/facebook/imageformat/DefaultImageFormatChecker;->o:[B

    .line 127
    .line 128
    new-array v0, v0, [B

    .line 129
    .line 130
    .line 131
    fill-array-data v0, :array_4

    .line 132
    .line 133
    sput-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->p:[B

    .line 134
    array-length v0, v1

    .line 135
    .line 136
    sput v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->q:I

    .line 137
    return-void

    .line 138
    nop

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    :array_0
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    :array_1
    .array-data 1
        -0x77t
        0x50t
        0x4et
        0x47t
        0xdt
        0xat
        0x1at
        0xat
    .end array-data

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    :array_2
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x0t
    .end array-data

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    :array_3
    .array-data 1
        0x49t
        0x49t
        0x2at
        0x0t
    .end array-data

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    :array_4
    .array-data 1
        0x4dt
        0x4dt
        0x0t
        0x2at
    .end array-data
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
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x15

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    const/16 v0, 0x14

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    sget v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->d:I

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    sget v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->f:I

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    move-result-object v4

    .line 28
    const/4 v0, 0x6

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    move-result-object v5

    .line 33
    .line 34
    sget v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->j:I

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    move-result-object v6

    .line 39
    .line 40
    sget v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->l:I

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    move-result-object v7

    .line 45
    .line 46
    const/16 v0, 0xc

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    move-result-object v8

    .line 51
    .line 52
    .line 53
    filled-new-array/range {v1 .. v8}, [Ljava/lang/Integer;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    check-cast v0, [Ljava/lang/Comparable;

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->maxOrNull([Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    check-cast v0, Ljava/lang/Number;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 68
    move-result v0

    .line 69
    .line 70
    iput v0, p0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->a:I

    .line 71
    return-void

    .line 72
    .line 73
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v1, "Required value was null."

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    throw v0
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
.end method

.method public static final synthetic a()[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->i:[B

    .line 3
    return-object v0
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
    .line 18
.end method

.method public static final synthetic b()[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->o:[B

    .line 3
    return-object v0
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
    .line 18
.end method

.method public static final synthetic c()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->q:I

    .line 3
    return v0
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
    .line 18
.end method

.method public static final synthetic d()[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->p:[B

    .line 3
    return-object v0
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
    .line 18
.end method

.method public static final synthetic e()[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->g:[B

    .line 3
    return-object v0
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
    .line 18
.end method

.method public static final synthetic f()[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->h:[B

    .line 3
    return-object v0
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
    .line 18
.end method

.method public static final synthetic g()[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->m:[B

    .line 3
    return-object v0
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
    .line 18
.end method

.method public static final synthetic h()[[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->n:[[B

    .line 3
    return-object v0
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
    .line 18
.end method

.method public static final synthetic i()[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->k:[B

    .line 3
    return-object v0
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
    .line 18
.end method

.method public static final synthetic j()[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->c:[B

    .line 3
    return-object v0
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
    .line 18
.end method

.method public static final synthetic k()[B
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->e:[B

    .line 3
    return-object v0
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
    .line 18
.end method


# virtual methods
.method public determineFormat([BI)Lcom/facebook/imageformat/ImageFormat;
    .locals 2
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "headerBytes"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0, p2}, Le4/c;->h([BII)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->b:Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;

    .line 15
    .line 16
    .line 17
    invoke-static {v0, p1, p2}, Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;->access$getWebpFormat(Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;[BI)Lcom/facebook/imageformat/ImageFormat;

    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    .line 21
    :cond_0
    sget-object v0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->b:Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p1, p2}, Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;->access$isJpegHeader(Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;[BI)Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    sget-object p1, Ll5/a;->b:Lcom/facebook/imageformat/ImageFormat;

    .line 30
    return-object p1

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {v0, p1, p2}, Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;->access$isPngHeader(Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;[BI)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    sget-object p1, Ll5/a;->c:Lcom/facebook/imageformat/ImageFormat;

    .line 39
    return-object p1

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-static {v0, p1, p2}, Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;->access$isGifHeader(Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;[BI)Z

    .line 43
    move-result v1

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    sget-object p1, Ll5/a;->d:Lcom/facebook/imageformat/ImageFormat;

    .line 48
    return-object p1

    .line 49
    .line 50
    .line 51
    :cond_3
    invoke-static {v0, p1, p2}, Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;->access$isBmpHeader(Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;[BI)Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    sget-object p1, Ll5/a;->e:Lcom/facebook/imageformat/ImageFormat;

    .line 57
    return-object p1

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-static {v0, p1, p2}, Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;->access$isIcoHeader(Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;[BI)Z

    .line 61
    move-result v1

    .line 62
    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    sget-object p1, Ll5/a;->f:Lcom/facebook/imageformat/ImageFormat;

    .line 66
    return-object p1

    .line 67
    .line 68
    .line 69
    :cond_5
    invoke-static {v0, p1, p2}, Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;->access$isHeifHeader(Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;[BI)Z

    .line 70
    move-result v1

    .line 71
    .line 72
    if-eqz v1, :cond_6

    .line 73
    .line 74
    sget-object p1, Ll5/a;->l:Lcom/facebook/imageformat/ImageFormat;

    .line 75
    return-object p1

    .line 76
    .line 77
    .line 78
    :cond_6
    invoke-static {v0, p1, p2}, Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;->access$isDngHeader(Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;[BI)Z

    .line 79
    move-result p1

    .line 80
    .line 81
    if-eqz p1, :cond_7

    .line 82
    .line 83
    sget-object p1, Ll5/a;->m:Lcom/facebook/imageformat/ImageFormat;

    .line 84
    return-object p1

    .line 85
    .line 86
    :cond_7
    sget-object p1, Lcom/facebook/imageformat/ImageFormat;->d:Lcom/facebook/imageformat/ImageFormat;

    .line 87
    return-object p1
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
.end method

.method public getHeaderSize()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/imageformat/DefaultImageFormatChecker;->a:I

    .line 3
    return v0
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
    .line 18
.end method
