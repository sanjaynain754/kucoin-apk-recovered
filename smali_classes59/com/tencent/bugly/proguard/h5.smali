.class public final Lcom/tencent/bugly/proguard/h5;
.super Lcom/tencent/bugly/proguard/JceStruct;
.source "BUGLY"


# static fields
.field public static L:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static M:Lcom/tencent/bugly/proguard/i0;

.field public static N:Lcom/tencent/bugly/proguard/w;

.field public static O:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/w;",
            ">;"
        }
    .end annotation
.end field

.field public static P:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/w;",
            ">;"
        }
    .end annotation
.end field

.field public static Q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;"
        }
    .end annotation
.end field

.field public static R:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static S:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:I

.field public B:Ljava/lang/String;

.field public C:Ljava/lang/String;

.field public D:Lcom/tencent/bugly/proguard/w;

.field public E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/w;",
            ">;"
        }
    .end annotation
.end field

.field public F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/w;",
            ">;"
        }
    .end annotation
.end field

.field public G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;"
        }
    .end annotation
.end field

.field public H:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public I:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public J:Ljava/lang/String;

.field public K:Z

.field public q:Ljava/lang/String;

.field public r:J

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;

.field public v:Ljava/lang/String;

.field public w:Ljava/lang/String;

.field public x:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public y:Ljava/lang/String;

