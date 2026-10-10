.class Landroidx/paging/PagedStorageDiffHelper;
.super Ljava/lang/Object;
.source "PagedStorageDiffHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static computeDiff(Landroidx/paging/PagedStorage;Landroidx/paging/PagedStorage;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)Landroidx/recyclerview/widget/DiffUtil$DiffResult;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/PagedStorage<",
            "TT;>;",
            "Landroidx/paging/PagedStorage<",
            "TT;>;",
            "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
            "TT;>;)",
            "Landroidx/recyclerview/widget/DiffUtil$DiffResult;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/paging/PagedStorage;->computeLeadingNulls()I

    .line 4
    move-result v2

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/paging/PagedStorage;->computeLeadingNulls()I

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/paging/PagedStorage;->size()I

    .line 12
    move-result v1

    .line 13
    sub-int/2addr v1, v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/paging/PagedStorage;->computeTrailingNulls()I

    .line 17
    move-result v3

    .line 18
    .line 19
    sub-int v5, v1, v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/paging/PagedStorage;->size()I

    .line 23
    move-result v1

    .line 24
    sub-int/2addr v1, v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/paging/PagedStorage;->computeTrailingNulls()I

    .line 28
    move-result v0

    .line 29
    .line 30
    sub-int v6, v1, v0

    .line 31
    .line 32
    new-instance v0, Landroidx/paging/PagedStorageDiffHelper$1;

    .line 33
    move-object v1, p0

    .line 34
    move-object v3, p1

    .line 35
    move-object v4, p2

    .line 36
    .line 37
    .line 38
    invoke-direct/range {v0 .. v6}, Landroidx/paging/PagedStorageDiffHelper$1;-><init>(Landroidx/paging/PagedStorage;ILandroidx/paging/PagedStorage;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;II)V

    .line 39
    const/4 p0, 0x1

    .line 40
    .line 41
    .line 42
    invoke-static {v0, p0}, Landroidx/recyclerview/widget/DiffUtil;->calculateDiff(Landroidx/recyclerview/widget/DiffUtil$Callback;Z)Landroidx/recyclerview/widget/DiffUtil$DiffResult;

    .line 43
    move-result-object p0

    .line 44
    return-object p0
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
.end method

