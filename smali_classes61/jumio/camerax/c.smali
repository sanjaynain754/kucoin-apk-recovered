.class public final Ljumio/camerax/c;
.super Landroidx/camera/core/CameraEffect;
.source "SourceFile"


# instance fields
.field public final a:Ljumio/camerax/p;

.field public final b:Ljumio/camerax/c;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljumio/camerax/p;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljumio/camerax/p;-><init>()V

    .line 6
    .line 7
    new-instance v1, Ljumio/camerax/C;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Ljumio/camerax/C;-><init>()V

    .line 11
    .line 12
    const-string v2, "cameraXProcessor"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v2, "errorListener"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 24
    move-result-object v2

    .line 25
    const/4 v3, 0x1

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v3, v2, v0, v1}, Landroidx/camera/core/CameraEffect;-><init>(ILjava/util/concurrent/Executor;Landroidx/camera/core/SurfaceProcessor;Landroidx/core/util/Consumer;)V

    .line 29
    .line 30
    iput-object v0, p0, Ljumio/camerax/c;->a:Ljumio/camerax/p;

    .line 31
    .line 32
    iput-object p0, p0, Ljumio/camerax/c;->b:Ljumio/camerax/c;

    .line 33
    return-void
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
    .line 106
    .line 107
.end method
