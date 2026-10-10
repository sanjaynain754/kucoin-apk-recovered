package f10;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.proxy.ProxyType;
import com.kubi.sdk.web.tracker.BaseTracker;
import com.kubi.sdk.web.tracker.CacheFileType;
import com.kubi.sdk.web.tracker.model.TrackDataModel;
import com.kubi.sdk.web.tracker.model.TrackHitCachedModel;
import com.kubi.sdk.web.util.C24332e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: f10.a */
/* JADX INFO: compiled from: ProxySceneTracker.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0016\u0010!\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"¨\u0006$"}, m90084d2 = {"Lf10/a;", "Lcom/kubi/sdk/web/tracker/BaseTracker;", "<init>", "()V", "Lcom/kubi/sdk/web/proxy/ProxyType;", "proxyType", "", "url", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lcom/kubi/sdk/web/proxy/ProxyType;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "paramObj", "o", "(Lorg/json/JSONObject;)V", "Lcom/kubi/sdk/web/tracker/model/TrackDataModel;", "k", "()Lcom/kubi/sdk/web/tracker/model/TrackDataModel;", "", "z", "(Ljava/lang/String;)Z", "y", "()Ljava/lang/String;", "", "j", "I", "requestCount", "cssCount", CmcdData.Factory.STREAM_TYPE_LIVE, "jsCount", "m", "cacheCount", "n", "otherCount", "Z", "indexChanged", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nProxySceneTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProxySceneTracker.kt\ncom/kubi/sdk/web/tracker/ProxySceneTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class C37322a extends BaseTracker {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int requestCount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int cssCount;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int jsCount;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int cacheCount;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int otherCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean indexChanged;

    /* JADX INFO: renamed from: f10.a$a */
    /* JADX INFO: compiled from: ProxySceneTracker.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ProxyType.values().length];
            try {
                iArr[ProxyType.LocalFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CacheFileType.values().length];
            try {
                iArr2[CacheFileType.CSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CacheFileType.JS.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m83890A(@Nullable ProxyType proxyType, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (proxyType == ProxyType.RedirectIndexLocal) {
            this.indexChanged = true;
            this.cacheCount++;
            this.requestCount++;
        } else {
            if (getHasPageMount() || !m83892z(url)) {
                return;
            }
            this.requestCount++;
            if ((proxyType == null ? -1 : a.$EnumSwitchMapping$0[proxyType.ordinal()]) == 1) {
                this.cacheCount++;
            }
        }
    }

    @Override // com.kubi.sdk.web.tracker.BaseTracker
    /* JADX INFO: renamed from: o */
    public void mo58840o(@NotNull JSONObject paramObj) throws JSONException {
        Intrinsics.checkNotNullParameter(paramObj, "paramObj");
        paramObj.put("mode", m83891y());
    }

    /* JADX INFO: renamed from: y */
    public final String m83891y() {
        StringBuilder sb2 = new StringBuilder();
        String openType = getOpenType();
        if (openType != null) {
            sb2.append(openType);
            sb2.append("&");
        }
        if (this.indexChanged) {
            sb2.append("index&");
        }
        if (this.cacheCount > 0) {
            sb2.append("local&");
        }
        if (sb2.length() == 0) {
            return "none";
        }
        sb2.setLength(sb2.length() - 1);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "{\n            cacheType.…Type.toString()\n        }");
        return string;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m83892z(String url) {
        CacheFileType cacheFileTypeM58878b = C24332e.f48564a.m58878b(url);
        int i11 = a.$EnumSwitchMapping$1[cacheFileTypeM58878b.ordinal()];
        if (i11 == 1) {
            this.cssCount++;
        } else if (i11 != 2) {
            this.otherCount++;
        } else {
            this.jsCount++;
        }
        return cacheFileTypeM58878b == CacheFileType.HTML || cacheFileTypeM58878b == CacheFileType.CSS || cacheFileTypeM58878b == CacheFileType.JS;
    }

    @Override // com.kubi.sdk.web.tracker.BaseTracker
    @NotNull
    /* JADX INFO: renamed from: k */
    public TrackDataModel mo58837k() {
        String string;
        TrackDataModel trackDataModelMo58837k = super.mo58837k();
        if (this.requestCount != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((this.cacheCount * 100) / this.requestCount);
            sb2.append('%');
            string = sb2.toString();
        } else {
            string = "0%";
        }
        return new TrackDataModel(trackDataModelMo58837k.getFinishPageTimeModel(), new TrackHitCachedModel(this.requestCount, this.jsCount, this.cssCount, this.otherCount, this.cacheCount, string, this.indexChanged));
    }
}
