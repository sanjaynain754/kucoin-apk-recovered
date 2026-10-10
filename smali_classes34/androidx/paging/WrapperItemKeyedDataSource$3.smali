.class Landroidx/paging/WrapperItemKeyedDataSource$3;
.super Landroidx/paging/ItemKeyedDataSource$LoadCallback;
.source "WrapperItemKeyedDataSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/WrapperItemKeyedDataSource;->loadBefore(Landroidx/paging/ItemKeyedDataSource$LoadParams;Landroidx/paging/ItemKeyedDataSource$LoadCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/ItemKeyedDataSource$LoadCallback<",
        "TA;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/paging/WrapperItemKeyedDataSource;

.field final synthetic val$callback:Landroidx/paging/ItemKeyedDataSource$LoadCallback;


# direct methods
.method public constructor <init>(Landroidx/paging/WrapperItemKeyedDataSource;Landroidx/paging/ItemKeyedDataSource$LoadCallback;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/paging/WrapperItemKeyedDataSource$3;->this$0:Landroidx/paging/WrapperItemKeyedDataSource;

    .line 3
    .line 4
    iput-object p2, p0, Landroidx/paging/WrapperItemKeyedDataSource$3;->val$callback:Landroidx/paging/ItemKeyedDataSource$LoadCallback;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/paging/ItemKeyedDataSource$LoadCallback;-><init>()V

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
.method public onResult(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TA;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/paging/WrapperItemKeyedDataSource$3;->val$callback:Landroidx/paging/ItemKeyedDataSource$LoadCallback;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/paging/WrapperItemKeyedDataSource$3;->this$0:Landroidx/paging/WrapperItemKeyedDataSource;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1, p1}, Landroidx/paging/WrapperItemKeyedDataSource;->convertWithStashedKeys(Ljava/util/List;)Ljava/util/List;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/paging/ItemKeyedDataSource$LoadCallback;->onResult(Ljava/util/List;)V

    .line 12
    return-void
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
