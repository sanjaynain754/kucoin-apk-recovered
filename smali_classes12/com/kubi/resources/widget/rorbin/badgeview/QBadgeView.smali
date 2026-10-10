.class public Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;
.super Landroid/view/View;
.source "QBadgeView.java"

# interfaces
.implements Lzw/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView$BadgeContainer;
    }
.end annotation


# instance fields
.field public A:Landroid/graphics/Paint$FontMetrics;

.field public B:Landroid/graphics/PointF;

.field public C:Landroid/graphics/PointF;

.field public D:Landroid/graphics/PointF;

.field public E:Landroid/graphics/PointF;

.field public F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public G:Landroid/view/View;

.field public H:I

.field public I:I

.field public J:Landroid/text/TextPaint;

.field public K:Landroid/graphics/Paint;

.field public L:Landroid/graphics/Paint;

.field public M:Lzw/b;

.field public N:Landroid/view/ViewGroup;

.field public b:I

.field public c:I

.field public d:I

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Landroid/graphics/Bitmap;

.field public g:Z

.field public h:F

.field public i:F

.field public j:F

.field public k:I

.field public l:Ljava/lang/String;

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:I

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:I

.field public w:Z

.field public x:Landroid/graphics/RectF;

.field public y:Landroid/graphics/RectF;

.field public z:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->u()V

    return-void
.end method

.method private getBadgeCircleRadius()F
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 11
    return v0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    const/high16 v2, 0x40000000    # 2.0f

    .line 21
    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 28
    move-result v0

    .line 29
    .line 30
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 34
    move-result v1

    .line 35
    .line 36
    cmpl-float v0, v0, v1

    .line 37
    .line 38
    const/high16 v1, 0x3f000000    # 0.5f

    .line 39
    .line 40
    if-lez v0, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 46
    move-result v0

    .line 47
    div-float/2addr v0, v2

    .line 48
    .line 49
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 50
    mul-float/2addr v2, v1

    .line 51
    add-float/2addr v0, v2

    .line 52
    return v0

    .line 53
    .line 54
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 58
    move-result v0

    .line 59
    div-float/2addr v0, v2

    .line 60
    .line 61
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 62
    mul-float/2addr v2, v1

    .line 63
    add-float/2addr v0, v2

    .line 64
    return v0

    .line 65
    .line 66
    :cond_2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 70
    move-result v0

    .line 71
    div-float/2addr v0, v2

    .line 72
    return v0
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
.end method


# virtual methods
.method public A(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 16
    .line 17
    :cond_0
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->N:Landroid/view/ViewGroup;

    .line 20
    .line 21
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 22
    const/4 v1, -0x1

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    return-void

    .line 30
    .line 31
    :cond_1
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->G:Landroid/view/View;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f(Landroid/view/View;)Lzw/a;

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
.end method

.method public B(I)Lzw/a;
    .locals 2

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->b:I

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 16
    .line 17
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 27
    return-object p0
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
.end method

.method public C(Ljava/lang/String;)Lzw/a;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    iput p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->k:I

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 12
    return-object p0
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
.end method

.method public D(FZ)Lzw/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p1, p2}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->c(FFZ)Lzw/a;

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
.end method

.method public final E(Z)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v3}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 20
    move-result v2

    .line 21
    .line 22
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->v:I

    .line 23
    const/4 v5, 0x1

    .line 24
    .line 25
    const/high16 v6, -0x40400000    # -1.5f

    .line 26
    .line 27
    if-eq v4, v5, :cond_3

    .line 28
    const/4 v5, 0x2

    .line 29
    .line 30
    const/high16 v7, -0x40800000    # -1.0f

    .line 31
    .line 32
    if-eq v4, v5, :cond_2

    .line 33
    const/4 v5, 0x3

    .line 34
    .line 35
    if-eq v4, v5, :cond_1

    .line 36
    const/4 v5, 0x4

    .line 37
    .line 38
    if-eq v4, v5, :cond_0

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 47
    move-result v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v3}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 55
    move-result v2

    .line 56
    goto :goto_0

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v7}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 64
    move-result v0

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v3}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 72
    move-result v2

    .line 73
    goto :goto_0

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v7}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 81
    move-result v0

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    move-result-object v1

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v6}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 89
    move-result v2

    .line 90
    goto :goto_0

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v1}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 98
    move-result v0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-static {v1, v6}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 106
    move-result v2

    .line 107
    .line 108
    :goto_0
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 109
    .line 110
    if-eqz p1, :cond_4

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    const/high16 v3, 0x40000000    # 2.0f

    .line 117
    .line 118
    .line 119
    invoke-static {p1, v3}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 120
    move-result p1

    .line 121
    int-to-float p1, p1

    .line 122
    goto :goto_1

    .line 123
    :cond_4
    const/4 p1, 0x0

    .line 124
    :goto_1
    int-to-float v0, v0

    .line 125
    int-to-float v2, v2

    .line 126
    .line 127
    const/high16 v3, 0x33000000

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, p1, v0, v2, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 131
    return-void
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
.end method

.method public final F(I)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public a(Z)V
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->N:Landroid/view/ViewGroup;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->w()V

    .line 10
    .line 11
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j(Landroid/graphics/PointF;)V

    .line 15
    return-void

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->b(I)Lzw/a;

    .line 20
    return-void
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
.end method

.method public b(I)Lzw/a;
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->k:I

    .line 3
    .line 4
    if-gez p1, :cond_0

    .line 5
    .line 6
    const-string p1, ""

    .line 7
    .line 8
    iput-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    const/16 v0, 0x63

    .line 12
    .line 13
    if-le p1, v0, :cond_2

    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->o:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_1
    const-string p1, "99+"

    .line 25
    .line 26
    :goto_0
    iput-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_2
    if-lez p1, :cond_3

    .line 30
    .line 31
    if-gt p1, v0, :cond_3

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    iput-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_3
    if-nez p1, :cond_4

    .line 41
    const/4 p1, 0x0

    .line 42
    .line 43
    iput-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 50
    return-object p0
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
.end method

.method public c(FFZ)Lzw/a;
    .locals 1

    .line 1
    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 10
    move-result p1

    .line 11
    int-to-float p1, p1

    .line 12
    .line 13
    :cond_0
    iput p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 14
    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 23
    move-result p1

    .line 24
    int-to-float p2, p1

    .line 25
    .line 26
    :cond_1
    iput p2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->s:F

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 30
    return-object p0
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
.end method

.method public d(Z)Lzw/a;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->p:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    return-object p0
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
.end method

