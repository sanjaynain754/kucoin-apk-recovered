.class public final Lcom/google/android/material/color/utilities/MaterialDynamicColors;
.super Ljava/lang/Object;
.source "MaterialDynamicColors.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# instance fields
.field private final isExtendedFidelity:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isExtendedFidelity:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean p1, p0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isExtendedFidelity:Z

    return-void
.end method

.method public static synthetic A(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->errorContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic A0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static synthetic A1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic B(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->NEARER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x0

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic B0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isFidelity(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicColor;->tone:Ljava/util/function/Function;

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    check-cast p0, Ljava/lang/Double;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 22
    move-result-wide p0

    .line 23
    .line 24
    const-wide/high16 v0, 0x4012000000000000L    # 4.5

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->foregroundTone(DD)D

    .line 28
    move-result-wide p0

    .line 29
    .line 30
    .line 31
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 37
    move-result p0

    .line 38
    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 42
    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    const-wide/16 p0, 0x0

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_1
    const-wide/high16 p0, 0x4059000000000000L    # 100.0

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    .line 55
    :cond_2
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    const-wide p0, 0x4056800000000000L    # 90.0

    .line 63
    goto :goto_1

    .line 64
    .line 65
    :cond_3
    const-wide/high16 p0, 0x403e000000000000L    # 30.0

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 69
    move-result-object p0

    .line 70
    return-object p0
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
    .line 215
.end method

.method public static synthetic B1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic C(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->errorContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->error()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->NEARER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x0

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic C0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic C1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    const-wide/high16 v0, 0x4039000000000000L    # 25.0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_1
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_2
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    move-result-object p0

    .line 37
    return-object p0
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
.end method

.method public static synthetic D(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/TonalPalette;->getKeyColor()Lcom/google/android/material/color/utilities/Hct;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Hct;->getTone()D

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 14
    move-result-object p0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic D0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide v0, 0x4057c00000000000L    # 95.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic D1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic E(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic E0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 11

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4018000000000000L    # 6.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    new-instance v2, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide v3, 0x4055c00000000000L    # 87.0

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    const-wide v5, 0x4055c00000000000L    # 87.0

    .line 20
    .line 21
    const-wide/high16 v7, 0x4054000000000000L    # 80.0

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide v9, 0x4052c00000000000L    # 75.0

    .line 27
    .line 28
    .line 29
    invoke-direct/range {v2 .. v10}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 30
    .line 31
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0, v1}, Lcom/google/android/material/color/utilities/ContrastCurve;->get(D)D

    .line 35
    move-result-wide v0

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 39
    move-result-object p0

    .line 40
    return-object p0
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
.end method

.method public static synthetic E1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralVariantPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic F(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static synthetic F0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public static synthetic F1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic G(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 11

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 7
    .line 8
    const-wide/high16 v2, 0x4028000000000000L    # 12.0

    .line 9
    .line 10
    const-wide/high16 v4, 0x4028000000000000L    # 12.0

    .line 11
    .line 12
    const-wide/high16 v6, 0x4030000000000000L    # 16.0

    .line 13
    .line 14
    const-wide/high16 v8, 0x4034000000000000L    # 20.0

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Lcom/google/android/material/color/utilities/ContrastCurve;->get(D)D

    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    new-instance v2, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    const-wide v3, 0x4057800000000000L    # 94.0

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide v5, 0x4057800000000000L    # 94.0

    .line 37
    .line 38
    const-wide/high16 v7, 0x4057000000000000L    # 92.0

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    const-wide v9, 0x4056800000000000L    # 90.0

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v2 .. v10}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 47
    .line 48
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v0, v1}, Lcom/google/android/material/color/utilities/ContrastCurve;->get(D)D

    .line 52
    move-result-wide v0

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 56
    move-result-object p0

    .line 57
    return-object p0
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
.end method

.method public static synthetic G0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static synthetic G1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isFidelity(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iget-object p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->sourceColorHct:Lcom/google/android/material/color/utilities/Hct;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Hct;->getTone()D

    .line 12
    move-result-wide p0

    .line 13
    .line 14
    .line 15
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 21
    move-result p0

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const-wide p0, 0x4055400000000000L    # 85.0

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    const-wide/high16 p0, 0x4039000000000000L    # 25.0

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    .line 42
    :cond_2
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 43
    .line 44
    if-eqz p0, :cond_3

    .line 45
    .line 46
    const-wide/high16 p0, 0x403e000000000000L    # 30.0

    .line 47
    goto :goto_1

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    :cond_3
    const-wide p0, 0x4056800000000000L    # 90.0

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 56
    move-result-object p0

    .line 57
    return-object p0
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

.method public static synthetic H(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic H0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic H1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic I(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic I0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic I1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static synthetic J(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic J0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    .line 22
    :cond_1
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_2
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    .line 30
    .line 31
    .line 32
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    move-result-object p0

    .line 34
    return-object p0
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
.end method

.method public static synthetic J1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->error()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic K(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic K0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic K1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic L(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 10

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 7
    .line 8
    const-wide/high16 v2, 0x4038000000000000L    # 24.0

    .line 9
    .line 10
    const-wide/high16 v4, 0x4038000000000000L    # 24.0

    .line 11
    .line 12
    const-wide/high16 v6, 0x403d000000000000L    # 29.0

    .line 13
    .line 14
    const-wide/high16 v8, 0x4041000000000000L    # 34.0

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Lcom/google/android/material/color/utilities/ContrastCurve;->get(D)D

    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    :cond_0
    const-wide v0, 0x4058800000000000L    # 98.0

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    move-result-object p0

    .line 34
    return-object p0
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
.end method

.method public static synthetic L0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_1
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_2
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    move-result-object p0

    .line 37
    return-object p0
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
.end method

.method public static synthetic L1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->inverseSurface()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic M(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    .line 21
    :cond_1
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 29
    move-result-object p0

    .line 30
    return-object p0
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
.end method

.method public static synthetic M0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic M1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static synthetic N(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/TonalPalette;->getKeyColor()Lcom/google/android/material/color/utilities/Hct;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Hct;->getTone()D

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 14
    move-result-object p0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic N0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic N1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic O(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public static synthetic O0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic O1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic P(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic P0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic P1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic Q(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const-wide/high16 p0, 0x404e000000000000L    # 60.0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    :cond_0
    const-wide p0, 0x4048800000000000L    # 49.0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isFidelity(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 30
    move-result p0

    .line 31
    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 35
    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    const-wide/high16 p0, 0x403e000000000000L    # 30.0

    .line 39
    goto :goto_1

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    :cond_2
    const-wide p0, 0x4056800000000000L    # 90.0

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    .line 51
    :cond_3
    iget-object p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 52
    .line 53
    iget-object p1, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->sourceColorHct:Lcom/google/android/material/color/utilities/Hct;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/google/android/material/color/utilities/Hct;->getTone()D

    .line 57
    move-result-wide v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/color/utilities/TonalPalette;->getHct(D)Lcom/google/android/material/color/utilities/Hct;

    .line 61
    move-result-object p0

    .line 62
    .line 63
    .line 64
    invoke-static {p0}, Lcom/google/android/material/color/utilities/DislikeAnalyzer;->fixIfDisliked(Lcom/google/android/material/color/utilities/Hct;)Lcom/google/android/material/color/utilities/Hct;

    .line 65
    move-result-object p0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Hct;->getTone()D

    .line 69
    move-result-wide p0

    .line 70
    .line 71
    .line 72
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 73
    move-result-object p0

    .line 74
    return-object p0
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
.end method

.method public static synthetic Q0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic Q1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic R(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralVariantPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic R0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic R1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->errorPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic S(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic S0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 11

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 7
    .line 8
    const-wide/high16 v2, 0x4036000000000000L    # 22.0

    .line 9
    .line 10
    const-wide/high16 v4, 0x4036000000000000L    # 22.0

    .line 11
    .line 12
    const-wide/high16 v6, 0x403a000000000000L    # 26.0

    .line 13
    .line 14
    const-wide/high16 v8, 0x403e000000000000L    # 30.0

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Lcom/google/android/material/color/utilities/ContrastCurve;->get(D)D

    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    new-instance v2, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    const-wide v3, 0x4056800000000000L    # 90.0

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide v5, 0x4056800000000000L    # 90.0

    .line 37
    .line 38
    const-wide/high16 v7, 0x4055000000000000L    # 84.0

    .line 39
    .line 40
    const-wide/high16 v9, 0x4054000000000000L    # 80.0

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v2 .. v10}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 44
    .line 45
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v0, v1}, Lcom/google/android/material/color/utilities/ContrastCurve;->get(D)D

    .line 49
    move-result-wide v0

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 53
    move-result-object p0

    .line 54
    return-object p0
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
.end method

.method public static synthetic S1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->background()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic T(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic T0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic T1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->errorPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic U(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static synthetic U0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public static synthetic U1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-wide/high16 v0, 0x4039000000000000L    # 25.0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic V(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic V0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic V1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic W(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static synthetic W0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic W1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic X(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralVariantPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic X0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic X1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->LIGHTER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x1

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic Y(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic Y0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic Y1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic Z(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static synthetic Z0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->NEARER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x0

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic Z1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic a(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->LIGHTER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x1

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic a0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iget-boolean v0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 6
    .line 7
    const-wide/high16 v1, 0x403e000000000000L    # 30.0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    move-wide v9, v1

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :cond_0
    const-wide v3, 0x4056800000000000L    # 90.0

    .line 17
    move-wide v9, v3

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    goto :goto_1

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    :cond_1
    const-wide v1, 0x4055400000000000L    # 85.0

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-direct {p0, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isFidelity(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 42
    move-result p0

    .line 43
    .line 44
    if-nez p0, :cond_3

    .line 45
    .line 46
    .line 47
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    .line 51
    :cond_3
    iget-object p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/TonalPalette;->getHue()D

    .line 55
    move-result-wide v5

    .line 56
    .line 57
    iget-object p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/TonalPalette;->getChroma()D

    .line 61
    move-result-wide v7

    .line 62
    .line 63
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 64
    .line 65
    xor-int/lit8 v11, p0, 0x1

    .line 66
    .line 67
    .line 68
    invoke-static/range {v5 .. v11}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->findDesiredChromaByTone(DDDZ)D

    .line 69
    move-result-wide p0

    .line 70
    .line 71
    .line 72
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 73
    move-result-object p0

    .line 74
    return-object p0
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
.end method

.method public static synthetic a1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_1
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_2
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    move-result-object p0

    .line 37
    return-object p0
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
.end method

.method public static synthetic a2(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/TonalPalette;->getKeyColor()Lcom/google/android/material/color/utilities/Hct;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Hct;->getTone()D

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 14
    move-result-object p0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic b(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static synthetic b0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 11

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 7
    .line 8
    const-wide/high16 v2, 0x4031000000000000L    # 17.0

    .line 9
    .line 10
    const-wide/high16 v4, 0x4031000000000000L    # 17.0

    .line 11
    .line 12
    const-wide/high16 v6, 0x4035000000000000L    # 21.0

    .line 13
    .line 14
    const-wide/high16 v8, 0x4039000000000000L    # 25.0

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Lcom/google/android/material/color/utilities/ContrastCurve;->get(D)D

    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    new-instance v2, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 27
    .line 28
    const-wide/high16 v3, 0x4057000000000000L    # 92.0

    .line 29
    .line 30
    const-wide/high16 v5, 0x4057000000000000L    # 92.0

    .line 31
    .line 32
    const-wide/high16 v7, 0x4056000000000000L    # 88.0

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide v9, 0x4055400000000000L    # 85.0

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v2 .. v10}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 41
    .line 42
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v0, v1}, Lcom/google/android/material/color/utilities/ContrastCurve;->get(D)D

    .line 46
    move-result-wide v0

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 50
    move-result-object p0

    .line 51
    return-object p0
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
.end method

.method public static synthetic b1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic b2(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic c(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic c0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic c1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic c2(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/TonalPalette;->getKeyColor()Lcom/google/android/material/color/utilities/Hct;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Hct;->getTone()D

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 14
    move-result-object p0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic d(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic d0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic d1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic d2(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic e(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralVariantPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic e0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic e1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->LIGHTER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x1

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic e2(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic f(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->LIGHTER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x1

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic f0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic f1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic f2(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 11

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 7
    .line 8
    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    .line 9
    .line 10
    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    .line 11
    .line 12
    const-wide/high16 v6, 0x4026000000000000L    # 11.0

    .line 13
    .line 14
    const-wide/high16 v8, 0x4028000000000000L    # 12.0

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Lcom/google/android/material/color/utilities/ContrastCurve;->get(D)D

    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    new-instance v2, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 27
    .line 28
    const-wide/high16 v3, 0x4058000000000000L    # 96.0

    .line 29
    .line 30
    const-wide/high16 v5, 0x4058000000000000L    # 96.0

    .line 31
    .line 32
    const-wide/high16 v7, 0x4058000000000000L    # 96.0

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide v9, 0x4057c00000000000L    # 95.0

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v2 .. v10}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 41
    .line 42
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v0, v1}, Lcom/google/android/material/color/utilities/ContrastCurve;->get(D)D

    .line 46
    move-result-wide v0

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 50
    move-result-object p0

    .line 51
    return-object p0
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
.end method

.method public static findDesiredChromaByTone(DDDZ)D
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static/range {p0 .. p5}, Lcom/google/android/material/color/utilities/Hct;->from(DDD)Lcom/google/android/material/color/utilities/Hct;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/Hct;->getChroma()D

    .line 8
    move-result-wide v1

    .line 9
    .line 10
    cmpg-double v1, v1, p2

    .line 11
    .line 12
    if-gez v1, :cond_4

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/Hct;->getChroma()D

    .line 16
    move-result-wide v1

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/Hct;->getChroma()D

    .line 20
    move-result-wide v3

    .line 21
    .line 22
    cmpg-double v3, v3, p2

    .line 23
    .line 24
    if-gez v3, :cond_4

    .line 25
    .line 26
    if-eqz p6, :cond_0

    .line 27
    .line 28
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 29
    goto :goto_1

    .line 30
    .line 31
    :cond_0
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 32
    :goto_1
    add-double/2addr p4, v3

    .line 33
    .line 34
    .line 35
    invoke-static/range {p0 .. p5}, Lcom/google/android/material/color/utilities/Hct;->from(DDD)Lcom/google/android/material/color/utilities/Hct;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Lcom/google/android/material/color/utilities/Hct;->getChroma()D

    .line 40
    move-result-wide v4

    .line 41
    .line 42
    cmpl-double v4, v1, v4

    .line 43
    .line 44
    if-lez v4, :cond_1

    .line 45
    goto :goto_2

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {v3}, Lcom/google/android/material/color/utilities/Hct;->getChroma()D

    .line 49
    move-result-wide v4

    .line 50
    sub-double/2addr v4, p2

    .line 51
    .line 52
    .line 53
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 54
    move-result-wide v4

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    const-wide v6, 0x3fd999999999999aL    # 0.4

    .line 60
    .line 61
    cmpg-double v4, v4, v6

    .line 62
    .line 63
    if-gez v4, :cond_2

    .line 64
    :goto_2
    return-wide p4

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {v3}, Lcom/google/android/material/color/utilities/Hct;->getChroma()D

    .line 68
    move-result-wide v4

    .line 69
    sub-double/2addr v4, p2

    .line 70
    .line 71
    .line 72
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 73
    move-result-wide v4

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/Hct;->getChroma()D

    .line 77
    move-result-wide v6

    .line 78
    sub-double/2addr v6, p2

    .line 79
    .line 80
    .line 81
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    .line 82
    move-result-wide v6

    .line 83
    .line 84
    cmpg-double v4, v4, v6

    .line 85
    .line 86
    if-gez v4, :cond_3

    .line 87
    move-object v0, v3

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v3}, Lcom/google/android/material/color/utilities/Hct;->getChroma()D

    .line 91
    move-result-wide v3

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 95
    move-result-wide v1

    .line 96
    goto :goto_0

    .line 97
    :cond_4
    return-wide p4
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

.method public static synthetic g(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static synthetic g0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic g1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const-wide/16 p0, 0x0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    const-wide/high16 p0, 0x4059000000000000L    # 100.0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isFidelity(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 32
    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    const-wide p0, 0x4056800000000000L    # 90.0

    .line 39
    goto :goto_1

    .line 40
    .line 41
    :cond_2
    const-wide/high16 p0, 0x403e000000000000L    # 30.0

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicColor;->tone:Ljava/util/function/Function;

    .line 53
    .line 54
    .line 55
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    move-result-object p0

    .line 57
    .line 58
    check-cast p0, Ljava/lang/Double;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 62
    move-result-wide p0

    .line 63
    .line 64
    const-wide/high16 v0, 0x4012000000000000L    # 4.5

    .line 65
    .line 66
    .line 67
    invoke-static {p0, p1, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->foregroundTone(DD)D

    .line 68
    move-result-wide p0

    .line 69
    .line 70
    .line 71
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 72
    move-result-object p0

    .line 73
    return-object p0
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
.end method

.method public static synthetic h(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic h0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic h1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->errorPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic i(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic i0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic i1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private isFidelity(Lcom/google/android/material/color/utilities/DynamicScheme;)Z
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isExtendedFidelity:Z

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->variant:Lcom/google/android/material/color/utilities/Variant;

    .line 8
    .line 9
    sget-object v2, Lcom/google/android/material/color/utilities/Variant;->MONOCHROME:Lcom/google/android/material/color/utilities/Variant;

    .line 10
    .line 11
    if-eq v0, v2, :cond_0

    .line 12
    .line 13
    sget-object v2, Lcom/google/android/material/color/utilities/Variant;->NEUTRAL:Lcom/google/android/material/color/utilities/Variant;

    .line 14
    .line 15
    if-eq v0, v2, :cond_0

    .line 16
    return v1

    .line 17
    .line 18
    :cond_0
    iget-object p1, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->variant:Lcom/google/android/material/color/utilities/Variant;

    .line 19
    .line 20
    sget-object v0, Lcom/google/android/material/color/utilities/Variant;->FIDELITY:Lcom/google/android/material/color/utilities/Variant;

    .line 21
    .line 22
    if-eq p1, v0, :cond_2

    .line 23
    .line 24
    sget-object v0, Lcom/google/android/material/color/utilities/Variant;->CONTENT:Lcom/google/android/material/color/utilities/Variant;

    .line 25
    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_2
    :goto_0
    return v1
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
.end method

.method private static isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->variant:Lcom/google/android/material/color/utilities/Variant;

    .line 3
    .line 4
    sget-object v0, Lcom/google/android/material/color/utilities/Variant;->MONOCHROME:Lcom/google/android/material/color/utilities/Variant;

    .line 5
    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
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

.method public static synthetic j(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic j0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic j1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralVariantPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic k(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic k0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic k1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic l(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide v1, 0x4056800000000000L    # 90.0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isFidelity(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-boolean p0, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 35
    .line 36
    if-eqz p0, :cond_2

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_2
    const-wide/high16 v1, 0x403e000000000000L    # 30.0

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 48
    move-result-object p0

    .line 49
    .line 50
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicColor;->tone:Ljava/util/function/Function;

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    move-result-object p0

    .line 55
    .line 56
    check-cast p0, Ljava/lang/Double;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 60
    move-result-wide p0

    .line 61
    .line 62
    const-wide/high16 v0, 0x4012000000000000L    # 4.5

    .line 63
    .line 64
    .line 65
    invoke-static {p0, p1, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->foregroundTone(DD)D

    .line 66
    move-result-wide p0

    .line 67
    .line 68
    .line 69
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 70
    move-result-object p0

    .line 71
    return-object p0
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
.end method

.method public static synthetic l0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic l1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->NEARER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x0

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic m(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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

.method public static synthetic m0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic m1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic n(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic n0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const-wide v0, 0x3fc999999999999aL    # 0.2

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    :cond_0
    const-wide v0, 0x3fbeb851eb851eb8L    # 0.12

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic n1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->errorPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic o(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic o0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic o1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic p(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const-wide v1, 0x4056800000000000L    # 90.0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_1
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    goto :goto_1

    .line 29
    .line 30
    :cond_2
    const-wide/high16 v1, 0x403e000000000000L    # 30.0

    .line 31
    .line 32
    .line 33
    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 34
    move-result-object p0

    .line 35
    return-object p0
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
.end method

.method public static synthetic p0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->errorContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->error()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->NEARER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x0

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic p1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic q(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic q0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    :cond_0
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic q1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic r(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 10

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 7
    .line 8
    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    .line 9
    .line 10
    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    .line 11
    .line 12
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 13
    .line 14
    const-wide/16 v8, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Lcom/google/android/material/color/utilities/ContrastCurve;->get(D)D

    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 30
    move-result-object p0

    .line 31
    return-object p0
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
.end method

.method public static synthetic r0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic r1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic s(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4018000000000000L    # 6.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide v0, 0x4058800000000000L    # 98.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic s0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic s1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic t(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->NEARER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x0

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic t0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->LIGHTER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x1

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic t1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic u(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic u0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralVariantPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/TonalPalette;->getKeyColor()Lcom/google/android/material/color/utilities/Hct;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Hct;->getTone()D

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 14
    move-result-object p0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic u1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->LIGHTER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x1

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic v(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralVariantPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic v0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic v1(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->isMonochrome(Lcom/google/android/material/color/utilities/DynamicScheme;)Z

    .line 4
    move-result p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const-wide v0, 0x4051800000000000L    # 70.0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic w(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->inverseSurface()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic w0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic w1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic x(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic x0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic x1(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic y(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralVariantPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic y0(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const-wide/high16 v0, 0x4018000000000000L    # 6.0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide v0, 0x4058800000000000L    # 98.0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic y1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->NEARER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x0

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic z(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

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

.method public static synthetic z0(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/ToneDeltaPair;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    sget-object v5, Lcom/google/android/material/color/utilities/TonePolarity;->NEARER:Lcom/google/android/material/color/utilities/TonePolarity;

    .line 13
    const/4 v6, 0x0

    .line 14
    .line 15
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/color/utilities/ToneDeltaPair;-><init>(Lcom/google/android/material/color/utilities/DynamicColor;Lcom/google/android/material/color/utilities/DynamicColor;DLcom/google/android/material/color/utilities/TonePolarity;Z)V

    .line 19
    return-object v0
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
.end method

.method public static synthetic z1(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method


# virtual methods
.method public background()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/y2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/y2;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/z2;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/z2;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    const-string v1, "background"

    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 23
    return-object v0
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
.end method

.method public controlActivated()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/u1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/u1;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/v1;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/v1;-><init>()V

    .line 11
    .line 12
    const-string v2, "control_activated"

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
.end method

.method public controlHighlight()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 10
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/r2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/r2;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/s2;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/s2;-><init>()V

    .line 13
    .line 14
    new-instance v9, Lcom/google/android/material/color/utilities/t2;

    .line 15
    .line 16
    .line 17
    invoke-direct {v9}, Lcom/google/android/material/color/utilities/t2;-><init>()V

    .line 18
    .line 19
    const-string v1, "control_highlight"

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct/range {v0 .. v9}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;Ljava/util/function/Function;)V

    .line 28
    return-object v0
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
.end method

.method public controlNormal()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/f1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/f1;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/q1;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/q1;-><init>()V

    .line 11
    .line 12
    const-string v2, "control_normal"

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
.end method

.method public error()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/i0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/i0;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/k0;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/k0;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x401c000000000000L    # 7.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/l0;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/l0;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    const-string v1, "error"

    .line 38
    const/4 v4, 0x1

    .line 39
    move-object v7, v6

    .line 40
    const/4 v6, 0x0

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 44
    return-object v0
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
.end method

.method public errorContainer()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/a1;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/a1;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/b1;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/b1;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4008000000000000L    # 3.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/c1;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/c1;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    const-string v1, "error_container"

    .line 38
    const/4 v4, 0x1

    .line 39
    move-object v7, v6

    .line 40
    const/4 v6, 0x0

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 44
    return-object v0
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
.end method

.method public highestSurface(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 0
    .param p1    # Lcom/google/android/material/color/utilities/DynamicScheme;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-boolean p1, p1, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surfaceBright()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surfaceDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 13
    move-result-object p1

    .line 14
    return-object p1
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

.method public inverseOnSurface()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/u;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/u;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/v;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/v;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/w;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/w;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4026000000000000L    # 11.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4035000000000000L    # 21.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4012000000000000L    # 4.5

    .line 26
    .line 27
    const-wide/high16 v9, 0x401c000000000000L    # 7.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "inverse_on_surface"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public inversePrimary()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/n3;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/n3;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/o3;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/o3;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/p3;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/p3;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x401c000000000000L    # 7.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "inverse_primary"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public inverseSurface()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/s0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/s0;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/t0;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/t0;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    const-string v1, "inverse_surface"

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 23
    return-object v0
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
.end method

.method public neutralPaletteKeyColor()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/n;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/n;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/y;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/y;-><init>()V

    .line 11
    .line 12
    const-string v2, "neutral_palette_key_color"

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
.end method

.method public neutralVariantPaletteKeyColor()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/q4;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/q4;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/r4;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/r4;-><init>()V

    .line 11
    .line 12
    const-string v2, "neutral_variant_palette_key_color"

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
.end method

.method public onBackground()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/c3;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/c3;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/d3;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/d3;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/e3;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/e3;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4012000000000000L    # 4.5

    .line 22
    .line 23
    const-wide/high16 v13, 0x401c000000000000L    # 7.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x4008000000000000L    # 3.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "on_background"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public onError()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/c4;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/c4;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/d4;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/d4;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/e4;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/e4;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4026000000000000L    # 11.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4035000000000000L    # 21.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4012000000000000L    # 4.5

    .line 26
    .line 27
    const-wide/high16 v9, 0x401c000000000000L    # 7.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "on_error"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public onErrorContainer()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/v0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/v0;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/w0;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/w0;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/x0;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/x0;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4026000000000000L    # 11.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "on_error_container"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public onPrimary()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/k3;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/k3;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/l3;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/l3;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/m3;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/m3;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4026000000000000L    # 11.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4035000000000000L    # 21.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4012000000000000L    # 4.5

    .line 26
    .line 27
    const-wide/high16 v9, 0x401c000000000000L    # 7.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "on_primary"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public onPrimaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/h4;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/h4;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/i4;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3, p0}, Lcom/google/android/material/color/utilities/i4;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/j4;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/j4;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4026000000000000L    # 11.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "on_primary_container"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public onPrimaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 17
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 5
    .line 6
    new-instance v3, Lcom/google/android/material/color/utilities/e0;

    .line 7
    .line 8
    .line 9
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/e0;-><init>()V

    .line 10
    .line 11
    new-instance v4, Lcom/google/android/material/color/utilities/f0;

    .line 12
    .line 13
    .line 14
    invoke-direct {v4}, Lcom/google/android/material/color/utilities/f0;-><init>()V

    .line 15
    .line 16
    new-instance v6, Lcom/google/android/material/color/utilities/g0;

    .line 17
    .line 18
    .line 19
    invoke-direct {v6, v0}, Lcom/google/android/material/color/utilities/g0;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 20
    .line 21
    new-instance v7, Lcom/google/android/material/color/utilities/h0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v7, v0}, Lcom/google/android/material/color/utilities/h0;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 25
    .line 26
    new-instance v8, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 27
    .line 28
    const-wide/high16 v13, 0x4026000000000000L    # 11.0

    .line 29
    .line 30
    const-wide/high16 v15, 0x4035000000000000L    # 21.0

    .line 31
    .line 32
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 33
    .line 34
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v8 .. v16}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 38
    const/4 v9, 0x0

    .line 39
    .line 40
    const-string v2, "on_primary_fixed"

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v1
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
.end method

.method public onPrimaryFixedVariant()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 17
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 5
    .line 6
    new-instance v3, Lcom/google/android/material/color/utilities/u3;

    .line 7
    .line 8
    .line 9
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/u3;-><init>()V

    .line 10
    .line 11
    new-instance v4, Lcom/google/android/material/color/utilities/v3;

    .line 12
    .line 13
    .line 14
    invoke-direct {v4}, Lcom/google/android/material/color/utilities/v3;-><init>()V

    .line 15
    .line 16
    new-instance v6, Lcom/google/android/material/color/utilities/w3;

    .line 17
    .line 18
    .line 19
    invoke-direct {v6, v0}, Lcom/google/android/material/color/utilities/w3;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 20
    .line 21
    new-instance v7, Lcom/google/android/material/color/utilities/x3;

    .line 22
    .line 23
    .line 24
    invoke-direct {v7, v0}, Lcom/google/android/material/color/utilities/x3;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 25
    .line 26
    new-instance v8, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 27
    .line 28
    const-wide/high16 v13, 0x401c000000000000L    # 7.0

    .line 29
    .line 30
    const-wide/high16 v15, 0x4026000000000000L    # 11.0

    .line 31
    .line 32
    const-wide/high16 v9, 0x4008000000000000L    # 3.0

    .line 33
    .line 34
    const-wide/high16 v11, 0x4012000000000000L    # 4.5

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v8 .. v16}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 38
    const/4 v9, 0x0

    .line 39
    .line 40
    const-string v2, "on_primary_fixed_variant"

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v1
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
.end method

.method public onSecondary()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/d;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/d;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/e;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/e;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/f;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/f;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4026000000000000L    # 11.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4035000000000000L    # 21.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4012000000000000L    # 4.5

    .line 26
    .line 27
    const-wide/high16 v9, 0x401c000000000000L    # 7.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "on_secondary"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public onSecondaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/b0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/b0;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/c0;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3, p0}, Lcom/google/android/material/color/utilities/c0;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/d0;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/d0;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4026000000000000L    # 11.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "on_secondary_container"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public onSecondaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 17
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 5
    .line 6
    new-instance v3, Lcom/google/android/material/color/utilities/q;

    .line 7
    .line 8
    .line 9
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/q;-><init>()V

    .line 10
    .line 11
    new-instance v4, Lcom/google/android/material/color/utilities/r;

    .line 12
    .line 13
    .line 14
    invoke-direct {v4}, Lcom/google/android/material/color/utilities/r;-><init>()V

    .line 15
    .line 16
    new-instance v6, Lcom/google/android/material/color/utilities/s;

    .line 17
    .line 18
    .line 19
    invoke-direct {v6, v0}, Lcom/google/android/material/color/utilities/s;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 20
    .line 21
    new-instance v7, Lcom/google/android/material/color/utilities/t;

    .line 22
    .line 23
    .line 24
    invoke-direct {v7, v0}, Lcom/google/android/material/color/utilities/t;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 25
    .line 26
    new-instance v8, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 27
    .line 28
    const-wide/high16 v13, 0x4026000000000000L    # 11.0

    .line 29
    .line 30
    const-wide/high16 v15, 0x4035000000000000L    # 21.0

    .line 31
    .line 32
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 33
    .line 34
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v8 .. v16}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 38
    const/4 v9, 0x0

    .line 39
    .line 40
    const-string v2, "on_secondary_fixed"

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v1
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
.end method

.method public onSecondaryFixedVariant()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 17
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 5
    .line 6
    new-instance v3, Lcom/google/android/material/color/utilities/m1;

    .line 7
    .line 8
    .line 9
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/m1;-><init>()V

    .line 10
    .line 11
    new-instance v4, Lcom/google/android/material/color/utilities/n1;

    .line 12
    .line 13
    .line 14
    invoke-direct {v4}, Lcom/google/android/material/color/utilities/n1;-><init>()V

    .line 15
    .line 16
    new-instance v6, Lcom/google/android/material/color/utilities/o1;

    .line 17
    .line 18
    .line 19
    invoke-direct {v6, v0}, Lcom/google/android/material/color/utilities/o1;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 20
    .line 21
    new-instance v7, Lcom/google/android/material/color/utilities/p1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v7, v0}, Lcom/google/android/material/color/utilities/p1;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 25
    .line 26
    new-instance v8, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 27
    .line 28
    const-wide/high16 v13, 0x401c000000000000L    # 7.0

    .line 29
    .line 30
    const-wide/high16 v15, 0x4026000000000000L    # 11.0

    .line 31
    .line 32
    const-wide/high16 v9, 0x4008000000000000L    # 3.0

    .line 33
    .line 34
    const-wide/high16 v11, 0x4012000000000000L    # 4.5

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v8 .. v16}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 38
    const/4 v9, 0x0

    .line 39
    .line 40
    const-string v2, "on_secondary_fixed_variant"

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v1
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
.end method

.method public onSurface()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/m4;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/m4;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/x4;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/x4;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4026000000000000L    # 11.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4035000000000000L    # 21.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4012000000000000L    # 4.5

    .line 26
    .line 27
    const-wide/high16 v9, 0x401c000000000000L    # 7.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "on_surface"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public onSurfaceVariant()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/q0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/q0;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/r0;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/r0;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4026000000000000L    # 11.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "on_surface_variant"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public onTertiary()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/f3;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/f3;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/q3;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/q3;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/b4;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/b4;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4026000000000000L    # 11.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4035000000000000L    # 21.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4012000000000000L    # 4.5

    .line 26
    .line 27
    const-wide/high16 v9, 0x401c000000000000L    # 7.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "on_tertiary"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public onTertiaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/x;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/x;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/z;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3, p0}, Lcom/google/android/material/color/utilities/z;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/a0;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/a0;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4026000000000000L    # 11.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "on_tertiary_container"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public onTertiaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 17
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 5
    .line 6
    new-instance v3, Lcom/google/android/material/color/utilities/l2;

    .line 7
    .line 8
    .line 9
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/l2;-><init>()V

    .line 10
    .line 11
    new-instance v4, Lcom/google/android/material/color/utilities/m2;

    .line 12
    .line 13
    .line 14
    invoke-direct {v4}, Lcom/google/android/material/color/utilities/m2;-><init>()V

    .line 15
    .line 16
    new-instance v6, Lcom/google/android/material/color/utilities/n2;

    .line 17
    .line 18
    .line 19
    invoke-direct {v6, v0}, Lcom/google/android/material/color/utilities/n2;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 20
    .line 21
    new-instance v7, Lcom/google/android/material/color/utilities/o2;

    .line 22
    .line 23
    .line 24
    invoke-direct {v7, v0}, Lcom/google/android/material/color/utilities/o2;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 25
    .line 26
    new-instance v8, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 27
    .line 28
    const-wide/high16 v13, 0x4026000000000000L    # 11.0

    .line 29
    .line 30
    const-wide/high16 v15, 0x4035000000000000L    # 21.0

    .line 31
    .line 32
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 33
    .line 34
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v8 .. v16}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 38
    const/4 v9, 0x0

    .line 39
    .line 40
    const-string v2, "on_tertiary_fixed"

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v1
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
.end method

.method public onTertiaryFixedVariant()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 17
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 5
    .line 6
    new-instance v3, Lcom/google/android/material/color/utilities/z1;

    .line 7
    .line 8
    .line 9
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/z1;-><init>()V

    .line 10
    .line 11
    new-instance v4, Lcom/google/android/material/color/utilities/a2;

    .line 12
    .line 13
    .line 14
    invoke-direct {v4}, Lcom/google/android/material/color/utilities/a2;-><init>()V

    .line 15
    .line 16
    new-instance v6, Lcom/google/android/material/color/utilities/b2;

    .line 17
    .line 18
    .line 19
    invoke-direct {v6, v0}, Lcom/google/android/material/color/utilities/b2;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 20
    .line 21
    new-instance v7, Lcom/google/android/material/color/utilities/c2;

    .line 22
    .line 23
    .line 24
    invoke-direct {v7, v0}, Lcom/google/android/material/color/utilities/c2;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 25
    .line 26
    new-instance v8, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 27
    .line 28
    const-wide/high16 v13, 0x401c000000000000L    # 7.0

    .line 29
    .line 30
    const-wide/high16 v15, 0x4026000000000000L    # 11.0

    .line 31
    .line 32
    const-wide/high16 v9, 0x4008000000000000L    # 3.0

    .line 33
    .line 34
    const-wide/high16 v11, 0x4012000000000000L    # 4.5

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v8 .. v16}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 38
    const/4 v9, 0x0

    .line 39
    .line 40
    const-string v2, "on_tertiary_fixed_variant"

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v1 .. v9}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v1
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
.end method

.method public outline()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/l;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/l;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/m;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/m;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4012000000000000L    # 4.5

    .line 22
    .line 23
    const-wide/high16 v13, 0x401c000000000000L    # 7.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    .line 26
    .line 27
    const-wide/high16 v9, 0x4008000000000000L    # 3.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "outline"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public outlineVariant()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/g3;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/g3;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/h3;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/h3;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4008000000000000L    # 3.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    const/4 v8, 0x0

    .line 32
    .line 33
    const-string v1, "outline_variant"

    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 40
    return-object v0
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
.end method

.method public primary()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/h1;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/h1;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/i1;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/i1;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x401c000000000000L    # 7.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/j1;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/j1;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "primary"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public primaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/v2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/v2;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/w2;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3, p0}, Lcom/google/android/material/color/utilities/w2;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4008000000000000L    # 3.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/x2;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/x2;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "primary_container"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public primaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/z4;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/z4;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/a5;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/a5;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4008000000000000L    # 3.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/b5;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/b5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "primary_fixed"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public primaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/c5;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/c5;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/d5;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/d5;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4008000000000000L    # 3.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/e5;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/e5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "primary_fixed_dim"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public primaryPaletteKeyColor()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/w1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/w1;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/x1;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/x1;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "primary_palette_key_color"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public scrim()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/k1;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/k1;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/l1;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/l1;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "scrim"

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public secondary()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/g;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/g;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/h;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/h;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x401c000000000000L    # 7.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/i;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/i;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "secondary"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public secondaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/h2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/h2;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/i2;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3, p0}, Lcom/google/android/material/color/utilities/i2;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4008000000000000L    # 3.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/k2;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/k2;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "secondary_container"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public secondaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/r3;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/r3;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/s3;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/s3;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4008000000000000L    # 3.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/t3;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/t3;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "secondary_fixed"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public secondaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/k4;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/k4;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/l4;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/l4;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4008000000000000L    # 3.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/n4;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/n4;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "secondary_fixed_dim"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public secondaryPaletteKeyColor()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/d2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/d2;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/e2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/e2;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "secondary_palette_key_color"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public shadow()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/u4;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/u4;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/v4;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/v4;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "shadow"

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public surface()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/c;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/c;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/y1;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/y1;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "surface"

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public surfaceBright()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/i3;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/i3;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/j3;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/j3;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "surface_bright"

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public surfaceContainer()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/o0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/o0;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/p0;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/p0;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "surface_container"

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public surfaceContainerHigh()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/a3;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/a3;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/b3;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/b3;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "surface_container_high"

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public surfaceContainerHighest()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/w4;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/w4;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/y4;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/y4;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "surface_container_highest"

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public surfaceContainerLow()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/f2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/f2;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/g2;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/g2;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "surface_container_low"

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public surfaceContainerLowest()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/j;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/j;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/k;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/k;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "surface_container_lowest"

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public surfaceDim()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/j0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/j0;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/u0;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/u0;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "surface_dim"

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public surfaceTint()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/o;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/o;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/p;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/p;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "surface_tint"

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public surfaceVariant()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/o4;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/o4;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/p4;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/p4;-><init>()V

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "surface_variant"

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

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
.end method

.method public tertiary()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/r1;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/r1;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/s1;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/s1;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x401c000000000000L    # 7.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x401c000000000000L    # 7.0

    .line 24
    .line 25
    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/t1;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/t1;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "tertiary"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public tertiaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/f5;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/f5;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/g5;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3, p0}, Lcom/google/android/material/color/utilities/g5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4008000000000000L    # 3.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/h5;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/h5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "tertiary_container"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public tertiaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/d1;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/d1;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/e1;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/e1;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4008000000000000L    # 3.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/g1;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/g1;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "tertiary_fixed"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public tertiaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 3
    .line 4
    new-instance v2, Lcom/google/android/material/color/utilities/y3;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Lcom/google/android/material/color/utilities/y3;-><init>()V

    .line 8
    .line 9
    new-instance v3, Lcom/google/android/material/color/utilities/z3;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3}, Lcom/google/android/material/color/utilities/z3;-><init>()V

    .line 13
    .line 14
    new-instance v5, Lcom/google/android/material/color/utilities/i5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, p0}, Lcom/google/android/material/color/utilities/i5;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 18
    .line 19
    new-instance v6, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    .line 21
    const-wide/high16 v11, 0x4008000000000000L    # 3.0

    .line 22
    .line 23
    const-wide/high16 v13, 0x4012000000000000L    # 4.5

    .line 24
    .line 25
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v14}, Lcom/google/android/material/color/utilities/ContrastCurve;-><init>(DDDD)V

    .line 31
    .line 32
    new-instance v8, Lcom/google/android/material/color/utilities/a4;

    .line 33
    .line 34
    .line 35
    invoke-direct {v8, p0}, Lcom/google/android/material/color/utilities/a4;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "tertiary_fixed_dim"

    .line 39
    const/4 v4, 0x1

    .line 40
    move-object v7, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v8}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Ljava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 45
    return-object v0
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
.end method

.method public tertiaryPaletteKeyColor()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/p2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/p2;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/q2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/q2;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "tertiary_palette_key_color"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public textHintInverse()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/s4;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/s4;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/t4;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/t4;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "text_hint_inverse"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public textPrimaryInverse()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/m0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/m0;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/n0;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/n0;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "text_primary_inverse"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public textPrimaryInverseDisableOnly()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/f4;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/f4;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/g4;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/g4;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "text_primary_inverse_disable_only"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public textSecondaryAndTertiaryInverse()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/y0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/y0;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/z0;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/z0;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "text_secondary_and_tertiary_inverse"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public textSecondaryAndTertiaryInverseDisabled()Lcom/google/android/material/color/utilities/DynamicColor;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/j2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/j2;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/color/utilities/u2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/color/utilities/u2;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "text_secondary_and_tertiary_inverse_disabled"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Lcom/google/android/material/color/utilities/DynamicColor;->fromPalette(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method
