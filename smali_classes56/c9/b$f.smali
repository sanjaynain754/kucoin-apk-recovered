.class public Lc9/b$f;
.super Ljava/lang/Object;
.source "CameraInstance.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lc9/b;


# direct methods
.method public constructor <init>(Lc9/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lc9/b$f;->b:Lc9/b;

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
.method public run()V
    .locals 3

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lc9/b;->c()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "Closing camera"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    iget-object v0, p0, Lc9/b$f;->b:Lc9/b;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lc9/b;->a(Lc9/b;)Lcom/journeyapps/barcodescanner/camera/a;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/camera/a;->u()V

    .line 19
    .line 20
    iget-object v0, p0, Lc9/b$f;->b:Lc9/b;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lc9/b;->a(Lc9/b;)Lcom/journeyapps/barcodescanner/camera/a;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/camera/a;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lc9/b;->c()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    const-string v2, "Failed to close camera"

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 39
    .line 40
    :goto_0
    iget-object v0, p0, Lc9/b$f;->b:Lc9/b;

    .line 41
    const/4 v1, 0x1

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Lc9/b;->i(Lc9/b;Z)Z

    .line 45
    .line 46
    iget-object v0, p0, Lc9/b$f;->b:Lc9/b;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lc9/b;->f(Lc9/b;)Landroid/os/Handler;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    sget v1, Lcom/google/zxing/client/android/R$id;->zxing_camera_closed:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 56
    .line 57
    iget-object v0, p0, Lc9/b$f;->b:Lc9/b;

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lc9/b;->d(Lc9/b;)Lc9/d;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lc9/d;->b()V

    .line 65
    return-void
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
