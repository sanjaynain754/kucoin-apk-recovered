.class public final Li7/f;
.super Ljava/lang/Object;
.source "PackageVersion.java"


# static fields
.field public static final a:Lcom/fasterxml/jackson/core/Version;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    const-string v0, "com.fasterxml.jackson.core"

    .line 3
    .line 4
    const-string v1, "jackson-core"

    .line 5
    .line 6
    const-string v2, "2.13.5"

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v0, v1}, Lcom/fasterxml/jackson/core/util/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/core/Version;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sput-object v0, Li7/f;->a:Lcom/fasterxml/jackson/core/Version;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
