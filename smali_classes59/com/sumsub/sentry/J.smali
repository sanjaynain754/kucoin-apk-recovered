.class public final Lcom/sumsub/sentry/J;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sentry/I;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final h:[Lkotlin/Lazy;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Boolean;

.field public final e:Ljava/util/Map;

.field public final f:Ljava/util/Map;

.field public final g:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/I;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/I;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/J;->Companion:Lcom/sumsub/sentry/I;

    .line 8
    .line 9
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sentry/o1;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sentry/o1;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    new-instance v2, Lcom/sumsub/sentry/p1;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2}, Lcom/sumsub/sentry/p1;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    move-result-object v0

    .line 28
    const/4 v2, 0x7

    .line 29
    .line 30
    new-array v2, v2, [Lkotlin/Lazy;

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    .line 34
    aput-object v3, v2, v4

    .line 35
    const/4 v4, 0x1

    .line 36
    .line 37
    aput-object v3, v2, v4

    .line 38
    const/4 v4, 0x2

    .line 39
    .line 40
    aput-object v3, v2, v4

    .line 41
    const/4 v4, 0x3

    .line 42
    .line 43
    aput-object v3, v2, v4

    .line 44
    const/4 v4, 0x4

    .line 45
    .line 46
    aput-object v1, v2, v4

    .line 47
    const/4 v1, 0x5

    .line 48
    .line 49
    aput-object v0, v2, v1

    .line 50
    const/4 v0, 0x6

    .line 51
    .line 52
    aput-object v3, v2, v0

    .line 53
    .line 54
    sput-object v2, Lcom/sumsub/sentry/J;->h:[Lkotlin/Lazy;

    .line 55
    return-void
    .line 56
    .line 57
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/sumsub/sentry/J;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/sumsub/sentry/J;->a:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v1, p0, Lcom/sumsub/sentry/J;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/sumsub/sentry/J;->b:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/sumsub/sentry/J;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/sumsub/sentry/J;->c:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/sumsub/sentry/J;->d:Ljava/lang/Boolean;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/sumsub/sentry/J;->d:Ljava/lang/Boolean;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/sumsub/sentry/J;->e:Ljava/util/Map;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/sumsub/sentry/J;->e:Ljava/util/Map;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v1, p0, Lcom/sumsub/sentry/J;->f:Ljava/util/Map;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/sumsub/sentry/J;->f:Ljava/util/Map;

    :goto_5
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object v1, p0, Lcom/sumsub/sentry/J;->g:Ljava/lang/Boolean;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/sumsub/sentry/J;->g:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sentry/J;->a:Ljava/lang/String;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/sumsub/sentry/J;->b:Ljava/lang/String;

    .line 5
    iput-object p1, p0, Lcom/sumsub/sentry/J;->c:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/sumsub/sentry/J;->d:Ljava/lang/Boolean;

    .line 7
    iput-object p1, p0, Lcom/sumsub/sentry/J;->e:Ljava/util/Map;

    .line 8
    iput-object p1, p0, Lcom/sumsub/sentry/J;->f:Ljava/util/Map;

    .line 9
    iput-object p1, p0, Lcom/sumsub/sentry/J;->g:Ljava/lang/Boolean;

    return-void
.end method

.method public static final synthetic a()Ltg0/d;
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

.method public static final synthetic b()Ltg0/d;
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
