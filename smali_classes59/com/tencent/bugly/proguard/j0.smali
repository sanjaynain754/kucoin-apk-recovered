.class public Lcom/tencent/bugly/proguard/j0;
.super Lcom/tencent/bugly/proguard/d1;
.source "BUGLY"


# instance fields
.field public final c:[Lcom/tencent/bugly/proguard/m9;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/bc;)V
    .locals 5

    .line 1
    new-instance v0, Lcom/tencent/bugly/proguard/l;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/l;-><init>(Lcom/tencent/bugly/proguard/bc;)V

    new-instance v1, Lcom/tencent/bugly/proguard/f;

    invoke-direct {v1, p1}, Lcom/tencent/bugly/proguard/f;-><init>(Lcom/tencent/bugly/proguard/bc;)V

    new-instance v2, Lcom/tencent/bugly/proguard/e7;

    invoke-direct {v2, p1}, Lcom/tencent/bugly/proguard/e7;-><init>(Lcom/tencent/bugly/proguard/bc;)V

    const/4 v3, 0x3

    new-array v3, v3, [Lcom/tencent/bugly/proguard/m9;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-direct {p0, p1, v3}, Lcom/tencent/bugly/proguard/j0;-><init>(Lcom/tencent/bugly/proguard/bc;[Lcom/tencent/bugly/proguard/m9;)V

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/bc;[Lcom/tencent/bugly/proguard/m9;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/d1;-><init>(Lcom/tencent/bugly/proguard/bc;)V

    .line 3
    iput-object p2, p0, Lcom/tencent/bugly/proguard/j0;->c:[Lcom/tencent/bugly/proguard/m9;

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/j0;->c:[Lcom/tencent/bugly/proguard/m9;

    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    :goto_0
    if-ge v2, v1, :cond_1

    .line 7
    .line 8
    aget-object v3, v0, v2

    .line 9
    .line 10
    .line 11
    invoke-interface {v3}, Lcom/tencent/bugly/proguard/m9;->a()Z

    .line 12
    move-result v4

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v3}, Lcom/tencent/bugly/proguard/m9;->b()Z

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    return v0
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

.method public c()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/j0;->c:[Lcom/tencent/bugly/proguard/m9;

    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    :goto_0
    if-ge v2, v1, :cond_0

    .line 7
    .line 8
    aget-object v3, v0, v2

    .line 9
    .line 10
    .line 11
    invoke-interface {v3}, Lcom/tencent/bugly/proguard/m9;->c()V

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
.end method
