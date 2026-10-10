.class final Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;
.super Ljava/lang/Object;
.source "ModelMetadataInfo.java"


# instance fields
.field private final inputsMetadata:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/support/metadata/schema/TensorMetadata;",
            ">;"
        }
    .end annotation
.end field

.field private final minVersion:Ljava/lang/String;

.field private final modelMetadata:Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;

.field private final outputsMetadata:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/support/metadata/schema/TensorMetadata;",
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
    invoke-static {p1}, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->assertTFLiteMetadata(Ljava/nio/ByteBuffer;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;->getRootAsModelMetadata(Ljava/nio/ByteBuffer;)Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->modelMetadata:Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;->subgraphMetadataLength()I

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
    const-string v1, "The metadata flatbuffer does not contain any subgraph metadata."

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->getInputsMetadata(Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;)Ljava/util/List;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->inputsMetadata:Ljava/util/List;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->getOutputsMetadata(Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;)Ljava/util/List;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->outputsMetadata:Ljava/util/List;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;->minParserVersion()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->minVersion:Ljava/lang/String;

    .line 45
    return-void
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

.method private static assertTFLiteMetadata(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "Metadata flatbuffer cannot be null."

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;->ModelMetadataBufferHasIdentifier(Ljava/nio/ByteBuffer;)Z

    .line 9
    move-result p0

    .line 10
    .line 11
    const-string v0, "The identifier of the metadata is invalid. The buffer may not be a valid TFLite metadata flatbuffer."

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

.method private static getInputsMetadata(Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;",
            ")",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/support/metadata/schema/TensorMetadata;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;->subgraphMetadata(I)Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadata;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadata;->inputTensorMetadataLength()I

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
    invoke-virtual {p0, v0}, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadata;->inputTensorMetadata(I)Lorg/tensorflow/lite/support/metadata/schema/TensorMetadata;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    goto :goto_0

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 30
    move-result-object p0

    .line 31
    return-object p0
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

.method private static getOutputsMetadata(Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;",
            ")",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/support/metadata/schema/TensorMetadata;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;->subgraphMetadata(I)Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadata;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadata;->outputTensorMetadataLength()I

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
    invoke-virtual {p0, v0}, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadata;->outputTensorMetadata(I)Lorg/tensorflow/lite/support/metadata/schema/TensorMetadata;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    goto :goto_0

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 30
    move-result-object p0

    .line 31
    return-object p0
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


# virtual methods
.method public getInputTensorCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->inputsMetadata:Ljava/util/List;

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

.method public getInputTensorMetadata(I)Lorg/tensorflow/lite/support/metadata/schema/TensorMetadata;
    .locals 2

    .line 1
    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->inputsMetadata:Ljava/util/List;

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
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->inputsMetadata:Ljava/util/List;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    check-cast p1, Lorg/tensorflow/lite/support/metadata/schema/TensorMetadata;

    .line 27
    return-object p1
    .line 28
    .line 29
    .line 30
.end method

.method public getMininumParserVersion()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->minVersion:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
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

.method public getModelMetadata()Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->modelMetadata:Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;

    .line 3
    return-object v0
    .line 4
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

.method public getOutputTensorCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->outputsMetadata:Ljava/util/List;

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

.method public getOutputTensorMetadata(I)Lorg/tensorflow/lite/support/metadata/schema/TensorMetadata;
    .locals 2

    .line 1
    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->outputsMetadata:Ljava/util/List;

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
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ModelMetadataInfo;->outputsMetadata:Ljava/util/List;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    check-cast p1, Lorg/tensorflow/lite/support/metadata/schema/TensorMetadata;

    .line 27
    return-object p1
    .line 28
    .line 29
    .line 30
.end method
