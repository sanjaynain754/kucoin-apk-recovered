.class public Lcom/datavisorobfus/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/datavisorobfus/p;


# instance fields
.field private a:Landroid/content/Context;

.field private b:J


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
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/datavisorobfus/p;->a:Landroid/content/Context;

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/datavisorobfus/p;->b:J

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, Lcom/datavisorobfus/p;->a:Landroid/content/Context;

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/datavisorobfus/p;->b:J

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string v0, "DbgDetect initialization error: mContext is null."

    .line 22
    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    throw p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public static a(Landroid/content/Context;)Lcom/datavisorobfus/p;
    .locals 2

    .line 1
    sget-object v0, Lcom/datavisorobfus/p;->c:Lcom/datavisorobfus/p;

    if-nez v0, :cond_1

    const-class v0, Lcom/datavisorobfus/x;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/datavisorobfus/p;->c:Lcom/datavisorobfus/p;

    if-nez v1, :cond_0

    new-instance v1, Lcom/datavisorobfus/p;

    invoke-direct {v1, p0}, Lcom/datavisorobfus/p;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/datavisorobfus/p;->c:Lcom/datavisorobfus/p;

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
    sget-object p0, Lcom/datavisorobfus/p;->c:Lcom/datavisorobfus/p;

    return-object p0
.end method

.method private a()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/datavisorobfus/p;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/datavisorobfus/p;->b:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/datavisorobfus/p;->b:J

    :cond_0
    return-void
.end method

.method private b()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-wide v0, p0, Lcom/datavisorobfus/p;->b:J

    .line 9
    .line 10
    const-wide/16 v2, 0x2

    .line 11
    or-long/2addr v0, v2

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/datavisorobfus/p;->b:J

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/datavisorobfus/p;->b:J

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/datavisorobfus/p;->a()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/datavisorobfus/p;->b()V

    .line 11
    .line 12
    iget-wide v0, p0, Lcom/datavisorobfus/p;->b:J

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
.end method
