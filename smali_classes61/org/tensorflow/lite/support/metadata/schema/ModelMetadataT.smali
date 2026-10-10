.class public Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;
.super Ljava/lang/Object;
.source "ModelMetadataT.java"


# instance fields
.field private associatedFiles:[Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;

.field private author:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private license:Ljava/lang/String;

.field private minParserVersion:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private subgraphMetadata:[Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;

.field private version:Ljava/lang/String;


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
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->name:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->description:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->version:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->subgraphMetadata:[Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;

    .line 13
    .line 14
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->author:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->license:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->associatedFiles:[Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;

    .line 19
    .line 20
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->minParserVersion:Ljava/lang/String;

    .line 21
    return-void
.end method

.method public static deserializeFromBinary([B)Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;->getRootAsModelMetadata(Ljava/nio/ByteBuffer;)Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;->unpack()Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;

    .line 12
    move-result-object p0

    .line 13
    return-object p0
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


# virtual methods
.method public getAssociatedFiles()[Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->associatedFiles:[Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;

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

.method public getAuthor()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->author:Ljava/lang/String;

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
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->description:Ljava/lang/String;

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

.method public getLicense()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->license:Ljava/lang/String;

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

.method public getMinParserVersion()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->minParserVersion:Ljava/lang/String;

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
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->name:Ljava/lang/String;

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

.method public getSubgraphMetadata()[Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->subgraphMetadata:[Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;

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

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->version:Ljava/lang/String;

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

.method public serializeToBinary()[B
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p0}, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;)I

    .line 9
    move-result v1

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadata;->finishModelMetadataBuffer(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public setAssociatedFiles([Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->associatedFiles:[Lorg/tensorflow/lite/support/metadata/schema/AssociatedFileT;

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

.method public setAuthor(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->author:Ljava/lang/String;

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
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->description:Ljava/lang/String;

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

.method public setLicense(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->license:Ljava/lang/String;

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

.method public setMinParserVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->minParserVersion:Ljava/lang/String;

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
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->name:Ljava/lang/String;

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

.method public setSubgraphMetadata([Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->subgraphMetadata:[Lorg/tensorflow/lite/support/metadata/schema/SubGraphMetadataT;

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

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/ModelMetadataT;->version:Ljava/lang/String;

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
