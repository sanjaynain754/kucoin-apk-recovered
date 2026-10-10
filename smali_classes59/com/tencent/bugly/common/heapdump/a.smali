.class public Lcom/tencent/bugly/common/heapdump/a;
.super Lcom/tencent/bugly/common/heapdump/StripHeapDumper;
.source "BUGLY"


# static fields
.field public static final p:Ljava/lang/String; = "RMonitor_Heap_StandardHeapDumper"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;-><init>()V

    .line 4
    return-void
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


# virtual methods
.method public a(Ljava/lang/String;Lcom/tencent/bugly/proguard/r7;)I
    .locals 5
    .param p2    # Lcom/tencent/bugly/proguard/r7;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v1, "standard dumper dump start."

    const-string v2, "RMonitor_Heap_StandardHeapDumper"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 3
    new-instance v1, Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v3}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;-><init>(ZLjava/io/IOException;)V

    .line 4
    invoke-virtual {p0, p1, p2, v1}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->a(Ljava/lang/String;Lcom/tencent/bugly/proguard/r7;Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;)V

    .line 5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "standard dumper dump result: "

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 6
    iget-boolean p1, v1, Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;->a:Z

    if-nez p1, :cond_0

    .line 7
    iget-object p1, v1, Lcom/tencent/bugly/common/heapdump/StripHeapDumper$a;->b:Ljava/io/IOException;

    invoke-virtual {p0, p2, p1}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->a(Lcom/tencent/bugly/proguard/r7;Ljava/lang/Exception;)V

    const/16 p1, 0x6b

    return p1

    :cond_0
    return v4
.end method

.method public a()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method
