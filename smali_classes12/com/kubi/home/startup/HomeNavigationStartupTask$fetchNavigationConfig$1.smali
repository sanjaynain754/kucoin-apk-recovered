.class final Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "HomeNavigationStartupTask.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/home/startup/HomeNavigationStartupTask;->fetchNavigationConfig()V
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
    c = "com.kubi.home.startup.HomeNavigationStartupTask$fetchNavigationConfig$1"
    f = "HomeNavigationStartupTask.kt"
    i = {
        0x1
    }
    l = {
        0x2e,
        0x30
    }
    m = "invokeSuspend"
    n = {
        "jumpUrl"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeNavigationStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeNavigationStartupTask.kt\ncom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1\n+ 2 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,54:1\n47#2,2:55\n*S KotlinDebug\n*F\n+ 1 HomeNavigationStartupTask.kt\ncom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1\n*L\n50#1:55,2\n*E\n"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/kubi/home/startup/HomeNavigationStartupTask;


# direct methods
.method public constructor <init>(Lcom/kubi/home/startup/HomeNavigationStartupTask;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/home/startup/HomeNavigationStartupTask;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;->this$0:Lcom/kubi/home/startup/HomeNavigationStartupTask;

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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
    new-instance p1, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;->this$0:Lcom/kubi/home/startup/HomeNavigationStartupTask;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;-><init>(Lcom/kubi/home/startup/HomeNavigationStartupTask;Lkotlin/coroutines/Continuation;)V

    .line 8
    return-object p1
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    .line 2
    move-object/from16 v3, p0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v6

    .line 7
    .line 8
    iget v0, v3, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;->label:I

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x2

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    if-ne v0, v8, :cond_0

    .line 18
    .line 19
    iget-object v0, v3, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    goto/16 :goto_4

    .line 27
    :catch_0
    move-exception v0

    .line 28
    move-object v10, v0

    .line 29
    goto :goto_3

    .line 30
    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    throw v0

    .line 38
    .line 39
    .line 40
    :cond_1
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 41
    .line 42
    move-object/from16 v0, p1

    .line 43
    goto :goto_0

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    .line 48
    :try_start_2
    iget-object v0, v3, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;->this$0:Lcom/kubi/home/startup/HomeNavigationStartupTask;

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lcom/kubi/home/startup/HomeNavigationStartupTask;->access$getApi(Lcom/kubi/home/startup/HomeNavigationStartupTask;)Lcom/kubi/home/navigation/c;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    const-string v2, "toc"

    .line 55
    .line 56
    const-string v4, "KuCoinPayHomeEntry"

    .line 57
    .line 58
    .line 59
    invoke-interface {v0, v2, v4}, Lcom/kubi/home/navigation/c;->a(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    iput v1, v3, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;->label:I

    .line 63
    const/4 v1, 0x0

    .line 64
    const/4 v2, 0x0

    .line 65
    const/4 v4, 0x2

    .line 66
    const/4 v5, 0x0

    .line 67
    .line 68
    .line 69
    invoke-static/range {v0 .. v5}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->g(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    if-ne v0, v6, :cond_3

    .line 73
    goto :goto_2

    .line 74
    .line 75
    :cond_3
    :goto_0
    check-cast v0, Lcom/kubi/network/retrofit/utils/f;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/kubi/network/retrofit/utils/f;->a()Ljava/lang/Object;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    check-cast v0, Lcom/kubi/advert/api/entity/PromotionConfig;

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/kubi/advert/api/entity/PromotionConfig;->getProperties()Ljava/util/List;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    check-cast v0, Lcom/kubi/advert/api/entity/Property;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/kubi/advert/api/entity/Property;->getJumpUrl()Ljava/lang/String;

    .line 101
    move-result-object v0

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move-object v0, v7

    .line 104
    .line 105
    :goto_1
    sget-object v1, Lcom/kubi/home/router/RouterNavigationInterceptor;->a:Lcom/kubi/home/router/RouterNavigationInterceptor$Companion;

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    move-result-object v2

    .line 110
    .line 111
    iput-object v2, v3, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    iput v8, v3, Lcom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1;->label:I

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v0, v3}, Lcom/kubi/home/router/RouterNavigationInterceptor$Companion;->updateKuCoinPayLink(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 117
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 118
    .line 119
    if-ne v0, v6, :cond_5

    .line 120
    :goto_2
    return-object v6

    .line 121
    .line 122
    :goto_3
    new-instance v9, Lcom/kubi/home/exception/HomeException;

    .line 123
    .line 124
    const/16 v14, 0x8

    .line 125
    const/4 v15, 0x0

    .line 126
    .line 127
    const-string v11, "HomeNavigationStartupTask"

    .line 128
    const/4 v12, 0x0

    .line 129
    const/4 v13, 0x0

    .line 130
    .line 131
    .line 132
    invoke-direct/range {v9 .. v15}, Lcom/kubi/home/exception/HomeException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v9, v7, v8, v7}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 136
    .line 137
    :cond_5
    :goto_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 138
    return-object v0
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
.end method
