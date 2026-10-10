.class final Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LiveRouteInterceptor.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.trtc.uikit.livekit.kc.interceptor.LiveRouteInterceptor$intercept$1$2"
    f = "LiveRouteInterceptor.kt"
    i = {
        0x1
    }
    l = {
        0x55,
        0x5f
    }
    m = "invokeSuspend"
    n = {
        "result"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLiveRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRouteInterceptor.kt\ncom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2\n+ 2 LiveIssue.kt\ncom/trtc/uikit/livekit/kc/util/LiveIssueKt\n*L\n1#1,146:1\n49#2,2:147\n*S KotlinDebug\n*F\n+ 1 LiveRouteInterceptor.kt\ncom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2\n*L\n98#1:147,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $activity:Landroidx/fragment/app/FragmentActivity;

.field final synthetic $fromInviteOpenId:Ljava/lang/String;

.field final synthetic $roomId:Ljava/lang/String;

.field final synthetic $roomOwnerId:Ljava/lang/String;

.field final synthetic $source:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentActivity;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$activity:Landroidx/fragment/app/FragmentActivity;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$roomId:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$roomOwnerId:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$source:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$fromInviteOpenId:Ljava/lang/String;

    .line 11
    const/4 p1, 0x2

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
    new-instance v0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$activity:Landroidx/fragment/app/FragmentActivity;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$roomId:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$roomOwnerId:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$source:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v5, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$fromInviteOpenId:Ljava/lang/String;

    .line 13
    move-object v6, p2

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;-><init>(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 17
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->label:I

    .line 7
    .line 8
    const-string v2, "getApplicationContext(...)"

    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x2

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v4, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->L$0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    throw p1

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 37
    goto :goto_0

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    .line 42
    sget-object p1, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;->a:Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$activity:Landroidx/fragment/app/FragmentActivity;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    iget-object v5, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$roomId:Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 57
    .line 58
    iput v3, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->label:I

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1, v5, p0}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;->d(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    if-ne p1, v0, :cond_3

    .line 65
    goto :goto_1

    .line 66
    .line 67
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 75
    move-result v1

    .line 76
    .line 77
    if-nez v1, :cond_4

    .line 78
    .line 79
    sget-object v1, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->j:Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;

    .line 80
    .line 81
    iget-object v3, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$activity:Landroidx/fragment/app/FragmentActivity;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 85
    move-result-object v3

    .line 86
    .line 87
    .line 88
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v3}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl$Companion;->createInstance(Landroid/content/Context;)Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    iget-object v2, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$roomId:Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 98
    .line 99
    iget-object v3, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$roomOwnerId:Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v2, v3, p1}, Lcom/trtc/uikit/livekit/livestream/impl/VideoLiveKitImpl;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    iget-object v1, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$source:Ljava/lang/String;

    .line 108
    .line 109
    const-string v2, "SHARE"

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    move-result v1

    .line 114
    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    iget-object v1, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$fromInviteOpenId:Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 124
    move-result v1

    .line 125
    .line 126
    if-nez v1, :cond_5

    .line 127
    .line 128
    sget-object v1, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;->a:Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;

    .line 129
    .line 130
    iget-object v2, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$roomId:Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 134
    .line 135
    iget-object v3, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->$fromInviteOpenId:Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    iput-object p1, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->L$0:Ljava/lang/Object;

    .line 145
    .line 146
    iput v4, p0, Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor$intercept$1$2;->label:I

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v2, v3, p0}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;->f(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    if-ne p1, v0, :cond_5

    .line 153
    :goto_1
    return-object v0

    .line 154
    .line 155
    :cond_4
    new-instance v5, Lcom/trtc/uikit/livekit/kc/util/LiveMessage;

    .line 156
    const/4 v9, 0x4

    .line 157
    const/4 v10, 0x0

    .line 158
    .line 159
    const-string v6, "tx login failed"

    .line 160
    .line 161
    const-string v7, "LiveRouteInterceptor"

    .line 162
    const/4 v8, 0x0

    .line 163
    .line 164
    .line 165
    invoke-direct/range {v5 .. v10}, Lcom/trtc/uikit/livekit/kc/util/LiveMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 166
    const/4 p1, 0x0

    .line 167
    .line 168
    .line 169
    invoke-static {v5, p1, v4, p1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 170
    .line 171
    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 172
    return-object p1
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
.end method
