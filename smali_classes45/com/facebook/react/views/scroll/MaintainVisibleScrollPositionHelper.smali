.class Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;
.super Ljava/lang/Object;
.source "MaintainVisibleScrollPositionHelper.java"

# interfaces
.implements Lcom/facebook/react/bridge/UIManagerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ScrollViewT:",
        "Landroid/view/ViewGroup;",
        ":",
        "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/react/bridge/UIManagerListener;"
    }
.end annotation


# instance fields
.field private mConfig:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mFirstVisibleView:Ljava/lang/ref/WeakReference;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final mHorizontal:Z

.field private mListening:Z

.field private mPrevFirstVisibleFrame:Landroid/graphics/Rect;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final mScrollView:Landroid/view/ViewGroup;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TScrollViewT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TScrollViewT;Z)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mFirstVisibleView:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mPrevFirstVisibleFrame:Landroid/graphics/Rect;

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mListening:Z

    .line 12
    .line 13
    iput-object p1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 14
    .line 15
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mHorizontal:Z

    .line 16
    return-void
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
.end method

.method public static bridge synthetic a(Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->computeTargetView()V

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
.end method

.method private computeTargetView()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mConfig:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_5

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->getContentView()Lcom/facebook/react/views/view/ReactViewGroup;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    goto :goto_5

    .line 13
    .line 14
    :cond_1
    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mHorizontal:Z

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    iget-object v1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    .line 22
    move-result v1

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    .line 29
    move-result v1

    .line 30
    .line 31
    :goto_0
    iget-object v2, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mConfig:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;

    .line 32
    .line 33
    iget v2, v2, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;->minIndexForVisible:I

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 37
    move-result v3

    .line 38
    .line 39
    if-ge v2, v3, :cond_6

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    iget-boolean v4, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mHorizontal:Z

    .line 46
    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Landroid/view/View;->getX()F

    .line 51
    move-result v4

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 55
    move-result v5

    .line 56
    :goto_2
    int-to-float v5, v5

    .line 57
    add-float/2addr v4, v5

    .line 58
    goto :goto_3

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getY()F

    .line 62
    move-result v4

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 66
    move-result v5

    .line 67
    goto :goto_2

    .line 68
    :goto_3
    int-to-float v5, v1

    .line 69
    .line 70
    cmpl-float v4, v4, v5

    .line 71
    .line 72
    if-gtz v4, :cond_5

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 76
    move-result v4

    .line 77
    .line 78
    add-int/lit8 v4, v4, -0x1

    .line 79
    .line 80
    if-ne v2, v4, :cond_4

    .line 81
    goto :goto_4

    .line 82
    .line 83
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 84
    goto :goto_1

    .line 85
    .line 86
    :cond_5
    :goto_4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    iput-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mFirstVisibleView:Ljava/lang/ref/WeakReference;

    .line 92
    .line 93
    new-instance v0, Landroid/graphics/Rect;

    .line 94
    .line 95
    .line 96
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 100
    .line 101
    iput-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mPrevFirstVisibleFrame:Landroid/graphics/Rect;

    .line 102
    :cond_6
    :goto_5
    return-void
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
.end method

.method private getContentView()Lcom/facebook/react/views/view/ReactViewGroup;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/facebook/react/views/view/ReactViewGroup;

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private getUIManagerModule()Lcom/facebook/react/bridge/UIManager;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lcom/facebook/react/uimanager/common/ViewUtil;->getUIManagerType(I)I

    .line 18
    move-result v1

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getUIManager(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Lcom/facebook/react/bridge/UIManager;

    .line 29
    return-object v0
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
.end method

.method private updateScrollPositionInternal()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mConfig:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mFirstVisibleView:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mPrevFirstVisibleFrame:Landroid/graphics/Rect;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Landroid/view/View;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_1
    new-instance v1, Landroid/graphics/Rect;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 33
    .line 34
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mHorizontal:Z

    .line 35
    const/4 v2, 0x0

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget v0, v1, Landroid/graphics/Rect;->left:I

    .line 40
    .line 41
    iget-object v3, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mPrevFirstVisibleFrame:Landroid/graphics/Rect;

    .line 42
    .line 43
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 44
    sub-int/2addr v0, v3

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object v3, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Landroid/view/View;->getScrollX()I

    .line 52
    move-result v3

    .line 53
    .line 54
    iget-object v4, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 55
    move-object v5, v4

    .line 56
    .line 57
    check-cast v5, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;

    .line 58
    add-int/2addr v0, v3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 62
    move-result v4

    .line 63
    .line 64
    .line 65
    invoke-interface {v5, v0, v4}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;->scrollToPreservingMomentum(II)V

    .line 66
    .line 67
    iput-object v1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mPrevFirstVisibleFrame:Landroid/graphics/Rect;

    .line 68
    .line 69
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mConfig:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;->autoScrollToTopThreshold:Ljava/lang/Integer;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 77
    move-result v0

    .line 78
    .line 79
    if-gt v3, v0, :cond_3

    .line 80
    .line 81
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 82
    move-object v1, v0

    .line 83
    .line 84
    check-cast v1, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 88
    move-result v0

    .line 89
    .line 90
    .line 91
    invoke-interface {v1, v2, v0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;->reactSmoothScrollTo(II)V

    .line 92
    return-void

    .line 93
    .line 94
    :cond_2
    iget v0, v1, Landroid/graphics/Rect;->top:I

    .line 95
    .line 96
    iget-object v3, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mPrevFirstVisibleFrame:Landroid/graphics/Rect;

    .line 97
    .line 98
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 99
    sub-int/2addr v0, v3

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    iget-object v3, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Landroid/view/View;->getScrollY()I

    .line 107
    move-result v3

    .line 108
    .line 109
    iget-object v4, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 110
    move-object v5, v4

    .line 111
    .line 112
    check-cast v5, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    .line 116
    move-result v4

    .line 117
    add-int/2addr v0, v3

    .line 118
    .line 119
    .line 120
    invoke-interface {v5, v4, v0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;->scrollToPreservingMomentum(II)V

    .line 121
    .line 122
    iput-object v1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mPrevFirstVisibleFrame:Landroid/graphics/Rect;

    .line 123
    .line 124
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mConfig:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;

    .line 125
    .line 126
    iget-object v0, v0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;->autoScrollToTopThreshold:Ljava/lang/Integer;

    .line 127
    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 132
    move-result v0

    .line 133
    .line 134
    if-gt v3, v0, :cond_3

    .line 135
    .line 136
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 137
    move-object v1, v0

    .line 138
    .line 139
    check-cast v1, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 143
    move-result v0

    .line 144
    .line 145
    .line 146
    invoke-interface {v1, v0, v2}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;->reactSmoothScrollTo(II)V

    .line 147
    :cond_3
    :goto_0
    return-void
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
.end method


# virtual methods
.method public didDispatchMountItems(Lcom/facebook/react/bridge/UIManager;)V
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

.method public didMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->updateScrollPositionInternal()V

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
.end method

.method public didScheduleMountItems(Lcom/facebook/react/bridge/UIManager;)V
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

.method public setConfig(Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;)V
    .locals 0
    .param p1    # Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mConfig:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;

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
.end method

.method public start()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mListening:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mListening:Z

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->getUIManagerModule()Lcom/facebook/react/bridge/UIManager;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p0}, Lcom/facebook/react/bridge/UIManager;->addUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V

    .line 16
    return-void
    .line 17
    .line 18
.end method

.method public stop()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mListening:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mListening:Z

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->getUIManagerModule()Lcom/facebook/react/bridge/UIManager;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p0}, Lcom/facebook/react/bridge/UIManager;->removeUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V

    .line 16
    return-void
    .line 17
    .line 18
.end method

.method public updateScrollPosition()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->mScrollView:Landroid/view/ViewGroup;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/uimanager/common/ViewUtil;->getUIManagerType(I)I

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->updateScrollPositionInternal()V

    .line 18
    return-void
.end method

.method public willDispatchViewUpdates(Lcom/facebook/react/bridge/UIManager;)V
    .locals 0

    .line 1
    .line 2
    new-instance p1, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {p1, p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$1;-><init>(Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 9
    return-void
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

.method public willMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->computeTargetView()V

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
.end method
