.class final Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity;->K(Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lza0/b;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity;


# direct methods
.method public constructor <init>(Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$c;->a:Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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


# virtual methods
.method public final a(Lza0/b;)V
    .locals 1
    .param p1    # Lza0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "clickData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$c;->a:Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity;->I(Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity;)Lcom/revolut/revolutpay/ui/learn_more_activity/c;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Lcom/revolut/revolutpay/ui/learn_more_activity/c;->b(Lza0/b;)V

    .line 17
    :cond_0
    return-void
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
    check-cast p1, Lza0/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/revolut/revolutpay/ui/learn_more_activity/LearnMoreActivity$c;->a(Lza0/b;)V

    .line 6
    .line 7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p1
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
