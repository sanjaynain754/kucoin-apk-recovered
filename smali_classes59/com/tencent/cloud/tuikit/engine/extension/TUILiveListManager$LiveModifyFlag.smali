.class public final enum Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;
.super Ljava/lang/Enum;
.source "TUILiveListManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LiveModifyFlag"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

.field public static final enum ACTIVITY_STATUS:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

.field public static final enum BACKGROUND_URL:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

.field public static final enum CATEGORY:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

.field public static final enum COVER_URL:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

.field public static final enum DISABLE_MESSAGE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

.field public static final enum NAME:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

.field public static final enum NONE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

.field public static final enum NOTICE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

.field public static final enum PUBLISH:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

.field public static final enum SEAT_LAYOUT_TEMPLATE_ID:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

.field public static final enum TAKE_SEAT_MODE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;


# instance fields
.field mValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 3
    .line 4
    const-string v1, "NONE"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->NONE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 11
    .line 12
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 13
    .line 14
    const-string v2, "NAME"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3, v3}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->NAME:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 21
    .line 22
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 23
    .line 24
    const-string v3, "NOTICE"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4, v4}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->NOTICE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 31
    .line 32
    new-instance v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 33
    .line 34
    const-string v4, "DISABLE_MESSAGE"

    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x4

    .line 37
    .line 38
    .line 39
    invoke-direct {v3, v4, v5, v6}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;-><init>(Ljava/lang/String;II)V

    .line 40
    .line 41
    sput-object v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->DISABLE_MESSAGE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 42
    .line 43
    new-instance v4, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 44
    .line 45
    const-string v5, "PUBLISH"

    .line 46
    .line 47
    const/16 v7, 0x20

    .line 48
    .line 49
    .line 50
    invoke-direct {v4, v5, v6, v7}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;-><init>(Ljava/lang/String;II)V

    .line 51
    .line 52
    sput-object v4, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->PUBLISH:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 53
    .line 54
    new-instance v5, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 55
    const/4 v6, 0x5

    .line 56
    .line 57
    const/16 v7, 0x40

    .line 58
    .line 59
    const-string v8, "TAKE_SEAT_MODE"

    .line 60
    .line 61
    .line 62
    invoke-direct {v5, v8, v6, v7}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;-><init>(Ljava/lang/String;II)V

    .line 63
    .line 64
    sput-object v5, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->TAKE_SEAT_MODE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 65
    .line 66
    new-instance v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 67
    const/4 v7, 0x6

    .line 68
    .line 69
    const/16 v8, 0x80

    .line 70
    .line 71
    const-string v9, "COVER_URL"

    .line 72
    .line 73
    .line 74
    invoke-direct {v6, v9, v7, v8}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;-><init>(Ljava/lang/String;II)V

    .line 75
    .line 76
    sput-object v6, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->COVER_URL:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 77
    .line 78
    new-instance v7, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 79
    const/4 v8, 0x7

    .line 80
    .line 81
    const/16 v9, 0x100

    .line 82
    .line 83
    const-string v10, "BACKGROUND_URL"

    .line 84
    .line 85
    .line 86
    invoke-direct {v7, v10, v8, v9}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;-><init>(Ljava/lang/String;II)V

    .line 87
    .line 88
    sput-object v7, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->BACKGROUND_URL:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 89
    .line 90
    new-instance v8, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 91
    .line 92
    const/16 v9, 0x8

    .line 93
    .line 94
    const/16 v10, 0x200

    .line 95
    .line 96
    const-string v11, "CATEGORY"

    .line 97
    .line 98
    .line 99
    invoke-direct {v8, v11, v9, v10}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;-><init>(Ljava/lang/String;II)V

    .line 100
    .line 101
    sput-object v8, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->CATEGORY:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 102
    .line 103
    new-instance v9, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 104
    .line 105
    const/16 v10, 0x9

    .line 106
    .line 107
    const/16 v11, 0x400

    .line 108
    .line 109
    const-string v12, "ACTIVITY_STATUS"

    .line 110
    .line 111
    .line 112
    invoke-direct {v9, v12, v10, v11}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;-><init>(Ljava/lang/String;II)V

    .line 113
    .line 114
    sput-object v9, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->ACTIVITY_STATUS:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 115
    .line 116
    new-instance v10, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 117
    .line 118
    const/16 v11, 0xa

    .line 119
    .line 120
    const/16 v12, 0x800

    .line 121
    .line 122
    const-string v13, "SEAT_LAYOUT_TEMPLATE_ID"

    .line 123
    .line 124
    .line 125
    invoke-direct {v10, v13, v11, v12}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;-><init>(Ljava/lang/String;II)V

    .line 126
    .line 127
    sput-object v10, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->SEAT_LAYOUT_TEMPLATE_ID:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 128
    .line 129
    .line 130
    filled-new-array/range {v0 .. v10}, [Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    sput-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->$VALUES:[Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 134
    return-void
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

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->mValue:I

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

.method public static fromInt(I)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->values()[Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v3, v0, v2

    .line 11
    .line 12
    iget v4, v3, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->mValue:I

    .line 13
    .line 14
    if-ne v4, p0, :cond_0

    .line 15
    return-object v3

    .line 16
    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_1
    sget-object p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->NONE:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

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

.method public static values()[Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->$VALUES:[Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;

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
.method public getValue()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveModifyFlag;->mValue:I

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
.end method
