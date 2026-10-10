.class public Lcom/tencent/feedback/eup/CrashReport;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/feedback/eup/CrashReport$b;,
        Lcom/tencent/feedback/eup/CrashReport$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "TestLabel"

.field public static final b:Ljava/lang/String; = "https://rmonitor.qq.com"

.field public static final c:Ljava/lang/String; = "https://pro.bugly.qq.com"

.field public static final d:Ljava/lang/String; = "https://android.bugly.tencent.com"

.field public static final e:Ljava/lang/String; = "https://t.rmonitor.qq.com"

.field public static final f:Ljava/lang/String; = "https://t.pro.bugly.qq.com"

.field public static final g:Ljava/lang/String; = "https://pre.rmonitor.qq.com"


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

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 32
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 50
    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "getAllUserDataKeys args context should not be null"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 p0, 0x0

    return-object p0

    .line 51
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->b()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static a()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 13
    invoke-static {}, Lcom/tencent/bugly/proguard/rh;->d()Lcom/tencent/bugly/proguard/rh;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/rh;->b()V

    .line 15
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/rh;->a()V

    :cond_0
    return-void
.end method

.method public static a(I)V
    .locals 1

    .line 77
    sget v0, Lcom/tencent/feedback/eup/CrashReport$b;->a:I

    if-lt p0, v0, :cond_1

    sget v0, Lcom/tencent/feedback/eup/CrashReport$b;->f:I

    if-le p0, v0, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->a(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 9
    invoke-static/range {v0 .. v5}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static a(Landroid/content/Context;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 28
    new-array p0, v0, [Ljava/lang/Object;

    const-string/jumbo p1, "setTag args context should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_0
    if-gtz p1, :cond_1

    .line 29
    new-array p0, v0, [Ljava/lang/Object;

    const-string/jumbo p1, "setTag args tagId should > 0"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 30
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->b(I)V

    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "[param] set user scene tag: %d"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Landroid/content/Context;IZ)V
    .locals 2

    .line 71
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 72
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set app fore ground because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 73
    new-array p0, v0, [Ljava/lang/Object;

    const-string p1, "Context should not be null."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 74
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/l2;->a(Z)V

    .line 75
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "Set app fore ground: "

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, ", service hash: "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 33
    new-array p0, v0, [Ljava/lang/Object;

    const-string/jumbo p1, "putUploadRequestData args context should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 34
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 35
    new-array p0, v0, [Ljava/lang/Object;

    const-string/jumbo p1, "putUploadRequestData args key should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 36
    :cond_1
    invoke-static {p2}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 37
    new-array p0, v0, [Ljava/lang/Object;

    const-string/jumbo p1, "putUploadRequestData args value should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 38
    :cond_2
    const-string v1, "[a-zA-Z[0-9]]+"

    invoke-virtual {p1, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 39
    const-string/jumbo p0, "putUploadRequestData args key should match [a-zA-Z[0-9]_]+  {"

    const-string/jumbo p2, "}"

    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/lf;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 40
    new-array p1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 41
    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xc8

    if-le v1, v2, :cond_4

    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    .line 43
    const-string/jumbo v3, "upload request data value length over limit %d , has been cutted!"

    invoke-static {v3, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 44
    invoke-virtual {p2, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 45
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x32

    if-le v1, v2, :cond_5

    .line 46
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    .line 47
    const-string/jumbo p1, "upload request data key length over limit %d , will drop this new key %s"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 48
    :cond_5
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/l2;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 49
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "[param] put upload request data: %s - %s"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, p2, v0}, Lcom/tencent/feedback/eup/CrashReport;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/u3;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/u3;)V
    .locals 6

    .line 2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/d3;->a(Landroid/content/Context;)V

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    .line 3
    invoke-static/range {v0 .. v5}, Lcom/tencent/bugly/proguard/n3;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/u3;J)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/u3;J)V
    .locals 0

    .line 4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/d3;->a(Landroid/content/Context;)V

    .line 5
    invoke-static/range {p0 .. p5}, Lcom/tencent/bugly/proguard/n3;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/u3;J)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/lg;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 17
    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "addSoFiles args context should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_0
    if-eqz p1, :cond_3

    .line 18
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 19
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    .line 20
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 21
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/lg;

    .line 22
    new-instance v2, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;

    iget-object v3, v1, Lcom/tencent/bugly/proguard/lg;->a:Ljava/lang/String;

    iget-object v4, v1, Lcom/tencent/bugly/proguard/lg;->b:Ljava/lang/String;

    iget-object v5, v1, Lcom/tencent/bugly/proguard/lg;->c:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v5}, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "sosha1_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Lcom/tencent/bugly/proguard/lg;->c:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 24
    :cond_2
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/l2;->a(Ljava/util/Map;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 53
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 54
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set collect privacy info enable because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p0, :cond_1

    .line 55
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo p1, "setCollectPrivacyInfo args context should not be null"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 56
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "setCollectPrivacyInfo: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->b(Z)V

    return-void
.end method

.method public static a(Landroid/content/Context;ZZ)V
    .locals 0

    .line 10
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/n3;->a(Landroid/content/Context;ZZ)V

    return-void
.end method

.method public static a(Lcom/tencent/rmonitor/common/logger/ILogProxy;)V
    .locals 0

    .line 79
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->a(Lcom/tencent/rmonitor/common/logger/ILogProxy;)V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .line 76
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;J)V
    .locals 2

    .line 25
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/lang/String;J)V

    return-void

    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 27
    new-array p0, p0, [Ljava/lang/Object;

    const-string/jumbo p1, "setCrashThreadLocalKey args keyName or key should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 64
    const-string v0, "RDelivery"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    invoke-static {p1}, Lcom/tencent/bugly/proguard/fi;->b(Ljava/lang/String;)V

    .line 66
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 67
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setAppVersionLabel(Ljava/lang/String;)Z

    :cond_0
    return-void

    .line 68
    :cond_1
    const-string v0, "TestLabel"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 69
    invoke-static {p1}, Lcom/tencent/bugly/proguard/n3;->g(Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 p0, 0x0

    .line 70
    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "Failed to put reserved request data, key is null or illegal."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 7
    invoke-static/range {p0 .. p5}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 61
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method public static a(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p0, :cond_0

    .line 16
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/util/concurrent/ScheduledExecutorService;)V

    :cond_0
    return-void
.end method

.method public static a(ZZ)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p0, :cond_0

    .line 58
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 59
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->filterSigabrtSysLog()Z

    .line 60
    :cond_0
    sput-boolean p1, Lcom/tencent/bugly/proguard/k3;->J:Z

    return-void
.end method

.method public static a(ZZZ)V
    .locals 0

    .line 52
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/n3;->a(ZZZ)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 6
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/l2;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[B)Z
    .locals 1

    const/4 v0, 0x1

    .line 11
    invoke-static {p0, p1, p2, p3, v0}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[BZ)Z

    move-result p0

    return p0
.end method

.method public static a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[BZ)Z
    .locals 0

    .line 12
    invoke-static {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[BZ)Z

    move-result p0

    return p0
.end method

.method public static a(Z)Z
    .locals 0

    .line 63
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->a(Z)Z

    move-result p0

    return p0
.end method

.method public static a([Ljava/lang/String;)Z
    .locals 0

    .line 62
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->a([Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static b()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->g()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/n3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/lg;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 6
    new-array p0, p0, [Ljava/lang/Object;

    const-string/jumbo p1, "setSOFile args context should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_0
    if-eqz p1, :cond_3

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 8
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    .line 9
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/lg;

    .line 11
    new-instance v2, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;

    iget-object v3, v1, Lcom/tencent/bugly/proguard/lg;->a:Ljava/lang/String;

    iget-object v4, v1, Lcom/tencent/bugly/proguard/lg;->b:Ljava/lang/String;

    iget-object v5, v1, Lcom/tencent/bugly/proguard/lg;->c:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v5}, Lcom/tencent/bugly/crashreport/common/info/PlugInBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "sosha1_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Lcom/tencent/bugly/proguard/lg;->c:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 13
    :cond_2
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/l2;->b(Ljava/util/Map;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public static b(Landroid/content/Context;Z)V
    .locals 0

    .line 14
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->a(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Z)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p0, 0x0

    .line 1
    new-array v0, p0, [Ljava/lang/Object;

    const-string/jumbo v1, "sorry, enableNativeSubProcess interface is deprecated, please use native_sub_process config"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return p0
.end method

.method public static c()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    invoke-static {}, Lcom/tencent/feedback/eup/CrashReport;->b()I

    move-result v0

    return v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Z)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 7
    new-array p0, v0, [Ljava/lang/Object;

    const-string p1, "Context should not be null."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 8
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "This is a development device."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_1
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "This is not a development device."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 10
    :goto_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/l2;->h0:Z

    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 0

    .line 11
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static c(Z)V
    .locals 0

    .line 12
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->b(Z)V

    return-void
.end method

.method public static c(Landroid/content/Context;)[B
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/k3;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/k3;->R:Lcom/tencent/bugly/proguard/k3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    .line 4
    invoke-virtual {v1, p0}, Lcom/tencent/bugly/proguard/k3;->a(Landroid/content/Context;)[B

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Landroid/content/Context;)I
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 6
    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "getUserDatasSize args context should not be null"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 p0, -0x1

    return p0

    .line 7
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->G()I

    move-result p0

    return p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    iput-object p1, p0, Lcom/tencent/bugly/proguard/l2;->q:Ljava/lang/String;

    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo p1, "set sha1 %s"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static d(Z)V
    .locals 0

    .line 3
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->e(Z)V

    return-void
.end method

.method public static d()Z
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-wide/16 v2, 0x0

    .line 2
    invoke-virtual {v0, v2, v3, v1}, Lcom/tencent/bugly/proguard/k3;->a(JZ)V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public static e(Landroid/content/Context;)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 2
    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "getUserSceneTagId args context should not be null"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 p0, -0x1

    return p0

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->H()I

    move-result p0

    return p0
.end method

.method public static e()Lcom/tencent/bugly/proguard/u3;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/n3;->e:Lcom/tencent/bugly/proguard/u3;

    return-object v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->c(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 6
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 7
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "Can not set App package because bugly is disable."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 8
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Set crash stack filter: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    sput-object p0, Lcom/tencent/bugly/proguard/k3;->P:Ljava/lang/String;

    return-void
.end method

.method public static e(Z)V
    .locals 0

    .line 4
    sput-boolean p0, Lcom/tencent/bugly/proguard/e4;->c:Z

    return-void
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->d(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static f(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 4
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "Can not set App package because bugly is disable."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Set crash stack filter: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    sput-object p0, Lcom/tencent/bugly/proguard/k3;->Q:Ljava/lang/String;

    return-void
.end method

.method public static f(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->f(Z)V

    return-void
.end method

.method public static g()Lcom/tencent/bugly/common/replay/BuglyReplayOptions;
    .locals 2

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v1, "get replay options failed, pls init bugly first!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return-object v0

    .line 6
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->d()Lcom/tencent/bugly/common/replay/BuglyReplayOptions;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    iput-object p1, p0, Lcom/tencent/bugly/proguard/l2;->g:Ljava/lang/String;

    return-void
.end method

.method public static g(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->e(Ljava/lang/String;)V

    return-void
.end method

.method public static g(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    sput-boolean p0, Lcom/tencent/bugly/proguard/n3;->d:Z

    return-void
.end method

.method public static h()Ljava/lang/String;
    .locals 1

    .line 3
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->x()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->e(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static h(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->g(Z)V

    return-void
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 0

    .line 5
    invoke-static {p0}, Lcom/tencent/bugly/proguard/d2;->a(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static i()J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/rh;->d()Lcom/tencent/bugly/proguard/rh;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/rh;->a(Z)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->f(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static i(Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->f(Ljava/lang/String;)V

    return-void
.end method

.method public static i(Z)V
    .locals 0

    .line 5
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->h(Z)V

    return-void
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/r3;->h(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static j(Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->g(Ljava/lang/String;)V

    return-void
.end method

.method public static j()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/feedback/eup/CrashReport;->b()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static k(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->g(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static k()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->f()Z

    move-result v0

    return v0
.end method

.method public static l()V
    .locals 0

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->g()V

    return-void
.end method

.method public static l(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->h(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static m()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->h()V

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

.method public static n()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, v0}, Lcom/tencent/bugly/proguard/n3;->a(ZZZ)V

    .line 6
    return-void
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

.method public static o()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "Can not upload user info because bugly is disable."

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "Can not upload user info because bugly is not init."

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    return-void

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/v1;->c(Z)V

    .line 29
    return-void
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

.method public static triggerUserInfoUpload()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "Can not upload user info because bugly is disable."

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    sget-boolean v0, Lcom/tencent/bugly/proguard/n3;->c:Z

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    .line 24
    new-array v0, v0, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const-string/jumbo v1, "trigger upload user info"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 31
    .line 32
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    .line 33
    .line 34
    const/16 v1, 0x8

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/v1;->a(I)V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_2
    :goto_0
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 41
    .line 42
    const-string v1, "Can not upload user info because bugly is not init."

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    return-void
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
