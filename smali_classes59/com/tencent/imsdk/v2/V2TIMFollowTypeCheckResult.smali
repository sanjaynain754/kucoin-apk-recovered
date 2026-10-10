.class public Lcom/tencent/imsdk/v2/V2TIMFollowTypeCheckResult;
.super Ljava/lang/Object;
.source "V2TIMFollowTypeCheckResult.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final V2TIM_FOLLOW_TYPE_IN_BOTH_FOLLOWERS_LIST:I = 0x3

.field public static final V2TIM_FOLLOW_TYPE_IN_MY_FOLLOWERS_LIST:I = 0x2

.field public static final V2TIM_FOLLOW_TYPE_IN_MY_FOLLOWING_LIST:I = 0x1

.field public static final V2TIM_FOLLOW_TYPE_NONE:I


# instance fields
.field private followTypeCheckResult:Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFollowTypeCheckResult;->followTypeCheckResult:Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;

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
.method public getFollowType()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFollowTypeCheckResult;->followTypeCheckResult:Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;->getFollowType()I

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

.method public getResultCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFollowTypeCheckResult;->followTypeCheckResult:Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;->getResultCode()I

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

.method public getResultInfo()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFollowTypeCheckResult;->followTypeCheckResult:Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;->getResultInfo()Ljava/lang/String;

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

.method public getUserID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMFollowTypeCheckResult;->followTypeCheckResult:Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;->getUserID()Ljava/lang/String;

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

.method public setFollowTypeCheckResult(Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMFollowTypeCheckResult;->followTypeCheckResult:Lcom/tencent/imsdk/relationship/FollowTypeCheckResult;

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
