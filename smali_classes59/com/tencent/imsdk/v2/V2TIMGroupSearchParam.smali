.class public Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;
.super Ljava/lang/Object;
.source "V2TIMGroupSearchParam.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final SEARCH_FIELD_GROUP_ID:I = 0x1

.field private static final SEARCH_FIELD_GROUP_NAME:I = 0x2

.field public static final V2TIM_KEYWORD_LIST_MATCH_TYPE_AND:I = 0x1

.field public static final V2TIM_KEYWORD_LIST_MATCH_TYPE_OR:I


# instance fields
.field private groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/group/GroupSearchParam;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/group/GroupSearchParam;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

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
.method public getGroupSearchParam()Lcom/tencent/imsdk/group/GroupSearchParam;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

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
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupSearchParam;->getKeywordList()Ljava/util/List;

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
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/group/GroupSearchParam;->setKeywordList(Ljava/util/List;)V

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

.method public setKeywordListMatchType(I)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/group/GroupSearchParam;->setKeywordListMatchType(I)V

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

    .line 12
    const/4 v0, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/group/GroupSearchParam;->setKeywordListMatchType(I)V

    .line 16
    return-void
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

.method public setSearchCount(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/group/GroupSearchParam;->setSearchCount(I)V

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

.method public setSearchCursor(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/group/GroupSearchParam;->setSearchCursor(Ljava/lang/String;)V

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

.method public setSearchGroupID(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/group/GroupSearchParam;->addSearchField(I)V

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/group/GroupSearchParam;->removeSearchField(I)V

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

.method public setSearchGroupName(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/group/GroupSearchParam;->addSearchField(I)V

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->groupSearchParam:Lcom/tencent/imsdk/group/GroupSearchParam;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/group/GroupSearchParam;->removeSearchField(I)V

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
