.class public final Lcom/facebook/react/uimanager/MatrixMathHelper;
.super Ljava/lang/Object;
.source "MatrixMathHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008*\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005H\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000cH\u0007J\u0010\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u000cH\u0007J\u0010\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u000cH\u0007J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00020\u000cH\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000cH\u0007J\u0018\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0007J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0007J(\u0010 \u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0007J\u0018\u0010#\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0007J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0007J\u0008\u0010&\u001a\u00020\u000cH\u0007J\u0010\u0010\'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0007J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000cH\u0007J\u0018\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010+\u001a\u00020\u0005H\u0007J\u0018\u0010,\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0018\u0010.\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0016\u0010/\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010-\u001a\u00020\u0005J \u00100\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0007J(\u00103\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005H\u0007J\u0018\u00105\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00107\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00108\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00109\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u0010:\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u00106\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/MatrixMathHelper;",
        "",
        "<init>",
        "()V",
        "EPSILON",
        "",
        "isZero",
        "",
        "d",
        "multiplyInto",
        "",
        "out",
        "",
        "a",
        "b",
        "decomposeMatrix",
        "transformMatrix",
        "ctx",
        "Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;",
        "determinant",
        "matrix",
        "inverse",
        "transpose",
        "m",
        "multiplyVectorByMatrix",
        "v",
        "result",
        "v3Length",
        "v3Normalize",
        "vector",
        "norm",
        "v3Dot",
        "v3Combine",
        "aScale",
        "bScale",
        "v3Cross",
        "roundTo3Places",
        "n",
        "createIdentityMatrix",
        "degreesToRadians",
        "degrees",
        "resetIdentityMatrix",
        "applyPerspective",
        "perspective",
        "applyScaleX",
        "factor",
        "applyScaleY",
        "applyScaleZ",
        "applyTranslate2D",
        "x",
        "y",
        "applyTranslate3D",
        "z",
        "applySkewX",
        "radians",
        "applySkewY",
        "applyRotateX",
        "applyRotateY",
        "applyRotateZ",
        "MatrixDecompositionContext",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final EPSILON:D = 1.0E-5

.field public static final INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/uimanager/MatrixMathHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/uimanager/MatrixMathHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/MatrixMathHelper;->INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;

    .line 8
    return-void
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

