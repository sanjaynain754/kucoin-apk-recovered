.class public Landroidx/media3/extractor/ConstantBitrateSeekMap;
.super Ljava/lang/Object;
.source "ConstantBitrateSeekMap.java"

# interfaces
.implements Landroidx/media3/extractor/SeekMap;


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# instance fields
.field private final allowSeeksIfLengthUnknown:Z

.field private final bitrate:I

.field private final dataSize:J

.field private final durationUs:J

.field private final firstFrameBytePosition:J

.field private final frameSize:I

.field private final inputLength:J


# direct methods
.method public constructor <init>(JJII)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    move v6, p6

    .line 1
    invoke-direct/range {v0 .. v7}, Landroidx/media3/extractor/ConstantBitrateSeekMap;-><init>(JJIIZ)V

    return-void
.end method

.method public constructor <init>(JJIIZ)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->inputLength:J

    .line 4
    iput-wide p3, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->firstFrameBytePosition:J

    const/4 v0, -0x1

    if-ne p6, v0, :cond_0

    const/4 p6, 0x1

    .line 5
    :cond_0
    iput p6, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->frameSize:I

    .line 6
    iput p5, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->bitrate:I

    .line 7
    iput-boolean p7, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->allowSeeksIfLengthUnknown:Z

    const-wide/16 p6, -0x1

    cmp-long v0, p1, p6

    if-nez v0, :cond_1

    .line 8
    iput-wide p6, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->dataSize:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide p1, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->durationUs:J

    return-void

    :cond_1
    sub-long p6, p1, p3

    .line 10
    iput-wide p6, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->dataSize:J

    .line 11
    invoke-static {p1, p2, p3, p4, p5}, Landroidx/media3/extractor/ConstantBitrateSeekMap;->getTimeUsAtPosition(JJI)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->durationUs:J

    return-void
.end method

.method private getFramePositionForTimeUs(J)J
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->bitrate:I

    .line 3
    int-to-long v0, v0

    .line 4
    mul-long/2addr p1, v0

    .line 5
    .line 6
    .line 7
    const-wide/32 v0, 0x7a1200

    .line 8
    div-long/2addr p1, v0

    .line 9
    .line 10
    iget v0, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->frameSize:I

    .line 11
    int-to-long v1, v0

    .line 12
    div-long/2addr p1, v1

    .line 13
    int-to-long v1, v0

    .line 14
    mul-long/2addr p1, v1

    .line 15
    .line 16
    iget-wide v1, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->dataSize:J

    .line 17
    .line 18
    const-wide/16 v3, -0x1

    .line 19
    .line 20
    cmp-long v3, v1, v3

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    int-to-long v3, v0

    .line 24
    sub-long/2addr v1, v3

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 28
    move-result-wide p1

    .line 29
    .line 30
    :cond_0
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 34
    move-result-wide p1

    .line 35
    .line 36
    iget-wide v0, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->firstFrameBytePosition:J

    .line 37
    add-long/2addr v0, p1

    .line 38
    return-wide v0
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
.end method

.method private static getTimeUsAtPosition(JJI)J
    .locals 2

    const-wide/16 v0, 0x0

    sub-long/2addr p0, p2

    .line 2
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    const-wide/32 p2, 0x7a1200

    mul-long/2addr p0, p2

    int-to-long p2, p4

    div-long/2addr p0, p2

    return-wide p0
.end method


# virtual methods
.method public getDurationUs()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->durationUs:J

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
    .locals 9

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->dataSize:J

    .line 3
    .line 4
    const-wide/16 v2, -0x1

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->allowSeeksIfLengthUnknown:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance p1, Landroidx/media3/extractor/SeekMap$SeekPoints;

    .line 15
    .line 16
    new-instance p2, Landroidx/media3/extractor/SeekPoint;

    .line 17
    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    iget-wide v2, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->firstFrameBytePosition:J

    .line 21
    .line 22
    .line 23
    invoke-direct {p2, v0, v1, v2, v3}, Landroidx/media3/extractor/SeekPoint;-><init>(JJ)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p2}, Landroidx/media3/extractor/SeekMap$SeekPoints;-><init>(Landroidx/media3/extractor/SeekPoint;)V

    .line 27
    return-object p1

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/media3/extractor/ConstantBitrateSeekMap;->getFramePositionForTimeUs(J)J

    .line 31
    move-result-wide v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Landroidx/media3/extractor/ConstantBitrateSeekMap;->getTimeUsAtPosition(J)J

    .line 35
    move-result-wide v4

    .line 36
    .line 37
    new-instance v6, Landroidx/media3/extractor/SeekPoint;

    .line 38
    .line 39
    .line 40
    invoke-direct {v6, v4, v5, v0, v1}, Landroidx/media3/extractor/SeekPoint;-><init>(JJ)V

    .line 41
    .line 42
    iget-wide v7, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->dataSize:J

    .line 43
    .line 44
    cmp-long v2, v7, v2

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    cmp-long p1, v4, p1

    .line 49
    .line 50
    if-gez p1, :cond_2

    .line 51
    .line 52
    iget p1, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->frameSize:I

    .line 53
    int-to-long v2, p1

    .line 54
    add-long/2addr v2, v0

    .line 55
    .line 56
    iget-wide v4, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->inputLength:J

    .line 57
    .line 58
    cmp-long p2, v2, v4

    .line 59
    .line 60
    if-ltz p2, :cond_1

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    int-to-long p1, p1

    .line 63
    add-long/2addr v0, p1

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0, v1}, Landroidx/media3/extractor/ConstantBitrateSeekMap;->getTimeUsAtPosition(J)J

    .line 67
    move-result-wide p1

    .line 68
    .line 69
    new-instance v2, Landroidx/media3/extractor/SeekPoint;

    .line 70
    .line 71
    .line 72
    invoke-direct {v2, p1, p2, v0, v1}, Landroidx/media3/extractor/SeekPoint;-><init>(JJ)V

    .line 73
    .line 74
    new-instance p1, Landroidx/media3/extractor/SeekMap$SeekPoints;

    .line 75
    .line 76
    .line 77
    invoke-direct {p1, v6, v2}, Landroidx/media3/extractor/SeekMap$SeekPoints;-><init>(Landroidx/media3/extractor/SeekPoint;Landroidx/media3/extractor/SeekPoint;)V

    .line 78
    return-object p1

    .line 79
    .line 80
    :cond_2
    :goto_0
    new-instance p1, Landroidx/media3/extractor/SeekMap$SeekPoints;

    .line 81
    .line 82
    .line 83
    invoke-direct {p1, v6}, Landroidx/media3/extractor/SeekMap$SeekPoints;-><init>(Landroidx/media3/extractor/SeekPoint;)V

    .line 84
    return-object p1
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
.end method

.method public getTimeUsAtPosition(J)J
    .locals 3

    .line 1
    iget-wide v0, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->firstFrameBytePosition:J

    iget v2, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->bitrate:I

    invoke-static {p1, p2, v0, v1, v2}, Landroidx/media3/extractor/ConstantBitrateSeekMap;->getTimeUsAtPosition(JJI)J

    move-result-wide p1

    return-wide p1
.end method

.method public isSeekable()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->dataSize:J

    .line 3
    .line 4
    const-wide/16 v2, -0x1

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-boolean v0, p0, Landroidx/media3/extractor/ConstantBitrateSeekMap;->allowSeeksIfLengthUnknown:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
    .line 18
.end method
