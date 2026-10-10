.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;
.super Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\u0008\u0010\u000e\u001a\u00020\u0006H\u0016J\u0008\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;",
        "liveID",
        "",
        "eventEmitter",
        "Lkotlin/Function2;",
        "",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V",
        "baseKey",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;",
        "eventListener",
        "Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;",
        "dispatchCurrentState",
        "key",
        "startObserving",
        "stopObserving",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGiftDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,82:1\n35#2,2:83\n*S KotlinDebug\n*F\n+ 1 GiftDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher\n*L\n75#1:83,2\n*E\n"
    }
.end annotation


# instance fields
.field private final baseKey:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private eventListener:Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final liveID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
    .locals 7
    .param p1    # Ljava/lang/String;
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
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "liveID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "eventEmitter"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;->liveID:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 18
    .line 19
    const-string v4, ""

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    const-string/jumbo v2, "state"

    .line 24
    .line 25
    const-string v3, "GiftStore"

    .line 26
    move-object v5, p1

    .line 27
    .line 28
    .line 29
    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;->baseKey:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 32
    return-void
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
.end method

.method public static final synthetic access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;->baseKey:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final synthetic access$getLiveID$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;->liveID:Ljava/lang/String;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public dispatchCurrentState(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)V
    .locals 3
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore$Companion;

    .line 8
    .line 9
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;->liveID:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;->getGiftState()Lio/trtc/tuikit/atomicxcore/api/gift/GiftState;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getName()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    const-string/jumbo v2, "usableGifts"

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftState;->getUsableGifts()Lkotlinx/coroutines/flow/w;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    const-string/jumbo v1, "toJson(...)"

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 64
    :cond_0
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
.end method

.method public startObserving()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->getObserverScope()Lkotlinx/coroutines/m0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v3, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$1;

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v3, p0, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$1;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;Lkotlin/coroutines/Continuation;)V

    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 20
    .line 21
    new-instance v0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$2;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$2;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;)V

    .line 25
    .line 26
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;->eventListener:Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;

    .line 27
    .line 28
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore$Companion;

    .line 29
    .line 30
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;->liveID:Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;->addGiftListener(Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;)V

    .line 38
    return-void
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
.end method

.method public stopObserving()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;->eventListener:Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore$Companion;

    .line 7
    .line 8
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;->liveID:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;->removeGiftListener(Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;)V

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;->eventListener:Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->getKeys()Ljava/util/Set;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 26
    return-void
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
.end method
