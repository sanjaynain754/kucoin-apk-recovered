.class public Lorg/springframework/web/util/pattern/f;
.super Ljava/lang/Object;
.source "PathPattern.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/springframework/web/util/pattern/f$a;,
        Lorg/springframework/web/util/pattern/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lorg/springframework/web/util/pattern/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final m:Lvh0/b;

.field public static final n:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lorg/springframework/web/util/pattern/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Lzh0/e;

.field public final d:Lvh0/b$b;

.field public final e:Z

.field public final f:Z

.field public final g:Lorg/springframework/web/util/pattern/e;

.field public h:I

.field public i:I

.field public j:Z

.field public k:I

.field public l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lvh0/b;->b(Ljava/lang/String;)Lvh0/b;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lorg/springframework/web/util/pattern/f;->m:Lvh0/b;

    .line 9
    .line 10
    new-instance v0, Lzh0/a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lzh0/a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ljava/util/Comparator;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    new-instance v1, Lzh0/b;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1}, Lzh0/b;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/Comparator;->thenComparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    new-instance v1, Lzh0/c;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Lzh0/c;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/Comparator;->thenComparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    new-instance v1, Lzh0/d;

    .line 38
    .line 39
    .line 40
    invoke-direct {v1}, Lzh0/d;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0, v1}, Ljava/util/Comparator;->thenComparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/util/Comparator;->nullsLast(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    sput-object v0, Lorg/springframework/web/util/pattern/f;->n:Ljava/util/Comparator;

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
.end method

.method public constructor <init>(Ljava/lang/String;Lzh0/e;Lorg/springframework/web/util/pattern/e;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lorg/springframework/web/util/pattern/f;->j:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lorg/springframework/web/util/pattern/f;->l:Z

    .line 9
    .line 10
    iput-object p1, p0, Lorg/springframework/web/util/pattern/f;->b:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lorg/springframework/web/util/pattern/f;->c:Lzh0/e;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lzh0/e;->a()Lvh0/b$b;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iput-object p1, p0, Lorg/springframework/web/util/pattern/f;->d:Lvh0/b$b;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lzh0/e;->c()Z

    .line 22
    move-result p1

    .line 23
    .line 24
    iput-boolean p1, p0, Lorg/springframework/web/util/pattern/f;->e:Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lzh0/e;->b()Z

    .line 28
    move-result p1

    .line 29
    .line 30
    iput-boolean p1, p0, Lorg/springframework/web/util/pattern/f;->f:Z

    .line 31
    .line 32
    iput-object p3, p0, Lorg/springframework/web/util/pattern/f;->g:Lorg/springframework/web/util/pattern/e;

    .line 33
    .line 34
    :goto_0
    if-eqz p3, :cond_3

    .line 35
    .line 36
    iget p1, p0, Lorg/springframework/web/util/pattern/f;->h:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Lorg/springframework/web/util/pattern/e;->a()I

    .line 40
    move-result p2

    .line 41
    add-int/2addr p1, p2

    .line 42
    .line 43
    iput p1, p0, Lorg/springframework/web/util/pattern/f;->h:I

    .line 44
    .line 45
    iget p1, p0, Lorg/springframework/web/util/pattern/f;->i:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3}, Lorg/springframework/web/util/pattern/e;->b()I

    .line 49
    move-result p2

    .line 50
    add-int/2addr p1, p2

    .line 51
    .line 52
    iput p1, p0, Lorg/springframework/web/util/pattern/f;->i:I

    .line 53
    .line 54
    iget p1, p0, Lorg/springframework/web/util/pattern/f;->k:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3}, Lorg/springframework/web/util/pattern/e;->c()I

    .line 58
    move-result p2

    .line 59
    add-int/2addr p1, p2

    .line 60
    .line 61
    iput p1, p0, Lorg/springframework/web/util/pattern/f;->k:I

    .line 62
    .line 63
    instance-of p1, p3, Lorg/springframework/web/util/pattern/a;

    .line 64
    const/4 p2, 0x1

    .line 65
    .line 66
    if-nez p1, :cond_0

    .line 67
    .line 68
    instance-of p1, p3, Lorg/springframework/web/util/pattern/k;

    .line 69
    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    :cond_0
    iput-boolean p2, p0, Lorg/springframework/web/util/pattern/f;->l:Z

    .line 73
    .line 74
    :cond_1
    instance-of p1, p3, Lorg/springframework/web/util/pattern/h;

    .line 75
    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    iget-object p1, p3, Lorg/springframework/web/util/pattern/e;->c:Lorg/springframework/web/util/pattern/e;

    .line 79
    .line 80
    instance-of v0, p1, Lorg/springframework/web/util/pattern/j;

    .line 81
    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    iget-object p1, p1, Lorg/springframework/web/util/pattern/e;->c:Lorg/springframework/web/util/pattern/e;

    .line 85
    .line 86
    if-nez p1, :cond_2

    .line 87
    .line 88
    iput-boolean p2, p0, Lorg/springframework/web/util/pattern/f;->j:Z

    .line 89
    .line 90
    :cond_2
    iget-object p3, p3, Lorg/springframework/web/util/pattern/e;->c:Lorg/springframework/web/util/pattern/e;

    .line 91
    goto :goto_0

    .line 92
    :cond_3
    return-void
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
.end method

