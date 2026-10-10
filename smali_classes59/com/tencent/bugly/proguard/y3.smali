.class public Lcom/tencent/bugly/proguard/y3;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# static fields
.field public static final s:I = 0x186a0

.field public static final t:I = 0x14

.field public static final u:J = 0x12cL

.field public static final v:I = 0x32

.field public static final w:I = 0x32

.field public static final x:I = 0x40

.field public static final y:I = 0x100


# instance fields
.field public final n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public o:I

.field public p:J

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const v0, 0x186a0

    .line 4
    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1, v2, v0, v1}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIF)V

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    iput-object p1, p0, Lcom/tencent/bugly/proguard/y3;->n:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 p1, 0x14

    .line 19
    .line 20
    iput p1, p0, Lcom/tencent/bugly/proguard/y3;->o:I

    .line 21
    .line 22
    const-wide/16 v0, 0x12c

    .line 23
    .line 24
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/y3;->p:J

    .line 25
    .line 26
    const/16 p1, 0x32

    .line 27
    .line 28
    iput p1, p0, Lcom/tencent/bugly/proguard/y3;->q:I

    .line 29
    .line 30
    iput p1, p0, Lcom/tencent/bugly/proguard/y3;->r:I

    .line 31
    return-void
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
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/y3;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/y3;

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/y3;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/y3;->n:Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/y3;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 6
    iget v0, p1, Lcom/tencent/bugly/proguard/y3;->o:I

    iput v0, p0, Lcom/tencent/bugly/proguard/y3;->o:I

    .line 7
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/y3;->p:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/y3;->p:J

    .line 8
    iget v0, p1, Lcom/tencent/bugly/proguard/y3;->q:I

    iput v0, p0, Lcom/tencent/bugly/proguard/y3;->q:I

    .line 9
    iget p1, p1, Lcom/tencent/bugly/proguard/y3;->r:I

    iput p1, p0, Lcom/tencent/bugly/proguard/y3;->r:I

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 0

    if-nez p1, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 11
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/y3;->b(Lorg/json/JSONObject;)V

    .line 12
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/y3;->d(Lorg/json/JSONObject;)V

    .line 13
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/y3;->c(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .line 14
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/y3;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b()Lcom/tencent/bugly/proguard/hf;
    .locals 2

    .line 1
    new-instance v0, Lcom/tencent/bugly/proguard/y3;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/hf;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/y3;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/y3;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-object v0
.end method

.method public final b(Lorg/json/JSONObject;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 3
    const-string v0, "events"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/y3;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 9
    iget-object v2, p0, Lcom/tencent/bugly/proguard/y3;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c()I
    .locals 1

    .line 7
    iget v0, p0, Lcom/tencent/bugly/proguard/y3;->o:I

    return v0
.end method

.method public final c(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    const-string v0, "dimensions_limit"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    const/16 v2, 0x32

    if-eqz v1, :cond_1

    .line 2
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-gez v0, :cond_0

    move v0, v2

    .line 3
    :cond_0
    iput v0, p0, Lcom/tencent/bugly/proguard/y3;->q:I

    .line 4
    :cond_1
    const-string/jumbo v0, "metrics_limit"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 5
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    if-gez p1, :cond_2

    goto :goto_0

    :cond_2
    move v2, p1

    .line 6
    :goto_0
    iput v2, p0, Lcom/tencent/bugly/proguard/y3;->r:I

    :cond_3
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/y3;->b()Lcom/tencent/bugly/proguard/hf;

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

.method public d()J
    .locals 4

    .line 7
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/y3;->p:J

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public final d(Lorg/json/JSONObject;)V
    .locals 7

    .line 1
    const-string v0, "batch_length"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x14

    .line 2
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v0

    .line 3
    :goto_0
    iput v1, p0, Lcom/tencent/bugly/proguard/y3;->o:I

    .line 4
    :cond_1
    const-string v0, "cache_interval_second"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-wide/16 v1, 0x12c

    .line 5
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long p1, v3, v5

    if-gez p1, :cond_2

    goto :goto_1

    :cond_2
    move-wide v1, v3

    .line 6
    :goto_1
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/y3;->p:J

    :cond_3
    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/y3;->q:I

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

.method public f()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/y3;->r:I

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
