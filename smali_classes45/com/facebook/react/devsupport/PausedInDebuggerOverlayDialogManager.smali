.class Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;
.super Ljava/lang/Object;
.source "PausedInDebuggerOverlayDialogManager.java"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;


# instance fields
.field private final mContextSupplier:Landroidx/core/util/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Supplier<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private mPausedInDebuggerDialog:Landroid/app/Dialog;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/core/util/Supplier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/util/Supplier<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;->mContextSupplier:Landroidx/core/util/Supplier;

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
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic a(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;->onResume()V

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

.method public static synthetic b(Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;->lambda$showPausedInDebuggerOverlay$1(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;Ljava/lang/String;)V

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
.end method

.method public static synthetic c(Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;->lambda$hidePausedInDebuggerOverlay$2()V

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

.method private synthetic lambda$hidePausedInDebuggerOverlay$2()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;->mPausedInDebuggerDialog:Landroid/app/Dialog;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;->mPausedInDebuggerDialog:Landroid/app/Dialog;

    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private synthetic lambda$showPausedInDebuggerOverlay$1(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;->mPausedInDebuggerDialog:Landroid/app/Dialog;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;->mContextSupplier:Landroidx/core/util/Supplier;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Landroidx/core/util/Supplier;->get()Ljava/lang/Object;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Landroid/content/Context;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    return-void

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    sget v2, Lcom/facebook/react/R$layout;->paused_in_debugger_view:I

    .line 25
    const/4 v3, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    sget v2, Lcom/facebook/react/R$id;->button:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    check-cast v2, Landroid/view/View;

    .line 42
    .line 43
    new-instance v3, Lcom/facebook/react/devsupport/k0;

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, p1}, Lcom/facebook/react/devsupport/k0;-><init>(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    .line 51
    sget p1, Lcom/facebook/react/R$id;->button_text:I

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    check-cast p1, Landroid/widget/TextView;

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    check-cast p1, Landroid/widget/TextView;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    new-instance p1, Landroid/app/Dialog;

    .line 69
    .line 70
    sget p2, Lcom/facebook/react/R$style;->NoAnimationDialog:I

    .line 71
    .line 72
    .line 73
    invoke-direct {p1, v0, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 74
    .line 75
    iput-object p1, p0, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;->mPausedInDebuggerDialog:Landroid/app/Dialog;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 79
    .line 80
    iget-object p1, p0, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;->mPausedInDebuggerDialog:Landroid/app/Dialog;

    .line 81
    const/4 p2, 0x0

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 85
    .line 86
    iget-object p1, p0, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;->mPausedInDebuggerDialog:Landroid/app/Dialog;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    const v1, 0x3e4ccccd    # 0.2f

    .line 100
    .line 101
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 105
    const/4 v0, 0x2

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 109
    .line 110
    const/16 v0, 0x30

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Landroid/view/Window;->setGravity(I)V

    .line 114
    const/4 v0, 0x0

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v0}, Landroid/view/Window;->setElevation(F)V

    .line 118
    .line 119
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 120
    .line 121
    .line 122
    invoke-direct {v0, p2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 126
    .line 127
    sget p2, Lcom/facebook/react/R$drawable;->paused_in_debugger_background:I

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 131
    .line 132
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;->mPausedInDebuggerDialog:Landroid/app/Dialog;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 136
    return-void
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
.method public hidePausedInDebuggerOverlay()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/devsupport/m0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/m0;-><init>(Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

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
.end method

.method public showPausedInDebuggerOverlay(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/devsupport/l0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p2, p1}, Lcom/facebook/react/devsupport/l0;-><init>(Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

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
