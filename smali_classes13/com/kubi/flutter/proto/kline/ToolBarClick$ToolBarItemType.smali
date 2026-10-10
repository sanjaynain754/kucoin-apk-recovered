.class public final enum Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;
.super Ljava/lang/Enum;
.source "ToolBarClick.java"

# interfaces
.implements Lcom/google/protobuf/Internal$EnumLite;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/flutter/proto/kline/ToolBarClick;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ToolBarItemType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;",
        ">;",
        "Lcom/google/protobuf/Internal$EnumLite;"
    }
.end annotation


# static fields
.field public static final enum BAR_ITEM_DROP:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

.field public static final BAR_ITEM_DROP_VALUE:I = 0x4

.field public static final enum BAR_ITEM_EYE:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

.field public static final BAR_ITEM_EYE_VALUE:I = 0x3

.field public static final enum BAR_ITEM_Enter:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

.field public static final BAR_ITEM_Enter_VALUE:I = 0x6

.field public static final enum BAR_ITEM_Exit:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

.field public static final BAR_ITEM_Exit_VALUE:I = 0x7

.field public static final enum BAR_ITEM_LOCK:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

.field public static final BAR_ITEM_LOCK_VALUE:I = 0x5

.field public static final enum BAR_ITEM_RECT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

.field public static final BAR_ITEM_RECT_VALUE:I = 0x2

.field public static final enum BAR_ITEM_SEGMENT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

.field public static final BAR_ITEM_SEGMENT_VALUE:I = 0x0

.field public static final enum BAR_ITEM_STRAIGHT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

.field public static final BAR_ITEM_STRAIGHT_VALUE:I = 0x1

.field public static final enum UNRECOGNIZED:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

.field public static final b:Lcom/google/protobuf/Internal$EnumLiteMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic c:[Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 3
    .line 4
    const-string v1, "BAR_ITEM_SEGMENT"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_SEGMENT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 13
    .line 14
    const-string v1, "BAR_ITEM_STRAIGHT"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v2}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_STRAIGHT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 21
    .line 22
    new-instance v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 23
    .line 24
    const-string v1, "BAR_ITEM_RECT"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v2}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_RECT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 31
    .line 32
    new-instance v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 33
    .line 34
    const-string v1, "BAR_ITEM_EYE"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2, v2}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_EYE:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 41
    .line 42
    new-instance v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 43
    .line 44
    const-string v1, "BAR_ITEM_DROP"

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2, v2}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_DROP:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 51
    .line 52
    new-instance v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 53
    .line 54
    const-string v1, "BAR_ITEM_LOCK"

    .line 55
    const/4 v2, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1, v2, v2}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_LOCK:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 61
    .line 62
    new-instance v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 63
    .line 64
    const-string v1, "BAR_ITEM_Enter"

    .line 65
    const/4 v2, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1, v2, v2}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;-><init>(Ljava/lang/String;II)V

    .line 69
    .line 70
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_Enter:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 71
    .line 72
    new-instance v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 73
    .line 74
    const-string v1, "BAR_ITEM_Exit"

    .line 75
    const/4 v2, 0x7

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, v1, v2, v2}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;-><init>(Ljava/lang/String;II)V

    .line 79
    .line 80
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_Exit:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 81
    .line 82
    new-instance v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 83
    .line 84
    const/16 v1, 0x8

    .line 85
    const/4 v2, -0x1

    .line 86
    .line 87
    const-string v3, "UNRECOGNIZED"

    .line 88
    .line 89
    .line 90
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;-><init>(Ljava/lang/String;II)V

    .line 91
    .line 92
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->UNRECOGNIZED:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->a()[Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->c:[Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 99
    .line 100
    new-instance v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType$a;

    .line 101
    .line 102
    .line 103
    invoke-direct {v0}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType$a;-><init>()V

    .line 104
    .line 105
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->b:Lcom/google/protobuf/Internal$EnumLiteMap;

    .line 106
    return-void
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
    .line 235
.end method

.method public constructor <init>(Ljava/lang/String;II)V
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
    iput p3, p0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->value:I

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
.end method

.method public static synthetic a()[Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_SEGMENT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_STRAIGHT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_RECT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_EYE:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 9
    .line 10
    sget-object v4, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_DROP:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 11
    .line 12
    sget-object v5, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_LOCK:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 13
    .line 14
    sget-object v6, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_Enter:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 15
    .line 16
    sget-object v7, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_Exit:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 17
    .line 18
    sget-object v8, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->UNRECOGNIZED:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 19
    .line 20
    .line 21
    filled-new-array/range {v0 .. v8}, [Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 22
    move-result-object v0

    .line 23
    return-object v0
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
.end method

.method public static forNumber(I)Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;
    .locals 0

    .line 1
    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0

    .line 6
    .line 7
    :pswitch_0
    sget-object p0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_Exit:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 8
    return-object p0

    .line 9
    .line 10
    :pswitch_1
    sget-object p0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_Enter:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 11
    return-object p0

    .line 12
    .line 13
    :pswitch_2
    sget-object p0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_LOCK:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 14
    return-object p0

    .line 15
    .line 16
    :pswitch_3
    sget-object p0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_DROP:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 17
    return-object p0

    .line 18
    .line 19
    :pswitch_4
    sget-object p0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_EYE:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 20
    return-object p0

    .line 21
    .line 22
    :pswitch_5
    sget-object p0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_RECT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 23
    return-object p0

    .line 24
    .line 25
    :pswitch_6
    sget-object p0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_STRAIGHT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 26
    return-object p0

    .line 27
    .line 28
    :pswitch_7
    sget-object p0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->BAR_ITEM_SEGMENT:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 29
    return-object p0

    .line 30
    nop

    .line 31
    .line 32
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static internalGetValueMap()Lcom/google/protobuf/Internal$EnumLiteMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->b:Lcom/google/protobuf/Internal$EnumLiteMap;

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
.end method

.method public static internalGetVerifier()Lcom/google/protobuf/Internal$EnumVerifier;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType$b;->a:Lcom/google/protobuf/Internal$EnumVerifier;

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
.end method

.method public static valueOf(I)Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->forNumber(I)Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;
    .locals 1

    .line 1
    const-class v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    return-object p0
.end method

.method public static values()[Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->c:[Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

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
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->UNRECOGNIZED:Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;

    .line 3
    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;->value:I

    .line 7
    return v0

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v1, "Can\'t get the number of an unknown enum value."

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    throw v0
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
.end method
