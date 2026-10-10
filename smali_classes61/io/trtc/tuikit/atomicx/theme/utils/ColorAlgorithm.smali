.class public final Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;
.super Ljava/lang/Object;
.source "ColorAlgorithm.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;,
        Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\'B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0007J&\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u001e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J$\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J<\u0010\u001d\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u001f2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u001fH\u0002J\"\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u001f2\u0006\u0010\"\u001a\u00020\nH\u0002J \u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0002R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\u0017\u001a&\u0012\u0004\u0012\u00020\n\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;",
        "",
        "<init>",
        "()V",
        "generateColorPalette",
        "",
        "",
        "context",
        "Landroid/content/Context;",
        "baseColor",
        "",
        "theme",
        "parseHexColor",
        "hexColor",
        "getPaletteFromResources",
        "type",
        "Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;",
        "STANDARD_COLORS",
        "",
        "isStandardColor",
        "",
        "color",
        "getClosestPaletteType",
        "HSL_ADJUSTMENTS",
        "Lkotlin/Pair;",
        "",
        "generateDynamicColorVariations",
        "adjustColor",
        "adjustment",
        "colorDistance",
        "c1",
        "Lkotlin/Triple;",
        "c2",
        "hexToHSL",
        "hex",
        "hslToHex",
        "h",
        "s",
        "l",
        "PaletteType",
        "atomic_x_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nColorAlgorithm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorAlgorithm.kt\nio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,258:1\n470#2:259\n1563#3:260\n1634#3,3:261\n1761#3,3:264\n2423#3,14:271\n126#4:267\n153#4,3:268\n*S KotlinDebug\n*F\n+ 1 ColorAlgorithm.kt\nio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm\n*L\n23#1:259\n101#1:260\n101#1:261,3\n113#1:264,3\n131#1:271,14\n127#1:267\n127#1:268,3\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lkotlin/Pair<",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 46

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->a:Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;

    .line 8
    .line 9
    sget-object v0, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;->BLUE:Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;

    .line 10
    .line 11
    const-string v1, "#1c66e5"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    sget-object v1, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;->GREEN:Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;

    .line 18
    .line 19
    const-string v2, "#0abf77"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    sget-object v2, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;->RED:Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;

    .line 26
    .line 27
    const-string v3, "#e54545"

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    sget-object v3, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;->ORANGE:Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;

    .line 34
    .line 35
    const-string v4, "#ff7200"

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    filled-new-array {v0, v1, v2, v3}, [Lkotlin/Pair;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    sput-object v0, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->b:Ljava/util/Map;

    .line 50
    const/4 v0, 0x1

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    new-instance v1, Lkotlin/Pair;

    .line 57
    .line 58
    const-wide/high16 v2, -0x3fbc000000000000L    # -40.0

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    const-wide v3, 0x4046800000000000L    # 45.0

    .line 68
    .line 69
    .line 70
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 78
    move-result-object v4

    .line 79
    const/4 v1, 0x2

    .line 80
    .line 81
    .line 82
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    new-instance v5, Lkotlin/Pair;

    .line 86
    .line 87
    const-wide/high16 v6, -0x3fc2000000000000L    # -30.0

    .line 88
    .line 89
    .line 90
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 91
    move-result-object v14

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    const-wide v6, 0x4041800000000000L    # 35.0

    .line 97
    .line 98
    .line 99
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 100
    move-result-object v6

    .line 101
    .line 102
    .line 103
    invoke-direct {v5, v14, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 107
    move-result-object v5

    .line 108
    const/4 v6, 0x3

    .line 109
    .line 110
    .line 111
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    move-result-object v15

    .line 113
    .line 114
    new-instance v6, Lkotlin/Pair;

    .line 115
    .line 116
    const-wide/high16 v7, -0x3fcc000000000000L    # -20.0

    .line 117
    .line 118
    .line 119
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 120
    move-result-object v7

    .line 121
    .line 122
    const-wide/high16 v8, 0x4039000000000000L    # 25.0

    .line 123
    .line 124
    .line 125
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 126
    move-result-object v8

    .line 127
    .line 128
    .line 129
    invoke-direct {v6, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v15, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 133
    move-result-object v6

    .line 134
    const/4 v8, 0x4

    .line 135
    .line 136
    .line 137
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    move-result-object v8

    .line 139
    .line 140
    new-instance v9, Lkotlin/Pair;

    .line 141
    .line 142
    const-wide/high16 v10, -0x3fdc000000000000L    # -10.0

    .line 143
    .line 144
    .line 145
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 146
    move-result-object v10

    .line 147
    .line 148
    const-wide/high16 v11, 0x402e000000000000L    # 15.0

    .line 149
    .line 150
    .line 151
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 152
    move-result-object v11

    .line 153
    .line 154
    .line 155
    invoke-direct {v9, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 159
    move-result-object v9

    .line 160
    const/4 v12, 0x5

    .line 161
    .line 162
    .line 163
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    move-result-object v12

    .line 165
    .line 166
    new-instance v13, Lkotlin/Pair;

    .line 167
    .line 168
    const-wide/high16 v16, -0x3fec000000000000L    # -5.0

    .line 169
    .line 170
    move-object/from16 v18, v3

    .line 171
    .line 172
    .line 173
    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 174
    move-result-object v3

    .line 175
    .line 176
    const-wide/high16 v16, 0x4014000000000000L    # 5.0

    .line 177
    .line 178
    move-object/from16 v19, v15

    .line 179
    .line 180
    .line 181
    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 182
    move-result-object v15

    .line 183
    .line 184
    .line 185
    invoke-direct {v13, v3, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 189
    move-result-object v13

    .line 190
    .line 191
    const/16 v16, 0x6

    .line 192
    .line 193
    move-object/from16 v17, v3

    .line 194
    .line 195
    .line 196
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    move-result-object v3

    .line 198
    .line 199
    move-object/from16 v16, v4

    .line 200
    .line 201
    new-instance v4, Lkotlin/Pair;

    .line 202
    .line 203
    const-wide/16 v20, 0x0

    .line 204
    .line 205
    move-object/from16 v22, v1

    .line 206
    .line 207
    .line 208
    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 209
    move-result-object v1

    .line 210
    .line 211
    .line 212
    invoke-direct {v4, v1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 216
    move-result-object v4

    .line 217
    .line 218
    const/16 v20, 0x7

    .line 219
    .line 220
    move-object/from16 v21, v4

    .line 221
    .line 222
    .line 223
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    move-result-object v4

    .line 225
    .line 226
    move-object/from16 v23, v5

    .line 227
    .line 228
    new-instance v5, Lkotlin/Pair;

    .line 229
    .line 230
    .line 231
    invoke-direct {v5, v15, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 235
    move-result-object v4

    .line 236
    .line 237
    const/16 v24, 0x8

    .line 238
    .line 239
    .line 240
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    move-result-object v5

    .line 242
    .line 243
    move-object/from16 v25, v4

    .line 244
    .line 245
    new-instance v4, Lkotlin/Pair;

    .line 246
    .line 247
    const-wide/high16 v26, 0x4024000000000000L    # 10.0

    .line 248
    .line 249
    move-object/from16 v28, v6

    .line 250
    .line 251
    .line 252
    invoke-static/range {v26 .. v27}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 253
    move-result-object v6

    .line 254
    .line 255
    .line 256
    invoke-direct {v4, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 260
    move-result-object v4

    .line 261
    .line 262
    const/16 v26, 0x9

    .line 263
    .line 264
    .line 265
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    move-result-object v5

    .line 267
    .line 268
    new-instance v6, Lkotlin/Pair;

    .line 269
    .line 270
    .line 271
    invoke-direct {v6, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 275
    move-result-object v5

    .line 276
    .line 277
    const/16 v27, 0xa

    .line 278
    .line 279
    .line 280
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    move-result-object v6

    .line 282
    .line 283
    move-object/from16 v29, v4

    .line 284
    .line 285
    new-instance v4, Lkotlin/Pair;

    .line 286
    .line 287
    const-wide/high16 v30, 0x4034000000000000L    # 20.0

    .line 288
    .line 289
    move-object/from16 v32, v5

    .line 290
    .line 291
    .line 292
    invoke-static/range {v30 .. v31}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 293
    move-result-object v5

    .line 294
    .line 295
    .line 296
    invoke-direct {v4, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 300
    move-result-object v4

    .line 301
    .line 302
    move-object/from16 v5, v16

    .line 303
    .line 304
    move-object/from16 v16, v1

    .line 305
    move-object v1, v8

    .line 306
    move-object v8, v13

    .line 307
    move-object v13, v4

    .line 308
    move-object v4, v5

    .line 309
    .line 310
    move-object/from16 v30, v3

    .line 311
    move-object v3, v7

    .line 312
    move-object v7, v9

    .line 313
    .line 314
    move-object/from16 v33, v10

    .line 315
    .line 316
    move-object/from16 v34, v11

    .line 317
    .line 318
    move-object/from16 v35, v12

    .line 319
    .line 320
    move-object/from16 v9, v21

    .line 321
    .line 322
    move-object/from16 v5, v23

    .line 323
    .line 324
    move-object/from16 v10, v25

    .line 325
    .line 326
    move-object/from16 v6, v28

    .line 327
    .line 328
    move-object/from16 v11, v29

    .line 329
    .line 330
    move-object/from16 v12, v32

    .line 331
    .line 332
    .line 333
    filled-new-array/range {v4 .. v13}, [Lkotlin/Pair;

    .line 334
    move-result-object v4

    .line 335
    .line 336
    .line 337
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 338
    move-result-object v4

    .line 339
    .line 340
    const-string v5, "light"

    .line 341
    .line 342
    .line 343
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 344
    move-result-object v4

    .line 345
    .line 346
    new-instance v5, Lkotlin/Pair;

    .line 347
    .line 348
    const-wide/high16 v6, -0x3fb2000000000000L    # -60.0

    .line 349
    .line 350
    .line 351
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 352
    move-result-object v6

    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    const-wide v7, -0x3fbe800000000000L    # -35.0

    .line 358
    .line 359
    .line 360
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 361
    move-result-object v7

    .line 362
    .line 363
    .line 364
    invoke-direct {v5, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v0, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 368
    move-result-object v36

    .line 369
    .line 370
    new-instance v0, Lkotlin/Pair;

    .line 371
    .line 372
    const-wide/high16 v5, -0x3fb7000000000000L    # -50.0

    .line 373
    .line 374
    .line 375
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 376
    move-result-object v5

    .line 377
    .line 378
    const-wide/high16 v6, -0x3fc7000000000000L    # -25.0

    .line 379
    .line 380
    .line 381
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 382
    move-result-object v6

    .line 383
    .line 384
    .line 385
    invoke-direct {v0, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 386
    .line 387
    move-object/from16 v5, v22

    .line 388
    .line 389
    .line 390
    invoke-static {v5, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 391
    move-result-object v37

    .line 392
    .line 393
    new-instance v0, Lkotlin/Pair;

    .line 394
    .line 395
    const-wide/high16 v5, -0x3fd2000000000000L    # -15.0

    .line 396
    .line 397
    .line 398
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 399
    move-result-object v5

    .line 400
    .line 401
    .line 402
    invoke-direct {v0, v2, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 403
    .line 404
    move-object/from16 v5, v19

    .line 405
    .line 406
    .line 407
    invoke-static {v5, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 408
    move-result-object v38

    .line 409
    .line 410
    new-instance v0, Lkotlin/Pair;

    .line 411
    .line 412
    move-object/from16 v5, v17

    .line 413
    .line 414
    .line 415
    invoke-direct {v0, v14, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 419
    move-result-object v39

    .line 420
    .line 421
    new-instance v0, Lkotlin/Pair;

    .line 422
    .line 423
    .line 424
    invoke-direct {v0, v3, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 425
    .line 426
    move-object/from16 v1, v35

    .line 427
    .line 428
    .line 429
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 430
    move-result-object v40

    .line 431
    .line 432
    new-instance v0, Lkotlin/Pair;

    .line 433
    .line 434
    move-object/from16 v1, v16

    .line 435
    .line 436
    .line 437
    invoke-direct {v0, v1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 438
    .line 439
    move-object/from16 v1, v30

    .line 440
    .line 441
    .line 442
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 443
    move-result-object v41

    .line 444
    .line 445
    .line 446
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 447
    move-result-object v0

    .line 448
    .line 449
    new-instance v1, Lkotlin/Pair;

    .line 450
    .line 451
    move-object/from16 v5, v33

    .line 452
    .line 453
    move-object/from16 v6, v34

    .line 454
    .line 455
    .line 456
    invoke-direct {v1, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 460
    move-result-object v42

    .line 461
    .line 462
    .line 463
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    move-result-object v0

    .line 465
    .line 466
    new-instance v1, Lkotlin/Pair;

    .line 467
    .line 468
    const-wide/high16 v5, 0x403e000000000000L    # 30.0

    .line 469
    .line 470
    .line 471
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 472
    move-result-object v5

    .line 473
    .line 474
    .line 475
    invoke-direct {v1, v3, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 479
    move-result-object v43

    .line 480
    .line 481
    .line 482
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 483
    move-result-object v0

    .line 484
    .line 485
    new-instance v1, Lkotlin/Pair;

    .line 486
    .line 487
    move-object/from16 v3, v18

    .line 488
    .line 489
    .line 490
    invoke-direct {v1, v14, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 494
    move-result-object v44

    .line 495
    .line 496
    .line 497
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 498
    move-result-object v0

    .line 499
    .line 500
    new-instance v1, Lkotlin/Pair;

    .line 501
    .line 502
    const-wide/high16 v5, 0x404e000000000000L    # 60.0

    .line 503
    .line 504
    .line 505
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 506
    move-result-object v3

    .line 507
    .line 508
    .line 509
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 513
    move-result-object v45

    .line 514
    .line 515
    .line 516
    filled-new-array/range {v36 .. v45}, [Lkotlin/Pair;

    .line 517
    move-result-object v0

    .line 518
    .line 519
    .line 520
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 521
    move-result-object v0

    .line 522
    .line 523
    const-string v1, "dark"

    .line 524
    .line 525
    .line 526
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 527
    move-result-object v0

    .line 528
    .line 529
    .line 530
    filled-new-array {v4, v0}, [Lkotlin/Pair;

    .line 531
    move-result-object v0

    .line 532
    .line 533
    .line 534
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 535
    move-result-object v0

    .line 536
    .line 537
    sput-object v0, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->c:Ljava/util/Map;

    .line 538
    return-void
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
.end method

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/Pair;)Ljava/lang/String;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->g(Ljava/lang/String;)Lkotlin/Triple;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Ljava/lang/Number;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 14
    move-result-wide v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    check-cast v2, Ljava/lang/Number;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 24
    move-result-wide v2

    .line 25
    add-double/2addr v0, v2

    .line 26
    .line 27
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 31
    move-result-wide v0

    .line 32
    .line 33
    const-wide/16 v4, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(DD)D

    .line 37
    move-result-wide v9

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    check-cast v0, Ljava/lang/Number;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 47
    move-result-wide v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 51
    move-result-object p2

    .line 52
    .line 53
    check-cast p2, Ljava/lang/Number;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 57
    move-result-wide v6

    .line 58
    add-double/2addr v0, v6

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 62
    move-result-wide v0

    .line 63
    .line 64
    .line 65
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(DD)D

    .line 66
    move-result-wide v11

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    check-cast p1, Ljava/lang/Number;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 76
    move-result-wide v7

    .line 77
    move-object v6, p0

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {v6 .. v12}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->h(DDD)Ljava/lang/String;

    .line 81
    move-result-object p1

    .line 82
    return-object p1
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
.end method

.method public final b(Lkotlin/Triple;Lkotlin/Triple;)D
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;",
            "Lkotlin/Triple<",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;)D"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Number;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    check-cast v2, Ljava/lang/Number;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 20
    move-result-wide v2

    .line 21
    sub-double/2addr v0, v2

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 25
    move-result-wide v0

    .line 26
    .line 27
    const/16 v2, 0x168

    .line 28
    int-to-double v2, v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    check-cast v4, Ljava/lang/Number;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    .line 38
    move-result-wide v4

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 42
    move-result-object v6

    .line 43
    .line 44
    check-cast v6, Ljava/lang/Number;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    .line 48
    move-result-wide v6

    .line 49
    sub-double/2addr v4, v6

    .line 50
    .line 51
    .line 52
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 53
    move-result-wide v4

    .line 54
    sub-double/2addr v2, v4

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 58
    move-result-wide v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    check-cast v2, Ljava/lang/Number;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 68
    move-result-wide v2

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    .line 72
    move-result-object v4

    .line 73
    .line 74
    check-cast v4, Ljava/lang/Number;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    .line 78
    move-result-wide v4

    .line 79
    sub-double/2addr v2, v4

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    check-cast p1, Ljava/lang/Number;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 89
    move-result-wide v4

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    check-cast p1, Ljava/lang/Number;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 99
    move-result-wide p1

    .line 100
    sub-double/2addr v4, p1

    .line 101
    mul-double/2addr v0, v0

    .line 102
    mul-double/2addr v2, v2

    .line 103
    add-double/2addr v0, v2

    .line 104
    mul-double/2addr v4, v4

    .line 105
    add-double/2addr v0, v4

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 109
    move-result-wide p1

    .line 110
    return-wide p1
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
.end method

.method public final c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "baseColor"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v0, "theme"

    .line 14
    .line 15
    .line 16
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p2}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->i(Ljava/lang/String;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->e(Ljava/lang/String;)Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, p2, p3}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->f(Landroid/content/Context;Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;Ljava/lang/String;)Ljava/util/List;

    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0, p2, p3}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 35
    move-result-object p1

    .line 36
    return-object p1
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
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    sget-object v2, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->c:Ljava/util/Map;

    .line 10
    .line 11
    move-object/from16 v3, p2

    .line 12
    .line 13
    .line 14
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    check-cast v3, Ljava/util/Map;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    const-string v3, "light"

    .line 22
    .line 23
    .line 24
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 29
    move-object v3, v2

    .line 30
    .line 31
    check-cast v3, Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual/range {p0 .. p1}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->g(Ljava/lang/String;)Lkotlin/Triple;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    check-cast v4, Ljava/lang/Number;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    .line 45
    move-result-wide v4

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    const-wide v6, 0x4051800000000000L    # 70.0

    .line 51
    .line 52
    cmpl-double v4, v4, v6

    .line 53
    .line 54
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    const-wide v10, 0x3ff3333333333333L    # 1.2

    .line 60
    .line 61
    const-wide/high16 v12, 0x403e000000000000L    # 30.0

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    const-wide v14, 0x3fe999999999999aL    # 0.8

    .line 67
    .line 68
    if-lez v4, :cond_1

    .line 69
    move-wide v4, v14

    .line 70
    goto :goto_0

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-virtual {v2}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    check-cast v4, Ljava/lang/Number;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    .line 80
    move-result-wide v4

    .line 81
    .line 82
    cmpg-double v4, v4, v12

    .line 83
    .line 84
    if-gez v4, :cond_2

    .line 85
    move-wide v4, v10

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    move-wide v4, v8

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-virtual {v2}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 91
    move-result-object v16

    .line 92
    .line 93
    check-cast v16, Ljava/lang/Number;

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->doubleValue()D

    .line 97
    move-result-wide v16

    .line 98
    .line 99
    cmpl-double v6, v16, v6

    .line 100
    .line 101
    if-lez v6, :cond_3

    .line 102
    move-wide v8, v14

    .line 103
    goto :goto_1

    .line 104
    .line 105
    .line 106
    :cond_3
    invoke-virtual {v2}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    check-cast v2, Ljava/lang/Number;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 113
    move-result-wide v6

    .line 114
    .line 115
    cmpg-double v2, v6, v12

    .line 116
    .line 117
    if-gez v2, :cond_4

    .line 118
    move-wide v8, v10

    .line 119
    :cond_4
    :goto_1
    const/4 v2, 0x1

    .line 120
    .line 121
    :goto_2
    const/16 v6, 0xb

    .line 122
    .line 123
    if-ge v2, v6, :cond_6

    .line 124
    .line 125
    .line 126
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    move-result-object v6

    .line 128
    .line 129
    .line 130
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    move-result-object v6

    .line 132
    .line 133
    check-cast v6, Lkotlin/Pair;

    .line 134
    .line 135
    if-nez v6, :cond_5

    .line 136
    .line 137
    new-instance v6, Lkotlin/Pair;

    .line 138
    .line 139
    const-wide/16 v10, 0x0

    .line 140
    .line 141
    .line 142
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 143
    move-result-object v7

    .line 144
    .line 145
    .line 146
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 147
    move-result-object v10

    .line 148
    .line 149
    .line 150
    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_5
    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 154
    move-result-object v7

    .line 155
    .line 156
    check-cast v7, Ljava/lang/Number;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    .line 160
    move-result-wide v10

    .line 161
    mul-double/2addr v10, v4

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 165
    move-result-object v6

    .line 166
    .line 167
    check-cast v6, Ljava/lang/Number;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    .line 171
    move-result-wide v6

    .line 172
    mul-double/2addr v6, v8

    .line 173
    .line 174
    new-instance v12, Lkotlin/Pair;

    .line 175
    .line 176
    .line 177
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 178
    move-result-object v10

    .line 179
    .line 180
    .line 181
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 182
    move-result-object v6

    .line 183
    .line 184
    .line 185
    invoke-direct {v12, v10, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 186
    .line 187
    move-object/from16 v6, p1

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v6, v12}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->a(Ljava/lang/String;Lkotlin/Pair;)Ljava/lang/String;

    .line 191
    move-result-object v7

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v7}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->j(Ljava/lang/String;)I

    .line 195
    move-result v7

    .line 196
    .line 197
    .line 198
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    move-result-object v7

    .line 200
    .line 201
    .line 202
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    add-int/lit8 v2, v2, 0x1

    .line 205
    goto :goto_2

    .line 206
    :cond_6
    return-object v1
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
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method

.method public final e(Ljava/lang/String;)Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->g(Ljava/lang/String;)Lkotlin/Triple;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    sget-object v0, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->b:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 12
    move-result v2

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    check-cast v2, Ljava/util/Map$Entry;

    .line 36
    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    check-cast v3, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;

    .line 42
    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    check-cast v2, Ljava/lang/String;

    .line 48
    .line 49
    sget-object v4, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->a:Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v2}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->g(Ljava/lang/String;)Lkotlin/Triple;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, p1, v2}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->b(Lkotlin/Triple;Lkotlin/Triple;)D

    .line 57
    move-result-wide v4

    .line 58
    .line 59
    .line 60
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 69
    goto :goto_0

    .line 70
    .line 71
    .line 72
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    move-result v0

    .line 78
    .line 79
    if-nez v0, :cond_1

    .line 80
    const/4 p1, 0x0

    .line 81
    goto :goto_2

    .line 82
    .line 83
    .line 84
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    move-result v1

    .line 90
    .line 91
    if-nez v1, :cond_2

    .line 92
    :goto_1
    move-object p1, v0

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    move-object v1, v0

    .line 95
    .line 96
    check-cast v1, Lkotlin/Pair;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 100
    move-result-object v1

    .line 101
    .line 102
    check-cast v1, Ljava/lang/Number;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 106
    move-result-wide v1

    .line 107
    .line 108
    .line 109
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    move-result-object v3

    .line 111
    move-object v4, v3

    .line 112
    .line 113
    check-cast v4, Lkotlin/Pair;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 117
    move-result-object v4

    .line 118
    .line 119
    check-cast v4, Ljava/lang/Number;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    .line 123
    move-result-wide v4

    .line 124
    .line 125
    .line 126
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Double;->compare(DD)I

    .line 127
    move-result v6

    .line 128
    .line 129
    if-lez v6, :cond_4

    .line 130
    move-object v0, v3

    .line 131
    move-wide v1, v4

    .line 132
    .line 133
    .line 134
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    move-result v3

    .line 136
    .line 137
    if-nez v3, :cond_3

    .line 138
    goto :goto_1

    .line 139
    .line 140
    :goto_2
    check-cast p1, Lkotlin/Pair;

    .line 141
    .line 142
    if-eqz p1, :cond_6

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    check-cast p1, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;

    .line 149
    .line 150
    if-nez p1, :cond_5

    .line 151
    goto :goto_3

    .line 152
    :cond_5
    return-object p1

    .line 153
    .line 154
    :cond_6
    :goto_3
    sget-object p1, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;->BLUE:Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;

    .line 155
    return-object p1
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
.end method

.method public final f(Landroid/content/Context;Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$PaletteType;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm$a;->$EnumSwitchMapping$0:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p2

    .line 7
    .line 8
    aget p2, v0, p2

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    const-string v1, "dark"

    .line 12
    .line 13
    if-eq p2, v0, :cond_6

    .line 14
    const/4 v0, 0x2

    .line 15
    .line 16
    if-eq p2, v0, :cond_4

    .line 17
    const/4 v0, 0x3

    .line 18
    .line 19
    if-eq p2, v0, :cond_2

    .line 20
    const/4 v0, 0x4

    .line 21
    .line 22
    if-ne p2, v0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    move-result p2

    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_dark_1:I

    .line 31
    .line 32
    .line 33
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_dark_2:I

    .line 37
    .line 38
    .line 39
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_dark_3:I

    .line 43
    .line 44
    .line 45
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_dark_4:I

    .line 49
    .line 50
    .line 51
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_dark_5:I

    .line 55
    .line 56
    .line 57
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_dark_6:I

    .line 61
    .line 62
    .line 63
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    move-result-object v5

    .line 65
    .line 66
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_dark_7:I

    .line 67
    .line 68
    .line 69
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    move-result-object v6

    .line 71
    .line 72
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_dark_8:I

    .line 73
    .line 74
    .line 75
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    move-result-object v7

    .line 77
    .line 78
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_dark_9:I

    .line 79
    .line 80
    .line 81
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    move-result-object v8

    .line 83
    .line 84
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_dark_10:I

    .line 85
    .line 86
    .line 87
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    move-result-object v9

    .line 89
    .line 90
    .line 91
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Integer;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    .line 95
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 96
    move-result-object p2

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :cond_0
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_light_1:I

    .line 101
    .line 102
    .line 103
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_light_2:I

    .line 107
    .line 108
    .line 109
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_light_3:I

    .line 113
    .line 114
    .line 115
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_light_4:I

    .line 119
    .line 120
    .line 121
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    move-result-object v3

    .line 123
    .line 124
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_light_5:I

    .line 125
    .line 126
    .line 127
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    move-result-object v4

    .line 129
    .line 130
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_light_6:I

    .line 131
    .line 132
    .line 133
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    move-result-object v5

    .line 135
    .line 136
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_light_7:I

    .line 137
    .line 138
    .line 139
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    move-result-object v6

    .line 141
    .line 142
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_light_8:I

    .line 143
    .line 144
    .line 145
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    move-result-object v7

    .line 147
    .line 148
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_light_9:I

    .line 149
    .line 150
    .line 151
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    move-result-object v8

    .line 153
    .line 154
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->orange_light_10:I

    .line 155
    .line 156
    .line 157
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    move-result-object v9

    .line 159
    .line 160
    .line 161
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Integer;

    .line 162
    move-result-object p2

    .line 163
    .line 164
    .line 165
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 166
    move-result-object p2

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 171
    .line 172
    .line 173
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 174
    throw p1

    .line 175
    .line 176
    .line 177
    :cond_2
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    move-result p2

    .line 179
    .line 180
    if-eqz p2, :cond_3

    .line 181
    .line 182
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_dark_1:I

    .line 183
    .line 184
    .line 185
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    move-result-object v0

    .line 187
    .line 188
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_dark_2:I

    .line 189
    .line 190
    .line 191
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    move-result-object v1

    .line 193
    .line 194
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_dark_3:I

    .line 195
    .line 196
    .line 197
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    move-result-object v2

    .line 199
    .line 200
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_dark_4:I

    .line 201
    .line 202
    .line 203
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    move-result-object v3

    .line 205
    .line 206
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_dark_5:I

    .line 207
    .line 208
    .line 209
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    move-result-object v4

    .line 211
    .line 212
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_dark_6:I

    .line 213
    .line 214
    .line 215
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    move-result-object v5

    .line 217
    .line 218
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_dark_7:I

    .line 219
    .line 220
    .line 221
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    move-result-object v6

    .line 223
    .line 224
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_dark_8:I

    .line 225
    .line 226
    .line 227
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    move-result-object v7

    .line 229
    .line 230
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_dark_9:I

    .line 231
    .line 232
    .line 233
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    move-result-object v8

    .line 235
    .line 236
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_dark_10:I

    .line 237
    .line 238
    .line 239
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    move-result-object v9

    .line 241
    .line 242
    .line 243
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Integer;

    .line 244
    move-result-object p2

    .line 245
    .line 246
    .line 247
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 248
    move-result-object p2

    .line 249
    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    :cond_3
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_light_1:I

    .line 253
    .line 254
    .line 255
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    move-result-object v0

    .line 257
    .line 258
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_light_2:I

    .line 259
    .line 260
    .line 261
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    move-result-object v1

    .line 263
    .line 264
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_light_3:I

    .line 265
    .line 266
    .line 267
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    move-result-object v2

    .line 269
    .line 270
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_light_4:I

    .line 271
    .line 272
    .line 273
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    move-result-object v3

    .line 275
    .line 276
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_light_5:I

    .line 277
    .line 278
    .line 279
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    move-result-object v4

    .line 281
    .line 282
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_light_6:I

    .line 283
    .line 284
    .line 285
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    move-result-object v5

    .line 287
    .line 288
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_light_7:I

    .line 289
    .line 290
    .line 291
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    move-result-object v6

    .line 293
    .line 294
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_light_8:I

    .line 295
    .line 296
    .line 297
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    move-result-object v7

    .line 299
    .line 300
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_light_9:I

    .line 301
    .line 302
    .line 303
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    move-result-object v8

    .line 305
    .line 306
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->red_light_10:I

    .line 307
    .line 308
    .line 309
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    move-result-object v9

    .line 311
    .line 312
    .line 313
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Integer;

    .line 314
    move-result-object p2

    .line 315
    .line 316
    .line 317
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 318
    move-result-object p2

    .line 319
    .line 320
    goto/16 :goto_0

    .line 321
    .line 322
    .line 323
    :cond_4
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    move-result p2

    .line 325
    .line 326
    if-eqz p2, :cond_5

    .line 327
    .line 328
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_dark_1:I

    .line 329
    .line 330
    .line 331
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    move-result-object v0

    .line 333
    .line 334
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_dark_2:I

    .line 335
    .line 336
    .line 337
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    move-result-object v1

    .line 339
    .line 340
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_dark_3:I

    .line 341
    .line 342
    .line 343
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    move-result-object v2

    .line 345
    .line 346
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_dark_4:I

    .line 347
    .line 348
    .line 349
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 350
    move-result-object v3

    .line 351
    .line 352
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_dark_5:I

    .line 353
    .line 354
    .line 355
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    move-result-object v4

    .line 357
    .line 358
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_dark_6:I

    .line 359
    .line 360
    .line 361
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    move-result-object v5

    .line 363
    .line 364
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_dark_7:I

    .line 365
    .line 366
    .line 367
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    move-result-object v6

    .line 369
    .line 370
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_dark_8:I

    .line 371
    .line 372
    .line 373
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 374
    move-result-object v7

    .line 375
    .line 376
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_dark_9:I

    .line 377
    .line 378
    .line 379
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 380
    move-result-object v8

    .line 381
    .line 382
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_dark_10:I

    .line 383
    .line 384
    .line 385
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    move-result-object v9

    .line 387
    .line 388
    .line 389
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Integer;

    .line 390
    move-result-object p2

    .line 391
    .line 392
    .line 393
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 394
    move-result-object p2

    .line 395
    .line 396
    goto/16 :goto_0

    .line 397
    .line 398
    :cond_5
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_light_1:I

    .line 399
    .line 400
    .line 401
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    move-result-object v0

    .line 403
    .line 404
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_light_2:I

    .line 405
    .line 406
    .line 407
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 408
    move-result-object v1

    .line 409
    .line 410
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_light_3:I

    .line 411
    .line 412
    .line 413
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    move-result-object v2

    .line 415
    .line 416
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_light_4:I

    .line 417
    .line 418
    .line 419
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 420
    move-result-object v3

    .line 421
    .line 422
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_light_5:I

    .line 423
    .line 424
    .line 425
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 426
    move-result-object v4

    .line 427
    .line 428
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_light_6:I

    .line 429
    .line 430
    .line 431
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 432
    move-result-object v5

    .line 433
    .line 434
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_light_7:I

    .line 435
    .line 436
    .line 437
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 438
    move-result-object v6

    .line 439
    .line 440
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_light_8:I

    .line 441
    .line 442
    .line 443
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    move-result-object v7

    .line 445
    .line 446
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_light_9:I

    .line 447
    .line 448
    .line 449
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    move-result-object v8

    .line 451
    .line 452
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->green_light_10:I

    .line 453
    .line 454
    .line 455
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 456
    move-result-object v9

    .line 457
    .line 458
    .line 459
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Integer;

    .line 460
    move-result-object p2

    .line 461
    .line 462
    .line 463
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 464
    move-result-object p2

    .line 465
    .line 466
    goto/16 :goto_0

    .line 467
    .line 468
    .line 469
    :cond_6
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 470
    move-result p2

    .line 471
    .line 472
    if-eqz p2, :cond_7

    .line 473
    .line 474
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_dark_1:I

    .line 475
    .line 476
    .line 477
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 478
    move-result-object v0

    .line 479
    .line 480
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_dark_2:I

    .line 481
    .line 482
    .line 483
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 484
    move-result-object v1

    .line 485
    .line 486
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_dark_3:I

    .line 487
    .line 488
    .line 489
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 490
    move-result-object v2

    .line 491
    .line 492
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_dark_4:I

    .line 493
    .line 494
    .line 495
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 496
    move-result-object v3

    .line 497
    .line 498
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_dark_5:I

    .line 499
    .line 500
    .line 501
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    move-result-object v4

    .line 503
    .line 504
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_dark_6:I

    .line 505
    .line 506
    .line 507
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 508
    move-result-object v5

    .line 509
    .line 510
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_dark_7:I

    .line 511
    .line 512
    .line 513
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 514
    move-result-object v6

    .line 515
    .line 516
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_dark_8:I

    .line 517
    .line 518
    .line 519
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 520
    move-result-object v7

    .line 521
    .line 522
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_dark_9:I

    .line 523
    .line 524
    .line 525
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 526
    move-result-object v8

    .line 527
    .line 528
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_dark_10:I

    .line 529
    .line 530
    .line 531
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 532
    move-result-object v9

    .line 533
    .line 534
    .line 535
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Integer;

    .line 536
    move-result-object p2

    .line 537
    .line 538
    .line 539
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 540
    move-result-object p2

    .line 541
    goto :goto_0

    .line 542
    .line 543
    :cond_7
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_light_1:I

    .line 544
    .line 545
    .line 546
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 547
    move-result-object v0

    .line 548
    .line 549
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_light_2:I

    .line 550
    .line 551
    .line 552
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 553
    move-result-object v1

    .line 554
    .line 555
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_light_3:I

    .line 556
    .line 557
    .line 558
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 559
    move-result-object v2

    .line 560
    .line 561
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_light_4:I

    .line 562
    .line 563
    .line 564
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    move-result-object v3

    .line 566
    .line 567
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_light_5:I

    .line 568
    .line 569
    .line 570
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 571
    move-result-object v4

    .line 572
    .line 573
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_light_6:I

    .line 574
    .line 575
    .line 576
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 577
    move-result-object v5

    .line 578
    .line 579
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_light_7:I

    .line 580
    .line 581
    .line 582
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 583
    move-result-object v6

    .line 584
    .line 585
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_light_8:I

    .line 586
    .line 587
    .line 588
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 589
    move-result-object v7

    .line 590
    .line 591
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_light_9:I

    .line 592
    .line 593
    .line 594
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 595
    move-result-object v8

    .line 596
    .line 597
    sget p2, Lio/trtc/tuikit/atomicx/R$color;->theme_light_10:I

    .line 598
    .line 599
    .line 600
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 601
    move-result-object v9

    .line 602
    .line 603
    .line 604
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Integer;

    .line 605
    move-result-object p2

    .line 606
    .line 607
    .line 608
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 609
    move-result-object p2

    .line 610
    .line 611
    :goto_0
    new-instance p3, Ljava/util/ArrayList;

    .line 612
    .line 613
    const/16 v0, 0xa

    .line 614
    .line 615
    .line 616
    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 617
    move-result v0

    .line 618
    .line 619
    .line 620
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 621
    .line 622
    .line 623
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 624
    move-result-object p2

    .line 625
    .line 626
    .line 627
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 628
    move-result v0

    .line 629
    .line 630
    if-eqz v0, :cond_8

    .line 631
    .line 632
    .line 633
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 634
    move-result-object v0

    .line 635
    .line 636
    check-cast v0, Ljava/lang/Number;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 640
    move-result v0

    .line 641
    .line 642
    .line 643
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 644
    move-result v0

    .line 645
    .line 646
    .line 647
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 648
    move-result-object v0

    .line 649
    .line 650
    .line 651
    invoke-interface {p3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 652
    goto :goto_1

    .line 653
    :cond_8
    return-object p3
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
.end method

.method public final g(Ljava/lang/String;)Lkotlin/Triple;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Triple<",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "#"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lkotlin/text/CharsKt;->checkRadix(I)I

    .line 14
    move-result v2

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 18
    move-result-wide v2

    .line 19
    .line 20
    shr-long v0, v2, v1

    .line 21
    .line 22
    const-wide/16 v4, 0xff

    .line 23
    and-long/2addr v0, v4

    .line 24
    long-to-double v0, v0

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const-wide v6, 0x406fe00000000000L    # 255.0

    .line 30
    div-double/2addr v0, v6

    .line 31
    .line 32
    const/16 v8, 0x8

    .line 33
    .line 34
    shr-long v8, v2, v8

    .line 35
    and-long/2addr v8, v4

    .line 36
    long-to-double v8, v8

    .line 37
    div-double/2addr v8, v6

    .line 38
    and-long/2addr v2, v4

    .line 39
    long-to-double v2, v2

    .line 40
    div-double/2addr v2, v6

    .line 41
    .line 42
    .line 43
    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 44
    move-result-wide v4

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 48
    move-result-wide v4

    .line 49
    .line 50
    .line 51
    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 52
    move-result-wide v6

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->min(DD)D

    .line 56
    move-result-wide v6

    .line 57
    .line 58
    add-double v10, v4, v6

    .line 59
    .line 60
    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 61
    .line 62
    div-double v14, v10, v12

    .line 63
    .line 64
    cmpg-double v16, v4, v6

    .line 65
    .line 66
    const-wide/16 v17, 0x0

    .line 67
    .line 68
    if-nez v16, :cond_0

    .line 69
    .line 70
    move-wide/from16 v6, v17

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_0
    sub-double v19, v4, v6

    .line 74
    .line 75
    const-wide/high16 v21, 0x3fe0000000000000L    # 0.5

    .line 76
    .line 77
    cmpl-double v16, v14, v21

    .line 78
    .line 79
    if-lez v16, :cond_1

    .line 80
    .line 81
    sub-double v10, v12, v4

    .line 82
    sub-double/2addr v10, v6

    .line 83
    .line 84
    :cond_1
    div-double v6, v19, v10

    .line 85
    .line 86
    cmpg-double v10, v4, v0

    .line 87
    .line 88
    const-wide/high16 v21, 0x4018000000000000L    # 6.0

    .line 89
    .line 90
    if-nez v10, :cond_3

    .line 91
    .line 92
    sub-double v0, v8, v2

    .line 93
    .line 94
    div-double v0, v0, v19

    .line 95
    .line 96
    cmpg-double v2, v8, v2

    .line 97
    .line 98
    if-gez v2, :cond_2

    .line 99
    .line 100
    move-wide/from16 v17, v21

    .line 101
    .line 102
    :cond_2
    add-double v17, v0, v17

    .line 103
    goto :goto_0

    .line 104
    .line 105
    :cond_3
    cmpg-double v10, v4, v8

    .line 106
    .line 107
    if-nez v10, :cond_4

    .line 108
    sub-double/2addr v2, v0

    .line 109
    .line 110
    div-double v2, v2, v19

    .line 111
    .line 112
    add-double v17, v2, v12

    .line 113
    goto :goto_0

    .line 114
    .line 115
    :cond_4
    cmpg-double v2, v4, v2

    .line 116
    .line 117
    if-nez v2, :cond_5

    .line 118
    sub-double/2addr v0, v8

    .line 119
    .line 120
    div-double v0, v0, v19

    .line 121
    .line 122
    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    .line 123
    .line 124
    add-double v17, v0, v2

    .line 125
    .line 126
    :cond_5
    :goto_0
    div-double v17, v17, v21

    .line 127
    .line 128
    :goto_1
    new-instance v0, Lkotlin/Triple;

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    const-wide v1, 0x4076800000000000L    # 360.0

    .line 134
    .line 135
    mul-double v17, v17, v1

    .line 136
    .line 137
    .line 138
    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 139
    move-result-object v1

    .line 140
    .line 141
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 142
    mul-double/2addr v6, v2

    .line 143
    .line 144
    .line 145
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 146
    move-result-object v4

    .line 147
    mul-double/2addr v14, v2

    .line 148
    .line 149
    .line 150
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 151
    move-result-object v2

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, v1, v4, v2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    return-object v0
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
.end method

.method public final h(DDD)Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    .line 3
    .line 4
    .line 5
    const-wide v0, 0x4076800000000000L    # 360.0

    .line 6
    div-double/2addr p1, v0

    .line 7
    .line 8
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 9
    div-double/2addr p3, v0

    .line 10
    div-double/2addr p5, v0

    .line 11
    .line 12
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 13
    .line 14
    mul-double v2, p5, v0

    .line 15
    .line 16
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 17
    sub-double/2addr v2, v4

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 21
    move-result-wide v2

    .line 22
    .line 23
    sub-double v2, v4, v2

    .line 24
    mul-double/2addr v2, p3

    .line 25
    .line 26
    const-wide/high16 p3, 0x4018000000000000L    # 6.0

    .line 27
    mul-double/2addr p1, p3

    .line 28
    .line 29
    rem-double p3, p1, v0

    .line 30
    sub-double/2addr p3, v4

    .line 31
    .line 32
    .line 33
    invoke-static {p3, p4}, Ljava/lang/Math;->abs(D)D

    .line 34
    move-result-wide p3

    .line 35
    sub-double/2addr v4, p3

    .line 36
    mul-double/2addr v4, v2

    .line 37
    .line 38
    div-double p3, v2, v0

    .line 39
    sub-double/2addr p5, p3

    .line 40
    double-to-int p1, p1

    .line 41
    const/4 p2, 0x3

    .line 42
    .line 43
    const-wide/16 p3, 0x0

    .line 44
    .line 45
    if-eqz p1, :cond_5

    .line 46
    const/4 v0, 0x1

    .line 47
    .line 48
    if-eq p1, v0, :cond_4

    .line 49
    const/4 v0, 0x2

    .line 50
    .line 51
    if-eq p1, v0, :cond_3

    .line 52
    .line 53
    if-eq p1, p2, :cond_2

    .line 54
    const/4 v0, 0x4

    .line 55
    .line 56
    if-eq p1, v0, :cond_1

    .line 57
    const/4 v0, 0x5

    .line 58
    .line 59
    if-eq p1, v0, :cond_0

    .line 60
    .line 61
    new-instance p1, Lkotlin/Triple;

    .line 62
    .line 63
    .line 64
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    .line 68
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    .line 72
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 73
    move-result-object p3

    .line 74
    .line 75
    .line 76
    invoke-direct {p1, v0, v1, p3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_0
    new-instance p1, Lkotlin/Triple;

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 87
    move-result-object p3

    .line 88
    .line 89
    .line 90
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 91
    move-result-object p4

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, v0, p3, p4}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    goto :goto_0

    .line 96
    .line 97
    :cond_1
    new-instance p1, Lkotlin/Triple;

    .line 98
    .line 99
    .line 100
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 105
    move-result-object p3

    .line 106
    .line 107
    .line 108
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 109
    move-result-object p4

    .line 110
    .line 111
    .line 112
    invoke-direct {p1, v0, p3, p4}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    goto :goto_0

    .line 114
    .line 115
    :cond_2
    new-instance p1, Lkotlin/Triple;

    .line 116
    .line 117
    .line 118
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 119
    move-result-object p3

    .line 120
    .line 121
    .line 122
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 123
    move-result-object p4

    .line 124
    .line 125
    .line 126
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    .line 130
    invoke-direct {p1, p3, p4, v0}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    goto :goto_0

    .line 132
    .line 133
    :cond_3
    new-instance p1, Lkotlin/Triple;

    .line 134
    .line 135
    .line 136
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 137
    move-result-object p3

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 141
    move-result-object p4

    .line 142
    .line 143
    .line 144
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    invoke-direct {p1, p3, p4, v0}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    goto :goto_0

    .line 150
    .line 151
    :cond_4
    new-instance p1, Lkotlin/Triple;

    .line 152
    .line 153
    .line 154
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    .line 158
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 159
    move-result-object v1

    .line 160
    .line 161
    .line 162
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 163
    move-result-object p3

    .line 164
    .line 165
    .line 166
    invoke-direct {p1, v0, v1, p3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 167
    goto :goto_0

    .line 168
    .line 169
    :cond_5
    new-instance p1, Lkotlin/Triple;

    .line 170
    .line 171
    .line 172
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 173
    move-result-object v0

    .line 174
    .line 175
    .line 176
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 177
    move-result-object v1

    .line 178
    .line 179
    .line 180
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 181
    move-result-object p3

    .line 182
    .line 183
    .line 184
    invoke-direct {p1, v0, v1, p3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :goto_0
    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    .line 188
    move-result-object p3

    .line 189
    .line 190
    check-cast p3, Ljava/lang/Number;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p3}, Ljava/lang/Number;->doubleValue()D

    .line 194
    move-result-wide p3

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    .line 198
    move-result-object v0

    .line 199
    .line 200
    check-cast v0, Ljava/lang/Number;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 204
    move-result-wide v0

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    .line 208
    move-result-object p1

    .line 209
    .line 210
    check-cast p1, Ljava/lang/Number;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 214
    move-result-wide v2

    .line 215
    add-double/2addr p3, p5

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    const-wide v4, 0x406fe00000000000L    # 255.0

    .line 221
    mul-double/2addr p3, v4

    .line 222
    double-to-int p1, p3

    .line 223
    add-double/2addr v0, p5

    .line 224
    mul-double/2addr v0, v4

    .line 225
    double-to-int p3, v0

    .line 226
    add-double/2addr v2, p5

    .line 227
    mul-double/2addr v2, v4

    .line 228
    double-to-int p4, v2

    .line 229
    .line 230
    .line 231
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    move-result-object p1

    .line 233
    .line 234
    .line 235
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    move-result-object p3

    .line 237
    .line 238
    .line 239
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    move-result-object p4

    .line 241
    .line 242
    .line 243
    filled-new-array {p1, p3, p4}, [Ljava/lang/Object;

    .line 244
    move-result-object p1

    .line 245
    .line 246
    .line 247
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 248
    move-result-object p1

    .line 249
    .line 250
    const-string p2, "#%02X%02X%02X"

    .line 251
    .line 252
    .line 253
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 254
    move-result-object p1

    .line 255
    .line 256
    const-string p2, "format(...)"

    .line 257
    .line 258
    .line 259
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    return-object p1
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
.end method

.method public final i(Ljava/lang/String;)Z
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->g(Ljava/lang/String;)Lkotlin/Triple;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    sget-object v0, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->b:Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    move-result v2

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    return v1

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    move-result v2

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    sget-object v3, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->a:Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v2}, Lio/trtc/tuikit/atomicx/theme/utils/ColorAlgorithm;->g(Ljava/lang/String;)Lkotlin/Triple;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    check-cast v3, Ljava/lang/Number;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 52
    move-result-wide v3

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 56
    move-result-object v5

    .line 57
    .line 58
    check-cast v5, Ljava/lang/Number;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    .line 62
    move-result-wide v5

    .line 63
    sub-double/2addr v3, v5

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    .line 67
    move-result-wide v3

    .line 68
    .line 69
    const/16 v5, 0x168

    .line 70
    int-to-double v5, v5

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 74
    move-result-object v7

    .line 75
    .line 76
    check-cast v7, Ljava/lang/Number;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    .line 80
    move-result-wide v7

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 84
    move-result-object v9

    .line 85
    .line 86
    check-cast v9, Ljava/lang/Number;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v9}, Ljava/lang/Number;->doubleValue()D

    .line 90
    move-result-wide v9

    .line 91
    sub-double/2addr v7, v9

    .line 92
    .line 93
    .line 94
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    .line 95
    move-result-wide v7

    .line 96
    sub-double/2addr v5, v7

    .line 97
    .line 98
    .line 99
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(DD)D

    .line 100
    move-result-wide v3

    .line 101
    .line 102
    const-wide/high16 v5, 0x402e000000000000L    # 15.0

    .line 103
    .line 104
    cmpg-double v3, v3, v5

    .line 105
    .line 106
    if-gez v3, :cond_1

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    .line 110
    move-result-object v3

    .line 111
    .line 112
    check-cast v3, Ljava/lang/Number;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 116
    move-result-wide v3

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    .line 120
    move-result-object v7

    .line 121
    .line 122
    check-cast v7, Ljava/lang/Number;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    .line 126
    move-result-wide v7

    .line 127
    sub-double/2addr v3, v7

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    .line 131
    move-result-wide v3

    .line 132
    .line 133
    cmpg-double v3, v3, v5

    .line 134
    .line 135
    if-gez v3, :cond_1

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 139
    move-result-object v3

    .line 140
    .line 141
    check-cast v3, Ljava/lang/Number;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 145
    move-result-wide v3

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 149
    move-result-object v2

    .line 150
    .line 151
    check-cast v2, Ljava/lang/Number;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 155
    move-result-wide v7

    .line 156
    sub-double/2addr v3, v7

    .line 157
    .line 158
    .line 159
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    .line 160
    move-result-wide v2

    .line 161
    .line 162
    cmpg-double v2, v2, v5

    .line 163
    .line 164
    if-gez v2, :cond_1

    .line 165
    const/4 p1, 0x1

    .line 166
    return p1

    .line 167
    :cond_2
    return v1
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
.end method

.method public final j(Ljava/lang/String;)I
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation

    .line 1
    .line 2
    const-string v0, "hexColor"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "#"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    const/16 v1, 0x23

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 32
    move-result p1

    .line 33
    return p1
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
.end method
