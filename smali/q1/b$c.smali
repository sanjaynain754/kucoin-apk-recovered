.class public final Lq1/b$c;
.super Ljava/lang/Object;
.source "DiskLruCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:Lq1/b$d;

.field public final b:[Z

.field public c:Z

.field public final synthetic d:Lq1/b;


# direct methods
.method public constructor <init>(Lq1/b;Lq1/b$d;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lq1/b$c;->d:Lq1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lq1/b$c;->a:Lq1/b$d;

    .line 4
    invoke-static {p2}, Lq1/b$d;->e(Lq1/b$d;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lq1/b;->b(Lq1/b;)I

    move-result p1

    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lq1/b$c;->b:[Z

    return-void
.end method

.method public synthetic constructor <init>(Lq1/b;Lq1/b$d;Lq1/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lq1/b$c;-><init>(Lq1/b;Lq1/b$d;)V

    return-void
.end method

.method public static synthetic c(Lq1/b$c;)Lq1/b$d;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lq1/b$c;->a:Lq1/b$d;

    .line 3
    return-object p0
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
.end method

.method public static synthetic d(Lq1/b$c;)[Z
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lq1/b$c;->b:[Z

    .line 3
    return-object p0
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
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lq1/b$c;->d:Lq1/b;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p0, v1}, Lq1/b;->i(Lq1/b;Lq1/b$c;Z)V

    .line 7
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
.end method

.method public b()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lq1/b$c;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Lq1/b$c;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    :catch_0
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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public e()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lq1/b$c;->d:Lq1/b;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p0, v1}, Lq1/b;->i(Lq1/b;Lq1/b$c;Z)V

    .line 7
    .line 8
    iput-boolean v1, p0, Lq1/b$c;->c:Z

    .line 9
    return-void
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

.method public f(I)Ljava/io/File;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lq1/b$c;->d:Lq1/b;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lq1/b$c;->a:Lq1/b$d;

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lq1/b$d;->g(Lq1/b$d;)Lq1/b$c;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    if-ne v1, p0, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lq1/b$c;->a:Lq1/b$d;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lq1/b$d;->e(Lq1/b$d;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lq1/b$c;->b:[Z

    .line 22
    const/4 v2, 0x1

    .line 23
    .line 24
    aput-boolean v2, v1, p1

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_0
    :goto_0
    iget-object v1, p0, Lq1/b$c;->a:Lq1/b$d;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lq1/b$d;->k(I)Ljava/io/File;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    iget-object v1, p0, Lq1/b$c;->d:Lq1/b;

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lq1/b;->h(Lq1/b;)Ljava/io/File;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 43
    monitor-exit v0

    .line 44
    return-object p1

    .line 45
    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    .line 49
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 50
    throw p1

    .line 51
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p1
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
