.class public final Lcom/geetest/captcha/utils/a;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/geetest/captcha/utils/LogUtils$a;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/geetest/captcha/utils/LogUtils$a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p2, p0, Lcom/geetest/captcha/utils/a;->a:Lcom/geetest/captcha/utils/LogUtils$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

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


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5
    .param p1    # Landroid/os/Message;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "msg"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    goto :goto_1

    .line 16
    .line 17
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    const/4 p1, 0x1

    .line 21
    .line 22
    if-eq v0, p1, :cond_1

    .line 23
    goto :goto_1

    .line 24
    .line 25
    :cond_1
    sget-object p1, Lcom/geetest/captcha/utils/LogUtils$a;->c:Ljava/text/SimpleDateFormat;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/geetest/captcha/utils/LogUtils$a$a;->a()V

    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    check-cast p1, Lcom/geetest/captcha/utils/LogUtils$a$b;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/geetest/captcha/utils/a;->a:Lcom/geetest/captcha/utils/LogUtils$a;

    .line 40
    .line 41
    sget-object v1, Lcom/geetest/captcha/utils/LogUtils$a;->c:Ljava/text/SimpleDateFormat;

    .line 42
    .line 43
    iget-wide v2, p1, Lcom/geetest/captcha/utils/LogUtils$a$b;->a:J

    .line 44
    .line 45
    iget-object v4, p1, Lcom/geetest/captcha/utils/LogUtils$a$b;->b:Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, p1, Lcom/geetest/captcha/utils/LogUtils$a$b;->c:Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v2, v3, v4, p1}, Lcom/geetest/captcha/utils/LogUtils$a$a;->a(Ljava/text/SimpleDateFormat;JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    .line 54
    invoke-static {v0, p1}, Lcom/geetest/captcha/utils/LogUtils$a;->a(Lcom/geetest/captcha/utils/LogUtils$a;Ljava/lang/String;)V

    .line 55
    return-void

    .line 56
    .line 57
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 58
    .line 59
    const-string v0, "null cannot be cast to non-null type com.geetest.captcha.utils.LogUtils.Logger.Item"

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 63
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 67
    :goto_1
    return-void
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
