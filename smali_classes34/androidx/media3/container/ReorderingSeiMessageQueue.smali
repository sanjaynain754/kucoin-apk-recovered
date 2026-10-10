.class public final Landroidx/media3/container/ReorderingSeiMessageQueue;
.super Ljava/lang/Object;
.source "ReorderingSeiMessageQueue.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/container/ReorderingSeiMessageQueue$SeiConsumer;,
        Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;
    }
.end annotation


# instance fields
.field private lastQueuedMessage:Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final pendingSeiMessages:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue<",
            "Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;",
            ">;"
        }
    .end annotation
.end field

.field private reorderingQueueSize:I

.field private final seiConsumer:Landroidx/media3/container/ReorderingSeiMessageQueue$SeiConsumer;

.field private final unusedParsableByteArrays:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Landroidx/media3/common/util/ParsableByteArray;",
            ">;"
        }
    .end annotation
.end field

.field private final unusedSampleSeiMessages:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/media3/container/ReorderingSeiMessageQueue$SeiConsumer;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->seiConsumer:Landroidx/media3/container/ReorderingSeiMessageQueue$SeiConsumer;

    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 11
    .line 12
    iput-object p1, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->unusedParsableByteArrays:Ljava/util/ArrayDeque;

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayDeque;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 18
    .line 19
    iput-object p1, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->unusedSampleSeiMessages:Ljava/util/ArrayDeque;

    .line 20
    .line 21
    new-instance p1, Ljava/util/PriorityQueue;

    .line 22
    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/PriorityQueue;-><init>()V

    .line 25
    .line 26
    iput-object p1, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->pendingSeiMessages:Ljava/util/PriorityQueue;

    .line 27
    const/4 p1, -0x1

    .line 28
    .line 29
    iput p1, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->reorderingQueueSize:I

    .line 30
    return-void
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
.end method

