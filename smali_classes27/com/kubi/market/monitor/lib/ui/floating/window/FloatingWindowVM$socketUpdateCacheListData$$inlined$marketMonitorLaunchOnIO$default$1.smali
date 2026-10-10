.class public final Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CommonUtils.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->j0(Ljava/util/List;Z)V
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a8\u0006\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;",
        "com/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1"
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
    c = "com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1"
    f = "FloatingWindowVM.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1\n+ 2 FloatingWindowVM.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n*L\n1#1,163:1\n332#2,18:164\n350#2,7:192\n358#2:200\n360#2,18:204\n1617#3,9:182\n1869#3:191\n1870#3:202\n1626#3:203\n1#4:199\n1#4:201\n45#5,4:222\n*S KotlinDebug\n*F\n+ 1 FloatingWindowVM.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM\n+ 2 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1\n*L\n349#1:182,9\n349#1:191\n349#1:202\n349#1:203\n349#1:201\n99#2:222,4\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $bizType:Ljava/lang/String;

.field final synthetic $isHttp$inlined:Z

.field final synthetic $needCatch:Z

.field final synthetic $socketListData$inlined:Ljava/util/List;

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;


# direct methods
.method public constructor <init>(ZLjava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;Ljava/util/List;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$needCatch:Z

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$bizType:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 7
    .line 8
    iput-object p5, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$socketListData$inlined:Ljava/util/List;

    .line 9
    .line 10
    iput-boolean p6, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$isHttp$inlined:Z

    .line 11
    const/4 p1, 0x2

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 15
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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
    new-instance v0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$needCatch:Z

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$bizType:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 9
    .line 10
    iget-object v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$socketListData$inlined:Ljava/util/List;

    .line 11
    .line 12
    iget-boolean v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$isHttp$inlined:Z

    .line 13
    move-object v3, p2

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;-><init>(ZLjava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;Ljava/util/List;Z)V

    .line 17
    .line 18
    iput-object p1, v0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->L$0:Ljava/lang/Object;

    .line 19
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->L$0:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lkotlinx/coroutines/m0;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    .line 9
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->label:I

    .line 10
    .line 11
    if-nez v0, :cond_14

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    const/4 p1, 0x0

    .line 16
    .line 17
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->E(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_10

    .line 26
    .line 27
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->J(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)V

    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$socketListData$inlined:Ljava/util/List;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    .line 54
    goto/16 :goto_b

    .line 55
    .line 56
    .line 57
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 58
    move-result v1

    .line 59
    .line 60
    if-eqz v1, :cond_10

    .line 61
    .line 62
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->t(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)Ljava/util/List;

    .line 66
    move-result-object v1

    .line 67
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 76
    move-result-object v3

    .line 77
    .line 78
    .line 79
    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 80
    .line 81
    iget-boolean v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$isHttp$inlined:Z

    .line 82
    .line 83
    if-eqz v3, :cond_d

    .line 84
    .line 85
    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->t(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)Ljava/util/List;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    .line 92
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 93
    move-result v3

    .line 94
    .line 95
    if-lez v3, :cond_d

    .line 96
    .line 97
    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 98
    .line 99
    .line 100
    invoke-static {v3}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->t(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)Ljava/util/List;

    .line 101
    move-result-object v3

    .line 102
    .line 103
    new-instance v4, Ljava/util/ArrayList;

    .line 104
    .line 105
    .line 106
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    move-result-object v3

    .line 111
    .line 112
    .line 113
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    move-result v5

    .line 115
    .line 116
    if-eqz v5, :cond_c

    .line 117
    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    move-result-object v5

    .line 121
    .line 122
    check-cast v5, Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;

    .line 123
    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 126
    move-result v6

    .line 127
    .line 128
    .line 129
    invoke-interface {v0, v6}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 130
    move-result-object v6

    .line 131
    .line 132
    .line 133
    :cond_2
    :goto_2
    invoke-interface {v6}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 134
    move-result v7

    .line 135
    .line 136
    if-eqz v7, :cond_9

    .line 137
    .line 138
    .line 139
    invoke-interface {v6}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 140
    move-result-object v7

    .line 141
    move-object v8, v7

    .line 142
    .line 143
    check-cast v8, Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;

    .line 144
    .line 145
    if-eqz v5, :cond_3

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 149
    move-result-object v9

    .line 150
    goto :goto_3

    .line 151
    :catchall_1
    move-exception v0

    .line 152
    .line 153
    goto/16 :goto_9

    .line 154
    :cond_3
    move-object v9, p1

    .line 155
    .line 156
    :goto_3
    if-eqz v9, :cond_2

    .line 157
    .line 158
    .line 159
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 160
    move-result v9

    .line 161
    .line 162
    if-nez v9, :cond_4

    .line 163
    goto :goto_2

    .line 164
    .line 165
    :cond_4
    if-eqz v8, :cond_5

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 169
    move-result-object v9

    .line 170
    goto :goto_4

    .line 171
    :cond_5
    move-object v9, p1

    .line 172
    .line 173
    :goto_4
    if-eqz v9, :cond_2

    .line 174
    .line 175
    .line 176
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 177
    move-result v9

    .line 178
    .line 179
    if-nez v9, :cond_6

    .line 180
    goto :goto_2

    .line 181
    .line 182
    :cond_6
    if-eqz v5, :cond_7

    .line 183
    .line 184
    .line 185
    invoke-virtual {v5}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 186
    move-result-object v9

    .line 187
    goto :goto_5

    .line 188
    :cond_7
    move-object v9, p1

    .line 189
    .line 190
    :goto_5
    if-eqz v8, :cond_8

    .line 191
    .line 192
    .line 193
    invoke-virtual {v8}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 194
    move-result-object v8

    .line 195
    goto :goto_6

    .line 196
    :cond_8
    move-object v8, p1

    .line 197
    .line 198
    .line 199
    :goto_6
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    move-result v8

    .line 201
    .line 202
    if-eqz v8, :cond_2

    .line 203
    goto :goto_7

    .line 204
    :cond_9
    move-object v7, p1

    .line 205
    .line 206
    :goto_7
    check-cast v7, Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;

    .line 207
    .line 208
    if-eqz v7, :cond_b

    .line 209
    .line 210
    if-eqz v5, :cond_a

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5, v7}, Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;->getNewInfo(Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;)Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;

    .line 214
    move-result-object v5

    .line 215
    goto :goto_8

    .line 216
    :cond_a
    move-object v5, p1

    .line 217
    .line 218
    :cond_b
    :goto_8
    if-eqz v5, :cond_1

    .line 219
    .line 220
    .line 221
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 222
    goto :goto_1

    .line 223
    .line 224
    .line 225
    :cond_c
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 226
    .line 227
    .line 228
    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 229
    .line 230
    :cond_d
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 231
    .line 232
    .line 233
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->t(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)Ljava/util/List;

    .line 234
    move-result-object v0

    .line 235
    .line 236
    .line 237
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 238
    .line 239
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 240
    .line 241
    .line 242
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->t(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)Ljava/util/List;

    .line 243
    move-result-object v0

    .line 244
    .line 245
    .line 246
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 247
    :try_start_2
    monitor-exit v1

    .line 248
    .line 249
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$isHttp$inlined:Z

    .line 250
    .line 251
    if-eqz v0, :cond_e

    .line 252
    .line 253
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 254
    .line 255
    .line 256
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->z(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)Z

    .line 257
    move-result v0

    .line 258
    .line 259
    if-nez v0, :cond_e

    .line 260
    .line 261
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 262
    .line 263
    .line 264
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->t(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)Ljava/util/List;

    .line 265
    move-result-object v1

    .line 266
    .line 267
    .line 268
    invoke-static {v0, v1}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->K(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;Ljava/util/List;)V

    .line 269
    .line 270
    :cond_e
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 271
    .line 272
    .line 273
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->D(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)Z

    .line 274
    move-result v0

    .line 275
    .line 276
    if-eqz v0, :cond_f

    .line 277
    goto :goto_a

    .line 278
    .line 279
    :cond_f
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 280
    .line 281
    .line 282
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->z(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)Z

    .line 283
    move-result v0

    .line 284
    .line 285
    if-nez v0, :cond_10

    .line 286
    .line 287
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->this$0:Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;

    .line 288
    .line 289
    .line 290
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->t(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;)Ljava/util/List;

    .line 291
    move-result-object v1

    .line 292
    .line 293
    .line 294
    invoke-static {v0, v1}, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;->K(Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;Ljava/util/List;)V

    .line 295
    goto :goto_a

    .line 296
    :goto_9
    monitor-exit v1

    .line 297
    throw v0

    .line 298
    .line 299
    :cond_10
    :goto_a
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 300
    .line 301
    .line 302
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 304
    goto :goto_c

    .line 305
    .line 306
    :goto_b
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 307
    .line 308
    .line 309
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 310
    move-result-object v0

    .line 311
    .line 312
    .line 313
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    move-result-object v0

    .line 315
    .line 316
    :goto_c
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$needCatch:Z

    .line 317
    .line 318
    iget-object v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1;->$bizType:Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 322
    move-result-object v3

    .line 323
    .line 324
    if-eqz v3, :cond_13

    .line 325
    .line 326
    if-nez v1, :cond_12

    .line 327
    .line 328
    instance-of v0, v3, Ljava/util/concurrent/CancellationException;

    .line 329
    .line 330
    if-nez v0, :cond_11

    .line 331
    .line 332
    .line 333
    invoke-static {v3}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 334
    move-result v0

    .line 335
    .line 336
    if-nez v0, :cond_13

    .line 337
    .line 338
    new-instance v2, Lcom/kubi/market/monitor/lib/exeption/MarketMonitorException;

    .line 339
    .line 340
    const/16 v7, 0x8

    .line 341
    const/4 v8, 0x0

    .line 342
    const/4 v5, 0x0

    .line 343
    const/4 v6, 0x0

    .line 344
    .line 345
    .line 346
    invoke-direct/range {v2 .. v8}, Lcom/kubi/market/monitor/lib/exeption/MarketMonitorException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 347
    const/4 v0, 0x2

    .line 348
    .line 349
    .line 350
    invoke-static {v2, p1, v0, p1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 351
    goto :goto_d

    .line 352
    :cond_11
    throw v3

    .line 353
    :cond_12
    throw v3

    .line 354
    .line 355
    :cond_13
    :goto_d
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 356
    return-object p1

    .line 357
    .line 358
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 359
    .line 360
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 361
    .line 362
    .line 363
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 364
    throw p1
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
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
.end method
