.class public Lcom/pichillilorenzo/flutter_inappwebview_android/plugin_scripts_js/InterceptAjaxRequestJS;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final FLAG_VARIABLE_FOR_INTERCEPT_ONLY_ASYNC_AJAX_REQUESTS_JS_SOURCE:Ljava/lang/String; = "flutter_inappwebview._interceptOnlyAsyncAjaxRequests"

.field public static final FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE:Ljava/lang/String; = "flutter_inappwebview._useShouldInterceptAjaxRequest"

.field public static final INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

.field public static final INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT_GROUP_NAME:Ljava/lang/String; = "IN_APP_WEBVIEW_INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT"

.field public static final INTERCEPT_AJAX_REQUEST_JS_SOURCE:Ljava/lang/String; = "(function(ajax) {  var w = (window.top == null || window.top === window) ? window : window.top;  w.flutter_inappwebview._useShouldInterceptAjaxRequest = true;  var send = ajax.prototype.send;  var open = ajax.prototype.open;  var setRequestHeader = ajax.prototype.setRequestHeader;  ajax.prototype._flutter_inappwebview_url = null;  ajax.prototype._flutter_inappwebview_method = null;  ajax.prototype._flutter_inappwebview_isAsync = null;  ajax.prototype._flutter_inappwebview_user = null;  ajax.prototype._flutter_inappwebview_password = null;  ajax.prototype._flutter_inappwebview_password = null;  ajax.prototype._flutter_inappwebview_already_onreadystatechange_wrapped = false;  ajax.prototype._flutter_inappwebview_request_headers = {};  function convertRequestResponse(request, callback) {    if (request.response != null && request.responseType != null) {      switch (request.responseType) {        case \'arraybuffer\':          callback(new Uint8Array(request.response));          return;        case \'blob\':          const reader = new FileReader();          reader.addEventListener(\'loadend\', function() {              callback(new Uint8Array(reader.result));          });          reader.readAsArrayBuffer(blob);          return;        case \'document\':          callback(request.response.documentElement.outerHTML);          return;        case \'json\':          callback(request.response);          return;      };    }    callback(null);  };  ajax.prototype.open = function(method, url, isAsync, user, password) {    isAsync = (isAsync != null) ? isAsync : true;    this._flutter_inappwebview_url = url;    this._flutter_inappwebview_method = method;    this._flutter_inappwebview_isAsync = isAsync;    this._flutter_inappwebview_user = user;    this._flutter_inappwebview_password = password;    this._flutter_inappwebview_request_headers = {};    open.call(this, method, url, isAsync, user, password);  };  ajax.prototype.setRequestHeader = function(header, value) {    this._flutter_inappwebview_request_headers[header] = value;    setRequestHeader.call(this, header, value);  };  function handleEvent(e) {    var self = this;    var w = (window.top == null || window.top === window) ? window : window.top;    if (w.flutter_inappwebview._useShouldInterceptAjaxRequest == null || w.flutter_inappwebview._useShouldInterceptAjaxRequest == true) {      var headers = this.getAllResponseHeaders();      var responseHeaders = {};      if (headers != null) {        var arr = headers.trim().split(/[\\r\\n]+/);        arr.forEach(function (line) {          var parts = line.split(\': \');          var header = parts.shift();          var value = parts.join(\': \');          responseHeaders[header] = value;        });      }      convertRequestResponse(this, function(response) {        var ajaxRequest = {          method: self._flutter_inappwebview_method,          url: self._flutter_inappwebview_url,          isAsync: self._flutter_inappwebview_isAsync,          user: self._flutter_inappwebview_user,          password: self._flutter_inappwebview_password,          withCredentials: self.withCredentials,          headers: self._flutter_inappwebview_request_headers,          readyState: self.readyState,          status: self.status,          responseURL: self.responseURL,          responseType: self.responseType,          response: response,          responseText: (self.responseType == \'text\' || self.responseType == \'\') ? self.responseText : null,          responseXML: (self.responseType == \'document\' && self.responseXML != null) ? self.responseXML.documentElement.outerHTML : null,          statusText: self.statusText,          responseHeaders, responseHeaders,          event: {            type: e.type,            loaded: e.loaded,            lengthComputable: e.lengthComputable,            total: e.total          }        };        window.flutter_inappwebview.callHandler(\'onAjaxProgress\', ajaxRequest).then(function(result) {          if (result != null) {            switch (result) {              case 0:                self.abort();                return;            };          }        });      });    }  };  ajax.prototype.send = function(data) {    var self = this;    var w = (window.top == null || window.top === window) ? window : window.top;    var canBeIntercepted = self._flutter_inappwebview_isAsync || w.flutter_inappwebview._interceptOnlyAsyncAjaxRequests === false;    if (canBeIntercepted && (w.flutter_inappwebview._useShouldInterceptAjaxRequest == null || w.flutter_inappwebview._useShouldInterceptAjaxRequest == true)) {      if (!this._flutter_inappwebview_already_onreadystatechange_wrapped) {        this._flutter_inappwebview_already_onreadystatechange_wrapped = true;        var onreadystatechange = this.onreadystatechange;        this.onreadystatechange = function() {          var w = (window.top == null || window.top === window) ? window : window.top;          if (w.flutter_inappwebview._useShouldInterceptAjaxRequest == null || w.flutter_inappwebview._useShouldInterceptAjaxRequest == true) {            var headers = this.getAllResponseHeaders();            var responseHeaders = {};            if (headers != null) {              var arr = headers.trim().split(/[\\r\\n]+/);              arr.forEach(function (line) {                var parts = line.split(\': \');                var header = parts.shift();                var value = parts.join(\': \');                responseHeaders[header] = value;              });            }            convertRequestResponse(this, function(response) {              var ajaxRequest = {                method: self._flutter_inappwebview_method,                url: self._flutter_inappwebview_url,                isAsync: self._flutter_inappwebview_isAsync,                user: self._flutter_inappwebview_user,                password: self._flutter_inappwebview_password,                withCredentials: self.withCredentials,                headers: self._flutter_inappwebview_request_headers,                readyState: self.readyState,                status: self.status,                responseURL: self.responseURL,                responseType: self.responseType,                response: response,                responseText: (self.responseType == \'text\' || self.responseType == \'\') ? self.responseText : null,                responseXML: (self.responseType == \'document\' && self.responseXML != null) ? self.responseXML.documentElement.outerHTML : null,                statusText: self.statusText,                responseHeaders: responseHeaders              };              window.flutter_inappwebview.callHandler(\'onAjaxReadyStateChange\', ajaxRequest).then(function(result) {                if (result != null) {                  switch (result) {                    case 0:                      self.abort();                      return;                  };                }                if (onreadystatechange != null) {                  onreadystatechange();                }              });            });          } else if (onreadystatechange != null) {            onreadystatechange();          }        };      }      this.addEventListener(\'loadstart\', handleEvent);      this.addEventListener(\'load\', handleEvent);      this.addEventListener(\'loadend\', handleEvent);      this.addEventListener(\'progress\', handleEvent);      this.addEventListener(\'error\', handleEvent);      this.addEventListener(\'abort\', handleEvent);      this.addEventListener(\'timeout\', handleEvent);      window.flutter_inappwebview._Util.convertBodyRequest(data).then(function(data) {        var ajaxRequest = {          data: data,          method: self._flutter_inappwebview_method,          url: self._flutter_inappwebview_url,          isAsync: self._flutter_inappwebview_isAsync,          user: self._flutter_inappwebview_user,          password: self._flutter_inappwebview_password,          withCredentials: self.withCredentials,          headers: self._flutter_inappwebview_request_headers,          responseType: self.responseType        };        window.flutter_inappwebview.callHandler(\'shouldInterceptAjaxRequest\', ajaxRequest).then(function(result) {          if (result != null) {            switch (result) {              case 0:                self.abort();                return;            };            if (result.data != null && !window.flutter_inappwebview._Util.isString(result.data) && result.data.length > 0) {              var bodyString = window.flutter_inappwebview._Util.arrayBufferToString(result.data);              if (window.flutter_inappwebview._Util.isBodyFormData(bodyString)) {                var formDataContentType = window.flutter_inappwebview._Util.getFormDataContentType(bodyString);                if (result.headers != null) {                  result.headers[\'Content-Type\'] = result.headers[\'Content-Type\'] == null ? formDataContentType : result.headers[\'Content-Type\'];                } else {                  result.headers = { \'Content-Type\': formDataContentType };                }              }            }            if (window.flutter_inappwebview._Util.isString(result.data) || result.data == null) {              data = result.data;            } else if (result.data.length > 0) {              data = new Uint8Array(result.data);            }            self.withCredentials = result.withCredentials;            if (result.responseType != null && self._flutter_inappwebview_isAsync) {              self.responseType = result.responseType;            };            for (var header in result.headers) {              var value = result.headers[header];              var flutter_inappwebview_value = self._flutter_inappwebview_request_headers[header];              if (flutter_inappwebview_value == null) {                self._flutter_inappwebview_request_headers[header] = value;              } else {                self._flutter_inappwebview_request_headers[header] += \', \' + value;              }              setRequestHeader.call(self, header, value);            };            if ((self._flutter_inappwebview_method != result.method && result.method != null) ||                (self._flutter_inappwebview_url != result.url && result.url != null) ||                (self._flutter_inappwebview_isAsync != result.isAsync && result.isAsync != null) ||                (self._flutter_inappwebview_user != result.user && result.user != null) ||                (self._flutter_inappwebview_password != result.password && result.password != null)) {              self.abort();              self.open(result.method, result.url, result.isAsync, result.user, result.password);            }          }          send.call(self, data);        });      });    } else {      send.call(this, data);    }  };})(window.XMLHttpRequest);"


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
    const/4 v5, 0x1

    .line 6
    const/4 v6, 0x0

    .line 7
    .line 8
    const-string v1, "IN_APP_WEBVIEW_INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT"

    .line 9
    .line 10
    const-string v2, "(function(ajax) {  var w = (window.top == null || window.top === window) ? window : window.top;  w.flutter_inappwebview._useShouldInterceptAjaxRequest = true;  var send = ajax.prototype.send;  var open = ajax.prototype.open;  var setRequestHeader = ajax.prototype.setRequestHeader;  ajax.prototype._flutter_inappwebview_url = null;  ajax.prototype._flutter_inappwebview_method = null;  ajax.prototype._flutter_inappwebview_isAsync = null;  ajax.prototype._flutter_inappwebview_user = null;  ajax.prototype._flutter_inappwebview_password = null;  ajax.prototype._flutter_inappwebview_password = null;  ajax.prototype._flutter_inappwebview_already_onreadystatechange_wrapped = false;  ajax.prototype._flutter_inappwebview_request_headers = {};  function convertRequestResponse(request, callback) {    if (request.response != null && request.responseType != null) {      switch (request.responseType) {        case \'arraybuffer\':          callback(new Uint8Array(request.response));          return;        case \'blob\':          const reader = new FileReader();          reader.addEventListener(\'loadend\', function() {              callback(new Uint8Array(reader.result));          });          reader.readAsArrayBuffer(blob);          return;        case \'document\':          callback(request.response.documentElement.outerHTML);          return;        case \'json\':          callback(request.response);          return;      };    }    callback(null);  };  ajax.prototype.open = function(method, url, isAsync, user, password) {    isAsync = (isAsync != null) ? isAsync : true;    this._flutter_inappwebview_url = url;    this._flutter_inappwebview_method = method;    this._flutter_inappwebview_isAsync = isAsync;    this._flutter_inappwebview_user = user;    this._flutter_inappwebview_password = password;    this._flutter_inappwebview_request_headers = {};    open.call(this, method, url, isAsync, user, password);  };  ajax.prototype.setRequestHeader = function(header, value) {    this._flutter_inappwebview_request_headers[header] = value;    setRequestHeader.call(this, header, value);  };  function handleEvent(e) {    var self = this;    var w = (window.top == null || window.top === window) ? window : window.top;    if (w.flutter_inappwebview._useShouldInterceptAjaxRequest == null || w.flutter_inappwebview._useShouldInterceptAjaxRequest == true) {      var headers = this.getAllResponseHeaders();      var responseHeaders = {};      if (headers != null) {        var arr = headers.trim().split(/[\\r\\n]+/);        arr.forEach(function (line) {          var parts = line.split(\': \');          var header = parts.shift();          var value = parts.join(\': \');          responseHeaders[header] = value;        });      }      convertRequestResponse(this, function(response) {        var ajaxRequest = {          method: self._flutter_inappwebview_method,          url: self._flutter_inappwebview_url,          isAsync: self._flutter_inappwebview_isAsync,          user: self._flutter_inappwebview_user,          password: self._flutter_inappwebview_password,          withCredentials: self.withCredentials,          headers: self._flutter_inappwebview_request_headers,          readyState: self.readyState,          status: self.status,          responseURL: self.responseURL,          responseType: self.responseType,          response: response,          responseText: (self.responseType == \'text\' || self.responseType == \'\') ? self.responseText : null,          responseXML: (self.responseType == \'document\' && self.responseXML != null) ? self.responseXML.documentElement.outerHTML : null,          statusText: self.statusText,          responseHeaders, responseHeaders,          event: {            type: e.type,            loaded: e.loaded,            lengthComputable: e.lengthComputable,            total: e.total          }        };        window.flutter_inappwebview.callHandler(\'onAjaxProgress\', ajaxRequest).then(function(result) {          if (result != null) {            switch (result) {              case 0:                self.abort();                return;            };          }        });      });    }  };  ajax.prototype.send = function(data) {    var self = this;    var w = (window.top == null || window.top === window) ? window : window.top;    var canBeIntercepted = self._flutter_inappwebview_isAsync || w.flutter_inappwebview._interceptOnlyAsyncAjaxRequests === false;    if (canBeIntercepted && (w.flutter_inappwebview._useShouldInterceptAjaxRequest == null || w.flutter_inappwebview._useShouldInterceptAjaxRequest == true)) {      if (!this._flutter_inappwebview_already_onreadystatechange_wrapped) {        this._flutter_inappwebview_already_onreadystatechange_wrapped = true;        var onreadystatechange = this.onreadystatechange;        this.onreadystatechange = function() {          var w = (window.top == null || window.top === window) ? window : window.top;          if (w.flutter_inappwebview._useShouldInterceptAjaxRequest == null || w.flutter_inappwebview._useShouldInterceptAjaxRequest == true) {            var headers = this.getAllResponseHeaders();            var responseHeaders = {};            if (headers != null) {              var arr = headers.trim().split(/[\\r\\n]+/);              arr.forEach(function (line) {                var parts = line.split(\': \');                var header = parts.shift();                var value = parts.join(\': \');                responseHeaders[header] = value;              });            }            convertRequestResponse(this, function(response) {              var ajaxRequest = {                method: self._flutter_inappwebview_method,                url: self._flutter_inappwebview_url,                isAsync: self._flutter_inappwebview_isAsync,                user: self._flutter_inappwebview_user,                password: self._flutter_inappwebview_password,                withCredentials: self.withCredentials,                headers: self._flutter_inappwebview_request_headers,                readyState: self.readyState,                status: self.status,                responseURL: self.responseURL,                responseType: self.responseType,                response: response,                responseText: (self.responseType == \'text\' || self.responseType == \'\') ? self.responseText : null,                responseXML: (self.responseType == \'document\' && self.responseXML != null) ? self.responseXML.documentElement.outerHTML : null,                statusText: self.statusText,                responseHeaders: responseHeaders              };              window.flutter_inappwebview.callHandler(\'onAjaxReadyStateChange\', ajaxRequest).then(function(result) {                if (result != null) {                  switch (result) {                    case 0:                      self.abort();                      return;                  };                }                if (onreadystatechange != null) {                  onreadystatechange();                }              });            });          } else if (onreadystatechange != null) {            onreadystatechange();          }        };      }      this.addEventListener(\'loadstart\', handleEvent);      this.addEventListener(\'load\', handleEvent);      this.addEventListener(\'loadend\', handleEvent);      this.addEventListener(\'progress\', handleEvent);      this.addEventListener(\'error\', handleEvent);      this.addEventListener(\'abort\', handleEvent);      this.addEventListener(\'timeout\', handleEvent);      window.flutter_inappwebview._Util.convertBodyRequest(data).then(function(data) {        var ajaxRequest = {          data: data,          method: self._flutter_inappwebview_method,          url: self._flutter_inappwebview_url,          isAsync: self._flutter_inappwebview_isAsync,          user: self._flutter_inappwebview_user,          password: self._flutter_inappwebview_password,          withCredentials: self.withCredentials,          headers: self._flutter_inappwebview_request_headers,          responseType: self.responseType        };        window.flutter_inappwebview.callHandler(\'shouldInterceptAjaxRequest\', ajaxRequest).then(function(result) {          if (result != null) {            switch (result) {              case 0:                self.abort();                return;            };            if (result.data != null && !window.flutter_inappwebview._Util.isString(result.data) && result.data.length > 0) {              var bodyString = window.flutter_inappwebview._Util.arrayBufferToString(result.data);              if (window.flutter_inappwebview._Util.isBodyFormData(bodyString)) {                var formDataContentType = window.flutter_inappwebview._Util.getFormDataContentType(bodyString);                if (result.headers != null) {                  result.headers[\'Content-Type\'] = result.headers[\'Content-Type\'] == null ? formDataContentType : result.headers[\'Content-Type\'];                } else {                  result.headers = { \'Content-Type\': formDataContentType };                }              }            }            if (window.flutter_inappwebview._Util.isString(result.data) || result.data == null) {              data = result.data;            } else if (result.data.length > 0) {              data = new Uint8Array(result.data);            }            self.withCredentials = result.withCredentials;            if (result.responseType != null && self._flutter_inappwebview_isAsync) {              self.responseType = result.responseType;            };            for (var header in result.headers) {              var value = result.headers[header];              var flutter_inappwebview_value = self._flutter_inappwebview_request_headers[header];              if (flutter_inappwebview_value == null) {                self._flutter_inappwebview_request_headers[header] = value;              } else {                self._flutter_inappwebview_request_headers[header] += \', \' + value;              }              setRequestHeader.call(self, header, value);            };            if ((self._flutter_inappwebview_method != result.method && result.method != null) ||                (self._flutter_inappwebview_url != result.url && result.url != null) ||                (self._flutter_inappwebview_isAsync != result.isAsync && result.isAsync != null) ||                (self._flutter_inappwebview_user != result.user && result.user != null) ||                (self._flutter_inappwebview_password != result.password && result.password != null)) {              self.abort();              self.open(result.method, result.url, result.isAsync, result.user, result.password);            }          }          send.call(self, data);        });      });    } else {      send.call(this, data);    }  };})(window.XMLHttpRequest);"

    .line 11
    const/4 v4, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;Lcom/pichillilorenzo/flutter_inappwebview_android/types/ContentWorld;ZLjava/util/Set;)V

    .line 15
    .line 16
    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/plugin_scripts_js/InterceptAjaxRequestJS;->INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

    .line 17
    return-void
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

.method public static createInterceptOnlyAsyncAjaxRequestsPluginScript(Z)Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string/jumbo v2, "window.flutter_inappwebview._interceptOnlyAsyncAjaxRequests = "

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string p0, ";"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    sget-object v3, Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;->AT_DOCUMENT_START:Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;

    .line 28
    const/4 v5, 0x1

    .line 29
    const/4 v6, 0x0

    .line 30
    .line 31
    const-string v1, "IN_APP_WEBVIEW_INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT"

    .line 32
    const/4 v4, 0x0

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v0 .. v6}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;Lcom/pichillilorenzo/flutter_inappwebview_android/types/ContentWorld;ZLjava/util/Set;)V

    .line 36
    return-object v0
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
.end method
