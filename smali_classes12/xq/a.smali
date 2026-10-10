.class public final Lxq/a;
.super Ljava/lang/Object;
.source "FlutterIssuesHandler.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ/\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r0\u000cH\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lxq/a;",
        "",
        "<init>",
        "()V",
        "Lio/flutter/plugin/common/MethodCall;",
        "call",
        "",
        "b",
        "(Lio/flutter/plugin/common/MethodCall;)V",
        "Lcom/kubi/monitor/FlutterError;",
        "a",
        "(Lio/flutter/plugin/common/MethodCall;)Lcom/kubi/monitor/FlutterError;",
        "",
        "",
        "",
        "errorElements",
        "",
        "Ljava/lang/StackTraceElement;",
        "c",
        "(Ljava/util/List;)[Ljava/lang/StackTraceElement;",
        "component_monitor_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFlutterIssuesHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterIssuesHandler.kt\ncom/kubi/monitor/flutter/FlutterIssuesHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,74:1\n1557#2:75\n1628#2,3:76\n37#3:79\n36#3,3:80\n*S KotlinDebug\n*F\n+ 1 FlutterIssuesHandler.kt\ncom/kubi/monitor/flutter/FlutterIssuesHandler\n*L\n58#1:75\n58#1:76,3\n64#1:79\n64#1:80,3\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lxq/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lxq/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lxq/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lxq/a;->a:Lxq/a;

    .line 8
    return-void
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
.end method

.method public constructor <init>()V
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
.end method

