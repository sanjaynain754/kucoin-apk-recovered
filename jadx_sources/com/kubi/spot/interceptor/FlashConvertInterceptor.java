package com.kubi.spot.interceptor;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.mvi.common.MviExKt;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.Constants;
import com.kubi.spot.business.delegation.assets.AccountItemEntity;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27041f;
import id.C38519a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k20.InterfaceC40871a;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p311hf.C38184b;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: FlashConvertInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u001aH\u0082@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0082@¢\u0006\u0002\u0010\u001bJ\b\u0010 \u001a\u00020\fH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006!"}, m90084d2 = {"Lcom/kubi/spot/interceptor/FlashConvertInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "api", "Lcom/kubi/spot/business/delegation/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/spot/business/delegation/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "parseRouteParams", "", "", "route", "bundleToMap", "", "bundle", "Landroid/os/Bundle;", "calculateToByFrom", "from", "calculateCorrectParams", "Lkotlin/Pair;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMaxHoldingAsset", "getUserHoldings", "", "Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;", "isFlashConvertExpired", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlashConvertInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlashConvertInterceptor.kt\ncom/kubi/spot/interceptor/FlashConvertInterceptor\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n32#2:211\n84#2:214\n1869#3,2:212\n*S KotlinDebug\n*F\n+ 1 FlashConvertInterceptor.kt\ncom/kubi/spot/interceptor/FlashConvertInterceptor\n*L\n63#1:211\n206#1:214\n116#1:212,2\n*E\n"})
public final class FlashConvertInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f50614a = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.interceptor.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlashConvertInterceptor.m61866h();
        }
    });

    /* JADX WARN: Code duplicated, block: B:11:0x005a  */
    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) throws UnsupportedEncodingException {
        boolean z11;
        boolean zAreEqual;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Bundle bundle = chain.getPostcard().getBundle();
        String string = bundle.getString(Constants.COMPONENT);
        String string2 = bundle.getString(Constants.BIZ);
        String string3 = bundle.getString("route");
        if (Intrinsics.areEqual(string, "kucoin_convert_rn") && Intrinsics.areEqual(string2, "convert")) {
            if (string3 != null) {
                String strDecode = URLDecoder.decode(string3, "UTF-8");
                Intrinsics.checkNotNull(strDecode);
                zAreEqual = Intrinsics.areEqual(CollectionsKt.first(StringsKt.split$default((CharSequence) strDecode, new String[]{"?"}, false, 0, 6, (Object) null)), "ConvertPage");
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (!z11) {
            return chain.mo103413a(chain.getPostcard());
        }
        String strDecode2 = URLDecoder.decode(string3, "UTF-8");
        Intrinsics.checkNotNull(strDecode2);
        Map<String, String> mapM61874p = m61874p(strDecode2);
        String str = mapM61874p.get("from");
        if (str == null) {
            str = "";
        }
        String str2 = mapM61874p.get(TypedValues.TransitionType.S_TO);
        if (str2 == null) {
            str2 = "";
        }
        if (Intrinsics.areEqual(str, "null")) {
            str = "";
        }
        if (Intrinsics.areEqual(str2, "null")) {
            str2 = "";
        }
        if (str.length() == 0) {
            if (str2.length() == 0) {
                String strM102326h = C46392a.m102326h(C38519a.f86479a.m87129d(), "");
                if ((strM102326h.length() == 0) || m61873o()) {
                    MviExKt.m42518n(new FlashConvertInterceptor$intercept$1(this, bundle, null));
                    return true;
                }
                bundle.putString("route", URLEncoder.encode("ConvertPage?from=" + strM102326h + "&to=" + m61869k(strM102326h), "UTF-8"));
                return chain.mo103413a(chain.getPostcard());
            }
        }
        if (str.length() > 0) {
            if (str2.length() == 0) {
                bundle.putString("route", URLEncoder.encode("ConvertPage?from=" + str + "&to=" + m61869k(str), "UTF-8"));
                return chain.mo103413a(chain.getPostcard());
            }
        }
        return chain.mo103413a(chain.getPostcard());
    }

    /* JADX INFO: renamed from: i */
    public final Map<String, Object> m61867i(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof Bundle) {
                    linkedHashMap.put(str, m61867i((Bundle) obj));
                } else {
                    linkedHashMap.put(str, String.valueOf(obj));
                }
            }
        } catch (Exception e11) {
            C44128b.m97260d("闪兑拦截器----->Bundle转Map失败: " + e11.getMessage());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m61868j(Continuation<? super Pair<String, String>> continuation) {
        FlashConvertInterceptor$calculateCorrectParams$1 flashConvertInterceptor$calculateCorrectParams$1;
        if (continuation instanceof FlashConvertInterceptor$calculateCorrectParams$1) {
            flashConvertInterceptor$calculateCorrectParams$1 = (FlashConvertInterceptor$calculateCorrectParams$1) continuation;
            int i11 = flashConvertInterceptor$calculateCorrectParams$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flashConvertInterceptor$calculateCorrectParams$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flashConvertInterceptor$calculateCorrectParams$1 = new FlashConvertInterceptor$calculateCorrectParams$1(this, continuation);
            }
        } else {
            flashConvertInterceptor$calculateCorrectParams$1 = new FlashConvertInterceptor$calculateCorrectParams$1(this, continuation);
        }
        Object objM61871m = flashConvertInterceptor$calculateCorrectParams$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flashConvertInterceptor$calculateCorrectParams$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM61871m);
            boolean zC = IUserService.a.get().c();
            if (!zC) {
                return TuplesKt.m90091to("BTC", C38184b.f85884a.m86146a());
            }
            flashConvertInterceptor$calculateCorrectParams$1.Z$0 = zC;
            flashConvertInterceptor$calculateCorrectParams$1.label = 1;
            objM61871m = m61871m(flashConvertInterceptor$calculateCorrectParams$1);
            if (objM61871m == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM61871m);
        }
        String str = (String) objM61871m;
        C38184b c38184b = C38184b.f85884a;
        return Intrinsics.areEqual(str, c38184b.m86146a()) ? TuplesKt.m90091to("BTC", c38184b.m86146a()) : TuplesKt.m90091to(str, c38184b.m86146a());
    }

    /* JADX INFO: renamed from: k */
    public final String m61869k(String str) {
        C38184b c38184b = C38184b.f85884a;
        return Intrinsics.areEqual(str, c38184b.m86146a()) ? "BTC" : c38184b.m86146a();
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC40871a m61870l() {
        return (InterfaceC40871a) this.f50614a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m61871m(Continuation<? super String> continuation) {
        FlashConvertInterceptor$getMaxHoldingAsset$1 flashConvertInterceptor$getMaxHoldingAsset$1;
        if (continuation instanceof FlashConvertInterceptor$getMaxHoldingAsset$1) {
            flashConvertInterceptor$getMaxHoldingAsset$1 = (FlashConvertInterceptor$getMaxHoldingAsset$1) continuation;
            int i11 = flashConvertInterceptor$getMaxHoldingAsset$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flashConvertInterceptor$getMaxHoldingAsset$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flashConvertInterceptor$getMaxHoldingAsset$1 = new FlashConvertInterceptor$getMaxHoldingAsset$1(this, continuation);
            }
        } else {
            flashConvertInterceptor$getMaxHoldingAsset$1 = new FlashConvertInterceptor$getMaxHoldingAsset$1(this, continuation);
        }
        Object objM61872n = flashConvertInterceptor$getMaxHoldingAsset$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flashConvertInterceptor$getMaxHoldingAsset$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM61872n);
            flashConvertInterceptor$getMaxHoldingAsset$1.label = 1;
            objM61872n = m61872n(flashConvertInterceptor$getMaxHoldingAsset$1);
            if (objM61872n == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM61872n);
        }
        List list = (List) objM61872n;
        if (list.isEmpty()) {
            return "BTC";
        }
        AccountItemEntity accountItemEntity = (AccountItemEntity) CollectionsKt.firstOrNull(list);
        return C27041f.m66669i(accountItemEntity != null ? accountItemEntity.getCurrency() : null, "BTC");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m61872n(Continuation<? super List<AccountItemEntity>> continuation) {
        FlashConvertInterceptor$getUserHoldings$1 flashConvertInterceptor$getUserHoldings$1;
        if (continuation instanceof FlashConvertInterceptor$getUserHoldings$1) {
            flashConvertInterceptor$getUserHoldings$1 = (FlashConvertInterceptor$getUserHoldings$1) continuation;
            int i11 = flashConvertInterceptor$getUserHoldings$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flashConvertInterceptor$getUserHoldings$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flashConvertInterceptor$getUserHoldings$1 = new FlashConvertInterceptor$getUserHoldings$1(this, continuation);
            }
        } else {
            flashConvertInterceptor$getUserHoldings$1 = new FlashConvertInterceptor$getUserHoldings$1(this, continuation);
        }
        Object objM42830k = flashConvertInterceptor$getUserHoldings$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flashConvertInterceptor$getUserHoldings$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42830k);
            InterfaceC41634e<ArrayList<AccountItemEntity>> interfaceC41634eM89458d = m61870l().m89458d();
            flashConvertInterceptor$getUserHoldings$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM89458d, flashConvertInterceptor$getUserHoldings$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42830k);
        }
        ArrayList arrayList = (ArrayList) objM42830k;
        return arrayList != null ? arrayList : CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m61873o() {
        return System.currentTimeMillis() - C46392a.m102324f(C38519a.f86479a.m87130e(), 0L) >= 300000;
    }

    /* JADX INFO: renamed from: p */
    public final Map<String, String> m61874p(String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "?", false, 2, (Object) null) && (str2 = (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) str, new String[]{"?"}, false, 0, 6, (Object) null), 1)) != null) {
                Iterator it = StringsKt.split$default((CharSequence) str2, new String[]{"&"}, false, 0, 6, (Object) null).iterator();
                while (it.hasNext()) {
                    List listSplit$default = StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 0, 6, (Object) null);
                    if (listSplit$default.size() == 2) {
                        linkedHashMap.put(listSplit$default.get(0), listSplit$default.get(1));
                    }
                }
            }
        } catch (Exception e11) {
            C44128b.m97260d("闪兑拦截器----->解析路由参数失败: " + e11.getMessage());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC40871a m61866h() {
        return (InterfaceC40871a) C42597a.m93388d().create(InterfaceC40871a.class);
    }
}
