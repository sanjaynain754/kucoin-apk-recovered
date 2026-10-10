.class public final Lcom/google/android/material/shape/MaterialShapes;
.super Ljava/lang/Object;
.source "MaterialShapes.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;
    }
.end annotation


# static fields
.field public static final ARCH:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final ARROW:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final BOOM:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final BUN:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final BURST:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final CIRCLE:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final CLAM_SHELL:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final CLOVER_4:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final CLOVER_8:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final COOKIE_12:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final COOKIE_4:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final COOKIE_6:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final COOKIE_7:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final COOKIE_9:Landroidx/graphics/shapes/RoundedPolygon;

.field private static final CORNER_ROUND_100:Landroidx/graphics/shapes/CornerRounding;

.field private static final CORNER_ROUND_15:Landroidx/graphics/shapes/CornerRounding;

.field private static final CORNER_ROUND_20:Landroidx/graphics/shapes/CornerRounding;

.field private static final CORNER_ROUND_30:Landroidx/graphics/shapes/CornerRounding;

.field private static final CORNER_ROUND_50:Landroidx/graphics/shapes/CornerRounding;

.field public static final DIAMOND:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final FAN:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final FLOWER:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final GEM:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final GHOSTISH:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final HEART:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final OVAL:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final PENTAGON:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final PILL:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final PIXEL_CIRCLE:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final PIXEL_TRIANGLE:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final PUFFY:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final PUFFY_DIAMOND:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final SEMI_CIRCLE:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final SLANTED_SQUARE:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final SOFT_BOOM:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final SOFT_BURST:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final SQUARE:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final SUNNY:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final TRIANGLE:Landroidx/graphics/shapes/RoundedPolygon;

