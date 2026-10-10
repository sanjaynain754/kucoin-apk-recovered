.class public Landroidx/media3/datasource/FileDescriptorDataSource;
.super Landroidx/media3/datasource/BaseDataSource;
.source "FileDescriptorDataSource.java"


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# static fields
.field private static final inUseFileDescriptors:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/io/FileDescriptor;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private bytesRemaining:J

.field private final fileDescriptor:Ljava/io/FileDescriptor;

.field private inputStream:Ljava/io/FileInputStream;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final length:J

.field private final offset:J

.field private opened:Z

.field private uri:Landroid/net/Uri;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/google/common/collect/Sets;->newConcurrentHashSet()Ljava/util/Set;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Landroidx/media3/datasource/FileDescriptorDataSource;->inUseFileDescriptors:Ljava/util/Set;

    .line 7
    return-void
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

.method public constructor <init>(Ljava/io/FileDescriptor;JJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Landroidx/media3/datasource/BaseDataSource;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Ljava/io/FileDescriptor;

    .line 11
    .line 12
    iput-object p1, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->fileDescriptor:Ljava/io/FileDescriptor;

    .line 13
    .line 14
    iput-wide p2, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->offset:J

    .line 15
    .line 16
    iput-wide p4, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->length:J

    .line 17
    return-void
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

.method private static seekFileDescriptor(Ljava/io/FileDescriptor;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/datasource/DataSourceException;
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    sget v0, Landroid/system/OsConstants;->SEEK_SET:I

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p1, p2, v0}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p0

    .line 8
    .line 9
    new-instance p1, Landroidx/media3/datasource/DataSourceException;

    .line 10
    .line 11
    const/16 p2, 0x7d0

    .line 12
    .line 13
    .line 14
    invoke-direct {p1, p0, p2}, Landroidx/media3/datasource/DataSourceException;-><init>(Ljava/lang/Throwable;I)V

    .line 15
    throw p1
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


# virtual methods
.method public close()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/datasource/DataSourceException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->uri:Landroid/net/Uri;

    .line 4
    .line 5
    sget-object v1, Landroidx/media3/datasource/FileDescriptorDataSource;->inUseFileDescriptors:Ljava/util/Set;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->fileDescriptor:Ljava/io/FileDescriptor;

    .line 8
    .line 9
    .line 10
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    :try_start_0
    iget-object v2, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->inputStream:Ljava/io/FileInputStream;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v2

    .line 21
    goto :goto_2

    .line 22
    :catch_0
    move-exception v2

    .line 23
    goto :goto_1

    .line 24
    .line 25
    :cond_0
    :goto_0
    iput-object v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->inputStream:Ljava/io/FileInputStream;

    .line 26
    .line 27
    iget-boolean v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->opened:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iput-boolean v1, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->opened:Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/media3/datasource/BaseDataSource;->transferEnded()V

    .line 35
    :cond_1
    return-void

    .line 36
    .line 37
    :goto_1
    :try_start_1
    new-instance v3, Landroidx/media3/datasource/DataSourceException;

    .line 38
    .line 39
    const/16 v4, 0x7d0

    .line 40
    .line 41
    .line 42
    invoke-direct {v3, v2, v4}, Landroidx/media3/datasource/DataSourceException;-><init>(Ljava/lang/Throwable;I)V

    .line 43
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    :goto_2
    iput-object v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->inputStream:Ljava/io/FileInputStream;

    .line 46
    .line 47
    iget-boolean v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->opened:Z

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iput-boolean v1, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->opened:Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/media3/datasource/BaseDataSource;->transferEnded()V

    .line 55
    :cond_2
    throw v2
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

.method public getUri()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->uri:Landroid/net/Uri;

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

.method public open(Landroidx/media3/datasource/DataSpec;)J
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/datasource/DataSourceException;
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p1, Landroidx/media3/datasource/DataSpec;->uri:Landroid/net/Uri;

    .line 3
    .line 4
    iput-object v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->uri:Landroid/net/Uri;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/media3/datasource/BaseDataSource;->transferInitializing(Landroidx/media3/datasource/DataSpec;)V

    .line 8
    .line 9
    sget-object v0, Landroidx/media3/datasource/FileDescriptorDataSource;->inUseFileDescriptors:Ljava/util/Set;

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->fileDescriptor:Ljava/io/FileDescriptor;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_9

    .line 18
    .line 19
    iget-wide v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->length:J

    .line 20
    .line 21
    const-wide/16 v2, -0x1

    .line 22
    .line 23
    cmp-long v4, v0, v2

    .line 24
    .line 25
    const/16 v5, 0x7d8

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    iget-wide v6, p1, Landroidx/media3/datasource/DataSpec;->position:J

    .line 30
    .line 31
    cmp-long v0, v6, v0

    .line 32
    .line 33
    if-gtz v0, :cond_0

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_0
    new-instance p1, Landroidx/media3/datasource/DataSourceException;

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, v5}, Landroidx/media3/datasource/DataSourceException;-><init>(I)V

    .line 40
    throw p1

    .line 41
    :catch_0
    move-exception p1

    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    :catch_1
    move-exception p1

    .line 45
    .line 46
    goto/16 :goto_5

    .line 47
    .line 48
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->fileDescriptor:Ljava/io/FileDescriptor;

    .line 49
    .line 50
    iget-wide v6, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->offset:J

    .line 51
    .line 52
    iget-wide v8, p1, Landroidx/media3/datasource/DataSpec;->position:J

    .line 53
    add-long/2addr v6, v8

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v6, v7}, Landroidx/media3/datasource/FileDescriptorDataSource;->seekFileDescriptor(Ljava/io/FileDescriptor;J)V

    .line 57
    .line 58
    new-instance v0, Ljava/io/FileInputStream;

    .line 59
    .line 60
    iget-object v1, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->fileDescriptor:Ljava/io/FileDescriptor;

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 64
    .line 65
    iput-object v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->inputStream:Ljava/io/FileInputStream;

    .line 66
    .line 67
    iget-wide v6, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->length:J

    .line 68
    .line 69
    cmp-long v1, v6, v2

    .line 70
    .line 71
    const-wide/16 v8, 0x0

    .line 72
    .line 73
    if-nez v1, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    .line 81
    move-result-wide v6

    .line 82
    .line 83
    cmp-long v1, v6, v8

    .line 84
    .line 85
    if-nez v1, :cond_2

    .line 86
    .line 87
    iput-wide v2, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->bytesRemaining:J

    .line 88
    goto :goto_1

    .line 89
    .line 90
    .line 91
    :cond_2
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->position()J

    .line 92
    move-result-wide v0

    .line 93
    sub-long/2addr v6, v0

    .line 94
    .line 95
    iput-wide v6, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->bytesRemaining:J

    .line 96
    .line 97
    cmp-long v0, v6, v8

    .line 98
    .line 99
    if-ltz v0, :cond_3

    .line 100
    goto :goto_1

    .line 101
    .line 102
    :cond_3
    new-instance p1, Landroidx/media3/datasource/DataSourceException;

    .line 103
    .line 104
    .line 105
    invoke-direct {p1, v5}, Landroidx/media3/datasource/DataSourceException;-><init>(I)V

    .line 106
    throw p1

    .line 107
    .line 108
    :cond_4
    iget-wide v0, p1, Landroidx/media3/datasource/DataSpec;->position:J

    .line 109
    sub-long/2addr v6, v0

    .line 110
    .line 111
    iput-wide v6, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->bytesRemaining:J
    :try_end_0
    .catch Landroidx/media3/datasource/DataSourceException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    .line 113
    cmp-long v0, v6, v8

    .line 114
    .line 115
    if-ltz v0, :cond_8

    .line 116
    .line 117
    :goto_1
    iget-wide v0, p1, Landroidx/media3/datasource/DataSpec;->length:J

    .line 118
    .line 119
    cmp-long v4, v0, v2

    .line 120
    .line 121
    if-eqz v4, :cond_6

    .line 122
    .line 123
    iget-wide v4, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->bytesRemaining:J

    .line 124
    .line 125
    cmp-long v6, v4, v2

    .line 126
    .line 127
    if-nez v6, :cond_5

    .line 128
    goto :goto_2

    .line 129
    .line 130
    .line 131
    :cond_5
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 132
    move-result-wide v0

    .line 133
    .line 134
    :goto_2
    iput-wide v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->bytesRemaining:J

    .line 135
    :cond_6
    const/4 v0, 0x1

    .line 136
    .line 137
    iput-boolean v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->opened:Z

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p1}, Landroidx/media3/datasource/BaseDataSource;->transferStarted(Landroidx/media3/datasource/DataSpec;)V

    .line 141
    .line 142
    iget-wide v0, p1, Landroidx/media3/datasource/DataSpec;->length:J

    .line 143
    .line 144
    cmp-long p1, v0, v2

    .line 145
    .line 146
    if-eqz p1, :cond_7

    .line 147
    return-wide v0

    .line 148
    .line 149
    :cond_7
    iget-wide v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->bytesRemaining:J

    .line 150
    return-wide v0

    .line 151
    .line 152
    :cond_8
    :try_start_1
    new-instance p1, Landroidx/media3/datasource/DataSourceException;

    .line 153
    .line 154
    .line 155
    invoke-direct {p1, v5}, Landroidx/media3/datasource/DataSourceException;-><init>(I)V

    .line 156
    throw p1

    .line 157
    .line 158
    :cond_9
    new-instance p1, Landroidx/media3/datasource/DataSourceException;

    .line 159
    .line 160
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    const-string v1, "Attempted to re-use an already in-use file descriptor"

    .line 163
    .line 164
    .line 165
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 166
    const/4 v1, -0x2

    .line 167
    .line 168
    .line 169
    invoke-direct {p1, v0, v1}, Landroidx/media3/datasource/DataSourceException;-><init>(Ljava/lang/Throwable;I)V

    .line 170
    throw p1
    :try_end_1
    .catch Landroidx/media3/datasource/DataSourceException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 171
    .line 172
    :goto_3
    new-instance v0, Landroidx/media3/datasource/DataSourceException;

    .line 173
    .line 174
    instance-of v1, p1, Ljava/io/FileNotFoundException;

    .line 175
    .line 176
    if-eqz v1, :cond_a

    .line 177
    .line 178
    const/16 v1, 0x7d5

    .line 179
    goto :goto_4

    .line 180
    .line 181
    :cond_a
    const/16 v1, 0x7d0

    .line 182
    .line 183
    .line 184
    :goto_4
    invoke-direct {v0, p1, v1}, Landroidx/media3/datasource/DataSourceException;-><init>(Ljava/lang/Throwable;I)V

    .line 185
    throw v0

    .line 186
    :goto_5
    throw p1
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

