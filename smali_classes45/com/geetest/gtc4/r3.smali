.class public abstract Lcom/geetest/gtc4/r3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/geetest/gtc4/GeeGuardReceipt;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    if-nez p1, :cond_1

    return-object v0

    .line 1
    :cond_1
    new-instance v1, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;

    invoke-direct {v1}, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;-><init>()V

    .line 2
    invoke-virtual {v1, p1}, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;->setAppId(Ljava/lang/String;)Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;

    move-result-object v1

    .line 3
    invoke-virtual {v1, p2}, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;->addSignature(Ljava/lang/String;)Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;

    move-result-object p2

    .line 4
    invoke-virtual {p2}, Lcom/geetest/gtc4/GeeGuardConfiguration$Builder;->build()Lcom/geetest/gtc4/GeeGuardConfiguration;

    move-result-object p2

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p2}, Lcom/geetest/gtc4/Core;->getData(Landroid/content/Context;Lcom/geetest/gtc4/GeeGuardConfiguration;)Ljava/lang/String;

    move-result-object p2

    .line 6
    const-string v1, "gt_core"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 7
    const-string v1, "gt_gid3"

    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 8
    new-instance v0, Lcom/geetest/gtc4/GeeGuardReceipt;

    invoke-direct {v0}, Lcom/geetest/gtc4/GeeGuardReceipt;-><init>()V

    .line 9
    iput-object p2, v0, Lcom/geetest/gtc4/GeeGuardReceipt;->geeToken:Ljava/lang/String;

    .line 10
    iput-object p0, v0, Lcom/geetest/gtc4/GeeGuardReceipt;->geeID:Ljava/lang/String;

    .line 11
    iput-object p1, v0, Lcom/geetest/gtc4/GeeGuardReceipt;->appID:Ljava/lang/String;

    if-eqz p0, :cond_2

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 13
    const-string p1, "-"

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 14
    array-length p1, p0

    const/4 p2, 0x4

    if-ne p1, p2, :cond_2

    const/4 p1, 0x1

    .line 15
    aget-object p0, p0, p1

    iput-object p0, v0, Lcom/geetest/gtc4/GeeGuardReceipt;->geeIDTimestamp:Ljava/lang/String;

    :cond_2
    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/geetest/gtc4/GeeGuard$CallbackHandler;)V
    .locals 3

    const/4 v0, 0x0

    const/16 v1, -0xc8

    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-nez p0, :cond_0

    .line 17
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Context is null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p0}, Lcom/geetest/gtc4/p3;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    if-eqz p5, :cond_5

    .line 18
    invoke-interface {p5, v1, v0}, Lcom/geetest/gtc4/GeeGuard$CallbackHandler;->onCompletion(Ljava/lang/Integer;Lcom/geetest/gtc4/GeeGuardReceipt;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 19
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Empty App ID"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p0}, Lcom/geetest/gtc4/p3;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    if-eqz p5, :cond_5

    .line 20
    invoke-interface {p5, v1, v0}, Lcom/geetest/gtc4/GeeGuard$CallbackHandler;->onCompletion(Ljava/lang/Integer;Lcom/geetest/gtc4/GeeGuardReceipt;)V

    return-void

    .line 21
    :cond_1
    invoke-static {p0, p1, p2}, Lcom/geetest/gtc4/r3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/geetest/gtc4/GeeGuardReceipt;

    move-result-object p0

    if-nez p0, :cond_2

    if-eqz p5, :cond_5

    .line 22
    invoke-interface {p5, v1, v0}, Lcom/geetest/gtc4/GeeGuard$CallbackHandler;->onCompletion(Ljava/lang/Integer;Lcom/geetest/gtc4/GeeGuardReceipt;)V

    return-void

    .line 23
    :cond_2
    new-instance p2, Lcom/geetest/gtc4/a6;

    invoke-direct {p2}, Lcom/geetest/gtc4/a6;-><init>()V

    .line 24
    iget-object v0, p2, Lcom/geetest/gtc4/a6;->a:Ljava/util/HashMap;

    const-string v1, "API-Version"

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    iget-object v0, p2, Lcom/geetest/gtc4/a6;->a:Ljava/util/HashMap;

    const-string v1, "AppID"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    iget-object p1, p0, Lcom/geetest/gtc4/GeeGuardReceipt;->geeID:Ljava/lang/String;

    .line 27
    iget-object v0, p2, Lcom/geetest/gtc4/a6;->a:Ljava/util/HashMap;

    const-string v1, "GeeID"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    iget-object p1, p2, Lcom/geetest/gtc4/a6;->a:Ljava/util/HashMap;

    const-string v0, "Client-Type"

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    iget-object p1, p0, Lcom/geetest/gtc4/GeeGuardReceipt;->geeToken:Ljava/lang/String;

    .line 30
    iput-object p1, p2, Lcom/geetest/gtc4/a6;->c:Ljava/lang/String;

    .line 31
    iput-object p4, p2, Lcom/geetest/gtc4/a6;->b:Ljava/lang/String;

    .line 32
    invoke-static {p2, p3}, Lcom/geetest/gtc4/b6;->a(Lcom/geetest/gtc4/a6;I)Landroid/util/Pair;

    move-result-object p1

    .line 33
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 p3, 0xc8

    if-ne p2, p3, :cond_4

    .line 34
    iget-object p2, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/geetest/gtc4/GeeGuardReceipt;->originalResponse:Ljava/lang/String;

    .line 35
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 36
    const-string p1, "code"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_3

    .line 37
    const-string p1, "data"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 38
    const-string p2, "gee_token"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/geetest/gtc4/GeeGuardReceipt;->respondedGeeToken:Ljava/lang/String;

    if-eqz p5, :cond_5

    .line 39
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p5, p1, p0}, Lcom/geetest/gtc4/GeeGuard$CallbackHandler;->onCompletion(Ljava/lang/Integer;Lcom/geetest/gtc4/GeeGuardReceipt;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_3
    if-eqz p5, :cond_5

    const/16 p1, -0x1f5

    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p5, p1, p0}, Lcom/geetest/gtc4/GeeGuard$CallbackHandler;->onCompletion(Ljava/lang/Integer;Lcom/geetest/gtc4/GeeGuardReceipt;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    const/16 p2, -0xf

    .line 41
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/geetest/gtc4/p3;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    if-eqz p5, :cond_5

    const/16 p1, -0x1f4

    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p5, p1, p0}, Lcom/geetest/gtc4/GeeGuard$CallbackHandler;->onCompletion(Ljava/lang/Integer;Lcom/geetest/gtc4/GeeGuardReceipt;)V

    goto :goto_1

    :cond_4
    if-eqz p5, :cond_5

    const/16 p1, -0x12c

    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p5, p1, p0}, Lcom/geetest/gtc4/GeeGuard$CallbackHandler;->onCompletion(Ljava/lang/Integer;Lcom/geetest/gtc4/GeeGuardReceipt;)V

    :cond_5
    :goto_1
    return-void
.end method
