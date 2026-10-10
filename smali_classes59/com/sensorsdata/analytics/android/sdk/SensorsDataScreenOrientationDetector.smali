.class public Lcom/sensorsdata/analytics/android/sdk/SensorsDataScreenOrientationDetector;
.super Landroid/view/OrientationEventListener;
.source "SensorsDataScreenOrientationDetector.java"


# instance fields
.field private mCurrentOrientation:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

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
.end method


# virtual methods
.method public getOrientation()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/sensorsdata/analytics/android/sdk/SensorsDataScreenOrientationDetector;->mCurrentOrientation:I

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    const/16 v1, 0xb4

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    const/16 v1, 0x5a

    .line 12
    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/16 v1, 0x10e

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return-object v0

    .line 21
    .line 22
    :cond_2
    :goto_0
    const-string v0, "landscape"

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :cond_3
    :goto_1
    const-string/jumbo v0, "portrait"

    .line 27
    return-object v0
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
.end method

.method public onOrientationChanged(I)V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    goto :goto_0

    .line 5
    .line 6
    :cond_0
    const/16 v0, 0x2d

    .line 7
    .line 8
    if-lt p1, v0, :cond_5

    .line 9
    .line 10
    const/16 v1, 0x13b

    .line 11
    .line 12
    if-le p1, v1, :cond_1

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_1
    const/16 v2, 0x87

    .line 16
    .line 17
    if-le p1, v0, :cond_2

    .line 18
    .line 19
    if-ge p1, v2, :cond_2

    .line 20
    .line 21
    const/16 p1, 0x5a

    .line 22
    .line 23
    iput p1, p0, Lcom/sensorsdata/analytics/android/sdk/SensorsDataScreenOrientationDetector;->mCurrentOrientation:I

    .line 24
    return-void

    .line 25
    .line 26
    :cond_2
    const/16 v0, 0xe1

    .line 27
    .line 28
    if-le p1, v2, :cond_3

    .line 29
    .line 30
    if-ge p1, v0, :cond_3

    .line 31
    .line 32
    const/16 p1, 0xb4

    .line 33
    .line 34
    iput p1, p0, Lcom/sensorsdata/analytics/android/sdk/SensorsDataScreenOrientationDetector;->mCurrentOrientation:I

    .line 35
    return-void

    .line 36
    .line 37
    :cond_3
    if-le p1, v0, :cond_4

    .line 38
    .line 39
    if-ge p1, v1, :cond_4

    .line 40
    .line 41
    const/16 p1, 0x10e

    .line 42
    .line 43
    iput p1, p0, Lcom/sensorsdata/analytics/android/sdk/SensorsDataScreenOrientationDetector;->mCurrentOrientation:I

    .line 44
    :cond_4
    :goto_0
    return-void

    .line 45
    :cond_5
    :goto_1
    const/4 p1, 0x0

    .line 46
    .line 47
    iput p1, p0, Lcom/sensorsdata/analytics/android/sdk/SensorsDataScreenOrientationDetector;->mCurrentOrientation:I

    .line 48
    return-void
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
.end method
