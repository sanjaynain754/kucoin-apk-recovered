.class public Lcom/tencent/bugly/proguard/jf;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final e:I = 0x78


# instance fields
.field public a:I

.field public b:J

.field public final c:[J

.field public final d:[J


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x78

    .line 6
    .line 7
    new-array v1, v0, [J

    .line 8
    .line 9
    iput-object v1, p0, Lcom/tencent/bugly/proguard/jf;->c:[J

    .line 10
    .line 11
    new-array v1, v0, [J

    .line 12
    .line 13
    iput-object v1, p0, Lcom/tencent/bugly/proguard/jf;->d:[J

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    iput v1, p0, Lcom/tencent/bugly/proguard/jf;->a:I

    .line 17
    .line 18
    :goto_0
    if-ge v1, v0, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Lcom/tencent/bugly/proguard/jf;->c:[J

    .line 21
    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    aput-wide v3, v2, v1

    .line 25
    .line 26
    iget-object v2, p0, Lcom/tencent/bugly/proguard/jf;->d:[J

    .line 27
    .line 28
    aput-wide v3, v2, v1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
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
.method public a()F
    .locals 10

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    move-wide v3, v0

    move-wide v5, v3

    :goto_0
    const/16 v7, 0x78

    if-ge v2, v7, :cond_1

    .line 6
    iget-object v7, p0, Lcom/tencent/bugly/proguard/jf;->c:[J

    aget-wide v8, v7, v2

    cmp-long v7, v8, v0

    if-eqz v7, :cond_0

    add-long/2addr v3, v8

    .line 7
    iget-object v7, p0, Lcom/tencent/bugly/proguard/jf;->d:[J

    aget-wide v8, v7, v2

    add-long/2addr v5, v8

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    cmp-long v0, v3, v0

    if-lez v0, :cond_2

    sub-long v0, v3, v5

    long-to-float v0, v0

    long-to-float v1, v3

    div-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public a(JJJ)V
    .locals 1

    .line 1
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/jf;->b:J

    .line 2
    iget p1, p0, Lcom/tencent/bugly/proguard/jf;->a:I

    const/16 p2, 0x78

    if-ltz p1, :cond_0

    if-ge p1, p2, :cond_0

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/jf;->c:[J

    aput-wide p3, v0, p1

    .line 4
    iget-object p3, p0, Lcom/tencent/bugly/proguard/jf;->d:[J

    aput-wide p5, p3, p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 5
    rem-int/2addr p1, p2

    iput p1, p0, Lcom/tencent/bugly/proguard/jf;->a:I

    return-void
.end method

.method public b()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/jf;->b:J

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
