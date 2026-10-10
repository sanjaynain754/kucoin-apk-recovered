.class public Lcom/tencent/bugly/proguard/q4;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "DeviceInfoUtil"

.field public static final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ljava/lang/String; = "android.permission.READ_PHONE_STATE"


# direct methods
.method public static constructor <clinit>()V
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
    sput-object v0, Lcom/tencent/bugly/proguard/q4;->b:Ljava/util/HashMap;

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
.end method

.method public static a()J
    .locals 7

    const-string v0, "DeviceInfoUtil"

    const-wide/16 v1, 0x0

    .line 11
    :try_start_0
    new-instance v3, Ljava/io/File;

    const-string v4, "/proc"

    const-string v5, "meminfo"

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->canRead()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    .line 13
    :cond_0
    new-instance v4, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/FileReader;

    invoke-direct {v5, v3}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 14
    :cond_1
    :try_start_1
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 15
    const-string v5, "MemTotal:"

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 16
    const-string v5, "\\s+"

    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    aget-object v3, v3, v5

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-wide/16 v5, 0x400

    mul-long/2addr v1, v5

    goto :goto_0

    :catchall_0
    move-exception v3

    goto :goto_3

    .line 17
    :cond_2
    :goto_0
    :try_start_2
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-wide v1

    :catchall_1
    move-exception v3

    .line 18
    sget-object v4, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v4, v0, v3}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-wide v1

    :catchall_2
    move-exception v3

    goto :goto_2

    :cond_3
    :goto_1
    return-wide v1

    :goto_2
    const/4 v4, 0x0

    .line 19
    :goto_3
    :try_start_3
    sget-object v5, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v5, v0, v3}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-eqz v4, :cond_4

    .line 20
    :try_start_4
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v3

    .line 21
    sget-object v4, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v4, v0, v3}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_4
    return-wide v1

    :catchall_4
    move-exception v1

    if-eqz v4, :cond_5

    .line 22
    :try_start_5
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception v2

    .line 23
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v3, v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    :cond_5
    :goto_5
    throw v1
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 4
    :cond_2
    const-string v0, "arm"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    const-string p0, "armeabi-v7a"

    return-object p0

    .line 6
    :cond_3
    const-string v0, "arm64"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 7
    const-string p0, "arm64-v8a"

    return-object p0

    .line 8
    :cond_4
    const-string/jumbo v0, "x86"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    return-object v0

    .line 9
    :cond_5
    const-string/jumbo v0, "x86_64"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_6

    return-object v0

    .line 10
    :cond_6
    :goto_0
    const-string p0, "fail"

    return-object p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    .line 25
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/q4;->a(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static a(Landroid/content/Context;[Ljava/lang/String;)Z
    .locals 8

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 26
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    .line 27
    :cond_1
    array-length v2, p1

    move v3, v0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v2, :cond_5

    aget-object v5, p1, v3

    .line 28
    sget-object v6, Lcom/tencent/bugly/proguard/q4;->b:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    if-eqz v7, :cond_2

    .line 29
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_4

    return v0

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 30
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v5, v7}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    move v4, v0

    .line 31
    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v6, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_4

    return v0

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return v4

    .line 32
    :goto_2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "DeviceInfoUtil"

    invoke-virtual {p1, v1, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method
