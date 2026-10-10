.class public Lcom/tencent/bugly/proguard/g6;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_FdLeak_ConfigHelper"

.field public static final b:Ljava/lang/String; = "fd_leak"

.field public static final c:I = 0x190

.field public static d:Ljava/io/File;


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

.method public static a()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/i4;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->d()Lcom/tencent/bugly/proguard/m6;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/m6;->p:Z

    .line 15
    return v0
    .line 16
    .line 17
.end method

.method public static b()Ljava/io/File;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/common/util/FileUtil;->getRootPath()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/tencent/bugly/proguard/g6;->d:Ljava/io/File;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Ljava/io/File;

    .line 17
    .line 18
    const-string v2, "fd_leak"

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    sput-object v1, Lcom/tencent/bugly/proguard/g6;->d:Ljava/io/File;

    .line 24
    .line 25
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/g6;->d:Ljava/io/File;

    .line 26
    return-object v0
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

.method public static c()Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "fd_leak"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->c(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static d()Lcom/tencent/bugly/proguard/m6;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->c()Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    .line 9
    .line 10
    instance-of v1, v0, Lcom/tencent/bugly/proguard/m6;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lcom/tencent/bugly/proguard/m6;

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/m6;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/m6;-><init>()V

    .line 21
    return-object v0
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

.method public static e()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/i4;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x190

    .line 9
    return v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->d()Lcom/tencent/bugly/proguard/m6;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget v0, v0, Lcom/tencent/bugly/proguard/hf;->l:I

    .line 16
    return v0
    .line 17
.end method

.method public static f()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/i4;->a()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverO()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->d()Lcom/tencent/bugly/proguard/m6;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iget v0, v0, Lcom/tencent/bugly/proguard/m6;->n:I

    .line 21
    and-int/2addr v0, v1

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    return v1

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0
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

.method public static g()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->d()Lcom/tencent/bugly/proguard/m6;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    iget-wide v2, v2, Lcom/tencent/bugly/proguard/m6;->r:D

    .line 11
    .line 12
    cmpg-double v0, v0, v2

    .line 13
    .line 14
    if-gez v0, :cond_0

    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
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

.method public static h()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->d()Lcom/tencent/bugly/proguard/m6;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v0, v0, Lcom/tencent/bugly/proguard/m6;->o:I

    .line 7
    const/4 v1, 0x1

    .line 8
    and-int/2addr v0, v1

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    return v1

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static i()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/i4;->a()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverR()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->d()Lcom/tencent/bugly/proguard/m6;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/m6;->q:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    return v1

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    return v0
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
