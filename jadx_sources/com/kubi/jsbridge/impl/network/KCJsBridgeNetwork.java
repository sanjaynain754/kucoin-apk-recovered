package com.kubi.jsbridge.impl.network;

import android.content.Context;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.webkit.ProxyConfig;
import com.blankj.utilcode.util.C5276j;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.kubi.fingerprint.C12598b;
import com.kubi.host.HostManager;
import com.kubi.host.utils.HostUtils;
import com.kubi.kucoin.utils.LocateManager;
import com.kubi.kucoin.utils.NetUtils;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.util.C24281x;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import com.kubi.widget.web.service.IKWebService;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import d00.InterfaceC36579n;
import defpackage.NetDepend;
import gf.C37875a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import okhttp3.Authenticator;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p694vk.C45590s;
import p799yj.C46510b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import retrofit2.HttpException;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import ro.C44128b;
import tl.InterfaceC45041a;

/* JADX INFO: compiled from: KCJsBridgeNetwork.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 i2\u00020\u0001:\u0002ijB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0088\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0016JL\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0016Jp\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0016JA\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0002\b\u001aJ\u0094\u0001\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0016J\u0088\u0001\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0016J4\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u000bH\u0002J \u0010 \u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002JV\u0010$\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f2(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0002J)\u0010)\u001a\u00020*2\u0006\u0010&\u001a\u00020'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0001¢\u0006\u0002\b+J\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0002\b-J\u0019\u0010.\u001a\u0004\u0018\u00010\u00102\b\u0010/\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\b0J$\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u00102\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0002Jh\u00103\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f2(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0082@¢\u0006\u0002\u00104JA\u00105\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u000b062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0002\b7J0\u00108\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u001e\u00109\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100:060:H\u0002J|\u0010;\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f2(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0082@¢\u0006\u0002\u0010>J|\u0010?\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f2(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0082@¢\u0006\u0002\u0010>J\u0015\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020BH\u0001¢\u0006\u0002\bCJL\u0010D\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010\u00102(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0002JD\u0010F\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010\u00102(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0002JJ\u0010G\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020B2(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0002JB\u0010I\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020B2(\u0010\u0012\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0002J\u0015\u0010J\u001a\u00020\u00142\u0006\u0010H\u001a\u00020BH\u0001¢\u0006\u0002\bKJ%\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\u0006\u0010H\u001a\u00020BH\u0001¢\u0006\u0002\bMJ!\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010H\u001a\u00020BH\u0001¢\u0006\u0002\bOJ\r\u0010P\u001a\u00020\u0014H\u0001¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0002\bSJ$\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010E\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030UH\u0002J\u0015\u0010V\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0002\bWJ/\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0001¢\u0006\u0002\bYJ*\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002JQ\u0010[\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0001¢\u0006\u0002\b^JJ\u0010_\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002J!\u0010`\u001a\u00020'2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0001¢\u0006\u0002\baJ\u0015\u0010b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0002\bcJ,\u0010d\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020'2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010BH\u0002J(\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0010\u0010h\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0002¨\u0006k"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiNetworkModule;", "<init>", "()V", "request", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "url", FirebaseAnalytics.Param.METHOD, "data", "", "", "headers", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "getClientNetworkConfig", "httpRequest", "config", "mergeGetParams", ReportDataTable.COLUMN_PARAMS, "mergeGetParams$JsBridgeLib_googleRelease", "uploadFile", "file", "uploadFileV2", "readUploadV2ConfigMap", "key", "readUploadV2UploadType", "encodeUploadV2FormValue", "value", "resolveUploadV2Url", "executeUploadV2", "Lokhttp3/Request;", "isFullUrl", "", "customHeaders", "buildUploadV2Client", "Lokhttp3/OkHttpClient;", "buildUploadV2Client$JsBridgeLib_googleRelease", "redactUploadV2Url", "redactUploadV2Url$JsBridgeLib_googleRelease", "parseUploadV2ResponseBody", "rawBody", "parseUploadV2ResponseBody$JsBridgeLib_googleRelease", "buildCommonHeaders", "getValueEncoded", "proxyGet", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flattenGetParams", "Lkotlin/Pair;", "flattenGetParams$JsBridgeLib_googleRelease", "buildQueryUrl", "arrayParams", "", "proxyPost", "queries", TtmlNode.TAG_BODY, "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proxyDelete", "throwIfCancellation", "throwable", "", "throwIfCancellation$JsBridgeLib_googleRelease", "handleResult", DbParams.KEY_CHANNEL_RESULT, "handleUploadResult", "handleError", "e", "handleUploadError", "buildRequestProtocolException", "buildRequestProtocolException$JsBridgeLib_googleRelease", "parseHttpErrorBody", "parseHttpErrorBody$JsBridgeLib_googleRelease", "buildUploadErrorResponse", "buildUploadErrorResponse$JsBridgeLib_googleRelease", "buildInvalidUrlProtocolException", "buildInvalidUrlProtocolException$JsBridgeLib_googleRelease", "isInvalidUrl", "isInvalidUrl$JsBridgeLib_googleRelease", "convertResult", "Lcom/google/gson/internal/LinkedTreeMap;", "resolveUploadUrl", "resolveUploadUrl$JsBridgeLib_googleRelease", "buildUploadHeaders", "buildUploadHeaders$JsBridgeLib_googleRelease", "filterHeaders", "buildFuturesRecordBridgeTrace", "rawHeaders", "filteredHeaders", "buildFuturesRecordBridgeTrace$JsBridgeLib_googleRelease", "traceFuturesRecordBridgeDispatch", "isFormUrlEncoded", "isFormUrlEncoded$JsBridgeLib_googleRelease", "normalizeUrl", "normalizeUrl$JsBridgeLib_googleRelease", "track", "type", "success", "normalizeParams", "normalizeValue", "Companion", "INetworkApi", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJsBridgeNetwork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJsBridgeNetwork.kt\ncom/kubi/jsbridge/impl/network/KCJsBridgeNetwork\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1126:1\n1761#2,3:1127\n1869#2:1133\n1869#2,2:1134\n1870#2:1136\n1193#2,2:1138\n1267#2,4:1140\n295#2,2:1146\n1788#2,4:1148\n1788#2,4:1152\n1761#2,3:1156\n1252#2,4:1161\n1252#2,4:1167\n1563#2:1171\n1634#2,3:1172\n1#3:1130\n216#4,2:1131\n216#4,2:1144\n216#4,2:1175\n149#5:1137\n463#6:1159\n413#6:1160\n463#6:1165\n413#6:1166\n*S KotlinDebug\n*F\n+ 1 KCJsBridgeNetwork.kt\ncom/kubi/jsbridge/impl/network/KCJsBridgeNetwork\n*L\n424#1:1127,3\n656#1:1133\n657#1:1134,2\n656#1:1136\n882#1:1138,2\n882#1:1140,4\n937#1:1146,2\n940#1:1148,4\n943#1:1152,4\n972#1:1156,3\n1106#1:1161,4\n1121#1:1167,4\n1122#1:1171\n1122#1:1172,3\n620#1:1131,2\n913#1:1144,2\n504#1:1175,2\n831#1:1137\n1106#1:1159\n1106#1:1160\n1121#1:1165\n1121#1:1166\n*E\n"})
public final class KCJsBridgeNetwork implements InterfaceC36579n {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27452a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<String> f27453b = SetsKt.setOf((Object[]) new String[]{"v1/copyTrading/exchange/futures/orders", "v1/copyTrading/exchange/kumex-trade/fills", "v1/copyTrading/exchange/kumex-snapshot/realised-hist", "v1/copyTrading/exchange/kumex-snapshot/realised-hist-detail"});

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy<InterfaceC15261a> f27454c = LazyKt.lazy(new Function0() { // from class: com.kubi.jsbridge.impl.network.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KCJsBridgeNetwork.m31752z();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy<InterfaceC15261a> f27455d = LazyKt.lazy(new Function0() { // from class: com.kubi.jsbridge.impl.network.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KCJsBridgeNetwork.m31739n0();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy<Gson> f27456e = LazyKt.lazy(new Function0() { // from class: com.kubi.jsbridge.impl.network.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KCJsBridgeNetwork.m31732i0();
        }
    });

    /* JADX INFO: compiled from: KCJsBridgeNetwork.kt */
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u001f\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001cR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b$\u0010%¨\u0006'"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$Companion;", "", "<init>", "()V", "TAG", "", "METHOD_GET", "METHOD_POST", "METHOD_DELETE", "METHOD_UPLOAD", "UPLOAD_GENERIC_ERROR_CODE", "UPLOAD_WRITE_TIMEOUT_SECONDS", "", "UPLOAD_READ_TIMEOUT_SECONDS", "MAX_UPLOAD_ERROR_BODY_LENGTH", "", "INVALID_URL_MESSAGE", "FUTURES_RECORD_TRACE_TAG", "HEADER_SUB_UID", "FUTURES_RECORD_TRACE_PATHS", "", "HEADER_TOKEN_OVERRIDE", "HEADER_CONTENT_TYPE", "HEADER_CONTENT_TYPE_FORM", "api", "Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$INetworkApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$INetworkApi;", "api$delegate", "Lkotlin/Lazy;", "uploadApi", "getUploadApi", "uploadApi$delegate", "responseGson", "Lcom/google/gson/Gson;", "getResponseGson", "()Lcom/google/gson/Gson;", "responseGson$delegate", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC15261a m31794a() {
            return (InterfaceC15261a) KCJsBridgeNetwork.f27454c.getValue();
        }

        /* JADX INFO: renamed from: b */
        public final Gson m31795b() {
            return (Gson) KCJsBridgeNetwork.f27456e.getValue();
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC15261a m31796c() {
            return (InterfaceC15261a) KCJsBridgeNetwork.f27455d.getValue();
        }
    }

    /* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$a */
    /* JADX INFO: compiled from: KCJsBridgeNetwork.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JN\u0010\u0002\u001a\u00070\u0001¢\u0006\u0002\b\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0019\b\u0001\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00030\u0007H§@¢\u0006\u0002\u0010\tJk\u0010\n\u001a\u00070\u0001¢\u0006\u0002\b\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0019\b\u0001\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00030\u00072\u001b\b\u0001\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00030\u00072\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H§@¢\u0006\u0002\u0010\rJk\u0010\u000e\u001a\u00070\u0001¢\u0006\u0002\b\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0019\b\u0001\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00030\u00072\u001b\b\u0001\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00030\u00072\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H§@¢\u0006\u0002\u0010\rJe\u0010\u0010\u001a\u00070\u0001¢\u0006\u0002\b\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0019\b\u0001\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00030\u00072\u0015\b\u0001\u0010\u000f\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00030\u00112\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H§@¢\u0006\u0002\u0010\u0012Jk\u0010\u0013\u001a\u00070\u0001¢\u0006\u0002\b\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0019\b\u0001\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00030\u00072\u001b\b\u0001\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00030\u00072\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H§@¢\u0006\u0002\u0010\rJk\u0010\u0014\u001a\u00070\u0001¢\u0006\u0002\b\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0019\b\u0001\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00030\u00072\u001b\b\u0001\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00030\u00072\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H§@¢\u0006\u0002\u0010\rJe\u0010\u0015\u001a\u00070\u0001¢\u0006\u0002\b\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0019\b\u0001\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00030\u00072\u0015\b\u0001\u0010\u000f\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00030\u00112\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H§@¢\u0006\u0002\u0010\u0012JC\u0010\u0016\u001a\u00070\u0001¢\u0006\u0002\b\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H§@¢\u0006\u0002\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$INetworkApi;", "", "proxyGet", "Lkotlin/jvm/JvmSuppressWildcards;", "url", "", "headers", "", ReportDataTable.COLUMN_PARAMS, "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proxyPostForm", "queries", "fields", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proxyPostBody", "data", "proxyPostListBody", "", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proxyDeleteForm", "proxyDelete", "proxyDeleteListBody", "uploadFile", "parts", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC15261a {
        @POST
        @Nullable
        /* JADX INFO: renamed from: a */
        Object m31797a(@Url @NotNull String str, @QueryMap(encoded = true) @NotNull Map<String, Object> map, @Body @NotNull Map<String, Object> map2, @HeaderMap @NotNull Map<String, String> map3, @NotNull Continuation<Object> continuation);

        @Nullable
        @HTTP(hasBody = true, method = "DELETE")
        /* JADX INFO: renamed from: b */
        Object m31798b(@Url @NotNull String str, @QueryMap(encoded = true) @NotNull Map<String, Object> map, @Body @NotNull List<Object> list, @HeaderMap @NotNull Map<String, String> map2, @NotNull Continuation<Object> continuation);

        @FormUrlEncoded
        @POST
        @Nullable
        /* JADX INFO: renamed from: c */
        Object m31799c(@Url @NotNull String str, @QueryMap(encoded = true) @NotNull Map<String, Object> map, @FieldMap @NotNull Map<String, Object> map2, @HeaderMap @NotNull Map<String, String> map3, @NotNull Continuation<Object> continuation);

        @POST
        @Nullable
        @Multipart
        /* JADX INFO: renamed from: d */
        Object m31800d(@Url @NotNull String str, @HeaderMap @NotNull Map<String, String> map, @NotNull @Part List<MultipartBody.Part> list, @NotNull Continuation<Object> continuation);

        @GET
        @Nullable
        /* JADX INFO: renamed from: e */
        Object m31801e(@Url @NotNull String str, @HeaderMap @NotNull Map<String, String> map, @QueryMap @NotNull Map<String, Object> map2, @NotNull Continuation<Object> continuation);

        @FormUrlEncoded
        @Nullable
        @HTTP(hasBody = true, method = "DELETE")
        /* JADX INFO: renamed from: f */
        Object m31802f(@Url @NotNull String str, @QueryMap(encoded = true) @NotNull Map<String, Object> map, @FieldMap @NotNull Map<String, Object> map2, @HeaderMap @NotNull Map<String, String> map3, @NotNull Continuation<Object> continuation);

        @POST
        @Nullable
        /* JADX INFO: renamed from: g */
        Object m31803g(@Url @NotNull String str, @QueryMap(encoded = true) @NotNull Map<String, Object> map, @Body @NotNull List<Object> list, @HeaderMap @NotNull Map<String, String> map2, @NotNull Continuation<Object> continuation);

        @Nullable
        @HTTP(hasBody = true, method = "DELETE")
        /* JADX INFO: renamed from: h */
        Object m31804h(@Url @NotNull String str, @QueryMap(encoded = true) @NotNull Map<String, Object> map, @Body @NotNull Map<String, Object> map2, @HeaderMap @NotNull Map<String, String> map3, @NotNull Continuation<Object> continuation);
    }

    /* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C15262b extends TypeToken<Map<String, ? extends Object>> {
    }

    /* JADX INFO: renamed from: O */
    public final void m31766O(String str, String str2, Throwable th2, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2) {
        m31793l0(str, str2, false, th2);
        C19331c.m42836c(th2, null, 2, null);
        C44128b.m97262f("KCJsBridgeNetwork", "proxy" + str2 + " error: " + str, th2);
        function2.invoke(null, m31756D(th2));
    }

    @VisibleForTesting
    @Nullable
    /* JADX INFO: renamed from: Z */
    public final Object m31777Z(@Nullable String str) {
        Object objM103844constructorimpl;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(f27452a.m31795b().fromJson(str, Object.class));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                return Result.m103847exceptionOrNullimpl(objM103844constructorimpl) == null ? objM103844constructorimpl : str;
            }
        }
        return null;
    }

    @Override // d00.InterfaceC36579n
    /* JADX INFO: renamed from: a */
    public void mo31778a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String url, @NotNull Map<String, ? extends Object> file, @Nullable String str, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2) {
        UploadFilePartBuilder.UploadParamException uploadParamException;
        Map<String, ? extends Object> map2;
        final Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback = function2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m31771T(url)) {
            callback.invoke(null, new ProtocolException("-9001", null, "url 无效", false, 10, null));
            return;
        }
        String strM31789g0 = m31789g0(m31774W(url));
        boolean z11 = HttpUrl.INSTANCE.parse(strM31789g0) != null;
        try {
            Map<String, ? extends Object> mapM31785d0 = m31785d0(map, ReportDataTable.COLUMN_PARAMS);
            if (mapM31785d0 != null) {
                try {
                    if (Intrinsics.areEqual(source, KCTurboFileModuleImpl.SOURCE_RN)) {
                        mapM31785d0 = m31773V(mapM31785d0);
                    }
                    map2 = mapM31785d0;
                } catch (UploadFilePartBuilder.UploadParamException e11) {
                    uploadParamException = e11;
                    callback.invoke(null, new ProtocolException("-9001", uploadParamException, uploadParamException.getMessage(), false, 8, null));
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    m31768Q(m31788f0(strM31789g0), th, callback);
                    return;
                }
            } else {
                map2 = null;
            }
            final Map<String, String> mapM31763L = m31763L(m31785d0(map, "headers"));
            String strM31787e0 = m31787e0(map);
            UploadFileV2RequestBuilder uploadFileV2RequestBuilder = UploadFileV2RequestBuilder.f27474a;
            final Request requestM31822a = uploadFileV2RequestBuilder.m31822a(m31790h0(strM31789g0), uploadFileV2RequestBuilder.m31825d(file, str, strM31787e0, map2, mapM31763L, ctx.getContentResolver(), new KCJsBridgeNetwork$uploadFileV2$prepared$1(this)));
            try {
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                final boolean z12 = z11;
                try {
                    Function1 function1 = new Function1() { // from class: com.kubi.jsbridge.impl.network.f
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return KCJsBridgeNetwork.m31741o0(booleanRef, this, requestM31822a, z12, mapM31763L, callback, (FragmentActivity) obj2);
                        }
                    };
                    callback = callback;
                    C42899b.m94073c(function1);
                    if (booleanRef.element) {
                        return;
                    }
                    callback.invoke(null, new ProtocolException("-9002", null, "no available activity", false, 10, null));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    callback = callback;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            Throwable th5 = th;
            C44128b.m97262f("KCJsBridgeNetwork", "uploadFileV2 dispatch error: " + m31788f0(strM31789g0), th5);
            callback.invoke(null, new ProtocolException("-9002", th5, th5.getMessage(), false, 8, null));
        } catch (UploadFilePartBuilder.UploadParamException e12) {
            uploadParamException = e12;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // d00.InterfaceC36579n
    /* JADX INFO: renamed from: b */
    public void mo31780b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String url, @NotNull String method, @Nullable Map<String, ? extends Object> map, @Nullable Map<String, ? extends Object> map2, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m31771T(url)) {
            callback.invoke(null, m31754B());
        } else {
            C41696j.m91104d(C37875a.f85250c, null, null, new KCJsBridgeNetwork$request$1(map, source, this, map2, url, method, callback, null), 3, null);
        }
    }

    @Override // d00.InterfaceC36579n
    /* JADX INFO: renamed from: d */
    public void mo31784d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String url, @NotNull Map<String, ? extends Object> file, @Nullable Map<String, ? extends Object> map, @Nullable Map<String, ? extends Object> map2, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Throwable th2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strM31774W = m31774W(url);
        if (StringsKt.isBlank(strM31774W)) {
            callback.invoke(null, new ProtocolException("-9001", null, "url 无效", false, 10, null));
            return;
        }
        String strM31789g0 = m31789g0(strM31774W);
        try {
            try {
                UploadFilePartBuilder uploadFilePartBuilder = UploadFilePartBuilder.f27457a;
                MultipartBody.Part partM31806a = uploadFilePartBuilder.m31806a(file, ctx.getContentResolver());
                if (map == null) {
                    try {
                        map = MapsKt.emptyMap();
                    } catch (Throwable th3) {
                        th2 = th3;
                        m31768Q(strM31789g0, th2, callback);
                        return;
                    }
                }
                if (Intrinsics.areEqual(source, KCTurboFileModuleImpl.SOURCE_RN)) {
                    map = m31773V(map);
                }
                List listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf(partM31806a), (Iterable) uploadFilePartBuilder.m31807b(map));
                try {
                    C41696j.m91104d(C37875a.f85250c, null, null, new KCJsBridgeNetwork$uploadFile$1(strM31789g0, m31758F(map2), listPlus, this, callback, null), 3, null);
                } catch (Throwable th4) {
                    m31768Q(strM31789g0, th4, callback);
                }
            } catch (Throwable th5) {
                th2 = th5;
            }
        } catch (UploadFilePartBuilder.UploadParamException e11) {
            callback.invoke(null, new ProtocolException("-9001", e11, e11.getMessage(), false, 8, null));
        }
    }

    /* JADX INFO: renamed from: H */
    public static final Response m31727H(Map map, Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        for (Map.Entry entry : map.entrySet()) {
            builderNewBuilder.header((String) entry.getKey(), (String) entry.getValue());
        }
        return chain.proceed(builderNewBuilder.build());
    }

    /* JADX INFO: renamed from: i0 */
    public static final Gson m31732i0() {
        return new Gson();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m31737m0(KCJsBridgeNetwork kCJsBridgeNetwork, String str, String str2, boolean z11, Throwable th2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            th2 = null;
        }
        kCJsBridgeNetwork.m31793l0(str, str2, z11, th2);
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m31741o0(Ref.BooleanRef booleanRef, KCJsBridgeNetwork kCJsBridgeNetwork, Request request, boolean z11, Map map, Function2 function2, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        booleanRef.element = true;
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), C42911a.m94120b(), null, new KCJsBridgeNetwork$uploadFileV2$1$1(kCJsBridgeNetwork, request, z11, map, function2, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final Map<String, Object> m31753A(Context context, String str) {
        Object objM103844constructorimpl;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("LANG", MultiLanguageManager.f46811g.getLocalString());
        linkedHashMap.put("X-SITE", SiteType.INSTANCE.getCurrentSiteType());
        linkedHashMap.put("X-APP-VERSION", C45590s.f102687a.m100675Z());
        linkedHashMap.put("X-APP-MODE", AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null).getModeType());
        linkedHashMap.put("X-DEVICE", Build.MODEL);
        linkedHashMap.put("X-DEVICE-NO", C5276j.m6247f());
        linkedHashMap.put("X-SYSTEM", "android");
        linkedHashMap.put("X-SYSTEM-VERSION", Build.VERSION.RELEASE);
        linkedHashMap.put("X-IP", C24281x.m58545a(context));
        linkedHashMap.put("X-IS-CN", String.valueOf(C46510b.m102600d()));
        linkedHashMap.put("X-APP-TOKEN", C27041f.m66668h(UserInfo.a.l()));
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IKWebService.f55226a.get().mo67357d());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        linkedHashMap.put(HttpHeaders.COOKIE, C27041f.m66668h((String) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl)));
        linkedHashMap.put("X-REQUEST-TIME", String.valueOf(System.currentTimeMillis()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("android/");
        C45590s c45590s = C45590s.f102687a;
        sb2.append(c45590s.m100675Z());
        linkedHashMap.put("User-Agent", sb2.toString());
        String country = Locale.getDefault().getCountry();
        if (country == null) {
            country = "";
        }
        linkedHashMap.put("Locale", country);
        linkedHashMap.put("X-APP-bundlename", c45590s.m100661L());
        String str2 = Build.FINGERPRINT;
        linkedHashMap.put("X-DEVICE-INFO", str2 != null ? str2 : "");
        if (c45590s.m100677b0().length() > 0) {
            linkedHashMap.put("X-VERSION", c45590s.m100677b0());
        }
        HostUtils hostUtils = HostUtils.a;
        String strB = hostUtils.b(context);
        if (strB != null) {
            linkedHashMap.put("mcc", strB);
        }
        String strC = hostUtils.c(context);
        if (strC != null) {
            linkedHashMap.put("mnc", strC);
        }
        LocateManager.LocationData locationDataM33101d = LocateManager.f28544a.m33101d();
        if (locationDataM33101d != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(locationDataM33101d.getLongitude());
            sb3.append(',');
            sb3.append(locationDataM33101d.getLatitude());
            linkedHashMap.put("Location", sb3.toString());
        }
        Pair<String, String> pairM23781i = C12598b.f21975a.m23781i("safe_validation_h5");
        if (pairM23781i != null) {
            linkedHashMap.put(pairM23781i.getFirst(), pairM23781i.getSecond());
        }
        if (NetUtils.f28615a.m33205a()) {
            InterfaceC45041a interfaceC45041aM4057b = NetDepend.f3835a.m4057b();
            linkedHashMap.put("X-UTM-MEDIUM", interfaceC45041aM4057b.mo88942c());
            linkedHashMap.put("X-ADS-CLICK-ID", interfaceC45041aM4057b.mo88941b());
            linkedHashMap.put("X-UTM-CAMPAIGN", m31765N(interfaceC45041aM4057b.mo88940a()));
            linkedHashMap.put("X-UTM-SOURCE", m31765N(interfaceC45041aM4057b.mo88943d()));
            linkedHashMap.put("X-ADS-CLIENT-ID", m31765N(interfaceC45041aM4057b.getAppInstanceId()));
        }
        return linkedHashMap;
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: B */
    public final ProtocolException m31754B() {
        return new ProtocolException("-9001", null, MapsKt.linkedMapOf(TuplesKt.m90091to("msg", "URL invalid"), TuplesKt.m90091to("success", Boolean.FALSE), TuplesKt.m90091to("code", "-9001")), false, 10, null);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: D */
    public final ProtocolException m31756D(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Object objM31776Y = m31776Y(e11);
        if (objM31776Y == null) {
            objM31776Y = e11.getMessage();
        }
        return new ProtocolException("-9002", e11, objM31776Y, false, 8, null);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: E */
    public final Map<String, Object> m31757E(@NotNull Throwable e11) {
        String str;
        String message;
        Intrinsics.checkNotNullParameter(e11, "e");
        ApiException apiException = e11 instanceof ApiException ? (ApiException) e11 : null;
        Pair pairM90091to = TuplesKt.m90091to("success", Boolean.FALSE);
        if (apiException == null || (str = apiException.code) == null) {
            str = OtcAd.KYC_NOT_PASS;
        }
        Pair pairM90091to2 = TuplesKt.m90091to("code", str.toString());
        if ((apiException == null || (message = apiException.getMessage()) == null) && (message = e11.getMessage()) == null) {
            message = "";
        }
        return MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("msg", message));
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: F */
    public final Map<String, String> m31758F(@Nullable Map<String, ? extends Object> map) {
        return UploadFilePartBuilder.f27457a.m31815k(m31763L(map));
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: G */
    public final OkHttpClient m31759G(boolean z11, @NotNull final Map<String, String> customHeaders) {
        Intrinsics.checkNotNullParameter(customHeaders, "customHeaders");
        OkHttpClient.Builder builderNewBuilder = C42597a.m93389e().newBuilder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder timeout = builderNewBuilder.writeTimeout(90L, timeUnit).readTimeout(60L, timeUnit);
        if (z11) {
            timeout.interceptors().clear();
            timeout.networkInterceptors().clear();
            timeout.cookieJar(CookieJar.NO_COOKIES);
            timeout.authenticator(Authenticator.NONE);
        } else if (!customHeaders.isEmpty()) {
            timeout.addInterceptor(new Interceptor() { // from class: com.kubi.jsbridge.impl.network.g
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    return KCJsBridgeNetwork.m31727H(customHeaders, chain);
                }
            });
        }
        return timeout.build();
    }

    /* JADX INFO: renamed from: J */
    public final String m31761J(Object obj) {
        return ((obj instanceof Map) || (obj instanceof List)) ? C27099x.m66919i(obj, false, 2, null) : obj.toString();
    }

    /* JADX INFO: renamed from: L */
    public final Map<String, String> m31763L(Map<String, ? extends Object> map) {
        if (map == null || map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (StringsKt.equals(key, "X-APP-TOKEN-OVERRIDE", true)) {
                linkedHashMap.put("X-APP-TOKEN-OVERRIDE", value.toString());
            } else {
                linkedHashMap.put(key, value.toString());
            }
        }
        return linkedHashMap;
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: M */
    public final Pair<Map<String, Object>, String> m31764M(@NotNull String url, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                List listFilterNotNull = CollectionsKt.filterNotNull((Iterable) value);
                if (!listFilterNotNull.isEmpty()) {
                    arrayList.add(TuplesKt.m90091to(key, listFilterNotNull));
                }
            } else {
                linkedHashMap.put(key, value);
            }
        }
        return arrayList.isEmpty() ? TuplesKt.m90091to(linkedHashMap, url) : TuplesKt.m90091to(linkedHashMap, m31755C(url, arrayList));
    }

    /* JADX INFO: renamed from: N */
    public final String m31765N(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return "null";
        }
        String strReplace$default = StringsKt.replace$default(str, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "", false, 4, (Object) null);
        int length = strReplace$default.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = strReplace$default.charAt(i11);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                String strEncode = URLEncoder.encode(strReplace$default, "UTF-8");
                Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
                return strEncode;
            }
        }
        return strReplace$default;
    }

    /* JADX INFO: renamed from: P */
    public final void m31767P(String str, String str2, Object obj, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2) {
        if (obj instanceof LinkedTreeMap) {
            m31737m0(this, str, str2, true, null, 8, null);
            function2.invoke(m31760I((LinkedTreeMap) obj), null);
            return;
        }
        m31737m0(this, str, str2, false, null, 8, null);
        function2.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, null, str2 + " return empty", false, 10, null));
    }

    /* JADX INFO: renamed from: Q */
    public final void m31768Q(String str, Throwable th2, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2) {
        m31793l0(str, "UPLOAD", false, th2);
        C44128b.m97262f("KCJsBridgeNetwork", "proxyUPLOAD error: " + str, th2);
        function2.invoke(m31757E(th2), null);
    }

    /* JADX INFO: renamed from: R */
    public final void m31769R(String str, Object obj, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2) {
        m31737m0(this, str, "UPLOAD", true, null, 8, null);
        function2.invoke(UploadFileResultConverter.f27473a.m31821a(obj), null);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: S */
    public final boolean m31770S(@NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Set<Map.Entry<String, String>> setEntrySet = headers.entrySet();
        if (setEntrySet != null && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (StringsKt.equals(str, "Content-Type", true) && StringsKt.contains((CharSequence) str2, (CharSequence) "application/x-www-form-urlencoded", true)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: T */
    public final boolean m31771T(@NotNull String url) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(url, "url");
        String string = StringsKt.trim((CharSequence) url).toString();
        if (StringsKt.isBlank(string)) {
            return true;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new URI(string));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        URI uri = (URI) objM103844constructorimpl;
        if (uri == null) {
            return true;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        return !(StringsKt.equals(scheme, "http", true) || StringsKt.equals(scheme, ProxyConfig.MATCH_HTTPS, true)) || HttpUrl.INSTANCE.parse(string) == null;
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: U */
    public final Map<String, Object> m31772U(@NotNull Map<String, ? extends Object> params, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(data, "data");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(params);
        linkedHashMap.putAll(data);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: V */
    public final Map<String, Object> m31773V(Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), m31775X(entry.getValue()));
        }
        return linkedHashMap;
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: W */
    public final String m31774W(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String string = StringsKt.trim((CharSequence) url).toString();
        return (StringsKt.startsWith(string, "http://", true) || StringsKt.startsWith(string, "https://", true)) ? string : StringsKt.trimStart(string, '/');
    }

    /* JADX INFO: renamed from: X */
    public final Object m31775X(Object obj) {
        Object objM31775X;
        if (obj instanceof Double) {
            Number number = (Number) obj;
            if (Double.isNaN(number.doubleValue()) || Double.isInfinite(number.doubleValue()) || number.doubleValue() != ((long) number.doubleValue())) {
                return obj;
            }
            double dDoubleValue = number.doubleValue();
            if (-2.147483648E9d <= dDoubleValue && dDoubleValue <= 2.147483647E9d) {
                return Integer.valueOf((int) number.doubleValue());
            }
            double dDoubleValue2 = number.doubleValue();
            return (-9.223372036854776E18d > dDoubleValue2 || dDoubleValue2 > 9.223372036854776E18d) ? obj : Long.valueOf((long) number.doubleValue());
        }
        if (obj instanceof Map) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), m31775X(entry.getValue()));
            }
            return linkedHashMap;
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Object obj2 : iterable) {
                if (obj2 != null && (objM31775X = m31775X(obj2)) != null) {
                    obj2 = objM31775X;
                }
                arrayList.add(obj2);
            }
            return arrayList;
        }
        return obj;
    }

    @VisibleForTesting
    @Nullable
    /* JADX INFO: renamed from: Y */
    public final Map<String, Object> m31776Y(@NotNull Throwable e11) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        ResponseBody responseBodyErrorBody;
        Intrinsics.checkNotNullParameter(e11, "e");
        HttpException httpException = e11 instanceof HttpException ? (HttpException) e11 : null;
        if (httpException == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            retrofit2.Response<?> response = httpException.response();
            objM103844constructorimpl = Result.m103844constructorimpl((response == null || (responseBodyErrorBody = response.errorBody()) == null) ? null : responseBodyErrorBody.string());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String str = (String) objM103844constructorimpl;
        if (str == null) {
            return null;
        }
        if (StringsKt.isBlank(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl2 = Result.m103844constructorimpl((Map) C27099x.m66914d(str, new C15262b().getType()));
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl2)) {
            objM103844constructorimpl2 = null;
        }
        Map<String, Object> map = (Map) objM103844constructorimpl2;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return map;
    }

    @Override // d00.InterfaceC36579n
    /* JADX INFO: renamed from: c */
    public void mo31782c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("baseURL", HostManager.a.z());
            linkedHashMap.put("commonHeaders", m31753A(ctx, source));
            callback.invoke(linkedHashMap, null);
        } catch (Throwable th2) {
            C44128b.m97262f("KCJsBridgeNetwork", "getClientNetworkConfig error", th2);
            callback.invoke(null, new ProtocolException("-9002", th2, th2.getMessage(), false, 8, null));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final Map<String, Object> m31785d0(Map<String, ? extends Object> map, String str) throws UploadFilePartBuilder.UploadParamException {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        if (obj instanceof Map) {
            Map<String, Object> map2 = (Map) obj;
            Set<String> setKeySet = map2.keySet();
            if (setKeySet != null && setKeySet.isEmpty()) {
                return map2;
            }
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof String) {
                }
            }
            return map2;
        }
        throw new UploadFilePartBuilder.UploadParamException("config." + str + " 必须是 object");
    }

    @Override // d00.InterfaceC36579n
    /* JADX INFO: renamed from: e */
    public void mo31786e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String url, @NotNull String method, @NotNull Map<String, ? extends Object> config, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m31771T(url)) {
            callback.invoke(null, m31754B());
        } else {
            C41696j.m91104d(C37875a.f85250c, null, null, new KCJsBridgeNetwork$httpRequest$1(config, source, this, url, method, callback, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final String m31787e0(Map<String, ? extends Object> map) throws UploadFilePartBuilder.UploadParamException {
        Object obj;
        if (map == null || (obj = map.get("uploadType")) == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new UploadFilePartBuilder.UploadParamException("config.uploadType 必须是 string");
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final String m31788f0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return StringsKt.substringBefore$default(StringsKt.substringBefore$default(url, '?', (String) null, 2, (Object) null), '#', (String) null, 2, (Object) null);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final String m31789g0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) url, '#', 0, false, 6, (Object) null);
        if (iIndexOf$default < 0) {
            return url;
        }
        String strSubstring = url.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: h0 */
    public final String m31790h0(String str) throws UploadFilePartBuilder.UploadParamException {
        String url;
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(str);
        if (httpUrl != null && (url = httpUrl.getUrl()) != null) {
            return url;
        }
        HttpUrl httpUrlResolve = C42597a.m93386b().baseUrl().resolve(str);
        if (httpUrlResolve != null) {
            return httpUrlResolve.getUrl();
        }
        throw new UploadFilePartBuilder.UploadParamException("url 无效");
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j0 */
    public final void m31791j0(@NotNull Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof CancellationException) {
            throw throwable;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final InterfaceC15261a m31739n0() {
        Retrofit retrofitM93386b = C42597a.m93386b();
        OkHttpClient.Builder builderNewBuilder = C42597a.m93389e().newBuilder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (InterfaceC15261a) retrofitM93386b.newBuilder().client(builderNewBuilder.writeTimeout(90L, timeUnit).readTimeout(60L, timeUnit).build()).build().create(InterfaceC15261a.class);
    }

    /* JADX INFO: renamed from: z */
    public static final InterfaceC15261a m31752z() {
        return (InterfaceC15261a) C42597a.m93386b().create(InterfaceC15261a.class);
    }

    /* JADX INFO: renamed from: C */
    public final String m31755C(String str, List<? extends Pair<String, ? extends List<? extends Object>>> list) {
        HttpUrl.Builder builderNewBuilder;
        HttpUrl httpUrlResolve = C42597a.m93386b().baseUrl().resolve(str);
        if (httpUrlResolve != null && (builderNewBuilder = httpUrlResolve.newBuilder()) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str2 = (String) pair.component1();
                Iterator it2 = ((List) pair.component2()).iterator();
                while (it2.hasNext()) {
                    builderNewBuilder.addQueryParameter(str2, it2.next().toString());
                }
            }
            HttpUrl httpUrlBuild = builderNewBuilder.build();
            if (httpUrlBuild != null) {
                return httpUrlBuild.getUrl();
            }
            return str;
        }
        return str;
    }

    /* JADX INFO: renamed from: I */
    public final Map<String, Object> m31760I(LinkedTreeMap<?, ?> linkedTreeMap) {
        Set<Map.Entry<?, ?>> setEntrySet = linkedTreeMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.String");
            String str = (String) key;
            Object value = entry.getValue();
            if (value == null) {
                value = "";
            }
            Pair pairM90091to = TuplesKt.m90091to(str, value);
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: K */
    public final void m31762K(Request request, boolean z11, Map<String, String> map, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2) {
        String strString;
        OkHttpClient okHttpClientM31759G = m31759G(z11, map);
        String strM31788f0 = m31788f0(request.url().getUrl());
        try {
            Response responseExecute = FirebasePerfOkHttpClient.execute(okHttpClientM31759G.newCall(request));
            try {
                ResponseBody responseBodyBody = responseExecute.body();
                if (responseBodyBody != null) {
                    strString = responseBodyBody.string();
                } else {
                    strString = null;
                }
                if (!responseExecute.isSuccessful()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("HTTP ");
                    sb2.append(responseExecute.code());
                    if (strString != null && !StringsKt.isBlank(strString)) {
                        sb2.append(": ");
                        sb2.append(StringsKt.take(strString, 2000));
                    }
                    throw new IOException(sb2.toString());
                }
                m31769R(strM31788f0, m31777Z(strString), function2);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(responseExecute, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(responseExecute, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            m31768Q(strM31788f0, th4, function2);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final Object m31779a0(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, String> map3, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new KCJsBridgeNetwork$proxyDelete$2(map2, str, map, map3, this, function2, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public final Object m31781b0(String str, Map<String, ? extends Object> map, Map<String, String> map2, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new KCJsBridgeNetwork$proxyGet$2(this, str, map, map2, function2, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c0 */
    public final Object m31783c0(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, String> map3, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new KCJsBridgeNetwork$proxyPost$2(map2, str, map, map3, this, function2, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m31792k0(String str, String str2, String str3, Map<String, ? extends Object> map, Map<String, String> map2) {
    }

    /* JADX INFO: renamed from: l0 */
    public final void m31793l0(String str, String str2, boolean z11, Throwable th2) {
    }
}
