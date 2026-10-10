.class final enum Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;
.super Ljava/lang/Enum;
.source "NativeAnimatedModule.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BatchExecutionOpCodes"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_ADD_LISTENER:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_CONNECT_ANIMATED_NODES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_CREATE_ANIMATED_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_DISCONNECT_ANIMATED_NODES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_DROP_ANIMATED_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_GET_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_REMOVE_LISTENERS:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_RESTORE_DEFAULT_VALUES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_SET_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_SET_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_START_ANIMATING_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_STOP_ANIMATION:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_CODE_UPDATE_ANIMATED_NODE_CONFIG:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_START_LISTENING_TO_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field public static final enum OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

.field private static valueMap:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;


# instance fields
.field private final value:I


# direct methods
.method private static synthetic $values()[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;
    .locals 22

    .line 1
    .line 2
    sget-object v1, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_CREATE_ANIMATED_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 3
    .line 4
    sget-object v2, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_UPDATE_ANIMATED_NODE_CONFIG:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 5
    .line 6
    sget-object v3, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_GET_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 7
    .line 8
    sget-object v4, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_START_LISTENING_TO_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 9
    .line 10
    sget-object v5, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 11
    .line 12
    sget-object v6, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_CONNECT_ANIMATED_NODES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 13
    .line 14
    sget-object v7, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_DISCONNECT_ANIMATED_NODES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 15
    .line 16
    sget-object v8, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_START_ANIMATING_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 17
    .line 18
    sget-object v9, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_STOP_ANIMATION:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 19
    .line 20
    sget-object v10, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_SET_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 21
    .line 22
    sget-object v11, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_SET_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 23
    .line 24
    sget-object v12, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 25
    .line 26
    sget-object v13, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 27
    .line 28
    sget-object v14, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 29
    .line 30
    sget-object v15, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 31
    .line 32
    sget-object v16, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_RESTORE_DEFAULT_VALUES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 33
    .line 34
    sget-object v17, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_DROP_ANIMATED_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 35
    .line 36
    sget-object v18, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 37
    .line 38
    sget-object v19, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 39
    .line 40
    sget-object v20, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_ADD_LISTENER:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 41
    .line 42
    sget-object v21, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_REMOVE_LISTENERS:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 43
    .line 44
    .line 45
    filled-new-array/range {v1 .. v21}, [Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 46
    move-result-object v0

    .line 47
    return-object v0
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
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 3
    .line 4
    const-string v1, "OP_CODE_CREATE_ANIMATED_NODE"

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_CREATE_ANIMATED_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 12
    .line 13
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 14
    .line 15
    const-string v1, "OP_CODE_UPDATE_ANIMATED_NODE_CONFIG"

    .line 16
    const/4 v2, 0x2

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_UPDATE_ANIMATED_NODE_CONFIG:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 22
    .line 23
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 24
    .line 25
    const-string v1, "OP_CODE_GET_VALUE"

    .line 26
    const/4 v3, 0x3

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 30
    .line 31
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_GET_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 32
    .line 33
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 34
    .line 35
    const-string v1, "OP_START_LISTENING_TO_ANIMATED_NODE_VALUE"

    .line 36
    const/4 v2, 0x4

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 40
    .line 41
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_START_LISTENING_TO_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 42
    .line 43
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 44
    .line 45
    const-string v1, "OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE"

    .line 46
    const/4 v3, 0x5

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 50
    .line 51
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 52
    .line 53
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 54
    .line 55
    const-string v1, "OP_CODE_CONNECT_ANIMATED_NODES"

    .line 56
    const/4 v2, 0x6

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 60
    .line 61
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_CONNECT_ANIMATED_NODES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 62
    .line 63
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 64
    .line 65
    const-string v1, "OP_CODE_DISCONNECT_ANIMATED_NODES"

    .line 66
    const/4 v3, 0x7

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 70
    .line 71
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_DISCONNECT_ANIMATED_NODES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 72
    .line 73
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 74
    .line 75
    const-string v1, "OP_CODE_START_ANIMATING_NODE"

    .line 76
    .line 77
    const/16 v2, 0x8

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 81
    .line 82
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_START_ANIMATING_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 83
    .line 84
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 85
    .line 86
    const-string v1, "OP_CODE_STOP_ANIMATION"

    .line 87
    .line 88
    const/16 v3, 0x9

    .line 89
    .line 90
    .line 91
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 92
    .line 93
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_STOP_ANIMATION:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 94
    .line 95
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 96
    .line 97
    const-string v1, "OP_CODE_SET_ANIMATED_NODE_VALUE"

    .line 98
    .line 99
    const/16 v2, 0xa

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 103
    .line 104
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_SET_ANIMATED_NODE_VALUE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 105
    .line 106
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 107
    .line 108
    const-string v1, "OP_CODE_SET_ANIMATED_NODE_OFFSET"

    .line 109
    .line 110
    const/16 v3, 0xb

    .line 111
    .line 112
    .line 113
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 114
    .line 115
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_SET_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 116
    .line 117
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 118
    .line 119
    const-string v1, "OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET"

    .line 120
    .line 121
    const/16 v2, 0xc

    .line 122
    .line 123
    .line 124
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 125
    .line 126
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 127
    .line 128
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 129
    .line 130
    const-string v1, "OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET"

    .line 131
    .line 132
    const/16 v3, 0xd

    .line 133
    .line 134
    .line 135
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 136
    .line 137
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 138
    .line 139
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 140
    .line 141
    const-string v1, "OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW"

    .line 142
    .line 143
    const/16 v2, 0xe

    .line 144
    .line 145
    .line 146
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 147
    .line 148
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 149
    .line 150
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 151
    .line 152
    const-string v1, "OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW"

    .line 153
    .line 154
    const/16 v3, 0xf

    .line 155
    .line 156
    .line 157
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 158
    .line 159
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 160
    .line 161
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 162
    .line 163
    const-string v1, "OP_CODE_RESTORE_DEFAULT_VALUES"

    .line 164
    .line 165
    const/16 v2, 0x10

    .line 166
    .line 167
    .line 168
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 169
    .line 170
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_RESTORE_DEFAULT_VALUES:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 171
    .line 172
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 173
    .line 174
    const-string v1, "OP_CODE_DROP_ANIMATED_NODE"

    .line 175
    .line 176
    const/16 v3, 0x11

    .line 177
    .line 178
    .line 179
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 180
    .line 181
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_DROP_ANIMATED_NODE:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 182
    .line 183
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 184
    .line 185
    const-string v1, "OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW"

    .line 186
    .line 187
    const/16 v2, 0x12

    .line 188
    .line 189
    .line 190
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 191
    .line 192
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 193
    .line 194
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 195
    .line 196
    const-string v1, "OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW"

    .line 197
    .line 198
    const/16 v3, 0x13

    .line 199
    .line 200
    .line 201
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 202
    .line 203
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 204
    .line 205
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 206
    .line 207
    const-string v1, "OP_CODE_ADD_LISTENER"

    .line 208
    .line 209
    const/16 v2, 0x14

    .line 210
    .line 211
    .line 212
    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 213
    .line 214
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_ADD_LISTENER:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 215
    .line 216
    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 217
    .line 218
    const-string v1, "OP_CODE_REMOVE_LISTENERS"

    .line 219
    .line 220
    const/16 v3, 0x15

    .line 221
    .line 222
    .line 223
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;-><init>(Ljava/lang/String;II)V

    .line 224
    .line 225
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->OP_CODE_REMOVE_LISTENERS:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 226
    .line 227
    .line 228
    invoke-static {}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->$values()[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 229
    move-result-object v0

    .line 230
    .line 231
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->$VALUES:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 232
    const/4 v0, 0x0

    .line 233
    .line 234
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->valueMap:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 235
    return-void
    .line 236
    .line 237
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
    iput p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->value:I

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
.end method

.method public static fromId(I)Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->valueMap:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->values()[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->valueMap:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->valueMap:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 13
    .line 14
    add-int/lit8 p0, p0, -0x1

    .line 15
    .line 16
    aget-object p0, v0, p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

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
.end method

.method public static values()[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->$VALUES:[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

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
    .line 18
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->value:I

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
    .line 18
.end method
