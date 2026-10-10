.class public Lm1/c;
.super Ljava/lang/Object;
.source "AnimatableTransformParser.java"


# static fields
.field public static final a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

.field public static final b:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    .line 2
    .line 3
    const-string/jumbo v8, "sk"

    .line 4
    .line 5
    const-string v9, "sa"

    .line 6
    .line 7
    const-string v0, "a"

    .line 8
    .line 9
    const-string v1, "p"

    .line 10
    .line 11
    const-string v2, "s"

    .line 12
    .line 13
    const-string v3, "rz"

    .line 14
    .line 15
    const-string v4, "r"

    .line 16
    .line 17
    const-string v5, "o"

    .line 18
    .line 19
    .line 20
    const-string/jumbo v6, "so"

    .line 21
    .line 22
    const-string v7, "eo"

    .line 23
    .line 24
    .line 25
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader$a;->a([Ljava/lang/String;)Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    sput-object v0, Lm1/c;->a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 33
    .line 34
    const-string v0, "k"

    .line 35
    .line 36
    .line 37
    filled-new-array {v0}, [Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader$a;->a([Ljava/lang/String;)Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    sput-object v0, Lm1/c;->b:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 45
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
.end method

.method public static a(Li1/e;)Z
    .locals 2

    .line 1
    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Li1/e;->isStatic()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Li1/e;->b()Ljava/util/List;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    check-cast p0, Lp1/a;

    .line 20
    .line 21
    iget-object p0, p0, Lp1/a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Landroid/graphics/PointF;

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0, v0}, Landroid/graphics/PointF;->equals(FF)Z

    .line 28
    move-result p0

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return v1

    .line 33
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 34
    return p0
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
.end method

.method public static b(Li1/m;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/m<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;)Z"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    instance-of v0, p0, Li1/i;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Li1/m;->isStatic()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Li1/m;->b()Ljava/util/List;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    check-cast p0, Lp1/a;

    .line 24
    .line 25
    iget-object p0, p0, Lp1/a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Landroid/graphics/PointF;

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0, v0}, Landroid/graphics/PointF;->equals(FF)Z

    .line 32
    move-result p0

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return v1

    .line 37
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 38
    return p0
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
.end method

.method public static c(Li1/b;)Z
    .locals 2

    .line 1
    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Li1/b;->isStatic()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Li1/b;->b()Ljava/util/List;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    check-cast p0, Lp1/a;

    .line 20
    .line 21
    iget-object p0, p0, Lp1/a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Ljava/lang/Float;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 27
    move-result p0

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    cmpl-float p0, p0, v0

    .line 31
    .line 32
    if-nez p0, :cond_0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return v1

    .line 35
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0
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
.end method

.method public static d(Li1/g;)Z
    .locals 2

    .line 1
    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Li1/g;->isStatic()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Li1/g;->b()Ljava/util/List;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    check-cast p0, Lp1/a;

    .line 20
    .line 21
    iget-object p0, p0, Lp1/a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lp1/d;

    .line 24
    .line 25
    const/high16 v0, 0x3f800000    # 1.0f

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0, v0}, Lp1/d;->a(FF)Z

    .line 29
    move-result p0

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v1

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 35
    return p0
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
.end method

.method public static e(Li1/b;)Z
    .locals 2

    .line 1
    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Li1/b;->isStatic()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Li1/b;->b()Ljava/util/List;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    check-cast p0, Lp1/a;

    .line 20
    .line 21
    iget-object p0, p0, Lp1/a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Ljava/lang/Float;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 27
    move-result p0

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    cmpl-float p0, p0, v0

    .line 31
    .line 32
    if-nez p0, :cond_0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return v1

    .line 35
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0
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
.end method

.method public static f(Li1/b;)Z
    .locals 2

    .line 1
    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Li1/b;->isStatic()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Li1/b;->b()Ljava/util/List;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    check-cast p0, Lp1/a;

    .line 20
    .line 21
    iget-object p0, p0, Lp1/a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Ljava/lang/Float;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 27
    move-result p0

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    cmpl-float p0, p0, v0

    .line 31
    .line 32
    if-nez p0, :cond_0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return v1

    .line 35
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0
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
.end method

