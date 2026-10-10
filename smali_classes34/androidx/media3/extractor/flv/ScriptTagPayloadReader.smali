.class final Landroidx/media3/extractor/flv/ScriptTagPayloadReader;
.super Landroidx/media3/extractor/flv/TagPayloadReader;
.source "ScriptTagPayloadReader.java"


# static fields
.field private static final AMF_TYPE_BOOLEAN:I = 0x1

.field private static final AMF_TYPE_DATE:I = 0xb

.field private static final AMF_TYPE_ECMA_ARRAY:I = 0x8

.field private static final AMF_TYPE_END_MARKER:I = 0x9

.field private static final AMF_TYPE_NUMBER:I = 0x0

.field private static final AMF_TYPE_OBJECT:I = 0x3

.field private static final AMF_TYPE_STRICT_ARRAY:I = 0xa

.field private static final AMF_TYPE_STRING:I = 0x2

.field private static final KEY_DURATION:Ljava/lang/String; = "duration"

.field private static final KEY_FILE_POSITIONS:Ljava/lang/String; = "filepositions"

.field private static final KEY_KEY_FRAMES:Ljava/lang/String; = "keyframes"

.field private static final KEY_TIMES:Ljava/lang/String; = "times"

.field private static final NAME_METADATA:Ljava/lang/String; = "onMetaData"


# instance fields
.field private durationUs:J

