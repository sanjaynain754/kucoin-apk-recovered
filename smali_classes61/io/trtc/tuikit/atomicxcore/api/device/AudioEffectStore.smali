.class public abstract Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008&\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0007\u001a\u00020\u0008H&J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u000c\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0013H&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;",
        "",
        "()V",
        "audioEffectState",
        "Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectState;",
        "getAudioEffectState",
        "()Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectState;",
        "reset",
        "",
        "setAudioChangerType",
        "type",
        "Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;",
        "setAudioReverbType",
        "Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;",
        "setVoiceEarMonitorEnable",
        "enable",
        "",
        "setVoiceEarMonitorVolume",
        "volume",
        "",
        "Companion",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore$Companion;

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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static final shared()Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method


# virtual methods
.method public abstract getAudioEffectState()Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract reset()V
.end method

.method public abstract setAudioChangerType(Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/device/AudioChangerType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setAudioReverbType(Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setVoiceEarMonitorEnable(Z)V
.end method

.method public abstract setVoiceEarMonitorVolume(I)V
.end method
