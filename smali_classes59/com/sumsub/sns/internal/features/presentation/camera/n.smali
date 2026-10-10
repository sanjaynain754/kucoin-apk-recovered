.class public final Lcom/sumsub/sns/internal/features/presentation/camera/n;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$id;->sns_helper:I

    .line 3
    .line 4
    sget v1, Lcom/sumsub/sns/R$id;->sns_dark_overlay:I

    .line 5
    .line 6
    sget v2, Lcom/sumsub/sns/R$id;->sns_brief_details:I

    .line 7
    .line 8
    sget v3, Lcom/sumsub/sns/R$id;->sns_intro_content:I

    .line 9
    .line 10
    sget v4, Lcom/sumsub/sns/R$id;->sns_helper_title:I

    .line 11
    .line 12
    sget v5, Lcom/sumsub/sns/R$id;->sns_helper_brief:I

    .line 13
    .line 14
    sget v6, Lcom/sumsub/sns/R$id;->sns_helper_details:I

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    iput v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->a:I

    .line 20
    .line 21
    iput v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->b:I

    .line 22
    .line 23
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->c:I

    .line 24
    .line 25
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->d:I

    .line 26
    .line 27
    iput v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->e:I

    .line 28
    .line 29
    iput v5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->f:I

    .line 30
    .line 31
    iput v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->g:I

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
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/n;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 13
    .line 14
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->a:I

    .line 15
    .line 16
    iget v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/n;->a:I

    .line 17
    .line 18
    if-eq v1, v3, :cond_2

    .line 19
    return v2

    .line 20
    .line 21
    :cond_2
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->b:I

    .line 22
    .line 23
    iget v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/n;->b:I

    .line 24
    .line 25
    if-eq v1, v3, :cond_3

    .line 26
    return v2

    .line 27
    .line 28
    :cond_3
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->c:I

    .line 29
    .line 30
    iget v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/n;->c:I

    .line 31
    .line 32
    if-eq v1, v3, :cond_4

    .line 33
    return v2

    .line 34
    .line 35
    :cond_4
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->d:I

    .line 36
    .line 37
    iget v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/n;->d:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_5

    .line 40
    return v2

    .line 41
    .line 42
    :cond_5
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->e:I

    .line 43
    .line 44
    iget v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/n;->e:I

    .line 45
    .line 46
    if-eq v1, v3, :cond_6

    .line 47
    return v2

    .line 48
    .line 49
    :cond_6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->f:I

    .line 50
    .line 51
    iget v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/n;->f:I

    .line 52
    .line 53
    if-eq v1, v3, :cond_7

    .line 54
    return v2

    .line 55
    .line 56
    :cond_7
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->g:I

    .line 57
    .line 58
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/n;->g:I

    .line 59
    .line 60
    if-eq v1, p1, :cond_8

    .line 61
    return v2

    .line 62
    :cond_8
    return v0
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
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->a:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->b:I

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Lcom/sumsub/sns/core/widget/a;->a(III)I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->c:I

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Lcom/sumsub/sns/core/widget/a;->a(III)I

    .line 21
    move-result v0

    .line 22
    .line 23
    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->d:I

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Lcom/sumsub/sns/core/widget/a;->a(III)I

    .line 27
    move-result v0

    .line 28
    .line 29
    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->e:I

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v0, v1}, Lcom/sumsub/sns/core/widget/a;->a(III)I

    .line 33
    move-result v0

    .line 34
    .line 35
    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->f:I

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v0, v1}, Lcom/sumsub/sns/core/widget/a;->a(III)I

    .line 39
    move-result v0

    .line 40
    .line 41
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->g:I

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 45
    move-result v1

    .line 46
    add-int/2addr v1, v0

    .line 47
    return v1
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
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->a:I

    .line 3
    .line 4
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->b:I

    .line 5
    .line 6
    iget v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->c:I

    .line 7
    .line 8
    iget v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->d:I

    .line 9
    .line 10
    iget v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->e:I

    .line 11
    .line 12
    iget v5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->f:I

    .line 13
    .line 14
    iget v6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->g:I

    .line 15
    .line 16
    new-instance v7, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    const-string v8, "Views(helperViewId="

    .line 22
    .line 23
    .line 24
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v0, ", darkOverlayId="

    .line 30
    .line 31
    .line 32
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v0, ", briefDetailsId="

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v0, ", introContentId="

    .line 46
    .line 47
    .line 48
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v0, ", helperTitleId="

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v0, ", helperBriefId="

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v0, ", helperDetailsId="

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v0, ")"

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
