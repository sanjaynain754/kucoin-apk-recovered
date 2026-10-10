.class public Lcom/pichillilorenzo/flutter_inappwebview_android/types/SslErrorExt;
.super Landroid/net/http/SslError;
.source "SourceFile"


# direct methods
.method private constructor <init>(ILandroid/net/http/SslCertificate;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/net/http/SslError;-><init>(ILandroid/net/http/SslCertificate;Ljava/lang/String;)V

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

.method public static toMap(Landroid/net/http/SslError;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/http/SslError;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/net/http/SslError;->getPrimaryError()I

    .line 8
    move-result p0

    .line 9
    .line 10
    if-eqz p0, :cond_6

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-eq p0, v1, :cond_5

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    if-eq p0, v1, :cond_4

    .line 17
    const/4 v1, 0x3

    .line 18
    .line 19
    if-eq p0, v1, :cond_3

    .line 20
    const/4 v1, 0x4

    .line 21
    .line 22
    if-eq p0, v1, :cond_2

    .line 23
    const/4 v1, 0x5

    .line 24
    .line 25
    if-eq p0, v1, :cond_1

    .line 26
    move-object v1, v0

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_1
    const-string v1, "A generic error occurred"

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_2
    const-string v1, "The date of the certificate is invalid"

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_3
    const-string v1, "The certificate authority is not trusted"

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_4
    const-string v1, "Hostname mismatch"

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_5
    const-string v1, "The certificate has expired"

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_6
    const-string v1, "The certificate is not yet valid"

    .line 45
    .line 46
    :goto_0
    new-instance v2, Ljava/util/HashMap;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 50
    .line 51
    if-ltz p0, :cond_7

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    :cond_7
    const-string p0, "code"

    .line 58
    .line 59
    .line 60
    invoke-interface {v2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    const-string/jumbo p0, "message"

    .line 64
    .line 65
    .line 66
    invoke-interface {v2, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    return-object v2
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
