.class public final synthetic Li90/d;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I

.field public static final synthetic $EnumSwitchMapping$2:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->values()[Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    sput-object v0, Li90/d;->$EnumSwitchMapping$0:[I

    .line 10
    .line 11
    sget-object v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->SHAPE:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    aput v2, v0, v1

    .line 19
    .line 20
    sget-object v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->RECT:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 24
    move-result v1

    .line 25
    const/4 v3, 0x2

    .line 26
    .line 27
    aput v3, v0, v1

    .line 28
    .line 29
    sget-object v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->ELLIPSE:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 33
    move-result v1

    .line 34
    const/4 v4, 0x3

    .line 35
    .line 36
    aput v4, v0, v1

    .line 37
    .line 38
    sget-object v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;->KEEP:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeType;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 42
    move-result v1

    .line 43
    const/4 v5, 0x4

    .line 44
    .line 45
    aput v5, v0, v1

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;->values()[Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;

    .line 49
    move-result-object v0

    .line 50
    array-length v0, v0

    .line 51
    .line 52
    new-array v0, v0, [I

    .line 53
    .line 54
    sput-object v0, Li90/d;->$EnumSwitchMapping$1:[I

    .line 55
    .line 56
    sget-object v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;->LineCap_BUTT:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 60
    move-result v1

    .line 61
    .line 62
    aput v2, v0, v1

    .line 63
    .line 64
    sget-object v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;->LineCap_ROUND:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 68
    move-result v1

    .line 69
    .line 70
    aput v3, v0, v1

    .line 71
    .line 72
    sget-object v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;->LineCap_SQUARE:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineCap;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 76
    move-result v1

    .line 77
    .line 78
    aput v4, v0, v1

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;->values()[Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;

    .line 82
    move-result-object v0

    .line 83
    array-length v0, v0

    .line 84
    .line 85
    new-array v0, v0, [I

    .line 86
    .line 87
    sput-object v0, Li90/d;->$EnumSwitchMapping$2:[I

    .line 88
    .line 89
    sget-object v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;->LineJoin_BEVEL:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 93
    move-result v1

    .line 94
    .line 95
    aput v2, v0, v1

    .line 96
    .line 97
    sget-object v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;->LineJoin_MITER:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 101
    move-result v1

    .line 102
    .line 103
    aput v3, v0, v1

    .line 104
    .line 105
    sget-object v1, Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;->LineJoin_ROUND:Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$LineJoin;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 109
    move-result v1

    .line 110
    .line 111
    aput v4, v0, v1

    .line 112
    return-void
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
