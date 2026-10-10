.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "AudienceSettingsListAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$Companion;,
        Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;,
        Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0018\u0000 \u001f2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0008\u0010\u0018\u001a\u00020\u000fH\u0002J\u0008\u0010\u0019\u001a\u00020\u000fH\u0002J\u0008\u0010\u001a\u001a\u00020\u000fH\u0002J\u0008\u0010\u001b\u001a\u00020\u000fH\u0002J\u0008\u0010\u001c\u001a\u00020\u000fH\u0002J\u0008\u0010\u001d\u001a\u00020\u000fH\u0002J\u0008\u0010\u001e\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$ViewHolder;",
        "context",
        "Landroid/content/Context;",
        "audienceStore",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;",
        "settingsDialog",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsPanelDialog;",
        "<init>",
        "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsPanelDialog;)V",
        "data",
        "",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$SettingsItem;",
        "initData",
        "",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "",
        "onBindViewHolder",
        "holder",
        "position",
        "showMediaDashboardDialog",
        "showVideoQualityDialog",
        "showPipDialog",
        "handleShare",
        "handleReport",
        "handleBlock",
        "getItemCount",
        "Companion",
        "ViewHolder",
        "SettingsItem",
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


# static fields
.field public static final m:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final i:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lee0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->m:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$Companion;

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
.end method

