.class public interface abstract Lle0/a;
.super Ljava/lang/Object;
.source "LiveWebService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ6\u0010\u001f\u001a\u00020 2\u0008\u0008\u0001\u0010!\u001a\u00020\n2\u0008\u0008\u0001\u0010\"\u001a\u00020\n2\u0008\u0008\u0001\u0010#\u001a\u00020\n2\u0008\u0008\u0001\u0010$\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010%J\u0018\u0010&\u001a\u00020\'2\u0008\u0008\u0001\u0010\u0010\u001a\u00020(H\u00a7@\u00a2\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020+2\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010,\u001a\u00020-2\u0008\u0008\u0001\u0010\u0010\u001a\u00020.H\u00a7@\u00a2\u0006\u0002\u0010/J\u001a\u00100\u001a\u0004\u0018\u0001012\u0008\u0008\u0001\u0010\u0010\u001a\u000202H\u00a7@\u00a2\u0006\u0002\u00103J\u001a\u00104\u001a\u0004\u0018\u0001052\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001a\u00106\u001a\u0004\u0018\u0001012\u0008\u0008\u0001\u0010\u0010\u001a\u000207H\u00a7@\u00a2\u0006\u0002\u00108\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u00069\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/kc/data/source/remote/LiveWebService;",
        "",
        "loadLiveTxUserInfo",
        "Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;",
        "liveRoomInfo",
        "Lcom/trtc/uikit/livekit/kc/data/entity/LiveRoomInfo;",
        "(Lcom/trtc/uikit/livekit/kc/data/entity/LiveRoomInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadLiveInfo",
        "Lcom/trtc/uikit/livekit/kc/data/entity/KCLiveInfo;",
        "roomId",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadLiveHitCount",
        "Lcom/trtc/uikit/livekit/kc/data/entity/LiveHitCount;",
        "followLive",
        "Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Response;",
        "request",
        "Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Request;",
        "(Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "reserveLive",
        "Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Response;",
        "Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Request;",
        "(Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadLiveShareLink",
        "Lcom/trtc/uikit/livekit/kc/data/entity/LiveShareLink;",
        "report",
        "Lcom/trtc/uikit/livekit/kc/data/entity/Report$Response;",
        "Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;",
        "(Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadSubscribeStatus",
        "Lcom/trtc/uikit/livekit/kc/data/entity/SubscribeStatus;",
        "loadSharedPosition",
        "Lcom/trtc/uikit/livekit/kc/data/entity/SharedPositionInfo;",
        "bizType",
        "bizId",
        "userOpenId",
        "closeId",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "reportClickCard",
        "Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Response;",
        "Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Request;",
        "(Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadEntranceConfig",
        "Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;",
        "preCheckCard",
        "Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$ResponseEntity;",
        "Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$Request;",
        "(Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "saveLiveCard",
        "",
        "Lcom/trtc/uikit/livekit/kc/data/entity/SaveLiveCard$Request;",
        "(Lcom/trtc/uikit/livekit/kc/data/entity/SaveLiveCard$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadCardInfo",
        "Lcom/trtc/uikit/livekit/kc/data/entity/LiveCardInfoListEntity;",
        "blockUser",
        "Lcom/trtc/uikit/livekit/kc/data/entity/BlockUser$Request;",
        "(Lcom/trtc/uikit/livekit/kc/data/entity/BlockUser$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "roomId"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/LiveCardInfoListEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "live-stream/api/v1/getCardInfo"
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "roomId"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/LiveHitCount;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "live-stream/api/v1/getLiveHitCount"
    .end annotation
.end method

.method public abstract c(Lcom/trtc/uikit/livekit/kc/data/entity/LiveRoomInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/trtc/uikit/livekit/kc/data/entity/LiveRoomInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/trtc/uikit/livekit/kc/data/entity/LiveRoomInfo;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "live-stream/api/v1/tx/user"
    .end annotation
.end method

.method public abstract d(Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "live-stream/api/v1/reportEvent"
    .end annotation
.end method

.method public abstract e(Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "live-stream/api/v1/subscribe"
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "roomId"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/SubscribeStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "live-stream/api/v1/getSubscribe"
    .end annotation
.end method

.method public abstract g(Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/Report$Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "live-stream/api/v1/reportEvent"
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "roomId"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/LiveShareLink;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "live-stream/api/v1/getLiveShareLink"
    .end annotation
.end method

.method public abstract i(Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$ResponseEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "live-stream/api/v1/saveCardInfo/preCheck"
    .end annotation
.end method

.method public abstract j(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "roomId"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/KCLiveInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "live-stream/api/v1/getLiveInfo"
    .end annotation
.end method

.method public abstract k(Lcom/trtc/uikit/livekit/kc/data/entity/SaveLiveCard$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/trtc/uikit/livekit/kc/data/entity/SaveLiveCard$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/trtc/uikit/livekit/kc/data/entity/SaveLiveCard$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "live-stream/api/v1/saveCardInfo"
    .end annotation
.end method

.method public abstract l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "bizType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "bizId"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "userOpenId"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "closeId"
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/SharedPositionInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/km/position/feed/shared-position"
    .end annotation
.end method

.method public abstract m(Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "live-stream/api/v1/reserve"
    .end annotation
.end method

.method public abstract n(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "roomId"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "live-stream/api/v1/cardEnabled"
    .end annotation
.end method

.method public abstract o(Lcom/trtc/uikit/livekit/kc/data/entity/BlockUser$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/trtc/uikit/livekit/kc/data/entity/BlockUser$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/trtc/uikit/livekit/kc/data/entity/BlockUser$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "live-stream/api/v1/block-streamer"
    .end annotation
.end method
