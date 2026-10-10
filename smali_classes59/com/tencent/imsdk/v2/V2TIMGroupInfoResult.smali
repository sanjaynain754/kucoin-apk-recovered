.class public Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;
.super Ljava/lang/Object;
.source "V2TIMGroupInfoResult.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private groupInfoGetResult:Lcom/tencent/imsdk/group/GroupInfoGetResult;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/group/GroupInfoGetResult;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/group/GroupInfoGetResult;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;->groupInfoGetResult:Lcom/tencent/imsdk/group/GroupInfoGetResult;

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
.method public getGroupInfo()Lcom/tencent/imsdk/v2/V2TIMGroupInfo;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;->groupInfoGetResult:Lcom/tencent/imsdk/group/GroupInfoGetResult;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/tencent/imsdk/group/GroupInfoGetResult;->getGroupInfo()Lcom/tencent/imsdk/group/GroupInfo;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setGroupInfo(Lcom/tencent/imsdk/group/GroupInfo;)V

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public getGroupInfoGetResult()Lcom/tencent/imsdk/group/GroupInfoGetResult;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;->groupInfoGetResult:Lcom/tencent/imsdk/group/GroupInfoGetResult;

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
    .line 17
.end method

.method public getResultCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;->groupInfoGetResult:Lcom/tencent/imsdk/group/GroupInfoGetResult;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupInfoGetResult;->getErrorCode()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public getResultMessage()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;->groupInfoGetResult:Lcom/tencent/imsdk/group/GroupInfoGetResult;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupInfoGetResult;->getErrorMessage()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public setGroupInfoGetResult(Lcom/tencent/imsdk/group/GroupInfoGetResult;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;->groupInfoGetResult:Lcom/tencent/imsdk/group/GroupInfoGetResult;

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
