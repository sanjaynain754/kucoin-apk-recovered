.class public final Lcom/tencent/bugly/proguard/gd;
.super Ljava/lang/Object;
.source "BUGLY"


# direct methods
.method public constructor <init>()V
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
.end method

.method public static a(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    .line 19
    const-string/jumbo p0, "null"

    return-object p0

    .line 20
    :cond_0
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 21
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 23
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 24
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a()Lorg/json/JSONObject;
    .locals 1

    .line 25
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/rmonitor/custom/a;->g()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/tencent/bugly/proguard/z7;)V
    .locals 2
    .param p0    # Lcom/tencent/bugly/proguard/z7;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v1, v0, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/z7;->b:Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/tencent/bugly/common/utils/ProcessUtil;->getCurrentProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/z7;->i:Ljava/lang/String;

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/z7;->k:Ljava/lang/String;

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/tencent/bugly/proguard/ch;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/z7;->j:Ljava/lang/String;

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/z7;->l:Ljava/lang/String;

    .line 6
    iget-object v1, v0, Lcom/tencent/bugly/common/meta/UserMeta;->appVersion:Ljava/lang/String;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/z7;->d:Ljava/lang/String;

    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/common/meta/UserMeta;->getAppVersionMode()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/z7;->c:Ljava/lang/String;

    .line 8
    iget-object v1, v0, Lcom/tencent/bugly/common/meta/UserMeta;->buildNumber:Ljava/lang/String;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/z7;->f:Ljava/lang/String;

    .line 9
    iget-object v0, v0, Lcom/tencent/bugly/common/meta/UserMeta;->sdkVersion:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/z7;->g:Ljava/lang/String;

    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u7;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/z7;->e:Ljava/lang/String;

    return-void
.end method

.method public static a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p0, :cond_1

    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "exception_type"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_1

    .line 13
    invoke-static {p2}, Lcom/tencent/bugly/proguard/gd;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    .line 14
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 15
    const-string v0, "call_stack"

    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 16
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 17
    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 18
    const-string/jumbo p2, "stacks"

    invoke-virtual {p0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    :goto_0
    return-void
.end method
