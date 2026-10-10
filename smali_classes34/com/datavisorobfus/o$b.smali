.class Lcom/datavisorobfus/o$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/datavisorobfus/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/datavisorobfus/o;


# direct methods
.method private constructor <init>(Lcom/datavisorobfus/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/datavisorobfus/o$b;->a:Lcom/datavisorobfus/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/datavisorobfus/o;Lcom/datavisorobfus/o$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/datavisorobfus/o$b;-><init>(Lcom/datavisorobfus/o;)V

    return-void
.end method


# virtual methods
.method public receiveIP(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/datavisorobfus/o$b;->a:Lcom/datavisorobfus/o;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/datavisorobfus/o;->a(Lcom/datavisorobfus/o;)Lcom/datavisorobfus/o$c;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string p1, "empty"

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/datavisorobfus/o$b;->a:Lcom/datavisorobfus/o;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/datavisorobfus/o;->a(Lcom/datavisorobfus/o;)Lcom/datavisorobfus/o$c;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p1}, Lcom/datavisorobfus/o$c;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :catchall_0
    :cond_1
    return-void
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
.end method
