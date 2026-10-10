.class abstract Lcom/google/android/material/carousel/CarouselOrientationHelper;
.super Ljava/lang/Object;
.source "CarouselOrientationHelper.java"


# instance fields
.field final orientation:I


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/google/android/material/carousel/CarouselOrientationHelper;->orientation:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/google/android/material/carousel/CarouselOrientationHelper$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/material/carousel/CarouselOrientationHelper;-><init>(I)V

    return-void
.end method

.method private static createHorizontalHelper(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lcom/google/android/material/carousel/CarouselOrientationHelper;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1, p0}, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;-><init>(ILcom/google/android/material/carousel/CarouselLayoutManager;)V

    .line 7
    return-object v0
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

.method public static createOrientationHelper(Lcom/google/android/material/carousel/CarouselLayoutManager;I)Lcom/google/android/material/carousel/CarouselOrientationHelper;
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->createVerticalHelper(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string p1, "invalid orientation"

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    throw p0

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-static {p0}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->createHorizontalHelper(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 22
    move-result-object p0

    .line 23
    return-object p0
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

.method private static createVerticalHelper(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lcom/google/android/material/carousel/CarouselOrientationHelper;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/carousel/CarouselOrientationHelper$1;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1, p0}, Lcom/google/android/material/carousel/CarouselOrientationHelper$1;-><init>(ILcom/google/android/material/carousel/CarouselLayoutManager;)V

    .line 7
    return-object v0
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
.method public abstract containMaskWithinBounds(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
.end method

.method public abstract getDecoratedCrossAxisMeasurement(Landroid/view/View;)I
.end method

.method public abstract getMaskMargins(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)F
.end method

.method public abstract getMaskRect(FFFF)Landroid/graphics/RectF;
.end method

.method public abstract getParentBottom()I
.end method

.method public abstract getParentEnd()I
.end method

.method public abstract getParentLeft()I
.end method

.method public abstract getParentRight()I
.end method

.method public abstract getParentStart()I
.end method

.method public abstract getParentTop()I
.end method

.method public abstract layoutDecoratedWithMargins(Landroid/view/View;II)V
.end method

.method public abstract moveMaskOnEdgeOutsideBounds(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
.end method

.method public abstract offsetChild(Landroid/view/View;Landroid/graphics/Rect;FF)V
.end method
