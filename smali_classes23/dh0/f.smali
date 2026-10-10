.class public abstract Ldh0/f;
.super Ljava/lang/Object;
.source "SignatureImpl.java"

# interfaces
.implements Lorg/aspectj/lang/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldh0/f$a;,
        Ldh0/f$b;
    }
.end annotation


# static fields
.field public static h:Z = true

.field public static i:[Ljava/lang/String;

.field public static j:[Ljava/lang/Class;


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Class;

.field public e:Ldh0/f$a;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v1, v0, [Ljava/lang/String;

    .line 4
    .line 5
    sput-object v1, Ldh0/f;->i:[Ljava/lang/String;

    .line 6
    .line 7
    new-array v0, v0, [Ljava/lang/Class;

    .line 8
    .line 9
    sput-object v0, Ldh0/f;->j:[Ljava/lang/Class;

    .line 10
    return-void
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
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Class;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Ldh0/f;->g:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    iput p1, p0, Ldh0/f;->a:I

    .line 9
    .line 10
    iput-object p2, p0, Ldh0/f;->b:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, p0, Ldh0/f;->d:Ljava/lang/Class;

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
.end method


# virtual methods
.method public abstract a(Ldh0/h;)Ljava/lang/String;
.end method

.method public b(I)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldh0/f;->c(I)Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const/16 v0, 0x10

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 10
    move-result p1

    .line 11
    return p1
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
.end method

.method public c(I)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Ldh0/f;->f:Ljava/lang/String;

    .line 3
    .line 4
    const/16 v1, 0x2d

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    :goto_0
    add-int/lit8 v3, p1, -0x1

    .line 12
    .line 13
    if-lez p1, :cond_0

    .line 14
    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    iget-object p1, p0, Ldh0/f;->f:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->indexOf(II)I

    .line 21
    move-result v0

    .line 22
    move p1, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, -0x1

    .line 25
    .line 26
    if-ne v0, p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Ldh0/f;->f:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    move-result v0

    .line 33
    .line 34
    :cond_1
    iget-object p1, p0, Ldh0/f;->f:Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    return-object p1
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
.end method

.method public d(I)Ljava/lang/Class;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldh0/f;->c(I)Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ldh0/f;->h()Ljava/lang/ClassLoader;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Ldh0/b;->a(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public e(I)[Ljava/lang/Class;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldh0/f;->c(I)Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    new-instance v0, Ljava/util/StringTokenizer;

    .line 7
    .line 8
    const-string v1, ":"

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->countTokens()I

    .line 15
    move-result p1

    .line 16
    .line 17
    new-array v1, p1, [Ljava/lang/Class;

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    :goto_0
    if-ge v2, p1, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ldh0/f;->h()Ljava/lang/ClassLoader;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    .line 31
    invoke-static {v3, v4}, Ldh0/b;->a(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    aput-object v3, v1, v2

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v1
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
.end method

.method public f()Ljava/lang/Class;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ldh0/f;->d:Ljava/lang/Class;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x2

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ldh0/f;->d(I)Ljava/lang/Class;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Ldh0/f;->d:Ljava/lang/Class;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ldh0/f;->d:Ljava/lang/Class;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ldh0/f;->c:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ldh0/f;->f()Ljava/lang/Class;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Ldh0/f;->c:Ljava/lang/String;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ldh0/f;->c:Ljava/lang/String;

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
.end method

.method public final h()Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ldh0/f;->g:Ljava/lang/ClassLoader;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Ldh0/f;->g:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ldh0/f;->g:Ljava/lang/ClassLoader;

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
.end method

.method public i()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Ldh0/f;->a:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ldh0/f;->b(I)I

    .line 10
    move-result v0

    .line 11
    .line 12
    iput v0, p0, Ldh0/f;->a:I

    .line 13
    .line 14
    :cond_0
    iget v0, p0, Ldh0/f;->a:I

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ldh0/f;->b:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ldh0/f;->c(I)Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Ldh0/f;->b:Ljava/lang/String;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ldh0/f;->b:Ljava/lang/String;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public k(Ldh0/h;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Ldh0/f;->h:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Ldh0/f;->e:Ldh0/f$a;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    :try_start_0
    new-instance v0, Ldh0/f$b;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ldh0/f$b;-><init>()V

    .line 14
    .line 15
    iput-object v0, p0, Ldh0/f;->e:Ldh0/f$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    const/4 v0, 0x0

    .line 18
    .line 19
    sput-boolean v0, Ldh0/f;->h:Z

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    iget v1, p1, Ldh0/h;->i:I

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ldh0/f$a;->get(I)Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 29
    .line 30
    :goto_1
    if-nez v0, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ldh0/f;->a(Ldh0/h;)Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    :cond_2
    sget-boolean v1, Ldh0/f;->h:Z

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    iget-object v1, p0, Ldh0/f;->e:Ldh0/f$a;

    .line 41
    .line 42
    iget p1, p1, Ldh0/h;->i:I

    .line 43
    .line 44
    .line 45
    invoke-interface {v1, p1, v0}, Ldh0/f$a;->a(ILjava/lang/String;)V

    .line 46
    :cond_3
    return-object v0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Ldh0/h;->k:Ldh0/h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ldh0/f;->k(Ldh0/h;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method
