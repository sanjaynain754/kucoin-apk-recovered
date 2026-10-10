.class public Lcom/tencent/rtmp/TXPlayerDrmBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static DEFAULT_CN_PROVISION_URL:Ljava/lang/String;

.field private static DEFAULT_COM_PROVISION_URL:Ljava/lang/String;


# instance fields
.field mDeviceCertificateUrl:Ljava/lang/String;

.field mKeyLicenseUrl:Ljava/lang/String;

.field mPlayUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-direct {p0}, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->initProvision()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-direct {p0}, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->initProvision()V

    .line 5
    iput-object p1, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mKeyLicenseUrl:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mPlayUrl:Ljava/lang/String;

    return-void
.end method

.method private initProvision()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->DEFAULT_COM_PROVISION_URL:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "aHR0cHM6Ly93d3cuZ29vZ2xlYXBpcy5jb20vY2VydGlmaWNhdGVwcm92aXNpb25pbmcvdjEvZGV2aWNlY2VydGlmaWNhdGVzL2NyZWF0ZT9rZXk9QUl6YVN5Qi01T0xLVHgyaVU1bWtvMThEZmR3SzU2MTFKSWpiVWhF"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/liteav/txcplayer/a/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->DEFAULT_COM_PROVISION_URL:Ljava/lang/String;

    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->DEFAULT_CN_PROVISION_URL:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const-string v0, "aHR0cHM6Ly93d3cuZ29vZ2xlYXBpcy5jbi9jZXJ0aWZpY2F0ZXByb3Zpc2lvbmluZy92MS9kZXZpY2VjZXJ0aWZpY2F0ZXMvY3JlYXRlP2tleT1BSXphU3lCLTVPTEtUeDJpVTVta28xOERmZHdLNTYxMUpJamJVaEU="

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/tencent/liteav/txcplayer/a/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    sput-object v0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->DEFAULT_CN_PROVISION_URL:Ljava/lang/String;

    .line 33
    :cond_1
    return-void
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
.end method


# virtual methods
.method public getDeviceCertificateUrl()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mDeviceCertificateUrl:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mDeviceCertificateUrl:Ljava/lang/String;

    .line 11
    return-object v0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {}, Lcom/tencent/rtmp/TXPlayerGlobalSetting;->getDrmProvisionEnv()Lcom/tencent/rtmp/TXPlayerGlobalSetting$DrmProvisionEnv;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    sget-object v1, Lcom/tencent/rtmp/TXPlayerGlobalSetting$DrmProvisionEnv;->DRM_PROVISION_ENV_COM:Lcom/tencent/rtmp/TXPlayerGlobalSetting$DrmProvisionEnv;

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    sget-object v0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->DEFAULT_COM_PROVISION_URL:Ljava/lang/String;

    .line 22
    return-object v0

    .line 23
    .line 24
    :cond_1
    sget-object v0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->DEFAULT_CN_PROVISION_URL:Ljava/lang/String;

    .line 25
    return-object v0
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
.end method

.method public getKeyLicenseUrl()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mKeyLicenseUrl:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public getPlayUrl()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mPlayUrl:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public setDeviceCertificateUrl(Ljava/lang/String;)Lcom/tencent/rtmp/TXPlayerDrmBuilder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mDeviceCertificateUrl:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
.end method

.method public setKeyLicenseUrl(Ljava/lang/String;)Lcom/tencent/rtmp/TXPlayerDrmBuilder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mKeyLicenseUrl:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
.end method

.method public setPlayUrl(Ljava/lang/String;)Lcom/tencent/rtmp/TXPlayerDrmBuilder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mPlayUrl:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "TXPlayerDrmBuilder{deviceCertificateUrl=\'"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mDeviceCertificateUrl:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const/16 v1, 0x27

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, ", licenseUrl=\'"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mKeyLicenseUrl:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, ", playUrl=\'"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    iget-object v2, p0, Lcom/tencent/rtmp/TXPlayerDrmBuilder;->mPlayUrl:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const/16 v1, 0x7d

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    move-result-object v0

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
    .line 82
    .line 83
    .line 84
.end method
