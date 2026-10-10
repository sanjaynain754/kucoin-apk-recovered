.class public final enum Lcom/geetest/gtc4/k0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum DIRECT:Lcom/geetest/gtc4/k0;

.field public static final enum EIGHT_BYTES:Lcom/geetest/gtc4/k0;

.field public static final enum FOUR_BYTES:Lcom/geetest/gtc4/k0;

.field public static final enum INDEFINITE:Lcom/geetest/gtc4/k0;

.field public static final enum ONE_BYTE:Lcom/geetest/gtc4/k0;

.field public static final enum RESERVED:Lcom/geetest/gtc4/k0;

.field public static final enum TWO_BYTES:Lcom/geetest/gtc4/k0;

.field public static final synthetic a:[Lcom/geetest/gtc4/k0;


# instance fields
.field private final value:I


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/k0;

    .line 3
    .line 4
    const-string v1, "DIRECT"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lcom/geetest/gtc4/k0;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lcom/geetest/gtc4/k0;->DIRECT:Lcom/geetest/gtc4/k0;

    .line 11
    .line 12
    new-instance v1, Lcom/geetest/gtc4/k0;

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    const/16 v3, 0x18

    .line 16
    .line 17
    const-string v4, "ONE_BYTE"

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lcom/geetest/gtc4/k0;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    sput-object v1, Lcom/geetest/gtc4/k0;->ONE_BYTE:Lcom/geetest/gtc4/k0;

    .line 23
    .line 24
    new-instance v2, Lcom/geetest/gtc4/k0;

    .line 25
    const/4 v3, 0x2

    .line 26
    .line 27
    const/16 v4, 0x19

    .line 28
    .line 29
    const-string v5, "TWO_BYTES"

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, Lcom/geetest/gtc4/k0;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    sput-object v2, Lcom/geetest/gtc4/k0;->TWO_BYTES:Lcom/geetest/gtc4/k0;

    .line 35
    .line 36
    new-instance v3, Lcom/geetest/gtc4/k0;

    .line 37
    const/4 v4, 0x3

    .line 38
    .line 39
    const/16 v5, 0x1a

    .line 40
    .line 41
    const-string v6, "FOUR_BYTES"

    .line 42
    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, Lcom/geetest/gtc4/k0;-><init>(Ljava/lang/String;II)V

    .line 45
    .line 46
    sput-object v3, Lcom/geetest/gtc4/k0;->FOUR_BYTES:Lcom/geetest/gtc4/k0;

    .line 47
    .line 48
    new-instance v4, Lcom/geetest/gtc4/k0;

    .line 49
    const/4 v5, 0x4

    .line 50
    .line 51
    const/16 v6, 0x1b

    .line 52
    .line 53
    const-string v7, "EIGHT_BYTES"

    .line 54
    .line 55
    .line 56
    invoke-direct {v4, v7, v5, v6}, Lcom/geetest/gtc4/k0;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    sput-object v4, Lcom/geetest/gtc4/k0;->EIGHT_BYTES:Lcom/geetest/gtc4/k0;

    .line 59
    .line 60
    new-instance v5, Lcom/geetest/gtc4/k0;

    .line 61
    const/4 v6, 0x5

    .line 62
    .line 63
    const/16 v7, 0x1c

    .line 64
    .line 65
    const-string v8, "RESERVED"

    .line 66
    .line 67
    .line 68
    invoke-direct {v5, v8, v6, v7}, Lcom/geetest/gtc4/k0;-><init>(Ljava/lang/String;II)V

    .line 69
    .line 70
    sput-object v5, Lcom/geetest/gtc4/k0;->RESERVED:Lcom/geetest/gtc4/k0;

    .line 71
    .line 72
    new-instance v6, Lcom/geetest/gtc4/k0;

    .line 73
    const/4 v7, 0x6

    .line 74
    .line 75
    const/16 v8, 0x1f

    .line 76
    .line 77
    const-string v9, "INDEFINITE"

    .line 78
    .line 79
    .line 80
    invoke-direct {v6, v9, v7, v8}, Lcom/geetest/gtc4/k0;-><init>(Ljava/lang/String;II)V

    .line 81
    .line 82
    sput-object v6, Lcom/geetest/gtc4/k0;->INDEFINITE:Lcom/geetest/gtc4/k0;

    .line 83
    .line 84
    .line 85
    filled-new-array/range {v0 .. v6}, [Lcom/geetest/gtc4/k0;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    sput-object v0, Lcom/geetest/gtc4/k0;->a:[Lcom/geetest/gtc4/k0;

    .line 89
    return-void
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
    .line 236
    .line 237
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/geetest/gtc4/k0;->value:I

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

.method public static ofByte(I)Lcom/geetest/gtc4/k0;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p0, p0, 0x1f

    .line 3
    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    sget-object p0, Lcom/geetest/gtc4/k0;->DIRECT:Lcom/geetest/gtc4/k0;

    .line 8
    return-object p0

    .line 9
    .line 10
    :pswitch_0
    sget-object p0, Lcom/geetest/gtc4/k0;->INDEFINITE:Lcom/geetest/gtc4/k0;

    .line 11
    return-object p0

    .line 12
    .line 13
    :pswitch_1
    sget-object p0, Lcom/geetest/gtc4/k0;->RESERVED:Lcom/geetest/gtc4/k0;

    .line 14
    return-object p0

    .line 15
    .line 16
    :pswitch_2
    sget-object p0, Lcom/geetest/gtc4/k0;->EIGHT_BYTES:Lcom/geetest/gtc4/k0;

    .line 17
    return-object p0

    .line 18
    .line 19
    :pswitch_3
    sget-object p0, Lcom/geetest/gtc4/k0;->FOUR_BYTES:Lcom/geetest/gtc4/k0;

    .line 20
    return-object p0

    .line 21
    .line 22
    :pswitch_4
    sget-object p0, Lcom/geetest/gtc4/k0;->TWO_BYTES:Lcom/geetest/gtc4/k0;

    .line 23
    return-object p0

    .line 24
    .line 25
    :pswitch_5
    sget-object p0, Lcom/geetest/gtc4/k0;->ONE_BYTE:Lcom/geetest/gtc4/k0;

    .line 26
    return-object p0

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
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static valueOf(Ljava/lang/String;)Lcom/geetest/gtc4/k0;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/geetest/gtc4/k0;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/geetest/gtc4/k0;

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

.method public static values()[Lcom/geetest/gtc4/k0;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/geetest/gtc4/k0;->a:[Lcom/geetest/gtc4/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/geetest/gtc4/k0;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/geetest/gtc4/k0;

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
    iget v0, p0, Lcom/geetest/gtc4/k0;->value:I

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
