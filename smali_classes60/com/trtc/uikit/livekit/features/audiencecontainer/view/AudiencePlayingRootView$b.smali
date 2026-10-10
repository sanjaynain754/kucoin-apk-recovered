.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "AudiencePlayingRootView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;->f(FF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\tH\u0002\u00a8\u0006\n"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$startMoveXAnimation$1",
        "Landroid/animation/AnimatorListenerAdapter;",
        "onAnimationCancel",
        "",
        "animation",
        "Landroid/animation/Animator;",
        "onAnimationEnd",
        "onFinished",
        "cancel",
        "",
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
.field public final synthetic a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

.field public final synthetic b:F


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;F)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$b;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 3
    .line 4
    iput p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$b;->b:F

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

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
.method public final a(Z)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$b;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;->c(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;)Landroid/widget/ImageView;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "recoverImageView"

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 15
    move-object v0, v1

    .line 16
    :cond_0
    const/4 v2, 0x1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 20
    .line 21
    const-string v0, "playingView"

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$b;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;->b(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;)Landroid/view/View;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 35
    move-object p1, v1

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    .line 39
    move-result p1

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_2
    iget p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$b;->b:F

    .line 43
    .line 44
    :goto_0
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$b;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 45
    .line 46
    .line 47
    invoke-static {v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;->b(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;)Landroid/view/View;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 54
    move-object v2, v1

    .line 55
    .line 56
    .line 57
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 58
    move-result v0

    .line 59
    int-to-float v0, v0

    .line 60
    .line 61
    cmpg-float p1, p1, v0

    .line 62
    .line 63
    const-string v0, "recoverLayout"

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$b;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;->d(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;)Landroid/widget/FrameLayout;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    move-object v1, p1

    .line 79
    :goto_1
    const/4 p1, 0x0

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 83
    return-void

    .line 84
    .line 85
    :cond_5
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$b;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;->d(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;)Landroid/widget/FrameLayout;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    if-nez p1, :cond_6

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 95
    goto :goto_2

    .line 96
    :cond_6
    move-object v1, p1

    .line 97
    .line 98
    :goto_2
    const/16 p1, 0x8

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 102
    return-void
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

.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "animation"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 p1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$b;->a(Z)V

    .line 10
    return-void
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

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "animation"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 p1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView$b;->a(Z)V

    .line 10
    return-void
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
