.class public final Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;
.super Landroid/widget/LinearLayout;
.source "ImageAnimationView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$b;,
        Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001d\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\u0008\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0008\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "childViewCount",
        "",
        "childViews",
        "",
        "Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;",
        "[Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;",
        "callback",
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$Callback;",
        "playAnimation",
        "",
        "model",
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$GiftImageAnimationInfo;",
        "stopPlay",
        "checkFinished",
        "setCallback",
        "Callback",
        "GiftImageAnimationInfo",
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
.field public final b:I

.field public final c:[Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x3

    .line 4
    iput p2, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->b:I

    .line 5
    new-array p2, p2, [Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;

    iput-object p2, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->c:[Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 7
    array-length p2, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 8
    new-instance v1, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3, v2, v3}, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    new-instance v2, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$a;

    invoke-direct {v2, p0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$a;-><init>(Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;)V

    invoke-virtual {v1, v2}, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;->setCallback(Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout$a;)V

    .line 10
    iget-object v2, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->c:[Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;

    aput-object v1, v2, v0

    .line 11
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a(Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->e(Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;)V

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
.end method

.method public static final synthetic b(Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->c()V

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
.end method

.method public static final e(Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->c()V

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
.end method


# virtual methods
.method public final c()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->c:[Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;

    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    .line 7
    :goto_0
    if-ge v3, v1, :cond_1

    .line 8
    .line 9
    aget-object v4, v0, v3

    .line 10
    .line 11
    .line 12
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 13
    move-result v4

    .line 14
    const/4 v5, 0x4

    .line 15
    .line 16
    if-ne v4, v5, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->d:Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$b;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v2}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$b;->a(I)V

    .line 27
    return-void

    .line 28
    .line 29
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
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

.method public final d(Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;)V
    .locals 6
    .param p1    # Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "model"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->c:[Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;

    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    :goto_0
    if-ge v2, v1, :cond_1

    .line 18
    .line 19
    aget-object v3, v0, v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 23
    move-result v4

    .line 24
    const/4 v5, 0x4

    .line 25
    .line 26
    if-ne v4, v5, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p1}, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;->setGiftInfo(Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$c;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;->g()V

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 36
    goto :goto_0

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->c()V

    .line 40
    return-void

    .line 41
    .line 42
    :cond_2
    new-instance p1, Lnd0/a;

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p0}, Lnd0/a;-><init>(Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;)V

    .line 46
    .line 47
    const-wide/16 v0, 0x1f4

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 51
    return-void
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
.end method

.method public final f()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->c:[Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;

    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    :goto_0
    if-ge v2, v1, :cond_0

    .line 7
    .line 8
    aget-object v3, v0, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Lcom/trtc/uikit/livekit/component/gift/view/GiftBulletFrameLayout;->i()V

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
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

.method public final setCallback(Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$b;)V
    .locals 0
    .param p1    # Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;->d:Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$b;

    .line 3
    return-void
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
