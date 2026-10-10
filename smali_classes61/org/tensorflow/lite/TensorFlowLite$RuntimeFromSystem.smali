.class Lorg/tensorflow/lite/TensorFlowLite$RuntimeFromSystem;
.super Ljava/lang/Object;
.source "TensorFlowLite.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/tensorflow/lite/TensorFlowLite;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RuntimeFromSystem"
.end annotation


# static fields
.field static final TFLITE:Lorg/tensorflow/lite/TensorFlowLite$PossiblyAvailableRuntime;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lorg/tensorflow/lite/TensorFlowLite$PossiblyAvailableRuntime;

    .line 3
    .line 4
    const-string v1, "com.google.android.gms.tflite"

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "system"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Lorg/tensorflow/lite/TensorFlowLite$PossiblyAvailableRuntime;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    sput-object v0, Lorg/tensorflow/lite/TensorFlowLite$RuntimeFromSystem;->TFLITE:Lorg/tensorflow/lite/TensorFlowLite$PossiblyAvailableRuntime;

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
