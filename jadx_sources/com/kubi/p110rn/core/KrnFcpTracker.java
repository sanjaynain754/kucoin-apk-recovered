package com.kubi.p110rn.core;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.RNConstantKt;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KrnFcpTracker.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0082\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010#\u001a\u00020$2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0005J\u001e\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005J\u0006\u0010q\u001a\u00020$J\u0018\u0010r\u001a\u0002022\u0006\u0010s\u001a\u0002022\u0006\u0010t\u001a\u000202H\u0002J+\u0010u\u001a\u00020$2\u0006\u0010v\u001a\u00020\u00172\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010x\u001a\u0004\u0018\u00010,¢\u0006\u0002\u0010yJ,\u0010z\u001a\u00020$2\u0006\u0010{\u001a\u00020\u00052\u0006\u0010|\u001a\u00020\u00172\b\u0010w\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\u0005J\u0012\u0010~\u001a\u00020\u00052\b\u0010}\u001a\u0004\u0018\u00010\u0005H\u0002JK\u0010\u007f\u001a\u00020$2\u0006\u0010v\u001a\u00020\u00172\u0006\u0010r\u001a\u0002022\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0007\u0010\u0080\u0001\u001a\u00020,2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\u0005J\u0007\u0010\u0081\u0001\u001a\u00020$R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\fR\u001e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010 R\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001a\u0010:\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001a\u0010=\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\u001a\u0010@\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\u001a\u0010C\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00104\"\u0004\bE\u00106R\u001a\u0010F\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00104\"\u0004\bH\u00106R\u001a\u0010I\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R\u001a\u0010L\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00104\"\u0004\bN\u00106R\u001a\u0010O\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00104\"\u0004\bQ\u00106R\u001a\u0010R\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u00104\"\u0004\bT\u00106R\u001a\u0010U\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u00104\"\u0004\bW\u00106R\u001a\u0010X\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R\u001a\u0010[\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00104\"\u0004\b]\u00106R\u001a\u0010^\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u00104\"\u0004\b`\u00106R\u001c\u0010a\u001a\u0004\u0018\u00010bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u000e\u0010g\u001a\u00020hX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020hX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010j\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010kX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u000e\u0010p\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0083\u0001"}, m90084d2 = {"Lcom/kubi/rn/core/KrnFcpTracker;", "", "<init>", "()V", "value", "", "pageTraceId", "getPageTraceId", "()Ljava/lang/String;", "bundleName", "getBundleName", "setBundleName", "(Ljava/lang/String;)V", "bundleVersion", "getBundleVersion", "setBundleVersion", "baseBundleVersion", "getBaseBundleVersion", "setBaseBundleVersion", "baseBundlePath", "getBaseBundlePath", "bizBundlePath", "getBizBundlePath", "", "hasSplitBundle", "getHasSplitBundle", "()Z", RNConstantKt.PARAM_MODULE_NAME, "getModuleName", "setModuleName", "isLocalBundle", "setLocalBundle", "(Z)V", "isReloaded", "setReloaded", "recordBundleConfig", "", "engineMainBundlePath", "splitBundlePath", "initPageTraceId", Constants.BIZ, "entry", Constants.COMPONENT, "reuseType", "", "getReuseType", "()I", "setReuseType", "(I)V", "pageEnterStart", "", "getPageEnterStart", "()J", "setPageEnterStart", "(J)V", "pageEnterEnd", "getPageEnterEnd", "setPageEnterEnd", "fetchBundleStart", "getFetchBundleStart", "setFetchBundleStart", "fetchBundleEnd", "getFetchBundleEnd", "setFetchBundleEnd", "fetchEngineStart", "getFetchEngineStart", "setFetchEngineStart", "fetchEngineEnd", "getFetchEngineEnd", "setFetchEngineEnd", "loadBaseBundleStart", "getLoadBaseBundleStart", "setLoadBaseBundleStart", "loadBaseBundleEnd", "getLoadBaseBundleEnd", "setLoadBaseBundleEnd", "loadBizBundleStart", "getLoadBizBundleStart", "setLoadBizBundleStart", "loadBizBundleEnd", "getLoadBizBundleEnd", "setLoadBizBundleEnd", "createViewStart", "getCreateViewStart", "setCreateViewStart", "createViewEnd", "getCreateViewEnd", "setCreateViewEnd", "pageFirstRenderStart", "getPageFirstRenderStart", "setPageFirstRenderStart", "pageRenderStart", "getPageRenderStart", "setPageRenderStart", "pageRenderEnd", "getPageRenderEnd", "setPageRenderEnd", "engineInitTimings", "Lcom/kubi/rn/core/ReactNativeEngine$EngineInitTimings;", "getEngineInitTimings", "()Lcom/kubi/rn/core/ReactNativeEngine$EngineInitTimings;", "setEngineInitTimings", "(Lcom/kubi/rn/core/ReactNativeEngine$EngineInitTimings;)V", "reported", "Ljava/util/concurrent/atomic/AtomicBoolean;", "loadResultReported", "onFcpReported", "Lkotlin/Function0;", "getOnFcpReported", "()Lkotlin/jvm/functions/Function0;", "setOnFcpReported", "(Lkotlin/jvm/functions/Function0;)V", "firstLoadAttempted", "resetForRetry", "dur", "start", "end", "reportLoadResult", "isSuccess", com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, "code", "(ZLjava/lang/String;Ljava/lang/Integer;)V", "reportPageError", "errorType", "isJsFatal", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "buildFatalErrorExtra", "reportFetchBundle", "bundleOrigin", "reportFcp", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KrnFcpTracker {

    @NotNull
    private static final String EVENT_NAME = "krn_page_fcp";

    @NotNull
    private static final String FETCH_BUNDLE_EVENT_NAME = "krn_fetch_bundle";

    @NotNull
    private static final String FETCH_BUNDLE_NAME = "FetchBundle";

    @NotNull
    private static final String LOAD_RESULT_EVENT_NAME = "krn_page_load_result";

    @NotNull
    private static final String PAGE_ERROR_EVENT_NAME = "krn_page_error";

    @NotNull
    private static final String TAG = "KrnFcpTracker";
    private long createViewEnd;
    private long createViewStart;

    @Nullable
    private ReactNativeEngine.EngineInitTimings engineInitTimings;
    private long fetchBundleEnd;
    private long fetchBundleStart;
    private long fetchEngineEnd;
    private long fetchEngineStart;
    private boolean firstLoadAttempted;
    private boolean hasSplitBundle;
    private boolean isReloaded;
    private long loadBaseBundleEnd;
    private long loadBaseBundleStart;
    private long loadBizBundleEnd;
    private long loadBizBundleStart;

    @Nullable
    private Function0<Unit> onFcpReported;
    private long pageEnterEnd;
    private long pageEnterStart;
    private long pageFirstRenderStart;
    private long pageRenderEnd;
    private long pageRenderStart;
    private int reuseType;

    @NotNull
    private String pageTraceId = "";

    @NotNull
    private String bundleName = "";

    @NotNull
    private String bundleVersion = "";

    @NotNull
    private String baseBundleVersion = "";

    @NotNull
    private String baseBundlePath = "";

    @NotNull
    private String bizBundlePath = "";

    @NotNull
    private String moduleName = "";
    private boolean isLocalBundle = true;

    @NotNull
    private final AtomicBoolean reported = new AtomicBoolean(false);

    @NotNull
    private final AtomicBoolean loadResultReported = new AtomicBoolean(false);

    private final String buildFatalErrorExtra(String extra) {
        Object objM103844constructorimpl;
        String str = "base_bundle_path=" + this.baseBundlePath + "\nbiz_bundle_path=" + this.bizBundlePath + "\nhas_split_bundle=" + this.hasSplitBundle;
        if (extra == null || StringsKt.isBlank(extra)) {
            return str;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(extra);
            jSONObject.put("base_bundle_path", this.baseBundlePath);
            jSONObject.put("biz_bundle_path", this.bizBundlePath);
            jSONObject.put("has_split_bundle", this.hasSplitBundle);
            objM103844constructorimpl = Result.m103844constructorimpl(jSONObject.toString());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(extra);
            if (!StringsKt.endsWith$default((CharSequence) extra, '\n', false, 2, (Object) null)) {
                sb2.append('\n');
            }
            sb2.append(str);
            objM103844constructorimpl = sb2.toString();
        }
        return (String) objM103844constructorimpl;
    }

    private final long dur(long start, long end) {
        if (start <= 0 || end <= 0) {
            return 0L;
        }
        return end - start;
    }

    public static /* synthetic */ void reportFetchBundle$default(KrnFcpTracker krnFcpTracker, boolean z11, long j11, String str, String str2, int i11, String str3, String str4, int i12, Object obj) throws JSONException {
        if ((i12 & 8) != 0) {
            str2 = null;
        }
        if ((i12 & 32) != 0) {
            str3 = null;
        }
        if ((i12 & 64) != 0) {
            str4 = null;
        }
        krnFcpTracker.reportFetchBundle(z11, j11, str, str2, i11, str3, str4);
    }

    public static /* synthetic */ void reportLoadResult$default(KrnFcpTracker krnFcpTracker, boolean z11, String str, Integer num, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        krnFcpTracker.reportLoadResult(z11, str, num);
    }

    public static /* synthetic */ void reportPageError$default(KrnFcpTracker krnFcpTracker, String str, boolean z11, String str2, String str3, int i11, Object obj) throws JSONException {
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        krnFcpTracker.reportPageError(str, z11, str2, str3);
    }

    @NotNull
    public final String getBaseBundlePath() {
        return this.baseBundlePath;
    }

    @NotNull
    public final String getBaseBundleVersion() {
        return this.baseBundleVersion;
    }

    @NotNull
    public final String getBizBundlePath() {
        return this.bizBundlePath;
    }

    @NotNull
    public final String getBundleName() {
        return this.bundleName;
    }

    @NotNull
    public final String getBundleVersion() {
        return this.bundleVersion;
    }

    public final long getCreateViewEnd() {
        return this.createViewEnd;
    }

    public final long getCreateViewStart() {
        return this.createViewStart;
    }

    @Nullable
    public final ReactNativeEngine.EngineInitTimings getEngineInitTimings() {
        return this.engineInitTimings;
    }

    public final long getFetchBundleEnd() {
        return this.fetchBundleEnd;
    }

    public final long getFetchBundleStart() {
        return this.fetchBundleStart;
    }

    public final long getFetchEngineEnd() {
        return this.fetchEngineEnd;
    }

    public final long getFetchEngineStart() {
        return this.fetchEngineStart;
    }

    public final boolean getHasSplitBundle() {
        return this.hasSplitBundle;
    }

    public final long getLoadBaseBundleEnd() {
        return this.loadBaseBundleEnd;
    }

    public final long getLoadBaseBundleStart() {
        return this.loadBaseBundleStart;
    }

    public final long getLoadBizBundleEnd() {
        return this.loadBizBundleEnd;
    }

    public final long getLoadBizBundleStart() {
        return this.loadBizBundleStart;
    }

    @NotNull
    public final String getModuleName() {
        return this.moduleName;
    }

    @Nullable
    public final Function0<Unit> getOnFcpReported() {
        return this.onFcpReported;
    }

    public final long getPageEnterEnd() {
        return this.pageEnterEnd;
    }

    public final long getPageEnterStart() {
        return this.pageEnterStart;
    }

    public final long getPageFirstRenderStart() {
        return this.pageFirstRenderStart;
    }

    public final long getPageRenderEnd() {
        return this.pageRenderEnd;
    }

    public final long getPageRenderStart() {
        return this.pageRenderStart;
    }

    @NotNull
    public final String getPageTraceId() {
        return this.pageTraceId;
    }

    public final int getReuseType() {
        return this.reuseType;
    }

    public final void initPageTraceId(@NotNull String biz, @NotNull String entry, @NotNull String component) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(component, "component");
        this.pageTraceId = biz + '-' + entry + '-' + component + '-' + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: isLocalBundle, reason: from getter */
    public final boolean getIsLocalBundle() {
        return this.isLocalBundle;
    }

    /* JADX INFO: renamed from: isReloaded, reason: from getter */
    public final boolean getIsReloaded() {
        return this.isReloaded;
    }

    public final void recordBundleConfig(@Nullable String bundleVersion, @Nullable String baseBundleVersion, @NotNull String engineMainBundlePath, @Nullable String splitBundlePath) {
        Intrinsics.checkNotNullParameter(engineMainBundlePath, "engineMainBundlePath");
        if (bundleVersion == null) {
            bundleVersion = "";
        }
        this.bundleVersion = bundleVersion;
        if (baseBundleVersion == null) {
            baseBundleVersion = "";
        }
        this.baseBundleVersion = baseBundleVersion;
        boolean z11 = splitBundlePath != null;
        this.hasSplitBundle = z11;
        this.baseBundlePath = z11 ? engineMainBundlePath : "";
        if (splitBundlePath != null) {
            engineMainBundlePath = splitBundlePath;
        }
        this.bizBundlePath = engineMainBundlePath;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x018a  */
    public final void reportFcp() throws JSONException {
        String string;
        if (this.reported.getAndSet(true)) {
            return;
        }
        long j11 = this.pageEnterStart;
        if (j11 > 0) {
            long j12 = this.pageRenderEnd;
            if (j12 <= 0) {
                return;
            }
            long j13 = j12 - j11;
            if (j13 > 60000) {
                C44128b.m97270n(TAG, "reportFcp: fcpDur=" + j13 + "ms exceeds threshold, dropped");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dur", j13);
            jSONObject.put("page_trace_id", this.pageTraceId);
            jSONObject.put("bundle_name", this.bundleName);
            jSONObject.put("bundle_version", this.bundleVersion);
            jSONObject.put("base_bundle_version", this.baseBundleVersion);
            jSONObject.put("module_name", this.moduleName);
            jSONObject.put("is_local_bundle", this.isLocalBundle);
            jSONObject.put("is_reloaded", this.isReloaded);
            jSONObject.put("reuse_type", this.reuseType);
            jSONObject.put("page_enter_start", this.pageEnterStart);
            jSONObject.put("page_enter_end", this.pageEnterEnd);
            jSONObject.put("page_enter_dur", dur(this.pageEnterStart, this.pageEnterEnd));
            jSONObject.put("fetch_bundle_start", this.fetchBundleStart);
            jSONObject.put("fetch_bundle_end", this.fetchBundleEnd);
            jSONObject.put("fetch_bundle_dur", dur(this.fetchBundleStart, this.fetchBundleEnd));
            jSONObject.put("fetch_engine_start", this.fetchEngineStart);
            jSONObject.put("fetch_engine_end", this.fetchEngineEnd);
            jSONObject.put("fetch_engine_dur", dur(this.fetchEngineStart, this.fetchEngineEnd));
            jSONObject.put("load_base_bundle_start", this.loadBaseBundleStart);
            jSONObject.put("load_base_bundle_end", this.loadBaseBundleEnd);
            jSONObject.put("load_base_bundle_dur", dur(this.loadBaseBundleStart, this.loadBaseBundleEnd));
            jSONObject.put("load_biz_bundle_start", this.loadBizBundleStart);
            jSONObject.put("load_biz_bundle_end", this.loadBizBundleEnd);
            jSONObject.put("load_biz_bundle_dur", dur(this.loadBizBundleStart, this.loadBizBundleEnd));
            jSONObject.put("create_view_start", this.createViewStart);
            jSONObject.put("create_view_end", this.createViewEnd);
            jSONObject.put("create_view_dur", dur(this.createViewStart, this.createViewEnd));
            jSONObject.put("page_first_render_start", this.pageFirstRenderStart);
            jSONObject.put("page_render_start", this.pageRenderStart);
            jSONObject.put("page_render_end", this.pageRenderEnd);
            jSONObject.put("page_render_dur", dur(this.pageRenderStart, this.pageRenderEnd));
            ReactNativeEngine.EngineInitTimings engineInitTimings = this.engineInitTimings;
            if (engineInitTimings != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("mutex_wait_dur", engineInitTimings.getMutexWaitDur());
                jSONObject2.put("await_ready_dur", engineInitTimings.getAwaitReadyDur());
                jSONObject2.put("so_loader_dur", engineInitTimings.getSoLoaderDur());
                jSONObject2.put("new_arch_dur", engineInitTimings.getNewArchDur());
                jSONObject2.put("turbo_module_dur", engineInitTimings.getTurboModuleDur());
                jSONObject2.put("init_total_dur", engineInitTimings.getInitTotalDur());
                string = jSONObject2.toString();
                if (string == null) {
                    string = "";
                }
            } else {
                string = "";
            }
            jSONObject.put(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, string);
            C44128b.m97259c(TAG, "reportFcp: " + jSONObject);
            C43852m.m96605q(EVENT_NAME, jSONObject);
            Function0<Unit> function0 = this.onFcpReported;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void reportFetchBundle(boolean isSuccess, long dur, @NotNull String bundleName, @Nullable String bundleVersion, int bundleOrigin, @Nullable String error, @Nullable String extra) throws JSONException {
        Intrinsics.checkNotNullParameter(bundleName, "bundleName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", FETCH_BUNDLE_NAME);
        jSONObject.put("dur", dur);
        if (error == null) {
            error = "";
        }
        jSONObject.put(com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, error);
        jSONObject.put("is_success", isSuccess);
        jSONObject.put("bundle_name", bundleName);
        if (bundleVersion == null) {
            bundleVersion = "";
        }
        jSONObject.put("bundle_version", bundleVersion);
        jSONObject.put("bundle_origin", bundleOrigin);
        jSONObject.put("is_subpackage", false);
        if (extra == null) {
            extra = "";
        }
        jSONObject.put(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, extra);
        C44128b.m97259c(TAG, "reportFetchBundle: " + jSONObject);
        C43852m.m96605q(FETCH_BUNDLE_EVENT_NAME, jSONObject);
    }

    public final void reportLoadResult(boolean isSuccess, @Nullable String error, @Nullable Integer code) throws JSONException {
        if (this.loadResultReported.getAndSet(true)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", isSuccess);
        if (error == null) {
            error = "";
        }
        jSONObject.put(com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, error);
        jSONObject.put("code", code != null ? code.intValue() : 0);
        jSONObject.put("page_trace_id", this.pageTraceId);
        jSONObject.put("bundle_name", this.bundleName);
        jSONObject.put("bundle_version", this.bundleVersion);
        jSONObject.put("base_bundle_version", this.baseBundleVersion);
        jSONObject.put("module_name", this.moduleName);
        jSONObject.put("is_local_bundle", this.isLocalBundle);
        jSONObject.put("is_reloaded", this.isReloaded);
        jSONObject.put("reuse_type", this.reuseType);
        C44128b.m97259c(TAG, "reportLoadResult: " + jSONObject);
        C43852m.m96605q(LOAD_RESULT_EVENT_NAME, jSONObject);
    }

    public final void reportPageError(@NotNull String errorType, boolean isJsFatal, @Nullable String error, @Nullable String extra) throws JSONException {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        if (isJsFatal) {
            extra = buildFatalErrorExtra(extra);
        } else if (extra == null) {
            extra = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_type", errorType);
        jSONObject.put("is_js_fatal", isJsFatal);
        if (error == null) {
            error = "";
        }
        jSONObject.put(com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, error);
        jSONObject.put("page_trace_id", this.pageTraceId);
        jSONObject.put("bundle_name", this.bundleName);
        jSONObject.put("bundle_version", this.bundleVersion);
        jSONObject.put("base_bundle_version", this.baseBundleVersion);
        jSONObject.put("module_name", this.moduleName);
        jSONObject.put("is_local_bundle", this.isLocalBundle);
        jSONObject.put("is_reloaded", this.isReloaded);
        jSONObject.put("reuse_type", this.reuseType);
        jSONObject.put(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, extra);
        C44128b.m97259c(TAG, "reportPageError: " + jSONObject);
        C43852m.m96605q(PAGE_ERROR_EVENT_NAME, jSONObject);
    }

    public final void resetForRetry() {
        this.reported.set(false);
        this.loadResultReported.set(false);
        if (this.firstLoadAttempted) {
            this.isReloaded = true;
        }
        this.firstLoadAttempted = true;
        this.pageEnterStart = System.currentTimeMillis();
        this.pageEnterEnd = 0L;
    }

    public final void setBaseBundleVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.baseBundleVersion = str;
    }

    public final void setBundleName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bundleName = str;
    }

    public final void setBundleVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bundleVersion = str;
    }

    public final void setCreateViewEnd(long j11) {
        this.createViewEnd = j11;
    }

    public final void setCreateViewStart(long j11) {
        this.createViewStart = j11;
    }

    public final void setEngineInitTimings(@Nullable ReactNativeEngine.EngineInitTimings engineInitTimings) {
        this.engineInitTimings = engineInitTimings;
    }

    public final void setFetchBundleEnd(long j11) {
        this.fetchBundleEnd = j11;
    }

    public final void setFetchBundleStart(long j11) {
        this.fetchBundleStart = j11;
    }

    public final void setFetchEngineEnd(long j11) {
        this.fetchEngineEnd = j11;
    }

    public final void setFetchEngineStart(long j11) {
        this.fetchEngineStart = j11;
    }

    public final void setLoadBaseBundleEnd(long j11) {
        this.loadBaseBundleEnd = j11;
    }

    public final void setLoadBaseBundleStart(long j11) {
        this.loadBaseBundleStart = j11;
    }

    public final void setLoadBizBundleEnd(long j11) {
        this.loadBizBundleEnd = j11;
    }

    public final void setLoadBizBundleStart(long j11) {
        this.loadBizBundleStart = j11;
    }

    public final void setLocalBundle(boolean z11) {
        this.isLocalBundle = z11;
    }

    public final void setModuleName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moduleName = str;
    }

    public final void setOnFcpReported(@Nullable Function0<Unit> function0) {
        this.onFcpReported = function0;
    }

    public final void setPageEnterEnd(long j11) {
        this.pageEnterEnd = j11;
    }

    public final void setPageEnterStart(long j11) {
        this.pageEnterStart = j11;
    }

    public final void setPageFirstRenderStart(long j11) {
        this.pageFirstRenderStart = j11;
    }

    public final void setPageRenderEnd(long j11) {
        this.pageRenderEnd = j11;
    }

    public final void setPageRenderStart(long j11) {
        this.pageRenderStart = j11;
    }

    public final void setReloaded(boolean z11) {
        this.isReloaded = z11;
    }

    public final void setReuseType(int i11) {
        this.reuseType = i11;
    }
}
