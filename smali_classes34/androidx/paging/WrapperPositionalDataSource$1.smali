.class Landroidx/paging/WrapperPositionalDataSource$1;
.super Landroidx/paging/PositionalDataSource$LoadInitialCallback;
.source "WrapperPositionalDataSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/WrapperPositionalDataSource;->loadInitial(Landroidx/paging/PositionalDataSource$LoadInitialParams;Landroidx/paging/PositionalDataSource$LoadInitialCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PositionalDataSource$LoadInitialCallback<",
        "TA;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/paging/WrapperPositionalDataSource;

.field final synthetic val$callback:Landroidx/paging/PositionalDataSource$LoadInitialCallback;


# direct methods
.method public constructor <init>(Landroidx/paging/WrapperPositionalDataSource;Landroidx/paging/PositionalDataSource$LoadInitialCallback;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/paging/WrapperPositionalDataSource$1;->this$0:Landroidx/paging/WrapperPositionalDataSource;

    .line 3
    .line 4
    iput-object p2, p0, Landroidx/paging/WrapperPositionalDataSource$1;->val$callback:Landroidx/paging/PositionalDataSource$LoadInitialCallback;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/paging/PositionalDataSource$LoadInitialCallback;-><init>()V

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
.method public onResult(Ljava/util/List;I)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TA;>;I)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/paging/WrapperPositionalDataSource$1;->val$callback:Landroidx/paging/PositionalDataSource$LoadInitialCallback;

    iget-object v1, p0, Landroidx/paging/WrapperPositionalDataSource$1;->this$0:Landroidx/paging/WrapperPositionalDataSource;

    iget-object v1, v1, Landroidx/paging/WrapperPositionalDataSource;->mListFunction:Landroidx/arch/core/util/Function;

    invoke-static {v1, p1}, Landroidx/paging/DataSource;->convert(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Landroidx/paging/PositionalDataSource$LoadInitialCallback;->onResult(Ljava/util/List;I)V

    return-void
.end method

.method public onResult(Ljava/util/List;II)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TA;>;II)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/WrapperPositionalDataSource$1;->val$callback:Landroidx/paging/PositionalDataSource$LoadInitialCallback;

    iget-object v1, p0, Landroidx/paging/WrapperPositionalDataSource$1;->this$0:Landroidx/paging/WrapperPositionalDataSource;

    iget-object v1, v1, Landroidx/paging/WrapperPositionalDataSource;->mListFunction:Landroidx/arch/core/util/Function;

    invoke-static {v1, p1}, Landroidx/paging/DataSource;->convert(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Landroidx/paging/PositionalDataSource$LoadInitialCallback;->onResult(Ljava/util/List;II)V

    return-void
.end method
