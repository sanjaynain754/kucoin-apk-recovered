.class public final Lshark/internal/PathFinder;
.super Ljava/lang/Object;
.source "PathFinder.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/internal/PathFinder$b;,
        Lshark/internal/PathFinder$d;,
        Lshark/internal/PathFinder$c;,
        Lshark/internal/PathFinder$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001:\u00047\u0016B\"B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u0018*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0010*\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J!\u0010\'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$0\u0006H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J#\u0010+\u001a\u00020!*\u00020\u001b2\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008+\u0010,J#\u0010/\u001a\u00020!*\u00020\u001b2\u0006\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008/\u00100J\'\u00104\u001a\u0008\u0012\u0004\u0012\u00020302*\u00020-2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0006H\u0002\u00a2\u0006\u0004\u00084\u00105J!\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0006*\u00020\u00132\u0006\u00106\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u00087\u00108J\u001b\u0010;\u001a\u00020\u0015*\u00020\u00022\u0006\u0010:\u001a\u000209H\u0002\u00a2\u0006\u0004\u0008;\u0010<J#\u0010?\u001a\u00020!*\u00020\u001b2\u0006\u0010>\u001a\u00020=2\u0006\u0010*\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008?\u0010@J\u001b\u0010B\u001a\u00020!*\u00020\u001b2\u0006\u0010A\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008B\u0010CR,\u0010G\u001a\u001a\u0012\u0004\u0012\u00020E\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00070D0D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u0010FR,\u0010H\u001a\u001a\u0012\u0004\u0012\u00020E\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00070D0D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010FR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00070D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010FR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00070D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010KR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010L\u00a8\u0006M"
    }
    d2 = {
        "Lshark/internal/PathFinder;",
        "",
        "Lshark/i;",
        "graph",
        "Lshark/OnAnalysisProgressListener;",
        "listener",
        "",
        "Lshark/u;",
        "referenceMatchers",
        "<init>",
        "(Lshark/i;Lshark/OnAnalysisProgressListener;Ljava/util/List;)V",
        "",
        "",
        "leakingObjectIds",
        "",
        "computeRetainedHeapSize",
        "Lshark/internal/PathFinder$b;",
        "e",
        "(Ljava/util/Set;Z)Lshark/internal/PathFinder$b;",
        "Lshark/HeapObject$HeapClass;",
        "objectClass",
        "",
        "b",
        "(Lshark/HeapObject$HeapClass;Lshark/i;)I",
        "Lshark/internal/hppc/e;",
        "k",
        "(Ljava/util/Set;)Lshark/internal/hppc/e;",
        "Lshark/internal/PathFinder$c;",
        "f",
        "(Lshark/internal/PathFinder$c;)Lshark/internal/PathFinder$b;",
        "Lshark/internal/j;",
        "h",
        "(Lshark/internal/PathFinder$c;)Lshark/internal/j;",
        "",
        "d",
        "(Lshark/internal/PathFinder$c;)V",
        "Lkotlin/Pair;",
        "Lshark/HeapObject;",
        "Lshark/d;",
        "j",
        "()Ljava/util/List;",
        "heapClass",
        "parent",
        "l",
        "(Lshark/internal/PathFinder$c;Lshark/HeapObject$HeapClass;Lshark/internal/j;)V",
        "Lshark/HeapObject$HeapInstance;",
        "instance",
        "m",
        "(Lshark/internal/PathFinder$c;Lshark/HeapObject$HeapInstance;Lshark/internal/j;)V",
        "classHierarchy",
        "",
        "Lshark/internal/PathFinder$a;",
        "i",
        "(Lshark/HeapObject$HeapInstance;Ljava/util/List;)Ljava/util/List;",
        "javaLangObjectId",
        "a",
        "(Lshark/HeapObject$HeapClass;J)Ljava/util/List;",
        "Lshark/l$b$c$a$a;",
        "field",
        "g",
        "(Lshark/i;Lshark/l$b$c$a$a;)I",
        "Lshark/HeapObject$a;",
        "objectArray",
        "n",
        "(Lshark/internal/PathFinder$c;Lshark/HeapObject$a;Lshark/internal/j;)V",
        "node",
        "c",
        "(Lshark/internal/PathFinder$c;Lshark/internal/j;)V",
        "",
        "",
        "Ljava/util/Map;",
        "fieldNameByClassName",
        "staticFieldNameByClassName",
        "threadNameReferenceMatchers",
        "jniGlobalReferenceMatchers",
        "Lshark/i;",
        "Lshark/OnAnalysisProgressListener;",
        "shark"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lshark/u;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lshark/u;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lshark/u;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lshark/u;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lshark/i;

.field public final f:Lshark/OnAnalysisProgressListener;


# direct methods
.method public constructor <init>(Lshark/i;Lshark/OnAnalysisProgressListener;Ljava/util/List;)V
    .locals 6
    .param p1    # Lshark/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lshark/OnAnalysisProgressListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lshark/i;",
            "Lshark/OnAnalysisProgressListener;",
            "Ljava/util/List<",
            "+",
            "Lshark/u;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lshark/internal/PathFinder;->e:Lshark/i;

    .line 6
    .line 7
    iput-object p2, p0, Lshark/internal/PathFinder;->f:Lshark/OnAnalysisProgressListener;

    .line 8
    .line 9
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    .line 17
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 28
    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    move-result-object p3

    .line 37
    .line 38
    .line 39
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    move-result v3

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    move-result-object v3

    .line 47
    move-object v4, v3

    .line 48
    .line 49
    check-cast v4, Lshark/u;

    .line 50
    .line 51
    instance-of v5, v4, Lshark/p;

    .line 52
    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    check-cast v4, Lshark/p;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Lshark/p;->c()Lkotlin/jvm/functions/Function1;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    iget-object v5, p0, Lshark/internal/PathFinder;->e:Lshark/i;

    .line 62
    .line 63
    .line 64
    invoke-interface {v4, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    move-result-object v4

    .line 66
    .line 67
    check-cast v4, Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    move-result v4

    .line 72
    .line 73
    if-eqz v4, :cond_0

    .line 74
    .line 75
    .line 76
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 77
    goto :goto_0

    .line 78
    .line 79
    .line 80
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    move-result-object p3

    .line 82
    .line 83
    .line 84
    :cond_2
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    move-result v2

    .line 86
    .line 87
    if-eqz v2, :cond_8

    .line 88
    .line 89
    .line 90
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    move-result-object v2

    .line 92
    .line 93
    check-cast v2, Lshark/u;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Lshark/u;->a()Lshark/ReferencePattern;

    .line 97
    move-result-object v3

    .line 98
    .line 99
    instance-of v4, v3, Lshark/ReferencePattern$JavaLocalPattern;

    .line 100
    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    check-cast v3, Lshark/ReferencePattern$JavaLocalPattern;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Lshark/ReferencePattern$JavaLocalPattern;->getThreadName()Ljava/lang/String;

    .line 107
    move-result-object v3

    .line 108
    .line 109
    .line 110
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    goto :goto_1

    .line 112
    .line 113
    :cond_3
    instance-of v4, v3, Lshark/ReferencePattern$StaticFieldPattern;

    .line 114
    .line 115
    if-eqz v4, :cond_5

    .line 116
    .line 117
    check-cast v3, Lshark/ReferencePattern$StaticFieldPattern;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Lshark/ReferencePattern$StaticFieldPattern;->getClassName()Ljava/lang/String;

    .line 121
    move-result-object v4

    .line 122
    .line 123
    .line 124
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    move-result-object v4

    .line 126
    .line 127
    check-cast v4, Ljava/util/Map;

    .line 128
    .line 129
    if-eqz v4, :cond_4

    .line 130
    goto :goto_2

    .line 131
    .line 132
    :cond_4
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 133
    .line 134
    .line 135
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Lshark/ReferencePattern$StaticFieldPattern;->getClassName()Ljava/lang/String;

    .line 139
    move-result-object v5

    .line 140
    .line 141
    .line 142
    invoke-interface {p2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :goto_2
    invoke-virtual {v3}, Lshark/ReferencePattern$StaticFieldPattern;->getFieldName()Ljava/lang/String;

    .line 146
    move-result-object v3

    .line 147
    .line 148
    .line 149
    invoke-interface {v4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    goto :goto_1

    .line 151
    .line 152
    :cond_5
    instance-of v4, v3, Lshark/ReferencePattern$InstanceFieldPattern;

    .line 153
    .line 154
    if-eqz v4, :cond_7

    .line 155
    .line 156
    check-cast v3, Lshark/ReferencePattern$InstanceFieldPattern;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Lshark/ReferencePattern$InstanceFieldPattern;->getClassName()Ljava/lang/String;

    .line 160
    move-result-object v4

    .line 161
    .line 162
    .line 163
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    move-result-object v4

    .line 165
    .line 166
    check-cast v4, Ljava/util/Map;

    .line 167
    .line 168
    if-eqz v4, :cond_6

    .line 169
    goto :goto_3

    .line 170
    .line 171
    :cond_6
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 172
    .line 173
    .line 174
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3}, Lshark/ReferencePattern$InstanceFieldPattern;->getClassName()Ljava/lang/String;

    .line 178
    move-result-object v5

    .line 179
    .line 180
    .line 181
    invoke-interface {p1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    :goto_3
    invoke-virtual {v3}, Lshark/ReferencePattern$InstanceFieldPattern;->getFieldName()Ljava/lang/String;

    .line 185
    move-result-object v3

    .line 186
    .line 187
    .line 188
    invoke-interface {v4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    goto :goto_1

    .line 190
    .line 191
    :cond_7
    instance-of v4, v3, Lshark/ReferencePattern$NativeGlobalVariablePattern;

    .line 192
    .line 193
    if-eqz v4, :cond_2

    .line 194
    .line 195
    check-cast v3, Lshark/ReferencePattern$NativeGlobalVariablePattern;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Lshark/ReferencePattern$NativeGlobalVariablePattern;->getClassName()Ljava/lang/String;

    .line 199
    move-result-object v3

    .line 200
    .line 201
    .line 202
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    goto :goto_1

    .line 204
    .line 205
    :cond_8
    iput-object p1, p0, Lshark/internal/PathFinder;->a:Ljava/util/Map;

    .line 206
    .line 207
    iput-object p2, p0, Lshark/internal/PathFinder;->b:Ljava/util/Map;

    .line 208
    .line 209
    iput-object v0, p0, Lshark/internal/PathFinder;->c:Ljava/util/Map;

    .line 210
    .line 211
    iput-object v1, p0, Lshark/internal/PathFinder;->d:Ljava/util/Map;

    .line 212
    return-void
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
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
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
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method


# virtual methods
.method public final a(Lshark/HeapObject$HeapClass;J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lshark/HeapObject$HeapClass;",
            "J)",
            "Ljava/util/List<",
            "Lshark/HeapObject$HeapClass;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    :goto_0
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lshark/HeapObject$HeapClass;->f()J

    .line 11
    move-result-wide v1

    .line 12
    .line 13
    cmp-long v1, v1, p2

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lshark/HeapObject$HeapClass;->q()Lshark/HeapObject$HeapClass;

    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object v0
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
.end method

.method public final b(Lshark/HeapObject$HeapClass;Lshark/i;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lshark/HeapObject$HeapClass;->t()I

    .line 7
    move-result p1

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Lshark/i;->i()I

    .line 11
    move-result p2

    .line 12
    .line 13
    sget-object v1, Lshark/PrimitiveType;->INT:Lshark/PrimitiveType;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lshark/PrimitiveType;->getByteSize()I

    .line 17
    move-result v1

    .line 18
    add-int/2addr p2, v1

    .line 19
    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    return p2

    .line 22
    :cond_0
    return v0
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
.end method

.method public final c(Lshark/internal/PathFinder$c;Lshark/internal/j;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lshark/internal/j;->b()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_3

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->k()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    instance-of v0, p2, Lshark/internal/j$b;

    .line 21
    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    instance-of v0, p2, Lshark/internal/j$c;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    move-object v0, p2

    .line 28
    .line 29
    check-cast v0, Lshark/internal/j$c;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lshark/internal/j$c;->c()Lshark/d;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    instance-of v0, v0, Lshark/d$m;

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    :cond_1
    instance-of v0, p2, Lshark/internal/j$a$b;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    move-object v0, p2

    .line 43
    .line 44
    check-cast v0, Lshark/internal/j$a$b;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lshark/internal/j$a$b;->d()Lshark/internal/j;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    instance-of v1, v1, Lshark/internal/j$c;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lshark/internal/j$a$b;->d()Lshark/internal/j;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    check-cast v0, Lshark/internal/j$c;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lshark/internal/j$c;->c()Lshark/d;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    instance-of v0, v0, Lshark/d$d;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const/4 v0, 0x0

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 71
    .line 72
    :goto_1
    instance-of v1, p2, Lshark/internal/j$c;

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-object v1, p2

    .line 77
    .line 78
    check-cast v1, Lshark/internal/j$a;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Lshark/internal/j$a;->d()Lshark/internal/j;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lshark/internal/j;->b()J

    .line 86
    move-result-wide v2

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->j()Lshark/internal/PathFinder$d;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Lshark/internal/j;->b()J

    .line 94
    move-result-wide v4

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v4, v5, v2, v3}, Lshark/internal/PathFinder$d;->a(JJ)Z

    .line 98
    move-result v1

    .line 99
    .line 100
    if-eqz v1, :cond_7

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    goto :goto_3

    .line 104
    .line 105
    .line 106
    :cond_5
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->i()Lshark/internal/hppc/e;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Lshark/internal/j;->b()J

    .line 111
    move-result-wide v3

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v3, v4}, Lshark/internal/hppc/e;->d(J)Z

    .line 115
    move-result v2

    .line 116
    .line 117
    if-eqz v2, :cond_6

    .line 118
    goto :goto_3

    .line 119
    .line 120
    .line 121
    :cond_6
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->g()Lshark/internal/hppc/e;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Lshark/internal/j;->b()J

    .line 126
    move-result-wide v3

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v3, v4}, Lshark/internal/hppc/e;->d(J)Z

    .line 130
    move-result v2

    .line 131
    .line 132
    if-nez v2, :cond_7

    .line 133
    :goto_3
    return-void

    .line 134
    .line 135
    :cond_7
    if-eqz v1, :cond_a

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->h()Ljava/util/Deque;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    .line 142
    invoke-interface {v0, p2}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->i()Lshark/internal/hppc/e;

    .line 146
    move-result-object v0

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2}, Lshark/internal/j;->b()J

    .line 150
    move-result-wide v1

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1, v2}, Lshark/internal/hppc/e;->a(J)Z

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->f()Ljava/util/Deque;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    .line 160
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    .line 164
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    move-result v1

    .line 166
    .line 167
    if-eqz v1, :cond_9

    .line 168
    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    move-result-object v1

    .line 172
    .line 173
    check-cast v1, Lshark/internal/j;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, Lshark/internal/j;->b()J

    .line 177
    move-result-wide v2

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2}, Lshark/internal/j;->b()J

    .line 181
    move-result-wide v4

    .line 182
    .line 183
    cmp-long v2, v2, v4

    .line 184
    .line 185
    if-nez v2, :cond_8

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->f()Ljava/util/Deque;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    .line 192
    invoke-interface {v0, v1}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->g()Lshark/internal/hppc/e;

    .line 196
    move-result-object p1

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2}, Lshark/internal/j;->b()J

    .line 200
    move-result-wide v0

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v0, v1}, Lshark/internal/hppc/e;->h(J)Z

    .line 204
    return-void

    .line 205
    .line 206
    :cond_9
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 207
    .line 208
    const-string p2, "Collection contains no element matching the predicate."

    .line 209
    .line 210
    .line 211
    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 212
    throw p1

    .line 213
    .line 214
    .line 215
    :cond_a
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->c()Lshark/internal/hppc/e;

    .line 216
    move-result-object v1

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2}, Lshark/internal/j;->b()J

    .line 220
    move-result-wide v2

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v2, v3}, Lshark/internal/hppc/e;->d(J)Z

    .line 224
    move-result v1

    .line 225
    .line 226
    if-nez v1, :cond_14

    .line 227
    .line 228
    iget-object v1, p0, Lshark/internal/PathFinder;->e:Lshark/i;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2}, Lshark/internal/j;->b()J

    .line 232
    move-result-wide v2

    .line 233
    .line 234
    .line 235
    invoke-interface {v1, v2, v3}, Lshark/i;->l(J)Lshark/HeapObject;

    .line 236
    move-result-object v1

    .line 237
    .line 238
    instance-of v2, v1, Lshark/HeapObject$HeapClass;

    .line 239
    .line 240
    if-eqz v2, :cond_b

    .line 241
    goto :goto_5

    .line 242
    .line 243
    :cond_b
    instance-of v2, v1, Lshark/HeapObject$HeapInstance;

    .line 244
    .line 245
    if-eqz v2, :cond_11

    .line 246
    .line 247
    check-cast v1, Lshark/HeapObject$HeapInstance;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1}, Lshark/HeapObject$HeapInstance;->s()Z

    .line 251
    move-result v2

    .line 252
    .line 253
    if-eqz v2, :cond_c

    .line 254
    return-void

    .line 255
    .line 256
    .line 257
    :cond_c
    invoke-virtual {v1}, Lshark/HeapObject$HeapInstance;->p()Ljava/lang/String;

    .line 258
    move-result-object v2

    .line 259
    .line 260
    const-string v3, "java.lang.String"

    .line 261
    .line 262
    .line 263
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    move-result v2

    .line 265
    .line 266
    if-eqz v2, :cond_d

    .line 267
    return-void

    .line 268
    .line 269
    .line 270
    :cond_d
    invoke-virtual {v1}, Lshark/HeapObject$HeapInstance;->n()Lshark/HeapObject$HeapClass;

    .line 271
    move-result-object v2

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Lshark/HeapObject$HeapClass;->n()I

    .line 275
    move-result v2

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->e()I

    .line 279
    move-result v3

    .line 280
    .line 281
    if-gt v2, v3, :cond_e

    .line 282
    return-void

    .line 283
    .line 284
    .line 285
    :cond_e
    invoke-virtual {v1}, Lshark/HeapObject$HeapInstance;->n()Lshark/HeapObject$HeapClass;

    .line 286
    move-result-object v1

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1}, Lshark/HeapObject$HeapClass;->k()Lkotlin/sequences/Sequence;

    .line 290
    move-result-object v1

    .line 291
    .line 292
    .line 293
    invoke-interface {v1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 294
    move-result-object v1

    .line 295
    .line 296
    .line 297
    :cond_f
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    move-result v2

    .line 299
    .line 300
    if-eqz v2, :cond_10

    .line 301
    .line 302
    .line 303
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    move-result-object v2

    .line 305
    .line 306
    check-cast v2, Lshark/HeapObject$HeapClass;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Lshark/HeapObject$HeapClass;->f()J

    .line 310
    move-result-wide v3

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->b()J

    .line 314
    move-result-wide v5

    .line 315
    .line 316
    cmp-long v3, v3, v5

    .line 317
    .line 318
    if-eqz v3, :cond_f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2}, Lshark/HeapObject$HeapClass;->m()Z

    .line 322
    move-result v2

    .line 323
    .line 324
    if-nez v2, :cond_14

    .line 325
    goto :goto_4

    .line 326
    :cond_10
    return-void

    .line 327
    .line 328
    :cond_11
    instance-of v2, v1, Lshark/HeapObject$a;

    .line 329
    .line 330
    if-eqz v2, :cond_12

    .line 331
    .line 332
    check-cast v1, Lshark/HeapObject$a;

    .line 333
    .line 334
    .line 335
    invoke-static {v1}, Lshark/internal/i;->a(Lshark/HeapObject$a;)Z

    .line 336
    move-result v1

    .line 337
    .line 338
    if-eqz v1, :cond_14

    .line 339
    return-void

    .line 340
    .line 341
    :cond_12
    instance-of p1, v1, Lshark/HeapObject$b;

    .line 342
    .line 343
    if-eqz p1, :cond_13

    .line 344
    return-void

    .line 345
    .line 346
    :cond_13
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 347
    .line 348
    .line 349
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 350
    throw p1

    .line 351
    .line 352
    :cond_14
    :goto_5
    if-eqz v0, :cond_15

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->f()Ljava/util/Deque;

    .line 356
    move-result-object v0

    .line 357
    .line 358
    .line 359
    invoke-interface {v0, p2}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->g()Lshark/internal/hppc/e;

    .line 363
    move-result-object p1

    .line 364
    .line 365
    .line 366
    invoke-virtual {p2}, Lshark/internal/j;->b()J

    .line 367
    move-result-wide v0

    .line 368
    .line 369
    .line 370
    invoke-virtual {p1, v0, v1}, Lshark/internal/hppc/e;->a(J)Z

    .line 371
    return-void

    .line 372
    .line 373
    .line 374
    :cond_15
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->h()Ljava/util/Deque;

    .line 375
    move-result-object v0

    .line 376
    .line 377
    .line 378
    invoke-interface {v0, p2}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->i()Lshark/internal/hppc/e;

    .line 382
    move-result-object p1

    .line 383
    .line 384
    .line 385
    invoke-virtual {p2}, Lshark/internal/j;->b()J

    .line 386
    move-result-wide v0

    .line 387
    .line 388
    .line 389
    invoke-virtual {p1, v0, v1}, Lshark/internal/hppc/e;->a(J)Z

    .line 390
    return-void
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
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
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method

