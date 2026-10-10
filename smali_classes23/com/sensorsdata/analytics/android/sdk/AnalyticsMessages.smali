.class Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;
.super Ljava/lang/Object;
.source "AnalyticsMessages.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;
    }
.end annotation


# static fields
.field private static final DELETE_ALL:I = 0x4

.field private static final FLUSH_QUEUE:I = 0x3

.field private static final FLUSH_SCHEDULE:I = 0x5

.field private static final S_INSTANCES:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/content/Context;",
            "Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "SA.AnalyticsMessages"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

.field private mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

.field private final mWorker:Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->S_INSTANCES:Ljava/util/Map;

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
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->getInstance()Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 12
    .line 13
    new-instance p1, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, p0}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;-><init>(Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;)V

    .line 17
    .line 18
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mWorker:Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;

    .line 19
    .line 20
    iput-object p2, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 21
    return-void
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

.method public static synthetic access$000(Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->sendData()V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic access$100(Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;)Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 3
    return-object p0
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
.end method

.method private closeStream(Ljava/io/BufferedOutputStream;Ljava/io/OutputStream;Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "SA.AnalyticsMessages"

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    :cond_0
    :goto_0
    if-eqz p2, :cond_1

    .line 19
    .line 20
    .line 21
    :try_start_1
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 22
    goto :goto_1

    .line 23
    :catch_1
    move-exception p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-static {v0, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    :cond_1
    :goto_1
    if-eqz p3, :cond_2

    .line 33
    .line 34
    .line 35
    :try_start_2
    invoke-virtual {p3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 36
    goto :goto_2

    .line 37
    :catch_2
    move-exception p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-static {v0, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    :cond_2
    :goto_2
    if-eqz p4, :cond_3

    .line 47
    .line 48
    .line 49
    :try_start_3
    invoke-virtual {p4}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 50
    goto :goto_3

    .line 51
    :catch_3
    move-exception p1

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-static {v0, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    :cond_3
    :goto_3
    return-void
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
.end method

.method private encodeData(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sensorsdata/analytics/android/sdk/exceptions/InvalidDataException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "UTF-8"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 9
    move-result-object v3

    .line 10
    array-length v3, v3

    .line 11
    .line 12
    .line 13
    invoke-direct {v2, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 14
    .line 15
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    .line 16
    .line 17
    .line 18
    invoke-direct {v3, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    .line 21
    :try_start_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write([B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 36
    .line 37
    new-instance v0, Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/util/Base64Coder;->encode([B)[C

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([C)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    :try_start_2
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 48
    :catch_0
    return-object v0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    move-object v1, v3

    .line 51
    goto :goto_1

    .line 52
    :catch_1
    move-exception p1

    .line 53
    move-object v1, v3

    .line 54
    goto :goto_0

    .line 55
    :catchall_1
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :catch_2
    move-exception p1

    .line 58
    .line 59
    :goto_0
    :try_start_3
    new-instance v0, Lcom/sensorsdata/analytics/android/sdk/exceptions/InvalidDataException;

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, p1}, Lcom/sensorsdata/analytics/android/sdk/exceptions/InvalidDataException;-><init>(Ljava/lang/Throwable;)V

    .line 63
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 64
    .line 65
    :goto_1
    if-eqz v1, :cond_0

    .line 66
    .line 67
    .line 68
    :try_start_4
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 69
    :catch_3
    :cond_0
    throw p1
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

.method public static getInstance(Landroid/content/Context;Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;)Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->S_INSTANCES:Ljava/util/Map;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p0, p1}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;-><init>(Landroid/content/Context;Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    move-result-object p0

    .line 29
    move-object v1, p0

    .line 30
    .line 31
    check-cast v1, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;

    .line 32
    :goto_0
    monitor-exit v0

    .line 33
    return-object v1

    .line 34
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p0
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

.method private isDeleteEventsByCode(I)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x194

    .line 3
    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/16 v0, 0x193

    .line 7
    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x1f4

    .line 11
    .line 12
    if-lt p1, v0, :cond_0

    .line 13
    .line 14
    const/16 v0, 0x258

    .line 15
    .line 16
    if-ge p1, v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
.end method

.method private sendData()V
    .locals 13

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->isNetworkRequestEnable()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "SA.AnalyticsMessages"

    .line 11
    .line 12
    const-string v1, "NetworkRequest \u5df2\u5173\u95ed\uff0c\u4e0d\u53d1\u9001\u6570\u636e\uff01"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    move-object v6, p0

    .line 19
    .line 20
    goto/16 :goto_23

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getServerUrl()Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-string v0, "SA.AnalyticsMessages"

    .line 35
    .line 36
    const-string v1, "Server url is null or empty."

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    return-void

    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mContext:Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/util/NetworkUtils;->isNetworkAvailable(Landroid/content/Context;)Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    :goto_0
    move-object v6, p0

    .line 50
    .line 51
    goto/16 :goto_22

    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mContext:Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/util/NetworkUtils;->networkType(Landroid/content/Context;)Ljava/lang/String;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getFlushNetworkPolicy()I

    .line 63
    move-result v1

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/util/NetworkUtils;->isShouldFlush(Ljava/lang/String;I)Z

    .line 67
    move-result v1

    .line 68
    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    const-string v1, "SA.AnalyticsMessages"

    .line 72
    .line 73
    .line 74
    const-string/jumbo v2, "\u60a8\u5f53\u524d\u7f51\u7edc\u4e3a %s\uff0c\u65e0\u6cd5\u53d1\u9001\u6570\u636e\uff0c\u8bf7\u786e\u8ba4\u60a8\u7684\u7f51\u7edc\u53d1\u9001\u7b56\u7565\uff01"

    .line 75
    .line 76
    .line 77
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    return-void

    .line 87
    .line 88
    .line 89
    :cond_3
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/AbstractSensorsDataAPI;->getConfigOptions()Lcom/sensorsdata/analytics/android/sdk/SAConfigOptions;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/SAConfigOptions;->isMultiProcessFlush()Z

    .line 94
    move-result v0

    .line 95
    const/4 v1, 0x1

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    .line 100
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->getInstance()Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->isSubProcessFlushing()Z

    .line 105
    move-result v0

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    goto :goto_0

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->getInstance()Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->commitSubProcessFlushState(Z)V

    .line 116
    goto :goto_1

    .line 117
    .line 118
    :cond_5
    sget-boolean v0, Lcom/sensorsdata/analytics/android/sdk/AbstractSensorsDataAPI;->mIsMainProcess:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    if-nez v0, :cond_6

    .line 121
    goto :goto_0

    .line 122
    :cond_6
    :goto_1
    const/4 v2, 0x0

    .line 123
    .line 124
    const/16 v0, 0x64

    .line 125
    move-object v3, v2

    .line 126
    :goto_2
    const/4 v4, 0x0

    .line 127
    .line 128
    if-lez v0, :cond_21

    .line 129
    .line 130
    iget-object v5, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 131
    monitor-enter v5

    .line 132
    .line 133
    :try_start_1
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->isDebugMode()Z

    .line 137
    move-result v0

    .line 138
    .line 139
    if-eqz v0, :cond_7

    .line 140
    .line 141
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 142
    .line 143
    const-string v6, "events"

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v6, v1}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->generateDataString(Ljava/lang/String;I)[Ljava/lang/String;

    .line 147
    move-result-object v0

    .line 148
    goto :goto_3

    .line 149
    :catchall_0
    move-exception v0

    .line 150
    move-object v6, p0

    .line 151
    .line 152
    goto/16 :goto_21

    .line 153
    .line 154
    :cond_7
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 155
    .line 156
    const-string v6, "events"

    .line 157
    .line 158
    const/16 v7, 0x32

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v6, v7}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->generateDataString(Ljava/lang/String;I)[Ljava/lang/String;

    .line 162
    move-result-object v0

    .line 163
    :goto_3
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    .line 165
    if-nez v0, :cond_8

    .line 166
    .line 167
    .line 168
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->getInstance()Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v4}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->commitSubProcessFlushState(Z)V

    .line 173
    return-void

    .line 174
    .line 175
    :cond_8
    aget-object v5, v0, v4

    .line 176
    .line 177
    aget-object v10, v0, v1

    .line 178
    const/4 v6, 0x2

    .line 179
    .line 180
    aget-object v9, v0, v6

    .line 181
    .line 182
    const/16 v12, 0x19

    .line 183
    .line 184
    :try_start_2
    const-string v0, "1"

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    move-result v0

    .line 189
    .line 190
    if-eqz v0, :cond_9

    .line 191
    .line 192
    .line 193
    invoke-direct {p0, v10}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->encodeData(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    move-result-object v0

    .line 195
    move-object v8, v0

    .line 196
    goto :goto_6

    .line 197
    :catchall_1
    move-exception v0

    .line 198
    move-object v6, p0

    .line 199
    :goto_4
    move v7, v1

    .line 200
    :goto_5
    move-object v1, v0

    .line 201
    .line 202
    goto/16 :goto_1d

    .line 203
    :catch_1
    move-exception v0

    .line 204
    move-object v6, p0

    .line 205
    .line 206
    goto/16 :goto_c

    .line 207
    :catch_2
    move-exception v0

    .line 208
    move-object v6, p0

    .line 209
    .line 210
    goto/16 :goto_11

    .line 211
    :catch_3
    move-exception v0

    .line 212
    move-object v6, p0

    .line 213
    .line 214
    goto/16 :goto_15

    .line 215
    :catch_4
    move-exception v0

    .line 216
    move-object v6, p0

    .line 217
    .line 218
    goto/16 :goto_19

    .line 219
    :cond_9
    move-object v8, v10

    .line 220
    .line 221
    .line 222
    :goto_6
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 223
    move-result v0

    .line 224
    .line 225
    if-nez v0, :cond_a

    .line 226
    .line 227
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getServerUrl()Ljava/lang/String;

    .line 231
    move-result-object v7
    :try_end_2
    .catch Lcom/sensorsdata/analytics/android/sdk/exceptions/ConnectErrorException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Lcom/sensorsdata/analytics/android/sdk/exceptions/InvalidDataException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/sensorsdata/analytics/android/sdk/exceptions/ResponseErrorException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 232
    const/4 v11, 0x0

    .line 233
    move-object v6, p0

    .line 234
    .line 235
    .line 236
    :try_start_3
    invoke-direct/range {v6 .. v11}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->sendHttpRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_3
    .catch Lcom/sensorsdata/analytics/android/sdk/exceptions/ConnectErrorException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Lcom/sensorsdata/analytics/android/sdk/exceptions/InvalidDataException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Lcom/sensorsdata/analytics/android/sdk/exceptions/ResponseErrorException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 237
    goto :goto_7

    .line 238
    :catchall_2
    move-exception v0

    .line 239
    goto :goto_4

    .line 240
    :catch_5
    move-exception v0

    .line 241
    goto :goto_c

    .line 242
    :catch_6
    move-exception v0

    .line 243
    .line 244
    goto/16 :goto_11

    .line 245
    :catch_7
    move-exception v0

    .line 246
    .line 247
    goto/16 :goto_15

    .line 248
    :catch_8
    move-exception v0

    .line 249
    .line 250
    goto/16 :goto_19

    .line 251
    :cond_a
    move-object v6, p0

    .line 252
    .line 253
    :goto_7
    iget-object v0, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->isDebugMode()Z

    .line 257
    move-result v0

    .line 258
    .line 259
    .line 260
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 261
    move-result v7

    .line 262
    .line 263
    if-nez v7, :cond_d

    .line 264
    .line 265
    if-nez v0, :cond_b

    .line 266
    .line 267
    .line 268
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SALog;->isLogEnabled()Z

    .line 269
    move-result v7

    .line 270
    .line 271
    if-eqz v7, :cond_d

    .line 272
    .line 273
    :cond_b
    const-string v7, "SA.AnalyticsMessages"

    .line 274
    .line 275
    .line 276
    invoke-static {v7, v2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    if-eqz v0, :cond_d

    .line 279
    .line 280
    sget-boolean v0, Lcom/sensorsdata/analytics/android/sdk/AbstractSensorsDataAPI;->SHOW_DEBUG_INFO_VIEW:Z

    .line 281
    .line 282
    if-eqz v0, :cond_d

    .line 283
    .line 284
    :try_start_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 285
    .line 286
    if-eq v0, v12, :cond_d

    .line 287
    .line 288
    if-eqz v3, :cond_c

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3}, Landroid/widget/Toast;->cancel()V

    .line 292
    goto :goto_8

    .line 293
    :catch_9
    move-exception v0

    .line 294
    goto :goto_9

    .line 295
    .line 296
    :cond_c
    :goto_8
    iget-object v0, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mContext:Landroid/content/Context;

    .line 297
    .line 298
    .line 299
    invoke-static {v0, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 300
    move-result-object v3

    .line 301
    .line 302
    .line 303
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_9

    .line 304
    goto :goto_a

    .line 305
    .line 306
    .line 307
    :goto_9
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 308
    .line 309
    :cond_d
    :goto_a
    iget-object v0, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v5}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->cleanupEvents(Ljava/lang/String;)I

    .line 313
    move-result v0

    .line 314
    .line 315
    const-string v4, "SA.AnalyticsMessages"

    .line 316
    .line 317
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 318
    .line 319
    const-string v7, "Events flushed. [left = %d]"

    .line 320
    .line 321
    .line 322
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    move-result-object v8

    .line 324
    .line 325
    .line 326
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 327
    move-result-object v8

    .line 328
    .line 329
    .line 330
    invoke-static {v5, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 331
    move-result-object v5

    .line 332
    .line 333
    .line 334
    :goto_b
    invoke-static {v4, v5}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    goto/16 :goto_2

    .line 337
    .line 338
    :goto_c
    :try_start_5
    new-instance v7, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 342
    .line 343
    const-string v8, "Exception: "

    .line 344
    .line 345
    .line 346
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 350
    move-result-object v0

    .line 351
    .line 352
    .line 353
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 357
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 358
    .line 359
    iget-object v7, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v7}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->isDebugMode()Z

    .line 363
    move-result v7

    .line 364
    .line 365
    .line 366
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 367
    move-result v8

    .line 368
    .line 369
    if-nez v8, :cond_10

    .line 370
    .line 371
    if-nez v7, :cond_e

    .line 372
    .line 373
    .line 374
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SALog;->isLogEnabled()Z

    .line 375
    move-result v8

    .line 376
    .line 377
    if-eqz v8, :cond_10

    .line 378
    .line 379
    :cond_e
    const-string v8, "SA.AnalyticsMessages"

    .line 380
    .line 381
    .line 382
    invoke-static {v8, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    .line 384
    if-eqz v7, :cond_10

    .line 385
    .line 386
    sget-boolean v8, Lcom/sensorsdata/analytics/android/sdk/AbstractSensorsDataAPI;->SHOW_DEBUG_INFO_VIEW:Z

    .line 387
    .line 388
    if-eqz v8, :cond_10

    .line 389
    .line 390
    :try_start_6
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 391
    .line 392
    if-eq v8, v12, :cond_10

    .line 393
    .line 394
    if-eqz v3, :cond_f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v3}, Landroid/widget/Toast;->cancel()V

    .line 398
    goto :goto_d

    .line 399
    :catch_a
    move-exception v0

    .line 400
    goto :goto_e

    .line 401
    .line 402
    :cond_f
    :goto_d
    iget-object v8, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mContext:Landroid/content/Context;

    .line 403
    .line 404
    .line 405
    invoke-static {v8, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 406
    move-result-object v3

    .line 407
    .line 408
    .line 409
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_a

    .line 410
    goto :goto_f

    .line 411
    .line 412
    .line 413
    :goto_e
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 414
    .line 415
    :cond_10
    :goto_f
    if-eqz v7, :cond_11

    .line 416
    .line 417
    iget-object v0, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0, v5}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->cleanupEvents(Ljava/lang/String;)I

    .line 421
    move-result v4

    .line 422
    .line 423
    const-string v0, "SA.AnalyticsMessages"

    .line 424
    .line 425
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 426
    .line 427
    const-string v7, "Events flushed. [left = %d]"

    .line 428
    .line 429
    .line 430
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    move-result-object v8

    .line 432
    .line 433
    .line 434
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 435
    move-result-object v8

    .line 436
    .line 437
    .line 438
    invoke-static {v5, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 439
    move-result-object v5

    .line 440
    .line 441
    .line 442
    :goto_10
    invoke-static {v0, v5}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    :cond_11
    move v0, v4

    .line 444
    .line 445
    goto/16 :goto_2

    .line 446
    :catchall_3
    move-exception v0

    .line 447
    move-object v1, v0

    .line 448
    move v7, v4

    .line 449
    .line 450
    goto/16 :goto_1d

    .line 451
    .line 452
    .line 453
    :goto_11
    :try_start_7
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/exceptions/ResponseErrorException;->getHttpCode()I

    .line 454
    move-result v7

    .line 455
    .line 456
    .line 457
    invoke-direct {p0, v7}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->isDeleteEventsByCode(I)Z

    .line 458
    move-result v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 459
    .line 460
    :try_start_8
    new-instance v8, Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 464
    .line 465
    const-string v9, "ResponseErrorException: "

    .line 466
    .line 467
    .line 468
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 472
    move-result-object v0

    .line 473
    .line 474
    .line 475
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 479
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 480
    .line 481
    iget-object v8, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v8}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->isDebugMode()Z

    .line 485
    move-result v8

    .line 486
    .line 487
    .line 488
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 489
    move-result v9

    .line 490
    .line 491
    if-nez v9, :cond_14

    .line 492
    .line 493
    if-nez v8, :cond_12

    .line 494
    .line 495
    .line 496
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SALog;->isLogEnabled()Z

    .line 497
    move-result v9

    .line 498
    .line 499
    if-eqz v9, :cond_14

    .line 500
    .line 501
    :cond_12
    const-string v9, "SA.AnalyticsMessages"

    .line 502
    .line 503
    .line 504
    invoke-static {v9, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    .line 506
    if-eqz v8, :cond_14

    .line 507
    .line 508
    sget-boolean v9, Lcom/sensorsdata/analytics/android/sdk/AbstractSensorsDataAPI;->SHOW_DEBUG_INFO_VIEW:Z

    .line 509
    .line 510
    if-eqz v9, :cond_14

    .line 511
    .line 512
    :try_start_9
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 513
    .line 514
    if-eq v9, v12, :cond_14

    .line 515
    .line 516
    if-eqz v3, :cond_13

    .line 517
    .line 518
    .line 519
    invoke-virtual {v3}, Landroid/widget/Toast;->cancel()V

    .line 520
    goto :goto_12

    .line 521
    :catch_b
    move-exception v0

    .line 522
    goto :goto_13

    .line 523
    .line 524
    :cond_13
    :goto_12
    iget-object v9, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mContext:Landroid/content/Context;

    .line 525
    .line 526
    .line 527
    invoke-static {v9, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 528
    move-result-object v3

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_b

    .line 532
    goto :goto_14

    .line 533
    .line 534
    .line 535
    :goto_13
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 536
    .line 537
    :cond_14
    :goto_14
    if-nez v7, :cond_15

    .line 538
    .line 539
    if-eqz v8, :cond_11

    .line 540
    .line 541
    :cond_15
    iget-object v0, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v0, v5}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->cleanupEvents(Ljava/lang/String;)I

    .line 545
    move-result v4

    .line 546
    .line 547
    const-string v0, "SA.AnalyticsMessages"

    .line 548
    .line 549
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 550
    .line 551
    const-string v7, "Events flushed. [left = %d]"

    .line 552
    .line 553
    .line 554
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 555
    move-result-object v8

    .line 556
    .line 557
    .line 558
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 559
    move-result-object v8

    .line 560
    .line 561
    .line 562
    invoke-static {v5, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 563
    move-result-object v5

    .line 564
    goto :goto_10

    .line 565
    :catchall_4
    move-exception v0

    .line 566
    .line 567
    goto/16 :goto_5

    .line 568
    .line 569
    :goto_15
    :try_start_a
    new-instance v7, Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 573
    .line 574
    const-string v8, "Invalid data: "

    .line 575
    .line 576
    .line 577
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 581
    move-result-object v0

    .line 582
    .line 583
    .line 584
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 588
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 589
    .line 590
    iget-object v7, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v7}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->isDebugMode()Z

    .line 594
    move-result v7

    .line 595
    .line 596
    .line 597
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 598
    move-result v8

    .line 599
    .line 600
    if-nez v8, :cond_18

    .line 601
    .line 602
    if-nez v7, :cond_16

    .line 603
    .line 604
    .line 605
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SALog;->isLogEnabled()Z

    .line 606
    move-result v8

    .line 607
    .line 608
    if-eqz v8, :cond_18

    .line 609
    .line 610
    :cond_16
    const-string v8, "SA.AnalyticsMessages"

    .line 611
    .line 612
    .line 613
    invoke-static {v8, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 614
    .line 615
    if-eqz v7, :cond_18

    .line 616
    .line 617
    sget-boolean v7, Lcom/sensorsdata/analytics/android/sdk/AbstractSensorsDataAPI;->SHOW_DEBUG_INFO_VIEW:Z

    .line 618
    .line 619
    if-eqz v7, :cond_18

    .line 620
    .line 621
    :try_start_b
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 622
    .line 623
    if-eq v7, v12, :cond_18

    .line 624
    .line 625
    if-eqz v3, :cond_17

    .line 626
    .line 627
    .line 628
    invoke-virtual {v3}, Landroid/widget/Toast;->cancel()V

    .line 629
    goto :goto_16

    .line 630
    :catch_c
    move-exception v0

    .line 631
    goto :goto_17

    .line 632
    .line 633
    :cond_17
    :goto_16
    iget-object v7, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mContext:Landroid/content/Context;

    .line 634
    .line 635
    .line 636
    invoke-static {v7, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 637
    move-result-object v3

    .line 638
    .line 639
    .line 640
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_c

    .line 641
    goto :goto_18

    .line 642
    .line 643
    .line 644
    :goto_17
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 645
    .line 646
    :cond_18
    :goto_18
    iget-object v0, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v0, v5}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->cleanupEvents(Ljava/lang/String;)I

    .line 650
    move-result v0

    .line 651
    .line 652
    const-string v4, "SA.AnalyticsMessages"

    .line 653
    .line 654
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 655
    .line 656
    const-string v7, "Events flushed. [left = %d]"

    .line 657
    .line 658
    .line 659
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 660
    move-result-object v8

    .line 661
    .line 662
    .line 663
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 664
    move-result-object v8

    .line 665
    .line 666
    .line 667
    invoke-static {v5, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 668
    move-result-object v5

    .line 669
    .line 670
    goto/16 :goto_b

    .line 671
    .line 672
    :goto_19
    :try_start_c
    new-instance v7, Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 676
    .line 677
    const-string v8, "Connection error: "

    .line 678
    .line 679
    .line 680
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 684
    move-result-object v0

    .line 685
    .line 686
    .line 687
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 691
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 692
    .line 693
    iget-object v7, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v7}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->isDebugMode()Z

    .line 697
    move-result v7

    .line 698
    .line 699
    .line 700
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 701
    move-result v8

    .line 702
    .line 703
    if-nez v8, :cond_1b

    .line 704
    .line 705
    if-nez v7, :cond_19

    .line 706
    .line 707
    .line 708
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SALog;->isLogEnabled()Z

    .line 709
    move-result v8

    .line 710
    .line 711
    if-eqz v8, :cond_1b

    .line 712
    .line 713
    :cond_19
    const-string v8, "SA.AnalyticsMessages"

    .line 714
    .line 715
    .line 716
    invoke-static {v8, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 717
    .line 718
    if-eqz v7, :cond_1b

    .line 719
    .line 720
    sget-boolean v8, Lcom/sensorsdata/analytics/android/sdk/AbstractSensorsDataAPI;->SHOW_DEBUG_INFO_VIEW:Z

    .line 721
    .line 722
    if-eqz v8, :cond_1b

    .line 723
    .line 724
    :try_start_d
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 725
    .line 726
    if-eq v8, v12, :cond_1b

    .line 727
    .line 728
    if-eqz v3, :cond_1a

    .line 729
    .line 730
    .line 731
    invoke-virtual {v3}, Landroid/widget/Toast;->cancel()V

    .line 732
    goto :goto_1a

    .line 733
    :catch_d
    move-exception v0

    .line 734
    goto :goto_1b

    .line 735
    .line 736
    :cond_1a
    :goto_1a
    iget-object v8, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mContext:Landroid/content/Context;

    .line 737
    .line 738
    .line 739
    invoke-static {v8, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 740
    move-result-object v3

    .line 741
    .line 742
    .line 743
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    .line 744
    goto :goto_1c

    .line 745
    .line 746
    .line 747
    :goto_1b
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 748
    .line 749
    :cond_1b
    :goto_1c
    if-eqz v7, :cond_11

    .line 750
    .line 751
    iget-object v0, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v0, v5}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->cleanupEvents(Ljava/lang/String;)I

    .line 755
    move-result v4

    .line 756
    .line 757
    const-string v0, "SA.AnalyticsMessages"

    .line 758
    .line 759
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 760
    .line 761
    const-string v7, "Events flushed. [left = %d]"

    .line 762
    .line 763
    .line 764
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 765
    move-result-object v8

    .line 766
    .line 767
    .line 768
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 769
    move-result-object v8

    .line 770
    .line 771
    .line 772
    invoke-static {v5, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 773
    move-result-object v5

    .line 774
    .line 775
    goto/16 :goto_10

    .line 776
    .line 777
    :goto_1d
    iget-object v0, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->isDebugMode()Z

    .line 781
    move-result v8

    .line 782
    .line 783
    .line 784
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 785
    move-result v0

    .line 786
    .line 787
    if-nez v0, :cond_1e

    .line 788
    .line 789
    if-nez v8, :cond_1c

    .line 790
    .line 791
    .line 792
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SALog;->isLogEnabled()Z

    .line 793
    move-result v0

    .line 794
    .line 795
    if-eqz v0, :cond_1e

    .line 796
    .line 797
    :cond_1c
    const-string v0, "SA.AnalyticsMessages"

    .line 798
    .line 799
    .line 800
    invoke-static {v0, v2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 801
    .line 802
    if-eqz v8, :cond_1e

    .line 803
    .line 804
    sget-boolean v0, Lcom/sensorsdata/analytics/android/sdk/AbstractSensorsDataAPI;->SHOW_DEBUG_INFO_VIEW:Z

    .line 805
    .line 806
    if-eqz v0, :cond_1e

    .line 807
    .line 808
    :try_start_e
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 809
    .line 810
    if-eq v0, v12, :cond_1e

    .line 811
    .line 812
    if-eqz v3, :cond_1d

    .line 813
    .line 814
    .line 815
    invoke-virtual {v3}, Landroid/widget/Toast;->cancel()V

    .line 816
    goto :goto_1e

    .line 817
    :catch_e
    move-exception v0

    .line 818
    goto :goto_1f

    .line 819
    .line 820
    :cond_1d
    :goto_1e
    iget-object v0, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mContext:Landroid/content/Context;

    .line 821
    .line 822
    .line 823
    invoke-static {v0, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 824
    move-result-object v0

    .line 825
    .line 826
    .line 827
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    .line 828
    goto :goto_20

    .line 829
    .line 830
    .line 831
    :goto_1f
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 832
    .line 833
    :cond_1e
    :goto_20
    if-nez v7, :cond_1f

    .line 834
    .line 835
    if-eqz v8, :cond_20

    .line 836
    .line 837
    :cond_1f
    iget-object v0, v6, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v0, v5}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->cleanupEvents(Ljava/lang/String;)I

    .line 841
    move-result v0

    .line 842
    .line 843
    const-string v2, "SA.AnalyticsMessages"

    .line 844
    .line 845
    sget-object v3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 846
    .line 847
    const-string v4, "Events flushed. [left = %d]"

    .line 848
    .line 849
    .line 850
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 851
    move-result-object v0

    .line 852
    .line 853
    .line 854
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 855
    move-result-object v0

    .line 856
    .line 857
    .line 858
    invoke-static {v3, v4, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 859
    move-result-object v0

    .line 860
    .line 861
    .line 862
    invoke-static {v2, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 863
    :cond_20
    throw v1

    .line 864
    :goto_21
    :try_start_f
    monitor-exit v5
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 865
    throw v0

    .line 866
    :catchall_5
    move-exception v0

    .line 867
    goto :goto_21

    .line 868
    :cond_21
    move-object v6, p0

    .line 869
    .line 870
    .line 871
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/AbstractSensorsDataAPI;->getConfigOptions()Lcom/sensorsdata/analytics/android/sdk/SAConfigOptions;

    .line 872
    move-result-object v0

    .line 873
    .line 874
    .line 875
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/SAConfigOptions;->isMultiProcessFlush()Z

    .line 876
    move-result v0

    .line 877
    .line 878
    if-eqz v0, :cond_22

    .line 879
    .line 880
    .line 881
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->getInstance()Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 882
    move-result-object v0

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0, v4}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->commitSubProcessFlushState(Z)V

    .line 886
    :cond_22
    :goto_22
    return-void

    .line 887
    .line 888
    .line 889
    :goto_23
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 890
    return-void
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
.end method

.method private sendHttpRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sensorsdata/analytics/android/sdk/exceptions/ConnectErrorException;,
            Lcom/sensorsdata/analytics/android/sdk/exceptions/ResponseErrorException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "UTF-8"

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
    move-result-object v3

    .line 13
    .line 14
    .line 15
    invoke-static {v3}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    check-cast v3, Ljava/net/URLConnection;

    .line 19
    .line 20
    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 21
    .line 22
    const-string v4, "SA.AnalyticsMessages"

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    :try_start_1
    const-string p1, "can not connect %s, it shouldn\'t happen"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 30
    move-result-object p2

    .line 31
    .line 32
    .line 33
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-static {v4, p1, v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, v1, v1, v1, v3}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->closeStream(Ljava/io/BufferedOutputStream;Ljava/io/OutputStream;Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p1, v0

    .line 48
    move-object p2, v1

    .line 49
    move-object v5, p2

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    :catch_0
    move-exception v0

    .line 53
    move-object p1, v0

    .line 54
    move-object p2, v1

    .line 55
    move-object v5, p2

    .line 56
    move-object v12, v5

    .line 57
    :goto_0
    move-object v1, v3

    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_0
    :try_start_2
    sget v2, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->VTRACK_SUPPORTED_MIN_API:I

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/AbstractSensorsDataAPI;->getConfigOptions()Lcom/sensorsdata/analytics/android/sdk/SAConfigOptions;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-object v2, v2, Lcom/sensorsdata/analytics/android/sdk/AbstractSAConfigOptions;->mSSLSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 70
    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    instance-of v5, v3, Ljavax/net/ssl/HttpsURLConnection;

    .line 74
    .line 75
    if-eqz v5, :cond_1

    .line 76
    move-object v5, v3

    .line 77
    .line 78
    check-cast v5, Ljavax/net/ssl/HttpsURLConnection;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v2}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 82
    :cond_1
    const/4 v2, 0x0

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 86
    .line 87
    iget-object v5, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getDebugMode()Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI$DebugMode;

    .line 91
    move-result-object v5

    .line 92
    .line 93
    sget-object v6, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI$DebugMode;->DEBUG_ONLY:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI$DebugMode;

    .line 94
    .line 95
    if-ne v5, v6, :cond_2

    .line 96
    .line 97
    const-string v5, "Dry-Run"

    .line 98
    .line 99
    .line 100
    const-string/jumbo v6, "true"

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v5, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    :cond_2
    iget-object v5, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v2}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getCookie(Z)Ljava/lang/String;

    .line 109
    move-result-object v2

    .line 110
    .line 111
    .line 112
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 113
    move-result v5

    .line 114
    .line 115
    if-nez v5, :cond_3

    .line 116
    .line 117
    const-string v5, "Cookie"

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v5, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    :cond_3
    new-instance v2, Landroid/net/Uri$Builder;

    .line 123
    .line 124
    .line 125
    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 129
    move-result v5

    .line 130
    .line 131
    if-nez v5, :cond_4

    .line 132
    .line 133
    const-string v5, "crc"

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 137
    move-result v6

    .line 138
    .line 139
    .line 140
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 141
    move-result-object v6

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v5, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 145
    .line 146
    :cond_4
    const-string v5, "gzip"

    .line 147
    .line 148
    move-object/from16 v9, p3

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v5, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 152
    .line 153
    const-string v5, "data_list"

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v5, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 160
    move-result-object v2

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    .line 164
    move-result-object v2

    .line 165
    .line 166
    .line 167
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 168
    move-result v5
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 169
    .line 170
    if-eqz v5, :cond_5

    .line 171
    .line 172
    .line 173
    invoke-direct {p0, v1, v1, v1, v3}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->closeStream(Ljava/io/BufferedOutputStream;Ljava/io/OutputStream;Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V

    .line 174
    return-void

    .line 175
    .line 176
    .line 177
    :cond_5
    :try_start_3
    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 178
    move-result-object v5

    .line 179
    array-length v5, v5

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3, v5}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 183
    const/4 v5, 0x1

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3, v5}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 187
    .line 188
    const-string v5, "POST"

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v5}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 192
    .line 193
    const/16 v5, 0x7530

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3, v5}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, v5}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 203
    move-result-object v5
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 204
    .line 205
    :try_start_4
    new-instance v12, Ljava/io/BufferedOutputStream;

    .line 206
    .line 207
    .line 208
    invoke-direct {v12, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 209
    .line 210
    .line 211
    :try_start_5
    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 212
    move-result-object v2

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v2}, Ljava/io/OutputStream;->write([B)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12}, Ljava/io/BufferedOutputStream;->flush()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 222
    move-result v2

    .line 223
    .line 224
    new-instance v6, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    const-string/jumbo v7, "responseCode: "

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    move-result-object v6

    .line 241
    .line 242
    .line 243
    invoke-static {v4, v6}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    .line 245
    if-nez p5, :cond_6

    .line 246
    .line 247
    .line 248
    invoke-static {v2}, Lcom/sensorsdata/analytics/android/sdk/util/NetworkUtils;->needRedirects(I)Z

    .line 249
    move-result v6

    .line 250
    .line 251
    if-eqz v6, :cond_6

    .line 252
    .line 253
    .line 254
    invoke-static {v3, p1}, Lcom/sensorsdata/analytics/android/sdk/util/NetworkUtils;->getLocation(Ljava/net/HttpURLConnection;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    move-result-object v7

    .line 256
    .line 257
    .line 258
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 259
    move-result p1

    .line 260
    .line 261
    if-nez p1, :cond_6

    .line 262
    .line 263
    .line 264
    invoke-direct {p0, v12, v5, v1, v3}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->closeStream(Ljava/io/BufferedOutputStream;Ljava/io/OutputStream;Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V

    .line 265
    const/4 v11, 0x1

    .line 266
    move-object v6, p0

    .line 267
    move-object v8, p2

    .line 268
    .line 269
    move-object/from16 v10, p4

    .line 270
    .line 271
    .line 272
    invoke-direct/range {v6 .. v11}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->sendHttpRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 273
    .line 274
    .line 275
    invoke-direct {p0, v12, v5, v1, v3}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->closeStream(Ljava/io/BufferedOutputStream;Ljava/io/OutputStream;Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V

    .line 276
    return-void

    .line 277
    :catchall_1
    move-exception v0

    .line 278
    move-object p1, v0

    .line 279
    move-object p2, v1

    .line 280
    :goto_1
    move-object v1, v12

    .line 281
    .line 282
    goto/16 :goto_5

    .line 283
    :catch_1
    move-exception v0

    .line 284
    move-object p1, v0

    .line 285
    move-object p2, v1

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    .line 290
    :cond_6
    :try_start_6
    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 291
    move-result-object p1
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 292
    goto :goto_2

    .line 293
    .line 294
    .line 295
    :catch_2
    :try_start_7
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 296
    move-result-object p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 297
    .line 298
    .line 299
    :goto_2
    :try_start_8
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->slurp(Ljava/io/InputStream;)[B

    .line 300
    move-result-object p2

    .line 301
    .line 302
    .line 303
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 304
    .line 305
    :try_start_9
    new-instance p1, Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    invoke-direct {p1, p2, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SALog;->isLogEnabled()Z

    .line 312
    move-result p2

    .line 313
    .line 314
    const/16 v0, 0x12c

    .line 315
    .line 316
    const/16 v7, 0xc8

    .line 317
    .line 318
    if-eqz p2, :cond_8

    .line 319
    .line 320
    .line 321
    invoke-static/range {p4 .. p4}, Lcom/sensorsdata/analytics/android/sdk/util/JSONUtils;->formatJson(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    move-result-object p2

    .line 323
    .line 324
    if-lt v2, v7, :cond_7

    .line 325
    .line 326
    if-ge v2, v0, :cond_7

    .line 327
    .line 328
    new-instance v8, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 332
    .line 333
    .line 334
    const-string/jumbo v9, "valid message: \n"

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    move-result-object p2

    .line 345
    .line 346
    .line 347
    invoke-static {v4, p2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    goto :goto_3

    .line 349
    .line 350
    :cond_7
    new-instance v8, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 354
    .line 355
    const-string v9, "invalid message: \n"

    .line 356
    .line 357
    .line 358
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 365
    move-result-object p2

    .line 366
    .line 367
    .line 368
    invoke-static {v4, p2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    .line 370
    sget-object p2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 371
    .line 372
    .line 373
    const-string/jumbo v8, "ret_code: %d"

    .line 374
    .line 375
    .line 376
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    move-result-object v9

    .line 378
    .line 379
    .line 380
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 381
    move-result-object v9

    .line 382
    .line 383
    .line 384
    invoke-static {p2, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 385
    move-result-object v8

    .line 386
    .line 387
    .line 388
    invoke-static {v4, v8}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    const-string/jumbo v8, "ret_content: %s"

    .line 392
    .line 393
    .line 394
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 395
    move-result-object v9

    .line 396
    .line 397
    .line 398
    invoke-static {p2, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 399
    move-result-object p2

    .line 400
    .line 401
    .line 402
    invoke-static {v4, p2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 403
    .line 404
    :cond_8
    :goto_3
    if-lt v2, v7, :cond_9

    .line 405
    .line 406
    if-ge v2, v0, :cond_9

    .line 407
    .line 408
    .line 409
    invoke-direct {p0, v12, v5, v1, v3}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->closeStream(Ljava/io/BufferedOutputStream;Ljava/io/OutputStream;Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V

    .line 410
    return-void

    .line 411
    .line 412
    :cond_9
    :try_start_a
    new-instance p2, Lcom/sensorsdata/analytics/android/sdk/exceptions/ResponseErrorException;

    .line 413
    .line 414
    const-string v0, "flush failure with response \'%s\', the response code is \'%d\'"

    .line 415
    .line 416
    .line 417
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 418
    move-result-object v4

    .line 419
    .line 420
    .line 421
    filled-new-array {p1, v4}, [Ljava/lang/Object;

    .line 422
    move-result-object p1

    .line 423
    .line 424
    .line 425
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 426
    move-result-object p1

    .line 427
    .line 428
    .line 429
    invoke-direct {p2, p1, v2}, Lcom/sensorsdata/analytics/android/sdk/exceptions/ResponseErrorException;-><init>(Ljava/lang/String;I)V

    .line 430
    throw p2
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 431
    :catchall_2
    move-exception v0

    .line 432
    move-object p2, v0

    .line 433
    move-object v1, p2

    .line 434
    move-object p2, p1

    .line 435
    move-object p1, v1

    .line 436
    .line 437
    goto/16 :goto_1

    .line 438
    :catch_3
    move-exception v0

    .line 439
    move-object p2, v0

    .line 440
    move-object v1, p2

    .line 441
    move-object p2, p1

    .line 442
    move-object p1, v1

    .line 443
    .line 444
    goto/16 :goto_0

    .line 445
    :catchall_3
    move-exception v0

    .line 446
    move-object p1, v0

    .line 447
    move-object p2, v1

    .line 448
    goto :goto_5

    .line 449
    :catch_4
    move-exception v0

    .line 450
    move-object p1, v0

    .line 451
    move-object p2, v1

    .line 452
    move-object v12, p2

    .line 453
    .line 454
    goto/16 :goto_0

    .line 455
    :catchall_4
    move-exception v0

    .line 456
    move-object p1, v0

    .line 457
    move-object p2, v1

    .line 458
    move-object v3, p2

    .line 459
    move-object v5, v3

    .line 460
    goto :goto_5

    .line 461
    :catch_5
    move-exception v0

    .line 462
    move-object p1, v0

    .line 463
    move-object p2, v1

    .line 464
    move-object v5, p2

    .line 465
    move-object v12, v5

    .line 466
    .line 467
    :goto_4
    :try_start_b
    new-instance v0, Lcom/sensorsdata/analytics/android/sdk/exceptions/ConnectErrorException;

    .line 468
    .line 469
    .line 470
    invoke-direct {v0, p1}, Lcom/sensorsdata/analytics/android/sdk/exceptions/ConnectErrorException;-><init>(Ljava/lang/Throwable;)V

    .line 471
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 472
    :catchall_5
    move-exception v0

    .line 473
    move-object p1, v0

    .line 474
    move-object v3, v1

    .line 475
    .line 476
    goto/16 :goto_1

    .line 477
    .line 478
    .line 479
    :goto_5
    invoke-direct {p0, v1, v5, p2, v3}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->closeStream(Ljava/io/BufferedOutputStream;Ljava/io/OutputStream;Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V

    .line 480
    throw p1
.end method

.method private static slurp(Ljava/io/InputStream;)[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 6
    .line 7
    const/16 v1, 0x2000

    .line 8
    .line 9
    new-array v2, v1, [B

    .line 10
    :goto_0
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v2, v3, v1}, Ljava/io/InputStream;->read([BII)I

    .line 14
    move-result v4

    .line 15
    const/4 v5, -0x1

    .line 16
    .line 17
    if-eq v4, v5, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 28
    move-result-object p0

    .line 29
    return-object p0
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
.end method


# virtual methods
.method public deleteAll()V
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x4

    .line 6
    .line 7
    iput v1, v0, Landroid/os/Message;->what:I

    .line 8
    .line 9
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mWorker:Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;->runMessage(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-void

    .line 14
    :catch_0
    move-exception v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 18
    return-void
    .line 19
    .line 20
.end method

.method public enqueueEventMessage(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 3
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    :try_start_1
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mDbAdapter:Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p2}, Lcom/sensorsdata/analytics/android/sdk/data/adapter/DbAdapter;->addJSON(Lorg/json/JSONObject;)I

    .line 9
    move-result v1

    .line 10
    .line 11
    if-gez v1, :cond_1

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    const-string v3, "Failed to enqueue the event: "

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->isDebugMode()Z

    .line 34
    move-result v2

    .line 35
    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    const-string v2, "SA.AnalyticsMessages"

    .line 39
    .line 40
    .line 41
    invoke-static {v2, p2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_4

    .line 45
    .line 46
    :cond_0
    new-instance p1, Lcom/sensorsdata/analytics/android/sdk/exceptions/DebugModeException;

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, p2}, Lcom/sensorsdata/analytics/android/sdk/exceptions/DebugModeException;-><init>(Ljava/lang/String;)V

    .line 50
    throw p1

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 54
    move-result-object p2

    .line 55
    const/4 v2, 0x3

    .line 56
    .line 57
    iput v2, p2, Landroid/os/Message;->what:I

    .line 58
    .line 59
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->isDebugMode()Z

    .line 63
    move-result v2

    .line 64
    .line 65
    if-nez v2, :cond_5

    .line 66
    const/4 v2, -0x2

    .line 67
    .line 68
    if-ne v1, v2, :cond_2

    .line 69
    goto :goto_2

    .line 70
    .line 71
    .line 72
    :cond_2
    const-string/jumbo v2, "track_signup"

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    move-result p1

    .line 77
    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getFlushBulkSize()I

    .line 84
    move-result p1

    .line 85
    .line 86
    if-le v1, p1, :cond_3

    .line 87
    goto :goto_1

    .line 88
    .line 89
    :cond_3
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getFlushInterval()I

    .line 93
    move-result p1

    .line 94
    .line 95
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mWorker:Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;

    .line 96
    int-to-long v2, p1

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, p2, v2, v3}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;->runMessageOnce(Landroid/os/Message;J)V

    .line 100
    goto :goto_3

    .line 101
    .line 102
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mWorker:Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p2}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;->runMessage(Landroid/os/Message;)V

    .line 106
    goto :goto_3

    .line 107
    .line 108
    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mWorker:Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;->runMessage(Landroid/os/Message;)V

    .line 112
    :goto_3
    monitor-exit v0

    .line 113
    return-void

    .line 114
    :goto_4
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 116
    :catch_0
    move-exception p1

    .line 117
    .line 118
    const-string p2, "SA.AnalyticsMessages"

    .line 119
    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    const-string v1, "enqueueEventMessage error:"

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    .line 138
    invoke-static {p2, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    return-void
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

.method public flush()V
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x3

    .line 6
    .line 7
    iput v1, v0, Landroid/os/Message;->what:I

    .line 8
    .line 9
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mWorker:Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;->runMessage(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-void

    .line 14
    :catch_0
    move-exception v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 18
    return-void
    .line 19
    .line 20
.end method

.method public flushScheduled()V
    .locals 4

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x5

    .line 6
    .line 7
    iput v1, v0, Landroid/os/Message;->what:I

    .line 8
    .line 9
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mWorker:Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages;->mSensorsDataAPI:Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getFlushInterval()I

    .line 15
    move-result v2

    .line 16
    int-to-long v2, v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0, v2, v3}, Lcom/sensorsdata/analytics/android/sdk/AnalyticsMessages$Worker;->runMessageOnce(Landroid/os/Message;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return-void

    .line 21
    :catch_0
    move-exception v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 25
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method
