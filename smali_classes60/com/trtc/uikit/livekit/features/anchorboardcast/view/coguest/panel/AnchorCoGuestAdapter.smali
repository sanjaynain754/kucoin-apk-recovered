.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "AnchorCoGuestAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$Companion;,
        Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0008\u0010\u0013\u001a\u00020\u0010H\u0002J\u0008\u0010\u0014\u001a\u00020\u0010H\u0007J\u0008\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$LinkMicViewHolder;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "data",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "",
        "onBindViewHolder",
        "",
        "holder",
        "position",
        "initData",
        "updateData",
        "getItemCount",
        "Companion",
        "LinkMicViewHolder",
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
        "SMAP\nAnchorCoGuestAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorCoGuestAdapter.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n827#2:101\n855#2,2:102\n*S KotlinDebug\n*F\n+ 1 AnchorCoGuestAdapter.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter\n*L\n78#1:101\n78#1:102,2\n*E\n"
    }
.end annotation


# static fields
.field public static final k:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final l:Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final i:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->k:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$Companion;

    .line 9
    .line 10
    sget-object v0, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->c:Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;

    .line 11
    .line 12
    const-string v1, "AnchorCoGuestAdapter"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;->getFeaturesLogger(Ljava/lang/String;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->l:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
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
    .line 8
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->i:Landroid/content/Context;

    .line 11
    .line 12
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->j()V

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
.end method

.method public static synthetic g(Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->m(Landroid/view/View;)V

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

.method public static synthetic h(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->k(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static final synthetic i()Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->l:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

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

.method private final j()V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 3
    .line 4
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getConnected()Lkotlinx/coroutines/flow/w;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    check-cast v0, Ljava/lang/Iterable;

    .line 45
    .line 46
    new-instance v1, Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    move-result v2

    .line 58
    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    move-result-object v2

    .line 64
    move-object v3, v2

    .line 65
    .line 66
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 76
    move-result-object v4

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 80
    move-result-object v4

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    .line 87
    invoke-interface {v4}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 88
    move-result-object v4

    .line 89
    .line 90
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 94
    move-result-object v4

    .line 95
    .line 96
    .line 97
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    move-result v3

    .line 99
    .line 100
    if-eqz v3, :cond_0

    .line 101
    .line 102
    .line 103
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 104
    goto :goto_0

    .line 105
    .line 106
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 110
    .line 111
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 115
    .line 116
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    .line 127
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 131
    .line 132
    if-eqz v0, :cond_2

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    if-nez v0, :cond_3

    .line 139
    .line 140
    :cond_2
    const-string v0, ""

    .line 141
    .line 142
    :cond_3
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 143
    .line 144
    new-instance v2, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/e;

    .line 145
    .line 146
    .line 147
    invoke-direct {v2, v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/e;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 151
    return-void
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

.method public static final k(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    move-result p0

    .line 9
    return p0
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

.method private static final m(Landroid/view/View;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    const-string v0, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo"

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    check-cast p0, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 16
    .line 17
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 18
    .line 19
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    new-instance v1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$b;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$b;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->kickUserOutOfSeat(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

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
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public l(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;I)V
    .locals 4
    .param p1    # Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "holder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserName()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;->d()Landroid/widget/TextView;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    goto :goto_0

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;->d()Landroid/widget/TextView;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserName()Ljava/lang/String;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;->b()Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    new-instance v2, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;

    .line 53
    .line 54
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 58
    move-result-object p2

    .line 59
    .line 60
    check-cast p2, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    sget v3, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_avatar:I

    .line 67
    .line 68
    .line 69
    invoke-direct {v2, p2, v3}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;-><init>(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;->setContent(Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;->c()Landroid/widget/TextView;

    .line 76
    move-result-object p2

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;->c()Landroid/widget/TextView;

    .line 83
    move-result-object p2

    .line 84
    const/4 v0, 0x1

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;->c()Landroid/widget/TextView;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    new-instance p2, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/d;

    .line 94
    .line 95
    .line 96
    invoke-direct {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/d;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    return-void
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
.end method

.method public n(Landroid/view/ViewGroup;I)Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string p2, "parent"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->i:Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    sget v0, Lcom/trtc/uikit/livekit/R$layout;->livekit_layout_anchor_link_mic_item:I

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    new-instance p2, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;-><init>(Landroid/view/View;)V

    .line 27
    return-object p2
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

.method public final o()V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->j()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

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

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->l(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;I)V

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

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;->n(Landroid/view/ViewGroup;I)Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$a;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
