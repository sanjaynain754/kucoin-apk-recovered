.class public Lcom/tencent/imsdk/v2/V2TIMFriendApplicationResult;
.super Ljava/lang/Object;
.source "V2TIMFriendApplicationResult.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private friendApplicationResult:Lcom/tencent/imsdk/relationship/FriendApplicationResult;

.field private v2TIMFriendApplicationList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMFriendApplication;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendApplicationResult;->v2TIMFriendApplicationList:Ljava/util/List;

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
.method public getFriendApplicationList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMFriendApplication;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendApplicationResult;->v2TIMFriendApplicationList:Ljava/util/List;

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

.method public getUnreadCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendApplicationResult;->friendApplicationResult:Lcom/tencent/imsdk/relationship/FriendApplicationResult;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/FriendApplicationResult;->getUnreadCount()I

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

.method public setFriendApplicationResult(Lcom/tencent/imsdk/relationship/FriendApplicationResult;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFriendApplicationResult;->v2TIMFriendApplicationList:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/tencent/imsdk/relationship/FriendApplicationResult;->getFriendApplicationList()Ljava/util/List;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    check-cast v1, Lcom/tencent/imsdk/relationship/FriendApplication;

    .line 26
    .line 27
    new-instance v2, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2}, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;->setFriendApplication(Lcom/tencent/imsdk/relationship/FriendApplication;)V

    .line 34
    .line 35
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMFriendApplicationResult;->v2TIMFriendApplicationList:Ljava/util/List;

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_0
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMFriendApplicationResult;->friendApplicationResult:Lcom/tencent/imsdk/relationship/FriendApplicationResult;

    .line 42
    return-void
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
