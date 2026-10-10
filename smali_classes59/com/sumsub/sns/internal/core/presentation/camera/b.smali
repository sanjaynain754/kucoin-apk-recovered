.class public final Lcom/sumsub/sns/internal/core/presentation/camera/b;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:I

.field public final b:Landroidx/camera/video/Quality;

.field public final c:Landroidx/camera/video/Quality;

.field public final d:J

.field public final e:J


# direct methods
.method public synthetic constructor <init>()V
    .locals 8

    .line 7
    sget-object v2, Landroidx/camera/video/Quality;->HD:Landroidx/camera/video/Quality;

    .line 8
    sget-object v3, Landroidx/camera/video/Quality;->SD:Landroidx/camera/video/Quality;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    .line 9
    invoke-direct/range {v0 .. v7}, Lcom/sumsub/sns/internal/core/presentation/camera/b;-><init>(ILandroidx/camera/video/Quality;Landroidx/camera/video/Quality;JJ)V

    return-void
.end method

.method public constructor <init>(ILandroidx/camera/video/Quality;Landroidx/camera/video/Quality;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->a:I

    .line 3
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->b:Landroidx/camera/video/Quality;

    .line 4
    iput-object p3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->c:Landroidx/camera/video/Quality;

    .line 5
    iput-wide p4, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->d:J

    .line 6
    iput-wide p6, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->e:J

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
    instance-of v1, p1, Lcom/sumsub/sns/internal/core/presentation/camera/b;

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
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 13
    .line 14
    iget v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->a:I

    .line 15
    .line 16
    iget v3, p1, Lcom/sumsub/sns/internal/core/presentation/camera/b;->a:I

    .line 17
    .line 18
    if-eq v1, v3, :cond_2

    .line 19
    return v2

    .line 20
    .line 21
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->b:Landroidx/camera/video/Quality;

    .line 22
    .line 23
    iget-object v3, p1, Lcom/sumsub/sns/internal/core/presentation/camera/b;->b:Landroidx/camera/video/Quality;

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    return v2

    .line 31
    .line 32
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->c:Landroidx/camera/video/Quality;

    .line 33
    .line 34
    iget-object v3, p1, Lcom/sumsub/sns/internal/core/presentation/camera/b;->c:Landroidx/camera/video/Quality;

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-nez v1, :cond_4

    .line 41
    return v2

    .line 42
    .line 43
    :cond_4
    iget-wide v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->d:J

    .line 44
    .line 45
    iget-wide v5, p1, Lcom/sumsub/sns/internal/core/presentation/camera/b;->d:J

    .line 46
    .line 47
    cmp-long v1, v3, v5

    .line 48
    .line 49
    if-eqz v1, :cond_5

    .line 50
    return v2

    .line 51
    .line 52
    :cond_5
    iget-wide v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->e:J

    .line 53
    .line 54
    iget-wide v5, p1, Lcom/sumsub/sns/internal/core/presentation/camera/b;->e:J

    .line 55
    .line 56
    cmp-long p1, v3, v5

    .line 57
    .line 58
    if-eqz p1, :cond_6

    .line 59
    return v2

    .line 60
    :cond_6
    return v0
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

.method public final hashCode()I
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->a:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 6
    move-result v0

    .line 7
    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->b:Landroidx/camera/video/Quality;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    .line 17
    mul-int/lit8 v1, v1, 0x1f

    .line 18
    .line 19
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->c:Landroidx/camera/video/Quality;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-wide v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->d:J

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    .line 35
    mul-int/lit8 v1, v1, 0x1f

    .line 36
    .line 37
    iget-wide v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->e:J

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v1

    .line 43
    return v0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->a:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->b:Landroidx/camera/video/Quality;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->c:Landroidx/camera/video/Quality;

    .line 7
    .line 8
    iget-wide v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->d:J

    .line 9
    .line 10
    iget-wide v5, p0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->e:J

    .line 11
    .line 12
    new-instance v7, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v8, "VideoParams(bitRate="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v0, ", quality="

    .line 26
    .line 27
    .line 28
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, ", fallbackQuality="

    .line 34
    .line 35
    .line 36
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v0, ", durationLimitMs="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v0, ", fileSizeLimitBytes="

    .line 50
    .line 51
    .line 52
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v0, ")"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    return-object v0
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
.end method
