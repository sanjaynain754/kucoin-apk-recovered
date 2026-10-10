.class public Lai/advance/common/recorder_old/VideoRecorder$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lai/advance/common/recorder_old/VideoRecorder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic b:Lai/advance/common/recorder_old/VideoRecorder;


# direct methods
.method public constructor <init>(Lai/advance/common/recorder_old/VideoRecorder;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder$a;->b:Lai/advance/common/recorder_old/VideoRecorder;

    .line 3
    .line 4
    .line 5
    const-string/jumbo p1, "liveness_video_recorder_thread"

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 9
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder$a;->b:Lai/advance/common/recorder_old/VideoRecorder;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lai/advance/common/recorder_old/VideoRecorder;->b(Lai/advance/common/recorder_old/VideoRecorder;J)J

    .line 10
    .line 11
    :cond_0
    :goto_0
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder$a;->b:Lai/advance/common/recorder_old/VideoRecorder;

    .line 12
    .line 13
    iget-boolean v0, v0, Lai/advance/common/recorder_old/VideoRecorder;->s:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    :try_start_0
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder$a;->b:Lai/advance/common/recorder_old/VideoRecorder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lai/advance/common/recorder_old/VideoRecorder;->k()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    :catch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    move-result-wide v0

    .line 25
    .line 26
    iget-object v2, p0, Lai/advance/common/recorder_old/VideoRecorder$a;->b:Lai/advance/common/recorder_old/VideoRecorder;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lai/advance/common/recorder_old/VideoRecorder;->a(Lai/advance/common/recorder_old/VideoRecorder;)J

    .line 30
    move-result-wide v2

    .line 31
    sub-long/2addr v0, v2

    .line 32
    .line 33
    iget-object v2, p0, Lai/advance/common/recorder_old/VideoRecorder$a;->b:Lai/advance/common/recorder_old/VideoRecorder;

    .line 34
    .line 35
    iget v3, v2, Lai/advance/common/recorder_old/VideoRecorder;->f:I

    .line 36
    int-to-long v3, v3

    .line 37
    .line 38
    cmp-long v0, v0, v3

    .line 39
    .line 40
    if-ltz v0, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Lai/advance/common/recorder_old/VideoRecorder;->u()V

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 48
    return-void
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
.end method