.method public static final applyPerspective([DD)V
    .locals 2
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "m"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, -0x1

    .line 7
    int-to-double v0, v0

    .line 8
    div-double/2addr v0, p1

    .line 9
    .line 10
    const/16 p1, 0xb

    .line 11
    .line 12
    aput-wide v0, p0, p1

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

.method public static final applyRotateX([DD)V
    .locals 3
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "m"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x5

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 10
    move-result-wide v1

    .line 11
    .line 12
    aput-wide v1, p0, v0

    .line 13
    const/4 v0, 0x6

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 17
    move-result-wide v1

    .line 18
    .line 19
    aput-wide v1, p0, v0

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 23
    move-result-wide v0

    .line 24
    neg-double v0, v0

    .line 25
    .line 26
    const/16 v2, 0x9

    .line 27
    .line 28
    aput-wide v0, p0, v2

    .line 29
    .line 30
    const/16 v0, 0xa

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 34
    move-result-wide p1

    .line 35
    .line 36
    aput-wide p1, p0, v0

    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final applyRotateY([DD)V
    .locals 3
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "m"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 10
    move-result-wide v1

    .line 11
    .line 12
    aput-wide v1, p0, v0

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 16
    move-result-wide v0

    .line 17
    neg-double v0, v0

    .line 18
    const/4 v2, 0x2

    .line 19
    .line 20
    aput-wide v0, p0, v2

    .line 21
    .line 22
    const/16 v0, 0x8

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 26
    move-result-wide v1

    .line 27
    .line 28
    aput-wide v1, p0, v0

    .line 29
    .line 30
    const/16 v0, 0xa

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 34
    move-result-wide p1

    .line 35
    .line 36
    aput-wide p1, p0, v0

    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final applyRotateZ([DD)V
    .locals 3
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "m"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 10
    move-result-wide v1

    .line 11
    .line 12
    aput-wide v1, p0, v0

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 17
    move-result-wide v1

    .line 18
    .line 19
    aput-wide v1, p0, v0

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 23
    move-result-wide v0

    .line 24
    neg-double v0, v0

    .line 25
    const/4 v2, 0x4

    .line 26
    .line 27
    aput-wide v0, p0, v2

    .line 28
    const/4 v0, 0x5

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 32
    move-result-wide p1

    .line 33
    .line 34
    aput-wide p1, p0, v0

    .line 35
    return-void
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

.method public static final applyScaleX([DD)V
    .locals 1
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "m"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    aput-wide p1, p0, v0

    .line 9
    return-void
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

.method public static final applyScaleY([DD)V
    .locals 1
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "m"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x5

    .line 7
    .line 8
    aput-wide p1, p0, v0

    .line 9
    return-void
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

.method public static final applySkewX([DD)V
    .locals 1
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "m"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x4

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    .line 10
    move-result-wide p1

    .line 11
    .line 12
    aput-wide p1, p0, v0

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

.method public static final applySkewY([DD)V
    .locals 1
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "m"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    .line 10
    move-result-wide p1

    .line 11
    .line 12
    aput-wide p1, p0, v0

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

.method public static final applyTranslate2D([DDD)V
    .locals 1
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "m"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v0, 0xc

    .line 8
    .line 9
    aput-wide p1, p0, v0

    .line 10
    .line 11
    const/16 p1, 0xd

    .line 12
    .line 13
    aput-wide p3, p0, p1

    .line 14
    return-void
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

.method public static final applyTranslate3D([DDDD)V
    .locals 1
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "m"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v0, 0xc

    .line 8
    .line 9
    aput-wide p1, p0, v0

    .line 10
    .line 11
    const/16 p1, 0xd

    .line 12
    .line 13
    aput-wide p3, p0, p1

    .line 14
    .line 15
    const/16 p1, 0xe

    .line 16
    .line 17
    aput-wide p5, p0, p1

    .line 18
    return-void
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
.end method

.method public static final createIdentityMatrix()[D
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    new-array v0, v0, [D

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 8
    return-object v0
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

.method public static final decomposeMatrix([DLcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;)V
    .locals 24
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x4

    .line 7
    .line 8
    .line 9
    const-string/jumbo v5, "transformMatrix"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string v5, "ctx"

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    array-length v5, v0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x1

    .line 21
    .line 22
    const/16 v8, 0x10

    .line 23
    .line 24
    if-ne v5, v8, :cond_0

    .line 25
    move v5, v7

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v5, v6

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-static {v5}, Lh6/a;->a(Z)V

    .line 31
    .line 32
    iget-object v5, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->perspective:[D

    .line 33
    .line 34
    iget-object v9, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->scale:[D

    .line 35
    .line 36
    iget-object v10, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->skew:[D

    .line 37
    .line 38
    iget-object v11, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->translation:[D

    .line 39
    .line 40
    iget-object v1, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->rotationDegrees:[D

    .line 41
    .line 42
    sget-object v12, Lcom/facebook/react/uimanager/MatrixMathHelper;->INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;

    .line 43
    .line 44
    const/16 v13, 0xf

    .line 45
    .line 46
    aget-wide v14, v0, v13

    .line 47
    .line 48
    .line 49
    invoke-direct {v12, v14, v15}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 50
    move-result v12

    .line 51
    .line 52
    if-eqz v12, :cond_1

    .line 53
    goto :goto_4

    .line 54
    .line 55
    :cond_1
    new-array v12, v4, [[D

    .line 56
    move v14, v6

    .line 57
    .line 58
    :goto_1
    if-ge v14, v4, :cond_2

    .line 59
    .line 60
    new-array v15, v4, [D

    .line 61
    .line 62
    aput-object v15, v12, v14

    .line 63
    add-int/2addr v14, v7

    .line 64
    goto :goto_1

    .line 65
    .line 66
    :cond_2
    new-array v8, v8, [D

    .line 67
    move v14, v6

    .line 68
    .line 69
    :goto_2
    const-wide/16 v15, 0x0

    .line 70
    .line 71
    if-ge v14, v4, :cond_5

    .line 72
    move v2, v6

    .line 73
    .line 74
    const/16 v17, 0x2

    .line 75
    .line 76
    :goto_3
    if-ge v2, v4, :cond_4

    .line 77
    .line 78
    mul-int/lit8 v18, v14, 0x4

    .line 79
    .line 80
    add-int v18, v18, v2

    .line 81
    .line 82
    aget-wide v19, v0, v18

    .line 83
    .line 84
    aget-wide v21, v0, v13

    .line 85
    .line 86
    div-double v19, v19, v21

    .line 87
    .line 88
    aget-object v21, v12, v14

    .line 89
    .line 90
    aput-wide v19, v21, v2

    .line 91
    .line 92
    if-ne v2, v3, :cond_3

    .line 93
    .line 94
    move-wide/from16 v19, v15

    .line 95
    .line 96
    :cond_3
    aput-wide v19, v8, v18

    .line 97
    add-int/2addr v2, v7

    .line 98
    goto :goto_3

    .line 99
    :cond_4
    add-int/2addr v14, v7

    .line 100
    goto :goto_2

    .line 101
    .line 102
    :cond_5
    const/16 v17, 0x2

    .line 103
    .line 104
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 105
    .line 106
    aput-wide v18, v8, v13

    .line 107
    .line 108
    sget-object v0, Lcom/facebook/react/uimanager/MatrixMathHelper;->INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;

    .line 109
    .line 110
    .line 111
    invoke-static {v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->determinant([D)D

    .line 112
    move-result-wide v13

    .line 113
    .line 114
    .line 115
    invoke-direct {v0, v13, v14}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 116
    move-result v2

    .line 117
    .line 118
    if-eqz v2, :cond_6

    .line 119
    :goto_4
    return-void

    .line 120
    .line 121
    :cond_6
    aget-object v2, v12, v6

    .line 122
    .line 123
    aget-wide v13, v2, v3

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, v13, v14}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 127
    move-result v2

    .line 128
    .line 129
    if-eqz v2, :cond_8

    .line 130
    .line 131
    aget-object v2, v12, v7

    .line 132
    .line 133
    aget-wide v13, v2, v3

    .line 134
    .line 135
    .line 136
    invoke-direct {v0, v13, v14}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 137
    move-result v2

    .line 138
    .line 139
    if-eqz v2, :cond_8

    .line 140
    .line 141
    aget-object v2, v12, v17

    .line 142
    .line 143
    aget-wide v13, v2, v3

    .line 144
    .line 145
    .line 146
    invoke-direct {v0, v13, v14}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 147
    move-result v0

    .line 148
    .line 149
    if-nez v0, :cond_7

    .line 150
    goto :goto_5

    .line 151
    .line 152
    :cond_7
    aput-wide v15, v5, v17

    .line 153
    .line 154
    aput-wide v15, v5, v7

    .line 155
    .line 156
    aput-wide v15, v5, v6

    .line 157
    .line 158
    aput-wide v18, v5, v3

    .line 159
    goto :goto_6

    .line 160
    .line 161
    :cond_8
    :goto_5
    aget-object v0, v12, v6

    .line 162
    .line 163
    aget-wide v13, v0, v3

    .line 164
    .line 165
    aget-object v0, v12, v7

    .line 166
    .line 167
    aget-wide v18, v0, v3

    .line 168
    .line 169
    aget-object v0, v12, v17

    .line 170
    .line 171
    aget-wide v20, v0, v3

    .line 172
    .line 173
    aget-object v0, v12, v3

    .line 174
    .line 175
    aget-wide v22, v0, v3

    .line 176
    .line 177
    new-array v0, v4, [D

    .line 178
    .line 179
    aput-wide v13, v0, v6

    .line 180
    .line 181
    aput-wide v18, v0, v7

    .line 182
    .line 183
    aput-wide v20, v0, v17

    .line 184
    .line 185
    aput-wide v22, v0, v3

    .line 186
    .line 187
    .line 188
    invoke-static {v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->inverse([D)[D

    .line 189
    move-result-object v2

    .line 190
    .line 191
    .line 192
    invoke-static {v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->transpose([D)[D

    .line 193
    move-result-object v2

    .line 194
    .line 195
    .line 196
    invoke-static {v0, v2, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyVectorByMatrix([D[D[D)V

    .line 197
    :goto_6
    move v0, v6

    .line 198
    .line 199
    :goto_7
    if-ge v0, v3, :cond_9

    .line 200
    .line 201
    aget-object v2, v12, v3

    .line 202
    .line 203
    aget-wide v4, v2, v0

    .line 204
    .line 205
    aput-wide v4, v11, v0

    .line 206
    add-int/2addr v0, v7

    .line 207
    goto :goto_7

    .line 208
    .line 209
    :cond_9
    new-array v0, v3, [[D

    .line 210
    move v2, v6

    .line 211
    .line 212
    :goto_8
    if-ge v2, v3, :cond_a

    .line 213
    .line 214
    new-array v4, v3, [D

    .line 215
    .line 216
    aput-object v4, v0, v2

    .line 217
    add-int/2addr v2, v7

    .line 218
    goto :goto_8

    .line 219
    :cond_a
    move v2, v6

    .line 220
    .line 221
    :goto_9
    if-ge v2, v3, :cond_b

    .line 222
    .line 223
    aget-object v4, v0, v2

    .line 224
    .line 225
    aget-object v5, v12, v2

    .line 226
    .line 227
    aget-wide v13, v5, v6

    .line 228
    .line 229
    aput-wide v13, v4, v6

    .line 230
    .line 231
    aget-wide v13, v5, v7

    .line 232
    .line 233
    aput-wide v13, v4, v7

    .line 234
    .line 235
    aget-wide v13, v5, v17

    .line 236
    .line 237
    aput-wide v13, v4, v17

    .line 238
    add-int/2addr v2, v7

    .line 239
    goto :goto_9

    .line 240
    .line 241
    :cond_b
    aget-object v2, v0, v6

    .line 242
    .line 243
    .line 244
    invoke-static {v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 245
    move-result-wide v4

    .line 246
    .line 247
    aput-wide v4, v9, v6

    .line 248
    .line 249
    aget-object v2, v0, v6

    .line 250
    .line 251
    .line 252
    invoke-static {v2, v4, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 253
    move-result-object v2

    .line 254
    .line 255
    aput-object v2, v0, v6

    .line 256
    .line 257
    aget-object v4, v0, v7

    .line 258
    .line 259
    .line 260
    invoke-static {v2, v4}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 261
    move-result-wide v4

    .line 262
    .line 263
    aput-wide v4, v10, v6

    .line 264
    .line 265
    aget-object v18, v0, v7

    .line 266
    .line 267
    aget-object v19, v0, v6

    .line 268
    .line 269
    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    .line 270
    neg-double v4, v4

    .line 271
    .line 272
    move-wide/from16 v22, v4

    .line 273
    .line 274
    .line 275
    invoke-static/range {v18 .. v23}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 276
    move-result-object v2

    .line 277
    .line 278
    aput-object v2, v0, v7

    .line 279
    .line 280
    .line 281
    invoke-static {v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 282
    move-result-wide v4

    .line 283
    .line 284
    aput-wide v4, v9, v7

    .line 285
    .line 286
    aget-object v2, v0, v7

    .line 287
    .line 288
    .line 289
    invoke-static {v2, v4, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 290
    move-result-object v2

    .line 291
    .line 292
    aput-object v2, v0, v7

    .line 293
    .line 294
    aget-wide v4, v10, v6

    .line 295
    .line 296
    aget-wide v11, v9, v7

    .line 297
    div-double/2addr v4, v11

    .line 298
    .line 299
    aput-wide v4, v10, v6

    .line 300
    .line 301
    aget-object v2, v0, v6

    .line 302
    .line 303
    aget-object v4, v0, v17

    .line 304
    .line 305
    .line 306
    invoke-static {v2, v4}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 307
    move-result-wide v4

    .line 308
    .line 309
    aput-wide v4, v10, v7

    .line 310
    .line 311
    aget-object v18, v0, v17

    .line 312
    .line 313
    aget-object v19, v0, v6

    .line 314
    neg-double v4, v4

    .line 315
    .line 316
    move-wide/from16 v22, v4

    .line 317
    .line 318
    .line 319
    invoke-static/range {v18 .. v23}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 320
    move-result-object v2

    .line 321
    .line 322
    aput-object v2, v0, v17

    .line 323
    .line 324
    aget-object v4, v0, v7

    .line 325
    .line 326
    .line 327
    invoke-static {v4, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 328
    move-result-wide v4

    .line 329
    .line 330
    aput-wide v4, v10, v17

    .line 331
    .line 332
    aget-object v18, v0, v17

    .line 333
    .line 334
    aget-object v19, v0, v7

    .line 335
    neg-double v4, v4

    .line 336
    .line 337
    move-wide/from16 v22, v4

    .line 338
    .line 339
    .line 340
    invoke-static/range {v18 .. v23}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 341
    move-result-object v2

    .line 342
    .line 343
    aput-object v2, v0, v17

    .line 344
    .line 345
    .line 346
    invoke-static {v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 347
    move-result-wide v4

    .line 348
    .line 349
    aput-wide v4, v9, v17

    .line 350
    .line 351
    aget-object v2, v0, v17

    .line 352
    .line 353
    .line 354
    invoke-static {v2, v4, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 355
    move-result-object v2

    .line 356
    .line 357
    aput-object v2, v0, v17

    .line 358
    .line 359
    aget-wide v4, v10, v7

    .line 360
    .line 361
    aget-wide v11, v9, v17

    .line 362
    div-double/2addr v4, v11

    .line 363
    .line 364
    aput-wide v4, v10, v7

    .line 365
    .line 366
    aget-wide v4, v10, v17

    .line 367
    div-double/2addr v4, v11

    .line 368
    .line 369
    aput-wide v4, v10, v17

    .line 370
    .line 371
    aget-object v4, v0, v7

    .line 372
    .line 373
    .line 374
    invoke-static {v4, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Cross([D[D)[D

    .line 375
    move-result-object v2

    .line 376
    .line 377
    aget-object v4, v0, v6

    .line 378
    .line 379
    .line 380
    invoke-static {v4, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 381
    move-result-wide v4

    .line 382
    .line 383
    cmpg-double v2, v4, v15

    .line 384
    .line 385
    if-gez v2, :cond_c

    .line 386
    move v2, v6

    .line 387
    .line 388
    :goto_a
    if-ge v2, v3, :cond_c

    .line 389
    .line 390
    aget-wide v4, v9, v2

    .line 391
    .line 392
    const-wide/high16 v10, -0x4010000000000000L    # -1.0

    .line 393
    mul-double/2addr v4, v10

    .line 394
    .line 395
    aput-wide v4, v9, v2

    .line 396
    .line 397
    aget-object v4, v0, v2

    .line 398
    .line 399
    aget-wide v12, v4, v6

    .line 400
    mul-double/2addr v12, v10

    .line 401
    .line 402
    aput-wide v12, v4, v6

    .line 403
    .line 404
    aget-wide v12, v4, v7

    .line 405
    mul-double/2addr v12, v10

    .line 406
    .line 407
    aput-wide v12, v4, v7

    .line 408
    .line 409
    aget-wide v12, v4, v17

    .line 410
    mul-double/2addr v12, v10

    .line 411
    .line 412
    aput-wide v12, v4, v17

    .line 413
    add-int/2addr v2, v7

    .line 414
    goto :goto_a

    .line 415
    .line 416
    :cond_c
    aget-object v2, v0, v17

    .line 417
    .line 418
    aget-wide v3, v2, v7

    .line 419
    .line 420
    aget-wide v8, v2, v17

    .line 421
    .line 422
    .line 423
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    .line 424
    move-result-wide v2

    .line 425
    neg-double v2, v2

    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    const-wide v4, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 431
    mul-double/2addr v2, v4

    .line 432
    .line 433
    .line 434
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 435
    move-result-wide v2

    .line 436
    .line 437
    aput-wide v2, v1, v6

    .line 438
    .line 439
    aget-object v2, v0, v17

    .line 440
    .line 441
    aget-wide v8, v2, v6

    .line 442
    neg-double v8, v8

    .line 443
    .line 444
    aget-wide v10, v2, v7

    .line 445
    mul-double/2addr v10, v10

    .line 446
    .line 447
    aget-wide v12, v2, v17

    .line 448
    mul-double/2addr v12, v12

    .line 449
    add-double/2addr v10, v12

    .line 450
    .line 451
    .line 452
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 453
    move-result-wide v2

    .line 454
    .line 455
    .line 456
    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 457
    move-result-wide v2

    .line 458
    neg-double v2, v2

    .line 459
    mul-double/2addr v2, v4

    .line 460
    .line 461
    .line 462
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 463
    move-result-wide v2

    .line 464
    .line 465
    aput-wide v2, v1, v7

    .line 466
    .line 467
    aget-object v2, v0, v7

    .line 468
    .line 469
    aget-wide v7, v2, v6

    .line 470
    .line 471
    aget-object v0, v0, v6

    .line 472
    .line 473
    aget-wide v2, v0, v6

    .line 474
    .line 475
    .line 476
    invoke-static {v7, v8, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 477
    move-result-wide v2

    .line 478
    neg-double v2, v2

    .line 479
    mul-double/2addr v2, v4

    .line 480
    .line 481
    .line 482
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 483
    move-result-wide v2

    .line 484
    .line 485
    aput-wide v2, v1, v17

    .line 486
    return-void
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
.end method

.method public static final degreesToRadians(D)D
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    .line 3
    .line 4
    .line 5
    const-wide v0, 0x400921fb54442d18L    # Math.PI

    .line 6
    mul-double/2addr p0, v0

    .line 7
    .line 8
    const/16 v0, 0xb4

    .line 9
    int-to-double v0, v0

    .line 10
    div-double/2addr p0, v0

    .line 11
    return-wide p0
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

.method public static final determinant([D)D
    .locals 49
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "matrix"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    aget-wide v1, v0, v1

    .line 11
    const/4 v3, 0x1

    .line 12
    .line 13
    aget-wide v3, v0, v3

    .line 14
    const/4 v5, 0x2

    .line 15
    .line 16
    aget-wide v5, v0, v5

    .line 17
    const/4 v7, 0x3

    .line 18
    .line 19
    aget-wide v7, v0, v7

    .line 20
    const/4 v9, 0x4

    .line 21
    .line 22
    aget-wide v9, v0, v9

    .line 23
    const/4 v11, 0x5

    .line 24
    .line 25
    aget-wide v11, v0, v11

    .line 26
    const/4 v13, 0x6

    .line 27
    .line 28
    aget-wide v13, v0, v13

    .line 29
    const/4 v15, 0x7

    .line 30
    .line 31
    aget-wide v15, v0, v15

    .line 32
    .line 33
    const/16 v17, 0x8

    .line 34
    .line 35
    aget-wide v17, v0, v17

    .line 36
    .line 37
    const/16 v19, 0x9

    .line 38
    .line 39
    aget-wide v19, v0, v19

    .line 40
    .line 41
    const/16 v21, 0xa

    .line 42
    .line 43
    aget-wide v21, v0, v21

    .line 44
    .line 45
    const/16 v23, 0xb

    .line 46
    .line 47
    aget-wide v23, v0, v23

    .line 48
    .line 49
    const/16 v25, 0xc

    .line 50
    .line 51
    aget-wide v25, v0, v25

    .line 52
    .line 53
    const/16 v27, 0xd

    .line 54
    .line 55
    aget-wide v27, v0, v27

    .line 56
    .line 57
    const/16 v29, 0xe

    .line 58
    .line 59
    aget-wide v29, v0, v29

    .line 60
    .line 61
    const/16 v31, 0xf

    .line 62
    .line 63
    aget-wide v31, v0, v31

    .line 64
    .line 65
    mul-double v33, v7, v13

    .line 66
    .line 67
    mul-double v35, v33, v19

    .line 68
    .line 69
    mul-double v35, v35, v25

    .line 70
    .line 71
    mul-double v37, v5, v15

    .line 72
    .line 73
    mul-double v39, v37, v19

    .line 74
    .line 75
    mul-double v39, v39, v25

    .line 76
    .line 77
    sub-double v35, v35, v39

    .line 78
    .line 79
    mul-double v39, v7, v11

    .line 80
    .line 81
    mul-double v41, v39, v21

    .line 82
    .line 83
    mul-double v41, v41, v25

    .line 84
    .line 85
    sub-double v35, v35, v41

    .line 86
    .line 87
    mul-double v41, v3, v15

    .line 88
    .line 89
    mul-double v43, v41, v21

    .line 90
    .line 91
    mul-double v43, v43, v25

    .line 92
    .line 93
    add-double v35, v35, v43

    .line 94
    .line 95
    mul-double v43, v5, v11

    .line 96
    .line 97
    mul-double v45, v43, v23

    .line 98
    .line 99
    mul-double v45, v45, v25

    .line 100
    .line 101
    add-double v35, v35, v45

    .line 102
    .line 103
    mul-double v45, v3, v13

    .line 104
    .line 105
    mul-double v47, v45, v23

    .line 106
    .line 107
    mul-double v47, v47, v25

    .line 108
    .line 109
    sub-double v35, v35, v47

    .line 110
    .line 111
    mul-double v33, v33, v17

    .line 112
    .line 113
    mul-double v33, v33, v27

    .line 114
    .line 115
    sub-double v35, v35, v33

    .line 116
    .line 117
    mul-double v37, v37, v17

    .line 118
    .line 119
    mul-double v37, v37, v27

    .line 120
    .line 121
    add-double v35, v35, v37

    .line 122
    mul-double/2addr v7, v9

    .line 123
    .line 124
    mul-double v25, v7, v21

    .line 125
    .line 126
    mul-double v25, v25, v27

    .line 127
    .line 128
    add-double v35, v35, v25

    .line 129
    mul-double/2addr v15, v1

    .line 130
    .line 131
    mul-double v25, v15, v21

    .line 132
    .line 133
    mul-double v25, v25, v27

    .line 134
    .line 135
    sub-double v35, v35, v25

    .line 136
    mul-double/2addr v5, v9

    .line 137
    .line 138
    mul-double v25, v5, v23

    .line 139
    .line 140
    mul-double v25, v25, v27

    .line 141
    .line 142
    sub-double v35, v35, v25

    .line 143
    mul-double/2addr v13, v1

    .line 144
    .line 145
    mul-double v25, v13, v23

    .line 146
    .line 147
    mul-double v25, v25, v27

    .line 148
    .line 149
    add-double v35, v35, v25

    .line 150
    .line 151
    mul-double v39, v39, v17

    .line 152
    .line 153
    mul-double v39, v39, v29

    .line 154
    .line 155
    add-double v35, v35, v39

    .line 156
    .line 157
    mul-double v41, v41, v17

    .line 158
    .line 159
    mul-double v41, v41, v29

    .line 160
    .line 161
    sub-double v35, v35, v41

    .line 162
    .line 163
    mul-double v7, v7, v19

    .line 164
    .line 165
    mul-double v7, v7, v29

    .line 166
    .line 167
    sub-double v35, v35, v7

    .line 168
    .line 169
    mul-double v15, v15, v19

    .line 170
    .line 171
    mul-double v15, v15, v29

    .line 172
    .line 173
    add-double v35, v35, v15

    .line 174
    mul-double/2addr v3, v9

    .line 175
    .line 176
    mul-double v7, v3, v23

    .line 177
    .line 178
    mul-double v7, v7, v29

    .line 179
    .line 180
    add-double v35, v35, v7

    .line 181
    mul-double/2addr v1, v11

    .line 182
    .line 183
    mul-double v23, v23, v1

    .line 184
    .line 185
    mul-double v23, v23, v29

    .line 186
    .line 187
    sub-double v35, v35, v23

    .line 188
    .line 189
    mul-double v43, v43, v17

    .line 190
    .line 191
    mul-double v43, v43, v31

    .line 192
    .line 193
    sub-double v35, v35, v43

    .line 194
    .line 195
    mul-double v45, v45, v17

    .line 196
    .line 197
    mul-double v45, v45, v31

    .line 198
    .line 199
    add-double v35, v35, v45

    .line 200
    .line 201
    mul-double v5, v5, v19

    .line 202
    .line 203
    mul-double v5, v5, v31

    .line 204
    .line 205
    add-double v35, v35, v5

    .line 206
    .line 207
    mul-double v13, v13, v19

    .line 208
    .line 209
    mul-double v13, v13, v31

    .line 210
    .line 211
    sub-double v35, v35, v13

    .line 212
    .line 213
    mul-double v3, v3, v21

    .line 214
    .line 215
    mul-double v3, v3, v31

    .line 216
    .line 217
    sub-double v35, v35, v3

    .line 218
    .line 219
    mul-double v1, v1, v21

    .line 220
    .line 221
    mul-double v1, v1, v31

    .line 222
    .line 223
    add-double v35, v35, v1

    .line 224
    return-wide v35
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
.end method

.method public static final inverse([D)[D
    .locals 110
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const/16 v4, 0xc

    .line 5
    .line 6
    const/16 v5, 0xb

    .line 7
    .line 8
    const/16 v6, 0xa

    .line 9
    .line 10
    const/16 v7, 0x9

    .line 11
    .line 12
    const/16 v8, 0x8

    .line 13
    const/4 v9, 0x7

    .line 14
    const/4 v10, 0x6

    .line 15
    const/4 v11, 0x5

    .line 16
    const/4 v12, 0x4

    .line 17
    const/4 v13, 0x3

    .line 18
    const/4 v14, 0x2

    .line 19
    const/4 v15, 0x1

    .line 20
    .line 21
    const/16 v16, 0x0

    .line 22
    .line 23
    const/16 v17, 0xf

    .line 24
    .line 25
    const-string v1, "matrix"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    const/16 v1, 0xe

    .line 31
    .line 32
    const/16 v18, 0xd

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/facebook/react/uimanager/MatrixMathHelper;->determinant([D)D

    .line 36
    move-result-wide v2

    .line 37
    .line 38
    move/from16 v19, v1

    .line 39
    .line 40
    sget-object v1, Lcom/facebook/react/uimanager/MatrixMathHelper;->INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 44
    move-result v1

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    return-object v0

    .line 48
    .line 49
    :cond_0
    aget-wide v20, v0, v16

    .line 50
    .line 51
    aget-wide v22, v0, v15

    .line 52
    .line 53
    aget-wide v24, v0, v14

    .line 54
    .line 55
    aget-wide v26, v0, v13

    .line 56
    .line 57
    aget-wide v28, v0, v12

    .line 58
    .line 59
    aget-wide v30, v0, v11

    .line 60
    .line 61
    aget-wide v32, v0, v10

    .line 62
    .line 63
    aget-wide v34, v0, v9

    .line 64
    .line 65
    aget-wide v36, v0, v8

    .line 66
    .line 67
    aget-wide v38, v0, v7

    .line 68
    .line 69
    aget-wide v40, v0, v6

    .line 70
    .line 71
    aget-wide v42, v0, v5

    .line 72
    .line 73
    aget-wide v44, v0, v4

    .line 74
    .line 75
    aget-wide v46, v0, v18

    .line 76
    .line 77
    aget-wide v48, v0, v19

    .line 78
    .line 79
    aget-wide v50, v0, v17

    .line 80
    .line 81
    mul-double v0, v32, v42

    .line 82
    .line 83
    mul-double v52, v0, v46

    .line 84
    .line 85
    mul-double v54, v34, v40

    .line 86
    .line 87
    mul-double v56, v54, v46

    .line 88
    .line 89
    sub-double v52, v52, v56

    .line 90
    .line 91
    mul-double v56, v34, v38

    .line 92
    .line 93
    mul-double v58, v56, v48

    .line 94
    .line 95
    add-double v52, v52, v58

    .line 96
    .line 97
    mul-double v58, v30, v42

    .line 98
    .line 99
    mul-double v60, v58, v48

    .line 100
    .line 101
    sub-double v52, v52, v60

    .line 102
    .line 103
    mul-double v60, v32, v38

    .line 104
    .line 105
    mul-double v62, v60, v50

    .line 106
    .line 107
    sub-double v52, v52, v62

    .line 108
    .line 109
    mul-double v62, v30, v40

    .line 110
    .line 111
    mul-double v64, v62, v50

    .line 112
    .line 113
    add-double v52, v52, v64

    .line 114
    .line 115
    div-double v52, v52, v2

    .line 116
    .line 117
    mul-double v64, v26, v40

    .line 118
    .line 119
    mul-double v66, v64, v46

    .line 120
    .line 121
    mul-double v68, v24, v42

    .line 122
    .line 123
    mul-double v70, v68, v46

    .line 124
    .line 125
    sub-double v66, v66, v70

    .line 126
    .line 127
    mul-double v70, v26, v38

    .line 128
    .line 129
    mul-double v72, v70, v48

    .line 130
    .line 131
    sub-double v66, v66, v72

    .line 132
    .line 133
    mul-double v72, v22, v42

    .line 134
    .line 135
    mul-double v74, v72, v48

    .line 136
    .line 137
    add-double v66, v66, v74

    .line 138
    .line 139
    mul-double v74, v24, v38

    .line 140
    .line 141
    mul-double v76, v74, v50

    .line 142
    .line 143
    add-double v66, v66, v76

    .line 144
    .line 145
    mul-double v76, v22, v40

    .line 146
    .line 147
    mul-double v78, v76, v50

    .line 148
    .line 149
    sub-double v66, v66, v78

    .line 150
    .line 151
    div-double v66, v66, v2

    .line 152
    .line 153
    mul-double v78, v24, v34

    .line 154
    .line 155
    mul-double v80, v78, v46

    .line 156
    .line 157
    mul-double v82, v26, v32

    .line 158
    .line 159
    mul-double v84, v82, v46

    .line 160
    .line 161
    sub-double v80, v80, v84

    .line 162
    .line 163
    mul-double v84, v26, v30

    .line 164
    .line 165
    mul-double v86, v84, v48

    .line 166
    .line 167
    add-double v80, v80, v86

    .line 168
    .line 169
    mul-double v86, v22, v34

    .line 170
    .line 171
    mul-double v88, v86, v48

    .line 172
    .line 173
    sub-double v80, v80, v88

    .line 174
    .line 175
    mul-double v88, v24, v30

    .line 176
    .line 177
    mul-double v90, v88, v50

    .line 178
    .line 179
    sub-double v80, v80, v90

    .line 180
    .line 181
    mul-double v90, v22, v32

    .line 182
    .line 183
    mul-double v92, v90, v50

    .line 184
    .line 185
    add-double v80, v80, v92

    .line 186
    .line 187
    div-double v80, v80, v2

    .line 188
    .line 189
    mul-double v92, v82, v38

    .line 190
    .line 191
    mul-double v94, v78, v38

    .line 192
    .line 193
    sub-double v92, v92, v94

    .line 194
    .line 195
    mul-double v94, v84, v40

    .line 196
    .line 197
    sub-double v92, v92, v94

    .line 198
    .line 199
    mul-double v94, v86, v40

    .line 200
    .line 201
    add-double v92, v92, v94

    .line 202
    .line 203
    mul-double v94, v88, v42

    .line 204
    .line 205
    add-double v92, v92, v94

    .line 206
    .line 207
    mul-double v94, v90, v42

    .line 208
    .line 209
    sub-double v92, v92, v94

    .line 210
    .line 211
    div-double v92, v92, v2

    .line 212
    .line 213
    mul-double v54, v54, v44

    .line 214
    .line 215
    mul-double v0, v0, v44

    .line 216
    .line 217
    sub-double v54, v54, v0

    .line 218
    .line 219
    mul-double v0, v34, v36

    .line 220
    .line 221
    mul-double v94, v0, v48

    .line 222
    .line 223
    sub-double v54, v54, v94

    .line 224
    .line 225
    mul-double v94, v28, v42

    .line 226
    .line 227
    mul-double v96, v94, v48

    .line 228
    .line 229
    add-double v54, v54, v96

    .line 230
    .line 231
    mul-double v96, v32, v36

    .line 232
    .line 233
    mul-double v98, v96, v50

    .line 234
    .line 235
    add-double v54, v54, v98

    .line 236
    .line 237
    mul-double v98, v28, v40

    .line 238
    .line 239
    mul-double v100, v98, v50

    .line 240
    .line 241
    sub-double v54, v54, v100

    .line 242
    .line 243
    div-double v54, v54, v2

    .line 244
    .line 245
    mul-double v68, v68, v44

    .line 246
    .line 247
    mul-double v64, v64, v44

    .line 248
    .line 249
    sub-double v68, v68, v64

    .line 250
    .line 251
    mul-double v64, v26, v36

    .line 252
    .line 253
    mul-double v100, v64, v48

    .line 254
    .line 255
    add-double v68, v68, v100

    .line 256
    .line 257
    mul-double v100, v20, v42

    .line 258
    .line 259
    mul-double v102, v100, v48

    .line 260
    .line 261
    sub-double v68, v68, v102

    .line 262
    .line 263
    mul-double v102, v24, v36

    .line 264
    .line 265
    mul-double v104, v102, v50

    .line 266
    .line 267
    sub-double v68, v68, v104

    .line 268
    .line 269
    mul-double v104, v20, v40

    .line 270
    .line 271
    mul-double v106, v104, v50

    .line 272
    .line 273
    add-double v68, v68, v106

    .line 274
    .line 275
    div-double v68, v68, v2

    .line 276
    .line 277
    mul-double v106, v82, v44

    .line 278
    .line 279
    mul-double v108, v78, v44

    .line 280
    .line 281
    sub-double v106, v106, v108

    .line 282
    .line 283
    mul-double v26, v26, v28

    .line 284
    .line 285
    mul-double v108, v26, v48

    .line 286
    .line 287
    sub-double v106, v106, v108

    .line 288
    .line 289
    mul-double v34, v34, v20

    .line 290
    .line 291
    mul-double v108, v34, v48

    .line 292
    .line 293
    add-double v106, v106, v108

    .line 294
    .line 295
    mul-double v24, v24, v28

    .line 296
    .line 297
    mul-double v108, v24, v50

    .line 298
    .line 299
    add-double v106, v106, v108

    .line 300
    .line 301
    mul-double v32, v32, v20

    .line 302
    .line 303
    mul-double v108, v32, v50

    .line 304
    .line 305
    sub-double v106, v106, v108

    .line 306
    .line 307
    div-double v106, v106, v2

    .line 308
    .line 309
    mul-double v78, v78, v36

    .line 310
    .line 311
    mul-double v82, v82, v36

    .line 312
    .line 313
    sub-double v78, v78, v82

    .line 314
    .line 315
    mul-double v82, v26, v40

    .line 316
    .line 317
    add-double v78, v78, v82

    .line 318
    .line 319
    mul-double v82, v34, v40

    .line 320
    .line 321
    sub-double v78, v78, v82

    .line 322
    .line 323
    mul-double v82, v24, v42

    .line 324
    .line 325
    sub-double v78, v78, v82

    .line 326
    .line 327
    mul-double v82, v32, v42

    .line 328
    .line 329
    add-double v78, v78, v82

    .line 330
    .line 331
    div-double v78, v78, v2

    .line 332
    .line 333
    mul-double v58, v58, v44

    .line 334
    .line 335
    mul-double v56, v56, v44

    .line 336
    .line 337
    sub-double v58, v58, v56

    .line 338
    .line 339
    mul-double v0, v0, v46

    .line 340
    .line 341
    add-double v58, v58, v0

    .line 342
    .line 343
    mul-double v94, v94, v46

    .line 344
    .line 345
    sub-double v58, v58, v94

    .line 346
    .line 347
    mul-double v0, v30, v36

    .line 348
    .line 349
    mul-double v56, v0, v50

    .line 350
    .line 351
    sub-double v58, v58, v56

    .line 352
    .line 353
    mul-double v56, v28, v38

    .line 354
    .line 355
    mul-double v82, v56, v50

    .line 356
    .line 357
    add-double v58, v58, v82

    .line 358
    .line 359
    div-double v58, v58, v2

    .line 360
    .line 361
    mul-double v70, v70, v44

    .line 362
    .line 363
    mul-double v72, v72, v44

    .line 364
    .line 365
    sub-double v70, v70, v72

    .line 366
    .line 367
    mul-double v64, v64, v46

    .line 368
    .line 369
    sub-double v70, v70, v64

    .line 370
    .line 371
    mul-double v100, v100, v46

    .line 372
    .line 373
    add-double v70, v70, v100

    .line 374
    .line 375
    mul-double v64, v22, v36

    .line 376
    .line 377
    mul-double v72, v64, v50

    .line 378
    .line 379
    add-double v70, v70, v72

    .line 380
    .line 381
    mul-double v72, v20, v38

    .line 382
    .line 383
    mul-double v82, v72, v50

    .line 384
    .line 385
    sub-double v70, v70, v82

    .line 386
    .line 387
    div-double v70, v70, v2

    .line 388
    .line 389
    mul-double v82, v86, v44

    .line 390
    .line 391
    mul-double v94, v84, v44

    .line 392
    .line 393
    sub-double v82, v82, v94

    .line 394
    .line 395
    mul-double v94, v26, v46

    .line 396
    .line 397
    add-double v82, v82, v94

    .line 398
    .line 399
    mul-double v94, v34, v46

    .line 400
    .line 401
    sub-double v82, v82, v94

    .line 402
    .line 403
    mul-double v22, v22, v28

    .line 404
    .line 405
    mul-double v28, v22, v50

    .line 406
    .line 407
    sub-double v82, v82, v28

    .line 408
    .line 409
    mul-double v20, v20, v30

    .line 410
    .line 411
    mul-double v50, v50, v20

    .line 412
    .line 413
    add-double v82, v82, v50

    .line 414
    .line 415
    div-double v82, v82, v2

    .line 416
    .line 417
    mul-double v84, v84, v36

    .line 418
    .line 419
    mul-double v86, v86, v36

    .line 420
    .line 421
    sub-double v84, v84, v86

    .line 422
    .line 423
    mul-double v26, v26, v38

    .line 424
    .line 425
    sub-double v84, v84, v26

    .line 426
    .line 427
    mul-double v34, v34, v38

    .line 428
    .line 429
    add-double v84, v84, v34

    .line 430
    .line 431
    mul-double v26, v22, v42

    .line 432
    .line 433
    add-double v84, v84, v26

    .line 434
    .line 435
    mul-double v42, v42, v20

    .line 436
    .line 437
    sub-double v84, v84, v42

    .line 438
    .line 439
    div-double v84, v84, v2

    .line 440
    .line 441
    mul-double v60, v60, v44

    .line 442
    .line 443
    mul-double v62, v62, v44

    .line 444
    .line 445
    sub-double v60, v60, v62

    .line 446
    .line 447
    mul-double v96, v96, v46

    .line 448
    .line 449
    sub-double v60, v60, v96

    .line 450
    .line 451
    mul-double v98, v98, v46

    .line 452
    .line 453
    add-double v60, v60, v98

    .line 454
    .line 455
    mul-double v0, v0, v48

    .line 456
    .line 457
    add-double v60, v60, v0

    .line 458
    .line 459
    mul-double v56, v56, v48

    .line 460
    .line 461
    sub-double v60, v60, v56

    .line 462
    .line 463
    div-double v60, v60, v2

    .line 464
    .line 465
    mul-double v76, v76, v44

    .line 466
    .line 467
    mul-double v74, v74, v44

    .line 468
    .line 469
    sub-double v76, v76, v74

    .line 470
    .line 471
    mul-double v102, v102, v46

    .line 472
    .line 473
    add-double v76, v76, v102

    .line 474
    .line 475
    mul-double v104, v104, v46

    .line 476
    .line 477
    sub-double v76, v76, v104

    .line 478
    .line 479
    mul-double v64, v64, v48

    .line 480
    .line 481
    sub-double v76, v76, v64

    .line 482
    .line 483
    mul-double v72, v72, v48

    .line 484
    .line 485
    add-double v76, v76, v72

    .line 486
    .line 487
    div-double v76, v76, v2

    .line 488
    .line 489
    mul-double v0, v88, v44

    .line 490
    .line 491
    mul-double v44, v44, v90

    .line 492
    .line 493
    sub-double v0, v0, v44

    .line 494
    .line 495
    mul-double v26, v24, v46

    .line 496
    .line 497
    sub-double v0, v0, v26

    .line 498
    .line 499
    mul-double v46, v46, v32

    .line 500
    .line 501
    add-double v0, v0, v46

    .line 502
    .line 503
    mul-double v26, v22, v48

    .line 504
    .line 505
    add-double v0, v0, v26

    .line 506
    .line 507
    mul-double v48, v48, v20

    .line 508
    .line 509
    sub-double v0, v0, v48

    .line 510
    div-double/2addr v0, v2

    .line 511
    .line 512
    mul-double v90, v90, v36

    .line 513
    .line 514
    mul-double v88, v88, v36

    .line 515
    .line 516
    sub-double v90, v90, v88

    .line 517
    .line 518
    mul-double v24, v24, v38

    .line 519
    .line 520
    add-double v90, v90, v24

    .line 521
    .line 522
    mul-double v32, v32, v38

    .line 523
    .line 524
    sub-double v90, v90, v32

    .line 525
    .line 526
    mul-double v22, v22, v40

    .line 527
    .line 528
    sub-double v90, v90, v22

    .line 529
    .line 530
    mul-double v20, v20, v40

    .line 531
    .line 532
    add-double v90, v90, v20

    .line 533
    .line 534
    div-double v90, v90, v2

    .line 535
    .line 536
    const/16 v2, 0x10

    .line 537
    .line 538
    new-array v2, v2, [D

    .line 539
    .line 540
    aput-wide v52, v2, v16

    .line 541
    .line 542
    aput-wide v66, v2, v15

    .line 543
    .line 544
    aput-wide v80, v2, v14

    .line 545
    .line 546
    aput-wide v92, v2, v13

    .line 547
    .line 548
    aput-wide v54, v2, v12

    .line 549
    .line 550
    aput-wide v68, v2, v11

    .line 551
    .line 552
    aput-wide v106, v2, v10

    .line 553
    .line 554
    aput-wide v78, v2, v9

    .line 555
    .line 556
    aput-wide v58, v2, v8

    .line 557
    .line 558
    aput-wide v70, v2, v7

    .line 559
    .line 560
    aput-wide v82, v2, v6

    .line 561
    .line 562
    aput-wide v84, v2, v5

    .line 563
    .line 564
    aput-wide v60, v2, v4

    .line 565
    .line 566
    aput-wide v76, v2, v18

    .line 567
    .line 568
    aput-wide v0, v2, v19

    .line 569
    .line 570
    aput-wide v90, v2, v17

    .line 571
    return-object v2
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
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
.end method

.method private final isZero(D)Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    .line 12
    move-result-wide p1

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide v2, 0x3ee4f8b588e368f1L    # 1.0E-5

    .line 18
    .line 19
    cmpg-double p1, p1, v2

    .line 20
    .line 21
    if-gez p1, :cond_1

    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_1
    return v1
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
.end method

.method public static final multiplyInto([D[D[D)V
    .locals 63
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    const-string v3, "out"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v3, "a"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    const-string v3, "b"

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    aget-wide v4, v1, v3

    .line 25
    const/4 v6, 0x1

    .line 26
    .line 27
    aget-wide v7, v1, v6

    .line 28
    const/4 v9, 0x2

    .line 29
    .line 30
    aget-wide v10, v1, v9

    .line 31
    const/4 v12, 0x3

    .line 32
    .line 33
    aget-wide v13, v1, v12

    .line 34
    const/4 v15, 0x4

    .line 35
    .line 36
    aget-wide v16, v1, v15

    .line 37
    .line 38
    const/16 v18, 0x5

    .line 39
    .line 40
    aget-wide v19, v1, v18

    .line 41
    .line 42
    const/16 v21, 0x6

    .line 43
    .line 44
    aget-wide v22, v1, v21

    .line 45
    .line 46
    const/16 v24, 0x7

    .line 47
    .line 48
    aget-wide v25, v1, v24

    .line 49
    .line 50
    const/16 v27, 0x8

    .line 51
    .line 52
    aget-wide v28, v1, v27

    .line 53
    .line 54
    const/16 v30, 0x9

    .line 55
    .line 56
    aget-wide v31, v1, v30

    .line 57
    .line 58
    const/16 v33, 0xa

    .line 59
    .line 60
    aget-wide v34, v1, v33

    .line 61
    .line 62
    const/16 v36, 0xb

    .line 63
    .line 64
    aget-wide v37, v1, v36

    .line 65
    .line 66
    const/16 v39, 0xc

    .line 67
    .line 68
    aget-wide v40, v1, v39

    .line 69
    .line 70
    const/16 v42, 0xd

    .line 71
    .line 72
    aget-wide v43, v1, v42

    .line 73
    .line 74
    const/16 v45, 0xe

    .line 75
    .line 76
    aget-wide v46, v1, v45

    .line 77
    .line 78
    const/16 v48, 0xf

    .line 79
    .line 80
    aget-wide v49, v1, v48

    .line 81
    .line 82
    aget-wide v51, v2, v3

    .line 83
    .line 84
    aget-wide v53, v2, v6

    .line 85
    .line 86
    aget-wide v55, v2, v9

    .line 87
    .line 88
    aget-wide v57, v2, v12

    .line 89
    .line 90
    mul-double v59, v51, v4

    .line 91
    .line 92
    mul-double v61, v53, v16

    .line 93
    .line 94
    add-double v59, v59, v61

    .line 95
    .line 96
    mul-double v61, v55, v28

    .line 97
    .line 98
    add-double v59, v59, v61

    .line 99
    .line 100
    mul-double v61, v57, v40

    .line 101
    .line 102
    add-double v59, v59, v61

    .line 103
    .line 104
    aput-wide v59, v0, v3

    .line 105
    .line 106
    mul-double v59, v51, v7

    .line 107
    .line 108
    mul-double v61, v53, v19

    .line 109
    .line 110
    add-double v59, v59, v61

    .line 111
    .line 112
    mul-double v61, v55, v31

    .line 113
    .line 114
    add-double v59, v59, v61

    .line 115
    .line 116
    mul-double v61, v57, v43

    .line 117
    .line 118
    add-double v59, v59, v61

    .line 119
    .line 120
    aput-wide v59, v0, v6

    .line 121
    .line 122
    mul-double v59, v51, v10

    .line 123
    .line 124
    mul-double v61, v53, v22

    .line 125
    .line 126
    add-double v59, v59, v61

    .line 127
    .line 128
    mul-double v61, v55, v34

    .line 129
    .line 130
    add-double v59, v59, v61

    .line 131
    .line 132
    mul-double v61, v57, v46

    .line 133
    .line 134
    add-double v59, v59, v61

    .line 135
    .line 136
    aput-wide v59, v0, v9

    .line 137
    .line 138
    mul-double v51, v51, v13

    .line 139
    .line 140
    mul-double v53, v53, v25

    .line 141
    .line 142
    add-double v51, v51, v53

    .line 143
    .line 144
    mul-double v55, v55, v37

    .line 145
    .line 146
    add-double v51, v51, v55

    .line 147
    .line 148
    mul-double v57, v57, v49

    .line 149
    .line 150
    add-double v51, v51, v57

    .line 151
    .line 152
    aput-wide v51, v0, v12

    .line 153
    .line 154
    aget-wide v51, v2, v15

    .line 155
    .line 156
    aget-wide v53, v2, v18

    .line 157
    .line 158
    aget-wide v55, v2, v21

    .line 159
    .line 160
    aget-wide v57, v2, v24

    .line 161
    .line 162
    mul-double v59, v51, v4

    .line 163
    .line 164
    mul-double v61, v53, v16

    .line 165
    .line 166
    add-double v59, v59, v61

    .line 167
    .line 168
    mul-double v61, v55, v28

    .line 169
    .line 170
    add-double v59, v59, v61

    .line 171
    .line 172
    mul-double v61, v57, v40

    .line 173
    .line 174
    add-double v59, v59, v61

    .line 175
    .line 176
    aput-wide v59, v0, v15

    .line 177
    .line 178
    mul-double v59, v51, v7

    .line 179
    .line 180
    mul-double v61, v53, v19

    .line 181
    .line 182
    add-double v59, v59, v61

    .line 183
    .line 184
    mul-double v61, v55, v31

    .line 185
    .line 186
    add-double v59, v59, v61

    .line 187
    .line 188
    mul-double v61, v57, v43

    .line 189
    .line 190
    add-double v59, v59, v61

    .line 191
    .line 192
    aput-wide v59, v0, v18

    .line 193
    .line 194
    mul-double v59, v51, v10

    .line 195
    .line 196
    mul-double v61, v53, v22

    .line 197
    .line 198
    add-double v59, v59, v61

    .line 199
    .line 200
    mul-double v61, v55, v34

    .line 201
    .line 202
    add-double v59, v59, v61

    .line 203
    .line 204
    mul-double v61, v57, v46

    .line 205
    .line 206
    add-double v59, v59, v61

    .line 207
    .line 208
    aput-wide v59, v0, v21

    .line 209
    .line 210
    mul-double v51, v51, v13

    .line 211
    .line 212
    mul-double v53, v53, v25

    .line 213
    .line 214
    add-double v51, v51, v53

    .line 215
    .line 216
    mul-double v55, v55, v37

    .line 217
    .line 218
    add-double v51, v51, v55

    .line 219
    .line 220
    mul-double v57, v57, v49

    .line 221
    .line 222
    add-double v51, v51, v57

    .line 223
    .line 224
    aput-wide v51, v0, v24

    .line 225
    .line 226
    aget-wide v51, v2, v27

    .line 227
    .line 228
    aget-wide v53, v2, v30

    .line 229
    .line 230
    aget-wide v55, v2, v33

    .line 231
    .line 232
    aget-wide v57, v2, v36

    .line 233
    .line 234
    mul-double v59, v51, v4

    .line 235
    .line 236
    mul-double v61, v53, v16

    .line 237
    .line 238
    add-double v59, v59, v61

    .line 239
    .line 240
    mul-double v61, v55, v28

    .line 241
    .line 242
    add-double v59, v59, v61

    .line 243
    .line 244
    mul-double v61, v57, v40

    .line 245
    .line 246
    add-double v59, v59, v61

    .line 247
    .line 248
    aput-wide v59, v0, v27

    .line 249
    .line 250
    mul-double v59, v51, v7

    .line 251
    .line 252
    mul-double v61, v53, v19

    .line 253
    .line 254
    add-double v59, v59, v61

    .line 255
    .line 256
    mul-double v61, v55, v31

    .line 257
    .line 258
    add-double v59, v59, v61

    .line 259
    .line 260
    mul-double v61, v57, v43

    .line 261
    .line 262
    add-double v59, v59, v61

    .line 263
    .line 264
    aput-wide v59, v0, v30

    .line 265
    .line 266
    mul-double v59, v51, v10

    .line 267
    .line 268
    mul-double v61, v53, v22

    .line 269
    .line 270
    add-double v59, v59, v61

    .line 271
    .line 272
    mul-double v61, v55, v34

    .line 273
    .line 274
    add-double v59, v59, v61

    .line 275
    .line 276
    mul-double v61, v57, v46

    .line 277
    .line 278
    add-double v59, v59, v61

    .line 279
    .line 280
    aput-wide v59, v0, v33

    .line 281
    .line 282
    mul-double v51, v51, v13

    .line 283
    .line 284
    mul-double v53, v53, v25

    .line 285
    .line 286
    add-double v51, v51, v53

    .line 287
    .line 288
    mul-double v55, v55, v37

    .line 289
    .line 290
    add-double v51, v51, v55

    .line 291
    .line 292
    mul-double v57, v57, v49

    .line 293
    .line 294
    add-double v51, v51, v57

    .line 295
    .line 296
    aput-wide v51, v0, v36

    .line 297
    .line 298
    aget-wide v51, v2, v39

    .line 299
    .line 300
    aget-wide v53, v2, v42

    .line 301
    .line 302
    aget-wide v55, v2, v45

    .line 303
    .line 304
    aget-wide v1, v2, v48

    .line 305
    .line 306
    mul-double v4, v4, v51

    .line 307
    .line 308
    mul-double v16, v16, v53

    .line 309
    .line 310
    add-double v4, v4, v16

    .line 311
    .line 312
    mul-double v28, v28, v55

    .line 313
    .line 314
    add-double v4, v4, v28

    .line 315
    .line 316
    mul-double v40, v40, v1

    .line 317
    .line 318
    add-double v4, v4, v40

    .line 319
    .line 320
    aput-wide v4, v0, v39

    .line 321
    .line 322
    mul-double v7, v7, v51

    .line 323
    .line 324
    mul-double v19, v19, v53

    .line 325
    .line 326
    add-double v7, v7, v19

    .line 327
    .line 328
    mul-double v31, v31, v55

    .line 329
    .line 330
    add-double v7, v7, v31

    .line 331
    .line 332
    mul-double v43, v43, v1

    .line 333
    .line 334
    add-double v7, v7, v43

    .line 335
    .line 336
    aput-wide v7, v0, v42

    .line 337
    .line 338
    mul-double v10, v10, v51

    .line 339
    .line 340
    mul-double v22, v22, v53

    .line 341
    .line 342
    add-double v10, v10, v22

    .line 343
    .line 344
    mul-double v34, v34, v55

    .line 345
    .line 346
    add-double v10, v10, v34

    .line 347
    .line 348
    mul-double v46, v46, v1

    .line 349
    .line 350
    add-double v10, v10, v46

    .line 351
    .line 352
    aput-wide v10, v0, v45

    .line 353
    .line 354
    mul-double v51, v51, v13

    .line 355
    .line 356
    mul-double v53, v53, v25

    .line 357
    .line 358
    add-double v51, v51, v53

    .line 359
    .line 360
    mul-double v55, v55, v37

    .line 361
    .line 362
    add-double v51, v51, v55

    .line 363
    .line 364
    mul-double v1, v1, v49

    .line 365
    .line 366
    add-double v51, v51, v1

    .line 367
    .line 368
    aput-wide v51, v0, v48

    .line 369
    return-void
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
.end method

.method public static final multiplyVectorByMatrix([D[D[D)V
    .locals 19
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    .line 9
    const-string/jumbo v3, "v"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string v3, "m"

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string/jumbo v3, "result"

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    aget-wide v4, v0, v3

    .line 27
    const/4 v6, 0x1

    .line 28
    .line 29
    aget-wide v7, v0, v6

    .line 30
    const/4 v9, 0x2

    .line 31
    .line 32
    aget-wide v10, v0, v9

    .line 33
    const/4 v12, 0x3

    .line 34
    .line 35
    aget-wide v13, v0, v12

    .line 36
    .line 37
    aget-wide v15, v1, v3

    .line 38
    mul-double/2addr v15, v4

    .line 39
    const/4 v0, 0x4

    .line 40
    .line 41
    aget-wide v17, v1, v0

    .line 42
    .line 43
    mul-double v17, v17, v7

    .line 44
    .line 45
    add-double v15, v15, v17

    .line 46
    .line 47
    const/16 v0, 0x8

    .line 48
    .line 49
    aget-wide v17, v1, v0

    .line 50
    .line 51
    mul-double v17, v17, v10

    .line 52
    .line 53
    add-double v15, v15, v17

    .line 54
    .line 55
    const/16 v0, 0xc

    .line 56
    .line 57
    aget-wide v17, v1, v0

    .line 58
    .line 59
    mul-double v17, v17, v13

    .line 60
    .line 61
    add-double v15, v15, v17

    .line 62
    .line 63
    aput-wide v15, v2, v3

    .line 64
    .line 65
    aget-wide v15, v1, v6

    .line 66
    mul-double/2addr v15, v4

    .line 67
    const/4 v0, 0x5

    .line 68
    .line 69
    aget-wide v17, v1, v0

    .line 70
    .line 71
    mul-double v17, v17, v7

    .line 72
    .line 73
    add-double v15, v15, v17

    .line 74
    .line 75
    const/16 v0, 0x9

    .line 76
    .line 77
    aget-wide v17, v1, v0

    .line 78
    .line 79
    mul-double v17, v17, v10

    .line 80
    .line 81
    add-double v15, v15, v17

    .line 82
    .line 83
    const/16 v0, 0xd

    .line 84
    .line 85
    aget-wide v17, v1, v0

    .line 86
    .line 87
    mul-double v17, v17, v13

    .line 88
    .line 89
    add-double v15, v15, v17

    .line 90
    .line 91
    aput-wide v15, v2, v6

    .line 92
    .line 93
    aget-wide v15, v1, v9

    .line 94
    mul-double/2addr v15, v4

    .line 95
    const/4 v0, 0x6

    .line 96
    .line 97
    aget-wide v17, v1, v0

    .line 98
    .line 99
    mul-double v17, v17, v7

    .line 100
    .line 101
    add-double v15, v15, v17

    .line 102
    .line 103
    const/16 v0, 0xa

    .line 104
    .line 105
    aget-wide v17, v1, v0

    .line 106
    .line 107
    mul-double v17, v17, v10

    .line 108
    .line 109
    add-double v15, v15, v17

    .line 110
    .line 111
    const/16 v0, 0xe

    .line 112
    .line 113
    aget-wide v17, v1, v0

    .line 114
    .line 115
    mul-double v17, v17, v13

    .line 116
    .line 117
    add-double v15, v15, v17

    .line 118
    .line 119
    aput-wide v15, v2, v9

    .line 120
    .line 121
    aget-wide v15, v1, v12

    .line 122
    mul-double/2addr v4, v15

    .line 123
    const/4 v0, 0x7

    .line 124
    .line 125
    aget-wide v15, v1, v0

    .line 126
    mul-double/2addr v7, v15

    .line 127
    add-double/2addr v4, v7

    .line 128
    .line 129
    const/16 v0, 0xb

    .line 130
    .line 131
    aget-wide v6, v1, v0

    .line 132
    mul-double/2addr v10, v6

    .line 133
    add-double/2addr v4, v10

    .line 134
    .line 135
    const/16 v0, 0xf

    .line 136
    .line 137
    aget-wide v0, v1, v0

    .line 138
    mul-double/2addr v13, v0

    .line 139
    add-double/2addr v4, v13

    .line 140
    .line 141
    aput-wide v4, v2, v12

    .line 142
    return-void
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
.end method

.method public static final resetIdentityMatrix([D)V
    .locals 3
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "matrix"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v0, 0xe

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    aput-wide v1, p0, v0

    .line 12
    .line 13
    const/16 v0, 0xd

    .line 14
    .line 15
    aput-wide v1, p0, v0

    .line 16
    .line 17
    const/16 v0, 0xc

    .line 18
    .line 19
    aput-wide v1, p0, v0

    .line 20
    .line 21
    const/16 v0, 0xb

    .line 22
    .line 23
    aput-wide v1, p0, v0

    .line 24
    .line 25
    const/16 v0, 0x9

    .line 26
    .line 27
    aput-wide v1, p0, v0

    .line 28
    .line 29
    const/16 v0, 0x8

    .line 30
    .line 31
    aput-wide v1, p0, v0

    .line 32
    const/4 v0, 0x7

    .line 33
    .line 34
    aput-wide v1, p0, v0

    .line 35
    const/4 v0, 0x6

    .line 36
    .line 37
    aput-wide v1, p0, v0

    .line 38
    const/4 v0, 0x4

    .line 39
    .line 40
    aput-wide v1, p0, v0

    .line 41
    const/4 v0, 0x3

    .line 42
    .line 43
    aput-wide v1, p0, v0

    .line 44
    const/4 v0, 0x2

    .line 45
    .line 46
    aput-wide v1, p0, v0

    .line 47
    const/4 v0, 0x1

    .line 48
    .line 49
    aput-wide v1, p0, v0

    .line 50
    .line 51
    const/16 v0, 0xf

    .line 52
    .line 53
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 54
    .line 55
    aput-wide v1, p0, v0

    .line 56
    .line 57
    const/16 v0, 0xa

    .line 58
    .line 59
    aput-wide v1, p0, v0

    .line 60
    const/4 v0, 0x5

    .line 61
    .line 62
    aput-wide v1, p0, v0

    .line 63
    const/4 v0, 0x0

    .line 64
    .line 65
    aput-wide v1, p0, v0

    .line 66
    return-void
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

.method public static final roundTo3Places(D)D
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    .line 3
    .line 4
    .line 5
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 6
    mul-double/2addr p0, v0

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 10
    move-result-wide p0

    .line 11
    long-to-double p0, p0

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide v0, 0x3f50624dd2f1a9fcL    # 0.001

    .line 17
    mul-double/2addr p0, v0

    .line 18
    return-wide p0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static final transpose([D)[D
    .locals 49
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "m"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    aget-wide v2, v0, v1

    .line 11
    const/4 v4, 0x4

    .line 12
    .line 13
    aget-wide v5, v0, v4

    .line 14
    .line 15
    const/16 v7, 0x8

    .line 16
    .line 17
    aget-wide v8, v0, v7

    .line 18
    .line 19
    const/16 v10, 0xc

    .line 20
    .line 21
    aget-wide v11, v0, v10

    .line 22
    const/4 v13, 0x1

    .line 23
    .line 24
    aget-wide v14, v0, v13

    .line 25
    .line 26
    const/16 v16, 0x5

    .line 27
    .line 28
    aget-wide v17, v0, v16

    .line 29
    .line 30
    const/16 v19, 0x9

    .line 31
    .line 32
    aget-wide v20, v0, v19

    .line 33
    .line 34
    const/16 v22, 0xd

    .line 35
    .line 36
    aget-wide v23, v0, v22

    .line 37
    .line 38
    const/16 v25, 0x2

    .line 39
    .line 40
    aget-wide v26, v0, v25

    .line 41
    .line 42
    const/16 v28, 0x6

    .line 43
    .line 44
    aget-wide v29, v0, v28

    .line 45
    .line 46
    const/16 v31, 0xa

    .line 47
    .line 48
    aget-wide v32, v0, v31

    .line 49
    .line 50
    const/16 v34, 0xe

    .line 51
    .line 52
    aget-wide v35, v0, v34

    .line 53
    .line 54
    const/16 v37, 0x3

    .line 55
    .line 56
    aget-wide v38, v0, v37

    .line 57
    .line 58
    const/16 v40, 0x7

    .line 59
    .line 60
    aget-wide v41, v0, v40

    .line 61
    .line 62
    const/16 v43, 0xb

    .line 63
    .line 64
    aget-wide v44, v0, v43

    .line 65
    .line 66
    const/16 v46, 0xf

    .line 67
    .line 68
    aget-wide v47, v0, v46

    .line 69
    .line 70
    const/16 v0, 0x10

    .line 71
    .line 72
    new-array v0, v0, [D

    .line 73
    .line 74
    aput-wide v2, v0, v1

    .line 75
    .line 76
    aput-wide v5, v0, v13

    .line 77
    .line 78
    aput-wide v8, v0, v25

    .line 79
    .line 80
    aput-wide v11, v0, v37

    .line 81
    .line 82
    aput-wide v14, v0, v4

    .line 83
    .line 84
    aput-wide v17, v0, v16

    .line 85
    .line 86
    aput-wide v20, v0, v28

    .line 87
    .line 88
    aput-wide v23, v0, v40

    .line 89
    .line 90
    aput-wide v26, v0, v7

    .line 91
    .line 92
    aput-wide v29, v0, v19

    .line 93
    .line 94
    aput-wide v32, v0, v31

    .line 95
    .line 96
    aput-wide v35, v0, v43

    .line 97
    .line 98
    aput-wide v38, v0, v10

    .line 99
    .line 100
    aput-wide v41, v0, v22

    .line 101
    .line 102
    aput-wide v44, v0, v34

    .line 103
    .line 104
    aput-wide v47, v0, v46

    .line 105
    return-object v0
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
.end method

.method public static final v3Combine([D[DDD)[D
    .locals 9
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "a"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "b"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    aget-wide v1, p0, v0

    .line 14
    mul-double/2addr v1, p2

    .line 15
    .line 16
    aget-wide v3, p1, v0

    .line 17
    mul-double/2addr v3, p4

    .line 18
    add-double/2addr v1, v3

    .line 19
    const/4 v3, 0x1

    .line 20
    .line 21
    aget-wide v4, p0, v3

    .line 22
    mul-double/2addr v4, p2

    .line 23
    .line 24
    aget-wide v6, p1, v3

    .line 25
    mul-double/2addr v6, p4

    .line 26
    add-double/2addr v4, v6

    .line 27
    const/4 v6, 0x2

    .line 28
    .line 29
    aget-wide v7, p0, v6

    .line 30
    mul-double/2addr p2, v7

    .line 31
    .line 32
    aget-wide p0, p1, v6

    .line 33
    mul-double/2addr p4, p0

    .line 34
    add-double/2addr p2, p4

    .line 35
    const/4 p0, 0x3

    .line 36
    .line 37
    new-array p0, p0, [D

    .line 38
    .line 39
    aput-wide v1, p0, v0

    .line 40
    .line 41
    aput-wide v4, p0, v3

    .line 42
    .line 43
    aput-wide p2, p0, v6

    .line 44
    return-object p0
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
.end method

.method public static final v3Cross([D[D)[D
    .locals 19
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "a"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v2, "b"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    aget-wide v3, v0, v2

    .line 18
    const/4 v5, 0x2

    .line 19
    .line 20
    aget-wide v6, v1, v5

    .line 21
    .line 22
    mul-double v8, v3, v6

    .line 23
    .line 24
    aget-wide v10, v0, v5

    .line 25
    .line 26
    aget-wide v12, v1, v2

    .line 27
    .line 28
    mul-double v14, v10, v12

    .line 29
    sub-double/2addr v8, v14

    .line 30
    const/4 v14, 0x0

    .line 31
    .line 32
    aget-wide v15, v1, v14

    .line 33
    mul-double/2addr v10, v15

    .line 34
    .line 35
    aget-wide v17, v0, v14

    .line 36
    .line 37
    mul-double v6, v6, v17

    .line 38
    sub-double/2addr v10, v6

    .line 39
    .line 40
    mul-double v17, v17, v12

    .line 41
    mul-double/2addr v3, v15

    .line 42
    .line 43
    sub-double v17, v17, v3

    .line 44
    const/4 v0, 0x3

    .line 45
    .line 46
    new-array v0, v0, [D

    .line 47
    .line 48
    aput-wide v8, v0, v14

    .line 49
    .line 50
    aput-wide v10, v0, v2

    .line 51
    .line 52
    aput-wide v17, v0, v5

    .line 53
    return-object v0
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
.end method

.method public static final v3Dot([D[D)D
    .locals 7
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "a"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "b"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    aget-wide v1, p0, v0

    .line 14
    .line 15
    aget-wide v3, p1, v0

    .line 16
    mul-double/2addr v1, v3

    .line 17
    const/4 v0, 0x1

    .line 18
    .line 19
    aget-wide v3, p0, v0

    .line 20
    .line 21
    aget-wide v5, p1, v0

    .line 22
    mul-double/2addr v3, v5

    .line 23
    add-double/2addr v1, v3

    .line 24
    const/4 v0, 0x2

    .line 25
    .line 26
    aget-wide v3, p0, v0

    .line 27
    .line 28
    aget-wide p0, p1, v0

    .line 29
    mul-double/2addr v3, p0

    .line 30
    add-double/2addr v1, v3

    .line 31
    return-wide v1
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

.method public static final v3Length([D)D
    .locals 4
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "a"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    aget-wide v0, p0, v0

    .line 9
    mul-double/2addr v0, v0

    .line 10
    const/4 v2, 0x1

    .line 11
    .line 12
    aget-wide v2, p0, v2

    .line 13
    mul-double/2addr v2, v2

    .line 14
    add-double/2addr v0, v2

    .line 15
    const/4 v2, 0x2

    .line 16
    .line 17
    aget-wide v2, p0, v2

    .line 18
    mul-double/2addr v2, v2

    .line 19
    add-double/2addr v0, v2

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 23
    move-result-wide v0

    .line 24
    return-wide v0
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
.end method

.method public static final v3Normalize([DD)[D
    .locals 9
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    const-string/jumbo v2, "vector"

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    const/4 v2, 0x1

    .line 10
    int-to-double v3, v2

    .line 11
    .line 12
    sget-object v5, Lcom/facebook/react/uimanager/MatrixMathHelper;->INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;

    .line 13
    .line 14
    .line 15
    invoke-direct {v5, p1, p2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 16
    move-result v5

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 22
    move-result-wide p1

    .line 23
    :cond_0
    div-double/2addr v3, p1

    .line 24
    .line 25
    aget-wide p1, p0, v1

    .line 26
    mul-double/2addr p1, v3

    .line 27
    .line 28
    aget-wide v5, p0, v2

    .line 29
    mul-double/2addr v5, v3

    .line 30
    .line 31
    aget-wide v7, p0, v0

    .line 32
    mul-double/2addr v7, v3

    .line 33
    const/4 p0, 0x3

    .line 34
    .line 35
    new-array p0, p0, [D

    .line 36
    .line 37
    aput-wide p1, p0, v1

    .line 38
    .line 39
    aput-wide v5, p0, v2

    .line 40
    .line 41
    aput-wide v7, p0, v0

    .line 42
    return-object p0
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public final applyScaleZ([DD)V
    .locals 1
    .param p1    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "m"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v0, 0xa

    .line 8
    .line 9
    aput-wide p2, p1, v0

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
