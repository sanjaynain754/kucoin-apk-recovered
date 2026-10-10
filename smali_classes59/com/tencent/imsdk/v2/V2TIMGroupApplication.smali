.class public Lcom/tencent/imsdk/v2/V2TIMGroupApplication;
.super Ljava/lang/Object;
.source "V2TIMGroupApplication.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final V2TIM_GROUP_APPLICATION_HANDLE_RESULT_AGREE:I = 0x1

.field public static final V2TIM_GROUP_APPLICATION_HANDLE_RESULT_REFUSE:I = 0x0

.field public static final V2TIM_GROUP_APPLICATION_HANDLE_STATUS_HANDLED_BY_OTHER:I = 0x1

.field public static final V2TIM_GROUP_APPLICATION_HANDLE_STATUS_HANDLED_BY_SELF:I = 0x2

.field public static final V2TIM_GROUP_APPLICATION_HANDLE_STATUS_UNHANDLED:I = 0x0

.field public static final V2TIM_GROUP_INVITE_APPLICATION_NEED_APPROVED_BY_ADMIN:I = 0x2

.field public static final V2TIM_GROUP_INVITE_APPLICATION_NEED_APPROVED_BY_INVITEE:I = 0x1

.field public static final V2TIM_GROUP_JOIN_APPLICATION_NEED_APPROVED_BY_ADMIN:I


# instance fields
.field private groupApplication:Lcom/tencent/imsdk/group/GroupApplication;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/group/GroupApplication;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/group/GroupApplication;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

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
.method public getAddTime()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupApplication;->getRequestTime()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public getApplicationType()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupApplication;->getApplicationType()I

    .line 6
    move-result v0

    .line 7
    .line 8
    sget v1, Lcom/tencent/imsdk/group/GroupApplication;->REQUEST_TYPE_JOIN:I

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    return v2

    .line 13
    .line 14
    :cond_0
    sget v1, Lcom/tencent/imsdk/group/GroupApplication;->REQUEST_TYPE_INVITE_TO_INVITEE:I

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    .line 20
    :cond_1
    sget v1, Lcom/tencent/imsdk/group/GroupApplication;->REQUEST_TYPE_INVITE_TO_ADMIN:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    const/4 v0, 0x2

    .line 24
    return v0

    .line 25
    :cond_2
    return v2
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

.method public getFromUser()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupApplication;->getFromUserID()Ljava/lang/String;

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

.method public getFromUserFaceUrl()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupApplication;->getFromUserFaceUrl()Ljava/lang/String;

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

.method public getFromUserNickName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupApplication;->getFromUserNickName()Ljava/lang/String;

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

.method public getGroupApplication()Lcom/tencent/imsdk/group/GroupApplication;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

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

.method public getGroupID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupApplication;->getGroupID()Ljava/lang/String;

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

.method public getHandleResult()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupApplication;->getResponseType()I

    .line 6
    move-result v0

    .line 7
    .line 8
    sget v1, Lcom/tencent/imsdk/group/GroupApplication;->RESPONSE_TYPE_AGREE:I

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    return v2

    .line 13
    .line 14
    :cond_0
    sget v1, Lcom/tencent/imsdk/group/GroupApplication;->RESPONSE_TYPE_REFUSE:I

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_1
    return v2
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
.end method

.method public getHandleStatus()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupApplication;->getResponseStatus()I

    .line 6
    move-result v0

    .line 7
    .line 8
    sget v1, Lcom/tencent/imsdk/group/GroupApplication;->RESPONSE_STATUS_UNHANDLED:I

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    return v2

    .line 13
    .line 14
    :cond_0
    sget v1, Lcom/tencent/imsdk/group/GroupApplication;->RESPONSE_STATUS_HANDLED_BY_OTHER:I

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    .line 20
    :cond_1
    sget v1, Lcom/tencent/imsdk/group/GroupApplication;->RESPONSE_STATUS_HANDLED_BY_SELF:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    const/4 v0, 0x2

    .line 24
    return v0

    .line 25
    :cond_2
    return v2
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

.method public getHandledMsg()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupApplication;->getResponseMessage()Ljava/lang/String;

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

.method public getRequestMsg()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupApplication;->getRequestMessage()Ljava/lang/String;

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

.method public getToUser()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupApplication;->getToUserID()Ljava/lang/String;

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

.method public setGroupApplication(Lcom/tencent/imsdk/group/GroupApplication;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;->groupApplication:Lcom/tencent/imsdk/group/GroupApplication;

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
