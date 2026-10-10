.class public final Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;
.super Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;
.source "DimmingViewManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001eR\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001eR\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u001eR\u001c\u0010+\u001a\n (*\u0004\u0018\u00010\'0\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*\u00a8\u0006,"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;",
        "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;",
        "Lcom/swmansion/rnscreens/Screen;",
        "screen",
        "Landroid/view/View;",
        "viewToAnimate",
        "",
        "maxAlpha",
        "<init>",
        "(Lcom/swmansion/rnscreens/Screen;Landroid/view/View;F)V",
        "bottomSheet",
        "",
        "newState",
        "",
        "onStateChanged",
        "(Landroid/view/View;I)V",
        "slideOffset",
        "onSlide",
        "(Landroid/view/View;F)V",
        "index",
        "c",
        "(I)F",
        "b",
        "Lcom/swmansion/rnscreens/Screen;",
        "getScreen",
        "()Lcom/swmansion/rnscreens/Screen;",
        "Landroid/view/View;",
        "getViewToAnimate",
        "()Landroid/view/View;",
        "d",
        "F",
        "getMaxAlpha",
        "()F",
        "e",
        "largestUndimmedOffset",
        "f",
        "firstDimmedOffset",
        "g",
        "intervalLength",
        "Landroid/animation/ValueAnimator;",
        "kotlin.jvm.PlatformType",
        "h",
        "Landroid/animation/ValueAnimator;",
        "animator",
        "react-native-screens_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Lcom/swmansion/rnscreens/Screen;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:F

.field public e:F

.field public f:F

.field public g:F

