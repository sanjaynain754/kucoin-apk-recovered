.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;
.super Lcom/sumsub/sns/internal/features/presentation/preview/e;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;

.field public final c:Z

.field public final d:Z

.field public final e:Lcom/sumsub/sns/internal/features/presentation/preview/photo/p;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;ZLcom/sumsub/sns/internal/features/presentation/preview/photo/p;I)V
    .locals 6

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    .line 1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p4, 0x4

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    :cond_1
    move v3, p2

    and-int/lit8 p1, p4, 0x10

    if-eqz p1, :cond_2

    const/4 p3, 0x0

    :cond_2
    move-object v5, p3

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    .line 2
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;-><init>(Ljava/util/List;Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;ZZLcom/sumsub/sns/internal/features/presentation/preview/photo/p;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;ZZLcom/sumsub/sns/internal/features/presentation/preview/photo/p;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/e;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->a:Ljava/util/List;

    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;

    .line 6
    iput-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->c:Z

    .line 7
    iput-boolean p4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->d:Z

    .line 8
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->e:Lcom/sumsub/sns/internal/features/presentation/preview/photo/p;

    return-void
.end method

.method public static a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;Ljava/util/ArrayList;Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;ZZLcom/sumsub/sns/internal/features/presentation/preview/photo/p;I)Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;
    .locals 6

    .line 1
    .line 2
    and-int/lit8 v0, p6, 0x1

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->a:Ljava/util/List;

    .line 7
    :cond_0
    move-object v1, p1

    .line 8
    .line 9
    and-int/lit8 p1, p6, 0x2

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;

    .line 14
    :cond_1
    move-object v2, p2

    .line 15
    .line 16
    and-int/lit8 p1, p6, 0x4

    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    iget-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->c:Z

    .line 21
    :cond_2
    move v3, p3

    .line 22
    .line 23
    and-int/lit8 p1, p6, 0x8

    .line 24
    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    iget-boolean p4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->d:Z

    .line 28
    :cond_3
    move v4, p4

    .line 29
    .line 30
    and-int/lit8 p1, p6, 0x10

    .line 31
    .line 32
    if-eqz p1, :cond_4

    .line 33
    .line 34
    iget-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->e:Lcom/sumsub/sns/internal/features/presentation/preview/photo/p;

    .line 35
    :cond_4
    move-object v5, p5

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;-><init>(Ljava/util/List;Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;ZZLcom/sumsub/sns/internal/features/presentation/preview/photo/p;)V

    .line 44
    return-object v0
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
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
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->a:Ljava/util/List;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->a:Ljava/util/List;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;

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
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->c:Z

    .line 37
    .line 38
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->c:Z

    .line 39
    .line 40
    if-eq v1, v3, :cond_4

    .line 41
    return v2

    .line 42
    .line 43
    :cond_4
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->d:Z

    .line 44
    .line 45
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->d:Z

    .line 46
    .line 47
    if-eq v1, v3, :cond_5

    .line 48
    return v2

    .line 49
    .line 50
    :cond_5
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->e:Lcom/sumsub/sns/internal/features/presentation/preview/photo/p;

    .line 51
    .line 52
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->e:Lcom/sumsub/sns/internal/features/presentation/preview/photo/p;

    .line 53
    .line 54
    .line 55
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    move-result p1

    .line 57
    .line 58
    if-nez p1, :cond_6

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->a:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;

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
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;->hashCode()I

    .line 20
    move-result v2

    .line 21
    :goto_0
    add-int/2addr v0, v2

    .line 22
    mul-int/2addr v0, v1

    .line 23
    .line 24
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->c:Z

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v0, v1}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 28
    move-result v0

    .line 29
    .line 30
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->d:Z

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v0, v1}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 34
    move-result v0

    .line 35
    .line 36
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->e:Lcom/sumsub/sns/internal/features/presentation/preview/photo/p;

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    goto :goto_1

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/p;->hashCode()I

    .line 43
    move-result v3

    .line 44
    :goto_1
    add-int/2addr v0, v3

    .line 45
    return v0
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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->a:Ljava/util/List;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/u;

    .line 5
    .line 6
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->c:Z

    .line 7
    .line 8
    iget-boolean v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->d:Z

    .line 9
    .line 10
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/t;->e:Lcom/sumsub/sns/internal/features/presentation/preview/photo/p;

    .line 11
    .line 12
    new-instance v5, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v6, "SNSPreviewPhotoDocumentViewState(documents="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v0, ", warning="

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, ", rotationAvailable="

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
    const-string v0, ", showContent="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v0, ", content="

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
