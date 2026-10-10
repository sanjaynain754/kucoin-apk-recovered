.class final Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;
    }
.end annotation


# static fields
.field private static final l1111l111111Il:I = 0xbb8


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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

.method public static l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Ljava/lang/Exception;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;",
            "Ljava/lang/Exception;",
            ")",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    const/4 v1, 0x0

    if-nez v0, :cond_4

    instance-of v0, p1, Ljava/net/ConnectException;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/net/UnknownHostException;

    if-nez v0, :cond_3

    instance-of v0, p1, Ljava/net/MalformedURLException;

    if-nez v0, :cond_2

    instance-of p0, p1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    if-eqz p0, :cond_1

    new-instance p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    const-string v0, "VolleyError"

    check-cast p1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    invoke-direct {p0, v0, p1, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;-><init>(Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;B)V

    return-object p0

    :cond_1
    new-instance p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    new-instance v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    const/4 v2, -0x4

    invoke-direct {v0, p1, v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;-><init>(Ljava/lang/Throwable;I)V

    const-string p1, "network"

    invoke-direct {p0, p1, v0, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;-><init>(Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;B)V

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad URL "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l1111lI1l()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    new-instance p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    const/4 v0, -0x1

    invoke-direct {p0, p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;-><init>(Ljava/lang/Throwable;I)V

    throw p0

    :cond_4
    :goto_0
    new-instance p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    new-instance p1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    const/4 v0, -0x2

    invoke-direct {p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;-><init>(I)V

    const-string/jumbo v0, "socket"

    invoke-direct {p0, v0, p1, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;-><init>(Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;B)V

    return-object p0
.end method

.method private static l1111l111111Il(JLcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;[BI)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;[BI)V"
        }
    .end annotation

    .line 2
    sget-boolean v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;->l1111l111111Il:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0xbb8

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    if-eqz p3, :cond_2

    array-length p1, p3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_2
    const-string p1, "null"

    :goto_1
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l1111Ill()Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1l;

    move-result-object p4

    invoke-interface {p4}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1l;->l111l11111lIl()I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    filled-new-array {p2, p0, p1, p3, p4}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"

    invoke-static {p1, p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;->l111l11111lIl(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l1111Ill()Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1l;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l1111Il1l()I

    move-result v1

    :try_start_0
    invoke-static {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1l;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;)V
    :try_end_0
    .catch Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l111l11111lIl(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%s-retry [timeout=%s]"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    invoke-static {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l111l11111lIl(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "%s-timeout-giveup [timeout=%s]"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/lang/String;)V

    throw v0
.end method

.method public static l1111l111111Il(Ljava/io/InputStream;ILcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;)[B
    .locals 5

    .line 4
    const-string v0, "Error occurred when closing InputStream"

    new-instance v1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;

    invoke-direct {v1, p2, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;-><init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;I)V

    const/16 p1, 0x400

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p2, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;->l1111l111111Il(I)[B

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    invoke-virtual {p0, p1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    invoke-virtual {v1, p1, v2, v3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;->write([BII)V

    goto :goto_0

    :catchall_0
    move-exception v3

    goto :goto_2

    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    new-array p0, v2, [Ljava/lang/Object;

    invoke-static {v0, p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;->l1111l111111Il(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {p2, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;->l1111l111111Il([B)V

    invoke-virtual {v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;->close()V

    return-object v3

    :catchall_1
    move-exception v3

    const/4 p1, 0x0

    :goto_2
    if-eqz p0, :cond_1

    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :catch_1
    new-array p0, v2, [Ljava/lang/Object;

    invoke-static {v0, p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;->l1111l111111Il(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_3
    invoke-virtual {p2, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;->l1111l111111Il([B)V

    invoke-virtual {v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;->close()V

    throw v3
.end method
