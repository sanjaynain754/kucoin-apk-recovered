.class public Lcom/journeyapps/barcodescanner/CameraPreview$d;
.super Ljava/lang/Object;
.source "CameraPreview.java"

# interfaces
.implements Lb9/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/journeyapps/barcodescanner/CameraPreview;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/journeyapps/barcodescanner/CameraPreview;


# direct methods
.method public constructor <init>(Lcom/journeyapps/barcodescanner/CameraPreview;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/journeyapps/barcodescanner/CameraPreview$d;->a:Lcom/journeyapps/barcodescanner/CameraPreview;

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
.method public onRotationChanged(I)V
    .locals 3

    .line 1
    .line 2
    iget-object p1, p0, Lcom/journeyapps/barcodescanner/CameraPreview$d;->a:Lcom/journeyapps/barcodescanner/CameraPreview;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/journeyapps/barcodescanner/CameraPreview;->g(Lcom/journeyapps/barcodescanner/CameraPreview;)Landroid/os/Handler;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    new-instance v0, Lcom/journeyapps/barcodescanner/CameraPreview$d$a;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/journeyapps/barcodescanner/CameraPreview$d$a;-><init>(Lcom/journeyapps/barcodescanner/CameraPreview$d;)V

    .line 12
    .line 13
    const-wide/16 v1, 0xfa

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
