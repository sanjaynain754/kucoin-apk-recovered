.class public final Lcom/sumsub/sns/internal/features/data/model/common/t3;
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


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/n;Lcom/sumsub/sns/internal/features/data/model/common/j3;Lcom/sumsub/sns/internal/features/data/model/common/remote/c;Lcom/sumsub/sns/internal/features/data/model/common/o;Lcom/sumsub/sns/internal/features/data/model/common/j;Lcom/sumsub/sns/internal/features/data/model/common/l;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->a:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 16
    .line 17
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

    .line 18
    .line 19
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

    .line 20
    .line 21
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->i:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p10, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->j:Ljava/util/List;

    .line 24
    .line 25
    iput-object p11, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->k:Ljava/util/List;

    .line 26
    .line 27
    iput-object p12, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->l:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p13, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->m:Ljava/lang/String;

    .line 30
    return-void
.end method

.method public static a(Lcom/sumsub/sns/internal/features/data/model/common/t3;Lcom/sumsub/sns/internal/features/data/model/common/remote/c;Lcom/sumsub/sns/internal/features/data/model/common/o;I)Lcom/sumsub/sns/internal/features/data/model/common/t3;
    .locals 14

    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

    and-int/lit8 v0, p3, 0x10

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    :cond_0
    move-object v5, p1

    and-int/lit8 p1, p3, 0x20

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-object v6, p1

    goto :goto_0

    :cond_1
    move-object/from16 v6, p2

    :goto_0
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

    iget-object v8, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

    iget-object v9, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->i:Ljava/lang/String;

    iget-object v10, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->j:Ljava/util/List;

    iget-object v11, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->k:Ljava/util/List;

    iget-object v12, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->l:Ljava/lang/String;

    iget-object v13, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->m:Ljava/lang/String;

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/t3;

    invoke-direct/range {v0 .. v13}, Lcom/sumsub/sns/internal/features/data/model/common/t3;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/n;Lcom/sumsub/sns/internal/features/data/model/common/j3;Lcom/sumsub/sns/internal/features/data/model/common/remote/c;Lcom/sumsub/sns/internal/features/data/model/common/o;Lcom/sumsub/sns/internal/features/data/model/common/j;Lcom/sumsub/sns/internal/features/data/model/common/l;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/features/data/model/common/remote/c;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->l:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->a:Ljava/lang/String;

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
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->b:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 37
    .line 38
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 48
    .line 49
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 59
    .line 60
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 70
    .line 71
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

    .line 81
    .line 82
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

    .line 92
    .line 93
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->i:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->i:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->j:Ljava/util/List;

    .line 114
    .line 115
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->j:Ljava/util/List;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->k:Ljava/util/List;

    .line 125
    .line 126
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->k:Ljava/util/List;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->l:Ljava/lang/String;

    .line 136
    .line 137
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->l:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->m:Ljava/lang/String;

    .line 147
    .line 148
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/t3;->m:Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    move-result p1

    .line 153
    .line 154
    if-nez p1, :cond_e

    .line 155
    return v2

    .line 156
    :cond_e
    return v0
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

