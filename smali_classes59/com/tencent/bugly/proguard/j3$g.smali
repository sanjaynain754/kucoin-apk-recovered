.class public abstract Lcom/tencent/bugly/proguard/j3$g;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/j3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "g"
.end annotation


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/tencent/bugly/proguard/j3$g;->a:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/tencent/bugly/proguard/j3$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/j3$g;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/j3$g;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/j3$g;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public final a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Z
    .locals 1

    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/j3$g;->a:I

    iget p1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
