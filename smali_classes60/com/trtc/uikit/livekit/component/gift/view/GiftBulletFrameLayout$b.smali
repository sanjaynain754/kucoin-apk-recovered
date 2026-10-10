.class public final Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "GiftBulletFrameLayout.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;->e()V
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
        "com/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$endAnimation$1",
        "Landroid/animation/AnimatorListenerAdapter;",
        "onAnimationEnd",
        "",
        "animation",
        "Landroid/animation/Animator;",
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
.field public final synthetic a:Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$b;->a:Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

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
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "animation"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$b;->a:Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;

    .line 8
    const/4 v0, 0x4

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$b;->a:Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;

    .line 14
    .line 15
    const/high16 v0, 0x3f800000    # 1.0f

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 19
    .line 20
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$b;->a:Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;->b(Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;)Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$a;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v0}, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$a;->a(I)V

    .line 31
    :cond_0
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
