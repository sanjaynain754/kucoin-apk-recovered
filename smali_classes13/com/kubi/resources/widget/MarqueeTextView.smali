.class public Lcom/kubi/resources/widget/MarqueeTextView;
.super Lcom/kubi/resources/widget/BaseTextView;
.source "MarqueeTextView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/MarqueeTextView$e;
    }
.end annotation


# instance fields
.field public A:Z

.field public B:Landroid/animation/ValueAnimator;

.field public C:Landroid/animation/ValueAnimator;

.field public D:Landroid/animation/ValueAnimator;

.field public E:Landroid/animation/ValueAnimator;

.field public F:Z

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/resources/widget/MarqueeTextView$e;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:Landroid/graphics/Paint;

.field public w:I

.field public x:I

.field public y:I

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/BaseTextView;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 3
    const-string p1, ""

    iput-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->c:Ljava/lang/String;

    const/16 p1, 0x1f4

    .line 4
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->d:I

    const/16 v0, 0x7d0

    .line 5
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->e:I

    .line 6
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->f:I

    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->g:I

    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->n:I

    const/16 p1, 0x64

    .line 9
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->o:I

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->p:Z

    .line 11
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->q:I

    .line 12
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 13
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 14
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->t:I

    .line 15
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->u:I

    .line 16
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->x:I

    .line 17
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->y:I

    .line 18
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->z:Z

    .line 19
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->A:Z

    .line 20
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->F:Z

    .line 21
    invoke-direct {p0}, Lcom/kubi/resources/widget/MarqueeTextView;->l()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/kubi/resources/widget/BaseTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 24
    const-string p1, ""

    iput-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->c:Ljava/lang/String;

    const/16 p1, 0x1f4

    .line 25
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->d:I

    const/16 v0, 0x7d0

    .line 26
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->e:I

    .line 27
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->f:I

    .line 28
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->g:I

    const/4 p1, -0x1

    .line 29
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->n:I

    const/16 p1, 0x64

    .line 30
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->o:I

    const/4 p1, 0x0

    .line 31
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->p:Z

    .line 32
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->q:I

    .line 33
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 34
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 35
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->t:I

    .line 36
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->u:I

    .line 37
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->x:I

    .line 38
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->y:I

    .line 39
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->z:Z

    .line 40
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->A:Z

    .line 41
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->F:Z

    .line 42
    invoke-virtual {p0, p2}, Lcom/kubi/resources/widget/MarqueeTextView;->m(Landroid/util/AttributeSet;)V

    .line 43
    invoke-direct {p0}, Lcom/kubi/resources/widget/MarqueeTextView;->l()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/resources/widget/BaseTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 46
    const-string p1, ""

    iput-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->c:Ljava/lang/String;

    const/16 p1, 0x1f4

    .line 47
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->d:I

    const/16 p3, 0x7d0

    .line 48
    iput p3, p0, Lcom/kubi/resources/widget/MarqueeTextView;->e:I

    .line 49
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->f:I

    .line 50
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->g:I

    const/4 p1, -0x1

    .line 51
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->n:I

    const/16 p1, 0x64

    .line 52
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->o:I

    const/4 p1, 0x0

    .line 53
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->p:Z

    .line 54
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->q:I

    .line 55
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 56
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 57
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->t:I

    .line 58
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->u:I

    .line 59
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->x:I

    .line 60
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->y:I

    .line 61
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->z:Z

    .line 62
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->A:Z

    .line 63
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->F:Z

    .line 64
    invoke-virtual {p0, p2}, Lcom/kubi/resources/widget/MarqueeTextView;->m(Landroid/util/AttributeSet;)V

    .line 65
    invoke-direct {p0}, Lcom/kubi/resources/widget/MarqueeTextView;->l()V

    return-void
.end method

