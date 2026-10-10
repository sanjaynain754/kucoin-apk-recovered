.class public Lcom/facebook/react/uimanager/ReactClippingViewGroupHelper;
.super Ljava/lang/Object;
.source "ReactClippingViewGroupHelper.java"


# static fields
.field public static final PROP_REMOVE_CLIPPED_SUBVIEWS:Ljava/lang/String; = "removeClippedSubviews"

.field private static final sHelperRect:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/ReactClippingViewGroupHelper;->sHelperRect:Landroid/graphics/Rect;

    .line 8
    return-void
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

.method public constructor <init>()V
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

.method public static calculateClippingRect(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/graphics/Rect;->setEmpty()V

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    instance-of v1, v0, Lcom/facebook/react/uimanager/ReactClippingViewGroup;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    check-cast v0, Lcom/facebook/react/uimanager/ReactClippingViewGroup;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lcom/facebook/react/uimanager/ReactClippingViewGroup;->getRemoveClippedSubviews()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    sget-object v1, Lcom/facebook/react/uimanager/ReactClippingViewGroupHelper;->sHelperRect:Landroid/graphics/Rect;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/ReactClippingViewGroup;->getClippingRect(Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 31
    move-result v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 35
    move-result v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 39
    move-result v3

    .line 40
    float-to-int v3, v3

    .line 41
    add-int/2addr v2, v3

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 45
    move-result v3

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 49
    move-result v4

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 53
    move-result v5

    .line 54
    float-to-int v5, v5

    .line 55
    add-int/2addr v4, v5

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v0, v2, v3, v4}, Landroid/graphics/Rect;->intersect(IIII)Z

    .line 59
    move-result v0

    .line 60
    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/graphics/Rect;->setEmpty()V

    .line 65
    return-void

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 69
    move-result v0

    .line 70
    neg-int v0, v0

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 74
    move-result v2

    .line 75
    neg-int v2, v2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Rect;->offset(II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    .line 82
    move-result v0

    .line 83
    float-to-int v0, v0

    .line 84
    neg-int v0, v0

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 88
    move-result v2

    .line 89
    float-to-int v2, v2

    .line 90
    neg-int v2, v2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Rect;->offset(II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 97
    move-result v0

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 101
    move-result p0

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v0, p0}, Landroid/graphics/Rect;->offset(II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 108
    return-void

    .line 109
    .line 110
    .line 111
    :cond_2
    invoke-virtual {p0, p1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 112
    return-void
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