.method public e(FZ)Lzw/a;
    .locals 0

    .line 1
    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    .line 9
    invoke-static {p2, p1}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 10
    move-result p1

    .line 11
    int-to-float p1, p1

    .line 12
    .line 13
    :cond_0
    iput p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->m()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public f(Landroid/view/View;)Lzw/a;
    .locals 5

    .line 1
    .line 2
    if-eqz p1, :cond_6

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 24
    .line 25
    if-eqz v1, :cond_5

    .line 26
    .line 27
    iput-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->G:Landroid/view/View;

    .line 28
    .line 29
    instance-of v1, v0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView$BadgeContainer;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    check-cast v0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView$BadgeContainer;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 37
    return-object p0

    .line 38
    .line 39
    :cond_1
    check-cast v0, Landroid/view/ViewGroup;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 43
    move-result v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    new-instance v3, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView$BadgeContainer;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    move-result-object v4

    .line 54
    .line 55
    .line 56
    invoke-direct {v3, p0, v4}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView$BadgeContainer;-><init>(Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;Landroid/content/Context;)V

    .line 57
    .line 58
    instance-of v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 63
    .line 64
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 68
    move-result v4

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v3, v4, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->t(Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView$BadgeContainer;ILandroidx/constraintlayout/widget/ConstraintLayout;)Landroidx/constraintlayout/widget/ConstraintSet;

    .line 72
    move-result-object v4

    .line 73
    .line 74
    if-nez v4, :cond_2

    .line 75
    return-object p0

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->reset()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->setConstraintSet(Landroidx/constraintlayout/widget/ConstraintSet;)V

    .line 88
    goto :goto_0

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 92
    .line 93
    instance-of v4, v0, Landroid/widget/RelativeLayout;

    .line 94
    .line 95
    if-eqz v4, :cond_4

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 99
    move-result v4

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 103
    .line 104
    .line 105
    :cond_4
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 106
    .line 107
    .line 108
    :goto_0
    invoke-virtual {v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    return-object p0

    .line 113
    .line 114
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    const-string v0, "targetView must have a parent"

    .line 117
    .line 118
    .line 119
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 120
    throw p1

    .line 121
    .line 122
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 123
    .line 124
    const-string v0, "targetView can not be null"

    .line 125
    .line 126
    .line 127
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    throw p1
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
.end method

.method public g(IFZ)Lzw/a;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->c:I

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 12
    move-result p1

    .line 13
    int-to-float p2, p1

    .line 14
    .line 15
    :cond_0
    iput p2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->h:F

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 19
    return-object p0
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
.end method

.method public getBadgeBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->e:Landroid/graphics/drawable/Drawable;

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

.method public getBadgeBackgroundColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->b:I

    .line 3
    return v0
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

.method public getBadgeGravity()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->q:I

    .line 3
    return v0
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

.method public getBadgeNumber()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->k:I

    .line 3
    return v0
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

.method public getBadgeText()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

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

.method public getBadgeTextColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->d:I

    .line 3
    return v0
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

.method public getDragCenter()Landroid/graphics/PointF;
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->m:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->n:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
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

.method public getTargetView()Landroid/view/View;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->G:Landroid/view/View;

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

.method public h(I)Lzw/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    const v0, 0x800033

    .line 4
    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    .line 8
    const v0, 0x800035

    .line 9
    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    .line 13
    const v0, 0x800053

    .line 14
    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    .line 18
    const v0, 0x800055

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0x11

    .line 23
    .line 24
    if-eq p1, v0, :cond_1

    .line 25
    .line 26
    const/16 v0, 0x31

    .line 27
    .line 28
    if-eq p1, v0, :cond_1

    .line 29
    .line 30
    const/16 v0, 0x51

    .line 31
    .line 32
    if-eq p1, v0, :cond_1

    .line 33
    .line 34
    .line 35
    const v0, 0x800013

    .line 36
    .line 37
    if-eq p1, v0, :cond_1

    .line 38
    .line 39
    .line 40
    const v0, 0x800015

    .line 41
    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "only support Gravity.START | Gravity.TOP , Gravity.END | Gravity.TOP , Gravity.START | Gravity.BOTTOM , Gravity.END | Gravity.BOTTOM , Gravity.CENTER , Gravity.CENTER | Gravity.TOP , Gravity.CENTER | Gravity.BOTTOM ,Gravity.CENTER | Gravity.START , Gravity.CENTER | Gravity.END"

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1

    .line 52
    .line 53
    :cond_1
    :goto_0
    iput p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->q:I

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 57
    return-object p0
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
.end method

.method public i(FZ)Lzw/a;
    .locals 0

    .line 1
    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    .line 9
    invoke-static {p2, p1}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 10
    move-result p1

    .line 11
    int-to-float p1, p1

    .line 12
    .line 13
    :cond_0
    iput p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->i:F

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public j(Landroid/graphics/PointF;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->M:Lzw/b;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    return-void

    .line 18
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->A(Z)V

    .line 22
    .line 23
    new-instance v0, Lzw/b;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l()Landroid/graphics/Bitmap;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1, p1, p0}, Lzw/b;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/PointF;Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;)V

    .line 31
    .line 32
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->M:Lzw/b;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 36
    const/4 p1, 0x0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->b(I)Lzw/a;

    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final k(IILandroidx/constraintlayout/widget/ConstraintSet$Layout;)V
    .locals 1

    .line 1
    .line 2
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->baselineToBaseline:I

    .line 3
    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->baselineToBaseline:I

    .line 7
    .line 8
    :cond_0
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->guideBegin:I

    .line 9
    .line 10
    if-ne p2, v0, :cond_1

    .line 11
    .line 12
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->guideBegin:I

    .line 13
    .line 14
    :cond_1
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->guideEnd:I

    .line 15
    .line 16
    if-ne p2, v0, :cond_2

    .line 17
    .line 18
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->guideEnd:I

    .line 19
    .line 20
    :cond_2
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->leftToLeft:I

    .line 21
    .line 22
    if-ne p2, v0, :cond_3

    .line 23
    .line 24
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->leftToLeft:I

    .line 25
    .line 26
    :cond_3
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->leftToRight:I

    .line 27
    .line 28
    if-ne p2, v0, :cond_4

    .line 29
    .line 30
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->leftToRight:I

    .line 31
    .line 32
    :cond_4
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->rightToLeft:I

    .line 33
    .line 34
    if-ne p2, v0, :cond_5

    .line 35
    .line 36
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->rightToLeft:I

    .line 37
    .line 38
    :cond_5
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->rightToRight:I

    .line 39
    .line 40
    if-ne p2, v0, :cond_6

    .line 41
    .line 42
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->rightToRight:I

    .line 43
    .line 44
    :cond_6
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->topToTop:I

    .line 45
    .line 46
    if-ne p2, v0, :cond_7

    .line 47
    .line 48
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->topToTop:I

    .line 49
    .line 50
    :cond_7
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->topToBottom:I

    .line 51
    .line 52
    if-ne p2, v0, :cond_8

    .line 53
    .line 54
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->topToBottom:I

    .line 55
    .line 56
    :cond_8
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->bottomToTop:I

    .line 57
    .line 58
    if-ne p2, v0, :cond_9

    .line 59
    .line 60
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->bottomToTop:I

    .line 61
    .line 62
    :cond_9
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->bottomToBottom:I

    .line 63
    .line 64
    if-ne p2, v0, :cond_a

    .line 65
    .line 66
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->bottomToBottom:I

    .line 67
    .line 68
    :cond_a
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->baselineToTop:I

    .line 69
    .line 70
    if-ne p2, v0, :cond_b

    .line 71
    .line 72
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->baselineToTop:I

    .line 73
    .line 74
    :cond_b
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->baselineToBottom:I

    .line 75
    .line 76
    if-ne p2, v0, :cond_c

    .line 77
    .line 78
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->baselineToBottom:I

    .line 79
    .line 80
    :cond_c
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->startToEnd:I

    .line 81
    .line 82
    if-ne p2, v0, :cond_d

    .line 83
    .line 84
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->startToEnd:I

    .line 85
    .line 86
    :cond_d
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->startToStart:I

    .line 87
    .line 88
    if-ne p2, v0, :cond_e

    .line 89
    .line 90
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->startToStart:I

    .line 91
    .line 92
    :cond_e
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->endToStart:I

    .line 93
    .line 94
    if-ne p2, v0, :cond_f

    .line 95
    .line 96
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->endToStart:I

    .line 97
    .line 98
    :cond_f
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->endToEnd:I

    .line 99
    .line 100
    if-ne p2, v0, :cond_10

    .line 101
    .line 102
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->endToEnd:I

    .line 103
    .line 104
    :cond_10
    iget v0, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->circleConstraint:I

    .line 105
    .line 106
    if-ne p2, v0, :cond_11

    .line 107
    .line 108
    iput p1, p3, Landroidx/constraintlayout/widget/ConstraintSet$Layout;->circleConstraint:I

    .line 109
    :cond_11
    return-void
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
.end method

.method public l()Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 6
    move-result v0

    .line 7
    float-to-int v0, v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const/high16 v2, 0x40400000    # 3.0f

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 17
    move-result v1

    .line 18
    add-int/2addr v0, v1

    .line 19
    .line 20
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 24
    move-result v1

    .line 25
    float-to-int v1, v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-static {v3, v2}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 33
    move-result v2

    .line 34
    add-int/2addr v1, v2

    .line 35
    .line 36
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    new-instance v1, Landroid/graphics/Canvas;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 46
    .line 47
    new-instance v2, Landroid/graphics/PointF;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    .line 51
    move-result v3

    .line 52
    int-to-float v3, v3

    .line 53
    .line 54
    const/high16 v4, 0x40000000    # 2.0f

    .line 55
    div-float/2addr v3, v4

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    .line 59
    move-result v5

    .line 60
    int-to-float v5, v5

    .line 61
    div-float/2addr v5, v4

    .line 62
    .line 63
    .line 64
    invoke-direct {v2, v3, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->getBadgeCircleRadius()F

    .line 68
    move-result v3

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v1, v2, v3}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->n(Landroid/graphics/Canvas;Landroid/graphics/PointF;F)V

    .line 72
    return-object v0
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
.end method

