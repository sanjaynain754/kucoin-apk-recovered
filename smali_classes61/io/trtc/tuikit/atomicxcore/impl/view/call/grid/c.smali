.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public final e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    .line 11
    const/16 p1, -0x63

    .line 12
    .line 13
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->e:Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a()V

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final a(II)Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;
    .locals 6

    .line 16
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x4

    if-nez p2, :cond_8

    if-ne p1, v3, :cond_0

    .line 17
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_0
    if-eq p1, v2, :cond_6

    if-ne p1, v4, :cond_1

    goto :goto_0

    :cond_1
    if-ne p1, v1, :cond_3

    .line 18
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    if-ltz p1, :cond_2

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_2
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    .line 19
    :cond_3
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    if-nez p1, :cond_4

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->e:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_4
    if-ne p1, v3, :cond_5

    .line 20
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->f:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_5
    if-ne p1, v2, :cond_15

    .line 21
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    .line 22
    :cond_6
    :goto_0
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    if-ltz p1, :cond_7

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_7
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_8
    sub-int v5, p1, p2

    if-eq v5, v3, :cond_f

    if-eq v5, v2, :cond_b

    if-le p1, v4, :cond_9

    .line 23
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    if-ne v1, p2, :cond_9

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->e:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_9
    if-le p1, v4, :cond_a

    .line 24
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    add-int/lit8 v3, p2, 0x1

    if-ne v1, v3, :cond_a

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->f:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_a
    if-le p1, v4, :cond_15

    .line 25
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    add-int/2addr p2, v2

    if-ne p1, p2, :cond_15

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_b
    if-ne p1, v4, :cond_c

    .line 26
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_c
    if-le p1, v4, :cond_d

    .line 27
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    if-ne v1, p2, :cond_d

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->e:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_d
    if-le p1, v4, :cond_e

    .line 28
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    add-int/lit8 v3, p2, 0x1

    if-ne v1, v3, :cond_e

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->f:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_e
    if-le p1, v4, :cond_15

    .line 29
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    add-int/2addr p2, v2

    if-ne p1, p2, :cond_15

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_f
    if-ne p1, v1, :cond_10

    .line 30
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_10
    if-le p1, v4, :cond_11

    .line 31
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    add-int/lit8 v3, p1, -0x1

    if-ne v1, v3, :cond_11

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->e:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_11
    if-ne p1, v4, :cond_12

    .line 32
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_12
    if-le p1, v4, :cond_13

    .line 33
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    if-ne v1, p2, :cond_13

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->e:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_13
    if-le p1, v4, :cond_14

    .line 34
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    add-int/lit8 v3, p2, 0x1

    if-ne v1, v3, :cond_14

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->f:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_14
    if-le p1, v4, :cond_15

    .line 35
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    add-int/2addr p2, v2

    if-ne p1, p2, :cond_15

    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;->g:Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    return-object p1

    :cond_15
    return-object v0
.end method

.method public final a()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    const-string/jumbo v2, "window"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/WindowManager;

    .line 3
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 4
    new-instance v4, Landroid/util/DisplayMetrics;

    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 5
    invoke-virtual {v0, v4}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 6
    iget v0, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 7
    iput v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->c:I

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/WindowManager;

    .line 10
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 11
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 13
    iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 14
    iput v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->d:I

    .line 15
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->c:I

    iput v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->b:I

    return-void
.end method

