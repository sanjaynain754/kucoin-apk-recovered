.class public final Lcom/sumsub/sns/internal/features/presentation/otp/o;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/otp/q;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/otp/q;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/o;->b:Lcom/sumsub/sns/internal/features/presentation/otp/q;

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/otp/o;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/o;->b:Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/otp/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/q;Lkotlin/coroutines/Continuation;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/otp/o;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/o;->b:Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/otp/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/q;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/otp/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/o;->a:I

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    throw p1

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 27
    move-result-wide v3

    .line 28
    .line 29
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/o;->b:Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 30
    .line 31
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/otp/q;->d:[Lkotlin/reflect/KProperty;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/otp/q;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 34
    .line 35
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/otp/q;->d:[Lkotlin/reflect/KProperty;

    .line 36
    const/4 v5, 0x0

    .line 37
    .line 38
    aget-object v6, v1, v5

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    check-cast p1, Ljava/lang/Number;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 48
    move-result-wide v6

    .line 49
    .line 50
    cmp-long p1, v3, v6

    .line 51
    const/4 v3, 0x0

    .line 52
    .line 53
    if-gez p1, :cond_3

    .line 54
    .line 55
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/o;->b:Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 56
    .line 57
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/otp/p;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/otp/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/q;Lkotlin/coroutines/Continuation;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v5, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 64
    .line 65
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/otp/o;->a:I

    .line 66
    .line 67
    const-wide/16 v3, 0x3e8

    .line 68
    .line 69
    .line 70
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    if-ne p1, v0, :cond_2

    .line 74
    return-object v0

    .line 75
    .line 76
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/o;->b:Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 77
    .line 78
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/otp/p;

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/otp/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/q;Lkotlin/coroutines/Continuation;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v5, v0, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 85
    .line 86
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/o;->b:Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 87
    .line 88
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/otp/q;->e()Ljava/lang/String;

    .line 92
    move-result-object v7

    .line 93
    const/4 v10, 0x4

    .line 94
    const/4 v11, 0x0

    .line 95
    .line 96
    .line 97
    const-string/jumbo v8, "stopResendTimer"

    .line 98
    const/4 v9, 0x0

    .line 99
    .line 100
    .line 101
    invoke-static/range {v6 .. v11}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 102
    .line 103
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/otp/q;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 104
    .line 105
    aget-object v1, v1, v5

    .line 106
    .line 107
    const-wide/16 v4, 0x0

    .line 108
    .line 109
    .line 110
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 114
    .line 115
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 119
    .line 120
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/otp/q;->b:Lkotlinx/coroutines/x1;

    .line 121
    .line 122
    if-eqz v0, :cond_4

    .line 123
    .line 124
    .line 125
    invoke-static {v0, v3, v2, v3}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 126
    .line 127
    :cond_4
    iput-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/otp/q;->b:Lkotlinx/coroutines/x1;

    .line 128
    .line 129
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 130
    return-object p1
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
