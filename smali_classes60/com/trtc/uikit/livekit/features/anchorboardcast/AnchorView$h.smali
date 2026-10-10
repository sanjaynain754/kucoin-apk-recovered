.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$h;
.super Ljava/lang/Object;
.source "AnchorView.kt"

# interfaces
.implements Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->i1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/anchorboardcast/AnchorView$initAudienceListView$1$1",
        "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$OnUserItemClickListener;",
        "onUserItemClick",
        "",
        "userInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
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
.field public final synthetic a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$h;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

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
.method public a(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "userInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$h;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->T(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView$h;->a:Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;

    .line 16
    .line 17
    new-instance v2, Lae0/f;

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;->W(Lcom/trtc/uikit/livekit/features/anchorboardcast/AnchorView;)Landroid/content/Context;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, v1, v0, p1}, Lae0/f;-><init>(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 28
    :cond_0
    return-void
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
