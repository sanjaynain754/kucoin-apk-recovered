.class abstract Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111lIl;
.super Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l1111l111111Il;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l1111l111111Il;-><init>()V

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

.method private static l111l11111I1l(Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 2

    .line 1
    sget-object v0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public l1111l111111Il()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    :try_start_0
    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111lIl;->l111l11111I1l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111lIl;->l111l11111Il()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111lIl;->l111l11111I1l(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v4

    :cond_1
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_2
    :goto_0
    return-object v4

    :catch_0
    return-object v0
.end method

.method public l1111l111111Il(Ljava/lang/String;)V
    .locals 3

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111lIl;->l111l11111I1l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111lIl;->l111l11111Il()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111lIl;->l111l11111I1l(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method public abstract l111l11111I1l()Ljava/lang/String;
.end method

.method public abstract l111l11111Il()Ljava/lang/String;
.end method
