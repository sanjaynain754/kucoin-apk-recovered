.class final Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FlowEx.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/unify/utils/FlowExKt;->a(Lkotlinx/coroutines/flow/e;J)Lkotlinx/coroutines/flow/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/channels/m<",
        "-",
        "Ljava/util/List<",
        "+TT;>;>;",
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
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Lkotlinx/coroutines/channels/ProducerScope;",
        ""
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
    c = "com.kubi.unify.utils.FlowExKt$bufferTime$1"
    f = "FlowEx.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x36,
        0x42,
        0x42
    }
    m = "invokeSuspend"
    n = {
        "$this$channelFlow",
        "bufferChannel",
        "windowJob",
        "firstRun",
        "$this$channelFlow",
        "bufferChannel",
        "windowJob",
        "firstRun",
        "remaining",
        "$this$channelFlow",
        "bufferChannel",
        "windowJob",
        "firstRun",
        "remaining"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$5"
    }
.end annotation


# instance fields
.field final synthetic $this_bufferTime:Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/e<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $timeMillis:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/e;JLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/e<",
            "+TT;>;J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->$this_bufferTime:Lkotlinx/coroutines/flow/e;

    .line 3
    .line 4
    iput-wide p2, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->$timeMillis:J

    .line 5
    const/4 p1, 0x2

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 9
    return-void
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
.end method

