.class public final Lcom/sumsub/sns/internal/ml/autocapture/d;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final m:Lcom/sumsub/sns/internal/ml/autocapture/b;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:J

.field public final d:J

.field public final e:F

.field public final f:F

.field public final g:F

.field public final h:F

.field public final i:F

.field public final j:Lcom/sumsub/sns/internal/ml/autocapture/a;

.field public final k:Landroid/util/Size;

.field public final l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/ml/autocapture/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/ml/autocapture/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->m:Lcom/sumsub/sns/internal/ml/autocapture/b;

    .line 8
    return-void
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

.method public synthetic constructor <init>()V
    .locals 15

    .line 14
    new-instance v12, Lcom/sumsub/sns/internal/ml/autocapture/a;

    invoke-direct {v12}, Lcom/sumsub/sns/internal/ml/autocapture/a;-><init>()V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x5dc

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, 0x3dcccccd    # 0.1f

    const v10, 0x3dcccccd    # 0.1f

    const/high16 v11, 0x3fe00000    # 1.75f

    move-object v0, p0

    .line 15
    invoke-direct/range {v0 .. v14}, Lcom/sumsub/sns/internal/ml/autocapture/d;-><init>(ZZJJFFFFFLcom/sumsub/sns/internal/ml/autocapture/a;Landroid/util/Size;Z)V

    return-void
.end method

