.class public Lcom/tencent/bugly/proguard/d6;
.super Lcom/tencent/bugly/proguard/z0;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/d9;


# static fields
.field public static final i:Ljava/lang/String; = "RMonitor_FdLeak_FdHeapDumper"

.field public static j:Z


# instance fields
.field public final h:Lcom/tencent/bugly/proguard/e9;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/z0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/s7;->a()Lcom/tencent/bugly/proguard/e9;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/bugly/proguard/d6;->h:Lcom/tencent/bugly/proguard/e9;

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static a(Z)V
    .locals 0

    .line 2
    sput-boolean p0, Lcom/tencent/bugly/proguard/d6;->j:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    const/4 v0, 0x3

    return v0
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 2

    .line 3
    sget-object p1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->sharePreference:Landroid/content/SharedPreferences;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 4
    const-string v1, "fd_dump_exception_count"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 5
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "onHeapDumpException count="

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RMonitor_FdLeak_FdHeapDumper"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/fb;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/i6;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d6;->h:Lcom/tencent/bugly/proguard/e9;

    if-nez v0, :cond_0

    const/16 p1, 0x6d

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/z0;->a(I)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    sget-boolean v1, Lcom/tencent/bugly/proguard/d6;->j:Z

    if-eqz v1, :cond_1

    instance-of v0, v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;

    if-nez v0, :cond_1

    const/16 p1, 0x66

    .line 4
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/z0;->a(I)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1

    return-object p1

    .line 5
    :cond_1
    new-instance v0, Lcom/tencent/bugly/proguard/r7;

    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->h()Z

    move-result v1

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->d()Lcom/tencent/bugly/proguard/m6;

    move-result-object v2

    iget v2, v2, Lcom/tencent/bugly/proguard/m6;->o:I

    .line 7
    const-string v3, ""

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/r7;-><init>(ZILjava/lang/String;)V

    .line 8
    iput-object p0, v0, Lcom/tencent/bugly/proguard/r7;->d:Lcom/tencent/bugly/proguard/d9;

    .line 9
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d6;->h:Lcom/tencent/bugly/proguard/e9;

    invoke-interface {v1, p1, v0}, Lcom/tencent/bugly/proguard/e9;->a(Ljava/lang/String;Lcom/tencent/bugly/proguard/r7;)I

    move-result v0

    if-nez v0, :cond_2

    .line 10
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/d6;->c()V

    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/z0;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1

    return-object p1

    .line 12
    :cond_2
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/z0;->a(I)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 3

    .line 13
    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->sharePreference:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    .line 14
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "fd_dump_exception_count"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method
