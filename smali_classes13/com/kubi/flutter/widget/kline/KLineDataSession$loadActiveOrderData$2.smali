.class final Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "KLineDataSession.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/flutter/widget/kline/KLineDataSession;->n(Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/kubi/flutter/proto/kline/Response;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/kubi/flutter/proto/kline/Response;",
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
    c = "com.kubi.flutter.widget.kline.KLineDataSession$loadActiveOrderData$2"
    f = "KLineDataSession.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x148,
        0x11e,
        0x11f
    }
    m = "invokeSuspend"
    n = {
        "$this$withLock_u24default$iv",
        "$i$f$withLock",
        "$this$withLock_u24default$iv",
        "$i$f$withLock",
        "$i$a$-withLock$default-KLineDataSession$loadActiveOrderData$2$1",
        "$this$withLock_u24default$iv",
        "list",
        "$i$f$withLock",
        "$i$a$-withLock$default-KLineDataSession$loadActiveOrderData$2$1"
    }
    s = {
        "L$0",
        "I$0",
        "L$0",
        "I$0",
        "I$1",
        "L$0",
        "L$3",
        "I$0",
        "I$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKLineDataSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,322:1\n116#2,8:323\n125#2,2:345\n8#3:331\n8#3:333\n8#3:335\n8#3:342\n1#4:332\n1#4:334\n1#4:336\n1#4:337\n1#4:343\n1#4:344\n45#5,4:338\n*S KotlinDebug\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2\n*L\n283#1:323,8\n283#1:345,2\n289#1:331\n292#1:333\n296#1:335\n303#1:342\n289#1:332\n292#1:334\n296#1:336\n303#1:343\n302#1:338,4\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $orderParam:Lcom/kubi/flutter/widget/kline/c$b;

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;


# direct methods
.method public constructor <init>(Lcom/kubi/flutter/widget/kline/KLineDataSession;Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/KLineDataSession;",
            "Lcom/kubi/flutter/widget/kline/c$b;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->$orderParam:Lcom/kubi/flutter/widget/kline/c$b;

    .line 5
    const/4 p1, 0x2

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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
    new-instance p1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->$orderParam:Lcom/kubi/flutter/widget/kline/c$b;

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p2}, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;-><init>(Lcom/kubi/flutter/widget/kline/KLineDataSession;Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)V

    .line 10
    return-object p1
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->label:I

    .line 7
    .line 8
    const/16 v2, 0x1f4

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x1

    .line 12
    .line 13
    const-string v6, "newBuilder(...)"

    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x0

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    if-eq v1, v5, :cond_2

    .line 20
    .line 21
    if-eq v1, v7, :cond_1

    .line 22
    .line 23
    if-ne v1, v4, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$3:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lcom/kubi/flutter/proto/kline/OrderList;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$2:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lcom/kubi/flutter/widget/kline/c$b;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$1:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 36
    .line 37
    iget-object v4, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, Lrg0/a;

    .line 40
    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    goto/16 :goto_4

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    .line 47
    goto/16 :goto_9

    .line 48
    :catch_0
    move-exception p1

    .line 49
    .line 50
    goto/16 :goto_5

    .line 51
    :catch_1
    move-exception p1

    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 62
    .line 63
    :cond_1
    iget v3, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->I$1:I

    .line 64
    .line 65
    iget v1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->I$0:I

    .line 66
    .line 67
    iget-object v5, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$2:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v5, Lcom/kubi/flutter/widget/kline/c$b;

    .line 70
    .line 71
    iget-object v9, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$1:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v9, Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 74
    .line 75
    iget-object v10, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v10, Lrg0/a;

    .line 78
    .line 79
    .line 80
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    :goto_0
    move v12, v3

    .line 82
    move v3, v1

    .line 83
    move-object v1, v5

    .line 84
    move v5, v12

    .line 85
    .line 86
    goto/16 :goto_2

    .line 87
    :catchall_1
    move-exception p1

    .line 88
    move-object v4, v10

    .line 89
    .line 90
    goto/16 :goto_9

    .line 91
    :catch_2
    move-exception p1

    .line 92
    move-object v4, v10

    .line 93
    .line 94
    goto/16 :goto_5

    .line 95
    :catch_3
    move-exception p1

    .line 96
    move-object v4, v10

    .line 97
    .line 98
    goto/16 :goto_6

    .line 99
    :catch_4
    move-object v4, v10

    .line 100
    .line 101
    goto/16 :goto_7

    .line 102
    .line 103
    :cond_2
    iget v1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->I$0:I

    .line 104
    .line 105
    iget-object v5, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$2:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v5, Lcom/kubi/flutter/widget/kline/c$b;

    .line 108
    .line 109
    iget-object v9, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$1:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v9, Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 112
    .line 113
    iget-object v10, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v10, Lrg0/a;

    .line 116
    .line 117
    .line 118
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 119
    move-object p1, v10

    .line 120
    goto :goto_1

    .line 121
    .line 122
    .line 123
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 124
    .line 125
    iget-object p1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->a(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Lrg0/a;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    iget-object v9, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 132
    .line 133
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->$orderParam:Lcom/kubi/flutter/widget/kline/c$b;

    .line 134
    .line 135
    iput-object p1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$0:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v9, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$1:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$2:Ljava/lang/Object;

    .line 140
    .line 141
    iput v3, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->I$0:I

    .line 142
    .line 143
    iput v5, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->label:I

    .line 144
    .line 145
    .line 146
    invoke-interface {p1, v8, p0}, Lrg0/a;->d(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 147
    move-result-object v5

    .line 148
    .line 149
    if-ne v5, v0, :cond_4

    .line 150
    goto :goto_3

    .line 151
    :cond_4
    move-object v5, v1

    .line 152
    move v1, v3

    .line 153
    .line 154
    :goto_1
    :try_start_2
    const-string v10, "KLineDataSession"

    .line 155
    .line 156
    const-string v11, "loadActiveOrderData"

    .line 157
    .line 158
    .line 159
    invoke-static {v10, v11}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v9}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->f(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Lcom/kubi/flutter/widget/kline/c;

    .line 163
    move-result-object v10

    .line 164
    .line 165
    iput-object p1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$0:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object v9, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$1:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object v5, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$2:Ljava/lang/Object;

    .line 170
    .line 171
    iput v1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->I$0:I

    .line 172
    .line 173
    iput v3, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->I$1:I

    .line 174
    .line 175
    iput v7, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->label:I

    .line 176
    .line 177
    .line 178
    invoke-interface {v10, v5, p0}, Lcom/kubi/flutter/widget/kline/c;->c(Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 179
    move-result-object v10
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 180
    .line 181
    if-ne v10, v0, :cond_5

    .line 182
    goto :goto_3

    .line 183
    :cond_5
    move-object v12, v10

    .line 184
    move-object v10, p1

    .line 185
    move-object p1, v12

    .line 186
    goto :goto_0

    .line 187
    .line 188
    :goto_2
    :try_start_3
    check-cast p1, Lcom/kubi/flutter/proto/kline/OrderList;

    .line 189
    .line 190
    .line 191
    invoke-static {v9}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->b(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Lcom/kubi/flutter/widget/kline/a;

    .line 192
    move-result-object v11

    .line 193
    .line 194
    iput-object v10, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$0:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object v9, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$1:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$2:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object p1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->L$3:Ljava/lang/Object;

    .line 201
    .line 202
    iput v3, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->I$0:I

    .line 203
    .line 204
    iput v5, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->I$1:I

    .line 205
    .line 206
    iput v4, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadActiveOrderData$2;->label:I

    .line 207
    .line 208
    .line 209
    invoke-interface {v11, p1, p0}, Lcom/kubi/flutter/widget/kline/a;->a(Lcom/kubi/flutter/proto/kline/OrderList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 210
    move-result-object v3
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 211
    .line 212
    if-ne v3, v0, :cond_6

    .line 213
    :goto_3
    return-object v0

    .line 214
    :cond_6
    move-object v0, p1

    .line 215
    move-object v3, v9

    .line 216
    move-object v4, v10

    .line 217
    .line 218
    :goto_4
    :try_start_4
    sget-object p1, Lcom/kubi/flutter/widget/kline/utils/g;->a:Lcom/kubi/flutter/widget/kline/utils/g;

    .line 219
    .line 220
    new-instance v5, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    const-string v9, "loadActiveOrderData loadBS_set_savedTime,symbol="

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/c$b;->f()Ljava/lang/String;

    .line 232
    move-result-object v9

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    const-string v9, ",type="

    .line 238
    .line 239
    .line 240
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/c$b;->h()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 244
    move-result-object v1

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/KLineType;->r()Ljava/lang/String;

    .line 248
    move-result-object v1

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    const-string v1, ",savedTime="

    .line 254
    .line 255
    .line 256
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-static {v3}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->h(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Ljava/util/concurrent/atomic/AtomicLong;

    .line 260
    move-result-object v1

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 264
    move-result-wide v9

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    const-string v1, ", sendFlutter:"

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/OrderList;->getItemsCount()I

    .line 276
    move-result v0

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    const-string v0, "(api)"

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    move-result-object v0

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1, v0}, Lcom/kubi/flutter/widget/kline/utils/g;->a(Ljava/lang/String;)V

    .line 292
    .line 293
    sget-object p1, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;

    .line 294
    .line 295
    .line 296
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Response;->newBuilder()Lcom/kubi/flutter/proto/kline/Response$b;

    .line 297
    move-result-object v0

    .line 298
    .line 299
    .line 300
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p1, v0}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Response$b;)Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;

    .line 304
    move-result-object p1

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Response;

    .line 308
    move-result-object p1
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 309
    .line 310
    goto/16 :goto_8

    .line 311
    :catchall_2
    move-exception v0

    .line 312
    move-object v4, p1

    .line 313
    move-object p1, v0

    .line 314
    .line 315
    goto/16 :goto_9

    .line 316
    :catch_5
    move-exception v0

    .line 317
    move-object v4, p1

    .line 318
    move-object p1, v0

    .line 319
    goto :goto_5

    .line 320
    :catch_6
    move-exception v0

    .line 321
    move-object v4, p1

    .line 322
    move-object p1, v0

    .line 323
    goto :goto_6

    .line 324
    :catch_7
    move-object v4, p1

    .line 325
    goto :goto_7

    .line 326
    .line 327
    .line 328
    :goto_5
    :try_start_5
    invoke-static {p1, v8, v7, v8}, Lcom/kubi/network/retrofit/utils/c;->c(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 329
    .line 330
    const-string v0, "loadHistoryOrderData error"

    .line 331
    .line 332
    .line 333
    invoke-static {p1}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 334
    move-result v1

    .line 335
    .line 336
    if-nez v1, :cond_7

    .line 337
    .line 338
    .line 339
    invoke-static {p1, v0}, Log/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 340
    .line 341
    :cond_7
    sget-object v0, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;

    .line 342
    .line 343
    .line 344
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Response;->newBuilder()Lcom/kubi/flutter/proto/kline/Response$b;

    .line 345
    move-result-object v1

    .line 346
    .line 347
    .line 348
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Response$b;)Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;

    .line 352
    move-result-object v0

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0, v2}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b(I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 359
    move-result-object p1

    .line 360
    .line 361
    if-eqz p1, :cond_8

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->c(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    :cond_8
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Response;

    .line 368
    move-result-object p1

    .line 369
    goto :goto_8

    .line 370
    .line 371
    .line 372
    :goto_6
    invoke-virtual {p1}, Ljava/lang/reflect/UndeclaredThrowableException;->getUndeclaredThrowable()Ljava/lang/Throwable;

    .line 373
    move-result-object v0

    .line 374
    .line 375
    .line 376
    invoke-static {p1, v8, v7, v8}, Lcom/kubi/network/retrofit/utils/c;->c(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 377
    .line 378
    sget-object p1, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;

    .line 379
    .line 380
    .line 381
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Response;->newBuilder()Lcom/kubi/flutter/proto/kline/Response$b;

    .line 382
    move-result-object v1

    .line 383
    .line 384
    .line 385
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {p1, v1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Response$b;)Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;

    .line 389
    move-result-object p1

    .line 390
    .line 391
    .line 392
    invoke-virtual {p1, v2}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b(I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 396
    move-result-object v0

    .line 397
    .line 398
    if-eqz v0, :cond_9

    .line 399
    .line 400
    .line 401
    invoke-virtual {p1, v0}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->c(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    :cond_9
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Response;

    .line 405
    move-result-object p1

    .line 406
    goto :goto_8

    .line 407
    .line 408
    :catch_8
    :goto_7
    sget-object p1, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;

    .line 409
    .line 410
    .line 411
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Response;->newBuilder()Lcom/kubi/flutter/proto/kline/Response$b;

    .line 412
    move-result-object v0

    .line 413
    .line 414
    .line 415
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {p1, v0}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Response$b;)Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;

    .line 419
    move-result-object p1

    .line 420
    .line 421
    const/16 v0, 0x12c

    .line 422
    .line 423
    .line 424
    invoke-virtual {p1, v0}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b(I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Response;

    .line 428
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 429
    .line 430
    .line 431
    :goto_8
    invoke-interface {v4, v8}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 432
    return-object p1

    .line 433
    .line 434
    .line 435
    :goto_9
    invoke-interface {v4, v8}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 436
    throw p1
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
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
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
.end method
