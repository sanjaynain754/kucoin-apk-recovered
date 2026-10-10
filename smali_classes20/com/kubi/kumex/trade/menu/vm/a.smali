.class public final Lcom/kubi/kumex/trade/menu/vm/a;
.super Ljava/lang/Object;
.source "AnnouncementViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "findAnnouncementViewModel",
        "Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;",
        "Landroidx/fragment/app/Fragment;",
        "KumexLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnnouncementViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementViewModel.kt\ncom/kubi/kumex/trade/menu/vm/AnnouncementViewModelKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,89:1\n220#2,5:90\n*S KotlinDebug\n*F\n+ 1 AnnouncementViewModel.kt\ncom/kubi/kumex/trade/menu/vm/AnnouncementViewModelKt\n*L\n88#1:90,5\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroidx/fragment/app/Fragment;)Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;
    .locals 1
    .param p0    # Landroidx/fragment/app/Fragment;
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
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kubi/kumex/trade/menu/vm/a;->a(Landroidx/fragment/app/Fragment;)Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object v0

    .line 20
    .line 21
    :cond_1
    :goto_0
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 25
    .line 26
    const-class p0, Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 30
    move-result-object p0

    .line 31
    .line 32
    check-cast p0, Lcom/kubi/kumex/trade/menu/vm/AnnouncementViewModel;

    .line 33
    return-object p0
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
.end method
