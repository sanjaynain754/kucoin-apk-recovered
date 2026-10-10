.class Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "ReactEditTextInputConnectionWrapper.java"


# static fields
.field public static final BACKSPACE_KEY_VALUE:Ljava/lang/String; = "Backspace"

.field public static final ENTER_KEY_VALUE:Ljava/lang/String; = "Enter"

.field public static final NEWLINE_RAW_VALUE:Ljava/lang/String; = "\n"


# instance fields
.field private mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

.field private mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private mIsBatchEdit:Z

.field private mKey:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mKey:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

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

.method private dispatchKeyEvent(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "\n"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string p1, "Enter"

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 13
    .line 14
    new-instance v1, Lcom/facebook/react/views/textinput/ReactTextInputKeyPressEvent;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 20
    move-result v2

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, p1}, Lcom/facebook/react/views/textinput/ReactTextInputKeyPressEvent;-><init>(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

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

.method private dispatchKeyEventOrEnqueue(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mIsBatchEdit:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mKey:Ljava/lang/String;

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->dispatchKeyEvent(Ljava/lang/String;)V

    .line 11
    return-void
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


# virtual methods
.method public beginBatchEdit()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mIsBatchEdit:Z

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    .line 7
    move-result v0

    .line 8
    return v0
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

.method public commitText(Ljava/lang/CharSequence;I)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    .line 11
    if-gt v1, v2, :cond_1

    .line 12
    .line 13
    const-string v1, ""

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const-string v0, "Backspace"

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->dispatchKeyEventOrEnqueue(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->commitText(Ljava/lang/CharSequence;I)Z

    .line 28
    move-result p1

    .line 29
    return p1
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

.method public deleteSurroundingText(II)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "Backspace"

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->dispatchKeyEvent(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    .line 9
    move-result p1

    .line 10
    return p1
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
.end method

.method public endBatchEdit()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mIsBatchEdit:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mKey:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->dispatchKeyEvent(Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mKey:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-super {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 10
    move-result v0

    .line 11
    .line 12
    const/16 v1, 0x3a

    .line 13
    .line 14
    if-ge v0, v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 18
    move-result v0

    .line 19
    .line 20
    const/16 v1, 0x2f

    .line 21
    .line 22
    if-le v0, v1, :cond_0

    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 29
    move-result v1

    .line 30
    .line 31
    const/16 v2, 0x43

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    const-string v0, "Backspace"

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->dispatchKeyEvent(Ljava/lang/String;)V

    .line 39
    goto :goto_1

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 43
    move-result v1

    .line 44
    .line 45
    const/16 v2, 0x42

    .line 46
    .line 47
    if-ne v1, v2, :cond_2

    .line 48
    .line 49
    const-string v0, "Enter"

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->dispatchKeyEvent(Ljava/lang/String;)V

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_2
    if-eqz v0, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getNumber()C

    .line 59
    move-result v0

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, v0}, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->dispatchKeyEvent(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    :goto_1
    invoke-super {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 70
    move-result p1

    .line 71
    return p1
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->setComposingText(Ljava/lang/CharSequence;I)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    iget-object p2, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/widget/TextView;->getSelectionStart()I

    .line 22
    move-result p2

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x1

    .line 25
    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    move v1, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v1, v2

    .line 30
    .line 31
    :goto_0
    if-ne p2, v0, :cond_1

    .line 32
    move v2, v3

    .line 33
    .line 34
    :cond_1
    if-lt p2, v0, :cond_4

    .line 35
    .line 36
    if-gtz p2, :cond_2

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_2
    if-nez v1, :cond_3

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :cond_3
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 48
    move-result-object v0

    .line 49
    sub-int/2addr p2, v3

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 53
    move-result p2

    .line 54
    .line 55
    .line 56
    invoke-static {p2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 57
    move-result-object p2

    .line 58
    goto :goto_2

    .line 59
    .line 60
    :cond_4
    :goto_1
    const-string p2, "Backspace"

    .line 61
    .line 62
    .line 63
    :goto_2
    invoke-direct {p0, p2}, Lcom/facebook/react/views/textinput/ReactEditTextInputConnectionWrapper;->dispatchKeyEventOrEnqueue(Ljava/lang/String;)V

    .line 64
    return p1
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
.end method
