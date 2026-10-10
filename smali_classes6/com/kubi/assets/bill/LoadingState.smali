.class public final enum Lcom/kubi/assets/bill/LoadingState;
.super Ljava/lang/Enum;
.source "AccountBillCommonViewModel.kt"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/assets/bill/LoadingState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\u0008\u0002\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/assets/bill/LoadingState;",
        "",
        "msg",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getMsg",
        "()Ljava/lang/String;",
        "IDLE",
        "LOADING",
        "REFRESHING",
        "LOADING_MORE",
        "LOAD_ERROR",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/kubi/assets/bill/LoadingState;

.field public static final enum IDLE:Lcom/kubi/assets/bill/LoadingState;

.field public static final enum LOADING:Lcom/kubi/assets/bill/LoadingState;

.field public static final enum LOADING_MORE:Lcom/kubi/assets/bill/LoadingState;

.field public static final enum LOAD_ERROR:Lcom/kubi/assets/bill/LoadingState;

.field public static final enum REFRESHING:Lcom/kubi/assets/bill/LoadingState;


# instance fields
.field private final msg:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/kubi/assets/bill/LoadingState;
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/bill/LoadingState;->IDLE:Lcom/kubi/assets/bill/LoadingState;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/bill/LoadingState;->LOADING:Lcom/kubi/assets/bill/LoadingState;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/assets/bill/LoadingState;->REFRESHING:Lcom/kubi/assets/bill/LoadingState;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/assets/bill/LoadingState;->LOADING_MORE:Lcom/kubi/assets/bill/LoadingState;

    .line 9
    .line 10
    sget-object v4, Lcom/kubi/assets/bill/LoadingState;->LOAD_ERROR:Lcom/kubi/assets/bill/LoadingState;

    .line 11
    .line 12
    .line 13
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/kubi/assets/bill/LoadingState;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
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
.end method

.method static constructor <clinit>()V
    .locals 10

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/bill/LoadingState;

    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x0

    .line 5
    .line 6
    const-string v1, "IDLE"

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/kubi/assets/bill/LoadingState;-><init>(Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    sput-object v0, Lcom/kubi/assets/bill/LoadingState;->IDLE:Lcom/kubi/assets/bill/LoadingState;

    .line 14
    .line 15
    new-instance v1, Lcom/kubi/assets/bill/LoadingState;

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    .line 19
    const-string v2, "LOADING"

    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    .line 23
    .line 24
    invoke-direct/range {v1 .. v6}, Lcom/kubi/assets/bill/LoadingState;-><init>(Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 25
    .line 26
    sput-object v1, Lcom/kubi/assets/bill/LoadingState;->LOADING:Lcom/kubi/assets/bill/LoadingState;

    .line 27
    .line 28
    new-instance v2, Lcom/kubi/assets/bill/LoadingState;

    .line 29
    const/4 v6, 0x1

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    const-string v3, "REFRESHING"

    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v2 .. v7}, Lcom/kubi/assets/bill/LoadingState;-><init>(Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    sput-object v2, Lcom/kubi/assets/bill/LoadingState;->REFRESHING:Lcom/kubi/assets/bill/LoadingState;

    .line 40
    .line 41
    new-instance v3, Lcom/kubi/assets/bill/LoadingState;

    .line 42
    const/4 v7, 0x1

    .line 43
    const/4 v8, 0x0

    .line 44
    .line 45
    const-string v4, "LOADING_MORE"

    .line 46
    const/4 v5, 0x3

    .line 47
    const/4 v6, 0x0

    .line 48
    .line 49
    .line 50
    invoke-direct/range {v3 .. v8}, Lcom/kubi/assets/bill/LoadingState;-><init>(Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    sput-object v3, Lcom/kubi/assets/bill/LoadingState;->LOADING_MORE:Lcom/kubi/assets/bill/LoadingState;

    .line 53
    .line 54
    new-instance v4, Lcom/kubi/assets/bill/LoadingState;

    .line 55
    const/4 v8, 0x1

    .line 56
    const/4 v9, 0x0

    .line 57
    .line 58
    const-string v5, "LOAD_ERROR"

    .line 59
    const/4 v6, 0x4

    .line 60
    const/4 v7, 0x0

    .line 61
    .line 62
    .line 63
    invoke-direct/range {v4 .. v9}, Lcom/kubi/assets/bill/LoadingState;-><init>(Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    sput-object v4, Lcom/kubi/assets/bill/LoadingState;->LOAD_ERROR:Lcom/kubi/assets/bill/LoadingState;

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lcom/kubi/assets/bill/LoadingState;->$values()[Lcom/kubi/assets/bill/LoadingState;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    sput-object v0, Lcom/kubi/assets/bill/LoadingState;->$VALUES:[Lcom/kubi/assets/bill/LoadingState;

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    sput-object v0, Lcom/kubi/assets/bill/LoadingState;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 78
    return-void
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
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/kubi/assets/bill/LoadingState;->msg:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/assets/bill/LoadingState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/kubi/assets/bill/LoadingState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/bill/LoadingState;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/assets/bill/LoadingState;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/assets/bill/LoadingState;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/kubi/assets/bill/LoadingState;

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

.method public static values()[Lcom/kubi/assets/bill/LoadingState;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/bill/LoadingState;->$VALUES:[Lcom/kubi/assets/bill/LoadingState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/assets/bill/LoadingState;

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
.end method


# virtual methods
.method public final getMsg()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/bill/LoadingState;->msg:Ljava/lang/String;

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
.end method
