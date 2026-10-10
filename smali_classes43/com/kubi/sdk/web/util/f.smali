.class public final Lcom/kubi/sdk/web/util/f;
.super Ljava/lang/Object;
.source "MimeUtils.java"


# static fields
.field public static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/kubi/sdk/web/util/f;->a:Ljava/util/Map;

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/kubi/sdk/web/util/f;->b:Ljava/util/Map;

    .line 3
    const-string v0, "application/javascript"

    const-string v1, "js"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    const-string v0, "application/json"

    const-string v1, "json"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    const-string v0, "application/andrew-inset"

    const-string v1, "ez"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    const-string v0, "application/dsptype"

    const-string v1, "tsp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    const-string v0, "application/epub+zip"

    const-string v1, "epub"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    const-string v0, "application/hta"

    const-string v1, "hta"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    const-string v0, "application/mac-binhex40"

    const-string v1, "hqx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    const-string v0, "application/mathematica"

    const-string v1, "nb"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    const-string v0, "application/msaccess"

    const-string v1, "mdb"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    const-string v0, "application/oda"

    const-string v1, "oda"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    const-string v0, "application/ogg"

    const-string v1, "ogx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    const-string v0, "application/pdf"

    const-string v1, "pdf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    const-string v0, "application/pgp-keys"

    const-string v1, "key"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    const-string v0, "application/pgp-signature"

    const-string v1, "pgp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    const-string v0, "application/pics-rules"

    const-string v1, "prf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    const-string v0, "application/pkix-cert"

    const-string v1, "cer"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    const-string v0, "application/rar"

    const-string v1, "rar"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    const-string v0, "application/rdf+xml"

    const-string v1, "rdf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    const-string v0, "application/rss+xml"

    const-string v1, "rss"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    const-string v0, "application/zip"

    const-string v1, "zip"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    const-string v0, "application/vnd.android.package-archive"

    const-string v1, "apk"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    const-string v0, "application/vnd.cinderella"

    const-string v1, "cdy"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    const-string v0, "application/vnd.ms-pki.stl"

    const-string v1, "stl"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    const-string v0, "application/vnd.oasis.opendocument.database"

    const-string v1, "odb"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    const-string v0, "application/vnd.oasis.opendocument.formula"

    const-string v1, "odf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    const-string v0, "application/vnd.oasis.opendocument.graphics"

    const-string v1, "odg"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    const-string v0, "application/vnd.oasis.opendocument.graphics-template"

    const-string v1, "otg"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const-string v0, "application/vnd.oasis.opendocument.image"

    const-string v1, "odi"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    const-string v0, "application/vnd.oasis.opendocument.presentation"

    const-string v1, "odp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    const-string v0, "application/vnd.oasis.opendocument.presentation-template"

    const-string v1, "otp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    const-string v0, "application/vnd.oasis.opendocument.spreadsheet"

    const-string v1, "ods"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string v0, "application/vnd.oasis.opendocument.spreadsheet-template"

    const-string v1, "ots"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    const-string v0, "application/vnd.oasis.opendocument.text"

    const-string v1, "odt"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    const-string v0, "application/vnd.oasis.opendocument.text-master"

    const-string v1, "odm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    const-string v0, "application/vnd.oasis.opendocument.text-template"

    const-string v1, "ott"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    const-string v0, "application/vnd.oasis.opendocument.text-web"

    const-string v1, "oth"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    const-string v0, "application/vnd.google-earth.kml+xml"

    const-string v1, "kml"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const-string v0, "application/vnd.google-earth.kmz"

    const-string v1, "kmz"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    const-string v0, "doc"

    const-string v1, "application/msword"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    const-string v0, "dot"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const-string v0, "application/vnd.openxmlformats-officedocument.wordprocessingml.document"

    const-string v1, "docx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const-string v0, "application/vnd.openxmlformats-officedocument.wordprocessingml.template"

    const-string v1, "dotx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const-string v0, "xls"

    const-string v1, "application/vnd.ms-excel"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string v0, "xlt"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const-string v0, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"

    const-string v1, "xlsx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    const-string v0, "application/vnd.openxmlformats-officedocument.spreadsheetml.template"

    const-string v1, "xltx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const-string v0, "ppt"

    const-string v1, "application/vnd.ms-powerpoint"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const-string v0, "pot"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    const-string v0, "pps"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    const-string v0, "application/vnd.openxmlformats-officedocument.presentationml.presentation"

    const-string v1, "pptx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const-string v0, "application/vnd.openxmlformats-officedocument.presentationml.template"

    const-string v1, "potx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const-string v0, "application/vnd.openxmlformats-officedocument.presentationml.slideshow"

    const-string v1, "ppsx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    const-string v0, "application/vnd.rim.cod"

    const-string v1, "cod"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const-string v0, "application/vnd.smaf"

    const-string v1, "mmf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v0, "application/vnd.stardivision.calc"

    const-string v1, "sdc"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string v0, "application/vnd.stardivision.draw"

    const-string v1, "sda"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const-string v0, "sdd"

    const-string v1, "application/vnd.stardivision.impress"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string v0, "sdp"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const-string v0, "application/vnd.stardivision.math"

    const-string v1, "smf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v0, "application/vnd.stardivision.writer"

    const-string v1, "sdw"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string v0, "application/vnd.stardivision.writer"

    const-string v1, "vor"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v0, "application/vnd.stardivision.writer-global"

    const-string v1, "sgl"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v0, "application/vnd.sun.xml.calc"

    const-string v1, "sxc"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v0, "application/vnd.sun.xml.calc.template"

    const-string v1, "stc"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v0, "application/vnd.sun.xml.draw"

    const-string v1, "sxd"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const-string v0, "application/vnd.sun.xml.draw.template"

    const-string v1, "std"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const-string v0, "application/vnd.sun.xml.impress"

    const-string v1, "sxi"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const-string v0, "application/vnd.sun.xml.impress.template"

    const-string v1, "sti"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v0, "application/vnd.sun.xml.math"

    const-string v1, "sxm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    const-string v0, "application/vnd.sun.xml.writer"

    const-string v1, "sxw"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string v0, "application/vnd.sun.xml.writer.global"

    const-string v1, "sxg"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    const-string v0, "application/vnd.sun.xml.writer.template"

    const-string v1, "stw"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    const-string v0, "application/vnd.visio"

    const-string v1, "vsd"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v0, "application/vnd.youtube.yt"

    const-string v1, "yt"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v0, "application/x-abiword"

    const-string v1, "abw"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string v0, "application/x-apple-diskimage"

    const-string v1, "dmg"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string v0, "application/x-bcpio"

    const-string v1, "bcpio"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const-string v0, "application/x-bittorrent"

    const-string v1, "torrent"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    const-string v0, "application/x-cdf"

    const-string v1, "cdf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const-string v0, "application/x-cdlink"

    const-string v1, "vcd"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string v0, "application/x-chess-pgn"

    const-string v1, "pgn"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string v0, "application/x-cpio"

    const-string v1, "cpio"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const-string v0, "application/x-debian-package"

    const-string v1, "deb"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string v0, "application/x-debian-package"

    const-string v1, "udeb"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    const-string v0, "dcr"

    const-string v1, "application/x-director"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "dir"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v0, "dxr"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v0, "application/x-dms"

    const-string v1, "dms"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const-string v0, "application/x-doom"

    const-string v1, "wad"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    const-string v0, "application/x-dvi"

    const-string v1, "dvi"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v0, "pfa"

    const-string v1, "application/x-font"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v0, "pfb"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    const-string v0, "gsf"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const-string v0, "pcf"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    const-string v0, "pcf.Z"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    const-string v0, "application/x-freemind"

    const-string v1, "mm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string v0, "application/x-futuresplash"

    const-string v1, "spl"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string v0, "application/futuresplash"

    const-string v1, "spl"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const-string v0, "application/x-gnumeric"

    const-string v1, "gnumeric"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    const-string v0, "application/x-go-sgf"

    const-string v1, "sgf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const-string v0, "application/x-graphing-calculator"

    const-string v1, "gcf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const-string v0, "tgz"

    const-string v1, "application/x-gtar"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v0, "gtar"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    const-string v0, "taz"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const-string v0, "application/x-hdf"

    const-string v1, "hdf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    const-string v0, "application/x-hwp"

    const-string v1, "hwp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const-string v0, "application/x-ica"

    const-string v1, "ica"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const-string v0, "application/x-internet-signup"

    const-string v1, "ins"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v0, "application/x-internet-signup"

    const-string v1, "isp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const-string v0, "application/x-iphone"

    const-string v1, "iii"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const-string v0, "application/x-iso9660-image"

    const-string v1, "iso"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    const-string v0, "application/x-jmol"

    const-string v1, "jmz"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    const-string v0, "application/x-kchart"

    const-string v1, "chrt"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const-string v0, "application/x-killustrator"

    const-string v1, "kil"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const-string v0, "skp"

    const-string v1, "application/x-koan"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    const-string v0, "skd"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    const-string v0, "skt"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    const-string v0, "skm"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    const-string v0, "application/x-kpresenter"

    const-string v1, "kpr"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const-string v0, "application/x-kpresenter"

    const-string v1, "kpt"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const-string v0, "application/x-kspread"

    const-string v1, "ksp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    const-string v0, "application/x-kword"

    const-string v1, "kwd"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const-string v0, "application/x-kword"

    const-string v1, "kwt"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    const-string v0, "application/x-latex"

    const-string v1, "latex"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    const-string v0, "application/x-lha"

    const-string v1, "lha"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const-string v0, "application/x-lzh"

    const-string v1, "lzh"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    const-string v0, "application/x-lzx"

    const-string v1, "lzx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    const-string v0, "frm"

    const-string v1, "application/x-maker"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const-string v0, "maker"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    const-string v0, "frame"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    const-string v0, "fb"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const-string v0, "book"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    const-string v0, "fbdoc"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const-string v0, "application/x-mif"

    const-string v1, "mif"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v0, "application/x-ms-wmd"

    const-string v1, "wmd"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string v0, "application/x-ms-wmz"

    const-string v1, "wmz"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v0, "application/x-msi"

    const-string v1, "msi"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const-string v0, "application/x-ns-proxy-autoconfig"

    const-string v1, "pac"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    const-string v0, "application/x-nwc"

    const-string v1, "nwc"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-string v0, "application/x-object"

    const-string v1, "o"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    const-string v0, "application/x-oz-application"

    const-string v1, "oza"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const-string v0, "application/x-pem-file"

    const-string v1, "pem"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    const-string v0, "application/x-pkcs12"

    const-string v1, "p12"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const-string v0, "application/x-pkcs12"

    const-string v1, "pfx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    const-string v0, "application/x-pkcs7-certreqresp"

    const-string v1, "p7r"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const-string v0, "application/x-pkcs7-crl"

    const-string v1, "crl"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    const-string v0, "application/x-quicktimeplayer"

    const-string v1, "qtl"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    const-string v0, "application/x-shar"

    const-string v1, "shar"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const-string v0, "application/x-shockwave-flash"

    const-string v1, "swf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string v0, "application/x-stuffit"

    const-string v1, "sit"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    const-string v0, "application/x-sv4cpio"

    const-string v1, "sv4cpio"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    const-string v0, "application/x-sv4crc"

    const-string v1, "sv4crc"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    const-string v0, "application/x-tar"

    const-string v1, "tar"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v0, "application/x-texinfo"

    const-string v1, "texinfo"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const-string v0, "application/x-texinfo"

    const-string v1, "texi"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    const-string v0, "application/x-troff"

    const-string v1, "t"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string v0, "application/x-troff"

    const-string v1, "roff"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v0, "application/x-troff-man"

    const-string v1, "man"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const-string v0, "application/x-ustar"

    const-string v1, "ustar"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const-string v0, "application/x-wais-source"

    const-string v1, "src"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    const-string v0, "application/x-wingz"

    const-string v1, "wz"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    const-string v0, "application/x-webarchive"

    const-string v1, "webarchive"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    const-string v0, "application/x-webarchive-xml"

    const-string v1, "webarchivexml"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v0, "application/x-x509-ca-cert"

    const-string v1, "crt"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string v0, "application/x-x509-user-cert"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string v0, "application/x-x509-server-cert"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    const-string v0, "application/x-xcf"

    const-string v1, "xcf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    const-string v0, "application/x-xfig"

    const-string v1, "fig"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    const-string v0, "application/xhtml+xml"

    const-string v1, "xhtml"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    const-string v0, "font/woff"

    const-string v1, "woff"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string v0, "font/woff2"

    const-string v1, "woff2"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    const-string v0, "video/3gpp"

    const-string v1, "3gpp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const-string v0, "video/3gpp"

    const-string v1, "3gp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    const-string v0, "video/3gpp2"

    const-string v1, "3gpp2"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const-string v0, "video/3gpp2"

    const-string v1, "3g2"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    const-string v0, "audio/3gpp"

    const-string v1, "3gpp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    const-string v0, "audio/aac"

    const-string v1, "aac"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const-string v0, "audio/aac-adts"

    const-string v1, "aac"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    const-string v0, "audio/amr"

    const-string v1, "amr"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    const-string v0, "audio/amr-wb"

    const-string v1, "awb"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const-string v0, "audio/basic"

    const-string v1, "snd"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    const-string v0, "audio/flac"

    const-string v1, "flac"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    const-string v0, "application/x-flac"

    const-string v1, "flac"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    const-string v0, "audio/imelody"

    const-string v1, "imy"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    const-string v0, "mid"

    const-string v1, "audio/midi"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    const-string v0, "midi"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    const-string v0, "ota"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    const-string v0, "kar"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string v0, "rtttl"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const-string v0, "xmf"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-string v0, "audio/mobile-xmf"

    const-string v1, "mxmf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-string v0, "mp3"

    const-string v1, "audio/mpeg"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string v0, "mpga"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    const-string v0, "mpega"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const-string v0, "mp2"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    const-string v0, "m4a"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    const-string v0, "audio/mpegurl"

    const-string v1, "m3u"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    const-string v0, "oga"

    const-string v1, "audio/ogg"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    const-string v0, "ogg"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    const-string v0, "spx"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    const-string v0, "audio/prs.sid"

    const-string v1, "sid"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    const-string v0, "aif"

    const-string v1, "audio/x-aiff"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    const-string v0, "aiff"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    const-string v0, "aifc"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    const-string v0, "audio/x-gsm"

    const-string v1, "gsm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    const-string v0, "audio/x-matroska"

    const-string v1, "mka"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    const-string v0, "audio/x-mpegurl"

    const-string v1, "m3u"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    const-string v0, "audio/x-ms-wma"

    const-string v1, "wma"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    const-string v0, "audio/x-ms-wax"

    const-string v1, "wax"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    const-string v0, "ra"

    const-string v1, "audio/x-pn-realaudio"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    const-string v0, "rm"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    const-string v0, "ram"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    const-string v0, "audio/x-realaudio"

    const-string v1, "ra"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    const-string v0, "audio/x-scpls"

    const-string v1, "pls"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    const-string v0, "audio/x-sd2"

    const-string v1, "sd2"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    const-string v0, "audio/x-wav"

    const-string v1, "wav"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    const-string v0, "image/x-ms-bmp"

    const-string v1, "bmp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    const-string v0, "image/bmp"

    const-string v1, "bmp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    const-string v0, "image/gif"

    const-string v1, "gif"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    const-string v0, "image/x-icon"

    const-string v1, "ico"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    const-string v0, "image/ico"

    const-string v1, "cur"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    const-string v0, "image/ico"

    const-string v1, "ico"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    const-string v0, "image/ief"

    const-string v1, "ief"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    const-string v0, "jpg"

    const-string v1, "image/jpeg"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    const-string v0, "jpeg"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    const-string v0, "jpe"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    const-string v0, "image/pcx"

    const-string v1, "pcx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    const-string v0, "image/png"

    const-string v1, "png"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    const-string v0, "image/svg+xml"

    const-string v1, "svg"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    const-string v0, "image/svg+xml"

    const-string v1, "svgz"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    const-string v0, "image/tiff"

    const-string v1, "tiff"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    const-string v0, "image/tiff"

    const-string v1, "tif"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    const-string v0, "image/vnd.djvu"

    const-string v1, "djvu"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    const-string v0, "image/vnd.djvu"

    const-string v1, "djv"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    const-string v0, "image/vnd.wap.wbmp"

    const-string v1, "wbmp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    const-string v0, "image/webp"

    const-string v1, "webp"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    const-string v0, "image/x-adobe-dng"

    const-string v1, "dng"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    const-string v0, "image/x-canon-cr2"

    const-string v1, "cr2"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    const-string v0, "image/x-cmu-raster"

    const-string v1, "ras"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    const-string v0, "image/x-coreldraw"

    const-string v1, "cdr"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    const-string v0, "image/x-coreldrawpattern"

    const-string v1, "pat"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    const-string v0, "image/x-coreldrawtemplate"

    const-string v1, "cdt"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    const-string v0, "image/x-corelphotopaint"

    const-string v1, "cpt"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    const-string v0, "image/x-fuji-raf"

    const-string v1, "raf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    const-string v0, "image/x-jg"

    const-string v1, "art"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const-string v0, "image/x-jng"

    const-string v1, "jng"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    const-string v0, "image/x-nikon-nef"

    const-string v1, "nef"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    const-string v0, "image/x-nikon-nrw"

    const-string v1, "nrw"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    const-string v0, "image/x-olympus-orf"

    const-string v1, "orf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    const-string v0, "image/x-panasonic-rw2"

    const-string v1, "rw2"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    const-string v0, "image/x-pentax-pef"

    const-string v1, "pef"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const-string v0, "image/x-photoshop"

    const-string v1, "psd"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    const-string v0, "image/x-portable-anymap"

    const-string v1, "pnm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    const-string v0, "image/x-portable-bitmap"

    const-string v1, "pbm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    const-string v0, "image/x-portable-graymap"

    const-string v1, "pgm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    const-string v0, "image/x-portable-pixmap"

    const-string v1, "ppm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    const-string v0, "image/x-samsung-srw"

    const-string v1, "srw"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    const-string v0, "image/x-sony-arw"

    const-string v1, "arw"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    const-string v0, "image/x-rgb"

    const-string v1, "rgb"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    const-string v0, "image/x-xbitmap"

    const-string v1, "xbm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    const-string v0, "image/x-xpixmap"

    const-string v1, "xpm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    const-string v0, "image/x-xwindowdump"

    const-string v1, "xwd"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    const-string v0, "model/iges"

    const-string v1, "igs"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    const-string v0, "model/iges"

    const-string v1, "iges"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    const-string v0, "msh"

    const-string v1, "model/mesh"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    const-string v0, "mesh"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    const-string v0, "silo"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    const-string v0, "text/calendar"

    const-string v1, "ics"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    const-string v0, "text/calendar"

    const-string v1, "icz"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    const-string v0, "text/comma-separated-values"

    const-string v1, "csv"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    const-string v0, "text/css"

    const-string v1, "css"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    const-string v0, "text/html"

    const-string v1, "htm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    const-string v0, "text/html"

    const-string v1, "html"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    const-string v0, "text/h323"

    const-string v1, "323"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    const-string v0, "text/iuls"

    const-string v1, "uls"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    const-string v0, "text/mathml"

    const-string v1, "mml"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    const-string v0, "txt"

    const-string v1, "text/plain"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    const-string v0, "asc"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    const-string v0, "text"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    const-string v0, "diff"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    const-string v0, "po"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const-string v0, "text/richtext"

    const-string v1, "rtx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    const-string v0, "text/rtf"

    const-string v1, "rtf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    const-string v0, "text/text"

    const-string v1, "phps"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v0, "text/tab-separated-values"

    const-string v1, "tsv"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string v0, "text/xml"

    const-string v1, "xml"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v0, "text/x-bibtex"

    const-string v1, "bib"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    const-string v0, "text/x-boo"

    const-string v1, "boo"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    const-string v0, "hpp"

    const-string v1, "text/x-c++hdr"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    const-string v0, "h++"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    const-string v0, "hxx"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    const-string v0, "hh"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const-string v0, "cpp"

    const-string v1, "text/x-c++src"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    const-string v0, "c++"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    const-string v0, "cc"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    const-string v0, "cxx"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    const-string v0, "text/x-chdr"

    const-string v1, "h"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    const-string v0, "text/x-component"

    const-string v1, "htc"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    const-string v0, "text/x-csh"

    const-string v1, "csh"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    const-string v0, "text/x-csrc"

    const-string v1, "c"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    const-string v0, "text/x-dsrc"

    const-string v1, "d"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    const-string v0, "text/x-haskell"

    const-string v1, "hs"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const-string v0, "text/x-java"

    const-string v1, "java"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    const-string v0, "text/x-literate-haskell"

    const-string v1, "lhs"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    const-string v0, "text/x-moc"

    const-string v1, "moc"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    const-string v0, "text/x-pascal"

    const-string v1, "p"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    const-string v0, "text/x-pascal"

    const-string v1, "pas"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    const-string v0, "text/x-pcs-gcd"

    const-string v1, "gcd"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    const-string v0, "text/x-setext"

    const-string v1, "etx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    const-string v0, "text/x-tcl"

    const-string v1, "tcl"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    const-string v0, "tex"

    const-string v1, "text/x-tex"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    const-string v0, "ltx"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    const-string v0, "sty"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    const-string v0, "cls"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    const-string v0, "text/x-vcalendar"

    const-string v1, "vcs"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    const-string v0, "text/x-vcard"

    const-string v1, "vcf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    const-string v0, "video/avi"

    const-string v1, "avi"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    const-string v0, "video/dl"

    const-string v1, "dl"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    const-string v0, "video/dv"

    const-string v1, "dif"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    const-string v0, "video/dv"

    const-string v1, "dv"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    const-string v0, "video/fli"

    const-string v1, "fli"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    const-string v0, "video/m4v"

    const-string v1, "m4v"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    const-string v0, "video/mp2ts"

    const-string v1, "ts"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    const-string v0, "mpeg"

    const-string v1, "video/mpeg"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    const-string v0, "mpg"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    const-string v0, "mpe"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    const-string v0, "video/mp4"

    const-string v2, "mp4"

    invoke-static {v0, v2}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    const-string v0, "VOB"

    invoke-static {v1, v0}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    const-string v0, "video/ogg"

    const-string v1, "ogv"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    const-string v0, "video/quicktime"

    const-string v1, "qt"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    const-string v0, "video/quicktime"

    const-string v1, "mov"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    const-string v0, "video/vnd.mpegurl"

    const-string v1, "mxu"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    const-string v0, "video/webm"

    const-string v1, "webm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    const-string v0, "video/x-la-asf"

    const-string v1, "lsf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    const-string v0, "video/x-la-asf"

    const-string v1, "lsx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    const-string v0, "video/x-matroska"

    const-string v1, "mkv"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    const-string v0, "video/x-mng"

    const-string v1, "mng"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    const-string v0, "video/x-ms-asf"

    const-string v1, "asf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    const-string v0, "video/x-ms-asf"

    const-string v1, "asx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    const-string v0, "video/x-ms-wm"

    const-string v1, "wm"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    const-string v0, "video/x-ms-wmv"

    const-string v1, "wmv"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    const-string v0, "video/x-ms-wmx"

    const-string v1, "wmx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    const-string v0, "video/x-ms-wvx"

    const-string v1, "wvx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    const-string v0, "video/x-sgi-movie"

    const-string v1, "movie"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const-string v0, "video/x-webex"

    const-string v1, "wrf"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    const-string v0, "x-conference/x-cooltalk"

    const-string v1, "ice"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    const-string v0, "x-epoc/x-sisx-app"

    const-string v1, "sisx"

    invoke-static {v0, v1}, Lcom/kubi/sdk/web/util/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/web/util/f;->a:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/kubi/sdk/web/util/f;->b:Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    :cond_1
    return-void
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
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    sget-object v0, Lcom/kubi/sdk/web/util/f;->b:Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    check-cast p0, Ljava/lang/String;

    .line 24
    return-object p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 26
    return-object p0
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
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
.end method
