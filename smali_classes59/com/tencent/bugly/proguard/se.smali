.class public Lcom/tencent/bugly/proguard/se;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/se$b;,
        Lcom/tencent/bugly/proguard/se$c;
    }
.end annotation


# static fields
.field public static final g:I = 0xd

.field public static final h:I = 0x32

.field public static final i:Ljava/lang/String; = "bugly_crash_processing"

.field public static final j:Ljava/lang/String; = "_process_record.txt"

.field public static final k:Ljava/lang/String; = "processing_record_lock"

.field public static final l:J = 0x2710L

.field public static final m:I = 0x6

.field public static n:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/bugly/proguard/se;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/nio/MappedByteBuffer;

.field public b:Ljava/nio/channels/FileChannel;

.field public c:Z

.field public d:Z

.field public final e:Lcom/tencent/bugly/proguard/l2;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/se;->c:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/se;->d:Z

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/bugly/proguard/se;->e:Lcom/tencent/bugly/proguard/l2;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "bugly_crash_processing"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    iget-object p1, v0, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    .line 46
    .line 47
    const-string v0, "_process_record.txt"

    .line 48
    .line 49
    .line 50
    invoke-static {v1, p1, v0}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    iput-object p1, p0, Lcom/tencent/bugly/proguard/se;->f:Ljava/lang/String;

    .line 54
    return-void
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
.end method

