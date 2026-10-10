.class public final Lcom/sumsub/sns/core/presentation/base/I0;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Lcom/sumsub/sns/core/presentation/base/M0;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/sumsub/sns/core/presentation/base/M0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

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
    new-instance v0, Lcom/sumsub/sns/core/presentation/base/I0;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/core/presentation/base/I0;-><init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/core/presentation/base/I0;->c:Ljava/lang/Object;

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
    new-instance v0, Lcom/sumsub/sns/core/presentation/base/I0;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/core/presentation/base/I0;-><init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/core/presentation/base/I0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/presentation/base/I0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->b:I

    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    if-eq v1, v4, :cond_2

    .line 15
    .line 16
    if-eq v1, v3, :cond_1

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/I0;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lcom/sumsub/sns/core/presentation/base/M0;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    .line 27
    goto/16 :goto_3

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
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->a:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 38
    .line 39
    iget-object v3, p0, Lcom/sumsub/sns/core/presentation/base/I0;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Lkotlinx/coroutines/r0;

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    goto :goto_1

    .line 46
    .line 47
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lkotlinx/coroutines/m0;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    :cond_3
    move-object v6, v1

    .line 54
    goto :goto_0

    .line 55
    .line 56
    .line 57
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->c:Ljava/lang/Object;

    .line 60
    move-object v1, p1

    .line 61
    .line 62
    check-cast v1, Lkotlinx/coroutines/m0;

    .line 63
    .line 64
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$getDataRepository$p(Lcom/sumsub/sns/core/presentation/base/M0;)Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->c:Ljava/lang/Object;

    .line 71
    .line 72
    iput v4, p0, Lcom/sumsub/sns/core/presentation/base/I0;->b:I

    .line 73
    .line 74
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    if-ne p1, v0, :cond_3

    .line 81
    goto :goto_2

    .line 82
    .line 83
    :goto_0
    new-instance v9, Lcom/sumsub/sns/core/presentation/base/H0;

    .line 84
    .line 85
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 86
    .line 87
    .line 88
    invoke-direct {v9, p1, v5}, Lcom/sumsub/sns/core/presentation/base/H0;-><init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V

    .line 89
    const/4 v10, 0x3

    .line 90
    const/4 v11, 0x0

    .line 91
    const/4 v7, 0x0

    .line 92
    const/4 v8, 0x0

    .line 93
    .line 94
    .line 95
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    new-instance v9, Lcom/sumsub/sns/core/presentation/base/G0;

    .line 99
    .line 100
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 101
    .line 102
    .line 103
    invoke-direct {v9, v1, v5}, Lcom/sumsub/sns/core/presentation/base/G0;-><init>(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)V

    .line 104
    .line 105
    .line 106
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    iget-object v4, p0, Lcom/sumsub/sns/core/presentation/base/I0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 110
    .line 111
    iput-object v1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->c:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v4, p0, Lcom/sumsub/sns/core/presentation/base/I0;->a:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 114
    .line 115
    iput v3, p0, Lcom/sumsub/sns/core/presentation/base/I0;->b:I

    .line 116
    .line 117
    .line 118
    invoke-interface {p1, p0}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    if-ne p1, v0, :cond_5

    .line 122
    goto :goto_2

    .line 123
    :cond_5
    move-object v3, v1

    .line 124
    move-object v1, v4

    .line 125
    .line 126
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 127
    .line 128
    .line 129
    invoke-static {v1, p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$set_strings$p(Lcom/sumsub/sns/core/presentation/base/M0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)V

    .line 130
    .line 131
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->d:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 132
    .line 133
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/base/I0;->c:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v5, p0, Lcom/sumsub/sns/core/presentation/base/I0;->a:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 136
    .line 137
    iput v2, p0, Lcom/sumsub/sns/core/presentation/base/I0;->b:I

    .line 138
    .line 139
    .line 140
    invoke-interface {v3, p0}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    if-ne v1, v0, :cond_6

    .line 144
    :goto_2
    return-object v0

    .line 145
    :cond_6
    move-object v0, p1

    .line 146
    move-object p1, v1

    .line 147
    .line 148
    :goto_3
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 149
    .line 150
    .line 151
    invoke-static {v0, p1}, Lcom/sumsub/sns/core/presentation/base/M0;->access$setConfig$p(Lcom/sumsub/sns/core/presentation/base/M0;Lcom/sumsub/sns/internal/features/data/model/common/h;)V

    .line 152
    .line 153
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 154
    return-object p1
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
