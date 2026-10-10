.class public final Lcom/sumsub/sentry/x;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device.kt\ncom/sumsub/sentry/Device\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"
    }
.end annotation

.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sentry/v;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final F:[Lkotlin/Lazy;


# instance fields
.field public A:Ljava/lang/String;

.field public B:Ljava/lang/String;

.field public C:Ljava/lang/String;

.field public D:Ljava/lang/String;

.field public E:Ljava/lang/Float;

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public g:[Ljava/lang/String;

.field public h:Ljava/lang/Float;

.field public i:Ljava/lang/Boolean;

.field public j:Ljava/lang/Boolean;

.field public final k:Lcom/sumsub/sentry/Device$DeviceOrientation;

.field public l:Ljava/lang/Boolean;

.field public m:Ljava/lang/Long;

.field public n:Ljava/lang/Long;

.field public final o:Ljava/lang/Long;

.field public p:Ljava/lang/Boolean;

.field public q:Ljava/lang/Long;

.field public r:Ljava/lang/Long;

.field public s:Ljava/lang/Long;

.field public t:Ljava/lang/Long;

.field public u:Ljava/lang/Integer;

.field public v:Ljava/lang/Integer;

.field public w:Ljava/lang/Float;

.field public x:Ljava/lang/Integer;

.field public y:Ljava/util/Date;

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/v;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/v;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/x;->Companion:Lcom/sumsub/sentry/v;

    .line 8
    .line 9
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sentry/u2;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sentry/u2;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    new-instance v2, Lcom/sumsub/sentry/v2;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2}, Lcom/sumsub/sentry/v2;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    new-instance v3, Lcom/sumsub/sentry/w2;

    .line 30
    .line 31
    .line 32
    invoke-direct {v3}, Lcom/sumsub/sentry/w2;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    const/16 v3, 0x1f

    .line 39
    .line 40
    new-array v3, v3, [Lkotlin/Lazy;

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    .line 44
    aput-object v4, v3, v5

    .line 45
    const/4 v5, 0x1

    .line 46
    .line 47
    aput-object v4, v3, v5

    .line 48
    const/4 v5, 0x2

    .line 49
    .line 50
    aput-object v4, v3, v5

    .line 51
    const/4 v5, 0x3

    .line 52
    .line 53
    aput-object v4, v3, v5

    .line 54
    const/4 v5, 0x4

    .line 55
    .line 56
    aput-object v4, v3, v5

    .line 57
    const/4 v5, 0x5

    .line 58
    .line 59
    aput-object v4, v3, v5

    .line 60
    const/4 v5, 0x6

    .line 61
    .line 62
    aput-object v1, v3, v5

    .line 63
    const/4 v1, 0x7

    .line 64
    .line 65
    aput-object v4, v3, v1

    .line 66
    .line 67
    const/16 v1, 0x8

    .line 68
    .line 69
    aput-object v4, v3, v1

    .line 70
    .line 71
    const/16 v1, 0x9

    .line 72
    .line 73
    aput-object v4, v3, v1

    .line 74
    .line 75
    const/16 v1, 0xa

    .line 76
    .line 77
    aput-object v2, v3, v1

    .line 78
    .line 79
    const/16 v1, 0xb

    .line 80
    .line 81
    aput-object v4, v3, v1

    .line 82
    .line 83
    const/16 v1, 0xc

    .line 84
    .line 85
    aput-object v4, v3, v1

    .line 86
    .line 87
    const/16 v1, 0xd

    .line 88
    .line 89
    aput-object v4, v3, v1

    .line 90
    .line 91
    const/16 v1, 0xe

    .line 92
    .line 93
    aput-object v4, v3, v1

    .line 94
    .line 95
    const/16 v1, 0xf

    .line 96
    .line 97
    aput-object v4, v3, v1

    .line 98
    .line 99
    const/16 v1, 0x10

    .line 100
    .line 101
    aput-object v4, v3, v1

    .line 102
    .line 103
    const/16 v1, 0x11

    .line 104
    .line 105
    aput-object v4, v3, v1

    .line 106
    .line 107
    const/16 v1, 0x12

    .line 108
    .line 109
    aput-object v4, v3, v1

    .line 110
    .line 111
    const/16 v1, 0x13

    .line 112
    .line 113
    aput-object v4, v3, v1

    .line 114
    .line 115
    const/16 v1, 0x14

    .line 116
    .line 117
    aput-object v4, v3, v1

    .line 118
    .line 119
    const/16 v1, 0x15

    .line 120
    .line 121
    aput-object v4, v3, v1

    .line 122
    .line 123
    const/16 v1, 0x16

    .line 124
    .line 125
    aput-object v4, v3, v1

    .line 126
    .line 127
    const/16 v1, 0x17

    .line 128
    .line 129
    aput-object v4, v3, v1

    .line 130
    .line 131
    const/16 v1, 0x18

    .line 132
    .line 133
    aput-object v0, v3, v1

    .line 134
    .line 135
    const/16 v0, 0x19

    .line 136
    .line 137
    aput-object v4, v3, v0

    .line 138
    .line 139
    const/16 v0, 0x1a

    .line 140
    .line 141
    aput-object v4, v3, v0

    .line 142
    .line 143
    const/16 v0, 0x1b

    .line 144
    .line 145
    aput-object v4, v3, v0

    .line 146
    .line 147
    const/16 v0, 0x1c

    .line 148
    .line 149
    aput-object v4, v3, v0

    .line 150
    .line 151
    const/16 v0, 0x1d

    .line 152
    .line 153
    aput-object v4, v3, v0

    .line 154
    .line 155
    const/16 v0, 0x1e

    .line 156
    .line 157
    aput-object v4, v3, v0

    .line 158
    .line 159
    sput-object v3, Lcom/sumsub/sentry/x;->F:[Lkotlin/Lazy;

    .line 160
    return-void
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

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sumsub/sentry/Device$DeviceOrientation;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/sumsub/sentry/x;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/sumsub/sentry/x;->a:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v1, p0, Lcom/sumsub/sentry/x;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/sumsub/sentry/x;->b:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/sumsub/sentry/x;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/sumsub/sentry/x;->c:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/sumsub/sentry/x;->d:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/sumsub/sentry/x;->d:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/sumsub/sentry/x;->e:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/sumsub/sentry/x;->e:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v1, p0, Lcom/sumsub/sentry/x;->f:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/sumsub/sentry/x;->f:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v1, p0, Lcom/sumsub/sentry/x;->g:[Ljava/lang/String;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/sumsub/sentry/x;->g:[Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v1, p0, Lcom/sumsub/sentry/x;->h:Ljava/lang/Float;

    goto :goto_7

    :cond_7
    iput-object p9, p0, Lcom/sumsub/sentry/x;->h:Ljava/lang/Float;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v1, p0, Lcom/sumsub/sentry/x;->i:Ljava/lang/Boolean;

    goto :goto_8

    :cond_8
    iput-object p10, p0, Lcom/sumsub/sentry/x;->i:Ljava/lang/Boolean;

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object v1, p0, Lcom/sumsub/sentry/x;->j:Ljava/lang/Boolean;

    goto :goto_9

    :cond_9
    iput-object p11, p0, Lcom/sumsub/sentry/x;->j:Ljava/lang/Boolean;

    :goto_9
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    iput-object v1, p0, Lcom/sumsub/sentry/x;->k:Lcom/sumsub/sentry/Device$DeviceOrientation;

    goto :goto_a

    :cond_a
    iput-object p12, p0, Lcom/sumsub/sentry/x;->k:Lcom/sumsub/sentry/Device$DeviceOrientation;

    :goto_a
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput-object v1, p0, Lcom/sumsub/sentry/x;->l:Ljava/lang/Boolean;

    goto :goto_b

    :cond_b
    iput-object p13, p0, Lcom/sumsub/sentry/x;->l:Ljava/lang/Boolean;

    :goto_b
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_c

    iput-object v1, p0, Lcom/sumsub/sentry/x;->m:Ljava/lang/Long;

    goto :goto_c

    :cond_c
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/sumsub/sentry/x;->m:Ljava/lang/Long;

    :goto_c
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_d

    iput-object v1, p0, Lcom/sumsub/sentry/x;->n:Ljava/lang/Long;

    goto :goto_d

    :cond_d
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/sumsub/sentry/x;->n:Ljava/lang/Long;

    :goto_d
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_e

    iput-object v1, p0, Lcom/sumsub/sentry/x;->o:Ljava/lang/Long;

    goto :goto_e

    :cond_e
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/sumsub/sentry/x;->o:Ljava/lang/Long;

    :goto_e
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_f

    iput-object v1, p0, Lcom/sumsub/sentry/x;->p:Ljava/lang/Boolean;

    goto :goto_f

    :cond_f
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/sumsub/sentry/x;->p:Ljava/lang/Boolean;

    :goto_f
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_10

    iput-object v1, p0, Lcom/sumsub/sentry/x;->q:Ljava/lang/Long;

    goto :goto_10

    :cond_10
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/sumsub/sentry/x;->q:Ljava/lang/Long;

    :goto_10
    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    if-nez p2, :cond_11

    iput-object v1, p0, Lcom/sumsub/sentry/x;->r:Ljava/lang/Long;

    goto :goto_11

    :cond_11
    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/sumsub/sentry/x;->r:Ljava/lang/Long;

    :goto_11
    const/high16 p2, 0x40000

    and-int/2addr p2, p1

    if-nez p2, :cond_12

    iput-object v1, p0, Lcom/sumsub/sentry/x;->s:Ljava/lang/Long;

    goto :goto_12

    :cond_12
    move-object/from16 p2, p20

    iput-object p2, p0, Lcom/sumsub/sentry/x;->s:Ljava/lang/Long;

    :goto_12
    const/high16 p2, 0x80000

    and-int/2addr p2, p1

    if-nez p2, :cond_13

    iput-object v1, p0, Lcom/sumsub/sentry/x;->t:Ljava/lang/Long;

    goto :goto_13

    :cond_13
    move-object/from16 p2, p21

    iput-object p2, p0, Lcom/sumsub/sentry/x;->t:Ljava/lang/Long;

    :goto_13
    const/high16 p2, 0x100000

    and-int/2addr p2, p1

    if-nez p2, :cond_14

    iput-object v1, p0, Lcom/sumsub/sentry/x;->u:Ljava/lang/Integer;

    goto :goto_14

    :cond_14
    move-object/from16 p2, p22

    iput-object p2, p0, Lcom/sumsub/sentry/x;->u:Ljava/lang/Integer;

    :goto_14
    const/high16 p2, 0x200000

    and-int/2addr p2, p1

    if-nez p2, :cond_15

    iput-object v1, p0, Lcom/sumsub/sentry/x;->v:Ljava/lang/Integer;

    goto :goto_15

    :cond_15
    move-object/from16 p2, p23

    iput-object p2, p0, Lcom/sumsub/sentry/x;->v:Ljava/lang/Integer;

    :goto_15
    const/high16 p2, 0x400000

    and-int/2addr p2, p1

    if-nez p2, :cond_16

    iput-object v1, p0, Lcom/sumsub/sentry/x;->w:Ljava/lang/Float;

    goto :goto_16

    :cond_16
    move-object/from16 p2, p24

    iput-object p2, p0, Lcom/sumsub/sentry/x;->w:Ljava/lang/Float;

    :goto_16
    const/high16 p2, 0x800000

    and-int/2addr p2, p1

    if-nez p2, :cond_17

    iput-object v1, p0, Lcom/sumsub/sentry/x;->x:Ljava/lang/Integer;

    goto :goto_17

    :cond_17
    move-object/from16 p2, p25

    iput-object p2, p0, Lcom/sumsub/sentry/x;->x:Ljava/lang/Integer;

    :goto_17
    const/high16 p2, 0x1000000

    and-int/2addr p2, p1

    if-nez p2, :cond_18

    iput-object v1, p0, Lcom/sumsub/sentry/x;->y:Ljava/util/Date;

    goto :goto_18

    :cond_18
    move-object/from16 p2, p26

    iput-object p2, p0, Lcom/sumsub/sentry/x;->y:Ljava/util/Date;

    :goto_18
    const/high16 p2, 0x2000000

    and-int/2addr p2, p1

    if-nez p2, :cond_19

    iput-object v1, p0, Lcom/sumsub/sentry/x;->z:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 p2, p27

    iput-object p2, p0, Lcom/sumsub/sentry/x;->z:Ljava/lang/String;

    :goto_19
    const/high16 p2, 0x4000000

    and-int/2addr p2, p1

    if-nez p2, :cond_1a

    iput-object v1, p0, Lcom/sumsub/sentry/x;->A:Ljava/lang/String;

    goto :goto_1a

    :cond_1a
    move-object/from16 p2, p28

    iput-object p2, p0, Lcom/sumsub/sentry/x;->A:Ljava/lang/String;

    :goto_1a
    const/high16 p2, 0x8000000

    and-int/2addr p2, p1

    if-nez p2, :cond_1b

    iput-object v1, p0, Lcom/sumsub/sentry/x;->B:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 p2, p29

    iput-object p2, p0, Lcom/sumsub/sentry/x;->B:Ljava/lang/String;

    :goto_1b
    const/high16 p2, 0x10000000

    and-int/2addr p2, p1

    if-nez p2, :cond_1c

    iput-object v1, p0, Lcom/sumsub/sentry/x;->C:Ljava/lang/String;

    goto :goto_1c

    :cond_1c
    move-object/from16 p2, p30

    iput-object p2, p0, Lcom/sumsub/sentry/x;->C:Ljava/lang/String;

    :goto_1c
    const/high16 p2, 0x20000000

    and-int/2addr p2, p1

    if-nez p2, :cond_1d

    iput-object v1, p0, Lcom/sumsub/sentry/x;->D:Ljava/lang/String;

    goto :goto_1d

    :cond_1d
    move-object/from16 p2, p31

    iput-object p2, p0, Lcom/sumsub/sentry/x;->D:Ljava/lang/String;

    :goto_1d
    const/high16 p2, 0x40000000    # 2.0f

    and-int/2addr p1, p2

    if-nez p1, :cond_1e

    iput-object v1, p0, Lcom/sumsub/sentry/x;->E:Ljava/lang/Float;

    return-void

    :cond_1e
    move-object/from16 p1, p32

    iput-object p1, p0, Lcom/sumsub/sentry/x;->E:Ljava/lang/Float;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/Device$DeviceOrientation;)V
    .locals 3

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sentry/x;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/sumsub/sentry/x;->b:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/sumsub/sentry/x;->c:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/sumsub/sentry/x;->d:Ljava/lang/String;

    .line 7
    iput-object v1, p0, Lcom/sumsub/sentry/x;->e:Ljava/lang/String;

    .line 8
    iput-object v2, p0, Lcom/sumsub/sentry/x;->f:Ljava/lang/String;

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/sumsub/sentry/x;->g:[Ljava/lang/String;

    .line 10
    iput-object p1, p0, Lcom/sumsub/sentry/x;->h:Ljava/lang/Float;

    .line 11
    iput-object p1, p0, Lcom/sumsub/sentry/x;->i:Ljava/lang/Boolean;

    .line 12
    iput-object p1, p0, Lcom/sumsub/sentry/x;->j:Ljava/lang/Boolean;

    .line 13
    iput-object p4, p0, Lcom/sumsub/sentry/x;->k:Lcom/sumsub/sentry/Device$DeviceOrientation;

    .line 14
    iput-object p1, p0, Lcom/sumsub/sentry/x;->l:Ljava/lang/Boolean;

    .line 15
    iput-object p1, p0, Lcom/sumsub/sentry/x;->m:Ljava/lang/Long;

    .line 16
    iput-object p1, p0, Lcom/sumsub/sentry/x;->n:Ljava/lang/Long;

    .line 17
    iput-object p1, p0, Lcom/sumsub/sentry/x;->o:Ljava/lang/Long;

    .line 18
    iput-object p1, p0, Lcom/sumsub/sentry/x;->p:Ljava/lang/Boolean;

    .line 19
    iput-object p1, p0, Lcom/sumsub/sentry/x;->q:Ljava/lang/Long;

    .line 20
    iput-object p1, p0, Lcom/sumsub/sentry/x;->r:Ljava/lang/Long;

    .line 21
    iput-object p1, p0, Lcom/sumsub/sentry/x;->s:Ljava/lang/Long;

    .line 22
    iput-object p1, p0, Lcom/sumsub/sentry/x;->t:Ljava/lang/Long;

    .line 23
    iput-object p1, p0, Lcom/sumsub/sentry/x;->u:Ljava/lang/Integer;

    .line 24
    iput-object p1, p0, Lcom/sumsub/sentry/x;->v:Ljava/lang/Integer;

    .line 25
    iput-object p1, p0, Lcom/sumsub/sentry/x;->w:Ljava/lang/Float;

    .line 26
    iput-object p1, p0, Lcom/sumsub/sentry/x;->x:Ljava/lang/Integer;

    .line 27
    iput-object p1, p0, Lcom/sumsub/sentry/x;->y:Ljava/util/Date;

    .line 28
    iput-object p1, p0, Lcom/sumsub/sentry/x;->z:Ljava/lang/String;

    .line 29
    iput-object p1, p0, Lcom/sumsub/sentry/x;->A:Ljava/lang/String;

    .line 30
    iput-object p1, p0, Lcom/sumsub/sentry/x;->B:Ljava/lang/String;

    .line 31
    iput-object p1, p0, Lcom/sumsub/sentry/x;->C:Ljava/lang/String;

    .line 32
    iput-object p1, p0, Lcom/sumsub/sentry/x;->D:Ljava/lang/String;

    .line 33
    iput-object p1, p0, Lcom/sumsub/sentry/x;->E:Ljava/lang/Float;

    return-void
.end method

.method public static final synthetic a()Ltg0/d;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/p2;

    .line 3
    .line 4
    const-class v1, Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/p2;-><init>(Lkotlin/reflect/KClass;Ltg0/d;)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public static final synthetic b()Ltg0/d;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/Device$DeviceOrientation;->Companion:Lcom/sumsub/sentry/w;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sentry/w;->serializer()Ltg0/d;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public static final synthetic c()Ltg0/d;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ltg0/b;

    .line 3
    .line 4
    const-class v1, Ljava/util/Date;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    new-array v2, v2, [Ltg0/d;

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v3, v2}, Ltg0/b;-><init>(Lkotlin/reflect/KClass;Ltg0/d;[Ltg0/d;)V

    .line 16
    return-object v0
    .line 17
.end method
