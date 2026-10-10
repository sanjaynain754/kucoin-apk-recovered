.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/u;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/u;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/u;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/u;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/u;->a:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/u;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/u;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/u;->a:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 7
    .line 8
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/u;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/data/model/common/i;->k(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    .line 29
    if-ne v0, v1, :cond_0

    .line 30
    .line 31
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 32
    return-object p1

    .line 33
    .line 34
    :cond_0
    if-eqz p1, :cond_c

    .line 35
    .line 36
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 37
    .line 38
    if-eqz p1, :cond_c

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/j3;->b:Ljava/util/List;

    .line 55
    const/4 v1, 0x0

    .line 56
    const/4 v2, 0x2

    .line 57
    .line 58
    const-string v3, "SELFIE"

    .line 59
    const/4 v4, 0x0

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 65
    move-result v5

    .line 66
    .line 67
    if-eqz v5, :cond_2

    .line 68
    move v6, v4

    .line 69
    goto :goto_1

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    move-result-object v5

    .line 74
    move v6, v4

    .line 75
    .line 76
    .line 77
    :cond_3
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    move-result v7

    .line 79
    .line 80
    if-eqz v7, :cond_4

    .line 81
    .line 82
    .line 83
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    move-result-object v7

    .line 85
    .line 86
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 90
    move-result-object v7

    .line 91
    .line 92
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    invoke-static {v7, v3, v4, v2, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 96
    move-result v7

    .line 97
    .line 98
    if-eqz v7, :cond_3

    .line 99
    .line 100
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    if-gez v6, :cond_3

    .line 103
    .line 104
    .line 105
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    .line 106
    goto :goto_0

    .line 107
    .line 108
    :cond_4
    :goto_1
    new-instance v5, Lcom/sumsub/sns/internal/features/data/model/common/O;

    .line 109
    .line 110
    .line 111
    invoke-direct {v5, p1}, Lcom/sumsub/sns/internal/features/data/model/common/O;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/p;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    new-instance v0, Ljava/util/ArrayList;

    .line 118
    .line 119
    .line 120
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    move-result-object p1

    .line 125
    .line 126
    .line 127
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    move-result v5

    .line 129
    .line 130
    if-eqz v5, :cond_6

    .line 131
    .line 132
    .line 133
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    move-result-object v5

    .line 135
    move-object v7, v5

    .line 136
    .line 137
    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 141
    move-result-object v7

    .line 142
    .line 143
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    invoke-static {v7, v3, v4, v2, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 147
    move-result v7

    .line 148
    .line 149
    if-eqz v7, :cond_5

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    goto :goto_2

    .line 154
    .line 155
    .line 156
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 157
    move-result p1

    .line 158
    .line 159
    if-eqz p1, :cond_7

    .line 160
    goto :goto_4

    .line 161
    .line 162
    .line 163
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 164
    move-result p1

    .line 165
    move v1, v4

    .line 166
    .line 167
    :cond_8
    :goto_3
    if-ge v4, p1, :cond_a

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 171
    move-result-object v2

    .line 172
    .line 173
    add-int/lit8 v4, v4, 0x1

    .line 174
    .line 175
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    .line 179
    move-result v3

    .line 180
    .line 181
    if-eqz v3, :cond_8

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isApproved()Z

    .line 185
    move-result v3

    .line 186
    .line 187
    if-nez v3, :cond_9

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isReviewing()Z

    .line 191
    move-result v2

    .line 192
    .line 193
    if-eqz v2, :cond_8

    .line 194
    .line 195
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 196
    .line 197
    if-gez v1, :cond_8

    .line 198
    .line 199
    .line 200
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    .line 201
    goto :goto_3

    .line 202
    :cond_a
    move v4, v1

    .line 203
    .line 204
    :goto_4
    if-ne v4, v6, :cond_b

    .line 205
    .line 206
    const-string p1, "Selfie already submitted, aborting liveness check"

    .line 207
    .line 208
    .line 209
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 210
    .line 211
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/u;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 212
    .line 213
    new-instance v1, Lcom/sumsub/sns/internal/core/common/t;

    .line 214
    .line 215
    .line 216
    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/common/t;-><init>()V

    .line 217
    .line 218
    const/16 v5, 0xe

    .line 219
    const/4 v6, 0x0

    .line 220
    const/4 v2, 0x0

    .line 221
    const/4 v3, 0x0

    .line 222
    const/4 v4, 0x0

    .line 223
    .line 224
    .line 225
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 226
    .line 227
    :cond_b
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 228
    return-object p1

    .line 229
    .line 230
    :cond_c
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 231
    return-object p1
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