.method public final d(Lshark/internal/PathFinder$c;)V
    .locals 20

    .line 1
    .line 2
    move-object/from16 v2, p0

    .line 3
    .line 4
    move-object/from16 v3, p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v2}, Lshark/internal/PathFinder;->j()Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    .line 13
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    .line 18
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    move-result-object v6

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_c

    .line 29
    .line 30
    .line 31
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    check-cast v0, Lkotlin/Pair;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    check-cast v1, Lshark/HeapObject;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 44
    move-result-object v0

    .line 45
    move-object v7, v0

    .line 46
    .line 47
    check-cast v7, Lshark/d;

    .line 48
    .line 49
    instance-of v0, v7, Lshark/d$m;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    move-object v0, v7

    .line 53
    .line 54
    check-cast v0, Lshark/d$m;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lshark/d$m;->b()I

    .line 58
    move-result v0

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lshark/HeapObject;->d()Lshark/HeapObject$HeapInstance;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    if-nez v1, :cond_0

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 72
    .line 73
    .line 74
    :cond_0
    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    .line 78
    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    new-instance v0, Lshark/internal/j$c$b;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, Lshark/d;->a()J

    .line 84
    move-result-wide v8

    .line 85
    .line 86
    .line 87
    invoke-direct {v0, v8, v9, v7}, Lshark/internal/j$c$b;-><init>(JLshark/d;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3, v0}, Lshark/internal/PathFinder;->c(Lshark/internal/PathFinder$c;Lshark/internal/j;)V

    .line 91
    goto :goto_0

    .line 92
    .line 93
    :cond_1
    instance-of v0, v7, Lshark/d$d;

    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    move-object v0, v7

    .line 97
    .line 98
    check-cast v0, Lshark/d$d;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lshark/d$d;->b()I

    .line 102
    move-result v0

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    .line 109
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    check-cast v0, Lkotlin/Pair;

    .line 113
    .line 114
    if-nez v0, :cond_2

    .line 115
    .line 116
    new-instance v0, Lshark/internal/j$c$b;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7}, Lshark/d;->a()J

    .line 120
    move-result-wide v8

    .line 121
    .line 122
    .line 123
    invoke-direct {v0, v8, v9, v7}, Lshark/internal/j$c$b;-><init>(JLshark/d;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v3, v0}, Lshark/internal/PathFinder;->c(Lshark/internal/PathFinder$c;Lshark/internal/j;)V

    .line 127
    goto :goto_0

    .line 128
    .line 129
    .line 130
    :cond_2
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 131
    move-result-object v1

    .line 132
    .line 133
    check-cast v1, Lshark/HeapObject$HeapInstance;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 137
    move-result-object v0

    .line 138
    move-object v8, v0

    .line 139
    .line 140
    check-cast v8, Lshark/d$m;

    .line 141
    .line 142
    .line 143
    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    check-cast v0, Ljava/lang/String;

    .line 147
    .line 148
    if-eqz v0, :cond_3

    .line 149
    goto :goto_1

    .line 150
    .line 151
    :cond_3
    new-instance v0, Lshark/internal/PathFinder$enqueueGcRoots$$inlined$forEach$lambda$1;

    .line 152
    .line 153
    .line 154
    invoke-direct/range {v0 .. v5}, Lshark/internal/PathFinder$enqueueGcRoots$$inlined$forEach$lambda$1;-><init>(Lshark/HeapObject$HeapInstance;Lshark/internal/PathFinder;Lshark/internal/PathFinder$c;Ljava/util/Map;Ljava/util/Map;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    check-cast v0, Ljava/lang/String;

    .line 161
    .line 162
    :goto_1
    iget-object v1, v2, Lshark/internal/PathFinder;->c:Ljava/util/Map;

    .line 163
    .line 164
    .line 165
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    move-result-object v0

    .line 167
    .line 168
    check-cast v0, Lshark/u;

    .line 169
    .line 170
    new-instance v12, Lshark/internal/j$c$b;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v8}, Lshark/d$m;->a()J

    .line 174
    move-result-wide v8

    .line 175
    .line 176
    .line 177
    invoke-direct {v12, v8, v9, v7}, Lshark/internal/j$c$b;-><init>(JLshark/d;)V

    .line 178
    .line 179
    sget-object v13, Lshark/LeakTraceReference$ReferenceType;->LOCAL:Lshark/LeakTraceReference$ReferenceType;

    .line 180
    .line 181
    instance-of v1, v0, Lshark/p;

    .line 182
    .line 183
    const-string v14, ""

    .line 184
    .line 185
    if-eqz v1, :cond_4

    .line 186
    .line 187
    new-instance v9, Lshark/internal/j$a$a;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7}, Lshark/d;->a()J

    .line 191
    move-result-wide v10

    .line 192
    move-object v15, v0

    .line 193
    .line 194
    check-cast v15, Lshark/p;

    .line 195
    .line 196
    const/16 v18, 0x20

    .line 197
    .line 198
    const/16 v19, 0x0

    .line 199
    .line 200
    const-wide/16 v16, 0x0

    .line 201
    .line 202
    .line 203
    invoke-direct/range {v9 .. v19}, Lshark/internal/j$a$a;-><init>(JLshark/internal/j;Lshark/LeakTraceReference$ReferenceType;Ljava/lang/String;Lshark/p;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 204
    goto :goto_2

    .line 205
    .line 206
    :cond_4
    new-instance v9, Lshark/internal/j$a$b;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v7}, Lshark/d;->a()J

    .line 210
    move-result-wide v10

    .line 211
    .line 212
    const/16 v17, 0x10

    .line 213
    .line 214
    const/16 v18, 0x0

    .line 215
    .line 216
    const-wide/16 v15, 0x0

    .line 217
    .line 218
    .line 219
    invoke-direct/range {v9 .. v18}, Lshark/internal/j$a$b;-><init>(JLshark/internal/j;Lshark/LeakTraceReference$ReferenceType;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 220
    .line 221
    .line 222
    :goto_2
    invoke-virtual {v2, v3, v9}, Lshark/internal/PathFinder;->c(Lshark/internal/PathFinder$c;Lshark/internal/j;)V

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :cond_5
    instance-of v0, v7, Lshark/d$e;

    .line 227
    .line 228
    if-eqz v0, :cond_b

    .line 229
    .line 230
    instance-of v0, v1, Lshark/HeapObject$HeapClass;

    .line 231
    .line 232
    if-eqz v0, :cond_6

    .line 233
    .line 234
    iget-object v0, v2, Lshark/internal/PathFinder;->d:Ljava/util/Map;

    .line 235
    .line 236
    check-cast v1, Lshark/HeapObject$HeapClass;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Lshark/HeapObject$HeapClass;->p()Ljava/lang/String;

    .line 240
    move-result-object v1

    .line 241
    .line 242
    .line 243
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    move-result-object v0

    .line 245
    .line 246
    check-cast v0, Lshark/u;

    .line 247
    goto :goto_3

    .line 248
    .line 249
    :cond_6
    instance-of v0, v1, Lshark/HeapObject$HeapInstance;

    .line 250
    .line 251
    if-eqz v0, :cond_7

    .line 252
    .line 253
    iget-object v0, v2, Lshark/internal/PathFinder;->d:Ljava/util/Map;

    .line 254
    .line 255
    check-cast v1, Lshark/HeapObject$HeapInstance;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Lshark/HeapObject$HeapInstance;->p()Ljava/lang/String;

    .line 259
    move-result-object v1

    .line 260
    .line 261
    .line 262
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    move-result-object v0

    .line 264
    .line 265
    check-cast v0, Lshark/u;

    .line 266
    goto :goto_3

    .line 267
    .line 268
    :cond_7
    instance-of v0, v1, Lshark/HeapObject$a;

    .line 269
    .line 270
    if-eqz v0, :cond_8

    .line 271
    .line 272
    iget-object v0, v2, Lshark/internal/PathFinder;->d:Ljava/util/Map;

    .line 273
    .line 274
    check-cast v1, Lshark/HeapObject$a;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1}, Lshark/HeapObject$a;->i()Ljava/lang/String;

    .line 278
    move-result-object v1

    .line 279
    .line 280
    .line 281
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    move-result-object v0

    .line 283
    .line 284
    check-cast v0, Lshark/u;

    .line 285
    goto :goto_3

    .line 286
    .line 287
    :cond_8
    instance-of v0, v1, Lshark/HeapObject$b;

    .line 288
    .line 289
    if-eqz v0, :cond_a

    .line 290
    .line 291
    iget-object v0, v2, Lshark/internal/PathFinder;->d:Ljava/util/Map;

    .line 292
    .line 293
    check-cast v1, Lshark/HeapObject$b;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1}, Lshark/HeapObject$b;->i()Ljava/lang/String;

    .line 297
    move-result-object v1

    .line 298
    .line 299
    .line 300
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    move-result-object v0

    .line 302
    .line 303
    check-cast v0, Lshark/u;

    .line 304
    .line 305
    :goto_3
    instance-of v1, v0, Lshark/p;

    .line 306
    .line 307
    if-eqz v1, :cond_9

    .line 308
    .line 309
    new-instance v1, Lshark/internal/j$c$a;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v7}, Lshark/d;->a()J

    .line 313
    move-result-wide v8

    .line 314
    .line 315
    check-cast v0, Lshark/p;

    .line 316
    .line 317
    .line 318
    invoke-direct {v1, v8, v9, v7, v0}, Lshark/internal/j$c$a;-><init>(JLshark/d;Lshark/p;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v3, v1}, Lshark/internal/PathFinder;->c(Lshark/internal/PathFinder$c;Lshark/internal/j;)V

    .line 322
    .line 323
    goto/16 :goto_0

    .line 324
    .line 325
    :cond_9
    new-instance v0, Lshark/internal/j$c$b;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v7}, Lshark/d;->a()J

    .line 329
    move-result-wide v8

    .line 330
    .line 331
    .line 332
    invoke-direct {v0, v8, v9, v7}, Lshark/internal/j$c$b;-><init>(JLshark/d;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v3, v0}, Lshark/internal/PathFinder;->c(Lshark/internal/PathFinder$c;Lshark/internal/j;)V

    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 340
    .line 341
    .line 342
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 343
    throw v0

    .line 344
    .line 345
    :cond_b
    new-instance v0, Lshark/internal/j$c$b;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v7}, Lshark/d;->a()J

    .line 349
    move-result-wide v8

    .line 350
    .line 351
    .line 352
    invoke-direct {v0, v8, v9, v7}, Lshark/internal/j$c$b;-><init>(JLshark/d;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v3, v0}, Lshark/internal/PathFinder;->c(Lshark/internal/PathFinder$c;Lshark/internal/j;)V

    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    :cond_c
    return-void
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
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
.end method

