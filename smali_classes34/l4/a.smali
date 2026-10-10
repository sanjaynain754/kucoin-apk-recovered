.class public Ll4/a;
.super Ljava/lang/Object;
.source "ImagePerfMonitor.java"

# interfaces
.implements Lg5/d;


# instance fields
.field public final a:Lk4/e;

.field public final b:Lc4/b;

.field public final c:Lcom/facebook/fresco/ui/common/a;

.field public d:Lm4/a;

.field public e:Lm4/b;

.field public f:Lz5/b;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg5/b;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z


# direct methods
.method public constructor <init>(Lc4/b;Lk4/e;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Ll4/a;->b:Lc4/b;

    .line 6
    .line 7
    iput-object p2, p0, Ll4/a;->a:Lk4/e;

    .line 8
    .line 9
    new-instance p1, Lcom/facebook/fresco/ui/common/a;

    .line 10
    .line 11
    sget-object p2, Lcom/facebook/fresco/ui/common/ImageRenderingInfra;->DRAWEE:Lcom/facebook/fresco/ui/common/ImageRenderingInfra;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1, p2}, Lcom/facebook/fresco/ui/common/a;-><init>(Lcom/facebook/fresco/ui/common/ImageRenderingInfra;)V

    .line 15
    .line 16
    iput-object p1, p0, Ll4/a;->c:Lcom/facebook/fresco/ui/common/a;

    .line 17
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
    .line 40
    .line 41
    .line 42
.end method


# virtual methods
.method public a(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/VisibilityState;)V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Ll4/a;->h:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Ll4/a;->g:Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    goto :goto_1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/fresco/ui/common/a;->S()Lcom/facebook/fresco/ui/common/ImagePerfData;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iget-object v0, p0, Ll4/a;->g:Ljava/util/List;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    move-result v1

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Lg5/b;

    .line 38
    .line 39
    .line 40
    invoke-interface {v1, p1, p2}, Lg5/b;->b(Lcom/facebook/fresco/ui/common/ImagePerfData;Lcom/facebook/fresco/ui/common/VisibilityState;)V

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    :goto_1
    return-void
.end method

.method public b(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/facebook/fresco/ui/common/a;->H(Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Ll4/a;->h:Z

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Ll4/a;->g:Ljava/util/List;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_0
    sget-object v0, Lcom/facebook/fresco/ui/common/ImageLoadStatus;->SUCCESS:Lcom/facebook/fresco/ui/common/ImageLoadStatus;

    .line 21
    .line 22
    if-ne p2, v0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ll4/a;->d()V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/fresco/ui/common/a;->S()Lcom/facebook/fresco/ui/common/ImagePerfData;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    iget-object v0, p0, Ll4/a;->g:Ljava/util/List;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    move-result v1

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    check-cast v1, Lg5/b;

    .line 48
    .line 49
    .line 50
    invoke-interface {v1, p1, p2}, Lg5/b;->a(Lcom/facebook/fresco/ui/common/ImagePerfData;Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    :goto_1
    return-void
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

.method public c(Lg5/b;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Ll4/a;->g:Ljava/util/List;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Ll4/a;->g:Ljava/util/List;

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Ll4/a;->g:Ljava/util/List;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method public d()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Ll4/a;->a:Lk4/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lo4/a;->e()Lt4/b;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lt4/b;->b()Landroid/graphics/drawable/Drawable;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lt4/b;->b()Landroid/graphics/drawable/Drawable;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v1, p0, Ll4/a;->c:Lcom/facebook/fresco/ui/common/a;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 28
    move-result v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lcom/facebook/fresco/ui/common/a;->N(I)V

    .line 32
    .line 33
    iget-object v1, p0, Ll4/a;->c:Lcom/facebook/fresco/ui/common/a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 37
    move-result v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lcom/facebook/fresco/ui/common/a;->M(I)V

    .line 41
    :cond_0
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
.end method

.method public e()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ll4/a;->g:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->clear()V

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
.end method

.method public f()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ll4/a;->e()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ll4/a;->g(Z)V

    .line 8
    .line 9
    iget-object v0, p0, Ll4/a;->c:Lcom/facebook/fresco/ui/common/a;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/facebook/fresco/ui/common/a;->w()V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public g(Z)V
    .locals 1

    .line 1
    .line 2
    iput-boolean p1, p0, Ll4/a;->h:Z

    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll4/a;->h()V

    .line 8
    .line 9
    iget-object p1, p0, Ll4/a;->e:Lm4/b;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ll4/a;->a:Lk4/e;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lo4/a;->k(Lcom/facebook/fresco/ui/common/ControllerListener2;)V

    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Ll4/a;->f:Lz5/b;

    .line 19
    .line 20
    if-eqz p1, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Ll4/a;->a:Lk4/e;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lk4/e;->i0(Lz5/d;)V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Ll4/a;->e:Lm4/b;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Ll4/a;->a:Lk4/e;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lo4/a;->S(Lcom/facebook/fresco/ui/common/ControllerListener2;)V

    .line 36
    .line 37
    :cond_2
    iget-object p1, p0, Ll4/a;->f:Lz5/b;

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, Ll4/a;->a:Lk4/e;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lk4/e;->y0(Lz5/d;)V

    .line 45
    :cond_3
    return-void
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
.end method

.method public final h()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Ll4/a;->e:Lm4/b;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lm4/b;

    .line 7
    .line 8
    iget-object v1, p0, Ll4/a;->b:Lc4/b;

    .line 9
    .line 10
    iget-object v2, p0, Ll4/a;->c:Lcom/facebook/fresco/ui/common/a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2, p0}, Lm4/b;-><init>(Lc4/b;Lcom/facebook/fresco/ui/common/a;Lg5/d;)V

    .line 14
    .line 15
    iput-object v0, p0, Ll4/a;->e:Lm4/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Ll4/a;->d:Lm4/a;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    new-instance v0, Lm4/a;

    .line 22
    .line 23
    iget-object v1, p0, Ll4/a;->b:Lc4/b;

    .line 24
    .line 25
    iget-object v2, p0, Ll4/a;->c:Lcom/facebook/fresco/ui/common/a;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lm4/a;-><init>(Lc4/b;Lcom/facebook/fresco/ui/common/a;)V

    .line 29
    .line 30
    iput-object v0, p0, Ll4/a;->d:Lm4/a;

    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Ll4/a;->f:Lz5/b;

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    new-instance v0, Lz5/b;

    .line 37
    .line 38
    iget-object v1, p0, Ll4/a;->d:Lm4/a;

    .line 39
    const/4 v2, 0x1

    .line 40
    .line 41
    new-array v2, v2, [Lz5/d;

    .line 42
    const/4 v3, 0x0

    .line 43
    .line 44
    aput-object v1, v2, v3

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v2}, Lz5/b;-><init>([Lz5/d;)V

    .line 48
    .line 49
    iput-object v0, p0, Ll4/a;->f:Lz5/b;

    .line 50
    :cond_2
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
.end method
