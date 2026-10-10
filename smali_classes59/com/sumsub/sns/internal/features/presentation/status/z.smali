.class public final Lcom/sumsub/sns/internal/features/presentation/status/z;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/status/L;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->c:Lcom/sumsub/sns/internal/features/presentation/status/L;

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
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/z;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->c:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/status/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/z;->b:Ljava/lang/Object;

    .line 10
    return-object v0
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
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/z;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->c:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/status/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/z;->b:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->a:I

    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v3, :cond_1

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    throw p1

    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    goto :goto_1

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 40
    .line 41
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->b:Ljava/lang/Object;

    .line 42
    move-object v1, p1

    .line 43
    .line 44
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;

    .line 45
    .line 46
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 47
    .line 48
    iget-object v5, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 49
    .line 50
    const-string v6, "Data repo updated"

    .line 51
    .line 52
    const-string v7, "SNSApplicantStatusViewModel"

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v7, v6, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->a()Ljava/lang/Throwable;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    if-nez v5, :cond_3

    .line 66
    .line 67
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->a()Ljava/lang/Throwable;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    if-nez v5, :cond_3

    .line 74
    .line 75
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->a()Ljava/lang/Throwable;

    .line 79
    move-result-object v5

    .line 80
    :cond_3
    move-object v9, v5

    .line 81
    goto :goto_0

    .line 82
    :cond_4
    move-object v9, v4

    .line 83
    .line 84
    :goto_0
    if-eqz v9, :cond_6

    .line 85
    .line 86
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->c:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/presentation/status/O;

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->c:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 97
    .line 98
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 99
    .line 100
    const-string v0, "Error when getting data..."

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v7, v0, v9}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    const/4 v12, 0x4

    .line 105
    const/4 v13, 0x0

    .line 106
    .line 107
    const-string v10, "TYPE_UNKNOWN"

    .line 108
    const/4 v11, 0x0

    .line 109
    .line 110
    .line 111
    invoke-static/range {v8 .. v13}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 112
    .line 113
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 114
    return-object p1

    .line 115
    .line 116
    :cond_6
    if-nez v1, :cond_7

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 119
    return-object p1

    .line 120
    .line 121
    :cond_7
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->c:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 122
    .line 123
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/status/L;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 124
    .line 125
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->b:Ljava/lang/Object;

    .line 126
    .line 127
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->a:I

    .line 128
    .line 129
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 130
    const/4 v3, 0x0

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v3, p0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    if-ne p1, v0, :cond_8

    .line 137
    goto :goto_5

    .line 138
    .line 139
    :cond_8
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 143
    move-result-object p1

    .line 144
    move-object v7, p1

    .line 145
    .line 146
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 147
    .line 148
    if-eqz v7, :cond_9

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 152
    move-result-object p1

    .line 153
    goto :goto_2

    .line 154
    :cond_9
    move-object p1, v4

    .line 155
    .line 156
    :goto_2
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->c:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 157
    .line 158
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 162
    move-result-object v1

    .line 163
    move-object v6, v1

    .line 164
    .line 165
    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 166
    .line 167
    if-eqz p1, :cond_a

    .line 168
    .line 169
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/j3;->b:Ljava/util/List;

    .line 170
    .line 171
    if-eqz v1, :cond_a

    .line 172
    .line 173
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/O;

    .line 174
    .line 175
    .line 176
    invoke-direct {v3, v7}, Lcom/sumsub/sns/internal/features/data/model/common/O;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/p;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 180
    move-result-object v1

    .line 181
    move-object v8, v1

    .line 182
    goto :goto_3

    .line 183
    :cond_a
    move-object v8, v4

    .line 184
    .line 185
    :goto_3
    if-eqz p1, :cond_b

    .line 186
    .line 187
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/j3;->d:Lcom/sumsub/sns/internal/features/data/model/common/B3;

    .line 188
    move-object v9, p1

    .line 189
    goto :goto_4

    .line 190
    :cond_b
    move-object v9, v4

    .line 191
    .line 192
    :goto_4
    iput-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->b:Ljava/lang/Object;

    .line 193
    .line 194
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/status/z;->a:I

    .line 195
    .line 196
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/status/L;->o:[Lkotlin/reflect/KProperty;

    .line 197
    move-object v10, p0

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v5 .. v10}, Lcom/sumsub/sns/internal/features/presentation/status/L;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/B3;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 201
    move-result-object p1

    .line 202
    .line 203
    if-ne p1, v0, :cond_c

    .line 204
    :goto_5
    return-object v0

    .line 205
    .line 206
    :cond_c
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 207
    return-object p1
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
