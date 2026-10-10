.class public final Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;
.super Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/X1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:[Lkotlin/Lazy;


# instance fields
.field public final c:Lcom/sumsub/sns/internal/features/data/model/common/remote/a2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/X1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/X1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/X1;

    .line 8
    .line 9
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/v5;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/v5;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x2

    .line 20
    .line 21
    new-array v1, v1, [Lkotlin/Lazy;

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    aput-object v0, v1, v2

    .line 25
    const/4 v0, 0x0

    .line 26
    const/4 v2, 0x1

    .line 27
    .line 28
    aput-object v0, v1, v2

    .line 29
    .line 30
    sput-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;->d:[Lkotlin/Lazy;

    .line 31
    return-void
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

.method public synthetic constructor <init>(ILcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/features/data/model/common/remote/a2;)V
    .locals 2

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/W1;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/W1;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/W1;->getDescriptor()Lvg0/f;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/c2;->a(IILvg0/f;)V

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;-><init>(ILcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;)V

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/a2;

    return-void

    :cond_1
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/a2;

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/a2;)V
    .locals 1

    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;->ADDED_ID_DOC:Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;

    .line 3
    invoke-direct {p0, v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;)V

    .line 4
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/a2;

    return-void
.end method

.method public static final synthetic a()Ltg0/d;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/SNSMessage$ServerMessage$Type;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/u3;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/u3;->serializer()Ltg0/d;

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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/a2;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/a2;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result p1

    .line 21
    .line 22
    if-nez p1, :cond_2

    .line 23
    return v2

    .line 24
    :cond_2
    return v0
    .line 25
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/a2;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/a2;->hashCode()I

    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/b2;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/a2;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "AddedIdDoc(payload="

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, ")"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    return-object v0
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
