.class public Lcom/facebook/soloader/SoLoaderULError;
.super Ljava/lang/UnsatisfiedLinkError;
.source "SoLoaderULError.java"


# annotations
.annotation build Lcom/facebook/soloader/DoNotStripAny;
.end annotation


# instance fields
.field private mSoName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/UnsatisfiedLinkError;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/facebook/soloader/SoLoaderULError;->mSoName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/facebook/soloader/SoLoaderULError;->mSoName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getSoName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/soloader/SoLoaderULError;->mSoName:Ljava/lang/String;

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
    .line 18
.end method
