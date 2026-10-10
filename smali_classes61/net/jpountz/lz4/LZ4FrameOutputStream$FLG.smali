.class public Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;
.super Ljava/lang/Object;
.source "LZ4FrameOutputStream.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/jpountz/lz4/LZ4FrameOutputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FLG"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;
    }
.end annotation


# static fields
.field private static final DEFAULT_VERSION:I = 0x1


# instance fields
.field private final bitSet:Ljava/util/BitSet;

.field private final version:I


# direct methods
.method private constructor <init>(IB)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 8
    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p2, v0, v1

    invoke-static {v0}, Ljava/util/BitSet;->valueOf([B)Ljava/util/BitSet;

    move-result-object p2

    iput-object p2, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->bitSet:Ljava/util/BitSet;

    .line 9
    iput p1, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->version:I

    .line 10
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->validate()V

    return-void
.end method

.method public varargs constructor <init>(I[Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/BitSet;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->bitSet:Ljava/util/BitSet;

    .line 3
    iput p1, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->version:I

    if-eqz p2, :cond_0

    .line 4
    array-length p1, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    aget-object v1, p2, v0

    .line 5
    iget-object v2, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->bitSet:Ljava/util/BitSet;

    invoke-static {v1}, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;->access$100(Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;)I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->set(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->validate()V

    return-void
.end method

.method public static fromByte(B)Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;
    .locals 3

    .line 1
    .line 2
    and-int/lit16 v0, p0, 0xc0

    .line 3
    int-to-byte v0, v0

    .line 4
    .line 5
    new-instance v1, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;

    .line 6
    .line 7
    ushr-int/lit8 v2, v0, 0x6

    .line 8
    xor-int/2addr p0, v0

    .line 9
    int-to-byte p0, p0

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, v2, p0}, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;-><init>(IB)V

    .line 13
    return-object v1
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
.end method

.method private validate()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->bitSet:Ljava/util/BitSet;

    .line 3
    .line 4
    sget-object v1, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;->RESERVED_0:Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;->access$100(Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;)I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->bitSet:Ljava/util/BitSet;

    .line 17
    .line 18
    sget-object v1, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;->RESERVED_1:Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;->access$100(Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;)I

    .line 22
    move-result v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->bitSet:Ljava/util/BitSet;

    .line 31
    .line 32
    sget-object v1, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;->BLOCK_INDEPENDENCE:Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;->access$100(Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;)I

    .line 36
    move-result v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget v0, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->version:I

    .line 45
    const/4 v1, 0x1

    .line 46
    .line 47
    if-ne v0, v1, :cond_0

    .line 48
    return-void

    .line 49
    .line 50
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 51
    .line 52
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 53
    .line 54
    iget v2, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->version:I

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    .line 61
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    const-string v3, "Version %d is unsupported"

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 72
    throw v0

    .line 73
    .line 74
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 75
    .line 76
    const-string v1, "Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)"

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 80
    throw v0

    .line 81
    .line 82
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 83
    .line 84
    const-string v1, "Reserved1 field must be 0"

    .line 85
    .line 86
    .line 87
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 88
    throw v0

    .line 89
    .line 90
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 91
    .line 92
    const-string v1, "Reserved0 field must be 0"

    .line 93
    .line 94
    .line 95
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 96
    throw v0
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


# virtual methods
.method public getVersion()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->version:I

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
    .line 21
.end method

.method public isEnabled(Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->bitSet:Ljava/util/BitSet;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;->access$100(Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG$Bits;)I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    .line 10
    move-result p1

    .line 11
    return p1
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
.end method

.method public toByte()B
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->bitSet:Ljava/util/BitSet;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/BitSet;->toByteArray()[B

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    iget v1, p0, Lnet/jpountz/lz4/LZ4FrameOutputStream$FLG;->version:I

    .line 12
    .line 13
    and-int/lit8 v1, v1, 0x3

    .line 14
    .line 15
    shl-int/lit8 v1, v1, 0x6

    .line 16
    or-int/2addr v0, v1

    .line 17
    int-to-byte v0, v0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method
