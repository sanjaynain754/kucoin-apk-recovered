.class public final Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;
.super Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;
.source "LiveTemplatePicker.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;",
        "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;",
        "context",
        "Landroid/content/Context;",
        "store",
        "Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;",
        "coreView",
        "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;",
        "<init>",
        "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V",
        "initView",
        "",
        "initCoHostTemplateView",
        "view",
        "Landroid/view/View;",
        "initCoGuestTemplateView",
        "TemplateType",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final m:Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "store"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "coreView"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x2

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1, v0, v1, v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;-><init>(Landroid/content/Context;Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->m:Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;

    .line 23
    .line 24
    iput-object p3, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->n:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->I()V

    .line 28
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
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
.end method

.method public static synthetic C(Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->H(Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;)V

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
.end method

.method public static synthetic D(Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->F(Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;)V

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
.end method

.method public static final F(Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;)V
    .locals 12

    .line 1
    .line 2
    const-string v0, "type"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->n:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 11
    move-result v0

    .line 12
    int-to-double v0, v0

    .line 13
    .line 14
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->n:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 18
    move-result v2

    .line 19
    int-to-double v2, v2

    .line 20
    div-double/2addr v0, v2

    .line 21
    .line 22
    sget-object v2, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_FLOAT:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 23
    .line 24
    if-ne p1, v2, :cond_0

    .line 25
    .line 26
    const-wide/high16 v2, 0x3fe2000000000000L    # 0.5625

    .line 27
    .line 28
    cmpl-double v0, v0, v2

    .line 29
    .line 30
    if-lez v0, :cond_0

    .line 31
    .line 32
    sget-object v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->a:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    const-string v0, "getContext(...)"

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    sget v3, Lcom/trtc/uikit/livekit/R$string;->common_template_601_ui_exception_toast:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    const-string v0, "getString(...)"

    .line 54
    .line 55
    .line 56
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    sget-object v4, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->WARNING:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 59
    .line 60
    const/16 v10, 0xf8

    .line 61
    const/4 v11, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    .line 68
    .line 69
    invoke-static/range {v1 .. v11}, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->j(Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;Landroid/content/Context;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;Ljava/lang/Integer;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Duration;Ljava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)V

    .line 70
    .line 71
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->m:Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->getId()I

    .line 75
    move-result p1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;->i(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 82
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
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
.end method

.method public static final H(Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;)V
    .locals 12

    .line 1
    .line 2
    const-string v0, "type"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->n:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 11
    move-result v0

    .line 12
    int-to-double v0, v0

    .line 13
    .line 14
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->n:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 18
    move-result v2

    .line 19
    int-to-double v2, v2

    .line 20
    div-double/2addr v0, v2

    .line 21
    .line 22
    sget-object v2, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_FLOAT_CO_HOST:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 23
    .line 24
    if-ne p1, v2, :cond_0

    .line 25
    .line 26
    const-wide/high16 v2, 0x3fe2000000000000L    # 0.5625

    .line 27
    .line 28
    cmpl-double v0, v0, v2

    .line 29
    .line 30
    if-lez v0, :cond_0

    .line 31
    .line 32
    sget-object v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->a:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    const-string v0, "getContext(...)"

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    sget v3, Lcom/trtc/uikit/livekit/R$string;->common_template_601_ui_exception_toast:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    const-string v0, "getString(...)"

    .line 54
    .line 55
    .line 56
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    sget-object v4, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->WARNING:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 59
    .line 60
    const/16 v10, 0xf8

    .line 61
    const/4 v11, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    .line 68
    .line 69
    invoke-static/range {v1 .. v11}, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->j(Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;Landroid/content/Context;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;Ljava/lang/Integer;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Duration;Ljava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)V

    .line 70
    .line 71
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->m:Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->getId()I

    .line 75
    move-result p1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;->j(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 82
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
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
.end method

.method private final I()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget v1, Lcom/trtc/uikit/livekit/R$layout;->anchor_prepare_layout_select_template:I

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->E(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->G(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->q(Landroid/view/View;)V

    .line 24
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
.end method


# virtual methods
.method public final E(Landroid/view/View;)V
    .locals 7

    .line 1
    .line 2
    sget v0, Lcom/trtc/uikit/livekit/R$id;->rv_template:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x2

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 22
    .line 23
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/a;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    const-string v2, "getContext(...)"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->m:Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;

    .line 35
    .line 36
    sget-object v3, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_GRID:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 37
    .line 38
    sget-object v4, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_FLOAT:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 39
    .line 40
    sget-object v5, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_STATIC_GRID:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 41
    .line 42
    sget-object v6, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_STATIC_FLOAT:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 43
    .line 44
    .line 45
    filled-new-array {v3, v4, v5, v6}, [Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    .line 49
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    new-instance v4, Lce0/d;

    .line 53
    .line 54
    .line 55
    invoke-direct {v4, p0}, Lce0/d;-><init>(Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/a;-><init>(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;Ljava/util/List;Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/a$b;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 62
    return-void
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
.end method

.method public final G(Landroid/view/View;)V
    .locals 5

    .line 1
    .line 2
    sget v0, Lcom/trtc/uikit/livekit/R$id;->rv_template_co_host:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x2

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 22
    .line 23
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/b;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    const-string v2, "getContext(...)"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;->m:Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;

    .line 35
    .line 36
    sget-object v3, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_GRID_CO_HOST:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    new-instance v4, Lce0/c;

    .line 43
    .line 44
    .line 45
    invoke-direct {v4, p0}, Lce0/c;-><init>(Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/b;-><init>(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;Ljava/util/List;Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/b$b;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 52
    return-void
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
.end method
