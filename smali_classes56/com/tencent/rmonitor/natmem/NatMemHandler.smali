.class public Lcom/tencent/rmonitor/natmem/NatMemHandler;
.super Landroid/os/Handler;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/g9;
.implements Lcom/tencent/bugly/proguard/h9;
.implements Lcom/tencent/bugly/proguard/y9;


# static fields
.field public static final k:Ljava/lang/String; = "RMonitor_NatMem_Handler"

.field public static final l:I = 0x1

.field public static final m:I = 0x2

.field public static final n:I = 0x1

.field public static final o:I = 0x2

.field public static final p:Ljava/lang/String; = "sig_jmp_info_key"


# instance fields
.field public b:J

.field public c:J

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:Landroid/content/SharedPreferences;

.field public g:Landroid/content/SharedPreferences$Editor;

.field public h:J

.field public i:J

.field public j:F


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v0, 0x10000000000L

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->b:J

    .line 11
    .line 12
    .line 13
    const-wide/32 v0, 0x40000000

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->c:J

    .line 16
    const/4 p1, 0x1

    .line 17
    .line 18
    iput-boolean p1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->e:Z

    .line 19
    const/4 p1, 0x0

    .line 20
    .line 21
    iput-object p1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->g:Landroid/content/SharedPreferences$Editor;

    .line 22
    .line 23
    const-wide/16 v0, 0x0

    .line 24
    .line 25
    iput-wide v0, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->h:J

    .line 26
    .line 27
    iput-wide v0, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->i:J

    .line 28
    .line 29
    .line 30
    const p1, 0x3f866666    # 1.05f

    .line 31
    .line 32
    iput p1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->j:F

    .line 33
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
.end method

