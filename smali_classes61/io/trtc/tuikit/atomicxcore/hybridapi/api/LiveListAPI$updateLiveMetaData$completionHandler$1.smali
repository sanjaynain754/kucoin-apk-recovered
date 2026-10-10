.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$updateLiveMetaData$completionHandler$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI;->updateLiveMetaData(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0008\u0010\u0008\u001a\u00020\u0003H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "io/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$updateLiveMetaData$completionHandler$1",
        "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;",
        "onFailure",
        "",
        "code",
        "",
        "desc",
        "",
        "onSuccess",
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


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $request:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$updateLiveMetaData$completionHandler$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$updateLiveMetaData$completionHandler$1;->$request:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;

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
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 8
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "desc"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$updateLiveMetaData$completionHandler$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    sget-object v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse;->Companion:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$updateLiveMetaData$completionHandler$1;->$request:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;->getApi()Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    const/16 v6, 0x8

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    move v3, p1

    .line 21
    move-object v4, p2

    .line 22
    .line 23
    .line 24
    invoke-static/range {v1 .. v7}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;->failure$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    return-void
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
.end method

.method public onSuccess()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$updateLiveMetaData$completionHandler$1;->$callback:Lkotlin/jvm/functions/Function1;

    .line 3
    .line 4
    sget-object v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse;->Companion:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;

    .line 5
    .line 6
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI$updateLiveMetaData$completionHandler$1;->$request:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;->getApi()Ljava/lang/String;

    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x2

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2, v3, v4, v3}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;->success$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    return-void
    .line 21
.end method
