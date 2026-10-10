.class final synthetic Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter$18;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "AssetOnGoingAdapter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Lcom/kubi/assets/overview/ongoing/f0;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroid/view/LayoutInflater;",
        "Landroid/view/ViewGroup;",
        "Ljava/lang/Boolean;",
        "Lta/m1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter$18;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter$18;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter$18;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter$18;->INSTANCE:Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter$18;

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
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    .line 2
    const-string v4, "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/assets/databinding/AssetItemOngoingLoadMoreBinding;"

    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    .line 6
    const-class v2, Lta/m1;

    .line 7
    .line 8
    const-string v3, "inflate"

    .line 9
    move-object v0, p0

    .line 10
    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    return-void
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
    .line 26
    .line 27
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/LayoutInflater;

    check-cast p2, Landroid/view/ViewGroup;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter$18;->invoke(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lta/m1;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lta/m1;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1, p2, p3}, Lta/m1;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lta/m1;

    move-result-object p1

    return-object p1
.end method