.method public final e(Ljava/util/Set;Z)Lshark/internal/PathFinder$b;
    .locals 9
    .param p1    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;Z)",
            "Lshark/internal/PathFinder$b;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/PathFinder;->f:Lshark/OnAnalysisProgressListener;

    .line 3
    .line 4
    sget-object v1, Lshark/OnAnalysisProgressListener$Step;->FINDING_PATHS_TO_RETAINED_OBJECTS:Lshark/OnAnalysisProgressListener$Step;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1}, Lshark/OnAnalysisProgressListener;->onAnalysisProgress(Lshark/OnAnalysisProgressListener$Step;)V

    .line 8
    .line 9
    iget-object v0, p0, Lshark/internal/PathFinder;->e:Lshark/i;

    .line 10
    .line 11
    const-string v1, "java.lang.Object"

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Lshark/i;->b(Ljava/lang/String;)Lshark/HeapObject$HeapClass;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v1, p0, Lshark/internal/PathFinder;->e:Lshark/i;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Lshark/internal/PathFinder;->b(Lshark/HeapObject$HeapClass;Lshark/i;)I

    .line 21
    move-result v4

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lshark/HeapObject$HeapClass;->f()J

    .line 27
    move-result-wide v0

    .line 28
    :goto_0
    move-wide v6, v0

    .line 29
    goto :goto_1

    .line 30
    .line 31
    :cond_0
    const-wide/16 v0, -0x1

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :goto_1
    iget-object v0, p0, Lshark/internal/PathFinder;->e:Lshark/i;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Lshark/i;->g()I

    .line 38
    move-result v0

    .line 39
    .line 40
    div-int/lit8 v0, v0, 0x2

    .line 41
    const/4 v1, 0x4

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 45
    move-result v8

    .line 46
    .line 47
    new-instance v2, Lshark/internal/PathFinder$c;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lshark/internal/PathFinder;->k(Ljava/util/Set;)Lshark/internal/hppc/e;

    .line 51
    move-result-object v3

    .line 52
    move v5, p2

    .line 53
    .line 54
    .line 55
    invoke-direct/range {v2 .. v8}, Lshark/internal/PathFinder$c;-><init>(Lshark/internal/hppc/e;IZJI)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v2}, Lshark/internal/PathFinder;->f(Lshark/internal/PathFinder$c;)Lshark/internal/PathFinder$b;

    .line 59
    move-result-object p1

    .line 60
    return-object p1
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
.end method

