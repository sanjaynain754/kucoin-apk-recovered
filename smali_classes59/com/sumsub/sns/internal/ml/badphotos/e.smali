.class public final Lcom/sumsub/sns/internal/ml/badphotos/e;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:F

.field public final c:F

.field public final d:J

.field public final e:Z

.field public final f:Ljava/util/List;

.field public final g:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 10

    .line 9
    const-string v0, "IDENTITY3"

    const-string v1, "IDENTITY4"

    const-string v2, "IDENTITY"

    const-string v3, "IDENTITY2"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v7, 0x1

    const/4 v9, 0x1

    .line 11
    const-string/jumbo v2, "unsatisfactory_photos_v2.tflite"

    const/high16 v3, 0x3f400000    # 0.75f

    const v4, 0x3e4ccccd    # 0.2f

    const-wide/16 v5, 0xbb8

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/sumsub/sns/internal/ml/badphotos/e;-><init>(Ljava/lang/String;FFJZLjava/util/List;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FFJZLjava/util/List;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->a:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->b:F

    .line 4
    iput p3, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->c:F

    .line 5
    iput-wide p4, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->d:J

    .line 6
    iput-boolean p6, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->e:Z

    .line 7
    iput-object p7, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->f:Ljava/util/List;

    .line 8
    iput p8, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->g:I

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
    instance-of v1, p1, Lcom/sumsub/sns/internal/ml/badphotos/e;

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
    check-cast p1, Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/ml/badphotos/e;->a:Ljava/lang/String;

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
    iget v1, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->b:F

    .line 26
    .line 27
    iget v3, p1, Lcom/sumsub/sns/internal/ml/badphotos/e;->b:F

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 31
    move-result v1

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    return v2

    .line 35
    .line 36
    :cond_3
    iget v1, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->c:F

    .line 37
    .line 38
    iget v3, p1, Lcom/sumsub/sns/internal/ml/badphotos/e;->c:F

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 42
    move-result v1

    .line 43
    .line 44
    if-eqz v1, :cond_4

    .line 45
    return v2

    .line 46
    .line 47
    :cond_4
    iget-wide v3, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->d:J

    .line 48
    .line 49
    iget-wide v5, p1, Lcom/sumsub/sns/internal/ml/badphotos/e;->d:J

    .line 50
    .line 51
    cmp-long v1, v3, v5

    .line 52
    .line 53
    if-eqz v1, :cond_5

    .line 54
    return v2

    .line 55
    .line 56
    :cond_5
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->e:Z

    .line 57
    .line 58
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/ml/badphotos/e;->e:Z

    .line 59
    .line 60
    if-eq v1, v3, :cond_6

    .line 61
    return v2

    .line 62
    .line 63
    :cond_6
    iget-object v1, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->f:Ljava/util/List;

    .line 64
    .line 65
    iget-object v3, p1, Lcom/sumsub/sns/internal/ml/badphotos/e;->f:Ljava/util/List;

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    move-result v1

    .line 70
    .line 71
    if-nez v1, :cond_7

    .line 72
    return v2

    .line 73
    .line 74
    :cond_7
    iget v1, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->g:I

    .line 75
    .line 76
    iget p1, p1, Lcom/sumsub/sns/internal/ml/badphotos/e;->g:I

    .line 77
    .line 78
    if-eq v1, p1, :cond_8

    .line 79
    return v2

    .line 80
    :cond_8
    return v0
    .line 81
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->a:Ljava/lang/String;

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
    iget v2, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->b:F

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    .line 19
    iget v0, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->c:F

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    .line 27
    iget-wide v2, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->d:J

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    .line 35
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->e:Z

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v2, v1}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 39
    move-result v0

    .line 40
    .line 41
    iget-object v2, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->f:Ljava/util/List;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    .line 49
    iget v0, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->g:I

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 53
    move-result v0

    .line 54
    add-int/2addr v0, v2

    .line 55
    return v0
    .line 56
    .line 57
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->a:Ljava/lang/String;

    .line 3
    .line 4
    iget v1, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->b:F

    .line 5
    .line 6
    iget v2, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->c:F

    .line 7
    .line 8
    iget-wide v3, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->d:J

    .line 9
    .line 10
    iget-boolean v5, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->e:Z

    .line 11
    .line 12
    iget-object v6, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->f:Ljava/util/List;

    .line 13
    .line 14
    iget v7, p0, Lcom/sumsub/sns/internal/ml/badphotos/e;->g:I

    .line 15
    .line 16
    new-instance v8, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    const-string v9, "BadPhotosMobileConfig(model="

    .line 22
    .line 23
    .line 24
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v0, ", highQualityThreshold="

    .line 30
    .line 31
    .line 32
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v0, ", lowQualityThreshold="

    .line 38
    .line 39
    .line 40
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v0, ", executionTimeoutMs="

    .line 46
    .line 47
    .line 48
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v0, ", allowCache="

    .line 54
    .line 55
    .line 56
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v0, ", allowedSteps="

    .line 62
    .line 63
    .line 64
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v0, ", maxBlockedAttemptsCount="

    .line 70
    .line 71
    .line 72
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v0, ")"

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    move-result-object v0

    .line 85
    return-object v0
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
.end method
