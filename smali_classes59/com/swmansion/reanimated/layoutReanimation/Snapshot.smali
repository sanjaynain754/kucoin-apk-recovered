.class public Lcom/swmansion/reanimated/layoutReanimation/Snapshot;
.super Ljava/lang/Object;
.source "Snapshot.java"


# static fields
.field public static final BORDER_BOTTOM_LEFT_RADIUS:Ljava/lang/String; = "borderBottomLeftRadius"

.field public static final BORDER_BOTTOM_RIGHT_RADIUS:Ljava/lang/String; = "borderBottomRightRadius"

.field public static final BORDER_RADIUS:Ljava/lang/String; = "borderRadius"

.field public static final BORDER_TOP_LEFT_RADIUS:Ljava/lang/String; = "borderTopLeftRadius"

.field public static final BORDER_TOP_RIGHT_RADIUS:Ljava/lang/String; = "borderTopRightRadius"

.field public static final CURRENT_BORDER_BOTTOM_LEFT_RADIUS:Ljava/lang/String; = "currentBorderBottomLeftRadius"

.field public static final CURRENT_BORDER_BOTTOM_RIGHT_RADIUS:Ljava/lang/String; = "currentBorderBottomRightRadius"

.field public static final CURRENT_BORDER_RADIUS:Ljava/lang/String; = "currentBorderRadius"

.field public static final CURRENT_BORDER_TOP_LEFT_RADIUS:Ljava/lang/String; = "currentBorderTopLeftRadius"

.field public static final CURRENT_BORDER_TOP_RIGHT_RADIUS:Ljava/lang/String; = "currentBorderTopRightRadius"

.field public static final CURRENT_GLOBAL_ORIGIN_X:Ljava/lang/String; = "currentGlobalOriginX"

.field public static final CURRENT_GLOBAL_ORIGIN_Y:Ljava/lang/String; = "currentGlobalOriginY"

.field public static final CURRENT_HEIGHT:Ljava/lang/String; = "currentHeight"

.field public static final CURRENT_ORIGIN_X:Ljava/lang/String; = "currentOriginX"

.field public static final CURRENT_ORIGIN_Y:Ljava/lang/String; = "currentOriginY"

.field public static final CURRENT_TRANSFORM_MATRIX:Ljava/lang/String; = "currentTransformMatrix"

.field public static final CURRENT_WIDTH:Ljava/lang/String; = "currentWidth"

.field public static final GLOBAL_ORIGIN_X:Ljava/lang/String; = "globalOriginX"

.field public static final GLOBAL_ORIGIN_Y:Ljava/lang/String; = "globalOriginY"

.field public static final HEIGHT:Ljava/lang/String; = "height"

.field public static final ORIGIN_X:Ljava/lang/String; = "originX"

.field public static final ORIGIN_Y:Ljava/lang/String; = "originY"

.field public static final TARGET_BORDER_BOTTOM_LEFT_RADIUS:Ljava/lang/String; = "targetBorderBottomLeftRadius"

.field public static final TARGET_BORDER_BOTTOM_RIGHT_RADIUS:Ljava/lang/String; = "targetBorderBottomRightRadius"

.field public static final TARGET_BORDER_RADIUS:Ljava/lang/String; = "targetBorderRadius"

.field public static final TARGET_BORDER_TOP_LEFT_RADIUS:Ljava/lang/String; = "targetBorderTopLeftRadius"

.field public static final TARGET_BORDER_TOP_RIGHT_RADIUS:Ljava/lang/String; = "targetBorderTopRightRadius"

.field public static final TARGET_GLOBAL_ORIGIN_X:Ljava/lang/String; = "targetGlobalOriginX"

.field public static final TARGET_GLOBAL_ORIGIN_Y:Ljava/lang/String; = "targetGlobalOriginY"

.field public static final TARGET_HEIGHT:Ljava/lang/String; = "targetHeight"

.field public static final TARGET_ORIGIN_X:Ljava/lang/String; = "targetOriginX"

.field public static final TARGET_ORIGIN_Y:Ljava/lang/String; = "targetOriginY"

.field public static final TARGET_TRANSFORM_MATRIX:Ljava/lang/String; = "targetTransformMatrix"

.field public static final TARGET_WIDTH:Ljava/lang/String; = "targetWidth"

.field public static final TRANSFORM_MATRIX:Ljava/lang/String; = "transformMatrix"

.field public static final WIDTH:Ljava/lang/String; = "width"

.field public static currentKeysToTransform:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static targetKeysToTransform:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

.field public globalOriginX:I

.field public globalOriginY:I

.field public height:I