.method public static declared-synchronized a()Lcom/tencent/bugly/proguard/se;
    .locals 3

    const-class v0, Lcom/tencent/bugly/proguard/se;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/se;->n:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/se;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    .line 3
    new-instance v1, Lcom/tencent/bugly/proguard/se;

    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/tencent/bugly/proguard/se;-><init>(Landroid/content/Context;)V

    .line 4
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lcom/tencent/bugly/proguard/se;->n:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .line 69
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/se$a;

    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/se$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public a(IZ)V
    .locals 1

    if-eqz p2, :cond_1

    .line 63
    iget-boolean p2, p0, Lcom/tencent/bugly/proguard/se;->c:Z

    if-eqz p2, :cond_1

    iget-boolean p2, p0, Lcom/tencent/bugly/proguard/se;->d:Z

    if-nez p2, :cond_1

    if-ltz p1, :cond_1

    const/16 p2, 0x10

    if-lt p1, p2, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    :try_start_0
    iget-object p2, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    if-eqz p2, :cond_1

    add-int/lit8 p1, p1, 0x6

    const/16 v0, 0x31

    .line 65
    invoke-virtual {p2, p1, v0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 66
    iget-object p1, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p1}, Ljava/nio/MappedByteBuffer;->force()Ljava/nio/MappedByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 67
    const-string/jumbo p2, "update attachment info in processing record failed, "

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    .line 68
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public a(IZLjava/lang/Throwable;)V
    .locals 12

    const-string v1, "\t"

    if-nez p2, :cond_0

    goto/16 :goto_e

    .line 5
    :cond_0
    iget-boolean p2, p0, Lcom/tencent/bugly/proguard/se;->c:Z

    const/4 v2, 0x1

    if-eqz p2, :cond_1

    .line 6
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/se;->d:Z

    return-void

    :cond_1
    const/4 p2, 0x0

    .line 7
    :try_start_0
    new-instance v3, Ljava/io/File;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/se;->f:Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 9
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_d

    .line 10
    :cond_2
    :goto_0
    new-array v4, p2, [B

    .line 11
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverO()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12
    invoke-static {v3}, Lfa0/c;->a(Ljava/io/File;)Ljava/nio/file/Path;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ej;->a(Ljava/nio/file/Path;)[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    .line 13
    :cond_3
    :try_start_1
    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 14
    :try_start_2
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v6, 0x1000

    .line 15
    new-array v6, v6, [B

    .line 16
    :goto_1
    invoke-virtual {v5, v6}, Ljava/io/FileInputStream;->read([B)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_4

    .line 17
    invoke-virtual {v0, v6, p2, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v6, v0

    goto :goto_3

    .line 18
    :cond_4
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 19
    :try_start_3
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_2
    move-object v0, v4

    goto :goto_6

    :catchall_2
    move-exception v0

    goto :goto_5

    .line 20
    :goto_3
    :try_start_4
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    :try_start_5
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 21
    :goto_5
    :try_start_6
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_2

    .line 22
    :goto_6
    :try_start_7
    new-instance v4, Ljava/io/RandomAccessFile;

    const-string/jumbo v5, "rw"

    invoke-direct {v4, v3, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 23
    :try_start_8
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v3

    iput-object v3, p0, Lcom/tencent/bugly/proguard/se;->b:Ljava/nio/channels/FileChannel;

    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-object v3, p0, Lcom/tencent/bugly/proguard/se;->e:Lcom/tencent/bugly/proguard/l2;

    iget-wide v7, v3, Lcom/tencent/bugly/proguard/l2;->c:J

    sub-long/2addr v5, v7

    long-to-int v3, v5

    div-int/lit16 v3, v3, 0x3e8

    .line 25
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\t0\t0\t0000000000000000\t"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lcom/tencent/bugly/proguard/l2;->I0:Ljava/lang/String;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/bugly/proguard/se;->e:Lcom/tencent/bugly/proguard/l2;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/bugly/proguard/se;->e:Lcom/tencent/bugly/proguard/l2;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/bugly/proguard/se;->e:Lcom/tencent/bugly/proguard/l2;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/bugly/proguard/se;->e:Lcom/tencent/bugly/proguard/l2;

    .line 26
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/bugly/proguard/se;->e:Lcom/tencent/bugly/proguard/l2;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/l2;->o:Ljava/lang/String;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\tJAVA_CRASH#"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/bugly/proguard/se;->e:Lcom/tencent/bugly/proguard/l2;

    .line 28
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->K()Z

    move-result p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_7

    .line 29
    array-length p3, v0

    if-lez p3, :cond_7

    .line 30
    array-length p3, v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr p3, v1

    .line 31
    iget-object v5, p0, Lcom/tencent/bugly/proguard/se;->b:Ljava/nio/channels/FileChannel;

    sget-object v6, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    int-to-long v9, p3

    const-wide/16 v7, 0x0

    invoke-virtual/range {v5 .. v10}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object p3

    iput-object p3, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    const/4 v1, 0x4

    .line 32
    invoke-virtual {p3, v1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 33
    iget-object p3, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p3

    const/16 v1, 0x24

    .line 34
    invoke-virtual {p3, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 35
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverKitKat()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 36
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, p3}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object p3

    goto :goto_7

    :catchall_4
    move-exception v0

    move-object p1, v0

    goto/16 :goto_9

    .line 37
    :cond_5
    const-string v1, "UTF-8"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object p3

    .line 38
    :goto_7
    sget-object v1, Lcom/tencent/bugly/proguard/l2;->I0:Ljava/lang/String;

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 39
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/se;->d:Z

    .line 40
    iget-object p1, p0, Lcom/tencent/bugly/proguard/se;->b:Ljava/nio/channels/FileChannel;

    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 41
    :try_start_9
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto/16 :goto_e

    :catchall_5
    move-exception v0

    move-object p1, v0

    goto :goto_b

    .line 42
    :cond_6
    :try_start_a
    iget-object p3, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p3, p2}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 43
    iget-object p3, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 44
    iget-object p3, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p3, v1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 45
    iget-object p3, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p3, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 46
    iget-object p3, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p3}, Ljava/nio/MappedByteBuffer;->force()Ljava/nio/MappedByteBuffer;

    move-object v7, v6

    .line 47
    iget-object v6, p0, Lcom/tencent/bugly/proguard/se;->b:Ljava/nio/channels/FileChannel;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    int-to-long v10, p1

    const-wide/16 v8, 0x0

    invoke-virtual/range {v6 .. v11}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    goto :goto_8

    .line 48
    :cond_7
    iget-object v5, p0, Lcom/tencent/bugly/proguard/se;->b:Ljava/nio/channels/FileChannel;

    sget-object v6, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    int-to-long v9, p3

    const-wide/16 v7, 0x0

    invoke-virtual/range {v5 .. v10}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object p3

    iput-object p3, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    .line 49
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 50
    iget-object p1, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p1}, Ljava/nio/MappedByteBuffer;->force()Ljava/nio/MappedByteBuffer;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 51
    :goto_8
    :try_start_b
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_c

    .line 52
    :goto_9
    :try_start_c
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    goto :goto_a

    :catchall_6
    move-exception v0

    move-object p3, v0

    :try_start_d
    invoke-virtual {p1, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw p1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 53
    :goto_b
    :try_start_e
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 54
    :goto_c
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/se;->c:Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    goto :goto_e

    .line 55
    :goto_d
    const-string/jumbo p3, "record processing file failed!\n"

    invoke-static {p3, p1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    .line 56
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    :goto_e
    return-void
.end method

.method public a(IZZ)V
    .locals 1

    if-eqz p3, :cond_2

    .line 57
    iget-boolean p3, p0, Lcom/tencent/bugly/proguard/se;->c:Z

    if-eqz p3, :cond_2

    iget-boolean p3, p0, Lcom/tencent/bugly/proguard/se;->d:Z

    if-eqz p3, :cond_0

    goto :goto_2

    :cond_0
    const/4 p3, 0x0

    .line 58
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    if-eqz v0, :cond_2

    .line 59
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    aget-byte p1, p1, p3

    invoke-virtual {v0, p3, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    if-eqz p2, :cond_1

    .line 60
    iget-object p1, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    const/4 p2, 0x2

    const/16 v0, 0x31

    invoke-virtual {p1, p2, v0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 61
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/tencent/bugly/proguard/se;->a:Ljava/nio/MappedByteBuffer;

    invoke-virtual {p1}, Ljava/nio/MappedByteBuffer;->force()Ljava/nio/MappedByteBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 62
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string/jumbo v0, "update processing file failed!\n"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, p3, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    return-void
.end method
