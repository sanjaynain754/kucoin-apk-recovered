.class public Lcom/tencent/bugly/proguard/o1$a;
.super Landroid/os/Handler;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/bugly/proguard/o1;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/o1;Landroid/os/Looper;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/o1$a;->a:Lcom/tencent/bugly/proguard/o1;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

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
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    .line 2
    iget p1, p1, Landroid/os/Message;->what:I

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    move-result-wide v1

    .line 10
    .line 11
    iget-object p1, p0, Lcom/tencent/bugly/proguard/o1$a;->a:Lcom/tencent/bugly/proguard/o1;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1, v2}, Lcom/tencent/bugly/proguard/o1;->a(J)V

    .line 15
    .line 16
    iget-object p1, p0, Lcom/tencent/bugly/proguard/o1$a;->a:Lcom/tencent/bugly/proguard/o1;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1, v2}, Lcom/tencent/bugly/proguard/o1;->f(J)V

    .line 20
    .line 21
    iget-object p1, p0, Lcom/tencent/bugly/proguard/o1$a;->a:Lcom/tencent/bugly/proguard/o1;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/o1;->d()V

    .line 25
    .line 26
    iget-object p1, p0, Lcom/tencent/bugly/proguard/o1$a;->a:Lcom/tencent/bugly/proguard/o1;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1, v2}, Lcom/tencent/bugly/proguard/o1;->c(J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    const-wide/32 v0, 0xea60

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 40
    :cond_0
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
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
.end method
