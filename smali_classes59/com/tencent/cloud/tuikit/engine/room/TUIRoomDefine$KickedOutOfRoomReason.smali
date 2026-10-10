.class public final enum Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;
.super Ljava/lang/Enum;
.source "TUIRoomDefine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "KickedOutOfRoomReason"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

.field public static final enum BY_ADMIN:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

.field public static final enum BY_LOGGED_ON_OTHER_DEVICE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

.field public static final enum BY_SERVER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

.field public static final enum COUNT_OF_JOINED_ROOMS_EXCEED_LIMIT:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

.field public static final enum JOIN_ROOM_STATUS_INVALID_DURING_OFFLINE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

.field public static final enum NETWORK_DISCONNECTED:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;


# instance fields
.field mValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 3
    .line 4
    const-string v1, "BY_ADMIN"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->BY_ADMIN:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 11
    .line 12
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 13
    .line 14
    const-string v2, "BY_LOGGED_ON_OTHER_DEVICE"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3, v3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->BY_LOGGED_ON_OTHER_DEVICE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 21
    .line 22
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 23
    .line 24
    const-string v3, "BY_SERVER"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4, v4}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->BY_SERVER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 31
    .line 32
    new-instance v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 33
    .line 34
    const-string v4, "NETWORK_DISCONNECTED"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5, v5}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->NETWORK_DISCONNECTED:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 41
    .line 42
    new-instance v4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 43
    .line 44
    const-string v5, "JOIN_ROOM_STATUS_INVALID_DURING_OFFLINE"

    .line 45
    const/4 v6, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v5, v6, v6}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    sput-object v4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->JOIN_ROOM_STATUS_INVALID_DURING_OFFLINE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 51
    .line 52
    new-instance v5, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 53
    .line 54
    const-string v6, "COUNT_OF_JOINED_ROOMS_EXCEED_LIMIT"

    .line 55
    const/4 v7, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v5, v6, v7, v7}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    sput-object v5, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->COUNT_OF_JOINED_ROOMS_EXCEED_LIMIT:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 61
    .line 62
    .line 63
    filled-new-array/range {v0 .. v5}, [Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    sput-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->$VALUES:[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 67
    return-void
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
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
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
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->mValue:I

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
.end method

.method public static fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->values()[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v3, v0, v2

    .line 11
    .line 12
    iget v4, v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->mValue:I

    .line 13
    .line 14
    if-ne v4, p0, :cond_0

    .line 15
    return-object v3

    .line 16
    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_1
    sget-object p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->BY_ADMIN:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 9
    return-object p0
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

.method public static values()[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->$VALUES:[Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$KickedOutOfRoomReason;->mValue:I

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
