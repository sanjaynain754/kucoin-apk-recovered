.class public final Lio/trtc/tuikit/atomicxcore/impl/login/f;
.super Lcom/tencent/imsdk/v2/V2TIMSDKListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/login/h;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/login/h;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/login/f;->a:Lio/trtc/tuikit/atomicxcore/impl/login/h;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/imsdk/v2/V2TIMSDKListener;-><init>()V

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final onKickedOffline()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/f;->a:Lio/trtc/tuikit/atomicxcore/impl/login/h;

    .line 3
    .line 4
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->c:Lkotlinx/coroutines/flow/n;

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;

    .line 12
    .line 13
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;->UNLOGIN:Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/f;->a:Lio/trtc/tuikit/atomicxcore/impl/login/h;

    .line 22
    .line 23
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->e:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 24
    .line 25
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/login/d;->a:Lio/trtc/tuikit/atomicxcore/impl/login/d;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 29
    return-void
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
    .line 82
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
.end method

.method public final onSelfInfoUpdated(Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;)V
    .locals 12

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/f;->a:Lio/trtc/tuikit/atomicxcore/impl/login/h;

    .line 6
    .line 7
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->d:Lkotlinx/coroutines/flow/n;

    .line 8
    .line 9
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getUserID()Ljava/lang/String;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    const-string v3, "getUserID(...)"

    .line 16
    .line 17
    .line 18
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getNickName()Ljava/lang/String;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getFaceUrl()Ljava/lang/String;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getSelfSignature()Ljava/lang/String;

    .line 30
    move-result-object v5

    .line 31
    .line 32
    sget-object v6, Lio/trtc/tuikit/atomicxcore/api/login/Gender;->Companion:Lio/trtc/tuikit/atomicxcore/api/login/Gender$Companion;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getGender()I

    .line 36
    move-result v7

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6, v7}, Lio/trtc/tuikit/atomicxcore/api/login/Gender$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/login/Gender;

    .line 40
    move-result-object v6

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getRole()I

    .line 44
    move-result v7

    .line 45
    .line 46
    .line 47
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    move-result-object v7

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getLevel()I

    .line 52
    move-result v8

    .line 53
    .line 54
    .line 55
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    move-result-object v8

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getBirthday()J

    .line 60
    move-result-wide v9

    .line 61
    .line 62
    .line 63
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    move-result-object v9

    .line 65
    .line 66
    sget-object v10, Lio/trtc/tuikit/atomicxcore/api/login/AllowType;->Companion:Lio/trtc/tuikit/atomicxcore/api/login/AllowType$Companion;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getAllowType()I

    .line 70
    move-result v11

    .line 71
    .line 72
    .line 73
    invoke-virtual {v10, v11}, Lio/trtc/tuikit/atomicxcore/api/login/AllowType$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/login/AllowType;

    .line 74
    move-result-object v10

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getCustomInfo()Ljava/util/HashMap;

    .line 78
    move-result-object v11

    .line 79
    .line 80
    .line 81
    invoke-direct/range {v1 .. v11}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/login/Gender;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/login/AllowType;Ljava/util/Map;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 85
    return-void
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
.end method

.method public final onUserSigExpired()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/f;->a:Lio/trtc/tuikit/atomicxcore/impl/login/h;

    .line 3
    .line 4
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->c:Lkotlinx/coroutines/flow/n;

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;

    .line 12
    .line 13
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;->UNLOGIN:Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/f;->a:Lio/trtc/tuikit/atomicxcore/impl/login/h;

    .line 22
    .line 23
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->e:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 24
    .line 25
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/login/e;->a:Lio/trtc/tuikit/atomicxcore/impl/login/e;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 29
    return-void
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
    .line 82
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
.end method
