.class public final Lcom/sumsub/sentry/n0;
.super Lcom/sumsub/sentry/a0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSentryEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentryEvent.kt\ncom/sumsub/sentry/SentryEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1869#2,2:134\n*S KotlinDebug\n*F\n+ 1 SentryEvent.kt\ncom/sumsub/sentry/SentryEvent\n*L\n115#1:134,2\n*E\n"
    }
.end annotation

.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sentry/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final z:[Lkotlin/Lazy;


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Lcom/sumsub/sentry/M;

.field public final r:Ljava/lang/String;

.field public s:Lcom/sumsub/sentry/X0;

.field public t:Lcom/sumsub/sentry/X0;

.field public final u:Lcom/sumsub/sentry/SentryLevel;

.field public final v:Ljava/lang/String;

.field public final w:Ljava/util/List;

.field public final x:Ljava/util/Map;

.field public final y:Lcom/sumsub/sentry/t;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/m0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/m0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/n0;->Companion:Lcom/sumsub/sentry/m0;

    .line 8
    .line 9
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sentry/l2;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sentry/l2;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    new-instance v2, Lcom/sumsub/sentry/m2;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2}, Lcom/sumsub/sentry/m2;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    new-instance v3, Lcom/sumsub/sentry/n2;

    .line 30
    .line 31
    .line 32
    invoke-direct {v3}, Lcom/sumsub/sentry/n2;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    new-instance v4, Lcom/sumsub/sentry/o2;

    .line 39
    .line 40
    .line 41
    invoke-direct {v4}, Lcom/sumsub/sentry/o2;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v4}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    new-instance v5, Lcom/sumsub/sentry/p2;

    .line 48
    .line 49
    .line 50
    invoke-direct {v5}, Lcom/sumsub/sentry/p2;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v5}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 54
    move-result-object v5

    .line 55
    .line 56
    new-instance v6, Lcom/sumsub/sentry/q2;

    .line 57
    .line 58
    .line 59
    invoke-direct {v6}, Lcom/sumsub/sentry/q2;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v6}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 63
    move-result-object v6

    .line 64
    .line 65
    new-instance v7, Lcom/sumsub/sentry/r2;

    .line 66
    .line 67
    .line 68
    invoke-direct {v7}, Lcom/sumsub/sentry/r2;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v7}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 72
    move-result-object v7

    .line 73
    .line 74
    new-instance v8, Lcom/sumsub/sentry/s2;

    .line 75
    .line 76
    .line 77
    invoke-direct {v8}, Lcom/sumsub/sentry/s2;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v8}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    const/16 v8, 0x16

    .line 84
    .line 85
    new-array v8, v8, [Lkotlin/Lazy;

    .line 86
    const/4 v9, 0x0

    .line 87
    const/4 v10, 0x0

    .line 88
    .line 89
    aput-object v9, v8, v10

    .line 90
    const/4 v10, 0x1

    .line 91
    .line 92
    aput-object v9, v8, v10

    .line 93
    const/4 v10, 0x2

    .line 94
    .line 95
    aput-object v1, v8, v10

    .line 96
    const/4 v1, 0x3

    .line 97
    .line 98
    aput-object v9, v8, v1

    .line 99
    const/4 v1, 0x4

    .line 100
    .line 101
    aput-object v9, v8, v1

    .line 102
    const/4 v1, 0x5

    .line 103
    .line 104
    aput-object v9, v8, v1

    .line 105
    const/4 v1, 0x6

    .line 106
    .line 107
    aput-object v9, v8, v1

    .line 108
    const/4 v1, 0x7

    .line 109
    .line 110
    aput-object v9, v8, v1

    .line 111
    .line 112
    const/16 v1, 0x8

    .line 113
    .line 114
    aput-object v9, v8, v1

    .line 115
    .line 116
    const/16 v1, 0x9

    .line 117
    .line 118
    aput-object v2, v8, v1

    .line 119
    .line 120
    const/16 v1, 0xa

    .line 121
    .line 122
    aput-object v3, v8, v1

    .line 123
    .line 124
    const/16 v1, 0xb

    .line 125
    .line 126
    aput-object v9, v8, v1

    .line 127
    .line 128
    const/16 v1, 0xc

    .line 129
    .line 130
    aput-object v9, v8, v1

    .line 131
    .line 132
    const/16 v1, 0xd

    .line 133
    .line 134
    aput-object v9, v8, v1

    .line 135
    .line 136
    const/16 v1, 0xe

    .line 137
    .line 138
    aput-object v9, v8, v1

    .line 139
    .line 140
    const/16 v1, 0xf

    .line 141
    .line 142
    aput-object v4, v8, v1

    .line 143
    .line 144
    const/16 v1, 0x10

    .line 145
    .line 146
    aput-object v5, v8, v1

    .line 147
    .line 148
    const/16 v1, 0x11

    .line 149
    .line 150
    aput-object v6, v8, v1

    .line 151
    .line 152
    const/16 v1, 0x12

    .line 153
    .line 154
    aput-object v9, v8, v1

    .line 155
    .line 156
    const/16 v1, 0x13

    .line 157
    .line 158
    aput-object v7, v8, v1

    .line 159
    .line 160
    const/16 v1, 0x14

    .line 161
    .line 162
    aput-object v0, v8, v1

    .line 163
    .line 164
    const/16 v0, 0x15

    .line 165
    .line 166
    aput-object v9, v8, v0

    .line 167
    .line 168
    sput-object v8, Lcom/sumsub/sentry/n0;->z:[Lkotlin/Lazy;

    .line 169
    return-void
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
    .locals 8

    .line 10
    sget-object v0, Lcom/sumsub/sentry/w0;->Companion:Lcom/sumsub/sentry/v0;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "-"

    const-string v4, ""

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 12
    sget-object v1, Lcom/sumsub/sentry/n;->b:Ljava/util/Date;

    .line 13
    sget-object v2, Lcom/sumsub/sentry/n;->a:Ljava/text/SimpleDateFormat;

    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 14
    new-instance v2, Lcom/sumsub/sentry/t;

    invoke-direct {v2}, Lcom/sumsub/sentry/t;-><init>()V

    .line 15
    invoke-direct {p0}, Lcom/sumsub/sentry/a0;-><init>()V

    .line 16
    iput-object v0, p0, Lcom/sumsub/sentry/n0;->o:Ljava/lang/String;

    .line 17
    iput-object v1, p0, Lcom/sumsub/sentry/n0;->p:Ljava/lang/String;

    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/sumsub/sentry/n0;->q:Lcom/sumsub/sentry/M;

    .line 19
    iput-object v0, p0, Lcom/sumsub/sentry/n0;->r:Ljava/lang/String;

    .line 20
    iput-object v0, p0, Lcom/sumsub/sentry/n0;->s:Lcom/sumsub/sentry/X0;

    .line 21
    iput-object v0, p0, Lcom/sumsub/sentry/n0;->t:Lcom/sumsub/sentry/X0;

    .line 22
    iput-object v0, p0, Lcom/sumsub/sentry/n0;->u:Lcom/sumsub/sentry/SentryLevel;

    .line 23
    iput-object v0, p0, Lcom/sumsub/sentry/n0;->v:Ljava/lang/String;

    .line 24
    iput-object v0, p0, Lcom/sumsub/sentry/n0;->w:Ljava/util/List;

    .line 25
    iput-object v0, p0, Lcom/sumsub/sentry/n0;->x:Ljava/util/Map;

    .line 26
    iput-object v2, p0, Lcom/sumsub/sentry/n0;->y:Lcom/sumsub/sentry/t;

    return-void
.end method

.method public constructor <init>(ILcom/sumsub/sentry/m;Lcom/sumsub/sentry/X;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/h1;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/M;Ljava/lang/String;Lcom/sumsub/sentry/X0;Lcom/sumsub/sentry/X0;Lcom/sumsub/sentry/SentryLevel;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/sumsub/sentry/t;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p12}, Lcom/sumsub/sentry/a0;-><init>(ILcom/sumsub/sentry/m;Lcom/sumsub/sentry/X;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/h1;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_0

    .line 2
    sget-object p2, Lcom/sumsub/sentry/w0;->Companion:Lcom/sumsub/sentry/v0;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-virtual {p3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p4

    const/4 p8, 0x4

    const/4 p2, 0x0

    const-string p5, "-"

    const-string p6, ""

    const/4 p7, 0x0

    move-object p9, p2

    invoke-static/range {p4 .. p9}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 4
    iput-object p2, p0, Lcom/sumsub/sentry/n0;->o:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p13, p0, Lcom/sumsub/sentry/n0;->o:Ljava/lang/String;

    :goto_0
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_1

    .line 5
    sget-object p2, Lcom/sumsub/sentry/n;->b:Ljava/util/Date;

    .line 6
    sget-object p3, Lcom/sumsub/sentry/n;->a:Ljava/text/SimpleDateFormat;

    invoke-virtual {p3, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    .line 7
    iput-object p2, p0, Lcom/sumsub/sentry/n0;->p:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p14, p0, Lcom/sumsub/sentry/n0;->p:Ljava/lang/String;

    :goto_1
    and-int/lit16 p2, p1, 0x2000

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/sumsub/sentry/n0;->q:Lcom/sumsub/sentry/M;

    goto :goto_2

    :cond_2
    iput-object p15, p0, Lcom/sumsub/sentry/n0;->q:Lcom/sumsub/sentry/M;

    :goto_2
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/sumsub/sentry/n0;->r:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/sumsub/sentry/n0;->r:Ljava/lang/String;

    :goto_3
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/sumsub/sentry/n0;->s:Lcom/sumsub/sentry/X0;

    goto :goto_4

    :cond_4
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/sumsub/sentry/n0;->s:Lcom/sumsub/sentry/X0;

    :goto_4
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/sumsub/sentry/n0;->t:Lcom/sumsub/sentry/X0;

    goto :goto_5

    :cond_5
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/sumsub/sentry/n0;->t:Lcom/sumsub/sentry/X0;

    :goto_5
    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/sumsub/sentry/n0;->u:Lcom/sumsub/sentry/SentryLevel;

    goto :goto_6

    :cond_6
    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/sumsub/sentry/n0;->u:Lcom/sumsub/sentry/SentryLevel;

    :goto_6
    const/high16 p2, 0x40000

    and-int/2addr p2, p1

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/sumsub/sentry/n0;->v:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 p2, p20

    iput-object p2, p0, Lcom/sumsub/sentry/n0;->v:Ljava/lang/String;

    :goto_7
    const/high16 p2, 0x80000

    and-int/2addr p2, p1

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/sumsub/sentry/n0;->w:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 p2, p21

    iput-object p2, p0, Lcom/sumsub/sentry/n0;->w:Ljava/util/List;

    :goto_8
    const/high16 p2, 0x100000

    and-int/2addr p2, p1

    if-nez p2, :cond_9

    iput-object p3, p0, Lcom/sumsub/sentry/n0;->x:Ljava/util/Map;

    goto :goto_9

    :cond_9
    move-object/from16 p2, p22

    iput-object p2, p0, Lcom/sumsub/sentry/n0;->x:Ljava/util/Map;

    :goto_9
    const/high16 p2, 0x200000

    and-int/2addr p1, p2

    if-nez p1, :cond_a

    .line 8
    new-instance p1, Lcom/sumsub/sentry/t;

    invoke-direct {p1}, Lcom/sumsub/sentry/t;-><init>()V

    .line 9
    :goto_a
    iput-object p1, p0, Lcom/sumsub/sentry/n0;->y:Lcom/sumsub/sentry/t;

    return-void

    :cond_a
    move-object/from16 p1, p23

    goto :goto_a
.end method

.method public static final synthetic a()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/a1;

    .line 3
    .line 4
    sget-object v1, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/a1;-><init>(Ltg0/d;Ltg0/d;)V

    .line 8
    return-object v0
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
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/f;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sentry/d;->a:Lcom/sumsub/sentry/d;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/f;-><init>(Ltg0/d;)V

    .line 8
    return-object v0
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

.method public static final synthetic e()Ltg0/d;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/a1;

    .line 3
    .line 4
    sget-object v1, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 5
    .line 6
    new-instance v2, Ltg0/b;

    .line 7
    .line 8
    const-class v3, Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 12
    move-result-object v3

    .line 13
    const/4 v4, 0x0

    .line 14
    .line 15
    new-array v4, v4, [Ltg0/d;

    .line 16
    const/4 v5, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v3, v5, v4}, Ltg0/b;-><init>(Lkotlin/reflect/KClass;Ltg0/d;[Ltg0/d;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/a1;-><init>(Ltg0/d;Ltg0/d;)V

    .line 23
    return-object v0
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
.end method

.method public static final synthetic f()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/X0;->Companion:Lcom/sumsub/sentry/W0;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sentry/R0;->a:Lcom/sumsub/sentry/R0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/sumsub/sentry/W0;->serializer(Ltg0/d;)Ltg0/d;

    .line 8
    move-result-object v0

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

.method public static final synthetic g()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/X0;->Companion:Lcom/sumsub/sentry/W0;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sentry/o0;->a:Lcom/sumsub/sentry/o0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/sumsub/sentry/W0;->serializer(Ltg0/d;)Ltg0/d;

    .line 8
    move-result-object v0

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

.method public static final synthetic h()Ltg0/d;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/SentryLevel;->Companion:Lcom/sumsub/sentry/y0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sentry/y0;->serializer()Ltg0/d;

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

.method public static final synthetic i()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/f;

    .line 3
    .line 4
    sget-object v1, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/f;-><init>(Ltg0/d;)V

    .line 8
    return-object v0
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

.method public static final synthetic j()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/a1;

    .line 3
    .line 4
    sget-object v1, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/a1;-><init>(Ltg0/d;Ltg0/d;)V

    .line 8
    return-object v0
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
