.class public Lcom/kubi/resources/widget/wheel/view/WheelView;
.super Landroid/view/View;
.source "WheelView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;,
        Lcom/kubi/resources/widget/wheel/view/WheelView$DividerType;
    }
.end annotation


# instance fields
.field public A:Z

.field public B:F

.field public C:F

.field public D:F

.field public E:F

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:I

.field public N:I

.field public O:F

.field public P:J

.field public Q:I

.field public R:I

.field public S:I

.field public T:I

.field public U:F

.field public final V:F

.field public b:Lcom/kubi/resources/widget/wheel/view/WheelView$DividerType;

.field public c:Landroid/content/Context;

.field public d:Landroid/os/Handler;

.field public e:Landroid/view/GestureDetector;

.field public f:Lix/b;

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

.field public n:Lgx/a;

.field public o:Ljava/lang/String;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:F

.field public u:Landroid/graphics/Typeface;

.field public v:I

.field public w:F

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kubi/resources/widget/wheel/view/WheelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 3
    iput-boolean p2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->g:Z

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->h:Z

    .line 5
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->u:Landroid/graphics/Typeface;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    iput v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->w:F

    const v1, 0x3fe66666    # 1.8f

    .line 8
    iput v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->z:F

    const/16 v1, 0x9

    .line 9
    iput v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->J:I

    .line 10
    iput p2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->N:I

    const/4 v1, 0x0

    .line 11
    iput v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->O:F

    const-wide/16 v1, 0x0

    .line 12
    iput-wide v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->P:J

    const/16 v1, 0x11

    .line 13
    iput v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->R:I

    .line 14
    iput p2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->S:I

    .line 15
    iput p2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->T:I

    const/high16 p2, 0x3f000000    # 0.5f

    .line 16
    iput p2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->V:F

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    .line 18
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    cmpg-float v1, p2, v0

    if-gez v1, :cond_0

    const p2, 0x4019999a    # 2.4f

    .line 19
    iput p2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    goto :goto_0

    :cond_0
    cmpg-float v0, v0, p2

    const/high16 v1, 0x40000000    # 2.0f

    if-gtz v0, :cond_1

    cmpg-float v2, p2, v1

    if-gez v2, :cond_1

    const p2, 0x40666666    # 3.6f

    .line 20
    iput p2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    goto :goto_0

    :cond_1
    if-gtz v0, :cond_2

    cmpg-float v0, p2, v1

    if-gez v0, :cond_2

    const/high16 p2, 0x40900000    # 4.5f

    .line 21
    iput p2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    goto :goto_0

    :cond_2
    cmpg-float v0, v1, p2

    const/high16 v1, 0x40400000    # 3.0f

    if-gtz v0, :cond_3

    cmpg-float v0, p2, v1

    if-gez v0, :cond_3

    const/high16 p2, 0x40c00000    # 6.0f

    .line 22
    iput p2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    goto :goto_0

    :cond_3
    cmpl-float v0, p2, v1

    if-ltz v0, :cond_4

    const/high16 v0, 0x40200000    # 2.5f

    mul-float/2addr p2, v0

    .line 23
    iput p2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    .line 24
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->i()V

    .line 25
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/wheel/view/WheelView;->f(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Lcom/kubi/resources/widget/wheel/view/WheelView;)Lix/b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->f:Lix/b;

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


# virtual methods
.method public b()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

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
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

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
    iput-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

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
    instance-of v0, p1, Lhx/a;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p1, Lhx/a;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Lhx/a;->getPickerViewText()Ljava/lang/String;

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
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 23
    .line 24
    check-cast p1, Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    const-string v1, "%02d"

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    return-object p1
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

.method public final d(I)I
    .locals 1

    .line 1
    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lgx/a;->a()I

    .line 8
    move-result v0

    .line 9
    add-int/2addr p1, v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/wheel/view/WheelView;->d(I)I

    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lgx/a;->a()I

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
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lgx/a;->a()I

    .line 30
    move-result v0

    .line 31
    sub-int/2addr p1, v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/wheel/view/WheelView;->d(I)I

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

