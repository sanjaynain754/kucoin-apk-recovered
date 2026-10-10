.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SettingsListAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$Companion;,
        Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;,
        Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0018\u0000 )2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0008\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0008\u0010\u001e\u001a\u00020\u0015H\u0002J\u0008\u0010\u001f\u001a\u00020\u0015H\u0002J\u0008\u0010 \u001a\u00020\u0015H\u0002J\u0008\u0010!\u001a\u00020\u0015H\u0002J\u0008\u0010\"\u001a\u00020\u0015H\u0002J\u0008\u0010#\u001a\u00020\u0015H\u0002J\u0008\u0010$\u001a\u00020\u0015H\u0002J\u0008\u0010%\u001a\u00020\u0015H\u0002J\u0008\u0010&\u001a\u00020\u0015H\u0002J\u0008\u0010\'\u001a\u00020\u0015H\u0002J\u0008\u0010(\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$ViewHolder;",
        "context",
        "Landroid/content/Context;",
        "liveStreamManager",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;",
        "liveCoreView",
        "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;",
        "settingsDialog",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsPanelDialog;",
        "liveEntranceConfig",
        "Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;",
        "<init>",
        "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsPanelDialog;Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;)V",
        "data",
        "",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;",
        "audioEffectDialog",
        "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;",
        "initData",
        "",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "",
        "onBindViewHolder",
        "holder",
        "position",
        "handleCameraFlip",
        "switchMirror",
        "showMediaDashboardDialog",
        "showAudioEffectPanel",
        "showBeautyPanel",
        "showPipPanel",
        "handleShare",
        "handleFuture",
        "handleCopyTrading",
        "handleWeb3",
        "getItemCount",
        "Companion",
        "ViewHolder",
        "SettingsItem",
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
.field public static final p:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final i:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public o:Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->p:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$Companion;

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