.method public constructor <init>(Landroid/content/Context;Lee0/f;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lee0/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;
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
    const-string v0, "audienceStore"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "settingsDialog"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->i:Landroid/content/Context;

    .line 21
    .line 22
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->j:Lee0/f;

    .line 23
    .line 24
    iput-object p3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->k:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->l:Ljava/util/List;

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->s()V

    .line 35
    return-void
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

.method public static synthetic g(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->q(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic h(Landroidx/appcompat/app/AppCompatActivity;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->n(Landroidx/appcompat/app/AppCompatActivity;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic i(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->u(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;Landroid/view/View;)V

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

.method public static synthetic j(Landroidx/appcompat/app/AppCompatActivity;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->o(Landroidx/appcompat/app/AppCompatActivity;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final synthetic k(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)Lee0/f;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->j:Lee0/f;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic l(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->i:Landroid/content/Context;

    .line 3
    return-object p0
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
.end method

.method public static final n(Landroidx/appcompat/app/AppCompatActivity;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/kc/audience/AudienceBlockConfirmDialog;->s0:Lcom/trtc/uikit/livekit/kc/audience/AudienceBlockConfirmDialog$Companion;

    .line 3
    .line 4
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/d;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/d;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/trtc/uikit/livekit/kc/audience/AudienceBlockConfirmDialog$Companion;->show(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)Z

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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

.method public static final o(Landroidx/appcompat/app/AppCompatActivity;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v3, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$handleBlock$1$1$1;

    .line 7
    const/4 p0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v3, p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$handleBlock$1$1$1;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;Lkotlin/coroutines/Continuation;)V

    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    return-object p0
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

.method public static final q(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/kc/helper/b;->a:Lcom/trtc/uikit/livekit/kc/helper/b;

    .line 3
    .line 4
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->j:Lee0/f;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lee0/f;->p()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    check-cast p0, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lcom/trtc/uikit/livekit/kc/helper/b;->c(Ljava/lang/String;)V

    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 32
    return-object p0
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method private final r()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->k:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    const/16 v5, 0x8

    .line 8
    const/4 v6, 0x0

    .line 9
    .line 10
    const-string v1, "B1FeedLive"

    .line 11
    .line 12
    const-string v2, "more"

    .line 13
    .line 14
    const-string v3, "share"

    .line 15
    const/4 v4, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v6}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->j:Lee0/f;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lee0/f;->p()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    sget-object v1, Lcom/trtc/uikit/livekit/kc/share/KCLiveShareHelper;->a:Lcom/trtc/uikit/livekit/kc/share/KCLiveShareHelper;

    .line 45
    .line 46
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->i:Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2, v0}, Lcom/trtc/uikit/livekit/kc/share/KCLiveShareHelper;->f(Landroid/content/Context;Ljava/lang/String;)V

    .line 50
    return-void
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
.end method

.method private final s()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->l:Ljava/util/List;

    .line 3
    .line 4
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->i:Landroid/content/Context;

    .line 7
    .line 8
    sget v3, Lcom/trtc/uikit/livekit/R$string;->live_share:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    const-string v3, "getString(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    sget v4, Lcom/trtc/uikit/livekit/R$drawable;->ic2_share_thin_20:I

    .line 20
    const/4 v5, 0x3

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, v4, v5}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;-><init>(Ljava/lang/String;II)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->l:Ljava/util/List;

    .line 29
    .line 30
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->i:Landroid/content/Context;

    .line 33
    .line 34
    sget v4, Lcom/trtc/uikit/livekit/R$string;->live_report:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    sget v4, Lcom/trtc/uikit/livekit/R$drawable;->ic2_warning_20:I

    .line 44
    const/4 v5, 0x4

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, v2, v4, v5}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->l:Ljava/util/List;

    .line 53
    .line 54
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;

    .line 55
    .line 56
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->i:Landroid/content/Context;

    .line 57
    .line 58
    sget v4, Lcom/trtc/uikit/livekit/R$string;->platform_live_block:I

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    sget v3, Lcom/trtc/uikit/livekit/R$drawable;->ic2_trade_sub_20:I

    .line 68
    const/4 v4, 0x5

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v2, v3, v4}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;-><init>(Ljava/lang/String;II)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    return-void
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
.end method

.method public static final u(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 15
    move-result p1

    .line 16
    .line 17
    if-eqz p1, :cond_5

    .line 18
    const/4 v0, 0x1

    .line 19
    .line 20
    if-eq p1, v0, :cond_4

    .line 21
    const/4 v0, 0x2

    .line 22
    .line 23
    if-eq p1, v0, :cond_3

    .line 24
    const/4 v0, 0x3

    .line 25
    .line 26
    if-eq p1, v0, :cond_2

    .line 27
    const/4 v0, 0x4

    .line 28
    .line 29
    if-eq p1, v0, :cond_1

    .line 30
    const/4 v0, 0x5

    .line 31
    .line 32
    if-eq p1, v0, :cond_0

    .line 33
    return-void

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->m()V

    .line 37
    return-void

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->p()V

    .line 41
    return-void

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->r()V

    .line 45
    return-void

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->x()V

    .line 49
    return-void

    .line 50
    .line 51
    .line 52
    :cond_4
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->y()V

    .line 53
    return-void

    .line 54
    .line 55
    .line 56
    :cond_5
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->w()V

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
.end method

.method private final w()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->k:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    new-instance v0, Lcom/trtc/uikit/livekit/component/dashboard/StreamDashboardDialog;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->i:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->j:Lee0/f;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lee0/f;->p()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Lcom/trtc/uikit/livekit/component/dashboard/StreamDashboardDialog;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 40
    return-void
    .line 41
    .line 42
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->l:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final m()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->k:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->i:Landroid/content/Context;

    .line 8
    .line 9
    instance-of v1, v0, Landroidx/appcompat/app/AppCompatActivity;

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, v2

    .line 17
    .line 18
    :goto_0
    if-nez v0, :cond_1

    .line 19
    return-void

    .line 20
    .line 21
    :cond_1
    sget-object v1, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    new-instance v3, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/b;

    .line 28
    .line 29
    .line 30
    invoke-direct {v3, v0, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/b;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)V

    .line 31
    const/4 v0, 0x1

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2, v3, v0, v2}, Lcom/kubi/user/api/IUserService;->E0(Lcom/kubi/user/api/IUserService;Ljava/util/Map;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->t(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;I)V

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

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->v(Landroid/view/ViewGroup;I)Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public final p()V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->k:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/c;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/c;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)V

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v3, v1, v2, v3}, Lcom/kubi/user/api/IUserService;->E0(Lcom/kubi/user/api/IUserService;Ljava/util/Map;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 22
    .line 23
    const/16 v8, 0x8

    .line 24
    const/4 v9, 0x0

    .line 25
    .line 26
    const-string v4, "B1FeedLive"

    .line 27
    .line 28
    const-string v5, "more"

    .line 29
    .line 30
    const-string v6, "complaint"

    .line 31
    const/4 v7, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static/range {v4 .. v9}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public t(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;I)V
    .locals 2
    .param p1    # Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "holder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;->d()Landroid/widget/TextView;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->l:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;->b()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;->b()Landroid/widget/ImageView;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->l:Ljava/util/List;

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    check-cast v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;->a()I

    .line 40
    move-result v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;->c()Landroid/widget/LinearLayout;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->l:Ljava/util/List;

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    move-result-object p2

    .line 54
    .line 55
    check-cast p2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$a;->c()I

    .line 59
    move-result p2

    .line 60
    .line 61
    .line 62
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    move-result-object p2

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;->c()Landroid/widget/LinearLayout;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    new-instance p2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/a;

    .line 73
    .line 74
    .line 75
    invoke-direct {p2, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/a;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    return-void
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

.method public v(Landroid/view/ViewGroup;I)Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string p2, "parent"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    move-result-object p2

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    sget v0, Lcom/trtc/uikit/livekit/R$layout;->livekit_anchor_settings_panel_item:I

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    new-instance p2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p2, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$b;-><init>(Landroid/view/View;)V

    .line 29
    return-object p2
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

.method public final x()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->k:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    new-instance v0, Lcom/trtc/uikit/livekit/component/pippanel/a;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->i:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->j:Lee0/f;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lee0/f;->p()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Lcom/trtc/uikit/livekit/component/pippanel/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 40
    return-void
    .line 41
    .line 42
.end method

.method public final y()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->k:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->dismiss()V

    .line 6
    .line 7
    new-instance v0, Lud0/e;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->i:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;->j:Lee0/f;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lee0/f;->s()Lee0/h;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lee0/h;->c()Lkotlinx/coroutines/flow/n;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Ljava/util/List;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lud0/e;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 29
    .line 30
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$c;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$c;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lud0/e;->setOnVideoQualitySelectedListener(Lud0/e$a;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 40
    return-void
    .line 41
    .line 42
.end method
