.class public Lcom/google/flatbuffers/FlexBuffers$KeyVector;
.super Ljava/lang/Object;
.source "FlexBuffers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/FlexBuffers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "KeyVector"
.end annotation


# instance fields
.field private final vec:Lcom/google/flatbuffers/FlexBuffers$TypedVector;


# direct methods
.method public constructor <init>(Lcom/google/flatbuffers/FlexBuffers$TypedVector;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/flatbuffers/FlexBuffers$KeyVector;->vec:Lcom/google/flatbuffers/FlexBuffers$TypedVector;

    .line 6
    return-void
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
.end method


# virtual methods
.method public get(I)Lcom/google/flatbuffers/FlexBuffers$Key;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlexBuffers$KeyVector;->size()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/google/flatbuffers/FlexBuffers$Key;->access$700()Lcom/google/flatbuffers/FlexBuffers$Key;

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffers$KeyVector;->vec:Lcom/google/flatbuffers/FlexBuffers$TypedVector;

    .line 14
    .line 15
    iget v1, v0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    .line 16
    .line 17
    iget v0, v0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    .line 18
    mul-int/2addr p1, v0

    .line 19
    add-int/2addr v1, p1

    .line 20
    .line 21
    new-instance p1, Lcom/google/flatbuffers/FlexBuffers$Key;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffers$KeyVector;->vec:Lcom/google/flatbuffers/FlexBuffers$TypedVector;

    .line 24
    .line 25
    iget-object v2, v0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    .line 26
    .line 27
    iget v0, v0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v1, v0}, Lcom/google/flatbuffers/FlexBuffers;->access$200(Lcom/google/flatbuffers/ReadBuf;II)I

    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x1

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, v2, v0, v1}, Lcom/google/flatbuffers/FlexBuffers$Key;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    .line 36
    return-object p1
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
.end method

.method public size()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffers$KeyVector;->vec:Lcom/google/flatbuffers/FlexBuffers$TypedVector;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/flatbuffers/FlexBuffers$Vector;->size()I

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
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const/16 v1, 0x5b

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    :goto_0
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffers$KeyVector;->vec:Lcom/google/flatbuffers/FlexBuffers$TypedVector;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/google/flatbuffers/FlexBuffers$Vector;->size()I

    .line 17
    move-result v2

    .line 18
    .line 19
    if-ge v1, v2, :cond_1

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffers$KeyVector;->vec:Lcom/google/flatbuffers/FlexBuffers$TypedVector;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v1}, Lcom/google/flatbuffers/FlexBuffers$TypedVector;->get(I)Lcom/google/flatbuffers/FlexBuffers$Reference;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, Lcom/google/flatbuffers/FlexBuffers$Reference;->toString(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffers$KeyVector;->vec:Lcom/google/flatbuffers/FlexBuffers$TypedVector;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/google/flatbuffers/FlexBuffers$Vector;->size()I

    .line 34
    move-result v2

    .line 35
    .line 36
    add-int/lit8 v2, v2, -0x1

    .line 37
    .line 38
    if-eq v1, v2, :cond_0

    .line 39
    .line 40
    const-string v2, ", "

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_1
    const-string v1, "]"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    return-object v0
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
.end method
