.class Landroidx/paging/TiledPagedList$1;
.super Landroidx/paging/PageResult$Receiver;
.source "TiledPagedList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/TiledPagedList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PageResult$Receiver<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/paging/TiledPagedList;


# direct methods
.method public constructor <init>(Landroidx/paging/TiledPagedList;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/paging/TiledPagedList$1;->this$0:Landroidx/paging/TiledPagedList;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/paging/PageResult$Receiver;-><init>()V

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
.end method


# virtual methods
.method public onPageResult(ILandroidx/paging/PageResult;)V
    .locals 8
    .param p2    # Landroidx/paging/PageResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/AnyThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/paging/PageResult<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Landroidx/paging/PageResult;->isInvalid()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/paging/TiledPagedList$1;->this$0:Landroidx/paging/TiledPagedList;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/paging/PagedList;->detach()V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/paging/TiledPagedList$1;->this$0:Landroidx/paging/TiledPagedList;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/paging/PagedList;->isDetached()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    :cond_1
    const/4 v0, 0x3

    .line 24
    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    if-ne p1, v0, :cond_2

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "unexpected resultType"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    .line 51
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    throw p2

    .line 53
    .line 54
    :cond_3
    :goto_0
    iget-object v3, p2, Landroidx/paging/PageResult;->page:Ljava/util/List;

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/paging/TiledPagedList$1;->this$0:Landroidx/paging/TiledPagedList;

    .line 57
    .line 58
    iget-object v1, v1, Landroidx/paging/PagedList;->mStorage:Landroidx/paging/PagedStorage;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Landroidx/paging/PagedStorage;->getPageCount()I

    .line 62
    move-result v1

    .line 63
    .line 64
    if-nez v1, :cond_4

    .line 65
    .line 66
    iget-object v7, p0, Landroidx/paging/TiledPagedList$1;->this$0:Landroidx/paging/TiledPagedList;

    .line 67
    .line 68
    iget-object v1, v7, Landroidx/paging/PagedList;->mStorage:Landroidx/paging/PagedStorage;

    .line 69
    .line 70
    iget v2, p2, Landroidx/paging/PageResult;->leadingNulls:I

    .line 71
    .line 72
    iget v4, p2, Landroidx/paging/PageResult;->trailingNulls:I

    .line 73
    .line 74
    iget v5, p2, Landroidx/paging/PageResult;->positionOffset:I

    .line 75
    .line 76
    iget-object v6, v7, Landroidx/paging/PagedList;->mConfig:Landroidx/paging/PagedList$Config;

    .line 77
    .line 78
    iget v6, v6, Landroidx/paging/PagedList$Config;->pageSize:I

    .line 79
    .line 80
    .line 81
    invoke-virtual/range {v1 .. v7}, Landroidx/paging/PagedStorage;->initAndSplit(ILjava/util/List;IIILandroidx/paging/PagedStorage$Callback;)V

    .line 82
    goto :goto_1

    .line 83
    .line 84
    :cond_4
    iget-object v7, p0, Landroidx/paging/TiledPagedList$1;->this$0:Landroidx/paging/TiledPagedList;

    .line 85
    .line 86
    iget-object v1, v7, Landroidx/paging/PagedList;->mStorage:Landroidx/paging/PagedStorage;

    .line 87
    .line 88
    iget v2, p2, Landroidx/paging/PageResult;->positionOffset:I

    .line 89
    .line 90
    iget v4, v7, Landroidx/paging/PagedList;->mLastLoad:I

    .line 91
    .line 92
    iget-object v5, v7, Landroidx/paging/PagedList;->mConfig:Landroidx/paging/PagedList$Config;

    .line 93
    .line 94
    iget v5, v5, Landroidx/paging/PagedList$Config;->maxSize:I

    .line 95
    .line 96
    iget v6, v7, Landroidx/paging/PagedList;->mRequiredRemainder:I

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v1 .. v7}, Landroidx/paging/PagedStorage;->tryInsertPageAndTrim(ILjava/util/List;IIILandroidx/paging/PagedStorage$Callback;)V

    .line 100
    .line 101
    :goto_1
    iget-object v1, p0, Landroidx/paging/TiledPagedList$1;->this$0:Landroidx/paging/TiledPagedList;

    .line 102
    .line 103
    iget-object v2, v1, Landroidx/paging/PagedList;->mBoundaryCallback:Landroidx/paging/PagedList$BoundaryCallback;

    .line 104
    .line 105
    if-eqz v2, :cond_a

    .line 106
    .line 107
    iget-object v1, v1, Landroidx/paging/PagedList;->mStorage:Landroidx/paging/PagedStorage;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Landroidx/paging/PagedStorage;->size()I

    .line 111
    move-result v1

    .line 112
    const/4 v2, 0x0

    .line 113
    const/4 v3, 0x1

    .line 114
    .line 115
    if-nez v1, :cond_5

    .line 116
    move v1, v3

    .line 117
    goto :goto_2

    .line 118
    :cond_5
    move v1, v2

    .line 119
    .line 120
    :goto_2
    if-nez v1, :cond_6

    .line 121
    .line 122
    iget v4, p2, Landroidx/paging/PageResult;->leadingNulls:I

    .line 123
    .line 124
    if-nez v4, :cond_6

    .line 125
    .line 126
    iget v4, p2, Landroidx/paging/PageResult;->positionOffset:I

    .line 127
    .line 128
    if-nez v4, :cond_6

    .line 129
    move v4, v3

    .line 130
    goto :goto_3

    .line 131
    :cond_6
    move v4, v2

    .line 132
    .line 133
    :goto_3
    iget-object v5, p0, Landroidx/paging/TiledPagedList$1;->this$0:Landroidx/paging/TiledPagedList;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5}, Landroidx/paging/PagedList;->size()I

    .line 137
    move-result v5

    .line 138
    .line 139
    if-nez v1, :cond_9

    .line 140
    .line 141
    if-nez p1, :cond_7

    .line 142
    .line 143
    iget v6, p2, Landroidx/paging/PageResult;->trailingNulls:I

    .line 144
    .line 145
    if-eqz v6, :cond_8

    .line 146
    .line 147
    :cond_7
    if-ne p1, v0, :cond_9

    .line 148
    .line 149
    iget p1, p2, Landroidx/paging/PageResult;->positionOffset:I

    .line 150
    .line 151
    iget-object p2, p0, Landroidx/paging/TiledPagedList$1;->this$0:Landroidx/paging/TiledPagedList;

    .line 152
    .line 153
    iget-object p2, p2, Landroidx/paging/PagedList;->mConfig:Landroidx/paging/PagedList$Config;

    .line 154
    .line 155
    iget p2, p2, Landroidx/paging/PagedList$Config;->pageSize:I

    .line 156
    add-int/2addr p1, p2

    .line 157
    .line 158
    if-lt p1, v5, :cond_9

    .line 159
    :cond_8
    move v2, v3

    .line 160
    .line 161
    :cond_9
    iget-object p1, p0, Landroidx/paging/TiledPagedList$1;->this$0:Landroidx/paging/TiledPagedList;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v1, v4, v2}, Landroidx/paging/PagedList;->deferBoundaryCallbacks(ZZZ)V

    .line 165
    :cond_a
    :goto_4
    return-void
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
