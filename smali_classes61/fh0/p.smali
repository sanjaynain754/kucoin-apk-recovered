.class public Lfh0/p;
.super Lkh0/a;
.source "ListItemParser.java"


# instance fields
.field public final a:Lih0/r;

.field public b:I

.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lkh0/a;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lih0/r;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lih0/r;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lfh0/p;->a:Lih0/r;

    .line 11
    .line 12
    iput p1, p0, Lfh0/p;->b:I

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
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public c()Lih0/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lfh0/p;->a:Lih0/r;

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

.method public g(Lih0/a;)Z
    .locals 1

    .line 1
    .line 2
    iget-boolean p1, p0, Lfh0/p;->c:Z

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lfh0/p;->a:Lih0/r;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lih0/a;->m()Lih0/a;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    instance-of v0, p1, Lih0/q;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p1, Lih0/q;

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lih0/q;->o(Z)V

    .line 21
    :cond_0
    const/4 p1, 0x1

    .line 22
    return p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public h(Lkh0/h;)Lkh0/c;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lkh0/h;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, Lfh0/p;->a:Lih0/r;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lih0/s;->c()Lih0/s;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lkh0/c;->d()Lkh0/c;

    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p1}, Lkh0/h;->d()Lkh0/d;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lkh0/d;->c()Lih0/a;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    instance-of v1, v0, Lih0/u;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    instance-of v0, v0, Lih0/r;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 40
    .line 41
    :goto_1
    iput-boolean v0, p0, Lfh0/p;->c:Z

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Lkh0/h;->b()I

    .line 45
    move-result p1

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lkh0/c;->b(I)Lkh0/c;

    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-interface {p1}, Lkh0/h;->c()I

    .line 54
    move-result v0

    .line 55
    .line 56
    iget v1, p0, Lfh0/p;->b:I

    .line 57
    .line 58
    if-lt v0, v1, :cond_4

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Lkh0/h;->getColumn()I

    .line 62
    move-result p1

    .line 63
    .line 64
    iget v0, p0, Lfh0/p;->b:I

    .line 65
    add-int/2addr p1, v0

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Lkh0/c;->a(I)Lkh0/c;

    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    .line 72
    .line 73
    :cond_4
    invoke-static {}, Lkh0/c;->d()Lkh0/c;

    .line 74
    move-result-object p1

    .line 75
    return-object p1
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
