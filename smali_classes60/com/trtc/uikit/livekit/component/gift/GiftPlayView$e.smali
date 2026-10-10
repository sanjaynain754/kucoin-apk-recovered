.class public final Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e;
.super Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/a;
.source "GiftPlayView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\u0008\u001a\u00020\u00032\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/trtc/uikit/livekit/component/gift/GiftPlayView$initImageAnimationPlayer$imageAnimationPlayer$1",
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/AnimationPlayer;",
        "preparePlay",
        "",
        "model",
        "Lcom/trtc/uikit/livekit/component/gift/viewmodel/GiftModel;",
        "startPlay",
        "stopPlay",
        "setCallback",
        "callback",
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/AnimationPlayer$PlayCallback;",
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
.field public final synthetic a:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e;->a:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/a;-><init>()V

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
.end method


# virtual methods
.method public a(Lpd0/a;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "model"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e;->a:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e;->a:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->h(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;->g(Lpd0/a;)V

    .line 23
    :cond_0
    return-void
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

.method public b(Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/a$a;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e;->a:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->j(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v1, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e$a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p1}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e$a;-><init>(Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/a$a;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->setCallback(Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$b;)V

    .line 17
    :cond_0
    return-void
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

.method public c(Lpd0/a;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "model"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e;->a:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lpd0/a;->a()Lio/trtc/tuikit/atomicxcore/api/gift/Gift;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e;->a:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

    .line 22
    .line 23
    new-instance v1, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lpd0/a;->a()Lio/trtc/tuikit/atomicxcore/api/gift/Gift;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/gift/Gift;->getIconURL()Ljava/lang/String;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;->h(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lpd0/a;->a()Lio/trtc/tuikit/atomicxcore/api/gift/Gift;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/gift/Gift;->getName()Ljava/lang/String;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lpd0/a;->b()I

    .line 58
    move-result v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;->g(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lpd0/a;->c()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserName()Ljava/lang/String;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;->k(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lpd0/a;->c()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;->j(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->j(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    if-eqz p1, :cond_0

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->d(Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;)V

    .line 99
    :cond_0
    return-void
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

.method public d()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e;->a:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->j(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->f()V

    .line 12
    :cond_0
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
.end method
