package com.kubi.sdk.web.tracker;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.CallSuper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.core.WebLoadError;
import com.kubi.sdk.web.helper.C24308d;
import com.kubi.sdk.web.scene.SceneType;
import com.kubi.sdk.web.tracker.model.FinishPageTimeModel;
import com.kubi.sdk.web.tracker.model.TrackDataModel;
import com.kubi.sdk.web.tracker.model.TrackHitCachedModel;
import com.kubi.sdk.web.tracker.model.WebPerformanceStageModel;
import com.kubi.sdk.web.util.C24328a;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.sdk.web.util.C24334g;
import com.kubi.sdk.web.util.C24335h;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import f10.C37323b;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43847h;
import p569qq.C43848i;
import p569qq.C43852m;
import p604rq.InterfaceC44169a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import x00.C45978c;
import y00.C46361a;
import z00.InterfaceC46621c;

/* JADX INFO: compiled from: BaseTracker.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0010\u0018\u0000 V2\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\t2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\tH\u0003¢\u0006\u0004\b0\u0010\u0003J+\u00105\u001a\u00020\t2\u0006\u00102\u001a\u0002012\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u0010$\u001a\u00020\u0004H\u0003¢\u0006\u0004\b5\u00106J+\u00107\u001a\u00020\t2\u0006\u00102\u001a\u0002012\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u0010$\u001a\u00020\u0004H\u0003¢\u0006\u0004\b7\u00106J#\u0010<\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\tH\u0002¢\u0006\u0004\b>\u0010\u0003J\u001f\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020\t2\b\b\u0002\u00104\u001a\u000203H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\tH\u0002¢\u0006\u0004\bD\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010ER(\u0010K\u001a\u0004\u0018\u00010\u00042\b\u0010F\u001a\u0004\u0018\u00010\u00048\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010ER$\u0010\u0005\u001a\u0004\u0018\u00010N8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b%\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0016\u0010U\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010TR$\u0010X\u001a\u0002012\u0006\u0010F\u001a\u0002018\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0017\u0010T\u001a\u0004\bV\u0010WR\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010YR\u0014\u0010[\u001a\u0002038\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010Z¨\u0006]"}, m90084d2 = {"Lcom/kubi/sdk/web/tracker/BaseTracker;", "Lz00/c;", "<init>", "()V", "", "uri", "", TUIConstantDefine.CREATE_TIME, "type", "", "e", "(Ljava/lang/String;JLjava/lang/String;)V", "Lcom/kubi/sdk/web/scene/SceneType;", "sceneType", "u", "(Lcom/kubi/sdk/web/scene/SceneType;)V", "Lcom/kubi/sdk/web/tracker/model/WebPerformanceStageModel;", "model", "g", "(Lcom/kubi/sdk/web/tracker/model/WebPerformanceStageModel;)V", "", "", ReportDataTable.COLUMN_PARAMS, "f", "(Ljava/util/Map;)V", "pageType", "", "dclTime", "currentProjectName", "currentProjectVersion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "url", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)V", "Lcom/kubi/sdk/web/core/WebLoadError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "d", "(Lcom/kubi/sdk/web/core/WebLoadError;)V", "onTimeout", "onClose", "Lcom/kubi/sdk/web/tracker/model/TrackDataModel;", "k", "()Lcom/kubi/sdk/web/tracker/model/TrackDataModel;", "Lorg/json/JSONObject;", "paramObj", "o", "(Lorg/json/JSONObject;)V", CmcdData.Factory.STREAM_TYPE_LIVE, "", "success", "", "code", "w", "(ZILjava/lang/String;)V", "m", "Lcom/kubi/sdk/web/tracker/model/TrackHitCachedModel;", "trackHitCachedModel", "Lcom/kubi/sdk/web/tracker/model/FinishPageTimeModel;", "finishPageTimeModel", "t", "(Lcom/kubi/sdk/web/tracker/model/TrackHitCachedModel;Lcom/kubi/sdk/web/tracker/model/FinishPageTimeModel;)V", "r", com.kubi.p110rn.Constants.BIZ, CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/String;I)V", "p", "(I)V", "v", "J", "<set-?>", "b", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "openType", "c", "loadTime", "Landroid/net/Uri;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "Z", "isLoadSuc", "i", "()Z", "hasPageMount", "Lcom/kubi/sdk/web/tracker/model/FinishPageTimeModel;", "I", "timeLimit", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTracker.kt\ncom/kubi/sdk/web/tracker/BaseTracker\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,382:1\n71#2,4:383\n1#3:387\n74#4,12:388\n74#4,12:400\n*S KotlinDebug\n*F\n+ 1 BaseTracker.kt\ncom/kubi/sdk/web/tracker/BaseTracker\n*L\n159#1:383,4\n300#1:388,12\n311#1:400,12\n*E\n"})
public class BaseTracker implements InterfaceC46621c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long createTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String openType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long loadTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Uri uri;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isLoadSuc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hasPageMount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final FinishPageTimeModel finishPageTimeModel = new FinishPageTimeModel(0, 0, 0, null, 0, null, 0, 0, 0, 0, false, false, 4095, null);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int timeLimit = 30000;

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: f */
    public final void mo58797f(@Nullable Map<String, ? extends Object> params) throws JSONException {
        this.isLoadSuc = true;
        this.loadTime = System.currentTimeMillis();
        m58833q(this, 0, 1, null);
        if (!C46361a.f103951a.m102235a()) {
            m58838l();
        }
        C44128b.m97259c("BaseTracker", "onLoadSuccess " + this.uri + " cost:" + (this.loadTime - this.createTime));
    }

    @Deprecated(message = "后面待新的数据ok之后，可以去掉，将被reportNewDataToSensor取代")
    /* JADX INFO: renamed from: l */
    public final void m58838l() throws JSONException {
        m58834x(this, true, 0, null, 6, null);
        m58832n(this, true, 0, null, 6, null);
    }

    @Override // z00.InterfaceC46621c
    public void onClose() throws JSONException {
        TrackDataModel trackDataModelMo58837k = mo58837k();
        if (this.isLoadSuc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("close report enter url=");
            sb2.append(this.uri);
            sb2.append(" hasPageMount=");
            sb2.append(this.hasPageMount);
            sb2.append(" warmupHit=");
            FinishPageTimeModel finishPageTimeModel = trackDataModelMo58837k.getFinishPageTimeModel();
            sb2.append(finishPageTimeModel != null ? Boolean.valueOf(finishPageTimeModel.getWarmupHit()) : null);
            C44128b.m97266j("KWebWarmup", sb2.toString());
            m58842r();
            m58844t(trackDataModelMo58837k.getTrackHitCachedModel(), trackDataModelMo58837k.getFinishPageTimeModel());
        } else {
            C44128b.m97266j("KWebWarmup", "close report skip reason=not_load_success url=" + this.uri + " hasPageMount=" + this.hasPageMount);
        }
        if (this.isLoadSuc && C46361a.f103951a.m102235a()) {
            m58838l();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("trackDataModel: ");
        sb3.append(C27029c.m66606i(trackDataModelMo58837k));
        sb3.append("， hasPageMount: ");
        sb3.append(this.hasPageMount);
        sb3.append(", url:[");
        sb3.append(this.uri);
        sb3.append("], biz: ");
        Uri uri = this.uri;
        sb3.append(uri != null ? C24308d.m58702a(uri) : null);
        C44128b.m97259c("BaseTracker", sb3.toString());
    }

    /* JADX INFO: renamed from: r */
    public final void m58842r() {
        Uri uri = this.uri;
        if (uri != null) {
            String strM58702a = C24308d.m58702a(uri);
            if (strM58702a == null) {
                strM58702a = "other";
            }
            long fcpTime = this.finishPageTimeModel.getFcpTime() <= ((long) this.timeLimit) ? this.finishPageTimeModel.getFcpTime() : 0L;
            long onLoadtime = this.finishPageTimeModel.getOnLoadtime() <= ((long) this.timeLimit) ? this.finishPageTimeModel.getOnLoadtime() : 0L;
            long dclTime = this.finishPageTimeModel.getDclTime() <= ((long) this.timeLimit) ? this.finishPageTimeModel.getDclTime() : 0L;
            KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_H5PAGE_COST_MILLISECONDS;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42393d("path", C24334g.f48568a.m58881a(strM58702a));
            eventParametersBuilderAcquire.m42396g("fcpTime", fcpTime);
            eventParametersBuilderAcquire.m42396g("onLoadTime", onLoadtime);
            eventParametersBuilderAcquire.m42396g("dclTime", dclTime);
            TechnologyEvent.C19216a c19216a = TechnologyEvent.C19216a.f35485a;
            Map<String, Object> mapM42399c = c19216a.m42399c(eventParametersBuilderAcquire);
            Map<String, Number> mapM42398a = c19216a.m42398a(eventParametersBuilderAcquire);
            for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
                if (mapM42398a.isEmpty()) {
                    interfaceC44169a.mo94079b(kunlunEventNameEnum.getEventName(), mapM42399c);
                } else {
                    interfaceC44169a.mo94078a(kunlunEventNameEnum.getEventName(), mapM42398a, mapM42399c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m58846v() {
        if (C45978c.f103427a.m101432b()) {
            TrackDataModel trackDataModelMo58837k = mo58837k();
            StringBuilder sb2 = new StringBuilder();
            FinishPageTimeModel finishPageTimeModel = trackDataModelMo58837k.getFinishPageTimeModel();
            TrackHitCachedModel trackHitCachedModel = trackDataModelMo58837k.getTrackHitCachedModel();
            if (finishPageTimeModel != null) {
                sb2.append("fcpTime: " + finishPageTimeModel.getFcpTime() + '\n');
                sb2.append("onLoadTime: " + finishPageTimeModel.getOnLoadtime() + '\n');
                sb2.append("dclTime: " + finishPageTimeModel.getDclTime() + '\n');
                sb2.append("pageType: " + finishPageTimeModel.getPageType() + '\n');
                sb2.append("cacheType: " + finishPageTimeModel.getCacheType() + '\n');
            }
            if (trackHitCachedModel != null) {
                sb2.append("hitRate: " + trackHitCachedModel.getHitRate() + '\n');
                StringBuilder sb3 = new StringBuilder();
                sb3.append("hitIndexHtml: ");
                sb3.append(trackHitCachedModel.getHitIndexHtml());
                sb2.append(sb3.toString());
            }
            C44128b.m97259c("BaseTracker", "showDebugMonitor: " + ((Object) sb2));
            ToastCompat.m66456m();
            ToastCompat.m66436B(sb2.toString(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m58832n(BaseTracker baseTracker, boolean z11, int i11, String str, int i12, Object obj) throws JSONException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: oldTrackEvent");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            str = "";
        }
        baseTracker.m58839m(z11, i11, str);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m58833q(BaseTracker baseTracker, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportCodeToKunLun");
        }
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        baseTracker.m58841p(i11);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m58834x(BaseTracker baseTracker, boolean z11, int i11, String str, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            str = "";
        }
        baseTracker.m58847w(z11, i11, str);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: a */
    public void mo58792a(@NotNull String pageType, double dclTime, @NotNull String currentProjectName, @NotNull String currentProjectVersion) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(currentProjectName, "currentProjectName");
        Intrinsics.checkNotNullParameter(currentProjectVersion, "currentProjectVersion");
        this.hasPageMount = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.createTime;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        this.finishPageTimeModel.setSsgDownloadTime(C37323b.f82838a.m83894b(this.uri));
        this.finishPageTimeModel.setFcpTime(jCurrentTimeMillis);
        this.finishPageTimeModel.setPageType(pageType);
        FinishPageTimeModel finishPageTimeModel = this.finishPageTimeModel;
        finishPageTimeModel.setDclTime(((long) dclTime) + finishPageTimeModel.getSsgDownloadTime());
        C24329b.f48558a.m58864d("onMount", " uri:[" + this.uri + "], fcpTime[" + jCurrentTimeMillis + "],pageType: " + pageType + ", dclTime: " + dclTime + ", currentProjectName: " + currentProjectName + ", currentProjectVersion: " + currentProjectVersion);
        m58846v();
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: d */
    public void mo58795d(@NotNull WebLoadError error) throws JSONException {
        Intrinsics.checkNotNullParameter(error, "error");
        this.loadTime = System.currentTimeMillis();
        m58847w(false, error.getErrorCode(), "fail:" + error.getRequestUri() + " desc:" + error.getCom.tencent.qcloud.tuicore.TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION java.lang.String());
        m58839m(false, error.getErrorCode(), "fail:" + error.getRequestUri() + " desc:" + error.getCom.tencent.qcloud.tuicore.TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION java.lang.String());
        m58841p(error.getErrorCode());
    }

    @Override // z00.InterfaceC46621c
    @CallSuper
    /* JADX INFO: renamed from: e */
    public void mo58796e(@NotNull String uri, long createTime, @NotNull String type) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type, "type");
        this.uri = C24335h.f48569a.m58889h(uri);
        this.createTime = createTime;
        this.openType = type;
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: g */
    public void mo58798g(@NotNull WebPerformanceStageModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.finishPageTimeModel.setViewCreateTime(model.getViewCreateTime());
        this.finishPageTimeModel.setViewInitTime(model.getViewInitTime());
        this.finishPageTimeModel.setCoreInitTime(model.getCoreInitTime());
        this.finishPageTimeModel.setFirstReqTime(model.getFirstReqTime());
        this.finishPageTimeModel.setWarmupHit(model.getWarmupHit());
        this.finishPageTimeModel.setFirstWebViewWarmup(model.getFirstWebViewWarmup());
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: h */
    public void mo58799h(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        long jCurrentTimeMillis = System.currentTimeMillis() - this.createTime;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        this.finishPageTimeModel.setOnLoadtime(jCurrentTimeMillis);
        C44128b.m97259c("BaseTracker", "onPageFinished: onLoadTime[" + jCurrentTimeMillis + "], uri:[" + this.uri + ']');
        m58846v();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getHasPageMount() {
        return this.hasPageMount;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getOpenType() {
        return this.openType;
    }

    @CallSuper
    @NotNull
    /* JADX INFO: renamed from: k */
    public TrackDataModel mo58837k() {
        FinishPageTimeModel finishPageTimeModel = this.finishPageTimeModel;
        return new TrackDataModel(finishPageTimeModel.copy((4095 & 1) != 0 ? finishPageTimeModel.fcpTime : 0L, (4095 & 2) != 0 ? finishPageTimeModel.onLoadtime : 0L, (4095 & 4) != 0 ? finishPageTimeModel.dclTime : 0L, (4095 & 8) != 0 ? finishPageTimeModel.pageType : null, (4095 & 16) != 0 ? finishPageTimeModel.ssgDownloadTime : 0L, (4095 & 32) != 0 ? finishPageTimeModel.cacheType : null, (4095 & 64) != 0 ? finishPageTimeModel.viewCreateTime : 0L, (4095 & 128) != 0 ? finishPageTimeModel.viewInitTime : 0L, (4095 & 256) != 0 ? finishPageTimeModel.coreInitTime : 0L, (4095 & 512) != 0 ? finishPageTimeModel.firstReqTime : 0L, (4095 & 1024) != 0 ? finishPageTimeModel.warmupHit : false, (4095 & 2048) != 0 ? finishPageTimeModel.firstWebViewWarmup : false), null);
    }

    @CallSuper
    /* JADX INFO: renamed from: m */
    public final void m58839m(boolean success, int code, String error) throws JSONException {
        Object host;
        Uri uri = this.uri;
        if (uri == null || (host = uri.getHost()) == null) {
            return;
        }
        Object objM58703b = C24308d.m58703b(uri);
        Object objM58702a = C24308d.m58702a(uri);
        long j11 = this.loadTime - this.createTime;
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        String strM58860c = C24328a.m58860c(string);
        String strM58859b = C24328a.m58859b(string);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "open_webview");
        if (objM58702a != null) {
            jSONObject.put("name", objM58702a);
        }
        jSONObject.put("$event_duration", j11);
        jSONObject.put("path", objM58703b);
        jSONObject.put("host", host);
        jSONObject.put("success", success);
        jSONObject.put("url", string);
        jSONObject.put("code", code);
        if (success) {
            jSONObject.put("duration4", this.finishPageTimeModel.getFcpTime());
            Object obj = this.openType;
            Object obj2 = "none";
            if (obj == null) {
                obj = "none";
            }
            jSONObject.put("mode", obj);
            if (strM58859b != null && strM58859b.length() != 0) {
                obj2 = "session";
            }
            jSONObject.put("login_type", obj2);
            mo58840o(jSONObject);
        } else {
            jSONObject.put("error_message", error);
        }
        if (strM58860c != null && strM58860c.length() != 0) {
            jSONObject.put("grid_type", strM58860c);
        }
        C43852m.m96605q("duration_event", jSONObject);
    }

    /* JADX INFO: renamed from: o */
    public void mo58840o(@NotNull JSONObject paramObj) {
        Intrinsics.checkNotNullParameter(paramObj, "paramObj");
    }

    /* JADX INFO: renamed from: p */
    public final void m58841p(int code) {
        Uri uri = this.uri;
        String strM58702a = uri != null ? C24308d.m58702a(uri) : null;
        if (strM58702a == null) {
            strM58702a = "other";
        }
        m58843s(strM58702a, code);
        C43847h.m96575d(KunlunTechEventEnum.CATE_OPEN_WEBVIEW, code);
    }

    /* JADX INFO: renamed from: s */
    public final void m58843s(String biz, int code) {
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_H5PAGE_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("path", C24334g.f48568a.m58881a(biz));
        eventParametersBuilderAcquire.m42391b("code", code);
        eventParametersBuilderAcquire.m42393d("category", "page_finish");
        TechnologyEvent.C19216a c19216a = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c = c19216a.m42399c(eventParametersBuilderAcquire);
        Map<String, Number> mapM42398a = c19216a.m42398a(eventParametersBuilderAcquire);
        for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
            if (mapM42398a.isEmpty()) {
                interfaceC44169a.mo94079b(kunlunEventNameEnum.getEventName(), mapM42399c);
            } else {
                interfaceC44169a.mo94078a(kunlunEventNameEnum.getEventName(), mapM42398a, mapM42399c);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m58844t(TrackHitCachedModel trackHitCachedModel, FinishPageTimeModel finishPageTimeModel) throws JSONException {
        Uri uri = this.uri;
        if (uri == null) {
            C44128b.m97266j("KWebWarmup", "report loadPagePer skip reason=uri_null");
            return;
        }
        String host = uri.getHost();
        if (host == null) {
            C44128b.m97266j("KWebWarmup", "report loadPagePer skip reason=host_null url=" + uri);
            return;
        }
        String strM58703b = C24308d.m58703b(uri);
        String strM58702a = C24308d.m58702a(uri);
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "loadPagePer");
        jSONObject.put("url", string);
        jSONObject.put("host", host);
        jSONObject.put("path", strM58703b);
        jSONObject.put(com.kubi.p110rn.Constants.BIZ, strM58702a);
        WebConfig webConfig = WebConfig.f48355a;
        jSONObject.put(TUIConstants.TUIChat.GROUP_TYPE, webConfig.m58600k());
        jSONObject.put("siteType", webConfig.m58598i());
        if (trackHitCachedModel != null) {
            jSONObject.put("hitCount", trackHitCachedModel.getHitCount());
            jSONObject.put("requestCount", trackHitCachedModel.getRequestCount());
        }
        if (finishPageTimeModel != null) {
            jSONObject.put("fcpTime", finishPageTimeModel.getFcpTime());
            jSONObject.put("onLoadTime", finishPageTimeModel.getOnLoadtime());
            jSONObject.put("dclTime", finishPageTimeModel.getDclTime());
            jSONObject.put("pageType", finishPageTimeModel.getPageType());
            jSONObject.put("view_create_time", finishPageTimeModel.getViewCreateTime());
            jSONObject.put("view_init_time", finishPageTimeModel.getViewInitTime());
            jSONObject.put("core_init_time", finishPageTimeModel.getCoreInitTime());
            jSONObject.put("first_req_time", finishPageTimeModel.getFirstReqTime());
            jSONObject.put("warmupHit", finishPageTimeModel.getWarmupHit());
            jSONObject.put("firstWebViewWarmup", finishPageTimeModel.getFirstWebViewWarmup());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("report loadPagePer url=");
        sb2.append(string);
        sb2.append(" biz=");
        sb2.append(strM58702a);
        sb2.append(" warmupHit=");
        sb2.append(finishPageTimeModel != null ? Boolean.valueOf(finishPageTimeModel.getWarmupHit()) : null);
        sb2.append(" firstWebViewWarmup=");
        sb2.append(finishPageTimeModel != null ? Boolean.valueOf(finishPageTimeModel.getFirstWebViewWarmup()) : null);
        sb2.append(" viewCreateTimeMs=");
        sb2.append(finishPageTimeModel != null ? Long.valueOf(finishPageTimeModel.getViewCreateTime()) : null);
        sb2.append(" viewInitTimeMs=");
        sb2.append(finishPageTimeModel != null ? Long.valueOf(finishPageTimeModel.getViewInitTime()) : null);
        sb2.append(" coreInitTimeMs=");
        sb2.append(finishPageTimeModel != null ? Long.valueOf(finishPageTimeModel.getCoreInitTime()) : null);
        sb2.append(" firstReqTimeMs=");
        sb2.append(finishPageTimeModel != null ? Long.valueOf(finishPageTimeModel.getFirstReqTime()) : null);
        sb2.append(" hitCount=");
        sb2.append(trackHitCachedModel != null ? Integer.valueOf(trackHitCachedModel.getHitCount()) : null);
        sb2.append(" requestCount=");
        sb2.append(trackHitCachedModel != null ? Integer.valueOf(trackHitCachedModel.getRequestCount()) : null);
        C44128b.m97266j("KWebWarmup", sb2.toString());
        C43852m.m96605q("duration_event", jSONObject);
    }

    /* JADX INFO: renamed from: u */
    public final void m58845u(@NotNull SceneType sceneType) {
        Intrinsics.checkNotNullParameter(sceneType, "sceneType");
        this.finishPageTimeModel.setCacheType(sceneType.name());
    }

    @SuppressLint({"MissingPermission"})
    @CallSuper
    /* JADX INFO: renamed from: w */
    public final void m58847w(boolean success, int code, String error) {
        String host;
        String encodedPath;
        Uri uri = this.uri;
        if (uri == null || (host = uri.getHost()) == null || (encodedPath = uri.getEncodedPath()) == null) {
            return;
        }
        long j11 = this.loadTime - this.createTime;
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        String strM58860c = C24328a.m58860c(string);
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("path", encodedPath);
        eventParametersBuilderAcquire.m42393d("host", host);
        eventParametersBuilderAcquire.m42394e("success", success);
        eventParametersBuilderAcquire.m42393d("url", host + encodedPath);
        TechnologyEvent.C19216a.m42397b(eventParametersBuilderAcquire);
        eventParametersBuilderAcquire.m42391b("code", code);
        if (success) {
            eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, j11);
        } else {
            eventParametersBuilderAcquire.m42393d("error_message", error);
        }
        if (strM58860c != null && strM58860c.length() != 0) {
            eventParametersBuilderAcquire.m42393d("category", strM58860c);
        }
        TechnologyEvent.m42388d("open_webview", eventParametersBuilderAcquire);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: b */
    public void mo58793b(int i11) {
        InterfaceC46621c.a.m102795g(this, i11);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: c */
    public void mo58794c(@NotNull String str) {
        InterfaceC46621c.a.m102793e(this, str);
    }

    @Override // z00.InterfaceC46621c
    public void onTimeout() throws JSONException {
        this.loadTime = System.currentTimeMillis();
        m58847w(false, -8, "timeout");
        m58839m(false, -8, "timeout");
        m58841p(-8);
    }
}
