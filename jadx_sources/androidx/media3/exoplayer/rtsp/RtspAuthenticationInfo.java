package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import com.tencent.bugly.proguard.C33844oi;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes34.dex */
final class RtspAuthenticationInfo {
    private static final String ALGORITHM = "MD5";
    public static final int BASIC = 1;
    private static final String BASIC_AUTHORIZATION_HEADER_FORMAT = "Basic %s";
    public static final int DIGEST = 2;
    private static final String DIGEST_AUTHORIZATION_HEADER_FORMAT = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"";
    private static final String DIGEST_AUTHORIZATION_HEADER_FORMAT_WITH_OPAQUE = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"";
    public final int authenticationMechanism;
    public final String nonce;
    public final String opaque;
    public final String realm;

    private String getBasicAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo) {
        return Util.formatInvariant(BASIC_AUTHORIZATION_HEADER_FORMAT, Base64.encodeToString(RtspMessageUtil.getStringBytes(rtspAuthUserInfo.username + C33844oi.f71346o + rtspAuthUserInfo.password), 0));
    }

    private String getDigestAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo, Uri uri, int i11) throws ParserException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ALGORITHM);
            String methodString = RtspMessageUtil.toMethodString(i11);
            String hexString = Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(rtspAuthUserInfo.username + C33844oi.f71346o + this.realm + C33844oi.f71346o + rtspAuthUserInfo.password)));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(methodString);
            sb2.append(C33844oi.f71346o);
            sb2.append(uri);
            String hexString2 = Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(hexString + C33844oi.f71346o + this.nonce + C33844oi.f71346o + Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(sb2.toString()))))));
            return this.opaque.isEmpty() ? Util.formatInvariant(DIGEST_AUTHORIZATION_HEADER_FORMAT, rtspAuthUserInfo.username, this.realm, this.nonce, uri, hexString2) : Util.formatInvariant(DIGEST_AUTHORIZATION_HEADER_FORMAT_WITH_OPAQUE, rtspAuthUserInfo.username, this.realm, this.nonce, uri, hexString2, this.opaque);
        } catch (NoSuchAlgorithmException e11) {
            throw ParserException.createForManifestWithUnsupportedFeature(null, e11);
        }
    }

    public String getAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo, Uri uri, int i11) throws ParserException {
        int i12 = this.authenticationMechanism;
        if (i12 == 1) {
            return getBasicAuthorizationHeaderValue(rtspAuthUserInfo);
        }
        if (i12 == 2) {
            return getDigestAuthorizationHeaderValue(rtspAuthUserInfo, uri, i11);
        }
        throw ParserException.createForManifestWithUnsupportedFeature(null, new UnsupportedOperationException());
    }

    public RtspAuthenticationInfo(int i11, String str, String str2, String str3) {
        this.authenticationMechanism = i11;
        this.realm = str;
        this.nonce = str2;
        this.opaque = str3;
    }
}
