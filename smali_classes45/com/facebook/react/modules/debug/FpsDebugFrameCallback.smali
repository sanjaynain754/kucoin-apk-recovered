.class public final Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;
.super Ljava/lang/Object;
.source "FpsDebugFrameCallback.kt"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$Companion;,
        Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$FpsInfo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0019\u0018\u0000 42\u00020\u0001:\u000234B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0012\u0010\u001e\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017H\u0007J\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u0006\u0010-\u001a\u00020\u0010J\u0010\u00100\u001a\u0004\u0018\u00010\u001a2\u0006\u00101\u001a\u00020\rJ\u0006\u00102\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#R\u0011\u0010$\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010#R\u0011\u0010&\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0011\u0010)\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010(R\u0011\u0010+\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010(R\u0011\u0010.\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010(\u00a8\u00065"
    }
    d2 = {
        "Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;",
        "Landroid/view/Choreographer$FrameCallback;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactContext;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactContext;)V",
        "choreographer",
        "Landroid/view/Choreographer;",
        "uiManagerModule",
        "Lcom/facebook/react/uimanager/UIManagerModule;",
        "didJSUpdateUiDuringFrameDetector",
        "Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;",
        "firstFrameTime",
        "",
        "lastFrameTime",
        "numFrameCallbacks",
        "",
        "expectedNumFramesPrev",
        "fourPlusFrameStutters",
        "numFrameCallbacksWithBatchDispatches",
        "isRecordingFpsInfoAtEachFrame",
        "",
        "targetFps",
        "",
        "timeToFps",
        "Ljava/util/TreeMap;",
        "Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$FpsInfo;",
        "doFrame",
        "",
        "l",
        "start",
        "startAndRecordFpsAtEachFrame",
        "stop",
        "fps",
        "getFps",
        "()D",
        "jsFPS",
        "getJsFPS",
        "numFrames",
        "getNumFrames",
        "()I",
        "numJSFrames",
        "getNumJSFrames",
        "expectedNumFrames",
        "getExpectedNumFrames",
        "get4PlusFrameStutters",
        "totalTimeMS",
        "getTotalTimeMS",
        "getFpsInfo",
        "upToTimeMs",
        "reset",
        "FpsInfo",
        "Companion",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DEFAULT_FPS:D = 60.0


# instance fields
.field private choreographer:Landroid/view/Choreographer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final didJSUpdateUiDuringFrameDetector:Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private expectedNumFramesPrev:I

.field private firstFrameTime:J

.field private fourPlusFrameStutters:I

.field private isRecordingFpsInfoAtEachFrame:Z

.field private lastFrameTime:J

.field private numFrameCallbacks:I

.field private numFrameCallbacksWithBatchDispatches:I

.field private final reactContext:Lcom/facebook/react/bridge/ReactContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private targetFps:D

.field private timeToFps:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Ljava/lang/Long;",
            "Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$FpsInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final uiManagerModule:Lcom/facebook/react/uimanager/UIManagerModule;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->Companion:Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$Companion;

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
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2
    .param p1    # Lcom/facebook/react/bridge/ReactContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "reactContext"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    iput-object p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->reactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 12
    .line 13
    const-class v0, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    check-cast p1, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->uiManagerModule:Lcom/facebook/react/uimanager/UIManagerModule;

    .line 22
    .line 23
    new-instance p1, Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1}, Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;-><init>()V

    .line 27
    .line 28
    iput-object p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->didJSUpdateUiDuringFrameDetector:Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;

    .line 29
    .line 30
    const-wide/16 v0, -0x1

    .line 31
    .line 32
    iput-wide v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->firstFrameTime:J

    .line 33
    .line 34
    iput-wide v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->lastFrameTime:J

    .line 35
    .line 36
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    .line 37
    .line 38
    iput-wide v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->targetFps:D

    .line 39
    return-void
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
.end method

