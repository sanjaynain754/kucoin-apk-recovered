.class public Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$g;
.super Landroid/animation/AnimatorListenerAdapter;
.source "BubbleSeekBar.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->showBubble()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$g;->a:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;

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
.end method


# virtual methods
.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    .line 2
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$g;->a:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->access$1400(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Landroid/view/WindowManager;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$g;->a:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->access$600(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$g;->a:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->access$1300(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Landroid/view/WindowManager$LayoutParams;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    return-void
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
.end method
