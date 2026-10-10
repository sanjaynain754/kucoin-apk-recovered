.class public final Lcom/jumio/commons/camera/FrameKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0010\u001a\u000c\u0010\u0011\u001a\u00020\u0012*\u00020\u0012H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u000cX\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "FRAME_DATA_DEFAULT_SIZE_WIDTH",
        "",
        "FRAME_DATA_DEFAULT_SIZE_HEIGHT",
        "FRAME_DATA_DEFAULT_ROTATION",
        "FRAME_DATA_DEFAULT_ISO",
        "FRAME_DATA_DEFAULT_SHUTTER_SPEED",
        "",
        "FRAME_DATA_DEFAULT_LENS_POSITION",
        "",
        "FRAME_DATA_DEFAULT_APERTURE",
        "FRAME_DATA_DEFAULT_ORIENTATION",
        "FRAME_DATA_DEFAULT_IS_PORTRAIT",
        "",
        "FRAME_DATA_DEFAULT_IMAGE_FORMAT",
        "toFloatArray",
        "",
        "Landroid/hardware/camera2/params/ColorSpaceTransform;",
        "deepCopy",
        "",
        "jumio-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFrame.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Frame.kt\ncom/jumio/commons/camera/FrameKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,214:1\n13467#2,3:215\n*S KotlinDebug\n*F\n+ 1 Frame.kt\ncom/jumio/commons/camera/FrameKt\n*L\n201#1:215,3\n*E\n"
    }
.end annotation


# static fields
.field public static final FRAME_DATA_DEFAULT_APERTURE:F = 0.0f

.field public static final FRAME_DATA_DEFAULT_IMAGE_FORMAT:I = 0x11

.field public static final FRAME_DATA_DEFAULT_ISO:I

.field public static final FRAME_DATA_DEFAULT_IS_PORTRAIT:Z

.field public static final FRAME_DATA_DEFAULT_LENS_POSITION:F

.field public static final FRAME_DATA_DEFAULT_ORIENTATION:I

.field public static final FRAME_DATA_DEFAULT_ROTATION:I

.field public static final FRAME_DATA_DEFAULT_SHUTTER_SPEED:J

.field public static final FRAME_DATA_DEFAULT_SIZE_HEIGHT:I

.field public static final FRAME_DATA_DEFAULT_SIZE_WIDTH:I


# direct methods
.method public static final access$deepCopy([B)[B
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-array p0, v1, [B

    .line 7
    return-object p0

    .line 8
    :cond_0
    array-length v0, p0

    .line 9
    .line 10
    new-array v2, v0, [B

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    return-object v2
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

.method public static final toFloatArray(Landroid/hardware/camera2/params/ColorSpaceTransform;)[F
    .locals 7
    .param p0    # Landroid/hardware/camera2/params/ColorSpaceTransform;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v0, 0x9

    .line 8
    .line 9
    new-array v1, v0, [F

    .line 10
    .line 11
    new-array v2, v0, [Landroid/util/Rational;

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    .line 15
    :goto_0
    if-ge v4, v0, :cond_0

    .line 16
    .line 17
    sget-object v5, Landroid/util/Rational;->ZERO:Landroid/util/Rational;

    .line 18
    .line 19
    const-string v6, "ZERO"

    .line 20
    .line 21
    .line 22
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    aput-object v5, v2, v4

    .line 25
    .line 26
    add-int/lit8 v4, v4, 0x1

    .line 27
    goto :goto_0

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0, v2, v3}, Landroid/hardware/camera2/params/ColorSpaceTransform;->copyElements([Landroid/util/Rational;I)V

    .line 31
    move p0, v3

    .line 32
    .line 33
    :goto_1
    if-ge v3, v0, :cond_1

    .line 34
    .line 35
    aget-object v4, v2, v3

    .line 36
    .line 37
    add-int/lit8 v5, p0, 0x1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/util/Rational;->floatValue()F

    .line 41
    move-result v4

    .line 42
    .line 43
    aput v4, v1, p0

    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    move p0, v5

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    return-object v1
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
