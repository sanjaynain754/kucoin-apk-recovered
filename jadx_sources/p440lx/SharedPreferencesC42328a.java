package p440lx;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.Gson;
import com.kubi.restful.AbstractC23185a;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lx.a */
/* JADX INFO: compiled from: SpProxy.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\u00020\n2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00060\u0006H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u000eJ\u0018\u0010\u0019\u001a\n \u0015*\u0004\u0018\u00010\u00180\u0018H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ<\u0010\u001d\u001a.\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00060\u0006\u0012\u0002\b\u0003 \u0015*\u0016\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00060\u0006\u0012\u0002\b\u0003\u0018\u00010\u001c0\u001bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010 \u001a\u00020\n2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u001f\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b \u0010!J(\u0010#\u001a\u00020\"2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u001f\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b#\u0010$J(\u0010&\u001a\u00020%2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u001f\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b&\u0010'J(\u0010)\u001a\u00020(2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u001f\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b)\u0010*J.\u0010+\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00060\u00062\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0097\u0001¢\u0006\u0004\b+\u0010,Jv\u0010/\u001a(\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00060\u0006\u0018\u0001 \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00060\u0006\u0018\u00010.0-2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00060\u00062.\b\u0001\u0010\u001f\u001a(\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00060\u0006\u0018\u0001 \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00060\u0006\u0018\u00010.0-H\u0097\u0001¢\u0006\u0004\b/\u00100J \u00103\u001a\u0002022\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010101H\u0096\u0001¢\u0006\u0004\b3\u00104J \u00105\u001a\u0002022\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010101H\u0096\u0001¢\u0006\u0004\b5\u00104J\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, m90084d2 = {"Llx/a;", "Lcom/kubi/restful/a;", "Landroid/content/SharedPreferences;", "sp", "<init>", "(Landroid/content/SharedPreferences;)V", "", "key", "", "value", "", "f", "(Ljava/lang/String;Ljava/lang/Object;)Z", "e", "(Ljava/lang/String;)Z", ExifInterface.GPS_DIRECTION_TRUE, "default", "Ljava/lang/reflect/Type;", "type", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "p0", "contains", "Landroid/content/SharedPreferences$Editor;", "edit", "()Landroid/content/SharedPreferences$Editor;", "", "", "getAll", "()Ljava/util/Map;", "p1", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getFloat", "(Ljava/lang/String;F)F", "", "getInt", "(Ljava/lang/String;I)I", "", "getLong", "(Ljava/lang/String;J)J", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "", "getStringSet", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "", "registerOnSharedPreferenceChangeListener", "(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V", "unregisterOnSharedPreferenceChangeListener", "Lcom/google/gson/Gson;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lcom/google/gson/Gson;", "b", "Landroid/content/SharedPreferences;", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public class SharedPreferencesC42328a extends AbstractC23185a implements SharedPreferences {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final SharedPreferences sp;

    public SharedPreferencesC42328a(@NotNull SharedPreferences sp2) {
        Intrinsics.checkNotNullParameter(sp2, "sp");
        this.sp = sp2;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String p11) {
        return this.sp.contains(p11);
    }

    @Override // com.kubi.restful.AbstractC23185a
    /* JADX INFO: renamed from: e */
    public boolean mo55652e(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sp.edit().remove(key).commit();
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this.sp.edit();
    }

    @Override // com.kubi.restful.AbstractC23185a
    /* JADX INFO: renamed from: f */
    public boolean mo55653f(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.sp.edit().putString(key, m92875h().toJson(value)).commit();
    }

    @Override // com.kubi.restful.AbstractC23185a
    @Nullable
    /* JADX INFO: renamed from: g */
    public <T> T mo55654g(@NotNull String key, @NotNull String str, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        Intrinsics.checkNotNullParameter(type, "type");
        String string = this.sp.getString(key, str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (T) m92875h().fromJson(string, type);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return this.sp.getAll();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String p11, boolean p12) {
        return this.sp.getBoolean(p11, p12);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String p11, float p12) {
        return this.sp.getFloat(p11, p12);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String p11, int p12) {
        return this.sp.getInt(p11, p12);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String p11, long p12) {
        return this.sp.getLong(p11, p12);
    }

    @Override // android.content.SharedPreferences
    @android.annotation.Nullable
    @Nullable
    public String getString(String p11, @android.annotation.Nullable @Nullable String p12) {
        return this.sp.getString(p11, p12);
    }

    @Override // android.content.SharedPreferences
    @android.annotation.Nullable
    @Nullable
    public Set<String> getStringSet(String p11, @android.annotation.Nullable @Nullable Set<String> p12) {
        return this.sp.getStringSet(p11, p12);
    }

    /* JADX INFO: renamed from: h */
    public final Gson m92875h() {
        return new Gson();
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener p11) {
        this.sp.registerOnSharedPreferenceChangeListener(p11);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener p11) {
        this.sp.unregisterOnSharedPreferenceChangeListener(p11);
    }
}
