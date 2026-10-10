.class public final Lcom/sumsub/sns/databinding/i;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final a:Lcom/sumsub/sns/core/widget/SNSBackgroundView;

.field public final b:Landroid/widget/FrameLayout;

.field public final c:Landroidx/camera/view/PreviewView;

.field public final d:Lcom/sumsub/sns/core/widget/SNSImageView;

.field public final e:Lcom/sumsub/sns/core/widget/SNSBackgroundView;

.field public final f:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final g:Landroid/widget/TextView;

.field public final h:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

.field public final i:Lcom/sumsub/sns/core/widget/SNSH2TextView;

.field public final j:Lcom/sumsub/sns/core/widget/SNSImageView;

.field public final k:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

.field public final l:Lcom/sumsub/sns/core/widget/SNSH2TextView;

.field public final m:Lcom/sumsub/sns/databinding/A;

.field public final n:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/SNSBackgroundView;Landroid/widget/FrameLayout;Landroidx/camera/view/PreviewView;Lcom/sumsub/sns/core/widget/SNSImageView;Lcom/sumsub/sns/core/widget/SNSBackgroundView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;Lcom/sumsub/sns/core/widget/SNSH2TextView;Lcom/sumsub/sns/core/widget/SNSImageView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH2TextView;Lcom/sumsub/sns/databinding/A;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/databinding/i;->a:Lcom/sumsub/sns/core/widget/SNSBackgroundView;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/databinding/i;->b:Landroid/widget/FrameLayout;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/databinding/i;->c:Landroidx/camera/view/PreviewView;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/databinding/i;->d:Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/databinding/i;->e:Lcom/sumsub/sns/core/widget/SNSBackgroundView;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/sumsub/sns/databinding/i;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 16
    .line 17
    iput-object p7, p0, Lcom/sumsub/sns/databinding/i;->g:Landroid/widget/TextView;

    .line 18
    .line 19
    iput-object p8, p0, Lcom/sumsub/sns/databinding/i;->h:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    .line 20
    .line 21
    iput-object p9, p0, Lcom/sumsub/sns/databinding/i;->i:Lcom/sumsub/sns/core/widget/SNSH2TextView;

    .line 22
    .line 23
    iput-object p10, p0, Lcom/sumsub/sns/databinding/i;->j:Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 24
    .line 25
    iput-object p11, p0, Lcom/sumsub/sns/databinding/i;->k:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 26
    .line 27
    iput-object p12, p0, Lcom/sumsub/sns/databinding/i;->l:Lcom/sumsub/sns/core/widget/SNSH2TextView;

    .line 28
    .line 29
    iput-object p13, p0, Lcom/sumsub/sns/databinding/i;->m:Lcom/sumsub/sns/databinding/A;

    .line 30
    .line 31
    iput-object p14, p0, Lcom/sumsub/sns/databinding/i;->n:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 32
    return-void
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
.end method

