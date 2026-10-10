.class public Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;
.super Landroid/widget/HorizontalScrollView;
.source "RankSlidingTabLayout.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$b;
    }
.end annotation


# static fields
.field public static t0:Landroid/graphics/Typeface;

.field public static u0:Landroid/graphics/Typeface;


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:F

.field public E:F

.field public F:F

.field public G:F

.field public H:I

.field public I:Z

.field public J:Z

.field public K:I

.field public L:F

.field public M:I

.field public N:Z

.field public O:I

.field public P:F

.field public Q:F

.field public R:F

.field public S:I

.field public T:I

.field public U:I

.field public V:Z

.field public W:I

.field public a0:I

.field public b:Landroid/content/Context;

.field public b0:Z

.field public c:Landroidx/viewpager/widget/ViewPager;

.field public c0:F

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field

.field public final d0:Landroid/animation/ArgbEvaluator;

.field public e:Landroid/widget/LinearLayout;

.field public e0:J

.field public f:I

.field public f0:Landroid/view/animation/Interpolator;

.field public g:F

.field public g0:Z

.field public h:I

.field public final h0:Landroid/graphics/Paint;

.field public final i:Landroid/graphics/Rect;

.field public final i0:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Landroid/graphics/Rect;

.field public j0:I

.field public final k:Landroid/graphics/drawable/GradientDrawable;

.field public k0:I

.field public final l:Landroid/graphics/Paint;

.field public l0:Z

.field public final m:Landroid/graphics/Paint;

.field public m0:Z

.field public final n:Landroid/graphics/Paint;

.field public n0:Z

.field public final o:Landroid/graphics/Path;

.field public final o0:I

.field public p:I

.field public p0:F

.field public q:F

.field public q0:F

.field public r:Z

.field public r0:I

.field public s:F

.field public s0:Lww/b;

.field public t:I

.field public u:I

.field public v:I

.field public w:F

.field public x:Z

.field public y:Landroid/graphics/drawable/Drawable;

