.class public final Lcom/sumsub/sns/internal/features/presentation/esign/K;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/sumsub/sns/internal/features/data/model/esign/s;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/sumsub/sns/internal/features/presentation/esign/n0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->e:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/K;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->e:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/K;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->d:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/K;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->e:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/K;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->d:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/esign/K;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->c:I

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->b:Lcom/sumsub/sns/internal/features/data/model/esign/s;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->a:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 23
    goto :goto_2

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    throw p1

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 35
    .line 36
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->e:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 41
    .line 42
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/esign/n0;->m:Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    iget-object v5, v3, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->c:Ljava/lang/String;

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move-object v5, v4

    .line 50
    .line 51
    :goto_0
    if-eqz v3, :cond_3

    .line 52
    .line 53
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/esign/Y;->e:Lcom/sumsub/sns/internal/features/data/model/esign/c;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/esign/c;->b:Lcom/sumsub/sns/internal/features/data/model/esign/s;

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v3, v4

    .line 60
    .line 61
    :goto_1
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->d:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->a:Ljava/lang/String;

    .line 64
    .line 65
    iput-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->b:Lcom/sumsub/sns/internal/features/data/model/esign/s;

    .line 66
    .line 67
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/K;->c:I

    .line 68
    .line 69
    .line 70
    const-string/jumbo v2, "sns_confirmation_code_isNotValid"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    if-ne v1, v0, :cond_4

    .line 77
    return-object v0

    .line 78
    :cond_4
    move-object v2, p1

    .line 79
    move-object p1, v1

    .line 80
    move-object v0, v3

    .line 81
    move-object v1, v5

    .line 82
    .line 83
    :goto_2
    check-cast p1, Ljava/lang/String;

    .line 84
    .line 85
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/esign/u;

    .line 86
    .line 87
    .line 88
    invoke-direct {v3, v1, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/esign/u;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/esign/s;Ljava/lang/String;)V

    .line 89
    const/4 v6, 0x0

    .line 90
    .line 91
    const/16 v7, 0xe

    .line 92
    const/4 v4, 0x0

    .line 93
    const/4 v5, 0x0

    .line 94
    .line 95
    .line 96
    invoke-static/range {v2 .. v7}, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a(Lcom/sumsub/sns/internal/features/presentation/esign/x;Lcom/sumsub/sns/internal/features/presentation/esign/p;ZLcom/sumsub/sns/internal/features/presentation/esign/j;ZI)Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 97
    move-result-object p1

    .line 98
    return-object p1
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
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