.method public static final a(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/channels/m;Ljava/util/concurrent/atomic/AtomicBoolean;JLkotlinx/coroutines/channels/d;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lkotlinx/coroutines/x1;",
            ">;",
            "Lkotlinx/coroutines/channels/m<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            "J",
            "Lkotlinx/coroutines/channels/d<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1$launchTimer$1;

    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v5, p1

    .line 5
    move-object v1, p2

    .line 6
    move-wide v2, p3

    .line 7
    move-object v4, p5

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v6}, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1$launchTimer$1;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;JLkotlinx/coroutines/channels/d;Lkotlinx/coroutines/channels/m;Lkotlin/coroutines/Continuation;)V

    .line 11
    move-object v3, v0

    .line 12
    move-object v0, v5

    .line 13
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    iput-object p1, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 23
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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
    new-instance v0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->$this_bufferTime:Lkotlinx/coroutines/flow/e;

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->$timeMillis:J

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;-><init>(Lkotlinx/coroutines/flow/e;JLkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    iput-object p1, v0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$0:Ljava/lang/Object;

    .line 12
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/channels/m;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->invoke(Lkotlinx/coroutines/channels/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/channels/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/m<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$0:Ljava/lang/Object;

    .line 3
    move-object v2, v0

    .line 4
    .line 5
    check-cast v2, Lkotlinx/coroutines/channels/m;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 9
    move-result-object v7

    .line 10
    .line 11
    iget v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->label:I

    .line 12
    const/4 v8, 0x3

    .line 13
    const/4 v9, 0x2

    .line 14
    const/4 v10, 0x1

    .line 15
    const/4 v11, 0x0

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    if-eq v0, v10, :cond_2

    .line 20
    .line 21
    if-eq v0, v9, :cond_1

    .line 22
    .line 23
    if-eq v0, v8, :cond_0

    .line 24
    .line 25
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    throw p1

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$5:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/util/List;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$4:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/lang/Throwable;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$3:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    iget-object v1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 48
    .line 49
    iget-object v1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lkotlinx/coroutines/channels/d;

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    goto/16 :goto_6

    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$4:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ljava/util/List;

    .line 61
    .line 62
    iget-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$3:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 65
    .line 66
    iget-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$2:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 69
    .line 70
    iget-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lkotlinx/coroutines/channels/d;

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :cond_2
    iget-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$3:Ljava/lang/Object;

    .line 80
    move-object v1, v0

    .line 81
    .line 82
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 83
    .line 84
    iget-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$2:Ljava/lang/Object;

    .line 85
    move-object v3, v0

    .line 86
    .line 87
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 88
    .line 89
    iget-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$1:Ljava/lang/Object;

    .line 90
    move-object v4, v0

    .line 91
    .line 92
    check-cast v4, Lkotlinx/coroutines/channels/d;

    .line 93
    .line 94
    .line 95
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    move-object v0, v4

    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    move-object p1, v0

    .line 100
    move-object p1, v3

    .line 101
    move-object v3, v1

    .line 102
    move-object v1, v4

    .line 103
    .line 104
    goto/16 :goto_3

    .line 105
    .line 106
    .line 107
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    const p1, 0x7fffffff

    .line 111
    const/4 v0, 0x6

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v11, v11, v0, v11}, Lkotlinx/coroutines/channels/g;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/d;

    .line 115
    move-result-object v6

    .line 116
    .line 117
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 118
    .line 119
    .line 120
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 121
    .line 122
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 123
    .line 124
    .line 125
    invoke-direct {v3, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 126
    .line 127
    :try_start_1
    iget-wide v4, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->$timeMillis:J

    .line 128
    .line 129
    .line 130
    invoke-static/range {v1 .. v6}, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->a(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/channels/m;Ljava/util/concurrent/atomic/AtomicBoolean;JLkotlinx/coroutines/channels/d;)V

    .line 131
    .line 132
    iget-object p1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->$this_bufferTime:Lkotlinx/coroutines/flow/e;

    .line 133
    .line 134
    new-instance v0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1$a;

    .line 135
    .line 136
    .line 137
    invoke-direct {v0, v6}, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1$a;-><init>(Lkotlinx/coroutines/channels/d;)V

    .line 138
    .line 139
    iput-object v2, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$0:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v6, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$1:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$2:Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    move-result-object v4

    .line 148
    .line 149
    iput-object v4, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$3:Ljava/lang/Object;

    .line 150
    .line 151
    iput v10, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->label:I

    .line 152
    .line 153
    .line 154
    invoke-interface {p1, v0, p0}, Lkotlinx/coroutines/flow/e;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 155
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 156
    .line 157
    if-ne p1, v7, :cond_4

    .line 158
    .line 159
    goto/16 :goto_5

    .line 160
    :cond_4
    move-object v0, v3

    .line 161
    move-object v3, v1

    .line 162
    move-object v1, v0

    .line 163
    move-object v0, v6

    .line 164
    .line 165
    :goto_0
    iget-object p1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p1, Lkotlinx/coroutines/x1;

    .line 168
    .line 169
    if-eqz p1, :cond_5

    .line 170
    .line 171
    .line 172
    invoke-static {p1, v11, v10, v11}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 173
    .line 174
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    :goto_1
    invoke-interface {v0}, Lkotlinx/coroutines/channels/o;->o()Ljava/lang/Object;

    .line 181
    move-result-object v4

    .line 182
    .line 183
    .line 184
    invoke-static {v4}, Lkotlinx/coroutines/channels/ChannelResult;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    move-result-object v4

    .line 186
    .line 187
    if-eqz v4, :cond_6

    .line 188
    .line 189
    .line 190
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 191
    goto :goto_1

    .line 192
    .line 193
    .line 194
    :cond_6
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 195
    move-result v4

    .line 196
    .line 197
    if-nez v4, :cond_7

    .line 198
    .line 199
    .line 200
    invoke-static {v2}, Lkotlinx/coroutines/n0;->h(Lkotlinx/coroutines/m0;)Z

    .line 201
    move-result v4

    .line 202
    .line 203
    if-eqz v4, :cond_7

    .line 204
    .line 205
    .line 206
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    move-result-object v4

    .line 208
    .line 209
    iput-object v4, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$0:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$1:Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    move-result-object v3

    .line 216
    .line 217
    iput-object v3, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$2:Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    move-result-object v1

    .line 222
    .line 223
    iput-object v1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$3:Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    move-result-object v1

    .line 228
    .line 229
    iput-object v1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$4:Ljava/lang/Object;

    .line 230
    .line 231
    iput v9, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->label:I

    .line 232
    .line 233
    .line 234
    invoke-interface {v2, p1, p0}, Lkotlinx/coroutines/channels/p;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 235
    move-result-object p1

    .line 236
    .line 237
    if-ne p1, v7, :cond_7

    .line 238
    goto :goto_5

    .line 239
    .line 240
    .line 241
    :cond_7
    :goto_2
    invoke-static {v0, v11, v10, v11}, Lkotlinx/coroutines/channels/p$a;->a(Lkotlinx/coroutines/channels/p;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 242
    .line 243
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 244
    return-object p1

    .line 245
    :catchall_1
    move-exception v0

    .line 246
    move-object p1, v0

    .line 247
    move-object p1, v1

    .line 248
    move-object v1, v6

    .line 249
    .line 250
    :goto_3
    iget-object v4, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v4, Lkotlinx/coroutines/x1;

    .line 253
    .line 254
    if-eqz v4, :cond_8

    .line 255
    .line 256
    .line 257
    invoke-static {v4, v11, v10, v11}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 258
    .line 259
    :cond_8
    new-instance v4, Ljava/util/ArrayList;

    .line 260
    .line 261
    .line 262
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 263
    .line 264
    .line 265
    :goto_4
    invoke-interface {v1}, Lkotlinx/coroutines/channels/o;->o()Ljava/lang/Object;

    .line 266
    move-result-object v5

    .line 267
    .line 268
    .line 269
    invoke-static {v5}, Lkotlinx/coroutines/channels/ChannelResult;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    move-result-object v5

    .line 271
    .line 272
    if-eqz v5, :cond_9

    .line 273
    .line 274
    .line 275
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    goto :goto_4

    .line 277
    .line 278
    .line 279
    :cond_9
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 280
    move-result v5

    .line 281
    .line 282
    if-nez v5, :cond_a

    .line 283
    .line 284
    .line 285
    invoke-static {v2}, Lkotlinx/coroutines/n0;->h(Lkotlinx/coroutines/m0;)Z

    .line 286
    move-result v5

    .line 287
    .line 288
    if-eqz v5, :cond_a

    .line 289
    .line 290
    .line 291
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    move-result-object v5

    .line 293
    .line 294
    iput-object v5, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$0:Ljava/lang/Object;

    .line 295
    .line 296
    iput-object v1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$1:Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    move-result-object p1

    .line 301
    .line 302
    iput-object p1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$2:Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    move-result-object p1

    .line 307
    .line 308
    iput-object p1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$3:Ljava/lang/Object;

    .line 309
    .line 310
    iput-object v0, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$4:Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    move-result-object p1

    .line 315
    .line 316
    iput-object p1, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->L$5:Ljava/lang/Object;

    .line 317
    .line 318
    iput v8, p0, Lcom/kubi/unify/utils/FlowExKt$bufferTime$1;->label:I

    .line 319
    .line 320
    .line 321
    invoke-interface {v2, v4, p0}, Lkotlinx/coroutines/channels/p;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 322
    move-result-object p1

    .line 323
    .line 324
    if-ne p1, v7, :cond_a

    .line 325
    :goto_5
    return-object v7

    .line 326
    .line 327
    .line 328
    :cond_a
    :goto_6
    invoke-static {v1, v11, v10, v11}, Lkotlinx/coroutines/channels/p$a;->a(Lkotlinx/coroutines/channels/p;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 329
    throw v0
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
.end method
