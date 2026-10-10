.class Lcom/wang/avi/indicators/CubeTransitionIndicator$3;
.super Ljava/lang/Object;
.source "CubeTransitionIndicator.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/wang/avi/indicators/CubeTransitionIndicator;->onCreateAnimators()Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/wang/avi/indicators/CubeTransitionIndicator;


# direct methods
.method public constructor <init>(Lcom/wang/avi/indicators/CubeTransitionIndicator;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/wang/avi/indicators/CubeTransitionIndicator$3;->this$0:Lcom/wang/avi/indicators/CubeTransitionIndicator;

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
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/wang/avi/indicators/CubeTransitionIndicator$3;->this$0:Lcom/wang/avi/indicators/CubeTransitionIndicator;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 12
    move-result p1

    .line 13
    .line 14
    iput p1, v0, Lcom/wang/avi/indicators/CubeTransitionIndicator;->scaleFloat:F

    .line 15
    .line 16
    iget-object p1, p0, Lcom/wang/avi/indicators/CubeTransitionIndicator$3;->this$0:Lcom/wang/avi/indicators/CubeTransitionIndicator;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/wang/avi/Indicator;->postInvalidate()V

    .line 20
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
.end method
