.class public final Lorg/tensorflow/lite/schema/SparseIndexVector;
.super Ljava/lang/Object;
.source "SparseIndexVector.java"


# static fields
.field public static final Int32Vector:B = 0x1t

.field public static final NONE:B = 0x0t

.field public static final Uint16Vector:B = 0x2t

.field public static final Uint8Vector:B = 0x3t

.field public static final names:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "Uint16Vector"

    .line 3
    .line 4
    const-string v1, "Uint8Vector"

    .line 5
    .line 6
    const-string v2, "NONE"

    .line 7
    .line 8
    const-string v3, "Int32Vector"

    .line 9
    .line 10
    .line 11
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sput-object v0, Lorg/tensorflow/lite/schema/SparseIndexVector;->names:[Ljava/lang/String;

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static name(I)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lorg/tensorflow/lite/schema/SparseIndexVector;->names:[Ljava/lang/String;

    .line 3
    .line 4
    aget-object p0, v0, p0

    .line 5
    return-object p0
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
.end method
