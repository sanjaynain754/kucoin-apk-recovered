.class Lcom/wang/avi/indicators/BallBeatIndicator$1;
.super Ljava/lang/Object;
.source "BallBeatIndicator.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/wang/avi/indicators/BallBeatIndicator;->onCreateAnimators()Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/wang/avi/indicators/BallBeatIndicator;

.field final synthetic val$index:I


# direct methods
.method public constructor <init>(Lcom/wang/avi/indicators/BallBeatIndicator;I)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/wang/avi/indicators/BallBeatIndicator$1;->this$0:Lcom/wang/avi/indicators/BallBeatIndicator;

    .line 3
    .line 4
    iput p2, p0, Lcom/wang/avi/indicators/BallBeatIndicator$1;->val$index:I

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/wang/avi/indicators/BallBeatIndicator$1;->this$0:Lcom/wang/avi/indicators/BallBeatIndicator;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/wang/avi/indicators/BallBeatIndicator;->access$000(Lcom/wang/avi/indicators/BallBeatIndicator;)[F

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v1, p0, Lcom/wang/avi/indicators/BallBeatIndicator$1;->val$index:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 18
    move-result p1

    .line 19
    .line 20
    aput p1, v0, v1

    .line 21
    .line 22
    iget-object p1, p0, Lcom/wang/avi/indicators/BallBeatIndicator$1;->this$0:Lcom/wang/avi/indicators/BallBeatIndicator;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/wang/avi/Indicator;->postInvalidate()V

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
.end method