.field public static final VERY_SUNNY:Landroidx/graphics/shapes/RoundedPolygon;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroidx/graphics/shapes/CornerRounding;

    .line 3
    .line 4
    .line 5
    const v1, 0x3e19999a    # 0.15f

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 10
    .line 11
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_15:Landroidx/graphics/shapes/CornerRounding;

    .line 12
    .line 13
    new-instance v0, Landroidx/graphics/shapes/CornerRounding;

    .line 14
    .line 15
    .line 16
    const v1, 0x3e4ccccd    # 0.2f

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 20
    .line 21
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_20:Landroidx/graphics/shapes/CornerRounding;

    .line 22
    .line 23
    new-instance v0, Landroidx/graphics/shapes/CornerRounding;

    .line 24
    .line 25
    .line 26
    const v1, 0x3e99999a    # 0.3f

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 30
    .line 31
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_30:Landroidx/graphics/shapes/CornerRounding;

    .line 32
    .line 33
    new-instance v0, Landroidx/graphics/shapes/CornerRounding;

    .line 34
    .line 35
    const/high16 v1, 0x3f000000    # 0.5f

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 39
    .line 40
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_50:Landroidx/graphics/shapes/CornerRounding;

    .line 41
    .line 42
    new-instance v0, Landroidx/graphics/shapes/CornerRounding;

    .line 43
    .line 44
    const/high16 v1, 0x3f800000    # 1.0f

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 48
    .line 49
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_100:Landroidx/graphics/shapes/CornerRounding;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getCircle()Landroidx/graphics/shapes/RoundedPolygon;

    .line 53
    move-result-object v0

    .line 54
    const/4 v1, 0x1

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->CIRCLE:Landroidx/graphics/shapes/RoundedPolygon;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getSquare()Landroidx/graphics/shapes/RoundedPolygon;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->SQUARE:Landroidx/graphics/shapes/RoundedPolygon;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getSlantedSquare()Landroidx/graphics/shapes/RoundedPolygon;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->SLANTED_SQUARE:Landroidx/graphics/shapes/RoundedPolygon;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getArch()Landroidx/graphics/shapes/RoundedPolygon;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->ARCH:Landroidx/graphics/shapes/RoundedPolygon;

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getFan()Landroidx/graphics/shapes/RoundedPolygon;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->FAN:Landroidx/graphics/shapes/RoundedPolygon;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getArrow()Landroidx/graphics/shapes/RoundedPolygon;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->ARROW:Landroidx/graphics/shapes/RoundedPolygon;

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getSemiCircle()Landroidx/graphics/shapes/RoundedPolygon;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->SEMI_CIRCLE:Landroidx/graphics/shapes/RoundedPolygon;

    .line 121
    .line 122
    const/high16 v0, -0x3dcc0000    # -45.0f

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, Lcom/google/android/material/shape/MaterialShapes;->getOval(F)Landroidx/graphics/shapes/RoundedPolygon;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->OVAL:Landroidx/graphics/shapes/RoundedPolygon;

    .line 133
    .line 134
    .line 135
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getPill()Landroidx/graphics/shapes/RoundedPolygon;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    .line 139
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->PILL:Landroidx/graphics/shapes/RoundedPolygon;

    .line 143
    .line 144
    const/high16 v0, -0x3d4c0000    # -90.0f

    .line 145
    .line 146
    .line 147
    invoke-static {v0}, Lcom/google/android/material/shape/MaterialShapes;->getTriangle(F)Landroidx/graphics/shapes/RoundedPolygon;

    .line 148
    move-result-object v2

    .line 149
    .line 150
    .line 151
    invoke-static {v2, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 152
    move-result-object v2

    .line 153
    .line 154
    sput-object v2, Lcom/google/android/material/shape/MaterialShapes;->TRIANGLE:Landroidx/graphics/shapes/RoundedPolygon;

    .line 155
    .line 156
    .line 157
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getDiamond()Landroidx/graphics/shapes/RoundedPolygon;

    .line 158
    move-result-object v2

    .line 159
    .line 160
    .line 161
    invoke-static {v2, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 162
    move-result-object v2

    .line 163
    .line 164
    sput-object v2, Lcom/google/android/material/shape/MaterialShapes;->DIAMOND:Landroidx/graphics/shapes/RoundedPolygon;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getClamShell()Landroidx/graphics/shapes/RoundedPolygon;

    .line 168
    move-result-object v2

    .line 169
    .line 170
    .line 171
    invoke-static {v2, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 172
    move-result-object v2

    .line 173
    .line 174
    sput-object v2, Lcom/google/android/material/shape/MaterialShapes;->CLAM_SHELL:Landroidx/graphics/shapes/RoundedPolygon;

    .line 175
    .line 176
    .line 177
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getPentagon()Landroidx/graphics/shapes/RoundedPolygon;

    .line 178
    move-result-object v2

    .line 179
    .line 180
    .line 181
    invoke-static {v2, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 182
    move-result-object v2

    .line 183
    .line 184
    sput-object v2, Lcom/google/android/material/shape/MaterialShapes;->PENTAGON:Landroidx/graphics/shapes/RoundedPolygon;

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Lcom/google/android/material/shape/MaterialShapes;->getGem(F)Landroidx/graphics/shapes/RoundedPolygon;

    .line 188
    move-result-object v0

    .line 189
    .line 190
    .line 191
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 192
    move-result-object v0

    .line 193
    .line 194
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->GEM:Landroidx/graphics/shapes/RoundedPolygon;

    .line 195
    .line 196
    .line 197
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getSunny()Landroidx/graphics/shapes/RoundedPolygon;

    .line 198
    move-result-object v0

    .line 199
    .line 200
    .line 201
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 202
    move-result-object v0

    .line 203
    .line 204
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->SUNNY:Landroidx/graphics/shapes/RoundedPolygon;

    .line 205
    .line 206
    .line 207
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getVerySunny()Landroidx/graphics/shapes/RoundedPolygon;

    .line 208
    move-result-object v0

    .line 209
    .line 210
    .line 211
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 212
    move-result-object v0

    .line 213
    .line 214
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->VERY_SUNNY:Landroidx/graphics/shapes/RoundedPolygon;

    .line 215
    .line 216
    .line 217
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getCookie4()Landroidx/graphics/shapes/RoundedPolygon;

    .line 218
    move-result-object v0

    .line 219
    .line 220
    .line 221
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 222
    move-result-object v0

    .line 223
    .line 224
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->COOKIE_4:Landroidx/graphics/shapes/RoundedPolygon;

    .line 225
    .line 226
    .line 227
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getCookie6()Landroidx/graphics/shapes/RoundedPolygon;

    .line 228
    move-result-object v0

    .line 229
    .line 230
    .line 231
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 232
    move-result-object v0

    .line 233
    .line 234
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->COOKIE_6:Landroidx/graphics/shapes/RoundedPolygon;

    .line 235
    .line 236
    .line 237
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getCookie7()Landroidx/graphics/shapes/RoundedPolygon;

    .line 238
    move-result-object v0

    .line 239
    .line 240
    .line 241
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 242
    move-result-object v0

    .line 243
    .line 244
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->COOKIE_7:Landroidx/graphics/shapes/RoundedPolygon;

    .line 245
    .line 246
    .line 247
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getCookie9()Landroidx/graphics/shapes/RoundedPolygon;

    .line 248
    move-result-object v0

    .line 249
    .line 250
    .line 251
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 252
    move-result-object v0

    .line 253
    .line 254
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->COOKIE_9:Landroidx/graphics/shapes/RoundedPolygon;

    .line 255
    .line 256
    .line 257
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getCookie12()Landroidx/graphics/shapes/RoundedPolygon;

    .line 258
    move-result-object v0

    .line 259
    .line 260
    .line 261
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 262
    move-result-object v0

    .line 263
    .line 264
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->COOKIE_12:Landroidx/graphics/shapes/RoundedPolygon;

    .line 265
    .line 266
    .line 267
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getGhostish()Landroidx/graphics/shapes/RoundedPolygon;

    .line 268
    move-result-object v0

    .line 269
    .line 270
    .line 271
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 272
    move-result-object v0

    .line 273
    .line 274
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->GHOSTISH:Landroidx/graphics/shapes/RoundedPolygon;

    .line 275
    .line 276
    .line 277
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getClover4()Landroidx/graphics/shapes/RoundedPolygon;

    .line 278
    move-result-object v0

    .line 279
    .line 280
    .line 281
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 282
    move-result-object v0

    .line 283
    .line 284
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->CLOVER_4:Landroidx/graphics/shapes/RoundedPolygon;

    .line 285
    .line 286
    .line 287
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getClover8()Landroidx/graphics/shapes/RoundedPolygon;

    .line 288
    move-result-object v0

    .line 289
    .line 290
    .line 291
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 292
    move-result-object v0

    .line 293
    .line 294
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->CLOVER_8:Landroidx/graphics/shapes/RoundedPolygon;

    .line 295
    .line 296
    .line 297
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getBurst()Landroidx/graphics/shapes/RoundedPolygon;

    .line 298
    move-result-object v0

    .line 299
    .line 300
    .line 301
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 302
    move-result-object v0

    .line 303
    .line 304
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->BURST:Landroidx/graphics/shapes/RoundedPolygon;

    .line 305
    .line 306
    .line 307
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getSoftBurst()Landroidx/graphics/shapes/RoundedPolygon;

    .line 308
    move-result-object v0

    .line 309
    .line 310
    .line 311
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 312
    move-result-object v0

    .line 313
    .line 314
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->SOFT_BURST:Landroidx/graphics/shapes/RoundedPolygon;

    .line 315
    .line 316
    .line 317
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getBoom()Landroidx/graphics/shapes/RoundedPolygon;

    .line 318
    move-result-object v0

    .line 319
    .line 320
    .line 321
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 322
    move-result-object v0

    .line 323
    .line 324
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->BOOM:Landroidx/graphics/shapes/RoundedPolygon;

    .line 325
    .line 326
    .line 327
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getSoftBoom()Landroidx/graphics/shapes/RoundedPolygon;

    .line 328
    move-result-object v0

    .line 329
    .line 330
    .line 331
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 332
    move-result-object v0

    .line 333
    .line 334
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->SOFT_BOOM:Landroidx/graphics/shapes/RoundedPolygon;

    .line 335
    .line 336
    .line 337
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getFlower()Landroidx/graphics/shapes/RoundedPolygon;

    .line 338
    move-result-object v0

    .line 339
    .line 340
    .line 341
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 342
    move-result-object v0

    .line 343
    .line 344
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->FLOWER:Landroidx/graphics/shapes/RoundedPolygon;

    .line 345
    .line 346
    .line 347
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getPuffy()Landroidx/graphics/shapes/RoundedPolygon;

    .line 348
    move-result-object v0

    .line 349
    .line 350
    .line 351
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 352
    move-result-object v0

    .line 353
    .line 354
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->PUFFY:Landroidx/graphics/shapes/RoundedPolygon;

    .line 355
    .line 356
    .line 357
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getPuffyDiamond()Landroidx/graphics/shapes/RoundedPolygon;

    .line 358
    move-result-object v0

    .line 359
    .line 360
    .line 361
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 362
    move-result-object v0

    .line 363
    .line 364
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->PUFFY_DIAMOND:Landroidx/graphics/shapes/RoundedPolygon;

    .line 365
    .line 366
    .line 367
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getPixelCircle()Landroidx/graphics/shapes/RoundedPolygon;

    .line 368
    move-result-object v0

    .line 369
    .line 370
    .line 371
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 372
    move-result-object v0

    .line 373
    .line 374
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->PIXEL_CIRCLE:Landroidx/graphics/shapes/RoundedPolygon;

    .line 375
    .line 376
    .line 377
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getPixelTriangle()Landroidx/graphics/shapes/RoundedPolygon;

    .line 378
    move-result-object v0

    .line 379
    .line 380
    .line 381
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 382
    move-result-object v0

    .line 383
    .line 384
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->PIXEL_TRIANGLE:Landroidx/graphics/shapes/RoundedPolygon;

    .line 385
    .line 386
    .line 387
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getBun()Landroidx/graphics/shapes/RoundedPolygon;

    .line 388
    move-result-object v0

    .line 389
    .line 390
    .line 391
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 392
    move-result-object v0

    .line 393
    .line 394
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->BUN:Landroidx/graphics/shapes/RoundedPolygon;

    .line 395
    .line 396
    .line 397
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getHeart()Landroidx/graphics/shapes/RoundedPolygon;

    .line 398
    move-result-object v0

    .line 399
    .line 400
    .line 401
    invoke-static {v0, v1}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;

    .line 402
    move-result-object v0

    .line 403
    .line 404
    sput-object v0, Lcom/google/android/material/shape/MaterialShapes;->HEART:Landroidx/graphics/shapes/RoundedPolygon;

    .line 405
    return-void
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
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
.end method

.method private constructor <init>()V
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
    .line 18
.end method

.method public static createRotationMatrix(F)Landroid/graphics/Matrix;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 9
    return-object v0
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

.method public static createScaleMatrix(FF)Landroid/graphics/Matrix;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0, p1}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 9
    return-object v0
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

.method public static createShapeDrawable(Landroidx/graphics/shapes/RoundedPolygon;)Landroid/graphics/drawable/ShapeDrawable;
    .locals 2
    .param p0    # Landroidx/graphics/shapes/RoundedPolygon;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/drawable/shapes/PathShape;

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Landroidx/graphics/shapes/Shapes_androidKt;->toPath(Landroidx/graphics/shapes/RoundedPolygon;)Landroid/graphics/Path;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0, v1, v1}, Landroid/graphics/drawable/shapes/PathShape;-><init>(Landroid/graphics/Path;FF)V

    .line 12
    .line 13
    new-instance p0, Landroid/graphics/drawable/ShapeDrawable;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static createSkewMatrix(FF)Landroid/graphics/Matrix;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0, p1}, Landroid/graphics/Matrix;->setSkew(FF)V

    .line 9
    return-object v0
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

.method private static customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;
    .locals 6
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;",
            ">;IFFZ)",
            "Landroidx/graphics/shapes/RoundedPolygon;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v1, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    move-object v0, p0

    .line 7
    move v2, p1

    .line 8
    move v3, p2

    .line 9
    move v4, p3

    .line 10
    move v5, p4

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lcom/google/android/material/shape/MaterialShapes;->repeatAroundCenter(Ljava/util/List;Ljava/util/List;IFFZ)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lcom/google/android/material/shape/MaterialShapes;->toVerticesXyArray(Ljava/util/List;)[F

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/google/android/material/shape/MaterialShapes;->toRoundingsList(Ljava/util/List;)Ljava/util/List;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    sget-object p2, Landroidx/graphics/shapes/CornerRounding;->Unrounded:Landroidx/graphics/shapes/CornerRounding;

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p2, p1, v3, v4}, Landroidx/graphics/shapes/RoundedPolygonKt;->RoundedPolygon([FLandroidx/graphics/shapes/CornerRounding;Ljava/util/List;FF)Landroidx/graphics/shapes/RoundedPolygon;

    .line 27
    move-result-object p0

    .line 28
    return-object p0
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
.end method

.method private static getArch()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 6
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v4, Landroidx/graphics/shapes/CornerRounding;->Unrounded:Landroidx/graphics/shapes/CornerRounding;

    .line 3
    .line 4
    sget-object v0, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_100:Landroidx/graphics/shapes/CornerRounding;

    .line 5
    .line 6
    sget-object v1, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_20:Landroidx/graphics/shapes/CornerRounding;

    .line 7
    .line 8
    .line 9
    filled-new-array {v0, v0, v1, v1}, [Landroidx/graphics/shapes/CornerRounding;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    move-result-object v5

    .line 15
    const/4 v0, 0x4

    .line 16
    .line 17
    const/high16 v1, 0x3f800000    # 1.0f

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static/range {v0 .. v5}, Landroidx/graphics/shapes/RoundedPolygonKt;->RoundedPolygon(IFFFLandroidx/graphics/shapes/CornerRounding;Ljava/util/List;)Landroidx/graphics/shapes/RoundedPolygon;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const/high16 v1, -0x3cf90000    # -135.0f

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lcom/google/android/material/shape/MaterialShapes;->createRotationMatrix(F)Landroid/graphics/Matrix;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Landroidx/graphics/shapes/Shapes_androidKt;->transformed(Landroidx/graphics/shapes/RoundedPolygon;Landroid/graphics/Matrix;)Landroidx/graphics/shapes/RoundedPolygon;

    .line 33
    move-result-object v0

    .line 34
    return-object v0
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

.method private static getArrow()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3f645a1d    # 0.892f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    .line 19
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 20
    .line 21
    .line 22
    const v5, 0x3ea04189    # 0.313f

    .line 23
    const/4 v6, 0x0

    .line 24
    .line 25
    .line 26
    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 27
    const/4 v5, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 36
    .line 37
    new-instance v2, Landroid/graphics/PointF;

    .line 38
    .line 39
    .line 40
    const v3, -0x41a2d0e5    # -0.216f

    .line 41
    .line 42
    .line 43
    const v7, 0x3f866666    # 1.05f

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v3, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 47
    .line 48
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 49
    .line 50
    .line 51
    const v7, 0x3e53f7cf    # 0.207f

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v7, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 63
    .line 64
    new-instance v2, Landroid/graphics/PointF;

    .line 65
    .line 66
    .line 67
    const v3, 0x3eff7cee    # 0.499f

    .line 68
    .line 69
    .line 70
    const v7, -0x41dc28f6    # -0.16f

    .line 71
    .line 72
    .line 73
    invoke-direct {v2, v3, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 74
    .line 75
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 76
    .line 77
    .line 78
    const v7, 0x3e5c28f6    # 0.215f

    .line 79
    .line 80
    const/high16 v8, 0x3f800000    # 1.0f

    .line 81
    .line 82
    .line 83
    invoke-direct {v3, v7, v8}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 92
    .line 93
    new-instance v2, Landroid/graphics/PointF;

    .line 94
    .line 95
    .line 96
    const v3, 0x3f9ccccd    # 1.225f

    .line 97
    .line 98
    .line 99
    const v7, 0x3f87ae14    # 1.06f

    .line 100
    .line 101
    .line 102
    invoke-direct {v2, v3, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 103
    .line 104
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 105
    .line 106
    .line 107
    const v7, 0x3e581062    # 0.211f

    .line 108
    .line 109
    .line 110
    invoke-direct {v3, v7, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    const/4 v1, 0x1

    .line 118
    const/4 v2, 0x0

    .line 119
    .line 120
    .line 121
    invoke-static {v0, v1, v4, v4, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 122
    move-result-object v0

    .line 123
    return-object v0
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
    .line 236
    .line 237
.end method

.method private static getBoom()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3ee9fbe7    # 0.457f

    .line 13
    .line 14
    .line 15
    const v4, 0x3e978d50    # 0.296f

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 19
    .line 20
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 21
    .line 22
    .line 23
    const v4, 0x3be56042    # 0.007f

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 28
    const/4 v6, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 37
    .line 38
    new-instance v2, Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    const v3, -0x42af1aa0    # -0.051f

    .line 42
    .line 43
    const/high16 v7, 0x3f000000    # 0.5f

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v7, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 47
    .line 48
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 49
    .line 50
    .line 51
    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, v2, v3, v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    const/16 v1, 0xf

    .line 60
    const/4 v2, 0x0

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1, v7, v7, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 64
    move-result-object v0

    .line 65
    return-object v0
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

.method private static getBun()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3f4bc6a8    # 0.796f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 27
    .line 28
    new-instance v2, Landroid/graphics/PointF;

    .line 29
    .line 30
    .line 31
    const v5, 0x3f5a5e35    # 0.853f

    .line 32
    .line 33
    .line 34
    const v6, 0x3f049ba6    # 0.518f

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 38
    .line 39
    sget-object v5, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_100:Landroidx/graphics/shapes/CornerRounding;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 48
    .line 49
    new-instance v2, Landroid/graphics/PointF;

    .line 50
    .line 51
    .line 52
    const v6, 0x3f7df3b6    # 0.992f

    .line 53
    .line 54
    .line 55
    const v7, 0x3f218937    # 0.631f

    .line 56
    .line 57
    .line 58
    invoke-direct {v2, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 67
    .line 68
    new-instance v2, Landroid/graphics/PointF;

    .line 69
    .line 70
    .line 71
    const v6, 0x3f77ced9    # 0.968f

    .line 72
    .line 73
    const/high16 v7, 0x3f800000    # 1.0f

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    const/4 v1, 0x2

    .line 84
    const/4 v2, 0x1

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1, v4, v4, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 88
    move-result-object v0

    .line 89
    return-object v0
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
    .line 236
    .line 237
.end method

.method private static getBurst()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, -0x443b645a    # -0.006f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    .line 19
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 20
    .line 21
    .line 22
    const v5, 0x3bc49ba6    # 0.006f

    .line 23
    const/4 v6, 0x0

    .line 24
    .line 25
    .line 26
    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 27
    const/4 v7, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v2, v3, v7}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 36
    .line 37
    new-instance v2, Landroid/graphics/PointF;

    .line 38
    .line 39
    .line 40
    const v3, 0x3f178d50    # 0.592f

    .line 41
    .line 42
    .line 43
    const v8, 0x3e21cac1    # 0.158f

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v3, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 47
    .line 48
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 49
    .line 50
    .line 51
    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, v2, v3, v7}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    const/16 v1, 0xc

    .line 60
    const/4 v2, 0x0

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1, v4, v4, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 64
    move-result-object v0

    .line 65
    return-object v0
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

.method private static getCircle()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/graphics/shapes/RoundedPolygon;->Companion:Landroidx/graphics/shapes/RoundedPolygon$Companion;

    .line 3
    .line 4
    const/16 v1, 0xa

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Landroidx/graphics/shapes/ShapesKt;->circle(Landroidx/graphics/shapes/RoundedPolygon$Companion;I)Landroidx/graphics/shapes/RoundedPolygon;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private static getClamShell()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3e2f1aa0    # 0.171f

    .line 13
    .line 14
    .line 15
    const v4, 0x3f574bc7    # 0.841f

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 19
    .line 20
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 21
    .line 22
    .line 23
    const v4, 0x3e22d0e5    # 0.159f

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 28
    const/4 v6, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 37
    .line 38
    new-instance v2, Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    const v3, -0x435c28f6    # -0.02f

    .line 42
    .line 43
    const/high16 v7, 0x3f000000    # 0.5f

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v3, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 47
    .line 48
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 49
    .line 50
    .line 51
    const v8, 0x3e0f5c29    # 0.14f

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v8, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v2, v3, v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 63
    .line 64
    new-instance v2, Landroid/graphics/PointF;

    .line 65
    .line 66
    .line 67
    const v3, 0x3e2e147b    # 0.17f

    .line 68
    .line 69
    .line 70
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 71
    .line 72
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 73
    .line 74
    .line 75
    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 76
    .line 77
    .line 78
    invoke-direct {v1, v2, v3, v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    const/4 v1, 0x2

    .line 83
    const/4 v2, 0x0

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1, v7, v7, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 87
    move-result-object v0

    .line 88
    return-object v0
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
    .line 236
    .line 237
.end method

.method private static getClover4()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3d978d50    # 0.074f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 27
    .line 28
    new-instance v2, Landroid/graphics/PointF;

    .line 29
    .line 30
    .line 31
    const v5, 0x3f39999a    # 0.725f

    .line 32
    .line 33
    .line 34
    const v6, -0x42353f7d    # -0.099f

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 38
    .line 39
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 40
    .line 41
    .line 42
    const v6, 0x3ef3b646    # 0.476f

    .line 43
    const/4 v7, 0x0

    .line 44
    .line 45
    .line 46
    invoke-direct {v5, v6, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    const/4 v1, 0x4

    .line 54
    const/4 v2, 0x1

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1, v4, v4, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 58
    move-result-object v0

    .line 59
    return-object v0
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

.method private static getClover8()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3d1374bc    # 0.036f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 27
    .line 28
    new-instance v2, Landroid/graphics/PointF;

    .line 29
    .line 30
    .line 31
    const v5, 0x3f420c4a    # 0.758f

    .line 32
    .line 33
    .line 34
    const v6, -0x423126e9    # -0.101f

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 38
    .line 39
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 40
    .line 41
    .line 42
    const v6, 0x3e560419    # 0.209f

    .line 43
    const/4 v7, 0x0

    .line 44
    .line 45
    .line 46
    invoke-direct {v5, v6, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    const/16 v1, 0x8

    .line 55
    const/4 v2, 0x0

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1, v4, v4, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 59
    move-result-object v0

    .line 60
    return-object v0
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

.method private static getCookie12()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/graphics/shapes/RoundedPolygon;->Companion:Landroidx/graphics/shapes/RoundedPolygon$Companion;

    .line 3
    .line 4
    .line 5
    const v1, 0x3f4ccccd    # 0.8f

    .line 6
    .line 7
    sget-object v2, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_50:Landroidx/graphics/shapes/CornerRounding;

    .line 8
    .line 9
    const/16 v3, 0xc

    .line 10
    .line 11
    const/high16 v4, 0x3f800000    # 1.0f

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v3, v4, v1, v2}, Landroidx/graphics/shapes/ShapesKt;->star(Landroidx/graphics/shapes/RoundedPolygon$Companion;IFFLandroidx/graphics/shapes/CornerRounding;)Landroidx/graphics/shapes/RoundedPolygon;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const/high16 v1, -0x3d4c0000    # -90.0f

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/google/android/material/shape/MaterialShapes;->createRotationMatrix(F)Landroid/graphics/Matrix;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Landroidx/graphics/shapes/Shapes_androidKt;->transformed(Landroidx/graphics/shapes/RoundedPolygon;Landroid/graphics/Matrix;)Landroidx/graphics/shapes/RoundedPolygon;

    .line 25
    move-result-object v0

    .line 26
    return-object v0
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

.method private static getCookie4()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3f9e5604    # 1.237f

    .line 13
    .line 14
    .line 15
    const v4, 0x3f9e353f    # 1.236f

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 19
    .line 20
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 21
    .line 22
    .line 23
    const v4, 0x3e841893    # 0.258f

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 28
    const/4 v4, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 37
    .line 38
    new-instance v2, Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    const v3, 0x3f6b020c    # 0.918f

    .line 42
    .line 43
    const/high16 v6, 0x3f000000    # 0.5f

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v6, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 47
    .line 48
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 49
    .line 50
    .line 51
    const v7, 0x3e6e978d    # 0.233f

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v7, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    const/4 v1, 0x4

    .line 62
    const/4 v2, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1, v6, v6, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 66
    move-result-object v0

    .line 67
    return-object v0
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method private static getCookie6()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3f391687    # 0.723f

    .line 13
    .line 14
    .line 15
    const v4, 0x3f624dd3    # 0.884f

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 19
    .line 20
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 21
    .line 22
    .line 23
    const v4, 0x3ec9ba5e    # 0.394f

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 28
    const/4 v4, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 37
    .line 38
    new-instance v2, Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    const v3, 0x3f8cac08    # 1.099f

    .line 42
    .line 43
    const/high16 v6, 0x3f000000    # 0.5f

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v6, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 47
    .line 48
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 49
    .line 50
    .line 51
    const v7, 0x3ecbc6a8    # 0.398f

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v7, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    const/4 v1, 0x6

    .line 62
    const/4 v2, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1, v6, v6, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 66
    move-result-object v0

    .line 67
    return-object v0
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method private static getCookie7()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/graphics/shapes/RoundedPolygon;->Companion:Landroidx/graphics/shapes/RoundedPolygon$Companion;

    .line 3
    .line 4
    const/high16 v1, 0x3f400000    # 0.75f

    .line 5
    .line 6
    sget-object v2, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_50:Landroidx/graphics/shapes/CornerRounding;

    .line 7
    const/4 v3, 0x7

    .line 8
    .line 9
    const/high16 v4, 0x3f800000    # 1.0f

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v3, v4, v1, v2}, Landroidx/graphics/shapes/ShapesKt;->star(Landroidx/graphics/shapes/RoundedPolygon$Companion;IFFLandroidx/graphics/shapes/CornerRounding;)Landroidx/graphics/shapes/RoundedPolygon;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    const/high16 v1, -0x3d4c0000    # -90.0f

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lcom/google/android/material/shape/MaterialShapes;->createRotationMatrix(F)Landroid/graphics/Matrix;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Landroidx/graphics/shapes/Shapes_androidKt;->transformed(Landroidx/graphics/shapes/RoundedPolygon;Landroid/graphics/Matrix;)Landroidx/graphics/shapes/RoundedPolygon;

    .line 23
    move-result-object v0

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

.method private static getCookie9()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/graphics/shapes/RoundedPolygon;->Companion:Landroidx/graphics/shapes/RoundedPolygon$Companion;

    .line 3
    .line 4
    .line 5
    const v1, 0x3f4ccccd    # 0.8f

    .line 6
    .line 7
    sget-object v2, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_50:Landroidx/graphics/shapes/CornerRounding;

    .line 8
    .line 9
    const/16 v3, 0x9

    .line 10
    .line 11
    const/high16 v4, 0x3f800000    # 1.0f

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v3, v4, v1, v2}, Landroidx/graphics/shapes/ShapesKt;->star(Landroidx/graphics/shapes/RoundedPolygon$Companion;IFFLandroidx/graphics/shapes/CornerRounding;)Landroidx/graphics/shapes/RoundedPolygon;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const/high16 v1, -0x3d4c0000    # -90.0f

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/google/android/material/shape/MaterialShapes;->createRotationMatrix(F)Landroid/graphics/Matrix;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Landroidx/graphics/shapes/Shapes_androidKt;->transformed(Landroidx/graphics/shapes/RoundedPolygon;Landroid/graphics/Matrix;)Landroidx/graphics/shapes/RoundedPolygon;

    .line 25
    move-result-object v0

    .line 26
    return-object v0
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

.method private static getDiamond()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3f8c49ba    # 1.096f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    .line 19
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 20
    .line 21
    .line 22
    const v5, 0x3e1a9fbe    # 0.151f

    .line 23
    .line 24
    .line 25
    const v6, 0x3f0624dd    # 0.524f

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 29
    const/4 v5, 0x0

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 38
    .line 39
    new-instance v2, Landroid/graphics/PointF;

    .line 40
    .line 41
    .line 42
    const v3, 0x3d23d70a    # 0.04f

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 46
    .line 47
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 48
    .line 49
    .line 50
    const v6, 0x3e22d0e5    # 0.159f

    .line 51
    const/4 v7, 0x0

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v6, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    const/4 v1, 0x2

    .line 62
    const/4 v2, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1, v4, v4, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 66
    move-result-object v0

    .line 67
    return-object v0
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method private static getFan()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    const/high16 v3, 0x3f800000    # 1.0f

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v3, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 15
    .line 16
    new-instance v4, Landroidx/graphics/shapes/CornerRounding;

    .line 17
    .line 18
    .line 19
    const v5, 0x3ed58106    # 0.417f

    .line 20
    .line 21
    .line 22
    const v6, 0x3e178d50    # 0.148f

    .line 23
    .line 24
    .line 25
    invoke-direct {v4, v6, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 26
    const/4 v5, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v2, v4, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 35
    .line 36
    new-instance v2, Landroid/graphics/PointF;

    .line 37
    const/4 v4, 0x0

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 41
    .line 42
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 43
    .line 44
    .line 45
    const v7, 0x3e1a9fbe    # 0.151f

    .line 46
    .line 47
    .line 48
    invoke-direct {v3, v7, v4}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 57
    .line 58
    new-instance v2, Landroid/graphics/PointF;

    .line 59
    .line 60
    .line 61
    invoke-direct {v2, v4, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 62
    .line 63
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 64
    .line 65
    .line 66
    invoke-direct {v3, v6, v4}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 75
    .line 76
    new-instance v2, Landroid/graphics/PointF;

    .line 77
    .line 78
    .line 79
    const v3, 0x3f7a5e35    # 0.978f

    .line 80
    .line 81
    .line 82
    const v6, 0x3ca3d70a    # 0.02f

    .line 83
    .line 84
    .line 85
    invoke-direct {v2, v3, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 86
    .line 87
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 88
    .line 89
    .line 90
    const v6, 0x3f4d9168    # 0.803f

    .line 91
    .line 92
    .line 93
    invoke-direct {v3, v6, v4}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    const/high16 v1, 0x3f000000    # 0.5f

    .line 102
    const/4 v2, 0x0

    .line 103
    const/4 v3, 0x1

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v3, v1, v1, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 107
    move-result-object v0

    .line 108
    return-object v0
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
    .line 236
    .line 237
.end method

.method private static getFlower()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 7
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3ebd70a4    # 0.37f

    .line 13
    .line 14
    .line 15
    const v4, 0x3e3f7cee    # 0.187f

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 28
    .line 29
    new-instance v2, Landroid/graphics/PointF;

    .line 30
    .line 31
    .line 32
    const v4, 0x3ed4fdf4    # 0.416f

    .line 33
    .line 34
    .line 35
    const v5, 0x3d48b439    # 0.049f

    .line 36
    .line 37
    .line 38
    invoke-direct {v2, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 39
    .line 40
    new-instance v4, Landroidx/graphics/shapes/CornerRounding;

    .line 41
    .line 42
    .line 43
    const v5, 0x3ec3126f    # 0.381f

    .line 44
    const/4 v6, 0x0

    .line 45
    .line 46
    .line 47
    invoke-direct {v4, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v2, v4, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 56
    .line 57
    new-instance v2, Landroid/graphics/PointF;

    .line 58
    .line 59
    .line 60
    const v4, 0x3ef53f7d    # 0.479f

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, v4, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 64
    .line 65
    new-instance v4, Landroidx/graphics/shapes/CornerRounding;

    .line 66
    .line 67
    .line 68
    const v5, 0x3dc28f5c    # 0.095f

    .line 69
    .line 70
    .line 71
    invoke-direct {v4, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, v2, v4, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    const/high16 v1, 0x3f000000    # 0.5f

    .line 80
    const/4 v2, 0x1

    .line 81
    .line 82
    const/16 v3, 0x8

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v3, v1, v1, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 86
    move-result-object v0

    .line 87
    return-object v0
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
    .line 236
    .line 237
.end method

.method private static getGem()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 7
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    new-instance v2, Landroid/graphics/PointF;

    const v3, 0x3eff7cee    # 0.499f

    const v4, 0x3f82f1aa    # 1.023f

    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    const v4, 0x3e76c8b4    # 0.241f

    const v5, 0x3f472b02    # 0.778f

    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    new-instance v2, Landroid/graphics/PointF;

    const v3, -0x445c28f6    # -0.005f

    const v5, 0x3f4ac083    # 0.792f

    invoke-direct {v2, v3, v5}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    const v5, 0x3e54fdf4    # 0.208f

    const/4 v6, 0x0

    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    new-instance v2, Landroid/graphics/PointF;

    const v3, 0x3d958106    # 0.073f

    const v5, 0x3e841893    # 0.258f

    invoke-direct {v2, v3, v5}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    const v5, 0x3e6978d5    # 0.228f

    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    new-instance v2, Landroid/graphics/PointF;

    const v3, 0x3eddb22d    # 0.433f

    const/high16 v5, -0x80000000

    invoke-direct {v2, v3, v5}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    const v5, 0x3efb645a    # 0.491f

    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    const/high16 v2, 0x3f000000    # 0.5f

    .line 6
    invoke-static {v0, v1, v2, v2, v1}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object v0

    return-object v0
.end method

.method private static getGem(F)Landroidx/graphics/shapes/RoundedPolygon;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 7
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getGem()Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object v0

    invoke-static {p0}, Lcom/google/android/material/shape/MaterialShapes;->createRotationMatrix(F)Landroid/graphics/Matrix;

    move-result-object p0

    invoke-static {v0, p0}, Landroidx/graphics/shapes/Shapes_androidKt;->transformed(Landroidx/graphics/shapes/RoundedPolygon;Landroid/graphics/Matrix;)Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object p0

    return-object p0
.end method

.method private static getGhostish()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    const/high16 v3, 0x3f000000    # 0.5f

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 16
    .line 17
    sget-object v5, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_100:Landroidx/graphics/shapes/CornerRounding;

    .line 18
    const/4 v6, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v5, v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 27
    .line 28
    new-instance v2, Landroid/graphics/PointF;

    .line 29
    .line 30
    const/high16 v7, 0x3f800000    # 1.0f

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, v7, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, v2, v5, v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 42
    .line 43
    new-instance v2, Landroid/graphics/PointF;

    .line 44
    .line 45
    .line 46
    const v5, 0x3f91eb85    # 1.14f

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, v7, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 50
    .line 51
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 52
    .line 53
    .line 54
    const v7, 0x3e820c4a    # 0.254f

    .line 55
    .line 56
    .line 57
    const v8, 0x3dd91687    # 0.106f

    .line 58
    .line 59
    .line 60
    invoke-direct {v5, v7, v8}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, v2, v5, v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 69
    .line 70
    new-instance v2, Landroid/graphics/PointF;

    .line 71
    .line 72
    .line 73
    const v5, 0x3f133333    # 0.575f

    .line 74
    .line 75
    .line 76
    const v7, 0x3f67ef9e    # 0.906f

    .line 77
    .line 78
    .line 79
    invoke-direct {v2, v5, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 80
    .line 81
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 82
    .line 83
    .line 84
    const v7, 0x3e818937    # 0.253f

    .line 85
    .line 86
    .line 87
    invoke-direct {v5, v7, v4}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v1, v2, v5, v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    const/4 v1, 0x1

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v1, v3, v3, v1}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 98
    move-result-object v0

    .line 99
    return-object v0
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
    .line 236
    .line 237
.end method

.method private static getHeart()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3e89374c    # 0.268f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    .line 19
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 20
    .line 21
    .line 22
    const v5, 0x3c83126f    # 0.016f

    .line 23
    const/4 v6, 0x0

    .line 24
    .line 25
    .line 26
    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 27
    const/4 v5, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 36
    .line 37
    new-instance v2, Landroid/graphics/PointF;

    .line 38
    .line 39
    .line 40
    const v3, 0x3f4ac083    # 0.792f

    .line 41
    .line 42
    .line 43
    const v7, -0x4278d4fe    # -0.066f

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v3, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 47
    .line 48
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 49
    .line 50
    .line 51
    const v7, 0x3f753f7d    # 0.958f

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v7, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 63
    .line 64
    new-instance v2, Landroid/graphics/PointF;

    .line 65
    .line 66
    .line 67
    const v3, 0x3f883127    # 1.064f

    .line 68
    .line 69
    .line 70
    const v7, 0x3e8d4fdf    # 0.276f

    .line 71
    .line 72
    .line 73
    invoke-direct {v2, v3, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 74
    .line 75
    sget-object v3, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_100:Landroidx/graphics/shapes/CornerRounding;

    .line 76
    .line 77
    .line 78
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 84
    .line 85
    new-instance v2, Landroid/graphics/PointF;

    .line 86
    .line 87
    .line 88
    const v3, 0x3f004189    # 0.501f

    .line 89
    .line 90
    .line 91
    const v7, 0x3f722d0e    # 0.946f

    .line 92
    .line 93
    .line 94
    invoke-direct {v2, v3, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 95
    .line 96
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 97
    .line 98
    .line 99
    const v7, 0x3e041893    # 0.129f

    .line 100
    .line 101
    .line 102
    invoke-direct {v3, v7, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 103
    .line 104
    .line 105
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    const/4 v1, 0x1

    .line 110
    .line 111
    .line 112
    invoke-static {v0, v1, v4, v4, v1}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 113
    move-result-object v0

    .line 114
    return-object v0
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
    .line 236
    .line 237
.end method

.method private static getOval()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/graphics/shapes/RoundedPolygon;->Companion:Landroidx/graphics/shapes/RoundedPolygon$Companion;

    .line 2
    invoke-static {v0}, Landroidx/graphics/shapes/ShapesKt;->circle(Landroidx/graphics/shapes/RoundedPolygon$Companion;)Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    const v2, 0x3f23d70a    # 0.64f

    .line 3
    invoke-static {v1, v2}, Lcom/google/android/material/shape/MaterialShapes;->createScaleMatrix(FF)Landroid/graphics/Matrix;

    move-result-object v1

    .line 4
    invoke-static {v0, v1}, Landroidx/graphics/shapes/Shapes_androidKt;->transformed(Landroidx/graphics/shapes/RoundedPolygon;Landroid/graphics/Matrix;)Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object v0

    return-object v0
.end method

.method private static getOval(F)Landroidx/graphics/shapes/RoundedPolygon;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 5
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getOval()Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object v0

    invoke-static {p0}, Lcom/google/android/material/shape/MaterialShapes;->createRotationMatrix(F)Landroid/graphics/Matrix;

    move-result-object p0

    invoke-static {v0, p0}, Landroidx/graphics/shapes/Shapes_androidKt;->transformed(Landroidx/graphics/shapes/RoundedPolygon;Landroid/graphics/Matrix;)Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object p0

    return-object p0
.end method

.method private static getPentagon()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 7
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, -0x43ec8b44    # -0.009f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    .line 19
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 20
    .line 21
    .line 22
    const v5, 0x3e3020c5    # 0.172f

    .line 23
    const/4 v6, 0x0

    .line 24
    .line 25
    .line 26
    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 27
    const/4 v5, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v2, v3, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    const/4 v1, 0x5

    .line 35
    const/4 v2, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1, v4, v4, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 39
    move-result-object v0

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

.method private static getPill()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 6
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3f760419    # 0.961f

    .line 13
    .line 14
    .line 15
    const v4, 0x3d1fbe77    # 0.039f

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 19
    .line 20
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 21
    .line 22
    .line 23
    const v4, 0x3eda1cac    # 0.426f

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 28
    const/4 v4, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 37
    .line 38
    new-instance v2, Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    const v3, 0x3f8020c5    # 1.001f

    .line 42
    .line 43
    .line 44
    const v5, 0x3edb22d1    # 0.428f

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, v3, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v2, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 56
    .line 57
    new-instance v2, Landroid/graphics/PointF;

    .line 58
    .line 59
    const/high16 v3, 0x3f800000    # 1.0f

    .line 60
    .line 61
    .line 62
    const v5, 0x3f1be76d    # 0.609f

    .line 63
    .line 64
    .line 65
    invoke-direct {v2, v3, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 66
    .line 67
    sget-object v3, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_100:Landroidx/graphics/shapes/CornerRounding;

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    const/high16 v1, 0x3f000000    # 0.5f

    .line 76
    const/4 v2, 0x1

    .line 77
    const/4 v3, 0x2

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v3, v1, v1, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 81
    move-result-object v0

    .line 82
    return-object v0
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
    .line 236
    .line 237
.end method

.method private static getPixelCircle()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 7
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    const/high16 v3, 0x3f000000    # 0.5f

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 16
    const/4 v5, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 25
    .line 26
    new-instance v2, Landroid/graphics/PointF;

    .line 27
    .line 28
    .line 29
    const v6, 0x3f343958    # 0.704f

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v2, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 41
    .line 42
    new-instance v2, Landroid/graphics/PointF;

    .line 43
    .line 44
    .line 45
    const v4, 0x3d851eb8    # 0.065f

    .line 46
    .line 47
    .line 48
    invoke-direct {v2, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, v2, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 57
    .line 58
    new-instance v2, Landroid/graphics/PointF;

    .line 59
    .line 60
    .line 61
    const v6, 0x3f57ced9    # 0.843f

    .line 62
    .line 63
    .line 64
    invoke-direct {v2, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v1, v2, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 73
    .line 74
    new-instance v2, Landroid/graphics/PointF;

    .line 75
    .line 76
    .line 77
    const v4, 0x3e178d50    # 0.148f

    .line 78
    .line 79
    .line 80
    invoke-direct {v2, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 81
    .line 82
    .line 83
    invoke-direct {v1, v2, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 89
    .line 90
    new-instance v2, Landroid/graphics/PointF;

    .line 91
    .line 92
    .line 93
    const v6, 0x3f6d0e56    # 0.926f

    .line 94
    .line 95
    .line 96
    invoke-direct {v2, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, v2, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 105
    .line 106
    new-instance v2, Landroid/graphics/PointF;

    .line 107
    .line 108
    .line 109
    const v4, 0x3e978d50    # 0.296f

    .line 110
    .line 111
    .line 112
    invoke-direct {v2, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v1, v2, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 121
    .line 122
    new-instance v2, Landroid/graphics/PointF;

    .line 123
    .line 124
    const/high16 v6, 0x3f800000    # 1.0f

    .line 125
    .line 126
    .line 127
    invoke-direct {v2, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 128
    .line 129
    .line 130
    invoke-direct {v1, v2, v5}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    const/4 v1, 0x2

    .line 135
    const/4 v2, 0x1

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v1, v3, v3, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 139
    move-result-object v0

    .line 140
    return-object v0
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
    .line 236
    .line 237
.end method

.method private static getPixelTriangle()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 7
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3de147ae    # 0.11f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 27
    .line 28
    new-instance v2, Landroid/graphics/PointF;

    .line 29
    .line 30
    .line 31
    const v5, 0x3de76c8b    # 0.113f

    .line 32
    const/4 v6, 0x0

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 44
    .line 45
    new-instance v2, Landroid/graphics/PointF;

    .line 46
    .line 47
    .line 48
    const v5, 0x3e92f1aa    # 0.287f

    .line 49
    .line 50
    .line 51
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 60
    .line 61
    new-instance v2, Landroid/graphics/PointF;

    .line 62
    .line 63
    .line 64
    const v6, 0x3db22d0e    # 0.087f

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 76
    .line 77
    new-instance v2, Landroid/graphics/PointF;

    .line 78
    .line 79
    .line 80
    const v5, 0x3ed78d50    # 0.421f

    .line 81
    .line 82
    .line 83
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 92
    .line 93
    new-instance v2, Landroid/graphics/PointF;

    .line 94
    .line 95
    .line 96
    const v6, 0x3e2e147b    # 0.17f

    .line 97
    .line 98
    .line 99
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 100
    .line 101
    .line 102
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 108
    .line 109
    new-instance v2, Landroid/graphics/PointF;

    .line 110
    .line 111
    .line 112
    const v5, 0x3f0f5c29    # 0.56f

    .line 113
    .line 114
    .line 115
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 124
    .line 125
    new-instance v2, Landroid/graphics/PointF;

    .line 126
    .line 127
    .line 128
    const v6, 0x3e87ae14    # 0.265f

    .line 129
    .line 130
    .line 131
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 132
    .line 133
    .line 134
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 140
    .line 141
    new-instance v2, Landroid/graphics/PointF;

    .line 142
    .line 143
    .line 144
    const v5, 0x3f2c8b44    # 0.674f

    .line 145
    .line 146
    .line 147
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 148
    .line 149
    .line 150
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 156
    .line 157
    new-instance v2, Landroid/graphics/PointF;

    .line 158
    .line 159
    .line 160
    const v5, 0x3f2ccccd    # 0.675f

    .line 161
    .line 162
    .line 163
    const v6, 0x3eb020c5    # 0.344f

    .line 164
    .line 165
    .line 166
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 167
    .line 168
    .line 169
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 175
    .line 176
    new-instance v2, Landroid/graphics/PointF;

    .line 177
    .line 178
    .line 179
    const v5, 0x3f49fbe7    # 0.789f

    .line 180
    .line 181
    .line 182
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 183
    .line 184
    .line 185
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 191
    .line 192
    new-instance v2, Landroid/graphics/PointF;

    .line 193
    .line 194
    .line 195
    const v6, 0x3ee0c49c    # 0.439f

    .line 196
    .line 197
    .line 198
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 199
    .line 200
    .line 201
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 207
    .line 208
    new-instance v2, Landroid/graphics/PointF;

    .line 209
    .line 210
    .line 211
    const v5, 0x3f6353f8    # 0.888f

    .line 212
    .line 213
    .line 214
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 215
    .line 216
    .line 217
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    const/4 v1, 0x1

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v1, v4, v4, v1}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 225
    move-result-object v0

    .line 226
    return-object v0
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
.end method

.method private static getPuffy()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3d591687    # 0.053f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 27
    .line 28
    new-instance v2, Landroid/graphics/PointF;

    .line 29
    .line 30
    .line 31
    const v5, 0x3f0b851f    # 0.545f

    .line 32
    .line 33
    .line 34
    const v6, -0x42dc28f6    # -0.04f

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 38
    .line 39
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 40
    .line 41
    .line 42
    const v6, 0x3ecf5c29    # 0.405f

    .line 43
    const/4 v7, 0x0

    .line 44
    .line 45
    .line 46
    invoke-direct {v5, v6, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 55
    .line 56
    new-instance v2, Landroid/graphics/PointF;

    .line 57
    .line 58
    .line 59
    const v5, 0x3f2b851f    # 0.67f

    .line 60
    .line 61
    .line 62
    const v6, -0x42f0a3d7    # -0.035f

    .line 63
    .line 64
    .line 65
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 66
    .line 67
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 68
    .line 69
    .line 70
    const v6, 0x3eda1cac    # 0.426f

    .line 71
    .line 72
    .line 73
    invoke-direct {v5, v6, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 82
    .line 83
    new-instance v2, Landroid/graphics/PointF;

    .line 84
    .line 85
    .line 86
    const v5, 0x3f378d50    # 0.717f

    .line 87
    .line 88
    .line 89
    const v6, 0x3d872b02    # 0.066f

    .line 90
    .line 91
    .line 92
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 93
    .line 94
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 95
    .line 96
    .line 97
    const v6, 0x3f12f1aa    # 0.574f

    .line 98
    .line 99
    .line 100
    invoke-direct {v5, v6, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 109
    .line 110
    new-instance v2, Landroid/graphics/PointF;

    .line 111
    .line 112
    .line 113
    const v5, 0x3f38d4fe    # 0.722f

    .line 114
    .line 115
    .line 116
    const v6, 0x3e03126f    # 0.128f

    .line 117
    .line 118
    .line 119
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 120
    .line 121
    .line 122
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 128
    .line 129
    new-instance v2, Landroid/graphics/PointF;

    .line 130
    .line 131
    .line 132
    const v5, 0x3f46e979    # 0.777f

    .line 133
    .line 134
    .line 135
    const v6, 0x3b03126f    # 0.002f

    .line 136
    .line 137
    .line 138
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 139
    .line 140
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 141
    .line 142
    .line 143
    const v6, 0x3eb851ec    # 0.36f

    .line 144
    .line 145
    .line 146
    invoke-direct {v5, v6, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 147
    .line 148
    .line 149
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 155
    .line 156
    new-instance v2, Landroid/graphics/PointF;

    .line 157
    .line 158
    .line 159
    const v5, 0x3f69fbe7    # 0.914f

    .line 160
    .line 161
    .line 162
    const v6, 0x3e189375    # 0.149f

    .line 163
    .line 164
    .line 165
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 166
    .line 167
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 168
    .line 169
    .line 170
    const v6, 0x3f28f5c3    # 0.66f

    .line 171
    .line 172
    .line 173
    invoke-direct {v5, v6, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 174
    .line 175
    .line 176
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 182
    .line 183
    new-instance v2, Landroid/graphics/PointF;

    .line 184
    .line 185
    .line 186
    const v5, 0x3f6d0e56    # 0.926f

    .line 187
    .line 188
    .line 189
    const v8, 0x3e93f7cf    # 0.289f

    .line 190
    .line 191
    .line 192
    invoke-direct {v2, v5, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 193
    .line 194
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 195
    .line 196
    .line 197
    invoke-direct {v5, v6, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 198
    .line 199
    .line 200
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 206
    .line 207
    new-instance v2, Landroid/graphics/PointF;

    .line 208
    .line 209
    .line 210
    const v5, 0x3f618937    # 0.881f

    .line 211
    .line 212
    .line 213
    const v6, 0x3eb126e9    # 0.346f

    .line 214
    .line 215
    .line 216
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 217
    .line 218
    .line 219
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 225
    .line 226
    new-instance v2, Landroid/graphics/PointF;

    .line 227
    .line 228
    .line 229
    const v5, 0x3f70a3d7    # 0.94f

    .line 230
    .line 231
    .line 232
    const v6, 0x3eb020c5    # 0.344f

    .line 233
    .line 234
    .line 235
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 236
    .line 237
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 238
    .line 239
    .line 240
    const v6, 0x3e010625    # 0.126f

    .line 241
    .line 242
    .line 243
    invoke-direct {v5, v6, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 244
    .line 245
    .line 246
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 247
    .line 248
    .line 249
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 252
    .line 253
    new-instance v2, Landroid/graphics/PointF;

    .line 254
    .line 255
    .line 256
    const v5, 0x3f80624e    # 1.003f

    .line 257
    .line 258
    .line 259
    const v6, 0x3edfbe77    # 0.437f

    .line 260
    .line 261
    .line 262
    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 263
    .line 264
    new-instance v5, Landroidx/graphics/shapes/CornerRounding;

    .line 265
    .line 266
    .line 267
    const v6, 0x3e828f5c    # 0.255f

    .line 268
    .line 269
    .line 270
    invoke-direct {v5, v6, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 271
    .line 272
    .line 273
    invoke-direct {v1, v2, v5, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 274
    .line 275
    .line 276
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    const/4 v1, 0x2

    .line 278
    const/4 v2, 0x1

    .line 279
    .line 280
    .line 281
    invoke-static {v0, v1, v4, v4, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 282
    move-result-object v0

    .line 283
    .line 284
    const/high16 v1, 0x3f800000    # 1.0f

    .line 285
    .line 286
    .line 287
    const v2, 0x3f3df3b6    # 0.742f

    .line 288
    .line 289
    .line 290
    invoke-static {v1, v2}, Lcom/google/android/material/shape/MaterialShapes;->createScaleMatrix(FF)Landroid/graphics/Matrix;

    .line 291
    move-result-object v1

    .line 292
    .line 293
    .line 294
    invoke-static {v0, v1}, Landroidx/graphics/shapes/Shapes_androidKt;->transformed(Landroidx/graphics/shapes/RoundedPolygon;Landroid/graphics/Matrix;)Landroidx/graphics/shapes/RoundedPolygon;

    .line 295
    move-result-object v0

    .line 296
    return-object v0
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
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
.end method

.method private static getPuffyDiamond()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 7
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3f5eb852    # 0.87f

    .line 13
    .line 14
    .line 15
    const v4, 0x3e051eb8    # 0.13f

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 19
    .line 20
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 21
    .line 22
    .line 23
    const v4, 0x3e158106    # 0.146f

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 28
    const/4 v4, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 37
    .line 38
    new-instance v2, Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    const v3, 0x3f516873    # 0.818f

    .line 42
    .line 43
    .line 44
    const v6, 0x3eb6c8b4    # 0.357f

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, v3, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v2, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 56
    .line 57
    new-instance v2, Landroid/graphics/PointF;

    .line 58
    .line 59
    const/high16 v3, 0x3f800000    # 1.0f

    .line 60
    .line 61
    .line 62
    const v6, 0x3ea9fbe7    # 0.332f

    .line 63
    .line 64
    .line 65
    invoke-direct {v2, v3, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 66
    .line 67
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 68
    .line 69
    .line 70
    const v6, 0x3f5a5e35    # 0.853f

    .line 71
    .line 72
    .line 73
    invoke-direct {v3, v6, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    const/high16 v1, 0x3f000000    # 0.5f

    .line 82
    const/4 v2, 0x1

    .line 83
    const/4 v3, 0x4

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v3, v1, v1, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 87
    move-result-object v0

    .line 88
    return-object v0
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
    .line 236
    .line 237
.end method

.method private static getSemiCircle()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 7
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/graphics/shapes/RoundedPolygon;->Companion:Landroidx/graphics/shapes/RoundedPolygon$Companion;

    .line 3
    .line 4
    sget-object v3, Landroidx/graphics/shapes/CornerRounding;->Unrounded:Landroidx/graphics/shapes/CornerRounding;

    .line 5
    .line 6
    sget-object v1, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_20:Landroidx/graphics/shapes/CornerRounding;

    .line 7
    .line 8
    sget-object v2, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_100:Landroidx/graphics/shapes/CornerRounding;

    .line 9
    .line 10
    .line 11
    filled-new-array {v1, v1, v2, v2}, [Landroidx/graphics/shapes/CornerRounding;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    move-result-object v4

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x0

    .line 19
    .line 20
    .line 21
    const v1, 0x3fcccccd    # 1.6f

    .line 22
    .line 23
    const/high16 v2, 0x3f800000    # 1.0f

    .line 24
    .line 25
    .line 26
    invoke-static/range {v0 .. v6}, Landroidx/graphics/shapes/ShapesKt;->rectangle(Landroidx/graphics/shapes/RoundedPolygon$Companion;FFLandroidx/graphics/shapes/CornerRounding;Ljava/util/List;FF)Landroidx/graphics/shapes/RoundedPolygon;

    .line 27
    move-result-object v0

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

.method private static getSlantedSquare()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 7
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3f6d0e56    # 0.926f

    .line 13
    .line 14
    .line 15
    const v4, 0x3f7851ec    # 0.97f

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 19
    .line 20
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 21
    .line 22
    .line 23
    const v4, 0x3e418937    # 0.189f

    .line 24
    .line 25
    .line 26
    const v5, 0x3f4f9db2    # 0.811f

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 30
    const/4 v4, 0x0

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 39
    .line 40
    new-instance v2, Landroid/graphics/PointF;

    .line 41
    .line 42
    .line 43
    const v3, -0x4353f7cf    # -0.021f

    .line 44
    .line 45
    .line 46
    const v5, 0x3f778d50    # 0.967f

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, v3, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 50
    .line 51
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 52
    .line 53
    .line 54
    const v5, 0x3e3f7cee    # 0.187f

    .line 55
    .line 56
    .line 57
    const v6, 0x3d6978d5    # 0.057f

    .line 58
    .line 59
    .line 60
    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    const/high16 v1, 0x3f000000    # 0.5f

    .line 69
    const/4 v2, 0x0

    .line 70
    const/4 v3, 0x2

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v3, v1, v1, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 74
    move-result-object v0

    .line 75
    return-object v0
.end method

.method private static getSoftBoom()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3f3ba5e3    # 0.733f

    .line 13
    .line 14
    .line 15
    const v4, 0x3ee872b0    # 0.454f

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 28
    .line 29
    new-instance v2, Landroid/graphics/PointF;

    .line 30
    .line 31
    .line 32
    const v4, 0x3f56c8b4    # 0.839f

    .line 33
    .line 34
    .line 35
    const v5, 0x3edfbe77    # 0.437f

    .line 36
    .line 37
    .line 38
    invoke-direct {v2, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 39
    .line 40
    new-instance v4, Landroidx/graphics/shapes/CornerRounding;

    .line 41
    .line 42
    .line 43
    const v5, 0x3f083127    # 0.532f

    .line 44
    const/4 v6, 0x0

    .line 45
    .line 46
    .line 47
    invoke-direct {v4, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v2, v4, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 56
    .line 57
    new-instance v2, Landroid/graphics/PointF;

    .line 58
    .line 59
    .line 60
    const v4, 0x3f72f1aa    # 0.949f

    .line 61
    .line 62
    .line 63
    const v5, 0x3ee5e354    # 0.449f

    .line 64
    .line 65
    .line 66
    invoke-direct {v2, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 67
    .line 68
    new-instance v4, Landroidx/graphics/shapes/CornerRounding;

    .line 69
    .line 70
    .line 71
    const v5, 0x3ee0c49c    # 0.439f

    .line 72
    .line 73
    const/high16 v7, 0x3f800000    # 1.0f

    .line 74
    .line 75
    .line 76
    invoke-direct {v4, v5, v7}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v1, v2, v4, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 85
    .line 86
    new-instance v2, Landroid/graphics/PointF;

    .line 87
    .line 88
    .line 89
    const v4, 0x3f7f7cee    # 0.998f

    .line 90
    .line 91
    .line 92
    const v5, 0x3ef4bc6a    # 0.478f

    .line 93
    .line 94
    .line 95
    invoke-direct {v2, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 96
    .line 97
    new-instance v4, Landroidx/graphics/shapes/CornerRounding;

    .line 98
    .line 99
    .line 100
    const v5, 0x3e322d0e    # 0.174f

    .line 101
    .line 102
    .line 103
    invoke-direct {v4, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 104
    .line 105
    .line 106
    invoke-direct {v1, v2, v4, v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    const/high16 v1, 0x3f000000    # 0.5f

    .line 112
    const/4 v2, 0x1

    .line 113
    .line 114
    const/16 v3, 0x10

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v3, v1, v1, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 118
    move-result-object v0

    .line 119
    return-object v0
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
    .line 236
    .line 237
.end method

.method private static getSoftBurst()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3e45a1cb    # 0.193f

    .line 13
    .line 14
    .line 15
    const v4, 0x3e8dd2f2    # 0.277f

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 19
    .line 20
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 21
    .line 22
    .line 23
    const v4, 0x3d591687    # 0.053f

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 28
    const/4 v6, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 37
    .line 38
    new-instance v2, Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    const v3, 0x3e343958    # 0.176f

    .line 42
    .line 43
    .line 44
    const v7, 0x3d6147ae    # 0.055f

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, v3, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 48
    .line 49
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 50
    .line 51
    .line 52
    invoke-direct {v3, v4, v5}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v2, v3, v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    const/high16 v1, 0x3f000000    # 0.5f

    .line 61
    const/4 v2, 0x0

    .line 62
    .line 63
    const/16 v3, 0xa

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v3, v1, v1, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 67
    move-result-object v0

    .line 68
    return-object v0
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method private static getSquare()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 7
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/graphics/shapes/RoundedPolygon;->Companion:Landroidx/graphics/shapes/RoundedPolygon$Companion;

    .line 3
    .line 4
    sget-object v3, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_30:Landroidx/graphics/shapes/CornerRounding;

    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v6, 0x0

    .line 7
    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    const/high16 v2, 0x3f800000    # 1.0f

    .line 11
    const/4 v4, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v6}, Landroidx/graphics/shapes/ShapesKt;->rectangle(Landroidx/graphics/shapes/RoundedPolygon$Companion;FFLandroidx/graphics/shapes/CornerRounding;Ljava/util/List;FF)Landroidx/graphics/shapes/RoundedPolygon;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
.end method

.method private static getSunny()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/graphics/shapes/RoundedPolygon;->Companion:Landroidx/graphics/shapes/RoundedPolygon$Companion;

    .line 3
    .line 4
    .line 5
    const v1, 0x3f4ccccd    # 0.8f

    .line 6
    .line 7
    sget-object v2, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_15:Landroidx/graphics/shapes/CornerRounding;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    const/high16 v4, 0x3f800000    # 1.0f

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v3, v4, v1, v2}, Landroidx/graphics/shapes/ShapesKt;->star(Landroidx/graphics/shapes/RoundedPolygon$Companion;IFFLandroidx/graphics/shapes/CornerRounding;)Landroidx/graphics/shapes/RoundedPolygon;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
.end method

.method private static getTriangle()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    .line 1
    sget-object v1, Lcom/google/android/material/shape/MaterialShapes;->CORNER_ROUND_20:Landroidx/graphics/shapes/CornerRounding;

    const/4 v2, 0x3

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3, v0, v0, v1}, Landroidx/graphics/shapes/RoundedPolygonKt;->RoundedPolygon(IFFFLandroidx/graphics/shapes/CornerRounding;)Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object v0

    return-object v0
.end method

.method private static getTriangle(F)Landroidx/graphics/shapes/RoundedPolygon;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    invoke-static {}, Lcom/google/android/material/shape/MaterialShapes;->getTriangle()Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object v0

    invoke-static {p0}, Lcom/google/android/material/shape/MaterialShapes;->createRotationMatrix(F)Landroid/graphics/Matrix;

    move-result-object p0

    invoke-static {v0, p0}, Landroidx/graphics/shapes/Shapes_androidKt;->transformed(Landroidx/graphics/shapes/RoundedPolygon;Landroid/graphics/Matrix;)Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object p0

    return-object p0
.end method

.method private static getVerySunny()Landroidx/graphics/shapes/RoundedPolygon;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    const v3, 0x3f8a3d71    # 1.08f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    .line 19
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 20
    .line 21
    .line 22
    const v5, 0x3dae147b    # 0.085f

    .line 23
    const/4 v6, 0x0

    .line 24
    .line 25
    .line 26
    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 27
    const/4 v7, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v2, v3, v7}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    new-instance v1, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 36
    .line 37
    new-instance v2, Landroid/graphics/PointF;

    .line 38
    .line 39
    .line 40
    const v3, 0x3eb74bc7    # 0.358f

    .line 41
    .line 42
    .line 43
    const v8, 0x3f57ced9    # 0.843f

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v3, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 47
    .line 48
    new-instance v3, Landroidx/graphics/shapes/CornerRounding;

    .line 49
    .line 50
    .line 51
    invoke-direct {v3, v5, v6}, Landroidx/graphics/shapes/CornerRounding;-><init>(FF)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, v2, v3, v7}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    const/16 v1, 0x8

    .line 60
    const/4 v2, 0x0

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1, v4, v4, v2}, Lcom/google/android/material/shape/MaterialShapes;->customPolygon(Ljava/util/List;IFFZ)Landroidx/graphics/shapes/RoundedPolygon;

    .line 64
    move-result-object v0

    .line 65
    return-object v0
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

.method public static normalize(Landroidx/graphics/shapes/RoundedPolygon;Z)Landroidx/graphics/shapes/RoundedPolygon;
    .locals 3
    .param p0    # Landroidx/graphics/shapes/RoundedPolygon;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 10
    new-instance v0, Landroid/graphics/RectF;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-static {p0, p1, v0}, Lcom/google/android/material/shape/MaterialShapes;->normalize(Landroidx/graphics/shapes/RoundedPolygon;ZLandroid/graphics/RectF;)Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object p0

    return-object p0
.end method

.method public static normalize(Landroidx/graphics/shapes/RoundedPolygon;ZLandroid/graphics/RectF;)Landroidx/graphics/shapes/RoundedPolygon;
    .locals 5
    .param p0    # Landroidx/graphics/shapes/RoundedPolygon;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    const/4 v0, 0x4

    .line 1
    new-array v0, v0, [F

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/graphics/shapes/RoundedPolygon;->calculateMaxBounds([F)[F

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/graphics/shapes/RoundedPolygon;->calculateBounds([F)[F

    .line 4
    :goto_0
    new-instance p1, Landroid/graphics/RectF;

    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v2, 0x1

    aget v2, v0, v2

    const/4 v3, 0x2

    aget v3, v0, v3

    const/4 v4, 0x3

    aget v0, v0, v4

    invoke-direct {p1, v1, v2, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 5
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v1

    div-float/2addr v0, v1

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 6
    invoke-static {v0, v0}, Lcom/google/android/material/shape/MaterialShapes;->createScaleMatrix(FF)Landroid/graphics/Matrix;

    move-result-object v0

    .line 7
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    neg-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    neg-float p1, p1

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 8
    invoke-virtual {p2}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    invoke-virtual {p2}, Landroid/graphics/RectF;->centerY()F

    move-result p2

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 9
    invoke-static {p0, v0}, Landroidx/graphics/shapes/Shapes_androidKt;->transformed(Landroidx/graphics/shapes/RoundedPolygon;Landroid/graphics/Matrix;)Landroidx/graphics/shapes/RoundedPolygon;

    move-result-object p0

    return-object p0
.end method

.method private static repeatAroundCenter(Ljava/util/List;Ljava/util/List;IFFZ)V
    .locals 9
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;",
            ">;",
            "Ljava/util/List<",
            "Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;",
            ">;IFFZ)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p3, p4}, Lcom/google/android/material/shape/MaterialShapes;->toRadial(Ljava/util/List;FF)V

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    .line 12
    int-to-double v2, p2

    .line 13
    div-double/2addr v0, v2

    .line 14
    double-to-float v0, v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    if-eqz p5, :cond_6

    .line 19
    .line 20
    mul-int/lit8 p2, p2, 0x2

    .line 21
    .line 22
    const/high16 p5, 0x40000000    # 2.0f

    .line 23
    div-float/2addr v0, p5

    .line 24
    move v3, v2

    .line 25
    .line 26
    :goto_0
    if-ge v3, p2, :cond_8

    .line 27
    move v4, v2

    .line 28
    .line 29
    .line 30
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 31
    move-result v5

    .line 32
    .line 33
    if-ge v4, v5, :cond_5

    .line 34
    .line 35
    rem-int/lit8 v5, v3, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    .line 38
    if-eqz v5, :cond_0

    .line 39
    move v5, v6

    .line 40
    goto :goto_2

    .line 41
    :cond_0
    move v5, v2

    .line 42
    .line 43
    :goto_2
    if-eqz v5, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 47
    move-result v7

    .line 48
    sub-int/2addr v7, v6

    .line 49
    sub-int/2addr v7, v4

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    move v7, v4

    .line 52
    .line 53
    .line 54
    :goto_3
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    move-result-object v6

    .line 56
    .line 57
    check-cast v6, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 58
    .line 59
    if-gtz v7, :cond_2

    .line 60
    .line 61
    if-nez v5, :cond_4

    .line 62
    :cond_2
    int-to-float v7, v3

    .line 63
    mul-float/2addr v7, v0

    .line 64
    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    .line 68
    invoke-static {v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$200(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;)Landroid/graphics/PointF;

    .line 69
    move-result-object v5

    .line 70
    .line 71
    iget v5, v5, Landroid/graphics/PointF;->x:F

    .line 72
    .line 73
    sub-float v5, v0, v5

    .line 74
    .line 75
    .line 76
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    move-result-object v8

    .line 78
    .line 79
    check-cast v8, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 80
    .line 81
    .line 82
    invoke-static {v8}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$200(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;)Landroid/graphics/PointF;

    .line 83
    move-result-object v8

    .line 84
    .line 85
    iget v8, v8, Landroid/graphics/PointF;->x:F

    .line 86
    mul-float/2addr v8, p5

    .line 87
    add-float/2addr v5, v8

    .line 88
    goto :goto_4

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-static {v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$200(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;)Landroid/graphics/PointF;

    .line 92
    move-result-object v5

    .line 93
    .line 94
    iget v5, v5, Landroid/graphics/PointF;->x:F

    .line 95
    :goto_4
    add-float/2addr v7, v5

    .line 96
    .line 97
    new-instance v5, Landroid/graphics/PointF;

    .line 98
    .line 99
    .line 100
    invoke-static {v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$200(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;)Landroid/graphics/PointF;

    .line 101
    move-result-object v8

    .line 102
    .line 103
    iget v8, v8, Landroid/graphics/PointF;->y:F

    .line 104
    .line 105
    .line 106
    invoke-direct {v5, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 107
    .line 108
    new-instance v7, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 109
    .line 110
    .line 111
    invoke-static {v6}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$300(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;)Landroidx/graphics/shapes/CornerRounding;

    .line 112
    move-result-object v6

    .line 113
    .line 114
    .line 115
    invoke-direct {v7, v5, v6, v1}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 121
    goto :goto_1

    .line 122
    .line 123
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 124
    goto :goto_0

    .line 125
    .line 126
    :cond_6
    :goto_5
    if-ge v2, p2, :cond_8

    .line 127
    .line 128
    .line 129
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 130
    move-result-object p5

    .line 131
    .line 132
    .line 133
    :goto_6
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    move-result v3

    .line 135
    .line 136
    if-eqz v3, :cond_7

    .line 137
    .line 138
    .line 139
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    move-result-object v3

    .line 141
    .line 142
    check-cast v3, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 143
    int-to-float v4, v2

    .line 144
    mul-float/2addr v4, v0

    .line 145
    .line 146
    .line 147
    invoke-static {v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$200(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;)Landroid/graphics/PointF;

    .line 148
    move-result-object v5

    .line 149
    .line 150
    iget v5, v5, Landroid/graphics/PointF;->x:F

    .line 151
    add-float/2addr v4, v5

    .line 152
    .line 153
    new-instance v5, Landroid/graphics/PointF;

    .line 154
    .line 155
    .line 156
    invoke-static {v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$200(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;)Landroid/graphics/PointF;

    .line 157
    move-result-object v6

    .line 158
    .line 159
    iget v6, v6, Landroid/graphics/PointF;->y:F

    .line 160
    .line 161
    .line 162
    invoke-direct {v5, v4, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 163
    .line 164
    new-instance v4, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 165
    .line 166
    .line 167
    invoke-static {v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$300(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;)Landroidx/graphics/shapes/CornerRounding;

    .line 168
    move-result-object v3

    .line 169
    .line 170
    .line 171
    invoke-direct {v4, v5, v3, v1}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;-><init>(Landroid/graphics/PointF;Landroidx/graphics/shapes/CornerRounding;Lcom/google/android/material/shape/MaterialShapes$1;)V

    .line 172
    .line 173
    .line 174
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    goto :goto_6

    .line 176
    .line 177
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 178
    goto :goto_5

    .line 179
    .line 180
    .line 181
    :cond_8
    invoke-static {p1, p3, p4}, Lcom/google/android/material/shape/MaterialShapes;->toCartesian(Ljava/util/List;FF)V

    .line 182
    return-void
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
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
.end method

.method private static toCartesian(Ljava/util/List;FF)V
    .locals 1
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;",
            ">;FF)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p1, p2}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$500(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;FF)V

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
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
.end method

.method private static toRadial(Ljava/util/List;FF)V
    .locals 1
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;",
            ">;FF)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p1, p2}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$400(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;FF)V

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
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
.end method

.method private static toRoundingsList(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/graphics/shapes/CornerRounding;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    move-result v2

    .line 11
    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    check-cast v2, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 19
    .line 20
    .line 21
    invoke-static {v2}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$300(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;)Landroidx/graphics/shapes/CornerRounding;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object v0
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
.end method

.method private static toVerticesXyArray(Ljava/util/List;)[F
    .locals 4
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;",
            ">;)[F"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    move-result v0

    .line 5
    .line 6
    mul-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    new-array v0, v0, [F

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 13
    move-result v2

    .line 14
    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    mul-int/lit8 v2, v1, 0x2

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    check-cast v3, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 24
    .line 25
    .line 26
    invoke-static {v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$200(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;)Landroid/graphics/PointF;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    iget v3, v3, Landroid/graphics/PointF;->x:F

    .line 30
    .line 31
    aput v3, v0, v2

    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    .line 36
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    check-cast v3, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;

    .line 40
    .line 41
    .line 42
    invoke-static {v3}, Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;->access$200(Lcom/google/android/material/shape/MaterialShapes$VertexAndRounding;)Landroid/graphics/PointF;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 46
    .line 47
    aput v3, v0, v2

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    return-object v0
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
