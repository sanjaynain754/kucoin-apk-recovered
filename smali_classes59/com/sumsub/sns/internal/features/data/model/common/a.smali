.class public final Lcom/sumsub/sns/internal/features/data/model/common/a;
.super Lcom/sumsub/sns/internal/features/data/model/common/p;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/sumsub/sns/internal/features/data/model/common/n;

.field public final d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

.field public final e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

.field public final f:Lcom/sumsub/sns/internal/features/data/model/common/o;

.field public final g:Lcom/sumsub/sns/internal/features/data/model/common/j;

.field public final h:Lcom/sumsub/sns/internal/features/data/model/common/l;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/util/List;

.field public final k:Ljava/util/List;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/n;Lcom/sumsub/sns/internal/features/data/model/common/j3;Lcom/sumsub/sns/internal/features/data/model/common/remote/c;Lcom/sumsub/sns/internal/features/data/model/common/o;Lcom/sumsub/sns/internal/features/data/model/common/j;Lcom/sumsub/sns/internal/features/data/model/common/l;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->a:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 16
    .line 17
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

    .line 18
    .line 19
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

    .line 20
    .line 21
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->i:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p10, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->j:Ljava/util/List;

    .line 24
    .line 25
    iput-object p11, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->k:Ljava/util/List;

    .line 26
    .line 27
    iput-object p12, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->l:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p13, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->m:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p14, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->n:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p15, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->o:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public static a(Lcom/sumsub/sns/internal/features/data/model/common/a;Lcom/sumsub/sns/internal/features/data/model/common/remote/c;Lcom/sumsub/sns/internal/features/data/model/common/o;I)Lcom/sumsub/sns/internal/features/data/model/common/a;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->a:Ljava/lang/String;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->b:Ljava/lang/String;

    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

    and-int/lit8 v5, p3, 0x10

    if-eqz v5, :cond_0

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    goto :goto_0

    :cond_0
    move-object/from16 v5, p1

    :goto_0
    and-int/lit8 v6, p3, 0x20

    if-eqz v6, :cond_1

    iget-object v6, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    goto :goto_1

    :cond_1
    move-object/from16 v6, p2

    :goto_1
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

    iget-object v8, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

    iget-object v9, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->i:Ljava/lang/String;

    iget-object v10, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->j:Ljava/util/List;

    iget-object v11, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->k:Ljava/util/List;

    iget-object v12, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->l:Ljava/lang/String;

    iget-object v13, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->m:Ljava/lang/String;

    iget-object v14, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->n:Ljava/lang/String;

    iget-object v15, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->o:Ljava/lang/String;

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/a;

    invoke-direct/range {v0 .. v15}, Lcom/sumsub/sns/internal/features/data/model/common/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/n;Lcom/sumsub/sns/internal/features/data/model/common/j3;Lcom/sumsub/sns/internal/features/data/model/common/remote/c;Lcom/sumsub/sns/internal/features/data/model/common/o;Lcom/sumsub/sns/internal/features/data/model/common/j;Lcom/sumsub/sns/internal/features/data/model/common/l;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/features/data/model/common/remote/c;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->l:Ljava/lang/String;

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

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->a:Ljava/lang/String;

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

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->a:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->b:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    return v2

    .line 35
    .line 36
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 37
    .line 38
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-nez v1, :cond_4

    .line 45
    return v2

    .line 46
    .line 47
    :cond_4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 48
    .line 49
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-nez v1, :cond_5

    .line 56
    return v2

    .line 57
    .line 58
    :cond_5
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 59
    .line 60
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    move-result v1

    .line 65
    .line 66
    if-nez v1, :cond_6

    .line 67
    return v2

    .line 68
    .line 69
    :cond_6
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 70
    .line 71
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    move-result v1

    .line 76
    .line 77
    if-nez v1, :cond_7

    .line 78
    return v2

    .line 79
    .line 80
    :cond_7
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

    .line 81
    .line 82
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    move-result v1

    .line 87
    .line 88
    if-nez v1, :cond_8

    .line 89
    return v2

    .line 90
    .line 91
    :cond_8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

    .line 92
    .line 93
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

    .line 94
    .line 95
    .line 96
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    move-result v1

    .line 98
    .line 99
    if-nez v1, :cond_9

    .line 100
    return v2

    .line 101
    .line 102
    :cond_9
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->i:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->i:Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    move-result v1

    .line 109
    .line 110
    if-nez v1, :cond_a

    .line 111
    return v2

    .line 112
    .line 113
    :cond_a
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->j:Ljava/util/List;

    .line 114
    .line 115
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->j:Ljava/util/List;

    .line 116
    .line 117
    .line 118
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    move-result v1

    .line 120
    .line 121
    if-nez v1, :cond_b

    .line 122
    return v2

    .line 123
    .line 124
    :cond_b
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->k:Ljava/util/List;

    .line 125
    .line 126
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->k:Ljava/util/List;

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    move-result v1

    .line 131
    .line 132
    if-nez v1, :cond_c

    .line 133
    return v2

    .line 134
    .line 135
    :cond_c
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->l:Ljava/lang/String;

    .line 136
    .line 137
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->l:Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    move-result v1

    .line 142
    .line 143
    if-nez v1, :cond_d

    .line 144
    return v2

    .line 145
    .line 146
    :cond_d
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->m:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->m:Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    move-result v1

    .line 153
    .line 154
    if-nez v1, :cond_e

    .line 155
    return v2

    .line 156
    .line 157
    :cond_e
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->n:Ljava/lang/String;

    .line 158
    .line 159
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->n:Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    move-result v1

    .line 164
    .line 165
    if-nez v1, :cond_f

    .line 166
    return v2

    .line 167
    .line 168
    :cond_f
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->o:Ljava/lang/String;

    .line 169
    .line 170
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/a;->o:Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    move-result p1

    .line 175
    .line 176
    if-nez p1, :cond_10

    .line 177
    return v2

    .line 178
    :cond_10
    return v0
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

