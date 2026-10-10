.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource;
.super Ljava/lang/Object;
.source "TUILiveListDataSource.kt"

# interfaces
.implements Lde0/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource;",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListDataSource;",
        "<init>",
        "()V",
        "fetchLiveList",
        "",
        "param",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$FetchLiveListParam;",
        "callback",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListCallback;",
        "Companion",
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


# static fields
.field public static final a:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource$Companion;

    .line 9
    .line 10
    sget-object v0, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->c:Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;

    .line 11
    .line 12
    const-string v1, "AudienceDataSource"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;->getComponentLogger(Ljava/lang/String;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource;->b:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 19
    return-void
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
.end method


# virtual methods
.method public a(Lde0/b;Lde0/c;)V
    .locals 2
    .param p1    # Lde0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lde0/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "param"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "callback"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_0
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lde0/b;->a()Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource$a;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, p2, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource$a;-><init>(Lde0/c;Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;)V

    .line 55
    .line 56
    const/16 p2, 0x14

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1, p2, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->fetchLiveList(Ljava/lang/String;ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 60
    return-void

    .line 61
    .line 62
    :cond_1
    :goto_0
    sget-object p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/access/TUILiveListDataSource;->b:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 63
    .line 64
    const-string v0, "TUIRoomEngine login first"

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 68
    .line 69
    const/16 p1, -0x3ea

    .line 70
    .line 71
    const-string v0, "message"

    .line 72
    .line 73
    .line 74
    invoke-interface {p2, p1, v0}, Lde0/c;->onError(ILjava/lang/String;)V

    .line 75
    return-void
    .line 76
    .line 77
    .line 78
.end method
