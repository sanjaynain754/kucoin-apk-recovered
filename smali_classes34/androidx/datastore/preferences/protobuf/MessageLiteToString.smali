.class final Landroidx/datastore/preferences/protobuf/MessageLiteToString;
.super Ljava/lang/Object;
.source "MessageLiteToString.java"


# static fields
.field private static final BUILDER_LIST_SUFFIX:Ljava/lang/String; = "OrBuilderList"

.field private static final BYTES_SUFFIX:Ljava/lang/String; = "Bytes"

.field private static final INDENT_BUFFER:[C

.field private static final LIST_SUFFIX:Ljava/lang/String; = "List"

.field private static final MAP_SUFFIX:Ljava/lang/String; = "Map"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x50

    .line 3
    .line 4
    new-array v0, v0, [C

    .line 5
    .line 6
    sput-object v0, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->INDENT_BUFFER:[C

    .line 7
    .line 8
    const/16 v1, 0x20

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([CC)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private constructor <init>()V
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
.end method

.method private static indent(ILjava/lang/StringBuilder;)V
    .locals 3

    .line 1
    .line 2
    :goto_0
    if-lez p0, :cond_1

    .line 3
    .line 4
    sget-object v0, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->INDENT_BUFFER:[C

    .line 5
    array-length v1, v0

    .line 6
    .line 7
    if-le p0, v1, :cond_0

    .line 8
    array-length v1, v0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    move v1, p0

    .line 11
    :goto_1
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0, v2, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 15
    sub-int/2addr p0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    return-void
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
.end method

.method private static isDefaultValue(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    .line 2
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    move-result p0

    .line 12
    xor-int/2addr p0, v1

    .line 13
    return p0

    .line 14
    .line 15
    :cond_0
    instance-of v0, p0, Ljava/lang/Integer;

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 24
    move-result p0

    .line 25
    .line 26
    if-nez p0, :cond_1

    .line 27
    return v1

    .line 28
    :cond_1
    return v2

    .line 29
    .line 30
    :cond_2
    instance-of v0, p0, Ljava/lang/Float;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    check-cast p0, Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 38
    move-result p0

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 42
    move-result p0

    .line 43
    .line 44
    if-nez p0, :cond_3

    .line 45
    return v1

    .line 46
    :cond_3
    return v2

    .line 47
    .line 48
    :cond_4
    instance-of v0, p0, Ljava/lang/Double;

    .line 49
    .line 50
    if-eqz v0, :cond_6

    .line 51
    .line 52
    check-cast p0, Ljava/lang/Double;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 56
    move-result-wide v3

    .line 57
    .line 58
    .line 59
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 60
    move-result-wide v3

    .line 61
    .line 62
    const-wide/16 v5, 0x0

    .line 63
    .line 64
    cmp-long p0, v3, v5

    .line 65
    .line 66
    if-nez p0, :cond_5

    .line 67
    return v1

    .line 68
    :cond_5
    return v2

    .line 69
    .line 70
    :cond_6
    instance-of v0, p0, Ljava/lang/String;

    .line 71
    .line 72
    if-eqz v0, :cond_7

    .line 73
    .line 74
    const-string v0, ""

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    move-result p0

    .line 79
    return p0

    .line 80
    .line 81
    :cond_7
    instance-of v0, p0, Landroidx/datastore/preferences/protobuf/ByteString;

    .line 82
    .line 83
    if-eqz v0, :cond_8

    .line 84
    .line 85
    sget-object v0, Landroidx/datastore/preferences/protobuf/ByteString;->EMPTY:Landroidx/datastore/preferences/protobuf/ByteString;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    move-result p0

    .line 90
    return p0

    .line 91
    .line 92
    :cond_8
    instance-of v0, p0, Landroidx/datastore/preferences/protobuf/MessageLite;

    .line 93
    .line 94
    if-eqz v0, :cond_a

    .line 95
    move-object v0, p0

    .line 96
    .line 97
    check-cast v0, Landroidx/datastore/preferences/protobuf/MessageLite;

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/MessageLiteOrBuilder;->getDefaultInstanceForType()Landroidx/datastore/preferences/protobuf/MessageLite;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    if-ne p0, v0, :cond_9

    .line 104
    return v1

    .line 105
    :cond_9
    return v2

    .line 106
    .line 107
    :cond_a
    instance-of v0, p0, Ljava/lang/Enum;

    .line 108
    .line 109
    if-eqz v0, :cond_b

    .line 110
    .line 111
    check-cast p0, Ljava/lang/Enum;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 115
    move-result p0

    .line 116
    .line 117
    if-nez p0, :cond_b

    .line 118
    return v1

    .line 119
    :cond_b
    return v2
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

.method private static pascalCaseToSnakeCase(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-object p0

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 17
    move-result v1

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    .line 21
    move-result v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    const/4 v1, 0x1

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 29
    move-result v2

    .line 30
    .line 31
    if-ge v1, v2, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 35
    move-result v2

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Ljava/lang/Character;->isUpperCase(C)Z

    .line 39
    move-result v3

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    const-string v3, "_"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    .line 50
    move-result v2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    goto :goto_0

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    move-result-object p0

    .line 61
    return-object p0
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
.end method

.method public static printField(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 1
    .line 2
    instance-of v0, p3, Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p3, Ljava/util/List;

    .line 7
    .line 8
    .line 9
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object p3

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p1, p2, v0}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->printField(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    instance-of v0, p3, Ljava/util/Map;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    check-cast p3, Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 34
    move-result-object p3

    .line 35
    .line 36
    .line 37
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 38
    move-result-object p3

    .line 39
    .line 40
    .line 41
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    check-cast v0, Ljava/util/Map$Entry;

    .line 51
    .line 52
    .line 53
    invoke-static {p0, p1, p2, v0}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->printField(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    return-void

    .line 56
    .line 57
    :cond_2
    const/16 v0, 0xa

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-static {p1, p0}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->indent(ILjava/lang/StringBuilder;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p2}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->pascalCaseToSnakeCase(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    move-result-object p2

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    instance-of p2, p3, Ljava/lang/String;

    .line 73
    .line 74
    const/16 v0, 0x22

    .line 75
    .line 76
    const-string v1, ": \""

    .line 77
    .line 78
    if-eqz p2, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    check-cast p3, Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    invoke-static {p3}, Landroidx/datastore/preferences/protobuf/TextFormatEscaper;->escapeText(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    return-void

    .line 95
    .line 96
    :cond_3
    instance-of p2, p3, Landroidx/datastore/preferences/protobuf/ByteString;

    .line 97
    .line 98
    if-eqz p2, :cond_4

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    check-cast p3, Landroidx/datastore/preferences/protobuf/ByteString;

    .line 104
    .line 105
    .line 106
    invoke-static {p3}, Landroidx/datastore/preferences/protobuf/TextFormatEscaper;->escapeBytes(Landroidx/datastore/preferences/protobuf/ByteString;)Ljava/lang/String;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    return-void

    .line 115
    .line 116
    :cond_4
    instance-of p2, p3, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;

    .line 117
    .line 118
    .line 119
    const-string/jumbo v0, "}"

    .line 120
    .line 121
    const-string v1, "\n"

    .line 122
    .line 123
    const-string v2, " {"

    .line 124
    .line 125
    if-eqz p2, :cond_5

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    check-cast p3, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;

    .line 131
    .line 132
    add-int/lit8 p2, p1, 0x2

    .line 133
    .line 134
    .line 135
    invoke-static {p3, p0, p2}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->reflectivePrintWithIndent(Landroidx/datastore/preferences/protobuf/MessageLite;Ljava/lang/StringBuilder;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-static {p1, p0}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->indent(ILjava/lang/StringBuilder;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    return-void

    .line 146
    .line 147
    :cond_5
    instance-of p2, p3, Ljava/util/Map$Entry;

    .line 148
    .line 149
    if-eqz p2, :cond_6

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    check-cast p3, Ljava/util/Map$Entry;

    .line 155
    .line 156
    add-int/lit8 p2, p1, 0x2

    .line 157
    .line 158
    .line 159
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 160
    move-result-object v2

    .line 161
    .line 162
    const-string v3, "key"

    .line 163
    .line 164
    .line 165
    invoke-static {p0, p2, v3, v2}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->printField(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    const-string/jumbo v2, "value"

    .line 169
    .line 170
    .line 171
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 172
    move-result-object p3

    .line 173
    .line 174
    .line 175
    invoke-static {p0, p2, v2, p3}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->printField(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-static {p1, p0}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->indent(ILjava/lang/StringBuilder;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    return-void

    .line 186
    .line 187
    :cond_6
    const-string p1, ": "

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 194
    return-void
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
.end method

.method private static reflectivePrintWithIndent(Landroidx/datastore/preferences/protobuf/MessageLite;Ljava/lang/StringBuilder;I)V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move/from16 v2, p2

    .line 7
    .line 8
    new-instance v3, Ljava/util/HashSet;

    .line 9
    .line 10
    .line 11
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 12
    .line 13
    new-instance v4, Ljava/util/HashMap;

    .line 14
    .line 15
    .line 16
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    new-instance v5, Ljava/util/TreeMap;

    .line 19
    .line 20
    .line 21
    invoke-direct {v5}, Ljava/util/TreeMap;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    move-result-object v6

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 29
    move-result-object v6

    .line 30
    array-length v7, v6

    .line 31
    const/4 v8, 0x0

    .line 32
    move v9, v8

    .line 33
    .line 34
    :goto_0
    const-string v10, "get"

    .line 35
    .line 36
    const-string v11, "has"

    .line 37
    .line 38
    .line 39
    const-string/jumbo v12, "set"

    .line 40
    const/4 v13, 0x3

    .line 41
    .line 42
    if-ge v9, v7, :cond_7

    .line 43
    .line 44
    aget-object v14, v6, v9

    .line 45
    .line 46
    .line 47
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 48
    move-result v15

    .line 49
    .line 50
    .line 51
    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 52
    move-result v15

    .line 53
    .line 54
    if-eqz v15, :cond_0

    .line 55
    goto :goto_1

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 59
    move-result-object v15

    .line 60
    .line 61
    .line 62
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 63
    move-result v15

    .line 64
    .line 65
    if-ge v15, v13, :cond_1

    .line 66
    goto :goto_1

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 70
    move-result-object v13

    .line 71
    .line 72
    .line 73
    invoke-virtual {v13, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 74
    move-result v12

    .line 75
    .line 76
    if-eqz v12, :cond_2

    .line 77
    .line 78
    .line 79
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 80
    move-result-object v10

    .line 81
    .line 82
    .line 83
    invoke-interface {v3, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 84
    goto :goto_1

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 88
    move-result v12

    .line 89
    .line 90
    .line 91
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 92
    move-result v12

    .line 93
    .line 94
    if-nez v12, :cond_3

    .line 95
    goto :goto_1

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 99
    move-result-object v12

    .line 100
    array-length v12, v12

    .line 101
    .line 102
    if-eqz v12, :cond_4

    .line 103
    goto :goto_1

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 107
    move-result-object v12

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 111
    move-result v11

    .line 112
    .line 113
    if-eqz v11, :cond_5

    .line 114
    .line 115
    .line 116
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 117
    move-result-object v10

    .line 118
    .line 119
    .line 120
    invoke-interface {v4, v10, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    goto :goto_1

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 125
    move-result-object v11

    .line 126
    .line 127
    .line 128
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 129
    move-result v10

    .line 130
    .line 131
    if-eqz v10, :cond_6

    .line 132
    .line 133
    .line 134
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 135
    move-result-object v10

    .line 136
    .line 137
    .line 138
    invoke-interface {v5, v10, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    :cond_6
    :goto_1
    add-int/lit8 v9, v9, 0x1

    .line 141
    goto :goto_0

    .line 142
    .line 143
    .line 144
    :cond_7
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 145
    move-result-object v6

    .line 146
    .line 147
    .line 148
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 149
    move-result-object v6

    .line 150
    .line 151
    .line 152
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    move-result v7

    .line 154
    .line 155
    if-eqz v7, :cond_10

    .line 156
    .line 157
    .line 158
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    move-result-object v7

    .line 160
    .line 161
    check-cast v7, Ljava/util/Map$Entry;

    .line 162
    .line 163
    .line 164
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 165
    move-result-object v9

    .line 166
    .line 167
    check-cast v9, Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v9, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 171
    move-result-object v9

    .line 172
    .line 173
    const-string v14, "List"

    .line 174
    .line 175
    .line 176
    invoke-virtual {v9, v14}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 177
    move-result v15

    .line 178
    .line 179
    if-eqz v15, :cond_9

    .line 180
    .line 181
    const-string v15, "OrBuilderList"

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 185
    move-result v15

    .line 186
    .line 187
    if-nez v15, :cond_9

    .line 188
    .line 189
    .line 190
    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    move-result v14

    .line 192
    .line 193
    if-nez v14, :cond_9

    .line 194
    .line 195
    .line 196
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 197
    move-result-object v14

    .line 198
    .line 199
    check-cast v14, Ljava/lang/reflect/Method;

    .line 200
    .line 201
    if-eqz v14, :cond_9

    .line 202
    .line 203
    .line 204
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 205
    move-result-object v15

    .line 206
    .line 207
    move/from16 v16, v13

    .line 208
    .line 209
    const-class v13, Ljava/util/List;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v15, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 213
    move-result v13

    .line 214
    .line 215
    if-eqz v13, :cond_a

    .line 216
    .line 217
    .line 218
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 219
    move-result v7

    .line 220
    .line 221
    add-int/lit8 v7, v7, -0x4

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9, v8, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 225
    move-result-object v7

    .line 226
    .line 227
    new-array v9, v8, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    invoke-static {v14, v0, v9}, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;->invokeOrDie(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    move-result-object v9

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v2, v7, v9}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->printField(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 235
    .line 236
    :cond_8
    :goto_3
    move/from16 v13, v16

    .line 237
    goto :goto_2

    .line 238
    .line 239
    :cond_9
    move/from16 v16, v13

    .line 240
    .line 241
    :cond_a
    const-string v13, "Map"

    .line 242
    .line 243
    .line 244
    invoke-virtual {v9, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 245
    move-result v14

    .line 246
    .line 247
    if-eqz v14, :cond_b

    .line 248
    .line 249
    .line 250
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    move-result v13

    .line 252
    .line 253
    if-nez v13, :cond_b

    .line 254
    .line 255
    .line 256
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 257
    move-result-object v13

    .line 258
    .line 259
    check-cast v13, Ljava/lang/reflect/Method;

    .line 260
    .line 261
    if-eqz v13, :cond_b

    .line 262
    .line 263
    .line 264
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 265
    move-result-object v14

    .line 266
    .line 267
    const-class v15, Ljava/util/Map;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 271
    move-result v14

    .line 272
    .line 273
    if-eqz v14, :cond_b

    .line 274
    .line 275
    const-class v14, Ljava/lang/Deprecated;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v13, v14}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 279
    move-result v14

    .line 280
    .line 281
    if-nez v14, :cond_b

    .line 282
    .line 283
    .line 284
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 285
    move-result v14

    .line 286
    .line 287
    .line 288
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 289
    move-result v14

    .line 290
    .line 291
    if-eqz v14, :cond_b

    .line 292
    .line 293
    .line 294
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 295
    move-result v7

    .line 296
    .line 297
    add-int/lit8 v7, v7, -0x3

    .line 298
    .line 299
    .line 300
    invoke-virtual {v9, v8, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 301
    move-result-object v7

    .line 302
    .line 303
    new-array v9, v8, [Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    invoke-static {v13, v0, v9}, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;->invokeOrDie(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    move-result-object v9

    .line 308
    .line 309
    .line 310
    invoke-static {v1, v2, v7, v9}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->printField(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 311
    goto :goto_3

    .line 312
    .line 313
    :cond_b
    new-instance v13, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    move-result-object v13

    .line 327
    .line 328
    .line 329
    invoke-interface {v3, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 330
    move-result v13

    .line 331
    .line 332
    if-nez v13, :cond_c

    .line 333
    :goto_4
    goto :goto_3

    .line 334
    .line 335
    :cond_c
    const-string v13, "Bytes"

    .line 336
    .line 337
    .line 338
    invoke-virtual {v9, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 339
    move-result v13

    .line 340
    .line 341
    if-eqz v13, :cond_d

    .line 342
    .line 343
    new-instance v13, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 353
    move-result v14

    .line 354
    .line 355
    add-int/lit8 v14, v14, -0x5

    .line 356
    .line 357
    .line 358
    invoke-virtual {v9, v8, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 359
    move-result-object v14

    .line 360
    .line 361
    .line 362
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    move-result-object v13

    .line 367
    .line 368
    .line 369
    invoke-interface {v5, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 370
    move-result v13

    .line 371
    .line 372
    if-eqz v13, :cond_d

    .line 373
    goto :goto_4

    .line 374
    .line 375
    .line 376
    :cond_d
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 377
    move-result-object v7

    .line 378
    .line 379
    check-cast v7, Ljava/lang/reflect/Method;

    .line 380
    .line 381
    new-instance v13, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    move-result-object v13

    .line 395
    .line 396
    .line 397
    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    move-result-object v13

    .line 399
    .line 400
    check-cast v13, Ljava/lang/reflect/Method;

    .line 401
    .line 402
    if-eqz v7, :cond_8

    .line 403
    .line 404
    new-array v14, v8, [Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    invoke-static {v7, v0, v14}, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;->invokeOrDie(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    move-result-object v7

    .line 409
    .line 410
    if-nez v13, :cond_f

    .line 411
    .line 412
    .line 413
    invoke-static {v7}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->isDefaultValue(Ljava/lang/Object;)Z

    .line 414
    move-result v13

    .line 415
    .line 416
    if-nez v13, :cond_e

    .line 417
    const/4 v13, 0x1

    .line 418
    goto :goto_5

    .line 419
    :cond_e
    move v13, v8

    .line 420
    goto :goto_5

    .line 421
    .line 422
    :cond_f
    new-array v14, v8, [Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    invoke-static {v13, v0, v14}, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;->invokeOrDie(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    move-result-object v13

    .line 427
    .line 428
    check-cast v13, Ljava/lang/Boolean;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 432
    move-result v13

    .line 433
    .line 434
    :goto_5
    if-eqz v13, :cond_8

    .line 435
    .line 436
    .line 437
    invoke-static {v1, v2, v9, v7}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->printField(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 438
    .line 439
    goto/16 :goto_3

    .line 440
    .line 441
    :cond_10
    instance-of v3, v0, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$ExtendableMessage;

    .line 442
    .line 443
    if-eqz v3, :cond_11

    .line 444
    move-object v3, v0

    .line 445
    .line 446
    check-cast v3, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$ExtendableMessage;

    .line 447
    .line 448
    iget-object v3, v3, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$ExtendableMessage;->extensions:Landroidx/datastore/preferences/protobuf/FieldSet;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/FieldSet;->iterator()Ljava/util/Iterator;

    .line 452
    move-result-object v3

    .line 453
    .line 454
    .line 455
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 456
    move-result v4

    .line 457
    .line 458
    if-eqz v4, :cond_11

    .line 459
    .line 460
    .line 461
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 462
    move-result-object v4

    .line 463
    .line 464
    check-cast v4, Ljava/util/Map$Entry;

    .line 465
    .line 466
    new-instance v5, Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 470
    .line 471
    const-string v6, "["

    .line 472
    .line 473
    .line 474
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 478
    move-result-object v6

    .line 479
    .line 480
    check-cast v6, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$ExtensionDescriptor;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v6}, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite$ExtensionDescriptor;->getNumber()I

    .line 484
    move-result v6

    .line 485
    .line 486
    .line 487
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    const-string v6, "]"

    .line 490
    .line 491
    .line 492
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 496
    move-result-object v5

    .line 497
    .line 498
    .line 499
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 500
    move-result-object v4

    .line 501
    .line 502
    .line 503
    invoke-static {v1, v2, v5, v4}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->printField(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 504
    goto :goto_6

    .line 505
    .line 506
    :cond_11
    check-cast v0, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;

    .line 507
    .line 508
    iget-object v0, v0, Landroidx/datastore/preferences/protobuf/GeneratedMessageLite;->unknownFields:Landroidx/datastore/preferences/protobuf/UnknownFieldSetLite;

    .line 509
    .line 510
    if-eqz v0, :cond_12

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/UnknownFieldSetLite;->printWithIndent(Ljava/lang/StringBuilder;I)V

    .line 514
    :cond_12
    return-void
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
.end method

.method public static toString(Landroidx/datastore/preferences/protobuf/MessageLite;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "# "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    const/4 p1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/MessageLiteToString;->reflectivePrintWithIndent(Landroidx/datastore/preferences/protobuf/MessageLite;Ljava/lang/StringBuilder;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object p0

    .line 22
    return-object p0
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
.end method
