.class public final Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;
.super Lcom/sumsub/sns/internal/features/presentation/sumsubid/U0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:Ljava/lang/CharSequence;

.field public final c:Ljava/lang/CharSequence;

.field public final d:Ljava/lang/CharSequence;

.field public final e:Ljava/lang/CharSequence;

.field public final f:Ljava/lang/CharSequence;

.field public final g:Ljava/lang/CharSequence;

.field public final h:Ljava/lang/CharSequence;

.field public final i:Ljava/lang/CharSequence;

.field public final j:Z

.field public final k:Lkotlin/jvm/functions/Function1;

.field public final l:Lkotlin/jvm/functions/Function1;

.field public final m:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

.field public final n:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/U0;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->a:Ljava/lang/CharSequence;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->b:Ljava/lang/CharSequence;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->c:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->d:Ljava/lang/CharSequence;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->e:Ljava/lang/CharSequence;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->f:Ljava/lang/CharSequence;

    .line 16
    .line 17
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->g:Ljava/lang/CharSequence;

    .line 18
    .line 19
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->h:Ljava/lang/CharSequence;

    .line 20
    .line 21
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->i:Ljava/lang/CharSequence;

    .line 22
    .line 23
    iput-boolean p10, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->j:Z

    .line 24
    .line 25
    iput-object p11, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->k:Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    iput-object p12, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->l:Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    iput-object p13, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->m:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    .line 30
    .line 31
    iput-object p14, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->n:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    .line 32
    return-void
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
.end method


# virtual methods
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
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->a:Ljava/lang/CharSequence;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->a:Ljava/lang/CharSequence;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->b:Ljava/lang/CharSequence;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->b:Ljava/lang/CharSequence;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->c:Ljava/lang/CharSequence;

    .line 37
    .line 38
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->c:Ljava/lang/CharSequence;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->d:Ljava/lang/CharSequence;

    .line 48
    .line 49
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->d:Ljava/lang/CharSequence;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->e:Ljava/lang/CharSequence;

    .line 59
    .line 60
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->e:Ljava/lang/CharSequence;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->f:Ljava/lang/CharSequence;

    .line 70
    .line 71
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->f:Ljava/lang/CharSequence;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->g:Ljava/lang/CharSequence;

    .line 81
    .line 82
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->g:Ljava/lang/CharSequence;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->h:Ljava/lang/CharSequence;

    .line 92
    .line 93
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->h:Ljava/lang/CharSequence;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->i:Ljava/lang/CharSequence;

    .line 103
    .line 104
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->i:Ljava/lang/CharSequence;

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
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->j:Z

    .line 114
    .line 115
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->j:Z

    .line 116
    .line 117
    if-eq v1, v3, :cond_b

    .line 118
    return v2

    .line 119
    .line 120
    :cond_b
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->k:Lkotlin/jvm/functions/Function1;

    .line 121
    .line 122
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->k:Lkotlin/jvm/functions/Function1;

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    move-result v1

    .line 127
    .line 128
    if-nez v1, :cond_c

    .line 129
    return v2

    .line 130
    .line 131
    :cond_c
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->l:Lkotlin/jvm/functions/Function1;

    .line 132
    .line 133
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->l:Lkotlin/jvm/functions/Function1;

    .line 134
    .line 135
    .line 136
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    move-result v1

    .line 138
    .line 139
    if-nez v1, :cond_d

    .line 140
    return v2

    .line 141
    .line 142
    :cond_d
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->m:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    .line 143
    .line 144
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->m:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    move-result v1

    .line 149
    .line 150
    if-nez v1, :cond_e

    .line 151
    return v2

    .line 152
    .line 153
    :cond_e
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->n:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    .line 154
    .line 155
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->n:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    .line 156
    .line 157
    .line 158
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    move-result p1

    .line 160
    .line 161
    if-nez p1, :cond_f

    .line 162
    return v2

    .line 163
    :cond_f
    return v0
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

