.class public Lcom/tencent/imsdk/conversation/ConversationListFilter;
.super Ljava/lang/Object;
.source "ConversationListFilter.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final TIM_CONVERSATION_FILTER_TYPE_CONVERSATION_GROUP:I = 0x2

.field public static final TIM_CONVERSATION_FILTER_TYPE_CONVERSATION_MARK:I = 0x1

.field public static final TIM_CONVERSATION_FILTER_TYPE_HAS_GROUP_AT_INFO:I = 0x8

.field public static final TIM_CONVERSATION_FILTER_TYPE_HAS_UNREAD_COUNT:I = 0x4

.field public static final TIM_CONVERSATION_FILTER_TYPE_NONE:I


# instance fields
.field private conversationGroup:Ljava/lang/String;

.field private conversationType:I

.field private filterType:I

.field private hasGroupAtInfo:Z

.field private hasUnreadCount:Z

.field private markType:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->conversationType:I

    .line 7
    .line 8
    iput v0, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->markType:J

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public getConversationGroup()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->conversationGroup:Ljava/lang/String;

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

.method public getConversationType()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->conversationType:I

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

.method public getFilterType()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

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

.method public getHasGroupAtInfo()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->hasGroupAtInfo:Z

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

.method public getHasUnreadCount()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->hasUnreadCount:Z

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

.method public getMarkType()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->markType:J

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

.method public isNull()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->conversationType:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public setConversationGroup(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->conversationGroup:Ljava/lang/String;

    .line 3
    .line 4
    iget p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

    .line 5
    .line 6
    or-int/lit8 p1, p1, 0x2

    .line 7
    .line 8
    iput p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

    .line 9
    return-void
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

.method public setConversationType(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->conversationType:I

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

.method public setFilterType(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

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

.method public setHasGroupAtInfo(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->hasGroupAtInfo:Z

    .line 3
    .line 4
    iget p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

    .line 5
    .line 6
    or-int/lit8 p1, p1, 0x8

    .line 7
    .line 8
    iput p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

    .line 9
    return-void
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

.method public setHasUnreadCount(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->hasUnreadCount:Z

    .line 3
    .line 4
    iget p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

    .line 5
    .line 6
    or-int/lit8 p1, p1, 0x4

    .line 7
    .line 8
    iput p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

    .line 9
    return-void
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

.method public setMarkType(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->markType:J

    .line 3
    .line 4
    iget p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

    .line 5
    .line 6
    or-int/lit8 p1, p1, 0x1

    .line 7
    .line 8
    iput p1, p0, Lcom/tencent/imsdk/conversation/ConversationListFilter;->filterType:I

    .line 9
    return-void
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
