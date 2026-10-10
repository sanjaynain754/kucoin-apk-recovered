.class public final Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum$Companion;
.super Ljava/lang/Object;
.source "KunlunNetworkPathEnum.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "path",
        "Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;",
        "getMatchEnum",
        "(Ljava/lang/String;)Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "sPathMap",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "KCConstant_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMatchEnum(Ljava/lang/String;)Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "path"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;->access$getSPathMap$cp()Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;

    .line 16
    .line 17
    if-nez v0, :cond_5

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;->access$getSPathArray$cp()[Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;

    .line 21
    move-result-object v0

    .line 22
    array-length v1, v0

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    const/4 v3, 0x0

    .line 25
    .line 26
    if-ge v2, v1, :cond_2

    .line 27
    .line 28
    aget-object v4, v0, v2

    .line 29
    .line 30
    :try_start_0
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, p1}, Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;->isMatch(Ljava/lang/String;)Z

    .line 34
    move-result v5

    .line 35
    .line 36
    .line 37
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    .line 41
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v5

    .line 45
    .line 46
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 47
    .line 48
    .line 49
    invoke-static {v5}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 50
    move-result-object v5

    .line 51
    .line 52
    .line 53
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    move-result-object v5

    .line 55
    .line 56
    :goto_1
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    invoke-static {v5}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 60
    move-result v7

    .line 61
    .line 62
    if-eqz v7, :cond_0

    .line 63
    move-object v5, v6

    .line 64
    .line 65
    :cond_0
    check-cast v5, Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    move-result v5

    .line 70
    .line 71
    if-eqz v5, :cond_1

    .line 72
    goto :goto_2

    .line 73
    .line 74
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    move-object v4, v3

    .line 77
    .line 78
    :goto_2
    if-eqz v4, :cond_4

    .line 79
    .line 80
    .line 81
    invoke-static {v4}, Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;->access$getMatch$p(Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;)Lcom/kubi/sdk/constant/monitor/PathMatchEnum;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    sget-object v1, Lcom/kubi/sdk/constant/monitor/PathMatchEnum;->EQUAL:Lcom/kubi/sdk/constant/monitor/PathMatchEnum;

    .line 85
    .line 86
    if-ne v0, v1, :cond_3

    .line 87
    .line 88
    .line 89
    invoke-static {}, Lcom/kubi/sdk/constant/monitor/KunlunNetworkPathEnum;->access$getSPathMap$cp()Ljava/util/concurrent/ConcurrentHashMap;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    :cond_3
    move-object v3, v4

    .line 95
    :cond_4
    return-object v3

    .line 96
    :cond_5
    return-object v0
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
.end method
