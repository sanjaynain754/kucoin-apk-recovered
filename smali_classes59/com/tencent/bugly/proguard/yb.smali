.class public Lcom/tencent/bugly/proguard/yb;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_Heap_MemoryDumpHelper"

.field public static final b:Lcom/tencent/bugly/proguard/e9;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/s7;->a()Lcom/tencent/bugly/proguard/e9;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/proguard/yb;->b:Lcom/tencent/bugly/proguard/e9;

    .line 7
    return-void
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

.method public static a(Ljava/lang/String;Lcom/tencent/bugly/proguard/e9;ZI)Landroid/util/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/e9;",
            "ZI)",
            "Landroid/util/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "/"

    .line 1
    const-string v1, ""

    if-nez p1, :cond_0

    .line 2
    new-instance p0, Landroid/util/Pair;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p0, p1, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    .line 3
    :cond_0
    const-class v2, Lcom/tencent/bugly/proguard/yb;

    monitor-enter v2

    .line 4
    :try_start_0
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v4, "RMonitor_Heap_MemoryDumpHelper"

    const-string v5, "ReportLog dumpHprof: "

    filled-new-array {v4, v5, p0}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string/jumbo v6, "yy-MM-dd_HH.mm.ss"

    invoke-static {v4, v5, v6}, Lcom/tencent/bugly/proguard/ic;->a(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v5

    .line 7
    const-string/jumbo v6, "mounted"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    .line 8
    new-instance v1, Ljava/io/File;

    .line 9
    sget-object v5, Lcom/tencent/bugly/proguard/ic;->b:Ljava/lang/String;

    .line 10
    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_1

    .line 12
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_4

    .line 13
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 14
    const-string v5, "/"

    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 16
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "dump_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "_"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".hprof"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    if-eqz p2, :cond_3

    if-lez p3, :cond_3

    .line 18
    new-instance p0, Lcom/tencent/bugly/proguard/r7;

    .line 19
    const-string v0, ""

    invoke-direct {p0, p2, p3, v0}, Lcom/tencent/bugly/proguard/r7;-><init>(ZILjava/lang/String;)V

    .line 20
    invoke-interface {p1, v1, p0}, Lcom/tencent/bugly/proguard/e9;->a(Ljava/lang/String;Lcom/tencent/bugly/proguard/r7;)I

    move-result p0

    if-nez p0, :cond_4

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_2

    .line 21
    :cond_3
    new-instance p0, Lcom/tencent/bugly/proguard/r7;

    .line 22
    invoke-direct {p0, v6, v6}, Lcom/tencent/bugly/proguard/r7;-><init>(ZI)V

    .line 23
    invoke-interface {p1, v1, p0}, Lcom/tencent/bugly/proguard/e9;->a(Ljava/lang/String;Lcom/tencent/bugly/proguard/r7;)I

    move-result p0

    if-nez p0, :cond_4

    :goto_1
    const/4 v6, 0x1

    .line 24
    :cond_4
    const-string p0, "RMonitor_Heap_MemoryDumpHelper"

    const-string p1, "dump used "

    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    sub-long/2addr p2, v4

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    const-string p3, " ms"

    filled-new-array {p0, p1, p2, p3}, [Ljava/lang/String;

    move-result-object p0

    .line 26
    invoke-virtual {v3, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    .line 27
    :goto_2
    :try_start_2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "RMonitor_Heap_MemoryDumpHelper"

    invoke-virtual {p1, p2, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    :cond_5
    :goto_3
    new-instance p0, Landroid/util/Pair;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    monitor-exit v2

    return-object p0

    .line 29
    :goto_4
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;ZZLcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;ZI)Lcom/tencent/rmonitor/base/meta/DumpResult;
    .locals 2

    if-eqz p4, :cond_0

    .line 30
    invoke-interface {p4, p0}, Lcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;->onPrepareDump(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    :cond_1
    new-instance v1, Lcom/tencent/rmonitor/base/meta/DumpResult;

    invoke-direct {v1}, Lcom/tencent/rmonitor/base/meta/DumpResult;-><init>()V

    if-eqz p2, :cond_5

    .line 33
    sget-object p2, Lcom/tencent/bugly/proguard/yb;->b:Lcom/tencent/bugly/proguard/e9;

    invoke-static {p0, p2, p5, p6}, Lcom/tencent/bugly/proguard/yb;->a(Ljava/lang/String;Lcom/tencent/bugly/proguard/e9;ZI)Landroid/util/Pair;

    move-result-object p2

    if-eqz p4, :cond_2

    .line 34
    invoke-interface {p4, p0}, Lcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;->onHprofDumped(Ljava/lang/String;)V

    .line 35
    :cond_2
    iget-object p5, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p5

    iput-boolean p5, v1, Lcom/tencent/rmonitor/base/meta/DumpResult;->success:Z

    if-eqz p5, :cond_3

    .line 36
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz p2, :cond_3

    .line 37
    check-cast p2, Ljava/lang/String;

    .line 38
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    new-instance p5, Ljava/io/File;

    invoke-direct {p5, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5}, Ljava/io/File;->length()J

    move-result-wide p5

    iput-wide p5, v1, Lcom/tencent/rmonitor/base/meta/DumpResult;->hprofFileSize:J

    .line 40
    iput-object p2, v1, Lcom/tencent/rmonitor/base/meta/DumpResult;->hprofPath:Ljava/lang/String;

    goto :goto_1

    :cond_3
    if-eqz p4, :cond_4

    const/4 p1, 0x0

    .line 41
    const-string p2, ""

    invoke-interface {p4, p1, p0, p2}, Lcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;->onFinishDump(ZLjava/lang/String;Ljava/lang/String;)V

    .line 42
    :cond_4
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "RMonitor_Heap_MemoryDumpHelper"

    const-string p3, "generateHprof error "

    filled-new-array {p2, p3, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-object v1

    :cond_5
    :goto_1
    if-eqz p3, :cond_6

    .line 43
    invoke-static {v0}, Lcom/tencent/bugly/proguard/yb;->a(Ljava/util/List;)V

    .line 44
    :cond_6
    invoke-static {p0, p1, p4, v0, v1}, Lcom/tencent/bugly/proguard/yb;->a(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;Ljava/util/List;Lcom/tencent/rmonitor/base/meta/DumpResult;)V

    return-object v1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;Ljava/util/List;Lcom/tencent/rmonitor/base/meta/DumpResult;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/rmonitor/base/meta/DumpResult;",
            ")V"
        }
    .end annotation

    .line 45
    invoke-static {p3, p1}, Lcom/tencent/bugly/proguard/ic;->a(Ljava/util/List;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p1

    .line 46
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p4, Lcom/tencent/rmonitor/base/meta/DumpResult;->success:Z

    .line 47
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iput-object p1, p4, Lcom/tencent/rmonitor/base/meta/DumpResult;->zipFilePath:Ljava/lang/String;

    .line 48
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 49
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    const-string v7, ",dumpPath="

    iget-object v8, p4, Lcom/tencent/rmonitor/base/meta/DumpResult;->zipFilePath:Ljava/lang/String;

    const-string v1, "RMonitor_Heap_MemoryDumpHelper"

    const-string v2, "leakFlag=true"

    const-string v3, ",ZipFile="

    const-string v5, ",leakName="

    move-object v6, p0

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object p0

    .line 50
    invoke-virtual {p1, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 51
    iget-boolean p0, p4, Lcom/tencent/rmonitor/base/meta/DumpResult;->success:Z

    iget-object p1, p4, Lcom/tencent/rmonitor/base/meta/DumpResult;->zipFilePath:Ljava/lang/String;

    invoke-interface {p2, p0, v6, p1}, Lcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;->onFinishDump(ZLjava/lang/String;Ljava/lang/String;)V

    .line 52
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 53
    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 55
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 56
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverJellyBean()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    .line 57
    const-string v1, "android.permission.READ_LOGS"

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/q4;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 58
    invoke-static {v0}, Lcom/tencent/rmonitor/common/logcat/LogcatManager;->initLogcat(I)Lcom/tencent/rmonitor/common/logcat/ILogcat;

    move-result-object v0

    .line 59
    const-string v1, "-v"

    const-string/jumbo v2, "threadtime"

    const-string v3, "-t"

    const-string v4, "100"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/tencent/rmonitor/common/logcat/ILogcat;->setArgs([Ljava/lang/String;)V

    .line 60
    invoke-interface {v0}, Lcom/tencent/rmonitor/common/logcat/ILogcat;->getLogcatFile()Ljava/lang/String;

    move-result-object v0

    .line 61
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 62
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
