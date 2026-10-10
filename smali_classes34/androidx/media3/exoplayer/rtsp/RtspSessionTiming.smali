.class final Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;
.super Ljava/lang/Object;
.source "RtspSessionTiming.java"


# static fields
.field public static final DEFAULT:Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;

.field private static final LIVE_START_TIME:J = 0x0L

.field private static final NPT_RANGE_PATTERN:Ljava/util/regex/Pattern;

.field private static final START_TIMING_NTP_FORMAT:Ljava/lang/String; = "npt=%.3f-"


# instance fields
.field public final startTimeMs:J

.field public final stopTimeMs:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;-><init>(JJ)V

    .line 13
    .line 14
    sput-object v0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->DEFAULT:Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;

    .line 15
    .line 16
    const-string v0, "npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?"

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    sput-object v0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->NPT_RANGE_PATTERN:Ljava/util/regex/Pattern;

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
.end method

.method private constructor <init>(JJ)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->startTimeMs:J

    .line 6
    .line 7
    iput-wide p3, p0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->stopTimeMs:J

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

.method public static getOffsetStartTimeTiming(J)Ljava/lang/String;
    .locals 2

    .line 1
    long-to-double p0, p0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 7
    div-double/2addr p0, v0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    const-string p1, "npt=%.3f-"

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p0}, Landroidx/media3/common/util/Util;->formatInvariant(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    move-result-object p0

    .line 22
    return-object p0
    .line 23
.end method

.method public static parseTiming(Ljava/lang/String;)Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->NPT_RANGE_PATTERN:Ljava/util/regex/Pattern;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p0}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->checkManifestExpression(ZLjava/lang/String;)V

    .line 14
    const/4 v1, 0x1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    move v4, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v4, v3

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-static {v4, p0}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->checkManifestExpression(ZLjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Landroidx/media3/common/util/Util;->castNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    check-cast v4, Ljava/lang/String;

    .line 34
    .line 35
    const-string v5, "now"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    move-result v4

    .line 40
    .line 41
    const/high16 v5, 0x447a0000    # 1000.0f

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    const-wide/16 v6, 0x0

    .line 46
    goto :goto_1

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 50
    move-result v2

    .line 51
    mul-float/2addr v2, v5

    .line 52
    float-to-long v6, v2

    .line 53
    :goto_1
    const/4 v2, 0x2

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    .line 62
    :try_start_0
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 63
    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    mul-float/2addr v0, v5

    .line 65
    float-to-long v4, v0

    .line 66
    .line 67
    cmp-long v0, v4, v6

    .line 68
    .line 69
    if-ltz v0, :cond_2

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move v1, v3

    .line 72
    .line 73
    .line 74
    :goto_2
    invoke-static {v1, p0}, Landroidx/media3/exoplayer/rtsp/RtspMessageUtil;->checkManifestExpression(ZLjava/lang/String;)V

    .line 75
    goto :goto_3

    .line 76
    :catch_0
    move-exception p0

    .line 77
    .line 78
    .line 79
    invoke-static {v0, p0}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 80
    move-result-object p0

    .line 81
    throw p0

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    :cond_3
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 87
    .line 88
    :goto_3
    new-instance p0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;

    .line 89
    .line 90
    .line 91
    invoke-direct {p0, v6, v7, v4, v5}, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;-><init>(JJ)V

    .line 92
    return-object p0
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


# virtual methods
.method public getDurationMs()J
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->stopTimeMs:J

    .line 3
    .line 4
    iget-wide v2, p0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->startTimeMs:J

    .line 5
    sub-long/2addr v0, v2

    .line 6
    return-wide v0
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

.method public isLive()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->stopTimeMs:J

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
.end method
