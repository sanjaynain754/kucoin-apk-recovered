.class public Lcom/tencent/bugly/proguard/ci;
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

.method public static a(Lcom/tencent/bugly/proguard/uh;)Lcom/tencent/bugly/crashreport/biz/UserInfoBean;
    .locals 5

    .line 32
    const-string v0, "a12"

    new-instance v1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    invoke-direct {v1}, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;-><init>()V

    .line 33
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/uh;->d()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->d:Ljava/lang/String;

    .line 34
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/uh;->e()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->f:J

    .line 35
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/uh;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->o:Ljava/lang/String;

    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->g:J

    .line 37
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/uh;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    .line 38
    :goto_0
    iput v2, v1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->c:I

    .line 39
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v2

    .line 40
    invoke-virtual {v2, v0}, Lcom/tencent/rmonitor/custom/a;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 41
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 42
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v4

    .line 43
    invoke-virtual {v4, v0, v3}, Lcom/tencent/rmonitor/custom/a;->c(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 44
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v2

    .line 45
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/uh;->b()Ljava/lang/String;

    move-result-object p0

    .line 46
    invoke-virtual {v2, v0, p0}, Lcom/tencent/rmonitor/custom/a;->b(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    .line 47
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v1
.end method

.method public static a(Lcom/tencent/bugly/proguard/i3;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 4

    .line 1
    new-instance v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    invoke-direct {v0}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;-><init>()V

    .line 2
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->m()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e:Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->t()I

    move-result v1

    iput v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 5
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->n()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    .line 6
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->b()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->l:Ljava/lang/String;

    .line 7
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->q()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k:Ljava/lang/String;

    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->k()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->l()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    .line 10
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->i()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    .line 11
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->r()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->F:Ljava/lang/String;

    .line 12
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->H:[B

    .line 13
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->o()Z

    move-result v1

    iput-boolean v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c0:Z

    .line 14
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->p()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b0:J

    .line 15
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->h()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    .line 16
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->g()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:Ljava/lang/String;

    .line 17
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->f()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->j:Ljava/lang/String;

    .line 18
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->v()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->v:Ljava/lang/String;

    .line 19
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i:Ljava/lang/String;

    .line 20
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->s()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->E:Ljava/lang/String;

    .line 21
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e0:Ljava/util/Map;

    .line 22
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "BUGLY_CR_01"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k0:Ljava/lang/String;

    .line 24
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->u()[B

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->j0:[B

    .line 25
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->j()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "stage"

    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 27
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 28
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/i3;->e()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 29
    const-string p0, "a12"

    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    const-string/jumbo p0, "user_custom"

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v0
.end method
