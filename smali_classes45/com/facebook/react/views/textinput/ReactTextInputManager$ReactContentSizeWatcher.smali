.class Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;
.super Ljava/lang/Object;
.source "ReactTextInputManager.java"

# interfaces
.implements Lcom/facebook/react/views/textinput/ContentSizeWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/textinput/ReactTextInputManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReactContentSizeWatcher"
.end annotation


# instance fields
.field private final mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

.field private final mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private mPreviousContentHeight:I

.field private mPreviousContentWidth:I

.field private final mSurfaceId:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/textinput/ReactEditText;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mPreviousContentWidth:I

    .line 7
    .line 8
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mPreviousContentHeight:I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getReactContext(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->c(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/ReactEditText;)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/content/Context;)I

    .line 24
    move-result p1

    .line 25
    .line 26
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mSurfaceId:I

    .line 27
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method


# virtual methods
.method public onLayout()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 11
    move-result v0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 17
    move-result v1

    .line 18
    .line 19
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    .line 31
    move-result v0

    .line 32
    .line 33
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/text/Layout;->getWidth()I

    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    .line 44
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    .line 48
    move-result v1

    .line 49
    add-int/2addr v0, v1

    .line 50
    .line 51
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 55
    move-result v1

    .line 56
    .line 57
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    .line 65
    move-result v2

    .line 66
    add-int/2addr v1, v2

    .line 67
    .line 68
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 72
    move-result v2

    .line 73
    add-int/2addr v1, v2

    .line 74
    .line 75
    :cond_1
    iget v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mPreviousContentWidth:I

    .line 76
    .line 77
    if-ne v0, v2, :cond_3

    .line 78
    .line 79
    iget v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mPreviousContentHeight:I

    .line 80
    .line 81
    if-eq v1, v2, :cond_2

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    :goto_0
    return-void

    .line 84
    .line 85
    :cond_3
    :goto_1
    iput v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mPreviousContentHeight:I

    .line 86
    .line 87
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mPreviousContentWidth:I

    .line 88
    .line 89
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 90
    .line 91
    new-instance v3, Lcom/facebook/react/views/textinput/ReactContentSizeChangedEvent;

    .line 92
    .line 93
    iget v4, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mSurfaceId:I

    .line 94
    .line 95
    iget-object v5, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactContentSizeWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 99
    move-result v5

    .line 100
    int-to-float v0, v0

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 104
    move-result v0

    .line 105
    int-to-float v1, v1

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 109
    move-result v1

    .line 110
    .line 111
    .line 112
    invoke-direct {v3, v4, v5, v0, v1}, Lcom/facebook/react/views/textinput/ReactContentSizeChangedEvent;-><init>(IIFF)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v2, v3}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 116
    return-void
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
