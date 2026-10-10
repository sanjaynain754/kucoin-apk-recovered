.class public Lorg/aomedia/avif/android/AvifDecoder;
.super Ljava/lang/Object;
.source "AvifDecoder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/aomedia/avif/android/AvifDecoder$Info;
    }
.end annotation


# instance fields
.field private alphaPresent:Z

.field private decoder:J

.field private depth:I

.field private frameCount:I

.field private frameDurations:[D

.field private height:I

.field private repetitionCount:I

.field private width:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    :try_start_0
    const-string v0, "avif_android"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    return-void
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

.method private constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 7
    move-result v0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, v0, p2}, Lorg/aomedia/avif/android/AvifDecoder;->createDecoder(Ljava/nio/ByteBuffer;II)J

    .line 11
    move-result-wide p1

    .line 12
    .line 13
    iput-wide p1, p0, Lorg/aomedia/avif/android/AvifDecoder;->decoder:J

    .line 14
    return-void
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

.method public static create(Ljava/nio/ByteBuffer;)Lorg/aomedia/avif/android/AvifDecoder;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-static {p0, v0}, Lorg/aomedia/avif/android/AvifDecoder;->create(Ljava/nio/ByteBuffer;I)Lorg/aomedia/avif/android/AvifDecoder;

    move-result-object p0

    return-object p0
.end method

.method public static create(Ljava/nio/ByteBuffer;I)Lorg/aomedia/avif/android/AvifDecoder;
    .locals 3
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 2
    new-instance v0, Lorg/aomedia/avif/android/AvifDecoder;

    invoke-direct {v0, p0, p1}, Lorg/aomedia/avif/android/AvifDecoder;-><init>(Ljava/nio/ByteBuffer;I)V

    .line 3
    iget-wide p0, v0, Lorg/aomedia/avif/android/AvifDecoder;->decoder:J

    const-wide/16 v1, 0x0

    cmp-long p0, p0, v1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    return-object v0
.end method

.method private native createDecoder(Ljava/nio/ByteBuffer;II)J
.end method

.method public static decode(Ljava/nio/ByteBuffer;ILandroid/graphics/Bitmap;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, p2, v0}, Lorg/aomedia/avif/android/AvifDecoder;->decode(Ljava/nio/ByteBuffer;ILandroid/graphics/Bitmap;I)Z

    move-result p0

    return p0
.end method

.method public static native decode(Ljava/nio/ByteBuffer;ILandroid/graphics/Bitmap;I)Z
.end method

.method private native destroyDecoder(J)V
.end method

.method public static native getInfo(Ljava/nio/ByteBuffer;ILorg/aomedia/avif/android/AvifDecoder$Info;)Z
.end method

.method public static isAvifImage(Ljava/nio/ByteBuffer;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-static {p0, v0}, Lorg/aomedia/avif/android/AvifDecoder;->isAvifImage(Ljava/nio/ByteBuffer;I)Z

    move-result p0

    return p0
.end method

.method private static native isAvifImage(Ljava/nio/ByteBuffer;I)Z
.end method

.method private native nextFrame(JLandroid/graphics/Bitmap;)I
.end method

.method private native nextFrameIndex(J)I
.end method

.method private native nthFrame(JILandroid/graphics/Bitmap;)I
.end method

.method public static native resultToString(I)Ljava/lang/String;
.end method

.method public static native versionString()Ljava/lang/String;
.end method


# virtual methods
.method public getAlphaPresent()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/aomedia/avif/android/AvifDecoder;->alphaPresent:Z

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

.method public getDepth()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/aomedia/avif/android/AvifDecoder;->depth:I

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

.method public getFrameCount()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/aomedia/avif/android/AvifDecoder;->frameCount:I

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

.method public getFrameDurations()[D
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/aomedia/avif/android/AvifDecoder;->frameDurations:[D

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

.method public getHeight()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/aomedia/avif/android/AvifDecoder;->height:I

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

.method public getRepetitionCount()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/aomedia/avif/android/AvifDecoder;->repetitionCount:I

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

.method public getWidth()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/aomedia/avif/android/AvifDecoder;->width:I

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

.method public nextFrame(Landroid/graphics/Bitmap;)I
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/aomedia/avif/android/AvifDecoder;->decoder:J

    invoke-direct {p0, v0, v1, p1}, Lorg/aomedia/avif/android/AvifDecoder;->nextFrame(JLandroid/graphics/Bitmap;)I

    move-result p1

    return p1
.end method

.method public nextFrameIndex()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/aomedia/avif/android/AvifDecoder;->decoder:J

    invoke-direct {p0, v0, v1}, Lorg/aomedia/avif/android/AvifDecoder;->nextFrameIndex(J)I

    move-result v0

    return v0
.end method

.method public nthFrame(ILandroid/graphics/Bitmap;)I
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/aomedia/avif/android/AvifDecoder;->decoder:J

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/aomedia/avif/android/AvifDecoder;->nthFrame(JILandroid/graphics/Bitmap;)I

    move-result p1

    return p1
.end method

.method public release()V
    .locals 5

    .line 1
    .line 2
    iget-wide v0, p0, Lorg/aomedia/avif/android/AvifDecoder;->decoder:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0, v1}, Lorg/aomedia/avif/android/AvifDecoder;->destroyDecoder(J)V

    .line 12
    .line 13
    :cond_0
    iput-wide v2, p0, Lorg/aomedia/avif/android/AvifDecoder;->decoder:J

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
