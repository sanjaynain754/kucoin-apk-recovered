.class public final Lgg/a;
.super Ljava/lang/Object;
.source "NetFlutterIssue.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "",
        "b",
        "(Ljava/lang/Throwable;)Z",
        "e",
        "",
        "source",
        "",
        "c",
        "(Ljava/lang/Throwable;Ljava/lang/String;)V",
        "component_network_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lgg/a;->c(Ljava/lang/Throwable;Ljava/lang/String;)V

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
.end method

.method public static final b(Ljava/lang/Throwable;)Z
    .locals 5
    .param p0    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    return v1

    .line 12
    .line 13
    :cond_0
    instance-of v0, p0, Ljava/net/UnknownHostException;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    return v1

    .line 17
    .line 18
    :cond_1
    instance-of v0, p0, Ljava/net/SocketException;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    return v1

    .line 22
    .line 23
    :cond_2
    instance-of v0, p0, Ljava/net/SocketTimeoutException;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    return v1

    .line 27
    .line 28
    :cond_3
    instance-of v0, p0, Ljavax/net/ssl/SSLException;

    .line 29
    .line 30
    if-eqz v0, :cond_4

    .line 31
    return v1

    .line 32
    .line 33
    :cond_4
    instance-of v0, p0, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 34
    .line 35
    if-eqz v0, :cond_5

    .line 36
    return v1

    .line 37
    .line 38
    :cond_5
    instance-of v0, p0, Ljava/lang/SecurityException;

    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x2

    .line 41
    const/4 v4, 0x0

    .line 42
    .line 43
    if-eqz v0, :cond_7

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    move-result-object p0

    .line 48
    .line 49
    if-eqz p0, :cond_6

    .line 50
    .line 51
    const-string v0, "Package android does not belong to"

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_6
    return v4

    .line 58
    .line 59
    :cond_7
    instance-of v0, p0, Ljava/io/IOException;

    .line 60
    .line 61
    if-eqz v0, :cond_e

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 65
    move-result-object p0

    .line 66
    .line 67
    if-eqz p0, :cond_e

    .line 68
    .line 69
    const-string v0, "Required SETTINGS preface not received"

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 73
    move-result v0

    .line 74
    .line 75
    if-eqz v0, :cond_8

    .line 76
    return v1

    .line 77
    .line 78
    :cond_8
    const-string v0, "Unexpected response code for CONNECT"

    .line 79
    .line 80
    .line 81
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 82
    move-result v0

    .line 83
    .line 84
    if-eqz v0, :cond_9

    .line 85
    return v1

    .line 86
    .line 87
    :cond_9
    const-string v0, "exhausted all routes"

    .line 88
    .line 89
    .line 90
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 91
    move-result v0

    .line 92
    .line 93
    if-eqz v0, :cond_a

    .line 94
    return v1

    .line 95
    .line 96
    :cond_a
    const-string v0, "unexpected end of stream"

    .line 97
    .line 98
    .line 99
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 100
    move-result v0

    .line 101
    .line 102
    if-eqz v0, :cond_b

    .line 103
    return v1

    .line 104
    .line 105
    :cond_b
    const-string v0, "stream was reset: CANCEL"

    .line 106
    .line 107
    .line 108
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 109
    move-result v0

    .line 110
    .line 111
    if-eqz v0, :cond_c

    .line 112
    return v1

    .line 113
    .line 114
    :cond_c
    const-string v0, "Software caused connection abort"

    .line 115
    .line 116
    .line 117
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 118
    move-result v0

    .line 119
    .line 120
    if-eqz v0, :cond_d

    .line 121
    return v1

    .line 122
    .line 123
    :cond_d
    const-string v0, "closed"

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    move-result p0

    .line 128
    .line 129
    if-eqz p0, :cond_e

    .line 130
    return v1

    .line 131
    :cond_e
    return v4
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
.end method

.method public static final c(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/flutter/network/exception/NetFlutterIssueException;

    .line 3
    .line 4
    const/16 v5, 0x8

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    move-object v1, p0

    .line 9
    move-object v2, p1

    .line 10
    .line 11
    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/kubi/flutter/network/exception/NetFlutterIssueException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    const/4 p0, 0x0

    .line 14
    const/4 p1, 0x2

    .line 15
    .line 16
    .line 17
    invoke-static {v0, p0, p1, p0}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 18
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
.end method