.method public constructor <init>(ZZJJFFFFFLcom/sumsub/sns/internal/ml/autocapture/a;Landroid/util/Size;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->a:Z

    .line 3
    iput-boolean p2, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->b:Z

    .line 4
    iput-wide p3, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->c:J

    .line 5
    iput-wide p5, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->d:J

    .line 6
    iput p7, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->e:F

    .line 7
    iput p8, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->f:F

    .line 8
    iput p9, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->g:F

    .line 9
    iput p10, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->h:F

    .line 10
    iput p11, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->i:F

    .line 11
    iput-object p12, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->j:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 12
    iput-object p13, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->k:Landroid/util/Size;

    .line 13
    iput-boolean p14, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->l:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

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
    instance-of v1, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;

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
    check-cast p1, Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 13
    .line 14
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->a:Z

    .line 15
    .line 16
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->a:Z

    .line 17
    .line 18
    if-eq v1, v3, :cond_2

    .line 19
    return v2

    .line 20
    .line 21
    :cond_2
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->b:Z

    .line 22
    .line 23
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->b:Z

    .line 24
    .line 25
    if-eq v1, v3, :cond_3

    .line 26
    return v2

    .line 27
    .line 28
    :cond_3
    iget-wide v3, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->c:J

    .line 29
    .line 30
    iget-wide v5, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->c:J

    .line 31
    .line 32
    cmp-long v1, v3, v5

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    return v2

    .line 36
    .line 37
    :cond_4
    iget-wide v3, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->d:J

    .line 38
    .line 39
    iget-wide v5, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->d:J

    .line 40
    .line 41
    cmp-long v1, v3, v5

    .line 42
    .line 43
    if-eqz v1, :cond_5

    .line 44
    return v2

    .line 45
    .line 46
    :cond_5
    iget v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->e:F

    .line 47
    .line 48
    iget v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->e:F

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 52
    move-result v1

    .line 53
    .line 54
    if-eqz v1, :cond_6

    .line 55
    return v2

    .line 56
    .line 57
    :cond_6
    iget v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->f:F

    .line 58
    .line 59
    iget v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->f:F

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 63
    move-result v1

    .line 64
    .line 65
    if-eqz v1, :cond_7

    .line 66
    return v2

    .line 67
    .line 68
    :cond_7
    iget v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->g:F

    .line 69
    .line 70
    iget v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->g:F

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_8

    .line 77
    return v2

    .line 78
    .line 79
    :cond_8
    iget v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->h:F

    .line 80
    .line 81
    iget v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->h:F

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 85
    move-result v1

    .line 86
    .line 87
    if-eqz v1, :cond_9

    .line 88
    return v2

    .line 89
    .line 90
    :cond_9
    iget v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->i:F

    .line 91
    .line 92
    iget v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->i:F

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 96
    move-result v1

    .line 97
    .line 98
    if-eqz v1, :cond_a

    .line 99
    return v2

    .line 100
    .line 101
    :cond_a
    iget-object v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->j:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 102
    .line 103
    iget-object v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->j:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    move-result v1

    .line 108
    .line 109
    if-nez v1, :cond_b

    .line 110
    return v2

    .line 111
    .line 112
    :cond_b
    iget-object v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->k:Landroid/util/Size;

    .line 113
    .line 114
    iget-object v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->k:Landroid/util/Size;

    .line 115
    .line 116
    .line 117
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    move-result v1

    .line 119
    .line 120
    if-nez v1, :cond_c

    .line 121
    return v2

    .line 122
    .line 123
    :cond_c
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->l:Z

    .line 124
    .line 125
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/ml/autocapture/d;->l:Z

    .line 126
    .line 127
    if-eq v1, p1, :cond_d

    .line 128
    return v2

    .line 129
    :cond_d
    return v0
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
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->a:Z

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->b:Z

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget-wide v2, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->c:J

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v2, v1}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 28
    move-result v2

    .line 29
    .line 30
    iget-wide v3, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->d:J

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 34
    move-result v3

    .line 35
    add-int/2addr v3, v2

    .line 36
    mul-int/2addr v3, v1

    .line 37
    .line 38
    iget v2, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->e:F

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 42
    move-result v2

    .line 43
    add-int/2addr v2, v3

    .line 44
    mul-int/2addr v2, v1

    .line 45
    .line 46
    iget v3, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->f:F

    .line 47
    .line 48
    .line 49
    invoke-static {v3}, Ljava/lang/Float;->hashCode(F)I

    .line 50
    move-result v3

    .line 51
    add-int/2addr v3, v2

    .line 52
    mul-int/2addr v3, v1

    .line 53
    .line 54
    iget v2, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->g:F

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 58
    move-result v2

    .line 59
    add-int/2addr v2, v3

    .line 60
    mul-int/2addr v2, v1

    .line 61
    .line 62
    iget v3, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->h:F

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, Ljava/lang/Float;->hashCode(F)I

    .line 66
    move-result v3

    .line 67
    add-int/2addr v3, v2

    .line 68
    mul-int/2addr v3, v1

    .line 69
    .line 70
    iget v2, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->i:F

    .line 71
    .line 72
    .line 73
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 74
    move-result v2

    .line 75
    add-int/2addr v2, v3

    .line 76
    mul-int/2addr v2, v1

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v2, v1}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 80
    move-result v2

    .line 81
    .line 82
    iget-object v3, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->j:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/ml/autocapture/a;->hashCode()I

    .line 86
    move-result v3

    .line 87
    add-int/2addr v3, v2

    .line 88
    mul-int/2addr v3, v1

    .line 89
    .line 90
    iget-object v2, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->k:Landroid/util/Size;

    .line 91
    .line 92
    if-nez v2, :cond_0

    .line 93
    goto :goto_0

    .line 94
    .line 95
    .line 96
    :cond_0
    invoke-virtual {v2}, Landroid/util/Size;->hashCode()I

    .line 97
    move-result v0

    .line 98
    :goto_0
    add-int/2addr v3, v0

    .line 99
    mul-int/2addr v3, v1

    .line 100
    .line 101
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/ml/autocapture/d;->l:Z

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 105
    move-result v0

    .line 106
    add-int/2addr v0, v3

    .line 107
    return v0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-boolean v1, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->a:Z

    .line 5
    .line 6
    iget-boolean v2, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->b:Z

    .line 7
    .line 8
    iget-wide v3, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->c:J

    .line 9
    .line 10
    iget-wide v5, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->d:J

    .line 11
    .line 12
    iget v7, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->e:F

    .line 13
    .line 14
    iget v8, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->f:F

    .line 15
    .line 16
    iget v9, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->g:F

    .line 17
    .line 18
    iget v10, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->h:F

    .line 19
    .line 20
    iget v11, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->i:F

    .line 21
    .line 22
    iget-object v12, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->j:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 23
    .line 24
    iget-object v13, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->k:Landroid/util/Size;

    .line 25
    .line 26
    iget-boolean v14, v0, Lcom/sumsub/sns/internal/ml/autocapture/d;->l:Z

    .line 27
    .line 28
    new-instance v15, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    const-string v0, "DocumentAutocaptureMobileConfig(enabled="

    .line 34
    .line 35
    .line 36
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v0, ", showBounds="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v0, ", waitForBetterPhotoMs="

    .line 50
    .line 51
    .line 52
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v15, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v0, ", enableInsideFrameAutoShot="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    const/4 v0, 0x0

    .line 62
    .line 63
    .line 64
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v1, ", insideFrameAutoShotTimeoutMs="

    .line 67
    .line 68
    .line 69
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v15, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, ", requiredFrameFillRatio="

    .line 75
    .line 76
    .line 77
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v1, ", requiredFrameFillRatioV2="

    .line 83
    .line 84
    .line 85
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v1, ", requiredLargestSizeOffsetRatio="

    .line 91
    .line 92
    .line 93
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v1, ", requiredLargestSizeOffsetRatioV2="

    .line 99
    .line 100
    .line 101
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v1, ", frameAspectRatio="

    .line 107
    .line 108
    .line 109
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v1, ", enableCropToFrame="

    .line 115
    .line 116
    .line 117
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v0, ", autoCaptureModel="

    .line 123
    .line 124
    .line 125
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v0, ", frameSize="

    .line 131
    .line 132
    .line 133
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v0, ", imageCaptureUseCaseEnabled="

    .line 139
    .line 140
    .line 141
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string v0, ")"

    .line 147
    .line 148
    .line 149
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    move-result-object v0

    .line 154
    return-object v0
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
