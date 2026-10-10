package com.kubi.log.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import so.InterfaceC44530a;
import so.InterfaceC44531b;
import so.InterfaceC44532c;
import so.InterfaceC44533d;
import to.C45055b;
import to.C45056c;

/* JADX INFO: compiled from: LogConfigManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u0000 22\u00020\u0001:\u0002\u00153BM\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#\"\u0004\b$\u0010%R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b!\u0010'\"\u0004\b(\u0010)R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\"\u001a\u0004\b\u0015\u0010#\"\u0004\b-\u0010%R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010.\u001a\u0004\b*\u0010/\"\u0004\b0\u00101¨\u00064"}, m90084d2 = {"Lcom/kubi/log/core/LogConfig;", "", "Lso/b;", "processor", "Lso/d;", "symbolProcessor", "", "defaultTag", "", "Lso/a;", "logAdapters", "Lso/c;", "symbolLogAdapters", RemoteConfigConstants.RequestFieldKey.APP_ID, "Lcom/kubi/log/core/a$a;", "provider", "<init>", "(Lso/b;Lso/d;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kubi/log/core/a$a;)V", "Lcom/kubi/log/core/LogConfig$a;", "builder", "(Lcom/kubi/log/core/LogConfig$a;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lso/b;", "d", "()Lso/b;", "setProcessor", "(Lso/b;)V", "b", "Lso/d;", "g", "()Lso/d;", "setSymbolProcessor", "(Lso/d;)V", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "setDefaultTag", "(Ljava/lang/String;)V", "Ljava/util/List;", "()Ljava/util/List;", "setLogAdapters", "(Ljava/util/List;)V", "e", "f", "setSymbolLogAdapters", "setAppId", "Lcom/kubi/log/core/a$a;", "()Lcom/kubi/log/core/a$a;", "setProvider", "(Lcom/kubi/log/core/a$a;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "Companion", "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class LogConfig {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public InterfaceC44531b processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public InterfaceC44533d symbolProcessor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public String defaultTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<? extends InterfaceC44530a> logAdapters;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<? extends InterfaceC44532c> symbolLogAdapters;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public String appId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public C17473a.a provider;

    /* JADX INFO: compiled from: LogConfigManager.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/log/core/LogConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/kubi/log/core/LogConfig$a;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/kubi/log/core/LogConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/kubi/log/core/LogConfig;", "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final LogConfig build(@NotNull Function1<? super C17472a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            C17472a c17472a = new C17472a();
            block.invoke(c17472a);
            return c17472a.m37841a();
        }
    }

    /* JADX INFO: renamed from: com.kubi.log.core.LogConfig$a */
    /* JADX INFO: compiled from: LogConfigManager.kt */
    @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001d\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R\"\u0010.\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016\"\u0004\b-\u0010\u0018¨\u0006/"}, m90084d2 = {"Lcom/kubi/log/core/LogConfig$a;", "", "<init>", "()V", "Lcom/kubi/log/core/LogConfig;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/log/core/LogConfig;", "Lso/b;", "<set-?>", "Lso/b;", "e", "()Lso/b;", "processor", "Lso/d;", "b", "Lso/d;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lso/d;", "symbolProcessor", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "defaultTag", "", "Lso/a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "k", "(Ljava/util/List;)V", "logAdapters", "Lso/c;", "g", "m", "symbolLogAdapters", "Lcom/kubi/log/core/a$a;", "f", "Lcom/kubi/log/core/a$a;", "()Lcom/kubi/log/core/a$a;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/kubi/log/core/a$a;)V", "provider", "i", RemoteConfigConstants.RequestFieldKey.APP_ID, "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C17472a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public InterfaceC44531b processor = new C45055b();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public InterfaceC44533d symbolProcessor = new C45056c();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public String defaultTag = "log";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public List<? extends InterfaceC44530a> logAdapters = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public List<? extends InterfaceC44532c> symbolLogAdapters = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public C17473a.a provider = new a();

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public String appId = "";

        /* JADX INFO: renamed from: com.kubi.log.core.LogConfig$a$a */
        /* JADX INFO: compiled from: LogConfigManager.kt */
        @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/log/core/LogConfig$a$a", "Lcom/kubi/log/core/a$a;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "", "b", "()Ljava/util/Map;", "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class a implements C17473a.a {
            @Override // com.kubi.log.core.C17473a.a
            @NotNull
            /* JADX INFO: renamed from: a */
            public String mo37854a() {
                return "";
            }

            @Override // com.kubi.log.core.C17473a.a
            @NotNull
            /* JADX INFO: renamed from: b */
            public Map<String, String> mo37855b() {
                return MapsKt.emptyMap();
            }
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final LogConfig m37841a() {
            return new LogConfig(this, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDefaultTag() {
            return this.defaultTag;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final List<InterfaceC44530a> m37844d() {
            return this.logAdapters;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC44531b getProcessor() {
            return this.processor;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final C17473a.a getProvider() {
            return this.provider;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final List<InterfaceC44532c> m37847g() {
            return this.symbolLogAdapters;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final InterfaceC44533d getSymbolProcessor() {
            return this.symbolProcessor;
        }

        /* JADX INFO: renamed from: i */
        public final void m37849i(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.appId = str;
        }

        /* JADX INFO: renamed from: j */
        public final void m37850j(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.defaultTag = str;
        }

        /* JADX INFO: renamed from: k */
        public final void m37851k(@NotNull List<? extends InterfaceC44530a> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.logAdapters = list;
        }

        /* JADX INFO: renamed from: l */
        public final void m37852l(@NotNull C17473a.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.provider = aVar;
        }

        /* JADX INFO: renamed from: m */
        public final void m37853m(@NotNull List<? extends InterfaceC44532c> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.symbolLogAdapters = list;
        }
    }

    public /* synthetic */ LogConfig(C17472a c17472a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c17472a);
    }

    public LogConfig(InterfaceC44531b interfaceC44531b, InterfaceC44533d interfaceC44533d, String str, List<? extends InterfaceC44530a> list, List<? extends InterfaceC44532c> list2, String str2, C17473a.a aVar) {
        this.processor = interfaceC44531b;
        this.symbolProcessor = interfaceC44533d;
        this.defaultTag = str;
        this.logAdapters = list;
        this.symbolLogAdapters = list2;
        this.appId = str2;
        this.provider = aVar;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDefaultTag() {
        return this.defaultTag;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<InterfaceC44530a> m37836c() {
        return this.logAdapters;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC44531b getProcessor() {
        return this.processor;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final C17473a.a getProvider() {
        return this.provider;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<InterfaceC44532c> m37839f() {
        return this.symbolLogAdapters;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC44533d getSymbolProcessor() {
        return this.symbolProcessor;
    }

    public LogConfig(C17472a c17472a) {
        this(c17472a.getProcessor(), c17472a.getSymbolProcessor(), c17472a.getDefaultTag(), c17472a.m37844d(), c17472a.m37847g(), c17472a.getAppId(), c17472a.getProvider());
    }
}
