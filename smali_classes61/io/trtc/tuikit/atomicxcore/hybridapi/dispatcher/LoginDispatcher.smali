.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;
.super Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0008H\u0016J\u0008\u0010\u000b\u001a\u00020\u0005H\u0016J\u0008\u0010\u000c\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;",
        "eventEmitter",
        "Lkotlin/Function2;",
        "",
        "",
        "(Lkotlin/jvm/functions/Function2;)V",
        "baseKey",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;",
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
        "SMAP\nLoginDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,59:1\n35#2,2:60\n*S KotlinDebug\n*F\n+ 1 LoginDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher\n*L\n52#1:60,2\n*E\n"
    }
.end annotation


# instance fields
.field private final baseKey:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;)V
    .locals 7
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
    const-string v0, "eventEmitter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 9
    .line 10
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "state"

    .line 16
    .line 17
    const-string v3, "LoginStore"

    .line 18
    .line 19
    const-string v4, ""

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;->baseKey:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final synthetic access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;->baseKey:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

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
    .locals 4
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
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getName()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-string v2, "loginStatus"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    move-result v3

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginStatus()Lkotlinx/coroutines/flow/w;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;->getValue()I

    .line 37
    move-result v0

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 53
    return-void

    .line 54
    .line 55
    :cond_0
    const-string v2, "loginUserInfo"

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    move-result v1

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 72
    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    .line 84
    const-string/jumbo v1, "toJson(...)"

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    if-nez v0, :cond_2

    .line 90
    .line 91
    :cond_1
    const-string v0, "null"

    .line 92
    .line 93
    .line 94
    :cond_2
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    .line 98
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 103
    :cond_3
    return-void
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
    .locals 13

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
    new-instance v3, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher$startObserving$1;

    .line 11
    const/4 v6, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v3, p0, v6}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher$startObserving$1;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;Lkotlin/coroutines/Continuation;)V

    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->getObserverScope()Lkotlinx/coroutines/m0;

    .line 24
    move-result-object v7

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 28
    move-result-object v8

    .line 29
    .line 30
    new-instance v10, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher$startObserving$2;

    .line 31
    .line 32
    .line 33
    invoke-direct {v10, p0, v6}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher$startObserving$2;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;Lkotlin/coroutines/Continuation;)V

    .line 34
    const/4 v11, 0x2

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v9, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 40
    return-void
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
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->getKeys()Ljava/util/Set;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Set;->clear()V

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
.end method
