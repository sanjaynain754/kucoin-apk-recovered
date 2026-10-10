.class Lcom/tencent/imsdk/group/GroupManager$GroupManagerHolder;
.super Ljava/lang/Object;
.source "GroupManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/imsdk/group/GroupManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GroupManagerHolder"
.end annotation


# static fields
.field private static final groupManager:Lcom/tencent/imsdk/group/GroupManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/imsdk/group/GroupManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/imsdk/group/GroupManager;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/imsdk/group/GroupManager$GroupManagerHolder;->groupManager:Lcom/tencent/imsdk/group/GroupManager;

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
.end method

.method public static synthetic access$000()Lcom/tencent/imsdk/group/GroupManager;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/imsdk/group/GroupManager$GroupManagerHolder;->groupManager:Lcom/tencent/imsdk/group/GroupManager;

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
.end method
