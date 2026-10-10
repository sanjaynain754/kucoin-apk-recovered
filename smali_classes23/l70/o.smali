.class public final Ll70/o;
.super Ljava/lang/Object;
.source "SignupV3Track.kt"

# interfaces
.implements Ldy/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll70/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000c\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002J\u000c\u0010\u000c\u001a\u00020\n*\u00020\rH\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/user/track/SignupV3RobotCheckEventReceiver;",
        "Lcom/kubi/safe/api/track/IRobotCheckEventReceiver;",
        "<init>",
        "()V",
        "invoke",
        "",
        "data",
        "Lcom/kubi/safe/api/track/RobotCheckEventData;",
        "track",
        "acceptScene",
        "",
        "Lcom/kubi/safe/api/track/RobotCheckScene;",
        "acceptEvent",
        "Lcom/kubi/safe/api/track/RobotCheckEvent;",
        "UserCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method private final a(Lcom/kubi/safe/api/track/RobotCheckEvent;)Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Ll70/o$a;->$EnumSwitchMapping$0:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :pswitch_0
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    nop

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final b(Lcom/kubi/safe/api/track/RobotCheckScene;)Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Ll70/o$a;->$EnumSwitchMapping$1:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    const/4 v1, 0x2

    .line 13
    .line 14
    if-eq p1, v1, :cond_0

    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_0
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private final d(Ldy/b;)V
    .locals 17

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ldy/b;->b()Lcom/kubi/safe/api/track/RobotCheckEvent;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Ll70/o$a;->$EnumSwitchMapping$0:[I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    move-result v0

    .line 11
    .line 12
    aget v0, v1, v0

    .line 13
    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    return-void

    .line 17
    .line 18
    :pswitch_0
    sget-object v1, Ll70/p;->a:Ll70/p;

    .line 19
    .line 20
    sget-object v2, Lcom/kubi/user/track/SignupDescription;->CAPTCHA_SUBMIT:Lcom/kubi/user/track/SignupDescription;

    .line 21
    .line 22
    .line 23
    invoke-virtual/range {p1 .. p1}, Ldy/b;->e()Ljava/lang/Throwable;

    .line 24
    move-result-object v6

    .line 25
    .line 26
    const/16 v7, 0x8

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    const-string v4, "-13005"

    .line 31
    const/4 v5, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static/range {v1 .. v8}, Ll70/p;->h(Ll70/p;Lcom/kubi/user/track/SignupDescription;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 35
    return-void

    .line 36
    .line 37
    :pswitch_1
    sget-object v9, Ll70/p;->a:Ll70/p;

    .line 38
    .line 39
    sget-object v10, Lcom/kubi/user/track/SignupDescription;->CAPTCHA_HANDLE:Lcom/kubi/user/track/SignupDescription;

    .line 40
    .line 41
    .line 42
    invoke-virtual/range {p1 .. p1}, Ldy/b;->e()Ljava/lang/Throwable;

    .line 43
    move-result-object v14

    .line 44
    .line 45
    const/16 v15, 0x8

    .line 46
    .line 47
    const/16 v16, 0x0

    .line 48
    const/4 v11, 0x0

    .line 49
    .line 50
    const-string v12, "-13004"

    .line 51
    const/4 v13, 0x0

    .line 52
    .line 53
    .line 54
    invoke-static/range {v9 .. v16}, Ll70/p;->h(Ll70/p;Lcom/kubi/user/track/SignupDescription;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 55
    return-void

    .line 56
    .line 57
    :pswitch_2
    sget-object v0, Ll70/p;->a:Ll70/p;

    .line 58
    .line 59
    sget-object v1, Lcom/kubi/user/track/SignupDescription;->CAPTCHA_HANDLE:Lcom/kubi/user/track/SignupDescription;

    .line 60
    .line 61
    .line 62
    invoke-virtual/range {p1 .. p1}, Ldy/b;->e()Ljava/lang/Throwable;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    const/16 v6, 0x8

    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v2, 0x0

    .line 68
    .line 69
    const-string v3, "-13003"

    .line 70
    const/4 v4, 0x0

    .line 71
    .line 72
    .line 73
    invoke-static/range {v0 .. v7}, Ll70/p;->h(Ll70/p;Lcom/kubi/user/track/SignupDescription;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 74
    return-void

    .line 75
    .line 76
    :pswitch_3
    sget-object v8, Ll70/p;->a:Ll70/p;

    .line 77
    .line 78
    sget-object v9, Lcom/kubi/user/track/SignupDescription;->CAPTCHA_HANDLE:Lcom/kubi/user/track/SignupDescription;

    .line 79
    .line 80
    .line 81
    invoke-virtual/range {p1 .. p1}, Ldy/b;->e()Ljava/lang/Throwable;

    .line 82
    move-result-object v13

    .line 83
    .line 84
    const/16 v14, 0x8

    .line 85
    const/4 v15, 0x0

    .line 86
    const/4 v10, 0x0

    .line 87
    .line 88
    const-string v11, "-13502"

    .line 89
    const/4 v12, 0x0

    .line 90
    .line 91
    .line 92
    invoke-static/range {v8 .. v15}, Ll70/p;->h(Ll70/p;Lcom/kubi/user/track/SignupDescription;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 93
    return-void

    .line 94
    .line 95
    :pswitch_4
    sget-object v0, Ll70/p;->a:Ll70/p;

    .line 96
    .line 97
    sget-object v1, Lcom/kubi/user/track/SignupDescription;->CAPTCHA_CANCEL:Lcom/kubi/user/track/SignupDescription;

    .line 98
    .line 99
    const/16 v6, 0x18

    .line 100
    const/4 v7, 0x0

    .line 101
    const/4 v2, 0x0

    .line 102
    .line 103
    const-string v3, "-1"

    .line 104
    const/4 v4, 0x0

    .line 105
    const/4 v5, 0x0

    .line 106
    .line 107
    .line 108
    invoke-static/range {v0 .. v7}, Ll70/p;->h(Ll70/p;Lcom/kubi/user/track/SignupDescription;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 109
    return-void

    .line 110
    .line 111
    :pswitch_5
    sget-object v8, Ll70/p;->a:Ll70/p;

    .line 112
    .line 113
    sget-object v9, Lcom/kubi/user/track/SignupDescription;->CAPTCHA_INIT:Lcom/kubi/user/track/SignupDescription;

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {p1 .. p1}, Ldy/b;->e()Ljava/lang/Throwable;

    .line 117
    move-result-object v13

    .line 118
    .line 119
    const/16 v14, 0x8

    .line 120
    const/4 v15, 0x0

    .line 121
    const/4 v10, 0x0

    .line 122
    .line 123
    const-string v11, "-13001"

    .line 124
    const/4 v12, 0x0

    .line 125
    .line 126
    .line 127
    invoke-static/range {v8 .. v15}, Ll70/p;->h(Ll70/p;Lcom/kubi/user/track/SignupDescription;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 128
    return-void

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method


# virtual methods
.method public c(Ldy/b;)V
    .locals 2
    .param p1    # Ldy/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ldy/b;->d()Lcom/kubi/safe/api/track/RobotCheckScene;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Ll70/o;->b(Lcom/kubi/safe/api/track/RobotCheckScene;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p1}, Ldy/b;->b()Lcom/kubi/safe/api/track/RobotCheckEvent;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Ll70/o;->a(Lcom/kubi/safe/api/track/RobotCheckEvent;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    :goto_0
    return-void

    .line 28
    .line 29
    :cond_1
    sget-object v0, Ll70/p;->a:Ll70/p;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ldy/b;->c()Lcom/kubi/safe/api/track/RobotCheckMethod;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Ll70/a;->a(Lcom/kubi/safe/api/track/RobotCheckMethod;)Lcom/kubi/user/track/CaptchaType;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ll70/p;->c(Lcom/kubi/user/track/CaptchaType;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p1}, Ll70/o;->d(Ldy/b;)V

    .line 44
    return-void
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ldy/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ll70/o;->c(Ldy/b;)V

    .line 6
    .line 7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p1
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
.end method
