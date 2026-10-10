.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/N1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->b:Ljava/lang/Object;

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
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->a:I

    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    .line 11
    if-eqz v1, :cond_4

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
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    throw p1

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lkotlinx/coroutines/m0;

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    :cond_3
    move-object v4, v1

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    .line 49
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->b:Ljava/lang/Object;

    .line 50
    move-object v1, p1

    .line 51
    .line 52
    check-cast v1, Lkotlinx/coroutines/m0;

    .line 53
    .line 54
    const-string p1, "ViewModel: startCameraSession"

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 58
    .line 59
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v4}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 63
    .line 64
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 65
    .line 66
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->l:Lkotlinx/coroutines/flow/n;

    .line 67
    .line 68
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/prooface/f1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/f1;

    .line 69
    .line 70
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->b:Ljava/lang/Object;

    .line 71
    .line 72
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->a:I

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v5, p0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    if-ne p1, v0, :cond_3

    .line 79
    goto :goto_2

    .line 80
    .line 81
    :goto_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 82
    .line 83
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/session/f0;

    .line 84
    .line 85
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->r:Lkotlinx/coroutines/flow/w;

    .line 86
    .line 87
    iget-object v8, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->v:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

    .line 88
    .line 89
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;

    .line 90
    .line 91
    iget-object p1, v7, Lcom/sumsub/sns/internal/features/presentation/prooface/session/f0;->d:Lcom/sumsub/sns/internal/core/domain/facedetector/e;

    .line 92
    .line 93
    .line 94
    invoke-direct {v9, p1, v8}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;-><init>(Lcom/sumsub/sns/internal/core/domain/facedetector/e;Lcom/sumsub/sns/internal/features/presentation/prooface/A1;)V

    .line 95
    move-object v5, v4

    .line 96
    .line 97
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e0;

    .line 98
    .line 99
    .line 100
    invoke-direct/range {v4 .. v9}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/e0;-><init>(Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/prooface/session/f0;Lcom/sumsub/sns/internal/features/presentation/prooface/A1;Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;)V

    .line 101
    .line 102
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/r0;

    .line 103
    .line 104
    iget-object v1, v7, Lcom/sumsub/sns/internal/features/presentation/prooface/session/f0;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 105
    .line 106
    iget-object v6, v7, Lcom/sumsub/sns/internal/features/presentation/prooface/session/f0;->b:Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    .line 107
    .line 108
    .line 109
    invoke-direct {p1, v5, v1, v6, v4}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/r0;-><init>(Lkotlinx/coroutines/m0;Lcom/sumsub/sns/internal/features/data/network/prooface/o;Lcom/sumsub/sns/internal/core/domain/facedetector/d;Lcom/sumsub/sns/internal/features/presentation/prooface/session/e0;)V

    .line 110
    .line 111
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 112
    .line 113
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/r0;->g:Lkotlinx/coroutines/flow/w;

    .line 114
    .line 115
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/prooface/Q1;

    .line 116
    const/4 v10, 0x0

    .line 117
    .line 118
    .line 119
    invoke-direct {v6, v1, v10}, Lcom/sumsub/sns/internal/features/presentation/prooface/Q1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v4, v5, v6}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 123
    .line 124
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/r0;->g:Lkotlinx/coroutines/flow/w;

    .line 125
    .line 126
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;

    .line 127
    .line 128
    .line 129
    invoke-direct {v6, v1, v10}, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v4, v5, v6}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 133
    .line 134
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/r0;->g:Lkotlinx/coroutines/flow/w;

    .line 135
    .line 136
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/prooface/S1;

    .line 137
    .line 138
    .line 139
    invoke-direct {v6, v1, v10}, Lcom/sumsub/sns/internal/features/presentation/prooface/S1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v4, v5, v6}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 143
    .line 144
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/prooface/W1;

    .line 145
    .line 146
    .line 147
    invoke-direct {v7, p1, v1, v10}, Lcom/sumsub/sns/internal/features/presentation/prooface/W1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/r0;Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 148
    const/4 v8, 0x3

    .line 149
    const/4 v9, 0x0

    .line 150
    move-object v4, v5

    .line 151
    const/4 v5, 0x0

    .line 152
    const/4 v6, 0x0

    .line 153
    .line 154
    .line 155
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 156
    .line 157
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 158
    .line 159
    iput-object p1, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->j:Lcom/sumsub/sns/internal/features/presentation/prooface/session/r0;

    .line 160
    .line 161
    iput-object v10, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->b:Ljava/lang/Object;

    .line 162
    .line 163
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->a:I

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/r0;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 167
    move-result-object p1

    .line 168
    .line 169
    if-ne p1, v0, :cond_5

    .line 170
    goto :goto_2

    .line 171
    .line 172
    :cond_5
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/D0;

    .line 173
    .line 174
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 175
    const/4 v3, 0x0

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 179
    .line 180
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 181
    .line 182
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->n:Lcom/sumsub/sns/internal/features/presentation/prooface/P0;

    .line 183
    .line 184
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/N1;->a:I

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a(Lcom/sumsub/sns/internal/features/presentation/prooface/session/D0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 188
    move-result-object p1

    .line 189
    .line 190
    if-ne p1, v0, :cond_6

    .line 191
    :goto_2
    return-object v0

    .line 192
    .line 193
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 194
    return-object p1
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