.method public constructor <init>(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
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
    const-string v0, "liveStreamManager"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "liveCoreView"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "settingsDialog"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 24
    .line 25
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 26
    .line 27
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 28
    .line 29
    iput-object p3, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->k:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 30
    .line 31
    iput-object p4, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;

    .line 32
    .line 33
    iput-object p5, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->m:Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;

    .line 34
    .line 35
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->n:Ljava/util/List;

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->n()V

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
.end method

.method public static synthetic g(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->p(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;Landroid/view/View;)V

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

.method public static final synthetic h(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;)Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;

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

.method private final n()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->n:Ljava/util/List;

    .line 3
    .line 4
    new-instance v1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 7
    .line 8
    sget v3, Lcom/trtc/uikit/livekit/R$string;->live_share:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    const-string v3, "getString(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    sget v4, Lcom/trtc/uikit/livekit/R$drawable;->ic2_share_thin_20:I

    .line 20
    const/4 v5, 0x6

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, v4, v5}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;-><init>(Ljava/lang/String;II)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    sget-object v0, Lcom/trtc/uikit/livekit/kc/helper/a;->a:Lcom/trtc/uikit/livekit/kc/helper/a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/kc/helper/a;->a()Z

    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x0

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->m:Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;->getFuture()Ljava/lang/Boolean;

    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v0, v1

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 49
    move-result v0

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->n:Ljava/util/List;

    .line 54
    .line 55
    new-instance v2, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;

    .line 56
    .line 57
    iget-object v4, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 58
    .line 59
    sget v5, Lcom/trtc/uikit/livekit/R$string;->live_trade_future_card:I

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    sget v5, Lcom/trtc/uikit/livekit/R$drawable;->ic2_futures_thin_20:I

    .line 69
    const/4 v6, 0x7

    .line 70
    .line 71
    .line 72
    invoke-direct {v2, v4, v5, v6}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;-><init>(Ljava/lang/String;II)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->m:Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;->getWeb3()Ljava/lang/Boolean;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    :cond_2
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 87
    move-result v0

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->n:Ljava/util/List;

    .line 92
    .line 93
    new-instance v1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;

    .line 94
    .line 95
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 96
    .line 97
    sget v4, Lcom/trtc/uikit/livekit/R$string;->platform_live_web3:I

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    sget v3, Lcom/trtc/uikit/livekit/R$drawable;->ic2_web3_thin_20:I

    .line 107
    .line 108
    const/16 v4, 0x9

    .line 109
    .line 110
    .line 111
    invoke-direct {v1, v2, v3, v4}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;-><init>(Ljava/lang/String;II)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    :cond_3
    return-void
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

.method public static final p(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 15
    move-result p1

    .line 16
    .line 17
    .line 18
    packed-switch p1, :pswitch_data_0

    .line 19
    return-void

    .line 20
    .line 21
    .line 22
    :pswitch_0
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->m()V

    .line 23
    return-void

    .line 24
    .line 25
    .line 26
    :pswitch_1
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->j()V

    .line 27
    return-void

    .line 28
    .line 29
    .line 30
    :pswitch_2
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->k()V

    .line 31
    return-void

    .line 32
    .line 33
    .line 34
    :pswitch_3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->l()V

    .line 35
    return-void

    .line 36
    .line 37
    .line 38
    :pswitch_4
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->u()V

    .line 39
    return-void

    .line 40
    .line 41
    .line 42
    :pswitch_5
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->t()V

    .line 43
    return-void

    .line 44
    .line 45
    .line 46
    :pswitch_6
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->v()V

    .line 47
    return-void

    .line 48
    .line 49
    .line 50
    :pswitch_7
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i()V

    .line 51
    return-void

    .line 52
    .line 53
    .line 54
    :pswitch_8
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->r()V

    .line 55
    return-void

    .line 56
    .line 57
    .line 58
    :pswitch_9
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->s()V

    .line 59
    return-void

    .line 60
    nop

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->n:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

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

.method public final i()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->isFrontCamera()Lkotlinx/coroutines/flow/w;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    xor-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->switchCamera(Z)V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public final j()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

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
.end method

.method public final k()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    :try_start_0
    const-string v0, "B1FeedLive"

    .line 8
    .line 9
    const-string v1, "more"

    .line 10
    .line 11
    const-string v2, "futuresCard"

    .line 12
    .line 13
    const-string v3, "norm_version"

    .line 14
    const/4 v4, 0x1

    .line 15
    .line 16
    .line 17
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object v4

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1, v2, v3}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    :catch_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->o()Lwd0/i;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lwd0/i;->d()Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->o()Lwd0/i;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lwd0/i;->a()Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    sget-object v2, Lcom/trtc/uikit/livekit/kc/helper/b;->a:Lcom/trtc/uikit/livekit/kc/helper/b;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v1, v0}, Lcom/trtc/uikit/livekit/kc/helper/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    return-void
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

.method public final l()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->o()Lwd0/i;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lwd0/i;->d()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    sget-object v1, Lcom/trtc/uikit/livekit/kc/share/KCLiveShareHelper;->a:Lcom/trtc/uikit/livekit/kc/share/KCLiveShareHelper;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v0}, Lcom/trtc/uikit/livekit/kc/share/KCLiveShareHelper;->f(Landroid/content/Context;Ljava/lang/String;)V

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
    .line 40
    .line 41
    .line 42
.end method

