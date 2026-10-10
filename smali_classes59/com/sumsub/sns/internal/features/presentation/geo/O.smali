.class public final Lcom/sumsub/sns/internal/features/presentation/geo/O;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/sumsub/sns/core/presentation/base/O;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/geo/v0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/O;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->c:Lcom/sumsub/sns/core/presentation/base/O;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->d:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 5
    const/4 p1, 0x2

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/O;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->c:Lcom/sumsub/sns/core/presentation/base/O;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->d:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p2}, Lcom/sumsub/sns/internal/features/presentation/geo/O;-><init>(Lcom/sumsub/sns/core/presentation/base/O;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->b:Ljava/lang/Object;

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
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/geo/O;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/geo/O;

    .line 11
    .line 12
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/geo/O;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->a:I

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
    .line 14
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    throw p1

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    .line 29
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->c:Lcom/sumsub/sns/core/presentation/base/O;

    .line 34
    .line 35
    iget-object v3, v1, Lcom/sumsub/sns/core/presentation/base/O;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 36
    const/4 v4, 0x6

    .line 37
    const/4 v5, 0x0

    .line 38
    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->d:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 42
    .line 43
    const-string p1, "buildViewStateFlow: applicant null"

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/geo/a;->a(Ljava/lang/String;)V

    .line 47
    .line 48
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    .line 49
    .line 50
    new-instance v8, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    .line 51
    const/4 v12, 0x6

    .line 52
    const/4 v13, 0x0

    .line 53
    .line 54
    const-string v9, "Geo PoA error. Applicant null"

    .line 55
    const/4 v10, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    .line 58
    .line 59
    invoke-direct/range {v8 .. v13}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {v7, v8, v5, v5, v4}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    .line 63
    .line 64
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    iget-object v8, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 71
    .line 72
    const/16 v11, 0xc

    .line 73
    const/4 v12, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    .line 76
    .line 77
    invoke-static/range {v6 .. v12}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 80
    return-object p1

    .line 81
    .line 82
    :cond_2
    iget-object v1, v1, Lcom/sumsub/sns/core/presentation/base/O;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 83
    .line 84
    if-nez v1, :cond_3

    .line 85
    .line 86
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->d:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 87
    .line 88
    const-string p1, "buildViewStateFlow: config null"

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/geo/a;->a(Ljava/lang/String;)V

    .line 92
    .line 93
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    .line 94
    .line 95
    new-instance v8, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    .line 96
    const/4 v12, 0x6

    .line 97
    const/4 v13, 0x0

    .line 98
    .line 99
    const-string v9, "Geo PoA error. Config null"

    .line 100
    const/4 v10, 0x0

    .line 101
    const/4 v11, 0x0

    .line 102
    .line 103
    .line 104
    invoke-direct/range {v8 .. v13}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v7, v8, v5, v5, v4}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    .line 108
    .line 109
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    iget-object v8, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 116
    .line 117
    const/16 v11, 0xc

    .line 118
    const/4 v12, 0x0

    .line 119
    const/4 v9, 0x0

    .line 120
    .line 121
    .line 122
    invoke-static/range {v6 .. v12}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 123
    .line 124
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 125
    return-object p1

    .line 126
    .line 127
    .line 128
    :cond_3
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 129
    move-result-object v3

    .line 130
    .line 131
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/n;->a:Ljava/util/List;

    .line 132
    .line 133
    .line 134
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    move-result-object v3

    .line 136
    .line 137
    .line 138
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    move-result v4

    .line 140
    .line 141
    if-eqz v4, :cond_5

    .line 142
    .line 143
    .line 144
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    move-result-object v4

    .line 146
    move-object v6, v4

    .line 147
    .line 148
    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 149
    .line 150
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/X;->e()Z

    .line 154
    move-result v6

    .line 155
    .line 156
    if-eqz v6, :cond_4

    .line 157
    goto :goto_0

    .line 158
    :cond_5
    move-object v4, v5

    .line 159
    .line 160
    :goto_0
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 161
    .line 162
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->d:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 163
    .line 164
    if-eqz v4, :cond_6

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/m;->g()Z

    .line 168
    move-result v4

    .line 169
    goto :goto_1

    .line 170
    :cond_6
    const/4 v4, 0x0

    .line 171
    .line 172
    :goto_1
    iput-boolean v4, v3, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->s:Z

    .line 173
    .line 174
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->d:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 175
    .line 176
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/h;->j:Ljava/util/Map;

    .line 177
    .line 178
    if-nez v1, :cond_7

    .line 179
    .line 180
    .line 181
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 182
    move-result-object v1

    .line 183
    .line 184
    :cond_7
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->v:Ljava/util/Map;

    .line 185
    .line 186
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->c:Lcom/sumsub/sns/core/presentation/base/O;

    .line 187
    .line 188
    iget-object v1, v1, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 189
    .line 190
    if-nez v1, :cond_8

    .line 191
    .line 192
    new-instance v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 193
    .line 194
    .line 195
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;-><init>()V

    .line 196
    .line 197
    :cond_8
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->d:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 198
    .line 199
    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->t:Lkotlinx/coroutines/flow/n;

    .line 200
    .line 201
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/geo/N;

    .line 202
    .line 203
    .line 204
    invoke-direct {v6, v1, v3, v5}, Lcom/sumsub/sns/internal/features/presentation/geo/N;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v4, v6}, Lkotlinx/coroutines/flow/g;->n0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 208
    move-result-object v1

    .line 209
    .line 210
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/geo/O;->a:I

    .line 211
    .line 212
    .line 213
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/flow/g;->B(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 214
    move-result-object p1

    .line 215
    .line 216
    if-ne p1, v0, :cond_9

    .line 217
    return-object v0

    .line 218
    .line 219
    :cond_9
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 220
    return-object p1
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
