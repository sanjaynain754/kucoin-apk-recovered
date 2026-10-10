.class final Lorg/tensorflow/lite/NativeInterpreterWrapperExperimental;
.super Lorg/tensorflow/lite/NativeInterpreterWrapper;
.source "NativeInterpreterWrapperExperimental.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/tensorflow/lite/InterpreterImpl$Options;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/tensorflow/lite/NativeInterpreterWrapper;-><init>(Ljava/lang/String;Lorg/tensorflow/lite/InterpreterImpl$Options;)V

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;Lorg/tensorflow/lite/InterpreterImpl$Options;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lorg/tensorflow/lite/NativeInterpreterWrapper;-><init>(Ljava/nio/ByteBuffer;Lorg/tensorflow/lite/InterpreterImpl$Options;)V

    return-void
.end method

.method private static native resetVariableTensors(JJ)V
.end method


# virtual methods
.method public resetVariableTensors()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/tensorflow/lite/NativeInterpreterWrapper;->interpreterHandle:J

    iget-wide v2, p0, Lorg/tensorflow/lite/NativeInterpreterWrapper;->errorHandle:J

    invoke-static {v0, v1, v2, v3}, Lorg/tensorflow/lite/NativeInterpreterWrapperExperimental;->resetVariableTensors(JJ)V

    return-void
.end method
