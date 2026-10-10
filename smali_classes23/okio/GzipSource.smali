.class public final Lokio/GzipSource;
.super Ljava/lang/Object;
.source "GzipSource.kt"

# interfaces
.implements Lokio/Source;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0008\u0010\u0014\u001a\u00020\u000eH\u0016J\u0008\u0010\u0015\u001a\u00020\u000eH\u0002J\u0008\u0010\u0016\u001a\u00020\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0008\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lokio/GzipSource;",
        "Lokio/Source;",
        "source",
        "(Lokio/Source;)V",
        "crc",
        "Ljava/util/zip/CRC32;",
        "inflater",
        "Ljava/util/zip/Inflater;",
        "inflaterSource",
        "Lokio/InflaterSource;",
        "section",
        "",
        "Lokio/RealBufferedSource;",
        "checkEqual",
        "",
        "name",
        "",
        "expected",
        "",
        "actual",
        "close",
        "consumeHeader",
        "consumeTrailer",
        "read",
        "",
        "sink",
        "Lokio/Buffer;",
        "byteCount",
        "timeout",
        "Lokio/Timeout;",
        "updateCrc",
        "buffer",
        "offset",
        "okio"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,220:1\n1#2:221\n62#3:222\n62#3:224\n62#3:226\n62#3:227\n62#3:228\n62#3:230\n62#3:232\n202#4:223\n202#4:225\n202#4:229\n202#4:231\n89#5:233\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n105#1:222\n107#1:224\n119#1:226\n120#1:227\n122#1:228\n133#1:230\n144#1:232\n106#1:223\n117#1:225\n130#1:229\n141#1:231\n187#1:233\n*E\n"
    }
.end annotation


# instance fields
.field private final crc:Ljava/util/zip/CRC32;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final inflater:Ljava/util/zip/Inflater;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final inflaterSource:Lokio/InflaterSource;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private section:B

