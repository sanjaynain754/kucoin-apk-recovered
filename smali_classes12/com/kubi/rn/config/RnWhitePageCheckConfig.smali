.class public final Lcom/kubi/rn/config/RnWhitePageCheckConfig;
.super Ljava/lang/Object;
.source "RnWhitePageCheckConfig.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/rn/config/RnWhitePageCheckConfig$WhitePageConfig;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0013H\u0000\u00a2\u0006\u0002\u0008\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/kubi/rn/config/RnWhitePageCheckConfig;",
        "",
        "<init>",
        "()V",
        "CONFIG_NAME",
        "",
        "value",
        "",
        "isEnable",
        "()Z",
        "",
        "delay",
        "getDelay",
        "()J",
        "",
        "thresholdRate",
        "getThresholdRate",
        "()F",
        "load",
        "",
        "load$BReactNativeLib_googleRelease",
        "WhitePageConfig",
        "BReactNativeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRnWhitePageCheckConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnWhitePageCheckConfig.kt\ncom/kubi/rn/config/RnWhitePageCheckConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n*L\n1#1,37:1\n35#2,4:38\n39#2:44\n44#3,2:42\n35#4,3:45\n*S KotlinDebug\n*F\n+ 1 RnWhitePageCheckConfig.kt\ncom/kubi/rn/config/RnWhitePageCheckConfig\n*L\n29#1:38,4\n29#1:44\n29#1:42,2\n30#1:45,3\n*E\n"
    }
.end annotation


# static fields
.field private static final CONFIG_NAME:Ljava/lang/String; = "krn_white_page_config"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/kubi/rn/config/RnWhitePageCheckConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static delay:J

.field private static isEnable:Z

.field private static thresholdRate:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/rn/config/RnWhitePageCheckConfig;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/rn/config/RnWhitePageCheckConfig;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->INSTANCE:Lcom/kubi/rn/config/RnWhitePageCheckConfig;

    .line 8
    .line 9
    sget-object v0, Lvk/s;->a:Lvk/s;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lvk/s;->Q()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    sput-boolean v0, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->isEnable:Z

    .line 16
    .line 17
    const-wide/16 v0, 0x1388

    .line 18
    .line 19
    sput-wide v0, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->delay:J

    .line 20
    .line 21
    const/high16 v0, 0x42be0000    # 95.0f

    .line 22
    .line 23
    sput v0, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->thresholdRate:F

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
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
.method public final getDelay()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->delay:J

    .line 3
    return-wide v0
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

.method public final getThresholdRate()F
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->thresholdRate:F

    .line 3
    return v0
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

.method public final isEnable()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->isEnable:Z

    .line 3
    return v0
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

.method public final load$BReactNativeLib_googleRelease()V
    .locals 10

    .line 1
    .line 2
    const-string v0, "krn_white_page_config"

    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    :try_start_0
    sget-object v3, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 7
    .line 8
    new-instance v3, Lcom/kubi/rn/config/RnWhitePageCheckConfig$load$$inlined$getConfig$1;

    .line 9
    .line 10
    .line 11
    invoke-direct {v3}, Lcom/kubi/rn/config/RnWhitePageCheckConfig$load$$inlined$getConfig$1;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    const-string v4, "object : TypeToken<T>() {}.type"

    .line 18
    .line 19
    .line 20
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v3}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    move-object v4, v0

    .line 28
    .line 29
    new-instance v3, Lcom/kubi/config/exception/KCConfigException;

    .line 30
    .line 31
    const/16 v8, 0x8

    .line 32
    const/4 v9, 0x0

    .line 33
    .line 34
    const-string v5, "RemoteConfig"

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v3 .. v9}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v3, v2, v1, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Lcom/kubi/rn/config/RnWhitePageCheckConfig$WhitePageConfig;

    .line 46
    .line 47
    if-nez v0, :cond_0

    .line 48
    goto :goto_1

    .line 49
    .line 50
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    const-string v4, "load rn white page config: "

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    const/4 v4, 0x0

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v4, v1, v2}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    const-string v1, ""

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    const-string v2, "RnWhitePageCheckConfig"

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/kubi/rn/config/RnWhitePageCheckConfig$WhitePageConfig;->getThreshold()F

    .line 83
    move-result v1

    .line 84
    .line 85
    const/16 v2, 0x64

    .line 86
    int-to-float v2, v2

    .line 87
    mul-float/2addr v1, v2

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/kubi/rn/config/RnWhitePageCheckConfig$WhitePageConfig;->getDelay()J

    .line 91
    move-result-wide v2

    .line 92
    .line 93
    const-wide/16 v4, 0x0

    .line 94
    .line 95
    cmp-long v2, v2, v4

    .line 96
    .line 97
    if-gtz v2, :cond_2

    .line 98
    :goto_1
    return-void

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {v0}, Lcom/kubi/rn/config/RnWhitePageCheckConfig$WhitePageConfig;->getEnable()Z

    .line 102
    move-result v2

    .line 103
    .line 104
    sput-boolean v2, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->isEnable:Z

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/kubi/rn/config/RnWhitePageCheckConfig$WhitePageConfig;->getDelay()J

    .line 108
    move-result-wide v2

    .line 109
    .line 110
    sput-wide v2, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->delay:J

    .line 111
    .line 112
    sput v1, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->thresholdRate:F

    .line 113
    return-void
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
