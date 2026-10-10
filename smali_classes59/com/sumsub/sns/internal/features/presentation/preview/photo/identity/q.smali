.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;Lkotlin/coroutines/Continuation;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;->a:I

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
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;->n:Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;

    .line 32
    .line 33
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/q;->a:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->j()Z

    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x0

    .line 39
    .line 40
    if-nez v1, :cond_4

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d()Z

    .line 44
    move-result v1

    .line 45
    .line 46
    if-nez v1, :cond_4

    .line 47
    .line 48
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getPreferredDocumentsDefinitions()Ljava/util/Map;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :cond_2
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 60
    .line 61
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/utils/m;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 62
    .line 63
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    .line 64
    const/4 v5, 0x0

    .line 65
    .line 66
    aget-object v4, v4, v5

    .line 67
    .line 68
    iget-object v4, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 69
    .line 70
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v3, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    if-ne p1, v1, :cond_3

    .line 98
    goto :goto_1

    .line 99
    .line 100
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 101
    goto :goto_1

    .line 102
    .line 103
    :cond_4
    :goto_0
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->m:Lcom/sumsub/sns/core/presentation/base/C;

    .line 104
    .line 105
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/f;

    .line 106
    .line 107
    if-eqz v1, :cond_5

    .line 108
    move-object v2, p1

    .line 109
    .line 110
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/f;

    .line 111
    .line 112
    :cond_5
    if-eqz v2, :cond_6

    .line 113
    move-object v3, v2

    .line 114
    .line 115
    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 116
    .line 117
    const/16 v8, 0xf

    .line 118
    const/4 v9, 0x0

    .line 119
    const/4 v4, 0x0

    .line 120
    const/4 v5, 0x0

    .line 121
    const/4 v6, 0x0

    .line 122
    const/4 v7, 0x0

    .line 123
    .line 124
    .line 125
    invoke-static/range {v3 .. v9}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 126
    .line 127
    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 128
    .line 129
    :goto_1
    if-ne p1, v0, :cond_7

    .line 130
    return-object v0

    .line 131
    .line 132
    :cond_7
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 133
    return-object p1
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
