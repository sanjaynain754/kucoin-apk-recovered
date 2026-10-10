.class public Lcom/tencent/bugly/proguard/si$a;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/si;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:F

.field public c:F

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/si$a;->a:Ljava/lang/String;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput v0, p0, Lcom/tencent/bugly/proguard/si$a;->b:F

    .line 10
    .line 11
    .line 12
    const v0, 0x3dcccccd    # 0.1f

    .line 13
    .line 14
    iput v0, p0, Lcom/tencent/bugly/proguard/si$a;->c:F

    .line 15
    .line 16
    const-wide/16 v0, 0x1f4

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/si$a;->d:J

    .line 19
    .line 20
    const-wide/16 v0, 0x12c

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/si$a;->e:J

    .line 23
    .line 24
    const-wide/16 v0, 0x4e20

    .line 25
    .line 26
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/si$a;->f:J

    .line 27
    return-void
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
.method public a(Lcom/tencent/bugly/proguard/si$a;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p1, Lcom/tencent/bugly/proguard/si$a;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/si$a;->a:Ljava/lang/String;

    .line 2
    iget v0, p1, Lcom/tencent/bugly/proguard/si$a;->b:F

    iput v0, p0, Lcom/tencent/bugly/proguard/si$a;->b:F

    .line 3
    iget v0, p1, Lcom/tencent/bugly/proguard/si$a;->c:F

    iput v0, p0, Lcom/tencent/bugly/proguard/si$a;->c:F

    .line 4
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/si$a;->d:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/si$a;->d:J

    .line 5
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/si$a;->e:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/si$a;->e:J

    .line 6
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/si$a;->f:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/si$a;->f:J

    return-void
.end method

.method public a()Z
    .locals 4

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/si$a;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/tencent/bugly/proguard/si$a;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Lcom/tencent/bugly/proguard/si$a;->e:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Lcom/tencent/bugly/proguard/si$a;->f:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
