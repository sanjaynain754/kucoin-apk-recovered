.class public final Ljumio/core/A1;
.super Ljumio/core/C1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "\n\t\tuniform mat4 uTransMatrix;\n\t\tattribute vec4 aPosition;\n\t\tvoid main() {\n\t\t    gl_Position = uTransMatrix * aPosition;\n\t\t}\n\t"

    .line 3
    .line 4
    const-string v1, "\n\t\tprecision mediump float;\n\t\tuniform float uAlphaScale;\n\t\tvoid main() {\n\t\t    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n\t\t}\n\t"

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Ljumio/core/C1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method
