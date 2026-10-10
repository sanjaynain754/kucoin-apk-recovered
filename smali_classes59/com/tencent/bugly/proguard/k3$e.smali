.class public Lcom/tencent/bugly/proguard/k3$e;
.super Ljava/lang/Thread;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/k3;->a(Ljava/util/List;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lcom/tencent/bugly/proguard/k3;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/k3;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k3$e;->c:Lcom/tencent/bugly/proguard/k3;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/k3$e;->b:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

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
.method public run()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3$e;->c:Lcom/tencent/bugly/proguard/k3;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/tencent/bugly/proguard/k3$e;->b:Ljava/util/List;

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x0

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {v1 .. v7}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/List;JZZZ)V

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v1, "do upload db crash delay, upload crash num: "

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k3$e;->b:Ljava/util/List;

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 27
    move-result v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    new-array v1, v1, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 41
    return-void
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
