.class public final Lcom/sumsub/sns/internal/core/presentation/camera/l;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final x:Landroid/util/Size;

.field public static final y:Landroid/util/Size;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

.field public final b:Lcom/sumsub/sns/internal/core/presentation/camera/b;

.field public final c:Landroidx/camera/core/CameraSelector;

.field public final d:Lcom/sumsub/sns/internal/util/camera/d;

.field public final e:Lcom/sumsub/sns/internal/core/presentation/camera/s;

.field public f:Ljava/util/concurrent/ExecutorService;

.field public g:Lkotlinx/coroutines/m1;

.field public h:Lkotlinx/coroutines/m0;

.field public i:Landroidx/camera/video/VideoCapture;

.field public j:Landroidx/camera/video/Recording;

.field public k:Landroidx/camera/core/ImageCapture;

.field public l:Landroidx/camera/core/ImageAnalysis;

.field public m:Landroidx/camera/core/Preview;

.field public n:Landroidx/camera/core/Camera;

.field public o:Landroidx/camera/lifecycle/ProcessCameraProvider;

.field public p:Landroidx/camera/view/PreviewView$StreamState;

.field public q:Ljava/io/File;

.field public r:Landroidx/camera/view/PreviewView;

.field public s:Z

.field public t:J

.field public final u:Landroidx/lifecycle/Observer;

.field public final v:Landroidx/lifecycle/Observer;