.field private keyFrameTagPositions:[J

.field private keyFrameTimesUs:[J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/extractor/DiscardingTrackOutput;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/media3/extractor/DiscardingTrackOutput;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/extractor/flv/TagPayloadReader;-><init>(Landroidx/media3/extractor/TrackOutput;)V

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    iput-wide v0, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->durationUs:J

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    new-array v1, v0, [J

    .line 19
    .line 20
    iput-object v1, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->keyFrameTimesUs:[J

    .line 21
    .line 22
    new-array v0, v0, [J

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->keyFrameTagPositions:[J

    .line 25
    return-void
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

.method private static readAmfBoolean(Landroidx/media3/common/util/ParsableByteArray;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static readAmfData(Landroidx/media3/common/util/ParsableByteArray;I)Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_6

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_5

    .line 6
    const/4 v0, 0x2

    .line 7
    .line 8
    if-eq p1, v0, :cond_4

    .line 9
    const/4 v0, 0x3

    .line 10
    .line 11
    if-eq p1, v0, :cond_3

    .line 12
    .line 13
    const/16 v0, 0x8

    .line 14
    .line 15
    if-eq p1, v0, :cond_2

    .line 16
    .line 17
    const/16 v0, 0xa

    .line 18
    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0xb

    .line 22
    .line 23
    if-eq p1, v0, :cond_0

    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfDate(Landroidx/media3/common/util/ParsableByteArray;)Ljava/util/Date;

    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfStrictArray(Landroidx/media3/common/util/ParsableByteArray;)Ljava/util/ArrayList;

    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfEcmaArray(Landroidx/media3/common/util/ParsableByteArray;)Ljava/util/HashMap;

    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    .line 42
    .line 43
    :cond_3
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfObject(Landroidx/media3/common/util/ParsableByteArray;)Ljava/util/HashMap;

    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    .line 47
    .line 48
    :cond_4
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfString(Landroidx/media3/common/util/ParsableByteArray;)Ljava/lang/String;

    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    .line 52
    .line 53
    :cond_5
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfBoolean(Landroidx/media3/common/util/ParsableByteArray;)Ljava/lang/Boolean;

    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    .line 57
    .line 58
    :cond_6
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfDouble(Landroidx/media3/common/util/ParsableByteArray;)Ljava/lang/Double;

    .line 59
    move-result-object p0

    .line 60
    return-object p0
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
.end method

.method private static readAmfDate(Landroidx/media3/common/util/ParsableByteArray;)Ljava/util/Date;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/util/Date;

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfDouble(Landroidx/media3/common/util/ParsableByteArray;)Ljava/lang/Double;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 10
    move-result-wide v1

    .line 11
    double-to-long v1, v1

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 15
    const/4 v1, 0x2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 19
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static readAmfDouble(Landroidx/media3/common/util/ParsableByteArray;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->readLong()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 12
    move-result-object p0

    .line 13
    return-object p0
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
.end method

.method private static readAmfEcmaArray(Landroidx/media3/common/util/ParsableByteArray;)Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/util/ParsableByteArray;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedIntToInt()I

    .line 4
    move-result v0

    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    :goto_0
    if-ge v2, v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfString(Landroidx/media3/common/util/ParsableByteArray;)Ljava/lang/String;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfType(Landroidx/media3/common/util/ParsableByteArray;)I

    .line 20
    move-result v4

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v4}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfData(Landroidx/media3/common/util/ParsableByteArray;I)Ljava/lang/Object;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object v1
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
.end method

.method private static readAmfObject(Landroidx/media3/common/util/ParsableByteArray;)Ljava/util/HashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/util/ParsableByteArray;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfString(Landroidx/media3/common/util/ParsableByteArray;)Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfType(Landroidx/media3/common/util/ParsableByteArray;)I

    .line 13
    move-result v2

    .line 14
    .line 15
    const/16 v3, 0x9

    .line 16
    .line 17
    if-ne v2, v3, :cond_1

    .line 18
    return-object v0

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-static {p0, v2}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfData(Landroidx/media3/common/util/ParsableByteArray;I)Ljava/lang/Object;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    goto :goto_0
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
.end method

.method private static readAmfStrictArray(Landroidx/media3/common/util/ParsableByteArray;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/util/ParsableByteArray;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedIntToInt()I

    .line 4
    move-result v0

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    :goto_0
    if-ge v2, v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfType(Landroidx/media3/common/util/ParsableByteArray;)I

    .line 16
    move-result v3

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v3}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfData(Landroidx/media3/common/util/ParsableByteArray;I)Ljava/lang/Object;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-object v1
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
.end method

.method private static readAmfString(Landroidx/media3/common/util/ParsableByteArray;)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedShort()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 12
    .line 13
    new-instance v2, Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, p0, v1, v0}, Ljava/lang/String;-><init>([BII)V

    .line 21
    return-object v2
    .line 22
    .line 23
.end method

.method private static readAmfType(Landroidx/media3/common/util/ParsableByteArray;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 4
    move-result p0

    .line 5
    return p0
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
    iget-wide v0, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->durationUs:J

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

.method public getKeyFrameTagPositions()[J
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->keyFrameTagPositions:[J

    .line 3
    return-object v0
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

.method public getKeyFrameTimesUs()[J
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->keyFrameTimesUs:[J

    .line 3
    return-object v0
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

.method public parseHeader(Landroidx/media3/common/util/ParsableByteArray;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public parsePayload(Landroidx/media3/common/util/ParsableByteArray;J)Z
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfType(Landroidx/media3/common/util/ParsableByteArray;)I

    .line 4
    move-result p2

    .line 5
    const/4 p3, 0x2

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    if-eq p2, p3, :cond_0

    .line 9
    return v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p1}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfString(Landroidx/media3/common/util/ParsableByteArray;)Ljava/lang/String;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    .line 16
    const-string/jumbo p3, "onMetaData"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result p2

    .line 21
    .line 22
    if-nez p2, :cond_1

    .line 23
    return v0

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 27
    move-result p2

    .line 28
    .line 29
    if-nez p2, :cond_2

    .line 30
    return v0

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-static {p1}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfType(Landroidx/media3/common/util/ParsableByteArray;)I

    .line 34
    move-result p2

    .line 35
    .line 36
    const/16 p3, 0x8

    .line 37
    .line 38
    if-eq p2, p3, :cond_3

    .line 39
    return v0

    .line 40
    .line 41
    .line 42
    :cond_3
    invoke-static {p1}, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->readAmfEcmaArray(Landroidx/media3/common/util/ParsableByteArray;)Ljava/util/HashMap;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    const-string p2, "duration"

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    instance-of p3, p2, Ljava/lang/Double;

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    const-wide v1, 0x412e848000000000L    # 1000000.0

    .line 57
    .line 58
    if-eqz p3, :cond_4

    .line 59
    .line 60
    check-cast p2, Ljava/lang/Double;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 64
    move-result-wide p2

    .line 65
    .line 66
    const-wide/16 v3, 0x0

    .line 67
    .line 68
    cmpl-double v3, p2, v3

    .line 69
    .line 70
    if-lez v3, :cond_4

    .line 71
    mul-double/2addr p2, v1

    .line 72
    double-to-long p2, p2

    .line 73
    .line 74
    iput-wide p2, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->durationUs:J

    .line 75
    .line 76
    :cond_4
    const-string p2, "keyframes"

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    instance-of p2, p1, Ljava/util/Map;

    .line 83
    .line 84
    if-eqz p2, :cond_6

    .line 85
    .line 86
    check-cast p1, Ljava/util/Map;

    .line 87
    .line 88
    const-string p2, "filepositions"

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    .line 95
    const-string/jumbo p3, "times"

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    instance-of p3, p2, Ljava/util/List;

    .line 102
    .line 103
    if-eqz p3, :cond_6

    .line 104
    .line 105
    instance-of p3, p1, Ljava/util/List;

    .line 106
    .line 107
    if-eqz p3, :cond_6

    .line 108
    .line 109
    check-cast p2, Ljava/util/List;

    .line 110
    .line 111
    check-cast p1, Ljava/util/List;

    .line 112
    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 115
    move-result p3

    .line 116
    .line 117
    new-array v3, p3, [J

    .line 118
    .line 119
    iput-object v3, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->keyFrameTimesUs:[J

    .line 120
    .line 121
    new-array v3, p3, [J

    .line 122
    .line 123
    iput-object v3, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->keyFrameTagPositions:[J

    .line 124
    move v3, v0

    .line 125
    .line 126
    :goto_0
    if-ge v3, p3, :cond_6

    .line 127
    .line 128
    .line 129
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    move-result-object v4

    .line 131
    .line 132
    .line 133
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    move-result-object v5

    .line 135
    .line 136
    instance-of v6, v5, Ljava/lang/Double;

    .line 137
    .line 138
    if-eqz v6, :cond_5

    .line 139
    .line 140
    instance-of v6, v4, Ljava/lang/Double;

    .line 141
    .line 142
    if-eqz v6, :cond_5

    .line 143
    .line 144
    iget-object v6, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->keyFrameTimesUs:[J

    .line 145
    .line 146
    check-cast v5, Ljava/lang/Double;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 150
    move-result-wide v7

    .line 151
    mul-double/2addr v7, v1

    .line 152
    double-to-long v7, v7

    .line 153
    .line 154
    aput-wide v7, v6, v3

    .line 155
    .line 156
    iget-object v5, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->keyFrameTagPositions:[J

    .line 157
    .line 158
    check-cast v4, Ljava/lang/Double;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/Double;->longValue()J

    .line 162
    move-result-wide v6

    .line 163
    .line 164
    aput-wide v6, v5, v3

    .line 165
    .line 166
    add-int/lit8 v3, v3, 0x1

    .line 167
    goto :goto_0

    .line 168
    .line 169
    :cond_5
    new-array p1, v0, [J

    .line 170
    .line 171
    iput-object p1, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->keyFrameTimesUs:[J

    .line 172
    .line 173
    new-array p1, v0, [J

    .line 174
    .line 175
    iput-object p1, p0, Landroidx/media3/extractor/flv/ScriptTagPayloadReader;->keyFrameTagPositions:[J

    .line 176
    :cond_6
    return v0
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
.end method

.method public seek()V
    .locals 0

    .line 1
    return-void
    .line 2
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
