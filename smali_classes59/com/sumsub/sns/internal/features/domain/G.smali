.class public final Lcom/sumsub/sns/internal/features/domain/G;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

.field public final c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/G;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/G;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/domain/G;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 10
    return-void
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
.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/domain/F;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/domain/F;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/F;->d:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/F;->d:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/F;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/domain/F;-><init>(Lcom/sumsub/sns/internal/features/domain/G;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/domain/F;->b:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/domain/F;->d:I

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/domain/F;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    goto :goto_4

    .line 48
    :catch_0
    move-exception p1

    .line 49
    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    throw p1

    .line 59
    .line 60
    .line 61
    :cond_2
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 62
    goto :goto_1

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    .line 67
    :try_start_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/domain/G;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 68
    .line 69
    iput v5, v0, Lcom/sumsub/sns/internal/features/domain/F;->d:I

    .line 70
    .line 71
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 72
    const/4 v2, 0x0

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    if-ne p1, v1, :cond_4

    .line 79
    goto :goto_3

    .line 80
    .line 81
    :cond_4
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/n;->a:Ljava/util/List;

    .line 88
    .line 89
    .line 90
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    move-result-object v2

    .line 92
    .line 93
    .line 94
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    move-result v5

    .line 96
    .line 97
    if-eqz v5, :cond_6

    .line 98
    .line 99
    .line 100
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    move-result-object v5

    .line 102
    move-object v6, v5

    .line 103
    .line 104
    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 105
    .line 106
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 107
    .line 108
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/domain/G;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 112
    move-result-object v7

    .line 113
    .line 114
    .line 115
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    move-result v6

    .line 117
    .line 118
    if-eqz v6, :cond_5

    .line 119
    goto :goto_2

    .line 120
    :cond_6
    move-object v5, v3

    .line 121
    .line 122
    :goto_2
    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 123
    .line 124
    if-eqz v5, :cond_7

    .line 125
    .line 126
    iget-object v2, v5, Lcom/sumsub/sns/internal/features/data/model/common/m;->m:Ljava/lang/String;

    .line 127
    .line 128
    if-nez v2, :cond_8

    .line 129
    .line 130
    :cond_7
    const-string v2, "-"

    .line 131
    .line 132
    :cond_8
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/domain/G;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 133
    .line 134
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/domain/F;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 135
    .line 136
    iput v4, v0, Lcom/sumsub/sns/internal/features/domain/F;->d:I

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;->a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    if-ne v0, v1, :cond_9

    .line 143
    :goto_3
    return-object v1

    .line 144
    :cond_9
    move-object v8, v0

    .line 145
    move-object v0, p1

    .line 146
    move-object p1, v8

    .line 147
    .line 148
    :goto_4
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/O2;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->f()Lcom/sumsub/sns/internal/features/data/model/common/j;

    .line 152
    move-result-object v0

    .line 153
    .line 154
    if-eqz v0, :cond_a

    .line 155
    .line 156
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/j;->a:Ljava/lang/String;

    .line 157
    .line 158
    :cond_a
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/O2;->b:Ljava/util/Map;

    .line 159
    .line 160
    if-eqz v0, :cond_b

    .line 161
    .line 162
    .line 163
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/Q2;

    .line 167
    .line 168
    if-nez v0, :cond_c

    .line 169
    .line 170
    :cond_b
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/O2;->a:Lcom/sumsub/sns/internal/features/data/model/common/Q2;

    .line 171
    .line 172
    .line 173
    :cond_c
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 175
    return-object p1

    .line 176
    .line 177
    :goto_5
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 178
    .line 179
    .line 180
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 181
    move-result-object p1

    .line 182
    .line 183
    .line 184
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    move-result-object p1

    .line 186
    return-object p1
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
