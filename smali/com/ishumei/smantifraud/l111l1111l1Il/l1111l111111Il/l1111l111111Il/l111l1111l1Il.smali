.class public final Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111l1Il;
.super Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l1111l111111Il;


# static fields
.field private static final l1111l111111Il:I = 0x1000


# instance fields
.field private l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l1111l111111Il;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;

    .line 6
    .line 7
    const/16 v1, 0x1000

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;-><init>(I)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111l1Il;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;

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
.end method

.method private static l1111l111111Il(I)Ljava/lang/String;
    .locals 1

    .line 2
    if-nez p0, :cond_0

    const-string p0, "GET"

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    const-string p0, "POST"

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown method type."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Ljava/util/Map;)Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il()[B

    move-result-object v0

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l11111I1l()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    if-eqz v0, :cond_a

    :cond_0
    sget-boolean v1, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l1111l1Il:Z

    if-nez v1, :cond_a

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l1111lI1l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l1111llIl()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l1111lIl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l1111lIl()Ljava/lang/String;

    move-result-object v1

    :cond_1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v3, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l11111lIl()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    const/4 p2, 0x0

    :try_start_0
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/URLConnection;

    check-cast v1, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v1, v5, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v0, p2

    move-object p2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l1111Il1l()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setDoInput(Z)V

    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setUseCaches(Z)V

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l11111I1l()I

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "GET"

    goto :goto_1

    :cond_3
    if-ne p1, v2, :cond_7

    const-string p1, "POST"

    :goto_1
    invoke-virtual {v1, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    if-eqz v0, :cond_4

    array-length p1, v0

    invoke-virtual {v1, p1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    :cond_4
    invoke-virtual {v1}, Ljava/net/URLConnection;->connect()V

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V

    :cond_5
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {v1}, Ljava/net/URLConnection;->getContentLength()I

    move-result v0

    iget-object v2, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111l1Il;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;

    invoke-static {p1, v0, v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/io/InputStream;ILcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;)[B

    move-result-object p1

    new-instance v0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    invoke-direct {v0, v2, p1}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;-><init>(I[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_6
    return-object v0

    :cond_7
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown method type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_1
    move-exception p1

    move-object v0, p2

    :goto_2
    if-eqz p2, :cond_8

    :try_start_4
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    :cond_9
    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "body is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
