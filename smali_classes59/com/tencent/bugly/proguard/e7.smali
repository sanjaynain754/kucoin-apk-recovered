.class public Lcom/tencent/bugly/proguard/e7;
.super Lcom/tencent/bugly/proguard/d1;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/b9;


# static fields
.field public static final c:Ljava/lang/String; = "RMonitor_memory_FragmentWatcher"


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/bc;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/d1;-><init>(Lcom/tencent/bugly/proguard/bc;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/xb;->e()Lcom/tencent/bugly/proguard/dc;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/dc;->f()Z

    .line 8
    move-result v0

    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public b()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/d7$c;->a:Lcom/tencent/bugly/proguard/d7;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/d7;->a(Lcom/tencent/bugly/proguard/b9;)V

    .line 6
    const/4 v0, 0x1

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
.end method

.method public c()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/d7$c;->a:Lcom/tencent/bugly/proguard/d7;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/d7;->b(Lcom/tencent/bugly/proguard/b9;)V

    .line 6
    return-void
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

.method public onFragmentDestroyed(Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d1;->b:Lcom/tencent/bugly/proguard/bc;

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lcom/tencent/bugly/proguard/bc;->c(Ljava/lang/Object;Ljava/lang/String;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onFragmentPreAttached(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onFragmentResumed(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onFragmentViewDestroyed(Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d1;->b:Lcom/tencent/bugly/proguard/bc;

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lcom/tencent/bugly/proguard/bc;->c(Ljava/lang/Object;Ljava/lang/String;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
