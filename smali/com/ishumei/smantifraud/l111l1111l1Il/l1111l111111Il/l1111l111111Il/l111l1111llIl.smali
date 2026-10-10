.class public abstract Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;
.super Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final l111l11111I1l:Ljava/lang/String;

.field private static l111l11111lIl:Ljava/lang/String; = "utf-8"


# instance fields
.field protected l1111l111111Il:Ljava/lang/String;

.field private final l111l11111Il:Ljava/lang/Object;

.field private l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "utf-8"

    .line 4
    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    const-string v1, "application/json; charset=%s"

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sput-object v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l111l11111I1l:Ljava/lang/String;

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l1111l111111Il;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl<",
            "TT;>;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l1111l111111Il;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3, p6}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l1111l111111Il;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l111l11111Il:Ljava/lang/Object;

    iput-object p5, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;

    iput-object p4, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l1111l111111Il:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l1111l111111Il;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl<",
            "TT;>;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l1111l111111Il;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    const/4 v1, -0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l1111l111111Il;)V

    return-void
.end method


# virtual methods
.method public abstract l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111llIl;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111llIl;",
            ")",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl<",
            "TT;>;"
        }
    .end annotation
.end method

.method public final l1111l111111Il(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l111l11111Il:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;->l1111l111111Il(Ljava/lang/Object;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public l1111l111111Il()[B
    .locals 3

    .line 2
    const-string/jumbo v0, "utf-8"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l1111l111111Il:Ljava/lang/String;

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    iget-object v2, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l1111l111111Il:Ljava/lang/String;

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "Unsupported Encoding while trying to get the bytes of %s using %s"

    invoke-static {v2, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;->l111l11111Il(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method public final l11l1111I1l()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l111l11111I1l:Ljava/lang/String;

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

.method public final l11l1111I1ll()[B
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l1111l111111Il()[B

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public final l11l1111Il()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l111l11111I1l:Ljava/lang/String;

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

.method public final l11l1111lIIl()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l1111lIIl()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l111l11111Il:Ljava/lang/Object;

    .line 6
    monitor-enter v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    :try_start_0
    iput-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;->l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;

    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
