package kg;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.flutter.security.channel.C12740a;
import com.kubi.flutter.security.channel.SecurityClient;
import com.kubi.safe.C23646b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kg.a */
/* JADX INFO: compiled from: BiometricClient.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lkg/a;", "Lcom/kubi/flutter/security/channel/SecurityClient;", "Lcom/kubi/flutter/security/channel/a;", AppsFlyerProperties.CHANNEL, "<init>", "(Lcom/kubi/flutter/security/channel/a;)V", "", FirebaseAnalytics.Param.METHOD, "", "arguments", "e", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "(Ljava/lang/Object;)Ljava/lang/Object;", "i", CmcdData.Factory.STREAMING_FORMAT_HLS, "component_security_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41030a extends SecurityClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41030a(@NotNull C12740a channel) {
        super(channel);
        Intrinsics.checkNotNullParameter(channel, "channel");
    }

    /* JADX INFO: renamed from: h */
    public final Object m89979h(Object arguments) {
        return Boolean.valueOf(C23646b.f46336a.m56346b(m24075g()));
    }

    /* JADX INFO: renamed from: i */
    public final Object m89980i(Object arguments) {
        return Boolean.valueOf(C23646b.f46336a.m56347c(m24075g()));
    }

    /* JADX INFO: renamed from: j */
    public final Object m89981j(Object arguments) {
        return Boolean.valueOf(C23646b.f46336a.m56348d(m24075g()));
    }

    @Override // com.kubi.flutter.security.channel.SecurityClient
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo24073e(@NotNull String str, @Nullable Object obj, @NotNull Continuation<Object> continuation) throws Throwable {
        int iHashCode = str.hashCode();
        if (iHashCode != -648732677) {
            if (iHashCode != -367820835) {
                if (iHashCode == 2061296882 && str.equals("isOpenPasswordAuthAvailable")) {
                    return m89981j(obj);
                }
            } else if (str.equals("isOpenBiometricAuthAvailable")) {
                return m89980i(obj);
            }
        } else if (str.equals("isHardwareBiometricAuthAvailable")) {
            return m89979h(obj);
        }
        throw new RuntimeException("not support method: " + str);
    }
}
