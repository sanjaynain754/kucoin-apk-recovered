.class public final Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1;
.super Ljava/lang/Object;
.source "WritableMapBuffer.kt"

# interfaces
.implements Ljava/util/Iterator;
.implements Lkotlin/jvm/internal/markers/KMappedMarker;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;",
        ">;",
        "Lkotlin/jvm/internal/markers/KMappedMarker;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\t\u0010\u000b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "com/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1",
        "",
        "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;",
        "count",
        "",
        "getCount",
        "()I",
        "setCount",
        "(I)V",
        "hasNext",
        "",
        "next",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private count:I

.field final synthetic this$0:Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;


# direct methods
.method public constructor <init>(Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1;->this$0:Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final getCount()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1;->count:I

    .line 3
    return v0
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
.end method

.method public hasNext()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1;->count:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1;->this$0:Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;->access$getValues$p(Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;)Landroid/util/SparseArray;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 12
    move-result v1

    .line 13
    .line 14
    if-ge v0, v1, :cond_0

    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public next()Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;
    .locals 4

    .line 2
    new-instance v0, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$MapBufferEntry;

    iget-object v1, p0, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1;->this$0:Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;

    iget v2, p0, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1;->count:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1;->count:I

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$MapBufferEntry;-><init>(Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;I)V

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1;->next()Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 3
    .line 4
    const-string v1, "Operation is not supported for read-only collection"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 8
    throw v0
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

.method public final setCount(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1;->count:I

    .line 3
    return-void
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
