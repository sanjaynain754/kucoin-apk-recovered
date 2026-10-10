.class public final Lcom/sumsub/sns/internal/features/presentation/esign/O;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Lcom/sumsub/sns/internal/features/presentation/esign/o;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/sumsub/sns/internal/features/presentation/esign/n0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->f:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/O;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->f:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/O;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->e:Ljava/lang/Object;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/O;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->f:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/esign/O;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->e:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/esign/O;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->d:I

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

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
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->c:Lcom/sumsub/sns/internal/features/presentation/esign/o;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    throw p1

    .line 43
    .line 44
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    .line 47
    .line 48
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 51
    .line 52
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    goto :goto_1

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->e:Ljava/lang/Object;

    .line 64
    move-object v5, p1

    .line 65
    .line 66
    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 67
    .line 68
    iget-object p1, v5, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a:Lcom/sumsub/sns/internal/features/presentation/esign/p;

    .line 69
    .line 70
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    move-object v1, p1

    .line 74
    .line 75
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    move-object v1, v2

    .line 78
    .line 79
    :goto_0
    if-eqz v1, :cond_6

    .line 80
    .line 81
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->f:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 82
    .line 83
    sget-object v6, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 84
    .line 85
    const-string v6, "esign"

    .line 86
    .line 87
    .line 88
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 89
    move-result-object v6

    .line 90
    .line 91
    .line 92
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 93
    move-result-object v6

    .line 94
    .line 95
    .line 96
    const-string/jumbo v7, "sns_confirmation_result_%s_failure_title"

    .line 97
    .line 98
    .line 99
    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 100
    move-result-object v6

    .line 101
    .line 102
    iput-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->e:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->a:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->b:Ljava/lang/Object;

    .line 107
    .line 108
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->d:I

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v6, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    if-ne p1, v0, :cond_4

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    move-object v4, v5

    .line 117
    .line 118
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 119
    .line 120
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->f:Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 121
    .line 122
    iput-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->e:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->a:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->b:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->c:Lcom/sumsub/sns/internal/features/presentation/esign/o;

    .line 129
    .line 130
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/esign/O;->d:I

    .line 131
    .line 132
    .line 133
    const-string/jumbo v3, "sns_alert_action_dismiss"

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, v3, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 137
    move-result-object v3

    .line 138
    .line 139
    if-ne v3, v0, :cond_5

    .line 140
    :goto_2
    return-object v0

    .line 141
    :cond_5
    move-object v0, v3

    .line 142
    move-object v3, p1

    .line 143
    move-object p1, v0

    .line 144
    move-object v0, v1

    .line 145
    move-object v1, v4

    .line 146
    .line 147
    :goto_3
    check-cast p1, Ljava/lang/String;

    .line 148
    .line 149
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/esign/n;

    .line 150
    const/4 v5, 0x0

    .line 151
    .line 152
    .line 153
    invoke-direct {v4, v2, v3, v5, p1}, Lcom/sumsub/sns/internal/features/presentation/esign/n;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/esign/o;

    .line 159
    .line 160
    .line 161
    invoke-direct {p1, v4}, Lcom/sumsub/sns/internal/features/presentation/esign/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/esign/n;)V

    .line 162
    move-object v5, v1

    .line 163
    :cond_6
    move-object v6, p1

    .line 164
    const/4 v9, 0x0

    .line 165
    .line 166
    const/16 v10, 0x1e

    .line 167
    const/4 v7, 0x0

    .line 168
    const/4 v8, 0x0

    .line 169
    .line 170
    .line 171
    invoke-static/range {v5 .. v10}, Lcom/sumsub/sns/internal/features/presentation/esign/x;->a(Lcom/sumsub/sns/internal/features/presentation/esign/x;Lcom/sumsub/sns/internal/features/presentation/esign/p;ZLcom/sumsub/sns/internal/features/presentation/esign/j;ZI)Lcom/sumsub/sns/internal/features/presentation/esign/x;

    .line 172
    move-result-object p1

    .line 173
    return-object p1
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
