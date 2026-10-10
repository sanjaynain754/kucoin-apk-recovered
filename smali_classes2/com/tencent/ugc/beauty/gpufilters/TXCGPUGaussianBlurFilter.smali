.class public Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter;
.super Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilterChain;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;
    }
.end annotation


# instance fields
.field private final mHeightFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;

.field private final mWidthFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 1
    invoke-direct {p0, v0}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter;-><init>(F)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 3

    .line 2
    invoke-direct {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilterChain;-><init>()V

    .line 3
    new-instance v0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;

    invoke-direct {v0}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;-><init>()V

    iput-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter;->mWidthFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;

    .line 4
    new-instance v1, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;

    invoke-direct {v1}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;-><init>()V

    iput-object v1, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter;->mHeightFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, p1, v2}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;->a(FF)V

    .line 6
    invoke-virtual {v1, v2, p1}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;->a(FF)V

    .line 7
    invoke-virtual {p0, v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilterChain;->addFilter(Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;)V

    .line 8
    invoke-virtual {p0, v1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilterChain;->addFilter(Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;)V

    return-void
.end method


# virtual methods
.method public setBlurSize(F)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter;->mWidthFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, v1}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;->a(FF)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter;->mHeightFilter:Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Lcom/tencent/ugc/beauty/gpufilters/TXCGPUGaussianBlurFilter$a;->a(FF)V

    .line 12
    return-void
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
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method
