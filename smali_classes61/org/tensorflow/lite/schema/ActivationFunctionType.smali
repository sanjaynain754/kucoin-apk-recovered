.class public final Lorg/tensorflow/lite/schema/ActivationFunctionType;
.super Ljava/lang/Object;
.source "ActivationFunctionType.java"


# static fields
.field public static final NONE:B = 0x0t

.field public static final RELU:B = 0x1t

.field public static final RELU6:B = 0x3t

.field public static final RELU_N1_TO_1:B = 0x2t

.field public static final SIGN_BIT:B = 0x5t

.field public static final TANH:B = 0x4t

.field public static final names:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    const-string v4, "TANH"

    .line 3
    .line 4
    const-string v5, "SIGN_BIT"

    .line 5
    .line 6
    const-string v0, "NONE"

    .line 7
    .line 8
    const-string v1, "RELU"

    .line 9
    .line 10
    const-string v2, "RELU_N1_TO_1"

    .line 11
    .line 12
    const-string v3, "RELU6"

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lorg/tensorflow/lite/schema/ActivationFunctionType;->names:[Ljava/lang/String;

    .line 19
    return-void
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
    sget-object v0, Lorg/tensorflow/lite/schema/ActivationFunctionType;->names:[Ljava/lang/String;

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
