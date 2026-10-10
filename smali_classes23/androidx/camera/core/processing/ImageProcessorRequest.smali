.class public Landroidx/camera/core/processing/ImageProcessorRequest;
.super Ljava/lang/Object;
.source "ImageProcessorRequest.java"

# interfaces
.implements Landroidx/camera/core/ImageProcessor$Request;


# instance fields
.field private final mImageProxy:Landroidx/camera/core/ImageProxy;

.field private final mOutputFormat:I


# direct methods
.method public constructor <init>(Landroidx/camera/core/ImageProxy;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/camera/core/processing/ImageProcessorRequest;->mImageProxy:Landroidx/camera/core/ImageProxy;

    .line 6
    .line 7
    iput p2, p0, Landroidx/camera/core/processing/ImageProcessorRequest;->mOutputFormat:I

    .line 8
    return-void
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


# virtual methods
.method public getInputImage()Landroidx/camera/core/ImageProxy;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/processing/ImageProcessorRequest;->mImageProxy:Landroidx/camera/core/ImageProxy;

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

.method public getOutputFormat()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/camera/core/processing/ImageProcessorRequest;->mOutputFormat:I

    .line 3
    return v0
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
