.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/h2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 5
    return-void
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/h2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/h2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 6
    .line 7
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/h2;->a:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/h2;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/h2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/h2;->a:Ljava/lang/Object;

    .line 12
    .line 13
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/h2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

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
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/h2;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;

    .line 11
    const/4 v0, 0x1

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->k(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    .line 28
    move-result v2

    .line 29
    .line 30
    if-ne v2, v0, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    .line 37
    :cond_0
    if-eqz p1, :cond_c

    .line 38
    .line 39
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 40
    .line 41
    if-eqz p1, :cond_c

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 48
    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/j3;->b:Ljava/util/List;

    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x2

    .line 60
    .line 61
    const-string v5, "SELFIE"

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 67
    move-result v6

    .line 68
    .line 69
    if-eqz v6, :cond_2

    .line 70
    move v7, v1

    .line 71
    goto :goto_1

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    move-result-object v6

    .line 76
    move v7, v1

    .line 77
    .line 78
    .line 79
    :cond_3
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    move-result v8

    .line 81
    .line 82
    if-eqz v8, :cond_4

    .line 83
    .line 84
    .line 85
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    move-result-object v8

    .line 87
    .line 88
    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 92
    move-result-object v8

    .line 93
    .line 94
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    invoke-static {v8, v5, v1, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 98
    move-result v8

    .line 99
    .line 100
    if-eqz v8, :cond_3

    .line 101
    .line 102
    add-int/lit8 v7, v7, 0x1

    .line 103
    .line 104
    if-gez v7, :cond_3

    .line 105
    .line 106
    .line 107
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    .line 108
    goto :goto_0

    .line 109
    .line 110
    :cond_4
    :goto_1
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/common/O;

    .line 111
    .line 112
    .line 113
    invoke-direct {v6, p1}, Lcom/sumsub/sns/internal/features/data/model/common/O;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/p;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v2, v6}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    new-instance v2, Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    .line 129
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    move-result v6

    .line 131
    .line 132
    if-eqz v6, :cond_6

    .line 133
    .line 134
    .line 135
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    move-result-object v6

    .line 137
    move-object v8, v6

    .line 138
    .line 139
    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 143
    move-result-object v8

    .line 144
    .line 145
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    invoke-static {v8, v5, v1, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 149
    move-result v8

    .line 150
    .line 151
    if-eqz v8, :cond_5

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    goto :goto_2

    .line 156
    .line 157
    .line 158
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 159
    move-result p1

    .line 160
    .line 161
    if-eqz p1, :cond_7

    .line 162
    move v4, v1

    .line 163
    goto :goto_4

    .line 164
    .line 165
    .line 166
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 167
    move-result p1

    .line 168
    move v3, v1

    .line 169
    move v4, v3

    .line 170
    .line 171
    :cond_8
    :goto_3
    if-ge v3, p1, :cond_a

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    move-result-object v5

    .line 176
    .line 177
    add-int/lit8 v3, v3, 0x1

    .line 178
    .line 179
    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    .line 183
    move-result v6

    .line 184
    .line 185
    if-eqz v6, :cond_8

    .line 186
    .line 187
    .line 188
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isApproved()Z

    .line 189
    move-result v6

    .line 190
    .line 191
    if-nez v6, :cond_9

    .line 192
    .line 193
    .line 194
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isReviewing()Z

    .line 195
    move-result v5

    .line 196
    .line 197
    if-eqz v5, :cond_8

    .line 198
    .line 199
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 200
    .line 201
    if-gez v4, :cond_8

    .line 202
    .line 203
    .line 204
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    .line 205
    goto :goto_3

    .line 206
    .line 207
    :cond_a
    :goto_4
    if-ne v4, v7, :cond_b

    .line 208
    goto :goto_5

    .line 209
    :cond_b
    move v0, v1

    .line 210
    .line 211
    .line 212
    :goto_5
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 213
    move-result-object p1

    .line 214
    return-object p1

    .line 215
    .line 216
    .line 217
    :cond_c
    :goto_6
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 218
    move-result-object p1

    .line 219
    return-object p1
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