.field private final source:Lokio/RealBufferedSource;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lokio/Source;)V
    .locals 2
    .param p1    # Lokio/Source;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "source"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    new-instance v0, Lokio/RealBufferedSource;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p1}, Lokio/RealBufferedSource;-><init>(Lokio/Source;)V

    .line 15
    .line 16
    iput-object v0, p0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 17
    .line 18
    new-instance p1, Ljava/util/zip/Inflater;

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 23
    .line 24
    iput-object p1, p0, Lokio/GzipSource;->inflater:Ljava/util/zip/Inflater;

    .line 25
    .line 26
    new-instance v1, Lokio/InflaterSource;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v0, p1}, Lokio/InflaterSource;-><init>(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V

    .line 30
    .line 31
    iput-object v1, p0, Lokio/GzipSource;->inflaterSource:Lokio/InflaterSource;

    .line 32
    .line 33
    new-instance p1, Ljava/util/zip/CRC32;

    .line 34
    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    .line 37
    .line 38
    iput-object p1, p0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    .line 39
    return-void
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
.end method

.method private final checkEqual(Ljava/lang/String;II)V
    .locals 1

    .line 1
    .line 2
    if-ne p3, p2, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 6
    .line 7
    .line 8
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    move-result-object p3

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    .line 16
    filled-new-array {p1, p3, p2}, [Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    const/4 p2, 0x3

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    const-string p2, "%s: actual 0x%08x != expected 0x%08x"

    .line 25
    .line 26
    .line 27
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    const-string p2, "format(this, *args)"

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 37
    throw v0
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
.end method

.method private final consumeHeader()V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 5
    .line 6
    const-wide/16 v2, 0xa

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v2, v3}, Lokio/RealBufferedSource;->require(J)V

    .line 10
    .line 11
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 12
    .line 13
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 14
    .line 15
    const-wide/16 v2, 0x3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Lokio/Buffer;->getByte(J)B

    .line 19
    move-result v6

    .line 20
    .line 21
    shr-int/lit8 v1, v6, 0x1

    .line 22
    const/4 v7, 0x1

    .line 23
    and-int/2addr v1, v7

    .line 24
    const/4 v8, 0x0

    .line 25
    .line 26
    if-ne v1, v7, :cond_0

    .line 27
    move v9, v7

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v9, v8

    .line 30
    .line 31
    :goto_0
    if-eqz v9, :cond_1

    .line 32
    .line 33
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 34
    .line 35
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 36
    .line 37
    const-wide/16 v2, 0x0

    .line 38
    .line 39
    const-wide/16 v4, 0xa

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 43
    .line 44
    :cond_1
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Lokio/RealBufferedSource;->readShort()S

    .line 48
    move-result v1

    .line 49
    .line 50
    const-string v2, "ID1ID2"

    .line 51
    .line 52
    const/16 v3, 0x1f8b

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, v2, v3, v1}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 56
    .line 57
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 58
    .line 59
    const-wide/16 v2, 0x8

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2, v3}, Lokio/RealBufferedSource;->skip(J)V

    .line 63
    .line 64
    shr-int/lit8 v1, v6, 0x2

    .line 65
    and-int/2addr v1, v7

    .line 66
    .line 67
    if-ne v1, v7, :cond_4

    .line 68
    .line 69
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 70
    .line 71
    const-wide/16 v2, 0x2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v2, v3}, Lokio/RealBufferedSource;->require(J)V

    .line 75
    .line 76
    if-eqz v9, :cond_2

    .line 77
    .line 78
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 79
    .line 80
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 81
    .line 82
    const-wide/16 v2, 0x0

    .line 83
    .line 84
    const-wide/16 v4, 0x2

    .line 85
    .line 86
    .line 87
    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 88
    .line 89
    :cond_2
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 90
    .line 91
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Lokio/Buffer;->readShortLe()S

    .line 95
    move-result v1

    .line 96
    .line 97
    .line 98
    const v2, 0xffff

    .line 99
    and-int/2addr v1, v2

    .line 100
    int-to-long v4, v1

    .line 101
    .line 102
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v4, v5}, Lokio/RealBufferedSource;->require(J)V

    .line 106
    .line 107
    if-eqz v9, :cond_3

    .line 108
    .line 109
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 110
    .line 111
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 112
    .line 113
    const-wide/16 v2, 0x0

    .line 114
    .line 115
    .line 116
    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 117
    .line 118
    :cond_3
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v4, v5}, Lokio/RealBufferedSource;->skip(J)V

    .line 122
    .line 123
    :cond_4
    shr-int/lit8 v1, v6, 0x3

    .line 124
    and-int/2addr v1, v7

    .line 125
    .line 126
    const-wide/16 v10, -0x1

    .line 127
    .line 128
    const-wide/16 v12, 0x1

    .line 129
    .line 130
    if-ne v1, v7, :cond_7

    .line 131
    .line 132
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v8}, Lokio/RealBufferedSource;->indexOf(B)J

    .line 136
    move-result-wide v14

    .line 137
    .line 138
    cmp-long v1, v14, v10

    .line 139
    .line 140
    if-eqz v1, :cond_6

    .line 141
    .line 142
    if-eqz v9, :cond_5

    .line 143
    .line 144
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 145
    .line 146
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 147
    .line 148
    const-wide/16 v2, 0x0

    .line 149
    .line 150
    add-long v4, v14, v12

    .line 151
    .line 152
    .line 153
    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 154
    .line 155
    :cond_5
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 156
    add-long/2addr v14, v12

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v14, v15}, Lokio/RealBufferedSource;->skip(J)V

    .line 160
    goto :goto_1

    .line 161
    .line 162
    :cond_6
    new-instance v1, Ljava/io/EOFException;

    .line 163
    .line 164
    .line 165
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 166
    throw v1

    .line 167
    .line 168
    :cond_7
    :goto_1
    shr-int/lit8 v1, v6, 0x4

    .line 169
    and-int/2addr v1, v7

    .line 170
    .line 171
    if-ne v1, v7, :cond_a

    .line 172
    .line 173
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v8}, Lokio/RealBufferedSource;->indexOf(B)J

    .line 177
    move-result-wide v6

    .line 178
    .line 179
    cmp-long v1, v6, v10

    .line 180
    .line 181
    if-eqz v1, :cond_9

    .line 182
    .line 183
    if-eqz v9, :cond_8

    .line 184
    .line 185
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 186
    .line 187
    iget-object v1, v1, Lokio/RealBufferedSource;->bufferField:Lokio/Buffer;

    .line 188
    .line 189
    const-wide/16 v2, 0x0

    .line 190
    .line 191
    add-long v4, v6, v12

    .line 192
    .line 193
    .line 194
    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 195
    .line 196
    :cond_8
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 197
    add-long/2addr v6, v12

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v6, v7}, Lokio/RealBufferedSource;->skip(J)V

    .line 201
    goto :goto_2

    .line 202
    .line 203
    :cond_9
    new-instance v1, Ljava/io/EOFException;

    .line 204
    .line 205
    .line 206
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 207
    throw v1

    .line 208
    .line 209
    :cond_a
    :goto_2
    if-eqz v9, :cond_b

    .line 210
    .line 211
    iget-object v1, v0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1}, Lokio/RealBufferedSource;->readShortLe()S

    .line 215
    move-result v1

    .line 216
    .line 217
    iget-object v2, v0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    .line 221
    move-result-wide v2

    .line 222
    long-to-int v2, v2

    .line 223
    int-to-short v2, v2

    .line 224
    .line 225
    const-string v3, "FHCRC"

    .line 226
    .line 227
    .line 228
    invoke-direct {v0, v3, v1, v2}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 229
    .line 230
    iget-object v1, v0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->reset()V

    .line 234
    :cond_b
    return-void
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
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method private final consumeTrailer()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lokio/RealBufferedSource;->readIntLe()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    .line 12
    move-result-wide v1

    .line 13
    long-to-int v1, v1

    .line 14
    .line 15
    const-string v2, "CRC"

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v2, v0, v1}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 19
    .line 20
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lokio/RealBufferedSource;->readIntLe()I

    .line 24
    move-result v0

    .line 25
    .line 26
    iget-object v1, p0, Lokio/GzipSource;->inflater:Ljava/util/zip/Inflater;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    .line 30
    move-result-wide v1

    .line 31
    long-to-int v1, v1

    .line 32
    .line 33
    const-string v2, "ISIZE"

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v2, v0, v1}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 37
    return-void
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
.end method

