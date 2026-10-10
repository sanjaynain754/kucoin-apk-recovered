.class final Lcom/kubi/applet/AppletService$handleBack$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AppletService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/applet/AppletService;->d(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)V
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
    c = "com.kubi.applet.AppletService$handleBack$1"
    f = "AppletService.kt"
    i = {
        0x0,
        0x0,
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
        0x2
    }
    l = {
        0x21a,
        0x5a,
        0x5b
    }
    m = "invokeSuspend"
    n = {
        "$this$withLock_u24default$iv",
        "$i$f$withLock",
        "$this$withLock_u24default$iv",
        "url",
        "savedForwardUrl",
        "matchUrl",
        "$i$f$withLock",
        "$i$a$-withLock$default-AppletService$handleBack$1$1",
        "$this$withLock_u24default$iv",
        "url",
        "savedForwardUrl",
        "matchUrl",
        "$i$f$withLock",
        "$i$a$-withLock$default-AppletService$handleBack$1$1"
    }
    s = {
        "L$0",
        "I$0",
        "L$0",
        "L$4",
        "L$5",
        "L$6",
        "I$0",
        "I$1",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0",
        "I$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAppletService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppletService.kt\ncom/kubi/applet/AppletService$handleBack$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,532:1\n116#2,11:533\n*S KotlinDebug\n*F\n+ 1 AppletService.kt\ncom/kubi/applet/AppletService$handleBack$1\n*L\n74#1:533,11\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $activity:Landroidx/fragment/app/FragmentActivity;

.field final synthetic $backAction:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/kubi/applet/AppletService;


# direct methods
.method public constructor <init>(Lcom/kubi/applet/AppletService;Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/applet/AppletService;",
            "Landroidx/fragment/app/FragmentActivity;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/applet/AppletService$handleBack$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/applet/AppletService$handleBack$1;->this$0:Lcom/kubi/applet/AppletService;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/applet/AppletService$handleBack$1;->$activity:Landroidx/fragment/app/FragmentActivity;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/applet/AppletService$handleBack$1;->$backAction:Lkotlin/jvm/functions/Function0;

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
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/applet/AppletService$handleBack$1;->f(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final f(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
    new-instance p1, Lcom/kubi/applet/AppletService$handleBack$1;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/applet/AppletService$handleBack$1;->this$0:Lcom/kubi/applet/AppletService;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/applet/AppletService$handleBack$1;->$activity:Landroidx/fragment/app/FragmentActivity;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/applet/AppletService$handleBack$1;->$backAction:Lkotlin/jvm/functions/Function0;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/kubi/applet/AppletService$handleBack$1;-><init>(Lcom/kubi/applet/AppletService;Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/applet/AppletService$handleBack$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/applet/AppletService$handleBack$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/applet/AppletService$handleBack$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/applet/AppletService$handleBack$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    .line 2
    move-object/from16 v5, p0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v8

    .line 7
    .line 8
    iget v0, v5, Lcom/kubi/applet/AppletService$handleBack$1;->label:I

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    const/4 v9, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    if-eq v0, v4, :cond_2

    .line 18
    .line 19
    if-eq v0, v3, :cond_1

    .line 20
    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    iget-object v0, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$3:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v0, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$2:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/lang/String;

    .line 30
    .line 31
    iget-object v0, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$1:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/String;

    .line 34
    .line 35
    iget-object v0, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$0:Ljava/lang/Object;

    .line 36
    move-object v1, v0

    .line 37
    .line 38
    check-cast v1, Lrg0/a;

    .line 39
    .line 40
    .line 41
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    goto/16 :goto_5

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    throw v0

    .line 55
    .line 56
    :cond_1
    iget v1, v5, Lcom/kubi/applet/AppletService$handleBack$1;->I$1:I

    .line 57
    .line 58
    iget v0, v5, Lcom/kubi/applet/AppletService$handleBack$1;->I$0:I

    .line 59
    .line 60
    iget-object v3, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$6:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, Ljava/lang/String;

    .line 63
    .line 64
    iget-object v4, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$5:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v4, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v6, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$4:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v6, Ljava/lang/String;

    .line 71
    .line 72
    iget-object v7, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$3:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 75
    .line 76
    iget-object v10, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$2:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v10, Landroidx/fragment/app/FragmentActivity;

    .line 79
    .line 80
    iget-object v11, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v11, Lcom/kubi/applet/AppletService;

    .line 83
    .line 84
    iget-object v12, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v12, Lrg0/a;

    .line 87
    .line 88
    .line 89
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    move-object v13, v11

    .line 91
    move-object v11, v10

    .line 92
    move-object v10, v12

    .line 93
    move-object v12, v13

    .line 94
    move-object v13, v3

    .line 95
    .line 96
    move-object/from16 v3, p1

    .line 97
    .line 98
    goto/16 :goto_3

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    move-object v1, v12

    .line 101
    .line 102
    goto/16 :goto_6

    .line 103
    .line 104
    :cond_2
    iget v0, v5, Lcom/kubi/applet/AppletService$handleBack$1;->I$0:I

    .line 105
    .line 106
    iget-object v4, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$3:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 109
    .line 110
    iget-object v6, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$2:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v6, Landroidx/fragment/app/FragmentActivity;

    .line 113
    .line 114
    iget-object v7, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$1:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v7, Lcom/kubi/applet/AppletService;

    .line 117
    .line 118
    iget-object v10, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v10, Lrg0/a;

    .line 121
    .line 122
    .line 123
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 124
    move-object v11, v7

    .line 125
    move-object v7, v4

    .line 126
    goto :goto_0

    .line 127
    .line 128
    .line 129
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 130
    .line 131
    iget-object v0, v5, Lcom/kubi/applet/AppletService$handleBack$1;->this$0:Lcom/kubi/applet/AppletService;

    .line 132
    .line 133
    .line 134
    invoke-static {v0}, Lcom/kubi/applet/AppletService;->i(Lcom/kubi/applet/AppletService;)Lrg0/a;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    iget-object v6, v5, Lcom/kubi/applet/AppletService$handleBack$1;->this$0:Lcom/kubi/applet/AppletService;

    .line 138
    .line 139
    iget-object v7, v5, Lcom/kubi/applet/AppletService$handleBack$1;->$activity:Landroidx/fragment/app/FragmentActivity;

    .line 140
    .line 141
    iget-object v10, v5, Lcom/kubi/applet/AppletService$handleBack$1;->$backAction:Lkotlin/jvm/functions/Function0;

    .line 142
    .line 143
    iput-object v0, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$0:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object v6, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$1:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object v7, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$2:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v10, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$3:Ljava/lang/Object;

    .line 150
    .line 151
    iput v1, v5, Lcom/kubi/applet/AppletService$handleBack$1;->I$0:I

    .line 152
    .line 153
    iput v4, v5, Lcom/kubi/applet/AppletService$handleBack$1;->label:I

    .line 154
    .line 155
    .line 156
    invoke-interface {v0, v9, v5}, Lrg0/a;->d(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 157
    move-result-object v4

    .line 158
    .line 159
    if-ne v4, v8, :cond_4

    .line 160
    .line 161
    goto/16 :goto_4

    .line 162
    :cond_4
    move-object v11, v6

    .line 163
    move-object v6, v7

    .line 164
    move-object v7, v10

    .line 165
    move-object v10, v0

    .line 166
    move v0, v1

    .line 167
    .line 168
    .line 169
    :goto_0
    :try_start_2
    invoke-static {v11}, Lcom/kubi/applet/AppletService;->j(Lcom/kubi/applet/AppletService;)Z

    .line 170
    move-result v4

    .line 171
    .line 172
    if-eqz v4, :cond_a

    .line 173
    .line 174
    sget-object v4, Lcom/kubi/sdk/mode/AppMode;->Companion:Lcom/kubi/sdk/mode/AppMode$Companion;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Lcom/kubi/sdk/mode/AppMode$Companion;->isLiteMode()Z

    .line 178
    move-result v4

    .line 179
    .line 180
    if-nez v4, :cond_a

    .line 181
    .line 182
    instance-of v4, v6, Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;

    .line 183
    .line 184
    if-eqz v4, :cond_a

    .line 185
    .line 186
    sget-object v4, Lcom/kubi/applet/k;->a:Lcom/kubi/applet/k;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v6}, Lcom/kubi/applet/k;->c(Landroidx/fragment/app/FragmentActivity;)Z

    .line 190
    move-result v12

    .line 191
    .line 192
    if-eqz v12, :cond_5

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4, v6}, Lcom/kubi/applet/k;->a(Landroidx/fragment/app/FragmentActivity;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 199
    .line 200
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 201
    .line 202
    .line 203
    invoke-interface {v10, v9}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 204
    return-object v0

    .line 205
    :catchall_2
    move-exception v0

    .line 206
    move-object v1, v10

    .line 207
    .line 208
    goto/16 :goto_6

    .line 209
    :cond_5
    :try_start_3
    move-object v12, v6

    .line 210
    .line 211
    check-cast v12, Lcom/kubi/sdk/applet/a;

    .line 212
    .line 213
    .line 214
    invoke-interface {v12}, Lcom/kubi/sdk/applet/a;->url()Ljava/lang/String;

    .line 215
    move-result-object v12

    .line 216
    move-object v13, v6

    .line 217
    .line 218
    check-cast v13, Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;

    .line 219
    .line 220
    .line 221
    invoke-interface {v13}, Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;->supportAddHome()Z

    .line 222
    move-result v13

    .line 223
    .line 224
    if-eqz v13, :cond_a

    .line 225
    .line 226
    .line 227
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 228
    move-result v13

    .line 229
    .line 230
    if-lez v13, :cond_a

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4, v6}, Lcom/kubi/applet/k;->d(Landroidx/fragment/app/FragmentActivity;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v11, v6}, Lcom/kubi/applet/AppletService;->p(Landroidx/fragment/app/FragmentActivity;)Ljava/lang/String;

    .line 237
    move-result-object v4

    .line 238
    .line 239
    if-eqz v4, :cond_7

    .line 240
    .line 241
    .line 242
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 243
    move-result v13

    .line 244
    .line 245
    if-nez v13, :cond_6

    .line 246
    goto :goto_1

    .line 247
    :cond_6
    move-object v13, v4

    .line 248
    goto :goto_2

    .line 249
    :cond_7
    :goto_1
    move-object v13, v12

    .line 250
    .line 251
    :goto_2
    const-string v14, ""

    .line 252
    .line 253
    iput-object v10, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$0:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object v11, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$1:Ljava/lang/Object;

    .line 256
    .line 257
    iput-object v6, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$2:Ljava/lang/Object;

    .line 258
    .line 259
    iput-object v7, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$3:Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    move-result-object v15

    .line 264
    .line 265
    iput-object v15, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$4:Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    move-result-object v15

    .line 270
    .line 271
    iput-object v15, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$5:Ljava/lang/Object;

    .line 272
    .line 273
    iput-object v13, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$6:Ljava/lang/Object;

    .line 274
    .line 275
    iput v0, v5, Lcom/kubi/applet/AppletService$handleBack$1;->I$0:I

    .line 276
    .line 277
    iput v1, v5, Lcom/kubi/applet/AppletService$handleBack$1;->I$1:I

    .line 278
    .line 279
    iput v3, v5, Lcom/kubi/applet/AppletService$handleBack$1;->label:I

    .line 280
    .line 281
    .line 282
    invoke-static {v11, v13, v14, v5}, Lcom/kubi/applet/AppletService;->k(Lcom/kubi/applet/AppletService;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 283
    move-result-object v3

    .line 284
    .line 285
    if-ne v3, v8, :cond_8

    .line 286
    goto :goto_4

    .line 287
    .line 288
    :cond_8
    move-object/from16 v16, v11

    .line 289
    move-object v11, v6

    .line 290
    move-object v6, v12

    .line 291
    .line 292
    move-object/from16 v12, v16

    .line 293
    .line 294
    :goto_3
    check-cast v3, Ljava/lang/Boolean;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 298
    move-result v3

    .line 299
    .line 300
    if-eqz v3, :cond_a

    .line 301
    move-object v3, v4

    .line 302
    .line 303
    new-instance v4, Lcom/kubi/applet/j;

    .line 304
    .line 305
    .line 306
    invoke-direct {v4, v7}, Lcom/kubi/applet/j;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 307
    .line 308
    iput-object v10, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$0:Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    move-result-object v6

    .line 313
    .line 314
    iput-object v6, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$1:Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    move-result-object v3

    .line 319
    .line 320
    iput-object v3, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$2:Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    move-result-object v3

    .line 325
    .line 326
    iput-object v3, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$3:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v9, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$4:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v9, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$5:Ljava/lang/Object;

    .line 331
    .line 332
    iput-object v9, v5, Lcom/kubi/applet/AppletService$handleBack$1;->L$6:Ljava/lang/Object;

    .line 333
    .line 334
    iput v0, v5, Lcom/kubi/applet/AppletService$handleBack$1;->I$0:I

    .line 335
    .line 336
    iput v1, v5, Lcom/kubi/applet/AppletService$handleBack$1;->I$1:I

    .line 337
    .line 338
    iput v2, v5, Lcom/kubi/applet/AppletService$handleBack$1;->label:I

    .line 339
    const/4 v3, 0x0

    .line 340
    const/4 v6, 0x4

    .line 341
    const/4 v7, 0x0

    .line 342
    move-object v1, v11

    .line 343
    move-object v0, v12

    .line 344
    move-object v2, v13

    .line 345
    .line 346
    .line 347
    invoke-static/range {v0 .. v7}, Lcom/kubi/applet/AppletService;->J(Lcom/kubi/applet/AppletService;Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 348
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 349
    .line 350
    if-ne v0, v8, :cond_9

    .line 351
    :goto_4
    return-object v8

    .line 352
    :cond_9
    move-object v1, v10

    .line 353
    .line 354
    :goto_5
    :try_start_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 355
    .line 356
    .line 357
    invoke-interface {v1, v9}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 358
    return-object v0

    .line 359
    :cond_a
    move-object v1, v10

    .line 360
    .line 361
    .line 362
    :try_start_5
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 363
    .line 364
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 365
    .line 366
    .line 367
    invoke-interface {v1, v9}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 368
    .line 369
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 370
    return-object v0

    .line 371
    .line 372
    .line 373
    :goto_6
    invoke-interface {v1, v9}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 374
    throw v0
.end method
