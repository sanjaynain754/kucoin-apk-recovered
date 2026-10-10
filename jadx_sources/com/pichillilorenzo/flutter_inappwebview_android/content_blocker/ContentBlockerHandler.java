package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.webkit.ProxyConfig;
import androidx.webkit.internal.AssetHelper;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.tencent.bugly.proguard.C33844oi;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: classes59.dex */
public class ContentBlockerHandler {
    protected static final String LOG_TAG = "ContentBlockerHandler";
    protected List<ContentBlocker> ruleList;

    public ContentBlockerHandler() {
        this.ruleList = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
    public WebResourceResponse checkUrl(final InAppWebView inAppWebView, WebResourceRequestExt webResourceRequestExt, ContentBlockerTriggerResourceType contentBlockerTriggerResourceType) throws InterruptedException {
        URI uri;
        WebResourceResponse webResourceResponse;
        char c11;
        ContentBlockerAction contentBlockerAction;
        String str;
        HttpURLConnection httpURLConnectionMakeHttpRequest;
        String str2;
        String[] strArr;
        String str3 = "charset=";
        WebResourceResponse webResourceResponse2 = null;
        if (inAppWebView.customSettings.contentBlockers == null) {
            return null;
        }
        String url = webResourceRequestExt.getUrl();
        char c12 = 0;
        try {
            uri = new URI(url);
        } catch (URISyntaxException unused) {
            String str4 = url.split(C33844oi.f71346o)[0];
            URL url2 = new URL(url.replace(str4, ProxyConfig.MATCH_HTTPS));
            uri = new URI(str4, url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
        }
        String host = uri.getHost();
        int port = uri.getPort();
        String scheme = uri.getScheme();
        for (ContentBlocker contentBlocker : new CopyOnWriteArrayList(this.ruleList)) {
            ContentBlockerTrigger trigger = contentBlocker.getTrigger();
            List<ContentBlockerTriggerResourceType> resourceType = trigger.getResourceType();
            if (resourceType.contains(ContentBlockerTriggerResourceType.IMAGE)) {
                ContentBlockerTriggerResourceType contentBlockerTriggerResourceType2 = ContentBlockerTriggerResourceType.SVG_DOCUMENT;
                if (!resourceType.contains(contentBlockerTriggerResourceType2)) {
                    resourceType.add(contentBlockerTriggerResourceType2);
                }
            }
            ContentBlockerAction action = contentBlocker.getAction();
            if (trigger.getUrlFilterPatternCompiled().matcher(url).matches()) {
                if (!resourceType.isEmpty() && !resourceType.contains(contentBlockerTriggerResourceType)) {
                    return webResourceResponse2;
                }
                if (!trigger.getIfDomain().isEmpty()) {
                    for (String str5 : trigger.getIfDomain()) {
                        c11 = c12;
                        if (str5.startsWith(ProxyConfig.MATCH_ALL_SCHEMES)) {
                            webResourceResponse = webResourceResponse2;
                            if (!host.endsWith(str5.replace(ProxyConfig.MATCH_ALL_SCHEMES, ""))) {
                            }
                        } else {
                            webResourceResponse = webResourceResponse2;
                        }
                        if (!str5.equals(host)) {
                            webResourceResponse2 = webResourceResponse;
                            c12 = c11;
                        }
                    }
                    return webResourceResponse2;
                }
                webResourceResponse = webResourceResponse2;
                c11 = c12;
                if (!trigger.getUnlessDomain().isEmpty()) {
                    for (String str6 : trigger.getUnlessDomain()) {
                        if ((str6.startsWith(ProxyConfig.MATCH_ALL_SCHEMES) && host.endsWith(str6.replace(ProxyConfig.MATCH_ALL_SCHEMES, ""))) || str6.equals(host)) {
                            return webResourceResponse;
                        }
                    }
                }
                final String[] strArr2 = new String[1];
                if (!trigger.getLoadType().isEmpty() || !trigger.getIfTopUrl().isEmpty() || !trigger.getUnlessTopUrl().isEmpty()) {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Handler(inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler.1
                        @Override // java.lang.Runnable
                        public void run() {
                            strArr2[0] = inAppWebView.getUrl();
                            countDownLatch.countDown();
                        }
                    });
                    countDownLatch.await();
                }
                if (strArr2[c11] != null) {
                    if (trigger.getLoadType().isEmpty()) {
                        contentBlockerAction = action;
                        strArr = strArr2;
                    } else {
                        URI uri2 = new URI(strArr2[c11]);
                        String host2 = uri2.getHost();
                        int port2 = uri2.getPort();
                        String scheme2 = uri2.getScheme();
                        contentBlockerAction = action;
                        strArr = strArr2;
                        if ((trigger.getLoadType().contains("first-party") && host2 != null && (!scheme2.equals(scheme) || !host2.equals(host) || port2 != port)) || (trigger.getLoadType().contains("third-party") && host2 != null && host2.equals(host))) {
                            return webResourceResponse;
                        }
                    }
                    if (!trigger.getIfTopUrl().isEmpty()) {
                        Iterator<String> it = trigger.getIfTopUrl().iterator();
                        while (it.hasNext()) {
                            if (strArr[c11].startsWith(it.next())) {
                            }
                        }
                        return webResourceResponse;
                    }
                    if (!trigger.getUnlessTopUrl().isEmpty()) {
                        Iterator<String> it2 = trigger.getUnlessTopUrl().iterator();
                        while (it2.hasNext()) {
                            if (strArr[c11].startsWith(it2.next())) {
                                return webResourceResponse;
                            }
                        }
                    }
                } else {
                    contentBlockerAction = action;
                }
                int i11 = C273843.f55822xcaeba15d[contentBlockerAction.getType().ordinal()];
                if (i11 == 1) {
                    return new WebResourceResponse("", "", webResourceResponse);
                }
                if (i11 == 2) {
                    str = str3;
                    String selector = contentBlockerAction.getSelector();
                    final String str7 = "(function(d) {    function hide () {        if (d.body != null && !d.getElementById('flutter_inappwebview-css-display-none-style')) {            var c = d.createElement('style');            c.id = 'flutter_inappwebview-css-display-none-style';            c.innerHTML = '" + selector + " { display: none !important; }';            d.body.appendChild(c);        }       d.querySelectorAll('" + selector + "').forEach(function (item, index) {            item.setAttribute('style', 'display: none !important;');        });    };    hide();    d.addEventListener('DOMContentLoaded', function(event) { hide(); }); })(document);";
                    new Handler(inAppWebView.getWebViewLooper()).postDelayed(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler.2
                        @Override // java.lang.Runnable
                        public void run() {
                            inAppWebView.evaluateJavascript(str7, null);
                        }
                    }, 800L);
                } else if (i11 == 3 && scheme.equals("http") && ((port == -1 || port == 80) && (httpURLConnectionMakeHttpRequest = Util.makeHttpRequest(url.replace("http://", "https://"), webResourceRequestExt.getMethod(), webResourceRequestExt.getHeaders())) != null)) {
                    try {
                        try {
                            byte[] allBytes = Util.readAllBytes(httpURLConnectionMakeHttpRequest.getInputStream());
                            if (allBytes == null) {
                                httpURLConnectionMakeHttpRequest.disconnect();
                                return webResourceResponse;
                            }
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(allBytes);
                            String contentEncoding = httpURLConnectionMakeHttpRequest.getContentEncoding();
                            String contentType = httpURLConnectionMakeHttpRequest.getContentType();
                            if (contentType == null) {
                                str2 = AssetHelper.DEFAULT_MIME_TYPE;
                            } else {
                                String[] strArrSplit = contentType.split(";");
                                String strTrim = strArrSplit[c11].trim();
                                if (contentEncoding == null) {
                                    contentEncoding = (strArrSplit.length <= 1 || !strArrSplit[1].contains(str3)) ? "utf-8" : strArrSplit[1].replace(str3, "").trim();
                                }
                                str2 = strTrim;
                            }
                            String str8 = contentEncoding;
                            String responseMessage = httpURLConnectionMakeHttpRequest.getResponseMessage();
                            if (responseMessage == null) {
                                WebResourceResponse webResourceResponse3 = new WebResourceResponse(str2, str8, byteArrayInputStream);
                                httpURLConnectionMakeHttpRequest.disconnect();
                                return webResourceResponse3;
                            }
                            HashMap map = new HashMap();
                            for (Map.Entry<String, List<String>> entry : httpURLConnectionMakeHttpRequest.getHeaderFields().entrySet()) {
                                str = str3;
                                try {
                                    map.put(entry.getKey(), TextUtils.join(",", entry.getValue()));
                                    str3 = str;
                                } catch (Exception e11) {
                                    e = e11;
                                }
                            }
                            WebResourceResponse webResourceResponse4 = new WebResourceResponse(str2, str8, httpURLConnectionMakeHttpRequest.getResponseCode(), responseMessage, map, byteArrayInputStream);
                            httpURLConnectionMakeHttpRequest.disconnect();
                            return webResourceResponse4;
                        } catch (Exception e12) {
                            e = e12;
                            str = str3;
                        }
                    } catch (Throwable th2) {
                        httpURLConnectionMakeHttpRequest.disconnect();
                        throw th2;
                    }
                    if (!(e instanceof SSLHandshakeException)) {
                        Log.e(LOG_TAG, "", e);
                    }
                    httpURLConnectionMakeHttpRequest.disconnect();
                } else {
                    webResourceResponse2 = webResourceResponse;
                    c12 = c11;
                }
                webResourceResponse2 = webResourceResponse;
                c12 = c11;
                str3 = str;
            }
        }
        return webResourceResponse2;
    }

