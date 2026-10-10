.class final Lcom/tencent/liteav/base/ContextUtils$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/base/ContextUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static a:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->access$000()Landroid/content/SharedPreferences;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Lcom/tencent/liteav/base/ContextUtils$a;->a:Landroid/content/SharedPreferences;

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
.end method

.method public static synthetic a()Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/liteav/base/ContextUtils$a;->a:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public static synthetic a(Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences;
    .locals 0

    .line 2
    sput-object p0, Lcom/tencent/liteav/base/ContextUtils$a;->a:Landroid/content/SharedPreferences;

    return-object p0
.end method
