.class public final Lcom/geetest/gtc4/d7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static a(Landroid/os/IBinder;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    :try_start_0
    sget v0, Lcom/geetest/gtc4/b5;->a:I

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    const/4 p0, 0x0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    const-string v0, "com.tencent.soter.soterserver.ISoterService"

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    instance-of v1, v0, Lcom/geetest/gtc4/c5;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    move-object p0, v0

    .line 20
    .line 21
    check-cast p0, Lcom/geetest/gtc4/c5;

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_1
    new-instance v0, Lcom/geetest/gtc4/a5;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/geetest/gtc4/a5;-><init>(Landroid/os/IBinder;)V

    .line 28
    move-object p0, v0

    .line 29
    .line 30
    :goto_0
    check-cast p0, Lcom/geetest/gtc4/a5;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/geetest/gtc4/a5;->a()Lcom/geetest/gtc4/soter/com/tencent/soter/soterserver/SoterDeviceResult;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    iget-object p0, p0, Lcom/geetest/gtc4/soter/com/tencent/soter/soterserver/SoterDeviceResult;->b:[B

    .line 37
    const/4 v0, 0x0

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 45
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    return-object p0

    .line 47
    .line 48
    :catch_0
    const-string p0, ""

    .line 49
    return-object p0
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
.end method
