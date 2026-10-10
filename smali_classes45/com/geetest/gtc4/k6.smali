.class public final Lcom/geetest/gtc4/k6;
.super Lcom/geetest/gtc4/m6;
.source "SourceFile"


# instance fields
.field public final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/geetest/gtc4/m6;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/k6;->c:Landroid/content/Context;

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
.method public final a(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 7
    sget v0, Lcom/geetest/gtc4/e5;->a:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "com.oplus.stdid.IStdID"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    instance-of v1, v0, Lcom/geetest/gtc4/d5;

    if-eqz v1, :cond_1

    .line 10
    move-object p1, v0

    check-cast p1, Lcom/geetest/gtc4/d5;

    goto :goto_0

    .line 11
    :cond_1
    new-instance v0, Lcom/geetest/gtc4/d5;

    invoke-direct {v0, p1}, Lcom/geetest/gtc4/d5;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    .line 12
    invoke-virtual {p1, p2, p3}, Lcom/geetest/gtc4/d5;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 13
    :cond_2
    new-instance p1, Lcom/geetest/gtc4/e6;

    const-string p2, "IStdID is null"

    invoke-direct {p1, p2}, Lcom/geetest/gtc4/e6;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Lcom/geetest/gtc4/i3;)V
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/geetest/gtc4/k6;->c:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Landroid/content/Intent;

    const-string v1, "action.com.oplus.stdid.ID_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5
    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.coloros.mcs"

    const-string v3, "com.oplus.stdid.IdentifyService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 6
    iget-object v1, p0, Lcom/geetest/gtc4/k6;->c:Landroid/content/Context;

    new-instance v2, Lcom/geetest/gtc4/j6;

    invoke-direct {v2, p0}, Lcom/geetest/gtc4/j6;-><init>(Lcom/geetest/gtc4/k6;)V

    invoke-static {v1, v0, p1, v2}, Lcom/geetest/gtc4/i6;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/geetest/gtc4/i3;Lcom/geetest/gtc4/h6;)V

    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/geetest/gtc4/k6;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "com.coloros.mcs"

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_1
    return v1
.end method