.method public final f()Lcom/sumsub/sns/internal/features/data/model/common/j;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->i:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->m:Ljava/lang/String;

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
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->a:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->b:Ljava/lang/String;

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 19
    move-result v1

    .line 20
    :goto_0
    add-int/2addr v0, v1

    .line 21
    .line 22
    mul-int/lit8 v0, v0, 0x1f

    .line 23
    .line 24
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/n;->hashCode()I

    .line 28
    move-result v1

    .line 29
    add-int/2addr v1, v0

    .line 30
    .line 31
    mul-int/lit8 v1, v1, 0x1f

    .line 32
    .line 33
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/j3;->hashCode()I

    .line 37
    move-result v0

    .line 38
    add-int/2addr v0, v1

    .line 39
    .line 40
    mul-int/lit8 v0, v0, 0x1f

    .line 41
    .line 42
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    move v1, v2

    .line 46
    goto :goto_1

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/c;->hashCode()I

    .line 50
    move-result v1

    .line 51
    :goto_1
    add-int/2addr v0, v1

    .line 52
    .line 53
    mul-int/lit8 v0, v0, 0x1f

    .line 54
    .line 55
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/o;->hashCode()I

    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v0

    .line 61
    .line 62
    mul-int/lit8 v1, v1, 0x1f

    .line 63
    .line 64
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

    .line 65
    .line 66
    if-nez v0, :cond_2

    .line 67
    move v0, v2

    .line 68
    goto :goto_2

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/j;->hashCode()I

    .line 72
    move-result v0

    .line 73
    :goto_2
    add-int/2addr v1, v0

    .line 74
    .line 75
    mul-int/lit8 v1, v1, 0x1f

    .line 76
    .line 77
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

    .line 78
    .line 79
    if-nez v0, :cond_3

    .line 80
    move v0, v2

    .line 81
    goto :goto_3

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/l;->hashCode()I

    .line 85
    move-result v0

    .line 86
    :goto_3
    add-int/2addr v1, v0

    .line 87
    .line 88
    mul-int/lit8 v1, v1, 0x1f

    .line 89
    .line 90
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->i:Ljava/lang/String;

    .line 91
    .line 92
    if-nez v0, :cond_4

    .line 93
    move v0, v2

    .line 94
    goto :goto_4

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 98
    move-result v0

    .line 99
    :goto_4
    add-int/2addr v1, v0

    .line 100
    .line 101
    mul-int/lit8 v1, v1, 0x1f

    .line 102
    .line 103
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->j:Ljava/util/List;

    .line 104
    .line 105
    if-nez v0, :cond_5

    .line 106
    move v0, v2

    .line 107
    goto :goto_5

    .line 108
    .line 109
    .line 110
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 111
    move-result v0

    .line 112
    :goto_5
    add-int/2addr v1, v0

    .line 113
    .line 114
    mul-int/lit8 v1, v1, 0x1f

    .line 115
    .line 116
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->k:Ljava/util/List;

    .line 117
    .line 118
    if-nez v0, :cond_6

    .line 119
    move v0, v2

    .line 120
    goto :goto_6

    .line 121
    .line 122
    .line 123
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 124
    move-result v0

    .line 125
    :goto_6
    add-int/2addr v1, v0

    .line 126
    .line 127
    mul-int/lit8 v1, v1, 0x1f

    .line 128
    .line 129
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->l:Ljava/lang/String;

    .line 130
    .line 131
    if-nez v0, :cond_7

    .line 132
    move v0, v2

    .line 133
    goto :goto_7

    .line 134
    .line 135
    .line 136
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 137
    move-result v0

    .line 138
    :goto_7
    add-int/2addr v1, v0

    .line 139
    .line 140
    mul-int/lit8 v1, v1, 0x1f

    .line 141
    .line 142
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->m:Ljava/lang/String;

    .line 143
    .line 144
    if-nez v0, :cond_8

    .line 145
    goto :goto_8

    .line 146
    .line 147
    .line 148
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 149
    move-result v2

    .line 150
    :goto_8
    add-int/2addr v1, v2

    .line 151
    return v1
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
.end method

.method public final i()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->k:Ljava/util/List;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

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
    .locals 15

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->a:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->b:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->c:Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->d:Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 11
    .line 12
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 13
    .line 14
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->g:Lcom/sumsub/sns/internal/features/data/model/common/j;

    .line 15
    .line 16
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->h:Lcom/sumsub/sns/internal/features/data/model/common/l;

    .line 17
    .line 18
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->i:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v9, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->j:Ljava/util/List;

    .line 21
    .line 22
    iget-object v10, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->k:Ljava/util/List;

    .line 23
    .line 24
    iget-object v11, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->l:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v12, p0, Lcom/sumsub/sns/internal/features/data/model/common/t3;->m:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v13, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    const-string v14, "StandaloneApplicant(id="

    .line 34
    .line 35
    .line 36
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v0, ", externalUserId="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v0, ", requiredIdDocs="

    .line 50
    .line 51
    .line 52
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v0, ", requiredIdDocsStatus="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v0, ", agreement="

    .line 66
    .line 67
    .line 68
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v0, ", review="

    .line 74
    .line 75
    .line 76
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v0, ", info="

    .line 82
    .line 83
    .line 84
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v0, ", rawInfo="

    .line 90
    .line 91
    .line 92
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v0, ", lang="

    .line 98
    .line 99
    .line 100
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v0, ", metadata="

    .line 106
    .line 107
    .line 108
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v0, ", questionnaires="

    .line 114
    .line 115
    .line 116
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v0, ", email="

    .line 122
    .line 123
    .line 124
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v0, ", phone="

    .line 130
    .line 131
    .line 132
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v0, ")"

    .line 138
    .line 139
    .line 140
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    move-result-object v0

    .line 145
    return-object v0
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
.end method
