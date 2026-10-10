.class public Lz3/k;
.super Ljava/lang/Object;
.source "PooledByteStreams.java"


# instance fields
.field public final a:I

.field public final b:Lz3/a;


# direct methods
.method public constructor <init>(Lz3/a;)V
    .locals 1

    const/16 v0, 0x4000

    .line 1
    invoke-direct {p0, p1, v0}, Lz3/k;-><init>(Lz3/a;I)V

    return-void
.end method

.method public constructor <init>(Lz3/a;I)V
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 4
    iput p2, p0, Lz3/k;->a:I

    .line 5
    iput-object p1, p0, Lz3/k;->b:Lz3/a;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lz3/k;->b:Lz3/a;

    .line 3
    .line 4
    iget v1, p0, Lz3/k;->a:I

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1}, Lz3/f;->get(I)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, [B

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    :goto_0
    :try_start_0
    iget v3, p0, Lz3/k;->a:I

    .line 15
    const/4 v4, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0, v4, v3}, Ljava/io/InputStream;->read([BII)I

    .line 19
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    const/4 v5, -0x1

    .line 21
    .line 22
    if-ne v3, v5, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Lz3/k;->b:Lz3/a;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0}, Lz3/f;->release(Ljava/lang/Object;)V

    .line 28
    return-wide v1

    .line 29
    .line 30
    .line 31
    :cond_0
    :try_start_1
    invoke-virtual {p2, v0, v4, v3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    int-to-long v3, v3

    .line 33
    add-long/2addr v1, v3

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    .line 37
    iget-object p2, p0, Lz3/k;->b:Lz3/a;

    .line 38
    .line 39
    .line 40
    invoke-interface {p2, v0}, Lz3/f;->release(Ljava/lang/Object;)V

    .line 41
    throw p1
    .line 42
.end method
