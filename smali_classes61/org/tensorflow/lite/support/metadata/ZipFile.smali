.class final Lorg/tensorflow/lite/support/metadata/ZipFile;
.super Ljava/lang/Object;
.source "ZipFile.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/tensorflow/lite/support/metadata/ZipFile$ZipConstants;,
        Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;,
        Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;
    }
.end annotation


# instance fields
.field private final archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

.field private final nameMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/ZipFile;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 6
    .line 7
    iput-object p2, p0, Lorg/tensorflow/lite/support/metadata/ZipFile;->nameMap:Ljava/util/Map;

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
.end method

.method public static createFrom(Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;)Lorg/tensorflow/lite/support/metadata/ZipFile;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    new-instance v0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;-><init>(Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;Lorg/tensorflow/lite/support/metadata/ZipFile$1;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->access$100(Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;)Ljava/util/Map;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    new-instance v1, Lorg/tensorflow/lite/support/metadata/ZipFile;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p0, v0}, Lorg/tensorflow/lite/support/metadata/ZipFile;-><init>(Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;Ljava/util/Map;)V

    .line 19
    return-object v1
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


# virtual methods
.method public close()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->close()V

    .line 6
    return-void
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

.method public getFileNames()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile;->nameMap:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getRawInputStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile;->nameMap:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    const-string v1, "The file, %s, does not exist in the zip file."

    .line 9
    .line 10
    .line 11
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 20
    .line 21
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile;->nameMap:Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    check-cast p1, Ljava/util/List;

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    check-cast p1, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;->getDataOffset()J

    .line 38
    move-result-wide v2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;->getSize()J

    .line 42
    move-result-wide v4

    .line 43
    .line 44
    new-instance v0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;

    .line 45
    .line 46
    iget-object v1, p0, Lorg/tensorflow/lite/support/metadata/ZipFile;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 47
    .line 48
    .line 49
    invoke-direct/range {v0 .. v5}, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;-><init>(Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;JJ)V

    .line 50
    return-object v0
    .line 51
    .line 52
    .line 53
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
    .line 96
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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
