.class public final Lcom/sumsub/sns/internal/log/utils/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Ljava/util/Random;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/util/Random;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/sumsub/sns/internal/log/utils/a;->a:Ljava/io/File;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/sumsub/sns/internal/log/utils/a;->b:Ljava/util/Random;

    .line 13
    return-void
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
.end method

.method public static a(Ljava/io/FileInputStream;)I
    .locals 3

    .line 43
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_3

    .line 44
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    if-ltz v1, :cond_2

    .line 45
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v2

    if-ltz v2, :cond_1

    .line 46
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-ltz p0, :cond_0

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    shl-int/lit8 v1, v2, 0x10

    add-int/2addr v0, v1

    shl-int/lit8 p0, p0, 0x18

    add-int/2addr v0, p0

    return v0

    .line 47
    :cond_0
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0

    .line 48
    :cond_1
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0

    .line 49
    :cond_2
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0

    .line 50
    :cond_3
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0
.end method

.method public static b(Ljava/io/FileInputStream;)J
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-ltz v4, :cond_3

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 15
    move-result v4

    .line 16
    int-to-long v4, v4

    .line 17
    .line 18
    cmp-long v6, v4, v2

    .line 19
    .line 20
    if-ltz v6, :cond_2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 24
    move-result v6

    .line 25
    int-to-long v6, v6

    .line 26
    .line 27
    cmp-long v8, v6, v2

    .line 28
    .line 29
    if-ltz v8, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 33
    move-result p0

    .line 34
    int-to-long v8, p0

    .line 35
    .line 36
    cmp-long p0, v8, v2

    .line 37
    .line 38
    if-ltz p0, :cond_0

    .line 39
    .line 40
    const/16 p0, 0x8

    .line 41
    .line 42
    shl-long v2, v4, p0

    .line 43
    add-long/2addr v0, v2

    .line 44
    .line 45
    const/16 p0, 0x10

    .line 46
    .line 47
    shl-long v2, v6, p0

    .line 48
    add-long/2addr v0, v2

    .line 49
    .line 50
    const/16 p0, 0x18

    .line 51
    .line 52
    shl-long v2, v8, p0

    .line 53
    add-long/2addr v0, v2

    .line 54
    return-wide v0

    .line 55
    .line 56
    :cond_0
    new-instance p0, Ljava/io/IOException;

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 60
    throw p0

    .line 61
    .line 62
    :cond_1
    new-instance p0, Ljava/io/IOException;

    .line 63
    .line 64
    .line 65
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 66
    throw p0

    .line 67
    .line 68
    :cond_2
    new-instance p0, Ljava/io/IOException;

    .line 69
    .line 70
    .line 71
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 72
    throw p0

    .line 73
    .line 74
    :cond_3
    new-instance p0, Ljava/io/IOException;

    .line 75
    .line 76
    .line 77
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 78
    throw p0
    .line 79
    .line 80
    .line 81
.end method


