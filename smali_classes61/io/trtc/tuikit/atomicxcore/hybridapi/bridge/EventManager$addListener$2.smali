.class final Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->addListener(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;",
        "liveID",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$2;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
.method public final invoke(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "liveID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;

    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$2;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;

    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;->access$getEventEmitter$p(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;)Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager$addListener$2;->invoke(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;

    move-result-object p1

    return-object p1
.end method
