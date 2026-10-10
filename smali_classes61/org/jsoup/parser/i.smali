.class public abstract Lorg/jsoup/parser/i;
.super Ljava/lang/Object;
.source "TreeBuilder.java"


# instance fields
.field public a:Lorg/jsoup/parser/e;

.field public b:Lorg/jsoup/parser/a;

.field public c:Lorg/jsoup/parser/h;

.field public d:Lorg/jsoup/nodes/Document;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lorg/jsoup/nodes/Element;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/lang/String;

.field public g:Lorg/jsoup/parser/Token;

.field public h:Lorg/jsoup/parser/d;

.field public i:Lorg/jsoup/parser/Token$h;

.field public j:Lorg/jsoup/parser/Token$g;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lorg/jsoup/parser/Token$h;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lorg/jsoup/parser/Token$h;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lorg/jsoup/parser/i;->i:Lorg/jsoup/parser/Token$h;

    .line 11
    .line 12
    new-instance v0, Lorg/jsoup/parser/Token$g;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lorg/jsoup/parser/Token$g;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lorg/jsoup/parser/i;->j:Lorg/jsoup/parser/Token$g;

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public a()Lorg/jsoup/nodes/Element;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/parser/i;->e:Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lorg/jsoup/parser/i;->e:Ljava/util/ArrayList;

    .line 11
    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lorg/jsoup/nodes/Element;

    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public abstract b()Lorg/jsoup/parser/d;
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/parser/i;->a:Lorg/jsoup/parser/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/jsoup/parser/e;->a()Lorg/jsoup/parser/ParseErrorList;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lorg/jsoup/parser/ParseErrorList;->canAddError()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lorg/jsoup/parser/c;

    .line 15
    .line 16
    iget-object v2, p0, Lorg/jsoup/parser/i;->b:Lorg/jsoup/parser/a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lorg/jsoup/parser/a;->H()I

    .line 20
    move-result v2

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, p1}, Lorg/jsoup/parser/c;-><init>(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 27
    :cond_0
    return-void
    .line 28
    .line 29
    .line 30
.end method

.method public d(Ljava/io/Reader;Ljava/lang/String;Lorg/jsoup/parser/e;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "String input must not be null"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lnh0/b;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "BaseURI must not be null"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lnh0/b;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v0, Lorg/jsoup/nodes/Document;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p2}, Lorg/jsoup/nodes/Document;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    iput-object v0, p0, Lorg/jsoup/parser/i;->d:Lorg/jsoup/nodes/Document;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p3}, Lorg/jsoup/nodes/Document;->t1(Lorg/jsoup/parser/e;)Lorg/jsoup/nodes/Document;

    .line 21
    .line 22
    iput-object p3, p0, Lorg/jsoup/parser/i;->a:Lorg/jsoup/parser/e;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Lorg/jsoup/parser/e;->f()Lorg/jsoup/parser/d;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iput-object v0, p0, Lorg/jsoup/parser/i;->h:Lorg/jsoup/parser/d;

    .line 29
    .line 30
    new-instance v0, Lorg/jsoup/parser/a;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, p1}, Lorg/jsoup/parser/a;-><init>(Ljava/io/Reader;)V

    .line 34
    .line 35
    iput-object v0, p0, Lorg/jsoup/parser/i;->b:Lorg/jsoup/parser/a;

    .line 36
    const/4 p1, 0x0

    .line 37
    .line 38
    iput-object p1, p0, Lorg/jsoup/parser/i;->g:Lorg/jsoup/parser/Token;

    .line 39
    .line 40
    new-instance p1, Lorg/jsoup/parser/h;

    .line 41
    .line 42
    iget-object v0, p0, Lorg/jsoup/parser/i;->b:Lorg/jsoup/parser/a;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3}, Lorg/jsoup/parser/e;->a()Lorg/jsoup/parser/ParseErrorList;

    .line 46
    move-result-object p3

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, v0, p3}, Lorg/jsoup/parser/h;-><init>(Lorg/jsoup/parser/a;Lorg/jsoup/parser/ParseErrorList;)V

    .line 50
    .line 51
    iput-object p1, p0, Lorg/jsoup/parser/i;->c:Lorg/jsoup/parser/h;

    .line 52
    .line 53
    new-instance p1, Ljava/util/ArrayList;

    .line 54
    .line 55
    const/16 p3, 0x20

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    iput-object p1, p0, Lorg/jsoup/parser/i;->e:Ljava/util/ArrayList;

    .line 61
    .line 62
    iput-object p2, p0, Lorg/jsoup/parser/i;->f:Ljava/lang/String;

    .line 63
    return-void
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
.end method

