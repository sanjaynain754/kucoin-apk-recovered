.class public final Lcom/sumsub/sns/core/presentation/base/J0;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/sumsub/sns/core/presentation/base/M0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

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
.end method

.method public static final a(Lcom/sumsub/sns/core/presentation/base/M0;Lcom/sumsub/sns/core/presentation/base/t0;)Lcom/sumsub/sns/core/presentation/base/t0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v0

    const-string/jumbo v1, "sns_general_poweredBy"

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object p0

    const-string/jumbo v1, "sns_general_progress_text"

    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x5

    .line 3
    invoke-static {p1, v1, v0, p0, v2}, Lcom/sumsub/sns/core/presentation/base/t0;->a(Lcom/sumsub/sns/core/presentation/base/t0;ZLjava/lang/String;Ljava/lang/String;I)Lcom/sumsub/sns/core/presentation/base/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/core/presentation/base/t0;)Lcom/sumsub/sns/core/presentation/base/t0;
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x1b

    const/4 v2, 0x0

    .line 4
    invoke-static {p0, v2, v0, v0, v1}, Lcom/sumsub/sns/core/presentation/base/t0;->a(Lcom/sumsub/sns/core/presentation/base/t0;ZLjava/lang/String;Ljava/lang/String;I)Lcom/sumsub/sns/core/presentation/base/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final a(ZLcom/sumsub/sns/core/presentation/base/t0;)Lcom/sumsub/sns/core/presentation/base/t0;
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x1e

    .line 5
    invoke-static {p1, p0, v0, v0, v1}, Lcom/sumsub/sns/core/presentation/base/t0;->a(Lcom/sumsub/sns/core/presentation/base/t0;ZLjava/lang/String;Ljava/lang/String;I)Lcom/sumsub/sns/core/presentation/base/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/core/presentation/base/t0;)Lcom/sumsub/sns/core/presentation/base/t0;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v2, v0, v0, v1}, Lcom/sumsub/sns/core/presentation/base/t0;->a(Lcom/sumsub/sns/core/presentation/base/t0;ZLjava/lang/String;Ljava/lang/String;I)Lcom/sumsub/sns/core/presentation/base/t0;

    .line 8
    move-result-object p0

    .line 9
    return-object p0
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/core/presentation/base/J0;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/core/presentation/base/J0;-><init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V

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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance p1, Lcom/sumsub/sns/core/presentation/base/J0;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/core/presentation/base/J0;-><init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/presentation/base/J0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    iget v3, p0, Lcom/sumsub/sns/core/presentation/base/J0;->a:I

    .line 9
    const/4 v4, 0x5

    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v8, 0x0

    .line 14
    .line 15
    if-eqz v3, :cond_5

    .line 16
    .line 17
    if-eq v3, v1, :cond_4

    .line 18
    .line 19
    if-eq v3, v7, :cond_3

    .line 20
    .line 21
    if-eq v3, v6, :cond_2

    .line 22
    .line 23
    if-eq v3, v5, :cond_1

    .line 24
    .line 25
    if-ne v3, v4, :cond_0

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    throw p1

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    goto :goto_2

    .line 48
    .line 49
    .line 50
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    goto :goto_1

    .line 52
    .line 53
    .line 54
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    goto :goto_0

    .line 56
    .line 57
    .line 58
    :cond_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 67
    .line 68
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 69
    .line 70
    const-string v9, "Lifecycle: Preparing view model"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, p1, v9, v8}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    new-instance p1, Lcom/sumsub/sns/core/presentation/base/F0;

    .line 76
    .line 77
    iget-object v3, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, v3, v8}, Lcom/sumsub/sns/core/presentation/base/F0;-><init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V

    .line 81
    .line 82
    iput v1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->a:I

    .line 83
    .line 84
    const-wide/16 v9, 0x61a8

    .line 85
    .line 86
    .line 87
    invoke-static {v9, v10, p1, p0}, Lkotlinx/coroutines/TimeoutKt;->d(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    if-ne p1, v2, :cond_6

    .line 91
    .line 92
    goto/16 :goto_4

    .line 93
    .line 94
    :cond_6
    :goto_0
    check-cast p1, Lcom/sumsub/sns/core/data/model/SNSSDKState;

    .line 95
    .line 96
    if-eqz p1, :cond_17

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    new-instance v3, Lcom/sumsub/sns/core/presentation/base/I0;

    .line 103
    .line 104
    iget-object v9, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 105
    .line 106
    .line 107
    invoke-direct {v3, v9, v8}, Lcom/sumsub/sns/core/presentation/base/I0;-><init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V

    .line 108
    .line 109
    iput v7, p0, Lcom/sumsub/sns/core/presentation/base/J0;->a:I

    .line 110
    .line 111
    .line 112
    invoke-static {p1, v3, p0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    if-ne p1, v2, :cond_7

    .line 116
    .line 117
    goto/16 :goto_4

    .line 118
    .line 119
    :cond_7
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$get_viewState$p(Lcom/sumsub/sns/core/presentation/base/M0;)Lkotlinx/coroutines/flow/m;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    .line 126
    invoke-interface {p1}, Lkotlinx/coroutines/flow/r;->a()Ljava/util/List;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    .line 130
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 131
    move-result-object p1

    .line 132
    .line 133
    if-nez p1, :cond_8

    .line 134
    .line 135
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->getDefaultState()Lcom/sumsub/sns/core/presentation/base/s;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    if-eqz p1, :cond_8

    .line 142
    .line 143
    iget-object v3, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 144
    .line 145
    .line 146
    invoke-static {v3}, Lcom/sumsub/sns/core/presentation/base/M0;->access$get_viewState$p(Lcom/sumsub/sns/core/presentation/base/M0;)Lkotlinx/coroutines/flow/m;

    .line 147
    move-result-object v3

    .line 148
    .line 149
    iput v6, p0, Lcom/sumsub/sns/core/presentation/base/J0;->a:I

    .line 150
    .line 151
    .line 152
    invoke-interface {v3, p1, p0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 153
    move-result-object p1

    .line 154
    .line 155
    if-ne p1, v2, :cond_8

    .line 156
    goto :goto_4

    .line 157
    .line 158
    :cond_8
    :goto_2
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 159
    .line 160
    .line 161
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$get_viewModelInternalState$p(Lcom/sumsub/sns/core/presentation/base/M0;)Lkotlinx/coroutines/flow/n;

    .line 162
    move-result-object p1

    .line 163
    .line 164
    iget-object v3, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 165
    .line 166
    new-instance v6, Lcom/sumsub/sns/core/presentation/base/a1;

    .line 167
    .line 168
    .line 169
    invoke-direct {v6, v3}, Lcom/sumsub/sns/core/presentation/base/a1;-><init>(Lcom/sumsub/sns/core/presentation/base/M0;)V

    .line 170
    .line 171
    .line 172
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    .line 176
    invoke-interface {v6, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    move-result-object v3

    .line 178
    .line 179
    .line 180
    invoke-interface {p1, v3}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 183
    .line 184
    iput v5, p0, Lcom/sumsub/sns/core/presentation/base/J0;->a:I

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->onPrepare(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 188
    move-result-object p1

    .line 189
    .line 190
    if-ne p1, v2, :cond_9

    .line 191
    goto :goto_4

    .line 192
    .line 193
    :cond_9
    :goto_3
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 194
    .line 195
    .line 196
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$get_viewModelInternalState$p(Lcom/sumsub/sns/core/presentation/base/M0;)Lkotlinx/coroutines/flow/n;

    .line 197
    move-result-object p1

    .line 198
    .line 199
    new-instance v3, Lcom/sumsub/sns/core/presentation/base/b1;

    .line 200
    .line 201
    .line 202
    invoke-direct {v3}, Lcom/sumsub/sns/core/presentation/base/b1;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 206
    move-result-object v5

    .line 207
    .line 208
    .line 209
    invoke-interface {v3, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    move-result-object v3

    .line 211
    .line 212
    .line 213
    invoke-interface {p1, v3}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 214
    .line 215
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 216
    .line 217
    .line 218
    invoke-static {p1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    move-result-object p1

    .line 220
    .line 221
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 222
    .line 223
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 224
    .line 225
    const-string v5, "Lifecycle: ViewModel prepared"

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3, p1, v5, v8}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 229
    .line 230
    :try_start_1
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 231
    .line 232
    .line 233
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$getCommonRepository$p(Lcom/sumsub/sns/core/presentation/base/M0;)Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 234
    move-result-object p1

    .line 235
    .line 236
    iput v4, p0, Lcom/sumsub/sns/core/presentation/base/J0;->a:I

    .line 237
    .line 238
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 242
    move-result-object p1

    .line 243
    .line 244
    if-ne p1, v2, :cond_a

    .line 245
    :goto_4
    return-object v2

    .line 246
    .line 247
    :cond_a
    :goto_5
    check-cast p1, Ljava/util/Map;

    .line 248
    .line 249
    if-eqz p1, :cond_16

    .line 250
    .line 251
    .line 252
    const-string/jumbo v2, "minimalisticUi"

    .line 253
    .line 254
    const/16 v3, 0x2f

    .line 255
    int-to-char v3, v3

    .line 256
    move v4, v3

    .line 257
    .line 258
    new-array v3, v1, [C

    .line 259
    .line 260
    aput-char v4, v3, v0

    .line 261
    const/4 v6, 0x6

    .line 262
    const/4 v7, 0x0

    .line 263
    const/4 v4, 0x0

    .line 264
    const/4 v5, 0x0

    .line 265
    .line 266
    .line 267
    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    .line 268
    move-result-object v2

    .line 269
    .line 270
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 271
    .line 272
    .line 273
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 274
    .line 275
    iput-object p1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 279
    move-result p1

    .line 280
    sub-int/2addr p1, v1

    .line 281
    .line 282
    .line 283
    invoke-static {v0, p1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    .line 284
    move-result-object p1

    .line 285
    .line 286
    .line 287
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 288
    move-result-object p1

    .line 289
    .line 290
    .line 291
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    move-result v1

    .line 293
    .line 294
    if-eqz v1, :cond_13

    .line 295
    move-object v1, p1

    .line 296
    .line 297
    check-cast v1, Lkotlin/collections/IntIterator;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 301
    move-result v1

    .line 302
    .line 303
    iget-object v4, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v4, Ljava/util/Map;

    .line 306
    .line 307
    .line 308
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 309
    move-result-object v1

    .line 310
    .line 311
    .line 312
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    move-result-object v1

    .line 314
    .line 315
    instance-of v4, v1, Ljava/util/Map;

    .line 316
    .line 317
    if-eqz v4, :cond_b

    .line 318
    .line 319
    check-cast v1, Ljava/util/Map;

    .line 320
    goto :goto_7

    .line 321
    :cond_b
    move-object v1, v8

    .line 322
    .line 323
    :goto_7
    if-eqz v1, :cond_15

    .line 324
    .line 325
    new-instance v4, Ljava/util/ArrayList;

    .line 326
    .line 327
    .line 328
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 329
    .line 330
    .line 331
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 332
    move-result-object v1

    .line 333
    .line 334
    .line 335
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 336
    move-result-object v1

    .line 337
    .line 338
    .line 339
    :cond_c
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    move-result v5

    .line 341
    .line 342
    if-eqz v5, :cond_11

    .line 343
    .line 344
    .line 345
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    move-result-object v5

    .line 347
    .line 348
    check-cast v5, Ljava/util/Map$Entry;

    .line 349
    .line 350
    .line 351
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 352
    move-result-object v6

    .line 353
    .line 354
    instance-of v7, v6, Ljava/lang/String;

    .line 355
    .line 356
    if-nez v7, :cond_d

    .line 357
    move-object v6, v8

    .line 358
    .line 359
    :cond_d
    check-cast v6, Ljava/lang/String;

    .line 360
    .line 361
    if-nez v6, :cond_e

    .line 362
    goto :goto_9

    .line 363
    .line 364
    .line 365
    :cond_e
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 366
    move-result-object v5

    .line 367
    .line 368
    if-nez v5, :cond_f

    .line 369
    move-object v5, v8

    .line 370
    .line 371
    :cond_f
    if-nez v5, :cond_10

    .line 372
    :goto_9
    move-object v5, v8

    .line 373
    goto :goto_a

    .line 374
    .line 375
    .line 376
    :cond_10
    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 377
    move-result-object v5

    .line 378
    .line 379
    :goto_a
    if-eqz v5, :cond_c

    .line 380
    .line 381
    .line 382
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    goto :goto_8

    .line 384
    .line 385
    .line 386
    :cond_11
    invoke-static {v4}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 387
    move-result-object v1

    .line 388
    .line 389
    if-nez v1, :cond_12

    .line 390
    goto :goto_c

    .line 391
    .line 392
    :cond_12
    iput-object v1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 393
    goto :goto_6

    .line 394
    .line 395
    :cond_13
    iget-object p1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast p1, Ljava/util/Map;

    .line 398
    .line 399
    .line 400
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 401
    move-result-object v1

    .line 402
    .line 403
    .line 404
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    move-result-object p1

    .line 406
    .line 407
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 408
    .line 409
    if-nez v1, :cond_14

    .line 410
    goto :goto_b

    .line 411
    :cond_14
    move-object v8, p1

    .line 412
    .line 413
    :goto_b
    check-cast v8, Ljava/lang/Boolean;

    .line 414
    .line 415
    :cond_15
    :goto_c
    if-eqz v8, :cond_16

    .line 416
    .line 417
    .line 418
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 419
    move-result v0

    .line 420
    .line 421
    :cond_16
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 422
    .line 423
    .line 424
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$get_viewModelInternalState$p(Lcom/sumsub/sns/core/presentation/base/M0;)Lkotlinx/coroutines/flow/n;

    .line 425
    move-result-object p1

    .line 426
    .line 427
    new-instance v1, Lcom/sumsub/sns/core/presentation/base/c1;

    .line 428
    .line 429
    .line 430
    invoke-direct {v1, v0}, Lcom/sumsub/sns/core/presentation/base/c1;-><init>(Z)V

    .line 431
    .line 432
    .line 433
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 434
    move-result-object v0

    .line 435
    .line 436
    .line 437
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    move-result-object v0

    .line 439
    .line 440
    .line 441
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 442
    goto :goto_d

    .line 443
    .line 444
    :catch_0
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/J0;->b:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 445
    .line 446
    .line 447
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$get_viewModelInternalState$p(Lcom/sumsub/sns/core/presentation/base/M0;)Lkotlinx/coroutines/flow/n;

    .line 448
    move-result-object p1

    .line 449
    .line 450
    new-instance v0, Lcom/sumsub/sns/core/presentation/base/d1;

    .line 451
    .line 452
    .line 453
    invoke-direct {v0}, Lcom/sumsub/sns/core/presentation/base/d1;-><init>()V

    .line 454
    .line 455
    .line 456
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 457
    move-result-object v1

    .line 458
    .line 459
    .line 460
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    move-result-object v0

    .line 462
    .line 463
    .line 464
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 465
    .line 466
    :goto_d
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 467
    return-object p1

    .line 468
    .line 469
    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 470
    .line 471
    const-string v0, "SDK prepare timeout"

    .line 472
    .line 473
    .line 474
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 475
    throw p1
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
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method
