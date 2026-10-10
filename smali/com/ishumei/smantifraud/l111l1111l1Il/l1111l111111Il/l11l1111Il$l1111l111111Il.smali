.class final Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l1111l111111Il"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;
    }
.end annotation


# static fields
.field public static final l1111l111111Il:Z

.field private static final l111l11111lIl:J


# instance fields
.field private final l111l11111I1l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;",
            ">;"
        }
    .end annotation
.end field

.field private l111l11111Il:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;->l1111l111111Il:Z

    .line 3
    .line 4
    sput-boolean v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l1111l111111Il:Z

    .line 5
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111I1l:Ljava/util/List;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111Il:Z

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private l1111l111111Il()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111I1l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111I1l:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;

    iget-wide v0, v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;->l111l11111I1l:J

    iget-object v2, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111I1l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;

    iget-wide v2, v2, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;->l111l11111I1l:J

    sub-long/2addr v2, v0

    return-wide v2
.end method


# virtual methods
.method public final finalize()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111Il:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "Request on the loose"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l1111l111111Il(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    new-array v0, v0, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "Marker log finalized without finish() - uncaught exit point for request"

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;->l111l11111I1l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final declared-synchronized l1111l111111Il(Ljava/lang/String;)V
    .locals 8

    .line 2
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111Il:Z

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111I1l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    if-nez v1, :cond_0

    move-wide v0, v3

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111I1l:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;

    iget-wide v5, v1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;->l111l11111I1l:J

    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111I1l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v0

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;

    iget-wide v0, v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;->l111l11111I1l:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long/2addr v0, v5

    :goto_0
    cmp-long v3, v0, v3

    if-gtz v3, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v3, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111I1l:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;

    iget-wide v2, v2, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;->l111l11111I1l:J

    const-string v4, "(%-4d ms) %s"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;->l111l11111lIl(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111I1l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;

    iget-wide v4, v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;->l111l11111I1l:J

    const-string v1, "(+%-4d) [%2d] %s"

    sub-long v2, v4, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v6, v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;->l111l11111lIl:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v0, v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;->l1111l111111Il:Ljava/lang/String;

    filled-new-array {v2, v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;->l111l11111lIl(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-wide v2, v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    monitor-exit p0

    return-void

    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized l1111l111111Il(Ljava/lang/String;J)V
    .locals 7

    .line 3
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111Il:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il;->l111l11111I1l:Ljava/util/List;

    new-instance v1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    move-object v2, p1

    move-wide v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il$l1111l111111Il$l1111l111111Il;-><init>(Ljava/lang/String;JJ)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Marker added to finished log"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
