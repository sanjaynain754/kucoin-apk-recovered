.class public final Lcom/sumsub/sns/internal/features/presentation/esign/V;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/esign/n0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->c:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

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


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/esign/V;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->c:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/V;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/esign/V;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->c:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/V;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/V;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->b:I

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->a:Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    goto :goto_2

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    throw p1

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    .line 34
    check-cast p1, Lkotlin/Result;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 38
    move-result-object p1

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->c:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 45
    .line 46
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->e:Lcom/sumsub/sns/internal/features/domain/esign/i;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 49
    .line 50
    new-instance v5, Lcom/sumsub/sns/internal/features/data/model/esign/N;

    .line 51
    .line 52
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->c:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->f()Ljava/util/Map;

    .line 56
    move-result-object v6

    .line 57
    .line 58
    .line 59
    invoke-static {v6}, Lkotlin/collections/MapsKt;->toMap(Ljava/util/Map;)Ljava/util/Map;

    .line 60
    move-result-object v6

    .line 61
    .line 62
    .line 63
    invoke-direct {v5, v6}, Lcom/sumsub/sns/internal/features/data/model/esign/N;-><init>(Ljava/util/Map;)V

    .line 64
    .line 65
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->b:I

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, p1, v5, p0}, Lcom/sumsub/sns/internal/features/domain/esign/i;->a(Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/data/model/esign/N;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    if-ne p1, v0, :cond_3

    .line 72
    goto :goto_1

    .line 73
    .line 74
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->c:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 75
    .line 76
    .line 77
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 78
    move-result v5

    .line 79
    .line 80
    if-eqz v5, :cond_4

    .line 81
    move-object v5, p1

    .line 82
    .line 83
    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 87
    move-result-object v6

    .line 88
    .line 89
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    .line 90
    .line 91
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 92
    .line 93
    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    .line 94
    .line 95
    aget-object v8, v8, v2

    .line 96
    .line 97
    iget-object v8, v7, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 98
    .line 99
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v7, v6}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    .line 104
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->a:Ljava/lang/Object;

    .line 105
    .line 106
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->b:I

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v5, p0}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->d(Lcom/sumsub/sns/internal/features/data/model/esign/Y;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    if-ne v1, v0, :cond_4

    .line 113
    :goto_1
    return-object v0

    .line 114
    :cond_4
    move-object v0, p1

    .line 115
    .line 116
    :goto_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/V;->c:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 120
    move-result-object v1

    .line 121
    const/4 v3, 0x0

    .line 122
    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->t:[Lkotlin/reflect/KProperty;

    .line 126
    .line 127
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/esign/Q;

    .line 128
    .line 129
    .line 130
    invoke-direct {v5, v3}, Lcom/sumsub/sns/internal/features/presentation/esign/Q;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 131
    .line 132
    .line 133
    invoke-static {p1, v2, v5, v4, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->getIdDocSetType()Ljava/lang/String;

    .line 137
    move-result-object v2

    .line 138
    .line 139
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/esign/r;->a:Lcom/sumsub/sns/internal/features/presentation/esign/r;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v1, v2, v4}, Lcom/sumsub/sns/core/presentation/base/C;->throwError(Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 146
    move-result p1

    .line 147
    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string/jumbo v1, "provideData: ok="

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 167
    .line 168
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 169
    .line 170
    const-string v1, "SNSESignViewModel"

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v1, p1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 174
    .line 175
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 176
    return-object p1
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
