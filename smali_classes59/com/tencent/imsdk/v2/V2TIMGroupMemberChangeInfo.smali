.class public Lcom/tencent/imsdk/v2/V2TIMGroupMemberChangeInfo;
.super Ljava/lang/Object;
.source "V2TIMGroupMemberChangeInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private groupMemberInfoChangeItem:Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupMemberChangeInfo;->groupMemberInfoChangeItem:Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;

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
.method public getGroupMemberInfoChangeItem()Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupMemberChangeInfo;->groupMemberInfoChangeItem:Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;

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

.method public getMuteTime()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupMemberChangeInfo;->groupMemberInfoChangeItem:Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;->getShutUpTime()J

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

.method public getUserID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupMemberChangeInfo;->groupMemberInfoChangeItem:Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;->getUserID()Ljava/lang/String;

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

.method public setGroupMemberInfoChangeItem(Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMGroupMemberChangeInfo;->groupMemberInfoChangeItem:Lcom/tencent/imsdk/group/GroupMemberInfoChangeItem;

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
