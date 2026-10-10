.class public final Lcom/sumsub/sentry/N0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sentry/M0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:[Lkotlin/Lazy;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/Map;

.field public final c:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/M0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/M0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/N0;->Companion:Lcom/sumsub/sentry/M0;

    .line 8
    .line 9
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sentry/r1;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sentry/r1;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    new-instance v2, Lcom/sumsub/sentry/s1;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2}, Lcom/sumsub/sentry/s1;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    move-result-object v0

    .line 28
    const/4 v2, 0x3

    .line 29
    .line 30
    new-array v2, v2, [Lkotlin/Lazy;

    .line 31
    const/4 v3, 0x0

    .line 32
    .line 33
    aput-object v1, v2, v3

    .line 34
    const/4 v1, 0x1

    .line 35
    .line 36
    aput-object v0, v2, v1

    .line 37
    const/4 v0, 0x0

    .line 38
    const/4 v1, 0x2

    .line 39
    .line 40
    aput-object v0, v2, v1

    .line 41
    .line 42
    sput-object v2, Lcom/sumsub/sentry/N0;->d:[Lkotlin/Lazy;

    .line 43
    return-void
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

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/Map;Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/sumsub/sentry/N0;->a:Ljava/util/List;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/sumsub/sentry/N0;->a:Ljava/util/List;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v1, p0, Lcom/sumsub/sentry/N0;->b:Ljava/util/Map;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/sumsub/sentry/N0;->b:Ljava/util/Map;

    :goto_1
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    iput-object v1, p0, Lcom/sumsub/sentry/N0;->c:Ljava/lang/Boolean;

    return-void

    :cond_2
    iput-object p4, p0, Lcom/sumsub/sentry/N0;->c:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/lang/Boolean;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sentry/N0;->a:Ljava/util/List;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/sumsub/sentry/N0;->b:Ljava/util/Map;

    .line 5
    iput-object p2, p0, Lcom/sumsub/sentry/N0;->c:Ljava/lang/Boolean;

    return-void
.end method

.method public static final synthetic a()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/f;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sentry/I0;->a:Lcom/sumsub/sentry/I0;

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

.method public static final synthetic b()Ltg0/d;
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