.method public final f(Lshark/internal/PathFinder$c;)Lshark/internal/PathFinder$b;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lshark/internal/PathFinder;->d(Lshark/internal/PathFinder$c;)V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->d()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lshark/internal/PathFinder;->h(Lshark/internal/PathFinder$c;)Lshark/internal/j;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->c()Lshark/internal/hppc/e;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lshark/internal/j;->b()J

    .line 26
    move-result-wide v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3, v4}, Lshark/internal/hppc/e;->d(J)Z

    .line 30
    move-result v2

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 39
    move-result v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->c()Lshark/internal/hppc/e;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lshark/internal/hppc/e;->j()I

    .line 47
    move-result v3

    .line 48
    .line 49
    if-ne v2, v3, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->a()Z

    .line 53
    move-result v2

    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    iget-object v2, p0, Lshark/internal/PathFinder;->f:Lshark/OnAnalysisProgressListener;

    .line 58
    .line 59
    sget-object v3, Lshark/OnAnalysisProgressListener$Step;->FINDING_DOMINATORS:Lshark/OnAnalysisProgressListener$Step;

    .line 60
    .line 61
    .line 62
    invoke-interface {v2, v3}, Lshark/OnAnalysisProgressListener;->onAnalysisProgress(Lshark/OnAnalysisProgressListener$Step;)V

    .line 63
    .line 64
    :cond_1
    iget-object v2, p0, Lshark/internal/PathFinder;->e:Lshark/i;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Lshark/internal/j;->b()J

    .line 68
    move-result-wide v3

    .line 69
    .line 70
    .line 71
    invoke-interface {v2, v3, v4}, Lshark/i;->l(J)Lshark/HeapObject;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    instance-of v3, v2, Lshark/HeapObject$HeapClass;

    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    check-cast v2, Lshark/HeapObject$HeapClass;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1, v2, v1}, Lshark/internal/PathFinder;->l(Lshark/internal/PathFinder$c;Lshark/HeapObject$HeapClass;Lshark/internal/j;)V

    .line 82
    goto :goto_0

    .line 83
    .line 84
    :cond_2
    instance-of v3, v2, Lshark/HeapObject$HeapInstance;

    .line 85
    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    check-cast v2, Lshark/HeapObject$HeapInstance;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1, v2, v1}, Lshark/internal/PathFinder;->m(Lshark/internal/PathFinder$c;Lshark/HeapObject$HeapInstance;Lshark/internal/j;)V

    .line 92
    goto :goto_0

    .line 93
    .line 94
    :cond_3
    instance-of v3, v2, Lshark/HeapObject$a;

    .line 95
    .line 96
    if-eqz v3, :cond_0

    .line 97
    .line 98
    check-cast v2, Lshark/HeapObject$a;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1, v2, v1}, Lshark/internal/PathFinder;->n(Lshark/internal/PathFinder$c;Lshark/HeapObject$a;Lshark/internal/j;)V

    .line 102
    goto :goto_0

    .line 103
    .line 104
    :cond_4
    new-instance v1, Lshark/internal/PathFinder$b;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->j()Lshark/internal/PathFinder$d;

    .line 108
    move-result-object v2

    .line 109
    .line 110
    instance-of v2, v2, Lshark/internal/PathFinder$d$a;

    .line 111
    .line 112
    if-eqz v2, :cond_5

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->j()Lshark/internal/PathFinder$d;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    check-cast p1, Lshark/internal/PathFinder$d$a;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Lshark/internal/PathFinder$d$a;->b()Lshark/internal/d;

    .line 122
    move-result-object p1

    .line 123
    goto :goto_1

    .line 124
    :cond_5
    const/4 p1, 0x0

    .line 125
    .line 126
    .line 127
    :goto_1
    invoke-direct {v1, v0, p1}, Lshark/internal/PathFinder$b;-><init>(Ljava/util/List;Lshark/internal/d;)V

    .line 128
    return-object v1
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
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
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
.end method

