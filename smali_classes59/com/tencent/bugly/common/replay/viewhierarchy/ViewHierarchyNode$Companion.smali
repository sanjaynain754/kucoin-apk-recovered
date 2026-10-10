.class public final Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rJ\u001e\u0010\u000e\u001a\u00020\u000f*\u0006\u0012\u0002\u0008\u00030\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0012H\u0002J\u0014\u0010\u0013\u001a\u00020\u000f*\u00020\u00082\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0014\u0010\u0014\u001a\u00020\u000f*\u00020\u00152\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0014\u0010\u0016\u001a\u00020\u000f*\u00020\u00082\u0006\u0010\u000c\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;",
        "",
        "()V",
        "BUGLY_UNMASK_TAG",
        "",
        "fromView",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
        "view",
        "Landroid/view/View;",
        "parent",
        "distance",
        "",
        "options",
        "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;",
        "isAssignableFrom",
        "",
        "Ljava/lang/Class;",
        "set",
        "",
        "isMaskContainer",
        "isUnmaskContainer",
        "Landroid/view/ViewParent;",
        "shouldMask",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;-><init>()V

    return-void
.end method

.method private final isAssignableFrom(Ljava/lang/Class;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
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
.end method

.method private final isMaskContainer(Landroid/view/View;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->getMaskViewContainerClass()Ljava/lang/String;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method private final isUnmaskContainer(Landroid/view/ViewParent;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->getUnmaskViewContainerClass()Ljava/lang/String;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method private final shouldMask(Landroid/view/View;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v1, v0, Ljava/lang/String;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    const/4 v1, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    const-string/jumbo v4, "this as java.lang.String).toLowerCase()"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const-string v4, "bugly-unmask"

    .line 32
    const/4 v5, 0x2

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v4, v3, v5, v2}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-ne v0, v1, :cond_1

    .line 39
    goto :goto_1

    .line 40
    .line 41
    :cond_1
    sget v0, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->MASK_KEY:I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    const-string/jumbo v2, "unmask"

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    move-result v0

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    :goto_1
    return v3

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;->isMaskContainer(Landroid/view/View;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)Z

    .line 59
    move-result v0

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    .line 74
    const-string/jumbo v2, "this.parent"

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0, v0, p2}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;->isUnmaskContainer(Landroid/view/ViewParent;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)Z

    .line 81
    move-result v0

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    return v3

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->getUnmaskViewClasses()Ljava/util/Set;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    .line 95
    const-string/jumbo v0, "options.unmaskViewClasses"

    .line 96
    .line 97
    .line 98
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p0, p1, p2}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;->isAssignableFrom(Ljava/lang/Class;Ljava/util/Set;)Z

    .line 102
    move-result p1

    .line 103
    .line 104
    if-eqz p1, :cond_4

    .line 105
    return v3

    .line 106
    :cond_4
    return v1
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
.method public final fromView(Landroid/view/View;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ILcom/tencent/bugly/common/replay/BuglyReplayOptions;)Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
    .locals 16
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/tencent/bugly/common/replay/BuglyReplayOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v7, p2

    .line 5
    .line 6
    move-object/from16 v1, p4

    .line 7
    .line 8
    .line 9
    const-string/jumbo v2, "view"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "options"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/tencent/bugly/common/replay/tool/ViewsKt;->isVisibleToUser(Landroid/view/View;)Lkotlin/Pair;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    check-cast v3, Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    move-result v10

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 36
    move-result-object v2

    .line 37
    move-object v11, v2

    .line 38
    .line 39
    check-cast v11, Landroid/graphics/Rect;

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x1

    .line 42
    .line 43
    move-object/from16 v4, p0

    .line 44
    .line 45
    if-eqz v10, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v0, v1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;->shouldMask(Landroid/view/View;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)Z

    .line 49
    move-result v1

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    move v12, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v12, v2

    .line 55
    .line 56
    :goto_0
    instance-of v1, v0, Landroid/widget/TextView;

    .line 57
    const/4 v5, 0x0

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    if-eqz v7, :cond_1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7, v3}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->setImportantForCaptureToAncestors(Z)V

    .line 65
    .line 66
    :cond_1
    check-cast v0, Landroid/widget/TextView;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    new-instance v2, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;

    .line 75
    .line 76
    .line 77
    invoke-direct {v2, v1}, Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;-><init>(Landroid/text/Layout;)V

    .line 78
    :goto_1
    move-object v1, v2

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    const/4 v2, 0x0

    .line 81
    goto :goto_1

    .line 82
    .line 83
    .line 84
    :goto_2
    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 85
    move-result v2

    .line 86
    .line 87
    .line 88
    invoke-static {v2}, Lcom/tencent/bugly/common/replay/tool/ViewsKt;->toOpaque(I)I

    .line 89
    move-result v2

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    .line 93
    move-result v3

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingTop()I

    .line 97
    move-result v4

    .line 98
    move v6, v5

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 102
    move-result v5

    .line 103
    move v8, v6

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 107
    move-result v6

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 111
    move-result v7

    .line 112
    move v9, v8

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 116
    move-result v8

    .line 117
    .line 118
    if-eqz p2, :cond_3

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {p2 .. p2}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getElevation()F

    .line 122
    move-result v9

    .line 123
    .line 124
    .line 125
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    .line 126
    move-result v0

    .line 127
    add-float/2addr v9, v0

    .line 128
    .line 129
    new-instance v0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;

    .line 130
    .line 131
    .line 132
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    move-result-object v2

    .line 134
    const/4 v13, 0x1

    .line 135
    move v14, v10

    .line 136
    move-object v15, v11

    .line 137
    .line 138
    move-object/from16 v11, p2

    .line 139
    .line 140
    move/from16 v10, p3

    .line 141
    .line 142
    .line 143
    invoke-direct/range {v0 .. v15}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;-><init>(Lcom/tencent/bugly/common/replay/tool/TextLayout;Ljava/lang/Integer;IIFFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V

    .line 144
    return-object v0

    .line 145
    :cond_4
    move v9, v5

    .line 146
    .line 147
    instance-of v1, v0, Landroid/widget/ImageView;

    .line 148
    .line 149
    if-eqz v1, :cond_8

    .line 150
    .line 151
    if-eqz v7, :cond_5

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v3}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->setImportantForCaptureToAncestors(Z)V

    .line 155
    .line 156
    :cond_5
    check-cast v0, Landroid/widget/ImageView;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 160
    move-result v1

    .line 161
    move v4, v2

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 165
    move-result v2

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 169
    move-result v5

    .line 170
    move v6, v4

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 174
    move-result v4

    .line 175
    .line 176
    if-eqz v7, :cond_6

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getElevation()F

    .line 180
    move-result v8

    .line 181
    goto :goto_3

    .line 182
    :cond_6
    move v8, v9

    .line 183
    .line 184
    .line 185
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    .line 186
    move-result v9

    .line 187
    add-float/2addr v9, v8

    .line 188
    .line 189
    if-eqz v12, :cond_7

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    if-eqz v0, :cond_7

    .line 196
    .line 197
    .line 198
    invoke-static {v0}, Lcom/tencent/bugly/common/replay/tool/ViewsKt;->isMaskable(Landroid/graphics/drawable/Drawable;)Z

    .line 199
    move-result v0

    .line 200
    .line 201
    if-ne v0, v3, :cond_7

    .line 202
    move v8, v3

    .line 203
    goto :goto_4

    .line 204
    :cond_7
    move v8, v6

    .line 205
    .line 206
    :goto_4
    new-instance v0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;

    .line 207
    move v3, v5

    .line 208
    move v5, v9

    .line 209
    const/4 v9, 0x1

    .line 210
    .line 211
    move/from16 v6, p3

    .line 212
    .line 213
    .line 214
    invoke-direct/range {v0 .. v11}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;-><init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V

    .line 215
    return-object v0

    .line 216
    .line 217
    :cond_8
    new-instance v0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getX()F

    .line 221
    move-result v1

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getY()F

    .line 225
    move-result v2

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    .line 229
    move-result v3

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getHeight()I

    .line 233
    move-result v4

    .line 234
    .line 235
    if-eqz p2, :cond_9

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {p2 .. p2}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->getElevation()F

    .line 239
    move-result v5

    .line 240
    goto :goto_5

    .line 241
    :cond_9
    move v5, v9

    .line 242
    .line 243
    .line 244
    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getElevation()F

    .line 245
    move-result v6

    .line 246
    add-float/2addr v5, v6

    .line 247
    const/4 v9, 0x0

    .line 248
    .line 249
    move-object/from16 v7, p2

    .line 250
    .line 251
    move/from16 v6, p3

    .line 252
    move v8, v12

    .line 253
    .line 254
    .line 255
    invoke-direct/range {v0 .. v11}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;-><init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V

    .line 256
    return-object v0
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
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
.end method
