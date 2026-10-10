.class public Lcom/journeyapps/barcodescanner/CameraPreview$c;
.super Ljava/lang/Object;
.source "CameraPreview.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/journeyapps/barcodescanner/CameraPreview;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/journeyapps/barcodescanner/CameraPreview;


# direct methods
.method public constructor <init>(Lcom/journeyapps/barcodescanner/CameraPreview;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/journeyapps/barcodescanner/CameraPreview$c;->b:Lcom/journeyapps/barcodescanner/CameraPreview;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    .line 2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 3
    .line 4
    sget v1, Lcom/google/zxing/client/android/R$id;->zxing_prewiew_size_ready:I

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/journeyapps/barcodescanner/CameraPreview$c;->b:Lcom/journeyapps/barcodescanner/CameraPreview;

    .line 9
    .line 10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lb9/m;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p1}, Lcom/journeyapps/barcodescanner/CameraPreview;->d(Lcom/journeyapps/barcodescanner/CameraPreview;Lb9/m;)V

    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    .line 19
    :cond_0
    sget v1, Lcom/google/zxing/client/android/R$id;->zxing_camera_error:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Ljava/lang/Exception;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/journeyapps/barcodescanner/CameraPreview$c;->b:Lcom/journeyapps/barcodescanner/CameraPreview;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/CameraPreview;->r()Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, Lcom/journeyapps/barcodescanner/CameraPreview$c;->b:Lcom/journeyapps/barcodescanner/CameraPreview;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/CameraPreview;->u()V

    .line 39
    .line 40
    iget-object v0, p0, Lcom/journeyapps/barcodescanner/CameraPreview$c;->b:Lcom/journeyapps/barcodescanner/CameraPreview;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/journeyapps/barcodescanner/CameraPreview;->e(Lcom/journeyapps/barcodescanner/CameraPreview;)Lcom/journeyapps/barcodescanner/CameraPreview$f;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p1}, Lcom/journeyapps/barcodescanner/CameraPreview$f;->c(Ljava/lang/Exception;)V

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_1
    sget p1, Lcom/google/zxing/client/android/R$id;->zxing_camera_closed:I

    .line 51
    .line 52
    if-ne v0, p1, :cond_2

    .line 53
    .line 54
    iget-object p1, p0, Lcom/journeyapps/barcodescanner/CameraPreview$c;->b:Lcom/journeyapps/barcodescanner/CameraPreview;

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lcom/journeyapps/barcodescanner/CameraPreview;->e(Lcom/journeyapps/barcodescanner/CameraPreview;)Lcom/journeyapps/barcodescanner/CameraPreview$f;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Lcom/journeyapps/barcodescanner/CameraPreview$f;->b()V

    .line 62
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 63
    return p1
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
.end method
