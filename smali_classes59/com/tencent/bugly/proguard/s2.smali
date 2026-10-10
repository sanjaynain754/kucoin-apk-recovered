.class public Lcom/tencent/bugly/proguard/s2;
.super Ljava/lang/Object;
.source "BUGLY"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->b:Ljava/lang/String;

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 4

    .line 32
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    :try_start_1
    const-string/jumbo v1, "pid"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/s2;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    const-string v1, "app_key"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/s2;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    const-string/jumbo v1, "version"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/s2;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    const-string/jumbo v1, "sdk_ver"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/s2;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    const-string/jumbo v1, "uin"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/s2;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    const-string v1, "deviceid"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/s2;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    const-string/jumbo v1, "os"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/s2;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    const-string v1, "manu"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/s2;->l:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    const-string v1, "device"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/s2;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    const-string v1, "app_version_mode"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/s2;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    const-string v1, "md5code"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/s2;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :catchall_0
    move-exception v1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v1, v0

    const/4 v0, 0x0

    .line 44
    :goto_0
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v3, "RMonitor_config"

    invoke-virtual {v2, v3, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public a(Lcom/tencent/bugly/common/meta/UserMeta;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p1, Lcom/tencent/bugly/common/meta/UserMeta;->appId:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->c:Ljava/lang/String;

    .line 2
    iget-object v0, p1, Lcom/tencent/bugly/common/meta/UserMeta;->appKey:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->d:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lcom/tencent/bugly/common/meta/UserMeta;->getAppVersionMode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->g:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lcom/tencent/bugly/common/meta/UserMeta;->appVersion:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->e:Ljava/lang/String;

    .line 5
    iget-object v0, p1, Lcom/tencent/bugly/common/meta/UserMeta;->sdkVersion:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->f:Ljava/lang/String;

    .line 6
    iget-object v0, p1, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->h:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lcom/tencent/bugly/common/meta/UserMeta;->getUniqueID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->i:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Lcom/tencent/bugly/common/meta/UserMeta;->getModel()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tencent/bugly/common/utils/StringUtil;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/s2;->j:Ljava/lang/String;

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/ie;->k()Lcom/tencent/bugly/proguard/ie;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/ie;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/s2;->l:Ljava/lang/String;

    .line 10
    sget-object p1, Lcom/tencent/bugly/proguard/ie;->o:Lcom/tencent/bugly/proguard/ie;

    .line 11
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/ie;->g()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/s2;->k:Ljava/lang/String;

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 12
    :cond_0
    const-string/jumbo v0, "pid"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->c:Ljava/lang/String;

    .line 13
    const-string v0, "app_key"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->d:Ljava/lang/String;

    .line 14
    const-string/jumbo v0, "version"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/s2;->e:Ljava/lang/String;

    .line 15
    const-string/jumbo v1, "uin"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/s2;->h:Ljava/lang/String;

    .line 16
    const-string v1, "deviceid"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/s2;->i:Ljava/lang/String;

    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->e:Ljava/lang/String;

    .line 18
    const-string/jumbo v0, "sdk_ver"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->f:Ljava/lang/String;

    .line 19
    const-string/jumbo v0, "os"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->k:Ljava/lang/String;

    .line 20
    const-string v0, "manu"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->l:Ljava/lang/String;

    .line 21
    const-string v0, "device"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->j:Ljava/lang/String;

    .line 22
    const-string v0, "app_version_mode"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->g:Ljava/lang/String;

    .line 23
    const-string v0, "md5code"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/s2;->b:Ljava/lang/String;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/s2;)Z
    .locals 2
    .param p1    # Lcom/tencent/bugly/proguard/s2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 24
    iget-object v0, p0, Lcom/tencent/bugly/proguard/s2;->c:Ljava/lang/String;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/s2;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/bugly/proguard/s2;->g:Ljava/lang/String;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/s2;->g:Ljava/lang/String;

    .line 25
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/bugly/proguard/s2;->e:Ljava/lang/String;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/s2;->e:Ljava/lang/String;

    .line 26
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/bugly/proguard/s2;->f:Ljava/lang/String;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/s2;->f:Ljava/lang/String;

    .line 27
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/bugly/proguard/s2;->i:Ljava/lang/String;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/s2;->i:Ljava/lang/String;

    .line 28
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/bugly/proguard/s2;->h:Ljava/lang/String;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/s2;->h:Ljava/lang/String;

    .line 29
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/bugly/proguard/s2;->k:Ljava/lang/String;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/s2;->k:Ljava/lang/String;

    .line 30
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/bugly/proguard/s2;->j:Ljava/lang/String;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/s2;->j:Ljava/lang/String;

    .line 31
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public b(Lcom/tencent/bugly/proguard/s2;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object v0, p1, Lcom/tencent/bugly/proguard/s2;->a:Ljava/lang/String;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, p1, Lcom/tencent/bugly/proguard/s2;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, p1, Lcom/tencent/bugly/proguard/s2;->c:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->c:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, p1, Lcom/tencent/bugly/proguard/s2;->d:Ljava/lang/String;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->d:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, p1, Lcom/tencent/bugly/proguard/s2;->e:Ljava/lang/String;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->e:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v0, p1, Lcom/tencent/bugly/proguard/s2;->f:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->f:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v0, p1, Lcom/tencent/bugly/proguard/s2;->g:Ljava/lang/String;

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->g:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v0, p1, Lcom/tencent/bugly/proguard/s2;->h:Ljava/lang/String;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->h:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, p1, Lcom/tencent/bugly/proguard/s2;->i:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->i:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v0, p1, Lcom/tencent/bugly/proguard/s2;->j:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->j:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v0, p1, Lcom/tencent/bugly/proguard/s2;->k:Ljava/lang/String;

    .line 46
    .line 47
    iput-object v0, p0, Lcom/tencent/bugly/proguard/s2;->k:Ljava/lang/String;

    .line 48
    .line 49
    iget-object p1, p1, Lcom/tencent/bugly/proguard/s2;->l:Ljava/lang/String;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/tencent/bugly/proguard/s2;->l:Ljava/lang/String;

    .line 52
    return-void
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
