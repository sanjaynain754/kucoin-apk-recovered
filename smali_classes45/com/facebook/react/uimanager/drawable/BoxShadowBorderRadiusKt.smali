.class public final Lcom/facebook/react/uimanager/drawable/BoxShadowBorderRadiusKt;
.super Ljava/lang/Object;
.source "BoxShadowBorderRadius.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "adjustRadiusForSpread",
        "",
        "radius",
        "spread",
        "ReactAndroid_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final adjustRadiusForSpread(FF)F
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 4
    move-result v0

    .line 5
    .line 6
    cmpg-float v0, p0, v0

    .line 7
    .line 8
    if-gez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    int-to-float v0, v0

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 14
    move-result v1

    .line 15
    .line 16
    div-float v1, p0, v1

    .line 17
    sub-float/2addr v1, v0

    .line 18
    float-to-double v1, v1

    .line 19
    const/4 v3, 0x3

    .line 20
    int-to-double v3, v3

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 24
    move-result-wide v1

    .line 25
    double-to-float v1, v1

    .line 26
    add-float/2addr v0, v1

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 30
    :goto_0
    mul-float/2addr p1, v0

    .line 31
    add-float/2addr p0, p1

    .line 32
    const/4 p1, 0x0

    .line 33
    .line 34
    .line 35
    invoke-static {p0, p1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 36
    move-result p0

    .line 37
    return p0
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
