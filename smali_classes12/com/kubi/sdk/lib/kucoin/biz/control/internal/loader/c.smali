.class public final Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;
.super Ljava/lang/Object;
.source "BizControlRemoteConfig.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0003R\"\u0010\u000c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;",
        "",
        "<init>",
        "()V",
        "",
        "b",
        "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;",
        "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;",
        "a",
        "()Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;",
        "setRemoteConfig",
        "(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;)V",
        "remoteConfig",
        "biz-control-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBizControlRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizControlRemoteConfig.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizControlRemoteConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n*L\n1#1,33:1\n33#2:34\n*S KotlinDebug\n*F\n+ 1 BizControlRemoteConfig.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizControlRemoteConfig\n*L\n19#1:34\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;->a:Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;

    .line 10
    const/4 v7, 0x7

    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct/range {v1 .. v8}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;-><init>(ZJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    sput-object v1, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;->b:Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;

    .line 22
    return-void
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


# virtual methods
.method public final a()Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;->b:Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;

    .line 3
    return-object v0
    .line 4
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

.method public final b()V
    .locals 9

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 3
    .line 4
    const-string v0, "android_biz_control"

    .line 5
    .line 6
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 7
    .line 8
    new-instance v1, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c$a;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c$a;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    new-instance v1, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;

    .line 31
    const/4 v7, 0x7

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    .line 35
    const-wide/16 v3, 0x0

    .line 36
    .line 37
    const-wide/16 v5, 0x0

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v1 .. v8}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;-><init>(ZJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    move-object v0, v1

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_0
    :goto_0
    sput-object v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;->b:Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;

    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    goto :goto_2

    .line 53
    .line 54
    :goto_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    const-string v1, "initSDK: remoteConfig="

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    sget-object v1, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;->b:Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    const-string v1, "BizControl::BizControlRemoteConfig"

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    return-void
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
.end method
