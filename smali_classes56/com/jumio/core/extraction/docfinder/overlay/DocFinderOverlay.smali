.class public final Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;
.super Lcom/jumio/core/overlay/JVisionOverlay;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;,
        Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\t\u0018\u00002\u00020\u0001:\u0002DEB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0008\u0010\'\u001a\u00020!H\u0014J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020!2\u0006\u0010)\u001a\u00020*H\u0002J\u0014\u0010,\u001a\u00020!2\n\u0010-\u001a\u0006\u0012\u0002\u0008\u00030.H\u0016J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0002J\u001c\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018032\u0006\u00100\u001a\u000201H\u0002J\u0010\u00104\u001a\u00020!2\u0006\u0010)\u001a\u00020*H\u0002J$\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u00106\u001a\u00020\u0014H\u0002J0\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00082\u0006\u0010:\u001a\u00020\u00082\u0006\u0010;\u001a\u00020\u00082\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u0002J\u0008\u0010?\u001a\u00020!H\u0002J\u0016\u0010@\u001a\u00020!2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002J\u0010\u0010A\u001a\u00020!2\u0006\u0010B\u001a\u00020\u000eH\u0002J\u0008\u0010C\u001a\u00020!H\u0016R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"
    }
    d2 = {
        "Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;",
        "Lcom/jumio/core/overlay/JVisionOverlay;",
        "context",
        "Lcom/jumio/core/MobileContext;",
        "<init>",
        "(Lcom/jumio/core/MobileContext;)V",
        "corners",
        "",
        "Landroid/graphics/PointF;",
        "validLinesPaint",
        "Landroid/graphics/Paint;",
        "invalidLinesPaint",
        "idAlignmentPaint",
        "targetStrokeColor",
        "",
        "currentPaint",
        "guideCorners",
        "showGuideOverlay",
        "",
        "currentRotationAngle",
        "",
        "documentOrientationFormat",
        "Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;",
        "layoutOrientation",
        "Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;",
        "rootView",
        "Landroid/view/ViewGroup;",
        "animatedCorners",
        "targetCorners",
        "cornerAnimator",
        "Landroid/animation/ValueAnimator;",
        "colorAnimator",
        "calculate",
        "",
        "cameraSettings",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "extractionArea",
        "Landroid/graphics/Rect;",
        "addViews",
        "prepareBackground",
        "doDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "drawCorners",
        "update",
        "extractionUpdate",
        "Lcom/jumio/core/extraction/ExtractionUpdateInterface;",
        "checkGuideOrientationAndRotation",
        "baseImageData",
        "Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;",
        "calculateOrientationAndRotation",
        "Lkotlin/Pair;",
        "drawGuidePolygon",
        "rotatePolygon",
        "angle",
        "buildCornerPath",
        "Landroid/graphics/Path;",
        "corner",
        "toX",
        "toY",
        "sideLength",
        "",
        "cornerRadius",
        "calculateGuidePolygon",
        "animateCorners",
        "animateStrokeColor",
        "color",
        "destroy",
        "LayoutOrientation",
        "DocumentOrientationFormat",
        "jumio-docfinder_release"
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
        "SMAP\nDocFinderOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocFinderOverlay.kt\ncom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay\n+ 2 Log.kt\ncom/jumio/commons/log/Log\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,439:1\n34#2:440\n1#3:441\n1557#4:442\n1628#4,3:443\n1557#4:446\n1628#4,3:447\n1557#4:450\n1628#4,3:451\n1567#4:454\n1598#4,4:455\n*S KotlinDebug\n*F\n+ 1 DocFinderOverlay.kt\ncom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay\n*L\n142#1:440\n286#1:442\n286#1:443,3\n287#1:446\n287#1:447,3\n289#1:450\n289#1:451,3\n381#1:454\n381#1:455,4\n*E\n"
    }
.end annotation


# instance fields
.field public A:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

.field public B:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

.field public C:Landroid/view/ViewGroup;

.field public D:Ljava/util/List;

.field public E:Ljava/util/List;

.field public F:Landroid/animation/ValueAnimator;

.field public G:Landroid/animation/ValueAnimator;

.field public s:Ljava/util/List;

.field public final t:Landroid/graphics/Paint;

.field public final u:Landroid/graphics/Paint;

.field public final v:Landroid/graphics/Paint;

.field public w:I

.field public x:Ljava/util/List;

.field public y:Z

.field public z:D


# direct methods
.method public constructor <init>(Lcom/jumio/core/MobileContext;)V
    .locals 5
    .param p1    # Lcom/jumio/core/MobileContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/jumio/core/overlay/JVisionOverlay;-><init>(Lcom/jumio/core/MobileContext;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->s:Ljava/util/List;

    .line 15
    .line 16
    new-instance p1, Landroid/graphics/Paint;

    .line 17
    const/4 v0, 0x1

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 21
    .line 22
    sget-object v1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getStyleMap()Ljava/util/Map;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    sget v3, Lcom/jumio/core/R$attr;->jumio_scanOverlay:I

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    .line 38
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    check-cast v2, Ljava/lang/Integer;

    .line 42
    const/4 v4, -0x1

    .line 43
    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 48
    move-result v2

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v2, v4

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 54
    .line 55
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 59
    .line 60
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->t:Landroid/graphics/Paint;

    .line 61
    .line 62
    new-instance p1, Landroid/graphics/Paint;

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getStyleMap()Ljava/util/Map;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    move-result-object v3

    .line 77
    .line 78
    .line 79
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    check-cast v1, Ljava/lang/Integer;

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 88
    move-result v1

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    move v1, v4

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 97
    .line 98
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->u:Landroid/graphics/Paint;

    .line 99
    .line 100
    new-instance p1, Landroid/graphics/Paint;

    .line 101
    .line 102
    .line 103
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 104
    .line 105
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 109
    .line 110
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getStyleMap()Ljava/util/Map;

    .line 117
    move-result-object v1

    .line 118
    .line 119
    sget v3, Lcom/jumio/core/R$attr;->jumio_id_unaligned_stroke:I

    .line 120
    .line 121
    .line 122
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    move-result-object v3

    .line 124
    .line 125
    .line 126
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    move-result-object v1

    .line 128
    .line 129
    check-cast v1, Ljava/lang/Integer;

    .line 130
    .line 131
    if-eqz v1, :cond_2

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 135
    move-result v4

    .line 136
    .line 137
    .line 138
    :cond_2
    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 142
    .line 143
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->v:Landroid/graphics/Paint;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    .line 147
    move-result p1

    .line 148
    .line 149
    iput p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->w:I

    .line 150
    .line 151
    .line 152
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 153
    move-result-object p1

    .line 154
    .line 155
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->x:Ljava/util/List;

    .line 156
    .line 157
    sget-object p1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;->NONE:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 158
    .line 159
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->A:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 160
    .line 161
    sget-object p1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;->HORIZONTAL:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 162
    .line 163
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->B:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 164
    .line 165
    .line 166
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 167
    move-result-object p1

    .line 168
    .line 169
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->D:Ljava/util/List;

    .line 170
    .line 171
    .line 172
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 173
    move-result-object p1

    .line 174
    .line 175
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->E:Ljava/util/List;

    .line 176
    .line 177
    iput-boolean v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->useCenterCrop:Z

    .line 178
    return-void
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
.end method

