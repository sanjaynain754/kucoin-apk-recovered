.class public final enum Lcom/sumsub/sentry/SentryLevel;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sentry/SentryLevel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0081\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/sumsub/sentry/SentryLevel;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "com/sumsub/sentry/y0",
        "DEBUG",
        "INFO",
        "WARNING",
        "ERROR",
        "FATAL",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ltg0/o;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sumsub/sentry/SentryLevel;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ltg0/d<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/sumsub/sentry/y0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum DEBUG:Lcom/sumsub/sentry/SentryLevel;

.field public static final enum ERROR:Lcom/sumsub/sentry/SentryLevel;

.field public static final enum FATAL:Lcom/sumsub/sentry/SentryLevel;

.field public static final enum INFO:Lcom/sumsub/sentry/SentryLevel;

.field public static final enum WARNING:Lcom/sumsub/sentry/SentryLevel;


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sentry/SentryLevel;
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/SentryLevel;->DEBUG:Lcom/sumsub/sentry/SentryLevel;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sentry/SentryLevel;->INFO:Lcom/sumsub/sentry/SentryLevel;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sentry/SentryLevel;->WARNING:Lcom/sumsub/sentry/SentryLevel;

    .line 7
    .line 8
    sget-object v3, Lcom/sumsub/sentry/SentryLevel;->ERROR:Lcom/sumsub/sentry/SentryLevel;

    .line 9
    .line 10
    sget-object v4, Lcom/sumsub/sentry/SentryLevel;->FATAL:Lcom/sumsub/sentry/SentryLevel;

    .line 11
    .line 12
    .line 13
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/sumsub/sentry/SentryLevel;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/SentryLevel;

    .line 3
    .line 4
    const-string v1, "DEBUG"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sentry/SentryLevel;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/sumsub/sentry/SentryLevel;->DEBUG:Lcom/sumsub/sentry/SentryLevel;

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sentry/SentryLevel;

    .line 13
    .line 14
    const-string v1, "INFO"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sentry/SentryLevel;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/sumsub/sentry/SentryLevel;->INFO:Lcom/sumsub/sentry/SentryLevel;

    .line 21
    .line 22
    new-instance v0, Lcom/sumsub/sentry/SentryLevel;

    .line 23
    .line 24
    const-string v1, "WARNING"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sentry/SentryLevel;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/sumsub/sentry/SentryLevel;->WARNING:Lcom/sumsub/sentry/SentryLevel;

    .line 31
    .line 32
    new-instance v0, Lcom/sumsub/sentry/SentryLevel;

    .line 33
    .line 34
    const-string v1, "ERROR"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sentry/SentryLevel;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Lcom/sumsub/sentry/SentryLevel;->ERROR:Lcom/sumsub/sentry/SentryLevel;

    .line 41
    .line 42
    new-instance v0, Lcom/sumsub/sentry/SentryLevel;

    .line 43
    .line 44
    const-string v1, "FATAL"

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sentry/SentryLevel;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v0, Lcom/sumsub/sentry/SentryLevel;->FATAL:Lcom/sumsub/sentry/SentryLevel;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/sumsub/sentry/SentryLevel;->$values()[Lcom/sumsub/sentry/SentryLevel;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    sput-object v0, Lcom/sumsub/sentry/SentryLevel;->$VALUES:[Lcom/sumsub/sentry/SentryLevel;

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    sput-object v0, Lcom/sumsub/sentry/SentryLevel;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 63
    .line 64
    new-instance v0, Lcom/sumsub/sentry/y0;

    .line 65
    .line 66
    .line 67
    invoke-direct {v0}, Lcom/sumsub/sentry/y0;-><init>()V

    .line 68
    .line 69
    sput-object v0, Lcom/sumsub/sentry/SentryLevel;->Companion:Lcom/sumsub/sentry/y0;

    .line 70
    .line 71
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 72
    .line 73
    new-instance v1, Lcom/sumsub/sentry/w1;

    .line 74
    .line 75
    .line 76
    invoke-direct {v1}, Lcom/sumsub/sentry/w1;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    sput-object v0, Lcom/sumsub/sentry/SentryLevel;->$cachedSerializer$delegate:Lkotlin/Lazy;

    .line 83
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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
.end method

.method private static final synthetic _init_$_anonymous_()Ltg0/d;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sentry/SentryLevel;->values()[Lcom/sumsub/sentry/SentryLevel;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "error"

    .line 7
    .line 8
    const-string v2, "fatal"

    .line 9
    .line 10
    const-string v3, "debug"

    .line 11
    .line 12
    const-string v4, "info"

    .line 13
    .line 14
    .line 15
    const-string/jumbo v5, "warning"

    .line 16
    .line 17
    .line 18
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    .line 23
    filled-new-array {v2, v2, v2, v2, v2}, [[Ljava/lang/annotation/Annotation;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    const-string v4, "com.sumsub.sentry.SentryLevel"

    .line 27
    .line 28
    .line 29
    invoke-static {v4, v0, v1, v3, v2}, Lkotlinx/serialization/internal/i0;->a(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ltg0/d;

    .line 30
    move-result-object v0

    .line 31
    return-object v0
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

.method public static synthetic a()Ltg0/d;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sentry/SentryLevel;->_init_$_anonymous_()Ltg0/d;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/SentryLevel;->$cachedSerializer$delegate:Lkotlin/Lazy;

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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/sumsub/sentry/SentryLevel;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/SentryLevel;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sentry/SentryLevel;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sentry/SentryLevel;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sentry/SentryLevel;

    .line 9
    return-object p0
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
.end method

.method public static values()[Lcom/sumsub/sentry/SentryLevel;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/SentryLevel;->$VALUES:[Lcom/sumsub/sentry/SentryLevel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sentry/SentryLevel;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
