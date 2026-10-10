package com.kubi.config.core;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import com.kubi.config.Config;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FirebaseConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m90084d2 = {"Lcom/kubi/config/core/FirebaseConfig;", "Lcom/kubi/config/core/IRemoteConfig;", "<init>", "()V", "Lcom/kubi/config/Config;", "_config", "", "f", "(Lcom/kubi/config/Config;)V", "", "name", "e", "(Ljava/lang/String;)Ljava/lang/String;", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "i", "()Lio/reactivex/subjects/PublishSubject;", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "c", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/config/Config;", "config", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "b", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "remoteConfig", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "defaultConfig", "d", "Lio/reactivex/subjects/PublishSubject;", "configSubject", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class FirebaseConfig implements IRemoteConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Config config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final FirebaseRemoteConfig remoteConfig = RemoteConfigKt.getRemoteConfig(Firebase.INSTANCE);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, String> defaultConfig = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final PublishSubject<Boolean> configSubject;

    /* JADX INFO: renamed from: c */
    public final void m20465c() {
        this.remoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener() { // from class: com.kubi.config.core.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FirebaseConfig.m20464d(this.f19645b, task);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public String m20466e(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String string = this.remoteConfig.getString(name);
        Intrinsics.checkNotNullExpressionValue(string, "remoteConfig.getString(name)");
        return TextUtils.isEmpty(string) ? this.defaultConfig.get(name) : string;
    }

    /* JADX INFO: renamed from: f */
    public void m20467f(@NotNull Config _config) {
        Intrinsics.checkNotNullParameter(_config, "_config");
        this.config = _config;
        m20469h();
        m20468g();
        m20465c();
    }

    /* JADX INFO: renamed from: g */
    public final void m20468g() {
        this.remoteConfig.setConfigSettingsAsync(RemoteConfigKt.remoteConfigSettings(new Function1<FirebaseRemoteConfigSettings.Builder, Unit>() { // from class: com.kubi.config.core.FirebaseConfig$initRemoteConfig$configSettings$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FirebaseRemoteConfigSettings.Builder builder) {
                invoke2(builder);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FirebaseRemoteConfigSettings.Builder remoteConfigSettings) {
                Intrinsics.checkNotNullParameter(remoteConfigSettings, "$this$remoteConfigSettings");
                Config config = this.this$0.config;
                if (config == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("config");
                    config = null;
                }
                remoteConfigSettings.setMinimumFetchIntervalInSeconds(config.getFetchInterval());
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final void m20469h() {
        this.defaultConfig.clear();
        ConcurrentHashMap<String, String> concurrentHashMap = this.defaultConfig;
        Config config = this.config;
        Config config2 = null;
        if (config == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            config = null;
        }
        Context context = config.getContext();
        Config config3 = this.config;
        if (config3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        } else {
            config2 = config3;
        }
        Integer configDefault = config2.getConfigDefault();
        if (configDefault != null) {
            concurrentHashMap.putAll(DefaultsXmlParser.getDefaultsFromXml(context, configDefault.intValue()));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public PublishSubject<Boolean> m20470i() {
        return this.configSubject;
    }

    public FirebaseConfig() {
        PublishSubject<Boolean> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Boolean>()");
        this.configSubject = publishSubjectCreate;
    }

    /* JADX INFO: renamed from: d */
    public static final void m20464d(FirebaseConfig this$0, Task it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.configSubject.onNext(Boolean.valueOf(it.isSuccessful()));
    }
}
