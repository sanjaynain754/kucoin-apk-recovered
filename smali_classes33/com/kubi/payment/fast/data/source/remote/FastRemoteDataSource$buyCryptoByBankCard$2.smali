.class final Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FastRemoteDataSource.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;->c(Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/kubi/sdk/base/entity/BaseEntity<",
        "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/kubi/sdk/base/entity/BaseEntity;",
        "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;",
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
    c = "com.kubi.payment.fast.data.source.remote.FastRemoteDataSource$buyCryptoByBankCard$2"
    f = "FastRemoteDataSource.kt"
    i = {}
    l = {
        0x87
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $request:Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;

.field label:I

.field final synthetic this$0:Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;


# direct methods
.method public constructor <init>(Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;",
            "Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;->this$0:Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;->$request:Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;

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
    new-instance p1, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;->this$0:Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;->$request:Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p2}, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;-><init>(Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;->label:I

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
    .line 14
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p1

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    .line 28
    iget-object p1, p0, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;->this$0:Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;->a(Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;)Lcom/kubi/payment/fast/data/source/remote/a;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    new-instance v3, Lkotlin/Pair;

    .line 35
    .line 36
    const-string v1, "X-JAVA-ENABLED"

    .line 37
    .line 38
    const-string v4, "false"

    .line 39
    .line 40
    .line 41
    invoke-direct {v3, v1, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    new-instance v4, Lkotlin/Pair;

    .line 44
    .line 45
    const-string v1, "X-JAVASCRIPT-ENABLED"

    .line 46
    .line 47
    const-string v5, "true"

    .line 48
    .line 49
    .line 50
    invoke-direct {v4, v1, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    new-instance v5, Lkotlin/Pair;

    .line 53
    .line 54
    const-string v1, "X-COLOR-DEPTH"

    .line 55
    .line 56
    const-string v6, "15"

    .line 57
    .line 58
    .line 59
    invoke-direct {v5, v1, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    new-instance v6, Lkotlin/Pair;

    .line 62
    .line 63
    const-string v1, "X-ACCEPT-HEADER"

    .line 64
    .line 65
    const-string v7, "application/json"

    .line 66
    .line 67
    .line 68
    invoke-direct {v6, v1, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    new-instance v7, Lkotlin/Pair;

    .line 71
    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    const-string v8, "android/"

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    sget-object v8, Lvk/s;->a:Lvk/s;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8}, Lvk/s;->Z()Ljava/lang/String;

    .line 86
    move-result-object v8

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    const-string v8, "X-USER-AGENT"

    .line 96
    .line 97
    .line 98
    invoke-direct {v7, v8, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    new-instance v8, Lkotlin/Pair;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->a()I

    .line 104
    move-result v1

    .line 105
    .line 106
    div-int/lit8 v1, v1, 0x3

    .line 107
    .line 108
    .line 109
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    const-string v9, "X-SCREEN-HEIGHT"

    .line 113
    .line 114
    .line 115
    invoke-direct {v8, v9, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    new-instance v9, Lkotlin/Pair;

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->b()I

    .line 121
    move-result v1

    .line 122
    .line 123
    div-int/lit8 v1, v1, 0x3

    .line 124
    .line 125
    .line 126
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 127
    move-result-object v1

    .line 128
    .line 129
    const-string v10, "X-SCREEN-WIDTH"

    .line 130
    .line 131
    .line 132
    invoke-direct {v9, v10, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    .line 134
    new-instance v10, Lkotlin/Pair;

    .line 135
    .line 136
    .line 137
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 138
    move-result-object v1

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/util/TimeZone;->getRawOffset()I

    .line 142
    move-result v1

    .line 143
    .line 144
    div-int/lit16 v1, v1, 0xe10

    .line 145
    .line 146
    div-int/lit16 v1, v1, 0x3e8

    .line 147
    .line 148
    .line 149
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 150
    move-result-object v1

    .line 151
    .line 152
    const-string v11, "X-TIMEZONE-OFFSET"

    .line 153
    .line 154
    .line 155
    invoke-direct {v10, v11, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    filled-new-array/range {v3 .. v10}, [Lkotlin/Pair;

    .line 159
    move-result-object v1

    .line 160
    .line 161
    .line 162
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 163
    move-result-object v1

    .line 164
    .line 165
    iget-object v3, p0, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;->$request:Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;

    .line 166
    .line 167
    iput v2, p0, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource$buyCryptoByBankCard$2;->label:I

    .line 168
    .line 169
    .line 170
    invoke-interface {p1, v1, v3, p0}, Lcom/kubi/payment/fast/data/source/remote/a;->e(Ljava/util/Map;Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 171
    move-result-object p1

    .line 172
    .line 173
    if-ne p1, v0, :cond_2

    .line 174
    return-object v0

    .line 175
    :cond_2
    return-object p1
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
.end method
