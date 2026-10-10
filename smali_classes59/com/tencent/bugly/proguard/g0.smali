.class public Lcom/tencent/bugly/proguard/g0;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final c:Ljava/lang/String; = "RMonitor_launch_Span"


# instance fields
.field public final a:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/tencent/bugly/proguard/dh;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/tencent/bugly/proguard/g0;->b:Ljava/lang/String;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/g0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/dh;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/g0;->b:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/g0;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/dh;

    move-result-object p2

    invoke-direct {v0, v1, p1, p2}, Lcom/tencent/bugly/proguard/dh;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/dh;)V

    .line 3
    iget-object p1, p0, Lcom/tencent/bugly/proguard/g0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 9

    .line 8
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/g0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 9
    :cond_0
    new-instance v1, Lcom/tencent/bugly/proguard/dh;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/g0;->b:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/g0;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/dh;

    move-result-object v4

    move-object v3, p1

    move-wide v5, p3

    move-wide v7, p5

    invoke-direct/range {v1 .. v8}, Lcom/tencent/bugly/proguard/dh;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/dh;JJ)V

    .line 10
    iget-object p1, p0, Lcom/tencent/bugly/proguard/g0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 5

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    const-string v2, "RMonitor_launch_Span"

    if-eqz v0, :cond_0

    .line 5
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v0, "spanStart, spanName is empty."

    filled-new-array {v2, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v1

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/g0;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/dh;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v3, "spanStart, span["

    const-string v4, "] has appended before."

    filled-new-array {v2, v3, p1, v4}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public b()J
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide v1, 0x7fffffffffffffffL

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/proguard/dh;

    .line 2
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/dh;->a()J

    move-result-wide v4

    cmp-long v4, v4, v1

    if-gez v4, :cond_0

    .line 3
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/dh;->a()J

    move-result-wide v1

    goto :goto_0

    :cond_1
    return-wide v1
.end method

.method public b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/dh;
    .locals 4

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/dh;

    if-eqz v2, :cond_1

    .line 6
    iget-object v3, v2, Lcom/tencent/bugly/proguard/dh;->c:Ljava/lang/String;

    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_2
    return-object v1
.end method

.method public c()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/dh;",
            ">;"
        }
    .end annotation

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    iget-object v1, p0, Lcom/tencent/bugly/proguard/g0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/dh;

    .line 8
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/dh;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 9
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "RMonitor_launch_Span"

    if-eqz v0, :cond_0

    .line 2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v0, "spanEnd, spanName is empty."

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/g0;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/dh;

    move-result-object v0

    if-nez v0, :cond_1

    .line 4
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v2, "spanEnd, span["

    const-string v3, "] not exist."

    filled-new-array {v1, v2, p1, v3}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/dh;->c()V

    return-void
.end method