.field private identityMatrix:[F

.field public originX:I

.field public originXByParent:I

.field public originY:I

.field public originYByParent:I

.field public parent:Landroid/view/ViewGroup;

.field public parentViewManager:Lcom/facebook/react/uimanager/ViewManager;

.field public transformMatrix:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public view:Landroid/view/View;

.field public viewManager:Lcom/facebook/react/uimanager/ViewManager;

.field public width:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v10, "targetBorderBottomLeftRadius"

    .line 6
    .line 7
    .line 8
    const-string/jumbo v11, "targetBorderBottomRightRadius"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v1, "targetWidth"

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "targetHeight"

    .line 15
    .line 16
    .line 17
    const-string/jumbo v3, "targetOriginX"

    .line 18
    .line 19
    .line 20
    const-string/jumbo v4, "targetOriginY"

    .line 21
    .line 22
    .line 23
    const-string/jumbo v5, "targetGlobalOriginX"

    .line 24
    .line 25
    .line 26
    const-string/jumbo v6, "targetGlobalOriginY"

    .line 27
    .line 28
    .line 29
    const-string/jumbo v7, "targetBorderRadius"

    .line 30
    .line 31
    .line 32
    const-string/jumbo v8, "targetBorderTopLeftRadius"

    .line 33
    .line 34
    .line 35
    const-string/jumbo v9, "targetBorderTopRightRadius"

    .line 36
    .line 37
    .line 38
    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 47
    .line 48
    sput-object v0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->targetKeysToTransform:Ljava/util/ArrayList;

    .line 49
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    const-string v10, "currentBorderBottomLeftRadius"

    .line 53
    .line 54
    const-string v11, "currentBorderBottomRightRadius"

    .line 55
    .line 56
    const-string v1, "currentWidth"

    .line 57
    .line 58
    const-string v2, "currentHeight"

    .line 59
    .line 60
    const-string v3, "currentOriginX"

    .line 61
    .line 62
    const-string v4, "currentOriginY"

    .line 63
    .line 64
    const-string v5, "currentGlobalOriginX"

    .line 65
    .line 66
    const-string v6, "currentGlobalOriginY"

    .line 67
    .line 68
    const-string v7, "currentBorderRadius"

    .line 69
    .line 70
    const-string v8, "currentBorderTopLeftRadius"

    .line 71
    .line 72
    const-string v9, "currentBorderTopRightRadius"

    .line 73
    .line 74
    .line 75
    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    .line 83
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 84
    .line 85
    sput-object v0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->currentKeysToTransform:Ljava/util/ArrayList;

    .line 86
    return-void
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
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 11

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 20
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    move-object v4, v3

    move-object v5, v3

    move-object v6, v2

    move-object v7, v3

    move-object v8, v3

    move-object v9, v3

    move-object v10, v2

    filled-new-array/range {v2 .. v10}, [Ljava/lang/Float;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->transformMatrix:Ljava/util/List;

    const/16 v0, 0x9

    .line 21
    new-array v1, v0, [F

    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->identityMatrix:[F

    const/4 v1, 0x2

    .line 22
    new-array v2, v1, [I

    .line 23
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v3, 0x0

    .line 24
    aget v4, v2, v3

    const/4 v5, 0x1

    if-nez v4, :cond_0

    aget v4, v2, v5

    if-nez v4, :cond_0

    .line 25
    invoke-direct {p0, p1}, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->tryGetRealPosition(Landroid/view/View;)[I

    move-result-object v2

    .line 26
    :cond_0
    aget v4, v2, v3

    iput v4, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originX:I

    .line 27
    aget v2, v2, v5

    iput v2, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originY:I

    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    iput v2, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->width:I

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    iput v2, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->height:I

    .line 30
    invoke-direct {p0, p1}, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->findTransformedView(Landroid/view/View;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 31
    new-array v4, v0, [F

    .line 32
    invoke-virtual {v2}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v6

    invoke-virtual {v6, v4}, Landroid/graphics/Matrix;->getValues([F)V

    .line 33
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->transformMatrix:Ljava/util/List;

    move v6, v3

    :goto_0
    if-ge v6, v0, :cond_1

    .line 34
    iget-object v7, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->transformMatrix:Ljava/util/List;

    aget v8, v4, v6

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v6, v5

    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->transformMatrix:Ljava/util/List;

    invoke-virtual {v2}, Landroid/view/View;->getScaleX()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 36
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->transformMatrix:Ljava/util/List;

    invoke-virtual {v2}, Landroid/view/View;->getScaleY()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x4

    invoke-interface {v0, v4, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 37
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->transformMatrix:Ljava/util/List;

    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 38
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->transformMatrix:Ljava/util/List;

    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v3, 0x5

    invoke-interface {v0, v3, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 39
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originX:I

    int-to-float v0, v0

    iget v1, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->width:I

    int-to-float v3, v1

    int-to-float v1, v1

    invoke-virtual {v2}, Landroid/view/View;->getScaleX()F

    move-result v4

    mul-float/2addr v1, v4

    sub-float/2addr v3, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v3, v1

    sub-float/2addr v0, v3

    float-to-int v0, v0

    iput v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originX:I

    .line 40
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originY:I

    int-to-float v0, v0

    iget v3, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->height:I

    int-to-float v4, v3

    int-to-float v3, v3

    invoke-virtual {v2}, Landroid/view/View;->getScaleY()F

    move-result v2

    mul-float/2addr v3, v2

    sub-float/2addr v4, v3

    div-float/2addr v4, v1

    sub-float/2addr v0, v4

    float-to-int v0, v0

    iput v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originY:I

    .line 41
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originXByParent:I

    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originYByParent:I

    .line 43
    invoke-static {p1}, Lcom/swmansion/reanimated/ReactNativeUtils;->getBorderRadii(Landroid/view/View;)Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    move-result-object p1

    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/view/View;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 3
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    move-object v4, v3

    move-object v5, v3

    move-object v6, v2

    move-object v7, v3

    move-object v8, v3

    move-object v9, v3

    move-object v10, v2

    filled-new-array/range {v2 .. v10}, [Ljava/lang/Float;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->transformMatrix:Ljava/util/List;

    const/16 v0, 0x9

    .line 4
    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->identityMatrix:[F

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->parent:Landroid/view/ViewGroup;

    .line 6
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->resolveViewManager(I)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object v0

    iput-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->viewManager:Lcom/facebook/react/uimanager/ViewManager;

    .line 7
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->parent:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->resolveViewManager(I)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object p2

    iput-object p2, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->parentViewManager:Lcom/facebook/react/uimanager/ViewManager;
    :try_end_0
    .catch Lcom/facebook/react/uimanager/IllegalViewOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    :catch_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p2

    iput p2, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->width:I

    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p2

    iput p2, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->height:I

    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    iput p2, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originX:I

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p2

    iput p2, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originY:I

    .line 12
    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->view:Landroid/view/View;

    const/4 p2, 0x2

    .line 13
    new-array p2, p2, [I

    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 p1, 0x0

    .line 15
    aget p1, p2, p1

    iput p1, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->globalOriginX:I

    const/4 p1, 0x1

    .line 16
    aget p1, p2, p1

    iput p1, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->globalOriginY:I

    .line 17
    new-instance v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;-><init>(FFFFF)V

    iput-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private addBasicConfig(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originY:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    const-string/jumbo v1, "originY"

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originX:I

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    const-string/jumbo v1, "originX"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->globalOriginY:I

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    const-string v1, "globalOriginY"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->globalOriginX:I

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    const-string v1, "globalOriginX"

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->height:I

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    const-string v1, "height"

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->width:I

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    const-string/jumbo v1, "width"

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    const-string/jumbo v0, "transformMatrix"

    .line 73
    .line 74
    iget-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->transformMatrix:Ljava/util/List;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 80
    .line 81
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->full:F

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    const-string v1, "borderRadius"

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 93
    .line 94
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->topLeft:F

    .line 95
    .line 96
    .line 97
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    const-string v1, "borderTopLeftRadius"

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 106
    .line 107
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->topRight:F

    .line 108
    .line 109
    .line 110
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    const-string v1, "borderTopRightRadius"

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 119
    .line 120
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->bottomLeft:F

    .line 121
    .line 122
    .line 123
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    const-string v1, "borderBottomLeftRadius"

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 132
    .line 133
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->bottomRight:F

    .line 134
    .line 135
    .line 136
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    const-string v1, "borderBottomRightRadius"

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    return-void
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
.end method

.method private addCurrentConfig(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originY:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "currentOriginY"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originX:I

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-string v1, "currentOriginX"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->globalOriginY:I

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    const-string v1, "currentGlobalOriginY"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->globalOriginX:I

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    const-string v1, "currentGlobalOriginX"

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->height:I

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    const-string v1, "currentHeight"

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->width:I

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    const-string v1, "currentWidth"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    const-string v0, "currentTransformMatrix"

    .line 69
    .line 70
    iget-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->transformMatrix:Ljava/util/List;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 76
    .line 77
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->full:F

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    const-string v1, "currentBorderRadius"

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 89
    .line 90
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->topLeft:F

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    const-string v1, "currentBorderTopLeftRadius"

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 102
    .line 103
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->topRight:F

    .line 104
    .line 105
    .line 106
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    const-string v1, "currentBorderTopRightRadius"

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 115
    .line 116
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->bottomLeft:F

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    const-string v1, "currentBorderBottomLeftRadius"

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 128
    .line 129
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->bottomRight:F

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    const-string v1, "currentBorderBottomRightRadius"

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    return-void
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
.end method

.method private addTargetConfig(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originY:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    const-string/jumbo v1, "targetOriginY"

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->originX:I

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    const-string/jumbo v1, "targetOriginX"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->globalOriginY:I

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    const-string/jumbo v1, "targetGlobalOriginY"

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->globalOriginX:I

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    const-string/jumbo v1, "targetGlobalOriginX"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->height:I

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    const-string/jumbo v1, "targetHeight"

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    iget v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->width:I

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    .line 69
    const-string/jumbo v1, "targetWidth"

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    const-string/jumbo v0, "targetTransformMatrix"

    .line 76
    .line 77
    iget-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->transformMatrix:Ljava/util/List;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 83
    .line 84
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->full:F

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    const-string/jumbo v1, "targetBorderRadius"

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 97
    .line 98
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->topLeft:F

    .line 99
    .line 100
    .line 101
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    const-string/jumbo v1, "targetBorderTopLeftRadius"

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 111
    .line 112
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->topRight:F

    .line 113
    .line 114
    .line 115
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    const-string/jumbo v1, "targetBorderTopRightRadius"

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 125
    .line 126
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->bottomLeft:F

    .line 127
    .line 128
    .line 129
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    .line 133
    const-string/jumbo v1, "targetBorderBottomLeftRadius"

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->borderRadii:Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;

    .line 139
    .line 140
    iget v0, v0, Lcom/swmansion/reanimated/ReactNativeUtils$BorderRadii;->bottomRight:F

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    .line 147
    const-string/jumbo v1, "targetBorderBottomRightRadius"

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    return-void
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
.end method

.method private findTransformedView(Landroid/view/View;)Landroid/view/View;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move-object v2, v0

    .line 4
    .line 5
    :goto_0
    if-nez v2, :cond_0

    .line 6
    move-object v2, p1

    .line 7
    goto :goto_1

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 11
    move-result-object v3

    .line 12
    .line 13
    instance-of v3, v3, Landroid/view/View;

    .line 14
    .line 15
    if-nez v3, :cond_1

    .line 16
    goto :goto_3

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    check-cast v2, Landroid/view/View;

    .line 23
    .line 24
    :goto_1
    if-nez v2, :cond_2

    .line 25
    goto :goto_3

    .line 26
    .line 27
    :cond_2
    const/16 v1, 0x9

    .line 28
    .line 29
    new-array v1, v1, [F

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 37
    .line 38
    iget-object v3, p0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->identityMatrix:[F

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([F[F)Z

    .line 42
    move-result v1

    .line 43
    .line 44
    xor-int/lit8 v3, v1, 0x1

    .line 45
    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    const-string v4, "Screen"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    move-result v1

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move v1, v3

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    :goto_2
    move v1, v3

    .line 67
    .line 68
    :goto_3
    if-eqz v1, :cond_5

    .line 69
    .line 70
    if-eqz v2, :cond_5

    .line 71
    return-object v2

    .line 72
    :cond_5
    return-object v0
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method private tryGetRealPosition(Landroid/view/View;)[I
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    :catch_0
    :goto_0
    if-eqz p1, :cond_1

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    aget v2, v0, v1

    .line 9
    int-to-float v2, v2

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    .line 13
    move-result v3

    .line 14
    add-float/2addr v2, v3

    .line 15
    float-to-int v2, v2

    .line 16
    .line 17
    aput v2, v0, v1

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    aget v3, v0, v2

    .line 21
    int-to-float v3, v3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 25
    move-result v4

    .line 26
    add-float/2addr v3, v4

    .line 27
    float-to-int v3, v3

    .line 28
    .line 29
    aput v3, v0, v2

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lcom/swmansion/reanimated/layoutReanimation/ScreensHelper;->isScreen(Ljava/lang/Object;)Z

    .line 33
    move-result v2

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Lcom/swmansion/reanimated/layoutReanimation/ScreensHelper;->isScreensCoordinatorLayout(Ljava/lang/Object;)Z

    .line 43
    move-result v2

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    :try_start_0
    const-string v3, "getContainer"

    .line 52
    .line 53
    new-array v4, v1, [Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    new-array v1, v1, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    check-cast v1, Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    move-object p1, v1

    .line 67
    goto :goto_0

    .line 68
    .line 69
    .line 70
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    instance-of v1, v1, Landroid/view/View;

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    check-cast p1, Landroid/view/View;

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    return-object v0
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
.end method


# virtual methods
.method public toBasicMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->addBasicConfig(Ljava/util/HashMap;)V

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public toCurrentMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->addCurrentConfig(Ljava/util/HashMap;)V

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public toTargetMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;->addTargetConfig(Ljava/util/HashMap;)V

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
