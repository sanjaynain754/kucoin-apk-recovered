.class public Lcom/tencent/bugly/proguard/bh$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/bh$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/bh;->a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/tencent/bugly/proguard/bh$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/bugly/proguard/bh$c;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/bh$c;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/bh$a;->a:Lcom/tencent/bugly/proguard/bh$c;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/bh$a;->b:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p3, p0, Lcom/tencent/bugly/proguard/bh$a;->c:Z

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public a(J)Z
    .locals 4

    .line 15
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo p2, "process end %d"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 16
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bh$a;->a:Lcom/tencent/bugly/proguard/bh$c;

    iget-wide v0, p1, Lcom/tencent/bugly/proguard/bh$c;->a:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-lez p2, :cond_1

    iget-wide v0, p1, Lcom/tencent/bugly/proguard/bh$c;->c:J

    cmp-long p2, v0, v2

    if-lez p2, :cond_1

    iget-object p1, p1, Lcom/tencent/bugly/proguard/bh$c;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public a(JJLjava/lang/String;)Z
    .locals 2

    .line 9
    filled-new-array {p5}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "new process %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bh$a;->b:Ljava/lang/String;

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bh$a;->a:Lcom/tencent/bugly/proguard/bh$c;

    iput-wide p1, v0, Lcom/tencent/bugly/proguard/bh$c;->a:J

    .line 12
    iput-object p5, v0, Lcom/tencent/bugly/proguard/bh$c;->b:Ljava/lang/String;

    .line 13
    iput-wide p3, v0, Lcom/tencent/bugly/proguard/bh$c;->c:J

    .line 14
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/bh$a;->c:Z

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v1
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)Z
    .locals 6

    .line 2
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p5

    const-string/jumbo v0, "new thread %s"

    invoke-static {v0, p5}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 3
    iget-object p5, p0, Lcom/tencent/bugly/proguard/bh$a;->a:Lcom/tencent/bugly/proguard/bh$c;

    iget-wide v0, p5, Lcom/tencent/bugly/proguard/bh$c;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-lez v0, :cond_2

    iget-wide v4, p5, Lcom/tencent/bugly/proguard/bh$c;->c:J

    cmp-long v0, v4, v2

    if-lez v0, :cond_2

    iget-object v0, p5, Lcom/tencent/bugly/proguard/bh$c;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p5, Lcom/tencent/bugly/proguard/bh$c;->d:Ljava/util/Map;

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p5, Lcom/tencent/bugly/proguard/bh$c;->d:Ljava/util/Map;

    .line 6
    :cond_1
    iget-object p5, p0, Lcom/tencent/bugly/proguard/bh$a;->a:Lcom/tencent/bugly/proguard/bh$c;

    iget-object p5, p5, Lcom/tencent/bugly/proguard/bh$c;->d:Ljava/util/Map;

    .line 7
    const-string v0, ""

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/vi;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    .line 8
    filled-new-array {p3, p4, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-interface {p5, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return v1
.end method

.method public a(Ljava/lang/String;JJ)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    return p1
.end method
