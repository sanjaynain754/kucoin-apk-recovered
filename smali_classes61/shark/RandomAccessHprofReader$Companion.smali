.class public final Lshark/RandomAccessHprofReader$Companion;
.super Ljava/lang/Object;
.source "RandomAccessHprofReader.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lshark/RandomAccessHprofReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lshark/RandomAccessHprofReader$Companion;",
        "",
        "<init>",
        "()V",
        "Ljava/io/File;",
        "hprofFile",
        "Lshark/HprofHeader;",
        "hprofHeader",
        "Lshark/RandomAccessHprofReader;",
        "openReaderFor",
        "(Ljava/io/File;Lshark/HprofHeader;)Lshark/RandomAccessHprofReader;",
        "Lshark/t;",
        "hprofSourceProvider",
        "(Lshark/t;Lshark/HprofHeader;)Lshark/RandomAccessHprofReader;",
        "shark-hprof"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lshark/RandomAccessHprofReader$Companion;-><init>()V

    return-void
.end method

.method public static synthetic openReaderFor$default(Lshark/RandomAccessHprofReader$Companion;Ljava/io/File;Lshark/HprofHeader;ILjava/lang/Object;)Lshark/RandomAccessHprofReader;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    sget-object p2, Lshark/HprofHeader;->f:Lshark/HprofHeader$Companion;

    invoke-virtual {p2, p1}, Lshark/HprofHeader$Companion;->parseHeaderOf(Ljava/io/File;)Lshark/HprofHeader;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lshark/RandomAccessHprofReader$Companion;->openReaderFor(Ljava/io/File;Lshark/HprofHeader;)Lshark/RandomAccessHprofReader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic openReaderFor$default(Lshark/RandomAccessHprofReader$Companion;Lshark/t;Lshark/HprofHeader;ILjava/lang/Object;)Lshark/RandomAccessHprofReader;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 2
    invoke-interface {p1}, Lshark/t;->a()Lshark/s;

    move-result-object p2

    .line 3
    :try_start_0
    sget-object p3, Lshark/HprofHeader;->f:Lshark/HprofHeader$Companion;

    invoke-interface {p2}, Lshark/s;->H()Lokio/BufferedSource;

    move-result-object p4

    invoke-virtual {p3, p4}, Lshark/HprofHeader$Companion;->parseHeaderOf(Lokio/BufferedSource;)Lshark/HprofHeader;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p4, 0x0

    invoke-static {p2, p4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    move-object p2, p3

    goto :goto_0

    :catchall_0
    move-exception p0

    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    invoke-static {p2, p0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1

    :cond_0
    :goto_0
    invoke-virtual {p0, p1, p2}, Lshark/RandomAccessHprofReader$Companion;->openReaderFor(Lshark/t;Lshark/HprofHeader;)Lshark/RandomAccessHprofReader;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final openReaderFor(Ljava/io/File;Lshark/HprofHeader;)Lshark/RandomAccessHprofReader;
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lshark/HprofHeader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lshark/c;

    invoke-direct {v0, p1}, Lshark/c;-><init>(Ljava/io/File;)V

    .line 2
    invoke-virtual {p0, v0, p2}, Lshark/RandomAccessHprofReader$Companion;->openReaderFor(Lshark/t;Lshark/HprofHeader;)Lshark/RandomAccessHprofReader;

    move-result-object p1

    return-object p1
.end method

.method public final openReaderFor(Lshark/t;Lshark/HprofHeader;)Lshark/RandomAccessHprofReader;
    .locals 2
    .param p1    # Lshark/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lshark/HprofHeader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 3
    new-instance v0, Lshark/RandomAccessHprofReader;

    invoke-interface {p1}, Lshark/t;->a()Lshark/s;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lshark/RandomAccessHprofReader;-><init>(Lshark/s;Lshark/HprofHeader;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
