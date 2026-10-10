.class public final Lcom/jumio/core/util/QAKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0011\u0010\u0000\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "QA",
        "Lcom/jumio/core/interfaces/QAInterface;",
        "getQA",
        "()Lcom/jumio/core/interfaces/QAInterface;",
        "jumio-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a()Lcom/jumio/core/interfaces/QAInterface;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/util/DefaultQA;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/jumio/core/util/DefaultQA;-><init>()V

    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public static final getQA()Lcom/jumio/core/interfaces/QAInterface;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/ServiceLocator;->INSTANCE:Lcom/jumio/core/ServiceLocator;

    .line 3
    .line 4
    new-instance v1, Lx9/c;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lx9/c;-><init>()V

    .line 8
    .line 9
    const-class v2, Lcom/jumio/core/interfaces/QAInterface;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Lcom/jumio/core/ServiceLocator;->getServiceImplementation(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/jumio/core/interfaces/QAInterface;

    .line 16
    return-object v0
.end method