.method public e(Ljava/io/Reader;Ljava/lang/String;Lorg/jsoup/parser/e;)Lorg/jsoup/nodes/Document;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lorg/jsoup/parser/i;->d(Ljava/io/Reader;Ljava/lang/String;Lorg/jsoup/parser/e;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/jsoup/parser/i;->k()V

    .line 7
    .line 8
    iget-object p1, p0, Lorg/jsoup/parser/i;->b:Lorg/jsoup/parser/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lorg/jsoup/parser/a;->d()V

    .line 12
    const/4 p1, 0x0

    .line 13
    .line 14
    iput-object p1, p0, Lorg/jsoup/parser/i;->b:Lorg/jsoup/parser/a;

    .line 15
    .line 16
    iput-object p1, p0, Lorg/jsoup/parser/i;->c:Lorg/jsoup/parser/h;

    .line 17
    .line 18
    iput-object p1, p0, Lorg/jsoup/parser/i;->e:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object p1, p0, Lorg/jsoup/parser/i;->d:Lorg/jsoup/nodes/Document;

    .line 21
    return-object p1
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
.end method

.method public abstract f(Ljava/lang/String;Lorg/jsoup/nodes/Element;Ljava/lang/String;Lorg/jsoup/parser/e;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/jsoup/nodes/Element;",
            "Ljava/lang/String;",
            "Lorg/jsoup/parser/e;",
            ")",
            "Ljava/util/List<",
            "Lorg/jsoup/nodes/g;",
            ">;"
        }
    .end annotation
.end method

.method public abstract g(Lorg/jsoup/parser/Token;)Z
.end method

.method public h(Ljava/lang/String;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/parser/i;->g:Lorg/jsoup/parser/Token;

    .line 3
    .line 4
    iget-object v1, p0, Lorg/jsoup/parser/i;->j:Lorg/jsoup/parser/Token$g;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/jsoup/parser/Token$g;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Lorg/jsoup/parser/Token$g;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lorg/jsoup/parser/Token$i;->B(Ljava/lang/String;)Lorg/jsoup/parser/Token$i;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lorg/jsoup/parser/i;->g(Lorg/jsoup/parser/Token;)Z

    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v1}, Lorg/jsoup/parser/Token$i;->E()Lorg/jsoup/parser/Token$i;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lorg/jsoup/parser/Token$i;->B(Ljava/lang/String;)Lorg/jsoup/parser/Token$i;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lorg/jsoup/parser/i;->g(Lorg/jsoup/parser/Token;)Z

    .line 32
    move-result p1

    .line 33
    return p1
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
.end method

.method public i(Ljava/lang/String;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/parser/i;->i:Lorg/jsoup/parser/Token$h;

    .line 3
    .line 4
    iget-object v1, p0, Lorg/jsoup/parser/i;->g:Lorg/jsoup/parser/Token;

    .line 5
    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/jsoup/parser/Token$h;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Lorg/jsoup/parser/Token$h;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lorg/jsoup/parser/Token$i;->B(Ljava/lang/String;)Lorg/jsoup/parser/Token$i;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lorg/jsoup/parser/i;->g(Lorg/jsoup/parser/Token;)Z

    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Lorg/jsoup/parser/Token$h;->E()Lorg/jsoup/parser/Token$i;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lorg/jsoup/parser/Token$i;->B(Ljava/lang/String;)Lorg/jsoup/parser/Token$i;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lorg/jsoup/parser/i;->g(Lorg/jsoup/parser/Token;)Z

    .line 32
    move-result p1

    .line 33
    return p1
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
.end method

.method public j(Ljava/lang/String;Lorg/jsoup/nodes/b;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/parser/i;->i:Lorg/jsoup/parser/Token$h;

    .line 3
    .line 4
    iget-object v1, p0, Lorg/jsoup/parser/i;->g:Lorg/jsoup/parser/Token;

    .line 5
    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/jsoup/parser/Token$h;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Lorg/jsoup/parser/Token$h;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Lorg/jsoup/parser/Token$h;->G(Ljava/lang/String;Lorg/jsoup/nodes/b;)Lorg/jsoup/parser/Token$h;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lorg/jsoup/parser/i;->g(Lorg/jsoup/parser/Token;)Z

    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Lorg/jsoup/parser/Token$h;->E()Lorg/jsoup/parser/Token$i;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Lorg/jsoup/parser/Token$h;->G(Ljava/lang/String;Lorg/jsoup/nodes/b;)Lorg/jsoup/parser/Token$h;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lorg/jsoup/parser/i;->g(Lorg/jsoup/parser/Token;)Z

    .line 30
    move-result p1

    .line 31
    return p1
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

.method public k()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/parser/i;->c:Lorg/jsoup/parser/h;

    .line 3
    .line 4
    sget-object v1, Lorg/jsoup/parser/Token$TokenType;->EOF:Lorg/jsoup/parser/Token$TokenType;

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {v0}, Lorg/jsoup/parser/h;->u()Lorg/jsoup/parser/Token;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v2}, Lorg/jsoup/parser/i;->g(Lorg/jsoup/parser/Token;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lorg/jsoup/parser/Token;->m()Lorg/jsoup/parser/Token;

    .line 15
    .line 16
    iget-object v2, v2, Lorg/jsoup/parser/Token;->a:Lorg/jsoup/parser/Token$TokenType;

    .line 17
    .line 18
    if-ne v2, v1, :cond_0

    .line 19
    return-void
    .line 20
    .line 21
.end method
