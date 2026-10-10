.class public interface abstract Lcom/kubi/operation/lib/api/b;
.super Ljava/lang/Object;
.source "OperationApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00032\u0008\u0008\u0001\u0010\t\u001a\u00020\u0006H\'J\u001a\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00032\u0008\u0008\u0001\u0010\t\u001a\u00020\u0006H\'J\u001a\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0006H\'J!\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00032\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\'\u00a2\u0006\u0002\u0010\u0012J\'\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00032\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\'\u00a2\u0006\u0002\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00082\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00a7@\u00a2\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\r2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u001bJ\u0014\u0010 \u001a\u0008\u0012\u0004\u0012\u00020!0\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u001eJ\u0018\u0010\"\u001a\u00020\u000b2\u0008\u0008\u0001\u0010#\u001a\u00020$H\u00a7@\u00a2\u0006\u0002\u0010%J\u0014\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\'0\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010(\u001a\u0004\u0018\u00010)H\u00a7@\u00a2\u0006\u0002\u0010\u001eJ\u001a\u0010*\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0001\u0010#\u001a\u00020+H\u00a7@\u00a2\u0006\u0002\u0010,\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006-\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/operation/lib/api/OperationApi;",
        "",
        "currencyDetail",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/operation/lib/entity/CoinTopicEntity;",
        "currency",
        "",
        "taskInfo",
        "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;",
        "userId",
        "welfareCardShowConfig",
        "",
        "welfareApplyJoinTask",
        "Lcom/kubi/operation/api/entity/WelfareSignupEntity;",
        "questId",
        "bonusCardInfo",
        "cacheTime",
        "",
        "(Ljava/lang/Long;)Lkotlinx/coroutines/flow/Flow;",
        "mainCoinCardInfo",
        "",
        "Lcom/kubi/operation/lib/entity/MainCoinDataEntity;",
        "fetchNewUserWidgetInfo",
        "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchLearnWidgetInfo",
        "Lcom/kubi/operation/lib/entity/LearnVideoEntity;",
        "fetchUserStatusWidgetInfo",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchUserStatusWidgetInfoV2",
        "Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "requestWelfareApplyJoinTask",
        "gempoolData",
        "Lcom/kubi/operation/lib/realtime/gempool/GempoolItemEntity;",
        "gempoolViewed",
        "body",
        "Lcom/kubi/operation/lib/realtime/gempool/GempoolMarkedReadReqEntity;",
        "(Lcom/kubi/operation/lib/realtime/gempool/GempoolMarkedReadReqEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "realtimeBonusData",
        "Lcom/kubi/operation/lib/realtime/bonus/BonusItemEntity;",
        "dynamicCardList",
        "Lcom/kubi/operation/lib/realtimev2/DynamicCardEntity;",
        "deleteDynamicCard",
        "Lcom/kubi/operation/lib/realtimev2/DynamicCardDeleteEntity;",
        "(Lcom/kubi/operation/lib/realtimev2/DynamicCardDeleteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "OperationLib_googleRelease"
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
.method public abstract a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;",
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
        value = "v1/home-page/guidance-card"
    .end annotation
.end method

.method public abstract b(Ljava/lang/Long;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "Cache-Time"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/kcop/newcomer/user-task/info2"
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "currency"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/operation/lib/entity/CoinTopicEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/kcop/platform-hottopic/anchors/currency-detail"
    .end annotation
.end method

.method public abstract d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/operation/lib/realtime/bonus/BonusItemEntity;",
            ">;>;)",
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
        value = "v2/kcop/newcomer/task/list"
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "questId"
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
            "Lcom/kubi/operation/api/entity/WelfareSignupEntity;",
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
        value = "v1/signUp"
    .end annotation
.end method

.method public abstract f(Lcom/kubi/operation/lib/realtime/gempool/GempoolMarkedReadReqEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/operation/lib/realtime/gempool/GempoolMarkedReadReqEntity;
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
            "Lcom/kubi/operation/lib/realtime/gempool/GempoolMarkedReadReqEntity;",
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
        value = "gempool/staking/campaign/viewed-ended-cards"
    .end annotation
.end method

.method public abstract g(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/kcop/newcomer/user-task/info"
    .end annotation
.end method

.method public abstract h(Lcom/kubi/operation/lib/realtimev2/DynamicCardDeleteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/operation/lib/realtimev2/DynamicCardDeleteEntity;
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
            "Lcom/kubi/operation/lib/realtimev2/DynamicCardDeleteEntity;",
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
        value = "v1/home-page/dynamic-card/delete"
    .end annotation
.end method

.method public abstract i(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/operation/lib/realtime/gempool/GempoolItemEntity;",
            ">;>;)",
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
        value = "gempool/staking/campaign/cards"
    .end annotation
.end method

.method public abstract j(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "Cache-Time"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/operation/lib/entity/LearnVideoEntity;",
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
        value = "v1/newcommer-page/learn"
    .end annotation
.end method

.method public abstract k(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "Cache-Time"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;",
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
        value = "v2/kcop/newcomer/user-task/info2"
    .end annotation
.end method

.method public abstract l(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/operation/lib/realtimev2/DynamicCardEntity;",
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
        value = "v1/home-page/dynamic-card/list"
    .end annotation
.end method

.method public abstract m(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "userId"
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
            "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;",
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
        value = "v2/kcop/newcomer/user-task/info"
    .end annotation
.end method

.method public abstract n(Ljava/lang/Long;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "Cache-Time"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/operation/lib/entity/MainCoinDataEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/homepage/card/currency"
    .end annotation
.end method

.method public abstract o(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "questId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/operation/api/entity/WelfareSignupEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/signUp"
    .end annotation
.end method
