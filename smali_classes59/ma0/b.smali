.class public final Lma0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma0/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lma0/b$a;
    }
.end annotation


# static fields
.field public static final b:Lma0/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lcom/revolut/revolutpay/domain/model/CountryCode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/revolut/revolutpay/data/repository/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lma0/b$a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lma0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lma0/b;->b:Lma0/b$a;

    .line 9
    .line 10
    sget-object v0, Lcom/revolut/revolutpay/domain/model/CountryCode;->Companion:Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getGB()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lma0/b;->c:Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 17
    return-void
.end method

.method public constructor <init>(Lcom/revolut/revolutpay/data/repository/a;)V
    .locals 1
    .param p1    # Lcom/revolut/revolutpay/data/repository/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "countryRepository"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lma0/b;->a:Lcom/revolut/revolutpay/data/repository/a;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public a(Lcom/revolut/revolutpay/domain/model/CountryCode;)Lcom/revolut/revolutpay/ui/picker/model/a;
    .locals 4
    .param p1    # Lcom/revolut/revolutpay/domain/model/CountryCode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lma0/b;->a:Lcom/revolut/revolutpay/data/repository/a;

    invoke-interface {v0}, Lcom/revolut/revolutpay/data/repository/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/revolut/revolutpay/ui/picker/model/a;

    invoke-virtual {v3}, Lcom/revolut/revolutpay/ui/picker/model/a;->e()Lcom/revolut/revolutpay/domain/model/CountryCode;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lcom/revolut/revolutpay/ui/picker/model/a;

    if-nez v2, :cond_4

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/revolut/revolutpay/ui/picker/model/a;

    invoke-virtual {v0}, Lcom/revolut/revolutpay/ui/picker/model/a;->e()Lcom/revolut/revolutpay/domain/model/CountryCode;

    move-result-object v1

    sget-object v2, Lma0/b;->c:Lcom/revolut/revolutpay/domain/model/CountryCode;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Collection contains no element matching the predicate."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-object v2
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/revolut/revolutpay/ui/picker/model/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lma0/b;->a:Lcom/revolut/revolutpay/data/repository/a;

    invoke-interface {v0}, Lcom/revolut/revolutpay/data/repository/a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
