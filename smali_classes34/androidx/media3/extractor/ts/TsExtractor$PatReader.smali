.class Landroidx/media3/extractor/ts/TsExtractor$PatReader;
.super Ljava/lang/Object;
.source "TsExtractor.java"

# interfaces
.implements Landroidx/media3/extractor/ts/SectionPayloadReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/ts/TsExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "PatReader"
.end annotation


# instance fields
.field private final patScratch:Landroidx/media3/common/util/ParsableBitArray;

.field final synthetic this$0:Landroidx/media3/extractor/ts/TsExtractor;


# direct methods
.method public constructor <init>(Landroidx/media3/extractor/ts/TsExtractor;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->this$0:Landroidx/media3/extractor/ts/TsExtractor;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    new-instance p1, Landroidx/media3/common/util/ParsableBitArray;

    .line 8
    const/4 v0, 0x4

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, v0}, Landroidx/media3/common/util/ParsableBitArray;-><init>([B)V

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->patScratch:Landroidx/media3/common/util/ParsableBitArray;

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public consume(Landroidx/media3/common/util/ParsableByteArray;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 12
    move-result v0

    .line 13
    .line 14
    and-int/lit16 v0, v0, 0x80

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    goto :goto_2

    .line 18
    :cond_1
    const/4 v0, 0x6

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x4

    .line 27
    div-int/2addr v0, v1

    .line 28
    const/4 v2, 0x0

    .line 29
    move v3, v2

    .line 30
    .line 31
    :goto_0
    if-ge v3, v0, :cond_4

    .line 32
    .line 33
    iget-object v4, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->patScratch:Landroidx/media3/common/util/ParsableBitArray;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v4, v1}, Landroidx/media3/common/util/ParsableByteArray;->readBytes(Landroidx/media3/common/util/ParsableBitArray;I)V

    .line 37
    .line 38
    iget-object v4, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->patScratch:Landroidx/media3/common/util/ParsableBitArray;

    .line 39
    .line 40
    const/16 v5, 0x10

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v5}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 44
    move-result v4

    .line 45
    .line 46
    iget-object v5, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->patScratch:Landroidx/media3/common/util/ParsableBitArray;

    .line 47
    const/4 v6, 0x3

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v6}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 51
    .line 52
    const/16 v5, 0xd

    .line 53
    .line 54
    if-nez v4, :cond_2

    .line 55
    .line 56
    iget-object v4, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->patScratch:Landroidx/media3/common/util/ParsableBitArray;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v5}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_2
    iget-object v4, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->patScratch:Landroidx/media3/common/util/ParsableBitArray;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v5}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 66
    move-result v4

    .line 67
    .line 68
    iget-object v5, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->this$0:Landroidx/media3/extractor/ts/TsExtractor;

    .line 69
    .line 70
    .line 71
    invoke-static {v5}, Landroidx/media3/extractor/ts/TsExtractor;->access$000(Landroidx/media3/extractor/ts/TsExtractor;)Landroid/util/SparseArray;

    .line 72
    move-result-object v5

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 76
    move-result-object v5

    .line 77
    .line 78
    if-nez v5, :cond_3

    .line 79
    .line 80
    iget-object v5, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->this$0:Landroidx/media3/extractor/ts/TsExtractor;

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Landroidx/media3/extractor/ts/TsExtractor;->access$000(Landroidx/media3/extractor/ts/TsExtractor;)Landroid/util/SparseArray;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    new-instance v6, Landroidx/media3/extractor/ts/SectionReader;

    .line 87
    .line 88
    new-instance v7, Landroidx/media3/extractor/ts/TsExtractor$PmtReader;

    .line 89
    .line 90
    iget-object v8, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->this$0:Landroidx/media3/extractor/ts/TsExtractor;

    .line 91
    .line 92
    .line 93
    invoke-direct {v7, v8, v4}, Landroidx/media3/extractor/ts/TsExtractor$PmtReader;-><init>(Landroidx/media3/extractor/ts/TsExtractor;I)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v6, v7}, Landroidx/media3/extractor/ts/SectionReader;-><init>(Landroidx/media3/extractor/ts/SectionPayloadReader;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 100
    .line 101
    iget-object v4, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->this$0:Landroidx/media3/extractor/ts/TsExtractor;

    .line 102
    .line 103
    .line 104
    invoke-static {v4}, Landroidx/media3/extractor/ts/TsExtractor;->access$108(Landroidx/media3/extractor/ts/TsExtractor;)I

    .line 105
    .line 106
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 107
    goto :goto_0

    .line 108
    .line 109
    :cond_4
    iget-object p1, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->this$0:Landroidx/media3/extractor/ts/TsExtractor;

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Landroidx/media3/extractor/ts/TsExtractor;->access$200(Landroidx/media3/extractor/ts/TsExtractor;)I

    .line 113
    move-result p1

    .line 114
    const/4 v0, 0x2

    .line 115
    .line 116
    if-eq p1, v0, :cond_5

    .line 117
    .line 118
    iget-object p1, p0, Landroidx/media3/extractor/ts/TsExtractor$PatReader;->this$0:Landroidx/media3/extractor/ts/TsExtractor;

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, Landroidx/media3/extractor/ts/TsExtractor;->access$000(Landroidx/media3/extractor/ts/TsExtractor;)Landroid/util/SparseArray;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 126
    :cond_5
    :goto_2
    return-void
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

.method public init(Landroidx/media3/common/util/TimestampAdjuster;Landroidx/media3/extractor/ExtractorOutput;Landroidx/media3/extractor/ts/TsPayloadReader$TrackIdGenerator;)V
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
.end method
