.class public final Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->c:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 3
    .line 4
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 5
    const/4 p1, 0x2

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 9
    return-void
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->c:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, p2, v2}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;)V

    .line 10
    .line 11
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->b:Ljava/lang/Object;

    .line 12
    return-object v0
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
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;

    .line 11
    .line 12
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    .line 2
    const-string v0, "SNSQuestionnaireViewModel"

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->a:I

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v4, :cond_0

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    move-object p1, v0

    .line 21
    .line 22
    goto/16 :goto_2

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
    .line 35
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 38
    .line 39
    :try_start_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 40
    .line 41
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->a:I

    .line 42
    .line 43
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v4, p0}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    if-ne p1, v1, :cond_2

    .line 50
    return-object v1

    .line 51
    .line 52
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    move-result p1

    .line 57
    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 61
    .line 62
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->e()I

    .line 66
    move-result p1

    .line 67
    .line 68
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    .line 75
    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 78
    move-result v2

    .line 79
    .line 80
    new-instance v5, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    const-string v6, "Successfully submitted questionnaire. Current page: "

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string p1, ", total pages: "

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v0, p1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->e()I

    .line 112
    move-result p1

    .line 113
    .line 114
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->g()Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/form/f;->b:Ljava/util/List;

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 124
    move-result v1

    .line 125
    .line 126
    if-ge p1, v1, :cond_3

    .line 127
    .line 128
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->e()I

    .line 132
    move-result p1

    .line 133
    .line 134
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 135
    add-int/2addr p1, v4

    .line 136
    .line 137
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->l:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 138
    .line 139
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->w:[Lkotlin/reflect/KProperty;

    .line 140
    .line 141
    aget-object v4, v2, v4

    .line 142
    .line 143
    .line 144
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    move-result-object p1

    .line 146
    .line 147
    iget-object v4, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 148
    .line 149
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 153
    .line 154
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 155
    .line 156
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireViewModel$Step;->CHANGE_PAGE:Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireViewModel$Step;

    .line 157
    .line 158
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->j:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 159
    .line 160
    aget-object v2, v2, v3

    .line 161
    .line 162
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 163
    .line 164
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, p1, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 168
    .line 169
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 170
    .line 171
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->a:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->e()I

    .line 175
    move-result p1

    .line 176
    .line 177
    new-instance v2, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    const-string v4, "Showing next page: "

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    move-result-object p1

    .line 193
    .line 194
    .line 195
    invoke-static {v1, v0, p1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    goto :goto_1

    .line 197
    :cond_3
    move p1, v4

    .line 198
    .line 199
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 200
    .line 201
    new-instance v5, Lcom/sumsub/sns/internal/core/common/t;

    .line 202
    .line 203
    .line 204
    invoke-direct {v5, p1}, Lcom/sumsub/sns/internal/core/common/t;-><init>(Z)V

    .line 205
    .line 206
    const/16 v9, 0xe

    .line 207
    const/4 v10, 0x0

    .line 208
    const/4 v6, 0x0

    .line 209
    const/4 v7, 0x0

    .line 210
    const/4 v8, 0x0

    .line 211
    .line 212
    .line 213
    invoke-static/range {v4 .. v10}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 214
    .line 215
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->c:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 219
    .line 220
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 221
    return-object p1

    .line 222
    .line 223
    :goto_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/u;->c:Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 227
    throw p1
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
