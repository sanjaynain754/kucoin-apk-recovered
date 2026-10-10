.class public final Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;
.super Ljava/lang/Object;


# instance fields
.field private final l1111l111111Il:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private l111l11111I1l:Landroid/hardware/display/DisplayManager;

.field private l111l11111lIl:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l1111l111111Il:Ljava/util/List;

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
.end method


# virtual methods
.method public final l1111l111111Il()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l111l11111lIl:I

    return v0
.end method

.method public final l1111l111111Il(Landroid/content/Context;Z)Z
    .locals 7

    .line 2
    const/4 p2, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l111l11111I1l:Landroid/hardware/display/DisplayManager;

    if-nez v0, :cond_0

    const-string v0, "display"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/display/DisplayManager;

    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l111l11111I1l:Landroid/hardware/display/DisplayManager;

    :cond_0
    iget-object p1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l111l11111I1l:Landroid/hardware/display/DisplayManager;

    if-nez p1, :cond_1

    return p2

    :cond_1
    invoke-virtual {p1}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object p1

    if-eqz p1, :cond_4

    array-length v0, p1

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    iget v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l111l11111lIl:I

    if-nez v0, :cond_2

    iput v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l111l11111lIl:I

    :cond_2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l1111l111111Il:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    array-length v0, p1

    move v2, p2

    :goto_0
    if-ge v2, v0, :cond_3

    aget-object v3, p1, v2

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v5, "flg"

    invoke-virtual {v3}, Landroid/view/Display;->getFlags()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v5, Landroid/view/Display;

    const-string v6, "mOwnerPackageName"

    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-string v6, "opn"

    invoke-virtual {v5, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :try_start_2
    iget-object v3, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l1111l111111Il:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return v1

    :catchall_1
    :cond_4
    return p2
.end method

.method public final l111l11111lIl()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l1111l111111Il:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    return-object v0
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
.end method
