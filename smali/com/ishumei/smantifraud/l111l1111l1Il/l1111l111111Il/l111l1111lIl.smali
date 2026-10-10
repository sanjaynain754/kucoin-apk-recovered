.class public Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111I1l;,
        Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111lIl;,
        Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l1111l111111Il;,
        Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111Il;
    }
.end annotation


# static fields
.field private static final l1111l111111Il:I = 0x4


# instance fields
.field private final l111l11111I1l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final l111l11111Il:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue<",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final l111l11111lIl:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;

.field private final l111l1111lI1l:[Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;

.field private final l111l1111lIl:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111Il;",
            ">;"
        }
    .end annotation
.end field

.field private final l111l1111llIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;

.field private final l11l1111lIIl:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111lIl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;)V
    .locals 1

    .line 2
    const/4 v0, 0x4

    invoke-direct {p0, p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;-><init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;I)V

    return-void
.end method

.method private constructor <init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;I)V
    .locals 1

    .line 3
    new-instance p2, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl;

    invoke-direct {p2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl;-><init>()V

    const/4 v0, 0x4

    invoke-direct {p0, p1, v0, p2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;-><init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;ILcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;)V

    return-void
.end method

.method private constructor <init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;ILcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111lIl:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111I1l:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111Il:Ljava/util/concurrent/PriorityBlockingQueue;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111lIl:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l11l1111lIIl:Ljava/util/List;

    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;

    new-array p1, p2, [Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;

    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111lI1l:[Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;

    iput-object p3, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111llIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;

    return-void
.end method

.method public static l1111l111111Il(Landroid/content/Context;)I
    .locals 1

    .line 1
    :try_start_0
    const-string/jumbo v0, "uimode"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/UiModeManager;

    invoke-virtual {p0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    const/4 p0, -0x1

    return p0
.end method

.method private l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111I1l;)V
    .locals 4

    .line 5
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111I1l:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111I1l:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;

    invoke-interface {p1, v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111I1l;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l1111lIIl()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111Il;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111Il<",
            "TT;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111lIl:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111lIl:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111lIl;)V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l11l1111lIIl:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l11l1111lIIl:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private l1111l111111Il(Ljava/lang/Object;)V
    .locals 1

    .line 8
    if-eqz p1, :cond_0

    new-instance v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$1;

    invoke-direct {v0, p0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$1;-><init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111I1l;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot cancelAll with a null tag"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static l111l11111I1l()Ljava/util/HashMap;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    const-class v1, Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "android.os.SystemProperties"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    const-string v3, "get"

    invoke-virtual {v1, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "ro.debuggable"

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v4, "ro.boot.hardware"

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v4, "gsm.operator.alpha"

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string/jumbo v4, "sys.usb.state"

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    return-object v0
.end method

.method private l111l11111I1l(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V

    return-void
.end method

.method private l111l11111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111Il:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static l111l11111Il()Z
    .locals 1

    .line 2
    const/4 v0, 0x1

    return v0
.end method

.method private l111l11111lIl(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111Il;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111Il<",
            "TT;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111lIl:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111lIl:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private l111l11111lIl(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl$l111l11111lIl;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l11l1111lIIl:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l11l1111lIIl:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private l111l1111l1Il()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111lIl:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 6
    move-result v0

    .line 7
    return v0
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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private l111l1111llIl()Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111llIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;

    .line 3
    return-object v0
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
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public final l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "TT;>;)",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "TT;>;"
        }
    .end annotation

    .line 2
    invoke-virtual {p1, p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;

    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111I1l:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111I1l:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111lIl:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l11111lIl(I)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;

    const-string v0, "add-to-queue"

    invoke-virtual {p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;I)V

    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111Il:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized l1111l111111Il()V
    .locals 5

    .line 3
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111lIl()V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111lI1l:[Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    new-instance v1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;

    iget-object v2, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111Il:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;

    iget-object v4, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111llIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;

    invoke-direct {v1, v2, v3, v4}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;-><init>(Ljava/util/concurrent/BlockingQueue;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "sm-http-thread"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111lI1l:[Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;

    aput-object v1, v2, v0

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v0, v3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;I)V"
        }
    .end annotation

    .line 4
    iget-object p1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l11l1111lIIl:Ljava/util/List;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l11l1111lIIl:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final l111l11111lIl()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111lI1l:[Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l1111l111111Il()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final l111l11111lIl(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111I1l:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111I1l:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111lIl:Ljava/util/List;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l1111lIl:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;I)V

    return-void

    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method
