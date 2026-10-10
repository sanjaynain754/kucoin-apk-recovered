.class public Lcom/tencent/imsdk/group/GroupInfoChangeItem;
.super Ljava/lang/Object;
.source "GroupInfoChangeItem.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final GROUP_INFO_CHANGE_TYPE_CUSTOM:I = 0x6

.field public static final GROUP_INFO_CHANGE_TYPE_FACE:I = 0x4

.field public static final GROUP_INFO_CHANGE_TYPE_GROUP_ADD_OPT:I = 0xb

.field public static final GROUP_INFO_CHANGE_TYPE_GROUP_APPROVE_OPT:I = 0xc

.field public static final GROUP_INFO_CHANGE_TYPE_INTRODUCTION:I = 0x2

.field public static final GROUP_INFO_CHANGE_TYPE_NAME:I = 0x1

.field public static final GROUP_INFO_CHANGE_TYPE_NOTIFICATION:I = 0x3

.field public static final GROUP_INFO_CHANGE_TYPE_OWNER:I = 0x5

.field public static final GROUP_INFO_CHANGE_TYPE_RECEIVE_MESSAGE_OPT:I = 0xa

.field public static final GROUP_INFO_CHANGE_TYPE_SHUT_UP_ALL:I = 0x8

.field public static final GROUP_INFO_CHANGE_TYPE_TOPIC_CUSTOM_DATA:I = 0x9


# instance fields
.field private boolValueChanged:Z

.field private customInfoKey:Ljava/lang/String;

.field private groupInfoChangeType:I

.field private intValueChanged:I

.field private longValueChanged:J

.field private valueChanged:Ljava/lang/String;


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
.end method


# virtual methods
.method public getBoolValueChanged()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->boolValueChanged:Z

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

.method public getCustomInfoKey()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->customInfoKey:Ljava/lang/String;

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

.method public getGroupInfoChangeType()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->groupInfoChangeType:I

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

.method public getIntValueChanged()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->intValueChanged:I

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

.method public getLongValueChanged()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->longValueChanged:J

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

.method public getValueChanged()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->valueChanged:Ljava/lang/String;

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

.method public setCustomInfoKey(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->customInfoKey:Ljava/lang/String;

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

.method public setGroupInfoChangeType(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->groupInfoChangeType:I

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

.method public setValueChanged(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/group/GroupInfoChangeItem;->valueChanged:Ljava/lang/String;

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
