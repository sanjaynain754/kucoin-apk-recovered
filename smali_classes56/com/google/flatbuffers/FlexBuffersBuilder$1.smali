.class Lcom/google/flatbuffers/FlexBuffersBuilder$1;
.super Ljava/lang/Object;
.source "FlexBuffersBuilder.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/FlexBuffersBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/google/flatbuffers/FlexBuffersBuilder$Value;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/flatbuffers/FlexBuffersBuilder;


# direct methods
.method public constructor <init>(Lcom/google/flatbuffers/FlexBuffersBuilder;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$1;->this$0:Lcom/google/flatbuffers/FlexBuffersBuilder;

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
    .line 24
.end method


# virtual methods
.method public compare(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;Lcom/google/flatbuffers/FlexBuffersBuilder$Value;)I
    .locals 2

    .line 2
    iget p1, p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->key:I

    .line 3
    iget p2, p2, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;->key:I

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$1;->this$0:Lcom/google/flatbuffers/FlexBuffersBuilder;

    invoke-static {v0}, Lcom/google/flatbuffers/FlexBuffersBuilder;->access$000(Lcom/google/flatbuffers/FlexBuffersBuilder;)Lcom/google/flatbuffers/ReadWriteBuf;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/flatbuffers/FlexBuffersBuilder$1;->this$0:Lcom/google/flatbuffers/FlexBuffersBuilder;

    invoke-static {v1}, Lcom/google/flatbuffers/FlexBuffersBuilder;->access$000(Lcom/google/flatbuffers/FlexBuffersBuilder;)Lcom/google/flatbuffers/ReadWriteBuf;

    move-result-object v1

    invoke-interface {v1, p2}, Lcom/google/flatbuffers/ReadBuf;->get(I)B

    move-result v1

    if-nez v0, :cond_1

    sub-int/2addr v0, v1

    return v0

    :cond_1
    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    if-eq v0, v1, :cond_0

    sub-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    check-cast p2, Lcom/google/flatbuffers/FlexBuffersBuilder$Value;

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/FlexBuffersBuilder$1;->compare(Lcom/google/flatbuffers/FlexBuffersBuilder$Value;Lcom/google/flatbuffers/FlexBuffersBuilder$Value;)I

    move-result p1

    return p1
.end method
