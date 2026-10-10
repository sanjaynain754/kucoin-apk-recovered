package com.kubi.assets.knb;

import com.kubi.assets.R$string;
import com.kubi.assets.entity.CryptoInfo;
import com.kubi.assets.exception.AssetsException;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.utils.ToastCompat;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import gf.C37890n;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.assets.knb.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CryptoInfoParseHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\tJ\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u00020\u0007J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\f\u0010\u000f\u001a\u00020\u0010*\u0004\u0018\u00010\u0007J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/knb/CryptoInfoParseHelper;", "", "<init>", "()V", "parseCryptoInfo", "", "input", "", "callBack", "Lkotlin/Function1;", "parseWeb3Address", "", "web3Address", "Lcom/kubi/assets/entity/CryptoInfo;", "scanCode", "isFromWeb3Wallet", "", "getQueryParam", "key", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCryptoInfoParseHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CryptoInfoParseHelper.kt\ncom/kubi/assets/knb/CryptoInfoParseHelper\n+ 2 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n44#2,2:128\n1617#3,9:130\n1869#3:139\n1870#3:141\n1626#3:142\n1#4:140\n1#4:143\n*S KotlinDebug\n*F\n+ 1 CryptoInfoParseHelper.kt\ncom/kubi/assets/knb/CryptoInfoParseHelper\n*L\n44#1:128,2\n91#1:130,9\n91#1:139\n91#1:141\n91#1:142\n91#1:140\n*E\n"})
public final class CryptoInfoParseHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CryptoInfoParseHelper f17849a = new CryptoInfoParseHelper();

    /* JADX INFO: renamed from: c */
    public final boolean m17519c(@Nullable String str) {
        return (str == null || str.length() == 0 || !StringsKt.contains$default((CharSequence) str, (CharSequence) "&platFrom=WEB3", false, 2, (Object) null)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final String m17518b(String str, String str2) {
        List<String> groupValues;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("[?&]" + str2 + "=([^&]+)"), str, 0, 2, null);
        if (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null) {
            return null;
        }
        return groupValues.get(1);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final CryptoInfo m17520d(@Nullable String str) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            CryptoInfo cryptoInfo = null;
            if (str != null && str.length() != 0) {
                MatchResult matchResultMatchEntire = new Regex("(.+?):(.+?)(?:@(.+?))?(?:\\?(.*))?").matchEntire(str);
                if (matchResultMatchEntire != null) {
                    MatchResult.Destructured destructured = matchResultMatchEntire.getDestructured();
                    String str2 = destructured.getMatch().getGroupValues().get(1);
                    String str3 = destructured.getMatch().getGroupValues().get(2);
                    destructured.getMatch().getGroupValues().get(3);
                    List listSplit$default = StringsKt.split$default((CharSequence) destructured.getMatch().getGroupValues().get(4), new String[]{"&"}, false, 0, 6, (Object) null);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        List listSplit$default2 = StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 0, 6, (Object) null);
                        Pair pairM90091to = listSplit$default2.size() == 2 ? TuplesKt.m90091to(listSplit$default2.get(0), listSplit$default2.get(1)) : null;
                        if (pairM90091to != null) {
                            arrayList.add(pairM90091to);
                        }
                    }
                    Map map = MapsKt.toMap(arrayList);
                    String str4 = (String) map.get(InterfaceC33826o0.f71244p);
                    String str5 = (String) map.get("amount");
                    if (str5 == null) {
                        str5 = (String) map.get("tx_amount");
                    }
                    cryptoInfo = new CryptoInfo(str2, str3, str4, str5, (String) map.get("memo"), (String) map.get("tag"), (String) map.get("platFrom"));
                } else {
                    cryptoInfo = new CryptoInfo(null, str, null, null, null, null, null, 125, null);
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(cryptoInfo);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Object obj = objM103844constructorimpl;
        CryptoInfo cryptoInfo2 = new CryptoInfo(null, str, null, null, null, null, null, 125, null);
        if (Result.m103850isFailureimpl(obj)) {
            obj = cryptoInfo2;
        }
        return (CryptoInfo) obj;
    }

    /* JADX INFO: renamed from: e */
    public final void m17521e(@NotNull String input, @NotNull final Function1<? super String, Unit> callBack) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        try {
            Result.Companion companion = Result.INSTANCE;
            final String strM17518b = m17518b(input, InterfaceC33826o0.f71244p);
            if (strM17518b == null || strM17518b.length() == 0) {
                callBack.invoke(input);
            } else {
                C37890n.f85269a.mo85590a(new Consumer() { // from class: com.kubi.assets.knb.b
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        CryptoInfoParseHelper.m17517f(callBack, strM17518b, (List) obj);
                    }
                });
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new AssetsException(thM103847exceptionOrNullimpl, "parseCryptoInfo", false, null, 8, null), null, 2, null);
            callBack.invoke(input);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Map<String, String> m17522g(@NotNull String web3Address) {
        Intrinsics.checkNotNullParameter(web3Address, "web3Address");
        MatchResult matchResultMatchEntire = new Regex("^(.+?):(.+?)\\?coin=(.+?)&platFrom=(.+?)$").matchEntire(web3Address);
        if (matchResultMatchEntire == null) {
            return MapsKt.emptyMap();
        }
        MatchResult.Destructured destructured = matchResultMatchEntire.getDestructured();
        return MapsKt.mapOf(TuplesKt.m90091to("chain", destructured.getMatch().getGroupValues().get(1)), TuplesKt.m90091to("address", destructured.getMatch().getGroupValues().get(2)), TuplesKt.m90091to("coin", destructured.getMatch().getGroupValues().get(3)), TuplesKt.m90091to("platform", destructured.getMatch().getGroupValues().get(4)));
    }

    /* JADX INFO: renamed from: f */
    public static final void m17517f(Function1 function1, String str, List list) {
        Object next;
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((CoinInfoEntity) next).getProperties().getContractAddress(), str));
        CoinInfoEntity coinInfoEntity = (CoinInfoEntity) next;
        if (coinInfoEntity == null) {
            ToastCompat.m66465z(R$string.asset_scan_tip2);
            function1.invoke(null);
        } else {
            function1.invoke(coinInfoEntity.getCode());
        }
    }
}
