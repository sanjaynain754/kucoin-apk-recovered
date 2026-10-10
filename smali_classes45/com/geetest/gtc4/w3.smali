.class public final Lcom/geetest/gtc4/w3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "https://riskct.geetest.com/g2/api/v1/client_report"

    .line 6
    .line 7
    iput-object v0, p0, Lcom/geetest/gtc4/w3;->b:Ljava/lang/String;

    .line 8
    return-void
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


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;)Lcom/geetest/gtc4/GeeGuardReceipt;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/geetest/gtc4/w3;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 14
    iget-object v0, p0, Lcom/geetest/gtc4/w3;->a:Ljava/lang/String;

    invoke-static {p1, v0, p2}, Lcom/geetest/gtc4/r3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/geetest/gtc4/GeeGuardReceipt;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final synthetic a(Landroid/content/Context;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x1388

    .line 12
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/geetest/gtc4/w3;->b(Landroid/content/Context;Ljava/lang/String;ILcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    return-void
.end method

.method public final synthetic a(Landroid/content/Context;Ljava/lang/String;ILcom/geetest/gtc4/GeeGuard$CallbackHandler;)V
    .locals 6

    .line 15
    iget-object v1, p0, Lcom/geetest/gtc4/w3;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/geetest/gtc4/w3;->b:Ljava/lang/String;

    move-object v0, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/geetest/gtc4/r3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    return-void
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iput-object p2, p0, Lcom/geetest/gtc4/w3;->a:Ljava/lang/String;

    :cond_0
    if-eqz p3, :cond_1

    .line 3
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {p3}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 4
    iput-object p3, p0, Lcom/geetest/gtc4/w3;->b:Ljava/lang/String;

    .line 5
    :cond_1
    const-string p2, "gt_core"

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p2

    .line 6
    invoke-static {p2}, Lcom/geetest/gtc4/t3;->a(Landroid/content/SharedPreferences;)V

    .line 7
    invoke-static {p1}, Lcom/geetest/gtc4/u3;->a(Landroid/content/Context;)V

    if-nez p4, :cond_2

    return-void

    .line 8
    :cond_2
    iget-object p2, p0, Lcom/geetest/gtc4/w3;->b:Ljava/lang/String;

    const-string p3, "https://riskct.geetest.com/g2/api/v1/client_report"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 9
    new-instance p2, Ljava/lang/Thread;

    new-instance p3, Lv7/j;

    invoke-direct {p3, p0, p1, p4}, Lv7/j;-><init>(Lcom/geetest/gtc4/w3;Landroid/content/Context;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    invoke-direct {p2, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    return-void

    .line 10
    :cond_3
    new-instance p2, Ljava/lang/Thread;

    new-instance p3, Lv7/k;

    invoke-direct {p3, p0, p1, p4}, Lv7/k;-><init>(Lcom/geetest/gtc4/w3;Landroid/content/Context;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    invoke-direct {p2, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 11
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final b(Landroid/content/Context;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/geetest/gtc4/v3;->a:Lcom/geetest/gtc4/w3;

    const/4 v1, 0x0

    const/16 v2, 0x1388

    invoke-virtual {v0, p1, v1, v2, p2}, Lcom/geetest/gtc4/w3;->b(Landroid/content/Context;Ljava/lang/String;ILcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    return-void
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;ILcom/geetest/gtc4/GeeGuard$CallbackHandler;)V
    .locals 7

    .line 2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lv7/l;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lv7/l;-><init>(Lcom/geetest/gtc4/w3;Landroid/content/Context;Ljava/lang/String;ILcom/geetest/gtc4/GeeGuard$CallbackHandler;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
