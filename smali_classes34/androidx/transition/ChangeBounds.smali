.class public Landroidx/transition/ChangeBounds;
.super Landroidx/transition/Transition;
.source "ChangeBounds.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/ChangeBounds$ViewBounds;,
        Landroidx/transition/ChangeBounds$ClipListener;,
        Landroidx/transition/ChangeBounds$SuppressLayoutListener;
    }
.end annotation


# static fields
.field private static final BOTTOM_RIGHT_ONLY_PROPERTY:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final BOTTOM_RIGHT_PROPERTY:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeBounds$ViewBounds;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final POSITION_PROPERTY:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final PROPNAME_BOUNDS:Ljava/lang/String; = "android:changeBounds:bounds"

.field private static final PROPNAME_CLIP:Ljava/lang/String; = "android:changeBounds:clip"

.field private static final PROPNAME_PARENT:Ljava/lang/String; = "android:changeBounds:parent"

.field private static final PROPNAME_WINDOW_X:Ljava/lang/String; = "android:changeBounds:windowX"

.field private static final PROPNAME_WINDOW_Y:Ljava/lang/String; = "android:changeBounds:windowY"

.field private static final TOP_LEFT_ONLY_PROPERTY:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final TOP_LEFT_PROPERTY:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeBounds$ViewBounds;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final sRectEvaluator:Landroidx/transition/RectEvaluator;

.field private static final sTransitionProperties:[Ljava/lang/String;


# instance fields
.field private mResizeClip:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-string v0, "android:changeBounds:windowX"

    .line 3
    .line 4
    const-string v1, "android:changeBounds:windowY"

    .line 5
    .line 6
    const-string v2, "android:changeBounds:bounds"

    .line 7
    .line 8
    const-string v3, "android:changeBounds:clip"

    .line 9
    .line 10
    const-string v4, "android:changeBounds:parent"

    .line 11
    .line 12
    .line 13
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Landroidx/transition/ChangeBounds;->sTransitionProperties:[Ljava/lang/String;

    .line 17
    .line 18
    new-instance v0, Landroidx/transition/ChangeBounds$1;

    .line 19
    .line 20
    const-class v1, Landroid/graphics/PointF;

    .line 21
    .line 22
    .line 23
    const-string/jumbo v2, "topLeft"

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 27
    .line 28
    sput-object v0, Landroidx/transition/ChangeBounds;->TOP_LEFT_PROPERTY:Landroid/util/Property;

    .line 29
    .line 30
    new-instance v0, Landroidx/transition/ChangeBounds$2;

    .line 31
    .line 32
    const-string v3, "bottomRight"

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1, v3}, Landroidx/transition/ChangeBounds$2;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 36
    .line 37
    sput-object v0, Landroidx/transition/ChangeBounds;->BOTTOM_RIGHT_PROPERTY:Landroid/util/Property;

    .line 38
    .line 39
    new-instance v0, Landroidx/transition/ChangeBounds$3;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v1, v3}, Landroidx/transition/ChangeBounds$3;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 43
    .line 44
    sput-object v0, Landroidx/transition/ChangeBounds;->BOTTOM_RIGHT_ONLY_PROPERTY:Landroid/util/Property;

    .line 45
    .line 46
    new-instance v0, Landroidx/transition/ChangeBounds$4;

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$4;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 50
    .line 51
    sput-object v0, Landroidx/transition/ChangeBounds;->TOP_LEFT_ONLY_PROPERTY:Landroid/util/Property;

    .line 52
    .line 53
    new-instance v0, Landroidx/transition/ChangeBounds$5;

    .line 54
    .line 55
    .line 56
    const-string/jumbo v2, "position"

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$5;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 60
    .line 61
    sput-object v0, Landroidx/transition/ChangeBounds;->POSITION_PROPERTY:Landroid/util/Property;

    .line 62
    .line 63
    new-instance v0, Landroidx/transition/RectEvaluator;

    .line 64
    .line 65
    .line 66
    invoke-direct {v0}, Landroidx/transition/RectEvaluator;-><init>()V

    .line 67
    .line 68
    sput-object v0, Landroidx/transition/ChangeBounds;->sRectEvaluator:Landroidx/transition/RectEvaluator;

    .line 69
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    .line 5
    sget-object v1, Landroidx/transition/Styleable;->CHANGE_BOUNDS:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 6
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string/jumbo v1, "resizeClip"

    invoke-static {p1, p2, v1, v0, v0}, Landroidx/core/content/res/TypedArrayUtils;->getNamedBoolean(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IZ)Z

    move-result p2

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 8
    invoke-virtual {p0, p2}, Landroidx/transition/ChangeBounds;->setResizeClip(Z)V

    return-void