.method private copy(Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/common/util/ParsableByteArray;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->unusedParsableByteArrays:Ljava/util/ArrayDeque;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroidx/media3/common/util/ParsableByteArray;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/media3/common/util/ParsableByteArray;-><init>()V

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->unusedParsableByteArrays:Ljava/util/ArrayDeque;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Landroidx/media3/common/util/ParsableByteArray;

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 26
    move-result v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 37
    move-result p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 41
    move-result-object v2

    .line 42
    const/4 v3, 0x0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 46
    move-result v4

    .line 47
    .line 48
    .line 49
    invoke-static {v1, p1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 50
    return-object v0
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

.method private flushQueueDownToSize(I)V
    .locals 6

    .line 1
    .line 2
    :goto_0
    iget-object v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->pendingSeiMessages:Ljava/util/PriorityQueue;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-le v0, p1, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->pendingSeiMessages:Ljava/util/PriorityQueue;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Landroidx/media3/common/util/Util;->castNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;

    .line 23
    const/4 v1, 0x0

    .line 24
    .line 25
    :goto_1
    iget-object v2, v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;->nalBuffers:Ljava/util/List;

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 29
    move-result v2

    .line 30
    .line 31
    if-ge v1, v2, :cond_0

    .line 32
    .line 33
    iget-object v2, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->seiConsumer:Landroidx/media3/container/ReorderingSeiMessageQueue$SeiConsumer;

    .line 34
    .line 35
    iget-wide v3, v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;->presentationTimeUs:J

    .line 36
    .line 37
    iget-object v5, v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;->nalBuffers:Ljava/util/List;

    .line 38
    .line 39
    .line 40
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    check-cast v5, Landroidx/media3/common/util/ParsableByteArray;

    .line 44
    .line 45
    .line 46
    invoke-interface {v2, v3, v4, v5}, Landroidx/media3/container/ReorderingSeiMessageQueue$SeiConsumer;->consume(JLandroidx/media3/common/util/ParsableByteArray;)V

    .line 47
    .line 48
    iget-object v2, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->unusedParsableByteArrays:Ljava/util/ArrayDeque;

    .line 49
    .line 50
    iget-object v3, v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;->nalBuffers:Ljava/util/List;

    .line 51
    .line 52
    .line 53
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    check-cast v3, Landroidx/media3/common/util/ParsableByteArray;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x1

    .line 62
    goto :goto_1

    .line 63
    .line 64
    :cond_0
    iget-object v1, v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;->nalBuffers:Ljava/util/List;

    .line 65
    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 68
    .line 69
    iget-object v1, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->lastQueuedMessage:Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;

    .line 70
    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    iget-wide v1, v1, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;->presentationTimeUs:J

    .line 74
    .line 75
    iget-wide v3, v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;->presentationTimeUs:J

    .line 76
    .line 77
    cmp-long v1, v1, v3

    .line 78
    .line 79
    if-nez v1, :cond_1

    .line 80
    const/4 v1, 0x0

    .line 81
    .line 82
    iput-object v1, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->lastQueuedMessage:Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;

    .line 83
    .line 84
    :cond_1
    iget-object v1, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->unusedSampleSeiMessages:Ljava/util/ArrayDeque;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    return-void
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
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
.end method


# virtual methods
.method public add(JLandroidx/media3/common/util/ParsableByteArray;)V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->reorderingQueueSize:I

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->pendingSeiMessages:Ljava/util/PriorityQueue;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    .line 13
    move-result v0

    .line 14
    .line 15
    iget v2, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->reorderingQueueSize:I

    .line 16
    .line 17
    if-lt v0, v2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->pendingSeiMessages:Ljava/util/PriorityQueue;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Landroidx/media3/common/util/Util;->castNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    check-cast v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;

    .line 32
    .line 33
    iget-wide v2, v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;->presentationTimeUs:J

    .line 34
    .line 35
    cmp-long v0, p1, v2

    .line 36
    .line 37
    if-gez v0, :cond_0

    .line 38
    goto :goto_1

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-direct {p0, p3}, Landroidx/media3/container/ReorderingSeiMessageQueue;->copy(Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/common/util/ParsableByteArray;

    .line 42
    move-result-object p3

    .line 43
    .line 44
    iget-object v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->lastQueuedMessage:Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-wide v2, v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;->presentationTimeUs:J

    .line 49
    .line 50
    cmp-long v2, p1, v2

    .line 51
    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    iget-object p1, v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;->nalBuffers:Ljava/util/List;

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    return-void

    .line 59
    .line 60
    :cond_1
    iget-object v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->unusedSampleSeiMessages:Ljava/util/ArrayDeque;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 64
    move-result v0

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    new-instance v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;

    .line 69
    .line 70
    .line 71
    invoke-direct {v0}, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;-><init>()V

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_2
    iget-object v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->unusedSampleSeiMessages:Ljava/util/ArrayDeque;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    check-cast v0, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;

    .line 81
    .line 82
    .line 83
    :goto_0
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;->init(JLandroidx/media3/common/util/ParsableByteArray;)V

    .line 84
    .line 85
    iget-object p1, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->pendingSeiMessages:Ljava/util/PriorityQueue;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    iput-object v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->lastQueuedMessage:Landroidx/media3/container/ReorderingSeiMessageQueue$SampleSeiMessages;

    .line 91
    .line 92
    iget p1, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->reorderingQueueSize:I

    .line 93
    .line 94
    if-eq p1, v1, :cond_3

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, p1}, Landroidx/media3/container/ReorderingSeiMessageQueue;->flushQueueDownToSize(I)V

    .line 98
    :cond_3
    return-void

    .line 99
    .line 100
    :cond_4
    :goto_1
    iget-object v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->seiConsumer:Landroidx/media3/container/ReorderingSeiMessageQueue$SeiConsumer;

    .line 101
    .line 102
    .line 103
    invoke-interface {v0, p1, p2, p3}, Landroidx/media3/container/ReorderingSeiMessageQueue$SeiConsumer;->consume(JLandroidx/media3/common/util/ParsableByteArray;)V

    .line 104
    return-void
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

.method public flush()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Landroidx/media3/container/ReorderingSeiMessageQueue;->flushQueueDownToSize(I)V

    .line 5
    return-void
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
.end method

.method public getMaxSize()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->reorderingQueueSize:I

    .line 3
    return v0
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
.end method

.method public setMaxSize(I)V
    .locals 1

    .line 1
    .line 2
    if-ltz p1, :cond_0

    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    .line 7
    .line 8
    :goto_0
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 9
    .line 10
    iput p1, p0, Landroidx/media3/container/ReorderingSeiMessageQueue;->reorderingQueueSize:I

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Landroidx/media3/container/ReorderingSeiMessageQueue;->flushQueueDownToSize(I)V

    .line 14
    return-void
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
