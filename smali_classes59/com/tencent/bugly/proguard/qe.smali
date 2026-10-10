.class public Lcom/tencent/bugly/proguard/qe;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/u9;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/qe$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lcom/tencent/bugly/proguard/t9;

.field public c:Lcom/tencent/bugly/proguard/r9;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/qe;->b:Lcom/tencent/bugly/proguard/t9;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/bugly/proguard/qe;->c:Lcom/tencent/bugly/proguard/r9;

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/qe;->d:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/qe;->e:Z

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/bugly/proguard/qe;->a:Ljava/lang/String;

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
.end method

.method public static c()Lcom/tencent/bugly/proguard/qe;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/qe$a;->a()Lcom/tencent/bugly/proguard/qe;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/s9;
    .locals 2

    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/qe;->e()Lcom/tencent/bugly/proguard/t9;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    .line 10
    :cond_1
    invoke-interface {v0, p1}, Lcom/tencent/bugly/proguard/t9;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 11
    new-instance v0, Lcom/tencent/bugly/proguard/oe;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/oe;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/tencent/bugly/proguard/t9;)Lcom/tencent/bugly/proguard/s9;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/qe;->e()Lcom/tencent/bugly/proguard/t9;

    move-result-object v0

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/qe;->a(Lcom/tencent/bugly/proguard/t9;)V

    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/qe;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/s9;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 1

    .line 20
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qe;->e:Z

    if-nez v0, :cond_0

    .line 21
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/qe;->b()V

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/qe;->e:Z

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/t9;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/qe;->b:Lcom/tencent/bugly/proguard/t9;

    .line 2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/qe;->c:Lcom/tencent/bugly/proguard/r9;

    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qe;->d:Z

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {p1}, Lcom/tencent/bugly/proguard/r9;->b()V

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/qe;->d:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 12
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/qe;->e()Lcom/tencent/bugly/proguard/t9;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 13
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/qe;->d:Z

    const/4 p1, 0x0

    return p1

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/qe;->a()V

    .line 15
    iget-object v2, p0, Lcom/tencent/bugly/proguard/qe;->a:Ljava/lang/String;

    invoke-interface {v0, v2, p1, p2}, Lcom/tencent/bugly/proguard/t9;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1
.end method

.method public a(Ljava/util/Map;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 16
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/qe;->e()Lcom/tencent/bugly/proguard/t9;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 17
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/qe;->d:Z

    const/4 p1, 0x0

    return p1

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/qe;->a()V

    .line 19
    iget-object v2, p0, Lcom/tencent/bugly/proguard/qe;->a:Ljava/lang/String;

    invoke-interface {v0, v2, p1}, Lcom/tencent/bugly/proguard/t9;->a(Ljava/lang/String;Ljava/util/Map;)V

    return v1
.end method

.method public b()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/qe;->e()Lcom/tencent/bugly/proguard/t9;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/tencent/bugly/proguard/t9;->a()V

    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public d()Lcom/tencent/bugly/proguard/r9;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qe;->c:Lcom/tencent/bugly/proguard/r9;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    monitor-enter p0

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qe;->c:Lcom/tencent/bugly/proguard/r9;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/tencent/bugly/proguard/me;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/me;-><init>(Lcom/tencent/bugly/proguard/u9;)V

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/bugly/proguard/qe;->c:Lcom/tencent/bugly/proguard/r9;

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit p0

    .line 21
    goto :goto_2

    .line 22
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v0

    .line 24
    .line 25
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qe;->c:Lcom/tencent/bugly/proguard/r9;

    .line 26
    return-object v0
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
.end method

.method public final e()Lcom/tencent/bugly/proguard/t9;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qe;->b:Lcom/tencent/bugly/proguard/t9;

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
.end method