.method public final hashCode()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->a:Ljava/lang/CharSequence;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 11
    move-result v0

    .line 12
    .line 13
    :goto_0
    const/16 v2, 0x1f

    .line 14
    mul-int/2addr v0, v2

    .line 15
    .line 16
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->b:Ljava/lang/CharSequence;

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    move v3, v1

    .line 20
    goto :goto_1

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 24
    move-result v3

    .line 25
    :goto_1
    add-int/2addr v0, v3

    .line 26
    mul-int/2addr v0, v2

    .line 27
    .line 28
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->c:Ljava/lang/CharSequence;

    .line 29
    .line 30
    if-nez v3, :cond_2

    .line 31
    move v3, v1

    .line 32
    goto :goto_2

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 36
    move-result v3

    .line 37
    :goto_2
    add-int/2addr v0, v3

    .line 38
    mul-int/2addr v0, v2

    .line 39
    .line 40
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->d:Ljava/lang/CharSequence;

    .line 41
    .line 42
    if-nez v3, :cond_3

    .line 43
    move v3, v1

    .line 44
    goto :goto_3

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 48
    move-result v3

    .line 49
    :goto_3
    add-int/2addr v0, v3

    .line 50
    mul-int/2addr v0, v2

    .line 51
    .line 52
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->e:Ljava/lang/CharSequence;

    .line 53
    .line 54
    if-nez v3, :cond_4

    .line 55
    move v3, v1

    .line 56
    goto :goto_4

    .line 57
    .line 58
    .line 59
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 60
    move-result v3

    .line 61
    :goto_4
    add-int/2addr v0, v3

    .line 62
    mul-int/2addr v0, v2

    .line 63
    .line 64
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->f:Ljava/lang/CharSequence;

    .line 65
    .line 66
    if-nez v3, :cond_5

    .line 67
    move v3, v1

    .line 68
    goto :goto_5

    .line 69
    .line 70
    .line 71
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 72
    move-result v3

    .line 73
    :goto_5
    add-int/2addr v0, v3

    .line 74
    mul-int/2addr v0, v2

    .line 75
    .line 76
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->g:Ljava/lang/CharSequence;

    .line 77
    .line 78
    if-nez v3, :cond_6

    .line 79
    move v3, v1

    .line 80
    goto :goto_6

    .line 81
    .line 82
    .line 83
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 84
    move-result v3

    .line 85
    :goto_6
    add-int/2addr v0, v3

    .line 86
    mul-int/2addr v0, v2

    .line 87
    .line 88
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->h:Ljava/lang/CharSequence;

    .line 89
    .line 90
    if-nez v3, :cond_7

    .line 91
    move v3, v1

    .line 92
    goto :goto_7

    .line 93
    .line 94
    .line 95
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 96
    move-result v3

    .line 97
    :goto_7
    add-int/2addr v0, v3

    .line 98
    mul-int/2addr v0, v2

    .line 99
    .line 100
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->i:Ljava/lang/CharSequence;

    .line 101
    .line 102
    if-nez v3, :cond_8

    .line 103
    goto :goto_8

    .line 104
    .line 105
    .line 106
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 107
    move-result v1

    .line 108
    :goto_8
    add-int/2addr v0, v1

    .line 109
    mul-int/2addr v0, v2

    .line 110
    .line 111
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->j:Z

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v0, v2}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 115
    move-result v0

    .line 116
    .line 117
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->k:Lkotlin/jvm/functions/Function1;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 121
    move-result v1

    .line 122
    add-int/2addr v1, v0

    .line 123
    mul-int/2addr v1, v2

    .line 124
    .line 125
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->l:Lkotlin/jvm/functions/Function1;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 129
    move-result v0

    .line 130
    add-int/2addr v0, v1

    .line 131
    mul-int/2addr v0, v2

    .line 132
    .line 133
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->m:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;->hashCode()I

    .line 137
    move-result v1

    .line 138
    add-int/2addr v1, v0

    .line 139
    mul-int/2addr v1, v2

    .line 140
    .line 141
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->n:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;->hashCode()I

    .line 145
    move-result v0

    .line 146
    add-int/2addr v0, v1

    .line 147
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->a:Ljava/lang/CharSequence;

    .line 5
    .line 6
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->b:Ljava/lang/CharSequence;

    .line 7
    .line 8
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->c:Ljava/lang/CharSequence;

    .line 9
    .line 10
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->d:Ljava/lang/CharSequence;

    .line 11
    .line 12
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->e:Ljava/lang/CharSequence;

    .line 13
    .line 14
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->f:Ljava/lang/CharSequence;

    .line 15
    .line 16
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->g:Ljava/lang/CharSequence;

    .line 17
    .line 18
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->h:Ljava/lang/CharSequence;

    .line 19
    .line 20
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->i:Ljava/lang/CharSequence;

    .line 21
    .line 22
    iget-boolean v10, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->j:Z

    .line 23
    .line 24
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->k:Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->l:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    iget-object v13, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->m:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    .line 29
    .line 30
    iget-object v14, v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P0;->n:Lcom/sumsub/sns/internal/features/presentation/sumsubid/f;

    .line 31
    .line 32
    new-instance v15, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    const-string v0, "Agreement(title="

    .line 38
    .line 39
    .line 40
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v0, ", subtitle="

    .line 46
    .line 47
    .line 48
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v0, ", continueText="

    .line 54
    .line 55
    .line 56
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v0, ", skipText="

    .line 62
    .line 63
    .line 64
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v0, ", benefitInstantlyText="

    .line 70
    .line 71
    .line 72
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v0, ", benefitSecurelyText="

    .line 78
    .line 79
    .line 80
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v0, ", benefitOptionallyText="

    .line 86
    .line 87
    .line 88
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v0, ", consentText="

    .line 94
    .line 95
    .line 96
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v0, ", footerText="

    .line 102
    .line 103
    .line 104
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v0, ", buttonEnabled="

    .line 110
    .line 111
    .line 112
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v0, ", openUrlIntent="

    .line 118
    .line 119
    .line 120
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v0, ", consentChangedIntent="

    .line 126
    .line 127
    .line 128
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v0, ", confirmAction="

    .line 134
    .line 135
    .line 136
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v0, ", skipAction="

    .line 142
    .line 143
    .line 144
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v0, ")"

    .line 150
    .line 151
    .line 152
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    move-result-object v0

    .line 157
    return-object v0
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