.method public final getShowLargeViewIndex()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

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
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 10
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
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    move-result p1

    .line 5
    .line 6
    iget p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->b:I

    .line 7
    .line 8
    div-int/lit8 p2, p2, 0x3

    .line 9
    const/4 p3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p3}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a(II)Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    .line 13
    move-result-object p4

    .line 14
    .line 15
    new-instance p5, Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    .line 19
    move v0, p3

    .line 20
    move v1, v0

    .line 21
    .line 22
    :goto_0
    if-ge v0, p1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 26
    move-result p4

    .line 27
    .line 28
    .line 29
    packed-switch p4, :pswitch_data_0

    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :pswitch_0
    new-instance p4, Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 39
    .line 40
    .line 41
    invoke-direct {v2, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 47
    .line 48
    add-int v3, v1, p2

    .line 49
    .line 50
    .line 51
    invoke-direct {v2, p3, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 57
    .line 58
    mul-int/lit8 v3, p2, 0x2

    .line 59
    .line 60
    .line 61
    invoke-direct {v2, p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    invoke-virtual {p5, p4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 68
    :goto_1
    add-int/2addr v1, v3

    .line 69
    .line 70
    :goto_2
    add-int/lit8 v0, v0, 0x3

    .line 71
    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :pswitch_1
    new-instance p4, Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 80
    .line 81
    .line 82
    invoke-direct {v2, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 88
    .line 89
    mul-int/lit8 v3, p2, 0x2

    .line 90
    .line 91
    .line 92
    invoke-direct {v2, p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 98
    .line 99
    add-int v4, v1, p2

    .line 100
    .line 101
    .line 102
    invoke-direct {v2, p3, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {p5, p4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 109
    goto :goto_1

    .line 110
    .line 111
    :pswitch_2
    new-instance p4, Ljava/util/ArrayList;

    .line 112
    .line 113
    .line 114
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 117
    .line 118
    mul-int/lit8 v3, p2, 0x2

    .line 119
    .line 120
    .line 121
    invoke-direct {v2, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 127
    .line 128
    .line 129
    invoke-direct {v2, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 135
    .line 136
    add-int v4, v1, p2

    .line 137
    .line 138
    .line 139
    invoke-direct {v2, v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {p5, p4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 146
    goto :goto_1

    .line 147
    .line 148
    :pswitch_3
    new-instance p4, Ljava/util/ArrayList;

    .line 149
    .line 150
    .line 151
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 154
    .line 155
    .line 156
    invoke-direct {v2, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 162
    .line 163
    .line 164
    invoke-direct {v2, p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 170
    .line 171
    mul-int/lit8 v3, p2, 0x2

    .line 172
    .line 173
    .line 174
    invoke-direct {v2, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    invoke-virtual {p5, p4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 181
    add-int/2addr v1, p2

    .line 182
    goto :goto_2

    .line 183
    .line 184
    :pswitch_4
    mul-int/lit8 p4, p2, 0x3

    .line 185
    .line 186
    div-int/lit8 v2, p4, 0x2

    .line 187
    .line 188
    new-instance v3, Ljava/util/ArrayList;

    .line 189
    .line 190
    .line 191
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 194
    .line 195
    .line 196
    invoke-direct {v4, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 202
    .line 203
    .line 204
    invoke-direct {v4, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 210
    .line 211
    add-int v5, v1, v2

    .line 212
    .line 213
    .line 214
    invoke-direct {v4, p3, v5}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 220
    .line 221
    .line 222
    invoke-direct {v4, v2, v5}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    invoke-virtual {p5, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 229
    add-int/2addr v1, p4

    .line 230
    .line 231
    add-int/lit8 v0, v0, 0x4

    .line 232
    goto :goto_3

    .line 233
    .line 234
    :pswitch_5
    mul-int/lit8 p4, p2, 0x3

    .line 235
    .line 236
    div-int/lit8 v2, p4, 0x2

    .line 237
    .line 238
    new-instance v3, Ljava/util/ArrayList;

    .line 239
    .line 240
    .line 241
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 242
    .line 243
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 244
    .line 245
    .line 246
    invoke-direct {v4, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 252
    .line 253
    .line 254
    invoke-direct {v4, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 260
    .line 261
    div-int/lit8 v5, v2, 0x2

    .line 262
    add-int/2addr v2, v1

    .line 263
    .line 264
    .line 265
    invoke-direct {v4, v5, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    invoke-virtual {p5, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 272
    add-int/2addr v1, p4

    .line 273
    .line 274
    goto/16 :goto_2

    .line 275
    .line 276
    :pswitch_6
    new-instance p4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 277
    .line 278
    mul-int/lit8 v2, p2, 0x3

    .line 279
    .line 280
    .line 281
    invoke-direct {p4, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;-><init>(II)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p5, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 285
    add-int/2addr v1, v2

    .line 286
    .line 287
    add-int/lit8 v0, v0, 0x1

    .line 288
    .line 289
    .line 290
    :goto_3
    invoke-virtual {p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a(II)Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/b;

    .line 291
    move-result-object p4

    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :cond_0
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    .line 296
    const/4 p2, 0x4

    .line 297
    .line 298
    if-lez p1, :cond_4

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 302
    move-result p1

    .line 303
    .line 304
    if-gt p1, p2, :cond_4

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 308
    move-result p1

    .line 309
    move p2, p3

    .line 310
    .line 311
    :goto_4
    if-ge p2, p1, :cond_2

    .line 312
    .line 313
    .line 314
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 315
    move-result-object p4

    .line 316
    .line 317
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    .line 318
    .line 319
    if-eq p2, v0, :cond_1

    .line 320
    .line 321
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->e:Ljava/util/ArrayList;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    goto :goto_5

    .line 326
    .line 327
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->e:Ljava/util/ArrayList;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, p3, p4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 331
    .line 332
    :goto_5
    add-int/lit8 p2, p2, 0x1

    .line 333
    goto :goto_4

    .line 334
    .line 335
    :cond_2
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->e:Ljava/util/ArrayList;

    .line 336
    .line 337
    .line 338
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 339
    move-result p1

    .line 340
    .line 341
    :goto_6
    if-ge p3, p1, :cond_3

    .line 342
    .line 343
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->e:Ljava/util/ArrayList;

    .line 344
    .line 345
    .line 346
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 347
    move-result-object p2

    .line 348
    .line 349
    const-string p4, "get(...)"

    .line 350
    .line 351
    .line 352
    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 353
    .line 354
    check-cast p2, Landroid/view/View;

    .line 355
    .line 356
    .line 357
    invoke-virtual {p5, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 358
    move-result-object p4

    .line 359
    .line 360
    check-cast p4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 361
    .line 362
    iget v0, p4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;->a:I

    .line 363
    .line 364
    iget v1, p4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;->b:I

    .line 365
    .line 366
    .line 367
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 368
    move-result v2

    .line 369
    .line 370
    iget v3, p4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;->a:I

    .line 371
    add-int/2addr v2, v3

    .line 372
    .line 373
    .line 374
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 375
    move-result v3

    .line 376
    .line 377
    iget p4, p4, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;->b:I

    .line 378
    add-int/2addr v3, p4

    .line 379
    .line 380
    .line 381
    invoke-virtual {p2, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 382
    .line 383
    add-int/lit8 p3, p3, 0x1

    .line 384
    goto :goto_6

    .line 385
    .line 386
    :cond_3
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->e:Ljava/util/ArrayList;

    .line 387
    .line 388
    .line 389
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 390
    return-void

    .line 391
    .line 392
    .line 393
    :cond_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 394
    move-result p1

    .line 395
    const/4 p4, 0x2

    .line 396
    .line 397
    if-gt p1, p4, :cond_5

    .line 398
    .line 399
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    .line 400
    .line 401
    if-gez p1, :cond_5

    .line 402
    .line 403
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->c:I

    .line 404
    .line 405
    iget p4, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->d:I

    .line 406
    .line 407
    if-ge p1, p4, :cond_5

    .line 408
    .line 409
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->b:I

    .line 410
    div-int/2addr p1, p2

    .line 411
    goto :goto_7

    .line 412
    :cond_5
    move p1, p3

    .line 413
    .line 414
    .line 415
    :goto_7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 416
    move-result p2

    .line 417
    .line 418
    :goto_8
    if-ge p3, p2, :cond_6

    .line 419
    .line 420
    .line 421
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 422
    move-result-object p4

    .line 423
    .line 424
    .line 425
    invoke-virtual {p5, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 426
    move-result-object v0

    .line 427
    .line 428
    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;

    .line 429
    .line 430
    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;->a:I

    .line 431
    .line 432
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;->b:I

    .line 433
    add-int/2addr v2, p1

    .line 434
    .line 435
    .line 436
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 437
    move-result v3

    .line 438
    .line 439
    iget v4, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;->a:I

    .line 440
    add-int/2addr v3, v4

    .line 441
    .line 442
    .line 443
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 444
    move-result v4

    .line 445
    .line 446
    iget v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/a;->b:I

    .line 447
    add-int/2addr v4, v0

    .line 448
    add-int/2addr v4, p1

    .line 449
    .line 450
    .line 451
    invoke-virtual {p4, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 452
    .line 453
    add-int/lit8 p3, p3, 0x1

    .line 454
    goto :goto_8

    .line 455
    :cond_6
    return-void

    .line 456
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onMeasure(II)V
    .locals 6

    .line 1
    .line 2
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->c:I

    .line 3
    .line 4
    const/high16 p2, 0x40000000    # 2.0f

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 8
    move-result p1

    .line 9
    .line 10
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->b:I

    .line 11
    .line 12
    div-int/lit8 v1, v0, 0x3

    .line 13
    add-int/2addr v1, v0

    .line 14
    .line 15
    .line 16
    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 17
    move-result v0

    .line 18
    .line 19
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x4

    .line 22
    const/4 v4, 0x2

    .line 23
    .line 24
    if-gez v1, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 28
    move-result v0

    .line 29
    .line 30
    if-gt v0, v4, :cond_1

    .line 31
    .line 32
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->b:I

    .line 33
    div-int/2addr v0, v4

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 37
    move-result v1

    .line 38
    .line 39
    if-gt v1, v4, :cond_0

    .line 40
    .line 41
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    .line 42
    .line 43
    if-gez v1, :cond_0

    .line 44
    .line 45
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->c:I

    .line 46
    .line 47
    iget v5, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->d:I

    .line 48
    .line 49
    if-ge v1, v5, :cond_0

    .line 50
    .line 51
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->b:I

    .line 52
    div-int/2addr v1, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v1, v2

    .line 55
    :goto_0
    add-int/2addr v1, v0

    .line 56
    .line 57
    .line 58
    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 59
    move-result v0

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_1
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->b:I

    .line 63
    .line 64
    .line 65
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 66
    move-result v0

    .line 67
    .line 68
    .line 69
    :cond_2
    :goto_1
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 73
    move-result p1

    .line 74
    .line 75
    :goto_2
    if-ge v2, p1, :cond_6

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    const-string v1, "getChildAt(...)"

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 88
    move-result v1

    .line 89
    .line 90
    if-gt v1, v3, :cond_3

    .line 91
    .line 92
    iget v5, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    .line 93
    .line 94
    if-ne v5, v2, :cond_3

    .line 95
    .line 96
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->b:I

    .line 97
    goto :goto_3

    .line 98
    .line 99
    :cond_3
    if-gt v1, v3, :cond_4

    .line 100
    .line 101
    iget v5, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    .line 102
    .line 103
    if-gez v5, :cond_4

    .line 104
    .line 105
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->b:I

    .line 106
    div-int/2addr v1, v4

    .line 107
    goto :goto_3

    .line 108
    .line 109
    :cond_4
    if-le v1, v3, :cond_5

    .line 110
    .line 111
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

    .line 112
    .line 113
    if-ne v1, v2, :cond_5

    .line 114
    .line 115
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->b:I

    .line 116
    .line 117
    div-int/lit8 v1, v1, 0x3

    .line 118
    mul-int/2addr v1, v4

    .line 119
    goto :goto_3

    .line 120
    .line 121
    :cond_5
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->b:I

    .line 122
    .line 123
    div-int/lit8 v1, v1, 0x3

    .line 124
    .line 125
    .line 126
    :goto_3
    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 127
    move-result v1

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0, v1, v1}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 131
    .line 132
    add-int/lit8 v2, v2, 0x1

    .line 133
    goto :goto_2

    .line 134
    :cond_6
    return-void
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
.end method

.method public final setShowLargeViewIndex(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/c;->a:I

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
.end method
