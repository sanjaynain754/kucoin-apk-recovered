.class public Lcom/geetest/gtc4/GeeGuard;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/geetest/gtc4/GeeGuard$CallbackHandler;
    }
.end annotation


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
    .line 18
.end method

.method public static fetchReceipt(Landroid/content/Context;Ljava/lang/String;)Lcom/geetest/gtc4/GeeGuardReceipt;
    .locals 1

    .line 1
    sget-object v0, Lcom/geetest/gtc4/v3;->a:Lcom/geetest/gtc4/w3;

    invoke-virtual {v0, p0, p1}, Lcom/geetest/gtc4/w3;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/geetest/gtc4/GeeGuardReceipt;

    move-result-object p0

    return-object p0
.end method

.method public static fetchReceipt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/geetest/gtc4/GeeGuardReceipt;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0, p1, p2}, Lcom/geetest/gtc4/r3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/geetest/gtc4/GeeGuardReceipt;

    move-result-object p0

    return-object p0
.end method

.method public static getData(Landroid/content/Context;Lcom/geetest/gtc4/GeeGuardConfiguration;)Ljava/lang/String;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, Lcom/geetest/gtc4/Core;->getData(Landroid/content/Context;Lcom/geetest/gtc4/GeeGuardConfiguration;)Ljava/lang/String;

    .line 8
    move-result-object p0

    .line 9
    return-object p0
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
.end method

.method public static getLogEnabled()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/geetest/gtc4/p3;->a:Z

    .line 3
    return v0
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
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "2.7.1.1"

    .line 3
    return-object v0
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
.end method

.method public static register(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/geetest/gtc4/v3;->a:Lcom/geetest/gtc4/w3;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1, v1}, Lcom/geetest/gtc4/w3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    return-void
.end method

.method public static register(Landroid/content/Context;Ljava/lang/String;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V
    .locals 2

    .line 2
    sget-object v0, Lcom/geetest/gtc4/v3;->a:Lcom/geetest/gtc4/w3;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1, p2}, Lcom/geetest/gtc4/w3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    return-void
.end method

.method public static register(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 3
    sget-object v0, Lcom/geetest/gtc4/v3;->a:Lcom/geetest/gtc4/w3;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, p2, v1}, Lcom/geetest/gtc4/w3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    return-void
.end method

.method public static setLogEnabled(Z)V
    .locals 0

    .line 1
    .line 2
    sput-boolean p0, Lcom/geetest/gtc4/p3;->a:Z

    .line 3
    return-void
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

.method public static submitReceipt(Landroid/content/Context;Ljava/lang/String;ILcom/geetest/gtc4/GeeGuard$CallbackHandler;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/geetest/gtc4/v3;->a:Lcom/geetest/gtc4/w3;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/geetest/gtc4/w3;->b(Landroid/content/Context;Ljava/lang/String;ILcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    return-void
.end method

.method public static submitReceipt(Landroid/content/Context;Ljava/lang/String;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V
    .locals 2

    .line 2
    sget-object v0, Lcom/geetest/gtc4/v3;->a:Lcom/geetest/gtc4/w3;

    const/16 v1, 0x1388

    invoke-virtual {v0, p0, p1, v1, p2}, Lcom/geetest/gtc4/w3;->b(Landroid/content/Context;Ljava/lang/String;ILcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    return-void
.end method

.method public static submitReceipt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILcom/geetest/gtc4/GeeGuard$CallbackHandler;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    const-string v4, "https://riskct.geetest.com/g2/api/v1/client_report"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/geetest/gtc4/r3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    return-void
.end method

.method public static submitReceipt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/16 v3, 0x1388

    .line 4
    const-string v4, "https://riskct.geetest.com/g2/api/v1/client_report"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lcom/geetest/gtc4/r3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    return-void
.end method
