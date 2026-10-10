.class Landroidx/paging/DataSource$Factory$1;
.super Landroidx/paging/DataSource$Factory;
.source "DataSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/DataSource$Factory;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource$Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/DataSource$Factory<",
        "TKey;TToValue;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/paging/DataSource$Factory;

.field final synthetic val$function:Landroidx/arch/core/util/Function;


# direct methods
.method public constructor <init>(Landroidx/paging/DataSource$Factory;Landroidx/arch/core/util/Function;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/paging/DataSource$Factory$1;->this$0:Landroidx/paging/DataSource$Factory;

    .line 3
    .line 4
    iput-object p2, p0, Landroidx/paging/DataSource$Factory$1;->val$function:Landroidx/arch/core/util/Function;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/paging/DataSource$Factory;-><init>()V

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
.method public create()Landroidx/paging/DataSource;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/DataSource<",
            "TKey;TToValue;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/paging/DataSource$Factory$1;->this$0:Landroidx/paging/DataSource$Factory;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/paging/DataSource$Factory;->create()Landroidx/paging/DataSource;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/paging/DataSource$Factory$1;->val$function:Landroidx/arch/core/util/Function;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/paging/DataSource;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
