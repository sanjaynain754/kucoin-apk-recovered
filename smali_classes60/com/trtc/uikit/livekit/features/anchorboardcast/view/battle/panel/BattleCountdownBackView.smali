.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;
.super Landroid/view/View;
.source "BattleCountdownBackView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001!B\u001d\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0013H\u0002R\u000e\u0010\u0008\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "viewPadding",
        "",
        "circlePaint",
        "Landroid/graphics/Paint;",
        "mArcPaint",
        "mRipplePaint",
        "mArcRect",
        "Landroid/graphics/RectF;",
        "mArcPath",
        "Landroid/graphics/Path;",
        "mCircleRadius",
        "",
        "mRotationAngle",
        "mRippleCircles",
        "",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$RippleCircle;",
        "onDraw",
        "",
        "canvas",
        "Landroid/graphics/Canvas;",
        "drawCircle",
        "draw2Arc",
        "drawRipple",
        "genRippleCircleAlpha",
        "radius",
        "RippleCircle",
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

.field public final c:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public h:F

.field public i:I

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
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

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
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
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x50

    .line 4
    iput p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->b:I

    .line 5
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    const/4 p2, -0x1

    .line 6
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    const/16 v0, 0xcc

    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 9
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->c:Landroid/graphics/Paint;

    .line 10
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 11
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v2, 0x40c00000    # 6.0f

    .line 13
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 14
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 15
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->d:Landroid/graphics/Paint;

    .line 16
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 17
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 p2, 0x40000000    # 2.0f

    .line 19
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 20
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->e:Landroid/graphics/Paint;

    .line 22
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->f:Landroid/graphics/RectF;

    .line 23
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->g:Landroid/graphics/Path;

    .line 24
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->j:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->i:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x168

    .line 7
    .line 8
    iput v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->i:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->g:Landroid/graphics/Path;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 14
    .line 15
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->f:Landroid/graphics/RectF;

    .line 16
    .line 17
    iget v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->i:I

    .line 18
    int-to-float v2, v2

    .line 19
    .line 20
    const/high16 v3, 0x42f00000    # 120.0f

    .line 21
    add-float/2addr v2, v3

    .line 22
    .line 23
    const/high16 v3, 0x42700000    # 60.0f

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 27
    .line 28
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->f:Landroid/graphics/RectF;

    .line 29
    .line 30
    iget v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->i:I

    .line 31
    int-to-float v2, v2

    .line 32
    .line 33
    const/high16 v3, -0x3d100000    # -120.0f

    .line 34
    add-float/2addr v2, v3

    .line 35
    .line 36
    const/high16 v3, 0x43340000    # 180.0f

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->g:Landroid/graphics/Path;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->d:Landroid/graphics/Paint;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 47
    return-void
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
.end method

.method public final b(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 8
    move-result v1

    .line 9
    int-to-float v0, v0

    .line 10
    .line 11
    const/high16 v2, 0x40000000    # 2.0f

    .line 12
    div-float/2addr v0, v2

    .line 13
    int-to-float v1, v1

    .line 14
    div-float/2addr v1, v2

    .line 15
    .line 16
    iget v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->h:F

    .line 17
    .line 18
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->c:Landroid/graphics/Paint;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 22
    return-void
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

.method public final c(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 8
    move-result v1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->j:Ljava/util/List;

    .line 11
    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 14
    move-result v2

    .line 15
    .line 16
    const/high16 v3, 0x40000000    # 2.0f

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->h:F

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->d(F)I

    .line 24
    move-result v4

    .line 25
    .line 26
    iget-object v5, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->j:Ljava/util/List;

    .line 27
    .line 28
    new-instance v6, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;

    .line 29
    .line 30
    .line 31
    invoke-direct {v6, v2, v4}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;-><init>(FI)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    iget v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->h:F

    .line 37
    .line 38
    iget v4, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->b:I

    .line 39
    int-to-float v4, v4

    .line 40
    div-float/2addr v4, v3

    .line 41
    add-float/2addr v2, v4

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->d(F)I

    .line 45
    move-result v4

    .line 46
    .line 47
    iget-object v5, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->j:Ljava/util/List;

    .line 48
    .line 49
    new-instance v6, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;

    .line 50
    .line 51
    .line 52
    invoke-direct {v6, v2, v4}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;-><init>(FI)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    :cond_0
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->j:Ljava/util/List;

    .line 58
    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    move-result v4

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    move-result-object v4

    .line 72
    .line 73
    check-cast v4, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;

    .line 74
    .line 75
    iget-object v5, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->e:Landroid/graphics/Paint;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;->a()I

    .line 79
    move-result v6

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 83
    int-to-float v5, v0

    .line 84
    div-float/2addr v5, v3

    .line 85
    int-to-float v6, v1

    .line 86
    div-float/2addr v6, v3

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;->b()F

    .line 90
    move-result v7

    .line 91
    .line 92
    iget-object v8, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->e:Landroid/graphics/Paint;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v5, v6, v7, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;->b()F

    .line 99
    move-result v6

    .line 100
    .line 101
    cmpl-float v5, v6, v5

    .line 102
    .line 103
    if-ltz v5, :cond_1

    .line 104
    .line 105
    iget v5, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->h:F

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v5}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;->d(F)V

    .line 109
    goto :goto_1

    .line 110
    .line 111
    .line 112
    :cond_1
    invoke-virtual {v4}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;->b()F

    .line 113
    move-result v5

    .line 114
    const/4 v6, 0x1

    .line 115
    int-to-float v6, v6

    .line 116
    add-float/2addr v5, v6

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v5}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;->d(F)V

    .line 120
    .line 121
    .line 122
    :goto_1
    invoke-virtual {v4}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;->b()F

    .line 123
    move-result v5

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v5}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->d(F)I

    .line 127
    move-result v5

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v5}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$a;->c(I)V

    .line 131
    goto :goto_0

    .line 132
    :cond_2
    return-void
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

