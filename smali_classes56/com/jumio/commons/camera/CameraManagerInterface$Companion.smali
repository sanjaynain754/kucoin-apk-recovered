.class public final Lcom/jumio/commons/camera/CameraManagerInterface$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/commons/camera/CameraManagerInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/jumio/commons/camera/CameraManagerInterface$Companion;",
        "",
        "<init>",
        "()V",
        "IMAGE_FORMAT",
        "",
        "IMAGE_FORMAT_EXCEPTION",
        "Ljava/lang/IllegalArgumentException;",
        "Lkotlin/IllegalArgumentException;",
        "getIMAGE_FORMAT_EXCEPTION",
        "()Ljava/lang/IllegalArgumentException;",
        "FHD_CAMERA_RESOLUTION",
        "Lcom/jumio/commons/camera/Size;",
        "getFHD_CAMERA_RESOLUTION",
        "()Lcom/jumio/commons/camera/Size;",
        "UHD_CAMERA_RESOLUTION",
        "getUHD_CAMERA_RESOLUTION",
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


# static fields
.field public static final IMAGE_FORMAT:I = 0x11

.field public static final synthetic a:Lcom/jumio/commons/camera/CameraManagerInterface$Companion;

.field public static final b:Ljava/lang/IllegalArgumentException;

.field public static final c:Lcom/jumio/commons/camera/Size;

.field public static final d:Lcom/jumio/commons/camera/Size;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->a:Lcom/jumio/commons/camera/CameraManagerInterface$Companion;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v1, "Image format 17 is not implemented"

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    sput-object v0, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->b:Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v0, Lcom/jumio/commons/camera/Size;

    .line 19
    .line 20
    const/16 v1, 0x780

    .line 21
    .line 22
    const/16 v2, 0x438

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 26
    .line 27
    sput-object v0, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->c:Lcom/jumio/commons/camera/Size;

    .line 28
    .line 29
    new-instance v0, Lcom/jumio/commons/camera/Size;

    .line 30
    .line 31
    const/16 v1, 0xf00

    .line 32
    .line 33
    const/16 v2, 0x870

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 37
    .line 38
    sput-object v0, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->d:Lcom/jumio/commons/camera/Size;

    .line 39
    return-void
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
.end method

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
.method public final getFHD_CAMERA_RESOLUTION()Lcom/jumio/commons/camera/Size;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->c:Lcom/jumio/commons/camera/Size;

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
.end method

.method public final getIMAGE_FORMAT_EXCEPTION()Ljava/lang/IllegalArgumentException;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->b:Ljava/lang/IllegalArgumentException;

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
.end method

.method public final getUHD_CAMERA_RESOLUTION()Lcom/jumio/commons/camera/Size;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->d:Lcom/jumio/commons/camera/Size;

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
.end method