.method public static synthetic a(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->start$lambda$0(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;)V

    .line 4
    return-void
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
.end method

.method public static synthetic b(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->stop$lambda$1(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;)V

    .line 4
    return-void
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
.end method

.method public static synthetic start$default(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;DILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x1

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    iget-wide p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->targetFps:D

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->start(D)V

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
.end method

.method private static final start$lambda$0(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->choreographer:Landroid/view/Choreographer;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 12
    :cond_0
    return-void
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
.end method

.method private static final stop$lambda$1(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->choreographer:Landroid/view/Choreographer;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 12
    :cond_0
    return-void
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
.end method


# virtual methods
.method public doFrame(J)V
    .locals 10

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->firstFrameTime:J

    .line 3
    .line 4
    const-wide/16 v2, -0x1

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-wide p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->firstFrameTime:J

    .line 11
    .line 12
    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->lastFrameTime:J

    .line 13
    .line 14
    iput-wide p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->lastFrameTime:J

    .line 15
    .line 16
    iget-object v2, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->didJSUpdateUiDuringFrameDetector:Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v0, v1, p1, p2}, Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;->getDidJSHitFrameAndCleanup(JJ)Z

    .line 20
    move-result p1

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->numFrameCallbacksWithBatchDispatches:I

    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    iput p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->numFrameCallbacksWithBatchDispatches:I

    .line 29
    .line 30
    :cond_1
    iget p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->numFrameCallbacks:I

    .line 31
    .line 32
    add-int/lit8 p1, p1, 0x1

    .line 33
    .line 34
    iput p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->numFrameCallbacks:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getExpectedNumFrames()I

    .line 38
    move-result v3

    .line 39
    .line 40
    iget p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->expectedNumFramesPrev:I

    .line 41
    .line 42
    sub-int p1, v3, p1

    .line 43
    .line 44
    add-int/lit8 p1, p1, -0x1

    .line 45
    const/4 p2, 0x4

    .line 46
    .line 47
    if-lt p1, p2, :cond_2

    .line 48
    .line 49
    iget p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->fourPlusFrameStutters:I

    .line 50
    .line 51
    add-int/lit8 p1, p1, 0x1

    .line 52
    .line 53
    iput p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->fourPlusFrameStutters:I

    .line 54
    .line 55
    :cond_2
    iget-boolean p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->isRecordingFpsInfoAtEachFrame:Z

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    iget-object p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->timeToFps:Ljava/util/TreeMap;

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    new-instance v0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$FpsInfo;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getNumFrames()I

    .line 68
    move-result v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getNumJSFrames()I

    .line 72
    move-result v2

    .line 73
    .line 74
    iget v4, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->fourPlusFrameStutters:I

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getFps()D

    .line 78
    move-result-wide v5

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getJsFPS()D

    .line 82
    move-result-wide v7

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getTotalTimeMS()I

    .line 86
    move-result v9

    .line 87
    .line 88
    .line 89
    invoke-direct/range {v0 .. v9}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$FpsInfo;-><init>(IIIIDDI)V

    .line 90
    .line 91
    iget-object p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->timeToFps:Ljava/util/TreeMap;

    .line 92
    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    .line 96
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 97
    move-result-wide v1

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    move-result-object p2

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p2, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    check-cast p1, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$FpsInfo;

    .line 108
    .line 109
    :cond_3
    iput v3, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->expectedNumFramesPrev:I

    .line 110
    .line 111
    iget-object p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->choreographer:Landroid/view/Choreographer;

    .line 112
    .line 113
    if-eqz p1, :cond_4

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 117
    :cond_4
    return-void
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
.end method

.method public final get4PlusFrameStutters()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->fourPlusFrameStutters:I

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
    .line 17
    .line 18
.end method

.method public final getExpectedNumFrames()I
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getTotalTimeMS()I

    .line 4
    move-result v0

    .line 5
    int-to-double v0, v0

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->targetFps:D

    .line 8
    mul-double/2addr v2, v0

    .line 9
    .line 10
    const/16 v0, 0x3e8

    .line 11
    int-to-double v0, v0

    .line 12
    div-double/2addr v2, v0

    .line 13
    const/4 v0, 0x1

    .line 14
    int-to-double v0, v0

    .line 15
    add-double/2addr v2, v0

    .line 16
    double-to-int v0, v2

    .line 17
    return v0
    .line 18
.end method

.method public final getFps()D
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->lastFrameTime:J

    .line 3
    .line 4
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->firstFrameTime:J

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    return-wide v0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getNumFrames()I

    .line 15
    move-result v0

    .line 16
    int-to-double v0, v0

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    .line 22
    mul-double/2addr v0, v2

    .line 23
    .line 24
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->lastFrameTime:J

    .line 25
    .line 26
    iget-wide v4, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->firstFrameTime:J

    .line 27
    sub-long/2addr v2, v4

    .line 28
    long-to-double v2, v2

    .line 29
    div-double/2addr v0, v2

    .line 30
    return-wide v0
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
.end method

.method public final getFpsInfo(J)Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$FpsInfo;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->timeToFps:Ljava/util/TreeMap;

    .line 3
    .line 4
    const-string v1, "FPS was not recorded at each frame!"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lh6/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->timeToFps:Ljava/util/TreeMap;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    check-cast p1, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$FpsInfo;

    .line 29
    return-object p1

    .line 30
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 31
    return-object p1
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
.end method

.method public final getJsFPS()D
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->lastFrameTime:J

    .line 3
    .line 4
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->firstFrameTime:J

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    return-wide v0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getNumJSFrames()I

    .line 15
    move-result v0

    .line 16
    int-to-double v0, v0

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    .line 22
    mul-double/2addr v0, v2

    .line 23
    .line 24
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->lastFrameTime:J

    .line 25
    .line 26
    iget-wide v4, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->firstFrameTime:J

    .line 27
    sub-long/2addr v2, v4

    .line 28
    long-to-double v2, v2

    .line 29
    div-double/2addr v0, v2

    .line 30
    return-wide v0
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
.end method

.method public final getNumFrames()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->numFrameCallbacks:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    return v0
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
.end method

.method public final getNumJSFrames()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->numFrameCallbacksWithBatchDispatches:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    return v0
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
.end method

.method public final getTotalTimeMS()I
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->lastFrameTime:J

    .line 3
    long-to-double v0, v0

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->firstFrameTime:J

    .line 6
    long-to-double v2, v2

    .line 7
    sub-double/2addr v0, v2

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide v2, 0x412e848000000000L    # 1000000.0

    .line 13
    div-double/2addr v0, v2

    .line 14
    double-to-int v0, v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
.end method

.method public final reset()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, -0x1

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->firstFrameTime:J

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->lastFrameTime:J

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->numFrameCallbacks:I

    .line 10
    .line 11
    iput v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->fourPlusFrameStutters:I

    .line 12
    .line 13
    iput v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->numFrameCallbacksWithBatchDispatches:I

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->isRecordingFpsInfoAtEachFrame:Z

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    iput-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->timeToFps:Ljava/util/TreeMap;

    .line 19
    return-void
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
.end method

.method public final start()V
    .locals 4
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static {p0, v2, v3, v0, v1}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->start$default(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;DILjava/lang/Object;)V

    return-void
.end method

.method public final start(D)V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->reactContext:Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->reactContext:Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->didJSUpdateUiDuringFrameDetector:Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/CatalystInstance;->addBridgeIdleDebugListener(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->uiManagerModule:Lcom/facebook/react/uimanager/UIManagerModule;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->didJSUpdateUiDuringFrameDetector:Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/UIManagerModule;->setViewHierarchyUpdateDebugListener(Lcom/facebook/react/uimanager/debug/NotThreadSafeViewHierarchyUpdateDebugListener;)V

    .line 5
    :cond_1
    iput-wide p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->targetFps:D

    .line 6
    new-instance p1, Lcom/facebook/react/modules/debug/d;

    invoke-direct {p1, p0}, Lcom/facebook/react/modules/debug/d;-><init>(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;)V

    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final startAndRecordFpsAtEachFrame()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/util/TreeMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 6
    .line 7
    iput-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->timeToFps:Ljava/util/TreeMap;

    .line 8
    const/4 v0, 0x1

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->isRecordingFpsInfoAtEachFrame:Z

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v1, v2, v0, v3}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->start$default(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;DILjava/lang/Object;)V

    .line 17
    return-void
    .line 18
.end method

.method public final stop()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->reactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->reactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->didJSUpdateUiDuringFrameDetector:Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/CatalystInstance;->removeBridgeIdleDebugListener(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->uiManagerModule:Lcom/facebook/react/uimanager/UIManagerModule;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/UIManagerModule;->setViewHierarchyUpdateDebugListener(Lcom/facebook/react/uimanager/debug/NotThreadSafeViewHierarchyUpdateDebugListener;)V

    .line 28
    .line 29
    :cond_1
    new-instance v0, Lcom/facebook/react/modules/debug/e;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, p0}, Lcom/facebook/react/modules/debug/e;-><init>(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 36
    return-void
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
.end method
