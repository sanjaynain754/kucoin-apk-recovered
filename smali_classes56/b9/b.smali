.class public Lb9/b;
.super Ljava/lang/Object;
.source "BarcodeEncoder.java"


# direct methods
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


# virtual methods
.method public a(Lcom/google/zxing/common/BitMatrix;)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/zxing/common/BitMatrix;->getWidth()I

    .line 4
    move-result v3

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/zxing/common/BitMatrix;->getHeight()I

    .line 8
    move-result v7

    .line 9
    .line 10
    mul-int v0, v3, v7

    .line 11
    .line 12
    new-array v1, v0, [I

    .line 13
    const/4 v0, 0x0

    .line 14
    move v2, v0

    .line 15
    .line 16
    :goto_0
    if-ge v2, v7, :cond_2

    .line 17
    .line 18
    mul-int v4, v2, v3

    .line 19
    move v5, v0

    .line 20
    .line 21
    :goto_1
    if-ge v5, v3, :cond_1

    .line 22
    .line 23
    add-int v6, v4, v5

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v5, v2}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    .line 27
    move-result v8

    .line 28
    .line 29
    if-eqz v8, :cond_0

    .line 30
    .line 31
    const/high16 v8, -0x1000000

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    const/4 v8, -0x1

    .line 34
    .line 35
    :goto_2
    aput v8, v1, v6

    .line 36
    .line 37
    add-int/lit8 v5, v5, 0x1

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_2
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 44
    .line 45
    .line 46
    invoke-static {v3, v7, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 47
    move-result-object v0

    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v2, 0x0

    .line 51
    move v6, v3

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 55
    return-object v0
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
