.class public final Lcom/tencent/bugly/proguard/g5;
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

.method public static a(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 4

    .line 32
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 33
    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 34
    :try_start_0
    const-string v1, "\\|"

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 35
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    .line 36
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 37
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_1
    return-object v0
.end method

.method public static a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 2

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 11
    const-string/jumbo v1, "stage"

    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/g5;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/rmonitor/custom/a;)V

    return-void
.end method

.method public static a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/rmonitor/custom/a;)V
    .locals 2

    if-eqz p0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    .line 13
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/g5;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14
    invoke-virtual {p1}, Lcom/tencent/rmonitor/custom/a;->g()Lorg/json/JSONObject;

    move-result-object v0

    .line 15
    invoke-virtual {p1}, Lcom/tencent/rmonitor/custom/a;->c()Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p1}, Lcom/tencent/rmonitor/custom/a;->e()Lorg/json/JSONObject;

    move-result-object v0

    const/4 p1, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 17
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "user_custom"

    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    if-eqz p1, :cond_3

    .line 18
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "extend_info"

    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public static a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/lang/String;)V
    .locals 2

    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/ne;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ne;-><init>()V

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/qe$a;->a()Lcom/tencent/bugly/proguard/qe;

    move-result-object v1

    .line 7
    invoke-virtual {v1, p1, v0}, Lcom/tencent/bugly/proguard/qe;->a(Ljava/lang/String;Lcom/tencent/bugly/proguard/t9;)Lcom/tencent/bugly/proguard/s9;

    move-result-object p1

    .line 8
    invoke-static {p1}, Lcom/tencent/bugly/proguard/w3;->a(Lcom/tencent/bugly/proguard/s9;)Lcom/tencent/rmonitor/custom/a;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/g5;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lcom/tencent/rmonitor/custom/a;)V

    return-void
.end method

.method public static a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 29
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 30
    invoke-static {p0}, Lcom/tencent/bugly/proguard/g5;->a(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 31
    invoke-virtual {p1, p3, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-void
.end method

.method public static a(Lorg/json/JSONObject;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 5

    const-string v0, "biz_extend_info"

    .line 19
    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_0

    .line 20
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 21
    :cond_0
    const-string v2, "extend_info"

    invoke-virtual {p1, v2}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v2, :cond_2

    .line 23
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 26
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 27
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 28
    :catchall_0
    :cond_2
    :try_start_2
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    return-void
.end method

.method public static a()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v0

    .line 2
    const-string v1, "crash"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object v0

    .line 3
    instance-of v1, v0, Lcom/tencent/bugly/proguard/f3;

    if-eqz v1, :cond_0

    .line 4
    check-cast v0, Lcom/tencent/bugly/proguard/f3;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/f3;->b()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 2

    if-eqz p0, :cond_2

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e:Ljava/lang/String;

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/g5;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    return-void

    .line 5
    :cond_1
    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/g5;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static b(Lorg/json/JSONObject;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 2

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    const-string/jumbo v0, "stage"

    invoke-static {p1}, Lcom/tencent/bugly/proguard/g5;->d(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 7
    const-string/jumbo v0, "user_custom"

    invoke-static {p1}, Lcom/tencent/bugly/proguard/g5;->c(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 8
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/g5;->a(Lorg/json/JSONObject;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    :catchall_0
    iget-object p0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e:Ljava/lang/String;

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "[extra data]append extra data to attribute {%s}"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static c(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    new-instance p0, Lorg/json/JSONObject;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 8
    return-object p0

    .line 9
    .line 10
    .line 11
    :cond_0
    const-string/jumbo v0, "user_custom"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    :cond_1
    const/4 v1, 0x0

    .line 29
    .line 30
    :goto_0
    if-nez v1, :cond_2

    .line 31
    .line 32
    new-instance v1, Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 36
    .line 37
    :cond_2
    :try_start_1
    const-string v0, "RDelivery"

    .line 38
    .line 39
    const-string v2, "a11"

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v0, v2}, Lcom/tencent/bugly/proguard/g5;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string/jumbo v0, "testLabel"

    .line 46
    .line 47
    const-string v2, "a12"

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v1, v0, v2}, Lcom/tencent/bugly/proguard/g5;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    const-string v0, "caseLabel"

    .line 53
    .line 54
    const-string v2, "a13"

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v1, v0, v2}, Lcom/tencent/bugly/proguard/g5;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    :catchall_0
    iget-object p0, p0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e:Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    const-string v0, "[extra data]assemble custom data {%s}"

    .line 66
    .line 67
    .line 68
    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 69
    return-object v1
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

.method public static d(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "stage"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const-string p0, ""

    .line 12
    :cond_0
    return-object p0
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
    .line 23
    .line 24
    .line 25
.end method