.method public final f()Lcom/sumsub/sns/internal/features/data/model/common/j;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

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

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->i:Ljava/lang/String;

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

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->m:Ljava/lang/String;

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

.method public final hashCode()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->a:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->b:Ljava/lang/String;

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    move v2, v3

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 20
    move-result v2

    .line 21
    :goto_0
    add-int/2addr v0, v2

    .line 22
    mul-int/2addr v0, v1

    .line 23
    .line 24
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/n;->hashCode()I

    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, v0

    .line 30
    mul-int/2addr v2, v1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/j3;->hashCode()I

    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v2

    .line 38
    mul-int/2addr v0, v1

    .line 39
    .line 40
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 41
    .line 42
    if-nez v2, :cond_1

    .line 43
    move v2, v3

    .line 44
    goto :goto_1

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/c;->hashCode()I

    .line 48
    move-result v2

    .line 49
    :goto_1
    add-int/2addr v0, v2

    .line 50
    mul-int/2addr v0, v1

    .line 51
    .line 52
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/o;->hashCode()I

    .line 56
    move-result v2

    .line 57
    add-int/2addr v2, v0

    .line 58
    mul-int/2addr v2, v1

    .line 59
    .line 60
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

    .line 61
    .line 62
    if-nez v0, :cond_2

    .line 63
    move v0, v3

    .line 64
    goto :goto_2

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/j;->hashCode()I

    .line 68
    move-result v0

    .line 69
    :goto_2
    add-int/2addr v2, v0

    .line 70
    mul-int/2addr v2, v1

    .line 71
    .line 72
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

    .line 73
    .line 74
    if-nez v0, :cond_3

    .line 75
    move v0, v3

    .line 76
    goto :goto_3

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/l;->hashCode()I

    .line 80
    move-result v0

    .line 81
    :goto_3
    add-int/2addr v2, v0

    .line 82
    mul-int/2addr v2, v1

    .line 83
    .line 84
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->i:Ljava/lang/String;

    .line 85
    .line 86
    if-nez v0, :cond_4

    .line 87
    move v0, v3

    .line 88
    goto :goto_4

    .line 89
    .line 90
    .line 91
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 92
    move-result v0

    .line 93
    :goto_4
    add-int/2addr v2, v0

    .line 94
    mul-int/2addr v2, v1

    .line 95
    .line 96
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->j:Ljava/util/List;

    .line 97
    .line 98
    if-nez v0, :cond_5

    .line 99
    move v0, v3

    .line 100
    goto :goto_5

    .line 101
    .line 102
    .line 103
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 104
    move-result v0

    .line 105
    :goto_5
    add-int/2addr v2, v0

    .line 106
    mul-int/2addr v2, v1

    .line 107
    .line 108
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->k:Ljava/util/List;

    .line 109
    .line 110
    if-nez v0, :cond_6

    .line 111
    move v0, v3

    .line 112
    goto :goto_6

    .line 113
    .line 114
    .line 115
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 116
    move-result v0

    .line 117
    :goto_6
    add-int/2addr v2, v0

    .line 118
    mul-int/2addr v2, v1

    .line 119
    .line 120
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->l:Ljava/lang/String;

    .line 121
    .line 122
    if-nez v0, :cond_7

    .line 123
    move v0, v3

    .line 124
    goto :goto_7

    .line 125
    .line 126
    .line 127
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 128
    move-result v0

    .line 129
    :goto_7
    add-int/2addr v2, v0

    .line 130
    mul-int/2addr v2, v1

    .line 131
    .line 132
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->m:Ljava/lang/String;

    .line 133
    .line 134
    if-nez v0, :cond_8

    .line 135
    move v0, v3

    .line 136
    goto :goto_8

    .line 137
    .line 138
    .line 139
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 140
    move-result v0

    .line 141
    :goto_8
    add-int/2addr v2, v0

    .line 142
    mul-int/2addr v2, v1

    .line 143
    .line 144
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->n:Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v2, v1}, Lcom/sumsub/sentry/U;->a(Ljava/lang/String;II)I

    .line 148
    move-result v0

    .line 149
    .line 150
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->o:Ljava/lang/String;

    .line 151
    .line 152
    if-nez v1, :cond_9

    .line 153
    goto :goto_9

    .line 154
    .line 155
    .line 156
    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 157
    move-result v3

    .line 158
    :goto_9
    add-int/2addr v0, v3

    .line 159
    return v0
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
.end method

