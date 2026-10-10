.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/R1;
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
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;->b:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/x0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;->a:I

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
    goto :goto_3

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
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/x0;

    .line 31
    .line 32
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->x:[Lkotlin/reflect/KProperty;

    .line 33
    .line 34
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/prooface/a1;

    .line 39
    .line 40
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c;

    .line 41
    .line 42
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c;->a:F

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/a1;-><init>(F)V

    .line 46
    goto :goto_2

    .line 47
    .line 48
    :cond_2
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/b;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/b;

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-nez v1, :cond_6

    .line 55
    .line 56
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/t;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    goto :goto_1

    .line 60
    .line 61
    :cond_3
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c0;

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    move-result v1

    .line 66
    .line 67
    if-nez v1, :cond_5

    .line 68
    .line 69
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/s;

    .line 70
    .line 71
    if-eqz p1, :cond_4

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 75
    .line 76
    .line 77
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 78
    throw p1

    .line 79
    .line 80
    :cond_5
    :goto_0
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/prooface/Z0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/Z0;

    .line 81
    goto :goto_2

    .line 82
    .line 83
    :cond_6
    :goto_1
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/prooface/b1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/b1;

    .line 84
    .line 85
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    const-string v3, "ViewModel: required camera state: "

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    .line 103
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 104
    .line 105
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 106
    .line 107
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->s:Lkotlinx/coroutines/flow/n;

    .line 108
    .line 109
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/R1;->a:I

    .line 110
    .line 111
    .line 112
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    if-ne p1, v0, :cond_7

    .line 116
    return-object v0

    .line 117
    .line 118
    :cond_7
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 119
    return-object p1
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