.method public final d(F)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    int-to-float v0, v0

    .line 3
    .line 4
    iget v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->h:F

    .line 5
    sub-float/2addr p1, v1

    .line 6
    .line 7
    iget v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->b:I

    .line 8
    int-to-float v1, v1

    .line 9
    div-float/2addr p1, v1

    .line 10
    sub-float/2addr v0, p1

    .line 11
    .line 12
    const/16 p1, 0xff

    .line 13
    int-to-float p1, p1

    .line 14
    mul-float/2addr v0, p1

    .line 15
    float-to-int p1, v0

    .line 16
    return p1
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

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "canvas"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 12
    move-result v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 16
    move-result v1

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 20
    move-result v2

    .line 21
    .line 22
    iget v3, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->h:F

    .line 23
    const/4 v4, 0x0

    .line 24
    .line 25
    cmpg-float v3, v3, v4

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    iget v3, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->b:I

    .line 30
    const/4 v4, 0x2

    .line 31
    mul-int/2addr v3, v4

    .line 32
    sub-int/2addr v2, v3

    .line 33
    int-to-float v2, v2

    .line 34
    .line 35
    const/high16 v3, 0x40000000    # 2.0f

    .line 36
    div-float/2addr v2, v3

    .line 37
    .line 38
    iput v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->h:F

    .line 39
    .line 40
    iget-object v5, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->f:Landroid/graphics/RectF;

    .line 41
    int-to-float v0, v0

    .line 42
    int-to-float v4, v4

    .line 43
    mul-float/2addr v2, v4

    .line 44
    sub-float/2addr v0, v2

    .line 45
    .line 46
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->d:Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 50
    move-result v2

    .line 51
    div-float/2addr v2, v3

    .line 52
    sub-float/2addr v0, v2

    .line 53
    div-float/2addr v0, v3

    .line 54
    .line 55
    iput v0, v5, Landroid/graphics/RectF;->left:F

    .line 56
    int-to-float v0, v1

    .line 57
    .line 58
    iget v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->h:F

    .line 59
    mul-float/2addr v1, v4

    .line 60
    sub-float/2addr v0, v1

    .line 61
    .line 62
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->d:Landroid/graphics/Paint;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 66
    move-result v1

    .line 67
    div-float/2addr v1, v3

    .line 68
    sub-float/2addr v0, v1

    .line 69
    div-float/2addr v0, v3

    .line 70
    .line 71
    iput v0, v5, Landroid/graphics/RectF;->top:F

    .line 72
    .line 73
    iget v1, v5, Landroid/graphics/RectF;->left:F

    .line 74
    .line 75
    iget v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->h:F

    .line 76
    .line 77
    mul-float v3, v2, v4

    .line 78
    add-float/2addr v1, v3

    .line 79
    .line 80
    iput v1, v5, Landroid/graphics/RectF;->right:F

    .line 81
    mul-float/2addr v2, v4

    .line 82
    add-float/2addr v0, v2

    .line 83
    .line 84
    iput v0, v5, Landroid/graphics/RectF;->bottom:F

    .line 85
    .line 86
    .line 87
    :cond_0
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->b(Landroid/graphics/Canvas;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->a(Landroid/graphics/Canvas;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;->c(Landroid/graphics/Canvas;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 97
    return-void
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