.method public static g(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/l;
    .locals 26
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v2, p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->q()Lcom/airbnb/lottie/parser/moshi/JsonReader$Token;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    sget-object v3, Lcom/airbnb/lottie/parser/moshi/JsonReader$Token;->BEGIN_OBJECT:Lcom/airbnb/lottie/parser/moshi/JsonReader$Token;

    .line 11
    const/4 v8, 0x0

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    const/4 v1, 0x1

    .line 15
    move v9, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v9, v8

    .line 18
    .line 19
    :goto_0
    if-eqz v9, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->g()V

    .line 23
    :cond_1
    const/4 v1, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x0

    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    .line 30
    const/16 v21, 0x0

    .line 31
    .line 32
    const/16 v22, 0x0

    .line 33
    .line 34
    const/16 v23, 0x0

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->j()Z

    .line 38
    move-result v3

    .line 39
    .line 40
    if-eqz v3, :cond_6

    .line 41
    .line 42
    sget-object v3, Lm1/c;->a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v3}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->v(Lcom/airbnb/lottie/parser/moshi/JsonReader$a;)I

    .line 46
    move-result v3

    .line 47
    .line 48
    .line 49
    packed-switch v3, :pswitch_data_0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->w()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->x()V

    .line 56
    goto :goto_1

    .line 57
    .line 58
    .line 59
    :pswitch_0
    invoke-static {v0, v2, v8}, Lm1/d;->f(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;Z)Li1/b;

    .line 60
    move-result-object v15

    .line 61
    goto :goto_1

    .line 62
    .line 63
    .line 64
    :pswitch_1
    invoke-static {v0, v2, v8}, Lm1/d;->f(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;Z)Li1/b;

    .line 65
    move-result-object v14

    .line 66
    goto :goto_1

    .line 67
    .line 68
    .line 69
    :pswitch_2
    invoke-static {v0, v2, v8}, Lm1/d;->f(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;Z)Li1/b;

    .line 70
    move-result-object v23

    .line 71
    goto :goto_1

    .line 72
    .line 73
    .line 74
    :pswitch_3
    invoke-static {v0, v2, v8}, Lm1/d;->f(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;Z)Li1/b;

    .line 75
    move-result-object v22

    .line 76
    goto :goto_1

    .line 77
    .line 78
    .line 79
    :pswitch_4
    invoke-static/range {p0 .. p1}, Lm1/d;->h(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/d;

    .line 80
    move-result-object v21

    .line 81
    goto :goto_1

    .line 82
    .line 83
    :pswitch_5
    const-string v1, "Lottie doesn\'t support 3D layers."

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1}, Lcom/airbnb/lottie/h;->a(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :pswitch_6
    invoke-static {v0, v2, v8}, Lm1/d;->f(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;Z)Li1/b;

    .line 90
    move-result-object v16

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v16 .. v16}, Li1/b;->b()Ljava/util/List;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 98
    move-result v1

    .line 99
    const/4 v3, 0x0

    .line 100
    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v16 .. v16}, Li1/b;->b()Ljava/util/List;

    .line 105
    move-result-object v1

    .line 106
    move-object v4, v1

    .line 107
    .line 108
    new-instance v1, Lp1/a;

    .line 109
    move v5, v3

    .line 110
    .line 111
    .line 112
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 113
    move-result-object v3

    .line 114
    move-object v6, v4

    .line 115
    .line 116
    .line 117
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 118
    move-result-object v4

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Lcom/airbnb/lottie/h;->f()F

    .line 122
    move-result v5

    .line 123
    .line 124
    .line 125
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 126
    move-result-object v7

    .line 127
    const/4 v5, 0x0

    .line 128
    .line 129
    move-object/from16 v17, v6

    .line 130
    const/4 v6, 0x0

    .line 131
    .line 132
    move-object/from16 v10, v17

    .line 133
    .line 134
    .line 135
    invoke-direct/range {v1 .. v7}, Lp1/a;-><init>(Lcom/airbnb/lottie/h;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    goto :goto_2

    .line 140
    :cond_2
    move v5, v3

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v16 .. v16}, Li1/b;->b()Ljava/util/List;

    .line 144
    move-result-object v1

    .line 145
    .line 146
    .line 147
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    check-cast v1, Lp1/a;

    .line 151
    .line 152
    iget-object v1, v1, Lp1/a;->b:Ljava/lang/Object;

    .line 153
    .line 154
    if-nez v1, :cond_3

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v16 .. v16}, Li1/b;->b()Ljava/util/List;

    .line 158
    move-result-object v10

    .line 159
    .line 160
    new-instance v1, Lp1/a;

    .line 161
    .line 162
    .line 163
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 164
    move-result-object v3

    .line 165
    .line 166
    .line 167
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 168
    move-result-object v4

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {p1 .. p1}, Lcom/airbnb/lottie/h;->f()F

    .line 172
    move-result v2

    .line 173
    .line 174
    .line 175
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 176
    move-result-object v7

    .line 177
    const/4 v5, 0x0

    .line 178
    const/4 v6, 0x0

    .line 179
    .line 180
    move-object/from16 v2, p1

    .line 181
    .line 182
    .line 183
    invoke-direct/range {v1 .. v7}, Lp1/a;-><init>(Lcom/airbnb/lottie/h;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v10, v8, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    :cond_3
    :goto_2
    move-object/from16 v2, p1

    .line 189
    .line 190
    move-object/from16 v1, v16

    .line 191
    .line 192
    goto/16 :goto_1

    .line 193
    .line 194
    .line 195
    :pswitch_7
    invoke-static/range {p0 .. p1}, Lm1/d;->j(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/g;

    .line 196
    move-result-object v13

    .line 197
    .line 198
    :goto_3
    move-object/from16 v2, p1

    .line 199
    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    .line 203
    :pswitch_8
    invoke-static/range {p0 .. p1}, Lm1/a;->b(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/m;

    .line 204
    move-result-object v12

    .line 205
    goto :goto_3

    .line 206
    .line 207
    .line 208
    :pswitch_9
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->g()V

    .line 209
    .line 210
    .line 211
    :goto_4
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->j()Z

    .line 212
    move-result v2

    .line 213
    .line 214
    if-eqz v2, :cond_5

    .line 215
    .line 216
    sget-object v2, Lm1/c;->b:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v2}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->v(Lcom/airbnb/lottie/parser/moshi/JsonReader$a;)I

    .line 220
    move-result v2

    .line 221
    .line 222
    if-eqz v2, :cond_4

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->w()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->x()V

    .line 229
    goto :goto_4

    .line 230
    .line 231
    .line 232
    :cond_4
    invoke-static/range {p0 .. p1}, Lm1/a;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/e;

    .line 233
    move-result-object v11

    .line 234
    goto :goto_4

    .line 235
    .line 236
    .line 237
    :cond_5
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->i()V

    .line 238
    goto :goto_3

    .line 239
    .line 240
    :cond_6
    if-eqz v9, :cond_7

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->i()V

    .line 244
    .line 245
    .line 246
    :cond_7
    invoke-static {v11}, Lm1/c;->a(Li1/e;)Z

    .line 247
    move-result v0

    .line 248
    .line 249
    if-eqz v0, :cond_8

    .line 250
    .line 251
    const/16 v17, 0x0

    .line 252
    goto :goto_5

    .line 253
    .line 254
    :cond_8
    move-object/from16 v17, v11

    .line 255
    .line 256
    .line 257
    :goto_5
    invoke-static {v12}, Lm1/c;->b(Li1/m;)Z

    .line 258
    move-result v0

    .line 259
    .line 260
    if-eqz v0, :cond_9

    .line 261
    const/4 v12, 0x0

    .line 262
    .line 263
    .line 264
    :cond_9
    invoke-static {v1}, Lm1/c;->c(Li1/b;)Z

    .line 265
    move-result v0

    .line 266
    .line 267
    if-eqz v0, :cond_a

    .line 268
    .line 269
    const/16 v20, 0x0

    .line 270
    goto :goto_6

    .line 271
    .line 272
    :cond_a
    move-object/from16 v20, v1

    .line 273
    .line 274
    .line 275
    :goto_6
    invoke-static {v13}, Lm1/c;->d(Li1/g;)Z

    .line 276
    move-result v0

    .line 277
    .line 278
    if-eqz v0, :cond_b

    .line 279
    .line 280
    const/16 v19, 0x0

    .line 281
    goto :goto_7

    .line 282
    .line 283
    :cond_b
    move-object/from16 v19, v13

    .line 284
    .line 285
    .line 286
    :goto_7
    invoke-static {v14}, Lm1/c;->f(Li1/b;)Z

    .line 287
    move-result v0

    .line 288
    .line 289
    if-eqz v0, :cond_c

    .line 290
    .line 291
    const/16 v24, 0x0

    .line 292
    goto :goto_8

    .line 293
    .line 294
    :cond_c
    move-object/from16 v24, v14

    .line 295
    .line 296
    .line 297
    :goto_8
    invoke-static {v15}, Lm1/c;->e(Li1/b;)Z

    .line 298
    move-result v0

    .line 299
    .line 300
    if-eqz v0, :cond_d

    .line 301
    .line 302
    const/16 v25, 0x0

    .line 303
    goto :goto_9

    .line 304
    .line 305
    :cond_d
    move-object/from16 v25, v15

    .line 306
    .line 307
    :goto_9
    new-instance v16, Li1/l;

    .line 308
    .line 309
    move-object/from16 v18, v12

    .line 310
    .line 311
    .line 312
    invoke-direct/range {v16 .. v25}, Li1/l;-><init>(Li1/e;Li1/m;Li1/g;Li1/b;Li1/d;Li1/b;Li1/b;Li1/b;Li1/b;)V

    .line 313
    return-object v16

    .line 314
    nop

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
.end method
