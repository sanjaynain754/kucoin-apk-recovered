.class public final enum Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;
.super Ljava/lang/Enum;
.source "EventMessage.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/flutter/proto/kline/EventMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EventTypeCase"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CONFIRMALERTEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

.field public static final enum EVENTTYPE_NOT_SET:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

.field public static final enum JUMPEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

.field public static final enum LOADMORE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

.field public static final enum PAINTGUIDE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

.field public static final enum QUITEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

.field public static final enum STATEEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

.field public static final enum TOASTEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

.field public static final enum TOOLBARMODE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

.field public static final synthetic b:[Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 3
    .line 4
    const-string v1, "STATEEVENT"

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    sput-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->STATEEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 12
    .line 13
    new-instance v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 14
    .line 15
    const-string v1, "LOADMORE"

    .line 16
    const/4 v4, 0x2

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1, v3, v4}, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    sput-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->LOADMORE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 24
    .line 25
    const-string v1, "JUMPEVENT"

    .line 26
    const/4 v3, 0x3

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, v4, v3}, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;-><init>(Ljava/lang/String;II)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->JUMPEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 32
    .line 33
    new-instance v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 34
    .line 35
    const-string v1, "CONFIRMALERTEVENT"

    .line 36
    const/4 v4, 0x4

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1, v3, v4}, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;-><init>(Ljava/lang/String;II)V

    .line 40
    .line 41
    sput-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->CONFIRMALERTEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 42
    .line 43
    new-instance v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 44
    .line 45
    const-string v1, "TOASTEVENT"

    .line 46
    const/4 v3, 0x5

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v1, v4, v3}, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;-><init>(Ljava/lang/String;II)V

    .line 50
    .line 51
    sput-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->TOASTEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 52
    .line 53
    new-instance v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 54
    .line 55
    const-string v1, "PAINTGUIDE"

    .line 56
    const/4 v4, 0x6

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1, v3, v4}, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;-><init>(Ljava/lang/String;II)V

    .line 60
    .line 61
    sput-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->PAINTGUIDE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 62
    .line 63
    new-instance v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 64
    .line 65
    const-string v1, "QUITEVENT"

    .line 66
    const/4 v3, 0x7

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v1, v4, v3}, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;-><init>(Ljava/lang/String;II)V

    .line 70
    .line 71
    sput-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->QUITEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 72
    .line 73
    new-instance v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 74
    .line 75
    const-string v1, "TOOLBARMODE"

    .line 76
    .line 77
    const/16 v4, 0x8

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, v1, v3, v4}, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;-><init>(Ljava/lang/String;II)V

    .line 81
    .line 82
    sput-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->TOOLBARMODE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 83
    .line 84
    new-instance v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 85
    .line 86
    const-string v1, "EVENTTYPE_NOT_SET"

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, v1, v4, v2}, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;-><init>(Ljava/lang/String;II)V

    .line 90
    .line 91
    sput-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->EVENTTYPE_NOT_SET:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->a()[Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    sput-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->b:[Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 98
    return-void
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
    iput p3, p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->value:I

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

.method public static synthetic a()[Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->STATEEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->LOADMORE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->JUMPEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->CONFIRMALERTEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 9
    .line 10
    sget-object v4, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->TOASTEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 11
    .line 12
    sget-object v5, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->PAINTGUIDE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 13
    .line 14
    sget-object v6, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->QUITEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 15
    .line 16
    sget-object v7, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->TOOLBARMODE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 17
    .line 18
    sget-object v8, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->EVENTTYPE_NOT_SET:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 19
    .line 20
    .line 21
    filled-new-array/range {v0 .. v8}, [Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

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

.method public static forNumber(I)Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;
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
    sget-object p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->TOOLBARMODE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 8
    return-object p0

    .line 9
    .line 10
    :pswitch_1
    sget-object p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->QUITEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 11
    return-object p0

    .line 12
    .line 13
    :pswitch_2
    sget-object p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->PAINTGUIDE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 14
    return-object p0

    .line 15
    .line 16
    :pswitch_3
    sget-object p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->TOASTEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 17
    return-object p0

    .line 18
    .line 19
    :pswitch_4
    sget-object p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->CONFIRMALERTEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 20
    return-object p0

    .line 21
    .line 22
    :pswitch_5
    sget-object p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->JUMPEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 23
    return-object p0

    .line 24
    .line 25
    :pswitch_6
    sget-object p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->LOADMORE:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 26
    return-object p0

    .line 27
    .line 28
    :pswitch_7
    sget-object p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->STATEEVENT:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 29
    return-object p0

    .line 30
    .line 31
    :pswitch_8
    sget-object p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->EVENTTYPE_NOT_SET:Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 32
    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
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
.end method

.method public static valueOf(I)Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->forNumber(I)Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;
    .locals 1

    .line 1
    const-class v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    return-object p0
.end method

.method public static values()[Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->b:[Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;

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
.method public getNumber()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;->value:I

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