# virtual methods
.method public final a([B)V
    .locals 12

    const/16 v0, 0x10

    const/16 v1, 0x8

    .line 1
    iget-object v2, p0, Lcom/sumsub/sns/internal/log/utils/a;->a:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/sumsub/sns/internal/log/utils/a;->a:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 2
    :cond_0
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/sumsub/sns/internal/log/utils/a;->a:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v3

    iget-object v4, p0, Lcom/sumsub/sns/internal/log/utils/a;->b:Ljava/util/Random;

    invoke-virtual {v4}, Ljava/util/Random;->nextLong()J

    move-result-wide v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "_random_"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ".tmp"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object v3, p0, Lcom/sumsub/sns/internal/log/utils/a;->a:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 4
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 5
    :cond_1
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 6
    :try_start_0
    array-length v4, p1

    and-int/lit16 v5, v4, 0xff

    int-to-byte v5, v5

    .line 7
    invoke-virtual {v3, v5}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v5, v4, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    .line 8
    invoke-virtual {v3, v5}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v5, v4, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    .line 9
    invoke-virtual {v3, v5}, Ljava/io/OutputStream;->write(I)V

    const/16 v5, 0x18

    shr-int/2addr v4, v5

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    .line 10
    invoke-virtual {v3, v4}, Ljava/io/OutputStream;->write(I)V

    .line 11
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write([B)V

    .line 12
    new-instance v4, Ljava/util/zip/CRC32;

    invoke-direct {v4}, Ljava/util/zip/CRC32;-><init>()V

    .line 13
    invoke-virtual {v4, p1}, Ljava/util/zip/CRC32;->update([B)V

    .line 14
    invoke-virtual {v4}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v6

    const-wide/16 v8, 0xff

    and-long v10, v6, v8

    long-to-int p1, v10

    int-to-byte p1, p1

    .line 15
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    shr-long v10, v6, v1

    and-long/2addr v10, v8

    long-to-int p1, v10

    int-to-byte p1, p1

    .line 16
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    shr-long v0, v6, v0

    and-long/2addr v0, v8

    long-to-int p1, v0

    int-to-byte p1, p1

    .line 17
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    shr-long v0, v6, v5

    and-long/2addr v0, v8

    long-to-int p1, v0

    int-to-byte p1, p1

    .line 18
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    const/16 p1, 0x20

    shr-long v0, v6, p1

    and-long/2addr v0, v8

    long-to-int p1, v0

    int-to-byte p1, p1

    .line 19
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    const/16 p1, 0x28

    shr-long v0, v6, p1

    and-long/2addr v0, v8

    long-to-int p1, v0

    int-to-byte p1, p1

    .line 20
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    const/16 p1, 0x30

    shr-long v0, v6, p1

    and-long/2addr v0, v8

    long-to-int p1, v0

    int-to-byte p1, p1

    .line 21
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    const/16 p1, 0x38

    shr-long v0, v6, p1

    and-long/2addr v0, v8

    long-to-int p1, v0

    int-to-byte p1, p1

    .line 22
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write(I)V

    .line 23
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 24
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V

    .line 25
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 26
    invoke-static {v3, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 27
    iget-object p1, p0, Lcom/sumsub/sns/internal/log/utils/a;->a:Ljava/io/File;

    invoke-virtual {v2, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    return-void

    :catchall_0
    move-exception p1

    .line 28
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v3, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final a()[B
    .locals 9

    .line 29
    iget-object v0, p0, Lcom/sumsub/sns/internal/log/utils/a;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 30
    :cond_0
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v2, p0, Lcom/sumsub/sns/internal/log/utils/a;->a:Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 31
    :try_start_0
    invoke-static {v0}, Lcom/sumsub/sns/internal/log/utils/a;->a(Ljava/io/FileInputStream;)I

    move-result v2

    .line 32
    new-array v3, v2, [B

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_3

    sub-int v5, v2, v4

    .line 33
    invoke-virtual {v0, v3, v4, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-lez v5, :cond_1

    add-int/2addr v4, v5

    goto :goto_0

    :cond_1
    if-ltz v5, :cond_2

    .line 34
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 35
    :cond_2
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    throw v1

    .line 36
    :cond_3
    new-instance v2, Ljava/util/zip/CRC32;

    invoke-direct {v2}, Ljava/util/zip/CRC32;-><init>()V

    .line 37
    invoke-virtual {v2, v3}, Ljava/util/zip/CRC32;->update([B)V

    .line 38
    invoke-static {v0}, Lcom/sumsub/sns/internal/log/utils/a;->b(Ljava/io/FileInputStream;)J

    move-result-wide v4

    .line 39
    invoke-static {v0}, Lcom/sumsub/sns/internal/log/utils/a;->b(Ljava/io/FileInputStream;)J

    move-result-wide v6

    const/16 v8, 0x20

    shl-long/2addr v6, v8

    add-long/2addr v4, v6

    .line 40
    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v2, v4, v6

    if-eqz v2, :cond_4

    .line 41
    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v1

    .line 42
    :cond_4
    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v3

    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method
