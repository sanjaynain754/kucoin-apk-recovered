.class public final enum Lcom/tencent/bugly/proguard/g4;
.super Ljava/lang/Enum;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tencent/bugly/proguard/g4;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/tencent/bugly/proguard/g4;

.field public static final synthetic d:[Lcom/tencent/bugly/proguard/g4;


# instance fields
.field public b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/g4;

    .line 3
    .line 4
    const-string v1, "INSTANCE"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/tencent/bugly/proguard/g4;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/bugly/proguard/g4;->c:Lcom/tencent/bugly/proguard/g4;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/tencent/bugly/proguard/g4;->a()[Lcom/tencent/bugly/proguard/g4;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lcom/tencent/bugly/proguard/g4;->d:[Lcom/tencent/bugly/proguard/g4;

    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    const/4 p1, 0x0

    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/g4;->b:Z

    .line 7
    return-void
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
.end method

.method public static synthetic a()[Lcom/tencent/bugly/proguard/g4;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/g4;->c:Lcom/tencent/bugly/proguard/g4;

    filled-new-array {v0}, [Lcom/tencent/bugly/proguard/g4;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/bugly/proguard/g4;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/g4;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/tencent/bugly/proguard/g4;

    .line 9
    return-object p0
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
.end method

.method public static values()[Lcom/tencent/bugly/proguard/g4;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/g4;->d:[Lcom/tencent/bugly/proguard/g4;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/tencent/bugly/proguard/g4;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/tencent/bugly/proguard/g4;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/g4;->b:Z

    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/g4;->b:Z

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
.end method
