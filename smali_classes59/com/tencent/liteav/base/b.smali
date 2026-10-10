.class public final Lcom/tencent/liteav/base/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final a:Landroid/os/StrictMode$ThreadPolicy;

.field private final b:Landroid/os/StrictMode$VmPolicy;


# direct methods
.method private constructor <init>(Landroid/os/StrictMode$ThreadPolicy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/base/b;->a:Landroid/os/StrictMode$ThreadPolicy;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/tencent/liteav/base/b;->b:Landroid/os/StrictMode$VmPolicy;

    return-void
.end method

.method private constructor <init>(Landroid/os/StrictMode$ThreadPolicy;B)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/tencent/liteav/base/b;-><init>(Landroid/os/StrictMode$ThreadPolicy;)V

    return-void
.end method

.method public static a()Lcom/tencent/liteav/base/b;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/liteav/base/b;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0, v2}, Lcom/tencent/liteav/base/b;-><init>(Landroid/os/StrictMode$ThreadPolicy;B)V

    .line 11
    return-object v1
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/base/b;->a:Landroid/os/StrictMode$ThreadPolicy;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/base/b;->b:Landroid/os/StrictMode$VmPolicy;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 15
    :cond_1
    return-void
    .line 16
    .line 17
.end method
