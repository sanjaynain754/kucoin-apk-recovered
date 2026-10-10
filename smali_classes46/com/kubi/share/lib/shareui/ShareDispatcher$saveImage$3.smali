.class final Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ShareDispatcher.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/share/lib/shareui/ShareDispatcher;->j(Landroid/graphics/Bitmap;Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/m0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.share.lib.shareui.ShareDispatcher$saveImage$3"
    f = "ShareDispatcher.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3
    }
    l = {
        0x108,
        0x10d,
        0x115,
        0x11b
    }
    m = "invokeSuspend"
    n = {
        "fileName",
        "mimeType",
        "contentValues",
        "resolver",
        "collection",
        "imageUri",
        "outputStream",
        "fileName",
        "mimeType",
        "contentValues",
        "resolver",
        "collection",
        "imageUri",
        "outputStream",
        "fileName",
        "mimeType",
        "contentValues",
        "resolver",
        "collection",
        "imageUri",
        "e"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nShareDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareDispatcher.kt\ncom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3\n+ 2 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,324:1\n45#2,4:325\n*S KotlinDebug\n*F\n+ 1 ShareDispatcher.kt\ncom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3\n*L\n282#1:325,4\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $bitmap:Landroid/graphics/Bitmap;

.field final synthetic $closeDailog:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $fragment:Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;",
            "Landroid/graphics/Bitmap;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->$fragment:Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->$bitmap:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->$closeDailog:Lkotlin/jvm/functions/Function0;

    .line 7
    const/4 p1, 0x2

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 11
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance p1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->$fragment:Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->$bitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->$closeDailog:Lkotlin/jvm/functions/Function0;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;-><init>(Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 12
    return-object p1
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    iget v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->label:I

    .line 9
    const/4 v3, 0x4

    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    if-eq v0, v6, :cond_3

    .line 18
    .line 19
    if-eq v0, v5, :cond_2

    .line 20
    .line 21
    if-eq v0, v4, :cond_1

    .line 22
    .line 23
    if-ne v0, v3, :cond_0

    .line 24
    .line 25
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Exception;

    .line 28
    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    throw v0

    .line 41
    .line 42
    :cond_1
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$5:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Landroid/net/Uri;

    .line 45
    .line 46
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$4:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Landroid/net/Uri;

    .line 49
    .line 50
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$3:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Landroid/content/ContentResolver;

    .line 53
    .line 54
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$2:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Landroid/content/ContentValues;

    .line 57
    .line 58
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$1:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ljava/lang/String;

    .line 61
    .line 62
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    goto/16 :goto_6

    .line 70
    :catch_0
    move-exception v0

    .line 71
    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :cond_2
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$6:Ljava/lang/Object;

    .line 75
    move-object v4, v0

    .line 76
    .line 77
    check-cast v4, Ljava/io/OutputStream;

    .line 78
    .line 79
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$5:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Landroid/net/Uri;

    .line 82
    .line 83
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$4:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Landroid/net/Uri;

    .line 86
    .line 87
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$3:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Landroid/content/ContentResolver;

    .line 90
    .line 91
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$2:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Landroid/content/ContentValues;

    .line 94
    .line 95
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$1:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Ljava/lang/String;

    .line 98
    .line 99
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$0:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    :goto_0
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    goto/16 :goto_2

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    .line 109
    goto/16 :goto_3

    .line 110
    .line 111
    :cond_3
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$6:Ljava/lang/Object;

    .line 112
    move-object v4, v0

    .line 113
    .line 114
    check-cast v4, Ljava/io/OutputStream;

    .line 115
    .line 116
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$5:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Landroid/net/Uri;

    .line 119
    .line 120
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$4:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Landroid/net/Uri;

    .line 123
    .line 124
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$3:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Landroid/content/ContentResolver;

    .line 127
    .line 128
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$2:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Landroid/content/ContentValues;

    .line 131
    .line 132
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$1:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Ljava/lang/String;

    .line 135
    .line 136
    iget-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$0:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Ljava/lang/String;

    .line 139
    goto :goto_0

    .line 140
    .line 141
    .line 142
    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 143
    .line 144
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    const-string v8, "share_"

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 156
    move-result-wide v8

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v8, ".jpg"

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    const-string v8, "image/jpeg"

    .line 171
    .line 172
    new-instance v9, Landroid/content/ContentValues;

    .line 173
    .line 174
    .line 175
    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    .line 176
    .line 177
    const-string v10, "_display_name"

    .line 178
    .line 179
    .line 180
    invoke-virtual {v9, v10, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    const-string v10, "mime_type"

    .line 183
    .line 184
    .line 185
    invoke-virtual {v9, v10, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 188
    .line 189
    const-string v11, "is_pending"

    .line 190
    .line 191
    const/16 v12, 0x1d

    .line 192
    .line 193
    if-lt v10, v12, :cond_5

    .line 194
    .line 195
    :try_start_3
    const-string v13, "relative_path"

    .line 196
    .line 197
    new-instance v14, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    .line 202
    sget-object v15, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v15, "/KuCoin"

    .line 208
    .line 209
    .line 210
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    move-result-object v14

    .line 215
    .line 216
    .line 217
    invoke-virtual {v9, v13, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 221
    move-result-object v13

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9, v11, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 225
    .line 226
    :cond_5
    iget-object v13, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->$fragment:Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 230
    move-result-object v13

    .line 231
    .line 232
    .line 233
    invoke-virtual {v13}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 234
    move-result-object v13

    .line 235
    .line 236
    if-lt v10, v12, :cond_6

    .line 237
    .line 238
    const-string v14, "external_primary"

    .line 239
    .line 240
    .line 241
    invoke-static {v14}, Landroid/provider/MediaStore$Images$Media;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 242
    move-result-object v14

    .line 243
    goto :goto_1

    .line 244
    .line 245
    :cond_6
    sget-object v14, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 246
    .line 247
    .line 248
    :goto_1
    invoke-virtual {v13, v14, v9}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 249
    move-result-object v15
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 250
    .line 251
    if-eqz v15, :cond_b

    .line 252
    .line 253
    .line 254
    :try_start_4
    invoke-virtual {v13, v15}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 255
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 256
    .line 257
    if-eqz v4, :cond_8

    .line 258
    .line 259
    :try_start_5
    iget-object v5, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->$bitmap:Landroid/graphics/Bitmap;

    .line 260
    .line 261
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 262
    .line 263
    const/16 v6, 0x5a

    .line 264
    .line 265
    .line 266
    invoke-virtual {v5, v3, v6, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 267
    .line 268
    .line 269
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 270
    .line 271
    if-lt v10, v12, :cond_7

    .line 272
    .line 273
    .line 274
    invoke-virtual {v9}, Landroid/content/ContentValues;->clear()V

    .line 275
    const/4 v3, 0x0

    .line 276
    .line 277
    .line 278
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 279
    move-result-object v3

    .line 280
    .line 281
    .line 282
    invoke-virtual {v9, v11, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v13, v15, v9, v7, v7}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 286
    .line 287
    .line 288
    :cond_7
    invoke-static {}, Lo00/a;->c()Lkotlinx/coroutines/j0;

    .line 289
    move-result-object v3

    .line 290
    .line 291
    new-instance v5, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3$1;

    .line 292
    .line 293
    iget-object v6, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->$fragment:Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;

    .line 294
    .line 295
    iget-object v10, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->$closeDailog:Lkotlin/jvm/functions/Function0;

    .line 296
    .line 297
    .line 298
    invoke-direct {v5, v6, v10, v7}, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3$1;-><init>(Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    move-result-object v0

    .line 303
    .line 304
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$0:Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    move-result-object v0

    .line 309
    .line 310
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$1:Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    move-result-object v0

    .line 315
    .line 316
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$2:Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    move-result-object v0

    .line 321
    .line 322
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$3:Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    move-result-object v0

    .line 327
    .line 328
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$4:Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    move-result-object v0

    .line 333
    .line 334
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$5:Ljava/lang/Object;

    .line 335
    .line 336
    iput-object v4, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$6:Ljava/lang/Object;

    .line 337
    const/4 v0, 0x1

    .line 338
    .line 339
    iput v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->label:I

    .line 340
    .line 341
    .line 342
    invoke-static {v3, v5, v1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 343
    move-result-object v0

    .line 344
    .line 345
    if-ne v0, v2, :cond_9

    .line 346
    .line 347
    goto/16 :goto_5

    .line 348
    .line 349
    .line 350
    :cond_8
    invoke-static {}, Lo00/a;->c()Lkotlinx/coroutines/j0;

    .line 351
    move-result-object v3

    .line 352
    .line 353
    new-instance v6, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3$2;

    .line 354
    .line 355
    .line 356
    invoke-direct {v6, v7}, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 357
    .line 358
    .line 359
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    move-result-object v0

    .line 361
    .line 362
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$0:Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    move-result-object v0

    .line 367
    .line 368
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$1:Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    move-result-object v0

    .line 373
    .line 374
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$2:Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    move-result-object v0

    .line 379
    .line 380
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$3:Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    move-result-object v0

    .line 385
    .line 386
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$4:Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    move-result-object v0

    .line 391
    .line 392
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$5:Ljava/lang/Object;

    .line 393
    .line 394
    iput-object v4, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$6:Ljava/lang/Object;

    .line 395
    .line 396
    iput v5, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->label:I

    .line 397
    .line 398
    .line 399
    invoke-static {v3, v6, v1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 400
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 401
    .line 402
    if-ne v0, v2, :cond_9

    .line 403
    .line 404
    goto/16 :goto_5

    .line 405
    .line 406
    :cond_9
    :goto_2
    if-eqz v4, :cond_d

    .line 407
    .line 408
    .line 409
    :try_start_6
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 410
    goto :goto_6

    .line 411
    :catchall_1
    move-exception v0

    .line 412
    move-object v4, v7

    .line 413
    .line 414
    :goto_3
    if-eqz v4, :cond_a

    .line 415
    .line 416
    .line 417
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 418
    :cond_a
    throw v0

    .line 419
    .line 420
    .line 421
    :cond_b
    invoke-static {}, Lo00/a;->c()Lkotlinx/coroutines/j0;

    .line 422
    move-result-object v3

    .line 423
    .line 424
    new-instance v5, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3$3;

    .line 425
    .line 426
    .line 427
    invoke-direct {v5, v7}, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3$3;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 428
    .line 429
    .line 430
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    move-result-object v0

    .line 432
    .line 433
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$0:Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    move-result-object v0

    .line 438
    .line 439
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$1:Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    move-result-object v0

    .line 444
    .line 445
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$2:Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    move-result-object v0

    .line 450
    .line 451
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$3:Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    move-result-object v0

    .line 456
    .line 457
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$4:Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    move-result-object v0

    .line 462
    .line 463
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$5:Ljava/lang/Object;

    .line 464
    .line 465
    iput v4, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->label:I

    .line 466
    .line 467
    .line 468
    invoke-static {v3, v5, v1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 469
    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 470
    .line 471
    if-ne v0, v2, :cond_d

    .line 472
    goto :goto_5

    .line 473
    .line 474
    .line 475
    :goto_4
    invoke-static {v0}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 476
    move-result v3

    .line 477
    .line 478
    if-nez v3, :cond_c

    .line 479
    .line 480
    const-string v3, "ShareExt"

    .line 481
    .line 482
    .line 483
    invoke-static {v0, v3}, Lz10/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    :cond_c
    invoke-static {}, Lo00/a;->c()Lkotlinx/coroutines/j0;

    .line 487
    move-result-object v3

    .line 488
    .line 489
    new-instance v4, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3$4;

    .line 490
    .line 491
    .line 492
    invoke-direct {v4, v7}, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3$4;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 493
    .line 494
    .line 495
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    move-result-object v0

    .line 497
    .line 498
    iput-object v0, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$0:Ljava/lang/Object;

    .line 499
    .line 500
    iput-object v7, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$1:Ljava/lang/Object;

    .line 501
    .line 502
    iput-object v7, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$2:Ljava/lang/Object;

    .line 503
    .line 504
    iput-object v7, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$3:Ljava/lang/Object;

    .line 505
    .line 506
    iput-object v7, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$4:Ljava/lang/Object;

    .line 507
    .line 508
    iput-object v7, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$5:Ljava/lang/Object;

    .line 509
    .line 510
    iput-object v7, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->L$6:Ljava/lang/Object;

    .line 511
    const/4 v5, 0x4

    .line 512
    .line 513
    iput v5, v1, Lcom/kubi/share/lib/shareui/ShareDispatcher$saveImage$3;->label:I

    .line 514
    .line 515
    .line 516
    invoke-static {v3, v4, v1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 517
    move-result-object v0

    .line 518
    .line 519
    if-ne v0, v2, :cond_d

    .line 520
    :goto_5
    return-object v2

    .line 521
    .line 522
    :cond_d
    :goto_6
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 523
    return-object v0
.end method
