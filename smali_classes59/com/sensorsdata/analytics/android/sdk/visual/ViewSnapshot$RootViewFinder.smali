.class Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;
.super Ljava/lang/Object;
.source "ViewSnapshot.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RootViewFinder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final mCachedBitmap:Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$CachedBitmap;

.field private final mClientDensity:I

.field private final mRootViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0xa0

    .line 6
    .line 7
    iput v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mClientDensity:I

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    .line 15
    .line 16
    new-instance v0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$CachedBitmap;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$CachedBitmap;-><init>()V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mCachedBitmap:Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$CachedBitmap;

    .line 22
    return-void
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
.end method

.method private scaleBitmap(Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;Landroid/graphics/Bitmap;)V
    .locals 9

    .line 1
    .line 2
    const/high16 v0, 0x3f800000    # 1.0f

    .line 3
    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getDensity()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/high16 v0, 0x43200000    # 160.0f

    .line 13
    int-to-float v1, v1

    .line 14
    div-float/2addr v0, v1

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 18
    move-result v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 22
    move-result v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 26
    move-result v3

    .line 27
    int-to-float v3, v3

    .line 28
    mul-float/2addr v3, v0

    .line 29
    float-to-double v3, v3

    .line 30
    .line 31
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 32
    add-double/2addr v3, v5

    .line 33
    double-to-int v3, v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 37
    move-result v4

    .line 38
    int-to-float v4, v4

    .line 39
    mul-float/2addr v4, v0

    .line 40
    float-to-double v7, v4

    .line 41
    add-double/2addr v7, v5

    .line 42
    double-to-int v4, v7

    .line 43
    .line 44
    if-lez v1, :cond_1

    .line 45
    .line 46
    if-lez v2, :cond_1

    .line 47
    .line 48
    if-lez v3, :cond_1

    .line 49
    .line 50
    if-lez v4, :cond_1

    .line 51
    .line 52
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mCachedBitmap:Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$CachedBitmap;

    .line 53
    .line 54
    const/16 v2, 0xa0

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v3, v4, v2, p2}, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$CachedBitmap;->recreate(IIILandroid/graphics/Bitmap;)V

    .line 58
    .line 59
    :cond_1
    iput v0, p1, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;->scale:F

    .line 60
    .line 61
    iget-object p2, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mCachedBitmap:Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$CachedBitmap;

    .line 62
    .line 63
    iput-object p2, p1, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;->screenshot:Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$CachedBitmap;

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
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->call()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/AppStateManager;->getInstance()Lcom/sensorsdata/analytics/android/sdk/AppStateManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/AppStateManager;->getForegroundActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 4
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/util/AopUtil;->buildTitleAndScreenName(Landroid/app/Activity;)Lorg/json/JSONObject;

    move-result-object v1

    .line 5
    invoke-static {v1}, Lcom/sensorsdata/analytics/android/sdk/visual/util/VisualUtil;->mergeRnScreenNameAndTitle(Lorg/json/JSONObject;)V

    .line 6
    const-string v2, "$screen_name"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 7
    const-string v3, "$title"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->isActive()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 10
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    if-nez v0, :cond_1

    .line 11
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    return-object v0

    .line 12
    :cond_1
    new-instance v4, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;

    invoke-direct {v4, v2, v1, v0}, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V

    .line 13
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/util/WindowHelper;->getSortedWindowViews()[Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 14
    array-length v5, v0

    if-lez v5, :cond_4

    .line 15
    invoke-virtual {p0, v0, v4}, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mergeViewLayers([Landroid/view/View;Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 16
    array-length v5, v0

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_4

    aget-object v7, v0, v6

    .line 17
    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    move-result v8

    if-nez v8, :cond_3

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-nez v8, :cond_3

    .line 18
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v8

    if-eqz v8, :cond_3

    .line 19
    invoke-static {v7}, Lcom/sensorsdata/analytics/android/sdk/util/WindowHelper;->getWindowPrefix(Landroid/view/View;)Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/util/WindowHelper;->getMainWindowPrefix()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_2

    .line 20
    :cond_2
    new-instance v8, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;

    invoke-virtual {v7}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v7

    invoke-direct {v8, v2, v1, v7}, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V

    .line 21
    invoke-direct {p0, v8, v3}, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->scaleBitmap(Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;Landroid/graphics/Bitmap;)V

    .line 22
    iget-object v7, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 23
    :cond_4
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 24
    invoke-direct {p0, v4, v3}, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->scaleBitmap(Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;Landroid/graphics/Bitmap;)V

    .line 25
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    :cond_5
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    return-object v0
.end method

.method public mergeViewLayers([Landroid/view/View;Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;)Landroid/graphics/Bitmap;
    .locals 13

    .line 1
    .line 2
    iget-object v0, p2, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;->rootView:Landroid/view/View;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object p2, p2, Lcom/sensorsdata/analytics/android/sdk/visual/ViewSnapshot$RootViewInfo;->rootView:Landroid/view/View;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 12
    move-result p2

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->sharedInstance()Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getContext()Landroid/content/Context;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    .line 29
    invoke-static {p2}, Lcom/sensorsdata/analytics/android/sdk/util/DeviceUtils;->getDeviceSize(Landroid/content/Context;)[I

    .line 30
    move-result-object p2

    .line 31
    .line 32
    aget v0, p2, v1

    .line 33
    .line 34
    aget p2, p2, v2

    .line 35
    .line 36
    if-eqz v0, :cond_6

    .line 37
    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_1
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 43
    .line 44
    .line 45
    invoke-static {v0, p2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 46
    move-result-object p2

    .line 47
    .line 48
    new-instance v3, Lcom/sensorsdata/analytics/android/sdk/visual/snap/SoftWareCanvas;

    .line 49
    .line 50
    .line 51
    invoke-direct {v3, p2}, Lcom/sensorsdata/analytics/android/sdk/visual/snap/SoftWareCanvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 52
    const/4 v0, 0x2

    .line 53
    .line 54
    new-array v0, v0, [I

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/util/ViewUtil;->getMainWindowCount([Landroid/view/View;)I

    .line 58
    move-result v4

    .line 59
    .line 60
    if-le v4, v2, :cond_2

    .line 61
    move v9, v2

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v9, v1

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/util/WindowHelper;->init()V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/util/ViewUtil;->invalidateLayerTypeView([Landroid/view/View;)V

    .line 70
    array-length v10, p1

    .line 71
    move v4, v1

    .line 72
    move v11, v4

    .line 73
    .line 74
    :goto_1
    if-ge v11, v10, :cond_5

    .line 75
    .line 76
    aget-object v12, p1, v11

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    .line 80
    move-result v5

    .line 81
    .line 82
    if-nez v5, :cond_4

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 86
    move-result v5

    .line 87
    .line 88
    if-eqz v5, :cond_4

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    .line 92
    move-result v5

    .line 93
    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    .line 97
    invoke-static {v12}, Lcom/sensorsdata/analytics/android/sdk/util/WindowHelper;->getWindowPrefix(Landroid/view/View;)Ljava/lang/String;

    .line 98
    move-result-object v5

    .line 99
    .line 100
    .line 101
    invoke-static {v12, v5, v9}, Lcom/sensorsdata/analytics/android/sdk/util/ViewUtil;->isWindowNeedTraverse(Landroid/view/View;Ljava/lang/String;Z)Z

    .line 102
    move-result v5

    .line 103
    .line 104
    if-eqz v5, :cond_4

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    .line 108
    .line 109
    .line 110
    invoke-static {v12}, Lcom/sensorsdata/analytics/android/sdk/util/WindowHelper;->isMainWindow(Landroid/view/View;)Z

    .line 111
    move-result v5

    .line 112
    .line 113
    if-nez v5, :cond_3

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 117
    .line 118
    aget v5, v0, v1

    .line 119
    int-to-float v5, v5

    .line 120
    .line 121
    aget v6, v0, v2

    .line 122
    int-to-float v6, v6

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 126
    .line 127
    .line 128
    invoke-static {v12}, Lcom/sensorsdata/analytics/android/sdk/util/WindowHelper;->isDialogOrPopupWindow(Landroid/view/View;)Z

    .line 129
    move-result v5

    .line 130
    .line 131
    if-eqz v5, :cond_3

    .line 132
    .line 133
    if-nez v4, :cond_3

    .line 134
    .line 135
    new-instance v8, Landroid/graphics/Paint;

    .line 136
    .line 137
    .line 138
    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 139
    .line 140
    const/high16 v4, -0x60000000

    .line 141
    .line 142
    .line 143
    invoke-virtual {v8, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 144
    .line 145
    aget v4, v0, v1

    .line 146
    int-to-float v4, v4

    .line 147
    neg-float v4, v4

    .line 148
    .line 149
    aget v5, v0, v2

    .line 150
    int-to-float v5, v5

    .line 151
    neg-float v5, v5

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    .line 155
    move-result v6

    .line 156
    int-to-float v6, v6

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    .line 160
    move-result v7

    .line 161
    int-to-float v7, v7

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v3 .. v8}, Lcom/sensorsdata/analytics/android/sdk/visual/snap/SoftWareCanvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 165
    move v4, v2

    .line 166
    .line 167
    .line 168
    :cond_3
    invoke-virtual {v12, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Lcom/sensorsdata/analytics/android/sdk/visual/snap/SoftWareCanvas;->destroy()V

    .line 175
    .line 176
    :cond_4
    add-int/lit8 v11, v11, 0x1

    .line 177
    goto :goto_1

    .line 178
    :cond_5
    return-object p2

    .line 179
    :cond_6
    :goto_2
    const/4 p1, 0x0

    .line 180
    return-object p1
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
.end method
