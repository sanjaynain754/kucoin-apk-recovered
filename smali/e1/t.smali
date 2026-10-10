.class public Le1/t;
.super Le1/a;
.source "StrokeContent.java"


# instance fields
.field public final r:Lcom/airbnb/lottie/model/layer/a;

.field public final s:Ljava/lang/String;

.field public final t:Z

.field public final u:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public v:Lf1/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/LottieDrawable;Lcom/airbnb/lottie/model/layer/a;Lcom/airbnb/lottie/model/content/ShapeStroke;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/ShapeStroke;->b()Lcom/airbnb/lottie/model/content/ShapeStroke$LineCapType;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/airbnb/lottie/model/content/ShapeStroke$LineCapType;->toPaintCap()Landroid/graphics/Paint$Cap;

    .line 8
    move-result-object v4

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/ShapeStroke;->e()Lcom/airbnb/lottie/model/content/ShapeStroke$LineJoinType;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/airbnb/lottie/model/content/ShapeStroke$LineJoinType;->toPaintJoin()Landroid/graphics/Paint$Join;

    .line 16
    move-result-object v5

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/ShapeStroke;->g()F

    .line 20
    move-result v6

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/ShapeStroke;->i()Li1/d;

    .line 24
    move-result-object v7

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/ShapeStroke;->j()Li1/b;

    .line 28
    move-result-object v8

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/ShapeStroke;->f()Ljava/util/List;

    .line 32
    move-result-object v9

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/ShapeStroke;->d()Li1/b;

    .line 36
    move-result-object v10

    .line 37
    move-object v1, p0

    .line 38
    move-object v2, p1

    .line 39
    move-object v3, p2

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v1 .. v10}, Le1/a;-><init>(Lcom/airbnb/lottie/LottieDrawable;Lcom/airbnb/lottie/model/layer/a;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLi1/d;Li1/b;Ljava/util/List;Li1/b;)V

    .line 43
    .line 44
    iput-object v3, v1, Le1/t;->r:Lcom/airbnb/lottie/model/layer/a;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/ShapeStroke;->h()Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    iput-object p1, v1, Le1/t;->s:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/ShapeStroke;->k()Z

    .line 54
    move-result p1

    .line 55
    .line 56
    iput-boolean p1, v1, Le1/t;->t:Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/ShapeStroke;->c()Li1/a;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Li1/a;->a()Lf1/a;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    iput-object p1, v1, Le1/t;->u:Lf1/a;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 73
    return-void
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
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lp1/c;)V
    .locals 1
    .param p2    # Lp1/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lp1/c<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Le1/a;->a(Ljava/lang/Object;Lp1/c;)V

    .line 4
    .line 5
    sget-object v0, Lcom/airbnb/lottie/m0;->b:Ljava/lang/Integer;

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Le1/t;->u:Lf1/a;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lf1/a;->o(Lp1/c;)V

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lcom/airbnb/lottie/m0;->K:Landroid/graphics/ColorFilter;

    .line 16
    .line 17
    if-ne p1, v0, :cond_3

    .line 18
    .line 19
    iget-object p1, p0, Le1/t;->v:Lf1/a;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Le1/t;->r:Lcom/airbnb/lottie/model/layer/a;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/airbnb/lottie/model/layer/a;->G(Lf1/a;)V

    .line 27
    .line 28
    :cond_1
    if-nez p2, :cond_2

    .line 29
    const/4 p1, 0x0

    .line 30
    .line 31
    iput-object p1, p0, Le1/t;->v:Lf1/a;

    .line 32
    return-void

    .line 33
    .line 34
    :cond_2
    new-instance p1, Lf1/q;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, p2}, Lf1/q;-><init>(Lp1/c;)V

    .line 38
    .line 39
    iput-object p1, p0, Le1/t;->v:Lf1/a;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 43
    .line 44
    iget-object p1, p0, Le1/t;->r:Lcom/airbnb/lottie/model/layer/a;

    .line 45
    .line 46
    iget-object p2, p0, Le1/t;->u:Lf1/a;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 50
    :cond_3
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
.end method

.method public d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Le1/t;->t:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Le1/a;->i:Landroid/graphics/Paint;

    .line 8
    .line 9
    iget-object v1, p0, Le1/t;->u:Lf1/a;

    .line 10
    .line 11
    check-cast v1, Lf1/b;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lf1/b;->q()I

    .line 15
    move-result v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    iget-object v0, p0, Le1/t;->v:Lf1/a;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Le1/a;->i:Landroid/graphics/Paint;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lf1/a;->h()Ljava/lang/Object;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    check-cast v0, Landroid/graphics/ColorFilter;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-super {p0, p1, p2, p3}, Le1/a;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    .line 37
    return-void
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
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Le1/t;->s:Ljava/lang/String;

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
.end method
