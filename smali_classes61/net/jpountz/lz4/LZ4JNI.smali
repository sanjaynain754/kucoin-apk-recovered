.class final enum Lnet/jpountz/lz4/LZ4JNI;
.super Ljava/lang/Enum;
.source "LZ4JNI.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/jpountz/lz4/LZ4JNI;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/jpountz/lz4/LZ4JNI;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v0, v0, [Lnet/jpountz/lz4/LZ4JNI;

    .line 4
    .line 5
    sput-object v0, Lnet/jpountz/lz4/LZ4JNI;->$VALUES:[Lnet/jpountz/lz4/LZ4JNI;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lnet/jpountz/util/Native;->load()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lnet/jpountz/lz4/LZ4JNI;->init()V

    .line 12
    return-void
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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

.method public static native LZ4_compressBound(I)I
.end method

.method public static native LZ4_compressHC([BLjava/nio/ByteBuffer;II[BLjava/nio/ByteBuffer;III)I
.end method

.method public static native LZ4_compress_limitedOutput([BLjava/nio/ByteBuffer;II[BLjava/nio/ByteBuffer;II)I
.end method

.method public static native LZ4_decompress_fast([BLjava/nio/ByteBuffer;I[BLjava/nio/ByteBuffer;II)I
.end method

.method public static native LZ4_decompress_safe([BLjava/nio/ByteBuffer;II[BLjava/nio/ByteBuffer;II)I
.end method

.method public static native init()V
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/jpountz/lz4/LZ4JNI;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lnet/jpountz/lz4/LZ4JNI;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lnet/jpountz/lz4/LZ4JNI;

    .line 9
    return-object p0
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
.end method

.method public static values()[Lnet/jpountz/lz4/LZ4JNI;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lnet/jpountz/lz4/LZ4JNI;->$VALUES:[Lnet/jpountz/lz4/LZ4JNI;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lnet/jpountz/lz4/LZ4JNI;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lnet/jpountz/lz4/LZ4JNI;

    .line 9
    return-object v0
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
