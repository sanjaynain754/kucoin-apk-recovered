.class public final Ljumio/camerax/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljumio/camerax/f;


# instance fields
.field public final a:Landroidx/camera/core/Camera;

.field public b:I

.field public c:Ljumio/camerax/r;

.field public d:Lcom/jumio/commons/camera/CaptureSettings;

.field public e:Z


# direct methods
.method public constructor <init>(Landroidx/camera/core/Camera;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    .line 6
    .line 7
    new-instance v0, Ljumio/camerax/r;

    .line 8
    const/4 v6, 0x0

    .line 9
    .line 10
    sget-object v9, Lcom/jumio/core/enums/FlashState;->UNAVAILABLE:Lcom/jumio/core/enums/FlashState;

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x4

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct/range {v0 .. v9}, Ljumio/camerax/r;-><init>(JIFIFLandroid/hardware/camera2/params/ColorSpaceTransform;Landroid/hardware/camera2/params/RggbChannelVector;Lcom/jumio/core/enums/FlashState;)V

    .line 21
    .line 22
    iput-object v0, p0, Ljumio/camerax/t;->c:Ljumio/camerax/r;

    .line 23
    .line 24
    new-instance v1, Lcom/jumio/commons/camera/CaptureSettings;

    .line 25
    const/4 v5, 0x7

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    .line 31
    .line 32
    invoke-direct/range {v1 .. v6}, Lcom/jumio/commons/camera/CaptureSettings;-><init>(Lcom/jumio/commons/camera/ExposureLevel;Lcom/jumio/commons/camera/WhiteBalance;Lcom/jumio/commons/camera/LensDistance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    iput-object v1, p0, Ljumio/camerax/t;->d:Lcom/jumio/commons/camera/CaptureSettings;

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
.end method

.method public static a(Landroidx/camera/camera2/interop/Camera2CameraInfo;Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;Lcom/jumio/commons/camera/WhiteBalance;)V
    .locals 7

    const/4 v0, 0x1

    .line 124
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 125
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AWB_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v2}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->getCameraCharacteristic(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    const/4 v2, 0x0

    if-eqz p0, :cond_1

    .line 126
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 127
    array-length v4, p0

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_2

    aget v6, p0, v5

    if-eq v6, v0, :cond_0

    if-eqz v6, :cond_0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 128
    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 129
    :cond_2
    sget-object p0, Ljumio/camerax/s;->b:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p0, p0, p2

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 130
    :pswitch_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    const/4 p2, 0x5

    rem-int/2addr p2, p0

    if-ltz p2, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    if-ge p2, p0, :cond_3

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_3
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto/16 :goto_1

    .line 131
    :pswitch_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    const/4 p2, 0x4

    rem-int/2addr p2, p0

    if-ltz p2, :cond_4

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    if-ge p2, p0, :cond_4

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_4
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_1

    .line 132
    :pswitch_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    const/4 p2, 0x3

    rem-int/2addr p2, p0

    if-ltz p2, :cond_5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    if-ge p2, p0, :cond_5

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_5
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_1

    .line 133
    :pswitch_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    const/4 p2, 0x2

    rem-int/2addr p2, p0

    if-ltz p2, :cond_6

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    if-ge p2, p0, :cond_6

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_6
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_1

    .line 134
    :pswitch_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    rem-int/2addr v0, p0

    if-ltz v0, :cond_7

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    if-ge v0, p0, :cond_7

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_7
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_1

    .line 135
    :pswitch_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_8

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_8
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 136
    :goto_1
    :pswitch_6
    sget-object p0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p0, p2}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final a(Lcom/google/common/util/concurrent/ListenableFuture;Ljumio/camerax/t;)V
    .locals 1

    .line 8
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 9
    const-string v0, "DefaultCameraX"

    invoke-static {v0, p0}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    :goto_0
    iget-object p0, p1, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Landroidx/camera/core/CameraInfo;->getTorchState()Landroidx/lifecycle/LiveData;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    :goto_1
    if-nez p0, :cond_1

    goto :goto_2

    .line 11
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const/4 v0, 0x0

    .line 12
    :goto_3
    iput-boolean v0, p1, Ljumio/camerax/t;->e:Z

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 5
    iget-object v0, p0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-static {v0}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->from(Landroidx/camera/core/CameraInfo;)Landroidx/camera/camera2/interop/Camera2CameraInfo;

    move-result-object v0

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->getCameraCharacteristic(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final a(Landroidx/camera/camera2/interop/Camera2CameraInfo;Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;Lcom/jumio/commons/camera/ExposureLevel;)V
    .locals 7

    .line 64
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_SENSITIVITY_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->getCameraCharacteristic(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Range;

    .line 65
    sget-object v0, Ljumio/camerax/s;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p3, v0, :cond_5

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eq p3, v2, :cond_4

    const/4 v2, 0x3

    if-eq p3, v2, :cond_2

    const/4 v2, 0x4

    if-ne p3, v2, :cond_1

    if-eqz p1, :cond_0

    .line 66
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Integer;

    .line 67
    :cond_0
    iget-object p1, p0, Ljumio/camerax/t;->c:Ljumio/camerax/r;

    .line 68
    iget-wide v4, p1, Ljumio/camerax/r;->a:J

    long-to-float p1, v4

    const/high16 p3, 0x40400000    # 3.0f

    mul-float/2addr p1, p3

    float-to-long v4, p1

    .line 69
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :goto_0
    move-object v6, v1

    move-object v1, p1

    move-object p1, v6

    goto :goto_1

    .line 70
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    if-eqz p1, :cond_3

    .line 71
    invoke-virtual {p1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Integer;

    .line 72
    :cond_3
    iget-object p1, p0, Ljumio/camerax/t;->c:Ljumio/camerax/r;

    .line 73
    iget-wide v4, p1, Ljumio/camerax/r;->a:J

    long-to-float p1, v4

    const p3, 0x3c23d70a    # 0.01f

    mul-float/2addr p1, p3

    float-to-long v4, p1

    .line 74
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    .line 75
    :cond_4
    iget-object p1, p0, Ljumio/camerax/t;->c:Ljumio/camerax/r;

    .line 76
    iget p1, p1, Ljumio/camerax/r;->b:I

    .line 77
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 78
    iget-object p1, p0, Ljumio/camerax/t;->c:Ljumio/camerax/r;

    .line 79
    iget-wide v4, p1, Ljumio/camerax/r;->a:J

    .line 80
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_5
    move v3, v0

    move-object p1, v1

    .line 81
    :goto_1
    sget-object p3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, p3, v2}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    if-eqz v1, :cond_6

    .line 82
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    .line 83
    sget-object p3, Landroid/hardware/camera2/CaptureRequest;->SENSOR_EXPOSURE_TIME:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p2, p3, v1}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    :cond_6
    if-eqz p1, :cond_7

    .line 84
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 85
    sget-object p3, Landroid/hardware/camera2/CaptureRequest;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    .line 86
    :cond_7
    sget-object p1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 87
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    .line 88
    invoke-virtual {p2, p1, p3}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    return-void
.end method

.method public final a(Landroidx/camera/camera2/interop/Camera2CameraInfo;Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;Lcom/jumio/commons/camera/LensDistance;)V
    .locals 6

    .line 137
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->getCameraCharacteristic(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-array p1, v0, [I

    .line 138
    :cond_0
    sget-object v1, Ljumio/camerax/s;->c:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v1, v2

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-eq v2, v4, :cond_4

    if-eq v2, v3, :cond_3

    .line 139
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v5, :cond_2

    const/4 p3, 0x2

    if-eq p1, p3, :cond_1

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_1
    const/high16 p1, 0x40800000    # 4.0f

    goto :goto_0

    :cond_2
    const/high16 p1, 0x40000000    # 2.0f

    .line 140
    :goto_0
    iget-object p3, p0, Ljumio/camerax/t;->c:Ljumio/camerax/r;

    .line 141
    iget p3, p3, Ljumio/camerax/r;->e:F

    mul-float/2addr p1, p3

    .line 142
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_2

    .line 143
    :cond_3
    iget-object p1, p0, Ljumio/camerax/t;->c:Ljumio/camerax/r;

    .line 144
    iget p1, p1, Ljumio/camerax/r;->e:F

    .line 145
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_2

    .line 146
    :cond_4
    iget-object p3, p0, Ljumio/camerax/t;->c:Ljumio/camerax/r;

    .line 147
    iget p3, p3, Ljumio/camerax/r;->d:I

    .line 148
    invoke-static {p1, p3}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v1

    if-eqz v1, :cond_5

    move v0, p3

    goto :goto_1

    .line 149
    :cond_5
    invoke-static {p1, v3}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result p3

    if-eqz p3, :cond_6

    move v0, v3

    goto :goto_1

    .line 150
    :cond_6
    invoke-static {p1, v4}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result p3

    if-eqz p3, :cond_7

    move v0, v4

    goto :goto_1

    .line 151
    :cond_7
    invoke-static {p1, v5}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result p1

    if-eqz p1, :cond_8

    move v0, v5

    :cond_8
    :goto_1
    const/4 p1, 0x0

    .line 152
    :goto_2
    sget-object p3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2, p3, v1}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    if-eqz p1, :cond_9

    .line 153
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    .line 154
    sget-object p3, Landroid/hardware/camera2/CaptureRequest;->LENS_FOCUS_DISTANCE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    :cond_9
    if-ne v0, v5, :cond_a

    .line 155
    sget-object p1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    :cond_a
    return-void
.end method

.method public final a(Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;Lcom/jumio/commons/camera/WhiteBalance;)V
    .locals 8

    .line 89
    sget-object v0, Ljumio/camerax/s;->b:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eq v0, v2, :cond_0

    .line 90
    sget-object v0, Ljumio/camerax/v;->a:Lkotlin/Triple;

    .line 91
    sget-object v0, Ljumio/camerax/u;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    .line 92
    sget-object p2, Ljumio/camerax/v;->a:Lkotlin/Triple;

    goto :goto_0

    .line 93
    :pswitch_0
    sget-object p2, Ljumio/camerax/v;->g:Lkotlin/Triple;

    goto :goto_0

    .line 94
    :pswitch_1
    sget-object p2, Ljumio/camerax/v;->f:Lkotlin/Triple;

    goto :goto_0

    .line 95
    :pswitch_2
    sget-object p2, Ljumio/camerax/v;->e:Lkotlin/Triple;

    goto :goto_0

    .line 96
    :pswitch_3
    sget-object p2, Ljumio/camerax/v;->d:Lkotlin/Triple;

    goto :goto_0

    .line 97
    :pswitch_4
    sget-object p2, Ljumio/camerax/v;->c:Lkotlin/Triple;

    goto :goto_0

    .line 98
    :pswitch_5
    sget-object p2, Ljumio/camerax/v;->b:Lkotlin/Triple;

    :goto_0
    const/16 v0, 0x100

    int-to-float v4, v0

    .line 99
    invoke-virtual {p2}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    mul-float/2addr v5, v4

    .line 100
    invoke-virtual {p2}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    mul-float/2addr v6, v4

    .line 101
    invoke-virtual {p2}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    mul-float/2addr p2, v4

    const/16 v4, 0x12

    .line 102
    new-array v4, v4, [I

    aput v0, v4, v3

    aput v0, v4, v1

    aput v3, v4, v2

    const/4 v1, 0x3

    aput v0, v4, v1

    const/4 v1, 0x4

    aput v3, v4, v1

    const/4 v1, 0x5

    aput v0, v4, v1

    const/4 v1, 0x6

    aput v3, v4, v1

    const/4 v1, 0x7

    aput v0, v4, v1

    const/16 v1, 0x8

    aput v0, v4, v1

    const/16 v2, 0x9

    aput v0, v4, v2

    const/16 v2, 0xa

    aput v3, v4, v2

    const/16 v2, 0xb

    aput v0, v4, v2

    const/16 v2, 0xc

    aput v3, v4, v2

    const/16 v2, 0xd

    aput v0, v4, v2

    const/16 v2, 0xe

    aput v3, v4, v2

    const/16 v2, 0xf

    aput v0, v4, v2

    const/16 v2, 0x10

    aput v0, v4, v2

    const/16 v7, 0x11

    aput v0, v4, v7

    float-to-int v0, v5

    .line 103
    aput v0, v4, v3

    float-to-int v0, v6

    .line 104
    aput v0, v4, v1

    float-to-int p2, p2

    .line 105
    aput p2, v4, v2

    .line 106
    sget-object p2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    move-result-object p1

    .line 107
    sget-object p2, Landroid/hardware/camera2/CaptureRequest;->COLOR_CORRECTION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 108
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 109
    invoke-virtual {p1, p2, v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    move-result-object p1

    .line 110
    sget-object p2, Landroid/hardware/camera2/CaptureRequest;->COLOR_CORRECTION_TRANSFORM:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 111
    new-instance v0, Landroid/hardware/camera2/params/ColorSpaceTransform;

    invoke-direct {v0, v4}, Landroid/hardware/camera2/params/ColorSpaceTransform;-><init>([I)V

    .line 112
    invoke-virtual {p1, p2, v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    return-void

    .line 113
    :cond_0
    sget-object p2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    move-result-object p2

    .line 114
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->COLOR_CORRECTION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 115
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 116
    invoke-virtual {p2, v0, v1}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    .line 117
    iget-object p2, p0, Ljumio/camerax/t;->c:Ljumio/camerax/r;

    .line 118
    iget-object p2, p2, Ljumio/camerax/r;->g:Landroid/hardware/camera2/params/RggbChannelVector;

    if-eqz p2, :cond_1

    .line 119
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->COLOR_CORRECTION_GAINS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v0, p2}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    .line 120
    :cond_1
    iget-object p2, p0, Ljumio/camerax/t;->c:Ljumio/camerax/r;

    .line 121
    iget-object p2, p2, Ljumio/camerax/r;->f:Landroid/hardware/camera2/params/ColorSpaceTransform;

    if-eqz p2, :cond_2

    .line 122
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->COLOR_CORRECTION_TRANSFORM:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v0, p2}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    :cond_2
    return-void

    .line 123
    :cond_3
    sget-object p2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Landroidx/camera/core/Camera;Lcom/jumio/commons/camera/ExposureLevel;)V
    .locals 2

    .line 53
    invoke-interface {p1}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->getExposureState()Landroidx/camera/core/ExposureState;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/ExposureState;->isExposureCompensationSupported()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 54
    :cond_0
    invoke-interface {p1}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->getExposureState()Landroidx/camera/core/ExposureState;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/ExposureState;->getExposureCompensationRange()Landroid/util/Range;

    move-result-object v0

    const-string v1, "getExposureCompensationRange(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    sget-object v1, Ljumio/camerax/s;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v1, p2

    const/4 v1, 0x1

    if-eq p2, v1, :cond_3

    const/4 v1, 0x2

    if-eq p2, v1, :cond_3

    const/4 v1, 0x3

    if-eq p2, v1, :cond_2

    const/4 v1, 0x4

    if-ne p2, v1, :cond_1

    .line 56
    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    goto :goto_0

    .line 57
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 58
    :cond_2
    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    goto :goto_0

    .line 59
    :cond_3
    iget p2, p0, Ljumio/camerax/t;->b:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 60
    :goto_0
    invoke-virtual {v0, p2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 61
    invoke-interface {p1}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object v0

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Landroidx/camera/core/CameraControl;->setExposureCompensationIndex(I)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Exposure Value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/CameraInfo;->getExposureState()Landroidx/camera/core/ExposureState;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/ExposureState;->getExposureCompensationStep()Landroid/util/Rational;

    move-result-object p1

    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-float p2, p2

    mul-float/2addr p1, p2

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 63
    const-string p2, "DefaultCameraX"

    invoke-static {p2, p1}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final a(Lcom/jumio/commons/camera/CaptureSettings;Ljumio/camerax/r;)V
    .locals 5

    const-string v0, "from(...)"

    const-string v1, "settings"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "captureData"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object v1, p0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    .line 35
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CaptureSettings;->getStartChallenge()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 36
    invoke-interface {v1}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v2

    invoke-interface {v2}, Landroidx/camera/core/CameraInfo;->getExposureState()Landroidx/camera/core/ExposureState;

    move-result-object v2

    invoke-interface {v2}, Landroidx/camera/core/ExposureState;->getExposureCompensationIndex()I

    move-result v2

    iput v2, p0, Ljumio/camerax/t;->b:I

    .line 37
    iput-object p2, p0, Ljumio/camerax/t;->c:Ljumio/camerax/r;

    .line 38
    :cond_0
    iget-object p2, p0, Ljumio/camerax/t;->d:Lcom/jumio/commons/camera/CaptureSettings;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_3

    .line 39
    :cond_1
    iput-object p1, p0, Ljumio/camerax/t;->d:Lcom/jumio/commons/camera/CaptureSettings;

    .line 40
    :try_start_0
    invoke-interface {v1}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object p2

    invoke-static {p2}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->from(Landroidx/camera/core/CameraInfo;)Landroidx/camera/camera2/interop/Camera2CameraInfo;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-interface {v1}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object v2

    invoke-static {v2}, Landroidx/camera/camera2/interop/Camera2CameraControl;->from(Landroidx/camera/core/CameraControl;)Landroidx/camera/camera2/interop/Camera2CameraControl;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    new-instance v0, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    invoke-direct {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;-><init>()V

    .line 43
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p2, v3}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->getCameraCharacteristic(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 44
    :goto_0
    invoke-static {}, Ljumio/camerax/v;->a()Ljava/util/List;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 45
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CaptureSettings;->getLevel()Lcom/jumio/commons/camera/ExposureLevel;

    move-result-object v1

    invoke-virtual {p0, p2, v0, v1}, Ljumio/camerax/t;->a(Landroidx/camera/camera2/interop/Camera2CameraInfo;Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;Lcom/jumio/commons/camera/ExposureLevel;)V

    .line 46
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CaptureSettings;->getWhiteBalance()Lcom/jumio/commons/camera/WhiteBalance;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljumio/camerax/t;->a(Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;Lcom/jumio/commons/camera/WhiteBalance;)V

    .line 47
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CaptureSettings;->getDistance()Lcom/jumio/commons/camera/LensDistance;

    move-result-object p1

    invoke-virtual {p0, p2, v0, p1}, Ljumio/camerax/t;->a(Landroidx/camera/camera2/interop/Camera2CameraInfo;Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;Lcom/jumio/commons/camera/LensDistance;)V

    goto :goto_1

    .line 48
    :cond_3
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CaptureSettings;->getLevel()Lcom/jumio/commons/camera/ExposureLevel;

    move-result-object v3

    invoke-virtual {p0, v1, v3}, Ljumio/camerax/t;->a(Landroidx/camera/core/Camera;Lcom/jumio/commons/camera/ExposureLevel;)V

    .line 49
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CaptureSettings;->getWhiteBalance()Lcom/jumio/commons/camera/WhiteBalance;

    move-result-object p1

    invoke-static {p2, v0, p1}, Ljumio/camerax/t;->a(Landroidx/camera/camera2/interop/Camera2CameraInfo;Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;Lcom/jumio/commons/camera/WhiteBalance;)V

    .line 50
    :goto_1
    invoke-virtual {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->build()Landroidx/camera/camera2/interop/CaptureRequestOptions;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroidx/camera/camera2/interop/Camera2CameraControl;->setCaptureRequestOptions(Landroidx/camera/camera2/interop/CaptureRequestOptions;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    .line 51
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 52
    :goto_2
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method public final a(Lcom/jumio/commons/camera/MeteringConfig;)V
    .locals 5

    const-string v0, "meteringConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    :try_start_0
    iget-object v0, p0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 14
    new-instance v1, Landroidx/camera/core/FocusMeteringAction$Builder;

    sget-object v2, Ljumio/camerax/v;->a:Lkotlin/Triple;

    .line 15
    new-instance v2, Landroidx/camera/core/SurfaceOrientedMeteringPointFactory;

    invoke-virtual {p1}, Lcom/jumio/commons/camera/MeteringConfig;->getMeteringPoint()Lcom/jumio/commons/camera/MeteringPoint;

    move-result-object v3

    invoke-virtual {v3}, Lcom/jumio/commons/camera/MeteringPoint;->getWidth()F

    move-result v3

    invoke-virtual {p1}, Lcom/jumio/commons/camera/MeteringConfig;->getMeteringPoint()Lcom/jumio/commons/camera/MeteringPoint;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/commons/camera/MeteringPoint;->getHeight()F

    move-result v4

    invoke-direct {v2, v3, v4}, Landroidx/camera/core/SurfaceOrientedMeteringPointFactory;-><init>(FF)V

    .line 16
    invoke-virtual {p1}, Lcom/jumio/commons/camera/MeteringConfig;->getMeteringPoint()Lcom/jumio/commons/camera/MeteringPoint;

    move-result-object v3

    invoke-virtual {v3}, Lcom/jumio/commons/camera/MeteringPoint;->getX()F

    move-result v3

    .line 17
    invoke-virtual {p1}, Lcom/jumio/commons/camera/MeteringConfig;->getMeteringPoint()Lcom/jumio/commons/camera/MeteringPoint;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/commons/camera/MeteringPoint;->getY()F

    move-result v4

    .line 18
    invoke-virtual {v2, v3, v4}, Landroidx/camera/core/MeteringPointFactory;->createPoint(FF)Landroidx/camera/core/MeteringPoint;

    move-result-object v2

    const-string v3, "createPoint(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p1}, Lcom/jumio/commons/camera/MeteringConfig;->getMeteringMode()Lcom/jumio/commons/camera/MeteringMode;

    move-result-object v3

    invoke-virtual {v3}, Lcom/jumio/commons/camera/MeteringMode;->getAe()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x2

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 20
    :goto_0
    invoke-virtual {p1}, Lcom/jumio/commons/camera/MeteringConfig;->getMeteringMode()Lcom/jumio/commons/camera/MeteringMode;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/commons/camera/MeteringMode;->getAf()Z

    move-result v4

    if-eqz v4, :cond_1

    or-int/lit8 v3, v3, 0x1

    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/jumio/commons/camera/MeteringConfig;->getMeteringMode()Lcom/jumio/commons/camera/MeteringMode;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jumio/commons/camera/MeteringMode;->getAwb()Z

    move-result p1

    if-eqz p1, :cond_2

    or-int/lit8 v3, v3, 0x4

    .line 22
    :cond_2
    invoke-direct {v1, v2, v3}, Landroidx/camera/core/FocusMeteringAction$Builder;-><init>(Landroidx/camera/core/MeteringPoint;I)V

    .line 23
    invoke-virtual {v1}, Landroidx/camera/core/FocusMeteringAction$Builder;->disableAutoCancel()Landroidx/camera/core/FocusMeteringAction$Builder;

    .line 24
    invoke-virtual {v1}, Landroidx/camera/core/FocusMeteringAction$Builder;->build()Landroidx/camera/core/FocusMeteringAction;

    move-result-object p1

    .line 25
    invoke-interface {v0, p1}, Landroidx/camera/core/CameraControl;->startFocusAndMetering(Landroidx/camera/core/FocusMeteringAction;)Lcom/google/common/util/concurrent/ListenableFuture;
    :try_end_0
    .catch Landroidx/camera/core/CameraInfoUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 26
    const-string v0, "DefaultCameraX"

    const-string v1, "Cannot access camera"

    invoke-static {v0, v1, p1}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public final a(Z)V
    .locals 4

    .line 27
    iget-object v0, p0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v0}, Landroidx/camera/camera2/interop/Camera2CameraControl;->from(Landroidx/camera/core/CameraControl;)Landroidx/camera/camera2/interop/Camera2CameraControl;

    move-result-object v0

    const-string v1, "from(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    new-instance v1, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    invoke-direct {v1}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;-><init>()V

    .line 30
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_LOCK:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    move-result-object v1

    .line 31
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_LOCK:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->build()Landroidx/camera/camera2/interop/CaptureRequestOptions;

    move-result-object p1

    const-string v1, "build(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {v0, p1}, Landroidx/camera/camera2/interop/Camera2CameraControl;->setCaptureRequestOptions(Landroidx/camera/camera2/interop/CaptureRequestOptions;)Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(ZLjava/util/concurrent/Executor;)V
    .locals 2

    const-string v0, "executor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->hasFlashUnit()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    .line 2
    iput-boolean v1, p0, Ljumio/camerax/t;->e:Z

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_3

    .line 4
    new-instance v0, Lkg0/e;

    invoke-direct {v0, p1, p0}, Lkg0/e;-><init>(Lcom/google/common/util/concurrent/ListenableFuture;Ljumio/camerax/t;)V

    invoke-interface {p1, v0, p2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_3
    return-void
.end method

.method public final b()[Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->from(Landroidx/camera/core/CameraInfo;)Landroidx/camera/camera2/interop/Camera2CameraInfo;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AWB_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v3}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->getCameraCharacteristic(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, [I

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    array-length v3, v0

    .line 32
    move v4, v1

    .line 33
    .line 34
    :goto_0
    if-ge v4, v3, :cond_0

    .line 35
    .line 36
    aget v5, v0, v4

    .line 37
    .line 38
    .line 39
    packed-switch v5, :pswitch_data_0

    .line 40
    goto :goto_1

    .line 41
    .line 42
    :pswitch_0
    const-string v5, "shade"

    .line 43
    .line 44
    .line 45
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    goto :goto_1

    .line 47
    .line 48
    .line 49
    :pswitch_1
    const-string/jumbo v5, "twilight"

    .line 50
    .line 51
    .line 52
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :pswitch_2
    const-string v5, "cloudy-daylight"

    .line 56
    .line 57
    .line 58
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    goto :goto_1

    .line 60
    .line 61
    :pswitch_3
    const-string v5, "daylight"

    .line 62
    .line 63
    .line 64
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :pswitch_4
    const-string/jumbo v5, "warm-fluorescent"

    .line 69
    .line 70
    .line 71
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    goto :goto_1

    .line 73
    .line 74
    :pswitch_5
    const-string v5, "fluorescent"

    .line 75
    .line 76
    .line 77
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    goto :goto_1

    .line 79
    .line 80
    :pswitch_6
    const-string v5, "incandescent"

    .line 81
    .line 82
    .line 83
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 86
    goto :goto_0

    .line 87
    .line 88
    :cond_0
    new-array v0, v1, [Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    invoke-interface {v2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    check-cast v0, [Ljava/lang/String;

    .line 95
    .line 96
    if-nez v0, :cond_1

    .line 97
    goto :goto_2

    .line 98
    :cond_1
    return-object v0

    .line 99
    .line 100
    :cond_2
    :goto_2
    new-array v0, v1, [Ljava/lang/String;

    .line 101
    return-object v0

    .line 102
    nop

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    .line 4
    .line 5
    if-eqz v1, :cond_3

    .line 6
    .line 7
    .line 8
    invoke-interface {v1}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->from(Landroidx/camera/core/CameraInfo;)Landroidx/camera/camera2/interop/Camera2CameraInfo;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    goto :goto_2

    .line 19
    .line 20
    :cond_0
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_LOCK_AVAILABLE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->getCameraCharacteristic(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Ljava/lang/Boolean;

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    move-result v2

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v2, v0

    .line 35
    .line 36
    :goto_0
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AWB_LOCK_AVAILABLE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->getCameraCharacteristic(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Boolean;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v1, v0

    .line 51
    .line 52
    :goto_1
    if-eqz v2, :cond_3

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    const/4 v0, 0x1

    .line 56
    :catch_0
    :cond_3
    :goto_2
    return v0
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
.end method

.method public final d()Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-static {v0}, Landroidx/camera/camera2/interop/Camera2CameraControl;->from(Landroidx/camera/core/CameraControl;)Landroidx/camera/camera2/interop/Camera2CameraControl;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const-string v2, "from(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/camera/camera2/interop/Camera2CameraControl;->getCaptureRequestOptions()Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_LOCK:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroidx/camera/camera2/interop/CaptureRequestOptions;->getCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    check-cast v2, Ljava/lang/Boolean;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    move-result v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v2, v1

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {v0}, Landroidx/camera/camera2/interop/Camera2CameraControl;->getCaptureRequestOptions()Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_LOCK:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v3}, Landroidx/camera/camera2/interop/CaptureRequestOptions;->getCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    check-cast v0, Ljava/lang/Boolean;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v0, v1

    .line 61
    .line 62
    :goto_1
    if-eqz v2, :cond_2

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    const/4 v0, 0x1

    .line 66
    return v0

    .line 67
    :catch_0
    :cond_2
    return v1
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
.end method

.method public final e()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljumio/camerax/v;->a()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljumio/camerax/t;->a()I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    if-nez v0, :cond_4

    .line 20
    .line 21
    iget-object v0, p0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->from(Landroidx/camera/core/CameraInfo;)Landroidx/camera/camera2/interop/Camera2CameraInfo;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AWB_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3}, Landroidx/camera/camera2/interop/Camera2CameraInfo;->getCameraCharacteristic(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    check-cast v0, [I

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    array-length v0, v0

    .line 46
    .line 47
    if-nez v0, :cond_0

    .line 48
    move v0, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v0, v2

    .line 51
    :goto_0
    xor-int/2addr v0, v1

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    move-result-object v0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const/4 v0, 0x0

    .line 58
    .line 59
    :goto_1
    if-eqz v0, :cond_2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    move-result v0

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move v0, v2

    .line 66
    .line 67
    :goto_2
    if-eqz v0, :cond_3

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    return v2

    .line 70
    :cond_4
    :goto_3
    return v1
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
.end method
