.class public Lio/chad/library/adapter/base/util/ProviderDelegate;
.super Ljava/lang/Object;
.source "ProviderDelegate.java"


# instance fields
.field private mItemProviders:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lio/chad/library/adapter/base/provider/BaseItemProvider;",
            ">;"
        }
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
    .line 5
    new-instance v0, Landroid/util/SparseArray;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lio/chad/library/adapter/base/util/ProviderDelegate;->mItemProviders:Landroid/util/SparseArray;

    .line 11
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method


# virtual methods
.method public getItemProviders()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Lio/chad/library/adapter/base/provider/BaseItemProvider;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/chad/library/adapter/base/util/ProviderDelegate;->mItemProviders:Landroid/util/SparseArray;

    .line 3
    return-object v0
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public registerProvider(Lio/chad/library/adapter/base/provider/BaseItemProvider;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lio/chad/library/adapter/base/provider/BaseItemProvider;->viewType()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lio/chad/library/adapter/base/util/ProviderDelegate;->mItemProviders:Landroid/util/SparseArray;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lio/chad/library/adapter/base/util/ProviderDelegate;->mItemProviders:Landroid/util/SparseArray;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 20
    :cond_0
    return-void

    .line 21
    .line 22
    :cond_1
    new-instance p1, Lio/chad/library/adapter/base/util/ItemProviderException;

    .line 23
    .line 24
    const-string v0, "ItemProvider can not be null"

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, v0}, Lio/chad/library/adapter/base/util/ItemProviderException;-><init>(Ljava/lang/String;)V

    .line 28
    throw p1
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method
