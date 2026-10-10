.class public final enum Lcom/jumio/core/enums/ErrorCase;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/jumio/core/enums/ErrorCase;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B!\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/jumio/core/enums/ErrorCase;",
        "",
        "domain",
        "",
        "message",
        "",
        "retry",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;IZ)V",
        "getDomain",
        "()Ljava/lang/String;",
        "getMessage",
        "()I",
        "getRetry",
        "()Z",
        "GENERAL_NETWORK_ERROR",
        "BLOCKING_NETWORK_ERROR",
        "CERTIFICATE_ERROR",
        "AUTH_FAILED",
        "DEVICE_IS_OFFLINE",
        "OCR_LOADING_FAILED",
        "CANCEL_TYPE_USER",
        "NO_CAMERA_CONNECTION",
        "ALE_KEY_NOT_VALID",
        "TRANSACTION_FINISHED",
        "PROCESS_CANT_BE_COMPLETED",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum ALE_KEY_NOT_VALID:Lcom/jumio/core/enums/ErrorCase;

.field public static final enum AUTH_FAILED:Lcom/jumio/core/enums/ErrorCase;

.field public static final enum BLOCKING_NETWORK_ERROR:Lcom/jumio/core/enums/ErrorCase;

.field public static final enum CANCEL_TYPE_USER:Lcom/jumio/core/enums/ErrorCase;

.field public static final enum CERTIFICATE_ERROR:Lcom/jumio/core/enums/ErrorCase;

.field public static final enum DEVICE_IS_OFFLINE:Lcom/jumio/core/enums/ErrorCase;

.field public static final enum GENERAL_NETWORK_ERROR:Lcom/jumio/core/enums/ErrorCase;

.field public static final enum NO_CAMERA_CONNECTION:Lcom/jumio/core/enums/ErrorCase;

.field public static final enum OCR_LOADING_FAILED:Lcom/jumio/core/enums/ErrorCase;

.field public static final enum PROCESS_CANT_BE_COMPLETED:Lcom/jumio/core/enums/ErrorCase;

.field public static final enum TRANSACTION_FINISHED:Lcom/jumio/core/enums/ErrorCase;

