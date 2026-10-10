.class Lcom/facebook/react/devsupport/MultipartStreamReader;
.super Ljava/lang/Object;
.source "MultipartStreamReader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;
    }
.end annotation


# static fields
.field private static final CRLF:Ljava/lang/String; = "\r\n"


# instance fields
.field private final mBoundary:Ljava/lang/String;

.field private mLastProgressEvent:J

.field private final mSource:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Lokio/BufferedSource;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/react/devsupport/MultipartStreamReader;->mSource:Lokio/BufferedSource;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/facebook/react/devsupport/MultipartStreamReader;->mBoundary:Ljava/lang/String;

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
    .line 43
    .line 44
    .line 45
.end method

.method private emitChunk(Lokio/Buffer;ZLcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "\r\n\r\n"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lokio/Buffer;->indexOf(Lokio/ByteString;)J

    .line 10
    move-result-wide v1

    .line 11
    .line 12
    const-wide/16 v3, -0x1

    .line 13
    .line 14
    cmp-long v3, v1, v3

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    .line 20
    invoke-interface {p3, v0, p1, p2}, Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;->onChunkComplete(Ljava/util/Map;Lokio/Buffer;Z)V

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    new-instance v3, Lokio/Buffer;

    .line 24
    .line 25
    .line 26
    invoke-direct {v3}, Lokio/Buffer;-><init>()V

    .line 27
    .line 28
    new-instance v4, Lokio/Buffer;

    .line 29
    .line 30
    .line 31
    invoke-direct {v4}, Lokio/Buffer;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v3, v1, v2}, Lokio/Buffer;->read(Lokio/Buffer;J)J

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lokio/ByteString;->size()I

    .line 38
    move-result v0

    .line 39
    int-to-long v0, v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v4}, Lokio/Buffer;->readAll(Lokio/Sink;)J

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, v3}, Lcom/facebook/react/devsupport/MultipartStreamReader;->parseHeaders(Lokio/Buffer;)Ljava/util/Map;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-interface {p3, p1, v4, p2}, Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;->onChunkComplete(Ljava/util/Map;Lokio/Buffer;Z)V

    .line 53
    return-void
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
.end method

