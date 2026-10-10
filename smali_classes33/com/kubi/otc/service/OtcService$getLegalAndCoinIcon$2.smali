.class final Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "OtcService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/otc/service/OtcService;->b(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Pair;",
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
    c = "com.kubi.otc.service.OtcService$getLegalAndCoinIcon$2"
    f = "OtcService.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xe1
    }
    m = "invokeSuspend"
    n = {
        "dataStr",
        "$i$f$suspendCancellableCoroutine"
    }
    s = {
        "L$0",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOtcService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcService.kt\ncom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,220:1\n160#2,4:221\n426#3,11:225\n*S KotlinDebug\n*F\n+ 1 OtcService.kt\ncom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2\n*L\n95#1:221,4\n101#1:225,11\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $coin:Ljava/lang/String;

.field final synthetic $legal:Ljava/lang/String;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->$legal:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->$coin:Ljava/lang/String;

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
    new-instance p1, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->$legal:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->$coin:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p2}, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->label:I

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->L$2:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->L$1:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    throw p1

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    sget-object p1, Lcom/kubi/payment/util/i;->a:Lcom/kubi/payment/util/i;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/kubi/payment/util/i;->l()Ly70/g;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    const-string v1, ""

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v1}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 54
    move-result v1

    .line 55
    const/4 v3, 0x0

    .line 56
    .line 57
    if-lez v1, :cond_4

    .line 58
    .line 59
    :try_start_0
    sget-object v0, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 60
    .line 61
    new-instance v0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2$c;

    .line 62
    .line 63
    .line 64
    invoke-direct {v0}, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2$c;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v0}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 72
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-object p1, v3

    .line 75
    .line 76
    :goto_0
    check-cast p1, Lcom/kubi/otc/entity/FastSymbol;

    .line 77
    .line 78
    new-instance v0, Lkotlin/Pair;

    .line 79
    .line 80
    if-eqz p1, :cond_2

    .line 81
    .line 82
    iget-object v1, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->$legal:Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1}, Lcom/kubi/otc/entity/FastSymbol;->legalIcon(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    move-result-object v1

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move-object v1, v3

    .line 89
    .line 90
    .line 91
    :goto_1
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    iget-object v2, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->$coin:Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v2}, Lcom/kubi/otc/entity/FastSymbol;->coinIcon(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    .line 103
    :cond_3
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    .line 107
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    return-object v0

    .line 109
    .line 110
    :cond_4
    iget-object v1, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->$legal:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v4, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->$coin:Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    iput-object p1, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v1, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->L$1:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v4, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->L$2:Ljava/lang/Object;

    .line 123
    const/4 p1, 0x0

    .line 124
    .line 125
    iput p1, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->I$0:I

    .line 126
    .line 127
    iput v2, p0, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2;->label:I

    .line 128
    .line 129
    new-instance p1, Lkotlinx/coroutines/o;

    .line 130
    .line 131
    .line 132
    invoke-static {p0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 133
    move-result-object v5

    .line 134
    .line 135
    .line 136
    invoke-direct {p1, v5, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Lkotlinx/coroutines/o;->E()V

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 143
    move-result-object v2

    .line 144
    .line 145
    const-class v5, Let/a;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v5}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 149
    move-result-object v2

    .line 150
    .line 151
    check-cast v2, Let/a;

    .line 152
    const/4 v5, 0x3

    .line 153
    .line 154
    .line 155
    invoke-static {v2, v3, v3, v5, v3}, Let/a;->a(Let/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 156
    move-result-object v2

    .line 157
    .line 158
    .line 159
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 160
    move-result-object v3

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 164
    move-result-object v2

    .line 165
    .line 166
    new-instance v3, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2$a;

    .line 167
    .line 168
    .line 169
    invoke-direct {v3, p1, v1, v4}, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2$a;-><init>(Lkotlinx/coroutines/m;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    new-instance v1, Lcom/kubi/otc/service/OtcService$b;

    .line 172
    .line 173
    .line 174
    invoke-direct {v1, v3}, Lcom/kubi/otc/service/OtcService$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 175
    .line 176
    new-instance v3, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2$b;

    .line 177
    .line 178
    .line 179
    invoke-direct {v3, p1}, Lcom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2$b;-><init>(Lkotlinx/coroutines/m;)V

    .line 180
    .line 181
    new-instance v4, Lcom/kubi/otc/service/OtcService$b;

    .line 182
    .line 183
    .line 184
    invoke-direct {v4, v3}, Lcom/kubi/otc/service/OtcService$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v1, v4}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    .line 191
    move-result-object p1

    .line 192
    .line 193
    .line 194
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 195
    move-result-object v1

    .line 196
    .line 197
    if-ne p1, v1, :cond_5

    .line 198
    .line 199
    .line 200
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    .line 201
    .line 202
    :cond_5
    if-ne p1, v0, :cond_6

    .line 203
    return-object v0

    .line 204
    :cond_6
    return-object p1
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
.end method
