package com.kubi.sdk.pkg.bundle.i18n;

import android.util.AtomicFile;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5288p;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kubi.sdk.pkg.util.C23985b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.p407io.FilesKt;
import p852kotlin.p407io.TextStreamsKt;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: RnI18nStorage.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 $2\u00020\u0001:\u0003MNOB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b \u0010!J-\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010%J)\u0010(\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010)J#\u0010,\u001a\u00020\u001d2\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0*\"\u00020\fH\u0002¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u00101J\u0019\u00104\u001a\u0004\u0018\u00010\f2\u0006\u00103\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u00022\u0006\u00106\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u0004\u0018\u00010\u00172\b\u00106\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R0\u0010D\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070@j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007`A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR0\u0010F\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0@j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b`A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u0016\u0010I\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010HR\u0016\u0010L\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010H¨\u0006P"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;", "", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;", CmcdData.Factory.STREAM_TYPE_LIVE, "()Ljava/util/List;", "updates", "", "", "updatedBundleKeys", "", "g", "(Ljava/util/List;Ljava/util/Set;)V", "bundleKeys", "t", "(Ljava/util/Set;)V", "projectId", "siteType", "lang", "Lcom/google/gson/JsonObject;", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/JsonObject;", TtmlNode.TAG_BODY, "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;", "validator", "", "x", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;)Z", CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;)Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "()V", "j", "k", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "", "components", "i", "([Ljava/lang/String;)Z", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "o", "()Ljava/io/File;", "v", "file", "q", "(Ljava/io/File;)Ljava/lang/String;", "content", "w", "(Ljava/io/File;Ljava/lang/String;)Z", "p", "(Ljava/lang/String;)Lcom/google/gson/JsonObject;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/io/File;", "b", "Ljava/lang/Object;", "lock", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "c", "Ljava/util/LinkedHashMap;", "metadataByKey", "d", "validatorsByKey", "e", "Z", "metadataLoaded", "f", "validatorsLoaded", "active", "Companion", "PersistedBundleState", "PersistedValidatorState", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnI18nStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnI18nStorage.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n1855#2,2:236\n766#2:238\n857#2,2:239\n1855#2,2:241\n1789#2,3:243\n766#2:246\n857#2,2:247\n1855#2,2:249\n1855#2,2:251\n12541#3,2:253\n1#4:255\n*S KotlinDebug\n*F\n+ 1 RnI18nStorage.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage\n*L\n52#1:236,2\n53#1:238\n53#1:239,2\n53#1:241,2\n64#1:243,3\n147#1:246\n147#1:247,2\n147#1:249,2\n150#1:251,2\n184#1:253,2\n*E\n"})
public final class RnI18nStorage {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final String f47334i = "rnI18nStorage";

    /* JADX INFO: renamed from: j */
    public static final int f47335j = 1;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final String f47336k = "meta.json";

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final String f47337l = "validators.json";

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Regex f47338m = new Regex("^[A-Za-z0-9._-]+$");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File rootDir;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashMap<String, RnI18nBundleMeta> metadataByKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashMap<String, RnI18nHttpValidator> validatorsByKey;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean metadataLoaded;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean validatorsLoaded;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean active;

