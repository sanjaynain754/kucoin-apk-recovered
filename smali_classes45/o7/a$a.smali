.class public Lo7/a$a;
.super Ljava/lang/Object;
.source "JDK14Util.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/fasterxml/jackson/databind/b;

.field public final b:Lcom/fasterxml/jackson/databind/DeserializationConfig;

.field public final c:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

.field public final f:[Lo7/a$b;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/b;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p2, p0, Lo7/a$a;->a:Lcom/fasterxml/jackson/databind/b;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lo7/a$a;->c:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getConfig()Lcom/fasterxml/jackson/databind/DeserializationConfig;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    iput-object p1, p0, Lo7/a$a;->b:Lcom/fasterxml/jackson/databind/DeserializationConfig;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lo7/a$c;->c()Lo7/a$c;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/b;->r()Ljava/lang/Class;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lo7/a$c;->b(Ljava/lang/Class;)[Lo7/a$b;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    iput-object p1, p0, Lo7/a$a;->f:[Lo7/a$b;

    .line 32
    array-length p1, p1

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/b;->d()Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 42
    move-result-object p2

    .line 43
    .line 44
    iput-object p2, p0, Lo7/a$a;->d:Ljava/util/List;

    .line 45
    goto :goto_2

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/b;->u()Ljava/util/List;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    iput-object p2, p0, Lo7/a$a;->d:Ljava/util/List;

    .line 52
    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    move-result-object p2

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    move-result v0

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    .line 64
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    check-cast v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;->getParameterCount()I

    .line 71
    move-result v1

    .line 72
    .line 73
    if-eq v1, p1, :cond_1

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    const/4 v1, 0x0

    .line 76
    .line 77
    :goto_1
    if-ge v1, p1, :cond_3

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;->getRawParameterType(I)Ljava/lang/Class;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    iget-object v3, p0, Lo7/a$a;->f:[Lo7/a$b;

    .line 84
    .line 85
    aget-object v3, v3, v1

    .line 86
    .line 87
    iget-object v3, v3, Lo7/a$b;->a:Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    move-result v2

    .line 92
    .line 93
    if-nez v2, :cond_2

    .line 94
    goto :goto_0

    .line 95
    .line 96
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    move-object p1, v0

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    const/4 p1, 0x0

    .line 101
    .line 102
    :goto_2
    if-eqz p1, :cond_5

    .line 103
    .line 104
    iput-object p1, p0, Lo7/a$a;->e:Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    .line 105
    return-void

    .line 106
    .line 107
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 108
    .line 109
    new-instance p2, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    const-string v0, "Failed to find the canonical Record constructor of type "

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    iget-object v0, p0, Lo7/a$a;->a:Lcom/fasterxml/jackson/databind/b;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/b;->A()Lcom/fasterxml/jackson/databind/JavaType;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/util/g;->G(Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/String;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    move-result-object p2

    .line 135
    .line 136
    .line 137
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 138
    throw p1
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


# virtual methods
.method public a(Ljava/util/List;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo7/a$a;->d:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    .line 19
    .line 20
    iget-object v2, p0, Lo7/a$a;->c:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 21
    .line 22
    iget-object v3, p0, Lo7/a$a;->b:Lcom/fasterxml/jackson/databind/DeserializationConfig;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v3, v1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findCreatorAnnotation(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/a;)Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    sget-object v3, Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DISABLED:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    .line 31
    .line 32
    if-ne v3, v2, :cond_1

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    sget-object v3, Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DELEGATING:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    .line 36
    const/4 v4, 0x0

    .line 37
    .line 38
    if-ne v3, v2, :cond_2

    .line 39
    return-object v4

    .line 40
    .line 41
    :cond_2
    iget-object v2, p0, Lo7/a$a;->e:Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    .line 42
    .line 43
    if-eq v1, v2, :cond_0

    .line 44
    return-object v4

    .line 45
    .line 46
    :cond_3
    iget-object v0, p0, Lo7/a$a;->f:[Lo7/a$b;

    .line 47
    array-length v1, v0

    .line 48
    const/4 v2, 0x0

    .line 49
    .line 50
    :goto_1
    if-ge v2, v1, :cond_4

    .line 51
    .line 52
    aget-object v3, v0, v2

    .line 53
    .line 54
    iget-object v3, v3, Lo7/a$b;->b:Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    add-int/lit8 v2, v2, 0x1

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_4
    iget-object p1, p0, Lo7/a$a;->e:Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    .line 63
    return-object p1
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
