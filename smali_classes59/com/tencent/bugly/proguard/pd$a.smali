.class public Lcom/tencent/bugly/proguard/pd$a;
.super Ljava/net/URLStreamHandler;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/pd;->createURLStreamHandler(Ljava/lang/String;)Ljava/net/URLStreamHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/tencent/bugly/proguard/pd;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/pd;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pd$a;->b:Lcom/tencent/bugly/proguard/pd;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/pd$a;->a:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/net/URLStreamHandler;-><init>()V

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
.method public getDefaultPort()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pd$a;->a:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "http"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x50

    .line 13
    return v0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pd$a;->a:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "https"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/16 v0, 0x1bb

    .line 26
    return v0

    .line 27
    .line 28
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 32
    throw v0
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

.method public openConnection(Ljava/net/URL;)Ljava/net/URLConnection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pd$a;->b:Lcom/tencent/bugly/proguard/pd;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/pd;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object p1

    return-object p1
.end method

.method public openConnection(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pd$a;->b:Lcom/tencent/bugly/proguard/pd;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/pd;->a(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;

    move-result-object p1

    return-object p1
.end method
