.class public final Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;
.super Ljava/lang/Object;


# static fields
.field private static l1111l111111Il:Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;


# instance fields
.field private l111l11111I1l:Z

.field private l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l111l11111I1l:Z

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static declared-synchronized l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;
    .locals 2

    .line 1
    const-class v0, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il:Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;

    if-nez v1, :cond_0

    new-instance v1, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;

    invoke-direct {v1}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;-><init>()V

    sput-object v1, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il:Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l1111l111111Il:Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final declared-synchronized l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;)V"
        }
    .end annotation

    .line 2
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l111l11111I1l:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;->l111l11111lIl()Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;

    move-result-object v0

    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;

    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l1111l111111Il()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l111l11111I1l:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;

    invoke-virtual {v0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized l111l11111lIl()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111lIl()V

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111l1Il;->l111l11111I1l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
