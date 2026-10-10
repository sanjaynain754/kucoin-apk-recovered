.class public final Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/CharSequence;

.field public b:Ljava/lang/CharSequence;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->e:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->e:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->d:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->e:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->d:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->c:I

    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    .line 11
    if-eqz v1, :cond_3

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->b:Ljava/lang/CharSequence;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->a:Ljava/lang/CharSequence;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    move-object v4, v0

    .line 30
    move-object v0, v2

    .line 31
    :goto_0
    move-object v3, v1

    .line 32
    goto :goto_4

    .line 33
    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    throw p1

    .line 41
    .line 42
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->a:Ljava/lang/CharSequence;

    .line 43
    .line 44
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    goto :goto_2

    .line 51
    .line 52
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    goto :goto_1

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->d:Ljava/lang/Object;

    .line 64
    move-object v1, p1

    .line 65
    .line 66
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;

    .line 67
    .line 68
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->e:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;

    .line 69
    .line 70
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->d:Ljava/lang/Object;

    .line 71
    .line 72
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->c:I

    .line 73
    .line 74
    .line 75
    const-string/jumbo v4, "sns_step_APPLICANT_DATA_title"

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v4, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    if-ne p1, v0, :cond_4

    .line 82
    goto :goto_3

    .line 83
    .line 84
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/CharSequence;

    .line 85
    .line 86
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->e:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;

    .line 87
    .line 88
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->d:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->a:Ljava/lang/CharSequence;

    .line 91
    .line 92
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->c:I

    .line 93
    .line 94
    .line 95
    const-string/jumbo v3, "sns_step_APPLICANT_DATA_prompt"

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v3, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 99
    move-result-object v3

    .line 100
    .line 101
    if-ne v3, v0, :cond_5

    .line 102
    goto :goto_3

    .line 103
    :cond_5
    move-object v8, v1

    .line 104
    move-object v1, p1

    .line 105
    move-object p1, v3

    .line 106
    move-object v3, v8

    .line 107
    .line 108
    :goto_2
    check-cast p1, Ljava/lang/CharSequence;

    .line 109
    .line 110
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->e:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/A;

    .line 111
    .line 112
    iput-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->d:Ljava/lang/Object;

    .line 113
    .line 114
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->a:Ljava/lang/CharSequence;

    .line 115
    .line 116
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->b:Ljava/lang/CharSequence;

    .line 117
    .line 118
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/r;->c:I

    .line 119
    .line 120
    .line 121
    const-string/jumbo v2, "sns_data_action_submit"

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v2, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 125
    move-result-object v2

    .line 126
    .line 127
    if-ne v2, v0, :cond_6

    .line 128
    :goto_3
    return-object v0

    .line 129
    :cond_6
    move-object v4, p1

    .line 130
    move-object p1, v2

    .line 131
    move-object v0, v3

    .line 132
    goto :goto_0

    .line 133
    :goto_4
    move-object v5, p1

    .line 134
    .line 135
    check-cast v5, Ljava/lang/CharSequence;

    .line 136
    const/4 v6, 0x0

    .line 137
    .line 138
    const/16 v7, 0x23

    .line 139
    const/4 v1, 0x0

    .line 140
    const/4 v2, 0x0

    .line 141
    .line 142
    .line 143
    invoke-static/range {v0 .. v7}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;->a(Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZI)Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/l;

    .line 144
    move-result-object p1

    .line 145
    return-object p1
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
