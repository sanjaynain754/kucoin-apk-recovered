.class public abstract Lcom/sumsub/sns/internal/features/data/model/common/D;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sns/internal/features/data/model/common/q;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final a:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/q;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/q;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/D;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/q;

    .line 8
    .line 9
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/a4;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/data/model/common/a4;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/D;->a:Lkotlin/Lazy;

    .line 21
    return-void
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
.end method

.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic b()Ltg0/d;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Ltg0/m;

    .line 3
    .line 4
    const-class v1, Lcom/sumsub/sns/internal/features/data/model/common/D;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    const-class v1, Lcom/sumsub/sns/internal/features/data/model/common/u;

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const-class v3, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 17
    .line 18
    .line 19
    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x2

    .line 22
    move-object v5, v3

    .line 23
    .line 24
    new-array v3, v4, [Lkotlin/reflect/KClass;

    .line 25
    const/4 v6, 0x0

    .line 26
    .line 27
    aput-object v1, v3, v6

    .line 28
    const/4 v1, 0x1

    .line 29
    .line 30
    aput-object v5, v3, v1

    .line 31
    .line 32
    new-array v4, v4, [Ltg0/d;

    .line 33
    .line 34
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/r;->a:Lcom/sumsub/sns/internal/features/data/model/common/r;

    .line 35
    .line 36
    aput-object v5, v4, v6

    .line 37
    .line 38
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/v;->a:Lcom/sumsub/sns/internal/features/data/model/common/v;

    .line 39
    .line 40
    aput-object v5, v4, v1

    .line 41
    .line 42
    new-array v5, v6, [Ljava/lang/annotation/Annotation;

    .line 43
    .line 44
    const-string v1, "com.sumsub.sns.internal.features.data.model.common.ApplicantDataField"

    .line 45
    .line 46
    .line 47
    invoke-direct/range {v0 .. v5}, Ltg0/m;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Ltg0/d;[Ljava/lang/annotation/Annotation;)V

    .line 48
    return-object v0
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


# virtual methods
.method public abstract c()Ljava/lang/String;
.end method
