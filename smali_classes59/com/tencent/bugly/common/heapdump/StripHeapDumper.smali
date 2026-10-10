.class public abstract Lcom/tencent/bugly/common/heapdump/StripHeapDumper;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/e9;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;
    }
.end annotation


# static fields
.field public static final l:Ljava/lang/String; = "RMonitor_Heap_StripHeapDumper"

.field public static m:Z

.field public static final n:[Ljava/lang/String;

.field public static final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public k:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-string v0, ".*/librmonitor_memory.so$"

    .line 3
    .line 4
    const-string v1, ".*/libBugly_Native.so$"

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->n:[Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    const/4 v1, 0x2

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 17
    .line 18
    sput-object v0, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->o:Ljava/util/Map;

    .line 19
    .line 20
    const-string v1, "libart.so"

    .line 21
    .line 22
    .line 23
    filled-new-array {v1}, [Ljava/lang/String;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    const-string/jumbo v3, "open"

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    const-string v2, "libbase.so"

    .line 33
    .line 34
    const-string v3, "libartbase.so"

    .line 35
    .line 36
    const-string v4, "libc.so"

    .line 37
    .line 38
    .line 39
    filled-new-array {v4, v1, v2, v3}, [Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    const-string/jumbo v2, "write"

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    const-string/jumbo v0, "rmonitor_base"

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/tencent/bugly/common/utils/FileUtil;->loadLibrary(Ljava/lang/String;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    sput-boolean v0, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->m:Z

    .line 56
    return-void
    .line 57
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

.method private static native nDisableHprofStrip()V
.end method

.method private static native nEnableHprofStrip(Ljava/lang/String;)V
.end method

.method private static native nSetHprofStripConfig(I)V
.end method

.method private static native nSetIgnoreHookSo(Ljava/lang/String;)V
.end method

.method private static native nSetRegisterHookSo(Ljava/lang/String;Ljava/lang/String;)V
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .line 22
    sget-boolean v0, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->m:Z

    if-eqz v0, :cond_0

    .line 23
    invoke-static {p1}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->nSetHprofStripConfig(I)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/r7;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/r7;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->nDisableHprofStrip()V

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->a(I)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/r7;Ljava/lang/Exception;)V
    .locals 0

    .line 12
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/r7;->b()Lcom/tencent/bugly/proguard/d9;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 13
    invoke-interface {p1, p2}, Lcom/tencent/bugly/proguard/d9;->a(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .line 14
    const-string/jumbo v0, "open"

    const-string v1, "libart.so"

    invoke-static {v1, v0}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->nSetRegisterHookSo(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    const-string v0, "libc.so"

    const-string/jumbo v2, "write"

    invoke-static {v0, v2}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->nSetRegisterHookSo(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-static {v1, v2}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->nSetRegisterHookSo(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    const-string v0, "libbase.so"

    invoke-static {v0, v2}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->nSetRegisterHookSo(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    const-string v0, "libartbase.so"

    invoke-static {v0, v2}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->nSetRegisterHookSo(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    const-string v0, ".*/librmonitor_memory.so$"

    invoke-static {v0}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->nSetIgnoreHookSo(Ljava/lang/String;)V

    .line 20
    const-string v0, ".*/libBugly-rqd.so$"

    invoke-static {v0}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->nSetIgnoreHookSo(Ljava/lang/String;)V

    .line 21
    invoke-static {p1}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->nEnableHprofStrip(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;)V
    .locals 1

    .line 7
    :try_start_0
    invoke-static {p1}, Landroid/os/Debug;->dumpHprofData(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p2, Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;->a:Z

    const/4 p1, 0x0

    .line 9
    iput-object p1, p2, Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;->b:Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p2, Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;->a:Z

    .line 11
    iput-object p1, p2, Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;->b:Ljava/io/IOException;

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/tencent/bugly/proguard/r7;Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->b(Ljava/lang/String;Lcom/tencent/bugly/proguard/r7;)V

    .line 5
    invoke-virtual {p0, p1, p3}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->a(Ljava/lang/String;Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;)V

    .line 6
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->a(Lcom/tencent/bugly/proguard/r7;)V

    return-void
.end method

.method public b()Landroid/os/Handler;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->k:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->getMonitorThreadLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->k:Landroid/os/Handler;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->k:Landroid/os/Handler;

    return-object v0
.end method

.method public b(Ljava/lang/String;Lcom/tencent/bugly/proguard/r7;)V
    .locals 1

    .line 4
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/r7;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->a(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/r7;->c()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->a(I)V

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->m:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverM()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
.end method
