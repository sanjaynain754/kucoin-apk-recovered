.class public Lcom/tencent/imsdk/v2/V2TIMTopicInfo;
.super Ljava/lang/Object;
.source "V2TIMTopicInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final V2TIM_TOPIC_ADD_ANY:I = 0x2

.field public static final V2TIM_TOPIC_ADD_AUTH:I = 0x1

.field public static final V2TIM_TOPIC_ADD_FORBID:I


# instance fields
.field private modifyFlag:I

.field private topicInfo:Lcom/tencent/imsdk/community/TopicInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/community/TopicInfo;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/community/TopicInfo;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic access$000(Lcom/tencent/imsdk/v2/V2TIMTopicInfo;)Lcom/tencent/imsdk/community/TopicInfo;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

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
    .line 25
.end method


# virtual methods
.method public getCreateTime()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getCreateTime()J

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

.method public getCustomString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getTopicCustomString()Ljava/lang/String;

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

.method public getDefaultPermissions()Ljava/lang/Long;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getDefaultPermissions()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getDraftText()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getDraftMessage()Lcom/tencent/imsdk/message/DraftMessage;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-object v1

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/DraftMessage;->getUserDefinedData()[B

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    new-instance v1, Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 22
    :cond_1
    return-object v1
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

.method public getGroupAtInfoList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMGroupAtInfo;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/tencent/imsdk/community/TopicInfo;->getConversationAtInfoList()Ljava/util/List;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Lcom/tencent/imsdk/conversation/ConversationAtInfo;

    .line 28
    .line 29
    new-instance v3, Lcom/tencent/imsdk/v2/V2TIMGroupAtInfo;

    .line 30
    .line 31
    .line 32
    invoke-direct {v3}, Lcom/tencent/imsdk/v2/V2TIMGroupAtInfo;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupAtInfo;->setConversationGroupAtInfo(Lcom/tencent/imsdk/conversation/ConversationAtInfo;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-object v0
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

.method public getIntroduction()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getIntroduction()Ljava/lang/String;

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

.method public getLastMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getLastMessage()Lcom/tencent/imsdk/message/Message;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    .line 12
    :cond_0
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMMessage;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 19
    return-object v1
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

.method public getMemberMaxCount()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getMemberMaxCount()J

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

.method public getModifyFlag()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 3
    return v0
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

.method public getNotification()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getNotification()Ljava/lang/String;

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

.method public getReadSequence()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getReadSequence()J

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

.method public getRecvOpt()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getMessageReceiveOption()I

    .line 6
    move-result v0

    .line 7
    .line 8
    sget v1, Lcom/tencent/imsdk/group/GroupMemberInfo;->MESSAGE_RECEIVE_OPTION_AUTO_RECEIVE:I

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
    sget v1, Lcom/tencent/imsdk/group/GroupMemberInfo;->MESSAGE_RECEIVE_OPTION_NOT_RECEIVE:I

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
    sget v1, Lcom/tencent/imsdk/group/GroupMemberInfo;->MESSAGE_RECEIVE_OPTION_RECEIVE_WITH_NO_OFFLINE_PUSH:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    const/4 v0, 0x2

    .line 24
    return v0

    .line 25
    .line 26
    :cond_2
    sget v1, Lcom/tencent/imsdk/group/GroupMemberInfo;->MESSAGE_RECEIVE_OPTION_RECEIVE_WITH_NO_OFFLINE_PUSH_EXCEPT_AT:I

    .line 27
    .line 28
    if-ne v0, v1, :cond_3

    .line 29
    const/4 v0, 0x3

    .line 30
    return v0

    .line 31
    .line 32
    :cond_3
    sget v1, Lcom/tencent/imsdk/group/GroupMemberInfo;->MESSAGE_RECEIVE_OPTION_NOT_RECEIVE_EXCEPT_AT:I

    .line 33
    .line 34
    if-ne v0, v1, :cond_4

    .line 35
    const/4 v0, 0x4

    .line 36
    return v0

    .line 37
    :cond_4
    return v2
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

.method public getSelfMuteTime()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getSelfMuteTime()J

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

.method public getTopicAddOpt()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getTopicAddOpt()I

    .line 6
    move-result v0

    .line 7
    .line 8
    sget v1, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_ALLOW_ANY:I

    .line 9
    const/4 v2, 0x2

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    return v2

    .line 13
    .line 14
    :cond_0
    sget v1, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_FORBID_ANY:I

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    .line 20
    :cond_1
    sget v1, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_NEED_AUTHENTICATION:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    const/4 v0, 0x1

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

.method public getTopicApproveOpt()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getTopicApproveOpt()I

    .line 6
    move-result v0

    .line 7
    .line 8
    sget v1, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_ALLOW_ANY:I

    .line 9
    const/4 v2, 0x2

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    return v2

    .line 13
    .line 14
    :cond_0
    sget v1, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_FORBID_ANY:I

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    .line 20
    :cond_1
    sget v1, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_NEED_AUTHENTICATION:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    const/4 v0, 0x1

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

.method public getTopicFaceUrl()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getFaceUrl()Ljava/lang/String;

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

.method public getTopicID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getTopicID()Ljava/lang/String;

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

.method public getTopicInfo()Lcom/tencent/imsdk/community/TopicInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

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

.method public getTopicName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getTopicName()Ljava/lang/String;

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

.method public getTopicType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getTopicType()Ljava/lang/String;

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

.method public getUnreadCount()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->getUnreadCount()J

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

.method public isAllMute()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->isAllMute()Z

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

.method public isInheritMessageReceiveOptionFromCommunity()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/TopicInfo;->isInheritMessageReceiveOptionFromCommunity()Z

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

.method public setAllMute(Z)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/TopicInfo;->setAllMute(Z)V

    .line 6
    .line 7
    iget p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 8
    int-to-long v0, p1

    .line 9
    .line 10
    sget-wide v2, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_INFO_MODIFY_FLAG_MUTE_ALL:J

    .line 11
    or-long/2addr v0, v2

    .line 12
    long-to-int p1, v0

    .line 13
    .line 14
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 15
    return-void
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

.method public setCustomString(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/TopicInfo;->setTopicCustomString(Ljava/lang/String;)V

    .line 6
    .line 7
    iget p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 8
    int-to-long v0, p1

    .line 9
    .line 10
    sget-wide v2, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_INFO_MODIFY_FLAG_TOPIC_CUSTOM_STRING:J

    .line 11
    or-long/2addr v0, v2

    .line 12
    long-to-int p1, v0

    .line 13
    .line 14
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 15
    return-void
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

.method public setDefaultPermissions(J)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tencent/imsdk/community/TopicInfo;->setDefaultPermissions(J)V

    .line 6
    .line 7
    iget p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 8
    int-to-long p1, p1

    .line 9
    .line 10
    sget-wide v0, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_INFO_MODIFY_FLAG_DEFAULT_PERMISSIONS:J

    .line 11
    or-long/2addr p1, v0

    .line 12
    long-to-int p1, p1

    .line 13
    .line 14
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 15
    return-void
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

.method public setDraft(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/imsdk/message/DraftMessage;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/imsdk/message/DraftMessage;-><init>()V

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/DraftMessage;->setUserDefinedData([B)V

    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/community/TopicInfo;->setDraftMessage(Lcom/tencent/imsdk/message/DraftMessage;)V

    .line 20
    .line 21
    iget p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 22
    int-to-long v0, p1

    .line 23
    .line 24
    sget-wide v2, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_INFO_MODIFY_FLAG_DRAFT:J

    .line 25
    or-long/2addr v0, v2

    .line 26
    long-to-int p1, v0

    .line 27
    .line 28
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 29
    return-void
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
.end method

.method public setInheritMessageReceiveOptionFromCommunity(ZLcom/tencent/imsdk/v2/V2TIMCallback;)V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/imsdk/group/GroupMemberInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/imsdk/group/GroupMemberInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->getTopicID()Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/group/GroupMemberInfo;->setGroupID(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginUser()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/group/GroupMemberInfo;->setUserID(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/group/GroupMemberInfo;->setInheritMessageReceiveOptionFromCommunity(Z)V

    .line 27
    .line 28
    new-instance v1, Lcom/tencent/imsdk/group/GroupMemberInfoModifyParam;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Lcom/tencent/imsdk/group/GroupMemberInfoModifyParam;-><init>()V

    .line 32
    .line 33
    sget-wide v2, Lcom/tencent/imsdk/group/GroupMemberInfo;->GROUP_MEMBER_INFO_MODIFY_FLAG_INHERIT_MESSAGE_RECEIVE_OPTION_FROM_COMMUNITY:J

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2, v3}, Lcom/tencent/imsdk/group/GroupMemberInfoModifyParam;->setModifyFlag(J)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/group/GroupMemberInfoModifyParam;->setMemberInfo(Lcom/tencent/imsdk/group/GroupMemberInfo;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lcom/tencent/imsdk/group/GroupManager;->getInstance()Lcom/tencent/imsdk/group/GroupManager;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    new-instance v2, Lcom/tencent/imsdk/v2/V2TIMTopicInfo$1;

    .line 46
    .line 47
    .line 48
    invoke-direct {v2, p0, p2, p1}, Lcom/tencent/imsdk/v2/V2TIMTopicInfo$1;-><init>(Lcom/tencent/imsdk/v2/V2TIMTopicInfo;Lcom/tencent/imsdk/v2/V2TIMCallback;Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Lcom/tencent/imsdk/group/GroupManager;->setGroupMemberInfo(Lcom/tencent/imsdk/group/GroupMemberInfoModifyParam;Lcom/tencent/imsdk/common/IMCallback;)V

    .line 52
    return-void
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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public setIntroduction(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/TopicInfo;->setIntroduction(Ljava/lang/String;)V

    .line 6
    .line 7
    iget p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 8
    int-to-long v0, p1

    .line 9
    .line 10
    sget-wide v2, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_INFO_MODIFY_FLAG_INTRODUCTION:J

    .line 11
    or-long/2addr v0, v2

    .line 12
    long-to-int p1, v0

    .line 13
    .line 14
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 15
    return-void
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

.method public setMemberList(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMCreateGroupMemberInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMCreateGroupMemberInfo;

    .line 24
    .line 25
    new-instance v2, Lcom/tencent/imsdk/group/GroupMemberInfo;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2}, Lcom/tencent/imsdk/group/GroupMemberInfo;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMCreateGroupMemberInfo;->getUserID()Ljava/lang/String;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Lcom/tencent/imsdk/group/GroupMemberInfo;->setUserID(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMCreateGroupMemberInfo;->getRole()I

    .line 39
    move-result v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Lcom/tencent/imsdk/group/GroupMemberInfo;->setRole(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/community/TopicInfo;->setMemberList(Ljava/util/List;)V

    .line 52
    return-void
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
.end method

.method public setMemberMaxCount(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tencent/imsdk/community/TopicInfo;->setMemberMaxCount(J)V

    .line 6
    return-void
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

.method public setNotification(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/TopicInfo;->setNotification(Ljava/lang/String;)V

    .line 6
    .line 7
    iget p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 8
    int-to-long v0, p1

    .line 9
    .line 10
    sget-wide v2, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_INFO_MODIFY_FLAG_NOTIFICATION:J

    .line 11
    or-long/2addr v0, v2

    .line 12
    long-to-int p1, v0

    .line 13
    .line 14
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 15
    return-void
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

.method public setTopicAddOpt(I)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 6
    .line 7
    sget v0, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_ALLOW_ANY:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/community/TopicInfo;->setTopicAddOpt(I)V

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 16
    .line 17
    sget v0, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_FORBID_ANY:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/community/TopicInfo;->setTopicAddOpt(I)V

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x1

    .line 23
    .line 24
    if-ne v0, p1, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 27
    .line 28
    sget v0, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_NEED_AUTHENTICATION:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/community/TopicInfo;->setTopicAddOpt(I)V

    .line 32
    .line 33
    :cond_2
    :goto_0
    iget p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 34
    int-to-long v0, p1

    .line 35
    .line 36
    sget-wide v2, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_INFO_MODIFY_FLAG_TOPIC_ADD_OPT:J

    .line 37
    or-long/2addr v0, v2

    .line 38
    long-to-int p1, v0

    .line 39
    .line 40
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 41
    return-void
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
.end method

.method public setTopicApproveOpt(I)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 6
    .line 7
    sget v0, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_ALLOW_ANY:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/community/TopicInfo;->setTopicApproveOpt(I)V

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 16
    .line 17
    sget v0, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_FORBID_ANY:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/community/TopicInfo;->setTopicApproveOpt(I)V

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x1

    .line 23
    .line 24
    if-ne v0, p1, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 27
    .line 28
    sget v0, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_ADD_OPTION_NEED_AUTHENTICATION:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/community/TopicInfo;->setTopicApproveOpt(I)V

    .line 32
    .line 33
    :cond_2
    :goto_0
    iget p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 34
    int-to-long v0, p1

    .line 35
    .line 36
    sget-wide v2, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_INFO_MODIFY_FLAG_TOPIC_APPROVE_OPT:J

    .line 37
    or-long/2addr v0, v2

    .line 38
    long-to-int p1, v0

    .line 39
    .line 40
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 41
    return-void
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
.end method

.method public setTopicFaceUrl(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/TopicInfo;->setFaceUrl(Ljava/lang/String;)V

    .line 6
    .line 7
    iget p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 8
    int-to-long v0, p1

    .line 9
    .line 10
    sget-wide v2, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_INFO_MODIFY_FLAG_FACE_URL:J

    .line 11
    or-long/2addr v0, v2

    .line 12
    long-to-int p1, v0

    .line 13
    .line 14
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 15
    return-void
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

.method public setTopicID(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/TopicInfo;->setTopicID(Ljava/lang/String;)V

    .line 6
    return-void
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

.method public setTopicInfo(Lcom/tencent/imsdk/community/TopicInfo;)V
    .locals 0

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 6
    return-void
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

.method public setTopicName(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/TopicInfo;->setTopicName(Ljava/lang/String;)V

    .line 6
    .line 7
    iget p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 8
    int-to-long v0, p1

    .line 9
    .line 10
    sget-wide v2, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_INFO_MODIFY_FLAG_NAME:J

    .line 11
    or-long/2addr v0, v2

    .line 12
    long-to-int p1, v0

    .line 13
    .line 14
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 15
    return-void
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

.method public setTopicType(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->topicInfo:Lcom/tencent/imsdk/community/TopicInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/TopicInfo;->setTopicType(Ljava/lang/String;)V

    .line 6
    .line 7
    iget p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 8
    int-to-long v0, p1

    .line 9
    .line 10
    sget-wide v2, Lcom/tencent/imsdk/community/TopicInfo;->TOPIC_INFO_MODIFY_FLAG_TOPIC_TYPE:J

    .line 11
    or-long/2addr v0, v2

    .line 12
    long-to-int p1, v0

    .line 13
    .line 14
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMTopicInfo;->modifyFlag:I

    .line 15
    return-void
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