.method public final g(Lshark/i;Lshark/l$b$c$a$a;)I
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lshark/l$b$c$a$a;->b()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lshark/i;->i()I

    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    .line 14
    :cond_0
    sget-object p1, Lshark/PrimitiveType;->BOOLEAN:Lshark/PrimitiveType;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lshark/PrimitiveType;->getHprofType()I

    .line 18
    move-result p1

    .line 19
    const/4 v2, 0x1

    .line 20
    .line 21
    if-ne v0, p1, :cond_1

    .line 22
    return v2

    .line 23
    .line 24
    :cond_1
    sget-object p1, Lshark/PrimitiveType;->CHAR:Lshark/PrimitiveType;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lshark/PrimitiveType;->getHprofType()I

    .line 28
    move-result p1

    .line 29
    .line 30
    if-ne v0, p1, :cond_2

    .line 31
    return v1

    .line 32
    .line 33
    :cond_2
    sget-object p1, Lshark/PrimitiveType;->FLOAT:Lshark/PrimitiveType;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lshark/PrimitiveType;->getHprofType()I

    .line 37
    move-result p1

    .line 38
    const/4 v3, 0x4

    .line 39
    .line 40
    if-ne v0, p1, :cond_3

    .line 41
    return v3

    .line 42
    .line 43
    :cond_3
    sget-object p1, Lshark/PrimitiveType;->DOUBLE:Lshark/PrimitiveType;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lshark/PrimitiveType;->getHprofType()I

    .line 47
    move-result p1

    .line 48
    .line 49
    const/16 v4, 0x8

    .line 50
    .line 51
    if-ne v0, p1, :cond_4

    .line 52
    return v4

    .line 53
    .line 54
    :cond_4
    sget-object p1, Lshark/PrimitiveType;->BYTE:Lshark/PrimitiveType;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lshark/PrimitiveType;->getHprofType()I

    .line 58
    move-result p1

    .line 59
    .line 60
    if-ne v0, p1, :cond_5

    .line 61
    return v2

    .line 62
    .line 63
    :cond_5
    sget-object p1, Lshark/PrimitiveType;->SHORT:Lshark/PrimitiveType;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lshark/PrimitiveType;->getHprofType()I

    .line 67
    move-result p1

    .line 68
    .line 69
    if-ne v0, p1, :cond_6

    .line 70
    return v1

    .line 71
    .line 72
    :cond_6
    sget-object p1, Lshark/PrimitiveType;->INT:Lshark/PrimitiveType;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lshark/PrimitiveType;->getHprofType()I

    .line 76
    move-result p1

    .line 77
    .line 78
    if-ne v0, p1, :cond_7

    .line 79
    return v3

    .line 80
    .line 81
    :cond_7
    sget-object p1, Lshark/PrimitiveType;->LONG:Lshark/PrimitiveType;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lshark/PrimitiveType;->getHprofType()I

    .line 85
    move-result p1

    .line 86
    .line 87
    if-ne v0, p1, :cond_8

    .line 88
    return v4

    .line 89
    .line 90
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    const-string v1, "Unknown type "

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Lshark/l$b$c$a$a;->b()I

    .line 104
    move-result p2

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    move-result-object p2

    .line 112
    .line 113
    .line 114
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    throw p1
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
.end method

