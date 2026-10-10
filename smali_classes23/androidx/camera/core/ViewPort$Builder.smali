.class public final Landroidx/camera/core/ViewPort$Builder;
.super Ljava/lang/Object;
.source "ViewPort.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/ViewPort;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# static fields
.field private static final DEFAULT_LAYOUT_DIRECTION:I = 0x0

.field private static final DEFAULT_SCALE_TYPE:I = 0x1


# instance fields
.field private final mAspectRatio:Landroid/util/Rational;

.field private mLayoutDirection:I

.field private final mRotation:I

.field private mScaleType:I


# direct methods
.method public constructor <init>(Landroid/util/Rational;I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Landroidx/camera/core/ViewPort$Builder;->mScaleType:I

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput v0, p0, Landroidx/camera/core/ViewPort$Builder;->mLayoutDirection:I

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/camera/core/ViewPort$Builder;->mAspectRatio:Landroid/util/Rational;

    .line 12
    .line 13
    iput p2, p0, Landroidx/camera/core/ViewPort$Builder;->mRotation:I

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
.end method


# virtual methods
.method public build()Landroidx/camera/core/ViewPort;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/ViewPort$Builder;->mAspectRatio:Landroid/util/Rational;

    .line 3
    .line 4
    const-string v1, "The crop aspect ratio must be set."

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v0, Landroidx/camera/core/ViewPort;

    .line 10
    .line 11
    iget v1, p0, Landroidx/camera/core/ViewPort$Builder;->mScaleType:I

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/camera/core/ViewPort$Builder;->mAspectRatio:Landroid/util/Rational;

    .line 14
    .line 15
    iget v3, p0, Landroidx/camera/core/ViewPort$Builder;->mRotation:I

    .line 16
    .line 17
    iget v4, p0, Landroidx/camera/core/ViewPort$Builder;->mLayoutDirection:I

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/camera/core/ViewPort;-><init>(ILandroid/util/Rational;II)V

    .line 21
    return-object v0
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
.end method

.method public setLayoutDirection(I)Landroidx/camera/core/ViewPort$Builder;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/camera/core/ViewPort$Builder;->mLayoutDirection:I

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
    .line 24
.end method

.method public setScaleType(I)Landroidx/camera/core/ViewPort$Builder;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/camera/core/ViewPort$Builder;->mScaleType:I

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
    .line 24
.end method