.field public static final synthetic d:[Lcom/jumio/core/enums/ErrorCase;

.field public static final synthetic e:Lkotlin/enums/EnumEntries;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/enums/ErrorCase;

    .line 3
    .line 4
    sget v4, Lcom/jumio/core/R$string;->jumio_error_case_network_problems:I

    .line 5
    .line 6
    const-string v3, "A"

    .line 7
    const/4 v5, 0x1

    .line 8
    .line 9
    const-string v1, "GENERAL_NETWORK_ERROR"

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lcom/jumio/core/enums/ErrorCase;-><init>(Ljava/lang/String;ILjava/lang/String;IZ)V

    .line 14
    .line 15
    sput-object v0, Lcom/jumio/core/enums/ErrorCase;->GENERAL_NETWORK_ERROR:Lcom/jumio/core/enums/ErrorCase;

    .line 16
    .line 17
    new-instance v1, Lcom/jumio/core/enums/ErrorCase;

    .line 18
    move v5, v4

    .line 19
    .line 20
    const-string v4, "A"

    .line 21
    const/4 v6, 0x0

    .line 22
    .line 23
    const-string v2, "BLOCKING_NETWORK_ERROR"

    .line 24
    const/4 v3, 0x1

    .line 25
    .line 26
    .line 27
    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/enums/ErrorCase;-><init>(Ljava/lang/String;ILjava/lang/String;IZ)V

    .line 28
    .line 29
    sput-object v1, Lcom/jumio/core/enums/ErrorCase;->BLOCKING_NETWORK_ERROR:Lcom/jumio/core/enums/ErrorCase;

    .line 30
    .line 31
    new-instance v2, Lcom/jumio/core/enums/ErrorCase;

    .line 32
    .line 33
    sget v6, Lcom/jumio/core/R$string;->jumio_error_case_auth_failed:I

    .line 34
    .line 35
    const-string v5, "B"

    .line 36
    const/4 v7, 0x0

    .line 37
    .line 38
    const-string v3, "CERTIFICATE_ERROR"

    .line 39
    const/4 v4, 0x2

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v2 .. v7}, Lcom/jumio/core/enums/ErrorCase;-><init>(Ljava/lang/String;ILjava/lang/String;IZ)V

    .line 43
    .line 44
    sput-object v2, Lcom/jumio/core/enums/ErrorCase;->CERTIFICATE_ERROR:Lcom/jumio/core/enums/ErrorCase;

    .line 45
    .line 46
    new-instance v3, Lcom/jumio/core/enums/ErrorCase;

    .line 47
    move v7, v6

    .line 48
    .line 49
    const-string v6, "C"

    .line 50
    const/4 v8, 0x0

    .line 51
    .line 52
    const-string v4, "AUTH_FAILED"

    .line 53
    const/4 v5, 0x3

    .line 54
    .line 55
    .line 56
    invoke-direct/range {v3 .. v8}, Lcom/jumio/core/enums/ErrorCase;-><init>(Ljava/lang/String;ILjava/lang/String;IZ)V

    .line 57
    .line 58
    sput-object v3, Lcom/jumio/core/enums/ErrorCase;->AUTH_FAILED:Lcom/jumio/core/enums/ErrorCase;

    .line 59
    .line 60
    new-instance v4, Lcom/jumio/core/enums/ErrorCase;

    .line 61
    .line 62
    sget v8, Lcom/jumio/core/R$string;->jumio_error_case_device_is_offline:I

    .line 63
    .line 64
    const-string v7, "E"

    .line 65
    const/4 v9, 0x1

    .line 66
    .line 67
    const-string v5, "DEVICE_IS_OFFLINE"

    .line 68
    const/4 v6, 0x4

    .line 69
    .line 70
    .line 71
    invoke-direct/range {v4 .. v9}, Lcom/jumio/core/enums/ErrorCase;-><init>(Ljava/lang/String;ILjava/lang/String;IZ)V

    .line 72
    .line 73
    sput-object v4, Lcom/jumio/core/enums/ErrorCase;->DEVICE_IS_OFFLINE:Lcom/jumio/core/enums/ErrorCase;

    .line 74
    .line 75
    new-instance v5, Lcom/jumio/core/enums/ErrorCase;

    .line 76
    .line 77
    sget v9, Lcom/jumio/core/R$string;->jumio_error_case_scanning_not_possible:I

    .line 78
    .line 79
    const-string v8, "F"

    .line 80
    const/4 v10, 0x0

    .line 81
    .line 82
    const-string v6, "OCR_LOADING_FAILED"

    .line 83
    const/4 v7, 0x5

    .line 84
    .line 85
    .line 86
    invoke-direct/range {v5 .. v10}, Lcom/jumio/core/enums/ErrorCase;-><init>(Ljava/lang/String;ILjava/lang/String;IZ)V

    .line 87
    .line 88
    sput-object v5, Lcom/jumio/core/enums/ErrorCase;->OCR_LOADING_FAILED:Lcom/jumio/core/enums/ErrorCase;

    .line 89
    .line 90
    new-instance v6, Lcom/jumio/core/enums/ErrorCase;

    .line 91
    .line 92
    sget v14, Lcom/jumio/core/R$string;->jumio_error_case_cancelled_by_user:I

    .line 93
    .line 94
    const-string v13, "G"

    .line 95
    const/4 v15, 0x0

    .line 96
    .line 97
    const-string v11, "CANCEL_TYPE_USER"

    .line 98
    const/4 v12, 0x6

    .line 99
    move-object v10, v6

    .line 100
    .line 101
    .line 102
    invoke-direct/range {v10 .. v15}, Lcom/jumio/core/enums/ErrorCase;-><init>(Ljava/lang/String;ILjava/lang/String;IZ)V

    .line 103
    move-object v12, v10

    .line 104
    .line 105
    sput-object v12, Lcom/jumio/core/enums/ErrorCase;->CANCEL_TYPE_USER:Lcom/jumio/core/enums/ErrorCase;

    .line 106
    .line 107
    new-instance v7, Lcom/jumio/core/enums/ErrorCase;

    .line 108
    .line 109
    sget v17, Lcom/jumio/core/R$string;->jumio_error_case_no_camera_connection:I

    .line 110
    .line 111
    const-string v16, "H"

    .line 112
    .line 113
    const/16 v18, 0x0

    .line 114
    .line 115
    const-string v14, "NO_CAMERA_CONNECTION"

    .line 116
    const/4 v15, 0x7

    .line 117
    move-object v13, v7

    .line 118
    .line 119
    .line 120
    invoke-direct/range {v13 .. v18}, Lcom/jumio/core/enums/ErrorCase;-><init>(Ljava/lang/String;ILjava/lang/String;IZ)V

    .line 121
    .line 122
    sput-object v13, Lcom/jumio/core/enums/ErrorCase;->NO_CAMERA_CONNECTION:Lcom/jumio/core/enums/ErrorCase;

    .line 123
    .line 124
    new-instance v8, Lcom/jumio/core/enums/ErrorCase;

    .line 125
    .line 126
    sget v18, Lcom/jumio/core/R$string;->jumio_error_case_certificate_not_valid_anymore:I

    .line 127
    .line 128
    const-string v17, "I"

    .line 129
    .line 130
    const/16 v19, 0x0

    .line 131
    .line 132
    const-string v15, "ALE_KEY_NOT_VALID"

    .line 133
    .line 134
    const/16 v16, 0x8

    .line 135
    move-object v14, v8

    .line 136
    .line 137
    .line 138
    invoke-direct/range {v14 .. v19}, Lcom/jumio/core/enums/ErrorCase;-><init>(Ljava/lang/String;ILjava/lang/String;IZ)V

    .line 139
    .line 140
    sput-object v14, Lcom/jumio/core/enums/ErrorCase;->ALE_KEY_NOT_VALID:Lcom/jumio/core/enums/ErrorCase;

    .line 141
    .line 142
    new-instance v15, Lcom/jumio/core/enums/ErrorCase;

    .line 143
    .line 144
    sget v19, Lcom/jumio/core/R$string;->jumio_error_case_session_expired:I

    .line 145
    .line 146
    const-string v18, "J"

    .line 147
    .line 148
    const/16 v20, 0x0

    .line 149
    .line 150
    const-string v16, "TRANSACTION_FINISHED"

    .line 151
    .line 152
    const/16 v17, 0x9

    .line 153
    .line 154
    .line 155
    invoke-direct/range {v15 .. v20}, Lcom/jumio/core/enums/ErrorCase;-><init>(Ljava/lang/String;ILjava/lang/String;IZ)V

    .line 156
    .line 157
    sput-object v15, Lcom/jumio/core/enums/ErrorCase;->TRANSACTION_FINISHED:Lcom/jumio/core/enums/ErrorCase;

    .line 158
    .line 159
    new-instance v6, Lcom/jumio/core/enums/ErrorCase;

    .line 160
    move v10, v9

    .line 161
    .line 162
    const-string v9, "N"

    .line 163
    const/4 v11, 0x0

    .line 164
    .line 165
    const-string v7, "PROCESS_CANT_BE_COMPLETED"

    .line 166
    .line 167
    const/16 v8, 0xa

    .line 168
    .line 169
    .line 170
    invoke-direct/range {v6 .. v11}, Lcom/jumio/core/enums/ErrorCase;-><init>(Ljava/lang/String;ILjava/lang/String;IZ)V

    .line 171
    .line 172
    sput-object v6, Lcom/jumio/core/enums/ErrorCase;->PROCESS_CANT_BE_COMPLETED:Lcom/jumio/core/enums/ErrorCase;

    .line 173
    move-object v10, v6

    .line 174
    move-object v6, v12

    .line 175
    move-object v7, v13

    .line 176
    move-object v8, v14

    .line 177
    move-object v9, v15

    .line 178
    .line 179
    .line 180
    filled-new-array/range {v0 .. v10}, [Lcom/jumio/core/enums/ErrorCase;

    .line 181
    move-result-object v0

    .line 182
    .line 183
    sput-object v0, Lcom/jumio/core/enums/ErrorCase;->d:[Lcom/jumio/core/enums/ErrorCase;

    .line 184
    .line 185
    .line 186
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 187
    move-result-object v0

    .line 188
    .line 189
    sput-object v0, Lcom/jumio/core/enums/ErrorCase;->e:Lkotlin/enums/EnumEntries;

    .line 190
    return-void
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

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;IZ)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput-object p3, p0, Lcom/jumio/core/enums/ErrorCase;->a:Ljava/lang/String;

    .line 6
    .line 7
    iput p4, p0, Lcom/jumio/core/enums/ErrorCase;->b:I

    .line 8
    .line 9
    iput-boolean p5, p0, Lcom/jumio/core/enums/ErrorCase;->c:Z

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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/jumio/core/enums/ErrorCase;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/enums/ErrorCase;->e:Lkotlin/enums/EnumEntries;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/jumio/core/enums/ErrorCase;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/jumio/core/enums/ErrorCase;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/jumio/core/enums/ErrorCase;

    .line 9
    return-object p0
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

.method public static values()[Lcom/jumio/core/enums/ErrorCase;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/enums/ErrorCase;->d:[Lcom/jumio/core/enums/ErrorCase;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/jumio/core/enums/ErrorCase;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method


# virtual methods
.method public final getDomain()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/enums/ErrorCase;->a:Ljava/lang/String;

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
.end method

.method public final getMessage()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/enums/ErrorCase;->b:I

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
.end method

.method public final getRetry()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/enums/ErrorCase;->c:Z

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
.end method
