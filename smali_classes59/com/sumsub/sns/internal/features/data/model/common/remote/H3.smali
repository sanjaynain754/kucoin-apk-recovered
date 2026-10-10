.class public Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;
.super Lcom/sumsub/sns/internal/features/data/model/common/remote/I3;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/M2;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:[Lkotlin/Lazy;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/M2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/M2;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/M2;

    .line 8
    .line 9
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/q4;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/q4;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    new-array v1, v1, [Lkotlin/Lazy;

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    aput-object v0, v1, v2

    .line 25
    .line 26
    sput-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;->b:[Lkotlin/Lazy;

    .line 27
    return-void
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

.method public synthetic constructor <init>(ILcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;)V
    .locals 2

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/V1;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/V1;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/V1;->getDescriptor()Lvg0/f;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/c2;->a(IILvg0/f;)V

    :cond_0
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/I3;-><init>()V

    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/I3;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;

    return-void
.end method

.method public static final synthetic a()Ltg0/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/u3;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/u3;->serializer()Ltg0/d;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic a(Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;Lwg0/b;Lvg0/f;)V
    .locals 2

    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;->b:[Lkotlin/Lazy;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg0/p;

    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;

    invoke-interface {p1, p2, v1, v0, p0}, Lwg0/b;->encodeSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    return-void
.end method
