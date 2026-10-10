package p330i3;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: i3.a */
/* JADX INFO: compiled from: BannedParamManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J)\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013R&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Li3/a;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/os/Bundle;", "parameters", "d", "(Landroid/os/Bundle;)V", "b", "Lorg/json/JSONArray;", "paramValues", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "c", "(Lorg/json/JSONArray;)Ljava/util/HashSet;", "", "Z", "enabled", "Ljava/util/HashSet;", "bannedParamsConfig", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBannedParamManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannedParamManager.kt\ncom/facebook/appevents/integrity/BannedParamManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1855#2,2:68\n*S KotlinDebug\n*F\n+ 1 BannedParamManager.kt\ncom/facebook/appevents/integrity/BannedParamManager\n*L\n61#1:68,2\n*E\n"})
public final class C38429a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38429a f86229a = new C38429a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static HashSet<String> bannedParamsConfig = new HashSet<>();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m86659a() {
        if (C42757a.m93689d(C38429a.class)) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            f86229a.m86661b();
            enabled = !bannedParamsConfig.isEmpty();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38429a.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m86660d(@Nullable Bundle parameters) {
        if (C42757a.m93689d(C38429a.class)) {
            return;
        }
        try {
            if (enabled && parameters != null) {
                Iterator<T> it = bannedParamsConfig.iterator();
                while (it.hasNext()) {
                    parameters.remove((String) it.next());
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38429a.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m86661b() {
        if (!C42757a.m93689d(this)) {
            try {
                FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false);
                if (fetchedAppSettingsM9982u == null) {
                    return;
                }
                bannedParamsConfig = m86662c(fetchedAppSettingsM9982u.getBannedParams());
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final HashSet<String> m86662c(JSONArray paramValues) {
        try {
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                HashSet<String> hashSetM10074l = C5760c.m10074l(paramValues);
                if (hashSetM10074l == null) {
                    return new HashSet<>();
                }
                return hashSetM10074l;
            } catch (Exception unused) {
                return new HashSet<>();
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }
}
