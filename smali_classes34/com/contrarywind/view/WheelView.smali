.class public Lcom/contrarywind/view/WheelView;
.super Landroid/view/View;
.source "WheelView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/contrarywind/view/WheelView$DividerType;,
        Lcom/contrarywind/view/WheelView$ACTION;
    }
.end annotation


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:F

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:I

.field public N:F

.field public O:J

.field public P:I

.field public Q:I

.field public R:I

.field public S:I

.field public T:F

.field public final U:F

.field public b:Lcom/contrarywind/view/WheelView$DividerType;

.field public c:Landroid/content/Context;

.field public d:Landroid/os/Handler;

.field public e:Landroid/view/GestureDetector;

.field public f:Lv2/b;

.field public g:Z

.field public h:Z

.field public i:Ljava/util/concurrent/ScheduledExecutorService;

.field public j:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public k:Landroid/graphics/Paint;

.field public l:Landroid/graphics/Paint;

.field public m:Landroid/graphics/Paint;

.field public n:Lt2/a;

.field public o:Ljava/lang/String;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:F

.field public u:Landroid/graphics/Typeface;

.field public v:I

.field public w:I

.field public x:I

.field public y:F

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/contrarywind/view/WheelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/contrarywind/view/WheelView;->g:Z

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/contrarywind/view/WheelView;->h:Z

    .line 5
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/contrarywind/view/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object v1, p0, Lcom/contrarywind/view/WheelView;->u:Landroid/graphics/Typeface;

    const v1, 0x3fcccccd    # 1.6f

    .line 7
    iput v1, p0, Lcom/contrarywind/view/WheelView;->y:F

    const/16 v1, 0xb

    .line 8
    iput v1, p0, Lcom/contrarywind/view/WheelView;->I:I

    .line 9
    iput v0, p0, Lcom/contrarywind/view/WheelView;->M:I

    const/4 v1, 0x0

    .line 10
    iput v1, p0, Lcom/contrarywind/view/WheelView;->N:F

    const-wide/16 v1, 0x0

    .line 11
    iput-wide v1, p0, Lcom/contrarywind/view/WheelView;->O:J

    const/16 v1, 0x11

    .line 12
    iput v1, p0, Lcom/contrarywind/view/WheelView;->Q:I

    .line 13
    iput v0, p0, Lcom/contrarywind/view/WheelView;->R:I

    .line 14
    iput v0, p0, Lcom/contrarywind/view/WheelView;->S:I

    const/high16 v2, 0x3f000000    # 0.5f

    .line 15
    iput v2, p0, Lcom/contrarywind/view/WheelView;->U:F

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/contrarywind/view/R$dimen;->pickerview_textsize:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, p0, Lcom/contrarywind/view/WheelView;->p:I

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 18
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v4, v2, v3

    if-gez v4, :cond_0

    const v2, 0x4019999a    # 2.4f

    .line 19
    iput v2, p0, Lcom/contrarywind/view/WheelView;->T:F

    goto :goto_0

    :cond_0
    cmpg-float v3, v3, v2

    const/high16 v4, 0x40000000    # 2.0f

    if-gtz v3, :cond_1

    cmpg-float v5, v2, v4

    if-gez v5, :cond_1

    const v2, 0x40666666    # 3.6f

    .line 20
    iput v2, p0, Lcom/contrarywind/view/WheelView;->T:F

    goto :goto_0

    :cond_1
    if-gtz v3, :cond_2

    cmpg-float v3, v2, v4

    if-gez v3, :cond_2

    const/high16 v2, 0x40900000    # 4.5f

    .line 21
    iput v2, p0, Lcom/contrarywind/view/WheelView;->T:F

    goto :goto_0

    :cond_2
    cmpg-float v3, v4, v2

    const/high16 v4, 0x40400000    # 3.0f

    if-gtz v3, :cond_3

    cmpg-float v3, v2, v4

    if-gez v3, :cond_3

    const/high16 v2, 0x40c00000    # 6.0f

    .line 22
    iput v2, p0, Lcom/contrarywind/view/WheelView;->T:F

    goto :goto_0

    :cond_3
    cmpl-float v3, v2, v4

    if-ltz v3, :cond_4

    const/high16 v3, 0x40200000    # 2.5f

    mul-float/2addr v2, v3

    .line 23
    iput v2, p0, Lcom/contrarywind/view/WheelView;->T:F

    :cond_4
    :goto_0
    if-eqz p2, :cond_5

    .line 24
    sget-object v2, Lcom/contrarywind/view/R$styleable;->pickerview:[I

    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 25
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_gravity:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/contrarywind/view/WheelView;->Q:I

    .line 26
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_textColorOut:I

    const v1, -0x575758

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/contrarywind/view/WheelView;->v:I

    .line 27
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_textColorCenter:I

    const v1, -0xd5d5d6

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/contrarywind/view/WheelView;->w:I

    .line 28
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_dividerColor:I

    const v1, -0x2a2a2b

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/contrarywind/view/WheelView;->x:I

    .line 29
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_textSize:I

    iget v1, p0, Lcom/contrarywind/view/WheelView;->p:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Lcom/contrarywind/view/WheelView;->p:I

    .line 30
    sget v0, Lcom/contrarywind/view/R$styleable;->pickerview_wheelview_lineSpacingMultiplier:I

    iget v1, p0, Lcom/contrarywind/view/WheelView;->y:F

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lcom/contrarywind/view/WheelView;->y:F

    .line 31
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 32
    :cond_5
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->i()V

    .line 33
    invoke-virtual {p0, p1}, Lcom/contrarywind/view/WheelView;->f(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Lcom/contrarywind/view/WheelView;)Lv2/b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/contrarywind/view/WheelView;->f:Lv2/b;

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
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 20
    :cond_0
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
.end method

.method public final c(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const-string p1, ""

    .line 5
    return-object p1

    .line 6
    .line 7
    :cond_0
    instance-of v0, p1, Lu2/a;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p1, Lu2/a;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Lu2/a;->getPickerViewText()Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    .line 18
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast p1, Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    const-string v1, "%02d"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    return-object p1
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
.end method

.method public final d(I)I
    .locals 1

    .line 1
    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lt2/a;->a()I

    .line 8
    move-result v0

    .line 9
    add-int/2addr p1, v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/contrarywind/view/WheelView;->d(I)I

    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lt2/a;->a()I

    .line 20
    move-result v0

    .line 21
    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    if-le p1, v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lt2/a;->a()I

    .line 30
    move-result v0

    .line 31
    sub-int/2addr p1, v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/contrarywind/view/WheelView;->d(I)I

    .line 35
    move-result p1

    .line 36
    :cond_1
    return p1
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
.end method

.method public e(Landroid/graphics/Paint;Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 7
    move-result v1

    .line 8
    .line 9
    if-lez v1, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 13
    move-result v1

    .line 14
    .line 15
    new-array v2, v1, [F

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2, v2}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    .line 19
    move p1, v0

    .line 20
    .line 21
    :goto_0
    if-ge v0, v1, :cond_0

    .line 22
    .line 23
    aget p2, v2, v0

    .line 24
    float-to-double v3, p2

    .line 25
    .line 26
    .line 27
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 28
    move-result-wide v3

    .line 29
    double-to-int p2, v3

    .line 30
    add-int/2addr p1, p2

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return p1

    .line 35
    :cond_1
    return v0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public final f(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->c:Landroid/content/Context;

    .line 3
    .line 4
    new-instance v0, Lw2/b;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p0}, Lw2/b;-><init>(Lcom/contrarywind/view/WheelView;)V

    .line 8
    .line 9
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->d:Landroid/os/Handler;

    .line 10
    .line 11
    new-instance v0, Landroid/view/GestureDetector;

    .line 12
    .line 13
    new-instance v1, Lv2/a;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, p0}, Lv2/a;-><init>(Lcom/contrarywind/view/WheelView;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->e:Landroid/view/GestureDetector;

    .line 22
    const/4 p1, 0x0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 26
    const/4 p1, 0x1

    .line 27
    .line 28
    iput-boolean p1, p0, Lcom/contrarywind/view/WheelView;->z:Z

    .line 29
    const/4 p1, 0x0

    .line 30
    .line 31
    iput p1, p0, Lcom/contrarywind/view/WheelView;->D:F

    .line 32
    const/4 p1, -0x1

    .line 33
    .line 34
    iput p1, p0, Lcom/contrarywind/view/WheelView;->E:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->g()V

    .line 38
    return-void
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
.end method

.method public final g()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 6
    .line 7
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 8
    .line 9
    iget v1, p0, Lcom/contrarywind/view/WheelView;->v:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/contrarywind/view/WheelView;->u:Landroid/graphics/Typeface;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 28
    .line 29
    iget v2, p0, Lcom/contrarywind/view/WheelView;->p:I

    .line 30
    int-to-float v2, v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 34
    .line 35
    new-instance v0, Landroid/graphics/Paint;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 39
    .line 40
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 41
    .line 42
    iget v2, p0, Lcom/contrarywind/view/WheelView;->w:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 46
    .line 47
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 51
    .line 52
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 53
    .line 54
    .line 55
    const v2, 0x3f8ccccd    # 1.1f

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 59
    .line 60
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 61
    .line 62
    iget-object v2, p0, Lcom/contrarywind/view/WheelView;->u:Landroid/graphics/Typeface;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 66
    .line 67
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 68
    .line 69
    iget v2, p0, Lcom/contrarywind/view/WheelView;->p:I

    .line 70
    int-to-float v2, v2

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 74
    .line 75
    new-instance v0, Landroid/graphics/Paint;

    .line 76
    .line 77
    .line 78
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 79
    .line 80
    iput-object v0, p0, Lcom/contrarywind/view/WheelView;->m:Landroid/graphics/Paint;

    .line 81
    .line 82
    iget v2, p0, Lcom/contrarywind/view/WheelView;->x:I

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    .line 87
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->m:Landroid/graphics/Paint;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 91
    const/4 v0, 0x0

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 95
    return-void
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
.end method

.method public final getAdapter()Lt2/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 3
    return-object v0
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

.method public final getCurrentItem()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    iget-boolean v2, p0, Lcom/contrarywind/view/WheelView;->z:Z

    .line 9
    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    iget v2, p0, Lcom/contrarywind/view/WheelView;->F:I

    .line 13
    .line 14
    if-ltz v2, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lt2/a;->a()I

    .line 18
    move-result v0

    .line 19
    .line 20
    if-lt v2, v0, :cond_2

    .line 21
    .line 22
    :cond_1
    iget v0, p0, Lcom/contrarywind/view/WheelView;->F:I

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 26
    move-result v0

    .line 27
    .line 28
    iget-object v2, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 29
    .line 30
    .line 31
    invoke-interface {v2}, Lt2/a;->a()I

    .line 32
    move-result v2

    .line 33
    sub-int/2addr v0, v2

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 37
    move-result v0

    .line 38
    .line 39
    iget-object v2, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, Lt2/a;->a()I

    .line 43
    move-result v2

    .line 44
    .line 45
    add-int/lit8 v2, v2, -0x1

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 49
    move-result v0

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 53
    move-result v0

    .line 54
    return v0

    .line 55
    .line 56
    :cond_2
    iget v0, p0, Lcom/contrarywind/view/WheelView;->F:I

    .line 57
    .line 58
    iget-object v2, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 59
    .line 60
    .line 61
    invoke-interface {v2}, Lt2/a;->a()I

    .line 62
    move-result v2

    .line 63
    .line 64
    add-int/lit8 v2, v2, -0x1

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 68
    move-result v0

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 72
    move-result v0

    .line 73
    return v0
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public getHandler()Landroid/os/Handler;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->d:Landroid/os/Handler;

    .line 3
    return-object v0
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

.method public getInitPosition()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/contrarywind/view/WheelView;->E:I

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
.end method

.method public getItemHeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/contrarywind/view/WheelView;->t:F

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
.end method

.method public getItemsCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lt2/a;->a()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getTotalScrollY()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/contrarywind/view/WheelView;->D:F

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
.end method

.method public h()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/contrarywind/view/WheelView;->z:Z

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
.end method

.method public final i()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/contrarywind/view/WheelView;->y:F

    .line 3
    .line 4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    .line 6
    cmpg-float v2, v0, v1

    .line 7
    .line 8
    if-gez v2, :cond_0

    .line 9
    .line 10
    iput v1, p0, Lcom/contrarywind/view/WheelView;->y:F

    .line 11
    return-void

    .line 12
    .line 13
    :cond_0
    const/high16 v1, 0x40800000    # 4.0f

    .line 14
    .line 15
    cmpl-float v0, v0, v1

    .line 16
    .line 17
    if-lez v0, :cond_1

    .line 18
    .line 19
    iput v1, p0, Lcom/contrarywind/view/WheelView;->y:F

    .line 20
    :cond_1
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
.end method

.method public final j()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    .line 9
    :goto_0
    iget-object v3, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 10
    .line 11
    .line 12
    invoke-interface {v3}, Lt2/a;->a()I

    .line 13
    move-result v3

    .line 14
    .line 15
    if-ge v2, v3, :cond_1

    .line 16
    .line 17
    iget-object v3, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 18
    .line 19
    .line 20
    invoke-interface {v3, v2}, Lt2/a;->getItem(I)Ljava/lang/Object;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v3}, Lcom/contrarywind/view/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    iget-object v4, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 31
    move-result v5

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v3, v1, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 38
    move-result v3

    .line 39
    .line 40
    iget v4, p0, Lcom/contrarywind/view/WheelView;->q:I

    .line 41
    .line 42
    if-le v3, v4, :cond_0

    .line 43
    .line 44
    iput v3, p0, Lcom/contrarywind/view/WheelView;->q:I

    .line 45
    .line 46
    :cond_0
    iget-object v3, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    const-string/jumbo v4, "\u661f\u671f"

    .line 50
    const/4 v5, 0x2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v4, v1, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 57
    move-result v3

    .line 58
    add-int/2addr v3, v5

    .line 59
    .line 60
    iput v3, p0, Lcom/contrarywind/view/WheelView;->r:I

    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_1
    iget v0, p0, Lcom/contrarywind/view/WheelView;->y:F

    .line 66
    .line 67
    iget v1, p0, Lcom/contrarywind/view/WheelView;->r:I

    .line 68
    int-to-float v1, v1

    .line 69
    mul-float/2addr v0, v1

    .line 70
    .line 71
    iput v0, p0, Lcom/contrarywind/view/WheelView;->t:F

    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final k(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 16
    .line 17
    iget p1, p0, Lcom/contrarywind/view/WheelView;->Q:I

    .line 18
    const/4 v1, 0x3

    .line 19
    .line 20
    if-eq p1, v1, :cond_4

    .line 21
    const/4 v1, 0x5

    .line 22
    .line 23
    if-eq p1, v1, :cond_3

    .line 24
    .line 25
    const/16 v1, 0x11

    .line 26
    .line 27
    if-eq p1, v1, :cond_0

    .line 28
    return-void

    .line 29
    .line 30
    :cond_0
    iget-boolean p1, p0, Lcom/contrarywind/view/WheelView;->g:Z

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lcom/contrarywind/view/WheelView;->o:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    const-string v1, ""

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    move-result p1

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    iget-boolean p1, p0, Lcom/contrarywind/view/WheelView;->h:Z

    .line 47
    .line 48
    if-nez p1, :cond_1

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_1
    iget p1, p0, Lcom/contrarywind/view/WheelView;->K:I

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 55
    move-result v0

    .line 56
    sub-int/2addr p1, v0

    .line 57
    int-to-double v0, p1

    .line 58
    .line 59
    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    .line 60
    mul-double/2addr v0, v2

    .line 61
    double-to-int p1, v0

    .line 62
    .line 63
    iput p1, p0, Lcom/contrarywind/view/WheelView;->R:I

    .line 64
    return-void

    .line 65
    .line 66
    :cond_2
    :goto_0
    iget p1, p0, Lcom/contrarywind/view/WheelView;->K:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 70
    move-result v0

    .line 71
    sub-int/2addr p1, v0

    .line 72
    int-to-double v0, p1

    .line 73
    .line 74
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 75
    mul-double/2addr v0, v2

    .line 76
    double-to-int p1, v0

    .line 77
    .line 78
    iput p1, p0, Lcom/contrarywind/view/WheelView;->R:I

    .line 79
    return-void

    .line 80
    .line 81
    :cond_3
    iget p1, p0, Lcom/contrarywind/view/WheelView;->K:I

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 85
    move-result v0

    .line 86
    sub-int/2addr p1, v0

    .line 87
    .line 88
    iget v0, p0, Lcom/contrarywind/view/WheelView;->T:F

    .line 89
    float-to-int v0, v0

    .line 90
    sub-int/2addr p1, v0

    .line 91
    .line 92
    iput p1, p0, Lcom/contrarywind/view/WheelView;->R:I

    .line 93
    return-void

    .line 94
    .line 95
    :cond_4
    iput v3, p0, Lcom/contrarywind/view/WheelView;->R:I

    .line 96
    return-void
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
.end method

.method public final l(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 16
    .line 17
    iget p1, p0, Lcom/contrarywind/view/WheelView;->Q:I

    .line 18
    const/4 v1, 0x3

    .line 19
    .line 20
    if-eq p1, v1, :cond_4

    .line 21
    const/4 v1, 0x5

    .line 22
    .line 23
    if-eq p1, v1, :cond_3

    .line 24
    .line 25
    const/16 v1, 0x11

    .line 26
    .line 27
    if-eq p1, v1, :cond_0

    .line 28
    return-void

    .line 29
    .line 30
    :cond_0
    iget-boolean p1, p0, Lcom/contrarywind/view/WheelView;->g:Z

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lcom/contrarywind/view/WheelView;->o:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    const-string v1, ""

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    move-result p1

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    iget-boolean p1, p0, Lcom/contrarywind/view/WheelView;->h:Z

    .line 47
    .line 48
    if-nez p1, :cond_1

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_1
    iget p1, p0, Lcom/contrarywind/view/WheelView;->K:I

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 55
    move-result v0

    .line 56
    sub-int/2addr p1, v0

    .line 57
    int-to-double v0, p1

    .line 58
    .line 59
    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    .line 60
    mul-double/2addr v0, v2

    .line 61
    double-to-int p1, v0

    .line 62
    .line 63
    iput p1, p0, Lcom/contrarywind/view/WheelView;->S:I

    .line 64
    return-void

    .line 65
    .line 66
    :cond_2
    :goto_0
    iget p1, p0, Lcom/contrarywind/view/WheelView;->K:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 70
    move-result v0

    .line 71
    sub-int/2addr p1, v0

    .line 72
    int-to-double v0, p1

    .line 73
    .line 74
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 75
    mul-double/2addr v0, v2

    .line 76
    double-to-int p1, v0

    .line 77
    .line 78
    iput p1, p0, Lcom/contrarywind/view/WheelView;->S:I

    .line 79
    return-void

    .line 80
    .line 81
    :cond_3
    iget p1, p0, Lcom/contrarywind/view/WheelView;->K:I

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 85
    move-result v0

    .line 86
    sub-int/2addr p1, v0

    .line 87
    .line 88
    iget v0, p0, Lcom/contrarywind/view/WheelView;->T:F

    .line 89
    float-to-int v0, v0

    .line 90
    sub-int/2addr p1, v0

    .line 91
    .line 92
    iput p1, p0, Lcom/contrarywind/view/WheelView;->S:I

    .line 93
    return-void

    .line 94
    .line 95
    :cond_4
    iput v3, p0, Lcom/contrarywind/view/WheelView;->S:I

    .line 96
    return-void
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
.end method

.method public final m()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->f:Lv2/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/contrarywind/view/WheelView$a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/contrarywind/view/WheelView$a;-><init>(Lcom/contrarywind/view/WheelView;)V

    .line 10
    .line 11
    const-wide/16 v1, 0xc8

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
.end method

.method public final n(Ljava/lang/String;)V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 19
    move-result v1

    .line 20
    .line 21
    iget v2, p0, Lcom/contrarywind/view/WheelView;->p:I

    .line 22
    .line 23
    :goto_0
    iget v4, p0, Lcom/contrarywind/view/WheelView;->K:I

    .line 24
    .line 25
    if-le v1, v4, :cond_0

    .line 26
    .line 27
    add-int/lit8 v2, v2, -0x1

    .line 28
    .line 29
    iget-object v1, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 30
    int-to-float v4, v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 34
    .line 35
    iget-object v1, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 39
    move-result v4

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1, v3, v4, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 46
    move-result v1

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_0
    iget-object p1, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 50
    int-to-float v0, v2

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

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
.end method

.method public final o()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->j()V

    .line 9
    .line 10
    iget v0, p0, Lcom/contrarywind/view/WheelView;->t:F

    .line 11
    .line 12
    iget v1, p0, Lcom/contrarywind/view/WheelView;->I:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    int-to-float v1, v1

    .line 16
    mul-float/2addr v0, v1

    .line 17
    float-to-int v0, v0

    .line 18
    .line 19
    mul-int/lit8 v1, v0, 0x2

    .line 20
    int-to-double v1, v1

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const-wide v3, 0x400921fb54442d18L    # Math.PI

    .line 26
    div-double/2addr v1, v3

    .line 27
    double-to-int v1, v1

    .line 28
    .line 29
    iput v1, p0, Lcom/contrarywind/view/WheelView;->J:I

    .line 30
    int-to-double v0, v0

    .line 31
    div-double/2addr v0, v3

    .line 32
    double-to-int v0, v0

    .line 33
    .line 34
    iput v0, p0, Lcom/contrarywind/view/WheelView;->L:I

    .line 35
    .line 36
    iget v0, p0, Lcom/contrarywind/view/WheelView;->P:I

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 40
    move-result v0

    .line 41
    .line 42
    iput v0, p0, Lcom/contrarywind/view/WheelView;->K:I

    .line 43
    .line 44
    iget v0, p0, Lcom/contrarywind/view/WheelView;->J:I

    .line 45
    int-to-float v1, v0

    .line 46
    .line 47
    iget v2, p0, Lcom/contrarywind/view/WheelView;->t:F

    .line 48
    sub-float/2addr v1, v2

    .line 49
    .line 50
    const/high16 v3, 0x40000000    # 2.0f

    .line 51
    div-float/2addr v1, v3

    .line 52
    .line 53
    iput v1, p0, Lcom/contrarywind/view/WheelView;->A:F

    .line 54
    int-to-float v0, v0

    .line 55
    add-float/2addr v0, v2

    .line 56
    div-float/2addr v0, v3

    .line 57
    .line 58
    iput v0, p0, Lcom/contrarywind/view/WheelView;->B:F

    .line 59
    .line 60
    iget v1, p0, Lcom/contrarywind/view/WheelView;->r:I

    .line 61
    int-to-float v1, v1

    .line 62
    sub-float/2addr v2, v1

    .line 63
    div-float/2addr v2, v3

    .line 64
    sub-float/2addr v0, v2

    .line 65
    .line 66
    iget v1, p0, Lcom/contrarywind/view/WheelView;->T:F

    .line 67
    sub-float/2addr v0, v1

    .line 68
    .line 69
    iput v0, p0, Lcom/contrarywind/view/WheelView;->C:F

    .line 70
    .line 71
    iget v0, p0, Lcom/contrarywind/view/WheelView;->E:I

    .line 72
    const/4 v1, -0x1

    .line 73
    .line 74
    if-ne v0, v1, :cond_2

    .line 75
    .line 76
    iget-boolean v0, p0, Lcom/contrarywind/view/WheelView;->z:Z

    .line 77
    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Lt2/a;->a()I

    .line 84
    move-result v0

    .line 85
    .line 86
    add-int/lit8 v0, v0, 0x1

    .line 87
    .line 88
    div-int/lit8 v0, v0, 0x2

    .line 89
    .line 90
    iput v0, p0, Lcom/contrarywind/view/WheelView;->E:I

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    const/4 v0, 0x0

    .line 93
    .line 94
    iput v0, p0, Lcom/contrarywind/view/WheelView;->E:I

    .line 95
    .line 96
    :cond_2
    :goto_0
    iget v0, p0, Lcom/contrarywind/view/WheelView;->E:I

    .line 97
    .line 98
    iput v0, p0, Lcom/contrarywind/view/WheelView;->G:I

    .line 99
    return-void
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_10

    .line 9
    .line 10
    :cond_0
    iget v1, v0, Lcom/contrarywind/view/WheelView;->E:I

    .line 11
    const/4 v7, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 15
    move-result v1

    .line 16
    .line 17
    iget-object v2, v0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 18
    .line 19
    .line 20
    invoke-interface {v2}, Lt2/a;->a()I

    .line 21
    move-result v2

    .line 22
    const/4 v8, 0x1

    .line 23
    sub-int/2addr v2, v8

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 27
    move-result v1

    .line 28
    .line 29
    iput v1, v0, Lcom/contrarywind/view/WheelView;->E:I

    .line 30
    .line 31
    iget v2, v0, Lcom/contrarywind/view/WheelView;->I:I

    .line 32
    .line 33
    new-array v9, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    iget v2, v0, Lcom/contrarywind/view/WheelView;->D:F

    .line 36
    .line 37
    iget v3, v0, Lcom/contrarywind/view/WheelView;->t:F

    .line 38
    div-float/2addr v2, v3

    .line 39
    float-to-int v2, v2

    .line 40
    .line 41
    iput v2, v0, Lcom/contrarywind/view/WheelView;->H:I

    .line 42
    .line 43
    :try_start_0
    iget-object v3, v0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 44
    .line 45
    .line 46
    invoke-interface {v3}, Lt2/a;->a()I

    .line 47
    move-result v3

    .line 48
    rem-int/2addr v2, v3

    .line 49
    add-int/2addr v1, v2

    .line 50
    .line 51
    iput v1, v0, Lcom/contrarywind/view/WheelView;->G:I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :catch_0
    const-string v1, "WheelView"

    .line 55
    .line 56
    .line 57
    const-string/jumbo v2, "\u51fa\u9519\u4e86\uff01adapter.getItemsCount() == 0\uff0c\u8054\u52a8\u6570\u636e\u4e0d\u5339\u914d"

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    :goto_0
    iget-boolean v1, v0, Lcom/contrarywind/view/WheelView;->z:Z

    .line 63
    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    iget v1, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 67
    .line 68
    if-gez v1, :cond_1

    .line 69
    .line 70
    iput v7, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 71
    .line 72
    :cond_1
    iget v1, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 73
    .line 74
    iget-object v2, v0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 75
    .line 76
    .line 77
    invoke-interface {v2}, Lt2/a;->a()I

    .line 78
    move-result v2

    .line 79
    sub-int/2addr v2, v8

    .line 80
    .line 81
    if-le v1, v2, :cond_4

    .line 82
    .line 83
    iget-object v1, v0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 84
    .line 85
    .line 86
    invoke-interface {v1}, Lt2/a;->a()I

    .line 87
    move-result v1

    .line 88
    sub-int/2addr v1, v8

    .line 89
    .line 90
    iput v1, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :cond_2
    iget v1, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 94
    .line 95
    if-gez v1, :cond_3

    .line 96
    .line 97
    iget-object v1, v0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 98
    .line 99
    .line 100
    invoke-interface {v1}, Lt2/a;->a()I

    .line 101
    move-result v1

    .line 102
    .line 103
    iget v2, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 104
    add-int/2addr v1, v2

    .line 105
    .line 106
    iput v1, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 107
    .line 108
    :cond_3
    iget v1, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 109
    .line 110
    iget-object v2, v0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 111
    .line 112
    .line 113
    invoke-interface {v2}, Lt2/a;->a()I

    .line 114
    move-result v2

    .line 115
    sub-int/2addr v2, v8

    .line 116
    .line 117
    if-le v1, v2, :cond_4

    .line 118
    .line 119
    iget v1, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 120
    .line 121
    iget-object v2, v0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 122
    .line 123
    .line 124
    invoke-interface {v2}, Lt2/a;->a()I

    .line 125
    move-result v2

    .line 126
    sub-int/2addr v1, v2

    .line 127
    .line 128
    iput v1, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 129
    .line 130
    :cond_4
    :goto_1
    iget v1, v0, Lcom/contrarywind/view/WheelView;->D:F

    .line 131
    .line 132
    iget v2, v0, Lcom/contrarywind/view/WheelView;->t:F

    .line 133
    .line 134
    rem-float v10, v1, v2

    .line 135
    move v1, v7

    .line 136
    .line 137
    :goto_2
    iget v2, v0, Lcom/contrarywind/view/WheelView;->I:I

    .line 138
    .line 139
    if-ge v1, v2, :cond_8

    .line 140
    .line 141
    iget v3, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 142
    .line 143
    div-int/lit8 v2, v2, 0x2

    .line 144
    sub-int/2addr v2, v1

    .line 145
    sub-int/2addr v3, v2

    .line 146
    .line 147
    iget-boolean v2, v0, Lcom/contrarywind/view/WheelView;->z:Z

    .line 148
    .line 149
    if-eqz v2, :cond_5

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v3}, Lcom/contrarywind/view/WheelView;->d(I)I

    .line 153
    move-result v2

    .line 154
    .line 155
    iget-object v3, v0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 156
    .line 157
    .line 158
    invoke-interface {v3, v2}, Lt2/a;->getItem(I)Ljava/lang/Object;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    aput-object v2, v9, v1

    .line 162
    goto :goto_3

    .line 163
    .line 164
    :cond_5
    const-string v2, ""

    .line 165
    .line 166
    if-gez v3, :cond_6

    .line 167
    .line 168
    aput-object v2, v9, v1

    .line 169
    goto :goto_3

    .line 170
    .line 171
    :cond_6
    iget-object v4, v0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 172
    .line 173
    .line 174
    invoke-interface {v4}, Lt2/a;->a()I

    .line 175
    move-result v4

    .line 176
    sub-int/2addr v4, v8

    .line 177
    .line 178
    if-le v3, v4, :cond_7

    .line 179
    .line 180
    aput-object v2, v9, v1

    .line 181
    goto :goto_3

    .line 182
    .line 183
    :cond_7
    iget-object v2, v0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 184
    .line 185
    .line 186
    invoke-interface {v2, v3}, Lt2/a;->getItem(I)Ljava/lang/Object;

    .line 187
    move-result-object v2

    .line 188
    .line 189
    aput-object v2, v9, v1

    .line 190
    .line 191
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 192
    goto :goto_2

    .line 193
    .line 194
    :cond_8
    iget-object v1, v0, Lcom/contrarywind/view/WheelView;->b:Lcom/contrarywind/view/WheelView$DividerType;

    .line 195
    .line 196
    sget-object v2, Lcom/contrarywind/view/WheelView$DividerType;->WRAP:Lcom/contrarywind/view/WheelView$DividerType;

    .line 197
    const/4 v11, 0x0

    .line 198
    .line 199
    if-ne v1, v2, :cond_b

    .line 200
    .line 201
    iget-object v1, v0, Lcom/contrarywind/view/WheelView;->o:Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 205
    move-result v1

    .line 206
    .line 207
    if-eqz v1, :cond_9

    .line 208
    .line 209
    iget v1, v0, Lcom/contrarywind/view/WheelView;->K:I

    .line 210
    .line 211
    iget v2, v0, Lcom/contrarywind/view/WheelView;->q:I

    .line 212
    sub-int/2addr v1, v2

    .line 213
    .line 214
    div-int/lit8 v1, v1, 0x2

    .line 215
    .line 216
    :goto_4
    add-int/lit8 v1, v1, -0xc

    .line 217
    int-to-float v1, v1

    .line 218
    goto :goto_5

    .line 219
    .line 220
    :cond_9
    iget v1, v0, Lcom/contrarywind/view/WheelView;->K:I

    .line 221
    .line 222
    iget v2, v0, Lcom/contrarywind/view/WheelView;->q:I

    .line 223
    sub-int/2addr v1, v2

    .line 224
    .line 225
    div-int/lit8 v1, v1, 0x4

    .line 226
    goto :goto_4

    .line 227
    .line 228
    :goto_5
    cmpg-float v2, v1, v11

    .line 229
    .line 230
    if-gtz v2, :cond_a

    .line 231
    .line 232
    const/high16 v1, 0x41200000    # 10.0f

    .line 233
    :cond_a
    move v2, v1

    .line 234
    .line 235
    iget v1, v0, Lcom/contrarywind/view/WheelView;->K:I

    .line 236
    int-to-float v1, v1

    .line 237
    .line 238
    sub-float v4, v1, v2

    .line 239
    .line 240
    iget v3, v0, Lcom/contrarywind/view/WheelView;->A:F

    .line 241
    .line 242
    iget-object v6, v0, Lcom/contrarywind/view/WheelView;->m:Landroid/graphics/Paint;

    .line 243
    move v5, v3

    .line 244
    .line 245
    move-object/from16 v1, p1

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 249
    .line 250
    iget v3, v0, Lcom/contrarywind/view/WheelView;->B:F

    .line 251
    .line 252
    iget-object v6, v0, Lcom/contrarywind/view/WheelView;->m:Landroid/graphics/Paint;

    .line 253
    move v5, v3

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 257
    goto :goto_6

    .line 258
    .line 259
    :cond_b
    iget v3, v0, Lcom/contrarywind/view/WheelView;->A:F

    .line 260
    .line 261
    iget v1, v0, Lcom/contrarywind/view/WheelView;->K:I

    .line 262
    int-to-float v4, v1

    .line 263
    .line 264
    iget-object v6, v0, Lcom/contrarywind/view/WheelView;->m:Landroid/graphics/Paint;

    .line 265
    const/4 v2, 0x0

    .line 266
    move v5, v3

    .line 267
    .line 268
    move-object/from16 v1, p1

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 272
    .line 273
    iget v3, v0, Lcom/contrarywind/view/WheelView;->B:F

    .line 274
    .line 275
    iget v1, v0, Lcom/contrarywind/view/WheelView;->K:I

    .line 276
    int-to-float v4, v1

    .line 277
    .line 278
    iget-object v6, v0, Lcom/contrarywind/view/WheelView;->m:Landroid/graphics/Paint;

    .line 279
    move v5, v3

    .line 280
    .line 281
    move-object/from16 v1, p1

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 285
    .line 286
    :goto_6
    iget-object v2, v0, Lcom/contrarywind/view/WheelView;->o:Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 290
    move-result v2

    .line 291
    .line 292
    if-nez v2, :cond_c

    .line 293
    .line 294
    iget-boolean v2, v0, Lcom/contrarywind/view/WheelView;->h:Z

    .line 295
    .line 296
    if-eqz v2, :cond_c

    .line 297
    .line 298
    iget v2, v0, Lcom/contrarywind/view/WheelView;->K:I

    .line 299
    .line 300
    iget-object v3, v0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 301
    .line 302
    iget-object v4, v0, Lcom/contrarywind/view/WheelView;->o:Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v3, v4}, Lcom/contrarywind/view/WheelView;->e(Landroid/graphics/Paint;Ljava/lang/String;)I

    .line 306
    move-result v3

    .line 307
    sub-int/2addr v2, v3

    .line 308
    .line 309
    iget-object v3, v0, Lcom/contrarywind/view/WheelView;->o:Ljava/lang/String;

    .line 310
    int-to-float v2, v2

    .line 311
    .line 312
    iget v4, v0, Lcom/contrarywind/view/WheelView;->T:F

    .line 313
    sub-float/2addr v2, v4

    .line 314
    .line 315
    iget v4, v0, Lcom/contrarywind/view/WheelView;->C:F

    .line 316
    .line 317
    iget-object v5, v0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 321
    :cond_c
    move v2, v7

    .line 322
    .line 323
    :goto_7
    iget v3, v0, Lcom/contrarywind/view/WheelView;->I:I

    .line 324
    .line 325
    if-ge v2, v3, :cond_16

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 329
    .line 330
    iget v3, v0, Lcom/contrarywind/view/WheelView;->t:F

    .line 331
    int-to-float v4, v2

    .line 332
    mul-float/2addr v3, v4

    .line 333
    sub-float/2addr v3, v10

    .line 334
    .line 335
    iget v4, v0, Lcom/contrarywind/view/WheelView;->L:I

    .line 336
    int-to-float v4, v4

    .line 337
    div-float/2addr v3, v4

    .line 338
    float-to-double v3, v3

    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    const-wide v5, 0x400921fb54442d18L    # Math.PI

    .line 344
    .line 345
    div-double v5, v3, v5

    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    const-wide v12, 0x4066800000000000L    # 180.0

    .line 351
    mul-double/2addr v5, v12

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    const-wide v12, 0x4056800000000000L    # 90.0

    .line 357
    sub-double/2addr v12, v5

    .line 358
    double-to-float v5, v12

    .line 359
    .line 360
    const/high16 v6, 0x42b40000    # 90.0f

    .line 361
    .line 362
    cmpl-float v12, v5, v6

    .line 363
    .line 364
    if-gez v12, :cond_d

    .line 365
    .line 366
    const/high16 v12, -0x3d4c0000    # -90.0f

    .line 367
    .line 368
    cmpg-float v12, v5, v12

    .line 369
    .line 370
    if-gtz v12, :cond_e

    .line 371
    :cond_d
    move v14, v7

    .line 372
    .line 373
    move/from16 v16, v11

    .line 374
    .line 375
    goto/16 :goto_e

    .line 376
    .line 377
    .line 378
    :cond_e
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 379
    move-result v12

    .line 380
    div-float/2addr v12, v6

    .line 381
    float-to-double v12, v12

    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    const-wide v14, 0x400199999999999aL    # 2.2

    .line 387
    .line 388
    .line 389
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 390
    move-result-wide v12

    .line 391
    double-to-float v6, v12

    .line 392
    .line 393
    iget-boolean v12, v0, Lcom/contrarywind/view/WheelView;->h:Z

    .line 394
    .line 395
    if-nez v12, :cond_f

    .line 396
    .line 397
    iget-object v12, v0, Lcom/contrarywind/view/WheelView;->o:Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 401
    move-result v12

    .line 402
    .line 403
    if-nez v12, :cond_f

    .line 404
    .line 405
    aget-object v12, v9, v2

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v12}, Lcom/contrarywind/view/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 409
    move-result-object v12

    .line 410
    .line 411
    .line 412
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 413
    move-result v12

    .line 414
    .line 415
    if-nez v12, :cond_f

    .line 416
    .line 417
    new-instance v12, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 421
    .line 422
    aget-object v13, v9, v2

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v13}, Lcom/contrarywind/view/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 426
    move-result-object v13

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    iget-object v13, v0, Lcom/contrarywind/view/WheelView;->o:Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 438
    move-result-object v12

    .line 439
    goto :goto_8

    .line 440
    .line 441
    :cond_f
    aget-object v12, v9, v2

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v12}, Lcom/contrarywind/view/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 445
    move-result-object v12

    .line 446
    .line 447
    .line 448
    :goto_8
    invoke-virtual {v0, v12}, Lcom/contrarywind/view/WheelView;->n(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, v12}, Lcom/contrarywind/view/WheelView;->k(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, v12}, Lcom/contrarywind/view/WheelView;->l(Ljava/lang/String;)V

    .line 455
    .line 456
    iget v13, v0, Lcom/contrarywind/view/WheelView;->L:I

    .line 457
    int-to-double v13, v13

    .line 458
    .line 459
    .line 460
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 461
    move-result-wide v15

    .line 462
    .line 463
    iget v8, v0, Lcom/contrarywind/view/WheelView;->L:I

    .line 464
    int-to-double v7, v8

    .line 465
    mul-double/2addr v15, v7

    .line 466
    sub-double/2addr v13, v15

    .line 467
    .line 468
    .line 469
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 470
    move-result-wide v7

    .line 471
    .line 472
    iget v15, v0, Lcom/contrarywind/view/WheelView;->r:I

    .line 473
    .line 474
    move-object/from16 v17, v12

    .line 475
    int-to-double v11, v15

    .line 476
    mul-double/2addr v7, v11

    .line 477
    .line 478
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 479
    div-double/2addr v7, v11

    .line 480
    sub-double/2addr v13, v7

    .line 481
    double-to-float v7, v13

    .line 482
    const/4 v8, 0x0

    .line 483
    .line 484
    .line 485
    invoke-virtual {v1, v8, v7}, Landroid/graphics/Canvas;->translate(FF)V

    .line 486
    .line 487
    iget v8, v0, Lcom/contrarywind/view/WheelView;->A:F

    .line 488
    .line 489
    cmpg-float v11, v7, v8

    .line 490
    .line 491
    .line 492
    const v12, 0x3f4ccccd    # 0.8f

    .line 493
    .line 494
    const/high16 v13, 0x3f800000    # 1.0f

    .line 495
    .line 496
    if-gtz v11, :cond_10

    .line 497
    .line 498
    iget v11, v0, Lcom/contrarywind/view/WheelView;->r:I

    .line 499
    int-to-float v11, v11

    .line 500
    add-float/2addr v11, v7

    .line 501
    .line 502
    cmpl-float v11, v11, v8

    .line 503
    .line 504
    if-ltz v11, :cond_10

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 508
    .line 509
    iget v5, v0, Lcom/contrarywind/view/WheelView;->K:I

    .line 510
    int-to-float v5, v5

    .line 511
    .line 512
    iget v6, v0, Lcom/contrarywind/view/WheelView;->A:F

    .line 513
    sub-float/2addr v6, v7

    .line 514
    const/4 v8, 0x0

    .line 515
    .line 516
    .line 517
    invoke-virtual {v1, v8, v8, v5, v6}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 518
    .line 519
    .line 520
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 521
    move-result-wide v5

    .line 522
    double-to-float v5, v5

    .line 523
    mul-float/2addr v5, v12

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1, v13, v5}, Landroid/graphics/Canvas;->scale(FF)V

    .line 527
    .line 528
    iget v5, v0, Lcom/contrarywind/view/WheelView;->S:I

    .line 529
    int-to-float v5, v5

    .line 530
    .line 531
    iget v6, v0, Lcom/contrarywind/view/WheelView;->r:I

    .line 532
    int-to-float v6, v6

    .line 533
    .line 534
    iget-object v8, v0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 535
    .line 536
    move-object/from16 v11, v17

    .line 537
    .line 538
    .line 539
    invoke-virtual {v1, v11, v5, v6, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 546
    .line 547
    iget v5, v0, Lcom/contrarywind/view/WheelView;->A:F

    .line 548
    sub-float/2addr v5, v7

    .line 549
    .line 550
    iget v6, v0, Lcom/contrarywind/view/WheelView;->K:I

    .line 551
    int-to-float v6, v6

    .line 552
    .line 553
    iget v7, v0, Lcom/contrarywind/view/WheelView;->t:F

    .line 554
    float-to-int v7, v7

    .line 555
    int-to-float v7, v7

    .line 556
    const/4 v8, 0x0

    .line 557
    .line 558
    .line 559
    invoke-virtual {v1, v8, v5, v6, v7}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 560
    .line 561
    .line 562
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 563
    move-result-wide v3

    .line 564
    double-to-float v3, v3

    .line 565
    mul-float/2addr v3, v13

    .line 566
    .line 567
    .line 568
    invoke-virtual {v1, v13, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 569
    .line 570
    iget v3, v0, Lcom/contrarywind/view/WheelView;->R:I

    .line 571
    int-to-float v3, v3

    .line 572
    .line 573
    iget v4, v0, Lcom/contrarywind/view/WheelView;->r:I

    .line 574
    int-to-float v4, v4

    .line 575
    .line 576
    iget v5, v0, Lcom/contrarywind/view/WheelView;->T:F

    .line 577
    sub-float/2addr v4, v5

    .line 578
    .line 579
    iget-object v5, v0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v1, v11, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 586
    :goto_9
    const/4 v14, 0x0

    .line 587
    .line 588
    const/16 v16, 0x0

    .line 589
    .line 590
    goto/16 :goto_d

    .line 591
    .line 592
    :cond_10
    move-object/from16 v11, v17

    .line 593
    .line 594
    iget v14, v0, Lcom/contrarywind/view/WheelView;->B:F

    .line 595
    .line 596
    cmpg-float v15, v7, v14

    .line 597
    .line 598
    if-gtz v15, :cond_11

    .line 599
    .line 600
    iget v15, v0, Lcom/contrarywind/view/WheelView;->r:I

    .line 601
    int-to-float v15, v15

    .line 602
    add-float/2addr v15, v7

    .line 603
    .line 604
    cmpl-float v15, v15, v14

    .line 605
    .line 606
    if-ltz v15, :cond_11

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 610
    .line 611
    iget v5, v0, Lcom/contrarywind/view/WheelView;->K:I

    .line 612
    int-to-float v5, v5

    .line 613
    .line 614
    iget v6, v0, Lcom/contrarywind/view/WheelView;->B:F

    .line 615
    sub-float/2addr v6, v7

    .line 616
    const/4 v8, 0x0

    .line 617
    .line 618
    .line 619
    invoke-virtual {v1, v8, v8, v5, v6}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 620
    .line 621
    .line 622
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 623
    move-result-wide v5

    .line 624
    double-to-float v5, v5

    .line 625
    mul-float/2addr v5, v13

    .line 626
    .line 627
    .line 628
    invoke-virtual {v1, v13, v5}, Landroid/graphics/Canvas;->scale(FF)V

    .line 629
    .line 630
    iget v5, v0, Lcom/contrarywind/view/WheelView;->R:I

    .line 631
    int-to-float v5, v5

    .line 632
    .line 633
    iget v6, v0, Lcom/contrarywind/view/WheelView;->r:I

    .line 634
    int-to-float v6, v6

    .line 635
    .line 636
    iget v8, v0, Lcom/contrarywind/view/WheelView;->T:F

    .line 637
    sub-float/2addr v6, v8

    .line 638
    .line 639
    iget-object v8, v0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v1, v11, v5, v6, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 649
    .line 650
    iget v5, v0, Lcom/contrarywind/view/WheelView;->B:F

    .line 651
    sub-float/2addr v5, v7

    .line 652
    .line 653
    iget v6, v0, Lcom/contrarywind/view/WheelView;->K:I

    .line 654
    int-to-float v6, v6

    .line 655
    .line 656
    iget v7, v0, Lcom/contrarywind/view/WheelView;->t:F

    .line 657
    float-to-int v7, v7

    .line 658
    int-to-float v7, v7

    .line 659
    const/4 v8, 0x0

    .line 660
    .line 661
    .line 662
    invoke-virtual {v1, v8, v5, v6, v7}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 663
    .line 664
    .line 665
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 666
    move-result-wide v3

    .line 667
    double-to-float v3, v3

    .line 668
    mul-float/2addr v3, v12

    .line 669
    .line 670
    .line 671
    invoke-virtual {v1, v13, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 672
    .line 673
    iget v3, v0, Lcom/contrarywind/view/WheelView;->S:I

    .line 674
    int-to-float v3, v3

    .line 675
    .line 676
    iget v4, v0, Lcom/contrarywind/view/WheelView;->r:I

    .line 677
    int-to-float v4, v4

    .line 678
    .line 679
    iget-object v5, v0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v1, v11, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 686
    goto :goto_9

    .line 687
    .line 688
    :cond_11
    cmpl-float v8, v7, v8

    .line 689
    .line 690
    if-ltz v8, :cond_12

    .line 691
    .line 692
    iget v8, v0, Lcom/contrarywind/view/WheelView;->r:I

    .line 693
    int-to-float v15, v8

    .line 694
    add-float/2addr v15, v7

    .line 695
    .line 696
    cmpg-float v7, v15, v14

    .line 697
    .line 698
    if-gtz v7, :cond_12

    .line 699
    int-to-float v3, v8

    .line 700
    .line 701
    iget v4, v0, Lcom/contrarywind/view/WheelView;->T:F

    .line 702
    sub-float/2addr v3, v4

    .line 703
    .line 704
    iget v4, v0, Lcom/contrarywind/view/WheelView;->R:I

    .line 705
    int-to-float v4, v4

    .line 706
    .line 707
    iget-object v5, v0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v1, v11, v4, v3, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 711
    .line 712
    iget v3, v0, Lcom/contrarywind/view/WheelView;->G:I

    .line 713
    .line 714
    iget v4, v0, Lcom/contrarywind/view/WheelView;->I:I

    .line 715
    .line 716
    div-int/lit8 v4, v4, 0x2

    .line 717
    sub-int/2addr v4, v2

    .line 718
    sub-int/2addr v3, v4

    .line 719
    .line 720
    iput v3, v0, Lcom/contrarywind/view/WheelView;->F:I

    .line 721
    .line 722
    goto/16 :goto_9

    .line 723
    .line 724
    .line 725
    :cond_12
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 726
    .line 727
    iget v7, v0, Lcom/contrarywind/view/WheelView;->K:I

    .line 728
    .line 729
    iget v8, v0, Lcom/contrarywind/view/WheelView;->t:F

    .line 730
    float-to-int v8, v8

    .line 731
    const/4 v14, 0x0

    .line 732
    .line 733
    .line 734
    invoke-virtual {v1, v14, v14, v7, v8}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 735
    .line 736
    .line 737
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 738
    move-result-wide v3

    .line 739
    double-to-float v3, v3

    .line 740
    mul-float/2addr v3, v12

    .line 741
    .line 742
    .line 743
    invoke-virtual {v1, v13, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 744
    .line 745
    iget-object v3, v0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 746
    .line 747
    iget v4, v0, Lcom/contrarywind/view/WheelView;->s:I

    .line 748
    const/4 v7, -0x1

    .line 749
    .line 750
    if-nez v4, :cond_13

    .line 751
    move v4, v14

    .line 752
    .line 753
    :goto_a
    const/16 v16, 0x0

    .line 754
    goto :goto_b

    .line 755
    .line 756
    :cond_13
    if-lez v4, :cond_14

    .line 757
    const/4 v4, 0x1

    .line 758
    goto :goto_a

    .line 759
    :cond_14
    move v4, v7

    .line 760
    goto :goto_a

    .line 761
    .line 762
    :goto_b
    cmpl-float v5, v5, v16

    .line 763
    .line 764
    if-lez v5, :cond_15

    .line 765
    goto :goto_c

    .line 766
    :cond_15
    const/4 v7, 0x1

    .line 767
    :goto_c
    mul-int/2addr v4, v7

    .line 768
    int-to-float v4, v4

    .line 769
    .line 770
    const/high16 v5, 0x3f000000    # 0.5f

    .line 771
    mul-float/2addr v4, v5

    .line 772
    mul-float/2addr v4, v6

    .line 773
    .line 774
    .line 775
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 776
    .line 777
    iget-object v3, v0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 778
    sub-float/2addr v13, v6

    .line 779
    .line 780
    const/high16 v4, 0x437f0000    # 255.0f

    .line 781
    mul-float/2addr v13, v4

    .line 782
    float-to-int v4, v13

    .line 783
    .line 784
    .line 785
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 786
    .line 787
    iget v3, v0, Lcom/contrarywind/view/WheelView;->S:I

    .line 788
    int-to-float v3, v3

    .line 789
    .line 790
    iget v4, v0, Lcom/contrarywind/view/WheelView;->s:I

    .line 791
    int-to-float v4, v4

    .line 792
    mul-float/2addr v4, v6

    .line 793
    add-float/2addr v3, v4

    .line 794
    .line 795
    iget v4, v0, Lcom/contrarywind/view/WheelView;->r:I

    .line 796
    int-to-float v4, v4

    .line 797
    .line 798
    iget-object v5, v0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v1, v11, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 805
    .line 806
    .line 807
    :goto_d
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 808
    .line 809
    iget-object v3, v0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 810
    .line 811
    iget v4, v0, Lcom/contrarywind/view/WheelView;->p:I

    .line 812
    int-to-float v4, v4

    .line 813
    .line 814
    .line 815
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 816
    goto :goto_f

    .line 817
    .line 818
    .line 819
    :goto_e
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 820
    .line 821
    :goto_f
    add-int/lit8 v2, v2, 0x1

    .line 822
    move v7, v14

    .line 823
    .line 824
    move/from16 v11, v16

    .line 825
    const/4 v8, 0x1

    .line 826
    .line 827
    goto/16 :goto_7

    .line 828
    :cond_16
    :goto_10
    return-void
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
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/contrarywind/view/WheelView;->P:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->o()V

    .line 6
    .line 7
    iget p1, p0, Lcom/contrarywind/view/WheelView;->K:I

    .line 8
    .line 9
    iget p2, p0, Lcom/contrarywind/view/WheelView;->J:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 13
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->e:Landroid/view/GestureDetector;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Lcom/contrarywind/view/WheelView;->E:I

    .line 9
    neg-int v1, v1

    .line 10
    int-to-float v1, v1

    .line 11
    .line 12
    iget v2, p0, Lcom/contrarywind/view/WheelView;->t:F

    .line 13
    mul-float/2addr v1, v2

    .line 14
    .line 15
    iget-object v2, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 16
    .line 17
    .line 18
    invoke-interface {v2}, Lt2/a;->a()I

    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x1

    .line 21
    sub-int/2addr v2, v3

    .line 22
    .line 23
    iget v4, p0, Lcom/contrarywind/view/WheelView;->E:I

    .line 24
    sub-int/2addr v2, v4

    .line 25
    int-to-float v2, v2

    .line 26
    .line 27
    iget v4, p0, Lcom/contrarywind/view/WheelView;->t:F

    .line 28
    mul-float/2addr v2, v4

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 32
    move-result v4

    .line 33
    .line 34
    if-eqz v4, :cond_4

    .line 35
    const/4 v5, 0x2

    .line 36
    .line 37
    if-eq v4, v5, :cond_1

    .line 38
    .line 39
    if-nez v0, :cond_5

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 43
    move-result v0

    .line 44
    .line 45
    iget v1, p0, Lcom/contrarywind/view/WheelView;->L:I

    .line 46
    int-to-float v2, v1

    .line 47
    sub-float/2addr v2, v0

    .line 48
    int-to-float v0, v1

    .line 49
    div-float/2addr v2, v0

    .line 50
    float-to-double v0, v2

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, Ljava/lang/Math;->acos(D)D

    .line 54
    move-result-wide v0

    .line 55
    .line 56
    iget v2, p0, Lcom/contrarywind/view/WheelView;->L:I

    .line 57
    int-to-double v6, v2

    .line 58
    mul-double/2addr v0, v6

    .line 59
    .line 60
    iget v2, p0, Lcom/contrarywind/view/WheelView;->t:F

    .line 61
    .line 62
    const/high16 v4, 0x40000000    # 2.0f

    .line 63
    .line 64
    div-float v4, v2, v4

    .line 65
    float-to-double v6, v4

    .line 66
    add-double/2addr v0, v6

    .line 67
    float-to-double v6, v2

    .line 68
    div-double/2addr v0, v6

    .line 69
    double-to-int v0, v0

    .line 70
    .line 71
    iget v1, p0, Lcom/contrarywind/view/WheelView;->D:F

    .line 72
    rem-float/2addr v1, v2

    .line 73
    add-float/2addr v1, v2

    .line 74
    rem-float/2addr v1, v2

    .line 75
    .line 76
    iget v4, p0, Lcom/contrarywind/view/WheelView;->I:I

    .line 77
    div-int/2addr v4, v5

    .line 78
    sub-int/2addr v0, v4

    .line 79
    int-to-float v0, v0

    .line 80
    mul-float/2addr v0, v2

    .line 81
    sub-float/2addr v0, v1

    .line 82
    float-to-int v0, v0

    .line 83
    .line 84
    iput v0, p0, Lcom/contrarywind/view/WheelView;->M:I

    .line 85
    .line 86
    .line 87
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 88
    move-result-wide v0

    .line 89
    .line 90
    iget-wide v4, p0, Lcom/contrarywind/view/WheelView;->O:J

    .line 91
    sub-long/2addr v0, v4

    .line 92
    .line 93
    const-wide/16 v4, 0x78

    .line 94
    .line 95
    cmp-long v0, v0, v4

    .line 96
    .line 97
    if-lez v0, :cond_0

    .line 98
    .line 99
    sget-object v0, Lcom/contrarywind/view/WheelView$ACTION;->DAGGLE:Lcom/contrarywind/view/WheelView$ACTION;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v0}, Lcom/contrarywind/view/WheelView;->q(Lcom/contrarywind/view/WheelView$ACTION;)V

    .line 103
    goto :goto_0

    .line 104
    .line 105
    :cond_0
    sget-object v0, Lcom/contrarywind/view/WheelView$ACTION;->CLICK:Lcom/contrarywind/view/WheelView$ACTION;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v0}, Lcom/contrarywind/view/WheelView;->q(Lcom/contrarywind/view/WheelView$ACTION;)V

    .line 109
    goto :goto_0

    .line 110
    .line 111
    :cond_1
    iget v0, p0, Lcom/contrarywind/view/WheelView;->N:F

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 115
    move-result v4

    .line 116
    sub-float/2addr v0, v4

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 120
    move-result v4

    .line 121
    .line 122
    iput v4, p0, Lcom/contrarywind/view/WheelView;->N:F

    .line 123
    .line 124
    iget v4, p0, Lcom/contrarywind/view/WheelView;->D:F

    .line 125
    add-float/2addr v4, v0

    .line 126
    .line 127
    iput v4, p0, Lcom/contrarywind/view/WheelView;->D:F

    .line 128
    .line 129
    iget-boolean v5, p0, Lcom/contrarywind/view/WheelView;->z:Z

    .line 130
    .line 131
    if-nez v5, :cond_5

    .line 132
    .line 133
    iget v5, p0, Lcom/contrarywind/view/WheelView;->t:F

    .line 134
    .line 135
    const/high16 v6, 0x3e800000    # 0.25f

    .line 136
    .line 137
    mul-float v7, v5, v6

    .line 138
    .line 139
    sub-float v7, v4, v7

    .line 140
    .line 141
    cmpg-float v1, v7, v1

    .line 142
    const/4 v7, 0x0

    .line 143
    .line 144
    if-gez v1, :cond_2

    .line 145
    .line 146
    cmpg-float v1, v0, v7

    .line 147
    .line 148
    if-ltz v1, :cond_3

    .line 149
    :cond_2
    mul-float/2addr v5, v6

    .line 150
    add-float/2addr v5, v4

    .line 151
    .line 152
    cmpl-float v1, v5, v2

    .line 153
    .line 154
    if-lez v1, :cond_5

    .line 155
    .line 156
    cmpl-float v1, v0, v7

    .line 157
    .line 158
    if-lez v1, :cond_5

    .line 159
    :cond_3
    sub-float/2addr v4, v0

    .line 160
    .line 161
    iput v4, p0, Lcom/contrarywind/view/WheelView;->D:F

    .line 162
    goto :goto_1

    .line 163
    .line 164
    .line 165
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 166
    move-result-wide v0

    .line 167
    .line 168
    iput-wide v0, p0, Lcom/contrarywind/view/WheelView;->O:J

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->b()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 175
    move-result v0

    .line 176
    .line 177
    iput v0, p0, Lcom/contrarywind/view/WheelView;->N:F

    .line 178
    .line 179
    .line 180
    :cond_5
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 181
    move-result p1

    .line 182
    .line 183
    if-eqz p1, :cond_6

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 187
    :cond_6
    :goto_1
    return v3
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
.end method

.method public final p(F)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->b()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    .line 7
    new-instance v1, Lw2/a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lw2/a;-><init>(Lcom/contrarywind/view/WheelView;F)V

    .line 11
    .line 12
    const-wide/16 v4, 0x5

    .line 13
    .line 14
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 23
    return-void
.end method

.method public q(Lcom/contrarywind/view/WheelView$ACTION;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->b()V

    .line 4
    .line 5
    sget-object v0, Lcom/contrarywind/view/WheelView$ACTION;->FLING:Lcom/contrarywind/view/WheelView$ACTION;

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/contrarywind/view/WheelView$ACTION;->DAGGLE:Lcom/contrarywind/view/WheelView$ACTION;

    .line 10
    .line 11
    if-ne p1, v0, :cond_2

    .line 12
    .line 13
    :cond_0
    iget p1, p0, Lcom/contrarywind/view/WheelView;->D:F

    .line 14
    .line 15
    iget v0, p0, Lcom/contrarywind/view/WheelView;->t:F

    .line 16
    rem-float/2addr p1, v0

    .line 17
    add-float/2addr p1, v0

    .line 18
    rem-float/2addr p1, v0

    .line 19
    float-to-int p1, p1

    .line 20
    .line 21
    iput p1, p0, Lcom/contrarywind/view/WheelView;->M:I

    .line 22
    int-to-float v1, p1

    .line 23
    .line 24
    const/high16 v2, 0x40000000    # 2.0f

    .line 25
    .line 26
    div-float v2, v0, v2

    .line 27
    .line 28
    cmpl-float v1, v1, v2

    .line 29
    .line 30
    if-lez v1, :cond_1

    .line 31
    int-to-float p1, p1

    .line 32
    sub-float/2addr v0, p1

    .line 33
    float-to-int p1, v0

    .line 34
    .line 35
    iput p1, p0, Lcom/contrarywind/view/WheelView;->M:I

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    neg-int p1, p1

    .line 38
    .line 39
    iput p1, p0, Lcom/contrarywind/view/WheelView;->M:I

    .line 40
    .line 41
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 42
    .line 43
    new-instance v1, Lw2/c;

    .line 44
    .line 45
    iget p1, p0, Lcom/contrarywind/view/WheelView;->M:I

    .line 46
    .line 47
    .line 48
    invoke-direct {v1, p0, p1}, Lw2/c;-><init>(Lcom/contrarywind/view/WheelView;I)V

    .line 49
    .line 50
    const-wide/16 v4, 0xa

    .line 51
    .line 52
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 53
    .line 54
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    .line 57
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 61
    return-void
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
.end method

.method public final setAdapter(Lt2/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->n:Lt2/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->o()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public final setCurrentItem(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/contrarywind/view/WheelView;->F:I

    .line 3
    .line 4
    iput p1, p0, Lcom/contrarywind/view/WheelView;->E:I

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    iput p1, p0, Lcom/contrarywind/view/WheelView;->D:F

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
.end method

.method public final setCyclic(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/contrarywind/view/WheelView;->z:Z

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
.end method

.method public setDividerColor(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/contrarywind/view/WheelView;->x:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->m:Landroid/graphics/Paint;

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
.end method

.method public setDividerType(Lcom/contrarywind/view/WheelView$DividerType;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->b:Lcom/contrarywind/view/WheelView$DividerType;

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
.end method

.method public setGravity(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/contrarywind/view/WheelView;->Q:I

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
.end method

.method public setIsOptions(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/contrarywind/view/WheelView;->g:Z

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
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->o:Ljava/lang/String;

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
.end method

.method public setLineSpacingMultiplier(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/contrarywind/view/WheelView;->y:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/contrarywind/view/WheelView;->i()V

    .line 11
    :cond_0
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
.end method

.method public final setOnItemSelectedListener(Lv2/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->f:Lv2/b;

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
.end method

.method public setTextColorCenter(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/contrarywind/view/WheelView;->w:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

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
.end method

.method public setTextColorOut(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/contrarywind/view/WheelView;->v:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

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
.end method

.method public final setTextSize(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->c:Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 18
    mul-float/2addr v0, p1

    .line 19
    float-to-int p1, v0

    .line 20
    .line 21
    iput p1, p0, Lcom/contrarywind/view/WheelView;->p:I

    .line 22
    .line 23
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 24
    int-to-float p1, p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 28
    .line 29
    iget-object p1, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 30
    .line 31
    iget v0, p0, Lcom/contrarywind/view/WheelView;->p:I

    .line 32
    int-to-float v0, v0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 36
    :cond_0
    return-void
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
.end method

.method public setTextXOffset(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/contrarywind/view/WheelView;->s:I

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 12
    :cond_0
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
.end method

.method public setTotalScrollY(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/contrarywind/view/WheelView;->D:F

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
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/contrarywind/view/WheelView;->u:Landroid/graphics/Typeface;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->k:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 8
    .line 9
    iget-object p1, p0, Lcom/contrarywind/view/WheelView;->l:Landroid/graphics/Paint;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/contrarywind/view/WheelView;->u:Landroid/graphics/Typeface;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
