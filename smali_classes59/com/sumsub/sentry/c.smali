.class public final Lcom/sumsub/sentry/c;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 App.kt\ncom/sumsub/sentry/App\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"
    }
.end annotation

.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sentry/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final h:[Lkotlin/Lazy;


# instance fields
.field public a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/c;->Companion:Lcom/sumsub/sentry/b;

    .line 8
    .line 9
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sentry/g2;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sentry/g2;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x7

    .line 20
    .line 21
    new-array v1, v1, [Lkotlin/Lazy;

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    .line 25
    aput-object v2, v1, v3

    .line 26
    const/4 v3, 0x1

    .line 27
    .line 28
    aput-object v2, v1, v3

    .line 29
    const/4 v3, 0x2

    .line 30
    .line 31
    aput-object v2, v1, v3

    .line 32
    const/4 v3, 0x3

    .line 33
    .line 34
    aput-object v2, v1, v3

    .line 35
    const/4 v3, 0x4

    .line 36
    .line 37
    aput-object v2, v1, v3

    .line 38
    const/4 v3, 0x5

    .line 39
    .line 40
    aput-object v2, v1, v3

    .line 41
    const/4 v2, 0x6

    .line 42
    .line 43
    aput-object v0, v1, v2

    .line 44
    .line 45
    sput-object v1, Lcom/sumsub/sentry/c;->h:[Lkotlin/Lazy;

    .line 46
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/sumsub/sentry/c;->a:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/sumsub/sentry/c;->b:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/sumsub/sentry/c;->c:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/sumsub/sentry/c;->d:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lcom/sumsub/sentry/c;->e:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lcom/sumsub/sentry/c;->f:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lcom/sumsub/sentry/c;->g:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/sumsub/sentry/c;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/sumsub/sentry/c;->a:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v1, p0, Lcom/sumsub/sentry/c;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/sumsub/sentry/c;->b:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/sumsub/sentry/c;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/sumsub/sentry/c;->c:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/sumsub/sentry/c;->d:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/sumsub/sentry/c;->d:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/sumsub/sentry/c;->e:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/sumsub/sentry/c;->e:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v1, p0, Lcom/sumsub/sentry/c;->f:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/sumsub/sentry/c;->f:Ljava/lang/String;

    :goto_5
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object v1, p0, Lcom/sumsub/sentry/c;->g:Ljava/util/Map;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/sumsub/sentry/c;->g:Ljava/util/Map;

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
