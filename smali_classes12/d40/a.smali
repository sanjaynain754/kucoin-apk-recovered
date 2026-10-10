.class public final Ld40/a;
.super Ljava/lang/Object;
.source "RobotDurationRuleSettings.kt"

# interfaces
.implements Lcom/kubi/monitor/duration/IDurationRuleSetting;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/kubi/tradingbotkit/RobotDurationRuleSettings;",
        "Lcom/kubi/monitor/duration/IDurationRuleSetting;",
        "<init>",
        "()V",
        "getRules",
        "",
        "Lcom/kubi/monitor/duration/DurationRule;",
        "TradingBotKitLib_googleRelease"
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
        "SMAP\nRobotDurationRuleSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RobotDurationRuleSettings.kt\ncom/kubi/tradingbotkit/RobotDurationRuleSettings\n+ 2 DurationRule.kt\ncom/kubi/monitor/duration/DurationRule$Companion\n*L\n1#1,59:1\n37#2:60\n37#2:61\n37#2:62\n*S KotlinDebug\n*F\n+ 1 RobotDurationRuleSettings.kt\ncom/kubi/tradingbotkit/RobotDurationRuleSettings\n*L\n22#1:60\n31#1:61\n39#1:62\n*E\n"
    }
.end annotation


# direct methods
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
.method public getRules()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/monitor/duration/DurationRule;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/monitor/duration/DurationRule;->f:Lcom/kubi/monitor/duration/DurationRule$Companion;

    .line 3
    .line 4
    new-instance v0, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 8
    .line 9
    const-string v1, "click_bot_create"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/monitor/duration/DurationCate;->click:Lcom/kubi/monitor/duration/DurationCate;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 18
    .line 19
    const-string v2, "click_start_btn"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 23
    .line 24
    const-string v3, "show_toast"

    .line 25
    .line 26
    .line 27
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v3}, Lcom/kubi/monitor/duration/DurationRule$a;->j(Ljava/util/List;)V

    .line 32
    .line 33
    const-string v3, "data_load_finish"

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 37
    move-result-object v4

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v4}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 41
    .line 42
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    new-instance v4, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 49
    .line 50
    .line 51
    invoke-direct {v4}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 52
    .line 53
    const-string v5, "B5trading_bot_load"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v5}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 57
    .line 58
    sget-object v5, Lcom/kubi/monitor/duration/DurationCate;->page_load:Lcom/kubi/monitor/duration/DurationCate;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v5}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 62
    .line 63
    const-string v5, "page_load_start"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v5}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 70
    move-result-object v5

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v5}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 77
    move-result-object v4

    .line 78
    .line 79
    new-instance v5, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 80
    .line 81
    .line 82
    invoke-direct {v5}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 83
    .line 84
    const-string v6, "robot_kline_load"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5, v6}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v2}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 104
    move-result-object v1

    .line 105
    .line 106
    .line 107
    filled-new-array {v0, v4, v1}, [Lcom/kubi/monitor/duration/DurationRule;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    .line 111
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 112
    move-result-object v0

    .line 113
    return-object v0
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
