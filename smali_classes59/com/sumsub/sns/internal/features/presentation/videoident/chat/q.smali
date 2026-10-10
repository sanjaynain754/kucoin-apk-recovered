.class public final Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public a:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/B;

.field public b:Lkotlinx/coroutines/x1;

.field public c:J

.field public d:Z

.field public final e:Lkotlinx/coroutines/flow/e;

.field public final f:Lkotlinx/coroutines/m0;

.field public final g:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;

.field public h:Lcom/twilio/video/LocalDataTrack;

.field public i:Lcom/twilio/video/LocalAudioTrack;

.field public j:Lcom/twilio/video/LocalVideoTrack;

.field public k:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/a;

.field public l:Lcom/twilio/video/LocalParticipant;

.field public m:Lcom/twilio/video/Room;

.field public final n:Lkotlinx/coroutines/flow/n;

.field public o:Lkotlin/jvm/functions/Function1;

.field public final p:Lkotlinx/coroutines/flow/r;

.field public q:Lkotlin/jvm/functions/Function0;

.field public r:Lkotlin/jvm/functions/Function1;

.field public s:Lkotlin/jvm/functions/Function0;

.field public final t:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/f;

.field public final u:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/j;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->e:Lkotlinx/coroutines/flow/e;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->f:Lkotlinx/coroutines/m0;

    .line 26
    .line 27
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;-><init>()V

    .line 31
    .line 32
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/h;

    .line 33
    .line 34
    .line 35
    invoke-direct {v5, v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;Lkotlin/coroutines/Continuation;)V

    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 43
    .line 44
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->g:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;

    .line 45
    .line 46
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/x;

    .line 47
    .line 48
    .line 49
    invoke-direct {v3}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/x;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-static {v3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    iput-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->n:Lkotlinx/coroutines/flow/n;

    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v4, 0x7

    .line 58
    .line 59
    .line 60
    invoke-static {v3, v3, v1, v4, v1}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->h:Lkotlinx/coroutines/flow/m;

    .line 64
    const/4 v4, 0x2

    .line 65
    .line 66
    new-array v4, v4, [Lkotlinx/coroutines/flow/e;

    .line 67
    .line 68
    aput-object v0, v4, v3

    .line 69
    const/4 v0, 0x1

    .line 70
    .line 71
    aput-object v1, v4, v0

    .line 72
    .line 73
    .line 74
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    sget-object v3, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getLazily()Lkotlinx/coroutines/flow/SharingStarted;

    .line 81
    move-result-object v3

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v2, v3, v0}, Lkotlinx/coroutines/flow/g;->d0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;I)Lkotlinx/coroutines/flow/r;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->p:Lkotlinx/coroutines/flow/r;

    .line 88
    .line 89
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/f;

    .line 90
    .line 91
    .line 92
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/f;-><init>()V

    .line 93
    .line 94
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->t:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/f;

    .line 95
    .line 96
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/j;

    .line 97
    .line 98
    .line 99
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;)V

    .line 100
    .line 101
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->u:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/j;

    .line 102
    return-void
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
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
.end method

