.class final Lcom/revolut/revolutpay/data/a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revolut/revolutpay/data/a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/revolut/revolutpay/data/SessionDto;",
        "Lma0/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/revolut/revolutpay/data/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/revolut/revolutpay/data/a$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/revolut/revolutpay/data/a$a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/revolut/revolutpay/data/a$a;->a:Lcom/revolut/revolutpay/data/a$a;

    .line 8
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    return-void
    .line 6
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
    .line 17
.end method


# virtual methods
.method public final a(Lcom/revolut/revolutpay/data/SessionDto;)Lma0/c;
    .locals 0
    .param p1    # Lcom/revolut/revolutpay/data/SessionDto;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lja0/e;->a(Lcom/revolut/revolutpay/data/SessionDto;)Lma0/c;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    return-object p1

    .line 10
    .line 11
    :cond_0
    new-instance p1, Lcom/revolut/revolutpay/api/exceptions/SessionException;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1}, Lcom/revolut/revolutpay/api/exceptions/SessionException;-><init>()V

    .line 15
    throw p1
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

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/revolut/revolutpay/data/SessionDto;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/revolut/revolutpay/data/a$a;->a(Lcom/revolut/revolutpay/data/SessionDto;)Lma0/c;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
