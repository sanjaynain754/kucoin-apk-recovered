.class public final Ll70/a;
.super Ljava/lang/Object;
.source "CommonTrackEnum.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll70/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005H\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\u0008H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "UC_TRACK_COMMON_CANCEL_CODE",
        "",
        "UC_TRACK_COMMON_SUCCESS_CODE",
        "toCaptchaType",
        "Lcom/kubi/user/track/CaptchaType;",
        "Lcom/kubi/safe/api/track/RobotCheckMethod;",
        "toRobotsScene",
        "Lcom/kubi/safe/api/track/RobotCheckScene;",
        "Lcom/kubi/data/constance/ValidationBizEnum;",
        "UserCenterLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/kubi/safe/api/track/RobotCheckMethod;)Lcom/kubi/user/track/CaptchaType;
    .locals 1
    .param p0    # Lcom/kubi/safe/api/track/RobotCheckMethod;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lcom/kubi/user/track/CaptchaType;->UNKNOWN:Lcom/kubi/user/track/CaptchaType;

    .line 5
    return-object p0

    .line 6
    .line 7
    :cond_0
    sget-object v0, Ll70/a$a;->$EnumSwitchMapping$0:[I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    move-result p0

    .line 12
    .line 13
    aget p0, v0, p0

    .line 14
    const/4 v0, 0x1

    .line 15
    .line 16
    if-eq p0, v0, :cond_3

    .line 17
    const/4 v0, 0x2

    .line 18
    .line 19
    if-eq p0, v0, :cond_2

    .line 20
    const/4 v0, 0x3

    .line 21
    .line 22
    if-ne p0, v0, :cond_1

    .line 23
    .line 24
    sget-object p0, Lcom/kubi/user/track/CaptchaType;->IMAGE:Lcom/kubi/user/track/CaptchaType;

    .line 25
    return-object p0

    .line 26
    .line 27
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 31
    throw p0

    .line 32
    .line 33
    :cond_2
    sget-object p0, Lcom/kubi/user/track/CaptchaType;->HCAPTCHA:Lcom/kubi/user/track/CaptchaType;

    .line 34
    return-object p0

    .line 35
    .line 36
    :cond_3
    sget-object p0, Lcom/kubi/user/track/CaptchaType;->GEETEST:Lcom/kubi/user/track/CaptchaType;

    .line 37
    return-object p0
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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static final b(Lcom/kubi/data/constance/ValidationBizEnum;)Lcom/kubi/safe/api/track/RobotCheckScene;
    .locals 1
    .param p0    # Lcom/kubi/data/constance/ValidationBizEnum;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->NONE:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 5
    return-object p0

    .line 6
    .line 7
    :cond_0
    sget-object v0, Ll70/a$a;->$EnumSwitchMapping$1:[I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    move-result p0

    .line 12
    .line 13
    aget p0, v0, p0

    .line 14
    .line 15
    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->NONE:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 19
    return-object p0

    .line 20
    .line 21
    :pswitch_0
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->RESET_PWD:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 22
    return-object p0

    .line 23
    .line 24
    :pswitch_1
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->RESET_PWD:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 25
    return-object p0

    .line 26
    .line 27
    :pswitch_2
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->REGISTER:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 28
    return-object p0

    .line 29
    .line 30
    :pswitch_3
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->REGISTER:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 31
    return-object p0

    .line 32
    .line 33
    :pswitch_4
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->REGISTER:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 34
    return-object p0

    .line 35
    .line 36
    :pswitch_5
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->REGISTER:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 37
    return-object p0

    .line 38
    .line 39
    :pswitch_6
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->REGISTER:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 40
    return-object p0

    .line 41
    .line 42
    :pswitch_7
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->LOGIN:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 43
    return-object p0

    .line 44
    .line 45
    :pswitch_8
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->LOGIN:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 46
    return-object p0

    .line 47
    .line 48
    :pswitch_9
    sget-object p0, Lcom/kubi/safe/api/track/RobotCheckScene;->LOGIN:Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 49
    return-object p0

    .line 50
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