.method public final m()V
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->g:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    :goto_0
    return-void

    .line 11
    .line 12
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-direct {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->getBadgeCircleRadius()F

    .line 29
    move-result v0

    .line 30
    .line 31
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 35
    move-result v1

    .line 36
    .line 37
    const/high16 v2, 0x40000000    # 2.0f

    .line 38
    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 45
    move-result v1

    .line 46
    const/4 v3, 0x1

    .line 47
    .line 48
    if-ne v1, v3, :cond_3

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_3
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 55
    move-result v0

    .line 56
    .line 57
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 58
    mul-float/2addr v1, v2

    .line 59
    add-float/2addr v0, v1

    .line 60
    float-to-int v0, v0

    .line 61
    .line 62
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 66
    move-result v1

    .line 67
    .line 68
    iget v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 69
    add-float/2addr v1, v3

    .line 70
    float-to-int v1, v1

    .line 71
    .line 72
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f:Landroid/graphics/Bitmap;

    .line 79
    .line 80
    new-instance v3, Landroid/graphics/Canvas;

    .line 81
    .line 82
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f:Landroid/graphics/Bitmap;

    .line 83
    .line 84
    .line 85
    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    .line 89
    move-result v0

    .line 90
    int-to-float v6, v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    .line 94
    move-result v0

    .line 95
    int-to-float v7, v0

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    .line 99
    move-result v0

    .line 100
    int-to-float v0, v0

    .line 101
    .line 102
    div-float v8, v0, v2

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    .line 106
    move-result v0

    .line 107
    int-to-float v0, v0

    .line 108
    .line 109
    div-float v9, v0, v2

    .line 110
    .line 111
    iget-object v10, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 112
    const/4 v4, 0x0

    .line 113
    const/4 v5, 0x0

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 117
    return-void

    .line 118
    :cond_4
    :goto_1
    float-to-int v0, v0

    .line 119
    .line 120
    mul-int/lit8 v0, v0, 0x2

    .line 121
    .line 122
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    .line 123
    .line 124
    .line 125
    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f:Landroid/graphics/Bitmap;

    .line 129
    .line 130
    new-instance v0, Landroid/graphics/Canvas;

    .line 131
    .line 132
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f:Landroid/graphics/Bitmap;

    .line 133
    .line 134
    .line 135
    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    .line 139
    move-result v1

    .line 140
    int-to-float v1, v1

    .line 141
    div-float/2addr v1, v2

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getHeight()I

    .line 145
    move-result v3

    .line 146
    int-to-float v3, v3

    .line 147
    div-float/2addr v3, v2

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    .line 151
    move-result v4

    .line 152
    int-to-float v4, v4

    .line 153
    div-float/2addr v4, v2

    .line 154
    .line 155
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 159
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
.end method

.method public final n(Landroid/graphics/Canvas;Landroid/graphics/PointF;F)V
    .locals 7

    .line 1
    .line 2
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 3
    .line 4
    const/high16 v1, -0x3b860000    # -1000.0f

    .line 5
    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget v0, p2, Landroid/graphics/PointF;->y:F

    .line 11
    .line 12
    cmpl-float v0, v0, v1

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    .line 25
    const/high16 v2, 0x40000000    # 2.0f

    .line 26
    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 33
    move-result v0

    .line 34
    const/4 v3, 0x1

    .line 35
    .line 36
    if-ne v0, v3, :cond_1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_1
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 40
    .line 41
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 42
    .line 43
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 47
    move-result v3

    .line 48
    div-float/2addr v3, v2

    .line 49
    .line 50
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 51
    add-float/2addr v3, v4

    .line 52
    sub-float/2addr v0, v3

    .line 53
    .line 54
    iput v0, p3, Landroid/graphics/RectF;->left:F

    .line 55
    .line 56
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 57
    .line 58
    iget v0, p2, Landroid/graphics/PointF;->y:F

    .line 59
    .line 60
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 64
    move-result v3

    .line 65
    div-float/2addr v3, v2

    .line 66
    .line 67
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 68
    .line 69
    const/high16 v5, 0x3f000000    # 0.5f

    .line 70
    mul-float/2addr v4, v5

    .line 71
    add-float/2addr v3, v4

    .line 72
    sub-float/2addr v0, v3

    .line 73
    .line 74
    iput v0, p3, Landroid/graphics/RectF;->top:F

    .line 75
    .line 76
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 77
    .line 78
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 79
    .line 80
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 84
    move-result v3

    .line 85
    div-float/2addr v3, v2

    .line 86
    .line 87
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 88
    add-float/2addr v3, v4

    .line 89
    add-float/2addr v0, v3

    .line 90
    .line 91
    iput v0, p3, Landroid/graphics/RectF;->right:F

    .line 92
    .line 93
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 94
    .line 95
    iget v0, p2, Landroid/graphics/PointF;->y:F

    .line 96
    .line 97
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 101
    move-result v3

    .line 102
    div-float/2addr v3, v2

    .line 103
    .line 104
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 105
    mul-float/2addr v4, v5

    .line 106
    add-float/2addr v3, v4

    .line 107
    add-float/2addr v0, v3

    .line 108
    .line 109
    iput v0, p3, Landroid/graphics/RectF;->bottom:F

    .line 110
    .line 111
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    .line 115
    move-result p3

    .line 116
    div-float/2addr p3, v2

    .line 117
    .line 118
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->e:Landroid/graphics/drawable/Drawable;

    .line 119
    .line 120
    if-eqz v0, :cond_2

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->o(Landroid/graphics/Canvas;)V

    .line 124
    goto :goto_1

    .line 125
    .line 126
    :cond_2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 127
    .line 128
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v0, p3, p3, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 132
    .line 133
    iget v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->c:I

    .line 134
    .line 135
    if-eqz v0, :cond_5

    .line 136
    .line 137
    iget v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->h:F

    .line 138
    .line 139
    cmpl-float v0, v0, v1

    .line 140
    .line 141
    if-lez v0, :cond_5

    .line 142
    .line 143
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 144
    .line 145
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->L:Landroid/graphics/Paint;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v0, p3, p3, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 149
    goto :goto_1

    .line 150
    .line 151
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 152
    .line 153
    iget v3, p2, Landroid/graphics/PointF;->x:F

    .line 154
    float-to-int v4, p3

    .line 155
    int-to-float v4, v4

    .line 156
    .line 157
    sub-float v5, v3, v4

    .line 158
    .line 159
    iput v5, v0, Landroid/graphics/RectF;->left:F

    .line 160
    .line 161
    iget v5, p2, Landroid/graphics/PointF;->y:F

    .line 162
    .line 163
    sub-float v6, v5, v4

    .line 164
    .line 165
    iput v6, v0, Landroid/graphics/RectF;->top:F

    .line 166
    .line 167
    add-float v6, v3, v4

    .line 168
    .line 169
    iput v6, v0, Landroid/graphics/RectF;->right:F

    .line 170
    add-float/2addr v4, v5

    .line 171
    .line 172
    iput v4, v0, Landroid/graphics/RectF;->bottom:F

    .line 173
    .line 174
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->e:Landroid/graphics/drawable/Drawable;

    .line 175
    .line 176
    if-eqz v0, :cond_4

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->o(Landroid/graphics/Canvas;)V

    .line 180
    goto :goto_1

    .line 181
    .line 182
    :cond_4
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v3, v5, p3, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 186
    .line 187
    iget v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->c:I

    .line 188
    .line 189
    if-eqz v0, :cond_5

    .line 190
    .line 191
    iget v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->h:F

    .line 192
    .line 193
    cmpl-float v0, v0, v1

    .line 194
    .line 195
    if-lez v0, :cond_5

    .line 196
    .line 197
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 198
    .line 199
    iget v1, p2, Landroid/graphics/PointF;->y:F

    .line 200
    .line 201
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->L:Landroid/graphics/Paint;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, v0, v1, p3, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 205
    .line 206
    :cond_5
    :goto_1
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    .line 210
    move-result p3

    .line 211
    .line 212
    if-nez p3, :cond_6

    .line 213
    .line 214
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 215
    .line 216
    iget p2, p2, Landroid/graphics/PointF;->x:F

    .line 217
    .line 218
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 219
    .line 220
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 221
    .line 222
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 223
    add-float/2addr v1, v0

    .line 224
    .line 225
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->A:Landroid/graphics/Paint$FontMetrics;

    .line 226
    .line 227
    iget v3, v0, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 228
    sub-float/2addr v1, v3

    .line 229
    .line 230
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 231
    sub-float/2addr v1, v0

    .line 232
    div-float/2addr v1, v2

    .line 233
    .line 234
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, p3, p2, v1, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 238
    :cond_6
    :goto_2
    return-void
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
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
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
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
.end method

.method public final o(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1, v1, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 10
    .line 11
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 12
    float-to-int v1, v1

    .line 13
    .line 14
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 15
    float-to-int v2, v2

    .line 16
    .line 17
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 18
    float-to-int v3, v3

    .line 19
    .line 20
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 21
    float-to-int v0, v0

    .line 22
    .line 23
    iget-boolean v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->g:Z

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f:Landroid/graphics/Bitmap;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 31
    move-result v0

    .line 32
    .line 33
    add-int v3, v1, v0

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f:Landroid/graphics/Bitmap;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v2

    .line 41
    int-to-float v5, v1

    .line 42
    int-to-float v6, v2

    .line 43
    int-to-float v7, v3

    .line 44
    int-to-float v8, v0

    .line 45
    const/4 v9, 0x0

    .line 46
    .line 47
    const/16 v10, 0x1f

    .line 48
    move-object v4, p1

    .line 49
    .line 50
    .line 51
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-object v4, p1

    .line 54
    .line 55
    :goto_0
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->e:Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 59
    .line 60
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->e:Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 64
    .line 65
    iget-boolean p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->g:Z

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 70
    .line 71
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 72
    .line 73
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    .line 74
    .line 75
    .line 76
    invoke-direct {v0, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 80
    .line 81
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f:Landroid/graphics/Bitmap;

    .line 82
    int-to-float v0, v1

    .line 83
    int-to-float v1, v2

    .line 84
    .line 85
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4}, Landroid/graphics/Canvas;->restore()V

    .line 92
    .line 93
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 94
    const/4 v0, 0x0

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 98
    .line 99
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 103
    move-result p1

    .line 104
    .line 105
    const/high16 v0, 0x40000000    # 2.0f

    .line 106
    .line 107
    if-nez p1, :cond_2

    .line 108
    .line 109
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 113
    move-result p1

    .line 114
    const/4 v1, 0x1

    .line 115
    .line 116
    if-ne p1, v1, :cond_1

    .line 117
    goto :goto_1

    .line 118
    .line 119
    :cond_1
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 123
    move-result v1

    .line 124
    div-float/2addr v1, v0

    .line 125
    .line 126
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 130
    move-result v2

    .line 131
    div-float/2addr v2, v0

    .line 132
    .line 133
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->L:Landroid/graphics/Paint;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, p1, v1, v2, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 137
    return-void

    .line 138
    .line 139
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    .line 143
    move-result p1

    .line 144
    .line 145
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 149
    move-result v1

    .line 150
    .line 151
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 155
    move-result v2

    .line 156
    div-float/2addr v2, v0

    .line 157
    .line 158
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->L:Landroid/graphics/Paint;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4, p1, v1, v2, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 162
    return-void

    .line 163
    .line 164
    :cond_3
    iget-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 165
    .line 166
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->L:Landroid/graphics/Paint;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, p1, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 170
    return-void
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
.end method

.method public onAttachedToWindow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->N:Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->G:Landroid/view/View;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->s(Landroid/view/View;)V

    .line 13
    :cond_0
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->M:Lzw/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->M:Lzw/b;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lzw/b;->b(Landroid/graphics/Canvas;)V

    .line 16
    return-void

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->v()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->getBadgeCircleRadius()F

    .line 27
    move-result v0

    .line 28
    .line 29
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->t:F

    .line 30
    .line 31
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v3}, Lzw/e;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 37
    move-result v2

    .line 38
    .line 39
    iget v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->u:F

    .line 40
    div-float/2addr v2, v3

    .line 41
    .line 42
    const/high16 v3, 0x3f800000    # 1.0f

    .line 43
    sub-float/2addr v3, v2

    .line 44
    mul-float/2addr v1, v3

    .line 45
    .line 46
    iget-boolean v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->m:Z

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    iget-boolean v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->n:Z

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 55
    .line 56
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v3}, Lzw/e;->c(Landroid/graphics/PointF;Landroid/graphics/PointF;)I

    .line 60
    move-result v2

    .line 61
    .line 62
    iput v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->v:I

    .line 63
    .line 64
    iget-boolean v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->p:Z

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v2}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->E(Z)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v3}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 77
    move-result v2

    .line 78
    int-to-float v2, v2

    .line 79
    .line 80
    cmpg-float v2, v1, v2

    .line 81
    .line 82
    if-gez v2, :cond_1

    .line 83
    const/4 v2, 0x1

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    const/4 v2, 0x0

    .line 86
    .line 87
    :goto_0
    iput-boolean v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->w:Z

    .line 88
    .line 89
    if-eqz v2, :cond_2

    .line 90
    const/4 v1, 0x3

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F(I)V

    .line 94
    .line 95
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p1, v1, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->n(Landroid/graphics/Canvas;Landroid/graphics/PointF;F)V

    .line 99
    return-void

    .line 100
    :cond_2
    const/4 v2, 0x2

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v2}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p1, v1, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->p(Landroid/graphics/Canvas;FF)V

    .line 107
    .line 108
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, p1, v1, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->n(Landroid/graphics/Canvas;Landroid/graphics/PointF;F)V

    .line 112
    return-void

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r()V

    .line 116
    .line 117
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p1, v1, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->n(Landroid/graphics/Canvas;Landroid/graphics/PointF;F)V

    .line 121
    :cond_4
    return-void
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
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 4
    .line 5
    iput p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->H:I

    .line 6
    .line 7
    iput p2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->I:I

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
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    const/4 v3, 0x2

    .line 12
    .line 13
    if-eq v0, v3, :cond_0

    .line 14
    const/4 v3, 0x3

    .line 15
    .line 16
    if-eq v0, v3, :cond_1

    .line 17
    const/4 v3, 0x5

    .line 18
    .line 19
    if-eq v0, v3, :cond_2

    .line 20
    const/4 v3, 0x6

    .line 21
    .line 22
    if-eq v0, v3, :cond_1

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->n:Z

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 34
    move-result v3

    .line 35
    .line 36
    iput v3, v0, Landroid/graphics/PointF;->x:F

    .line 37
    .line 38
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 42
    move-result v3

    .line 43
    .line 44
    iput v3, v0, Landroid/graphics/PointF;->y:F

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 53
    move-result v0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 57
    move-result v0

    .line 58
    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    iget-boolean v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->n:Z

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    iput-boolean v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->n:Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y()V

    .line 69
    goto :goto_0

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 73
    move-result v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 77
    move-result v3

    .line 78
    .line 79
    iget-boolean v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->m:Z

    .line 80
    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 85
    move-result v4

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 89
    move-result v4

    .line 90
    .line 91
    if-nez v4, :cond_3

    .line 92
    .line 93
    iget-object v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 94
    .line 95
    iget v5, v4, Landroid/graphics/RectF;->left:F

    .line 96
    .line 97
    cmpl-float v5, v0, v5

    .line 98
    .line 99
    if-lez v5, :cond_3

    .line 100
    .line 101
    iget v5, v4, Landroid/graphics/RectF;->right:F

    .line 102
    .line 103
    cmpg-float v0, v0, v5

    .line 104
    .line 105
    if-gez v0, :cond_3

    .line 106
    .line 107
    iget v0, v4, Landroid/graphics/RectF;->top:F

    .line 108
    .line 109
    cmpl-float v0, v3, v0

    .line 110
    .line 111
    if-lez v0, :cond_3

    .line 112
    .line 113
    iget v0, v4, Landroid/graphics/RectF;->bottom:F

    .line 114
    .line 115
    cmpg-float v0, v3, v0

    .line 116
    .line 117
    if-gez v0, :cond_3

    .line 118
    .line 119
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 120
    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->w()V

    .line 125
    .line 126
    iput-boolean v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->n:Z

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v2}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    const/high16 v3, 0x40e00000    # 7.0f

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v3}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 139
    move-result v0

    .line 140
    int-to-float v0, v0

    .line 141
    .line 142
    iput v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->t:F

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 146
    move-result-object v0

    .line 147
    .line 148
    .line 149
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v2}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->A(Z)V

    .line 153
    .line 154
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 158
    move-result v3

    .line 159
    .line 160
    iput v3, v0, Landroid/graphics/PointF;->x:F

    .line 161
    .line 162
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 166
    move-result v3

    .line 167
    .line 168
    iput v3, v0, Landroid/graphics/PointF;->y:F

    .line 169
    .line 170
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->n:Z

    .line 171
    .line 172
    if-nez v0, :cond_5

    .line 173
    .line 174
    .line 175
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 176
    move-result p1

    .line 177
    .line 178
    if-eqz p1, :cond_4

    .line 179
    goto :goto_1

    .line 180
    :cond_4
    return v1

    .line 181
    :cond_5
    :goto_1
    return v2
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
.end method

