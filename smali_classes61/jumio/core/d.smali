.class public final Ljumio/core/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ljava/net/HttpURLConnection;

.field public final b:Lcom/jumio/core/network/EncryptionProvider;


# direct methods
.method public constructor <init>(Ljava/net/HttpURLConnection;Lcom/jumio/core/network/EncryptionProvider;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "httpURLConnection"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "encryptionProvider"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Ljumio/core/d;->a:Ljava/net/HttpURLConnection;

    .line 16
    .line 17
    iput-object p2, p0, Ljumio/core/d;->b:Lcom/jumio/core/network/EncryptionProvider;

    .line 18
    return-void
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
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Ljumio/core/d;->a:Ljava/net/HttpURLConnection;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    iget-object v0, p0, Ljumio/core/d;->b:Lcom/jumio/core/network/EncryptionProvider;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Lcom/jumio/core/network/EncryptionProvider;->finishRequest()V

    .line 11
    .line 12
    iget-object v0, p0, Ljumio/core/d;->a:Ljava/net/HttpURLConnection;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception v0

    .line 20
    .line 21
    .line 22
    :try_start_1
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    iget-object v0, p0, Ljumio/core/d;->b:Lcom/jumio/core/network/EncryptionProvider;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Lcom/jumio/core/network/EncryptionProvider;->finishRequest()V

    .line 28
    .line 29
    iget-object v0, p0, Ljumio/core/d;->a:Ljava/net/HttpURLConnection;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 33
    return-void

    .line 34
    .line 35
    :goto_0
    iget-object v1, p0, Ljumio/core/d;->b:Lcom/jumio/core/network/EncryptionProvider;

    .line 36
    .line 37
    .line 38
    invoke-interface {v1}, Lcom/jumio/core/network/EncryptionProvider;->finishRequest()V

    .line 39
    .line 40
    iget-object v1, p0, Ljumio/core/d;->a:Ljava/net/HttpURLConnection;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 44
    throw v0
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
    .line 106
    .line 107
.end method