.method public final m()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    :try_start_0
    const-string v0, "B1FeedLive"

    .line 8
    .line 9
    const-string v1, "more"

    .line 10
    .line 11
    const-string v2, "web3Card"

    .line 12
    .line 13
    const-string v3, "norm_version"

    .line 14
    const/4 v4, 0x1

    .line 15
    .line 16
    .line 17
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object v4

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1, v2, v3}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    :catch_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 32
    .line 33
    instance-of v1, v0, Landroidx/appcompat/app/AppCompatActivity;

    .line 34
    const/4 v2, 0x0

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v0, v2

    .line 41
    .line 42
    :goto_0
    const-string v1, "Live"

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    const-string v0, "SettingsListAdapter: load web3 card info failed - context is not activity"

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    return-void

    .line 51
    .line 52
    :cond_1
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->o()Lwd0/i;

    .line 56
    move-result-object v3

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Lwd0/i;->d()Ljava/lang/String;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    .line 63
    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 64
    move-result v4

    .line 65
    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    const-string v0, "SettingsListAdapter: load web3 card info failed - roomId is blank"

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    return-void

    .line 73
    :cond_2
    move-object v1, v2

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    new-instance v5, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$handleWeb3$2;

    .line 80
    .line 81
    .line 82
    invoke-direct {v5, v3, v0, v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$handleWeb3$2;-><init>(Ljava/lang/String;Landroidx/appcompat/app/AppCompatActivity;Lkotlin/coroutines/Continuation;)V

    .line 83
    const/4 v6, 0x3

    .line 84
    const/4 v7, 0x0

    .line 85
    const/4 v3, 0x0

    .line 86
    const/4 v4, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 90
    return-void
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

.method public o(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;I)V
    .locals 2
    .param p1    # Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;
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
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->n:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    check-cast p2, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;->d()Landroid/widget/TextView;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;->getTitle()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;->b()Landroid/widget/ImageView;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;->getIcon()I

    .line 32
    move-result v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;->c()Landroid/widget/LinearLayout;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;->getType()I

    .line 43
    move-result p2

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;->c()Landroid/widget/LinearLayout;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    new-instance p2, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/a;

    .line 57
    .line 58
    .line 59
    invoke-direct {p2, p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/a;-><init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    return-void
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

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->o(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;I)V

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
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->q(Landroid/view/ViewGroup;I)Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;

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

.method public q(Landroid/view/ViewGroup;I)Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;
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
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    move-result-object p2

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    sget v0, Lcom/trtc/uikit/livekit/R$layout;->livekit_anchor_settings_panel_item:I

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    new-instance p2, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p2, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$a;-><init>(Landroid/view/View;)V

    .line 29
    return-object p2
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

.method public final r()V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 14
    const/4 v2, 0x2

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v3, v2, v3}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;-><init>(Landroid/content/Context;Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;

    .line 21
    .line 22
    new-instance v4, Lcom/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel;

    .line 23
    .line 24
    iget-object v5, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 25
    const/4 v8, 0x6

    .line 26
    const/4 v9, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct/range {v4 .. v9}, Lcom/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->o()Lwd0/i;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lwd0/i;->d()Ljava/lang/String;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v0}, Lcom/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel;->b(Ljava/lang/String;)V

    .line 45
    .line 46
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$b;

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$b;-><init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v0}, Lcom/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel;->setOnBackButtonClickListener(Lcom/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel$a;)V

    .line 53
    .line 54
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v4}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->q(Landroid/view/View;)V

    .line 60
    .line 61
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 67
    :cond_1
    return-void
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

.method public final s()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lfd0/d;->e(Landroid/content/Context;)V

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

.method public final t()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    new-instance v0, Lcom/trtc/uikit/livekit/component/dashboard/StreamDashboardDialog;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->o()Lwd0/i;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lwd0/i;->d()Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lcom/trtc/uikit/livekit/component/dashboard/StreamDashboardDialog;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 26
    return-void
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

.method public final u()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    new-instance v0, Lcom/trtc/uikit/livekit/component/pippanel/a;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->o()Lwd0/i;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lwd0/i;->d()Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lcom/trtc/uikit/livekit/component/pippanel/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 26
    return-void
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

.method public final v()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;->AUTO:Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;

    .line 8
    .line 9
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;->ENABLE:Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;

    .line 10
    .line 11
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;->DISABLE:Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;

    .line 12
    .line 13
    .line 14
    filled-new-array {v0, v1, v2}, [Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    new-instance v1, Lud0/c;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;->i:Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2, v0}, Lud0/c;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 27
    .line 28
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$c;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$c;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lud0/c;->setOnMirrorTypeSelectedListener(Lud0/c$b;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
.end method
