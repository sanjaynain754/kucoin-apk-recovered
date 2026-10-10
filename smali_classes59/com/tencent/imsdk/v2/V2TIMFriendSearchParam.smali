.class public Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;
.super Ljava/lang/Object;
.source "V2TIMFriendSearchParam.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final SEARCH_FIELD_NICK_NAME:I = 0x2

.field private static final SEARCH_FIELD_REMARK:I = 0x4

.field private static final SEARCH_FIELD_USER_ID:I = 0x1


# instance fields
.field private userSearchParam:Lcom/tencent/imsdk/relationship/UserSearchParam;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/relationship/UserSearchParam;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/relationship/UserSearchParam;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->userSearchParam:Lcom/tencent/imsdk/relationship/UserSearchParam;

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
.method public getKeywordList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->userSearchParam:Lcom/tencent/imsdk/relationship/UserSearchParam;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/UserSearchParam;->getKeywordList()Ljava/util/List;

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

.method public getUserSearchParam()Lcom/tencent/imsdk/relationship/UserSearchParam;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->userSearchParam:Lcom/tencent/imsdk/relationship/UserSearchParam;

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

.method public setKeywordList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->userSearchParam:Lcom/tencent/imsdk/relationship/UserSearchParam;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/relationship/UserSearchParam;->setKeywordList(Ljava/util/List;)V

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

.method public setSearchNickName(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->userSearchParam:Lcom/tencent/imsdk/relationship/UserSearchParam;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/relationship/UserSearchParam;->addSearchField(I)V

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->userSearchParam:Lcom/tencent/imsdk/relationship/UserSearchParam;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/relationship/UserSearchParam;->removeSearchField(I)V

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

.method public setSearchRemark(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->userSearchParam:Lcom/tencent/imsdk/relationship/UserSearchParam;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/relationship/UserSearchParam;->addSearchField(I)V

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->userSearchParam:Lcom/tencent/imsdk/relationship/UserSearchParam;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/relationship/UserSearchParam;->removeSearchField(I)V

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

.method public setSearchUserID(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->userSearchParam:Lcom/tencent/imsdk/relationship/UserSearchParam;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/relationship/UserSearchParam;->addSearchField(I)V

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->userSearchParam:Lcom/tencent/imsdk/relationship/UserSearchParam;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/relationship/UserSearchParam;->removeSearchField(I)V

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
