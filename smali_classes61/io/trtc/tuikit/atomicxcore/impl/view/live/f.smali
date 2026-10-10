.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

.field public final synthetic b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/f;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/f;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;

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
.method public final onFailure(ILjava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "desc"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/f;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCallbackHandler$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/f;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->b(Ljava/lang/String;)V

    .line 21
    .line 22
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/f;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 32
    :cond_0
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

.method public final onSuccess(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "liveInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/f;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoreStateProvider$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 15
    .line 16
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/f;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/live/u0;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;->onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;)V

    .line 26
    :cond_0
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
.end method
