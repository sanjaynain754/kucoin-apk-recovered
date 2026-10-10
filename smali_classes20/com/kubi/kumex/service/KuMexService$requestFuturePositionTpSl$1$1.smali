.class final Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "KuMexService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/kumex/service/KuMexService;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
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
    c = "com.kubi.kumex.service.KuMexService$requestFuturePositionTpSl$1$1"
    f = "KuMexService.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x4e8
    }
    m = "invokeSuspend"
    n = {
        "fragment",
        "this_$iv",
        "json$iv",
        "$i$f$fromJsonOrNull"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKuMexService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,1241:1\n808#2,11:1242\n1#3:1253\n196#4,3:1254\n*S KotlinDebug\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1\n*L\n538#1:1242,11\n546#1:1254,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Boolean;",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $positionJson:Ljava/lang/String;

.field final synthetic $subUid:Ljava/lang/String;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->$positionJson:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->$subUid:Ljava/lang/String;

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
    new-instance p1, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->$positionJson:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->$subUid:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;-><init>(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->label:I

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->L$2:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->L$1:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/kubi/utils/x;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->L$0:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lcom/kubi/sdk/BaseFragment;

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    throw p1

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/blankj/utilcode/util/a;->h()Landroid/app/Activity;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    instance-of v1, p1, Landroidx/fragment/app/FragmentActivity;

    .line 47
    const/4 v4, 0x0

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    check-cast p1, Landroidx/fragment/app/FragmentActivity;

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move-object p1, v4

    .line 54
    .line 55
    :goto_0
    if-eqz p1, :cond_7

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    if-eqz p1, :cond_7

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    if-eqz p1, :cond_7

    .line 68
    .line 69
    new-instance v1, Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    .line 79
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    move-result v5

    .line 81
    .line 82
    if-eqz v5, :cond_4

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    move-result-object v5

    .line 87
    .line 88
    instance-of v6, v5, Lcom/kubi/sdk/BaseFragment;

    .line 89
    .line 90
    if-eqz v6, :cond_3

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 94
    goto :goto_1

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    .line 101
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    move-result v1

    .line 103
    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    .line 107
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    move-result-object v1

    .line 109
    move-object v5, v1

    .line 110
    .line 111
    check-cast v5, Lcom/kubi/sdk/BaseFragment;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5}, Lcom/kubi/sdk/BaseFragment;->isShowing()Z

    .line 115
    move-result v5

    .line 116
    .line 117
    if-eqz v5, :cond_5

    .line 118
    goto :goto_2

    .line 119
    :cond_6
    move-object v1, v4

    .line 120
    .line 121
    :goto_2
    check-cast v1, Lcom/kubi/sdk/BaseFragment;

    .line 122
    goto :goto_3

    .line 123
    :cond_7
    move-object v1, v4

    .line 124
    .line 125
    :goto_3
    if-nez v1, :cond_8

    .line 126
    .line 127
    iget-object p1, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 128
    .line 129
    .line 130
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    new-instance v1, Lcom/kubi/sdk/protocol/ProtocolException;

    .line 134
    .line 135
    new-instance v3, Ljava/lang/RuntimeException;

    .line 136
    .line 137
    const-string v2, "\u6ca1\u6709\u53ef\u89c1\u7684\u754c\u9762\u627f\u8f7d"

    .line 138
    .line 139
    .line 140
    invoke-direct {v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    const/16 v6, 0xc

    .line 143
    const/4 v7, 0x0

    .line 144
    .line 145
    const-string v2, "-3"

    .line 146
    const/4 v4, 0x0

    .line 147
    const/4 v5, 0x0

    .line 148
    .line 149
    .line 150
    invoke-direct/range {v1 .. v7}, Lcom/kubi/sdk/protocol/ProtocolException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 151
    .line 152
    .line 153
    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 156
    return-object p1

    .line 157
    .line 158
    :cond_8
    sget-object p1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 159
    .line 160
    iget-object v5, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->$positionJson:Ljava/lang/String;

    .line 161
    .line 162
    new-instance v6, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1$invokeSuspend$$inlined$fromJsonOrNull$1;

    .line 163
    .line 164
    .line 165
    invoke-direct {v6, v5, v4}, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1$invokeSuspend$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v6}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 169
    move-result-object v4

    .line 170
    .line 171
    .line 172
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 173
    move-result-object v6

    .line 174
    .line 175
    .line 176
    invoke-static {v4, v6}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 177
    move-result-object v4

    .line 178
    .line 179
    iput-object v1, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->L$0:Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    move-result-object p1

    .line 184
    .line 185
    iput-object p1, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->L$1:Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    move-result-object p1

    .line 190
    .line 191
    iput-object p1, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->L$2:Ljava/lang/Object;

    .line 192
    .line 193
    iput v3, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->I$0:I

    .line 194
    .line 195
    iput v2, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->label:I

    .line 196
    .line 197
    .line 198
    invoke-static {v4, p0}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 199
    move-result-object p1

    .line 200
    .line 201
    if-ne p1, v0, :cond_9

    .line 202
    return-object v0

    .line 203
    :cond_9
    move-object v0, v1

    .line 204
    .line 205
    :goto_4
    check-cast p1, Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 206
    .line 207
    if-nez p1, :cond_a

    .line 208
    .line 209
    iget-object p1, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 210
    .line 211
    .line 212
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    new-instance v1, Lcom/kubi/sdk/protocol/ProtocolException;

    .line 216
    .line 217
    new-instance v3, Ljava/lang/RuntimeException;

    .line 218
    .line 219
    const-string v2, "\u4ed3\u4f4d\u6570\u636e\u7ed3\u6784\u4e0d\u5408\u89c4"

    .line 220
    .line 221
    .line 222
    invoke-direct {v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    const/16 v6, 0xc

    .line 225
    const/4 v7, 0x0

    .line 226
    .line 227
    const-string v2, "-2"

    .line 228
    const/4 v4, 0x0

    .line 229
    const/4 v5, 0x0

    .line 230
    .line 231
    .line 232
    invoke-direct/range {v1 .. v7}, Lcom/kubi/sdk/protocol/ProtocolException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 238
    return-object p1

    .line 239
    .line 240
    :cond_a
    sget-object v1, Lcom/kubi/kumex/trade/y3;->a:Lcom/kubi/kumex/trade/y3;

    .line 241
    .line 242
    iget-object v2, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->$subUid:Ljava/lang/String;

    .line 243
    .line 244
    iget-object v3, p0, Lcom/kubi/kumex/service/KuMexService$requestFuturePositionTpSl$1$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v0, p1, v2, v3}, Lcom/kubi/kumex/trade/y3;->z(Lcom/kubi/sdk/BaseFragment;Lcom/kubi/kumex/data/trade/model/PositionEntity;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 248
    .line 249
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 250
    return-object p1
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
.end method
