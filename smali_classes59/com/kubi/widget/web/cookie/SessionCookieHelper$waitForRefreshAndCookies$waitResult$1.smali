.class final Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SessionCookieHelper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/widget/web/cookie/SessionCookieHelper;->z(Ljava/lang/String;JLkotlinx/coroutines/r0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.kubi.widget.web.cookie.SessionCookieHelper$waitForRefreshAndCookies$waitResult$1"
    f = "SessionCookieHelper.kt"
    i = {
        0x2
    }
    l = {
        0x78,
        0x78,
        0x81
    }
    m = "invokeSuspend"
    n = {
        "refreshResult"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $pendingRefresh:Lkotlinx/coroutines/r0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/r0<",
            "Lcom/kubi/widget/web/service/IKWebService$a;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $url:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/r0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/r0<",
            "Lcom/kubi/widget/web/service/IKWebService$a;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->$pendingRefresh:Lkotlinx/coroutines/r0;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->$url:Ljava/lang/String;

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
    new-instance p1, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->$pendingRefresh:Lkotlinx/coroutines/r0;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->$url:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p2}, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;-><init>(Lkotlinx/coroutines/r0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->label:I

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    if-eq v1, v5, :cond_2

    .line 15
    .line 16
    if-eq v1, v4, :cond_1

    .line 17
    .line 18
    if-ne v1, v3, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->L$0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lcom/kubi/widget/web/service/IKWebService$a;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    goto :goto_3

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    throw p1

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 38
    goto :goto_1

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 42
    goto :goto_0

    .line 43
    .line 44
    .line 45
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 46
    .line 47
    iget-object p1, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->$pendingRefresh:Lkotlinx/coroutines/r0;

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    iput v5, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->label:I

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, p0}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    if-ne p1, v0, :cond_4

    .line 58
    goto :goto_2

    .line 59
    .line 60
    :cond_4
    :goto_0
    check-cast p1, Lcom/kubi/widget/web/service/IKWebService$a;

    .line 61
    .line 62
    if-nez p1, :cond_7

    .line 63
    .line 64
    :cond_5
    sget-object p1, Lcom/kubi/widget/web/cookie/SessionCookieHelper;->a:Lcom/kubi/widget/web/cookie/SessionCookieHelper;

    .line 65
    .line 66
    iput v4, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->label:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0}, Lcom/kubi/widget/web/cookie/SessionCookieHelper;->v(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    if-ne p1, v0, :cond_6

    .line 73
    goto :goto_2

    .line 74
    .line 75
    :cond_6
    :goto_1
    check-cast p1, Lcom/kubi/widget/web/service/IKWebService$a;

    .line 76
    .line 77
    .line 78
    :cond_7
    invoke-virtual {p1}, Lcom/kubi/widget/web/service/IKWebService$a;->b()Z

    .line 79
    move-result v1

    .line 80
    .line 81
    if-nez v1, :cond_8

    .line 82
    .line 83
    new-instance v0, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;

    .line 84
    .line 85
    sget-object v1, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;->FAILED:Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/kubi/widget/web/service/IKWebService$a;->a()Ljava/lang/String;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, v2, v1, p1}, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;-><init>(ZLcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;Ljava/lang/String;)V

    .line 93
    return-object v0

    .line 94
    :cond_8
    move v1, v3

    .line 95
    .line 96
    sget-object v3, Lcom/kubi/widget/web/cookie/CookieHelper;->a:Lcom/kubi/widget/web/cookie/CookieHelper;

    .line 97
    .line 98
    iget-object v4, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->$url:Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v4}, Lcom/kubi/widget/web/cookie/CookieHelper;->j(Ljava/lang/String;)Z

    .line 102
    move-result v4

    .line 103
    .line 104
    if-nez v4, :cond_b

    .line 105
    .line 106
    iget-object v4, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->$url:Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    iput-object p1, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    iput v1, p0, Lcom/kubi/widget/web/cookie/SessionCookieHelper$waitForRefreshAndCookies$waitResult$1;->label:I

    .line 115
    .line 116
    const-wide/16 v5, 0xc8

    .line 117
    .line 118
    const-wide/16 v7, 0x0

    .line 119
    const/4 v10, 0x4

    .line 120
    const/4 v11, 0x0

    .line 121
    move-object v9, p0

    .line 122
    .line 123
    .line 124
    invoke-static/range {v3 .. v11}, Lcom/kubi/widget/web/cookie/CookieHelper;->s(Lcom/kubi/widget/web/cookie/CookieHelper;Ljava/lang/String;JJLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    if-ne p1, v0, :cond_9

    .line 128
    :goto_2
    return-object v0

    .line 129
    .line 130
    :cond_9
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    move-result p1

    .line 135
    .line 136
    if-eqz p1, :cond_a

    .line 137
    goto :goto_4

    .line 138
    .line 139
    :cond_a
    new-instance p1, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;

    .line 140
    .line 141
    sget-object v0, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;->FAILED:Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;

    .line 142
    .line 143
    .line 144
    const-string/jumbo v1, "session/csrf cookie missing"

    .line 145
    .line 146
    .line 147
    invoke-direct {p1, v2, v0, v1}, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;-><init>(ZLcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;Ljava/lang/String;)V

    .line 148
    return-object p1

    .line 149
    .line 150
    :cond_b
    :goto_4
    new-instance v3, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;

    .line 151
    .line 152
    sget-object v5, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;->READY:Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;

    .line 153
    const/4 v7, 0x4

    .line 154
    const/4 v8, 0x0

    .line 155
    const/4 v4, 0x1

    .line 156
    const/4 v6, 0x0

    .line 157
    .line 158
    .line 159
    invoke-direct/range {v3 .. v8}, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;-><init>(ZLcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 160
    return-object v3
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
.end method
