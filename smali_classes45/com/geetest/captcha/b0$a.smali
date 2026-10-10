.class public final Lcom/geetest/captcha/b0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/geetest/captcha/d0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/geetest/captcha/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/geetest/captcha/x;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/geetest/captcha/q;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/geetest/captcha/x;Lcom/geetest/captcha/q;)V
    .locals 1
    .param p1    # Lcom/geetest/captcha/x;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/geetest/captcha/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "request"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "handler"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    iput-object p1, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/geetest/captcha/b0$a;->b:Lcom/geetest/captcha/q;

    .line 19
    return-void
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

.method public static final a(Lcom/geetest/captcha/b0$a;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iget-object p0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    .line 13
    iget-object v0, p0, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {v0}, Lcom/geetest/captcha/e;->b()V

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/geetest/captcha/x;->b()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    invoke-virtual {v0}, Lcom/geetest/captcha/x;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    const-string v1, "WebViewHandler"

    const-string v2, "WebViewHandler.HandlerObserver.onCallReady"

    invoke-virtual {v0, v1, v2}, Lcom/geetest/captcha/utils/LogUtils;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    sget-object v1, Lcom/geetest/captcha/a0;->SUCCESS:Lcom/geetest/captcha/a0;

    invoke-virtual {v0, v1}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0;)V

    .line 4
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    .line 6
    iget-object v1, v0, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {v1}, Lcom/geetest/captcha/e;->b()V

    .line 8
    :cond_1
    invoke-virtual {v0}, Lcom/geetest/captcha/x;->b()V

    return-void

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    .line 10
    iget-object v0, v0, Lcom/geetest/captcha/x;->a:Landroid/content/Context;

    .line 11
    check-cast v0, Landroid/app/Activity;

    new-instance v1, Lcom/geetest/captcha/e0;

    invoke-direct {v1, p0}, Lcom/geetest/captcha/e0;-><init>(Lcom/geetest/captcha/b0$a;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v1, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    invoke-virtual {v1}, Lcom/geetest/captcha/x;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    sget-object v1, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WebViewHandler.HandlerObserver.onWebError: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "WebViewHandler"

    invoke-virtual {v1, v3, v2}, Lcom/geetest/captcha/utils/LogUtils;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iget-object v2, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    sget-object v3, Lcom/geetest/captcha/a0;->FAIL:Lcom/geetest/captcha/a0;

    invoke-virtual {v2, v3}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0;)V

    .line 19
    iget-object v2, p0, Lcom/geetest/captcha/b0$a;->b:Lcom/geetest/captcha/q;

    iget-object v4, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    const-string/jumbo v2, "request"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {v4}, Lcom/geetest/captcha/x;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 22
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "HandlerImpl.onFailure: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 23
    iget-object v0, v4, Lcom/geetest/captcha/x;->d:Lcom/geetest/captcha/a0;

    if-ne v0, v3, :cond_3

    .line 24
    iget-object v0, v4, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/geetest/captcha/e;->a()V

    :cond_2
    const/4 v0, 0x0

    .line 25
    iput-object v0, v4, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    .line 26
    invoke-virtual {v4, p1}, Lcom/geetest/captcha/x;->a(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMsg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorDesc"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    invoke-virtual {v0}, Lcom/geetest/captcha/x;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    sget-object v1, Lcom/geetest/captcha/a0;->FAIL:Lcom/geetest/captcha/a0;

    invoke-virtual {v0, v1}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0;)V

    .line 29
    iget-object v0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    .line 30
    iget-object v0, v0, Lcom/geetest/captcha/x;->d:Lcom/geetest/captcha/a0;

    .line 31
    invoke-virtual {v0}, Lcom/geetest/captcha/a0;->getType()Ljava/lang/String;

    move-result-object v0

    .line 32
    const-string v2, "code"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 34
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "desc"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 36
    :try_start_0
    invoke-virtual {v4, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    invoke-virtual {v4, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "jsonObject.toString()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    sget-object p2, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "WebViewHandler.HandlerObserver.onError: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "WebViewHandler"

    invoke-virtual {p2, v0, p3}, Lcom/geetest/captcha/utils/LogUtils;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    iget-object p3, p0, Lcom/geetest/captcha/b0$a;->b:Lcom/geetest/captcha/q;

    iget-object v0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    const-string/jumbo p3, "request"

    invoke-static {v0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "error"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {v0}, Lcom/geetest/captcha/x;->a()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    .line 45
    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v2, "HandlerImpl.onFailure: "

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 46
    iget-object p2, v0, Lcom/geetest/captcha/x;->d:Lcom/geetest/captcha/a0;

    if-ne p2, v1, :cond_3

    .line 47
    iget-object p2, v0, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/geetest/captcha/e;->a()V

    :cond_2
    const/4 p2, 0x0

    .line 48
    iput-object p2, v0, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    .line 49
    invoke-virtual {v0, p1}, Lcom/geetest/captcha/x;->a(Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final a(ZLjava/lang/String;)V
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v1, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    invoke-virtual {v1}, Lcom/geetest/captcha/x;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    sget-object v1, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "HandlerObserver.onResult: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "WebViewHandler"

    invoke-virtual {v1, v3, v2}, Lcom/geetest/captcha/utils/LogUtils;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v1, "request"

    if-eqz p1, :cond_3

    .line 52
    iget-object p1, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    sget-object v2, Lcom/geetest/captcha/a0;->END:Lcom/geetest/captcha/a0;

    invoke-virtual {p1, v2}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0;)V

    .line 53
    iget-object p1, p0, Lcom/geetest/captcha/b0$a;->b:Lcom/geetest/captcha/q;

    iget-object v2, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual {v2}, Lcom/geetest/captcha/x;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 56
    :cond_1
    iget-object p1, v2, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/geetest/captcha/e;->a()V

    :cond_2
    const/4 p1, 0x0

    .line 57
    iput-object p1, v2, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    const/4 p1, 0x1

    .line 58
    invoke-virtual {v2, p1, p2}, Lcom/geetest/captcha/x;->a(ZLjava/lang/String;)V

    return-void

    .line 59
    :cond_3
    iget-object p1, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    sget-object v2, Lcom/geetest/captcha/a0;->FLOWING:Lcom/geetest/captcha/a0;

    invoke-virtual {p1, v2}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0;)V

    .line 60
    iget-object p1, p0, Lcom/geetest/captcha/b0$a;->b:Lcom/geetest/captcha/q;

    iget-object v2, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual {v2}, Lcom/geetest/captcha/x;->a()Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_0
    return-void

    :cond_4
    const/4 p1, 0x0

    .line 63
    invoke-virtual {v2, p1, p2}, Lcom/geetest/captcha/x;->a(ZLjava/lang/String;)V

    return-void
.end method

.method public final b()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/geetest/captcha/x;->a()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    .line 12
    .line 13
    const-string v1, "WebViewHandler"

    .line 14
    .line 15
    const-string v2, "WebViewHandler.HandlerObserver.onClose"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lcom/geetest/captcha/utils/LogUtils;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    iget-object v1, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    .line 21
    .line 22
    sget-object v2, Lcom/geetest/captcha/a0;->FAIL:Lcom/geetest/captcha/a0;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0;)V

    .line 26
    .line 27
    sget-object v1, Lcom/geetest/captcha/a0;->CANCEL:Lcom/geetest/captcha/a0;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/geetest/captcha/a0;->getType()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    sget-object v3, Lcom/geetest/captcha/i;->USER_ERROR:Lcom/geetest/captcha/i;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/geetest/captcha/i;->getType()Ljava/lang/String;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v3, "60"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    const-string v3, "code"

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    new-instance v4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    sget-object v2, Lcom/geetest/captcha/j;->f:Ljava/lang/String;

    .line 77
    .line 78
    new-instance v4, Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 82
    .line 83
    const-string v5, "description"

    .line 84
    .line 85
    const-string v6, "User cancelled \'Captcha\'"

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    .line 90
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    const-string v5, "msg"

    .line 96
    .line 97
    .line 98
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    const-string v6, "desc"

    .line 101
    .line 102
    .line 103
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    new-instance v7, Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 109
    .line 110
    .line 111
    :try_start_0
    invoke-virtual {v7, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v7, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    goto :goto_0

    .line 119
    :catch_0
    move-exception v1

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 123
    .line 124
    .line 125
    :goto_0
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 126
    move-result-object v1

    .line 127
    .line 128
    const-string v2, "jsonObject.toString()"

    .line 129
    .line 130
    .line 131
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    new-instance v2, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v3, "WebViewHandler: "

    .line 136
    .line 137
    .line 138
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    move-result-object v2

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v2}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 149
    .line 150
    iget-object v0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    .line 151
    .line 152
    iget-object v2, v0, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    .line 153
    .line 154
    if-eqz v2, :cond_1

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lcom/geetest/captcha/e;->a()V

    .line 158
    :cond_1
    const/4 v2, 0x0

    .line 159
    .line 160
    iput-object v2, v0, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    .line 161
    .line 162
    iget-object v0, p0, Lcom/geetest/captcha/b0$a;->a:Lcom/geetest/captcha/x;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1}, Lcom/geetest/captcha/x;->a(Ljava/lang/String;)V

    .line 166
    return-void
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
.end method
