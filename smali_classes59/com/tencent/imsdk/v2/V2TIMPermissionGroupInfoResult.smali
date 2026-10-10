.class public Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfoResult;
.super Ljava/lang/Object;
.source "V2TIMPermissionGroupInfoResult.java"


# instance fields
.field private permissionGroupInfoGetResult:Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfoResult;->permissionGroupInfoGetResult:Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public getPermissionGroupInfo()Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfoResult;->permissionGroupInfoGetResult:Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;-><init>()V

    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfoResult;->permissionGroupInfoGetResult:Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;->getPermissionGroupInfo()Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->setPermissionGroupInfo(Lcom/tencent/imsdk/community/PermissionGroupInfo;)V

    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
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
.end method

.method public getResultCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfoResult;->permissionGroupInfoGetResult:Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;->getErrorCode()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getResultMessage()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfoResult;->permissionGroupInfoGetResult:Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;->getErrorMessage()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    const-string v0, ""

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public setPermissionGroupInfoGetResult(Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfoResult;->permissionGroupInfoGetResult:Lcom/tencent/imsdk/community/PermissionGroupInfoGetResult;

    .line 3
    return-void
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
    .line 25
.end method
