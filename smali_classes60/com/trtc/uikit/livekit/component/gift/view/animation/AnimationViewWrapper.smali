.class public final Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;
.super Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;
.source "AnimationViewWrapper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;,
        Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u001d\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0012\u0010\u0014\u001a\u00020\u000e2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0008\u0010\u0018\u001a\u00020\u000eH\u0016R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;",
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "animationView",
        "effectAnimationView",
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView;",
        "svgaAnimationView",
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;",
        "playAnimation",
        "",
        "playUrl",
        "",
        "playEffectAnimation",
        "url",
        "playSVGAAnimation",
        "switchAnimationView",
        "view",
        "getSourceType",
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;",
        "stopPlay",
        "AnimationSourceType",
        "Companion",
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
        "SMAP\nAnimationViewWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationViewWrapper.kt\ncom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,86:1\n43#2:87\n*S KotlinDebug\n*F\n+ 1 AnimationViewWrapper.kt\ncom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper\n*L\n36#1:87\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public d:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public e:Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->g:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$Companion;

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

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
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
    invoke-direct {p0, p1, p2}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "playUrl"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->f(Ljava/lang/String;)Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sget-object v1, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;->MP4:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->g(Ljava/lang/String;)V

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    sget-object v1, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;->SVGA:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->h(Ljava/lang/String;)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    const-string v1, "not support url: "

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    const-string v0, "AnimationViewWrapper"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;->getCallback()Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$a;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    const/4 v0, -0x1

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$a;->a(I)V

    .line 58
    :cond_2
    return-void
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

.method public e()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->d:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;->e()V

    .line 8
    :cond_0
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
.end method

.method public final f(Ljava/lang/String;)Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;->OTHER:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;

    .line 9
    return-object p1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    const-string v1, "getDefault(...)"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    const-string v2, "toLowerCase(...)"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    const-string v3, ".mp4"

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x2

    .line 32
    const/4 v6, 0x0

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v3, v4, v5, v6}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    sget-object p1, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;->MP4:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;

    .line 41
    return-object p1

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    const-string v0, ".svga"

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v0, v4, v5, v6}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 61
    move-result p1

    .line 62
    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    sget-object p1, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;->SVGA:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;

    .line 66
    return-object p1

    .line 67
    .line 68
    :cond_2
    sget-object p1, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;->OTHER:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;

    .line 69
    return-object p1
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

.method public final g(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->e:Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-string v2, "getContext(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v3, v2, v3}, Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->e:Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->e:Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 30
    move-result v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    .line 34
    :goto_0
    if-lez v0, :cond_4

    .line 35
    .line 36
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->d:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->e:Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView;

    .line 39
    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->i(Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;)V

    .line 44
    .line 45
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->e:Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView;

    .line 46
    .line 47
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->d:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 48
    .line 49
    :cond_2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->d:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;->getCallback()Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$a;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;->setCallback(Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$a;)V

    .line 59
    .line 60
    :cond_3
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->d:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;->d(Ljava/lang/String;)V

    .line 66
    return-void

    .line 67
    .line 68
    :cond_4
    const-string p1, "AnimationViewWrapper"

    .line 69
    .line 70
    const-string v0, "not support TCEffectAnimationView"

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;->getCallback()Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$a;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    if-eqz p1, :cond_5

    .line 80
    const/4 v0, -0x1

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$a;->a(I)V

    .line 84
    :cond_5
    return-void
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

.method public final h(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->f:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-string v2, "getContext(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v3, v2, v3}, Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->f:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->d:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->f:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->f:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->i(Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;)V

    .line 38
    .line 39
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->f:Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->d:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->d:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;->getCallback()Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$a;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;->setCallback(Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$a;)V

    .line 53
    .line 54
    :cond_2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;->d:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;->d(Ljava/lang/String;)V

    .line 60
    :cond_3
    return-void
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

.method public final i(Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    .line 5
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 6
    const/4 v1, -0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    return-void
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