.method public static final a(Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->F:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 53
    :cond_0
    iget-object p0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->G:Landroid/animation/ValueAnimator;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    return-void
.end method

.method public static final a(Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;Landroid/animation/ValueAnimator;)V
    .locals 2

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->v:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 51
    iget-object p0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->C:Landroid/view/ViewGroup;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public static final a(Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;Ljava/util/List;Ljava/util/List;Landroid/animation/ValueAnimator;)V
    .locals 7

    const-string v0, "animator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    .line 32
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v2, Landroid/graphics/PointF;

    .line 33
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 34
    new-instance v4, Landroid/graphics/PointF;

    .line 35
    iget v5, v2, Landroid/graphics/PointF;->x:F

    iget v6, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v6, v5

    mul-float/2addr v6, p3

    add-float/2addr v6, v5

    .line 36
    iget v2, v2, Landroid/graphics/PointF;->y:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    mul-float/2addr v1, p3

    add-float/2addr v1, v2

    .line 37
    invoke-direct {v4, v6, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 38
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_0

    .line 39
    :cond_1
    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->D:Ljava/util/List;

    .line 40
    iget-object p0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->C:Landroid/view/ViewGroup;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getExtractionArea()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    .line 2
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getExtractionArea()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    int-to-float v1, v1

    .line 3
    iget-object v2, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->B:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 4
    sget-object v3, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;->HORIZONTAL:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    if-ne v2, v3, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getDocumentFormat()Lcom/jumio/core/data/document/DocumentFormat;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayRatio()D

    move-result-wide v2

    goto :goto_0

    :cond_0
    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v2, v2

    .line 6
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getDocumentFormat()Lcom/jumio/core/data/document/DocumentFormat;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayRatio()D

    move-result-wide v4

    div-double/2addr v2, v4

    .line 7
    :goto_0
    iget-object v4, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->B:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    sget-object v5, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;->VERTICAL:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    if-ne v4, v5, :cond_1

    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getExtractionArea()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getDocumentFormat()Lcom/jumio/core/data/document/DocumentFormat;

    move-result-object v5

    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getExtractionArea()Landroid/graphics/Rect;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayLeftInPx(I)I

    move-result v5

    sub-int/2addr v4, v5

    .line 9
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getDocumentFormat()Lcom/jumio/core/data/document/DocumentFormat;

    move-result-object v5

    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getExtractionArea()Landroid/graphics/Rect;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayRightInPx(I)I

    move-result v5

    sub-int/2addr v4, v5

    int-to-float v4, v4

    float-to-double v5, v4

    mul-double/2addr v5, v2

    double-to-float v2, v5

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getExtractionArea()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getDocumentFormat()Lcom/jumio/core/data/document/DocumentFormat;

    move-result-object v5

    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getExtractionArea()Landroid/graphics/Rect;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayLeftInPx(I)I

    move-result v5

    sub-int/2addr v4, v5

    .line 11
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getDocumentFormat()Lcom/jumio/core/data/document/DocumentFormat;

    move-result-object v5

    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getExtractionArea()Landroid/graphics/Rect;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayRightInPx(I)I

    move-result v5

    sub-int/2addr v4, v5

    int-to-float v4, v4

    float-to-double v5, v4

    div-double/2addr v5, v2

    double-to-float v2, v5

    move v8, v4

    move v4, v2

    move v2, v8

    .line 12
    :goto_1
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getDocumentFormat()Lcom/jumio/core/data/document/DocumentFormat;

    move-result-object v3

    sget-object v5, Lcom/jumio/core/data/document/DocumentFormat;->ID3:Lcom/jumio/core/data/document/DocumentFormat;

    if-ne v3, v5, :cond_2

    const v3, 0x3d75c28f    # 0.06f

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    const/4 v5, 0x1

    int-to-float v5, v5

    const/4 v6, 0x2

    int-to-float v6, v6

    mul-float/2addr v3, v6

    sub-float/2addr v5, v3

    mul-float/2addr v2, v5

    mul-float/2addr v4, v5

    .line 13
    new-instance v3, Landroid/graphics/PointF;

    div-float/2addr v2, v6

    sub-float v5, v0, v2

    div-float/2addr v4, v6

    sub-float v6, v1, v4

    invoke-direct {v3, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 14
    new-instance v7, Landroid/graphics/PointF;

    add-float/2addr v0, v2

    invoke-direct {v7, v0, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 15
    new-instance v2, Landroid/graphics/PointF;

    add-float/2addr v1, v4

    invoke-direct {v2, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 16
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v5, v1}, Landroid/graphics/PointF;-><init>(FF)V

    filled-new-array {v3, v7, v2, v0}, [Landroid/graphics/PointF;

    move-result-object v0

    .line 17
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->x:Ljava/util/List;

    return-void
.end method

.method public final a(I)V
    .locals 2

    .line 41
    iget v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->w:I

    if-ne v0, p1, :cond_0

    return-void

    .line 42
    :cond_0
    iput p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->w:I

    .line 43
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->G:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 44
    :cond_1
    new-instance v0, Landroid/animation/ArgbEvaluator;

    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->v:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    move-result-object p1

    const-wide/16 v0, 0x12c

    .line 45
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 46
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 47
    new-instance v0, Lp9/a;

    invoke-direct {v0, p0}, Lp9/a;-><init>(Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 48
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 49
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->G:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 4

    .line 18
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->F:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->x:Ljava/util/List;

    .line 20
    :cond_1
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->E:Ljava/util/List;

    .line 21
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 22
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->D:Ljava/util/List;

    return-void

    :cond_2
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    const-wide/16 v2, 0x12c

    .line 24
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 25
    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 26
    new-instance v2, Lp9/c;

    invoke-direct {v2, p0, v0, p1}, Lp9/c;-><init>(Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 27
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 28
    iput-object v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->F:Landroid/animation/ValueAnimator;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public addViews(Landroid/view/ViewGroup;)V
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "rootView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->C:Landroid/view/ViewGroup;

    .line 8
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 13
    return-void
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

.method public calculate(Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;)V
    .locals 3
    .param p1    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "cameraSettings"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "extractionArea"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1, p2}, Lcom/jumio/core/overlay/JVisionOverlay;->calculate(Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getMobileContext()Lcom/jumio/core/MobileContext;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 28
    .line 29
    iget-object p2, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->t:Landroid/graphics/Paint;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getMobileContext()Lcom/jumio/core/MobileContext;

    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x6

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v0}, Lcom/jumio/commons/utils/ScreenUtilKt;->dpToPx(ILandroid/content/Context;)I

    .line 38
    move-result v0

    .line 39
    int-to-float v0, v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 43
    .line 44
    iget-object p2, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->u:Landroid/graphics/Paint;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getMobileContext()Lcom/jumio/core/MobileContext;

    .line 48
    move-result-object v0

    .line 49
    const/4 v1, 0x2

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v0}, Lcom/jumio/commons/utils/ScreenUtilKt;->dpToPx(ILandroid/content/Context;)I

    .line 53
    move-result v0

    .line 54
    int-to-float v0, v0

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 58
    .line 59
    iget-object p2, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->v:Landroid/graphics/Paint;

    .line 60
    .line 61
    const/high16 v0, 0x40c00000    # 6.0f

    .line 62
    mul-float/2addr v0, p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 66
    .line 67
    iget-object p2, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->t:Landroid/graphics/Paint;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 71
    move-result v1

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 75
    .line 76
    iget-object p2, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->u:Landroid/graphics/Paint;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 80
    move-result v1

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 84
    .line 85
    iget-object p2, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->v:Landroid/graphics/Paint;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 89
    move-result v1

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getMobileContext()Lcom/jumio/core/MobileContext;

    .line 96
    move-result-object p2

    .line 97
    .line 98
    sget v1, Lcom/jumio/core/R$color;->jumio_black_alpha40:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v1}, Landroid/content/Context;->getColor(I)I

    .line 102
    move-result p2

    .line 103
    .line 104
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->v:Landroid/graphics/Paint;

    .line 105
    .line 106
    const/high16 v2, 0x40000000    # 2.0f

    .line 107
    mul-float/2addr p1, v2

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, p1, v0, v0, p2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 111
    .line 112
    iget-object p1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->u:Landroid/graphics/Paint;

    .line 113
    .line 114
    new-instance p2, Landroid/graphics/DashPathEffect;

    .line 115
    const/4 v0, 0x4

    .line 116
    .line 117
    new-array v0, v0, [F

    .line 118
    .line 119
    .line 120
    fill-array-data v0, :array_0

    .line 121
    const/4 v1, 0x0

    .line 122
    .line 123
    .line 124
    invoke-direct {p2, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 128
    const/4 p1, 0x0

    .line 129
    .line 130
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayBottomPixel:I

    .line 131
    return-void

    .line 132
    nop

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
    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x40a00000    # 5.0f
        0x41200000    # 10.0f
        0x40a00000    # 5.0f
    .end array-data
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
.end method

.method public destroy()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->C:Landroid/view/ViewGroup;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lp9/b;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0}, Lp9/b;-><init>(Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->C:Landroid/view/ViewGroup;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->F:Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->G:Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->D:Ljava/util/List;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->E:Ljava/util/List;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->x:Ljava/util/List;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->s:Ljava/util/List;

    .line 44
    .line 45
    .line 46
    invoke-super {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->destroy()V

    .line 47
    return-void
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

.method public doDraw(Landroid/graphics/Canvas;)V
    .locals 19
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "canvas"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super/range {p0 .. p1}, Lcom/jumio/core/overlay/JVisionOverlay;->doDraw(Landroid/graphics/Canvas;)V

    .line 13
    .line 14
    iget-object v2, v0, Lcom/jumio/core/overlay/JVisionOverlay;->visibility:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 18
    move-result v2

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    iget-boolean v2, v0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->y:Z

    .line 24
    .line 25
    if-eqz v2, :cond_8

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/jumio/core/overlay/JVisionOverlay;->getMirrorOverlay()Z

    .line 29
    move-result v2

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    iget-wide v2, v0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->z:D

    .line 34
    neg-double v2, v2

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    iget-wide v2, v0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->z:D

    .line 38
    .line 39
    :goto_0
    iget-object v4, v0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->x:Ljava/util/List;

    .line 40
    .line 41
    const-wide/16 v5, 0x0

    .line 42
    .line 43
    cmpg-double v5, v2, v5

    .line 44
    .line 45
    if-nez v5, :cond_2

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    .line 50
    .line 51
    const/16 v6, 0xa

    .line 52
    .line 53
    .line 54
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 55
    move-result v7

    .line 56
    .line 57
    .line 58
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    move-result-object v7

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    move-result v8

    .line 67
    .line 68
    if-eqz v8, :cond_3

    .line 69
    .line 70
    .line 71
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    move-result-object v8

    .line 73
    .line 74
    check-cast v8, Landroid/graphics/PointF;

    .line 75
    .line 76
    iget v8, v8, Landroid/graphics/PointF;->x:F

    .line 77
    .line 78
    .line 79
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 80
    move-result-object v8

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    goto :goto_1

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->averageOfFloat(Ljava/lang/Iterable;)D

    .line 88
    move-result-wide v7

    .line 89
    double-to-float v5, v7

    .line 90
    .line 91
    new-instance v7, Ljava/util/ArrayList;

    .line 92
    .line 93
    .line 94
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 95
    move-result v8

    .line 96
    .line 97
    .line 98
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    move-result-object v8

    .line 103
    .line 104
    .line 105
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    move-result v9

    .line 107
    .line 108
    if-eqz v9, :cond_4

    .line 109
    .line 110
    .line 111
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    move-result-object v9

    .line 113
    .line 114
    check-cast v9, Landroid/graphics/PointF;

    .line 115
    .line 116
    iget v9, v9, Landroid/graphics/PointF;->y:F

    .line 117
    .line 118
    .line 119
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 120
    move-result-object v9

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    goto :goto_2

    .line 125
    .line 126
    .line 127
    :cond_4
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->averageOfFloat(Ljava/lang/Iterable;)D

    .line 128
    move-result-wide v7

    .line 129
    double-to-float v7, v7

    .line 130
    .line 131
    .line 132
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 133
    move-result-wide v2

    .line 134
    .line 135
    new-instance v8, Ljava/util/ArrayList;

    .line 136
    .line 137
    .line 138
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 139
    move-result v6

    .line 140
    .line 141
    .line 142
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    move-result-object v4

    .line 147
    .line 148
    .line 149
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    move-result v6

    .line 151
    .line 152
    if-eqz v6, :cond_5

    .line 153
    .line 154
    .line 155
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    move-result-object v6

    .line 157
    .line 158
    check-cast v6, Landroid/graphics/PointF;

    .line 159
    .line 160
    iget v9, v6, Landroid/graphics/PointF;->x:F

    .line 161
    sub-float/2addr v9, v5

    .line 162
    .line 163
    iget v6, v6, Landroid/graphics/PointF;->y:F

    .line 164
    sub-float/2addr v6, v7

    .line 165
    .line 166
    new-instance v10, Landroid/graphics/PointF;

    .line 167
    float-to-double v11, v9

    .line 168
    .line 169
    .line 170
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 171
    move-result-wide v13

    .line 172
    mul-double/2addr v13, v11

    .line 173
    move-wide v15, v2

    .line 174
    float-to-double v2, v6

    .line 175
    .line 176
    .line 177
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    .line 178
    move-result-wide v17

    .line 179
    .line 180
    mul-double v17, v17, v2

    .line 181
    .line 182
    sub-double v13, v13, v17

    .line 183
    double-to-float v6, v13

    .line 184
    add-float/2addr v6, v5

    .line 185
    .line 186
    .line 187
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    .line 188
    move-result-wide v13

    .line 189
    mul-double/2addr v13, v11

    .line 190
    .line 191
    .line 192
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    .line 193
    move-result-wide v11

    .line 194
    mul-double/2addr v11, v2

    .line 195
    add-double/2addr v11, v13

    .line 196
    double-to-float v2, v11

    .line 197
    add-float/2addr v2, v7

    .line 198
    .line 199
    .line 200
    invoke-direct {v10, v6, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    move-wide v2, v15

    .line 205
    goto :goto_3

    .line 206
    :cond_5
    move-object v4, v8

    .line 207
    .line 208
    :goto_4
    iget-object v2, v0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->E:Ljava/util/List;

    .line 209
    .line 210
    .line 211
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    move-result v2

    .line 213
    .line 214
    if-nez v2, :cond_6

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v4}, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->a(Ljava/util/List;)V

    .line 218
    .line 219
    :cond_6
    iget-object v2, v0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->D:Ljava/util/List;

    .line 220
    .line 221
    .line 222
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 223
    move-result v3

    .line 224
    .line 225
    if-eqz v3, :cond_7

    .line 226
    goto :goto_5

    .line 227
    :cond_7
    move-object v4, v2

    .line 228
    .line 229
    .line 230
    :goto_5
    invoke-virtual {v0}, Lcom/jumio/core/overlay/JVisionOverlay;->getMobileContext()Lcom/jumio/core/MobileContext;

    .line 231
    move-result-object v2

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 235
    move-result-object v2

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 239
    move-result-object v2

    .line 240
    .line 241
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 242
    .line 243
    const/high16 v3, 0x42100000    # 36.0f

    .line 244
    mul-float/2addr v3, v2

    .line 245
    .line 246
    const/high16 v5, 0x41a00000    # 20.0f

    .line 247
    mul-float/2addr v2, v5

    .line 248
    .line 249
    .line 250
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 251
    move-result v5

    .line 252
    const/4 v6, 0x0

    .line 253
    .line 254
    :goto_6
    if-ge v6, v5, :cond_8

    .line 255
    .line 256
    .line 257
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 258
    move-result-object v7

    .line 259
    .line 260
    check-cast v7, Landroid/graphics/PointF;

    .line 261
    .line 262
    add-int/lit8 v8, v6, 0x1

    .line 263
    .line 264
    rem-int/lit8 v9, v8, 0x4

    .line 265
    .line 266
    .line 267
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 268
    move-result-object v9

    .line 269
    .line 270
    check-cast v9, Landroid/graphics/PointF;

    .line 271
    .line 272
    add-int/lit8 v6, v6, 0x3

    .line 273
    .line 274
    rem-int/lit8 v6, v6, 0x4

    .line 275
    .line 276
    .line 277
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    move-result-object v6

    .line 279
    .line 280
    check-cast v6, Landroid/graphics/PointF;

    .line 281
    .line 282
    new-instance v10, Landroid/graphics/PointF;

    .line 283
    .line 284
    iget v11, v9, Landroid/graphics/PointF;->x:F

    .line 285
    .line 286
    iget v12, v7, Landroid/graphics/PointF;->x:F

    .line 287
    sub-float/2addr v11, v12

    .line 288
    .line 289
    iget v9, v9, Landroid/graphics/PointF;->y:F

    .line 290
    .line 291
    iget v12, v7, Landroid/graphics/PointF;->y:F

    .line 292
    sub-float/2addr v9, v12

    .line 293
    .line 294
    .line 295
    invoke-direct {v10, v11, v9}, Landroid/graphics/PointF;-><init>(FF)V

    .line 296
    .line 297
    iget v9, v10, Landroid/graphics/PointF;->x:F

    .line 298
    float-to-double v11, v9

    .line 299
    const/4 v9, 0x2

    .line 300
    int-to-double v13, v9

    .line 301
    .line 302
    .line 303
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 304
    move-result-wide v11

    .line 305
    double-to-float v9, v11

    .line 306
    .line 307
    iget v11, v10, Landroid/graphics/PointF;->y:F

    .line 308
    float-to-double v11, v11

    .line 309
    .line 310
    .line 311
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 312
    move-result-wide v11

    .line 313
    double-to-float v11, v11

    .line 314
    add-float/2addr v9, v11

    .line 315
    float-to-double v11, v9

    .line 316
    .line 317
    .line 318
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    .line 319
    move-result-wide v11

    .line 320
    double-to-float v9, v11

    .line 321
    .line 322
    iget v11, v10, Landroid/graphics/PointF;->x:F

    .line 323
    div-float/2addr v11, v9

    .line 324
    .line 325
    iput v11, v10, Landroid/graphics/PointF;->x:F

    .line 326
    .line 327
    iget v11, v10, Landroid/graphics/PointF;->y:F

    .line 328
    div-float/2addr v11, v9

    .line 329
    .line 330
    iput v11, v10, Landroid/graphics/PointF;->y:F

    .line 331
    .line 332
    new-instance v9, Landroid/graphics/PointF;

    .line 333
    .line 334
    iget v11, v6, Landroid/graphics/PointF;->x:F

    .line 335
    .line 336
    iget v12, v7, Landroid/graphics/PointF;->x:F

    .line 337
    sub-float/2addr v11, v12

    .line 338
    .line 339
    iget v6, v6, Landroid/graphics/PointF;->y:F

    .line 340
    .line 341
    iget v12, v7, Landroid/graphics/PointF;->y:F

    .line 342
    sub-float/2addr v6, v12

    .line 343
    .line 344
    .line 345
    invoke-direct {v9, v11, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 346
    .line 347
    iget v6, v9, Landroid/graphics/PointF;->x:F

    .line 348
    float-to-double v11, v6

    .line 349
    .line 350
    .line 351
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 352
    move-result-wide v11

    .line 353
    double-to-float v6, v11

    .line 354
    .line 355
    iget v11, v9, Landroid/graphics/PointF;->y:F

    .line 356
    float-to-double v11, v11

    .line 357
    .line 358
    .line 359
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 360
    move-result-wide v11

    .line 361
    double-to-float v11, v11

    .line 362
    add-float/2addr v6, v11

    .line 363
    float-to-double v11, v6

    .line 364
    .line 365
    .line 366
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    .line 367
    move-result-wide v11

    .line 368
    double-to-float v6, v11

    .line 369
    .line 370
    iget v11, v9, Landroid/graphics/PointF;->x:F

    .line 371
    div-float/2addr v11, v6

    .line 372
    .line 373
    iput v11, v9, Landroid/graphics/PointF;->x:F

    .line 374
    .line 375
    iget v11, v9, Landroid/graphics/PointF;->y:F

    .line 376
    div-float/2addr v11, v6

    .line 377
    .line 378
    iput v11, v9, Landroid/graphics/PointF;->y:F

    .line 379
    .line 380
    new-instance v6, Landroid/graphics/PointF;

    .line 381
    .line 382
    iget v11, v7, Landroid/graphics/PointF;->x:F

    .line 383
    .line 384
    iget v12, v10, Landroid/graphics/PointF;->x:F

    .line 385
    mul-float/2addr v12, v3

    .line 386
    add-float/2addr v12, v11

    .line 387
    .line 388
    iget v11, v7, Landroid/graphics/PointF;->y:F

    .line 389
    .line 390
    iget v13, v10, Landroid/graphics/PointF;->y:F

    .line 391
    mul-float/2addr v13, v3

    .line 392
    add-float/2addr v13, v11

    .line 393
    .line 394
    .line 395
    invoke-direct {v6, v12, v13}, Landroid/graphics/PointF;-><init>(FF)V

    .line 396
    .line 397
    new-instance v11, Landroid/graphics/PointF;

    .line 398
    .line 399
    iget v12, v7, Landroid/graphics/PointF;->x:F

    .line 400
    .line 401
    iget v13, v10, Landroid/graphics/PointF;->x:F

    .line 402
    mul-float/2addr v13, v2

    .line 403
    add-float/2addr v13, v12

    .line 404
    .line 405
    iget v12, v7, Landroid/graphics/PointF;->y:F

    .line 406
    .line 407
    iget v10, v10, Landroid/graphics/PointF;->y:F

    .line 408
    mul-float/2addr v10, v2

    .line 409
    add-float/2addr v10, v12

    .line 410
    .line 411
    .line 412
    invoke-direct {v11, v13, v10}, Landroid/graphics/PointF;-><init>(FF)V

    .line 413
    .line 414
    new-instance v10, Landroid/graphics/PointF;

    .line 415
    .line 416
    iget v12, v7, Landroid/graphics/PointF;->x:F

    .line 417
    .line 418
    iget v13, v9, Landroid/graphics/PointF;->x:F

    .line 419
    mul-float/2addr v13, v2

    .line 420
    add-float/2addr v13, v12

    .line 421
    .line 422
    iget v12, v7, Landroid/graphics/PointF;->y:F

    .line 423
    .line 424
    iget v14, v9, Landroid/graphics/PointF;->y:F

    .line 425
    mul-float/2addr v14, v2

    .line 426
    add-float/2addr v14, v12

    .line 427
    .line 428
    .line 429
    invoke-direct {v10, v13, v14}, Landroid/graphics/PointF;-><init>(FF)V

    .line 430
    .line 431
    new-instance v12, Landroid/graphics/PointF;

    .line 432
    .line 433
    iget v13, v7, Landroid/graphics/PointF;->x:F

    .line 434
    .line 435
    iget v14, v9, Landroid/graphics/PointF;->x:F

    .line 436
    mul-float/2addr v14, v3

    .line 437
    add-float/2addr v14, v13

    .line 438
    .line 439
    iget v13, v7, Landroid/graphics/PointF;->y:F

    .line 440
    .line 441
    iget v9, v9, Landroid/graphics/PointF;->y:F

    .line 442
    mul-float/2addr v9, v3

    .line 443
    add-float/2addr v9, v13

    .line 444
    .line 445
    .line 446
    invoke-direct {v12, v14, v9}, Landroid/graphics/PointF;-><init>(FF)V

    .line 447
    .line 448
    new-instance v9, Landroid/graphics/Path;

    .line 449
    .line 450
    .line 451
    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 452
    .line 453
    iget v13, v6, Landroid/graphics/PointF;->x:F

    .line 454
    .line 455
    iget v6, v6, Landroid/graphics/PointF;->y:F

    .line 456
    .line 457
    .line 458
    invoke-virtual {v9, v13, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 459
    .line 460
    iget v6, v11, Landroid/graphics/PointF;->x:F

    .line 461
    .line 462
    iget v11, v11, Landroid/graphics/PointF;->y:F

    .line 463
    .line 464
    .line 465
    invoke-virtual {v9, v6, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 466
    .line 467
    iget v6, v7, Landroid/graphics/PointF;->x:F

    .line 468
    .line 469
    iget v7, v7, Landroid/graphics/PointF;->y:F

    .line 470
    .line 471
    iget v11, v10, Landroid/graphics/PointF;->x:F

    .line 472
    .line 473
    iget v10, v10, Landroid/graphics/PointF;->y:F

    .line 474
    .line 475
    .line 476
    invoke-virtual {v9, v6, v7, v11, v10}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 477
    .line 478
    iget v6, v12, Landroid/graphics/PointF;->x:F

    .line 479
    .line 480
    iget v7, v12, Landroid/graphics/PointF;->y:F

    .line 481
    .line 482
    .line 483
    invoke-virtual {v9, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 484
    .line 485
    iget-object v6, v0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->v:Landroid/graphics/Paint;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v9, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 489
    move v6, v8

    .line 490
    .line 491
    goto/16 :goto_6

    .line 492
    .line 493
    :cond_8
    iget-object v1, v0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->s:Ljava/util/List;

    .line 494
    .line 495
    .line 496
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 497
    move-result v1

    .line 498
    .line 499
    if-eqz v1, :cond_9

    .line 500
    .line 501
    const-string v1, "No corners detected"

    .line 502
    .line 503
    .line 504
    invoke-static {v1}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;)V

    .line 505
    return-void

    .line 506
    .line 507
    :cond_9
    const-string v1, "Corners detected"

    .line 508
    .line 509
    .line 510
    invoke-static {v1}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;)V

    .line 511
    .line 512
    sget-object v1, Lcom/jumio/commons/log/LogLevel;->OFF:Lcom/jumio/commons/log/LogLevel;

    .line 513
    return-void
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
.end method

.method public prepareBackground()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getBackgroundPath()Landroid/graphics/Path;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 7
    int-to-float v3, v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getOverlayBounds()Landroid/graphics/Rect;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 14
    int-to-float v4, v1

    .line 15
    .line 16
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 22
    return-void
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
.end method

.method public update(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V
    .locals 12
    .param p1    # Lcom/jumio/core/extraction/ExtractionUpdateInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/extraction/ExtractionUpdateInterface<",
            "*>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "extractionUpdate"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    instance-of v1, v0, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast v0, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v2

    .line 19
    .line 20
    :goto_0
    if-eqz v0, :cond_16

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getCorners()Lcom/jumio/core/data/document/CornerPoints;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/jumio/core/data/document/CornerPoints;->asList()Ljava/util/List;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iput-object v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->s:Ljava/util/List;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getShowGuideOverlay()Z

    .line 34
    move-result v1

    .line 35
    .line 36
    iput-boolean v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->y:Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getShowGuideOverlay()Z

    .line 40
    move-result v1

    .line 41
    .line 42
    const-wide/16 v2, 0x0

    .line 43
    .line 44
    if-eqz v1, :cond_14

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getCorners()Lcom/jumio/core/data/document/CornerPoints;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/jumio/core/data/document/CornerPoints;->isValid()Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-eqz v1, :cond_14

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getCorners()Lcom/jumio/core/data/document/CornerPoints;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/jumio/core/data/document/CornerPoints;->getAspectRatio()F

    .line 62
    move-result v1

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 66
    move-result v4

    .line 67
    .line 68
    if-nez v4, :cond_4

    .line 69
    .line 70
    .line 71
    invoke-static {v1}, Ljava/lang/Float;->isInfinite(F)Z

    .line 72
    move-result v4

    .line 73
    .line 74
    if-nez v4, :cond_4

    .line 75
    .line 76
    .line 77
    const v4, 0x3ecccccd    # 0.4f

    .line 78
    .line 79
    cmpg-float v4, v1, v4

    .line 80
    .line 81
    if-gez v4, :cond_1

    .line 82
    goto :goto_1

    .line 83
    .line 84
    :cond_1
    const/high16 v4, 0x3f800000    # 1.0f

    .line 85
    .line 86
    cmpl-float v5, v1, v4

    .line 87
    .line 88
    if-ltz v5, :cond_2

    .line 89
    .line 90
    sget-object v1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;->LANDSCAPE:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 91
    goto :goto_2

    .line 92
    .line 93
    :cond_2
    cmpg-float v1, v1, v4

    .line 94
    .line 95
    if-gez v1, :cond_3

    .line 96
    .line 97
    sget-object v1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;->PORTRAIT:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 98
    goto :goto_2

    .line 99
    .line 100
    :cond_3
    sget-object v1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;->NONE:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 101
    goto :goto_2

    .line 102
    .line 103
    :cond_4
    :goto_1
    sget-object v1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;->NONE:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 104
    .line 105
    :goto_2
    iget-object v4, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->A:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 106
    .line 107
    if-eq v1, v4, :cond_6

    .line 108
    .line 109
    sget-object v4, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;->NONE:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 110
    .line 111
    if-eq v1, v4, :cond_6

    .line 112
    .line 113
    iput-object v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->A:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 114
    .line 115
    sget-object v4, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;->LANDSCAPE:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 116
    .line 117
    if-ne v1, v4, :cond_5

    .line 118
    .line 119
    sget-object v1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;->HORIZONTAL:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 120
    goto :goto_3

    .line 121
    .line 122
    :cond_5
    sget-object v1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;->VERTICAL:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 123
    .line 124
    :goto_3
    iput-object v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->B:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->a()V

    .line 128
    .line 129
    .line 130
    :cond_6
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getRotationAngle()D

    .line 131
    move-result-wide v4

    .line 132
    .line 133
    .line 134
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 135
    move-result-wide v4

    .line 136
    .line 137
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->A:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 138
    .line 139
    sget-object v6, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;->LANDSCAPE:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 140
    .line 141
    if-ne v1, v6, :cond_7

    .line 142
    .line 143
    iget-object v7, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->B:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 144
    .line 145
    sget-object v8, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;->HORIZONTAL:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 146
    .line 147
    if-eq v7, v8, :cond_8

    .line 148
    .line 149
    :cond_7
    sget-object v7, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;->PORTRAIT:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 150
    .line 151
    if-ne v1, v7, :cond_9

    .line 152
    .line 153
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->B:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 154
    .line 155
    sget-object v7, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;->VERTICAL:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 156
    .line 157
    if-ne v1, v7, :cond_9

    .line 158
    :cond_8
    const/4 v1, 0x1

    .line 159
    goto :goto_4

    .line 160
    :cond_9
    const/4 v1, 0x0

    .line 161
    .line 162
    :goto_4
    iget-object v7, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->B:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    const-wide v8, 0x400921fb54442d18L    # Math.PI

    .line 168
    .line 169
    .line 170
    invoke-static {v8, v9}, Ljava/lang/Math;->toDegrees(D)D

    .line 171
    move-result-wide v8

    .line 172
    const/4 v10, 0x2

    .line 173
    int-to-double v10, v10

    .line 174
    div-double/2addr v8, v10

    .line 175
    .line 176
    if-eqz v1, :cond_a

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getRotationTolerance()D

    .line 180
    move-result-wide v10

    .line 181
    .line 182
    cmpg-double v10, v4, v10

    .line 183
    .line 184
    if-gtz v10, :cond_a

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getRotationAngle()D

    .line 188
    move-result-wide v2

    .line 189
    .line 190
    goto/16 :goto_a

    .line 191
    .line 192
    :cond_a
    if-eqz v1, :cond_b

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getRotationThreshold()D

    .line 196
    move-result-wide v10

    .line 197
    .line 198
    cmpg-double v10, v4, v10

    .line 199
    .line 200
    if-gtz v10, :cond_b

    .line 201
    .line 202
    goto/16 :goto_a

    .line 203
    .line 204
    :cond_b
    if-eqz v1, :cond_e

    .line 205
    .line 206
    cmpg-double v10, v4, v8

    .line 207
    .line 208
    if-gtz v10, :cond_e

    .line 209
    .line 210
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->A:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 211
    .line 212
    if-ne v1, v6, :cond_c

    .line 213
    .line 214
    sget-object v1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;->VERTICAL:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 215
    :goto_5
    move-object v7, v1

    .line 216
    goto :goto_6

    .line 217
    .line 218
    :cond_c
    sget-object v1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;->HORIZONTAL:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 219
    goto :goto_5

    .line 220
    .line 221
    .line 222
    :goto_6
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getRotationTolerance()D

    .line 223
    move-result-wide v10

    .line 224
    .line 225
    sub-double v10, v8, v10

    .line 226
    .line 227
    cmpg-double v1, v4, v10

    .line 228
    .line 229
    if-gtz v1, :cond_d

    .line 230
    goto :goto_a

    .line 231
    :cond_d
    sub-double/2addr v8, v4

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getRotationAngle()D

    .line 235
    move-result-wide v1

    .line 236
    .line 237
    .line 238
    invoke-static {v1, v2}, Ljava/lang/Math;->signum(D)D

    .line 239
    move-result-wide v1

    .line 240
    .line 241
    mul-double v2, v1, v8

    .line 242
    goto :goto_a

    .line 243
    .line 244
    :cond_e
    if-nez v1, :cond_f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getRotationTolerance()D

    .line 248
    move-result-wide v10

    .line 249
    .line 250
    sub-double v10, v8, v10

    .line 251
    .line 252
    cmpl-double v10, v4, v10

    .line 253
    .line 254
    if-ltz v10, :cond_f

    .line 255
    sub-double/2addr v8, v4

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getRotationAngle()D

    .line 259
    move-result-wide v1

    .line 260
    .line 261
    .line 262
    invoke-static {v1, v2}, Ljava/lang/Math;->signum(D)D

    .line 263
    move-result-wide v1

    .line 264
    mul-double/2addr v1, v8

    .line 265
    :goto_7
    neg-double v2, v1

    .line 266
    goto :goto_a

    .line 267
    .line 268
    :cond_f
    if-nez v1, :cond_10

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getRotationThreshold()D

    .line 272
    move-result-wide v10

    .line 273
    sub-double/2addr v8, v10

    .line 274
    .line 275
    cmpl-double v8, v4, v8

    .line 276
    .line 277
    if-ltz v8, :cond_10

    .line 278
    goto :goto_a

    .line 279
    .line 280
    :cond_10
    if-nez v1, :cond_13

    .line 281
    .line 282
    cmpl-double v1, v4, v2

    .line 283
    .line 284
    if-ltz v1, :cond_13

    .line 285
    .line 286
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->A:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;

    .line 287
    .line 288
    if-ne v1, v6, :cond_11

    .line 289
    .line 290
    sget-object v1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;->HORIZONTAL:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 291
    :goto_8
    move-object v7, v1

    .line 292
    goto :goto_9

    .line 293
    .line 294
    :cond_11
    sget-object v1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;->VERTICAL:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 295
    goto :goto_8

    .line 296
    .line 297
    .line 298
    :goto_9
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getRotationTolerance()D

    .line 299
    move-result-wide v8

    .line 300
    .line 301
    cmpl-double v1, v4, v8

    .line 302
    .line 303
    if-ltz v1, :cond_12

    .line 304
    goto :goto_a

    .line 305
    .line 306
    .line 307
    :cond_12
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getRotationAngle()D

    .line 308
    move-result-wide v1

    .line 309
    goto :goto_7

    .line 310
    .line 311
    :cond_13
    :goto_a
    new-instance v1, Lkotlin/Pair;

    .line 312
    .line 313
    .line 314
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 315
    move-result-object v2

    .line 316
    .line 317
    .line 318
    invoke-direct {v1, v2, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 322
    move-result-object v2

    .line 323
    .line 324
    check-cast v2, Ljava/lang/Number;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 328
    move-result-wide v2

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 332
    move-result-object v1

    .line 333
    .line 334
    check-cast v1, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 335
    .line 336
    iput-wide v2, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->z:D

    .line 337
    .line 338
    iget-object v2, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->B:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 339
    .line 340
    if-eq v1, v2, :cond_15

    .line 341
    .line 342
    iput-object v1, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->B:Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0}, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->a()V

    .line 346
    goto :goto_b

    .line 347
    .line 348
    :cond_14
    iput-wide v2, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->z:D

    .line 349
    .line 350
    :cond_15
    :goto_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-string v2, "currentRotationAngle - "

    .line 353
    .line 354
    .line 355
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    iget-wide v2, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->z:D

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    const-string v2, " baseImageData - "

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    move-result-object v0

    .line 373
    .line 374
    const-string v1, "DocFinderOverlay"

    .line 375
    .line 376
    .line 377
    invoke-static {v1, v0}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    goto :goto_d

    .line 379
    .line 380
    .line 381
    :cond_16
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    .line 382
    move-result-object v0

    .line 383
    .line 384
    instance-of v1, v0, Ljava/util/List;

    .line 385
    .line 386
    if-eqz v1, :cond_17

    .line 387
    move-object v2, v0

    .line 388
    .line 389
    check-cast v2, Ljava/util/List;

    .line 390
    .line 391
    :cond_17
    if-eqz v2, :cond_18

    .line 392
    .line 393
    .line 394
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    .line 395
    move-result-object v0

    .line 396
    .line 397
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<android.graphics.PointF>"

    .line 398
    .line 399
    .line 400
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 401
    .line 402
    check-cast v0, Ljava/util/List;

    .line 403
    goto :goto_c

    .line 404
    .line 405
    .line 406
    :cond_18
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 407
    move-result-object v0

    .line 408
    .line 409
    :goto_c
    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->s:Ljava/util/List;

    .line 410
    .line 411
    .line 412
    :goto_d
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getState()Ljava/lang/Integer;

    .line 413
    move-result-object p1

    .line 414
    .line 415
    sget-object v0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->INSTANCE:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->getValidCorners()I

    .line 419
    move-result v1

    .line 420
    const/4 v2, -0x1

    .line 421
    .line 422
    if-nez p1, :cond_19

    .line 423
    goto :goto_e

    .line 424
    .line 425
    .line 426
    :cond_19
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 427
    move-result v3

    .line 428
    .line 429
    if-ne v3, v1, :cond_1b

    .line 430
    .line 431
    .line 432
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getStyleMap()Ljava/util/Map;

    .line 433
    move-result-object p1

    .line 434
    .line 435
    sget v0, Lcom/jumio/core/R$attr;->jumio_id_aligned_stroke:I

    .line 436
    .line 437
    .line 438
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    move-result-object v0

    .line 440
    .line 441
    .line 442
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    move-result-object p1

    .line 444
    .line 445
    check-cast p1, Ljava/lang/Integer;

    .line 446
    .line 447
    if-eqz p1, :cond_1a

    .line 448
    .line 449
    .line 450
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 451
    move-result v2

    .line 452
    .line 453
    .line 454
    :cond_1a
    invoke-virtual {p0, v2}, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->a(I)V

    .line 455
    return-void

    .line 456
    .line 457
    .line 458
    :cond_1b
    :goto_e
    invoke-virtual {v0}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->getInvalidCorners()I

    .line 459
    move-result v0

    .line 460
    .line 461
    if-nez p1, :cond_1c

    .line 462
    goto :goto_f

    .line 463
    .line 464
    .line 465
    :cond_1c
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 466
    move-result p1

    .line 467
    .line 468
    if-ne p1, v0, :cond_1e

    .line 469
    .line 470
    .line 471
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getStyleMap()Ljava/util/Map;

    .line 472
    move-result-object p1

    .line 473
    .line 474
    sget v0, Lcom/jumio/core/R$attr;->jumio_id_unaligned_stroke:I

    .line 475
    .line 476
    .line 477
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 478
    move-result-object v0

    .line 479
    .line 480
    .line 481
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    move-result-object p1

    .line 483
    .line 484
    check-cast p1, Ljava/lang/Integer;

    .line 485
    .line 486
    if-eqz p1, :cond_1d

    .line 487
    .line 488
    .line 489
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 490
    move-result v2

    .line 491
    .line 492
    .line 493
    :cond_1d
    invoke-virtual {p0, v2}, Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;->a(I)V

    .line 494
    :cond_1e
    :goto_f
    return-void
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
.end method
