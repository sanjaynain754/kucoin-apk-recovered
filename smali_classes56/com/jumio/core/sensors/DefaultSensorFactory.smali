.class public final Lcom/jumio/core/sensors/DefaultSensorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/sensors/SensorFactoryInterface;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/jumio/core/sensors/DefaultSensorFactory;",
        "Lcom/jumio/core/sensors/SensorFactoryInterface;",
        "<init>",
        "()V",
        "getSensor",
        "Lcom/jumio/core/sensors/BaseSensor;",
        "type",
        "Lcom/jumio/core/sensors/SensorType;",
        "config",
        "Lcom/jumio/core/sensors/SensorConfig;",
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
.method public getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/BaseSensor;
    .locals 1
    .param p1    # Lcom/jumio/core/sensors/SensorType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/sensors/SensorConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Ljumio/core/M0;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    .line 3
    new-instance p1, Lcom/jumio/core/sensors/LinearAccelerometer;

    invoke-direct {p1, p2}, Lcom/jumio/core/sensors/LinearAccelerometer;-><init>(Lcom/jumio/core/sensors/SensorConfig;)V

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Lcom/jumio/core/sensors/LightSensor;

    invoke-direct {p1, p2}, Lcom/jumio/core/sensors/LightSensor;-><init>(Lcom/jumio/core/sensors/SensorConfig;)V

    return-object p1

    .line 6
    :cond_2
    new-instance p1, Lcom/jumio/core/sensors/Gyroscope;

    invoke-direct {p1, p2}, Lcom/jumio/core/sensors/Gyroscope;-><init>(Lcom/jumio/core/sensors/SensorConfig;)V

    return-object p1

    .line 7
    :cond_3
    new-instance p1, Lcom/jumio/core/sensors/GravitySensor;

    invoke-direct {p1, p2}, Lcom/jumio/core/sensors/GravitySensor;-><init>(Lcom/jumio/core/sensors/SensorConfig;)V

    return-object p1

    .line 8
    :cond_4
    new-instance p1, Lcom/jumio/core/sensors/Accelerometer;

    invoke-direct {p1, p2}, Lcom/jumio/core/sensors/Accelerometer;-><init>(Lcom/jumio/core/sensors/SensorConfig;)V

    return-object p1
.end method

.method public bridge synthetic getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/SensorInterface;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/jumio/core/sensors/DefaultSensorFactory;->getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/BaseSensor;

    move-result-object p1

    return-object p1
.end method
