.class public final synthetic Lcom/sumsub/sns/internal/features/presentation/main/u0;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v5, "showFragment(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V"

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v1, 0x2

    .line 6
    .line 7
    const-class v3, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v4, "showFragment"

    .line 11
    move-object v0, p0

    .line 12
    move-object v2, p1

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 16
    return-void
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
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/String;

    .line 5
    .line 6
    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 9
    .line 10
    sget v1, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->j:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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
.end method
