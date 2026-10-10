.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final g:Landroid/util/SparseArray;


# instance fields
.field public final a:I

.field public final b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public c:Lio/trtc/tuikit/atomicxcore/impl/live/o1;

.field public d:Z

.field public e:I

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/util/SparseArray;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    const-string v2, "VISIBLE"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 12
    const/4 v1, 0x4

    .line 13
    .line 14
    const-string v2, "INVISIBLE"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 18
    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    const-string v2, "GONE"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 25
    .line 26
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->g:Landroid/util/SparseArray;

    .line 27
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "roomId"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 17
    move-result v1

    .line 18
    .line 19
    iput v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->a:I

    .line 20
    .line 21
    const-string v2, "file"

    .line 22
    .line 23
    const-string v3, "AtomicXCore-Live"

    .line 24
    .line 25
    const-string v4, "TemplateView"

    .line 26
    .line 27
    .line 28
    invoke-static {v4, v2, v3, v4}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 32
    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v4, "TemplateView new OID:"

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v1, ", roomId:"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    move-result-object p2

    .line 54
    .line 55
    const-string v1, "message"

    .line 56
    .line 57
    .line 58
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    const/4 v1, 0x0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 69
    move-result-object p2

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 73
    move-result-object p2

    .line 74
    .line 75
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 76
    .line 77
    const/high16 v1, 0x44340000    # 720.0f

    .line 78
    mul-float/2addr p2, v1

    .line 79
    .line 80
    const/high16 v1, 0x3f000000    # 0.5f

    .line 81
    add-float/2addr p2, v1

    .line 82
    float-to-int p2, p2

    .line 83
    .line 84
    iput p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->e:I

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 98
    .line 99
    const/high16 p2, 0x44a00000    # 1280.0f

    .line 100
    mul-float/2addr p1, p2

    .line 101
    add-float/2addr p1, v1

    .line 102
    float-to-int p1, p1

    .line 103
    .line 104
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->f:I

    .line 105
    return-void
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

