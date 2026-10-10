.class public Lcom/kubi/resources/widget/flyco/SlidingTabLayout;
.super Landroid/widget/HorizontalScrollView;
.source "SlidingTabLayout.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/flyco/SlidingTabLayout$c;,
        Lcom/kubi/resources/widget/flyco/SlidingTabLayout$b;
    }
.end annotation


# static fields
.field public static p0:Landroid/graphics/Typeface;

.field public static q0:Landroid/graphics/Typeface;


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

.field public o0:Lww/b;

.field public p:I

.field public q:F

.field public r:Z

.field public s:F

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
    invoke-direct {p0, p1, v0, v1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 5
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->j:Landroid/graphics/Rect;

    .line 6
    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 7
    new-instance p3, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l:Landroid/graphics/Paint;

    .line 8
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->m:Landroid/graphics/Paint;

    .line 9
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->n:Landroid/graphics/Paint;

    .line 10
    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o:Landroid/graphics/Path;

    const/4 p3, 0x0

    .line 11
    iput p3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

    .line 12
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->x:Z

    .line 13
    new-instance v1, Landroid/animation/ArgbEvaluator;

    invoke-direct {v1}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->d0:Landroid/animation/ArgbEvaluator;

    const-wide/16 v1, 0x12c

    .line 14
    iput-wide v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e0:J

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3e4ccccd    # 0.2f

    .line 15
    invoke-static {v3, v1, v1, v2}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v1

    iput-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f0:Landroid/view/animation/Interpolator;

    .line 16
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g0:Z

    .line 17
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 18
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i0:Landroid/util/SparseArray;

    const/4 v1, -0x1

    .line 19
    iput v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->j0:I

    .line 20
    iput v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k0:I

    .line 21
    iput-boolean p3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l0:Z

    .line 22
    iput-boolean p3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->m0:Z

    .line 23
    iput-boolean p3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->n0:Z

    .line 24
    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->setFillViewport(Z)V

    .line 25
    invoke-virtual {p0, p3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 26
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 27
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 28
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->b:Landroid/content/Context;

    .line 29
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 30
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 31
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    invoke-direct {p0, p1, p2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->x(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    const-string v0, "http://schemas.android.com/apk/res/android"

    const-string v2, "layout_height"

    invoke-interface {p2, v0, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 34
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, -0x2

    .line 35
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    const v0, 0x10100f5

    .line 36
    filled-new-array {v0}, [I

    move-result-object v0

    .line 37
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 38
    :try_start_0
    invoke-virtual {p1, p3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->a0:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 40
    throw p2
.end method

.method public static A(Landroid/graphics/Typeface;Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p0:Landroid/graphics/Typeface;

    .line 3
    .line 4
    sput-object p1, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q0:Landroid/graphics/Typeface;

    .line 5
    return-void
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
.end method

.method private J()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 5
    .line 6
    if-ge v1, v2, :cond_6

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

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
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->S:I

    .line 38
    goto :goto_3

    .line 39
    .line 40
    :cond_2
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->T:I

    .line 41
    .line 42
    .line 43
    :goto_3
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    .line 45
    sget-object v4, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p0:Landroid/graphics/Typeface;

    .line 46
    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    sget-object v4, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q0:Landroid/graphics/Typeface;

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
    sget-object v3, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q0:Landroid/graphics/Typeface;

    .line 62
    goto :goto_4

    .line 63
    .line 64
    :cond_3
    sget-object v3, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p0:Landroid/graphics/Typeface;

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
.end method

.method private K(Ljava/lang/CharSequence;Landroid/view/View;)V
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
    invoke-direct {p0, p2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->O(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->N(Landroid/widget/TextView;)V

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
.end method

.method private L(I)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 5
    .line 6
    if-ge v1, v2, :cond_9

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

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
    iget-boolean v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->m0:Z

    .line 35
    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->S:I

    .line 41
    goto :goto_3

    .line 42
    .line 43
    :cond_2
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->T:I

    .line 44
    .line 45
    .line 46
    :goto_3
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 47
    .line 48
    :cond_3
    iget-boolean v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l0:Z

    .line 49
    .line 50
    if-eqz v5, :cond_6

    .line 51
    .line 52
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->U:I

    .line 53
    .line 54
    if-ne v5, v3, :cond_6

    .line 55
    .line 56
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->m0:Z

    .line 57
    .line 58
    if-nez v3, :cond_6

    .line 59
    .line 60
    sget-object v3, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p0:Landroid/graphics/Typeface;

    .line 61
    .line 62
    if-eqz v3, :cond_5

    .line 63
    .line 64
    sget-object v3, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q0:Landroid/graphics/Typeface;

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
    sget-object v3, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q0:Landroid/graphics/Typeface;

    .line 77
    goto :goto_4

    .line 78
    .line 79
    :cond_4
    sget-object v3, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p0:Landroid/graphics/Typeface;

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
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->x:Z

    .line 93
    .line 94
    if-nez v3, :cond_8

    .line 95
    .line 96
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

    .line 97
    const/4 v5, 0x2

    .line 98
    .line 99
    if-ne v3, v5, :cond_8

    .line 100
    .line 101
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->u:I

    .line 102
    const/4 v5, -0x1

    .line 103
    .line 104
    if-eq v3, v5, :cond_8

    .line 105
    .line 106
    iget v6, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v:I

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
.end method

.method private M()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 5
    .line 6
    if-ge v1, v2, :cond_8

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

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
    if-eqz v2, :cond_7

    .line 23
    .line 24
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 25
    .line 26
    if-ne v1, v3, :cond_0

    .line 27
    .line 28
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->S:I

    .line 29
    goto :goto_1

    .line 30
    .line 31
    :cond_0
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->T:I

    .line 32
    .line 33
    .line 34
    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 35
    .line 36
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->R:F

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 40
    .line 41
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q:F

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
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->V:Z

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
    invoke-direct {p0, v2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->m(Landroid/widget/TextView;)F

    .line 69
    move-result v3

    .line 70
    .line 71
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q:F

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
    invoke-direct {p0, v2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->n(Landroid/widget/TextView;)I

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
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->U:I

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
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 104
    .line 105
    .line 106
    invoke-direct {p0, v3}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->L(I)V

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
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

    .line 119
    .line 120
    if-ne v3, v5, :cond_7

    .line 121
    .line 122
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->u:I

    .line 123
    .line 124
    if-lez v3, :cond_7

    .line 125
    .line 126
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q:F

    .line 127
    float-to-int v4, v3

    .line 128
    .line 129
    iget v6, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->E:F

    .line 130
    float-to-int v7, v6

    .line 131
    div-int/2addr v7, v5

    .line 132
    float-to-int v3, v3

    .line 133
    float-to-int v6, v6

    .line 134
    div-int/2addr v6, v5

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v4, v7, v3, v6}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 138
    .line 139
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->x:Z

    .line 140
    .line 141
    if-eqz v3, :cond_5

    .line 142
    .line 143
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->u:I

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 147
    goto :goto_4

    .line 148
    .line 149
    :cond_5
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 150
    .line 151
    if-ne v1, v3, :cond_6

    .line 152
    .line 153
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v:I

    .line 154
    goto :goto_3

    .line 155
    .line 156
    :cond_6
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->u:I

    .line 157
    .line 158
    .line 159
    :goto_3
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 160
    .line 161
    :goto_4
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->w:F

    .line 162
    const/4 v4, 0x0

    .line 163
    .line 164
    cmpl-float v3, v3, v4

    .line 165
    .line 166
    if-lez v3, :cond_7

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 170
    move-result-object v3

    .line 171
    .line 172
    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 173
    .line 174
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->w:F

    .line 175
    float-to-int v4, v4

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 182
    .line 183
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    :cond_8
    return-void
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
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
.end method

.method private N(Landroid/widget/TextView;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v()Z

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

.method private O(Landroid/view/View;)V
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
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->j0:I

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
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k0:I

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
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k0:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 31
    :cond_1
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
.end method

.method public static synthetic a(Lcom/kubi/resources/widget/flyco/SlidingTabLayout;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

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

.method public static synthetic b(Lcom/kubi/resources/widget/flyco/SlidingTabLayout;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

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

.method public static synthetic c(Lcom/kubi/resources/widget/flyco/SlidingTabLayout;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->L(I)V

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
.end method

.method public static synthetic d(Lcom/kubi/resources/widget/flyco/SlidingTabLayout;)Lww/b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o0:Lww/b;

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

.method public static synthetic e(Lcom/kubi/resources/widget/flyco/SlidingTabLayout;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

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

.method public static synthetic f(Lcom/kubi/resources/widget/flyco/SlidingTabLayout;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->b0:Z

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

.method private g(ILjava/lang/CharSequence;Landroid/view/View;)V
    .locals 4

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
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 15
    move-result v2

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v3, 0x1c

    .line 22
    .line 23
    if-lt v2, v3, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lqw/d;->a(Landroid/widget/TextView;Z)V

    .line 27
    .line 28
    :cond_0
    if-eqz p2, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    :cond_1
    new-instance p2, Lcom/kubi/resources/widget/flyco/SlidingTabLayout$a;

    .line 34
    .line 35
    .line 36
    invoke-direct {p2, p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout$a;-><init>(Lcom/kubi/resources/widget/flyco/SlidingTabLayout;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    .line 41
    iget-boolean p2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->r:Z

    .line 42
    const/4 v0, -0x1

    .line 43
    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 47
    .line 48
    const/high16 v2, 0x3f800000    # 1.0f

    .line 49
    .line 50
    .line 51
    invoke-direct {p2, v1, v0, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_2
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 55
    const/4 v1, -0x2

    .line 56
    .line 57
    .line 58
    invoke-direct {p2, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 59
    .line 60
    :goto_0
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->s:F

    .line 61
    const/4 v2, 0x0

    .line 62
    .line 63
    cmpl-float v1, v1, v2

    .line 64
    .line 65
    if-lez v1, :cond_3

    .line 66
    .line 67
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 68
    .line 69
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->s:F

    .line 70
    float-to-int v1, v1

    .line 71
    .line 72
    .line 73
    invoke-direct {p2, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 74
    .line 75
    :cond_3
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p3, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 79
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
.end method

.method private h()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g0:Z

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
    new-instance v1, Lcom/kubi/resources/widget/flyco/SlidingTabLayout$b;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f0:Landroid/view/animation/Interpolator;

    .line 33
    .line 34
    iget-wide v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e0:J

    .line 35
    long-to-int v4, v4

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v2, v3, v4}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout$b;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;I)V

    .line 39
    .line 40
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

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
.end method

.method private i()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_8

    .line 11
    .line 12
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->B:F

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
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 30
    .line 31
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->R:F

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v3}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->s(Landroid/widget/TextView;)F

    .line 38
    move-result v4

    .line 39
    .line 40
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->B:F

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
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v()Z

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
    invoke-direct {p0, v3}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o(Landroid/widget/TextView;)I

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
    .line 78
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v()Z

    .line 79
    move-result v3

    .line 80
    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p(F)F

    .line 85
    move-result v0

    .line 86
    .line 87
    :cond_3
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 88
    .line 89
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 90
    .line 91
    add-int/lit8 v4, v4, -0x1

    .line 92
    .line 93
    if-ge v3, v4, :cond_7

    .line 94
    .line 95
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 96
    .line 97
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 101
    move-result-object v3

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    check-cast v1, Landroid/widget/TextView;

    .line 108
    .line 109
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 110
    .line 111
    iget v6, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->R:F

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p0, v1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->s(Landroid/widget/TextView;)F

    .line 118
    move-result v4

    .line 119
    .line 120
    iget v6, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->B:F

    .line 121
    sub-float/2addr v4, v6

    .line 122
    div-float/2addr v4, v5

    .line 123
    .line 124
    .line 125
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v()Z

    .line 126
    move-result v5

    .line 127
    .line 128
    if-eqz v5, :cond_4

    .line 129
    .line 130
    .line 131
    invoke-direct {p0, v1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o(Landroid/widget/TextView;)I

    .line 132
    move-result v7

    .line 133
    .line 134
    .line 135
    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 136
    move-result v3

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Landroid/view/View;->getPaddingStart()I

    .line 140
    move-result v1

    .line 141
    add-int/2addr v3, v1

    .line 142
    add-int/2addr v3, v7

    .line 143
    int-to-float v1, v3

    .line 144
    .line 145
    cmpl-float v3, v4, v2

    .line 146
    .line 147
    if-lez v3, :cond_5

    .line 148
    move v2, v4

    .line 149
    :cond_5
    add-float/2addr v1, v2

    .line 150
    .line 151
    .line 152
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v()Z

    .line 153
    move-result v2

    .line 154
    .line 155
    if-eqz v2, :cond_6

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p(F)F

    .line 159
    move-result v1

    .line 160
    .line 161
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g:F

    .line 162
    .line 163
    sub-float v1, v0, v1

    .line 164
    mul-float/2addr v2, v1

    .line 165
    sub-float/2addr v0, v2

    .line 166
    goto :goto_2

    .line 167
    .line 168
    :cond_6
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g:F

    .line 169
    sub-float/2addr v1, v0

    .line 170
    mul-float/2addr v2, v1

    .line 171
    add-float/2addr v0, v2

    .line 172
    .line 173
    :cond_7
    :goto_2
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 174
    float-to-int v0, v0

    .line 175
    .line 176
    iput v0, v1, Landroid/graphics/Rect;->left:I

    .line 177
    int-to-float v0, v0

    .line 178
    .line 179
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->B:F

    .line 180
    add-float/2addr v0, v2

    .line 181
    float-to-int v0, v0

    .line 182
    .line 183
    iput v0, v1, Landroid/graphics/Rect;->right:I

    .line 184
    :cond_8
    :goto_3
    return-void
.end method

.method private j()V
    .locals 9

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->J:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i()V

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

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
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

    .line 33
    .line 34
    const/high16 v4, 0x40000000    # 2.0f

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    iget-boolean v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->I:Z

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
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 51
    .line 52
    iget v6, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->R:F

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
    invoke-direct {p0, v3}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->s(Landroid/widget/TextView;)F

    .line 61
    move-result v6

    .line 62
    sub-float/2addr v5, v6

    .line 63
    .line 64
    .line 65
    invoke-direct {p0, v3}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->n(Landroid/widget/TextView;)I

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
    iput v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c0:F

    .line 72
    .line 73
    :cond_2
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 74
    .line 75
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 76
    .line 77
    add-int/lit8 v5, v5, -0x1

    .line 78
    .line 79
    if-ge v3, v5, :cond_3

    .line 80
    .line 81
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

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
    iget v7, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g:F

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
    iget v7, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

    .line 110
    .line 111
    if-nez v7, :cond_3

    .line 112
    .line 113
    iget-boolean v7, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->I:Z

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
    iget-object v7, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 126
    .line 127
    iget v8, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->R:F

    .line 128
    .line 129
    .line 130
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 131
    sub-float/2addr v6, v5

    .line 132
    .line 133
    .line 134
    invoke-direct {p0, v3}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->s(Landroid/widget/TextView;)F

    .line 135
    move-result v5

    .line 136
    sub-float/2addr v6, v5

    .line 137
    .line 138
    .line 139
    invoke-direct {p0, v3}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->n(Landroid/widget/TextView;)I

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
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c0:F

    .line 146
    .line 147
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g:F

    .line 148
    sub-float/2addr v6, v3

    .line 149
    mul-float/2addr v5, v6

    .line 150
    add-float/2addr v3, v5

    .line 151
    .line 152
    iput v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c0:F

    .line 153
    .line 154
    :cond_3
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i:Landroid/graphics/Rect;

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
    iget v7, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

    .line 163
    .line 164
    if-nez v7, :cond_4

    .line 165
    .line 166
    iget-boolean v7, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->I:Z

    .line 167
    .line 168
    if-eqz v7, :cond_4

    .line 169
    .line 170
    iget v7, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c0:F

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
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->j:Landroid/graphics/Rect;

    .line 185
    .line 186
    iput v5, v1, Landroid/graphics/Rect;->left:I

    .line 187
    .line 188
    iput v6, v1, Landroid/graphics/Rect;->right:I

    .line 189
    .line 190
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->B:F

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
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->B:F

    .line 208
    sub-float/2addr v2, v3

    .line 209
    div-float/2addr v2, v4

    .line 210
    add-float/2addr v1, v2

    .line 211
    .line 212
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 213
    .line 214
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 215
    .line 216
    add-int/lit8 v3, v3, -0x1

    .line 217
    .line 218
    if-ge v2, v3, :cond_6

    .line 219
    .line 220
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

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
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v()Z

    .line 230
    move-result v3

    .line 231
    .line 232
    if-eqz v3, :cond_5

    .line 233
    .line 234
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g:F

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
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g:F

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
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 270
    float-to-int v1, v1

    .line 271
    .line 272
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 273
    int-to-float v1, v1

    .line 274
    .line 275
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->B:F

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
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
.end method

.method private m(Landroid/widget/TextView;)F
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Paint;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 8
    .line 9
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->R:F

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q0:Landroid/graphics/Typeface;

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
    sget-object v1, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q0:Landroid/graphics/Typeface;

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
.end method

.method private n(Landroid/widget/TextView;)I
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
.end method

.method private o(Landroid/widget/TextView;)I
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

.method private s(Landroid/widget/TextView;)F
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l0:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->U:I

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
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 17
    .line 18
    sget-object v2, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q0:Landroid/graphics/Typeface;

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
    sget-object v1, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q0:Landroid/graphics/Typeface;

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
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h0:Landroid/graphics/Paint;

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
.end method

.method private v()Z
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
.end method

.method private x(Landroid/content/Context;Landroid/util/AttributeSet;)V
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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->t:I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->u:I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v:I

    .line 56
    .line 57
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_height:I

    .line 58
    .line 59
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

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
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->A:F

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->w:F

    .line 92
    .line 93
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_width:I

    .line 94
    .line 95
    iget v6, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

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
    invoke-virtual {p0, v5}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->B:F

    .line 115
    .line 116
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_corner_radius:I

    .line 117
    .line 118
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

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
    invoke-virtual {p0, v5}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->C:F

    .line 135
    .line 136
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_margin_left:I

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->D:F

    .line 148
    .line 149
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_margin_top:I

    .line 150
    .line 151
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

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
    invoke-virtual {p0, v5}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->E:F

    .line 170
    .line 171
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_margin_right:I

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->F:F

    .line 183
    .line 184
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_indicator_margin_bottom:I

    .line 185
    .line 186
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

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
    invoke-virtual {p0, v6}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->G:F

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->H:I

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
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->I:Z

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
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->J:Z

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->K:I

    .line 236
    .line 237
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_underline_height:I

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->L:F

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M:I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->O:I

    .line 265
    .line 266
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_divider_width:I

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->P:F

    .line 278
    .line 279
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_divider_padding:I

    .line 280
    .line 281
    const/high16 v3, 0x41400000    # 12.0f

    .line 282
    .line 283
    .line 284
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->Q:F

    .line 293
    .line 294
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_textsize:I

    .line 295
    .line 296
    const/high16 v5, 0x41600000    # 14.0f

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0, v5}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->I(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->R:F

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->S:I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->T:I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->U:I

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
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->V:Z

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
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->r:Z

    .line 354
    .line 355
    sget v0, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_tab_width:I

    .line 356
    .line 357
    .line 358
    invoke-virtual {p0, v7}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->s:F

    .line 367
    .line 368
    sget v1, Lcom/kubi/sdk/res/R$styleable;->SlidingTabLayout_tl_tab_padding:I

    .line 369
    .line 370
    iget-boolean v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->r:Z

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
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    invoke-virtual {p0, v4}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 395
    .line 396
    .line 397
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 398
    .line 399
    iget p2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->u:I

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
    iput-object p2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->y:Landroid/graphics/drawable/Drawable;

    .line 408
    .line 409
    :cond_9
    iget p2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v:I

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
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->z:Landroid/graphics/drawable/Drawable;

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
.end method

.method private z()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 3
    .line 4
    if-lez v0, :cond_5

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

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
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g:F

    .line 18
    .line 19
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 20
    .line 21
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

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
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v()Z

    .line 36
    move-result v1

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 41
    .line 42
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

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
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 55
    .line 56
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

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
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

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
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->j()V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v()Z

    .line 90
    move-result v0

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->j:Landroid/graphics/Rect;

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
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->j:Landroid/graphics/Rect;

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
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->W:I

    .line 116
    .line 117
    if-eq v1, v0, :cond_5

    .line 118
    .line 119
    iput v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->W:I

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
.end method


# virtual methods
.method public B(IZ)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

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
.end method

.method public C(FFFF)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->D:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 11
    move-result p1

    .line 12
    int-to-float p1, p1

    .line 13
    .line 14
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->E:F

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p3}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 18
    move-result p1

    .line 19
    int-to-float p1, p1

    .line 20
    .line 21
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->F:F

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p4}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 25
    move-result p1

    .line 26
    int-to-float p1, p1

    .line 27
    .line 28
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->G:F

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 32
    return-void
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
.end method

.method public D(IFF)V
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 3
    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    .line 6
    add-int/lit8 p1, v0, -0x1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    goto :goto_3

    .line 16
    .line 17
    :cond_1
    sget v0, Lcom/kubi/sdk/res/R$id;->rtv_msg_tip:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Lcom/kubi/resources/widget/flyco/widget/MsgView;

    .line 24
    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    sget v1, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    check-cast p1, Landroid/widget/TextView;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 36
    .line 37
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->R:F

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->s(Landroid/widget/TextView;)F

    .line 44
    move-result p1

    .line 45
    .line 46
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/graphics/Paint;->descent()F

    .line 50
    move-result v1

    .line 51
    .line 52
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h0:Landroid/graphics/Paint;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/graphics/Paint;->ascent()F

    .line 56
    move-result v2

    .line 57
    sub-float/2addr v1, v2

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 64
    .line 65
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->s:F

    .line 66
    const/4 v4, 0x0

    .line 67
    .line 68
    cmpl-float v4, v3, v4

    .line 69
    .line 70
    if-ltz v4, :cond_2

    .line 71
    .line 72
    const/high16 v4, 0x40000000    # 2.0f

    .line 73
    div-float/2addr v3, v4

    .line 74
    div-float/2addr p1, v4

    .line 75
    :goto_0
    add-float/2addr v3, p1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 79
    move-result p1

    .line 80
    int-to-float p1, p1

    .line 81
    add-float/2addr v3, p1

    .line 82
    float-to-int p1, v3

    .line 83
    goto :goto_1

    .line 84
    .line 85
    :cond_2
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q:F

    .line 86
    goto :goto_0

    .line 87
    .line 88
    .line 89
    :goto_1
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 90
    .line 91
    iget p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->a0:I

    .line 92
    .line 93
    if-lez p1, :cond_3

    .line 94
    int-to-float p1, p1

    .line 95
    sub-float/2addr p1, v1

    .line 96
    float-to-int p1, p1

    .line 97
    .line 98
    div-int/lit8 p1, p1, 0x2

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p3}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 102
    move-result p2

    .line 103
    sub-int/2addr p1, p2

    .line 104
    goto :goto_2

    .line 105
    :cond_3
    const/4 p1, 0x0

    .line 106
    .line 107
    :goto_2
    iput p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    :cond_4
    :goto_3
    return-void
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
.end method

.method public E(Landroidx/viewpager/widget/ViewPager;[Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    array-length v0, p2

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    array-length v0, p2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 22
    move-result v1

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 27
    .line 28
    new-instance p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->d:Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 37
    .line 38
    iget-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 42
    .line 43
    iget-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->w()V

    .line 53
    return-void

    .line 54
    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "Titles length must be the same as the page count !"

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 62
    .line 63
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string p2, "Titles can not be EMPTY !"

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    throw p1

    .line 70
    .line 71
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string p2, "ViewPager or ViewPager adapter can not be NULL !"

    .line 74
    .line 75
    .line 76
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    throw p1
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
.end method

.method public F(Landroidx/viewpager/widget/ViewPager;[Ljava/lang/CharSequence;Landroidx/fragment/app/FragmentActivity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/viewpager/widget/ViewPager;",
            "[",
            "Ljava/lang/CharSequence;",
            "Landroidx/fragment/app/FragmentActivity;",
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    array-length v0, p2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 10
    .line 11
    new-instance v0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout$c;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 15
    move-result-object p3

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0, p3, p4, p2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout$c;-><init>(Lcom/kubi/resources/widget/flyco/SlidingTabLayout;Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;[Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 22
    .line 23
    iget-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 27
    .line 28
    iget-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->w()V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "Titles can not be EMPTY !"

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    throw p1

    .line 47
    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "ViewPager can not be NULL !"

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    throw p1
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
.end method

.method public G(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

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
    invoke-virtual {p0, p1, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->H(II)V

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
.end method

.method public H(II)V
    .locals 2

    .line 1
    .line 2
    if-ltz p1, :cond_5

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_1

    .line 8
    .line 9
    :cond_0
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 10
    .line 11
    if-lt p1, v1, :cond_1

    .line 12
    .line 13
    add-int/lit8 p1, v1, -0x1

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_2
    sget v1, Lcom/kubi/sdk/res/R$id;->rtv_msg_tip:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Lcom/kubi/resources/widget/flyco/widget/MsgView;

    .line 29
    .line 30
    if-eqz v0, :cond_5

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p2}, Lxw/a;->a(Lcom/kubi/resources/widget/flyco/widget/MsgView;I)V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i0:Landroid/util/SparseArray;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i0:Landroid/util/SparseArray;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    check-cast v0, Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    goto :goto_1

    .line 57
    .line 58
    :cond_3
    if-lez p2, :cond_4

    .line 59
    .line 60
    const/high16 p2, 0x40000000    # 2.0f

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1, p2, p2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->D(IFF)V

    .line 64
    goto :goto_0

    .line 65
    :cond_4
    const/4 p2, 0x0

    .line 66
    .line 67
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1, p2, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->D(IFF)V

    .line 71
    .line 72
    :goto_0
    iget-object p2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i0:Landroid/util/SparseArray;

    .line 73
    .line 74
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 78
    :cond_5
    :goto_1
    return-void
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
.end method

.method public I(F)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->b:Landroid/content/Context;

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

.method public getCurrentTab()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

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
.end method

.method public getDividerColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->O:I

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
.end method

.method public getDividerPadding()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->Q:F

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
.end method

.method public getDividerWidth()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->P:F

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
.end method

.method public getIndicatorColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->t:I

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
.end method

.method public getIndicatorCornerRadius()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->C:F

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
.end method

.method public getIndicatorHeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->A:F

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
.end method

.method public getIndicatorMarginBottom()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->G:F

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
.end method

.method public getIndicatorMarginLeft()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->D:F

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
.end method

.method public getIndicatorMarginRight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->F:F

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
.end method

.method public getIndicatorMarginTop()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->E:F

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
.end method

.method public getIndicatorStyle()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

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
.end method

.method public getIndicatorWidth()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->B:F

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
.end method

.method public getTabCount()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

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
.end method

.method public getTabPadding()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q:F

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
.end method

.method public getTabWidth()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->s:F

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
.end method

.method public getTextBold()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->U:I

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
.end method

.method public getTextSelectColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->S:I

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
.end method

.method public getTextUnselectColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->T:I

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
.end method

.method public getTextsize()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->R:F

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
.end method

.method public getUnderlineColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->K:I

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
.end method

.method public getUnderlineHeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->L:F

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
.end method

.method public k()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i0:Landroid/util/SparseArray;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

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
.end method

.method public l(F)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->b:Landroid/content/Context;

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

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->v()Z

    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    move v0, v1

    .line 12
    .line 13
    :goto_0
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    move-result v2

    .line 18
    .line 19
    if-ge v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    goto :goto_1

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 38
    move-result v4

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 42
    move-result v5

    .line 43
    sub-int/2addr v4, v5

    .line 44
    .line 45
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    .line 50
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 51
    goto :goto_0

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 55
    move-result v0

    .line 56
    .line 57
    if-nez v0, :cond_e

    .line 58
    .line 59
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 60
    .line 61
    if-gtz v0, :cond_2

    .line 62
    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 67
    move-result v6

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 71
    move-result v7

    .line 72
    .line 73
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->P:F

    .line 74
    const/4 v8, 0x0

    .line 75
    .line 76
    cmpl-float v2, v0, v8

    .line 77
    const/4 v9, 0x1

    .line 78
    .line 79
    if-lez v2, :cond_3

    .line 80
    .line 81
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->m:Landroid/graphics/Paint;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 85
    .line 86
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->m:Landroid/graphics/Paint;

    .line 87
    .line 88
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->O:I

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    move v10, v1

    .line 93
    .line 94
    :goto_2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 95
    sub-int/2addr v0, v9

    .line 96
    .line 97
    if-ge v10, v0, :cond_3

    .line 98
    .line 99
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 107
    move-result v1

    .line 108
    add-int/2addr v1, v7

    .line 109
    int-to-float v1, v1

    .line 110
    .line 111
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->Q:F

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 115
    move-result v0

    .line 116
    add-int/2addr v0, v7

    .line 117
    int-to-float v3, v0

    .line 118
    int-to-float v0, v6

    .line 119
    .line 120
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->Q:F

    .line 121
    .line 122
    sub-float v4, v0, v4

    .line 123
    .line 124
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->m:Landroid/graphics/Paint;

    .line 125
    move-object v0, p1

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 129
    .line 130
    add-int/lit8 v10, v10, 0x1

    .line 131
    goto :goto_2

    .line 132
    .line 133
    :cond_3
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->L:F

    .line 134
    .line 135
    cmpl-float v0, v0, v8

    .line 136
    .line 137
    const/16 v10, 0x50

    .line 138
    .line 139
    if-lez v0, :cond_6

    .line 140
    .line 141
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l:Landroid/graphics/Paint;

    .line 142
    .line 143
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->K:I

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 147
    int-to-float v0, v7

    .line 148
    .line 149
    iget-boolean v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->N:Z

    .line 150
    .line 151
    if-eqz v1, :cond_4

    .line 152
    move v1, v8

    .line 153
    goto :goto_3

    .line 154
    :cond_4
    move v1, v0

    .line 155
    .line 156
    :goto_3
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M:I

    .line 157
    .line 158
    if-ne v0, v10, :cond_5

    .line 159
    int-to-float v4, v6

    .line 160
    .line 161
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->L:F

    .line 162
    .line 163
    sub-float v2, v4, v0

    .line 164
    .line 165
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 169
    move-result v0

    .line 170
    add-int/2addr v0, v7

    .line 171
    int-to-float v3, v0

    .line 172
    .line 173
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l:Landroid/graphics/Paint;

    .line 174
    move-object v0, p1

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 178
    goto :goto_4

    .line 179
    .line 180
    :cond_5
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 184
    move-result v0

    .line 185
    add-int/2addr v0, v7

    .line 186
    int-to-float v3, v0

    .line 187
    .line 188
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->L:F

    .line 189
    .line 190
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l:Landroid/graphics/Paint;

    .line 191
    const/4 v2, 0x0

    .line 192
    move-object v0, p1

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 196
    .line 197
    .line 198
    :cond_6
    :goto_4
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->j()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 202
    move-result v1

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 206
    move-result v2

    .line 207
    .line 208
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

    .line 209
    .line 210
    if-ne v3, v9, :cond_7

    .line 211
    .line 212
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->A:F

    .line 213
    .line 214
    cmpl-float v3, v3, v8

    .line 215
    .line 216
    if-lez v3, :cond_e

    .line 217
    .line 218
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->n:Landroid/graphics/Paint;

    .line 219
    .line 220
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->t:I

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 224
    .line 225
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o:Landroid/graphics/Path;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 229
    .line 230
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o:Landroid/graphics/Path;

    .line 231
    .line 232
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 233
    .line 234
    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 235
    add-int/2addr v4, v2

    .line 236
    int-to-float v4, v4

    .line 237
    int-to-float v1, v1

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3, v4, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 241
    .line 242
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o:Landroid/graphics/Path;

    .line 243
    int-to-float v4, v2

    .line 244
    .line 245
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 246
    .line 247
    iget v6, v5, Landroid/graphics/Rect;->left:I

    .line 248
    int-to-float v6, v6

    .line 249
    .line 250
    const/high16 v7, 0x40000000    # 2.0f

    .line 251
    div-float/2addr v6, v7

    .line 252
    add-float/2addr v4, v6

    .line 253
    .line 254
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 255
    int-to-float v5, v5

    .line 256
    div-float/2addr v5, v7

    .line 257
    add-float/2addr v4, v5

    .line 258
    .line 259
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->A:F

    .line 260
    .line 261
    sub-float v5, v1, v5

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 265
    .line 266
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o:Landroid/graphics/Path;

    .line 267
    .line 268
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 269
    .line 270
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 271
    add-int/2addr v2, v4

    .line 272
    int-to-float v2, v2

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 276
    .line 277
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o:Landroid/graphics/Path;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 281
    .line 282
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o:Landroid/graphics/Path;

    .line 283
    .line 284
    iget-object v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->n:Landroid/graphics/Paint;

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 288
    return-void

    .line 289
    :cond_7
    const/4 v4, 0x2

    .line 290
    .line 291
    if-ne v3, v4, :cond_c

    .line 292
    .line 293
    iget-boolean v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->x:Z

    .line 294
    .line 295
    if-nez v1, :cond_8

    .line 296
    .line 297
    goto/16 :goto_6

    .line 298
    .line 299
    :cond_8
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 300
    .line 301
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 305
    move-result-object v1

    .line 306
    .line 307
    if-nez v1, :cond_9

    .line 308
    .line 309
    goto/16 :goto_6

    .line 310
    .line 311
    :cond_9
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->D:F

    .line 312
    float-to-int v3, v3

    .line 313
    add-int/2addr v3, v2

    .line 314
    .line 315
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 316
    .line 317
    iget v6, v5, Landroid/graphics/Rect;->left:I

    .line 318
    add-int/2addr v3, v6

    .line 319
    .line 320
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 321
    add-int/2addr v2, v5

    .line 322
    .line 323
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->F:F

    .line 324
    float-to-int v5, v5

    .line 325
    sub-int/2addr v2, v5

    .line 326
    .line 327
    sget v5, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 331
    move-result-object v1

    .line 332
    .line 333
    check-cast v1, Landroid/widget/TextView;

    .line 334
    .line 335
    new-array v5, v4, [I

    .line 336
    .line 337
    new-array v4, v4, [I

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0, v5}, Landroid/view/View;->getLocationInWindow([I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1, v4}, Landroid/view/View;->getLocationInWindow([I)V

    .line 344
    .line 345
    aget v4, v4, v9

    .line 346
    .line 347
    aget v5, v5, v9

    .line 348
    sub-int/2addr v4, v5

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 352
    move-result v1

    .line 353
    add-int/2addr v1, v4

    .line 354
    .line 355
    if-lt v4, v1, :cond_a

    .line 356
    .line 357
    goto/16 :goto_6

    .line 358
    .line 359
    :cond_a
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->z:Landroid/graphics/drawable/Drawable;

    .line 360
    .line 361
    if-eqz v5, :cond_b

    .line 362
    .line 363
    .line 364
    invoke-virtual {v5, v3, v4, v2, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 365
    .line 366
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->z:Landroid/graphics/drawable/Drawable;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 370
    return-void

    .line 371
    .line 372
    :cond_b
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 373
    .line 374
    iget v6, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->t:I

    .line 375
    .line 376
    .line 377
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 378
    .line 379
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5, v3, v4, v2, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 383
    .line 384
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 385
    .line 386
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->C:F

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 390
    .line 391
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 395
    return-void

    .line 396
    .line 397
    :cond_c
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->A:F

    .line 398
    .line 399
    cmpl-float v3, v3, v8

    .line 400
    .line 401
    if-lez v3, :cond_e

    .line 402
    .line 403
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 404
    .line 405
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->t:I

    .line 406
    .line 407
    .line 408
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 409
    .line 410
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->H:I

    .line 411
    .line 412
    if-ne v3, v10, :cond_d

    .line 413
    .line 414
    iget-object v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 415
    .line 416
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->D:F

    .line 417
    float-to-int v4, v4

    .line 418
    add-int/2addr v4, v2

    .line 419
    .line 420
    iget-object v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 421
    .line 422
    iget v6, v5, Landroid/graphics/Rect;->left:I

    .line 423
    add-int/2addr v4, v6

    .line 424
    .line 425
    iget v6, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->A:F

    .line 426
    float-to-int v6, v6

    .line 427
    .line 428
    sub-int v6, v1, v6

    .line 429
    .line 430
    iget v7, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->G:F

    .line 431
    float-to-int v8, v7

    .line 432
    sub-int/2addr v6, v8

    .line 433
    .line 434
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 435
    add-int/2addr v2, v5

    .line 436
    .line 437
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->F:F

    .line 438
    float-to-int v5, v5

    .line 439
    sub-int/2addr v2, v5

    .line 440
    float-to-int v5, v7

    .line 441
    sub-int/2addr v1, v5

    .line 442
    .line 443
    .line 444
    invoke-virtual {v3, v4, v6, v2, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 445
    goto :goto_5

    .line 446
    .line 447
    :cond_d
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 448
    .line 449
    iget v3, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->D:F

    .line 450
    float-to-int v3, v3

    .line 451
    add-int/2addr v3, v2

    .line 452
    .line 453
    iget-object v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->i:Landroid/graphics/Rect;

    .line 454
    .line 455
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 456
    add-int/2addr v3, v5

    .line 457
    .line 458
    iget v5, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->E:F

    .line 459
    float-to-int v6, v5

    .line 460
    .line 461
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 462
    add-int/2addr v2, v4

    .line 463
    .line 464
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->F:F

    .line 465
    float-to-int v4, v4

    .line 466
    sub-int/2addr v2, v4

    .line 467
    .line 468
    iget v4, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->A:F

    .line 469
    float-to-int v4, v4

    .line 470
    float-to-int v5, v5

    .line 471
    add-int/2addr v4, v5

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, v3, v6, v2, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 475
    .line 476
    :goto_5
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 477
    .line 478
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->C:F

    .line 479
    .line 480
    .line 481
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 482
    .line 483
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 487
    :cond_e
    :goto_6
    return-void
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
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
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
    iput-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->m0:Z

    .line 11
    .line 12
    if-nez p1, :cond_2

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->J()V

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

.method public onPageScrolled(IFI)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 3
    .line 4
    iput p2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g:F

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->z()V

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
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
.end method

.method public onPageSelected(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->L(I)V

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
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

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
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 30
    move-result v0

    .line 31
    .line 32
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 33
    .line 34
    if-le v0, v1, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->L(I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->z()V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 44
    return-void
    .line 45
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
    iget v2, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

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
.end method

.method public final p(F)F
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->n0:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    add-float/2addr p1, v0

    .line 11
    :cond_0
    return p1
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
.end method

.method public q(I)Lcom/kubi/resources/widget/flyco/widget/MsgView;
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 3
    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    .line 6
    add-int/lit8 p1, v0, -0x1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

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
    return-object p1
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

.method public r(I)Landroid/view/View;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-gt v0, p1, :cond_0

    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public setApplyCustomViewPagerScroller(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g0:Z

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h()V

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
.end method

.method public setClickScrollDuration(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e0:J

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h()V

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
.end method

.method public setClickScrollInterpolator(Landroid/view/animation/Interpolator;)V
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f0:Landroid/view/animation/Interpolator;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h()V

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

.method public setCurrentTab(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->f:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

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

.method public setDividerColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->O:I

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

.method public setDividerPadding(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->Q:F

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
.end method

.method public setDividerWidth(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->P:F

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
.end method

.method public setEnableBlockSlideAnim(Z)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->x:Z

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->x:Z

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M()V

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

.method public setIndicatorColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->t:I

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

.method public setIndicatorCornerRadius(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->C:F

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
.end method

.method public setIndicatorGravity(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->H:I

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

.method public setIndicatorHeight(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->A:F

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
.end method

.method public setIndicatorStyle(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->p:I

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

.method public setIndicatorWidth(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->B:F

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
.end method

.method public setIndicatorWidthEqualTitle(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->I:Z

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

.method public setNeedBold(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l0:Z

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

.method public setOnTabSelectListener(Lww/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o0:Lww/b;

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

.method public setPreFixVersion(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->n0:Z

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

.method public setSnapOnTabClick(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->b0:Z

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

.method public setTabMaxLine(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->j0:I

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

.method public setTabMinHeight(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->k0:I

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

.method public setTabPadding(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->q:F

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M()V

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
.end method

.method public setTabSpaceEqual(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->r:Z

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M()V

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
.end method

.method public setTabWidth(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->s:F

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M()V

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
.end method

.method public setTextAllCaps(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->V:Z

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M()V

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
.end method

.method public setTextBold(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->U:I

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M()V

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
.end method

.method public setTextSelectColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->S:I

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M()V

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
.end method

.method public setTextUnselectColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->T:I

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M()V

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
.end method

.method public setTextsize(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->I(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->R:F

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M()V

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
.end method

.method public setUnderlineColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->K:I

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

.method public setUnderlineGravity(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M:I

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

.method public setUnderlineHeight(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->l(F)I

    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->L:F

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
.end method

.method public setUnderlineIgnorePadding(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->N:Z

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
    iput-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 14
    .line 15
    iget-object p1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->w()V

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
.end method

.method public t(I)Landroid/widget/TextView;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    sget v0, Lcom/kubi/sdk/res/R$id;->tv_tab_title:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, Landroid/widget/TextView;

    .line 15
    return-object p1
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

.method public u(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 3
    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    .line 6
    add-int/lit8 p1, v0, -0x1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_1
    sget v0, Lcom/kubi/sdk/res/R$id;->rtv_msg_tip:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    check-cast p1, Lcom/kubi/resources/widget/flyco/widget/MsgView;

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    const/16 v0, 0x8

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 31
    :cond_2
    :goto_0
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
.end method

.method public w()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->d:Ljava/util/ArrayList;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

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
    iget v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    :goto_1
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 27
    .line 28
    if-ge v2, v0, :cond_4

    .line 29
    .line 30
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->d:Ljava/util/ArrayList;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

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
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v0, v1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->K(Ljava/lang/CharSequence;Landroid/view/View;)V

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :cond_2
    iput v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 64
    .line 65
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->e:Landroid/widget/LinearLayout;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 69
    .line 70
    :goto_3
    iget v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->h:I

    .line 71
    .line 72
    if-ge v2, v0, :cond_4

    .line 73
    .line 74
    iget-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->b:Landroid/content/Context;

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
    invoke-direct {p0, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->O(Landroid/view/View;)V

    .line 85
    .line 86
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->d:Ljava/util/ArrayList;

    .line 87
    .line 88
    if-nez v1, :cond_3

    .line 89
    .line 90
    iget-object v1, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->c:Landroidx/viewpager/widget/ViewPager;

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
    invoke-direct {p0, v2, v1, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->g(ILjava/lang/CharSequence;Landroid/view/View;)V

    .line 109
    .line 110
    add-int/lit8 v2, v2, 0x1

    .line 111
    goto :goto_3

    .line 112
    .line 113
    .line 114
    :cond_4
    invoke-direct {p0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->M()V

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
.end method

.method public y()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->o0:Lww/b;

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
.end method
