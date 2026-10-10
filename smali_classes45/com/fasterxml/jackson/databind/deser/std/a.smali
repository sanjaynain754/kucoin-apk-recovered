.class public Lcom/fasterxml/jackson/databind/deser/std/a;
.super Ljava/lang/Object;
.source "JdkDeserializers.java"


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
    .locals 8

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashSet;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/fasterxml/jackson/databind/deser/std/a;->a:Ljava/util/HashSet;

    .line 8
    .line 9
    const-class v6, Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const-class v7, Ljava/lang/Void;

    .line 12
    .line 13
    const-class v1, Ljava/util/UUID;

    .line 14
    .line 15
    const-class v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const-class v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    const-class v4, Ljava/util/concurrent/atomic/AtomicLong;

    .line 20
    .line 21
    const-class v5, Ljava/lang/StackTraceElement;

    .line 22
    .line 23
    .line 24
    filled-new-array/range {v1 .. v7}, [Ljava/lang/Class;

    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    move v2, v1

    .line 28
    :goto_0
    const/4 v3, 0x7

    .line 29
    .line 30
    if-ge v2, v3, :cond_0

    .line 31
    .line 32
    aget-object v3, v0, v2

    .line 33
    .line 34
    sget-object v4, Lcom/fasterxml/jackson/databind/deser/std/a;->a:Ljava/util/HashSet;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;->types()[Ljava/lang/Class;

    .line 48
    move-result-object v0

    .line 49
    array-length v2, v0

    .line 50
    .line 51
    :goto_1
    if-ge v1, v2, :cond_1

    .line 52
    .line 53
    aget-object v3, v0, v1

    .line 54
    .line 55
    sget-object v4, Lcom/fasterxml/jackson/databind/deser/std/a;->a:Ljava/util/HashSet;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    move-result-object v3

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x1

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    return-void
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
    .locals 1
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
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/std/a;->a:Ljava/util/HashSet;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_7

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;->findDeserializer(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_0
    const-class p1, Ljava/util/UUID;

    .line 18
    .line 19
    if-ne p0, p1, :cond_1

    .line 20
    .line 21
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/UUIDDeserializer;

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/UUIDDeserializer;-><init>()V

    .line 25
    return-object p0

    .line 26
    .line 27
    :cond_1
    const-class p1, Ljava/lang/StackTraceElement;

    .line 28
    .line 29
    if-ne p0, p1, :cond_2

    .line 30
    .line 31
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;-><init>()V

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_2
    const-class p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 38
    .line 39
    if-ne p0, p1, :cond_3

    .line 40
    .line 41
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/AtomicBooleanDeserializer;

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/AtomicBooleanDeserializer;-><init>()V

    .line 45
    return-object p0

    .line 46
    .line 47
    :cond_3
    const-class p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 48
    .line 49
    if-ne p0, p1, :cond_4

    .line 50
    .line 51
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/AtomicIntegerDeserializer;

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/AtomicIntegerDeserializer;-><init>()V

    .line 55
    return-object p0

    .line 56
    .line 57
    :cond_4
    const-class p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 58
    .line 59
    if-ne p0, p1, :cond_5

    .line 60
    .line 61
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/AtomicLongDeserializer;

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/AtomicLongDeserializer;-><init>()V

    .line 65
    return-object p0

    .line 66
    .line 67
    :cond_5
    const-class p1, Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    if-ne p0, p1, :cond_6

    .line 70
    .line 71
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/ByteBufferDeserializer;

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/ByteBufferDeserializer;-><init>()V

    .line 75
    return-object p0

    .line 76
    .line 77
    :cond_6
    const-class p1, Ljava/lang/Void;

    .line 78
    .line 79
    if-ne p0, p1, :cond_7

    .line 80
    .line 81
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NullifyingDeserializer;->instance:Lcom/fasterxml/jackson/databind/deser/std/NullifyingDeserializer;

    .line 82
    return-object p0

    .line 83
    :cond_7
    const/4 p0, 0x0

    .line 84
    return-object p0
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

.method public static b(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/std/a;->a:Ljava/util/HashSet;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 10
    move-result p0

    .line 11
    return p0
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
