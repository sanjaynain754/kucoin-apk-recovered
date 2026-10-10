.class final enum Lnet/jpountz/xxhash/XXHashJNI;
.super Ljava/lang/Enum;
.source "XXHashJNI.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/jpountz/xxhash/XXHashJNI;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic b:[Lnet/jpountz/xxhash/XXHashJNI;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v0, v0, [Lnet/jpountz/xxhash/XXHashJNI;

    .line 4
    .line 5
    sput-object v0, Lnet/jpountz/xxhash/XXHashJNI;->b:[Lnet/jpountz/xxhash/XXHashJNI;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lnet/jpountz/util/Native;->load()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lnet/jpountz/xxhash/XXHashJNI;->init()V

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

.method public static native XXH32([BIII)I
.end method

.method public static native XXH32BB(Ljava/nio/ByteBuffer;III)I
.end method

.method public static native XXH32_digest(J)I
.end method

.method public static native XXH32_free(J)V
.end method

.method public static native XXH32_init(I)J
.end method

.method public static native XXH32_update(J[BII)V
.end method

.method public static native XXH64([BIIJ)J
.end method

.method public static native XXH64BB(Ljava/nio/ByteBuffer;IIJ)J
.end method

.method public static native XXH64_digest(J)J
.end method

.method public static native XXH64_free(J)V
.end method

.method public static native XXH64_init(J)J
.end method

.method public static native XXH64_update(J[BII)V
.end method

.method private static native init()V
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/jpountz/xxhash/XXHashJNI;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lnet/jpountz/xxhash/XXHashJNI;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lnet/jpountz/xxhash/XXHashJNI;

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

.method public static values()[Lnet/jpountz/xxhash/XXHashJNI;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lnet/jpountz/xxhash/XXHashJNI;->b:[Lnet/jpountz/xxhash/XXHashJNI;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lnet/jpountz/xxhash/XXHashJNI;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lnet/jpountz/xxhash/XXHashJNI;

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
