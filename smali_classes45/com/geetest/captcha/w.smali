.class public final Lcom/geetest/captcha/w;
.super Lcom/geetest/captcha/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/geetest/captcha/w$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/captcha/q;-><init>()V

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


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public final a(Lcom/geetest/captcha/x;)V
    .locals 4
    .param p1    # Lcom/geetest/captcha/x;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/geetest/captcha/x;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    const-string v1, "Step: PreLoadHandler.handler"

    invoke-virtual {v0, v1}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/geetest/captcha/a0$a;->FLOWING:Lcom/geetest/captcha/a0$a;

    invoke-virtual {p1, v0}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0$a;)V

    .line 5
    new-instance v0, Lcom/geetest/captcha/w$a;

    invoke-direct {v0, p1, p0}, Lcom/geetest/captcha/w$a;-><init>(Lcom/geetest/captcha/x;Lcom/geetest/captcha/q;)V

    .line 6
    iget-object v1, p1, Lcom/geetest/captcha/x;->a:Landroid/content/Context;

    .line 7
    iget-object v2, p1, Lcom/geetest/captcha/x;->b:Lcom/geetest/captcha/d;

    .line 8
    const-string v3, "context"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "dataBean"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "webViewObserver"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object p1, p1, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v1, v2, v0}, Lcom/geetest/captcha/e;->a(Landroid/content/Context;Lcom/geetest/captcha/d;Lcom/geetest/captcha/d0;)V

    :cond_1
    :goto_0
    return-void
.end method
