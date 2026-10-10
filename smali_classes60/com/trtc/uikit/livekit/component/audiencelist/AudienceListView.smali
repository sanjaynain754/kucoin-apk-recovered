.class public final Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;
.super Lcom/trtc/uikit/livekit/common/ui/BasicView;
.source "AudienceListView.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004*\u0001\u001d\u0008\u0007\u0018\u00002\u00020\u0001:\u0001:B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020 2\u0008\u0010$\u001a\u0004\u0018\u00010\u0019J\u000e\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\'J\u0008\u0010(\u001a\u00020 H\u0014J\u0008\u0010)\u001a\u00020 H\u0014J\u0008\u0010*\u001a\u00020 H\u0014J\u0008\u0010+\u001a\u00020 H\u0002J\u0008\u0010,\u001a\u00020 H\u0002J\u0008\u0010-\u001a\u00020 H\u0003J\u0008\u0010.\u001a\u00020 H\u0002J\u0016\u0010/\u001a\u00020 2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020201H\u0002J\u0008\u00103\u001a\u00020 H\u0002J\u0010\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020\u0007H\u0003J\u0010\u00106\u001a\u0002072\u0006\u00105\u001a\u00020\u0007H\u0002J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u000207H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001e\u00a8\u0006;"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;",
        "Lcom/trtc/uikit/livekit/common/ui/BasicView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "textAudienceCount",
        "Landroid/widget/TextView;",
        "layoutAudienceCount",
        "Landroid/widget/LinearLayout;",
        "recycleAudienceList",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "adapter",
        "Lcom/trtc/uikit/livekit/component/audiencelist/view/adapter/AudienceListIconAdapter;",
        "liveListStore",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;",
        "audienceStore",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;",
        "audienceListPopupDialog",
        "Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;",
        "onUserItemClickListener",
        "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$OnUserItemClickListener;",
        "logger",
        "Lcom/trtc/uikit/livekit/common/LiveKitLogger;",
        "liveListListener",
        "com/trtc/uikit/livekit/component/audiencelist/AudienceListView$liveListListener$1",
        "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$liveListListener$1;",
        "init",
        "",
        "liveInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;",
        "setOnUserItemClickListener",
        "listener",
        "setScreenOrientation",
        "isPortrait",
        "",
        "initStore",
        "addObserver",
        "removeObserver",
        "initView",
        "initAudienceCountView",
        "initAudienceAvatarView",
        "showAudienceListPanelView",
        "onAudienceListChange",
        "userInfoList",
        "",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
        "updateAudienceCount",
        "setUserCount",
        "count",
        "formatUserCount",
        "",
        "reportData",
        "roomId",
        "OnUserItemClickListener",
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