.field public z:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 5
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->j:Landroid/graphics/Rect;

    .line 6
    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 7
    new-instance p3, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->l:Landroid/graphics/Paint;

    .line 8
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->m:Landroid/graphics/Paint;

    .line 9
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->n:Landroid/graphics/Paint;

    .line 10
    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o:Landroid/graphics/Path;

    const/4 p3, 0x0

    .line 11
    iput p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 12
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->x:Z

    .line 13
    new-instance v1, Landroid/animation/ArgbEvaluator;

    invoke-direct {v1}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->d0:Landroid/animation/ArgbEvaluator;

    const-wide/16 v1, 0x12c

    .line 14
    iput-wide v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e0:J

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3e4ccccd    # 0.2f

    .line 15
    invoke-static {v3, v1, v1, v2}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v1

    iput-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f0:Landroid/view/animation/Interpolator;

    .line 16
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g0:Z

    .line 17
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 18
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i0:Landroid/util/SparseArray;

    const/4 v1, -0x1

    .line 19
    iput v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->j0:I

    .line 20
    iput v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k0:I

    .line 21
    iput-boolean p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->l0:Z

    .line 22
    iput-boolean p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->m0:Z

    .line 23
    iput-boolean p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->n0:Z

    .line 24
    iput p3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->r0:I

    .line 25
    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->setFillViewport(Z)V

    .line 26
    invoke-virtual {p0, p3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 27
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 28
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 29
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o0:I

    .line 30
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->b:Landroid/content/Context;

    .line 31
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 32
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 33
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    invoke-virtual {p0, p1, p2}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    const-string v0, "http://schemas.android.com/apk/res/android"

    const-string v2, "layout_height"

    invoke-interface {p2, v0, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, -0x2

    .line 37
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    const v0, 0x10100f5

    .line 38
    filled-new-array {v0}, [I

    move-result-object v0

    .line 39
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 40
    :try_start_0
    invoke-virtual {p1, p3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->a0:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 42
    throw p2
.end method

.method public static synthetic a(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 3
    return-object p0
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

.method public static synthetic b(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 3
    return-object p0
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

.method public static synthetic c(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->D(I)V

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
.end method

.method public static synthetic d(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Lww/b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s0:Lww/b;

    .line 3
    return-object p0
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

.method public static synthetic e(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

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

.method public static synthetic f(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->b0:Z

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


# virtual methods
.method public A(F)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->b:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 13
    mul-float/2addr p1, v0

    .line 14
    .line 15
    const/high16 v0, 0x3f000000    # 0.5f

    .line 16
    add-float/2addr p1, v0

    .line 17
    float-to-int p1, p1

    .line 18
    return p1
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

.method public final B()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 5
    .line 6
    if-ge v1, v2, :cond_6

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 15
    .line 16
    if-ne v1, v3, :cond_0

    .line 17
    const/4 v3, 0x1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    move v3, v0

    .line 20
    .line 21
    :goto_1
    if-eqz v2, :cond_1

    .line 22
    .line 23
    sget v4, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    check-cast v2, Landroid/widget/TextView;

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    const/4 v2, 0x0

    .line 32
    .line 33
    :goto_2
    if-eqz v2, :cond_5

    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->S:I

    .line 38
    goto :goto_3

    .line 39
    .line 40
    :cond_2
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->T:I

    .line 41
    .line 42
    .line 43
    :goto_3
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    .line 45
    sget-object v4, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->t0:Landroid/graphics/Typeface;

    .line 46
    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    sget-object v4, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u0:Landroid/graphics/Typeface;

    .line 50
    .line 51
    if-eqz v4, :cond_4

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 55
    move-result v4

    .line 56
    .line 57
    if-nez v4, :cond_4

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    sget-object v3, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u0:Landroid/graphics/Typeface;

    .line 62
    goto :goto_4

    .line 63
    .line 64
    :cond_3
    sget-object v3, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->t0:Landroid/graphics/Typeface;

    .line 65
    .line 66
    .line 67
    :goto_4
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 68
    goto :goto_5

    .line 69
    .line 70
    .line 71
    :cond_4
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 76
    .line 77
    :cond_5
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 78
    goto :goto_0

    .line 79
    :cond_6
    return-void
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

.method public final C(Ljava/lang/CharSequence;Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroid/widget/TextView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p2}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->G(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->F(Landroid/widget/TextView;)V

    .line 22
    :cond_0
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

.method public final D(I)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 5
    .line 6
    if-ge v1, v2, :cond_9

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x1

    .line 14
    .line 15
    if-ne v1, p1, :cond_0

    .line 16
    move v4, v3

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move v4, v0

    .line 19
    .line 20
    :goto_1
    if-eqz v2, :cond_1

    .line 21
    .line 22
    sget v5, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    check-cast v2, Landroid/widget/TextView;

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    const/4 v2, 0x0

    .line 31
    .line 32
    :goto_2
    if-eqz v2, :cond_6

    .line 33
    .line 34
    iget-boolean v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->m0:Z

    .line 35
    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->S:I

    .line 41
    goto :goto_3

    .line 42
    .line 43
    :cond_2
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->T:I

    .line 44
    .line 45
    .line 46
    :goto_3
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 47
    .line 48
    :cond_3
    iget-boolean v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->l0:Z

    .line 49
    .line 50
    if-eqz v5, :cond_6

    .line 51
    .line 52
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->U:I

    .line 53
    .line 54
    if-ne v5, v3, :cond_6

    .line 55
    .line 56
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->m0:Z

    .line 57
    .line 58
    if-nez v3, :cond_6

    .line 59
    .line 60
    sget-object v3, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->t0:Landroid/graphics/Typeface;

    .line 61
    .line 62
    if-eqz v3, :cond_5

    .line 63
    .line 64
    sget-object v3, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u0:Landroid/graphics/Typeface;

    .line 65
    .line 66
    if-eqz v3, :cond_5

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 70
    move-result v3

    .line 71
    .line 72
    if-nez v3, :cond_5

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    sget-object v3, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u0:Landroid/graphics/Typeface;

    .line 77
    goto :goto_4

    .line 78
    .line 79
    :cond_4
    sget-object v3, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->t0:Landroid/graphics/Typeface;

    .line 80
    .line 81
    .line 82
    :goto_4
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 83
    goto :goto_5

    .line 84
    .line 85
    .line 86
    :cond_5
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 87
    move-result-object v3

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 91
    .line 92
    :cond_6
    :goto_5
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->x:Z

    .line 93
    .line 94
    if-nez v3, :cond_8

    .line 95
    .line 96
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 97
    const/4 v5, 0x2

    .line 98
    .line 99
    if-ne v3, v5, :cond_8

    .line 100
    .line 101
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u:I

    .line 102
    const/4 v5, -0x1

    .line 103
    .line 104
    if-eq v3, v5, :cond_8

    .line 105
    .line 106
    iget v6, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->v:I

    .line 107
    .line 108
    if-eq v6, v5, :cond_8

    .line 109
    .line 110
    if-eqz v2, :cond_8

    .line 111
    .line 112
    if-eqz v4, :cond_7

    .line 113
    move v3, v6

    .line 114
    .line 115
    .line 116
    :cond_7
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 117
    .line 118
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 119
    goto :goto_0

    .line 120
    :cond_9
    return-void
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

.method public final E()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 5
    .line 6
    if-ge v1, v2, :cond_9

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    sget v3, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    check-cast v2, Landroid/widget/TextView;

    .line 21
    .line 22
    if-eqz v2, :cond_8

    .line 23
    .line 24
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 25
    .line 26
    if-ne v1, v3, :cond_0

    .line 27
    .line 28
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->S:I

    .line 29
    goto :goto_1

    .line 30
    .line 31
    :cond_0
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->T:I

    .line 32
    .line 33
    .line 34
    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 35
    .line 36
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->R:F

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 40
    .line 41
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->q:F

    .line 42
    float-to-int v4, v3

    .line 43
    float-to-int v3, v3

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v4, v0, v3, v0}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 47
    .line 48
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->V:Z

    .line 49
    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    .line 57
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 58
    move-result-object v3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {p0, v2}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->l(Landroid/widget/TextView;)F

    .line 69
    move-result v3

    .line 70
    .line 71
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->q:F

    .line 72
    .line 73
    const/high16 v5, 0x40000000    # 2.0f

    .line 74
    mul-float/2addr v4, v5

    .line 75
    add-float/2addr v3, v4

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v2}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->m(Landroid/widget/TextView;)I

    .line 79
    move-result v4

    .line 80
    int-to-float v4, v4

    .line 81
    add-float/2addr v3, v4

    .line 82
    float-to-int v3, v3

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 86
    .line 87
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->U:I

    .line 88
    const/4 v4, 0x1

    .line 89
    const/4 v5, 0x2

    .line 90
    .line 91
    if-ne v3, v5, :cond_2

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 95
    move-result-object v3

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 99
    goto :goto_2

    .line 100
    .line 101
    :cond_2
    if-ne v3, v4, :cond_3

    .line 102
    .line 103
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->D(I)V

    .line 107
    goto :goto_2

    .line 108
    .line 109
    :cond_3
    if-nez v3, :cond_4

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 113
    move-result-object v3

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 117
    .line 118
    :cond_4
    :goto_2
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 119
    .line 120
    if-nez v3, :cond_5

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 124
    move-result-object v3

    .line 125
    .line 126
    instance-of v3, v3, Landroid/widget/RelativeLayout;

    .line 127
    .line 128
    if-eqz v3, :cond_5

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 132
    move-result-object v3

    .line 133
    .line 134
    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 135
    .line 136
    const/16 v4, 0xd

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 140
    .line 141
    const/16 v4, 0xc

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 145
    .line 146
    const/16 v4, 0xe

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Landroid/view/View;->getPaddingStart()I

    .line 156
    move-result v3

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Landroid/view/View;->getPaddingEnd()I

    .line 160
    move-result v4

    .line 161
    .line 162
    const/high16 v6, 0x41300000    # 11.0f

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v6}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 166
    move-result v6

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v3, v0, v4, v6}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 170
    .line 171
    :cond_5
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 172
    .line 173
    if-ne v3, v5, :cond_8

    .line 174
    .line 175
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u:I

    .line 176
    .line 177
    if-lez v3, :cond_8

    .line 178
    .line 179
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->q:F

    .line 180
    float-to-int v4, v3

    .line 181
    .line 182
    iget v6, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E:F

    .line 183
    float-to-int v7, v6

    .line 184
    div-int/2addr v7, v5

    .line 185
    float-to-int v3, v3

    .line 186
    float-to-int v6, v6

    .line 187
    div-int/2addr v6, v5

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v4, v7, v3, v6}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 191
    .line 192
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->x:Z

    .line 193
    .line 194
    if-eqz v3, :cond_6

    .line 195
    .line 196
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u:I

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 200
    goto :goto_4

    .line 201
    .line 202
    :cond_6
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 203
    .line 204
    if-ne v1, v3, :cond_7

    .line 205
    .line 206
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->v:I

    .line 207
    goto :goto_3

    .line 208
    .line 209
    :cond_7
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u:I

    .line 210
    .line 211
    .line 212
    :goto_3
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 213
    .line 214
    :goto_4
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->w:F

    .line 215
    const/4 v4, 0x0

    .line 216
    .line 217
    cmpl-float v3, v3, v4

    .line 218
    .line 219
    if-lez v3, :cond_8

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 223
    move-result-object v3

    .line 224
    .line 225
    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 226
    .line 227
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->w:F

    .line 228
    float-to-int v4, v4

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 235
    .line 236
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    :cond_9
    return-void
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
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
.end method

.method public final F(Landroid/widget/TextView;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    instance-of v0, p1, Landroid/widget/RelativeLayout;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 17
    .line 18
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 19
    const/4 v1, -0x2

    .line 20
    const/4 v2, -0x1

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    :cond_0
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final G(Landroid/view/View;)V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Landroid/widget/TextView;

    .line 9
    .line 10
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->j0:I

    .line 11
    const/4 v1, -0x1

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 17
    .line 18
    :cond_0
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k0:I

    .line 19
    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    const/16 v0, 0x11

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 26
    .line 27
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k0:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 31
    :cond_1
    return-void
    .line 32
.end method

.method public final g(ILjava/lang/CharSequence;Landroid/view/View;)V
    .locals 3

    .line 1
    .line 2
    sget v0, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroid/widget/TextView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    :cond_0
    new-instance p2, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;

    .line 18
    .line 19
    .line 20
    invoke-direct {p2, p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$a;-><init>(Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    .line 25
    iget-boolean p2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->r:Z

    .line 26
    const/4 v0, -0x1

    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 31
    const/4 v1, 0x0

    .line 32
    .line 33
    const/high16 v2, 0x3f800000    # 1.0f

    .line 34
    .line 35
    .line 36
    invoke-direct {p2, v1, v0, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_1
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 40
    const/4 v1, -0x2

    .line 41
    .line 42
    .line 43
    invoke-direct {p2, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 44
    .line 45
    :goto_0
    iget v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s:F

    .line 46
    const/4 v2, 0x0

    .line 47
    .line 48
    cmpl-float v1, v1, v2

    .line 49
    .line 50
    if-lez v1, :cond_2

    .line 51
    .line 52
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 53
    .line 54
    iget v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s:F

    .line 55
    float-to-int v1, v1

    .line 56
    .line 57
    .line 58
    invoke-direct {p2, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 59
    .line 60
    :cond_2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p3, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 64
    return-void
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
.end method

.method public getCurrentTab()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 3
    return v0
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
.end method

.method public getDividerColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->O:I

    .line 3
    return v0
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
.end method

.method public getDividerPadding()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->Q:F

    .line 3
    return v0
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
.end method

.method public getDividerWidth()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->P:F

    .line 3
    return v0
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
.end method

.method public getIndicatorColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->t:I

    .line 3
    return v0
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
.end method

.method public getIndicatorCornerRadius()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->C:F

    .line 3
    return v0
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
.end method

.method public getIndicatorHeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->A:F

    .line 3
    return v0
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
.end method

.method public getIndicatorMarginBottom()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->G:F

    .line 3
    return v0
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
.end method

.method public getIndicatorMarginLeft()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->D:F

    .line 3
    return v0
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
.end method

.method public getIndicatorMarginRight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->F:F

    .line 3
    return v0
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
.end method

.method public getIndicatorMarginTop()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E:F

    .line 3
    return v0
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
.end method

.method public getIndicatorStyle()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 3
    return v0
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
.end method

.method public getIndicatorWidth()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->B:F

    .line 3
    return v0
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
.end method

.method public getTabCount()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 3
    return v0
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
.end method

.method public getTabPadding()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->q:F

    .line 3
    return v0
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
.end method

.method public getTabWidth()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s:F

    .line 3
    return v0
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
.end method

.method public getTextBold()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->U:I

    .line 3
    return v0
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
.end method

.method public getTextSelectColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->S:I

    .line 3
    return v0
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
.end method

.method public getTextUnselectColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->T:I

    .line 3
    return v0
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
.end method

.method public getTextsize()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->R:F

    .line 3
    return v0
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
.end method

.method public getUnderlineColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->K:I

    .line 3
    return v0
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
.end method

.method public getUnderlineHeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->L:F

    .line 3
    return v0
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
.end method

.method public final h()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g0:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_1
    :try_start_0
    const-class v0, Landroidx/viewpager/widget/ViewPager;

    .line 13
    .line 14
    const-string v1, "mScroller"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    new-instance v1, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$b;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f0:Landroid/view/animation/Interpolator;

    .line 33
    .line 34
    iget-wide v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e0:J

    .line 35
    long-to-int v4, v4

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v2, v3, v4}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout$b;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;I)V

    .line 39
    .line 40
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :catchall_0
    :goto_0
    return-void
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
.end method

.method public final i()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    iget v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_7

    .line 11
    .line 12
    iget v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->B:F

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    cmpg-float v1, v1, v2

    .line 16
    .line 17
    if-gez v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_0
    sget v1, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    check-cast v3, Landroid/widget/TextView;

    .line 28
    .line 29
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 30
    .line 31
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->R:F

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o(Landroid/widget/TextView;)F

    .line 38
    move-result v4

    .line 39
    .line 40
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->B:F

    .line 41
    sub-float/2addr v4, v5

    .line 42
    .line 43
    const/high16 v5, 0x40000000    # 2.0f

    .line 44
    div-float/2addr v4, v5

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s()Z

    .line 48
    move-result v6

    .line 49
    const/4 v7, 0x0

    .line 50
    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->n(Landroid/widget/TextView;)I

    .line 55
    move-result v6

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v6, v7

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 61
    move-result v0

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/view/View;->getPaddingStart()I

    .line 65
    move-result v3

    .line 66
    add-int/2addr v0, v3

    .line 67
    add-int/2addr v0, v6

    .line 68
    int-to-float v0, v0

    .line 69
    .line 70
    cmpl-float v3, v4, v2

    .line 71
    .line 72
    if-lez v3, :cond_2

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move v4, v2

    .line 75
    :goto_1
    add-float/2addr v0, v4

    .line 76
    .line 77
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 78
    .line 79
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 80
    .line 81
    add-int/lit8 v4, v4, -0x1

    .line 82
    .line 83
    if-ge v3, v4, :cond_6

    .line 84
    .line 85
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 86
    .line 87
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    check-cast v1, Landroid/widget/TextView;

    .line 98
    .line 99
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 100
    .line 101
    iget v6, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->R:F

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o(Landroid/widget/TextView;)F

    .line 108
    move-result v4

    .line 109
    .line 110
    iget v6, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->B:F

    .line 111
    sub-float/2addr v4, v6

    .line 112
    div-float/2addr v4, v5

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s()Z

    .line 116
    move-result v5

    .line 117
    .line 118
    if-eqz v5, :cond_3

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->n(Landroid/widget/TextView;)I

    .line 122
    move-result v7

    .line 123
    .line 124
    .line 125
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 126
    move-result v3

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Landroid/view/View;->getPaddingStart()I

    .line 130
    move-result v1

    .line 131
    add-int/2addr v3, v1

    .line 132
    add-int/2addr v3, v7

    .line 133
    int-to-float v1, v3

    .line 134
    .line 135
    cmpl-float v3, v4, v2

    .line 136
    .line 137
    if-lez v3, :cond_4

    .line 138
    move v2, v4

    .line 139
    :cond_4
    add-float/2addr v1, v2

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s()Z

    .line 143
    move-result v2

    .line 144
    .line 145
    if-eqz v2, :cond_5

    .line 146
    .line 147
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g:F

    .line 148
    .line 149
    sub-float v1, v0, v1

    .line 150
    mul-float/2addr v2, v1

    .line 151
    sub-float/2addr v0, v2

    .line 152
    goto :goto_2

    .line 153
    .line 154
    :cond_5
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g:F

    .line 155
    sub-float/2addr v1, v0

    .line 156
    mul-float/2addr v2, v1

    .line 157
    add-float/2addr v0, v2

    .line 158
    .line 159
    :cond_6
    :goto_2
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 160
    float-to-int v0, v0

    .line 161
    .line 162
    iput v0, v1, Landroid/graphics/Rect;->left:I

    .line 163
    int-to-float v0, v0

    .line 164
    .line 165
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->B:F

    .line 166
    add-float/2addr v0, v2

    .line 167
    float-to-int v0, v0

    .line 168
    .line 169
    iput v0, v1, Landroid/graphics/Rect;->right:I

    .line 170
    :cond_7
    :goto_3
    return-void
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

.method public final j()V
    .locals 9

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->J:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i()V

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    iget v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 24
    move-result v1

    .line 25
    int-to-float v1, v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 29
    move-result v2

    .line 30
    int-to-float v2, v2

    .line 31
    .line 32
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 33
    .line 34
    const/high16 v4, 0x40000000    # 2.0f

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->I:Z

    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    sget v3, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    check-cast v3, Landroid/widget/TextView;

    .line 49
    .line 50
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 51
    .line 52
    iget v6, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->R:F

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 56
    .line 57
    sub-float v5, v2, v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o(Landroid/widget/TextView;)F

    .line 61
    move-result v6

    .line 62
    sub-float/2addr v5, v6

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->m(Landroid/widget/TextView;)I

    .line 66
    move-result v3

    .line 67
    int-to-float v3, v3

    .line 68
    sub-float/2addr v5, v3

    .line 69
    div-float/2addr v5, v4

    .line 70
    .line 71
    iput v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c0:F

    .line 72
    .line 73
    :cond_2
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 74
    .line 75
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 76
    .line 77
    add-int/lit8 v5, v5, -0x1

    .line 78
    .line 79
    if-ge v3, v5, :cond_3

    .line 80
    .line 81
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 82
    .line 83
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 87
    move-result-object v3

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 91
    move-result v5

    .line 92
    int-to-float v5, v5

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 96
    move-result v6

    .line 97
    int-to-float v6, v6

    .line 98
    .line 99
    iget v7, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g:F

    .line 100
    .line 101
    sub-float v8, v5, v1

    .line 102
    mul-float/2addr v8, v7

    .line 103
    add-float/2addr v1, v8

    .line 104
    .line 105
    sub-float v8, v6, v2

    .line 106
    mul-float/2addr v7, v8

    .line 107
    add-float/2addr v2, v7

    .line 108
    .line 109
    iget v7, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 110
    .line 111
    if-nez v7, :cond_3

    .line 112
    .line 113
    iget-boolean v7, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->I:Z

    .line 114
    .line 115
    if-eqz v7, :cond_3

    .line 116
    .line 117
    sget v7, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    check-cast v3, Landroid/widget/TextView;

    .line 124
    .line 125
    iget-object v7, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 126
    .line 127
    iget v8, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->R:F

    .line 128
    .line 129
    .line 130
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 131
    sub-float/2addr v6, v5

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o(Landroid/widget/TextView;)F

    .line 135
    move-result v5

    .line 136
    sub-float/2addr v6, v5

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->m(Landroid/widget/TextView;)I

    .line 140
    move-result v3

    .line 141
    int-to-float v3, v3

    .line 142
    sub-float/2addr v6, v3

    .line 143
    div-float/2addr v6, v4

    .line 144
    .line 145
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c0:F

    .line 146
    .line 147
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g:F

    .line 148
    sub-float/2addr v6, v3

    .line 149
    mul-float/2addr v5, v6

    .line 150
    add-float/2addr v3, v5

    .line 151
    .line 152
    iput v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c0:F

    .line 153
    .line 154
    :cond_3
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 155
    float-to-int v5, v1

    .line 156
    .line 157
    iput v5, v3, Landroid/graphics/Rect;->left:I

    .line 158
    float-to-int v6, v2

    .line 159
    .line 160
    iput v6, v3, Landroid/graphics/Rect;->right:I

    .line 161
    .line 162
    iget v7, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 163
    .line 164
    if-nez v7, :cond_4

    .line 165
    .line 166
    iget-boolean v7, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->I:Z

    .line 167
    .line 168
    if-eqz v7, :cond_4

    .line 169
    .line 170
    iget v7, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c0:F

    .line 171
    add-float/2addr v1, v7

    .line 172
    .line 173
    const/high16 v8, 0x3f800000    # 1.0f

    .line 174
    sub-float/2addr v1, v8

    .line 175
    float-to-int v1, v1

    .line 176
    .line 177
    iput v1, v3, Landroid/graphics/Rect;->left:I

    .line 178
    sub-float/2addr v2, v7

    .line 179
    sub-float/2addr v2, v8

    .line 180
    float-to-int v1, v2

    .line 181
    .line 182
    iput v1, v3, Landroid/graphics/Rect;->right:I

    .line 183
    .line 184
    :cond_4
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->j:Landroid/graphics/Rect;

    .line 185
    .line 186
    iput v5, v1, Landroid/graphics/Rect;->left:I

    .line 187
    .line 188
    iput v6, v1, Landroid/graphics/Rect;->right:I

    .line 189
    .line 190
    iget v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->B:F

    .line 191
    const/4 v2, 0x0

    .line 192
    .line 193
    cmpl-float v1, v1, v2

    .line 194
    .line 195
    if-ltz v1, :cond_7

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 199
    move-result v1

    .line 200
    int-to-float v1, v1

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 204
    move-result v2

    .line 205
    int-to-float v2, v2

    .line 206
    .line 207
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->B:F

    .line 208
    sub-float/2addr v2, v3

    .line 209
    div-float/2addr v2, v4

    .line 210
    add-float/2addr v1, v2

    .line 211
    .line 212
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 213
    .line 214
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 215
    .line 216
    add-int/lit8 v3, v3, -0x1

    .line 217
    .line 218
    if-ge v2, v3, :cond_6

    .line 219
    .line 220
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 221
    .line 222
    add-int/lit8 v2, v2, 0x1

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 226
    move-result-object v2

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s()Z

    .line 230
    move-result v3

    .line 231
    .line 232
    if-eqz v3, :cond_5

    .line 233
    .line 234
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g:F

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 238
    move-result v0

    .line 239
    int-to-float v0, v0

    .line 240
    div-float/2addr v0, v4

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 244
    move-result v2

    .line 245
    int-to-float v2, v2

    .line 246
    div-float/2addr v2, v4

    .line 247
    add-float/2addr v0, v2

    .line 248
    mul-float/2addr v3, v0

    .line 249
    sub-float/2addr v1, v3

    .line 250
    goto :goto_0

    .line 251
    .line 252
    :cond_5
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g:F

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 256
    move-result v0

    .line 257
    int-to-float v0, v0

    .line 258
    div-float/2addr v0, v4

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 262
    move-result v2

    .line 263
    int-to-float v2, v2

    .line 264
    div-float/2addr v2, v4

    .line 265
    add-float/2addr v0, v2

    .line 266
    mul-float/2addr v3, v0

    .line 267
    add-float/2addr v1, v3

    .line 268
    .line 269
    :cond_6
    :goto_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 270
    float-to-int v1, v1

    .line 271
    .line 272
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 273
    int-to-float v1, v1

    .line 274
    .line 275
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->B:F

    .line 276
    add-float/2addr v1, v2

    .line 277
    float-to-int v1, v1

    .line 278
    .line 279
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 280
    :cond_7
    :goto_1
    return-void
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
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
.end method

.method public k(F)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->b:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 13
    mul-float/2addr p1, v0

    .line 14
    .line 15
    const/high16 v0, 0x3f000000    # 0.5f

    .line 16
    add-float/2addr p1, v0

    .line 17
    float-to-int p1, p1

    .line 18
    return p1
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

.method public final l(Landroid/widget/TextView;)F
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Paint;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 8
    .line 9
    iget v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->R:F

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u0:Landroid/graphics/Typeface;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    sget-object v1, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u0:Landroid/graphics/Typeface;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v1, 0x1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {}, Landroid/text/BidiFormatter;->getInstance()Landroid/text/BidiFormatter;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1}, Landroid/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 52
    move-result p1

    .line 53
    return p1
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
.end method

.method public final m(Landroid/widget/TextView;)I
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    aget-object v2, v0, v1

    .line 8
    const/4 v3, 0x2

    .line 9
    .line 10
    aget-object v0, v0, v3

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 16
    move-result v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v2, v1

    .line 19
    .line 20
    :goto_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 24
    move-result v0

    .line 25
    add-int/2addr v2, v0

    .line 26
    .line 27
    :cond_1
    if-lez v2, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablePadding()I

    .line 31
    move-result v1

    .line 32
    :cond_2
    add-int/2addr v2, v1

    .line 33
    return v2
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
.end method

.method public final n(Landroid/widget/TextView;)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x2

    .line 6
    .line 7
    aget-object v0, v0, v1

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    .line 18
    :goto_0
    if-lez v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablePadding()I

    .line 22
    move-result v1

    .line 23
    :cond_1
    add-int/2addr v0, v1

    .line 24
    return v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final o(Landroid/widget/TextView;)F
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->l0:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->U:I

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Paint;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 17
    .line 18
    sget-object v2, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u0:Landroid/graphics/Typeface;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 24
    move-result v2

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    sget-object v1, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u0:Landroid/graphics/Typeface;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {}, Landroid/text/BidiFormatter;->getInstance()Landroid/text/BidiFormatter;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Landroid/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 55
    move-result p1

    .line 56
    return p1

    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/text/BidiFormatter;->getInstance()Landroid/text/BidiFormatter;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1}, Landroid/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 78
    move-result p1

    .line 79
    return p1
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s()Z

    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->r0:I

    .line 13
    .line 14
    add-int/lit8 v2, v0, 0x1

    .line 15
    .line 16
    iput v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->r0:I

    .line 17
    const/4 v2, 0x3

    .line 18
    .line 19
    if-ge v0, v2, :cond_1

    .line 20
    move v0, v1

    .line 21
    .line 22
    :goto_0
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 26
    move-result v2

    .line 27
    .line 28
    if-ge v0, v2, :cond_1

    .line 29
    .line 30
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    if-nez v2, :cond_0

    .line 37
    goto :goto_1

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 47
    move-result v4

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 51
    move-result v5

    .line 52
    sub-int/2addr v4, v5

    .line 53
    .line 54
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 58
    .line 59
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 60
    goto :goto_0

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 64
    move-result v0

    .line 65
    .line 66
    if-nez v0, :cond_e

    .line 67
    .line 68
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 69
    .line 70
    if-gtz v0, :cond_2

    .line 71
    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 76
    move-result v6

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 80
    move-result v7

    .line 81
    .line 82
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->P:F

    .line 83
    const/4 v8, 0x0

    .line 84
    .line 85
    cmpl-float v2, v0, v8

    .line 86
    const/4 v9, 0x1

    .line 87
    .line 88
    if-lez v2, :cond_3

    .line 89
    .line 90
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->m:Landroid/graphics/Paint;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 94
    .line 95
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->m:Landroid/graphics/Paint;

    .line 96
    .line 97
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->O:I

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 101
    move v10, v1

    .line 102
    .line 103
    :goto_2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 104
    sub-int/2addr v0, v9

    .line 105
    .line 106
    if-ge v10, v0, :cond_3

    .line 107
    .line 108
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 116
    move-result v1

    .line 117
    add-int/2addr v1, v7

    .line 118
    int-to-float v1, v1

    .line 119
    .line 120
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->Q:F

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 124
    move-result v0

    .line 125
    add-int/2addr v0, v7

    .line 126
    int-to-float v3, v0

    .line 127
    int-to-float v0, v6

    .line 128
    .line 129
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->Q:F

    .line 130
    .line 131
    sub-float v4, v0, v4

    .line 132
    .line 133
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->m:Landroid/graphics/Paint;

    .line 134
    move-object v0, p1

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 138
    .line 139
    add-int/lit8 v10, v10, 0x1

    .line 140
    goto :goto_2

    .line 141
    .line 142
    :cond_3
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->L:F

    .line 143
    .line 144
    cmpl-float v0, v0, v8

    .line 145
    .line 146
    const/16 v10, 0x50

    .line 147
    .line 148
    if-lez v0, :cond_6

    .line 149
    .line 150
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->l:Landroid/graphics/Paint;

    .line 151
    .line 152
    iget v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->K:I

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 156
    int-to-float v0, v7

    .line 157
    .line 158
    iget-boolean v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->N:Z

    .line 159
    .line 160
    if-eqz v1, :cond_4

    .line 161
    move v1, v8

    .line 162
    goto :goto_3

    .line 163
    :cond_4
    move v1, v0

    .line 164
    .line 165
    :goto_3
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->M:I

    .line 166
    .line 167
    if-ne v0, v10, :cond_5

    .line 168
    int-to-float v4, v6

    .line 169
    .line 170
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->L:F

    .line 171
    .line 172
    sub-float v2, v4, v0

    .line 173
    .line 174
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 178
    move-result v0

    .line 179
    add-int/2addr v0, v7

    .line 180
    int-to-float v3, v0

    .line 181
    .line 182
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->l:Landroid/graphics/Paint;

    .line 183
    move-object v0, p1

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 187
    goto :goto_4

    .line 188
    .line 189
    :cond_5
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 193
    move-result v0

    .line 194
    add-int/2addr v0, v7

    .line 195
    int-to-float v3, v0

    .line 196
    .line 197
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->L:F

    .line 198
    .line 199
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->l:Landroid/graphics/Paint;

    .line 200
    const/4 v2, 0x0

    .line 201
    move-object v0, p1

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 205
    .line 206
    .line 207
    :cond_6
    :goto_4
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->j()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 211
    move-result v1

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 215
    move-result v2

    .line 216
    .line 217
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 218
    .line 219
    if-ne v3, v9, :cond_7

    .line 220
    .line 221
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->A:F

    .line 222
    .line 223
    cmpl-float v3, v3, v8

    .line 224
    .line 225
    if-lez v3, :cond_e

    .line 226
    .line 227
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->n:Landroid/graphics/Paint;

    .line 228
    .line 229
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->t:I

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 233
    .line 234
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o:Landroid/graphics/Path;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 238
    .line 239
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o:Landroid/graphics/Path;

    .line 240
    .line 241
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 242
    .line 243
    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 244
    add-int/2addr v4, v2

    .line 245
    int-to-float v4, v4

    .line 246
    int-to-float v1, v1

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3, v4, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 250
    .line 251
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o:Landroid/graphics/Path;

    .line 252
    int-to-float v4, v2

    .line 253
    .line 254
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 255
    .line 256
    iget v6, v5, Landroid/graphics/Rect;->left:I

    .line 257
    int-to-float v6, v6

    .line 258
    .line 259
    const/high16 v7, 0x40000000    # 2.0f

    .line 260
    div-float/2addr v6, v7

    .line 261
    add-float/2addr v4, v6

    .line 262
    .line 263
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 264
    int-to-float v5, v5

    .line 265
    div-float/2addr v5, v7

    .line 266
    add-float/2addr v4, v5

    .line 267
    .line 268
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->A:F

    .line 269
    .line 270
    sub-float v5, v1, v5

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 274
    .line 275
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o:Landroid/graphics/Path;

    .line 276
    .line 277
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 278
    .line 279
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 280
    add-int/2addr v2, v4

    .line 281
    int-to-float v2, v2

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 285
    .line 286
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o:Landroid/graphics/Path;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 290
    .line 291
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o:Landroid/graphics/Path;

    .line 292
    .line 293
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->n:Landroid/graphics/Paint;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 297
    return-void

    .line 298
    :cond_7
    const/4 v4, 0x2

    .line 299
    .line 300
    if-ne v3, v4, :cond_c

    .line 301
    .line 302
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->x:Z

    .line 303
    .line 304
    if-nez v3, :cond_8

    .line 305
    .line 306
    goto/16 :goto_6

    .line 307
    .line 308
    :cond_8
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 309
    .line 310
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 314
    move-result-object v3

    .line 315
    .line 316
    if-nez v3, :cond_9

    .line 317
    .line 318
    goto/16 :goto_6

    .line 319
    .line 320
    :cond_9
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->D:F

    .line 321
    float-to-int v3, v3

    .line 322
    add-int/2addr v3, v2

    .line 323
    .line 324
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 325
    .line 326
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 327
    add-int/2addr v3, v5

    .line 328
    .line 329
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 330
    add-int/2addr v2, v4

    .line 331
    .line 332
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->F:F

    .line 333
    float-to-int v4, v4

    .line 334
    sub-int/2addr v2, v4

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 338
    move-result v4

    .line 339
    .line 340
    .line 341
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 342
    move-result v5

    .line 343
    sub-int/2addr v1, v5

    .line 344
    .line 345
    if-lt v4, v1, :cond_a

    .line 346
    .line 347
    goto/16 :goto_6

    .line 348
    .line 349
    :cond_a
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->z:Landroid/graphics/drawable/Drawable;

    .line 350
    .line 351
    if-eqz v5, :cond_b

    .line 352
    .line 353
    .line 354
    invoke-virtual {v5, v3, v4, v2, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 355
    .line 356
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->z:Landroid/graphics/drawable/Drawable;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 360
    return-void

    .line 361
    .line 362
    :cond_b
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 363
    .line 364
    iget v6, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->t:I

    .line 365
    .line 366
    .line 367
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 368
    .line 369
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v5, v3, v4, v2, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 373
    .line 374
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 375
    .line 376
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->C:F

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 380
    .line 381
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 385
    return-void

    .line 386
    .line 387
    :cond_c
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->A:F

    .line 388
    .line 389
    cmpl-float v3, v3, v8

    .line 390
    .line 391
    if-lez v3, :cond_e

    .line 392
    .line 393
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 394
    .line 395
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->t:I

    .line 396
    .line 397
    .line 398
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 399
    .line 400
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->H:I

    .line 401
    .line 402
    if-ne v3, v10, :cond_d

    .line 403
    .line 404
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 405
    .line 406
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->D:F

    .line 407
    float-to-int v4, v4

    .line 408
    add-int/2addr v4, v2

    .line 409
    .line 410
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 411
    .line 412
    iget v6, v5, Landroid/graphics/Rect;->left:I

    .line 413
    add-int/2addr v4, v6

    .line 414
    .line 415
    iget v6, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->A:F

    .line 416
    float-to-int v6, v6

    .line 417
    .line 418
    sub-int v6, v1, v6

    .line 419
    .line 420
    iget v7, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->G:F

    .line 421
    float-to-int v8, v7

    .line 422
    sub-int/2addr v6, v8

    .line 423
    .line 424
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 425
    add-int/2addr v2, v5

    .line 426
    .line 427
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->F:F

    .line 428
    float-to-int v5, v5

    .line 429
    sub-int/2addr v2, v5

    .line 430
    float-to-int v5, v7

    .line 431
    sub-int/2addr v1, v5

    .line 432
    .line 433
    .line 434
    invoke-virtual {v3, v4, v6, v2, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 435
    goto :goto_5

    .line 436
    .line 437
    :cond_d
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 438
    .line 439
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->D:F

    .line 440
    float-to-int v3, v3

    .line 441
    add-int/2addr v3, v2

    .line 442
    .line 443
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 444
    .line 445
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 446
    add-int/2addr v3, v5

    .line 447
    .line 448
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E:F

    .line 449
    float-to-int v6, v5

    .line 450
    .line 451
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 452
    add-int/2addr v2, v4

    .line 453
    .line 454
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->F:F

    .line 455
    float-to-int v4, v4

    .line 456
    sub-int/2addr v2, v4

    .line 457
    .line 458
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->A:F

    .line 459
    float-to-int v4, v4

    .line 460
    float-to-int v5, v5

    .line 461
    add-int/2addr v4, v5

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1, v3, v6, v2, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 465
    .line 466
    :goto_5
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 467
    .line 468
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->C:F

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 472
    .line 473
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 477
    :cond_e
    :goto_6
    return-void
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

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p(Landroid/view/MotionEvent;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 7
    move-result p1

    .line 8
    return p1
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

.method public onPageScrollStateChanged(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    const/4 v1, 0x2

    .line 5
    .line 6
    if-ne p1, v1, :cond_0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    :cond_1
    :goto_0
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->m0:Z

    .line 11
    .line 12
    if-nez p1, :cond_2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->B()V

    .line 16
    :cond_2
    return-void
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

.method public onPageScrolled(IFI)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 3
    .line 4
    iput p2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g:F

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->w()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    return-void
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
.end method

.method public onPageSelected(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->D(I)V

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

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    .line 2
    instance-of v0, p1, Landroid/os/Bundle;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Landroid/os/Bundle;

    .line 7
    .line 8
    const-string v0, "mCurrentTab"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    move-result v0

    .line 13
    .line 14
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 15
    .line 16
    const-string v0, "instanceState"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 30
    move-result v0

    .line 31
    .line 32
    iget v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 33
    .line 34
    if-le v0, v1, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->D(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->w()V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

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
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    const-string v1, "instanceState"

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 15
    .line 16
    const-string v1, "mCurrentTab"

    .line 17
    .line 18
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 22
    return-object v0
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p(Landroid/view/MotionEvent;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 7
    move-result p1

    .line 8
    return p1
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

.method public final p(Landroid/view/MotionEvent;)V
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->n0:Z

    .line 3
    .line 4
    if-eqz v0, :cond_7

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->q()Z

    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->v(Z)V

    .line 18
    return-void

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x1

    .line 24
    .line 25
    if-eqz v0, :cond_6

    .line 26
    .line 27
    if-eq v0, v2, :cond_5

    .line 28
    const/4 v3, 0x2

    .line 29
    .line 30
    if-eq v0, v3, :cond_2

    .line 31
    const/4 p1, 0x3

    .line 32
    .line 33
    if-eq v0, p1, :cond_5

    .line 34
    goto :goto_0

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 38
    move-result v0

    .line 39
    .line 40
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p0:F

    .line 41
    sub-float/2addr v0, v3

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 45
    move-result p1

    .line 46
    .line 47
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->q0:F

    .line 48
    sub-float/2addr p1, v3

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 52
    move-result v3

    .line 53
    .line 54
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o0:I

    .line 55
    int-to-float v4, v4

    .line 56
    .line 57
    cmpl-float v3, v3, v4

    .line 58
    .line 59
    if-gtz v3, :cond_3

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 63
    move-result v3

    .line 64
    .line 65
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o0:I

    .line 66
    int-to-float v4, v4

    .line 67
    .line 68
    cmpl-float v3, v3, v4

    .line 69
    .line 70
    if-lez v3, :cond_7

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 74
    move-result v0

    .line 75
    .line 76
    .line 77
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 78
    move-result p1

    .line 79
    .line 80
    cmpl-float p1, v0, p1

    .line 81
    .line 82
    if-ltz p1, :cond_4

    .line 83
    move v1, v2

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-virtual {p0, v1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->v(Z)V

    .line 87
    return-void

    .line 88
    .line 89
    .line 90
    :cond_5
    invoke-virtual {p0, v1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->v(Z)V

    .line 91
    return-void

    .line 92
    .line 93
    .line 94
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 95
    move-result v0

    .line 96
    .line 97
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p0:F

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 101
    move-result p1

    .line 102
    .line 103
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->q0:F

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v2}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->v(Z)V

    .line 107
    :cond_7
    :goto_0
    return-void
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

.method public final q()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 5
    move-result-object v1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    return v0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 12
    move-result v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 16
    move-result v3

    .line 17
    sub-int/2addr v2, v3

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 21
    move-result v3

    .line 22
    sub-int/2addr v2, v3

    .line 23
    .line 24
    if-lez v2, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 28
    move-result v1

    .line 29
    .line 30
    if-le v1, v2, :cond_1

    .line 31
    const/4 v0, 0x1

    .line 32
    :cond_1
    return v0
    .line 33
.end method

.method public r(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 3
    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    .line 6
    add-int/lit8 p1, v0, -0x1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    sget v0, Lcom/kubi/sdk/res/R$id;->rtv_msg_tip:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    check-cast p1, Lcom/kubi/resources/widget/flyco/widget/MsgView;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 28
    :cond_1
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final s()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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
.end method

.method public setApplyCustomViewPagerScroller(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g0:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h()V

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

.method public setClickScrollDuration(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e0:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h()V

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

.method public setClickScrollInterpolator(Landroid/view/animation/Interpolator;)V
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f0:Landroid/view/animation/Interpolator;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h()V

    .line 8
    :cond_0
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

.method public setCurrentTab(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 10
    :cond_0
    return-void
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

.method public setDisallowParentInterceptWhenScrollable(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->n0:Z

    .line 3
    return-void
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

.method public setDividerColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->O:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setDividerPadding(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->Q:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    return-void
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

.method public setDividerWidth(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->P:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    return-void
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

.method public setEnableBlockSlideAnim(Z)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->x:Z

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->x:Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    :cond_0
    return-void
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

.method public setIndicatorColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->t:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setIndicatorCornerRadius(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->C:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    return-void
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

.method public setIndicatorGravity(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->H:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setIndicatorHeight(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->A:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    return-void
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

.method public setIndicatorStyle(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setIndicatorWidth(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->B:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    return-void
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

.method public setIndicatorWidthEqualTitle(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->I:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setNeedBold(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->l0:Z

    .line 3
    return-void
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

.method public setOnTabSelectListener(Lww/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s0:Lww/b;

    .line 3
    return-void
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

.method public setSnapOnTabClick(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->b0:Z

    .line 3
    return-void
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

.method public setTabMaxLine(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->j0:I

    .line 3
    return-void
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

.method public setTabMinHeight(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k0:I

    .line 3
    return-void
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

.method public setTabPadding(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->q:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E()V

    .line 11
    return-void
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

.method public setTabSpaceEqual(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->r:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E()V

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

.method public setTabWidth(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E()V

    .line 11
    return-void
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

.method public setTextAllCaps(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->V:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E()V

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

.method public setTextBold(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->U:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E()V

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

.method public setTextSelectColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->S:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E()V

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

.method public setTextUnselectColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->T:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E()V

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

.method public setTextsize(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->A(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->R:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E()V

    .line 11
    return-void
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

.method public setUnderlineColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->K:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setUnderlineGravity(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->M:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setUnderlineHeight(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->L:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    return-void
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

.method public setUnderlineIgnorePadding(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->N:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 14
    .line 15
    iget-object p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->t()V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "ViewPager or ViewPager adapter can not be NULL !"

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    throw p1
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
.end method

.method public t()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->d:Ljava/util/ArrayList;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    move-result v0

    .line 20
    .line 21
    :goto_0
    iget v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    :goto_1
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 27
    .line 28
    if-ge v2, v0, :cond_4

    .line 29
    .line 30
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->d:Ljava/util/ArrayList;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroidx/viewpager/widget/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    .line 42
    move-result-object v0

    .line 43
    goto :goto_2

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    check-cast v0, Ljava/lang/CharSequence;

    .line 50
    .line 51
    :goto_2
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0, v1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->C(Ljava/lang/CharSequence;Landroid/view/View;)V

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :cond_2
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 64
    .line 65
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 69
    .line 70
    :goto_3
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 71
    .line 72
    if-ge v2, v0, :cond_4

    .line 73
    .line 74
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->b:Landroid/content/Context;

    .line 75
    .line 76
    sget v1, Lcom/kubi/sdk/res/R$layout;->layout_tab:I

    .line 77
    const/4 v3, 0x0

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v1, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->G(Landroid/view/View;)V

    .line 85
    .line 86
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->d:Ljava/util/ArrayList;

    .line 87
    .line 88
    if-nez v1, :cond_3

    .line 89
    .line 90
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Landroidx/viewpager/widget/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    .line 98
    move-result-object v1

    .line 99
    goto :goto_4

    .line 100
    .line 101
    .line 102
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    check-cast v1, Ljava/lang/CharSequence;

    .line 106
    .line 107
    .line 108
    :goto_4
    invoke-virtual {p0, v2, v1, v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g(ILjava/lang/CharSequence;Landroid/view/View;)V

    .line 109
    .line 110
    add-int/lit8 v2, v2, 0x1

    .line 111
    goto :goto_3

    .line 112
    .line 113
    .line 114
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E()V

    .line 115
    return-void
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

.method public final u(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    :try_start_0
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_style:I

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 13
    move-result v0

    .line 14
    .line 15
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 16
    .line 17
    sget v2, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_color:I

    .line 18
    const/4 v3, 0x2

    .line 19
    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    const-string v0, "#4B6A87"

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    .line 26
    goto/16 :goto_a

    .line 27
    .line 28
    :cond_0
    const-string v0, "#ffffff"

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 32
    move-result v0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 36
    move-result v0

    .line 37
    .line 38
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->t:I

    .line 39
    .line 40
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_block_res:I

    .line 41
    const/4 v2, -0x1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 45
    move-result v0

    .line 46
    .line 47
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u:I

    .line 48
    .line 49
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_block_select_res:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 53
    move-result v0

    .line 54
    .line 55
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->v:I

    .line 56
    .line 57
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_height:I

    .line 58
    .line 59
    iget v4, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 60
    const/4 v5, 0x1

    .line 61
    .line 62
    if-ne v4, v5, :cond_1

    .line 63
    .line 64
    const/high16 v4, 0x40800000    # 4.0f

    .line 65
    goto :goto_2

    .line 66
    .line 67
    :cond_1
    if-ne v4, v3, :cond_2

    .line 68
    move v4, v2

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v4, v3

    .line 71
    :goto_1
    int-to-float v4, v4

    .line 72
    .line 73
    .line 74
    :goto_2
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 75
    move-result v4

    .line 76
    int-to-float v4, v4

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 80
    move-result v0

    .line 81
    .line 82
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->A:F

    .line 83
    .line 84
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_block_margin:I

    .line 85
    const/4 v4, 0x0

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 89
    move-result v0

    .line 90
    .line 91
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->w:F

    .line 92
    .line 93
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_width:I

    .line 94
    .line 95
    iget v6, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 96
    .line 97
    const/high16 v7, -0x40800000    # -1.0f

    .line 98
    .line 99
    if-ne v6, v5, :cond_3

    .line 100
    .line 101
    const/high16 v5, 0x41200000    # 10.0f

    .line 102
    goto :goto_3

    .line 103
    :cond_3
    move v5, v7

    .line 104
    .line 105
    .line 106
    :goto_3
    invoke-virtual {p0, v5}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 107
    move-result v5

    .line 108
    int-to-float v5, v5

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 112
    move-result v0

    .line 113
    .line 114
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->B:F

    .line 115
    .line 116
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_corner_radius:I

    .line 117
    .line 118
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 119
    .line 120
    if-ne v5, v3, :cond_4

    .line 121
    move v5, v7

    .line 122
    goto :goto_4

    .line 123
    :cond_4
    move v5, v4

    .line 124
    .line 125
    .line 126
    :goto_4
    invoke-virtual {p0, v5}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 127
    move-result v5

    .line 128
    int-to-float v5, v5

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 132
    move-result v0

    .line 133
    .line 134
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->C:F

    .line 135
    .line 136
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_margin_left:I

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 140
    move-result v5

    .line 141
    int-to-float v5, v5

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 145
    move-result v0

    .line 146
    .line 147
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->D:F

    .line 148
    .line 149
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_margin_top:I

    .line 150
    .line 151
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 152
    .line 153
    const/high16 v6, 0x40e00000    # 7.0f

    .line 154
    .line 155
    if-ne v5, v3, :cond_5

    .line 156
    move v5, v6

    .line 157
    goto :goto_5

    .line 158
    :cond_5
    move v5, v4

    .line 159
    .line 160
    .line 161
    :goto_5
    invoke-virtual {p0, v5}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 162
    move-result v5

    .line 163
    int-to-float v5, v5

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 167
    move-result v0

    .line 168
    .line 169
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->E:F

    .line 170
    .line 171
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_margin_right:I

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 175
    move-result v5

    .line 176
    int-to-float v5, v5

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 180
    move-result v0

    .line 181
    .line 182
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->F:F

    .line 183
    .line 184
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_margin_bottom:I

    .line 185
    .line 186
    iget v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->p:I

    .line 187
    .line 188
    if-ne v5, v3, :cond_6

    .line 189
    goto :goto_6

    .line 190
    :cond_6
    move v6, v4

    .line 191
    .line 192
    .line 193
    :goto_6
    invoke-virtual {p0, v6}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 194
    move-result v3

    .line 195
    int-to-float v3, v3

    .line 196
    .line 197
    .line 198
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 199
    move-result v0

    .line 200
    .line 201
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->G:F

    .line 202
    .line 203
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_gravity:I

    .line 204
    .line 205
    const/16 v3, 0x50

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 209
    move-result v0

    .line 210
    .line 211
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->H:I

    .line 212
    .line 213
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_width_equal_title:I

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 217
    move-result v0

    .line 218
    .line 219
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->I:Z

    .line 220
    .line 221
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_center_with_text:I

    .line 222
    .line 223
    .line 224
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 225
    move-result v0

    .line 226
    .line 227
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->J:Z

    .line 228
    .line 229
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_underline_color:I

    .line 230
    .line 231
    .line 232
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 233
    move-result v0

    .line 234
    .line 235
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->K:I

    .line 236
    .line 237
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_underline_height:I

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 241
    move-result v5

    .line 242
    int-to-float v5, v5

    .line 243
    .line 244
    .line 245
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 246
    move-result v0

    .line 247
    .line 248
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->L:F

    .line 249
    .line 250
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_underline_gravity:I

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 254
    move-result v0

    .line 255
    .line 256
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->M:I

    .line 257
    .line 258
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_divider_color:I

    .line 259
    .line 260
    .line 261
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 262
    move-result v0

    .line 263
    .line 264
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->O:I

    .line 265
    .line 266
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_divider_width:I

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 270
    move-result v3

    .line 271
    int-to-float v3, v3

    .line 272
    .line 273
    .line 274
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 275
    move-result v0

    .line 276
    .line 277
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->P:F

    .line 278
    .line 279
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_divider_padding:I

    .line 280
    .line 281
    const/high16 v3, 0x41400000    # 12.0f

    .line 282
    .line 283
    .line 284
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 285
    move-result v5

    .line 286
    int-to-float v5, v5

    .line 287
    .line 288
    .line 289
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 290
    move-result v0

    .line 291
    .line 292
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->Q:F

    .line 293
    .line 294
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_textsize:I

    .line 295
    .line 296
    const/high16 v5, 0x41600000    # 14.0f

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0, v5}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->A(F)I

    .line 300
    move-result v5

    .line 301
    int-to-float v5, v5

    .line 302
    .line 303
    .line 304
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 305
    move-result v0

    .line 306
    .line 307
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->R:F

    .line 308
    .line 309
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_textSelectColor:I

    .line 310
    .line 311
    .line 312
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 313
    move-result v0

    .line 314
    .line 315
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->S:I

    .line 316
    .line 317
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_textUnselectColor:I

    .line 318
    .line 319
    const-string v5, "#AAffffff"

    .line 320
    .line 321
    .line 322
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 323
    move-result v5

    .line 324
    .line 325
    .line 326
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 327
    move-result v0

    .line 328
    .line 329
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->T:I

    .line 330
    .line 331
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_textBold:I

    .line 332
    .line 333
    .line 334
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 335
    move-result v0

    .line 336
    .line 337
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->U:I

    .line 338
    .line 339
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_textAllCaps:I

    .line 340
    .line 341
    .line 342
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 343
    move-result v0

    .line 344
    .line 345
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->V:Z

    .line 346
    .line 347
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_tab_space_equal:I

    .line 348
    .line 349
    .line 350
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 351
    move-result v0

    .line 352
    .line 353
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->r:Z

    .line 354
    .line 355
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_tab_width:I

    .line 356
    .line 357
    .line 358
    invoke-virtual {p0, v7}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 359
    move-result v1

    .line 360
    int-to-float v1, v1

    .line 361
    .line 362
    .line 363
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 364
    move-result v0

    .line 365
    .line 366
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s:F

    .line 367
    .line 368
    sget v1, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_tab_padding:I

    .line 369
    .line 370
    iget-boolean v5, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->r:Z

    .line 371
    .line 372
    if-nez v5, :cond_8

    .line 373
    .line 374
    cmpl-float v0, v0, v4

    .line 375
    .line 376
    if-lez v0, :cond_7

    .line 377
    goto :goto_8

    .line 378
    .line 379
    .line 380
    :cond_7
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 381
    move-result v0

    .line 382
    :goto_7
    int-to-float v0, v0

    .line 383
    goto :goto_9

    .line 384
    .line 385
    .line 386
    :cond_8
    :goto_8
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 387
    move-result v0

    .line 388
    goto :goto_7

    .line 389
    .line 390
    .line 391
    :goto_9
    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 392
    move-result v0

    .line 393
    .line 394
    iput v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->q:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 395
    .line 396
    .line 397
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 398
    .line 399
    iget p2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->u:I

    .line 400
    .line 401
    if-eq p2, v2, :cond_9

    .line 402
    .line 403
    .line 404
    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 405
    move-result-object p2

    .line 406
    .line 407
    iput-object p2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->y:Landroid/graphics/drawable/Drawable;

    .line 408
    .line 409
    :cond_9
    iget p2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->v:I

    .line 410
    .line 411
    if-eq p2, v2, :cond_a

    .line 412
    .line 413
    .line 414
    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 415
    move-result-object p1

    .line 416
    .line 417
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->z:Landroid/graphics/drawable/Drawable;

    .line 418
    :cond_a
    return-void

    .line 419
    .line 420
    .line 421
    :goto_a
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 422
    throw p1
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

.method public final v(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    :goto_0
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
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

.method public final w()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 3
    .line 4
    if-lez v0, :cond_5

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    iget v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    goto :goto_2

    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->g:F

    .line 18
    .line 19
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 20
    .line 21
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 29
    move-result v1

    .line 30
    int-to-float v1, v1

    .line 31
    mul-float/2addr v0, v1

    .line 32
    float-to-int v0, v0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s()Z

    .line 36
    move-result v1

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 41
    .line 42
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 50
    move-result v1

    .line 51
    sub-int/2addr v1, v0

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_1
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 55
    .line 56
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 64
    move-result v1

    .line 65
    add-int/2addr v1, v0

    .line 66
    .line 67
    :goto_0
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->f:I

    .line 68
    .line 69
    if-gtz v2, :cond_2

    .line 70
    .line 71
    if-lez v0, :cond_4

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 75
    move-result v0

    .line 76
    .line 77
    div-int/lit8 v0, v0, 0x2

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 81
    move-result v2

    .line 82
    sub-int/2addr v0, v2

    .line 83
    sub-int/2addr v1, v0

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->j()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s()Z

    .line 90
    move-result v0

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->j:Landroid/graphics/Rect;

    .line 95
    .line 96
    iget v2, v0, Landroid/graphics/Rect;->right:I

    .line 97
    .line 98
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 99
    sub-int/2addr v2, v0

    .line 100
    .line 101
    div-int/lit8 v2, v2, 0x2

    .line 102
    sub-int/2addr v1, v2

    .line 103
    goto :goto_1

    .line 104
    .line 105
    :cond_3
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->j:Landroid/graphics/Rect;

    .line 106
    .line 107
    iget v2, v0, Landroid/graphics/Rect;->right:I

    .line 108
    .line 109
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 110
    sub-int/2addr v2, v0

    .line 111
    .line 112
    div-int/lit8 v2, v2, 0x2

    .line 113
    add-int/2addr v1, v2

    .line 114
    .line 115
    :cond_4
    :goto_1
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->W:I

    .line 116
    .line 117
    if-eq v1, v0, :cond_5

    .line 118
    .line 119
    iput v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->W:I

    .line 120
    const/4 v0, 0x0

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->scrollTo(II)V

    .line 124
    :cond_5
    :goto_2
    return-void
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

.method public x(IFF)V
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 3
    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    .line 6
    add-int/lit8 p1, v0, -0x1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    sget v0, Lcom/kubi/sdk/res/R$id;->rtv_msg_tip:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lcom/kubi/resources/widget/flyco/widget/MsgView;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    sget v1, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    check-cast p1, Landroid/widget/TextView;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 33
    .line 34
    iget v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->R:F

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->o(Landroid/widget/TextView;)F

    .line 41
    move-result p1

    .line 42
    .line 43
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/graphics/Paint;->descent()F

    .line 47
    move-result v1

    .line 48
    .line 49
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/graphics/Paint;->ascent()F

    .line 53
    move-result v2

    .line 54
    sub-float/2addr v1, v2

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 61
    .line 62
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->s:F

    .line 63
    const/4 v4, 0x0

    .line 64
    .line 65
    cmpl-float v4, v3, v4

    .line 66
    .line 67
    if-ltz v4, :cond_1

    .line 68
    .line 69
    const/high16 v4, 0x40000000    # 2.0f

    .line 70
    div-float/2addr v3, v4

    .line 71
    div-float/2addr p1, v4

    .line 72
    :goto_0
    add-float/2addr v3, p1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p2}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 76
    move-result p1

    .line 77
    int-to-float p1, p1

    .line 78
    add-float/2addr v3, p1

    .line 79
    float-to-int p1, v3

    .line 80
    goto :goto_1

    .line 81
    .line 82
    :cond_1
    iget v3, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->q:F

    .line 83
    goto :goto_0

    .line 84
    .line 85
    .line 86
    :goto_1
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 87
    .line 88
    iget p1, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->a0:I

    .line 89
    .line 90
    if-lez p1, :cond_2

    .line 91
    int-to-float p1, p1

    .line 92
    sub-float/2addr p1, v1

    .line 93
    float-to-int p1, p1

    .line 94
    .line 95
    div-int/lit8 p1, p1, 0x2

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p3}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->k(F)I

    .line 99
    move-result p2

    .line 100
    sub-int/2addr p1, p2

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    const/4 p1, 0x0

    .line 103
    .line 104
    :goto_2
    iput p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 108
    :cond_3
    return-void
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
.end method

.method public y(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 3
    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    .line 6
    add-int/lit8 p1, v0, -0x1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->z(II)V

    .line 11
    return-void
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

.method public z(II)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->h:I

    .line 3
    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    .line 6
    add-int/lit8 p1, v0, -0x1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/sdk/res/R$id;->rtv_msg_tip:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lcom/kubi/resources/widget/flyco/widget/MsgView;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p2}, Lxw/a;->a(Lcom/kubi/resources/widget/flyco/widget/MsgView;I)V

    .line 26
    .line 27
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i0:Landroid/util/SparseArray;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i0:Landroid/util/SparseArray;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    check-cast v0, Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    move-result v0

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    goto :goto_1

    .line 49
    .line 50
    :cond_1
    if-lez p2, :cond_2

    .line 51
    .line 52
    const/high16 p2, 0x40000000    # 2.0f

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1, p2, p2}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->x(IFF)V

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const/4 p2, 0x0

    .line 58
    .line 59
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, p2, v0}, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->x(IFF)V

    .line 63
    .line 64
    :goto_0
    iget-object p2, p0, Lcom/kubi/resources/widget/flyco/RankSlidingTabLayout;->i0:Landroid/util/SparseArray;

    .line 65
    .line 66
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 70
    :cond_3
    :goto_1
    return-void
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
.end method
