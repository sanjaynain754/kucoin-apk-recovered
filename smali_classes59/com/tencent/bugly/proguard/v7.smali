.class public Lcom/tencent/bugly/proguard/v7;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "HttpErrorUtils"

.field public static final b:I = 0x384

.field public static final c:I = 0x385

.field public static final d:I = 0x386

.field public static final e:I = 0x387

.field public static final f:I = 0x388

.field public static final g:I = 0x38b

.field public static final h:I = 0x38c

.field public static final i:I = 0x38f

.field public static final j:I = 0x395

.field public static volatile k:Lcom/tencent/bugly/proguard/v7;


# direct methods
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
.end method

.method public static a()Lcom/tencent/bugly/proguard/v7;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/v7;->k:Lcom/tencent/bugly/proguard/v7;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/v7;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/v7;->k:Lcom/tencent/bugly/proguard/v7;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/bugly/proguard/v7;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/v7;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/v7;->k:Lcom/tencent/bugly/proguard/v7;

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
    sget-object v0, Lcom/tencent/bugly/proguard/v7;->k:Lcom/tencent/bugly/proguard/v7;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)Z
    .locals 3

    if-eqz p1, :cond_0

    .line 7
    :try_start_0
    instance-of v0, p1, Ljava/net/SocketException;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "recvfrom failed: ECONNRESET (Connection reset by peer)"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "HttpErrorUtils"

    const-string v2, "isSocketECONNRESET error"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
