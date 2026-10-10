.class public final Lcom/jumio/core/camera/CameraConnectionData$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/core/camera/CameraConnectionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/jumio/core/camera/CameraConnectionData$Companion;",
        "",
        "<init>",
        "()V",
        "get",
        "Lcom/jumio/core/camera/CameraConnectionData;",
        "isEnabled",
        "",
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
.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final a()Lcom/jumio/core/camera/CameraConnectionInterface;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/camera/DefaultCameraConnection;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/jumio/core/camera/DefaultCameraConnection;-><init>()V

    .line 6
    return-object v0
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
.method public final get(Z)Lcom/jumio/core/camera/CameraConnectionData;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget-object p1, Lcom/jumio/core/ServiceLocator;->INSTANCE:Lcom/jumio/core/ServiceLocator;

    .line 5
    .line 6
    new-instance v0, Lj9/a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lj9/a;-><init>()V

    .line 10
    .line 11
    const-class v1, Lcom/jumio/core/camera/CameraConnectionInterface;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1, v0}, Lcom/jumio/core/ServiceLocator;->getServiceImplementation(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    check-cast p1, Lcom/jumio/core/camera/CameraConnectionInterface;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Lcom/jumio/core/camera/CameraConnectionInterface;->get()Lcom/jumio/core/camera/CameraConnectionData;

    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method
