.class public Lcom/tencent/bugly/proguard/k5;
.super Ljava/lang/Object;
.source "BUGLY"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:J

.field public d:I

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:Ljava/lang/String;

.field public j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k5;->j:Ljava/util/Map;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public a(I)Lcom/tencent/bugly/proguard/k5;
    .locals 0

    .line 3
    iput p1, p0, Lcom/tencent/bugly/proguard/k5;->h:I

    return-object p0
.end method

.method public a(J)Lcom/tencent/bugly/proguard/k5;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/k5;->c:J

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/k5;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k5;->g:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/Map;)Lcom/tencent/bugly/proguard/k5;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/tencent/bugly/proguard/k5;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 4
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k5;->j:Ljava/util/Map;

    :cond_0
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k5;->g:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)Lcom/tencent/bugly/proguard/k5;
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/bugly/proguard/k5;->a:I

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/k5;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k5;->e:Ljava/lang/String;

    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k5;->e:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)Lcom/tencent/bugly/proguard/k5;
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/bugly/proguard/k5;->d:I

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/k5;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k5;->f:Ljava/lang/String;

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k5;->f:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/k5;->h:I

    return v0
.end method

.method public d(Ljava/lang/String;)Lcom/tencent/bugly/proguard/k5;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k5;->b:Ljava/lang/String;

    return-object p0
.end method

.method public e()I
    .locals 1

    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/k5;->a:I

    return v0
.end method

.method public e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/k5;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k5;->i:Ljava/lang/String;

    return-object p0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k5;->b:Ljava/lang/String;

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

.method public g()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/k5;->d:I

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

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k5;->i:Ljava/lang/String;

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

.method public i()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/k5;->c:J

    .line 3
    return-wide v0
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

.method public j()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k5;->j:Ljava/util/Map;

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
