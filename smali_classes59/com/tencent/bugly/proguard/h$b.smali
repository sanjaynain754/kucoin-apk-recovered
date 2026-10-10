.class public Lcom/tencent/bugly/proguard/h$b;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:J

.field public g:J

.field public h:I

.field public i:J

.field public j:J

.field public k:Lcom/tencent/bugly/proguard/h$c;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/h$b;->c:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/h$b;->d:Z

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/h$b;->e:Z

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/h$b;->f:J

    .line 16
    .line 17
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/h$b;->g:J

    .line 18
    .line 19
    iput v0, p0, Lcom/tencent/bugly/proguard/h$b;->h:I

    .line 20
    .line 21
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/h$b;->i:J

    .line 22
    .line 23
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/h$b;->j:J

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h$b;->k:Lcom/tencent/bugly/proguard/h$c;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h$b;->b:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    iput-object p1, p0, Lcom/tencent/bugly/proguard/h$b;->a:Ljava/lang/String;

    .line 44
    return-void
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
.method public a()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/h$b;->j:J

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/h$b;->c:Z

    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/h$b;->d:Z

    return-void
.end method

.method public a(J)V
    .locals 4

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/h$b;->c:Z

    .line 5
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/h$b;->d:Z

    .line 6
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/h$b;->e:Z

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    .line 7
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/h$b;->e:Z

    .line 8
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/h$b;->i:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    sub-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/h$b;->f:J

    return-void

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/h$b;->j:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    .line 11
    iget v2, p0, Lcom/tencent/bugly/proguard/h$b;->h:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/tencent/bugly/proguard/h$b;->h:I

    .line 12
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/h$b;->g:J

    sub-long/2addr p1, v0

    add-long/2addr p1, v2

    iput-wide p1, p0, Lcom/tencent/bugly/proguard/h$b;->g:J

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "{name: "

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/bugly/proguard/h$b;->a:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, ", firstLaunchCostInMs: "

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/h$b;->f:J

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, ", launchCountExcludeFirstTime: "

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    iget v1, p0, Lcom/tencent/bugly/proguard/h$b;->h:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v1, ", launchCostExcludeFirstTimeInMs: "

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/h$b;->g:J

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string/jumbo v1, "}"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    move-result-object v0

    .line 54
    return-object v0
    .line 55
    .line 56
    .line 57
.end method
