.class final Landroidx/media3/extractor/wav/WavSeekMap;
.super Ljava/lang/Object;
.source "WavSeekMap.java"

# interfaces
.implements Landroidx/media3/extractor/SeekMap;


# instance fields
.field private final blockCount:J

.field private final durationUs:J

.field private final firstBlockPosition:J

.field private final framesPerBlock:I

.field private final wavFormat:Landroidx/media3/extractor/wav/WavFormat;


# direct methods
.method public constructor <init>(Landroidx/media3/extractor/wav/WavFormat;IJJ)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/extractor/wav/WavSeekMap;->wavFormat:Landroidx/media3/extractor/wav/WavFormat;

    .line 6
    .line 7
    iput p2, p0, Landroidx/media3/extractor/wav/WavSeekMap;->framesPerBlock:I

    .line 8
    .line 9
    iput-wide p3, p0, Landroidx/media3/extractor/wav/WavSeekMap;->firstBlockPosition:J

    .line 10
    sub-long/2addr p5, p3

    .line 11
    .line 12
    iget p1, p1, Landroidx/media3/extractor/wav/WavFormat;->blockSize:I

    .line 13
    int-to-long p1, p1

    .line 14
    div-long/2addr p5, p1

    .line 15
    .line 16
    iput-wide p5, p0, Landroidx/media3/extractor/wav/WavSeekMap;->blockCount:J

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p5, p6}, Landroidx/media3/extractor/wav/WavSeekMap;->blockIndexToTimeUs(J)J

    .line 20
    move-result-wide p1

    .line 21
    .line 22
    iput-wide p1, p0, Landroidx/media3/extractor/wav/WavSeekMap;->durationUs:J

    .line 23
    return-void
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
.end method

.method private blockIndexToTimeUs(J)J
    .locals 8

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/extractor/wav/WavSeekMap;->framesPerBlock:I

    .line 3
    int-to-long v0, v0

    .line 4
    .line 5
    mul-long v2, p1, v0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/media3/extractor/wav/WavSeekMap;->wavFormat:Landroidx/media3/extractor/wav/WavFormat;

    .line 8
    .line 9
    iget p1, p1, Landroidx/media3/extractor/wav/WavFormat;->frameRateHz:I

    .line 10
    int-to-long v6, p1

    .line 11
    .line 12
    .line 13
    const-wide/32 v4, 0xf4240

    .line 14
    .line 15
    .line 16
    invoke-static/range {v2 .. v7}, Landroidx/media3/common/util/Util;->scaleLargeTimestamp(JJJ)J

    .line 17
    move-result-wide p1

    .line 18
    return-wide p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public getDurationUs()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/extractor/wav/WavSeekMap;->durationUs:J

    .line 3
    return-wide v0
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
    .line 18
.end method

.method public getSeekPoints(J)Landroidx/media3/extractor/SeekMap$SeekPoints;
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/wav/WavSeekMap;->wavFormat:Landroidx/media3/extractor/wav/WavFormat;

    .line 3
    .line 4
    iget v0, v0, Landroidx/media3/extractor/wav/WavFormat;->frameRateHz:I

    .line 5
    int-to-long v0, v0

    .line 6
    mul-long/2addr v0, p1

    .line 7
    .line 8
    iget v2, p0, Landroidx/media3/extractor/wav/WavSeekMap;->framesPerBlock:I

    .line 9
    int-to-long v2, v2

    .line 10
    .line 11
    .line 12
    const-wide/32 v4, 0xf4240

    .line 13
    mul-long/2addr v2, v4

    .line 14
    .line 15
    div-long v4, v0, v2

    .line 16
    .line 17
    iget-wide v0, p0, Landroidx/media3/extractor/wav/WavSeekMap;->blockCount:J

    .line 18
    .line 19
    const-wide/16 v2, 0x1

    .line 20
    .line 21
    sub-long v8, v0, v2

    .line 22
    .line 23
    const-wide/16 v6, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v4 .. v9}, Landroidx/media3/common/util/Util;->constrainValue(JJJ)J

    .line 27
    move-result-wide v0

    .line 28
    .line 29
    iget-wide v4, p0, Landroidx/media3/extractor/wav/WavSeekMap;->firstBlockPosition:J

    .line 30
    .line 31
    iget-object v6, p0, Landroidx/media3/extractor/wav/WavSeekMap;->wavFormat:Landroidx/media3/extractor/wav/WavFormat;

    .line 32
    .line 33
    iget v6, v6, Landroidx/media3/extractor/wav/WavFormat;->blockSize:I

    .line 34
    int-to-long v6, v6

    .line 35
    mul-long/2addr v6, v0

    .line 36
    add-long/2addr v4, v6

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v0, v1}, Landroidx/media3/extractor/wav/WavSeekMap;->blockIndexToTimeUs(J)J

    .line 40
    move-result-wide v6

    .line 41
    .line 42
    new-instance v8, Landroidx/media3/extractor/SeekPoint;

    .line 43
    .line 44
    .line 45
    invoke-direct {v8, v6, v7, v4, v5}, Landroidx/media3/extractor/SeekPoint;-><init>(JJ)V

    .line 46
    .line 47
    cmp-long p1, v6, p1

    .line 48
    .line 49
    if-gez p1, :cond_1

    .line 50
    .line 51
    iget-wide p1, p0, Landroidx/media3/extractor/wav/WavSeekMap;->blockCount:J

    .line 52
    sub-long/2addr p1, v2

    .line 53
    .line 54
    cmp-long p1, v0, p1

    .line 55
    .line 56
    if-nez p1, :cond_0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    add-long/2addr v0, v2

    .line 59
    .line 60
    iget-wide p1, p0, Landroidx/media3/extractor/wav/WavSeekMap;->firstBlockPosition:J

    .line 61
    .line 62
    iget-object v2, p0, Landroidx/media3/extractor/wav/WavSeekMap;->wavFormat:Landroidx/media3/extractor/wav/WavFormat;

    .line 63
    .line 64
    iget v2, v2, Landroidx/media3/extractor/wav/WavFormat;->blockSize:I

    .line 65
    int-to-long v2, v2

    .line 66
    mul-long/2addr v2, v0

    .line 67
    add-long/2addr p1, v2

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, v0, v1}, Landroidx/media3/extractor/wav/WavSeekMap;->blockIndexToTimeUs(J)J

    .line 71
    move-result-wide v0

    .line 72
    .line 73
    new-instance v2, Landroidx/media3/extractor/SeekPoint;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, v0, v1, p1, p2}, Landroidx/media3/extractor/SeekPoint;-><init>(JJ)V

    .line 77
    .line 78
    new-instance p1, Landroidx/media3/extractor/SeekMap$SeekPoints;

    .line 79
    .line 80
    .line 81
    invoke-direct {p1, v8, v2}, Landroidx/media3/extractor/SeekMap$SeekPoints;-><init>(Landroidx/media3/extractor/SeekPoint;Landroidx/media3/extractor/SeekPoint;)V

    .line 82
    return-object p1

    .line 83
    .line 84
    :cond_1
    :goto_0
    new-instance p1, Landroidx/media3/extractor/SeekMap$SeekPoints;

    .line 85
    .line 86
    .line 87
    invoke-direct {p1, v8}, Landroidx/media3/extractor/SeekMap$SeekPoints;-><init>(Landroidx/media3/extractor/SeekPoint;)V

    .line 88
    return-object p1
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
.end method

.method public isSeekable()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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
    .line 18
.end method
