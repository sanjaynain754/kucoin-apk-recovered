.class final Lcom/tencent/liteav/base/http/HttpClientAndroid$a;
.super Ljava/net/Authenticator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/base/http/HttpClientAndroid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/net/Authenticator;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/base/http/HttpClientAndroid$a;->a:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/tencent/liteav/base/http/HttpClientAndroid$a;->b:Ljava/lang/String;

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
.method public final getPasswordAuthentication()Ljava/net/PasswordAuthentication;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/net/PasswordAuthentication;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/base/http/HttpClientAndroid$a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/tencent/liteav/base/http/HttpClientAndroid$a;->b:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Ljava/net/PasswordAuthentication;-><init>(Ljava/lang/String;[C)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method
