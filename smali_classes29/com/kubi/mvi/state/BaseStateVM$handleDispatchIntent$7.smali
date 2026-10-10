.class final Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BaseStateVM.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/mvi/state/BaseStateVM;->handleDispatchIntent(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H\u008a@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lcom/kubi/mvi/state/d;",
        "I",
        "Lcom/kubi/mvi/state/f;",
        "S",
        "Lkotlinx/coroutines/m0;",
        "",
        "<anonymous>",
        "(Lkotlinx/coroutines/m0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.mvi.state.BaseStateVM$handleDispatchIntent$7"
    f = "BaseStateVM.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x244,
        0x244
    }
    m = "invokeSuspend"
    n = {
        "$this$callMethod_u24lambda_u242$iv$iv",
        "reportName$iv$iv$iv",
        "start$iv$iv$iv$iv",
        "$this$callMethod_u24lambda_u242$iv$iv",
        "reportName$iv$iv$iv"
    }
    s = {
        "L$1",
        "L$3",
        "J$0",
        "L$1",
        "L$3"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseStateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 MethodTracker.kt\ncom/kubi/mvi/state/MethodTrackerKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 5 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,630:1\n589#2,7:631\n596#2,10:640\n606#2:687\n43#3,2:638\n45#3:650\n46#3,3:658\n50#3,6:681\n50#4,7:651\n122#4,2:661\n125#4,2:669\n57#4,10:671\n17#5,6:663\n*S KotlinDebug\n*F\n+ 1 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7\n*L\n579#1:631,7\n579#1:640,10\n579#1:687\n579#1:638,2\n579#1:650\n579#1:658,3\n579#1:681,6\n579#1:651,7\n579#1:661,2\n579#1:669,2\n579#1:671,10\n579#1:663,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $intent:Lcom/kubi/mvi/state/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TI;"
        }
    .end annotation
.end field

