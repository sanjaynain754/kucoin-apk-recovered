.class public final Lorg/tensorflow/lite/support/metadata/schema/ContentProperties;
.super Ljava/lang/Object;
.source "ContentProperties.java"


# static fields
.field public static final AudioProperties:B = 0x4t

.field public static final BoundingBoxProperties:B = 0x3t

.field public static final FeatureProperties:B = 0x1t

.field public static final ImageProperties:B = 0x2t

.field public static final NONE:B

.field public static final names:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-string v0, "BoundingBoxProperties"

    .line 3
    .line 4
    const-string v1, "AudioProperties"

    .line 5
    .line 6
    const-string v2, "NONE"

    .line 7
    .line 8
    const-string v3, "FeatureProperties"

    .line 9
    .line 10
    const-string v4, "ImageProperties"

    .line 11
    .line 12
    .line 13
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lorg/tensorflow/lite/support/metadata/schema/ContentProperties;->names:[Ljava/lang/String;

    .line 17
    return-void
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
    sget-object v0, Lorg/tensorflow/lite/support/metadata/schema/ContentProperties;->names:[Ljava/lang/String;

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
