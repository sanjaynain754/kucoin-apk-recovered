.class public final Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;
.super Ljava/lang/Object;
.source "ReactRootViewTagGenerator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0007\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;",
        "",
        "<init>",
        "()V",
        "ROOT_VIEW_TAG_INCREMENT",
        "",
        "nextRootViewTag",
        "getNextRootViewTag",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReactRootViewTagGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactRootViewTagGenerator.kt\ncom/facebook/react/uimanager/ReactRootViewTagGenerator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final ROOT_VIEW_TAG_INCREMENT:I = 0xa

.field private static nextRootViewTag:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;->INSTANCE:Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;

    .line 8
    const/4 v0, 0x1

    .line 9
    .line 10
    sput v0, Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;->nextRootViewTag:I

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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

.method public static final declared-synchronized getNextRootViewTag()I
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget v1, Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;->nextRootViewTag:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0xa

    .line 8
    .line 9
    sput v2, Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;->nextRootViewTag:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v1
    .line 15
    .line 16
    .line 17
    .line 18
.end method
