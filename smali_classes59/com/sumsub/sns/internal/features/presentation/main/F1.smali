.class public final synthetic Lcom/sumsub/sns/internal/features/presentation/main/F1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v5, "onSdkPreparedFailure(Ljava/lang/Throwable;)V"

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    const-class v3, Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v4, "onSdkPreparedFailure"

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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 3
    .line 4
    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->a(Lcom/sumsub/sns/internal/features/presentation/main/a2;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p1
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