.end method

.method private captureValues(Landroidx/transition/TransitionValues;)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p1, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 12
    move-result v1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 18
    move-result v1

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    :cond_0
    iget-object v1, p1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 23
    .line 24
    new-instance v2, Landroid/graphics/Rect;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 28
    move-result v3

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 32
    move-result v4

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 36
    move-result v5

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 40
    move-result v6

    .line 41
    .line 42
    .line 43
    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 44
    .line 45
    const-string v3, "android:changeBounds:bounds"

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v1, p1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 51
    .line 52
    iget-object v2, p1, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    const-string v3, "android:changeBounds:parent"

    .line 59
    .line 60
    .line 61
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    iget-boolean v1, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    iget-object p1, p1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 68
    .line 69
    const-string v1, "android:changeBounds:clip"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    :cond_1
    return-void
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
.end method


# virtual methods
.method public captureEndValues(Landroidx/transition/TransitionValues;)V
    .locals 0
    .param p1    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/transition/ChangeBounds;->captureValues(Landroidx/transition/TransitionValues;)V

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

.method public captureStartValues(Landroidx/transition/TransitionValues;)V
    .locals 2
    .param p1    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/transition/ChangeBounds;->captureValues(Landroidx/transition/TransitionValues;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p1, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 10
    .line 11
    sget v1, Landroidx/transition/R$id;->transition_clip:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Landroid/graphics/Rect;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 22
    .line 23
    const-string v1, "android:changeBounds:clip"

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    :cond_0
    return-void
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
.end method

.method public createAnimator(Landroid/view/ViewGroup;Landroidx/transition/TransitionValues;Landroidx/transition/TransitionValues;)Landroid/animation/Animator;
    .locals 24
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    move-object/from16 v2, p3

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    :cond_0
    const/16 p1, 0x0

    .line 13
    .line 14
    goto/16 :goto_c

    .line 15
    .line 16
    :cond_1
    iget-object v7, v1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 17
    .line 18
    iget-object v8, v2, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 19
    .line 20
    const-string v9, "android:changeBounds:parent"

    .line 21
    .line 22
    .line 23
    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object v7

    .line 25
    .line 26
    check-cast v7, Landroid/view/ViewGroup;

    .line 27
    .line 28
    .line 29
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    move-result-object v8

    .line 31
    .line 32
    check-cast v8, Landroid/view/ViewGroup;

    .line 33
    .line 34
    if-eqz v7, :cond_2

    .line 35
    .line 36
    if-nez v8, :cond_3

    .line 37
    .line 38
    :cond_2
    const/16 p1, 0x0

    .line 39
    .line 40
    goto/16 :goto_c

    .line 41
    .line 42
    :cond_3
    iget-object v10, v2, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 43
    .line 44
    iget-object v7, v1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 45
    .line 46
    const-string v8, "android:changeBounds:bounds"

    .line 47
    .line 48
    .line 49
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    move-result-object v7

    .line 51
    .line 52
    check-cast v7, Landroid/graphics/Rect;

    .line 53
    .line 54
    iget-object v9, v2, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    move-result-object v8

    .line 59
    .line 60
    check-cast v8, Landroid/graphics/Rect;

    .line 61
    .line 62
    iget v15, v7, Landroid/graphics/Rect;->left:I

    .line 63
    .line 64
    iget v9, v8, Landroid/graphics/Rect;->left:I

    .line 65
    .line 66
    iget v11, v7, Landroid/graphics/Rect;->top:I

    .line 67
    .line 68
    iget v12, v8, Landroid/graphics/Rect;->top:I

    .line 69
    .line 70
    iget v13, v7, Landroid/graphics/Rect;->right:I

    .line 71
    .line 72
    iget v14, v8, Landroid/graphics/Rect;->right:I

    .line 73
    .line 74
    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    .line 75
    .line 76
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    .line 77
    .line 78
    const/16 p1, 0x0

    .line 79
    .line 80
    sub-int v6, v13, v15

    .line 81
    .line 82
    const/16 v23, 0x1

    .line 83
    .line 84
    sub-int v5, v7, v11

    .line 85
    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    sub-int v4, v14, v9

    .line 89
    .line 90
    sub-int v3, v8, v12

    .line 91
    .line 92
    iget-object v1, v1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 93
    .line 94
    move/from16 v18, v3

    .line 95
    .line 96
    const-string v3, "android:changeBounds:clip"

    .line 97
    .line 98
    .line 99
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    move-result-object v1

    .line 101
    .line 102
    check-cast v1, Landroid/graphics/Rect;

    .line 103
    .line 104
    iget-object v2, v2, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 105
    .line 106
    .line 107
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    move-result-object v2

    .line 109
    .line 110
    check-cast v2, Landroid/graphics/Rect;

    .line 111
    .line 112
    if-eqz v6, :cond_4

    .line 113
    .line 114
    if-nez v5, :cond_5

    .line 115
    .line 116
    :cond_4
    if-eqz v4, :cond_9

    .line 117
    .line 118
    if-eqz v18, :cond_9

    .line 119
    .line 120
    :cond_5
    if-ne v15, v9, :cond_7

    .line 121
    .line 122
    if-eq v11, v12, :cond_6

    .line 123
    goto :goto_0

    .line 124
    .line 125
    :cond_6
    move/from16 v3, v16

    .line 126
    goto :goto_1

    .line 127
    .line 128
    :cond_7
    :goto_0
    move/from16 v3, v23

    .line 129
    .line 130
    :goto_1
    if-ne v13, v14, :cond_8

    .line 131
    .line 132
    if-eq v7, v8, :cond_a

    .line 133
    .line 134
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 135
    goto :goto_2

    .line 136
    .line 137
    :cond_9
    move/from16 v3, v16

    .line 138
    .line 139
    :cond_a
    :goto_2
    if-eqz v1, :cond_b

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 143
    move-result v19

    .line 144
    .line 145
    if-eqz v19, :cond_c

    .line 146
    .line 147
    :cond_b
    if-nez v1, :cond_d

    .line 148
    .line 149
    if-eqz v2, :cond_d

    .line 150
    .line 151
    :cond_c
    add-int/lit8 v3, v3, 0x1

    .line 152
    .line 153
    :cond_d
    if-lez v3, :cond_1b

    .line 154
    .line 155
    move-object/from16 p2, v1

    .line 156
    .line 157
    iget-boolean v1, v0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    .line 158
    .line 159
    if-nez v1, :cond_12

    .line 160
    .line 161
    .line 162
    invoke-static {v10, v15, v11, v13, v7}, Landroidx/transition/ViewUtils;->setLeftTopRightBottom(Landroid/view/View;IIII)V

    .line 163
    const/4 v1, 0x2

    .line 164
    .line 165
    if-ne v3, v1, :cond_f

    .line 166
    .line 167
    if-ne v6, v4, :cond_e

    .line 168
    .line 169
    move/from16 v1, v18

    .line 170
    .line 171
    if-ne v5, v1, :cond_e

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 175
    move-result-object v1

    .line 176
    int-to-float v2, v15

    .line 177
    int-to-float v3, v11

    .line 178
    int-to-float v4, v9

    .line 179
    int-to-float v5, v12

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v2, v3, v4, v5}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 183
    move-result-object v1

    .line 184
    .line 185
    sget-object v2, Landroidx/transition/ChangeBounds;->POSITION_PROPERTY:Landroid/util/Property;

    .line 186
    .line 187
    .line 188
    invoke-static {v10, v2, v1}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 189
    move-result-object v1

    .line 190
    .line 191
    goto/16 :goto_b

    .line 192
    .line 193
    :cond_e
    new-instance v1, Landroidx/transition/ChangeBounds$ViewBounds;

    .line 194
    .line 195
    .line 196
    invoke-direct {v1, v10}, Landroidx/transition/ChangeBounds$ViewBounds;-><init>(Landroid/view/View;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 200
    move-result-object v2

    .line 201
    int-to-float v3, v15

    .line 202
    int-to-float v4, v11

    .line 203
    int-to-float v5, v9

    .line 204
    int-to-float v6, v12

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v3, v4, v5, v6}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 208
    move-result-object v2

    .line 209
    .line 210
    sget-object v3, Landroidx/transition/ChangeBounds;->TOP_LEFT_PROPERTY:Landroid/util/Property;

    .line 211
    .line 212
    .line 213
    invoke-static {v1, v3, v2}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 214
    move-result-object v2

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 218
    move-result-object v3

    .line 219
    int-to-float v4, v13

    .line 220
    int-to-float v5, v7

    .line 221
    int-to-float v6, v14

    .line 222
    int-to-float v7, v8

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v4, v5, v6, v7}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 226
    move-result-object v3

    .line 227
    .line 228
    sget-object v4, Landroidx/transition/ChangeBounds;->BOTTOM_RIGHT_PROPERTY:Landroid/util/Property;

    .line 229
    .line 230
    .line 231
    invoke-static {v1, v4, v3}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 232
    move-result-object v3

    .line 233
    .line 234
    new-instance v4, Landroid/animation/AnimatorSet;

    .line 235
    .line 236
    .line 237
    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 238
    const/4 v5, 0x2

    .line 239
    .line 240
    new-array v5, v5, [Landroid/animation/Animator;

    .line 241
    .line 242
    aput-object v2, v5, v16

    .line 243
    .line 244
    aput-object v3, v5, v23

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4, v5}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 248
    .line 249
    new-instance v2, Landroidx/transition/ChangeBounds$6;

    .line 250
    .line 251
    .line 252
    invoke-direct {v2, v0, v1}, Landroidx/transition/ChangeBounds$6;-><init>(Landroidx/transition/ChangeBounds;Landroidx/transition/ChangeBounds$ViewBounds;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 256
    move-object v1, v4

    .line 257
    .line 258
    goto/16 :goto_b

    .line 259
    .line 260
    :cond_f
    if-ne v15, v9, :cond_11

    .line 261
    .line 262
    if-eq v11, v12, :cond_10

    .line 263
    goto :goto_3

    .line 264
    .line 265
    .line 266
    :cond_10
    invoke-virtual {v0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 267
    move-result-object v1

    .line 268
    int-to-float v2, v13

    .line 269
    int-to-float v3, v7

    .line 270
    int-to-float v4, v14

    .line 271
    int-to-float v5, v8

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v2, v3, v4, v5}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 275
    move-result-object v1

    .line 276
    .line 277
    sget-object v2, Landroidx/transition/ChangeBounds;->BOTTOM_RIGHT_ONLY_PROPERTY:Landroid/util/Property;

    .line 278
    .line 279
    .line 280
    invoke-static {v10, v2, v1}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 281
    move-result-object v1

    .line 282
    .line 283
    goto/16 :goto_b

    .line 284
    .line 285
    .line 286
    :cond_11
    :goto_3
    invoke-virtual {v0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 287
    move-result-object v1

    .line 288
    int-to-float v2, v15

    .line 289
    int-to-float v3, v11

    .line 290
    int-to-float v4, v9

    .line 291
    int-to-float v5, v12

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v2, v3, v4, v5}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 295
    move-result-object v1

    .line 296
    .line 297
    sget-object v2, Landroidx/transition/ChangeBounds;->TOP_LEFT_ONLY_PROPERTY:Landroid/util/Property;

    .line 298
    .line 299
    .line 300
    invoke-static {v10, v2, v1}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 301
    move-result-object v1

    .line 302
    .line 303
    goto/16 :goto_b

    .line 304
    .line 305
    :cond_12
    move/from16 v1, v18

    .line 306
    .line 307
    .line 308
    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    .line 309
    move-result v3

    .line 310
    .line 311
    .line 312
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 313
    move-result v17

    .line 314
    add-int/2addr v3, v15

    .line 315
    .line 316
    move-object/from16 p3, v2

    .line 317
    .line 318
    add-int v2, v11, v17

    .line 319
    .line 320
    .line 321
    invoke-static {v10, v15, v11, v3, v2}, Landroidx/transition/ViewUtils;->setLeftTopRightBottom(Landroid/view/View;IIII)V

    .line 322
    .line 323
    if-ne v15, v9, :cond_14

    .line 324
    .line 325
    if-eq v11, v12, :cond_13

    .line 326
    goto :goto_4

    .line 327
    .line 328
    :cond_13
    move-object/from16 v2, p1

    .line 329
    .line 330
    move/from16 v18, v7

    .line 331
    .line 332
    move/from16 v22, v8

    .line 333
    .line 334
    move/from16 v19, v9

    .line 335
    goto :goto_5

    .line 336
    .line 337
    .line 338
    :cond_14
    :goto_4
    invoke-virtual {v0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 339
    move-result-object v2

    .line 340
    int-to-float v3, v15

    .line 341
    .line 342
    move/from16 v18, v7

    .line 343
    int-to-float v7, v11

    .line 344
    .line 345
    move/from16 v22, v8

    .line 346
    int-to-float v8, v9

    .line 347
    .line 348
    move/from16 v19, v9

    .line 349
    int-to-float v9, v12

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v3, v7, v8, v9}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 353
    move-result-object v2

    .line 354
    .line 355
    sget-object v3, Landroidx/transition/ChangeBounds;->POSITION_PROPERTY:Landroid/util/Property;

    .line 356
    .line 357
    .line 358
    invoke-static {v10, v3, v2}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 359
    move-result-object v2

    .line 360
    .line 361
    :goto_5
    move/from16 v20, v12

    .line 362
    .line 363
    if-nez p2, :cond_15

    .line 364
    .line 365
    move/from16 v12, v23

    .line 366
    goto :goto_6

    .line 367
    .line 368
    :cond_15
    move/from16 v12, v16

    .line 369
    .line 370
    :goto_6
    if-eqz v12, :cond_16

    .line 371
    .line 372
    new-instance v3, Landroid/graphics/Rect;

    .line 373
    .line 374
    move/from16 v7, v16

    .line 375
    .line 376
    .line 377
    invoke-direct {v3, v7, v7, v6, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 378
    goto :goto_7

    .line 379
    .line 380
    :cond_16
    move/from16 v7, v16

    .line 381
    .line 382
    move-object/from16 v3, p2

    .line 383
    .line 384
    :goto_7
    move/from16 v21, v14

    .line 385
    .line 386
    if-nez p3, :cond_17

    .line 387
    .line 388
    move/from16 v14, v23

    .line 389
    goto :goto_8

    .line 390
    :cond_17
    move v14, v7

    .line 391
    .line 392
    :goto_8
    if-eqz v14, :cond_18

    .line 393
    .line 394
    new-instance v5, Landroid/graphics/Rect;

    .line 395
    .line 396
    .line 397
    invoke-direct {v5, v7, v7, v4, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 398
    goto :goto_9

    .line 399
    .line 400
    :cond_18
    move-object/from16 v5, p3

    .line 401
    .line 402
    .line 403
    :goto_9
    invoke-virtual {v3, v5}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 404
    move-result v1

    .line 405
    .line 406
    if-nez v1, :cond_19

    .line 407
    .line 408
    .line 409
    invoke-virtual {v10, v3}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 410
    .line 411
    sget-object v1, Landroidx/transition/ChangeBounds;->sRectEvaluator:Landroidx/transition/RectEvaluator;

    .line 412
    .line 413
    .line 414
    filled-new-array {v3, v5}, [Ljava/lang/Object;

    .line 415
    move-result-object v4

    .line 416
    .line 417
    const-string v6, "clipBounds"

    .line 418
    .line 419
    .line 420
    invoke-static {v10, v6, v1, v4}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    .line 421
    move-result-object v6

    .line 422
    .line 423
    new-instance v9, Landroidx/transition/ChangeBounds$ClipListener;

    .line 424
    .line 425
    move/from16 v16, v11

    .line 426
    .line 427
    move/from16 v17, v13

    .line 428
    move-object v11, v3

    .line 429
    move-object v13, v5

    .line 430
    .line 431
    .line 432
    invoke-direct/range {v9 .. v22}, Landroidx/transition/ChangeBounds$ClipListener;-><init>(Landroid/view/View;Landroid/graphics/Rect;ZLandroid/graphics/Rect;ZIIIIIIII)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v6, v9}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v9}, Landroidx/transition/Transition;->addListener(Landroidx/transition/Transition$TransitionListener;)Landroidx/transition/Transition;

    .line 439
    goto :goto_a

    .line 440
    .line 441
    :cond_19
    move-object/from16 v6, p1

    .line 442
    .line 443
    .line 444
    :goto_a
    invoke-static {v2, v6}, Landroidx/transition/TransitionUtils;->mergeAnimators(Landroid/animation/Animator;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 445
    move-result-object v1

    .line 446
    .line 447
    .line 448
    :goto_b
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 449
    move-result-object v2

    .line 450
    .line 451
    instance-of v2, v2, Landroid/view/ViewGroup;

    .line 452
    .line 453
    if-eqz v2, :cond_1a

    .line 454
    .line 455
    .line 456
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 457
    move-result-object v2

    .line 458
    .line 459
    check-cast v2, Landroid/view/ViewGroup;

    .line 460
    .line 461
    move/from16 v3, v23

    .line 462
    .line 463
    .line 464
    invoke-static {v2, v3}, Landroidx/transition/ViewGroupUtils;->suppressLayout(Landroid/view/ViewGroup;Z)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0}, Landroidx/transition/Transition;->getRootTransition()Landroidx/transition/Transition;

    .line 468
    move-result-object v3

    .line 469
    .line 470
    new-instance v4, Landroidx/transition/ChangeBounds$SuppressLayoutListener;

    .line 471
    .line 472
    .line 473
    invoke-direct {v4, v2}, Landroidx/transition/ChangeBounds$SuppressLayoutListener;-><init>(Landroid/view/ViewGroup;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v3, v4}, Landroidx/transition/Transition;->addListener(Landroidx/transition/Transition$TransitionListener;)Landroidx/transition/Transition;

    .line 477
    :cond_1a
    return-object v1

    .line 478
    :cond_1b
    :goto_c
    return-object p1
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
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
.end method

.method public getResizeClip()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

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

.method public getTransitionProperties()[Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/transition/ChangeBounds;->sTransitionProperties:[Ljava/lang/String;

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
    .line 17
    .line 18
.end method

.method public isSeekingSupported()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public setResizeClip(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

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
