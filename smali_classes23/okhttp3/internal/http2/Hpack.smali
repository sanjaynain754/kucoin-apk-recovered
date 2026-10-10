.class public final Lokhttp3/internal/http2/Hpack;
.super Ljava/lang/Object;
.source "Hpack.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http2/Hpack$Reader;,
        Lokhttp3/internal/http2/Hpack$Writer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001a"
    }
    d2 = {
        "Lokhttp3/internal/http2/Hpack;",
        "",
        "()V",
        "NAME_TO_FIRST_INDEX",
        "",
        "Lokio/ByteString;",
        "",
        "getNAME_TO_FIRST_INDEX",
        "()Ljava/util/Map;",
        "PREFIX_4_BITS",
        "PREFIX_5_BITS",
        "PREFIX_6_BITS",
        "PREFIX_7_BITS",
        "SETTINGS_HEADER_TABLE_SIZE",
        "SETTINGS_HEADER_TABLE_SIZE_LIMIT",
        "STATIC_HEADER_TABLE",
        "",
        "Lokhttp3/internal/http2/Header;",
        "getSTATIC_HEADER_TABLE",
        "()[Lokhttp3/internal/http2/Header;",
        "[Lokhttp3/internal/http2/Header;",
        "checkLowercase",
        "name",
        "nameToFirstIndex",
        "Reader",
        "Writer",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lokhttp3/internal/http2/Hpack;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final NAME_TO_FIRST_INDEX:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lokio/ByteString;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PREFIX_4_BITS:I = 0xf

.field private static final PREFIX_5_BITS:I = 0x1f

.field private static final PREFIX_6_BITS:I = 0x3f

.field private static final PREFIX_7_BITS:I = 0x7f

.field private static final SETTINGS_HEADER_TABLE_SIZE:I = 0x1000

.field private static final SETTINGS_HEADER_TABLE_SIZE_LIMIT:I = 0x4000

.field private static final STATIC_HEADER_TABLE:[Lokhttp3/internal/http2/Header;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 64

    .line 1
    .line 2
    new-instance v0, Lokhttp3/internal/http2/Hpack;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lokhttp3/internal/http2/Hpack;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lokhttp3/internal/http2/Hpack;->INSTANCE:Lokhttp3/internal/http2/Hpack;

    .line 8
    .line 9
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 10
    .line 11
    sget-object v2, Lokhttp3/internal/http2/Header;->TARGET_AUTHORITY:Lokio/ByteString;

    .line 12
    .line 13
    const-string v3, ""

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 17
    .line 18
    new-instance v2, Lokhttp3/internal/http2/Header;

    .line 19
    .line 20
    sget-object v4, Lokhttp3/internal/http2/Header;->TARGET_METHOD:Lokio/ByteString;

    .line 21
    .line 22
    const-string v5, "GET"

    .line 23
    .line 24
    .line 25
    invoke-direct {v2, v4, v5}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 26
    .line 27
    new-instance v5, Lokhttp3/internal/http2/Header;

    .line 28
    .line 29
    const-string v6, "POST"

    .line 30
    .line 31
    .line 32
    invoke-direct {v5, v4, v6}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 33
    .line 34
    new-instance v4, Lokhttp3/internal/http2/Header;

    .line 35
    .line 36
    sget-object v6, Lokhttp3/internal/http2/Header;->TARGET_PATH:Lokio/ByteString;

    .line 37
    .line 38
    const-string v7, "/"

    .line 39
    .line 40
    .line 41
    invoke-direct {v4, v6, v7}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 42
    move-object v7, v5

    .line 43
    .line 44
    new-instance v5, Lokhttp3/internal/http2/Header;

    .line 45
    .line 46
    const-string v8, "/index.html"

    .line 47
    .line 48
    .line 49
    invoke-direct {v5, v6, v8}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 50
    .line 51
    new-instance v6, Lokhttp3/internal/http2/Header;

    .line 52
    .line 53
    sget-object v8, Lokhttp3/internal/http2/Header;->TARGET_SCHEME:Lokio/ByteString;

    .line 54
    .line 55
    const-string v9, "http"

    .line 56
    .line 57
    .line 58
    invoke-direct {v6, v8, v9}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 59
    move-object v9, v7

    .line 60
    .line 61
    new-instance v7, Lokhttp3/internal/http2/Header;

    .line 62
    .line 63
    const-string v10, "https"

    .line 64
    .line 65
    .line 66
    invoke-direct {v7, v8, v10}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 67
    .line 68
    new-instance v8, Lokhttp3/internal/http2/Header;

    .line 69
    .line 70
    sget-object v10, Lokhttp3/internal/http2/Header;->RESPONSE_STATUS:Lokio/ByteString;

    .line 71
    .line 72
    const-string v11, "200"

    .line 73
    .line 74
    .line 75
    invoke-direct {v8, v10, v11}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 76
    move-object v11, v9

    .line 77
    .line 78
    new-instance v9, Lokhttp3/internal/http2/Header;

    .line 79
    .line 80
    const-string v12, "204"

    .line 81
    .line 82
    .line 83
    invoke-direct {v9, v10, v12}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 84
    .line 85
    new-instance v12, Lokhttp3/internal/http2/Header;

    .line 86
    .line 87
    const-string v13, "206"

    .line 88
    .line 89
    .line 90
    invoke-direct {v12, v10, v13}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 91
    move-object v13, v11

    .line 92
    .line 93
    new-instance v11, Lokhttp3/internal/http2/Header;

    .line 94
    .line 95
    const-string v14, "304"

    .line 96
    .line 97
    .line 98
    invoke-direct {v11, v10, v14}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 99
    move-object v14, v12

    .line 100
    .line 101
    new-instance v12, Lokhttp3/internal/http2/Header;

    .line 102
    .line 103
    const-string v15, "400"

    .line 104
    .line 105
    .line 106
    invoke-direct {v12, v10, v15}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 107
    move-object v15, v13

    .line 108
    .line 109
    new-instance v13, Lokhttp3/internal/http2/Header;

    .line 110
    .line 111
    move-object/from16 v62, v0

    .line 112
    .line 113
    const-string v0, "404"

    .line 114
    .line 115
    .line 116
    invoke-direct {v13, v10, v0}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 117
    move-object v0, v14

    .line 118
    .line 119
    new-instance v14, Lokhttp3/internal/http2/Header;

    .line 120
    .line 121
    move-object/from16 v16, v0

    .line 122
    .line 123
    const-string v0, "500"

    .line 124
    .line 125
    .line 126
    invoke-direct {v14, v10, v0}, Lokhttp3/internal/http2/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    .line 127
    move-object v0, v15

    .line 128
    .line 129
    new-instance v15, Lokhttp3/internal/http2/Header;

    .line 130
    .line 131
    const-string v10, "accept-charset"

    .line 132
    .line 133
    .line 134
    invoke-direct {v15, v10, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    new-instance v10, Lokhttp3/internal/http2/Header;

    .line 137
    .line 138
    move-object/from16 v17, v0

    .line 139
    .line 140
    const-string v0, "accept-encoding"

    .line 141
    .line 142
    move-object/from16 v18, v1

    .line 143
    .line 144
    const-string v1, "gzip, deflate"

    .line 145
    .line 146
    .line 147
    invoke-direct {v10, v0, v1}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 150
    .line 151
    const-string v1, "accept-language"

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 157
    .line 158
    move-object/from16 v19, v0

    .line 159
    .line 160
    const-string v0, "accept-ranges"

    .line 161
    .line 162
    .line 163
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 166
    .line 167
    move-object/from16 v20, v1

    .line 168
    .line 169
    const-string v1, "accept"

    .line 170
    .line 171
    .line 172
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 175
    .line 176
    move-object/from16 v21, v0

    .line 177
    .line 178
    const-string v0, "access-control-allow-origin"

    .line 179
    .line 180
    .line 181
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 184
    .line 185
    move-object/from16 v22, v1

    .line 186
    .line 187
    const-string v1, "age"

    .line 188
    .line 189
    .line 190
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 193
    .line 194
    move-object/from16 v23, v0

    .line 195
    .line 196
    const-string v0, "allow"

    .line 197
    .line 198
    .line 199
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 202
    .line 203
    move-object/from16 v24, v1

    .line 204
    .line 205
    const-string v1, "authorization"

    .line 206
    .line 207
    .line 208
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    .line 210
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 211
    .line 212
    move-object/from16 v25, v0

    .line 213
    .line 214
    const-string v0, "cache-control"

    .line 215
    .line 216
    .line 217
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 220
    .line 221
    move-object/from16 v26, v1

    .line 222
    .line 223
    const-string v1, "content-disposition"

    .line 224
    .line 225
    .line 226
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 229
    .line 230
    move-object/from16 v27, v0

    .line 231
    .line 232
    const-string v0, "content-encoding"

    .line 233
    .line 234
    .line 235
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 238
    .line 239
    move-object/from16 v28, v1

    .line 240
    .line 241
    const-string v1, "content-language"

    .line 242
    .line 243
    .line 244
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 247
    .line 248
    move-object/from16 v29, v0

    .line 249
    .line 250
    const-string v0, "content-length"

    .line 251
    .line 252
    .line 253
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 256
    .line 257
    move-object/from16 v30, v1

    .line 258
    .line 259
    const-string v1, "content-location"

    .line 260
    .line 261
    .line 262
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 265
    .line 266
    move-object/from16 v31, v0

    .line 267
    .line 268
    const-string v0, "content-range"

    .line 269
    .line 270
    .line 271
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    .line 273
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 274
    .line 275
    move-object/from16 v32, v1

    .line 276
    .line 277
    const-string v1, "content-type"

    .line 278
    .line 279
    .line 280
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 283
    .line 284
    move-object/from16 v33, v0

    .line 285
    .line 286
    const-string v0, "cookie"

    .line 287
    .line 288
    .line 289
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 292
    .line 293
    move-object/from16 v34, v1

    .line 294
    .line 295
    const-string v1, "date"

    .line 296
    .line 297
    .line 298
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    .line 300
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 301
    .line 302
    move-object/from16 v35, v0

    .line 303
    .line 304
    const-string v0, "etag"

    .line 305
    .line 306
    .line 307
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    .line 309
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 310
    .line 311
    move-object/from16 v36, v1

    .line 312
    .line 313
    const-string v1, "expect"

    .line 314
    .line 315
    .line 316
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    .line 318
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 319
    .line 320
    move-object/from16 v37, v0

    .line 321
    .line 322
    const-string v0, "expires"

    .line 323
    .line 324
    .line 325
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    .line 327
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 328
    .line 329
    move-object/from16 v38, v1

    .line 330
    .line 331
    const-string v1, "from"

    .line 332
    .line 333
    .line 334
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 337
    .line 338
    move-object/from16 v39, v0

    .line 339
    .line 340
    const-string v0, "host"

    .line 341
    .line 342
    .line 343
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    .line 345
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 346
    .line 347
    move-object/from16 v40, v1

    .line 348
    .line 349
    const-string v1, "if-match"

    .line 350
    .line 351
    .line 352
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    .line 354
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 355
    .line 356
    move-object/from16 v41, v0

    .line 357
    .line 358
    const-string v0, "if-modified-since"

    .line 359
    .line 360
    .line 361
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    .line 363
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 364
    .line 365
    move-object/from16 v42, v1

    .line 366
    .line 367
    const-string v1, "if-none-match"

    .line 368
    .line 369
    .line 370
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    .line 372
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 373
    .line 374
    move-object/from16 v43, v0

    .line 375
    .line 376
    const-string v0, "if-range"

    .line 377
    .line 378
    .line 379
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    .line 381
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 382
    .line 383
    move-object/from16 v44, v1

    .line 384
    .line 385
    const-string v1, "if-unmodified-since"

    .line 386
    .line 387
    .line 388
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    .line 390
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 391
    .line 392
    move-object/from16 v45, v0

    .line 393
    .line 394
    .line 395
    const-string/jumbo v0, "last-modified"

    .line 396
    .line 397
    .line 398
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    .line 400
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 401
    .line 402
    move-object/from16 v46, v1

    .line 403
    .line 404
    .line 405
    const-string/jumbo v1, "link"

    .line 406
    .line 407
    .line 408
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    .line 410
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 411
    .line 412
    move-object/from16 v47, v0

    .line 413
    .line 414
    .line 415
    const-string/jumbo v0, "location"

    .line 416
    .line 417
    .line 418
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    .line 420
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 421
    .line 422
    move-object/from16 v48, v1

    .line 423
    .line 424
    .line 425
    const-string/jumbo v1, "max-forwards"

    .line 426
    .line 427
    .line 428
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    .line 430
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 431
    .line 432
    move-object/from16 v49, v0

    .line 433
    .line 434
    .line 435
    const-string/jumbo v0, "proxy-authenticate"

    .line 436
    .line 437
    .line 438
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    .line 440
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 441
    .line 442
    move-object/from16 v50, v1

    .line 443
    .line 444
    .line 445
    const-string/jumbo v1, "proxy-authorization"

    .line 446
    .line 447
    .line 448
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    .line 450
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 451
    .line 452
    move-object/from16 v51, v0

    .line 453
    .line 454
    .line 455
    const-string/jumbo v0, "range"

    .line 456
    .line 457
    .line 458
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 459
    .line 460
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 461
    .line 462
    move-object/from16 v52, v1

    .line 463
    .line 464
    .line 465
    const-string/jumbo v1, "referer"

    .line 466
    .line 467
    .line 468
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    .line 470
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 471
    .line 472
    move-object/from16 v53, v0

    .line 473
    .line 474
    .line 475
    const-string/jumbo v0, "refresh"

    .line 476
    .line 477
    .line 478
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    .line 480
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 481
    .line 482
    move-object/from16 v54, v1

    .line 483
    .line 484
    .line 485
    const-string/jumbo v1, "retry-after"

    .line 486
    .line 487
    .line 488
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 489
    .line 490
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 491
    .line 492
    move-object/from16 v55, v0

    .line 493
    .line 494
    .line 495
    const-string/jumbo v0, "server"

    .line 496
    .line 497
    .line 498
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    .line 500
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 501
    .line 502
    move-object/from16 v56, v1

    .line 503
    .line 504
    .line 505
    const-string/jumbo v1, "set-cookie"

    .line 506
    .line 507
    .line 508
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    .line 510
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 511
    .line 512
    move-object/from16 v57, v0

    .line 513
    .line 514
    .line 515
    const-string/jumbo v0, "strict-transport-security"

    .line 516
    .line 517
    .line 518
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    .line 520
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 521
    .line 522
    move-object/from16 v58, v1

    .line 523
    .line 524
    .line 525
    const-string/jumbo v1, "transfer-encoding"

    .line 526
    .line 527
    .line 528
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    .line 530
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 531
    .line 532
    move-object/from16 v59, v0

    .line 533
    .line 534
    .line 535
    const-string/jumbo v0, "user-agent"

    .line 536
    .line 537
    .line 538
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    .line 540
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 541
    .line 542
    move-object/from16 v60, v1

    .line 543
    .line 544
    .line 545
    const-string/jumbo v1, "vary"

    .line 546
    .line 547
    .line 548
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 549
    .line 550
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 551
    .line 552
    move-object/from16 v61, v0

    .line 553
    .line 554
    .line 555
    const-string/jumbo v0, "via"

    .line 556
    .line 557
    .line 558
    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 559
    .line 560
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 561
    .line 562
    move-object/from16 v63, v1

    .line 563
    .line 564
    .line 565
    const-string/jumbo v1, "www-authenticate"

    .line 566
    .line 567
    .line 568
    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    .line 570
    move-object/from16 v1, v16

    .line 571
    .line 572
    move-object/from16 v16, v10

    .line 573
    move-object v10, v1

    .line 574
    .line 575
    move-object/from16 v3, v17

    .line 576
    .line 577
    move-object/from16 v1, v18

    .line 578
    .line 579
    move-object/from16 v17, v19

    .line 580
    .line 581
    move-object/from16 v18, v20

    .line 582
    .line 583
    move-object/from16 v19, v21

    .line 584
    .line 585
    move-object/from16 v20, v22

    .line 586
    .line 587
    move-object/from16 v21, v23

    .line 588
    .line 589
    move-object/from16 v22, v24

    .line 590
    .line 591
    move-object/from16 v23, v25

    .line 592
    .line 593
    move-object/from16 v24, v26

    .line 594
    .line 595
    move-object/from16 v25, v27

    .line 596
    .line 597
    move-object/from16 v26, v28

    .line 598
    .line 599
    move-object/from16 v27, v29

    .line 600
    .line 601
    move-object/from16 v28, v30

    .line 602
    .line 603
    move-object/from16 v29, v31

    .line 604
    .line 605
    move-object/from16 v30, v32

    .line 606
    .line 607
    move-object/from16 v31, v33

    .line 608
    .line 609
    move-object/from16 v32, v34

    .line 610
    .line 611
    move-object/from16 v33, v35

    .line 612
    .line 613
    move-object/from16 v34, v36

    .line 614
    .line 615
    move-object/from16 v35, v37

    .line 616
    .line 617
    move-object/from16 v36, v38

    .line 618
    .line 619
    move-object/from16 v37, v39

    .line 620
    .line 621
    move-object/from16 v38, v40

    .line 622
    .line 623
    move-object/from16 v39, v41

    .line 624
    .line 625
    move-object/from16 v40, v42

    .line 626
    .line 627
    move-object/from16 v41, v43

    .line 628
    .line 629
    move-object/from16 v42, v44

    .line 630
    .line 631
    move-object/from16 v43, v45

    .line 632
    .line 633
    move-object/from16 v44, v46

    .line 634
    .line 635
    move-object/from16 v45, v47

    .line 636
    .line 637
    move-object/from16 v46, v48

    .line 638
    .line 639
    move-object/from16 v47, v49

    .line 640
    .line 641
    move-object/from16 v48, v50

    .line 642
    .line 643
    move-object/from16 v49, v51

    .line 644
    .line 645
    move-object/from16 v50, v52

    .line 646
    .line 647
    move-object/from16 v51, v53

    .line 648
    .line 649
    move-object/from16 v52, v54

    .line 650
    .line 651
    move-object/from16 v53, v55

    .line 652
    .line 653
    move-object/from16 v54, v56

    .line 654
    .line 655
    move-object/from16 v55, v57

    .line 656
    .line 657
    move-object/from16 v56, v58

    .line 658
    .line 659
    move-object/from16 v57, v59

    .line 660
    .line 661
    move-object/from16 v58, v60

    .line 662
    .line 663
    move-object/from16 v59, v61

    .line 664
    .line 665
    move-object/from16 v60, v63

    .line 666
    .line 667
    move-object/from16 v61, v0

    .line 668
    .line 669
    .line 670
    filled-new-array/range {v1 .. v61}, [Lokhttp3/internal/http2/Header;

    .line 671
    move-result-object v0

    .line 672
    .line 673
    sput-object v0, Lokhttp3/internal/http2/Hpack;->STATIC_HEADER_TABLE:[Lokhttp3/internal/http2/Header;

    .line 674
    .line 675
    .line 676
    invoke-direct/range {v62 .. v62}, Lokhttp3/internal/http2/Hpack;->nameToFirstIndex()Ljava/util/Map;

    .line 677
    move-result-object v0

    .line 678
    .line 679
    sput-object v0, Lokhttp3/internal/http2/Hpack;->NAME_TO_FIRST_INDEX:Ljava/util/Map;

    .line 680
    return-void
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
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
.end method

.method private constructor <init>()V
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
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method private final nameToFirstIndex()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lokio/ByteString;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    sget-object v1, Lokhttp3/internal/http2/Hpack;->STATIC_HEADER_TABLE:[Lokhttp3/internal/http2/Header;

    .line 5
    array-length v2, v1

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 9
    array-length v1, v1

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    sget-object v3, Lokhttp3/internal/http2/Hpack;->STATIC_HEADER_TABLE:[Lokhttp3/internal/http2/Header;

    .line 15
    .line 16
    aget-object v4, v3, v2

    .line 17
    .line 18
    iget-object v4, v4, Lokhttp3/internal/http2/Header;->name:Lokio/ByteString;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v4}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    move-result v4

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    aget-object v3, v3, v2

    .line 31
    .line 32
    iget-object v3, v3, Lokhttp3/internal/http2/Header;->name:Lokio/ByteString;

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    const-string/jumbo v1, "unmodifiableMap(result)"

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    return-object v0
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
.end method


# virtual methods
.method public final checkLowercase(Lokio/ByteString;)Lokio/ByteString;
    .locals 4
    .param p1    # Lokio/ByteString;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "name"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    :goto_0
    if-ge v1, v0, :cond_2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v1}, Lokio/ByteString;->getByte(I)B

    .line 17
    move-result v2

    .line 18
    .line 19
    const/16 v3, 0x41

    .line 20
    .line 21
    if-gt v3, v2, :cond_1

    .line 22
    .line 23
    const/16 v3, 0x5b

    .line 24
    .line 25
    if-lt v2, v3, :cond_0

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    const-string v2, "PROTOCOL_ERROR response malformed: mixed case name: "

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lokio/ByteString;->utf8()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 53
    throw v0

    .line 54
    .line 55
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return-object p1
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
.end method

.method public final getNAME_TO_FIRST_INDEX()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lokio/ByteString;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lokhttp3/internal/http2/Hpack;->NAME_TO_FIRST_INDEX:Ljava/util/Map;

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
    .line 19
    .line 20
.end method

.method public final getSTATIC_HEADER_TABLE()[Lokhttp3/internal/http2/Header;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lokhttp3/internal/http2/Hpack;->STATIC_HEADER_TABLE:[Lokhttp3/internal/http2/Header;

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
    .line 19
    .line 20
.end method
