.class public final enum Lcom/tencent/bugly/proguard/b0$b;
.super Ljava/lang/Enum;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tencent/bugly/proguard/b0$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/tencent/bugly/proguard/b0$b;

.field public static final enum c:Lcom/tencent/bugly/proguard/b0$b;

.field public static final enum d:Lcom/tencent/bugly/proguard/b0$b;

.field public static final synthetic e:[Lcom/tencent/bugly/proguard/b0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/b0$b;

    .line 3
    .line 4
    const-string v1, "FROM_ON_APPLICATION_CREATE_TIME_OUT"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/tencent/bugly/proguard/b0$b;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/bugly/proguard/b0$b;->b:Lcom/tencent/bugly/proguard/b0$b;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/bugly/proguard/b0$b;

    .line 13
    .line 14
    const-string v1, "FROM_WARM_LAUNCH"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/tencent/bugly/proguard/b0$b;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/tencent/bugly/proguard/b0$b;->c:Lcom/tencent/bugly/proguard/b0$b;

    .line 21
    .line 22
    new-instance v0, Lcom/tencent/bugly/proguard/b0$b;

    .line 23
    .line 24
    const-string v1, "FROM_APP_FULL_LAUNCH"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/tencent/bugly/proguard/b0$b;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/tencent/bugly/proguard/b0$b;->d:Lcom/tencent/bugly/proguard/b0$b;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/tencent/bugly/proguard/b0$b;->a()[Lcom/tencent/bugly/proguard/b0$b;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sput-object v0, Lcom/tencent/bugly/proguard/b0$b;->e:[Lcom/tencent/bugly/proguard/b0$b;

    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
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

.method public static synthetic a()[Lcom/tencent/bugly/proguard/b0$b;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/b0$b;->b:Lcom/tencent/bugly/proguard/b0$b;

    .line 3
    .line 4
    sget-object v1, Lcom/tencent/bugly/proguard/b0$b;->c:Lcom/tencent/bugly/proguard/b0$b;

    .line 5
    .line 6
    sget-object v2, Lcom/tencent/bugly/proguard/b0$b;->d:Lcom/tencent/bugly/proguard/b0$b;

    .line 7
    .line 8
    .line 9
    filled-new-array {v0, v1, v2}, [Lcom/tencent/bugly/proguard/b0$b;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/bugly/proguard/b0$b;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/b0$b;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/tencent/bugly/proguard/b0$b;

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

.method public static values()[Lcom/tencent/bugly/proguard/b0$b;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/b0$b;->e:[Lcom/tencent/bugly/proguard/b0$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/tencent/bugly/proguard/b0$b;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/tencent/bugly/proguard/b0$b;

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
