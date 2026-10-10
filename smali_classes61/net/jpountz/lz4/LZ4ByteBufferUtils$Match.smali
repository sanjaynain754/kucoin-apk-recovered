.class Lnet/jpountz/lz4/LZ4ByteBufferUtils$Match;
.super Ljava/lang/Object;
.source "LZ4ByteBufferUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/jpountz/lz4/LZ4ByteBufferUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Match"
.end annotation


# instance fields
.field len:I

.field ref:I

.field start:I


# direct methods
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public end()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lnet/jpountz/lz4/LZ4ByteBufferUtils$Match;->start:I

    .line 3
    .line 4
    iget v1, p0, Lnet/jpountz/lz4/LZ4ByteBufferUtils$Match;->len:I

    .line 5
    add-int/2addr v0, v1

    .line 6
    return v0
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
.end method

.method public fix(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lnet/jpountz/lz4/LZ4ByteBufferUtils$Match;->start:I

    .line 3
    add-int/2addr v0, p1

    .line 4
    .line 5
    iput v0, p0, Lnet/jpountz/lz4/LZ4ByteBufferUtils$Match;->start:I

    .line 6
    .line 7
    iget v0, p0, Lnet/jpountz/lz4/LZ4ByteBufferUtils$Match;->ref:I

    .line 8
    add-int/2addr v0, p1

    .line 9
    .line 10
    iput v0, p0, Lnet/jpountz/lz4/LZ4ByteBufferUtils$Match;->ref:I

    .line 11
    .line 12
    iget v0, p0, Lnet/jpountz/lz4/LZ4ByteBufferUtils$Match;->len:I

    .line 13
    sub-int/2addr v0, p1

    .line 14
    .line 15
    iput v0, p0, Lnet/jpountz/lz4/LZ4ByteBufferUtils$Match;->len:I

    .line 16
    return-void
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
.end method
