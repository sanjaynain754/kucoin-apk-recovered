package p550q6;

import android.util.Base64;
import android.util.Log;
import androidx.webkit.ProxyConfig;
import com.facebook.C5501a;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.TextStreamsKt;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: q6.c */
/* JADX INFO: compiled from: OidcSecurityUtil.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lq6/c;", "", "<init>", "()V", "", "kid", "c", "(Ljava/lang/String;)Ljava/lang/String;", "key", "Ljava/security/PublicKey;", "b", "(Ljava/lang/String;)Ljava/security/PublicKey;", "publicKey", "data", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "", "e", "(Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Z", "Ljava/lang/String;", "getOPENID_KEYS_PATH", "()Ljava/lang/String;", "OPENID_KEYS_PATH", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOidcSecurityUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OidcSecurityUtil.kt\ncom/facebook/internal/security/OidcSecurityUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class C43637c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43637c f96317a = new C43637c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String OPENID_KEYS_PATH = "/.well-known/oauth/openid/keys/";

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: d */
    public static final void m96035d(URL openIdKeyUrl, Ref.ObjectRef result, String kid, ReentrantLock lock, Condition condition) {
        Intrinsics.checkNotNullParameter(openIdKeyUrl, "$openIdKeyUrl");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(kid, "$kid");
        Intrinsics.checkNotNullParameter(lock, "$lock");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(openIdKeyUrl.openConnection());
        Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "connection.inputStream");
                String text = TextStreamsKt.readText(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
                httpURLConnection.getInputStream().close();
                result.element = new JSONObject(text).optString(kid);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    lock.unlock();
                }
            } catch (Exception e11) {
                String name = f96317a.getClass().getName();
                String message = e11.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                    lock.unlock();
                }
            }
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            lock.lock();
            try {
                condition.signal();
                Unit unit3 = Unit.INSTANCE;
                throw th2;
            } finally {
                lock.unlock();
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final PublicKey m96033b(@NotNull String key) throws InvalidKeySpecException {
        Intrinsics.checkNotNullParameter(key, "key");
        byte[] bArrDecode = Base64.decode(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(key, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "", false, 4, (Object) null), "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null), "-----END PUBLIC KEY-----", "", false, 4, (Object) null), 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m96034c(@NotNull final String kid) {
        Intrinsics.checkNotNullParameter(kid, "kid");
        final URL url = new URL(ProxyConfig.MATCH_HTTPS, "www." + C5501a.m7807u(), OPENID_KEYS_PATH);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C5501a.m7806t().execute(new Runnable() { // from class: q6.b
            @Override // java.lang.Runnable
            public final void run() {
                C43637c.m96035d(url, objectRef, kid, reentrantLock, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) objectRef.element;
        } finally {
            reentrantLock.unlock();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m96036e(@NotNull PublicKey publicKey, @NotNull String data, @NotNull String signature) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] bArrDecode = Base64.decode(signature, 8);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }
}
