.class public Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;
.super Ljava/lang/Object;


# instance fields
.field private final l1111l111111Il:I

.field private final l111l11111I1l:Ljava/io/InputStream;

.field private final l111l11111Il:[B

.field private final l111l11111lIl:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;->l1111l111111Il:I

    array-length p1, p2

    iput p1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;->l111l11111lIl:I

    iput-object p2, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;->l111l11111Il:[B

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;->l111l11111I1l:Ljava/io/InputStream;

    return-void
.end method

.method public static l1111l111111Il(Ljava/util/Set;Lorg/json/JSONObject;Z)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lorg/json/JSONObject;",
            "Z)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "organization"

    sget-object v2, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {v2}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111I11l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111lIl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, ""

    if-nez v2, :cond_1

    :try_start_1
    const-string v2, "B"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object v2, v1

    move-object v1, v3

    goto :goto_0

    :cond_1
    move-object v1, v3

    move-object v2, v1

    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111lIl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111llIl()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string/jumbo v5, "smid"

    if-nez v4, :cond_3

    :try_start_2
    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {v0, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :cond_4
    invoke-virtual {v0, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_1
    new-instance p2, Lorg/json/JSONArray;

    invoke-direct {p2, p0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    if-eqz p1, :cond_5

    invoke-virtual {p2, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_5
    const-string p0, "appId"

    sget-object p1, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111Ill()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "appname"

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l11111lIl;->l111l11111I1l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo p0, "sessionId"

    sget-object p1, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l11111lIl:Ljava/lang/String;

    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo p0, "wevent"

    invoke-virtual {v0, p0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {p2}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l111l11111Il()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {v0}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111I11l()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {v1}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111Ill()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, p1, p2, v0, v1}, Lcom/ishumei/smantifraud/dfp/SMSDK;->v3(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l$l1111l111111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;->l1111l111111Il(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public l1111l111111Il()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;->l1111l111111Il:I

    return v0
.end method

.method public l111l11111I1l()[B
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;->l111l11111Il:[B

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

.method public l111l11111Il()Ljava/io/InputStream;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;->l111l11111Il:[B

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;->l111l11111Il:[B

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public l111l11111lIl()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111Ill;->l111l11111lIl:I

    .line 3
    return v0
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