.method private emitProgress(Ljava/util/Map;JZLcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;JZ",
            "Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    if-nez p5, :cond_0

    .line 5
    goto :goto_2

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/facebook/react/devsupport/MultipartStreamReader;->mLastProgressEvent:J

    .line 12
    .line 13
    sub-long v2, v0, v2

    .line 14
    .line 15
    const-wide/16 v4, 0x10

    .line 16
    .line 17
    cmp-long v2, v2, v4

    .line 18
    .line 19
    if-gtz v2, :cond_1

    .line 20
    .line 21
    if-eqz p4, :cond_3

    .line 22
    .line 23
    :cond_1
    iput-wide v0, p0, Lcom/facebook/react/devsupport/MultipartStreamReader;->mLastProgressEvent:J

    .line 24
    .line 25
    const-string p4, "Content-Length"

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    move-result-object p4

    .line 36
    .line 37
    check-cast p4, Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-static {p4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 41
    move-result-wide v0

    .line 42
    :goto_0
    move-object v3, p1

    .line 43
    move-wide v4, p2

    .line 44
    move-object v2, p5

    .line 45
    move-wide v6, v0

    .line 46
    goto :goto_1

    .line 47
    .line 48
    :cond_2
    const-wide/16 v0, 0x0

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :goto_1
    invoke-interface/range {v2 .. v7}, Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;->onChunkProgress(Ljava/util/Map;JJ)V

    .line 53
    :cond_3
    :goto_2
    return-void
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
.end method

.method private parseHeaders(Lokio/Buffer;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/Buffer;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
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
    invoke-virtual {p1}, Lokio/Buffer;->readUtf8()Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    const-string v1, "\r\n"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    array-length v1, p1

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    .line 20
    :goto_0
    if-ge v3, v1, :cond_1

    .line 21
    .line 22
    aget-object v4, p1, v3

    .line 23
    .line 24
    const-string v5, ":"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 28
    move-result v5

    .line 29
    const/4 v6, -0x1

    .line 30
    .line 31
    if-ne v5, v6, :cond_0

    .line 32
    goto :goto_1

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    move-result-object v6

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 40
    move-result-object v6

    .line 41
    .line 42
    add-int/lit8 v5, v5, 0x1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 50
    move-result-object v4

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return-object v0
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


# virtual methods
.method public readAllParts(Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)Z
    .locals 22
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
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "\r\n--"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    iget-object v3, v0, Lcom/facebook/react/devsupport/MultipartStreamReader;->mBoundary:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "\r\n"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    .line 30
    move-result-object v6

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    iget-object v2, v0, Lcom/facebook/react/devsupport/MultipartStreamReader;->mBoundary:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v2, "--"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    .line 59
    move-result-object v7

    .line 60
    .line 61
    const-string v1, "\r\n\r\n"

    .line 62
    .line 63
    .line 64
    invoke-static {v1}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    .line 65
    move-result-object v8

    .line 66
    .line 67
    new-instance v9, Lokio/Buffer;

    .line 68
    .line 69
    .line 70
    invoke-direct {v9}, Lokio/Buffer;-><init>()V

    .line 71
    .line 72
    const-wide/16 v15, 0x0

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    move-wide v1, v15

    .line 76
    move-wide v3, v1

    .line 77
    move-wide v10, v3

    .line 78
    .line 79
    move-object/from16 v5, v17

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-virtual {v7}, Lokio/ByteString;->size()I

    .line 83
    move-result v12

    .line 84
    int-to-long v12, v12

    .line 85
    sub-long/2addr v1, v12

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 89
    move-result-wide v1

    .line 90
    .line 91
    .line 92
    invoke-virtual {v9, v6, v1, v2}, Lokio/Buffer;->indexOf(Lokio/ByteString;J)J

    .line 93
    move-result-wide v12

    .line 94
    .line 95
    const-wide/16 v18, -0x1

    .line 96
    .line 97
    cmp-long v14, v12, v18

    .line 98
    .line 99
    const/16 v20, 0x1

    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    if-nez v14, :cond_0

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9, v7, v1, v2}, Lokio/Buffer;->indexOf(Lokio/ByteString;J)J

    .line 107
    move-result-wide v12

    .line 108
    .line 109
    move/from16 v14, v20

    .line 110
    goto :goto_1

    .line 111
    .line 112
    :cond_0
    move/from16 v14, v21

    .line 113
    .line 114
    :goto_1
    cmp-long v18, v12, v18

    .line 115
    .line 116
    if-nez v18, :cond_4

    .line 117
    .line 118
    .line 119
    invoke-virtual {v9}, Lokio/Buffer;->size()J

    .line 120
    move-result-wide v18

    .line 121
    .line 122
    if-nez v5, :cond_2

    .line 123
    .line 124
    .line 125
    invoke-virtual {v9, v8, v1, v2}, Lokio/Buffer;->indexOf(Lokio/ByteString;J)J

    .line 126
    move-result-wide v12

    .line 127
    .line 128
    cmp-long v14, v12, v15

    .line 129
    .line 130
    if-ltz v14, :cond_1

    .line 131
    .line 132
    iget-object v5, v0, Lcom/facebook/react/devsupport/MultipartStreamReader;->mSource:Lokio/BufferedSource;

    .line 133
    .line 134
    .line 135
    invoke-interface {v5, v9, v12, v13}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 136
    .line 137
    new-instance v10, Lokio/Buffer;

    .line 138
    .line 139
    .line 140
    invoke-direct {v10}, Lokio/Buffer;-><init>()V

    .line 141
    .line 142
    sub-long v13, v12, v1

    .line 143
    move-wide v11, v1

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v9 .. v14}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v10}, Lokio/Buffer;->size()J

    .line 150
    move-result-wide v1

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8}, Lokio/ByteString;->size()I

    .line 154
    move-result v5

    .line 155
    int-to-long v11, v5

    .line 156
    add-long/2addr v1, v11

    .line 157
    .line 158
    .line 159
    invoke-direct {v0, v10}, Lcom/facebook/react/devsupport/MultipartStreamReader;->parseHeaders(Lokio/Buffer;)Ljava/util/Map;

    .line 160
    move-result-object v5

    .line 161
    move-wide v10, v1

    .line 162
    :cond_1
    move-wide v12, v3

    .line 163
    goto :goto_2

    .line 164
    .line 165
    .line 166
    :cond_2
    invoke-virtual {v9}, Lokio/Buffer;->size()J

    .line 167
    move-result-wide v1

    .line 168
    sub-long/2addr v1, v10

    .line 169
    move-wide v12, v3

    .line 170
    const/4 v4, 0x0

    .line 171
    move-wide v2, v1

    .line 172
    move-object v1, v5

    .line 173
    .line 174
    move-object/from16 v5, p1

    .line 175
    .line 176
    .line 177
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/devsupport/MultipartStreamReader;->emitProgress(Ljava/util/Map;JZLcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)V

    .line 178
    move-object v5, v1

    .line 179
    .line 180
    :goto_2
    iget-object v1, v0, Lcom/facebook/react/devsupport/MultipartStreamReader;->mSource:Lokio/BufferedSource;

    .line 181
    .line 182
    const/16 v2, 0x1000

    .line 183
    int-to-long v2, v2

    .line 184
    .line 185
    .line 186
    invoke-interface {v1, v9, v2, v3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 187
    move-result-wide v1

    .line 188
    .line 189
    cmp-long v1, v1, v15

    .line 190
    .line 191
    if-gtz v1, :cond_3

    .line 192
    return v21

    .line 193
    :cond_3
    move-wide v3, v12

    .line 194
    .line 195
    move-wide/from16 v1, v18

    .line 196
    goto :goto_0

    .line 197
    :cond_4
    move-wide v2, v3

    .line 198
    move-object v1, v5

    .line 199
    .line 200
    sub-long v4, v12, v2

    .line 201
    .line 202
    cmp-long v18, v2, v15

    .line 203
    .line 204
    if-lez v18, :cond_5

    .line 205
    .line 206
    new-instance v12, Lokio/Buffer;

    .line 207
    .line 208
    .line 209
    invoke-direct {v12}, Lokio/Buffer;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v9, v2, v3}, Lokio/Buffer;->skip(J)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v9, v12, v4, v5}, Lokio/Buffer;->read(Lokio/Buffer;J)J

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12}, Lokio/Buffer;->size()J

    .line 219
    move-result-wide v2

    .line 220
    sub-long/2addr v2, v10

    .line 221
    const/4 v4, 0x1

    .line 222
    .line 223
    move-object/from16 v5, p1

    .line 224
    .line 225
    .line 226
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/devsupport/MultipartStreamReader;->emitProgress(Ljava/util/Map;JZLcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)V

    .line 227
    .line 228
    .line 229
    invoke-direct {v0, v12, v14, v5}, Lcom/facebook/react/devsupport/MultipartStreamReader;->emitChunk(Lokio/Buffer;ZLcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)V

    .line 230
    move-wide v10, v15

    .line 231
    .line 232
    move-object/from16 v1, v17

    .line 233
    goto :goto_3

    .line 234
    .line 235
    :cond_5
    move-object/from16 v5, p1

    .line 236
    .line 237
    .line 238
    invoke-virtual {v9, v12, v13}, Lokio/Buffer;->skip(J)V

    .line 239
    .line 240
    :goto_3
    if-eqz v14, :cond_6

    .line 241
    return v20

    .line 242
    .line 243
    .line 244
    :cond_6
    invoke-virtual {v6}, Lokio/ByteString;->size()I

    .line 245
    move-result v2

    .line 246
    int-to-long v3, v2

    .line 247
    move-object v5, v1

    .line 248
    move-wide v1, v3

    .line 249
    .line 250
    goto/16 :goto_0
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
.end method