.method public static a(Lio/trtc/tuikit/atomicxcore/impl/live/o1;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Z
    .locals 3

    .line 27
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 28
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 29
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object v0

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getW()I

    move-result v0

    .line 30
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 31
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getH()I

    move-result p1

    .line 32
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 33
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    move-result p0

    if-ne p1, p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method public final a(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)F
    .locals 4

    .line 1
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 2
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    move-result v0

    int-to-float v0, v0

    .line 3
    iget-object v1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 4
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 5
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->e:I

    int-to-float v1, v1

    iget v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->f:I

    int-to-float v2, v2

    div-float v2, v1, v2

    .line 6
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 7
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v1, v3

    cmpl-float v0, v0, v2

    const/16 v2, 0x259

    if-ltz v0, :cond_1

    .line 8
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 9
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    move-result v0

    iget v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->f:I

    mul-int/2addr v0, v3

    int-to-float v0, v0

    .line 10
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 11
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v0, v3

    .line 12
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 13
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getTemplateID()I

    move-result v3

    if-ne v2, v3, :cond_0

    .line 14
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 15
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    move-result p1

    :goto_0
    int-to-float p1, p1

    div-float/2addr v0, p1

    return v0

    :cond_0
    return v1

    .line 16
    :cond_1
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 17
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    move-result v0

    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->e:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    .line 18
    iget-object v1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 19
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 20
    iget-object v1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 21
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getTemplateID()I

    move-result v1

    if-ne v2, v1, :cond_2

    .line 22
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 23
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    move-result p1

    goto :goto_0

    .line 24
    :cond_2
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->f:I

    int-to-float v0, v0

    .line 25
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 26
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    move-result p1

    goto :goto_0
.end method

.method public final getTemplate()Lio/trtc/tuikit/atomicxcore/impl/live/o1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->c:Lio/trtc/tuikit/atomicxcore/impl/live/o1;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final onLayout(ZIIII)V
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->c:Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v2

    .line 12
    .line 13
    :goto_0
    if-eqz v1, :cond_10

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    goto/16 :goto_7

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    move-result v1

    .line 26
    .line 27
    if-gtz v1, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 31
    return-void

    .line 32
    .line 33
    :cond_2
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->c:Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 40
    move-result v3

    .line 41
    .line 42
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->c:Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    .line 43
    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    iget-object v2, v4, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    .line 47
    :cond_3
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x1

    .line 49
    .line 50
    if-nez v2, :cond_4

    .line 51
    goto :goto_1

    .line 52
    .line 53
    .line 54
    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 55
    .line 56
    iget-object v2, v4, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    .line 57
    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    move-result v4

    .line 65
    .line 66
    if-eqz v4, :cond_6

    .line 67
    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 73
    .line 74
    if-eqz v4, :cond_5

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    .line 78
    move-result-object v7

    .line 79
    .line 80
    iget-object v7, v7, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 88
    move-result-object v4

    .line 89
    .line 90
    .line 91
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    move-result v4

    .line 93
    .line 94
    if-eqz v4, :cond_5

    .line 95
    move v2, v6

    .line 96
    goto :goto_2

    .line 97
    :cond_6
    :goto_1
    move v2, v5

    .line 98
    .line 99
    .line 100
    :goto_2
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->a(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)F

    .line 101
    move-result v4

    .line 102
    move v7, v5

    .line 103
    .line 104
    :goto_3
    if-ge v7, v3, :cond_f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 108
    move-result-object v8

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 112
    move-result-object v9

    .line 113
    .line 114
    const-string v10, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.SeatInfo"

    .line 115
    .line 116
    .line 117
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    check-cast v9, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 120
    .line 121
    new-instance v10, Landroid/graphics/Point;

    .line 122
    .line 123
    .line 124
    invoke-direct {v10, v5, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 125
    .line 126
    iget-object v11, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getTemplateID()I

    .line 130
    move-result v11

    .line 131
    .line 132
    const/16 v12, 0x259

    .line 133
    .line 134
    if-eq v12, v11, :cond_7

    .line 135
    .line 136
    goto/16 :goto_4

    .line 137
    .line 138
    :cond_7
    if-eqz v2, :cond_8

    .line 139
    goto :goto_4

    .line 140
    .line 141
    .line 142
    :cond_8
    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    .line 143
    move-result-object v11

    .line 144
    .line 145
    .line 146
    invoke-virtual {v11}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getH()I

    .line 147
    move-result v11

    .line 148
    .line 149
    iget-object v13, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v13}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    .line 153
    move-result v13

    .line 154
    .line 155
    if-ge v11, v13, :cond_b

    .line 156
    .line 157
    .line 158
    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    .line 159
    move-result-object v11

    .line 160
    .line 161
    .line 162
    invoke-virtual {v11}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getW()I

    .line 163
    move-result v11

    .line 164
    .line 165
    iget-object v13, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v13}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    .line 169
    move-result v13

    .line 170
    .line 171
    if-lt v11, v13, :cond_9

    .line 172
    goto :goto_4

    .line 173
    .line 174
    :cond_9
    iget-object v11, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v11}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    .line 178
    move-result v11

    .line 179
    int-to-float v11, v11

    .line 180
    .line 181
    iget-object v13, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v13}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    .line 185
    move-result v13

    .line 186
    int-to-float v13, v13

    .line 187
    div-float/2addr v11, v13

    .line 188
    .line 189
    iget v13, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->e:I

    .line 190
    int-to-float v13, v13

    .line 191
    .line 192
    iget v14, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->f:I

    .line 193
    int-to-float v14, v14

    .line 194
    div-float/2addr v13, v14

    .line 195
    .line 196
    iget-object v14, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v14}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    .line 200
    move-result v14

    .line 201
    .line 202
    iget v15, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->f:I

    .line 203
    mul-int/2addr v14, v15

    .line 204
    int-to-float v14, v14

    .line 205
    .line 206
    iget-object v15, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v15}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    .line 210
    move-result v15

    .line 211
    int-to-float v15, v15

    .line 212
    div-float/2addr v14, v15

    .line 213
    .line 214
    iget-object v15, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v15}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    .line 218
    move-result v15

    .line 219
    .line 220
    iget v5, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->e:I

    .line 221
    mul-int/2addr v15, v5

    .line 222
    int-to-float v5, v15

    .line 223
    .line 224
    iget-object v15, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v15}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    .line 228
    move-result v15

    .line 229
    int-to-float v15, v15

    .line 230
    div-float/2addr v5, v15

    .line 231
    .line 232
    cmpl-float v15, v11, v13

    .line 233
    const/4 v12, 0x2

    .line 234
    .line 235
    if-ltz v15, :cond_a

    .line 236
    int-to-float v5, v6

    .line 237
    div-float/2addr v13, v11

    .line 238
    sub-float/2addr v5, v13

    .line 239
    int-to-float v11, v12

    .line 240
    div-float/2addr v14, v11

    .line 241
    mul-float/2addr v14, v5

    .line 242
    float-to-int v5, v14

    .line 243
    .line 244
    iput v5, v10, Landroid/graphics/Point;->x:I

    .line 245
    goto :goto_4

    .line 246
    :cond_a
    int-to-float v14, v6

    .line 247
    div-float/2addr v11, v13

    .line 248
    sub-float/2addr v14, v11

    .line 249
    int-to-float v11, v12

    .line 250
    div-float/2addr v5, v11

    .line 251
    mul-float/2addr v5, v14

    .line 252
    float-to-int v5, v5

    .line 253
    .line 254
    iput v5, v10, Landroid/graphics/Point;->y:I

    .line 255
    .line 256
    :cond_b
    :goto_4
    iget-object v5, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getTemplateID()I

    .line 260
    move-result v5

    .line 261
    .line 262
    const/16 v11, 0x259

    .line 263
    .line 264
    if-eq v11, v5, :cond_c

    .line 265
    goto :goto_5

    .line 266
    .line 267
    :cond_c
    if-nez v2, :cond_d

    .line 268
    goto :goto_5

    .line 269
    .line 270
    .line 271
    :cond_d
    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    .line 272
    move-result-object v5

    .line 273
    .line 274
    .line 275
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getH()I

    .line 276
    move-result v5

    .line 277
    .line 278
    iget-object v11, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v11}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    .line 282
    move-result v11

    .line 283
    .line 284
    if-ge v5, v11, :cond_e

    .line 285
    .line 286
    .line 287
    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    .line 288
    move-result-object v5

    .line 289
    .line 290
    .line 291
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getW()I

    .line 292
    move-result v5

    .line 293
    .line 294
    iget-object v11, v1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v11}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    .line 298
    move-result v11

    .line 299
    .line 300
    if-ge v5, v11, :cond_e

    .line 301
    .line 302
    iget v5, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->e:I

    .line 303
    .line 304
    .line 305
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 306
    move-result v11

    .line 307
    sub-int/2addr v5, v11

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 311
    move-result-object v11

    .line 312
    .line 313
    const-string v12, "getContext(...)"

    .line 314
    .line 315
    .line 316
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    .line 318
    const-string v12, "context"

    .line 319
    .line 320
    .line 321
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 325
    move-result-object v11

    .line 326
    .line 327
    .line 328
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 329
    move-result-object v11

    .line 330
    .line 331
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 332
    .line 333
    const/high16 v12, 0x41400000    # 12.0f

    .line 334
    mul-float/2addr v11, v12

    .line 335
    .line 336
    const/high16 v12, 0x3f000000    # 0.5f

    .line 337
    add-float/2addr v11, v12

    .line 338
    float-to-int v11, v11

    .line 339
    sub-int/2addr v5, v11

    .line 340
    goto :goto_6

    .line 341
    .line 342
    .line 343
    :cond_e
    :goto_5
    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    .line 344
    move-result-object v5

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getX()I

    .line 348
    move-result v5

    .line 349
    int-to-float v5, v5

    .line 350
    mul-float/2addr v5, v4

    .line 351
    .line 352
    iget v11, v10, Landroid/graphics/Point;->x:I

    .line 353
    int-to-float v11, v11

    .line 354
    sub-float/2addr v5, v11

    .line 355
    float-to-int v5, v5

    .line 356
    .line 357
    .line 358
    :goto_6
    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    .line 359
    move-result-object v9

    .line 360
    .line 361
    .line 362
    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getY()I

    .line 363
    move-result v9

    .line 364
    int-to-float v9, v9

    .line 365
    mul-float/2addr v9, v4

    .line 366
    .line 367
    iget v10, v10, Landroid/graphics/Point;->y:I

    .line 368
    int-to-float v10, v10

    .line 369
    sub-float/2addr v9, v10

    .line 370
    float-to-int v9, v9

    .line 371
    .line 372
    .line 373
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 374
    move-result v10

    .line 375
    add-int/2addr v10, v5

    .line 376
    .line 377
    .line 378
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 379
    move-result v11

    .line 380
    add-int/2addr v11, v9

    .line 381
    .line 382
    .line 383
    invoke-virtual {v8, v5, v9, v10, v11}, Landroid/view/View;->layout(IIII)V

    .line 384
    .line 385
    add-int/lit8 v7, v7, 0x1

    .line 386
    const/4 v5, 0x0

    .line 387
    .line 388
    goto/16 :goto_3

    .line 389
    :cond_f
    return-void

    .line 390
    .line 391
    .line 392
    :cond_10
    :goto_7
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 393
    return-void
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final onMeasure(II)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 4
    .line 5
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->c:Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    .line 6
    const/4 p2, 0x0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/o1;->b:Ljava/util/List;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p1, p2

    .line 13
    .line 14
    :goto_0
    if-eqz p1, :cond_7

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    move-result p1

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 26
    move-result p1

    .line 27
    .line 28
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->e:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 32
    move-result p1

    .line 33
    .line 34
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->f:I

    .line 35
    .line 36
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->c:Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 40
    .line 41
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->d:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    .line 46
    const v0, 0x106000d

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 53
    move-result v0

    .line 54
    .line 55
    if-gtz v0, :cond_3

    .line 56
    goto :goto_2

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-static {p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->a(Lio/trtc/tuikit/atomicxcore/impl/live/o1;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Z

    .line 60
    move-result p2

    .line 61
    const/4 v1, 0x0

    .line 62
    .line 63
    const/high16 v2, 0x40000000    # 2.0f

    .line 64
    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    iget p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->e:I

    .line 72
    .line 73
    .line 74
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 75
    move-result p2

    .line 76
    .line 77
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->f:I

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 81
    move-result v0

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 85
    return-void

    .line 86
    .line 87
    .line 88
    :cond_4
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->a(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)F

    .line 89
    move-result p2

    .line 90
    .line 91
    :goto_1
    if-ge v1, v0, :cond_7

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 95
    move-result-object v3

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 99
    move-result-object v4

    .line 100
    .line 101
    const-string v5, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.SeatInfo"

    .line 102
    .line 103
    .line 104
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 110
    move-result v5

    .line 111
    .line 112
    const/16 v6, 0x8

    .line 113
    .line 114
    if-eq v5, v6, :cond_6

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    .line 118
    move-result-object v5

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getW()I

    .line 122
    move-result v5

    .line 123
    int-to-float v5, v5

    .line 124
    mul-float/2addr v5, p2

    .line 125
    float-to-int v5, v5

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getRegion()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;

    .line 129
    move-result-object v6

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;->getH()I

    .line 133
    move-result v6

    .line 134
    int-to-float v6, v6

    .line 135
    mul-float/2addr v6, p2

    .line 136
    float-to-int v6, v6

    .line 137
    .line 138
    .line 139
    invoke-static {p1, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->a(Lio/trtc/tuikit/atomicxcore/impl/live/o1;Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Z

    .line 140
    move-result v4

    .line 141
    .line 142
    if-eqz v4, :cond_5

    .line 143
    .line 144
    iget v5, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->e:I

    .line 145
    .line 146
    iget v6, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->f:I

    .line 147
    .line 148
    .line 149
    :cond_5
    invoke-static {v5, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 150
    move-result v4

    .line 151
    .line 152
    .line 153
    invoke-static {v6, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 154
    move-result v5

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3, v4, v5}, Landroid/view/View;->measure(II)V

    .line 158
    .line 159
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 160
    goto :goto_1

    .line 161
    :cond_7
    :goto_2
    return-void
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

.method public final setBackgroundTransparent(Z)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->d:Z

    .line 3
    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->d:Z

    .line 7
    :cond_0
    return-void
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
.end method

.method public final setTemplate(Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V
    .locals 0
    .param p1    # Lio/trtc/tuikit/atomicxcore/impl/live/o1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->c:Lio/trtc/tuikit/atomicxcore/impl/live/o1;

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
.end method

.method public setVisibility(I)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 4
    .line 5
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "setVisibility OID:"

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    iget v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->a:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, " visibility:"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/view/live/layer/e;->g:Landroid/util/SparseArray;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    const-string v1, "message"

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    const/4 v1, 0x0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

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
.end method
