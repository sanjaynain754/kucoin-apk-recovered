.class public Lcom/swmansion/reanimated/keyboard/Keyboard;
.super Ljava/lang/Object;
.source "Keyboard.java"


# static fields
.field private static final CONTENT_TYPE_MASK:I

.field private static final SYSTEM_BAR_TYPE_MASK:I


# instance fields
.field private mActiveTransitionCounter:I

.field private mHeight:I

.field private mState:Lcom/swmansion/reanimated/keyboard/KeyboardState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    .line 4
    move-result v0

    .line 5
    .line 6
    sput v0, Lcom/swmansion/reanimated/keyboard/Keyboard;->CONTENT_TYPE_MASK:I

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    .line 10
    move-result v0

    .line 11
    .line 12
    sput v0, Lcom/swmansion/reanimated/keyboard/Keyboard;->SYSTEM_BAR_TYPE_MASK:I

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/swmansion/reanimated/keyboard/KeyboardState;->UNKNOWN:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mState:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput v0, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mHeight:I

    .line 11
    .line 12
    iput v0, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mActiveTransitionCounter:I

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mHeight:I

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
.end method

.method public getState()Lcom/swmansion/reanimated/keyboard/KeyboardState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mState:Lcom/swmansion/reanimated/keyboard/KeyboardState;

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
.end method

.method public onAnimationEnd()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mActiveTransitionCounter:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mActiveTransitionCounter:I

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget v0, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mHeight:I

    .line 11
    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/swmansion/reanimated/keyboard/KeyboardState;->CLOSED:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    sget-object v0, Lcom/swmansion/reanimated/keyboard/KeyboardState;->OPEN:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 18
    .line 19
    :goto_0
    iput-object v0, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mState:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 20
    :cond_1
    return-void
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
.end method

.method public onAnimationStart()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mActiveTransitionCounter:I

    .line 3
    .line 4
    if-lez v0, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mState:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 7
    .line 8
    sget-object v2, Lcom/swmansion/reanimated/keyboard/KeyboardState;->OPENING:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    sget-object v2, Lcom/swmansion/reanimated/keyboard/KeyboardState;->CLOSING:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 13
    .line 14
    :cond_0
    iput-object v2, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mState:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 15
    goto :goto_1

    .line 16
    .line 17
    :cond_1
    iget v1, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mHeight:I

    .line 18
    .line 19
    if-gtz v1, :cond_2

    .line 20
    .line 21
    sget-object v1, Lcom/swmansion/reanimated/keyboard/KeyboardState;->OPENING:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_2
    sget-object v1, Lcom/swmansion/reanimated/keyboard/KeyboardState;->CLOSING:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 25
    .line 26
    :goto_0
    iput-object v1, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mState:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 27
    .line 28
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    iput v0, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mActiveTransitionCounter:I

    .line 31
    return-void
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

.method public updateHeight(Landroidx/core/view/WindowInsetsCompat;Z)V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/swmansion/reanimated/keyboard/Keyboard;->CONTENT_TYPE_MASK:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v0, v0, Landroidx/core/graphics/Insets;->bottom:I

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    move p1, v1

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    sget p2, Lcom/swmansion/reanimated/keyboard/Keyboard;->SYSTEM_BAR_TYPE_MASK:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iget p1, p1, Landroidx/core/graphics/Insets;->bottom:I

    .line 22
    :goto_0
    sub-int/2addr v0, p1

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 26
    move-result p1

    .line 27
    int-to-float p1, p1

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 31
    move-result p1

    .line 32
    float-to-int p1, p1

    .line 33
    .line 34
    if-gtz p1, :cond_1

    .line 35
    .line 36
    iget-object p2, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mState:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 37
    .line 38
    sget-object v0, Lcom/swmansion/reanimated/keyboard/KeyboardState;->OPEN:Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 39
    .line 40
    if-ne p2, v0, :cond_1

    .line 41
    return-void

    .line 42
    .line 43
    :cond_1
    iput p1, p0, Lcom/swmansion/reanimated/keyboard/Keyboard;->mHeight:I

    .line 44
    return-void
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
.end method
