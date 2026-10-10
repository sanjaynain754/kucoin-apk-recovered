.class public Lcom/tencent/bugly/proguard/mh;
.super Lcom/tencent/bugly/proguard/sd;
.source "BUGLY"


# instance fields
.field public f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation
.end field

.field public g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lcom/tencent/bugly/proguard/ka;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/sd;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v0, Lcom/tencent/bugly/proguard/ka;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ka;-><init>()V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
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
.end method

.method private c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 12
    invoke-super {p0, p1, p2}, Lcom/tencent/bugly/proguard/sd;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "data is encoded by new version, please use get(String name, T proxy, Object defaultValue)"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p3

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/mh;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a([BLjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ka;->a([B)V

    .line 8
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 9
    iput-object v0, p1, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 10
    invoke-virtual {p1, p2, v0, v1}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public a([B)V
    .locals 3

    .line 14
    :try_start_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/sd;->a([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 15
    :catch_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ka;->a([B)V

    .line 16
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 17
    iput-object v0, p1, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 18
    new-instance p1, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/HashMap;-><init>(I)V

    const/4 v0, 0x0

    .line 19
    new-array v1, v0, [B

    const-string v2, ""

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    iget-object v1, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v1, p1, v0, v0}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/bugly/proguard/nd;
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 38
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/sd;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 39
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "data is encoded by new version, please use getByClass(String name, T proxy)"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;TT;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/bugly/proguard/nd;
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    if-eqz v0, :cond_3

    .line 16
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 17
    :cond_0
    iget-object p3, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 18
    iget-object p2, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 19
    :cond_1
    iget-object p3, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [B

    .line 20
    :try_start_0
    invoke-virtual {p0, p3, p2}, Lcom/tencent/bugly/proguard/mh;->a([BLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 21
    iget-object p3, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_2
    return-object p2

    .line 22
    :goto_0
    new-instance p2, Lcom/tencent/bugly/proguard/nd;

    invoke-direct {p2, p1}, Lcom/tencent/bugly/proguard/nd;-><init>(Ljava/lang/Exception;)V

    throw p2

    .line 23
    :cond_3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :goto_1
    return-object p3

    .line 24
    :cond_4
    iget-object p3, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 25
    iget-object p2, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 26
    :cond_5
    iget-object p3, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 27
    new-array v1, v0, [B

    .line 28
    invoke-virtual {p3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 29
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 30
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    move-object v1, p3

    check-cast v1, [B

    .line 31
    :cond_6
    :try_start_1
    iget-object p3, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {p3, v1}, Lcom/tencent/bugly/proguard/ka;->a([B)V

    .line 32
    iget-object p3, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 33
    iput-object v1, p3, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    const/4 v1, 0x1

    .line 34
    invoke-virtual {p3, p2, v0, v1}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object p2

    .line 35
    iget-object p3, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p2

    :catch_1
    move-exception p1

    .line 36
    new-instance p2, Lcom/tencent/bugly/proguard/nd;

    invoke-direct {p2, p1}, Lcom/tencent/bugly/proguard/nd;-><init>(Ljava/lang/Exception;)V

    throw p2
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    .line 2
    instance-of v0, p2, Ljava/util/Set;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/tencent/bugly/proguard/la;

    const/16 v1, 0x80

    .line 4
    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    .line 5
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 6
    iput-object v1, v0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, p2, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/Object;I)V

    .line 8
    iget-object p2, v0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 9
    invoke-static {p2}, Lcom/tencent/bugly/proguard/ma;->b(Ljava/nio/ByteBuffer;)[B

    move-result-object p2

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "can not support Set"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "put value can not is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "put key can not is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_3
    invoke-super {p0, p1, p2}, Lcom/tencent/bugly/proguard/sd;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public b([B)V
    .locals 0

    .line 48
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/sd;->a([B)V

    return-void
.end method

.method public b()[B
    .locals 3

    .line 40
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 41
    new-instance v0, Lcom/tencent/bugly/proguard/la;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    .line 42
    iget-object v2, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 43
    iput-object v2, v0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    .line 44
    iget-object v2, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    .line 45
    iget-object v0, v0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 46
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ma;->b(Ljava/nio/ByteBuffer;)[B

    move-result-object v0

    return-object v0

    .line 47
    :cond_0
    invoke-super {p0}, Lcom/tencent/bugly/proguard/sd;->b()[B

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c([B)V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ka;->a([B)V

    .line 4
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 5
    iput-object v0, p1, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 6
    new-instance p1, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/HashMap;-><init>(I)V

    const/4 v0, 0x0

    .line 7
    new-array v1, v0, [B

    const-string v2, ""

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v1, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v1, p1, v0, v0}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/bugly/proguard/nd;
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 27
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/sd;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "data is encoded by new version, please use getJceStruct(String name,T proxy)"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/bugly/proguard/nd;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object p2, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 9
    :try_start_0
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/mh;->a([BLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_2
    return-object p2

    .line 11
    :goto_0
    new-instance p2, Lcom/tencent/bugly/proguard/nd;

    invoke-direct {p2, p1}, Lcom/tencent/bugly/proguard/nd;-><init>(Ljava/lang/Exception;)V

    throw p2

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    return-object v1

    .line 13
    :cond_4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 14
    iget-object p2, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 15
    :cond_5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    .line 16
    new-array v2, v1, [B

    .line 17
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 18
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 19
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [B

    .line 20
    :cond_6
    :try_start_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/ka;->a([B)V

    .line 21
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->h:Lcom/tencent/bugly/proguard/ka;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 22
    iput-object v2, v0, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, p2, v1, v2}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object p2

    .line 24
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p2

    :catch_1
    move-exception p1

    .line 25
    new-instance p2, Lcom/tencent/bugly/proguard/nd;

    invoke-direct {p2, p1}, Lcom/tencent/bugly/proguard/nd;-><init>(Ljava/lang/Exception;)V

    throw p2
.end method

.method public d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/bugly/proguard/nd;
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    .line 14
    :cond_1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/sd;->e(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/bugly/proguard/nd;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object p2, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 8
    :try_start_0
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/mh;->a([BLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_2
    return-object p2

    .line 10
    :goto_0
    new-instance p2, Lcom/tencent/bugly/proguard/nd;

    invoke-direct {p2, p1}, Lcom/tencent/bugly/proguard/nd;-><init>(Ljava/lang/Exception;)V

    throw p2
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public f(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/bugly/proguard/nd;
        }
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-eqz p2, :cond_1

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/mh;->a([BLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 8
    :cond_1
    iget-object p2, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
