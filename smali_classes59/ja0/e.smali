.class public final Lja0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/revolut/revolutpay/data/SessionDto;)Lma0/c;
    .locals 1
    .param p0    # Lcom/revolut/revolutpay/data/SessionDto;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lma0/c;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/revolut/revolutpay/data/SessionDto;->getToken()Ljava/lang/String;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const-string p0, ""

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-direct {v0, p0}, Lma0/c;-><init>(Ljava/lang/String;)V

    .line 19
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
