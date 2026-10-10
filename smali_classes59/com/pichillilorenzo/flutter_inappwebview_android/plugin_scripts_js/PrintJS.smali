.class public Lcom/pichillilorenzo/flutter_inappwebview_android/plugin_scripts_js/PrintJS;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PRINT_JS_PLUGIN_SCRIPT:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

.field public static final PRINT_JS_PLUGIN_SCRIPT_GROUP_NAME:Ljava/lang/String; = "IN_APP_WEBVIEW_PRINT_JS_PLUGIN_SCRIPT"

.field public static final PRINT_JS_SOURCE:Ljava/lang/String; = "window.print = function() {  if (window.top == null || window.top === window) {     window.flutter_inappwebview.callHandler(\'onPrintRequest\', window.location.href);  } else {     window.top.print();  }};"


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

    .line 3
    .line 4
    sget-object v3, Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;->AT_DOCUMENT_START:Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;

    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v6, 0x0

    .line 7
    .line 8
    const-string v1, "IN_APP_WEBVIEW_PRINT_JS_PLUGIN_SCRIPT"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v2, "window.print = function() {  if (window.top == null || window.top === window) {     window.flutter_inappwebview.callHandler(\'onPrintRequest\', window.location.href);  } else {     window.top.print();  }};"

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;Lcom/pichillilorenzo/flutter_inappwebview_android/types/ContentWorld;ZLjava/util/Set;)V

    .line 16
    .line 17
    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/plugin_scripts_js/PrintJS;->PRINT_JS_PLUGIN_SCRIPT:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

    .line 18
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method
