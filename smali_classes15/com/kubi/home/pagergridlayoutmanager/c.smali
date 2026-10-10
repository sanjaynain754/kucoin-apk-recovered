.class public Lcom/kubi/home/pagergridlayoutmanager/c;
.super Landroidx/recyclerview/widget/SnapHelper;
.source "PagerGridSnapHelper.java"


# instance fields
.field public a:Landroidx/recyclerview/widget/RecyclerView;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/SnapHelper;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    const/4 v1, 0x2

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 12
    return-void
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
.end method

.method public static a(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroid/graphics/Rect;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->canScrollHorizontally()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Lcom/kubi/home/pagergridlayoutmanager/c;->d(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 12
    move-result p0

    .line 13
    .line 14
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 15
    sub-int/2addr p0, p1

    .line 16
    return p0
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
.end method

.method public static b(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroid/graphics/Rect;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->canScrollVertically()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Lcom/kubi/home/pagergridlayoutmanager/c;->d(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 12
    move-result p0

    .line 13
    .line 14
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 15
    sub-int/2addr p0, p1

    .line 16
    return p0
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
.end method

.method public static c(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/home/pagergridlayoutmanager/c;->e(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/kubi/home/pagergridlayoutmanager/c;->f(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 8
    move-result p0

    .line 9
    .line 10
    div-int/lit8 p0, p0, 0x2

    .line 11
    add-int/2addr v0, p0

    .line 12
    return v0
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
.end method

.method public static d(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->canScrollHorizontally()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 14
    move-result p0

    .line 15
    :goto_0
    sub-int/2addr v0, p0

    .line 16
    return v0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 20
    move-result v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 24
    move-result p0

    .line 25
    goto :goto_0
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
.end method

.method public static e(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->canScrollHorizontally()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 15
    move-result p0

    .line 16
    return p0
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
.end method

.method public static f(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->canScrollHorizontally()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 14
    move-result v1

    .line 15
    sub-int/2addr v0, v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 19
    move-result p0

    .line 20
    :goto_0
    sub-int/2addr v0, p0

    .line 21
    return v0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 25
    move-result v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 29
    move-result v1

    .line 30
    sub-int/2addr v0, v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 34
    move-result p0

    .line 35
    goto :goto_0
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
.end method

.method public static g(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->canScrollHorizontally()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedRight(Landroid/view/View;)I

    .line 16
    move-result p0

    .line 17
    .line 18
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 19
    :goto_0
    sub-int/2addr p0, p1

    .line 20
    return p0

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedBottom(Landroid/view/View;)I

    .line 24
    move-result p0

    .line 25
    .line 26
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 27
    goto :goto_0
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
.end method

.method public static h(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->canScrollHorizontally()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedLeft(Landroid/view/View;)I

    .line 16
    move-result p0

    .line 17
    .line 18
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 19
    :goto_0
    sub-int/2addr p0, p1

    .line 20
    return p0

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedTop(Landroid/view/View;)I

    .line 24
    move-result p0

    .line 25
    .line 26
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 27
    goto :goto_0
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
.end method


# virtual methods
.method public attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/SnapHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->a:Landroidx/recyclerview/widget/RecyclerView;

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
.end method

.method public calculateDistanceToFinalSnap(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)[I
    .locals 5
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$LayoutManager;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 7
    move-result v1

    .line 8
    .line 9
    instance-of v2, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;

    .line 10
    .line 11
    if-eqz v2, :cond_4

    .line 12
    move-object v2, p1

    .line 13
    .line 14
    check-cast v2, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Lcom/kubi/home/pagergridlayoutmanager/c;->c(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 18
    move-result v3

    .line 19
    .line 20
    new-instance v4, Landroid/graphics/Rect;

    .line 21
    .line 22
    .line 23
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 30
    move-result p1

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-static {v2, p2}, Lcom/kubi/home/pagergridlayoutmanager/c;->g(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 36
    move-result p1

    .line 37
    .line 38
    if-lt p1, v3, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->z()Landroid/graphics/Rect;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-static {v2, p1, v4}, Lcom/kubi/home/pagergridlayoutmanager/b;->a(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 46
    move-result p2

    .line 47
    .line 48
    .line 49
    invoke-static {v2, p1, v4}, Lcom/kubi/home/pagergridlayoutmanager/b;->c(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 50
    move-result p1

    .line 51
    goto :goto_1

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-static {v2, v4}, Lcom/kubi/home/pagergridlayoutmanager/c;->a(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroid/graphics/Rect;)I

    .line 55
    move-result p1

    .line 56
    neg-int p2, p1

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v4}, Lcom/kubi/home/pagergridlayoutmanager/c;->b(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroid/graphics/Rect;)I

    .line 60
    move-result p1

    .line 61
    goto :goto_0

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-static {v2, p2}, Lcom/kubi/home/pagergridlayoutmanager/c;->h(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 65
    move-result p1

    .line 66
    .line 67
    if-gt p1, v3, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->z()Landroid/graphics/Rect;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    .line 74
    invoke-static {v2, p1, v4}, Lcom/kubi/home/pagergridlayoutmanager/b;->a(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 75
    move-result p2

    .line 76
    .line 77
    .line 78
    invoke-static {v2, p1, v4}, Lcom/kubi/home/pagergridlayoutmanager/b;->c(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 79
    move-result p1

    .line 80
    goto :goto_1

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-static {v2, v4}, Lcom/kubi/home/pagergridlayoutmanager/c;->a(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroid/graphics/Rect;)I

    .line 84
    move-result p1

    .line 85
    neg-int p2, p1

    .line 86
    .line 87
    .line 88
    invoke-static {v2, v4}, Lcom/kubi/home/pagergridlayoutmanager/c;->b(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroid/graphics/Rect;)I

    .line 89
    move-result p1

    .line 90
    :goto_0
    neg-int p1, p1

    .line 91
    :goto_1
    const/4 v3, 0x0

    .line 92
    .line 93
    aput p2, v0, v3

    .line 94
    const/4 v3, 0x1

    .line 95
    .line 96
    aput p1, v0, v3

    .line 97
    .line 98
    if-nez p2, :cond_3

    .line 99
    .line 100
    if-nez p1, :cond_3

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->b(I)V

    .line 104
    .line 105
    :cond_3
    sget-boolean p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 106
    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    new-instance p1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    const-string p2, "calculateDistanceToFinalSnap-targetView: "

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string p2, ",snapDistance: "

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 129
    move-result-object p2

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    const-string p2, "PagerGridSnapHelper"

    .line 139
    .line 140
    .line 141
    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    :cond_4
    return-object v0
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
.end method

.method public createScroller(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$LayoutManager;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    new-instance v1, Lcom/kubi/home/pagergridlayoutmanager/b;

    .line 13
    .line 14
    check-cast p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v0, p1}, Lcom/kubi/home/pagergridlayoutmanager/b;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;)V

    .line 18
    :cond_1
    return-object v1
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
.end method

.method public findSnapView(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroid/view/View;
    .locals 7
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_9

    .line 6
    move-object v0, p1

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/c;->j(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;)V

    .line 12
    .line 13
    iget-object v2, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 14
    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    const-string v4, "PagerGridSnapHelper"

    .line 21
    const/4 v5, 0x1

    .line 22
    .line 23
    if-eq v2, v5, :cond_5

    .line 24
    const/4 v6, 0x2

    .line 25
    .line 26
    if-eq v2, v6, :cond_1

    .line 27
    const/4 v0, 0x3

    .line 28
    .line 29
    if-eq v2, v0, :cond_0

    .line 30
    .line 31
    sget-boolean v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 32
    .line 33
    if-eqz v0, :cond_6

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    const-string v2, "findSnapView wrong -> snapList.size: "

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    iget-object v2, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 46
    .line 47
    .line 48
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 49
    move-result v2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_0
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    move-result-object v0

    .line 67
    move-object v1, v0

    .line 68
    .line 69
    check-cast v1, Landroid/view/View;

    .line 70
    goto :goto_1

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-static {v0}, Lcom/kubi/home/pagergridlayoutmanager/c;->c(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 74
    move-result v1

    .line 75
    .line 76
    iget-object v2, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 77
    .line 78
    .line 79
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    check-cast v2, Landroid/view/View;

    .line 83
    .line 84
    iget-object v3, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 85
    .line 86
    .line 87
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    move-result-object v3

    .line 89
    .line 90
    check-cast v3, Landroid/view/View;

    .line 91
    .line 92
    new-instance v5, Landroid/graphics/Rect;

    .line 93
    .line 94
    .line 95
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v3, v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 102
    move-result v5

    .line 103
    .line 104
    if-eqz v5, :cond_4

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v3}, Lcom/kubi/home/pagergridlayoutmanager/c;->g(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 108
    move-result v0

    .line 109
    .line 110
    if-gt v0, v1, :cond_2

    .line 111
    goto :goto_0

    .line 112
    :cond_2
    move-object v2, v3

    .line 113
    :cond_3
    :goto_0
    move-object v1, v2

    .line 114
    goto :goto_1

    .line 115
    .line 116
    .line 117
    :cond_4
    invoke-static {v0, v3}, Lcom/kubi/home/pagergridlayoutmanager/c;->h(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 118
    move-result v0

    .line 119
    .line 120
    if-gt v0, v1, :cond_3

    .line 121
    move-object v1, v3

    .line 122
    goto :goto_1

    .line 123
    .line 124
    :cond_5
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 125
    .line 126
    .line 127
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    move-result-object v0

    .line 129
    move-object v1, v0

    .line 130
    .line 131
    check-cast v1, Landroid/view/View;

    .line 132
    .line 133
    :cond_6
    :goto_1
    sget-boolean v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 134
    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    const-string v2, "findSnapView: position:"

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    if-eqz v1, :cond_7

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 151
    move-result p1

    .line 152
    goto :goto_2

    .line 153
    :cond_7
    const/4 p1, -0x1

    .line 154
    .line 155
    .line 156
    :goto_2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string p1, ", snapList.size:"

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    iget-object p1, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 164
    .line 165
    .line 166
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 167
    move-result p1

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    move-result-object p1

    .line 175
    .line 176
    .line 177
    invoke-static {v4, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    .line 179
    :cond_8
    iget-object p1, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 180
    .line 181
    .line 182
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 183
    :cond_9
    return-object v1
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
.end method

.method public findTargetSnapPosition(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;II)I
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    return v1

    .line 16
    .line 17
    :cond_1
    instance-of v0, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    return v1

    .line 21
    .line 22
    :cond_2
    check-cast p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->n()Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iget v0, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->g:I

    .line 29
    .line 30
    if-nez v0, :cond_3

    .line 31
    return v1

    .line 32
    .line 33
    .line 34
    :cond_3
    invoke-virtual {p0, p2, p3}, Landroidx/recyclerview/widget/SnapHelper;->calculateScrollDistance(II)[I

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->canScrollHorizontally()Z

    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x1

    .line 42
    .line 43
    if-eqz v2, :cond_4

    .line 44
    .line 45
    aget v0, v0, v3

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_4
    aget v0, v0, v4

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 52
    move-result v2

    .line 53
    .line 54
    if-eqz v2, :cond_5

    .line 55
    neg-int v0, v0

    .line 56
    .line 57
    .line 58
    :cond_5
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/home/pagergridlayoutmanager/c;->i(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;II)Z

    .line 59
    move-result v2

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lcom/kubi/home/pagergridlayoutmanager/c;->c(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 63
    move-result v5

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/c;->j(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;)V

    .line 67
    .line 68
    iget-object v6, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 69
    .line 70
    .line 71
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 72
    move-result v6

    .line 73
    .line 74
    const-string v7, "PagerGridSnapHelper"

    .line 75
    .line 76
    if-eq v6, v4, :cond_12

    .line 77
    const/4 v8, 0x2

    .line 78
    .line 79
    if-eq v6, v8, :cond_7

    .line 80
    const/4 v3, 0x3

    .line 81
    .line 82
    if-eq v6, v3, :cond_6

    .line 83
    .line 84
    sget-boolean p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 85
    .line 86
    if-eqz p1, :cond_1b

    .line 87
    .line 88
    new-instance p1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    const-string v3, "findTargetSnapPosition-snapList.size: "

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    iget-object v3, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 99
    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 102
    move-result v3

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    .line 112
    invoke-static {v7, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    goto/16 :goto_3

    .line 115
    .line 116
    :cond_6
    iget-object v1, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 117
    .line 118
    .line 119
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    check-cast v1, Landroid/view/View;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 126
    move-result v1

    .line 127
    .line 128
    goto/16 :goto_3

    .line 129
    .line 130
    :cond_7
    iget-object v6, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 131
    .line 132
    .line 133
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    move-result-object v3

    .line 135
    .line 136
    check-cast v3, Landroid/view/View;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 140
    .line 141
    iget-object v6, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 142
    .line 143
    .line 144
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    move-result-object v4

    .line 146
    .line 147
    check-cast v4, Landroid/view/View;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 151
    move-result v6

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 155
    move-result v8

    .line 156
    .line 157
    if-eqz v8, :cond_d

    .line 158
    .line 159
    if-eqz v2, :cond_b

    .line 160
    .line 161
    if-lt v0, v5, :cond_8

    .line 162
    goto :goto_1

    .line 163
    .line 164
    .line 165
    :cond_8
    invoke-static {p1, v4}, Lcom/kubi/home/pagergridlayoutmanager/c;->g(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 166
    move-result p1

    .line 167
    add-int/2addr p1, v0

    .line 168
    .line 169
    if-lt p1, v5, :cond_a

    .line 170
    :cond_9
    :goto_1
    move v1, v6

    .line 171
    .line 172
    goto/16 :goto_3

    .line 173
    .line 174
    :cond_a
    add-int/lit8 v6, v6, -0x1

    .line 175
    .line 176
    if-gez v6, :cond_9

    .line 177
    .line 178
    goto/16 :goto_3

    .line 179
    .line 180
    .line 181
    :cond_b
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 182
    move-result v4

    .line 183
    .line 184
    if-lt v4, v5, :cond_c

    .line 185
    .line 186
    add-int/lit8 v6, v6, -0x1

    .line 187
    .line 188
    if-gez v6, :cond_9

    .line 189
    .line 190
    goto/16 :goto_3

    .line 191
    .line 192
    .line 193
    :cond_c
    invoke-static {p1, v3}, Lcom/kubi/home/pagergridlayoutmanager/c;->h(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 194
    move-result p1

    .line 195
    .line 196
    .line 197
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 198
    move-result v3

    .line 199
    sub-int/2addr p1, v3

    .line 200
    .line 201
    if-gt p1, v5, :cond_9

    .line 202
    .line 203
    add-int/lit8 v6, v6, -0x1

    .line 204
    .line 205
    if-gez v6, :cond_9

    .line 206
    .line 207
    goto/16 :goto_3

    .line 208
    .line 209
    :cond_d
    if-eqz v2, :cond_10

    .line 210
    .line 211
    if-lt v0, v5, :cond_e

    .line 212
    goto :goto_1

    .line 213
    .line 214
    .line 215
    :cond_e
    invoke-static {p1, v4}, Lcom/kubi/home/pagergridlayoutmanager/c;->h(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 216
    move-result p1

    .line 217
    sub-int/2addr p1, v0

    .line 218
    .line 219
    if-gt p1, v5, :cond_f

    .line 220
    goto :goto_1

    .line 221
    .line 222
    :cond_f
    add-int/lit8 v6, v6, -0x1

    .line 223
    .line 224
    if-gez v6, :cond_9

    .line 225
    .line 226
    goto/16 :goto_3

    .line 227
    .line 228
    .line 229
    :cond_10
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 230
    move-result v4

    .line 231
    .line 232
    if-lt v4, v5, :cond_11

    .line 233
    .line 234
    add-int/lit8 v6, v6, -0x1

    .line 235
    .line 236
    if-gez v6, :cond_9

    .line 237
    .line 238
    goto/16 :goto_3

    .line 239
    .line 240
    .line 241
    :cond_11
    invoke-static {p1, v3}, Lcom/kubi/home/pagergridlayoutmanager/c;->g(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 242
    move-result p1

    .line 243
    .line 244
    .line 245
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 246
    move-result v3

    .line 247
    add-int/2addr p1, v3

    .line 248
    .line 249
    if-lt p1, v5, :cond_9

    .line 250
    .line 251
    add-int/lit8 v6, v6, -0x1

    .line 252
    .line 253
    if-gez v6, :cond_9

    .line 254
    .line 255
    goto/16 :goto_3

    .line 256
    .line 257
    :cond_12
    iget-object v4, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 258
    .line 259
    .line 260
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    move-result-object v3

    .line 262
    .line 263
    check-cast v3, Landroid/view/View;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 267
    move-result v4

    .line 268
    .line 269
    if-eqz v2, :cond_18

    .line 270
    .line 271
    if-lt v0, v5, :cond_13

    .line 272
    goto :goto_2

    .line 273
    .line 274
    .line 275
    :cond_13
    invoke-virtual {p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 276
    move-result v6

    .line 277
    .line 278
    if-eqz v6, :cond_16

    .line 279
    .line 280
    .line 281
    invoke-static {p1, v3}, Lcom/kubi/home/pagergridlayoutmanager/c;->g(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 282
    move-result p1

    .line 283
    add-int/2addr p1, v0

    .line 284
    .line 285
    if-lt p1, v5, :cond_15

    .line 286
    :cond_14
    :goto_2
    move v1, v4

    .line 287
    goto :goto_3

    .line 288
    .line 289
    :cond_15
    add-int/lit8 v4, v4, -0x1

    .line 290
    .line 291
    if-gez v4, :cond_14

    .line 292
    goto :goto_3

    .line 293
    .line 294
    .line 295
    :cond_16
    invoke-static {p1, v3}, Lcom/kubi/home/pagergridlayoutmanager/c;->h(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 296
    move-result p1

    .line 297
    sub-int/2addr p1, v0

    .line 298
    .line 299
    if-gt p1, v5, :cond_17

    .line 300
    goto :goto_2

    .line 301
    .line 302
    :cond_17
    add-int/lit8 v4, v4, -0x1

    .line 303
    .line 304
    if-gez v4, :cond_14

    .line 305
    goto :goto_3

    .line 306
    .line 307
    .line 308
    :cond_18
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 309
    move-result v6

    .line 310
    .line 311
    if-lt v6, v5, :cond_19

    .line 312
    .line 313
    add-int/lit8 v4, v4, -0x1

    .line 314
    .line 315
    if-gez v4, :cond_14

    .line 316
    goto :goto_3

    .line 317
    .line 318
    .line 319
    :cond_19
    invoke-virtual {p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 320
    move-result v6

    .line 321
    .line 322
    if-eqz v6, :cond_1a

    .line 323
    .line 324
    .line 325
    invoke-static {p1, v3}, Lcom/kubi/home/pagergridlayoutmanager/c;->h(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 326
    move-result p1

    .line 327
    .line 328
    .line 329
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 330
    move-result v3

    .line 331
    sub-int/2addr p1, v3

    .line 332
    .line 333
    if-ge p1, v5, :cond_14

    .line 334
    .line 335
    add-int/lit8 v4, v4, -0x1

    .line 336
    .line 337
    if-gez v4, :cond_14

    .line 338
    goto :goto_3

    .line 339
    .line 340
    .line 341
    :cond_1a
    invoke-static {p1, v3}, Lcom/kubi/home/pagergridlayoutmanager/c;->g(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;)I

    .line 342
    move-result p1

    .line 343
    .line 344
    .line 345
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 346
    move-result v3

    .line 347
    add-int/2addr p1, v3

    .line 348
    .line 349
    if-le p1, v5, :cond_14

    .line 350
    .line 351
    add-int/lit8 v4, v4, -0x1

    .line 352
    .line 353
    if-gez v4, :cond_14

    .line 354
    .line 355
    :cond_1b
    :goto_3
    sget-boolean p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 356
    .line 357
    if-eqz p1, :cond_1c

    .line 358
    .line 359
    new-instance p1, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 363
    .line 364
    const-string v3, "findTargetSnapPosition->forwardDirection:"

    .line 365
    .line 366
    .line 367
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    const-string v2, ",targetPosition:"

    .line 373
    .line 374
    .line 375
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    const-string v2, ",velocityX: "

    .line 381
    .line 382
    .line 383
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    const-string p2, ",velocityY: "

    .line 389
    .line 390
    .line 391
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    const-string p2, ",scrollDistance:"

    .line 397
    .line 398
    .line 399
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    const-string p2, ",snapList:"

    .line 405
    .line 406
    .line 407
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    iget-object p2, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 410
    .line 411
    .line 412
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 413
    move-result p2

    .line 414
    .line 415
    .line 416
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    move-result-object p1

    .line 421
    .line 422
    .line 423
    invoke-static {v7, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 424
    .line 425
    :cond_1c
    iget-object p1, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 426
    .line 427
    .line 428
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 429
    return v1
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
.end method

.method public final i(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;II)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->canScrollHorizontally()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->x()Z

    .line 12
    move-result p1

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    if-gez p2, :cond_0

    .line 17
    return v2

    .line 18
    :cond_0
    return v1

    .line 19
    .line 20
    :cond_1
    if-lez p2, :cond_2

    .line 21
    return v2

    .line 22
    :cond_2
    return v1

    .line 23
    .line 24
    :cond_3
    if-lez p3, :cond_4

    .line 25
    return v2

    .line 26
    :cond_4
    return v1
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
.end method

.method public final j(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    :goto_0
    if-ge v1, v0, :cond_3

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    goto :goto_1

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 31
    move-result v3

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->r()I

    .line 35
    move-result v4

    .line 36
    rem-int/2addr v3, v4

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, Lcom/kubi/home/pagergridlayoutmanager/c;->b:Ljava/util/List;

    .line 41
    .line 42
    .line 43
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    return-void
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
.end method
