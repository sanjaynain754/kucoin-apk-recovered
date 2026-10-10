.class public abstract Lcom/sumsub/sns/internal/features/data/network/prooface/q;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static a:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 8
    .line 9
    sput-object v0, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static a(J)[B
    .locals 9

    .line 7
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a:Ljava/util/concurrent/atomic/AtomicLong;

    const/16 p0, 0xf

    .line 8
    new-array p1, p0, [Ljava/lang/Integer;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p0, :cond_1

    .line 9
    sget-object v2, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 10
    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    const-wide v5, 0x5deece66dL

    mul-long/2addr v5, v3

    const-wide/16 v7, 0xb

    add-long/2addr v5, v7

    const-wide v7, 0xffffffffffffL

    and-long/2addr v5, v7

    .line 11
    invoke-virtual {v2, v3, v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v2, 0x10

    ushr-long v2, v5, v2

    long-to-int v2, v2

    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 13
    :cond_1
    aget-object p0, p1, v0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 v1, 0x5

    const/4 v2, 0x1

    .line 14
    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    mul-int/lit8 v2, v2, 0x3

    .line 16
    aget-object v3, p1, v2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-le v3, p0, :cond_2

    .line 17
    aget-object p0, p1, v2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    move v0, v2

    goto :goto_1

    :cond_3
    const/16 p0, 0xc

    .line 18
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 19
    aget-object v1, p1, v0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v0, 0x1

    .line 20
    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x2

    .line 21
    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 22
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    return-object p0
.end method

.method public static a([BIBJ)[B
    .locals 11

    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_1

    int-to-long v2, v1

    mul-long/2addr v2, p3

    add-long v4, v2, p3

    mul-long v6, v2, v2

    add-long/2addr v6, v2

    const/16 v8, 0x20

    ushr-long v9, v6, v8

    shl-long/2addr v6, v8

    or-long/2addr v6, v9

    mul-long/2addr v6, v6

    add-long/2addr v6, v4

    ushr-long v4, v6, v8

    shl-long/2addr v6, v8

    or-long/2addr v4, v6

    mul-long/2addr v4, v4

    add-long/2addr v4, v2

    ushr-long v2, v4, v8

    long-to-int v2, v2

    .line 1
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-ge v1, v0, :cond_0

    sub-int v3, p1, v1

    .line 2
    rem-int v3, v2, v3

    add-int/2addr v3, v1

    .line 3
    aget-byte v4, p0, v1

    .line 4
    aget-byte v5, p0, v3

    aput-byte v5, p0, v1

    .line 5
    aput-byte v4, p0, v3

    .line 6
    :cond_0
    aget-byte v3, p0, v1

    add-int v4, p2, v1

    add-int/2addr v4, v2

    add-int/lit8 v4, v4, 0x1

    xor-int v2, v3, v4

    int-to-byte v2, v2

    aput-byte v2, p0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object p0
.end method
