package com.facebook.appevents.p060ml;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.appevents.p060ml.ModelManager;
import com.facebook.appevents.suggestedevents.C5545a;
import com.facebook.internal.C5760c;
import com.facebook.internal.FeatureManager;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p330i3.C38431c;
import p357j3.AsyncTaskC40261j;
import p391k3.C40878g;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ModelManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001:\u00029:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u001b\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J'\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010)R\"\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00108\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, m90084d2 = {"Lcom/facebook/appevents/ml/ModelManager;", "", "<init>", "()V", "", "f", "Lcom/facebook/appevents/ml/ModelManager$Task;", "task", "Ljava/io/File;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/facebook/appevents/ml/ModelManager$Task;)Ljava/io/File;", "", "", "denses", "", "texts", "q", "(Lcom/facebook/appevents/ml/ModelManager$Task;[[F[Ljava/lang/String;)[Ljava/lang/String;", "", "timestamp", "", "n", "(J)Z", "Lorg/json/JSONObject;", "models", "e", "(Lorg/json/JSONObject;)V", "jsonObject", "p", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "k", "()Lorg/json/JSONObject;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lorg/json/JSONArray;", "jsonArray", "o", "(Lorg/json/JSONArray;)[F", "Lcom/facebook/appevents/ml/MTensor;", "res", "thresholds", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/facebook/appevents/ml/MTensor;[F)[Ljava/lang/String;", "r", "", "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "b", "Ljava/util/Map;", "taskHandlers", "", "c", "Ljava/util/List;", "MTML_SUGGESTED_EVENTS_PREDICTION", "d", "MTML_INTEGRITY_DETECT_PREDICTION", "m", "()Z", "isLocaleEnglish", "Task", "TaskHandler", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelManager.kt\ncom/facebook/appevents/ml/ModelManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,369:1\n1549#2:370\n1620#2,2:371\n1622#2:376\n1549#2:379\n1620#2,2:380\n1622#2:385\n13694#3,3:373\n13694#3,3:382\n37#4,2:377\n37#4,2:386\n*S KotlinDebug\n*F\n+ 1 ModelManager.kt\ncom/facebook/appevents/ml/ModelManager\n*L\n252#1:370\n252#1:371,2\n252#1:376\n275#1:379\n275#1:380,2\n275#1:385\n254#1:373,3\n277#1:382,3\n261#1:377,2\n284#1:386,2\n*E\n"})
public final class ModelManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ModelManager f8000a = new ModelManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, TaskHandler> taskHandlers = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION = CollectionsKt.listOf((Object[]) new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = CollectionsKt.listOf((Object[]) new String[]{"none", "address", "health"});

    /* JADX INFO: compiled from: ModelManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/appevents/ml/ModelManager$Task;", "", "(Ljava/lang/String;I)V", "toKey", "", "toUseCase", "MTML_INTEGRITY_DETECT", "MTML_APP_EVENT_PREDICTION", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$Task$a */
        /* JADX INFO: compiled from: ModelManager.kt */
        @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
        public /* synthetic */ class C5540a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Task.values().length];
                try {
                    iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @NotNull
        public final String toKey() {
            int i11 = C5540a.$EnumSwitchMapping$0[ordinal()];
            if (i11 == 1) {
                return "integrity_detect";
            }
            if (i11 == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        public final String toUseCase() {
            int i11 = C5540a.$EnumSwitchMapping$0[ordinal()];
            if (i11 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i11 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: ModelManager.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u00013B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010+\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010'\u001a\u0004\b\u001b\u0010(\"\u0004\b)\u0010*R$\u00101\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010-\u001a\u0004\b\u0018\u0010.\"\u0004\b/\u00100R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102¨\u00064"}, m90084d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "", "", "useCase", "assetUri", "ruleUri", "", "versionId", "", "thresholds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[F)V", "Ljava/lang/Runnable;", "onPostExecute", "j", "(Ljava/lang/Runnable;)Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setUseCase", "(Ljava/lang/String;)V", "b", "setAssetUri", "c", "e", "setRuleUri", "d", "I", CmcdData.Factory.STREAMING_FORMAT_HLS, "()I", "setVersionId", "(I)V", "[F", "f", "()[F", "setThresholds", "([F)V", "Ljava/io/File;", "Ljava/io/File;", "()Ljava/io/File;", "k", "(Ljava/io/File;)V", "ruleFile", "Lcom/facebook/appevents/ml/Model;", "Lcom/facebook/appevents/ml/Model;", "()Lcom/facebook/appevents/ml/Model;", "i", "(Lcom/facebook/appevents/ml/Model;)V", "model", "Ljava/lang/Runnable;", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class TaskHandler {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public String useCase;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public String assetUri;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public String ruleUri;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int versionId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public float[] thresholds;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public File ruleFile;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public Model model;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public Runnable onPostExecute;

        /* JADX INFO: compiled from: ModelManager.kt */
        @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u000b\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", JPushConstants.Analysis.KEY_JSON, "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "build", "(Lorg/json/JSONObject;)Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "handler", "", "execute", "(Lcom/facebook/appevents/ml/ModelManager$TaskHandler;)V", "master", "", "slaves", "(Lcom/facebook/appevents/ml/ModelManager$TaskHandler;Ljava/util/List;)V", "", "useCase", "", "versionId", "c", "(Ljava/lang/String;I)V", "uri", "name", "Lj3/j$a;", "onComplete", "d", "(Ljava/lang/String;Ljava/lang/String;Lj3/j$a;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final TaskHandler build(@Nullable JSONObject json) {
                if (json == null) {
                    return null;
                }
                try {
                    String useCase = json.getString("use_case");
                    String assetUri = json.getString("asset_uri");
                    String strOptString = json.optString("rules_uri", null);
                    int i11 = json.getInt("version_id");
                    float[] fArrM8294d = ModelManager.m8294d(ModelManager.f8000a, json.getJSONArray("thresholds"));
                    Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                    Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    return new TaskHandler(useCase, assetUri, strOptString, i11, fArrM8294d);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void execute(@NotNull TaskHandler handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                execute(handler, CollectionsKt.listOf(handler));
            }

            public Companion() {
            }

            /* JADX INFO: renamed from: e */
            public static final void m8324e(List slaves, File file) {
                Intrinsics.checkNotNullParameter(slaves, "$slaves");
                Intrinsics.checkNotNullParameter(file, "file");
                final Model modelBuild = Model.INSTANCE.build(file);
                if (modelBuild != null) {
                    Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        final TaskHandler taskHandler = (TaskHandler) it.next();
                        TaskHandler.INSTANCE.m8327d(taskHandler.getRuleUri(), taskHandler.getUseCase() + '_' + taskHandler.getVersionId() + "_rule", new AsyncTaskC40261j.a() { // from class: k3.e
                            @Override // p357j3.AsyncTaskC40261j.a
                            /* JADX INFO: renamed from: a */
                            public final void mo88631a(File file2) {
                                ModelManager.TaskHandler.Companion.m8325f(taskHandler, modelBuild, file2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: renamed from: f */
            public static final void m8325f(TaskHandler slave, Model model, File file) {
                Intrinsics.checkNotNullParameter(slave, "$slave");
                Intrinsics.checkNotNullParameter(file, "file");
                slave.m8319i(model);
                slave.m8321k(file);
                Runnable runnable = slave.onPostExecute;
                if (runnable != null) {
                    runnable.run();
                }
            }

            /* JADX INFO: renamed from: d */
            public final void m8327d(String uri, String name, AsyncTaskC40261j.a onComplete) {
                File file = new File(C40878g.m89473a(), name);
                if (uri == null || file.exists()) {
                    onComplete.mo88631a(file);
                } else {
                    new AsyncTaskC40261j(uri, file, onComplete).execute(new String[0]);
                }
            }

            public final void execute(@NotNull TaskHandler master, @NotNull final List<TaskHandler> slaves) {
                Intrinsics.checkNotNullParameter(master, "master");
                Intrinsics.checkNotNullParameter(slaves, "slaves");
                m8326c(master.getUseCase(), master.getVersionId());
                m8327d(master.getAssetUri(), master.getUseCase() + '_' + master.getVersionId(), new AsyncTaskC40261j.a() { // from class: k3.d
                    @Override // p357j3.AsyncTaskC40261j.a
                    /* JADX INFO: renamed from: a */
                    public final void mo88631a(File file) {
                        ModelManager.TaskHandler.Companion.m8324e(slaves, file);
                    }
                });
            }

            /* JADX INFO: renamed from: c */
            public final void m8326c(String useCase, int versionId) {
                File[] fileArrListFiles;
                File fileM89473a = C40878g.m89473a();
                if (fileM89473a == null || (fileArrListFiles = fileM89473a.listFiles()) == null || fileArrListFiles.length == 0) {
                    return;
                }
                String str = useCase + '_' + versionId;
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    if (StringsKt.startsWith$default(name, useCase, false, 2, (Object) null) && !StringsKt.startsWith$default(name, str, false, 2, (Object) null)) {
                        file.delete();
                    }
                }
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAssetUri() {
            return this.assetUri;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Model getModel() {
            return this.model;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final File getRuleFile() {
            return this.ruleFile;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRuleUri() {
            return this.ruleUri;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final float[] getThresholds() {
            return this.thresholds;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getUseCase() {
            return this.useCase;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getVersionId() {
            return this.versionId;
        }

        /* JADX INFO: renamed from: i */
        public final void m8319i(@Nullable Model model) {
            this.model = model;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final TaskHandler m8320j(@Nullable Runnable onPostExecute) {
            this.onPostExecute = onPostExecute;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final void m8321k(@Nullable File file) {
            this.ruleFile = file;
        }

        public TaskHandler(@NotNull String useCase, @NotNull String assetUri, @Nullable String str, int i11, @Nullable float[] fArr) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(assetUri, "assetUri");
            this.useCase = useCase;
            this.assetUri = assetUri;
            this.ruleUri = str;
            this.versionId = i11;
            this.thresholds = fArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$a */
    /* JADX INFO: compiled from: ModelManager.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class C5541a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Task.values().length];
            try {
                iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ float[] m8294d(ModelManager modelManager, JSONArray jSONArray) {
        if (C42757a.m93689d(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.m8306o(jSONArray);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ModelManager.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m8295f() {
        if (C42757a.m93689d(ModelManager.class)) {
            return;
        }
        try {
            C5760c.m10079p0(new Runnable() { // from class: k3.a
                @Override // java.lang.Runnable
                public final void run() {
                    ModelManager.m8296g();
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ModelManager.class);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8296g() {
        if (C42757a.m93689d(ModelManager.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            String string = sharedPreferences.getString("models", null);
            JSONObject jSONObject = (string == null || string.length() == 0) ? new JSONObject() : new JSONObject(string);
            long j11 = sharedPreferences.getLong("model_request_timestamp", 0L);
            if (!FeatureManager.m9939g(FeatureManager.Feature.ModelRequest) || jSONObject.length() == 0 || !f8000a.m8305n(j11)) {
                jSONObject = f8000a.m8303k();
                if (jSONObject == null) {
                    return;
                } else {
                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                }
            }
            ModelManager modelManager = f8000a;
            modelManager.m8301e(jSONObject);
            modelManager.m8302h();
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ModelManager.class);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8297i() {
        if (C42757a.m93689d(ModelManager.class)) {
            return;
        }
        try {
            C5545a.m8366b();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ModelManager.class);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8298j() {
        if (C42757a.m93689d(ModelManager.class)) {
            return;
        }
        try {
            C38431c.m86666a();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ModelManager.class);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: l */
    public static final File m8299l(@NotNull Task task) {
        if (C42757a.m93689d(ModelManager.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler == null) {
                return null;
            }
            return taskHandler.getRuleFile();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ModelManager.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: q */
    public static final String[] m8300q(@NotNull Task task, @NotNull float[][] denses, @NotNull String[] texts) {
        Model model;
        if (C42757a.m93689d(ModelManager.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(denses, "denses");
            Intrinsics.checkNotNullParameter(texts, "texts");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler != null && (model = taskHandler.getModel()) != null) {
                float[] thresholds = taskHandler.getThresholds();
                int length = texts.length;
                int length2 = denses[0].length;
                MTensor mTensor = new MTensor(new int[]{length, length2});
                for (int i11 = 0; i11 < length; i11++) {
                    System.arraycopy(denses[i11], 0, mTensor.getData(), i11 * length2, length2);
                }
                MTensor mTensorM8289b = model.m8289b(mTensor, texts, task.toKey());
                if (mTensorM8289b != null && thresholds != null && mTensorM8289b.getData().length != 0 && thresholds.length != 0) {
                    int i12 = C5541a.$EnumSwitchMapping$0[task.ordinal()];
                    if (i12 == 1) {
                        return f8000a.m8309s(mTensorM8289b, thresholds);
                    }
                    if (i12 == 2) {
                        return f8000a.m8308r(mTensorM8289b, thresholds);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ModelManager.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final JSONObject m8307p(JSONObject jsonObject) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = jsonObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version_id", jSONObject2.getString("version_id"));
                    jSONObject3.put("use_case", jSONObject2.getString("use_case"));
                    jSONObject3.put("thresholds", jSONObject2.getJSONArray("thresholds"));
                    jSONObject3.put("asset_uri", jSONObject2.getString("asset_uri"));
                    if (jSONObject2.has("rules_uri")) {
                        jSONObject3.put("rules_uri", jSONObject2.getString("rules_uri"));
                    }
                    jSONObject.put(jSONObject2.getString("use_case"), jSONObject3);
                }
                return jSONObject;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8301e(JSONObject models) {
        if (!C42757a.m93689d(this)) {
            try {
                Iterator<String> itKeys = models.keys();
                while (itKeys.hasNext()) {
                    try {
                        TaskHandler taskHandlerBuild = TaskHandler.INSTANCE.build(models.getJSONObject(itKeys.next()));
                        if (taskHandlerBuild != null) {
                            taskHandlers.put(taskHandlerBuild.getUseCase(), taskHandlerBuild);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8302h() {
        if (!C42757a.m93689d(this)) {
            try {
                ArrayList arrayList = new ArrayList();
                String assetUri = null;
                int iMax = 0;
                for (Map.Entry<String, TaskHandler> entry : taskHandlers.entrySet()) {
                    String key = entry.getKey();
                    TaskHandler value = entry.getValue();
                    if (Intrinsics.areEqual(key, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                        String assetUri2 = value.getAssetUri();
                        int iMax2 = Math.max(iMax, value.getVersionId());
                        if (FeatureManager.m9939g(FeatureManager.Feature.SuggestedEvents) && m8304m()) {
                            arrayList.add(value.m8320j(new Runnable() { // from class: k3.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ModelManager.m8297i();
                                }
                            }));
                        }
                        assetUri = assetUri2;
                        iMax = iMax2;
                    }
                    if (Intrinsics.areEqual(key, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                        assetUri = value.getAssetUri();
                        iMax = Math.max(iMax, value.getVersionId());
                        if (FeatureManager.m9939g(FeatureManager.Feature.IntelligentIntegrity)) {
                            arrayList.add(value.m8320j(new Runnable() { // from class: k3.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ModelManager.m8298j();
                                }
                            }));
                        }
                    }
                }
                if (assetUri != null && iMax > 0 && !arrayList.isEmpty()) {
                    TaskHandler.INSTANCE.execute(new TaskHandler("MTML", assetUri, null, iMax, null), arrayList);
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final JSONObject m8303k() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest graphRequestNewGraphPathRequest = GraphRequest.INSTANCE.newGraphPathRequest(null, "app/model_asset", null);
            graphRequestNewGraphPathRequest.m7651H(bundle);
            JSONObject graphObject = graphRequestNewGraphPathRequest.m7656l().getGraphObject();
            if (graphObject == null) {
                return null;
            }
            return m8307p(graphObject);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m8304m() {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            Locale localeM10049M = C5760c.m10049M();
            if (localeM10049M != null) {
                String language = localeM10049M.getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "locale.language");
                if (!StringsKt.contains$default((CharSequence) language, (CharSequence) TUIThemeManager.LANGUAGE_EN, false, 2, (Object) null)) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m8305n(long timestamp) {
        if (C42757a.m93689d(this) || timestamp == 0) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - timestamp >= 259200000) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final float[] m8306o(JSONArray jsonArray) {
        if (C42757a.m93689d(this) || jsonArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jsonArray.length()];
            int length = jsonArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    String string = jsonArray.getString(i11);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    fArr[i11] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final String[] m8308r(MTensor res, float[] thresholds) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            int iM8284b = res.m8284b(0);
            int iM8284b2 = res.m8284b(1);
            float[] data = res.getData();
            if (iM8284b2 != thresholds.length) {
                return null;
            }
            IntRange intRangeUntil = RangesKt.until(0, iM8284b);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                String str = "none";
                int length = thresholds.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = i12 + 1;
                    if (data[(iNextInt * iM8284b2) + i12] >= thresholds[i11]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i12);
                    }
                    i11++;
                    i12 = i13;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final String[] m8309s(MTensor res, float[] thresholds) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            int iM8284b = res.m8284b(0);
            int iM8284b2 = res.m8284b(1);
            float[] data = res.getData();
            if (iM8284b2 != thresholds.length) {
                return null;
            }
            IntRange intRangeUntil = RangesKt.until(0, iM8284b);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                String str = "other";
                int length = thresholds.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = i12 + 1;
                    if (data[(iNextInt * iM8284b2) + i12] >= thresholds[i11]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i12);
                    }
                    i11++;
                    i12 = i13;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }
}
