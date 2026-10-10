.class public final Lcom/sumsub/sns/internal/features/presentation/otp/p;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/otp/q;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/otp/q;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->c:Lcom/sumsub/sns/internal/features/presentation/otp/q;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/otp/p;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->c:Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/otp/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/q;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->b:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/otp/k;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/otp/p;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->c:Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/otp/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/q;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->b:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/otp/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->a:I

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/otp/k;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    goto :goto_1

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
    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/otp/k;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->c:Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 38
    .line 39
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->b:Ljava/lang/Object;

    .line 40
    .line 41
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->a:I

    .line 42
    .line 43
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/otp/q;->d:[Lkotlin/reflect/KProperty;

    .line 44
    .line 45
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/otp/q;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 46
    .line 47
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/otp/q;->d:[Lkotlin/reflect/KProperty;

    .line 48
    .line 49
    aget-object v5, v5, v2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 53
    move-result-object v4

    .line 54
    .line 55
    check-cast v4, Ljava/lang/Number;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 59
    move-result-wide v4

    .line 60
    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    move-result-wide v6

    .line 64
    .line 65
    cmp-long v4, v4, v6

    .line 66
    .line 67
    if-gez v4, :cond_2

    .line 68
    .line 69
    .line 70
    const-string/jumbo v4, "sns_confirmation_code_action_resend"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v4, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 74
    move-result-object v1

    .line 75
    goto :goto_0

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/otp/q;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    :goto_0
    if-ne v1, v0, :cond_3

    .line 82
    return-object v0

    .line 83
    :cond_3
    move-object v0, p1

    .line 84
    move-object p1, v1

    .line 85
    :goto_1
    move-object v8, p1

    .line 86
    .line 87
    check-cast v8, Ljava/lang/String;

    .line 88
    .line 89
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/p;->c:Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 90
    .line 91
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/otp/q;->d:[Lkotlin/reflect/KProperty;

    .line 92
    .line 93
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/otp/q;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 94
    .line 95
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/otp/q;->d:[Lkotlin/reflect/KProperty;

    .line 96
    .line 97
    aget-object v1, v1, v2

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    check-cast p1, Ljava/lang/Number;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 107
    move-result-wide v4

    .line 108
    .line 109
    .line 110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 111
    move-result-wide v6

    .line 112
    .line 113
    cmp-long p1, v4, v6

    .line 114
    .line 115
    if-gez p1, :cond_4

    .line 116
    move v10, v3

    .line 117
    goto :goto_2

    .line 118
    :cond_4
    move v10, v2

    .line 119
    .line 120
    :goto_2
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/otp/k;->a:Ljava/lang/String;

    .line 121
    .line 122
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/otp/k;->b:Ljava/lang/String;

    .line 123
    .line 124
    iget v5, v0, Lcom/sumsub/sns/internal/features/presentation/otp/k;->c:I

    .line 125
    .line 126
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/otp/k;->f:Ljava/lang/String;

    .line 127
    .line 128
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/otp/k;

    .line 129
    .line 130
    .line 131
    invoke-direct/range {v4 .. v10}, Lcom/sumsub/sns/internal/features/presentation/otp/k;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 132
    return-object v4
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
