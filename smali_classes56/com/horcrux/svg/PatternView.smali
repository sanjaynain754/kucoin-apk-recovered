.class Lcom/horcrux/svg/PatternView;
.super Lcom/horcrux/svg/GroupView;
.source "PatternView.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# static fields
.field public static final t:[F


# instance fields
.field public g:Lcom/horcrux/svg/SVGLength;

.field public h:Lcom/horcrux/svg/SVGLength;

.field public i:Lcom/horcrux/svg/SVGLength;

.field public j:Lcom/horcrux/svg/SVGLength;

.field public k:Lcom/horcrux/svg/Brush$BrushUnits;

.field public l:Lcom/horcrux/svg/Brush$BrushUnits;

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:Ljava/lang/String;

.field public r:I

.field public s:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x9

    .line 3
    .line 4
    new-array v0, v0, [F

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    sput-object v0, Lcom/horcrux/svg/PatternView;->t:[F

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/horcrux/svg/GroupView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 4
    const/4 p1, 0x0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->s:Landroid/graphics/Matrix;

    .line 7
    return-void
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
.end method


# virtual methods
.method public getViewBox()Landroid/graphics/RectF;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/RectF;

    .line 3
    .line 4
    iget v1, p0, Lcom/horcrux/svg/PatternView;->m:F

    .line 5
    .line 6
    iget v2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 7
    .line 8
    mul-float v3, v1, v2

    .line 9
    .line 10
    iget v4, p0, Lcom/horcrux/svg/PatternView;->n:F

    .line 11
    .line 12
    mul-float v5, v4, v2

    .line 13
    .line 14
    iget v6, p0, Lcom/horcrux/svg/PatternView;->o:F

    .line 15
    add-float/2addr v1, v6

    .line 16
    mul-float/2addr v1, v2

    .line 17
    .line 18
    iget v6, p0, Lcom/horcrux/svg/PatternView;->p:F

    .line 19
    add-float/2addr v4, v6

    .line 20
    mul-float/2addr v4, v2

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v3, v5, v1, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 24
    return-object v0
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
.end method

.method public q(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->j:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public r(I)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    sget-object p1, Lcom/horcrux/svg/Brush$BrushUnits;->USER_SPACE_ON_USE:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->l:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_1
    sget-object p1, Lcom/horcrux/svg/Brush$BrushUnits;->OBJECT_BOUNDING_BOX:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->l:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public s(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    sget-object v0, Lcom/horcrux/svg/PatternView;->t:[F

    .line 5
    .line 6
    iget v1, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0, v1}, Lcom/horcrux/svg/i;->c(Lcom/facebook/react/bridge/ReadableArray;[FF)I

    .line 10
    move-result p1

    .line 11
    const/4 v1, 0x6

    .line 12
    .line 13
    if-ne p1, v1, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Lcom/horcrux/svg/PatternView;->s:Landroid/graphics/Matrix;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    new-instance p1, Landroid/graphics/Matrix;

    .line 20
    .line 21
    .line 22
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 23
    .line 24
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->s:Landroid/graphics/Matrix;

    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lcom/horcrux/svg/PatternView;->s:Landroid/graphics/Matrix;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, -0x1

    .line 32
    .line 33
    if-eq p1, v0, :cond_3

    .line 34
    .line 35
    const-string p1, "ReactNative"

    .line 36
    .line 37
    const-string v0, "RNSVG: Transform matrices must be of size 6"

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0}, Lx3/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 p1, 0x0

    .line 43
    .line 44
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->s:Landroid/graphics/Matrix;

    .line 45
    .line 46
    .line 47
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 48
    return-void
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
.end method

.method public saveDefinition()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lcom/horcrux/svg/PatternView;->g:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/horcrux/svg/PatternView;->h:Lcom/horcrux/svg/SVGLength;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/horcrux/svg/PatternView;->i:Lcom/horcrux/svg/SVGLength;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/horcrux/svg/PatternView;->j:Lcom/horcrux/svg/SVGLength;

    .line 13
    .line 14
    .line 15
    filled-new-array {v0, v1, v2, v3}, [Lcom/horcrux/svg/SVGLength;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    new-instance v1, Lcom/horcrux/svg/Brush;

    .line 19
    .line 20
    sget-object v2, Lcom/horcrux/svg/Brush$BrushType;->PATTERN:Lcom/horcrux/svg/Brush$BrushType;

    .line 21
    .line 22
    iget-object v3, p0, Lcom/horcrux/svg/PatternView;->k:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, v2, v0, v3}, Lcom/horcrux/svg/Brush;-><init>(Lcom/horcrux/svg/Brush$BrushType;[Lcom/horcrux/svg/SVGLength;Lcom/horcrux/svg/Brush$BrushUnits;)V

    .line 26
    .line 27
    iget-object v0, p0, Lcom/horcrux/svg/PatternView;->l:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lcom/horcrux/svg/Brush;->d(Lcom/horcrux/svg/Brush$BrushUnits;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0}, Lcom/horcrux/svg/Brush;->g(Lcom/horcrux/svg/PatternView;)V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/horcrux/svg/PatternView;->s:Landroid/graphics/Matrix;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lcom/horcrux/svg/Brush;->f(Landroid/graphics/Matrix;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iget-object v2, p0, Lcom/horcrux/svg/PatternView;->k:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 47
    .line 48
    sget-object v3, Lcom/horcrux/svg/Brush$BrushUnits;->USER_SPACE_ON_USE:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 49
    .line 50
    if-eq v2, v3, :cond_1

    .line 51
    .line 52
    iget-object v2, p0, Lcom/horcrux/svg/PatternView;->l:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 53
    .line 54
    if-ne v2, v3, :cond_2

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {v0}, Lcom/horcrux/svg/SvgView;->getCanvasBounds()Landroid/graphics/Rect;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lcom/horcrux/svg/Brush;->h(Landroid/graphics/Rect;)V

    .line 62
    .line 63
    :cond_2
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Lcom/horcrux/svg/SvgView;->defineBrush(Lcom/horcrux/svg/Brush;Ljava/lang/String;)V

    .line 67
    :cond_3
    return-void
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
.end method

.method public setAlign(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->q:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public setMeetOrSlice(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/horcrux/svg/PatternView;->r:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public setMinX(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/horcrux/svg/PatternView;->m:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public setMinY(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/horcrux/svg/PatternView;->n:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public setVbHeight(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/horcrux/svg/PatternView;->p:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public setVbWidth(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/horcrux/svg/PatternView;->o:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public t(I)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    sget-object p1, Lcom/horcrux/svg/Brush$BrushUnits;->USER_SPACE_ON_USE:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->k:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_1
    sget-object p1, Lcom/horcrux/svg/Brush$BrushUnits;->OBJECT_BOUNDING_BOX:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->k:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public u(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->i:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public v(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->g:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public w(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/PatternView;->h:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method
