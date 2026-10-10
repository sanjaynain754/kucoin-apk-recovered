.class public interface abstract Lcom/jumio/core/sensors/SensorFactoryInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/jumio/core/Injected;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u0008\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/core/sensors/SensorFactoryInterface;",
        "",
        "getSensor",
        "Lcom/jumio/core/sensors/SensorInterface;",
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


# virtual methods
.method public abstract getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/SensorInterface;
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
.end method