.method public static dispatchDiff(Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/paging/PagedStorage;Landroidx/paging/PagedStorage;Landroidx/recyclerview/widget/DiffUtil$DiffResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/recyclerview/widget/ListUpdateCallback;",
            "Landroidx/paging/PagedStorage<",
            "TT;>;",
            "Landroidx/paging/PagedStorage<",
            "TT;>;",
            "Landroidx/recyclerview/widget/DiffUtil$DiffResult;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/paging/PagedStorage;->computeTrailingNulls()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/paging/PagedStorage;->computeTrailingNulls()I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/paging/PagedStorage;->computeLeadingNulls()I

    .line 12
    move-result v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Landroidx/paging/PagedStorage;->computeLeadingNulls()I

    .line 16
    move-result p2

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3, p0}, Landroidx/recyclerview/widget/DiffUtil$DiffResult;->dispatchUpdatesTo(Landroidx/recyclerview/widget/ListUpdateCallback;)V

    .line 28
    return-void

    .line 29
    .line 30
    :cond_0
    if-le v0, v1, :cond_1

    .line 31
    sub-int/2addr v0, v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/paging/PagedStorage;->size()I

    .line 35
    move-result p1

    .line 36
    sub-int/2addr p1, v0

    .line 37
    .line 38
    .line 39
    invoke-interface {p0, p1, v0}, Landroidx/recyclerview/widget/ListUpdateCallback;->onRemoved(II)V

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_1
    if-ge v0, v1, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/paging/PagedStorage;->size()I

    .line 46
    move-result p1

    .line 47
    sub-int/2addr v1, v0

    .line 48
    .line 49
    .line 50
    invoke-interface {p0, p1, v1}, Landroidx/recyclerview/widget/ListUpdateCallback;->onInserted(II)V

    .line 51
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 52
    .line 53
    if-le v2, p2, :cond_3

    .line 54
    sub-int/2addr v2, p2

    .line 55
    .line 56
    .line 57
    invoke-interface {p0, p1, v2}, Landroidx/recyclerview/widget/ListUpdateCallback;->onRemoved(II)V

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_3
    if-ge v2, p2, :cond_4

    .line 61
    .line 62
    sub-int v0, p2, v2

    .line 63
    .line 64
    .line 65
    invoke-interface {p0, p1, v0}, Landroidx/recyclerview/widget/ListUpdateCallback;->onInserted(II)V

    .line 66
    .line 67
    :cond_4
    :goto_1
    if-eqz p2, :cond_5

    .line 68
    .line 69
    new-instance p1, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;

    .line 70
    .line 71
    .line 72
    invoke-direct {p1, p2, p0}, Landroidx/paging/PagedStorageDiffHelper$OffsettingListUpdateCallback;-><init>(ILandroidx/recyclerview/widget/ListUpdateCallback;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/DiffUtil$DiffResult;->dispatchUpdatesTo(Landroidx/recyclerview/widget/ListUpdateCallback;)V

    .line 76
    return-void

    .line 77
    .line 78
    .line 79
    :cond_5
    invoke-virtual {p3, p0}, Landroidx/recyclerview/widget/DiffUtil$DiffResult;->dispatchUpdatesTo(Landroidx/recyclerview/widget/ListUpdateCallback;)V

    .line 80
    return-void
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
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
.end method

.method public static transformAnchorIndex(Landroidx/recyclerview/widget/DiffUtil$DiffResult;Landroidx/paging/PagedStorage;Landroidx/paging/PagedStorage;I)I
    .locals 7
    .param p0    # Landroidx/recyclerview/widget/DiffUtil$DiffResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/paging/PagedStorage;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/paging/PagedStorage;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/paging/PagedStorage;->computeLeadingNulls()I

    .line 4
    move-result v0

    .line 5
    .line 6
    sub-int v1, p3, v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/paging/PagedStorage;->size()I

    .line 10
    move-result v2

    .line 11
    sub-int/2addr v2, v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/paging/PagedStorage;->computeTrailingNulls()I

    .line 15
    move-result v0

    .line 16
    sub-int/2addr v2, v0

    .line 17
    const/4 v0, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    .line 20
    if-ltz v1, :cond_3

    .line 21
    .line 22
    if-ge v1, v2, :cond_3

    .line 23
    move v2, v0

    .line 24
    .line 25
    :goto_0
    const/16 v4, 0x1e

    .line 26
    .line 27
    if-ge v2, v4, :cond_3

    .line 28
    .line 29
    div-int/lit8 v4, v2, 0x2

    .line 30
    .line 31
    rem-int/lit8 v5, v2, 0x2

    .line 32
    const/4 v6, -0x1

    .line 33
    .line 34
    if-ne v5, v3, :cond_0

    .line 35
    move v5, v6

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    move v5, v3

    .line 38
    :goto_1
    mul-int/2addr v4, v5

    .line 39
    add-int/2addr v4, v1

    .line 40
    .line 41
    if-ltz v4, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/paging/PagedStorage;->getStorageCount()I

    .line 45
    move-result v5

    .line 46
    .line 47
    if-lt v4, v5, :cond_1

    .line 48
    goto :goto_2

    .line 49
    .line 50
    .line 51
    :cond_1
    :try_start_0
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/DiffUtil$DiffResult;->convertOldPositionToNew(I)I

    .line 52
    move-result v4

    .line 53
    .line 54
    if-eq v4, v6, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Landroidx/paging/PagedStorage;->getLeadingNullCount()I

    .line 58
    move-result p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    add-int/2addr v4, p0

    .line 60
    return v4

    .line 61
    .line 62
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 63
    goto :goto_0

    .line 64
    .line 65
    .line 66
    :catch_0
    :cond_3
    invoke-virtual {p2}, Landroidx/paging/PagedStorage;->size()I

    .line 67
    move-result p0

    .line 68
    sub-int/2addr p0, v3

    .line 69
    .line 70
    .line 71
    invoke-static {p3, p0}, Ljava/lang/Math;->min(II)I

    .line 72
    move-result p0

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 76
    move-result p0

    .line 77
    return p0
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
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
.end method
