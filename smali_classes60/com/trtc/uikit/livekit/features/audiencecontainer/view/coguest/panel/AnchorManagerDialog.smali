.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;
.super Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;
.source "AnchorManagerDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0008\u0004*\u0003EHK\u0018\u0000 M2\u00020\u0001:\u0001MB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tJ\u0008\u0010#\u001a\u00020!H\u0016J\u0008\u0010$\u001a\u00020!H\u0016J\u0008\u0010%\u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020\u0014H\u0002J\u0008\u0010(\u001a\u00020!H\u0002J\u0008\u0010)\u001a\u00020!H\u0002J\u0008\u0010*\u001a\u00020!H\u0002J\u0008\u0010+\u001a\u00020!H\u0002J\u0008\u0010,\u001a\u00020-H\u0002J\u0008\u0010.\u001a\u00020-H\u0002J\u0008\u0010/\u001a\u00020!H\u0002J\u0008\u00100\u001a\u00020!H\u0002J\u0010\u00101\u001a\u00020!2\u0006\u0010\'\u001a\u00020\u0014H\u0002J\u0016\u00102\u001a\u00020!2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020504H\u0002J\u0008\u00106\u001a\u00020!H\u0002J\u0008\u00107\u001a\u00020!H\u0002J\u0008\u00108\u001a\u00020!H\u0002J\u0008\u00109\u001a\u00020!H\u0002J\u0008\u0010:\u001a\u00020!H\u0002J\u0008\u0010;\u001a\u00020!H\u0002J\u0010\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020-H\u0002J\u0010\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020-H\u0002J\u0016\u0010@\u001a\u00020!2\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00020C0BH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u00020EX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010FR\u0010\u0010G\u001a\u00020HX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010IR\u0010\u0010J\u001a\u00020KX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010L\u00a8\u0006N"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;",
        "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;",
        "context",
        "Landroid/content/Context;",
        "audienceStore",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;",
        "<init>",
        "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;)V",
        "seatUserInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
        "confirmDialog",
        "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;",
        "subscribeStateJob",
        "Lkotlinx/coroutines/Job;",
        "imageHeadView",
        "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;",
        "userIdText",
        "Landroid/widget/TextView;",
        "userNameText",
        "flipCameraContainer",
        "Landroid/view/View;",
        "followContainer",
        "handUpContainer",
        "audioContainer",
        "videoContainer",
        "ivAudio",
        "Landroid/widget/ImageView;",
        "tvAudio",
        "ivVideo",
        "tvVideo",
        "textUnfollow",
        "imageFollowIcon",
        "init",
        "",
        "seatInfo",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "initView",
        "bindViewId",
        "rootView",
        "updateView",
        "updateMediaDeviceButton",
        "updateAdminDeviceButton",
        "updateGeneralUserDeviceButton",
        "isSelfUser",
        "",
        "isAdmin",
        "addObserver",
        "removeObserver",
        "initFollowButtonView",
        "onFollowingUserChanged",
        "followUsers",
        "",
        "",
        "onHangupButtonClicked",
        "onMicrophoneButtonClicked",
        "onCameraButtonClicked",
        "onSwitchCameraButtonClicked",
        "unMuteMicrophone",
        "startCamera",
        "updateMicrophoneButton",
        "isAudioLocked",
        "updateCameraButton",
        "isVideoLocked",
        "onConnectUserListChanged",
        "connectedUserList",
        "",
        "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;",
        "liveLisListener",
        "com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$liveLisListener$1",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$liveLisListener$1;",
        "liveAudienceListener",
        "com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$liveAudienceListener$1",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$liveAudienceListener$1;",
        "coGuestListener",
        "com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$coGuestListener$1",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$coGuestListener$1;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnchorManagerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n1#2:518\n*E\n"
    }
.end annotation


# static fields
.field public static final H:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final I:Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public A:Landroid/widget/ImageView;

.field public B:Landroid/widget/TextView;

.field public C:Landroid/widget/TextView;

.field public D:Landroid/widget/ImageView;

.field public final E:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final F:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final G:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lee0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public o:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public p:Lkotlinx/coroutines/x1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public q:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/view/View;

.field public u:Landroid/view/View;

.field public v:Landroid/view/View;

.field public w:Landroid/view/View;

.field public x:Landroid/view/View;

.field public y:Landroid/widget/ImageView;

