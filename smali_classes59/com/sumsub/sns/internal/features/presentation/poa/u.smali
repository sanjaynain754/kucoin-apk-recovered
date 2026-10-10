.class public final Lcom/sumsub/sns/internal/features/presentation/poa/u;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/poa/x;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/utils/M;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/poa/x;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->c:Lcom/sumsub/sns/internal/features/presentation/poa/x;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->d:Lcom/sumsub/sns/internal/features/presentation/utils/M;

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
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/poa/u;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->c:Lcom/sumsub/sns/internal/features/presentation/poa/x;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->d:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p2}, Lcom/sumsub/sns/internal/features/presentation/poa/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/x;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->b:Ljava/lang/Object;

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
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/poa/u;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/poa/u;

    .line 11
    .line 12
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/poa/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->a:I

    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 18
    goto :goto_3

    .line 19
    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    throw p1

    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lkotlinx/coroutines/flow/f;

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    .line 35
    check-cast p1, Lkotlin/Result;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->b:Ljava/lang/Object;

    .line 46
    move-object v1, p1

    .line 47
    .line 48
    check-cast v1, Lkotlinx/coroutines/flow/f;

    .line 49
    .line 50
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->c:Lcom/sumsub/sns/internal/features/presentation/poa/x;

    .line 51
    .line 52
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/x;->g:Lcom/sumsub/sns/internal/features/domain/G;

    .line 53
    .line 54
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->b:Ljava/lang/Object;

    .line 55
    .line 56
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->a:I

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/internal/features/domain/G;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    goto :goto_2

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 67
    move-result v4

    .line 68
    const/4 v5, 0x0

    .line 69
    .line 70
    if-eqz v4, :cond_4

    .line 71
    move-object p1, v5

    .line 72
    .line 73
    :cond_4
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/Q2;

    .line 74
    .line 75
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->c:Lcom/sumsub/sns/internal/features/presentation/poa/x;

    .line 76
    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/data/model/common/Q2;->c:Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 83
    move-result-object v7

    .line 84
    .line 85
    .line 86
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    move-result v6

    .line 88
    goto :goto_1

    .line 89
    :cond_5
    const/4 v6, 0x0

    .line 90
    .line 91
    :goto_1
    iput-boolean v6, v4, Lcom/sumsub/sns/internal/features/presentation/poa/x;->l:Z

    .line 92
    .line 93
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->d:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 94
    .line 95
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->c:Lcom/sumsub/sns/internal/features/presentation/poa/x;

    .line 96
    .line 97
    iget-boolean v6, v6, Lcom/sumsub/sns/internal/features/presentation/poa/x;->l:Z

    .line 98
    .line 99
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/presentation/utils/M;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 100
    .line 101
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    .line 102
    .line 103
    aget-object v3, v7, v3

    .line 104
    .line 105
    .line 106
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 107
    move-result-object v3

    .line 108
    .line 109
    iget-object v6, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 110
    .line 111
    iget-object v4, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v4, v3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 115
    .line 116
    iput-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->b:Ljava/lang/Object;

    .line 117
    .line 118
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/poa/u;->a:I

    .line 119
    .line 120
    .line 121
    invoke-interface {v1, p1, p0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    if-ne p1, v0, :cond_6

    .line 125
    :goto_2
    return-object v0

    .line 126
    .line 127
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 128
    return-object p1
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
