.class public final Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$d;
.super Landroid/view/ViewOutlineProvider;
.source "AtomicAvatar.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;->f(F)Landroid/view/ViewOutlineProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "io/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$createRoundClipDrawable$1",
        "Landroid/view/ViewOutlineProvider;",
        "getOutline",
        "",
        "view",
        "Landroid/view/View;",
        "outline",
        "Landroid/graphics/Outline;",
        "atomic_x_googleRelease"
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
.field public final synthetic a:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

.field public final synthetic b:F


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;F)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$d;->a:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 3
    .line 4
    iput p2, p0, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$d;->b:F

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

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
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "view"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "outline"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$d;->a:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;->a(Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;)Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarShape;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget-object v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$d$a;->$EnumSwitchMapping$0:[I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 23
    move-result v0

    .line 24
    .line 25
    aget v0, v1, v0

    .line 26
    const/4 v1, 0x1

    .line 27
    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    const/4 v1, 0x2

    .line 30
    .line 31
    if-eq v0, v1, :cond_0

    .line 32
    .line 33
    iget v0, p0, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$d;->b:F

    .line 34
    :goto_0
    move v6, v0

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$d;->a:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    const-string v1, "getContext(...)"

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    iget-object v1, p0, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$d;->a:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;->b(Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;)Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarSize;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarSize;->getBorderRadiusDp()F

    .line 56
    move-result v1

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, Lcg0/b;->a(Landroid/content/Context;F)I

    .line 60
    move-result v0

    .line 61
    int-to-float v0, v0

    .line 62
    goto :goto_0

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 66
    move-result v0

    .line 67
    int-to-float v0, v0

    .line 68
    .line 69
    const/high16 v1, 0x40000000    # 2.0f

    .line 70
    div-float/2addr v0, v1

    .line 71
    goto :goto_0

    .line 72
    .line 73
    .line 74
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 75
    move-result v4

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 79
    move-result v5

    .line 80
    const/4 v2, 0x0

    .line 81
    const/4 v3, 0x0

    .line 82
    move-object v1, p2

    .line 83
    .line 84
    .line 85
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 86
    return-void
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
.end method
