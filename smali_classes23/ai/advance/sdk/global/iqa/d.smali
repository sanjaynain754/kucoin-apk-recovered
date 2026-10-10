.class abstract Lai/advance/sdk/global/iqa/d;
.super Lai/advance/core/PermissionActivity;
.source "SourceFile"


# instance fields
.field public i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

.field public j:Landroidx/appcompat/app/AlertDialog;

.field public k:Landroidx/appcompat/app/AlertDialog;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lai/advance/core/PermissionActivity;-><init>()V

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
.end method


# virtual methods
.method public H()[Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "android.permission.CAMERA"

    .line 3
    .line 4
    .line 5
    filled-new-array {v0}, [Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public I()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ls/b;->i()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/d;->O()V

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lai/advance/sdk/global/iqa/lib/code/ErrorCode;->DEVICE_NOT_SUPPORT:Lai/advance/sdk/global/iqa/lib/code/ErrorCode;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ls/a;->o(Lai/advance/sdk/global/iqa/lib/code/ErrorCode;)V

    .line 16
    .line 17
    sget v0, Lai/advance/sdk/global/iqa/R$string;->device_not_support:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Ls/a;->q(Ljava/lang/String;)V

    .line 25
    .line 26
    new-instance v1, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, p0}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    sget v1, Lai/advance/sdk/global/iqa/R$string;->iqa_confirm:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    new-instance v2, Lai/advance/sdk/global/iqa/d$a;

    .line 46
    .line 47
    .line 48
    invoke-direct {v2, p0}, Lai/advance/sdk/global/iqa/d$a;-><init>(Lai/advance/sdk/global/iqa/d;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 52
    move-result-object v0

    .line 53
    const/4 v1, 0x0

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setCancelable(Z)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    iput-object v0, p0, Lai/advance/sdk/global/iqa/d;->k:Landroidx/appcompat/app/AlertDialog;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 67
    return-void
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
.end method

.method public J()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lai/advance/sdk/global/iqa/lib/code/ErrorCode;->CAMERA_PERMISSION_DENIED:Lai/advance/sdk/global/iqa/lib/code/ErrorCode;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ls/a;->o(Lai/advance/sdk/global/iqa/lib/code/ErrorCode;)V

    .line 6
    .line 7
    sget v0, Lai/advance/sdk/global/iqa/R$string;->iqa_no_camera_permission:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Ls/a;->q(Ljava/lang/String;)V

    .line 15
    .line 16
    new-instance v1, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, p0}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    sget v1, Lai/advance/sdk/global/iqa/R$string;->iqa_confirm:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    new-instance v2, Lai/advance/sdk/global/iqa/d$b;

    .line 36
    .line 37
    .line 38
    invoke-direct {v2, p0}, Lai/advance/sdk/global/iqa/d$b;-><init>(Lai/advance/sdk/global/iqa/d;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setCancelable(Z)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iput-object v0, p0, Lai/advance/sdk/global/iqa/d;->j:Landroidx/appcompat/app/AlertDialog;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 57
    return-void
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
.end method

.method public K()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/core/PermissionActivity;->G()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/d;->I()V

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/d;->H()[Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const/16 v1, 0xc7

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0, v1}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 20
    return-void
.end method

.method public L(Landroid/os/Bundle;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const-string v0, "instance_page_state"

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 11
    .line 12
    iput-object p1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    new-instance p1, Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 19
    .line 20
    .line 21
    invoke-direct {p1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;-><init>()V

    .line 22
    .line 23
    iput-object p1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    const-string/jumbo v0, "uiExtras"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 39
    .line 40
    check-cast p1, Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->setUIExtras(Lai/advance/sdk/global/iqa/lib/UIExtras;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getScreenOrientation()Ljava/lang/Integer;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 53
    move-result p1

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    const-string/jumbo v0, "spannableTextAboveCamera"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getCharSequenceExtra(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 72
    .line 73
    iget-object v1, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 74
    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    new-instance v1, Lai/advance/sdk/global/iqa/lib/UIExtras$a;

    .line 78
    .line 79
    .line 80
    invoke-direct {v1}, Lai/advance/sdk/global/iqa/lib/UIExtras$a;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/UIExtras$a;->a()Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->setUIExtras(Lai/advance/sdk/global/iqa/lib/UIExtras;)V

    .line 88
    .line 89
    :cond_3
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 90
    .line 91
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p1}, Lai/advance/sdk/global/iqa/lib/UIExtras;->setSpannableTextAboveCamera(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    .line 101
    const-string/jumbo v0, "spannableTipTextOfTakePhoto"

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getCharSequenceExtra(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    if-eqz p1, :cond_6

    .line 108
    .line 109
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 110
    .line 111
    iget-object v1, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 112
    .line 113
    if-nez v1, :cond_5

    .line 114
    .line 115
    new-instance v1, Lai/advance/sdk/global/iqa/lib/UIExtras$a;

    .line 116
    .line 117
    .line 118
    invoke-direct {v1}, Lai/advance/sdk/global/iqa/lib/UIExtras$a;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/UIExtras$a;->a()Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->setUIExtras(Lai/advance/sdk/global/iqa/lib/UIExtras;)V

    .line 126
    .line 127
    :cond_5
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 128
    .line 129
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, p1}, Lai/advance/sdk/global/iqa/lib/UIExtras;->setSpannableTipTextOfTakePhoto(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    .line 139
    const-string/jumbo v0, "spannablePreviewTipOfTakePhoto"

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getCharSequenceExtra(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    if-eqz p1, :cond_8

    .line 146
    .line 147
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 148
    .line 149
    iget-object v1, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 150
    .line 151
    if-nez v1, :cond_7

    .line 152
    .line 153
    new-instance v1, Lai/advance/sdk/global/iqa/lib/UIExtras$a;

    .line 154
    .line 155
    .line 156
    invoke-direct {v1}, Lai/advance/sdk/global/iqa/lib/UIExtras$a;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/UIExtras$a;->a()Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 160
    move-result-object v1

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->setUIExtras(Lai/advance/sdk/global/iqa/lib/UIExtras;)V

    .line 164
    .line 165
    :cond_7
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 166
    .line 167
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p1}, Lai/advance/sdk/global/iqa/lib/UIExtras;->setSpannablePreviewTipOfTakePhoto(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    :cond_8
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 174
    move-result-object p1

    .line 175
    .line 176
    const-string v0, "iqaExtras"

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    check-cast p1, Lai/advance/sdk/global/iqa/lib/IQAExtras;

    .line 183
    .line 184
    if-eqz p1, :cond_9

    .line 185
    .line 186
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, p1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->setIQAExtras(Lai/advance/sdk/global/iqa/lib/IQAExtras;)V

    .line 190
    .line 191
    iget-object p1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/d;->M()I

    .line 195
    move-result v0

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->setScreenOrientation(I)V

    .line 199
    .line 200
    iget-object p1, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 201
    .line 202
    .line 203
    invoke-static {}, Ls/b;->f()I

    .line 204
    move-result v0

    .line 205
    .line 206
    .line 207
    invoke-static {v0, p0}, Lk/c;->e(ILandroid/app/Activity;)I

    .line 208
    move-result v0

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->setCameraAngle(I)V

    .line 212
    return-void

    .line 213
    .line 214
    :cond_9
    new-instance p1, Ljava/lang/NullPointerException;

    .line 215
    .line 216
    const-string v0, "IQAExtras can\'t be null"

    .line 217
    .line 218
    .line 219
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 220
    throw p1
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
.end method

.method public M()I
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    .line 21
    move-result v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    .line 25
    move-result v0

    .line 26
    .line 27
    if-ge v2, v0, :cond_0

    .line 28
    return v1

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :cond_1
    return v0
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
.end method

.method public N()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SourceLockedOrientationActivity"
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0xe

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

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
.end method

.method public abstract O()V
.end method

.method public P()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getScreenOrientation()Ljava/lang/Integer;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    const/16 v0, 0xa

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 21
    return-void
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
.end method

.method public finish()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Landroid/app/Activity;->finish()V

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
    .line 19
    .line 20
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const/16 v1, 0x80

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/d;->P()V

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lk/i;->a(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lai/advance/sdk/global/iqa/d;->L(Landroid/os/Bundle;)V

    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->j:Landroidx/appcompat/app/AlertDialog;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->j:Landroidx/appcompat/app/AlertDialog;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->k:Landroidx/appcompat/app/AlertDialog;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->k:Landroidx/appcompat/app/AlertDialog;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 34
    return-void
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
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Lai/advance/core/PermissionActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 4
    .line 5
    const/16 p3, 0xc7

    .line 6
    .line 7
    if-ne p1, p3, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lai/advance/core/PermissionActivity;->G()Z

    .line 11
    move-result p1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/d;->I()V

    .line 17
    return-void

    .line 18
    :cond_0
    array-length p1, p2

    .line 19
    .line 20
    if-lez p1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/d;->J()V

    .line 24
    :cond_1
    return-void
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
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 3
    .line 4
    const-string v1, "instance_page_state"

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

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
    .line 24
.end method
