.class public interface abstract Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;",
        "",
        "onFailure",
        "",
        "code",
        "",
        "desc",
        "",
        "onSuccess",
        "statisticsData",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;",
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


# virtual methods
.method public abstract onFailure(ILjava/lang/String;)V
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;)V
    .param p1    # Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveStatisticsData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
