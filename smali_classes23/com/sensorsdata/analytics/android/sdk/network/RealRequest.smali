.class Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;
.super Ljava/lang/Object;
.source "RealRequest.java"


# static fields
.field private static final CONNECT_TIMEOUT:I = 0x7530

.field private static final READ_TIMEOUT:I = 0x7530

.field private static final TAG:Ljava/lang/String; = "SA.HttpRequest"

.field private static synthetic ajc$tjp_0:Lorg/aspectj/lang/a$a;

.field private static sRequestURL:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->ajc$preClinit()V

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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method private static synthetic ajc$preClinit()V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Ldh0/b;

    .line 3
    .line 4
    const-string v1, "RealRequest.java"

    .line 5
    .line 6
    const-class v2, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Ldh0/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 10
    .line 11
    const-string v6, ""

    .line 12
    .line 13
    const-string v7, "com.sensorsdata.analytics.android.sdk.network.RealResponse"

    .line 14
    .line 15
    const-string v1, "2"

    .line 16
    .line 17
    const-string v2, "getRealResponse"

    .line 18
    .line 19
    const-string v3, "com.sensorsdata.analytics.android.sdk.network.RealRequest"

    .line 20
    .line 21
    const-string v4, "java.net.HttpURLConnection"

    .line 22
    .line 23
    const-string v5, "conn"

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {v0 .. v7}, Ldh0/b;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lch0/a;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    const/16 v2, 0xa3

    .line 30
    .line 31
    .line 32
    const-string/jumbo v3, "method-execution"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3, v1, v2}, Ldh0/b;->h(Ljava/lang/String;Lorg/aspectj/lang/c;I)Lorg/aspectj/lang/a$a;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    sput-object v0, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->ajc$tjp_0:Lorg/aspectj/lang/a$a;

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
    .line 79
    .line 80
.end method

