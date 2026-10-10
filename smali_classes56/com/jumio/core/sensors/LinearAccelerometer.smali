.class public final Lcom/jumio/core/sensors/LinearAccelerometer;
.super Lcom/jumio/core/sensors/BaseSensor;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/jumio/core/sensors/LinearAccelerometer;",
        "Lcom/jumio/core/sensors/BaseSensor;",
        "config",
        "Lcom/jumio/core/sensors/SensorConfig;",
        "<init>",
        "(Lcom/jumio/core/sensors/SensorConfig;)V",
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
.method public constructor <init>(Lcom/jumio/core/sensors/SensorConfig;)V
    .locals 1
    .param p1    # Lcom/jumio/core/sensors/SensorConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/jumio/core/sensors/SensorType;->LINEAR_ACCELEROMETER:Lcom/jumio/core/sensors/SensorType;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0, p1}, Lcom/jumio/core/sensors/BaseSensor;-><init>(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)V

    .line 11
    return-void
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
