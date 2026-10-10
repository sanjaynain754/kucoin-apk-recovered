.class public abstract Lcom/tencent/bugly/proguard/z0;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/x8;


# static fields
.field public static final g:Ljava/lang/String; = "RMonitor_FdLeak_BaseFdLeakDumper"


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


# virtual methods
.method public a(I)Lcom/tencent/bugly/proguard/i6;
    .locals 1

    .line 10
    invoke-interface {p0}, Lcom/tencent/bugly/proguard/x8;->a()I

    move-result v0

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/i6;->a(II)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1

    return-object p1
.end method

.method public a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/i6;
    .locals 2

    .line 8
    invoke-interface {p0}, Lcom/tencent/bugly/proguard/x8;->a()I

    move-result v0

    .line 9
    new-instance v1, Lcom/tencent/bugly/proguard/i6;

    invoke-direct {v1, v0, p1, p2}, Lcom/tencent/bugly/proguard/i6;-><init>(IILjava/lang/String;)V

    return-object v1
.end method

.method public a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/i6;
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/z0;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 3
    const-string v2, "RMonitor_FdLeak_BaseFdLeakDumper"

    const-string v3, "dump failed due to invalid file path"

    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/fb;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x3

    .line 4
    invoke-virtual {p0, v2, p1}, Lcom/tencent/bugly/proguard/z0;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/z0;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1

    .line 6
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    invoke-virtual {p1, v2, v3}, Lcom/tencent/bugly/proguard/i6;->a(J)V

    return-object p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/bugly/proguard/i6;
    .locals 2

    .line 7
    new-instance v0, Lcom/tencent/bugly/proguard/i6;

    invoke-interface {p0}, Lcom/tencent/bugly/proguard/x8;->a()I

    move-result v1

    invoke-direct {v0, v1, p1, p2}, Lcom/tencent/bugly/proguard/i6;-><init>(ILjava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 2

    .line 2
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result p1

    return p1

    .line 5
    :cond_0
    invoke-static {p1}, Lcom/tencent/rmonitor/common/util/FileUtil;->createFile(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public abstract c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/i6;
.end method
