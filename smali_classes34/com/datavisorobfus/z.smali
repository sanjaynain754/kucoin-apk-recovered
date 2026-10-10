.class public Lcom/datavisorobfus/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/datavisorobfus/c0;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/datavisorobfus/z;->a:Landroid/content/Context;

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public a(Lcom/datavisorobfus/b0;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/datavisorobfus/z;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string/jumbo v1, "pps_oaid"

    invoke-static {v0, v1}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    :try_start_1
    invoke-interface {p1, v0}, Lcom/datavisorobfus/b0;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.uodis.opendevice.OPENIDS_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/datavisorobfus/z;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/datavisorobfus/z;->a:Landroid/content/Context;

    new-instance v2, Lcom/datavisorobfus/z$a;

    invoke-direct {v2, p0}, Lcom/datavisorobfus/z$a;-><init>(Lcom/datavisorobfus/z;)V

    invoke-static {v1, v0, p1, v2}, Lcom/datavisorobfus/m0;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/datavisorobfus/b0;Lcom/datavisorobfus/m0$a;)V

    return-void
.end method

.method public a()Z
    .locals 6

    .line 2
    const-string v0, "com.huawei.hms"

    const-string v1, "com.huawei.hwid.tv"

    const-string v2, "com.huawei.hwid"

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lcom/datavisorobfus/z;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    if-eqz v5, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    if-eqz v2, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {v4, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    if-eqz v1, :cond_2

    :goto_0
    iput-object v0, p0, Lcom/datavisorobfus/z;->b:Ljava/lang/String;

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    const-string v0, ""

    iput-object v0, p0, Lcom/datavisorobfus/z;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v3

    :goto_1
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    return v3
.end method
