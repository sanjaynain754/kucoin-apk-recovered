.class final Lorg/tensorflow/lite/support/metadata/ModelInfo;
.super Ljava/lang/Object;
.source "ModelInfo.java"


# static fields
.field static final METADATA_FIELD_NAME:Ljava/lang/String; = "TFLITE_METADATA"


# instance fields
.field private final inputTensors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/schema/Tensor;",
            ">;"
        }
    .end annotation
.end field

.field private final model:Lorg/tensorflow/lite/schema/Model;

.field private final outputTensors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/schema/Tensor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lorg/tensorflow/lite/support/metadata/ModelInfo;->assertTFLiteModel(Ljava/nio/ByteBuffer;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lorg/tensorflow/lite/schema/Model;->getRootAsModel(Ljava/nio/ByteBuffer;)Lorg/tensorflow/lite/schema/Model;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->model:Lorg/tensorflow/lite/schema/Model;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/Model;->subgraphsLength()I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    .line 23
    :goto_0
    const-string v1, "The model does not contain any subgraph."

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lorg/tensorflow/lite/support/metadata/ModelInfo;->getInputTensors(Lorg/tensorflow/lite/schema/Model;)Ljava/util/List;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->inputTensors:Ljava/util/List;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lorg/tensorflow/lite/support/metadata/ModelInfo;->getOutputTensors(Lorg/tensorflow/lite/schema/Model;)Ljava/util/List;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->outputTensors:Ljava/util/List;

    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
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

.method private static assertTFLiteModel(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "Model flatbuffer cannot be null."

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lorg/tensorflow/lite/schema/Model;->ModelBufferHasIdentifier(Ljava/nio/ByteBuffer;)Z

    .line 9
    move-result p0

    .line 10
    .line 11
    const-string v0, "The identifier of the model is invalid. The buffer may not be a valid TFLite model flatbuffer."

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 15
    return-void
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

.method private static getInputTensors(Lorg/tensorflow/lite/schema/Model;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/tensorflow/lite/schema/Model;",
            ")",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/schema/Tensor;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lorg/tensorflow/lite/schema/Model;->subgraphs(I)Lorg/tensorflow/lite/schema/SubGraph;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/tensorflow/lite/schema/SubGraph;->inputsLength()I

    .line 9
    move-result v1

    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    :goto_0
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lorg/tensorflow/lite/schema/SubGraph;->inputs(I)I

    .line 20
    move-result v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v3}, Lorg/tensorflow/lite/schema/SubGraph;->tensors(I)Lorg/tensorflow/lite/schema/Tensor;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 34
    move-result-object p0

    .line 35
    return-object p0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
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

.method private static getOutputTensors(Lorg/tensorflow/lite/schema/Model;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/tensorflow/lite/schema/Model;",
            ")",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/schema/Tensor;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lorg/tensorflow/lite/schema/Model;->subgraphs(I)Lorg/tensorflow/lite/schema/SubGraph;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/tensorflow/lite/schema/SubGraph;->outputsLength()I

    .line 9
    move-result v1

    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    :goto_0
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lorg/tensorflow/lite/schema/SubGraph;->outputs(I)I

    .line 20
    move-result v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v3}, Lorg/tensorflow/lite/schema/SubGraph;->tensors(I)Lorg/tensorflow/lite/schema/Tensor;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 34
    move-result-object p0

    .line 35
    return-object p0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
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

.method private static getShape(Lorg/tensorflow/lite/schema/Tensor;)[I
    .locals 4

    .line 1
    .line 2
    const-string v0, "Tensor cannot be null."

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/tensorflow/lite/schema/Tensor;->shapeLength()I

    .line 9
    move-result v0

    .line 10
    .line 11
    new-array v1, v0, [I

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    :goto_0
    if-ge v2, v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lorg/tensorflow/lite/schema/Tensor;->shape(I)I

    .line 18
    move-result v3

    .line 19
    .line 20
    aput v3, v1, v2

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object v1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public getInputTensor(I)Lorg/tensorflow/lite/schema/Tensor;
    .locals 2

    .line 1
    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->inputTensors:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-ge p1, v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    .line 15
    :goto_0
    const-string v1, "The inputIndex specified is invalid."

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 19
    .line 20
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->inputTensors:Ljava/util/List;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    check-cast p1, Lorg/tensorflow/lite/schema/Tensor;

    .line 27
    return-object p1
    .line 28
    .line 29
    .line 30
.end method

.method public getInputTensorCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->inputTensors:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getInputTensorShape(I)[I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/tensorflow/lite/support/metadata/ModelInfo;->getInputTensor(I)Lorg/tensorflow/lite/schema/Tensor;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lorg/tensorflow/lite/support/metadata/ModelInfo;->getShape(Lorg/tensorflow/lite/schema/Tensor;)[I

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public getInputTensorType(I)B
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/tensorflow/lite/support/metadata/ModelInfo;->getInputTensor(I)Lorg/tensorflow/lite/schema/Tensor;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/Tensor;->type()B

    .line 8
    move-result p1

    .line 9
    return p1
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

.method public getMetadataBuffer()Ljava/nio/ByteBuffer;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->model:Lorg/tensorflow/lite/schema/Model;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/tensorflow/lite/schema/Model;->metadataLength()I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-object v1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    .line 13
    :goto_0
    iget-object v2, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->model:Lorg/tensorflow/lite/schema/Model;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Lorg/tensorflow/lite/schema/Model;->metadataLength()I

    .line 17
    move-result v2

    .line 18
    .line 19
    if-ge v0, v2, :cond_2

    .line 20
    .line 21
    iget-object v2, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->model:Lorg/tensorflow/lite/schema/Model;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Lorg/tensorflow/lite/schema/Model;->metadata(I)Lorg/tensorflow/lite/schema/Metadata;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lorg/tensorflow/lite/schema/Metadata;->name()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    const-string v4, "TFLITE_METADATA"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    move-result v3

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lorg/tensorflow/lite/schema/Metadata;->buffer()J

    .line 41
    move-result-wide v0

    .line 42
    .line 43
    iget-object v2, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->model:Lorg/tensorflow/lite/schema/Model;

    .line 44
    long-to-int v0, v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Lorg/tensorflow/lite/schema/Model;->buffers(I)Lorg/tensorflow/lite/schema/Buffer;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lorg/tensorflow/lite/schema/Buffer;->dataAsByteBuffer()Ljava/nio/ByteBuffer;

    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    .line 55
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return-object v1
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
.end method

.method public getOutputTensor(I)Lorg/tensorflow/lite/schema/Tensor;
    .locals 2

    .line 1
    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->outputTensors:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-ge p1, v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    .line 15
    :goto_0
    const-string v1, "The outputIndex specified is invalid."

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 19
    .line 20
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->outputTensors:Ljava/util/List;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    check-cast p1, Lorg/tensorflow/lite/schema/Tensor;

    .line 27
    return-object p1
    .line 28
    .line 29
    .line 30
.end method

.method public getOutputTensorCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelInfo;->outputTensors:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getOutputTensorShape(I)[I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/tensorflow/lite/support/metadata/ModelInfo;->getOutputTensor(I)Lorg/tensorflow/lite/schema/Tensor;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lorg/tensorflow/lite/support/metadata/ModelInfo;->getShape(Lorg/tensorflow/lite/schema/Tensor;)[I

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public getOutputTensorType(I)B
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/tensorflow/lite/support/metadata/ModelInfo;->getOutputTensor(I)Lorg/tensorflow/lite/schema/Tensor;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/Tensor;->type()B

    .line 8
    move-result p1

    .line 9
    return p1
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

.method public getQuantizationParams(Lorg/tensorflow/lite/schema/Tensor;)Lorg/tensorflow/lite/support/metadata/MetadataExtractor$QuantizationParams;
    .locals 4

    .line 1
    .line 2
    const-string v0, "Tensor cannot be null."

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/Tensor;->quantization()Lorg/tensorflow/lite/schema/QuantizationParameters;

    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    new-instance p1, Lorg/tensorflow/lite/support/metadata/MetadataExtractor$QuantizationParams;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, v1, v0}, Lorg/tensorflow/lite/support/metadata/MetadataExtractor$QuantizationParams;-><init>(FI)V

    .line 19
    return-object p1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/QuantizationParameters;->scaleLength()I

    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x1

    .line 25
    .line 26
    if-gt v1, v2, :cond_1

    .line 27
    move v1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v1, v0

    .line 30
    .line 31
    :goto_0
    const-string v3, "Input and output tensors do not support per-channel quantization."

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v3}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/QuantizationParameters;->zeroPointLength()I

    .line 38
    move-result v1

    .line 39
    .line 40
    if-gt v1, v2, :cond_2

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v2, v0

    .line 43
    .line 44
    .line 45
    :goto_1
    invoke-static {v2, v3}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lorg/tensorflow/lite/schema/QuantizationParameters;->scale(I)F

    .line 49
    move-result v1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lorg/tensorflow/lite/schema/QuantizationParameters;->zeroPoint(I)J

    .line 53
    move-result-wide v2

    .line 54
    long-to-int p1, v2

    .line 55
    .line 56
    new-instance v0, Lorg/tensorflow/lite/support/metadata/MetadataExtractor$QuantizationParams;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1, p1}, Lorg/tensorflow/lite/support/metadata/MetadataExtractor$QuantizationParams;-><init>(FI)V

    .line 60
    return-object v0
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