.method public static a(Lcom/twilio/video/VideoCodec;)Lcom/twilio/video/VideoCodec;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;)Lkotlin/Unit;
    .locals 6

    .line 35
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->f:Lkotlinx/coroutines/m0;

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/k;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 36
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 8

    .line 37
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/twilio/video/LocalVideoTrack;->getVideoSource()Ltvi/webrtc/VideoSource;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Ltvi/webrtc/VideoSource;->setVideoProcessor(Ltvi/webrtc/VideoProcessor;)V

    .line 38
    :cond_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->f:Lkotlinx/coroutines/m0;

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/n;

    invoke-direct {v5, p1, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/n;-><init>(Landroid/graphics/Bitmap;Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, -0x3

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, -0x2

    if-eq p1, v0, :cond_2

    if-eq p1, v2, :cond_2

    if-eq p1, v3, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    .line 2
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/d;->a:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/d;

    goto :goto_1

    .line 3
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/b;

    if-eq p1, v3, :cond_1

    move v1, v3

    :cond_1
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/b;-><init>(Z)V

    :goto_0
    move-object p1, v0

    goto :goto_1

    .line 4
    :cond_2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/c;

    if-eq p1, v2, :cond_3

    move v1, v3

    :cond_3
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/c;-><init>(Z)V

    goto :goto_0

    .line 5
    :goto_1
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->a(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/FocusStatus;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 79
    const-string v0, "disconnect"

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    .line 80
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->g:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;

    .line 81
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->e:Lcom/twilio/video/VideoTextureView;

    if-eqz v1, :cond_0

    .line 82
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->d:Lcom/twilio/video/RemoteVideoTrack;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Lcom/twilio/video/RemoteVideoTrack;->removeSink(Ltvi/webrtc/VideoSink;)V

    :cond_0
    const/4 v1, 0x0

    .line 83
    iput-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->d:Lcom/twilio/video/RemoteVideoTrack;

    .line 84
    iput-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->e:Lcom/twilio/video/VideoTextureView;

    .line 85
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->f:Lkotlinx/coroutines/flow/n;

    .line 86
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/e;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, v2}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/e;-><init>(ZZZ)V

    .line 87
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 88
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->m:Lcom/twilio/video/Room;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/twilio/video/Room;->disconnect()V

    :cond_1
    return-void
.end method

.method public final a(Landroid/content/Context;)V
    .locals 8

    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    const-string v1, "Required value was null."

    if-eqz v0, :cond_1

    .line 13
    const-string/jumbo p1, "startVideoTracking: video already started"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    if-eqz p1, :cond_0

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;-><init>()V

    .line 16
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;->FRONT_CAMERA:Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    invoke-virtual {v0, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->a(Landroid/content/Context;Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;)Z

    move-result v2

    .line 17
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->a()Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "startLocalVideoTracking: camera="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    if-eqz v2, :cond_4

    .line 18
    new-instance v2, Lcom/twilio/video/VideoFormat;

    .line 19
    sget-object v3, Lcom/twilio/video/VideoDimensions;->HD_1080P_VIDEO_DIMENSIONS:Lcom/twilio/video/VideoDimensions;

    const/16 v4, 0x18

    .line 20
    invoke-direct {v2, v3, v4}, Lcom/twilio/video/VideoFormat;-><init>(Lcom/twilio/video/VideoDimensions;I)V

    const/4 v3, 0x1

    .line 21
    invoke-static {p1, v3, v0, v2}, Lcom/twilio/video/LocalVideoTrack;->create(Landroid/content/Context;ZLtvi/webrtc/VideoCapturer;Lcom/twilio/video/VideoFormat;)Lcom/twilio/video/LocalVideoTrack;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 22
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->l:Lcom/twilio/video/LocalParticipant;

    if-eqz v0, :cond_3

    .line 23
    invoke-virtual {v0, p1}, Lcom/twilio/video/LocalParticipant;->publishTrack(Lcom/twilio/video/LocalVideoTrack;)Z

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 24
    :cond_3
    :goto_0
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    .line 25
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    if-nez p1, :cond_5

    .line 26
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object p1, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {p1}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object p1

    .line 27
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v2

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 28
    const-string v3, "SNSVideoIdent"

    const-string/jumbo v4, "startLocalVideoTracking: error creating local video track"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 29
    :cond_5
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/a;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/a;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->k:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/a;

    .line 30
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/p;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;)V

    .line 31
    iput-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/a;->b:Lkotlin/jvm/functions/Function0;

    .line 32
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->k:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/a;

    if-eqz p1, :cond_6

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/r;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;)V

    .line 33
    iput-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/a;->c:Lkotlin/jvm/functions/Function1;

    .line 34
    :cond_6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    if-eqz p1, :cond_7

    :goto_1
    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 44
    new-instance v0, Lcom/twilio/video/Vp8Codec;

    invoke-direct {v0}, Lcom/twilio/video/Vp8Codec;-><init>()V

    const-string/jumbo v1, "vp8"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 45
    new-instance v1, Lcom/twilio/video/H264Codec;

    invoke-direct {v1}, Lcom/twilio/video/H264Codec;-><init>()V

    const-string v2, "h264"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    .line 46
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 47
    sget-object v1, Lcom/sumsub/sns/internal/ff/a;->d:Lcom/sumsub/sns/internal/ff/core/a;

    .line 48
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/ff/core/a;->b()Lcom/sumsub/sns/internal/ff/core/c;

    move-result-object v2

    .line 49
    iget-object v2, v2, Lcom/sumsub/sns/internal/ff/core/c;->b:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 50
    iget-object v1, v1, Lcom/sumsub/sns/internal/ff/core/a;->g:Lcom/sumsub/sns/internal/ff/core/c;

    .line 51
    iget-object v2, v1, Lcom/sumsub/sns/internal/ff/core/c;->b:Ljava/lang/String;

    :cond_0
    if-eqz v2, :cond_7

    .line 52
    sget-boolean v1, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 53
    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/J;->a(Z)Lxg0/a;

    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lxg0/a;->getSerializersModule()Lyg0/a;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/F;->Companion:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/E;

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/E;->serializer()Ltg0/d;

    move-result-object v3

    check-cast v3, Ltg0/c;

    invoke-virtual {v1, v3, v2}, Lxg0/a;->a(Ltg0/c;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 55
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/F;

    .line 56
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/F;->a:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 57
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/twilio/video/VideoCodec;

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, Lcom/twilio/video/H264Codec;

    invoke-direct {v0}, Lcom/twilio/video/H264Codec;-><init>()V

    .line 58
    :cond_2
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->a(Lcom/twilio/video/VideoCodec;)Lcom/twilio/video/VideoCodec;

    move-result-object v0

    .line 59
    new-instance v1, Lcom/twilio/video/ConnectOptions$Builder;

    invoke-direct {v1, p2}, Lcom/twilio/video/ConnectOptions$Builder;-><init>(Ljava/lang/String;)V

    .line 60
    invoke-virtual {v1, p3}, Lcom/twilio/video/ConnectOptions$Builder;->roomName(Ljava/lang/String;)Lcom/twilio/video/ConnectOptions$Builder;

    move-result-object p2

    .line 61
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 62
    invoke-virtual {p2, p3}, Lcom/twilio/video/ConnectOptions$Builder;->preferVideoCodecs(Ljava/util/List;)Lcom/twilio/video/ConnectOptions$Builder;

    move-result-object p2

    .line 63
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->i:Lcom/twilio/video/LocalAudioTrack;

    if-eqz p3, :cond_3

    .line 64
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 65
    invoke-virtual {p2, p3}, Lcom/twilio/video/ConnectOptions$Builder;->audioTracks(Ljava/util/List;)Lcom/twilio/video/ConnectOptions$Builder;

    .line 66
    :cond_3
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->h:Lcom/twilio/video/LocalDataTrack;

    if-eqz p3, :cond_4

    .line 67
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 68
    invoke-virtual {p2, p3}, Lcom/twilio/video/ConnectOptions$Builder;->dataTracks(Ljava/util/List;)Lcom/twilio/video/ConnectOptions$Builder;

    .line 69
    :cond_4
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    if-eqz p3, :cond_5

    .line 70
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 71
    invoke-virtual {p2, p3}, Lcom/twilio/video/ConnectOptions$Builder;->videoTracks(Ljava/util/List;)Lcom/twilio/video/ConnectOptions$Builder;

    .line 72
    :cond_5
    invoke-virtual {p2}, Lcom/twilio/video/ConnectOptions$Builder;->build()Lcom/twilio/video/ConnectOptions;

    move-result-object p2

    .line 73
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->n:Lkotlinx/coroutines/flow/n;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/w;->a:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/w;

    invoke-interface {p3, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 74
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->u:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/j;

    .line 75
    invoke-static {p1, p2, p3}, Lcom/twilio/video/Video;->connect(Landroid/content/Context;Lcom/twilio/video/ConnectOptions;Lcom/twilio/video/Room$Listener;)Lcom/twilio/video/Room;

    move-result-object p1

    .line 76
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->m:Lcom/twilio/video/Room;

    .line 77
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->h:Lcom/twilio/video/LocalDataTrack;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/twilio/video/LocalDataTrack;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_6
    const/4 p1, 0x0

    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "connectToRoom: localDataTrack="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    return-void

    .line 78
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/FocusStatus;)V
    .locals 2

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleFocusStatusChange: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    .line 7
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/b;

    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->i:Lcom/twilio/video/LocalAudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/twilio/video/LocalAudioTrack;->enable(Z)V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->g:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;

    .line 10
    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->j:Z

    .line 11
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->g:Lcom/twilio/video/RemoteAudioTrack;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    sget-object p1, Lcom/sumsub/sns/internal/core/domain/SNSDebugConstants;->INSTANCE:Lcom/sumsub/sns/internal/core/domain/SNSDebugConstants;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/domain/SNSDebugConstants;->getMuteVideoIdent()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/twilio/video/RemoteAudioTrack;->enablePlayback(Z)V

    :cond_2
    return-void
.end method

.method public final a(Lcom/twilio/video/VideoView;)V
    .locals 2

    .line 40
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lcom/twilio/video/LocalVideoTrack;->enable(Z)V

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/twilio/video/LocalVideoTrack;->getSinks()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-ne v0, v1, :cond_1

    .line 42
    const-string p1, "bindLocalVideoView: already added"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    return-void

    .line 43
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/twilio/video/LocalVideoTrack;->addSink(Ltvi/webrtc/VideoSink;)V

    :cond_2
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 8

    .line 89
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->h:Lcom/twilio/video/LocalDataTrack;

    if-eqz v0, :cond_2

    .line 90
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->l:Lcom/twilio/video/LocalParticipant;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/twilio/video/LocalParticipant;->getLocalDataTracks()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/twilio/video/LocalDataTrackPublication;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/twilio/video/LocalDataTrackPublication;->getLocalDataTrack()Lcom/twilio/video/LocalDataTrack;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 91
    :goto_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->h:Lcom/twilio/video/LocalDataTrack;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 92
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->h:Lcom/twilio/video/LocalDataTrack;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "sendMessage: published dt="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", local dt="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    .line 93
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object v1, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {v1}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object v1

    .line 94
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v2

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 95
    const-string v3, "SNSVideoIdent"

    const-string v4, "local data track changed"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->w$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 96
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "sendMessage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v0, p1}, Lcom/twilio/video/LocalDataTrack;->send(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final b()Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatController$CameraId;
    .locals 3

    .line 20
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 21
    invoke-virtual {v0}, Lcom/twilio/video/LocalVideoTrack;->getVideoCapturer()Ltvi/webrtc/VideoCapturer;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 22
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;

    if-eqz v2, :cond_0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    .line 23
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/f;->a()Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 24
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;->BACK_CAMERA:Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/CameraCapturerCompat$Source;

    if-ne v0, v1, :cond_1

    .line 25
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatController$CameraId;->BACK:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatController$CameraId;

    return-object v0

    .line 26
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatController$CameraId;->FRONT:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatController$CameraId;

    return-object v0

    :cond_2
    return-object v1
.end method

.method public final b(Lcom/twilio/video/VideoView;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->j:Lcom/twilio/video/LocalVideoTrack;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 3
    const-string v0, "audio"

    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    .line 4
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/B;

    .line 5
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/b;

    .line 6
    new-instance v1, Lcom/twilio/audioswitch/AudioSwitch;

    .line 7
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/o;

    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;)V

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 8
    invoke-direct/range {v1 .. v7}, Lcom/twilio/audioswitch/AudioSwitch;-><init>(Landroid/content/Context;ZLandroid/media/AudioManager$OnAudioFocusChangeListener;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    invoke-direct {v9, v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/b;-><init>(Lcom/twilio/audioswitch/AudioSwitch;)V

    .line 10
    invoke-direct {v8, v0, v9}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/B;-><init>(Landroid/media/AudioManager;Lcom/sumsub/sns/internal/features/presentation/videoident/twilio/b;)V

    iput-object v8, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->a:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/B;

    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->h:Lcom/twilio/video/LocalDataTrack;

    if-nez v0, :cond_1

    .line 12
    invoke-static {v2}, Lcom/twilio/video/LocalDataTrack;->create(Landroid/content/Context;)Lcom/twilio/video/LocalDataTrack;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->h:Lcom/twilio/video/LocalDataTrack;

    .line 13
    :cond_1
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->a(Landroid/content/Context;)V

    .line 14
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->a(Lcom/twilio/video/VideoView;)V

    .line 15
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->i:Lcom/twilio/video/LocalAudioTrack;

    if-eqz p1, :cond_2

    .line 16
    const-string/jumbo p1, "startLocalMediaTracking: audio already started"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    return-void

    .line 17
    :cond_2
    const-string p1, "android.permission.RECORD_AUDIO"

    invoke-static {v2, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x1

    .line 18
    invoke-static {v2, p1}, Lcom/twilio/video/LocalAudioTrack;->create(Landroid/content/Context;Z)Lcom/twilio/video/LocalAudioTrack;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/q;->i:Lcom/twilio/video/LocalAudioTrack;

    if-eqz v0, :cond_3

    .line 19
    sget-object v1, Lcom/sumsub/sns/internal/core/domain/SNSDebugConstants;->INSTANCE:Lcom/sumsub/sns/internal/core/domain/SNSDebugConstants;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/domain/SNSDebugConstants;->getMuteVideoIdent()Z

    move-result v1

    xor-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/twilio/video/LocalAudioTrack;->enable(Z)V

    :cond_3
    :goto_0
    return-void
.end method