.method public final f(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->c:Landroid/content/Context;

    .line 3
    .line 4
    new-instance v0, Ljx/b;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p0}, Ljx/b;-><init>(Lcom/kubi/resources/widget/wheel/view/WheelView;)V

    .line 8
    .line 9
    iput-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->d:Landroid/os/Handler;

    .line 10
    .line 11
    new-instance v0, Landroid/view/GestureDetector;

    .line 12
    .line 13
    new-instance v1, Lix/a;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, p0}, Lix/a;-><init>(Lcom/kubi/resources/widget/wheel/view/WheelView;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->e:Landroid/view/GestureDetector;

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
    iput-boolean p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->A:Z

    .line 29
    const/4 p1, 0x0

    .line 30
    .line 31
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->E:F

    .line 32
    const/4 p1, -0x1

    .line 33
    .line 34
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->F:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->g()V

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
    iput-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 8
    .line 9
    iget v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->v:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->u:Landroid/graphics/Typeface;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 28
    .line 29
    iget v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->p:I

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
    iput-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 41
    .line 42
    iget v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->x:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 46
    .line 47
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 51
    .line 52
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

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
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 61
    .line 62
    iget-object v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->u:Landroid/graphics/Typeface;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 66
    .line 67
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 68
    .line 69
    iget v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->p:I

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
    iput-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->m:Landroid/graphics/Paint;

    .line 81
    .line 82
    iget v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->y:I

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    .line 87
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->m:Landroid/graphics/Paint;

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
.end method

.method public final getAdapter()Lgx/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

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

.method public final getCurrentItem()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

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
    iget-boolean v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->A:Z

    .line 9
    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    iget v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->G:I

    .line 13
    .line 14
    if-ltz v2, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lgx/a;->a()I

    .line 18
    move-result v0

    .line 19
    .line 20
    if-lt v2, v0, :cond_2

    .line 21
    .line 22
    :cond_1
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->G:I

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 26
    move-result v0

    .line 27
    .line 28
    iget-object v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 29
    .line 30
    .line 31
    invoke-interface {v2}, Lgx/a;->a()I

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
    iget-object v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, Lgx/a;->a()I

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
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->G:I

    .line 57
    .line 58
    iget-object v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 59
    .line 60
    .line 61
    invoke-interface {v2}, Lgx/a;->a()I

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

.method public getHandler()Landroid/os/Handler;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->d:Landroid/os/Handler;

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

.method public getInitPosition()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->F:I

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

.method public getItemHeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

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

.method public getItemsCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lgx/a;->a()I

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

.method public getTotalScrollY()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->E:F

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

.method public h()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->A:Z

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

.method public final i()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->z:F

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
    iput v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->z:F

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
    iput v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->z:F

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
    iget-object v3, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 10
    .line 11
    .line 12
    invoke-interface {v3}, Lgx/a;->a()I

    .line 13
    move-result v3

    .line 14
    .line 15
    if-ge v2, v3, :cond_1

    .line 16
    .line 17
    iget-object v3, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 18
    .line 19
    .line 20
    invoke-interface {v3, v2}, Lgx/a;->getItem(I)Ljava/lang/Object;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v3}, Lcom/kubi/resources/widget/wheel/view/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    iget-object v4, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

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
    iget v4, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->q:I

    .line 41
    .line 42
    if-le v3, v4, :cond_0

    .line 43
    .line 44
    iput v3, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->q:I

    .line 45
    .line 46
    :cond_0
    iget-object v3, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 47
    .line 48
    const-string v4, "\u661f\u671f"

    .line 49
    const/4 v5, 0x2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v4, v1, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 56
    move-result v3

    .line 57
    add-int/2addr v3, v5

    .line 58
    .line 59
    iput v3, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_1
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->z:F

    .line 65
    .line 66
    iget v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

    .line 67
    int-to-float v1, v1

    .line 68
    mul-float/2addr v0, v1

    .line 69
    .line 70
    iput v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

    .line 71
    return-void
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
    iget-object v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

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
    iget p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->R:I

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
    iget-boolean p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->g:Z

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->o:Ljava/lang/String;

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
    iget-boolean p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->h:Z

    .line 47
    .line 48
    if-nez p1, :cond_1

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_1
    iget p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

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
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->S:I

    .line 64
    return-void

    .line 65
    .line 66
    :cond_2
    :goto_0
    iget p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

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
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->S:I

    .line 79
    return-void

    .line 80
    .line 81
    :cond_3
    iget p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

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
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    .line 89
    float-to-int v0, v0

    .line 90
    sub-int/2addr p1, v0

    .line 91
    .line 92
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->S:I

    .line 93
    return-void

    .line 94
    .line 95
    :cond_4
    iput v3, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->S:I

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
    iget-object v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

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
    iget p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->R:I

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
    iget-boolean p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->g:Z

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->o:Ljava/lang/String;

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
    iget-boolean p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->h:Z

    .line 47
    .line 48
    if-nez p1, :cond_1

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_1
    iget p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

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
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->T:I

    .line 64
    return-void

    .line 65
    .line 66
    :cond_2
    :goto_0
    iget p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

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
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->T:I

    .line 79
    return-void

    .line 80
    .line 81
    :cond_3
    iget p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

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
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    .line 89
    float-to-int v0, v0

    .line 90
    sub-int/2addr p1, v0

    .line 91
    .line 92
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->T:I

    .line 93
    return-void

    .line 94
    .line 95
    :cond_4
    iput v3, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->T:I

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
.end method

.method public final m()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->f:Lix/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/kubi/resources/widget/wheel/view/WheelView$a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/kubi/resources/widget/wheel/view/WheelView$a;-><init>(Lcom/kubi/resources/widget/wheel/view/WheelView;)V

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
    iget-object v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

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
    iget v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->p:I

    .line 22
    .line 23
    :goto_0
    iget v4, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 24
    .line 25
    if-le v1, v4, :cond_0

    .line 26
    .line 27
    add-int/lit8 v2, v2, -0x1

    .line 28
    .line 29
    iget-object v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 30
    int-to-float v4, v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 34
    .line 35
    iget-object v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

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
    iget-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

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

