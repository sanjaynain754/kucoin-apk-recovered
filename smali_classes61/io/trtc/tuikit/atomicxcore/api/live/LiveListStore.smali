.class public abstract Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008&\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0012\u0010\u0010\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0011H&J\u001a\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J$\u0010\u0015\u001a\u00020\u00082\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0019H&J\u001c\u0010\u001a\u001a\u00020\u00082\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0012\u0010\u001b\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0019H&J \u0010\u001c\u001a\u00020\u00082\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001e2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u001fH&J\u0010\u0010 \u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH&J\u0008\u0010!\u001a\u00020\u0008H&J(\u0010\"\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\r2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020$0\u001e2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0019H&J6\u0010%\u001a\u00020\u00082\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\'j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`(2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0019H&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006*"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;",
        "",
        "()V",
        "liveState",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;",
        "getLiveState",
        "()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;",
        "addLiveListListener",
        "",
        "listener",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;",
        "createLive",
        "liveInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;",
        "completion",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;",
        "endLive",
        "Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;",
        "fetchLiveInfo",
        "liveID",
        "",
        "fetchLiveList",
        "cursor",
        "count",
        "",
        "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;",
        "joinLive",
        "leaveLive",
        "queryMetaData",
        "keys",
        "",
        "Lio/trtc/tuikit/atomicxcore/api/live/MetaDataCompletionHandler;",
        "removeLiveListListener",
        "reset",
        "updateLiveInfo",
        "modifyFlagList",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo$ModifyFlag;",
        "updateLiveMetaData",
        "metaData",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
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
.field public static final Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 9
    return-void
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

.method public static final shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

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
.method public abstract addLiveListListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract createLive(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract endLive(Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract fetchLiveInfo(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract fetchLiveList(Ljava/lang/String;ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract joinLive(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract leaveLive(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract queryMetaData(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/live/MetaDataCompletionHandler;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/MetaDataCompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/trtc/tuikit/atomicxcore/api/live/MetaDataCompletionHandler;",
            ")V"
        }
    .end annotation
.end method

.method public abstract removeLiveListListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract reset()V
.end method

.method public abstract updateLiveInfo(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;",
            "Ljava/util/List<",
            "+",
            "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo$ModifyFlag;",
            ">;",
            "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;",
            ")V"
        }
    .end annotation
.end method

.method public abstract updateLiveMetaData(Ljava/util/HashMap;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Ljava/util/HashMap;
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
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;",
            ")V"
        }
    .end annotation
.end method