.method public static synthetic a(Lorg/springframework/web/util/pattern/f;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lorg/springframework/web/util/pattern/f;->o(Lorg/springframework/web/util/pattern/f;)I

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static synthetic b(Lorg/springframework/web/util/pattern/f;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/springframework/web/util/pattern/f;->k()Z

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static synthetic c(Lorg/springframework/web/util/pattern/f;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/springframework/web/util/pattern/f;->k()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lorg/springframework/web/util/pattern/f;->o(Lorg/springframework/web/util/pattern/f;)I

    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
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

.method public static synthetic d(Lorg/springframework/web/util/pattern/f;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lorg/springframework/web/util/pattern/f;->e:Z

    .line 3
    return p0
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

.method public static o(Lorg/springframework/web/util/pattern/f;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/springframework/web/util/pattern/f;->f()I

    .line 4
    move-result p0

    .line 5
    neg-int p0, p0

    .line 6
    return p0
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


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lorg/springframework/web/util/pattern/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lorg/springframework/web/util/pattern/f;->e(Lorg/springframework/web/util/pattern/f;)I

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public e(Lorg/springframework/web/util/pattern/f;)I
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lorg/springframework/web/util/pattern/f;->n:Ljava/util/Comparator;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lorg/springframework/web/util/pattern/f;->b:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p1, p1, Lorg/springframework/web/util/pattern/f;->b:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    return v0
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

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lorg/springframework/web/util/pattern/f;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lorg/springframework/web/util/pattern/f;

    .line 13
    .line 14
    iget-object v1, p0, Lorg/springframework/web/util/pattern/f;->b:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lorg/springframework/web/util/pattern/f;->g()Ljava/lang/String;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lorg/springframework/web/util/pattern/f;->i()C

    .line 28
    move-result v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lorg/springframework/web/util/pattern/f;->i()C

    .line 32
    move-result v3

    .line 33
    .line 34
    if-ne v1, v3, :cond_2

    .line 35
    .line 36
    iget-boolean v1, p0, Lorg/springframework/web/util/pattern/f;->f:Z

    .line 37
    .line 38
    iget-boolean p1, p1, Lorg/springframework/web/util/pattern/f;->f:Z

    .line 39
    .line 40
    if-ne v1, p1, :cond_2

    .line 41
    return v0

    .line 42
    :cond_2
    return v2
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
.end method

.method public f()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/springframework/web/util/pattern/f;->i:I

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
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/springframework/web/util/pattern/f;->b:Ljava/lang/String;

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

.method public h()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lorg/springframework/web/util/pattern/f;->k:I

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
.end method

.method public hashCode()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/springframework/web/util/pattern/f;->b:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/springframework/web/util/pattern/f;->i()C

    .line 10
    move-result v1

    .line 11
    add-int/2addr v0, v1

    .line 12
    .line 13
    mul-int/lit8 v0, v0, 0x11

    .line 14
    .line 15
    iget-boolean v1, p0, Lorg/springframework/web/util/pattern/f;->f:Z

    .line 16
    add-int/2addr v0, v1

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public i()C
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/springframework/web/util/pattern/f;->d:Lvh0/b$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lvh0/b$b;->b()C

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final j(Lvh0/b;)Z
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Lvh0/b;->a()Ljava/util/List;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    move-result p1

    .line 11
    .line 12
    if-lez p1, :cond_0

    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

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
.end method

.method public k()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/springframework/web/util/pattern/f;->l:Z

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
.end method

.method public l(Lvh0/b;)Lorg/springframework/web/util/pattern/f$b;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lorg/springframework/web/util/pattern/f;->g:Lorg/springframework/web/util/pattern/e;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/springframework/web/util/pattern/f;->j(Lvh0/b;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean v0, p0, Lorg/springframework/web/util/pattern/f;->e:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lorg/springframework/web/util/pattern/f;->n(Lvh0/b;)Z

    .line 19
    move-result p1

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    :cond_0
    return-object v1

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-static {}, Lorg/springframework/web/util/pattern/f$b;->a()Lorg/springframework/web/util/pattern/f$b;

    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-virtual {p0, p1}, Lorg/springframework/web/util/pattern/f;->j(Lvh0/b;)Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-nez v0, :cond_5

    .line 34
    .line 35
    iget-object p1, p0, Lorg/springframework/web/util/pattern/f;->g:Lorg/springframework/web/util/pattern/e;

    .line 36
    .line 37
    instance-of v0, p1, Lorg/springframework/web/util/pattern/k;

    .line 38
    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    instance-of p1, p1, Lorg/springframework/web/util/pattern/a;

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    return-object v1

    .line 46
    .line 47
    :cond_4
    :goto_0
    sget-object p1, Lorg/springframework/web/util/pattern/f;->m:Lvh0/b;

    .line 48
    .line 49
    :cond_5
    new-instance v0, Lorg/springframework/web/util/pattern/f$a;

    .line 50
    const/4 v2, 0x1

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, p0, p1, v2}, Lorg/springframework/web/util/pattern/f$a;-><init>(Lorg/springframework/web/util/pattern/f;Lvh0/b;Z)V

    .line 54
    .line 55
    iget-object p1, p0, Lorg/springframework/web/util/pattern/f;->g:Lorg/springframework/web/util/pattern/e;

    .line 56
    const/4 v2, 0x0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v2, v0}, Lorg/springframework/web/util/pattern/e;->e(ILorg/springframework/web/util/pattern/f$a;)Z

    .line 60
    move-result p1

    .line 61
    .line 62
    if-eqz p1, :cond_6

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lorg/springframework/web/util/pattern/f$a;->a()Lorg/springframework/web/util/pattern/f$b;

    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_6
    return-object v1
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

.method public m(Lvh0/b;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/springframework/web/util/pattern/f;->g:Lorg/springframework/web/util/pattern/e;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/springframework/web/util/pattern/f;->j(Lvh0/b;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean v0, p0, Lorg/springframework/web/util/pattern/f;->e:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lorg/springframework/web/util/pattern/f;->n(Lvh0/b;)Z

    .line 19
    move-result p1

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v1

    .line 24
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p1}, Lorg/springframework/web/util/pattern/f;->j(Lvh0/b;)Z

    .line 29
    move-result v0

    .line 30
    .line 31
    if-nez v0, :cond_5

    .line 32
    .line 33
    iget-object p1, p0, Lorg/springframework/web/util/pattern/f;->g:Lorg/springframework/web/util/pattern/e;

    .line 34
    .line 35
    instance-of v0, p1, Lorg/springframework/web/util/pattern/k;

    .line 36
    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    instance-of p1, p1, Lorg/springframework/web/util/pattern/a;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    goto :goto_1

    .line 43
    :cond_3
    return v1

    .line 44
    .line 45
    :cond_4
    :goto_1
    sget-object p1, Lorg/springframework/web/util/pattern/f;->m:Lvh0/b;

    .line 46
    .line 47
    :cond_5
    new-instance v0, Lorg/springframework/web/util/pattern/f$a;

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, p0, p1, v1}, Lorg/springframework/web/util/pattern/f$a;-><init>(Lorg/springframework/web/util/pattern/f;Lvh0/b;Z)V

    .line 51
    .line 52
    iget-object p1, p0, Lorg/springframework/web/util/pattern/f;->g:Lorg/springframework/web/util/pattern/e;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1, v0}, Lorg/springframework/web/util/pattern/e;->e(ILorg/springframework/web/util/pattern/f$a;)Z

    .line 56
    move-result p1

    .line 57
    return p1
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

.method public final n(Lvh0/b;)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lvh0/b;->value()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lvh0/b;->value()Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 20
    move-result p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lorg/springframework/web/util/pattern/f;->i()C

    .line 24
    move-result v0

    .line 25
    .line 26
    if-ne p1, v0, :cond_0

    .line 27
    return v2

    .line 28
    :cond_0
    return v1
    .line 29
    .line 30
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/springframework/web/util/pattern/f;->b:Ljava/lang/String;

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
