.class public Lcom/tencent/bugly/proguard/o;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/o$f;,
        Lcom/tencent/bugly/proguard/o$e;,
        Lcom/tencent/bugly/proguard/o$d;,
        Lcom/tencent/bugly/proguard/o$c;,
        Lcom/tencent/bugly/proguard/o$b;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "Bugly.AlarmHooker"

.field public static b:Z

.field public static c:Lcom/tencent/bugly/proguard/ug$b;

.field public static d:Lcom/tencent/bugly/proguard/ug;

.field public static e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/o$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/o$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/o$a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/o;->c:Lcom/tencent/bugly/proguard/ug$b;

    .line 8
    .line 9
    new-instance v1, Lcom/tencent/bugly/proguard/ug;

    .line 10
    .line 11
    const-string v2, "alarm"

    .line 12
    .line 13
    const-string v3, "android.app.IAlarmManager"

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2, v3, v0}, Lcom/tencent/bugly/proguard/ug;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/ug$b;)V

    .line 17
    .line 18
    sput-object v1, Lcom/tencent/bugly/proguard/o;->d:Lcom/tencent/bugly/proguard/ug;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    sput-object v0, Lcom/tencent/bugly/proguard/o;->e:Ljava/util/List;

    .line 26
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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

.method public static a()V
    .locals 3

    .line 5
    sget-boolean v0, Lcom/tencent/bugly/proguard/o;->b:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/o;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 7
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/o;->d:Lcom/tencent/bugly/proguard/ug;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ug;->a()Z

    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Bugly.AlarmHooker"

    const-string v2, "checkHook hookRet:%b"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 9
    sput-boolean v0, Lcom/tencent/bugly/proguard/o;->b:Z

    return-void
.end method

.method public static declared-synchronized a(Lcom/tencent/bugly/proguard/o$d;)V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/o;

    monitor-enter v0

    if-nez p0, :cond_0

    monitor-exit v0

    return-void

    .line 2
    :cond_0
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/o;->e:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    .line 3
    :cond_1
    :try_start_1
    sget-object v1, Lcom/tencent/bugly/proguard/o;->e:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/o;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static synthetic a(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/o;->b(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    return-void
.end method

.method public static a([Ljava/lang/Object;)V
    .locals 5

    .line 10
    invoke-static {p0}, Lcom/tencent/bugly/proguard/o$c;->a([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$b;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 11
    new-array p0, v0, [Ljava/lang/Object;

    const-string v0, "Bugly.AlarmHooker"

    const-string v1, "dispatchCancel cancelArgs null"

    invoke-static {v0, v1, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 12
    :cond_0
    const-class v1, Lcom/tencent/bugly/proguard/o;

    monitor-enter v1

    .line 13
    :goto_0
    :try_start_0
    sget-object v2, Lcom/tencent/bugly/proguard/o;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 14
    sget-object v2, Lcom/tencent/bugly/proguard/o;->e:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/o$d;

    iget-object v3, p0, Lcom/tencent/bugly/proguard/o$b;->a:Landroid/app/PendingIntent;

    iget-object v4, p0, Lcom/tencent/bugly/proguard/o$b;->b:Landroid/app/AlarmManager$OnAlarmListener;

    invoke-interface {v2, v3, v4}, Lcom/tencent/bugly/proguard/o$d;->a(Landroid/app/PendingIntent;Landroid/app/AlarmManager$OnAlarmListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 15
    :cond_1
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static b()V
    .locals 3

    .line 3
    sget-boolean v0, Lcom/tencent/bugly/proguard/o;->b:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/o;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 5
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/o;->d:Lcom/tencent/bugly/proguard/ug;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ug;->b()Z

    move-result v0

    .line 6
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Bugly.AlarmHooker"

    const-string v2, "checkUnHook unHookRet:%b"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 7
    sput-boolean v0, Lcom/tencent/bugly/proguard/o;->b:Z

    return-void
.end method

.method public static declared-synchronized b(Lcom/tencent/bugly/proguard/o$d;)V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/o;

    monitor-enter v0

    if-nez p0, :cond_0

    monitor-exit v0

    return-void

    .line 1
    :cond_0
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/o;->e:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/o;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static b(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 2

    .line 8
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "set"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "setRepeating"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "setInexactRepeating"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    const-string/jumbo v0, "remove"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 11
    invoke-static {p1}, Lcom/tencent/bugly/proguard/o;->a([Ljava/lang/Object;)V

    :cond_1
    return-void

    .line 12
    :cond_2
    :goto_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/o;->b([Ljava/lang/Object;)V

    return-void
.end method

.method public static b([Ljava/lang/Object;)V
    .locals 10

    .line 13
    invoke-static {p0}, Lcom/tencent/bugly/proguard/o$f;->a([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/o$e;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 14
    new-array p0, v0, [Ljava/lang/Object;

    const-string v0, "Bugly.AlarmHooker"

    const-string v1, "dispatchSet setArgs null"

    invoke-static {v0, v1, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 15
    :cond_0
    const-class v1, Lcom/tencent/bugly/proguard/o;

    monitor-enter v1

    .line 16
    :try_start_0
    new-instance v3, Lcom/tencent/bugly/proguard/n;

    invoke-direct {v3}, Lcom/tencent/bugly/proguard/n;-><init>()V

    .line 17
    iget v2, p0, Lcom/tencent/bugly/proguard/o$e;->a:I

    iput v2, v3, Lcom/tencent/bugly/proguard/n;->j:I

    .line 18
    iget-object v2, p0, Lcom/tencent/bugly/proguard/o$e;->f:Landroid/app/PendingIntent;

    iput-object v2, v3, Lcom/tencent/bugly/proguard/n;->m:Landroid/app/PendingIntent;

    .line 19
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/o$e;->b:J

    iput-wide v4, v3, Lcom/tencent/bugly/proguard/n;->k:J

    .line 20
    iget-object v2, p0, Lcom/tencent/bugly/proguard/o$e;->g:Landroid/app/AlarmManager$OnAlarmListener;

    iput-object v2, v3, Lcom/tencent/bugly/proguard/n;->n:Landroid/app/AlarmManager$OnAlarmListener;

    .line 21
    :goto_0
    sget-object v2, Lcom/tencent/bugly/proguard/o;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 22
    sget-object v2, Lcom/tencent/bugly/proguard/o;->e:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/o$d;

    iget-wide v4, p0, Lcom/tencent/bugly/proguard/o$e;->c:J

    iget-wide v6, p0, Lcom/tencent/bugly/proguard/o$e;->d:J

    iget v8, p0, Lcom/tencent/bugly/proguard/o$e;->e:I

    iget-object v9, p0, Lcom/tencent/bugly/proguard/o$e;->g:Landroid/app/AlarmManager$OnAlarmListener;

    invoke-interface/range {v2 .. v9}, Lcom/tencent/bugly/proguard/o$d;->a(Lcom/tencent/bugly/proguard/n;JJILandroid/app/AlarmManager$OnAlarmListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 23
    :cond_1
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static declared-synchronized c()V
    .locals 2

    .line 1
    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/o;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/o;->e:Ljava/util/List;

    .line 6
    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/o;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw v1
    .line 17
.end method
