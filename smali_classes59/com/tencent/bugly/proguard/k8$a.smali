.class public final enum Lcom/tencent/bugly/proguard/k8$a;
.super Ljava/lang/Enum;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/k8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tencent/bugly/proguard/k8$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/tencent/bugly/proguard/k8$a;

.field public static final enum c:Lcom/tencent/bugly/proguard/k8$a;

.field public static final synthetic d:[Lcom/tencent/bugly/proguard/k8$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/k8$a;

    .line 3
    .line 4
    const-string v1, "FROM_LOCAL"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/tencent/bugly/proguard/k8$a;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/bugly/proguard/k8$a;->b:Lcom/tencent/bugly/proguard/k8$a;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/bugly/proguard/k8$a;

    .line 13
    .line 14
    const-string v1, "FROM_SERVICE"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/tencent/bugly/proguard/k8$a;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/tencent/bugly/proguard/k8$a;->c:Lcom/tencent/bugly/proguard/k8$a;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/tencent/bugly/proguard/k8$a;->a()[Lcom/tencent/bugly/proguard/k8$a;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sput-object v0, Lcom/tencent/bugly/proguard/k8$a;->d:[Lcom/tencent/bugly/proguard/k8$a;

    .line 27
    return-void
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

.method public static synthetic a()[Lcom/tencent/bugly/proguard/k8$a;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/k8$a;->b:Lcom/tencent/bugly/proguard/k8$a;

    .line 3
    .line 4
    sget-object v1, Lcom/tencent/bugly/proguard/k8$a;->c:Lcom/tencent/bugly/proguard/k8$a;

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [Lcom/tencent/bugly/proguard/k8$a;

    .line 8
    move-result-object v0

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

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/bugly/proguard/k8$a;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/k8$a;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/tencent/bugly/proguard/k8$a;

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

.method public static values()[Lcom/tencent/bugly/proguard/k8$a;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/k8$a;->d:[Lcom/tencent/bugly/proguard/k8$a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/tencent/bugly/proguard/k8$a;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/tencent/bugly/proguard/k8$a;

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
