.class public Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;
.super Ljava/lang/Object;
.source "V2TIMPermissionGroupInfo.java"


# static fields
.field public static final V2TIM_COMMUNITY_PERMISSION_AT_ALL:J = 0x80L

.field public static final V2TIM_COMMUNITY_PERMISSION_BAN_MEMBER:J = 0x400L

.field public static final V2TIM_COMMUNITY_PERMISSION_GET_HISTORY_MESSAGE:J = 0x100L

.field public static final V2TIM_COMMUNITY_PERMISSION_MANAGE_GROUP_INFO:J = 0x1L

.field public static final V2TIM_COMMUNITY_PERMISSION_MANAGE_GROUP_MEMBER:J = 0x2L

.field public static final V2TIM_COMMUNITY_PERMISSION_MANAGE_PERMISSION_GROUP_INFO:J = 0x4L

.field public static final V2TIM_COMMUNITY_PERMISSION_MANAGE_PERMISSION_GROUP_MEMBER:J = 0x8L

.field public static final V2TIM_COMMUNITY_PERMISSION_MANAGE_TOPIC_IN_COMMUNITY:J = 0x10L

.field public static final V2TIM_COMMUNITY_PERMISSION_MUTE_MEMBER:J = 0x20L

.field public static final V2TIM_COMMUNITY_PERMISSION_REVOKE_OTHER_MEMBER_MESSAGE:J = 0x200L

.field public static final V2TIM_COMMUNITY_PERMISSION_SEND_MESSAGE:J = 0x40L

.field public static final V2TIM_TOPIC_PERMISSION_AT_ALL:J = 0x40L

.field public static final V2TIM_TOPIC_PERMISSION_GET_HISTORY_MESSAGE:J = 0x10L

.field public static final V2TIM_TOPIC_PERMISSION_MANAGE_TOPIC:J = 0x1L

.field public static final V2TIM_TOPIC_PERMISSION_MANAGE_TOPIC_PERMISSION:J = 0x2L

.field public static final V2TIM_TOPIC_PERMISSION_MUTE_MEMBER:J = 0x4L

.field public static final V2TIM_TOPIC_PERMISSION_REVOKE_OTHER_MEMBER_MESSAGE:J = 0x20L

.field public static final V2TIM_TOPIC_PERMISSION_SEND_MESSAGE:J = 0x8L


# instance fields
.field private modifyFlag:J

.field private permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-wide v0, Lcom/tencent/imsdk/community/PermissionGroupInfo;->MODIFY_FLAG_NONE:J

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->modifyFlag:J

    .line 8
    .line 9
    new-instance v0, Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/tencent/imsdk/community/PermissionGroupInfo;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 15
    .line 16
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->modifyFlag:J

    .line 19
    return-void
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


# virtual methods
.method public getCustomData()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/PermissionGroupInfo;->getCustomData()Ljava/lang/String;

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

.method public getGroupID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/PermissionGroupInfo;->getGroupID()Ljava/lang/String;

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

.method public getGroupPermission()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/PermissionGroupInfo;->getGroupPermission()J

    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    .line 11
    :cond_0
    const-wide/16 v0, 0x0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getMemberCount()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/PermissionGroupInfo;->getMemberCount()J

    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    .line 11
    :cond_0
    const-wide/16 v0, 0x0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getModifyFlag()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->modifyFlag:J

    .line 3
    return-wide v0
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

.method public getPermissionGroupID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/PermissionGroupInfo;->getPermissionGroupID()Ljava/lang/String;

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

.method public getPermissionGroupInfo()Lcom/tencent/imsdk/community/PermissionGroupInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

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

.method public getPermissionGroupName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/community/PermissionGroupInfo;->getPermissionGroupName()Ljava/lang/String;

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

.method public setCustomData(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/PermissionGroupInfo;->setCustomData(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->modifyFlag:J

    .line 10
    .line 11
    sget-wide v2, Lcom/tencent/imsdk/community/PermissionGroupInfo;->MODIFY_FLAG_PERMISSION_GROUP_CUSTOM_STRING:J

    .line 12
    or-long/2addr v0, v2

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->modifyFlag:J

    .line 15
    :cond_0
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

.method public setGroupID(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/PermissionGroupInfo;->setGroupID(Ljava/lang/String;)V

    .line 8
    :cond_0
    return-void
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

.method public setGroupPermission(J)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/tencent/imsdk/community/PermissionGroupInfo;->setGroupPermission(J)V

    .line 8
    .line 9
    iget-wide p1, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->modifyFlag:J

    .line 10
    .line 11
    sget-wide v0, Lcom/tencent/imsdk/community/PermissionGroupInfo;->MODIFY_FLAG_PERMISSION_GROUP_PERMISSION:J

    .line 12
    or-long/2addr p1, v0

    .line 13
    .line 14
    iput-wide p1, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->modifyFlag:J

    .line 15
    :cond_0
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

.method public setModifyFlag(I)V
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->modifyFlag:J

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
.end method

.method public setPermissionGroupID(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/PermissionGroupInfo;->setPermissionGroupID(Ljava/lang/String;)V

    .line 8
    :cond_0
    return-void
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

.method public setPermissionGroupInfo(Lcom/tencent/imsdk/community/PermissionGroupInfo;)V
    .locals 0

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

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

.method public setPermissionGroupName(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->permissionGroupInfo:Lcom/tencent/imsdk/community/PermissionGroupInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/community/PermissionGroupInfo;->setPermissionGroupName(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->modifyFlag:J

    .line 10
    .line 11
    sget-wide v2, Lcom/tencent/imsdk/community/PermissionGroupInfo;->MODIFY_FLAG_PERMISSION_GROUP_NAME:J

    .line 12
    or-long/2addr v0, v2

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->modifyFlag:J

    .line 15
    :cond_0
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "groupID:"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->getGroupID()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, ", permissionGroupID:"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->getPermissionGroupID()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, ", permissionGroupName:"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->getPermissionGroupName()Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v1, ", customData:"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->getCustomData()Ljava/lang/String;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v1, ", groupPermission:"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->getGroupPermission()J

    .line 62
    move-result-wide v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, ", memberCount:"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMPermissionGroupInfo;->getMemberCount()J

    .line 74
    move-result-wide v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    move-result-object v0

    .line 82
    return-object v0
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
.end method
