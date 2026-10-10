.class public Lcom/tencent/bugly/proguard/e6;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_FdLeak_Analyzer"

.field public static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "[",
            "Lcom/tencent/bugly/proguard/v8;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:[Lcom/tencent/bugly/proguard/u8;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/e6;->b:Ljava/util/Map;

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    new-instance v3, Lcom/tencent/bugly/proguard/q5;

    .line 15
    .line 16
    .line 17
    invoke-direct {v3}, Lcom/tencent/bugly/proguard/q5;-><init>()V

    .line 18
    .line 19
    new-instance v4, Lcom/tencent/bugly/proguard/q6;

    .line 20
    .line 21
    .line 22
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/q6;-><init>()V

    .line 23
    .line 24
    new-instance v5, Lcom/tencent/bugly/proguard/w6;

    .line 25
    .line 26
    .line 27
    invoke-direct {v5}, Lcom/tencent/bugly/proguard/w6;-><init>()V

    .line 28
    .line 29
    new-instance v6, Lcom/tencent/bugly/proguard/a6;

    .line 30
    .line 31
    .line 32
    invoke-direct {v6}, Lcom/tencent/bugly/proguard/a6;-><init>()V

    .line 33
    .line 34
    new-instance v7, Lcom/tencent/bugly/proguard/r5;

    .line 35
    .line 36
    .line 37
    invoke-direct {v7}, Lcom/tencent/bugly/proguard/r5;-><init>()V

    .line 38
    .line 39
    new-instance v8, Lcom/tencent/bugly/proguard/x5;

    .line 40
    .line 41
    .line 42
    invoke-direct {v8}, Lcom/tencent/bugly/proguard/x5;-><init>()V

    .line 43
    .line 44
    new-instance v9, Lcom/tencent/bugly/proguard/y5;

    .line 45
    .line 46
    .line 47
    invoke-direct {v9}, Lcom/tencent/bugly/proguard/y5;-><init>()V

    .line 48
    .line 49
    new-instance v10, Lcom/tencent/bugly/proguard/t6;

    .line 50
    .line 51
    .line 52
    invoke-direct {v10}, Lcom/tencent/bugly/proguard/t6;-><init>()V

    .line 53
    .line 54
    new-instance v11, Lcom/tencent/bugly/proguard/r6;

    .line 55
    .line 56
    .line 57
    invoke-direct {v11}, Lcom/tencent/bugly/proguard/r6;-><init>()V

    .line 58
    .line 59
    const/16 v12, 0x9

    .line 60
    .line 61
    new-array v12, v12, [Lcom/tencent/bugly/proguard/v8;

    .line 62
    const/4 v13, 0x0

    .line 63
    .line 64
    aput-object v3, v12, v13

    .line 65
    .line 66
    aput-object v4, v12, v1

    .line 67
    const/4 v3, 0x2

    .line 68
    .line 69
    aput-object v5, v12, v3

    .line 70
    const/4 v4, 0x3

    .line 71
    .line 72
    aput-object v6, v12, v4

    .line 73
    const/4 v5, 0x4

    .line 74
    .line 75
    aput-object v7, v12, v5

    .line 76
    const/4 v5, 0x5

    .line 77
    .line 78
    aput-object v8, v12, v5

    .line 79
    const/4 v5, 0x6

    .line 80
    .line 81
    aput-object v9, v12, v5

    .line 82
    const/4 v5, 0x7

    .line 83
    .line 84
    aput-object v10, v12, v5

    .line 85
    .line 86
    const/16 v5, 0x8

    .line 87
    .line 88
    aput-object v11, v12, v5

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v2, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    move-result-object v2

    .line 96
    .line 97
    new-instance v5, Lcom/tencent/bugly/proguard/z5;

    .line 98
    .line 99
    .line 100
    invoke-direct {v5}, Lcom/tencent/bugly/proguard/z5;-><init>()V

    .line 101
    .line 102
    new-array v6, v1, [Lcom/tencent/bugly/proguard/v8;

    .line 103
    .line 104
    aput-object v5, v6, v13

    .line 105
    .line 106
    .line 107
    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    new-instance v0, Lcom/tencent/bugly/proguard/w5;

    .line 110
    .line 111
    .line 112
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/w5;-><init>()V

    .line 113
    .line 114
    new-instance v2, Lcom/tencent/bugly/proguard/z6;

    .line 115
    .line 116
    .line 117
    invoke-direct {v2}, Lcom/tencent/bugly/proguard/z6;-><init>()V

    .line 118
    .line 119
    new-instance v5, Lcom/tencent/bugly/proguard/u6;

    .line 120
    .line 121
    .line 122
    invoke-direct {v5}, Lcom/tencent/bugly/proguard/u6;-><init>()V

    .line 123
    .line 124
    new-array v4, v4, [Lcom/tencent/bugly/proguard/u8;

    .line 125
    .line 126
    aput-object v0, v4, v13

    .line 127
    .line 128
    aput-object v2, v4, v1

    .line 129
    .line 130
    aput-object v5, v4, v3

    .line 131
    .line 132
    sput-object v4, Lcom/tencent/bugly/proguard/e6;->c:[Lcom/tencent/bugly/proguard/u8;

    .line 133
    return-void
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
.end method

.method public static a()[Lcom/tencent/bugly/proguard/u8;
    .locals 1

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/e6;->c:[Lcom/tencent/bugly/proguard/u8;

    return-object v0
.end method

.method public static a(I)[Lcom/tencent/bugly/proguard/v8;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/e6;->b:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lcom/tencent/bugly/proguard/v8;

    return-object p0
.end method


# virtual methods
.method public a(IILcom/tencent/bugly/proguard/i6;Lcom/tencent/bugly/proguard/s8;)V
    .locals 5

    if-eqz p4, :cond_0

    .line 3
    invoke-interface {p4}, Lcom/tencent/bugly/proguard/s8;->b()V

    .line 4
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance v1, Lcom/tencent/bugly/proguard/k6;

    invoke-direct {v1, p1, p2}, Lcom/tencent/bugly/proguard/k6;-><init>(II)V

    .line 7
    iput-object v0, v1, Lcom/tencent/bugly/proguard/k6;->r:Ljava/util/List;

    .line 8
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/s5;->c()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 9
    invoke-static {p1}, Lcom/tencent/bugly/proguard/e6;->a(I)[Lcom/tencent/bugly/proguard/v8;

    move-result-object p1

    array-length v2, p1

    move v3, p2

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, p1, v3

    .line 10
    invoke-virtual {p0, v4, v1, p3}, Lcom/tencent/bugly/proguard/e6;->a(Lcom/tencent/bugly/proguard/v8;Lcom/tencent/bugly/proguard/k6;Lcom/tencent/bugly/proguard/i6;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    .line 11
    invoke-static {p1, p4}, Lcom/tencent/bugly/proguard/h6;->a(ILcom/tencent/bugly/proguard/w8;)Lcom/tencent/bugly/proguard/i6;

    move-result-object p3

    .line 12
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/s5;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 14
    invoke-static {p1}, Lcom/tencent/bugly/proguard/e6;->a(I)[Lcom/tencent/bugly/proguard/v8;

    move-result-object p1

    array-length v2, p1

    :goto_1
    if-ge p2, v2, :cond_2

    aget-object v3, p1, p2

    .line 15
    invoke-virtual {p0, v3, v1, p3}, Lcom/tencent/bugly/proguard/e6;->a(Lcom/tencent/bugly/proguard/v8;Lcom/tencent/bugly/proguard/k6;Lcom/tencent/bugly/proguard/i6;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 16
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->f()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x4

    .line 17
    invoke-static {p1, p4}, Lcom/tencent/bugly/proguard/h6;->a(ILcom/tencent/bugly/proguard/w8;)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    :cond_3
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x3

    .line 20
    invoke-static {p1, p4}, Lcom/tencent/bugly/proguard/h6;->a(ILcom/tencent/bugly/proguard/w8;)Lcom/tencent/bugly/proguard/i6;

    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    :cond_4
    invoke-interface {p4, v1}, Lcom/tencent/bugly/proguard/s8;->a(Lcom/tencent/bugly/proguard/k6;)V

    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/v8;Lcom/tencent/bugly/proguard/k6;Lcom/tencent/bugly/proguard/i6;)V
    .locals 0

    .line 23
    invoke-interface {p1, p3}, Lcom/tencent/bugly/proguard/v8;->a(Lcom/tencent/bugly/proguard/i6;)Lcom/tencent/bugly/proguard/j6;

    move-result-object p1

    .line 24
    invoke-virtual {p2, p1}, Lcom/tencent/bugly/proguard/k6;->a(Lcom/tencent/bugly/proguard/j6;)V

    return-void
.end method
