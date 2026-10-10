package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33844oi;

/* JADX INFO: loaded from: classes23.dex */
public final class UriCompat {
    private UriCompat() {
    }

    @NonNull
    public static String toSafeString(@NonNull Uri uri) {
        String host;
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (!scheme.equalsIgnoreCase("tel") && !scheme.equalsIgnoreCase("sip") && !scheme.equalsIgnoreCase("sms") && !scheme.equalsIgnoreCase("smsto") && !scheme.equalsIgnoreCase("mailto") && !scheme.equalsIgnoreCase("nfc")) {
                if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase(ProxyConfig.MATCH_HTTPS) || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("//");
                    String str = "";
                    if (uri.getHost() == null) {
                        host = "";
                    } else {
                        host = uri.getHost();
                    }
                    sb2.append(host);
                    if (uri.getPort() != -1) {
                        str = C33844oi.f71346o + uri.getPort();
                    }
                    sb2.append(str);
                    sb2.append("/...");
                    schemeSpecificPart = sb2.toString();
                }
            } else {
                StringBuilder sb3 = new StringBuilder(64);
                sb3.append(scheme);
                sb3.append(':');
                if (schemeSpecificPart != null) {
                    for (int i11 = 0; i11 < schemeSpecificPart.length(); i11++) {
                        char cCharAt = schemeSpecificPart.charAt(i11);
                        if (cCharAt != '-' && cCharAt != '@' && cCharAt != '.') {
                            sb3.append('x');
                        } else {
                            sb3.append(cCharAt);
                        }
                    }
                }
                return sb3.toString();
            }
        }
        StringBuilder sb4 = new StringBuilder(64);
        if (scheme != null) {
            sb4.append(scheme);
            sb4.append(':');
        }
        if (schemeSpecificPart != null) {
            sb4.append(schemeSpecificPart);
        }
        return sb4.toString();
    }
}
