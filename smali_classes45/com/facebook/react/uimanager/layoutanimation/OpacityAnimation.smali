.class Lcom/facebook/react/uimanager/layoutanimation/OpacityAnimation;
.super Landroid/view/animation/Animation;
.source "OpacityAnimation.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/layoutanimation/OpacityAnimation$OpacityAnimationListener;
    }
.end annotation


# instance fields
.field private final mDeltaOpacity:F

.field private final mStartOpacity:F

.field private final mView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;FF)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/react/uimanager/layoutanimation/OpacityAnimation;->mView:Landroid/view/View;

    .line 6
    .line 7
    iput p2, p0, Lcom/facebook/react/uimanager/layoutanimation/OpacityAnimation;->mStartOpacity:F

    .line 8
    sub-float/2addr p3, p2

    .line 9
    .line 10
    iput p3, p0, Lcom/facebook/react/uimanager/layoutanimation/OpacityAnimation;->mDeltaOpacity:F

    .line 11
    .line 12
    new-instance p2, Lcom/facebook/react/uimanager/layoutanimation/OpacityAnimation$OpacityAnimationListener;

    .line 13
    .line 14
    .line 15
    invoke-direct {p2, p1}, Lcom/facebook/react/uimanager/layoutanimation/OpacityAnimation$OpacityAnimationListener;-><init>(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

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
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .line 1
    .line 2
    iget-object p2, p0, Lcom/facebook/react/uimanager/layoutanimation/OpacityAnimation;->mView:Landroid/view/View;

    .line 3
    .line 4
    iget v0, p0, Lcom/facebook/react/uimanager/layoutanimation/OpacityAnimation;->mStartOpacity:F

    .line 5
    .line 6
    iget v1, p0, Lcom/facebook/react/uimanager/layoutanimation/OpacityAnimation;->mDeltaOpacity:F

    .line 7
    mul-float/2addr v1, p1

    .line 8
    add-float/2addr v0, v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 12
    return-void
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
.end method

.method public willChangeBounds()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
.end method