.field public final h:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Lcom/swmansion/rnscreens/Screen;Landroid/view/View;F)V
    .locals 2
    .param p1    # Lcom/swmansion/rnscreens/Screen;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "screen"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "viewToAnimate"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->b:Lcom/swmansion/rnscreens/Screen;

    .line 18
    .line 19
    iput-object p2, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->c:Landroid/view/View;

    .line 20
    .line 21
    iput p3, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->d:F

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/Screen;->getSheetLargestUndimmedDetentIndex()I

    .line 25
    move-result p2

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->c(I)F

    .line 29
    move-result p2

    .line 30
    .line 31
    iput p2, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->e:F

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/Screen;->getSheetLargestUndimmedDetentIndex()I

    .line 35
    move-result p2

    .line 36
    const/4 v0, 0x1

    .line 37
    add-int/2addr p2, v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/Screen;->getSheetDetents()Ljava/util/List;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 45
    move-result p1

    .line 46
    sub-int/2addr p1, v0

    .line 47
    const/4 v1, 0x0

    .line 48
    .line 49
    .line 50
    invoke-static {p2, v1, p1}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 51
    move-result p1

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->c(I)F

    .line 55
    move-result p1

    .line 56
    .line 57
    iput p1, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->f:F

    .line 58
    .line 59
    iget p2, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->e:F

    .line 60
    sub-float/2addr p1, p2

    .line 61
    .line 62
    iput p1, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->g:F

    .line 63
    const/4 p1, 0x2

    .line 64
    .line 65
    new-array p1, p1, [F

    .line 66
    const/4 p2, 0x0

    .line 67
    .line 68
    aput p2, p1, v1

    .line 69
    .line 70
    aput p3, p1, v0

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    const-wide/16 p2, 0x1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p2, p3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 80
    .line 81
    new-instance p2, Lub0/b;

    .line 82
    .line 83
    .line 84
    invoke-direct {p2, p0}, Lub0/b;-><init>(Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 88
    .line 89
    iput-object p1, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->h:Landroid/animation/ValueAnimator;

    .line 90
    return-void
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
.end method

.method public static synthetic a(Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->b(Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;Landroid/animation/ValueAnimator;)V

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
.end method

.method public static final b(Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p0, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->c:Landroid/view/View;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    const-string/jumbo v0, "null cannot be cast to non-null type kotlin.Float"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    check-cast p1, Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 23
    move-result p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 27
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
.end method


# virtual methods
.method public final c(I)F
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->b:Lcom/swmansion/rnscreens/Screen;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/Screen;->getSheetDetents()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    move-result v0

    .line 11
    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    const/4 v2, -0x1

    .line 14
    const/4 v3, 0x1

    .line 15
    .line 16
    const/high16 v4, -0x40800000    # -1.0f

    .line 17
    .line 18
    if-eq v0, v3, :cond_9

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x2

    .line 21
    .line 22
    if-eq v0, v6, :cond_5

    .line 23
    const/4 v7, 0x3

    .line 24
    .line 25
    if-eq v0, v7, :cond_0

    .line 26
    return v4

    .line 27
    .line 28
    :cond_0
    if-eq p1, v2, :cond_4

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    if-eq p1, v3, :cond_2

    .line 33
    .line 34
    if-eq p1, v6, :cond_1

    .line 35
    return v4

    .line 36
    :cond_1
    return v1

    .line 37
    .line 38
    :cond_2
    iget-object p1, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->b:Lcom/swmansion/rnscreens/Screen;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/Screen;->getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getHalfExpandedRatio()F

    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_3
    return v5

    .line 52
    :cond_4
    return v4

    .line 53
    .line 54
    :cond_5
    if-eq p1, v2, :cond_8

    .line 55
    .line 56
    if-eqz p1, :cond_7

    .line 57
    .line 58
    if-eq p1, v3, :cond_6

    .line 59
    return v4

    .line 60
    :cond_6
    return v1

    .line 61
    :cond_7
    return v5

    .line 62
    :cond_8
    return v4

    .line 63
    .line 64
    :cond_9
    if-eq p1, v2, :cond_b

    .line 65
    .line 66
    if-eqz p1, :cond_a

    .line 67
    return v4

    .line 68
    :cond_a
    return v1

    .line 69
    :cond_b
    return v4
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
.end method

.method public onSlide(Landroid/view/View;F)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "bottomSheet"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget p1, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->e:F

    .line 8
    .line 9
    cmpg-float v0, p1, p2

    .line 10
    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    iget v0, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->f:F

    .line 14
    .line 15
    cmpg-float v0, p2, v0

    .line 16
    .line 17
    if-gez v0, :cond_0

    .line 18
    sub-float/2addr p2, p1

    .line 19
    .line 20
    iget p1, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->g:F

    .line 21
    div-float/2addr p2, p1

    .line 22
    .line 23
    iget-object p1, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->h:Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->setCurrentFraction(F)V

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
.end method

.method public onStateChanged(Landroid/view/View;I)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "bottomSheet"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 p1, 0x1

    .line 7
    .line 8
    if-eq p2, p1, :cond_0

    .line 9
    const/4 v0, 0x2

    .line 10
    .line 11
    if-eq p2, v0, :cond_0

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    iget-object p2, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->b:Lcom/swmansion/rnscreens/Screen;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/Screen;->getSheetLargestUndimmedDetentIndex()I

    .line 18
    move-result p2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p2}, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->c(I)F

    .line 22
    move-result p2

    .line 23
    .line 24
    iput p2, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->e:F

    .line 25
    .line 26
    iget-object p2, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->b:Lcom/swmansion/rnscreens/Screen;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/Screen;->getSheetLargestUndimmedDetentIndex()I

    .line 30
    move-result p2

    .line 31
    add-int/2addr p2, p1

    .line 32
    .line 33
    iget-object v0, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->b:Lcom/swmansion/rnscreens/Screen;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/Screen;->getSheetDetents()Ljava/util/List;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 41
    move-result v0

    .line 42
    sub-int/2addr v0, p1

    .line 43
    const/4 p1, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static {p2, p1, v0}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 47
    move-result p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->c(I)F

    .line 51
    move-result p1

    .line 52
    .line 53
    iput p1, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->f:F

    .line 54
    .line 55
    iget p2, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->e:F

    .line 56
    sub-float/2addr p1, p2

    .line 57
    .line 58
    iput p1, p0, Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager$a;->g:F

    .line 59
    return-void
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
.end method