.method public read([BII)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/datasource/DataSourceException;
        }
    .end annotation

    .line 1
    .line 2
    if-nez p3, :cond_0

    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    .line 6
    :cond_0
    iget-wide v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->bytesRemaining:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    const/4 v3, -0x1

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    return v3

    .line 15
    .line 16
    :cond_1
    const-wide/16 v4, -0x1

    .line 17
    .line 18
    cmp-long v2, v0, v4

    .line 19
    .line 20
    if-nez v2, :cond_2

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    int-to-long v6, p3

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 26
    move-result-wide v0

    .line 27
    long-to-int p3, v0

    .line 28
    .line 29
    :goto_0
    :try_start_0
    iget-object v0, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->inputStream:Ljava/io/FileInputStream;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Landroidx/media3/common/util/Util;->castNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    check-cast v0, Ljava/io/FileInputStream;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/FileInputStream;->read([BII)I

    .line 39
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    if-ne p1, v3, :cond_3

    .line 42
    return v3

    .line 43
    .line 44
    :cond_3
    iget-wide p2, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->bytesRemaining:J

    .line 45
    .line 46
    cmp-long v0, p2, v4

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    int-to-long v0, p1

    .line 50
    sub-long/2addr p2, v0

    .line 51
    .line 52
    iput-wide p2, p0, Landroidx/media3/datasource/FileDescriptorDataSource;->bytesRemaining:J

    .line 53
    .line 54
    .line 55
    :cond_4
    invoke-virtual {p0, p1}, Landroidx/media3/datasource/BaseDataSource;->bytesTransferred(I)V

    .line 56
    return p1

    .line 57
    :catch_0
    move-exception p1

    .line 58
    .line 59
    new-instance p2, Landroidx/media3/datasource/DataSourceException;

    .line 60
    .line 61
    const/16 p3, 0x7d0

    .line 62
    .line 63
    .line 64
    invoke-direct {p2, p1, p3}, Landroidx/media3/datasource/DataSourceException;-><init>(Ljava/lang/Throwable;I)V

    .line 65
    throw p2
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
