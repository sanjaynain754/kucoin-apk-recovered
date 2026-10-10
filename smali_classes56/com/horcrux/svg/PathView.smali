.class Lcom/horcrux/svg/PathView;
.super Lcom/horcrux/svg/RenderableView;
.source "PathView.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field public b:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 4
    .line 5
    iget p1, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 6
    .line 7
    sput p1, Lcom/horcrux/svg/g;->a:F

    .line 8
    .line 9
    new-instance p1, Landroid/graphics/Path;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 13
    .line 14
    iput-object p1, p0, Lcom/horcrux/svg/PathView;->b:Landroid/graphics/Path;

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
.end method


# virtual methods
.method public f(Ljava/lang/String;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/g;->o(Ljava/lang/String;)Landroid/graphics/Path;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/PathView;->b:Landroid/graphics/Path;

    .line 7
    .line 8
    sget-object p1, Lcom/horcrux/svg/g;->f:Ljava/util/ArrayList;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Lcom/horcrux/svg/f;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/horcrux/svg/f;->b:[Lcom/horcrux/svg/h;

    .line 29
    array-length v1, v0

    .line 30
    const/4 v2, 0x0

    .line 31
    .line 32
    :goto_0
    if-ge v2, v1, :cond_0

    .line 33
    .line 34
    aget-object v3, v0, v2

    .line 35
    .line 36
    iget-wide v4, v3, Lcom/horcrux/svg/h;->a:D

    .line 37
    .line 38
    iget v6, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 39
    float-to-double v7, v6

    .line 40
    mul-double/2addr v4, v7

    .line 41
    .line 42
    iput-wide v4, v3, Lcom/horcrux/svg/h;->a:D

    .line 43
    .line 44
    iget-wide v4, v3, Lcom/horcrux/svg/h;->b:D

    .line 45
    float-to-double v6, v6

    .line 46
    mul-double/2addr v4, v6

    .line 47
    .line 48
    iput-wide v4, v3, Lcom/horcrux/svg/h;->b:D

    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    goto :goto_0

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 55
    return-void
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

.method public getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lcom/horcrux/svg/PathView;->b:Landroid/graphics/Path;

    .line 3
    return-object p1
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
.end method
