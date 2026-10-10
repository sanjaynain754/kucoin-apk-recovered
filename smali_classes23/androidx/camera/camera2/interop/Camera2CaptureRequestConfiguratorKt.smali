.class public final Landroidx/camera/camera2/interop/Camera2CaptureRequestConfiguratorKt;
.super Ljava/lang/Object;
.source "Camera2CaptureRequestConfigurator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0006H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\t\u001a\u00020\u0002H\u0007\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\n"
    }
    d2 = {
        "OPTION_CAPTURE_REQUEST_CONFIGURATOR",
        "Landroidx/camera/core/impl/Config$Option;",
        "Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;",
        "getOPTION_CAPTURE_REQUEST_CONFIGURATOR",
        "()Landroidx/camera/core/impl/Config$Option;",
        "getCamera2CaptureRequestConfigurator",
        "Landroidx/camera/core/CameraXConfig;",
        "setCamera2CaptureRequestConfigurator",
        "Landroidx/camera/core/CameraXConfig$Builder;",
        "captureRequestConfigurator",
        "camera-camera2_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final OPTION_CAPTURE_REQUEST_CONFIGURATOR:Landroidx/camera/core/impl/Config$Option;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/Config$Option<",
            "Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "camerax.core.appConfig.captureRequestConfigurator"

    .line 3
    .line 4
    const-class v1, Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Landroidx/camera/core/impl/Config$Option;->create(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/Config$Option;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "create(...)"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    sput-object v0, Landroidx/camera/camera2/interop/Camera2CaptureRequestConfiguratorKt;->OPTION_CAPTURE_REQUEST_CONFIGURATOR:Landroidx/camera/core/impl/Config$Option;

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public static final getCamera2CaptureRequestConfigurator(Landroidx/camera/core/CameraXConfig;)Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;
    .locals 2
    .param p0    # Landroidx/camera/core/CameraXConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
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
    .line 8
    invoke-virtual {p0}, Landroidx/camera/core/CameraXConfig;->getConfig()Landroidx/camera/core/impl/Config;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    sget-object v0, Landroidx/camera/camera2/interop/Camera2CaptureRequestConfiguratorKt;->OPTION_CAPTURE_REQUEST_CONFIGURATOR:Landroidx/camera/core/impl/Config$Option;

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v0, v1}, Landroidx/camera/core/impl/Config;->retrieveOption(Landroidx/camera/core/impl/Config$Option;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    check-cast p0, Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final getOPTION_CAPTURE_REQUEST_CONFIGURATOR()Landroidx/camera/core/impl/Config$Option;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/Config$Option<",
            "Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/camera/camera2/interop/Camera2CaptureRequestConfiguratorKt;->OPTION_CAPTURE_REQUEST_CONFIGURATOR:Landroidx/camera/core/impl/Config$Option;

    .line 3
    return-object v0
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

.method public static final setCamera2CaptureRequestConfigurator(Landroidx/camera/core/CameraXConfig$Builder;Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;)Landroidx/camera/core/CameraXConfig$Builder;
    .locals 2
    .param p0    # Landroidx/camera/core/CameraXConfig$Builder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

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
    const-string v0, "captureRequestConfigurator"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/camera/core/CameraXConfig$Builder;->getMutableConfig()Landroidx/camera/core/impl/MutableConfig;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sget-object v1, Landroidx/camera/camera2/interop/Camera2CaptureRequestConfiguratorKt;->OPTION_CAPTURE_REQUEST_CONFIGURATOR:Landroidx/camera/core/impl/Config$Option;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/MutableConfig;->insertOption(Landroidx/camera/core/impl/Config$Option;Ljava/lang/Object;)V

    .line 20
    return-object p0
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
