.class public final Landroidx/media3/extractor/FlacSeekTableSeekMap;
.super Ljava/lang/Object;
.source "FlacSeekTableSeekMap.java"

# interfaces
.implements Landroidx/media3/extractor/SeekMap;


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# instance fields
.field private final firstFrameOffset:J

.field private final flacStreamMetadata:Landroidx/media3/extractor/FlacStreamMetadata;


# direct methods
.method public constructor <init>(Landroidx/media3/extractor/FlacStreamMetadata;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/extractor/FlacSeekTableSeekMap;->flacStreamMetadata:Landroidx/media3/extractor/FlacStreamMetadata;

    .line 6
    .line 7
    iput-wide p2, p0, Landroidx/media3/extractor/FlacSeekTableSeekMap;->firstFrameOffset:J

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
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
.end method

.method private getSeekPoint(JJ)Landroidx/media3/extractor/SeekPoint;
    .locals 2

    .line 1
    .line 2
    .line 3
    const-wide/32 v0, 0xf4240

    .line 4
    mul-long/2addr p1, v0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/extractor/FlacSeekTableSeekMap;->flacStreamMetadata:Landroidx/media3/extractor/FlacStreamMetadata;

    .line 7
    .line 8
    iget v0, v0, Landroidx/media3/extractor/FlacStreamMetadata;->sampleRate:I

    .line 9
    int-to-long v0, v0

    .line 10
    div-long/2addr p1, v0

    .line 11
    .line 12
    iget-wide v0, p0, Landroidx/media3/extractor/FlacSeekTableSeekMap;->firstFrameOffset:J

    .line 13
    add-long/2addr v0, p3

    .line 14
    .line 15
    new-instance p3, Landroidx/media3/extractor/SeekPoint;

    .line 16
    .line 17
    .line 18
    invoke-direct {p3, p1, p2, v0, v1}, Landroidx/media3/extractor/SeekPoint;-><init>(JJ)V

    .line 19
    return-object p3
    .line 20
    .line 21
    .line 22
    .line 23
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
.end method


# virtual methods
.method public getDurationUs()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/FlacSeekTableSeekMap;->flacStreamMetadata:Landroidx/media3/extractor/FlacStreamMetadata;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/extractor/FlacStreamMetadata;->getDurationUs()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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
    iget-object v0, p0, Landroidx/media3/extractor/FlacSeekTableSeekMap;->flacStreamMetadata:Landroidx/media3/extractor/FlacStreamMetadata;

    .line 3
    .line 4
    iget-object v0, v0, Landroidx/media3/extractor/FlacStreamMetadata;->seekTable:Landroidx/media3/extractor/FlacStreamMetadata$SeekTable;

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/extractor/FlacSeekTableSeekMap;->flacStreamMetadata:Landroidx/media3/extractor/FlacStreamMetadata;

    .line 10
    .line 11
    iget-object v1, v0, Landroidx/media3/extractor/FlacStreamMetadata;->seekTable:Landroidx/media3/extractor/FlacStreamMetadata$SeekTable;

    .line 12
    .line 13
    iget-object v2, v1, Landroidx/media3/extractor/FlacStreamMetadata$SeekTable;->pointSampleNumbers:[J

    .line 14
    .line 15
    iget-object v1, v1, Landroidx/media3/extractor/FlacStreamMetadata$SeekTable;->pointOffsets:[J

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Landroidx/media3/extractor/FlacStreamMetadata;->getSampleNumber(J)J

    .line 19
    move-result-wide v3

    .line 20
    const/4 v0, 0x0

    .line 21
    const/4 v5, 0x1

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3, v4, v5, v0}, Landroidx/media3/common/util/Util;->binarySearchFloor([JJZZ)I

    .line 25
    move-result v0

    .line 26
    .line 27
    const-wide/16 v3, 0x0

    .line 28
    const/4 v6, -0x1

    .line 29
    .line 30
    if-ne v0, v6, :cond_0

    .line 31
    move-wide v7, v3

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_0
    aget-wide v7, v2, v0

    .line 35
    .line 36
    :goto_0
    if-ne v0, v6, :cond_1

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_1
    aget-wide v3, v1, v0

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-direct {p0, v7, v8, v3, v4}, Landroidx/media3/extractor/FlacSeekTableSeekMap;->getSeekPoint(JJ)Landroidx/media3/extractor/SeekPoint;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    iget-wide v6, v3, Landroidx/media3/extractor/SeekPoint;->timeUs:J

    .line 46
    .line 47
    cmp-long p1, v6, p1

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    array-length p1, v2

    .line 51
    sub-int/2addr p1, v5

    .line 52
    .line 53
    if-ne v0, p1, :cond_2

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    add-int/2addr v0, v5

    .line 56
    .line 57
    aget-wide p1, v2, v0

    .line 58
    .line 59
    aget-wide v0, v1, v0

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/media3/extractor/FlacSeekTableSeekMap;->getSeekPoint(JJ)Landroidx/media3/extractor/SeekPoint;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    new-instance p2, Landroidx/media3/extractor/SeekMap$SeekPoints;

    .line 66
    .line 67
    .line 68
    invoke-direct {p2, v3, p1}, Landroidx/media3/extractor/SeekMap$SeekPoints;-><init>(Landroidx/media3/extractor/SeekPoint;Landroidx/media3/extractor/SeekPoint;)V

    .line 69
    return-object p2

    .line 70
    .line 71
    :cond_3
    :goto_2
    new-instance p1, Landroidx/media3/extractor/SeekMap$SeekPoints;

    .line 72
    .line 73
    .line 74
    invoke-direct {p1, v3}, Landroidx/media3/extractor/SeekMap$SeekPoints;-><init>(Landroidx/media3/extractor/SeekPoint;)V

    .line 75
    return-object p1
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
