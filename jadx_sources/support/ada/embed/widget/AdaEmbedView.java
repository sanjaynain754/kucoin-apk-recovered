package support.ada.embed.widget;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import androidx.webkit.internal.AssetHelper;
import ci0.InterfaceC4987a;
import com.google.common.net.HttpHeaders;
import com.tencent.bugly.proguard.C33812n7;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.TXVodConstants;
import defpackage.AdaWebViewClient;
import di0.C36715b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.TypeCastException;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;
import support.ada.embed.R$styleable;
import support.ada.embed.actions.ResetAction;
import support.ada.embed.actions.SetDeviceTokenAction;
import support.ada.embed.actions.SetMetafieldsAction;
import support.ada.embed.actions.SetSensitiveMetafieldsAction;

/* JADX INFO: compiled from: AdaEmbedView.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 m2\u00020\u0001:\u00053n6opB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010\rJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u000b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00020\u000b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b#\u0010!J\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b \u0010&J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b#\u0010&J\u001d\u0010)\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\b)\u0010*JI\u0010.\u001a\u00020\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u001e¢\u0006\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u0010,\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u00104R\u0016\u00108\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u00104R\u0016\u0010+\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u00104R\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002090\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010:R\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002090\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010:R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010<R0\u0010A\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110>j\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0011`?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010@R\u0018\u0010E\u001a\u00060BR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010FR\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010FR½\u0001\u0010T\u001aª\u0001\u0012\u0004\u0012\u00020\u001e\u0012J\u0012H\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110L¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020\u000b0K0Jj#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110L¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020\u000b0K`P0IjT\u0012\u0004\u0012\u00020\u001e\u0012J\u0012H\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110L¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020\u000b0K0Jj#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110L¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020\u000b0K`P`Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR0\u0010`\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\b\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R*\u0010h\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR*\u0010l\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010c\u001a\u0004\bj\u0010e\"\u0004\bk\u0010g¨\u0006q"}, m90084d2 = {"Lsupport/ada/embed/widget/AdaEmbedView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "m", "()Z", "", CmcdData.Factory.STREAM_TYPE_LIVE, "()V", "accept", "setAcceptThirdPartyCookies", "(Z)V", "Lci0/a;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "f", "(Lci0/a;)V", "g", "onAttachedToWindow", "i", "d", "Lsupport/ada/embed/widget/AdaEmbedView$Settings;", "settings", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lsupport/ada/embed/widget/AdaEmbedView$Settings;)V", "", "", "metaFields", "setMetaFields", "(Ljava/util/Map;)V", "sensitiveMetaFields", "setSensitiveMetaFields", "Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;", "metaFieldsBuilder", "(Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;)V", "fileName", "data", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "language", "greetings", "resetChatHistory", "j", "(Ljava/lang/String;Ljava/lang/String;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;Ljava/lang/Boolean;)V", InterfaceC33826o0.f71244p, "setDeviceToken", "(Ljava/lang/String;)V", "b", "Ljava/lang/String;", "handle", "c", "cluster", "styles", "", "Ljava/util/Map;", "Landroid/os/Handler;", "Landroid/os/Handler;", "mainHandler", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "actionQueue", "Lsupport/ada/embed/widget/AdaEmbedView$b;", "k", "Lsupport/ada/embed/widget/AdaEmbedView$b;", "adaInterface", "Z", "isInitialized", "isAdaReady", "Ljava/util/HashMap;", "Ljava/util/HashSet;", "Lkotlin/Function1;", "Lsupport/ada/embed/widget/Event;", "Lkotlin/ParameterName;", "name", "event", "Lkotlin/collections/HashSet;", "Lkotlin/collections/HashMap;", "n", "Ljava/util/HashMap;", "eventCallbacks", "", "o", "I", "loadTimeoutMillis", "Lsupport/ada/embed/widget/AdaEmbedView$c;", "p", "Lkotlin/jvm/functions/Function1;", "getFilePickerCallback", "()Lkotlin/jvm/functions/Function1;", "setFilePickerCallback", "(Lkotlin/jvm/functions/Function1;)V", "filePickerCallback", "Lkotlin/Function0;", "q", "Lkotlin/jvm/functions/Function0;", "getZdChatterAuthCallback", "()Lkotlin/jvm/functions/Function0;", "setZdChatterAuthCallback", "(Lkotlin/jvm/functions/Function0;)V", "zdChatterAuthCallback", "r", "getWebViewLoadingErrorCallback", "setWebViewLoadingErrorCallback", "webViewLoadingErrorCallback", CmcdData.Factory.STREAMING_FORMAT_SS, "Companion", "MetaFields", "Settings", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
@SuppressLint({"SetJavaScriptEnabled"})
public final class AdaEmbedView extends WebView {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String handle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public String cluster;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String greetings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public String styles;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public String language;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public Map<String, ? extends Object> metaFields;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public Map<String, ? extends Object> sensitiveMetaFields;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Handler mainHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final LinkedHashMap<String, InterfaceC4987a> actionQueue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final C44553b adaInterface;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean isInitialized;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isAdaReady;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final HashMap<String, HashSet<Function1<Event, Unit>>> eventCallbacks;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int loadTimeoutMillis;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Function1<? super C44554c, Boolean> filePickerCallback;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public Function0<String> zdChatterAuthCallback;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> webViewLoadingErrorCallback;

    /* JADX INFO: compiled from: AdaEmbedView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m90084d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$MetaFields;", "Landroid/os/Parcelable;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class MetaFields implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C44549b();

        /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$MetaFields$a */
        /* JADX INFO: compiled from: AdaEmbedView.kt */
        @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\tH\u0000¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;", "", "<init>", "()V", "", "key", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/Map;", "", "Ljava/util/Map;", "metaFields", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
        public static final class C44548a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public Map<String, Object> metaFields = new LinkedHashMap();

            @NotNull
            /* JADX INFO: renamed from: a */
            public final Map<String, Object> m98628a() {
                return this.metaFields;
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public final C44548a m98629b(@NotNull String key, @NotNull String value) {
                this.metaFields.put(key, value);
                return this;
            }
        }

        /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$MetaFields$b */
        @Metadata(m90082bv = {1, 0, 3}, m90085k = 3, m90086mv = {1, 1, 15})
        public static class C44549b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Object createFromParcel(@NotNull Parcel parcel) {
                if (parcel.readInt() != 0) {
                    return new MetaFields();
                }
                return null;
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Object[] newArray(int i11) {
                return new MetaFields[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: AdaEmbedView.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001=Bs\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u008c\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u0014R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u001aR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b7\u0010\u001aR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b<\u0010\u0014¨\u0006>"}, m90084d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$Settings;", "Landroid/os/Parcelable;", "", "handle", "cluster", "greetings", "styles", "language", "", "", "metaFields", "sensitiveMetaFields", "", "acceptThirdPartyCookies", "", "loadTimeoutMillis", "deviceToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ZILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/Map;", "component7", "component8", "()Z", "component9", "()I", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ZILjava/lang/String;)Lsupport/ada/embed/widget/AdaEmbedView$Settings;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHandle", "getCluster", "getGreetings", "getStyles", "getLanguage", "Ljava/util/Map;", "getMetaFields", "getSensitiveMetaFields", "Z", "getAcceptThirdPartyCookies", "I", "getLoadTimeoutMillis", "getDeviceToken", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final /* data */ class Settings implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C44551b();
        private final boolean acceptThirdPartyCookies;

        @NotNull
        private final String cluster;

        @NotNull
        private final String deviceToken;

        @NotNull
        private final String greetings;

        @NotNull
        private final String handle;

        @NotNull
        private final String language;
        private final int loadTimeoutMillis;

        @NotNull
        private final Map<String, Object> metaFields;

        @NotNull
        private final Map<String, Object> sensitiveMetaFields;

        @NotNull
        private final String styles;

        /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$Settings$a */
        /* JADX INFO: compiled from: AdaEmbedView.kt */
        @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0014¨\u0006&"}, m90084d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$Settings$a;", "", "", "handle", "<init>", "(Ljava/lang/String;)V", "cluster", "b", "(Ljava/lang/String;)Lsupport/ada/embed/widget/AdaEmbedView$Settings$a;", "greetings", "c", "language", "d", "Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;", "metaFieldsBuilder", "e", "(Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$a;)Lsupport/ada/embed/widget/AdaEmbedView$Settings$a;", "Lsupport/ada/embed/widget/AdaEmbedView$Settings;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lsupport/ada/embed/widget/AdaEmbedView$Settings;", "Ljava/lang/String;", "styles", "", "I", "loadTimeoutMillis", "", "f", "Ljava/util/Map;", "metaFields", "g", "sensitiveMetaFields", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "Z", "acceptThirdPartyCookies", "i", "deviceToken", "j", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
        public static final class C44550a {

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            public boolean acceptThirdPartyCookies;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            public final String handle;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public String cluster = "";

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public String greetings = "";

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            public String styles = "";

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public String language = "";

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            public int loadTimeoutMillis = 30000;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            public Map<String, ? extends Object> metaFields = MapsKt.emptyMap();

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            public Map<String, ? extends Object> sensitiveMetaFields = MapsKt.emptyMap();

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            public String deviceToken = "";

            @NotNull
            /* JADX INFO: renamed from: a */
            public final Settings m98630a() {
                return new Settings(this.handle, this.cluster, this.greetings, this.styles, this.language, this.metaFields, this.sensitiveMetaFields, this.acceptThirdPartyCookies, this.loadTimeoutMillis, this.deviceToken);
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public final C44550a m98631b(@NotNull String cluster) {
                this.cluster = cluster;
                return this;
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public final C44550a m98632c(@NotNull String greetings) {
                this.greetings = greetings;
                return this;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public final C44550a m98633d(@NotNull String language) {
                this.language = language;
                return this;
            }

            public C44550a(@NotNull String str) {
                this.handle = str;
            }

            @NotNull
            /* JADX INFO: renamed from: e */
            public final C44550a m98634e(@NotNull MetaFields.C44548a metaFieldsBuilder) {
                this.metaFields = metaFieldsBuilder.m98628a();
                return this;
            }
        }

        /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$Settings$b */
        @Metadata(m90082bv = {1, 0, 3}, m90085k = 3, m90086mv = {1, 1, 15})
        public static class C44551b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Object createFromParcel(@NotNull Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                while (i11 != 0) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(Object.class.getClassLoader()));
                    i11--;
                }
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                while (i12 != 0) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(Object.class.getClassLoader()));
                    i12--;
                }
                return new Settings(string, string2, string3, string4, string5, linkedHashMap, linkedHashMap2, parcel.readInt() != 0, parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Object[] newArray(int i11) {
                return new Settings[i11];
            }
        }

        public Settings(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Map<String, ? extends Object> map, @NotNull Map<String, ? extends Object> map2, boolean z11, int i11, @NotNull String str6) {
            this.handle = str;
            this.cluster = str2;
            this.greetings = str3;
            this.styles = str4;
            this.language = str5;
            this.metaFields = map;
            this.sensitiveMetaFields = map2;
            this.acceptThirdPartyCookies = z11;
            this.loadTimeoutMillis = i11;
            this.deviceToken = str6;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public /* synthetic */ Settings(String str, String str2, String str3, String str4, String str5, Map map, Map map2, boolean z11, int i11, String str6, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, map, map2, z11, (i12 & 256) != 0 ? 30000 : i11, str6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Settings copy$default(Settings settings, String str, String str2, String str3, String str4, String str5, Map map, Map map2, boolean z11, int i11, String str6, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = settings.handle;
            }
            if ((i12 & 2) != 0) {
                str2 = settings.cluster;
            }
            if ((i12 & 4) != 0) {
                str3 = settings.greetings;
            }
            if ((i12 & 8) != 0) {
                str4 = settings.styles;
            }
            if ((i12 & 16) != 0) {
                str5 = settings.language;
            }
            if ((i12 & 32) != 0) {
                map = settings.metaFields;
            }
            if ((i12 & 64) != 0) {
                map2 = settings.sensitiveMetaFields;
            }
            if ((i12 & 128) != 0) {
                z11 = settings.acceptThirdPartyCookies;
            }
            if ((i12 & 256) != 0) {
                i11 = settings.loadTimeoutMillis;
            }
            if ((i12 & 512) != 0) {
                str6 = settings.deviceToken;
            }
            int i13 = i11;
            String str7 = str6;
            Map map3 = map2;
            boolean z12 = z11;
            String str8 = str5;
            Map map4 = map;
            return settings.copy(str, str2, str3, str4, str8, map4, map3, z12, i13, str7);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHandle() {
            return this.handle;
        }

        @NotNull
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getDeviceToken() {
            return this.deviceToken;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCluster() {
            return this.cluster;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getGreetings() {
            return this.greetings;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        @NotNull
        public final Map<String, Object> component6() {
            return this.metaFields;
        }

        @NotNull
        public final Map<String, Object> component7() {
            return this.sensitiveMetaFields;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getAcceptThirdPartyCookies() {
            return this.acceptThirdPartyCookies;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final int getLoadTimeoutMillis() {
            return this.loadTimeoutMillis;
        }

        @NotNull
        public final Settings copy(@NotNull String handle, @NotNull String cluster, @NotNull String greetings, @NotNull String styles, @NotNull String language, @NotNull Map<String, ? extends Object> metaFields, @NotNull Map<String, ? extends Object> sensitiveMetaFields, boolean acceptThirdPartyCookies, int loadTimeoutMillis, @NotNull String deviceToken) {
            return new Settings(handle, cluster, greetings, styles, language, metaFields, sensitiveMetaFields, acceptThirdPartyCookies, loadTimeoutMillis, deviceToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return Intrinsics.areEqual(this.handle, settings.handle) && Intrinsics.areEqual(this.cluster, settings.cluster) && Intrinsics.areEqual(this.greetings, settings.greetings) && Intrinsics.areEqual(this.styles, settings.styles) && Intrinsics.areEqual(this.language, settings.language) && Intrinsics.areEqual(this.metaFields, settings.metaFields) && Intrinsics.areEqual(this.sensitiveMetaFields, settings.sensitiveMetaFields) && this.acceptThirdPartyCookies == settings.acceptThirdPartyCookies && this.loadTimeoutMillis == settings.loadTimeoutMillis && Intrinsics.areEqual(this.deviceToken, settings.deviceToken);
        }

        public final boolean getAcceptThirdPartyCookies() {
            return this.acceptThirdPartyCookies;
        }

        @NotNull
        public final String getCluster() {
            return this.cluster;
        }

        @NotNull
        public final String getDeviceToken() {
            return this.deviceToken;
        }

        @NotNull
        public final String getGreetings() {
            return this.greetings;
        }

        @NotNull
        public final String getHandle() {
            return this.handle;
        }

        @NotNull
        public final String getLanguage() {
            return this.language;
        }

        public final int getLoadTimeoutMillis() {
            return this.loadTimeoutMillis;
        }

        @NotNull
        public final Map<String, Object> getMetaFields() {
            return this.metaFields;
        }

        @NotNull
        public final Map<String, Object> getSensitiveMetaFields() {
            return this.sensitiveMetaFields;
        }

        @NotNull
        public final String getStyles() {
            return this.styles;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v16, types: [int] */
        /* JADX WARN: Type inference failed for: r2v19, types: [int] */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v29 */
        public int hashCode() {
            String str = this.handle;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.cluster;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.greetings;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.styles;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.language;
            int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            Map<String, Object> map = this.metaFields;
            int iHashCode6 = (iHashCode5 + (map != null ? map.hashCode() : 0)) * 31;
            Map<String, Object> map2 = this.sensitiveMetaFields;
            int iHashCode7 = (iHashCode6 + (map2 != null ? map2.hashCode() : 0)) * 31;
            boolean z11 = this.acceptThirdPartyCookies;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int i11 = (((iHashCode7 + r11) * 31) + this.loadTimeoutMillis) * 31;
            String str6 = this.deviceToken;
            return i11 + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Settings(handle=" + this.handle + ", cluster=" + this.cluster + ", greetings=" + this.greetings + ", styles=" + this.styles + ", language=" + this.language + ", metaFields=" + this.metaFields + ", sensitiveMetaFields=" + this.sensitiveMetaFields + ", acceptThirdPartyCookies=" + this.acceptThirdPartyCookies + ", loadTimeoutMillis=" + this.loadTimeoutMillis + ", deviceToken=" + this.deviceToken + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            parcel.writeString(this.handle);
            parcel.writeString(this.cluster);
            parcel.writeString(this.greetings);
            parcel.writeString(this.styles);
            parcel.writeString(this.language);
            Map<String, Object> map = this.metaFields;
            parcel.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeValue(entry.getValue());
            }
            Map<String, Object> map2 = this.sensitiveMetaFields;
            parcel.writeInt(map2.size());
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeValue(entry2.getValue());
            }
            parcel.writeInt(this.acceptThirdPartyCookies ? 1 : 0);
            parcel.writeInt(this.loadTimeoutMillis);
            parcel.writeString(this.deviceToken);
        }
    }

    /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$a */
    /* JADX INFO: compiled from: AdaEmbedView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"support/ada/embed/widget/AdaEmbedView$a", "Landroid/webkit/DownloadListener;", "", "url", C33812n7.f71057p, "contentDisposition", TXVodConstants.VOD_KEY_MIMETYPE, "", "contentLength", "", "onDownloadStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class C44552a implements DownloadListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f98814a;

        public C44552a(Context context) {
            this.f98814a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(@Nullable String url, @Nullable String userAgent, @Nullable String contentDisposition, @Nullable String mimetype, long contentLength) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
            request.addRequestHeader(HttpHeaders.COOKIE, CookieManager.getInstance().getCookie(url));
            request.addRequestHeader("User-Agent", userAgent);
            request.setDescription("Downloading requested file....");
            request.setMimeType(mimetype);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(url, contentDisposition, mimetype));
            request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
            request.setAllowedOverMetered(true);
            request.setAllowedOverRoaming(false);
            request.setRequiresCharging(false);
            request.setRequiresDeviceIdle(false);
            request.setVisibleInDownloadsUi(true);
            Object systemService = this.f98814a.getSystemService("download");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.DownloadManager");
            }
            ((DownloadManager) systemService).enqueue(request);
        }
    }

    /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$b */
    /* JADX INFO: compiled from: AdaEmbedView.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$b;", "", "<init>", "(Lsupport/ada/embed/widget/AdaEmbedView;)V", "", "onLoadCallback", "()V", "onInitializeCallback", "chatFrameTimeoutCallback", "", "requestToken", "()Ljava/lang/String;", "eventStr", "eventCallback", "(Ljava/lang/String;)V", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
    public final class C44553b {

        /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$b$a */
        /* JADX INFO: compiled from: AdaEmbedView.kt */
        @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
        public static final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AdaEmbedView.this.m98619d();
            }
        }

        /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$b$b */
        /* JADX INFO: compiled from: AdaEmbedView.kt */
        @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
        public static final class b implements Runnable {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f98818c;

            public b(String str) {
                this.f98818c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Event eventFrom = Event.INSTANCE.from(this.f98818c);
                if (Intrinsics.areEqual(eventFrom.getEventName(), "adaDownloadTranscript")) {
                    JSONObject jSONObject = new JSONObject(this.f98818c);
                    AdaEmbedView adaEmbedView = AdaEmbedView.this;
                    String strOptString = jSONObject.optString("name");
                    Intrinsics.checkExpressionValueIsNotNull(strOptString, "eventObject.optString(\"name\")");
                    String strOptString2 = jSONObject.optString("url");
                    Intrinsics.checkExpressionValueIsNotNull(strOptString2, "eventObject.optString(\"url\")");
                    adaEmbedView.m98620e(strOptString, strOptString2);
                    return;
                }
                HashSet hashSet = (HashSet) AdaEmbedView.this.eventCallbacks.get(eventFrom.getEventName());
                if (hashSet != null) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(eventFrom);
                    }
                }
                HashSet hashSet2 = (HashSet) AdaEmbedView.this.eventCallbacks.get(ProxyConfig.MATCH_ALL_SCHEMES);
                if (hashSet2 != null) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        ((Function1) it2.next()).invoke(eventFrom);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$b$c */
        /* JADX INFO: compiled from: AdaEmbedView.kt */
        @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
        public static final class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AdaEmbedView.this.m98622g();
            }
        }

        /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$b$d */
        /* JADX INFO: compiled from: AdaEmbedView.kt */
        @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
        public static final class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AdaEmbedView.this.m98624i();
            }
        }

        public C44553b() {
        }

        @JavascriptInterface
        public final void chatFrameTimeoutCallback() {
            AdaEmbedView.this.mainHandler.post(new a());
        }

        @JavascriptInterface
        public final void eventCallback(@NotNull String eventStr) {
            AdaEmbedView.this.mainHandler.post(new b(eventStr));
        }

        @JavascriptInterface
        public final void onInitializeCallback() {
            AdaEmbedView.this.mainHandler.post(new c());
        }

        @JavascriptInterface
        public final void onLoadCallback() {
            AdaEmbedView.this.mainHandler.post(new d());
        }

        @JavascriptInterface
        @Nullable
        public final String requestToken() {
            Function0<String> zdChatterAuthCallback = AdaEmbedView.this.getZdChatterAuthCallback();
            if (zdChatterAuthCallback != null) {
                return zdChatterAuthCallback.invoke();
            }
            Log.w(C44553b.class.getSimpleName(), new IllegalArgumentException("Auth token callback is not provided!"));
            return null;
        }
    }

    /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$c */
    /* JADX INFO: compiled from: AdaEmbedView.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, m90084d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$c;", "", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "valueCallback", "<init>", "(Landroid/webkit/ValueCallback;)V", "uri", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/net/Uri;)V", "Landroid/webkit/ValueCallback;", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class C44554c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final ValueCallback<Uri[]> valueCallback;

        /* JADX INFO: renamed from: a */
        public final void m98635a(@Nullable Uri uri) {
            this.valueCallback.onReceiveValue(uri != null ? new Uri[]{uri} : null);
        }

        public C44554c(@NotNull ValueCallback<Uri[]> valueCallback) {
            this.valueCallback = valueCallback;
        }
    }

    /* JADX INFO: renamed from: support.ada.embed.widget.AdaEmbedView$d */
    /* JADX INFO: compiled from: AdaEmbedView.kt */
    @Metadata(m90083d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J5\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m90084d2 = {"support/ada/embed/widget/AdaEmbedView$d", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/webkit/WebChromeClient$CustomViewCallback;", TUIConstants.TUIChat.CALL_BACK, "", "onShowCustomView", "(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V", "onHideCustomView", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/view/View;", "getMCustomView", "()Landroid/view/View;", "setMCustomView", "(Landroid/view/View;)V", "mCustomView", "", "b", "I", "getMOriginalSystemUiVisibility", "()I", "setMOriginalSystemUiVisibility", "(I)V", "mOriginalSystemUiVisibility", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class C44555d extends WebChromeClient {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public View mCustomView;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int mOriginalSystemUiVisibility;

        public C44555d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            AdaEmbedView.this.removeView(this.mCustomView);
            AdaEmbedView.this.setSystemUiVisibility(this.mOriginalSystemUiVisibility);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(@Nullable View view, @Nullable WebChromeClient.CustomViewCallback callback) {
            this.mCustomView = view;
            this.mOriginalSystemUiVisibility = AdaEmbedView.this.getSystemUiVisibility();
            AdaEmbedView.this.addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
            View view2 = this.mCustomView;
            if (view2 != null) {
                if (view2 == null) {
                    Intrinsics.throwNpe();
                }
                view2.setSystemUiVisibility(256);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(@Nullable WebView webView, @NotNull ValueCallback<Uri[]> filePathCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
            Boolean boolInvoke;
            Function1<C44554c, Boolean> filePickerCallback = AdaEmbedView.this.getFilePickerCallback();
            if (filePickerCallback == null || (boolInvoke = filePickerCallback.invoke(new C44554c(filePathCallback))) == null) {
                return false;
            }
            return boolInvoke.booleanValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AdaEmbedView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: g */
    public final void m98622g() {
        this.isAdaReady = true;
        Iterator<Map.Entry<String, InterfaceC4987a>> it = this.actionQueue.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().execute();
            it.remove();
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m98627m() {
        return true;
    }

    @Deprecated(message = "This method will be deprecated in the future, please upgrade to MetaFields.Builder.", replaceWith = @ReplaceWith(expression = "setMetaFields(MetaFields.Builder())", imports = {}))
    public final void setMetaFields(@NotNull Map<String, String> metaFields) {
        m98621f(new SetMetafieldsAction(this, metaFields));
    }

    @Deprecated(message = "This method will be deprecated in the future, please upgrade to MetaFields.Builder.", replaceWith = @ReplaceWith(expression = "setSensitiveMetaFields(MetaFields.Builder())", imports = {}))
    public final void setSensitiveMetaFields(@NotNull Map<String, String> sensitiveMetaFields) {
        m98621f(new SetSensitiveMetafieldsAction(this, sensitiveMetaFields));
    }

    public /* synthetic */ AdaEmbedView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m98618k(AdaEmbedView adaEmbedView, String str, String str2, MetaFields.C44548a c44548a, MetaFields.C44548a c44548a2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            c44548a = null;
        }
        if ((i11 & 8) != 0) {
            c44548a2 = null;
        }
        if ((i11 & 16) != 0) {
            bool = null;
        }
        adaEmbedView.m98625j(str, str2, c44548a, c44548a2, bool);
    }

    /* JADX INFO: renamed from: d */
    public final void m98619d() {
        Function0<Unit> function0M5a = this.webViewLoadingErrorCallback;
        if (function0M5a == null) {
            function0M5a = AdaWebViewClient.INSTANCE.m5a();
        }
        function0M5a.invoke();
    }

    /* JADX INFO: renamed from: e */
    public final void m98620e(@NotNull String fileName, @NotNull String data) {
        try {
            System.out.println((Object) fileName);
            System.out.println((Object) data);
            byte[] bArrDecode = Base64.decode(StringsKt.replace$default(data, "data:text/plain; charset=utf-8;base64,", "", false, 4, (Object) null), 0);
            Intrinsics.checkExpressionValueIsNotNull(bArrDecode, "Base64.decode(it, Base64.DEFAULT)");
            Intrinsics.checkExpressionValueIsNotNull(bArrDecode, "data.replace(\"data:text/…64.DEFAULT)\n            }");
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArrDecode);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                Object systemService = getContext().getSystemService("download");
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.DownloadManager");
                }
                ((DownloadManager) systemService).addCompletedDownload(fileName, fileName, true, AssetHelper.DEFAULT_MIME_TYPE, file.getAbsolutePath(), file.length(), true);
                Toast.makeText(getContext(), "Downloading File", 1).show();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m98621f(InterfaceC4987a action) {
        if (this.isAdaReady) {
            action.execute();
        } else {
            this.actionQueue.remove(action.key());
            this.actionQueue.put(action.key(), action);
        }
    }

    @Nullable
    public final Function1<C44554c, Boolean> getFilePickerCallback() {
        return this.filePickerCallback;
    }

    @Nullable
    public final Function0<Unit> getWebViewLoadingErrorCallback() {
        return this.webViewLoadingErrorCallback;
    }

    @Nullable
    public final Function0<String> getZdChatterAuthCallback() {
        return this.zdChatterAuthCallback;
    }

    /* JADX INFO: renamed from: i */
    public final void m98624i() {
        String str = this.handle;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handle");
        }
        String str2 = this.cluster;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cluster");
        }
        String str3 = this.greetings;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("greetings");
        }
        String str4 = this.styles;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styles");
        }
        String str5 = this.language;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("language");
        }
        Map<String, ? extends Object> map = this.metaFields;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metaFields");
        }
        JSONObject jSONObjectM82237c = C36715b.m82237c(map);
        Map<String, ? extends Object> map2 = this.sensitiveMetaFields;
        if (map2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sensitiveMetaFields");
        }
        String str6 = String.format("initializeEmbed('%s', '%s', '%s', '%s', '%s', %s, %s)", Arrays.copyOf(new Object[]{str, str2, str3, str4, str5, jSONObjectM82237c, C36715b.m82237c(map2)}, 7));
        Intrinsics.checkExpressionValueIsNotNull(str6, "java.lang.String.format(this, *args)");
        evaluateJavascript(str6, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m98625j(@Nullable String language, @Nullable String greetings, @Nullable MetaFields.C44548a metaFields, @Nullable MetaFields.C44548a sensitiveMetaFields, @Nullable Boolean resetChatHistory) {
        m98621f(new ResetAction(this, language, greetings, metaFields != null ? metaFields.m98628a() : null, sensitiveMetaFields != null ? sensitiveMetaFields.m98628a() : null, resetChatHistory));
    }

    /* JADX INFO: renamed from: l */
    public final void m98626l() {
        Function0<Unit> function0M5a = this.webViewLoadingErrorCallback;
        if (function0M5a == null) {
            function0M5a = AdaWebViewClient.INSTANCE.m5a();
        }
        setWebViewClient(new AdaWebViewClient(function0M5a, this.loadTimeoutMillis));
        setWebChromeClient(new C44555d());
    }

    public final void setDeviceToken(@NotNull String token) {
        m98621f(new SetDeviceTokenAction(this, token));
    }

    public final void setFilePickerCallback(@Nullable Function1<? super C44554c, Boolean> function1) {
        this.filePickerCallback = function1;
    }

    public final void setMetaFields(@NotNull MetaFields.C44548a metaFieldsBuilder) {
        m98621f(new SetMetafieldsAction(this, metaFieldsBuilder.m98628a()));
    }

    public final void setSensitiveMetaFields(@NotNull MetaFields.C44548a metaFieldsBuilder) {
        m98621f(new SetSensitiveMetafieldsAction(this, metaFieldsBuilder.m98628a()));
    }

    public final void setWebViewLoadingErrorCallback(@Nullable Function0<Unit> function0) {
        this.webViewLoadingErrorCallback = function0;
    }

    public final void setZdChatterAuthCallback(@Nullable Function0<String> function0) {
        this.zdChatterAuthCallback = function0;
    }

    @JvmOverloads
    public AdaEmbedView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Map<String, ? extends Object> mapEmptyMap;
        Map<String, ? extends Object> mapEmptyMap2;
        super(context, attributeSet);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.actionQueue = new LinkedHashMap<>();
        C44553b c44553b = new C44553b();
        this.adaInterface = c44553b;
        this.eventCallbacks = new HashMap<>();
        this.loadTimeoutMillis = 30000;
        if (attributeSet != null) {
            TypedArray typedArray = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.AdaEmbedView, 0, 0);
            try {
                Intrinsics.checkExpressionValueIsNotNull(typedArray, "typedArray");
                this.handle = C36715b.m82236b(typedArray, R$styleable.AdaEmbedView_ada_handle);
                this.cluster = C36715b.m82236b(typedArray, R$styleable.AdaEmbedView_ada_cluster);
                this.greetings = C36715b.m82236b(typedArray, R$styleable.AdaEmbedView_ada_greetings);
                this.styles = C36715b.m82236b(typedArray, R$styleable.AdaEmbedView_ada_styles);
                this.language = C36715b.m82236b(typedArray, R$styleable.AdaEmbedView_ada_language);
                this.loadTimeoutMillis = typedArray.getInteger(R$styleable.AdaEmbedView_ada_load_timeout, 30000);
                int resourceId = typedArray.getResourceId(R$styleable.AdaEmbedView_ada_metaFields, -1);
                if (resourceId != -1) {
                    InputStream inputStreamOpenRawResource = context.getResources().openRawResource(resourceId);
                    Intrinsics.checkExpressionValueIsNotNull(inputStreamOpenRawResource, "context.resources.openRawResource(metaFieldsResId)");
                    mapEmptyMap = C36715b.m82235a(inputStreamOpenRawResource);
                } else {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                this.metaFields = mapEmptyMap;
                int resourceId2 = typedArray.getResourceId(R$styleable.AdaEmbedView_ada_sensitiveMetaFields, -1);
                if (resourceId2 != -1) {
                    InputStream inputStreamOpenRawResource2 = context.getResources().openRawResource(resourceId2);
                    Intrinsics.checkExpressionValueIsNotNull(inputStreamOpenRawResource2, "context.resources.openRa…sensitiveMetaFieldsResId)");
                    mapEmptyMap2 = C36715b.m82235a(inputStreamOpenRawResource2);
                } else {
                    mapEmptyMap2 = MapsKt.emptyMap();
                }
                this.sensitiveMetaFields = mapEmptyMap2;
                setAcceptThirdPartyCookies(typedArray.getBoolean(R$styleable.AdaEmbedView_ada_accept_third_party_cookies, false));
                String string = typedArray.getString(R$styleable.AdaEmbedView_ada_device_token);
                if (string != null) {
                    Intrinsics.checkExpressionValueIsNotNull(string, "this");
                    setDeviceToken(string);
                }
                typedArray.recycle();
                String str = this.handle;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("handle");
                }
                this.isInitialized = str.length() > 0;
            } catch (Throwable th2) {
                typedArray.recycle();
                throw th2;
            }
        }
        boolean zM98627m = m98627m();
        if (zM98627m) {
            WebSettings settings = getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings, "settings");
            settings.setAllowUniversalAccessFromFileURLs(true);
        } else if (!zM98627m) {
            WebSettings settings2 = getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings2, "settings");
            settings2.setAllowFileAccessFromFileURLs(false);
            WebSettings settings3 = getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings3, "settings");
            settings3.setAllowUniversalAccessFromFileURLs(false);
        }
        WebSettings settings4 = getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings4, "settings");
        settings4.setJavaScriptEnabled(true);
        WebSettings settings5 = getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings5, "settings");
        settings5.setDomStorageEnabled(true);
        setDownloadListener(new C44552a(context));
        addJavascriptInterface(c44553b, "AdaAndroid");
        m98626l();
    }

    private final void setAcceptThirdPartyCookies(boolean accept) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, accept);
    }

    /* JADX INFO: renamed from: h */
    public final void m98623h(@NotNull Settings settings) {
        this.handle = settings.getHandle();
        this.cluster = settings.getCluster();
        this.greetings = settings.getGreetings();
        this.styles = settings.getStyles();
        this.language = settings.getLanguage();
        this.loadTimeoutMillis = settings.getLoadTimeoutMillis();
        this.metaFields = settings.getMetaFields();
        this.sensitiveMetaFields = settings.getSensitiveMetaFields();
        setDeviceToken(settings.getDeviceToken());
        setAcceptThirdPartyCookies(settings.getAcceptThirdPartyCookies());
        m98626l();
        if (isAttachedToWindow()) {
            loadUrl("file:///android_asset/embed.html");
        } else {
            this.isInitialized = true;
            this.isAdaReady = false;
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isInitialized && !this.isAdaReady) {
            loadUrl("file:///android_asset/embed.html");
        }
    }
}
