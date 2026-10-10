.class public Lcom/tencent/bugly/proguard/r2;
.super Ljava/lang/Object;
.source "BUGLY"


# instance fields
.field public final a:Z

.field public final b:Lcom/tencent/bugly/proguard/s2;

.field public final c:Lcom/tencent/bugly/proguard/t2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/r2;->a:Z

    .line 9
    new-instance v0, Lcom/tencent/bugly/proguard/s2;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/s2;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/r2;->b:Lcom/tencent/bugly/proguard/s2;

    .line 10
    new-instance v0, Lcom/tencent/bugly/proguard/t2;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/t2;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/r2;->c:Lcom/tencent/bugly/proguard/t2;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/s2;Lcom/tencent/bugly/proguard/t2;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p3, p0, Lcom/tencent/bugly/proguard/r2;->a:Z

    .line 3
    new-instance p3, Lcom/tencent/bugly/proguard/s2;

    invoke-direct {p3}, Lcom/tencent/bugly/proguard/s2;-><init>()V

    iput-object p3, p0, Lcom/tencent/bugly/proguard/r2;->b:Lcom/tencent/bugly/proguard/s2;

    .line 4
    invoke-virtual {p3, p1}, Lcom/tencent/bugly/proguard/s2;->b(Lcom/tencent/bugly/proguard/s2;)V

    .line 5
    new-instance p1, Lcom/tencent/bugly/proguard/t2;

    invoke-direct {p1}, Lcom/tencent/bugly/proguard/t2;-><init>()V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/r2;->c:Lcom/tencent/bugly/proguard/t2;

    .line 6
    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/t2;->a(Lcom/tencent/bugly/proguard/t2;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/tencent/bugly/proguard/s2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r2;->b:Lcom/tencent/bugly/proguard/s2;

    return-object v0
.end method

.method public a(Lcom/tencent/bugly/proguard/s2;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r2;->b:Lcom/tencent/bugly/proguard/s2;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/s2;->a(Lcom/tencent/bugly/proguard/s2;)Z

    move-result p1

    return p1
.end method

.method public b()Lcom/tencent/bugly/proguard/t2;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r2;->c:Lcom/tencent/bugly/proguard/t2;

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

.method public c()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/r2;->a:Z

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
.end method
