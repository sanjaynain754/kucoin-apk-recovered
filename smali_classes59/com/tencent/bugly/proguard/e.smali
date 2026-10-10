.class public abstract Lcom/tencent/bugly/proguard/e;
.super Ljava/lang/Object;
.source "BUGLY"


# instance fields
.field public a:J

.field public b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;"
        }
    .end annotation
.end field

.field public c:J

.field public d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
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
    iput-object v0, p0, Lcom/tencent/bugly/proguard/e;->b:Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/e;->d:Ljava/util/HashMap;

    .line 18
    return-void
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
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const-wide/16 v0, 0x0

    .line 14
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/e;->a:J

    .line 15
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/e;->c:J

    return-void
.end method

.method public final a(Lcom/tencent/bugly/traffic/TrafficMsg;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/e;->a:J

    iget v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 2
    iget v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/e;->a:J

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->b:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcom/tencent/bugly/traffic/TrafficMsg;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/traffic/TrafficMsg;-><init>(Lcom/tencent/bugly/traffic/TrafficMsg;)V

    .line 5
    iget-object v1, p0, Lcom/tencent/bugly/proguard/e;->b:Ljava/util/HashMap;

    iget-object p1, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->b:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/traffic/TrafficMsg;

    if-eqz v0, :cond_1

    .line 7
    iget v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    iget v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    .line 8
    iget v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    iget v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    .line 9
    iget-object v1, p0, Lcom/tencent/bugly/proguard/e;->b:Ljava/util/HashMap;

    iget-object p1, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;)V"
        }
    .end annotation

    .line 10
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/e;->a()V

    .line 11
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/e;->b(Ljava/util/ArrayList;)V

    return-void
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->b:Ljava/util/HashMap;

    return-object v0
.end method

.method public final b(Lcom/tencent/bugly/traffic/TrafficMsg;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/e;->c:J

    iget v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 2
    iget v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/e;->c:J

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->d:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcom/tencent/bugly/traffic/TrafficMsg;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/traffic/TrafficMsg;-><init>(Lcom/tencent/bugly/traffic/TrafficMsg;)V

    .line 5
    iget-object v1, p0, Lcom/tencent/bugly/proguard/e;->d:Ljava/util/HashMap;

    iget-object p1, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->d:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/traffic/TrafficMsg;

    if-eqz v0, :cond_1

    .line 7
    iget v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    iget v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    .line 8
    iget v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    iget v2, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    .line 9
    iget-object v1, p0, Lcom/tencent/bugly/proguard/e;->d:Ljava/util/HashMap;

    iget-object p1, p1, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final b(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;)V"
        }
    .end annotation

    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/traffic/TrafficMsg;

    .line 11
    iget-object v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    const-string v2, "auto"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mFore:I

    .line 12
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/e;->f()I

    move-result v2

    if-ne v1, v2, :cond_1

    iget v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mNet:I

    .line 13
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/e;->g()I

    move-result v2

    if-ne v1, v2, :cond_1

    .line 14
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/e;->a(Lcom/tencent/bugly/traffic/TrafficMsg;)V

    goto :goto_0

    .line 15
    :cond_1
    iget-object v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    const-string v2, "custom"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mFore:I

    .line 16
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/e;->f()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget v1, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mNet:I

    .line 17
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/e;->g()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 18
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/e;->b(Lcom/tencent/bugly/traffic/TrafficMsg;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public c()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/e;->a:J

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

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->d:Ljava/util/HashMap;

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

.method public e()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/e;->c:J

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

.method public f()I
    .locals 1

    .line 1
    const/4 v0, -0x1

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
.end method

.method public g()I
    .locals 1

    .line 1
    const/4 v0, -0x1

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
.end method
