.class public Loc0/c;
.super Ljava/lang/Object;
.source "LZ4Encoder.java"


# direct methods
.method public static a([B)[B
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencentcloudapi/cls/android/producer/common/LogException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v1, "CompressException"

    .line 3
    array-length v5, p0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lnet/jpountz/lz4/LZ4Factory;->fastestInstance()Lnet/jpountz/lz4/LZ4Factory;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lnet/jpountz/lz4/LZ4Factory;->fastCompressor()Lnet/jpountz/lz4/LZ4Compressor;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v5}, Lnet/jpountz/lz4/LZ4Compressor;->maxCompressedLength(I)I

    .line 15
    move-result v8

    .line 16
    .line 17
    new-array v6, v8, [B

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    move-object v3, p0

    .line 21
    .line 22
    .line 23
    :try_start_0
    invoke-virtual/range {v2 .. v8}, Lnet/jpountz/lz4/LZ4Compressor;->compress([BII[BII)I

    .line 24
    move-result p0
    :try_end_0
    .catch Lnet/jpountz/lz4/LZ4Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    if-lez p0, :cond_0

    .line 27
    .line 28
    new-array v0, p0, [B

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static {v6, v1, v0, v1, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    return-object v0

    .line 34
    .line 35
    :cond_0
    new-instance p0, Lcom/tencentcloudapi/cls/android/producer/common/LogException;

    .line 36
    .line 37
    const-string v0, "Invalid encoding size"

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v1, v0}, Lcom/tencentcloudapi/cls/android/producer/common/LogException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    throw p0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    move-object p0, v0

    .line 44
    .line 45
    new-instance v0, Lcom/tencentcloudapi/cls/android/producer/common/LogException;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1, p0}, Lcom/tencentcloudapi/cls/android/producer/common/LogException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    throw v0
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
.end method
