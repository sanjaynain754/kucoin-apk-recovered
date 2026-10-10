.class public final synthetic Landroidx/savedstate/serialization/b;
.super Ljava/lang/Object;
.source "R8$$SyntheticClass"

# interfaces
.implements Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;


# instance fields
.field public final synthetic a:Landroidx/savedstate/serialization/SavedStateRegistryOwnerDelegate;


# direct methods
.method public synthetic constructor <init>(Landroidx/savedstate/serialization/SavedStateRegistryOwnerDelegate;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/savedstate/serialization/b;->a:Landroidx/savedstate/serialization/SavedStateRegistryOwnerDelegate;

    .line 6
    return-void
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public final saveState()Landroid/os/Bundle;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/savedstate/serialization/b;->a:Landroidx/savedstate/serialization/SavedStateRegistryOwnerDelegate;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/savedstate/serialization/SavedStateRegistryOwnerDelegate;->a(Landroidx/savedstate/serialization/SavedStateRegistryOwnerDelegate;)Landroid/os/Bundle;

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
    .line 18
.end method