.method public final p(Landroid/graphics/Canvas;FF)V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 3
    .line 4
    iget v1, v0, Landroid/graphics/PointF;->y:F

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 7
    .line 8
    iget v3, v2, Landroid/graphics/PointF;->y:F

    .line 9
    sub-float/2addr v1, v3

    .line 10
    .line 11
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 12
    .line 13
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 14
    sub-float/2addr v0, v2

    .line 15
    .line 16
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 17
    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    cmpl-float v3, v0, v2

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    div-float/2addr v1, v0

    .line 26
    float-to-double v0, v1

    .line 27
    .line 28
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 29
    div-double/2addr v3, v0

    .line 30
    .line 31
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    iget-object v5, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p3, v1, v5}, Lzw/e;->a(Landroid/graphics/PointF;FLjava/lang/Double;Ljava/util/List;)V

    .line 41
    .line 42
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 49
    .line 50
    .line 51
    invoke-static {p3, p2, v0, v1}, Lzw/e;->a(Landroid/graphics/PointF;FLjava/lang/Double;Ljava/util/List;)V

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 55
    .line 56
    const-wide/16 v3, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    iget-object v5, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 63
    .line 64
    .line 65
    invoke-static {v0, p3, v1, v5}, Lzw/e;->a(Landroid/graphics/PointF;FLjava/lang/Double;Ljava/util/List;)V

    .line 66
    .line 67
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 68
    .line 69
    .line 70
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 74
    .line 75
    .line 76
    invoke-static {p3, p2, v0, v1}, Lzw/e;->a(Landroid/graphics/PointF;FLjava/lang/Double;Ljava/util/List;)V

    .line 77
    .line 78
    :goto_0
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    .line 82
    .line 83
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 84
    .line 85
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 86
    .line 87
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 88
    .line 89
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 90
    .line 91
    iget v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->v:I

    .line 92
    const/4 v4, 0x1

    .line 93
    const/4 v5, 0x2

    .line 94
    .line 95
    if-eq v3, v4, :cond_2

    .line 96
    .line 97
    if-ne v3, v5, :cond_1

    .line 98
    goto :goto_1

    .line 99
    .line 100
    :cond_1
    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 101
    goto :goto_2

    .line 102
    .line 103
    :cond_2
    :goto_1
    sget-object v3, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 104
    .line 105
    .line 106
    :goto_2
    invoke-virtual {p3, v1, v0, p2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 107
    .line 108
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->E:Landroid/graphics/PointF;

    .line 109
    .line 110
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 111
    .line 112
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 113
    .line 114
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 115
    .line 116
    iget v6, v3, Landroid/graphics/PointF;->x:F

    .line 117
    add-float/2addr v1, v6

    .line 118
    .line 119
    const/high16 v6, 0x40000000    # 2.0f

    .line 120
    div-float/2addr v1, v6

    .line 121
    .line 122
    iput v1, p3, Landroid/graphics/PointF;->x:F

    .line 123
    .line 124
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 125
    .line 126
    iget v1, v3, Landroid/graphics/PointF;->y:F

    .line 127
    add-float/2addr v0, v1

    .line 128
    div-float/2addr v0, v6

    .line 129
    .line 130
    iput v0, p3, Landroid/graphics/PointF;->y:F

    .line 131
    .line 132
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 133
    .line 134
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    check-cast v0, Landroid/graphics/PointF;

    .line 141
    .line 142
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 143
    .line 144
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 145
    .line 146
    .line 147
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    check-cast v1, Landroid/graphics/PointF;

    .line 151
    .line 152
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 153
    .line 154
    .line 155
    invoke-virtual {p3, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 156
    .line 157
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 158
    .line 159
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->E:Landroid/graphics/PointF;

    .line 160
    .line 161
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 162
    .line 163
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 164
    .line 165
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 166
    const/4 v6, 0x0

    .line 167
    .line 168
    .line 169
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    move-result-object v3

    .line 171
    .line 172
    check-cast v3, Landroid/graphics/PointF;

    .line 173
    .line 174
    iget v3, v3, Landroid/graphics/PointF;->x:F

    .line 175
    .line 176
    iget-object v7, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 177
    .line 178
    .line 179
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 180
    move-result-object v7

    .line 181
    .line 182
    check-cast v7, Landroid/graphics/PointF;

    .line 183
    .line 184
    iget v7, v7, Landroid/graphics/PointF;->y:F

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3, v1, v0, v3, v7}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 188
    .line 189
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 190
    .line 191
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 192
    .line 193
    .line 194
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    move-result-object v0

    .line 196
    .line 197
    check-cast v0, Landroid/graphics/PointF;

    .line 198
    .line 199
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 200
    .line 201
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 202
    .line 203
    .line 204
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 205
    move-result-object v1

    .line 206
    .line 207
    check-cast v1, Landroid/graphics/PointF;

    .line 208
    .line 209
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 210
    .line 211
    .line 212
    invoke-virtual {p3, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 213
    .line 214
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 215
    .line 216
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->E:Landroid/graphics/PointF;

    .line 217
    .line 218
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 219
    .line 220
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 221
    .line 222
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 223
    const/4 v7, 0x3

    .line 224
    .line 225
    .line 226
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 227
    move-result-object v3

    .line 228
    .line 229
    check-cast v3, Landroid/graphics/PointF;

    .line 230
    .line 231
    iget v3, v3, Landroid/graphics/PointF;->x:F

    .line 232
    .line 233
    iget-object v8, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 234
    .line 235
    .line 236
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 237
    move-result-object v8

    .line 238
    .line 239
    check-cast v8, Landroid/graphics/PointF;

    .line 240
    .line 241
    iget v8, v8, Landroid/graphics/PointF;->y:F

    .line 242
    .line 243
    .line 244
    invoke-virtual {p3, v1, v0, v3, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 245
    .line 246
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 247
    .line 248
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 249
    .line 250
    .line 251
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 252
    move-result-object v0

    .line 253
    .line 254
    check-cast v0, Landroid/graphics/PointF;

    .line 255
    .line 256
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 257
    .line 258
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 259
    .line 260
    .line 261
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    move-result-object v1

    .line 263
    .line 264
    check-cast v1, Landroid/graphics/PointF;

    .line 265
    .line 266
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 267
    .line 268
    .line 269
    invoke-virtual {p3, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 270
    .line 271
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 272
    .line 273
    .line 274
    invoke-virtual {p3}, Landroid/graphics/Path;->close()V

    .line 275
    .line 276
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 277
    .line 278
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, p3, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 282
    .line 283
    iget p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->c:I

    .line 284
    .line 285
    if-eqz p3, :cond_6

    .line 286
    .line 287
    iget p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->h:F

    .line 288
    .line 289
    cmpl-float p3, p3, v2

    .line 290
    .line 291
    if-lez p3, :cond_6

    .line 292
    .line 293
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    .line 297
    .line 298
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 299
    .line 300
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 301
    .line 302
    .line 303
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    move-result-object v0

    .line 305
    .line 306
    check-cast v0, Landroid/graphics/PointF;

    .line 307
    .line 308
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 309
    .line 310
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 311
    .line 312
    .line 313
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 314
    move-result-object v1

    .line 315
    .line 316
    check-cast v1, Landroid/graphics/PointF;

    .line 317
    .line 318
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 319
    .line 320
    .line 321
    invoke-virtual {p3, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 322
    .line 323
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 324
    .line 325
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->E:Landroid/graphics/PointF;

    .line 326
    .line 327
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 328
    .line 329
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 330
    .line 331
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 332
    .line 333
    .line 334
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 335
    move-result-object v2

    .line 336
    .line 337
    check-cast v2, Landroid/graphics/PointF;

    .line 338
    .line 339
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 340
    .line 341
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 342
    .line 343
    .line 344
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 345
    move-result-object v3

    .line 346
    .line 347
    check-cast v3, Landroid/graphics/PointF;

    .line 348
    .line 349
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 350
    .line 351
    .line 352
    invoke-virtual {p3, v1, v0, v2, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 353
    .line 354
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 355
    .line 356
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 357
    .line 358
    .line 359
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 360
    move-result-object v0

    .line 361
    .line 362
    check-cast v0, Landroid/graphics/PointF;

    .line 363
    .line 364
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 365
    .line 366
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 367
    .line 368
    .line 369
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 370
    move-result-object v1

    .line 371
    .line 372
    check-cast v1, Landroid/graphics/PointF;

    .line 373
    .line 374
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 375
    .line 376
    .line 377
    invoke-virtual {p3, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 378
    .line 379
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 380
    .line 381
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->E:Landroid/graphics/PointF;

    .line 382
    .line 383
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 384
    .line 385
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 386
    .line 387
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 388
    .line 389
    .line 390
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 391
    move-result-object v2

    .line 392
    .line 393
    check-cast v2, Landroid/graphics/PointF;

    .line 394
    .line 395
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 396
    .line 397
    iget-object v3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 398
    .line 399
    .line 400
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 401
    move-result-object v3

    .line 402
    .line 403
    check-cast v3, Landroid/graphics/PointF;

    .line 404
    .line 405
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 406
    .line 407
    .line 408
    invoke-virtual {p3, v1, v0, v2, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 409
    .line 410
    iget p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->v:I

    .line 411
    .line 412
    if-eq p3, v4, :cond_4

    .line 413
    .line 414
    if-ne p3, v5, :cond_3

    .line 415
    goto :goto_4

    .line 416
    .line 417
    :cond_3
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 418
    .line 419
    .line 420
    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 421
    move-result-object p3

    .line 422
    .line 423
    check-cast p3, Landroid/graphics/PointF;

    .line 424
    .line 425
    iget p3, p3, Landroid/graphics/PointF;->x:F

    .line 426
    .line 427
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 428
    .line 429
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 430
    sub-float/2addr p3, v1

    .line 431
    .line 432
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 433
    .line 434
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 435
    .line 436
    .line 437
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 438
    move-result-object v1

    .line 439
    .line 440
    check-cast v1, Landroid/graphics/PointF;

    .line 441
    .line 442
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 443
    :goto_3
    sub-float/2addr v0, v1

    .line 444
    goto :goto_5

    .line 445
    .line 446
    :cond_4
    :goto_4
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 447
    .line 448
    .line 449
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 450
    move-result-object p3

    .line 451
    .line 452
    check-cast p3, Landroid/graphics/PointF;

    .line 453
    .line 454
    iget p3, p3, Landroid/graphics/PointF;->x:F

    .line 455
    .line 456
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 457
    .line 458
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 459
    sub-float/2addr p3, v1

    .line 460
    .line 461
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 462
    .line 463
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 464
    .line 465
    .line 466
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 467
    move-result-object v1

    .line 468
    .line 469
    check-cast v1, Landroid/graphics/PointF;

    .line 470
    .line 471
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 472
    goto :goto_3

    .line 473
    :goto_5
    div-float/2addr v0, p3

    .line 474
    float-to-double v0, v0

    .line 475
    .line 476
    .line 477
    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    .line 478
    move-result-wide v0

    .line 479
    .line 480
    iget p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->v:I

    .line 481
    .line 482
    add-int/lit8 v2, p3, -0x1

    .line 483
    .line 484
    if-nez v2, :cond_5

    .line 485
    const/4 p3, 0x4

    .line 486
    goto :goto_6

    .line 487
    :cond_5
    sub-int/2addr p3, v4

    .line 488
    .line 489
    .line 490
    :goto_6
    invoke-static {v0, v1, p3}, Lzw/e;->d(DI)D

    .line 491
    move-result-wide v0

    .line 492
    .line 493
    .line 494
    invoke-static {v0, v1}, Lzw/e;->e(D)D

    .line 495
    move-result-wide v0

    .line 496
    double-to-float p3, v0

    .line 497
    .line 498
    const/high16 v0, 0x43b40000    # 360.0f

    .line 499
    .line 500
    sub-float v6, v0, p3

    .line 501
    .line 502
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 503
    .line 504
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 505
    .line 506
    iget v0, p3, Landroid/graphics/PointF;->x:F

    .line 507
    .line 508
    sub-float v2, v0, p2

    .line 509
    .line 510
    iget p3, p3, Landroid/graphics/PointF;->y:F

    .line 511
    .line 512
    sub-float v3, p3, p2

    .line 513
    .line 514
    add-float v4, v0, p2

    .line 515
    .line 516
    add-float v5, p3, p2

    .line 517
    .line 518
    const/high16 v7, 0x43340000    # 180.0f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->addArc(FFFFFF)V

    .line 522
    .line 523
    iget-object p2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 524
    .line 525
    iget-object p3, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->L:Landroid/graphics/Paint;

    .line 526
    .line 527
    .line 528
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 529
    :cond_6
    return-void
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
.end method

.method public final q(Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    instance-of v0, v0, Landroid/view/View;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    check-cast p1, Landroid/view/View;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->q(Landroid/view/View;)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    check-cast p1, Landroid/view/ViewGroup;

    .line 31
    .line 32
    iput-object p1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->N:Landroid/view/ViewGroup;

    .line 33
    :cond_1
    return-void
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
.end method

.method public final r()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 12
    move-result v1

    .line 13
    .line 14
    cmpl-float v0, v0, v1

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 29
    move-result v0

    .line 30
    .line 31
    :goto_0
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->q:I

    .line 32
    const/4 v2, 0x1

    .line 33
    .line 34
    const/high16 v3, 0x40000000    # 2.0f

    .line 35
    .line 36
    .line 37
    sparse-switch v1, :sswitch_data_0

    .line 38
    .line 39
    goto/16 :goto_7

    .line 40
    .line 41
    .line 42
    :sswitch_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 43
    move-result v1

    .line 44
    .line 45
    if-ne v1, v2, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 48
    .line 49
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 50
    .line 51
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 52
    add-float/2addr v2, v4

    .line 53
    div-float/2addr v0, v3

    .line 54
    add-float/2addr v2, v0

    .line 55
    .line 56
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_1
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 60
    .line 61
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->H:I

    .line 62
    int-to-float v2, v2

    .line 63
    .line 64
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 65
    .line 66
    iget v5, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 67
    add-float/2addr v4, v5

    .line 68
    div-float/2addr v0, v3

    .line 69
    add-float/2addr v4, v0

    .line 70
    sub-float/2addr v2, v4

    .line 71
    .line 72
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 73
    .line 74
    :goto_1
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 75
    .line 76
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->I:I

    .line 77
    int-to-float v1, v1

    .line 78
    .line 79
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->s:F

    .line 80
    .line 81
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 82
    add-float/2addr v2, v4

    .line 83
    .line 84
    iget-object v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 88
    move-result v4

    .line 89
    div-float/2addr v4, v3

    .line 90
    add-float/2addr v2, v4

    .line 91
    sub-float/2addr v1, v2

    .line 92
    .line 93
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 94
    .line 95
    goto/16 :goto_7

    .line 96
    .line 97
    .line 98
    :sswitch_1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 99
    move-result v1

    .line 100
    .line 101
    if-ne v1, v2, :cond_2

    .line 102
    .line 103
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 104
    .line 105
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->H:I

    .line 106
    int-to-float v2, v2

    .line 107
    .line 108
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 109
    .line 110
    iget v5, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 111
    add-float/2addr v4, v5

    .line 112
    div-float/2addr v0, v3

    .line 113
    add-float/2addr v4, v0

    .line 114
    sub-float/2addr v2, v4

    .line 115
    .line 116
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 117
    goto :goto_2

    .line 118
    .line 119
    :cond_2
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 120
    .line 121
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 122
    .line 123
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 124
    add-float/2addr v2, v4

    .line 125
    div-float/2addr v0, v3

    .line 126
    add-float/2addr v2, v0

    .line 127
    .line 128
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 129
    .line 130
    :goto_2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 131
    .line 132
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->I:I

    .line 133
    int-to-float v1, v1

    .line 134
    .line 135
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->s:F

    .line 136
    .line 137
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 138
    add-float/2addr v2, v4

    .line 139
    .line 140
    iget-object v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 144
    move-result v4

    .line 145
    div-float/2addr v4, v3

    .line 146
    add-float/2addr v2, v4

    .line 147
    sub-float/2addr v1, v2

    .line 148
    .line 149
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 150
    .line 151
    goto/16 :goto_7

    .line 152
    .line 153
    .line 154
    :sswitch_2
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 155
    move-result v1

    .line 156
    .line 157
    if-ne v1, v2, :cond_3

    .line 158
    .line 159
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 160
    .line 161
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 162
    .line 163
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 164
    add-float/2addr v2, v4

    .line 165
    div-float/2addr v0, v3

    .line 166
    add-float/2addr v2, v0

    .line 167
    .line 168
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 169
    goto :goto_3

    .line 170
    .line 171
    :cond_3
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 172
    .line 173
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->H:I

    .line 174
    int-to-float v2, v2

    .line 175
    .line 176
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 177
    .line 178
    iget v5, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 179
    add-float/2addr v4, v5

    .line 180
    div-float/2addr v0, v3

    .line 181
    add-float/2addr v4, v0

    .line 182
    sub-float/2addr v2, v4

    .line 183
    .line 184
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 185
    .line 186
    :goto_3
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 187
    .line 188
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->s:F

    .line 189
    .line 190
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 191
    add-float/2addr v1, v2

    .line 192
    .line 193
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 197
    move-result v2

    .line 198
    div-float/2addr v2, v3

    .line 199
    add-float/2addr v1, v2

    .line 200
    .line 201
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 202
    .line 203
    goto/16 :goto_7

    .line 204
    .line 205
    .line 206
    :sswitch_3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 207
    move-result v1

    .line 208
    .line 209
    if-ne v1, v2, :cond_4

    .line 210
    .line 211
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 212
    .line 213
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->H:I

    .line 214
    int-to-float v2, v2

    .line 215
    .line 216
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 217
    .line 218
    iget v5, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 219
    add-float/2addr v4, v5

    .line 220
    div-float/2addr v0, v3

    .line 221
    add-float/2addr v4, v0

    .line 222
    sub-float/2addr v2, v4

    .line 223
    .line 224
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 225
    goto :goto_4

    .line 226
    .line 227
    :cond_4
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 228
    .line 229
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 230
    .line 231
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 232
    add-float/2addr v2, v4

    .line 233
    div-float/2addr v0, v3

    .line 234
    add-float/2addr v2, v0

    .line 235
    .line 236
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 237
    .line 238
    :goto_4
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 239
    .line 240
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->s:F

    .line 241
    .line 242
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 243
    add-float/2addr v1, v2

    .line 244
    .line 245
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 249
    move-result v2

    .line 250
    div-float/2addr v2, v3

    .line 251
    add-float/2addr v1, v2

    .line 252
    .line 253
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 254
    .line 255
    goto/16 :goto_7

    .line 256
    .line 257
    .line 258
    :sswitch_4
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 259
    move-result v1

    .line 260
    .line 261
    if-ne v1, v2, :cond_5

    .line 262
    .line 263
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 264
    .line 265
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 266
    .line 267
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 268
    add-float/2addr v2, v4

    .line 269
    div-float/2addr v0, v3

    .line 270
    add-float/2addr v2, v0

    .line 271
    .line 272
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 273
    goto :goto_5

    .line 274
    .line 275
    :cond_5
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 276
    .line 277
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->H:I

    .line 278
    int-to-float v2, v2

    .line 279
    .line 280
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 281
    .line 282
    iget v5, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 283
    add-float/2addr v4, v5

    .line 284
    div-float/2addr v0, v3

    .line 285
    add-float/2addr v4, v0

    .line 286
    sub-float/2addr v2, v4

    .line 287
    .line 288
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 289
    .line 290
    :goto_5
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 291
    .line 292
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->I:I

    .line 293
    int-to-float v1, v1

    .line 294
    div-float/2addr v1, v3

    .line 295
    .line 296
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 297
    goto :goto_7

    .line 298
    .line 299
    .line 300
    :sswitch_5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 301
    move-result v1

    .line 302
    .line 303
    if-ne v1, v2, :cond_6

    .line 304
    .line 305
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 306
    .line 307
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->H:I

    .line 308
    int-to-float v2, v2

    .line 309
    .line 310
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 311
    .line 312
    iget v5, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 313
    add-float/2addr v4, v5

    .line 314
    div-float/2addr v0, v3

    .line 315
    add-float/2addr v4, v0

    .line 316
    sub-float/2addr v2, v4

    .line 317
    .line 318
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 319
    goto :goto_6

    .line 320
    .line 321
    :cond_6
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 322
    .line 323
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 324
    .line 325
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 326
    add-float/2addr v2, v4

    .line 327
    div-float/2addr v0, v3

    .line 328
    add-float/2addr v2, v0

    .line 329
    .line 330
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 331
    .line 332
    :goto_6
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 333
    .line 334
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->I:I

    .line 335
    int-to-float v1, v1

    .line 336
    div-float/2addr v1, v3

    .line 337
    .line 338
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 339
    goto :goto_7

    .line 340
    .line 341
    :sswitch_6
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 342
    .line 343
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->H:I

    .line 344
    int-to-float v1, v1

    .line 345
    div-float/2addr v1, v3

    .line 346
    .line 347
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 348
    .line 349
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->I:I

    .line 350
    int-to-float v1, v1

    .line 351
    .line 352
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->s:F

    .line 353
    .line 354
    iget v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 355
    add-float/2addr v2, v4

    .line 356
    .line 357
    iget-object v4, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 361
    move-result v4

    .line 362
    div-float/2addr v4, v3

    .line 363
    add-float/2addr v2, v4

    .line 364
    sub-float/2addr v1, v2

    .line 365
    .line 366
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 367
    goto :goto_7

    .line 368
    .line 369
    :sswitch_7
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 370
    .line 371
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->H:I

    .line 372
    int-to-float v1, v1

    .line 373
    div-float/2addr v1, v3

    .line 374
    .line 375
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 376
    .line 377
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->s:F

    .line 378
    .line 379
    iget v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 380
    add-float/2addr v1, v2

    .line 381
    .line 382
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 386
    move-result v2

    .line 387
    div-float/2addr v2, v3

    .line 388
    add-float/2addr v1, v2

    .line 389
    .line 390
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 391
    goto :goto_7

    .line 392
    .line 393
    :sswitch_8
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 394
    .line 395
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->H:I

    .line 396
    int-to-float v1, v1

    .line 397
    div-float/2addr v1, v3

    .line 398
    .line 399
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 400
    .line 401
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->I:I

    .line 402
    int-to-float v1, v1

    .line 403
    div-float/2addr v1, v3

    .line 404
    .line 405
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 406
    .line 407
    .line 408
    :goto_7
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->w()V

    .line 409
    return-void

    .line 410
    nop

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
    :sswitch_data_0
    .sparse-switch
        0x11 -> :sswitch_8
        0x31 -> :sswitch_7
        0x51 -> :sswitch_6
        0x800013 -> :sswitch_5
        0x800015 -> :sswitch_4
        0x800033 -> :sswitch_3
        0x800035 -> :sswitch_2
        0x800053 -> :sswitch_1
        0x800055 -> :sswitch_0
    .end sparse-switch
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
.end method

.method public final s(Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->N:Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->q(Landroid/view/View;)V

    .line 14
    :cond_0
    return-void
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
.end method

.method public final t(Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView$BadgeContainer;ILandroidx/constraintlayout/widget/ConstraintLayout;)Landroidx/constraintlayout/widget/ConstraintSet;
    .locals 5

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintSet;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/constraintlayout/widget/ConstraintSet;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 9
    move-result v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1}, Landroid/view/View;->setId(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p3}, Landroidx/constraintlayout/widget/ConstraintSet;->clone(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    move-result p1

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    :goto_0
    if-ge v2, p1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 30
    move-result v3

    .line 31
    const/4 v4, -0x1

    .line 32
    .line 33
    if-ne v3, v4, :cond_0

    .line 34
    goto :goto_1

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintSet;->getParameters(I)Landroidx/constraintlayout/widget/ConstraintSet$Constraint;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    iget-object v3, v3, Landroidx/constraintlayout/widget/ConstraintSet$Constraint;->layout:Landroidx/constraintlayout/widget/ConstraintSet$Layout;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1, p2, v3}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->k(IILandroidx/constraintlayout/widget/ConstraintSet$Layout;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception p1

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    return-object v0

    .line 50
    .line 51
    .line 52
    :goto_2
    invoke-static {p1}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 53
    const/4 p1, 0x0

    .line 54
    return-object p1
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
.end method

.method public final u()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 13
    .line 14
    new-instance v0, Landroid/graphics/RectF;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->y:Landroid/graphics/RectF;

    .line 20
    .line 21
    new-instance v0, Landroid/graphics/Path;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z:Landroid/graphics/Path;

    .line 27
    .line 28
    new-instance v0, Landroid/graphics/PointF;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 32
    .line 33
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 34
    .line 35
    new-instance v0, Landroid/graphics/PointF;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 39
    .line 40
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 41
    .line 42
    new-instance v0, Landroid/graphics/PointF;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 46
    .line 47
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 48
    .line 49
    new-instance v0, Landroid/graphics/PointF;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 53
    .line 54
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->E:Landroid/graphics/PointF;

    .line 55
    .line 56
    new-instance v0, Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F:Ljava/util/List;

    .line 62
    .line 63
    new-instance v0, Landroid/text/TextPaint;

    .line 64
    .line 65
    .line 66
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 67
    .line 68
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 72
    .line 73
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    .line 77
    .line 78
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 82
    .line 83
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 84
    .line 85
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    .line 86
    .line 87
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 88
    .line 89
    .line 90
    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 94
    .line 95
    new-instance v0, Landroid/graphics/Paint;

    .line 96
    .line 97
    .line 98
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 99
    .line 100
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 104
    .line 105
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 106
    .line 107
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 111
    .line 112
    new-instance v0, Landroid/graphics/Paint;

    .line 113
    .line 114
    .line 115
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 116
    .line 117
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->L:Landroid/graphics/Paint;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 121
    .line 122
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->L:Landroid/graphics/Paint;

    .line 123
    .line 124
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 128
    .line 129
    .line 130
    const v0, -0x17b1c0

    .line 131
    .line 132
    iput v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->b:I

    .line 133
    const/4 v0, -0x1

    .line 134
    .line 135
    iput v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->d:I

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    const/high16 v2, 0x41300000    # 11.0f

    .line 142
    .line 143
    .line 144
    invoke-static {v0, v2}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 145
    move-result v0

    .line 146
    int-to-float v0, v0

    .line 147
    .line 148
    iput v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->i:F

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 152
    move-result-object v0

    .line 153
    .line 154
    const/high16 v2, 0x40a00000    # 5.0f

    .line 155
    .line 156
    .line 157
    invoke-static {v0, v2}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 158
    move-result v0

    .line 159
    int-to-float v0, v0

    .line 160
    .line 161
    iput v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j:F

    .line 162
    const/4 v0, 0x0

    .line 163
    .line 164
    iput v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->k:I

    .line 165
    .line 166
    .line 167
    const v2, 0x800035

    .line 168
    .line 169
    iput v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->q:I

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 173
    move-result-object v2

    .line 174
    .line 175
    const/high16 v3, 0x3f800000    # 1.0f

    .line 176
    .line 177
    .line 178
    invoke-static {v2, v3}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 179
    move-result v2

    .line 180
    int-to-float v2, v2

    .line 181
    .line 182
    iput v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->r:F

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 186
    move-result-object v2

    .line 187
    .line 188
    .line 189
    invoke-static {v2, v3}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 190
    move-result v2

    .line 191
    int-to-float v2, v2

    .line 192
    .line 193
    iput v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->s:F

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 197
    move-result-object v2

    .line 198
    .line 199
    const/high16 v3, 0x42b40000    # 90.0f

    .line 200
    .line 201
    .line 202
    invoke-static {v2, v3}, Lzw/d;->a(Landroid/content/Context;F)I

    .line 203
    move-result v2

    .line 204
    int-to-float v2, v2

    .line 205
    .line 206
    iput v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->u:F

    .line 207
    .line 208
    iput-boolean v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->p:Z

    .line 209
    .line 210
    iput-boolean v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->g:Z

    .line 211
    .line 212
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationZ(F)V

    .line 216
    return-void
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
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
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
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
.end method

.method public final v()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->p:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->E(Z)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->K:Landroid/graphics/Paint;

    .line 8
    .line 9
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->b:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->L:Landroid/graphics/Paint;

    .line 15
    .line 16
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->c:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->L:Landroid/graphics/Paint;

    .line 22
    .line 23
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->h:F

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 27
    .line 28
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 29
    .line 30
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->d:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 36
    .line 37
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 41
    return-void
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
.end method

.method public final w()V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->D:Landroid/graphics/PointF;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->B:Landroid/graphics/PointF;

    .line 11
    .line 12
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 13
    const/4 v4, 0x0

    .line 14
    .line 15
    aget v4, v0, v4

    .line 16
    int-to-float v4, v4

    .line 17
    add-float/2addr v3, v4

    .line 18
    .line 19
    iput v3, v1, Landroid/graphics/PointF;->x:F

    .line 20
    .line 21
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 22
    const/4 v3, 0x1

    .line 23
    .line 24
    aget v0, v0, v3

    .line 25
    int-to-float v0, v0

    .line 26
    add-float/2addr v2, v0

    .line 27
    .line 28
    iput v2, v1, Landroid/graphics/PointF;->y:F

    .line 29
    return-void
    .line 30
.end method

.method public final x()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 6
    .line 7
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 18
    .line 19
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 20
    .line 21
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 25
    .line 26
    iget v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->i:F

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 30
    .line 31
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    sget v2, Lcom/kubi/sdk/res/R$font;->medium:I

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 45
    .line 46
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 49
    .line 50
    iget-object v2, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->l:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 54
    move-result v1

    .line 55
    .line 56
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 57
    .line 58
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->J:Landroid/text/TextPaint;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    iput-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->A:Landroid/graphics/Paint$FontMetrics;

    .line 65
    .line 66
    iget-object v1, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->x:Landroid/graphics/RectF;

    .line 67
    .line 68
    iget v2, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 69
    .line 70
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 71
    sub-float/2addr v2, v0

    .line 72
    .line 73
    iput v2, v1, Landroid/graphics/RectF;->bottom:F

    .line 74
    .line 75
    .line 76
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->m()V

    .line 77
    return-void
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
.end method

.method public final y()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->j(Landroid/graphics/PointF;)V

    .line 10
    const/4 v0, 0x5

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F(I)V

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->z()V

    .line 18
    const/4 v0, 0x4

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->F(I)V

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
.end method

.method public z()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->C:Landroid/graphics/PointF;

    .line 3
    .line 4
    const/high16 v1, -0x3b860000    # -1000.0f

    .line 5
    .line 6
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 7
    .line 8
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 9
    const/4 v0, 0x4

    .line 10
    .line 11
    iput v0, p0, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->v:I

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->A(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
.end method
