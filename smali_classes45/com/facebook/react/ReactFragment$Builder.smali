.class public Lcom/facebook/react/ReactFragment$Builder;
.super Ljava/lang/Object;
.source "ReactFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/ReactFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field mComponentName:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field mFabricEnabled:Ljava/lang/Boolean;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field mLaunchOptions:Landroid/os/Bundle;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/facebook/react/ReactFragment$Builder;->mComponentName:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/facebook/react/ReactFragment$Builder;->mLaunchOptions:Landroid/os/Bundle;

    .line 9
    .line 10
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/facebook/react/ReactFragment$Builder;->mFabricEnabled:Ljava/lang/Boolean;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public build()Lcom/facebook/react/ReactFragment;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/ReactFragment$Builder;->mComponentName:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/facebook/react/ReactFragment$Builder;->mLaunchOptions:Landroid/os/Bundle;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/facebook/react/ReactFragment$Builder;->mFabricEnabled:Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lcom/facebook/react/ReactFragment;->d3(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Boolean;)Lcom/facebook/react/ReactFragment;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public setComponentName(Ljava/lang/String;)Lcom/facebook/react/ReactFragment$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/ReactFragment$Builder;->mComponentName:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
    .line 5
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setFabricEnabled(Z)Lcom/facebook/react/ReactFragment$Builder;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/ReactFragment$Builder;->mFabricEnabled:Ljava/lang/Boolean;

    .line 7
    return-object p0
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

.method public setLaunchOptions(Landroid/os/Bundle;)Lcom/facebook/react/ReactFragment$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/ReactFragment$Builder;->mLaunchOptions:Landroid/os/Bundle;

    .line 3
    return-object p0
    .line 4
    .line 5
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
