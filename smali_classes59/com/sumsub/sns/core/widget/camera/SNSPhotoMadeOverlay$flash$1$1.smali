.class public final Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay$flash$1$1;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;->flash(Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay$flash$1$1",
        "Landroid/view/animation/Animation$AnimationListener;",
        "onAnimationStart",
        "",
        "animation",
        "Landroid/view/animation/Animation;",
        "onAnimationEnd",
        "onAnimationRepeat",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay$flash$1$1;->this$0:Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;

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
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay$flash$1$1;->this$0:Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;

    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay$flash$1$1;->this$0:Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;->access$setFlashing$p(Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;Z)V

    .line 14
    .line 15
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay$flash$1$1;->this$0:Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;->access$getPendingCallback$p(Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;)Lkotlin/jvm/functions/Function0;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay$flash$1$1;->this$0:Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0}, Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;->access$setPendingCallback$p(Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;Lkotlin/jvm/functions/Function0;)V

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
    .line 79
    .line 80
    .line 81
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay$flash$1$1;->this$0:Lcom/sumsub/sns/core/widget/camera/SNSPhotoMadeOverlay;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

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
.end method
