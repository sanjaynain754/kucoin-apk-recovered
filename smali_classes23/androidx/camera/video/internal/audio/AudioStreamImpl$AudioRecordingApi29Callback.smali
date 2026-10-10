.class Landroidx/camera/video/internal/audio/AudioStreamImpl$AudioRecordingApi29Callback;
.super Landroid/media/AudioManager$AudioRecordingCallback;
.source "AudioStreamImpl.java"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1d
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/video/internal/audio/AudioStreamImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AudioRecordingApi29Callback"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/camera/video/internal/audio/AudioStreamImpl;


# direct methods
.method public constructor <init>(Landroidx/camera/video/internal/audio/AudioStreamImpl;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/camera/video/internal/audio/AudioStreamImpl$AudioRecordingApi29Callback;->this$0:Landroidx/camera/video/internal/audio/AudioStreamImpl;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/media/AudioManager$AudioRecordingCallback;-><init>()V

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
.end method


# virtual methods
.method public onRecordingConfigChanged(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/AudioRecordingConfiguration;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Landroid/media/AudioRecordingConfiguration;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Landroidx/camera/video/internal/compat/Api24Impl;->getClientAudioSessionId(Landroid/media/AudioRecordingConfiguration;)I

    .line 20
    move-result v1

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/camera/video/internal/audio/AudioStreamImpl$AudioRecordingApi29Callback;->this$0:Landroidx/camera/video/internal/audio/AudioStreamImpl;

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Landroidx/camera/video/internal/audio/AudioStreamImpl;->access$000(Landroidx/camera/video/internal/audio/AudioStreamImpl;)Landroid/media/AudioRecord;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/media/AudioRecord;->getAudioSessionId()I

    .line 30
    move-result v2

    .line 31
    .line 32
    if-ne v1, v2, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Landroidx/camera/video/internal/compat/Api29Impl;->isClientSilenced(Landroid/media/AudioRecordingConfiguration;)Z

    .line 36
    move-result p1

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/camera/video/internal/audio/AudioStreamImpl$AudioRecordingApi29Callback;->this$0:Landroidx/camera/video/internal/audio/AudioStreamImpl;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroidx/camera/video/internal/audio/AudioStreamImpl;->notifySilenced(Z)V

    .line 42
    :cond_1
    return-void
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
.end method
