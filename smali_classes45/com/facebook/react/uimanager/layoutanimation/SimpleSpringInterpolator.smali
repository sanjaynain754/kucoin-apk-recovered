.class public final Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;
.super Ljava/lang/Object;
.source "SimpleSpringInterpolator.kt"

# interfaces
.implements Landroid/view/animation/Interpolator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0013\u0008\u0017\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;",
        "Landroid/view/animation/Interpolator;",
        "springDamping",
        "",
        "<init>",
        "(F)V",
        "_springDamping",
        "getInterpolation",
        "input",
        "Companion",
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
.field public static final Companion:Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final FACTOR:F = 0.5f

.field public static final PARAM_SPRING_DAMPING:Ljava/lang/String; = "springDamping"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final _springDamping:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;->Companion:Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator$Companion;

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
.end method

.method public constructor <init>()V
    .locals 3
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;->_springDamping:F

    return-void
.end method

.method public synthetic constructor <init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/high16 p1, 0x3f000000    # 0.5f

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;-><init>(F)V

    return-void
.end method

.method public static final getSpringDamping(Lcom/facebook/react/bridge/ReadableMap;)F
    .locals 1
    .param p0    # Lcom/facebook/react/bridge/ReadableMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;->Companion:Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator$Companion;->getSpringDamping(Lcom/facebook/react/bridge/ReadableMap;)F

    .line 6
    move-result p0

    .line 7
    return p0
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


# virtual methods
.method public getInterpolation(F)F
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    int-to-double v0, v0

    .line 3
    .line 4
    const/16 v2, -0xa

    .line 5
    int-to-float v2, v2

    .line 6
    mul-float/2addr v2, p1

    .line 7
    float-to-double v2, v2

    .line 8
    .line 9
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 10
    .line 11
    .line 12
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 13
    move-result-wide v2

    .line 14
    .line 15
    iget v4, p0, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;->_springDamping:F

    .line 16
    const/4 v5, 0x4

    .line 17
    int-to-float v5, v5

    .line 18
    .line 19
    div-float v5, v4, v5

    .line 20
    sub-float/2addr p1, v5

    .line 21
    float-to-double v5, p1

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide v7, 0x400921fb54442d18L    # Math.PI

    .line 27
    mul-double/2addr v5, v7

    .line 28
    const/4 p1, 0x2

    .line 29
    int-to-double v7, p1

    .line 30
    mul-double/2addr v5, v7

    .line 31
    float-to-double v7, v4

    .line 32
    div-double/2addr v5, v7

    .line 33
    .line 34
    .line 35
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 36
    move-result-wide v4

    .line 37
    mul-double/2addr v2, v4

    .line 38
    add-double/2addr v0, v2

    .line 39
    double-to-float p1, v0

    .line 40
    return p1
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
