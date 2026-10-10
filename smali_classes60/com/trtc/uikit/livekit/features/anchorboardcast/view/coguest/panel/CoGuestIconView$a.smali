.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;
.super Ljava/lang/Object;
.source "CoGuestIconView.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$startAnimationTask$1",
        "Ljava/lang/Runnable;",
        "run",
        "",
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
.field public final synthetic b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;

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
.method public run()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->b(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->a()[I

    .line 10
    move-result-object v1

    .line 11
    array-length v1, v1

    .line 12
    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    if-ge v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->a()[I

    .line 21
    move-result-object v3

    .line 22
    .line 23
    aget v3, v3, v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 27
    .line 28
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;

    .line 29
    .line 30
    const-wide/16 v3, 0x1f4

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, p0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 34
    .line 35
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$a;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    rem-int/2addr v0, v1

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;->c(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;I)V

    .line 42
    :cond_0
    return-void
.end method