.field public final w:Landroidx/camera/core/resolutionselector/ResolutionSelector;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/util/Size;

    .line 3
    .line 4
    const/16 v1, 0x780

    .line 5
    .line 6
    const/16 v2, 0x438

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 10
    .line 11
    sput-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->x:Landroid/util/Size;

    .line 12
    .line 13
    new-instance v0, Landroid/util/Size;

    .line 14
    .line 15
    const/16 v1, 0x500

    .line 16
    .line 17
    const/16 v2, 0x3c0

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 21
    .line 22
    sput-object v0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->y:Landroid/util/Size;

    .line 23
    return-void
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
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;Landroid/util/Size;ILcom/sumsub/sns/internal/core/presentation/camera/b;Landroidx/camera/core/CameraSelector;Lcom/sumsub/sns/internal/util/camera/d;Lcom/sumsub/sns/internal/core/presentation/camera/s;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->b:Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->c:Landroidx/camera/core/CameraSelector;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->d:Lcom/sumsub/sns/internal/util/camera/d;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e:Lcom/sumsub/sns/internal/core/presentation/camera/s;

    .line 14
    .line 15
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/camera/c0;

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/camera/c0;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/l;)V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->u:Landroidx/lifecycle/Observer;

    .line 21
    .line 22
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/camera/d0;

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/camera/d0;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/l;)V

    .line 26
    .line 27
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->v:Landroidx/lifecycle/Observer;

    .line 28
    .line 29
    new-instance p1, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 30
    .line 31
    .line 32
    invoke-direct {p1}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;-><init>()V

    .line 33
    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    if-nez p3, :cond_0

    .line 37
    .line 38
    sget-object p2, Lcom/sumsub/sns/internal/core/presentation/camera/l;->y:Landroid/util/Size;

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_0
    sget-object p2, Lcom/sumsub/sns/internal/core/presentation/camera/l;->x:Landroid/util/Size;

    .line 42
    .line 43
    :cond_1
    :goto_0
    new-instance p4, Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    .line 44
    const/4 p5, 0x1

    .line 45
    .line 46
    .line 47
    invoke-direct {p4, p2, p5}, Landroidx/camera/core/resolutionselector/ResolutionStrategy;-><init>(Landroid/util/Size;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p4}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setResolutionStrategy(Landroidx/camera/core/resolutionselector/ResolutionStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    new-instance p2, Landroidx/camera/core/resolutionselector/AspectRatioStrategy;

    .line 54
    .line 55
    .line 56
    invoke-direct {p2, p3, p5}, Landroidx/camera/core/resolutionselector/AspectRatioStrategy;-><init>(II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setAspectRatioStrategy(Landroidx/camera/core/resolutionselector/AspectRatioStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 60
    move-result-object p1

    .line 61
    const/4 p2, 0x0

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p2}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setAllowedResolutionMode(I)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->build()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->w:Landroidx/camera/core/resolutionselector/ResolutionSelector;

    .line 72
    return-void
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/camera/l;Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 74
    invoke-virtual {p0, p1, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->b(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Lkotlin/jvm/functions/Function0;)V

    .line 75
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/camera/l;Landroidx/camera/core/CameraState;)V
    .locals 5

    .line 40
    invoke-virtual {p1}, Landroidx/camera/core/CameraState;->getError()Landroidx/camera/core/CameraState$StateError;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {v0}, Landroidx/camera/core/CameraState$StateError;->getCode()I

    move-result v2

    invoke-virtual {v0}, Landroidx/camera/core/CameraState$StateError;->getCode()I

    move-result v3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v3, :pswitch_data_0

    .line 42
    const-string p0, "UNKNOWN"

    goto :goto_0

    .line 43
    :pswitch_0
    const-string p0, "ERROR_DO_NOT_DISTURB_MODE_ENABLED"

    goto :goto_0

    .line 44
    :pswitch_1
    const-string p0, "ERROR_CAMERA_FATAL_ERROR"

    goto :goto_0

    .line 45
    :pswitch_2
    const-string p0, "ERROR_CAMERA_DISABLED"

    goto :goto_0

    .line 46
    :pswitch_3
    const-string p0, "ERROR_STREAM_CONFIG"

    goto :goto_0

    .line 47
    :pswitch_4
    const-string p0, "ERROR_OTHER_RECOVERABLE_ERROR"

    goto :goto_0

    .line 48
    :pswitch_5
    const-string p0, "ERROR_CAMERA_IN_USE"

    goto :goto_0

    .line 49
    :pswitch_6
    const-string p0, "ERROR_MAX_CAMERAS_IN_USE"

    .line 50
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ", error="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_0
    move-object p0, v1

    :goto_1
    if-nez p0, :cond_1

    const-string p0, ""

    .line 51
    :cond_1
    invoke-virtual {p1}, Landroidx/camera/core/CameraState;->getType()Landroidx/camera/core/CameraState$Type;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Camera device state: type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/camera/core/CameraState$StateError;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 52
    :cond_2
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 53
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 54
    const-string v0, "CameraX"

    invoke-virtual {p1, v0, p0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/camera/l;Landroidx/camera/core/ImageProxy;)V
    .locals 2

    .line 156
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/camera/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/sumsub/sns/internal/core/presentation/camera/h;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/l;Landroidx/camera/core/ImageProxy;Lkotlin/coroutines/Continuation;)V

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, Lkotlinx/coroutines/h;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/camera/l;Landroidx/camera/view/PreviewView$StreamState;)V
    .locals 6

    .line 32
    iget-wide v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->t:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-wide/16 v3, 0x0

    cmp-long v0, v0, v3

    const/4 v1, 0x0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    goto :goto_1

    :cond_1
    const-wide/16 v4, -0x1

    .line 33
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Stream state changed: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string/jumbo v2, "ms since bind)"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 34
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 35
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 36
    const-string v3, "CameraX"

    invoke-virtual {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->p:Landroidx/camera/view/PreviewView$StreamState;

    if-eq v0, p1, :cond_3

    .line 38
    sget-object v0, Landroidx/camera/view/PreviewView$StreamState;->STREAMING:Landroidx/camera/view/PreviewView$StreamState;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e:Lcom/sumsub/sns/internal/core/presentation/camera/s;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/sumsub/sns/internal/core/presentation/camera/s;->b()V

    .line 39
    :cond_2
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->p:Landroidx/camera/view/PreviewView$StreamState;

    :cond_3
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/camera/l;Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;)V
    .locals 4

    .line 76
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->s:Z

    const-string v1, "CameraX"

    if-eqz v0, :cond_0

    .line 77
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 78
    iget-object p0, p0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 79
    const-string/jumbo p1, "startInternal: stopped before bind, skipping"

    const/4 p2, 0x0

    invoke-virtual {p0, v1, p1, p2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 80
    :cond_0
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 81
    invoke-virtual {p1}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    .line 82
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->t:J

    .line 83
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->c:Landroidx/camera/core/CameraSelector;

    .line 84
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->b()Landroidx/camera/core/UseCaseGroup;

    move-result-object v2

    .line 85
    invoke-virtual {p1, p2, v0, v2}, Landroidx/camera/lifecycle/ProcessCameraProvider;->bindToLifecycle(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/UseCaseGroup;)Landroidx/camera/core/Camera;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    .line 86
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->o:Landroidx/camera/lifecycle/ProcessCameraProvider;

    if-eqz v0, :cond_1

    .line 87
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroidx/camera/core/CameraInfo;->getCameraState()Landroidx/lifecycle/LiveData;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->v:Landroidx/lifecycle/Observer;

    invoke-virtual {p1, p2, v0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz p3, :cond_4

    .line 88
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 89
    :goto_1
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e:Lcom/sumsub/sns/internal/core/presentation/camera/s;

    if-eqz p0, :cond_2

    invoke-interface {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/camera/s;->onError(Ljava/lang/Exception;)V

    .line 90
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Init camera failed: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 91
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 92
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 93
    invoke-virtual {p2, v1, p0, p1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    .line 94
    :goto_2
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e:Lcom/sumsub/sns/internal/core/presentation/camera/s;

    if-eqz p0, :cond_3

    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/camera/w;

    invoke-direct {p2}, Lcom/sumsub/sns/internal/core/presentation/camera/w;-><init>()V

    invoke-interface {p0, p2}, Lcom/sumsub/sns/internal/core/presentation/camera/s;->onError(Ljava/lang/Exception;)V

    .line 95
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Init camera failed with unsupported hardware: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 96
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 97
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 98
    invoke-virtual {p2, v1, p0, p1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/camera/l;Ljava/io/File;Landroidx/camera/video/VideoRecordEvent;)V
    .locals 0

    .line 99
    invoke-virtual {p0, p2, p1}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a(Landroidx/camera/video/VideoRecordEvent;Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public final a(I)F
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->getExposureState()Landroidx/camera/core/ExposureState;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/ExposureState;->getExposureCompensationStep()Landroid/util/Rational;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/util/Rational;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-float p1, p1

    mul-float/2addr v0, p1

    return v0
.end method

.method public final a()V
    .locals 3

    .line 147
    new-instance v0, Landroidx/camera/core/ImageAnalysis$Builder;

    invoke-direct {v0}, Landroidx/camera/core/ImageAnalysis$Builder;-><init>()V

    const/4 v1, 0x0

    .line 148
    invoke-virtual {v0, v1}, Landroidx/camera/core/ImageAnalysis$Builder;->setBackpressureStrategy(I)Landroidx/camera/core/ImageAnalysis$Builder;

    move-result-object v0

    .line 149
    invoke-virtual {v0, v1}, Landroidx/camera/core/ImageAnalysis$Builder;->setTargetRotation(I)Landroidx/camera/core/ImageAnalysis$Builder;

    move-result-object v0

    const/4 v1, 0x2

    .line 150
    invoke-virtual {v0, v1}, Landroidx/camera/core/ImageAnalysis$Builder;->setOutputImageFormat(I)Landroidx/camera/core/ImageAnalysis$Builder;

    move-result-object v0

    .line 151
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->w:Landroidx/camera/core/resolutionselector/ResolutionSelector;

    invoke-virtual {v0, v1}, Landroidx/camera/core/ImageAnalysis$Builder;->setResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)Landroidx/camera/core/ImageAnalysis$Builder;

    move-result-object v0

    .line 152
    invoke-virtual {v0}, Landroidx/camera/core/ImageAnalysis$Builder;->build()Landroidx/camera/core/ImageAnalysis;

    move-result-object v0

    .line 153
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->l:Landroidx/camera/core/ImageAnalysis;

    .line 154
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->f:Ljava/util/concurrent/ExecutorService;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 155
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/camera/e0;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/core/presentation/camera/e0;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/l;)V

    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/ImageAnalysis;->setAnalyzer(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageAnalysis$Analyzer;)V

    :cond_0
    return-void
.end method

.method public final a(F)V
    .locals 8

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set exposure "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 133
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 134
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 135
    const-string v3, "CameraX"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->getExposureState()Landroidx/camera/core/ExposureState;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Landroidx/camera/core/ExposureState;->getExposureCompensationRange()Landroid/util/Range;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 137
    :cond_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroidx/camera/core/CameraInfo;->getExposureState()Landroidx/camera/core/ExposureState;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroidx/camera/core/ExposureState;->getExposureCompensationStep()Landroid/util/Rational;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/util/Rational;->floatValue()F

    move-result v2

    goto :goto_0

    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    .line 138
    :goto_0
    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_1

    :cond_2
    move v5, v6

    .line 139
    :goto_1
    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :cond_3
    div-float v2, p1, v2

    float-to-int v2, v2

    .line 140
    invoke-static {v2, v6}, Ljava/lang/Integer;->min(II)I

    move-result v2

    invoke-static {v2, v5}, Ljava/lang/Integer;->max(II)I

    move-result v2

    .line 141
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 142
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1, v2}, Landroidx/camera/core/CameraControl;->setExposureCompensationIndex(I)Lcom/google/common/util/concurrent/ListenableFuture;

    return-void

    .line 143
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Set exposure failed, "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, " is out of range "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 144
    iget-object v0, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 145
    invoke-virtual {v0, v3, p1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final a(Landroidx/camera/video/VideoRecordEvent$Finalize;)V
    .locals 5

    .line 111
    invoke-virtual {p1}, Landroidx/camera/video/VideoRecordEvent$Finalize;->hasError()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 112
    invoke-virtual {p1}, Landroidx/camera/video/VideoRecordEvent$Finalize;->getError()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleVideoRecordFinalized: error="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 113
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 114
    iget-object v3, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 115
    const-string v4, "CameraX"

    invoke-virtual {v3, v4, v0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 116
    invoke-virtual {p1}, Landroidx/camera/video/VideoRecordEvent$Finalize;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 117
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 118
    const-string v3, "Video recording finialized with exception"

    invoke-virtual {v2, v4, v3, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/camera/c;

    .line 120
    invoke-virtual {p1}, Landroidx/camera/video/VideoRecordEvent$Finalize;->getError()I

    move-result v2

    .line 121
    invoke-virtual {p1}, Landroidx/camera/video/VideoRecordEvent$Finalize;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 122
    invoke-direct {v0, v2, p1}, Lcom/sumsub/sns/internal/core/presentation/camera/c;-><init>(ILjava/lang/Throwable;)V

    goto :goto_0

    .line 123
    :cond_1
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/camera/d;

    .line 124
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Landroidx/camera/video/VideoRecordEvent;->getRecordingStats()Landroidx/camera/video/RecordingStats;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/camera/video/RecordingStats;->getRecordedDurationNanos()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v2

    long-to-int v2, v2

    .line 125
    invoke-virtual {p1}, Landroidx/camera/video/VideoRecordEvent;->getRecordingStats()Landroidx/camera/video/RecordingStats;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/video/RecordingStats;->getNumBytesRecorded()J

    move-result-wide v3

    .line 126
    invoke-direct {v0, v2, v3, v4}, Lcom/sumsub/sns/internal/core/presentation/camera/d;-><init>(IJ)V

    .line 127
    :goto_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->q:Ljava/io/File;

    if-eqz p1, :cond_2

    .line 128
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e:Lcom/sumsub/sns/internal/core/presentation/camera/s;

    if-eqz v2, :cond_2

    .line 129
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/camera/f;

    invoke-direct {v3, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/camera/f;-><init>(Ljava/io/File;Lcom/sumsub/sns/internal/core/presentation/camera/e;)V

    .line 130
    invoke-interface {v2, v3}, Lcom/sumsub/sns/internal/core/presentation/camera/s;->a(Lcom/sumsub/sns/internal/core/presentation/camera/f;)V

    .line 131
    :cond_2
    iput-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->q:Ljava/io/File;

    return-void
.end method

.method public final a(Landroidx/camera/video/VideoRecordEvent;Ljava/io/File;)V
    .locals 3

    .line 100
    instance-of v0, p1, Landroidx/camera/video/VideoRecordEvent$Start;

    if-eqz v0, :cond_0

    .line 101
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e:Lcom/sumsub/sns/internal/core/presentation/camera/s;

    if-eqz v1, :cond_0

    invoke-interface {v1, p2}, Lcom/sumsub/sns/internal/core/presentation/camera/s;->b(Ljava/io/File;)V

    :cond_0
    if-nez v0, :cond_1

    .line 102
    instance-of v0, p1, Landroidx/camera/video/VideoRecordEvent$Pause;

    if-nez v0, :cond_1

    .line 103
    instance-of v0, p1, Landroidx/camera/video/VideoRecordEvent$Resume;

    if-nez v0, :cond_1

    .line 104
    instance-of v0, p1, Landroidx/camera/video/VideoRecordEvent$Finalize;

    if-eqz v0, :cond_2

    .line 105
    :cond_1
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " recording state="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 106
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 107
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 108
    const-string v1, "CameraX"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    instance-of p2, p1, Landroidx/camera/video/VideoRecordEvent$Finalize;

    if-eqz p2, :cond_2

    .line 110
    check-cast p1, Landroidx/camera/video/VideoRecordEvent$Finalize;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a(Landroidx/camera/video/VideoRecordEvent$Finalize;)V

    :cond_2
    return-void
.end method

.method public final a(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Lkotlin/jvm/functions/Function0;)V
    .locals 5

    .line 55
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->c:Landroidx/camera/core/CameraSelector;

    sget-object v1, Landroidx/camera/core/CameraSelector;->DEFAULT_FRONT_CAMERA:Landroidx/camera/core/CameraSelector;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 56
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "start: cameraFront="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 57
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 58
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 59
    const-string v3, "CameraX"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez p2, :cond_0

    .line 60
    iget-object p1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 61
    const-string/jumbo p2, "start: previewView is null, aborting"

    invoke-virtual {p1, v3, p2, v4}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->r:Landroidx/camera/view/PreviewView;

    if-ne p2, v0, :cond_1

    .line 63
    iget-object p1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 64
    const-string/jumbo p2, "start: skipping"

    invoke-virtual {p1, v3, p2, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 65
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->d:Lcom/sumsub/sns/internal/util/camera/d;

    if-nez v0, :cond_2

    .line 66
    iget-object v0, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 67
    const-string v1, "CameraChecked is null"

    invoke-virtual {v0, v3, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    invoke-virtual {p0, p1, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->b(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Lkotlin/jvm/functions/Function0;)V

    return-void

    .line 69
    :cond_2
    iget-object v0, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 70
    const-string v1, "Starting camera check"

    invoke-virtual {v0, v3, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->d:Lcom/sumsub/sns/internal/util/camera/d;

    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/camera/a0;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/camera/a0;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/l;Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Lkotlin/jvm/functions/Function0;)V

    .line 72
    iget-object p1, v0, Lcom/sumsub/sns/internal/util/camera/d;->b:Lcom/sumsub/sns/internal/util/camera/h;

    .line 73
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/util/camera/h;->a(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public final a(Ljava/io/File;)V
    .locals 9

    .line 1
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->j:Landroidx/camera/video/Recording;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->i:Landroidx/camera/video/VideoCapture;

    const-string v1, "CameraX"

    const/4 v2, 0x0

    if-nez v0, :cond_2

    .line 4
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 5
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 6
    const-string/jumbo v0, "takeVideoSnapshot: videoCapture use case is null, aborting"

    invoke-virtual {p1, v1, v0, v2}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 7
    :cond_2
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->r:Landroidx/camera/view/PreviewView;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v2

    :goto_1
    if-nez v3, :cond_4

    .line 8
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 9
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 10
    const-string/jumbo v0, "takeVideoSnapshot: context is null, aborting"

    invoke-virtual {p1, v1, v0, v2}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_4
    if-nez p1, :cond_5

    .line 11
    new-instance p1, Ljava/io/File;

    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v4

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ".mp4"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p1, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    :cond_5
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Take video snapshot and save to "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 13
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 14
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 15
    invoke-virtual {v5, v1, v4, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    new-instance v1, Landroidx/camera/video/FileOutputOptions$Builder;

    invoke-direct {v1, p1}, Landroidx/camera/video/FileOutputOptions$Builder;-><init>(Ljava/io/File;)V

    .line 17
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->b:Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 18
    iget-wide v4, v4, Lcom/sumsub/sns/internal/core/presentation/camera/b;->e:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-lez v8, :cond_6

    .line 19
    invoke-virtual {v1, v4, v5}, Landroidx/camera/video/FileOutputOptions$Builder;->setFileSizeLimit(J)Ljava/lang/Object;

    .line 20
    :cond_6
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->b:Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 21
    iget-wide v4, v4, Lcom/sumsub/sns/internal/core/presentation/camera/b;->d:J

    cmp-long v6, v4, v6

    if-lez v6, :cond_7

    .line 22
    invoke-virtual {v1, v4, v5}, Landroidx/camera/video/FileOutputOptions$Builder;->setDurationLimitMillis(J)Ljava/lang/Object;

    .line 23
    :cond_7
    invoke-virtual {v1}, Landroidx/camera/video/FileOutputOptions$Builder;->build()Landroidx/camera/video/FileOutputOptions;

    move-result-object v1

    .line 24
    invoke-virtual {v0}, Landroidx/camera/video/VideoCapture;->getOutput()Landroidx/camera/video/VideoOutput;

    move-result-object v0

    check-cast v0, Landroidx/camera/video/Recorder;

    .line 25
    invoke-virtual {v0, v3, v1}, Landroidx/camera/video/Recorder;->prepareRecording(Landroid/content/Context;Landroidx/camera/video/FileOutputOptions;)Landroidx/camera/video/PendingRecording;

    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    sget-object v4, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->SEAMLESS_DOC_CAPTURE:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    if-eq v1, v4, :cond_8

    sget-object v4, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->SEAMLESS_DOC_CAPTURE_LEGACY:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    if-eq v1, v4, :cond_8

    const/4 v1, 0x0

    const/4 v4, 0x1

    .line 27
    invoke-static {v0, v1, v4, v2}, Landroidx/camera/video/PendingRecording;->withAudioEnabled$default(Landroidx/camera/video/PendingRecording;ZILjava/lang/Object;)Landroidx/camera/video/PendingRecording;

    .line 28
    :cond_8
    invoke-static {v3}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 29
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/camera/z;

    invoke-direct {v2, p0, p1}, Lcom/sumsub/sns/internal/core/presentation/camera/z;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/l;Ljava/io/File;)V

    invoke-virtual {v0, v1, v2}, Landroidx/camera/video/PendingRecording;->start(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)Landroidx/camera/video/Recording;

    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->j:Landroidx/camera/video/Recording;

    .line 31
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->q:Ljava/io/File;

    return-void
.end method

.method public final b()Landroidx/camera/core/UseCaseGroup;
    .locals 3

    .line 20
    new-instance v0, Landroidx/camera/core/UseCaseGroup$Builder;

    invoke-direct {v0}, Landroidx/camera/core/UseCaseGroup$Builder;-><init>()V

    .line 21
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    sget-object v2, Lcom/sumsub/sns/internal/core/presentation/camera/g;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 22
    :pswitch_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->c()V

    goto :goto_0

    .line 23
    :pswitch_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->c()V

    .line 24
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a()V

    goto :goto_0

    .line 25
    :pswitch_2
    new-instance v1, Landroidx/camera/core/ImageCapture$Builder;

    invoke-direct {v1}, Landroidx/camera/core/ImageCapture$Builder;-><init>()V

    .line 26
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->w:Landroidx/camera/core/resolutionselector/ResolutionSelector;

    invoke-virtual {v1, v2}, Landroidx/camera/core/ImageCapture$Builder;->setResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)Landroidx/camera/core/ImageCapture$Builder;

    move-result-object v1

    .line 27
    invoke-virtual {v1}, Landroidx/camera/core/ImageCapture$Builder;->build()Landroidx/camera/core/ImageCapture;

    move-result-object v1

    .line 28
    iput-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->k:Landroidx/camera/core/ImageCapture;

    .line 29
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a()V

    goto :goto_0

    .line 30
    :pswitch_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a()V

    goto :goto_0

    .line 31
    :pswitch_4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->c()V

    goto :goto_0

    .line 32
    :pswitch_5
    new-instance v1, Landroidx/camera/core/ImageCapture$Builder;

    invoke-direct {v1}, Landroidx/camera/core/ImageCapture$Builder;-><init>()V

    .line 33
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->w:Landroidx/camera/core/resolutionselector/ResolutionSelector;

    invoke-virtual {v1, v2}, Landroidx/camera/core/ImageCapture$Builder;->setResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)Landroidx/camera/core/ImageCapture$Builder;

    move-result-object v1

    .line 34
    invoke-virtual {v1}, Landroidx/camera/core/ImageCapture$Builder;->build()Landroidx/camera/core/ImageCapture;

    move-result-object v1

    .line 35
    iput-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->k:Landroidx/camera/core/ImageCapture;

    .line 36
    :goto_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->k:Landroidx/camera/core/ImageCapture;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroidx/camera/core/UseCaseGroup$Builder;->addUseCase(Landroidx/camera/core/UseCase;)Landroidx/camera/core/UseCaseGroup$Builder;

    .line 37
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->i:Landroidx/camera/video/VideoCapture;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroidx/camera/core/UseCaseGroup$Builder;->addUseCase(Landroidx/camera/core/UseCase;)Landroidx/camera/core/UseCaseGroup$Builder;

    .line 38
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->l:Landroidx/camera/core/ImageAnalysis;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Landroidx/camera/core/UseCaseGroup$Builder;->addUseCase(Landroidx/camera/core/UseCase;)Landroidx/camera/core/UseCaseGroup$Builder;

    .line 39
    :cond_2
    new-instance v1, Landroidx/camera/core/Preview$Builder;

    invoke-direct {v1}, Landroidx/camera/core/Preview$Builder;-><init>()V

    .line 40
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->w:Landroidx/camera/core/resolutionselector/ResolutionSelector;

    invoke-virtual {v1, v2}, Landroidx/camera/core/Preview$Builder;->setResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)Landroidx/camera/core/Preview$Builder;

    move-result-object v1

    .line 41
    invoke-virtual {v1}, Landroidx/camera/core/Preview$Builder;->build()Landroidx/camera/core/Preview;

    move-result-object v1

    .line 42
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->r:Landroidx/camera/view/PreviewView;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()Landroidx/camera/core/Preview$SurfaceProvider;

    move-result-object v2

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Landroidx/camera/core/Preview;->setSurfaceProvider(Landroidx/camera/core/Preview$SurfaceProvider;)V

    .line 43
    invoke-virtual {v0, v1}, Landroidx/camera/core/UseCaseGroup$Builder;->addUseCase(Landroidx/camera/core/UseCase;)Landroidx/camera/core/UseCaseGroup$Builder;

    .line 44
    iput-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->m:Landroidx/camera/core/Preview;

    .line 45
    invoke-virtual {v0}, Landroidx/camera/core/UseCaseGroup$Builder;->build()Landroidx/camera/core/UseCaseGroup;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Lkotlin/jvm/functions/Function0;)V
    .locals 6

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->s:Z

    .line 2
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->r:Landroidx/camera/view/PreviewView;

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p2}, Landroidx/camera/view/PreviewView;->getPreviewStreamState()Landroidx/lifecycle/LiveData;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->u:Landroidx/lifecycle/Observer;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    .line 4
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->f:Ljava/util/concurrent/ExecutorService;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 5
    invoke-static {v1}, Lkotlinx/coroutines/o1;->c(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/m1;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 6
    invoke-static {v1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    move-result-object v3

    iput-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->h:Lkotlinx/coroutines/m0;

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 7
    :goto_0
    iput-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->g:Lkotlinx/coroutines/m1;

    .line 8
    invoke-virtual {p2}, Landroidx/camera/view/PreviewView;->getPreviewStreamState()Landroidx/lifecycle/LiveData;

    move-result-object v1

    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->u:Landroidx/lifecycle/Observer;

    invoke-virtual {v1, p1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 9
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 10
    const-string v3, "android.permission.CAMERA"

    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_2

    const/4 v0, 0x1

    .line 11
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->c:Landroidx/camera/core/CameraSelector;

    sget-object v3, Landroidx/camera/core/CameraSelector;->DEFAULT_FRONT_CAMERA:Landroidx/camera/core/CameraSelector;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 12
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "startInternal: mode="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", cameraPermissionGranted="

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", front="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 13
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 14
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 15
    const-string v3, "CameraX"

    invoke-virtual {v1, v3, v0, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    sget-object v0, Landroidx/camera/lifecycle/ProcessCameraProvider;->Companion:Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;->getInstance(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    .line 17
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/camera/b0;

    invoke-direct {v1, p0, v0, p1, p3}, Lcom/sumsub/sns/internal/core/presentation/camera/b0;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/l;Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;)V

    .line 18
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 19
    invoke-interface {v0, v1, p1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->b:Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->b:Landroidx/camera/video/Quality;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/camera/b;->c:Landroidx/camera/video/Quality;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroidx/camera/video/FallbackStrategy;->higherQualityOrLowerThan(Landroidx/camera/video/Quality;)Landroidx/camera/video/FallbackStrategy;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Landroidx/camera/video/QualitySelector;->from(Landroidx/camera/video/Quality;Landroidx/camera/video/FallbackStrategy;)Landroidx/camera/video/QualitySelector;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    new-instance v1, Landroidx/camera/video/Recorder$Builder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Landroidx/camera/video/Recorder$Builder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroidx/camera/video/Recorder$Builder;->setQualitySelector(Landroidx/camera/video/QualitySelector;)Landroidx/camera/video/Recorder$Builder;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->b:Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 26
    .line 27
    iget v1, v1, Lcom/sumsub/sns/internal/core/presentation/camera/b;->a:I

    .line 28
    .line 29
    if-lez v1, :cond_0

    .line 30
    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string/jumbo v3, "using "

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v1, " videoBitRate"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 55
    .line 56
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 57
    .line 58
    const-string v3, "CameraX"

    .line 59
    const/4 v4, 0x0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->b:Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 65
    .line 66
    iget v1, v1, Lcom/sumsub/sns/internal/core/presentation/camera/b;->a:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroidx/camera/video/Recorder$Builder;->setTargetVideoEncodingBitRate(I)Landroidx/camera/video/Recorder$Builder;

    .line 70
    .line 71
    .line 72
    :cond_0
    invoke-virtual {v0}, Landroidx/camera/video/Recorder$Builder;->build()Landroidx/camera/video/Recorder;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Landroidx/camera/video/VideoCapture;->withOutput(Landroidx/camera/video/VideoOutput;)Landroidx/camera/video/VideoCapture;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->i:Landroidx/camera/video/VideoCapture;

    .line 80
    return-void
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

.method public final d()Lcom/sumsub/sns/internal/core/presentation/camera/x;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    .line 3
    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->getExposureState()Landroidx/camera/core/ExposureState;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_5

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Landroidx/camera/core/ExposureState;->isExposureCompensationSupported()Z

    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    .line 23
    if-ne v0, v1, :cond_5

    .line 24
    .line 25
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->getExposureState()Landroidx/camera/core/ExposureState;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Landroidx/camera/core/ExposureState;->getExposureCompensationRange()Landroid/util/Range;

    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v0, v1

    .line 47
    :goto_0
    const/4 v2, 0x0

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    check-cast v3, Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 61
    move-result v3

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move v3, v2

    .line 64
    .line 65
    :goto_1
    if-eqz v0, :cond_2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    check-cast v0, Ljava/lang/Integer;

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 77
    move-result v0

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move v0, v2

    .line 80
    .line 81
    :goto_2
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    .line 82
    .line 83
    if-eqz v4, :cond_3

    .line 84
    .line 85
    .line 86
    invoke-interface {v4}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 87
    move-result-object v4

    .line 88
    .line 89
    if-eqz v4, :cond_3

    .line 90
    .line 91
    .line 92
    invoke-interface {v4}, Landroidx/camera/core/CameraInfo;->getExposureState()Landroidx/camera/core/ExposureState;

    .line 93
    move-result-object v4

    .line 94
    .line 95
    if-eqz v4, :cond_3

    .line 96
    .line 97
    .line 98
    invoke-interface {v4}, Landroidx/camera/core/ExposureState;->getExposureCompensationIndex()I

    .line 99
    move-result v1

    .line 100
    .line 101
    .line 102
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    :cond_3
    if-eqz v1, :cond_4

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 109
    move-result v2

    .line 110
    .line 111
    :cond_4
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/camera/x;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a(I)F

    .line 115
    move-result v2

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a(I)F

    .line 119
    move-result v3

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a(I)F

    .line 123
    move-result v0

    .line 124
    .line 125
    .line 126
    invoke-direct {v1, v2, v3, v0}, Lcom/sumsub/sns/internal/core/presentation/camera/x;-><init>(FFF)V

    .line 127
    return-object v1

    .line 128
    .line 129
    :cond_5
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/camera/x;

    .line 130
    .line 131
    .line 132
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/presentation/camera/x;-><init>()V

    .line 133
    return-object v0
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

.method public final e()V
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    .line 6
    const-string v1, "CameraX"

    .line 7
    .line 8
    const-string v2, "On destroy"

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->s:Z

    .line 16
    .line 17
    iput-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->p:Landroidx/camera/view/PreviewView$StreamState;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->l:Landroidx/camera/core/ImageAnalysis;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Landroidx/camera/core/ImageAnalysis;->clearAnalyzer()V

    .line 25
    .line 26
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->f:Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->f()V

    .line 35
    .line 36
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->o:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    goto :goto_1

    .line 40
    .line 41
    :cond_2
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->m:Landroidx/camera/core/Preview;

    .line 42
    .line 43
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->k:Landroidx/camera/core/ImageCapture;

    .line 44
    .line 45
    iget-object v5, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->i:Landroidx/camera/video/VideoCapture;

    .line 46
    .line 47
    iget-object v6, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->l:Landroidx/camera/core/ImageAnalysis;

    .line 48
    const/4 v7, 0x4

    .line 49
    .line 50
    new-array v7, v7, [Landroidx/camera/core/UseCase;

    .line 51
    const/4 v8, 0x0

    .line 52
    .line 53
    aput-object v2, v7, v8

    .line 54
    .line 55
    aput-object v4, v7, v0

    .line 56
    const/4 v2, 0x2

    .line 57
    .line 58
    aput-object v5, v7, v2

    .line 59
    const/4 v2, 0x3

    .line 60
    .line 61
    aput-object v6, v7, v2

    .line 62
    .line 63
    .line 64
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    .line 72
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    move-result v4

    .line 74
    .line 75
    if-eqz v4, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    move-result-object v4

    .line 80
    .line 81
    check-cast v4, Landroidx/camera/core/UseCase;

    .line 82
    .line 83
    .line 84
    filled-new-array {v4}, [Landroidx/camera/core/UseCase;

    .line 85
    move-result-object v4

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v4}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbind([Landroidx/camera/core/UseCase;)V

    .line 89
    goto :goto_0

    .line 90
    .line 91
    :cond_3
    :goto_1
    iput-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->o:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 92
    .line 93
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->m:Landroidx/camera/core/Preview;

    .line 94
    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v3}, Landroidx/camera/core/Preview;->setSurfaceProvider(Landroidx/camera/core/Preview$SurfaceProvider;)V

    .line 99
    .line 100
    :cond_4
    iput-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->m:Landroidx/camera/core/Preview;

    .line 101
    .line 102
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->r:Landroidx/camera/view/PreviewView;

    .line 103
    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Landroidx/camera/view/PreviewView;->getPreviewStreamState()Landroidx/lifecycle/LiveData;

    .line 108
    move-result-object v1

    .line 109
    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->u:Landroidx/lifecycle/Observer;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v2}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    .line 116
    .line 117
    :cond_5
    iput-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->r:Landroidx/camera/view/PreviewView;

    .line 118
    .line 119
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    .line 120
    .line 121
    if-eqz v1, :cond_6

    .line 122
    .line 123
    .line 124
    invoke-interface {v1}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 125
    move-result-object v1

    .line 126
    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    .line 130
    invoke-interface {v1}, Landroidx/camera/core/CameraInfo;->getCameraState()Landroidx/lifecycle/LiveData;

    .line 131
    move-result-object v1

    .line 132
    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->v:Landroidx/lifecycle/Observer;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v2}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    .line 139
    .line 140
    :cond_6
    iput-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    .line 141
    .line 142
    const-wide/16 v1, 0x0

    .line 143
    .line 144
    iput-wide v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->t:J

    .line 145
    .line 146
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->h:Lkotlinx/coroutines/m0;

    .line 147
    .line 148
    if-eqz v1, :cond_7

    .line 149
    .line 150
    .line 151
    invoke-static {v1, v3, v0, v3}, Lkotlinx/coroutines/n0;->e(Lkotlinx/coroutines/m0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 152
    .line 153
    :cond_7
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->g:Lkotlinx/coroutines/m1;

    .line 154
    .line 155
    if-eqz v0, :cond_8

    .line 156
    .line 157
    .line 158
    :try_start_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 159
    return-void

    .line 160
    :catch_0
    move-exception v0

    .line 161
    throw v0

    .line 162
    :catch_1
    :cond_8
    return-void
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

.method public final f()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->j:Landroidx/camera/video/Recording;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 10
    .line 11
    const-string v1, "CameraX"

    .line 12
    .line 13
    const-string v2, "Stop video recording"

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->j:Landroidx/camera/video/Recording;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/camera/video/Recording;->stop()V

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->j:Landroidx/camera/video/Recording;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/camera/video/Recording;->close()V

    .line 32
    .line 33
    :cond_2
    iput-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->j:Landroidx/camera/video/Recording;

    .line 34
    return-void
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

.method public final g()V
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    .line 6
    const-string v2, "CameraX"

    .line 7
    .line 8
    const-string v3, "Take picture"

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2, v3, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 15
    .line 16
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;->SEAMLESS_DOC_CAPTURE_LEGACY:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 17
    .line 18
    if-ne v1, v3, :cond_1

    .line 19
    .line 20
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 21
    .line 22
    const-string v1, "Taking picture on legacy seamless"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    iget-object v5, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->h:Lkotlinx/coroutines/m0;

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/camera/j;

    .line 32
    .line 33
    .line 34
    invoke-direct {v8, p0, v4}, Lcom/sumsub/sns/internal/core/presentation/camera/j;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/l;Lkotlin/coroutines/Continuation;)V

    .line 35
    const/4 v9, 0x3

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 42
    :cond_0
    return-void

    .line 43
    .line 44
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->k:Landroidx/camera/core/ImageCapture;

    .line 45
    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 49
    .line 50
    .line 51
    const-string/jumbo v1, "takePicture: imageCapture use case is null, aborting"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    return-void

    .line 56
    .line 57
    :cond_2
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->r:Landroidx/camera/view/PreviewView;

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 63
    move-result-object v3

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    move-object v3, v4

    .line 66
    .line 67
    :goto_0
    if-eqz v3, :cond_4

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 71
    move-result-object v3

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    move-object v3, v4

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 77
    move-result-object v5

    .line 78
    .line 79
    new-instance v6, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    const-string v7, "manual_"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v5, ".jpg"

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    move-result-object v6

    .line 100
    .line 101
    if-nez v6, :cond_5

    .line 102
    .line 103
    .line 104
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 105
    move-result-object v6

    .line 106
    .line 107
    new-instance v7, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    move-result-object v6

    .line 121
    .line 122
    :cond_5
    new-instance v5, Ljava/io/File;

    .line 123
    .line 124
    .line 125
    invoke-direct {v5, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 126
    .line 127
    new-instance v3, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;

    .line 128
    .line 129
    .line 130
    invoke-direct {v3, v5}, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;-><init>(Ljava/io/File;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;->build()Landroidx/camera/core/ImageCapture$OutputFileOptions;

    .line 134
    move-result-object v3

    .line 135
    .line 136
    iget-object v6, p0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->r:Landroidx/camera/view/PreviewView;

    .line 137
    .line 138
    if-eqz v6, :cond_6

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 142
    move-result-object v6

    .line 143
    goto :goto_2

    .line 144
    :cond_6
    move-object v6, v4

    .line 145
    .line 146
    :goto_2
    if-nez v6, :cond_7

    .line 147
    .line 148
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 149
    .line 150
    .line 151
    const-string/jumbo v1, "takePicture: context is null, aborting"

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v2, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 155
    return-void

    .line 156
    .line 157
    .line 158
    :cond_7
    invoke-static {v6}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 159
    move-result-object v0

    .line 160
    .line 161
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/camera/k;

    .line 162
    .line 163
    .line 164
    invoke-direct {v2, v5, p0}, Lcom/sumsub/sns/internal/core/presentation/camera/k;-><init>(Ljava/io/File;Lcom/sumsub/sns/internal/core/presentation/camera/l;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v3, v0, v2}, Landroidx/camera/core/ImageCapture;->takePicture(Landroidx/camera/core/ImageCapture$OutputFileOptions;Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V

    .line 168
    return-void
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
