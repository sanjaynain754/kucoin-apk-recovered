.class public Lcom/datavisorobfus/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/datavisorobfus/n;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/datavisor/vangogh/storage/local/DVJS2Native;


# direct methods
.method static constructor <clinit>()V
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
    .line 18
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/datavisorobfus/n;->a:Landroid/content/Context;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/datavisorobfus/n;->b:Lcom/datavisor/vangogh/storage/local/DVJS2Native;

    .line 9
    .line 10
    instance-of v0, p1, Landroid/app/Application;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, Lcom/datavisorobfus/n;->a:Landroid/content/Context;

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string v0, "DVTokenClient initialization error: mContext is null or not ApplicationContext."

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p1
.end method

.method public static synthetic a(Lcom/datavisorobfus/n;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/datavisorobfus/n;->a:Landroid/content/Context;

    return-object p0
.end method

.method private a(Landroid/content/Context;)Ljava/io/RandomAccessFile;
    .locals 5

    .line 2
    const-string/jumbo v0, "rw"

    const-string v1, ".__ppsk.sys"

    const/4 v2, 0x0

    :try_start_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v3, v4, :cond_0

    invoke-virtual {p1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    return-object v2

    :cond_1
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p1, Ljava/io/RandomAccessFile;

    invoke-direct {p1, v3, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, p1

    goto :goto_2

    :goto_1
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :try_start_1
    iget-object p1, p0, Lcom/datavisorobfus/n;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/io/RandomAccessFile;

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v3, v4, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v2, v3

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :goto_2
    return-object v2
.end method

.method public static synthetic a(Lcom/datavisorobfus/n;Landroid/content/Context;)Ljava/io/RandomAccessFile;
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/datavisorobfus/n;->a(Landroid/content/Context;)Ljava/io/RandomAccessFile;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;)Lcom/datavisorobfus/n;
    .locals 2

    .line 1
    sget-object v0, Lcom/datavisorobfus/n;->c:Lcom/datavisorobfus/n;

    if-nez v0, :cond_1

    const-class v0, Lcom/datavisorobfus/n;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/datavisorobfus/n;->c:Lcom/datavisorobfus/n;

    if-nez v1, :cond_0

    new-instance v1, Lcom/datavisorobfus/n;

    invoke-direct {v1, p0}, Lcom/datavisorobfus/n;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/datavisorobfus/n;->c:Lcom/datavisorobfus/n;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lcom/datavisorobfus/n;->c:Lcom/datavisorobfus/n;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 4

    .line 4
    const-string v0, ""

    :try_start_0
    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v1

    iget-object v2, p0, Lcom/datavisorobfus/n;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/datavisorobfus/a;->h(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v1

    iget-boolean v1, v1, Lcom/datavisorobfus/i;->o:Z

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/datavisorobfus/n;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/datavisorobfus/y0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    return-object v0

    :cond_2
    return-object v1

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lcom/datavisorobfus/n;->a:Landroid/content/Context;

    const-string v3, "getDVToken"

    invoke-static {v3, v1, v2}, Lcom/datavisor/vangogh/util/ExceptionUtil;->b(Ljava/lang/String;Ljava/lang/Throwable;Landroid/content/Context;)V

    return-object v0
.end method

.method public a(Lcom/datavisor/vangogh/face/DVTokenClient$GetDVTokenListener;)V
    .locals 2

    .line 5
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/datavisorobfus/n$b;

    invoke-direct {v1, p0, p1}, Lcom/datavisorobfus/n$b;-><init>(Lcom/datavisorobfus/n;Lcom/datavisor/vangogh/face/DVTokenClient$GetDVTokenListener;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 6
    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v0

    iget-object v1, p0, Lcom/datavisorobfus/n;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/datavisorobfus/a;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/datavisorobfus/n;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/datavisorobfus/y;->a(Landroid/content/Context;)Lcom/datavisorobfus/y;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/datavisorobfus/y;->d(Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/webkit/WebView;)Z
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled",
            "AddJavascriptInterface"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 7
    :cond_0
    :try_start_0
    const-string v1, "dedge"

    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/datavisorobfus/n;->b:Lcom/datavisor/vangogh/storage/local/DVJS2Native;

    if-nez v1, :cond_1

    new-instance v1, Lcom/datavisor/vangogh/storage/local/DVJS2Native;

    iget-object v2, p0, Lcom/datavisorobfus/n;->a:Landroid/content/Context;

    invoke-direct {v1, v2, p1}, Lcom/datavisor/vangogh/storage/local/DVJS2Native;-><init>(Landroid/content/Context;Landroid/webkit/WebView;)V

    iput-object v1, p0, Lcom/datavisorobfus/n;->b:Lcom/datavisor/vangogh/storage/local/DVJS2Native;

    :cond_1
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    iget-object v1, p0, Lcom/datavisorobfus/n;->b:Lcom/datavisor/vangogh/storage/local/DVJS2Native;

    const-string v3, "dvEdgeRapahelJs2native2"

    invoke-virtual {p1, v1, v3}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v2

    :catchall_0
    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;",
            ")Z"
        }
    .end annotation

    .line 8
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/datavisorobfus/n;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;",
            ")Z"
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/datavisorobfus/h;->a:Ljava/lang/String;

    const-string v1, "Start init DV token"

    invoke-static {v0, v1}, Lcom/datavisorobfus/f0;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v0

    iget-object v1, p0, Lcom/datavisorobfus/n;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/datavisorobfus/a;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {}, Lcom/datavisorobfus/k;->a()Lcom/datavisorobfus/k;

    move-result-object v0

    iget-object v0, v0, Lcom/datavisorobfus/k;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/datavisorobfus/n$a;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/datavisorobfus/n$a;-><init>(Lcom/datavisorobfus/n;Ljava/lang/String;Ljava/lang/String;Lcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1
.end method
