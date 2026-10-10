.class public final Lcom/geetest/captcha/b0;
.super Lcom/geetest/captcha/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/geetest/captcha/b0$a;
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
    const/4 v0, 0x5

    return v0
.end method

.method public final a(Lcom/geetest/captcha/x;)V
    .locals 7
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

    goto/16 :goto_0

    .line 3
    :cond_0
    sget-object v0, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    const-string v1, "Step: WebViewHandler.handler"

    invoke-virtual {v0, v1}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 4
    new-instance v1, Lcom/geetest/captcha/b0$a;

    invoke-direct {v1, p1, p0}, Lcom/geetest/captcha/b0$a;-><init>(Lcom/geetest/captcha/x;Lcom/geetest/captcha/q;)V

    .line 5
    sget-object v2, Lcom/geetest/captcha/a0;->FLOWING:Lcom/geetest/captcha/a0;

    invoke-virtual {p1, v2}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0;)V

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "currentStatus preLoadStatus: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p1, Lcom/geetest/captcha/x;->c:Lcom/geetest/captcha/a0$a;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p1, Lcom/geetest/captcha/x;->d:Lcom/geetest/captcha/a0;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Request"

    invoke-virtual {v0, v3, v2}, Lcom/geetest/captcha/utils/LogUtils;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v0, p1, Lcom/geetest/captcha/x;->c:Lcom/geetest/captcha/a0$a;

    .line 8
    sget-object v2, Lcom/geetest/captcha/a0$a;->FLOWING:Lcom/geetest/captcha/a0$a;

    const-string/jumbo v3, "webViewObserver"

    const-string v4, "dataBean"

    const-string v5, "context"

    if-ne v0, v2, :cond_1

    .line 9
    iget-object v0, p1, Lcom/geetest/captcha/x;->a:Landroid/content/Context;

    .line 10
    iget-object v2, p1, Lcom/geetest/captcha/x;->b:Lcom/geetest/captcha/d;

    .line 11
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iget-object p1, p1, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz p1, :cond_7

    invoke-virtual {p1, v0, v2, v1}, Lcom/geetest/captcha/e;->a(Landroid/content/Context;Lcom/geetest/captcha/d;Lcom/geetest/captcha/b0$a;)V

    return-void

    .line 13
    :cond_1
    sget-object v2, Lcom/geetest/captcha/a0$a;->SUCCESS:Lcom/geetest/captcha/a0$a;

    if-ne v0, v2, :cond_3

    .line 14
    iget-object v0, p1, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/geetest/captcha/e;->b()V

    .line 15
    :cond_2
    invoke-virtual {p1}, Lcom/geetest/captcha/x;->b()V

    .line 16
    iget-object v0, p1, Lcom/geetest/captcha/x;->a:Landroid/content/Context;

    .line 17
    iget-object v2, p1, Lcom/geetest/captcha/x;->b:Lcom/geetest/captcha/d;

    .line 18
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object p1, p1, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz p1, :cond_7

    invoke-virtual {p1, v0, v2, v1}, Lcom/geetest/captcha/e;->a(Landroid/content/Context;Lcom/geetest/captcha/d;Lcom/geetest/captcha/b0$a;)V

    return-void

    .line 20
    :cond_3
    sget-object v2, Lcom/geetest/captcha/a0$a;->FAIL:Lcom/geetest/captcha/a0$a;

    if-ne v0, v2, :cond_5

    .line 21
    iget-object v0, p1, Lcom/geetest/captcha/x;->a:Landroid/content/Context;

    .line 22
    iget-object v2, p1, Lcom/geetest/captcha/x;->b:Lcom/geetest/captcha/d;

    .line 23
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iget-object v6, p1, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz v6, :cond_4

    invoke-virtual {v6, v0, v2, v1}, Lcom/geetest/captcha/e;->a(Landroid/content/Context;Lcom/geetest/captcha/d;Lcom/geetest/captcha/d0;)V

    .line 25
    :cond_4
    iget-object v0, p1, Lcom/geetest/captcha/x;->d:Lcom/geetest/captcha/a0;

    .line 26
    sget-object v2, Lcom/geetest/captcha/a0;->FAIL:Lcom/geetest/captcha/a0;

    if-eq v0, v2, :cond_7

    .line 27
    iget-object v0, p1, Lcom/geetest/captcha/x;->a:Landroid/content/Context;

    .line 28
    iget-object v2, p1, Lcom/geetest/captcha/x;->b:Lcom/geetest/captcha/d;

    .line 29
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-object p1, p1, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz p1, :cond_7

    invoke-virtual {p1, v0, v2, v1}, Lcom/geetest/captcha/e;->a(Landroid/content/Context;Lcom/geetest/captcha/d;Lcom/geetest/captcha/b0$a;)V

    return-void

    .line 31
    :cond_5
    sget-object v2, Lcom/geetest/captcha/a0$a;->NONE:Lcom/geetest/captcha/a0$a;

    if-ne v0, v2, :cond_7

    .line 32
    iget-object v0, p1, Lcom/geetest/captcha/x;->a:Landroid/content/Context;

    .line 33
    iget-object v2, p1, Lcom/geetest/captcha/x;->b:Lcom/geetest/captcha/d;

    .line 34
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iget-object v6, p1, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz v6, :cond_6

    invoke-virtual {v6, v0, v2, v1}, Lcom/geetest/captcha/e;->a(Landroid/content/Context;Lcom/geetest/captcha/d;Lcom/geetest/captcha/d0;)V

    .line 36
    :cond_6
    iget-object v0, p1, Lcom/geetest/captcha/x;->d:Lcom/geetest/captcha/a0;

    .line 37
    sget-object v2, Lcom/geetest/captcha/a0;->FAIL:Lcom/geetest/captcha/a0;

    if-eq v0, v2, :cond_7

    .line 38
    iget-object v0, p1, Lcom/geetest/captcha/x;->a:Landroid/content/Context;

    .line 39
    iget-object v2, p1, Lcom/geetest/captcha/x;->b:Lcom/geetest/captcha/d;

    .line 40
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iget-object p1, p1, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    if-eqz p1, :cond_7

    invoke-virtual {p1, v0, v2, v1}, Lcom/geetest/captcha/e;->a(Landroid/content/Context;Lcom/geetest/captcha/d;Lcom/geetest/captcha/b0$a;)V

    :cond_7
    :goto_0
    return-void
.end method
