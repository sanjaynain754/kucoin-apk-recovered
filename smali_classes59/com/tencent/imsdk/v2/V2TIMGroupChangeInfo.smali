.class public Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;
.super Ljava/lang/Object;
.source "V2TIMGroupChangeInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_CUSTOM:I = 0x6

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_DEFAULT_PERMISSIONS:I = 0xe

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_ENABLE_PERMISSION_GROUP:I = 0xd

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_FACE_URL:I = 0x4

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_GROUP_ADD_OPT:I = 0xb

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_GROUP_APPROVE_OPT:I = 0xc

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_INTRODUCTION:I = 0x2

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_NAME:I = 0x1

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_NOTIFICATION:I = 0x3

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_OWNER:I = 0x5

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_RECEIVE_MESSAGE_OPT:I = 0xa

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_SHUT_UP_ALL:I = 0x8

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_TOPIC_ADD_OPT:I = 0xf

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_TOPIC_APPROVE_OPT:I = 0x10

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_TOPIC_CUSTOM_DATA:I = 0x9

.field public static final V2TIM_GROUP_INFO_CHANGE_TYPE_TOPIC_MEMBER_MAX_COUNT:I = 0x11

.field public static final V2TIM_GROUP_INFO_INVALID:I


# instance fields
.field private groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/group/GroupInfoChangeItem;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/group/GroupInfoChangeItem;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;

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
.method public getBoolValue()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->getBoolValueChanged()Z

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

.method public getGroupInfoChangeItem()Lcom/tencent/imsdk/group/GroupInfoChangeItem;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;

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

.method public getIntValue()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->getGroupInfoChangeType()I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0xb

    .line 9
    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/16 v1, 0xc

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->getIntValueChanged()I

    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    .line 24
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->getIntValueChanged()I

    .line 28
    move-result v0

    .line 29
    .line 30
    sget v1, Lcom/tencent/imsdk/group/GroupInfo;->GROUP_ADD_OPTION_ALLOW_ANY:I

    .line 31
    const/4 v2, 0x2

    .line 32
    .line 33
    if-ne v0, v1, :cond_2

    .line 34
    return v2

    .line 35
    .line 36
    :cond_2
    sget v1, Lcom/tencent/imsdk/group/GroupInfo;->GROUP_ADD_OPTION_FORBID_ANY:I

    .line 37
    .line 38
    if-ne v0, v1, :cond_3

    .line 39
    const/4 v0, 0x0

    .line 40
    return v0

    .line 41
    .line 42
    :cond_3
    sget v1, Lcom/tencent/imsdk/group/GroupInfo;->GROUP_ADD_OPTION_NEED_AUTHENTICATION:I

    .line 43
    .line 44
    if-ne v0, v1, :cond_4

    .line 45
    const/4 v0, 0x1

    .line 46
    return v0

    .line 47
    :cond_4
    return v2
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

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->getCustomInfoKey()Ljava/lang/String;

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

.method public getLongValue()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->getLongValueChanged()J

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

.method public getType()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->getGroupInfoChangeType()I

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

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->getValueChanged()Ljava/lang/String;

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

.method public setGroupInfoChangeItem(Lcom/tencent/imsdk/group/GroupInfoChangeItem;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->groupInfoChangeItem:Lcom/tencent/imsdk/group/GroupInfoChangeItem;

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