    /* JADX INFO: compiled from: RnI18nStorage.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage$Companion;", "", "()V", "META_FILE", "", "getMETA_FILE", "()Ljava/lang/String;", "SAFE_COMPONENT", "Lkotlin/text/Regex;", "getSAFE_COMPONENT", "()Lkotlin/text/Regex;", "SCHEMA_VERSION", "", "getSCHEMA_VERSION", "()I", "TAG", "getTAG", "VALIDATOR_FILE", "getVALIDATOR_FILE", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final String getMETA_FILE() {
            return RnI18nStorage.f47336k;
        }

        @NotNull
        public final Regex getSAFE_COMPONENT() {
            return RnI18nStorage.f47338m;
        }

        public final int getSCHEMA_VERSION() {
            return RnI18nStorage.f47335j;
        }

        @NotNull
        public final String getTAG() {
            return RnI18nStorage.f47334i;
        }

        @NotNull
        public final String getVALIDATOR_FILE() {
            return RnI18nStorage.f47337l;
        }
    }

    /* JADX INFO: compiled from: RnI18nStorage.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage$PersistedBundleState;", "", "schemaVersion", "", "bundles", "", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;", "(ILjava/util/List;)V", "getBundles", "()Ljava/util/List;", "getSchemaVersion", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class PersistedBundleState {

        @NotNull
        private final List<RnI18nBundleMeta> bundles;
        private final int schemaVersion;

        /* JADX WARN: Multi-variable type inference failed */
        public PersistedBundleState() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersistedBundleState)) {
                return false;
            }
            PersistedBundleState persistedBundleState = (PersistedBundleState) other;
            return this.schemaVersion == persistedBundleState.schemaVersion && Intrinsics.areEqual(this.bundles, persistedBundleState.bundles);
        }

        public PersistedBundleState(int i11, @NotNull List<RnI18nBundleMeta> bundles) {
            Intrinsics.checkNotNullParameter(bundles, "bundles");
            this.schemaVersion = i11;
            this.bundles = bundles;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PersistedBundleState copy$default(PersistedBundleState persistedBundleState, int i11, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = persistedBundleState.schemaVersion;
            }
            if ((i12 & 2) != 0) {
                list = persistedBundleState.bundles;
            }
            return persistedBundleState.copy(i11, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getSchemaVersion() {
            return this.schemaVersion;
        }

        @NotNull
        public final List<RnI18nBundleMeta> component2() {
            return this.bundles;
        }

        @NotNull
        public final PersistedBundleState copy(int schemaVersion, @NotNull List<RnI18nBundleMeta> bundles) {
            Intrinsics.checkNotNullParameter(bundles, "bundles");
            return new PersistedBundleState(schemaVersion, bundles);
        }

        @NotNull
        public final List<RnI18nBundleMeta> getBundles() {
            return this.bundles;
        }

        public final int getSchemaVersion() {
            return this.schemaVersion;
        }

        public int hashCode() {
            return (Integer.hashCode(this.schemaVersion) * 31) + this.bundles.hashCode();
        }

        @NotNull
        public String toString() {
            return "PersistedBundleState(schemaVersion=" + this.schemaVersion + ", bundles=" + this.bundles + ')';
        }

        public /* synthetic */ PersistedBundleState(int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? RnI18nStorage.INSTANCE.getSCHEMA_VERSION() : i11, (i12 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    /* JADX INFO: compiled from: RnI18nStorage.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0083\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage$PersistedValidatorState;", "", "schemaVersion", "", "validators", "", "", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;", "(ILjava/util/Map;)V", "getSchemaVersion", "()I", "getValidators", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class PersistedValidatorState {
        private final int schemaVersion;

        @NotNull
        private final Map<String, RnI18nHttpValidator> validators;

        /* JADX WARN: Multi-variable type inference failed */
        public PersistedValidatorState() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersistedValidatorState)) {
                return false;
            }
            PersistedValidatorState persistedValidatorState = (PersistedValidatorState) other;
            return this.schemaVersion == persistedValidatorState.schemaVersion && Intrinsics.areEqual(this.validators, persistedValidatorState.validators);
        }

        public PersistedValidatorState(int i11, @NotNull Map<String, RnI18nHttpValidator> validators) {
            Intrinsics.checkNotNullParameter(validators, "validators");
            this.schemaVersion = i11;
            this.validators = validators;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PersistedValidatorState copy$default(PersistedValidatorState persistedValidatorState, int i11, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = persistedValidatorState.schemaVersion;
            }
            if ((i12 & 2) != 0) {
                map = persistedValidatorState.validators;
            }
            return persistedValidatorState.copy(i11, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getSchemaVersion() {
            return this.schemaVersion;
        }

        @NotNull
        public final Map<String, RnI18nHttpValidator> component2() {
            return this.validators;
        }

        @NotNull
        public final PersistedValidatorState copy(int schemaVersion, @NotNull Map<String, RnI18nHttpValidator> validators) {
            Intrinsics.checkNotNullParameter(validators, "validators");
            return new PersistedValidatorState(schemaVersion, validators);
        }

        public final int getSchemaVersion() {
            return this.schemaVersion;
        }

        @NotNull
        public final Map<String, RnI18nHttpValidator> getValidators() {
            return this.validators;
        }

        public int hashCode() {
            return (Integer.hashCode(this.schemaVersion) * 31) + this.validators.hashCode();
        }

        @NotNull
        public String toString() {
            return "PersistedValidatorState(schemaVersion=" + this.schemaVersion + ", validators=" + this.validators + ')';
        }

        public /* synthetic */ PersistedValidatorState(int i11, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? RnI18nStorage.INSTANCE.getSCHEMA_VERSION() : i11, (i12 & 2) != 0 ? MapsKt.emptyMap() : map);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m57585i(String... components) {
        for (String str : components) {
            if (!f47338m.matches(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final JsonObject m57592p(String content) {
        Object objM103844constructorimpl;
        if (content == null || StringsKt.isBlank(content)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(JsonParser.parseString(content));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        JsonElement jsonElement = (JsonElement) objM103844constructorimpl;
        if (jsonElement == null) {
            return null;
        }
        if (!jsonElement.isJsonObject()) {
            jsonElement = null;
        }
        if (jsonElement != null) {
            return jsonElement.getAsJsonObject();
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final String m57593q(File file) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            FileInputStream fileInputStreamOpenRead = new AtomicFile(file).openRead();
            Intrinsics.checkNotNullExpressionValue(fileInputStreamOpenRead, "AtomicFile(file).openRead()");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStreamOpenRead, UTF_8), 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                objM103844constructorimpl = Result.m103844constructorimpl(text);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        return (String) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    public RnI18nStorage(@NotNull File rootDir) {
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.rootDir = rootDir;
        this.lock = new Object();
        this.metadataByKey = new LinkedHashMap<>();
        this.validatorsByKey = new LinkedHashMap<>();
        this.active = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m57583g(@NotNull List<RnI18nBundleMeta> updates, @NotNull Set<String> updatedBundleKeys) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(updatedBundleKeys, "updatedBundleKeys");
        synchronized (this.lock) {
            try {
                if (this.active) {
                    m57586j();
                    LinkedHashMap<String, RnI18nBundleMeta> linkedHashMap = this.metadataByKey;
                    Iterator<T> it = updatedBundleKeys.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.remove((String) it.next());
                    }
                    ArrayList<RnI18nBundleMeta> arrayList = new ArrayList();
                    for (Object obj : updates) {
                        if (((RnI18nBundleMeta) obj).getI18n().isValid()) {
                            arrayList.add(obj);
                        }
                    }
                    for (RnI18nBundleMeta rnI18nBundleMeta : arrayList) {
                        this.metadataByKey.put(rnI18nBundleMeta.getKey(), rnI18nBundleMeta);
                    }
                    File fileM57591o = m57591o();
                    Collection<RnI18nBundleMeta> collectionValues = this.metadataByKey.values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "metadataByKey.values");
                    String strM6348j = C5288p.m6348j(new PersistedBundleState(0, CollectionsKt.toList(collectionValues), 1, null));
                    Intrinsics.checkNotNullExpressionValue(strM6348j, "toJson(PersistedBundleSt…taByKey.values.toList()))");
                    m57599w(fileM57591o, strM6348j);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m57584h() {
        synchronized (this.lock) {
            try {
                this.active = false;
                this.metadataByKey.clear();
                this.validatorsByKey.clear();
                this.metadataLoaded = true;
                this.validatorsLoaded = true;
                if (this.rootDir.exists() && !FilesKt.deleteRecursively(this.rootDir)) {
                    C23985b.m57873d(C23985b.f47489a, f47334i, "清理 RN i18n 目录失败: " + this.rootDir.getAbsolutePath(), null, 4, null);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m57586j() {
        Object objM103844constructorimpl;
        if (this.metadataLoaded) {
            return;
        }
        this.metadataLoaded = true;
        String strM57593q = m57593q(m57591o());
        if (strM57593q == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            JsonObject asJsonObject = JsonParser.parseString(strM57593q).getAsJsonObject();
            if (asJsonObject.has("bundles")) {
                List<RnI18nBundleMeta> bundles = ((PersistedBundleState) C5288p.m6342d(asJsonObject.toString(), PersistedBundleState.class)).getBundles();
                ArrayList<RnI18nBundleMeta> arrayList = new ArrayList();
                for (Object obj : bundles) {
                    if (((RnI18nBundleMeta) obj).getI18n().isValid()) {
                        arrayList.add(obj);
                    }
                }
                for (RnI18nBundleMeta rnI18nBundleMeta : arrayList) {
                    this.metadataByKey.put(rnI18nBundleMeta.getKey(), rnI18nBundleMeta);
                }
            } else {
                Set<Map.Entry<String, JsonElement>> setEntrySet = asJsonObject.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "root.entrySet()");
                Iterator<T> it = setEntrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Intrinsics.checkNotNullExpressionValue(entry, "(key, value)");
                    String key = (String) entry.getKey();
                    RnI18nMeta meta = (RnI18nMeta) C5288p.m6342d(((JsonElement) entry.getValue()).toString(), RnI18nMeta.class);
                    if (meta.isValid()) {
                        LinkedHashMap<String, RnI18nBundleMeta> linkedHashMap = this.metadataByKey;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        String strSubstringBeforeLast = StringsKt.substringBeforeLast(key, '-', key);
                        String strSubstringAfterLast = StringsKt.substringAfterLast(key, '-', "main");
                        Intrinsics.checkNotNullExpressionValue(meta, "meta");
                        linkedHashMap.put(key, new RnI18nBundleMeta(strSubstringBeforeLast, strSubstringAfterLast, null, 0L, meta, 12, null));
                    }
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C23985b.m57873d(C23985b.f47489a, f47334i, "读取 i18n 元数据失败: " + thM103847exceptionOrNullimpl.getMessage(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m57587k() {
        Object objM103844constructorimpl;
        if (this.validatorsLoaded) {
            return;
        }
        this.validatorsLoaded = true;
        String strM57593q = m57593q(m57598v());
        if (strM57593q == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            this.validatorsByKey.putAll(((PersistedValidatorState) C5288p.m6342d(strM57593q, PersistedValidatorState.class)).getValidators());
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C23985b.m57873d(C23985b.f47489a, f47334i, "读取 i18n 条件请求缓存失败: " + thM103847exceptionOrNullimpl.getMessage(), null, 4, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<RnI18nBundleMeta> m57588l() {
        List<RnI18nBundleMeta> list;
        synchronized (this.lock) {
            try {
                if (this.active) {
                    m57586j();
                    Collection<RnI18nBundleMeta> collectionValues = this.metadataByKey.values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "metadataByKey.values");
                    list = CollectionsKt.toList(collectionValues);
                } else {
                    list = CollectionsKt.emptyList();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: n */
    public final String m57590n(String projectId, String siteType, String lang) {
        return projectId + '|' + siteType + '|' + lang;
    }

    /* JADX INFO: renamed from: o */
    public final File m57591o() {
        return new File(this.rootDir, f47336k);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final JsonObject m57594r(@NotNull String projectId, @NotNull String siteType, @NotNull String lang) {
        JsonObject jsonObjectM57592p;
        File fileM57589m;
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        synchronized (this.lock) {
            jsonObjectM57592p = null;
            if (this.active && (fileM57589m = m57589m(projectId, siteType, lang)) != null) {
                jsonObjectM57592p = m57592p(m57593q(fileM57589m));
            }
        }
        return jsonObjectM57592p;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final RnI18nHttpValidator m57595s(@NotNull String projectId, @NotNull String siteType, @NotNull String lang) {
        RnI18nHttpValidator rnI18nHttpValidator;
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        synchronized (this.lock) {
            try {
                if (this.active && m57585i(projectId, siteType, lang)) {
                    m57587k();
                    rnI18nHttpValidator = this.validatorsByKey.get(m57590n(projectId, siteType, lang));
                    if (rnI18nHttpValidator == null) {
                        rnI18nHttpValidator = new RnI18nHttpValidator(null, null, 3, null);
                    }
                    Intrinsics.checkNotNullExpressionValue(rnI18nHttpValidator, "validatorsByKey[localeKe… ?: RnI18nHttpValidator()");
                } else {
                    rnI18nHttpValidator = new RnI18nHttpValidator(null, null, 3, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rnI18nHttpValidator;
    }

    /* JADX INFO: renamed from: t */
    public final void m57596t(@NotNull Set<String> bundleKeys) {
        boolean z11;
        int i11;
        Intrinsics.checkNotNullParameter(bundleKeys, "bundleKeys");
        synchronized (this.lock) {
            try {
                if (this.active && !bundleKeys.isEmpty()) {
                    m57586j();
                    Iterator<T> it = bundleKeys.iterator();
                    int i12 = 0;
                    loop0: while (true) {
                        z11 = false;
                        while (true) {
                            i11 = 1;
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            if (this.metadataByKey.remove((String) it.next()) != null || z11) {
                                z11 = true;
                            }
                        }
                    }
                    if (z11) {
                        File fileM57591o = m57591o();
                        Collection<RnI18nBundleMeta> collectionValues = this.metadataByKey.values();
                        Intrinsics.checkNotNullExpressionValue(collectionValues, "metadataByKey.values");
                        String strM6348j = C5288p.m6348j(new PersistedBundleState(i12, CollectionsKt.toList(collectionValues), i11, null));
                        Intrinsics.checkNotNullExpressionValue(strM6348j, "toJson(PersistedBundleSt…taByKey.values.toList()))");
                        m57599w(fileM57591o, strM6348j);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m57597u(@NotNull String projectId, @NotNull String siteType, @NotNull String lang, @NotNull RnI18nHttpValidator validator) {
        boolean zM57599w;
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(validator, "validator");
        synchronized (this.lock) {
            zM57599w = false;
            zM57599w = false;
            if (this.active && m57594r(projectId, siteType, lang) != null) {
                m57587k();
                this.validatorsByKey.put(m57590n(projectId, siteType, lang), validator);
                File fileM57598v = m57598v();
                String strM6348j = C5288p.m6348j(new PersistedValidatorState(zM57599w ? 1 : 0, MapsKt.toMap(this.validatorsByKey), 1, null));
                Intrinsics.checkNotNullExpressionValue(strM6348j, "toJson(PersistedValidato…validatorsByKey.toMap()))");
                zM57599w = m57599w(fileM57598v, strM6348j);
            }
        }
        return zM57599w;
    }

    /* JADX INFO: renamed from: v */
    public final File m57598v() {
        return new File(this.rootDir, f47337l);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m57599w(File file, String content) {
        Exception exc;
        FileOutputStream fileOutputStreamStartWrite;
        if (!this.rootDir.exists() && !this.rootDir.mkdirs()) {
            return false;
        }
        AtomicFile atomicFile = new AtomicFile(file);
        Unit unit = null;
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                byte[] bytes = content.getBytes(UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStreamStartWrite.write(bytes);
                fileOutputStreamStartWrite.flush();
                atomicFile.finishWrite(fileOutputStreamStartWrite);
                return true;
            } catch (Exception e11) {
                exc = e11;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    if (fileOutputStreamStartWrite != null) {
                        atomicFile.failWrite(fileOutputStreamStartWrite);
                        unit = Unit.INSTANCE;
                    }
                    Result.m103844constructorimpl(unit);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                C23985b.m57873d(C23985b.f47489a, f47334i, "原子写入 i18n 文件失败: " + file.getName() + ", " + exc.getMessage(), null, 4, null);
                return false;
            }
        } catch (Exception e12) {
            exc = e12;
            fileOutputStreamStartWrite = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m57600x(@NotNull String projectId, @NotNull String siteType, @NotNull String lang, @NotNull String body, @NotNull RnI18nHttpValidator validator) {
        boolean z11;
        File fileM57589m;
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(validator, "validator");
        synchronized (this.lock) {
            z11 = false;
            z11 = false;
            z11 = false;
            z11 = false;
            if (this.active && (fileM57589m = m57589m(projectId, siteType, lang)) != null && m57592p(body) != null && m57599w(fileM57589m, body)) {
                m57587k();
                this.validatorsByKey.put(m57590n(projectId, siteType, lang), validator);
                File fileM57598v = m57598v();
                String strM6348j = C5288p.m6348j(new PersistedValidatorState(z11 ? 1 : 0, MapsKt.toMap(this.validatorsByKey), 1, null));
                Intrinsics.checkNotNullExpressionValue(strM6348j, "toJson(PersistedValidato…validatorsByKey.toMap()))");
                m57599w(fileM57598v, strM6348j);
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: m */
    public final File m57589m(String projectId, String siteType, String lang) {
        if (!m57585i(projectId, siteType, lang)) {
            return null;
        }
        return new File(this.rootDir, projectId + '_' + siteType + '_' + lang + ".json");
    }
}