.method public static synthetic b(Lcom/kubi/resources/widget/MarqueeTextView;Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 13
    move-result p1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    iget v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 23
    int-to-float v0, v0

    .line 24
    mul-float/2addr v0, p1

    .line 25
    float-to-int p1, v0

    .line 26
    .line 27
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    iget v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 31
    neg-int v0, v0

    .line 32
    int-to-float v0, v0

    .line 33
    mul-float/2addr v0, p1

    .line 34
    float-to-int p1, v0

    .line 35
    .line 36
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 40
    return-void
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
.end method

.method public static synthetic c(Lcom/kubi/resources/widget/MarqueeTextView;Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 13
    move-result p1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    iget v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 23
    int-to-float v0, v0

    .line 24
    mul-float/2addr v0, p1

    .line 25
    float-to-int p1, v0

    .line 26
    .line 27
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    iget v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 31
    neg-int v0, v0

    .line 32
    int-to-float v0, v0

    .line 33
    mul-float/2addr v0, p1

    .line 34
    float-to-int p1, v0

    .line 35
    .line 36
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 40
    return-void
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
.end method

.method public static synthetic d(Lcom/kubi/resources/widget/MarqueeTextView;Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 13
    move-result p1

    .line 14
    .line 15
    iget v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->t:I

    .line 16
    int-to-float v0, v0

    .line 17
    .line 18
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->l:I

    .line 19
    int-to-float v1, v1

    .line 20
    mul-float/2addr p1, v1

    .line 21
    .line 22
    const/high16 v1, 0x3f800000    # 1.0f

    .line 23
    mul-float/2addr p1, v1

    .line 24
    sub-float/2addr v0, p1

    .line 25
    float-to-int p1, v0

    .line 26
    .line 27
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->q:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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
.end method

.method public static synthetic e(Lcom/kubi/resources/widget/MarqueeTextView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/MarqueeTextView;->s()V

    .line 4
    return-void
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic f(Lcom/kubi/resources/widget/MarqueeTextView;)I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->u:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    iput v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->u:I

    .line 7
    return v0
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

.method public static synthetic g(Lcom/kubi/resources/widget/MarqueeTextView;I)I
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->q:I

    .line 3
    return p1
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
.end method

.method public static synthetic h(Lcom/kubi/resources/widget/MarqueeTextView;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->t:I

    .line 3
    return p0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic i(Lcom/kubi/resources/widget/MarqueeTextView;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->A:Z

    .line 3
    return p1
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
.end method

.method public static synthetic j(Lcom/kubi/resources/widget/MarqueeTextView;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->z:Z

    .line 3
    return p1
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
.end method

.method public static synthetic k(Lcom/kubi/resources/widget/MarqueeTextView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/MarqueeTextView;->r()V

    .line 4
    return-void
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method private l()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 19
    .line 20
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->o:I

    .line 21
    int-to-float v1, v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 25
    .line 26
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 27
    .line 28
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->n:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    sget v2, Lcom/kubi/sdk/res/R$font;->medium:I

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 47
    return-void
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method


# virtual methods
.method public getCurrentIndex()Lcom/kubi/resources/widget/MarqueeTextView$e;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 3
    .line 4
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->u:I

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/kubi/resources/widget/MarqueeTextView$e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object v0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    check-cast v0, Lcom/kubi/resources/widget/MarqueeTextView$e;

    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final m(Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/kubi/sdk/res/R$styleable;->MarqueeTextView:[I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    sget v0, Lcom/kubi/sdk/res/R$styleable;->MarqueeTextView_vertical_switch_speed:I

    .line 13
    .line 14
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->d:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 18
    move-result v0

    .line 19
    .line 20
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->h:I

    .line 21
    .line 22
    sget v0, Lcom/kubi/sdk/res/R$styleable;->MarqueeTextView_vertical_switch_interval:I

    .line 23
    .line 24
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->e:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 28
    move-result v0

    .line 29
    .line 30
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->i:I

    .line 31
    .line 32
    sget v0, Lcom/kubi/sdk/res/R$styleable;->MarqueeTextView_horizontal_scroll_speed:I

    .line 33
    .line 34
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->f:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 38
    move-result v0

    .line 39
    .line 40
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->j:I

    .line 41
    .line 42
    sget v0, Lcom/kubi/sdk/res/R$styleable;->MarqueeTextView_horizontal_loop_speed:I

    .line 43
    .line 44
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->g:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 48
    move-result v0

    .line 49
    .line 50
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->k:I

    .line 51
    .line 52
    sget v0, Lcom/kubi/sdk/res/R$styleable;->MarqueeTextView_content_text_color:I

    .line 53
    .line 54
    const/high16 v1, -0x1000000

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 58
    move-result v0

    .line 59
    .line 60
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->n:I

    .line 61
    .line 62
    sget v0, Lcom/kubi/sdk/res/R$styleable;->MarqueeTextView_content_text_size:I

    .line 63
    .line 64
    const/high16 v1, 0x41700000    # 15.0f

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lcom/blankj/utilcode/util/i0;->f(F)I

    .line 68
    move-result v1

    .line 69
    int-to-float v1, v1

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 73
    move-result v0

    .line 74
    float-to-int v0, v0

    .line 75
    .line 76
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->o:I

    .line 77
    .line 78
    sget v0, Lcom/kubi/sdk/res/R$styleable;->MarqueeTextView_content_single_text:I

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    iput-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->c:Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 88
    return-void
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
.end method

.method public n()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->B:Landroid/animation/ValueAnimator;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->pause()V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->C:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->pause()V

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->D:Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->pause()V

    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->E:Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->pause()V

    .line 29
    :cond_3
    const/4 v0, 0x1

    .line 30
    .line 31
    iput-boolean v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->F:Z

    .line 32
    return-void
    .line 33
.end method

.method public o()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->B:Landroid/animation/ValueAnimator;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->resume()V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->C:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->resume()V

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->D:Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->resume()V

    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->E:Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->resume()V

    .line 29
    :cond_3
    const/4 v0, 0x0

    .line 30
    .line 31
    iput-boolean v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->F:Z

    .line 32
    return-void
    .line 33
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 6
    .line 7
    const/high16 v1, 0x40000000    # 2.0f

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_7

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    move-result v0

    .line 16
    .line 17
    if-le v0, v2, :cond_7

    .line 18
    .line 19
    iget v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->u:I

    .line 20
    .line 21
    iget-object v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 22
    .line 23
    .line 24
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 25
    move-result v4

    .line 26
    .line 27
    if-lt v0, v4, :cond_0

    .line 28
    .line 29
    iput v3, p0, Lcom/kubi/resources/widget/MarqueeTextView;->u:I

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 33
    move-result v0

    .line 34
    .line 35
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->l:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 39
    move-result v0

    .line 40
    .line 41
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->m:I

    .line 42
    .line 43
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 44
    .line 45
    iget v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->u:I

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    check-cast v0, Lcom/kubi/resources/widget/MarqueeTextView$e;

    .line 52
    .line 53
    .line 54
    invoke-interface {v0}, Lcom/kubi/resources/widget/MarqueeTextView$e;->getDisplayString()Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    iget v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->u:I

    .line 58
    .line 59
    add-int/lit8 v5, v4, 0x1

    .line 60
    add-int/2addr v4, v2

    .line 61
    .line 62
    iget-object v6, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 63
    .line 64
    .line 65
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 66
    move-result v6

    .line 67
    .line 68
    if-lt v4, v6, :cond_1

    .line 69
    move v5, v3

    .line 70
    .line 71
    :cond_1
    iget-object v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 72
    .line 73
    .line 74
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    move-result-object v4

    .line 76
    .line 77
    check-cast v4, Lcom/kubi/resources/widget/MarqueeTextView$e;

    .line 78
    .line 79
    .line 80
    invoke-interface {v4}, Lcom/kubi/resources/widget/MarqueeTextView$e;->getDisplayString()Ljava/lang/String;

    .line 81
    move-result-object v4

    .line 82
    .line 83
    new-instance v5, Landroid/graphics/Rect;

    .line 84
    .line 85
    .line 86
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 87
    .line 88
    iget-object v6, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 92
    move-result v7

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6, v0, v3, v7, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 99
    move-result v5

    .line 100
    .line 101
    iput v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->w:I

    .line 102
    .line 103
    iget v6, p0, Lcom/kubi/resources/widget/MarqueeTextView;->m:I

    .line 104
    sub-int/2addr v5, v6

    .line 105
    .line 106
    iput v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 107
    .line 108
    iget-object v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 112
    move-result-object v5

    .line 113
    .line 114
    iget v6, v5, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 115
    neg-float v6, v6

    .line 116
    .line 117
    iget v5, v5, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 118
    sub-float/2addr v6, v5

    .line 119
    div-float/2addr v6, v1

    .line 120
    float-to-int v1, v6

    .line 121
    .line 122
    iget v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->l:I

    .line 123
    .line 124
    div-int/lit8 v5, v5, 0x2

    .line 125
    .line 126
    iget v6, p0, Lcom/kubi/resources/widget/MarqueeTextView;->y:I

    .line 127
    .line 128
    div-int/lit8 v6, v6, 0x4

    .line 129
    add-int/2addr v5, v6

    .line 130
    .line 131
    div-int/lit8 v1, v1, 0x4

    .line 132
    add-int/2addr v5, v1

    .line 133
    .line 134
    iput v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->t:I

    .line 135
    .line 136
    iget-boolean v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->p:Z

    .line 137
    .line 138
    if-nez v1, :cond_2

    .line 139
    .line 140
    iput-boolean v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->p:Z

    .line 141
    .line 142
    iput v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->q:I

    .line 143
    .line 144
    :cond_2
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 145
    .line 146
    if-lez v1, :cond_3

    .line 147
    .line 148
    iget v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->o:I

    .line 149
    .line 150
    mul-int/lit8 v5, v5, 0x2

    .line 151
    add-int/2addr v1, v5

    .line 152
    .line 153
    iput v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 154
    .line 155
    iget-boolean v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->z:Z

    .line 156
    .line 157
    if-nez v1, :cond_4

    .line 158
    .line 159
    iget-boolean v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->A:Z

    .line 160
    .line 161
    if-nez v1, :cond_4

    .line 162
    .line 163
    iput-boolean v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->z:Z

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Lcom/kubi/resources/widget/MarqueeTextView;->q()V

    .line 167
    .line 168
    iput v3, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 169
    goto :goto_0

    .line 170
    .line 171
    :cond_3
    iget-boolean v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->A:Z

    .line 172
    .line 173
    if-nez v1, :cond_4

    .line 174
    .line 175
    iput-boolean v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->A:Z

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/kubi/resources/widget/MarqueeTextView;->r()V

    .line 179
    .line 180
    iput v3, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 181
    .line 182
    .line 183
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 184
    move-result v1

    .line 185
    .line 186
    if-ne v1, v2, :cond_6

    .line 187
    .line 188
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 189
    .line 190
    iget v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 191
    sub-int/2addr v1, v2

    .line 192
    int-to-float v1, v1

    .line 193
    .line 194
    iget v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->q:I

    .line 195
    int-to-float v2, v2

    .line 196
    .line 197
    iget-object v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 201
    .line 202
    new-instance v0, Landroid/graphics/Rect;

    .line 203
    .line 204
    .line 205
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 206
    .line 207
    iget-object v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 211
    move-result v2

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v4, v3, v2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 218
    move-result v0

    .line 219
    .line 220
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->w:I

    .line 221
    .line 222
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->m:I

    .line 223
    sub-int/2addr v0, v1

    .line 224
    .line 225
    if-lez v0, :cond_5

    .line 226
    .line 227
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->o:I

    .line 228
    .line 229
    mul-int/lit8 v1, v1, 0x2

    .line 230
    add-int/2addr v0, v1

    .line 231
    :cond_5
    neg-int v0, v0

    .line 232
    int-to-float v0, v0

    .line 233
    .line 234
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->q:I

    .line 235
    .line 236
    iget v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->l:I

    .line 237
    add-int/2addr v1, v2

    .line 238
    int-to-float v1, v1

    .line 239
    .line 240
    iget-object v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, v4, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 244
    return-void

    .line 245
    .line 246
    :cond_6
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 247
    int-to-float v1, v1

    .line 248
    .line 249
    iget v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->q:I

    .line 250
    int-to-float v2, v2

    .line 251
    .line 252
    iget-object v3, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 256
    .line 257
    iget v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->q:I

    .line 258
    .line 259
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->l:I

    .line 260
    add-int/2addr v0, v1

    .line 261
    int-to-float v0, v0

    .line 262
    .line 263
    iget-object v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 264
    const/4 v2, 0x0

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1, v4, v2, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 268
    return-void

    .line 269
    .line 270
    :cond_7
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->c:Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 274
    move-result v0

    .line 275
    .line 276
    if-nez v0, :cond_b

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 280
    move-result v0

    .line 281
    .line 282
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->l:I

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 286
    move-result v0

    .line 287
    .line 288
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->m:I

    .line 289
    .line 290
    new-instance v0, Landroid/graphics/Rect;

    .line 291
    .line 292
    .line 293
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 294
    .line 295
    iget-object v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 296
    .line 297
    iget-object v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->c:Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 301
    move-result v6

    .line 302
    .line 303
    .line 304
    invoke-virtual {v4, v5, v3, v6, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 308
    move-result v0

    .line 309
    .line 310
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->w:I

    .line 311
    .line 312
    iget v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->m:I

    .line 313
    sub-int/2addr v0, v4

    .line 314
    .line 315
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 316
    .line 317
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 321
    move-result-object v0

    .line 322
    .line 323
    iget v4, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 324
    neg-float v4, v4

    .line 325
    .line 326
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 327
    sub-float/2addr v4, v0

    .line 328
    div-float/2addr v4, v1

    .line 329
    float-to-int v0, v4

    .line 330
    .line 331
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->l:I

    .line 332
    .line 333
    div-int/lit8 v1, v1, 0x2

    .line 334
    .line 335
    iget v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->y:I

    .line 336
    .line 337
    div-int/lit8 v4, v4, 0x4

    .line 338
    add-int/2addr v1, v4

    .line 339
    .line 340
    div-int/lit8 v0, v0, 0x4

    .line 341
    add-int/2addr v1, v0

    .line 342
    .line 343
    iput v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->t:I

    .line 344
    .line 345
    iget-boolean v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->p:Z

    .line 346
    .line 347
    if-nez v0, :cond_8

    .line 348
    .line 349
    iput-boolean v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->p:Z

    .line 350
    .line 351
    iput v3, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 352
    .line 353
    :cond_8
    iget v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 354
    .line 355
    if-lez v0, :cond_9

    .line 356
    .line 357
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->o:I

    .line 358
    .line 359
    mul-int/lit8 v1, v1, 0x2

    .line 360
    add-int/2addr v0, v1

    .line 361
    .line 362
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 363
    .line 364
    iget-boolean v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->z:Z

    .line 365
    .line 366
    if-nez v0, :cond_a

    .line 367
    .line 368
    iput-boolean v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->z:Z

    .line 369
    .line 370
    iput v3, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0}, Lcom/kubi/resources/widget/MarqueeTextView;->p()V

    .line 374
    goto :goto_1

    .line 375
    .line 376
    :cond_9
    iput v3, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 377
    .line 378
    :cond_a
    :goto_1
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->c:Ljava/lang/String;

    .line 379
    .line 380
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->r:I

    .line 381
    int-to-float v1, v1

    .line 382
    .line 383
    iget v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->t:I

    .line 384
    int-to-float v2, v2

    .line 385
    .line 386
    iget-object v3, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 387
    .line 388
    .line 389
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 390
    :cond_b
    return-void
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/AppCompatTextView;->onLayout(ZIIII)V

    .line 4
    return-void
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
.end method

.method public onMeasure(II)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;->onMeasure(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 7
    move-result v0

    .line 8
    .line 9
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->m:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 13
    move-result v0

    .line 14
    .line 15
    iput v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->l:I

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 19
    move-result v0

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 23
    move-result p1

    .line 24
    .line 25
    .line 26
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 27
    move-result v1

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 31
    move-result p2

    .line 32
    .line 33
    iget-object v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 34
    const/4 v3, 0x0

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 40
    move-result v2

    .line 41
    .line 42
    if-lez v2, :cond_0

    .line 43
    move v2, v3

    .line 44
    .line 45
    :goto_0
    iget-object v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 46
    .line 47
    .line 48
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 49
    move-result v4

    .line 50
    .line 51
    if-ge v2, v4, :cond_1

    .line 52
    .line 53
    iget-object v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 54
    .line 55
    .line 56
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    move-result-object v4

    .line 58
    .line 59
    check-cast v4, Lcom/kubi/resources/widget/MarqueeTextView$e;

    .line 60
    .line 61
    .line 62
    invoke-interface {v4}, Lcom/kubi/resources/widget/MarqueeTextView$e;->getDisplayString()Ljava/lang/String;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    new-instance v5, Landroid/graphics/Rect;

    .line 66
    .line 67
    .line 68
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 69
    .line 70
    iget-object v6, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 74
    move-result v7

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v4, v3, v7, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 81
    move-result v4

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 85
    move-result v5

    .line 86
    .line 87
    iget v6, p0, Lcom/kubi/resources/widget/MarqueeTextView;->y:I

    .line 88
    .line 89
    .line 90
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 91
    move-result v5

    .line 92
    .line 93
    iput v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->y:I

    .line 94
    .line 95
    iget v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->x:I

    .line 96
    .line 97
    .line 98
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    .line 99
    move-result v4

    .line 100
    .line 101
    iput v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->x:I

    .line 102
    .line 103
    add-int/lit8 v2, v2, 0x1

    .line 104
    goto :goto_0

    .line 105
    .line 106
    :cond_0
    iget-object v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->c:Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 110
    move-result v2

    .line 111
    .line 112
    if-nez v2, :cond_1

    .line 113
    .line 114
    new-instance v2, Landroid/graphics/Rect;

    .line 115
    .line 116
    .line 117
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 118
    .line 119
    iget-object v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 120
    .line 121
    iget-object v5, p0, Lcom/kubi/resources/widget/MarqueeTextView;->c:Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 125
    move-result v6

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v5, v3, v6, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 132
    move-result v3

    .line 133
    .line 134
    iput v3, p0, Lcom/kubi/resources/widget/MarqueeTextView;->x:I

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 138
    move-result v2

    .line 139
    .line 140
    iput v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->y:I

    .line 141
    .line 142
    :cond_1
    const/high16 v2, 0x40000000    # 2.0f

    .line 143
    .line 144
    if-ne p1, v2, :cond_2

    .line 145
    .line 146
    if-ne p2, v2, :cond_2

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 150
    return-void

    .line 151
    .line 152
    :cond_2
    if-ne p1, v2, :cond_3

    .line 153
    .line 154
    iget p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->y:I

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 158
    return-void

    .line 159
    .line 160
    :cond_3
    if-ne p2, v2, :cond_4

    .line 161
    .line 162
    iget p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->x:I

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 166
    return-void

    .line 167
    .line 168
    :cond_4
    iget p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->x:I

    .line 169
    .line 170
    iget p2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->y:I

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 174
    return-void
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 4
    return-void
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
.end method

.method public final p()V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->E:Landroid/animation/ValueAnimator;

    .line 13
    .line 14
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->j:I

    .line 15
    .line 16
    iget v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 17
    mul-int/2addr v1, v2

    .line 18
    .line 19
    iget v3, p0, Lcom/kubi/resources/widget/MarqueeTextView;->o:I

    .line 20
    div-int/2addr v1, v3

    .line 21
    .line 22
    if-gez v1, :cond_0

    .line 23
    const/4 v0, 0x0

    .line 24
    .line 25
    iput-boolean v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->z:Z

    .line 26
    return-void

    .line 27
    .line 28
    :cond_0
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->k:I

    .line 29
    mul-int/2addr v1, v2

    .line 30
    div-int/2addr v1, v3

    .line 31
    int-to-long v1, v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->E:Landroid/animation/ValueAnimator;

    .line 37
    .line 38
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 45
    .line 46
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->E:Landroid/animation/ValueAnimator;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 50
    .line 51
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->E:Landroid/animation/ValueAnimator;

    .line 52
    .line 53
    new-instance v1, Lcom/kubi/resources/widget/p1;

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, p0}, Lcom/kubi/resources/widget/p1;-><init>(Lcom/kubi/resources/widget/MarqueeTextView;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 60
    .line 61
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->E:Landroid/animation/ValueAnimator;

    .line 62
    .line 63
    new-instance v1, Lcom/kubi/resources/widget/MarqueeTextView$d;

    .line 64
    .line 65
    .line 66
    invoke-direct {v1, p0}, Lcom/kubi/resources/widget/MarqueeTextView$d;-><init>(Lcom/kubi/resources/widget/MarqueeTextView;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 70
    return-void

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public final q()V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->D:Landroid/animation/ValueAnimator;

    .line 13
    .line 14
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->j:I

    .line 15
    .line 16
    iget v2, p0, Lcom/kubi/resources/widget/MarqueeTextView;->s:I

    .line 17
    .line 18
    mul-int v3, v1, v2

    .line 19
    .line 20
    iget v4, p0, Lcom/kubi/resources/widget/MarqueeTextView;->o:I

    .line 21
    div-int/2addr v3, v4

    .line 22
    .line 23
    if-gez v3, :cond_0

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->z:Z

    .line 27
    return-void

    .line 28
    :cond_0
    mul-int/2addr v1, v2

    .line 29
    div-int/2addr v1, v4

    .line 30
    int-to-long v1, v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->D:Landroid/animation/ValueAnimator;

    .line 36
    .line 37
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 38
    .line 39
    .line 40
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 44
    .line 45
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->D:Landroid/animation/ValueAnimator;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 49
    .line 50
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->D:Landroid/animation/ValueAnimator;

    .line 51
    .line 52
    new-instance v1, Lcom/kubi/resources/widget/n1;

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, p0}, Lcom/kubi/resources/widget/n1;-><init>(Lcom/kubi/resources/widget/MarqueeTextView;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 59
    .line 60
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->D:Landroid/animation/ValueAnimator;

    .line 61
    .line 62
    new-instance v1, Lcom/kubi/resources/widget/MarqueeTextView$c;

    .line 63
    .line 64
    .line 65
    invoke-direct {v1, p0}, Lcom/kubi/resources/widget/MarqueeTextView$c;-><init>(Lcom/kubi/resources/widget/MarqueeTextView;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 69
    return-void

    .line 70
    nop

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public final r()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->C:Landroid/animation/ValueAnimator;

    .line 13
    .line 14
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->i:I

    .line 15
    int-to-long v1, v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->C:Landroid/animation/ValueAnimator;

    .line 21
    .line 22
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->C:Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->C:Landroid/animation/ValueAnimator;

    .line 36
    .line 37
    new-instance v1, Lcom/kubi/resources/widget/MarqueeTextView$a;

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, p0}, Lcom/kubi/resources/widget/MarqueeTextView$a;-><init>(Lcom/kubi/resources/widget/MarqueeTextView;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 44
    return-void

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public final s()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->B:Landroid/animation/ValueAnimator;

    .line 13
    .line 14
    iget v1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->h:I

    .line 15
    int-to-long v1, v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->B:Landroid/animation/ValueAnimator;

    .line 21
    .line 22
    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->B:Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->B:Landroid/animation/ValueAnimator;

    .line 36
    .line 37
    new-instance v1, Lcom/kubi/resources/widget/o1;

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, p0}, Lcom/kubi/resources/widget/o1;-><init>(Lcom/kubi/resources/widget/MarqueeTextView;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 44
    .line 45
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->B:Landroid/animation/ValueAnimator;

    .line 46
    .line 47
    new-instance v1, Lcom/kubi/resources/widget/MarqueeTextView$b;

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, p0}, Lcom/kubi/resources/widget/MarqueeTextView$b;-><init>(Lcom/kubi/resources/widget/MarqueeTextView;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 54
    return-void

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public setContentColor(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->n:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

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
.end method

.method public setContentList(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/resources/widget/MarqueeTextView$e;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->b:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Lcom/kubi/resources/widget/MarqueeTextView$e;

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Lcom/kubi/resources/widget/MarqueeTextView$e;->getDisplayString()Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/MarqueeTextView;->setSingleText(Ljava/lang/String;)V

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 31
    return-void
    .line 32
.end method

.method public setContentTextSize(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->o:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/MarqueeTextView;->v:Landroid/graphics/Paint;

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    return-void
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

.method public setHorizontalScrollSpeed(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->j:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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

.method public setSingleText(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->c:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

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

.method public setVerticalSwitchInterval(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->i:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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

.method public setVerticalSwitchSpeed(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/MarqueeTextView;->h:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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
