package com.kubi.restful;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.restful.a */
/* JADX INFO: compiled from: BaseProxy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H&¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u000bJ/\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0014\u0010\u0011J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001e¨\u0006 "}, m90084d2 = {"Lcom/kubi/restful/a;", "", "<init>", "()V", "", "key", "value", "", "b", "(Ljava/lang/String;Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Z", ExifInterface.GPS_DIRECTION_TRUE, "default", "Ljava/lang/reflect/Type;", "type", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "f", "e", "g", "Lcom/kubi/restful/f;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerOnChangeListener", "(Lcom/kubi/restful/f;)V", "unregisterOnChangeListener", "c", "(Ljava/lang/String;)V", "", "Ljava/util/List;", "listenerList", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public abstract class AbstractC23185a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List<InterfaceC23190f> listenerList = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m55648a(@NotNull String key) {
        boolean zMo55652e;
        Intrinsics.checkNotNullParameter(key, "key");
        zMo55652e = mo55652e(key);
        m55650c(key);
        return zMo55652e;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m55649b(@NotNull String key, @NotNull Object value) {
        boolean zMo55653f;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        zMo55653f = mo55653f(key, value);
        m55650c(key);
        return zMo55653f;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m55650c(String key) {
        Iterator<T> it = this.listenerList.iterator();
        while (it.hasNext()) {
            ((InterfaceC23190f) it.next()).mo55658c(key);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final synchronized <T> T m55651d(@NotNull String key, @NotNull String str, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        Intrinsics.checkNotNullParameter(type, "type");
        return (T) mo55654g(key, str, type);
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo55652e(@NotNull String key);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo55653f(@NotNull String key, @NotNull Object value);

    @Nullable
    /* JADX INFO: renamed from: g */
    public abstract <T> T mo55654g(@NotNull String key, @NotNull String str, @NotNull Type type);

    public final synchronized void registerOnChangeListener(@NotNull InterfaceC23190f listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.listenerList.contains(listener)) {
            return;
        }
        this.listenerList.add(listener);
    }

    public final synchronized void unregisterOnChangeListener(@NotNull InterfaceC23190f listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.listenerList.contains(listener)) {
            this.listenerList.remove(listener);
        }
    }
}
