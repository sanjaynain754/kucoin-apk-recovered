.class public Lcom/google/flatbuffers/FlexBuffers$Key;
.super Lcom/google/flatbuffers/FlexBuffers$Object;
.source "FlexBuffers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/FlexBuffers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Key"
.end annotation


# static fields
.field private static final EMPTY:Lcom/google/flatbuffers/FlexBuffers$Key;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/google/flatbuffers/FlexBuffers$Key;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/google/flatbuffers/FlexBuffers;->access$000()Lcom/google/flatbuffers/ReadBuf;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2, v2}, Lcom/google/flatbuffers/FlexBuffers$Key;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

    .line 11
    .line 12
    sput-object v0, Lcom/google/flatbuffers/FlexBuffers$Key;->EMPTY:Lcom/google/flatbuffers/FlexBuffers$Key;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>(Lcom/google/flatbuffers/ReadBuf;II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/google/flatbuffers/FlexBuffers$Object;-><init>(Lcom/google/flatbuffers/ReadBuf;II)V

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
    .line 22
    .line 23
    .line 24
    .line 25
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
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method

.method public static synthetic access$700()Lcom/google/flatbuffers/FlexBuffers$Key;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/flatbuffers/FlexBuffers$Key;->EMPTY:Lcom/google/flatbuffers/FlexBuffers$Key;

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
.end method

.method public static empty()Lcom/google/flatbuffers/FlexBuffers$Key;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/flatbuffers/FlexBuffers$Key;->EMPTY:Lcom/google/flatbuffers/FlexBuffers$Key;

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
.end method


# virtual methods
.method public compareTo([B)I
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :cond_0
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    .line 6
    .line 7
    .line 8
    invoke-interface {v2, v0}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    .line 9
    move-result v2

    .line 10
    .line 11
    aget-byte v3, p1, v1

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    sub-int/2addr v2, v3

    .line 15
    return v2

    .line 16
    .line 17
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    array-length v4, p1

    .line 21
    .line 22
    if-ne v1, v4, :cond_2

    .line 23
    sub-int/2addr v2, v3

    .line 24
    return v2

    .line 25
    .line 26
    :cond_2
    if-eq v2, v3, :cond_0

    .line 27
    sub-int/2addr v2, v3

    .line 28
    return v2
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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    .line 2
    instance-of v0, p1, Lcom/google/flatbuffers/FlexBuffers$Key;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    check-cast p1, Lcom/google/flatbuffers/FlexBuffers$Key;

    .line 9
    .line 10
    iget v0, p1, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    .line 11
    .line 12
    iget v2, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    .line 13
    .line 14
    if-ne v0, v2, :cond_1

    .line 15
    .line 16
    iget p1, p1, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    .line 17
    .line 18
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_1
    return v1
    .line 24
.end method

.method public hashCode()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    .line 3
    .line 4
    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->byteWidth:I

    .line 5
    xor-int/2addr v0, v1

    .line 6
    return v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 2
    iget v0, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-interface {v1, v0}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v1

    if-nez v1, :cond_0

    .line 4
    iget v1, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->end:I

    sub-int/2addr v0, v1

    .line 5
    iget-object v2, p0, Lcom/google/flatbuffers/FlexBuffers$Object;->bb:Lcom/google/flatbuffers/ReadBuf;

    invoke-interface {v2, v1, v0}, Lcom/google/flatbuffers/ReadBuf;->getString(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public toString(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/flatbuffers/FlexBuffers$Key;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p1
.end method