.method public final h(Lshark/internal/PathFinder$c;)Lshark/internal/j;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->k()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "removedNode"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->h()Ljava/util/Deque;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->h()Ljava/util/Deque;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Lshark/internal/j;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->i()Lshark/internal/hppc/e;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lshark/internal/j;->b()J

    .line 36
    move-result-wide v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v2, v3}, Lshark/internal/hppc/e;->h(J)Z

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    return-object v0

    .line 44
    :cond_0
    const/4 v0, 0x1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lshark/internal/PathFinder$c;->l(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->f()Ljava/util/Deque;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    check-cast v0, Lshark/internal/j;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->g()Lshark/internal/hppc/e;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lshark/internal/j;->b()J

    .line 65
    move-result-wide v2

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v2, v3}, Lshark/internal/hppc/e;->h(J)Z

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    return-object v0
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
.end method

.method public final i(Lshark/HeapObject$HeapInstance;Ljava/util/List;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lshark/HeapObject$HeapInstance;",
            "Ljava/util/List<",
            "Lshark/HeapObject$HeapClass;",
            ">;)",
            "Ljava/util/List<",
            "Lshark/internal/PathFinder$a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lshark/HeapObject$HeapInstance;->e()Lshark/i;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    move v5, v4

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v6

    .line 21
    .line 22
    if-eqz v6, :cond_4

    .line 23
    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v6

    .line 27
    .line 28
    check-cast v6, Lshark/HeapObject$HeapClass;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6}, Lshark/HeapObject$HeapClass;->v()Ljava/util/List;

    .line 32
    move-result-object v7

    .line 33
    .line 34
    .line 35
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    move-result-object v7

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    move-result v8

    .line 41
    .line 42
    if-eqz v8, :cond_3

    .line 43
    .line 44
    .line 45
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    move-result-object v8

    .line 47
    .line 48
    check-cast v8, Lshark/l$b$c$a$a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v8}, Lshark/l$b$c$a$a;->b()I

    .line 52
    move-result v9

    .line 53
    const/4 v10, 0x2

    .line 54
    .line 55
    if-eq v9, v10, :cond_0

    .line 56
    .line 57
    move-object/from16 v9, p0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v9, v0, v8}, Lshark/internal/PathFinder;->g(Lshark/i;Lshark/l$b$c$a$a;)I

    .line 61
    move-result v8

    .line 62
    add-int/2addr v5, v8

    .line 63
    goto :goto_1

    .line 64
    .line 65
    :cond_0
    move-object/from16 v9, p0

    .line 66
    .line 67
    if-nez v3, :cond_1

    .line 68
    .line 69
    new-instance v3, Lshark/internal/e;

    .line 70
    .line 71
    .line 72
    invoke-virtual/range {p1 .. p1}, Lshark/HeapObject$HeapInstance;->x()Lshark/l$b$c$b;

    .line 73
    move-result-object v10

    .line 74
    .line 75
    .line 76
    invoke-interface {v0}, Lshark/i;->i()I

    .line 77
    move-result v11

    .line 78
    .line 79
    .line 80
    invoke-direct {v3, v10, v11}, Lshark/internal/e;-><init>(Lshark/l$b$c$b;I)V

    .line 81
    .line 82
    .line 83
    :cond_1
    invoke-virtual {v3, v5}, Lshark/internal/e;->f(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Lshark/internal/e;->b()J

    .line 87
    move-result-wide v13

    .line 88
    .line 89
    const-wide/16 v10, 0x0

    .line 90
    .line 91
    cmp-long v5, v13, v10

    .line 92
    .line 93
    if-eqz v5, :cond_2

    .line 94
    .line 95
    new-instance v10, Lshark/internal/PathFinder$a;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6}, Lshark/HeapObject$HeapClass;->f()J

    .line 99
    move-result-wide v11

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6, v8}, Lshark/HeapObject$HeapClass;->r(Lshark/l$b$c$a$a;)Ljava/lang/String;

    .line 103
    move-result-object v15

    .line 104
    .line 105
    .line 106
    invoke-direct/range {v10 .. v15}, Lshark/internal/PathFinder$a;-><init>(JJLjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    :cond_2
    move v5, v4

    .line 111
    goto :goto_1

    .line 112
    .line 113
    :cond_3
    move-object/from16 v9, p0

    .line 114
    goto :goto_0

    .line 115
    .line 116
    :cond_4
    move-object/from16 v9, p0

    .line 117
    return-object v1
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
.end method

.method public final j()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lshark/HeapObject;",
            "Lshark/d;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lshark/internal/PathFinder$sortedGcRoots$rootClassName$1;->INSTANCE:Lshark/internal/PathFinder$sortedGcRoots$rootClassName$1;

    .line 3
    .line 4
    iget-object v1, p0, Lshark/internal/PathFinder;->e:Lshark/i;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Lshark/i;->m()Ljava/util/List;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v3

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v3

    .line 28
    move-object v4, v3

    .line 29
    .line 30
    check-cast v4, Lshark/d;

    .line 31
    .line 32
    iget-object v5, p0, Lshark/internal/PathFinder;->e:Lshark/i;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Lshark/d;->a()J

    .line 36
    move-result-wide v6

    .line 37
    .line 38
    .line 39
    invoke-interface {v5, v6, v7}, Lshark/i;->a(J)Z

    .line 40
    move-result v4

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    .line 45
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 49
    .line 50
    const/16 v3, 0xa

    .line 51
    .line 52
    .line 53
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 54
    move-result v3

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    move-result v3

    .line 66
    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    check-cast v3, Lshark/d;

    .line 74
    .line 75
    iget-object v4, p0, Lshark/internal/PathFinder;->e:Lshark/i;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Lshark/d;->a()J

    .line 79
    move-result-wide v5

    .line 80
    .line 81
    .line 82
    invoke-interface {v4, v5, v6}, Lshark/i;->l(J)Lshark/HeapObject;

    .line 83
    move-result-object v4

    .line 84
    .line 85
    .line 86
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 87
    move-result-object v3

    .line 88
    .line 89
    .line 90
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :cond_2
    new-instance v2, Lshark/internal/PathFinder$e;

    .line 94
    .line 95
    .line 96
    invoke-direct {v2, v0}, Lshark/internal/PathFinder$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 100
    move-result-object v0

    .line 101
    return-object v0
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final k(Ljava/util/Set;)Lshark/internal/hppc/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;)",
            "Lshark/internal/hppc/e;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/internal/hppc/e;

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lshark/internal/hppc/e;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lshark/internal/hppc/e;->e(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Number;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 35
    move-result-wide v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lshark/internal/hppc/e;->a(J)Z

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-object v0
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
.end method

.method public final l(Lshark/internal/PathFinder$c;Lshark/HeapObject$HeapClass;Lshark/internal/j;)V
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lshark/internal/PathFinder;->b:Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Lshark/HeapObject$HeapClass;->p()Ljava/lang/String;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    check-cast v1, Ljava/util/Map;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lshark/HeapObject$HeapClass;->y()Lkotlin/sequences/Sequence;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    move-result v3

    .line 34
    .line 35
    if-eqz v3, :cond_7

    .line 36
    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    check-cast v3, Lshark/h;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lshark/h;->c()Lshark/j;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Lshark/j;->f()Z

    .line 49
    move-result v4

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    goto :goto_2

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v3}, Lshark/h;->b()Ljava/lang/String;

    .line 56
    move-result-object v10

    .line 57
    .line 58
    const-string v4, "$staticOverhead"

    .line 59
    .line 60
    .line 61
    invoke-static {v10, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    move-result v4

    .line 63
    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    const-string v4, "$classOverhead"

    .line 67
    .line 68
    .line 69
    invoke-static {v10, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    move-result v4

    .line 71
    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    :cond_2
    :goto_2
    move-object/from16 v3, p1

    .line 75
    goto :goto_1

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-virtual {v3}, Lshark/h;->c()Lshark/j;

    .line 79
    move-result-object v3

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Lshark/j;->e()Lshark/ValueHolder;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    check-cast v3, Lshark/ValueHolder$h;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Lshark/ValueHolder$h;->a()J

    .line 91
    move-result-wide v6

    .line 92
    .line 93
    .line 94
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    move-result-object v3

    .line 96
    .line 97
    check-cast v3, Lshark/u;

    .line 98
    .line 99
    if-nez v3, :cond_4

    .line 100
    .line 101
    new-instance v5, Lshark/internal/j$a$b;

    .line 102
    .line 103
    sget-object v9, Lshark/LeakTraceReference$ReferenceType;->STATIC_FIELD:Lshark/LeakTraceReference$ReferenceType;

    .line 104
    .line 105
    const/16 v13, 0x10

    .line 106
    const/4 v14, 0x0

    .line 107
    .line 108
    const-wide/16 v11, 0x0

    .line 109
    .line 110
    move-object/from16 v8, p3

    .line 111
    .line 112
    .line 113
    invoke-direct/range {v5 .. v14}, Lshark/internal/j$a$b;-><init>(JLshark/internal/j;Lshark/LeakTraceReference$ReferenceType;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 114
    .line 115
    :goto_3
    move-object/from16 v3, p1

    .line 116
    goto :goto_4

    .line 117
    .line 118
    :cond_4
    instance-of v4, v3, Lshark/p;

    .line 119
    .line 120
    if-eqz v4, :cond_5

    .line 121
    .line 122
    new-instance v5, Lshark/internal/j$a$a;

    .line 123
    .line 124
    sget-object v9, Lshark/LeakTraceReference$ReferenceType;->STATIC_FIELD:Lshark/LeakTraceReference$ReferenceType;

    .line 125
    move-object v11, v3

    .line 126
    .line 127
    check-cast v11, Lshark/p;

    .line 128
    .line 129
    const/16 v14, 0x20

    .line 130
    const/4 v15, 0x0

    .line 131
    .line 132
    const-wide/16 v12, 0x0

    .line 133
    .line 134
    move-object/from16 v8, p3

    .line 135
    .line 136
    .line 137
    invoke-direct/range {v5 .. v15}, Lshark/internal/j$a$a;-><init>(JLshark/internal/j;Lshark/LeakTraceReference$ReferenceType;Ljava/lang/String;Lshark/p;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 138
    goto :goto_3

    .line 139
    .line 140
    .line 141
    :goto_4
    invoke-virtual {v0, v3, v5}, Lshark/internal/PathFinder;->c(Lshark/internal/PathFinder$c;Lshark/internal/j;)V

    .line 142
    goto :goto_1

    .line 143
    .line 144
    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 145
    .line 146
    .line 147
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 148
    throw v1

    .line 149
    .line 150
    :cond_6
    new-instance v1, Lkotlin/TypeCastException;

    .line 151
    .line 152
    const-string v2, "null cannot be cast to non-null type shark.ValueHolder.ReferenceHolder"

    .line 153
    .line 154
    .line 155
    invoke-direct {v1, v2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    .line 156
    throw v1

    .line 157
    :cond_7
    return-void
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
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
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
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method

.method public final m(Lshark/internal/PathFinder$c;Lshark/HeapObject$HeapInstance;Lshark/internal/j;)V
    .locals 14

    .line 1
    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p2 .. p2}, Lshark/HeapObject$HeapInstance;->n()Lshark/HeapObject$HeapClass;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lshark/HeapObject$HeapClass;->k()Lkotlin/sequences/Sequence;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v2

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    check-cast v2, Lshark/HeapObject$HeapClass;

    .line 30
    .line 31
    iget-object v3, p0, Lshark/internal/PathFinder;->a:Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lshark/HeapObject$HeapClass;->p()Ljava/lang/String;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    check-cast v2, Ljava/util/Map;

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    move-result v3

    .line 56
    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    check-cast v3, Ljava/util/Map$Entry;

    .line 64
    .line 65
    .line 66
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    check-cast v4, Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 73
    move-result-object v3

    .line 74
    .line 75
    check-cast v3, Lshark/u;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v4}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 79
    move-result v5

    .line 80
    .line 81
    if-nez v5, :cond_1

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    goto :goto_0

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lshark/HeapObject$HeapInstance;->n()Lshark/HeapObject$HeapClass;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lshark/internal/PathFinder$c;->b()J

    .line 93
    move-result-wide v2

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v1, v2, v3}, Lshark/internal/PathFinder;->a(Lshark/HeapObject$HeapClass;J)Ljava/util/List;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    move-object/from16 v2, p2

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v2, v1}, Lshark/internal/PathFinder;->i(Lshark/HeapObject$HeapInstance;Ljava/util/List;)Ljava/util/List;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 107
    move-result v2

    .line 108
    const/4 v3, 0x1

    .line 109
    .line 110
    if-le v2, v3, :cond_3

    .line 111
    .line 112
    new-instance v2, Lshark/internal/PathFinder$f;

    .line 113
    .line 114
    .line 115
    invoke-direct {v2}, Lshark/internal/PathFinder$f;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    .line 125
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    move-result v2

    .line 127
    .line 128
    if-eqz v2, :cond_6

    .line 129
    .line 130
    .line 131
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    move-result-object v2

    .line 133
    .line 134
    check-cast v2, Lshark/internal/PathFinder$a;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Lshark/internal/PathFinder$a;->b()Ljava/lang/String;

    .line 138
    move-result-object v3

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    move-result-object v3

    .line 143
    .line 144
    check-cast v3, Lshark/u;

    .line 145
    .line 146
    if-nez v3, :cond_4

    .line 147
    .line 148
    new-instance v4, Lshark/internal/j$a$b;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Lshark/internal/PathFinder$a;->c()J

    .line 152
    move-result-wide v5

    .line 153
    .line 154
    sget-object v8, Lshark/LeakTraceReference$ReferenceType;->INSTANCE_FIELD:Lshark/LeakTraceReference$ReferenceType;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lshark/internal/PathFinder$a;->b()Ljava/lang/String;

    .line 158
    move-result-object v9

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Lshark/internal/PathFinder$a;->a()J

    .line 162
    move-result-wide v10

    .line 163
    .line 164
    move-object/from16 v7, p3

    .line 165
    .line 166
    .line 167
    invoke-direct/range {v4 .. v11}, Lshark/internal/j$a$b;-><init>(JLshark/internal/j;Lshark/LeakTraceReference$ReferenceType;Ljava/lang/String;J)V

    .line 168
    goto :goto_2

    .line 169
    .line 170
    :cond_4
    instance-of v4, v3, Lshark/p;

    .line 171
    .line 172
    if-eqz v4, :cond_5

    .line 173
    .line 174
    new-instance v5, Lshark/internal/j$a$a;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Lshark/internal/PathFinder$a;->c()J

    .line 178
    move-result-wide v6

    .line 179
    .line 180
    sget-object v9, Lshark/LeakTraceReference$ReferenceType;->INSTANCE_FIELD:Lshark/LeakTraceReference$ReferenceType;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Lshark/internal/PathFinder$a;->b()Ljava/lang/String;

    .line 184
    move-result-object v10

    .line 185
    move-object v11, v3

    .line 186
    .line 187
    check-cast v11, Lshark/p;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Lshark/internal/PathFinder$a;->a()J

    .line 191
    move-result-wide v12

    .line 192
    .line 193
    move-object/from16 v8, p3

    .line 194
    .line 195
    .line 196
    invoke-direct/range {v5 .. v13}, Lshark/internal/j$a$a;-><init>(JLshark/internal/j;Lshark/LeakTraceReference$ReferenceType;Ljava/lang/String;Lshark/p;J)V

    .line 197
    move-object v4, v5

    .line 198
    .line 199
    .line 200
    :goto_2
    invoke-virtual {p0, p1, v4}, Lshark/internal/PathFinder;->c(Lshark/internal/PathFinder$c;Lshark/internal/j;)V

    .line 201
    goto :goto_1

    .line 202
    .line 203
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 204
    .line 205
    .line 206
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 207
    throw p1

    .line 208
    :cond_6
    return-void
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
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
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
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method

.method public final n(Lshark/internal/PathFinder$c;Lshark/HeapObject$a;Lshark/internal/j;)V
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Lshark/HeapObject$a;->k()Lshark/l$b$c$c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lshark/l$b$c$c;->a()[J

    .line 8
    move-result-object v0

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    array-length v2, v0

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    .line 18
    :goto_0
    if-ge v4, v2, :cond_1

    .line 19
    .line 20
    aget-wide v5, v0, v4

    .line 21
    .line 22
    const-wide/16 v7, 0x0

    .line 23
    .line 24
    cmp-long v7, v5, v7

    .line 25
    .line 26
    if-eqz v7, :cond_0

    .line 27
    .line 28
    iget-object v7, p0, Lshark/internal/PathFinder;->e:Lshark/i;

    .line 29
    .line 30
    .line 31
    invoke-interface {v7, v5, v6}, Lshark/i;->a(J)Z

    .line 32
    move-result v7

    .line 33
    .line 34
    if-eqz v7, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    .line 41
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    add-int/lit8 v2, v3, 0x1

    .line 61
    .line 62
    if-gez v3, :cond_2

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 66
    .line 67
    :cond_2
    check-cast v1, Ljava/lang/Number;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 71
    move-result-wide v5

    .line 72
    .line 73
    .line 74
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 75
    move-result-object v9

    .line 76
    .line 77
    new-instance v4, Lshark/internal/j$a$b;

    .line 78
    .line 79
    sget-object v8, Lshark/LeakTraceReference$ReferenceType;->ARRAY_ENTRY:Lshark/LeakTraceReference$ReferenceType;

    .line 80
    .line 81
    const/16 v12, 0x10

    .line 82
    const/4 v13, 0x0

    .line 83
    .line 84
    const-wide/16 v10, 0x0

    .line 85
    .line 86
    move-object/from16 v7, p3

    .line 87
    .line 88
    .line 89
    invoke-direct/range {v4 .. v13}, Lshark/internal/j$a$b;-><init>(JLshark/internal/j;Lshark/LeakTraceReference$ReferenceType;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1, v4}, Lshark/internal/PathFinder;->c(Lshark/internal/PathFinder$c;Lshark/internal/j;)V

    .line 93
    move v3, v2

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    return-void
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
.end method
