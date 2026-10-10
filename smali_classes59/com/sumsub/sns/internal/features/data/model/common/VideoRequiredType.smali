.class public final enum Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0087\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "Companion",
        "com/sumsub/sns/internal/features/data/model/common/C3",
        "Liveness",
        "Enabled",
        "Disabled",
        "PhotoRequired",
        "DocCapture",
        "PassiveLiveness",
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

.field private static final synthetic $VALUES:[Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

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

.field public static final Companion:Lcom/sumsub/sns/internal/features/data/model/common/C3;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum Disabled:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

.field public static final enum DocCapture:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

.field public static final enum Enabled:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

.field public static final enum Liveness:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

.field public static final enum PassiveLiveness:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

.field public static final enum PhotoRequired:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;


# instance fields
.field private final value:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->Liveness:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->Enabled:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->Disabled:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 7
    .line 8
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->PhotoRequired:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 9
    .line 10
    sget-object v4, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->DocCapture:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 11
    .line 12
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->PassiveLiveness:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "liveness"

    .line 6
    .line 7
    const-string v3, "Liveness"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->Liveness:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 13
    .line 14
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    const-string v2, "enabled"

    .line 18
    .line 19
    const-string v3, "Enabled"

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 23
    .line 24
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->Enabled:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 25
    .line 26
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 27
    const/4 v1, 0x2

    .line 28
    .line 29
    const-string v2, "disabled"

    .line 30
    .line 31
    const-string v3, "Disabled"

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->Disabled:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 37
    .line 38
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 39
    const/4 v1, 0x3

    .line 40
    .line 41
    .line 42
    const-string/jumbo v2, "photoRequired"

    .line 43
    .line 44
    const-string v3, "PhotoRequired"

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 48
    .line 49
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->PhotoRequired:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 50
    .line 51
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 52
    const/4 v1, 0x4

    .line 53
    .line 54
    const-string v2, "docapture"

    .line 55
    .line 56
    const-string v3, "DocCapture"

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 60
    .line 61
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->DocCapture:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 62
    .line 63
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 64
    const/4 v1, 0x5

    .line 65
    .line 66
    .line 67
    const-string/jumbo v2, "passiveLiveness"

    .line 68
    .line 69
    const-string v3, "PassiveLiveness"

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 73
    .line 74
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->PassiveLiveness:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->$values()[Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->$VALUES:[Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 87
    .line 88
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/C3;

    .line 89
    .line 90
    .line 91
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/C3;-><init>()V

    .line 92
    .line 93
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/C3;

    .line 94
    .line 95
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 96
    .line 97
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/h4;

    .line 98
    .line 99
    .line 100
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/data/model/common/h4;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->$cachedSerializer$delegate:Lkotlin/Lazy;

    .line 107
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->value:Ljava/lang/String;

    .line 6
    return-void
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
.end method

.method private static final synthetic _init_$_anonymous_()Ltg0/d;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->values()[Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v5, "docapture"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v6, "passiveLiveness"

    .line 10
    .line 11
    const-string v1, "liveness"

    .line 12
    .line 13
    const-string v2, "enabled"

    .line 14
    .line 15
    const-string v3, "disabled"

    .line 16
    .line 17
    .line 18
    const-string/jumbo v4, "photoRequired"

    .line 19
    .line 20
    .line 21
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    .line 30
    .line 31
    filled-new-array/range {v2 .. v7}, [[Ljava/lang/annotation/Annotation;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    const-string v3, "com.sumsub.sns.internal.features.data.model.common.VideoRequiredType"

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v0, v1, v2, v4}, Lkotlinx/serialization/internal/i0;->a(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ltg0/d;

    .line 38
    move-result-object v0

    .line 39
    return-object v0
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
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->_init_$_anonymous_()Ltg0/d;

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
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->$cachedSerializer$delegate:Lkotlin/Lazy;

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
            "Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

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

.method public static values()[Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->$VALUES:[Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

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


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->value:Ljava/lang/String;

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
