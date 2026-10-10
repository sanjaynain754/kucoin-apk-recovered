.class public Lcom/fasterxml/jackson/databind/ser/a;
.super Ljava/lang/Object;
.source "AnyGetterWriter.java"


# instance fields
.field public final a:Lcom/fasterxml/jackson/databind/BeanProperty;

.field public final b:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

.field public c:Lcom/fasterxml/jackson/databind/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/BeanProperty;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Lcom/fasterxml/jackson/databind/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/BeanProperty;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;",
            "Lcom/fasterxml/jackson/databind/h<",
            "*>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/ser/a;->b:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/a;->a:Lcom/fasterxml/jackson/databind/BeanProperty;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/ser/a;->c:Lcom/fasterxml/jackson/databind/h;

    .line 10
    .line 11
    instance-of p1, p3, Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    check-cast p3, Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/ser/a;->d:Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    .line 18
    :cond_0
    return-void
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


# virtual methods
.method public a(Lcom/fasterxml/jackson/databind/SerializationConfig;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/a;->b:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/databind/MapperFeature;->OVERRIDE_PUBLIC_ACCESS_MODIFIERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    .line 8
    move-result p1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->fixAccess(Z)V

    .line 12
    return-void
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

.method public b(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/m;Lcom/fasterxml/jackson/databind/ser/g;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/a;->b:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    instance-of v1, v0, Ljava/util/Map;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/a;->a:Lcom/fasterxml/jackson/databind/BeanProperty;

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Lcom/fasterxml/jackson/databind/BeanProperty;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/a;->b:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/introspect/a;->getName()Ljava/lang/String;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    const-string v3, "Value returned by \'any-getter\' (%s()) not java.util.Map but %s"

    .line 40
    .line 41
    .line 42
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3, v1, v2}, Lcom/fasterxml/jackson/databind/m;->reportBadDefinition(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    :cond_1
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/ser/a;->d:Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    .line 49
    .line 50
    if-eqz v3, :cond_2

    .line 51
    move-object v7, v0

    .line 52
    .line 53
    check-cast v7, Ljava/util/Map;

    .line 54
    const/4 v9, 0x0

    .line 55
    move-object v6, p1

    .line 56
    move-object v5, p2

    .line 57
    move-object v4, p3

    .line 58
    move-object v8, p4

    .line 59
    .line 60
    .line 61
    invoke-virtual/range {v3 .. v9}, Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;->serializeFilteredAnyProperties(Lcom/fasterxml/jackson/databind/m;Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/lang/Object;Ljava/util/Map;Lcom/fasterxml/jackson/databind/ser/g;Ljava/lang/Object;)V

    .line 62
    return-void

    .line 63
    :cond_2
    move-object v5, p2

    .line 64
    move-object v4, p3

    .line 65
    .line 66
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/ser/a;->c:Lcom/fasterxml/jackson/databind/h;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0, v5, v4}, Lcom/fasterxml/jackson/databind/h;->serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/m;)V

    .line 70
    return-void
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
.end method

.method public c(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/m;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/a;->b:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/a;->a:Lcom/fasterxml/jackson/databind/BeanProperty;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Lcom/fasterxml/jackson/databind/BeanProperty;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/a;->b:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/introspect/a;->getName()Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    const-string v2, "Value returned by \'any-getter\' %s() not java.util.Map but %s"

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3, v0, v1}, Lcom/fasterxml/jackson/databind/m;->reportBadDefinition(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/a;->d:Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    check-cast p1, Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;->serializeWithoutTypeInfo(Ljava/util/Map;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/m;)V

    .line 56
    return-void

    .line 57
    .line 58
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/a;->c:Lcom/fasterxml/jackson/databind/h;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/h;->serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/m;)V

    .line 62
    return-void
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

.method public d(Lcom/fasterxml/jackson/databind/m;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/a;->c:Lcom/fasterxml/jackson/databind/h;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/fasterxml/jackson/databind/ser/d;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/a;->a:Lcom/fasterxml/jackson/databind/BeanProperty;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/databind/m;->handlePrimaryContextualization(Lcom/fasterxml/jackson/databind/h;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/h;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/a;->c:Lcom/fasterxml/jackson/databind/h;

    .line 15
    .line 16
    instance-of v0, p1, Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/a;->d:Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    .line 23
    :cond_0
    return-void
.end method
