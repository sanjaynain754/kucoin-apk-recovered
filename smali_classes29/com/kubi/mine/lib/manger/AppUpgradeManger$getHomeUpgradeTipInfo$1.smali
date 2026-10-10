.class final Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AppUpgradeManger.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/mine/lib/manger/AppUpgradeManger;->p(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/LifecycleCoroutineScope;Lvk/n0;Lkotlin/jvm/functions/Function0;)I
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
    c = "com.kubi.mine.lib.manger.AppUpgradeManger$getHomeUpgradeTipInfo$1"
    f = "AppUpgradeManger.kt"
    i = {
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
        0x1,
        0x1
    }
    l = {
        0xdb,
        0xee
    }
    m = "invokeSuspend"
    n = {
        "notifiedAppVersion",
        "notifiedCount",
        "notifiedDate",
        "notifiedAppVersion",
        "$this$onFail$iv",
        "it$iv",
        "it",
        "notifiedCount",
        "notifiedDate",
        "$i$f$onFail",
        "$i$a$-let-RetrofitFlowExKt$onFail$1$iv",
        "$i$a$-onFail-AppUpgradeManger$getHomeUpgradeTipInfo$1$2"
    }
    s = {
        "L$0",
        "I$0",
        "J$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0",
        "J$0",
        "I$1",
        "I$2",
        "I$3"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAppUpgradeManger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpgradeManger.kt\ncom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n25#2:513\n26#2:515\n1#3:514\n*S KotlinDebug\n*F\n+ 1 AppUpgradeManger.kt\ncom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1\n*L\n237#1:513\n237#1:515\n237#1:514\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $appUpgradeType:Lvk/n0;

.field final synthetic $isPageShow:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $manager:Landroidx/fragment/app/FragmentManager;

.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;Lvk/n0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentManager;",
            "Lvk/n0;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->$manager:Landroidx/fragment/app/FragmentManager;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->$appUpgradeType:Lvk/n0;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->$isPageShow:Lkotlin/jvm/functions/Function0;

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
    new-instance p1, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->$manager:Landroidx/fragment/app/FragmentManager;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->$appUpgradeType:Lvk/n0;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->$isPageShow:Lkotlin/jvm/functions/Function0;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;-><init>(Landroidx/fragment/app/FragmentManager;Lvk/n0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->label:I

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    if-eq v1, v4, :cond_1

    .line 15
    .line 16
    if-ne v1, v3, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->L$3:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Throwable;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->L$2:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/lang/Throwable;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->L$1:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lcom/kubi/network/retrofit/utils/f;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->L$0:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    throw p1

    .line 46
    .line 47
    :cond_1
    iget-wide v6, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->J$0:J

    .line 48
    .line 49
    iget v1, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->I$0:I

    .line 50
    .line 51
    iget-object v4, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    goto :goto_0

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    sget-object p1, Lpq/a;->a:Lpq/a;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lpq/a;->a()Ljava/lang/String;

    .line 66
    move-result-object v8

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lpq/a;->f()I

    .line 70
    move-result v9

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lpq/a;->g()J

    .line 74
    move-result-wide v10

    .line 75
    .line 76
    sget-object p1, Lcom/kubi/mine/lib/manger/AppUpgradeManger;->a:Lcom/kubi/mine/lib/manger/AppUpgradeManger;

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lcom/kubi/mine/lib/manger/AppUpgradeManger;->e(Lcom/kubi/mine/lib/manger/AppUpgradeManger;)Lhq/a;

    .line 80
    move-result-object v6

    .line 81
    .line 82
    const-string v7, "COMMON"

    .line 83
    .line 84
    .line 85
    invoke-interface/range {v6 .. v11}, Lhq/a;->a(Ljava/lang/String;Ljava/lang/String;IJ)Lkotlinx/coroutines/flow/e;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    new-instance v1, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1$1;

    .line 89
    .line 90
    iget-object v6, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->$manager:Landroidx/fragment/app/FragmentManager;

    .line 91
    .line 92
    iget-object v7, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->$appUpgradeType:Lvk/n0;

    .line 93
    .line 94
    iget-object v12, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->$isPageShow:Lkotlin/jvm/functions/Function0;

    .line 95
    .line 96
    .line 97
    invoke-direct {v1, v6, v7, v12, v2}, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1$1;-><init>(Landroidx/fragment/app/FragmentManager;Lvk/n0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    move-result-object v6

    .line 102
    .line 103
    iput-object v6, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->L$0:Ljava/lang/Object;

    .line 104
    .line 105
    iput v9, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->I$0:I

    .line 106
    .line 107
    iput-wide v10, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->J$0:J

    .line 108
    .line 109
    iput v4, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->label:I

    .line 110
    .line 111
    .line 112
    invoke-static {p1, v5, v1, p0}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->f(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    if-ne p1, v0, :cond_3

    .line 116
    goto :goto_1

    .line 117
    :cond_3
    move-object v4, v8

    .line 118
    move v1, v9

    .line 119
    move-wide v6, v10

    .line 120
    .line 121
    :goto_0
    check-cast p1, Lcom/kubi/network/retrofit/utils/f;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 125
    move-result-object v8

    .line 126
    .line 127
    if-eqz v8, :cond_4

    .line 128
    .line 129
    .line 130
    invoke-static {}, Lo00/a;->c()Lkotlinx/coroutines/j0;

    .line 131
    move-result-object v9

    .line 132
    .line 133
    new-instance v10, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1$2$1;

    .line 134
    .line 135
    .line 136
    invoke-direct {v10, v2}, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1$2$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    move-result-object v2

    .line 141
    .line 142
    iput-object v2, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->L$0:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object p1, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->L$1:Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    move-result-object p1

    .line 149
    .line 150
    iput-object p1, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->L$2:Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    move-result-object p1

    .line 155
    .line 156
    iput-object p1, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->L$3:Ljava/lang/Object;

    .line 157
    .line 158
    iput v1, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->I$0:I

    .line 159
    .line 160
    iput-wide v6, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->J$0:J

    .line 161
    .line 162
    iput v5, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->I$1:I

    .line 163
    .line 164
    iput v5, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->I$2:I

    .line 165
    .line 166
    iput v5, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->I$3:I

    .line 167
    .line 168
    iput v3, p0, Lcom/kubi/mine/lib/manger/AppUpgradeManger$getHomeUpgradeTipInfo$1;->label:I

    .line 169
    .line 170
    .line 171
    invoke-static {v9, v10, p0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 172
    move-result-object p1

    .line 173
    .line 174
    if-ne p1, v0, :cond_4

    .line 175
    :goto_1
    return-object v0

    .line 176
    .line 177
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 178
    return-object p1
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
.end method
