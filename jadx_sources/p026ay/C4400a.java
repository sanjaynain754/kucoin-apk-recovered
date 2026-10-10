package p026ay;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import cy.InterfaceC36555b;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ay.a */
/* JADX INFO: compiled from: Postcard.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00002\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R4\u00101\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010>\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006?"}, m90084d2 = {"Lay/a;", "", "Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;)V", "Lcy/b;", DbParams.KEY_CHANNEL_RESULT, "n", "(Lcy/b;)Lay/a;", "", "flag", "c", "(I)Lay/a;", "Lcom/kubi/router/model/IRedirect;", "redirect", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/kubi/router/model/IRedirect;)Lay/a;", "", "url", "m", "(Ljava/lang/String;)Lay/a;", "key", "value", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/Object;)Lay/a;", "", "map", "b", "(Ljava/util/Map;)Lay/a;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/String;", "", "k", "()Z", "Landroid/net/Uri;", "j", "()Landroid/net/Uri;", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "", "Lzx/b;", "<set-?>", "Ljava/util/List;", "f", "()Ljava/util/List;", "interceptors", "i", "()Lcy/b;", "q", "(Lcy/b;)V", "g", "()Lcom/kubi/router/model/IRedirect;", "p", "(Lcom/kubi/router/model/IRedirect;)V", "e", "()I", "o", "(I)V", "flags", "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPostcard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Postcard.kt\ncom/kubi/router/model/Postcard\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n1855#2,2:141\n1855#2,2:143\n*S KotlinDebug\n*F\n+ 1 Postcard.kt\ncom/kubi/router/model/Postcard\n*L\n118#1:141,2\n129#1:143,2\n*E\n"})
public final class C4400a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Uri uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Bundle bundle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public List<InterfaceC46936b> interceptors;

    public C4400a(@NotNull Uri uri, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.uri = uri;
        this.bundle = bundle;
        RouteExKt.m56242d(bundle, uri);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C4400a m4038a(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value == null) {
            return this;
        }
        if (value instanceof Byte) {
            RouteExKt.m56253i0(this.bundle, key, ((Number) value).byteValue());
            return this;
        }
        if (value instanceof Short) {
            RouteExKt.m56279v0(this.bundle, key, ((Number) value).shortValue());
            return this;
        }
        if (value instanceof Integer) {
            RouteExKt.m56259l0(this.bundle, key, ((Number) value).intValue());
            return this;
        }
        if (value instanceof Long) {
            RouteExKt.m56267p0(this.bundle, key, ((Number) value).longValue());
            return this;
        }
        if (value instanceof Float) {
            RouteExKt.m56257k0(this.bundle, key, ((Number) value).floatValue());
            return this;
        }
        if (value instanceof Double) {
            RouteExKt.m56255j0(this.bundle, key, ((Number) value).doubleValue());
            return this;
        }
        if (value instanceof Boolean) {
            RouteExKt.m56249g0(this.bundle, key, ((Boolean) value).booleanValue());
            return this;
        }
        if (value instanceof String) {
            RouteExKt.m56283x0(this.bundle, key, (String) value);
            return this;
        }
        if (value instanceof Class) {
            Bundle bundle = this.bundle;
            String name = ((Class) value).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            RouteExKt.m56283x0(bundle, key, name);
            return this;
        }
        if (value instanceof Bundle) {
            RouteExKt.m56251h0(this.bundle, key, (Bundle) value);
            return this;
        }
        if (value instanceof Parcelable) {
            RouteExKt.m56269q0(this.bundle, key, (Parcelable) value);
            return this;
        }
        if (value instanceof Serializable) {
            RouteExKt.m56277u0(this.bundle, key, (Serializable) value);
            return this;
        }
        RouteExKt.m56261m0(this.bundle, key, value);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C4400a m4039b(@Nullable Map<String, ? extends Object> map) {
        Set<Map.Entry<String, ? extends Object>> setEntrySet;
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                m4038a((String) entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Bundle getBundle() {
        return this.bundle;
    }

    /* JADX INFO: renamed from: e */
    public final int m4042e() {
        return RouteExKt.m56229T(this.bundle);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final List<InterfaceC46936b> m4043f() {
        return this.interceptors;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final IRedirect m4044g() {
        return RouteExKt.m56232W(this.bundle);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m4045h() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(this.uri.getScheme());
        builder.authority(this.uri.getAuthority());
        builder.path(this.uri.getPath());
        Set<String> setKeySet = this.bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            Bundle bundle = this.bundle;
            Intrinsics.checkNotNull(str);
            String strM56239b0 = RouteExKt.m56239b0(bundle, str);
            if (strM56239b0 != null) {
                builder.appendQueryParameter(str, strM56239b0);
            }
        }
        String string = builder.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final InterfaceC36555b m4046i() {
        return RouteExKt.m56234Y(this.bundle);
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4048k() {
        return Router.f46192a.m56198t(this);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final C4400a m4049l(@NotNull IRedirect redirect) {
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        m4053p(redirect);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final C4400a m4050m(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        RouteExKt.m56273s0(this.bundle, url);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final C4400a m4051n(@NotNull InterfaceC36555b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        m4054q(result);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final void m4052o(int i11) {
        RouteExKt.m56263n0(this.bundle, i11);
    }

    /* JADX INFO: renamed from: p */
    public final void m4053p(@Nullable IRedirect iRedirect) {
        Bundle bundle = this.bundle;
        Intrinsics.checkNotNull(iRedirect);
        RouteExKt.m56271r0(bundle, iRedirect);
    }

    /* JADX INFO: renamed from: q */
    public final void m4054q(@Nullable InterfaceC36555b interfaceC36555b) {
        Bundle bundle = this.bundle;
        Intrinsics.checkNotNull(interfaceC36555b);
        RouteExKt.m56275t0(bundle, interfaceC36555b);
    }

    public /* synthetic */ C4400a(Uri uri, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, (i11 & 2) != 0 ? new Bundle() : bundle);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C4400a m4040c(int flag) {
        m4052o(flag);
        return this;
    }
}
