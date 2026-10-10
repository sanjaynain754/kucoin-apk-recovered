.class public Lcom/tencent/bugly/proguard/e3;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/tencent/bugly/proguard/e3;",
        ">;"
    }
.end annotation


# instance fields
.field public b:J

.field public c:J

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:Z

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, -0x1

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/e3;->b:J

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/e3;->c:J

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/proguard/e3;->d:Ljava/lang/String;

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/e3;->e:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/e3;->f:Z

    .line 18
    .line 19
    iput v0, p0, Lcom/tencent/bugly/proguard/e3;->g:I

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


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/e3;)I
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/e3;->c:J

    .line 6
    .line 7
    iget-wide v3, p1, Lcom/tencent/bugly/proguard/e3;->c:J

    .line 8
    sub-long/2addr v1, v3

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long p1, v1, v3

    .line 13
    .line 14
    if-lez p1, :cond_0

    .line 15
    return v0

    .line 16
    .line 17
    :cond_0
    if-gez p1, :cond_1

    .line 18
    const/4 p1, -0x1

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_2
    return v0
    .line 23
    .line 24
    .line 25
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/tencent/bugly/proguard/e3;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/e3;->a(Lcom/tencent/bugly/proguard/e3;)I

    .line 6
    move-result p1

    .line 7
    return p1
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
