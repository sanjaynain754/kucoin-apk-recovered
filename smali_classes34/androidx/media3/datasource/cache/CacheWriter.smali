.class public final Landroidx/media3/datasource/cache/CacheWriter;
.super Ljava/lang/Object;
.source "CacheWriter.java"


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/datasource/cache/CacheWriter$ProgressListener;
    }
.end annotation


# static fields
.field public static final DEFAULT_BUFFER_SIZE_BYTES:I = 0x20000


# instance fields
.field private bytesCached:J

.field private final cache:Landroidx/media3/datasource/cache/Cache;

.field private final cacheKey:Ljava/lang/String;

.field private final dataSource:Landroidx/media3/datasource/cache/CacheDataSource;

.field private final dataSpec:Landroidx/media3/datasource/DataSpec;

.field private endPosition:J

.field private volatile isCanceled:Z

.field private nextPosition:J

.field private final progressListener:Landroidx/media3/datasource/cache/CacheWriter$ProgressListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final temporaryBuffer:[B


# direct methods
.method public constructor <init>(Landroidx/media3/datasource/cache/CacheDataSource;Landroidx/media3/datasource/DataSpec;[BLandroidx/media3/datasource/cache/CacheWriter$ProgressListener;)V
    .locals 1
    .param p3    # [B
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Landroidx/media3/datasource/cache/CacheWriter$ProgressListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSource:Landroidx/media3/datasource/cache/CacheDataSource;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/media3/datasource/cache/CacheDataSource;->getCache()Landroidx/media3/datasource/cache/Cache;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->cache:Landroidx/media3/datasource/cache/Cache;

    .line 12
    .line 13
    iput-object p2, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSpec:Landroidx/media3/datasource/DataSpec;

    .line 14
    .line 15
    if-nez p3, :cond_0

    .line 16
    .line 17
    const/high16 p3, 0x20000

    .line 18
    .line 19
    new-array p3, p3, [B

    .line 20
    .line 21
    :cond_0
    iput-object p3, p0, Landroidx/media3/datasource/cache/CacheWriter;->temporaryBuffer:[B

    .line 22
    .line 23
    iput-object p4, p0, Landroidx/media3/datasource/cache/CacheWriter;->progressListener:Landroidx/media3/datasource/cache/CacheWriter$ProgressListener;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/media3/datasource/cache/CacheDataSource;->getCacheKeyFactory()Landroidx/media3/datasource/cache/CacheKeyFactory;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, p2}, Landroidx/media3/datasource/cache/CacheKeyFactory;->buildCacheKey(Landroidx/media3/datasource/DataSpec;)Ljava/lang/String;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    iput-object p1, p0, Landroidx/media3/datasource/cache/CacheWriter;->cacheKey:Ljava/lang/String;

    .line 34
    .line 35
    iget-wide p1, p2, Landroidx/media3/datasource/DataSpec;->position:J

    .line 36
    .line 37
    iput-wide p1, p0, Landroidx/media3/datasource/cache/CacheWriter;->nextPosition:J

    .line 38
    return-void
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

.method private getLength()J
    .locals 5

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->endPosition:J

    .line 3
    .line 4
    const-wide/16 v2, -0x1

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    .line 8
    if-nez v4, :cond_0

    .line 9
    return-wide v2

    .line 10
    .line 11
    :cond_0
    iget-object v2, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSpec:Landroidx/media3/datasource/DataSpec;

    .line 12
    .line 13
    iget-wide v2, v2, Landroidx/media3/datasource/DataSpec;->position:J

    .line 14
    sub-long/2addr v0, v2

    .line 15
    return-wide v0
    .line 16
    .line 17
    .line 18
.end method

.method private onNewBytesCached(J)V
    .locals 9

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->bytesCached:J

    .line 3
    add-long/2addr v0, p1

    .line 4
    .line 5
    iput-wide v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->bytesCached:J

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/media3/datasource/cache/CacheWriter;->progressListener:Landroidx/media3/datasource/cache/CacheWriter$ProgressListener;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Landroidx/media3/datasource/cache/CacheWriter;->getLength()J

    .line 13
    move-result-wide v3

    .line 14
    .line 15
    iget-wide v5, p0, Landroidx/media3/datasource/cache/CacheWriter;->bytesCached:J

    .line 16
    move-wide v7, p1

    .line 17
    .line 18
    .line 19
    invoke-interface/range {v2 .. v8}, Landroidx/media3/datasource/cache/CacheWriter$ProgressListener;->onProgress(JJJ)V

    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method private onRequestEndPosition(J)V
    .locals 8

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->endPosition:J

    .line 3
    .line 4
    cmp-long v0, v0, p1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    iput-wide p1, p0, Landroidx/media3/datasource/cache/CacheWriter;->endPosition:J

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/media3/datasource/cache/CacheWriter;->progressListener:Landroidx/media3/datasource/cache/CacheWriter$ProgressListener;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/media3/datasource/cache/CacheWriter;->getLength()J

    .line 17
    move-result-wide v2

    .line 18
    .line 19
    iget-wide v4, p0, Landroidx/media3/datasource/cache/CacheWriter;->bytesCached:J

    .line 20
    .line 21
    const-wide/16 v6, 0x0

    .line 22
    .line 23
    .line 24
    invoke-interface/range {v1 .. v7}, Landroidx/media3/datasource/cache/CacheWriter$ProgressListener;->onProgress(JJJ)V

    .line 25
    :cond_1
    :goto_0
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
.end method

.method private readBlockToCache(JJ)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    add-long v0, p1, p3

    .line 3
    .line 4
    iget-wide v2, p0, Landroidx/media3/datasource/cache/CacheWriter;->endPosition:J

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    const-wide/16 v3, -0x1

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    cmp-long v0, p3, v3

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v0, v1

    .line 21
    .line 22
    :goto_1
    cmp-long v5, p3, v3

    .line 23
    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    iget-object v5, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSpec:Landroidx/media3/datasource/DataSpec;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5}, Landroidx/media3/datasource/DataSpec;->buildUpon()Landroidx/media3/datasource/DataSpec$Builder;

    .line 30
    move-result-object v5

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5, p1, p2}, Landroidx/media3/datasource/DataSpec$Builder;->setPosition(J)Landroidx/media3/datasource/DataSpec$Builder;

    .line 34
    move-result-object v5

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, p3, p4}, Landroidx/media3/datasource/DataSpec$Builder;->setLength(J)Landroidx/media3/datasource/DataSpec$Builder;

    .line 38
    move-result-object p3

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3}, Landroidx/media3/datasource/DataSpec$Builder;->build()Landroidx/media3/datasource/DataSpec;

    .line 42
    move-result-object p3

    .line 43
    .line 44
    :try_start_0
    iget-object p4, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSource:Landroidx/media3/datasource/cache/CacheDataSource;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p4, p3}, Landroidx/media3/datasource/cache/CacheDataSource;->open(Landroidx/media3/datasource/DataSpec;)J

    .line 48
    move-result-wide p3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :catch_0
    iget-object p3, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSource:Landroidx/media3/datasource/cache/CacheDataSource;

    .line 52
    .line 53
    .line 54
    invoke-static {p3}, Landroidx/media3/datasource/DataSourceUtil;->closeQuietly(Landroidx/media3/datasource/DataSource;)V

    .line 55
    :cond_2
    move v1, v2

    .line 56
    move-wide p3, v3

    .line 57
    .line 58
    :goto_2
    if-nez v1, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Landroidx/media3/datasource/cache/CacheWriter;->throwIfCanceled()V

    .line 62
    .line 63
    iget-object p3, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSpec:Landroidx/media3/datasource/DataSpec;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3}, Landroidx/media3/datasource/DataSpec;->buildUpon()Landroidx/media3/datasource/DataSpec$Builder;

    .line 67
    move-result-object p3

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, p1, p2}, Landroidx/media3/datasource/DataSpec$Builder;->setPosition(J)Landroidx/media3/datasource/DataSpec$Builder;

    .line 71
    move-result-object p3

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3, v3, v4}, Landroidx/media3/datasource/DataSpec$Builder;->setLength(J)Landroidx/media3/datasource/DataSpec$Builder;

    .line 75
    move-result-object p3

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3}, Landroidx/media3/datasource/DataSpec$Builder;->build()Landroidx/media3/datasource/DataSpec;

    .line 79
    move-result-object p3

    .line 80
    .line 81
    :try_start_1
    iget-object p4, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSource:Landroidx/media3/datasource/cache/CacheDataSource;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p4, p3}, Landroidx/media3/datasource/cache/CacheDataSource;->open(Landroidx/media3/datasource/DataSpec;)J

    .line 85
    move-result-wide p3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 86
    goto :goto_3

    .line 87
    :catch_1
    move-exception p1

    .line 88
    .line 89
    iget-object p2, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSource:Landroidx/media3/datasource/cache/CacheDataSource;

    .line 90
    .line 91
    .line 92
    invoke-static {p2}, Landroidx/media3/datasource/DataSourceUtil;->closeQuietly(Landroidx/media3/datasource/DataSource;)V

    .line 93
    throw p1

    .line 94
    .line 95
    :cond_3
    :goto_3
    if-eqz v0, :cond_4

    .line 96
    .line 97
    cmp-long v1, p3, v3

    .line 98
    .line 99
    if-eqz v1, :cond_4

    .line 100
    add-long/2addr p3, p1

    .line 101
    .line 102
    .line 103
    :try_start_2
    invoke-direct {p0, p3, p4}, Landroidx/media3/datasource/cache/CacheWriter;->onRequestEndPosition(J)V

    .line 104
    goto :goto_4

    .line 105
    :catch_2
    move-exception p1

    .line 106
    goto :goto_6

    .line 107
    :cond_4
    :goto_4
    move p3, v2

    .line 108
    move p4, p3

    .line 109
    :cond_5
    :goto_5
    const/4 v1, -0x1

    .line 110
    .line 111
    if-eq p3, v1, :cond_6

    .line 112
    .line 113
    .line 114
    invoke-direct {p0}, Landroidx/media3/datasource/cache/CacheWriter;->throwIfCanceled()V

    .line 115
    .line 116
    iget-object p3, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSource:Landroidx/media3/datasource/cache/CacheDataSource;

    .line 117
    .line 118
    iget-object v3, p0, Landroidx/media3/datasource/cache/CacheWriter;->temporaryBuffer:[B

    .line 119
    array-length v4, v3

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3, v3, v2, v4}, Landroidx/media3/datasource/cache/CacheDataSource;->read([BII)I

    .line 123
    move-result p3

    .line 124
    .line 125
    if-eq p3, v1, :cond_5

    .line 126
    int-to-long v3, p3

    .line 127
    .line 128
    .line 129
    invoke-direct {p0, v3, v4}, Landroidx/media3/datasource/cache/CacheWriter;->onNewBytesCached(J)V

    .line 130
    add-int/2addr p4, p3

    .line 131
    goto :goto_5

    .line 132
    .line 133
    :cond_6
    if-eqz v0, :cond_7

    .line 134
    int-to-long v0, p4

    .line 135
    add-long/2addr p1, v0

    .line 136
    .line 137
    .line 138
    invoke-direct {p0, p1, p2}, Landroidx/media3/datasource/cache/CacheWriter;->onRequestEndPosition(J)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 139
    goto :goto_7

    .line 140
    .line 141
    :goto_6
    iget-object p2, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSource:Landroidx/media3/datasource/cache/CacheDataSource;

    .line 142
    .line 143
    .line 144
    invoke-static {p2}, Landroidx/media3/datasource/DataSourceUtil;->closeQuietly(Landroidx/media3/datasource/DataSource;)V

    .line 145
    throw p1

    .line 146
    .line 147
    :cond_7
    :goto_7
    iget-object p1, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSource:Landroidx/media3/datasource/cache/CacheDataSource;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Landroidx/media3/datasource/cache/CacheDataSource;->close()V

    .line 151
    int-to-long p1, p4

    .line 152
    return-wide p1
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

.method private throwIfCanceled()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/InterruptedIOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->isCanceled:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 11
    throw v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public cache()V
    .locals 13
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/datasource/cache/CacheWriter;->throwIfCanceled()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->cache:Landroidx/media3/datasource/cache/Cache;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/datasource/cache/CacheWriter;->cacheKey:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSpec:Landroidx/media3/datasource/DataSpec;

    .line 10
    move-object v4, v2

    .line 11
    .line 12
    iget-wide v2, v4, Landroidx/media3/datasource/DataSpec;->position:J

    .line 13
    .line 14
    iget-wide v4, v4, Landroidx/media3/datasource/DataSpec;->length:J

    .line 15
    .line 16
    .line 17
    invoke-interface/range {v0 .. v5}, Landroidx/media3/datasource/cache/Cache;->getCachedBytes(Ljava/lang/String;JJ)J

    .line 18
    move-result-wide v0

    .line 19
    .line 20
    iput-wide v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->bytesCached:J

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->dataSpec:Landroidx/media3/datasource/DataSpec;

    .line 23
    .line 24
    iget-wide v1, v0, Landroidx/media3/datasource/DataSpec;->length:J

    .line 25
    .line 26
    const-wide/16 v3, -0x1

    .line 27
    .line 28
    cmp-long v5, v1, v3

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    iget-wide v5, v0, Landroidx/media3/datasource/DataSpec;->position:J

    .line 33
    add-long/2addr v5, v1

    .line 34
    .line 35
    iput-wide v5, p0, Landroidx/media3/datasource/cache/CacheWriter;->endPosition:J

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->cache:Landroidx/media3/datasource/cache/Cache;

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/media3/datasource/cache/CacheWriter;->cacheKey:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-interface {v0, v1}, Landroidx/media3/datasource/cache/Cache;->getContentMetadata(Ljava/lang/String;)Landroidx/media3/datasource/cache/ContentMetadata;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Landroidx/media3/datasource/cache/ContentMetadata;->getContentLength(Landroidx/media3/datasource/cache/ContentMetadata;)J

    .line 48
    move-result-wide v0

    .line 49
    .line 50
    cmp-long v2, v0, v3

    .line 51
    .line 52
    if-nez v2, :cond_1

    .line 53
    move-wide v0, v3

    .line 54
    .line 55
    :cond_1
    iput-wide v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->endPosition:J

    .line 56
    .line 57
    :goto_0
    iget-object v5, p0, Landroidx/media3/datasource/cache/CacheWriter;->progressListener:Landroidx/media3/datasource/cache/CacheWriter$ProgressListener;

    .line 58
    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    .line 62
    invoke-direct {p0}, Landroidx/media3/datasource/cache/CacheWriter;->getLength()J

    .line 63
    move-result-wide v6

    .line 64
    .line 65
    iget-wide v8, p0, Landroidx/media3/datasource/cache/CacheWriter;->bytesCached:J

    .line 66
    .line 67
    const-wide/16 v10, 0x0

    .line 68
    .line 69
    .line 70
    invoke-interface/range {v5 .. v11}, Landroidx/media3/datasource/cache/CacheWriter$ProgressListener;->onProgress(JJJ)V

    .line 71
    .line 72
    :cond_2
    :goto_1
    iget-wide v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->endPosition:J

    .line 73
    .line 74
    cmp-long v2, v0, v3

    .line 75
    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    iget-wide v5, p0, Landroidx/media3/datasource/cache/CacheWriter;->nextPosition:J

    .line 79
    .line 80
    cmp-long v0, v5, v0

    .line 81
    .line 82
    if-gez v0, :cond_3

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    return-void

    .line 85
    .line 86
    .line 87
    :cond_4
    :goto_2
    invoke-direct {p0}, Landroidx/media3/datasource/cache/CacheWriter;->throwIfCanceled()V

    .line 88
    .line 89
    iget-wide v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->endPosition:J

    .line 90
    .line 91
    cmp-long v2, v0, v3

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    const-wide v5, 0x7fffffffffffffffL

    .line 97
    .line 98
    if-nez v2, :cond_5

    .line 99
    move-wide v11, v5

    .line 100
    goto :goto_3

    .line 101
    .line 102
    :cond_5
    iget-wide v7, p0, Landroidx/media3/datasource/cache/CacheWriter;->nextPosition:J

    .line 103
    sub-long/2addr v0, v7

    .line 104
    move-wide v11, v0

    .line 105
    .line 106
    :goto_3
    iget-object v7, p0, Landroidx/media3/datasource/cache/CacheWriter;->cache:Landroidx/media3/datasource/cache/Cache;

    .line 107
    .line 108
    iget-object v8, p0, Landroidx/media3/datasource/cache/CacheWriter;->cacheKey:Ljava/lang/String;

    .line 109
    .line 110
    iget-wide v9, p0, Landroidx/media3/datasource/cache/CacheWriter;->nextPosition:J

    .line 111
    .line 112
    .line 113
    invoke-interface/range {v7 .. v12}, Landroidx/media3/datasource/cache/Cache;->getCachedLength(Ljava/lang/String;JJ)J

    .line 114
    move-result-wide v0

    .line 115
    .line 116
    const-wide/16 v7, 0x0

    .line 117
    .line 118
    cmp-long v2, v0, v7

    .line 119
    .line 120
    if-lez v2, :cond_6

    .line 121
    .line 122
    iget-wide v5, p0, Landroidx/media3/datasource/cache/CacheWriter;->nextPosition:J

    .line 123
    add-long/2addr v5, v0

    .line 124
    .line 125
    iput-wide v5, p0, Landroidx/media3/datasource/cache/CacheWriter;->nextPosition:J

    .line 126
    goto :goto_1

    .line 127
    :cond_6
    neg-long v0, v0

    .line 128
    .line 129
    cmp-long v2, v0, v5

    .line 130
    .line 131
    if-nez v2, :cond_7

    .line 132
    move-wide v0, v3

    .line 133
    .line 134
    :cond_7
    iget-wide v5, p0, Landroidx/media3/datasource/cache/CacheWriter;->nextPosition:J

    .line 135
    .line 136
    .line 137
    invoke-direct {p0, v5, v6, v0, v1}, Landroidx/media3/datasource/cache/CacheWriter;->readBlockToCache(JJ)J

    .line 138
    move-result-wide v0

    .line 139
    add-long/2addr v5, v0

    .line 140
    .line 141
    iput-wide v5, p0, Landroidx/media3/datasource/cache/CacheWriter;->nextPosition:J

    .line 142
    goto :goto_1
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
    .line 233
    .line 234
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
.end method

.method public cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Landroidx/media3/datasource/cache/CacheWriter;->isCanceled:Z

    .line 4
    return-void
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
