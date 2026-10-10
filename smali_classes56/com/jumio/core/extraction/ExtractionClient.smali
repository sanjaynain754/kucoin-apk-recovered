.class public abstract Lcom/jumio/core/extraction/ExtractionClient;
.super Lcom/jumio/core/model/PublisherWithUpdate;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/performance/FrameRateCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jumio/core/model/PublisherWithUpdate<",
        "Lcom/jumio/core/extraction/ExtractionUpdateInterface<",
        "*>;",
        "Lcom/jumio/core/model/StaticModel;",
        ">;",
        "Lcom/jumio/core/performance/FrameRateCallback;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008&\u0018\u00002\u0012\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ.\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u00002\u001e\u0010\\\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030]J\u000e\u0010^\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0000J \u0010_\u001a\u00020Z2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010L\u001a\u00020K2\u0006\u0010R\u001a\u00020QH$J\u0008\u0010`\u001a\u00020$H$J\u0006\u0010a\u001a\u00020ZJ\u0010\u0010b\u001a\u0004\u0018\u00010ZH\u0082@\u00a2\u0006\u0002\u0010cJ\u0008\u0010d\u001a\u00020ZH\u0015J\u0018\u0010e\u001a\u00020Z2\u0006\u0010,\u001a\u00020-2\u0006\u0010f\u001a\u00020\u0003H\u0017J\u000e\u0010g\u001a\u00020Z2\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010h\u001a\u00020Z2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\u0008\u0010i\u001a\u00020ZH\u0017J\u0008\u0010j\u001a\u00020ZH\u0017J\u0010\u0010k\u001a\u00020Z2\u0006\u0010l\u001a\u00020$H\u0004J\u0014\u0010m\u001a\u00020Z2\n\u0010n\u001a\u0006\u0012\u0002\u0008\u00030\u0002H\u0014J\u0012\u0010o\u001a\u00020Z2\u0008\u0010p\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010q\u001a\u00020\u00172\u0006\u0010r\u001a\u00020sH\u0004J\u0008\u0010t\u001a\u00020$H\u0016J\u0008\u0010u\u001a\u00020ZH\u0016J\u0018\u0010v\u001a\u00020Z2\u0006\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020\u0004H\u0004J\u0008\u0010z\u001a\u00020ZH\u0002J\u0010\u0010{\u001a\u00020Z2\u0006\u0010|\u001a\u00020}H\u0016J\u0008\u0010~\u001a\u00020$H\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0008X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\"\u0010 \u001a\u0004\u0018\u00010\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001f@BX\u0084\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u001a\u0010)\u001a\u00020$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010&\"\u0004\u0008+\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101R\u001a\u00102\u001a\u000203X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107R\u001c\u00108\u001a\u0004\u0018\u000109X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R\u0016\u0010>\u001a\u0004\u0018\u00010?8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010AR\u0013\u0010B\u001a\u0004\u0018\u00010C8F\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010ER$\u0010F\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020$@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008F\u0010&\"\u0004\u0008G\u0010(R$\u0010H\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020$8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008I\u0010&\"\u0004\u0008J\u0010(R$\u0010L\u001a\u00020K2\u0006\u0010\u001e\u001a\u00020K@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008M\u0010N\"\u0004\u0008O\u0010PR$\u0010R\u001a\u00020Q2\u0006\u0010\u001e\u001a\u00020Q@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008S\u0010T\"\u0004\u0008U\u0010VR\u001a\u0010W\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008W\u0010&\"\u0004\u0008X\u0010(\u00a8\u0006\u007f"
    }
    d2 = {
        "Lcom/jumio/core/extraction/ExtractionClient;",
        "Lcom/jumio/core/model/PublisherWithUpdate;",
        "Lcom/jumio/core/extraction/ExtractionUpdateInterface;",
        "Lcom/jumio/core/model/StaticModel;",
        "Lcom/jumio/core/performance/FrameRateCallback;",
        "context",
        "Landroid/content/Context;",
        "scopeProvider",
        "Lcom/jumio/core/scope/ScopeProviderInterface;",
        "<init>",
        "(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;)V",
        "getContext",
        "()Landroid/content/Context;",
        "setContext",
        "(Landroid/content/Context;)V",
        "extractionSemaphore",
        "Lkotlinx/coroutines/sync/Semaphore;",
        "inProcessing",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "dataExtractionActive",
        "frame",
        "Lcom/jumio/commons/camera/Frame;",
        "extractionJob",
        "Lkotlinx/coroutines/Job;",
        "subExtraction",
        "Lcom/jumio/core/extraction/SubExtractionProxy;",
        "getScopeProvider",
        "()Lcom/jumio/core/scope/ScopeProviderInterface;",
        "setScopeProvider",
        "(Lcom/jumio/core/scope/ScopeProviderInterface;)V",
        "value",
        "Lcom/jumio/core/performance/FrameRateObserver;",
        "frameRateObserver",
        "getFrameRateObserver",
        "()Lcom/jumio/core/performance/FrameRateObserver;",
        "shouldInitAsync",
        "",
        "getShouldInitAsync",
        "()Z",
        "setShouldInitAsync",
        "(Z)V",
        "centerCropExtractionArea",
        "getCenterCropExtractionArea",
        "setCenterCropExtractionArea",
        "dataManager",
        "Lcom/jumio/core/persistence/DataManager;",
        "getDataManager",
        "()Lcom/jumio/core/persistence/DataManager;",
        "setDataManager",
        "(Lcom/jumio/core/persistence/DataManager;)V",
        "configuredPart",
        "",
        "getConfiguredPart",
        "()Ljava/lang/String;",
        "setConfiguredPart",
        "(Ljava/lang/String;)V",
        "frameRateCheck",
        "Lcom/jumio/core/performance/FrameRateCheck;",
        "getFrameRateCheck",
        "()Lcom/jumio/core/performance/FrameRateCheck;",
        "setFrameRateCheck",
        "(Lcom/jumio/core/performance/FrameRateCheck;)V",
        "preferredPreviewSize",
        "Lcom/jumio/commons/camera/Size;",
        "getPreferredPreviewSize",
        "()Lcom/jumio/commons/camera/Size;",
        "framePerformance",
        "Lcom/jumio/core/performance/FramePerformance;",
        "getFramePerformance",
        "()Lcom/jumio/core/performance/FramePerformance;",
        "isConfigured",
        "setConfigured",
        "dataExtraction",
        "getDataExtraction",
        "setDataExtraction",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "cameraSettings",
        "getCameraSettings",
        "()Lcom/jumio/commons/camera/CameraSettings;",
        "setCameraSettings",
        "(Lcom/jumio/commons/camera/CameraSettings;)V",
        "Landroid/graphics/Rect;",
        "extractionArea",
        "getExtractionArea",
        "()Landroid/graphics/Rect;",
        "setExtractionArea",
        "(Landroid/graphics/Rect;)V",
        "isSubExtraction",
        "setSubExtraction",
        "addSubExtraction",
        "",
        "extractionClient",
        "mergeResults",
        "Lkotlin/Function2;",
        "removeSubExtraction",
        "process",
        "shouldFeed",
        "reinit",
        "extract",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "init",
        "configure",
        "configurationModel",
        "feed",
        "capture",
        "cancel",
        "destroy",
        "setResult",
        "finished",
        "publishUpdate",
        "update",
        "publishResult",
        "data",
        "triggerFallback",
        "fallbackReason",
        "Lcom/jumio/sdk/enums/JumioFallbackReason;",
        "takePictureManually",
        "takePicture",
        "startFrameRateObservation",
        "samplingTimeInNs",
        "",
        "frameRateCallback",
        "stopFrameRateObservation",
        "onFramesSampled",
        "frames",
        "",
        "requestHighResolutionImage",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public c:Landroid/content/Context;

.field public final d:Lrg0/g;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public g:Lcom/jumio/commons/camera/Frame;

.field public h:Lkotlinx/coroutines/x1;

.field public final i:Lcom/jumio/core/extraction/SubExtractionProxy;

.field public j:Lcom/jumio/core/scope/ScopeProviderInterface;

.field public k:Lcom/jumio/core/performance/FrameRateObserver;

.field public l:Z

.field public m:Z

.field public n:Lcom/jumio/core/persistence/DataManager;

.field public o:Ljava/lang/String;

.field public p:Lcom/jumio/core/performance/FrameRateCheck;

.field public q:Z

.field public r:Lcom/jumio/commons/camera/CameraSettings;

.field public s:Landroid/graphics/Rect;

.field public t:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;)V
    .locals 22
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/scope/ScopeProviderInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    const-string v3, "context"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v3, "scopeProvider"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2}, Lcom/jumio/core/model/PublisherWithUpdate;-><init>(Lcom/jumio/core/scope/ScopeProviderInterface;)V

    .line 20
    .line 21
    iput-object v1, v0, Lcom/jumio/core/extraction/ExtractionClient;->c:Landroid/content/Context;

    .line 22
    const/4 v1, 0x1

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v1}, Lrg0/j;->a(II)Lrg0/g;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    iput-object v3, v0, Lcom/jumio/core/extraction/ExtractionClient;->d:Lrg0/g;

    .line 29
    .line 30
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    const/4 v4, 0x0

    .line 32
    .line 33
    .line 34
    invoke-direct {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 35
    .line 36
    iput-object v3, v0, Lcom/jumio/core/extraction/ExtractionClient;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    .line 40
    .line 41
    invoke-direct {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 42
    .line 43
    iput-object v3, v0, Lcom/jumio/core/extraction/ExtractionClient;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    new-instance v5, Lcom/jumio/commons/camera/Frame;

    .line 46
    .line 47
    const/16 v20, 0xfff

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    .line 56
    const-wide/16 v11, 0x0

    .line 57
    const/4 v13, 0x0

    .line 58
    const/4 v14, 0x0

    .line 59
    const/4 v15, 0x0

    .line 60
    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    const/16 v17, 0x0

    .line 64
    .line 65
    const-wide/16 v18, 0x0

    .line 66
    .line 67
    .line 68
    invoke-direct/range {v5 .. v21}, Lcom/jumio/commons/camera/Frame;-><init>([BLcom/jumio/commons/camera/Size;IIFJLandroid/hardware/camera2/params/ColorSpaceTransform;FIZIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    iput-object v5, v0, Lcom/jumio/core/extraction/ExtractionClient;->g:Lcom/jumio/commons/camera/Frame;

    .line 71
    .line 72
    new-instance v3, Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 73
    .line 74
    .line 75
    invoke-direct {v3}, Lcom/jumio/core/extraction/SubExtractionProxy;-><init>()V

    .line 76
    .line 77
    iput-object v3, v0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 78
    .line 79
    .line 80
    invoke-interface {v2}, Lcom/jumio/core/scope/ScopeProviderInterface;->fork()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    iput-object v2, v0, Lcom/jumio/core/extraction/ExtractionClient;->j:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 84
    .line 85
    const-string v2, ""

    .line 86
    .line 87
    iput-object v2, v0, Lcom/jumio/core/extraction/ExtractionClient;->o:Ljava/lang/String;

    .line 88
    .line 89
    iput-boolean v1, v0, Lcom/jumio/core/extraction/ExtractionClient;->q:Z

    .line 90
    .line 91
    new-instance v1, Lcom/jumio/commons/camera/CameraSettings;

    .line 92
    .line 93
    .line 94
    invoke-direct {v1}, Lcom/jumio/commons/camera/CameraSettings;-><init>()V

    .line 95
    .line 96
    iput-object v1, v0, Lcom/jumio/core/extraction/ExtractionClient;->r:Lcom/jumio/commons/camera/CameraSettings;

    .line 97
    .line 98
    new-instance v1, Landroid/graphics/Rect;

    .line 99
    .line 100
    .line 101
    invoke-direct {v1, v4, v4, v4, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 102
    .line 103
    iput-object v1, v0, Lcom/jumio/core/extraction/ExtractionClient;->s:Landroid/graphics/Rect;

    .line 104
    return-void
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
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public static final access$extract(Lcom/jumio/core/extraction/ExtractionClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->j:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getBackgroundDispatcher()Lkotlinx/coroutines/j0;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Ljumio/core/i1;

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0, v2}, Ljumio/core/i1;-><init>(Lcom/jumio/core/extraction/ExtractionClient;Lkotlin/coroutines/Continuation;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
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
.end method

.method public static final synthetic access$getExtractionSemaphore$p(Lcom/jumio/core/extraction/ExtractionClient;)Lrg0/g;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/extraction/ExtractionClient;->d:Lrg0/g;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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

.method public static final synthetic access$getFrame$p(Lcom/jumio/core/extraction/ExtractionClient;)Lcom/jumio/commons/camera/Frame;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/extraction/ExtractionClient;->g:Lcom/jumio/commons/camera/Frame;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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
.method public final addSubExtraction(Lcom/jumio/core/extraction/ExtractionClient;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .param p1    # Lcom/jumio/core/extraction/ExtractionClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/extraction/ExtractionClient;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/jumio/core/model/StaticModel;",
            "-",
            "Lcom/jumio/core/model/StaticModel;",
            "+",
            "Lcom/jumio/core/model/StaticModel;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "extractionClient"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "mergeResults"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/jumio/core/extraction/SubExtractionProxy;->add(Lcom/jumio/core/extraction/ExtractionClient;Lkotlin/jvm/functions/Function2;)V

    .line 16
    return-void
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
.end method

.method public cancel()V
    .locals 1
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/jumio/core/extraction/ExtractionClient;->setDataExtraction(Z)V

    .line 5
    .line 6
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/extraction/SubExtractionProxy;->cancel()V

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public declared-synchronized capture(Lcom/jumio/commons/camera/Frame;)V
    .locals 1
    .param p1    # Lcom/jumio/commons/camera/Frame;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lcom/jumio/core/util/QAKt;->getQA()Lcom/jumio/core/interfaces/QAInterface;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/extraction/SubExtractionProxy;->capture(Lcom/jumio/commons/camera/Frame;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1
    .line 23
    .line 24
.end method

.method public configure(Lcom/jumio/core/persistence/DataManager;Lcom/jumio/core/model/StaticModel;)V
    .locals 2
    .param p1    # Lcom/jumio/core/persistence/DataManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/model/StaticModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    .line 2
    const-string v0, "dataManager"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "configurationModel"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->n:Lcom/jumio/core/persistence/DataManager;

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->q:Z

    .line 16
    .line 17
    instance-of v1, p2, Lcom/jumio/core/models/ScanPartModel;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    move-object v1, p2

    .line 21
    .line 22
    check-cast v1, Lcom/jumio/core/models/ScanPartModel;

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    .line 26
    :goto_0
    if-eqz v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    :cond_1
    const-string v1, "FRONT"

    .line 41
    .line 42
    :cond_2
    iput-object v1, p0, Lcom/jumio/core/extraction/ExtractionClient;->o:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1, p2}, Lcom/jumio/core/extraction/SubExtractionProxy;->configure(Lcom/jumio/core/persistence/DataManager;Lcom/jumio/core/model/StaticModel;)V

    .line 48
    .line 49
    iget-boolean p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->q:Z

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    iget-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/jumio/core/extraction/SubExtractionProxy;->getAreConfigured()Z

    .line 57
    move-result p1

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const/4 v0, 0x0

    .line 62
    .line 63
    :goto_1
    iput-boolean v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->q:Z

    .line 64
    return-void
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
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public destroy()V
    .locals 3
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->cancel()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->h:Lkotlinx/coroutines/x1;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 13
    .line 14
    :cond_0
    iput-object v1, p0, Lcom/jumio/core/extraction/ExtractionClient;->h:Lkotlinx/coroutines/x1;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->j:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->cancelAll()V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/jumio/core/extraction/SubExtractionProxy;->destroy()V

    .line 25
    return-void
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
.end method

.method public final declared-synchronized feed(Lcom/jumio/commons/camera/Frame;)V
    .locals 4
    .param p1    # Lcom/jumio/commons/camera/Frame;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "frame"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->r:Lcom/jumio/commons/camera/CameraSettings;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/jumio/commons/camera/CameraSettings;->isEmpty()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->s:Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getDataExtraction()Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->shouldFeed()Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    const/4 v1, 0x1

    .line 38
    const/4 v2, 0x0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 42
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    :try_start_1
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->d:Lrg0/g;

    .line 47
    monitor-enter v0
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    .line 50
    :try_start_2
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->getDirectCameraFrame()Z

    .line 51
    move-result v1

    .line 52
    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Frame;->deepCopy()Lcom/jumio/commons/camera/Frame;

    .line 57
    move-result-object v1

    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    move-object v1, p1

    .line 62
    .line 63
    :goto_0
    iput-object v1, p0, Lcom/jumio/core/extraction/ExtractionClient;->g:Lcom/jumio/commons/camera/Frame;

    .line 64
    .line 65
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    .line 68
    :try_start_4
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->d:Lrg0/g;

    .line 69
    .line 70
    .line 71
    invoke-interface {v0}, Lrg0/g;->release()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 72
    goto :goto_3

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    goto :goto_4

    .line 75
    .line 76
    :catch_0
    :try_start_5
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 77
    .line 78
    const-string v1, "semaphoreReleaseException"

    .line 79
    const/4 v2, 0x2

    .line 80
    const/4 v3, 0x0

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v3, v2, v3}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 88
    .line 89
    const-string v0, "Could not release semaphore - let\'s continue anyways"

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 93
    goto :goto_3

    .line 94
    :catch_1
    move-exception p1

    .line 95
    goto :goto_2

    .line 96
    :goto_1
    :try_start_6
    monitor-exit v0

    .line 97
    throw p1
    :try_end_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 98
    .line 99
    :goto_2
    :try_start_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v1, "Insufficient memory for frame deep copy, skipping frame: "

    .line 102
    .line 103
    .line 104
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    const-string v0, "ExtractionClient"

    .line 118
    .line 119
    .line 120
    invoke-static {v0, p1}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    iget-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 126
    monitor-exit p0

    .line 127
    return-void

    .line 128
    .line 129
    :cond_1
    :goto_3
    :try_start_8
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, p1}, Lcom/jumio/core/extraction/SubExtractionProxy;->feed(Lcom/jumio/commons/camera/Frame;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 133
    monitor-exit p0

    .line 134
    return-void

    .line 135
    :goto_4
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 136
    throw p1
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
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method public final getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->r:Lcom/jumio/commons/camera/CameraSettings;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getCenterCropExtractionArea()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->m:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getConfiguredPart()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->o:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->c:Landroid/content/Context;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getDataExtraction()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getDataManager()Lcom/jumio/core/persistence/DataManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->n:Lcom/jumio/core/persistence/DataManager;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getExtractionArea()Landroid/graphics/Rect;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->s:Landroid/graphics/Rect;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getFramePerformance()Ljumio/core/y1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->k:Lcom/jumio/core/performance/FrameRateObserver;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jumio/core/performance/FrameRateObserver;->getFramePerformance()Ljumio/core/y1;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getFrameRateCheck()Lcom/jumio/core/performance/FrameRateCheck;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->p:Lcom/jumio/core/performance/FrameRateCheck;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getFrameRateObserver()Lcom/jumio/core/performance/FrameRateObserver;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->k:Lcom/jumio/core/performance/FrameRateObserver;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public getPreferredPreviewSize()Lcom/jumio/commons/camera/Size;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->j:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getShouldInitAsync()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->l:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public init()V
    .locals 0
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
.end method

.method public final isConfigured()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->q:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final isSubExtraction()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->t:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public onFramesSampled(I)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getFrameRateCheck()Lcom/jumio/core/performance/FrameRateCheck;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/jumio/core/performance/FrameRateCheck;

    .line 9
    .line 10
    sget-object v1, Lcom/jumio/core/performance/FrameRateUtils;->INSTANCE:Lcom/jumio/core/performance/FrameRateUtils;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/jumio/core/extraction/ExtractionClient;->c:Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lcom/jumio/core/performance/FrameRateUtils;->getFrameRate(Landroid/content/Context;)I

    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    .line 19
    .line 20
    const v2, 0x3f4ccccd    # 0.8f

    .line 21
    mul-float/2addr v1, v2

    .line 22
    float-to-int v1, v1

    .line 23
    const/4 v2, 0x1

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, Lcom/jumio/core/performance/FrameRateCheck;-><init>(II)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/jumio/core/extraction/ExtractionClient;->setFrameRateCheck(Lcom/jumio/core/performance/FrameRateCheck;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getFrameRateCheck()Lcom/jumio/core/performance/FrameRateCheck;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/jumio/core/performance/FrameRateCheck;->checkFrameRate(I)Z

    .line 39
    move-result p1

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    sget-object p1, Lcom/jumio/sdk/enums/JumioFallbackReason;->LOW_PERFORMANCE:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->triggerFallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)Lkotlinx/coroutines/x1;

    .line 47
    .line 48
    iget-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->k:Lcom/jumio/core/performance/FrameRateObserver;

    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    const-string v0, "ExtractionClient"

    .line 53
    .line 54
    const-string v1, "Stopping frame rate observation"

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/jumio/core/performance/FrameRateObserver;->stop()V

    .line 61
    :cond_1
    const/4 p1, 0x0

    .line 62
    .line 63
    iput-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->k:Lcom/jumio/core/performance/FrameRateObserver;

    .line 64
    :cond_2
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public abstract process(Lcom/jumio/commons/camera/Frame;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;)V
    .param p1    # Lcom/jumio/commons/camera/Frame;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public publishResult(Lcom/jumio/core/model/StaticModel;)V
    .locals 1
    .param p1    # Lcom/jumio/core/model/StaticModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    invoke-virtual {v0, p1}, Lcom/jumio/core/extraction/SubExtractionProxy;->mergeResult(Lcom/jumio/core/model/StaticModel;)Lcom/jumio/core/model/StaticModel;

    move-result-object p1

    invoke-super {p0, p1}, Lcom/jumio/core/model/PublisherWithUpdate;->publishResult(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic publishResult(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jumio/core/model/StaticModel;

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishResult(Lcom/jumio/core/model/StaticModel;)V

    return-void
.end method

.method public publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V
    .locals 4
    .param p1    # Lcom/jumio/core/extraction/ExtractionUpdateInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/extraction/ExtractionUpdateInterface<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "update"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getState()Ljava/lang/Integer;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getHoldStill()I

    move-result v2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v2, :cond_1

    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/jumio/core/extraction/SubExtractionProxy;->setActive(Z)V

    goto :goto_3

    .line 4
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getTooClose()I

    move-result v2

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v2, :cond_5

    .line 5
    :goto_1
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getMoveCloser()I

    move-result v2

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v2, :cond_5

    .line 6
    :goto_2
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getCenterId()I

    move-result v1

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_6

    .line 7
    :cond_5
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jumio/core/extraction/SubExtractionProxy;->setActive(Z)V

    .line 8
    :cond_6
    :goto_3
    invoke-super {p0, p1}, Lcom/jumio/core/model/PublisherWithUpdate;->publishUpdate(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic publishUpdate(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void
.end method

.method public final reinit()V
    .locals 8

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->q:Z

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->s:Landroid/graphics/Rect;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->r:Lcom/jumio/commons/camera/CameraSettings;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/jumio/commons/camera/CameraSettings;->isEmpty()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->h:Lkotlinx/coroutines/x1;

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    const/4 v2, 0x1

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->j:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getMainScope()Lkotlinx/coroutines/m0;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    new-instance v5, Ljumio/core/j1;

    .line 39
    .line 40
    .line 41
    invoke-direct {v5, p0, v1}, Ljumio/core/j1;-><init>(Lcom/jumio/core/extraction/ExtractionClient;Lkotlin/coroutines/Continuation;)V

    .line 42
    const/4 v6, 0x3

    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    .line 47
    .line 48
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    iput-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->h:Lkotlinx/coroutines/x1;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getDataExtraction()Z

    .line 55
    move-result v0

    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    iget-boolean v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->l:Z

    .line 60
    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->init()V

    .line 65
    goto :goto_0

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getDataExtraction()Z

    .line 69
    move-result v0

    .line 70
    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->j:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 74
    .line 75
    .line 76
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getBackgroundScope()Lkotlinx/coroutines/m0;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    new-instance v5, Ljumio/core/k1;

    .line 80
    .line 81
    .line 82
    invoke-direct {v5, p0, v1}, Ljumio/core/k1;-><init>(Lcom/jumio/core/extraction/ExtractionClient;Lkotlin/coroutines/Continuation;)V

    .line 83
    const/4 v6, 0x3

    .line 84
    const/4 v7, 0x0

    .line 85
    const/4 v3, 0x0

    .line 86
    const/4 v4, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 90
    .line 91
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 92
    const/4 v1, 0x0

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 96
    .line 97
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/jumio/core/extraction/SubExtractionProxy;->reinit()V

    .line 101
    :cond_4
    :goto_1
    return-void
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
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public final removeSubExtraction(Lcom/jumio/core/extraction/ExtractionClient;)V
    .locals 1
    .param p1    # Lcom/jumio/core/extraction/ExtractionClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "extractionClient"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/jumio/core/extraction/SubExtractionProxy;->remove(Lcom/jumio/core/extraction/ExtractionClient;)V

    .line 11
    return-void
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

.method public final requestHighResolutionImage()Z
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->n:Lcom/jumio/core/persistence/DataManager;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-class v1, Lcom/jumio/core/models/UploadSettingsModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/jumio/core/models/UploadSettingsModel;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/jumio/core/models/UploadSettingsModel;->getUploadImageResolution()Lcom/jumio/core/enums/UploadResolution;

    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    .line 22
    :goto_0
    sget-object v1, Lcom/jumio/core/enums/UploadResolution;->UHD:Lcom/jumio/core/enums/UploadResolution;

    .line 23
    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    sget-object v2, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    .line 27
    .line 28
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getCaptureHighResolutionImage()I

    .line 32
    move-result v3

    .line 33
    const/4 v6, 0x4

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static/range {v2 .. v7}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 44
    const/4 v0, 0x1

    .line 45
    return v0

    .line 46
    :cond_1
    const/4 v0, 0x0

    .line 47
    return v0
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
.end method

.method public final setCameraSettings(Lcom/jumio/commons/camera/CameraSettings;)V
    .locals 1
    .param p1    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->copy()Lcom/jumio/commons/camera/CameraSettings;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->r:Lcom/jumio/commons/camera/CameraSettings;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/jumio/core/extraction/SubExtractionProxy;->setCameraSettings(Lcom/jumio/commons/camera/CameraSettings;)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setCenterCropExtractionArea(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->m:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public final setConfigured(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->q:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public final setConfiguredPart(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->o:Ljava/lang/String;

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
.end method

.method public final setContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->c:Landroid/content/Context;

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
.end method

.method public final setDataExtraction(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/jumio/core/extraction/SubExtractionProxy;->setDataExtraction(Z)V

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->k:Lcom/jumio/core/performance/FrameRateObserver;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/jumio/core/performance/FrameRateObserver;->start()V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->k:Lcom/jumio/core/performance/FrameRateObserver;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/jumio/core/performance/FrameRateObserver;->stop()V

    .line 28
    :cond_1
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public final setDataManager(Lcom/jumio/core/persistence/DataManager;)V
    .locals 0
    .param p1    # Lcom/jumio/core/persistence/DataManager;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->n:Lcom/jumio/core/persistence/DataManager;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public final setExtractionArea(Landroid/graphics/Rect;)V
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->m:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/jumio/commons/camera/CameraUtilsKt;->centerCropRect(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 13
    move-result-object p1

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 20
    move-object p1, v0

    .line 21
    .line 22
    :goto_0
    iput-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->s:Landroid/graphics/Rect;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->i:Lcom/jumio/core/extraction/SubExtractionProxy;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/jumio/core/extraction/SubExtractionProxy;->setExtractionArea(Landroid/graphics/Rect;)V

    .line 28
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public setFrameRateCheck(Lcom/jumio/core/performance/FrameRateCheck;)V
    .locals 0
    .param p1    # Lcom/jumio/core/performance/FrameRateCheck;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->p:Lcom/jumio/core/performance/FrameRateCheck;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public final setResult(Z)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->k:Lcom/jumio/core/performance/FrameRateObserver;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-string v0, "ExtractionClient"

    .line 14
    .line 15
    const-string v1, "Stopping frame rate observation"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/jumio/core/performance/FrameRateObserver;->stop()V

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    .line 24
    iput-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->k:Lcom/jumio/core/performance/FrameRateObserver;

    .line 25
    :cond_1
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public final setScopeProvider(Lcom/jumio/core/scope/ScopeProviderInterface;)V
    .locals 1
    .param p1    # Lcom/jumio/core/scope/ScopeProviderInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->j:Lcom/jumio/core/scope/ScopeProviderInterface;

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
.end method

.method public final setShouldInitAsync(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->l:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public final setSubExtraction(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/core/extraction/ExtractionClient;->t:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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

.method public abstract shouldFeed()Z
.end method

.method public final startFrameRateObservation(JLcom/jumio/core/performance/FrameRateCallback;)V
    .locals 3
    .param p3    # Lcom/jumio/core/performance/FrameRateCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "frameRateCallback"

    .line 3
    .line 4
    .line 5
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->k:Lcom/jumio/core/performance/FrameRateObserver;

    .line 8
    .line 9
    const-string v1, "ExtractionClient"

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "Stopping frame rate observation"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/jumio/core/performance/FrameRateObserver;->stop()V

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    .line 22
    iput-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->k:Lcom/jumio/core/performance/FrameRateObserver;

    .line 23
    .line 24
    const-string v0, "Starting frame rate observation"

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    new-instance v0, Lcom/jumio/core/performance/FrameRateObserver;

    .line 30
    .line 31
    sget-object v1, Lcom/jumio/core/performance/FrameRateObserver$THREAD;->WORKER:Lcom/jumio/core/performance/FrameRateObserver$THREAD;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, p1, p2, p3, v1}, Lcom/jumio/core/performance/FrameRateObserver;-><init>(JLcom/jumio/core/performance/FrameRateCallback;Lcom/jumio/core/performance/FrameRateObserver$THREAD;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/jumio/core/performance/FrameRateObserver;->start()V

    .line 38
    .line 39
    iput-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->k:Lcom/jumio/core/performance/FrameRateObserver;

    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public takePicture()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
.end method

.method public takePictureManually()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
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
.end method

.method public final triggerFallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)Lkotlinx/coroutines/x1;
    .locals 3
    .param p1    # Lcom/jumio/sdk/enums/JumioFallbackReason;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "fallbackReason"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/extraction/ExtractionClient;->j:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 8
    .line 9
    new-instance v1, Lcom/jumio/core/extraction/a;

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0, p1, v2}, Lcom/jumio/core/extraction/a;-><init>(Lcom/jumio/core/extraction/ExtractionClient;Lcom/jumio/sdk/enums/JumioFallbackReason;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lcom/jumio/core/scope/ScopeProviderInterface;->postOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
