.class public Lcom/google/android/material/color/utilities/SchemeFruitSalad;
.super Lcom/google/android/material/color/utilities/DynamicScheme;
.source "SchemeFruitSalad.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/material/color/utilities/Hct;ZD)V
    .locals 11

    .line 1
    .line 2
    sget-object v2, Lcom/google/android/material/color/utilities/Variant;->FRUIT_SALAD:Lcom/google/android/material/color/utilities/Variant;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/material/color/utilities/Hct;->getHue()D

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    const-wide/high16 v3, 0x4049000000000000L    # 50.0

    .line 9
    sub-double/2addr v0, v3

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/google/android/material/color/utilities/MathUtils;->sanitizeDegreesDouble(D)D

    .line 13
    move-result-wide v0

    .line 14
    .line 15
    const-wide/high16 v5, 0x4048000000000000L    # 48.0

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v5, v6}, Lcom/google/android/material/color/utilities/TonalPalette;->fromHueAndChroma(DD)Lcom/google/android/material/color/utilities/TonalPalette;

    .line 19
    move-result-object v6

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/google/android/material/color/utilities/Hct;->getHue()D

    .line 23
    move-result-wide v0

    .line 24
    sub-double/2addr v0, v3

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lcom/google/android/material/color/utilities/MathUtils;->sanitizeDegreesDouble(D)D

    .line 28
    move-result-wide v0

    .line 29
    .line 30
    const-wide/high16 v3, 0x4042000000000000L    # 36.0

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, v3, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->fromHueAndChroma(DD)Lcom/google/android/material/color/utilities/TonalPalette;

    .line 34
    move-result-object v7

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/google/android/material/color/utilities/Hct;->getHue()D

    .line 38
    move-result-wide v0

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1, v3, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->fromHueAndChroma(DD)Lcom/google/android/material/color/utilities/TonalPalette;

    .line 42
    move-result-object v8

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/google/android/material/color/utilities/Hct;->getHue()D

    .line 46
    move-result-wide v0

    .line 47
    .line 48
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1, v3, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->fromHueAndChroma(DD)Lcom/google/android/material/color/utilities/TonalPalette;

    .line 52
    move-result-object v9

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/google/android/material/color/utilities/Hct;->getHue()D

    .line 56
    move-result-wide v0

    .line 57
    .line 58
    const-wide/high16 v3, 0x4030000000000000L    # 16.0

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1, v3, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->fromHueAndChroma(DD)Lcom/google/android/material/color/utilities/TonalPalette;

    .line 62
    move-result-object v10

    .line 63
    move-object v0, p0

    .line 64
    move-object v1, p1

    .line 65
    move v3, p2

    .line 66
    move-wide v4, p3

    .line 67
    .line 68
    .line 69
    invoke-direct/range {v0 .. v10}, Lcom/google/android/material/color/utilities/DynamicScheme;-><init>(Lcom/google/android/material/color/utilities/Hct;Lcom/google/android/material/color/utilities/Variant;ZDLcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/TonalPalette;)V

    .line 70
    return-void
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
.end method
