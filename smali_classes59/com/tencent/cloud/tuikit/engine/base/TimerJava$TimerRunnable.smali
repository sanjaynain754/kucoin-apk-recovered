.class Lcom/tencent/cloud/tuikit/engine/base/TimerJava$TimerRunnable;
.super Ljava/lang/Object;
.source "TimerJava.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/base/TimerJava;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TimerRunnable"
.end annotation


# instance fields
.field private mInterval:J

.field private mTimerId:I

.field final synthetic this$0:Lcom/tencent/cloud/tuikit/engine/base/TimerJava;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/base/TimerJava;IJ)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/base/TimerJava$TimerRunnable;->this$0:Lcom/tencent/cloud/tuikit/engine/base/TimerJava;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput p2, p0, Lcom/tencent/cloud/tuikit/engine/base/TimerJava$TimerRunnable;->mTimerId:I

    .line 8
    .line 9
    iput-wide p3, p0, Lcom/tencent/cloud/tuikit/engine/base/TimerJava$TimerRunnable;->mInterval:J

    .line 10
    return-void
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
    .line 105
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/base/TimerJava$TimerRunnable;->this$0:Lcom/tencent/cloud/tuikit/engine/base/TimerJava;

    .line 3
    .line 4
    iget v1, p0, Lcom/tencent/cloud/tuikit/engine/base/TimerJava$TimerRunnable;->mTimerId:I

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/base/TimerJava;->access$000(Lcom/tencent/cloud/tuikit/engine/base/TimerJava;I)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/base/TimerJava$TimerRunnable;->this$0:Lcom/tencent/cloud/tuikit/engine/base/TimerJava;

    .line 13
    .line 14
    iget v1, p0, Lcom/tencent/cloud/tuikit/engine/base/TimerJava$TimerRunnable;->mTimerId:I

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/base/TimerJava;->access$100(Lcom/tencent/cloud/tuikit/engine/base/TimerJava;I)V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/base/TimerJava$TimerRunnable;->this$0:Lcom/tencent/cloud/tuikit/engine/base/TimerJava;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/base/TimerJava;->access$200(Lcom/tencent/cloud/tuikit/engine/base/TimerJava;)Landroid/os/Handler;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/base/TimerJava$TimerRunnable;->mInterval:J

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 29
    :cond_0
    return-void
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
.end method