.method private getExceptionResponse(Ljava/lang/Exception;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;-><init>()V

    .line 6
    .line 7
    iput-object p1, v0, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->exception:Ljava/lang/Exception;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->errorMsg:Ljava/lang/String;

    .line 14
    .line 15
    const-string p1, "SA.HttpRequest"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->toString()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    return-object v0
    .line 24
.end method

.method private getHttpURLConnection(Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/net/URL;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    check-cast p1, Ljava/net/URLConnection;

    .line 16
    .line 17
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 25
    .line 26
    const/16 v0, 0x7530

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 33
    .line 34
    const-string v0, "POST"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    move-result p2

    .line 39
    .line 40
    if-eqz p2, :cond_0

    .line 41
    const/4 p2, 0x1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getConfigOptions()Lcom/sensorsdata/analytics/android/sdk/SAConfigOptions;

    .line 48
    move-result-object p2

    .line 49
    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    iget-object p2, p2, Lcom/sensorsdata/analytics/android/sdk/SAConfigOptions;->mSSLSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    instance-of v0, p1, Ljavax/net/ssl/HttpsURLConnection;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    move-object v0, p1

    .line 60
    .line 61
    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p2}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 65
    :cond_1
    return-object p1
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
.end method

.method private getRealResponse(Ljava/net/HttpURLConnection;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->ajc$tjp_0:Lorg/aspectj/lang/a$a;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0, p0, p1}, Ldh0/b;->c(Lorg/aspectj/lang/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/kubi/sdk/aspect/f;->c()Lcom/kubi/sdk/aspect/f;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    filled-new-array {p0, p1, v0}, [Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    new-instance v0, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest$AjcClosure1;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p1}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest$AjcClosure1;-><init>([Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const p1, 0x11010

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lorg/aspectj/runtime/internal/a;->linkClosureAndJoinPoint(I)Lorg/aspectj/lang/b;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Lcom/kubi/sdk/aspect/f;->e(Lorg/aspectj/lang/b;)Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    check-cast p1, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;

    .line 33
    return-object p1
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

.method public static final synthetic getRealResponse_aroundBody0(Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;Ljava/net/HttpURLConnection;Lorg/aspectj/lang/a;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;
    .locals 2

    .line 1
    .line 2
    new-instance p2, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;

    .line 3
    .line 4
    .line 5
    invoke-direct {p2}, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 9
    move-result v0

    .line 10
    .line 11
    iput v0, p2, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->code:I

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/network/HttpUtils;->needRedirects(I)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->sRequestURL:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0}, Lcom/sensorsdata/analytics/android/sdk/network/HttpUtils;->getLocation(Ljava/net/HttpURLConnection;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p2, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->location:Ljava/lang/String;

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_3

    .line 29
    :catch_0
    move-exception p2

    .line 30
    goto :goto_2

    .line 31
    .line 32
    .line 33
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentLength()I

    .line 34
    move-result v0

    .line 35
    int-to-long v0, v0

    .line 36
    .line 37
    iput-wide v0, p2, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->contentLength:J

    .line 38
    .line 39
    iget v0, p2, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->code:I

    .line 40
    .line 41
    const/16 v1, 0x190

    .line 42
    .line 43
    if-ge v0, v1, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/network/HttpUtils;->getRetString(Ljava/io/InputStream;)Ljava/lang/String;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iput-object v0, p2, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->result:Ljava/lang/String;

    .line 54
    goto :goto_1

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/network/HttpUtils;->getRetString(Ljava/io/InputStream;)Ljava/lang/String;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    iput-object v0, p2, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->errorMsg:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    :goto_1
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 68
    .line 69
    const-string p0, "SA.HttpRequest"

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->toString()Ljava/lang/String;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-static {p0, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    return-object p2

    .line 78
    .line 79
    .line 80
    :goto_2
    :try_start_1
    invoke-direct {p0, p2}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->getExceptionResponse(Ljava/lang/Exception;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;

    .line 81
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 87
    :cond_2
    return-object p0

    .line 88
    .line 89
    :goto_3
    if-eqz p1, :cond_3

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 93
    :cond_3
    throw p0
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

.method private setHeader(Ljava/net/HttpURLConnection;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
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


# virtual methods
.method public getData(Ljava/lang/String;Ljava/util/Map;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;"
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    const-string v0, "SA.HttpRequest"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "url:%s,\nmethod:GET"

    .line 6
    .line 7
    .line 8
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 9
    move-result-object v2

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    sput-object p1, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->sRequestURL:Ljava/lang/String;

    .line 19
    .line 20
    const-string v0, "GET"

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1, v0}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->getHttpURLConnection(Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1, p2}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->setHeader(Ljava/net/HttpURLConnection;Ljava/util/Map;)V

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    .line 34
    .line 35
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->getRealResponse(Ljava/net/HttpURLConnection;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;

    .line 39
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    return-object p1

    .line 41
    .line 42
    .line 43
    :goto_1
    invoke-direct {p0, p1}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->getExceptionResponse(Ljava/lang/Exception;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;

    .line 44
    move-result-object p1

    .line 45
    return-object p1
.end method

.method public postData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    sput-object p1, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->sRequestURL:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "SA.HttpRequest"

    .line 6
    .line 7
    .line 8
    const-string/jumbo v2, "url:%s\nparams:%s\nmethod:POST"

    .line 9
    .line 10
    .line 11
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 12
    move-result-object v3

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    const-string v1, "POST"

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1, v1}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->getHttpURLConnection(Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 25
    move-result-object p1

    .line 26
    const/4 v1, 0x1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 30
    const/4 v1, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 34
    .line 35
    .line 36
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    move-result v1

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    const-string v1, "Content-Type"

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1, p3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_4

    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :cond_0
    :goto_0
    if-eqz p4, :cond_1

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, p1, p4}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->setHeader(Ljava/net/HttpURLConnection;Ljava/util/Map;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 58
    .line 59
    .line 60
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 61
    move-result p3

    .line 62
    .line 63
    if-nez p3, :cond_2

    .line 64
    .line 65
    new-instance p3, Ljava/io/BufferedWriter;

    .line 66
    .line 67
    new-instance p4, Ljava/io/OutputStreamWriter;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    const-string v2, "UTF-8"

    .line 74
    .line 75
    .line 76
    invoke-direct {p4, v1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p3, p4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    :try_start_1
    invoke-virtual {p3, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3}, Ljava/io/BufferedWriter;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 86
    move-object v0, p3

    .line 87
    goto :goto_1

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    move-object v0, p3

    .line 90
    goto :goto_4

    .line 91
    :catch_1
    move-exception p1

    .line 92
    move-object v0, p3

    .line 93
    goto :goto_2

    .line 94
    .line 95
    .line 96
    :cond_2
    :goto_1
    :try_start_2
    invoke-direct {p0, p1}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->getRealResponse(Ljava/net/HttpURLConnection;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;

    .line 97
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    .line 102
    :try_start_3
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 103
    return-object p1

    .line 104
    :catch_2
    move-exception p2

    .line 105
    .line 106
    .line 107
    invoke-static {p2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 108
    :cond_3
    return-object p1

    .line 109
    .line 110
    .line 111
    :goto_2
    :try_start_4
    invoke-direct {p0, p1}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->getExceptionResponse(Ljava/lang/Exception;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;

    .line 112
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 113
    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    .line 117
    :try_start_5
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 118
    goto :goto_3

    .line 119
    :catch_3
    move-exception p2

    .line 120
    .line 121
    .line 122
    invoke-static {p2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 123
    :cond_4
    :goto_3
    return-object p1

    .line 124
    .line 125
    :goto_4
    if-eqz v0, :cond_5

    .line 126
    .line 127
    .line 128
    :try_start_6
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 129
    goto :goto_5

    .line 130
    :catch_4
    move-exception p2

    .line 131
    .line 132
    .line 133
    invoke-static {p2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 134
    :cond_5
    :goto_5
    throw p1
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
