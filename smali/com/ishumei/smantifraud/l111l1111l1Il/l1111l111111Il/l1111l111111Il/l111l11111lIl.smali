.class public Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;


# instance fields
.field private final l1111l111111Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l1111l111111Il;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l1111l111111Il;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l1111l111111Il;

    return-void
.end method

.method public static l1111l111111Il(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static l1111l111111Il(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-static {p0, p1, p3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static l1111l111111Il(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 1

    .line 4
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static varargs l1111l111111Il(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 5
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static l1111l111111Il(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {v0, p0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static l1111l111111Il(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 7
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p1, p0, p3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static l1111l111111Il(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    .line 8
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :try_start_1
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_0
    throw v0
.end method

.method private static l1111l111111Il(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class;",
            ")",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 9
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :try_start_1
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_0
    throw v0
.end method

.method private static l1111l111111Il(Ljava/lang/Class;)[Ljava/lang/reflect/Field;
    .locals 0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0
.end method

.method private static l1111l111111Il(Ljava/lang/Object;)[Ljava/lang/reflect/Field;
    .locals 0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0
.end method

.method private static l1111l111111Il(Ljava/lang/String;)[Ljava/lang/reflect/Field;
    .locals 0

    .line 12
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0
.end method

.method public static l111l11111lIl(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static l111l11111lIl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;)",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Z)V

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l1111l111111Il;

    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-virtual {v0, p1, v4}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l1111l111111Il;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Ljava/util/Map;)Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;->l111l11111I1l()[B

    move-result-object v4

    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;->l1111l111111Il()I

    move-result v6

    if-nez v4, :cond_0

    new-array v4, v3, [B

    :cond_0
    move-object v7, v4

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_3

    :goto_1
    const/16 v0, 0xc8

    if-lt v6, v0, :cond_3

    const/16 v0, 0x12b

    if-gt v6, v0, :cond_3

    new-instance v5, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111llIl;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    sub-long v9, v8, v1

    const/4 v11, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111llIl;-><init>(I[BZJLjava/util/List;)V

    invoke-virtual {p1, v5}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111llIl;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;

    move-result-object v0

    const-string v4, "network-parse-complete"

    invoke-virtual {p1, v4}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;->l1111l111111Il()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v0, v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/Exception;

    const-string v4, ""

    invoke-direct {v0, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    :goto_2
    throw v0

    :cond_2
    return-object v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    const/4 v4, 0x1

    invoke-virtual {p1, v4}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Z)V

    instance-of v4, v0, Ljava/lang/IllegalArgumentException;

    if-eqz v4, :cond_5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "body is null"

    invoke-static {v4, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_4

    :cond_4
    check-cast v0, Ljava/lang/IllegalArgumentException;

    throw v0

    :cond_5
    :goto_4
    instance-of v4, v0, Ljava/net/SocketTimeoutException;

    if-nez v4, :cond_a

    instance-of v4, v0, Ljava/net/ConnectException;

    if-eqz v4, :cond_6

    goto :goto_5

    :cond_6
    instance-of v4, v0, Ljava/net/UnknownHostException;

    if-nez v4, :cond_9

    instance-of v4, v0, Ljava/net/MalformedURLException;

    if-nez v4, :cond_8

    instance-of v4, v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    if-eqz v4, :cond_7

    new-instance v4, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    const-string v5, "VolleyError"

    check-cast v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    invoke-direct {v4, v5, v0, v3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;-><init>(Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;B)V

    goto :goto_6

    :cond_7
    new-instance v4, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    new-instance v5, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    const/4 v6, -0x4

    invoke-direct {v5, v0, v6}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;-><init>(Ljava/lang/Throwable;I)V

    const-string v0, "network"

    invoke-direct {v4, v0, v5, v3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;-><init>(Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;B)V

    goto :goto_6

    :cond_8
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bad URL "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l1111lI1l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_9
    new-instance p1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    const/4 v1, -0x1

    invoke-direct {p1, v0, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;-><init>(Ljava/lang/Throwable;I)V

    throw p1

    :cond_a
    :goto_5
    new-instance v4, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    new-instance v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    const/4 v5, -0x2

    invoke-direct {v0, v5}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;-><init>(I)V

    const-string/jumbo v5, "socket"

    invoke-direct {v4, v5, v0, v3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;-><init>(Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;B)V

    :goto_6
    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l1111Ill()Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1l;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l1111Il1l()I

    move-result v5

    :try_start_1
    invoke-static {v4}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    move-result-object v6

    invoke-interface {v0, v6}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1l;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;)V
    :try_end_1
    .catch Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll; {:try_start_1 .. :try_end_1} :catch_1

    invoke-static {v4}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l111l11111lIl(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v0

    const-string v4, "%s-retry [timeout=%s]"

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/lang/String;)V

    goto/16 :goto_0

    :catch_1
    move-exception v0

    invoke-static {v4}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l111l11111lIl(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%s-timeout-giveup [timeout=%s]"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/lang/String;)V

    throw v0
.end method
