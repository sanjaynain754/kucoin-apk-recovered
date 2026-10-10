.class public final Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileType;
.super Ljava/lang/Object;
.source "AssociatedFileType.java"


# static fields
.field public static final DESCRIPTIONS:B = 0x1t

.field public static final SCANN_INDEX_FILE:B = 0x6t

.field public static final TENSOR_AXIS_LABELS:B = 0x2t

.field public static final TENSOR_AXIS_SCORE_CALIBRATION:B = 0x4t

.field public static final TENSOR_VALUE_LABELS:B = 0x3t

.field public static final UNKNOWN:B = 0x0t

.field public static final VOCABULARY:B = 0x5t

.field public static final names:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    const-string v5, "VOCABULARY"

    .line 3
    .line 4
    const-string v6, "SCANN_INDEX_FILE"

    .line 5
    .line 6
    const-string v0, "UNKNOWN"

    .line 7
    .line 8
    const-string v1, "DESCRIPTIONS"

    .line 9
    .line 10
    const-string v2, "TENSOR_AXIS_LABELS"

    .line 11
    .line 12
    const-string v3, "TENSOR_VALUE_LABELS"

    .line 13
    .line 14
    const-string v4, "TENSOR_AXIS_SCORE_CALIBRATION"

    .line 15
    .line 16
    .line 17
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sput-object v0, Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileType;->names:[Ljava/lang/String;

    .line 21
    return-void
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
    sget-object v0, Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileType;->names:[Ljava/lang/String;

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