.field final synthetic $intentName:Ljava/lang/String;

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/kubi/mvi/state/BaseStateVM;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/mvi/state/BaseStateVM<",
            "TI;TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/mvi/state/BaseStateVM;Ljava/lang/String;Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/mvi/state/BaseStateVM<",
            "TI;TS;>;",
            "Ljava/lang/String;",
            "TI;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->this$0:Lcom/kubi/mvi/state/BaseStateVM;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->$intentName:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->$intent:Lcom/kubi/mvi/state/d;

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
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance p1, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->this$0:Lcom/kubi/mvi/state/BaseStateVM;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->$intentName:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->$intent:Lcom/kubi/mvi/state/d;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;-><init>(Lcom/kubi/mvi/state/BaseStateVM;Ljava/lang/String;Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-boolean v0, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->Z$0:Z

    iget-object v1, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$4:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/kubi/mvi/state/j;

    iget-object v5, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/kubi/mvi/state/j;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v0, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->J$0:J

    iget-boolean v2, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->Z$0:Z

    iget-object v3, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$4:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/kubi/mvi/state/j;

    iget-object v7, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/kubi/mvi/state/j;

    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p1, v5

    goto/16 :goto_2

    :catchall_1
    move-exception p1

    move v0, v2

    move-object v2, v4

    move-object v3, v5

    :goto_0
    move-object v4, v6

    goto/16 :goto_8

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->this$0:Lcom/kubi/mvi/state/BaseStateVM;

    iget-object v1, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->$intentName:Ljava/lang/String;

    const-string v4, "$intentName"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->this$0:Lcom/kubi/mvi/state/BaseStateVM;

    iget-object v5, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->$intent:Lcom/kubi/mvi/state/d;

    .line 3
    invoke-static {p1}, Lcom/kubi/mvi/state/BaseStateVM;->access$getNeedCatch(Lcom/kubi/mvi/state/BaseStateVM;)Z

    move-result v6

    .line 4
    invoke-static {p1}, Lcom/kubi/mvi/state/BaseStateVM;->access$getNeedMeasureTime(Lcom/kubi/mvi/state/BaseStateVM;)Z

    move-result v7

    .line 5
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 6
    invoke-virtual {p1}, Lcom/kubi/mvi/state/BaseStateVM;->getBiz()Ljava/lang/String;

    move-result-object v8

    .line 7
    new-instance v9, Lcom/kubi/mvi/state/j;

    invoke-direct {v9}, Lcom/kubi/mvi/state/j;-><init>()V

    .line 8
    new-instance v10, Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$1;

    invoke-direct {v10, p1, v1}, Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$1;-><init>(Lcom/kubi/mvi/state/BaseStateVM;Ljava/lang/String;)V

    invoke-virtual {v9, v10}, Lcom/kubi/mvi/state/j;->e(Lkotlin/jvm/functions/Function0;)V

    .line 9
    new-instance v10, Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$2;

    invoke-direct {v10, p1, v1}, Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$2;-><init>(Lcom/kubi/mvi/state/BaseStateVM;Ljava/lang/String;)V

    invoke-virtual {v9, v10}, Lcom/kubi/mvi/state/j;->d(Lkotlin/jvm/functions/Function1;)V

    .line 10
    new-instance v10, Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$3;

    invoke-direct {v10, p1, v1}, Lcom/kubi/mvi/state/BaseStateVM$traceMethod$1$3;-><init>(Lcom/kubi/mvi/state/BaseStateVM;Ljava/lang/String;)V

    invoke-virtual {v9, v10}, Lcom/kubi/mvi/state/j;->f(Lkotlin/jvm/functions/Function1;)V

    .line 11
    invoke-static {v8}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v6}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    move-result v1

    .line 12
    const-string v6, "crash_issue"

    .line 13
    :try_start_2
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 14
    invoke-virtual {v9}, Lcom/kubi/mvi/state/j;->b()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-interface {v8}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v3, p1

    move-object p1, v0

    move v0, v1

    move-object v2, v6

    move-object v4, v9

    goto/16 :goto_8

    .line 15
    :cond_3
    :goto_1
    invoke-virtual {v9}, Lcom/kubi/mvi/state/j;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    if-eqz v8, :cond_7

    .line 16
    invoke-static {v7}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 18
    iput-object v9, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$0:Ljava/lang/Object;

    iput-object v9, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$1:Ljava/lang/Object;

    iput-object p1, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$2:Ljava/lang/Object;

    iput-object v6, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$3:Ljava/lang/Object;

    iput-object v8, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$4:Ljava/lang/Object;

    iput-boolean v1, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->Z$0:Z

    iput-wide v10, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->J$0:J

    iput v3, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->label:I

    invoke-virtual {v4, v5, p0}, Lcom/kubi/mvi/state/BaseStateVM;->dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v0, :cond_4

    goto :goto_3

    :cond_4
    move v2, v1

    move-object v4, v6

    move-object v3, v8

    move-object v6, v9

    move-wide v0, v10

    .line 19
    :goto_2
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    sub-long/2addr v7, v0

    move v0, v2

    move-object v2, v4

    move-object v4, v6

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v3, p1

    move-object p1, v0

    move v0, v2

    move-object v2, v4

    goto/16 :goto_0

    .line 20
    :cond_5
    :try_start_4
    iput-object v9, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$0:Ljava/lang/Object;

    iput-object v9, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$1:Ljava/lang/Object;

    iput-object p1, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$2:Ljava/lang/Object;

    iput-object v6, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$3:Ljava/lang/Object;

    iput-object v8, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->L$4:Ljava/lang/Object;

    iput-boolean v1, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->Z$0:Z

    iput v2, p0, Lcom/kubi/mvi/state/BaseStateVM$handleDispatchIntent$7;->label:I

    invoke-virtual {v4, v5, p0}, Lcom/kubi/mvi/state/BaseStateVM;->dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne v2, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    move-object v3, p1

    move v0, v1

    move-object v2, v6

    move-object v1, v8

    move-object v4, v9

    :goto_4
    const-wide/16 v7, 0x0

    move-object p1, v3

    move-object v3, v1

    .line 21
    :goto_5
    :try_start_5
    invoke-static {v7, v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v1

    .line 22
    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :goto_6
    move-object v3, p1

    goto :goto_7

    :catchall_4
    move-exception v1

    move-object v3, p1

    move-object p1, v1

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    move v2, v1

    move-object v1, v0

    move v0, v2

    move-object v2, v6

    move-object v4, v9

    goto :goto_6

    .line 23
    :goto_7
    :try_start_6
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_9

    :goto_8
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 24
    :goto_9
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_a

    if-eqz v0, :cond_9

    .line 25
    instance-of v5, v1, Ljava/util/concurrent/CancellationException;

    if-nez v5, :cond_8

    .line 26
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "->\u3010"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " \u53d1\u751f\u9519\u8bef:needCatch->"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v0, 0x3011

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    .line 27
    :cond_8
    throw v1

    .line 28
    :cond_9
    throw v1

    .line 29
    :cond_a
    :goto_a
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 30
    const-string v0, "MethodTracker"

    invoke-static {p1, v0}, Lwq/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 31
    invoke-virtual {v4}, Lcom/kubi/mvi/state/j;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    :cond_b
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
