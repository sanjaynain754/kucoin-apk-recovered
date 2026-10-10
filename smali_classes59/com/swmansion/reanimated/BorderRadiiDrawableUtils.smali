.class public Lcom/swmansion/reanimated/BorderRadiiDrawableUtils;
.super Ljava/lang/Object;
.source "BorderRadiiDrawableUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static getBorderRadii(Landroid/view/View;)Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->BORDER_RADIUS:Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v1, v2}, Lcom/swmansion/reanimated/BorderRadiiDrawableUtils;->getRadiusForCorner(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;F)F

    .line 9
    move-result v1

    .line 10
    .line 11
    sget-object v2, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->BORDER_TOP_LEFT_RADIUS:Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    .line 12
    .line 13
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v2, v3}, Lcom/swmansion/reanimated/BorderRadiiDrawableUtils;->getRadiusForCorner(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;F)F

    .line 17
    move-result v2

    .line 18
    .line 19
    sget-object v4, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->BORDER_TOP_RIGHT_RADIUS:Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v4, v3}, Lcom/swmansion/reanimated/BorderRadiiDrawableUtils;->getRadiusForCorner(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;F)F

    .line 23
    move-result v4

    .line 24
    .line 25
    sget-object v5, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->BORDER_BOTTOM_LEFT_RADIUS:Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v5, v3}, Lcom/swmansion/reanimated/BorderRadiiDrawableUtils;->getRadiusForCorner(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;F)F

    .line 29
    move-result v5

    .line 30
    .line 31
    sget-object v6, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->BORDER_BOTTOM_RIGHT_RADIUS:Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v6, v3}, Lcom/swmansion/reanimated/BorderRadiiDrawableUtils;->getRadiusForCorner(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;F)F

    .line 35
    move-result p0

    .line 36
    move v3, v4

    .line 37
    move v4, v5

    .line 38
    move v5, p0

    .line 39
    .line 40
    .line 41
    invoke-direct/range {v0 .. v5}, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;-><init>(FFFFF)V

    .line 42
    return-object v0
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
.end method

.method private static getRadiusForCorner(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;F)F
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->getBorderRadius(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;)Lcom/facebook/react/uimanager/LengthPercentage;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    return p2

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 19
    move-result p2

    .line 20
    int-to-float p2, p2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 24
    move-result p0

    .line 25
    int-to-float p0, p0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2, p0}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(FF)Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 29
    move-result-object p0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/style/CornerRadii;->toPixelFromDIP()Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/style/CornerRadii;->getHorizontal()F

    .line 37
    move-result p0

    .line 38
    return p0
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
.end method
