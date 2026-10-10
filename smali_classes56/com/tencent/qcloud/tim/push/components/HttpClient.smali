.class public Lcom/tencent/qcloud/tim/push/components/HttpClient;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/String; = "HttpClient"

.field public static final d:I = 0x3a98

.field public static final e:I = 0x3a98

.field public static volatile f:Lcom/tencent/qcloud/tim/push/components/HttpClient;


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public final b:Landroid/os/Handler;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x4

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/HttpClient;->a:Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    new-instance v0, Landroid/os/Handler;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/tencent/qcloud/tim/push/components/HttpClient;->b:Landroid/os/Handler;

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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public static a()Lcom/tencent/qcloud/tim/push/components/HttpClient;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/qcloud/tim/push/components/HttpClient;->f:Lcom/tencent/qcloud/tim/push/components/HttpClient;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tencent/qcloud/tim/push/components/HttpClient;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/qcloud/tim/push/components/HttpClient;->f:Lcom/tencent/qcloud/tim/push/components/HttpClient;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/qcloud/tim/push/components/HttpClient;

    invoke-direct {v1}, Lcom/tencent/qcloud/tim/push/components/HttpClient;-><init>()V

    sput-object v1, Lcom/tencent/qcloud/tim/push/components/HttpClient;->f:Lcom/tencent/qcloud/tim/push/components/HttpClient;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/qcloud/tim/push/components/HttpClient;->f:Lcom/tencent/qcloud/tim/push/components/HttpClient;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_0

    .line 10
    const-string p1, ""

    return-object p1

    .line 11
    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 12
    :try_start_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 15
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    return-object p1

    .line 17
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final a(ILjava/lang/String;Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 7

    .line 19
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/HttpClient;->b:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/qcloud/tim/push/components/HttpClient$2;

    move-object v2, p0

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v3, p4

    invoke-direct/range {v1 .. v6}, Lcom/tencent/qcloud/tim/push/components/HttpClient$2;-><init>(Lcom/tencent/qcloud/tim/push/components/HttpClient;Lcom/tencent/qcloud/tim/push/TIMPushCallback;ILjava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/HttpClient;->b:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/qcloud/tim/push/components/HttpClient$1;

    invoke-direct {v1, p0, p2, p1}, Lcom/tencent/qcloud/tim/push/components/HttpClient$1;-><init>(Lcom/tencent/qcloud/tim/push/components/HttpClient;Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/tencent/qcloud/tim/push/TIMPushCallback;",
            ")V"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/HttpClient;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/tencent/qcloud/tim/push/components/a;

    move-object v2, p0

    move-object v4, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/tencent/qcloud/tim/push/components/a;-><init>(Lcom/tencent/qcloud/tim/push/components/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/qcloud/tim/push/TIMPushCallback;",
            ")V"
        }
    .end annotation

    .line 7
    const-string v1, "GET"

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/qcloud/tim/push/components/HttpClient;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/tencent/qcloud/tim/push/TIMPushCallback;",
            ")V"
        }
    .end annotation

    .line 8
    const-string v1, "POST"

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/qcloud/tim/push/components/HttpClient;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    return-void
.end method

.method public final synthetic b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "HttpClient"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    invoke-direct {v2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    check-cast v2, Ljava/net/URLConnection;

    .line 19
    .line 20
    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 21
    .line 22
    .line 23
    :try_start_1
    invoke-virtual {v2, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 24
    .line 25
    const/16 v3, 0x3a98

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 32
    const/4 v3, 0x1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 36
    .line 37
    if-eqz p3, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 41
    move-result-object p3

    .line 42
    .line 43
    .line 44
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 45
    move-result-object p3

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    move-result v4

    .line 50
    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    .line 54
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    check-cast v4, Ljava/util/Map$Entry;

    .line 58
    .line 59
    .line 60
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 61
    move-result-object v5

    .line 62
    .line 63
    check-cast v5, Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    check-cast v4, Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v5, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    move-object v1, v2

    .line 76
    .line 77
    goto/16 :goto_7

    .line 78
    :catch_0
    move-exception p2

    .line 79
    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :cond_0
    const-string p3, "POST"

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    move-result p2

    .line 87
    .line 88
    if-eqz p2, :cond_2

    .line 89
    .line 90
    if-eqz p4, :cond_2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 94
    .line 95
    const-string p2, "Content-Type"

    .line 96
    .line 97
    const-string p3, "application/json; charset=utf-8"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, p2, p3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 104
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    :try_start_2
    new-instance p3, Ljava/io/BufferedWriter;

    .line 107
    .line 108
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 109
    .line 110
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 111
    .line 112
    .line 113
    invoke-direct {v3, p2, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 114
    .line 115
    .line 116
    invoke-direct {p3, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 117
    .line 118
    .line 119
    :try_start_3
    invoke-virtual {p3, p4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3}, Ljava/io/BufferedWriter;->flush()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    .line 124
    .line 125
    :try_start_4
    invoke-virtual {p3}, Ljava/io/BufferedWriter;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 126
    .line 127
    if-eqz p2, :cond_2

    .line 128
    .line 129
    .line 130
    :try_start_5
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 131
    goto :goto_4

    .line 132
    :catchall_1
    move-exception p3

    .line 133
    goto :goto_2

    .line 134
    :catchall_2
    move-exception p4

    .line 135
    .line 136
    .line 137
    :try_start_6
    invoke-virtual {p3}, Ljava/io/BufferedWriter;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 138
    goto :goto_1

    .line 139
    :catchall_3
    move-exception p3

    .line 140
    .line 141
    .line 142
    :try_start_7
    invoke-virtual {p4, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 143
    :goto_1
    throw p4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 144
    .line 145
    :goto_2
    if-eqz p2, :cond_1

    .line 146
    .line 147
    .line 148
    :try_start_8
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 149
    goto :goto_3

    .line 150
    :catchall_4
    move-exception p2

    .line 151
    .line 152
    .line 153
    :try_start_9
    invoke-virtual {p3, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 154
    :cond_1
    :goto_3
    throw p3

    .line 155
    .line 156
    .line 157
    :cond_2
    :goto_4
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 158
    move-result p2

    .line 159
    .line 160
    const/16 p3, 0xc8

    .line 161
    .line 162
    if-lt p2, p3, :cond_3

    .line 163
    .line 164
    const/16 p3, 0x12c

    .line 165
    .line 166
    if-ge p2, p3, :cond_3

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 170
    move-result-object p2

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p2}, Lcom/tencent/qcloud/tim/push/components/HttpClient;->a(Ljava/io/InputStream;)Ljava/lang/String;

    .line 174
    move-result-object p2

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, p2, p5}, Lcom/tencent/qcloud/tim/push/components/HttpClient;->a(Ljava/lang/String;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V

    .line 178
    goto :goto_6

    .line 179
    .line 180
    .line 181
    :cond_3
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 182
    move-result-object p3

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, p3}, Lcom/tencent/qcloud/tim/push/components/HttpClient;->a(Ljava/io/InputStream;)Ljava/lang/String;

    .line 186
    move-result-object p3

    .line 187
    .line 188
    new-instance p4, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    const-string v3, "Request error code: "

    .line 194
    .line 195
    .line 196
    invoke-virtual {p4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v3, ", message: "

    .line 202
    .line 203
    .line 204
    invoke-virtual {p4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    move-result-object p4

    .line 212
    .line 213
    .line 214
    invoke-static {v0, p4}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, p2, p3, v1, p5}, Lcom/tencent/qcloud/tim/push/components/HttpClient;->a(ILjava/lang/String;Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 218
    goto :goto_6

    .line 219
    :catchall_5
    move-exception p1

    .line 220
    goto :goto_7

    .line 221
    :catch_1
    move-exception p2

    .line 222
    move-object v2, v1

    .line 223
    .line 224
    :goto_5
    :try_start_a
    new-instance p3, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    const-string p4, "Request exception for URL: "

    .line 230
    .line 231
    .line 232
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    move-result-object p1

    .line 243
    .line 244
    .line 245
    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    const p2, 0xc3511

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, p2, p1, v1, p5}, Lcom/tencent/qcloud/tim/push/components/HttpClient;->a(ILjava/lang/String;Ljava/lang/Object;Lcom/tencent/qcloud/tim/push/TIMPushCallback;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 252
    .line 253
    if-eqz v2, :cond_4

    .line 254
    .line 255
    .line 256
    :goto_6
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 257
    :cond_4
    return-void

    .line 258
    .line 259
    :goto_7
    if-eqz v1, :cond_5

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 263
    :cond_5
    throw p1
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
.end method