# instance fields
.field public final d:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Landroid/widget/TextView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public f:Landroid/widget/LinearLayout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public g:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public h:Lxc0/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public i:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public j:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public k:Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public l:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final m:Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/common/ui/BasicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->d:Landroid/content/Context;

    .line 6
    sget-object p2, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->c:Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;

    const-string p3, "AudienceListView"

    invoke-virtual {p2, p3}, Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;->getComponentLogger(Ljava/lang/String;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    move-result-object p2

    iput-object p2, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->m:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 7
    new-instance p2, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$c;

    invoke-direct {p2, p0}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$c;-><init>(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;)V

    iput-object p2, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->n:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$c;

    .line 8
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/trtc/uikit/livekit/R$layout;->audience_list_layout_icon:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 9
    sget p1, Lcom/trtc/uikit/livekit/R$id;->ll_audience_count:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->f:Landroid/widget/LinearLayout;

    .line 10
    sget p1, Lcom/trtc/uikit/livekit/R$id;->tv_audience_count:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->e:Landroid/widget/TextView;

    .line 11
    sget p1, Lcom/trtc/uikit/livekit/R$id;->rv_audience_list:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->g:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic f(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->q(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;Landroid/view/View;)V

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

.method public static final synthetic g(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;)Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->k:Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;

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

.method public static final synthetic h(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;)Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->j:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

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

.method public static final synthetic i(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getRoomId()Ljava/lang/String;

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

.method public static final synthetic j(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->s(Ljava/util/List;)V

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

.method public static final synthetic k(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->u()V

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
.end method

.method public static final synthetic l(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->v()V

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
.end method

.method public static final q(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->u()V

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

.method private final setUserCount(I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->m(I)Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->e:Landroid/widget/TextView;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    return-void
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


# virtual methods
.method public a()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->i:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->n:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$c;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->addLiveListListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    new-instance v4, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$addObserver$1;

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct {v4, p0, v0}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$addObserver$1;-><init>(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;Lkotlin/coroutines/Continuation;)V

    .line 24
    const/4 v5, 0x3

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    .line 29
    .line 30
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->setSubscribeStateJob(Lkotlinx/coroutines/x1;)V

    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public c()V
    .locals 2

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
    .line 8
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->i:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 9
    .line 10
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getRoomId()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->j:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 21
    return-void
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

.method public d()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->i:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->n:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$c;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->removeLiveListListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getSubscribeStateJob()Lkotlinx/coroutines/x1;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    const/4 v1, 0x1

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 21
    :cond_1
    return-void
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

.method public final m(I)Ljava/lang/String;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const/16 v1, 0x2710

    .line 7
    .line 8
    if-lt p1, v1, :cond_2

    .line 9
    .line 10
    sget-object v0, Ljava/util/Locale;->CHINESE:Ljava/util/Locale;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    const-string v1, "format(...)"

    .line 29
    const/4 v2, 0x1

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 37
    move-result-object v0

    .line 38
    int-to-float p1, p1

    .line 39
    .line 40
    .line 41
    const v3, 0x461c4000    # 10000.0f

    .line 42
    div-float/2addr p1, v3

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    const-string v2, "%.1f"

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    .line 63
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    const/4 p1, 0x2

    .line 65
    const/4 v0, 0x0

    .line 66
    .line 67
    const-string v1, ".0"

    .line 68
    const/4 v2, 0x0

    .line 69
    .line 70
    .line 71
    invoke-static {v3, v1, v2, p1, v0}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 72
    move-result p1

    .line 73
    .line 74
    if-eqz p1, :cond_0

    .line 75
    const/4 v7, 0x4

    .line 76
    const/4 v8, 0x0

    .line 77
    .line 78
    const-string v4, ".0"

    .line 79
    .line 80
    const-string v5, ""

    .line 81
    const/4 v6, 0x0

    .line 82
    .line 83
    .line 84
    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 85
    move-result-object v3

    .line 86
    .line 87
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const/16 v0, 0x4e07

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    .line 105
    :cond_1
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 106
    .line 107
    .line 108
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    div-int/lit16 p1, p1, 0x3e8

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    .line 118
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    .line 122
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    const-string v2, "%dk"

    .line 126
    .line 127
    .line 128
    invoke-static {v0, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    return-object p1

    .line 134
    :cond_2
    return-object v0
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

.method public final n(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 1
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "liveInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-super {p0, v0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->r()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->t(Ljava/lang/String;)V

    .line 23
    return-void
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

.method public final o()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->d:Landroid/content/Context;

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v2, v3, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 14
    .line 15
    new-instance v0, Lxc0/a;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->d:Landroid/content/Context;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->j:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->getLiveAudienceState()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    :cond_0
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getRoomId()Ljava/lang/String;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->getLiveAudienceState()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-direct {v0, v1, v2}, Lxc0/a;-><init>(Landroid/content/Context;Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;)V

    .line 45
    .line 46
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->h:Lxc0/a;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 52
    .line 53
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 54
    .line 55
    new-instance v1, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$b;

    .line 56
    .line 57
    .line 58
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$b;-><init>(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 62
    return-void
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

.method public final p()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->f:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    new-instance v1, Lcom/trtc/uikit/livekit/component/audiencelist/a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/component/audiencelist/a;-><init>(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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
    .line 40
    .line 41
    .line 42
.end method

.method public final r()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->p()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->o()V

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

.method public final s(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    move-result p1

    .line 18
    const/4 v1, 0x2

    .line 19
    .line 20
    if-gt p1, v1, :cond_0

    .line 21
    const/4 p1, -0x2

    .line 22
    .line 23
    iput p1, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    const/high16 p1, 0x42600000    # 56.0f

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 30
    move-result p1

    .line 31
    .line 32
    iput p1, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 33
    .line 34
    :goto_0
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->h:Lxc0/a;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lxc0/a;->i()V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->v()V

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
.end method

.method public final setOnUserItemClickListener(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$a;)V
    .locals 1
    .param p1    # Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->l:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$a;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->k:Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;->setOnUserItemClickListener(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$a;)V

    .line 10
    :cond_0
    return-void
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

.method public final setScreenOrientation(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->f:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

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

.method public final t(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x2

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    const-string v2, "voice_"

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 15
    move-result p1

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    .line 20
    const p1, 0x2ea21

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lvc0/e;->a(I)V

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_0
    const p1, 0x2e63a

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lvc0/e;->a(I)V

    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public final u()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->j:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->fetchAudienceList(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->k:Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    new-instance v0, Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->d:Landroid/content/Context;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->j:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->getLiveAudienceState()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    :cond_1
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getRoomId()Ljava/lang/String;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->getLiveAudienceState()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-direct {v0, v1, v2}, Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;-><init>(Landroid/content/Context;Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;)V

    .line 44
    .line 45
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->k:Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->l:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$a;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;->setOnUserItemClickListener(Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$a;)V

    .line 51
    .line 52
    :cond_3
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->k:Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 58
    :cond_4
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

.method public final v()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->j:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->getLiveAudienceState()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;->getAudienceCount()Lkotlinx/coroutines/flow/w;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Number;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 27
    move-result v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v1

    .line 30
    .line 31
    :goto_0
    iget-object v2, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->j:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->getLiveAudienceState()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;->getAudienceList()Lkotlinx/coroutines/flow/w;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    check-cast v2, Ljava/util/List;

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 57
    move-result v1

    .line 58
    .line 59
    :cond_1
    iget-object v2, p0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->m:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 60
    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    const-string v4, "updateAudienceCount userCount:"

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v4, " listSize:"

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    const/16 v2, 0x64

    .line 90
    .line 91
    if-lt v0, v2, :cond_2

    .line 92
    .line 93
    .line 94
    invoke-direct {p0, v0}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->setUserCount(I)V

    .line 95
    return-void

    .line 96
    .line 97
    .line 98
    :cond_2
    invoke-direct {p0, v1}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->setUserCount(I)V

    .line 99
    return-void
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
