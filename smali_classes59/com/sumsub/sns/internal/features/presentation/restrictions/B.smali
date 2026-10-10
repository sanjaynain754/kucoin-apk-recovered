.class public final Lcom/sumsub/sns/internal/features/presentation/restrictions/B;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/restrictions/C;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/restrictions/C;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->c:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 3
    .line 4
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->d:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 5
    const/4 p1, 0x2

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->c:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->d:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, p2, v2}, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;-><init>(Lcom/sumsub/sns/internal/features/presentation/restrictions/C;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/restrictions/C;)V

    .line 10
    .line 11
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->b:Ljava/lang/Object;

    .line 12
    return-object v0
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
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;

    .line 11
    .line 12
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->a:I

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    move-object p1, v0

    .line 19
    goto :goto_2

    .line 20
    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    throw p1

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 35
    .line 36
    :try_start_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->d:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->b:Lcom/sumsub/sns/internal/features/presentation/restrictions/f;

    .line 39
    .line 40
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->a:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/restrictions/f;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    return-object v0

    .line 48
    .line 49
    :cond_2
    :goto_0
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/d;

    .line 50
    .line 51
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/a;->a:Lcom/sumsub/sns/internal/features/presentation/restrictions/a;

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    move-result v0

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->d:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 60
    .line 61
    new-instance v5, Lcom/sumsub/sns/internal/core/common/t;

    .line 62
    .line 63
    .line 64
    invoke-direct {v5, v3}, Lcom/sumsub/sns/internal/core/common/t;-><init>(Z)V

    .line 65
    .line 66
    const/16 v9, 0xe

    .line 67
    const/4 v10, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    .line 72
    .line 73
    invoke-static/range {v4 .. v10}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 74
    .line 75
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->d:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 76
    .line 77
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->c:Lcom/sumsub/sns/internal/core/common/s0;

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Lcom/sumsub/sns/internal/core/common/s0;->c()V

    .line 81
    goto :goto_1

    .line 82
    .line 83
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/b;

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->d:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 88
    .line 89
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->e:Lkotlinx/coroutines/flow/n;

    .line 90
    .line 91
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/b;

    .line 92
    .line 93
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/b;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;

    .line 94
    .line 95
    .line 96
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 97
    goto :goto_1

    .line 98
    .line 99
    :cond_4
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/c;

    .line 100
    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->d:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 104
    .line 105
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/c;

    .line 106
    .line 107
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/c;->a:Ljava/lang/Throwable;

    .line 108
    .line 109
    const-string v6, "Status"

    .line 110
    const/4 v8, 0x4

    .line 111
    const/4 v9, 0x0

    .line 112
    const/4 v7, 0x0

    .line 113
    .line 114
    .line 115
    invoke-static/range {v4 .. v9}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    .line 117
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->c:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 121
    .line 122
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 123
    return-object p1

    .line 124
    .line 125
    :cond_5
    :try_start_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 126
    .line 127
    .line 128
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 129
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 130
    .line 131
    :goto_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/B;->c:Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 135
    throw p1
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
