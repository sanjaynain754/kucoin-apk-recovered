.class public final Lcom/sumsub/sns/internal/features/domain/v0;
.super Lcom/sumsub/sns/internal/features/domain/k0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 9
    .line 10
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/domain/h;->g:Lkotlin/Lazy;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 17
    .line 18
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/domain/h;->e:Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 25
    .line 26
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, v1, p1}, Lcom/sumsub/sns/internal/features/domain/k0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 36
    return-void
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
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/domain/f0;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/j0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/t0;

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Not yet implemented and never will"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/t0;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p4, Lcom/sumsub/sns/internal/features/domain/u0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/sumsub/sns/internal/features/domain/u0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/u0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/u0;->c:I

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/u0;

    invoke-direct {v0, p0, p4}, Lcom/sumsub/sns/internal/features/domain/u0;-><init>(Lcom/sumsub/sns/internal/features/domain/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    goto :goto_0

    :goto_1
    iget-object p4, v9, Lcom/sumsub/sns/internal/features/domain/u0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 3
    iget v1, v9, Lcom/sumsub/sns/internal/features/domain/u0;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    iget-object p4, p1, Lcom/sumsub/sns/internal/features/domain/f0;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 5
    invoke-virtual {p4}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p4

    .line 6
    invoke-virtual {p2, p4}, Lcom/sumsub/sns/internal/features/data/model/common/p;->b(Lcom/sumsub/sns/internal/features/data/model/common/X;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/q2;

    if-eqz p2, :cond_4

    .line 7
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    if-nez p2, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    move-object v4, p2

    goto :goto_4

    .line 8
    :cond_4
    :goto_3
    sget-object p2, Lcom/sumsub/sns/internal/features/data/model/common/m2;->c:Lcom/sumsub/sns/internal/features/data/model/common/m2;

    .line 9
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    goto :goto_2

    .line 10
    :goto_4
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/domain/t0;->e:Ljava/lang/String;

    .line 11
    invoke-static {p2}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p4, "X-Video-Selfie-Phrase"

    invoke-static {p4, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/domain/k0;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 13
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/domain/t0;->d:Ljava/io/File;

    .line 14
    iput v2, v9, Lcom/sumsub/sns/internal/features/domain/u0;->c:I

    const/4 v8, 0x0

    const/16 v10, 0x28

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v2, p3

    invoke-static/range {v1 .. v10}, Lcom/sumsub/sns/internal/features/data/repository/applicant/c;->a(Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/domain/o0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_5

    return-object v0

    .line 15
    :cond_5
    :goto_5
    check-cast p4, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    .line 16
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/h0;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p4}, Lcom/sumsub/sns/internal/features/domain/h0;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic b(Lcom/sumsub/sns/internal/features/domain/f0;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/j0;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/t0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sumsub/sns/internal/features/domain/v0;->a(Lcom/sumsub/sns/internal/features/domain/t0;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method