    /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler$3 */
    public static /* synthetic */ class C273843 {

        /* JADX INFO: renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$content_blocker$ContentBlockerActionType */
        static final /* synthetic */ int[] f55822xcaeba15d;

        static {
            int[] iArr = new int[ContentBlockerActionType.values().length];
            f55822xcaeba15d = iArr;
            try {
                iArr[ContentBlockerActionType.BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55822xcaeba15d[ContentBlockerActionType.CSS_DISPLAY_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55822xcaeba15d[ContentBlockerActionType.MAKE_HTTPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ContentBlockerTriggerResourceType getResourceTypeFromContentType(String str) {
        ContentBlockerTriggerResourceType contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.RAW;
        if (str.equals("text/css")) {
            return ContentBlockerTriggerResourceType.STYLE_SHEET;
        }
        if (str.equals("image/svg+xml")) {
            return ContentBlockerTriggerResourceType.SVG_DOCUMENT;
        }
        if (str.startsWith("image/")) {
            return ContentBlockerTriggerResourceType.IMAGE;
        }
        if (str.startsWith("font/")) {
            return ContentBlockerTriggerResourceType.FONT;
        }
        if (str.startsWith("audio/") || str.startsWith("video/") || str.equals("application/ogg")) {
            return ContentBlockerTriggerResourceType.MEDIA;
        }
        if (str.endsWith("javascript")) {
            return ContentBlockerTriggerResourceType.SCRIPT;
        }
        return str.startsWith("text/") ? ContentBlockerTriggerResourceType.DOCUMENT : contentBlockerTriggerResourceType;
    }

    public ContentBlockerTriggerResourceType getResourceTypeFromUrl(WebResourceRequestExt webResourceRequestExt) {
        HttpURLConnection httpURLConnectionMakeHttpRequest;
        ContentBlockerTriggerResourceType resourceTypeFromContentType = ContentBlockerTriggerResourceType.RAW;
        String url = webResourceRequestExt.getUrl();
        if ((url.startsWith("http://") || url.startsWith("https://")) && (httpURLConnectionMakeHttpRequest = Util.makeHttpRequest(url, "HEAD", webResourceRequestExt.getHeaders())) != null) {
            try {
                String contentType = httpURLConnectionMakeHttpRequest.getContentType();
                if (contentType != null) {
                    resourceTypeFromContentType = getResourceTypeFromContentType(contentType.split(";")[0].trim());
                }
                return resourceTypeFromContentType;
            } catch (Exception e11) {
                Log.e(LOG_TAG, "", e11);
                return resourceTypeFromContentType;
            } finally {
                httpURLConnectionMakeHttpRequest.disconnect();
            }
        }
        return resourceTypeFromContentType;
    }

    public List<ContentBlocker> getRuleList() {
        return this.ruleList;
    }

    public void setRuleList(List<ContentBlocker> list) {
        this.ruleList = list;
    }

    public ContentBlockerHandler(List<ContentBlocker> list) {
        new ArrayList();
        this.ruleList = list;
    }

    public WebResourceResponse checkUrl(InAppWebView inAppWebView, WebResourceRequestExt webResourceRequestExt) {
        return checkUrl(inAppWebView, webResourceRequestExt, getResourceTypeFromUrl(webResourceRequestExt));
    }

    public WebResourceResponse checkUrl(InAppWebView inAppWebView, WebResourceRequestExt webResourceRequestExt, String str) {
        return checkUrl(inAppWebView, webResourceRequestExt, getResourceTypeFromContentType(str));
    }
}
