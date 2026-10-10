.class public abstract Lio/chad/library/adapter/base/MultipleItemRvAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "MultipleItemRvAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V:",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">",
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "TT;TV;>;"
    }
.end annotation


# instance fields
.field private mItemProviders:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lio/chad/library/adapter/base/provider/BaseItemProvider;",
            ">;"
        }
    .end annotation
.end field

.field protected mProviderDelegate:Lio/chad/library/adapter/base/util/ProviderDelegate;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(Ljava/util/List;)V

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
.end method

.method private bindClick(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;ILio/chad/library/adapter/base/provider/BaseItemProvider;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;TT;I",
            "Lio/chad/library/adapter/base/provider/BaseItemProvider;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getOnItemClickListener()Lio/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getOnItemLongClickListener()Lio/chad/library/adapter/base/BaseQuickAdapter$OnItemLongClickListener;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_0
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    new-instance v3, Lio/chad/library/adapter/base/MultipleItemRvAdapter$2;

    .line 20
    move-object v4, p0

    .line 21
    move-object v6, p1

    .line 22
    move-object v7, p2

    .line 23
    move v8, p3

    .line 24
    move-object v5, p4

    .line 25
    .line 26
    .line 27
    invoke-direct/range {v3 .. v8}, Lio/chad/library/adapter/base/MultipleItemRvAdapter$2;-><init>(Lio/chad/library/adapter/base/MultipleItemRvAdapter;Lio/chad/library/adapter/base/provider/BaseItemProvider;Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object v6, p1

    .line 33
    move-object v7, p2

    .line 34
    move v8, p3

    .line 35
    move-object v5, p4

    .line 36
    .line 37
    :goto_0
    if-nez v1, :cond_2

    .line 38
    .line 39
    new-instance v4, Lio/chad/library/adapter/base/MultipleItemRvAdapter$3;

    .line 40
    move v9, v8

    .line 41
    move-object v8, v7

    .line 42
    move-object v7, v6

    .line 43
    move-object v6, v5

    .line 44
    move-object v5, p0

    .line 45
    .line 46
    .line 47
    invoke-direct/range {v4 .. v9}, Lio/chad/library/adapter/base/MultipleItemRvAdapter$3;-><init>(Lio/chad/library/adapter/base/MultipleItemRvAdapter;Lio/chad/library/adapter/base/provider/BaseItemProvider;Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 51
    :cond_2
    :goto_1
    return-void
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
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
.end method


# virtual methods
.method public convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;TT;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-object v1, p0, Lio/chad/library/adapter/base/MultipleItemRvAdapter;->mItemProviders:Landroid/util/SparseArray;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lio/chad/library/adapter/base/provider/BaseItemProvider;

    .line 13
    .line 14
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    iput-object v1, v0, Lio/chad/library/adapter/base/provider/BaseItemProvider;->mContext:Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 28
    move-result v2

    .line 29
    sub-int/2addr v1, v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1, p2, v1}, Lio/chad/library/adapter/base/provider/BaseItemProvider;->convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, p1, p2, v1, v0}, Lio/chad/library/adapter/base/MultipleItemRvAdapter;->bindClick(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;ILio/chad/library/adapter/base/provider/BaseItemProvider;)V

    .line 36
    return-void
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
.end method

.method public finishInitialize()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lio/chad/library/adapter/base/util/ProviderDelegate;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lio/chad/library/adapter/base/util/ProviderDelegate;-><init>()V

    .line 6
    .line 7
    iput-object v0, p0, Lio/chad/library/adapter/base/MultipleItemRvAdapter;->mProviderDelegate:Lio/chad/library/adapter/base/util/ProviderDelegate;

    .line 8
    .line 9
    new-instance v0, Lio/chad/library/adapter/base/MultipleItemRvAdapter$1;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, Lio/chad/library/adapter/base/MultipleItemRvAdapter$1;-><init>(Lio/chad/library/adapter/base/MultipleItemRvAdapter;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setMultiTypeDelegate(Lio/chad/library/adapter/base/util/MultiTypeDelegate;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lio/chad/library/adapter/base/MultipleItemRvAdapter;->registerItemProvider()V

    .line 19
    .line 20
    iget-object v0, p0, Lio/chad/library/adapter/base/MultipleItemRvAdapter;->mProviderDelegate:Lio/chad/library/adapter/base/util/ProviderDelegate;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lio/chad/library/adapter/base/util/ProviderDelegate;->getItemProviders()Landroid/util/SparseArray;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    iput-object v0, p0, Lio/chad/library/adapter/base/MultipleItemRvAdapter;->mItemProviders:Landroid/util/SparseArray;

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    :goto_0
    iget-object v1, p0, Lio/chad/library/adapter/base/MultipleItemRvAdapter;->mItemProviders:Landroid/util/SparseArray;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 33
    move-result v1

    .line 34
    .line 35
    if-ge v0, v1, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lio/chad/library/adapter/base/MultipleItemRvAdapter;->mItemProviders:Landroid/util/SparseArray;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 41
    move-result v1

    .line 42
    .line 43
    iget-object v2, p0, Lio/chad/library/adapter/base/MultipleItemRvAdapter;->mItemProviders:Landroid/util/SparseArray;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    check-cast v2, Lio/chad/library/adapter/base/provider/BaseItemProvider;

    .line 50
    .line 51
    iget-object v3, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mData:Ljava/util/List;

    .line 52
    .line 53
    iput-object v3, v2, Lio/chad/library/adapter/base/provider/BaseItemProvider;->mData:Ljava/util/List;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getMultiTypeDelegate()Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lio/chad/library/adapter/base/provider/BaseItemProvider;->layout()I

    .line 61
    move-result v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v1, v2}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 65
    .line 66
    add-int/lit8 v0, v0, 0x1

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    return-void
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
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public abstract getViewType(Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation
.end method

.method public abstract registerItemProvider()V
.end method
