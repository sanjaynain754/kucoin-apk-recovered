.class public final Lcom/jumio/core/overlay/Overlay$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/core/overlay/Overlay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\t\u001a\u00020\nH\u0000\u00a2\u0006\u0002\u0008\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/jumio/core/overlay/Overlay$Companion;",
        "",
        "<init>",
        "()V",
        "BORDER_STROKE_WIDTH_IN_DP",
        "",
        "DETECTED_BORDER_STROKE_WIDTH_IN_DP",
        "getCustomizations",
        "",
        "context",
        "Lcom/jumio/core/MobileContext;",
        "getCustomizations$jumio_core_release",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final BORDER_STROKE_WIDTH_IN_DP:I = 0x2

.field public static final DETECTED_BORDER_STROKE_WIDTH_IN_DP:I = 0x6

.field public static final synthetic a:Lcom/jumio/core/overlay/Overlay$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/overlay/Overlay$Companion;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/jumio/core/overlay/Overlay$Companion;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/jumio/core/overlay/Overlay$Companion;->a:Lcom/jumio/core/overlay/Overlay$Companion;

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
.end method

.method public static final a(Landroid/content/res/TypedArray;I)I
    .locals 1

    .line 1
    .line 2
    const-string v0, "typedArray"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, -0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 10
    move-result p0

    .line 11
    return p0
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


# virtual methods
.method public final getCustomizations$jumio_core_release(Lcom/jumio/core/MobileContext;)Ljava/util/Map;
    .locals 11
    .param p1    # Lcom/jumio/core/MobileContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/MobileContext;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
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
    sget v0, Lcom/jumio/core/R$style;->Jumio_Overlay_Customization:I

    .line 8
    .line 9
    sget v1, Lcom/jumio/core/R$attr;->jumio_overlay_customization:I

    .line 10
    .line 11
    sget v2, Lcom/jumio/core/R$attr;->jumio_scanOverlay:I

    .line 12
    .line 13
    sget v3, Lcom/jumio/core/R$attr;->jumio_scanOverlayFill:I

    .line 14
    .line 15
    sget v4, Lcom/jumio/core/R$attr;->jumio_scanOverlayTransparent:I

    .line 16
    .line 17
    sget v5, Lcom/jumio/core/R$attr;->jumio_scanBackground:I

    .line 18
    .line 19
    sget v6, Lcom/jumio/core/R$attr;->jumio_scanOverlay_livenessStroke:I

    .line 20
    .line 21
    sget v7, Lcom/jumio/core/R$attr;->jumio_scanOverlay_livenessStrokeAnimation:I

    .line 22
    .line 23
    sget v8, Lcom/jumio/core/R$attr;->jumio_scanOverlay_livenessStrokeAnimationCompleted:I

    .line 24
    .line 25
    sget v9, Lcom/jumio/core/R$attr;->jumio_id_aligned_stroke:I

    .line 26
    .line 27
    sget v10, Lcom/jumio/core/R$attr;->jumio_id_unaligned_stroke:I

    .line 28
    .line 29
    .line 30
    filled-new-array/range {v2 .. v10}, [I

    .line 31
    move-result-object v2

    .line 32
    .line 33
    new-instance v3, Lcom/jumio/core/overlay/a;

    .line 34
    .line 35
    .line 36
    invoke-direct {v3}, Lcom/jumio/core/overlay/a;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/jumio/core/MobileContext;->getCustomizations(II[ILkotlin/jvm/functions/Function2;)Ljava/util/Map;

    .line 40
    move-result-object p1

    .line 41
    return-object p1
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
.end method
