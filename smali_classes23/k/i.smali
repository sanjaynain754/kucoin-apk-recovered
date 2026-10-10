.class public Lk/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I

.field public static b:I

.field public static c:I

.field public static d:I

.field public static e:I

.field public static f:F

.field public static g:F

.field public static h:F

.field public static i:F

.field public static j:F

.field public static k:F

.field public static l:F

.field public static m:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public static a(Landroid/content/Context;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    iget v0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    sput v0, Lk/i;->g:F

    .line 13
    .line 14
    const/high16 v1, 0x420c0000    # 35.0f

    .line 15
    mul-float/2addr v1, v0

    .line 16
    float-to-int v1, v1

    .line 17
    .line 18
    sput v1, Lk/i;->a:I

    .line 19
    .line 20
    iget v1, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 21
    .line 22
    sput v1, Lk/i;->d:I

    .line 23
    .line 24
    iget v2, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 25
    .line 26
    sput v2, Lk/i;->e:I

    .line 27
    .line 28
    sput v1, Lk/i;->b:I

    .line 29
    .line 30
    sput v2, Lk/i;->c:I

    .line 31
    .line 32
    iget p0, p0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 33
    int-to-float p0, p0

    .line 34
    .line 35
    sput p0, Lk/i;->f:F

    .line 36
    .line 37
    const/high16 p0, 0x41f00000    # 30.0f

    .line 38
    mul-float/2addr p0, v0

    .line 39
    .line 40
    sput p0, Lk/i;->j:F

    .line 41
    .line 42
    sput p0, Lk/i;->k:F

    .line 43
    .line 44
    const/high16 v3, 0x42480000    # 50.0f

    .line 45
    mul-float/2addr v3, v0

    .line 46
    .line 47
    sput v3, Lk/i;->l:F

    .line 48
    .line 49
    const/high16 v4, 0x42200000    # 40.0f

    .line 50
    mul-float/2addr v0, v4

    .line 51
    .line 52
    sput v0, Lk/i;->m:F

    .line 53
    int-to-float v1, v1

    .line 54
    sub-float/2addr v1, p0

    .line 55
    sub-float/2addr v1, p0

    .line 56
    .line 57
    sput v1, Lk/i;->h:F

    .line 58
    int-to-float p0, v2

    .line 59
    sub-float/2addr p0, v3

    .line 60
    sub-float/2addr p0, v0

    .line 61
    .line 62
    sput p0, Lk/i;->i:F

    .line 63
    return-void
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
