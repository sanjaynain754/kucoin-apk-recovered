.class Landroidx/camera/video/Recorder$SetupVideoTask$1;
.super Ljava/lang/Object;
.source "Recorder.java"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/FutureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/video/Recorder$SetupVideoTask;->setupVideo(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/utils/futures/FutureCallback<",
        "Landroidx/camera/video/internal/encoder/Encoder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

.field final synthetic val$videoEncoderSession:Landroidx/camera/video/VideoEncoderSession;


# direct methods
.method public constructor <init>(Landroidx/camera/video/Recorder$SetupVideoTask;Landroidx/camera/video/VideoEncoderSession;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 3
    .line 4
    iput-object p2, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->val$videoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method public static synthetic a(Landroidx/camera/video/Recorder$SetupVideoTask$1;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$1000(Landroidx/camera/video/Recorder$SetupVideoTask;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    const-string v1, "Retry setupVideo #"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$600(Landroidx/camera/video/Recorder$SetupVideoTask;)I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    const-string v1, "Recorder"

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$1100(Landroidx/camera/video/Recorder$SetupVideoTask;)Landroidx/camera/core/SurfaceRequest;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    iget-object p0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$1200(Landroidx/camera/video/Recorder$SetupVideoTask;)Landroidx/camera/core/impl/Timebase;

    .line 48
    move-result-object p0

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1, p0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$1300(Landroidx/camera/video/Recorder$SetupVideoTask;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V

    .line 52
    :cond_0
    return-void
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
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "VideoEncoder Setup error: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-string v1, "Recorder"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0, p1}, Landroidx/camera/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$600(Landroidx/camera/video/Recorder$SetupVideoTask;)I

    .line 28
    move-result v0

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$700(Landroidx/camera/video/Recorder$SetupVideoTask;)I

    .line 34
    move-result v1

    .line 35
    .line 36
    if-ge v0, v1, :cond_0

    .line 37
    .line 38
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$608(Landroidx/camera/video/Recorder$SetupVideoTask;)I

    .line 42
    .line 43
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 44
    .line 45
    new-instance v0, Landroidx/camera/video/i0;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, p0}, Landroidx/camera/video/i0;-><init>(Landroidx/camera/video/Recorder$SetupVideoTask$1;)V

    .line 49
    .line 50
    iget-object v1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 51
    .line 52
    iget-object v1, v1, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 53
    .line 54
    iget-object v1, v1, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 55
    .line 56
    sget-wide v2, Landroidx/camera/video/Recorder;->sRetrySetupVideoDelayMs:J

    .line 57
    .line 58
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1, v2, v3, v4}, Landroidx/camera/video/Recorder;->access$900(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$802(Landroidx/camera/video/Recorder$SetupVideoTask;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    .line 66
    return-void

    .line 67
    .line 68
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 69
    .line 70
    iget-object v0, v0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1}, Landroidx/camera/video/Recorder;->onEncoderSetupError(Ljava/lang/Throwable;)V

    .line 74
    return-void
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public onSuccess(Landroidx/camera/video/internal/encoder/Encoder;)V
    .locals 3

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoEncoder is created. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    iget-object p1, p1, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    iget-object p1, p1, Landroidx/camera/video/Recorder;->mVideoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->val$videoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    invoke-static {p1}, Landroidx/core/util/Preconditions;->checkState(Z)V

    .line 4
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    iget-object p1, p1, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    iget-object p1, p1, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    if-nez p1, :cond_2

    move v1, v2

    :cond_2
    invoke-static {v1}, Landroidx/core/util/Preconditions;->checkState(Z)V

    .line 5
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    iget-object p1, p1, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->val$videoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    invoke-virtual {p1, v0}, Landroidx/camera/video/Recorder;->onVideoEncoderReady(Landroidx/camera/video/VideoEncoderSession;)V

    .line 6
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    iget-object p1, p1, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    invoke-virtual {p1}, Landroidx/camera/video/Recorder;->onConfigured()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/camera/video/internal/encoder/Encoder;

    invoke-virtual {p0, p1}, Landroidx/camera/video/Recorder$SetupVideoTask$1;->onSuccess(Landroidx/camera/video/internal/encoder/Encoder;)V

    return-void
.end method
