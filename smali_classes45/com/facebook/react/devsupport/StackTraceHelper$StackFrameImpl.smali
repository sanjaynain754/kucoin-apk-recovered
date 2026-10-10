.class public Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;
.super Ljava/lang/Object;
.source "StackTraceHelper.java"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/StackFrame;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/StackTraceHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StackFrameImpl"
.end annotation


# instance fields
.field private final mColumn:I

.field private final mFile:Ljava/lang/String;

.field private final mFileName:Ljava/lang/String;

.field private final mIsCollapsed:Z

.field private final mLine:I

.field private final mMethod:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;-><init>(Ljava/lang/String;Ljava/lang/String;IIZ)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IILcom/facebook/react/devsupport/q0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;IIZ)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mFile:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mMethod:Ljava/lang/String;

    .line 7
    iput p3, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mLine:I

    .line 8
    iput p4, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mColumn:I

    if-eqz p1, :cond_0

    .line 9
    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    iput-object p1, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mFileName:Ljava/lang/String;

    .line 10
    iput-boolean p5, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mIsCollapsed:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IIZLcom/facebook/react/devsupport/q0;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;-><init>(Ljava/lang/String;Ljava/lang/String;IIZ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mFile:Ljava/lang/String;

    .line 14
    iput-object p2, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mFileName:Ljava/lang/String;

    .line 15
    iput-object p3, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mMethod:Ljava/lang/String;

    .line 16
    iput p4, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mLine:I

    .line 17
    iput p5, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mColumn:I

    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mIsCollapsed:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/facebook/react/devsupport/q0;)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public getColumn()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mColumn:I

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
    .line 18
.end method

.method public getFile()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mFile:Ljava/lang/String;

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

.method public getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mFileName:Ljava/lang/String;

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

.method public getLine()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mLine:I

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
    .line 18
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mMethod:Ljava/lang/String;

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

.method public isCollapsed()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->mIsCollapsed:Z

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
    .line 18
.end method

.method public toJSON()Lorg/json/JSONObject;
    .locals 11

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->getFile()Ljava/lang/String;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->getMethod()Ljava/lang/String;

    .line 10
    move-result-object v4

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->getLine()I

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object v6

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->getColumn()I

    .line 22
    move-result v1

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    move-result-object v8

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;->isCollapsed()Z

    .line 30
    move-result v1

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    move-result-object v10

    .line 35
    .line 36
    const-string v1, "file"

    .line 37
    .line 38
    const-string v3, "methodName"

    .line 39
    .line 40
    const-string v5, "lineNumber"

    .line 41
    .line 42
    const-string v7, "column"

    .line 43
    .line 44
    const-string v9, "collapse"

    .line 45
    .line 46
    .line 47
    invoke-static/range {v1 .. v10}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 52
    return-object v0
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method