.method public final o()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->j()V

    .line 9
    .line 10
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

    .line 11
    .line 12
    iget v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->J:I

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
    iput v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->K:I

    .line 30
    int-to-double v0, v0

    .line 31
    div-double/2addr v0, v3

    .line 32
    double-to-int v0, v0

    .line 33
    .line 34
    iput v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->M:I

    .line 35
    .line 36
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->Q:I

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 40
    move-result v0

    .line 41
    .line 42
    iput v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 43
    .line 44
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->K:I

    .line 45
    int-to-float v1, v0

    .line 46
    .line 47
    iget v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

    .line 48
    sub-float/2addr v1, v2

    .line 49
    .line 50
    const/high16 v3, 0x40000000    # 2.0f

    .line 51
    div-float/2addr v1, v3

    .line 52
    .line 53
    iput v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->B:F

    .line 54
    int-to-float v0, v0

    .line 55
    add-float/2addr v0, v2

    .line 56
    div-float/2addr v0, v3

    .line 57
    .line 58
    iput v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->C:F

    .line 59
    .line 60
    iget v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

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
    iget v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    .line 67
    sub-float/2addr v0, v1

    .line 68
    .line 69
    iput v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->D:F

    .line 70
    .line 71
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->F:I

    .line 72
    const/4 v1, -0x1

    .line 73
    .line 74
    if-ne v0, v1, :cond_2

    .line 75
    .line 76
    iget-boolean v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->A:Z

    .line 77
    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Lgx/a;->a()I

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
    iput v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->F:I

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    const/4 v0, 0x0

    .line 93
    .line 94
    iput v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->F:I

    .line 95
    .line 96
    :cond_2
    :goto_0
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->F:I

    .line 97
    .line 98
    iput v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_10

    .line 9
    .line 10
    :cond_0
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->F:I

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
    iget-object v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 18
    .line 19
    .line 20
    invoke-interface {v2}, Lgx/a;->a()I

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
    iput v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->F:I

    .line 30
    .line 31
    iget v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->J:I

    .line 32
    .line 33
    new-array v9, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    iget v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->E:F

    .line 36
    .line 37
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

    .line 38
    div-float/2addr v2, v3

    .line 39
    float-to-int v2, v2

    .line 40
    .line 41
    iput v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->I:I

    .line 42
    .line 43
    :try_start_0
    iget-object v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 44
    .line 45
    .line 46
    invoke-interface {v3}, Lgx/a;->a()I

    .line 47
    move-result v3

    .line 48
    rem-int/2addr v2, v3

    .line 49
    add-int/2addr v1, v2

    .line 50
    .line 51
    iput v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I
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
    const-string v2, "\u51fa\u9519\u4e86\uff01adapter.getItemsCount() == 0\uff0c\u8054\u52a8\u6570\u636e\u4e0d\u5339\u914d"

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    :goto_0
    iget-boolean v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->A:Z

    .line 62
    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 66
    .line 67
    if-gez v1, :cond_1

    .line 68
    .line 69
    iput v7, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 70
    .line 71
    :cond_1
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 72
    .line 73
    iget-object v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 74
    .line 75
    .line 76
    invoke-interface {v2}, Lgx/a;->a()I

    .line 77
    move-result v2

    .line 78
    sub-int/2addr v2, v8

    .line 79
    .line 80
    if-le v1, v2, :cond_4

    .line 81
    .line 82
    iget-object v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 83
    .line 84
    .line 85
    invoke-interface {v1}, Lgx/a;->a()I

    .line 86
    move-result v1

    .line 87
    sub-int/2addr v1, v8

    .line 88
    .line 89
    iput v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 90
    goto :goto_1

    .line 91
    .line 92
    :cond_2
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 93
    .line 94
    if-gez v1, :cond_3

    .line 95
    .line 96
    iget-object v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 97
    .line 98
    .line 99
    invoke-interface {v1}, Lgx/a;->a()I

    .line 100
    move-result v1

    .line 101
    .line 102
    iget v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 103
    add-int/2addr v1, v2

    .line 104
    .line 105
    iput v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 106
    .line 107
    :cond_3
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 108
    .line 109
    iget-object v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 110
    .line 111
    .line 112
    invoke-interface {v2}, Lgx/a;->a()I

    .line 113
    move-result v2

    .line 114
    sub-int/2addr v2, v8

    .line 115
    .line 116
    if-le v1, v2, :cond_4

    .line 117
    .line 118
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 119
    .line 120
    iget-object v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 121
    .line 122
    .line 123
    invoke-interface {v2}, Lgx/a;->a()I

    .line 124
    move-result v2

    .line 125
    sub-int/2addr v1, v2

    .line 126
    .line 127
    iput v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 128
    .line 129
    :cond_4
    :goto_1
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->E:F

    .line 130
    .line 131
    iget v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

    .line 132
    .line 133
    rem-float v10, v1, v2

    .line 134
    move v1, v7

    .line 135
    .line 136
    :goto_2
    iget v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->J:I

    .line 137
    .line 138
    if-ge v1, v2, :cond_8

    .line 139
    .line 140
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 141
    .line 142
    div-int/lit8 v2, v2, 0x2

    .line 143
    sub-int/2addr v2, v1

    .line 144
    sub-int/2addr v3, v2

    .line 145
    .line 146
    iget-boolean v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->A:Z

    .line 147
    .line 148
    if-eqz v2, :cond_5

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v3}, Lcom/kubi/resources/widget/wheel/view/WheelView;->d(I)I

    .line 152
    move-result v2

    .line 153
    .line 154
    iget-object v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 155
    .line 156
    .line 157
    invoke-interface {v3, v2}, Lgx/a;->getItem(I)Ljava/lang/Object;

    .line 158
    move-result-object v2

    .line 159
    .line 160
    aput-object v2, v9, v1

    .line 161
    goto :goto_3

    .line 162
    .line 163
    :cond_5
    const-string v2, ""

    .line 164
    .line 165
    if-gez v3, :cond_6

    .line 166
    .line 167
    aput-object v2, v9, v1

    .line 168
    goto :goto_3

    .line 169
    .line 170
    :cond_6
    iget-object v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 171
    .line 172
    .line 173
    invoke-interface {v4}, Lgx/a;->a()I

    .line 174
    move-result v4

    .line 175
    sub-int/2addr v4, v8

    .line 176
    .line 177
    if-le v3, v4, :cond_7

    .line 178
    .line 179
    aput-object v2, v9, v1

    .line 180
    goto :goto_3

    .line 181
    .line 182
    :cond_7
    iget-object v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 183
    .line 184
    .line 185
    invoke-interface {v2, v3}, Lgx/a;->getItem(I)Ljava/lang/Object;

    .line 186
    move-result-object v2

    .line 187
    .line 188
    aput-object v2, v9, v1

    .line 189
    .line 190
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 191
    goto :goto_2

    .line 192
    .line 193
    :cond_8
    iget-object v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->b:Lcom/kubi/resources/widget/wheel/view/WheelView$DividerType;

    .line 194
    .line 195
    sget-object v2, Lcom/kubi/resources/widget/wheel/view/WheelView$DividerType;->WRAP:Lcom/kubi/resources/widget/wheel/view/WheelView$DividerType;

    .line 196
    const/4 v11, 0x0

    .line 197
    .line 198
    if-ne v1, v2, :cond_b

    .line 199
    .line 200
    iget-object v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->o:Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 204
    move-result v1

    .line 205
    .line 206
    if-eqz v1, :cond_9

    .line 207
    .line 208
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 209
    .line 210
    iget v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->q:I

    .line 211
    sub-int/2addr v1, v2

    .line 212
    .line 213
    div-int/lit8 v1, v1, 0x2

    .line 214
    .line 215
    :goto_4
    add-int/lit8 v1, v1, -0xc

    .line 216
    int-to-float v1, v1

    .line 217
    goto :goto_5

    .line 218
    .line 219
    :cond_9
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 220
    .line 221
    iget v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->q:I

    .line 222
    sub-int/2addr v1, v2

    .line 223
    .line 224
    div-int/lit8 v1, v1, 0x4

    .line 225
    goto :goto_4

    .line 226
    .line 227
    :goto_5
    cmpg-float v2, v1, v11

    .line 228
    .line 229
    if-gtz v2, :cond_a

    .line 230
    .line 231
    const/high16 v1, 0x41200000    # 10.0f

    .line 232
    :cond_a
    move v2, v1

    .line 233
    .line 234
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 235
    int-to-float v1, v1

    .line 236
    .line 237
    sub-float v4, v1, v2

    .line 238
    .line 239
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->B:F

    .line 240
    .line 241
    iget-object v6, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->m:Landroid/graphics/Paint;

    .line 242
    move v5, v3

    .line 243
    .line 244
    move-object/from16 v1, p1

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 248
    .line 249
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->C:F

    .line 250
    .line 251
    iget-object v6, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->m:Landroid/graphics/Paint;

    .line 252
    move v5, v3

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 256
    goto :goto_6

    .line 257
    .line 258
    :cond_b
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->B:F

    .line 259
    .line 260
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 261
    int-to-float v4, v1

    .line 262
    .line 263
    iget-object v6, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->m:Landroid/graphics/Paint;

    .line 264
    const/4 v2, 0x0

    .line 265
    move v5, v3

    .line 266
    .line 267
    move-object/from16 v1, p1

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 271
    .line 272
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->C:F

    .line 273
    .line 274
    iget v1, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 275
    int-to-float v4, v1

    .line 276
    .line 277
    iget-object v6, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->m:Landroid/graphics/Paint;

    .line 278
    move v5, v3

    .line 279
    .line 280
    move-object/from16 v1, p1

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 284
    .line 285
    :goto_6
    iget-object v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->o:Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 289
    move-result v2

    .line 290
    .line 291
    if-nez v2, :cond_c

    .line 292
    .line 293
    iget-boolean v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->h:Z

    .line 294
    .line 295
    if-eqz v2, :cond_c

    .line 296
    .line 297
    iget v2, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 298
    .line 299
    iget-object v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 300
    .line 301
    iget-object v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->o:Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v3, v4}, Lcom/kubi/resources/widget/wheel/view/WheelView;->e(Landroid/graphics/Paint;Ljava/lang/String;)I

    .line 305
    move-result v3

    .line 306
    sub-int/2addr v2, v3

    .line 307
    .line 308
    iget-object v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->o:Ljava/lang/String;

    .line 309
    int-to-float v2, v2

    .line 310
    .line 311
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    .line 312
    sub-float/2addr v2, v4

    .line 313
    .line 314
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->D:F

    .line 315
    .line 316
    iget-object v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 320
    :cond_c
    move v2, v7

    .line 321
    .line 322
    :goto_7
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->J:I

    .line 323
    .line 324
    if-ge v2, v3, :cond_16

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 328
    .line 329
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

    .line 330
    int-to-float v4, v2

    .line 331
    mul-float/2addr v3, v4

    .line 332
    sub-float/2addr v3, v10

    .line 333
    .line 334
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->M:I

    .line 335
    int-to-float v4, v4

    .line 336
    div-float/2addr v3, v4

    .line 337
    float-to-double v3, v3

    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    const-wide v5, 0x400921fb54442d18L    # Math.PI

    .line 343
    .line 344
    div-double v5, v3, v5

    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    const-wide v12, 0x4066800000000000L    # 180.0

    .line 350
    mul-double/2addr v5, v12

    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    const-wide v12, 0x4056800000000000L    # 90.0

    .line 356
    sub-double/2addr v12, v5

    .line 357
    double-to-float v5, v12

    .line 358
    .line 359
    const/high16 v6, 0x42b40000    # 90.0f

    .line 360
    .line 361
    cmpl-float v12, v5, v6

    .line 362
    .line 363
    if-gez v12, :cond_d

    .line 364
    .line 365
    const/high16 v12, -0x3d4c0000    # -90.0f

    .line 366
    .line 367
    cmpg-float v12, v5, v12

    .line 368
    .line 369
    if-gtz v12, :cond_e

    .line 370
    :cond_d
    move v14, v7

    .line 371
    .line 372
    move/from16 v16, v11

    .line 373
    .line 374
    goto/16 :goto_e

    .line 375
    .line 376
    .line 377
    :cond_e
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 378
    move-result v12

    .line 379
    div-float/2addr v12, v6

    .line 380
    float-to-double v12, v12

    .line 381
    .line 382
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    .line 383
    .line 384
    .line 385
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 386
    move-result-wide v12

    .line 387
    double-to-float v6, v12

    .line 388
    .line 389
    iget-boolean v12, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->h:Z

    .line 390
    .line 391
    if-nez v12, :cond_f

    .line 392
    .line 393
    iget-object v12, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->o:Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 397
    move-result v12

    .line 398
    .line 399
    if-nez v12, :cond_f

    .line 400
    .line 401
    aget-object v12, v9, v2

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v12}, Lcom/kubi/resources/widget/wheel/view/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 405
    move-result-object v12

    .line 406
    .line 407
    .line 408
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 409
    move-result v12

    .line 410
    .line 411
    if-nez v12, :cond_f

    .line 412
    .line 413
    new-instance v12, Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 417
    .line 418
    aget-object v13, v9, v2

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0, v13}, Lcom/kubi/resources/widget/wheel/view/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 422
    move-result-object v13

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    iget-object v13, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->o:Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    move-result-object v12

    .line 435
    goto :goto_8

    .line 436
    .line 437
    :cond_f
    aget-object v12, v9, v2

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v12}, Lcom/kubi/resources/widget/wheel/view/WheelView;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 441
    move-result-object v12

    .line 442
    .line 443
    .line 444
    :goto_8
    invoke-virtual {v0, v12}, Lcom/kubi/resources/widget/wheel/view/WheelView;->n(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v12}, Lcom/kubi/resources/widget/wheel/view/WheelView;->k(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v12}, Lcom/kubi/resources/widget/wheel/view/WheelView;->l(Ljava/lang/String;)V

    .line 451
    .line 452
    iget v13, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->M:I

    .line 453
    int-to-double v13, v13

    .line 454
    .line 455
    .line 456
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 457
    move-result-wide v15

    .line 458
    .line 459
    iget v8, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->M:I

    .line 460
    int-to-double v7, v8

    .line 461
    mul-double/2addr v15, v7

    .line 462
    sub-double/2addr v13, v15

    .line 463
    .line 464
    .line 465
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 466
    move-result-wide v7

    .line 467
    .line 468
    iget v15, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

    .line 469
    .line 470
    move-object/from16 v17, v12

    .line 471
    int-to-double v11, v15

    .line 472
    mul-double/2addr v7, v11

    .line 473
    .line 474
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 475
    div-double/2addr v7, v11

    .line 476
    sub-double/2addr v13, v7

    .line 477
    double-to-float v7, v13

    .line 478
    const/4 v8, 0x0

    .line 479
    .line 480
    .line 481
    invoke-virtual {v1, v8, v7}, Landroid/graphics/Canvas;->translate(FF)V

    .line 482
    .line 483
    iget v8, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->B:F

    .line 484
    .line 485
    cmpg-float v11, v7, v8

    .line 486
    .line 487
    .line 488
    const v12, 0x3f4ccccd    # 0.8f

    .line 489
    .line 490
    const/high16 v13, 0x3f800000    # 1.0f

    .line 491
    .line 492
    if-gtz v11, :cond_10

    .line 493
    .line 494
    iget v11, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

    .line 495
    int-to-float v11, v11

    .line 496
    add-float/2addr v11, v7

    .line 497
    .line 498
    cmpl-float v11, v11, v8

    .line 499
    .line 500
    if-ltz v11, :cond_10

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 504
    .line 505
    iget v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 506
    int-to-float v5, v5

    .line 507
    .line 508
    iget v6, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->B:F

    .line 509
    sub-float/2addr v6, v7

    .line 510
    const/4 v8, 0x0

    .line 511
    .line 512
    .line 513
    invoke-virtual {v1, v8, v8, v5, v6}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 514
    .line 515
    .line 516
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 517
    move-result-wide v5

    .line 518
    double-to-float v5, v5

    .line 519
    mul-float/2addr v5, v12

    .line 520
    .line 521
    .line 522
    invoke-virtual {v1, v13, v5}, Landroid/graphics/Canvas;->scale(FF)V

    .line 523
    .line 524
    iget v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->T:I

    .line 525
    int-to-float v5, v5

    .line 526
    .line 527
    iget v6, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

    .line 528
    int-to-float v6, v6

    .line 529
    .line 530
    iget-object v8, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 531
    .line 532
    move-object/from16 v11, v17

    .line 533
    .line 534
    .line 535
    invoke-virtual {v1, v11, v5, v6, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 542
    .line 543
    iget v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->B:F

    .line 544
    sub-float/2addr v5, v7

    .line 545
    .line 546
    iget v6, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 547
    int-to-float v6, v6

    .line 548
    .line 549
    iget v7, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

    .line 550
    float-to-int v7, v7

    .line 551
    int-to-float v7, v7

    .line 552
    const/4 v8, 0x0

    .line 553
    .line 554
    .line 555
    invoke-virtual {v1, v8, v5, v6, v7}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 556
    .line 557
    .line 558
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 559
    move-result-wide v3

    .line 560
    double-to-float v3, v3

    .line 561
    mul-float/2addr v3, v13

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1, v13, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 565
    .line 566
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->S:I

    .line 567
    int-to-float v3, v3

    .line 568
    .line 569
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

    .line 570
    int-to-float v4, v4

    .line 571
    .line 572
    iget v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    .line 573
    sub-float/2addr v4, v5

    .line 574
    .line 575
    iget-object v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1, v11, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 582
    :goto_9
    const/4 v14, 0x0

    .line 583
    .line 584
    const/16 v16, 0x0

    .line 585
    .line 586
    goto/16 :goto_d

    .line 587
    .line 588
    :cond_10
    move-object/from16 v11, v17

    .line 589
    .line 590
    iget v14, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->C:F

    .line 591
    .line 592
    cmpg-float v15, v7, v14

    .line 593
    .line 594
    if-gtz v15, :cond_11

    .line 595
    .line 596
    iget v15, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

    .line 597
    int-to-float v15, v15

    .line 598
    add-float/2addr v15, v7

    .line 599
    .line 600
    cmpl-float v15, v15, v14

    .line 601
    .line 602
    if-ltz v15, :cond_11

    .line 603
    .line 604
    .line 605
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 606
    .line 607
    iget v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 608
    int-to-float v5, v5

    .line 609
    .line 610
    iget v6, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->C:F

    .line 611
    sub-float/2addr v6, v7

    .line 612
    const/4 v8, 0x0

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1, v8, v8, v5, v6}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 616
    .line 617
    .line 618
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 619
    move-result-wide v5

    .line 620
    double-to-float v5, v5

    .line 621
    mul-float/2addr v5, v13

    .line 622
    .line 623
    .line 624
    invoke-virtual {v1, v13, v5}, Landroid/graphics/Canvas;->scale(FF)V

    .line 625
    .line 626
    iget v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->S:I

    .line 627
    int-to-float v5, v5

    .line 628
    .line 629
    iget v6, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

    .line 630
    int-to-float v6, v6

    .line 631
    .line 632
    iget v8, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    .line 633
    sub-float/2addr v6, v8

    .line 634
    .line 635
    iget-object v8, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v1, v11, v5, v6, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 645
    .line 646
    iget v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->C:F

    .line 647
    sub-float/2addr v5, v7

    .line 648
    .line 649
    iget v6, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 650
    int-to-float v6, v6

    .line 651
    .line 652
    iget v7, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

    .line 653
    float-to-int v7, v7

    .line 654
    int-to-float v7, v7

    .line 655
    const/4 v8, 0x0

    .line 656
    .line 657
    .line 658
    invoke-virtual {v1, v8, v5, v6, v7}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 659
    .line 660
    .line 661
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 662
    move-result-wide v3

    .line 663
    double-to-float v3, v3

    .line 664
    mul-float/2addr v3, v12

    .line 665
    .line 666
    .line 667
    invoke-virtual {v1, v13, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 668
    .line 669
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->T:I

    .line 670
    int-to-float v3, v3

    .line 671
    .line 672
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

    .line 673
    int-to-float v4, v4

    .line 674
    .line 675
    iget-object v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v1, v11, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 682
    goto :goto_9

    .line 683
    .line 684
    :cond_11
    cmpl-float v8, v7, v8

    .line 685
    .line 686
    if-ltz v8, :cond_12

    .line 687
    .line 688
    iget v8, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

    .line 689
    int-to-float v15, v8

    .line 690
    add-float/2addr v15, v7

    .line 691
    .line 692
    cmpg-float v7, v15, v14

    .line 693
    .line 694
    if-gtz v7, :cond_12

    .line 695
    int-to-float v3, v8

    .line 696
    .line 697
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->U:F

    .line 698
    sub-float/2addr v3, v4

    .line 699
    .line 700
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->S:I

    .line 701
    int-to-float v4, v4

    .line 702
    .line 703
    iget-object v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v1, v11, v4, v3, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 707
    .line 708
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->H:I

    .line 709
    .line 710
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->J:I

    .line 711
    .line 712
    div-int/lit8 v4, v4, 0x2

    .line 713
    sub-int/2addr v4, v2

    .line 714
    sub-int/2addr v3, v4

    .line 715
    .line 716
    iput v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->G:I

    .line 717
    .line 718
    goto/16 :goto_9

    .line 719
    .line 720
    .line 721
    :cond_12
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 722
    .line 723
    iget v7, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 724
    .line 725
    iget v8, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

    .line 726
    float-to-int v8, v8

    .line 727
    const/4 v14, 0x0

    .line 728
    .line 729
    .line 730
    invoke-virtual {v1, v14, v14, v7, v8}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 731
    .line 732
    .line 733
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 734
    move-result-wide v3

    .line 735
    double-to-float v3, v3

    .line 736
    mul-float/2addr v3, v12

    .line 737
    .line 738
    .line 739
    invoke-virtual {v1, v13, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 740
    .line 741
    iget-object v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 742
    .line 743
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->s:I

    .line 744
    const/4 v7, -0x1

    .line 745
    .line 746
    if-nez v4, :cond_13

    .line 747
    move v4, v14

    .line 748
    .line 749
    :goto_a
    const/16 v16, 0x0

    .line 750
    goto :goto_b

    .line 751
    .line 752
    :cond_13
    if-lez v4, :cond_14

    .line 753
    const/4 v4, 0x1

    .line 754
    goto :goto_a

    .line 755
    :cond_14
    move v4, v7

    .line 756
    goto :goto_a

    .line 757
    .line 758
    :goto_b
    cmpl-float v5, v5, v16

    .line 759
    .line 760
    if-lez v5, :cond_15

    .line 761
    goto :goto_c

    .line 762
    :cond_15
    const/4 v7, 0x1

    .line 763
    :goto_c
    mul-int/2addr v4, v7

    .line 764
    int-to-float v4, v4

    .line 765
    .line 766
    const/high16 v5, 0x3f000000    # 0.5f

    .line 767
    mul-float/2addr v4, v5

    .line 768
    mul-float/2addr v4, v6

    .line 769
    .line 770
    .line 771
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 772
    sub-float/2addr v13, v6

    .line 773
    .line 774
    const/high16 v3, 0x437f0000    # 255.0f

    .line 775
    mul-float/2addr v13, v3

    .line 776
    .line 777
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->w:F

    .line 778
    mul-float/2addr v13, v3

    .line 779
    float-to-int v3, v13

    .line 780
    .line 781
    iget-object v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 785
    .line 786
    iget v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->T:I

    .line 787
    int-to-float v3, v3

    .line 788
    .line 789
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->s:I

    .line 790
    int-to-float v4, v4

    .line 791
    mul-float/2addr v4, v6

    .line 792
    add-float/2addr v3, v4

    .line 793
    .line 794
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->r:I

    .line 795
    int-to-float v4, v4

    .line 796
    .line 797
    iget-object v5, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v1, v11, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 804
    .line 805
    .line 806
    :goto_d
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 807
    .line 808
    iget-object v3, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 809
    .line 810
    iget v4, v0, Lcom/kubi/resources/widget/wheel/view/WheelView;->p:I

    .line 811
    int-to-float v4, v4

    .line 812
    .line 813
    .line 814
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 815
    goto :goto_f

    .line 816
    .line 817
    .line 818
    :goto_e
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 819
    .line 820
    :goto_f
    add-int/lit8 v2, v2, 0x1

    .line 821
    move v7, v14

    .line 822
    .line 823
    move/from16 v11, v16

    .line 824
    const/4 v8, 0x1

    .line 825
    .line 826
    goto/16 :goto_7

    .line 827
    :cond_16
    :goto_10
    return-void
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

.method public onMeasure(II)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->Q:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->o()V

    .line 6
    .line 7
    iget p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->L:I

    .line 8
    .line 9
    iget p2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->K:I

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

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->e:Landroid/view/GestureDetector;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->F:I

    .line 9
    neg-int v1, v1

    .line 10
    int-to-float v1, v1

    .line 11
    .line 12
    iget v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

    .line 13
    mul-float/2addr v1, v2

    .line 14
    .line 15
    iget-object v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 16
    .line 17
    .line 18
    invoke-interface {v2}, Lgx/a;->a()I

    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x1

    .line 21
    sub-int/2addr v2, v3

    .line 22
    .line 23
    iget v4, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->F:I

    .line 24
    sub-int/2addr v2, v4

    .line 25
    int-to-float v2, v2

    .line 26
    .line 27
    iget v4, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

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
    iget v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->M:I

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
    iget v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->M:I

    .line 57
    int-to-double v6, v2

    .line 58
    mul-double/2addr v0, v6

    .line 59
    .line 60
    iget v2, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

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
    iget v1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->E:F

    .line 72
    rem-float/2addr v1, v2

    .line 73
    add-float/2addr v1, v2

    .line 74
    rem-float/2addr v1, v2

    .line 75
    .line 76
    iget v4, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->J:I

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
    iput v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->N:I

    .line 85
    .line 86
    .line 87
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 88
    move-result-wide v0

    .line 89
    .line 90
    iget-wide v4, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->P:J

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
    sget-object v0, Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;->DAGGLE:Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->q(Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;)V

    .line 103
    goto :goto_0

    .line 104
    .line 105
    :cond_0
    sget-object v0, Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;->CLICK:Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->q(Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;)V

    .line 109
    goto :goto_0

    .line 110
    .line 111
    :cond_1
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->O:F

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
    iput v4, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->O:F

    .line 123
    .line 124
    iget v4, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->E:F

    .line 125
    add-float/2addr v4, v0

    .line 126
    .line 127
    iput v4, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->E:F

    .line 128
    .line 129
    iget-boolean v5, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->A:Z

    .line 130
    .line 131
    if-nez v5, :cond_5

    .line 132
    .line 133
    iget v5, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

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
    iput v4, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->E:F

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
    iput-wide v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->P:J

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->b()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 175
    move-result v0

    .line 176
    .line 177
    iput v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->O:F

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
.end method

.method public final p(F)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->b()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    .line 7
    new-instance v1, Ljx/a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Ljx/a;-><init>(Lcom/kubi/resources/widget/wheel/view/WheelView;F)V

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
    iput-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 23
    return-void
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

.method public q(Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->b()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;->FLING:Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;->DAGGLE:Lcom/kubi/resources/widget/wheel/view/WheelView$ACTION;

    .line 10
    .line 11
    if-ne p1, v0, :cond_2

    .line 12
    .line 13
    :cond_0
    iget p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->E:F

    .line 14
    .line 15
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->t:F

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
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->N:I

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
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->N:I

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    neg-int p1, p1

    .line 38
    .line 39
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->N:I

    .line 40
    .line 41
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 42
    .line 43
    new-instance v1, Ljx/c;

    .line 44
    .line 45
    iget p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->N:I

    .line 46
    .line 47
    .line 48
    invoke-direct {v1, p0, p1}, Ljx/c;-><init>(Lcom/kubi/resources/widget/wheel/view/WheelView;I)V

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
    iput-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

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

.method public final setAdapter(Lgx/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->n:Lgx/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->o()V

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

.method public final setCurrentItem(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->G:I

    .line 3
    .line 4
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->F:I

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->E:F

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

.method public final setCyclic(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->A:Z

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
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->y:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->m:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

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

.method public setDividerType(Lcom/kubi/resources/widget/wheel/view/WheelView$DividerType;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->b:Lcom/kubi/resources/widget/wheel/view/WheelView$DividerType;

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

.method public setGravity(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->R:I

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

.method public setIsOptions(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->g:Z

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

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->o:Ljava/lang/String;

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
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->z:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/resources/widget/wheel/view/WheelView;->i()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 14
    return-void
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

.method public final setOnItemSelectedListener(Lix/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->f:Lix/b;

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

.method public setTextColorCenter(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->x:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

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

.method public setTextColorOut(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->v:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

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

.method public setTextColorOutAlpha(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->w:F

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
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 16
    mul-float/2addr v0, p1

    .line 17
    float-to-int p1, v0

    .line 18
    .line 19
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->p:I

    .line 20
    .line 21
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 22
    int-to-float p1, p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 26
    .line 27
    iget-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 28
    .line 29
    iget v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->p:I

    .line 30
    int-to-float v0, v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 34
    :cond_0
    return-void
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

.method public setTextXOffset(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->s:I

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setTotalScrollY(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->E:F

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

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->u:Landroid/graphics/Typeface;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->k:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 8
    .line 9
    iget-object p1, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->l:Landroid/graphics/Paint;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/kubi/resources/widget/wheel/view/WheelView;->u:Landroid/graphics/Typeface;

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
