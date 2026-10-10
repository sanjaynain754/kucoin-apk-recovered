.class public Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;
.super Ljava/lang/Object;
.source "V2TIMReceiveMessageOptInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

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
.method public getAllReceiveMessageOpt()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;->getReceiveMessageOpt()I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    return v2

    .line 12
    :cond_0
    const/4 v1, 0x3

    .line 13
    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    const/4 v0, 0x2

    .line 16
    return v0

    .line 17
    .line 18
    :cond_1
    if-ne v0, v1, :cond_2

    .line 19
    return v1

    .line 20
    :cond_2
    return v2
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

.method public getC2CReceiveMessageOpt()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;->getReceiveMessageOpt()I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    return v1

    .line 12
    :cond_0
    const/4 v3, 0x2

    .line 13
    .line 14
    if-ne v0, v3, :cond_1

    .line 15
    return v2

    .line 16
    :cond_1
    const/4 v2, 0x3

    .line 17
    .line 18
    if-ne v0, v2, :cond_2

    .line 19
    return v3

    .line 20
    :cond_2
    return v1
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

.method public getDuration()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;->getDuration()J

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

.method public getReceiveMessageOptInfo()Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

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

.method public getStartHour()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;->getStartHour()I

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

.method public getStartMinute()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;->getStartMinute()I

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

.method public getStartSecond()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;->getStartSecond()I

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

.method public getStartTimeStamp()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;->getStartTimeStamp()J

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
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;->getUserID()Ljava/lang/String;

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

.method public setC2CReceiveMessageOpt(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;->setReceiveMessageOpt(I)V

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

.method public setReceiveMessageOptInfo(Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

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

.method public setUserID(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->receiveMessageOptInfo:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;->setUserID(Ljava/lang/String;)V

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
