package com.pichillilorenzo.flutter_inappwebview_android;

import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.webkit.CookieManagerCompat;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes23.dex */
public class MyCookieManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyCookieManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_cookiemanager";
    public static CookieManager cookieManager;
    public InAppWebViewFlutterPlugin plugin;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) throws Exception {
        init();
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "deleteCookie":
                deleteCookie((String) methodCall.argument("url"), (String) methodCall.argument("name"), (String) methodCall.argument("domain"), (String) methodCall.argument("path"), result);
                break;
            case "removeSessionCookies":
                removeSessionCookies(result);
                break;
            case "setCookie":
                String str2 = (String) methodCall.argument("url");
                String str3 = (String) methodCall.argument("name");
                String str4 = (String) methodCall.argument("value");
                String str5 = (String) methodCall.argument("domain");
                String str6 = (String) methodCall.argument("path");
                String str7 = (String) methodCall.argument("expiresDate");
                setCookie(str2, str3, str4, str5, str6, str7 != null ? new Long(str7) : null, (Integer) methodCall.argument("maxAge"), (Boolean) methodCall.argument("isSecure"), (Boolean) methodCall.argument("isHttpOnly"), (String) methodCall.argument("sameSite"), result);
                break;
            case "deleteCookies":
                deleteCookies((String) methodCall.argument("url"), (String) methodCall.argument("domain"), (String) methodCall.argument("path"), result);
                break;
            case "deleteAllCookies":
                deleteAllCookies(result);
                break;
            case "getCookies":
                result.success(getCookies((String) methodCall.argument("url")));
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    public void setCookie(String str, String str2, String str3, String str4, String str5, Long l11, Integer num, Boolean bool, Boolean bool2, String str6, final MethodChannel.Result result) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
            return;
        }
        String str7 = str2 + "=" + str3 + "; Path=" + str5;
        if (str4 != null) {
            str7 = str7 + "; Domain=" + str4;
        }
        if (l11 != null) {
            str7 = str7 + "; Expires=" + getCookieExpirationDate(l11);
        }
        if (num != null) {
            str7 = str7 + "; Max-Age=" + num.toString();
        }
        if (bool != null && bool.booleanValue()) {
            str7 = str7 + "; Secure";
        }
        if (bool2 != null && bool2.booleanValue()) {
            str7 = str7 + "; HttpOnly";
        }
        if (str6 != null) {
            str7 = str7 + "; SameSite=" + str6;
        }
        cookieManager.setCookie(str, str7 + ";", new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool3) {
                result.success(bool3);
            }
        });
        cookieManager.flush();
    }

    public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static String getCookieExpirationDate(Long l11) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(l11.longValue()));
    }

    private static CookieManager getCookieManager() throws Exception {
        if (cookieManager == null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e11) {
                if (e11.getMessage() == null || !e11.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    throw e11;
                }
                return null;
            }
        }
        return cookieManager;
    }

    public static void init() {
        if (cookieManager == null) {
            cookieManager = getCookieManager();
        }
    }

    public List<Map<String, Object>> getCookies(String str) throws Exception {
        String str2;
        ArrayList arrayList = new ArrayList();
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null) {
            List arrayList2 = new ArrayList();
            String str3 = WebViewFeature.GET_COOKIE_INFO;
            String str4 = ";";
            if (WebViewFeature.isFeatureSupported(WebViewFeature.GET_COOKIE_INFO)) {
                arrayList2 = CookieManagerCompat.getCookieInfo(cookieManager, str);
            } else {
                String cookie = cookieManager.getCookie(str);
                if (cookie != null) {
                    arrayList2 = Arrays.asList(cookie.split(";"));
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String[] strArrSplit = ((String) it.next()).split(str4);
                if (strArrSplit.length != 0) {
                    String[] strArrSplit2 = strArrSplit[0].split("=", 2);
                    String strTrim = strArrSplit2[0].trim();
                    String strTrim2 = strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "";
                    HashMap map = new HashMap();
                    map.put("name", strTrim);
                    map.put("value", strTrim2);
                    map.put("expiresDate", null);
                    map.put("isSessionOnly", null);
                    map.put("domain", null);
                    map.put("sameSite", null);
                    map.put("isSecure", null);
                    map.put("isHttpOnly", null);
                    map.put("path", null);
                    if (WebViewFeature.isFeatureSupported(str3)) {
                        Boolean bool = Boolean.FALSE;
                        map.put("isSecure", bool);
                        map.put("isHttpOnly", bool);
                        int i11 = 1;
                        while (i11 < strArrSplit.length) {
                            Iterator it2 = it;
                            String[] strArrSplit3 = strArrSplit[i11].split("=", 2);
                            String strTrim3 = strArrSplit3[0].trim();
                            String str5 = str3;
                            String[] strArr = strArrSplit;
                            String strTrim4 = strArrSplit3.length > 1 ? strArrSplit3[1].trim() : "";
                            if (strTrim3.equalsIgnoreCase("Expires")) {
                                try {
                                    str2 = str4;
                                    try {
                                        Date date = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US).parse(strTrim4);
                                        if (date != null) {
                                            map.put("expiresDate", Long.valueOf(date.getTime()));
                                        }
                                    } catch (ParseException e11) {
                                        e = e11;
                                        Log.e(LOG_TAG, "", e);
                                    }
                                } catch (ParseException e12) {
                                    e = e12;
                                    str2 = str4;
                                }
                            } else {
                                str2 = str4;
                                if (strTrim3.equalsIgnoreCase("Max-Age")) {
                                    try {
                                        map.put("expiresDate", Long.valueOf(System.currentTimeMillis() + Long.parseLong(strTrim4)));
                                    } catch (NumberFormatException e13) {
                                        Log.e(LOG_TAG, "", e13);
                                    }
                                } else if (strTrim3.equalsIgnoreCase("Domain")) {
                                    map.put("domain", strTrim4);
                                } else if (strTrim3.equalsIgnoreCase("SameSite")) {
                                    map.put("sameSite", strTrim4);
                                } else if (strTrim3.equalsIgnoreCase("Secure")) {
                                    map.put("isSecure", Boolean.TRUE);
                                } else if (strTrim3.equalsIgnoreCase("HttpOnly")) {
                                    map.put("isHttpOnly", Boolean.TRUE);
                                } else if (strTrim3.equalsIgnoreCase("Path")) {
                                    map.put("path", strTrim4);
                                }
                            }
                            i11++;
                            str3 = str5;
                            it = it2;
                            strArrSplit = strArr;
                            str4 = str2;
                        }
                    }
                    arrayList.add(map);
                    str3 = str3;
                    it = it;
                    str4 = str4;
                }
            }
        }
        return arrayList;
    }

    public void deleteAllCookies(final MethodChannel.Result result) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
        } else {
            cookieManager.removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.3
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    result.success(bool);
                }
            });
            cookieManager.flush();
        }
    }

    public void deleteCookie(String str, String str2, String str3, String str4, final MethodChannel.Result result) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
            return;
        }
        String str5 = str2 + "=; Path=" + str4 + "; Max-Age=-1";
        if (str3 != null) {
            str5 = str5 + "; Domain=" + str3;
        }
        cookieManager.setCookie(str, str5 + ";", new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
                result.success(bool);
            }
        });
        cookieManager.flush();
    }

    public void deleteCookies(String str, String str2, String str3, MethodChannel.Result result) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
            return;
        }
        String cookie = cookieManager2.getCookie(str);
        if (cookie != null) {
            for (String str4 : cookie.split(";")) {
                String str5 = str4.split("=", 2)[0].trim() + "=; Path=" + str3 + "; Max-Age=-1";
                if (str2 != null) {
                    str5 = str5 + "; Domain=" + str2;
                }
                cookieManager.setCookie(str, str5 + ";", null);
            }
            cookieManager.flush();
        }
        result.success(Boolean.TRUE);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public void removeSessionCookies(final MethodChannel.Result result) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
        } else {
            cookieManager.removeSessionCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.4
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    result.success(bool);
                }
            });
            cookieManager.flush();
        }
    }
}
