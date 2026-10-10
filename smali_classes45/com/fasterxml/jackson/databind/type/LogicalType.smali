.class public final enum Lcom/fasterxml/jackson/databind/type/LogicalType;
.super Ljava/lang/Enum;
.source "LogicalType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/databind/type/LogicalType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum Array:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum Binary:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum Boolean:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum Collection:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum DateTime:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum Enum:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum Float:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum Integer:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum Map:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum OtherScalar:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum POJO:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum Textual:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final enum Untyped:Lcom/fasterxml/jackson/databind/type/LogicalType;

.field public static final synthetic b:[Lcom/fasterxml/jackson/databind/type/LogicalType;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 3
    .line 4
    const-string v1, "Array"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Array:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 11
    .line 12
    new-instance v1, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 13
    .line 14
    const-string v2, "Collection"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v1, Lcom/fasterxml/jackson/databind/type/LogicalType;->Collection:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 21
    .line 22
    new-instance v2, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 23
    .line 24
    const-string v3, "Map"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v2, Lcom/fasterxml/jackson/databind/type/LogicalType;->Map:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 31
    .line 32
    new-instance v3, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 33
    .line 34
    const-string v4, "POJO"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v3, Lcom/fasterxml/jackson/databind/type/LogicalType;->POJO:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 41
    .line 42
    new-instance v4, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 43
    .line 44
    const-string v5, "Untyped"

    .line 45
    const/4 v6, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v5, v6}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v4, Lcom/fasterxml/jackson/databind/type/LogicalType;->Untyped:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 51
    .line 52
    new-instance v5, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 53
    .line 54
    const-string v6, "Integer"

    .line 55
    const/4 v7, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v5, v6, v7}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    sput-object v5, Lcom/fasterxml/jackson/databind/type/LogicalType;->Integer:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 61
    .line 62
    new-instance v6, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 63
    .line 64
    const-string v7, "Float"

    .line 65
    const/4 v8, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v6, v7, v8}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 69
    .line 70
    sput-object v6, Lcom/fasterxml/jackson/databind/type/LogicalType;->Float:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 71
    .line 72
    new-instance v7, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 73
    .line 74
    const-string v8, "Boolean"

    .line 75
    const/4 v9, 0x7

    .line 76
    .line 77
    .line 78
    invoke-direct {v7, v8, v9}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 79
    .line 80
    sput-object v7, Lcom/fasterxml/jackson/databind/type/LogicalType;->Boolean:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 81
    .line 82
    new-instance v8, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 83
    .line 84
    const-string v9, "Enum"

    .line 85
    .line 86
    const/16 v10, 0x8

    .line 87
    .line 88
    .line 89
    invoke-direct {v8, v9, v10}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 90
    .line 91
    sput-object v8, Lcom/fasterxml/jackson/databind/type/LogicalType;->Enum:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 92
    .line 93
    new-instance v9, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 94
    .line 95
    const-string v10, "Textual"

    .line 96
    .line 97
    const/16 v11, 0x9

    .line 98
    .line 99
    .line 100
    invoke-direct {v9, v10, v11}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 101
    .line 102
    sput-object v9, Lcom/fasterxml/jackson/databind/type/LogicalType;->Textual:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 103
    .line 104
    new-instance v10, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 105
    .line 106
    const-string v11, "Binary"

    .line 107
    .line 108
    const/16 v12, 0xa

    .line 109
    .line 110
    .line 111
    invoke-direct {v10, v11, v12}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 112
    .line 113
    sput-object v10, Lcom/fasterxml/jackson/databind/type/LogicalType;->Binary:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 114
    .line 115
    new-instance v11, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 116
    .line 117
    const-string v12, "DateTime"

    .line 118
    .line 119
    const/16 v13, 0xb

    .line 120
    .line 121
    .line 122
    invoke-direct {v11, v12, v13}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 123
    .line 124
    sput-object v11, Lcom/fasterxml/jackson/databind/type/LogicalType;->DateTime:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 125
    .line 126
    new-instance v12, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 127
    .line 128
    const-string v13, "OtherScalar"

    .line 129
    .line 130
    const/16 v14, 0xc

    .line 131
    .line 132
    .line 133
    invoke-direct {v12, v13, v14}, Lcom/fasterxml/jackson/databind/type/LogicalType;-><init>(Ljava/lang/String;I)V

    .line 134
    .line 135
    sput-object v12, Lcom/fasterxml/jackson/databind/type/LogicalType;->OtherScalar:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 136
    .line 137
    .line 138
    filled-new-array/range {v0 .. v12}, [Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    sput-object v0, Lcom/fasterxml/jackson/databind/type/LogicalType;->b:[Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 142
    return-void
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

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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
.end method

.method public static fromClass(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/type/LogicalType;)Lcom/fasterxml/jackson/databind/type/LogicalType;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/type/LogicalType;",
            ")",
            "Lcom/fasterxml/jackson/databind/type/LogicalType;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Enum:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 9
    return-object p0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    const-class p1, [B

    .line 18
    .line 19
    if-ne p0, p1, :cond_1

    .line 20
    .line 21
    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Binary:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 22
    return-object p0

    .line 23
    .line 24
    :cond_1
    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Array:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 25
    return-object p0

    .line 26
    .line 27
    :cond_2
    const-class v0, Ljava/util/Collection;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Collection:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 36
    return-object p0

    .line 37
    .line 38
    :cond_3
    const-class v0, Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Map:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 47
    return-object p0

    .line 48
    .line 49
    :cond_4
    const-class v0, Ljava/lang/String;

    .line 50
    .line 51
    if-ne p0, v0, :cond_5

    .line 52
    .line 53
    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Textual:Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 54
    return-object p0

    .line 55
    :cond_5
    return-object p1
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/type/LogicalType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/fasterxml/jackson/databind/type/LogicalType;

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

.method public static values()[Lcom/fasterxml/jackson/databind/type/LogicalType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/fasterxml/jackson/databind/type/LogicalType;->b:[Lcom/fasterxml/jackson/databind/type/LogicalType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/fasterxml/jackson/databind/type/LogicalType;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/fasterxml/jackson/databind/type/LogicalType;

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
