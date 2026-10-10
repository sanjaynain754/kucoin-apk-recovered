.class public final Lcom/tencent/liteav/txcplayer/common/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lcom/tencent/liteav/sdk/common/HouseBuilder$d;
    .locals 3

    .line 1
    sget-object v0, Lcom/tencent/liteav/sdk/common/HouseBuilder$a;->f:Lcom/tencent/liteav/sdk/common/HouseBuilder$a;

    invoke-static {v0}, Lcom/tencent/liteav/txcplayer/common/c;->b(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Lcom/tencent/liteav/sdk/common/HouseBuilder$d;

    move-result-object v0

    .line 2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "checkValidForPlayerStandard = "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "VodLicenseCheck"

    invoke-static {v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Z
    .locals 1

    .line 3
    invoke-static {p0}, Lcom/tencent/liteav/txcplayer/common/c;->b(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Lcom/tencent/liteav/sdk/common/HouseBuilder$d;

    move-result-object p0

    sget-object v0, Lcom/tencent/liteav/sdk/common/HouseBuilder$d;->a:Lcom/tencent/liteav/sdk/common/HouseBuilder$d;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Lcom/tencent/liteav/sdk/common/HouseBuilder$d;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/sdk/common/HouseBuilder$a;->f:Lcom/tencent/liteav/sdk/common/HouseBuilder$a;

    .line 3
    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/liteav/sdk/common/HouseBuilder$a;->h:Lcom/tencent/liteav/sdk/common/HouseBuilder$a;

    .line 7
    .line 8
    if-ne p0, v0, :cond_1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lcom/tencent/liteav/txcplayer/common/VodPlayerControl;->nativeIsCheckCountLEThreshold()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object p0, Lcom/tencent/liteav/sdk/common/HouseBuilder$d;->a:Lcom/tencent/liteav/sdk/common/HouseBuilder$d;

    .line 17
    return-object p0

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-static {}, Lcom/tencent/liteav/sdk/common/HouseBuilder;->getInstance()Lcom/tencent/liteav/sdk/common/HouseBuilder;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lcom/tencent/liteav/sdk/common/HouseBuilder;->valid(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Lcom/tencent/liteav/sdk/common/HouseBuilder$d;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v2, "innerValid functionType= "

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string p0, " ,ret= "

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    move-result-object p0

    .line 48
    .line 49
    const-string v1, "VodLicenseCheck"

    .line 50
    .line 51
    .line 52
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    return-object v0
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
.end method
