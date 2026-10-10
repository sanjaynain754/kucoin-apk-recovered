.class public final Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView$a;
.super Ljava/lang/Object;
.source "SVGAAnimationView.kt"

# interfaces
.implements Lcom/opensource/svgaplayer/SVGAParser$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;->d(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u0006\u001a\u00020\u0003H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView$playAnimation$1",
        "Lcom/opensource/svgaplayer/SVGAParser$ParseCompletion;",
        "onComplete",
        "",
        "videoItem",
        "Lcom/opensource/svgaplayer/SVGAVideoEntity;",
        "onError",
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
.field public final synthetic a:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView$a;->a:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;

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
.method public a()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "SVGAAnimationView"

    .line 3
    .line 4
    const-string v1, "decodeFromURL onError"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView$a;->a:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;->getCallback()Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$a;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    const/4 v1, -0x1

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$a;->a(I)V

    .line 20
    :cond_0
    return-void
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

.method public b(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "videoItem"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView$a;->a:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;->f(Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;)Lcom/opensource/svgaplayer/SVGAImageView;

    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView$a;->a:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;->f(Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;)Lcom/opensource/svgaplayer/SVGAImageView;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lcom/opensource/svgaplayer/SVGAImageView;->setVideoItem(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V

    .line 25
    .line 26
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView$a;->a:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;->f(Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;)Lcom/opensource/svgaplayer/SVGAImageView;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/opensource/svgaplayer/SVGAImageView;->r()V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method
