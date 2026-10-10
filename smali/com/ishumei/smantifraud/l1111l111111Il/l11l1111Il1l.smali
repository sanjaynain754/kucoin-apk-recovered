.class public final Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static l1111l111111Il:Ljava/lang/String; = "sm-async-thread"

.field private static final l111l11111I1l:Ljava/lang/String; = "POST"

.field private static final l111l11111Il:I = 0x3

.field private static l111l11111lIl:Ljava/util/concurrent/Executor;

.field private static final l111l1111l1Il:[I


# instance fields
.field private l111l1111lI1l:Ljava/lang/String;

.field private l111l1111lIl:Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;

.field private l111l1111llIl:Ljava/lang/String;

.field private l11l1111lIIl:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 3
    .line 4
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 7
    .line 8
    const/16 v1, 0x14

    .line 9
    .line 10
    .line 11
    invoke-direct {v6, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 12
    .line 13
    new-instance v7, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l$1;

    .line 14
    .line 15
    .line 16
    invoke-direct {v7}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l$1;-><init>()V

    .line 17
    .line 18
    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;

    .line 19
    .line 20
    .line 21
    invoke-direct {v8}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V

    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x4

    .line 24
    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v0 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 29
    .line 30
    sput-object v0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l11111lIl:Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    const/16 v0, 0x3a98

    .line 33
    .line 34
    const/16 v1, 0x7530

    .line 35
    .line 36
    const/16 v2, 0x7d0

    .line 37
    .line 38
    const/16 v3, 0x1388

    .line 39
    .line 40
    .line 41
    filled-new-array {v2, v3, v0, v1}, [I

    .line 42
    move-result-object v0

    .line 43
    .line 44
    sput-object v0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l1111l1Il:[I

    .line 45
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l1111lI1l:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l1111llIl:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l1111lIl:Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;

    .line 10
    return-void
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
.end method

.method public static l1111l111111Il(Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;->l111l1111l1Il()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget-object v0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l11111lIl:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    new-instance v1, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, p0, p1, p2}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 31
    :cond_0
    return-void
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
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    .line 2
    const-string v0, "deviceId"

    .line 3
    .line 4
    const-string v1, "detail"

    .line 5
    .line 6
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l1111llIl:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v3, "retry"

    .line 14
    const/4 v4, 0x1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 21
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8

    .line 22
    .line 23
    :catch_0
    :cond_0
    :goto_0
    sget-boolean v3, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l1111l1Il:Z

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    goto/16 :goto_b

    .line 28
    :cond_1
    const/4 v3, 0x0

    .line 29
    .line 30
    :try_start_1
    iget v5, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 31
    const/4 v6, 0x3

    .line 32
    .line 33
    if-lt v5, v6, :cond_2

    .line 34
    .line 35
    sget-object v5, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l1111l1Il:[I

    .line 36
    .line 37
    aget v5, v5, v6

    .line 38
    :goto_1
    int-to-long v5, v5

    .line 39
    goto :goto_2

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object v1, v3

    .line 42
    move-object v6, v1

    .line 43
    .line 44
    goto/16 :goto_8

    .line 45
    .line 46
    :cond_2
    sget-object v6, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l1111l1Il:[I

    .line 47
    .line 48
    rem-int/lit8 v5, v5, 0x3

    .line 49
    .line 50
    aget v5, v6, v5

    .line 51
    goto :goto_1

    .line 52
    .line 53
    .line 54
    :goto_2
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    .line 55
    .line 56
    iget-object v5, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l1111lIl:Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;->l1111l111111Il()I

    .line 60
    move-result v5

    .line 61
    .line 62
    if-ltz v5, :cond_3

    .line 63
    .line 64
    iget v5, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 65
    .line 66
    iget-object v6, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l1111lIl:Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;->l1111l111111Il()I

    .line 70
    move-result v6
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    if-le v5, v6, :cond_3

    .line 73
    .line 74
    iget v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 75
    add-int/2addr v0, v4

    .line 76
    .line 77
    iput v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 78
    return-void

    .line 79
    .line 80
    :cond_3
    :try_start_2
    new-instance v5, Ljava/net/URL;

    .line 81
    .line 82
    iget-object v6, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l111l1111lI1l:Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    invoke-direct {v5, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 89
    move-result-object v5

    .line 90
    .line 91
    .line 92
    invoke-static {v5}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    move-result-object v5

    .line 94
    .line 95
    check-cast v5, Ljava/net/URLConnection;

    .line 96
    .line 97
    check-cast v5, Ljava/net/HttpURLConnection;
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    .line 99
    .line 100
    :try_start_3
    invoke-virtual {v5, v4}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, v4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 104
    const/4 v6, 0x0

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, v6}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5, v4}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 111
    .line 112
    const-string v6, "POST"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, v6}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 116
    .line 117
    const-string v6, "Content-Type"

    .line 118
    .line 119
    const-string v7, "application/octet-stream"

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v6, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    const-string v6, "Connection"

    .line 125
    .line 126
    const-string v7, "Close"

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v6, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    const/16 v6, 0x7530

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v6}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v6}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    .line 141
    move-result-object v6

    .line 142
    array-length v6, v6

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5, v6}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5}, Ljava/net/URLConnection;->connect()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 152
    move-result-object v6
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 153
    .line 154
    .line 155
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    .line 156
    move-result-object v7

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6, v7}, Ljava/io/OutputStream;->write([B)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6}, Ljava/io/OutputStream;->flush()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 166
    move-result v7
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 167
    .line 168
    const/16 v8, 0xc8

    .line 169
    .line 170
    if-eq v7, v8, :cond_4

    .line 171
    .line 172
    iget v3, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 173
    add-int/2addr v3, v4

    .line 174
    .line 175
    iput v3, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 176
    .line 177
    .line 178
    :try_start_5
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    .line 186
    :cond_4
    :try_start_6
    invoke-virtual {v5}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 187
    move-result-object v3

    .line 188
    .line 189
    new-instance v7, Ljava/io/BufferedReader;

    .line 190
    .line 191
    new-instance v8, Ljava/io/InputStreamReader;

    .line 192
    .line 193
    .line 194
    invoke-direct {v8, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 195
    .line 196
    .line 197
    invoke-direct {v7, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 198
    .line 199
    new-instance v8, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    :goto_3
    invoke-virtual {v7}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 206
    move-result-object v9

    .line 207
    .line 208
    if-eqz v9, :cond_5

    .line 209
    .line 210
    .line 211
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    goto :goto_3

    .line 213
    :catchall_1
    move-exception v0

    .line 214
    move-object v1, v3

    .line 215
    :goto_4
    move-object v3, v5

    .line 216
    .line 217
    goto/16 :goto_8

    .line 218
    .line 219
    .line 220
    :cond_5
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    move-result-object v7

    .line 222
    .line 223
    new-instance v8, Lorg/json/JSONObject;

    .line 224
    .line 225
    .line 226
    invoke-direct {v8, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    const-string v7, "code"

    .line 229
    .line 230
    .line 231
    invoke-virtual {v8, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 232
    move-result v7
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 233
    .line 234
    const/16 v9, 0x76e

    .line 235
    .line 236
    if-ne v7, v9, :cond_6

    .line 237
    .line 238
    iget v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 239
    add-int/2addr v0, v4

    .line 240
    .line 241
    iput v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 242
    .line 243
    .line 244
    :try_start_7
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V

    .line 248
    .line 249
    if-eqz v3, :cond_10

    .line 250
    .line 251
    .line 252
    :goto_5
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8

    .line 253
    .line 254
    goto/16 :goto_b

    .line 255
    .line 256
    .line 257
    :cond_6
    :try_start_8
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 258
    move-result v7
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 259
    .line 260
    if-nez v7, :cond_7

    .line 261
    .line 262
    iget v7, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 263
    add-int/2addr v7, v4

    .line 264
    .line 265
    iput v7, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 266
    .line 267
    .line 268
    :try_start_9
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V

    .line 272
    .line 273
    if-eqz v3, :cond_0

    .line 274
    .line 275
    .line 276
    :goto_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 277
    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    .line 281
    :cond_7
    :try_start_a
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 282
    move-result-object v7

    .line 283
    .line 284
    if-eqz v7, :cond_8

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    move-result-object v8

    .line 289
    .line 290
    .line 291
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 292
    move-result v8

    .line 293
    .line 294
    if-nez v8, :cond_8

    .line 295
    .line 296
    .line 297
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    move-result-object v7

    .line 299
    .line 300
    .line 301
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    .line 302
    move-result-object v8

    .line 303
    .line 304
    .line 305
    invoke-virtual {v8, v7, v4}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il(Ljava/lang/String;Z)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 306
    .line 307
    iget v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 308
    add-int/2addr v0, v4

    .line 309
    .line 310
    iput v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 311
    .line 312
    .line 313
    :try_start_b
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8

    .line 317
    .line 318
    if-eqz v3, :cond_10

    .line 319
    goto :goto_5

    .line 320
    .line 321
    :cond_8
    iget v7, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 322
    add-int/2addr v7, v4

    .line 323
    .line 324
    iput v7, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 325
    .line 326
    .line 327
    :try_start_c
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    .line 331
    .line 332
    if-eqz v3, :cond_0

    .line 333
    goto :goto_6

    .line 334
    :catch_1
    move-object v10, v5

    .line 335
    move-object v5, v3

    .line 336
    move-object v3, v10

    .line 337
    goto :goto_9

    .line 338
    :catch_2
    move-object v0, v3

    .line 339
    :goto_7
    move-object v3, v5

    .line 340
    goto :goto_a

    .line 341
    :catchall_2
    move-exception v0

    .line 342
    move-object v1, v3

    .line 343
    move-object v6, v1

    .line 344
    .line 345
    goto/16 :goto_4

    .line 346
    :catch_3
    move-object v6, v3

    .line 347
    move-object v3, v5

    .line 348
    move-object v5, v6

    .line 349
    goto :goto_9

    .line 350
    :catch_4
    move-object v0, v3

    .line 351
    move-object v6, v0

    .line 352
    goto :goto_7

    .line 353
    .line 354
    :goto_8
    iget v2, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 355
    add-int/2addr v2, v4

    .line 356
    .line 357
    iput v2, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 358
    .line 359
    if-eqz v3, :cond_9

    .line 360
    .line 361
    .line 362
    :try_start_d
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 363
    .line 364
    :cond_9
    if-eqz v6, :cond_a

    .line 365
    .line 366
    .line 367
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V

    .line 368
    .line 369
    :cond_a
    if-eqz v1, :cond_b

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    .line 373
    :catch_5
    :cond_b
    throw v0

    .line 374
    :catch_6
    move-object v5, v3

    .line 375
    move-object v6, v5

    .line 376
    .line 377
    :goto_9
    iget v7, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 378
    add-int/2addr v7, v4

    .line 379
    .line 380
    iput v7, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 381
    .line 382
    if-eqz v3, :cond_c

    .line 383
    .line 384
    .line 385
    :try_start_e
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 386
    .line 387
    :cond_c
    if-eqz v6, :cond_d

    .line 388
    .line 389
    .line 390
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V

    .line 391
    .line 392
    :cond_d
    if-eqz v5, :cond_0

    .line 393
    .line 394
    .line 395
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    .line 396
    .line 397
    goto/16 :goto_0

    .line 398
    :catch_7
    move-object v0, v3

    .line 399
    move-object v6, v0

    .line 400
    .line 401
    :goto_a
    iget v1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 402
    add-int/2addr v1, v4

    .line 403
    .line 404
    iput v1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Il1l;->l11l1111lIIl:I

    .line 405
    .line 406
    if-eqz v3, :cond_e

    .line 407
    .line 408
    .line 409
    :try_start_f
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 410
    .line 411
    :cond_e
    if-eqz v6, :cond_f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V

    .line 415
    .line 416
    :cond_f
    if-eqz v0, :cond_10

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_8

    .line 420
    :catch_8
    :cond_10
    :goto_b
    return-void
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
.end method