.method private final updateCrc(Lokio/Buffer;JJ)V
    .locals 4

    .line 1
    .line 2
    iget-object p1, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    :goto_0
    iget v0, p1, Lokio/Segment;->limit:I

    .line 8
    .line 9
    iget v1, p1, Lokio/Segment;->pos:I

    .line 10
    .line 11
    sub-int v2, v0, v1

    .line 12
    int-to-long v2, v2

    .line 13
    .line 14
    cmp-long v2, p2, v2

    .line 15
    .line 16
    if-ltz v2, :cond_0

    .line 17
    sub-int/2addr v0, v1

    .line 18
    int-to-long v0, v0

    .line 19
    sub-long/2addr p2, v0

    .line 20
    .line 21
    iget-object p1, p1, Lokio/Segment;->next:Lokio/Segment;

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    cmp-long v2, p4, v0

    .line 30
    .line 31
    if-lez v2, :cond_1

    .line 32
    .line 33
    iget v2, p1, Lokio/Segment;->pos:I

    .line 34
    int-to-long v2, v2

    .line 35
    add-long/2addr v2, p2

    .line 36
    long-to-int p2, v2

    .line 37
    .line 38
    iget p3, p1, Lokio/Segment;->limit:I

    .line 39
    sub-int/2addr p3, p2

    .line 40
    int-to-long v2, p3

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    .line 44
    move-result-wide v2

    .line 45
    long-to-int p3, v2

    .line 46
    .line 47
    iget-object v2, p0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    .line 48
    .line 49
    iget-object v3, p1, Lokio/Segment;->data:[B

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 53
    int-to-long p2, p3

    .line 54
    sub-long/2addr p4, p2

    .line 55
    .line 56
    iget-object p1, p1, Lokio/Segment;->next:Lokio/Segment;

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 60
    move-wide p2, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    return-void
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
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lokio/GzipSource;->inflaterSource:Lokio/InflaterSource;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lokio/InflaterSource;->close()V

    .line 6
    return-void
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
.end method

.method public read(Lokio/Buffer;J)J
    .locals 11
    .param p1    # Lokio/Buffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sink"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    cmp-long v2, p2, v0

    .line 11
    .line 12
    if-ltz v2, :cond_6

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    return-wide v0

    .line 16
    .line 17
    :cond_0
    iget-byte v0, p0, Lokio/GzipSource;->section:B

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lokio/GzipSource;->consumeHeader()V

    .line 24
    .line 25
    iput-byte v1, p0, Lokio/GzipSource;->section:B

    .line 26
    .line 27
    :cond_1
    iget-byte v0, p0, Lokio/GzipSource;->section:B

    .line 28
    const/4 v2, 0x2

    .line 29
    .line 30
    const-wide/16 v3, -0x1

    .line 31
    .line 32
    if-ne v0, v1, :cond_3

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 36
    move-result-wide v7

    .line 37
    .line 38
    iget-object v0, p0, Lokio/GzipSource;->inflaterSource:Lokio/InflaterSource;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, p2, p3}, Lokio/InflaterSource;->read(Lokio/Buffer;J)J

    .line 42
    move-result-wide v9

    .line 43
    .line 44
    cmp-long p2, v9, v3

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    move-object v5, p0

    .line 48
    move-object v6, p1

    .line 49
    .line 50
    .line 51
    invoke-direct/range {v5 .. v10}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 52
    return-wide v9

    .line 53
    :cond_2
    move-object v5, p0

    .line 54
    .line 55
    iput-byte v2, v5, Lokio/GzipSource;->section:B

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    move-object v5, p0

    .line 58
    .line 59
    :goto_0
    iget-byte p1, v5, Lokio/GzipSource;->section:B

    .line 60
    .line 61
    if-ne p1, v2, :cond_5

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, Lokio/GzipSource;->consumeTrailer()V

    .line 65
    const/4 p1, 0x3

    .line 66
    .line 67
    iput-byte p1, v5, Lokio/GzipSource;->section:B

    .line 68
    .line 69
    iget-object p1, v5, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lokio/RealBufferedSource;->exhausted()Z

    .line 73
    move-result p1

    .line 74
    .line 75
    if-eqz p1, :cond_4

    .line 76
    goto :goto_1

    .line 77
    .line 78
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 79
    .line 80
    const-string p2, "gzip finished without exhausting source"

    .line 81
    .line 82
    .line 83
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 84
    throw p1

    .line 85
    :cond_5
    :goto_1
    return-wide v3

    .line 86
    :cond_6
    move-object v5, p0

    .line 87
    .line 88
    new-instance p1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    const-string v0, "byteCount < 0: "

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    .line 112
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 113
    throw p2
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
.end method

.method public timeout()Lokio/Timeout;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/RealBufferedSource;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lokio/RealBufferedSource;->timeout()Lokio/Timeout;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method