.method public static final a(Lio/flutter/plugin/common/MethodCall;)Lcom/kubi/monitor/FlutterError;
    .locals 12
    .param p0    # Lio/flutter/plugin/common/MethodCall;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "call"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "exception"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    move-object v3, v0

    .line 13
    .line 14
    check-cast v3, Ljava/lang/String;

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    return-object v0

    .line 19
    .line 20
    :cond_0
    const-string v1, "reason"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    const-string v2, ""

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    move-object v10, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v10, v1

    .line 34
    .line 35
    :goto_0
    const-string v1, "fatal"

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    instance-of v4, v1, Ljava/lang/Boolean;

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    move-object v0, v1

    .line 45
    .line 46
    check-cast v0, Ljava/lang/Boolean;

    .line 47
    .line 48
    :cond_2
    if-eqz v0, :cond_3

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    move-result v0

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    const/4 v0, 0x0

    .line 55
    .line 56
    :goto_1
    const-string v1, "information"

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    check-cast v1, Ljava/lang/String;

    .line 63
    .line 64
    if-nez v1, :cond_4

    .line 65
    move-object v11, v2

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move-object v11, v1

    .line 68
    .line 69
    :goto_2
    const-string v1, "stackTraceElements"

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 73
    move-result-object p0

    .line 74
    .line 75
    check-cast p0, Ljava/util/List;

    .line 76
    .line 77
    .line 78
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 79
    move-result v1

    .line 80
    .line 81
    if-nez v1, :cond_5

    .line 82
    move-object v1, v3

    .line 83
    goto :goto_3

    .line 84
    .line 85
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v2, ". Error thrown "

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const/16 v2, 0x2e

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    move-result-object v1

    .line 109
    .line 110
    :goto_3
    if-eqz v0, :cond_6

    .line 111
    .line 112
    new-instance v2, Lcom/kubi/monitor/flutter/FlutterCrash;

    .line 113
    .line 114
    .line 115
    invoke-direct {v2, v1}, Lcom/kubi/monitor/flutter/FlutterCrash;-><init>(Ljava/lang/String;)V

    .line 116
    goto :goto_4

    .line 117
    .line 118
    :cond_6
    new-instance v2, Lcom/kubi/monitor/flutter/FlutterError;

    .line 119
    .line 120
    .line 121
    invoke-direct {v2, v1}, Lcom/kubi/monitor/flutter/FlutterError;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    :goto_4
    if-eqz p0, :cond_7

    .line 124
    .line 125
    .line 126
    invoke-static {p0}, Lxq/a;->c(Ljava/util/List;)[Ljava/lang/StackTraceElement;

    .line 127
    move-result-object p0

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, p0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 131
    .line 132
    :cond_7
    new-instance v1, Lcom/kubi/monitor/FlutterError;

    .line 133
    .line 134
    const/16 v8, 0x3c

    .line 135
    const/4 v9, 0x0

    .line 136
    const/4 v4, 0x0

    .line 137
    const/4 v5, 0x0

    .line 138
    const/4 v6, 0x0

    .line 139
    const/4 v7, 0x0

    .line 140
    .line 141
    .line 142
    invoke-direct/range {v1 .. v9}, Lcom/kubi/monitor/FlutterError;-><init>(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/monitor/MonitorLevel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 146
    move-result p0

    .line 147
    .line 148
    if-lez p0, :cond_8

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v10}, Lcom/kubi/monitor/FlutterError;->setReason(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_8
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 155
    move-result p0

    .line 156
    .line 157
    if-lez p0, :cond_9

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v11}, Lcom/kubi/monitor/FlutterError;->setInformation(Ljava/lang/String;)V

    .line 161
    .line 162
    :cond_9
    if-eqz v0, :cond_a

    .line 163
    .line 164
    sget-object p0, Lcom/kubi/monitor/MonitorLevel;->FATAL:Lcom/kubi/monitor/MonitorLevel;

    .line 165
    goto :goto_5

    .line 166
    .line 167
    :cond_a
    sget-object p0, Lcom/kubi/monitor/MonitorLevel;->ERROR:Lcom/kubi/monitor/MonitorLevel;

    .line 168
    .line 169
    .line 170
    :goto_5
    invoke-virtual {v1, p0}, Lcom/kubi/monitor/FlutterError;->setLevel(Lcom/kubi/monitor/MonitorLevel;)V

    .line 171
    return-object v1
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
.end method

.method public static final b(Lio/flutter/plugin/common/MethodCall;)V
    .locals 1
    .param p0    # Lio/flutter/plugin/common/MethodCall;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "call"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lxq/a;->a(Lio/flutter/plugin/common/MethodCall;)Lcom/kubi/monitor/FlutterError;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lqq/c;->a(Lcom/kubi/monitor/FlutterError;)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string v0, "exception"

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p0
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

.method public static final c(Ljava/util/List;)[Ljava/lang/StackTraceElement;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)[",
            "Ljava/lang/StackTraceElement;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    const/16 v1, 0xa

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    check-cast v1, Ljava/util/Map;

    .line 28
    .line 29
    const-string v2, "file"

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    check-cast v2, Ljava/lang/String;

    .line 36
    .line 37
    const-string v3, ""

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    move-object v2, v3

    .line 41
    .line 42
    :cond_0
    const-string v4, "line"

    .line 43
    .line 44
    .line 45
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    check-cast v4, Ljava/lang/String;

    .line 49
    .line 50
    if-nez v4, :cond_1

    .line 51
    move-object v4, v3

    .line 52
    .line 53
    :cond_1
    const-string v5, "class"

    .line 54
    .line 55
    .line 56
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    move-result-object v5

    .line 58
    .line 59
    check-cast v5, Ljava/lang/String;

    .line 60
    .line 61
    if-nez v5, :cond_2

    .line 62
    move-object v5, v3

    .line 63
    .line 64
    :cond_2
    const-string v6, "method"

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    check-cast v1, Ljava/lang/String;

    .line 71
    .line 72
    if-nez v1, :cond_3

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move-object v3, v1

    .line 75
    .line 76
    :goto_1
    new-instance v1, Ljava/lang/StackTraceElement;

    .line 77
    .line 78
    .line 79
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 80
    move-result v4

    .line 81
    .line 82
    .line 83
    invoke-direct {v1, v5, v3, v2, v4}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    goto :goto_0

    .line 88
    :cond_4
    const/4 p0, 0x0

    .line 89
    .line 90
    new-array p0, p0, [Ljava/lang/StackTraceElement;

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 94
    move-result-object p0

    .line 95
    .line 96
    check-cast p0, [Ljava/lang/StackTraceElement;

    .line 97
    return-object p0
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
.end method
