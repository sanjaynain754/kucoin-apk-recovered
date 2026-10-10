.class public Lcom/tencent/bugly/proguard/bh$b;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/bh$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/bh;->a(Ljava/lang/String;Z)Lcom/tencent/bugly/proguard/bh$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/bugly/proguard/bh$c;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/bh$c;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/bh$b;->a:Lcom/tencent/bugly/proguard/bh$c;

    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/tencent/bugly/proguard/bh$b;->b:Z

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public a(J)Z
    .locals 0

    .line 13
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo p2, "process end %d"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 p1, 0x0

    return p1
.end method

.method public a(JJLjava/lang/String;)Z
    .locals 2

    .line 8
    filled-new-array {p5}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "new process %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bh$b;->a:Lcom/tencent/bugly/proguard/bh$c;

    iput-wide p1, v0, Lcom/tencent/bugly/proguard/bh$c;->a:J

    .line 10
    iput-object p5, v0, Lcom/tencent/bugly/proguard/bh$c;->b:Ljava/lang/String;

    .line 11
    iput-wide p3, v0, Lcom/tencent/bugly/proguard/bh$c;->c:J

    .line 12
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/bh$b;->b:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)Z
    .locals 1

    .line 2
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p5

    const-string/jumbo v0, "new thread %s"

    invoke-static {v0, p5}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 3
    iget-object p5, p0, Lcom/tencent/bugly/proguard/bh$b;->a:Lcom/tencent/bugly/proguard/bh$c;

    iget-object v0, p5, Lcom/tencent/bugly/proguard/bh$c;->d:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p5, Lcom/tencent/bugly/proguard/bh$c;->d:Ljava/util/Map;

    .line 5
    :cond_0
    iget-object p5, p0, Lcom/tencent/bugly/proguard/bh$b;->a:Lcom/tencent/bugly/proguard/bh$c;

    iget-object p5, p5, Lcom/tencent/bugly/proguard/bh$c;->d:Ljava/util/Map;

    .line 6
    const-string v0, ""

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/vi;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    .line 7
    filled-new-array {p3, p4, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-interface {p5, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public a(Ljava/lang/String;JJ)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    return p1
.end method
