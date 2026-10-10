.class public Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;
.super Ljava/lang/Object;
.source "V2TIMFriendAddApplication.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private friendAddApplication:Lcom/tencent/imsdk/relationship/FriendAddApplication;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/relationship/FriendAddApplication;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/relationship/FriendAddApplication;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->friendAddApplication:Lcom/tencent/imsdk/relationship/FriendAddApplication;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/relationship/FriendAddApplication;->setUserID(Ljava/lang/String;)V

    .line 14
    .line 15
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->friendAddApplication:Lcom/tencent/imsdk/relationship/FriendAddApplication;

    .line 16
    const/4 v0, 0x2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/relationship/FriendAddApplication;->setAddType(I)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public getFriendAddApplication()Lcom/tencent/imsdk/relationship/FriendAddApplication;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->friendAddApplication:Lcom/tencent/imsdk/relationship/FriendAddApplication;

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

.method public setAddSource(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->friendAddApplication:Lcom/tencent/imsdk/relationship/FriendAddApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/relationship/FriendAddApplication;->setAddSource(Ljava/lang/String;)V

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

.method public setAddType(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    move p1, v0

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->friendAddApplication:Lcom/tencent/imsdk/relationship/FriendAddApplication;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/relationship/FriendAddApplication;->setAddType(I)V

    .line 13
    return-void
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

.method public setAddWording(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->friendAddApplication:Lcom/tencent/imsdk/relationship/FriendAddApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/relationship/FriendAddApplication;->setAddWording(Ljava/lang/String;)V

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

.method public setFriendGroup(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->friendAddApplication:Lcom/tencent/imsdk/relationship/FriendAddApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/relationship/FriendAddApplication;->setGroupName(Ljava/lang/String;)V

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

.method public setFriendRemark(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->friendAddApplication:Lcom/tencent/imsdk/relationship/FriendAddApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/relationship/FriendAddApplication;->setRemark(Ljava/lang/String;)V

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

.method public setUserID(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->friendAddApplication:Lcom/tencent/imsdk/relationship/FriendAddApplication;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/relationship/FriendAddApplication;->setUserID(Ljava/lang/String;)V

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
