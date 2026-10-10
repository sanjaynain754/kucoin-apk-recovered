.class public final enum Lcom/sumsub/sns/core/theme/SNSTypographyElement;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/theme/SNSTypographyElement$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sns/core/theme/SNSTypographyElement;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/sumsub/sns/core/theme/SNSTypographyElement;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "BODY",
        "CAPTION",
        "HEADLINE1",
        "HEADLINE2",
        "SUBTITLE1",
        "SUBTITLE2",
        "Companion",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSTypographyElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSTypographyElement.kt\ncom/sumsub/sns/core/theme/SNSTypographyElement\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n11228#2:18\n11563#2,3:19\n*S KotlinDebug\n*F\n+ 1 SNSTypographyElement.kt\ncom/sumsub/sns/core/theme/SNSTypographyElement\n*L\n14#1:18\n14#1:19,3\n*E\n"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sumsub/sns/core/theme/SNSTypographyElement;

.field public static final enum BODY:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

.field public static final enum CAPTION:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

.field public static final Companion:Lcom/sumsub/sns/core/theme/SNSTypographyElement$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum HEADLINE1:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

.field public static final enum HEADLINE2:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

.field public static final enum SUBTITLE1:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

.field public static final enum SUBTITLE2:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

.field private static final names:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final value:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sns/core/theme/SNSTypographyElement;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->BODY:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->CAPTION:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->HEADLINE1:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 7
    .line 8
    sget-object v3, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->HEADLINE2:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 9
    .line 10
    sget-object v4, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->SUBTITLE1:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 11
    .line 12
    sget-object v5, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->SUBTITLE2:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 3
    .line 4
    const-string v1, "body"

    .line 5
    .line 6
    const-string v2, "BODY"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v2, v3, v1}, Lcom/sumsub/sns/core/theme/SNSTypographyElement;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->BODY:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 13
    .line 14
    new-instance v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    const-string v2, "caption"

    .line 18
    .line 19
    const-string v4, "CAPTION"

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v4, v1, v2}, Lcom/sumsub/sns/core/theme/SNSTypographyElement;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 23
    .line 24
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->CAPTION:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 25
    .line 26
    new-instance v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 27
    const/4 v1, 0x2

    .line 28
    .line 29
    const-string v2, "headline1"

    .line 30
    .line 31
    const-string v4, "HEADLINE1"

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v4, v1, v2}, Lcom/sumsub/sns/core/theme/SNSTypographyElement;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->HEADLINE1:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 37
    .line 38
    new-instance v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 39
    const/4 v1, 0x3

    .line 40
    .line 41
    const-string v2, "headline2"

    .line 42
    .line 43
    const-string v4, "HEADLINE2"

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v4, v1, v2}, Lcom/sumsub/sns/core/theme/SNSTypographyElement;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 47
    .line 48
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->HEADLINE2:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 49
    .line 50
    new-instance v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 51
    const/4 v1, 0x4

    .line 52
    .line 53
    .line 54
    const-string/jumbo v2, "subtitle1"

    .line 55
    .line 56
    const-string v4, "SUBTITLE1"

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v4, v1, v2}, Lcom/sumsub/sns/core/theme/SNSTypographyElement;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 60
    .line 61
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->SUBTITLE1:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 62
    .line 63
    new-instance v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 64
    const/4 v1, 0x5

    .line 65
    .line 66
    .line 67
    const-string/jumbo v2, "subtitle2"

    .line 68
    .line 69
    const-string v4, "SUBTITLE2"

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v4, v1, v2}, Lcom/sumsub/sns/core/theme/SNSTypographyElement;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 73
    .line 74
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->SUBTITLE2:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->$values()[Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->$VALUES:[Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 87
    .line 88
    new-instance v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement$Companion;

    .line 89
    const/4 v1, 0x0

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/theme/SNSTypographyElement$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    .line 94
    sput-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->Companion:Lcom/sumsub/sns/core/theme/SNSTypographyElement$Companion;

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->values()[Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    new-instance v1, Ljava/util/ArrayList;

    .line 101
    array-length v2, v0

    .line 102
    .line 103
    .line 104
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    array-length v2, v0

    .line 106
    .line 107
    :goto_0
    if-ge v3, v2, :cond_0

    .line 108
    .line 109
    aget-object v4, v0, v3

    .line 110
    .line 111
    iget-object v4, v4, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->value:Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    add-int/lit8 v3, v3, 0x1

    .line 117
    goto :goto_0

    .line 118
    .line 119
    :cond_0
    sput-object v1, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->names:Ljava/util/List;

    .line 120
    return-void
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
    iput-object p3, p0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->value:Ljava/lang/String;

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

.method public static final synthetic access$getNames$cp()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->names:Ljava/util/List;

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
            "Lcom/sumsub/sns/core/theme/SNSTypographyElement;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sns/core/theme/SNSTypographyElement;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;

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

.method public static values()[Lcom/sumsub/sns/core/theme/SNSTypographyElement;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->$VALUES:[Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sns/core/theme/SNSTypographyElement;

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
    iget-object v0, p0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->value:Ljava/lang/String;

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
