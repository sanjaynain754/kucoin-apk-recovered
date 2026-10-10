.class Lcom/facebook/react/devsupport/DebugOverlayController$1;
.super Ljava/lang/Object;
.source "DebugOverlayController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DebugOverlayController;->setFpsDebugViewVisible(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

.field final synthetic val$fpsDebugViewVisible:Z


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/DebugOverlayController;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->val$fpsDebugViewVisible:Z

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public run()V
    .locals 9

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->val$fpsDebugViewVisible:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/devsupport/DebugOverlayController;->a(Lcom/facebook/react/devsupport/DebugOverlayController;)Landroid/widget/FrameLayout;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/facebook/react/devsupport/DebugOverlayController;->b(Lcom/facebook/react/devsupport/DebugOverlayController;)Lcom/facebook/react/bridge/ReactContext;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/facebook/react/devsupport/DebugOverlayController;->e(Landroid/content/Context;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const-string v0, "ReactNative"

    .line 27
    .line 28
    const-string v1, "Wait for overlay permission to be set"

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lx3/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 35
    .line 36
    new-instance v1, Lcom/facebook/react/devsupport/FpsView;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Lcom/facebook/react/devsupport/DebugOverlayController;->b(Lcom/facebook/react/devsupport/DebugOverlayController;)Lcom/facebook/react/bridge/ReactContext;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v2}, Lcom/facebook/react/devsupport/FpsView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/DebugOverlayController;->d(Lcom/facebook/react/devsupport/DebugOverlayController;Landroid/widget/FrameLayout;)V

    .line 49
    .line 50
    new-instance v3, Landroid/view/WindowManager$LayoutParams;

    .line 51
    .line 52
    sget v6, Lcom/facebook/react/devsupport/WindowOverlayCompat;->TYPE_SYSTEM_OVERLAY:I

    .line 53
    .line 54
    const/16 v7, 0x18

    .line 55
    const/4 v8, -0x3

    .line 56
    const/4 v4, -0x1

    .line 57
    const/4 v5, -0x1

    .line 58
    .line 59
    .line 60
    invoke-direct/range {v3 .. v8}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 61
    .line 62
    iget-object v0, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/facebook/react/devsupport/DebugOverlayController;->c(Lcom/facebook/react/devsupport/DebugOverlayController;)Landroid/view/WindowManager;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    iget-object v1, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 69
    .line 70
    .line 71
    invoke-static {v1}, Lcom/facebook/react/devsupport/DebugOverlayController;->a(Lcom/facebook/react/devsupport/DebugOverlayController;)Landroid/widget/FrameLayout;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v1, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    return-void

    .line 77
    .line 78
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->val$fpsDebugViewVisible:Z

    .line 79
    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    iget-object v0, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Lcom/facebook/react/devsupport/DebugOverlayController;->a(Lcom/facebook/react/devsupport/DebugOverlayController;)Landroid/widget/FrameLayout;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    iget-object v0, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lcom/facebook/react/devsupport/DebugOverlayController;->a(Lcom/facebook/react/devsupport/DebugOverlayController;)Landroid/widget/FrameLayout;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 98
    .line 99
    iget-object v0, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 100
    .line 101
    .line 102
    invoke-static {v0}, Lcom/facebook/react/devsupport/DebugOverlayController;->c(Lcom/facebook/react/devsupport/DebugOverlayController;)Landroid/view/WindowManager;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    iget-object v1, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Lcom/facebook/react/devsupport/DebugOverlayController;->a(Lcom/facebook/react/devsupport/DebugOverlayController;)Landroid/widget/FrameLayout;

    .line 109
    move-result-object v1

    .line 110
    .line 111
    .line 112
    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 113
    .line 114
    iget-object v0, p0, Lcom/facebook/react/devsupport/DebugOverlayController$1;->this$0:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 115
    const/4 v1, 0x0

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/DebugOverlayController;->d(Lcom/facebook/react/devsupport/DebugOverlayController;Landroid/widget/FrameLayout;)V

    .line 119
    :cond_2
    return-void
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
