package com.kubi.quotefacade.knb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import b00.InterfaceC4437t;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.IActivityWithResult;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgePostPostCoin;
import com.kubi.sdk.util.ImagePickerActivity;
import com.kubi.sdk.util.ImagePickerHelper;
import com.kubi.utils.C27054i0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import xb0.C46126b;

/* JADX INFO: compiled from: KCFlutterBridgePostCallImpl.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\"\u0010\u000e\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0016J<\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\"\u0010\u000e\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0016J<\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\"\u0010\u000e\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0002J<\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\"\u0010\u000e\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0002J<\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001b2\"\u0010\u000e\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0002J<\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u001b2\"\u0010\u000e\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0002J\u001a\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J6\u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00052\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0016JD\u0010#\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\"\u0010\u000e\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006'"}, m90084d2 = {"Lcom/kubi/quotefacade/knb/KCFlutterBridgePostCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgePostCall;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getCoinsDisplayNames", "", "ctx", "Landroid/content/Context;", "coins", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "getCountPictureArray", BridgeParamKeyKt.MAX_COUNT, "", "tryStartImagePicker", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "tryToGetPermission", "startImagePicker", "activity", "Lcom/kubi/sdk/BaseActivity;", "", "startImagePickerForGenericActivity", "handleImagePickerResultInternal", "resultCode", "data", "Landroid/content/Intent;", "getFlutterViewDistanceToBottom", "sence", "searchPostCoins", "keyword", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgePostPostCoin;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgePostCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgePostCallImpl.kt\ncom/kubi/quotefacade/knb/KCFlutterBridgePostCallImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,334:1\n37#2:335\n36#2,3:336\n1869#3,2:339\n1617#3,9:341\n1869#3:350\n1870#3:352\n1626#3:353\n774#3:354\n865#3,2:355\n1869#3,2:357\n1869#3,2:359\n1617#3,9:368\n1869#3:377\n1870#3:379\n1626#3:380\n1869#3,2:381\n1#4:351\n1#4:378\n76#5,7:361\n35#6,4:383\n39#6:389\n44#7,2:387\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgePostCallImpl.kt\ncom/kubi/quotefacade/knb/KCFlutterBridgePostCallImpl\n*L\n134#1:335\n134#1:336,3\n220#1:339,2\n228#1:341,9\n228#1:350\n228#1:352\n228#1:353\n241#1:354\n241#1:355,2\n246#1:357,2\n250#1:359,2\n309#1:368,9\n309#1:377\n309#1:379\n309#1:380\n321#1:381,2\n228#1:351\n309#1:378\n266#1:361,7\n65#1:383,4\n65#1:389\n65#1:387,2\n*E\n"})
public final class KCFlutterBridgePostCallImpl implements InterfaceC4437t {

    /* JADX INFO: renamed from: d */
    public static int f42155d;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f42157a = "KCFlutterBridgePostCallImpl";

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f42153b = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<Integer, Function2<List<String>, ProtocolException, Unit>> f42154c = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy<Boolean> f42156e = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.knb.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(KCFlutterBridgePostCallImpl.m52202j());
        }
    });

    /* JADX INFO: compiled from: KCFlutterBridgePostCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R6\u0010\u000b\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/quotefacade/knb/KCFlutterBridgePostCallImpl$Companion;", "", "<init>", "()V", "REQUEST_CODE_PICK_IMAGES", "", "EXTRA_REQUEST_COUNT", "", "EXTRA_REQUEST_TYPE", "EXTRA_REQUEST_RESULT", "MEDIA_TYPE_IMAGE_ONLY", "imagePickerCallbacks", "", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", "callbackId", "fixFeedPostBug", "", "getFixFeedPostBug", "()Z", "fixFeedPostBug$delegate", "Lkotlin/Lazy;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m52211a() {
            return ((Boolean) KCFlutterBridgePostCallImpl.f42156e.getValue()).booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.knb.KCFlutterBridgePostCallImpl$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C22257a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: p */
    public static final void m52204p(KCFlutterBridgePostCallImpl kCFlutterBridgePostCallImpl, Intent intent) {
        kCFlutterBridgePostCallImpl.m52206m(-1, intent);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m52202j() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C22257a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("feed_post_permission_bug_fixed", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m52203k(KCFlutterBridgePostCallImpl kCFlutterBridgePostCallImpl, long j11, Function2 function2, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        if (f42153b.m52211a()) {
            kCFlutterBridgePostCallImpl.m52210r(fragmentActivity, j11, function2);
        } else {
            kCFlutterBridgePostCallImpl.m52209q(fragmentActivity, j11, function2);
        }
        return Unit.INSTANCE;
    }

    @Override // b00.InterfaceC4437t
    /* JADX INFO: renamed from: a */
    public void mo4215a(@NotNull Context ctx, @NotNull List<String> coins, @NotNull Function2<? super List<String>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(coins, "coins");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(null, null);
    }

    @Override // b00.InterfaceC4437t
    /* JADX INFO: renamed from: b */
    public void mo4216b(@NotNull Context ctx, @NotNull String keyword, long j11, @NotNull Function2<? super List<KCFlutterBridgePostPostCoin>, ? super ProtocolException, Unit> callback) {
        KCFlutterBridgePostPostCoin kCFlutterBridgePostPostCoin;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C44128b.m97259c(this.f42157a, "searchPostCoins keyword = " + keyword + "  maxCount = " + j11);
            List<CoinInfoEntity> listM85606G = C37890n.f85269a.m85606G(keyword, (int) j11);
            C44128b.m97259c(this.f42157a, "coinList length = " + listM85606G.size() + ' ');
            ArrayList<KCFlutterBridgePostPostCoin> arrayList = new ArrayList();
            for (CoinInfoEntity coinInfoEntity : listM85606G) {
                try {
                    String code = coinInfoEntity.getCode();
                    String str = "";
                    if (code == null) {
                        code = "";
                    }
                    String iconUrl = coinInfoEntity.getIconUrl();
                    if (iconUrl == null) {
                        iconUrl = "";
                    }
                    String currency = coinInfoEntity.getCurrency();
                    if (currency != null) {
                        str = currency;
                    }
                    kCFlutterBridgePostPostCoin = new KCFlutterBridgePostPostCoin(iconUrl, code, str);
                } catch (Exception e11) {
                    C44128b.m97259c(this.f42157a, "Failed to convert coin entity: " + e11.getMessage());
                    kCFlutterBridgePostPostCoin = null;
                }
                if (kCFlutterBridgePostPostCoin != null) {
                    arrayList.add(kCFlutterBridgePostPostCoin);
                }
            }
            for (KCFlutterBridgePostPostCoin kCFlutterBridgePostPostCoin2 : arrayList) {
                C44128b.m97259c(this.f42157a, "coin = " + kCFlutterBridgePostPostCoin2.getCoin() + ", icon = " + kCFlutterBridgePostPostCoin2.getIcon());
            }
            callback.invoke(arrayList, null);
        } catch (Exception e12) {
            C44128b.m97259c(this.f42157a, "searchPostCoins error: " + e12.getMessage());
            callback.invoke(null, new ProtocolException("Search coins failed: " + e12.getMessage(), null, null, false, 14, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00ad, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4437t
    /* JADX INFO: renamed from: c */
    public void mo4217c(@NotNull Context ctx, @NotNull String sence, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback) {
        KCFlutterBridgePostCallImpl kCFlutterBridgePostCallImpl;
        String str;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(sence, "sence");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T tM23692a = 0;
        LifecycleOwner lifecycleOwner = ctx instanceof LifecycleOwner ? (LifecycleOwner) ctx : null;
        if (lifecycleOwner != null) {
            if (C12573b.f21598a.m23696a()) {
                "feed_flutter_distance_result".length();
            }
            kCFlutterBridgePostCallImpl = this;
            str = sence;
            tM23692a = C12572a.m23692a(lifecycleOwner, false, new C22258x1c1aa341("feed_flutter_distance_result", null, kCFlutterBridgePostCallImpl, str, callback, objectRef));
        } else {
            kCFlutterBridgePostCallImpl = this;
            str = sence;
        }
        objectRef.element = tM23692a;
        C44128b.m97259c(kCFlutterBridgePostCallImpl.f42157a, "sence = " + str + ' ');
        int iHashCode = str.hashCode();
        if (iHashCode != -1418784282) {
            if (iHashCode != -486619363) {
                if (iHashCode == 1064129821 && str.equals("klineFeed")) {
                    C44128b.m97259c(kCFlutterBridgePostCallImpl.f42157a, "发送 FEED_FLUTTER_DISTANCE_KLINE_FEED_REQUEST 广播");
                    C12572a.m23695d("feed_flutter_distance_kline_feed_request", null, 0L, 6, null);
                } else {
                    C44128b.m97259c(kCFlutterBridgePostCallImpl.f42157a, "unknown sence: " + str + ", 发送 FEED_FLUTTER_DISTANCE_REQUEST 广播");
                    C12572a.m23695d("feed_flutter_distance_request", null, 0L, 6, null);
                }
            } else if (str.equals("homeFeed")) {
                C44128b.m97259c(kCFlutterBridgePostCallImpl.f42157a, "发送 FEED_FLUTTER_DISTANCE_HOME_FEED_REQUEST 广播");
                C12572a.m23695d("feed_flutter_distance_home_feed_request", null, 0L, 6, null);
            } else {
                C44128b.m97259c(kCFlutterBridgePostCallImpl.f42157a, "unknown sence: " + str + ", 发送 FEED_FLUTTER_DISTANCE_REQUEST 广播");
                C12572a.m23695d("feed_flutter_distance_request", null, 0L, 6, null);
            }
        } else if (str.equals("aiFeed")) {
            C44128b.m97259c(kCFlutterBridgePostCallImpl.f42157a, "发送 FEED_FLUTTER_DISTANCE_REQUEST 广播");
            C12572a.m23695d("feed_flutter_distance_request", null, 0L, 6, null);
        } else {
            C44128b.m97259c(kCFlutterBridgePostCallImpl.f42157a, "unknown sence: " + str + ", 发送 FEED_FLUTTER_DISTANCE_REQUEST 广播");
            C12572a.m23695d("feed_flutter_distance_request", null, 0L, 6, null);
        }
        C44128b.m97259c(kCFlutterBridgePostCallImpl.f42157a, "广播事件已发送，等待响应...");
    }

    @Override // b00.InterfaceC4437t
    /* JADX INFO: renamed from: d */
    public void mo4218d(@NotNull Context ctx, final long j11, @NotNull final Function2<? super List<String>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C44128b.m97259c(this.f42157a, "getCountPictureArray maxCount = " + j11 + ", context = " + ctx.getClass().getSimpleName());
            C42899b.m94073c(new Function1() { // from class: com.kubi.quotefacade.knb.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KCFlutterBridgePostCallImpl.m52203k(this.f42161b, j11, callback, (FragmentActivity) obj);
                }
            });
        } catch (Exception e11) {
            C44128b.m97259c(this.f42157a, "getCountPictureArray error: " + e11.getMessage());
            e11.printStackTrace();
            callback.invoke(null, new ProtocolException("Pick images failed: " + e11.getMessage(), null, null, false, 14, null));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getF42157a() {
        return this.f42157a;
    }

    /* JADX INFO: renamed from: m */
    public final void m52206m(int i11, Intent intent) {
        String strM66668h;
        C44128b.m97259c(this.f42157a, "handleImagePickerResultInternal: resultCode = " + i11);
        Map<Integer, Function2<List<String>, ProtocolException, Unit>> map = f42154c;
        List list = CollectionsKt.toList(map.values());
        map.clear();
        if (list.isEmpty()) {
            C44128b.m97259c(this.f42157a, "No callback found for image picker result");
            return;
        }
        try {
            if (i11 != -1 || intent == null) {
                C44128b.m97259c(this.f42157a, "用户取消了图片选择");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(CollectionsKt.emptyList(), null);
                }
                return;
            }
            List<Uri> parcelableArrayListExtra = intent.getParcelableArrayListExtra("EXTRA_REQUEST_RESULT");
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = CollectionsKt.emptyList();
            }
            C44128b.m97259c(this.f42157a, "获取到 " + parcelableArrayListExtra.size() + " 个 URI");
            ArrayList arrayList = new ArrayList();
            for (Uri uri : parcelableArrayListExtra) {
                try {
                    strM66668h = C27041f.m66668h(C27054i0.m66740d(BaseApplication.INSTANCE.get(), uri, true));
                    if (strM66668h.length() > 0) {
                        C44128b.m97259c(this.f42157a, "成功获取路径: " + strM66668h);
                    } else {
                        strM66668h = null;
                    }
                } catch (Exception e11) {
                    C44128b.m97259c(this.f42157a, "Failed to get path from uri " + uri + ": " + e11.getMessage());
                }
                if (strM66668h != null) {
                    arrayList.add(strM66668h);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            C44128b.m97259c(this.f42157a, "图片选择完成，共 " + arrayList2.size() + " 张有效图片");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((Function2) it2.next()).invoke(arrayList2, null);
            }
        } catch (Exception e12) {
            C44128b.m97259c(this.f42157a, "handleImagePickerResultInternal error: " + e12.getMessage());
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((Function2) it3.next()).invoke(null, new ProtocolException("Process images failed: " + e12.getMessage(), null, null, false, 14, null));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m52207n(BaseActivity baseActivity, int i11, Function2<? super List<String>, ? super ProtocolException, Unit> function2) {
        int i12 = f42155d + 1;
        f42155d = i12;
        f42154c.put(Integer.valueOf(i12), function2);
        ImagePickerHelper.m58396e(baseActivity, i11, 10086, null, 8, null);
        C44128b.m97259c(this.f42157a, "图片选择器已启动（BaseActivity），callbackId = " + i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final void m52208o(FragmentActivity fragmentActivity, int i11, Function2<? super List<String>, ? super ProtocolException, Unit> function2) {
        int i12 = f42155d + 1;
        f42155d = i12;
        f42154c.put(Integer.valueOf(i12), function2);
        Intent intent = new Intent(fragmentActivity, (Class<?>) ImagePickerActivity.class);
        intent.putExtra("EXTRA_REQUEST_COUNT", i11);
        intent.putExtra("EXTRA_REQUEST_TYPE", "ImageOnly");
        if (fragmentActivity instanceof IActivityWithResult) {
            C44128b.m97259c(this.f42157a, "使用 IActivityWithResult 启动图片选择器");
            ((IActivityWithResult) fragmentActivity).startActivityWithResult(intent, new Consumer() { // from class: com.kubi.quotefacade.knb.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KCFlutterBridgePostCallImpl.m52204p(this.f42164b, (Intent) obj);
                }
            });
        } else {
            C44128b.m97259c(this.f42157a, "使用 startActivityForResult 启动图片选择器");
            fragmentActivity.startActivityForResult(intent, 10086);
        }
        C44128b.m97259c(this.f42157a, "图片选择器已启动（FragmentActivity），callbackId = " + i12);
    }

    /* JADX INFO: renamed from: q */
    public final void m52209q(FragmentActivity fragmentActivity, long j11, Function2<? super List<String>, ? super ProtocolException, Unit> function2) {
        try {
            if (fragmentActivity instanceof BaseActivity) {
                C44128b.m97259c(this.f42157a, "[tryStartImagePicker] Using BaseActivity: " + fragmentActivity.getClass().getSimpleName());
                m52207n((BaseActivity) fragmentActivity, (int) j11, function2);
                return;
            }
            C44128b.m97259c(this.f42157a, "[tryStartImagePicker] Using FragmentActivity: " + fragmentActivity.getClass().getSimpleName());
            m52208o(fragmentActivity, (int) j11, function2);
        } catch (Exception e11) {
            C44128b.m97259c(this.f42157a, "[tryStartImagePicker] handler error: " + e11.getMessage());
            e11.printStackTrace();
            function2.invoke(null, new ProtocolException("Pick images failed: " + e11.getMessage(), null, null, false, 14, null));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m52210r(FragmentActivity fragmentActivity, long j11, Function2<? super List<String>, ? super ProtocolException, Unit> function2) {
        String[] strArr = (String[]) CollectionsKt.listOf("android.permission.READ_EXTERNAL_STORAGE").toArray(new String[0]);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), C41782z0.m91393c(), null, new KCFlutterBridgePostCallImpl$tryToGetPermission$1(new C46126b(fragmentActivity), strArr, this, fragmentActivity, j11, function2, null), 2, null);
    }
}
