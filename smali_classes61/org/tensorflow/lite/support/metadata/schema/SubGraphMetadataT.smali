.class public Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;
.super Ljava/lang/Object;
.source "SubGraphMetadataT.java"


# instance fields
.field private associatedFiles:[Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;

.field private customMetadata:[Lorg/tensorflow/lite/support/metadata/schema/CustomMetadataT;

.field private description:Ljava/lang/String;

.field private inputProcessUnits:[Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;

.field private inputTensorGroups:[Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;

.field private inputTensorMetadata:[Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;

.field private name:Ljava/lang/String;

.field private outputProcessUnits:[Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;

.field private outputTensorGroups:[Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;

.field private outputTensorMetadata:[Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->name:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->description:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->inputTensorMetadata:[Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;

    .line 11
    .line 12
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->outputTensorMetadata:[Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;

    .line 13
    .line 14
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->associatedFiles:[Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;

    .line 15
    .line 16
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->inputProcessUnits:[Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;

    .line 17
    .line 18
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->outputProcessUnits:[Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;

    .line 19
    .line 20
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->inputTensorGroups:[Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;

    .line 21
    .line 22
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->outputTensorGroups:[Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;

    .line 23
    .line 24
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->customMetadata:[Lorg/tensorflow/lite/support/metadata/schema/CustomMetadataT;

    .line 25
    return-void
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
.end method


# virtual methods
.method public getAssociatedFiles()[Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->associatedFiles:[Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;

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

.method public getCustomMetadata()[Lorg/tensorflow/lite/support/metadata/schema/CustomMetadataT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->customMetadata:[Lorg/tensorflow/lite/support/metadata/schema/CustomMetadataT;

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

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->description:Ljava/lang/String;

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

.method public getInputProcessUnits()[Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->inputProcessUnits:[Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;

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

.method public getInputTensorGroups()[Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->inputTensorGroups:[Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;

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

.method public getInputTensorMetadata()[Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->inputTensorMetadata:[Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;

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

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->name:Ljava/lang/String;

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

.method public getOutputProcessUnits()[Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->outputProcessUnits:[Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;

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

.method public getOutputTensorGroups()[Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->outputTensorGroups:[Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;

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

.method public getOutputTensorMetadata()[Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->outputTensorMetadata:[Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;

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

.method public setAssociatedFiles([Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->associatedFiles:[Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;

    .line 3
    return-void
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

.method public setCustomMetadata([Lorg/tensorflow/lite/support/metadata/schema/CustomMetadataT;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->customMetadata:[Lorg/tensorflow/lite/support/metadata/schema/CustomMetadataT;

    .line 3
    return-void
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

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->description:Ljava/lang/String;

    .line 3
    return-void
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

.method public setInputProcessUnits([Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->inputProcessUnits:[Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;

    .line 3
    return-void
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

.method public setInputTensorGroups([Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->inputTensorGroups:[Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;

    .line 3
    return-void
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

.method public setInputTensorMetadata([Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->inputTensorMetadata:[Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;

    .line 3
    return-void
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

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->name:Ljava/lang/String;

    .line 3
    return-void
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

.method public setOutputProcessUnits([Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->outputProcessUnits:[Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitT;

    .line 3
    return-void
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

.method public setOutputTensorGroups([Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->outputTensorGroups:[Lorg/tensorflow/lite/support/metadata/schema/TensorGroupT;

    .line 3
    return-void
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

.method public setOutputTensorMetadata([Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;->outputTensorMetadata:[Lorg/tensorflow/lite/support/metadata/schema/TensorMetadataT;

    .line 3
    return-void
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
