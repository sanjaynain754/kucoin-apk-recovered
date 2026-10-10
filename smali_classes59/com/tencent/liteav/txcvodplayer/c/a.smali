.class public Lcom/tencent/liteav/txcvodplayer/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lcom/tencent/liteav/txcvodplayer/c/a;


# instance fields
.field public final a:Lcom/tencent/liteav/txcplayer/a/c;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/tencent/liteav/txcplayer/a/c;

.field private volatile f:J

.field private final g:Lcom/tencent/liteav/txcplayer/a/c;


# direct methods
.method static constructor <clinit>()V
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
.end method

.method private constructor <init>()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/liteav/txcplayer/a/c;

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "v4_cache"

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/tencent/liteav/txcplayer/a/c;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    .line 21
    .line 22
    iget-object v1, v0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 23
    .line 24
    const-string v2, "clean_time"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/base/storage/PersistStorage;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_0
    iget-object v1, v0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/base/storage/PersistStorage;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object v3, v0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 47
    move-result-wide v4

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2, v4, v5}, Lcom/tencent/liteav/base/storage/PersistStorage;->put(Ljava/lang/String;J)V

    .line 51
    .line 52
    iget-object v3, v0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v2}, Lcom/tencent/liteav/base/storage/PersistStorage;->clear(Ljava/lang/String;)V

    .line 56
    .line 57
    iget-object v2, v0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/tencent/liteav/base/storage/PersistStorage;->commit()V

    .line 61
    .line 62
    iget-object v0, v0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/tencent/liteav/base/storage/PersistStorage;->commit()V

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 v1, 0x0

    .line 68
    .line 69
    :cond_2
    :goto_0
    if-nez v1, :cond_3

    .line 70
    .line 71
    const-wide/16 v0, 0x0

    .line 72
    goto :goto_1

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 76
    move-result-wide v0

    .line 77
    .line 78
    :goto_1
    iput-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->f:J

    .line 79
    .line 80
    new-instance v0, Lcom/tencent/liteav/txcplayer/a/c;

    .line 81
    .line 82
    .line 83
    const-string/jumbo v1, "v4_download"

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v1}, Lcom/tencent/liteav/txcplayer/a/c;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->a:Lcom/tencent/liteav/txcplayer/a/c;

    .line 89
    .line 90
    new-instance v0, Lcom/tencent/liteav/txcplayer/a/c;

    .line 91
    .line 92
    .line 93
    const-string/jumbo v1, "v4_common"

    .line 94
    .line 95
    .line 96
    invoke-direct {v0, v1}, Lcom/tencent/liteav/txcplayer/a/c;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->g:Lcom/tencent/liteav/txcplayer/a/c;

    .line 99
    .line 100
    new-instance v0, Ljava/util/HashSet;

    .line 101
    .line 102
    .line 103
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 104
    .line 105
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->c:Ljava/util/Set;

    .line 106
    return-void
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
.end method

