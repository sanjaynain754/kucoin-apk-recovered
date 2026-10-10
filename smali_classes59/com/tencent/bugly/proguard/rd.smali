.class public Lcom/tencent/bugly/proguard/rd;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lokhttp3/EventListener$Factory;


# static fields
.field public static final b:Ljava/lang/String; = "Okhttp3ListenerFactory"


# instance fields
.field public final a:Lokhttp3/EventListener$Factory;


# direct methods
.method public constructor <init>(Lokhttp3/EventListener$Factory;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/proguard/rd;->a:Lokhttp3/EventListener$Factory;

    .line 6
    return-void
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public create(Lokhttp3/Call;)Lokhttp3/EventListener;
    .locals 3
    .param p1    # Lokhttp3/Call;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/rd;->a:Lokhttp3/EventListener$Factory;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lokhttp3/EventListener$Factory;->create(Lokhttp3/Call;)Lokhttp3/EventListener;

    .line 8
    move-result-object p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    new-instance p1, Lcom/tencent/bugly/proguard/qd;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/qd;-><init>()V

    .line 18
    return-object p1

    .line 19
    .line 20
    .line 21
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    const-string/jumbo v1, "okhttp3"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 33
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    return-object p1

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    .line 39
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 40
    .line 41
    const-string v2, "get listener clz fail, throwable "

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    const-string v2, "Okhttp3ListenerFactory"

    .line 48
    .line 49
    .line 50
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 55
    .line 56
    :cond_2
    new-instance v0, Lcom/tencent/bugly/proguard/qd;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/qd;-><init>(Lokhttp3/EventListener;)V

    .line 60
    return-object v0
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
