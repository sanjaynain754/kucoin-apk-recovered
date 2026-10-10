.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;
.super Ljava/lang/Object;
.source "AudienceView.kt"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$VideoViewAdapterImpl;",
        "Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/Context;)V",
        "weakContext",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "createCoGuestView",
        "Landroid/view/View;",
        "seatInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;",
        "viewLayer",
        "Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;",
        "createCoHostView",
        "createBattleView",
        "createBattleContainerView",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAudienceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudienceView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$VideoViewAdapterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n2746#2,3:1496\n*S KotlinDebug\n*F\n+ 1 AudienceView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$VideoViewAdapterImpl\n*L\n1246#1:1496,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/Context;)V
    .locals 1
    .param p1    # Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->a:Ljava/lang/ref/WeakReference;

    .line 18
    return-void
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

.method public static synthetic a(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->e(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/DialogInterface;)V

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

.method public static synthetic b(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->f(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;Landroid/view/View;)V

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

.method public static synthetic c(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->d(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V

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

.method public static final d(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lee0/f;->u()Lee0/j;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lee0/j;->c()Lkotlinx/coroutines/flow/n;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_5

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getConnected()Lkotlinx/coroutines/flow/w;

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
    check-cast v0, Ljava/lang/Iterable;

    .line 39
    .line 40
    instance-of v1, v0, Ljava/util/Collection;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    move-object v1, v0

    .line 44
    .line 45
    check-cast v1, Ljava/util/Collection;

    .line 46
    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 49
    move-result v1

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    goto :goto_1

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    move-result v1

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 89
    .line 90
    if-eqz v2, :cond_2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 94
    move-result-object v2

    .line 95
    goto :goto_0

    .line 96
    :cond_2
    const/4 v2, 0x0

    .line 97
    .line 98
    .line 99
    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    move-result v1

    .line 101
    .line 102
    if-eqz v1, :cond_1

    .line 103
    return-void

    .line 104
    .line 105
    .line 106
    :cond_3
    :goto_1
    invoke-static {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->K(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Z

    .line 107
    move-result v0

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    goto :goto_2

    .line 111
    :cond_4
    const/4 v0, 0x1

    .line 112
    .line 113
    .line 114
    invoke-static {p0, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->V(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    const-string v0, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.SeatInfo"

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 126
    .line 127
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/TypeSelectDialog;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 131
    move-result-object v1

    .line 132
    .line 133
    const-string v2, "getContext(...)"

    .line 134
    .line 135
    .line 136
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 140
    move-result-object v2

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getIndex()I

    .line 144
    move-result p1

    .line 145
    .line 146
    .line 147
    invoke-direct {v0, v1, v2, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/TypeSelectDialog;-><init>(Landroid/content/Context;Lee0/f;I)V

    .line 148
    .line 149
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/v;

    .line 150
    .line 151
    .line 152
    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/v;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 159
    :cond_5
    :goto_2
    return-void
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

.method public static final e(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->V(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Z)V

    .line 5
    return-void
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

.method public static final f(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;Landroid/view/View;)V
    .locals 3

    .line 1
    .line 2
    new-instance p2, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    :cond_0
    move-object v1, v0

    .line 20
    .line 21
    :cond_1
    if-eqz p1, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserName()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    if-nez v2, :cond_3

    .line 34
    :cond_2
    move-object v2, v0

    .line 35
    .line 36
    :cond_3
    if-eqz p1, :cond_5

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    if-eqz p1, :cond_5

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    if-nez p1, :cond_4

    .line 49
    goto :goto_0

    .line 50
    :cond_4
    move-object v0, p1

    .line 51
    .line 52
    .line 53
    :cond_5
    :goto_0
    invoke-direct {p2, v1, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->Z(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

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


# virtual methods
.method public createBattleContainerView()Landroid/view/View;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->a:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroid/content/Context;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->C()Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const-string v2, "createBattleContainerView: context is null"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    return-object v1

    .line 22
    .line 23
    :cond_0
    new-instance v2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView;

    .line 24
    const/4 v3, 0x2

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, v0, v1, v3, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->b(Lee0/f;)V

    .line 37
    return-object v2
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public createBattleView(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Landroid/view/View;
    .locals 4
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->a:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroid/content/Context;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->C()Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    const-string v0, "createBattleView: context is null"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    return-object v1

    .line 22
    .line 23
    :cond_0
    new-instance v2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView;

    .line 24
    const/4 v3, 0x2

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, v0, v1, v3, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    :cond_1
    const-string p1, ""

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {v2, v0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView;->m(Lee0/f;Ljava/lang/String;)V

    .line 53
    return-object v2
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

.method public createCoGuestView(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;)Landroid/view/View;
    .locals 18
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    iget-object v3, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->a:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    move-result-object v3

    .line 13
    move-object v5, v3

    .line 14
    .line 15
    check-cast v5, Landroid/content/Context;

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    if-nez v5, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->C()Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    const-string v2, "createCoGuestView: context is null"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    return-object v3

    .line 29
    .line 30
    :cond_0
    if-eqz v1, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 40
    move-result-object v4

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v4, v3

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 46
    move-result v4

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;->BACKGROUND:Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;

    .line 51
    .line 52
    if-ne v2, v4, :cond_2

    .line 53
    .line 54
    new-instance v5, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/AudienceEmptySeatView;

    .line 55
    .line 56
    iget-object v2, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    move-result-object v6

    .line 61
    .line 62
    const-string v2, "getContext(...)"

    .line 63
    .line 64
    .line 65
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    const/4 v9, 0x6

    .line 67
    const/4 v10, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v8, 0x0

    .line 70
    .line 71
    .line 72
    invoke-direct/range {v5 .. v10}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/AudienceEmptySeatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    .line 74
    iget-object v2, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/AudienceEmptySeatView;->b(Lee0/f;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 85
    .line 86
    iget-object v1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 87
    .line 88
    new-instance v2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/t;

    .line 89
    .line 90
    .line 91
    invoke-direct {v2, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/t;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    return-object v5

    .line 96
    :cond_2
    return-object v3

    .line 97
    .line 98
    :cond_3
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;->BACKGROUND:Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;

    .line 99
    .line 100
    if-ne v3, v2, :cond_6

    .line 101
    .line 102
    new-instance v4, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/CoGuestBackgroundWidgetsView;

    .line 103
    const/4 v8, 0x6

    .line 104
    const/4 v9, 0x0

    .line 105
    const/4 v6, 0x0

    .line 106
    const/4 v7, 0x0

    .line 107
    .line 108
    .line 109
    invoke-direct/range {v4 .. v9}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/CoGuestBackgroundWidgetsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 110
    .line 111
    iget-object v2, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 115
    move-result-object v2

    .line 116
    .line 117
    if-eqz v1, :cond_4

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 121
    move-result-object v1

    .line 122
    .line 123
    if-nez v1, :cond_5

    .line 124
    .line 125
    :cond_4
    new-instance v5, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 126
    .line 127
    const/16 v16, 0x3ff

    .line 128
    .line 129
    const/16 v17, 0x0

    .line 130
    const/4 v6, 0x0

    .line 131
    const/4 v7, 0x0

    .line 132
    const/4 v8, 0x0

    .line 133
    const/4 v9, 0x0

    .line 134
    const/4 v10, 0x0

    .line 135
    const/4 v11, 0x0

    .line 136
    const/4 v12, 0x0

    .line 137
    const/4 v13, 0x0

    .line 138
    const/4 v14, 0x0

    .line 139
    const/4 v15, 0x0

    .line 140
    .line 141
    .line 142
    invoke-direct/range {v5 .. v17}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 143
    move-object v1, v5

    .line 144
    .line 145
    .line 146
    :cond_5
    invoke-virtual {v4, v2, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/CoGuestBackgroundWidgetsView;->h(Lee0/f;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 147
    return-object v4

    .line 148
    .line 149
    :cond_6
    new-instance v4, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/CoGuestForegroundWidgetsView;

    .line 150
    const/4 v8, 0x6

    .line 151
    const/4 v9, 0x0

    .line 152
    const/4 v6, 0x0

    .line 153
    const/4 v7, 0x0

    .line 154
    .line 155
    .line 156
    invoke-direct/range {v4 .. v9}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/CoGuestForegroundWidgetsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 157
    .line 158
    iget-object v2, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 162
    move-result-object v2

    .line 163
    .line 164
    if-eqz v1, :cond_7

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 168
    move-result-object v3

    .line 169
    .line 170
    if-nez v3, :cond_8

    .line 171
    .line 172
    :cond_7
    new-instance v5, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 173
    .line 174
    const/16 v16, 0x3ff

    .line 175
    .line 176
    const/16 v17, 0x0

    .line 177
    const/4 v6, 0x0

    .line 178
    const/4 v7, 0x0

    .line 179
    const/4 v8, 0x0

    .line 180
    const/4 v9, 0x0

    .line 181
    const/4 v10, 0x0

    .line 182
    const/4 v11, 0x0

    .line 183
    const/4 v12, 0x0

    .line 184
    const/4 v13, 0x0

    .line 185
    const/4 v14, 0x0

    .line 186
    const/4 v15, 0x0

    .line 187
    .line 188
    .line 189
    invoke-direct/range {v5 .. v17}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 190
    move-object v3, v5

    .line 191
    .line 192
    .line 193
    :cond_8
    invoke-virtual {v4, v2, v3}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/widgets/CoGuestForegroundWidgetsView;->k(Lee0/f;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 194
    .line 195
    iget-object v2, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 196
    .line 197
    new-instance v3, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/u;

    .line 198
    .line 199
    .line 200
    invoke-direct {v3, v2, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/u;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 204
    return-object v4
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

.method public createCoHostView(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;)Landroid/view/View;
    .locals 17
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->a:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    move-object v3, v1

    .line 10
    .line 11
    check-cast v3, Landroid/content/Context;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->C()Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    const-string v2, "createCoHostView: context is null"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    const/4 v1, 0x0

    .line 24
    return-object v1

    .line 25
    .line 26
    :cond_0
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;->BACKGROUND:Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;

    .line 27
    .line 28
    move-object/from16 v2, p2

    .line 29
    .line 30
    if-ne v1, v2, :cond_3

    .line 31
    .line 32
    new-instance v2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/cohost/widgets/CoHostBackgroundWidgetsView;

    .line 33
    const/4 v6, 0x6

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v2 .. v7}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/cohost/widgets/CoHostBackgroundWidgetsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    .line 41
    iget-object v1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual/range {p1 .. p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    :cond_1
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 56
    .line 57
    const/16 v15, 0x3ff

    .line 58
    .line 59
    const/16 v16, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    const/4 v8, 0x0

    .line 64
    const/4 v9, 0x0

    .line 65
    const/4 v10, 0x0

    .line 66
    const/4 v11, 0x0

    .line 67
    const/4 v12, 0x0

    .line 68
    const/4 v13, 0x0

    .line 69
    const/4 v14, 0x0

    .line 70
    .line 71
    .line 72
    invoke-direct/range {v4 .. v16}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    move-object v3, v4

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {v2, v1, v3}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/cohost/widgets/CoHostBackgroundWidgetsView;->h(Lee0/f;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 77
    return-object v2

    .line 78
    .line 79
    :cond_3
    new-instance v2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/cohost/widgets/CoHostForegroundWidgetsView;

    .line 80
    const/4 v6, 0x6

    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v4, 0x0

    .line 83
    const/4 v5, 0x0

    .line 84
    .line 85
    .line 86
    invoke-direct/range {v2 .. v7}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/cohost/widgets/CoHostForegroundWidgetsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    .line 88
    iget-object v1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;->b:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p1 .. p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 98
    move-result-object v3

    .line 99
    .line 100
    if-nez v3, :cond_5

    .line 101
    .line 102
    :cond_4
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 103
    .line 104
    const/16 v15, 0x3ff

    .line 105
    .line 106
    const/16 v16, 0x0

    .line 107
    const/4 v5, 0x0

    .line 108
    const/4 v6, 0x0

    .line 109
    const/4 v7, 0x0

    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v9, 0x0

    .line 112
    const/4 v10, 0x0

    .line 113
    const/4 v11, 0x0

    .line 114
    const/4 v12, 0x0

    .line 115
    const/4 v13, 0x0

    .line 116
    const/4 v14, 0x0

    .line 117
    .line 118
    .line 119
    invoke-direct/range {v4 .. v16}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 120
    move-object v3, v4

    .line 121
    .line 122
    .line 123
    :cond_5
    invoke-virtual {v2, v1, v3}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/cohost/widgets/CoHostForegroundWidgetsView;->k(Lee0/f;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 124
    return-object v2
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
