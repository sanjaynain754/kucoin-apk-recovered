package p430lg;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.flutter.security.channel.C12740a;
import com.kubi.flutter.security.channel.SecurityClient;
import com.kubi.safe.C23647c;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lg.a */
/* JADX INFO: compiled from: CipherClient.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u001b\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, m90084d2 = {"Llg/a;", "Lcom/kubi/flutter/security/channel/SecurityClient;", "Lcom/kubi/flutter/security/channel/a;", AppsFlyerProperties.CHANNEL, "<init>", "(Lcom/kubi/flutter/security/channel/a;)V", "", FirebaseAnalytics.Param.METHOD, "", "arguments", "e", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "i", "j", CmcdData.Factory.STREAMING_FORMAT_HLS, "component_security_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C42188a extends SecurityClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42188a(@NotNull C12740a channel) {
        super(channel);
        Intrinsics.checkNotNullParameter(channel, "channel");
    }

    /* JADX INFO: renamed from: h */
    public final Object m92657h(Object arguments) {
        List list = arguments instanceof List ? (List) arguments : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 2) {
            throw new RuntimeException("list length must be 2");
        }
        C23647c c23647c = C23647c.f46337a;
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        return c23647c.m56350a(str, obj2 instanceof String ? (String) obj2 : null);
    }

    /* JADX INFO: renamed from: i */
    public final Object m92658i(Object arguments) {
        List list = arguments instanceof List ? (List) arguments : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 2) {
            throw new RuntimeException("list length must be 2");
        }
        C23647c c23647c = C23647c.f46337a;
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        return c23647c.m56351b((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: j */
    public final Object m92659j(Object arguments) {
        List list = arguments instanceof List ? (List) arguments : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 2) {
            throw new RuntimeException("list length must be 2");
        }
        C23647c c23647c = C23647c.f46337a;
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        return c23647c.m56353d(str, obj2 instanceof String ? (String) obj2 : null);
    }

    /* JADX INFO: renamed from: k */
    public final Object m92660k(Object arguments) {
        List list = arguments instanceof List ? (List) arguments : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 2) {
            throw new RuntimeException("list length must be 2");
        }
        C23647c c23647c = C23647c.f46337a;
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        return c23647c.m56354e((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: l */
    public final Object m92661l(Object arguments) {
        List list = arguments instanceof List ? (List) arguments : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 1) {
            throw new RuntimeException("list length must be 1");
        }
        C23647c c23647c = C23647c.f46337a;
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        return c23647c.m56357h((String) obj);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.kubi.flutter.security.channel.SecurityClient
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo24073e(@NotNull String str, @Nullable Object obj, @NotNull Continuation<Object> continuation) throws Throwable {
        switch (str.hashCode()) {
            case -903629273:
                if (str.equals("sha256")) {
                    return m92661l(obj);
                }
                break;
            case -647005119:
                if (str.equals("encryptAesGcmByKey")) {
                    return m92660k(obj);
                }
                break;
            case 408436106:
                if (str.equals("decryptAesGcmByAlias")) {
                    return m92657h(obj);
                }
                break;
            case 989299634:
                if (str.equals("encryptAesGcmByAlias")) {
                    return m92659j(obj);
                }
                break;
            case 1055181849:
                if (str.equals("decryptAesGcmByKey")) {
                    return m92658i(obj);
                }
                break;
        }
        throw new RuntimeException("not support method: " + str);
    }
}