.field public z:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->H:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$Companion;

    .line 9
    .line 10
    sget-object v0, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->c:Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;

    .line 11
    .line 12
    const-string v1, "AnchorManagerDialog"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;->getLiveStreamLogger(Ljava/lang/String;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->I:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

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

.method public constructor <init>(Landroid/content/Context;Lee0/f;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lee0/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "audienceStore"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x2

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1, v0, v1, v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;-><init>(Landroid/content/Context;Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    .line 17
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->g0()V

    .line 21
    .line 22
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$c;

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$c;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 26
    .line 27
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->E:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$c;

    .line 28
    .line 29
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$b;

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$b;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 33
    .line 34
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->F:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$b;

    .line 35
    .line 36
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$a;

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$a;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 40
    .line 41
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->G:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$a;

    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic C(ILjava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->z0(ILjava/lang/String;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic D(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/app/Dialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->s0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/app/Dialog;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private final D0()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->h0()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->A0()V

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->C0()V

    .line 14
    return-void
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

.method public static synthetic E(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/app/Dialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->o0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/app/Dialog;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic F(Lvc0/c;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->y0(Lvc0/c;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method private final F0()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    :goto_0
    return-void

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->q:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 31
    const/4 v2, 0x0

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    const-string v1, "imageHeadView"

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 39
    move-object v1, v2

    .line 40
    .line 41
    :cond_2
    new-instance v3, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;

    .line 42
    .line 43
    sget v4, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_avatar:I

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v0, v4}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v3}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;->setContent(Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b;)V

    .line 50
    .line 51
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->s:Landroid/widget/TextView;

    .line 52
    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    const-string v0, "userNameText"

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 59
    move-object v0, v2

    .line 60
    .line 61
    :cond_3
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 62
    .line 63
    .line 64
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserName()Ljava/lang/String;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->r:Landroid/widget/TextView;

    .line 74
    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    const-string v0, "userIdText"

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    move-object v2, v0

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    sget v1, Lcom/trtc/uikit/livekit/R$string;->common_user_id:I

    .line 89
    .line 90
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 97
    move-result-object v3

    .line 98
    .line 99
    .line 100
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 101
    move-result-object v3

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->D0()V

    .line 112
    return-void
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public static synthetic G(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->Z(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic H(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->r0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic I(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic J(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->f0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic K(Lvc0/c;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->p0(Lvc0/c;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic L(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->c0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic M(ILjava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->q0(ILjava/lang/String;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic N(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->b0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic O(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->a0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic P(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)Lee0/f;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic Q(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic R()Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->I:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

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

.method public static final synthetic S(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic T(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->k0(Ljava/util/List;)V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic U(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Ljava/util/Set;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->l0(Ljava/util/Set;)V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic V(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->B0(Z)V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic W(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->E0(Z)V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private final X()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v4, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v4, p0, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Lkotlin/coroutines/Continuation;)V

    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->p:Lkotlinx/coroutines/x1;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lee0/f;->p()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->E:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$c;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->addLiveListListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;)V

    .line 36
    .line 37
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lee0/f;->i()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->G:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$a;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->addGuestListener(Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;)V

    .line 47
    .line 48
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lee0/f;->n()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->F:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$b;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->addLiveAudienceListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;)V

    .line 58
    return-void
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method private final Y(Landroid/view/View;)V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/trtc/uikit/livekit/R$id;->user_id:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "findViewById(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast v0, Landroid/widget/TextView;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->r:Landroid/widget/TextView;

    .line 16
    .line 17
    sget v0, Lcom/trtc/uikit/livekit/R$id;->user_name:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    check-cast v0, Landroid/widget/TextView;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->s:Landroid/widget/TextView;

    .line 29
    .line 30
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_head:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    check-cast v0, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->q:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 42
    .line 43
    sget v0, Lcom/trtc/uikit/livekit/R$id;->hand_up_container:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->v:Landroid/view/View;

    .line 53
    .line 54
    sget v0, Lcom/trtc/uikit/livekit/R$id;->flip_camera_container:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->t:Landroid/view/View;

    .line 64
    .line 65
    sget v0, Lcom/trtc/uikit/livekit/R$id;->fl_follow_panel:I

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->u:Landroid/view/View;

    .line 75
    .line 76
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_audio:I

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    check-cast v0, Landroid/widget/ImageView;

    .line 86
    .line 87
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->y:Landroid/widget/ImageView;

    .line 88
    .line 89
    sget v0, Lcom/trtc/uikit/livekit/R$id;->audio_container:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->w:Landroid/view/View;

    .line 99
    .line 100
    sget v0, Lcom/trtc/uikit/livekit/R$id;->tv_audio:I

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    check-cast v0, Landroid/widget/TextView;

    .line 110
    .line 111
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->z:Landroid/widget/TextView;

    .line 112
    .line 113
    sget v0, Lcom/trtc/uikit/livekit/R$id;->video_container:I

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    .line 120
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->x:Landroid/view/View;

    .line 123
    .line 124
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_video:I

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    .line 131
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    check-cast v0, Landroid/widget/ImageView;

    .line 134
    .line 135
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->A:Landroid/widget/ImageView;

    .line 136
    .line 137
    sget v0, Lcom/trtc/uikit/livekit/R$id;->tv_video:I

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    .line 144
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    check-cast v0, Landroid/widget/TextView;

    .line 147
    .line 148
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->B:Landroid/widget/TextView;

    .line 149
    .line 150
    sget v0, Lcom/trtc/uikit/livekit/R$id;->tv_unfollow:I

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 154
    move-result-object v0

    .line 155
    .line 156
    .line 157
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    check-cast v0, Landroid/widget/TextView;

    .line 160
    .line 161
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->C:Landroid/widget/TextView;

    .line 162
    .line 163
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_follow:I

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 167
    move-result-object p1

    .line 168
    .line 169
    .line 170
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    check-cast p1, Landroid/widget/ImageView;

    .line 173
    .line 174
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->D:Landroid/widget/ImageView;

    .line 175
    .line 176
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->v:Landroid/view/View;

    .line 177
    const/4 v0, 0x0

    .line 178
    .line 179
    if-nez p1, :cond_0

    .line 180
    .line 181
    const-string p1, "handUpContainer"

    .line 182
    .line 183
    .line 184
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 185
    move-object p1, v0

    .line 186
    .line 187
    :cond_0
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/a;

    .line 188
    .line 189
    .line 190
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/a;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    .line 195
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->t:Landroid/view/View;

    .line 196
    .line 197
    if-nez p1, :cond_1

    .line 198
    .line 199
    const-string p1, "flipCameraContainer"

    .line 200
    .line 201
    .line 202
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 203
    move-object p1, v0

    .line 204
    .line 205
    :cond_1
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/e;

    .line 206
    .line 207
    .line 208
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/e;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    .line 213
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->w:Landroid/view/View;

    .line 214
    .line 215
    if-nez p1, :cond_2

    .line 216
    .line 217
    const-string p1, "audioContainer"

    .line 218
    .line 219
    .line 220
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 221
    move-object p1, v0

    .line 222
    .line 223
    :cond_2
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/f;

    .line 224
    .line 225
    .line 226
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/f;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 230
    .line 231
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->x:Landroid/view/View;

    .line 232
    .line 233
    if-nez p1, :cond_3

    .line 234
    .line 235
    const-string p1, "videoContainer"

    .line 236
    .line 237
    .line 238
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 239
    goto :goto_0

    .line 240
    :cond_3
    move-object v0, p1

    .line 241
    .line 242
    :goto_0
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/g;

    .line 243
    .line 244
    .line 245
    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/g;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    return-void
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
.end method

.method public static final Z(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m0()V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final a0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->u0()V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final b0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->t0()V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final c0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->j0()V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private final e0(Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/trtc/uikit/livekit/R$id;->fl_follow_panel:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/h;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/h;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    return-void
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
.end method

.method public static final f0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lee0/f;->l()Lee0/g;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lee0/g;->a()Lkotlinx/coroutines/flow/w;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    check-cast p1, Ljava/util/Set;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    move-result p1

    .line 35
    const/4 v0, 0x1

    .line 36
    .line 37
    if-ne p1, v0, :cond_1

    .line 38
    .line 39
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lee0/f;->m()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 52
    move-result-object p0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore;->j(Ljava/lang/String;)V

    .line 56
    return-void

    .line 57
    .line 58
    :cond_1
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lee0/f;->m()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 65
    .line 66
    .line 67
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 71
    move-result-object p0

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore;->f(Ljava/lang/String;)V

    .line 75
    return-void
    .line 76
    .line 77
    .line 78
.end method

.method private final g0()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget v1, Lcom/trtc/uikit/livekit/R$layout;->livekit_anchor_manager_panel:I

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->q(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->Y(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->e0(Landroid/view/View;)V

    .line 24
    return-void
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

.method private final h0()Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    const/4 v0, 0x0

    .line 32
    return v0

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lee0/f;->o()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    move-result v0

    .line 61
    return v0
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method private final i0()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    return v1

    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 51
    move-result-object v1

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v1, 0x0

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    move-result v0

    .line 58
    return v0
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public static final n0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;)Lkotlin/Unit;
    .locals 8

    .line 1
    .line 2
    const-string v1, "$this$init"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    sget v2, Lcom/trtc/uikit/livekit/R$string;->common_disconnect_tips:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-string v7, "getString(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;->o(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    sget v2, Lcom/trtc/uikit/livekit/R$string;->common_disconnection:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    sget-object v2, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;->RED:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;

    .line 39
    .line 40
    new-instance v4, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/b;

    .line 41
    .line 42
    .line 43
    invoke-direct {v4, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/b;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 44
    const/4 v5, 0x4

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    move-object v0, p1

    .line 48
    .line 49
    .line 50
    invoke-static/range {v0 .. v6}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/f;->g(Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    sget v1, Lcom/trtc/uikit/livekit/R$string;->common_cancel:I

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    sget-object v2, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;->PRIMARY:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;

    .line 66
    .line 67
    const/16 v5, 0xc

    .line 68
    const/4 v4, 0x0

    .line 69
    move-object v0, p1

    .line 70
    .line 71
    .line 72
    invoke-static/range {v0 .. v6}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/f;->e(Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 73
    .line 74
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 75
    return-object v0
    .line 76
    .line 77
    .line 78
.end method

.method public static final o0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/app/Dialog;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lee0/f;->r()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/c;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/c;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lvc0/d;->a(Lkotlin/jvm/functions/Function1;)Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->kickUserOutOfSeat(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    return-object p0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final p0(Lvc0/c;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "$this$completionHandler"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/d;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/d;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lvc0/c;->h(Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p0
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
.end method

.method public static final q0(ILjava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "<unused var>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p1, Lcom/trtc/uikit/livekit/common/ErrorLocalized;->a:Lcom/trtc/uikit/livekit/common/ErrorLocalized$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lcom/trtc/uikit/livekit/common/ErrorLocalized$Companion;->onError(I)V

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final r0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;)Lkotlin/Unit;
    .locals 8

    .line 1
    .line 2
    const-string v1, "$this$init"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    sget v2, Lcom/trtc/uikit/livekit/R$string;->common_terminate_room_connection_message:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-string v7, "getString(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;->o(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    sget v2, Lcom/trtc/uikit/livekit/R$string;->common_disconnection:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    sget-object v2, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;->RED:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;

    .line 39
    .line 40
    new-instance v4, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/l;

    .line 41
    .line 42
    .line 43
    invoke-direct {v4, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/l;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 44
    const/4 v5, 0x4

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    move-object v0, p1

    .line 48
    .line 49
    .line 50
    invoke-static/range {v0 .. v6}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/f;->g(Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    sget v1, Lcom/trtc/uikit/livekit/R$string;->common_cancel:I

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    sget-object v2, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;->PRIMARY:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;

    .line 66
    .line 67
    const/16 v5, 0xc

    .line 68
    const/4 v4, 0x0

    .line 69
    move-object v0, p1

    .line 70
    .line 71
    .line 72
    invoke-static/range {v0 .. v6}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/f;->e(Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 73
    .line 74
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 75
    return-object v0
    .line 76
    .line 77
    .line 78
.end method

.method public static final s0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Landroid/app/Dialog;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lee0/f;->i()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->disconnect(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 16
    .line 17
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lee0/f;->v()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;

    .line 21
    move-result-object p1

    .line 22
    const/4 v0, 0x0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;->g(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    return-object p0
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
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private final v0()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->p:Lkotlinx/coroutines/x1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lee0/f;->p()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->E:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$c;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->removeLiveListListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;)V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lee0/f;->i()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->G:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->removeGuestListener(Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lee0/f;->n()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->F:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$b;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->removeLiveAudienceListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;)V

    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method private final w0()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lee0/f;->k()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->isFrontCamera()Lkotlinx/coroutines/flow/w;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    sget-object v1, Lvc0/f;->a:Lvc0/f;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/trtc/tuikit/common/system/ContextProvider;->b()Landroid/content/Context;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    const-string v3, "getApplicationContext(...)"

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    new-instance v3, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$d;

    .line 38
    .line 39
    .line 40
    invoke-direct {v3, p0, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$d;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2, v3}, Lvc0/f;->a(Landroid/content/Context;Lcom/trtc/tuikit/common/permission/d;)V

    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public static final y0(Lvc0/c;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "$this$completionHandler"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/m;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/m;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lvc0/c;->h(Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p0
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
.end method

.method public static final z0(ILjava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "<unused var>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p1, Lcom/trtc/uikit/livekit/common/ErrorLocalized;->a:Lcom/trtc/uikit/livekit/common/ErrorLocalized$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lcom/trtc/uikit/livekit/common/ErrorLocalized$Companion;->onError(I)V

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method


# virtual methods
.method public final A0()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->i0()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "followContainer"

    .line 7
    .line 8
    const-string v2, "handUpContainer"

    .line 9
    .line 10
    const-string v3, "flipCameraContainer"

    .line 11
    .line 12
    const/16 v4, 0x8

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->t:Landroid/view/View;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 24
    move-object v0, v6

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->v:Landroid/view/View;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 35
    move-object v0, v6

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->u:Landroid/view/View;

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-object v6, v0

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-virtual {v6, v4}, Landroid/view/View;->setVisibility(I)V

    .line 51
    return-void

    .line 52
    .line 53
    :cond_3
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->t:Landroid/view/View;

    .line 54
    .line 55
    if-nez v0, :cond_4

    .line 56
    .line 57
    .line 58
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 59
    move-object v0, v6

    .line 60
    .line 61
    .line 62
    :cond_4
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->v:Landroid/view/View;

    .line 65
    .line 66
    if-nez v0, :cond_5

    .line 67
    .line 68
    .line 69
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 70
    move-object v0, v6

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->u:Landroid/view/View;

    .line 76
    .line 77
    if-nez v0, :cond_6

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 81
    goto :goto_1

    .line 82
    :cond_6
    move-object v6, v0

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 86
    return-void
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final B0(Z)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->i0()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    const-string v2, "videoContainer"

    .line 9
    .line 10
    const-string v3, "tvVideo"

    .line 11
    const/4 v4, 0x1

    .line 12
    .line 13
    const-string v5, "ivVideo"

    .line 14
    const/4 v6, 0x0

    .line 15
    .line 16
    if-nez v0, :cond_7

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->h0()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_6

    .line 23
    .line 24
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->x:Landroid/view/View;

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 30
    move-object v0, v6

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->A:Landroid/widget/ImageView;

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    move-object v0, v6

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 45
    .line 46
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->A:Landroid/widget/ImageView;

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 52
    move-object v0, v6

    .line 53
    .line 54
    :cond_2
    if-ne p1, v4, :cond_3

    .line 55
    .line 56
    sget v1, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_disable_video:I

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_3
    sget v1, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_start_video:I

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 63
    .line 64
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->B:Landroid/widget/TextView;

    .line 65
    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    .line 69
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    move-object v6, v0

    .line 72
    .line 73
    :goto_1
    if-ne p1, v4, :cond_5

    .line 74
    .line 75
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_enable_video:I

    .line 76
    goto :goto_2

    .line 77
    .line 78
    :cond_5
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_disable_video:I

    .line 79
    .line 80
    .line 81
    :goto_2
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(I)V

    .line 82
    :cond_6
    return-void

    .line 83
    .line 84
    :cond_7
    const/16 v0, 0x8

    .line 85
    const/4 v7, 0x0

    .line 86
    .line 87
    const-string v8, "flipCameraContainer"

    .line 88
    .line 89
    if-ne p1, v4, :cond_d

    .line 90
    .line 91
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->x:Landroid/view/View;

    .line 92
    .line 93
    if-nez p1, :cond_8

    .line 94
    .line 95
    .line 96
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 97
    move-object p1, v6

    .line 98
    .line 99
    .line 100
    :cond_8
    invoke-virtual {p1, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 101
    .line 102
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->A:Landroid/widget/ImageView;

    .line 103
    .line 104
    if-nez p1, :cond_9

    .line 105
    .line 106
    .line 107
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 108
    move-object p1, v6

    .line 109
    .line 110
    .line 111
    :cond_9
    const v1, 0x3e75c28f    # 0.24f

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 115
    .line 116
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->A:Landroid/widget/ImageView;

    .line 117
    .line 118
    if-nez p1, :cond_a

    .line 119
    .line 120
    .line 121
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 122
    move-object p1, v6

    .line 123
    .line 124
    :cond_a
    sget v1, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_stop_video:I

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 128
    .line 129
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->B:Landroid/widget/TextView;

    .line 130
    .line 131
    if-nez p1, :cond_b

    .line 132
    .line 133
    .line 134
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 135
    move-object p1, v6

    .line 136
    .line 137
    :cond_b
    sget v1, Lcom/trtc/uikit/livekit/R$string;->common_start_video:I

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 141
    .line 142
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->t:Landroid/view/View;

    .line 143
    .line 144
    if-nez p1, :cond_c

    .line 145
    .line 146
    .line 147
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 148
    goto :goto_3

    .line 149
    :cond_c
    move-object v6, p1

    .line 150
    .line 151
    .line 152
    :goto_3
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 153
    return-void

    .line 154
    .line 155
    :cond_d
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->x:Landroid/view/View;

    .line 156
    .line 157
    if-nez p1, :cond_e

    .line 158
    .line 159
    .line 160
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 161
    move-object p1, v6

    .line 162
    .line 163
    .line 164
    :cond_e
    invoke-virtual {p1, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 165
    .line 166
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->A:Landroid/widget/ImageView;

    .line 167
    .line 168
    if-nez p1, :cond_f

    .line 169
    .line 170
    .line 171
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 172
    move-object p1, v6

    .line 173
    .line 174
    .line 175
    :cond_f
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 176
    .line 177
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Lee0/f;->q()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    .line 181
    move-result-object p1

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getSeatList()Lkotlinx/coroutines/flow/w;

    .line 185
    move-result-object p1

    .line 186
    .line 187
    .line 188
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 189
    move-result-object p1

    .line 190
    .line 191
    check-cast p1, Ljava/lang/Iterable;

    .line 192
    .line 193
    .line 194
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    move-result-object p1

    .line 196
    .line 197
    .line 198
    :cond_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    move-result v1

    .line 200
    .line 201
    if-eqz v1, :cond_12

    .line 202
    .line 203
    .line 204
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    move-result-object v1

    .line 206
    move-object v2, v1

    .line 207
    .line 208
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 212
    move-result-object v2

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 216
    move-result-object v2

    .line 217
    .line 218
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 222
    move-result-object v4

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 226
    move-result-object v4

    .line 227
    .line 228
    .line 229
    invoke-interface {v4}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 230
    move-result-object v4

    .line 231
    .line 232
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 233
    .line 234
    if-eqz v4, :cond_11

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 238
    move-result-object v4

    .line 239
    goto :goto_4

    .line 240
    :cond_11
    move-object v4, v6

    .line 241
    .line 242
    .line 243
    :goto_4
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    move-result v2

    .line 245
    .line 246
    if-eqz v2, :cond_10

    .line 247
    goto :goto_5

    .line 248
    :cond_12
    move-object v1, v6

    .line 249
    .line 250
    :goto_5
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 251
    .line 252
    if-eqz v1, :cond_13

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 256
    move-result-object p1

    .line 257
    .line 258
    if-eqz p1, :cond_13

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getCameraStatus()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 262
    move-result-object p1

    .line 263
    goto :goto_6

    .line 264
    :cond_13
    move-object p1, v6

    .line 265
    .line 266
    :goto_6
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 267
    .line 268
    if-ne p1, v1, :cond_17

    .line 269
    .line 270
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->A:Landroid/widget/ImageView;

    .line 271
    .line 272
    if-nez p1, :cond_14

    .line 273
    .line 274
    .line 275
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 276
    move-object p1, v6

    .line 277
    .line 278
    :cond_14
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_start_video:I

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 282
    .line 283
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->B:Landroid/widget/TextView;

    .line 284
    .line 285
    if-nez p1, :cond_15

    .line 286
    .line 287
    .line 288
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 289
    move-object p1, v6

    .line 290
    .line 291
    :cond_15
    sget v0, Lcom/trtc/uikit/livekit/R$string;->common_stop_video:I

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 295
    .line 296
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->t:Landroid/view/View;

    .line 297
    .line 298
    if-nez p1, :cond_16

    .line 299
    .line 300
    .line 301
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 302
    goto :goto_7

    .line 303
    :cond_16
    move-object v6, p1

    .line 304
    .line 305
    .line 306
    :goto_7
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 307
    return-void

    .line 308
    .line 309
    :cond_17
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->A:Landroid/widget/ImageView;

    .line 310
    .line 311
    if-nez p1, :cond_18

    .line 312
    .line 313
    .line 314
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 315
    move-object p1, v6

    .line 316
    .line 317
    :cond_18
    sget v1, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_stop_video:I

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 321
    .line 322
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->B:Landroid/widget/TextView;

    .line 323
    .line 324
    if-nez p1, :cond_19

    .line 325
    .line 326
    .line 327
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 328
    move-object p1, v6

    .line 329
    .line 330
    :cond_19
    sget v1, Lcom/trtc/uikit/livekit/R$string;->common_start_video:I

    .line 331
    .line 332
    .line 333
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 334
    .line 335
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->t:Landroid/view/View;

    .line 336
    .line 337
    if-nez p1, :cond_1a

    .line 338
    .line 339
    .line 340
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 341
    goto :goto_8

    .line 342
    :cond_1a
    move-object v6, p1

    .line 343
    .line 344
    .line 345
    :goto_8
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 346
    return-void
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
.end method

.method public final C0()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->i0()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_b

    .line 7
    .line 8
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->t:Landroid/view/View;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "flipCameraContainer"

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 17
    move-object v0, v1

    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->v:Landroid/view/View;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, "handUpContainer"

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 31
    move-object v0, v1

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->u:Landroid/view/View;

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    const-string v0, "followContainer"

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 44
    move-object v0, v1

    .line 45
    .line 46
    :cond_2
    const/16 v3, 0x8

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lee0/f;->q()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getSeatList()Lkotlinx/coroutines/flow/w;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    check-cast v0, Ljava/lang/Iterable;

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    move-result v3

    .line 74
    .line 75
    if-eqz v3, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    move-result-object v3

    .line 80
    move-object v4, v3

    .line 81
    .line 82
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 86
    move-result-object v4

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    iget-object v5, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 93
    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 98
    move-result-object v5

    .line 99
    goto :goto_0

    .line 100
    :cond_4
    move-object v5, v1

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    move-result v4

    .line 105
    .line 106
    if-eqz v4, :cond_3

    .line 107
    goto :goto_1

    .line 108
    :cond_5
    move-object v3, v1

    .line 109
    .line 110
    :goto_1
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 111
    const/4 v0, 0x1

    .line 112
    .line 113
    if-eqz v3, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 117
    move-result-object v3

    .line 118
    .line 119
    if-eqz v3, :cond_6

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAllowOpenCamera()Z

    .line 123
    move-result v3

    .line 124
    .line 125
    if-nez v3, :cond_6

    .line 126
    move v3, v0

    .line 127
    goto :goto_2

    .line 128
    :cond_6
    move v3, v2

    .line 129
    .line 130
    .line 131
    :goto_2
    invoke-virtual {p0, v3}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->B0(Z)V

    .line 132
    .line 133
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3}, Lee0/f;->q()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    .line 137
    move-result-object v3

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getSeatList()Lkotlinx/coroutines/flow/w;

    .line 141
    move-result-object v3

    .line 142
    .line 143
    .line 144
    invoke-interface {v3}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 145
    move-result-object v3

    .line 146
    .line 147
    check-cast v3, Ljava/lang/Iterable;

    .line 148
    .line 149
    .line 150
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 151
    move-result-object v3

    .line 152
    .line 153
    .line 154
    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    move-result v4

    .line 156
    .line 157
    if-eqz v4, :cond_9

    .line 158
    .line 159
    .line 160
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    move-result-object v4

    .line 162
    move-object v5, v4

    .line 163
    .line 164
    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 168
    move-result-object v5

    .line 169
    .line 170
    .line 171
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 172
    move-result-object v5

    .line 173
    .line 174
    iget-object v6, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 175
    .line 176
    if-eqz v6, :cond_8

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 180
    move-result-object v6

    .line 181
    goto :goto_3

    .line 182
    :cond_8
    move-object v6, v1

    .line 183
    .line 184
    .line 185
    :goto_3
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    move-result v5

    .line 187
    .line 188
    if-eqz v5, :cond_7

    .line 189
    move-object v1, v4

    .line 190
    .line 191
    :cond_9
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 192
    .line 193
    if-eqz v1, :cond_a

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 197
    move-result-object v1

    .line 198
    .line 199
    if-eqz v1, :cond_a

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAllowOpenMicrophone()Z

    .line 203
    move-result v1

    .line 204
    .line 205
    if-nez v1, :cond_a

    .line 206
    move v2, v0

    .line 207
    .line 208
    .line 209
    :cond_a
    invoke-virtual {p0, v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->E0(Z)V

    .line 210
    :cond_b
    return-void
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final E0(Z)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->i0()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    const-string v2, "audioContainer"

    .line 9
    .line 10
    const-string v3, "tvAudio"

    .line 11
    const/4 v4, 0x1

    .line 12
    .line 13
    const-string v5, "ivAudio"

    .line 14
    const/4 v6, 0x0

    .line 15
    .line 16
    if-nez v0, :cond_7

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->h0()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_6

    .line 23
    .line 24
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->w:Landroid/view/View;

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 30
    move-object v0, v6

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->y:Landroid/widget/ImageView;

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    move-object v0, v6

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 45
    .line 46
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->y:Landroid/widget/ImageView;

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 52
    move-object v0, v6

    .line 53
    .line 54
    :cond_2
    if-ne p1, v4, :cond_3

    .line 55
    .line 56
    sget v1, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_disable_audio:I

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_3
    sget v1, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_unmute_audio:I

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 63
    .line 64
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->z:Landroid/widget/TextView;

    .line 65
    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    .line 69
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    move-object v6, v0

    .line 72
    .line 73
    :goto_1
    if-ne p1, v4, :cond_5

    .line 74
    .line 75
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_enable_audio:I

    .line 76
    goto :goto_2

    .line 77
    .line 78
    :cond_5
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_disable_audio:I

    .line 79
    .line 80
    .line 81
    :goto_2
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(I)V

    .line 82
    :cond_6
    return-void

    .line 83
    .line 84
    :cond_7
    if-ne p1, v4, :cond_c

    .line 85
    .line 86
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->w:Landroid/view/View;

    .line 87
    .line 88
    if-nez p1, :cond_8

    .line 89
    .line 90
    .line 91
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 92
    move-object p1, v6

    .line 93
    :cond_8
    const/4 v0, 0x0

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 97
    .line 98
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->y:Landroid/widget/ImageView;

    .line 99
    .line 100
    if-nez p1, :cond_9

    .line 101
    .line 102
    .line 103
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 104
    move-object p1, v6

    .line 105
    .line 106
    .line 107
    :cond_9
    const v0, 0x3e75c28f    # 0.24f

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 111
    .line 112
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->y:Landroid/widget/ImageView;

    .line 113
    .line 114
    if-nez p1, :cond_a

    .line 115
    .line 116
    .line 117
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 118
    move-object p1, v6

    .line 119
    .line 120
    :cond_a
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_mute_audio:I

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 124
    .line 125
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->z:Landroid/widget/TextView;

    .line 126
    .line 127
    if-nez p1, :cond_b

    .line 128
    .line 129
    .line 130
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 131
    goto :goto_3

    .line 132
    :cond_b
    move-object v6, p1

    .line 133
    .line 134
    :goto_3
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_unmute_audio:I

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(I)V

    .line 138
    return-void

    .line 139
    .line 140
    :cond_c
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->w:Landroid/view/View;

    .line 141
    .line 142
    if-nez p1, :cond_d

    .line 143
    .line 144
    .line 145
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 146
    move-object p1, v6

    .line 147
    .line 148
    .line 149
    :cond_d
    invoke-virtual {p1, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 150
    .line 151
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->y:Landroid/widget/ImageView;

    .line 152
    .line 153
    if-nez p1, :cond_e

    .line 154
    .line 155
    .line 156
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 157
    move-object p1, v6

    .line 158
    .line 159
    .line 160
    :cond_e
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 161
    .line 162
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Lee0/f;->q()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    .line 166
    move-result-object p1

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getSeatList()Lkotlinx/coroutines/flow/w;

    .line 170
    move-result-object p1

    .line 171
    .line 172
    .line 173
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 174
    move-result-object p1

    .line 175
    .line 176
    check-cast p1, Ljava/lang/Iterable;

    .line 177
    .line 178
    .line 179
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    .line 183
    :cond_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    move-result v0

    .line 185
    .line 186
    if-eqz v0, :cond_11

    .line 187
    .line 188
    .line 189
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    move-result-object v0

    .line 191
    move-object v1, v0

    .line 192
    .line 193
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 197
    move-result-object v1

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 201
    move-result-object v1

    .line 202
    .line 203
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 207
    move-result-object v2

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 211
    move-result-object v2

    .line 212
    .line 213
    .line 214
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 215
    move-result-object v2

    .line 216
    .line 217
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 218
    .line 219
    if-eqz v2, :cond_10

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 223
    move-result-object v2

    .line 224
    goto :goto_4

    .line 225
    :cond_10
    move-object v2, v6

    .line 226
    .line 227
    .line 228
    :goto_4
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    move-result v1

    .line 230
    .line 231
    if-eqz v1, :cond_f

    .line 232
    goto :goto_5

    .line 233
    :cond_11
    move-object v0, v6

    .line 234
    .line 235
    :goto_5
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 236
    .line 237
    if-eqz v0, :cond_12

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 241
    move-result-object p1

    .line 242
    .line 243
    if-eqz p1, :cond_12

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getMicrophoneStatus()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 247
    move-result-object p1

    .line 248
    goto :goto_6

    .line 249
    :cond_12
    move-object p1, v6

    .line 250
    .line 251
    :goto_6
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 252
    .line 253
    if-ne p1, v0, :cond_15

    .line 254
    .line 255
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->y:Landroid/widget/ImageView;

    .line 256
    .line 257
    if-nez p1, :cond_13

    .line 258
    .line 259
    .line 260
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 261
    move-object p1, v6

    .line 262
    .line 263
    :cond_13
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_mute_audio:I

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 267
    .line 268
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->z:Landroid/widget/TextView;

    .line 269
    .line 270
    if-nez p1, :cond_14

    .line 271
    .line 272
    .line 273
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 274
    goto :goto_7

    .line 275
    :cond_14
    move-object v6, p1

    .line 276
    .line 277
    :goto_7
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_unmute_audio:I

    .line 278
    .line 279
    .line 280
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(I)V

    .line 281
    return-void

    .line 282
    .line 283
    :cond_15
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->y:Landroid/widget/ImageView;

    .line 284
    .line 285
    if-nez p1, :cond_16

    .line 286
    .line 287
    .line 288
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 289
    move-object p1, v6

    .line 290
    .line 291
    :cond_16
    sget v0, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_unmute_audio:I

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 295
    .line 296
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->z:Landroid/widget/TextView;

    .line 297
    .line 298
    if-nez p1, :cond_17

    .line 299
    .line 300
    .line 301
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 302
    goto :goto_8

    .line 303
    :cond_17
    move-object v6, p1

    .line 304
    .line 305
    :goto_8
    sget p1, Lcom/trtc/uikit/livekit/R$string;->common_mute_audio:I

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(I)V

    .line 309
    return-void
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
.end method

.method public final d0(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "seatInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->F0()V

    .line 11
    return-void
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
.end method

.method public final j0()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_6

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->i0()Z

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_7

    .line 14
    .line 15
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lee0/f;->q()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getSeatList()Lkotlinx/coroutines/flow/w;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Ljava/lang/Iterable;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    move-result v2

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    move-result-object v2

    .line 44
    move-object v3, v2

    .line 45
    .line 46
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 64
    move-result-object v4

    .line 65
    .line 66
    .line 67
    invoke-interface {v4}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 68
    move-result-object v4

    .line 69
    .line 70
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 76
    move-result-object v4

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move-object v4, v1

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result v3

    .line 83
    .line 84
    if-eqz v3, :cond_1

    .line 85
    goto :goto_1

    .line 86
    :cond_3
    move-object v2, v1

    .line 87
    .line 88
    :goto_1
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 89
    .line 90
    if-eqz v2, :cond_4

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getCameraStatus()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 100
    move-result-object v0

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    move-object v0, v1

    .line 103
    .line 104
    :goto_2
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 105
    .line 106
    if-ne v0, v2, :cond_6

    .line 107
    .line 108
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Lee0/f;->k()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->closeLocalCamera()V

    .line 116
    .line 117
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->t:Landroid/view/View;

    .line 118
    .line 119
    if-nez v0, :cond_5

    .line 120
    .line 121
    const-string v0, "flipCameraContainer"

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    move-object v1, v0

    .line 127
    .line 128
    :goto_3
    const/16 v0, 0x8

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 132
    goto :goto_4

    .line 133
    .line 134
    .line 135
    :cond_6
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->w0()V

    .line 136
    .line 137
    .line 138
    :goto_4
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 139
    return-void

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->h0()Z

    .line 143
    move-result v0

    .line 144
    .line 145
    if-eqz v0, :cond_9

    .line 146
    .line 147
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Lee0/f;->r()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 154
    .line 155
    if-eqz v2, :cond_8

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 159
    move-result-object v2

    .line 160
    goto :goto_5

    .line 161
    :cond_8
    move-object v2, v1

    .line 162
    .line 163
    .line 164
    :goto_5
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->closeRemoteCamera(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 168
    :cond_9
    :goto_6
    return-void
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final k0(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    move-result v0

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    return-void

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 59
    .line 60
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 61
    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->s()V

    .line 66
    :cond_4
    :goto_0
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final l0(Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    move-result p1

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    const-string v1, "imageFollowIcon"

    .line 20
    .line 21
    const/16 v2, 0x8

    .line 22
    .line 23
    const-string v3, "textUnfollow"

    .line 24
    const/4 v4, 0x0

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->C:Landroid/widget/TextView;

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 34
    move-object p1, v4

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->D:Landroid/widget/ImageView;

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v4, p1

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 50
    return-void

    .line 51
    .line 52
    :cond_3
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->D:Landroid/widget/ImageView;

    .line 53
    .line 54
    if-nez p1, :cond_4

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 58
    move-object p1, v4

    .line 59
    .line 60
    .line 61
    :cond_4
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 62
    .line 63
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->C:Landroid/widget/TextView;

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    .line 68
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 69
    goto :goto_1

    .line 70
    :cond_5
    move-object v4, p1

    .line 71
    .line 72
    .line 73
    :goto_1
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 74
    return-void
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final m0()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-string v2, "getContext(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    const/4 v2, 0x2

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v3, v2, v3}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;-><init>(Landroid/content/Context;Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    .line 27
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->h0()Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/j;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/j;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->u(Lkotlin/jvm/functions/Function1;)V

    .line 46
    .line 47
    :cond_2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->I()Landroid/app/Dialog;

    .line 54
    return-void

    .line 55
    .line 56
    .line 57
    :cond_3
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->i0()Z

    .line 58
    move-result v0

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/k;

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/k;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->u(Lkotlin/jvm/functions/Function1;)V

    .line 73
    .line 74
    :cond_4
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->I()Landroid/app/Dialog;

    .line 81
    :cond_5
    :goto_0
    return-void
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->X()V

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

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->v0()V

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

.method public final t0()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->i0()Z

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_6

    .line 14
    .line 15
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lee0/f;->q()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getSeatList()Lkotlinx/coroutines/flow/w;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Ljava/lang/Iterable;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    move-result v2

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    move-result-object v2

    .line 44
    move-object v3, v2

    .line 45
    .line 46
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 64
    move-result-object v4

    .line 65
    .line 66
    .line 67
    invoke-interface {v4}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 68
    move-result-object v4

    .line 69
    .line 70
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 76
    move-result-object v4

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move-object v4, v1

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result v3

    .line 83
    .line 84
    if-eqz v3, :cond_1

    .line 85
    goto :goto_1

    .line 86
    :cond_3
    move-object v2, v1

    .line 87
    .line 88
    :goto_1
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 89
    .line 90
    if-eqz v2, :cond_4

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getMicrophoneStatus()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 100
    move-result-object v1

    .line 101
    .line 102
    :cond_4
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 103
    .line 104
    if-ne v1, v0, :cond_5

    .line 105
    .line 106
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lee0/f;->r()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->muteMicrophone()V

    .line 114
    goto :goto_2

    .line 115
    .line 116
    .line 117
    :cond_5
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->x0()V

    .line 118
    .line 119
    .line 120
    :goto_2
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 121
    return-void

    .line 122
    .line 123
    .line 124
    :cond_6
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->h0()Z

    .line 125
    move-result v0

    .line 126
    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lee0/f;->r()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->n:Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 136
    .line 137
    if-eqz v2, :cond_7

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 141
    move-result-object v2

    .line 142
    goto :goto_3

    .line 143
    :cond_7
    move-object v2, v1

    .line 144
    .line 145
    .line 146
    :goto_3
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->closeRemoteMicrophone(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 150
    :cond_8
    :goto_4
    return-void
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final u0()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lee0/f;->k()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->isFrontCamera()Lkotlinx/coroutines/flow/w;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lee0/f;->k()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    xor-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->switchCamera(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 39
    return-void
    .line 40
    .line 41
    .line 42
.end method

.method public final x0()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->m:Lee0/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lee0/f;->r()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/i;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/i;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lvc0/d;->a(Lkotlin/jvm/functions/Function1;)Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->unmuteMicrophone(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

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
