.class public final Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

.field public b:Ljava/lang/CharSequence;

.field public c:I

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->d:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 3
    const/4 p1, 0x1

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
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->d:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    .line 8
    return-object v0
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
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lkotlin/coroutines/Continuation;

    .line 3
    .line 4
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->d:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    move-result-object p1

    .line 16
    return-object p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->c:I

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x4

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    if-eq v1, v6, :cond_3

    .line 16
    .line 17
    if-eq v1, v5, :cond_2

    .line 18
    .line 19
    if-eq v1, v4, :cond_1

    .line 20
    .line 21
    if-ne v1, v3, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->b:Ljava/lang/CharSequence;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    goto/16 :goto_9

    .line 31
    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    throw p1

    .line 39
    .line 40
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    goto/16 :goto_7

    .line 46
    .line 47
    .line 48
    :cond_2
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_3

    .line 52
    :catch_0
    move-exception p1

    .line 53
    goto :goto_4

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/sumsub/sns/core/data/model/SNSException$Api; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    goto :goto_0

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    :try_start_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->d:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 63
    .line 64
    iput v6, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->c:I

    .line 65
    .line 66
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    if-ne p1, v0, :cond_5

    .line 73
    .line 74
    goto/16 :goto_8

    .line 75
    .line 76
    :cond_5
    :goto_0
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 77
    .line 78
    if-eqz p1, :cond_7

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->e()Ljava/lang/String;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    if-eqz p1, :cond_7

    .line 85
    .line 86
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->d:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 87
    .line 88
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->i:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 89
    .line 90
    iput v5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->c:I

    .line 91
    .line 92
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 93
    .line 94
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 95
    .line 96
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 97
    .line 98
    .line 99
    invoke-interface {v1, p1, p0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->e(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    if-ne p1, v0, :cond_6

    .line 103
    goto :goto_8

    .line 104
    .line 105
    :cond_6
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/v0;

    .line 106
    goto :goto_2

    .line 107
    :cond_7
    move-object p1, v2

    .line 108
    .line 109
    :goto_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->d:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 110
    .line 111
    if-eqz p1, :cond_8

    .line 112
    .line 113
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/v0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;

    .line 114
    .line 115
    :cond_8
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/EKycFlowStatus;)V
    :try_end_1
    .catch Lcom/sumsub/sns/core/data/model/SNSException$Api; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    goto :goto_a

    .line 120
    .line 121
    :goto_3
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->d:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 122
    .line 123
    .line 124
    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a(Lcom/sumsub/sns/internal/features/presentation/preview/h;Ljava/lang/Throwable;)V

    .line 125
    goto :goto_a

    .line 126
    .line 127
    :goto_4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->d:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 128
    .line 129
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    .line 133
    move-result-object v2

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 137
    move-result-object v5

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v2, v5}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;

    .line 141
    .line 142
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->d:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 143
    .line 144
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 145
    .line 146
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->c:I

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getErrorCode()Ljava/lang/Integer;

    .line 150
    move-result-object v2

    .line 151
    .line 152
    if-eqz v2, :cond_a

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getDescription()Ljava/lang/String;

    .line 156
    move-result-object v2

    .line 157
    .line 158
    if-eqz v2, :cond_a

    .line 159
    .line 160
    .line 161
    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 162
    move-result v2

    .line 163
    .line 164
    if-eqz v2, :cond_9

    .line 165
    goto :goto_5

    .line 166
    .line 167
    .line 168
    :cond_9
    invoke-virtual {p1}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getDescription()Ljava/lang/String;

    .line 169
    move-result-object p1

    .line 170
    goto :goto_6

    .line 171
    .line 172
    .line 173
    :cond_a
    :goto_5
    const-string/jumbo p1, "sns_ekyc_error_common"

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, p1, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 177
    move-result-object p1

    .line 178
    .line 179
    :goto_6
    if-ne p1, v0, :cond_b

    .line 180
    goto :goto_8

    .line 181
    .line 182
    :cond_b
    :goto_7
    check-cast p1, Ljava/lang/CharSequence;

    .line 183
    .line 184
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->d:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 185
    .line 186
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->a:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 187
    .line 188
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->b:Ljava/lang/CharSequence;

    .line 189
    .line 190
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;->c:I

    .line 191
    .line 192
    .line 193
    const-string/jumbo v3, "sns_alert_action_dismiss"

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v3, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 197
    move-result-object v2

    .line 198
    .line 199
    if-ne v2, v0, :cond_c

    .line 200
    :goto_8
    return-object v0

    .line 201
    :cond_c
    move-object v0, p1

    .line 202
    move-object p1, v2

    .line 203
    .line 204
    :goto_9
    check-cast p1, Ljava/lang/CharSequence;

    .line 205
    .line 206
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/q;

    .line 207
    .line 208
    .line 209
    invoke-direct {v2, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/q;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 210
    .line 211
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v2}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 215
    .line 216
    :goto_a
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 217
    return-object p1
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
