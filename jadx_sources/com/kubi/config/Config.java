package com.kubi.config;

import android.content.Context;
import androidx.annotation.XmlRes;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.config.kcrc.KCRemoteConfigParam;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RemoteConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001%BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, m90084d2 = {"Lcom/kubi/config/Config;", "", "Landroid/content/Context;", "context", "", "configDefault", "", "fetchInterval", "Lkotlin/Function1;", "", "", "errorHandler", "Lcom/kubi/config/kcrc/KCRemoteConfigParam;", "kcParam", "", "", "keyByFirebaseList", "<init>", "(Landroid/content/Context;Ljava/lang/Integer;JLkotlin/jvm/functions/Function1;Lcom/kubi/config/kcrc/KCRemoteConfigParam;Ljava/util/List;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "b", "()Landroid/content/Context;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "J", "d", "()J", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "e", "Lcom/kubi/config/kcrc/KCRemoteConfigParam;", "()Lcom/kubi/config/kcrc/KCRemoteConfigParam;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Builder", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class Config {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Integer configDefault;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long fetchInterval;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function1<Throwable, Unit> errorHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final KCRemoteConfigParam kcParam;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<String> keyByFirebaseList;

    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010&R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010'¨\u0006)"}, m90084d2 = {"Lcom/kubi/config/Config$Builder;", "", "<init>", "()V", "", "default", "b", "(I)Lcom/kubi/config/Config$Builder;", "", JPushConstants.Geofence.KEY_INTERVAL, "d", "(J)Lcom/kubi/config/Config$Builder;", "Lkotlin/Function1;", "", "", "handler", "c", "(Lkotlin/jvm/functions/Function1;)Lcom/kubi/config/Config$Builder;", "Lcom/kubi/config/kcrc/KCRemoteConfigParam;", "kcrcParam", "e", "(Lcom/kubi/config/kcrc/KCRemoteConfigParam;)Lcom/kubi/config/Config$Builder;", "", "", "list", "f", "(Ljava/util/List;)Lcom/kubi/config/Config$Builder;", "Landroid/content/Context;", "context", "Lcom/kubi/config/Config;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Lcom/kubi/config/Config;", "Ljava/lang/Integer;", "configDefault", "Ljava/lang/Long;", "fetchInterval", "Lkotlin/jvm/functions/Function1;", "errorHandler", "Lcom/kubi/config/kcrc/KCRemoteConfigParam;", "Ljava/util/List;", "keyByFirebaseList", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Integer configDefault;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Long fetchInterval;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public Function1<? super Throwable, Unit> errorHandler;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public KCRemoteConfigParam kcrcParam;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public List<String> keyByFirebaseList = CollectionsKt.emptyList();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Config m20451a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.fetchInterval == null) {
                this.fetchInterval = 720L;
            }
            if (this.errorHandler == null) {
                this.errorHandler = new Function1<Throwable, Unit>() { // from class: com.kubi.config.Config$Builder$build$1
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) throws Throwable {
                        invoke2(th2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable it) throws Throwable {
                        Intrinsics.checkNotNullParameter(it, "it");
                        throw it;
                    }
                };
            }
            if (this.kcrcParam == null) {
                throw new IllegalArgumentException("必须设置KCRemoteConfigParam，请调用Builder.setKCRemoteConfigParam");
            }
            Integer num = this.configDefault;
            Long l11 = this.fetchInterval;
            Intrinsics.checkNotNull(l11);
            long jLongValue = l11.longValue();
            Function1<? super Throwable, Unit> function1 = this.errorHandler;
            Intrinsics.checkNotNull(function1);
            KCRemoteConfigParam kCRemoteConfigParam = this.kcrcParam;
            Intrinsics.checkNotNull(kCRemoteConfigParam);
            return new Config(context, num, jLongValue, function1, kCRemoteConfigParam, this.keyByFirebaseList);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Builder m20453c(@NotNull Function1<? super Throwable, Unit> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.errorHandler = handler;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Builder m20455e(@NotNull KCRemoteConfigParam kcrcParam) {
            Intrinsics.checkNotNullParameter(kcrcParam, "kcrcParam");
            this.kcrcParam = kcrcParam;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Builder m20456f(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.keyByFirebaseList = list;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Builder m20452b(int i11) {
            this.configDefault = Integer.valueOf(i11);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Builder m20454d(long interval) {
            this.fetchInterval = Long.valueOf(interval);
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Config(@NotNull Context context, @XmlRes @Nullable Integer num, long j11, @NotNull Function1<? super Throwable, Unit> errorHandler, @NotNull KCRemoteConfigParam kcParam, @NotNull List<String> keyByFirebaseList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(kcParam, "kcParam");
        Intrinsics.checkNotNullParameter(keyByFirebaseList, "keyByFirebaseList");
        this.context = context;
        this.configDefault = num;
        this.fetchInterval = j11;
        this.errorHandler = errorHandler;
        this.kcParam = kcParam;
        this.keyByFirebaseList = keyByFirebaseList;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getConfigDefault() {
        return this.configDefault;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Function1<Throwable, Unit> m20447c() {
        return this.errorHandler;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getFetchInterval() {
        return this.fetchInterval;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final KCRemoteConfigParam getKcParam() {
        return this.kcParam;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<String> m20450f() {
        return this.keyByFirebaseList;
    }
}
