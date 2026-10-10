.class public Lcom/tencent/bugly/proguard/ji$a$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/io/FileFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/ji$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/bugly/proguard/ki;

.field public final synthetic b:Lcom/tencent/bugly/proguard/ji$a;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/ji$a;Lcom/tencent/bugly/proguard/ki;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ji$a$a;->b:Lcom/tencent/bugly/proguard/ji$a;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/ji$a$a;->a:Lcom/tencent/bugly/proguard/ki;

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
.method public accept(Ljava/io/File;)Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ji$a$a;->b:Lcom/tencent/bugly/proguard/ji$a;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ji;->a(Ljava/lang/String;I)Z

    .line 19
    move-result p1

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    const-string p1, ".so"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 27
    move-result p1

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    const-string p1, ".odex"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 35
    move-result p1

    .line 36
    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    const-string p1, ".oat"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 43
    move-result p1

    .line 44
    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    const-string p1, ".dex"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 51
    move-result p1

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    .line 56
    :cond_0
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    const-string v2, "Matrix.WarmUpDelegate"

    .line 60
    .line 61
    const-string v3, "Warming up so %s"

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v3, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ji$a$a;->a:Lcom/tencent/bugly/proguard/ki;

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v0, v1}, Lcom/tencent/bugly/proguard/ki;->a(Ljava/lang/String;I)Z

    .line 70
    move-result p1

    .line 71
    .line 72
    if-nez p1, :cond_1

    .line 73
    .line 74
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ji$a$a;->b:Lcom/tencent/bugly/proguard/ji$a;

    .line 75
    .line 76
    iget-object p1, p1, Lcom/tencent/bugly/proguard/ji$a;->c:Lcom/tencent/bugly/proguard/ji;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ji;->b(Ljava/lang/String;I)V

    .line 80
    :cond_1
    return v1
    .line 81
.end method
