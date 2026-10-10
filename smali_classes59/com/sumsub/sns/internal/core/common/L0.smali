.class public abstract Lcom/sumsub/sns/internal/core/common/L0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Ljava/io/InputStream;Ljava/io/OutputStream;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 5
    move-result v1

    .line 6
    .line 7
    const/high16 v2, 0x100000

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    .line 11
    move-result v1

    .line 12
    .line 13
    new-array v1, v1, [B

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1, v0, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 24
    goto :goto_0

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :catch_0
    return v0
    .line 34
    .line 35
    .line 36
    .line 37
.end method
