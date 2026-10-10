.class public final Lcom/sumsub/sns/internal/features/presentation/verification/j0;
.super Lcom/sumsub/sns/core/presentation/base/M0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic t:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

.field public final b:Z

.field public final c:Lcom/sumsub/sns/internal/features/domain/e;

.field public final d:Lcom/sumsub/sns/internal/features/domain/Q;

.field public final e:Lcom/sumsub/sns/internal/features/presentation/verification/d;

.field public final f:Lcom/sumsub/sns/internal/features/domain/b;

.field public final g:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final h:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

.field public final i:Lcom/sumsub/sns/internal/features/domain/C;

.field public final j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public n:Z

.field public o:Z

.field public final p:Lkotlinx/coroutines/flow/n;

.field public q:Z

.field public final r:Lkotlinx/coroutines/flow/n;

.field public final s:Lkotlinx/coroutines/flow/w;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "step"

    .line 6
    .line 7
    const-string v2, "getStep()Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    const-string v2, "currentError"

    .line 15
    .line 16
    const-string v4, "getCurrentError()Ljava/lang/CharSequence;"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    const-string/jumbo v4, "verifyCodeStepData"

    .line 24
    .line 25
    const-string v5, "getVerifyCodeStepData()Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$VerifyCodeStepData;"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    const-string v5, "codeResponse"

    .line 32
    .line 33
    const-string v6, "getCodeResponse()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/RequestCodeResponse;"

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 37
    move-result-object v0

    .line 38
    const/4 v5, 0x4

    .line 39
    .line 40
    new-array v5, v5, [Lkotlin/reflect/KProperty;

    .line 41
    .line 42
    aput-object v1, v5, v3

    .line 43
    const/4 v1, 0x1

    .line 44
    .line 45
    aput-object v2, v5, v1

    .line 46
    const/4 v1, 0x2

    .line 47
    .line 48
    aput-object v4, v5, v1

    .line 49
    const/4 v1, 0x3

    .line 50
    .line 51
    aput-object v0, v5, v1

    .line 52
    .line 53
    sput-object v5, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->t:[Lkotlin/reflect/KProperty;

    .line 54
    return-void
    .line 55
    .line 56
    .line 57
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;ZLcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/Q;Lcom/sumsub/sns/internal/features/presentation/verification/d;Lcom/sumsub/sns/internal/features/domain/b;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/core/domain/d;Lcom/sumsub/sns/internal/features/domain/C;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p7, p8}, Lcom/sumsub/sns/core/presentation/base/M0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 6
    .line 7
    iput-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->b:Z

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->c:Lcom/sumsub/sns/internal/features/domain/e;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->d:Lcom/sumsub/sns/internal/features/domain/Q;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->e:Lcom/sumsub/sns/internal/features/presentation/verification/d;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->f:Lcom/sumsub/sns/internal/features/domain/b;

    .line 16
    .line 17
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->g:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 18
    .line 19
    iput-object p10, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->h:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 20
    .line 21
    iput-object p11, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->i:Lcom/sumsub/sns/internal/features/domain/C;

    .line 22
    .line 23
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 24
    .line 25
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;->INIT:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;

    .line 26
    .line 27
    .line 28
    const-string/jumbo p3, "sns_verification_step"

    .line 29
    const/4 p4, 0x0

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, p9, p3, p2, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 33
    .line 34
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 35
    .line 36
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 37
    .line 38
    .line 39
    const-string/jumbo p5, "sns_verification_error"

    .line 40
    const/4 p6, 0x0

    .line 41
    .line 42
    .line 43
    invoke-direct {p1, p9, p5, p6, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 44
    .line 45
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 46
    .line 47
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 48
    .line 49
    .line 50
    const-string/jumbo p7, "sns_verification_code_step_data"

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, p9, p7, p6, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 54
    .line 55
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 56
    .line 57
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 58
    .line 59
    .line 60
    const-string/jumbo p8, "sns_verification_response"

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, p9, p8, p6, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 64
    .line 65
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 66
    .line 67
    .line 68
    invoke-static {p6}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->p:Lkotlinx/coroutines/flow/n;

    .line 72
    .line 73
    .line 74
    invoke-static {p6}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->r:Lkotlinx/coroutines/flow/n;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p9, p3, p2}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    .line 84
    invoke-virtual {p9, p5, p6}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 85
    move-result-object p2

    .line 86
    .line 87
    .line 88
    invoke-virtual {p9, p7, p6}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 89
    move-result-object p3

    .line 90
    .line 91
    .line 92
    invoke-virtual {p9, p8, p6}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 93
    move-result-object p4

    .line 94
    .line 95
    new-instance p5, Lcom/sumsub/sns/internal/features/presentation/verification/h0;

    .line 96
    .line 97
    .line 98
    invoke-direct {p5, p0, p6}, Lcom/sumsub/sns/internal/features/presentation/verification/h0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/Continuation;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p1, p2, p3, p4, p5}, Lkotlinx/coroutines/flow/g;->o(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/e;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/verification/e0;

    .line 105
    .line 106
    .line 107
    invoke-direct {p2, p6}, Lcom/sumsub/sns/internal/features/presentation/verification/e0;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1, p2}, Lkotlinx/coroutines/flow/g;->n0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/verification/i0;

    .line 114
    .line 115
    .line 116
    invoke-direct {p2, p0, p6}, Lcom/sumsub/sns/internal/features/presentation/verification/i0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/Continuation;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p1, p2}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    .line 123
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 124
    move-result-object p2

    .line 125
    .line 126
    sget-object p3, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 127
    const/4 p8, 0x3

    .line 128
    const/4 p9, 0x0

    .line 129
    .line 130
    const-wide/16 p4, 0x0

    .line 131
    .line 132
    const-wide/16 p6, 0x0

    .line 133
    .line 134
    .line 135
    invoke-static/range {p3 .. p9}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    .line 136
    move-result-object p3

    .line 137
    .line 138
    sget-object p4, Lcom/sumsub/sns/internal/features/presentation/verification/z;->a:Lcom/sumsub/sns/internal/features/presentation/verification/z;

    .line 139
    .line 140
    .line 141
    invoke-static {p1, p2, p3, p4}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->s:Lkotlinx/coroutines/flow/w;

    .line 145
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 8
    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/verification/Y;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->f:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->f:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/verification/Y;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 9
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->f:I

    const-string v6, ""

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v5, :cond_5

    if-eq v5, v10, :cond_4

    if-eq v5, v9, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->c:Ljava/lang/String;

    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, v0

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->c:Ljava/lang/String;

    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, v0

    goto/16 :goto_5

    :cond_3
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 10
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;->d:Ljava/lang/String;

    .line 11
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->EMAIL:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 12
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;

    iput v10, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->f:I

    const-string/jumbo v2, "sns_confirmation_code_email_title"

    invoke-virtual {v0, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    goto/16 :goto_7

    :cond_6
    :goto_1
    check-cast v2, Ljava/lang/String;

    :goto_2
    move-object/from16 v18, v2

    move-object v2, v1

    move-object/from16 v1, v18

    goto :goto_4

    .line 13
    :cond_7
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;

    iput v9, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->f:I

    const-string/jumbo v2, "sns_confirmation_code_phone_title"

    invoke-virtual {v0, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_8

    goto :goto_7

    .line 14
    :cond_8
    :goto_3
    check-cast v2, Ljava/lang/String;

    goto :goto_2

    .line 15
    :goto_4
    iget-object v5, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;->c:Ljava/lang/String;

    if-nez v5, :cond_9

    move-object v5, v6

    .line 16
    :cond_9
    iget-object v9, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;->d:Ljava/lang/String;

    .line 17
    sget-object v10, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->EMAIL:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    invoke-virtual {v10}, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->getType()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    .line 18
    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->b:Ljava/lang/String;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->c:Ljava/lang/String;

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->f:I

    const-string/jumbo v7, "sns_confirmation_code_email_subtitle"

    invoke-virtual {v0, v7, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_a

    goto :goto_7

    :cond_a
    move-object v3, v2

    move-object v9, v5

    move-object v2, v0

    .line 19
    :goto_5
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x4

    const/4 v12, 0x0

    .line 20
    const-string/jumbo v8, "{email}"

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_6
    move-object v12, v0

    move-object v11, v1

    move-object v14, v9

    goto :goto_9

    .line 21
    :cond_b
    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->b:Ljava/lang/String;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->c:Ljava/lang/String;

    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/Y;->f:I

    const-string/jumbo v7, "sns_confirmation_code_phone_subtitle"

    invoke-virtual {v0, v7, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_c

    :goto_7
    return-object v4

    :cond_c
    move-object v3, v2

    move-object v9, v5

    move-object v2, v0

    .line 22
    :goto_8
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x4

    const/4 v12, 0x0

    .line 23
    const-string/jumbo v8, "{phone}"

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    .line 24
    :goto_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 25
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 26
    iget-object v4, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;->i:Ljava/lang/Long;

    if-eqz v4, :cond_d

    .line 27
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_a

    :cond_d
    const-wide/16 v4, 0x3c

    :goto_a
    invoke-virtual {v2, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    add-long v16, v4, v0

    .line 28
    iget-object v0, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;->h:Ljava/lang/Integer;

    if-eqz v0, :cond_e

    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_b

    :cond_e
    const/4 v0, 0x6

    .line 30
    :goto_b
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;->a:Ljava/lang/String;

    if-nez v1, :cond_f

    move-object v15, v6

    goto :goto_c

    :cond_f
    move-object v15, v1

    .line 31
    :goto_c
    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/verification/x;

    .line 32
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v13

    .line 33
    invoke-direct/range {v10 .. v17}, Lcom/sumsub/sns/internal/features/presentation/verification/x;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;J)V

    return-object v10
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/verification/x;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p5, Lcom/sumsub/sns/internal/features/presentation/verification/S;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/S;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/S;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/S;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/S;

    invoke-direct {v0, p0, p5}, Lcom/sumsub/sns/internal/features/presentation/verification/S;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p5, v0, Lcom/sumsub/sns/internal/features/presentation/verification/S;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/S;->c:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p5

    :cond_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p5

    :cond_4
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    sget-object p5, Lcom/sumsub/sns/internal/features/presentation/verification/F;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p5, p1

    if-eq p1, v5, :cond_9

    if-eq p1, v4, :cond_7

    if-ne p1, v3, :cond_6

    .line 4
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/S;->c:I

    invoke-virtual {p0, p4, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    invoke-static {p5}, Lkotlinx/coroutines/flow/g;->M(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;

    move-result-object p0

    return-object p0

    .line 5
    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 6
    :cond_7
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/verification/S;->c:I

    invoke-virtual {p0, p3, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/presentation/verification/x;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_8

    goto :goto_2

    :cond_8
    return-object p0

    .line 7
    :cond_9
    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/verification/S;->c:I

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Ljava/lang/CharSequence;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_a

    :goto_2
    return-object v1

    :cond_a
    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/j0;ZLjava/lang/Long;ZLjava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 34
    instance-of v0, p5, Lcom/sumsub/sns/internal/features/presentation/verification/a0;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;

    invoke-direct {v0, p0, p5}, Lcom/sumsub/sns/internal/features/presentation/verification/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p5, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 35
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->b:I

    iget-boolean p3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->a:Z

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget p0, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->b:I

    iget-boolean p3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->a:Z

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-eqz p1, :cond_4

    if-eqz p2, :cond_5

    :cond_4
    if-nez p3, :cond_5

    move p1, v4

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    if-eqz p2, :cond_7

    if-nez p3, :cond_7

    .line 36
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p4

    iput-boolean p3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->a:Z

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->b:I

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->e:I

    invoke-virtual {p0, p4, p5, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_6

    goto :goto_3

    :cond_6
    move p0, p1

    :goto_2
    check-cast p5, Ljava/lang/String;

    goto :goto_5

    .line 37
    :cond_7
    iput-boolean p3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->a:Z

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->b:I

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/a0;->e:I

    invoke-virtual {p0, p4, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    move p0, p1

    .line 38
    :goto_4
    check-cast p5, Ljava/lang/String;

    :goto_5
    if-nez p5, :cond_9

    .line 39
    const-string p5, ""

    :cond_9
    if-eqz p3, :cond_a

    .line 40
    sget-object p0, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;->ENTER_OTP:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    goto :goto_6

    :cond_a
    if-nez p0, :cond_b

    .line 41
    sget-object p0, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;->RESEND_CODE:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    goto :goto_6

    :cond_b
    const/4 p0, 0x0

    .line 42
    :goto_6
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/verification/y;

    invoke-direct {p1, p5, p0}, Lcom/sumsub/sns/internal/features/presentation/verification/y;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;)V

    return-object p1
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/verification/x;Ljava/lang/Long;)Z
    .locals 5

    const/4 p0, 0x0

    if-nez p2, :cond_0

    return p0

    :cond_0
    if-nez p1, :cond_1

    return p0

    :cond_1
    const/4 v0, 0x1

    if-eqz p3, :cond_2

    .line 121
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p3, v1, v3

    if-lez p3, :cond_2

    move p3, v0

    goto :goto_0

    :cond_2
    move p3, p0

    .line 122
    :goto_0
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/presentation/verification/x;->d:Ljava/lang/String;

    .line 123
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p3, :cond_3

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return p0
.end method


# virtual methods
.method public final a(JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/verification/c0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/c0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/c0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/c0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/c0;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/verification/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/c0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 147
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/c0;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-ne v2, v3, :cond_2

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/c0;->a:Ljava/lang/String;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :cond_1
    move-object v4, p1

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 148
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/k;->a(J)Ljava/lang/String;

    move-result-object p1

    .line 149
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/c0;->a:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/c0;->d:I

    const-string/jumbo p2, "sns_confirmation_code_resendCountdown"

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_1

    return-object v1

    .line 150
    :goto_1
    move-object v2, p3

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_4

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 151
    const-string/jumbo v3, "{time}"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/CharSequence;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v2, p0

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    instance-of v3, v1, Lcom/sumsub/sns/internal/features/presentation/verification/H;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->h:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->h:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;

    invoke-direct {v3, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/H;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->f:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 59
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->h:I

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v5, :cond_6

    if-eq v5, v12, :cond_5

    if-eq v5, v10, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->e:I

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->c:Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->a:Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->e:I

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->b:Ljava/lang/String;

    iget-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->a:Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v1

    move v1, v0

    move-object v0, v7

    move-object/from16 v7, v16

    goto/16 :goto_8

    :cond_3
    iget v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->e:I

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->d:Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->c:Ljava/lang/CharSequence;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->a:Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_4
    iget v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->e:I

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->c:Ljava/lang/CharSequence;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->b:Ljava/lang/String;

    iget-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->a:Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_5
    iget v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->e:I

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->b:Ljava/lang/String;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->a:Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v1

    move v1, v0

    move-object v0, v6

    move-object/from16 v6, v16

    goto :goto_4

    :cond_6
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->c()Ljava/lang/String;

    move-result-object v5

    .line 61
    invoke-virtual/range {p1 .. p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object v1

    .line 62
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/n;->a:Ljava/util/List;

    .line 63
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 64
    iget-object v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 65
    iget-object v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    const-string v15, "EMAIL_VERIFICATION"

    invoke-static {v14, v15, v11, v10, v9}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    goto :goto_1

    :cond_8
    move-object v13, v9

    .line 66
    :goto_1
    check-cast v13, Lcom/sumsub/sns/internal/features/data/model/common/m;

    if-eqz v5, :cond_a

    .line 67
    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/2addr v1, v12

    if-ne v1, v12, :cond_a

    if-eqz v13, :cond_9

    .line 68
    iget-object v1, v13, Lcom/sumsub/sns/internal/features/data/model/common/m;->p:Ljava/lang/Boolean;

    .line 69
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    goto :goto_2

    :cond_9
    move v1, v11

    :goto_2
    if-eqz v1, :cond_a

    move v1, v12

    goto :goto_3

    :cond_a
    move v1, v11

    :goto_3
    if-eqz v1, :cond_e

    .line 70
    iput-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->a:Ljava/lang/CharSequence;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->b:Ljava/lang/String;

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->e:I

    iput v12, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->h:I

    const-string/jumbo v6, "sns_confirmation_contact_emailLocked_title"

    invoke-virtual {v2, v6, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_b

    goto/16 :goto_9

    .line 71
    :cond_b
    :goto_4
    check-cast v6, Ljava/lang/CharSequence;

    .line 72
    iput-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->a:Ljava/lang/CharSequence;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->b:Ljava/lang/String;

    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->c:Ljava/lang/CharSequence;

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->e:I

    iput v10, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->h:I

    const-string/jumbo v7, "sns_confirmation_contact_emailLocked_subtitle"

    invoke-virtual {v2, v7, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_c

    goto :goto_9

    :cond_c
    move-object/from16 v16, v7

    move-object v7, v0

    move v0, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v6

    move-object v6, v5

    move-object/from16 v5, v16

    .line 73
    :goto_5
    check-cast v1, Ljava/lang/CharSequence;

    .line 74
    iput-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->a:Ljava/lang/CharSequence;

    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->b:Ljava/lang/String;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->c:Ljava/lang/CharSequence;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->d:Ljava/lang/CharSequence;

    iput v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->e:I

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->h:I

    const-string/jumbo v8, "sns_confirmation_contact_emailLocked_footer"

    invoke-virtual {v2, v8, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_d

    goto :goto_9

    :cond_d
    move-object v4, v1

    move-object v1, v3

    move-object v3, v7

    :goto_6
    move-object v9, v1

    check-cast v9, Ljava/lang/CharSequence;

    move-object v7, v5

    move-object v5, v4

    move-object v4, v7

    :goto_7
    move-object v7, v9

    goto :goto_b

    .line 75
    :cond_e
    iput-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->a:Ljava/lang/CharSequence;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->b:Ljava/lang/String;

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->e:I

    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->h:I

    const-string/jumbo v7, "sns_confirmation_contact_email_title"

    invoke-virtual {v2, v7, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_f

    goto :goto_9

    .line 76
    :cond_f
    :goto_8
    check-cast v7, Ljava/lang/CharSequence;

    .line 77
    iput-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->a:Ljava/lang/CharSequence;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->b:Ljava/lang/String;

    iput-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->c:Ljava/lang/CharSequence;

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->e:I

    iput v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/H;->h:I

    const-string/jumbo v6, "sns_confirmation_contact_email_subtitle"

    invoke-virtual {v2, v6, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_10

    :goto_9
    return-object v4

    :cond_10
    move-object v4, v3

    move-object v3, v0

    move v0, v1

    move-object v1, v4

    move-object v4, v7

    .line 78
    :goto_a
    check-cast v1, Ljava/lang/CharSequence;

    move-object v6, v5

    move-object v5, v1

    goto :goto_7

    .line 79
    :goto_b
    iget-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->p:Lkotlinx/coroutines/flow/n;

    move v1, v0

    .line 80
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/G;

    if-eqz v1, :cond_11

    move v8, v12

    goto :goto_c

    :cond_11
    move v8, v11

    :goto_c
    const/4 v1, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/sumsub/sns/internal/features/presentation/verification/G;-><init>(Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/verification/j0;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Z)V

    invoke-static {v9, v0}, Lkotlinx/coroutines/flow/g;->n0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/verification/T;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->e:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->e:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/verification/T;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 90
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->e:I

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v5, :cond_6

    if-eq v5, v10, :cond_5

    if-eq v5, v9, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->a:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_5
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 91
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "buildStatusState "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    if-nez v1, :cond_7

    .line 92
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/z;->a:Lcom/sumsub/sns/internal/features/presentation/verification/z;

    return-object v1

    .line 93
    :cond_7
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;->f:Ljava/lang/String;

    .line 94
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Status;->VERIFIED:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Status;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Status;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string/jumbo v2, "phone"

    const-string v5, "email"

    if-eqz v1, :cond_b

    .line 95
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->EMAIL:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    const-string/jumbo v7, "sns_confirmation_result_%s_success_title"

    if-ne v1, v6, :cond_9

    .line 96
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 97
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v1

    .line 98
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 99
    iput v10, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->e:I

    invoke-virtual {v0, v1, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_8

    goto/16 :goto_7

    :cond_8
    :goto_1
    check-cast v2, Ljava/lang/String;

    goto :goto_3

    .line 100
    :cond_9
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 101
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v1

    .line 102
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 103
    iput v9, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->e:I

    invoke-virtual {v0, v1, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_a

    goto :goto_7

    .line 104
    :cond_a
    :goto_2
    check-cast v2, Ljava/lang/String;

    .line 105
    :goto_3
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->SUCCESS:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    move-result-object v1

    .line 106
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification/A;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, v2, v1, v4, v5}, Lcom/sumsub/sns/internal/features/presentation/verification/A;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Z)V

    return-object v3

    .line 107
    :cond_b
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    sget-object v9, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->EMAIL:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    const-string/jumbo v11, "sns_confirmation_result_%s_failure_title"

    if-ne v1, v9, :cond_d

    .line 108
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 109
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v1

    .line 110
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 111
    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->e:I

    invoke-virtual {v0, v1, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_c

    goto :goto_7

    :cond_c
    :goto_4
    check-cast v2, Ljava/lang/String;

    goto :goto_6

    .line 112
    :cond_d
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 113
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v1

    .line 114
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 115
    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->e:I

    invoke-virtual {v0, v1, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_e

    goto :goto_7

    .line 116
    :cond_e
    :goto_5
    check-cast v2, Ljava/lang/String;

    .line 117
    :goto_6
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->FAILURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    move-result-object v1

    .line 118
    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->a:Ljava/lang/String;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->b:Ljava/lang/String;

    iput v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/T;->e:I

    const-string/jumbo v5, "sns_confirmation_result_action_tryAgain"

    invoke-virtual {v0, v5, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_f

    :goto_7
    return-object v4

    :cond_f
    move-object/from16 v17, v3

    move-object v3, v2

    move-object/from16 v2, v17

    .line 119
    :goto_8
    check-cast v2, Ljava/lang/CharSequence;

    .line 120
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification/A;

    invoke-direct {v4, v3, v1, v2, v10}, Lcom/sumsub/sns/internal/features/presentation/verification/A;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Z)V

    return-object v4
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification/x;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/verification/X;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/X;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/X;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/X;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/X;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/verification/X;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/X;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 81
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/X;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/X;->a:Lcom/sumsub/sns/internal/features/presentation/verification/x;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "buildVerifyCodeState "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    if-nez p1, :cond_3

    .line 83
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/verification/z;->a:Lcom/sumsub/sns/internal/features/presentation/verification/z;

    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->M(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;

    move-result-object p1

    return-object p1

    .line 84
    :cond_3
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/X;->a:Lcom/sumsub/sns/internal/features/presentation/verification/x;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/X;->d:I

    const-string/jumbo p2, "sns_confirmation_code_action_resend"

    invoke-virtual {p0, p2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    .line 85
    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/String;

    .line 86
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->e:Lcom/sumsub/sns/internal/features/presentation/verification/d;

    .line 87
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/verification/x;->d:Ljava/lang/String;

    .line 88
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/d;->b(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    move-result-object v0

    .line 89
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification/W;

    invoke-direct {v1, v0, p2, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification/W;-><init>(Lkotlinx/coroutines/flow/e;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/verification/x;Lcom/sumsub/sns/internal/features/presentation/verification/j0;)V

    return-object v1
.end method

.method public final a(Ljava/lang/CharSequence;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/verification/L;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/verification/L;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 49
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;->a:Ljava/lang/CharSequence;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v9, "buildInitState"

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 51
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->g:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;->a:Ljava/lang/CharSequence;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;->d:I

    .line 52
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p2, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    .line 53
    :cond_5
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 54
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/verification/F;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v7, v2

    const/4 v7, 0x0

    if-eq v2, v6, :cond_8

    if-ne v2, v5, :cond_7

    .line 55
    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;->a:Ljava/lang/CharSequence;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;->d:I

    invoke-virtual {p0, p2, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->b(Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/CharSequence;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    return-object p1

    .line 56
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 57
    :cond_8
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 58
    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;->a:Ljava/lang/CharSequence;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/verification/L;->d:I

    invoke-virtual {p0, p2, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/CharSequence;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    :goto_2
    return-object v1

    :cond_9
    :goto_3
    check-cast p2, Lkotlinx/coroutines/flow/e;

    return-object p2
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;)V
    .locals 3

    .line 43
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->t:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 44
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 45
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;)V
    .locals 9

    .line 124
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/F;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1

    if-ne v0, v2, :cond_0

    .line 125
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->t:[Lkotlin/reflect/KProperty;

    aget-object v4, v3, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/x;

    if-eqz v0, :cond_8

    .line 126
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v2, v3, v2

    .line 127
    iget-object v2, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 128
    iget-object v3, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 129
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->e:Lcom/sumsub/sns/internal/features/presentation/verification/d;

    .line 130
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/x;->d:Ljava/lang/String;

    .line 131
    iget-wide v4, v0, Lcom/sumsub/sns/internal/features/presentation/verification/x;->f:J

    .line 132
    invoke-virtual {v2, v3, v4, v5}, Lcom/sumsub/sns/internal/features/presentation/verification/d;->a(Ljava/lang/String;J)V

    .line 133
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;->VERIFY_CODE:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;)V

    return-void

    .line 134
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 135
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/verification/F;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v4, v0

    const-string v5, "EMAIL_VERIFICATION"

    const-string v6, "PHONE_VERIFICATION"

    if-eq v0, v3, :cond_5

    if-ne v0, v2, :cond_4

    .line 136
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->r:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/u;

    if-eqz v0, :cond_8

    .line 137
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification/u;->a:Ljava/lang/String;

    if-eqz v0, :cond_8

    .line 138
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v4, v4, v7

    if-eq v4, v3, :cond_3

    if-ne v4, v2, :cond_2

    move-object v2, v6

    goto :goto_0

    .line 139
    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    move-object v2, v5

    .line 140
    :goto_0
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v6

    move-object v5, v0

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/d0;

    const/4 v3, 0x0

    move-object v4, p0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/verification/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/verification/j0;Ljava/lang/String;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, v6

    move-object v6, v0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 141
    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 142
    :cond_5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->p:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_8

    .line 143
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v4, v4, v7

    if-eq v4, v3, :cond_7

    if-ne v4, v2, :cond_6

    move-object v2, v6

    goto :goto_1

    .line 144
    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    move-object v2, v5

    .line 145
    :goto_1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v6

    move-object v5, v0

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/d0;

    const/4 v3, 0x0

    move-object v4, p0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/verification/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/verification/j0;Ljava/lang/String;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, v6

    move-object v6, v0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    :cond_8
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 3

    .line 46
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->k:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->t:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    .line 47
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 48
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 4

    .line 146
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->r:Lkotlinx/coroutines/flow/n;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification/u;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "+"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/verification/u;-><init>(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :goto_1
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/CharSequence;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    instance-of v3, p3, Lcom/sumsub/sns/internal/features/presentation/verification/N;

    if-eqz v3, :cond_0

    move-object v3, p3

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->i:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->i:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;

    invoke-direct {v3, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/verification/N;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->g:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 1
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->i:I

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    packed-switch v5, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_e

    :pswitch_1
    iget-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/CharSequence;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_2
    iget-boolean v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->f:Z

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->d:Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/domain/B;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    check-cast v6, Lcom/sumsub/sns/internal/features/domain/n;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3
    iget-boolean v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->f:Z

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/domain/B;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    check-cast v6, Lcom/sumsub/sns/internal/features/domain/n;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_4
    iget-boolean v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->f:Z

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->e:Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->d:Ljava/lang/CharSequence;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    check-cast v6, Lcom/sumsub/sns/internal/features/domain/B;

    iget-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    check-cast v7, Lcom/sumsub/sns/internal/features/domain/n;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_5
    iget-boolean v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->f:Z

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->d:Ljava/lang/CharSequence;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    check-cast v6, Lcom/sumsub/sns/internal/features/domain/B;

    iget-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    check-cast v7, Lcom/sumsub/sns/internal/features/domain/n;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v8

    move-object v8, v7

    move-object v7, v11

    goto/16 :goto_5

    :pswitch_6
    iget-boolean v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->f:Z

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/domain/B;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    check-cast v6, Lcom/sumsub/sns/internal/features/domain/n;

    iget-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_7
    iget-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/p;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v0

    move-object v0, v5

    goto :goto_3

    :pswitch_8
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/V;

    .line 3
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    sget-object v9, Lcom/sumsub/sns/internal/features/presentation/verification/F;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v9, v5

    if-eq v5, v8, :cond_2

    if-ne v5, v6, :cond_1

    .line 4
    const-string v5, "PHONE_VERIFICATION"

    goto :goto_1

    .line 5
    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 6
    :cond_2
    const-string v5, "EMAIL_VERIFICATION"

    .line 7
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lcom/sumsub/sns/internal/features/data/model/common/V;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    .line 8
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 9
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/m;->c()Z

    move-result v1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    .line 10
    :goto_2
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->c:Lcom/sumsub/sns/internal/features/domain/e;

    iput-object p1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    iput-object p2, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->i:I

    invoke-virtual {v5, v1, v3}, Lcom/sumsub/sns/internal/features/domain/e;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_4

    goto/16 :goto_d

    :cond_4
    move-object v0, p1

    move-object v9, p2

    .line 11
    :goto_3
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 12
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lcom/sumsub/sns/internal/features/domain/n;

    .line 13
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->i:Lcom/sumsub/sns/internal/features/domain/C;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, Lcom/sumsub/sns/internal/features/domain/C;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/domain/n;)Lcom/sumsub/sns/internal/features/domain/B;

    move-result-object v5

    .line 14
    iget-boolean v0, v5, Lcom/sumsub/sns/internal/features/domain/B;->b:Z

    if-eqz v0, :cond_8

    .line 15
    iput-object v9, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    iput-boolean v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->f:Z

    iput v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->i:I

    const-string/jumbo v6, "sns_confirmation_contact_phoneLocked_title"

    invoke-virtual {p0, v6, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_5

    goto/16 :goto_d

    :cond_5
    move-object v7, v6

    move-object v6, v1

    move-object v1, v7

    move-object v7, v9

    .line 16
    :goto_4
    check-cast v1, Ljava/lang/CharSequence;

    .line 17
    iput-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->d:Ljava/lang/CharSequence;

    iput-boolean v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->f:Z

    const/4 v8, 0x3

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->i:I

    const-string/jumbo v8, "sns_confirmation_contact_phoneLocked_subtitle"

    invoke-virtual {p0, v8, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_6

    goto/16 :goto_d

    :cond_6
    move-object v11, v5

    move-object v5, v1

    move-object v1, v8

    move-object v8, v6

    move-object v6, v11

    .line 18
    :goto_5
    check-cast v1, Ljava/lang/CharSequence;

    .line 19
    iput-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->d:Ljava/lang/CharSequence;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->e:Ljava/lang/CharSequence;

    iput-boolean v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->f:Z

    const/4 v9, 0x4

    iput v9, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->i:I

    const-string/jumbo v9, "sns_confirmation_contact_phoneLocked_footer"

    invoke-virtual {p0, v9, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_7

    goto/16 :goto_d

    :cond_7
    move-object v4, v1

    move-object v1, v3

    move-object v3, v7

    move-object v7, v8

    :goto_6
    check-cast v1, Ljava/lang/CharSequence;

    move-object v8, v3

    move-object v3, v5

    move-object v5, v6

    move-object v6, v1

    :goto_7
    move v9, v0

    goto :goto_a

    .line 20
    :cond_8
    iput-object v9, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    iput-boolean v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->f:Z

    const/4 v6, 0x5

    iput v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->i:I

    const-string/jumbo v6, "sns_confirmation_contact_phone_title"

    invoke-virtual {p0, v6, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_9

    goto/16 :goto_d

    :cond_9
    move-object v8, v6

    move-object v6, v1

    move-object v1, v8

    move-object v8, v9

    .line 21
    :goto_8
    check-cast v1, Ljava/lang/CharSequence;

    .line 22
    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->d:Ljava/lang/CharSequence;

    iput-boolean v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->f:Z

    const/4 v9, 0x6

    iput v9, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->i:I

    const-string/jumbo v9, "sns_confirmation_contact_phone_subtitle"

    invoke-virtual {p0, v9, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_a

    goto/16 :goto_d

    :cond_a
    move-object v4, v1

    move-object v1, v3

    move-object v3, v8

    .line 23
    :goto_9
    check-cast v1, Ljava/lang/CharSequence;

    move-object v8, v7

    move-object v7, v6

    move-object v6, v8

    move-object v8, v3

    move-object v3, v4

    move-object v4, v1

    goto :goto_7

    .line 24
    :goto_a
    iget-object v10, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->r:Lkotlinx/coroutines/flow/n;

    .line 25
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/M;

    const/4 v1, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v9}, Lcom/sumsub/sns/internal/features/presentation/verification/M;-><init>(Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/verification/j0;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/domain/B;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/domain/n;Ljava/lang/CharSequence;Z)V

    invoke-static {v10, v0}, Lkotlinx/coroutines/flow/g;->n0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object v0

    return-object v0

    :cond_b
    if-eqz v9, :cond_f

    .line 26
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Exception;

    if-eqz v1, :cond_c

    check-cast v0, Ljava/lang/Exception;

    goto :goto_b

    :cond_c
    move-object v0, v7

    :goto_b
    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    .line 27
    :cond_d
    sget-object v0, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->FAILURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    move-result-object v0

    .line 28
    iput-object v9, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    iput-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    iput-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->c:Ljava/lang/Object;

    const/4 v1, 0x7

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->i:I

    const-string/jumbo v1, "sns_confirmation_result_action_tryAgain"

    invoke-virtual {p0, v1, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_e

    goto :goto_d

    :cond_e
    move-object v3, v9

    .line 29
    :goto_c
    check-cast v1, Ljava/lang/CharSequence;

    .line 30
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification/A;

    invoke-direct {v4, v3, v0, v1, v8}, Lcom/sumsub/sns/internal/features/presentation/verification/A;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Z)V

    goto :goto_f

    .line 31
    :cond_f
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 32
    const-string/jumbo v0, "phone"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 33
    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "sns_confirmation_result_%s_failure_title"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 34
    iput-object p0, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->a:Ljava/lang/Object;

    iput-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->b:Ljava/lang/Object;

    const/16 v1, 0x8

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/N;->i:I

    invoke-virtual {p0, v0, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_10

    :goto_d
    return-object v4

    :cond_10
    move-object v0, p0

    :goto_e
    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Ljava/lang/CharSequence;)V

    .line 35
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/verification/z;->a:Lcom/sumsub/sns/internal/features/presentation/verification/z;

    .line 36
    :goto_f
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->M(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/verification/f0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/f0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/f0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/f0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/f0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/verification/f0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/f0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 37
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/f0;->d:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/f0;->a:Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 38
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkCodeResponse "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 39
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;->f:Ljava/lang/String;

    .line 40
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Status;->VERIFIED:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Status;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Status;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v6, 0x3

    if-eqz v2, :cond_5

    .line 41
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;->c:Ljava/lang/String;

    if-eqz p2, :cond_4

    .line 42
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->e:Lcom/sumsub/sns/internal/features/presentation/verification/d;

    invoke-virtual {v0, p2}, Lcom/sumsub/sns/internal/features/presentation/verification/d;->c(Ljava/lang/String;)V

    .line 43
    :cond_4
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->t:[Lkotlin/reflect/KProperty;

    aget-object v1, v0, v5

    .line 44
    iget-object v1, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 45
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, p2, v4}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v0, v0, v6

    .line 47
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 48
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v0, p2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;->STATUS:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;)V

    .line 50
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v5

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/verification/g0;

    invoke-direct {v8, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/verification/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    goto :goto_4

    .line 51
    :cond_5
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Status;->REJECTED:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Status;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Status;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 52
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->t:[Lkotlin/reflect/KProperty;

    aget-object v1, v0, v5

    .line 53
    iget-object v1, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 54
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, p2, v4}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v0, v0, v6

    .line 56
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 57
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v0, p2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;->STATUS:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;)V

    .line 59
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/verification/s;->a:Lcom/sumsub/sns/internal/features/presentation/verification/s;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    goto :goto_4

    .line 60
    :cond_6
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/verification/f0;->a:Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/f0;->d:I

    const-string/jumbo p1, "sns_confirmation_code_isNotValid"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_2

    :cond_7
    move-object p1, p0

    :goto_1
    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Ljava/lang/CharSequence;)V

    .line 61
    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/verification/f0;->a:Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/verification/f0;->d:I

    const-wide/16 p1, 0x3e8

    invoke-static {p1, p2, v0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_2
    return-object v1

    .line 62
    :cond_8
    :goto_3
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/verification/s;->a:Lcom/sumsub/sns/internal/features/presentation/verification/s;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 63
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final getDocumentType()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/F;->a:[I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v0

    .line 9
    .line 10
    aget v0, v1, v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const-string v0, "PHONE_VERIFICATION"

    .line 19
    return-object v0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 25
    throw v0

    .line 26
    .line 27
    :cond_1
    const-string v0, "EMAIL_VERIFICATION"

    .line 28
    return-object v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public final getViewState()Lkotlinx/coroutines/flow/r;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->s:Lkotlinx/coroutines/flow/w;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method

.method public final onPrepare(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->t:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v1, 0x2

    .line 6
    .line 7
    aget-object v2, v0, v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification/x;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 18
    .line 19
    aget-object v1, v0, v1

    .line 20
    .line 21
    iget-object v1, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 22
    .line 23
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->e:Lcom/sumsub/sns/internal/features/presentation/verification/d;

    .line 29
    .line 30
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification/x;->d:Ljava/lang/String;

    .line 31
    .line 32
    iget-wide v3, p1, Lcom/sumsub/sns/internal/features/presentation/verification/x;->f:J

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2, v3, v4}, Lcom/sumsub/sns/internal/features/presentation/verification/d;->a(Ljava/lang/String;J)V

    .line 36
    .line 37
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;->VERIFY_CODE:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;)V

    .line 41
    .line 42
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 43
    const/4 v1, 0x3

    .line 44
    .line 45
    aget-object v0, v0, v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification/b0;

    .line 60
    const/4 v1, 0x0

    .line 61
    .line 62
    .line 63
    invoke-direct {v3, p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/b0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;Lkotlin/coroutines/Continuation;)V

    .line 64
    const/4 v4, 0x3

    .line 65
    const/4 v5, 0x0

    .line 66
    const/4 v2, 0x0

    .line 67
    .line 68
    .line 69
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 70
    .line 71
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 72
    return-object p1
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