.method public static synthetic a(Lcom/tencent/rmonitor/natmem/NatMemHandler;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/natmem/NatMemHandler;->a(I)V

    return-void
.end method

.method private native nativeIs64Bit()Z
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    .line 8
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    const-string v1, "native_memory"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/rmonitor/natmem/NatMemHandler;->a()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 10
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "usage_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".json"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "mem_history_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    sget-object v3, Lcom/tencent/bugly/proguard/ch;->f:Ljava/lang/String;

    .line 13
    invoke-static {v2, v3, v1}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->d:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "smaps_"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".txt"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-virtual {p0, v2}, Lcom/tencent/rmonitor/natmem/NatMemHandler;->d(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/natmem/NatMemHandler;->e(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0, v1}, Lcom/tencent/rmonitor/natmem/NatMemHandler;->b(Ljava/lang/String;)V

    const/4 v3, 0x1

    if-ne v3, p1, :cond_2

    move v4, v3

    goto :goto_1

    :cond_2
    const/4 v4, 0x2

    :goto_1
    if-ne v3, p1, :cond_3

    const/4 p1, 0x4

    goto :goto_2

    :cond_3
    const/4 p1, 0x5

    .line 18
    :goto_2
    invoke-static {v0, v1, v2, v4}, Lcom/tencent/bugly/proguard/yc;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 19
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/zc;->a(Ljava/lang/String;I)V

    .line 20
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/tencent/rmonitor/common/util/FileUtil;->deleteFile(Ljava/io/File;)V

    .line 21
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/tencent/rmonitor/common/util/FileUtil;->deleteFile(Ljava/io/File;)V

    .line 22
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/tencent/rmonitor/common/util/FileUtil;->deleteFile(Ljava/io/File;)V

    return-void
.end method

.method public a(J)V
    .locals 3

    .line 23
    invoke-virtual {p0}, Lcom/tencent/rmonitor/natmem/NatMemHandler;->e()V

    long-to-float v0, p1

    .line 24
    iget-wide v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->i:J

    long-to-float v1, v1

    iget v2, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->j:F

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget-wide v0, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->b:J

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->e:Z

    if-nez v0, :cond_0

    .line 25
    iput-wide p1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->i:J

    .line 26
    new-instance p1, Lcom/tencent/rmonitor/natmem/NatMemHandler$b;

    invoke-direct {p1, p0}, Lcom/tencent/rmonitor/natmem/NatMemHandler$b;-><init>(Lcom/tencent/rmonitor/natmem/NatMemHandler;)V

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInDumpThread(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 27
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object p1

    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final a()Z
    .locals 4

    .line 2
    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    sget-object v1, Lcom/tencent/rmonitor/common/util/FileUtil;->Companion:Lcom/tencent/rmonitor/common/util/FileUtil$Companion;

    iget-object v2, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->d:Ljava/lang/String;

    const v3, 0xf731400

    invoke-virtual {v1, v2, v3}, Lcom/tencent/rmonitor/common/util/FileUtil$Companion;->deleteOvertimeFiles(Ljava/lang/String;I)V

    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    .line 7
    :goto_1
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "RMonitor_NatMem_Handler"

    invoke-virtual {v1, v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->a()Lcom/tencent/bugly/proguard/wc;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->nativeInit()I

    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v1

    .line 4
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/wc;->d()I

    move-result v2

    .line 5
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->nativeInitAppHookParameter(I)V

    .line 6
    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->sharePreference:Landroid/content/SharedPreferences;

    iput-object v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->f:Landroid/content/SharedPreferences;

    if-eqz v1, :cond_0

    .line 7
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->g:Landroid/content/SharedPreferences$Editor;

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/rmonitor/natmem/NatMemHandler;->c()V

    .line 9
    invoke-direct {p0}, Lcom/tencent/rmonitor/natmem/NatMemHandler;->nativeIs64Bit()Z

    move-result v1

    iput-boolean v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->e:Z

    if-eqz v1, :cond_1

    const-wide v1, 0x10000000000L

    .line 10
    iput-wide v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->b:J

    goto :goto_0

    :cond_1
    const-wide v1, 0xdac00000L

    .line 11
    iput-wide v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->b:J

    .line 12
    :goto_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/wc;->h()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->c:J

    .line 13
    invoke-static {}, Lcom/tencent/rmonitor/common/util/FileUtil;->getRootPath()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v1

    const-string v2, "Tencent_RMonitor"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 17
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "NatMem"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->d:Ljava/lang/String;

    .line 18
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/wc;->j()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 19
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->e()V

    return-void

    .line 20
    :cond_3
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->i()V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 5

    .line 21
    const-string v0, "RMonitor_NatMem_Handler"

    sget-boolean v1, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->g:Z

    if-eqz v1, :cond_2

    .line 22
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 23
    :try_start_0
    const-string v2, "pss"

    invoke-static {}, Lcom/tencent/bugly/proguard/ac;->l()Lcom/tencent/bugly/proguard/ac;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/ac;->j()Ljava/util/LinkedList;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    const-string v2, "vss"

    invoke-static {}, Lcom/tencent/bugly/proguard/ac;->l()Lcom/tencent/bugly/proguard/ac;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/ac;->k()Ljava/util/LinkedList;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    const-string v2, "java_heap"

    invoke-static {}, Lcom/tencent/bugly/proguard/ac;->l()Lcom/tencent/bugly/proguard/ac;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/ac;->i()Ljava/util/LinkedList;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 27
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 28
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 30
    new-instance p1, Ljava/io/BufferedOutputStream;

    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p1, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    :try_start_1
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v1}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 33
    invoke-virtual {p1}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 34
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_1
    move-exception p1

    goto :goto_3

    :catchall_2
    move-exception v1

    goto :goto_2

    :goto_1
    const/4 v1, 0x0

    move-object v4, v1

    move-object v1, p1

    move-object p1, v4

    .line 35
    :goto_2
    :try_start_3
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v2, v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-eqz p1, :cond_2

    .line 36
    :try_start_4
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_5

    .line 37
    :goto_3
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v1, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :catchall_3
    move-exception v1

    if-eqz p1, :cond_1

    .line 38
    :try_start_5
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception p1

    .line 39
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v2, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    :cond_1
    :goto_4
    throw v1

    :cond_2
    :goto_5
    return-void
.end method

.method public final c()V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->f:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->g:Landroid/content/SharedPreferences$Editor;

    if-eqz v1, :cond_1

    .line 4
    const-string v1, "sig_jmp_info_key"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {v0}, Lcom/tencent/bugly/proguard/vc;->a(I)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->g:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    return-void
.end method

.method public c(J)V
    .locals 3

    .line 7
    invoke-virtual {p0}, Lcom/tencent/rmonitor/natmem/NatMemHandler;->e()V

    long-to-float v0, p1

    .line 8
    iget-wide v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->h:J

    long-to-float v1, v1

    iget v2, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->j:F

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget-wide v0, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->c:J

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 9
    iput-wide p1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->h:J

    .line 10
    new-instance p1, Lcom/tencent/rmonitor/natmem/NatMemHandler$a;

    invoke-direct {p1, p0}, Lcom/tencent/rmonitor/natmem/NatMemHandler$a;-><init>(Lcom/tencent/rmonitor/natmem/NatMemHandler;)V

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInDumpThread(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->g:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->nativeDumpNatMemLeakInfo(Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->a()Lcom/tencent/bugly/proguard/wc;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/wc;->e()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/wc;->f()Ljava/util/List;

    move-result-object v1

    const-string v2, "libc.so"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/wc;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 5
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->nativeIgnoreLib(Ljava/lang/String;)I

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v1

    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/ac;->l()Lcom/tencent/bugly/proguard/ac;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/tencent/bugly/proguard/ac;->a(Z)J

    move-result-wide v2

    .line 8
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/wc;->j()I

    move-result v4

    .line 9
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/wc;->g()Z

    move-result v0

    .line 10
    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->nativeStartHook(JIZ)I

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/zc;->a()V

    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/vc;->a()V

    .line 13
    invoke-static {}, Lcom/tencent/bugly/proguard/ac;->l()Lcom/tencent/bugly/proguard/ac;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/ac;->a(Lcom/tencent/bugly/proguard/g9;)V

    .line 14
    invoke-static {}, Lcom/tencent/bugly/proguard/ac;->l()Lcom/tencent/bugly/proguard/ac;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/ac;->a(Lcom/tencent/bugly/proguard/h9;)V

    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/g;->a(Lcom/tencent/bugly/proguard/y9;)V

    .line 16
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v0

    .line 17
    sget-object v1, Lcom/tencent/bugly/proguard/g;->j:Lcom/tencent/bugly/proguard/g;

    .line 18
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/g;->f()Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    .line 20
    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->g:Z

    if-eqz v0, :cond_1

    .line 21
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 23
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 25
    new-instance p1, Ljava/io/File;

    const-string v1, "/proc/self/smaps"

    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/tencent/rmonitor/common/util/FileUtil;->copyFile(Ljava/io/File;Ljava/io/File;)Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 26
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_NatMem_Handler"

    invoke-virtual {v0, v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final e()V
    .locals 3

    .line 5
    invoke-static {}, Lcom/tencent/rmonitor/common/bhook/BHookManager;->a()I

    move-result v0

    .line 6
    iget-object v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->f:Landroid/content/SharedPreferences;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/tencent/rmonitor/natmem/NatMemHandler;->g:Landroid/content/SharedPreferences$Editor;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 7
    const-string v2, "sig_jmp_info_key"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->g:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/ac;->l()Lcom/tencent/bugly/proguard/ac;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/ac;->a(Z)J

    move-result-wide v1

    .line 4
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->nativeDumpNatMemUsageInfo(Ljava/lang/String;J)I

    :cond_0
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    .line 2
    iget p1, p1, Landroid/os/Message;->what:I

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    const/4 v0, 0x2

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/rmonitor/natmem/NatMemHandler;->d()V

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/rmonitor/natmem/NatMemHandler;->b()V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
