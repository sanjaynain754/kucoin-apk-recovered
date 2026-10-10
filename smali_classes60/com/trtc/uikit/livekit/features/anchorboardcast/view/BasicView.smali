.class public abstract Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;
.super Landroid/widget/FrameLayout;
.source "BasicView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008&\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010K\u001a\u00020L2\u0006\u0010+\u001a\u00020,J\u0008\u0010M\u001a\u00020LH\u0014J\u0008\u0010N\u001a\u00020LH\u0014J\u0008\u0010O\u001a\u00020LH$J\u0008\u0010P\u001a\u00020LH$J\u0008\u0010Q\u001a\u00020LH$J\u0008\u0010R\u001a\u00020LH$R\u0014\u0010\n\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R\u001c\u00107\u001a\u0004\u0018\u000108X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010HR\u000e\u0010I\u001a\u00020JX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006S"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "baseContext",
        "getBaseContext",
        "()Landroid/content/Context;",
        "anchorState",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorState;",
        "getAnchorState",
        "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorState;",
        "setAnchorState",
        "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorState;)V",
        "coHostState",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostState;",
        "getCoHostState",
        "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostState;",
        "setCoHostState",
        "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostState;)V",
        "battleState",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleState;",
        "getBattleState",
        "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleState;",
        "setBattleState",
        "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleState;)V",
        "userState",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserState;",
        "getUserState",
        "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserState;",
        "setUserState",
        "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserState;)V",
        "mediaState",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaState;",
        "getMediaState",
        "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaState;",
        "setMediaState",
        "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaState;)V",
        "anchorStore",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;",
        "getAnchorStore",
        "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;",
        "setAnchorStore",
        "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V",
        "anchorCoHostStore",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore;",
        "getAnchorCoHostStore",
        "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore;",
        "setAnchorCoHostStore",
        "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore;)V",
        "anchorBattleStore",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;",
        "getAnchorBattleStore",
        "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;",
        "setAnchorBattleStore",
        "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;)V",
        "userStore",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserStore;",
        "getUserStore",
        "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserStore;",
        "setUserStore",
        "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserStore;)V",
        "mediaStore",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;",
        "getMediaStore",
        "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;",
        "setMediaStore",
        "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;)V",
        "isAddObserver",
        "",
        "init",
        "",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "initView",
        "refreshView",
        "addObserver",
        "removeObserver",
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
.field public final b:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Lwd0/i;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d:Lwd0/e;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public e:Lwd0/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:Lwd0/o;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g:Lwd0/n;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public h:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public i:Lwd0/f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public k:Lwd0/p;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public l:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:Z


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

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->b:Landroid/content/Context;

    .line 6
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->c()V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final b(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V
    .locals 1
    .param p1    # Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "anchorStore"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->h:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->q()Lwd0/p;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->k:Lwd0/p;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->n()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->h()Lwd0/f;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->i:Lwd0/f;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->g()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->o()Lwd0/i;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->c:Lwd0/i;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->p()Lwd0/o;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->f:Lwd0/o;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->m()Lwd0/n;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->g:Lwd0/n;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->j()Lwd0/e;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->d:Lwd0/e;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;->i()Lwd0/a;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->e:Lwd0/a;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->d()V

    .line 65
    .line 66
    iget-boolean p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->m:Z

    .line 67
    .line 68
    if-nez p1, :cond_0

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->a()V

    .line 72
    const/4 p1, 0x1

    .line 73
    .line 74
    iput-boolean p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->m:Z

    .line 75
    :cond_0
    return-void
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

.method public abstract c()V
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public final getAnchorBattleStore()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;

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

.method public final getAnchorCoHostStore()Lwd0/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->i:Lwd0/f;

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

.method public final getAnchorState()Lwd0/i;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->c:Lwd0/i;

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

.method public final getAnchorStore()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->h:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

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

.method public final getBaseContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->b:Landroid/content/Context;

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

.method public final getBattleState()Lwd0/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->e:Lwd0/a;

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

.method public final getCoHostState()Lwd0/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->d:Lwd0/e;

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

.method public final getMediaState()Lwd0/n;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->g:Lwd0/n;

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

.method public final getMediaStore()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

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

.method public final getUserState()Lwd0/o;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->f:Lwd0/o;

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

.method public final getUserStore()Lwd0/p;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->k:Lwd0/p;

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

.method public onAttachedToWindow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->h:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->m:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->a()V

    .line 16
    const/4 v0, 0x1

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->m:Z

    .line 19
    :cond_1
    :goto_0
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

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->m:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->e()V

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->m:Z

    .line 14
    :cond_0
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

.method public final setAnchorBattleStore(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;)V
    .locals 0
    .param p1    # Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->j:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;

    .line 3
    return-void
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

.method public final setAnchorCoHostStore(Lwd0/f;)V
    .locals 0
    .param p1    # Lwd0/f;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->i:Lwd0/f;

    .line 3
    return-void
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

.method public final setAnchorState(Lwd0/i;)V
    .locals 0
    .param p1    # Lwd0/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->c:Lwd0/i;

    .line 3
    return-void
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

.method public final setAnchorStore(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V
    .locals 0
    .param p1    # Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->h:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 3
    return-void
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

.method public final setBattleState(Lwd0/a;)V
    .locals 0
    .param p1    # Lwd0/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->e:Lwd0/a;

    .line 3
    return-void
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

.method public final setCoHostState(Lwd0/e;)V
    .locals 0
    .param p1    # Lwd0/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->d:Lwd0/e;

    .line 3
    return-void
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

.method public final setMediaState(Lwd0/n;)V
    .locals 0
    .param p1    # Lwd0/n;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->g:Lwd0/n;

    .line 3
    return-void
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

.method public final setMediaStore(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;)V
    .locals 0
    .param p1    # Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->l:Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;

    .line 3
    return-void
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

.method public final setUserState(Lwd0/o;)V
    .locals 0
    .param p1    # Lwd0/o;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->f:Lwd0/o;

    .line 3
    return-void
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

.method public final setUserStore(Lwd0/p;)V
    .locals 0
    .param p1    # Lwd0/p;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->k:Lwd0/p;

    .line 3
    return-void
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
