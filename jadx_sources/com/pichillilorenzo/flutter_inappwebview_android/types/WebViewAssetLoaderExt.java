package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.content.Context;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.webkit.WebViewAssetLoader;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class WebViewAssetLoaderExt implements Disposable {
    public List<PathHandlerExt> customPathHandlers;
    public WebViewAssetLoader loader;

    public static class PathHandlerExt implements WebViewAssetLoader.PathHandler, Disposable {
        protected static final String LOG_TAG = "PathHandlerExt";
        public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_custompathhandler_";
        public PathHandlerExtChannelDelegate channelDelegate;

        /* JADX INFO: renamed from: id */
        public String f55837id;

        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
        public void dispose() {
            PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
            if (pathHandlerExtChannelDelegate != null) {
                pathHandlerExtChannelDelegate.dispose();
                this.channelDelegate = null;
            }
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public WebResourceResponse handle(String str) {
            PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
            if (pathHandlerExtChannelDelegate != null) {
                try {
                    WebResourceResponseExt webResourceResponseExtHandle = pathHandlerExtChannelDelegate.handle(str);
                    if (webResourceResponseExtHandle != null) {
                        String contentType = webResourceResponseExtHandle.getContentType();
                        String contentEncoding = webResourceResponseExtHandle.getContentEncoding();
                        byte[] data = webResourceResponseExtHandle.getData();
                        Map<String, String> headers = webResourceResponseExtHandle.getHeaders();
                        Integer statusCode = webResourceResponseExtHandle.getStatusCode();
                        String reasonPhrase = webResourceResponseExtHandle.getReasonPhrase();
                        ByteArrayInputStream byteArrayInputStream = data != null ? new ByteArrayInputStream(data) : null;
                        return (statusCode == null || reasonPhrase == null) ? new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream) : new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream);
                    }
                } catch (InterruptedException e11) {
                    Log.e(LOG_TAG, "", e11);
                }
            }
            return null;
        }

        public PathHandlerExt(String str, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
            this.f55837id = str;
            this.channelDelegate = new PathHandlerExtChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME_PREFIX + str));
        }
    }

    public static class PathHandlerExtChannelDelegate extends ChannelDelegateImpl {
        private PathHandlerExt pathHandler;

        public static class HandleCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public WebResourceResponseExt decodeResult(Object obj) {
                return WebResourceResponseExt.fromMap((Map) obj);
            }
        }

        public static class SyncHandleCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public WebResourceResponseExt decodeResult(Object obj) {
                return new HandleCallback().decodeResult(obj);
            }
        }

        public void handle(String str, HandleCallback handleCallback) {
            MethodChannel channel = getChannel();
            if (channel == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("path", str);
            channel.invokeMethod("handle", map, handleCallback);
        }

        public PathHandlerExtChannelDelegate(PathHandlerExt pathHandlerExt, MethodChannel methodChannel) {
            super(methodChannel);
            this.pathHandler = pathHandlerExt;
        }

        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
        public void dispose() {
            super.dispose();
            this.pathHandler = null;
        }

        public WebResourceResponseExt handle(String str) {
            MethodChannel channel = getChannel();
            if (channel == null) {
                return null;
            }
            SyncHandleCallback syncHandleCallback = new SyncHandleCallback();
            HashMap map = new HashMap();
            map.put("path", str);
            return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "handle", map, syncHandleCallback);
        }
    }

    public static WebViewAssetLoaderExt fromMap(Map<String, Object> map, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Context context) {
        if (map == null) {
            return null;
        }
        WebViewAssetLoader.Builder builder = new WebViewAssetLoader.Builder();
        String str = (String) map.get("domain");
        Boolean bool = (Boolean) map.get("httpAllowed");
        List<Map> list = (List) map.get("pathHandlers");
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            builder.setDomain(str);
        }
        if (bool != null) {
            builder.setHttpAllowed(bool.booleanValue());
        }
        if (list != null) {
            for (Map map2 : list) {
                String str2 = (String) map2.get("type");
                String str3 = (String) map2.get("path");
                if (str2 != null && str3 != null) {
                    switch (str2) {
                        case "ResourcesPathHandler":
                            builder.addPathHandler(str3, new WebViewAssetLoader.ResourcesPathHandler(context));
                            break;
                        case "AssetsPathHandler":
                            builder.addPathHandler(str3, new WebViewAssetLoader.AssetsPathHandler(context));
                            break;
                        case "InternalStoragePathHandler":
                            String str4 = (String) map2.get("directory");
                            if (str4 == null) {
                                break;
                            } else {
                                builder.addPathHandler(str3, new WebViewAssetLoader.InternalStoragePathHandler(context, new File(str4)));
                                break;
                            }
                            break;
                        default:
                            String str5 = (String) map2.get("id");
                            if (str5 == null) {
                                break;
                            } else {
                                PathHandlerExt pathHandlerExt = new PathHandlerExt(str5, inAppWebViewFlutterPlugin);
                                builder.addPathHandler(str3, pathHandlerExt);
                                arrayList.add(pathHandlerExt);
                                break;
                            }
                            break;
                    }
                }
            }
        }
        return new WebViewAssetLoaderExt(builder.build(), arrayList);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        Iterator<PathHandlerExt> it = this.customPathHandlers.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.customPathHandlers.clear();
    }

    public WebViewAssetLoaderExt(WebViewAssetLoader webViewAssetLoader, List<PathHandlerExt> list) {
        this.loader = webViewAssetLoader;
        this.customPathHandlers = list;
    }
}
