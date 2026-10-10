.class Lcom/tencent/imsdk/common/HttpClient$1;
.super Ljava/lang/Object;
.source "HttpClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/common/HttpClient;->httpRequest(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;[BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ZLcom/tencent/imsdk/common/HttpClient$HttpRequestListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$connectTimeout:I

.field final synthetic val$content:[B

.field final synthetic val$downloadFile:Ljava/lang/String;

.field final synthetic val$headers:Ljava/util/Map;

.field final synthetic val$isStatisticsEnabled:Z

.field final synthetic val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

.field final synthetic val$method:Ljava/lang/String;

.field final synthetic val$proxyHost:Ljava/lang/String;

.field final synthetic val$proxyPassword:Ljava/lang/String;

.field final synthetic val$proxyPort:I

.field final synthetic val$proxyType:I

.field final synthetic val$proxyUserName:Ljava/lang/String;

.field final synthetic val$recvTimeout:I

.field final synthetic val$rollbackHttps2Http:Ljava/lang/String;

.field final synthetic val$uploadFile:Ljava/lang/String;

.field final synthetic val$url:Ljava/lang/String;

.field final synthetic val$useOriginIp:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;Z[BLjava/lang/String;Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$url:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$rollbackHttps2Http:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p3, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$isStatisticsEnabled:Z

    .line 7
    .line 8
    iput p4, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyType:I

    .line 9
    .line 10
    iput-object p5, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyHost:Ljava/lang/String;

    .line 11
    .line 12
    iput p6, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyPort:I

    .line 13
    .line 14
    iput-object p7, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyUserName:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p8, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyPassword:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p9, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$method:Ljava/lang/String;

    .line 19
    .line 20
    iput p10, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$connectTimeout:I

    .line 21
    .line 22
    iput p11, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$recvTimeout:I

    .line 23
    .line 24
    iput-object p12, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$headers:Ljava/util/Map;

    .line 25
    .line 26
    iput-boolean p13, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$useOriginIp:Z

    .line 27
    .line 28
    iput-object p14, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$content:[B

    .line 29
    .line 30
    iput-object p15, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$uploadFile:Ljava/lang/String;

    .line 31
    .line 32
    move-object/from16 p1, p16

    .line 33
    .line 34
    iput-object p1, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    .line 35
    .line 36
    move-object/from16 p1, p17

    .line 37
    .line 38
    iput-object p1, p0, Lcom/tencent/imsdk/common/HttpClient$1;->val$downloadFile:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 27

    move-object/from16 v1, p0

    .line 1
    const-string v2, "http request failed."

    .line 2
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$url:Ljava/lang/String;

    .line 3
    const-string v3, ""

    .line 4
    const-string v4, "https"

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    const-string v6, "http"

    if-eqz v5, :cond_1

    .line 5
    invoke-static {}, Lcom/tencent/imsdk/common/HttpClient;->access$000()Ljava/lang/String;

    move-result-object v5

    iget-object v7, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$rollbackHttps2Http:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 6
    iget-object v5, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$rollbackHttps2Http:Ljava/lang/String;

    invoke-static {v5}, Lcom/tencent/imsdk/common/HttpClient;->access$002(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    iget-object v5, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$rollbackHttps2Http:Ljava/lang/String;

    invoke-static {v5}, Lcom/tencent/imsdk/common/HttpClient;->access$200(Ljava/lang/String;)Z

    move-result v5

    invoke-static {v5}, Lcom/tencent/imsdk/common/HttpClient;->access$102(Z)Z

    .line 8
    :cond_0
    invoke-static {}, Lcom/tencent/imsdk/common/HttpClient;->access$100()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 9
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$url:Ljava/lang/String;

    invoke-virtual {v0, v4, v6}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    const/16 v7, 0xc8

    const/4 v8, 0x0

    .line 10
    :try_start_0
    iget-boolean v9, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$isStatisticsEnabled:Z
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_3c
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3a
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_36
    .catchall {:try_start_0 .. :try_end_0} :catchall_12

    const/4 v10, -0x1

    const/4 v11, 0x1

    if-nez v9, :cond_2

    .line 11
    :try_start_1
    new-instance v9, Ljava/net/URL;

    invoke-direct {v9, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move/from16 v19, v8

    move/from16 v20, v19

    move/from16 v25, v20

    :goto_0
    move-object/from16 v24, v3

    goto/16 :goto_10

    :catchall_0
    move-exception v0

    move-object v2, v0

    move-object v15, v3

    move v4, v7

    move v10, v8

    move v11, v10

    move v12, v11

    move v13, v12

    move/from16 v16, v13

    move/from16 v17, v16

    :goto_1
    const/4 v3, 0x0

    :goto_2
    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_3
    const/4 v8, 0x0

    :goto_4
    const/4 v14, 0x0

    goto/16 :goto_5a

    :catch_0
    move-exception v0

    move-object v15, v3

    move v10, v8

    move v11, v10

    move v12, v11

    move v13, v12

    move/from16 v17, v13

    :goto_5
    const/4 v3, 0x0

    :goto_6
    const/4 v4, 0x0

    :goto_7
    const/4 v5, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    goto/16 :goto_50

    :catch_1
    move-exception v0

    move-object v15, v3

    move v10, v8

    move v11, v10

    move v12, v11

    move v13, v12

    move/from16 v17, v13

    move/from16 v25, v17

    :goto_8
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_9
    const/16 v8, 0x177a

    const/4 v14, 0x0

    const/16 v16, 0x0

    goto/16 :goto_54

    :catch_2
    move-exception v0

    move-object v15, v3

    move v4, v7

    move v10, v8

    move v11, v10

    move v12, v11

    move v13, v12

    move/from16 v16, v13

    move/from16 v17, v16

    :goto_a
    const/4 v3, 0x0

    :goto_b
    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_c
    const/4 v8, 0x0

    :goto_d
    const/4 v14, 0x0

    goto/16 :goto_57

    .line 12
    :cond_2
    :try_start_2
    new-instance v9, Ljava/net/URL;

    invoke-direct {v9, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v12

    .line 14
    invoke-virtual {v9}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0
    :try_end_2
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_38
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_37
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_36
    .catchall {:try_start_2 .. :try_end_2} :catchall_12

    .line 15
    :try_start_3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v15
    :try_end_3
    .catch Ljava/net/UnknownHostException; {:try_start_3 .. :try_end_3} :catch_35
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_34
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_33
    .catchall {:try_start_3 .. :try_end_3} :catchall_11

    sub-long v12, v15, v12

    long-to-int v12, v12

    .line 16
    :try_start_4
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    .line 17
    invoke-virtual {v9}, Ljava/net/URL;->getPort()I

    move-result v13
    :try_end_4
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_32
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_31
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_30
    .catchall {:try_start_4 .. :try_end_4} :catchall_10

    if-ne v10, v13, :cond_3

    .line 18
    :try_start_5
    invoke-virtual {v9}, Ljava/net/URL;->getDefaultPort()I

    move-result v13
    :try_end_5
    .catch Ljava/net/UnknownHostException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_f

    :catchall_1
    move-exception v0

    move-object v2, v0

    move-object v15, v3

    move v4, v7

    move/from16 v17, v8

    move v10, v11

    move v11, v12

    move/from16 v16, v13

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v14, 0x0

    move/from16 v12, v17

    move v13, v12

    const/4 v8, 0x0

    goto/16 :goto_5a

    :catch_3
    move-exception v0

    move-object v15, v3

    move/from16 v17, v8

    move v10, v11

    move v11, v12

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move/from16 v12, v17

    move v8, v13

    move v13, v12

    goto/16 :goto_50

    :catch_4
    move-exception v0

    move-object v15, v3

    move/from16 v17, v8

    move v10, v11

    move v11, v12

    move/from16 v25, v13

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move/from16 v12, v17

    move v13, v12

    :goto_e
    const/16 v8, 0x177a

    goto/16 :goto_54

    :catch_5
    move-exception v0

    move-object v15, v3

    move v4, v7

    move/from16 v17, v8

    move v10, v11

    move v11, v12

    move/from16 v16, v13

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v14, 0x0

    move/from16 v12, v17

    move v13, v12

    const/4 v8, 0x0

    goto/16 :goto_57

    .line 19
    :cond_3
    :goto_f
    :try_start_6
    new-instance v15, Ljava/net/URL;

    invoke-virtual {v9}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9}, Ljava/net/URL;->getPort()I

    move-result v14

    .line 20
    invoke-virtual {v9}, Ljava/net/URL;->getFile()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v15, v5, v0, v14, v9}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_6
    .catch Ljava/net/UnknownHostException; {:try_start_6 .. :try_end_6} :catch_2f
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2e
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2d
    .catchall {:try_start_6 .. :try_end_6} :catchall_f

    move/from16 v19, v11

    move/from16 v20, v12

    move/from16 v25, v13

    move-object v9, v15

    goto/16 :goto_0

    .line 21
    :goto_10
    :try_start_7
    iget v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyType:I
    :try_end_7
    .catch Ljava/net/UnknownHostException; {:try_start_7 .. :try_end_7} :catch_2c
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2b
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2a
    .catchall {:try_start_7 .. :try_end_7} :catchall_e

    if-ne v11, v0, :cond_4

    :try_start_8
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyHost:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyPort:I

    if-eqz v0, :cond_4

    .line 22
    new-instance v0, Ljava/net/Proxy;

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    new-instance v5, Ljava/net/InetSocketAddress;

    iget-object v12, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyHost:Ljava/lang/String;

    iget v13, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyPort:I

    invoke-direct {v5, v12, v13}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-direct {v0, v3, v5}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    .line 23
    invoke-virtual {v9, v0}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/URLConnection;

    move-object v3, v0

    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_8
    .catch Ljava/net/UnknownHostException; {:try_start_8 .. :try_end_8} :catch_b
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_a
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_9
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 24
    :try_start_9
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyUserName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyPassword:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 25
    new-instance v0, Lcom/tencent/imsdk/common/HttpClient$BasicAuthenticator;

    iget-object v5, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyUserName:Ljava/lang/String;

    iget-object v9, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyPassword:Ljava/lang/String;

    invoke-direct {v0, v5, v9}, Lcom/tencent/imsdk/common/HttpClient$BasicAuthenticator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/net/Authenticator;->setDefault(Ljava/net/Authenticator;)V
    :try_end_9
    .catch Ljava/net/UnknownHostException; {:try_start_9 .. :try_end_9} :catch_8
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto/16 :goto_16

    :catchall_2
    move-exception v0

    move-object v2, v0

    move v4, v7

    move v12, v8

    move v13, v12

    move/from16 v17, v13

    move/from16 v10, v19

    move/from16 v11, v20

    :goto_11
    move-object/from16 v15, v24

    move/from16 v16, v25

    goto/16 :goto_2

    :catch_6
    move-exception v0

    move v12, v8

    move v13, v12

    move/from16 v17, v13

    move/from16 v10, v19

    move/from16 v11, v20

    :goto_12
    move-object/from16 v15, v24

    move/from16 v8, v25

    goto/16 :goto_6

    :catch_7
    move-exception v0

    move-object v5, v3

    move v12, v8

    move v13, v12

    move/from16 v17, v13

    move/from16 v10, v19

    move/from16 v11, v20

    :goto_13
    move-object/from16 v15, v24

    const/4 v3, 0x0

    :goto_14
    const/4 v4, 0x0

    goto/16 :goto_9

    :catch_8
    move-exception v0

    move v4, v7

    move v12, v8

    move v13, v12

    move/from16 v17, v13

    move/from16 v10, v19

    move/from16 v11, v20

    :goto_15
    move-object/from16 v15, v24

    move/from16 v16, v25

    goto/16 :goto_b

    :catchall_3
    move-exception v0

    move-object v2, v0

    move v4, v7

    move v12, v8

    move v13, v12

    move/from16 v17, v13

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    move/from16 v16, v25

    goto/16 :goto_1

    :catch_9
    move-exception v0

    move v12, v8

    move v13, v12

    move/from16 v17, v13

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    move/from16 v8, v25

    goto/16 :goto_5

    :catch_a
    move-exception v0

    move v12, v8

    move v13, v12

    move/from16 v17, v13

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    goto/16 :goto_8

    :catch_b
    move-exception v0

    move v4, v7

    move v12, v8

    move v13, v12

    move/from16 v17, v13

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    move/from16 v16, v25

    goto/16 :goto_a

    .line 26
    :cond_4
    :try_start_a
    iget v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyType:I
    :try_end_a
    .catch Ljava/net/UnknownHostException; {:try_start_a .. :try_end_a} :catch_2c
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2b
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2a
    .catchall {:try_start_a .. :try_end_a} :catchall_e

    const/4 v3, 0x2

    if-ne v3, v0, :cond_5

    :try_start_b
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyHost:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyPort:I

    if-eqz v0, :cond_5

    .line 27
    new-instance v0, Ljava/net/Proxy;

    sget-object v3, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    new-instance v5, Ljava/net/InetSocketAddress;

    iget-object v12, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyHost:Ljava/lang/String;

    iget v13, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyPort:I

    invoke-direct {v5, v12, v13}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-direct {v0, v3, v5}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    .line 28
    invoke-virtual {v9, v0}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/URLConnection;

    move-object v3, v0

    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_b
    .catch Ljava/net/UnknownHostException; {:try_start_b .. :try_end_b} :catch_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_a
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_9
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 29
    :try_start_c
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyUserName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyPassword:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 30
    new-instance v0, Lcom/tencent/imsdk/common/HttpClient$BasicAuthenticator;

    iget-object v5, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyUserName:Ljava/lang/String;

    iget-object v9, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$proxyPassword:Ljava/lang/String;

    invoke-direct {v0, v5, v9}, Lcom/tencent/imsdk/common/HttpClient$BasicAuthenticator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/net/Authenticator;->setDefault(Ljava/net/Authenticator;)V
    :try_end_c
    .catch Ljava/net/UnknownHostException; {:try_start_c .. :try_end_c} :catch_8
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_7
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    goto :goto_16

    .line 31
    :cond_5
    :try_start_d
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/URLConnection;

    move-object v3, v0

    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_d
    .catch Ljava/net/UnknownHostException; {:try_start_d .. :try_end_d} :catch_2c
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_2b
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_2a
    .catchall {:try_start_d .. :try_end_d} :catchall_e

    .line 32
    :cond_6
    :goto_16
    :try_start_e
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$method:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 33
    iget v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$connectTimeout:I

    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 34
    iget v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$recvTimeout:I

    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 35
    invoke-virtual {v3, v8}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 36
    invoke-virtual {v3, v11}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 37
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$headers:Ljava/util/Map;
    :try_end_e
    .catch Ljava/net/UnknownHostException; {:try_start_e .. :try_end_e} :catch_29
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_28
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_27
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    if-eqz v0, :cond_7

    .line 38
    :try_start_f
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 39
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v9, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_f
    .catch Ljava/net/UnknownHostException; {:try_start_f .. :try_end_f} :catch_8
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_7
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_6
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    goto :goto_17

    .line 40
    :cond_7
    :try_start_10
    iget-boolean v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$isStatisticsEnabled:Z
    :try_end_10
    .catch Ljava/net/UnknownHostException; {:try_start_10 .. :try_end_10} :catch_29
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_28
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_27
    .catchall {:try_start_10 .. :try_end_10} :catchall_d

    if-nez v0, :cond_8

    :try_start_11
    iget-boolean v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$useOriginIp:Z
    :try_end_11
    .catch Ljava/net/UnknownHostException; {:try_start_11 .. :try_end_11} :catch_8
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_7
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_6
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    if-eqz v0, :cond_9

    :cond_8
    :try_start_12
    instance-of v0, v3, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_12
    .catch Ljava/net/UnknownHostException; {:try_start_12 .. :try_end_12} :catch_29
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_28
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_27
    .catchall {:try_start_12 .. :try_end_12} :catchall_d

    if-eqz v0, :cond_9

    .line 41
    :try_start_13
    move-object v0, v3

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 42
    new-instance v5, Lcom/tencent/imsdk/common/HttpClient$1$1;

    invoke-direct {v5, v1, v0}, Lcom/tencent/imsdk/common/HttpClient$1$1;-><init>(Lcom/tencent/imsdk/common/HttpClient$1;Ljavax/net/ssl/HttpsURLConnection;)V

    invoke-virtual {v0, v5}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 43
    new-instance v5, Lcom/tencent/imsdk/common/HttpClient$1$2;

    invoke-direct {v5, v1, v0}, Lcom/tencent/imsdk/common/HttpClient$1$2;-><init>(Lcom/tencent/imsdk/common/HttpClient$1;Ljavax/net/ssl/HttpsURLConnection;)V

    invoke-virtual {v0, v5}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    :try_end_13
    .catch Ljava/net/UnknownHostException; {:try_start_13 .. :try_end_13} :catch_8
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_7
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_6
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    .line 44
    :cond_9
    :try_start_14
    iget-boolean v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$isStatisticsEnabled:Z
    :try_end_14
    .catch Ljava/net/UnknownHostException; {:try_start_14 .. :try_end_14} :catch_29
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_28
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_27
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    if-eqz v0, :cond_a

    .line 45
    :try_start_15
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v12

    .line 46
    invoke-virtual {v3}, Ljava/net/URLConnection;->connect()V

    .line 47
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v14
    :try_end_15
    .catch Ljava/net/UnknownHostException; {:try_start_15 .. :try_end_15} :catch_8
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_7
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_6
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    sub-long/2addr v14, v12

    long-to-int v0, v14

    move/from16 v22, v0

    move/from16 v21, v11

    goto :goto_18

    :cond_a
    move/from16 v21, v8

    move/from16 v22, v21

    .line 48
    :goto_18
    :try_start_16
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v12

    .line 49
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$content:[B
    :try_end_16
    .catch Ljava/net/UnknownHostException; {:try_start_16 .. :try_end_16} :catch_26
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_25
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_24
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    if-eqz v0, :cond_b

    :try_start_17
    array-length v0, v0
    :try_end_17
    .catch Ljava/net/UnknownHostException; {:try_start_17 .. :try_end_17} :catch_e
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_d
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_c
    .catchall {:try_start_17 .. :try_end_17} :catchall_4

    if-lez v0, :cond_b

    move v0, v11

    goto :goto_1d

    :catchall_4
    move-exception v0

    move-object v2, v0

    move v4, v7

    move/from16 v17, v8

    :goto_19
    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    goto/16 :goto_11

    :catch_c
    move-exception v0

    move/from16 v17, v8

    :goto_1a
    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    goto/16 :goto_12

    :catch_d
    move-exception v0

    move-object v5, v3

    move/from16 v17, v8

    :goto_1b
    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    goto/16 :goto_13

    :catch_e
    move-exception v0

    move v4, v7

    move/from16 v17, v8

    :goto_1c
    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    goto/16 :goto_15

    :cond_b
    move v0, v8

    .line 50
    :goto_1d
    :try_start_18
    iget-object v5, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$uploadFile:Ljava/lang/String;
    :try_end_18
    .catch Ljava/net/UnknownHostException; {:try_start_18 .. :try_end_18} :catch_26
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_25
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_24
    .catchall {:try_start_18 .. :try_end_18} :catchall_c

    if-eqz v5, :cond_c

    :try_start_19
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5
    :try_end_19
    .catch Ljava/net/UnknownHostException; {:try_start_19 .. :try_end_19} :catch_e
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_d
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_c
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    if-eqz v5, :cond_c

    move v5, v11

    goto :goto_1e

    :cond_c
    move v5, v8

    :goto_1e
    if-nez v0, :cond_e

    if-eqz v5, :cond_d

    goto :goto_1f

    :cond_d
    move v0, v8

    goto :goto_20

    :cond_e
    :goto_1f
    move v0, v11

    .line 51
    :goto_20
    :try_start_1a
    iget-object v9, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$method:Ljava/lang/String;

    const-string v14, "GET"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9
    :try_end_1a
    .catch Ljava/net/UnknownHostException; {:try_start_1a .. :try_end_1a} :catch_26
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_25
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_24
    .catchall {:try_start_1a .. :try_end_1a} :catchall_c

    const/16 v14, 0x1000

    if-nez v9, :cond_12

    if-eqz v0, :cond_12

    .line 52
    :try_start_1b
    invoke-virtual {v3, v11}, Ljava/net/URLConnection;->setDoOutput(Z)V

    if-eqz v5, :cond_f

    .line 53
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v5, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$uploadFile:Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    goto :goto_21

    .line 54
    :cond_f
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v5, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$content:[B

    invoke-direct {v0, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 55
    :goto_21
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v5

    .line 56
    invoke-virtual {v3, v5}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 57
    new-array v9, v14, [B

    move v15, v8

    .line 58
    :goto_22
    invoke-virtual {v0, v9}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-gez v4, :cond_10

    .line 59
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    goto :goto_23

    :cond_10
    add-int/2addr v15, v4

    .line 60
    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v11

    invoke-virtual {v11, v9, v8, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 61
    iget-object v4, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    if-eqz v4, :cond_11

    .line 62
    invoke-interface {v4, v8, v15, v5}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onProgress(III)V
    :try_end_1b
    .catch Ljava/net/UnknownHostException; {:try_start_1b .. :try_end_1b} :catch_e
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_d
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_c
    .catchall {:try_start_1b .. :try_end_1b} :catchall_4

    :cond_11
    const/4 v11, 0x1

    goto :goto_22

    .line 63
    :cond_12
    :goto_23
    :try_start_1c
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4
    :try_end_1c
    .catch Ljava/net/UnknownHostException; {:try_start_1c .. :try_end_1c} :catch_26
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_25
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_24
    .catchall {:try_start_1c .. :try_end_1c} :catchall_c

    .line 64
    :try_start_1d
    invoke-virtual {v3}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0
    :try_end_1d
    .catch Ljava/net/UnknownHostException; {:try_start_1d .. :try_end_1d} :catch_23
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_1d} :catch_22
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_12
    .catchall {:try_start_1d .. :try_end_1d} :catchall_b

    if-lez v0, :cond_13

    .line 65
    :try_start_1e
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
    :try_end_1e
    .catch Ljava/net/UnknownHostException; {:try_start_1e .. :try_end_1e} :catch_14
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_13
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_12
    .catchall {:try_start_1e .. :try_end_1e} :catchall_6

    move v9, v8

    :goto_24
    if-ge v9, v0, :cond_14

    .line 66
    :try_start_1f
    invoke-virtual {v3, v9}, Ljava/net/HttpURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3, v9}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v5, v11, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1f
    .catch Ljava/net/UnknownHostException; {:try_start_1f .. :try_end_1f} :catch_11
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_1f} :catch_10
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_5

    add-int/lit8 v9, v9, 0x1

    goto :goto_24

    :catchall_5
    move-exception v0

    move-object v2, v0

    move/from16 v17, v4

    move-object v6, v5

    :goto_25
    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v16, v25

    const/4 v5, 0x0

    goto/16 :goto_3

    :catch_f
    move-exception v0

    move v7, v4

    move/from16 v17, v7

    move-object v4, v5

    :goto_26
    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v8, v25

    goto/16 :goto_7

    :catch_10
    move-exception v0

    move-object v7, v5

    move-object v5, v3

    move-object v3, v7

    move v7, v4

    :goto_27
    move/from16 v17, v7

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    goto/16 :goto_14

    :catch_11
    move-exception v0

    move/from16 v17, v4

    move-object v6, v5

    :goto_28
    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v16, v25

    const/4 v5, 0x0

    goto/16 :goto_c

    :catchall_6
    move-exception v0

    :goto_29
    move-object v2, v0

    move/from16 v17, v4

    goto/16 :goto_19

    :catch_12
    move-exception v0

    move v7, v4

    move/from16 v17, v7

    goto/16 :goto_1a

    :catch_13
    move-exception v0

    move-object v5, v3

    move v7, v4

    :goto_2a
    move/from16 v17, v7

    goto/16 :goto_1b

    :catch_14
    move-exception v0

    :goto_2b
    move/from16 v17, v4

    goto/16 :goto_1c

    :cond_13
    const/4 v5, 0x0

    .line 67
    :cond_14
    :try_start_20
    invoke-virtual {v3}, Ljava/net/URLConnection;->getContentLength()I

    move-result v0

    if-ne v0, v10, :cond_15

    move v0, v8

    .line 68
    :cond_15
    iget-object v9, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$downloadFile:Ljava/lang/String;
    :try_end_20
    .catch Ljava/net/UnknownHostException; {:try_start_20 .. :try_end_20} :catch_21
    .catch Ljava/io/IOException; {:try_start_20 .. :try_end_20} :catch_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_1f
    .catchall {:try_start_20 .. :try_end_20} :catchall_a

    if-eqz v9, :cond_16

    :try_start_21
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-eqz v9, :cond_16

    const/4 v9, 0x1

    goto :goto_2c

    :cond_16
    move v9, v8

    :goto_2c
    if-ne v4, v7, :cond_1b

    .line 69
    new-instance v7, Ljava/io/BufferedInputStream;

    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v10

    invoke-direct {v7, v10}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_21
    .catch Ljava/net/UnknownHostException; {:try_start_21 .. :try_end_21} :catch_11
    .catch Ljava/io/IOException; {:try_start_21 .. :try_end_21} :catch_10
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_f
    .catchall {:try_start_21 .. :try_end_21} :catchall_5

    if-eqz v9, :cond_17

    .line 70
    :try_start_22
    new-instance v10, Ljava/io/FileOutputStream;

    iget-object v11, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$downloadFile:Ljava/lang/String;

    invoke-direct {v10, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2e

    :catchall_7
    move-exception v0

    move-object v2, v0

    move/from16 v17, v4

    move-object v6, v5

    move-object v5, v7

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v16, v25

    goto/16 :goto_3

    :catch_15
    move-exception v0

    move/from16 v17, v4

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v8, v25

    const/4 v14, 0x0

    const/16 v16, 0x0

    :goto_2d
    move-object v4, v5

    move-object v5, v7

    move/from16 v7, v17

    goto/16 :goto_50

    :catch_16
    move-exception v0

    move-object v8, v5

    move-object v5, v3

    move-object v3, v8

    move/from16 v17, v4

    move-object/from16 v16, v7

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    const/16 v8, 0x177a

    const/4 v14, 0x0

    move/from16 v7, v17

    const/4 v4, 0x0

    goto/16 :goto_54

    :catch_17
    move-exception v0

    move/from16 v17, v4

    move-object v6, v5

    move-object v5, v7

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v16, v25

    goto/16 :goto_c

    .line 71
    :cond_17
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 72
    :goto_2e
    new-array v11, v14, [B

    move v14, v8

    .line 73
    :goto_2f
    invoke-virtual {v7, v11}, Ljava/io/InputStream;->read([B)I

    move-result v15

    if-gez v15, :cond_19

    if-eqz v9, :cond_18

    .line 74
    new-array v0, v8, [B

    :goto_30
    move-object v8, v0

    goto :goto_31

    .line 75
    :cond_18
    move-object v0, v10

    check-cast v0, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_22
    .catch Ljava/net/UnknownHostException; {:try_start_22 .. :try_end_22} :catch_17
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_16
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_15
    .catchall {:try_start_22 .. :try_end_22} :catchall_7

    goto :goto_30

    .line 76
    :goto_31
    :try_start_23
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_23
    .catch Ljava/net/UnknownHostException; {:try_start_23 .. :try_end_23} :catch_1a
    .catch Ljava/io/IOException; {:try_start_23 .. :try_end_23} :catch_19
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_18
    .catchall {:try_start_23 .. :try_end_23} :catchall_8

    move-object/from16 v16, v7

    goto/16 :goto_35

    :catchall_8
    move-exception v0

    move-object v2, v0

    move/from16 v17, v4

    move-object v6, v5

    move-object v5, v7

    :goto_32
    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v16, v25

    goto/16 :goto_4

    :catch_18
    move-exception v0

    move/from16 v17, v4

    move-object/from16 v16, v8

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v8, v25

    const/4 v14, 0x0

    goto :goto_2d

    :catch_19
    move-exception v0

    move-object v10, v5

    move-object v5, v3

    move-object v3, v10

    move/from16 v17, v4

    move-object/from16 v16, v7

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    const/4 v14, 0x0

    move/from16 v7, v17

    move-object v4, v8

    goto/16 :goto_e

    :catch_1a
    move-exception v0

    move/from16 v17, v4

    move-object v6, v5

    move-object v5, v7

    :goto_33
    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v16, v25

    goto/16 :goto_d

    :cond_19
    add-int/2addr v14, v15

    .line 77
    :try_start_24
    invoke-virtual {v10, v11, v8, v15}, Ljava/io/OutputStream;->write([BII)V

    .line 78
    iget-object v15, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    if-eqz v15, :cond_1a

    const/4 v8, 0x1

    .line 79
    invoke-interface {v15, v8, v14, v0}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onProgress(III)V
    :try_end_24
    .catch Ljava/net/UnknownHostException; {:try_start_24 .. :try_end_24} :catch_17
    .catch Ljava/io/IOException; {:try_start_24 .. :try_end_24} :catch_16
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_15
    .catchall {:try_start_24 .. :try_end_24} :catchall_7

    goto :goto_34

    :cond_1a
    const/4 v8, 0x1

    :goto_34
    const/4 v8, 0x0

    goto :goto_2f

    :cond_1b
    const/4 v8, 0x0

    const/16 v16, 0x0

    .line 80
    :goto_35
    :try_start_25
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6
    :try_end_25
    .catch Ljava/net/UnknownHostException; {:try_start_25 .. :try_end_25} :catch_1e
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_25} :catch_1d
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_1c
    .catchall {:try_start_25 .. :try_end_25} :catchall_9

    sub-long/2addr v6, v12

    long-to-int v2, v6

    if-eqz v16, :cond_1c

    .line 81
    :try_start_26
    invoke-virtual/range {v16 .. v16}, Ljava/io/InputStream;->close()V
    :try_end_26
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_26} :catch_1b

    goto :goto_36

    :catch_1b
    move-exception v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 83
    :cond_1c
    :goto_36
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 84
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    if-eqz v0, :cond_28

    .line 85
    iget-boolean v3, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$isStatisticsEnabled:Z

    if-eqz v3, :cond_1d

    move-object/from16 v18, v0

    move/from16 v23, v2

    move/from16 v26, v4

    .line 86
    invoke-interface/range {v18 .. v26}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onStatistics(ZIZIILjava/lang/String;II)V

    move/from16 v7, v26

    goto :goto_37

    :cond_1d
    move v7, v4

    .line 87
    :goto_37
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    invoke-interface {v0, v7, v5, v8}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onCompleted(ILjava/util/Map;[B)V

    goto/16 :goto_59

    :catchall_9
    move-exception v0

    move v7, v4

    move-object v2, v0

    move-object v6, v5

    move/from16 v17, v4

    move-object/from16 v5, v16

    goto/16 :goto_32

    :catch_1c
    move-exception v0

    move v7, v4

    move-object v4, v5

    move/from16 v17, v7

    move-object/from16 v5, v16

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    const/4 v14, 0x0

    move-object/from16 v16, v8

    move/from16 v8, v25

    goto/16 :goto_50

    :catch_1d
    move-exception v0

    move v7, v4

    move-object v4, v5

    move-object v5, v3

    move-object v3, v4

    move/from16 v17, v7

    move-object v4, v8

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    const/16 v8, 0x177a

    const/4 v14, 0x0

    goto/16 :goto_54

    :catch_1e
    move-exception v0

    move v7, v4

    move-object v6, v5

    move/from16 v17, v4

    move-object/from16 v5, v16

    goto/16 :goto_33

    :catchall_a
    move-exception v0

    move v7, v4

    move-object v2, v0

    move-object v6, v5

    move/from16 v17, v4

    goto/16 :goto_25

    :catch_1f
    move-exception v0

    move v7, v4

    move-object v4, v5

    move/from16 v17, v7

    goto/16 :goto_26

    :catch_20
    move-exception v0

    move v7, v4

    move-object v4, v5

    move-object v5, v3

    move-object v3, v4

    goto/16 :goto_27

    :catch_21
    move-exception v0

    move v7, v4

    move-object v6, v5

    move/from16 v17, v4

    goto/16 :goto_28

    :catchall_b
    move-exception v0

    move v7, v4

    goto/16 :goto_29

    :catch_22
    move-exception v0

    move v7, v4

    move-object v5, v3

    goto/16 :goto_2a

    :catch_23
    move-exception v0

    move v7, v4

    goto/16 :goto_2b

    :catchall_c
    move-exception v0

    move-object v2, v0

    move v4, v7

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v16, v25

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_38
    const/4 v14, 0x0

    :goto_39
    const/16 v17, 0x0

    goto/16 :goto_5a

    :catch_24
    move-exception v0

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v8, v25

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_3a
    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    goto/16 :goto_50

    :catch_25
    move-exception v0

    move-object v5, v3

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v8, 0x177a

    :goto_3b
    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    goto/16 :goto_54

    :catch_26
    move-exception v0

    move v4, v7

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v12, v21

    move/from16 v13, v22

    move-object/from16 v15, v24

    move/from16 v16, v25

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_3c
    const/4 v14, 0x0

    :goto_3d
    const/16 v17, 0x0

    goto/16 :goto_57

    :catchall_d
    move-exception v0

    move-object v2, v0

    move v4, v7

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    move/from16 v16, v25

    :goto_3e
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    goto :goto_38

    :catch_27
    move-exception v0

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    move/from16 v8, v25

    :goto_3f
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_40
    const/4 v12, 0x0

    const/4 v13, 0x0

    goto :goto_3a

    :catch_28
    move-exception v0

    move-object v5, v3

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_41
    const/16 v8, 0x177a

    const/4 v12, 0x0

    const/4 v13, 0x0

    goto :goto_3b

    :catch_29
    move-exception v0

    move v4, v7

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    move/from16 v16, v25

    :goto_42
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    goto :goto_3c

    :catchall_e
    move-exception v0

    move-object v2, v0

    move v4, v7

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    move/from16 v16, v25

    :goto_43
    const/4 v3, 0x0

    goto :goto_3e

    :catch_2a
    move-exception v0

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    move/from16 v8, v25

    :goto_44
    const/4 v3, 0x0

    goto :goto_3f

    :catch_2b
    move-exception v0

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    :goto_45
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    goto :goto_41

    :catch_2c
    move-exception v0

    move v4, v7

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v15, v24

    move/from16 v16, v25

    :goto_46
    const/4 v3, 0x0

    goto :goto_42

    :catchall_f
    move-exception v0

    move v8, v11

    move-object v2, v0

    move-object v15, v3

    move v4, v7

    move v10, v8

    move v11, v12

    move/from16 v16, v13

    goto :goto_43

    :catch_2d
    move-exception v0

    move v8, v11

    move-object v15, v3

    move v10, v8

    move v11, v12

    move v8, v13

    goto :goto_44

    :catch_2e
    move-exception v0

    move v8, v11

    move-object v15, v3

    move v10, v8

    move v11, v12

    move/from16 v25, v13

    goto :goto_45

    :catch_2f
    move-exception v0

    move v8, v11

    move-object v15, v3

    move v4, v7

    move v10, v8

    move v11, v12

    move/from16 v16, v13

    goto :goto_46

    :catchall_10
    move-exception v0

    move v8, v11

    move-object v2, v0

    move-object v15, v3

    move v4, v7

    move v10, v8

    move v11, v12

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_47
    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    goto/16 :goto_39

    :catch_30
    move-exception v0

    move v8, v11

    move-object v15, v3

    move v10, v8

    move v11, v12

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    goto/16 :goto_40

    :catch_31
    move-exception v0

    move v8, v11

    move-object v15, v3

    move v10, v8

    move v11, v12

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v8, 0x177a

    :goto_48
    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_49
    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v25, 0x0

    goto/16 :goto_54

    :catch_32
    move-exception v0

    move v8, v11

    move-object v15, v3

    move v4, v7

    move v10, v8

    move v11, v12

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_4a
    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_4b
    const/16 v16, 0x0

    goto/16 :goto_3d

    :catchall_11
    move-exception v0

    move v8, v11

    move-object v2, v0

    move-object v15, v3

    move v4, v7

    move v10, v8

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_4c
    const/4 v11, 0x0

    goto :goto_47

    :catch_33
    move-exception v0

    move v8, v11

    move-object v15, v3

    move v10, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_4d
    const/4 v11, 0x0

    goto/16 :goto_40

    :catch_34
    move-exception v0

    move v8, v11

    move-object v15, v3

    move v10, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v8, 0x177a

    :goto_4e
    const/4 v11, 0x0

    goto :goto_48

    :catch_35
    move-exception v0

    move v8, v11

    move-object v15, v3

    move v4, v7

    move v10, v8

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_4f
    const/4 v11, 0x0

    goto :goto_4a

    :catchall_12
    move-exception v0

    move-object v2, v0

    move-object v15, v3

    move v4, v7

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    goto :goto_4c

    :catch_36
    move-exception v0

    move-object v15, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    goto :goto_4d

    :catch_37
    move-exception v0

    move-object v15, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v8, 0x177a

    const/4 v10, 0x0

    goto :goto_4e

    :catch_38
    move-exception v0

    move-object v15, v3

    move v4, v7

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    goto :goto_4f

    .line 88
    :goto_50
    :try_start_27
    invoke-static {}, Lcom/tencent/imsdk/common/HttpClient;->access$400()Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lcom/tencent/imsdk/common/IMLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_14

    .line 89
    :try_start_28
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v2
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_13

    if-eqz v5, :cond_1e

    .line 90
    :try_start_29
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_29
    .catch Ljava/io/IOException; {:try_start_29 .. :try_end_29} :catch_39

    goto :goto_51

    :catch_39
    move-exception v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1e
    :goto_51
    if-eqz v3, :cond_1f

    .line 92
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 93
    :cond_1f
    iget-object v9, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    if-eqz v9, :cond_28

    .line 94
    iget-boolean v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$isStatisticsEnabled:Z

    if-eqz v0, :cond_20

    move/from16 v16, v8

    .line 95
    invoke-interface/range {v9 .. v17}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onStatistics(ZIZIILjava/lang/String;II)V

    .line 96
    :cond_20
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    const/16 v8, 0x177a

    invoke-interface {v0, v8, v4, v2}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onCompleted(ILjava/util/Map;[B)V

    goto/16 :goto_59

    :catchall_13
    move-exception v0

    move/from16 v25, v8

    const/16 v8, 0x177a

    move-object v2, v0

    move-object v6, v4

    move v4, v8

    :goto_52
    move-object/from16 v8, v16

    :goto_53
    move/from16 v16, v25

    goto/16 :goto_5a

    :catchall_14
    move-exception v0

    move/from16 v25, v8

    move-object v2, v0

    move-object v6, v4

    move v4, v7

    goto :goto_52

    :catch_3a
    move-exception v0

    const/16 v8, 0x177a

    const/4 v14, 0x0

    move-object v15, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    goto/16 :goto_49

    .line 97
    :goto_54
    :try_start_2a
    invoke-static {}, Lcom/tencent/imsdk/common/HttpClient;->access$400()Ljava/lang/String;

    move-result-object v9

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v2}, Lcom/tencent/imsdk/common/IMLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 99
    iget-object v2, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$url:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_16

    if-eqz v2, :cond_21

    if-eqz v0, :cond_21

    .line 100
    :try_start_2b
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "cleartext http traffic"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_15

    if-eqz v0, :cond_21

    const/16 v0, 0x178d

    move v2, v0

    goto :goto_55

    :catchall_15
    move-exception v0

    move-object v2, v0

    move-object v6, v3

    move-object v8, v4

    move-object v3, v5

    move v4, v7

    move-object/from16 v5, v16

    goto :goto_53

    :cond_21
    const/16 v2, 0x177a

    :goto_55
    if-eqz v16, :cond_22

    .line 101
    :try_start_2c
    invoke-virtual/range {v16 .. v16}, Ljava/io/InputStream;->close()V
    :try_end_2c
    .catch Ljava/io/IOException; {:try_start_2c .. :try_end_2c} :catch_3b

    goto :goto_56

    :catch_3b
    move-exception v0

    .line 102
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_22
    :goto_56
    if-eqz v5, :cond_23

    .line 103
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 104
    :cond_23
    iget-object v9, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    if-eqz v9, :cond_28

    .line 105
    iget-boolean v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$isStatisticsEnabled:Z

    if-eqz v0, :cond_24

    move/from16 v16, v25

    .line 106
    invoke-interface/range {v9 .. v17}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onStatistics(ZIZIILjava/lang/String;II)V

    .line 107
    :cond_24
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    invoke-interface {v0, v2, v3, v4}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onCompleted(ILjava/util/Map;[B)V

    goto :goto_59

    :catchall_16
    move-exception v0

    move/from16 v8, v25

    move-object v2, v0

    move-object v6, v3

    move-object v3, v5

    move-object/from16 v5, v16

    move/from16 v16, v8

    move-object v8, v4

    move v4, v7

    goto :goto_5a

    :catch_3c
    move-exception v0

    const/4 v14, 0x0

    move-object v15, v3

    move v4, v7

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    goto/16 :goto_4b

    .line 108
    :goto_57
    :try_start_2d
    invoke-static {}, Lcom/tencent/imsdk/common/HttpClient;->access$400()Ljava/lang/String;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lcom/tencent/imsdk/common/IMLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_17

    if-eqz v5, :cond_25

    .line 109
    :try_start_2e
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2e
    .catch Ljava/io/IOException; {:try_start_2e .. :try_end_2e} :catch_3d

    goto :goto_58

    :catch_3d
    move-exception v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_25
    :goto_58
    if-eqz v3, :cond_26

    .line 111
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 112
    :cond_26
    iget-object v9, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    if-eqz v9, :cond_28

    .line 113
    iget-boolean v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$isStatisticsEnabled:Z

    if-eqz v0, :cond_27

    .line 114
    invoke-interface/range {v9 .. v17}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onStatistics(ZIZIILjava/lang/String;II)V

    .line 115
    :cond_27
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    const/16 v2, 0x194

    invoke-interface {v0, v2, v6, v8}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onCompleted(ILjava/util/Map;[B)V

    :cond_28
    :goto_59
    return-void

    :catchall_17
    move-exception v0

    move-object v2, v0

    :goto_5a
    if-eqz v5, :cond_29

    .line 116
    :try_start_2f
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2f
    .catch Ljava/io/IOException; {:try_start_2f .. :try_end_2f} :catch_3e

    goto :goto_5b

    :catch_3e
    move-exception v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_29
    :goto_5b
    if-eqz v3, :cond_2a

    .line 118
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 119
    :cond_2a
    iget-object v9, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    if-eqz v9, :cond_2c

    .line 120
    iget-boolean v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$isStatisticsEnabled:Z

    if-eqz v0, :cond_2b

    .line 121
    invoke-interface/range {v9 .. v17}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onStatistics(ZIZIILjava/lang/String;II)V

    .line 122
    :cond_2b
    iget-object v0, v1, Lcom/tencent/imsdk/common/HttpClient$1;->val$listener:Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;

    invoke-interface {v0, v4, v6, v8}, Lcom/tencent/imsdk/common/HttpClient$HttpRequestListener;->onCompleted(ILjava/util/Map;[B)V

    .line 123
    :cond_2c
    throw v2
.end method
