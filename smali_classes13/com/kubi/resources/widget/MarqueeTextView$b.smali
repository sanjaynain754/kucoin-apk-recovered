.class public Lcom/kubi/resources/widget/MarqueeTextView$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "MarqueeTextView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/resources/widget/MarqueeTextView;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/resources/widget/MarqueeTextView;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/MarqueeTextView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView$b;->a:Lcom/kubi/resources/widget/MarqueeTextView;

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
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView$b;->a:Lcom/kubi/resources/widget/MarqueeTextView;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/kubi/resources/widget/MarqueeTextView;->f(Lcom/kubi/resources/widget/MarqueeTextView;)I

    .line 9
    .line 10
    iget-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView$b;->a:Lcom/kubi/resources/widget/MarqueeTextView;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/kubi/resources/widget/MarqueeTextView;->h(Lcom/kubi/resources/widget/MarqueeTextView;)I

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Lcom/kubi/resources/widget/MarqueeTextView;->g(Lcom/kubi/resources/widget/MarqueeTextView;I)I

    .line 18
    .line 19
    iget-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView$b;->a:Lcom/kubi/resources/widget/MarqueeTextView;

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0}, Lcom/kubi/resources/widget/MarqueeTextView;->i(Lcom/kubi/resources/widget/MarqueeTextView;Z)Z

    .line 24
    .line 25
    iget-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView$b;->a:Lcom/kubi/resources/widget/MarqueeTextView;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 29
    return-void
    .line 30
    .line 31
    .line 32
.end method
