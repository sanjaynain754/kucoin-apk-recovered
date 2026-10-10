package com.facebook.appevents.p060ml;

import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p391k3.C40877f;
import p391k3.C40878g;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u000fR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u000fR \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m90084d2 = {"Lcom/facebook/appevents/ml/Model;", "", "", "", "Lcom/facebook/appevents/ml/MTensor;", "weights", "<init>", "(Ljava/util/Map;)V", "dense", "", "texts", "task", "b", "(Lcom/facebook/appevents/ml/MTensor;[Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/appevents/ml/MTensor;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/appevents/ml/MTensor;", "embedding", "convs0Weight", "c", "convs1Weight", "d", "convs2Weight", "e", "convs0Bias", "f", "convs1Bias", "g", "convs2Bias", CmcdData.Factory.STREAMING_FORMAT_HLS, "fc1Weight", "i", "fc2Weight", "j", "fc1Bias", "k", "fc2Bias", "", CmcdData.Factory.STREAM_TYPE_LIVE, "Ljava/util/Map;", "finalWeights", "m", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Model {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Map<String, String> f7987n = MapsKt.hashMapOf(TuplesKt.m90091to("embedding.weight", "embed.weight"), TuplesKt.m90091to("dense1.weight", "fc1.weight"), TuplesKt.m90091to("dense2.weight", "fc2.weight"), TuplesKt.m90091to("dense3.weight", "fc3.weight"), TuplesKt.m90091to("dense1.bias", "fc1.bias"), TuplesKt.m90091to("dense2.bias", "fc2.bias"), TuplesKt.m90091to("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MTensor embedding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MTensor convs0Weight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final MTensor convs1Weight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final MTensor convs2Weight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final MTensor convs0Bias;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final MTensor convs1Bias;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final MTensor convs2Bias;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final MTensor fc1Weight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final MTensor fc2Weight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final MTensor fc1Bias;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final MTensor fc2Bias;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Map<String, MTensor> finalWeights;

    /* JADX INFO: compiled from: Model.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/appevents/ml/Model$Companion;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lcom/facebook/appevents/ml/Model;", "build", "(Ljava/io/File;)Lcom/facebook/appevents/ml/Model;", "", "", "Lcom/facebook/appevents/ml/MTensor;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/io/File;)Ljava/util/Map;", "", "SEQ_LEN", "I", "mapping", "Ljava/util/Map;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final Model build(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            Map<String, MTensor> mapM8290a = m8290a(file);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (mapM8290a == null) {
                return null;
            }
            try {
                return new Model(mapM8290a, defaultConstructorMarker);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, MTensor> m8290a(File file) {
            Map<String, MTensor> mapM89474c = C40878g.m89474c(file);
            if (mapM89474c == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapM8288a = Model.m8288a();
            for (Map.Entry<String, MTensor> entry : mapM89474c.entrySet()) {
                String key = entry.getKey();
                if (mapM8288a.containsKey(entry.getKey()) && (key = (String) mapM8288a.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(key, entry.getValue());
            }
            return map;
        }
    }

    public /* synthetic */ Model(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public Model(Map<String, MTensor> map) {
        MTensor mTensor = map.get("embed.weight");
        if (mTensor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.embedding = mTensor;
        MTensor mTensor2 = map.get("convs.0.weight");
        if (mTensor2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.convs0Weight = C40877f.m89472l(mTensor2);
        MTensor mTensor3 = map.get("convs.1.weight");
        if (mTensor3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.convs1Weight = C40877f.m89472l(mTensor3);
        MTensor mTensor4 = map.get("convs.2.weight");
        if (mTensor4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.convs2Weight = C40877f.m89472l(mTensor4);
        MTensor mTensor5 = map.get("convs.0.bias");
        if (mTensor5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.convs0Bias = mTensor5;
        MTensor mTensor6 = map.get("convs.1.bias");
        if (mTensor6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.convs1Bias = mTensor6;
        MTensor mTensor7 = map.get("convs.2.bias");
        if (mTensor7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.convs2Bias = mTensor7;
        MTensor mTensor8 = map.get("fc1.weight");
        if (mTensor8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.fc1Weight = C40877f.m89471k(mTensor8);
        MTensor mTensor9 = map.get("fc2.weight");
        if (mTensor9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.fc2Weight = C40877f.m89471k(mTensor9);
        MTensor mTensor10 = map.get("fc1.bias");
        if (mTensor10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.fc1Bias = mTensor10;
        MTensor mTensor11 = map.get("fc2.bias");
        if (mTensor11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.fc2Bias = mTensor11;
        this.finalWeights = new HashMap();
        for (String str : SetsKt.setOf((Object[]) new String[]{ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey()})) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            MTensor mTensor12 = map.get(str2);
            MTensor mTensor13 = map.get(str3);
            if (mTensor12 != null) {
                this.finalWeights.put(str2, C40877f.m89471k(mTensor12));
            }
            if (mTensor13 != null) {
                this.finalWeights.put(str3, mTensor13);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Map m8288a() {
        if (C42757a.m93689d(Model.class)) {
            return null;
        }
        try {
            return f7987n;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, Model.class);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final MTensor m8289b(@NotNull MTensor dense, @NotNull String[] texts, @NotNull String task) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(dense, "dense");
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(task, "task");
            MTensor mTensorM89463c = C40877f.m89463c(C40877f.m89465e(texts, 128, this.embedding), this.convs0Weight);
            C40877f.m89461a(mTensorM89463c, this.convs0Bias);
            C40877f.m89469i(mTensorM89463c);
            MTensor mTensorM89463c2 = C40877f.m89463c(mTensorM89463c, this.convs1Weight);
            C40877f.m89461a(mTensorM89463c2, this.convs1Bias);
            C40877f.m89469i(mTensorM89463c2);
            MTensor mTensorM89467g = C40877f.m89467g(mTensorM89463c2, 2);
            MTensor mTensorM89463c3 = C40877f.m89463c(mTensorM89467g, this.convs2Weight);
            C40877f.m89461a(mTensorM89463c3, this.convs2Bias);
            C40877f.m89469i(mTensorM89463c3);
            MTensor mTensorM89467g2 = C40877f.m89467g(mTensorM89463c, mTensorM89463c.m8284b(1));
            MTensor mTensorM89467g3 = C40877f.m89467g(mTensorM89467g, mTensorM89467g.m8284b(1));
            MTensor mTensorM89467g4 = C40877f.m89467g(mTensorM89463c3, mTensorM89463c3.m8284b(1));
            C40877f.m89466f(mTensorM89467g2, 1);
            C40877f.m89466f(mTensorM89467g3, 1);
            C40877f.m89466f(mTensorM89467g4, 1);
            MTensor mTensorM89464d = C40877f.m89464d(C40877f.m89462b(new MTensor[]{mTensorM89467g2, mTensorM89467g3, mTensorM89467g4, dense}), this.fc1Weight, this.fc1Bias);
            C40877f.m89469i(mTensorM89464d);
            MTensor mTensorM89464d2 = C40877f.m89464d(mTensorM89464d, this.fc2Weight, this.fc2Bias);
            C40877f.m89469i(mTensorM89464d2);
            MTensor mTensor = this.finalWeights.get(task + ".weight");
            MTensor mTensor2 = this.finalWeights.get(task + ".bias");
            if (mTensor != null && mTensor2 != null) {
                MTensor mTensorM89464d3 = C40877f.m89464d(mTensorM89464d2, mTensor, mTensor2);
                C40877f.m89470j(mTensorM89464d3);
                return mTensorM89464d3;
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }
}
