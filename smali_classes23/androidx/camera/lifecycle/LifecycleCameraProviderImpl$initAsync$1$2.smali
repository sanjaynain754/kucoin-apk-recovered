.class public final Landroidx/camera/lifecycle/LifecycleCameraProviderImpl$initAsync$1$2;
.super Ljava/lang/Object;
.source "LifecycleCameraProviderImpl.kt"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/FutureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;->initAsync$camera_lifecycle_release(Landroid/content/Context;Landroidx/camera/core/CameraXConfig;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/utils/futures/FutureCallback<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "androidx/camera/lifecycle/LifecycleCameraProviderImpl$initAsync$1$2",
        "Landroidx/camera/core/impl/utils/futures/FutureCallback;",
        "Ljava/lang/Void;",
        "onSuccess",
        "",
        "void",
        "onFailure",
        "t",
        "",
        "camera-lifecycle_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $cameraX:Landroidx/camera/core/CameraX;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic this$0:Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;


# direct methods
.method public constructor <init>(Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;Landroidx/camera/core/CameraX;Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl$initAsync$1$2;->this$0:Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;

    .line 3
    .line 4
    iput-object p2, p0, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl$initAsync$1$2;->$cameraX:Landroidx/camera/core/CameraX;

    .line 5
    .line 6
    iput-object p3, p0, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl$initAsync$1$2;->$context:Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
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
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "t"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl$initAsync$1$2;->this$0:Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;->shutdownAsync$camera_lifecycle_release(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 13
    return-void
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

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl$initAsync$1$2;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 1

    .line 2
    iget-object p1, p0, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl$initAsync$1$2;->this$0:Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;

    iget-object v0, p0, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl$initAsync$1$2;->$cameraX:Landroidx/camera/core/CameraX;

    invoke-static {p1, v0}, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;->access$setCameraX$p(Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;Landroidx/camera/core/CameraX;)V

    .line 3
    iget-object p1, p0, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl$initAsync$1$2;->this$0:Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;

    .line 4
    iget-object v0, p0, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl$initAsync$1$2;->$context:Landroid/content/Context;

    invoke-static {v0}, Landroidx/camera/core/impl/utils/ContextUtil;->getApplicationContext(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Landroidx/camera/lifecycle/LifecycleCameraProviderImpl;->setContext$camera_lifecycle_release(Landroid/content/Context;)V

    return-void
.end method
