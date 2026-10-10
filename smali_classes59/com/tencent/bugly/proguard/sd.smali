.class public Lcom/tencent/bugly/proguard/sd;
.super Ljava/lang/Object;
.source "BUGLY"


# instance fields
.field public a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;>;"
        }
    .end annotation
.end field

.field public b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/String;

.field public e:Lcom/tencent/bugly/proguard/ka;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/sd;->b:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/bugly/proguard/sd;->c:Ljava/util/HashMap;

    .line 25
    .line 26
    const-string v0, "GBK"

    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 29
    .line 30
    new-instance v0, Lcom/tencent/bugly/proguard/ka;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ka;-><init>()V

    .line 34
    .line 35
    iput-object v0, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    .line 36
    return-void
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


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
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

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p2

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object p2, p0, Lcom/tencent/bugly/proguard/sd;->c:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    .line 7
    new-array v2, v1, [B

    .line 8
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 9
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 10
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    goto :goto_0

    .line 11
    :cond_2
    const-string v0, ""

    move-object v4, v2

    move-object v2, v0

    move-object v0, v4

    .line 12
    :goto_0
    :try_start_0
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/sd;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 13
    iget-object v3, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v3, v0}, Lcom/tencent/bugly/proguard/ka;->a([B)V

    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    iget-object v3, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 15
    iput-object v3, v0, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    const/4 v3, 0x1

    .line 16
    invoke-virtual {v0, v2, v1, v3}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v0

    .line 17
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/sd;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/sd;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p2
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final a(Ljava/util/ArrayList;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "java.util.List"

    const-string v3, "?"

    if-eqz v0, :cond_2

    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "byte"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 22
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_0

    .line 23
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/sd;->a(Ljava/util/ArrayList;Ljava/lang/Object;)V

    return-void

    .line 25
    :cond_0
    const-string p2, "Array"

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "only byte[] is supported"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 28
    :cond_2
    instance-of v0, p2, Ljava/lang/reflect/Array;

    if-nez v0, :cond_7

    .line 29
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_4

    .line 30
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    check-cast p2, Ljava/util/List;

    .line 32
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 33
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/sd;->a(Ljava/util/ArrayList;Ljava/lang/Object;)V

    return-void

    .line 34
    :cond_3
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 35
    :cond_4
    instance-of v0, p2, Ljava/util/Map;

    if-eqz v0, :cond_6

    .line 36
    const-string v0, "java.util.Map"

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    check-cast p2, Ljava/util/Map;

    .line 38
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 39
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 41
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/sd;->a(Ljava/util/ArrayList;Ljava/lang/Object;)V

    return-void

    .line 44
    :cond_5
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 46
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 47
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "can not support Array, please use List"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a([B)V
    .locals 4

    .line 48
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ka;->a([B)V

    .line 49
    iget-object p1, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 50
    iput-object v0, p1, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 51
    new-instance p1, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 52
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    const/4 v0, 0x0

    .line 53
    new-array v2, v0, [B

    const-string v3, ""

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    invoke-virtual {p1, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v1, p1, v0, v0}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5
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

    .line 19
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 21
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 22
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    const/4 v2, 0x0

    .line 23
    new-array v3, v2, [B

    .line 24
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 25
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 26
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [B

    .line 27
    :cond_2
    :try_start_0
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/sd;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 28
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v1, v3}, Lcom/tencent/bugly/proguard/ka;->a([B)V

    .line 29
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    iget-object v3, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 30
    iput-object v3, v1, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    const/4 v3, 0x1

    .line 31
    invoke-virtual {v1, v0, v2, v3}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v0

    .line 32
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/sd;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    new-instance v0, Lcom/tencent/bugly/proguard/nd;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/nd;-><init>(Ljava/lang/Exception;)V

    throw v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    .line 1
    instance-of v0, p2, Ljava/util/Set;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/la;

    const/16 v1, 0x80

    .line 3
    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 5
    iput-object v1, v0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p2, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/Object;I)V

    .line 7
    iget-object v0, v0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 8
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ma;->b(Ljava/nio/ByteBuffer;)[B

    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    invoke-virtual {p0, v3, p2}, Lcom/tencent/bugly/proguard/sd;->a(Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 12
    invoke-static {v3}, Lcom/tencent/bugly/proguard/f1;->a(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p2

    .line 13
    invoke-virtual {v1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    iget-object p2, p0, Lcom/tencent/bugly/proguard/sd;->c:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    iget-object p2, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "can not support Set"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "put value can not is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "put key can not is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()[B
    .locals 3

    .line 35
    new-instance v0, Lcom/tencent/bugly/proguard/la;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    .line 36
    iget-object v2, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 37
    iput-object v2, v0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    .line 38
    iget-object v2, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    .line 39
    iget-object v0, v0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 40
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ma;->b(Ljava/nio/ByteBuffer;)[B

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/f1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->b:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5
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

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [B

    .line 7
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 8
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 9
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [B

    .line 10
    :cond_2
    :try_start_0
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/sd;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v1, v3}, Lcom/tencent/bugly/proguard/ka;->a([B)V

    .line 12
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    iget-object v3, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 13
    iput-object v3, v1, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 14
    check-cast v0, Lcom/tencent/bugly/proguard/JceStruct;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Lcom/tencent/bugly/proguard/ka;->a(Lcom/tencent/bugly/proguard/JceStruct;IZ)Lcom/tencent/bugly/proguard/JceStruct;

    move-result-object v0

    .line 15
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/sd;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    new-instance v0, Lcom/tencent/bugly/proguard/nd;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/nd;-><init>(Ljava/lang/Exception;)V

    throw v0
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
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4
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

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 4
    new-array v1, v0, [B

    .line 5
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    .line 6
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 7
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    goto :goto_0

    .line 8
    :cond_1
    const-string p1, ""

    move-object v3, v1

    move-object v1, p1

    move-object p1, v3

    .line 9
    :goto_0
    :try_start_0
    invoke-static {v1}, Lcom/tencent/bugly/proguard/f1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    invoke-virtual {v2, p1}, Lcom/tencent/bugly/proguard/ka;->a([B)V

    .line 11
    iget-object p1, p0, Lcom/tencent/bugly/proguard/sd;->e:Lcom/tencent/bugly/proguard/ka;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 12
    iput-object v2, p1, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    const/4 v2, 0x1

    .line 13
    invoke-virtual {p1, v1, v0, v2}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    new-instance v0, Lcom/tencent/bugly/proguard/nd;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/nd;-><init>(Ljava/lang/Exception;)V

    throw v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    return-void
.end method
