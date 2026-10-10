package com.facebook.fresco.p061ui.common;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ControllerListener2.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\f\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/fresco/ui/common/ControllerListener2;", "INFO", "", "", "id", "callerContext", "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "extraData", "", "i", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "imageInfo", "g", "onIntermediateImageSet", "(Ljava/lang/String;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "", "throwable", "j", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "Extras", "ui-common_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface ControllerListener2<INFO> {

    /* JADX INFO: compiled from: ControllerListener2.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0007R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0007R$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010)\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, m90084d2 = {"Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "", "<init>", "()V", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Map;", "componentExtras", "b", "shortcutExtras", "c", "datasourceExtras", "d", "imageExtras", "e", "imageSourceExtras", "f", "Ljava/lang/Object;", "callerContext", "Landroid/net/Uri;", "g", "Landroid/net/Uri;", "mainUri", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "I", "viewportWidth", "i", "viewportHeight", "j", "scaleType", "", "k", "Ljava/lang/Float;", "focusX", CmcdData.Factory.STREAM_TYPE_LIVE, "focusY", "", "m", "Z", "logWithHighSamplingRate", "n", "Companion", "ui-common_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Extras {

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Map<String, ? extends Object> componentExtras;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Map<String, ? extends Object> shortcutExtras;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Map<String, ? extends Object> datasourceExtras;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Map<String, ? extends Object> imageExtras;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Map<String, ? extends Object> imageSourceExtras;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Object callerContext;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Uri mainUri;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @JvmField
        public int viewportWidth = -1;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @JvmField
        public int viewportHeight = -1;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Object scaleType;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Float focusX;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Float focusY;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @JvmField
        public boolean logWithHighSamplingRate;

        /* JADX INFO: compiled from: ControllerListener2.kt */
        @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/facebook/fresco/ui/common/ControllerListener2$Extras$Companion;", "", "<init>", "()V", "", "", "componentExtras", "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "of", "(Ljava/util/Map;)Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "map", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/Map;)Ljava/util/Map;", "ui-common_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nControllerListener2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControllerListener2.kt\ncom/facebook/fresco/ui/common/ControllerListener2$Extras$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            /* JADX INFO: renamed from: a */
            public final Map<String, Object> m8840a(Map<String, ? extends Object> map) {
                if (map != null) {
                    return new ConcurrentHashMap(map);
                }
                return null;
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: of */
            public final Extras m8841of(@Nullable Map<String, ? extends Object> componentExtras) {
                Extras extras = new Extras();
                extras.componentExtras = componentExtras;
                return extras;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo8835a(@NotNull String id2);

    /* JADX INFO: renamed from: g */
    void mo8836g(@NotNull String id2, @Nullable INFO imageInfo, @Nullable Extras extraData);

    /* JADX INFO: renamed from: h */
    void mo8837h(@NotNull String id2, @Nullable Extras extraData);

    /* JADX INFO: renamed from: i */
    void mo8838i(@NotNull String id2, @Nullable Object callerContext, @Nullable Extras extraData);

    /* JADX INFO: renamed from: j */
    void mo8839j(@NotNull String id2, @Nullable Throwable throwable, @Nullable Extras extraData);

    void onIntermediateImageSet(@NotNull String id2, @Nullable INFO imageInfo);
}