.method public static a()Lcom/tencent/liteav/txcvodplayer/c/a;
    .locals 2

    .line 1
    const-class v0, Lcom/tencent/liteav/txcvodplayer/c/a;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tencent/liteav/txcvodplayer/c/a;->d:Lcom/tencent/liteav/txcvodplayer/c/a;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/c/a;

    invoke-direct {v1}, Lcom/tencent/liteav/txcvodplayer/c/a;-><init>()V

    sput-object v1, Lcom/tencent/liteav/txcvodplayer/c/a;->d:Lcom/tencent/liteav/txcvodplayer/c/a;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 4
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    sget-object v0, Lcom/tencent/liteav/txcvodplayer/c/a;->d:Lcom/tencent/liteav/txcvodplayer/c/a;

    return-object v0

    .line 6
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/c/a;ILjava/lang/String;Lcom/tencent/liteav/txcvodplayer/b/c$b;)V
    .locals 3

    .line 34
    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/c/a;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 35
    const-string v1, "default"

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->a(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 36
    iget-object p2, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->a:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 37
    iget-object v1, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->b:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    const-string p2, "_"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->c:Ljava/lang/String;

    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->d:Ljava/lang/String;

    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->a:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/tencent/liteav/txcplayer/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->a:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {p0}, Lcom/tencent/liteav/txcplayer/a/c;->a()V

    .line 47
    new-instance p0, Ljava/lang/StringBuilder;

    const-string/jumbo p1, "put download key: "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " value:"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "PlayInfoProtocolV4Storage"

    invoke-static {p1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/c/a;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/liteav/txcvodplayer/b/c$b;)V
    .locals 6

    .line 11
    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/c/a;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-static {p3}, Lcom/tencent/liteav/txcplayer/a/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 13
    const-string v1, "default"

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->a(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 14
    iget-object p2, p4, Lcom/tencent/liteav/txcvodplayer/b/c$b;->a:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 15
    iget-object v1, p4, Lcom/tencent/liteav/txcvodplayer/b/c$b;->b:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    const-string p2, "_"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/32 v4, 0x36ee80

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p4, Lcom/tencent/liteav/txcvodplayer/b/c$b;->c:Ljava/lang/String;

    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p4, Lcom/tencent/liteav/txcvodplayer/b/c$b;->d:Ljava/lang/String;

    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/tencent/liteav/txcplayer/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {p0}, Lcom/tencent/liteav/txcplayer/a/c;->a()V

    .line 29
    new-instance p0, Ljava/lang/StringBuilder;

    const-string/jumbo p1, "put cache key: "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " value:"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "PlayInfoProtocolV4Storage"

    invoke-static {p1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/txcvodplayer/c/a;Ljava/lang/String;J)V
    .locals 12

    .line 68
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {v0}, Lcom/tencent/liteav/txcplayer/a/c;->b()[Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 71
    :cond_1
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_6

    aget-object v3, v0, v2

    .line 72
    iget-object v4, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {v4, v3}, Lcom/tencent/liteav/txcplayer/a/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 73
    const-string v5, "_"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 74
    array-length v6, v5

    const/4 v7, 0x4

    if-lt v6, v7, :cond_5

    const/4 v6, 0x3

    .line 75
    :try_start_0
    aget-object v6, v5, v6

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-long v6, p2, v6

    .line 76
    const-string v8, "666_"

    invoke-virtual {v3, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    const-wide/16 v9, 0x18

    const/4 v11, 0x2

    if-eqz v8, :cond_3

    cmp-long v6, v6, v9

    if-ltz v6, :cond_5

    .line 77
    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v8, "tp_dp_file/"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v8, v5, v11

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_5

    .line 78
    iget-object v6, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->b:Ljava/lang/Object;

    monitor-enter v6

    .line 79
    :try_start_1
    iget-object v7, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->c:Ljava/util/Set;

    aget-object v5, v5, v11

    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 80
    monitor-exit v6

    goto/16 :goto_2

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 81
    :cond_2
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {v5, v3}, Lcom/tencent/liteav/txcplayer/a/c;->a(Ljava/lang/String;)V

    .line 83
    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {v5}, Lcom/tencent/liteav/txcplayer/a/c;->a()V

    .line 84
    const-string v5, "PlayInfoProtocolV4Storage"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "clean key: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " value: "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 85
    :goto_1
    :try_start_2
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    :cond_3
    cmp-long v8, v6, v9

    if-ltz v8, :cond_5

    const-wide/16 v8, 0x48

    cmp-long v6, v6, v8

    if-gez v6, :cond_4

    .line 86
    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v8, v5, v11

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_5

    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v5, v11

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".m3u8"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_5

    .line 89
    :cond_4
    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {v5, v3}, Lcom/tencent/liteav/txcplayer/a/c;->a(Ljava/lang/String;)V

    .line 90
    iget-object v5, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {v5}, Lcom/tencent/liteav/txcplayer/a/c;->a()V

    .line 91
    const-string v5, "PlayInfoProtocolV4Storage"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "clean key: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " value: "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :catch_0
    :cond_5
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 92
    :cond_6
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    const-string p2, "clean_time"

    iget-wide v0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->f:J

    .line 93
    iget-object p3, p1, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    invoke-virtual {p3, p2, v0, v1}, Lcom/tencent/liteav/base/storage/PersistStorage;->put(Ljava/lang/String;J)V

    .line 94
    iget-object p1, p1, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    if-eqz p1, :cond_7

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/base/storage/PersistStorage;->clear(Ljava/lang/String;)V

    .line 95
    :cond_7
    iget-object p0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {p0}, Lcom/tencent/liteav/txcplayer/a/c;->a()V

    return-void
.end method

.method public static b(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "_"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ILjava/lang/String;)Lcom/tencent/liteav/txcvodplayer/b/c$b;
    .locals 8

    .line 48
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "PlayInfoProtocolV4Storage"

    if-eqz v0, :cond_0

    .line 49
    const-string p1, "get fileId is empty"

    invoke-static {v2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 50
    :cond_0
    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/c/a;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 51
    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->a:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {v3, v0}, Lcom/tencent/liteav/txcplayer/a/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 52
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    .line 53
    iget-object v3, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->e:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {v3, v0}, Lcom/tencent/liteav/txcplayer/a/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move v0, v6

    goto :goto_0

    :cond_1
    move v0, v5

    .line 54
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 55
    const-string v4, "_"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 56
    array-length v4, v3

    const/4 v7, 0x2

    if-lt v4, v7, :cond_4

    .line 57
    new-instance v1, Lcom/tencent/liteav/txcvodplayer/b/c$b;

    invoke-direct {v1}, Lcom/tencent/liteav/txcvodplayer/b/c$b;-><init>()V

    .line 58
    const-string v4, "default"

    invoke-static {p1, v4, p2, v6}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->a(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 59
    aget-object p2, v3, v6

    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, v1, Lcom/tencent/liteav/txcvodplayer/b/c$b;->a:Ljava/lang/String;

    .line 60
    aget-object p2, v3, v5

    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/tencent/liteav/txcvodplayer/b/c$b;->b:Ljava/lang/String;

    const/4 p1, 0x4

    if-eqz v0, :cond_2

    .line 61
    array-length p2, v3

    if-lt p2, p1, :cond_3

    .line 62
    aget-object p1, v3, v7

    iput-object p1, v1, Lcom/tencent/liteav/txcvodplayer/b/c$b;->c:Ljava/lang/String;

    const/4 p1, 0x3

    .line 63
    aget-object p1, v3, p1

    iput-object p1, v1, Lcom/tencent/liteav/txcvodplayer/b/c$b;->d:Ljava/lang/String;

    goto :goto_1

    .line 64
    :cond_2
    array-length p2, v3

    const/4 v0, 0x6

    if-lt p2, v0, :cond_3

    .line 65
    aget-object p1, v3, p1

    iput-object p1, v1, Lcom/tencent/liteav/txcvodplayer/b/c$b;->c:Ljava/lang/String;

    const/4 p1, 0x5

    .line 66
    aget-object p1, v3, p1

    iput-object p1, v1, Lcom/tencent/liteav/txcvodplayer/b/c$b;->d:Ljava/lang/String;

    .line 67
    :cond_3
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "get key: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, v1, Lcom/tencent/liteav/txcvodplayer/b/c$b;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " iv: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, v1, Lcom/tencent/liteav/txcvodplayer/b/c$b;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-object v1
.end method

.method public final a(ILjava/lang/String;Lcom/tencent/liteav/txcvodplayer/b/c$b;)V
    .locals 1

    .line 30
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p3, :cond_1

    iget-object v0, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->c:Ljava/lang/String;

    .line 31
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 32
    :cond_0
    invoke-static {}, Lcom/tencent/liteav/txcplayer/common/a;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    invoke-static {p0, p1, p2, p3}, Lcom/tencent/liteav/txcvodplayer/c/c;->a(Lcom/tencent/liteav/txcvodplayer/c/a;ILjava/lang/String;Lcom/tencent/liteav/txcvodplayer/b/c$b;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 33
    :cond_1
    :goto_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo p2, "put params empty fileId: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "PlayInfoProtocolV4Storage"

    invoke-static {p2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(ILjava/lang/String;Lcom/tencent/liteav/txcvodplayer/b/c$b;Ljava/lang/String;)V
    .locals 1

    .line 7
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p3, :cond_1

    iget-object v0, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->c:Ljava/lang/String;

    .line 8
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p3, Lcom/tencent/liteav/txcvodplayer/b/c$b;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/tencent/liteav/txcplayer/common/a;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    invoke-static {p0, p1, p2, p4, p3}, Lcom/tencent/liteav/txcvodplayer/c/b;->a(Lcom/tencent/liteav/txcvodplayer/c/a;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/liteav/txcvodplayer/b/c$b;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 10
    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string/jumbo p3, "put params empty fileId: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " url:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "PlayInfoProtocolV4Storage"

    invoke-static {p2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    .line 96
    const-string p1, ""

    .line 97
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/liteav/txcvodplayer/c/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 98
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->g:Lcom/tencent/liteav/txcplayer/a/c;

    const-string/jumbo v1, "vld_host"

    invoke-virtual {v0, v1, p1}, Lcom/tencent/liteav/txcplayer/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->g:Lcom/tencent/liteav/txcplayer/a/c;

    invoke-virtual {v0}, Lcom/tencent/liteav/txcplayer/a/c;->a()V

    .line 100
    const-string/jumbo v0, "save host: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "PlayInfoProtocolV4Storage"

    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final b()V
    .locals 9

    .line 1
    invoke-static {}, Lcom/tencent/liteav/txcplayer/common/b;->a()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "PlayInfoProtocolV4Storage"

    if-eqz v1, :cond_0

    .line 3
    const-string v0, "clean cacheDir is empty"

    invoke-static {v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-wide/32 v5, 0x36ee80

    div-long/2addr v3, v5

    .line 5
    iget-wide v5, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->f:J

    const-wide/16 v7, 0x0

    cmp-long v1, v5, v7

    if-lez v1, :cond_1

    iget-wide v5, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->f:J

    sub-long v5, v3, v5

    const-wide/16 v7, 0x18

    cmp-long v1, v5, v7

    if-gez v1, :cond_1

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "clean mLastCacheCleanTime: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->f:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " not more than 24h"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 7
    :cond_1
    iput-wide v3, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->f:J

    .line 8
    invoke-static {}, Lcom/tencent/liteav/txcplayer/common/a;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v1

    invoke-static {p0, v0, v3, v4}, Lcom/tencent/liteav/txcvodplayer/c/d;->a(Lcom/tencent/liteav/txcvodplayer/c/a;Ljava/lang/String;J)Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/c/a;->g:Lcom/tencent/liteav/txcplayer/a/c;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "vld_host"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcplayer/a/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    :cond_0
    return-object v0
    .line 15
    .line 16
    .line 17
.end method
