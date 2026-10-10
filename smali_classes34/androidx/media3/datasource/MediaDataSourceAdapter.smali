.class public Landroidx/media3/datasource/MediaDataSourceAdapter;
.super Landroidx/media3/datasource/BaseDataSource;
.source "MediaDataSourceAdapter.java"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x17
.end annotation

.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# instance fields
.field private bytesRemaining:J

.field private final mediaDataSource:Landroid/media/MediaDataSource;

.field private opened:Z

.field private position:J

.field private uri:Landroid/net/Uri;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/media/MediaDataSource;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroidx/media3/datasource/BaseDataSource;-><init>(Z)V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->mediaDataSource:Landroid/media/MediaDataSource;

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
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->uri:Landroid/net/Uri;

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->opened:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->opened:Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/media3/datasource/BaseDataSource;->transferEnded()V

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getUri()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->uri:Landroid/net/Uri;

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
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p1, Landroidx/media3/datasource/DataSpec;->uri:Landroid/net/Uri;

    .line 3
    .line 4
    iput-object v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->uri:Landroid/net/Uri;

    .line 5
    .line 6
    iget-wide v0, p1, Landroidx/media3/datasource/DataSpec;->position:J

    .line 7
    .line 8
    iput-wide v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->position:J

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/media3/datasource/BaseDataSource;->transferInitializing(Landroidx/media3/datasource/DataSpec;)V

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->mediaDataSource:Landroid/media/MediaDataSource;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/media/MediaDataSource;->getSize()J

    .line 17
    move-result-wide v0

    .line 18
    .line 19
    const-wide/16 v2, -0x1

    .line 20
    .line 21
    cmp-long v0, v0, v2

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-wide v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->position:J

    .line 26
    .line 27
    iget-object v4, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->mediaDataSource:Landroid/media/MediaDataSource;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, Landroid/media/MediaDataSource;->getSize()J

    .line 31
    move-result-wide v4

    .line 32
    .line 33
    cmp-long v0, v0, v4

    .line 34
    .line 35
    if-gtz v0, :cond_0

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_0
    new-instance p1, Landroidx/media3/datasource/DataSourceException;

    .line 39
    .line 40
    const/16 v0, 0x7d8

    .line 41
    .line 42
    .line 43
    invoke-direct {p1, v0}, Landroidx/media3/datasource/DataSourceException;-><init>(I)V

    .line 44
    throw p1

    .line 45
    .line 46
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->mediaDataSource:Landroid/media/MediaDataSource;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/media/MediaDataSource;->getSize()J

    .line 50
    move-result-wide v0

    .line 51
    .line 52
    cmp-long v0, v0, v2

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    iput-wide v2, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->bytesRemaining:J

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_2
    iget-object v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->mediaDataSource:Landroid/media/MediaDataSource;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/media/MediaDataSource;->getSize()J

    .line 63
    move-result-wide v0

    .line 64
    .line 65
    iget-wide v4, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->position:J

    .line 66
    sub-long/2addr v0, v4

    .line 67
    .line 68
    iput-wide v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->bytesRemaining:J

    .line 69
    .line 70
    :goto_1
    iget-wide v0, p1, Landroidx/media3/datasource/DataSpec;->length:J

    .line 71
    .line 72
    cmp-long v4, v0, v2

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    iget-wide v4, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->bytesRemaining:J

    .line 77
    .line 78
    cmp-long v6, v4, v2

    .line 79
    .line 80
    if-nez v6, :cond_3

    .line 81
    goto :goto_2

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 85
    move-result-wide v0

    .line 86
    .line 87
    :goto_2
    iput-wide v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->bytesRemaining:J

    .line 88
    :cond_4
    const/4 v0, 0x1

    .line 89
    .line 90
    iput-boolean v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->opened:Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, Landroidx/media3/datasource/BaseDataSource;->transferStarted(Landroidx/media3/datasource/DataSpec;)V

    .line 94
    .line 95
    iget-wide v0, p1, Landroidx/media3/datasource/DataSpec;->length:J

    .line 96
    .line 97
    cmp-long p1, v0, v2

    .line 98
    .line 99
    if-eqz p1, :cond_5

    .line 100
    return-wide v0

    .line 101
    .line 102
    :cond_5
    iget-wide v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->bytesRemaining:J

    .line 103
    return-wide v0
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

.method public read([BII)I
    .locals 12
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
    iget-wide v0, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->bytesRemaining:J

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
    :goto_0
    move v11, p3

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    int-to-long v6, p3

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 27
    move-result-wide v0

    .line 28
    long-to-int p3, v0

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :goto_1
    :try_start_0
    iget-object v6, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->mediaDataSource:Landroid/media/MediaDataSource;

    .line 32
    .line 33
    iget-wide v7, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->position:J

    .line 34
    move-object v9, p1

    .line 35
    move v10, p2

    .line 36
    .line 37
    .line 38
    invoke-virtual/range {v6 .. v11}, Landroid/media/MediaDataSource;->readAt(J[BII)I

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
    iget-wide p2, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->position:J

    .line 45
    int-to-long v0, p1

    .line 46
    add-long/2addr p2, v0

    .line 47
    .line 48
    iput-wide p2, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->position:J

    .line 49
    .line 50
    iget-wide p2, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->bytesRemaining:J

    .line 51
    .line 52
    cmp-long v2, p2, v4

    .line 53
    .line 54
    if-eqz v2, :cond_4

    .line 55
    sub-long/2addr p2, v0

    .line 56
    .line 57
    iput-wide p2, p0, Landroidx/media3/datasource/MediaDataSourceAdapter;->bytesRemaining:J

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p0, p1}, Landroidx/media3/datasource/BaseDataSource;->bytesTransferred(I)V

    .line 61
    return p1

    .line 62
    :catch_0
    move-exception v0

    .line 63
    move-object p1, v0

    .line 64
    .line 65
    new-instance p2, Landroidx/media3/datasource/DataSourceException;

    .line 66
    .line 67
    const/16 p3, 0x7d0

    .line 68
    .line 69
    .line 70
    invoke-direct {p2, p1, p3}, Landroidx/media3/datasource/DataSourceException;-><init>(Ljava/lang/Throwable;I)V

    .line 71
    throw p2
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