.method public static a(Landroid/view/View;)Lcom/sumsub/sns/databinding/i;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    sget v1, Lcom/sumsub/sns/R$id;->sns_camera:I

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 8
    move-result-object v2

    .line 9
    move-object v5, v2

    .line 10
    .line 11
    check-cast v5, Landroid/widget/FrameLayout;

    .line 12
    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    sget v1, Lcom/sumsub/sns/R$id;->sns_camera_preview:I

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 19
    move-result-object v2

    .line 20
    move-object v6, v2

    .line 21
    .line 22
    check-cast v6, Landroidx/camera/view/PreviewView;

    .line 23
    .line 24
    if-eqz v6, :cond_1

    .line 25
    .line 26
    sget v1, Lcom/sumsub/sns/R$id;->sns_complete_icon:I

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 30
    move-result-object v2

    .line 31
    move-object v7, v2

    .line 32
    .line 33
    check-cast v7, Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 34
    .line 35
    if-eqz v7, :cond_1

    .line 36
    .line 37
    sget v1, Lcom/sumsub/sns/R$id;->sns_container:I

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 41
    move-result-object v2

    .line 42
    move-object v8, v2

    .line 43
    .line 44
    check-cast v8, Lcom/sumsub/sns/core/widget/SNSBackgroundView;

    .line 45
    .line 46
    if-eqz v8, :cond_1

    .line 47
    .line 48
    sget v1, Lcom/sumsub/sns/R$id;->sns_content:I

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 52
    move-result-object v2

    .line 53
    move-object v9, v2

    .line 54
    .line 55
    check-cast v9, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 56
    .line 57
    if-eqz v9, :cond_1

    .line 58
    .line 59
    sget v1, Lcom/sumsub/sns/R$id;->sns_debug:I

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 63
    move-result-object v2

    .line 64
    move-object v10, v2

    .line 65
    .line 66
    check-cast v10, Landroid/widget/TextView;

    .line 67
    .line 68
    if-eqz v10, :cond_1

    .line 69
    .line 70
    sget v1, Lcom/sumsub/sns/R$id;->sns_face_view:I

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 74
    move-result-object v2

    .line 75
    move-object v11, v2

    .line 76
    .line 77
    check-cast v11, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;

    .line 78
    .line 79
    if-eqz v11, :cond_1

    .line 80
    .line 81
    sget v1, Lcom/sumsub/sns/R$id;->sns_hint:I

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 85
    move-result-object v2

    .line 86
    move-object v12, v2

    .line 87
    .line 88
    check-cast v12, Lcom/sumsub/sns/core/widget/SNSH2TextView;

    .line 89
    .line 90
    if-eqz v12, :cond_1

    .line 91
    .line 92
    sget v1, Lcom/sumsub/sns/R$id;->sns_icon:I

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 96
    move-result-object v2

    .line 97
    move-object v13, v2

    .line 98
    .line 99
    check-cast v13, Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 100
    .line 101
    if-eqz v13, :cond_1

    .line 102
    .line 103
    sget v1, Lcom/sumsub/sns/R$id;->sns_liveness_status_container:I

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    check-cast v2, Landroid/widget/LinearLayout;

    .line 110
    .line 111
    if-eqz v2, :cond_1

    .line 112
    .line 113
    sget v1, Lcom/sumsub/sns/R$id;->sns_liveness_status_subtitle:I

    .line 114
    .line 115
    .line 116
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 117
    move-result-object v2

    .line 118
    move-object v14, v2

    .line 119
    .line 120
    check-cast v14, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 121
    .line 122
    if-eqz v14, :cond_1

    .line 123
    .line 124
    sget v1, Lcom/sumsub/sns/R$id;->sns_liveness_status_subtitle_scroll:I

    .line 125
    .line 126
    .line 127
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    check-cast v2, Landroid/widget/ScrollView;

    .line 131
    .line 132
    if-eqz v2, :cond_1

    .line 133
    .line 134
    sget v1, Lcom/sumsub/sns/R$id;->sns_liveness_status_title:I

    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 138
    move-result-object v2

    .line 139
    move-object v15, v2

    .line 140
    .line 141
    check-cast v15, Lcom/sumsub/sns/core/widget/SNSH2TextView;

    .line 142
    .line 143
    if-eqz v15, :cond_1

    .line 144
    .line 145
    sget v1, Lcom/sumsub/sns/R$id;->sns_overlay:I

    .line 146
    .line 147
    .line 148
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 149
    move-result-object v2

    .line 150
    .line 151
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 152
    .line 153
    if-eqz v2, :cond_1

    .line 154
    .line 155
    sget v1, Lcom/sumsub/sns/R$id;->sns_placeholder:I

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    if-eqz v2, :cond_1

    .line 162
    .line 163
    sget v1, Lcom/sumsub/sns/R$id;->sns_powered:I

    .line 164
    .line 165
    .line 166
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 167
    move-result-object v2

    .line 168
    .line 169
    if-eqz v2, :cond_1

    .line 170
    .line 171
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 172
    .line 173
    new-instance v1, Lcom/sumsub/sns/databinding/A;

    .line 174
    .line 175
    .line 176
    invoke-direct {v1, v2, v2}, Lcom/sumsub/sns/databinding/A;-><init>(Lcom/sumsub/sns/core/widget/SNSCaptionTextView;Lcom/sumsub/sns/core/widget/SNSCaptionTextView;)V

    .line 177
    .line 178
    sget v2, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 179
    .line 180
    .line 181
    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 182
    move-result-object v3

    .line 183
    .line 184
    move-object/from16 v17, v3

    .line 185
    .line 186
    check-cast v17, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 187
    .line 188
    if-eqz v17, :cond_0

    .line 189
    .line 190
    sget v2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 191
    .line 192
    .line 193
    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 194
    move-result-object v3

    .line 195
    .line 196
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 197
    .line 198
    if-eqz v3, :cond_0

    .line 199
    .line 200
    new-instance v3, Lcom/sumsub/sns/databinding/i;

    .line 201
    move-object v4, v0

    .line 202
    .line 203
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSBackgroundView;

    .line 204
    .line 205
    move-object/from16 v16, v1

    .line 206
    .line 207
    .line 208
    invoke-direct/range {v3 .. v17}, Lcom/sumsub/sns/databinding/i;-><init>(Lcom/sumsub/sns/core/widget/SNSBackgroundView;Landroid/widget/FrameLayout;Landroidx/camera/view/PreviewView;Lcom/sumsub/sns/core/widget/SNSImageView;Lcom/sumsub/sns/core/widget/SNSBackgroundView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;Lcom/sumsub/sns/core/widget/SNSH2TextView;Lcom/sumsub/sns/core/widget/SNSImageView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH2TextView;Lcom/sumsub/sns/databinding/A;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;)V

    .line 209
    return-object v3

    .line 210
    :cond_0
    move v1, v2

    .line 211
    .line 212
    .line 213
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 214
    move-result-object v0

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 218
    move-result-object v0

    .line 219
    .line 220
    new-instance v1, Ljava/lang/NullPointerException;

    .line 221
    .line 222
    const-string v2, "Missing required view with ID: "

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 226
    move-result-object v0

    .line 227
    .line 228
    .line 229
    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 230
    throw v1
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/databinding/i;->a:Lcom/sumsub/sns/core/widget/SNSBackgroundView;

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
