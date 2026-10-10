package com.kubi.config;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cc.C4930a;
import com.google.gson.Gson;
import com.kubi.config.exception.KCConfigException;
import io.reactivex.Observable;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Deprecated;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RemoteConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/config/RemoteConfig;", "", "<init>", "()V", "Lcom/kubi/config/Config;", "config", "", "d", "(Lcom/kubi/config/Config;)V", "", "name", "b", "(Ljava/lang/String;)Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Type;", "type", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "Lio/reactivex/Observable;", "", "e", "()Lio/reactivex/Observable;", "Lcom/kubi/config/Config;", "Lcom/google/gson/Gson;", "c", "Lkotlin/Lazy;", "()Lcom/google/gson/Gson;", "gson", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class RemoteConfig {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static Config config;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RemoteConfig f19636a = new RemoteConfig();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy gson = LazyKt.lazy(new Function0<Gson>() { // from class: com.kubi.config.RemoteConfig$gson$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    });

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> T m20457a(@NotNull String name, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        String strM20458b = m20458b(name);
        if (strM20458b == null) {
            return null;
        }
        try {
            return (T) f19636a.m20461c().fromJson(strM20458b, type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    @Deprecated(message = "请使用容错API", replaceWith = @ReplaceWith(expression = "inline fun <reified T> getConfig(name: String): T?", imports = {"com.kubi.config.RemoteConfig"}))
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m20458b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return C4930a.f5466a.m5150a(name);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m20459d(@NotNull Config config2) {
        Intrinsics.checkNotNullParameter(config2, "config");
        config = config2;
        C4930a.f5466a.m5151b(config2);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Observable<Boolean> m20460e() {
        return C4930a.f5466a.m5152c();
    }

    /* JADX INFO: renamed from: c */
    public final Gson m20461c() {
        return (Gson) gson.getValue();
    }
}
