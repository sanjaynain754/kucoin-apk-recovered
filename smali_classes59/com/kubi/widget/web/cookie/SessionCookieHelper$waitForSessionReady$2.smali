.class final Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SessionCookieHelper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/widget/web/cookie/SessionCookieHelper;->B(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;",
        "Lcom/kubi/widget/web/cookie/SessionReadyResult;",
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
    c = "com.kubi.widget.web.cookie.SessionCookieHelper$waitForSessionReady$2"
    f = "SessionCookieHelper.kt"
    i = {
        0x1,
        0x2
    }
    l = {
        0x5c,
        0x65,
        0x6b
    }
    m = "invokeSuspend"
    n = {
        "pendingRefresh",
        "pendingRefresh"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $timeoutMs:J

.field final synthetic $url:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;JLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->$url:Ljava/lang/String;

    .line 3
    .line 4
    iput-wide p2, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->$timeoutMs:J

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
    new-instance p1, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->$url:Ljava/lang/String;

    .line 5
    .line 6
    iget-wide v1, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->$timeoutMs:J

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;-><init>(Ljava/lang/String;JLkotlin/coroutines/Continuation;)V

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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->label:I

    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v4, :cond_2

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lkotlinx/coroutines/r0;

    .line 22
    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    throw v0

    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lkotlinx/coroutines/r0;

    .line 41
    .line 42
    .line 43
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    move-object/from16 v1, p1

    .line 46
    goto :goto_1

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    move-object/from16 v1, p1

    .line 52
    goto :goto_0

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    .line 57
    sget-object v1, Lcom/kubi/widget/web/cookie/SessionCookieHelper;->a:Lcom/kubi/widget/web/cookie/SessionCookieHelper;

    .line 58
    .line 59
    iput v4, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->label:I

    .line 60
    .line 61
    .line 62
    invoke-static {v1, p0}, Lcom/kubi/widget/web/cookie/SessionCookieHelper;->b(Lcom/kubi/widget/web/cookie/SessionCookieHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    if-ne v1, v0, :cond_4

    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    :cond_4
    :goto_0
    move-object v8, v1

    .line 69
    .line 70
    check-cast v8, Lkotlinx/coroutines/r0;

    .line 71
    .line 72
    sget-object v1, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 76
    move-result v1

    .line 77
    .line 78
    if-nez v1, :cond_5

    .line 79
    .line 80
    new-instance v9, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;

    .line 81
    .line 82
    sget-object v11, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;->NOT_LOGIN:Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;

    .line 83
    const/4 v13, 0x4

    .line 84
    const/4 v14, 0x0

    .line 85
    const/4 v10, 0x1

    .line 86
    const/4 v12, 0x0

    .line 87
    .line 88
    .line 89
    invoke-direct/range {v9 .. v14}, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;-><init>(ZLcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 90
    return-object v9

    .line 91
    .line 92
    :cond_5
    sget-object v1, Lcom/kubi/widget/web/cookie/SessionCookieHelper;->a:Lcom/kubi/widget/web/cookie/SessionCookieHelper;

    .line 93
    .line 94
    iget-object v4, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->$url:Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v4}, Lcom/kubi/widget/web/cookie/SessionCookieHelper;->e(Lcom/kubi/widget/web/cookie/SessionCookieHelper;Ljava/lang/String;)Z

    .line 98
    move-result v4

    .line 99
    .line 100
    if-nez v4, :cond_6

    .line 101
    .line 102
    new-instance v9, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;

    .line 103
    .line 104
    sget-object v11, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;->UNSUPPORTED_URL:Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;

    .line 105
    const/4 v13, 0x4

    .line 106
    const/4 v14, 0x0

    .line 107
    const/4 v10, 0x1

    .line 108
    const/4 v12, 0x0

    .line 109
    .line 110
    .line 111
    invoke-direct/range {v9 .. v14}, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;-><init>(ZLcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 112
    return-object v9

    .line 113
    .line 114
    :cond_6
    if-eqz v8, :cond_8

    .line 115
    .line 116
    iget-object v5, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->$url:Ljava/lang/String;

    .line 117
    .line 118
    iget-wide v6, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->$timeoutMs:J

    .line 119
    .line 120
    .line 121
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    iput-object v2, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->L$0:Ljava/lang/Object;

    .line 125
    .line 126
    iput v3, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->label:I

    .line 127
    move-object v9, p0

    .line 128
    move-object v4, v1

    .line 129
    .line 130
    .line 131
    invoke-static/range {v4 .. v9}, Lcom/kubi/widget/web/cookie/SessionCookieHelper;->l(Lcom/kubi/widget/web/cookie/SessionCookieHelper;Ljava/lang/String;JLkotlinx/coroutines/r0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 132
    move-result-object v1

    .line 133
    .line 134
    if-ne v1, v0, :cond_7

    .line 135
    goto :goto_2

    .line 136
    .line 137
    :cond_7
    :goto_1
    check-cast v1, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;

    .line 138
    return-object v1

    .line 139
    .line 140
    :cond_8
    sget-object v3, Lcom/kubi/widget/web/cookie/CookieHelper;->a:Lcom/kubi/widget/web/cookie/CookieHelper;

    .line 141
    .line 142
    iget-object v4, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->$url:Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v4}, Lcom/kubi/widget/web/cookie/CookieHelper;->j(Ljava/lang/String;)Z

    .line 146
    move-result v3

    .line 147
    .line 148
    if-eqz v3, :cond_9

    .line 149
    .line 150
    new-instance v9, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;

    .line 151
    .line 152
    sget-object v11, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;->READY:Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;

    .line 153
    const/4 v13, 0x4

    .line 154
    const/4 v14, 0x0

    .line 155
    const/4 v10, 0x1

    .line 156
    const/4 v12, 0x0

    .line 157
    .line 158
    .line 159
    invoke-direct/range {v9 .. v14}, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;-><init>(ZLcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 160
    return-object v9

    .line 161
    .line 162
    :cond_9
    iget-object v3, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->$url:Ljava/lang/String;

    .line 163
    move-object v5, v3

    .line 164
    .line 165
    iget-wide v3, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->$timeoutMs:J

    .line 166
    .line 167
    .line 168
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    move-result-object v7

    .line 170
    .line 171
    iput-object v7, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->L$0:Ljava/lang/Object;

    .line 172
    .line 173
    iput v2, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForSessionReady$2;->label:I

    .line 174
    move-object v2, v5

    .line 175
    const/4 v5, 0x0

    .line 176
    const/4 v7, 0x4

    .line 177
    const/4 v8, 0x0

    .line 178
    move-object v6, p0

    .line 179
    .line 180
    .line 181
    invoke-static/range {v1 .. v8}, Lcom/kubi/widget/web/cookie/SessionCookieHelper;->A(Lcom/kubi/widget/web/cookie/SessionCookieHelper;Ljava/lang/String;JLkotlinx/coroutines/r0;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 182
    move-result-object v1

    .line 183
    .line 184
    if-ne v1, v0, :cond_a

    .line 185
    :goto_2
    return-object v0

    .line 186
    .line 187
    :cond_a
    :goto_3
    check-cast v1, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;

    .line 188
    return-object v1
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
.end method
