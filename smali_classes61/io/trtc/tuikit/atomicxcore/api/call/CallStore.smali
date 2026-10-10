.class public abstract Lio/trtc/tuikit/atomicxcore/api/call/CallStore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008&\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\rH&J2\u0010\u000e\u001a\u00020\u00082\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\t\u001a\u0004\u0018\u00010\nH&J \u0010\u0016\u001a\u00020\u00082\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0008\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\u0018\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH&J*\u0010\u0019\u001a\u00020\u00082\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\t\u001a\u0004\u0018\u00010\nH&J\u001a\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u001c\u001a\u00020\u00112\u0008\u0010\t\u001a\u0004\u0018\u00010\nH&J\"\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0008\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0012\u0010!\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\"\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\rH&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006$"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/call/CallStore;",
        "",
        "()V",
        "observerState",
        "Lio/trtc/tuikit/atomicxcore/api/call/CallState;",
        "getObserverState",
        "()Lio/trtc/tuikit/atomicxcore/api/call/CallState;",
        "accept",
        "",
        "completion",
        "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;",
        "addListener",
        "listener",
        "Lio/trtc/tuikit/atomicxcore/api/call/CallListener;",
        "calls",
        "userIdList",
        "",
        "",
        "mediaType",
        "Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;",
        "params",
        "Lio/trtc/tuikit/atomicxcore/api/call/CallParams;",
        "deleteRecentCalls",
        "callIdList",
        "hangup",
        "invite",
        "participantIds",
        "join",
        "callId",
        "queryRecentCalls",
        "cursor",
        "count",
        "",
        "reject",
        "removeListener",
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
.field public static final Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final shared:Lio/trtc/tuikit/atomicxcore/api/call/CallStore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    .line 9
    .line 10
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->l:Lkotlin/Lazy;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;

    .line 17
    .line 18
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->shared:Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 19
    return-void
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

.method public static final synthetic access$getShared$cp()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->shared:Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 3
    return-object v0
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
.end method

.method public static final getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

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
.method public abstract accept(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract addListener(Lio/trtc/tuikit/atomicxcore/api/call/CallListener;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/call/CallListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract calls(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;Lio/trtc/tuikit/atomicxcore/api/call/CallParams;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/trtc/tuikit/atomicxcore/api/call/CallParams;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;",
            "Lio/trtc/tuikit/atomicxcore/api/call/CallParams;",
            "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;",
            ")V"
        }
    .end annotation
.end method

.method public abstract deleteRecentCalls(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract hangup(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract invite(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/call/CallParams;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/call/CallParams;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/trtc/tuikit/atomicxcore/api/call/CallParams;",
            "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;",
            ")V"
        }
    .end annotation
.end method

.method public abstract join(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract queryRecentCalls(Ljava/lang/String;ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract reject(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract removeListener(Lio/trtc/tuikit/atomicxcore/api/call/CallListener;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/call/CallListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
