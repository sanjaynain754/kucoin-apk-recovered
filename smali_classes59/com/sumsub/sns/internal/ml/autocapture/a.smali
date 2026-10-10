.class public final Lcom/sumsub/sns/internal/ml/autocapture/a;
.super Lcom/sumsub/sns/internal/ml/autocapture/c;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:F

.field public final c:Z

.field public final d:Landroid/util/Size;

.field public final e:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 6

    .line 1
    new-instance v4, Landroid/util/Size;

    const/4 v0, 0x0

    invoke-direct {v4, v0, v0}, Landroid/util/Size;-><init>(II)V

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 2
    const-string v1, "autocapture_v1.tflite"

    const v2, 0x3e99999a    # 0.3f

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/ml/autocapture/a;-><init>(Ljava/lang/String;FZLandroid/util/Size;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FZLandroid/util/Size;I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/ml/autocapture/c;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->a:Ljava/lang/String;

    .line 5
    iput p2, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->b:F

    .line 6
    iput-boolean p3, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->c:Z

    .line 7
    iput-object p4, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 8
    iput p5, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->e:I

    return-void
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
    instance-of v1, p1, Lcom/sumsub/sns/internal/ml/autocapture/a;

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
    check-cast p1, Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/a;->a:Ljava/lang/String;

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
    iget v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->b:F

    .line 26
    .line 27
    iget v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/a;->b:F

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
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->c:Z

    .line 37
    .line 38
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/a;->c:Z

    .line 39
    .line 40
    if-eq v1, v3, :cond_4

    .line 41
    return v2

    .line 42
    .line 43
    :cond_4
    iget-object v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 44
    .line 45
    iget-object v3, p1, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    move-result v1

    .line 50
    .line 51
    if-nez v1, :cond_5

    .line 52
    return v2

    .line 53
    .line 54
    :cond_5
    iget v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->e:I

    .line 55
    .line 56
    iget p1, p1, Lcom/sumsub/sns/internal/ml/autocapture/a;->e:I

    .line 57
    .line 58
    if-eq v1, p1, :cond_6

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
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->a:Ljava/lang/String;

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
    iget v2, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->b:F

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
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->c:Z

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v2, v1}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 23
    move-result v0

    .line 24
    .line 25
    iget-object v2, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/util/Size;->hashCode()I

    .line 29
    move-result v2

    .line 30
    add-int/2addr v2, v0

    .line 31
    mul-int/2addr v2, v1

    .line 32
    .line 33
    iget v0, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->e:I

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 37
    move-result v0

    .line 38
    add-int/2addr v0, v2

    .line 39
    return v0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->a:Ljava/lang/String;

    .line 3
    .line 4
    iget v1, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->b:F

    .line 5
    .line 6
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->c:Z

    .line 7
    .line 8
    iget-object v3, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 9
    .line 10
    iget v4, p0, Lcom/sumsub/sns/internal/ml/autocapture/a;->e:I

    .line 11
    .line 12
    new-instance v5, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v6, "AutoCaptureModel(name="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v0, ", threshold="

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, ", allowCache="

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v0, ", inputSize="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v0, ", outputSize="

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v0, ")"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
