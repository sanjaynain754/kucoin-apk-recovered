.class final Landroidx/media3/exoplayer/source/SpannedData;
.super Ljava/lang/Object;
.source "SpannedData.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private memoizedReadIndex:I

.field private final removeCallback:Landroidx/media3/common/util/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/media3/common/util/Consumer<",
            "TV;>;"
        }
    .end annotation
.end field

.field private final spans:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/d0;

    invoke-direct {v0}, Landroidx/media3/exoplayer/source/d0;-><init>()V

    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/source/SpannedData;-><init>(Landroidx/media3/common/util/Consumer;)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/util/Consumer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/util/Consumer<",
            "TV;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SpannedData;->removeCallback:Landroidx/media3/common/util/Consumer;

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method


# virtual methods
.method public appendSpan(ILjava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 13
    move-result v0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 22
    .line 23
    iput v2, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 29
    move-result v0

    .line 30
    .line 31
    if-lez v0, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 37
    move-result v1

    .line 38
    sub-int/2addr v1, v3

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 42
    move-result v0

    .line 43
    .line 44
    if-lt p1, v0, :cond_2

    .line 45
    move v2, v3

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-static {v2}, Landroidx/media3/common/util/Assertions;->checkArgument(Z)V

    .line 49
    .line 50
    if-ne v0, p1, :cond_3

    .line 51
    .line 52
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->removeCallback:Landroidx/media3/common/util/Consumer;

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 58
    move-result v2

    .line 59
    sub-int/2addr v2, v3

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, v1}, Landroidx/media3/common/util/Consumer;->accept(Ljava/lang/Object;)V

    .line 67
    .line 68
    :cond_3
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 72
    return-void
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
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public clear()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 7
    move-result v1

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->removeCallback:Landroidx/media3/common/util/Consumer;

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v2}, Landroidx/media3/common/util/Consumer;->accept(Ljava/lang/Object;)V

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, -0x1

    .line 25
    .line 26
    iput v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 32
    return-void
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
.end method

.method public discardFrom(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    :goto_0
    if-ltz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 16
    move-result v1

    .line 17
    .line 18
    if-ge p1, v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->removeCallback:Landroidx/media3/common/util/Consumer;

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v2}, Landroidx/media3/common/util/Consumer;->accept(Ljava/lang/Object;)V

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->removeAt(I)V

    .line 35
    .line 36
    add-int/lit8 v0, v0, -0x1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 43
    move-result p1

    .line 44
    .line 45
    if-lez p1, :cond_1

    .line 46
    .line 47
    iget p1, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 48
    .line 49
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 53
    move-result v0

    .line 54
    .line 55
    add-int/lit8 v0, v0, -0x1

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 59
    move-result p1

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const/4 p1, -0x1

    .line 62
    .line 63
    :goto_1
    iput p1, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
.end method

.method public discardTo(I)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 7
    move-result v1

    .line 8
    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    if-ge v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 14
    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 19
    move-result v1

    .line 20
    .line 21
    if-lt p1, v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->removeCallback:Landroidx/media3/common/util/Consumer;

    .line 24
    .line 25
    iget-object v3, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v3}, Landroidx/media3/common/util/Consumer;->accept(Ljava/lang/Object;)V

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->removeAt(I)V

    .line 38
    .line 39
    iget v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 40
    .line 41
    if-lez v0, :cond_0

    .line 42
    .line 43
    add-int/lit8 v0, v0, -0x1

    .line 44
    .line 45
    iput v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 46
    :cond_0
    move v0, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
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
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    iput v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 9
    .line 10
    :cond_0
    :goto_0
    iget v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 11
    .line 12
    if-lez v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 18
    move-result v0

    .line 19
    .line 20
    if-ge p1, v0, :cond_1

    .line 21
    .line 22
    iget v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    iput v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_1
    :goto_1
    iget v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 35
    move-result v1

    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    if-ge v0, v1, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 42
    .line 43
    iget v1, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 49
    move-result v0

    .line 50
    .line 51
    if-lt p1, v0, :cond_2

    .line 52
    .line 53
    iget v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    iput v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 61
    .line 62
    iget v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->memoizedReadIndex:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 66
    move-result-object p1

    .line 67
    return-object p1
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
.end method

.method public getEndValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 6
    move-result v1

    .line 7
    .line 8
    add-int/lit8 v1, v1, -0x1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SpannedData;->spans:Landroid/util/SparseArray;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
