.class public Lcom/tencent/bugly/proguard/vg;
.super Lcom/tencent/bugly/proguard/nh;
.source "BUGLY"


# static fields
.field public static final n:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/nh;-><init>()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 6
    const/4 v1, 0x2

    .line 7
    .line 8
    iput-short v1, v0, Lcom/tencent/bugly/proguard/sf;->q:S

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    iput-byte v1, v0, Lcom/tencent/bugly/proguard/sf;->r:B

    .line 12
    .line 13
    iput v1, v0, Lcom/tencent/bugly/proguard/sf;->s:I

    .line 14
    .line 15
    iput v1, v0, Lcom/tencent/bugly/proguard/sf;->x:I

    .line 16
    .line 17
    new-array v1, v1, [B

    .line 18
    .line 19
    iput-object v1, v0, Lcom/tencent/bugly/proguard/sf;->w:[B

    .line 20
    .line 21
    new-instance v1, Ljava/util/HashMap;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    iput-object v1, v0, Lcom/tencent/bugly/proguard/sf;->y:Ljava/util/Map;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 29
    .line 30
    new-instance v1, Ljava/util/HashMap;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    iput-object v1, v0, Lcom/tencent/bugly/proguard/sf;->z:Ljava/util/Map;

    .line 36
    return-void
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
.method public a(B)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iput-byte p1, v0, Lcom/tencent/bugly/proguard/sf;->r:B

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iput-object p1, v0, Lcom/tencent/bugly/proguard/sf;->y:Ljava/util/Map;

    return-void
.end method

.method public a(S)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iput-short p1, v0, Lcom/tencent/bugly/proguard/sf;->q:S

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nh;->g()V

    :cond_0
    return-void
.end method

.method public b(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iput-object p1, v0, Lcom/tencent/bugly/proguard/sf;->z:Ljava/util/Map;

    .line 5
    return-void
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

.method public c(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iput p1, v0, Lcom/tencent/bugly/proguard/sf;->s:I

    .line 5
    return-void
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

.method public d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iput p1, v0, Lcom/tencent/bugly/proguard/sf;->x:I

    return-void
.end method

.method public d([B)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iput-object p1, v0, Lcom/tencent/bugly/proguard/sf;->w:[B

    return-void
.end method

.method public n()[B
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/bugly/proguard/sf;->w:[B

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

.method public o()Ljava/util/Map;
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
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/bugly/proguard/sf;->y:Ljava/util/Map;

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

.method public p()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/bugly/proguard/sf;->s:I

    .line 5
    return v0
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

.method public q()B
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget-byte v0, v0, Lcom/tencent/bugly/proguard/sf;->r:B

    .line 5
    return v0
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

.method public r()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/bugly/proguard/sf;->z:Ljava/util/Map;

    .line 5
    .line 6
    const-string v1, "STATUS_RESULT_CODE"

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
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

.method public s()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/bugly/proguard/sf;->z:Ljava/util/Map;

    .line 5
    .line 6
    const-string v1, "STATUS_RESULT_DESC"

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    const-string v0, ""

    .line 18
    return-object v0
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

.method public t()Ljava/util/Map;
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
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/bugly/proguard/sf;->z:Ljava/util/Map;

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

.method public u()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/bugly/proguard/sf;->x:I

    .line 5
    return v0
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

.method public v()S
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget-short v0, v0, Lcom/tencent/bugly/proguard/sf;->q:S

    .line 5
    return v0
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