.field public z:Lcom/tencent/bugly/proguard/i0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/h5;->L:Ljava/util/Map;

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v0, Lcom/tencent/bugly/proguard/i0;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/i0;-><init>()V

    .line 18
    .line 19
    sput-object v0, Lcom/tencent/bugly/proguard/h5;->M:Lcom/tencent/bugly/proguard/i0;

    .line 20
    .line 21
    new-instance v0, Lcom/tencent/bugly/proguard/w;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/w;-><init>()V

    .line 25
    .line 26
    sput-object v0, Lcom/tencent/bugly/proguard/h5;->N:Lcom/tencent/bugly/proguard/w;

    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    sput-object v0, Lcom/tencent/bugly/proguard/h5;->O:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance v0, Lcom/tencent/bugly/proguard/w;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/w;-><init>()V

    .line 39
    .line 40
    sget-object v2, Lcom/tencent/bugly/proguard/h5;->O:Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    sput-object v0, Lcom/tencent/bugly/proguard/h5;->P:Ljava/util/ArrayList;

    .line 51
    .line 52
    new-instance v0, Lcom/tencent/bugly/proguard/w;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/w;-><init>()V

    .line 56
    .line 57
    sget-object v2, Lcom/tencent/bugly/proguard/h5;->P:Ljava/util/ArrayList;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    new-instance v0, Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    sput-object v0, Lcom/tencent/bugly/proguard/h5;->Q:Ljava/util/ArrayList;

    .line 68
    .line 69
    new-instance v0, Lcom/tencent/bugly/proguard/s0;

    .line 70
    .line 71
    .line 72
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/s0;-><init>()V

    .line 73
    .line 74
    sget-object v2, Lcom/tencent/bugly/proguard/h5;->Q:Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    new-instance v0, Ljava/util/HashMap;

    .line 80
    .line 81
    .line 82
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 83
    .line 84
    sput-object v0, Lcom/tencent/bugly/proguard/h5;->R:Ljava/util/Map;

    .line 85
    .line 86
    .line 87
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    new-instance v0, Ljava/util/HashMap;

    .line 90
    .line 91
    .line 92
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 93
    .line 94
    sput-object v0, Lcom/tencent/bugly/proguard/h5;->S:Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    return-void
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

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/bugly/proguard/h5;->q:Ljava/lang/String;

    const-wide/16 v1, 0x0

    .line 3
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/h5;->r:J

    .line 4
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h5;->s:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h5;->t:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h5;->u:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h5;->v:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h5;->w:Ljava/lang/String;

    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->x:Ljava/util/Map;

    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h5;->y:Ljava/lang/String;

    .line 11
    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->z:Lcom/tencent/bugly/proguard/i0;

    const/4 v2, 0x0

    .line 12
    iput v2, p0, Lcom/tencent/bugly/proguard/h5;->A:I

    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h5;->B:Ljava/lang/String;

    .line 14
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h5;->C:Ljava/lang/String;

    .line 15
    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->D:Lcom/tencent/bugly/proguard/w;

    .line 16
    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->E:Ljava/util/ArrayList;

    .line 17
    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->F:Ljava/util/ArrayList;

    .line 18
    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->G:Ljava/util/ArrayList;

    .line 19
    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->H:Ljava/util/Map;

    .line 20
    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->I:Ljava/util/Map;

    .line 21
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h5;->J:Ljava/lang/String;

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/h5;->K:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/tencent/bugly/proguard/i0;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/w;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/i0;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/w;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/w;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/w;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/s0;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/JceStruct;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/tencent/bugly/proguard/h5;->q:Ljava/lang/String;

    .line 25
    iput-wide p2, p0, Lcom/tencent/bugly/proguard/h5;->r:J

    .line 26
    iput-object p4, p0, Lcom/tencent/bugly/proguard/h5;->s:Ljava/lang/String;

    .line 27
    iput-object p5, p0, Lcom/tencent/bugly/proguard/h5;->t:Ljava/lang/String;

    .line 28
    iput-object p6, p0, Lcom/tencent/bugly/proguard/h5;->u:Ljava/lang/String;

    .line 29
    iput-object p7, p0, Lcom/tencent/bugly/proguard/h5;->v:Ljava/lang/String;

    .line 30
    iput-object p8, p0, Lcom/tencent/bugly/proguard/h5;->w:Ljava/lang/String;

    .line 31
    iput-object p9, p0, Lcom/tencent/bugly/proguard/h5;->x:Ljava/util/Map;

    .line 32
    iput-object p10, p0, Lcom/tencent/bugly/proguard/h5;->y:Ljava/lang/String;

    .line 33
    iput-object p11, p0, Lcom/tencent/bugly/proguard/h5;->z:Lcom/tencent/bugly/proguard/i0;

    .line 34
    iput p12, p0, Lcom/tencent/bugly/proguard/h5;->A:I

    .line 35
    iput-object p13, p0, Lcom/tencent/bugly/proguard/h5;->B:Ljava/lang/String;

    .line 36
    iput-object p14, p0, Lcom/tencent/bugly/proguard/h5;->C:Ljava/lang/String;

    .line 37
    iput-object p15, p0, Lcom/tencent/bugly/proguard/h5;->D:Lcom/tencent/bugly/proguard/w;

    move-object/from16 p1, p16

    .line 38
    iput-object p1, p0, Lcom/tencent/bugly/proguard/h5;->E:Ljava/util/ArrayList;

    move-object/from16 p1, p17

    .line 39
    iput-object p1, p0, Lcom/tencent/bugly/proguard/h5;->F:Ljava/util/ArrayList;

    move-object/from16 p1, p18

    .line 40
    iput-object p1, p0, Lcom/tencent/bugly/proguard/h5;->G:Ljava/util/ArrayList;

    move-object/from16 p1, p19

    .line 41
    iput-object p1, p0, Lcom/tencent/bugly/proguard/h5;->H:Ljava/util/Map;

    move-object/from16 p1, p20

    .line 42
    iput-object p1, p0, Lcom/tencent/bugly/proguard/h5;->I:Ljava/util/Map;

    move-object/from16 p1, p21

    .line 43
    iput-object p1, p0, Lcom/tencent/bugly/proguard/h5;->J:Ljava/lang/String;

    move/from16 p1, p22

    .line 44
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/h5;->K:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/ka;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 38
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/tencent/bugly/proguard/h5;->q:Ljava/lang/String;

    .line 39
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/h5;->r:J

    invoke-virtual {p1, v2, v3, v1, v1}, Lcom/tencent/bugly/proguard/ka;->a(JIZ)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/tencent/bugly/proguard/h5;->r:J

    const/4 v2, 0x2

    .line 40
    invoke-virtual {p1, v2, v1}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->s:Ljava/lang/String;

    const/4 v1, 0x3

    .line 41
    invoke-virtual {p1, v1, v0}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->t:Ljava/lang/String;

    const/4 v1, 0x4

    .line 42
    invoke-virtual {p1, v1, v0}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->u:Ljava/lang/String;

    const/4 v1, 0x5

    .line 43
    invoke-virtual {p1, v1, v0}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->v:Ljava/lang/String;

    const/4 v1, 0x6

    .line 44
    invoke-virtual {p1, v1, v0}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->w:Ljava/lang/String;

    .line 45
    sget-object v1, Lcom/tencent/bugly/proguard/h5;->L:Ljava/util/Map;

    const/4 v2, 0x7

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->x:Ljava/util/Map;

    const/16 v1, 0x8

    .line 46
    invoke-virtual {p1, v1, v0}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->y:Ljava/lang/String;

    .line 47
    sget-object v1, Lcom/tencent/bugly/proguard/h5;->M:Lcom/tencent/bugly/proguard/i0;

    const/16 v2, 0x9

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/ka;->b(Lcom/tencent/bugly/proguard/JceStruct;IZ)Lcom/tencent/bugly/proguard/JceStruct;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/i0;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->z:Lcom/tencent/bugly/proguard/i0;

    .line 48
    iget v1, p0, Lcom/tencent/bugly/proguard/h5;->A:I

    const/16 v2, 0xa

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/ka;->a(IIZ)I

    move-result v1

    iput v1, p0, Lcom/tencent/bugly/proguard/h5;->A:I

    const/16 v1, 0xb

    .line 49
    invoke-virtual {p1, v1, v0}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->B:Ljava/lang/String;

    const/16 v1, 0xc

    .line 50
    invoke-virtual {p1, v1, v0}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->C:Ljava/lang/String;

    .line 51
    sget-object v1, Lcom/tencent/bugly/proguard/h5;->N:Lcom/tencent/bugly/proguard/w;

    const/16 v2, 0xd

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/ka;->b(Lcom/tencent/bugly/proguard/JceStruct;IZ)Lcom/tencent/bugly/proguard/JceStruct;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/w;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->D:Lcom/tencent/bugly/proguard/w;

    .line 52
    sget-object v1, Lcom/tencent/bugly/proguard/h5;->O:Ljava/util/ArrayList;

    const/16 v2, 0xe

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->E:Ljava/util/ArrayList;

    .line 53
    sget-object v1, Lcom/tencent/bugly/proguard/h5;->P:Ljava/util/ArrayList;

    const/16 v2, 0xf

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->F:Ljava/util/ArrayList;

    .line 54
    sget-object v1, Lcom/tencent/bugly/proguard/h5;->Q:Ljava/util/ArrayList;

    const/16 v2, 0x10

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->G:Ljava/util/ArrayList;

    .line 55
    sget-object v1, Lcom/tencent/bugly/proguard/h5;->R:Ljava/util/Map;

    const/16 v2, 0x11

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->H:Ljava/util/Map;

    .line 56
    sget-object v1, Lcom/tencent/bugly/proguard/h5;->S:Ljava/util/Map;

    const/16 v2, 0x12

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->I:Ljava/util/Map;

    const/16 v1, 0x13

    .line 57
    invoke-virtual {p1, v1, v0}, Lcom/tencent/bugly/proguard/ka;->b(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/h5;->J:Ljava/lang/String;

    .line 58
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/h5;->K:Z

    const/16 v2, 0x14

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/ka;->a(ZIZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/h5;->K:Z

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/la;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->q:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/h5;->r:J

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/la;->a(JI)V

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->s:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->t:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    .line 5
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->u:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v1, 0x4

    .line 7
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->v:Ljava/lang/String;

    if-eqz v0, :cond_2

    const/4 v1, 0x5

    .line 9
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->w:Ljava/lang/String;

    if-eqz v0, :cond_3

    const/4 v1, 0x6

    .line 11
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->x:Ljava/util/Map;

    if-eqz v0, :cond_4

    const/4 v1, 0x7

    .line 13
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    .line 14
    :cond_4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->y:Ljava/lang/String;

    if-eqz v0, :cond_5

    const/16 v1, 0x8

    .line 15
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 16
    :cond_5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->z:Lcom/tencent/bugly/proguard/i0;

    if-eqz v0, :cond_6

    const/16 v1, 0x9

    .line 17
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Lcom/tencent/bugly/proguard/JceStruct;I)V

    .line 18
    :cond_6
    iget v0, p0, Lcom/tencent/bugly/proguard/h5;->A:I

    const/16 v1, 0xa

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 19
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->B:Ljava/lang/String;

    if-eqz v0, :cond_7

    const/16 v1, 0xb

    .line 20
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 21
    :cond_7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->C:Ljava/lang/String;

    if-eqz v0, :cond_8

    const/16 v1, 0xc

    .line 22
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 23
    :cond_8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->D:Lcom/tencent/bugly/proguard/w;

    if-eqz v0, :cond_9

    const/16 v1, 0xd

    .line 24
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Lcom/tencent/bugly/proguard/JceStruct;I)V

    .line 25
    :cond_9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->E:Ljava/util/ArrayList;

    if-eqz v0, :cond_a

    const/16 v1, 0xe

    .line 26
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Collection;I)V

    .line 27
    :cond_a
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->F:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    const/16 v1, 0xf

    .line 28
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Collection;I)V

    .line 29
    :cond_b
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->G:Ljava/util/ArrayList;

    if-eqz v0, :cond_c

    const/16 v1, 0x10

    .line 30
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Collection;I)V

    .line 31
    :cond_c
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->H:Ljava/util/Map;

    if-eqz v0, :cond_d

    const/16 v1, 0x11

    .line 32
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    .line 33
    :cond_d
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->I:Ljava/util/Map;

    if-eqz v0, :cond_e

    const/16 v1, 0x12

    .line 34
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    .line 35
    :cond_e
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h5;->J:Ljava/lang/String;

    if-eqz v0, :cond_f

    const/16 v1, 0x13

    .line 36
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    .line 37
    :cond_f
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/h5;->K:Z

    const/16 v1, 0x14

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(ZI)V

    return-void
.end method
