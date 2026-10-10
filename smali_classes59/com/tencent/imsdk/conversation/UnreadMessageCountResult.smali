.class public Lcom/tencent/imsdk/conversation/UnreadMessageCountResult;
.super Ljava/lang/Object;
.source "UnreadMessageCountResult.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private filter:Lcom/tencent/imsdk/conversation/ConversationListFilter;

.field private totalUnreadCount:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/conversation/ConversationListFilter;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/conversation/ConversationListFilter;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/conversation/UnreadMessageCountResult;->filter:Lcom/tencent/imsdk/conversation/ConversationListFilter;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/tencent/imsdk/conversation/UnreadMessageCountResult;->totalUnreadCount:J

    .line 15
    return-void
    .line 16
    .line 17
.end method


# virtual methods
.method public getFilter()Lcom/tencent/imsdk/conversation/ConversationListFilter;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/conversation/UnreadMessageCountResult;->filter:Lcom/tencent/imsdk/conversation/ConversationListFilter;

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

.method public getTotalUnreadCount()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/imsdk/conversation/UnreadMessageCountResult;->totalUnreadCount:J

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

.method public setTotalUnreadCount(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/tencent/imsdk/conversation/UnreadMessageCountResult;->totalUnreadCount:J

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
