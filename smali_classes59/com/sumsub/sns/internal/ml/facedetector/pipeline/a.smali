.class public final Lcom/sumsub/sns/internal/ml/facedetector/pipeline/a;
.super Lcom/sumsub/sns/internal/ml/core/pipeline/core/a;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/ml/core/pipeline/core/a;-><init>()V

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
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v0, p1

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 7
    move-result v3

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 11
    move-result v7

    .line 12
    .line 13
    mul-int p1, v3, v7

    .line 14
    .line 15
    new-array v1, p1, [I

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    move v6, v3

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 23
    .line 24
    mul-int/lit8 v0, p1, 0x3

    .line 25
    .line 26
    new-array v0, v0, [F

    .line 27
    move v4, v2

    .line 28
    :goto_0
    const/4 v5, 0x3

    .line 29
    .line 30
    if-ge v2, p1, :cond_0

    .line 31
    .line 32
    aget v6, v1, v2

    .line 33
    .line 34
    add-int/lit8 v8, v4, 0x1

    .line 35
    .line 36
    shr-int/lit8 v9, v6, 0x10

    .line 37
    .line 38
    and-int/lit16 v9, v9, 0xff

    .line 39
    int-to-float v9, v9

    .line 40
    .line 41
    const/high16 v10, 0x42ff0000    # 127.5f

    .line 42
    sub-float/2addr v9, v10

    .line 43
    div-float/2addr v9, v10

    .line 44
    .line 45
    aput v9, v0, v4

    .line 46
    .line 47
    add-int/lit8 v9, v4, 0x2

    .line 48
    .line 49
    shr-int/lit8 v11, v6, 0x8

    .line 50
    .line 51
    and-int/lit16 v11, v11, 0xff

    .line 52
    int-to-float v11, v11

    .line 53
    sub-float/2addr v11, v10

    .line 54
    div-float/2addr v11, v10

    .line 55
    .line 56
    aput v11, v0, v8

    .line 57
    add-int/2addr v4, v5

    .line 58
    .line 59
    and-int/lit16 v5, v6, 0xff

    .line 60
    int-to-float v5, v5

    .line 61
    sub-float/2addr v5, v10

    .line 62
    div-float/2addr v5, v10

    .line 63
    .line 64
    aput v5, v0, v9

    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :cond_0
    new-instance p1, Lcom/sumsub/sns/internal/ml/core/buffer/a;

    .line 70
    .line 71
    .line 72
    filled-new-array {v7, v3, v5}, [I

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-direct {p1, v0, v1}, Lcom/sumsub/sns/internal/ml/core/buffer/a;-><init>([F[I)V

    .line 77
    return-object p1
    .line 78
    .line 79
    .line 80
    .line 81
.end method
