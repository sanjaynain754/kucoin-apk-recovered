.class public Lzw/b$a;
.super Ljava/lang/Object;
.source "BadgeAnimator.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzw/b;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/PointF;Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lzw/b;


# direct methods
.method public constructor <init>(Lzw/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lzw/b$a;->b:Lzw/b;

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
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Lzw/b$a;->b:Lzw/b;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lzw/b;->a(Lzw/b;)Ljava/lang/ref/WeakReference;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    check-cast p1, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    :goto_0
    iget-object p1, p0, Lzw/b$a;->b:Lzw/b;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    .line 31
    return-void
    .line 32
.end method
