.class public final Lcom/sumsub/sns/internal/features/presentation/status/E;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Lcom/sumsub/sns/internal/features/presentation/status/L;

.field public b:Landroid/text/SpannableStringBuilder;

.field public c:I

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/status/L;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->d:Lcom/sumsub/sns/internal/features/presentation/status/L;

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/status/E;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->d:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/status/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/status/E;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->d:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/status/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/status/E;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->c:I

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->b:Landroid/text/SpannableStringBuilder;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->a:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 22
    goto :goto_2

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
    goto :goto_0

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 38
    .line 39
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->d:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 40
    .line 41
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->c:I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    if-ne p1, v0, :cond_3

    .line 48
    goto :goto_1

    .line 49
    .line 50
    :cond_3
    :goto_0
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 51
    .line 52
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->b:Ljava/util/List;

    .line 53
    const/4 v1, 0x0

    .line 54
    .line 55
    if-eqz p1, :cond_8

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 59
    move-result v3

    .line 60
    .line 61
    if-eqz v3, :cond_4

    .line 62
    goto :goto_3

    .line 63
    .line 64
    :cond_4
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->d:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 65
    .line 66
    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/status/L;->g:Lcom/sumsub/sns/internal/features/presentation/utils/e;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 70
    move-result-object v5

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v5, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/e;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/util/List;)Landroid/text/SpannableStringBuilder;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->d:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 77
    .line 78
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/presentation/status/L;->g:Lcom/sumsub/sns/internal/features/presentation/utils/e;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 82
    move-result-object v4

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    if-eqz v4, :cond_5

    .line 88
    .line 89
    iget-object v1, v4, Lcom/sumsub/sns/internal/features/data/model/common/h;->u:Ljava/util/Map;

    .line 90
    .line 91
    const-string v4, "agreements.modalAgreeButtonLabel"

    .line 92
    .line 93
    .line 94
    invoke-static {v4, v1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    :cond_5
    if-nez v1, :cond_7

    .line 98
    .line 99
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->d:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 100
    .line 101
    iput-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->a:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 102
    .line 103
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->b:Landroid/text/SpannableStringBuilder;

    .line 104
    .line 105
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->c:I

    .line 106
    .line 107
    .line 108
    const-string/jumbo v2, "sns_agreement_action_continue"

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v2, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 112
    move-result-object v1

    .line 113
    .line 114
    if-ne v1, v0, :cond_6

    .line 115
    :goto_1
    return-object v0

    .line 116
    :cond_6
    move-object v0, p1

    .line 117
    move-object p1, v1

    .line 118
    move-object v1, v3

    .line 119
    .line 120
    :goto_2
    check-cast p1, Ljava/lang/String;

    .line 121
    move-object v3, v1

    .line 122
    move-object v1, p1

    .line 123
    move-object p1, v0

    .line 124
    .line 125
    :cond_7
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/q;

    .line 126
    .line 127
    .line 128
    invoke-direct {v0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/status/q;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 129
    .line 130
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/status/L;->o:[Lkotlin/reflect/KProperty;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 134
    .line 135
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 136
    return-object p1

    .line 137
    .line 138
    :cond_8
    :goto_3
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 139
    .line 140
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 141
    .line 142
    const-string v0, "SNSApplicantStatusViewModel"

    .line 143
    .line 144
    .line 145
    const-string/jumbo v2, "showAgreementBottomSheet: no agreements, proceed to next step"

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v0, v2, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/E;->d:Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 151
    .line 152
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/status/L;->o:[Lkotlin/reflect/KProperty;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/status/L;->f()V

    .line 156
    .line 157
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 158
    return-object p1
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
