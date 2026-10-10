.class public final Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lkotlinx/coroutines/m0;

.field public final b:Landroid/os/Handler;

.field public final c:Lkotlinx/coroutines/flow/m;

.field public d:Lcom/twilio/video/RemoteVideoTrack;

.field public e:Lcom/twilio/video/VideoTextureView;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public g:Lcom/twilio/video/RemoteAudioTrack;

.field public final h:Lkotlinx/coroutines/flow/m;

.field public final i:Lkotlinx/coroutines/flow/n;

.field public j:Z

.field public final k:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/s;

.field public final l:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/t;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->a:Lkotlinx/coroutines/m0;

    .line 14
    .line 15
    new-instance v0, Landroid/os/HandlerThread;

    .line 16
    .line 17
    const-string v1, "RemoteDataTrack"

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    const-string v1, "init messageReceiveThread"

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/a;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 29
    .line 30
    new-instance v1, Landroid/os/Handler;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 38
    .line 39
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->b:Landroid/os/Handler;

    .line 40
    .line 41
    sget-object v0, Lkotlinx/coroutines/channels/BufferOverflow;->DROP_LATEST:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 42
    const/4 v1, 0x0

    .line 43
    const/4 v2, 0x0

    .line 44
    .line 45
    const/16 v3, 0xa

    .line 46
    const/4 v4, 0x1

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v3, v0, v4, v1}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->c:Lkotlinx/coroutines/flow/m;

    .line 53
    .line 54
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/e;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v2, v2, v2}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/e;-><init>(ZZZ)V

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->f:Lkotlinx/coroutines/flow/n;

    .line 64
    .line 65
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->h:Lkotlinx/coroutines/flow/m;

    .line 66
    .line 67
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->i:Lkotlinx/coroutines/flow/n;

    .line 68
    .line 69
    iput-boolean v4, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->j:Z

    .line 70
    .line 71
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/s;

    .line 72
    .line 73
    .line 74
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;)V

    .line 75
    .line 76
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->k:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/s;

    .line 77
    .line 78
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/t;

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;)V

    .line 82
    .line 83
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/u;->l:Lcom/sumsub/sns/internal/features/presentation/videoident/chat/t;

    .line 84
    return-void
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
