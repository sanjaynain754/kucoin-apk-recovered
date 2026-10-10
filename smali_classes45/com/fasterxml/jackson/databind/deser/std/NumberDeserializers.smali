.class public Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers;
.super Ljava/lang/Object;
.source "NumberDeserializers.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$BigDecimalDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$BigIntegerDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$NumberDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$DoubleDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$FloatDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$LongDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$IntegerDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$CharacterDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$ShortDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$ByteDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$BooleanDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$PrimitiveOrWrapperDeserializer;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashSet;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers;->a:Ljava/util/HashSet;

    .line 8
    .line 9
    const-class v10, Ljava/math/BigDecimal;

    .line 10
    .line 11
    const-class v11, Ljava/math/BigInteger;

    .line 12
    .line 13
    const-class v1, Ljava/lang/Boolean;

    .line 14
    .line 15
    const-class v2, Ljava/lang/Byte;

    .line 16
    .line 17
    const-class v3, Ljava/lang/Short;

    .line 18
    .line 19
    const-class v4, Ljava/lang/Character;

    .line 20
    .line 21
    const-class v5, Ljava/lang/Integer;

    .line 22
    .line 23
    const-class v6, Ljava/lang/Long;

    .line 24
    .line 25
    const-class v7, Ljava/lang/Float;

    .line 26
    .line 27
    const-class v8, Ljava/lang/Double;

    .line 28
    .line 29
    const-class v9, Ljava/lang/Number;

    .line 30
    .line 31
    .line 32
    filled-new-array/range {v1 .. v11}, [Ljava/lang/Class;

    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    .line 36
    :goto_0
    const/16 v2, 0xb

    .line 37
    .line 38
    if-ge v1, v2, :cond_0

    .line 39
    .line 40
    aget-object v2, v0, v1

    .line 41
    .line 42
    sget-object v3, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers;->a:Ljava/util/HashSet;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-void
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

.method public static a(Ljava/lang/Class;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Lcom/fasterxml/jackson/databind/e<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    if-ne p0, p1, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$IntegerDeserializer;->primitiveInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$IntegerDeserializer;

    .line 13
    return-object p0

    .line 14
    .line 15
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    if-ne p0, p1, :cond_1

    .line 18
    .line 19
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$BooleanDeserializer;->primitiveInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$BooleanDeserializer;

    .line 20
    return-object p0

    .line 21
    .line 22
    :cond_1
    sget-object p1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne p0, p1, :cond_2

    .line 25
    .line 26
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$LongDeserializer;->primitiveInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$LongDeserializer;

    .line 27
    return-object p0

    .line 28
    .line 29
    :cond_2
    sget-object p1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    if-ne p0, p1, :cond_3

    .line 32
    .line 33
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$DoubleDeserializer;->primitiveInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$DoubleDeserializer;

    .line 34
    return-object p0

    .line 35
    .line 36
    :cond_3
    sget-object p1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    if-ne p0, p1, :cond_4

    .line 39
    .line 40
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$CharacterDeserializer;->primitiveInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$CharacterDeserializer;

    .line 41
    return-object p0

    .line 42
    .line 43
    :cond_4
    sget-object p1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    if-ne p0, p1, :cond_5

    .line 46
    .line 47
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$ByteDeserializer;->primitiveInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$ByteDeserializer;

    .line 48
    return-object p0

    .line 49
    .line 50
    :cond_5
    sget-object p1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    if-ne p0, p1, :cond_6

    .line 53
    .line 54
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$ShortDeserializer;->primitiveInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$ShortDeserializer;

    .line 55
    return-object p0

    .line 56
    .line 57
    :cond_6
    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    if-ne p0, p1, :cond_7

    .line 60
    .line 61
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$FloatDeserializer;->primitiveInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$FloatDeserializer;

    .line 62
    return-object p0

    .line 63
    .line 64
    :cond_7
    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    if-ne p0, p1, :cond_13

    .line 67
    .line 68
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NullifyingDeserializer;->instance:Lcom/fasterxml/jackson/databind/deser/std/NullifyingDeserializer;

    .line 69
    return-object p0

    .line 70
    .line 71
    :cond_8
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers;->a:Ljava/util/HashSet;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 75
    move-result p1

    .line 76
    .line 77
    if-eqz p1, :cond_14

    .line 78
    .line 79
    const-class p1, Ljava/lang/Integer;

    .line 80
    .line 81
    if-ne p0, p1, :cond_9

    .line 82
    .line 83
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$IntegerDeserializer;->wrapperInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$IntegerDeserializer;

    .line 84
    return-object p0

    .line 85
    .line 86
    :cond_9
    const-class p1, Ljava/lang/Boolean;

    .line 87
    .line 88
    if-ne p0, p1, :cond_a

    .line 89
    .line 90
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$BooleanDeserializer;->wrapperInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$BooleanDeserializer;

    .line 91
    return-object p0

    .line 92
    .line 93
    :cond_a
    const-class p1, Ljava/lang/Long;

    .line 94
    .line 95
    if-ne p0, p1, :cond_b

    .line 96
    .line 97
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$LongDeserializer;->wrapperInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$LongDeserializer;

    .line 98
    return-object p0

    .line 99
    .line 100
    :cond_b
    const-class p1, Ljava/lang/Double;

    .line 101
    .line 102
    if-ne p0, p1, :cond_c

    .line 103
    .line 104
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$DoubleDeserializer;->wrapperInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$DoubleDeserializer;

    .line 105
    return-object p0

    .line 106
    .line 107
    :cond_c
    const-class p1, Ljava/lang/Character;

    .line 108
    .line 109
    if-ne p0, p1, :cond_d

    .line 110
    .line 111
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$CharacterDeserializer;->wrapperInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$CharacterDeserializer;

    .line 112
    return-object p0

    .line 113
    .line 114
    :cond_d
    const-class p1, Ljava/lang/Byte;

    .line 115
    .line 116
    if-ne p0, p1, :cond_e

    .line 117
    .line 118
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$ByteDeserializer;->wrapperInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$ByteDeserializer;

    .line 119
    return-object p0

    .line 120
    .line 121
    :cond_e
    const-class p1, Ljava/lang/Short;

    .line 122
    .line 123
    if-ne p0, p1, :cond_f

    .line 124
    .line 125
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$ShortDeserializer;->wrapperInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$ShortDeserializer;

    .line 126
    return-object p0

    .line 127
    .line 128
    :cond_f
    const-class p1, Ljava/lang/Float;

    .line 129
    .line 130
    if-ne p0, p1, :cond_10

    .line 131
    .line 132
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$FloatDeserializer;->wrapperInstance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$FloatDeserializer;

    .line 133
    return-object p0

    .line 134
    .line 135
    :cond_10
    const-class p1, Ljava/lang/Number;

    .line 136
    .line 137
    if-ne p0, p1, :cond_11

    .line 138
    .line 139
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$NumberDeserializer;->instance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$NumberDeserializer;

    .line 140
    return-object p0

    .line 141
    .line 142
    :cond_11
    const-class p1, Ljava/math/BigDecimal;

    .line 143
    .line 144
    if-ne p0, p1, :cond_12

    .line 145
    .line 146
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$BigDecimalDeserializer;->instance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$BigDecimalDeserializer;

    .line 147
    return-object p0

    .line 148
    .line 149
    :cond_12
    const-class p1, Ljava/math/BigInteger;

    .line 150
    .line 151
    if-ne p0, p1, :cond_13

    .line 152
    .line 153
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$BigIntegerDeserializer;->instance:Lcom/fasterxml/jackson/databind/deser/std/NumberDeserializers$BigIntegerDeserializer;

    .line 154
    return-object p0

    .line 155
    .line 156
    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    const-string v1, "Internal error: can\'t find deserializer for "

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 170
    move-result-object p0

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    move-result-object p0

    .line 178
    .line 179
    .line 180
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 181
    throw p1

    .line 182
    :cond_14
    const/4 p0, 0x0

    .line 183
    return-object p0
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
