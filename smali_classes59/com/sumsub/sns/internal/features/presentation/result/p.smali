.class public final Lcom/sumsub/sns/internal/features/presentation/result/p;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/result/q;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/result/q;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->d:Lcom/sumsub/sns/internal/features/presentation/result/q;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/result/p;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->d:Lcom/sumsub/sns/internal/features/presentation/result/q;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/result/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/result/q;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/result/p;->c:Ljava/lang/Object;

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
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/result/p;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->d:Lcom/sumsub/sns/internal/features/presentation/result/q;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/result/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/result/q;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/result/p;->c:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/result/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->b:I

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
    .line 19
    goto/16 :goto_6

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
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->a:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Lkotlinx/coroutines/flow/f;

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 37
    goto :goto_2

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    .line 42
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->c:Ljava/lang/Object;

    .line 43
    move-object v4, p1

    .line 44
    .line 45
    check-cast v4, Lkotlinx/coroutines/flow/f;

    .line 46
    .line 47
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->d:Lcom/sumsub/sns/internal/features/presentation/result/q;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/result/q;->e()Lcom/sumsub/sns/internal/features/presentation/result/c;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/result/c;->a:Lcom/sumsub/sns/internal/features/presentation/result/SNSFinishResultType;

    .line 54
    .line 55
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/result/r;->a:[I

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 59
    move-result p1

    .line 60
    .line 61
    aget p1, v1, p1

    .line 62
    .line 63
    if-eq p1, v3, :cond_4

    .line 64
    .line 65
    if-eq p1, v2, :cond_3

    .line 66
    .line 67
    sget-object p1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->SUCCESS:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    .line 71
    move-result-object p1

    .line 72
    :goto_0
    move-object v1, p1

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_3
    sget-object p1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->FAILURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    .line 79
    move-result-object p1

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :cond_4
    sget-object p1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->SUBMITTED:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    goto :goto_0

    .line 88
    .line 89
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->d:Lcom/sumsub/sns/internal/features/presentation/result/q;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/result/q;->e()Lcom/sumsub/sns/internal/features/presentation/result/c;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/result/c;->d:Lcom/sumsub/sns/internal/features/presentation/result/k;

    .line 96
    .line 97
    if-eqz p1, :cond_5

    .line 98
    .line 99
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/result/k;->a:Ljava/lang/String;

    .line 100
    .line 101
    if-nez p1, :cond_7

    .line 102
    .line 103
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->d:Lcom/sumsub/sns/internal/features/presentation/result/q;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/result/q;->e()Lcom/sumsub/sns/internal/features/presentation/result/c;

    .line 107
    move-result-object v5

    .line 108
    .line 109
    .line 110
    invoke-static {v5}, Lcom/sumsub/sns/internal/features/presentation/result/s;->a(Lcom/sumsub/sns/internal/features/presentation/result/c;)Ljava/lang/String;

    .line 111
    move-result-object v5

    .line 112
    .line 113
    iput-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->c:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->a:Ljava/lang/String;

    .line 116
    .line 117
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->b:I

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v5, p0}, Lcom/sumsub/sns/core/presentation/base/p0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 121
    move-result-object p1

    .line 122
    .line 123
    if-ne p1, v0, :cond_6

    .line 124
    goto :goto_5

    .line 125
    .line 126
    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/String;

    .line 127
    .line 128
    :cond_7
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->d:Lcom/sumsub/sns/internal/features/presentation/result/q;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/presentation/result/q;->e()Lcom/sumsub/sns/internal/features/presentation/result/c;

    .line 132
    move-result-object v5

    .line 133
    .line 134
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/result/c;->d:Lcom/sumsub/sns/internal/features/presentation/result/k;

    .line 135
    const/4 v6, 0x0

    .line 136
    .line 137
    if-eqz v5, :cond_8

    .line 138
    .line 139
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/result/k;->b:Ljava/lang/String;

    .line 140
    goto :goto_3

    .line 141
    :cond_8
    move-object v5, v6

    .line 142
    .line 143
    :goto_3
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->d:Lcom/sumsub/sns/internal/features/presentation/result/q;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/presentation/result/q;->e()Lcom/sumsub/sns/internal/features/presentation/result/c;

    .line 147
    move-result-object v7

    .line 148
    .line 149
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/presentation/result/c;->a:Lcom/sumsub/sns/internal/features/presentation/result/SNSFinishResultType;

    .line 150
    .line 151
    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/result/r;->a:[I

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 155
    move-result v7

    .line 156
    .line 157
    aget v7, v8, v7

    .line 158
    .line 159
    if-eq v7, v3, :cond_b

    .line 160
    .line 161
    if-eq v7, v2, :cond_a

    .line 162
    const/4 v3, 0x3

    .line 163
    .line 164
    if-eq v7, v3, :cond_9

    .line 165
    .line 166
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->APPROVED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 167
    goto :goto_4

    .line 168
    .line 169
    :cond_9
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->PROCESSING:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 170
    goto :goto_4

    .line 171
    .line 172
    :cond_a
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 173
    goto :goto_4

    .line 174
    .line 175
    :cond_b
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->PENDING:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 176
    .line 177
    :goto_4
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/result/n;

    .line 178
    .line 179
    .line 180
    invoke-direct {v7, v1, p1, v5, v3}, Lcom/sumsub/sns/internal/features/presentation/result/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 181
    .line 182
    iput-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->c:Ljava/lang/Object;

    .line 183
    .line 184
    iput-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->a:Ljava/lang/String;

    .line 185
    .line 186
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/result/p;->b:I

    .line 187
    .line 188
    .line 189
    invoke-interface {v4, v7, p0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 190
    move-result-object p1

    .line 191
    .line 192
    if-ne p1, v0, :cond_c

    .line 193
    :goto_5
    return-object v0

    .line 194
    .line 195
    :cond_c
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 196
    return-object p1
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
