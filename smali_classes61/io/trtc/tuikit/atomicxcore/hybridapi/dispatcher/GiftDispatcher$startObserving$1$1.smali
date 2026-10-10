.class final Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "usableGifts",
        "",
        "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;",
        "emit",
        "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGiftDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$1$1\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,82:1\n35#2,2:83\n*S KotlinDebug\n*F\n+ 1 GiftDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$1$1\n*L\n30#1:83,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$1$1;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$1$1;->emit(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$1$1;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;

    invoke-static {p2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    move-result-object v0

    const/16 v6, 0x1b

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string/jumbo v3, "usableGifts"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    move-result-object p2

    .line 3
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "toJson(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    const-string/jumbo v0, "usableGifts"

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher$startObserving$1$1;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;

    invoke-virtual {v0, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
