.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

.field public c:Lkotlinx/coroutines/flow/n;

.field public d:I

.field public final synthetic e:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->e:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->e:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->e:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->d:I

    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

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
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    move-object v3, v2

    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    throw p1

    .line 38
    .line 39
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 40
    .line 41
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 42
    .line 43
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->e:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 55
    .line 56
    iput-boolean v4, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->B:Z

    .line 57
    .line 58
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/S0;

    .line 59
    const/4 v5, 0x0

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v5}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/S0;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v3, v1, v4, v5}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 66
    .line 67
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->e:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 68
    .line 69
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->G:Lkotlinx/coroutines/flow/n;

    .line 70
    .line 71
    .line 72
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->e:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;

    .line 76
    move-object v5, v1

    .line 77
    .line 78
    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 79
    .line 80
    iput-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->a:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 83
    .line 84
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 85
    .line 86
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->d:I

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    if-ne v1, v0, :cond_3

    .line 93
    goto :goto_1

    .line 94
    :cond_3
    move-object v9, v1

    .line 95
    move-object v1, p1

    .line 96
    move-object p1, v9

    .line 97
    .line 98
    :goto_0
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 99
    .line 100
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;

    .line 101
    .line 102
    .line 103
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 104
    move-result-object v7

    .line 105
    .line 106
    .line 107
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 108
    move-result-object v4

    .line 109
    const/4 v8, 0x6

    .line 110
    .line 111
    .line 112
    invoke-static {v5, v7, v4, v8}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;

    .line 113
    move-result-object v4

    .line 114
    .line 115
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;

    .line 116
    .line 117
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;->SMALL:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;

    .line 118
    .line 119
    .line 120
    invoke-direct {v5, v3, v7, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;-><init>(ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/CheckDetectionResult$SizeCheckResult;Z)V

    .line 121
    .line 122
    iput-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->a:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 125
    .line 126
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 127
    .line 128
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/T0;->d:I

    .line 129
    .line 130
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->U:[Lkotlin/reflect/KProperty;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v5, v3, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/C2;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/d;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 134
    move-result-object v2

    .line 135
    .line 136
    if-ne v2, v0, :cond_4

    .line 137
    :goto_1
    return-object v0

    .line 138
    :cond_4
    move-object v0, v1

    .line 139
    move-object v3, v4

    .line 140
    move-object v1, p1

    .line 141
    move-object p1, v2

    .line 142
    :goto_2
    move-object v4, p1

    .line 143
    .line 144
    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;

    .line 145
    const/4 v6, 0x0

    .line 146
    .line 147
    const/16 v7, 0x19

    .line 148
    const/4 v2, 0x0

    .line 149
    const/4 v5, 0x0

    .line 150
    .line 151
    .line 152
    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/O;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/M;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/Q;Lcom/sumsub/sns/core/presentation/base/m;I)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/P;

    .line 153
    move-result-object p1

    .line 154
    .line 155
    .line 156
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 157
    .line 158
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 159
    return-object p1
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