.method public final i()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->k:Ljava/util/List;

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

.method public final j()Lcom/sumsub/sns/internal/features/data/model/common/l;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

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

.method public final k()Lcom/sumsub/sns/internal/features/data/model/common/n;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

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

.method public final l()Lcom/sumsub/sns/internal/features/data/model/common/j3;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

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

.method public final m()Lcom/sumsub/sns/internal/features/data/model/common/o;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/a;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

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

.method public final toString()Ljava/lang/String;
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 9
    .line 10
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 11
    .line 12
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 13
    .line 14
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 15
    .line 16
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

    .line 17
    .line 18
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

    .line 19
    .line 20
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->i:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->j:Ljava/util/List;

    .line 23
    .line 24
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->k:Ljava/util/List;

    .line 25
    .line 26
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->l:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v13, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->m:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v14, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->n:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v15, v0, Lcom/sumsub/sns/internal/features/data/model/common/a;->o:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    move-object/from16 v16, v15

    .line 40
    .line 41
    const-string v15, "ActionApplicant(id="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v1, ", externalUserId="

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, ", requiredIdDocs="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v1, ", requiredIdDocsStatus="

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v1, ", agreement="

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v1, ", review="

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v1, ", info="

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, ", rawInfo="

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v1, ", lang="

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v1, ", metadata="

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v1, ", questionnaires="

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v1, ", email="

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v1, ", phone="

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v1, ", actionId="

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v1, ", externalActionId="

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    move-object/from16 v1, v16

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    const-string v1, ")"

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    move-result-object v0

    .line 171
    return-object v0
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
