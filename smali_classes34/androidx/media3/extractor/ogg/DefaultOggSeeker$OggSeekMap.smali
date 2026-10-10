.class final Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;
.super Ljava/lang/Object;
.source "DefaultOggSeeker.java"

# interfaces
.implements Landroidx/media3/extractor/SeekMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/ogg/DefaultOggSeeker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "OggSeekMap"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/extractor/ogg/DefaultOggSeeker;


# direct methods
.method private constructor <init>(Landroidx/media3/extractor/ogg/DefaultOggSeeker;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;->this$0:Landroidx/media3/extractor/ogg/DefaultOggSeeker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/extractor/ogg/DefaultOggSeeker;Landroidx/media3/extractor/ogg/DefaultOggSeeker$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;-><init>(Landroidx/media3/extractor/ogg/DefaultOggSeeker;)V

    return-void
.end method


# virtual methods
.method public getDurationUs()J
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;->this$0:Landroidx/media3/extractor/ogg/DefaultOggSeeker;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/extractor/ogg/DefaultOggSeeker;->access$100(Landroidx/media3/extractor/ogg/DefaultOggSeeker;)Landroidx/media3/extractor/ogg/StreamReader;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;->this$0:Landroidx/media3/extractor/ogg/DefaultOggSeeker;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Landroidx/media3/extractor/ogg/DefaultOggSeeker;->access$300(Landroidx/media3/extractor/ogg/DefaultOggSeeker;)J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Landroidx/media3/extractor/ogg/StreamReader;->convertGranuleToTime(J)J

    .line 16
    move-result-wide v0

    .line 17
    return-wide v0
    .line 18
.end method

.method public getSeekPoints(J)Landroidx/media3/extractor/SeekMap$SeekPoints;
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;->this$0:Landroidx/media3/extractor/ogg/DefaultOggSeeker;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/extractor/ogg/DefaultOggSeeker;->access$100(Landroidx/media3/extractor/ogg/DefaultOggSeeker;)Landroidx/media3/extractor/ogg/StreamReader;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Landroidx/media3/extractor/ogg/StreamReader;->convertTimeToGranule(J)J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;->this$0:Landroidx/media3/extractor/ogg/DefaultOggSeeker;

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Landroidx/media3/extractor/ogg/DefaultOggSeeker;->access$200(Landroidx/media3/extractor/ogg/DefaultOggSeeker;)J

    .line 16
    move-result-wide v2

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;->this$0:Landroidx/media3/extractor/ogg/DefaultOggSeeker;

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Landroidx/media3/extractor/ogg/DefaultOggSeeker;->access$400(Landroidx/media3/extractor/ogg/DefaultOggSeeker;)J

    .line 26
    move-result-wide v4

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;->this$0:Landroidx/media3/extractor/ogg/DefaultOggSeeker;

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Landroidx/media3/extractor/ogg/DefaultOggSeeker;->access$200(Landroidx/media3/extractor/ogg/DefaultOggSeeker;)J

    .line 32
    move-result-wide v6

    .line 33
    sub-long/2addr v4, v6

    .line 34
    .line 35
    .line 36
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    iget-object v1, p0, Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;->this$0:Landroidx/media3/extractor/ogg/DefaultOggSeeker;

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Landroidx/media3/extractor/ogg/DefaultOggSeeker;->access$300(Landroidx/media3/extractor/ogg/DefaultOggSeeker;)J

    .line 47
    move-result-wide v4

    .line 48
    .line 49
    .line 50
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    .line 59
    move-result-wide v0

    .line 60
    add-long/2addr v2, v0

    .line 61
    .line 62
    const-wide/16 v0, 0x7530

    .line 63
    .line 64
    sub-long v4, v2, v0

    .line 65
    .line 66
    iget-object v0, p0, Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;->this$0:Landroidx/media3/extractor/ogg/DefaultOggSeeker;

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Landroidx/media3/extractor/ogg/DefaultOggSeeker;->access$200(Landroidx/media3/extractor/ogg/DefaultOggSeeker;)J

    .line 70
    move-result-wide v6

    .line 71
    .line 72
    iget-object v0, p0, Landroidx/media3/extractor/ogg/DefaultOggSeeker$OggSeekMap;->this$0:Landroidx/media3/extractor/ogg/DefaultOggSeeker;

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Landroidx/media3/extractor/ogg/DefaultOggSeeker;->access$400(Landroidx/media3/extractor/ogg/DefaultOggSeeker;)J

    .line 76
    move-result-wide v0

    .line 77
    .line 78
    const-wide/16 v2, 0x1

    .line 79
    .line 80
    sub-long v8, v0, v2

    .line 81
    .line 82
    .line 83
    invoke-static/range {v4 .. v9}, Landroidx/media3/common/util/Util;->constrainValue(JJJ)J

    .line 84
    move-result-wide v0

    .line 85
    .line 86
    new-instance v2, Landroidx/media3/extractor/SeekMap$SeekPoints;

    .line 87
    .line 88
    new-instance v3, Landroidx/media3/extractor/SeekPoint;

    .line 89
    .line 90
    .line 91
    invoke-direct {v3, p1, p2, v0, v1}, Landroidx/media3/extractor/SeekPoint;-><init>(JJ)V

    .line 92
    .line 93
    .line 94
    invoke-direct {v2, v3}, Landroidx/media3/extractor/SeekMap$SeekPoints;-><init>(Landroidx/media3/extractor/SeekPoint;)V

    .line 95
    return-object v2
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
