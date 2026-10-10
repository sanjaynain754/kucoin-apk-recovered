.class final Landroidx/media3/extractor/ogg/OggPageHeader;
.super Ljava/lang/Object;
.source "OggPageHeader.java"


# static fields
.field private static final CAPTURE_PATTERN:I = 0x4f676753

.field private static final CAPTURE_PATTERN_SIZE:I = 0x4

.field public static final EMPTY_PAGE_HEADER_SIZE:I = 0x1b

.field public static final MAX_PAGE_PAYLOAD:I = 0xfe01

.field public static final MAX_PAGE_SIZE:I = 0xff1b

.field public static final MAX_SEGMENT_COUNT:I = 0xff


# instance fields
.field public bodySize:I

.field public granulePosition:J

.field public headerSize:I

.field public final laces:[I

.field public pageChecksum:J

.field public pageSegmentCount:I

.field public pageSequenceNumber:J

.field public revision:I

.field private final scratch:Landroidx/media3/common/util/ParsableByteArray;

.field public streamSerialNumber:J

.field public type:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0xff

    .line 6
    .line 7
    new-array v1, v0, [I

    .line 8
    .line 9
    iput-object v1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->laces:[I

    .line 10
    .line 11
    new-instance v1, Landroidx/media3/common/util/ParsableByteArray;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v0}, Landroidx/media3/common/util/ParsableByteArray;-><init>(I)V

    .line 15
    .line 16
    iput-object v1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 17
    return-void
    .line 18
.end method


# virtual methods
.method public populate(Landroidx/media3/extractor/ExtractorInput;Z)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/extractor/ogg/OggPageHeader;->reset()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 6
    .line 7
    const/16 v1, 0x1b

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 16
    move-result-object v0

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0, v2, v1, p2}, Landroidx/media3/extractor/ExtractorUtil;->peekFullyQuietly(Landroidx/media3/extractor/ExtractorInput;[BIIZ)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_5

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedInt()J

    .line 29
    move-result-wide v0

    .line 30
    .line 31
    .line 32
    const-wide/32 v3, 0x4f676753

    .line 33
    .line 34
    cmp-long v0, v0, v3

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 44
    move-result v0

    .line 45
    .line 46
    iput v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->revision:I

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    if-eqz p2, :cond_1

    .line 51
    return v2

    .line 52
    .line 53
    .line 54
    :cond_1
    const-string/jumbo p1, "unsupported bit stream revision"

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Landroidx/media3/common/ParserException;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 58
    move-result-object p1

    .line 59
    throw p1

    .line 60
    .line 61
    :cond_2
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 65
    move-result v0

    .line 66
    .line 67
    iput v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->type:I

    .line 68
    .line 69
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readLittleEndianLong()J

    .line 73
    move-result-wide v0

    .line 74
    .line 75
    iput-wide v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->granulePosition:J

    .line 76
    .line 77
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readLittleEndianUnsignedInt()J

    .line 81
    move-result-wide v0

    .line 82
    .line 83
    iput-wide v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->streamSerialNumber:J

    .line 84
    .line 85
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readLittleEndianUnsignedInt()J

    .line 89
    move-result-wide v0

    .line 90
    .line 91
    iput-wide v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->pageSequenceNumber:J

    .line 92
    .line 93
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readLittleEndianUnsignedInt()J

    .line 97
    move-result-wide v0

    .line 98
    .line 99
    iput-wide v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->pageChecksum:J

    .line 100
    .line 101
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 105
    move-result v0

    .line 106
    .line 107
    iput v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->pageSegmentCount:I

    .line 108
    .line 109
    add-int/lit8 v1, v0, 0x1b

    .line 110
    .line 111
    iput v1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->headerSize:I

    .line 112
    .line 113
    iget-object v1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v0}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 117
    .line 118
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 122
    move-result-object v0

    .line 123
    .line 124
    iget v1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->pageSegmentCount:I

    .line 125
    .line 126
    .line 127
    invoke-static {p1, v0, v2, v1, p2}, Landroidx/media3/extractor/ExtractorUtil;->peekFullyQuietly(Landroidx/media3/extractor/ExtractorInput;[BIIZ)Z

    .line 128
    move-result p1

    .line 129
    .line 130
    if-nez p1, :cond_3

    .line 131
    return v2

    .line 132
    .line 133
    :cond_3
    :goto_0
    iget p1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->pageSegmentCount:I

    .line 134
    .line 135
    if-ge v2, p1, :cond_4

    .line 136
    .line 137
    iget-object p1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->laces:[I

    .line 138
    .line 139
    iget-object p2, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 143
    move-result p2

    .line 144
    .line 145
    aput p2, p1, v2

    .line 146
    .line 147
    iget p1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->bodySize:I

    .line 148
    .line 149
    iget-object p2, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->laces:[I

    .line 150
    .line 151
    aget p2, p2, v2

    .line 152
    add-int/2addr p1, p2

    .line 153
    .line 154
    iput p1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->bodySize:I

    .line 155
    .line 156
    add-int/lit8 v2, v2, 0x1

    .line 157
    goto :goto_0

    .line 158
    :cond_4
    const/4 p1, 0x1

    .line 159
    return p1

    .line 160
    :cond_5
    :goto_1
    return v2
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

.method public reset()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->revision:I

    .line 4
    .line 5
    iput v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->type:I

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->granulePosition:J

    .line 10
    .line 11
    iput-wide v1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->streamSerialNumber:J

    .line 12
    .line 13
    iput-wide v1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->pageSequenceNumber:J

    .line 14
    .line 15
    iput-wide v1, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->pageChecksum:J

    .line 16
    .line 17
    iput v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->pageSegmentCount:I

    .line 18
    .line 19
    iput v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->headerSize:I

    .line 20
    .line 21
    iput v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->bodySize:I

    .line 22
    return-void
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

.method public skipToNextPage(Landroidx/media3/extractor/ExtractorInput;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, -0x1

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Landroidx/media3/extractor/ogg/OggPageHeader;->skipToNextPage(Landroidx/media3/extractor/ExtractorInput;J)Z

    move-result p1

    return p1
.end method

.method public skipToNextPage(Landroidx/media3/extractor/ExtractorInput;J)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Landroidx/media3/extractor/ExtractorInput;->getPosition()J

    move-result-wide v0

    invoke-interface {p1}, Landroidx/media3/extractor/ExtractorInput;->getPeekPosition()J

    move-result-wide v2

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkArgument(Z)V

    .line 3
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    :goto_1
    const-wide/16 v4, -0x1

    cmp-long v0, p2, v4

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {p1}, Landroidx/media3/extractor/ExtractorInput;->getPosition()J

    move-result-wide v4

    const-wide/16 v6, 0x4

    add-long/2addr v4, v6

    cmp-long v4, v4, p2

    if-gez v4, :cond_3

    :cond_1
    iget-object v4, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 5
    invoke-virtual {v4}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    move-result-object v4

    .line 6
    invoke-static {p1, v4, v1, v3, v2}, Landroidx/media3/extractor/ExtractorUtil;->peekFullyQuietly(Landroidx/media3/extractor/ExtractorInput;[BIIZ)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 7
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    invoke-virtual {v0, v1}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 8
    iget-object v0, p0, Landroidx/media3/extractor/ogg/OggPageHeader;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedInt()J

    move-result-wide v4

    const-wide/32 v6, 0x4f676753

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    .line 9
    invoke-interface {p1}, Landroidx/media3/extractor/ExtractorInput;->resetPeekPosition()V

    return v2

    .line 10
    :cond_2
    invoke-interface {p1, v2}, Landroidx/media3/extractor/ExtractorInput;->skipFully(I)V

    goto :goto_1

    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    .line 11
    invoke-interface {p1}, Landroidx/media3/extractor/ExtractorInput;->getPosition()J

    move-result-wide v3

    cmp-long v3, v3, p2

    if-gez v3, :cond_5

    .line 12
    :cond_4
    invoke-interface {p1, v2}, Landroidx/media3/extractor/ExtractorInput;->skip(I)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_5

    goto :goto_2

    :cond_5
    return v1
.end method
