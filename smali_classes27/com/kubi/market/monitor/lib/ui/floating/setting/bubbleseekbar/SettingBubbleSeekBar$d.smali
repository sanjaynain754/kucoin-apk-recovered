.class public Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$d;
.super Ljava/lang/Object;
.source "SettingBubbleSeekBar.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->onTouchEvent(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;


# direct methods
.method public constructor <init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$d;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

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
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$d;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$600(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$d;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$300(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/high16 v1, 0x3f800000    # 1.0f

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$d;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$500(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)J

    .line 32
    move-result-wide v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    new-instance v1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$d$a;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$d$a;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$d;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 49
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
