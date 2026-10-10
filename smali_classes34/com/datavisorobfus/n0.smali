.class public Lcom/datavisorobfus/n0;
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
    iput-object p1, p0, Lcom/datavisorobfus/n0;->a:Landroid/content/Context;

    .line 6
    const/4 p1, 0x0

    .line 7
    .line 8
    iput-object p1, p0, Lcom/datavisorobfus/n0;->b:Ljava/lang/String;

    .line 9
    return-void
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

.method public static synthetic a(Lcom/datavisorobfus/n0;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/datavisorobfus/n0;->a:Landroid/content/Context;

    return-object p0
.end method

.method private a(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 2
    invoke-static {p1}, Lcom/datavisor/vangogh/oaid/thirdparty/heytap/openid/IOpenID$Stub;->asInterface(Landroid/os/IBinder;)Lcom/datavisor/vangogh/oaid/thirdparty/heytap/openid/IOpenID;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "OUID"

    invoke-interface {p1, p2, p3, v0}, Lcom/datavisor/vangogh/oaid/thirdparty/heytap/openid/IOpenID;->getSerID(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "getSerId null"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/datavisorobfus/n0;Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/datavisorobfus/n0;->a(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/datavisorobfus/n0;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/datavisorobfus/n0;->b:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic b(Lcom/datavisorobfus/n0;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/datavisorobfus/n0;->b:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 23
.end method


# virtual methods
.method public a(Lcom/datavisorobfus/b0;)V
    .locals 5

    .line 5
    new-instance v0, Landroid/content/Intent;

    const-string v1, "action.com.heytap.openid.OPEN_ID_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/ComponentName;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "com.heytap.openid"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".IdentifyService"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v3, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/datavisorobfus/n0;->a:Landroid/content/Context;

    new-instance v2, Lcom/datavisorobfus/n0$a;

    invoke-direct {v2, p0}, Lcom/datavisorobfus/n0$a;-><init>(Lcom/datavisorobfus/n0;)V

    invoke-static {v1, v0, p1, v2}, Lcom/datavisorobfus/m0;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/datavisorobfus/b0;Lcom/datavisorobfus/m0$a;)V

    return-void
.end method

.method public a()Z
    .locals 3

    const/4 v0, 0x0

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/datavisorobfus/n0;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "com.heytap.openid"

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    return v0
.end method
