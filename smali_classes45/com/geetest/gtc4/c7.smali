.class public abstract Lcom/geetest/gtc4/c7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Landroid/content/Intent;Lcom/geetest/gtc4/b7;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/d7;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/geetest/gtc4/d7;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/geetest/gtc4/e7;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0, p2, v0}, Lcom/geetest/gtc4/e7;-><init>(Landroid/content/Context;Lcom/geetest/gtc4/b7;Lcom/geetest/gtc4/d7;)V

    .line 11
    .line 12
    :try_start_0
    iget-object p0, v1, Lcom/geetest/gtc4/e7;->a:Landroid/app/Application;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    iget-object p0, v1, Lcom/geetest/gtc4/e7;->b:Lcom/geetest/gtc4/b7;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string p2, "Cannot get activity"

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    iget-object p0, p0, Lcom/geetest/gtc4/b7;->b:Ljava/util/concurrent/CountDownLatch;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 29
    return-void

    .line 30
    :cond_0
    const/4 p2, 0x1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1, v1, p2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 34
    move-result p0

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string p1, "Service binding failed"

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    :catch_0
    iget-object p0, v1, Lcom/geetest/gtc4/e7;->b:Lcom/geetest/gtc4/b7;

    .line 48
    .line 49
    iget-object p0, p0, Lcom/geetest/gtc4/b7;->b:Ljava/util/concurrent/CountDownLatch;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 53
    :goto_0
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
.end method
