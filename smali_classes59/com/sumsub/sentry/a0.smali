.class public abstract Lcom/sumsub/sentry/a0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sentry/Z;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final m:[Lkotlin/Lazy;

.field public static final n:Lkotlin/Lazy;


# instance fields
.field public final a:Lcom/sumsub/sentry/m;

.field public b:Lcom/sumsub/sentry/X;

.field public final c:Ljava/util/Map;

.field public final d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lcom/sumsub/sentry/h1;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public final j:Ljava/util/List;

.field public k:Ljava/util/Map;

.field public l:Lcom/sumsub/sentry/y;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/Z;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/Z;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/a0;->Companion:Lcom/sumsub/sentry/Z;

    .line 8
    .line 9
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sentry/a2;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sentry/a2;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    new-instance v2, Lcom/sumsub/sentry/b2;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2}, Lcom/sumsub/sentry/b2;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    new-instance v3, Lcom/sumsub/sentry/c2;

    .line 30
    .line 31
    .line 32
    invoke-direct {v3}, Lcom/sumsub/sentry/c2;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    const/16 v4, 0xb

    .line 39
    .line 40
    new-array v4, v4, [Lkotlin/Lazy;

    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    .line 44
    aput-object v5, v4, v6

    .line 45
    const/4 v6, 0x1

    .line 46
    .line 47
    aput-object v5, v4, v6

    .line 48
    const/4 v6, 0x2

    .line 49
    .line 50
    aput-object v1, v4, v6

    .line 51
    const/4 v1, 0x3

    .line 52
    .line 53
    aput-object v5, v4, v1

    .line 54
    const/4 v1, 0x4

    .line 55
    .line 56
    aput-object v5, v4, v1

    .line 57
    const/4 v1, 0x5

    .line 58
    .line 59
    aput-object v5, v4, v1

    .line 60
    const/4 v1, 0x6

    .line 61
    .line 62
    aput-object v5, v4, v1

    .line 63
    const/4 v1, 0x7

    .line 64
    .line 65
    aput-object v5, v4, v1

    .line 66
    .line 67
    const/16 v1, 0x8

    .line 68
    .line 69
    aput-object v5, v4, v1

    .line 70
    .line 71
    const/16 v1, 0x9

    .line 72
    .line 73
    aput-object v2, v4, v1

    .line 74
    .line 75
    const/16 v1, 0xa

    .line 76
    .line 77
    aput-object v3, v4, v1

    .line 78
    .line 79
    sput-object v4, Lcom/sumsub/sentry/a0;->m:[Lkotlin/Lazy;

    .line 80
    .line 81
    new-instance v1, Lcom/sumsub/sentry/d2;

    .line 82
    .line 83
    .line 84
    invoke-direct {v1}, Lcom/sumsub/sentry/d2;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    sput-object v0, Lcom/sumsub/sentry/a0;->n:Lkotlin/Lazy;

    .line 91
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Lcom/sumsub/sentry/m;

    invoke-direct {v0}, Lcom/sumsub/sentry/m;-><init>()V

    iput-object v0, p0, Lcom/sumsub/sentry/a0;->a:Lcom/sumsub/sentry/m;

    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sumsub/sentry/a0;->c:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/sumsub/sentry/m;Lcom/sumsub/sentry/X;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/h1;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    .line 2
    new-instance p2, Lcom/sumsub/sentry/m;

    invoke-direct {p2}, Lcom/sumsub/sentry/m;-><init>()V

    .line 3
    :cond_0
    iput-object p2, p0, Lcom/sumsub/sentry/a0;->a:Lcom/sumsub/sentry/m;

    and-int/lit8 p2, p1, 0x2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/sumsub/sentry/a0;->b:Lcom/sumsub/sentry/X;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/sumsub/sentry/a0;->b:Lcom/sumsub/sentry/X;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 4
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 5
    iput-object p2, p0, Lcom/sumsub/sentry/a0;->c:Ljava/util/Map;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/sumsub/sentry/a0;->c:Ljava/util/Map;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/sumsub/sentry/a0;->d:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/sumsub/sentry/a0;->d:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/sumsub/sentry/a0;->e:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/sumsub/sentry/a0;->e:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/sumsub/sentry/a0;->f:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/sumsub/sentry/a0;->f:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/sumsub/sentry/a0;->g:Lcom/sumsub/sentry/h1;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/sumsub/sentry/a0;->g:Lcom/sumsub/sentry/h1;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/sumsub/sentry/a0;->h:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/sumsub/sentry/a0;->h:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v0, p0, Lcom/sumsub/sentry/a0;->i:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p10, p0, Lcom/sumsub/sentry/a0;->i:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object v0, p0, Lcom/sumsub/sentry/a0;->j:Ljava/util/List;

    goto :goto_8

    :cond_9
    iput-object p11, p0, Lcom/sumsub/sentry/a0;->j:Ljava/util/List;

    :goto_8
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_a

    iput-object v0, p0, Lcom/sumsub/sentry/a0;->k:Ljava/util/Map;

    goto :goto_9

    :cond_a
    iput-object p12, p0, Lcom/sumsub/sentry/a0;->k:Ljava/util/Map;

    :goto_9
    iput-object v0, p0, Lcom/sumsub/sentry/a0;->l:Lcom/sumsub/sentry/y;

    return-void
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

.method public static final synthetic b()Ltg0/d;
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

.method public static final synthetic c()Ltg0/d;
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

.method public static final synthetic d()Ltg0/d;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ltg0/h;

    .line 3
    .line 4
    const-class v1, Lcom/sumsub/sentry/a0;

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
    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Ltg0/h;-><init>(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V

    .line 15
    return-object v0
    .line 16
    .line 17
.end method
